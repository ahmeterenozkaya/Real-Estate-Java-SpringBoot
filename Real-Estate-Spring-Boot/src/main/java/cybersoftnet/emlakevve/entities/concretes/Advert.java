package cybersoftnet.emlakevve.entities.concretes;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;

@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "advert")
public class Advert {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @PrimaryKeyJoinColumn(name = "advert_id")
    private Integer advertId;
/*
* title ve operasyon kısmı sorulacak.
*
* Advert sınıfı diğer diğer sınıfları extends eder.
* */
    @Column(name = "advert_title")
    private String advertTitle;

    @Column(name="advert_date")
    private Date advert_date;

    @Column(name = "advert_city")
    private String advertCity;


    @OneToOne(mappedBy = "advert", cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private AdvertHouse advertHouse;


    @OneToOne(mappedBy = "advert", cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn(name = "advert_no")
    private AdvertPlot advertPlot;


}
