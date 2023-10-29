public interface Phone { //Deklarasi interface Phone
    int MAX_VOLUME = 100; //Penentuan maksimal volume
    int MIN_VOLUME = 0; //Penentuan minimal volume

    void powerOn(); //Metode powerOn
    void powerOff(); //Metode powerOff
    void volumeUp(); //Metode volumeUp
    void  volumeDown(); //Metode volumeDown
    int getVolume(); //Metode getter volume
    int setVolume(); //Metode setter volume
}
