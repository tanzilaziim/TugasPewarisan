public class Samsung implements Phone{
    // Kelas Samsung memiliki koneksi dengan interface Phone
    private int volume = 40; //Deklarasi variabel volume dengan nilai 40
    private boolean isPowerOn;
    //Deklarasi variabel isPowerOn dengan tipe data boolean

    @Override //Override metode powerOn
    public void powerOn() {
        isPowerOn = true;
        //Nilai isPowerOn menjadi true untuk menandakan phone hidup
        System.out.println("Phone on...");
        System.out.println("\tSAMSUNG");
        System.out.println("Powered by Android");
    }
    public void powerOff(){ //Override metode powerOff
        isPowerOn = false;
        //Nilai isPowerOn menjadi false untuk menandakan phone mati
        System.out.println("\tSAMSUNG");
        System.out.println("Phone off...");
    }
    public void volumeDown(){ //Override metode volumeDown
        if (isPowerOn){//Cek kondisi apakah phone hidup atau mati
            //Jika mati, maka tidak dapat mengurangi volume
            if(volume > MIN_VOLUME) {
                //Cek kondisi apakah volume lebih dari nilai minimun
                //Jika tidak maka tidak dapat mengurangi volume
                volume-=5; //Operasi dimana setiap pengurangan volume berkurang 5
                System.out.println("Phone volume decreased to " + volume);
            }else{
                System.out.println("Phone volume already MINIMUN");
                System.out.println("Can't decrease volume");
            }
        }else {
            System.out.println("Phone is turn off...");
            System.out.println("Please turn it on first");
        }
    }
    public void volumeUp(){ //Override metode volumeUp
        if (isPowerOn){//Cek kondisi apakah phone hidup atau mati
            //Jika mati, maka tidak dapat menambahkan volume
            if(volume < MAX_VOLUME) {
                //Cek kondisi apakah volume kurang dari nilai maksimum
                //Jika tidak maka tidak dapat menambahkan volume
                volume+=5; //Operasi dimana setiap penambahan volume bertambah 5
                System.out.println("Phone volume increased to " + volume);
            }else{
                System.out.println("Phone volume already MAXIMUM");
                System.out.println("Can't increase volume");
            }
        }else {
            System.out.println("Phone is turn off...");
            System.out.println("Please turn it on first");
        }
    }
    public int getVolume(){ //Override metode getVolume
        //Untuk mendapatkan nilai volume
        return volume;
    }
    public int setVolume(){ //Override metode setVolume
        //Untuk setting nilai volume menjadi 0 (silent mode).
        return volume = 0;
    }
}
