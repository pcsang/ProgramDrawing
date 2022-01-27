public class DrawingModify {
    public static int IndexOfCommandNext(String command){
        int index = command.indexOf(" ");
        return index;
    }

    public static String[] ElementOfCommand(String command){
        String[] element = new String[6];
        String temp = command;
        int i = 0;
        while(!temp.isEmpty() && i<6){
            String command_sub = temp.trim();
            int index = IndexOfCommandNext(command_sub);
            if(index != -1){
                element[i] = command_sub.substring(0,index);
                temp = command_sub.substring(index);
            }else{
                if(!temp.isEmpty()){
                    element[i] = command_sub;
                    temp = "";
                }
            }
            i++;
        }
        return element;
    }

    public static int[] CommandIntoParameters(String[] command){
        int[] parameter = new int[4];
        if(command[0].equals("C")){
            parameter[0]= Integer.parseInt(command[2]);
            parameter[1]= Integer.parseInt(command[1]);
        }
        if(command[0].equals("L") || command[0].equals("R")){
            parameter[0]= Integer.parseInt(command[2]);
            parameter[1]= Integer.parseInt(command[1]);

            parameter[2]= Integer.parseInt(command[4]);
            parameter[3]= Integer.parseInt(command[3]);
        }
        if(command[0].equals("B")){
            parameter[0]= Integer.parseInt(command[2]);
            parameter[1]= Integer.parseInt(command[1]);
        }
        return parameter;
    }

    public static boolean isNumber(String stringNumber){
        boolean isNumber = false;
        try{
            int widthIsNumber = Integer.parseInt(stringNumber);
            isNumber = true;
        }catch(Exception e){
            System.out.printf("String '%s' IS NOT Integer\n", stringNumber);
        }
        return isNumber;
    }

    public static boolean isString(String string){
        boolean isNumber = true;
        try{
            int widthIsNumber = Integer.parseInt(string);
            isNumber = false;
        }catch(Exception e){
        }
        return isNumber;
    }
}
