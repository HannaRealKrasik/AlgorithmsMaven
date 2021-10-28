public class NumberFor {
    public int Numberfor(int n){
        int res = 1;

        if(n>1){
        for (int i = 2; i <= n; i++)
            res += i;
        }
        else
            for (int i = n; i <= 0; i++)
            res +=Math.abs(i);
        return res;
    }
}
