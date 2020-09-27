package com.sj.utils;


import com.sj.web.Operator;

/**
 * Created by chenguang on 2019/11/5.
 */
public class ThreadLocalUtil {

    public static ThreadLocal<Operator> operatorThreadLocal = new ThreadLocal<>();

    /**
     * 设置操作人
     *
     * @param operator
     */
    public static void setOperator(Operator operator) {
        operatorThreadLocal.set(operator);
    }

    /**
     * 获取操作人
     */
    public static Operator getOperator() {
        return operatorThreadLocal.get();
    }

    /**
     * 删除操作人
     */
    public static void removeOperator() {
        operatorThreadLocal.remove();
    }

    public static void sendOperator() {

    }

    public static void clear() {
        operatorThreadLocal.remove();
    }


}
