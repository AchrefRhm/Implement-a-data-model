package com.example.entities;

import jakarta.persistence.*;
import java.util.*;

@Entity
public class Portfolio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long portfolioId;

    @OneToOne
    @JoinColumn(name = "client_id")
    private Client client;

    @OneToMany(mappedBy = "portfolio")
    private List<PortfolioHolding> holdings = new ArrayList<>();

    public Portfolio() {}
    public Portfolio(Client client) {
        this.client = client;
    }

    public Long getPortfolioId() { return portfolioId; }
    public Client getClient() { return client; }
    public void setClient(Client client) { this.client = client; }
    public List<PortfolioHolding> getHoldings() { return holdings; }
    public void setHoldings(List<PortfolioHolding> holdings) { this.holdings = holdings; }
}
