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
            case "selectDepositList" : errorMessage = "예금상품 목록 조회에 실패하였습니다."; break;
            case "depositPrice" : errorMessage = "원하는 금액대 예금상품 조회에 실패하였습니다."; break;
            case "maxInterestRateList" : errorMessage = "이자율높은 예금상품 목록 조회에 실패하였습니다."; break;
            case "selectInstallmentSavingList" : errorMessage = "적금상품 목록 조회에 실패하였습니다."; break;
            case "installmentSavingPrice" : errorMessage = "원하는 금액대 적금상품 조회에 실패하였습니다."; break;
            case "installmentSavingMaxInterestRate" : errorMessage = "이자율높은 적금상품 목록 조회에 실패하였습니다."; break;
            case "selectLoanAll" : errorMessage = "대출상품 목록 조회에 실패하였습니다."; break;
            case "loanPrice" : errorMessage = "원하는 금액대 대출상품 조회에 실패하였습니다."; break;
            case "loanMinInterestRate" : errorMessage = "이자율낮은 대출상품 목록 조회에 실패하였습니다."; break;

        }


    }


}
