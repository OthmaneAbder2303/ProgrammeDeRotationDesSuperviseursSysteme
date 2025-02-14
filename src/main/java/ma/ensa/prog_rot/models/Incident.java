package ma.ensa.prog_rot.models;

import lombok.*;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Incident {

    private String reference;
    private Date time;
    private String status;
    private Membre membre;

}
