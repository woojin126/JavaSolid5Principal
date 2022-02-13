package LSP;

//직사각형
class Rectangle {
    protected double width;
    protected double height;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea(){
        return this.getWidth() * this.getHeight();
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }


}

//정사각형 (직사각형 클래스를 상속하여 재정의)
class Square extends Rectangle {

    // 정사각형은 가로 세로 길이가 같아야하니 재정의
    @Override
    public void setWidth(double width) {
        this.width = width;
        this.height = width;
    }

    // 정사각형은 가로 세로 길이가 같아야하니 재정의
    @Override
    public void setHeight(double height) {
        this.width = height;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Square{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}

/*
DoWork는 부모 타입(Rectangle)을 사용하는 객체
리스코브 치환원칙을 성립하기 위해서는 부모 클래스에서 사용하는 메서드가
자식타입에서도 성립이 되어야하지만 Square 클래스가 Dowork 메서드를 수행하게되면 false 반환
== LSP 위반
*/
class DoWork{
    public boolean work(Rectangle rectangle) {
        rectangle.setHeight(5);
        rectangle.setWidth(4);

        return rectangle.getArea() == 20;
    }
}
public class Main {
    public static void main(String[] args) {
        DoWork work = new DoWork();
        //부모인 Rectangle()과 자식인 Square이 둘다 True가 되어야 LSP 성립하지만
        //Square(자식)이 부모의 DoWork()의 메서드조건에 성립하지 않으니 위반.
        System.out.println(work.work(new Rectangle())); // true;
        System.out.println(work.work(new Square())); // false
    }
}
