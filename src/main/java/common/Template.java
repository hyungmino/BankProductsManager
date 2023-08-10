package common;

import bank.ProductMapper;
import org.apache.ibatis.datasource.pooled.PooledDataSource;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;

public class Template {

    /* SqlSessionFactory는 애플리케이션이 실행 되는 동안 존재해야 하며,
    * 여러 차례 다시 빌드하지 않는 것이 가장 좋은 형태이다.
    * 애플리케이션 스코프를 관리하기 위해 가장 간단한 방법은 싱글톤 패턴을 이용하는 것이다.
    * */

    private static String DRIVER = "oracle.jdbc.driver.OracleDriver";
    private static String URL = "jdbc:oracle:thin:@localhost:1521:xe";
    private static String USER = "C##BANK";
    private static String PASSWORD = "BANK";
    private static SqlSessionFactory sqlSessionFactory;

    public static SqlSession getSqlSession(){


        if(sqlSessionFactory == null){
            Environment environment = new Environment("dev"
                    , new JdbcTransactionFactory()
                    , new PooledDataSource(DRIVER, URL, USER, PASSWORD));

            Configuration configuration = new Configuration(environment);

            configuration.addMapper(ProductMapper.class);      // 이 class의 메타정보 addMapper(Class<T> type)를 추가한다.

            sqlSessionFactory = new SqlSessionFactoryBuilder().build(configuration);

            }


        /* SqlSession은 스레드에 안전하지 않고 공유 되지 않아야 하므로 요청 시마다 생성해야 한다.*/
        SqlSession sqlSession = sqlSessionFactory.openSession(false);
        // autoCommit false => commit과 rollback 구문 설정

        return sqlSession;      // 실행될때마다 sqlSession객체 반환
    }
}
