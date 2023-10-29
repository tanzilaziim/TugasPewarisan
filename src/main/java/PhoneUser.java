public class PhoneUser {
    Phone phone; //variabel phone dengan tipe data Phone
    //Dengan ini, metode yang ada pada interface Phone dapat dipanggil

    void turnOnThePhone(){ //Metode turnOnThePhone
        phone.powerOn(); //Memanggil metode powerOn untuk menghidupkan telepon
    }
    void turnOffThePhone(){ //Metode turnOff
        phone.powerOff(); //Memanggil metode powerOff untuk mematikan telepon
    }
    void makePhoneLouder(){ //Metode makePhoneLouder
        phone.volumeUp(); //Memanggil metode volumeUp untuk menaikkan volume
    }
    void makePhoneSilent(){ //Metode makePhoneSilent
        phone.volumeDown(); //Memanggil metode volumeDown untuk menurunkan volume
    }
    int getPhoneVolume(){ //Metode getPhoneVolume
        return phone.getVolume(); //Memanggil getter volume untuk mendapatkan nilai volume
    }
    int setPhoneVolume(){ //Metode setPhoneVolume
        return phone.setVolume();//Memanggil setter volume untuk merubah nilai volume
    }
}
