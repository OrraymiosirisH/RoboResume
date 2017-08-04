package guevara.demo.roboresume;


import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


public class Robo {

    @NotNull(message="You must enter a Name")
    @Size(min=1, max = 45, message = "Item Name can be between 1 and 30 characters")
    private String roboName;
    @NotNull(message="You must enter an Email")
    @Size(min=1, max = 30, message = "Item Name can be between 1 and 30 characters")
    private String roboEmail;
    @NotNull(message="You must enter a Organization")
    @Size(min=1, max = 30, message = "Item Name can be between 1 and 30 characters")
    private String roboOrgan;
    @NotNull(message="You must enter a Begin Day")
    @Size(min=1, max = 30, message = "Item Name can be between 1 and 30 characters")
    private String roboBegin;
    @NotNull(message="You must enter a Ends Date")
    @Size(min=1, max = 30, message = "Item Name can be between 1 and 30 characters")
    private String roboEnd;


    public String getRoboName() {
        return roboName;
    }

    public void setRoboName(String roboName) {
        this.roboName = roboName;
    }

    public String getRoboEmail() {
        return roboEmail;
    }

    public void setRoboEmail(String roboEmail) {
        this.roboEmail = roboEmail;
    }

    public String getRoboOrgan() {
        return roboOrgan;
    }

    public void setRoboOrgan(String roboOrgan) {
        this.roboOrgan = roboOrgan;
    }

    public String getRobobegin() {
        return roboBegin;
    }

    public void setRobobegin(String robobegin) {
        this.roboBegin = robobegin;
    }

    public String getRoboend() {
        return roboEnd;
    }

    public void setRoboend(String roboend) {
        this.roboEnd = roboend;
    }



 }
