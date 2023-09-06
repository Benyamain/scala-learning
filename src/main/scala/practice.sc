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

case class Person(name: String, age: Int)
val ben = new Person("Ben", 22)
val copyofBen = ben.copy(name = "Ben")

case class Country(name: String)
object Country {
  val Bangladesh = Country("Bangladesh")
  val UnitedStatesOfAmerica = Country("United States")
}

case class Person(firstName: String, lastName: String, country: Country)
object Person {
  def apply(fullName: String, country: Country): Person = {
    val splitted = fullName.split(" ")
    new Person(firstName = splitted(0), lastName = splitted(1), country = country)
  }
}

val bob = Person("Bob", "Bobbington", Country.UnitedStatesOfAmerica)
val rob = Person("Rob Robbington", Country.Bangladesh)
val job = Person.apply("Job Jobbington", Country.UnitedStatesOfAmerica)