package jpabook.jpashop.service.query;

import jpabook.jpashop.api.OrderApiController;
import jpabook.jpashop.domain.Order;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static java.util.stream.Collectors.toList;

@Transactional(readOnly = true)
public class OrderQueryService {
//    //   쿼리용 서비스를 별도로 정리하는 것이 좋다.
//    public List<OrderApiController.OrderDto> orderV3() {
//        List<Order> orders = orderRepository.findAllWithItem();
//
////        for (Order order : orders) {
////            System.out.println("order ref = " + order + " id = " + order.getId());
////        }
//        List<OrderApiController.OrderDto> result = orders.stream()
//                .map(o -> new OrderApiController.OrderDto(o))
//                .collect(toList());
//
//        return result;
//
//    }
}