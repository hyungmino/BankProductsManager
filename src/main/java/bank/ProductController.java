package bank;

import common.ProductDTO;

import java.util.List;
import java.util.Map;

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

    public void searchProductByNameOrCode(Map<String, Object> criteria) {

        List<ProductDTO> productList = productService.searchProductByNameOrCode(criteria);

        if (productList != null) {
            printResult.printProductList(productList);
        } else {
            printResult.printErrorMessage("searchProductByNameOrCode");
        }
    }


    public void registProduct(Map<String, String> criteria) {

        String productName = criteria.get("productName");
        double interestRate = Double.parseDouble(criteria.get("interestRate"));
        int categoryCode = Integer.parseInt(criteria.get("categoryCode"));
        int period = Integer.parseInt(criteria.get("period"));
        int age = Integer.parseInt(criteria.get("age"));
        int price = Integer.parseInt(criteria.get("price"));

        ProductDTO product = new ProductDTO();
        product.setProductName(productName);
        product.setInterestRate(interestRate);
        product.setCategoryCode(categoryCode);
        product.setPeriod(period);
        product.setAge(age);
        product.setPrice(price);

        if (productService.registProduct(product)){
            printResult.printSuccessMessage("insert");
        } else {
            printResult.printErrorMessage("insert");
        }


    }

    public void deleteProduct(Map<String, String> parameter) {

        int productCode = Integer.parseInt(parameter.get("productCode"));

        if(productService.deleteProductByCode(productCode)){
            printResult.printSuccessMessage("delete");
        }else {
            printResult.printErrorMessage("delete");
        }

    }
}
