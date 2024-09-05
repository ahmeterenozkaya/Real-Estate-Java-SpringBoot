package cybersoftnet.emlakevve.entities.concretes;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.*;


@Data
@Entity
@Table(name = "advert_house")
public class AdvertHouse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "advert_no")
    private Integer advertNo;

    @Column(name = "category")
    private String category;

    @Column(name = "operation")
    private boolean operation;

    @Column(name = "m2")
    private String m2;

    @Column(name = "room_count")
    private String roomCount;

    @Column(name = "bathroom")
    private Integer bathroom;

    @Column(name = "building_age")
    private Integer buildingAge;

    @Column(name = "building_floors_number")
    private Integer buildingFloorsNumber;

    @Column(name = "found_floor")
    private Integer foundFloor;

    @Column(name = "furniture_status")
    private boolean furnitureStatus;

    @Column(name = "facade")
    private String facade;


    @Column(name = "advert_date")
    private Date advertDate;

    @Column(name = "heating_type")
    private String heatingType;

    @Column(name = "advert_address")
    private String advertAddress;


    @OneToOne
    @MapsId
    @JoinColumn(name = "advert_id")
    private Advert advert;



}
