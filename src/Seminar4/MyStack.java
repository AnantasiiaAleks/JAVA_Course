package Seminar4;

public class MyStack {
    private int[] arr = new int[10];
    private int size = 0; // количество добавленных в стек элементов
   int size() {  // количество добавленных элементов
        return size;
   }

   boolean empty() {    // true если ничего не добавлено, стек пустой
        return size == 0;
   }

   void push(int element) {    //добавление элемента в стек
       if (size >= arr.length) {
           int[] arr2 = new int[arr.length * 2];
           System.arraycopy(arr, 0, arr2, 0, arr.length);
           arr = arr2;
       }
       arr[size++] = element;
   }

   int peek() {      // показать последний элемент
       return arr[size - 1];
   }

   int pop() {
       return arr[--size];   // показать последний элемент и уменьшить индекс на один
   }
}
