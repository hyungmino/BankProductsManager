package bank;

import common.ConditionDTO;
import common.ProductDTO;

import java.util.List;

public class ProductController {

    private final ProductService productService;
    private final PrintResult printResult;

    public ProductController() {
        productService = new ProductService();
        printResult = new PrintResult();

    }

    public void selectAllMenu() {
        List<ProductDTO> productList = productService.selectAllMenu();

        if (productList != null) {
            printResult.printProductList(productList);
        } else {
            printResult.printErrorMessage("selectList");
        }

    }

    public void selectDepositAll() {
        List<ProductDTO> productList = productService.selectDepositAll();

        if (productList != null) {
            printResult.printProductList(productList);
        } else {
            printResult.printErrorMessage("selectDepositList");
        }


    }

    public void depositPrice(int price) {

        List<ProductDTO> productList = productService.depositPrice(price);

        if (productList != null) {
            printResult.printProductList(productList);
        } else {
            printResult.printErrorMessage("depositPrice");
        }

    }


    public void maxInterestRate() {

        List<ProductDTO> productList = productService.maxInterestRate();

        if (productList != null) {
            printResult.printProductList(productList);
        } else {
            printResult.printErrorMessage("maxInterestRateList");
        }
    }

    public void selectInstallmentSavingAll() {

        List<ProductDTO> productList = productService.selectInstallmentSavingAll();

        if (productList != null) {
            printResult.printProductList(productList);
        } else {
            printResult.printErrorMessage("selectInstallmentSavingList");
        }
    }

    public void installmentSavingPrice(int price) {

        List<ProductDTO> productList = productService.installmentSavingPrice(price);

        if (productList != null) {
            printResult.printProductList(productList);
        } else {
            printResult.printErrorMessage("installmentSavingPrice");

        }
    }

    public void installmentSavingMaxInterestRate() {

        List<ProductDTO> productList = productService.installmentSavingMaxInterestRate();

        if (productList != null) {
            printResult.printProductList(productList);
        } else {
            printResult.printErrorMessage("installmentSavingMaxInterestRate");
        }
    }

    public void selectLoanAll() {

        List<ProductDTO> productList = productService.selectLoanAll();

        if (productList != null) {
            printResult.printProductList(productList);
        } else {
            printResult.printErrorMessage("selectLoanAll");
        }
    }

    public void loanPrice(int price) {

        List<ProductDTO> productList = productService.loanPrice(price);

        if (productList != null) {
            printResult.printProductList(productList);
        } else {
            printResult.printErrorMessage("loanPrice");

        }
    }

    public void loanMinInterestRate() {

        List<ProductDTO> productList = productService.loanMinInterestRate();

        if (productList != null) {
            printResult.printProductList(productList);
        } else {
            printResult.printErrorMessage("loanMinInterestRate");
        }
    }
}
