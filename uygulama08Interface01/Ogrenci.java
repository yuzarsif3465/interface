package uygulama08Interface01;

import java.util.ArrayList;

public class Ogrenci extends Kisi {
    private String okulNumarası;
    private ArrayList<String > dersler;
    public Ogrenci(){

    }
    public Ogrenci(String isim,String soyIsim, int dogumYili, String okulNumarası, Adress adress, ArrayList<String> dersler){
        super(isim,soyIsim,dogumYili,adress);
        this.okulNumarası= okulNumarası;
        this.dersler=dersler;
    }


    @Override
    public Adress getAdress() {
        return super.getAdress();
    }

    @Override
    public void setAdress(Adress adress) {
        super.setAdress(adress);
    }

    @Override
    public int getDogumYili() {
        return super.getDogumYili();
    }

    @Override
    public void setDogumYili(int dogumYili) {
        super.setDogumYili(dogumYili);
    }

    @Override
    public String getIsim() {
        return super.getIsim();
    }

    @Override
    public void setIsim(String isim) {
        super.setIsim(isim);
    }

    @Override
    public String getSoyIsim() {
        return super.getSoyIsim();
    }

    @Override
    public void setSoyIsim(String soyIsim) {
        super.setSoyIsim(soyIsim);
    }

    public String getOkulNumarası() {
        return okulNumarası;
    }

    public void setOkulNumarası(String okulNumarası) {
        this.okulNumarası = okulNumarası;
    }

    public ArrayList<String> getDersler() {
        return dersler;
    }

    public void setDersler(ArrayList<String> dersler) {
        this.dersler = dersler;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "okulNumarası='" + okulNumarası + '\'' +
                ", dersler=" + dersler +
                '}';
    }
}
