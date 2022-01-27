public class Drawing {
    public static void DrawColum(String[][] cavas,int row, int colum_1, int colum_2){
        cavas[row][colum_1]="x";
        if(colum_1<colum_2)
            DrawColum(cavas, row, colum_1+1,colum_2);
    }

    public static void DrawRow(String[][] cavas, int colum, int row_1, int row_2){
        cavas[row_1][colum]="x";
        if(row_1<row_2)
            DrawRow(cavas, colum, row_1+1, row_2);
    }

    public static  void DrawLine(String[][] cavas,int[] localPoint){
        if(localPoint[0]==localPoint[2]){
            int row = localPoint[0];
            int colum_1 = localPoint[1];
            int colum_2 = localPoint[3];
            DrawColum(cavas, row, colum_1, colum_2);
        }
        if(localPoint[1] == localPoint[3]){
            int colum = localPoint[1];
            int row_1 = localPoint[0];
            int row_2 = localPoint[2];
            DrawRow(cavas, colum, row_1, row_2);
        }
    }

    public static void DrawSquare(String[][] cavas, int[] localPoint){
        int[] line_1 = {localPoint[0], localPoint[1], localPoint[0], localPoint[3]};
        int[] line_2 = {localPoint[2], localPoint[1], localPoint[2], localPoint[3]};
        int[] line_3 = {localPoint[0], localPoint[1], localPoint[2], localPoint[1]};
        int[] line_4 = {localPoint[0], localPoint[3], localPoint[2], localPoint[3]};
        DrawLine(cavas, line_1);
        DrawLine(cavas, line_2);
        DrawLine(cavas, line_3);
        DrawLine(cavas, line_4);
    }

    public static void DrawingColorCavas(String[][] cavas, int[] point, String color){
        int columpoint = point[1];
        int rowpoint = point[0];
        if (columpoint>0 || rowpoint>0 || columpoint<cavas[1].length-1 || rowpoint<cavas.length-1){
            cavas[rowpoint][columpoint]=color;
            if(cavas[rowpoint][columpoint-1].equals(" ")){
                int[] point_left = {rowpoint,columpoint-1};
                DrawingColorCavas(cavas, point_left, color);
            }
            if(cavas[rowpoint][columpoint+1].equals(" ")){
                int[] point_right = {rowpoint, columpoint+1};
                DrawingColorCavas(cavas, point_right, color);
            }
            if(cavas[rowpoint-1][columpoint].equals(" ")){
                int[] point_above = {rowpoint-1, columpoint};
                DrawingColorCavas(cavas, point_above, color);
            }
            if(cavas[rowpoint+1][columpoint].equals(" ")){
                int[] point_bottom = {rowpoint+1, columpoint};
                DrawingColorCavas(cavas, point_bottom, color);
            }
        }
    }
}
