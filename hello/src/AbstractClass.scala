/**
 * Created by Huang Weiqiang on 2014/9/29.
 */
class AbstractClass {

}

abstract class People {
  def speak
}

class Worker extends People {
  def speak {
    println("Hello, Everyone!")
  }
}

object AbstractClass extends  App {
  val worker = new Worker
  worker.speak
}