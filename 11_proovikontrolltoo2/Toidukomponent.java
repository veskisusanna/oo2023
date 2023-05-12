package ee.susanna.proovikontrolltoo2;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity

public class Toidukomponent {
    @Id
    private Long id;
    @ManyToOne
    private Toiduaine toiduaine;
    private int kogus;



}

