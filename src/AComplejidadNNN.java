public class AComplejidadNNN {
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
}
