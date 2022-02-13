package DIP;

/*
* 인터페이스가없고 Samsung, Kakao 클래스를 직접 PayService 클래스에 의존성 주입을 하려고하면
* 요구사항이 추가 될때마다 PayService를 추가해서 만들어야 될 것이다.
* 그렇므로 인터페이스를 사용해여 확장하기 편하게 공통부분을 묶어서 변화하지 않게 설정
* */
interface Pay{
    void payment();
}

class KakaoPay implements Pay{

    @Override
    public void payment() {
        System.out.println("kakaoPay");
    }
}

class Samsung implements Pay{

    @Override
    public void payment() {
        System.out.println("samsungPay");
    }
}

class PayService {
    private final Pay pay;

    public PayService (Pay pay){
        this.pay = pay;
    }

    public void usePay(){
        pay.payment();
    }
}
public class Main {
    public static void main(String[] args) {

        PayService person = new PayService(new Samsung());
        person.usePay();
        PayService person1 = new PayService(new KakaoPay());
        person1.usePay();
    }
}
