package com.example.entities;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class PortfolioHolding {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long holdingId;

    private LocalDate purchaseDate;
    private Double purchasePrice;

    @ManyToOne
    @JoinColumn(name = "portfolio_id")
    private Portfolio portfolio;

    @ManyToOne
    @JoinColumn(name = "security_id")
    private Security security;

    public PortfolioHolding() {}
    public PortfolioHolding(Portfolio portfolio, Security security, LocalDate purchaseDate, Double purchasePrice) {
        this.portfolio = portfolio;
        this.security = security;
        this.purchaseDate = purchaseDate;
        this.purchasePrice = purchasePrice;
    }

    public Long getHoldingId() { return holdingId; }
    public LocalDate getPurchaseDate() { return purchaseDate; }
    public void setPurchaseDate(LocalDate purchaseDate) { this.purchaseDate = purchaseDate; }
    public Double getPurchasePrice() { return purchasePrice; }
    public void setPurchasePrice(Double purchasePrice) { this.purchasePrice = purchasePrice; }
    public Portfolio getPortfolio() { return portfolio; }
    public void setPortfolio(Portfolio portfolio) { this.portfolio = portfolio; }
    public Security getSecurity() { return security; }
    public void setSecurity(Security security) { this.security = security; }
}
