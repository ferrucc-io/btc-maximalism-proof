(ns btc-maximalism-proof.css
  (:require [garden.def :refer [defstyles]]))

(defstyles screen
  [:body {:color "rgb(4, 4, 2)" :font-family "-apple-system, BlinkMacSystemFont, \"Segoe UI\", Roboto, Helvetica, Arial, sans-serif, \"Apple Color Emoji\", \"Segoe UI Emoji\",\"Segoe UI Symbol\""
          :background-color "rgb(255, 254, 252)"}]
  [:h1 {:text-align "center"}]
  [:.component-container {:margin "0 auto" 
                          :display "block"
                          :max-width "500px"
                          :float "none"
                          :width "auto"}]
  [:.principle-header-container {:display "block"
                                 :border "1px solid rgba(0,0,0,0.1)" 
                                 :border-radius "3px" 
                                 :padding "1rem"
                                 :max-width "500px"
                                 :width "auto"
                                 :margin "0.5rem auto"}]
  [:.principle {:font-size "2em"}]
  [:.label 
   {:color "#403294" 
    :background "#EAE6FF" 
    :border-radius "3px" 
    :padding-top "0.2rem" 
    :padding-bottom "0.2rem"
    :padding-right "0.5rem" 
    :padding-left "0.5rem"
    :max-width "100px"
    :text-align "center"}]
  [:.second-section {:background "rgb(247, 249, 252)" 
                     :padding "1rem 0"
                     :margin-top "2rem"}]
  [:.primitive-box {:border-radius "3px"
                    :border "1px solid rgba(0,0,0,0.1)"
                    :padding "1rem"
                    :margin-bottom "1rem"}])
