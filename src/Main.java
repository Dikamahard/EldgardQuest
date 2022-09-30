import entity.*;
import entity.character.Character;
import entity.character.Human;
import entity.enemy.Enemy;
import entity.enemy.Goblin;
import equipment.*;
import game.Menu;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Character p1 = new Human("Argus");
        // Enemy f1 = new Goblin("HemoGoblin");
        // Weapon sword = new Weapon("Excalibur", 0, 0);

        // Human player = (Human)p1;
        // player.equipWeapon(sword);

        //Goblin foe1 = (Goblin)f1;

        Menu menu = new Menu();
        Scanner input = new Scanner(System.in);
        Character player = new Human(null);

        boolean flag = true;
        int choice;

        menu.startMenu();
        //while(flag) {
        //menu.mainMenu();
        //menu.startMenu();   // change to main menu
        choice = input.nextInt();
        if(choice == 1) {
            menu.newGameChoosen(player);
            //player.showStatus();
            //menu.mainMenu();
            
            // while loop here?
            while(flag){
                //menu.mainMenu();
                choice = input.nextInt();
                switch(choice) {
                    case 1:
                        menu.exploreChoosen(player);
                        break;
                    case 2:
                        //player.showStatus();
                        menu.characterInfoChoosen(player);
                        break;
                    case 3:
                        // To be implemented
                        // shop
                        break;
                    case 4:
                        // To be implemented
                        // save game
                        break;
                    case 5:
                        flag = false;
                        break;
                    default :
                        // default choice?   
                }
            }
            //menu.mainMenu();
        }else {
            // Load game
        }

        //} while loop close

        //menu.start();

        // System.out.println(" >>> BATTLEEEE!!!\n");
        // player.attacking(foe1);
        // foe1.attacking(player);
        // player.showStatus();

        // player.attacking(foe1);
        // foe1.attacking(player);
        // player.showStatus();

        // player.attacking(foe1);
        // foe1.attacking(player);
        // player.showStatus();

        // player.attacking(foe1);
        // foe1.attacking(player);
        // player.showStatus();

        // player.attacking(foe1);
        // foe1.attacking(player);
        // player.showStatus();

    }
}
