object Versions {
    //Version code and name for the application
    const val name = "1.0"
    const val code = 1

    //Version codes for all the libraries
    const val kotlin = "1.3.61"
    const val buildToolsVersion = "3.5.3"
    const val jetPack = "1.1.0"
    const val constraintLayout = "1.1.3"
    const val ktx = "1.1.0"
    const val material = "1.2.0"

    //Version codes for all the test libraries
    const val junit4 = "4.12"
    const val testRunner = "1.1.1"
    const val espresso = "3.2.0"
    const val annotation = "1.1.0"

    // Gradle Plugins
    const val ktlint = "9.3.0"
    const val detekt = "1.10.0"
    const val dokka = "0.10.1"

    //Networking
    const val retrofit = "2.9.0"
    const val okhttp = "4.8.0"
    const val loggingInterceptor = "4.7.2"

    //DI - KOIN
    const val koin = "2.1.5"

    // Room db
    const val room = "2.3.0-alpha02"

    // Lifecycle
    const val lifecycle = "2.3.0-alpha06"

    // Coroutines
    const val coroutines = "1.3.7"

    // Paging Library
    const val paging = "3.0.0-alpha04"

    // Navigation
    const val navigation = "2.3.0"

    // Coil
    const val coil = "0.11.0"
}

object BuildPlugins {
    //All the build plugins are added here
    const val androidLibrary = "com.android.library"
    const val ktlintPlugin = "org.jlleitschuh.gradle.ktlint"
    const val detektPlugin = "io.gitlab.arturbosch.detekt"
    const val dokkaPlugin = "org.jetbrains.dokka"
    const val androidApplication = "com.android.application"
    const val kotlinAndroid = "org.jetbrains.kotlin.android"
    const val kotlinAndroidExtensions = "org.jetbrains.kotlin.android.extensions"
    const val safeArgsPlugin = "androidx.navigation.safeargs.kotlin"
    const val kotlinKapt = "kotlin-kapt"
}

object Libraries {
    //Any Library is added here
    const val kotlinStandardLibrary = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"
    const val appCompat = "androidx.appcompat:appcompat:${Versions.jetPack}"
    const val constraintLayout =
        "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
    const val ktxCore = "androidx.core:core-ktx:${Versions.ktx}"
    const val materialComponents = "com.google.android.material:material:${Versions.material}"
    const val paging = "androidx.paging:paging-runtime:${Versions.paging}"
    const val lifecycle = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycle}"
    const val viewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycle}"
    const val livedata = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.lifecycle}"
    const val lifecycleExtensions = "androidx.lifecycle:lifecycle-extensions:${Versions.lifecycle}"
    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    const val gsonConverter = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"
    const val loggingInterceptor =
        "com.squareup.okhttp3:logging-interceptor:${Versions.loggingInterceptor}"
    const val coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines}"
    const val coroutinesAndroid =
        "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines}"
    const val koin = "org.koin:koin-android:${Versions.koin}"
    const val koinViewModel = "org.koin:koin-androidx-viewmodel:${Versions.koin}"
    const val navigationFragment =
        "androidx.navigation:navigation-fragment-ktx:${Versions.navigation}"
    const val navigationKtx = "androidx.navigation:navigation-ui-ktx:${Versions.navigation}"
    const val dynamicFeatures =
        "androidx.navigation:navigation-dynamic-features-fragment:${Versions.navigation}"
    const val coil = "io.coil-kt:coil:${Versions.coil}"
    const val room = "androidx.room:room-runtime:${Versions.room}"
    const val roomKtx = "androidx.room:room-ktx:${Versions.room}"
    const val roomCompiler = "androidx.room:room-compiler:${Versions.room}"

}

object AndroidSDK {
    //minimum, compile and target SDK versions
    const val min = 21
    const val compile = 30
    const val target = compile
}

object TestLibraries {
    //any test library is added here
    const val junit4 = "junit:junit:${Versions.junit4}"
    const val testRunner = "androidx.test:runner:${Versions.testRunner}"
    const val espresso = "androidx.test.espresso:espresso-core:${Versions.espresso}"
    const val annotation = "androidx.annotation:annotation:${Versions.annotation}"
}

object BuildModules {
    const val app = ":app"
}