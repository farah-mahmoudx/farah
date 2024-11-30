import java.util.Date;
public class GemotricObjects {
    private String color;
    private boolean filled;
    private Date datecreated;
    public GemotricObjects(String color,boolean filled){
        this.color=color;
        this.filled=filled;
        datecreated=new Date();


    }
    public void isFilled(boolean filled){
        this.filled=filled;

    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDatecreated(Date datecreated) {
        this.datecreated = datecreated;
    }

    public Date getDatecreated() {
        return datecreated;
    }
    public String toString(){
        return "color"+" "+color+" "+"filled"+" "+filled;
    }
}
