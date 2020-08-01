
public class Uitvoeren extends Executor{

    Uitvoeren(){
        super();
        hm.put(1,new UitvoerenLichten()); //koppel waarde 1 aan UitvoerenLichten
        hm.put(2,new UitvoerenThermostaat()); //koppel waarde 2 aan UitvoerenThermostaat
        hm.put(3,new UitvoerenDeuren());
        hm.put(5,new UitvoerenSound());
    }
    
    @Override
    public String run(String opdracht,Execute exe,SimulatiePaneel p ) {
       int extraValue;
       // hmnr bepaalt welk soort toestel wordt geselecteerd
       int hmnr = Integer.parseInt(opdracht.split(" ")[0]);

       //objectnr bepaalt welk nr van toestel wordt gelselecteerd de lengte hiervan is onbekent dit gaat van 0 tot oneindig
       int objectnr = Integer.parseInt(opdracht.split(" ")[1]);
       
       //zal niet altijd meegegeven zijn dus we moeten vermijden dit te doen als hij niet aanwezig is
       if(opdracht.split(" ").length>2){
       exe.setCommandValue2(Integer.parseInt(opdracht.split(" ")[2]));//neem 3de string en maak er een int van
       }
       
       exe.setCommandValue(objectnr);
       
    
    return hm.get(hmnr).run(exe,p);//geeft string waarde trg
       
    }
    
}
