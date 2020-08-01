
public class UitvoerenThermostaat implements ExecutorAction{

    @Override
    public String run(Execute exe, SimulatiePaneel p) {
        p.setThermostaat(exe.getCommandValue());
        return null;
    }
    
}
