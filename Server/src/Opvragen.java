
public class Opvragen extends Executor{
     
    Opvragen(){
        super();
        hm.put(1,new OpvragenLichten()); //koppel waarde 1 aan OpvragenLichten
        hm.put(2,new OpvragenThermostaat()); //koppel waarde 2 aan OpvragenThermostaat
        hm.put(3,new OpvragenDeuren()); //koppel waarde 3 aan OpvragenDeuren
        hm.put(4,new OpvragenTemperatuur());
        hm.put(5,new OpvragenSound());
    }
    
    @Override
    public String run(String opdracht,Execute exe,SimulatiePaneel p ) {
      
       int objectnr=0;

       // hmnr bepaalt welk soort toestel wordt geselecteerd
       int hmnr = Integer.parseInt(opdracht.split(" ")[0]);
       
       if(opdracht.split(" ").length>1){
       //objectnr bepaalt welk nr van toestel wordt gelselecteerd de lengte hiervan is onbekent dit gaat van 0 tot oneindig
       objectnr = Integer.parseInt(opdracht.split(" ")[1]);
       exe.setCommandValue(objectnr); 
       }
          
    
       return hm.get(hmnr).run(exe,p);//geeft string waarde trg
       
    }
}
