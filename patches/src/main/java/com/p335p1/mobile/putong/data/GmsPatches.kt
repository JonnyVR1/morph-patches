package com.p335p1.mobile.putong.data

import app.morphe.patcher.Fingerprint
import app.morphe.patcher.extensions.InstructionExtensions.addInstructions
import app.morphe.patcher.patch.bytecodePatch
import com.android.tools.smali.dexlib2.AccessFlags

/**
 * Bypasses the bundled Google Play Services availability check.
 *
 * The app bundles its own copy of `GooglePlayServicesUtilLight` in its DEX files.
 * This class reads `com.google.android.gms.version` from the app's own manifest
 * during Maps initialization. When the Morphe patcher repackages the APK, this
 * meta-data entry can be lost or corrupted, causing Maps to fail with
 * `GooglePlayServicesMissingManifestValueException`.
 *
 * This patch makes `isGooglePlayServicesAvailable()` always return 0 (success),
 * bypassing all GMS availability checks including manifest validation, Play Store
 * presence, and signature verification. This allows Google Maps to initialize
 * correctly even when the manifest meta-data is not properly preserved.
 *
 * Requires MicroG-RE (or real Google Play Services) to be installed on the device
 * to actually provide the Maps functionality.
 */
@Suppress("unused")
@JvmField
val gmsAvailabilityBypassPatch = bytecodePatch(
    name = "GmsAvailabilityBypass",
    description = "Bypasses Google Play Services availability checks to fix Google Maps after patching",
    default = true,
) {
    compatibleWith(tantanCompatibility)
    execute {
        val fingerprint = Fingerprint(
            accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.STATIC),
            returnType = "I",
            parameters = listOf("Landroid/content/Context;", "I"),
        )

        classDefForEach { classDef ->
            if (classDef.type != "Lcom/google/android/gms/common/GooglePlayServicesUtilLight;") return@classDefForEach
            classDef.methods.forEach { method ->
                if (method.name == "isGooglePlayServicesAvailable") {
                    fingerprint.matchOrNull(method)?.let { match ->
                        match.method.addInstructions(0, """
                            const/4 v0, 0x0
                            return v0
                        """)
                    }
                }
            }
        }
    }
}
