package uygulama07Interface;

public class Test {
    public static void main(String[] args) {
        Kare kare= new Kare(4);
        cevreVeAlanHesapla(kare);
    }
    public static void cevreVeAlanHesapla(Sekil sekil){
        System.out.println(sekil.alanHesapla());
    }

}
