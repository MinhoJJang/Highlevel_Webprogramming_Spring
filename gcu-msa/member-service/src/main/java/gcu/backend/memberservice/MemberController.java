package gcu.backend.memberservice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class MemberController {
    final MemberRepository memberRepository;

    public MemberController(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @PostMapping("/api/member")
    public String create(@RequestBody Member member) {
        memberRepository.save(member);
        return "create ok";
    }
    @GetMapping("/api/member/{id}")
    public Optional<Member> show(@PathVariable("id") Long id) {
        return memberRepository.findById(id);
    }
    @GetMapping("/api/members")
    public List<Member> showAll() {
        return memberRepository.findAll();
    }
    @PutMapping("/api/member/{id}")
    public ResponseEntity update(@PathVariable("id") Long id, @RequestBody Member user){
        Optional<Member> userUpdate = memberRepository.findById(id);
        if (userUpdate.isPresent()) {
            Member _user = userUpdate.get();
            _user.setName(user.getName());
            _user.setPassword(user.getPassword());
            return new ResponseEntity<>(memberRepository.save(_user), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping("/api/member/{id}")
    public String delete(@PathVariable("id") Long id) {
        memberRepository.deleteById(id);
        return "delete ok";
    }
}