package A5Polymorphism.A1Lab.A1MathOperation;

public class MathOperation {
    public int add(int one, int two) {
        return one + two;
    }


    public int add(int one, int two, int tree) {
        return add(one, two) + tree;
    }


    public int add(int one, int two, int tree, int four) {
        return add(one, two, tree) + four;
    }
}
