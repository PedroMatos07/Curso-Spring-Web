package springweb.course.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import springweb.course.entities.Category;
import springweb.course.entities.enums.OrderStatus;
import springweb.course.repositories.CategoryRepository;
import springweb.course.repositories.OrderRepository;
import springweb.course.repositories.UserRepository;
import springweb.course.entities.User;
import springweb.course.entities.Order;

import java.time.Instant;
import java.util.Arrays;

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

        Order o1 = new Order(Instant.parse("2019-06-20T19:53:07Z"),null,u1, OrderStatus.DELIVERED);
        Order o2 = new Order(Instant.parse("2019-07-21T03:42:10Z"),null,u2,OrderStatus.PAID);
        Order o3 = new Order(Instant.parse("2019-07-22T15:21:22Z"),null,u1,OrderStatus.SHIPPED);

        orderRepository.saveAll(Arrays.asList(o1,o2,o3));


        Category cat1 = new Category(null, "Electronics");
        Category cat2 = new Category(null, "Books");
        Category cat3 = new Category(null, "Computers");

        categoryRepository.saveAll(Arrays.asList(cat1,cat2,cat3));
    }
}
