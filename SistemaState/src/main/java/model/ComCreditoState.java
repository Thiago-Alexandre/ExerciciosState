package model;

import java.util.Random;

public class ComCreditoState extends PadraoState{
    
    private final Random gerador;

    public ComCreditoState(MaquinaBolinhas maquina) {
        super(maquina);
        gerador = new Random();
    }

    @Override
    public void inserirMoeda() {
        System.out.println("Já foi inserido uma moeda!");
    }

    @Override
    public void ejetarMoeda() {
        System.out.println("Você recebeu sua moeda de volta!");
        maquina.setEstado(new SemCreditoState(maquina));
    }

    @Override
    public void virarManivela() {
        System.out.println("Manivela virada!");
        if (vencedor()) {
            maquina.setEstado(new VencedorState(maquina));
        } else{
            maquina.setEstado(new VendidoState(maquina));
        }
    }
    
    /**
     * Método para realizar a probabilidade de vencedor
     * Como a probabilidade de ser vencedor é de 10%,
     * é gerado um numero aleatório entre 0 e 9 e, 
     * se for 0, ele é um vencedor.
     * @return Boolean
     */
    private Boolean vencedor(){
        Integer numeroAleatorio = gerador.nextInt(10);
        System.out.println("Numero sorteado: " + numeroAleatorio);
        if (numeroAleatorio == 0) {
            return true;
        } else{
            return false;
        }
    }

    @Override
    public String toString() {
        return "Com Crédito";
    }
}