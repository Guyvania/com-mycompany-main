/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author Guyvânia Rosa
 */
class Faculdade {
    private String nome;
    private int depNumMax;
    private Departamento[] departamentos;
    private int numDeps;
    
    public Faculdade(String nomeFaculdade, int depNumMax) {
        nome = nomeFaculdade;
        this.depNumMax = depNumMax;
        
        departamentos = new Departamento[depNumMax];
    }
    
    public void imprimirFaculdade(){
        System.out.println("Faculdade de " + nome + ":");
    }
    
    public void acrescentarDepartamento(String nomeDep){
        Departamento novoDep = new Departamento(nomeDep);
        
        if(numDeps<depNumMax){
            departamentos[numDeps] = new Departamento(nomeDep);
            numDeps++;
        }              
    }
    
    private class Departamento{
        private String nomeDep;

        public Departamento(String nomeDep) {
            this.nomeDep = nomeDep;
        }      
        
        public void imprimirDepartamento(){
            System.out.println("Departamento de " + nomeDep);
        }
    }
    
    public void listarDepartmamentos(){
        imprimirFaculdade();
        
        for(int i=0; i<numDeps; i++){
            departamentos[i].imprimirDepartamento();
        } 
    }
}
