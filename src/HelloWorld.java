import com.company.Dog;

public class HelloWorld {
    public static void main(String[] args) {

        // zmienne liczbowe
        int i;
        i = 10;
        long age = 888888888888L;
        float c = 8.9f;
        double b = 8.9;

        char a = 'a';

        boolean isJavaFun = true;

        int x,y;
        x = 54;
        y = 7;
        double z = (double)x/y;

        System.out.println("\n****Zmienne tekstowe:****");
        int d = y++;
        System.out.println(d);

        // zmienne tekstowe
        String nameStr = "Really?";

        System.out.println("\n****Zmienne tekstowe:****");
        System.out.println((nameStr));

        // tablice
        int[] firstArray = {1, 2, 3};
        double[] secondArray = new double[10];
        secondArray[0] = 8.9;

        System.out.println("\n****Tablice:****");
        System.out.println(firstArray[1]);

        Dog maksio = new Dog();
    }
}
