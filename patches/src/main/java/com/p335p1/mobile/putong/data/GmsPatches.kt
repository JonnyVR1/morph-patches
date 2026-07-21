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

/**
 * Bypasses the DynamiteModule GMS package name validation.
 *
 * The `DynamiteModule.k()` method checks that the `com.google.android.gms.chimera`
 * content provider belongs to the package `com.google.android.gms`. When using
 * MicroG-RE (which uses a different package name like `com.mgoogle.android.gms`),
 * this check fails and returns false, causing "remote loading disabled" and
 * preventing the Maps dynamite module from loading.
 *
 * This patch makes `DynamiteModule.k()` always return true, allowing the Maps
 * module to load from MicroG-RE regardless of its package name.
 *
 * Requires MicroG-RE to be installed on the device.
 */
@Suppress("unused")
@JvmField
val dynamiteModulePackageBypassPatch = bytecodePatch(
    name = "DynamiteModulePackageBypass",
    description = "Bypasses DynamiteModule GMS package name check to allow Maps loading with MicroG-RE",
    default = true,
) {
    compatibleWith(tantanCompatibility)
    execute {
        val fingerprint = Fingerprint(
            accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.STATIC),
            returnType = "Z",
            parameters = listOf("Landroid/content/Context;"),
        )

        classDefForEach { classDef ->
            if (classDef.type != "Lcom/google/android/gms/dynamite/DynamiteModule;") return@classDefForEach
            classDef.methods.forEach { method ->
                // The method is named 'k' in the obfuscated code
                if (method.name == "k") {
                    fingerprint.matchOrNull(method)?.let { match ->
                        match.method.addInstructions(0, """
                            const/4 v0, 0x1
                            return v0
                        """)
                    }
                }
            }
        }
    }
}

/**
 * Bypasses Google Maps API key signature validation.
 *
 * The app's manifest contains a Google Maps API key that's tied to the original
 * app's SHA1 signature. When the APK is re-signed by Morphe, the SHA1 changes,
 * and Google's tile servers silently reject map tile requests, resulting in a
 * blank/gray map.
 *
 * This patch hooks the API key reading method (`bo0.c()`) to return null, which
 * causes the Maps SDK to use MicroG-RE's built-in tile rendering instead of
 * making direct requests to Google's servers with the invalid signature.
 *
 * Requires MicroG-RE to be installed on the device.
 */
@Suppress("unused")
@JvmField
val mapsApiKeyBypassPatch = bytecodePatch(
    name = "MapsApiKeyBypass",
    description = "Bypasses Google Maps API key signature validation to fix blank map tiles after patching",
    default = true,
) {
    compatibleWith(tantanCompatibility)
    execute {
        val fingerprint = Fingerprint(
            accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.STATIC),
            returnType = "Ljava/lang/String;",
            parameters = listOf("Landroid/content/Context;", "Ljava/lang/String;"),
        )

        classDefForEach { classDef ->
            if (classDef.type != "Lp001l/bo0;") return@classDefForEach
            classDef.methods.forEach { method ->
                if (method.name == "c") {
                    fingerprint.matchOrNull(method)?.let { match ->
                        match.method.addInstructions(0, """
                            const/4 v0, 0x0
                            return-object v0
                        """)
                    }
                }
            }
        }
    }
}
