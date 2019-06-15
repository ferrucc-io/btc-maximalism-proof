(ns btc-maximalism-proof.views
  (:require
   [re-frame.core :as re-frame]
   [btc-maximalism-proof.subs :as subs]
   [garden.core :refer [css]]
   ))


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


(defn main-panel []
  (let [primitives (re-frame/subscribe [::subs/primitives])]
    [:div
     [:div {:class "main-header"}
      [:h1 "Principles of Bitcoin Maximalism"]]
     [:div
      (principle-component "1st" "Everything that is not bitcoin is a scam." "17")
      (principle-component "2nd" "Every attempt to change bitcoin is a scam." "22" )
      (principle-component "3rd" "Every attempt to push people to spend bitcoin is a scam." "26")
      (principle-component "4th" "We shouldn’t be kind with scammers" "28")
      [:div {:class "relative"}
       [:div {:class "growth-background"}]]]
     [:div {:class "second-section"}
       [:h1 "Why? Isn't this a bit extreme?"]
       [:div {:class "component-container"}
        [:p "Let's start with these 10 reasonable and agreeable primitives, and derive the 4 principles from there."]]
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
       [:p {:class "credits-text"} "Giacomo Zucco →"]]]]]))
