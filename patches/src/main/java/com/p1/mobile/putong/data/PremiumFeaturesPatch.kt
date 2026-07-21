package com.p1.mobile.putong.data

import app.morphe.patcher.Fingerprint
import app.morphe.patcher.extensions.InstructionExtensions.addInstructions
import app.morphe.patcher.patch.bytecodePatch
import com.android.tools.smali.dexlib2.AccessFlags

/**
 * Consolidated premium features unlock patch.
 *
 * Targets every gating method that decides whether a premium feature is available
 * or functional in the running app. Once these patches are applied, all premium
 * privileges appear valid, every promotion is considered active, and feature
 * gates (including the production-mode-only `xma.L3` test fallback) return true.
 *
 * Methods patched:
 *
 * - p001l/xma::S3(SummarizedPrivilegesId)  → "is privilege expired?" → false (always valid)
 * - p001l/xma::b4(SummarizedPrivilegesId)  → "is privilege available?" → true
 * - p001l/xma::L3()                        → Feature gate that returns false in production
 *                                            unless a test flag is set (see also: private
 *                                            patches above for the ctx-sensitive check).
 * - com/p1/mobile/putong/core/api/CoreProduct::u4(String)
 *                                          → "is product promotion active?" → true
 * - p001l/ugc0::k(PurchaseType)            → "is subscription upgraded?" → true
 */

private val summPrivArgReturnBoolFingerprint = Fingerprint(
    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.STATIC),
    returnType = "Z",
    parameters = listOf("Lcom/p1/mobile/putong/core/data/SummarizedPrivilegesId;"),
)

private val noArgStaticReturnBoolFingerprint = Fingerprint(
    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.STATIC),
    returnType = "Z",
    parameters = emptyList(),
)

private val stringArgFinalReturnBoolFingerprint = Fingerprint(
    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.FINAL),
    returnType = "Z",
    parameters = listOf("Ljava/lang/String;"),
)

private val purchaseTypeArgStaticReturnBoolFingerprint = Fingerprint(
    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.STATIC),
    returnType = "Z",
    parameters = listOf("Lcom/p1/mobile/putong/core/data/PurchaseType;"),
)

private const val RETURN_TRUE = """
    const/4 v0, 0x1
    return v0
"""

private const val RETURN_FALSE = """
    const/4 v0, 0x0
    return v0
"""

@Suppress("unused")
@JvmField
val premiumFeaturesPatch = bytecodePatch(
    name = "Premium Features",
    description = "Unlocks every premium feature - bypasses privilege expiration, feature gates, promotion checks, and contract status checks",
    default = true,
) {
    compatibleWith(tantanCompatibility)
    execute {
        classDefForEach { classDef ->
            when (classDef.type) {
                // xma privilege & gate methods (S3, b4, L3)
                "Lp001l/xma;" -> {
                    classDef.methods.forEach { method ->
                        when {
                            // S3: privilege expiration check → never expired
                            method.name == "S3" && method.parameterTypes.size == 1 &&
                                method.parameterTypes[0] == "Lcom/p1/mobile/putong/core/data/SummarizedPrivilegesId;" &&
                                method.returnType == "Z" -> {
                                summPrivArgReturnBoolFingerprint.matchOrNull(method)?.let { match ->
                                    match.method.addInstructions(0, RETURN_FALSE)
                                }
                            }
                            // b4: privilege availability check → always available
                            method.name == "b4" && method.parameterTypes.size == 1 &&
                                method.parameterTypes[0] == "Lcom/p1/mobile/putong/core/data/SummarizedPrivilegesId;" &&
                                method.returnType == "Z" -> {
                                summPrivArgReturnBoolFingerprint.matchOrNull(method)?.let { match ->
                                    match.method.addInstructions(0, RETURN_TRUE)
                                }
                            }
                            // L3: production-mode feature gate → always allowed
                            method.name == "L3" && method.parameterTypes.isEmpty() &&
                                method.returnType == "Z" -> {
                                noArgStaticReturnBoolFingerprint.matchOrNull(method)?.let { match ->
                                    match.method.addInstructions(0, RETURN_TRUE)
                                }
                            }
                        }
                    }
                }

                // CoreProduct.u4: "is this product promotion active?" → always true
                "Lcom/p1/mobile/putong/core/api/CoreProduct;" -> {
                    classDef.methods.forEach { method ->
                        if (method.name == "u4" && method.parameterTypes.size == 1 &&
                            method.parameterTypes[0] == "Ljava/lang/String;" &&
                            method.returnType == "Z"
                        ) {
                            stringArgFinalReturnBoolFingerprint.matchOrNull(method)?.let { match ->
                                match.method.addInstructions(0, RETURN_TRUE)
                            }
                        }
                    }
                }

                // ugc0.k: "is purchase upgraded?" → always true
                "Lp001l/ugc0;" -> {
                    classDef.methods.forEach { method ->
                        if (method.name == "k" && method.parameterTypes.size == 1 &&
                            method.parameterTypes[0] == "Lcom/p1/mobile/putong/core/data/PurchaseType;" &&
                            method.returnType == "Z"
                        ) {
                            purchaseTypeArgStaticReturnBoolFingerprint.matchOrNull(method)?.let { match ->
                                match.method.addInstructions(0, RETURN_TRUE)
                            }
                        }
                    }
                }
            }
        }
    }
}
