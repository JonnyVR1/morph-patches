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
 * 1. Injecting SignatureSpoofApplication class via extendWith (ContentProvider)
 * 2. Adding a <provider> element to AndroidManifest.xml so the ContentProvider is instantiated
 * 3. The ContentProvider's onCreate() hooks PackageManager before Maps SDK initializes
 *
 * We use a ContentProvider instead of replacing the Application class because:
 * - ContentProviders are instantiated before Application.onCreate()
 * - Replacing the Application class would break app code that depends on the original
 *   Application class initializing Context singletons
 *
 * No root required - works on stock ROMs!
 *
 * Original signature (SHA-1): 71:5B:AB:0F:36:33:95:FE:34:D1:87:68:4B:0E:F7:71:A9:D4:00:F0
 * Extracted from: tantan+-+Global+Dating+App_7.2.7_APKPure.xapk
 */

private val manifestPatch = resourcePatch {
    execute {
        document("AndroidManifest.xml").use { document ->
            val application = document.getElementsByTagName("application").item(0) as Element

            // Check if our provider is already declared to avoid duplicates
            val providers = application.getElementsByTagName("provider")
            var alreadyDeclared = false
            for (i in 0 until providers.length) {
                val provider = providers.item(i) as Element
                val name = provider.getAttribute("android:name")
                if (name == "com.p1.mobile.putong.data.extension.signature.SignatureSpoofApplication") {
                    alreadyDeclared = true
                    break
                }
            }

            if (!alreadyDeclared) {
                // Add a <provider> element with high initOrder so it's instantiated
                // before Application.onCreate() and before any other component
                val provider = document.createElement("provider")
                provider.setAttribute("android:name", "com.p1.mobile.putong.data.extension.signature.SignatureSpoofApplication")
                provider.setAttribute("android:authorities", "com.tantantribe.tribe.signatureSpoof")
                provider.setAttribute("android:exported", "false")
                provider.setAttribute("android:initOrder", "2147483647")
                application.appendChild(provider)
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
    extendWith("extensions/signature.mpe")

    execute {
        // The SignatureSpoofApplication class from the extension module will be
        // automatically included in the APK. The manifest patch declares it as a
        // Content Provider, which is instantiated before Application.onCreate().
        // The provider's onCreate() method installs the PackageManager hook.
        // No bytecode modifications needed - the Java class handles everything at runtime.
    }
}
