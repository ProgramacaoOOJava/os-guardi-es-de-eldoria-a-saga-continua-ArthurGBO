public class Mago extends Personagem {
    
    public Mago(String nome, String classe, int nivel, int pontosDeVida, double poderBase) {
        super(nome, classe, nivel, pontosDeVida, poderBase);
    }
    
    @Override
    public void usarHabilidade() {
        System.out.println(getNome() + " Usou Bola de Fogo " + (getPoderBase() * 1.3) + " de dano!");
    }
}