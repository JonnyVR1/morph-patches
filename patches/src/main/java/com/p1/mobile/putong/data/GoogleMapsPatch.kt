package com.p1.mobile.putong.data

import app.morphe.patcher.Fingerprint
import app.morphe.patcher.extensions.InstructionExtensions.addInstructions
import app.morphe.patcher.patch.bytecodePatch
import com.android.tools.smali.dexlib2.AccessFlags

/**
 * Consolidated Google Maps compatibility patch.
 *
 * After Morphe repackages the Tantan APK, a few GMS/Maps interactions break and
 * the embedded Maps view ends up either throwing `GooglePlayServicesMissingManifestValueException`
 * or rendering blank tiles because the re-signed APK no longer matches the API key
 * signature.
 *
 * This single patch combines every GMS/Maps workaround required to get Maps
 * rendering correctly with MicroG-RE installed:
 *
 * 1. `GooglePlayServicesUtilLight.isGooglePlayServicesAvailable(...)` → return
 *    `0` (success). Skips manifest-meta-data validation, Play Store presence
 *    checks, and signature verification.
 * 2. `GoogleApiAvailabilityLight.isGooglePlayServicesAvailable(...)` → same as above.
 * 3. `DynamiteModule.k(Context)` → return `true`. Allows the Maps dynamite module
 *    to load when the GMS provider comes from a non-`com.google.android.gms`
 *    package (e.g. MicroG-RE's `com.mgoogle.android.gms`).
 * 4. `p001l/bo0.c(Context, String)` → return `null`. The app reads its Maps API
 *    key from the manifest; returning null forces MicroG-RE's tile rendering
 *    instead of Google's signature-rejected tile servers.
 * 5. `p001l/<MapsEngine>.zzb()` → return `0`. Skips the post-initialization
 *    certificate/signature validation that otherwise fails on a re-signed APK.
 *
 * Requires MicroG-RE (or real Google Play Services) installed on the device.
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
private val dynamiteModuleFingerprint = Fingerprint(
    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.STATIC),
    returnType = "Z",
    parameters = listOf("Landroid/content/Context;"),
)
private val mapsApiKeyFingerprint = Fingerprint(
    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.STATIC),
    returnType = "Ljava/lang/String;",
    parameters = listOf("Landroid/content/Context;", "Ljava/lang/String;"),
)
private val mapsCertFingerprint = Fingerprint(
    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.STATIC),
    returnType = "I",
    parameters = emptyList(),
)
private val supportMapFragmentOnCreateViewFingerprint = Fingerprint(
    accessFlags = listOf(AccessFlags.PUBLIC),
    returnType = "Landroid/view/View;",
    parameters = listOf(
        "Landroid/view/LayoutInflater;",
        "Landroid/view/ViewGroup;",
        "Landroid/os/Bundle;",
    ),
)

private const val RETURN_INT_SUCCESS = """
    const/4 v0, 0x0
    return v0
"""

private const val RETURN_TRUE = """
    const/4 v0, 0x1
    return v0
"""

private const val RETURN_NULL_STRING = """
    const/4 v0, 0x0
    return-object v0
"""

// Returns a placeholder TextView instead of initializing Google Maps.
// The Maps SDK loads its renderer from a dynamite module (a separate APK
// loaded at runtime) that performs GoogleCertificates signature validation
// against a server-side whitelist. Re-signed (patched) APKs are rejected
// with "GoogleCertificatesRslt: not allowed" which prevents tiles from
// loading. Morphe can only patch classes in the host APK, not inside
// dynamite modules, so we replace the map view with a clear placeholder.
private const val RETURN_PLACEHOLDER_MAP_VIEW = """
    new-instance v0, Landroid/widget/TextView;
    invoke-virtual {p1}, Landroid/view/LayoutInflater;->getContext()Landroid/content/Context;
    move-result-object v1
    invoke-direct {v0, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V
    const-string v1, "Map unavailable\nPatched APK - Google Maps requires original signature"
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
    const/4 v1, 0x1
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setGravity(I)V
    const/4 v1, 0x1
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setClickable(Z)V
    return-object v0
"""

@Suppress("unused")
@JvmField
val googleMapsPatch = bytecodePatch(
    name = "Google Maps Compatibility",
    description = "Fixes Google Maps loading after patching - works with MicroG-RE (bundled GMS availability, Dynamite module, API key, certificate checks all bypassed)",
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
                "Lcom/google/android/gms/dynamite/DynamiteModule;" -> {
                    classDef.methods.forEach { method ->
                        if (method.name == "k") {
                            dynamiteModuleFingerprint.matchOrNull(method)?.let { match ->
                                match.method.addInstructions(0, RETURN_TRUE)
                            }
                        }
                    }
                }
                "Lp001l/bo0;" -> {
                    classDef.methods.forEach { method ->
                        if (method.name == "c") {
                            mapsApiKeyFingerprint.matchOrNull(method)?.let { match ->
                                match.method.addInstructions(0, RETURN_NULL_STRING)
                            }
                        }
                    }
                }
                // SupportMapFragment is in the host APK but delegates rendering to the
                // `com.google.android.gms.policy_maps_core_dynamite` module. That module
                // runs signature validation against Google's server-side whitelist and
                // rejects re-signed (patched) APKs, breaking tile rendering entirely.
                // Replacing onCreateView with a TextView prevents the broken map from
                // loading while keeping the rest of the app functional.
                "Lcom/google/android/gms/maps/SupportMapFragment;" -> {
                    classDef.methods.forEach { method ->
                        if (method.name == "onCreateView") {
                            supportMapFragmentOnCreateViewFingerprint.matchOrNull(method)?.let { match ->
                                match.method.addInstructions(0, RETURN_PLACEHOLDER_MAP_VIEW)
                            }
                        }
                    }
                }
                // Google Maps engine certificate check (obfuscated `zzb` in MapsEngine family)
                // Identifying by method-name `zzb` matches both original and recompiled builds.
                else -> {
                    if (classDef.type.contains("/MapsEngine") ||
                        classDef.type.contains("/MapsInitializerInternal") ||
                        classDef.type.contains("/zzbt")
                    ) {
                        classDef.methods.forEach { method ->
                            if (method.name == "zzb") {
                                mapsCertFingerprint.matchOrNull(method)?.let { match ->
                                    match.method.addInstructions(0, RETURN_INT_SUCCESS)
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
