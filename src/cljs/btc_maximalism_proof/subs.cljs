(ns btc-maximalism-proof.subs
  (:require
   [re-frame.core :as re-frame]))

(re-frame/reg-sub
 ::primitives
 (fn [db]
   (:primitives db)))

(re-frame/reg-sub
 ::route
 (fn [db]
   (:route db)))
