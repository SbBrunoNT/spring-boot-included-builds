import com.gradle.kts.kotlin.buildsource.*

plugins {
    id("source-plugin")
    id("openapi-plugin")
}

group = "com.spring.example.openapi"
version = "1.0.0"

dependencies {
    kotlinReactive()
    springJettyApi()
    mappstruct()
    jsonLogger()
    springDoc()
    test()
}

