(ns duct.sms.stdout
  (:require
    [integrant.core :as ig]))


(defrecord Boundary [spec logger])

(defmethod ig/init-key :duct.sms/stdout [_ conf]
  (->Boundary (dissoc conf :logger) (:logger conf)))
