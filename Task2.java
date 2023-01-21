// Вывести все простые числа от 1 до 1000

package Java_homework_1;

public class Task2 {
    public static void main(String[] args) {
        String seqSimpleNumbers = "2";
        for (int i = 3; i <= 1000; i++)
        {
            int k = 2;
            while (k < i)
            {
                if (i % k == 0)
                {
                    break;
                }
                if (k == i - 1)
                {
                    seqSimpleNumbers += " "+Integer.toString(i);
                }
                k++;
            }
        }
        System.out.println(seqSimpleNumbers);
    }
}
