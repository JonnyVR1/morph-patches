package com.p1.mobile.putong.data

import app.morphe.patcher.patch.bytecodePatch
import app.morphe.patcher.patch.resourcePatch
import org.w3c.dom.Element

/**
 * Signature spoofing patch that makes the app think its signing certificate is unchanged
 * after Morphe re-signs it. This fixes Google Maps and other services that validate
 * the app signature.
 *
 * Works by:
 * 1. Adding a custom Application class that hooks PackageManager at runtime
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
            val applicationClass = application.getAttribute("android:name")
            
            // Only set if not already set (don't override existing Application subclass)
            if (applicationClass.isEmpty()) {
                application.setAttribute("android:name", "com.p1.mobile.putong.data.extension.signature.SignatureSpoofApplication")
            }
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

    execute {
        // The SignatureSpoofApplication class from the extension module will be
        // automatically included in the APK. The manifest patch sets it as the
        // application class, so it will be initialized when the app starts.
        // No bytecode modifications needed - the Java class handles everything
        // at runtime via reflection.
    }
}
