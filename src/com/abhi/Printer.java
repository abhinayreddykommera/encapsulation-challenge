package com.abhi;

/**
 * Created by abhinayreddy on 6/20/2017.
 */
public class Printer {
    private int tonerLevel;
    private int pagesprinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if(tonerLevel >-1 && tonerLevel<=100){
            this.tonerLevel = tonerLevel;
        }else{
            this.tonerLevel=-1;
        }
        this.duplex = duplex;
        this.pagesprinted=0;
    }
    public int addtoner(int toneramount){
        if(tonerLevel>0 && tonerLevel<=100){
            if(this.tonerLevel +toneramount>=100){
                return -1;
            }
            this.tonerLevel += toneramount;
            return this.tonerLevel;
        }
        else{
            return -1;
        }
    }
    public int printpages(int pages){
        int pagestoprint=pages;
        if(this.duplex){
            pagestoprint /=2;
            System.out.println("printing in duplex mode");
        }
        this.pagesprinted += pagestoprint;
        return pagestoprint;
    }
    public int getPagesprinted(){
        return pagesprinted;
    }

}

