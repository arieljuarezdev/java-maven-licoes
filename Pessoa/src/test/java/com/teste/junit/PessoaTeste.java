package com.teste.junit;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PessoaTeste {
    @Test
    void deveCalcularIdadeCorretamente(){
        Pessoa jessica = new Pessoa("Jessica", LocalDateTime.of(2000, 1, 1, 15,0,0));
    
        Assertions.assertEquals(23,jessica.getIdade());
    }

    @Test
    void deveRetornarSeEMaiorDeIdade(){
        Pessoa joao = new Pessoa("Joao", LocalDateTime.of(2000, 1, 2, 14,50,0));
        Assertions.assertTrue(joao.ehMaiorDeIdade());
    }

}
