package com.deanntu.two.questOne;

public class SupplierFiler extends BaseFiler<Supplier> {

    public SupplierFiler(String filePath) {
        super(filePath);
    }

    protected String format(Supplier supplier) {
        StringBuilder builder = new StringBuilder();
        builder.append(supplier.getSupplierID()).append(DELIMETER);
        builder.append(supplier.getSupplierName()).append(DELIMETER);
        builder.append(supplier.getTotalCredit());
        String line = builder.toString();
        return line;
    }

    protected Supplier parse(String line) {
        String[] tokens = line.split(DELIMETER);
        Supplier supplier = new Supplier();
        supplier.setSupplierID(Long.parseLong(tokens[0]));
        supplier.setSupplierName((tokens[1]));
        supplier.setTotalCredit(Double.parseDouble(tokens[2]));
        return supplier;
    }

}