# Design-Pattern---Padrao-de-projetos-State---Projeto-Mario
Study of standard state projects in JAVA. Working on the mini project, Mario Bros. (Estudo de padrão de projetos state em JAVA. Trababando no mini projeto, Mario Bros.)

# Pattern State

* O Padrão de Projetos State utiliza uma composição para permitir uma variação de comportamentos, para este padrão o comportamente é o ponto central, cada classe representa um comportamente que determindo objeto pode assumir, ou seja, cada estado que um determinado objeto irá assumir.
* Esse padrão é largamente utilizado, especialmente em jogos (Side Scroller **) como Super Mario Bros e Donkey Kong Quest por exemplo, a cada evento o personagem assume um estado. O Mario quando pega um coguumelo ele cresce, se pega uma flor ele tem um novo poder, se colide com o inimigo retorna ao estado de origem.
* State contém uma ibnterface que implementa todos os comportamentos possíveis do objeto e uma classe para cada tipo de comportamento.

** Obs.: Side Scrolling ou side-scroller é uma expressão usada no inglês para jogos onde a câmera é somente lateral, ou seja, só vemos um lado do ambiente.

