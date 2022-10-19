public class Boss extends GameEntity{

    WeaponType type;

    public WeaponType getType() {
        return type;
    }

    public void setType(WeaponType type) {
        this.type = type;
    }

    public String printInfo(){
        return "Health: "+  this.getHealth()+"Damage: "+  this.getDamage()+ "Weapon Type: "+  this.type;
    }
}
