package cybersoftnet.emlakevve.dto;
import lombok.*;

import java.sql.Date;

@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdvertHouseDTO {

    private Integer id;

    private Integer advertNo;

    private String category;

    private boolean operation;

    private String m2;

    private String room_count;

    private Integer bathroom;

    private Integer building_age;

    private Integer buildingFloorsNumber;

    private Integer foundFloor;

    private Boolean furnitureStatus;

    private String facade;

    private Date advertDate;

    private String heatingType;

    private String advertAddress;

}
