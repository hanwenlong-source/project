package com.example.test;

public class SubChinese {

    public static void main(String[] args) {

        System.out.println(getStringByLength("阳光碧", 12));

    }

    public static String getStringByLength(String inputString, Integer needLength) {

        String string = "";

        for(int a=0 ; a<needLength ; a++)
            inputString+=" ";

        int i = 0;

        int j = 0;

        while (true) {

            if(i == inputString.length()){

                return string;

            }

            String ch = String.valueOf(inputString.charAt(i));

            if (ch.getBytes().length > 1) {
                j += 2;
            } else {
                j++;
            }
            string +=ch;

            if (j == needLength ) {
                return string;
            }

            if(j>needLength){
                return string.substring(0,string.length()-1)+" ";
            }

            i++;

        }


    }

}



