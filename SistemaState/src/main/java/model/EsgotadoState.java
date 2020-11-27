package model;

public class EsgotadoState extends PadraoState{
    
    public EsgotadoState(MaquinaBolinhas maquina) {
        super(maquina);
    }
    
    @Override
    public void inserirMoeda() {
        System.out.println("Não há bolinhas para serem entregues!");
    }

    @Override
    public void ejetarMoeda() {
        System.out.println("Não há moedas para ejetar!");
    }

    @Override
    public void virarManivela() {
        System.out.println("Insira uma moeda para receber uma bolinha!");
        System.out.println("Não há bolinhas para serem entregues!");
    }

    @Override
    public void entregarBolinha() {
        System.out.println("Insira uma moeda para receber uma bolinha!");
        System.out.println("Não há bolinhas para serem entregues!");
    }
    
    /**
     * Quando o estado for esgotado e for inserido novas bolinhas,
     * deve-se verificar se as novas bolinhas passam do limite, para devolver as sobras,
     * ou não, mas, em todo caso, o estado muda para SemCredito.
     * @param bolinhas 
     */
    @Override
    public void adicionarBolinhas(Integer bolinhas){
        
        if (bolinhas > maquina.getMaximoBolinhas()) {
            Integer sobras = bolinhas - maquina.getMaximoBolinhas();
            maquina.setTotalBolinhas(bolinhas - sobras);
            maquina.devolverBolinhas(sobras);
        } else{
            maquina.setTotalBolinhas(bolinhas);
        }
        maquina.setEstado(new SemCreditoState(maquina));
    }

    @Override
    public String toString() {
        return "Esgotado";
    }
}