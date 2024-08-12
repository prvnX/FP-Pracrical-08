import scala.io.StdIn.readLine
object patternmatch{
    val ismultipleof3 = (x:Int) => x%3==0 match{
        case true => true
        case false => false
    }
    val ismultipleof5 = (x:Int) => x%5==0 match{
        case true => true
        case false => false
    }
    def main(args:Array[String]):Unit={
        val num = readLine("Enter a number: ").toInt
        num match{
            case x if ismultipleof3(x) && ismultipleof5(x) => println("Multiple of both three and five")
            case x if ismultipleof3(x) => println("Multiple of three")
            case x if ismultipleof5(x) => println("Multiple of Five")
            case _ => println("Not a multiple of three or five")
        }
        }



}