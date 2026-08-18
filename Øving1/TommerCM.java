public class TommerCM {
    public static void main(String[]args){
        // Code for å skrive in egen størrelse på TV-en
        // int TVstrl = Integer.parseInt(args[0]);

        int TVstrl = 65;
        float tommerTcm = 2.54f;

        float TVstrlCM = TVstrl * tommerTcm;

        System.out.println(TVstrl + "' tommer tv er " + TVstrlCM+"cm");
    }
}
