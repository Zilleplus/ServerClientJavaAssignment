
public class OpvragenTemperatuur implements ExecutorAction{

    @Override
    public String run(Execute exe, SimulatiePaneel p) {
        return ""+p.getTemperatuur(exe.getCommandValue());
    }
    
}
