import java.util.Map;
import java.util.Objects;

public class Phonebook {

    Map<String, String> phonebook;

    public Phonebook(Map<String, String> phonebook) {
        this.phonebook = phonebook;
    }

    public Map<String, String> getPhonebook() {
        return phonebook;
    }

    @Override
    public String toString() {
        return phonebook.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Phonebook)) return false;
        Phonebook phonebook1 = (Phonebook) o;
        return Objects.equals(phonebook, phonebook1.phonebook);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phonebook);
    }
}
