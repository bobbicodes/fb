(ns porkostomus.fb
  (:require
   [cheshire.core :refer [parse-string]]
   [clj-time.core :refer [date-time]]
   [clj-time.coerce :refer [to-epoch]]))

(defn posts
  "Retrieves all posts between 2 timestamps."
  [from to]
  (filter #(< from (:timestamp %) to) (parse-string (slurp "resources/posts.json") true)))

(comment
  (posts 1195244348 1195605098)
  (posts (to-epoch (date-time 2012 10))
         (to-epoch (date-time 2012 11)))
  )
