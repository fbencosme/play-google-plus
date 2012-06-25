package models.google.plus {

  object Annotation extends Enumeration {
    type Annotation = Value
    val inline, bubble, none = Value

    def isInline(annot: Annotation) = inline.equals(annot)
  }

  object Feature extends Enumeration {
    type Feature = Value
    val icon, small = Value
  }

  object Size extends Enumeration {
    type Size = Value
    val small, medium, inline, tall, large = Value
  }

}