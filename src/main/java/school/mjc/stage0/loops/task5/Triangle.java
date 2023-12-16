package school.mjc.stage0.loops.task5;

public class Triangle {
    public void printTriangle(int cathetusLength) {
        for (int x = 0; x < cathetusLength; x++) {
            for (int y = 0; y <= x; y++) {
                System.out.print("8");
            }
            System.out.println();
        }
    }
}