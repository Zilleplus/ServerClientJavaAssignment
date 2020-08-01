
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

class VerdeelServer extends Thread{
        private Execute exe;
        private int poort;
    
        public VerdeelServer(int poort,Execute exe){
        super();
        this.poort = poort;
        this.exe=exe;
        
        }

public void run(){
         

        ServerSocket serverSocket = null;
        ServerThread[] ST = new ServerThread[100];
        
        //conecteer op poort 4444
        try { 
            serverSocket = new ServerSocket(poort);
        } catch (IOException e) {
            System.out.println("poort: "+poort+" allrdy in use");
            
        }
        
        //accept client
        
        int aantal =0;
        Boolean listening = true;
        Socket clientSocket = null;
        
        while (listening){
            try {
                clientSocket = serverSocket.accept(); // wacht op client
                
                
            } catch (IOException ex) {
                System.out.println("error in accept");}
            
        	  // maak nieuwe thread
            ST[aantal] = new ServerThread(clientSocket,exe);
            ST[aantal].start(); // start() roept de run() op van de thread 
	    aantal++;
	    System.out.println("Client nr " + aantal + " heeft zich aangemeld op poort "+poort ) ;        
        }
        
}

}
