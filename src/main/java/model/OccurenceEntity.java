package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="occurence")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter


public class OccurenceEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "year")
    private Integer year;

    @Column(name = "place")
    private String place;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "disaster_id")
    private DisasterEntity disasterEntity;
}
