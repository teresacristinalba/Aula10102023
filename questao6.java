import java.util.Scanner;
public class Questao6{
    public static void main(){
        Scanner scanner =  new Scanner (System.in);
        int n1;
        int soma=0;
        
        for (int i = 1; i <= 10; i++){
            System.out.println("informe o 1 numero:");
            n1 = scanner.nextInt();
            
            soma += n1;
            System.out.println("A soma dos números é:" + soma);
        }
    }
}
