import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] answers = {"c", "d", "b"};
        String[] responses = {"", "", ""};



        System.out.println("What is 2 + 2?");
        System.out.println("a) 2");
        System.out.println("b) 6");
        System.out.println("c) 4");
        System.out.println("d) 19238");


        System.out.println("What is the capitol of Missouri?");
        System.out.println("a) Chicago");
        System.out.println("b) Tuscan");
        System.out.println("c) Houston");
        System.out.println("d) Jefferson");

        System.out.println("What is the fasted land animal?");
        System.out.println("a) Tiger");
        System.out.println("b) Cheetah");
        System.out.println("c) Giraffe");
        System.out.println("d) Wolf");

        responses[0] = scanner.next();
        responses[1] = scanner.next();
        responses[2] = scanner.next();

        int score = 0;
        for (int i = 0; i < 3; i++) {
            if (responses[i].equalsIgnoreCase(answers[i])) {
                score++;
            }
        }
        System.out.println("Score: " + score + "/3!");

    }
}
