(ns ldnclj-2013-aug-fwd-tron.bots
  (:require [ldnclj-2013-aug-fwd-tron.core :as tron]))

; Implement a strategy similar to Buzz!!
(defn buzz 
  "To infinity and beyond!"
  [look {[x y] :pos}]
  {:pos [(inc x) y]})

; Choose a TEAM colour
;(def red 1)

; Start the battle
;(tron/spawn-biker buzz red)

; Stop the battle
;(tron/stop!)

; Reset the arena
;(tron/blank-arena)