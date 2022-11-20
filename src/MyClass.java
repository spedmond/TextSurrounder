public class MyClass {
    public static void main(String[] args) {
        String example1 = "This is the first line!\nThis is the second Line!\n";
        String example2 = "A world of dew,\nAnd within every dewdrop\nA world of struggle.\n";
        String example3 = "A dozen, a gross, and a score\nPlus three times the square root of four\nDivided by seven\nPlus five times eleven\nIs nine squared and not a bit more.\n";

        textSurrounder(example1,"*");
        textSurrounder(example2,"+");
        textSurrounder(example3,"=");

    }
    public static void textSurrounder(String str,String s)
    {
        for (int i=1;i<=str.indexOf("\n")+2;i++) {
            System.out.print(s);
        }
        System.out.println();

        String last = "";
        while (str.contains("\n")) {
            String temp = str.substring(0, str.indexOf("\n"));
            if (str.substring(str.indexOf("\n") + 1).contains("\n")) {
                last = str.substring(str.indexOf("\n") + 1);
            }
            str = str.substring(str.indexOf("\n") + 1);
            System.out.println(s + temp + s);
        }

        for (int i=1;i<=last.length()+1;i++) {
            System.out.print(s);
        }
        System.out.println();
    }
}