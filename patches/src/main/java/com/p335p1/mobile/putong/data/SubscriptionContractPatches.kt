package com.p335p1.mobile.putong.data

import app.morphe.patcher.Fingerprint
import app.morphe.patcher.extensions.InstructionExtensions.addInstructions
import app.morphe.patcher.patch.bytecodePatch
import com.android.tools.smali.dexlib2.AccessFlags

/**
 * Patches for subscription contract status checks.
 * 
 * The subscription management UI checks RecentContractInfo data from the server
 * to determine if a subscription is active. These patches bypass those checks.
 */

/**
 * Patches ugc0.k() to always return true.
 * This method checks if a purchase type has an active/upgraded subscription.
 */
@Suppress("unused")
@JvmField
val subscriptionContractUpgradedPatch = bytecodePatch(
    name = "Subscription Contract Status",
    description = "Bypasses subscription contract checks to show all tiers as active in subscription management",
    default = true,
) {
    compatibleWith(tantanCompatibility)
    execute {
        classDefForEach { classDef ->
            if (classDef.type != "Lp001l/ugc0;") return@classDefForEach
            classDef.methods.forEach { method ->
                if (method.name == "k" && method.parameterTypes.size == 1 && 
                    method.parameterTypes[0] == "Lcom/p1/mobile/putong/core/data/PurchaseType;" && 
                    method.returnType == "Z") {
                    Fingerprint(
                        accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.STATIC),
                        returnType = "Z",
                        parameters = listOf("Lcom/p1/mobile/putong/core/data/PurchaseType;"),
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
