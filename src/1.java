/*
    Java Program to Multiply two Floating Point Numbers (Numbers must be taken as
    command line arguments).
*/

class cmd {

    public static void usage(){
        System.out.println("Usage: \n\tcommand [no1] [no2]\nno1 - number 1\nno2 - number2\n");
    }
    public static void main(String[] args) {
        double d1,d2;
        if(args.length != 2){
            usage();
            System.exit(1); //failure
        }
        try{
            d1 = Double.parseDouble(args[0]);
            d2 = Double.parseDouble(args[1]);

            double ans = d1*d2;
            System.out.println("Result: "+ ans);
        }
        catch(Exception e){
            System.out.println("Please enter valid values.\n");
            usage();
            System.exit(1); //failure
        }
        System.exit(0);
    }
}