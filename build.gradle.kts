
buildscript {
    dependencies {
        classpath("com.android.tools.build:gradle:2.3.3")
        classpath(kotlin("gradle-plugin"))
    }
    repositories {
        jcenter()
    }
}

apply {
    plugin("com.android.application")
    plugin("kotlin-android")
    plugin("kotlin-android-extensions")
}

android {
    compileSdkVersion(25)
    buildToolsVersion("25.0.0")

    defaultConfig {
        minSdkVersion(16)
        targetSdkVersion(25)

        applicationId = "com.park9eon"
        versionCode = 1
        versionName = "0.0.1"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles("proguard-rules.pro")
        }
    }
}

dependencies {
    compile("com.android.support:appcompat-v7:25.3.1")
    compile("com.android.support.constraint:constraint-layout:1.0.0-alpha8")
    compile(kotlin("stdlib"))
}

repositories {
    jcenter()
}

