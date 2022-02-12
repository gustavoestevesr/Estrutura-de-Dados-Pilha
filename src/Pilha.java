// Declaração da classe
class Pilha {

    // Construtor
    Pilha(int num){        
        vetor = new Object[num];
    }

    // Atributo
    private int numElementos;    
    private Object[] vetor;    

    // Métodos
    void adicionar(Object objeto){
        try {
            vetor[getLastIndexOfElement()] = objeto;
        } catch (Exception e) {
            System.out.println( e.getMessage() );
            return;
        }
        numElementos++;
    }

    Object remover(){
        vetor[numElementos-1] = null;
        numElementos--;
        return vetor[numElementos-1];
    }

    private int getLastIndexOfElement(){
        return vetor.length-numElementos-1;
    }

    int getNumElementos(){
        return numElementos;
    }

    int getLenght(){
        return vetor.length;
    }

    Object[] getVetor(){
        return vetor;
    }

}
