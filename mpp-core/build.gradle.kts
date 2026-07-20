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

tasks.register("generatePatchMetadata") {
    val metadataDir = layout.buildDirectory.dir("generated-metadata")
    outputs.dir(metadataDir)

    doLast {
        val dir = metadataDir.get().asFile
        dir.mkdirs()

        file("$dir/patches-list.json").writeText(
"""
{
  "patches": [
    {
      "name": "SettingsSupremePartner",
      "description": "Patch Settings.isSupremePartner to always return true",
      "default": true,
      "class": "com.p335p1.mobile.putong.data.SettingsPatchesKt",
      "field": "settingsSupremePartnerPatch"
    },
    {
      "name": "SettingsPlatinum",
      "description": "Patch Settings.isPlatinum to always return true",
      "default": true,
      "class": "com.p335p1.mobile.putong.data.SettingsPatchesKt",
      "field": "settingsPlatinumPatch"
    },
    {
      "name": "SettingsODiamond",
      "description": "Patch Settings.userIsODiamond to always return true",
      "default": true,
      "class": "com.p335p1.mobile.putong.data.SettingsPatchesKt",
      "field": "settingsODiamondPatch"
    },
    {
      "name": "SettingsDisableAds",
      "description": "Patch Settings.personalizeAdsSuggest to always return false",
      "default": true,
      "class": "com.p335p1.mobile.putong.data.SettingsPatchesKt",
      "field": "settingsDisableAdsPatch"
    },
    {
      "name": "UserIsVip",
      "description": "Patch User.isVIP to always return true",
      "default": true,
      "class": "com.p335p1.mobile.putong.data.UserPatchesKt",
      "field": "userIsVipPatch"
    },
    {
      "name": "UserIsSVIP",
      "description": "Patch User.isSVIP to always return true",
      "default": true,
      "class": "com.p335p1.mobile.putong.data.UserPatchesKt",
      "field": "userIsSvipPatch"
    },
    {
      "name": "UserIsUltraPremium",
      "description": "Patch User.isUltraPremium to always return true",
      "default": true,
      "class": "com.p335p1.mobile.putong.data.UserPatchesKt",
      "field": "userIsUltraPremiumPatch"
    },
    {
      "name": "UserIsSupremePartner",
      "description": "Patch User.isSupremePartner to always return true",
      "default": true,
      "class": "com.p335p1.mobile.putong.data.UserPatchesKt",
      "field": "userIsSupremePartnerPatch"
    },
    {
      "name": "UserIsPlatinum",
      "description": "Patch User.isPlatinum to always return true",
      "default": true,
      "class": "com.p335p1.mobile.putong.data.UserPatchesKt",
      "field": "userIsPlatinumPatch"
    },
    {
      "name": "UserIsODiamond",
      "description": "Patch User.isODiamond to always return true",
      "default": true,
      "class": "com.p335p1.mobile.putong.data.UserPatchesKt",
      "field": "userIsODiamondPatch"
    },
    {
      "name": "UserIsMembership",
      "description": "Patch User.isMembership to always return true",
      "default": true,
      "class": "com.p335p1.mobile.putong.data.UserPatchesKt",
      "field": "userIsMembershipPatch"
    },
    {
      "name": "UserIsMembershipUsed",
      "description": "Patch User.isMembershipUsed to always return true",
      "default": true,
      "class": "com.p335p1.mobile.putong.data.UserPatchesKt",
      "field": "userIsMembershipUsedPatch"
    },
    {
      "name": "UserIsVipExpired",
      "description": "Patch User.isVIPExpired to always return false",
      "default": true,
      "class": "com.p335p1.mobile.putong.data.UserPatchesKt",
      "field": "userIsVipExpiredPatch"
    }
  ]
}
""".trim()
        )

        file("$dir/patches-bundle.json").writeText(
"""
{
  "name": "Tantan Premium Bypass",
  "description": "Unlocks premium features in Tantan v7.2.9",
  "version": "1.0.0",
  "patcherVersion": "1.6.0",
  "compatibleWith": [
    {
      "name": "Tantan",
      "packageName": "com.p335p1.mobile.putong",
      "version": "7.2.9"
    }
  ]
}
""".trim()
        )
    }
}

tasks.jar {
    dependsOn("generatePatchMetadata")
    from(layout.buildDirectory.dir("generated-metadata")) {
        include("*.json")
    }
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
