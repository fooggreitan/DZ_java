// *+Задано уравнение вида q + w = e, q, w, e >= 0. 
// Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69. 
// Требуется восстановить выражение до верного равенства. 
// Предложить хотя бы одно решение или сообщить, что его нет.

public class Task4 {
    public static void main(String[] args) {
        String[] chislo = new String[]{"2","?","+","?","5","=","6", "9"};

        for (int i= 0; i <= chislo.length; i++) {
            chislo[1] = "4";
            chislo[3] ="4";
        }
        System.out.println(String.join("", chislo));
    }
}
