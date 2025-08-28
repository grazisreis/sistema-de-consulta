package src;

import java.time.LocalDate;

public class Recepcionista extends Usuario {

    String matricula;

    public Recepcionista(String cpf, String matricula, String nome_completo, LocalDate data_nascimento, long idade, String celular, String email, String nome_mae) {
        super(cpf, nome_completo, data_nascimento, idade, celular, email, nome_mae);
        this.matricula = matricula;
    }


    

}
