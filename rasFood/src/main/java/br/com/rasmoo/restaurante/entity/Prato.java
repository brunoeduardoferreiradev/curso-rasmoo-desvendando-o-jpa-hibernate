package br.com.rasmoo.restaurante.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="pratos")
public class Prato {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Integer id;
   private String name;
   private String description;
   private Boolean disponible;
   @Column(name = "data_de_registro")
   private LocalDateTime registerDate = LocalDateTime.now();

    public Prato() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getDisponible() {
        return disponible;
    }

    public void setDisponible(Boolean disponible) {
        this.disponible = disponible;
    }

    public LocalDateTime getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(LocalDateTime registerDate) {
        this.registerDate = registerDate;
    }

    @Override
    public String toString() {
        return "Prato{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", disponible=" + disponible +
                ", registerDate=" + registerDate +
                '}';
    }
}
