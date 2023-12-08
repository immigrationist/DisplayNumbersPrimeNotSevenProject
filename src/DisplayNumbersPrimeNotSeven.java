public class DisplayNumbersPrimeNotSeven {

    public static int readNumber()throws Exception{
        int number = 0;
        char digitAsciiCode = '0';
        int value = 0;

        digitAsciiCode = (char)System.in.read();
        while(digitAsciiCode != '\n'){
            value = digitAsciiCode - '0';
            number = number * 10 + value;
            digitAsciiCode = (char)System.in.read();
        }
        return number;
    }
    public static boolean isNumberPrime(int number){
        boolean isPrime = true;
        int count = 2;

        while(count < number && isPrime == true){
            if(number % count == 0)
                isPrime = false;
            count = count + 1;
        }

        return isPrime;
    }

    public static boolean isDigitSeven(int number){


        if(number % 10 == 7)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        int number = 0;
        boolean isPrime;
        boolean isEndSeven;
        int count = 1;

        try{

                System.out.println("Enter number");
                number = readNumber();

                count = 1;
            while(count < number) {
                isPrime = isNumberPrime(count);
                isEndSeven = isDigitSeven(count);

                if (isPrime == true && isEndSeven == false)
                    System.out.println(count);

                count = count + 1;
            }
        }
        catch(Exception e){
            System.out.println("Keyboard malfunctioned");
        }
    }
}
