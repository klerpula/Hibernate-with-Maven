package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Table(name="disaster")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class DisasterEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private Integer name;

    @Column(name = "type")
    private String type;
}
