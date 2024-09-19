import java.util.Scanner;
public class O3 {

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Skriv et heltall større enn 0: ");
        String nStr = sc.nextLine(); int n = Integer.parseInt(nStr);
        
        int sum = 1;
        int i = 0;
        while(i<n){
            sum += i*sum; 
            i++;
        }
        System.out.println(sum);
        sc.close();
    }
}
