public class students {
    public static void main(String[] args) {
        String[] name={"abu","ajay","deva","anu"};
        int[][]mark={{60,78,69,78,58},{54,68,97,46,28},{56,89,50,40,98},{98,78,89,70,50}};
        for (int i=0;i<name.length;i++)
        {
            System.out.println("Name="+name[i]);
            double total=0;
            for(int j=0;j<mark[i].length;j++)
            {
                System.out.println(mark[i][j]+" ");
                total=mark[i][j];
            }
            System.out.println();
            System.out.println("average="+(total/5)+"%");
            System.out.println();
        }
    }
}
