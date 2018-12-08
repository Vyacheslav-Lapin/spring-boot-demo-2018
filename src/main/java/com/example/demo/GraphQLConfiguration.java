package com.example.demo;

//import com.coxautodev.graphql.tools.GraphQLQueryResolver;
//import lombok.*;
//import lombok.experimental.FieldDefaults;
//import org.jetbrains.annotations.Contract;
//import org.jetbrains.annotations.NotNull;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//import org.springframework.stereotype.Service;
//import org.springframework.web.client.RestTemplate;
//
//import javax.persistence.*;
//
//import java.math.BigDecimal;
//import java.util.Optional;
//import java.util.Set;
//
//import static javax.persistence.FetchType.EAGER;
//import static lombok.AccessLevel.PRIVATE;

//@Data
//@Entity
//@AllArgsConstructor
//@FieldDefaults(level = PRIVATE)
//class Cart {
//
//  @Id
//  @GeneratedValue
//  Long id;
//
//  @ElementCollection(fetch = EAGER)
//  Set<Item> items;
//
//  @NotNull
//  public final BigDecimal getSubTotal() {
//      return items.stream()
//          .map(Item::getTotal)
//          .reduce(BigDecimal.ZERO, BigDecimal::add);
//  }
//
//  public void addItem(String productId, int quantity, BigDecimal total) {
//    if (items.stream()
//        .filter(item -> item.getProductId().equals(productId))
//        .findFirst()
//        .isEmpty()
//        && !items.add(new Item(productId, quantity, total)))
//      throw new RuntimeException("Can't add item to cart!");
//  }
//
//}
//
//@Configuration
//@AllArgsConstructor
//@FieldDefaults(level = PRIVATE, makeFinal = true)
public class GraphQLConfiguration {

//  CartService cartService;
//
////  RestTemplate restTemplate;
//
//  @Bean
//  @NotNull
//  @SneakyThrows
//  public GraphQLQueryResolver queryResolver() {
//      return new GraphQLQueryResolver() {
//        @NotNull
//        @SneakyThrows
//        @Contract(pure = true)
//        public final Cart cart(@NotNull Long id) {
//            return cartService.findCart(id)
//                .orElseThrow(() -> new RuntimeException("There is no cart with id " + id));
//        }
//      };
//  }


}

//@Data
//@Embeddable
//@NoArgsConstructor
//@AllArgsConstructor
//@FieldDefaults(level = PRIVATE)
//class Item {
//
//  @Column(nullable = false)
//  String productId;
//
//  @Column(nullable = false)
//  int quantity;
//
//  @Column(nullable = false)
//  BigDecimal total;
//}
//
//@Service
//@AllArgsConstructor
//@FieldDefaults(level = PRIVATE, makeFinal = true)
//class CartService {
//
//  CartRepository cartRepository;
//
//  public Optional<Cart> findCart(Long id) {
//    return cartRepository.findById(id);
//  }
//}
//
//@EnableJpaRepositories
//interface CartRepository extends JpaRepository<Cart, Long> {
//}