import java.util.Scanner;
public class indexposition{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int[][] arr=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Required element");
        int req=sc.nextInt();
        // String indexpos=" ";
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(arr[i][j]==req){
                    System.out.println("["+i+","+j+"]");
                }
            }
        }



    }
}