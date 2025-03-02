package day01_commit_push_pull;

public class Table {
    public static void main(String[] args) {
        multiplicationTable(3);
        multiplicationTable(4);
    }
    /*
    Method: multiplicationTable
    Param: num
    Return: void
    Prints multiplication table for the number
     */
    public static void multiplicationTable(int num){
        for(int i = 1; i <= 12; i++){
            System.out.println(num + " * " + i + " = " + (num * i));
        }
        System.out.println("----------------------");
    }

  /*
    Overloaded Method: multiplicationTable
    Return: void
    prints multiplication table for the numbers 1 - 9
     */

    public static void multiplicationTable(){
        for(int i = 1; i <= 10; i++){
                multiplicationTable(i);
                System.out.println("-------------------------------");
            }
        }
    }

