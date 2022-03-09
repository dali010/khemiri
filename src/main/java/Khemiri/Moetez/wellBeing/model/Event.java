package Khemiri.Moetez.wellBeing.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Event {
    @Id
    @Column(name = "event_id", nullable = false)
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long eventId;
    private String name;
    private String description;
    private String type;
    private String comment;
    private String mail;
    private Date date;
}
