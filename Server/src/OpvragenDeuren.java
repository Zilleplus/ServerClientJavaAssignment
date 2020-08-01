
import java.util.ArrayList;

public class OpvragenDeuren implements ExecutorAction{

    @Override
    public String run(Execute exe, SimulatiePaneel p) {
        
        String answer=null;
        int i = exe.getCommandValue();
        
        //controlleer op licht wel degelijk bestaat
        ArrayList<Deur> deuren = p.getDeuren();
        int k = deuren.size();
        
        if(i>k-1){
        System.out.println("error deur "+i+" bestaat niet");
        answer="error op deur "+i;
        }
        else{    
        boolean status = p.getDeurStatus(i); 
        answer=status+"";//omzetten naar een string formaat
        //System.out.println("answer: "+answer); test routine
        
        }
        
        
        return answer;
    }


    
}
