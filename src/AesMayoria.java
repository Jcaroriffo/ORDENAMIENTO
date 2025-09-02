public class AesMayoria {
    public static boolean esMAyoria(int []Arr){

        int suma = 1;
        for(int i = 1; i<Arr.length;i++){
            suma++;
        }
        System.out.println("Tamaño del arreglo: " + suma);

        for(int i = 0;i<Arr.length;i++){
            Arr[i] = (int)(Math.random()*2)+1;
            System.out.print(Arr[i] + " ");
        }
        int mitad = suma/2;

        System.out.println("\nMitad: " + mitad);
        int NumerosIguales = 0;

        for(int i = 0;i<Arr.length - 1;i++){
            for(int j = i + 1;j<Arr.length;j++){
                if(Arr[i] == Arr[j]){
                    NumerosIguales++;
                }
            }
            if(NumerosIguales>mitad){
                return true;
            }else{
                NumerosIguales = 0;
            }
        }
        return false;
    }
}
