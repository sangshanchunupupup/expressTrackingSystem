package com.expresstracking.service.impl;

import com.expresstracking.entity.TransPackageContent;
import com.expresstracking.service.TransPackageContentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author 19231
 * @date 2019/4/8
 */
@Service
@Transactional(isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRES_NEW, rollbackFor = Exception.class)
public class TransPackageContentServiceImpl implements TransPackageContentService {
    @Override
    public int getSn(String id, String uId) {
        return 0;
    }

    @Override
    public void save(TransPackageContent transPackageContent) {

    }

    @Override
    public int update(TransPackageContent transPackageContent) {
        return 0;
    }

    @Override
    public TransPackageContent get(String id, String sourcePkgId) {
        return null;
    }

    @Override
    public List<TransPackageContent> findBy(String orderBy, boolean isAsc, String expressSheetId, int status) {
        return null;
    }

    @Override
    public List<TransPackageContent> findBy(String propertyName, Object value, String orderBy, boolean isAsc) {
        return null;
    }
}
