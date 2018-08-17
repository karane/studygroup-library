package org.karane.library.api;

public class ApiBase {

        protected static final int OK = 200;
        protected static final String OK_MESSAGE = "Operação realizada com sucesso.";

        protected static final int CREATED = 201;
        protected static final String CREATED_MESSAGE = "Operação foi realizada e resultou em um novo recurso.";

        protected static final int ACCEPTED = 202;
        protected static final String ACCEPTED_MESSAGE = "O pedido foi aceito para processamento, mas o tratamento não foi concluído.";

        protected static final String DATE_PATTERN = "yyyy-MM-dd";
        protected static final String DATE_TIME_PATTERN ="yyyy-MM-dd'T'HH:mm:ssZ";


    }
