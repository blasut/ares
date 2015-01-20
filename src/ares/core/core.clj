(ns ares.core
  (:import (org.apache.pdfbox.pdmodel PDDocument)
           (org.apache.pdfbox.util PDFTextStripper)
           (java.net URL)))

(defn text-of-pdf
  [url]
  (with-open [pd (PDDocument/load (URL. url))]
    (let [stripper (PDFTextStripper.)]
    (.getText stripper pd))))


; TODO:
; # Get some example PDFs.
; # Save in a fitting database, think about the metadata needed.
; # Show in the browser.

;; Regurarly fetch the new PDFs based on year.
; # Fetch new PDFs since the last fetched.
; # Schedule the fetching.
; # 
