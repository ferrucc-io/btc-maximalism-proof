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
                                 :margin "0.5rem auto"
                                 :background "rgb(255,254,252)"}]
  [:.principle {:font-size "2em" :color "black" :text-decoration "none"}]
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
                    :background "rgb(255,254,252)"
                    :padding "1rem"
                    :margin-bottom "1rem"}]
  [:.parent-container {:color "rgb(255, 254, 252)"
                       :display "flex" 
                       :justify-content "space-evenly"
                       :align-content "stretch"
                       :align-items "center"}]
  [:.parent-container-link {:color "rgb(255, 254, 252)"
                            :background "rgb(4, 4, 2)"
                            :padding "0.5rem 1rem"
                            :margin-bottom "0.5rem"
                            :border-radius "3px"
                            :text-decoration "none"}]
  [:.black {:color "rgb(4, 4, 2)"}]
  [:.credits-text {:font-weight "600" 
                   :text-decoration "none"
                   :color "black"
                   :margin-left "0.5rem"}]
  [:.credits-image {:width "30px"
                    :height "30px"
                    :margin-left "0.1rem"
                    :border-radius "100%"}]
  [:.credits {:display "flex"
              :align-items "center"
              :padding "0.2rem"
              :border-radius "3px"}]
  [:a:link {:text-decoration "none"}]
  [:.context-container {:position "fixed"
                        :bottom "0px"
                        :right "0px"
                        :width "300px"
                        :padding "0.4rem"
                        :padding-bottom "0"
                        :border-radius "3px"
                        :border "1px solid rgba(0,0,0,0.1)"
                        :margin "0.5rem"
                        :cursor "pointer"
                        :display "flex"
                        :background "rgb(255,254,252)"
                        :align-items "center"
                        :transition "bottom 0.3s"}]
  [:.context-gif {:font-size "3em"
                  :line-height "0"
                  :margin-right "0.5rem"
                  :margin-left "0.5rem"
                  }]
  [:.context-please {:font-weight "500"
                     :padding "0.2rem"
                     :padding-top "0px"
                     :margin-top "0px"
                     :padding-bottom "0px"
                     :margin-bottom "0.1rem"}]
  [:.link {:font-weight "500"
           :cursor "pointer"}]
  [:.link:hover {:text-decoration "underline"}]
  [:.nav-button {:position "fixed"
                 :bottom "0px"
                 :left "0px"
                 :border-radius "3px"
                 :margin "1rem 0.5rem"
                 :padding "0.5rem 1rem"
                 :background "rgb(255,254,252)"
                 :border "1px solid rgba(0,0,0,0.1)"
                 :z-index "1"}]
  [:.the-end {:padding "4rem"}]
  [:.video-wrapper {:position "relative"
                    :padding-bottom "56.25%"
                    :padding-top "25px"
                    :margin-bottom "25px"
                    :height "0"}]
  [:.video-wrapper [:iframe {:position "absolute"
                             :top "0"
                             :left "0"
                             :width "100%"
                             :height "100%"}]])
