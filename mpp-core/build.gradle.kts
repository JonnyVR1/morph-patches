// Morphe Patcher Core - Smali bytecode patching and .mpp bundle generation

plugins {
    `java-library`
    id("org.jetbrains.kotlin.jvm")
    `maven-publish`
}

group = "app.morphe"
version = "1.0.0"

val javaVersion = JavaVersion.VERSION_17

tasks.withType<JavaCompile> {
    sourceCompatibility = javaVersion.toString()
    targetCompatibility = javaVersion.toString()
}

kotlin {
    jvmToolchain(javaVersion.majorVersion.toInt())
}

kotlin {
    compilerOptions {
        freeCompilerArgs.add("-Xcontext-parameters")
    }
}

dependencies {
    implementation("app.morphe:morphe-patcher:1.6.0")
    implementation("org.bouncycastle:bcpkix-jdk18on:1.78.1")
    implementation("com.github.MorpheApp.smali:smali:d856bad65f")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.10.2")

    testImplementation("org.jetbrains.kotlin:kotlin-test:2.2.21")
}

tasks.jar {
    archiveExtension.set("mpp")
    manifest {
        attributes(
            "Name" to "Tantan Premium Bypass",
            "Description" to "Unlocks premium features in Tantan v7.2.9",
            "Patcher-Version" to "1.6.0"
        )
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

publishing {
    publications {
        create<MavenPublication>("mpp") {
            from(components["java"])

            groupId = "app.morphe"
            artifactId = "tantan-premium-patches"
            version = "1.0.0"

            pom {
                name.set("Tantan Premium Bypass Patches")
                description.set("Morphe patches for Tantan v7.2.9 premium features")
                url.set("https://github.com/MorpheApp/Morph")
            }
        }
    }

    repositories {
        maven {
            name = "GitHubPackages"
            url = uri("https://maven.pkg.github.com/MorpheApp/registry")
            credentials {
                username = providers.gradleProperty("gpr.user").orNull ?: System.getenv("GITHUB_ACTOR")
                password = providers.gradleProperty("gpr.key").orNull ?: System.getenv("GITHUB_TOKEN")
            }
        }
    }
}
