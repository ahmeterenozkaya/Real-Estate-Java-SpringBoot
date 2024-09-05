package cybersoftnet.emlakevve.dto;

import lombok.*;


@Data
@NoArgsConstructor
@AllArgsConstructor


public class AdminDTO {
    private int id;
    private String username;
    private String password;

    // Getter ve Setter metodları

   /* public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return username;
    }

    public void setName(String username) {
        this.username = username;
    }

    public String getEmail() {
        return password;
    }

    public void setEmail(String password) {
        this.password = password;
    }*/
}
