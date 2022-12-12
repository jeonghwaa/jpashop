package jpabook.jpashop.repository.order.query;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jpabook.jpashop.domain.Address;
import jpabook.jpashop.domain.OrderStatus;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class OrderItemQueryDto {

    @JsonIgnore
    private Long orderId;       //주문번호
    private String ItemName;    //상품명
    private int orderPrice;     //주문 가격
    private int count;          //주문 수량

    public OrderItemQueryDto(Long orderId, String ItemName, int orderPrice, int count) {
        this.orderId = orderId;
        this.ItemName = ItemName;
        this.orderPrice = orderPrice;
        this.count = count;
    }
}
