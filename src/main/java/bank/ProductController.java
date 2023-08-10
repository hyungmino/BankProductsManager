package bank;

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
}
