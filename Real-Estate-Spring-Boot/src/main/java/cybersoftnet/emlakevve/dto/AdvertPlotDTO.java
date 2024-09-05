package cybersoftnet.emlakevve.dto;
import lombok.*;

import java.sql.Date;


@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdvertPlotDTO {

    private Integer id;

    private Integer advertNo;

    private Date advertDate;

    private String advertM2;

    private String floorProvision;

    private String plotType;

    private String ada;

    private String parsel;

    private Integer plotPrice;


}
