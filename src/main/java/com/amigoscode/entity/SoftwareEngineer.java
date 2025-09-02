package com.amigoscode.entity;

import lombok.Getter;
import lombok.Setter;
import java.util.Objects;

@Getter
@Setter
public class SoftwareEngineer {
  
  private Integer id;
  private String name;
  private String techStack;
  
  //-------------------------------------------------------------------------------------------------------------------
  
  public SoftwareEngineer(Integer id, String name, String techStack) {
    this.id = id;
    this.name = name;
    this.techStack = techStack;
  }
  
  //-------------------------------------------------------------------------------------------------------------------
  
  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) return false;
    
    SoftwareEngineer that = (SoftwareEngineer) o;
    return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(techStack, that.techStack);
  }
  
  //-------------------------------------------------------------------------------------------------------------------
  
  @Override
  public int hashCode() {
    return Objects.hash(id, name, techStack);
  }
  
  
  //-------------------------------------------------------------------------------------------------------------------
  
}
