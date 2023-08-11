package bank;

import common.ConditionDTO;
import common.ProductDTO;

import java.util.List;

public class PrintResult {
    public void printProductList(List<ProductDTO> productList) {
        productList.forEach(System.out::println);
    }

    public void printErrorMessage(String errorCode) {
        String errorMessage = "";
        switch (errorCode){
            case "selectList" : errorMessage = "상품 목록 조회에 실패하였습니다."; break;
            case "depositPrice" : errorMessage = "원하는 금액대 조회에 실패하였습니다."; break;
            case "searchMenu" : errorMessage = "원하는 검색 조회에 실패하였습니다."; break;
        }


    }


}
