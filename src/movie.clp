(import moviemaster.*)
(deftemplate Film (declare (from-class Film)))


    (defrule R1 
    " "
    ?f <- ( Film { acteur == "a" && genre ==  "a"  && contenu == "a"  &&  producteur == "a"  &&  pays == "a"  && annee == "a"   } )
    =>  (bind ?f.nom "Nom F")
    )
