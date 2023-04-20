public class Principal {

    /* Higor Gabriel Ferreira Silva 
       RA - 2101910

       Vitor Pereira Francisco
       RA - 2101830

       Ricardo Markevicius
       RA - 2203221

       Vitor Luiz Ramalho
       RA - 2102820

       Jonas Gonçalves D`angelo Moreira 
       RA - 2101852
    */
        
    public static void main(String[] args){
        SuperHeroi spiderman = new SuperHeroi("Homen-Aranha", "Peter Parker");
        Vilao  octopus = new Vilao("Dr. Octopus", "Otto Octavius", 5);
        SuperPoder teia = new SuperPoder("soltar teia", 3), sentido = new SuperPoder("sentido apurado", 1), parede = new SuperPoder("andar em parede", 1), tentaculo = new SuperPoder("tentaculos indestrutiveis", 5), velocidade = new SuperPoder("velocidade", 1);   

        spiderman.adicionarSuperPoder(teia);
        spiderman.adicionarSuperPoder(sentido);
        spiderman.adicionarSuperPoder(parede);

        octopus.adicionarSuperPoder(tentaculo);
        octopus.adicionarSuperPoder(velocidade);
        System.out.println("Spiderman: "+spiderman.getNome() + " " + spiderman.getNomeVidaReal() + " " + spiderman.getPoderTotal());
        System.out.println("Octopus: " + octopus.getNome() + " " + octopus.getPoderTotal());
        Confronto.lutar(spiderman, octopus);
    }
}
