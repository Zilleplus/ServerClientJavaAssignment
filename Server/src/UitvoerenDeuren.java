
import java.util.ArrayList;

public class UitvoerenDeuren implements ExecutorAction{

    @Override
    public String run(Execute exe, SimulatiePaneel p) {
        
        int i = exe.getCommandValue();
        
        //controlleer op licht wel degelijk bestaat
        ArrayList<Deur> deuren = p.getDeuren();
        int k = deuren.size();
        
        if(i>k-1){
        System.out.println("error deur "+i+" bestaat niet");
        }
        else{
        System.out.println("toggle deur "+i);
        p.toggleDeur(i);
        }
        return null;
    }
    
}
