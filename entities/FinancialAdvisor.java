package com.example.entities;

import jakarta.persistence.*;
import java.util.*;

@Entity
public class FinancialAdvisor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long advisorId;

    private String lastName;
    private String email;

    @OneToMany(mappedBy = "advisor")
    private List<Client> clients = new ArrayList<>();

    public FinancialAdvisor() {}
    public FinancialAdvisor(String lastName, String email) {
        this.lastName = lastName;
        this.email = email;
    }

    public Long getAdvisorId() { return advisorId; }
    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public List<Client> getClients() { return clients; }
    public void setClients(List<Client> clients) { this.clients = clients; }
}
