package com.dkd.manage.service;

import java.util.List;
import com.dkd.manage.domain.Node;

/**
 * 点位惯例Service接口
 * 
 * @author mlfc
 * @date 2024-07-24
 */
public interface INodeService 
{
    /**
     * 查询点位惯例
     * 
     * @param id 点位惯例主键
     * @return 点位惯例
     */
    public Node selectNodeById(Long id);

    /**
     * 查询点位惯例列表
     * 
     * @param node 点位惯例
     * @return 点位惯例集合
     */
    public List<Node> selectNodeList(Node node);

    /**
     * 新增点位惯例
     * 
     * @param node 点位惯例
     * @return 结果
     */
    public int insertNode(Node node);

    /**
     * 修改点位惯例
     * 
     * @param node 点位惯例
     * @return 结果
     */
    public int updateNode(Node node);

    /**
     * 批量删除点位惯例
     * 
     * @param ids 需要删除的点位惯例主键集合
     * @return 结果
     */
    public int deleteNodeByIds(Long[] ids);

    /**
     * 删除点位惯例信息
     * 
     * @param id 点位惯例主键
     * @return 结果
     */
    public int deleteNodeById(Long id);
}
