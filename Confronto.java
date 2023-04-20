public class Confronto {
    public static int lutar(SuperHeroi superheroi, Vilao vilao){
        double pSH = superheroi.getPoderTotal();
        double pV = vilao.getPoderTotal();
        if(pSH == pV){
            System.out.println("Empate!\n");
            return 0;
        }else if( pSH > pV){
            System.out.println(superheroi.getNome() + " ganhou!\n");
            return 1;
        }else{
            System.out.println(vilao.getNome() + " ganhou!\n");
            return 2;
        }
    }
}
