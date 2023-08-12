package bank;


import common.CategoryDTO;
import common.ConditionDTO;
import common.ProductDTO;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ProductController productController = new ProductController();

        do {
            System.out.println("=============== 은행상품관리 =================");
            System.out.println("1.상품 전체 조회");
            System.out.println("2.카테고리별 상품조회");
            System.out.println("3.상품관리하기");
            System.out.println("9.종료하기");
            System.out.print("상품관리 번호 입력 : ");
            int no = sc.nextInt();

            switch (no){
                case 1 : productController.selectAllMenu(); break;
                case 2 : categoryProductMenu(); break;
                case 3 : productManager(); break;
                case 9 :
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못 된 메뉴를 선택하셨습니다.");
            }

        }while (true);
    }


    private static void categoryProductMenu() {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("=============== 카테고리 =================");
            System.out.println("1.예금");
            System.out.println("2.적금");
            System.out.println("3.대출");
            System.out.println("9.이전 메뉴로");
            System.out.print("상품관리 번호 입력 : ");
            int no = sc.nextInt();

            switch (no){
                case 1 : deposit(); break;
                case 2 : installmentSaving(); break;
                case 3 : loan(); break;
                case 9 : return;
                default:
                    System.out.println("잘못 된 메뉴를 선택하셨습니다.");
            }

        }while (true);
    }



    private static void deposit() {

        Scanner sc = new Scanner(System.in);
        ProductController productController = new ProductController();

        do {
            System.out.println("=============== 예금 =================");
            System.out.println("1.예금상품 전체조회");
            System.out.println("2.원하는 예금금액대의 적합한 추천 메뉴 목록");
            System.out.println("3.상품의 이자율이 높은순으로 목록보기");
            System.out.println("9.이전 메뉴로");
            System.out.print("상품관리 번호 입력 : ");
            int no = sc.nextInt();

            switch (no){
                case 1 : productController.selectDepositAll(); break;
                case 2 : productController.depositPrice(inputMaxPrice()); break;
                case 3 : productController.maxInterestRate(); break;
                case 9 : return;
                default:
                    System.out.println("잘못 된 메뉴를 선택하셨습니다.");
            }

        }while (true);
    }



    private static int inputMaxPrice() {

        Scanner sc = new Scanner(System.in);
        System.out.print("검색하실 금액대의 최대 금액을 입력해주세요 : ");
        int price = sc.nextInt();

        return price;
    }


    private static void installmentSaving() {

        Scanner sc = new Scanner(System.in);
        ProductController productController = new ProductController();

        do {
            System.out.println("=============== 적금 =================");
            System.out.println("1.적금상품 전체조회");
            System.out.println("2.원하는 적금금액대의 적합한 추천 메뉴 목록");
            System.out.println("3.상품의 이자율이 높은순으로 목록보기");
            System.out.println("9.이전 메뉴로");
            System.out.print("상품관리 번호 입력 : ");
            int no = sc.nextInt();

            switch (no){
                case 1 : productController.selectInstallmentSavingAll(); break;
                case 2 : productController.installmentSavingPrice(inputInstallMaxPrice()); break;
                case 3 : productController.installmentSavingMaxInterestRate(); break;
                case 9 : return;
                default:
                    System.out.println("잘못 된 메뉴를 선택하셨습니다.");
            }

        }while (true);
    }

    private static int inputInstallMaxPrice() {

        Scanner sc = new Scanner(System.in);
        System.out.print("검색하실 금액대의 최대 금액을 입력해주세요 : ");
        int price = sc.nextInt();

        return price;
    }

    private static void loan() {

        Scanner sc = new Scanner(System.in);
        ProductController productController = new ProductController();

        do {
            System.out.println("=============== 대출 =================");
            System.out.println("1.대출상품 전체조회");
            System.out.println("2.원하는 대출금액대의 적합한 추천 메뉴 목록");
            System.out.println("3.상품의 이자율이 낮은순으로 목록보기");
            System.out.println("9.이전 메뉴로");
            System.out.print("상품관리 번호 입력 : ");
            int no = sc.nextInt();

            switch (no){
                case 1 : productController.selectLoanAll(); break;
                case 2 : productController.loanPrice(inputLoanMaxPrice()); break;
                case 3 : productController.loanMinInterestRate(); break;
                case 9 : return;
                default:
                    System.out.println("잘못 된 메뉴를 선택하셨습니다.");
            }

        }while (true);
    }

    private static int inputLoanMaxPrice() {

        Scanner sc = new Scanner(System.in);
        System.out.print("검색하실 금액대의 최대 금액을 입력해주세요 : ");
        int price = sc.nextInt();

        return price;

    }

    private static void productManager() {

        Scanner sc = new Scanner(System.in);
        ProductController productController = new ProductController();

        do {
            System.out.println("=============== 상품관리하기 =================");
            System.out.println("1.상품");
            System.out.println("2.원하는 대출금액대의 적합한 추천 메뉴 목록");
            System.out.println("3.상품의 이자율이 낮은순으로 목록보기");
            System.out.println("9.이전 메뉴로");
            System.out.print("상품관리 번호 입력 : ");
            int no = sc.nextInt();

            switch (no){
                case 1 :  break;
                case 2 :  break;
                case 3 :  break;
                case 9 : return;
                default:
                    System.out.println("잘못 된 메뉴를 선택하셨습니다.");
            }

        }while (true);
    }




}