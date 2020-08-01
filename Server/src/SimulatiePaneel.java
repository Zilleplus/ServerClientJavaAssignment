
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JDialog;

class SimulatiePaneel extends JDialog{
    boolean licht1=false;
    ArrayList<Licht> lichten;
    int thermostaat;
    ArrayList<Deur> deuren;
    int[] thermometer ,sound;

SimulatiePaneel(){
    super();
    thermostaat=20;
    thermometer = new int[4];
    sound = new int[4];
    
    for(int i = 0;i<4;i++){
    
    thermometer[i]= (int) (15 + 10*Math.random());
    sound[i]=0;
    
    }
    
    lichten = new ArrayList<Licht>();
    
    //lichten
    //links boven
    lichten.add(new Licht(0,50,50));
    lichten.add(new Licht(0,50,300));
    lichten.add(new Licht(0,300,50));
    lichten.add(new Licht(0,300,300));
    
    //links onder
    lichten.add(new Licht(0,50,450));
    lichten.add(new Licht(0,50,700));
    lichten.add(new Licht(0,300,450));
    lichten.add(new Licht(0,300,700));
    
    //rechts boven   
    lichten.add(new Licht(0,450,50));
    lichten.add(new Licht(0,450,300));
    lichten.add(new Licht(0,700,50));
    lichten.add(new Licht(0,700,300));
    
    //rechts onder 
    lichten.add(new Licht(0,450,450));
    lichten.add(new Licht(0,450,700));
    lichten.add(new Licht(0,700,450));
    lichten.add(new Licht(0,700,700));
    
    //einde lichten-------
    
    deuren = new ArrayList<Deur>();
    
    deuren.add(new DeurVerticaal(1,100));
    deuren.add(new DeurVerticaal(400,200));
    deuren.add(new DeurVerticaal(400,600));
    
    deuren.add(new DeurHorizontaal(200,400));
    deuren.add(new DeurHorizontaal(600,400));
    
} //constructor

    @Override
    public void paint (Graphics g){
    super.paint(g);
    
    //thermostaat
    g.drawString("Thermostaat:"+thermostaat+"°C",260,425);
    
    //themperatuur
    
    g.drawString(thermometer[0]+"°C", 200, 200);
    g.drawString(thermometer[1]+"°C", 200, 600);
    g.drawString(thermometer[2]+"°C", 600, 200);
    g.drawString(thermometer[3]+"°C", 600, 600);
    
    //sound
    
    g.drawString("sound: "+sound[0]+"%", 200, 215);
    g.drawString("sound: "+sound[1]+"%", 200, 615);
    g.drawString("sound: "+sound[2]+"%", 600, 215);
    g.drawString("sound: "+sound[3]+"%", 600, 615);
    
    //randen
    g.drawLine(1,1,1,100);
    g.drawLine(1,170,1,800);
    
    
    g.drawLine(799,799,1,799);
    g.drawLine(799,799,799,1);
    g.drawLine(1, 1, 799, 1);
    
    //horizontale middenlijn
    g.drawLine(0, 400, 200, 400);
    g.drawLine(270, 400, 600, 400);
    g.drawLine(670, 400, 800, 400);
    
    //verticale middenlijn
    g.drawLine(400, 0, 400, 200);
    g.drawLine(400, 270, 400, 600);
    g.drawLine(400, 670, 400, 800);
    
    
    //lichten
    
    for(int j =0;j<lichten.size();j++){ 
        
        Licht licht = lichten.get(j);
        
        int x = licht.getX();
        int y = licht.getY();
        
        g.drawString(j+": "+licht.getStatus()+" %", x+5, y+33);
    
        g.drawOval(x,y,20,20);
    
        if (licht.getStatus()>0) g.fillOval(x, y, 20, 20);//vullen als het licht aan staat

    }
    
    //deuren
    for(int j =0;j<deuren.size();j++){
    
        Deur deur = deuren.get(j);
        g.drawLine(deur.getX1(), deur.getY1(), deur.getX2(), deur.getY2());
    
    }
    
}
    //setterlichten
    public void setLichten(ArrayList<Licht> lichten){
        this.lichten=lichten;
        this.repaint();
    }
    
    public void setLicht(int nr,int status){
        lichten.get(nr).status = status;
        this.repaint();

    }
    
    //settersDeuren
     public void setDeuren(ArrayList<Deur> deuren){
        this.deuren=deuren;
        this.repaint();
    }
    
    public void toggleDeur(int nr){
        deuren.get(nr).toggleDeur();
        this.repaint();

    }
    
    //setter thermostaat
    public void setThermostaat(int thermostaat){
        this.thermostaat=thermostaat;
        this.repaint();
    }
    
    public void setSound(int i,int niveau){
        sound[i]=niveau;
        this.repaint();
    
    }
    
    //getters lichten
    
    public ArrayList<Licht> getLichten(){
        return lichten;
    }
    
    public int getLichtStatus(int i){
    return lichten.get(i).status;
    }
    
    
    //getters thermostaat
            
    public int getThermostaat(){
    return thermostaat;
    }
    
    //gettersDeuren
    
    public ArrayList<Deur> getDeuren(){
        return deuren;
    }
    
    public boolean getDeurStatus(int i){
    return deuren.get(i).getStatus();
    }
    
    public int getTemperatuur(int i){
    return thermometer[i];
    }
    
    public int getSound(int i){
    return sound[i];
    }

}