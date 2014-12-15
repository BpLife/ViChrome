(defproject vichrome "0.1.0-SNAPSHOT"
  :description "Vichrome"
  :url "http://github.com/k2nr/vichrome"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0-alpha4"]
                 [org.clojure/clojurescript "0.0-2411"]
                 [prismatic/dommy "1.0.0"]
                 [org.clojure/core.async "0.1.346.0-17112a-alpha"]]
  :plugins [[lein-cljsbuild "1.0.3"]
            [lein-resource "0.3.6"]]
  :resource {:resource-paths ["resources"],
             :target-path "target/chrome-ex-sample"}
  :cljsbuild {:builds [{:source-paths ["src/cljs"]
                        :compiler {:output-to "target/vichrome/js/main.js"
                                   :pretty-print true}}]})
