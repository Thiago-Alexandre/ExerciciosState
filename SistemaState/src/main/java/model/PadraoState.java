package model;

/**
 * Este classe apenas define o método para adicionar novas bolinhas.
 * Por esse método ser um padrão para determinados estados, todos apresentam
 * o mesmo método e, caso algum estado necessite de uma nova regra de negócio,
 * pode sobrescreve-lo.
 * @author Thiago
 */
public class PadraoState implements State{

    final MaquinaBolinhas maquina;

    public PadraoState(MaquinaBolinhas maquina) {
        this.maquina = maquina;
    }
    
    @Override
    public void inserirMoeda() {}

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
        System.out.println("É necessário virar a manivela para receber a bolinha!");
    }

    /**
     * Este método é igual nos estados em que o estoque de bolinhas não está esgotado.
     * Deve-se verificar se as novas bolinhas passam do limite da máquina, para serem
     * devolvidas as sobras.
     * @param bolinhas 
     */
    @Override
    public void adicionarBolinhas(Integer bolinhas) {
        if (maquina.getMaximoBolinhas() == maquina.getTotalBolinhas()) {
            System.out.println("Limite de bolinhas na máquina já atingido!");
        } else{
            if ((maquina.getTotalBolinhas() + bolinhas) <= maquina.getMaximoBolinhas()) {
                maquina.setTotalBolinhas(maquina.getTotalBolinhas() + bolinhas);
            } else{
                Integer sobras = (maquina.getTotalBolinhas() + bolinhas) - maquina.getMaximoBolinhas();
                maquina.setTotalBolinhas(maquina.getMaximoBolinhas());
                maquina.devolverBolinhas(sobras);
            }
        }
    }
}