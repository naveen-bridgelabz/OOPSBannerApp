package org.example;

public class BannerLogicFunction {

    public static void main(String[] args) {

        // Get patterns using helper methods
        String[] o1 = getOPattern();
        String[] o2 = getOPattern();
        String[] p  = getPPattern();
        String[] s  = getSPattern();

        // Assemble OOPS banner line by line
        String[] oopsBanner = new String[7];
        for (int i = 0; i < 7; i++) {
            oopsBanner[i] = String.join(" ", o1[i], o2[i], p[i], s[i]);
        }

        // Print banner using enhanced for loop
        for (String line : oopsBanner) {
            System.out.println(line);
        }
    }

    // method for O
    private static String[] getOPattern() {
        return new String[] {
                " OOOOOOO ",
                " O     O ",
                " O     O ",
                " O     O ",
                " O     O ",
                " O     O ",
                " OOOOOOO "
        };
    }

    // method for P
    private static String[] getPPattern() {
        return new String[] {
                " PPPPPPP ",
                " P     P ",
                " P     P ",
                " PPPPPPP ",
                " P       ",
                " P       ",
                " P       "
        };
    }

    // method for S
    private static String[] getSPattern() {
        return new String[] {
                " SSSSSSS ",
                " S       ",
                " S       ",
                " SSSSSSS ",
                "       S ",
                "       S ",
                " SSSSSSS "
        };
    }
}
