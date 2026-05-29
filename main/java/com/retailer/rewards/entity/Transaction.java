package com.retailer.rewards.entity;

import jakarta.persistence.*;
import java.sql.Timestamp;

/**
 * Transaction class
 */
@Entity
@Table(name = "TRANSACTION")
public class Transaction {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    @Column(name = "TRANSACTION_ID")
    private Long transactionId;

    @Column(name="CUSTOMER_ID")
    private Long customerId;

    @Column(name = "TRANSACTION_DATE")
    private Timestamp transactionDate;

    @Column(name = "AMOUNT")
    private double transactionAmount;


    /**
     * @return transactionId
     */
    public Long getTransactionId() {
        return transactionId;
    }

    /**
     * @param transactionId
     */
    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }

    /**
     * @return customerId
     */
    public Long getCustomerId() {
        return customerId;
    }

    /**
     * @param customerId
     */
    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    /**
     * @return transactionDate
     */
    public Timestamp getTransactionDate() {
        return transactionDate;
    }

    /**
     * @param transactionDate
     */
    public void setTransactionDate(Timestamp transactionDate) {
        this.transactionDate = transactionDate;
    }

    /**
     * @return transactionAmount
     */
    public double getTransactionAmount() {
        return transactionAmount;
    }

    /**
     * @param transactionAmount
     */
    public void setTransactionAmount(double transactionAmount) {
        this.transactionAmount = transactionAmount;
    }
}
