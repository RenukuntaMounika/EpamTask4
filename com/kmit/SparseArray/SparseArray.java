package com.kmit.SparseArray;

import java.util.*;

public class SparseArray {

    // Complete the matchingStrings function below.
    static int[] matchingStrings(String[] strings, String[] queries) {
        HashMap<String,Integer> h=new HashMap<>();
        for(int i=0;i<strings.length;i++)
        {
            if(h.containsKey(strings[i]))
                h.put(strings[i],h.get(strings[i])+1);
            else
                h.put(strings[i],1);
        }
        int a[]=new int[queries.length];
        for(int i=0;i<queries.length;i++)
        {
            String temp=queries[i];
            if(h.containsKey(temp))
                a[i]=h.get(temp);
            else
                a[i]=0;
        }
        return a;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)  {

        int stringsCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] strings = new String[stringsCount];

        for (int i = 0; i < stringsCount; i++) {
            String stringsItem = scanner.nextLine();
            strings[i] = stringsItem;
        }

        int queriesCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] queries = new String[queriesCount];

        for (int i = 0; i < queriesCount; i++) {
            String queriesItem = scanner.nextLine();
            queries[i] = queriesItem;
        }

        int[] res = matchingStrings(strings, queries);

        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);

            if (i != res.length - 1) {
                System.out.println("\n");
            }
        }
        scanner.close();
    }
}
