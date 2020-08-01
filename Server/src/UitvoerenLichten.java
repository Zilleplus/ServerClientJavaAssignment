
import java.util.ArrayList;


public class UitvoerenLichten implements ExecutorAction{

    @Override
    public String run(Execute exe, SimulatiePaneel p) {
        int i = exe.getCommandValue();
        
        //controlleer op licht wel degelijk bestaat
        ArrayList<Licht> lichten =p.getLichten();
        int k = lichten.size();
        
        if(i>k-1){
        System.out.println("error lamp "+i+" bestaat niet");
        }
        else{
        p.setLicht(i,exe.getCommandValue2());
        }
        return null;  
    }


}
