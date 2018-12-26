//Создайте программу, выводящую на экран все четырёхзначные числа
//        последовательности 1000 1003 1006 1009 1012 1015 …
public class Main {

    public static void main(String[] args) {
        int p = 0;
        int j = 0;
        for (int i = 1000; i <= 9999; i++) {
            if (p <= i) {
                p = i + 3;
                System.out.print(" " + p);
            } else j++;
            if (j > 70) {
                j = 0;
                System.out.println(" ");
            }

        }
    }
}


