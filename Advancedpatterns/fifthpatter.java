public class fifthpatter{
    public static void main(String args[]){
        int n=5;
        int spaces=4;
        
        
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=spaces;j++){
                System.out.print("  ");
            }
            for(int k=i;k>=1;k--){
                
                System.out.print(k+" ");
                
                

            }
            for(int l=1;l<=i;l++){
                if(l>1){
                    System.out.print(l+" ");

                }
                
            }
            
            spaces--;
            
            System.out.println();
        }
    }
}