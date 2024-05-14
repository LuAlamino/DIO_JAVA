public class UsuarioTV {

    public static void main(String[] args) throws Exception {

        SmartTV smartTV = new SmartTV();

        System.out.println("TV Ligada ? " + smartTV.ligada);
        System.out.println("Canal Atual " + smartTV.canal);
        System.out.println("Volume da TV " + smartTV.volume);

        smartTV.ligar();
        System.out.println("Novo Status TV Ligada ? " + smartTV.ligada);
        
        smartTV.subirCanal();
        smartTV.subirCanal();
        smartTV.descerCanal();

        System.out.println("Canal Atual " + smartTV.canal);

        smartTV.mudarCanal(99);

        System.out.println(smartTV.canal);

    }
    

        
}
