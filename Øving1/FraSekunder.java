public class FraSekunder {
    public static void main(String[] args) {
        int sekunder = Integer.parseInt(args[0]);

        float minsek = sekunder/60f;
        float timsek = sekunder/360f;

        System.out.println(sekunder + " sekunder = " + timsek + " timer og " + minsek + " minutter");
    }
}
