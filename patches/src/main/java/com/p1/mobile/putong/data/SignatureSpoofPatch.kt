package com.p1.mobile.putong.data

import app.morphe.patcher.extensions.InstructionExtensions.addInstructions
import app.morphe.patcher.patch.bytecodePatch
import app.morphe.patcher.patch.resourcePatch
import org.w3c.dom.Element

/**
 * Signature spoofing patch that makes the app think its signing certificate is unchanged
 * after Morphe re-signs it. This fixes Google Maps and other services that validate
 * the app signature.
 *
 * Works by:
 * 1. Adding a Content Provider that hooks PackageManager at runtime (very early initialization)
 * 2. When getPackageInfo() is called with GET_SIGNATURES flag, returns the original signature
 * 3. This happens before Maps SDK or other services read the signature
 *
 * No root required - works on stock ROMs!
 *
 * Original signature (SHA-1): 71:5B:AB:0F:36:33:95:FE:34:D1:87:68:4B:0E:F7:71:A9:D4:00:F0
 * Extracted from: tantan+-+Global+Dating+App_7.2.7_APKPure.xapk
 */

private val manifestPatch = resourcePatch {
    finalize {
        // NOTE: This resourcePatch is intentionally a no-op. morphe 1.6.0 + arsclib 1.6.0
        // has a bug where DOM modifications to AndroidManifest.xml are silently dropped
        // during the XML-to-binary encoding pass. We work around this in PatcherMain.kt
        // by manually injecting the SignatureSpoof provider into the binary manifest
        // AFTER morphe's applyTo() has finished. See injectSignatureSpoofProvider().
        System.err.println("SignatureSpoof: resourcePatch finalize called (no-op; see PatcherMain workaround)")
    }
}

@Suppress("unused")
@JvmField
val signatureSpoofPatch = bytecodePatch(
    name = "Signature Spoof",
    description = "Makes the app think its signing certificate is unchanged after re-signing. Fixes Google Maps and other signature-dependent services. No root required.",
    default = true,
) {
    compatibleWith(tantanCompatibility)
    dependsOn(manifestPatch)
    extendWith("extensions/signature.mpe")

    execute {
        // The SignatureSpoofApplication class will be injected into the APK via the extension mechanism.
        // The manifest patch adds it as a Content Provider, which is instantiated very early.
        // The provider's onCreate() method installs the PackageManager hook.
        // No bytecode modifications needed - the Java class handles everything at runtime.
    }
}
