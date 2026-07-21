package com.p1.mobile.putong.data

import app.morphe.patcher.Fingerprint
import app.morphe.patcher.extensions.InstructionExtensions.addInstructions
import app.morphe.patcher.patch.bytecodePatch
import com.android.tools.smali.dexlib2.AccessFlags

/**
 * Universal premium feature unlock patch.
 * 
 * This patch targets CoreProduct.u4() which is the central method that checks
 * if ANY premium feature promotion is active. This single check gates access to:
 * - See who liked me
 * - VIP features
 * - SVIP features
 * - And all other tier-based premium features
 * 
 * By making this method always return true, all gated features are unlocked.
 */

@Suppress("unused")
@JvmField
val allPremiumFeaturesPatch = bytecodePatch(
    name = "All Premium Features",
    description = "Unlocks all premium tier features including 'see who liked me', VIP, SVIP, and other gated functionality",
    default = true,
) {
    compatibleWith(tantanCompatibility)
    execute {
        classDefForEach { classDef ->
            if (classDef.type != "Lcom/p1/mobile/putong/core/api/CoreProduct;") return@classDefForEach
            classDef.methods.forEach { method ->
                if (method.name == "u4" && method.parameterTypes.size == 1 && 
                    method.parameterTypes[0] == "Ljava/lang/String;" && method.returnType == "Z") {
                    Fingerprint(
                        accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.FINAL),
                        returnType = "Z",
                        parameters = listOf("Ljava/lang/String;"),
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
