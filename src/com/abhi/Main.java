package com.abhi;

public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer (50,true);
        System.out.println("initial page count=" +printer.getPagesprinted());
        int pagesprinted = printer.printpages(4);
        System.out.println("pages printed was " + pagesprinted + " new total print count for printer = " + printer.getPagesprinted());
        pagesprinted = printer.printpages(2);
        System.out.println("pages printed was " + pagesprinted + " new total print count for printer = " + printer.getPagesprinted());
    }
}
