package com.bridgelabz;

public class Permutation
{
    private static void permutations(String find, String search) {
        if (search.length() == 0) {
            System.out.println(find);
        }
        for (int i = 0; i < search.length(); i++) {
            String newCandidate = find + search.charAt(i);
            String newRemaining = search.substring(0, i) + search.substring(i + 1);
            permutations(newCandidate, newRemaining);
        }
    }
    public static void main(String[] args) {
        String s = "ABC";
        permutations("", s);
    }
}