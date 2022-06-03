public class ExceptionFraction {
    public void fractionNumber(){
        int a= 0;
        int n= 20;
        try{
            int fraction = n/a ;
        }
        catch(ArithmeticException e) {
            System.out.println(" Catch block due to exception =" + e);
        }
        }
        public static void main(String [] args){
        ExceptionFraction fra = new ExceptionFraction();
        fra.fractionNumber();
    }
}

