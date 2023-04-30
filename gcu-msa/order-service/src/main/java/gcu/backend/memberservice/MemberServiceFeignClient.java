package gcu.backend.memberservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("memberservice") // memberservice 라는 웹 서비스에서 사용자 정보를 가져온다.
public interface MemberServiceFeignClient {

        @GetMapping(value = "/member/{id}",
                consumes = "application/json")
        Member  getMemberId(@PathVariable("id") Long id);
}
