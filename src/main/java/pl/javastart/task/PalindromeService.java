package pl.javastart.task;

import java.util.Arrays;

public class PalindromeService {

    // nie zmieniaj sygnatury tej metody. Jest ona testowana w PalindromeServiceTest
    public boolean isPalindrome(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            if (array[i] == array[array.length - 1 - i]) {
                return true;
            }
        }
        return false;
    }
}
