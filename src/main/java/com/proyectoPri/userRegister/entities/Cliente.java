package com.proyectoPri.userRegister.entities;

import lombok.*;

import javax.persistence.*;


@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name="usuarios")
public class Cliente {
    @Id
    @Column(name="id_usuario", nullable = false)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="usuarios_sequence")
    @SequenceGenerator(name="usuarios_sequence", sequenceName = "usuarios_sequence", allocationSize = 1)
    private Long id_usuario;

    @Column(name="num_identificacion", nullable = false, length=100)
    private String num_identificacion;

    @Column(name="nombre", nullable = false, length=100)
    private String nombre;

    @Column(name="email", nullable = false, length=50)
    private String email;

    @Column(name="password", nullable = false, length=100)
    private String password;

    @Column(name="tipo_identificacion", nullable = false, length=100)
    private String tipo_identificacion;
}
