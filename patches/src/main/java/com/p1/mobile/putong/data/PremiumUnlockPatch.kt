package com.p1.mobile.putong.data

import app.morphe.patcher.Fingerprint
import app.morphe.patcher.extensions.InstructionExtensions.addInstructions
import app.morphe.patcher.patch.bytecodePatch
import com.android.tools.smali.dexlib2.AccessFlags

/**
 * Unified premium unlock patch.
 *
 * Merges four previously separate patches into a single bytecodePatch that covers
 * every aspect of premium access:
 *
 *  1. User class        – tier status methods (isUltraPremium, isVIP, …) and nullCheck
 *  2. xma class         – privilege gates (S3/b4), display timestamp (v3), server
 *                          refresh (u4/x4), and all wrapper methods
 *  3. Regional gates    – h6a (pricing) and u59 (tier availability)
 *  4. Feature gates     – CoreProduct, ugc0, zva0, th5, n3b0, sb90,
 *                          CounterSuperlikeAndUndoLimit
 */

// ── Fingerprints ────────────────────────────────────────────────────────────────

private val summPrivArgReturnBoolFingerprint = Fingerprint(
    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.STATIC),
    returnType = "Z",
    parameters = listOf("Lcom/p1/mobile/putong/core/data/SummarizedPrivilegesId;"),
)

private val summPrivArgStaticReturnLongFingerprint = Fingerprint(
    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.STATIC),
    returnType = "J",
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

private val userArgFinalReturnIntFingerprint = Fingerprint(
    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.FINAL),
    returnType = "I",
    parameters = listOf("Lcom/p1/mobile/putong/data/User;"),
)

private val userArgReturnBoolFingerprint = Fingerprint(
    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.FINAL),
    returnType = "Z",
    parameters = listOf("Lcom/p1/mobile/putong/data/User;"),
)

private val noArgReturnIntFingerprint = Fingerprint(
    accessFlags = listOf(AccessFlags.PUBLIC),
    returnType = "I",
    parameters = emptyList(),
)

private val userInstanceReturnBoolFingerprint = Fingerprint(
    accessFlags = listOf(AccessFlags.PUBLIC),
    returnType = "Z",
    parameters = emptyList(),
)

private val userPredicateMembershipFingerprint = Fingerprint(
    accessFlags = listOf(AccessFlags.PUBLIC),
    returnType = "Z",
    parameters = listOf("Lcom/p1/mobile/putong/data/MembershipType;"),
)

private val oneUserArgStaticReturnBoolFingerprint = Fingerprint(
    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.STATIC),
    returnType = "Z",
    parameters = listOf("Lcom/p1/mobile/putong/data/User;"),
)

private val serverRefreshU4Fingerprint = Fingerprint(
    accessFlags = listOf(AccessFlags.PUBLIC),
    returnType = "Lp001l/c;",
    parameters = emptyList(),
)

private val serverRefreshX4Fingerprint = Fingerprint(
    accessFlags = listOf(AccessFlags.PUBLIC),
    returnType = "Lp001l/c;",
    parameters = emptyList(),
)

private val noArgFinalReturnBoolFingerprint = Fingerprint(
    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.FINAL),
    returnType = "Z",
    parameters = emptyList(),
)

// ── Constants ───────────────────────────────────────────────────────────────────

private const val RETURN_TRUE = """
    const/4 v0, 0x1
    return v0
"""

private const val RETURN_FALSE = """
    const/4 v0, 0x0
    return v0
"""

private const val RETURN_TRUE_WITH_ME_CHECK = """
    invoke-virtual {p0}, Lcom/p1/mobile/putong/data/User;->isMe()Z
    move-result v0
    if-eqz v0, :cond_0
    const/4 v0, 0x1
    return v0
    :cond_0
"""

// 365 days in seconds — a comfortably far-future timestamp returned as a long.
private const val FAR_FUTURE_SECONDS = 0x1A3F4C800L

// ── Patch ───────────────────────────────────────────────────────────────────────

