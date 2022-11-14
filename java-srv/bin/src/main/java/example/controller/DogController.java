package example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DogController {

  @GetMapping("/")
  public String home1() {
      return "/index";
  }

}
