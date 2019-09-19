package lectures.part1basic

object ValuesVariablesTypes  extends App {

  val asInt: Int = 42;
  val asDouble: Double = 2.0
  val asFloat = 2.0f
 // Val are Immutable
  println(asFloat)

  var asString: String = " hello, scala"

  //Var are Mutable
  asString  += ", one more thing"

  println(asString)

  println("hello word" +  asString)

}
