package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
    // 1. How Much is True?
    public static int countTrue(boolean[] arr) {
        int length = arr.length;
        int count = 0;
        while(length>0){
            if(arr[length-1]) count++;
            length--;
        }
        return count;
    }
    // 2. Triangular Number Sequence
    public static int triangle(int n) {
        return (n*(n+1))/2;
    }
}
