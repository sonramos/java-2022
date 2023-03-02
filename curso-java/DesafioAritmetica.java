public class DesafioAritmetica {
    public static void main(String[] args) {
        double a, b, numerator, division;

        a = (Math.pow((6*(3+2)),2))/(3*2);
        b = Math.pow(((1-5)*(2-7)/2),2);
        numerator = Math.pow((a-b),3);
        division = numerator/Math.pow(10,3);

        System.out.println("The division results in: "+division);
    }
}
