package A5Polymorphism.A1Lab.A3Animals;

public class Cat extends Animal {

    public Cat(String name, String favouriteFood) {
        super(name,favouriteFood);
    }

    @Override
    public String explainSelf() {
      //  return super.explainSelf() + System.lineSeparator() + "MEEOW";
        return String.format("%s%nMEEOW",super.explainSelf());
    }
}
