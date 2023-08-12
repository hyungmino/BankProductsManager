package bank;

import common.ConditionDTO;
import common.ProductDTO;

import java.util.List;

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
}
