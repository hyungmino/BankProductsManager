package bank;



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
        ProductService productService = new ProductService();

        do {
            System.out.println("=============== 상품관리하기 =================");
            System.out.println("1.상품이름 혹은 상품코드로 조회(검색조건 없을 시 전체조회)");
            System.out.println("2.원하는 상품만 정보 수정");
            System.out.println("3.상품 추가하기");
            System.out.println("4.상품 삭제하기");
            System.out.println("9.이전 메뉴로");
            System.out.print("상품관리 번호 입력 : ");
            int no = sc.nextInt();

            switch (no){
                case 1 :  productController.searchProductByNameOrCode(inputSearchMap()); break;
                case 2 :  productService.modifyProduct(inputChangeInfo()); break;
                case 3 :  productController.registProduct(inputInfo()); break;
                case 4 :  productController.deleteProduct(inputProductCode()); break;
                case 9 : return;
                default:
                    System.out.println("잘못 된 메뉴를 선택하셨습니다.");
            }

        }while (true);
    }




    private static Map<String, Object> inputSearchMap() {

        Scanner sc = new Scanner(System.in);
        System.out.print("검색할 조건을 입력하세요(상품이름 or 상품카테고리코드 or 조건모두 or 전체조회) : ");
        String condition = sc.nextLine();

        Map<String, Object> criteria = new HashMap<>();
        if("상품이름".equals(condition)){

            System.out.print("검색할 상품이름을 입력하세요 : ");
            String nameValue = sc.nextLine();
            criteria.put("nameValue", nameValue);

        } else if ("상품카테고리코드".equals(condition)) {

            System.out.print("검색할 상품카테고리코드를 입력하세요 : ");
            int codeValue = sc.nextInt();
            criteria.put("codeValue", codeValue);

        } else if ("조건모두".equals(condition)) {

            System.out.print("검색할 상품이름을 입력하세요 : " );
            String nameValue = sc.nextLine();
            System.out.print("검색할 상품코드를 입력하세요 : ");
            int codeValue = sc.nextInt();
            criteria.put("nameValue", nameValue);
            criteria.put("codeValue", codeValue);

        }

        return criteria;
    }

    private static Map<String, Object> inputChangeInfo() {

        Scanner sc = new Scanner(System.in);
        System.out.print("변경할 상품 코드를 입력하세요 : ");
        int productCode = sc.nextInt();
        sc.nextLine();
        System.out.print("변경할 상품 이름을 입력하세요 : ");
        String productName = sc.nextLine();
        System.out.print("변경할 상품 이자율을 입력하세요(소숫점 2자리까지만 입력) : ");
        double interestRate = sc.nextDouble();
        System.out.print("변경할 상품 카테고리코드를 입력하세요(1.예금 2.적금 3.대출) : ");
        int categoryCode = sc.nextInt();
        System.out.print("변경할 상품 기간을 입력하세요 : ");
        int period = sc.nextInt();
        System.out.print("변경할 상품 나이를 입력하세요 : ");
        int age = sc.nextInt();
        System.out.print("변경할 상품 금액을 입력하세요 : ");
        int price = sc.nextInt();

        Map<String, Object> criteria = new HashMap<>();
        criteria.put("productCode", productCode);
        criteria.put("productName", productName);
        criteria.put("interestRate", interestRate);
        criteria.put("categoryCode", categoryCode);
        criteria.put("period", period);
        criteria.put("age", age);
        criteria.put("price", price);

        return criteria;
    }

    private static Map<String, String> inputInfo() {

        Scanner sc = new Scanner(System.in);

        System.out.print("상품 이름을 입력하세요 : ");
        String productName = sc.nextLine();
        System.out.print("상품 이자율을 입력하세요(소숫점 2자리까지만 입력) : ");
        String interestRate = sc.nextLine();
        System.out.print("상품 카테고리코드를 입력하세요(1.예금 2.적금 3.대출) : ");
        String categoryCode = sc.nextLine();
        System.out.print("상품 기간을 입력하세요 : ");
        String period = sc.nextLine();
        System.out.print("상품 나이를 입력하세요 : ");
        String age = sc.nextLine();
        System.out.print("상품 금액을 입력하세요 : ");
        String price = sc.nextLine();

        Map<String, String> criteria = new HashMap<>();
        criteria.put("productName", productName);
        criteria.put("interestRate", interestRate);
        criteria.put("categoryCode", categoryCode);
        criteria.put("period", period);
        criteria.put("age", age);
        criteria.put("price", price);

        return criteria;
    }

    private static Map<String, String> inputProductCode() {

        Scanner sc = new Scanner(System.in);
        System.out.print("상품 코드를 입력하세요 : ");
        String productCode = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("productCode", productCode);

        return parameter;

    }

}