public class majorityelement {
    public static int majorelement(int[]arr,int si,int ei){
        if(si>=ei){
            return arr[si];
        }
        int mid=si+(ei-si)/2;
        int left =majorelement(arr,si,mid); //left part
        int right=majorelement(arr,mid+1,ei); //right part
        if(left==right){
            return left;
        }
        int leftcount=count(arr,left,si,ei);
        int rightcount=count(arr,right,si,ei);
        return leftcount>rightcount?left:right;

    }
    public static int count(int[]arr,int k,int si,int ei){
        int count=0;
        for(int i=si;i<=ei;i++){
            if(arr[i]==k){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[]arr={2,2,1,1,1,2,2};
        System.out.println(majorelement(arr,0,arr.length-1));
    }
}
