public class App {
    public static void main(String[] args) throws Exception {
        
        // Instância do objeto da Classe Pilha com 10 elementos no máximo
        Pilha pilha = new Pilha(10); 

        for (int i = 0; i < pilha.getLenght(); i++) {
            pilha.adicionar(i);
        }

        pilha.remover();
        pilha.remover();

        for (Object o : pilha.getVetor()) {
            System.out.println(o);
        }

    }
}
