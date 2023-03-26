public class InnersectionSort {
    static int[] list = {4,8,3,9,1,6,2};
         public static void insertionSort(){
             for (int i = 0; i < list.length; i++) {
                 int current = list[i];
                 int j = i-1;
                 while (j>= 0 && current<list[j]){
                     list[j+1] =list[j];
                     j--;
                 }
                 list[j+1] =current;
             }
         }

    public static void main(String[] args) {
             insertionSort();
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " , ");
        }
    }
}
