package org.example;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import java.time.LocalDate;

@Entity
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Nome é obrigatório.")
    @Size(min = 3, message = "Nome deve ter pelo menos 3 caracteres.")
    private String nome;

    @NotBlank(message = "Email é obrigatório.")
    @Email(message = "Email deve ser válido.")
    private String email;

    @Past(message = "A data de nascimento não pode ser futura.")
    private LocalDate dataNascimento;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public @Past(message = "A data de nascimento não pode ser futura.") LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(@Past(message = "A data de nascimento não pode ser futura.") LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public @NotBlank(message = "Email é obrigatório.") @Email(message = "Email deve ser válido.") String getEmail() {
        return email;
    }

    public void setEmail(@NotBlank(message = "Email é obrigatório.") @Email(message = "Email deve ser válido.") String email) {
        this.email = email;
    }

    public @NotBlank(message = "Nome é obrigatório.") @Size(min = 3, message = "Nome deve ter pelo menos 3 caracteres.") String getNome() {
        return nome;
    }

    public void setNome(@NotBlank(message = "Nome é obrigatório.") @Size(min = 3, message = "Nome deve ter pelo menos 3 caracteres.") String nome) {
        this.nome = nome;
    }
}

