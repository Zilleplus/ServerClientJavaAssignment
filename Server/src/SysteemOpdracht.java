
class SysteemOpdracht extends Executor{
    
    SysteemOpdracht(){
        super();
        hm.put(1,new SysteemOpdrachtStatus()); //koppel waarde 1 aan SysteemOpdrachtStatus
        hm.put(2,new SysteemOpdrachtDateTime()); //koppel waarde 1 aan SysteemOpdrachtDateTime
    }
    
    
    
    
}
