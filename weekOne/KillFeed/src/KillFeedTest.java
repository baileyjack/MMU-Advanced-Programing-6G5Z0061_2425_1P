import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class KillFeedTest {

    public static void KillFeedTest(String[] args) {
        double kills = 0;
        double deaths = 0;
        double deathsWithPandoraGun = 0;
        double deathsByOutfittedPlayer = 0;

        Pattern p = Pattern.compile("[*]*");

        for (int i = 0; i < KillStream.kills.length; i++) {
            if (KillStream.kills[i].getKiller().equals("Me (21)") ) {
                kills++;
            }
            else {
                deaths++;
            }
        }
        System.out.println("K/D for session: " + kills/deaths);

        for (int i = 0; i < KillStream.kills.length; i++) {
            if (KillStream.kills[i].getWeapon().equals("Pandora VX25") ) {
                deathsWithPandoraGun++;
            }
        }
        System.out.println("Kills with Pandora Shotgun: " + deathsWithPandoraGun);

        for (int i = 0; i < KillStream.kills.length; i++) {
            Matcher m = p.matcher(KillStream.kills[i].getVictim());
            if (m.find()) {
                if (KillStream.kills[i].getVictim() == "Me (21)") {
                    deathsByOutfittedPlayer++;
                }
            }
        }
        System.out.println("Kills by Outfitted Players: " + deathsByOutfittedPlayer);

    }
}