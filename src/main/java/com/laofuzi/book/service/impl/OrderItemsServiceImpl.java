package com.laofuzi.book.service.impl;

import com.laofuzi.book.dao.OrderItemsMapper;
import com.laofuzi.book.entity.OrderItems;
import com.laofuzi.book.service.OrderItemsService;

import javax.annotation.Resource;

public class OrderItemsServiceImpl implements OrderItemsService {
    @Resource
    private OrderItemsMapper orderItemsMapper;
    @Override
    public int deleteById(Long id) {
        return orderItemsMapper.deleteByPrimaryKey(id);
    }

    @Override
    public OrderItems insert(OrderItems record) {
        orderItemsMapper.insert(record);
        return record;
    }

    @Override
    public OrderItems selectById(Long id) {

        return orderItemsMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateById(OrderItems record) {
        return orderItemsMapper.updateByPrimaryKey(record);
    }
}
