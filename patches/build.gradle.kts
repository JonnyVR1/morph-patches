group = "app.tantan"

patches {
    about {
        name = "Morph Patches"
        description = "Custom Morphe patches for multiple apps"
        source = "git@github.com:JonnyVR1/morph-patches.git"
        author = "JonnyVR1"
        contact = "na"
        website = "https://github.com/JonnyVR1/morph-patches"
        license = "GPLv3"
    }
}

kotlin {
    compilerOptions {
        freeCompilerArgs.add("-Xcontext-parameters")
    }
}

// Separate configuration so gson is available at runtime for the
// generatePatchesList task but never bundled into the APK.
val patchListGeneratorClasspath: Configuration by configurations.creating

dependencies {
    compileOnly(libs.gson)
    patchListGeneratorClasspath(libs.gson)
    implementation("org.bouncycastle:bcpkix-jdk18on:1.78.1")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.10.2")
    testImplementation("org.jetbrains.kotlin:kotlin-test:2.2.21")
}

tasks {
    register<JavaExec>("generatePatchesList") {
        description = "Build patch with patch list"

        dependsOn(build)

        classpath = sourceSets["main"].runtimeClasspath + patchListGeneratorClasspath
        mainClass.set("util.PatchListGeneratorKt")
    }

    // Used by gradle-semantic-release-plugin.
    publish {
        dependsOn("generatePatchesList")
    }
}

tasks.register<JavaExec>("patchApk") {
    dependsOn("jar")
    classpath = sourceSets["main"].runtimeClasspath + files(tasks.jar.get().archiveFile)
    mainClass.set("app.morphe.PatcherMainKt")
    val apkFile = rootProject.file("tantan-7-2-9.apk")
    val outputApk = rootProject.file("tantan-premium-unlocked.apk")
    args = listOf(apkFile.absolutePath, outputApk.absolutePath)
}
