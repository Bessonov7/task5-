package ru.vsu.sc.bessonov;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {

        int n;

        Scanner in = new Scanner(System.in);
        n = readInt(in);
        draw(n);
    }
    public static int readInt(Scanner sc) {
        while (true) {
            try {
                String s = sc.nextLine();
                return Integer.parseInt(s);
            } catch (Exception e) {
                System.out.println("Введите целочисленное значение ");
            }
        }
    }
    public static void draw(int x){
        for (int i = 0, k = 0; i < x; i++){
            if (k == 0 && i == 0){
                for (int j = 0; j < x / 2 + 1; j++){
                    System.out.print('#');
                }
            }else for (int j = k / 2; j < x / 2; j++){
                if(i <= x /2) {
                    System.out.print('#');
                }else System.out.print('*');
            }

            for (int z = 0; z < k; z++){
                System.out.print(' ');
            }
            for (int s = k / 2; s < x / 2; s++){
                if(i < x /2) {
                    System.out.print('*');
                }else System.out.print('#');
            }
            if (i == x - 1){
                System.out.print('#');
            }
            System.out.println();
            if (k == 0){
                k++;
            }else if (i < (x / 2)){
                k += 2;
            }else k -= 2;
        }
    }
}

