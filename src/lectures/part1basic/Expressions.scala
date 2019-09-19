package lectures.part1basic

object Expressions  extends App {

  val x  = 1+2 //Expression

  println(x)

  println(2+3*4)

  println(1 ==4 )

  var aVariable = 2

  aVariable +=3

  println(aVariable)

  val aCondition = true

  val aConditionedValue = if (aCondition) 8 else 3

  println(aConditionedValue)

  var i = 0

  while (i < 10) {
      println(i)
     i +=1
  }

  val aWeirdValue: Unit = (aVariable =3)

  println(aWeirdValue)

  val  aCodeBlock = {
     val y = 2
    val z = y +1
    if( z >2 ) "hello " else "goodbye"
  }

  println(aCodeBlock)

}
