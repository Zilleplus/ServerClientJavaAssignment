
class Licht{

    int status;
    int x,y;

Licht(int status,int x,int y){
    super();
    this.status=status;
    this.x=x;
    this.y=y;
}

//getters

public int getX (){
    return x;
}

public int getY (){
    return y;
}

public int getStatus (){
    return status;
}

//setters

public void setStatus(int status){

this.status=status;
    
}
}

