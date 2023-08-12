package bank;

import common.ProductDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;
import java.util.Map;

import static common.Template.getSqlSession;

public class ProductService {

    private ProductMapper productMapper;

    public List<ProductDTO> selectAllMenu() {

        SqlSession sqlSession = getSqlSession();

        productMapper = sqlSession.getMapper(ProductMapper.class);
        List<ProductDTO> productList = productMapper.selectAllMenu();

        sqlSession.close();

        return productList;

    }

    public List<ProductDTO> selectDepositAll() {

        SqlSession sqlSession = getSqlSession();

        productMapper = sqlSession.getMapper(ProductMapper.class);
        List<ProductDTO> productList = productMapper.selectDepositAll();

        sqlSession.close();

        return productList;
    }

    public List<ProductDTO> depositPrice(int price) {

        SqlSession sqlSession = getSqlSession();
        productMapper = sqlSession.getMapper(ProductMapper.class);

        List<ProductDTO> productList = productMapper.depositPrice(price);

        sqlSession.close();

        return productList;
    }


    public List<ProductDTO> maxInterestRate() {

        SqlSession sqlSession = getSqlSession();
        productMapper = sqlSession.getMapper(ProductMapper.class);

        List<ProductDTO> productList = productMapper.maxInterestRate();

        sqlSession.close();

        return productList;
    }

    public List<ProductDTO> selectInstallmentSavingAll() {

        SqlSession sqlSession = getSqlSession();

        productMapper = sqlSession.getMapper(ProductMapper.class);
        List<ProductDTO> productList = productMapper.selectInstallmentSavingAll();

        sqlSession.close();

        return productList;
    }

    public List<ProductDTO> installmentSavingPrice(int price) {

        SqlSession sqlSession = getSqlSession();
        productMapper = sqlSession.getMapper(ProductMapper.class);

        List<ProductDTO> productList = productMapper.installmentSavingPrice(price);

        sqlSession.close();

        return productList;
    }

    public List<ProductDTO> installmentSavingMaxInterestRate() {

        SqlSession sqlSession = getSqlSession();
        productMapper = sqlSession.getMapper(ProductMapper.class);

        List<ProductDTO> productList = productMapper.installmentSavingMaxInterestRate();

        sqlSession.close();

        return productList;
    }

    public List<ProductDTO> selectLoanAll() {

        SqlSession sqlSession = getSqlSession();
        productMapper = sqlSession.getMapper(ProductMapper.class);

        List<ProductDTO> productList = productMapper.selectLoanAll();

        sqlSession.close();

        return productList;

    }

    public List<ProductDTO> loanPrice(int price) {

        SqlSession sqlSession = getSqlSession();
        productMapper = sqlSession.getMapper(ProductMapper.class);

        List<ProductDTO> productList = productMapper.loanPrice(price);

        sqlSession.close();

        return productList;
    }

    public List<ProductDTO> loanMinInterestRate() {

        SqlSession sqlSession = getSqlSession();
        productMapper = sqlSession.getMapper(ProductMapper.class);

        List<ProductDTO> productList = productMapper.loanMinInterestRate();

        sqlSession.close();

        return productList;
    }

    public List<ProductDTO> searchProductByNameOrCode(Map<String, Object> criteria) {

        SqlSession sqlSession = getSqlSession();
        productMapper = sqlSession.getMapper(ProductMapper.class);

        List<ProductDTO> productList = productMapper.searchProductByNameOrCode(criteria);

        sqlSession.close();

        return productList;

    }


    public boolean modifyProduct(Map<String, Object> criteria) {

        SqlSession sqlSession = getSqlSession();
        productMapper = sqlSession.getMapper(ProductMapper.class);

        int result = productMapper.modifyProduct(criteria);

        if(result > 0){
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result > 0;
    }

    public boolean registProduct(ProductDTO product) {

        SqlSession sqlSession = getSqlSession();
        productMapper = sqlSession.getMapper(ProductMapper.class);

        int result = productMapper.insertProduct(product);

        if(result > 0){
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result > 0;
    }

    public boolean deleteProductByCode(int productCode) {

        SqlSession sqlSession = getSqlSession();
        productMapper = sqlSession.getMapper(ProductMapper.class);

        int result = productMapper.deleteProduct(productCode);

        if(result > 0){
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }
        sqlSession.close();
        return result > 0;
    }
}
