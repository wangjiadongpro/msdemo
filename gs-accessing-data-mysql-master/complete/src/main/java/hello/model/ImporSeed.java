package hello.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class ImporSeed {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String imporCode;
    private String impserverName;
    private String impserverAddr;
    private String impserverConnect;
    private String impseedInfo;
    private Integer impseedId;
    private String rgCode;

    public String getRgCode() {
        return rgCode;
    }

    public void setRgCode(String rgCode) {
        this.rgCode = rgCode;
    }

    public String getImporCode() {
        return imporCode;
    }

    public void setImporCode(String imporCode) {
        this.imporCode = imporCode;
    }

    public String getImpserverName() {
        return impserverName;
    }

    public void setImpserverName(String impserverName) {
        this.impserverName = impserverName;
    }

    public String getImpserverAddr() {
        return impserverAddr;
    }

    public void setImpserverAddr(String impserverAddr) {
        this.impserverAddr = impserverAddr;
    }

    public String getImpserverConnect() {
        return impserverConnect;
    }

    public void setImpserverConnect(String impserverConnect) {
        this.impserverConnect = impserverConnect;
    }

    public String getImpseedInfo() {
        return impseedInfo;
    }

    public void setImpseedInfo(String impseedInfo) {
        this.impseedInfo = impseedInfo;
    }

    public Integer getImpseedId() {
        return impseedId;
    }

    public void setImpseedId(Integer impseedId) {
        this.impseedId = impseedId;
    }

    @Override
    public String toString() {
        return "ImporSeed{" +
                "imporCode='" + imporCode + '\'' +
                ", impserverName='" + impserverName + '\'' +
                ", impserverAddr='" + impserverAddr + '\'' +
                ", impserverConnect='" + impserverConnect + '\'' +
                ", impseedInfo='" + impseedInfo + '\'' +
                ", impseedId=" + impseedId +
                ", rgCode='" + rgCode + '\'' +
                '}';
    }
}
