package hello.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DrugSeed {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer sdId;
    private String sdName;
    private String sdDegree;
    private String sdMethod;
    private String sdCharacter;
    private String rgCode;

    public String getRgCode() {
        return rgCode;
    }

    public void setRgCode(String rgCode) {
        this.rgCode = rgCode;
    }

    public Integer getSdId() {
        return sdId;
    }

    public void setSdId(Integer sdId) {
        this.sdId = sdId;
    }

    public String getSdName() {
        return sdName;
    }

    public void setSdName(String sdName) {
        this.sdName = sdName;
    }

    public String getSdDegree() {
        return sdDegree;
    }

    public void setSdDegree(String sdDegree) {
        this.sdDegree = sdDegree;
    }

    public String getSdMethod() {
        return sdMethod;
    }

    public void setSdMethod(String sdMethod) {
        this.sdMethod = sdMethod;
    }

    public String getSdCharacter() {
        return sdCharacter;
    }

    public void setSdCharacter(String sdCharacter) {
        this.sdCharacter = sdCharacter;
    }

    @Override
    public String toString() {
        return "DrugSeed{" +
                "sdId=" + sdId +
                ", sdName='" + sdName + '\'' +
                ", sdDegree='" + sdDegree + '\'' +
                ", sdMethod='" + sdMethod + '\'' +
                ", sdCharacter='" + sdCharacter + '\'' +
                ", rgCode='" + rgCode + '\'' +
                '}';
    }
}
