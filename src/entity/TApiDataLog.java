package entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (TApiDataLog)实体类
 *
 * @author makejava
 * @since 2020-04-30 11:18:21
 */
public class TApiDataLog implements Serializable {
    private static final long serialVersionUID = 558787539995464427L;
    
    private Integer id;
    /**
    * 批编号
    */
    private String batchid;
    /**
    *  接口名
    */
    private String path;
    /**
    * 产品编号
    */
    private String code;
    /**
    * 数据uuid
    */
    private String indexid;
    /**
    *  主键字段
    */
    private String primarykey;
    /**
    * 主键内容
    */
    private String primaryvalue;
    /**
    * 数据内容
    */
    private String rawdata;
    /**
    * 数据内容摘要
    */
    private String rawmd5;
    /**
    * 创建时间
    */
    private Date createts;
    /**
    * 入库主数据
    */
    private String indexdata;
    /**
    * 处理日志
    */
    private String logstr;
    /**
    * 入库扩展数据
    */
    private String expanddata;
    /**
    * 入库状态 1 insert 2 update 0 none 3还原
    */
    private String state;
    /**
    * 主表原数据
    */
    private String indexDblog;
    /**
    * item表原数据
    */
    private String expandDblog;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBatchid() {
        return batchid;
    }

    public void setBatchid(String batchid) {
        this.batchid = batchid;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getIndexid() {
        return indexid;
    }

    public void setIndexid(String indexid) {
        this.indexid = indexid;
    }

    public String getPrimarykey() {
        return primarykey;
    }

    public void setPrimarykey(String primarykey) {
        this.primarykey = primarykey;
    }

    public String getPrimaryvalue() {
        return primaryvalue;
    }

    public void setPrimaryvalue(String primaryvalue) {
        this.primaryvalue = primaryvalue;
    }

    public String getRawdata() {
        return rawdata;
    }

    public void setRawdata(String rawdata) {
        this.rawdata = rawdata;
    }

    public String getRawmd5() {
        return rawmd5;
    }

    public void setRawmd5(String rawmd5) {
        this.rawmd5 = rawmd5;
    }

    public Date getCreatets() {
        return createts;
    }

    public void setCreatets(Date createts) {
        this.createts = createts;
    }

    public String getIndexdata() {
        return indexdata;
    }

    public void setIndexdata(String indexdata) {
        this.indexdata = indexdata;
    }

    public String getLogstr() {
        return logstr;
    }

    public void setLogstr(String logstr) {
        this.logstr = logstr;
    }

    public String getExpanddata() {
        return expanddata;
    }

    public void setExpanddata(String expanddata) {
        this.expanddata = expanddata;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getIndexDblog() {
        return indexDblog;
    }

    public void setIndexDblog(String indexDblog) {
        this.indexDblog = indexDblog;
    }

    public String getExpandDblog() {
        return expandDblog;
    }

    public void setExpandDblog(String expandDblog) {
        this.expandDblog = expandDblog;
    }

}