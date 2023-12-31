package bank;

import common.ProductDTO;

import java.util.List;
import java.util.Map;

public interface ProductMapper {
    List<ProductDTO> selectAllMenu();

    List<ProductDTO> selectDepositAll();

    List<ProductDTO> depositPrice(int price);

    List<ProductDTO> maxInterestRate();

    List<ProductDTO> selectInstallmentSavingAll();

    List<ProductDTO> installmentSavingPrice(int price);

    List<ProductDTO> installmentSavingMaxInterestRate();

    List<ProductDTO> selectLoanAll();

    List<ProductDTO> loanPrice(int price);

    List<ProductDTO> loanMinInterestRate();

    List<ProductDTO> searchProductByNameOrCode(Map<String, Object> criteria);

    int modifyProduct(Map<String, Object> criteria);

    int insertProduct(ProductDTO product);

    int deleteProduct(int productCode);
}
