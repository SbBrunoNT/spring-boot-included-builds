package com.gradle.kts.java.buildsource

import org.gradle.api.Project
import org.gradle.api.tasks.SourceSetContainer
import org.gradle.api.tasks.bundling.Jar
import org.gradle.kotlin.dsl.get
import org.gradle.kotlin.dsl.getByName
import org.gradle.kotlin.dsl.named
import org.jetbrains.kotlin.gradle.dsl.kotlinExtension
import org.springframework.boot.gradle.tasks.run.BootRun

class BuildSubmoduleSourcePlugin : BuildSourcePlugin() {
    override fun Project.applyCustomTasks() {
        tasks.named<Jar>("bootJar").configure {
            enabled = false
        }

        tasks.named<BootRun>("bootRun").configure {
            enabled = false
        }

        extensions.getByName<SourceSetContainer>("sourceSets").apply {
            getByName("main").apply {
                java {
                    exclude(
                        "**/SpringDocConfiguration.java",
                    )
                }
            }
        }

        kotlinExtension.sourceSets["main"].kotlin {
            exclude(
                "**/SpringDocConfiguration.java",
            )
        }
    }
}
