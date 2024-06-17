class Vehicle {
    String type;

    Vehicle(String type) {
        this.type = type;
    }

    void display() {
        System.out.println("이것은 " + type + "입니다.");
    }
}

class Engine {
    void start() {
        System.out.println("엔진이 시작됩니다.");
    }
}

class Car extends Vehicle {
    Engine engine; // 포함관계

    Car() {
        super("자동차"); // super()를 사용하여 부모 클래스의 생성자 호출
        engine = new Engine(); // 포함관계
    }

    Car(String type) {
        this(); // this()를 사용하여 같은 클래스의 다른 생성자 호출
        System.out.println(type + " 생성자 호출");
    }

    @Override
    void display() {
        super.display(); // super를 사용하여 부모 클래스의 메소드 호출
        engine.start(); // 포함관계의 메소드 호출
    }
}

public class practice {
    public static void main(String[] args) {
        Car myCar = new Car("스포츠카");
        myCar.display();
    }
}
