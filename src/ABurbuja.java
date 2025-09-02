public class ABurbuja {
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
}
