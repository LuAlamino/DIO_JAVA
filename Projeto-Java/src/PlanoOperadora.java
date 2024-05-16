public class PlanoOperadora {

    public static void main(String[] args) {
        
        String plano = "J";

        switch (plano) {
            case "T": {
                System.out.println("5GB Youtube");
                break;
            }

            case "M": {
                System.out.println("Whats e Instagram grátis");
                break;
            
            }
            case "B": {
                System.out.println("100 Minutos de ligação");
                break;
            }
            default:
                System.out.println("Poxa escolha um plano entre [T] [M] [B] te faço um desconto ;) ");
                
        }
    }
    
}
