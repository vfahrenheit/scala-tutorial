/**
 * Created by Huang Weiqiang on 2014/9/29.
 */
class OOPInScala {

}

/*
class Person {
  var name : String = _
  val age = 27
  private[this] val gender = "male"
}
*/

class Person (val name : String, val age : Int = 27) {
  println("this is the primary constructor")

  var gender : String = _

  def this(name:String , age : Int, gender : String) {
    this(name, age)
    this.gender = gender
  }

  val University = "BJU"
}

class Student(name: String, age: Int, val major: String) extends Person(name, age) {
  println("this is the subclass of Person, major is " + major)

  override def toString = "Overrided toString method ......"

  override val University = "tsinghua"
}

object OOPInScala {
  def main(args: Array[String]): Unit = {
    //val p = new Person("Rocky")
    //p.name = "Rocky"
    //val p = new Person("Rocky", 20 , "male")
    //println(p.name + ":" + p.age + ":" + p.gender)
    val s = new Student("Rocky",  27, "Computer");
    //println(s.major);
    println(s.toString)
    println(s.University)
  }
}