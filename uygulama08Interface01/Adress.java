package uygulama08Interface01;

public class Adress {

    private String sokak;
    private String mahalle;
    private String ilce;
    public Adress(){

    }
    public Adress(String sokak, String mahalle, String ilce){
        this.sokak=sokak;
        this.mahalle=mahalle;
        this.ilce=ilce;
    }

    public String getIlce() {
        return ilce;
    }

    public void setIlce(String ilce) {
        this.ilce = ilce;
    }

    public String getMahalle() {
        return mahalle;
    }

    public void setMahalle(String mahalle) {
        this.mahalle = mahalle;
    }

    public String getSokak() {
        return sokak;
    }

    public void setSokak(String sokak) {
        this.sokak = sokak;
    }

    @Override
    public String toString() {
        return "Adress{" +
                "sokak='" + sokak + '\'' +
                ", mahalle='" + mahalle + '\'' +
                ", ilce='" + ilce + '\'' +
                '}';
    }
}
