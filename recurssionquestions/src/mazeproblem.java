public class mazeproblem {
    public static void main(String[] args) {
//        int steps=count(3,3);
//        System.out.println(steps);
        path("",3,3);

    }
//    static int count(int r, int c){
//        if(r==1||c==1){
//            return 1;
//        }
//        int left=count(r-1,c);
//        int right=count(r,c-1);
//        int ans =left+right;
//        return ans;
//    }
    static void path(String p,int r,int c){
        if(r==1&&c==1){
            System.out.println(p);
            return;
        }
        if(r>1){
            path(p+'D',r-1,c);
        }
        if(c>1){
            path(p+'R',r,c-1);
        }

    }

}
