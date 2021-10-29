public class Tasks {
    public static boolean checkNum(int a, int b){
        int sum = a + b;
        if((sum>=10) && (sum<=20)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {

        System.out.println("1) " + checkNum(3,10));

        int[] array = new int[8];
        int j = 0;
        int fill = array.length;
        System.out.print("2) ");

        for (int i = 0; i < fill; ++i, j = j + 3) {
            array[i] = j;
            System.out.print(+array[i] + " ");
            System.out.print(" ");
        }

        int[] array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int arr3 = array3.length;
        for (int i = 0; i < arr3; i++) {
            if (array3[i] < 6)
                array3[i] = array3[i] * 2;
        }
        System.out.println(" ");
        System.out.print("3) ");

        for (int i = 0; i < arr3; i++) {
            System.out.print(+array3[i] + ", ");
        }
    }
}