import java.util.Scanner;

public class TestingSystem {
    public static void main(String[] args) {
        String[] questions = {"В каком году началась Русско-Японская Война?", "В какой стране находится древний город Мачу-Пикчу?","Что не нужно было использовать в этом задании?"};
        String[][] variants = {{"1905","1904","1908","1915"},{"Перу","Бразилия","Мексика", "Аргентина"}, {"Циклы","Массивы","ООП"}};
        int[] rightAnswers = {2,1,3};
        System.out.println("Здравствйте! Давайте продем небольшой тест");
        String[] answers = new String[questions.length];
        for (int i = 0; i < questions.length; i++) {
            String[] variantsToThatQuestion = new String[variants[i].length];
            System.arraycopy(variants[i], 0, variantsToThatQuestion, 0, variants[i].length);
            System.out.println("Вопрос" + " " + "№" + (i+1));
            String answer = askAQuestion(questions[i], variantsToThatQuestion, rightAnswers[i]);
            answers[i] = answer;
        }
        System.out.println("Ваш результат:");
        for (int i = 0; i < questions.length; i++) {
            System.out.println("Вопрос №"+(i+1) +")"+" "+answers[i]+" ");
        }
    }
    private static String askAQuestion (String question, String[] solutions, int rightAnswer) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(question);
        System.out.println("Варианты ответа:");
        for (int i = 0; i < solutions.length; i++) {
            System.out.print((i+1) +") ");
            System.out.print(solutions[i]+" ");
        }
        System.out.println();
        System.out.println("Введите номер варианта ответа:");
        int userAnswer = scanner.nextInt();
        if (userAnswer == rightAnswer) {
            return "Верно";
        }
        else {
            return "Неверно";
        }
    }

}