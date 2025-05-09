package br.dev.ezcoder.ezfinancepro.exception;

public class CategoryNotFoundException extends RuntimeException {

    public CategoryNotFoundException(String id) {
        super("Category with id: " + id + " not found!");
    }

}
