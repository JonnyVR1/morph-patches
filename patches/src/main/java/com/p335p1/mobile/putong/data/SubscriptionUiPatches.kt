package com.p335p1.mobile.putong.data

import app.morphe.patcher.Fingerprint
import app.morphe.patcher.extensions.InstructionExtensions.addInstructions
import app.morphe.patcher.patch.bytecodePatch
import com.android.tools.smali.dexlib2.AccessFlags

/**
 * UI-level patches for subscription status display.
 * 
 * These patches target the methods that determine what text is shown
 * in the subscription management UI, bypassing database checks.
 */

/**
 * Patches IntlPrivilegeCard.l() (old UI) and n() (new UI) to always return true.
 * These methods determine if the subscription is active for display purposes.
 */
@Suppress("unused")
@JvmField
val intlPrivilegeCardActivePatch = bytecodePatch(
    name = "Subscription UI Active Status",
    description = "Forces subscription management UI to show all tiers as active",
    default = true,
) {
    compatibleWith(tantanCompatibility)
    execute {
        classDefForEach { classDef ->
            // Patch old UI
            if (classDef.type == "Lcom/p1/mobile/putong/core/ui/vip/intlPrivilege/IntlPrivilegeCard;") {
                classDef.methods.forEach { method ->
                    if (method.name == "l" && method.parameterTypes.isEmpty() && method.returnType == "Z") {
                        Fingerprint(
                            accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.FINAL),
                            returnType = "Z",
                            parameters = emptyList(),
                        ).matchOrNull(method)?.let { match ->
                            match.method.addInstructions(0, """
                                const/4 v0, 0x1
                                return v0
                            """)
                        }
                    }
                }
            }
            // Patch new UI
            if (classDef.type == "Lcom/p1/mobile/putong/core/ui/vip/privilegeNewUi/IntlPrivilegeCard;") {
                classDef.methods.forEach { method ->
                    if (method.name == "n" && method.parameterTypes.isEmpty() && method.returnType == "Z") {
                        Fingerprint(
                            accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.FINAL),
                            returnType = "Z",
                            parameters = emptyList(),
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
}

/**
 * Patches xma.v3() to return a future timestamp instead of querying the database.
 * This method returns the expiration time for a privilege, used by okp.b() for display.
 */
@Suppress("unused")
@JvmField
val subscriptionExpirationTimePatch = bytecodePatch(
    name = "Subscription Expiration Time",
    description = "Sets subscription expiration to a future date for display purposes",
    default = true,
) {
    compatibleWith(tantanCompatibility)
    execute {
        classDefForEach { classDef ->
            if (classDef.type != "Lp001l/xma;") return@classDefForEach
            classDef.methods.forEach { method ->
                if (method.name == "v3" && method.parameterTypes.size == 1 && 
                    method.parameterTypes[0] == "Lcom/p1/mobile/putong/core/data/SummarizedPrivilegesId;" && 
                    method.returnType == "J") {
                    Fingerprint(
                        accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.STATIC),
                        returnType = "J",
                        parameters = listOf("Lcom/p1/mobile/putong/core/data/SummarizedPrivilegesId;"),
                    ).matchOrNull(method)?.let { match ->
                        // Return a timestamp 365 days in the future (in seconds)
                        match.method.addInstructions(0, """
                            const-wide v0, 0x1a3f4c800L
                            return-wide v0
                        """)
                    }
                }
            }
        }
    }
}
