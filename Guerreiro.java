public class Guerreiro extends Personagem {
    
    public Guerreiro(String nome, String classe, int nivel, int pontosDeVida, double poderBase) {
        super(nome, classe, nivel, pontosDeVida, poderBase);
    }
    
    @Override
    public void usarHabilidade() {
        System.out.println(getNome() + " Usou Corte Descendente " + (getPoderBase() * 1.5) + " de dano!");
    }
}