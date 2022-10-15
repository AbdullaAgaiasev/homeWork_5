public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHelth(1000);
        boss.setDamag(70);
        boss.setDefence(" Defence magic ");
        System.out.println(" Boss Helth: " + boss.getHelth() + " Boss Damage: " + boss.getDamag() +
                " Boss Defence: " + boss.getDefence());

        for (int i = 0; i < createHeroes().length; i++) {
            System.out.println( " Герой № " + (i + 1)+ createHeroes()[i]);

        }
    }
    public static Hero[] createHeroes() {
        Hero hero = new Hero(300, " Огненный шар ", 48);
        Hero hero1 = new Hero(330, " Земляные оковы ", 40);
        Hero hero2 = new Hero(285, " Водяной купол ", 60);
        Hero[] allHeroes = {hero,hero1,hero2};
        return allHeroes;
    }
}






