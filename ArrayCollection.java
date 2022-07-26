public class ArrayCollection {
    private Object[] elementData;
    private int size;

    public ArrayCollection(int n) {
        this.elementData = new Object[n];
        this.size = 0;
    }

    public int size() {
        return this.size;
    }

    public void add(Object d) {
        this.elementData[size] = d;
        this.size++;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public boolean contains(Object obj) {
        return search(obj) != -1;
    }

    public int search(Object b) {
        for (int i = 0; i < size; i++) {
            if (elementData[i].equals(b)){
                return i;
            }
        }
        return -1;
    }

    public String toString() {
        String ans = "";
        for (int i = 0; i < size; i++) {

            ans = ans + elementData[i] + ", ";

        }
        return ans;
    }

    public void remove(Object b) {
        int n = search(b);
        if (n == -1) {
            System.out.print("hello, hi, bye");
        } else {
            for (int i = n + 1; i < size; i++) {
                elementData[i - 1] = elementData[i];
            }
            size--;
            elementData[size] = null;
        }
    }
}