package com.xiaojian.common.ui.lifecycle

/**
 * @Author: yangjiajia.33
 * @Time: 2023/6/29 17:41
 * @Email: yangjiajia.33@bytedance.com
 * @Description:
 */
class LifecycleStore<V> {

    private val mMap: MutableMap<String, V> = mutableMapOf()

    fun put(key: String, value: V) {
        val old = mMap.put(key, value)
        if (old != null) {
            //dosth
        }
    }

    fun get(key: String): V? = mMap[key]

    fun keys() : Set<String> = mMap.keys
}