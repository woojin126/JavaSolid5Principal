package BiginsightSubject;

public class Main {
    void heroLevelUpCycle(Human human, Monster monster) throws Exception{
        while(monster.isAlive()) {
            human.attack(monster);
            monster.checkHP();
            if (!monster.isAlive())
                human.levelUp();

            System.out.println(human);
            System.out.println(monster);
        }
    }


    public static void main(String[] args) throws Exception {
        Main main = new Main();
        Human h = new Human();
        Monster m = new Monster();
        //main.heroLevelUpCycle(h,m);

        Character s = new Hero();
        System.out.println(s);


    }
}
