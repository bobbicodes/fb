(ns porkostomus.fb
  (:require
   [cheshire.core :as json]
   [clj-time.coerce :as c]
   [clj-time.format :as f]))

(defn posts
  "Retrieves all posts between 2 timestamps."
  [from to]
  (filter #(< from (:timestamp %) to) (json/parse-string (slurp "resources/posts.json") true)))

(comment
  (f/unparse (f/formatters :rfc822)
             (c/from-epoch 1195605098))
  (posts 1195244348 1195605098)
  )
