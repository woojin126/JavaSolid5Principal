package OCP;

//확장자 인터페이스, OCP (개방 폐쇄의 원칙)
//기존 코드를 유지한채(Closed) 기능을 수정하거나 추가할 수 있도록 (Open) 설계해야한다.
interface Extension{
    public void play();
}

class Mp3 implements Extension{

    @Override
    public void play() {
        System.out.println("Mp3 확장자 음원");
    }
}

class Wav implements Extension{

    @Override
    public void play() {
        System.out.println("Wav 확장자 음원");
    }
}

class SoundPlay{

    private final Extension file;

    public SoundPlay(Extension file) {
        this.file = file;
    }

    public void play(){
        file.play();
    }
}


public class Client {
    public static void main(String[] args) {
        SoundPlay soundPlay = new SoundPlay(new Mp3());
        SoundPlay soundPlay1 = new SoundPlay(new Wav());

        soundPlay.play();
        soundPlay1.play();


    }
}
