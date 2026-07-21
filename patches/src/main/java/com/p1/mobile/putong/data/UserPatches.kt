package com.p1.mobile.putong.data

import app.morphe.patcher.Fingerprint
import app.morphe.patcher.extensions.InstructionExtensions.addInstructions
import app.morphe.patcher.patch.bytecodePatch
import com.android.tools.smali.dexlib2.AccessFlags

/**
 * Consolidated premium membership status patch.
 *
 * Patches all `is*()` membership check methods on the User class so the current
 * user appears as every premium tier. Each check respects `isMe()` so that other
 * users' tier status remains unchanged (only the logged-in user appears as premium).
 *
 * Methods patched:
 * - isVIP()             → VIP tier
 * - isSVIP()            → Super VIP tier
 * - isUltraPremium()    → Ultra Premium tier
 * - isSupremePartner()  → Supreme Partner tier
 * - isPlatinum()        → Platinum tier
 * - isODiamond()        → O Diamond tier
 * - isMembership(MT)    → Generic membership check
 * - isMembershipUsed(MT)→ Membership usage check
 * - isVIPExpired()      → VIP expiration check (returns false = not expired)
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
            "isVIP", "isSVIP", "isUltraPremium", "isSupremePartner", "isPlatinum", "isODiamond"
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
