package com.p1.mobile.putong.data

import app.morphe.patcher.Fingerprint
import app.morphe.patcher.extensions.InstructionExtensions.addInstructions
import app.morphe.patcher.patch.bytecodePatch
import com.android.tools.smali.dexlib2.AccessFlags

/**
 * Consolidated subscription management display patch.
 *
 * The subscription page (`IntlPrivilegeCard`) decides what to render based on
 * combined local + server checks. When those checks are bypassed:
 *
 * - IntlPrivilegeCard.l() and .n() (the "is subscription active?" check) are
 *   forced to return true so the card always shows the "active" layout.
 * - xma.v3(SummarizedPrivilegesId) is forced to return a far-future timestamp
 *   so the "X days remaining" text generation always produces a positive number,
 *   never the "not yet activated" fallback.
 *
 * The tier-specific methods (f4, H3, Z3, B3, U3) in PremiumFeaturesPatch return
 * false for non-Ultra-Premium tiers, so only Ultra-Premium shows as active.
 *
 * Methods patched:
 * - com/p1/.../vip/intlPrivilege/IntlPrivilegeCard::l()
 * - com/p1/.../vip/privilegeNewUi/IntlPrivilegeCard::n()
 * - p001l/xma::v3(SummarizedPrivilegesId)
 */

private val noArgFinalReturnBoolFingerprint = Fingerprint(
    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.FINAL),
    returnType = "Z",
    parameters = emptyList(),
)

private val summPrivArgStaticReturnLongFingerprint = Fingerprint(
    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.STATIC),
    returnType = "J",
    parameters = listOf("Lcom/p1/mobile/putong/core/data/SummarizedPrivilegesId;"),
)

// 365 days in seconds — a comfortably far-future timestamp returned as a long.
private const val FAR_FUTURE_SECONDS = 0x1A3F4C800L

private const val RETURN_TRUE = """
    const/4 v0, 0x1
    return v0
"""

@Suppress("unused")
@JvmField
val subscriptionDisplayPatch = bytecodePatch(
    name = "Subscription Display Status",
    description = "Subscription management UI shows Ultra-Premium as active with valid expiration (no 'not yet activated' message)",
    default = true,
) {
    compatibleWith(tantanCompatibility)
    execute {
        classDefForEach { classDef ->
            when (classDef.type) {
                // Old UI: subscription card activity check
                "Lcom/p1/mobile/putong/core/ui/vip/intlPrivilege/IntlPrivilegeCard;" -> {
                    classDef.methods.forEach { method ->
                        if (method.name == "l" && method.parameterTypes.isEmpty() && method.returnType == "Z") {
                            noArgFinalReturnBoolFingerprint.matchOrNull(method)?.let { match ->
                                match.method.addInstructions(0, RETURN_TRUE)
                            }
                        }
                    }
                }
                // New UI: subscription card activity check
                "Lcom/p1/mobile/putong/core/ui/vip/privilegeNewUi/IntlPrivilegeCard;" -> {
                    classDef.methods.forEach { method ->
                        if (method.name == "n" && method.parameterTypes.isEmpty() && method.returnType == "Z") {
                            noArgFinalReturnBoolFingerprint.matchOrNull(method)?.let { match ->
                                match.method.addInstructions(0, RETURN_TRUE)
                            }
                        }
                    }
                }
                // xma.v3 - returns far-future timestamp for display text
                "Lp001l/xma;" -> {
                    classDef.methods.forEach { method ->
                        if (method.name == "v3" && method.parameterTypes.size == 1 &&
                            method.parameterTypes[0] == "Lcom/p1/mobile/putong/core/data/SummarizedPrivilegesId;" &&
                            method.returnType == "J"
                        ) {
                            summPrivArgStaticReturnLongFingerprint.matchOrNull(method)?.let { match ->
                                match.method.addInstructions(0, """
                                    const-wide v0, 0x${FAR_FUTURE_SECONDS.toString(16)}L
                                    return-wide v0
                                """.trimIndent())
                            }
                        }
                    }
                }
            }
        }
    }
}
