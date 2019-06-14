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
         [:h5 (str id " - " title)]
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
         [:h5 (str id " - " title)]
         [:div description]]]])))



(defn principle-component [number principle]
  [:div {:class "component-container"}
       [:p {:class "label"} (str number " Principle")]
       [:div {:class "principle-header-container"}
        [:h4 {:class "principle"} principle]]])


(defn main-panel []
  (let [primitives (re-frame/subscribe [::subs/primitives])]
    [:div
     [:div {:class "main-header"}
      [:h1 "Principles"]]
     [:div
      (principle-component "1st" "Everything that is not bitcoin is a scam." )
      (principle-component "2nd" "Every attempt to change bitcoin is a scam." )
      (principle-component "3rd" "Every attempt to push people to spend bitcoin is a scam.")
      (principle-component "4th" "We shouldn’t be kind with scammers")]
     [:div {:class "second-section"}
       [:h1 "Why?"]
       [:div (map #(primitive-component %) @primitives)]]
     ]))
