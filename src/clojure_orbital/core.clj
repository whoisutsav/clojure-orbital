(ns clojure-orbital.core)

(def speed 1)
(def radius 5)

(defn position [degrees]
  [(* radius (Math/sin (Math/toRadians degrees))) 
    (* radius (Math/cos (Math/toRadians degrees)))])

(defn orbit [degrees] 
  (let [coords (position degrees)]
    (println (first coords))
    (println (second coords))
    (println "-------------")
    (Thread/sleep 100)
    (recur (+ speed degrees))))


(defn -main
  [& args]
  (orbit 0))
