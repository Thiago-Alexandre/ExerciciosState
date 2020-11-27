package main;

import model.MaquinaBolinhas;

public class TesteMaquina {
    
    public static void main(String[] args) {
        
        System.out.println("************************************************************");
        System.out.println("Iniciando o Sistema State com base no problema da máquina de bolinhas...");
        System.out.println("************************************************************");
        System.out.println("Criando máquina de bolinhas com limite para 10 e estoque vazio...");
        MaquinaBolinhas maquina = new MaquinaBolinhas(10,0);
        System.out.println("------------------------------");
        System.out.println(maquina);
        System.out.println("------------------------------");
        System.out.println("************************************************************");
        maquina.adicionarBolinhas(5);
        System.out.println("------------------------------");
        System.out.println(maquina);
        System.out.println("------------------------------");
        System.out.println("************************************************************");
        maquina.inserirMoeda();
        System.out.println("------------------------------");
        System.out.println(maquina);
        System.out.println("------------------------------");
        maquina.virarManivela();
        System.out.println("------------------------------");
        System.out.println(maquina);
        System.out.println("------------------------------");
        maquina.entregarBolinha();
        System.out.println("------------------------------");
        System.out.println(maquina);
        System.out.println("------------------------------");
        System.out.println("************************************************************");
        maquina.adicionarBolinhas(10);
        System.out.println("------------------------------");
        System.out.println(maquina);
        System.out.println("------------------------------");
        System.out.println("************************************************************");
        maquina.inserirMoeda();
        System.out.println("------------------------------");
        System.out.println(maquina);
        System.out.println("------------------------------");
        maquina.ejetarMoeda();
        System.out.println("------------------------------");
        System.out.println(maquina);
        System.out.println("------------------------------");
        maquina.virarManivela();
        System.out.println("------------------------------");
        System.out.println(maquina);
        System.out.println("------------------------------");
        maquina.entregarBolinha();
        System.out.println("------------------------------");
        System.out.println(maquina);
        System.out.println("------------------------------");
        System.out.println("************************************************************");
        for (int i = 0; i < 10; i++) {
            maquina.inserirMoeda();
            System.out.println("------------------------------");
            System.out.println(maquina);
            System.out.println("------------------------------");
            maquina.virarManivela();
            System.out.println("------------------------------");
            System.out.println(maquina);
            System.out.println("------------------------------");
            maquina.entregarBolinha();
            System.out.println("------------------------------");
            System.out.println(maquina);
            System.out.println("------------------------------");
            System.out.println("************************************************************");
        }
        maquina.adicionarBolinhas(2);
        System.out.println("------------------------------");
        System.out.println(maquina);
        System.out.println("------------------------------");
        System.out.println("************************************************************");
        for (int i = 0; i < 5; i++) {
            maquina.inserirMoeda();
            System.out.println("------------------------------");
            System.out.println(maquina);
            System.out.println("------------------------------");
            maquina.virarManivela();
            System.out.println("------------------------------");
            System.out.println(maquina);
            System.out.println("------------------------------");
            maquina.entregarBolinha();
            System.out.println("------------------------------");
            System.out.println(maquina);
            System.out.println("------------------------------");
            System.out.println("************************************************************");
        }
        maquina.adicionarBolinhas(1);
        System.out.println("------------------------------");
        System.out.println(maquina);
        System.out.println("------------------------------");
        System.out.println("************************************************************");
        maquina.inserirMoeda();
        maquina.adicionarBolinhas(1);
        System.out.println("------------------------------");
        System.out.println(maquina);
        System.out.println("------------------------------");
        maquina.virarManivela();
        maquina.adicionarBolinhas(1);
        System.out.println("------------------------------");
        System.out.println(maquina);
        System.out.println("------------------------------");
        maquina.entregarBolinha();
        maquina.adicionarBolinhas(1);
        System.out.println("------------------------------");
        System.out.println(maquina);
        System.out.println("------------------------------");
    
    }
}