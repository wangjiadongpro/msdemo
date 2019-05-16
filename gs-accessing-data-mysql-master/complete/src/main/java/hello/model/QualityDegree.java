package hello.model;

import org.springframework.stereotype.Repository;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class QualityDegree {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String purity;
    private String waterDegred;
    private String buddingRate;
    private String cDegree;
    private String weight;
    private Integer qualityDId;
    private String rgCode;

    public String getRgCode() {
        return rgCode;
    }

    public void setRgCode(String rgCode) {
        this.rgCode = rgCode;
    }

    public String getPurity() {
        return purity;
    }

    public void setPurity(String purity) {
        this.purity = purity;
    }

    public String getWaterDegred() {
        return waterDegred;
    }

    public void setWaterDegred(String waterDegred) {
        this.waterDegred = waterDegred;
    }

    public String getBuddingRate() {
        return buddingRate;
    }

    public void setBuddingRate(String buddingRate) {
        this.buddingRate = buddingRate;
    }

    public String getcDegree() {
        return cDegree;
    }

    public void setcDegree(String cDegree) {
        this.cDegree = cDegree;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public Integer getQualityDId() {
        return qualityDId;
    }

    public void setQualityDId(Integer qualityDId) {
        this.qualityDId = qualityDId;
    }

    @Override
    public String toString() {
        return "QualityDegree{" +
                "purity='" + purity + '\'' +
                ", waterDegred='" + waterDegred + '\'' +
                ", buddingRate='" + buddingRate + '\'' +
                ", cDegree='" + cDegree + '\'' +
                ", weight='" + weight + '\'' +
                ", qualityDId='" + qualityDId + '\'' +
                ", rgCode='" + rgCode + '\'' +
                '}';
    }
}
