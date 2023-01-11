
public class App {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        System.out.println((smartTv.ligada == true) ? "Ligada" : "Desligada");

        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        smartTv.alimentar();

        System.out.println((smartTv.ligada == true) ? "Ligada" : "Desligada");

    }
}