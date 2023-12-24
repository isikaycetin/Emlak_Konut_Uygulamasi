import java.util.Scanner;

interface display { //  Özellikleri göstermesi için bir imzasız display interface sınıfı oluşturduk.
    void displayInfo();
}

// Konutu implement ettik.
abstract class Konut implements display {
    protected String address;

    public Konut(String address) {    // konut için adres bilgileri
        this.address = address;
    }
}
// Konut sınıfı, display interface'ini implement eden soyut bir sınıftır.
class Daire extends Konut implements Comparable<Daire> {
    /*Comparable<Daire> interface'i, sınıfın doğal sıralama düzenini tanımlayan bir arabirimdir.
    Bu, sınıfın nesnelerini sıralamak için kullanılan bir yöntem sağlar.
    Comparable arabirimini uygulayan bir sınıf, bu sınıfa ait nesneleri sıralamak için kullanılabilir */
    private int daireNumber;

    public Daire(String address, int apartmanNumber) {
        super(address);
        this.daireNumber = daireNumber;
    }

    @Override
    public void displayInfo() {
        System.out.println("Adres: " + address);
        System.out.println("Daire Numarası: " + daireNumber);
    }

    @Override
    public int compareTo(Daire otherDaire) {
        return Integer.compare(this.daireNumber, otherDaire.daireNumber);
    }
}

class Bina extends Konut implements display {
    private String binaAdi;
    private int numberOfFloors;

    // Bina sınıfının  metodu, bina adı , bina nuamrarası  bilgilerini alır.
    public Bina(String binaAdi, int numberOfFloors) {
        super("Bina Adresi Belirtilmemiş"); // Bina adresi için varsayılan değer
        this.binaAdi = binaAdi;
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public void displayInfo() {
        System.out.println("Bina Adı: " + binaAdi);
        System.out.println("Kat Sayısı: " + numberOfFloors);
    }
}

class EvSahibi implements display {
    private String ad;
    private String soyad;

    // EvSahibi sınıfının  metodu ad ve soyad bilgilerini alır.
    public EvSahibi(String ad, String soyad) {
        this.ad = ad;
        this.soyad = soyad;
    }

    @Override
    public void displayInfo() {
        System.out.println("Ev Sahibi: " + ad + " " + soyad);
    }
}

class Kiraci implements display {
    private String ad;
    private String soyad;
    private EvSahibi evSahibi;

    // Kiraci sınıfının  metodu  ad, soyad ve EvSahibi nesnesi bilgilerini alır.
    public Kiraci(String ad, String soyad, EvSahibi evSahibi) {
        this.ad = ad;
        this.soyad = soyad;
        this.evSahibi = evSahibi;
    }

    @Override
    public void displayInfo() {
        System.out.println("Kiracı: " + ad + " " + soyad);
        evSahibi.displayInfo();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcı için gerekli bilgileri aldık.
        System.out.print("Daire Adresi: ");
        String daireAdresi = scanner.nextLine();

        System.out.print("Daire Numarası: ");
        int daireNumarasi = scanner.nextInt();

        // Bina bilgilerini al
        scanner.nextLine(); // Dummy line to consume the extra newline character
        System.out.print("Bina Adı: ");
        String binaAdi = scanner.nextLine();

        System.out.print("Bina Kat Sayısı: ");
        int katSayisi = scanner.nextInt();

        // Ev Sahibi bilgilerini al
        scanner.nextLine();       // alt satıra geç
        System.out.print("Ev Sahibi Adı: ");
        String evSahibiAdi = scanner.nextLine();

        System.out.print("Ev Sahibi Soyadı: ");
        String evSahibiSoyadi = scanner.nextLine();

        // Kiracı bilgilerini al
        System.out.print("Kiracı Adı: ");
        String kiraciAdi = scanner.nextLine();

        System.out.print("Kiracı Soyadı: ");
        String kiraciSoyadi = scanner.nextLine();

        // Nesneleri oluşturduk.
        Daire daire = new Daire(daireAdresi, daireNumarasi);
        Bina bina = new Bina(binaAdi, katSayisi);
        EvSahibi evSahibi = new EvSahibi(evSahibiAdi, evSahibiSoyadi);
        Kiraci kiraci = new Kiraci(kiraciAdi, kiraciSoyadi, evSahibi);

        // Bilgileri listele, göster.
        System.out.println("-----------------------------------------------------");
        daire.displayInfo();
        System.out.println();
        bina.displayInfo();
        System.out.println();
        kiraci.displayInfo();
}
}