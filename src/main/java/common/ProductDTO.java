package common;

public class ProductDTO {

    private int productCode;
    private String productName;
    private int interestRate;
    private int categoryCode;
    private int period;
    private int age;
    private int price;

    public ProductDTO() {
    }


    public ProductDTO(int productCode, String productName, int interestRate, int categoryCode, int period, int age, int price) {
        this.productCode = productCode;
        this.productName = productName;
        this.interestRate = interestRate;
        this.categoryCode = categoryCode;
        this.period = period;
        this.age = age;
        this.price = price;
    }

    public int getProductCode() {
        return productCode;
    }

    public void setProductCode(int productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(int interestRate) {
        this.interestRate = interestRate;
    }

    public int getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(int categoryCode) {
        this.categoryCode = categoryCode;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ProductDTO{" +
                "productCode=" + productCode +
                ", productName='" + productName + '\'' +
                ", interestRate=" + interestRate +
                ", categoryCode=" + categoryCode +
                ", period=" + period +
                ", age=" + age +
                ", price=" + price +
                '}';
    }
}
