public class CheckCommand {
    public static boolean CreateCavas(String[] command){
        boolean checkcommand = false;
        if(SyntaxOfCommand.CheckCreateCavas(command)){
            int width = Integer.parseInt(command[1]);
            int height = Integer.parseInt(command[2]);
            if(width>0 && height>0)
                checkcommand=true;
            else
                System.out.println("Please double check the create parameters!!");
        }
        return checkcommand;
    }

    public static boolean DrawLine(String[] command, String[][] cavas){
        boolean checkcommand = false;
        if(SyntaxOfCommand.CheckDrawLineAndSquare(command)){
            int colum1 = Integer.parseInt(command[1]);
            int colum2 = Integer.parseInt(command[3]);
            int row1 = Integer.parseInt(command[2]);
            int row2 = Integer.parseInt(command[4]);
            if(colum1>0 && row1>0 && colum2<cavas[1].length-1 && row2<cavas.length-1){
                if(colum1==colum2 && row1 <= row2)
                    checkcommand=true;
                else if(row1==row2 && colum1<=colum2)
                    checkcommand =  true;
                else
                    System.out.println("Please double check the drawingLine parameters!!");
            }else
                System.out.println("Please double check the drawingLine parameters!!");
        }
        return checkcommand;
    }
    public static boolean DrawSquare(String[] command, String[][] cavas){
        boolean checkcommand = false;
        if(SyntaxOfCommand.CheckDrawLineAndSquare(command)){
            int colum1 = Integer.parseInt(command[1]);
            int colum2 = Integer.parseInt(command[3]);
            int row1 = Integer.parseInt(command[2]);
            int row2 = Integer.parseInt(command[4]);
            if(colum1>0 && row1>0 && colum2<cavas[1].length-1 && row2<cavas.length-1){
                if(colum1 < colum2 && row1 < row2)
                    checkcommand = true;
                else
                    System.out.println("Please double check the drawing parameters!!");
            }else
                System.out.println("Please double check the drawing parameters!!");
        }
        return checkcommand;
    }

    public static boolean DrawColor(String[] command, String[][] cavas){
        boolean checkcommand= false;
        if(SyntaxOfCommand.CheckDrawColor(command)){
            int colum = Integer.parseInt(command[1]);
            int row = Integer.parseInt(command[2]);
            if(colum > 0 && row>0 && colum<cavas[1].length-1 && row<cavas.length-1){
                checkcommand=true;
            }else
                System.out.println("Please double check the color parameters!!");
        }
        return checkcommand;
    }
}
