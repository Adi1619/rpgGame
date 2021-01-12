public class heroStats {
    pierwszyDialog poczatkowyEkwipunek = new pierwszyDialog();
    int heroHealth = 100; // basic values
    int heroAtk= 10;
    int heroDef = 5;
    int heroBlockChance = 0;
    int heroEvadeChance = 10;
    public Integer health() {
        if (poczatkowyEkwipunek.wezEkwipunek()) {
            heroHealth += 50;
            return heroHealth;
        } else {
            return heroHealth;
        }
    }

    public Integer atk() {
        if (poczatkowyEkwipunek.wezEkwipunek()) {
            heroAtk += 5;
            return heroAtk;
        } else {
            return heroAtk;
        }
    }

    public Integer def() {

        if (poczatkowyEkwipunek.wezEkwipunek()) {
            heroDef += 5;
            return heroDef;
        } else {
            return heroDef;
        }
    }
    public Integer blockChance() {

        if (poczatkowyEkwipunek.wezEkwipunek()) {
            heroBlockChance += 15;
            return heroBlockChance;
        } else {
            return heroBlockChance;
        }
    }
    public Integer evadeChance() {

        if (poczatkowyEkwipunek.wezEkwipunek()) {
            heroEvadeChance +=5;
            return heroEvadeChance;
        } else {
            return heroEvadeChance;
        }
    }
}

