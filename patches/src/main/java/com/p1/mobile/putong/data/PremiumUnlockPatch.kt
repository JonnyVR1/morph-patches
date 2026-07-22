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
 *  4. Feature gates     – CoreProduct, ugc0, zva0, th5, qgl0, n3b0, sb90,
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

private val userPrivilegeArgStaticReturnBoolFingerprint = Fingerprint(
    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.STATIC),
    returnType = "Z",
    parameters = listOf("Lcom/p1/mobile/putong/core/data/UserPrivilege;"),
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

private val userPrivilegeArgStaticReturnStringFingerprint = Fingerprint(
    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.STATIC),
    returnType = "Ljava/lang/String;",
    parameters = listOf("Lcom/p1/mobile/putong/core/data/UserPrivilege;"),
)

private val noArgStaticReturnLongFingerprint = Fingerprint(
    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.STATIC),
    returnType = "J",
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

// Far-future timestamp in milliseconds (FAR_FUTURE_SECONDS * 1000).
private const val FAR_FUTURE_MS = 0x66700F60000L

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
                            // isUltraPremium, isSupremePartner → true (isMe-guarded)
                            method.name in setOf("isUltraPremium", "isSupremePartner") &&
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
                            // gpHideVip → false (isMe-guarded, prevents badge hiding)
                            method.name == "gpHideVip" &&
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
                            // isHideIconFromSVipWithMe → false (isMe-guarded, prevents icon hiding)
                            method.name == "isHideIconFromSVipWithMe" &&
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
                            // isMembershipUsed(MT) → false (isMe-guarded)
                            method.name == "isMembershipUsed" -> {
                                userPredicateMembershipFingerprint.matchOrNull(method)?.let { match ->
                                    match.method.addInstructions(0, RETURN_FALSE)
                                }
                            }
                            // nullCheck() → initialize status to prevent NPE
                            method.name == "nullCheck" && method.parameterTypes.isEmpty() &&
                                method.returnType == "V" -> {
                                val nullCheckFingerprint = Fingerprint(
                                    accessFlags = listOf(AccessFlags.PUBLIC),
                                    returnType = "V",
                                    parameters = emptyList(),
                                )
                                nullCheckFingerprint.matchOrNull(method)?.let { match ->
                                    match.method.addInstructions(0, """
                                        iget-object v0, p0, Lcom/p1/mobile/putong/data/User;->status:Ljava/util/List;
                                        if-nez v0, :status_not_null
                                        new-instance v0, Ljava/util/ArrayList;
                                        invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
                                        iput-object v0, p0, Lcom/p1/mobile/putong/data/User;->status:Ljava/util/List;
                                        :status_not_null
                                    """)
                                }
                            }
                            // isVIPUsed → true (isMe-guarded)
                            method.name == "isVIPUsed" &&
                                method.parameterTypes.isEmpty() && method.returnType == "Z" -> {
                                userInstanceReturnBoolFingerprint.matchOrNull(method)?.let { match ->
                                    match.method.addInstructions(0, RETURN_TRUE_WITH_ME_CHECK)
                                }
                            }
                            // getVipExpireTime → far future (isMe-guarded)
                            method.name == "getVipExpireTime" &&
                                method.parameterTypes.isEmpty() && method.returnType == "J" -> {
                                val getVipExpireTimeFingerprint = Fingerprint(
                                    accessFlags = listOf(AccessFlags.PUBLIC),
                                    returnType = "J",
                                    parameters = emptyList(),
                                )
                                getVipExpireTimeFingerprint.matchOrNull(method)?.let { match ->
                                    match.method.addInstructions(0, """
                                        invoke-virtual {p0}, Lcom/p1/mobile/putong/data/User;->isMe()Z
                                        move-result v0
                                        if-eqz v0, :not_me
                                        const-wide v0, 0x7fffffffffffffffL
                                        return-wide v0
                                        :not_me
                                    """)
                                }
                            }
                            // getVipToExpireTimeInMill → far future (isMe-guarded)
                            method.name == "getVipToExpireTimeInMill" &&
                                method.parameterTypes.isEmpty() && method.returnType == "J" -> {
                                val getVipToExpireTimeInMillFingerprint = Fingerprint(
                                    accessFlags = listOf(AccessFlags.PUBLIC),
                                    returnType = "J",
                                    parameters = emptyList(),
                                )
                                getVipToExpireTimeInMillFingerprint.matchOrNull(method)?.let { match ->
                                    match.method.addInstructions(0, """
                                        invoke-virtual {p0}, Lcom/p1/mobile/putong/data/User;->isMe()Z
                                        move-result v0
                                        if-eqz v0, :not_me
                                        const-wide v0, 0x7fffffffffffffffL
                                        return-wide v0
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
                            // e4(), h4(): return false (not expired)
                            method.name in setOf("e4", "h4") &&
                                method.parameterTypes.isEmpty() && method.returnType == "Z" &&
                                AccessFlags.STATIC.isSet(method.accessFlags) -> {
                                noArgStaticReturnBoolFingerprint.matchOrNull(method)?.let { match ->
                                    match.method.addInstructions(0, RETURN_FALSE)
                                }
                            }
                            // m4(): VIP expired check → return true (VIP is NOT active, override paid subscription)
                            method.name == "m4" &&
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
                            // Credit-count methods: return large value for unlimited credits
                            method.name in setOf("Q3", "z4", "m3", "A4", "o3", "p3", "v4", "k3", "l3", "r3", "t3") &&
                                method.parameterTypes.isEmpty() && method.returnType == "I" &&
                                AccessFlags.STATIC.isSet(method.accessFlags) -> {
                                noArgReturnIntFingerprint.matchOrNull(method)?.let { match ->
                                    match.method.addInstructions(0, """
                                        const v0, 0x30d40
                                        return v0
                                    """)
                                }
                            }
                            // T3(UserPrivilege): "is privilege expired?" → false (not expired)
                            method.name == "T3" && method.parameterTypes.size == 1 &&
                                method.parameterTypes[0] == "Lcom/p1/mobile/putong/core/data/UserPrivilege;" &&
                                method.returnType == "Z" -> {
                                userPrivilegeArgStaticReturnBoolFingerprint.matchOrNull(method)?.let { match ->
                                    match.method.addInstructions(0, RETURN_FALSE)
                                }
                            }
                            // c4(UserPrivilege): "is privilege active?" → true
                            method.name == "c4" && method.parameterTypes.size == 1 &&
                                method.parameterTypes[0] == "Lcom/p1/mobile/putong/core/data/UserPrivilege;" &&
                                method.returnType == "Z" -> {
                                userPrivilegeArgStaticReturnBoolFingerprint.matchOrNull(method)?.let { match ->
                                    match.method.addInstructions(0, RETURN_TRUE)
                                }
                            }
                            // a4(PurchaseType): "is purchase expired?" → false (not expired)
                            method.name == "a4" && method.parameterTypes.size == 1 &&
                                method.parameterTypes[0] == "Lcom/p1/mobile/putong/core/data/PurchaseType;" &&
                                method.returnType == "Z" -> {
                                purchaseTypeArgStaticReturnBoolFingerprint.matchOrNull(method)?.let { match ->
                                    match.method.addInstructions(0, RETURN_FALSE)
                                }
                            }
                            // w3(SummarizedPrivilegesId): expiredTime → far future (never expires)
                            method.name == "w3" && method.parameterTypes.size == 1 &&
                                method.parameterTypes[0] == "Lcom/p1/mobile/putong/core/data/SummarizedPrivilegesId;" &&
                                method.returnType == "J" -> {
                                summPrivArgStaticReturnLongFingerprint.matchOrNull(method)?.let { match ->
                                    match.method.addInstructions(0, """
                                        const-wide v0, 0x7fffffffffffffffL
                                        return-wide v0
                                    """)
                                }
                            }
                            // q3(): femaleVip expiredTime → far future (never expires)
                            method.name == "q3" && method.parameterTypes.isEmpty() &&
                                method.returnType == "J" -> {
                                noArgStaticReturnLongFingerprint.matchOrNull(method)?.let { match ->
                                    match.method.addInstructions(0, """
                                        const-wide v0, 0x7fffffffffffffffL
                                        return-wide v0
                                    """)
                                }
                            }
                            // s3(): limitedTrialSee expiredTime → far future (never expires)
                            method.name == "s3" && method.parameterTypes.isEmpty() &&
                                method.returnType == "J" -> {
                                noArgStaticReturnLongFingerprint.matchOrNull(method)?.let { match ->
                                    match.method.addInstructions(0, """
                                        const-wide v0, 0x7fffffffffffffffL
                                        return-wide v0
                                    """)
                                }
                            }
                            // J3() instance method: "can read messages?" → true
                            method.name == "J3" && method.parameterTypes.isEmpty() &&
                                method.returnType == "Z" && !AccessFlags.STATIC.isSet(method.accessFlags) -> {
                                userInstanceReturnBoolFingerprint.matchOrNull(method)?.let { match ->
                                    match.method.addInstructions(0, RETURN_TRUE)
                                }
                            }
                            // K3() instance method: "is revoke unpair expired?" → false (not expired)
                            method.name == "K3" && method.parameterTypes.isEmpty() &&
                                method.returnType == "Z" && !AccessFlags.STATIC.isSet(method.accessFlags) -> {
                                userInstanceReturnBoolFingerprint.matchOrNull(method)?.let { match ->
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

                // ── sja: picks remaining count (bypasses xma, reads directly from cache) ──
                "Lp001l/sja;" -> {
                    classDef.methods.forEach { method ->
                        when {
                            method.name in setOf("r3", "B3") &&
                                method.parameterTypes.isEmpty() && method.returnType == "I" &&
                                AccessFlags.STATIC.isSet(method.accessFlags) -> {
                                noArgReturnIntFingerprint.matchOrNull(method)?.let { match ->
                                    match.method.addInstructions(0, """
                                        const v0, 0x30d40
                                        return v0
                                    """)
                                }
                            }
                        }
                    }
                }

                // ── src0: subscription expiry display (bypasses xma) ────────────
                "Lp001l/src0;" -> {
                    classDef.methods.forEach { method ->
                        when {
                            method.name in setOf("w", "x") &&
                                method.parameterTypes.isEmpty() && method.returnType == "I" &&
                                AccessFlags.STATIC.isSet(method.accessFlags) -> {
                                noArgReturnIntFingerprint.matchOrNull(method)?.let { match ->
                                    match.method.addInstructions(0, """
                                        const v0, 0x16d
                                        return v0
                                    """)
                                }
                            }
                        }
                    }
                }

                // ── gqf0: spotlight remaining check (bypasses xma) ──────────────
                "Lp001l/gqf0;" -> {
                    classDef.methods.forEach { method ->
                        when {
                            method.parameterTypes.isEmpty() && method.returnType == "Z" &&
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

                // CoreProduct: u4 (promotion check) → true, z4 (subscription status) → false (active)
                "Lcom/p1/mobile/putong/core/api/CoreProduct;" -> {
                    classDef.methods.forEach { method ->
                        when {
                            method.name == "u4" && method.parameterTypes.size == 1 &&
                                method.parameterTypes[0] == "Ljava/lang/String;" &&
                                method.returnType == "Z" -> {
                                stringArgFinalReturnBoolFingerprint.matchOrNull(method)?.let { match ->
                                    match.method.addInstructions(0, RETURN_TRUE)
                                }
                            }
                            method.name == "z4" && method.parameterTypes.isEmpty() &&
                                method.returnType == "Z" -> {
                                val noArgReturnBoolFingerprint = Fingerprint(
                                    accessFlags = listOf(AccessFlags.PUBLIC),
                                    returnType = "Z",
                                    parameters = emptyList(),
                                )
                                noArgReturnBoolFingerprint.matchOrNull(method)?.let { match ->
                                    match.method.addInstructions(0, RETURN_FALSE)
                                }
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
                // zva0.S(): → true
                "Lp001l/zva0;" -> {
                    classDef.methods.forEach { method ->
                        when {
                            method.name == "B0" && method.parameterTypes.size == 1 &&
                                method.parameterTypes[0] == "Lcom/p1/mobile/putong/data/User;" &&
                                method.returnType == "I" -> {
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
                            method.name == "S" && method.parameterTypes.isEmpty() &&
                                method.returnType == "Z" -> {
                                noArgFinalReturnBoolFingerprint.matchOrNull(method)?.let { match ->
                                    match.method.addInstructions(0, RETURN_TRUE)
                                }
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

                // qgl0.d(UserPrivilege): force expiredTime to far-future if 0 (fixes "not yet activated")
                "Lp001l/qgl0;" -> {
                    classDef.methods.forEach { method ->
                        if (method.name == "d" && method.parameterTypes.size == 1 &&
                            method.parameterTypes[0] == "Lcom/p1/mobile/putong/core/data/UserPrivilege;" &&
                            method.returnType == "Ljava/lang/String;"
                        ) {
                            userPrivilegeArgStaticReturnStringFingerprint.matchOrNull(method)?.let { match ->
                                match.method.addInstructions(0, """
                                    if-eqz p0, :qgl0_skip
                                    iget-object v0, p0, Lcom/p1/mobile/putong/core/data/UserPrivilege;->content:Lcom/p1/mobile/putong/core/data/UserPrivilegeContent;
                                    if-eqz v0, :qgl0_skip
                                    iget-wide v1, v0, Lcom/p1/mobile/putong/core/data/UserPrivilegeContent;->expiredTime:J
                                    const-wide/16 v3, 0x0
                                    cmp-long v5, v1, v3
                                    if-nez v5, :qgl0_skip
                                    const-wide v1, 0x${FAR_FUTURE_MS.toString(16)}L
                                    iput-wide v1, v0, Lcom/p1/mobile/putong/core/data/UserPrivilegeContent;->expiredTime:J
                                    :qgl0_skip
                                """)
                            }
                        }
                    }
                }

                // n3b0: q() → false (limit NOT exceeded), g() → far-future timestamp
                "Lp001l/n3b0;" -> {
                    classDef.methods.forEach { method ->
                        when {
                            method.name == "q" && method.parameterTypes.isEmpty() &&
                                method.returnType == "Z" -> {
                                noArgStaticReturnBoolFingerprint.matchOrNull(method)?.let { match ->
                                    match.method.addInstructions(0, RETURN_FALSE)
                                }
                            }
                            method.name == "g" && method.parameterTypes.isEmpty() &&
                                method.returnType == "J" -> {
                                noArgStaticReturnLongFingerprint.matchOrNull(method)?.let { match ->
                                    match.method.addInstructions(0, """
                                        const-wide v0, 0x${FAR_FUTURE_MS.toString(16)}L
                                        return-wide v0
                                    """)
                                }
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

                // sb90$a companion: c(User) → false
                "Lp001l/sb90\$a;" -> {
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

                // tm90: g(User) → false (prevents VIP badge override)
                "Lp001l/tm90;" -> {
                    classDef.methods.forEach { method ->
                        if (method.name == "g" && method.parameterTypes.size == 1 &&
                            method.parameterTypes[0] == "Lcom/p1/mobile/putong/data/User;" &&
                            method.returnType == "Z"
                        ) {
                            val tm90GFingerprint = Fingerprint(
                                accessFlags = listOf(AccessFlags.PUBLIC),
                                returnType = "Z",
                                parameters = listOf("Lcom/p1/mobile/putong/data/User;"),
                            )
                            tm90GFingerprint.matchOrNull(method)?.let { match ->
                                match.method.addInstructions(0, RETURN_FALSE)
                            }
                        }
                    }
                }

                // mb90: purchase type checks → true
                "Lp001l/mb90;" -> {
                    classDef.methods.forEach { method ->
                        when {
                            method.name == "b" && method.parameterTypes.size == 1 &&
                                method.parameterTypes[0] == "Lcom/p1/mobile/putong/core/data/PurchaseType;" &&
                                method.returnType == "Z" -> {
                                purchaseTypeArgStaticReturnBoolFingerprint.matchOrNull(method)?.let { match ->
                                    match.method.addInstructions(0, RETURN_TRUE)
                                }
                            }
                            method.name == "c" && method.parameterTypes.size == 2 &&
                                method.parameterTypes[0] == "Lcom/p1/mobile/putong/data/User;" &&
                                method.parameterTypes[1] == "Lcom/p1/mobile/putong/core/data/PurchaseType;" &&
                                method.returnType == "Z" -> {
                                val userAndPurchaseTypeReturnBoolFingerprint = Fingerprint(
                                    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.STATIC),
                                    returnType = "Z",
                                    parameters = listOf(
                                        "Lcom/p1/mobile/putong/data/User;",
                                        "Lcom/p1/mobile/putong/core/data/PurchaseType;",
                                    ),
                                )
                                userAndPurchaseTypeReturnBoolFingerprint.matchOrNull(method)?.let { match ->
                                    match.method.addInstructions(0, RETURN_TRUE)
                                }
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
                                    const v0, 0x30d40
                                    return v0
                                """)
                            }
                        }
                    }
                }

                // ── pib: server refresh + DB observable ─────────────────────────
                "Lp001l/pib;" -> {
                    classDef.methods.forEach { method ->
                        when {
                            // W9: server refresh → return null to prevent override
                            method.name == "W9" && method.parameterTypes.size == 1 &&
                                method.parameterTypes[0] == "Ljava/lang/String;" &&
                                method.returnType == "Lrx/c;" -> {
                                val w9Fingerprint = Fingerprint(
                                    accessFlags = listOf(AccessFlags.PUBLIC),
                                    returnType = "Lrx/c;",
                                    parameters = listOf("Ljava/lang/String;"),
                                )
                                w9Fingerprint.matchOrNull(method)?.let { match ->
                                    match.method.addInstructions(0, """
                                        const/4 v0, 0x0
                                        return-object v0
                                    """)
                                }
                            }
                            // g9: modify User membership before emitting from observable
                            method.name == "g9" && method.parameterTypes.size == 2 &&
                                method.parameterTypes[0] == "Ljava/lang/String;" &&
                                method.parameterTypes[1] == "Lcom/p1/mobile/putong/data/User;" &&
                                method.returnType == "V" -> {
                                val g9Fingerprint = Fingerprint(
                                    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.FINAL),
                                    returnType = "V",
                                    parameters = listOf("Ljava/lang/String;", "Lcom/p1/mobile/putong/data/User;"),
                                )
                                g9Fingerprint.matchOrNull(method)?.let { match ->
                                    match.method.addInstructions(0, """
                                        if-eqz p1, :user_null
                                        iget-object v0, p1, Lcom/p1/mobile/putong/data/User;->membership:Lcom/p1/mobile/putong/data/Membership;
                                        if-eqz v0, :membership_null
                                        const/4 v1, 0x1
                                        iput-boolean v1, v0, Lcom/p1/mobile/putong/data/Membership;->active:Z
                                        :membership_null
                                        :user_null
                                    """)
                                }
                            }
                        }
                    }
                }

                // ── CoreBusinessServiceIml: bypass purchase dialogs ─────────────────────────
                "Lcom/p1/mobile/putong/core/module/CoreBusinessServiceIml;" -> {
                    classDef.methods.forEach { method ->
                        when {
                            // Lf(): show purchase dialog → return immediately (bypass dialog)
                            method.name == "Lf" && method.parameterTypes.size == 5 &&
                                method.returnType == "V" -> {
                                val lfFingerprint = Fingerprint(
                                    accessFlags = listOf(AccessFlags.PUBLIC),
                                    returnType = "V",
                                    parameters = listOf(
                                        "Lcom/p1/mobile/android/app/Act;",
                                        "Ljava/lang/String;",
                                        "Lcom/p1/mobile/putong/core/data/Privilege;",
                                        "Lp001l/e30;",
                                        "Lp001l/e30;"
                                    ),
                                )
                                lfFingerprint.matchOrNull(method)?.let { match ->
                                    match.method.addInstructions(0, "return-void")
                                }
                            }
                            // r6(): show purchase dialog → return immediately (bypass dialog)
                            method.name == "r6" && method.parameterTypes.size == 5 &&
                                method.returnType == "V" -> {
                                val r6Fingerprint = Fingerprint(
                                    accessFlags = listOf(AccessFlags.PUBLIC),
                                    returnType = "V",
                                    parameters = listOf(
                                        "Lcom/p1/mobile/android/app/Act;",
                                        "Ljava/lang/String;",
                                        "Lcom/p1/mobile/putong/core/data/Privilege;",
                                        "Lp001l/e30;",
                                        "Lp001l/d30;"
                                    ),
                                )
                                r6Fingerprint.matchOrNull(method)?.let { match ->
                                    match.method.addInstructions(0, "return-void")
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
