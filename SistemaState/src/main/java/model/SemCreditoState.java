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
    public String toString() {
        return "Sem crédito";
    }
}