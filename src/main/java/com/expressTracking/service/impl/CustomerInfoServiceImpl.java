package com.expressTracking.service.impl;

import com.expressTracking.dao.CustomerInfoDao;
import com.expressTracking.entity.CustomerInfo;
import com.expressTracking.service.CustomerInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;
import java.util.List;

/**
 * @author muwei
 * @date 2019/4/8
 */
@Service
@Transactional(isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRES_NEW, rollbackFor = Exception.class)
public class CustomerInfoServiceImpl implements CustomerInfoService {
    private final CustomerInfoDao customerInfoDao;

    @Autowired
    public CustomerInfoServiceImpl(CustomerInfoDao customerInfoDao) {
        this.customerInfoDao = customerInfoDao;
    }

    @Override
    public CustomerInfo get(int id) {
        return customerInfoDao.get(id);
    }

    @Override
    public List<CustomerInfo> findByName(String name) {
        return customerInfoDao.findByName(name);
    }

    @Override
    public List<CustomerInfo> findByTelCode(String telCode) {
        return customerInfoDao.findByTelCode(telCode);
    }

    @Override
    public void save(CustomerInfo customerInfo) {
        customerInfoDao.insert(customerInfo);
    }

    @Override
    public int removeById(int id) {
        return customerInfoDao.delete(id);
    }

    @Override
    public int update(CustomerInfo customerInfo) {
        return customerInfoDao.update(customerInfo);
    }

}
