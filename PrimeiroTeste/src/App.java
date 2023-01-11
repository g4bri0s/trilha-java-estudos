import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();
        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            System.out.println((smartTv.alimentacao == true) ? "Ligada" : "Desligada");

            System.out.print(smartTv.canal);
            System.out.print("Mudar canal: ");
            int canal = scanner.nextInt();
            smartTv.mudarCanal(canal);
            System.out.print(smartTv.canal);

            System.out.print(smartTv.volume);
            System.out.print("Mudar Volume: ");
            int volume = scanner.nextInt();
            smartTv.mudarVolume(volume);
            System.out.print(smartTv.volume);

            System.out.print("Mudar alimentação: ");
            int alimentacao = scanner.nextInt();
            smartTv.alimentar(alimentacao);
        }

        System.out.println((smartTv.alimentacao == true) ? "Ligada" : "Desligada");

    }
}