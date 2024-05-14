public class SmartTV {
    boolean ligada = false;
    int canal = 1;
    int volume = 5;

    public void aumentarVolume(){
        volume++;
    }

    public void diminuirVolume(){
        volume--;
    }

    public void subirCanal(){
        canal = canal + 10;
    }


    public void descerCanal(){
        canal = canal - 5;
    }
    
    public void ligar(){
        ligada = true;
    
    }

    public void desligar(){
        ligada = false;
    }
    
    public void mudarCanal (int novoCanal){
        canal = novoCanal;
        
    }

}
