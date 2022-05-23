package main;

public class Hajo {
    private int[] pozicio;

    public Hajo(int[] poz) {
        this.pozicio = poz;
    }
    
    public String talalat(int poz){
        // eldöntés tétele
        int i = 0, N = this.pozicio.length;
        while(i < N && !(pozicio[i] == poz)){
            i++;
        }
        return i < N ? "talált" : "mellé";
    }
}
