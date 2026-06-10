package entities;

import javax.persistence.*;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long portfolioId;

    @OneToOne
    private Client client;

    public Portfolio() {}

    public Portfolio(Long portfolioId, Client client) {
        this.portfolioId = portfolioId;
        this.client = client;
    }
}
