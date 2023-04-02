package member;

import org.springframework.stereotype.Service;


import member.member;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.ArrayList;
import java.util.List;
@RestController

public class MemberController {
    List<member> memberList = new ArrayList<>();

    @RequestMapping(method = RequestMethod.GET, path = "save")
    public List<member> getRequest() {
        return memberList;
    }
    @RequestMapping(method = RequestMethod.POST, path = "save")
    public void postMember(@RequestBody member member) {
        System.out.println(memberList.size());
        System.out.println(member.getId());
        System.out.println(member.getName());
        System.out.println(member.getPassword());
        memberList.add(member);

    }






}
