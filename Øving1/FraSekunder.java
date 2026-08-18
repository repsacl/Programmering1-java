public class FraSekunder {
    public static void main(String[] args) {
        // Code for å skirve inn sekunder selv.
        // int sekunder = Integer.parseInt(args[0]);

        int sekunder = 12345;

        float minsek = sekunder/60f;
        float timsek = sekunder/360f;

        System.out.println(sekunder + " sekunder = " + timsek + " timer og " + minsek + " minutter");
    }
}
