package A5Polymorphism.A2Exercises.A5Calculator;

import java.util.ArrayDeque;

public class Extensions {
    public static InputInterpreter buildInterpreter(CalculationEngine engine) {
        return new InputInterpreter(engine,new ArrayDeque<>());
    }
}
