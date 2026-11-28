package dev.java10x.Fallout.Missoes;

import dev.java10x.Fallout.Fallout.Controller.surfice.FalloutModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table (name = "tb_missoes")

public class MissoesModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String dificuldade;

    @OneToMany(mappedBy = "missoes")

    private List<FalloutModel> fallout;

}
