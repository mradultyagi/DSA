public class pattern {
    public static void main(String[] args) {
        int n=4;
        for (int i = 0; i <=2*n; i++) {
            if(i<=n) {
                for (int j = 0; j <= i; j++) {
                    System.out.print("*" + " ");

                }
            }
            else{
                for (int j = 0; j <2*n-i+1; j++) {
                    System.out.print("*"+" ");
                }
            }
            System.out.println();

        }
    }
}
