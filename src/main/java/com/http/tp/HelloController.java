package com.http.tp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
@GetMapping("")
public String welcome()
{
return "<h1>heroku is simple to use<h1>";	
}
}
