warning: LF will be replaced by CRLF in src/main/java/com/mycompany/sortingalgorithms/SortingAlgorithms.java.
The file will have its original line endings in your working directory
[1mdiff --git a/src/main/java/classes/QuickSort.java b/src/main/java/classes/QuickSort.java[m
[1mindex 8e41820..1a448f3 100644[m
[1m--- a/src/main/java/classes/QuickSort.java[m
[1m+++ b/src/main/java/classes/QuickSort.java[m
[36m@@ -25,10 +25,19 @@[m [mpublic class QuickSort {[m
   [m
     private static Random random = new Random();[m
 [m
[31m-    public void quickSort(int[] arr, int s, int n, int k) {[m
[32m+[m[32m    public void ordenaQuickSort(int[] arr, int n, int m, int k){[m
[32m+[m[32m        this.quickSort(arr, 0, n-1, k, m);[m
[32m+[m[32m    }[m
[32m+[m[41m    [m
[32m+[m[32m    public void quickSort(int[] arr, int s, int n, int k, int m) {[m
         if (s >= n) {[m
           return;[m
         }[m
[32m+[m[41m        [m
[32m+[m[32m        if(n-s <= m){[m
[32m+[m[32m            this.insertionSort(arr, s, n);[m
[32m+[m[32m        }[m
[32m+[m[41m        [m
         int pivotIndex = 0;[m
         switch(k){[m
             case 0:[m
[36m@@ -62,8 +71,8 @@[m [mpublic class QuickSort {[m
                 j--;[m
             }[m
         }[m
[31m-        quickSort(arr, s, j, k);[m
[31m-        quickSort(arr, i, n, k);[m
[32m+[m[32m        quickSort(arr, s, j, k, m);[m
[32m+[m[32m        quickSort(arr, i, n, k, m);[m
       }[m
 [m
     private void swap(int[] arr, int i, int j) {[m
[36m@@ -80,4 +89,22 @@[m [mpublic class QuickSort {[m
         }[m
         return c;[m
     }[m
[32m+[m[41m    [m
[32m+[m[32m    public static void insertionSort(int[] arr, int s, int n) {[m
[32m+[m[32m        if (arr == null || arr.length == 0 || s >= n || s < 0 || n >= arr.length) {[m
[32m+[m[32m            return;[m
[32m+[m[32m        }[m
[32m+[m
[32m+[m[32m        for (int i = s + 1; i <= n; i++) {[m
[32m+[m[32m            int key = arr[i];[m
[32m+[m[32m            int j = i - 1;[m
[32m+[m
[32m+[m[32m            while (j >= s && arr[j] > key) {[m
[32m+[m[32m                arr[j + 1] = arr[j];[m
[32m+[m[32m                j--;[m
[32m+[m[32m            }[m
[32m+[m
[32m+[m[32m            arr[j + 1] = key;[m
[32m+[m[32m        }[m
[32m+[m[32m    }[m
 }[m
[1mdiff --git a/src/main/java/com/mycompany/sortingalgorithms/SortingAlgorithms.java b/src/main/java/com/mycompany/sortingalgorithms/SortingAlgorithms.java[m
[1mindex aec5005..5e3bd8b 100644[m
[1m--- a/src/main/java/com/mycompany/sortingalgorithms/SortingAlgorithms.java[m
[1m+++ b/src/main/java/com/mycompany/sortingalgorithms/SortingAlgorithms.java[m
[36m@@ -4,6 +4,8 @@[m
 [m
 package com.mycompany.sortingalgorithms;[m
 [m
[32m+[m[32mimport classes.QuickSort;[m
[32m+[m
 /**[m
  *[m
  * @author cauaa[m
[36m@@ -11,6 +13,16 @@[m [mpackage com.mycompany.sortingalgorithms;[m
 public class SortingAlgorithms {[m
 [m
     public static void main(String[] args) {[m
[31m-        System.out.println("Hello World!");[m
[32m+[m[32m        int[] arr = {80, 40, 20, 40, 0, 30};[m
[32m+[m[41m        [m
[32m+[m[32m        QuickSort qs = new QuickSort();[m
[32m+[m[41m        [m
[32m+[m[32m        qs.ordenaQuickSort(arr, 6, 3,2);[m
[32m+[m[41m        [m
[32m+[m[32m        for(int i = 0; i < arr.length; i++){[m
[32m+[m[32m            System.out.println(arr[i]);[m
[32m+[m[32m        }[m
[32m+[m[41m        [m
     }[m
[32m+[m[41m    [m
 }[m
