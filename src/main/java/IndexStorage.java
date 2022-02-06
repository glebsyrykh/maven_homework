public class IndexStorage {
    protected int size;

    public IndexStorage(int size) {
        this.size = size;
    }

    public int size() {
        return this.size;
    }

    public int get(int index) {
        return (index % 2 == 0 ? index : -index);
    }

    public int[] reverse() {
        int[] arr = new int[size];
        for (int i = 0; i < size / 2; i++) {
            int x = get(i);
            arr[i] = get(size - i - 1);
            arr[arr.length - i - 1] = x;
        }
        //центральный элемент, если размер массива нечетный
        if (size % 2 != 0) {
            arr[size / 2] = get(size / 2);
        }
        return arr;
    }
}
