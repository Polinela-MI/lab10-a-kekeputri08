abstract class Calculator {
    String number1;
    String number2;

    public Calculator(String number1, String number2){
        this.number1 = number1;
        this.number2 = number2;
    }

    public void setNumber1(String number1) {
        this.number1 = number1;
    }

    public void setNumber2(String number2) {
        this.number2 = number2;
    }

    public String getNumber1() {
        return number1;
    }

    public String getNumber2() {
        return number2;
    }

    abstract String add();
    abstract String substract();
}



