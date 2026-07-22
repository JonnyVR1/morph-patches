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
        document("AndroidManifest.xml").use { document ->
            val application = document.getElementsByTagName("application").item(0) as Element
            
            // Add a Content Provider for early initialization
            // Content Providers are instantiated before Application.onCreate()
            val provider = document.createElement("provider")
            provider.setAttribute("android:name", "com.p1.mobile.putong.data.extension.signature.SignatureSpoofApplication")
            provider.setAttribute("android:authorities", "\${applicationId}.signatureSpoof")
            provider.setAttribute("android:exported", "false")
            application.appendChild(provider)
        }
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
