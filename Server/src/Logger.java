
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Calendar;

public class Logger {
    Logger(){
    }
    
    public void clientconnect(){
    String log="";
       
       try{     
       BufferedReader inLog = new BufferedReader(new FileReader("logs.txt"));   
       String regel = inLog.readLine(); 
       System.out.println("reader on");
           //System.out.println(regel);
       while(regel != null){
           log=log+regel;

           regel =inLog.readLine();
           
       }
       inLog.close(); 
       
       }catch(Exception e){
           System.out.println("error reader");
       }
        //System.out.println(log);
        
        
       Calendar now = Calendar.getInstance();
       String datumTijd = "" + now.get(Calendar.DAY_OF_MONTH)+"/"+now.get(Calendar.MONTH)+
                "/"+now.get(Calendar.YEAR)+"-"+now.get(Calendar.HOUR_OF_DAY)    
                +":"+now.get(Calendar.MINUTE)+":"+now.get(Calendar.SECOND);
        
       try{
           
       BufferedWriter uitLog = new BufferedWriter(new FileWriter("logs.txt"));
       System.out.println("writer on"); 
       uitLog.write(log+"\n"+"client connected: "+datumTijd); 
         
       
       uitLog.close();
       
       }
       catch(Exception e){
           System.out.println("error writer");
       }
       
    }
    
}
