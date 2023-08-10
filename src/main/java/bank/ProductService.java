package bank;

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
}
