package ödev1.plakasorgu;
//scanner komutlarını çağırabilmek adına scanner kütüphanesini kodumuza import ettik.
import java.util.Scanner;
public class Ödev1Plakasorgu {
    public static void main(String[] args) {
        System.out.println("Plakanızı giriniz");//kullanıcıya yapması gereken ile ilgili bir mesaj verdik.
        Scanner klavye= new Scanner(System.in);//girdi alırken kullanmak için bir scanner değişken atadık.
        String plaka=klavye.nextLine();//aldoığımız girdileri atamak adına string bir değişken atadık.
        String yeniPlaka = "";
        for (int i = 0; i < plaka.length(); i++) {
            //boşlukları silebilmek için bir for döngüüsü içerisnde girilen plakanın harflerini tek tek kontrol edip yeni bir değişkene atadık.
           char[] plakaChar = new char[plaka.length()];
           plaka.getChars(0,plaka.length(),plakaChar,0);
            if (plakaChar[i]!=' ') {
                //kontol edilen değerler ' ' boşluktan farklı ise yeniPlaka adlı değişkenimize atadık.
                yeniPlaka=yeniPlaka+plakaChar[i];
            }
        }
        if (yeniPlaka.length()<6) {
            //plakanın girilen harf sayısnı kontrol ettik ki hatalı plaka girilmesin.
            System.out.println("hatalı bir plaka girdiniz.");
        }
        //şehir kodumuzun doğrulamasını yapabilmek için yeni bir değişkene girilen plakanın ilk 2 değerinin atamasını yaptırdık ve kontrol ettirdik.
        String sehirKodu=yeniPlaka.substring(0,2);
        sehirKodu(sehirKodu);
        if (yeniPlaka.length()==6) {
           //plaka üzerindeki karakter sayısına göre kontroller yaptırdık.
           String plakaTur=yeniPlaka.substring(2,3).toUpperCase();
           plakaTuru(plakaTur);
        }else if (yeniPlaka.length()==7) {
            //plaka üzerindeki karakter sayısına göre kontroller yaptırdık.
           String plakaTur=yeniPlaka.substring(2,4).toUpperCase();
           plakaTuru(plakaTur);
        }else if (yeniPlaka.length()==8) {
           //plaka üzerindeki karakter sayısına göre kontroller yaptırdık.
           String plakaTur=yeniPlaka.substring(2,5).toUpperCase();
           plakaTuru(plakaTur);
        }
    }
    public static void sehirKodu(String girdi){
        //girilen plakanın şehir kodunu kontrol edebilmek adına burada switch case ile bir kontrol oluşturduk.
     switch(girdi){
              case "01","1":
                  System.out.println("bu plaka Adana'ya aittir.");
                  break;
              case "02","2":
                  System.out.println("bu plaka Adıyaman'a aittir.");
                  break;
              case "03","3":
                  System.out.println("bu plaka Afyon aittir.");
                  break;
              case "04","4":
                  System.out.println("bu plaka Ağrı aittir.");
                  break;
              case "05","5":
                  System.out.println("bu plaka Amasya aittir.");
                  break;
              case "06","6":
                  System.out.println("bu plaka Ankara aittir.");
                  break;
              case "07","7":
                  System.out.println("bu plaka Antalya aittir.");
                  break;
              case "08","8":
                  System.out.println("bu plaka Artvin aittir.");
                  break;
              case "09","9":
                  System.out.println("bu plaka Aydın aittir.");
                  break;
              case "10":
                  System.out.println("bu plaka Balıkesir aittir.");
                  break;
              case "11":
                  System.out.println("bu plaka Bilecik aittir.");
                  break;
              case "12":
                  System.out.println("bu plaka Bingöl aittir.");
                  break;
              case "13":
                  System.out.println("bu plaka Bitlis aittir.");
                  break;
              case "14":
                  System.out.println("bu plaka Bolu aittir.");
                  break;
              case "15":
                  System.out.println("bu plaka Burdur aittir.");
                  break;
              case "16":
                  System.out.println("bu plaka Bursa aittir.");
                  break;
              case "17":
                  System.out.println("bu plaka Çanakkale aittir.");
                  break;
              case "18":
                  System.out.println("bu plaka Çankırı aittir.");
                  break;
              case "19":
                  System.out.println("bu plaka Çorum aittir.");
                  break;
              case "20":
                  System.out.println("bu plaka Denizli aittir.");
                  break;
              case "21":
                  System.out.println("bu plaka Diyarbakır aittir.");
                  break;
              case "22":
                  System.out.println("bu plaka Edirne aittir.");
                  break;
              case "23":
                  System.out.println("bu plaka Elazığ aittir.");
                  break;
              case "24":
                  System.out.println("bu plaka Erzincan aittir.");
                  break;
              case "25":
                  System.out.println("bu plaka Erzurum aittir.");
                  break;
              case "26":
                  System.out.println("bu plaka Eskişehir aittir.");
                  break;
              case "27":
                  System.out.println("bu plaka Gaziantep aittir.");
                  break;
              case "28":
                  System.out.println("bu plaka Giresun aittir.");
                  break;
              case "29":
                  System.out.println("bu plaka Gümüşhane aittir.");
                  break;
              case "30":
                  System.out.println("bu plaka Hakkari aittir.");
                  break;
              case "31":
                  System.out.println("bu plaka Hatay aittir.");
                  break;
              case "32":
                  System.out.println("bu plaka Isparta aittir.");
                  break;
              case "33":
                  System.out.println("bu plaka Mersin aittir.");
                  break;
              case "34":
                  System.out.println("bu plaka İstanbul aittir.");
                  break;
              case "35":
                  System.out.println("bu plaka İzmir aittir.");
                  break;
              case "36":
                  System.out.println("bu plaka Kars aittir.");
                  break;
              case "37":
                  System.out.println("bu plaka Kastamonu aittir.");
                  break;
              case "38":
                  System.out.println("bu plaka Kayseri aittir.");
                  break;
              case "39":
                  System.out.println("bu plaka Kırklareli aittir.");
                  break;
              case "40":
                  System.out.println("bu plaka Kırşehir aittir.");
                  break;
              case "41":
                  System.out.println("bu plaka Kocaeli aittir.");
                  break;
              case "42":
                  System.out.println("bu plaka Konya aittir.");
                  break;
              case "43":
                  System.out.println("bu plaka Kütahya aittir.");
                  break;
              case "44":
                  System.out.println("bu plaka Malatya aittir.");
                  break;
              case "45":
                  System.out.println("bu plaka Manisa aittir.");
                  break;
              case "46":
                  System.out.println("bu plaka Kahramanmaraş aittir.");
                  break;
              case "47":
                  System.out.println("bu plaka Mardin aittir.");
                  break;
              case "48":
                  System.out.println("bu plaka Muğla aittir.");
                  break;
              case "49":
                  System.out.println("bu plaka Muş aittir.");
                  break;
              case "50":
                  System.out.println("bu plaka Nevşehir aittir.");
                  break;
              case "51":
                  System.out.println("bu plaka Niğde aittir.");
                  break;
              case "52":
                  System.out.println("bu plaka Ordu aittir.");
                  break;
              case "53":
                  System.out.println("bu plaka Rize aittir.");
                  break;
              case "54":
                  System.out.println("bu plaka Sakarya aittir.");
                  break;
              case "55":
                  System.out.println("bu plaka Samasun aittir.");
                  break;
              case "56":
                  System.out.println("bu plaka Siirt aittir.");
                  break;
              case "57":
                  System.out.println("bu plaka Sinop aittir.");
                  break;
              case "58":
                  System.out.println("bu plaka Sivas aittir.");
                  break;
              case "59":
                  System.out.println("bu plaka Tekirdağ aittir.");
                  break;
              case "60":
                  System.out.println("bu plaka Tokat aittir.");
                  break;
              case "61":
                  System.out.println("bu plaka Trabzon aittir.");
                  break;
              case "62":
                  System.out.println("bu plaka Tunceli aittir.");
                  break;
              case "63":
                  System.out.println("bu plaka Şanlıurfa aittir.");
                  break;
              case "64":
                  System.out.println("bu plaka Uşak aittir.");
                  break;
              case "65":
                  System.out.println("bu plaka Van aittir.");
                  break;
              case "66":
                  System.out.println("bu plaka Yozgat aittir.");
                  break;
              case "67":
                  System.out.println("bu plaka Zonguldak aittir.");
                  break;
              case "68":
                  System.out.println("bu plaka Aksayar aittir.");
                  break;
              case "69":
                  System.out.println("bu plaka Bayburt aittir.");
                  break;
              case "70":
                  System.out.println("bu plaka Karaman aittir.");
                  break;
              case "71":
                  System.out.println("bu plaka Kırıkkale aittir.");
                  break;
              case "72":
                  System.out.println("bu plaka Batman aittir.");
                  break;
              case "73":
                  System.out.println("bu plaka Şırnak aittir.");
                  break;
              case "74":
                  System.out.println("bu plaka Bartın aittir.");
                  break;
              case "75":
                  System.out.println("bu plaka Ardahan aittir.");
                  break;
              case "76":
                  System.out.println("bu plaka Iğdır aittir.");
                  break;
              case "77":
                  System.out.println("bu plaka Yalova aittir.");
                  break;
              case "78":
                  System.out.println("bu plaka Karakük aittir.");
                  break;
              case "79":
                  System.out.println("bu plaka Kilis aittir.");
                  break;
              case "80":
                  System.out.println("bu plaka Osmaniye aittir.");
                  break;
              case "81":
                  System.out.println("bu plaka Düzce aittir.");
                  break;
              default://switch case içerisindeki kodlamalardan hiçbirisine uymuyor ise default değer olarak hatalı giriş mesajını ekrana veririz çünkü 81 ile 81 ayrı değer ataması gerçekleştirdik
                    System.out.println("Girdiğiniz plaka hatalır.");
                  break;
            }
            
    }
    public static void plakaTuru(String girdi){
        //bu metmod içerisinde de girilen plakanın kabaca türünün ne olduğunu belirtmek için switch case kullandık
        switch(girdi){
            case "A":
                System.out.println("Polis aracı plakası.");
                break;
            case "T":
                System.out.println("Taksi plakası.");
                break;
            case "CA":
                System.out.println("Elçilik aracı plakası.");
                break;
            case "G":
                System.out.println("Geçici araç plakası.");
                break;
            case "MEB":
                System.out.println("Eğitim bakanlığına bağlı resmi plakası.");
                break;
            case "M":
                System.out.println("Minibüs plakası.");
                break;
            case "S":
                System.out.println("Servis plakası.");
                break;
            case "JAA":
                System.out.println("Jandarma plakası.");
                break;
            case "SGH":
                System.out.println("Sahil güvenlik plakası.");
                break;
            default://girilen plakadaki harler herhangi resmi bir plaka değil ise default olarak şahsi araç plakası mesajını ekrana yazdırdık
                System.out.println("Şahsi araç plakası.");
                break;
                
        }
    }
}
