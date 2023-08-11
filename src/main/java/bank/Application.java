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
                case 3 : break;//productManager();
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
            System.out.println("9.종료하기");
            System.out.print("상품관리 번호 입력 : ");
            int no = sc.nextInt();

            switch (no){
                case 1 : deposit(); break;
                case 2 : //installmentSaving(); break;
                case 3 : //loan(); break;
                case 9 :
                    System.out.println("프로그램을 종료합니다.");
                    return;
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
            System.out.println("3.상품의 이자율 or 나이 검색하여 상품 목록보여주기");
            System.out.println("4.예금상품 은행별 조회하기");
            System.out.println("9.이전 메뉴로");
            System.out.print("상품관리 번호 입력 : ");
            int no = sc.nextInt();

            switch (no){
                case 1 : productController.selectDepositAll(); break;
                case 2 : productController.depositPrice(inputMaxPrice()); break;
                case 3 : productController.searchMenu(inputSearchProduct()); break;
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

    private static ConditionDTO inputSearchProduct() {

        Scanner sc = new Scanner(System.in);
        System.out.print("검색하실 조건을 입력해주세요(이자율 or 나이) : ");
        String condition = sc.nextLine();
        System.out.print("검색어를 입력해주세요 : ");
        String value = sc.nextLine();

        return new ConditionDTO(condition, value);
    }








    /*--------------------------------------------------------------------*/
    /*private static CategoryDTO inputCategory() {
        Scanner sc = new Scanner(System.in);

        System.out.print("카테고리를 입력해주세요(예금, 적금, 대출) : ");
        String category = sc.nextLine();

        return new CategoryDTO(1,category);
    }*/
    /*private static void categoryProductMenu() {

        Scanner sc = new Scanner(System.in);
        ProductController productController = new ProductController();

        do {
            System.out.println("=============== 카테고리 분류별 메뉴 =================");
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
                case 9 :
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못 된 메뉴를 선택하셨습니다.");
            }

        }while (true);
    }

    private static void deposit() {
        Scanner sc = new Scanner(System.in);
        ProductController productController = new ProductController();

        do {
            System.out.println("=============== 은행예금상품 =================");
            System.out.println("1.예금상품 전체조회");
            System.out.println("2.검색하실 예금금액의 최대 금액을 입력해주세요 : ");
            System.out.println("3.상품의 이자율 or 가입조건 나이 검색");
            System.out.println("4.예금상품 은행별 조회하기");
            System.out.println("5.상품관리하기");
            System.out.print("상품관리 번호 입력 : ");
            int no = sc.nextInt();

            switch (no){
                case 1 : productController.selectAlldeposit(); break;
                case 2 : break;
                default:
                    System.out.println("잘못 된 메뉴를 선택하셨습니다.");
            }

        }while (true);*/

}