package .controller;

import .entity.TApiDataLog;
import .service.TApiDataLogService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (TApiDataLog)表控制层
 *
 * @author makejava
 * @since 2020-04-30 11:18:22
 */
@RestController
@RequestMapping("tApiDataLog")
public class TApiDataLogController {
    /**
     * 服务对象
     */
    @Resource
    private TApiDataLogService tApiDataLogService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TApiDataLog selectOne(Integer id) {
        return this.tApiDataLogService.queryById(id);
    }

}