import java.util.Scanner;

public class MainDrawing {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ACavas acavas = new ACavas();
        String[] commandCreate = new String[6];
        do{
            System.out.println("Create a cavas with command: C width height");
            String command = scanner.nextLine();
            commandCreate = DrawingModify.ElementOfCommand(command);
            if(command.trim().equals("Q"))
                break;
        }while(!CheckCommand.CreateCavas(commandCreate));

        if(!commandCreate[0].equals("Q")){
            int[] widthHeight = DrawingModify.CommandIntoParameters(commandCreate);
            String[][] cavas = acavas.CreateCavas(widthHeight);
            acavas.ShowCavas(cavas);
            Control.Drawing(cavas);
        }else
            System.out.println("----Bye----");
        System.out.println("----See you again----");
    }
}
