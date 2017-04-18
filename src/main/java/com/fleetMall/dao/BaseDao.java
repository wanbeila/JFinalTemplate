package com.fleetMall.dao;

import com.fleetMall.util.Condition;
import org.apache.log4j.Logger;

import javax.security.auth.login.Configuration;
import java.util.List;

/**
 * Created by beila on 2017/4/8.
 */
public interface BaseDao<T> {
    List<T> listAll();
    void updateEntity(T t);
    void saveEntity(T t);
    void deleteEntity(T t);
    void deleteByUUID(String uuid);
    T findOneByUUID(String uuid);
    List<T> listByCondition(Condition condition);
    List<T> listByConditionWithDateOrder(Condition condition);
}
