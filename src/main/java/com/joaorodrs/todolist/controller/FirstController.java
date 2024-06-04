package com.joaorodrs.todolist.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/first-route")
public class FirstController {

  @GetMapping()
  public String firstMessage() {
    return "A message";
  }
}
