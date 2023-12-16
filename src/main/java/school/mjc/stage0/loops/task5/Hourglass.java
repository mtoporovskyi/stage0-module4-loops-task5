package school.mjc.stage0.loops.task5;

  public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        decreaseNumber(height);
        increaseNumber(height);
    }

     private void decreaseNumber(int height) {
         int space = 0;

         for (int x = height; x > 0; x-=2) {
             printDecreasedSpace(space);
             for (int y = x; y > 0; y--) {
                 System.out.print("8");
             }
             printDecreasedSpace(space);
             System.out.println();
             space++;
         }
     }

     private void printDecreasedSpace(int space) {
         for (int ySpace = 0; ySpace < space; ySpace++) {
             System.out.print(" ");
         }
     }

     private void increaseNumber(int height) {
        int firstValue = height % 2 == 0 ? 0 : 1;
        int space = height / 2;

         for (int x = firstValue; x <= height; x+=2) {
             printIncreasedSpace(space, x);

             for (int y = 0; y < x; y++) {
                 if (x != 1) {
                     System.out.print("8");
                 }
             }
             printIncreasedSpace(space, x);

             space--;
             if (x != 0 && x != 1) {
                 System.out.println();
             }
         }
     }

     private void printIncreasedSpace(int space, int x) {
         for (int ySpace = space; ySpace > 0; ySpace--) {
             if (x != 0 && x != 1) {
                 System.out.print(" ");
             }
         }
     }
}