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
    [:div 
     [:div {:class "" :id (str "p" id)}
      [:h5 (str id " - " title)]
      [:p description]]]))


(defn principle-component [number principle]
  [:div {:class "principle-header-container"}
       [:div
        [:p {:class "principle-number"} (str number " Principle")]]
        [:h4 principle]])


(defn main-panel []
  (let [primitives (re-frame/subscribe [::subs/primitives])]
    [:div
     [:div {:class "main-header"}
      [:h1 "There are 4 principles"]]
     [:div
      (principle-component "1st" "Everything that is not bitcoin is a scam." )
      (principle-component "2nd" "Every attempt to change bitcoin is a scam." )
      (principle-component "3rd" "Every attempt to push people to spend bitcoin is a scam.")
      (principle-component "4th" "We shouldn’t be kind with scammers")]
     [:div
       [:div (map #(primitive-component %) @primitives)]]
     ]))
