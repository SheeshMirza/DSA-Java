public class Search{

    static int BinarySearch(int target, int[] array){

        if(array.length == 0){

            return -1;

        }

        int s = 0;
        int e = array.length;

        while(s<e){

            int mid = (s+e) / 2;

            if(array[mid] == target){

                return mid;

            }

            if(array[mid] < target){

                s = mid;

            }else if(array[mid] > target){

                e = mid;

            }

            if(mid == (s+e) / 2){

                break;

            }
        }

        return -1;

    }
}