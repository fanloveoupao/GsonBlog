package bruse.com.gsonblog.model;

import java.io.Serializable;

/**
 * Created by bruse on 16/4/6.
 */
public class ResultModel implements Serializable {
    private double cur;
    private int days;
    private String name;
    private double sum;

    public void setCur(double cur) {
        this.cur = cur;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public double getCur() {
        return cur;
    }

    public int getDays() {
        return days;
    }

    public String getName() {
        return name;
    }

    public double getSum() {
        return sum;
    }
}
