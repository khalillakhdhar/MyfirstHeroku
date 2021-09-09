package com.http.tp;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller

public class HelloController {
@GetMapping("/")
public String index(Model model) { // add `message`
	

model.addAttribute("message", " ceci est un message dynamique.");
// return view name
return "index";
}
}
