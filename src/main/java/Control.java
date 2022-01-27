
import java.util.Scanner;

public class Control {
    public static void Drawing(String[][] cavas){
        ACavas acavas = new ACavas();
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Input my command drawing: ");
            String commandDrawing_sub = scanner.nextLine();
            String[] commandDraw = DrawingModify.ElementOfCommand(commandDrawing_sub);
            int [] listpoit = DrawingModify.CommandIntoParameters(commandDraw);

            if(commandDrawing_sub.trim().equals("Q")){
                System.out.println("--Bye--");
                break;
            }

            if(commandDraw[0].equals("L")||commandDraw[0].equals("R")||commandDraw[0].equals("B")){
                switch(commandDraw[0]){
                    case "L":
                        if(CheckCommand.DrawLine(commandDraw, cavas)){
                            Drawing.DrawLine(cavas, listpoit);
                            acavas.ShowCavas(cavas);
                        }
                        break;
                    case "R":
                        if(CheckCommand.DrawSquare(commandDraw, cavas)){
                            Drawing.DrawSquare(cavas, listpoit);
                            acavas.ShowCavas(cavas);
                        }
                        break;
                    case "B":
                        if(CheckCommand.DrawColor(commandDraw, cavas)){
                            Drawing.DrawingColorCavas(cavas, listpoit, commandDraw[3]);
                            acavas.ShowCavas(cavas);
                        }
                        break;
                }
            }else
                System.out.println("Command ERROR.");

        }while(true);

    }
}
