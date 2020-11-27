package model;

public class MaquinaBolinhas {
    
    private State estadoAtual;
    private final Integer maximoBolinhas;
    private Integer totalBolinhas;
    
    public MaquinaBolinhas(Integer maximo, Integer bolinhas){
        
        maximoBolinhas = maximo;
        totalBolinhas = bolinhas;
        
        if (bolinhas > maximo) {
            devolverBolinhas(bolinhas - maximo);
        }
        if (totalBolinhas > 0) {
            estadoAtual = new SemCreditoState(this);
        } else{
            estadoAtual = new EsgotadoState(this);
        }
    }
    
    public void adicionarBolinhas(Integer bolinhas){
        System.out.println("Você adicionou " + bolinhas + " bolinhas!");
        estadoAtual.adicionarBolinhas(bolinhas);
    }
    
    public void inserirMoeda() {
        System.out.println("Você tentou inserir uma moeda!");
        estadoAtual.inserirMoeda();
    }

    public void ejetarMoeda() {
        System.out.println("Você tentou recuperar sua moeda!");
        estadoAtual.ejetarMoeda();
    }

    public void virarManivela() {
        System.out.println("Você tentou virar a manivela!");
        estadoAtual.virarManivela();
    }

    public void entregarBolinha() {
        System.out.println("Você deseja pegar uma bolinha!");
        estadoAtual.entregarBolinha();
    }
    
    public void devolverBolinhas(Integer bolinhas){
        System.out.println("Máximo do estoque da máquina atingido!");
        System.out.println("Serão devolvidas " + bolinhas + " bolinhas!");
    }

    public Integer getMaximoBolinhas() {
        return maximoBolinhas;
    }

    public Integer getTotalBolinhas() {
        return totalBolinhas;
    }

    public void setEstado(State estado) {
        estadoAtual = estado;
    }

    public void setTotalBolinhas(Integer totalBolinhas) {
        this.totalBolinhas = totalBolinhas;
    }

    @Override
    public String toString() {
        return "MaquinaBolinhas:    Quantidade Atual de Bolinhas: " + totalBolinhas + " |   Estado Atual: " + estadoAtual;
    }
}