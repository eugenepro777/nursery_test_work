package controller;

public class Counter implements AutoCloseable {

    static int counter;
    {
        counter = 0;
    }

    public void add() {
        counter++;
    }

    @Override
    public void close() {
        System.out.println("Object counter closed");
    }
}
