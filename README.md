# ExerciciosState

### Exercícios realizados na disciplina de Programação VI, utilizando o padrão State.

#### Descrição do problema: Considere a implementação de uma máquina automática para venda de bolinhas de borracha. O problema pode ser modelado como uma máquina de estados, compreendendo, a princípio, os seguintes estados:

* Sem Crédito: este ́e um estado de repouso, no qual a máquina aguarda o recebimento de moedas. Neste estado, nenhuma compra pode ser efetivada e também não se pode entregar bolinhas para o cliente;

* Com Crédito: neste estado, a máquina já recebeu uma moeda do usuário, estando, portanto, apta a efetivar a compra (caso o estoque da máquina seja maior que zero), ou devolver o crédito ao cliente;

* Esgotado: neste estado, a máquina está com o reservatório de bolinhas vazio, não podendo efetivar compra ou entregar produto. Também não pode aceitar moedas do comprador;

* Vendido: estado representando a compra efetivada. Aqui, uma bolinha deve ser entregue ao cliente, o estoque deve ser atualizado e a máquina deve voltar ao estado de espera;

* Vencedor: semelhante ao estado anterior. Este estado corresponde a uma venda sorteada em promoção, na qual o comprador ganha duas bolinhas ao invés de uma. Este caso deve ocorrer em aproximadamente 10% das vendas.

#### A interface da máquina (i.e. sua interação com o comprador ou com o cliente deve compreender as seguintes ações:

* Inserir moeda: esta ação corresponde à inserção de crédito na máquina;

* Ejetar moeda: corresponda a um pedido de devolução de crédito por parte do usuário;

* Virar manivela: ação necessária para efetivar a compra e liberação de uma ou duas bolinhas (em 10% das compras) caso haja crédito e estoque na máquina;

* Entregar: ação interna da máquina, para liberar bolinha(s) caso haja crédito e estoque (não se esqueça de atualizar o estoque da máquina).

#### Observações da Implementação:

Foi adicionado um método para adicionar novas bolinhas na máquina. Este método pode ser chamado em qualquer uma das ações citadas acima, sem interferir em seu funcionamento. Como o método é igual para a maioria dos estados, foi criada um State concreto que define este método, sendo os demais ConcretStates extenderem deste State Padrão, implementando os demais métodos normalmente. Já o estado que possua uma regra de negócio diferente para o método adicionarBolinhas (como o estado Esgotado, que, ao apresentar novas bolinhas, muda para o estado Sem Crédito), basta sobrecarregar este método (como no padrão Strategy).