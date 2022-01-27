public class ACavas {
    public String[][] CreateCavas(int[] widthHeight){
        int row = widthHeight[0]+2;
        int colum = widthHeight[1]+2;
        String[][] cavas = new String[row][colum];
        for(int i=0; i<row; i++){
            for(int j=0; j<colum; j++){
                if(i==0 || i==row-1){
                    cavas[i][j]="-";
                }else if(j==0 || j==colum-1){
                    cavas[i][j]="|";
                }else{
                    cavas[i][j]=" ";
                }
            }
        }
        return cavas;
    }

    public void ShowCavas(String[][] cavas){
        System.out.println("|---------My Dawing----------|");
        int row = cavas.length;
        int colum = cavas[1].length;
        for(int i=0; i<row; i++){
            for(int j=0; j<colum; j++){
                System.out.print(cavas[i][j]);
            }
            System.out.println("");
        }
    }
}
