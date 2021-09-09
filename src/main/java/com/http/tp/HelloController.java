package com.http.tp;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.http.tp.classes.Livre;
@Controller

public class HelloController {
@GetMapping("/")
public String index(Model model) { // add `message`
	

model.addAttribute("message", " ceci est un message dynamique.");
// return view name
return "index";
}
@GetMapping("/livre")
public String livres(Model m)
{
	Livre l=new Livre("HTML FOR KIDS","jack pro", 20);
m.addAttribute("livre",l.toString());
return "livre";
}
}
