(ns btc-maximalism-proof.subs
  (:require
   [re-frame.core :as re-frame]))

(re-frame/reg-sub
 ::primitives
 (fn [db]
   (:primitives db)))
