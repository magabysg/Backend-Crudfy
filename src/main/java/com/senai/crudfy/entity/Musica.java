package com.senai.crudfy.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Musica {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String titulo;
    private String artista;
    private String album;
    @Enumerated(EnumType.STRING)
    private Genero genero;
    private String duração;
    private String capa;

}