//Main.java
//Name: Sahil Awatramani
//PRN: 23070126112
//Batch: B2

public class Main {
    public static void main(String[] args) {
        new Thread(new MyThread(1, 2, 300)).start();
        new Thread(new MyThread(100, 20, 1000)).start();
    }
}

