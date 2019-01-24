package com.Tugas;

public class bujurSangkar {
    public static void main(String[] args) {
        Keliling K = new Keliling();
        K.BujurSangkar();

    }

    public static class Keliling {
        int sisi = 4;
        int hasil = 4 * sisi;

        public void BujurSangkar() {
            System.out.println("Keliling = " + hasil);

        }
    }
}
