public class Decimal extends Calculator{

    public Decimal(String number1, String number2) {
        super(number1, number2);
    }

    @Override
    String add() {
       int digit3_n1 = Integer.parseInt(String.valueOf( number1.charAt(2)));
       int digit3_n2 = Integer.parseInt(String.valueOf( number2.charAt(2)));
       int result3 = (digit3_n1 + digit3_n2) % 10;
       int carry3 = (digit3_n1 + digit3_n2) /10;

        int digit2_n1 = Integer.parseInt(String.valueOf( number1.charAt(1)));
        int digit2_n2 = Integer.parseInt(String.valueOf( number2.charAt(1)));
        int result2 = (digit2_n1 + digit2_n2 + carry3) % 10;
        int carry2 = (digit2_n1 + digit2_n2 + carry3) /10;

        int digit1_n1 = Integer.parseInt(String.valueOf( number1.charAt(0)));
        int digit1_n2 = Integer.parseInt(String.valueOf( number2.charAt(0)));
        int result1 = (digit1_n1 + digit1_n2 + carry2 );

        return String.valueOf(result1)+String.valueOf(result2) + String.valueOf(result3);

    }

    @Override
    String substract() {
        



        return null;
    }
}
