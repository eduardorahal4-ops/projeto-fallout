package dev.java10x.Fallout.Fallout.Controller.surfice;

import dev.java10x.Fallout.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_fallout")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class FalloutModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private int idade;
    @ManyToOne
    @JoinColumn(name = "missoes_id")
    private MissoesModel missoes;




}
