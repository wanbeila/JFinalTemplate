package com.fleetMall.service.base;

import com.fleetMall.util.Condition;
import org.apache.poi.ss.formula.functions.T;

import java.util.List;

/**
 * Created by beila on 2017/4/8.
 */
public interface Service<T> {
    List<T> listAll();
    void updateEntity(T t);
    void saveEntity(T t);
    void deleteEntity(T t);
    void deleteByUUID(String uuid);
    T findOneByUUID(String uuid);
    List<T> listByCondition(Condition condition);
    List<T> listByConditionWithDateOrder(Condition condition);
}
