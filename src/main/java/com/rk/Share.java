
package com.rk;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ShareId",
    "CustomerId",
    "Portion",
    "IsPrimary",
    "IsRoundingVictim",
    "IsLandlord"
})
public class Share {

    @JsonProperty("ShareId")
    private Integer shareId;
    @JsonProperty("CustomerId")
    private Integer customerId;
    @JsonProperty("Portion")
    private Integer portion;
    @JsonProperty("IsPrimary")
    private Boolean isPrimary;
    @JsonProperty("IsRoundingVictim")
    private Boolean isRoundingVictim;
    @JsonProperty("IsLandlord")
    private Boolean isLandlord;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ShareId")
    public Integer getShareId() {
        return shareId;
    }

    @JsonProperty("ShareId")
    public void setShareId(Integer shareId) {
        this.shareId = shareId;
    }

    @JsonProperty("CustomerId")
    public Integer getCustomerId() {
        return customerId;
    }

    @JsonProperty("CustomerId")
    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    @JsonProperty("Portion")
    public Integer getPortion() {
        return portion;
    }

    @JsonProperty("Portion")
    public void setPortion(Integer portion) {
        this.portion = portion;
    }

    @JsonProperty("IsPrimary")
    public Boolean getIsPrimary() {
        return isPrimary;
    }

    @JsonProperty("IsPrimary")
    public void setIsPrimary(Boolean isPrimary) {
        this.isPrimary = isPrimary;
    }

    @JsonProperty("IsRoundingVictim")
    public Boolean getIsRoundingVictim() {
        return isRoundingVictim;
    }

    @JsonProperty("IsRoundingVictim")
    public void setIsRoundingVictim(Boolean isRoundingVictim) {
        this.isRoundingVictim = isRoundingVictim;
    }

    @JsonProperty("IsLandlord")
    public Boolean getIsLandlord() {
        return isLandlord;
    }

    @JsonProperty("IsLandlord")
    public void setIsLandlord(Boolean isLandlord) {
        this.isLandlord = isLandlord;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
