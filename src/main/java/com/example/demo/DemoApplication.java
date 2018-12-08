package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import static lombok.AccessLevel.PRIVATE;

@SpringBootApplication
@FieldDefaults(level = PRIVATE, makeFinal = true)
public class DemoApplication {

  public static void main(String[] args) {
    SpringApplication.run(DemoApplication.class, args);
  }
}

@RepositoryRestResource
interface CatRepository extends JpaRepository<Cat, Long> {
}

@Data
@Entity
@NoArgsConstructor
@FieldDefaults(level = PRIVATE)
@AllArgsConstructor(onConstructor = @__(@Autowired))
class Cat {

  @Id
  @GeneratedValue
  Long id;

  String name;

  public Cat(String name) {
    this.name = name;
  }
}
