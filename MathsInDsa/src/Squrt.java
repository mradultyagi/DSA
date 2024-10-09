public class Squrt {
    public static void main(String[] args) {
        int n=40;
        int p=3;
        System.out.println(sqrt(n,p));

    }
    static double sqrt (int n,int p){
        int start=0;
        int end=n;
        double root= 0.0;
        while(start<=end) {
            int m=start+(end-start)/2;
            if(m*m ==n){
                return m;
            }
            if(m*m >n){
                end=m-1;
            }
            start=m+1;

        }
        double incr=.1;
        for (int i = 0; i < p; i++) {
            while(root*root <=n){
                root+=incr;

            }
            root-=incr;
            incr/=10;

        }
        return root;

    }
}
