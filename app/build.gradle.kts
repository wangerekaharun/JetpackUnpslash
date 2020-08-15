plugins {
    id(BuildPlugins.androidApplication)
    id(BuildPlugins.kotlinAndroid)
    id(BuildPlugins.kotlinAndroidExtensions)
    id(BuildPlugins.ktlintPlugin)
    id(BuildPlugins.safeArgsPlugin)
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

    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_1_8.toString()
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    buildFeatures {
        viewBinding = true
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
        implementation(Libraries.koin)
        implementation(Libraries.koinViewModel)
        implementation(Libraries.navigationFragment)
        implementation(Libraries.navigationKtx)
        implementation(Libraries.coil)
        testImplementation(TestLibraries.junit4)
        androidTestImplementation(TestLibraries.testRunner)
        androidTestImplementation(TestLibraries.espresso)
        androidTestImplementation(TestLibraries.annotation)
    }
}