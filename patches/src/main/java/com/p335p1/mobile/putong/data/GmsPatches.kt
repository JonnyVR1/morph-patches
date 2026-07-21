package com.p335p1.mobile.putong.data

import app.morphe.patcher.Fingerprint
import app.morphe.patcher.extensions.InstructionExtensions.addInstructions
import app.morphe.patcher.patch.bytecodePatch
import com.android.tools.smali.dexlib2.AccessFlags

/**
 * Bypasses the bundled Google Play Services availability checks.
 *
 * The app bundles its own copies of GMS availability checker classes in its DEX files:
 * - `GooglePlayServicesUtilLight` (static methods)
 * - `GoogleApiAvailabilityLight` (instance methods on singleton)
 *
 * These classes read `com.google.android.gms.version` from the app's own manifest
 * during Maps initialization. When the Morphe patcher repackages the APK, this
 * meta-data entry can be lost or corrupted, causing Maps to fail with
 * `GooglePlayServicesMissingManifestValueException`.
 *
 * This patch makes both overloads of `isGooglePlayServicesAvailable()` in both
 * classes always return 0 (success), bypassing all GMS availability checks including
 * manifest validation, Play Store presence, and signature verification. This allows
 * Google Maps to initialize correctly even when the manifest meta-data is not
 * properly preserved.
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
        // Patch GooglePlayServicesUtilLight (static methods)
        val utilLightSingleArgFingerprint = Fingerprint(
            accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.STATIC),
            returnType = "I",
            parameters = listOf("Landroid/content/Context;"),
        )
        
        val utilLightTwoArgFingerprint = Fingerprint(
            accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.STATIC),
            returnType = "I",
            parameters = listOf("Landroid/content/Context;", "I"),
        )

        // Patch GoogleApiAvailabilityLight (instance methods)
        val apiAvailabilitySingleArgFingerprint = Fingerprint(
            accessFlags = listOf(AccessFlags.PUBLIC),
            returnType = "I",
            parameters = listOf("Landroid/content/Context;"),
        )
        
        val apiAvailabilityTwoArgFingerprint = Fingerprint(
            accessFlags = listOf(AccessFlags.PUBLIC),
            returnType = "I",
            parameters = listOf("Landroid/content/Context;", "I"),
        )

        classDefForEach { classDef ->
            val className = classDef.type
            
            // Patch GooglePlayServicesUtilLight
            if (className == "Lcom/google/android/gms/common/GooglePlayServicesUtilLight;") {
                classDef.methods.forEach { method ->
                    if (method.name == "isGooglePlayServicesAvailable") {
                        utilLightSingleArgFingerprint.matchOrNull(method)?.let { match ->
                            match.method.addInstructions(0, """
                                const/4 v0, 0x0
                                return v0
                            """)
                        }
                        
                        utilLightTwoArgFingerprint.matchOrNull(method)?.let { match ->
                            match.method.addInstructions(0, """
                                const/4 v0, 0x0
                                return v0
                            """)
                        }
                    }
                }
            }
            
            // Patch GoogleApiAvailabilityLight
            if (className == "Lcom/google/android/gms/common/GoogleApiAvailabilityLight;") {
                classDef.methods.forEach { method ->
                    if (method.name == "isGooglePlayServicesAvailable") {
                        apiAvailabilitySingleArgFingerprint.matchOrNull(method)?.let { match ->
                            match.method.addInstructions(0, """
                                const/4 v0, 0x0
                                return v0
                            """)
                        }
                        
                        apiAvailabilityTwoArgFingerprint.matchOrNull(method)?.let { match ->
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
}
