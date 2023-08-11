package bank;

import common.ConditionDTO;
import common.ProductDTO;

import java.util.List;

public interface ProductMapper {
    List<ProductDTO> selectAllMenu();

    List<ProductDTO> selectDepositAll();

    List<ProductDTO> depositPrice(int price);

    List<ProductDTO> searchMenu(ConditionDTO condition);

}
