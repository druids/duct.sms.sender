(ns duct.sms.sender
  (:require
    [integrant.core :as ig]))


(defrecord Boundary [spec logger])

(defmethod ig/init-key :duct.sms/sender [_ conf]
  (->Boundary (dissoc conf :logger) (:logger conf)))
