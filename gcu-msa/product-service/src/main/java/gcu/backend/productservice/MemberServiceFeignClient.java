package gcu.backend.productservice;

import gcu.backend.memberservice.Member;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("memberservice")
public interface MemberServiceFeignClient {
        @GetMapping(value = "/member", consumes = "application/json")
        Member getMember();
}