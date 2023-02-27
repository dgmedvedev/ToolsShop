package demo.com;

import androidx.annotation.NonNull;

public class Drill {
    private int id;
    private String title;
    private String info;

    public Drill(String title, String info, int id) {
        this.id = id;
        this.title = title;
        this.info = info;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getInfo() {
        return info;
    }

    @NonNull
    @Override
    public String toString() {
        return title;
    }
}