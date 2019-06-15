(ns btc-maximalism-proof.events
  (:require
   [re-frame.core :as re-frame]
   [btc-maximalism-proof.db :as db]
   [btc-maximalism-proof.subs :as subs]
   ))

(re-frame/reg-event-db
 ::initialize-db
 (fn [_ _]
   db/default-db))

(defn route [db r]
  (assoc db :route (last r)))

(re-frame/reg-event-db
 :change-route
  route)
