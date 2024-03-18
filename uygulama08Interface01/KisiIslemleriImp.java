package uygulama08Interface01;

import java.util.ArrayList;

// Not: bunun asıl amacı cok fazla metot olursa bunları otomatik olarak oluşturmak için kullanırız.
public class KisiIslemleriImp implements KisiIslemleri{
    ArrayList<Kisi > kisiler= new ArrayList<>();

    @Override
    public boolean kisiyiKaydet(Kisi kisi) {
        boolean durumu= kisiler.add(kisi);
        return durumu;
    }

    @Override
    public boolean kisiyiSil(Kisi kisi) {
        boolean durum= kisiler.remove(kisi);
        return durum;
    }

    @Override
    public void kisiBilgileriniGoster(Kisi kisi) {
        System.out.println("adı: "+ kisi.getIsim());
        // NOT: alttaki gibi adresse atama yapıp daha kullnaışlı hale getirebilirsin.
        Adress adress= kisi.getAdress();
        System.out.println("adres: "+ adress.getIlce());

    }

    @Override
    public void kisiAdresiniGoster(Kisi kisi) {
        Adress adress= kisi.getAdress();
        System.out.println(kisi.getIsim()+" adlı kisinin adresi: ");
        System.out.println("sokak: "+ adress.getSokak());
        System.out.println("mahalle: "+ adress.getMahalle());
        System.out.println("ilce: "+ adress.getIlce());
    }
}
