public class matrixadd{
    public static void main(String[] args){
    int[][] a={{1,2,3},{4,5,6},{7,8,9}};
    int[][] b={{4,6,7},{8,9,6},{4,7,8}};
        int[][] c=new int[3][3];
        for(int i=0;i<c.length;i++)
        {
            for(int j=0;j<c[i].length;j++)
             
            {
                c[i][j]=a[i][j]+b[i][j];
             System.out.print(c[i][j]+" ");
            }
            System.out.println();
           
              
                
            }
        }
    }
