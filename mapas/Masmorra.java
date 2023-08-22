package mapas;

import personagens.Monstros;

import javax.management.monitor.MonitorSettingException;
import java.util.ArrayList;
import java.util.Random;

public class Masmorra {
    public int quantidadeDeSalas;
    public int quantidadeDeMonstros;
    ArrayList<Monstros> monstros;
    public int quantidadeDeArmadilhas;

    public void abrirPorta() {
        System.out.println("A porta abriu ");
        Monstros monstros = revelarMonstros();
    if( monstros == null){
        System.out.println("UFA, você está a salvo, por enquanto...");
    }else{
        System.out.println(" AGORA SAIR NO BRAÇO");
    }
    }

    public Masmorra(int quantidadeDeSalas, ArrayList<Monstros> monstros) {
        this.monstros = monstros;
        this.quantidadeDeSalas = quantidadeDeSalas;

        Random random = new Random();
        this.quantidadeDeArmadilhas = random.nextInt(10);
        this.quantidadeDeMonstros = random.nextInt(2);
    }

    private Monstros revelarMonstros() {
       Random random = new Random();
       int numeroSorteado = random.nextInt(2);
       if(numeroSorteado == 0){
           return null;
       }
       return new Monstros(2,10);
    }

}

