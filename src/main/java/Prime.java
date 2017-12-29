/**
 * Created by umesh on 30/11/17.
 */

class GFG {

    static int  remainder(int i,int j){

        int l = i%j;
        if(l==0)
            return 1;

        if(l!=0&&i-1==j)
            return 0 ;
        else
            remainder(i,j+1);
        return 0;
    }
    static    void prime(int i ){
        if(i==100)
            return;
        if(remainder(i,2)==0)
            System.out.println(i);

            prime(++i);
    }
    public static void main (String[] args) {
        System.out.println("GfG!");
        prime(2);
    }
}