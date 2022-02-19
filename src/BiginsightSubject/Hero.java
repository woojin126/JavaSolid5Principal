package BiginsightSubject;

public class Hero extends Character {

    private int level; //레벨
    private int mp; // 마나
    private double offenseSpeed; //공격속도
    private double evasionRate; //회피율

    //영웅의 공통된 초기값 설정
    public Hero() {
        this.level = 1;
        this.mp = 100;
        this.offenseSpeed = 10;
        this.evasionRate = 5;
    }

    //영웅이 target(몬스터)를 공격할때
    @Override
    public double attack(Character target) throws InterruptedException {
        double damage = 0;
        //공격력 > 방어력일때 데미지가 들어감
        if (target.getDefense() < getOffensePower()) {
            damage = getOffensePower() - target.getDefense();
        }
        Thread.sleep((long) (this.offenseSpeed * 100)); //공격속도를 위해 추가
        target.setHp(target.getHp() - damage);
        return damage;
    }

    //영웅의 HP 상태 확인
    @Override
    public void checkHP() {
        if (this.getHp() < 1) {
            this.setAlive(false);
            this.setHp(0);
        }
    }

    //레벨은 영웅만 있음으로 히어로클래스에서 일반 메서드로 구현
    public void levelUp() {
        this.level = level + 1;
    }

    @Override
    public String toString() {
        return "Hero{" +
                ", level=" + level +
                ", mp=" + mp +
                ", offenseSpeed=" + offenseSpeed +
                ", evasionRate=" + evasionRate +
                "} " + super.toString();
    }

}
