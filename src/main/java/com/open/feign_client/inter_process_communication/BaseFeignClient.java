package com.open.feign_client.inter_process_communication;



import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.api.open.crud.api.exception.model.CrudApiResponse;

public interface BaseFeignClient<T> {

    @GetMapping("/{id}")
    ResponseEntity<CrudApiResponse<T>> getData(@PathVariable("id") int id);
}