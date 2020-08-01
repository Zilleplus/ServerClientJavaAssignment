
import java.util.HashMap;

class Execute{
    
    SimulatiePaneel p;
    private HashMap<Character,Executor> hm = new HashMap<Character,Executor>();
    int i,j;
    
    public Execute(SimulatiePaneel p){
        this.p=p;
        hm.put('#',new SysteemOpdracht());
        hm.put('@',new Opvragen());
        hm.put('&',new Uitvoeren());
        
    }

    public String command (String opdracht){

        Executor exc=hm.get(opdracht.charAt(0));
        String value = null;
        if(exc!=null)// als exc==null dan is het een ongeldig commando geen zin om verder te gaan
            value=exc.run(opdracht.substring(1, opdracht.length()),this,p);//verwijder character hebben we niet meer nodig
        System.out.println(value);
        
        return value;
        
        
        //......
        
    }//einde command
    
    public void setCommandValue(int i){
    this.i=i;
    }
    public int getCommandValue(){
    return i;
    }
    
    public void setCommandValue2(int j){
    this.j=j;
    }
    public int getCommandValue2(){
    return j;
    }
    
    
}//einde vertaalopdrachten......