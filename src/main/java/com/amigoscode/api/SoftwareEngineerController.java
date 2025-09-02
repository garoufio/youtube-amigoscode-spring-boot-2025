package com.amigoscode.api;

import com.amigoscode.entity.SoftwareEngineer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/software-engineers")
public class SoftwareEngineerController {
  
  @GetMapping
  public List<SoftwareEngineer> getSoftwareEngineers() {
    return List.of(
        new SoftwareEngineer(1, "James", "react, javascript, nodejs, sql, html, css"),
        new SoftwareEngineer(2, "Rachel", "java, spring, spring-boot, sql, docker")
    );
  }
  
  //-------------------------------------------------------------------------------------------------------------------

}
