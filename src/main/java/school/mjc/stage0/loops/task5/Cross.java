package school.mjc.stage0.loops.task5;

 public class Cross {
    public void printCross(int sideLength) {
        int halfLength = Math.round((float) sideLength / 2);

        for (int x = 0; x < sideLength; x++) {
            for (int y = 0; y < sideLength; y++) {
                if (x == halfLength - 1 || y == halfLength - 1) {
                    System.out.print('8');
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}