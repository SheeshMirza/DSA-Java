public class Search{
    
    static int LinearSearch(int target, int[] array){
        
        if(array.length == 0){
            
            return -1;
        
        }else{
            
            for(int index = 0; index < array.length; index++){
                
                if(array[index] == target){
                    
                    return index;
                
                }
            }
            
            return -1;
        
        }
    }
}