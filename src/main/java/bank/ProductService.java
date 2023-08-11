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


    public List<ProductDTO> searchMenu(ConditionDTO condition) {

        SqlSession sqlSession = getSqlSession();
        productMapper = sqlSession.getMapper(ProductMapper.class);

        List<ProductDTO> productList = productMapper.searchMenu(condition);

        sqlSession.close();

        return productList;
    }
}
