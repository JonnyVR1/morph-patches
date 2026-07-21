package com.p335p1.mobile.putong.data

import app.morphe.patcher.patch.AppTarget
import app.morphe.patcher.patch.Compatibility

/**
 * Actual package name of the installed Tantan app, as reported in its
 * AndroidManifest.xml (`package="com.p1.mobile.putong"`).
 *
 * Note: The Kotlin package for these patch sources uses `com.p335p1...` because
 * decompilers (e.g. jadx) rename the real `com.p1` segment to avoid Java identifier
 * collisions with generated code. The actual app package name and dex class names
 * are `com.p1.mobile.putong`, which is what must be used for [Compatibility] and any
 * class-name string matching against the target APK's dex files.
 */
internal const val TANTAN_PACKAGE_NAME = "com.p1.mobile.putong"

/** Real dex class name of `Settings`, matching the actual APK bytecode (not the decompiler's renamed package). */
internal const val TANTAN_SETTINGS_CLASS = "Lcom/p1/mobile/putong/data/Settings;"

/** Real dex class name of `User`, matching the actual APK bytecode (not the decompiler's renamed package). */
internal const val TANTAN_USER_CLASS = "Lcom/p1/mobile/putong/data/User;"

/**
 * Shared compatibility declaration for all Tantan patches.
 *
 * `version = null` is used (any version) rather than pinning to the exact tested
 * version string, so the patches remain available for future Tantan releases that
 * don't change these methods, instead of silently disappearing from the Manager
 * whenever Tantan ships a new build.
 */
internal val tantanCompatibility = Compatibility(
    name = "Tantan",
    packageName = TANTAN_PACKAGE_NAME,
    description = "Tantan Chinese dating app",
    targets = listOf(
        AppTarget(
            version = null,
            description = "Tested on 7.2.9, expected to work on other versions",
        )
    )
)
