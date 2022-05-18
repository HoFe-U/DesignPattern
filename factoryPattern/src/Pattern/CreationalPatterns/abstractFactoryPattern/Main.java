package Pattern.CreationalPatterns.abstractFactoryPattern;

import Pattern.CreationalPatterns.abstractFactoryPattern.client.App;
import Pattern.CreationalPatterns.abstractFactoryPattern.console.ConsoleRpg;
import Pattern.CreationalPatterns.abstractFactoryPattern.dote.DoteRpg;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Rpg rpg;
        App app; //factory 랑 product 를 이어주는 존재 = client
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();

        if(next.contains("console")){
            rpg = new ConsoleRpg();
            app = new App(rpg);
            app.attack();
        }else if(next.contains("dote")){
            rpg = new DoteRpg();
            app = new App(rpg);
            app.attack();
        }
    }
}
