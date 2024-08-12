import scala.io.StdIn.readLine
object caesar{
    def Encrypt(text:String , shift:Int):String={
        text.map{(c:Char)=>{
            c match{
                case c if c.isUpper => ((c.toInt + shift - 65) % 26 + 65).toChar
                case c if c.isLower => ((c.toInt + shift - 97) % 26 + 97).toChar
                case _ => c
            }
        }}
    }
    def Decrypt(text:String , shift:Int):String={
        text.map{(c:Char)=>{
            c match{
                case c if c.isUpper => ((c.toInt - shift - 65 + 26) % 26 + 65).toChar
                case c if c.isLower => ((c.toInt - shift - 97 + 26) % 26 + 97).toChar
                case _ => c
            }
        }}
    }
    def Caesar(text:String , shift:Int , method:(String,Int)=>String):String={
        method(text,shift)
    }
    def main(args:Array[String]):Unit={
        val text = readLine("Enter the text to be encrypted : ")

        val shift = readLine("Enter the shift value: ").toInt

        val encrypted = Caesar(text,shift,Encrypt)
        val decrypted = Caesar(encrypted,shift,Decrypt)
        println("Original Text: "+text)
        println("Encrypted Text: "+encrypted)
        println("Decrypted Text: "+decrypted)
    }
}