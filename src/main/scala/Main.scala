import scala.io.StdIn.readLine

object Calculator {
  def main(args: Array[String]): Unit = {
    var yn: String = ""

    do {
      println("Enter First No. ")
      val no1 = readLine().toInt

      println("Enter the Second No. ")
      val no2 = readLine().toInt

      println("Select Symbol (+, -, *, /)")
      val sym = readLine()

      val res = sym match {
        case "+" => no1 + no2
        case "-" => no1 - no2
        case "*" => no1 * no2
        case "/" => if (no2 != 0) no1 / no2 else {
          println("Cannot divide by zero.")
          0 // or any other value you want to assign in case of division by zero
        }
        case _ => {
          println("Invalid symbol")
          0 // or any other value you want to assign in case of an invalid symbol
        }
      }

      println(s"Result: $res")

      println("Do you want to continue? (Press 'y' for yes and 'n' for No)")
      yn = readLine().toLowerCase

    } while (yn == "y")
  }
}
