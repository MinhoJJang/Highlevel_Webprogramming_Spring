package gcu.backend.productservice;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("productservice")
public interface ProductServiceFeignClient {
    @GetMapping(value = "/product/{id}", consumes = "application/json")
    Product getProduct(@PathVariable String id);
}