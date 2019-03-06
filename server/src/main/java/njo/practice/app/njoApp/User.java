package njo.practice.app.njoApp;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
@Getter @Setter
@NoArgsConstructor
@ToString @EqualsAndHashCode
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;
    @Column(name = "fname")
    private String fName;
    @Column(name = "lname")
    private String lName;
    @Column(name = "score")
    private int score;

}
