class OverloadingTest{
    public static void main(String args[]){
        Math m = new Math();
    }
}

class Math{
    int add(int a, int b){
        System.out.println(a+b);
        return a+b;
    }

    double add(double a, double b){
        System.out.println(a+b);
        return a+b;
    }

    long add(long a, long b){
        System.out.println(a+b);
        return a+b;
    }
}
