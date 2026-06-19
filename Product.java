abstract class Product {

    abstract void upload();
}

class Electronics extends Product {

    void upload() {
        System.out.println("Electronics product uploaded");
    }
}

class Clothing extends Product {

    void upload() {
        System.out.println("Clothing product uploaded");
    }
}

public class Main {

    public static void main(String[] args) {

        Electronics e = new Electronics();
        Clothing c = new Clothing();

        e.upload();
        c.upload();
    }
}
