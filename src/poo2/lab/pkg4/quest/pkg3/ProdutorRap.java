/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo2.lab.pkg4.quest.pkg3;

/**
 *
 * @author Luiz Henrique
 */
public class ProdutorRap implements Produtor {

    @Override
    public void produz() {
        System.out.println("Produtor produzindo um som de Rap...");
    }

    @Override
    public void tocar() {
        System.out.println("Produtor tocando o som de rap na apresentacao!!\n");
    }
    
}
