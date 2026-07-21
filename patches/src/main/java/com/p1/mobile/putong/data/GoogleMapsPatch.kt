package com.p1.mobile.putong.data

import app.morphe.patcher.Fingerprint
import app.morphe.patcher.extensions.InstructionExtensions.addInstructions
import app.morphe.patcher.patch.bytecodePatch
import com.android.tools.smali.dexlib2.AccessFlags

/**
 * Minimal Google Maps compatibility patch.
 *
 * With the SignatureSpoofPatch now handling certificate spoofing, most of the
 * previous workarounds are redundant. This patch keeps only the GMS availability
 * checks as safety nets - they're harmless no-ops when real GMS is installed.
 *
 * Removed patches (now handled by signature spoofing):
 * - DynamiteModule.k() bypass - real GMS is installed, check passes
 * - bo0.c() API key nullification - would BREAK Maps by preventing API key use
 * - zzn.zzh() whitelist bypass - signature spoofing fixes the root cause
 * - MapsEngine zzb() cert validation - no longer needed
 *
 * Requires real Google Play Services installed on the device.
 */

private val utilLight1ArgFingerprint = Fingerprint(
    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.STATIC),
    returnType = "I",
    parameters = listOf("Landroid/content/Context;"),
)
private val utilLight2ArgFingerprint = Fingerprint(
    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.STATIC),
    returnType = "I",
    parameters = listOf("Landroid/content/Context;", "I"),
)
private val apiAvail1ArgFingerprint = Fingerprint(
    accessFlags = listOf(AccessFlags.PUBLIC),
    returnType = "I",
    parameters = listOf("Landroid/content/Context;"),
)
private val apiAvail2ArgFingerprint = Fingerprint(
    accessFlags = listOf(AccessFlags.PUBLIC),
    returnType = "I",
    parameters = listOf("Landroid/content/Context;", "I"),
)

private const val RETURN_INT_SUCCESS = """
    const/4 v0, 0x0
    return v0
"""

@Suppress("unused")
@JvmField
val googleMapsPatch = bytecodePatch(
    name = "Google Maps Compatibility",
    description = "Safety net patches for GMS availability checks. Signature spoofing handles the main Maps compatibility.",
    default = true,
) {
    compatibleWith(tantanCompatibility)
    execute {
        classDefForEach { classDef ->
            when (classDef.type) {
                "Lcom/google/android/gms/common/GooglePlayServicesUtilLight;" -> {
                    classDef.methods.forEach { method ->
                        if (method.name != "isGooglePlayServicesAvailable") return@forEach
                        utilLight1ArgFingerprint.matchOrNull(method)?.let { match ->
                            match.method.addInstructions(0, RETURN_INT_SUCCESS)
                        }
                        utilLight2ArgFingerprint.matchOrNull(method)?.let { match ->
                            match.method.addInstructions(0, RETURN_INT_SUCCESS)
                        }
                    }
                }
                "Lcom/google/android/gms/common/GoogleApiAvailabilityLight;" -> {
                    classDef.methods.forEach { method ->
                        if (method.name != "isGooglePlayServicesAvailable") return@forEach
                        apiAvail1ArgFingerprint.matchOrNull(method)?.let { match ->
                            match.method.addInstructions(0, RETURN_INT_SUCCESS)
                        }
                        apiAvail2ArgFingerprint.matchOrNull(method)?.let { match ->
                            match.method.addInstructions(0, RETURN_INT_SUCCESS)
                        }
                    }
                }
            }
        }
    }
}
