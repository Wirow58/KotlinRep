import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.ServerSocket
import java.net.Socket

fun main(args: Array<String>){
    readFromClientAndEnd(initializeServerConnection(12129))

}
//TODO: stworz server socket ktory nasluchuje jesli o to poproszony,,,,,, funkcje ktora przyjmie dane

fun initializeServerConnection(localport: Int): Socket{
    ServerSocket(12129).use{println("Waiting for connection..."); return it.accept()}
}

fun readFromClientAndEnd(connectionSocket: Socket){
    println(BufferedReader(InputStreamReader(connectionSocket.getInputStream())).readLine())                //jak ja przekazałem te sockety? Przez wartość czy referencję?
    //connectionSocket.close()
}