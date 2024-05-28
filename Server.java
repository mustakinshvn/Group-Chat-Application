import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashSet;
import java.util.Set;

public class Server {
    private static final int PORT = 3000;
    private static Set<ClientHandler> clientHandlers = new HashSet<>();
    
    public static void main(String[] args) {
        try(ServerSocket serverSocket = new ServerSocket(PORT)){
              System.out.println("Server started on the port: "+ PORT);

              while (true) {
                Socket socket = serverSocket.accept();
                ClientHandler clientHandler= new ClientHandler();
                clientHandlers.add(clientHandler);
                
              }


        }catch(IOException e){
             e.printStackTrace();
        }
    }
}