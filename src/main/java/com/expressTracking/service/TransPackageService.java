package com.expressTracking.service;

import com.expressTracking.entity.TransPackage;

import java.util.List;

/**
 *
 */
public interface TransPackageService {

    public List<TransPackage> findBy(String propertyName, String value);

    public List<TransPackage> findLike(String propertyName, String value);

    public TransPackage get(String id);

    public void save(TransPackage transPackage);

    public void update(TransPackage transPackage);

    /**
     * 新建包裹
     * @param transPackage 包裹
     * @param uId 工作人员Id
     * @return
     * @throws Exception
     */
    public int newTransPackage(TransPackage transPackage, int uId) throws Exception;

    /**
     * 打开包裹
     * @param uId 工作人员Id
     * @param packageId 包裹Id
     * @return
     * @throws Exception
     */
    public int openTransPackage(int uId, String packageId) throws Exception;

    /**
     * 转运包裹
     * @param packageId 包裹Id
     * @param uId 工作人员Id
     * @return
     * @throws Exception
     */
    public int deliveryTransPackage(String packageId, int uId) throws Exception;

    /**
     * 打包
     * @param packageId 包裹Id
     * @param expressId 快件Id
     * @return
     */
    public int packTransPackage(String packageId, String expressId) throws Exception;


}
