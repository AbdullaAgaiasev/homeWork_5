public class Hero {
    private int helth;
    private String superpower;
    private int damag;

    int Health;
    String AttackType;
    int Damage;

    public Hero(int Health, String AttackType, int Damage){
        this.Health = Health;
        this.AttackType = AttackType;
        this.Damage = Damage;
    }

    public String toString(){
        return " Hero "+
                " Helth " + Health+
                " Damag "+ Damage+
                " AttackType "+ AttackType;

    }


        public int getHelth() {
        return helth;
    }
        public void setHelth(int helth) {
        this.helth = helth;
    }

        public String getSuperpower() {
        return superpower;
    }
        public void setSuperpower(String superpower) {
        this.superpower = superpower;
    }
        public int getDamag() {
        return damag;
    }
        public void setDamag(int damag) {
        this.damag = damag;
    }
    }

