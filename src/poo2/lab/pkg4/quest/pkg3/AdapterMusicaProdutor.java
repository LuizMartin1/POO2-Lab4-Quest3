/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo2.lab.pkg4.quest.pkg3;

/**
 *
 * @author Luiz Henrique
 */
public class AdapterMusicaProdutor implements Musica {
    
    private Produtor produtor;
    
    public AdapterMusicaProdutor(Produtor produtor){
        this.produtor = produtor;
    }

    @Override
    public void tocar() {
        produtor.tocar();
    }

    @Override
    public void produz() {
       produtor.produz();
    }
}
