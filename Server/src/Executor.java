
import java.util.HashMap;


//hash maps
   
abstract class Executor{
 
 
 protected HashMap<Integer,ExecutorAction> hm = new HashMap<Integer,ExecutorAction>();
    
    
 public Executor(){  
 }

 public String run(String opdracht,Execute exe,SimulatiePaneel p ) {
    int opdr = Integer.parseInt(opdracht);
    return hm.get(opdr).run(exe,p);//geeft string waaarde trg
       
 }

}

