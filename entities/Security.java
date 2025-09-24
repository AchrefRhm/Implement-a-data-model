package com.example.entities;

import jakarta.persistence.*;
import java.util.*;

@Entity
public class Security {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long securityId;

    private String name;
    private String category;

    @OneToMany(mappedBy = "security")
    private List<PortfolioHolding> holdings = new ArrayList<>();

    public Security() {}
    public Security(String name, String category) {
        this.name = name;
        this.category = category;
    }

    public Long getSecurityId() { return securityId; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }
    public List<PortfolioHolding> getHoldings() { return holdings; }
    public void setHoldings(List<PortfolioHolding> holdings) { this.holdings = holdings; }
}
