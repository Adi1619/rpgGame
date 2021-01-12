import java.util.Scanner;

public class pierwszyDialog {
    boolean poczatkowyEkwipunek = true;
    public static Integer odpowiedz(int pierwszaOdp){
        int drugaOdp = 2;
        if (pierwszaOdp == 1){
            Scanner scan = new Scanner(System.in);
            System.out.println("Podchodzisz do skrzyni i znajdujesz zakurzony tępy miecz, łachmany z mocnej skóry i tarczę, która prawdopodobnie była kiedyś taboretem.\nZamierzasz wyposażyć te przedmioty?\n1. Tak, i tak nic lepszego nie mam.\n2. Wydaje mi się że poradzę sobie bez nich.");
            drugaOdp = scan.nextInt();
        }
        if (pierwszaOdp == 2) System.out.println("Obojętnie odchodzisz od skrzyni, tylko Cię rozprasza.");
        return drugaOdp;
    }
    public Boolean ekwipunek(int drugaOdp){
            if(drugaOdp == 2) poczatkowyEkwipunek = false;
            return poczatkowyEkwipunek;
    }
    public Boolean wezEkwipunek(){
        return poczatkowyEkwipunek;
    }
}
