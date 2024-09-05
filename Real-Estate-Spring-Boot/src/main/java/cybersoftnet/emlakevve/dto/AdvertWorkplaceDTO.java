package cybersoftnet.emlakevve.dto;
import lombok.*;

import java.sql.Date;


@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdvertWorkplaceDTO {

    private Integer id;

    private Integer advertNo;

    private Date advertDate;

    private String brutM2;

    private String buildingAge;

    private String kullanimDurumu;

    private Integer advertPrice;

    private String advertType;

    private Integer roomCount;

    private String heeatingType;



}
