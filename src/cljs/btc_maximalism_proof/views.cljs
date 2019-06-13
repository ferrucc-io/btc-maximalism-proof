(ns btc-maximalism-proof.views
  (:require
   [re-frame.core :as re-frame]
   [btc-maximalism-proof.subs :as subs]
   ))

(defn main-panel []
  (let [primitives (re-frame/subscribe [::subs/primitives])]
    [:div
     [:p (str @primitives)]
     ]))
