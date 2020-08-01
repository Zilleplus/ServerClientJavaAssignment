/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zilleplus
 */
public class UitvoerenSound implements ExecutorAction{

    @Override
    public String run(Execute exe, SimulatiePaneel p) {
        p.setSound(exe.getCommandValue(), exe.getCommandValue2());
        return null;
    }
    
}
