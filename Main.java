package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        XuatNhapFile file = new XuatNhapFile();
        file.read();
        file.write();
    }
}
