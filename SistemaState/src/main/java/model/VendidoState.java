package model;

public class VendidoState extends PadraoState{
    
    public VendidoState(MaquinaBolinhas maquina) {
        super(maquina);
    }

    @Override
    public void inserirMoeda() {
        System.out.println("Espere as bolinhas serem entregues para adicionar uma nova moeda!");
    }

    @Override
    public void ejetarMoeda() {
        System.out.println("Não será possível devolver a moeda!");
    }

    @Override
    public void virarManivela() {
        System.out.println("Virar a manivela novamente não lhe dará mais bolinhas!");
    }

    @Override
    public void entregarBolinha() {
        if (maquina.getTotalBolinhas() > 1) {
            maquina.setTotalBolinhas(maquina.getTotalBolinhas() - 1);
            maquina.setEstado(new SemCreditoState(maquina));
            System.out.println("Você recebeu 1 bolinha!");
        } else{
            maquina.setTotalBolinhas(maquina.getTotalBolinhas() - 1);
            maquina.setEstado(new EsgotadoState(maquina));
            System.out.println("Você recebeu 1 bolinha!");
        }
    }

    @Override
    public String toString() {
        return "Vendido";
    }
}