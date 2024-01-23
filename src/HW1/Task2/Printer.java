package HW1.Task2;

class Answer {
    public void printPrimeNums(){
        // Напишите свое решение ниже
        for (int i = 1; i < 1000; i++) {
            if (i == 1){
                continue;
            }
            int flag = 1;

            for (int j = 2; j <= i / 2; ++j) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1) {
                System.out.println(i);
            }
        }
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer{
    public static void main(String[] args) {

        Answer ans = new Answer();
        ans.printPrimeNums();
    }
}