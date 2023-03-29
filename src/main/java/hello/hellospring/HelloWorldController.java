package hello.hellospring;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloWorldController {
    @RequestMapping(method = RequestMethod.GET, path = "/member")

    public String name(@RequestParam(value = "name") String msg) {
        System.out.println(msg + "라고 하네요");
         return "이름은 :" + msg;
    }
}
