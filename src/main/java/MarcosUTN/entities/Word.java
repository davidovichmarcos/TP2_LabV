package MarcosUTN.entities;

public class Word {

    private String value;
    private Integer lenght;

    public Word() {
    }

    public Word(String value, Integer lenght) {
        this.value = value;
        this.lenght = lenght;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Integer getLenght() {
        return lenght;
    }

    public void setLenght(Integer lenght) {
        this.lenght = lenght;
    }

}
