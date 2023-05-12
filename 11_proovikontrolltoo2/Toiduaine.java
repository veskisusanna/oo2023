package ee.susanna.proovikontrolltoo2;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Toiduaine {
    @Id
    private Long id;
    private String nimetus;
    private int valk;
    private int rasv;
    private int sysivesik;
}
