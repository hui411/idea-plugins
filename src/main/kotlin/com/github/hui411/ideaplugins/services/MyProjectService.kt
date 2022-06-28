package com.github.hui411.ideaplugins.services

import com.intellij.openapi.project.Project
import com.github.hui411.ideaplugins.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
