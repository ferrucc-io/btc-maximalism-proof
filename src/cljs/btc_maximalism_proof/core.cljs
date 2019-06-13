(ns btc-maximalism-proof.core
  (:require
   [reagent.core :as reagent]
   [re-frame.core :as re-frame]
   [btc-maximalism-proof.events :as events]
   [btc-maximalism-proof.views :as views]
   [btc-maximalism-proof.config :as config]
   ))


(defn dev-setup []
  (when config/debug?
    (enable-console-print!)
    (println "dev mode")))

(defn mount-root []
  (re-frame/clear-subscription-cache!)
  (reagent/render [views/main-panel]
                  (.getElementById js/document "app")))

(defn ^:export init []
  (re-frame/dispatch-sync [::events/initialize-db])
  (dev-setup)
  (mount-root))
