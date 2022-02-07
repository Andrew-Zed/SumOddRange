package com.andrew;

public class SumOddRange {

        public boolean isOdd(int number) {
            if(number < 0 || number % 2 == 0){
                System.out.println("isOdd " + number + " " + false);
                return false;
            }
            System.out.println("isOdd " + number + " " + true);
            return true;
        }

        public int sumOdd(int start, int end){
            int sum = 0;

            if(start>0&&end>0&&end>=start){

                for (int i= start; i <= end; i++){

                    if(isOdd(i)){

                        sum = sum + i;

                    }

                }
                System.out.println("Sum of numbers " + sum);
                return sum;
            }

            return -1;
        }


}
