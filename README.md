## Aprendendo sobre o método stream()

O método stream() em Java faz parte da API de Streams, introduzida no Java 8, e está disponível na interface Collection. Esse método permite transformar uma coleção (como uma List, Set ou Map) em um fluxo de dados (um Stream). Esse fluxo pode ser processado de maneira funcional para realizar operações de filtro, mapeamento, redução e outras transformações de dados de forma concisa e eficiente.

Aqui está um resumo de como o método stream() funciona e é utilizado:

## Características do stream()
- Processamento funcional: Permite usar expressões lambda e operações funcionais, como filter, map, reduce, collect, etc.
- Lazy evaluation: As operações intermediárias (como filter e map) são executadas apenas quando uma operação terminal (como collect ou forEach) é chamada.
- Imutabilidade: O Stream não modifica a coleção original. Em vez disso, ele cria uma nova sequência de dados.

## Estrutura do projeto

O workspace contém duas pastas por padrão:

- `src`: fontes
- `lib`: dependências

## Mais algumas informações 

Principais Operações com Stream
1. Operações Intermediárias:
    - filter: Filtra elementos com base em uma condição.
    - map: Transforma cada elemento aplicando uma função (como transformar números em suas versões em string).
    - sorted: Ordena os elementos.
    - distinct: Remove duplicados.
2. Operações Terminais:
    - collect: Coleta os elementos resultantes em uma coleção (como List ou Set).
    - forEach: Executa uma ação para cada elemento.
    - reduce: Reduz os elementos a um único valor, como soma ou concatenação.

## Fluxo de Dados com stream()
Ao usar stream(), você cria um "pipeline" de operações, onde cada etapa processa os dados até a execução da operação terminal. Isso facilita trabalhar com dados em grandes volumes de forma eficiente, sem modificar a estrutura original.