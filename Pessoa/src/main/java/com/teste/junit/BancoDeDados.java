package com.teste.junit;

import java.util.logging.Logger;

public class BancoDeDados {
    private static final Logger LOGGER = Logger.getLogger(BancoDeDados.class.getName());
    
    public static void iniciarConexao(){
        LOGGER.info("iniciou");
    }
    
    public static void finalizarConexao(){
        LOGGER.info("finalizou");
    }
}
