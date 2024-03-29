package game;
import java.util.Scanner;

import entity.character.Character;


public class Menu {
    Scanner input;
    GameFunc gameFunc;
    Character player;

    
    public Menu(Character player) {
        input = new Scanner(System.in);
        gameFunc = new GameFunc(player);
        this.player = player;
    }


    // func menu interface

    public Character getCharacter() {
        return this.player;
    }

    public void startMenu() {
       
        System.out.println("=============================");
        System.out.println("===== Eldgard Quest RPG =====");
        System.out.println("=============================\n");
        System.out.println("Welcome to Eldgar Quest, a classical text based RPG game.");
        System.out.println("1. New Game");
        System.out.println("2. Load Game");
        System.out.println("---------------------");
        System.out.print(">> ");
        
    }
    

    public void mainMenu() {
        System.out.println("==== Main Menu ====");
        System.out.println("1. Explore");
        System.out.println("2. Character Info");
        System.out.println("3. Inventory");
        System.out.println("4. Shop");
        System.out.println("5. Save Game");
        System.out.println("6. Exit Game");
        System.out.println("---------------------");
        System.out.print(">> ");
    }

    public void areaMenu() {
        int area;
        System.out.println("==== Explore the Area ====");
        System.out.println("1. Castle of Fantanir");
        System.out.println("2. Greimog Forest ");
        System.out.println("3. Ruin of Asvangald");
        System.out.println("4. Niddrulenn");
        System.out.println("5. Etterfrost");
        System.out.println("6. Beorgingwnis");
        System.out.println("7. To be added...");
        System.out.println("---------------------");
        System.out.print(">> ");
        area = input.nextInt();
        compassDirection(area);
    } 


    // func choice choosen
    public void newGameChoosen() {
        // maybe some narative intro
        System.out.println("Greetings adventurer, before we start our adventure lets create your character first !");
        // create character
        gameFunc.createCharacter(player);
    }

    public void exploreChoosen() {
        areaMenu();
        return;
    }

    public void characterInfoChoosen() {
        player.showStatus();
        System.out.println("---------------------");
        System.out.println("1. Back");
        System.out.print(">> ");
        if(input.nextInt() == 1) {
            mainMenu();
        }else {
            
        }
    }

    public void inventoryChoosen() {
        player.getInventory().printListEquipments();
        System.out.println("---------------------");
        System.out.println("1. Sell");
        System.out.println("2. Equip");
        System.out.println("3. Back");
        System.out.print(">> ");
        switch (input.nextInt()) {
            case 1:
                gameFunc.sellInventory();
                break;
            case 2:
                gameFunc.equipInventory();
                break;
            case 3:
                mainMenu();
                break;
            default:
                break;
        }
    }

    public void compassDirection(int area) {
        int compass;
        System.out.println("==== Choose Direction ====");
        System.out.println("1. West");
        System.out.println("2. East");
        System.out.println("3. North");
        System.out.println("4. South");
        System.out.println("---------------------");
        System.out.print(">> ");
        compass = input.nextInt();
        gameFunc.generateEnemy(area, compass);
    }

    
}
