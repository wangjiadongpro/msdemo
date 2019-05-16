package hello.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TransgeneSeed {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String tgsUse;
    private String tgsAgricultureCode;
    private Integer tgsId;
    private String rgCode;

    public String getRgCode() {
        return rgCode;
    }

    public void setRgCode(String rgCode) {
        this.rgCode = rgCode;
    }

    public String getTgsUse() {
        return tgsUse;
    }

    public void setTgsUse(String tgsUse) {
        this.tgsUse = tgsUse;
    }

    public String getTgsAgricultureCode() {
        return tgsAgricultureCode;
    }

    public void setTgsAgricultureCode(String tgsAgricultureCode) {
        this.tgsAgricultureCode = tgsAgricultureCode;
    }

    public Integer getTgsId() {
        return tgsId;
    }

    public void setTgsId(Integer tgsId) {
        this.tgsId = tgsId;
    }

    @Override
    public String toString() {
        return "TransgeneSeed{" +
                "tgsUse='" + tgsUse + '\'' +
                ", tgsAgricultureCode='" + tgsAgricultureCode + '\'' +
                ", tgsId=" + tgsId +
                ", rgCode='" + rgCode + '\'' +
                '}';
    }
}
