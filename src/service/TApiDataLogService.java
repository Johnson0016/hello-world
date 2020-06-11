package .service;

import .entity.TApiDataLog;
import java.util.List;

/**
 * (TApiDataLog)表服务接口
 *
 * @author makejava
 * @since 2020-04-30 11:18:21
 */
public interface TApiDataLogService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TApiDataLog queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TApiDataLog> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tApiDataLog 实例对象
     * @return 实例对象
     */
    TApiDataLog insert(TApiDataLog tApiDataLog);

    /**
     * 修改数据
     *
     * @param tApiDataLog 实例对象
     * @return 实例对象
     */
    TApiDataLog update(TApiDataLog tApiDataLog);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}