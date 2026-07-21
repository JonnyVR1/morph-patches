package com.p1.mobile.putong.data

import app.morphe.patcher.Fingerprint
import app.morphe.patcher.extensions.InstructionExtensions.addInstructions
import app.morphe.patcher.patch.bytecodePatch
import com.android.tools.smali.dexlib2.AccessFlags

/**
 * Subscription display timestamp patch.
 *
 * The subscription page uses xma.v3(SummarizedPrivilegesId) to generate the
 * "X days remaining" text. This patch forces it to return a far-future timestamp
 * so the text always produces a positive number, never the "not yet activated" fallback.
 *
 * Note: IntlPrivilegeCard.l()/n() patches were removed because they made ALL tiers
 * show as "active". The tier-specific methods in PremiumFeaturesPatch now handle
 * which tier shows as active (only Ultra-Premium).
 *
 * Methods patched:
 * - p001l/xma::v3(SummarizedPrivilegesId)
 */

private val summPrivArgStaticReturnLongFingerprint = Fingerprint(
    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.STATIC),
    returnType = "J",
    parameters = listOf("Lcom/p1/mobile/putong/core/data/SummarizedPrivilegesId;"),
)

// 365 days in seconds — a comfortably far-future timestamp returned as a long.
private const val FAR_FUTURE_SECONDS = 0x1A3F4C800L

@Suppress("unused")
@JvmField
val subscriptionDisplayPatch = bytecodePatch(
    name = "Subscription Display Status",
    description = "Subscription management UI shows valid expiration timestamps (no 'not yet activated' message)",
    default = true,
) {
    compatibleWith(tantanCompatibility)
    execute {
        classDefForEach { classDef ->
            // xma.v3 - returns far-future timestamp for display text
            if (classDef.type == "Lp001l/xma;") {
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
