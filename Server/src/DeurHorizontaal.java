
public class DeurHorizontaal implements Deur {
        
    int x1,x2,y1,y2,x2Open,y2Open;
    boolean open;
    int openBr=40;
    
    DeurHorizontaal(int x1,int y1){
        this.x1=x1;
        this.y1=y1;
        this.x2=x1+70;
        this.y2=y1;
        
        open=false;
    }
    
    @Override
    public boolean getStatus(){
        
    return open;
    
    }
    
    @Override
    public void toggleDeur(){
    
        if(open){//als de deur open is sluit hem dan
        y2=y2-openBr;
        }
        if(!open){//als de deur gesloten is open hem dan
        y2=y2+openBr;
        }   
    this.open=!this.open;     
    }
    
    // getters en setter om te tekenen
    
    @Override
    public int getX1(){
        return x1;
    }
    @Override
    public int getY1(){
        return y1;
    }
    @Override
    public int getX2(){
        return x2;
    }
    @Override
    public int getY2(){
        return y2;
    }
    
    
}
