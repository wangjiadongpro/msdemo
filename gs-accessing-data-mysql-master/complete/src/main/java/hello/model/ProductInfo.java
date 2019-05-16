package hello.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class ProductInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String productName;
    private String seedProductCode;
    private String registerAddress;
    private String connectTel;
    private Integer producId;
    private String rgCode;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getSeedProductCode() {
        return seedProductCode;
    }

    public void setSeedProductCode(String seedProductCode) {
        this.seedProductCode = seedProductCode;
    }

    public String getRegisterAddress() {
        return registerAddress;
    }

    public void setRegisterAddress(String registerAddress) {
        this.registerAddress = registerAddress;
    }

    public String getConnectTel() {
        return connectTel;
    }

    public void setConnectTel(String connectTel) {
        this.connectTel = connectTel;
    }

    public Integer getProducId() {
        return producId;
    }

    public void setProducId(Integer producId) {
        this.producId = producId;
    }

    public String getRgCode() {
        return rgCode;
    }

    public void setRgCode(String rgCode) {
        this.rgCode = rgCode;
    }

    @Override
    public String toString() {
        return "ProductInfo{" +
                "productName='" + productName + '\'' +
                ", seedProductCode='" + seedProductCode + '\'' +
                ", registerAddress='" + registerAddress + '\'' +
                ", connectTel='" + connectTel + '\'' +
                ", producId=" + producId +
                ", rgCode='" + rgCode + '\'' +
                '}';
    }
}
