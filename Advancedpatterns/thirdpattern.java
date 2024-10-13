public class thirdpattern{
    public static void main(String[] args){
        int n=5;
        int spaces=4;
        int count=1;
        
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=spaces;j++){
                System.out.print("  ");
            }
            for(int k=1;k<=count;k++){
                
                System.out.print(k+"   " );
                // count=count+1;
                

            }
            count++;
            spaces--;
            
            System.out.println();
        }
    }
}