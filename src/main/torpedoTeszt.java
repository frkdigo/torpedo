package main;

public class torpedoTeszt {
    public static void main(String[] args) {
        System.out.println("Teszt");
        // assert 3==5: "Nem jó a találat ellenőrzés";
        
        new torpedoTeszt().tesztLoves(4);
    }
    public String tesztLoves(int poz){
        Hajo hajo = new Hajo();
        String t = hajo.talalat(poz);
        assert t.equals("talált") : "nem jó a találat ellenőrzése";
        return "";
    }
}
