public abstract class Beverage{
    String description = "Unknown Beverge";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}