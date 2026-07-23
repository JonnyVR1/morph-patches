package com.p1.mobile.putong.data

import app.morphe.patcher.Fingerprint
import app.morphe.patcher.extensions.InstructionExtensions.addInstructions
import app.morphe.patcher.extensions.InstructionExtensions.replaceInstruction
import app.morphe.patcher.patch.bytecodePatch
import app.morphe.patcher.patch.resourcePatch
import com.android.tools.smali.dexlib2.AccessFlags
import com.android.tools.smali.dexlib2.Opcode
import com.android.tools.smali.dexlib2.builder.instruction.BuilderInstruction21c
import com.android.tools.smali.dexlib2.iface.instruction.formats.Instruction21c
import com.android.tools.smali.dexlib2.iface.reference.StringReference
import com.android.tools.smali.dexlib2.immutable.reference.ImmutableStringReference
import org.w3c.dom.Element

/**
 * MicroG Support Patch
 *
 * Forces Tantan to use MicroG-RE instead of Google Play Services by replacing
 * all `com.google.android.gms` references with `app.revanced.android.gms` in the bytecode.
 *
 * This patch:
 * 1. Replaces all package name references in bytecode
 * 2. Adds manifest metadata for MicroG-RE signature spoofing
 * 3. Ensures GMS availability checks pass
 * 4. Adds queries for Android 11+ package visibility
 *
 * Requires MicroG-RE (or compatible MicroG variant) to be installed on the device.
 */
private const val TAG = "MicroGSupport"
private const val VENDOR_GROUP_ID = "app.revanced"
private const val VENDOR_GMS_PACKAGE = "$VENDOR_GROUP_ID.android.gms"

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

// Fingerprints to find methods containing GMS package strings
private val gmsPackageFingerprint = Fingerprint(
    filters = listOf(app.morphe.patcher.string("com.google.android.gms")),
)
private val gsfPackageFingerprint = Fingerprint(
    filters = listOf(app.morphe.patcher.string("com.google.android.gsf")),
)
private val gtalkPackageFingerprint = Fingerprint(
    filters = listOf(app.morphe.patcher.string("com.google.android.gtalkservice")),
)
private val providersGsfFingerprint = Fingerprint(
    filters = listOf(app.morphe.patcher.string("com.google.android.providers.gsf")),
)
private val contextManagerFingerprint = Fingerprint(
    filters = listOf(app.morphe.patcher.string("com.google.android.contextmanager")),
)

private const val RETURN_INT_SUCCESS = """
    const/4 v0, 0x0
    return v0
"""

private val manifestPatch = resourcePatch {
    execute {
        document("AndroidManifest.xml").use { document ->
            val application = document.getElementsByTagName("application").item(0) as Element

            // Add MicroG-RE spoofing metadata
            val metadata = document.createElement("meta-data")
            metadata.setAttribute("android:name", "$VENDOR_GMS_PACKAGE.SPOOFED_PACKAGE_NAME")
            metadata.setAttribute("android:value", TANTAN_PACKAGE_NAME)
            application.appendChild(metadata)

            val signatureMetadata = document.createElement("meta-data")
            signatureMetadata.setAttribute("android:name", "$VENDOR_GMS_PACKAGE.SPOOFED_PACKAGE_SIGNATURE")
            signatureMetadata.setAttribute("android:value", "71:5B:AB:0F:36:33:95:FE:34:D1:87:68:4B:0E:F7:71:A9:D4:00:F0")
            application.appendChild(signatureMetadata)

            val microgMetadata = document.createElement("meta-data")
            microgMetadata.setAttribute("android:name", "app.revanced.MICROG_PACKAGE_NAME")
            microgMetadata.setAttribute("android:value", VENDOR_GMS_PACKAGE)
            application.appendChild(microgMetadata)

            // Ensure MicroG-RE package is queryable (Android 11+)
            val queries = document.getElementsByTagName("queries").item(0)
            if (queries == null) {
                val newQueries = document.createElement("queries")
                val packageElement = document.createElement("package")
                packageElement.setAttribute("android:name", VENDOR_GMS_PACKAGE)
                newQueries.appendChild(packageElement)
                document.documentElement.insertBefore(newQueries, application)
            } else {
                val packageElement = document.createElement("package")
                packageElement.setAttribute("android:name", VENDOR_GMS_PACKAGE)
                queries.appendChild(packageElement)
            }
        }
    }
}

@Suppress("unused")
@JvmField
val microGSupportPatch = bytecodePatch(
    name = "MicroG Support",
    description = "Forces the app to use MicroG-RE instead of Google Play Services. " +
            "Enables Google Maps and other GMS-dependent features without root. " +
            "Requires MicroG-RE to be installed on the device.",
    default = true,
) {
    compatibleWith(tantanCompatibility)
    dependsOn(manifestPatch)

    execute {
        // Memory-efficient approach: Process one class at a time, no intermediate storage
        var replacementsMade = 0
        
        classDefForEach { classDef ->
            // Quick check: does this class have any methods with implementations?
            val hasMethods = classDef.methods.any { it.implementation != null }
            if (!hasMethods) return@classDefForEach
            
            // Check if this class contains the target string (without creating mutable copy yet)
            val containsTarget = classDef.methods.any { method ->
                method.implementation?.instructions?.any { instruction ->
                    (instruction as? Instruction21c)?.reference is StringReference &&
                    ((instruction.reference as StringReference).string == "com.google.android.gms")
                } == true
            }
            
            if (!containsTarget) return@classDefForEach
            
            // Only now create the mutable copy
            val mutableClass = mutableClassDefBy(classDef)
            
            classDef.methods.forEach { method ->
                val implementation = method.implementation ?: return@forEach
                
                val mutableMethod = mutableClass.methods.firstOrNull { 
                    it.name == method.name && it.parameterTypes == method.parameterTypes 
                } ?: return@forEach

                implementation.instructions.forEachIndexed { index, instruction ->
                    val str = (instruction as? Instruction21c)?.reference as? StringReference ?: return@forEachIndexed
                    
                    if (str.string == "com.google.android.gms") {
                        mutableMethod.replaceInstruction(
                            index,
                            BuilderInstruction21c(
                                Opcode.CONST_STRING,
                                instruction.registerA,
                                ImmutableStringReference(VENDOR_GMS_PACKAGE),
                            )
                        )
                        replacementsMade++
                    }
                }
            }
        }
        
        println("[MicroGSupport] Made $replacementsMade replacements")

        // Patch the GMS availability checks to return success
        classDefForEach { classDef ->
            when (classDef.type) {
                "Lcom/google/android/gms/common/GooglePlayServicesUtilLight;" -> {
                    mutableClassDefBy(classDef).methods.forEach { method ->
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
                    mutableClassDefBy(classDef).methods.forEach { method ->
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