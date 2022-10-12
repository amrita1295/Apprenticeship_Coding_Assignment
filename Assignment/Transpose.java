import java.util.Scanner;
class Transpose
{
    public static int[][] transpose(int p[][])
    {
        int R = p.length, C = p[0].length;
        int[][] ans = new int[C][R];
       
        for (int r = 0; r < R; ++r)
        {
            for (int c = 0; c < C; ++c) {
                ans[c][r] = p[r][c];
                
            }
        }
        return ans;
    }


    public static void Multiply(int [][]matrix1, int [][]matrix2)
    {
        //multiplication
        int ans[][]=transpose(matrix1);
        int ans1[][]=transpose(matrix2);
        int R = matrix1.length, C = matrix2[0].length;
        int multiplication[][]=new int[R][C];
        System.out.println("The multiplied matrix is : ");
        for(int i=0;i<R;i++)
        {    
            for(int j=0;j<C;j++)
            {    
                multiplication[i][j]=0;      
                for(int k=0;k<R;k++)      
                {      
                    multiplication[i][j]+=ans[i][k]*ans1[k][j];      
                }//end of k loop  
           
            System.out.print(multiplication[i][j]+" ");  //printing matrix element  
            }//end of j loop  
            System.out.println(" ");
             
        }    
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size: ");
        int n=sc.nextInt();
        int a[][]=new int[n][n];
        int b[][]=new int[n][n];
        System.out.println("Enter the values first matrix");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the values for second matrix");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                b[i][j]=sc.nextInt();
            }
        }
        Multiply(a, b);
        sc.close();
    }
}