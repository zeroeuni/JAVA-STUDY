public class Rectangle {
    private int width;
    private int height;

    // 기본 생성자
    public Rectangle() {
        // 기본 값으로 초기화하는 생성자를 호출
        this(1, 1);
    }

    // 너비만 받는 생성자
    public Rectangle(int width) {
        // 너비와 기본 높이로 초기화하는 생성자를 호출
        this(width, 1);
    }

    // 너비와 높이를 받는 생성자
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    // 사각형의 면적을 출력하는 메소드
    public void printArea() {
        System.out.println("Area: " + (this.width * this.height));
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        rect1.printArea();
        
        Rectangle r2 = new Rectangle(5);
        rect2.printArea();
        
        Rectangle r3 = new Rectangle(4, 7);
        rect3.printArea();
    }
}
