package com.spproject.springservices.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.spproject.springservices.entities.Category;
import com.spproject.springservices.entities.Order;
import com.spproject.springservices.entities.User;
import com.spproject.springservices.entities.enums.OrderStatus;
import com.spproject.springservices.repositories.CategoryRepository;
import com.spproject.springservices.repositories.OrderRepository;
import com.spproject.springservices.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private CategoryRepository categoryRepository;
    
    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
        User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");

        userRepository.saveAll(Arrays.asList(u1,u2));

        Order o1 = new Order (null, Instant.now(),OrderStatus.PAID, u2 );
        Order o2 = new Order (null, Instant.now(), OrderStatus.CANCELED, u1);
        Order o3 = new Order (null, Instant.now(),OrderStatus.WAITING_PAYMENT, u1 );
        orderRepository.saveAll(Arrays.asList(o1,o2,o3));

        Category cat1 = new Category(null, "Electronics");
        Category cat2 = new Category(null, "Books");
        Category cat3 = new Category(null, "Computers");

        categoryRepository.saveAll(Arrays.asList(cat1,cat2,cat3));
    }

}
