package br.com.fabex.app.web.graphql.customer.domain;

import java.util.Arrays;
import java.util.List;

public record Customer(Long id, String name, String document) {
    private static final List<Customer> costumers = Arrays.asList(
            new Customer(1L, "Effective Java", "345678"),
            new Customer(2L, "Hitchhiker's Guide to the Galaxy", "09876"),
            new Customer(3L, "Down Under", "56789")
    );

    public static Customer getById(Long id) {
        return new Customer(3L, "Down Under", "56789");//costumers.get(0);
    }
}
