package com.company;

public class TongSoNSoNT {
    public boolean laSoNT(int n){
        for(int i = 2; (double)i <= Math.sqrt((double)n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    public int Tong(int n) {
        int dem = 0;
        int tong = 0;
        int x = 2;
        while (dem < n) {
            if (laSoNT(x)) {
                System.out.println(x);
                tong += x;
                dem++;
            }
            x++;
        }
        return tong;
    }
}
