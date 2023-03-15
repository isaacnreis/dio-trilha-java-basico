public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar(){
        ligada = true;
        System.out.println("TV está ligada");
    }

    public void desligar(){
        System.out.println("Desligando a TV");
        ligada = false;
    }

    public void mudarCanal( int novoCanal ){
        if(ligada){
            canal = novoCanal;
            System.out.println("Canal alterado para: " + canal);
        }
    }

    public void aumentarCanal(){
        if(ligada){
            canal++;
            System.out.println("Canal alterado para: " + canal);
        }
    }

    public void diminuirCanal(){
        if(ligada){
            canal--;
            System.out.println("Canal alterado para: " + canal);
        }
    }

    public void aumentarVolume(){
        if(ligada){
            volume++;
            System.out.println("Aumentando o volume para: " + volume);
        }
    }

    public void diminuirVolume(){
        if(ligada){
            volume--;
            System.out.println("Diminuindo o volume para: " + volume);
        }
    }
}
