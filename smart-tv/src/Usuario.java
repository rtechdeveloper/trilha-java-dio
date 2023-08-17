public class Usuario {
    public static void main(String[] args) throws Exception {

        // estanciando a classe SmartTv principal
        SmartTv smartTv = new SmartTv();

        System.out.println("Qual o canal atual: " + smartTv.canal);
        smartTv.mudarCanal(13);

        System.out.println("A TV está ligada: " + smartTv.ligada);
        System.out.println("Qual o novo canal: " + smartTv.canal);
        System.out.println("Qual o volume atual: " + smartTv.volume);

        // consumindo os metodos da classe SmartTv
        smartTv.ligar();
        System.out.println("A TV está ligada: " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("A TV está ligada: " + smartTv.ligada);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        System.out.println("Você aumentou o volume: " + smartTv.volume);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        System.out.println("Você diminuiu o volume: " + smartTv.volume);

        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        System.out.println("Você aumentou o canal: " + smartTv.canal);

        smartTv.diminuirCanal();
        smartTv.diminuirCanal();
        smartTv.diminuirCanal();
        System.out.println("Você diminuiu o canal: " + smartTv.canal);

    }
}
