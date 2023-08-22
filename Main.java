import mapas.Masmorra;
import personagens.Heroi;
import personagens.Monstros;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Masmorra temploDaAgua = new Masmorra(20, new ArrayList<Monstros>());
  //      Heroi heroi1 = new Heroi("latino",10,5,7);
  //      Heroi heroi2 = new Heroi("Super Humano",10,5,7);
  //      Heroi heroi3 = new Heroi("Barbaro",10,5,7);
 //       Heroi heroi4 = new Heroi("Bardo",10,5,7);
 //       Heroi heroi5 = new Heroi("Mago",10,5,7);

 //       heroi1.setCategoria("Super Ladino");
 //       heroi1.setforca(-500);
 //       System.out.println(heroi1.getForca());

        temploDaAgua.abrirPorta();


    }
}
