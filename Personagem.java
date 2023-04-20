import java.util.ArrayList;

public class Personagem {
    private String nome, nomeVidaReal;
    private ArrayList<SuperPoder> poderes = new ArrayList<SuperPoder>();
    

    Personagem(String nome, String nomeVidaReal){
        this.nome = nome;
        this.nomeVidaReal = nomeVidaReal;
    }
    public void adicionarSuperPoder(SuperPoder superpoder){
        int check = 1;
        
        //inserção na lista vazia
        if(poderes.isEmpty()){
        poderes.add(superpoder);
        }
        
        //checagem de poderes únicos
        else{
            for(SuperPoder s : poderes){
                if(s.getNome() == superpoder.getNome()){
                    check = -1;
                }
            }if(check == 1){
                poderes.add(superpoder);
            }
        }
        return;
    } 

    public double getPoderTotal(){
        double total = 0;
        for(SuperPoder s: poderes){
            total = total + s.getCategoria();
        }
        return total;
    }

    public String getNome(){
        return this.nome;
    }
    public String getNomeVidaReal(){
        return this.nomeVidaReal;
    }
}
