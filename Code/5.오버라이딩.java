class Car1{ //설게도 작성
    String name;
    int speed;
    String color;
    boolean power;

    void printName(String name){
        System.out.println("차는"+name+"이라고합니다.");
    }

    void speedUp(){
        speed++;
        System.out.println("차의 속도가 늘었습니다.");
    }
}

class Car2 extends Car1{
    void togglePower(){
        power = !power;
    }

    void speedUp(){
        speed++;
    }

    void speedDown(){
        speed--;
    }

    void printName(String name){
        System.out.println("차의 이름은"+name+"입니다.");
    }
}

public class Test {
    public static void main(String[] args){
        Car1 c1 = new Car1(); //객체 정의
        Car2 c2 = new Car2();

        c1.printName("포르쉐");
        c2.printName("벤츠");


        c2.speed = 10;
        c1.speedUp();
        c2.speedDown();
        c2.speedUp();
        System.out.println(c1.speed);
        System.out.println(c2.speed);
    }
}
