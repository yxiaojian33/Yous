package com.xiaojian.yous.buildsrc.group


class GroupDependency() : MutableMap<String, String> by mutableMapOf() {
    constructor(dependency: String) : this() {
        this.putAll(dependency2Map(dependency))
    }

    constructor(group: Group, name: String, version: String) : this() {
        this.putAll(dependency2Map(group, name, version))
    }

    constructor(group: String, name: String, version: String) : this() {
        this.putAll(dependency2Map(group, name, version))
    }

    private fun dependency2Map(dependency: String): Map<String, String> {
        val parts = dependency.split(":")
        return dependency2Map(parts[0], parts[1], parts[2])
    }

    private fun dependency2Map(group: Group, name: String, version: String): Map<String, String> {
        return dependency2Map(group.group, name, version)
    }

    private fun dependency2Map(group: String, name: String, version: String): Map<String, String> {
        return mapOf(
            "group" to group,
            "name" to name,
            "version" to version
        )
    }
}