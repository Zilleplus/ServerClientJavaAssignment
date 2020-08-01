
import java.util.ArrayList;

public class OpvragenLichten implements ExecutorAction{

        
    @Override
    public String run(Execute exe, SimulatiePaneel p) {
        
        String answer=null;
        int i = exe.getCommandValue();
        
        //controlleer op licht wel degelijk bestaat
        ArrayList<Licht> lichten = p.getLichten();
        int k = lichten.size();
        
        if(i>k-1){
        System.out.println("error light "+i+" does not exist");
        answer="error light does not exist";
        }
        else{    
        int status = p.getLichtStatus(i); 
        answer=status+"";
        }
        
        return answer;
    }

    
}
