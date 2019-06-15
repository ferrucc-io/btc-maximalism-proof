(ns btc-maximalism-proof.views
  (:require
   [re-frame.core :as re-frame]
   [btc-maximalism-proof.subs :as subs]))


(defn primitive-component [primitive]
  (let [id (get primitive :id)
        title (get primitive :title)
        description (get primitive :description)
        parent-a (get primitive :parent-a)
        parent-b (get primitive :parent-b)]
    (if (= parent-a 0)
      [:div
       [:div {:class "component-container" :id (str "p" id)}
        [:div {:class "primitive-box"}
         [:h3 (str id " - " title)]
         [:div description]]]]
      [:div
       [:div {:class "component-container" :id (str "p" id)}
         [:div {:class "parent-container"}
          [:a {:href (str "#p" parent-a) :class "parent-container-link"} 
           [:div
            [:p (str "Primitive " parent-a)]]]
          [:p {:class "black"} "+"]
          [:a {:href (str "#p" parent-b) :class "parent-container-link"} 
           [:div 
            [:p (str "Primitive " parent-b)]]]]
        [:div {:class "primitive-box"}
         [:h3 (str id " - " title)]
         [:div description]]]])))



(defn principle-component [number principle id]
   [:div {:class "component-container"}
     [:p {:class "label"} (str number " Principle")]
     [:a {:href (str "#p" id)}
     [:div {:class "principle-header-container"}
     [:h4 {:class "principle"} principle]]]])


(defn home []
  (let [primitives (re-frame/subscribe [::subs/primitives])]
     [:div
      [:div
       (principle-component "1st" "Everything that is not bitcoin is a scam." "17")
       (principle-component "2nd" "Every attempt to change bitcoin is a scam." "22" )
       (principle-component "3rd" "Every attempt to push people to spend bitcoin is a scam." "26")
       (principle-component "4th" "We shouldn’t be kind with scammers" "28")]
      [:div {:on-click #(re-frame/dispatch [:change-route :about])
             :class "context-container"}
       [:p {:class "context-gif"} "🤔"]
       [:p {:class "context-please"} 
        "\"Wait WTF, I don't know what you're talking about. Context please?\" →"]]
      [:div {:class "second-section"}
       [:h1 "Why? Isn't this a bit extreme?"]
       [:div {:class "component-container"}
        [:p "Let's start with these 10 reasonable and agreeable axioms, and deductively derive the 4 principles from there."]]
       [:div (map #(primitive-component %) @primitives)]]
      [:div {:class "component-container"}
       [:h4 "Credits:"]
       [:a {:href "https://twitter.com/0xferruccio"}
        [:div {:class "credits"}
        [:img {:src "img/ferruccio.jpg" :class "credits-image"}]
        [:p {:class "credits-text"} "Ferruccio Balestreri →"]]]
       [:a {:href "https://twitter.com/giacomozucco"}
        [:div {:class "credits"}
         [:img {:src "img/giacomo.jpg" :class "credits-image"}]
         [:p {:class "credits-text"} "Giacomo Zucco →"]]]
        [:a {:href "https://github.com/ferrucc-io/btc-maximalism-proof"}
        [:div {:class "credits"}
         [:img {:src "img/gh.png" :class "credits-image"}]
         [:p {:class "credits-text"} "Source →"]]]
       ]
      [:div {:class "the-end"}]]))

(defn about-page []
  [:div {:on-click #(re-frame/dispatch [:change-route :home])}
   [:a {:class "link nav-button"} 
    "← Back to the juicy stuff"]
   [:div {:class "component-container"}
    [:h2 "So what's Bitcoin Maximalism?"]
    [:p "The term was introduced by Vitalik Buterin in 2014 in a comment on Reddit and later on in a " 
     [:a {:href "https://blog.ethereum.org/2014/11/20/bitcoin-maximalism-currency-platform-network-effects/"} "great blog post."]]
    [:p "The arguments in the blog post were so great that soon the Bitcoin community picked up and embraced the term."]
    [:p "Bitcoin Maximalism is a rational conclusion based on facts and logical connections, and this site is here to connect the dots."]
    [:p "It's a generous and altruistic position, in order to help the greater good and help society transition towards less laws and more individual responsibility."]
    [:p "This site was strongly inspired by these two talks (which were supposed to be one) by Giacomo:"]
    [:iframe
    {:allowfullscreen "allowfullscreen",
     :allow
     "accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture",
     :frameborder "0",
     :src "https://www.youtube.com/embed/D2WXxgZ8h-0?start=716",
     :height "315",
     :width "560"}]
    [:iframe
    {:allowfullscreen "allowfullscreen",
     :allow
     "accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture",
     :frameborder "0",
     :src "https://www.youtube.com/embed/NRH_HepKUZA",
     :height "315",
     :width "560"}]]])

(defmulti panels identity)
(defmethod panels :home [] [home])
(defmethod panels :about [] [about-page])

(defn main-panel []
  (let [route (re-frame/subscribe [::subs/route])]
    [:div
      [:div {:class "main-header"}
       [:h1 "Principles of Bitcoin Maximalism"]]
      (panels @route)]))
