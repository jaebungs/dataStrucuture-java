import java.util.Arrays;

public class MyArray {
    private int[] myArr;
    private int size;

    MyArray() {
        myArr = new int[2];
        size = 0;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 1, 4, 5 };

        MyArray myArray = new MyArray();
        myArray.push(3);
        myArray.push(1);
        myArray.push(4);
        myArray.push(5);
        System.out.println(myArray);
    }
    void push (int num) {
        if(size == myArr.length) {
            increaseSize();
        }
        myArr[size] = num;
        size++;
    }

    private void increaseSize() {
        int[] tempArr = myArr;
        myArr = new int[size * 2];
        for(int i = 0; i < size; i++) {
            myArr[i] = tempArr[i];
        }
        tempArr = null;
    }

    @Override
    public String toString() {
        String rtn = "";
        for(int i = 0; i < size; i++) {
            rtn += myArr[i];
            rtn += ", ";
        }
        return rtn;
    }
}
