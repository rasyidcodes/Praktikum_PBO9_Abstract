import com.sun.org.apache.xpath.internal.operations.Bool;

public class MobilPenumpang extends Mobil{
    private String tipeKendaraan;
    private boolean trbMode = false;

    public void getTipe() {
        System.out.println("Tipe Mobil : "+tipeKendaraan);
    }

    public Boolean getTurboMode() {
        return trbMode;
    }

    @Override
    public void hitungSewa(int jam) {
        int hargasewa = 50000 * jam;
        System.out.println("Harga Sewa Mobil : "+hargasewa);
    }

    @Override
    public void getHorsePower() {
        if(tipeKendaraan.equalsIgnoreCase("sport")){
            if(trbMode == true){
                System.out.println("Daya Mobil Mode Turbo : "+(super.getDayaMobil()+30)+"Hp");
            }
            else{
                System.out.println("Daya Mobil : "+super.getDayaMobil()+"Hp");
            }
        }
        else{
            System.out.println("Daya Mobil : "+super.getDayaMobil()+"Hp");
        }
    }

    public void setModeTurbo(boolean myTrbMode){
        if (tipeKendaraan.equalsIgnoreCase("sport")){
            if (myTrbMode == true){
                trbMode = true;
            }
            else{
                trbMode = false;
            }
        }
        else {
            System.out.println("Mobil tidak memiliki mode turbo");
        }
    }

    public MobilPenumpang(String nomorKendaraan, String warna, String merk, String tipeKendaraan) {
        super(nomorKendaraan, warna, merk);
        this.tipeKendaraan = tipeKendaraan;
        super.setJenis("Mobil Penumpang");
    }
}