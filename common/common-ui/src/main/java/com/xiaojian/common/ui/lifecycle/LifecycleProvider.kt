package com.xiaojian.common.ui.lifecycle

/**
 * @Author: yxj.33
 * @Time: 2023/6/29 17:34
 * @Description:
 */
class LifecycleProvider<T> {



    interface Factory<out T> {
        fun create(clazz: Class<in T>): T
    }
}