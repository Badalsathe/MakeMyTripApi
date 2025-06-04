package in.bikkadit.response;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "ticket")
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ticketId;
    @Column(name = "from_station")
    private String from;

    @Column(name = "to_station")
    private String to;
    private String trainNum;
    private String tktCost;
    private String ticketStatus;
    
    
    
}
