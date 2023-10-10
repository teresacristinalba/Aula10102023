import java.util.Scanner;
public class Questao5{
    public static void main(){
    Scanner scanner = new Scanner (System.in);
    int contador = 1;
    int n1;
    int soma=0;
     
    while (contador <= 10){
        System.out.println ("Informe o 1 numero:");
        n1 = scanner.nextInt();
        contador += 1;
        soma += n1;
        System.out.println("A soma dos números é:" + soma);
        
    }
    }
}
