package com.alura.forohub.modelo;

// ESTA ES LA LÍNEA QUE TE FALTA O ESTÁ MAL:
import com.alura.forohub.dto.DatosRegistroTopico; 

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "topicos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Topico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String mensaje;
    private String autor;

    // Ahora Java ya podrá reconocer DatosRegistroTopico aquí:
    public Topico(DatosRegistroTopico datos) {
        this.titulo = datos.titulo();
        this.mensaje = datos.mensaje();
        this.autor = datos.autor();
    }
}

