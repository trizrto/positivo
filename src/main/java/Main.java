import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
}
  Scanner sc = new Scanner(System.in);
int numero = sc.nextInt();

if (numero > 0)){
  System.out.println("É positivo.");
} else {
  if(numero < 0)){
    System.out.println("é negativo.");
  } 
  
}
sc.close();

