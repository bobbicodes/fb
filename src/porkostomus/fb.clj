(ns porkostomus.fb
  (:require
   [cheshire.core :as json]))

(def posts (slurp "resources/posts.json"))

(nth (reverse (json/parse-string posts true)) 3)
