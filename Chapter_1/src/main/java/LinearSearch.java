public class LinearSearch {

    public int linearSearch(int[] array, int searchValue) {
        for(int index = 0; index < array.length - 1; index++){
            if(array[index] == searchValue) {
                return index;
            }
        }
        return -1;
    }
}
