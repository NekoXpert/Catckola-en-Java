
package clases;

import Ckases.Listdisc;
import Formularios.Rockola;
import javax.swing.JOptionPane;
// **Author Felipe Reyes { Nekosor }**
public class BonJovi extends Listdisc{

    public BonJovi(int Moneda, int Artista, int Album, int Cancion) {
        super(Moneda, Artista, Album, Cancion);
    }

    public BonJovi() {
        Moneda=0;
        Artista=0;
        Album=0;
        Cancion=0;
    }

    public int getMoneda() {
        return Moneda;
    }

    public void setMoneda(int Moneda) {
        this.Moneda = Moneda;
    }

    public int getArtista() {
        return Artista;
    }

    public void setArtista(int Artista) {
        this.Artista = Artista;
    }

    public int getAlbum() {
        return Album;
    }

    public void setAlbum(int Album) {
        this.Album = Album;
    }

    public int getCancion() {
        return Cancion;
    }

    public void setCancion(int Cancion) {
        this.Cancion = Cancion;
    }
    
    
    
    @Override
    public int EligeArtista(int coin){
        
        if(coin==0){
            JOptionPane.showMessageDialog(null, "Aun no a puesto ninguna moneda");
        }else if(coin<=5){
        
            
            switch(Artista){
                case 1:
                    Artista = 1;
                    break;
                case 2:
                    Artista = 2;
                    break;
                case 3:
                    Artista = 3;
                    break;
                case 4:
                    Artista = 4;
                    break;
            }
        }
        return Artista;
    }
    
    @Override
    public int EligeAlbum(int coin){
        
        if(coin==0){
            JOptionPane.showMessageDialog(null, "Aun no a puesto ninguna moneda");
        }else if(coin<=5){
        
        switch(EligeArtista(Artista)){
                case 1:
                    Album=1;
                    break;
                case 2:
                    Album=2;
                    break;
                case 3:
                    Album=3;
                    break;
                case 4:
                    Album=4;
                    break;
            }
        }return Album;
    }
    @Override
    public int ElegirCancion(int coin){
        
        if(coin==0){
            JOptionPane.showMessageDialog(null, "Aun no a puesto ninguna moneda");
        }else if(coin<=5){
        
        switch(EligeAlbum(Album)){
                case 1:
                    Cancion=1;
                    break;
                case 2:
                    Cancion=2;
                    break;
                case 3:
                    Cancion=3;
                    break;
                case 4:
                    Cancion=4;
                    break;
            }
        }return Cancion;
    }

}
