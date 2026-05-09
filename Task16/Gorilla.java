package Task16;

interface Animal {
    boolean feed(boolean timeToEat);
    void groom();
    void pet();
}

public class Gorilla implements Animal {
    @Override
    public boolean feed(boolean timeToEat) {
        // put gorilla food into cage
        return true;
    }

    @Override
    public void groom() {
        // lather, rinse, repeat
    }

    @Override
    public void pet() {
        // lather, rinse, repeat
    }
}
