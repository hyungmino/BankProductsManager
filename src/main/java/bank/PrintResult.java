package bank;

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
            case "searchProductByNameOrCode" : errorMessage = "검색조건 조회에 실패하였습니다."; break;
            case "update" : errorMessage = "상품수정을 실패하였습니다."; break;
            case "insert" : errorMessage = "상품등록을 실패하였습니다."; break;
            case "delete" : errorMessage = "상품삭제를 실패하였습니다."; break;
        }


    }


    public void printSuccessMessage(String successCode) {
        String successMessage = "";
        switch (successCode){
            case "update" : successMessage = "상품수정을 성공했습니다."; break;
            case "insert" : successMessage = "상품등록을 성공했습니다."; break;
            case "delete" : successMessage = "상품삭제를 성공했습니다."; break;
        }


    }
}
