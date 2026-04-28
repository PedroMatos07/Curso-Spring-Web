package springweb.course.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springweb.course.entities.OrderItem;
import springweb.course.repositories.OrderItemRepository;

import java.util.List;
import java.util.Optional;

@Service
public class OrderItemService {
    @Autowired
    private OrderItemRepository orderItemRepository;

    public List<OrderItem> findAll(){
        return orderItemRepository.findAll();
    }

    public OrderItem findById(Long id){
        Optional<OrderItem> obj = orderItemRepository.findById(id);
        return obj.orElseThrow(()-> new RuntimeException("Order Item não encontrado"));
    }
}
