package HeapEstouro;

public class Main {
    public static void main(String[] args) {
        int arraySize = 1_000_000; // 1 milhão de inteiros (~4 MB por array)
        HeapMemory loader = new HeapMemory(arraySize);
        loader.startAllocating();
    }
}
