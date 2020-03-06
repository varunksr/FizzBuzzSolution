public class FizzBuzzSolution {

    public static void main(String[] args) {
        for(int i=0;i<100;i++){
            String result = FizzBuzzSolution.checkFizzBuzz(i);
            if( result != null){
                System.out.println(result);
            }else {
                System.out.println(i);
            }
        }
    }

    public static String checkFizzBuzz(int num){
        if((num % 3 == 0 || FizzBuzzSolution.hasThreeInNumber(num)) &&
                (num % 5 == 0 || FizzBuzzSolution.hasFiveInNumber(num))){
            return "FizzBuzz";
        }else if(num % 3 == 0 || FizzBuzzSolution.hasThreeInNumber(num)){
           return "Fizz";
        }else if(num % 5 == 0 || FizzBuzzSolution.hasFiveInNumber(num)){
            return "Buzz";
        }else {
            return null;
        }
    }

    public static boolean hasThreeInNumber(int num){
        boolean isThreePresent = false;
        int rem = 0;
        int temp = num;
        while(temp != 0){
            rem = temp % 10;
            if(rem == 3){
                isThreePresent = true;
                break;
            }
            temp = temp / 10;
        }
        return isThreePresent;
    }

    public static boolean hasFiveInNumber(int num){
        boolean isFivePresent = false;
        int rem = 0;
        int temp = num;
        while(temp != 0){
            rem = temp % 10;
            if(rem == 5){
                isFivePresent = true;
                break;
            }
            temp = temp / 10;
        }
        return isFivePresent;
    }
}
