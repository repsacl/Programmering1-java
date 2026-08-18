import java.util.*;

public class HelloWorld {
    public static void main(String[] args){
        Scanner nameIn = new Scanner(System.in);
        System.out.println("Hei, hva heter du?: ");

        String name = nameIn.nextLine();
        // String world = "World";
        System.out.println("Hallo " + name + "!");
    }

    // public void newMain(){
    //     System.out.println("HelloWorld!");
    // }
}