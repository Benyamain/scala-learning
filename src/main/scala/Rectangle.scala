package org.ben.scala

class Rectangle(x: Int, y: Int, val width: Int, val height: Int) extends Shape(x, y) {
  override def desc: String =  {
    super.desc + s" - Rectangle " + width + " * " + height
  }
}
