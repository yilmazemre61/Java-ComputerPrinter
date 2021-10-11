package com.company;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if (tonerLevel > -1 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
        this.pagesPrinted = 0;
        this.duplex = duplex;
    }

    public void fillTonerLevel(int tonerAmount) {
        if (tonerAmount > 0 && tonerAmount <= 100) {
            System.out.println("Toner level was " + tonerAmount + "%");
            tonerAmount += (100 - tonerAmount);
            System.out.println("Toner level is now " + tonerAmount + "%");
        } else {
            System.out.println("-1");
        }
    }


    public void duplexPrinter(boolean duplex) {
        if (duplex) {
            System.out.println("It is a Duplex printer.");
        } else {
            System.out.println("It is not a Duplex printer.");
        }
    }


    public int printPages(int pages) {
        int pagesToPrint = pages;
        if (this.duplex) {
            pagesToPrint = (pages / 2) + (pages % 2);
            System.out.println("Printing in duplex mode");
        }
        this.pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }


    public int getPagesPrinted() {
        return pagesPrinted;
    }

}
