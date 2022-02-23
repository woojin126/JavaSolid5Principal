package BiginsightSubject;

//공통스킬, 궁극기를 어떻게 설계해야지?
//영웅, 몬스터를 하나의 캐릭터로 설정 (영웅 =몬스터 공통 기능을 모아둔다)
public abstract class Character {

    private String tribe; // 엘프, 휴먼, 오크, 몬스터
    private double hp; //체력
    private double offensePower; // 공격력
    private double defense; // 방어력
    private boolean isAlive; // 생존 확인

    //영웅, 몬스터의 공통된 초기값 설정
    public Character() {
        this.hp = 100;
        this.offensePower = 10;
        this.defense = 5;
        this.isAlive = true;
    }
    //영웅,몬스터 둘다 공격 기능을 가지고있기 때문에 캐릭터라는 상위 클래스에 선언
    public abstract double attack(Character target) throws InterruptedException;
    //영웅,몬스터 둘다 체력상태를 가지고있기 때문에 캐릭터라는 상위 클래스에 선언
    public abstract void checkHP();

    public String getTribe() {
        return tribe;
    }

    public void setTribe(String tribe) {
        this.tribe = tribe;
    }

    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    public double getOffensePower() {
        return offensePower;
    }

    public void setOffensePower(double offensePower) {
        this.offensePower = offensePower;
    }

    public double getDefense() {
        return defense;
    }

    public void setDefense(double defense) {
        this.defense = defense;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    @Override
    public String toString() {
        return "Character{" +
                "tribe=" + tribe +
                ", hp=" + hp +
                ", offensePower=" + offensePower +
                ", defense=" + defense +
                ", isAlive=" + isAlive +
                '}';
    }
}
