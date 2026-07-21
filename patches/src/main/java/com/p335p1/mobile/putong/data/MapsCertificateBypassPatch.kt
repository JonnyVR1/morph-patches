package com.p335p1.mobile.putong.data

import app.morphe.patcher.Fingerprint
import app.morphe.patcher.extensions.InstructionExtensions.addInstructions
import app.morphe.patcher.patch.bytecodePatch
import com.android.tools.smali.dexlib2.AccessFlags

/**
 * Bypasses Google Maps API key certificate fingerprint validation.
 *
 * The app's Google Maps API key (`AIzaSyDc_FzEvGjbje3ABk0KYSlptuPYylHdSLU`) is
 * registered in Google Cloud Console with a specific SHA-1 certificate fingerprint.
 * When Morphe re-signs the APK, the certificate fingerprint changes, causing
 * Google's servers to reject Maps API requests with "Authorization failure".
 *
 * This patch intercepts the certificate fingerprint reading in
 * `com.google.android.libraries.places.internal.zzju.zzb()` and returns the
 * ORIGINAL app's certificate SHA-1 fingerprint instead of computing it from
 * the patched APK's signature.
 *
 * Original certificate SHA-1: 71:5B:AB:0F:36:33:95:FE:34:D1:87:68:4B:0E:F7:71:A9:D4:00:F0
 * Issued by: CN=tttribe,OU=zhiwen,O=zhiwen,L=beijing,ST=beijing,C=cn
 */
@Suppress("unused")
@JvmField
val mapsCertificateBypassPatch = bytecodePatch(
    name = "MapsCertificateBypass",
    description = "Spoofs the certificate fingerprint to bypass Google Maps API key validation after patching",
    default = true,
) {
    compatibleWith(tantanCompatibility)
    execute {
        val fingerprint = Fingerprint(
            accessFlags = listOf(AccessFlags.PRIVATE, AccessFlags.STATIC),
            returnType = "Ljava/lang/String;",
            parameters = listOf("Landroid/content/pm/Signature;"),
        )

        classDefForEach { classDef ->
            if (classDef.type != "Lcom/google/android/libraries/places/internal/zzju;") return@classDefForEach
            classDef.methods.forEach { method ->
                if (method.name == "zzb") {
                    fingerprint.matchOrNull(method)?.let { match ->
                        // Return the original certificate SHA-1 fingerprint
                        // Format: "71:5B:AB:0F:36:33:95:FE:34:D1:87:68:4B:0E:F7:71:A9:D4:00:F0"
                        match.method.addInstructions(0, """
                            const-string v0, "71:5B:AB:0F:36:33:95:FE:34:D1:87:68:4B:0E:F7:71:A9:D4:00:F0"
                            return-object v0
                        """)
                    }
                }
            }
        }
    }
}
