plugins {
    id(BuildPlugins.androidApplication)
    id(BuildPlugins.kotlinAndroid)
    id(BuildPlugins.kotlinAndroidExtensions)
    id(BuildPlugins.ktlintPlugin)
}
android {
    compileSdkVersion(AndroidSDK.compile)
    buildToolsVersion("30.0.1")
    defaultConfig {
        applicationId = "ke.co.appslab.jetpackunsplash"
        minSdkVersion(AndroidSDK.min)
        targetSdkVersion(AndroidSDK.target)
        versionCode = Versions.code
        versionName = Versions.name
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    dependencies {
        implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
        implementation(Libraries.kotlinStandardLibrary)
        implementation(Libraries.appCompat)
        implementation(Libraries.ktxCore)
        implementation(Libraries.constraintLayout)
        implementation(Libraries.materialComponents)
        implementation(Libraries.paging)
        implementation(Libraries.retrofit)
        implementation(Libraries.loggingInterceptor)
        implementation(Libraries.gsonConverter)
        implementation(Libraries.lifecycle)
        implementation(Libraries.viewModel)
        implementation(Libraries.livedata)
        implementation(Libraries.coroutines)
        implementation(Libraries.coroutinesAndroid)
        testImplementation(TestLibraries.junit4)
        androidTestImplementation(TestLibraries.testRunner)
        androidTestImplementation(TestLibraries.espresso)
        androidTestImplementation(TestLibraries.annotation)
    }
}