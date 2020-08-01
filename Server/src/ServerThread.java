
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

class ServerThread extends Thread {

    private Socket socket = null;
    private PrintWriter out;
    private BufferedReader in;
    private boolean life;
    private Execute exe;
    

                        
    public ServerThread(Socket socket,Execute exe) { // Constructor
	  super("ServerThread");        // maak een nieuw thread-object
	  this.socket = socket;         // verbind met juiste socket 
          life=true;                    // verbinding is toegestaan
          this.exe=exe;
    }
    
    public void terminate(){
    life=false;
    }
    
    @Override
    public void run() {
        
    //System.out.println("client connected"); 
    new Logger().clientconnect();
    
    try { //maak in/out verbinding
            out = new PrintWriter(socket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        } catch (IOException ex) {
            System.out.println("error in writer/reader");}
       
    String inputLine;
    String output=null;  
    
        try {
            while (((inputLine = in.readLine()) != null && life)) {                    
                    output = exe.command(inputLine);
                    System.out.println("out: "+output);
                    out.println(output);
            }
        } catch (IOException ex) {
            System.out.println("error");
        }
        
  
}//einde run
}//einde tre