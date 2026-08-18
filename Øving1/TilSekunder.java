public class TilSekunder {
    public static void main(String[] args){
        // int timer = Integer.parseInt(args[0]);
        // int minutter = Integer.parseInt(args[1]);
        // int sekunder = Integer.parseInt(args[2]);

        int timer = 3;
        int minutter = 200;
        int sekunder = 123;

        int timesek = timer * 3600;
        int minsek = minutter * 60;

        int tot = timesek + minsek + sekunder;

        System.out.println(timer + " timer = " + timesek + "s");
        System.out.println(minutter + " minutter = " + minsek + "s");
        System.out.println(sekunder + " sekunder = " + sekunder + "s");

        System.out.println("Totalt: " + tot + "s");

    }
}