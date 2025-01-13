public class dice {
    public static void printDice(int dice)
    {
        switch(dice){
            case 2:
                System.out.println("+-------+" + " +-------+");
                System.out.println("|       |" + " |       |");
                System.out.println("|   o   |" + " |   o   |");
                System.out.println("|       |" + " |       |");
                System.out.println("+-------+" + " +-------+");
                break;
            case 3:
                System.out.println("+-------+" + " +-------+");
                System.out.println("| o     |" + " |       |");
                System.out.println("|       |" + " |   o   |");
                System.out.println("|     o |" + " |       |");
                System.out.println("+-------+" + " +-------+");
                break;
            case 4:
                System.out.println("+-------+" + " +-------+");
                System.out.println("| o     |" + " | o     |");
                System.out.println("|       |" + " |       |");
                System.out.println("|     o |" + " |     o |");
                System.out.println("+-------+" + " +-------+");
                break;
            case 5:
                System.out.println("+-------+" + " +-------+");
                System.out.println("| o     |" + " | o     |");
                System.out.println("|   o   |" + " |       |");
                System.out.println("|     o |" + " |     o |");
                System.out.println("+-------+" + " +-------+");
                break;
            case 6:
                System.out.println("+-------+" + " +-------+");
                System.out.println("| o     |" + " | o     |");
                System.out.println("|   o   |" + " |   o   |");
                System.out.println("|     o |" + " |     o |");
                System.out.println("+-------+" + " +-------+");
                break;
            case 7:
                System.out.println("+-------+" + " +-------+");
                System.out.println("| o   o |" + " | o     |");
                System.out.println("|       |" + " |   o   |");
                System.out.println("| o   o |" + " |     o |");
                System.out.println("+-------+" + " +-------+");
                break;
            case 8:
                System.out.println("+-------+" + " +-------+");
                System.out.println("| o   o |" + " | o   o |");
                System.out.println("|       |" + " |       |");
                System.out.println("| o   o |" + " | o   o |");
                System.out.println("+-------+" + " +-------+");
                break;
            case 9:
                System.out.println("+-------+" + " +-------+");
                System.out.println("| o   o |" + " | o   o |");
                System.out.println("|   o   |" + " |       |");
                System.out.println("| o   o |" + " | o   o |");
                System.out.println("+-------+" + " +-------+");
                break;
            case 10:
                System.out.println("+-------+" + " +-------+");
                System.out.println("| o   o |" + " | o   o |");
                System.out.println("|   o   |" + " |   o   |");
                System.out.println("| o   o |" + " | o   o |");
                System.out.println("+-------+" + " +-------+");
                break;
            case 11:
                System.out.println("+-------+" + " +-------+");
                System.out.println("| o   o |" + " | o   o |");
                System.out.println("| o   o |" + " |   o   |");
                System.out.println("| o   o |" + " | o   o |");
                System.out.println("+-------+" + " +-------+");
                break;
            case 12: 
                System.out.println("+-------+" + " +-------+");
                System.out.println("| o   o |" + " | o   o |");
                System.out.println("| o   o |" + " | o   o |");
                System.out.println("| o   o |" + " | o   o |");
                System.out.println("+-------+" + " +-------+");
                break;
            default:
                System.out.println("Error! Incorrect Roll!");
        }
    }
}
