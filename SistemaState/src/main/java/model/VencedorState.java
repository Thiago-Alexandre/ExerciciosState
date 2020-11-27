package model;

public class VencedorState extends PadraoState{

    public VencedorState(MaquinaBolinhas maquina) {
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

    /**
     * Se tiver só uma bolinha na máquina e o usuário for um vencedor,
     * ele vai receber só uma bolinha e nunca saberá que foi um vencedor.
     */
    @Override
    public void entregarBolinha() {
        if (maquina.getTotalBolinhas() > 2) {
            maquina.setTotalBolinhas(maquina.getTotalBolinhas() - 2);
            maquina.setEstado(new SemCreditoState(maquina));
            System.out.println("Parabéns, você vai receber 2 bolinhas!");
        } else if (maquina.getTotalBolinhas() == 2){
            maquina.setTotalBolinhas(maquina.getTotalBolinhas() - 2);
            maquina.setEstado(new EsgotadoState(maquina));
            System.out.println("Parabéns, você recebeu 2 bolinhas!");
        } else{
            maquina.setTotalBolinhas(maquina.getTotalBolinhas() - 1);
            maquina.setEstado(new EsgotadoState(maquina));
            System.out.println("Você recebeu 1 bolinha!");
        }
    }

    @Override
    public String toString() {
        return "Vencedor";
    }
}