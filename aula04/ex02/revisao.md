## Revisao

Crio 3 classes separadas em diferentes arquivos, um para cada uma, uma sendo a Main, que utiliza as outras duas classes

Utilizo o pacote "java.util.*" que disponibiliza a classe "Scanner" onde é possível fazer a entrada de dados e instancio as outras duas classes "Aluno e Professor"

    Scanner entrada = new Scanner(System.in); //instanciando a classe

Após instanciar a classe, é possivel usar os métodos:

    nextLine() -> strings

    nextInt -> int

    nextBoolean -> boolean

    Entre outros tipos de dados

Nas duas classes eu crio apenas getters e setters para os dados que vou receber 

E na classe "Aluno" eu crio um objeto do tipo "Professor" que é um getter da classe em si, e um setter que permite eu enviar valores pra classe.

Com isso, eu utilizo o setter de "Professor" para enviar um nome direto para a variável "nome" dele

### Getter e Setter

Os getters e setter não são obrigatórios, é possível criar as variáveis na classe e usá-las diretamente, mas é uma boa prática com muitas vantagens em projetos reais e sempre vai ser preferível trabalhar com getter e setter

#### Getter 

o getter é utilizado para retornar o valor atual daquela variável por exemplo

#### Setter

Já o setter é utilizado para mudar o valor dessa variável

##### nextLine e demais

O nextLine converte toda a linha para string e lê o pulo de linha

Os outros como "nextInt", "nextDouble", "nextLong", etc, não leem o pulo de linha, causando um erro comum que é quando colocar mais uma entrada de dados, ela ser ignorada pela execução pela linha não ter sido pulada

Então, quando se usar qualquer um dos outros tipos, utilize embaixo o "nextLine".