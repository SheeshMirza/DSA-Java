public class Sort{

    static int[] BubbleSort(int[] array){

        for(int m = array.length - 1; m > 0; m--){

            boolean sorted = true;

            for(int n = 0; n < m; n++){

                if(array[n] > array[n+1]){

                    int smaller = array[n+1];

                    array[n+1] = array[n];

                    array[n] = smaller;

                    sorted = false;

                }
            }

            if(sorted) break;

        }

        return array;
        
    }
}