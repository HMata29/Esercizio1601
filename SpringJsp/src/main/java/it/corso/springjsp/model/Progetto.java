package it.corso.springjsp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "progetto")
@Getter
@Setter
public class Progetto extends BaseEntity{

    private String nome;

    private String descrizione;

    private String skill;
}
