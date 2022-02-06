public class ArrayIndexStorage extends IndexStorage {
    protected int[] arr;

    public ArrayIndexStorage(int[] arr) {
        super(arr.length);
        this.arr = arr;
    }

    @Override
    public int get(int index) {
        return this.arr[index];
    }
}
