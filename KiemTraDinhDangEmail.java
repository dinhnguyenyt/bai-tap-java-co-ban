package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class KiemTraDinhDangEmail {
    public void KiemTra(){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String regex = "^\\w+[a-z0-9]*@{1}\\w+mail.com$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        if(matcher.find()){
            System.out.println("hop le");
        }else{
            System.out.println("khong hop le");
        }
    }
}
