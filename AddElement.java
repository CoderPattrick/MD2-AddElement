public class AddElement {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        array = addElement(array,1,10);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }
    public static int[] addElement(int[] arr,int index,int element){
        int[] arrTemp = new int[arr.length+1];
        for (int i = 0; i < index; i++) {
            arrTemp[i]=arr[i];
        }
        arrTemp[index]=element;
        for (int i = index; i < arr.length ; i++) {
            arrTemp[i+1]=arr[i];
        }
        return arrTemp;
    }
}
