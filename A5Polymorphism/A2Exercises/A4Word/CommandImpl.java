package A5Polymorphism.A2Exercises.A4Word;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CommandImpl implements CommandInterface {
    class ToUpperTransform implements TextTransform {
        @Override
        public void invokeOn(StringBuilder text, int startIndex, int endIndex){
            for (int i = startIndex; i < endIndex; i++) {
                text.setCharAt(i, Character.toUpperCase(text.charAt(i)));
            }
        }
    }
    class Cut implements TextTransform{
        private StringBuilder sb;

        public StringBuilder getSb() {
            return sb;
        }

        @Override
        public void invokeOn(StringBuilder text, int startIndex, int endIndex) {
            this.sb = new StringBuilder();
            for (int i = startIndex; i < endIndex; i++) {
                sb.append(text.charAt(i));
            }
            text.delete(startIndex,endIndex);
        }
    }
    class Paste implements TextTransform{
        private Cut cut;

        public Paste(Cut cut) {
            this.cut = cut;
        }

        @Override
        public void invokeOn(StringBuilder text, int startIndex, int endIndex) {
            text.replace(startIndex,endIndex,cut.getSb().toString());
        }
    }
    private Map<String, TextTransform> commandTransforms;
    private StringBuilder text;

    public CommandImpl(StringBuilder text) {
        this.commandTransforms = new HashMap<>();
        this.text = text;
    }

    public Map<String, TextTransform> getCommandTransforms() {
        return commandTransforms;
    }

    @Override
    public void init() {
        this.commandTransforms.clear();
        for (Command p : this.initCommands()) {
            this.commandTransforms.putIfAbsent(p.getText(), p.getTextTransform());
        }
    }

    @Override
    public void handleInput(String input) {
        String[] tokens = input.split("\\s+");

        String commandName = tokens[0];
        int startInd = Integer.parseInt(tokens[1]);
        int endInd = Integer.parseInt(tokens[2]);

        this.commandTransforms.get(commandName).invokeOn(this.text, startInd, endInd);
    }

    protected List<Command> initCommands() {
        Cut cut = new Cut();
        List<Command> commands = new ArrayList<>();
        commands.add(new Command("uppercase", new ToUpperTransform()));
        commands.add(new Command("cut",cut));
        commands.add(new Command("paste", new Paste(cut)));

        return commands;
    }
}
