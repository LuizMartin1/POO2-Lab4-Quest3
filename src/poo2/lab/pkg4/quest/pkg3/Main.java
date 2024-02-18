/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo2.lab.pkg4.quest.pkg3;

/**
 *
 * @author Luiz Henrique
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //CRIANDO O PRODUTOR
        Produtor produtor = new ProdutorRap();
        Musica produtor1 = new AdapterMusicaProdutor(produtor);
        habilidadesMusica(produtor1);
        
        //CRIANDO O DJ
        Dj dj = new DjEletronica();
        Musica dj1 = new AdapterMusicaDj(dj);
        habilidadesMusica(dj1);
    }
    public static void habilidadesMusica(Musica musica){
            musica.produz();
            musica.tocar();
            
        }
    
}
