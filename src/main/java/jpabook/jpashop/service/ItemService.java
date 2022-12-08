package jpabook.jpashop.service;

import jpabook.jpashop.Repository.ItemRepository;
import jpabook.jpashop.domain.item.Book;
import jpabook.jpashop.domain.item.Item;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class ItemService {

    private final ItemRepository itemRepository;

    @Transactional
    public void saveItem(Item item) {
        itemRepository.save(item);
    }

    public List<Item> findItems() {
        return itemRepository.findAll();
    }

    public Item findOne(Long itemId) {
        return itemRepository.findOne(itemId);
    }

    /**
     * 변경 감지
     */
 /*   @Transactional
    public Item updateItem(Long itemId, Book param) {
        Item findItem = itemRepository.findOne(itemId);
        findItem.setPrice(param.getPrice());
        findItem.setName(param.getName());
        findItem.setStockQuantity(param.getStockQuantity());

//      아래의 코드로 사용하는 것을 추천
//      set으로 일일이 설정할 경우 유지보수, 수정이 어렵고 수정사항 확인이 어려움
//      의미있는 메서드(update)를 만들어서 추적 가능하게 만듬
//      파라미터가 많을 경우 DTO 생성해서 만듬
//      findItem.update(price, name, stockQuanTity);

//      itemRepository.save(findItem); => 호출 필요 X
        return findItem;
    }
    */
    @Transactional
    public void updateItem(Long itemId, String name, int price, int stockQuantity) {
        Item findItem = itemRepository.findOne(itemId);
        findItem.setPrice(price);
        findItem.setName(name);
        findItem.setStockQuantity(stockQuantity);


    }
}
