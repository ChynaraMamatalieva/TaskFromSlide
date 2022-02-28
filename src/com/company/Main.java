package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       Scanner scanner  = new Scanner(System.in);
       String input = scanner.nextLine();

        switch (WeekDays.valueOf(input.toUpperCase(Locale.ROOT))){
            case DUISHOMBU -> System.out.println("Duishombu kunu Java okuim");
            case SHEISHEMBI -> System.out.println("Sheishembi kunu anglis tilin okuim");
            case SHARSHEMBI -> System.out.println("Sharshembi kunu Java okuim");
            case BEISHEMBI -> System.out.println("Soft skills sabagyn okuim");
            case JUMA -> System.out.println("Juma kunu Java sabagyn kouim");
            case ISHEMBI -> System.out.println("Ishembi kunu okton temalardy kaitalaim");
            case JEKSHEMBI -> System.out.println("Jekshembi kunu es alam");
        }

    }
}
