package com.expressTracking.service.impl;

import com.expressTracking.dao.UserInfoDao;
import com.expressTracking.entity.UserInfo;
import com.expressTracking.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author muwei
 * @date 2019/4/8
 */
@Service
@Transactional(isolation = Isolation.READ_COMMITTED,
        propagation = Propagation.REQUIRES_NEW, rollbackFor = Exception.class)
public class UserInfoServiceImpl implements UserInfoService {
    private final UserInfoDao userInfoDao;

    @Autowired
    public UserInfoServiceImpl(UserInfoDao userInfoDao) {
        this.userInfoDao = userInfoDao;
    }

    @Override
    public UserInfo get(int uId) {
        return userInfoDao.get(uId);
    }

    @Override
    public void save(UserInfo userInfo) {
        userInfoDao.insert(userInfo);
    }

    @Override
    public int update(UserInfo userInfo) {
        return userInfoDao.update(userInfo);
    }

    @Override
    public int delete(int uId) {
        return userInfoDao.delete(uId);
    }

    @Override
    public UserInfo checkLogin(int uId, String password) {
        return userInfoDao.checkLogin(uId,password);
    }

    @Override
    public List<UserInfo> findLike(String propertyName, String value) {
        return userInfoDao.findLike(propertyName,value);
    }

    @Override
    public List<UserInfo> findBy(String propertyName, String value) {
        return userInfoDao.findBy(propertyName,value);
    }
}
