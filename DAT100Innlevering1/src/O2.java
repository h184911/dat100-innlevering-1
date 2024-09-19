import java.util.Scanner;

public class O2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Skriv din bruttolønn: ");
        String bruttolonnStr = sc.nextLine(); int bruttolonn =  Integer.parseInt(bruttolonnStr);

        double trinn1 = 0.017; double trinn2 = 0.04; double trinn3 = 0.136;
        double trinn4 = 0.166; double trinn5 = 0.176;

        double betaleISkatt = 0.0;
        if(bruttolonn >= 0 && bruttolonn <= 208050){
            System.out.println("Du betaler ingenting i trinnskatt.");
        } else if(bruttolonn <= 292850){
            betaleISkatt = trinn1*bruttolonn;
            System.out.println("Du betaler " +Math.round(betaleISkatt)+ " kr i trinnskatt.n2di");
        } else if(bruttolonn <= 670000){
            betaleISkatt = trinn2*bruttolonn;
            System.out.println("Du betaler " +Math.round(betaleISkatt)+ " kr i trinnskatt.");
        } else if(bruttolonn <= 937900){
            betaleISkatt = trinn3*bruttolonn;
            System.out.println("Du betaler " +Math.round(betaleISkatt)+ " kr i trinnskatt.");
        } else if(bruttolonn <= 1350000){
            betaleISkatt = trinn4*bruttolonn;
            System.out.println("Du betaler " +Math.round(betaleISkatt)+ " kr i trinnskatt.");
        } else if(bruttolonn >= 1350001){
            betaleISkatt = trinn5*bruttolonn;
            System.out.println("Du betaler " +Math.round(betaleISkatt)+ " kr i trinnskatt.");
        }

        sc.close();
    }
}
