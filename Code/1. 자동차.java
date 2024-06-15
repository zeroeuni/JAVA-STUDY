class Car1{ //설게도 작성
    String name;
    int speed;
    String color;
    boolean power;

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
        Car1 c2 = new Car1();
        
        c1.printName("포르쉐");
        c2.printName("벤츠");

        c2.speed = 10;
        c1.speedUp();
        c2.speedDown();
        System.out.println(c1.speed);
        System.out.println(c2.speed);
    }
}

