package com.github.physicalelective2.ideaplugintemplate.services

import com.intellij.openapi.project.Project
import com.github.physicalelective2.ideaplugintemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
