package br.com.fabex.app.web.graphql.customer.controller;

import br.com.fabex.app.web.graphql.customer.domain.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;

@Controller
public class CustomerController {

    @QueryMapping
    public Customer getCustomerById(@Argument Long id) {
        return Customer.getById(id);
    }
}
