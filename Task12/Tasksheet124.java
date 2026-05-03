class TaskSheet124 {
    private double x;
    private double y;
   
    public TaskSheet124(double x, double y) {
        this.x = x;
        this.y = y;
    }
   
    public void print() {
        System.out.println("(" + x + "," + y + ")");
    }
   
    public void scale() {
        x /= 2;
        y /= 2;

    }
}

public class Tasksheet124 {
    public static void main(String[] args) {
        TaskSheet124 p = new TaskSheet124(32, 32);
        for (int i = 0; i < 5; i++) {
            p.scale();
            p.print();
        }
    }
}
