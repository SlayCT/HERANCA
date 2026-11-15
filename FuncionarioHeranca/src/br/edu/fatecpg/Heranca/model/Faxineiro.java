package br.edu.fatecpg.Heranca.model;

public class Faxineiro implements Funcionario {

    @Override
    public void baterPonto() {
        System.out.println("Faxineiro bateu o ponto.");
    }

    @Override
    public void trabalhar() {
        System.out.println("Faxineiro está realizando a limpeza.");
    }

    public void solicitarMaterial() {
        System.out.println("Faxineiro solicitou materiais de limpeza.");
    }
}