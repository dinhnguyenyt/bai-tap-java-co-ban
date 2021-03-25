package com.company;

public class SoLanXuatHienKiTu {
    public int Number(char a, String n){
        char[] str = n.toCharArray();
        int dem = 0;
        for(int i = 0; i < n.length(); i++){
            if(str[i] == a) dem++;
        }
        return dem;
    }
}
