package com.nttdata.escuela.bookstore.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "book-service")
public interface BookRestClient {
    @GetMapping("exist/{id}")
    Boolean findExistById(@PathVariable Integer id);
}
