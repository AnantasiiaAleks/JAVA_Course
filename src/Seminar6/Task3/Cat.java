package Seminar6.Task3;

public class Cat {
    String name;
    String poroda;
    int age;
    String owner;

    @Override
    public String toString() {
        return String.format("%s - порода: %s, возраст: %d, владелец: %s", name, poroda, age, owner);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Cat)) {
            return false;
        }
        Cat cat = (Cat)obj;
        return name.equals(cat.name) && poroda.equals(cat.poroda) && age == cat.age && owner.equals(cat.owner);
    }

    @Override
    public int hashCode() {
        return name.hashCode() + 7*poroda.hashCode() + 13*age + 17*owner.hashCode();
    }

}
