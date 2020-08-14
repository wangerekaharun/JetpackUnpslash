// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id(BuildPlugins.ktlintPlugin) version Versions.ktlint
    id(BuildPlugins.detektPlugin) version Versions.detekt
    id(BuildPlugins.androidLibrary) apply false
    id(BuildPlugins.androidApplication) apply false
    id(BuildPlugins.kotlinAndroid) apply false
    id(BuildPlugins.kotlinAndroidExtensions) apply false
    id(BuildPlugins.dokkaPlugin) version Versions.dokka
}

allprojects {
    repositories {
        google()
        jcenter()
        maven(url = "https://jitpack.io")
        maven("https://dl.bintray.com/kotlin/kotlin-eap")
    }
    // TODO Try android setup from Joeren Mols
    apply(plugin = BuildPlugins.dokkaPlugin)
    apply(plugin = BuildPlugins.ktlintPlugin)
    ktlint {
        android.set(true)
        verbose.set(true)
        filter {
            exclude { element -> element.file.path.contains("generated/") }
        }
    }
}


tasks.dokka {
    outputFormat = "html"
    outputDirectory = "$buildDir/dokka"
}


subprojects {
    apply(plugin = BuildPlugins.detektPlugin)
    detekt {
        parallel = true
    }
}