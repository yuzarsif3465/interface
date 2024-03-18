package uygulama08Interface01;

public abstract class Kisi {
    private String isim;
    private String soyIsim;
    private int dogumYili;
    private Adress adress;

    public Kisi(){

    }
    public Kisi(String isim, String soyIsim, int dogumYili, Adress adress){
        this.isim= isim;
        this.soyIsim= soyIsim;
        this.dogumYili=dogumYili;
        this.adress=adress;
    }

    public int getDogumYili() {
        return dogumYili;
    }

    public void setDogumYili(int dogumYili) {
        this.dogumYili = dogumYili;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyIsim() {
        return soyIsim;
    }

    public void setSoyIsim(String soyIsim) {
        this.soyIsim = soyIsim;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "Kisi{" +
                "isim='" + isim + '\'' +
                ", soyIsim='" + soyIsim + '\'' +
                ", dogumYili=" + dogumYili +
                ", adress=" + adress +
                '}';
    }
}
