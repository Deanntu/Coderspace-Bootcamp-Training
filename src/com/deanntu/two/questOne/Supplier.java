package com.deanntu.two.questOne;

public class Supplier {
    private long supplierID;
    private String supplierName;
    private double totalCredit;

    public long getSupplierID() {
        return supplierID;
    }

    public void setSupplierID(long supplierId) {
        this.supplierID = supplierId;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public double getTotalCredit() {
        return totalCredit;
    }

    public void setTotalCredit(double totalCredit) {
        this.totalCredit = totalCredit;
    }

    public Supplier() {
    }

    public Supplier(long supplierId, String supplierName, double totalCredit) {
        this.supplierID = supplierId;
        this.supplierName = supplierName;
        this.totalCredit = totalCredit;
    }

}