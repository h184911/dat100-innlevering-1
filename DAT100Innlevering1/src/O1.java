
import java.util.Scanner;

public class O1 {
    
    public static void main(String[] args){        
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Skriv inn den første poengsummen du fikk: ");
        String poengsumStr = sc.nextLine(); int poengsum = Integer.parseInt(poengsumStr);

        int antPoengsummer = 10;
        for(int i = 0; i < 10; i++){
            
            Boolean sjekk = false;
            while(!sjekk){
                if(poengsum > 100 || poengsum < 0){
                    System.out.println("Du skrev ikke inn en gyldig poengsum, prøv igjen: ");
                    poengsumStr = sc.nextLine();poengsum = Integer.parseInt(poengsumStr);
                } else if(poengsum >= 90){
                        System.out.println("Du fikk karakteren A.");
                        sjekk = true;
                } else if(poengsum >= 80){
                        System.out.println("Du fikk karakteren B.");
                        sjekk = true;
                } else if(poengsum >= 60){
                    System.out.println("Du fikk karakteren C.");
                    sjekk = true;
                } else if(poengsum >= 50){
                    System.out.println("Du fikk karakteren D.");
                    sjekk = true;
                } else if(poengsum >= 40){
                    System.out.println("Du fikk karakteren E.");
                    sjekk = true;
                } else if(poengsum >= 0){
                    System.out.println("Du fikk karakteren F.");
                    sjekk = true;
                }
            }

            antPoengsummer--;
            if(antPoengsummer<1){
                System.out.println("Du har skrevet inn ti poengsummer.");
            }else{
                System.out.println("Skriv enda en poengsum("+antPoengsummer+" poengsummer igjen):");
                poengsumStr = sc.nextLine(); poengsum = Integer.parseInt(poengsumStr);
            }
        }
        sc.close();
    }
}    
       






