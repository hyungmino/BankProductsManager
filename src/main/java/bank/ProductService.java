package bank;

import common.ConditionDTO;
import common.ProductDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

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
}
