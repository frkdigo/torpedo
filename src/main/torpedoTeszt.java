package main;

public class torpedoTeszt {
    public static void main(String[] args) {
        System.out.println("Teszt");
        // assert 3==5: "Nem jó a találat ellenőrzés";
        
        new torpedoTeszt().tesztLovesTalalt(4);
    }
    public String tesztLovesTalalt(int poz){
        Hajo hajo = new Hajo(new int[]{2,3,4});
        String t = hajo.talalat(poz);
        assert t.equals("talált") : "nem jó a találat ellenőrzése";
        return "";
    }
}
