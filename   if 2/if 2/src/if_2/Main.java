
  package if_2;

        import java.util.Scanner;

       public class Main {

           public static void main(String[] args) {
               int numero = 0;
               Scanner lectura = new Scanner(System.in);
               System.out.println("introduce un numero");
               numero = lectura.nextInt();

               if (numero> 0) {
                   System.out.println("Es positivo");
               } else if (numero< 0) {
                   System.out.println("Es negativo");
               } else if (numero == 0)
                   System.out.println("Es neutro");
           }

       }


