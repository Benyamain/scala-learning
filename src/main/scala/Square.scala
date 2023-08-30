package org.ben.scala

class Square(width: Int, height: Int) {
  val area: Int = width * height

  def scale(factor: Int): Square = {
    new Square(width * factor, height * factor)
  }
}