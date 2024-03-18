package uygulama08Interface01;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Ogrenci ogrenci1 = new Ogrenci("ferhat","karkur",2002,null,null,null);
        Adress adres1= new Adress("cemil meric sk.","icadiye mah.", "uskudar");
        ogrenci1.setAdress(adres1);
        ogrenci1.setOkulNumarası("51545");
        ArrayList<String> dersler= new ArrayList<>();
        dersler.add("turkce");
        dersler.add("sosyal");
        ogrenci1.setDersler(dersler);

        KisiIslemleriImp islemler= new KisiIslemleriImp();
        islemler.kisiAdresiniGoster(ogrenci1);

    }
}
