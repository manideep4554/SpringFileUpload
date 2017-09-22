package com.rk;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;


public class FirstJson {

    @JsonProperty("LineItemId")
    private String lineItemId;
    @JsonProperty("UnitsChange")
    private String unitsChange;
    @JsonProperty("LedgerEntryId")
    private long ledgerEntryId;
    @JsonProperty("JournalEntryId")
    private Object journalEntryId;
    @JsonProperty("InvoiceId")
    private long invoiceId;
    @JsonProperty("ShareId")
    private long shareId;
    @JsonProperty("TransactionDate")
    private String transactionDate;
    @JsonProperty("TransactionTypeId")
    private long transactionTypeId;
    @JsonProperty("TransactionTypeName")
    private String transactionTypeName;
    @JsonProperty("ValueChange")
    private Double valueChange;
    @JsonIgnore
   // private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("LineItemId")
    public String getLineItemId() {
        return lineItemId;
    }

    @JsonProperty("LineItemId")
    public void setLineItemId(String lineItemId) {
        this.lineItemId = lineItemId;
    }

    @JsonProperty("UnitsChange")
    public String getUnitsChange() {
        return unitsChange;
    }

    @JsonProperty("UnitsChange")
    public void setUnitsChange(String unitsChange) {
        this.unitsChange = unitsChange;
    }

    @JsonProperty("LedgerEntryId")
    public Long getLedgerEntryId() {
        return ledgerEntryId;
    }

    @JsonProperty("LedgerEntryId")
    public void setLedgerEntryId(Long ledgerEntryId) {
        this.ledgerEntryId = ledgerEntryId;
    }

    @JsonProperty("JournalEntryId")
    public Object getJournalEntryId() {
        return journalEntryId;
    }

    @JsonProperty("JournalEntryId")
    public void setJournalEntryId(Object journalEntryId) {
        this.journalEntryId = journalEntryId;
    }

    @JsonProperty("InvoiceId")
    public Long getInvoiceId() {
        return invoiceId;
    }

    @JsonProperty("InvoiceId")
    public void setInvoiceId(Long invoiceId) {
        this.invoiceId = invoiceId;
    }

    @JsonProperty("ShareId")
    public Long getShareId() {
        return shareId;
    }

    @JsonProperty("ShareId")
    public void setShareId(Long shareId) {
        this.shareId = shareId;
    }

    @JsonProperty("TransactionDate")
    public String getTransactionDate() {
        return transactionDate;
    }

    @JsonProperty("TransactionDate")
    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }

    @JsonProperty("TransactionTypeId")
    public Long getTransactionTypeId() {
        return transactionTypeId;
    }

    @JsonProperty("TransactionTypeId")
    public void setTransactionTypeId(Long transactionTypeId) {
        this.transactionTypeId = transactionTypeId;
    }

    @JsonProperty("TransactionTypeName")
    public String getTransactionTypeName() {
        return transactionTypeName;
    }

    @JsonProperty("TransactionTypeName")
    public void setTransactionTypeName(String transactionTypeName) {
        this.transactionTypeName = transactionTypeName;
    }

    @JsonProperty("ValueChange")
    public Double getValueChange() {
        return valueChange;
    }

    @JsonProperty("ValueChange")
    public void setValueChange(Double valueChange) {
        this.valueChange = valueChange;
    }

   /* @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }*/

}



