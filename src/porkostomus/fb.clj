(ns porkostomus.fb
  (:require
   [cheshire.core :refer [parse-string]]
   [clj-time.core :refer [date-time]]
   [clj-time.coerce :refer [to-epoch]]
   [clojure.string :as str]))

(defn posts
  "Retrieves all posts between 2 timestamps."
  [from to]
  (filter #(< from (:timestamp %) to) (parse-string (slurp "resources/posts.json") true)))

(defn search
  "Retrieves all entries containing search term s
   between start and end date."
  [s from-month from-year to-month to-year]
  (filter #(str/includes? % s)
          (remove nil? (flatten (map #(map :post %)
                                     (map :data (posts
                                                 (to-epoch (date-time from-year from-month))
                                                 (to-epoch (date-time to-year to-month)))))))))

(comment
  (posts 1195244348 1195605098)
  (search "computer" 2 2007 2 2012)

  )
