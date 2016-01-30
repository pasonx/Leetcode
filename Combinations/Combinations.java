//method 1
public class Solution {
    List<List<Integer>> list = new ArrayList<List<Integer>>();
    List<Integer> list1 = new ArrayList<Integer>();
    int cnt;
    //bigin is important here,n represent the avaiable integers for you to choose from

    public void dfs(int level, int begin, int n){
        if (level == cnt)
        {
            list.add(new ArrayList<Integer>(list1));
            return;
        }
        for (int i = begin; i <= n; ++i){
            list1.add(i);
            dfs(level+1,i+1,n);
            list1.remove(list1.size()-1);
        }
    }
    public List<List<Integer>> combine(int n, int k) {
        // write your code here
        //set the global variable cnt to mark the amont
        //or we can call like this:
        //dfs(0,1,n,k)
        cnt = k;
        //when we have k integers to combine,in general
        //conditions we let the parameter begin from 0
        //when the depth(var:level) reach to k return
        //in the below dfs() function,1 means the begin
        dfs(0,1,n);
        return list;
    }
}
//Method 2
public class Solution {
    /*Using array to implement it*/
    public int key;
    public static final int N = 1000000;
    List<List<Integer>> list = new ArrayList<List<Integer>>();
    int[] ans =new int[N];

    //This method maybe a little bit difficult than the above
    //For every element,we can choose use it or not
    public void dfs(int level, int l,int r, int k)
    {
        //This place is a key point to finish the recursion 
        if (r - l + 1 < k)
            return;
        //when we've already chosen k integers
        if (k == 0)
        {
     /*This point is also a key,we need to reallocate the memory space*/
            List<Integer> list1 = new ArrayList<Integer>();
            for (int i = 0; i < key; ++i)
                list1.add(ans[i]);
            list.add(list1);
            return;
        }
        ans[level] = l;
        //use the current element
        dfs(level+1,l+1,r,k-1);
        ans[level] = 0;
        //not using
        dfs(level,l+1,r,k);
    }
    public List<List<Integer>> combine(int n, int k) {
        // write your code here
        key = k;
        dfs(0,1,n,k);
        return list;
    }
}
