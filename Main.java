public class Main {
    public static void main(String[] args) {

        MobilAngkutan camry = new MobilAngkutan("B 12345 LL", "Merah", "Camry", 650);
        camry.getJenis();
        camry.getNomorKendaraan();
        camry.getWarna();
        camry.getMerk();
        camry.getMaximumLoad();
        camry.getHorsePower();
        camry.hitungSewa(6);

        System.out.println("--------------------------------------------------");

        MobilPenumpang raize = new MobilPenumpang("B 4567 HB", "Hitam", "Toyota Raize", "sport");
        raize.getJenis();
        raize.getNomorKendaraan();
        raize.getWarna();
        raize.getMerk();
        raize.getTipe();
        raize.getHorsePower();
        raize.setModeTurbo(true);
        raize.getHorsePower();
        raize.hitungSewa(6);
    }
}