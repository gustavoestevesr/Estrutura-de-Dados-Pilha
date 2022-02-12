## ESTRUTURA DE DADOS DE UMA PILHA

# Implemente a classe Pilha representada ao lado sabendo que:
- a. O atributo numElementos é somente leitura e indica quantos
elementos estão armazenados naquele momento;
- b. A classe usa um vetor interno para armazenar a estrutura;
- c. O único construtor disponível é o que aparece no modelo e que seu parâmetro de entrada é usado para alocar a estrutura interna, definindo seu
tamanho máximo;
- d. O método adicionar() adiciona um objeto no final do vetor, se houver espaço. Se não
houver, uma exceção deve ser disparada (não é necessário demonstrar o código da
classe de exceção, apenas usá-la);
- e. O método remover() retira o último elemento do vetor e o retorna como saída da
função;

# Classe
Pilha
# Atributo
numElementos : int
# Métodos
adicionar( Object o)
remover() : Object
Pilha( num : int )