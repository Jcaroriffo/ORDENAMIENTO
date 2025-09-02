import java.util.Arrays;
import java.util.Scanner;

public class ABinario {
    static Scanner teclado = new Scanner (System.in);
    public static int Binario(int[]Arr){

        int izquierda = 0;
        int derecha = Arr.length - 1;

        for(int i = 0; i<Arr.length;i++){
            Arr[i] = (int)(Math.random()*20)+1;
            System.out.print(Arr[i] + " ");
        }

        Arrays.sort(Arr);
        System.out.print("\nNumero a buscar: ");
        int numero = teclado.nextInt();

        while(izquierda<=derecha){
            int mitad = izquierda + (derecha - izquierda)/2;
            if(Arr[mitad] == numero){
                System.out.println("Numero encontrado\n---------------------");
                return mitad;
            }
            else if(Arr[mitad]<numero){
                izquierda = mitad + 1;
            }
            else{
                derecha = mitad - 1;
            }
        }
        return 0;
    }

}
