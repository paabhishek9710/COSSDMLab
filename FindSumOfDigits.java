class FindSumOfDigits{
    public static void main(String[] args) {
        int num = 12345;
        System.out.println("The selected number to find the sum of it's digits is:"+num);

        int ans = 0;

        //While loop to calculate the sum of num
        while(num>0){
            ans = ans + num%10;
            num /= 10;
        }

        System.out.println("The sum of digits of number is:"+ans);
    }
}