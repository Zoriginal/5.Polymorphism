package A5Polymorphism.A2Exercises.A4Word;

public class Initialization {

    public static CommandInterface buildCommandInterface(StringBuilder text) {
       CommandInterface commandInterface = new CommandImpl(text);
       commandInterface.init();
       return commandInterface;
    }

}
