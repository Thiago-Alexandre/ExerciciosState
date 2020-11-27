package model;

public class EsgotadoState extends PadraoState{
    
    private final String mensagem;
    
    public EsgotadoState(MaquinaBolinhas maquina) {
        super(maquina);
        mensagem = "Não há bolinhas no estoque!";
    }
    
    @Override
    public void inserirMoeda() {
        System.out.println(mensagem);
    }

    @Override
    public void virarManivela() {
        super.virarManivela();
        System.out.println(mensagem);
    }

    @Override
    public void entregarBolinha() {
        super.entregarBolinha();
        System.out.println(mensagem);
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