package Task2;

public class Entity {
    private int id;
    private String name;
    private boolean isActive;

    // Конструктор по умолчанию
    public Entity() {
        id = 0;
        name = "";
        isActive = false;
    }

    // Конструктор со всеми параметрами
    public Entity(int id, String name, boolean isActive) {
        this.id = id;
        this.name = name;
        this.isActive = isActive;
    }

    // Геттеры и сеттеры для всех параметров
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Override
    public String toString() {
        return "Entity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", isActive=" + isActive +
                '}';
    }
}




