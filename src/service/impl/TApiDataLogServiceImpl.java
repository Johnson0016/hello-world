package .service.impl;

import .entity.TApiDataLog;
import .dao.TApiDataLogDao;
import .service.TApiDataLogService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TApiDataLog)表服务实现类
 *
 * @author makejava
 * @since 2020-04-30 11:18:21
 */
@Service("tApiDataLogService")
public class TApiDataLogServiceImpl implements TApiDataLogService {
    @Resource
    private TApiDataLogDao tApiDataLogDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TApiDataLog queryById(Integer id) {
        return this.tApiDataLogDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TApiDataLog> queryAllByLimit(int offset, int limit) {
        return this.tApiDataLogDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tApiDataLog 实例对象
     * @return 实例对象
     */
    @Override
    public TApiDataLog insert(TApiDataLog tApiDataLog) {
        this.tApiDataLogDao.insert(tApiDataLog);
        return tApiDataLog;
    }

    /**
     * 修改数据
     *
     * @param tApiDataLog 实例对象
     * @return 实例对象
     */
    @Override
    public TApiDataLog update(TApiDataLog tApiDataLog) {
        this.tApiDataLogDao.update(tApiDataLog);
        return this.queryById(tApiDataLog.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.tApiDataLogDao.deleteById(id) > 0;
    }
}