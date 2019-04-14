package com.expressTracking.service.impl;

import com.expressTracking.dao.ExpressSheetDao;
import com.expressTracking.dao.TransPackageContentDao;
import com.expressTracking.entity.ExpressSheet;
import com.expressTracking.service.ExpressSheetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 19231
 * @date 2019/4/8
 */
@Service
@Transactional(isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRES_NEW, rollbackFor = Exception.class)
public class ExpressSheetServiceImpl implements ExpressSheetService {
    private final ExpressSheetDao expressSheetDao;
    private final TransPackageContentDao transPackageContentDao;

    @Autowired
    public ExpressSheetServiceImpl(ExpressSheetDao expressSheetDao, TransPackageContentDao transPackageContentDao) {
        this.expressSheetDao = expressSheetDao;
        this.transPackageContentDao = transPackageContentDao;
    }

    @Override
    public int update(ExpressSheet expressSheet) {
        return expressSheetDao.update(expressSheet);
    }

    @Override
    public List<ExpressSheet> findBy(String propertyName, String value) {
        return expressSheetDao.findBy(propertyName,value);
    }

    @Override
    public List<ExpressSheet> findLike(String propertyName, String value) {
        return expressSheetDao.findLike(propertyName,value);
    }
    @Override
    public List<ExpressSheet> getListInPackage(String packageId) {
        List<String> expressId=transPackageContentDao.getExpressId(packageId);
        List<ExpressSheet> expressSheets=new ArrayList<>();
        for(String id:expressId){
            expressSheets.add(expressSheetDao.get(id));
        }
        return expressSheets;
    }

    @Override
    public ExpressSheet get(String id) {
        return expressSheetDao.get(id);
    }

    @Override
    public void save(ExpressSheet expressSheet) {
        expressSheetDao.insert(expressSheet);
    }

    @Override
    public int removeById(String id) {
        return expressSheetDao.delete(id);
    }
}
