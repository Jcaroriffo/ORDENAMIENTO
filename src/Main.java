import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {

        int []Arr=new int[10];
        int opcion;

        do{
            System.out.println("MENÚ PRINCIPAL");
            System.out.println("1. Algoritmo burbuja");
            System.out.println("2. Algoritmo Binario");
            System.out.println("3. Algoritmo .......");
            System.out.println("4. Algoritmo .......");
            System.out.println("5. Algoritmo Boolean");
            System.out.println("6. Complejidad n^3");
            System.out.println("7. Salir");

            opcion = leerI();

            switch (opcion){
                case 1:
                    Burbuja(Arr);
                    System.out.println();
                    break;
                case 2:
                    if(Binario(Arr) == 0){
                        System.out.println("No se encontro el numero\n------------------");
                    }
                    break;
                case 5:
                    System.out.print("Numero a buscar: ");
                    int x = leerI();
                    if(BB(Arr,x) != true){
                        System.out.println();
                    }
                    break;
                case 6:
                    Complejidad(Arr);
                    break;
            }
        }while(opcion != 7);
    }

    public static void Sort(int[]C, int n){

        Arrays.sort(C);
        System.out.println("\nORDENADO");

        for (int i = 0;i<C.length;i++){
            System.out.print(C[i] + " ");
        }
    }

    public static boolean BB(int[]C, int x){

        for (int i = 0;i<C.length;i++){
            C[i] = (int)(Math.random()*15);
            System.out.print(C[i] + " ");
        }

        Sort(C, x);

        int izquierda = 0;
        int derecha = C.length - 1;

        while(izquierda<=derecha){
            int mitad = izquierda + (derecha - izquierda)/2;
            if(C[mitad] == x){
                System.out.println("\nNUMERO ENCONTRADO\n---------------------\n");
                return true;
            }
            else if(C[mitad]<x){
                izquierda = mitad + 1;
            }
            else{
                derecha = mitad - 1;
            }
        }
        return false;
    }

    public static void Burbuja(int[]Arr){

        System.out.println("--------------------------");
        for(int i = 0; i<Arr.length;i++){
            Arr[i] = (int)(Math.random()*20)+1;
            System.out.print(Arr[i] + " ");
        }

        for(int i = 0; i<Arr.length - 1;i++){
            for(int j = 0;j<Arr.length - 1 - i;j++){
                if(Arr[j] > Arr[j + 1]){
                    int temp = Arr[j];
                    Arr[j] = Arr[j + 1];
                    Arr[j + 1] = temp;
                }
            }
        }

        System.out.println("\n\t\tORDENANDO");

        for(int i = 0; i<Arr.length;i++){
            System.out.print(Arr[i] + " ");
        }
        System.out.println("\n--------------------------");

    }

    public static int Binario(int[]Arr){

        int izquierda = 0;
        int derecha = Arr.length - 1;

        for(int i = 0; i<Arr.length;i++){
            Arr[i] = (int)(Math.random()*20)+1;
            System.out.print(Arr[i] + " ");
        }

        Arrays.sort(Arr);
        System.out.print("\nNumero a buscar: ");
        int numero = leerI();

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

    public static void Complejidad(int[]Arr){

        int k = 15;
        for (int i = 0;i<Arr.length;i++){
            Arr[i] = (int)(Math.random()*15);
            System.out.print(Arr[i] + " ");
        }

        System.out.println();
        boolean respuesta = false;

        for(int i = 0;i<Arr.length - 2;i++){
            for(int j = i;j<Arr.length - 1;j++){
                for(int l = j + 1;l<Arr.length;l++){
                    if(Arr[i] + Arr[j] + Arr[l] == k){
                        System.out.println("Encontrado: " + Arr[i] + ", " + Arr[j] + ", " + Arr[l]);
                        respuesta = true;
                    }
                }
            }
        }

        if(respuesta != true){
            System.out.println("No se encontraron 3 numeros que sumados den " + k);
        }

    }

    public static int leerI(){
        return teclado.nextInt();
    }
}