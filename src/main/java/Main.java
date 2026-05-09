
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Race race = new Race();
        for (int i = 0; i < 3; i++) {
            String autoName = scanner.next();
            int autoSpeed;
            Auto auto;
            while (true) {
                autoSpeed = scanner.nextInt();
                if (autoSpeed > 0 && autoSpeed <= 250) {
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