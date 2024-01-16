package com.nttdata.escuela.libro.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "author-service")
public interface AuthorFeignClient {

    @GetMapping("/exists/{id}")
    Boolean existsAuthorById(@PathVariable("id") final Integer idAuthor);

}
