(ns porkostomus.fb
  (:require
   [cheshire.core :as json]))

(defn posts
  "Retrieves all posts between 2 timestamps."
  [from to]
  (filter #(< from (:timestamp %) to) (json/parse-string (slurp "resources/posts.json") true)))

(comment
  (posts 1195244348 1195605098)
  )
