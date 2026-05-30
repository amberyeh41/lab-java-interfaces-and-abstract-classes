public interface IntList{
    void add(int number);
    int  get(int id) throws Exception;
}
public class IntArrayList implements IntList{
    private int[] nums;
    private int capacity = 10;
    private int elements = 0;

    public IntArrayList() {
        this.nums = new int[capacity];
    }

    @Override
    public void add(int number) {
        if (elements == capacity) {
            int new_capacity = (int) Math.floor(capacity * 1.5);
            int[] new_nums = new int[new_capacity];
            for(int i = 0; i < elements; ++i) {
                new_nums[i] = nums[i];
            }
            this.nums = new_nums;
            this.capacity = new_capacity;
        }
        this.nums[elements] = number;
        this.elements++;
    }

    @Override
    public int get(int id) throws Exception {
        if (id < elements) {
            return nums[id];
        }
        throw new Exception("not enough elements");
    }
}


public class IntVector implements IntList{
    private int[] nums;
    private int capacity = 20;
    private int elements = 0;

    public IntVector() {
        this.nums = new int[capacity];
    }

    @Override
    public void add(int number) {
        if (elements == capacity) {
            int new_capacity = capacity * 2;
            int[] new_nums = new int[new_capacity];
            for(int i = 0; i < elements; ++i) {
                new_nums[i] = nums[i];
            }
            this.nums = new_nums;
            this.capacity = new_capacity;
        }
        this.nums[elements] = number;
        this.elements++;
    }

    @Override
    public int get(int id) throws Exception {
        if (id < elements) {
            return nums[id];
        }
        throw new Exception("not enough elements");
    }

}





void main() {
    IntList my_list = new IntArrayList();
    for (int i = 0; i < 14; ++i) {
        my_list.add(i);
    }
    try {
        int elem = my_list.get(13);
        System.out.println(elem);
    } catch (Exception e) {
        throw new RuntimeException(e);
    }

    my_list = new IntVector();
    for (int i = 0; i < 14; ++i) {
        my_list.add(i);
    }
    try {
        int elem = my_list.get(13);
        System.out.println(elem);
    } catch (Exception e) {
        throw new RuntimeException(e);
    }
}