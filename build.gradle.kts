// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {
    repositories {
        google()
        jcenter()
        
    }
    dependencies {
        classpath("com.android.tools.build:gradle:3.5.3")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlinVersion}")
        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}

allprojects {
    repositories {
        google()
        jcenter()
        
    }
}

tasks{
    val holaMundo by registering(HolaMundo::class)
    val openFolder by registering(OpenFolder::class)
    getByPath(":app:assembleDebug").finalizedBy(holaMundo)
    getByPath(":app:assembleRelease").finalizedBy(openFolder)
}
