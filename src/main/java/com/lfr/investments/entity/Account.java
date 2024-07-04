package com.lfr.investments.entity;

import jakarta.persistence.*;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "tb_accounts")
public class Account {
    @Id
    @Column(name = "account_id")
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID accountId;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "account")
    @PrimaryKeyJoinColumn
    private BillingAddress billingAddress;

    @Column(name = "description")
    private String description;

    @OneToMany(mappedBy = "account")
    private List<AccountStock> accountStocks;

    public Account() {
    }

    public Account(UUID accountId,
                   User user,
                   String description,
                   BillingAddress billingAddress,
                   List<AccountStock> accountStocks
        ) {
        this.accountId = accountId;
        this.user = user;
        this.description = description;
        this.billingAddress = billingAddress;
        this.accountStocks = accountStocks;
    }

    public UUID getAccountId() {
        return accountId;
    }

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public void setAccountId(UUID accountId) {
        this.accountId = accountId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public BillingAddress getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(BillingAddress billingAddress) {
        this.billingAddress = billingAddress;
    }

    public List<AccountStock> getAccountStocks() {
        return accountStocks;
    }

    public void setAccountStocks(List<AccountStock> accountStocks) {
        this.accountStocks = accountStocks;
    }
}
