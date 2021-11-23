package A5Polymorphism.A2Exercises.A5Calculator;

import java.util.ArrayDeque;

public class MemoryOperation implements Operation{
    private ArrayDeque<Integer> memory;

    public MemoryOperation(ArrayDeque<Integer> memory) {
        this.memory = memory;
    }

    @Override
    public void addOperand(int operand) {
       this.memory.push(operand);
    }

    @Override
    public int getResult() {
        return this.memory.peek();


    }

    @Override
    public boolean isCompleted() {
        return false;
    }
}
