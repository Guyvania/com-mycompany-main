/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author Guyvânia Rosa
 */
public class Universidade {
    public static Faculdade criarFaculdade(String nomeF){
        return new Faculdade(nomeF, 10);
    }
    
    public static Faculdade criarFaculdade(String nomeF, int depNum){
        return new Faculdade(nomeF, 10);
    }
}
