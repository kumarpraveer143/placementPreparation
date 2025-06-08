class Number {
    private int a;
    private int b;

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void sum() {
        System.out.println(a + b);
    }

    public void sub() {
        System.out.println(a - b);
    }
}

class Oops {
    public static void main(String args[]) {
        Number n1=new Number();
        n1.setA(3);
        n1.setB(3);
        n1.sum();
    }
}