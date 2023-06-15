public class Boss {
    String name;
    private String defence;
    private int hpBoss=1000;
    private int dmgBoss=55;

    public Boss(String theName, String theDefence, int theHpBoss, int theDmgBoss) {
        this.name = theName;
        this.defence = theDefence;
        this.hpBoss = theHpBoss;
        this.dmgBoss = theDmgBoss;
    }
    public String getName(){
        return name;
    }
    public String getDefence(){
        return defence;
    }
    public int getHpBoss() {
            return hpBoss;
    }
    public int getDmgBoss(){
        return dmgBoss;
    }
    public void setName(String newName){
        this.name=newName;
    }
    public void setDefence(String newDefence){
       this.defence=newDefence;
    }
    public void setHpBoss(int newHpBoss){
        this.hpBoss=newHpBoss;
    }
    public void setDmgBoss(int newDmgBoss){
        this.dmgBoss=newDmgBoss;
    }
}

