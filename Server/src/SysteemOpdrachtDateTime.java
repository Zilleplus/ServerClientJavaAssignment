
import java.util.Calendar;

public class SysteemOpdrachtDateTime implements ExecutorAction{

    @Override
    public String run(Execute exe, SimulatiePaneel p) {
        Calendar now = Calendar.getInstance();
        String DatumTijd = "" + now.get(Calendar.DAY_OF_MONTH)+" / "+now.get(Calendar.MONTH)+
                " / "+now.get(Calendar.YEAR)+" - "+now.get(Calendar.HOUR_OF_DAY)    
                +" : "+now.get(Calendar.MINUTE)+" : "+now.get(Calendar.SECOND);
        return DatumTijd;
                
        
    }
    
}
