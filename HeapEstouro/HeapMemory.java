package HeapEstouro;

import java.util.ArrayList;
import java.util.List;

public class HeapMemory {
    private final List<int[]> memoryHog = new ArrayList<>();
    private final int arraySize;

    public HeapMemory(int arraySize) {
        this.arraySize = arraySize;
    }

    public void startAllocating() {
        try {
            while (true) {
                memoryHog.add(new int[arraySize]);
                System.out.println("Alocado mais um array de " + arraySize + " inteiros");
            }
        } catch (OutOfMemoryError e) {
            System.err.println("Erro de estouro da memória heap!");
            e.printStackTrace();
        }
    }
}
