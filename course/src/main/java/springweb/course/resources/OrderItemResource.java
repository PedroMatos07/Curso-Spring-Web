package springweb.course.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springweb.course.entities.OrderItem;
import springweb.course.service.OrderItemService;

import java.util.List;

@RestController

@RequestMapping(value = "/orderItem")
public class OrderItemResource {
    @Autowired
    private OrderItemService orderItemService;

    @GetMapping
    public ResponseEntity<List<OrderItem>> findAll(){
        List<OrderItem> list = orderItemService.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping (value = "/{id}")
    public ResponseEntity<OrderItem> findById(@PathVariable Long id){
        OrderItem obj = orderItemService.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}
