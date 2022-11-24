# Teste e Qualidade de Software

O objetivo da parte prática da atividade foi desenvolver um programa capaz de calcular a área e o perímetro de um retângulo, e a seguir implementar testes para validar o funcionamento das classes.

Foram desenvolvidas três classes, sendo uma para utilização do JUnit (framework de testes em java), foram realizados testes dos métodos utilizando o método de teste assertEquals que por meio de entradas controladas, verifica se o resultado obtido pelo método corresponde com esperado.

Classes:

![image](https://user-images.githubusercontent.com/55721262/164955010-79309beb-3abf-4b3d-b1de-1f44b1ba7320.png)

Fórmulas:

Para calcular a área de um retângulo, foi utilizada a seguinte fórmula:

A=b\*h, onde:

A = Área, b = base do retângulo, h = altura do retângulo

Para calcular o perímetro de um retângulo, foi utilizada a seguinte fórmula:

A=2(b+h), onde:

A = Área, b = base do retângulo, h = altura do retângulo

Validação dos testes:

Para calcular a área de um retângulo de 10 de base e 30 de altura, temos que, A = 10\*30, logo Área = 300.
Para calcular o perímetro de um retângulo de 10 de base e 30 de altura, temos que, A = 2(10+30), logo perímetro = 80.

Resultado dos testes:

![image](https://user-images.githubusercontent.com/55721262/164954983-206554b0-b393-4e29-bde3-084773128eea.png)

A classe Programa foi desenvolvida somente para testes com entradas de valores manuais por usuário.
