public class BinarySearch {


   public int binarySearch(int[] array, int searchValue) {
       int low = 0;
       int high = array.length - 1;

       while (low <= high) {
           int mid = (low + high) >>> 1;

           if(array[mid] == searchValue) {
               return mid;
           } else if (array[mid] > searchValue) {
               high = mid - 1;
           } else {
               low = mid + 1;
           }
       }
       return -(low + 1);
   }
}
