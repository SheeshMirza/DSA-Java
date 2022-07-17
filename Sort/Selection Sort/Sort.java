public class Sort{

    static int[] SelectionSort(int[] array){

        for(int m = 0; m < array.length - 1; m++){

            int smaller = m;

            for(int n = m + 1; n < array.length; n++){

                if(array[n] < array[smaller]){

                    smaller = n;

                }
            }

            int smallest = array[smaller];

            array[smaller] = array[m];

            array[m] = smallest;

        }

        return array;

    }
}