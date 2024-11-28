package org.example;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class LancamentoFinanceiro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Descrição é obrigatória.")
    private String descricao;

    @NotNull(message = "Valor é obrigatório.")
    @DecimalMin(value = "0.01", message = "Valor deve ser maior que zero.")
    private BigDecimal valor;

    @Enumerated(EnumType.STRING)
    @NotNull(message = "Tipo é obrigatório.")
    private TipoLancamento tipo;

    @NotNull(message = "Data do lançamento é obrigatória.")
    private LocalDate dataLancamento;

    @ManyToOne
    @JoinColumn(name = "pessoa_id", nullable = false)
    private Pessoa pessoa;

    public @NotBlank(message = "Descrição é obrigatória.") String getDescricao() {
        return descricao;
    }

    public void setDescricao(@NotBlank(message = "Descrição é obrigatória.") String descricao) {
        this.descricao = descricao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public @NotNull(message = "Valor é obrigatório.") @DecimalMin(value = "0.01", message = "Valor deve ser maior que zero.") BigDecimal getValor() {
        return valor;
    }

    public void setValor(@NotNull(message = "Valor é obrigatório.") @DecimalMin(value = "0.01", message = "Valor deve ser maior que zero.") BigDecimal valor) {
        this.valor = valor;
    }

    public @NotNull(message = "Tipo é obrigatório.") TipoLancamento getTipo() {
        return tipo;
    }

    public void setTipo(@NotNull(message = "Tipo é obrigatório.") TipoLancamento tipo) {
        this.tipo = tipo;
    }

    public @NotNull(message = "Data do lançamento é obrigatória.") LocalDate getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(@NotNull(message = "Data do lançamento é obrigatória.") LocalDate dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
}

