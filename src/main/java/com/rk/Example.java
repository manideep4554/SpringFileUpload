
package com.rk;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "InvoiceId",
    "Name",
    "FarmManagerId",
    "SalesPeriodId",
    "TerritoryId",
    "OperationId",
    "SalesAgencyId",
    "IsActive",
    "LineItems",
    "Shares",
    "Replants"
})
public class Example {

    @JsonProperty("InvoiceId")
    private Integer invoiceId;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("FarmManagerId")
    private Integer farmManagerId;
    @JsonProperty("SalesPeriodId")
    private Integer salesPeriodId;
    @JsonProperty("TerritoryId")
    private String territoryId;
    @JsonProperty("OperationId")
    private Integer operationId;
    @JsonProperty("SalesAgencyId")
    private Integer salesAgencyId;
    @JsonProperty("IsActive")
    private Boolean isActive;
    @JsonProperty("LineItems")
    private List<LineItem> lineItems = null;
    @JsonProperty("Shares")
    private List<Share> shares = null;
    @JsonProperty("Replants")
    private List<Object> replants = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("InvoiceId")
    public Integer getInvoiceId() {
        return invoiceId;
    }

    @JsonProperty("InvoiceId")
    public void setInvoiceId(Integer invoiceId) {
        this.invoiceId = invoiceId;
    }

    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    @JsonProperty("Name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("FarmManagerId")
    public Integer getFarmManagerId() {
        return farmManagerId;
    }

    @JsonProperty("FarmManagerId")
    public void setFarmManagerId(Integer farmManagerId) {
        this.farmManagerId = farmManagerId;
    }

    @JsonProperty("SalesPeriodId")
    public Integer getSalesPeriodId() {
        return salesPeriodId;
    }

    @JsonProperty("SalesPeriodId")
    public void setSalesPeriodId(Integer salesPeriodId) {
        this.salesPeriodId = salesPeriodId;
    }

    @JsonProperty("TerritoryId")
    public String getTerritoryId() {
        return territoryId;
    }

    @JsonProperty("TerritoryId")
    public void setTerritoryId(String territoryId) {
        this.territoryId = territoryId;
    }

    @JsonProperty("OperationId")
    public Integer getOperationId() {
        return operationId;
    }

    @JsonProperty("OperationId")
    public void setOperationId(Integer operationId) {
        this.operationId = operationId;
    }

    @JsonProperty("SalesAgencyId")
    public Integer getSalesAgencyId() {
        return salesAgencyId;
    }

    @JsonProperty("SalesAgencyId")
    public void setSalesAgencyId(Integer salesAgencyId) {
        this.salesAgencyId = salesAgencyId;
    }

    @JsonProperty("IsActive")
    public Boolean getIsActive() {
        return isActive;
    }

    @JsonProperty("IsActive")
    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    @JsonProperty("LineItems")
    public List<LineItem> getLineItems() {
        return lineItems;
    }

    @JsonProperty("LineItems")
    public void setLineItems(List<LineItem> lineItems) {
        this.lineItems = lineItems;
    }

    @JsonProperty("Shares")
    public List<Share> getShares() {
        return shares;
    }

    @JsonProperty("Shares")
    public void setShares(List<Share> shares) {
        this.shares = shares;
    }

    @JsonProperty("Replants")
    public List<Object> getReplants() {
        return replants;
    }

    @JsonProperty("Replants")
    public void setReplants(List<Object> replants) {
        this.replants = replants;
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
