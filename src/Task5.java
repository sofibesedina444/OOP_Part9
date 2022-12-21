import java.util.Map;
import java.util.Objects;

public class Task5 {
    Map<Integer, String> map;

    public Task5(Map<Integer, String> map) {
        this.map = map;
    }

    public Map<Integer, String> getMap() {
        return map;
    }

    public void getKeyValue(Map<Integer, String> map) {
        System.out.println("Буквы алфавита: ");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.printf("%s - %s\n", entry.getKey(), entry.getValue());
        }
    }

    @Override
    public String toString() {
        return "Таблица: " + "\n" + map;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Task5)) return false;
        Task5 task5 = (Task5) o;
        return Objects.equals(map, task5.map);
    }

    @Override
    public int hashCode() {
        return Objects.hash(map);
    }
}
