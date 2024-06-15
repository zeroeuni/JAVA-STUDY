 class School{
    String name; //인스턴스 변수
    String subject; //인스턴스 변수
    static String schoolName; //클래스변수

    void printName(String name){
        System.out.println("학생의 이름은"+name+"입니다.");
    }


 }

 public class Test {
    public static void main(String[] args){
        School s1 = new School();
        School s2 = new School();

        s1.name = "김영은";
        s2.name = "김시연";

        s1.printName(s1.name);
        s2.printName(s2.name);

        s1.schoolName = "BSSM";

        System.out.println(s1.schoolName);
        System.out.println(s2.schoolName);

    }
 }
