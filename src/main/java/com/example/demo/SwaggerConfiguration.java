package com.example.demo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import lombok.SneakyThrows;
import lombok.experimental.FieldDefaults;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static lombok.AccessLevel.PRIVATE;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("api/dogs")
@Api(value = "DogControllerAPI", produces = APPLICATION_JSON_VALUE)
class DogController {

  @NotNull
  @GetMapping
  @SneakyThrows
  @Contract(pure = true)
  @ApiOperation("Get dogs")
  @ApiResponse(code = 200, message = "OK", response = String.class)
  public String getAll() {
    return "Dogs";
  }

}

@Configuration
@EnableSwagger2
@PropertySource("classpath:swagger.properties")
public class SwaggerConfiguration {

  @Bean
  public Docket productApi() {
    return new Docket(DocumentationType.SWAGGER_2)
        .apiInfo(new ApiInfoBuilder()
            .title("Products REST API")
            .description("Description")
            .license("My License")
            .version("1.0")
            .build())
        .pathMapping("/")
        .select()
        .paths(PathSelectors.regex("/api.*"))
        .build();
  }
}