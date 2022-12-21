import java.util.Map;
import java.util.Objects;

public class Task3 {
    Map<String, Integer> map;

    public Task3(Map<String, Integer> map) {
        this.map = map;
    }

    public Map<String, Integer> getMap() {
        return map;
    }

    public void putMap(String str, Integer n) {
        if (!map.containsKey(str)) {
            map.putIfAbsent(str, n);
        } else if (map.containsValue(n)){
            throw new RuntimeException("Этот вариант уже добавлен");
        } else {
            map.put(str, n);
        }
    }

    @Override
    public String toString() {
        return "Таблица: " + map;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Task3)) return false;
        Task3 tast3 = (Task3) o;
        return Objects.equals(map, tast3.map);
    }

    @Override
    public int hashCode() {
        return Objects.hash(map);
    }
}
