package org.karane.library.entity;

import org.springframework.data.annotation.Id;

public class Rent {

    @Id
    private String receipt;

    private String cpf;
    private String bookId;

    public Rent(String cpf, String bookId) {
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
