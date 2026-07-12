

public class Dpattern {
    public static void main(String[] args) {
        /*  pattern 1
        int n = 5;
        for(int i=0;i<n;i++){
            for(int j=0; j<n; j++){
                System.out.print("#");
            }
             System.out.println();
        } */


        /*pattern 2 
        int n = 5;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i; j++){
                System.out.print("#");
            }
            System.out.println();
        }*/

        /*pattern 3 
        int n = 5;
        for(int i=1;i<n;i++){
            for(int j=1; j<i; j++){
                System.out.print(j);
            }
            System.out.println();
        } */
        

        /* pattern 4
        int n = 5;
        for(int i=0;i<=n;i++){
            for(int j=0; j<=i; j++){
                System.out.print(i);
            }
            System.out.println();
    }*/

        /* pattern 5
        int n = 5;
        for (int i=1; i<=n; i++){
            for(int j=0; j<n-i+1;j++){
                System.out.print("#");
            }
            System.out.println();
        }*/

        /* pattern 6
        int n = 5;
        for (int i=1; i<=n; i++){
            for(int j=0; j<=n-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }*/


        /* pattern 7
        int n = 5;
        for(int i=0; i<=n; i++){
            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }
            for(int j=0; j<2*i+1; j++){
                System.out.print("#");
            }
            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }
            System.out.println();
        }*/

        /* pattern 8
        int n = 5;
        for(int i=0; i<=n; i++){
            for(int j=0; j<i; j++){
                System.out.print(" ");
            }
            for(int j=0; j< 2*n-(2*i+1); j++){
                System.out.print("#");
            }
            for(int j=0; j<i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }*/


        /*pattern 9 
        int n = 5;
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }
            for(int j=0; j<2*i+1; j++){
                System.out.print("#");
            }
            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<i; j++){
                System.out.print(" ");
            }
            for(int j=0; j< 2*n-(2*i+1); j++){
                System.out.print("#");
            }
            for(int j=0; j<i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }*/

        /*pattern 10 
        int n=5;
        for(int i=1;i<=2*n-1;i++){
            int s=i;
            if(i>n) s=2*n-i;
            for(int j=1;j<=s;j++){
                System.out.print("#");
            }
            System.out.println();
        }*/
        

        int n = 5;
        int s = 1;
        for(int i=0;i<n;i++){
            if(i%2==0) s = 1;
            else s = 0;
            for(int j=0; j<i;j++){
                System.out.print(s);
                s=s-1;
            }
           System.out.println(); 
        }
    }
}
