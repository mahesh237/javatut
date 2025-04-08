import java.util.Scanner;
public class MatrixMul {
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
    int[][]A=new int[2][2],b=new int[2][2],c=new int[2][2];

    for(int i=0;i<2;i++)
    for(int j=0;j<2;j++)
    A[i][j]=sc.nextInt();
    
    for(int i=0;i<2;i++)
    for(int j=0;j<2;j++)
    b[i][j]=sc.nextInt();

    //loop for multipication
    
    for(int i=0;i<2;i++)
    for(int j=0;j<2;j++)
    for(int k=0;k<2;k++)
    c[i][j]=A[i][k]*b[k][j];
    
    //loop for print matrix
    
    for(int[]row:c) 
    for(int val:row)
    System.out.print(val +" ");
sc.close();
}
}