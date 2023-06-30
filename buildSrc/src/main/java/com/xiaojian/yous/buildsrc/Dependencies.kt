package com.xiaojian.yous.buildsrc

import com.xiaojian.yous.buildsrc.group.GroupDependency
import com.xiaojian.yous.buildsrc.group.Group

/**
 * 项目全局的依赖管理
 *
 * 参考自 [使用buildSrc管理项目三方依赖](https://zhuanlan.zhihu.com/p/630336016)
 */
object Dependencies {

    object AndroidX : Group("androidx.core") {
        val core_ktx = GroupDependency(this, "core-ktx", "1.7.0")
    }


}


