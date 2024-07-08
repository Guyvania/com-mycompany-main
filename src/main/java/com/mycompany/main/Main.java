/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

import java.util.Scanner;

/**
 *
 * @author Guyvânia Rosa
 */
public class Main {

    public static void main(String[] args) {
        Faculdade engenharia = Universidade.criarFaculdade("Engenharia");
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Insira o nome da nova faculdade: ");
        String nome = scanner.nextLine();
        System.out.print("Insira o número de departamentos da faculdade de "+nome+": ");
        int num = scanner.nextInt();
        scanner.nextLine();
        Faculdade novaFaculdade = Universidade.criarFaculdade(nome, num);
        for (int i=0; i<num;i++){
            System.out.print("Introduza o nome do departamento "+(i+1)+": ");
            nome = scanner.nextLine();
            novaFaculdade.acrescentarDepartamento(nome);
        }

        engenharia.imprimirFaculdade();
        engenharia.acrescentarDepartamento("Informática");
        engenharia.acrescentarDepartamento("Eletrotécnica");
        engenharia.acrescentarDepartamento("Mecânica");
        engenharia.listarDepartmamentos();
    }
    
}
//commit do git
//alterado do netbeans