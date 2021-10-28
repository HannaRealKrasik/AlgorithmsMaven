public class NumberFive {
    public int[] numberFive(int [] array){
        int max = array[0];
        int min = array[0];
        int middle = 0;

        for (int i = 0; i < array.length; i++){
            if(max<array[i]) max = array[i];
            if (min>array[i]) min = array[i];
            middle += array[i];
        }
        middle = middle/array.length;
        int [] a = {max,min,middle};
        return a;
    }
}
