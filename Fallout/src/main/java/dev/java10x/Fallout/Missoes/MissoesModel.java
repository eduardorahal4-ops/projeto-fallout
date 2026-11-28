package dev.java10x.Fallout.Missoes;

import dev.java10x.Fallout.Fallout.Controller.surfice.FalloutModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table (name = "tb_missoes")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class MissoesModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String dificuldade;

    @OneToMany(mappedBy = "missoes")

    private List<FalloutModel> fallout;

}
