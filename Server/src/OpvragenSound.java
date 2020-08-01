/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zilleplus
 */
public class OpvragenSound implements ExecutorAction{

    @Override
    public String run(Execute exe, SimulatiePaneel p) {
        return ""+p.getSound(exe.getCommandValue());
        
    }
    
}
