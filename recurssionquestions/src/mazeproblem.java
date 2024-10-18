public class mazeproblem {
    public static void main(String[] args) {
        int steps=count(3,3);
        System.out.println(steps);

    }
    static int count(int r, int c){
        if(r==1||c==1){
            return 1;
        }
        int left=count(r-1,c);
        int right=count(r,c-1);
        int ans =left+right;
        return ans;
    }

}
