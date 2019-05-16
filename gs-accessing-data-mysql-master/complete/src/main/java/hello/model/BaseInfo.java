package hello.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BaseInfo  {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer baseId;
    private String cropsCat;
    private String kindName;
    private String seedPlace;
    private String inspireCode;
    private String recognitionCode;
    private String processCode;
    private String seedPackage;
    private String logisticsInfo;
    private String inspireDate;
    private String expireDate;

    public Integer getBaseId() {
        return baseId;
    }

    public void setBaseId(Integer baseId) {
        this.baseId = baseId;
    }

    public String getCropsCat() {
        return cropsCat;
    }

    public void setCropsCat(String cropsCat) {
        this.cropsCat = cropsCat;
    }

    public String getKindName() {
        return kindName;
    }

    public void setKindName(String kindName) {
        this.kindName = kindName;
    }

    public String getSeedPlace() {
        return seedPlace;
    }

    public void setSeedPlace(String seedPlace) {
        this.seedPlace = seedPlace;
    }

    public String getInspireCode() {
        return inspireCode;
    }

    public void setInspireCode(String inspireCode) {
        this.inspireCode = inspireCode;
    }

    public String getRecognitionCode() {
        return recognitionCode;
    }

    public void setRecognitionCode(String recognitionCode) {
        this.recognitionCode = recognitionCode;
    }

    public String getProcessCode() {
        return processCode;
    }

    public void setProcessCode(String processCode) {
        this.processCode = processCode;
    }

    public String getSeedPackage() {
        return seedPackage;
    }

    public void setSeedPackage(String seedPackage) {
        this.seedPackage = seedPackage;
    }

    public String getLogisticsInfo() {
        return logisticsInfo;
    }

    public void setLogisticsInfo(String logisticsInfo) {
        this.logisticsInfo = logisticsInfo;
    }

    public String getInspireDate() {
        return inspireDate;
    }

    public void setInspireDate(String inspireDate) {
        this.inspireDate = inspireDate;
    }

    public String getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate;
    }

    @Override
    public String toString() {
        return "BaseInfo{" +
                "baseId=" + baseId +
                ", cropsCat='" + cropsCat + '\'' +
                ", kindName='" + kindName + '\'' +
                ", seedPlace='" + seedPlace + '\'' +
                ", inspireCode='" + inspireCode + '\'' +
                ", recognitionCode='" + recognitionCode + '\'' +
                ", processCode='" + processCode + '\'' +
                ", seedPackage='" + seedPackage + '\'' +
                ", logisticsInfo='" + logisticsInfo + '\'' +
                ", inspireDate='" + inspireDate + '\'' +
                ", expireDate='" + expireDate + '\'' +
                '}';
    }
}
