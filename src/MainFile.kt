import java.io.*
import java.net.Socket

fun main(args: Array<String>){
    val userInput = "Jestem stringiem użytkownika!!!"
    var myConnection = InitializeConnection(12129)
    InputToWriter(myConnection, userInput)
    FileToWriter(myConnection, "File.txt")
}

fun FileToWriter (pw: PrintWriter, path: String){
    val myReader = File(path).readLines()
    for (line in myReader)
        pw.println(line)
}

fun InputToWriter (pw: PrintWriter, input: String) {
    pw.println(input)
}

fun InitializeConnection (localport: Int): PrintWriter {
        Socket("localhost", 12129).getOutputStream().use { return PrintWriter(it, true) }
        //val socket1: Socket = Socket("localhost", 12129)
        //val os: OutputStream = socket1.getOutputStream()
        //return PrintWriter(os, true)
}