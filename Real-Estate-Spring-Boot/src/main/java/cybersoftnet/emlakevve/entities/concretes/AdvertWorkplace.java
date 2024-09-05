package cybersoftnet.emlakevve.entities.concretes;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.*;

@Data
@Entity
@Table(name = "advert_workplace")
public class AdvertWorkplace {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "advert_no")
    private Integer advertNo;


    @Column(name = "advert_date")
    private Date advertDate;

    @Column(name = "advert_m2")
    private String brutM2;

    @Column(name = "building_age")
    private String buildingAge;
    @Column(name = "kullanim_durumu")
    private String kullanimDurumu;

    @Column(name = "advert_price")
    private Integer advertPrice;

    @Column(name = "advert_type")
    private String advertType;

    @Column(name = "room_count")
    private Integer roomCount;

    @Column(name = "heating_type")
    private String heatingType;

    @OneToOne
    @MapsId
    @JoinColumn(name = "advert_id")
    private Advert advert;



}
