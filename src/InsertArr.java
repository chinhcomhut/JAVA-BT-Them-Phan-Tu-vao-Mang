import java.util.Scanner;

public class InsertArr {
    public static int[] insertElement(int number, int index, int[] array) {
        int[] newArr = new int[array.length + 1];
        if(index<0|| index>array.length-1){
            System.out.println("cannot insert number into position: "+index);
            System.exit(0);
        }
        for (int i = 0; i < newArr.length; i++) {
            if (i < index) {
                newArr[i] = array[i];
            } else if (index == i) {
                newArr[index] = number;
            } else {
                newArr[i] = array[i - 1];
            }

        }
        return newArr;
    }
    public static void display(int []arr){
        for (int i = 0; i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length of array: ");
        int lengthArr = input.nextInt();
        int []Arr = new int[lengthArr];
        System.out.println("Enter every value of array: \n");
        for (int i=0;i<lengthArr;i++){
//            System.out.printf("a[%d]",i);
            Arr[i]= (int)(Math.random()*10+9);

        }
        System.out.println("Array before insert: ");
        display(Arr);
        System.out.println("Enter number: ");
        int number = input.nextInt();
        System.out.println("Enter index: ");
        int index = input.nextInt();
        int [] Arr_k = insertElement(number,index,Arr);
        System.out.println("Array after insert k");
        display(Arr_k);
    }
}
