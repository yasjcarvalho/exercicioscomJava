Os dois exemplos estão dando resultados diferentes, descubra o 'por quê'.
Exemplo 1: 
Para executar o código apresentado, é necessário importar a classe Arrays, que é usada para converter matrizes em strings e imprimi-las. 

Exemplo 2: 
O exemplo acima é um programa Java que cria e imprime o conteúdo de duas matrizes: MatrizInt e matriz.

MatrizInt é uma matriz de inteiros com 5 linhas e 5 colunas, inicialmente vazia. matriz é uma matriz de strings com 2 linhas e 2 colunas, 
inicialmente preenchida com os valores "00", "01", "10" e "11".

Para popular MatrizInt com valores, são usados loops for aninhados que iteram sobre as linhas e colunas da matriz e atribuem o produto dos índices de linha e 
coluna a cada posição na matriz.

Em seguida, a matriz MatrizInt é impressa no console usando outro par de loops for aninhados para iterar sobre as linhas e colunas e imprimir cada valor, 
seguido de um espaço em branco. Após imprimir cada linha, é adicionada uma nova linha para separar as linhas.

Por fim, a matriz matriz é impressa no console usando loops for aninhados semelhantes, mas com strings sendo impressas em vez de inteiros.

Resposta: 
O print do primeiro exemplo está saindo diferente do print do segundo exemplo porque o primeiro exemplo não está populando a matriz matrizInt com nenhum valor.
Portanto, quando o método Arrays.deepToString() é chamado para essa matriz, ele apenas retorna a representação da matriz vazia. 
Já no segundo exemplo, a matriz matrizInt é populada com valores calculados pela multiplicação dos índices, e por isso o print dessa matriz apresenta valores diferentes.
Além disso, o segundo exemplo também adiciona uma nova linha após cada linha impressa na tela, o que não é feito no primeiro exemplo.
