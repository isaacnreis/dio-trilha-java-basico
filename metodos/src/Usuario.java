public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        System.out.println("A TV está ligada? " + smartTv.ligada);
        System.out.println("Está em qual canal:  " + smartTv.canal);
        System.out.println("Está em qual volume: " + smartTv.volume);
        System.out.println();

        smartTv.ligar();
        smartTv.desligar();
        smartTv.ligar();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarCanal();
        smartTv.diminuirCanal();
        smartTv.mudarCanal(50);
        System.out.println();

        smartTv.desligar();
        smartTv.mudarCanal(2);
    }
}
