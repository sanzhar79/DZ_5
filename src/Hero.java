public class Hero {
    //атрибуты
    String name;
    String specialization;
    String ultimate;
    public int health=750;
    public int damage=40;

    //контсруктор
    public Hero(String theName, String theSpecialization, String theUltimate) {
        name = theName;
        specialization = theSpecialization;
        ultimate = theUltimate;
    }
    public Hero(int theHealth, int theDamage){
        health=theHealth;
        damage=theDamage;
    }
    public String getName(){
        return name;
    }
    public String getSpecialization(){
        return specialization;
    }
    public String getUltimate(){
        return ultimate;
    }
    public int getHealth(){
        return health;
    }
    public int getDamage(){
        return damage;
    }
}


