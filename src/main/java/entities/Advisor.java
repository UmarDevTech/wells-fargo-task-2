package entities;

import javax.persistence.*;

@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clientId;

    private String firstName;
    private String lastName;
    private String email;
    private String phone;

    @ManyToOne
    private Advisor advisor;

    public Client() {}

    public Client(Long clientId, String firstName, String lastName, String email, String phone, Advisor advisor) {
        this.clientId = clientId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.advisor = advisor;
    }
}
