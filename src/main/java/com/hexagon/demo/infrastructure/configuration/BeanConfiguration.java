package com.hexagon.demo.infrastructure.configuration;

import com.hexagon.demo.DemoApplication;
import com.hexagon.demo.domain.repository.OrderRepository;
import com.hexagon.demo.domain.service.DomainOrderService;
import com.hexagon.demo.domain.service.OrderService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = DemoApplication.class)
public class BeanConfiguration {

    @Bean
    OrderService orderService(final OrderRepository orderRepository) {
        return new DomainOrderService(orderRepository);
    }
}
