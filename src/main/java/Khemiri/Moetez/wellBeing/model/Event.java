package Khemiri.Moetez.wellBeing.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

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
    private String mail;
    private float rating = 0;
    private Date date;

    @JsonIgnore
    @OneToMany( mappedBy="event")
    private List<Comment> comments;

}
