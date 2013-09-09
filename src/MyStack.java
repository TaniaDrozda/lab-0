class MyStack {
    int size;
    int[] data;
    private final int maxsize = 5;

    MyStack() {
        data = new int[maxsize];
    }

    void push(int value) {
        if (size <= maxsize)
            data[size++] = value;
    }

    int pop() {
        return data[--size];
    }
}