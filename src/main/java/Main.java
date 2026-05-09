
import java.util.Scanner;

public class Main {
    private static final int MIN_SPEED = 0;
    private static final int MAX_SPEED = 250;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Race race = new Race();
        for (int i = 0; i < 3; i++) {
            String autoName = scanner.next();
            int autoSpeed;
            Auto auto;
            while (true) {
                if (!scanner.hasNextInt()) {
                    System.out.println("Введите число, а не текст");
                    scanner.next();
                    continue;
                }
                autoSpeed = scanner.nextInt();
                if (autoSpeed > MIN_SPEED && autoSpeed <= MAX_SPEED) {
                    System.out.println("Машина " + autoName + " со скоростью " + autoSpeed + " добавлена");
                    auto = new Auto(autoName, autoSpeed);
                    break;
                } else {
                    System.out.println("Введите допустимую скорость 0-250");
                }
            }
            race.setWinner(auto);
        }
        System.out.println("Победитель гонки: " + race.winner);
    }
}