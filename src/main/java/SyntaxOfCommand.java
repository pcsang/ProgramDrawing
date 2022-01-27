
public class SyntaxOfCommand {
    public static boolean CheckCreateCavas(String[] command){
        boolean check = false;
        String stringRedundancy = command[3];
        if(stringRedundancy != null){
            System.out.printf("The command is wrong structure.\n");
            System.out.printf("Example, C width height.\n");
            return check;
        }
        if(!command[0].equals("C")){
            System.out.printf("Command is wrong.\n");
            System.out.printf("Example, C width height.\n");
            return check;
        }
        boolean width = DrawingModify.isNumber(command[1]);
        boolean height = DrawingModify.isNumber(command[2]);
        if(width && height){
            check = true;
        }
        if(!width)
            System.out.printf("Width must be Integer.\n");
        if(!height)
            System.out.printf("Height must be Integer.\n");
        return check;
    }

    public static boolean CheckDrawLineAndSquare(String[] command){
        boolean check = false;
        String stringRedundancy = command[5];
        if(stringRedundancy != null){
            System.out.printf("The command is wrong structure.\n");
            System.out.printf("Example, L x1 y1 x2 y2 Or R x1 y1 x2 y2.\n");
            return check;
        }
        if(!command[0].equals("L") && !command[0].equals("R")){
            System.out.printf("Command is wrong.\n");
            System.out.printf("Example, L x1 y1 x2 y2. Or R x1 y1 x2 y2\n");
        }
        boolean colum1 = DrawingModify.isNumber(command[1]);
        boolean colum2 = DrawingModify.isNumber(command[3]);
        boolean row1 = DrawingModify.isNumber(command[2]);
        boolean row2 = DrawingModify.isNumber(command[4]);
        if(colum1 && colum2 && row1 && row2 && (command[0].equals("L") || command[0].equals("R")))
            check = true;
        if(!colum1)
            System.out.println("x1 must Integer");
        if(!colum2)
            System.out.println("x2 must Integer");
        if(!row1)
            System.out.println("y1 must Integer");
        if(!row2)
            System.out.println("x1 must Integer");
        return check;
    }

    public static boolean CheckDrawColor(String[] command){
        boolean check = false;
        String stringRedundancy = command[4];
        if(stringRedundancy!=null){
            System.out.printf("The command is wrong structure.\n");
            System.out.printf("Example,B x y c.\n");
            return check;
        }
        if(!command[0].equals("B")){
            System.out.printf("Command is wrong.\n");
            System.out.printf("Example, B x y c\n");
        }
        boolean colum = DrawingModify.isNumber(command[1]);
        boolean row = DrawingModify.isNumber(command[2]);
        boolean color = DrawingModify.isString(command[3]);
        if(colum && row && color && command[0].equals("B"))
            if(command[3] != null)
                check = true;
            else
                System.out.println("c must String and NO NULL");
        if(!colum)
            System.out.println("x must Integer.");
        if(!row)
            System.out.println("y must Integer.");
        if(!color)
            System.out.println("c must String.");
        return check;
    }
}
