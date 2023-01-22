package Java_homework_1;
//Задано уравнение вида x + y = z. И (x, y, z) >= 0. Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69.
//Требуется восстановить выражение до верного равенства. Предложить хотя бы одно решение или сообщить, что его нет.

public class Task4 {
    public static void main(String[] args) {
        String equation = "?9 + 1? = 85"; // ?9 + 1? = 85 // 2? + ?5 = 69 // ?8 + 4? = 81
        String [] elements = equation.split(" ");
        for (String item : elements)
        {
            System.out.println(item);
        }
        int result =
        Integer.parseInt(elements[4])-
        Integer.parseInt(elements[0].replace("?", "0"))-
        Integer.parseInt(elements[2].replace("?", "0"));

        if (result % 10 == result / 10)
            System.out.println("Решение: " + equation.replace("?", Integer.toString(result % 10)) + " (? -> "+ Integer.toString(result % 10) + ")");
        else
            System.out.println("Решения не существует!");
    }
}
