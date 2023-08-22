package personagens;

import objetos.Arma;

import java.util.ArrayList;

public class Heroi {
    private int quantidadeDeHabilidades;
    ArrayList<Arma> arma;
    public int pontosDeVida;
    public int forca;

    private String categoria;

    public Heroi(String categoria, int pontosDeVida, int quantidadeDeHabilidades, int forca) {
        this.categoria = categoria;
        this.pontosDeVida = pontosDeVida;
        this.quantidadeDeHabilidades = quantidadeDeHabilidades;
        this.forca = forca;
    }

    public Heroi(String categoria, int pontosDeVida) {
        this.categoria = categoria;
        this.pontosDeVida = pontosDeVida;
    }
    public String getCategoria() {
        return "A categoria deste héroi é: " + this.categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;

    }public int getForca(){
        return  this.forca;
    }
    public void setforca(int forca){
        if(forca <= 0){
            this.forca =1;
        }else if (forca > 10){
            this.forca = 10;
        }else {
            this.forca = forca;
        }
    } public int getpontosDeVida(){
            return this.pontosDeVida;
    }public void setpontosDeVida(int pontosDeVida){
        if(pontosDeVida <=0){
            this.pontosDeVida = 0;
        } else if (pontosDeVida >=10) {
            this.pontosDeVida =10;
        }
    }public int getQuantidadeDeHabilidades(){
        return this.pontosDeVida;
    }public void setQuantidadeDeHabilidades(int quantidadeDeHabilidades){
 //       if(quantidadeDeHabilidades <= 2);{
 //           this.quantidadeDeHabilidades = 2;
 //       }
    }

}
