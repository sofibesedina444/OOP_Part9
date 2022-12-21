import java.util.Map;
import java.util.Objects;

public class Task4 {
    Map<String, Integer> map;

    public Task4(Map<String, Integer> map) {
        this.map = map;
    }

    public void updateMap (Map<String, Integer> map) {
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
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
        if (!(o instanceof Task4)) return false;
        Task4 task4 = (Task4) o;
        return Objects.equals(map, task4.map);
    }

    @Override
    public int hashCode() {
        return Objects.hash(map);
    }
}
