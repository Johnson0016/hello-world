package .dao;

import .entity.TApiDataLog;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (TApiDataLog)表数据库访问层
 *
 * @author makejava
 * @since 2020-04-30 11:18:21
 */
public interface TApiDataLogDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TApiDataLog queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TApiDataLog> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tApiDataLog 实例对象
     * @return 对象列表
     */
    List<TApiDataLog> queryAll(TApiDataLog tApiDataLog);

    /**
     * 新增数据
     *
     * @param tApiDataLog 实例对象
     * @return 影响行数
     */
    int insert(TApiDataLog tApiDataLog);

    /**
     * 修改数据
     *
     * @param tApiDataLog 实例对象
     * @return 影响行数
     */
    int update(TApiDataLog tApiDataLog);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}