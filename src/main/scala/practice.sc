import org.ben.scala.{PracticeClass, Rectangle, Square}

val test = 3
val newTest: Float = test
println(test)

/* operator notation */
val someMsg = "Check it out!"
val testingMsg = someMsg indexOf '!'
println(testingMsg)

val ifWithoutElse = if (true) 2
val ifWithoutElseExpanded = if (false) 2: Int else (): Unit
val anyType: Any = 2
println(ifWithoutElse, ifWithoutElseExpanded, anyType)

def woo(): String = {
  var x = math.random()
  println(x)
  if (x > 5)
    return "number is greater than 5"
  else
    return "number is not greater than 5"
}
println(woo())

val instantiationOfClass = new PracticeClass
instantiationOfClass.x = 10
println("I changed the value here in this worksheet to be " + instantiationOfClass.x)
val secondInstantiation = new PracticeClass
println("Does the value change? I think not!")

val square = new Square(5, 5)
println(square.area)

val rectangle = new Rectangle(0, 3, 3, 2)
println(rectangle.desc)

/* A trait is similar to an abstract class: it can declare several abstract or
concrete members and can be extended. It cannot be instantiated. The
difference is that a given class can only extend one abstract class, however,
it can mixin one to many traits. Also, a trait cannot have constructor
arguments. */

/* goodnight */