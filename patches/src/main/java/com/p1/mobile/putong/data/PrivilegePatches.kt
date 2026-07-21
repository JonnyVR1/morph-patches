package com.p1.mobile.putong.data

import app.morphe.patcher.Fingerprint
import app.morphe.patcher.extensions.InstructionExtensions.addInstructions
import app.morphe.patcher.patch.bytecodePatch
import com.android.tools.smali.dexlib2.AccessFlags

/**
 * Patches for bypassing the privilege validation system.
 * 
 * The app uses a privilege checking system via xma.S3() and xma.b4() methods
 * to determine if features like "see who liked me", Ultra Premium features, etc. are available.
 * 
 * These patches make all privilege checks pass, unlocking all premium features.
 */

/**
 * Bypasses the privilege expiration check.
 * 
 * The xma.S3() method checks if a privilege is expired or doesn't exist.
 * It returns true if the privilege is NOT available (expired or null).
 * 
 * This patch makes it always return false, meaning all privileges are always available.
 */
@Suppress("unused")
@JvmField
val privilegeExpirationBypassPatch = bytecodePatch(
    name = "Privilege Expiration Bypass",
    description = "Bypasses privilege expiration checks to unlock all premium features like 'see who liked me'",
    default = true,
) {
    compatibleWith(tantanCompatibility)
    execute {
        classDefForEach { classDef ->
            if (classDef.type != "Lp001l/xma;") return@classDefForEach
            classDef.methods.forEach { method ->
                if (method.name == "S3" && method.parameterTypes.size == 1 && 
                    method.parameterTypes[0] == "Lcom/p1/mobile/putong/core/data/SummarizedPrivilegesId;" && 
                    method.returnType == "Z") {
                    Fingerprint(
                        accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.STATIC),
                        returnType = "Z",
                        parameters = listOf("Lcom/p1/mobile/putong/core/data/SummarizedPrivilegesId;"),
                    ).matchOrNull(method)?.let { match ->
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

/**
 * Bypasses the privilege availability check.
 * 
 * The xma.b4() method checks if a privilege is available (not null and not expired).
 * It returns true if the privilege IS available.
 * 
 * This patch makes it always return true, meaning all privileges are always available.
 */
@Suppress("unused")
@JvmField
val privilegeAvailabilityBypassPatch = bytecodePatch(
    name = "Privilege Availability Bypass",
    description = "Ensures all premium privileges are always marked as available",
    default = true,
) {
    compatibleWith(tantanCompatibility)
    execute {
        classDefForEach { classDef ->
            if (classDef.type != "Lp001l/xma;") return@classDefForEach
            classDef.methods.forEach { method ->
                if (method.name == "b4" && method.parameterTypes.size == 1 && 
                    method.parameterTypes[0] == "Lcom/p1/mobile/putong/core/data/SummarizedPrivilegesId;" && 
                    method.returnType == "Z") {
                    Fingerprint(
                        accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.STATIC),
                        returnType = "Z",
                        parameters = listOf("Lcom/p1/mobile/putong/core/data/SummarizedPrivilegesId;"),
                    ).matchOrNull(method)?.let { match ->
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
