package mx.api.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@Value("${midato.suvalor}")
	String midato;
	
    @GetMapping("/hello")
    public String sendGreetings() {
        return "Hello, World!";
    }
    
    @GetMapping("")
    public String sendGreetinxgs() {
        return "Hello, Funciona!  "+midato;
    }
}
