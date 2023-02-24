(ns app.core
  (:require [helix.core :refer [defnc $]]
            [helix.dom :as d]
            ["react-dom/client" :as rdom]))

(defnc app []
  (d/div
   (d/h1 "Hello World")))

(defn render []
  (.render (rdom/createRoot (js/document.getElementById "app")) ($ app)))

(defn ^:export init []
  (js/console.log {:name "shadow-cljs"
                   :is-map? true})
  (render))

(defn ^:dev/before-load stop []
  (js/console.log "stop"))

(defn ^:dev/after-load start []
  (js/console.log "start"))