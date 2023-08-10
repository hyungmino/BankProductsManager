package bank;


import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ProductController productController = new ProductController();

        do {
            System.out.println("=============== 은행상품관리 =================");
            System.out.println("1.상품 전체 조회");
            System.out.println("2.");
            System.out.println("3.");
            System.out.println("4.");
            System.out.print("메뉴 관리 번호 입력 : ");
            int no = sc.nextInt();

            switch (no){
                case 1 : productController.selectAllMenu(); break;
                default:
                    System.out.println("잘못 된 메뉴를 선택하셨습니다.");
            }

        }while (true);
    }

}