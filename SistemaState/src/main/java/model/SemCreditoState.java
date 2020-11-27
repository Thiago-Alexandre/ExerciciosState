package model;

public class SemCreditoState extends PadraoState{

    public SemCreditoState(MaquinaBolinhas maquina) {
        super(maquina);
    }

    @Override
    public void inserirMoeda() {
        System.out.println("Você inseriu uma moeda!");
        maquina.setEstado(new ComCreditoState(maquina));
    }

    @Override
    public void ejetarMoeda() {
        System.out.println("Não há moedas para ejetar!");
    }

    @Override
    public void virarManivela() {
        System.out.println("Insira uma moeda primeiro!");
    }

    @Override
    public void entregarBolinha() {
        System.out.println("Insira uma moeda para receber uma bolinha!");
    }

    @Override
    public String toString() {
        return "Sem crédito";
    }
}