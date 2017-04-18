package com.fleetMall.dao.daoImpl;

import com.fleetMall.dao.BaseDao;
import com.fleetMall.util.Condition;
import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 * Created by beila on 2017/4/8.
 */
public class BaseDaoImpl<T> extends HibernateDaoSupport implements BaseDao<T> {

    Logger logger = Logger.getLogger(BaseDaoImpl.class);

    Class<T> clazz = null;

    public BaseDaoImpl(){
        ParameterizedType type = (ParameterizedType) getClass().getGenericSuperclass();
        clazz = (Class<T>) type.getActualTypeArguments()[0];
    }

    @Autowired
    public void setBaseSessionFactory(SessionFactory baseSessionFactory) {
        super.setSessionFactory(baseSessionFactory);
    }

    @Override
    public List<T> listAll() {
        return null;
    }

    @Override
    public void updateEntity(T t) {

    }

    @Override
    public void saveEntity(T t) {

    }

    @Override
    public void deleteEntity(T t) {

    }

    @Override
    public void deleteByUUID(String uuid) {

    }

    @Override
    public T findOneByUUID(String uuid) {
        return null;
    }

    @Override
    public List<T> listByCondition(Condition condition) {
        return null;
    }

    @Override
    public List<T> listByConditionWithDateOrder(Condition condition) {
        return null;
    }
}
