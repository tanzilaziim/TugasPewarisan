import java.util.Scanner; //Import library scanner

public class Main {
    public static void main(String[] args) { //fungsi main
            Scanner scanner = new Scanner(System.in); //Input scanner
            String hp; //Deklarasi variabel hp
            int pilihan; //Deklarasi variabel pilihan
            PhoneUser user = new PhoneUser();
            Phone xiaomi = new Xiaomi();
            Phone samsung = new Samsung();
            Phone iphone = new iPhone();
            Phone oppo = new Oppo();
            //Pembentukan objek user, xiaomi, samsung, iphone, dan oppo
            System.out.print("Please choose your Phone (iPhone/Samsung/Xiaomi/Oppo): ");
            hp = scanner.nextLine(); //Memasukkan inputan pilihan handphone dari user
            System.out.println();
            if(hp.equals("Xiaomi")) { //Percabangan, jika inputan user Xiaom
                user.phone = xiaomi; //Maka akan diarahkan pada kelas Xiaomi
            } else if (hp.equals("Samsung")) { //Percabangan, jika inputan user Samsung
                user.phone = samsung; //Maka akan diarahkan pada kelas Samsung
            } else if (hp.equals("Oppo")) { //Percabangan, jika inputan user Oppo
                user.phone = oppo; //Maka akan diarahkan pada kelas Oppo
            } else if (hp.equals("Iphone")) { //Percabangan, jika inputan user Iphone
                user.phone = iphone; //Maka akan diarahkan pada kelas iPhone
            }
            user.turnOnThePhone(); //Pemanggilan metode turnOnThePhone untuk menyalakan phone terlebih dahulu
        do{ //Perulangan do while untuk membuat suatu menu
            System.out.println();
            System.out.println("\tPHONE MENU");
            System.out.println("1. INCREASE VOLUME"); //Pilihan untuk meningkatkan volume
            System.out.println("2. DECREASE VOLUME"); //Pilihan untuk menurunkan volume
            System.out.println("3. CHECK VOLUME"); //Pilihan untuk cek volume
            System.out.println("4. SILENT MODE"); //Pilihan silent mode
            System.out.println("0. TURN OFF THE PHONE"); //Pilihan untuk menonaktifkan phone
            System.out.println();
            System.out.print("Pilih menu: "); //Inputan user untuk memilih menu
            pilihan = scanner.nextInt();
            System.out.println();
            switch(pilihan){ //Percabangan sesuai dengan inputan user
                case 0 : //Pilihan 0, mematikan phone
                    user.turnOffThePhone();
                    break;
                case 1 : //Pilihan 1, meningkatkan volume
                    user.makePhoneLouder();
                    break;
                case 2 : //Pilihan 2, menurunkan volume
                    user.makePhoneSilent();
                    break;
                case 3 : //Pilihan 3, informasi volume saat ini
                    System.out.println("Volume: "+user.getPhoneVolume());
                    break;
                case 4 : //Pilihan 4, Mengaktifkan silent mode
                    user.setPhoneVolume();
                    System.out.println("Silent Mode: ON");
                    break;
                default : //Pilihan tidak diketahui (tidak sesuai)
                    System.out.println("No choice,");
                    System.out.println("Please try again.");
            }
        }while(pilihan != 0); //Kondisi penghenti perulangan do while
        //Ketika inputan user == 0, maka program berhenti
    }
}
