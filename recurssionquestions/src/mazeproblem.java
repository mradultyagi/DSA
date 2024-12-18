import java.util.ArrayList;

public class mazeproblem {
    public static void main(String[] args) {
        int steps=count(3,3);
        System.out.println(steps);
        System.out.println(path("",3,3));


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
    static ArrayList path(String p,int r,int c){
        if(r==1&&c==1){
            ArrayList<String> ans=new ArrayList<>();
            ans.add(p);
            return ans;
        }
        ArrayList<String> ans=new ArrayList<>();
        if(r>1){
           ans.addAll( path(p+'D',r-1,c));
        }
        if(c>1){
           ans.addAll( path(p+'R',r,c-1));
        }
        return ans;

    }

}
