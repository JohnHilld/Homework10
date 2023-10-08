package phonebook;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Telephonebook {
    private List<Record> rec;

    public Telephonebook() {
        rec = new ArrayList<>();
    }

    public void add(String name, String phoneNumber) {
        Record newRec = new Record(name, phoneNumber);
        rec.add(newRec);
    }

    public Record find(String name) {
        for (Record oneRec: rec) {
            if (Objects.equals(oneRec.getName(), name)) {
                return oneRec;
            }
        }

        return null;
    }
    public List<Record> findAll(String name) {
        List<Record> allRec = new ArrayList<>();

        for (Record oneRec: rec) {
            if (Objects.equals(oneRec.getName(), name)) {
                allRec.add(oneRec);
            }
        }

        return allRec;
    }
}
