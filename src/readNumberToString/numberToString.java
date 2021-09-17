package readNumberToString;

import java.util.Scanner;

public class numberToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("Tell me your number");
        number = scanner.nextInt();
        String toString = "";
        switch (splitNumber(number)[0]) {
            case 0:
                toString += "";
                break;
            case 1:
                toString += "One Hundred and ";
                break;
            case 2:
                toString += "Two Hundred and ";
                break;
            case 3:
                toString += "Three Hundred and ";
                break;
            case 4:
                toString += "Four Hundred and ";
                break;
            case 5:
                toString += "Five Hundred and ";
                break;
            case 6:
                toString += "Six Hundred and ";
                break;
            case 7:
                toString += "Seven Hundred and ";
                break;
            case 8:
                toString += "Eight Hundred and ";
            case 9:
                toString += "Nine Hundred and ";
                break;
        }
        switch (splitNumber(number)[1]) {
            case 0:
                toString += "";
                break;
            case 1:
                switch (splitNumber(number)[2]) {
                        case 0:
                            toString="Ten";
                            break;
                        case 1:
                            toString = "Eleven";
                            break;
                        case 2:
                            toString = "Twelve";
                            break;
                        case 3:
                            toString = "Thirteen";
                            break;
                        case 4:
                            toString = "Fourteen";
                            break;
                        case 5:
                            toString = "Fifteen";
                            break;
                        case 6:
                            toString = "Sixteen";
                            break;
                        case 7:
                            toString = "Seventeen";
                            break;
                        case 8:
                            toString = "Eighteen";
                            break;
                        case 9:
                            toString = "Nineteen";
                            break;
                    }
                    break;
            case 2:
                toString += "Twenty ";
                break;
            case 3:
                toString += "Thirty ";
                break;
            case 4:
                toString += "Forty ";
                break;
            case 5:
                toString += "Fifty ";
                break;
            case 6:
                toString += "Sixty ";
                break;
            case 7:
                toString += "Seventy ";
                break;
            case 8:
                toString += "Eighty ";
                break;
            case 9:
                toString += "Ninety ";
                break;
        }
        if(splitNumber(number)[1]!=1){
            switch (splitNumber(number)[2]) {
                case 0:
                    toString+="";
                    break;
                case 1:
                    toString+= "One";
                    break;
                case 2:
                    toString+= "Two";
                    break;
                case 3:
                    toString+= "Three";
                    break;
                case 4:
                    toString+= "Four";
                    break;
                case 5:
                    toString+= "Five";
                    break;
                case 6:
                    toString+= "Six";
                    break;
                case 7:
                    toString+= "Seven";
                    break;
                case 8:
                    toString+= "Eight";
                    break;
                case 9:
                    toString+= "Nine";
                    break;
            }
        }

        System.out.println(toString);

    }
    public static int[] splitNumber(int number) {
        int arr[] = new int[3];
        int bigGuy, midGuy, smallGuy;
        bigGuy = 0;
        midGuy = 0;
        smallGuy = 0;
        if (number < 10) {
            bigGuy = 0;
            midGuy = 0;
            smallGuy = number;
        } else {
            if (number < 100) {
                bigGuy = 0;
                midGuy = (number - number % 10) / 10;
                smallGuy = number % 10;
            } else {
                if (number < 1000) {
                    bigGuy = (number - number % 100) / 100;
                    midGuy = (number % 100 - number % 10) / 10;
                    smallGuy = number % 10;
                }
            }
        }
        arr[0] = bigGuy;
        arr[1] = midGuy;
        arr[2] = smallGuy;
        return arr;
    }
}

