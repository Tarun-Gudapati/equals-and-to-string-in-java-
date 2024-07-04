class A {
    String model;
    int price;

    public String toString() {

        return model + " : " + price;
    }

    public boolean equals(A A2) {
        return this.model == A2.model && this.price == A2.price;
    }
}

public class UnderstandiObject {
    public static void main(String[] args) {
        A A1 = new A();
        A A2 = new A();
        A1.model = "lenovo ideapad";
        A1.price = 100000;
        A2.model = "lenovo ide apad";
        A2.price = 100000;
        System.out.println(A1.equals(A2));

    }

}
