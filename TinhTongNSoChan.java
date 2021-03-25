package com.company;

import java.util.Scanner;

public class TinhTongNSoChan {
    public int Tong(){
        System.out.println("ban muon tinh tong cua so chan hay le:\n1.chan\n2.le");
        int decide;
        Scanner scanner = new Scanner(System.in);
        decide = scanner.nextInt();
        System.out.println("nhap so n so ban can tinh tong:");
        int n = scanner.nextInt();
        int tong = 0;
        int count = 0;
        if(decide == 1){
            for(int i = 1 ; count < n; i++){
                if(i % 2 == 0) {
                    tong += i;
                    count++;
                }

            }
        }else{
            for(int i = 1; count < n; i++){
                if(i % 2 == 1){
                    tong += i;
                    count++;
                }
            }
        }
        return tong;
    }
}
