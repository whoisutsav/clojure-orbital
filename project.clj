(defproject clojure-orbital "0.1.0-SNAPSHOT"
  :description "orbital experiment"
  :url "https://github.com/whoisutsav/clojure-orbital.git"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :main clojure-orbital.core
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :profiles {:dev {:dependencies [[speclj "3.3.2"]]}}
  :plugins [[speclj "3.3.2"]]
  :test-paths ["spec"])
