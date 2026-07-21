package com.p1.mobile.putong.data

import app.morphe.patcher.Fingerprint
import app.morphe.patcher.extensions.InstructionExtensions.addInstructions
import app.morphe.patcher.patch.bytecodePatch
import com.android.tools.smali.dexlib2.AccessFlags

/**
 * Consolidated premium membership status patch.
 *
 * Patches `is*()` membership check methods on the User class so the current
 * user appears as Ultra Premium tier only. Lower tiers (VIP, SVIP, Platinum) are
 * handled by PremiumFeaturesPatch which returns false for them.
 * Each check respects `isMe()` so that other users' tier status remains unchanged.
 *
 * Methods patched:
 * - isUltraPremium()    → Ultra Premium tier (true for current user)
 * - isSupremePartner()  → Supreme Partner tier (true for current user)
 * - isODiamond()        → O Diamond tier (true for current user)
 * - isMembership(MT)    → Generic membership check (true for current user)
 * - isMembershipUsed(MT)→ Membership usage check (returns false = available)
 * - isVIPExpired()      → VIP expiration check (returns false = not expired)
 *
 * Note: isVIP(), isSVIP(), isPlatinum() are patched to return false by
 * PremiumFeaturesPatch to ensure subscription management only shows Ultra-Premium as active.
 */

private val userPredicateFingerprint = Fingerprint(
    accessFlags = listOf(AccessFlags.PUBLIC),
    returnType = "Z",
    parameters = emptyList(),
)

private val userPredicateMembershipFingerprint = Fingerprint(
    accessFlags = listOf(AccessFlags.PUBLIC),
    returnType = "Z",
    parameters = listOf("Lcom/p1/mobile/putong/data/MembershipType;"),
)

private val noArgReturnFalseFingerprint = Fingerprint(
    accessFlags = listOf(AccessFlags.PUBLIC),
    returnType = "Z",
    parameters = emptyList(),
)

private const val RETURN_TRUE_WITH_ME_CHECK = """
    invoke-virtual {p0}, Lcom/p1/mobile/putong/data/User;->isMe()Z
    move-result v0
    if-eqz v0, :cond_0
    const/4 v0, 0x1
    return v0
    :cond_0
"""

@Suppress("unused")
@JvmField
val premiumStatusPatch = bytecodePatch(
    name = "Premium Membership Status",
    description = "Grants all premium tier statuses (VIP, SVIP, Ultra Premium, Supreme Partner, Platinum, O Diamond) for the current user only",
    default = true,
) {
    compatibleWith(tantanCompatibility)
    execute {
        val trueWithMeCheck = setOf(
            "isUltraPremium", "isSupremePartner", "isODiamond"
        )
        val trueNoArgs = setOf("isVIPExpired") // false = not expired → isMe-gated false

        classDefForEach { classDef ->
            if (classDef.type != TANTAN_USER_CLASS) return@classDefForEach
            classDef.methods.forEach { method ->
                when {
                    method.name in trueWithMeCheck -> {
                        userPredicateFingerprint.matchOrNull(method)?.let { match ->
                            match.method.addInstructions(0, RETURN_TRUE_WITH_ME_CHECK)
                        }
                    }
                    method.name in trueNoArgs -> {
                        // For isVIPExpired, return false so VIP never appears expired
                        noArgReturnFalseFingerprint.matchOrNull(method)?.let { match ->
                            match.method.addInstructions(0, """
                                const/4 v0, 0x0
                                return v0
                            """)
                        }
                    }
                    method.name == "isMembership" -> {
                        userPredicateMembershipFingerprint.matchOrNull(method)?.let { match ->
                            match.method.addInstructions(0, RETURN_TRUE_WITH_ME_CHECK)
                        }
                    }
                    method.name == "isMembershipUsed" -> {
                        userPredicateMembershipFingerprint.matchOrNull(method)?.let { match ->
                            // isMembershipUsed must return false so consumed benefits show as available
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
}
