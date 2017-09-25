(ns clj-base.core
  (:require [clojure.tools.logging :as log]))

(defn foo []
  (log/info "The application has started" "bye")
  "I don't do a whole lot."
  (log/debug "End application"))

(defn -main []
  ; If you have logging problems, uncomment for full debug
  ;(System/setProperty "log4j2.debug" "true")
  (foo))