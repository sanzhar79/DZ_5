public class Main {
    public static void main(String[] args) {
        Hero myHero = new Hero("Arthas", "HERO", "Resurrection");
        System.out.println("NAME: " + myHero.getName() + " SPECIALZATION: " + myHero.getSpecialization() + " ULTIMATE: " + myHero.getUltimate());
        System.out.println("HEALTH: " + myHero.getHealth() + " DAMAGE: " + myHero.getDamage());


        Boss myBoss = new Boss("BOSS ", "PHYSICAL RESIST", 1000, 55);
        myBoss.setDmgBoss(75);
        myBoss.setHpBoss(700);
        myBoss.setDefence("New Defence");
        System.out.println("NAME: " + myBoss.getName() + " DEFENCE: " + myBoss.getDefence() + " HEALTH: " + myBoss.getHpBoss() + " DAMAGE: " + myBoss.getDmgBoss());

    }

}