@Suppress("unused")
@JvmField
val premiumUnlockPatch = bytecodePatch(
    name = "Premium Unlock",
    description = "Unlocks all premium features, tier statuses, subscription validation, and display",
    default = true,
) {
    compatibleWith(tantanCompatibility)
    execute {
        classDefForEach { classDef ->
            when (classDef.type) {

                // ── User class: tier status + membership ────────────────────────
                TANTAN_USER_CLASS -> {
                    classDef.methods.forEach { method ->
                        when {
                            // isUltraPremium, isSupremePartner, isODiamond → true (isMe-guarded)
                            method.name in setOf("isUltraPremium", "isSupremePartner", "isODiamond") &&
                                method.parameterTypes.isEmpty() && method.returnType == "Z" -> {
                                userInstanceReturnBoolFingerprint.matchOrNull(method)?.let { match ->
                                    match.method.addInstructions(0, RETURN_TRUE_WITH_ME_CHECK)
                                }
                            }
                            // isVIP, isSVIP, isPlatinum → false (isMe-guarded)
                            method.name in setOf("isVIP", "isSVIP", "isPlatinum") &&
                                method.parameterTypes.isEmpty() && method.returnType == "Z" -> {
                                userInstanceReturnBoolFingerprint.matchOrNull(method)?.let { match ->
                                    match.method.addInstructions(0, """
                                        invoke-virtual {p0}, Lcom/p1/mobile/putong/data/User;->isMe()Z
                                        move-result v0
                                        if-eqz v0, :cond_0
                                        const/4 v0, 0x0
                                        return v0
                                        :cond_0
                                    """)
                                }
                            }
                            // isVIPExpired → false (never expired)
                            method.name == "isVIPExpired" &&
                                method.parameterTypes.isEmpty() && method.returnType == "Z" -> {
                                userInstanceReturnBoolFingerprint.matchOrNull(method)?.let { match ->
                                    match.method.addInstructions(0, RETURN_FALSE)
                                }
                            }
                            // isMembership(MT) → true (isMe-guarded)
                            method.name == "isMembership" -> {
                                userPredicateMembershipFingerprint.matchOrNull(method)?.let { match ->
                                    match.method.addInstructions(0, RETURN_TRUE_WITH_ME_CHECK)
                                }
                            }
                            // isMembershipUsed(MT) → false (benefits appear available)
                            method.name == "isMembershipUsed" -> {
                                userPredicateMembershipFingerprint.matchOrNull(method)?.let { match ->
                                    match.method.addInstructions(0, RETURN_FALSE)
                                }
                            }
                            // nullCheck() → initialize status, set membership.name to "boostVip"
                            method.name == "nullCheck" && method.parameterTypes.isEmpty() &&
                                method.returnType == "V" -> {
                                val nullCheckFingerprint = Fingerprint(
                                    accessFlags = listOf(AccessFlags.PUBLIC),
                                    returnType = "V",
                                    parameters = emptyList(),
                                )
                                nullCheckFingerprint.matchOrNull(method)?.let { match ->
                                    match.method.addInstructions(0, """
                                        # Check if status is null
                                        iget-object v0, p0, Lcom/p1/mobile/putong/data/User;->status:Ljava/util/List;
                                        if-nez v0, :status_not_null
                                        # Initialize status to empty ArrayList
                                        new-instance v0, Ljava/util/ArrayList;
                                        invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
                                        iput-object v0, p0, Lcom/p1/mobile/putong/data/User;->status:Ljava/util/List;
                                        :status_not_null
                                        
                                        # Check if this is the current user (isMe())
                                        invoke-virtual {p0}, Lcom/p1/mobile/putong/data/User;->isMe()Z
                                        move-result v0
                                        if-eqz v0, :not_me
                                        
                                        # Set membership.name to "boostVip" (Ultra Premium) for current user
                                        iget-object v0, p0, Lcom/p1/mobile/putong/data/User;->membership:Lcom/p1/mobile/putong/data/Membership;
                                        if-eqz v0, :membership_null
                                        const-string v1, "boostVip"
                                        invoke-static {v1}, Lcom/p1/mobile/putong/data/MembershipType;->get(Ljava/lang/String;)Lcom/p1/mobile/putong/data/MembershipType;
                                        move-result-object v1
                                        iput-object v1, v0, Lcom/p1/mobile/putong/data/Membership;->name:Lcom/p1/mobile/putong/data/MembershipType;
                                        :membership_null
                                        :not_me
                                    """)
                                }
                            }
                        }
                    }
                }

                // ── xma: privilege gates + display timestamp ────────────────────
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
                            // v3: display timestamp → far-future seconds
                            method.name == "v3" && method.parameterTypes.size == 1 &&
                                method.parameterTypes[0] == "Lcom/p1/mobile/putong/core/data/SummarizedPrivilegesId;" &&
                                method.returnType == "J" -> {
                                summPrivArgStaticReturnLongFingerprint.matchOrNull(method)?.let { match ->
                                    match.method.addInstructions(0, """
                                        const-wide v0, 0x${FAR_FUTURE_SECONDS.toString(16)}L
                                        return-wide v0
                                    """.trimIndent())
                                }
                            }
                            // L3: production-mode feature gate → always allowed
                            method.name == "L3" && method.parameterTypes.isEmpty() &&
                                method.returnType == "Z" -> {
                                noArgStaticReturnBoolFingerprint.matchOrNull(method)?.let { match ->
                                    match.method.addInstructions(0, RETURN_TRUE)
                                }
                            }
                            // u4: server refresh → return null to prevent override
                            method.name == "u4" && method.parameterTypes.isEmpty() &&
                                method.returnType == "Lp001l/c;" -> {
                                serverRefreshU4Fingerprint.matchOrNull(method)?.let { match ->
                                    match.method.addInstructions(0, """
                                        const/4 v0, 0x0
                                        return-object v0
                                    """)
                                }
                            }
                            // x4: server refresh → return null to prevent override
                            method.name == "x4" && method.parameterTypes.isEmpty() &&
                                method.returnType == "Lp001l/c;" -> {
                                serverRefreshX4Fingerprint.matchOrNull(method)?.let { match ->
                                    match.method.addInstructions(0, """
                                        const/4 v0, 0x0
                                        return-object v0
                                    """)
                                }
                            }
                            // S3-delegating methods + j4(): return false (not expired / Ultra-Premium active)
                            // j4() is called by IntlPrivilegeCard.l()/n() for Ultra-Premium cards
                            // Since l()/n() return !zM4, j4() returning false makes Ultra-Premium show as active
                            method.name in setOf("W3", "X3", "d4", "i4", "l4", "j4") &&
                                method.parameterTypes.isEmpty() && method.returnType == "Z" &&
                                AccessFlags.STATIC.isSet(method.accessFlags) -> {
                                noArgStaticReturnBoolFingerprint.matchOrNull(method)?.let { match ->
                                    match.method.addInstructions(0, RETURN_FALSE)
                                }
                            }
                            // e4(), h4(), m4(): return true for filter UI inverted logic
                            // h4() and m4() are called by IntlPrivilegeCard.l()/n() for VIP/Likers cards
                            // Since l()/n() return !zM4, these returning true makes those tiers show as NOT active
                            method.name in setOf("e4", "h4", "m4") &&
                                method.parameterTypes.isEmpty() && method.returnType == "Z" &&
                                AccessFlags.STATIC.isSet(method.accessFlags) -> {
                                noArgStaticReturnBoolFingerprint.matchOrNull(method)?.let { match ->
                                    match.method.addInstructions(0, RETURN_TRUE)
                                }
                            }
                            // Non-ultraPremium tier methods: return false
                            method.name in setOf("f4", "H3", "Z3", "B3", "U3") &&
                                method.parameterTypes.isEmpty() && method.returnType == "Z" &&
                                AccessFlags.STATIC.isSet(method.accessFlags) -> {
                                noArgStaticReturnBoolFingerprint.matchOrNull(method)?.let { match ->
                                    match.method.addInstructions(0, RETURN_FALSE)
                                }
                            }
                            // Catch-all: all other no-arg static boolean methods → true
                            method.parameterTypes.isEmpty() && method.returnType == "Z" &&
                                method.name !in listOf("L3") &&
                                AccessFlags.STATIC.isSet(method.accessFlags) -> {
                                noArgStaticReturnBoolFingerprint.matchOrNull(method)?.let { match ->
                                    match.method.addInstructions(0, RETURN_TRUE)
                                }
                            }
                        }
                    }
                }

                // ── Subscription card UI: "is subscription active?" ─────────────
                // IntlPrivilegeCard.l() and n() are already tier-aware - they check the card's
                // PurchaseType field and call different xma methods based on tier, then invert the result.
                // We don't patch these methods; instead we ensure the xma methods they call return
                // the correct values (see xma patches below).

                // ── Regional availability gates ─────────────────────────────────

                // h6a: membership pricing restriction
                "Lp001l/h6a;" -> {
                    classDef.methods.forEach { method ->
                        if (method.name == "c" && method.parameterTypes.isEmpty() && method.returnType == "Z") {
                            noArgStaticReturnBoolFingerprint.matchOrNull(method)?.let { match ->
                                match.method.addInstructions(0, RETURN_TRUE)
                            }
                        }
                    }
                }

                // u59: tier availability checks (regional gates)
                "Lp001l/u59;" -> {
                    classDef.methods.forEach { method ->
                        when {
                            method.name in setOf("U", "S", "O") &&
                                method.parameterTypes.isEmpty() && method.returnType == "Z" -> {
                                noArgStaticReturnBoolFingerprint.matchOrNull(method)?.let { match ->
                                    match.method.addInstructions(0, RETURN_TRUE)
                                }
                            }
                            method.name == "V" && method.parameterTypes.size == 1 &&
                                method.parameterTypes[0] == "Lcom/p1/mobile/putong/data/User;" &&
                                method.returnType == "Z" -> {
                                oneUserArgStaticReturnBoolFingerprint.matchOrNull(method)?.let { match ->
                                    match.method.addInstructions(0, RETURN_TRUE)
                                }
                            }
                        }
                    }
                }

                // ── Other feature gates ─────────────────────────────────────────

                // CoreProduct.u4: "is product promotion active?" → true
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

                // ugc0.k: "is subscription upgraded?" → true
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

                // zva0.B0: tier rank lookup → 3 (Ultra Premium)
                "Lp001l/zva0;" -> {
                    classDef.methods.forEach { method ->
                        if (method.name == "B0" && method.parameterTypes.size == 1 &&
                            method.parameterTypes[0] == "Lcom/p1/mobile/putong/data/User;" &&
                            method.returnType == "I"
                        ) {
                            userArgFinalReturnIntFingerprint.matchOrNull(method)?.let { match ->
                                match.method.addInstructions(0, """
                                    invoke-virtual {p0}, Lcom/p1/mobile/putong/data/User;->isMe()Z
                                    move-result v0
                                    if-eqz v0, :not_me
                                    const/4 v0, 0x3
                                    return v0
                                    :not_me
                                """)
                            }
                        }
                    }
                }

                // th5: remote config gates for swipe actions → false
                "Lp001l/th5;" -> {
                    classDef.methods.forEach { method ->
                        if (method.name in listOf("d", "f", "h") &&
                            method.parameterTypes.isEmpty() && method.returnType == "Z"
                        ) {
                            noArgStaticReturnBoolFingerprint.matchOrNull(method)?.let { match ->
                                match.method.addInstructions(0, RETURN_FALSE)
                            }
                        }
                    }
                }

                // n3b0.q(): "has likers limit been exceeded?" → false (limit NOT exceeded)
                "Lp001l/n3b0;" -> {
                    classDef.methods.forEach { method ->
                        if (method.name == "q" && method.parameterTypes.isEmpty() &&
                            method.returnType == "Z"
                        ) {
                            noArgStaticReturnBoolFingerprint.matchOrNull(method)?.let { match ->
                                match.method.addInstructions(0, RETURN_FALSE)
                            }
                        }
                    }
                }

                // sb90.c(): "should apply blur?" → false (always show clear)
                "Lp001l/sb90;" -> {
                    classDef.methods.forEach { method ->
                        if (method.name == "c" && method.parameterTypes.size == 1 &&
                            method.parameterTypes[0] == "Lcom/p1/mobile/putong/data/User;" &&
                            method.returnType == "Z"
                        ) {
                            userArgReturnBoolFingerprint.matchOrNull(method)?.let { match ->
                                match.method.addInstructions(0, RETURN_FALSE)
                            }
                        }
                    }
                }

                // CounterSuperlikeAndUndoLimit: remainToday/remainAll → MAX_VALUE
                "Lcom/p1/mobile/putong/data/CounterSuperlikeAndUndoLimit;" -> {
                    classDef.methods.forEach { method ->
                        if (method.name in listOf("remainToday", "remainAll") &&
                            method.parameterTypes.isEmpty() && method.returnType == "I"
                        ) {
                            noArgReturnIntFingerprint.matchOrNull(method)?.let { match ->
                                match.method.addInstructions(0, """
                                    const v0, 0x7fffffff
                                    return v0
                                """)
                            }
                        }
                    }
                }
            }
        }
    }
}
