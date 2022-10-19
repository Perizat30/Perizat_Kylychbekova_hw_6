import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Boss boss1=new Boss();
        boss1.setHealth(1000);
        boss1.setDamage(50);
        boss1.setType(WeaponType.CHEMICAL_WEAPON);

        Skeleton skeleton1=new Skeleton();
        skeleton1.setHealth(500);
        skeleton1.setDamage(30);
        skeleton1.setType(WeaponType.EXPLOSIVE_WEAPON);
        skeleton1.setNumberOfArrows(2);

        Skeleton skeleton2=new Skeleton();
        skeleton2.setHealth(600);
        skeleton2.setDamage(40);
        skeleton2.setType(WeaponType.BIOLOGICAL_WEAPON);
        skeleton2.setNumberOfArrows(5);

        System.out.println("Boss's  health:"+boss1.getHealth()+"  Boss's damage:"+boss1.getDamage()+"  Boss's weapon type:"+
                boss1.getType());

        System.out.println(boss1.printInfo());
        System.out.println(skeleton1.printInfo());
        System.out.println(skeleton2.printInfo());

    }
}