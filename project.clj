(defproject clj-base "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/tools.logging "0.4.0"]
                 [org.apache.logging.log4j/log4j-core "2.9.1"]
                 [org.apache.logging.log4j/log4j-api "2.9.1"]
                 [com.fasterxml.jackson.dataformat/jackson-dataformat-yaml "2.7.3"]
                 [com.fasterxml.jackson.core/jackson-databind "2.5.4"]]
  :main clj-base.core
  :resource-paths ["resources"])