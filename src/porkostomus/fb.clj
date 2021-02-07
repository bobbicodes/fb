(ns porkostomus.fb
  (:require
   [cheshire.core :as json]
   [clj-time.core :as t]
   [clj-time.coerce :as c]
   [clj-time.format :as f]))

(defn posts
  "Retrieves all posts between 2 timestamps."
  [from to]
  (filter #(< from (:timestamp %) to) (json/parse-string (slurp "resources/posts.json") true)))

(comment
  (f/show-formatters)
  (c/to-epoch (t/date-time 1986 10 14))
  (f/unparse (f/formatters :year-month-day)
             (c/from-epoch 1195605098))
  (posts 1195244348 1195605098)
  (posts (c/to-epoch (t/date-time 2010 10))
         (c/to-epoch (t/date-time 2010 11)))
  )
