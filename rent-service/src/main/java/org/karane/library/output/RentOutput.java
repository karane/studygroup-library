package org.karane.library.output;

public class RentOutput {


    private String receipt;
    private String cpf;
    private String bookId;

    public RentOutput(String receipt, String cpf, String bookId) {
        this.receipt = receipt;
        this.cpf = cpf;
        this.bookId = bookId;
    }

    public String getReceipt() {
        return receipt;
    }

    public void setReceipt(String receipt) {
        this.receipt = receipt;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }
}
