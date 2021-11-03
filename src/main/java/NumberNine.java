public class NumberNine {
    public String nine(int m){
        String M;
     //   String s = "Good Number";
        if(m % 3 == 0 && (m % 5) == 0)
        M =  "Good Number";
        else if(m % 3 == 0 && (m % 5) != 0)
            M =  "Bad Number";
        else if (m % 3 != 0 && (m % 5) == 0)
            M =  "Poor Number";
        else //if (m % 3 != 0 && (m % 5) != 0)
            M =  "-1";
        return M;
    }
}
