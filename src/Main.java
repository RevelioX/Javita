import java.sql.SQLOutput;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.print("Hello World");
        double decimalote;
        decimalote = 3.5;
        float banana;
        banana = 3.5f;
        banana = (float)decimalote;
        String palabra = "Holaaa";
        int n = 5;
        Integer d = 5;
        if(n == d){
            System.out.println("SI");
        }
        System.out.println(banana);
        System.out.println(decimalote);
        Hilito h1 = new Hilito(1);
        var h2 = new Hilito(2);
        Thread t1 = new Thread(h1);
        Thread t2 = new Thread(h2);

        t1.start();
        t2.start();
        }

    }
 class Hilito implements Runnable{
    private final int value;
    public Hilito(int a){
        this.value = a;
    }
    public void run(){
        for(int i=0;i>=100;i++){
            System.out.println(value);
        }
    }

}