package org.unittestingecom.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

import java.time.LocalDate;

@Entity
@Table(name = "Orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @PastOrPresent(message = "Order must nbe present or past")
    private LocalDate orderDate;
    @PastOrPresent(message = "Payment date must be in the past or present")
    private LocalDate paymentDate;
    @Future(message = "Delivery date must be in the future")
    private LocalDate deliveryDate;
    @FutureOrPresent(message = "Shipment date must be in the present or future")
    private LocalDate shipmentDate;
    @Email(message = "Customer email should be valid")
    private String customerEmail;
    @Pattern(regexp = "^[A-Za-z0-9]+$",
            message = "Order reference must be alphanumeric")
    private String orderReference;
    @AssertTrue(message = "Order must be confirmed")
    private Boolean confirmed;
    public Order() {}

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(LocalDate paymentDate) {
        this.paymentDate = paymentDate;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(LocalDate deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public LocalDate getShipmentDate() {
        return shipmentDate;
    }

    public void setShipmentDate(LocalDate shipmentDate) {
        this.shipmentDate = shipmentDate;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getOrderReference() {
        return orderReference;
    }

    public void setOrderReference(String orderReference) {
        this.orderReference = orderReference;
    }

    public Boolean getConfirmed() {
        return confirmed;
    }

    public void setConfirmed(Boolean confirmed) {
        this.confirmed = confirmed;
    }

    public Order(LocalDate orderDate, LocalDate paymentDate, LocalDate deliveryDate, LocalDate shipmentDate) {
        this.orderDate = orderDate;
        this.paymentDate = paymentDate;
        this.deliveryDate = deliveryDate;
        this.shipmentDate = shipmentDate;
    }


}
