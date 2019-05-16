package hello.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PlantedDirection {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String plantedArea;
    private String plantedSeason;
    private String quarantineProveCode;
    private String mainCharacter;
    private String accomAblitity;
    private String riskWarning;
    private String consultInfo;
    private String mainSeedInsCode;
    private String authorityKindCode;
    private String registerPron;
    private Integer pdId;
    private String rgCode;


    public String getRgCode() {
        return rgCode;
    }

    public void setRgCode(String rgCode) {
        this.rgCode = rgCode;
    }

    public String getPlantedArea() {
        return plantedArea;
    }

    public void setPlantedArea(String plantedArea) {
        this.plantedArea = plantedArea;
    }

    public String getPlantedSeason() {
        return plantedSeason;
    }

    public void setPlantedSeason(String plantedSeason) {
        this.plantedSeason = plantedSeason;
    }

    public String getQuarantineProveCode() {
        return quarantineProveCode;
    }

    public void setQuarantineProveCode(String quarantineProveCode) {
        this.quarantineProveCode = quarantineProveCode;
    }

    public String getMainCharacter() {
        return mainCharacter;
    }

    public void setMainCharacter(String mainCharacter) {
        this.mainCharacter = mainCharacter;
    }

    public String getRiskWarning() {
        return riskWarning;
    }

    public void setRiskWarning(String riskWarning) {
        this.riskWarning = riskWarning;
    }

    public String getConsultInfo() {
        return consultInfo;
    }

    public void setConsultInfo(String consultInfo) {
        this.consultInfo = consultInfo;
    }

    public String getMainSeedInsCode() {
        return mainSeedInsCode;
    }

    public void setMainSeedInsCode(String mainSeedInsCode) {
        this.mainSeedInsCode = mainSeedInsCode;
    }

    public String getAuthorityKindCode() {
        return authorityKindCode;
    }

    public void setAuthorityKindCode(String authorityKindCode) {
        this.authorityKindCode = authorityKindCode;
    }

    public String getRegisterPron() {
        return registerPron;
    }

    public void setRegisterPron(String registerPron) {
        this.registerPron = registerPron;
    }

    public Integer getPdId() {
        return pdId;
    }

    public void setPdId(Integer pdId) {
        this.pdId = pdId;
    }

    public String getAccomAblitity() {
        return accomAblitity;
    }

    public void setAccomAblitity(String accomAblitity) {
        this.accomAblitity = accomAblitity;
    }
}
