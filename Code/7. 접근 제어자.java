public class AccessModifiersTest {
    public static void main(String[] args) {
        Person person = new Person("John", 25, "123-45-6789");

        // public: 다른 클래스에서도 접근 가능
        System.out.println("Name: " + person.name);

        // default: 같은 패키지 내에서만 접근 가능
        System.out.println("Age: " + person.getAge());

        // protected: 같은 패키지 또는 상속받은 클래스에서 접근 가능
        System.out.println("ID: " + person.getID());

        // private: 같은 클래스 내에서만 접근 가능 (직접 접근 불가능)
        // System.out.println("SSN: " + person.ssn); // 컴파일 에러 발생
        System.out.println("SSN: " + person.getSSN()); // getter를 통해 접근 가능
    }
}

class Person {
    // public: 모든 클래스에서 접근 가능
    public String name;

    // default: 같은 패키지 내에서만 접근 가능 (명시적으로 접근제어자를 쓰지 않으면 default)
    int age;

    // protected: 같은 패키지 또는 상속받은 클래스에서 접근 가능
    protected String id;

    // private: 같은 클래스 내에서만 접근 가능
    private String ssn;

    // Constructor
    public Person(String name, int age, String ssn) {
        this.name = name;
        this.age = age;
        this.id = "ID" + age;
        this.ssn = ssn;
    }

    // public getter for age
    public int getAge() {
        return age;
    }

    // protected getter for id
    protected String getID() {
        return id;
    }

    // public getter for ssn
    public String getSSN() {
        return ssn;
    }
}
