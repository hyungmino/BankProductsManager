package bank;

import common.ConditionDTO;
import common.ProductDTO;

import java.util.List;

public class ProductController {

    private final ProductService productService;
    private final PrintResult printResult;

    public ProductController(){
        productService = new ProductService();
        printResult = new PrintResult();

    }

    public void selectAllMenu() {
        List<ProductDTO> productList = productService.selectAllMenu();

        if(productList != null){
            printResult.printProductList(productList);
        }else {
            printResult.printErrorMessage("selectList");
        }

    }

    public void selectDepositAll() {
        List<ProductDTO> productList = productService.selectDepositAll();

        if(productList != null){
            printResult.printProductList(productList);
        }else {
            printResult.printErrorMessage("selectList");
        }


    }

    public void depositPrice(int price) {

        List<ProductDTO> productList = productService.depositPrice(price);

        if(productList != null){
            printResult.printProductList(productList);
        }else {
            printResult.printErrorMessage("depositPrice");
        }


    }


    public void searchMenu(ConditionDTO condition) {

        List<ProductDTO> productList = productService.searchMenu(condition);

        if(productList != null){
            printResult.printProductList(productList);
        }else {
            printResult.printErrorMessage("searchMenu");
        }

    }
}
