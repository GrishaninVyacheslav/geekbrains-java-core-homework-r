package GeekBrians.Slava_5655380.Homework.Lesson13;

public abstract class Stage {
    protected int length;
    protected String description;
    public String getDescription() {
        return description;
    }
    public abstract void go(Car c);
}
