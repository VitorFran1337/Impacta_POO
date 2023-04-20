public class SuperHeroi extends Personagem {
    SuperHeroi(String nome, String nomeVidaReal){
        super(nome, nomeVidaReal);
        }

    @Override
    public double getPoderTotal(){
        return (super.getPoderTotal() * 1.1);
    }
}
