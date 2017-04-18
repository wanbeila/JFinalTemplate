package com.fleetMall.service.base.baseImpl;

import com.fleetMall.dao.BaseDao;
import com.fleetMall.service.base.Service;
import com.fleetMall.util.Condition;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by beila on 2017/4/8.
 */
public class ServiceImpl<T> implements Service<T> {

    @Autowired
    BaseDao baseDao;

    @Override
    public List<T> listAll() {
        return baseDao.listAll();
    }

    @Override
    public void updateEntity(T t) {
        baseDao.updateEntity(t);
    }

    @Override
    public void saveEntity(T t) {
        baseDao.saveEntity(t);
    }

    @Override
    public void deleteEntity(T t) {
        baseDao.deleteEntity(t);
    }

    @Override
    public void deleteByUUID(String uuid) {
        baseDao.deleteByUUID(uuid);
    }

    @Override
    public T findOneByUUID(String uuid) {
        return (T) baseDao.findOneByUUID(uuid);
    }

    @Override
    public List<T> listByCondition(Condition condition) {
        return baseDao.listByCondition(condition);
    }

    @Override
    public List<T> listByConditionWithDateOrder(Condition condition) {
        return baseDao.listByConditionWithDateOrder(condition);
    }
}
