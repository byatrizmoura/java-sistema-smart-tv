public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Canal atual : " + smartTv.canal);
        System.out.println("Volume atual : " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status -> TV ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo Status -> TV ligada? " + smartTv.ligada);


        smartTv.abaixar();
        smartTv.abaixar();
        smartTv.abaixar();
        smartTv.aumentar();
        System.out.println("Novo Status -> Volume atual : " + smartTv.volume);

        smartTv.avancar();
        smartTv.avancar();
        smartTv.avancar();
        smartTv.avancar();
        smartTv.retornar();
        System.out.println("Novo Status -> Canal atual : " + smartTv.canal);



    


    }
}
