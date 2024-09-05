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
@Table(name = "advert_plot")
public class AdvertPlot {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    @Column(name = "advert_no")
    private Integer advertNo;

    @Column(name = "advert_date")
    private Date advertDate;

    @Column(name = "advert_m2")
    private String advertM2;

    @Column(name = "floor_provision")
    private String floorProvision;

    @Column(name = "plot_type")
    private String plotType;

    @Column(name = "plot_ada")
    private String ada;

    @Column(name = "plot_parsel")
    private String parsel;

    @Column(name = "plot_price")
    private Integer plotPrice;


    @OneToOne
    @MapsId
    @JoinColumn(name = "advert_id")
    private Advert advert;  





}
