package Ckases;

public abstract class Listdisc {
    
        protected int Moneda;
        protected int Artista;
        protected int Album;
        protected int Cancion;

    public Listdisc(int Moneda, int Artista, int Album, int Cancion) {
        this.Moneda = Moneda;
        this.Artista = Artista;
        this.Album = Album;
        this.Cancion = Cancion;
    }
    
    public Listdisc() {
        Moneda=0;
        Artista=0;
        Album=0;
        Cancion=0;
    }

    public abstract int EligeArtista(int coin);
    public abstract int EligeAlbum(int coin);
    public abstract int ElegirCancion(int coin);
}
