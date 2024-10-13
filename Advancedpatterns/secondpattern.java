public class secondpattern{
    public static void main(String[] args){
        int n=5;
        int count=4;
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=count;j++){
                System.out.print("  ");
            }
            for(int k=1;k<=n;k++){
                System.out.print("* ");

            }
            count--;
            System.out.println();
        }
    }
}