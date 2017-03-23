package com.company;

public class SimpleDotComTest {
     static SimpleDotCom dot =  new SimpleDotCom();

    public static void main(String[] args) {
        before_test();
        test_succsse();
        error();
        //chek();
    }

    private static void error() {
        String userGuess = "23";
        String result = dot.checkYourself( userGuess );
        String testResult = null;

        chek("Мимо",result);
    }

    private static void before_test(){
       // SimpleDotCom dot = new SimpleDotCom();
        int[] locations = {2,3,4,};
        dot.setLocationCells(locations);
    }

    private static void test_succsse() {
        String userGuess = "2";
        String result = dot.checkYourself( userGuess );
        chek("Попал",result);

        //chek(result);
    }

    private static void chek(String validResult,String RealResult) {
        String testResult;
        if (validResult.equals(RealResult)) {
            testResult = "Тест пройден";
        } else {
            testResult = "Тест не пройден";
        }
        System.out.println(testResult);
    }


}
