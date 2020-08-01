
public class OpvragenThermostaat implements ExecutorAction{

    @Override
    public String run(Execute exe, SimulatiePaneel p) {
        return p.getThermostaat()+"";
    }
    
}
