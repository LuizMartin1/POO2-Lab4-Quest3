/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo2.lab.pkg4.quest.pkg3;

/**
 *
 * @author Luiz Henrique
 */
public class AdapterMusicaDj implements Musica {
    
    private Dj dj;
    
    public AdapterMusicaDj(Dj dj){
        this.dj = dj;
    }

    @Override
    public void tocar() {
        dj.tocar();
    }

    @Override
    public void produz() {
        System.out.println("DJ nao produz!! Quem produz o som e o produtor.");
    }
    
}
