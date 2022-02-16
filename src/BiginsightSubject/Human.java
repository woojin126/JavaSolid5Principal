package BiginsightSubject;

public class Human extends Hero implements JobSkill {

    //영웅중 하나인 휴먼객체를 생성할때 이름 부여
    public Human() {
        this.setTribe("human");
    }

    @Override
    public double attack(Character target) throws InterruptedException {
        return super.attack(target);
    }

    @Override
    public void checkHP() {
        super.checkHP();
    }

    @Override
    public void levelUp() {
        super.levelUp();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void skill() {
        setDefense(this.getDefense() + this.getDefense() * 0.3);
    }

}
