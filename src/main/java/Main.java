public class Main {
    public static void main(String[] args) {

        Counter.counter++;
        Counter.counter++;
        Counter.counter++;
        foo();
        System.out.println(Counter.counter);
    }
    public static void foo(){
        Counter.counter++;
    }

}
