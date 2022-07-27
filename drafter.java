import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Scanner;
import java.net.HttpURLConnection;

public class drafter {

    public static void main(String[] args) throws IOException {
        HashMap<String, String> heroes = new HashMap<>();
        heroes.put("abaddon", "Abaddon");
        heroes.put("alch", "Alchemist");
        heroes.put("axe", "Axe");
        heroes.put("beast", "Beastmaster");
        heroes.put("brew", "Brewmaster");
        heroes.put("bb", "Bristleback");
        heroes.put("centaur", "Centaur_Warrunner");
        heroes.put("ck", "Chaos_Knight");
        heroes.put("clock", "Clockwerk");
        heroes.put("doom", "Doom");
        heroes.put("dk", "Dragon_Knight");
        heroes.put("earth", "Earth_Spirit");
        heroes.put("es", "Earthshaker");
        heroes.put("et", "Elder_Titan");
        heroes.put("huskar", "Huskar");
        heroes.put("io", "Io");
        heroes.put("kunkka", "Kunkka");
        heroes.put("lc", "Legion_Commander");
        heroes.put("ls", "Lifestealer");
        heroes.put("lycan", "Lycan");
        heroes.put("magnus", "Magnus");
        heroes.put("mars", "Mars");
        heroes.put("ns", "Night_Stalker");
        heroes.put("omni", "Omniknight");
        heroes.put("phoenix", "Phoenix");
        heroes.put("pudge", "Pudge");
        heroes.put("sk", "Sand_King");
        heroes.put("slardar", "Slardar");
        heroes.put("snap", "Snapfire");
        heroes.put("sb", "Spirit_Breaker");
        heroes.put("sven", "Sven");
        heroes.put("tide", "Tidehunter");
        heroes.put("timber", "Timbersaw");
        heroes.put("tiny", "Tiny");
        heroes.put("treant", "Treant_Protector");
        heroes.put("tusk", "Tusk");
        heroes.put("underlord", "Underlord");
        heroes.put("undying", "Undying");
        heroes.put("wk", "Wraith_King");
        heroes.put("am", "Anti-Mage");
        heroes.put("arc", "Arc_Warden");
        heroes.put("bs", "Bloodseeker");
        heroes.put("bh", "Bounty_Hunter");
        heroes.put("brood", "Broodmother");
        heroes.put("clinkz", "Clinkz");
        heroes.put("drow", "Drow_Ranger");
        heroes.put("ember", "Ember_Spirit");
        heroes.put("void", "Faceless_Void");
        heroes.put("gyro", "Gyrocopter");
        heroes.put("jugg", "Juggernaut");
        heroes.put("ld", "Lone_Druid");
        heroes.put("luna", "Luna");
        heroes.put("dusa", "Medusa");
        heroes.put("meepo", "Meepo");
        heroes.put("mirana", "Mirana");
        heroes.put("mk", "Monkey_King");
        heroes.put("morph", "Morphling");
        heroes.put("naga", "Naga_Siren");
        heroes.put("nyx", "Nyx_Assassin");
        heroes.put("pango", "Pangolier");
        heroes.put("pa", "Phantom_Assassin");
        heroes.put("pl", "Phantom_Lancer");
        heroes.put("razor", "Razor");
        heroes.put("riki", "Riki");
        heroes.put("sf", "Shadow_Fiend");
        heroes.put("slark", "Slark");
        heroes.put("sniper", "Sniper");
        heroes.put("spectre", "Spectre");
        heroes.put("ta", "Templar_Assassin");
        heroes.put("tb", "Terrorblade");
        heroes.put("troll", "Troll_Warlord");
        heroes.put("ursa", "Ursa");
        heroes.put("venge", "Vengeful_Spirit");
        heroes.put("veno", "Venomancer");
        heroes.put("viper", "Viper");
        heroes.put("weaver", "Weaver");
        heroes.put("aa", "Ancient_Apparition");
        heroes.put("bane", "Bane");
        heroes.put("bat", "Batrider");
        heroes.put("chen", "Chen");
        heroes.put("cm", "Crystal_Maiden");
        heroes.put("ds", "Dark_Seer");
        heroes.put("dw", "Dark_Willow");
        heroes.put("dazzle", "Dazzle");
        heroes.put("dp", "Death_Prophet");
        heroes.put("dis", "Disruptor");
        heroes.put("ench", "Enchantress");
        heroes.put("enigma", "Enigma");
        heroes.put("grim", "Grimstroke");
        heroes.put("invoker", "Invoker");
        heroes.put("jakiro", "Jakiro");
        heroes.put("kotl", "Keeper_of_the_Light");
        heroes.put("lesh", "Leshrac");
        heroes.put("lich", "Lich");
        heroes.put("lina", "Lina");
        heroes.put("lion", "Lion");
        heroes.put("hood", "Hoodwink");
        heroes.put("np", "Nature's_Prophet");
        heroes.put("necro", "Necrophos");
        heroes.put("ogre", "Ogre_Magi");
        heroes.put("oracle", "Oracle");
        heroes.put("od", "Outworld_Devourer");
        heroes.put("puck", "Puck");
        heroes.put("pugna", "Pugna");
        heroes.put("qop", "Queen_of_Pain");
        heroes.put("rubick", "Rubick");
        heroes.put("sd", "Shadow_Demon");
        heroes.put("ss", "Shadow_Shaman");
        heroes.put("silencer", "Silencer");
        heroes.put("sky", "Skywrath_Mage");
        heroes.put("storm", "Storm_Spirit");
        heroes.put("techies", "Techies");
        heroes.put("tinker", "Tinker");
        heroes.put("visage", "Visage");
        heroes.put("vs", "Void_Spirit");
        heroes.put("warlock", "Warlock");
        heroes.put("wr", "Windranger");
        heroes.put("ww", "Winter_Wyvern");
        heroes.put("wd", "Witch_Doctor");
        heroes.put("zeus", "Zeus");
        Scanner sc = new Scanner(System.in);
        StringBuilder url = new StringBuilder();
        url.append("http://dotapicker.com/herocounter#!");
        System.out.println("enter input");
        while (true) {
            String input = sc.nextLine();
            if (input.equals("\n")) {
                break;
            }
            if(input.equals("g")){
                Runtime rt = Runtime.getRuntime();
                try{
                    rt.exec(" rundll32 url.dll,FileProtocolHandler " + url.toString());
                }catch (IOException e){
                    e.printStackTrace();
                }
                continue;
            }
            if(input.equals("r")){
                url = new StringBuilder();
                url.append("http://dotapicker.com/herocounter#!");
                System.out.println("New game");
                continue;
            }
            if(input.equals("u")){
                int count = 0;
                for (int i = url.toString().length()-1; i > 0 ; i--) {
                    if(url.substring(i,i+1).equals("/")){
                        break;
                    }
                    count++;
                }
                System.out.println("removed " + url.toString().substring(url.toString().length()-count+2));
                url.delete(url.toString().length()-count,url.toString().length());

                continue;
            }

            String shortHero = input.substring(0, input.length() - 1);

            String hero = heroes.get(shortHero);
            String allegiance = input.substring(input.length() - 1);

            if(hero == null || !(allegiance.equals("e") || allegiance.equals("t"))){
                System.out.println("error");
                continue;
            }
            if(allegiance.equals("t")){
                System.out.println("Added " + hero + " to my team");
                url.append("/T_");
            }
            if(allegiance.equals("e")){
                System.out.println("Added " + hero + " to the enemy team");
                url.append("/E_");
            }
            url.append(hero);

        }
    }
}

