public class Printer {

    private int tonerLevel, pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = ((tonerLevel > -1) && (tonerLevel <= 100)) ? tonerLevel : -1;
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    public int addToner(int tonerAmount) {
        if ((tonerAmount > 0) && (tonerAmount <= 100)) {
            if (tonerAmount + tonerLevel <=  100) {
                tonerLevel += tonerAmount;
                return tonerLevel;
            } else {
                return -1;
            }
        } else {
            return -1;
        }
    }

    public int printPages(int pages) {
        int pagesToPrint;
        if (duplex) {
            pagesToPrint = pages % 2 == 0 ? (pages / 2) : (pages / 2) + 1;
        } else {
            pagesToPrint = pages;
        }
        this.pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getPagesPrinted() {
        return this.pagesPrinted;
    }

}
