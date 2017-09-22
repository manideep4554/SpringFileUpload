
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
    "LineItemId",
    "ProductLineId",
    "ProductId",
    "SubproductId",
    "ProductDiscountTypeId",
    "Units",
    "Price",
    "WarehouseId",
    "Delivered",
    "PendingDelivery",
    "CustomerId",
    "EarliestAcceptableShipmentDate"
})
public class LineItem {

    @JsonProperty("LineItemId")
    private Integer lineItemId;
    @JsonProperty("ProductLineId")
    private String productLineId;
    @JsonProperty("ProductId")
    private String productId;
    @JsonProperty("SubproductId")
    private String subproductId;
    @JsonProperty("ProductDiscountTypeId")
    private Integer productDiscountTypeId;
    @JsonProperty("Units")
    private Integer units;
    @JsonProperty("Price")
    private Double price;
    @JsonProperty("WarehouseId")
    private Integer warehouseId;
    @JsonProperty("Delivered")
    private Integer delivered;
    @JsonProperty("PendingDelivery")
    private Integer pendingDelivery;
    @JsonProperty("CustomerId")
    private Object customerId;
    @JsonProperty("EarliestAcceptableShipmentDate")
    private Object earliestAcceptableShipmentDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("LineItemId")
    public Integer getLineItemId() {
        return lineItemId;
    }

    @JsonProperty("LineItemId")
    public void setLineItemId(Integer lineItemId) {
        this.lineItemId = lineItemId;
    }

    @JsonProperty("ProductLineId")
    public String getProductLineId() {
        return productLineId;
    }

    @JsonProperty("ProductLineId")
    public void setProductLineId(String productLineId) {
        this.productLineId = productLineId;
    }

    @JsonProperty("ProductId")
    public String getProductId() {
        return productId;
    }

    @JsonProperty("ProductId")
    public void setProductId(String productId) {
        this.productId = productId;
    }

    @JsonProperty("SubproductId")
    public String getSubproductId() {
        return subproductId;
    }

    @JsonProperty("SubproductId")
    public void setSubproductId(String subproductId) {
        this.subproductId = subproductId;
    }

    @JsonProperty("ProductDiscountTypeId")
    public Integer getProductDiscountTypeId() {
        return productDiscountTypeId;
    }

    @JsonProperty("ProductDiscountTypeId")
    public void setProductDiscountTypeId(Integer productDiscountTypeId) {
        this.productDiscountTypeId = productDiscountTypeId;
    }

    @JsonProperty("Units")
    public Integer getUnits() {
        return units;
    }

    @JsonProperty("Units")
    public void setUnits(Integer units) {
        this.units = units;
    }

    @JsonProperty("Price")
    public Double getPrice() {
        return price;
    }

    @JsonProperty("Price")
    public void setPrice(Double price) {
        this.price = price;
    }

    @JsonProperty("WarehouseId")
    public Integer getWarehouseId() {
        return warehouseId;
    }

    @JsonProperty("WarehouseId")
    public void setWarehouseId(Integer warehouseId) {
        this.warehouseId = warehouseId;
    }

    @JsonProperty("Delivered")
    public Integer getDelivered() {
        return delivered;
    }

    @JsonProperty("Delivered")
    public void setDelivered(Integer delivered) {
        this.delivered = delivered;
    }

    @JsonProperty("PendingDelivery")
    public Integer getPendingDelivery() {
        return pendingDelivery;
    }

    @JsonProperty("PendingDelivery")
    public void setPendingDelivery(Integer pendingDelivery) {
        this.pendingDelivery = pendingDelivery;
    }

    @JsonProperty("CustomerId")
    public Object getCustomerId() {
        return customerId;
    }

    @JsonProperty("CustomerId")
    public void setCustomerId(Object customerId) {
        this.customerId = customerId;
    }

    @JsonProperty("EarliestAcceptableShipmentDate")
    public Object getEarliestAcceptableShipmentDate() {
        return earliestAcceptableShipmentDate;
    }

    @JsonProperty("EarliestAcceptableShipmentDate")
    public void setEarliestAcceptableShipmentDate(Object earliestAcceptableShipmentDate) {
        this.earliestAcceptableShipmentDate = earliestAcceptableShipmentDate;
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
