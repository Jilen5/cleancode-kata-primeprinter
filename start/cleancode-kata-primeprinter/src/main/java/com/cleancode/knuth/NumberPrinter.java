package com.cleancode.knuth;

class NumberPrinter {
    private int numberOfNumbers;
    private int[] numbers;

    private int linesPerPage;
    private int columns;

    public NumberPrinter(int numberOfNumbers, int[] numbers, int linesPerPage, int columns) {
        this.numberOfNumbers = numberOfNumbers;
        this.numbers = numbers;
        this.linesPerPage = linesPerPage;
        this.columns = columns;
    }

    public void invoke() {
        int pagenumber = 1;
        int pageoffset = 1;
        int rowoffset;
        int column;
        while (pageoffset <= numberOfNumbers) {
            System.out.print("The First ");
            System.out.print(Integer.toString(numberOfNumbers));
            System.out.print(" Prime Numbers === Page ");
            System.out.print(Integer.toString(pagenumber));
            System.out.println("\n");
            for (rowoffset = pageoffset; rowoffset <= pageoffset + linesPerPage - 1; rowoffset++) {
                for (column = 0; column <= columns - 1; column++)
                    if (rowoffset + column * linesPerPage <= numberOfNumbers)
                        System.out.printf("%10d", numbers[rowoffset + column * linesPerPage]);
                System.out.println();
            }
            System.out.println("\f");
            pagenumber++;
            pageoffset += linesPerPage * columns;

        }
    }
}
