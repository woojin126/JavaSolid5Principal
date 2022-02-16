package BiginsightSubject;

public class Monster extends Character {

    //몬스터라는 객체를 생성할때 이름부여
    public Monster() {
        this.setTribe("monster");
    }

    @Override
    public double attack(Character character) {
        return 0;
    }

    //몬스터의 HP 상태 확인
    @Override
    public void checkHP() {
        if (this.getHp() < 1) {
            this.setAlive(false);
            this.setHp(0);
        }
    }
}
