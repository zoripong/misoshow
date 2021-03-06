package kr.hs.emirim.uuuuri.haegbook.Model;

/**
 * Created by 유리 on 2017-11-08.
 */

public class Receipt {
    private String key;
    private String date;
    private String title;
    private String amount;
    private int type;
    private String memo;

    public Receipt(){}

    public Receipt(String date, String title, String amount, int type, String memo) {
        this.date = date;
        this.title = title;
        this.amount = amount;
        this.type = type;
        this.memo = memo;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    @Override
    public String toString() {
        return "Receipt{" +
                "key='" + key + '\'' +
                ", date='" + date + '\'' +
                ", title='" + title + '\'' +
                ", amount='" + amount + '\'' +
                ", type=" + type +
                ", memo='" + memo + '\'' +
                '}';
    }
}
