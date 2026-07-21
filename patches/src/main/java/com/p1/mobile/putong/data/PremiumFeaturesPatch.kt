package com.p1.mobile.putong.data

import app.morphe.patcher.Fingerprint
import app.morphe.patcher.extensions.InstructionExtensions.addInstructions
import app.morphe.patcher.patch.bytecodePatch
import com.android.tools.smali.dexlib2.AccessFlags

/**
 * Consolidated premium features unlock patch.
 *
 * Targets the privilege gate methods that determine whether premium features are available.
 * By patching these gates to return the correct values, all premium features become functional
 * without needing to block individual purchase dialogs.
 *
 * The app uses a two-layer privilege system:
 * 1. Core gate methods: S3() checks if privilege is expired, b4() checks if available
 * 2. Wrapper methods: Many methods delegate to S3()/b4() or check w4() directly
 *
 * Methods patched:
 *
 * - p001l/xma::S3(SummarizedPrivilegesId)  → "is privilege expired?" → false (always valid)
 * - p001l/xma::b4(SummarizedPrivilegesId)  → "is privilege available?" → true
 * - p001l/xma::L3()                        → Production-mode feature gate → true
 * - p001l/xma::u4(), x4()                  → Server refresh methods → return null to
 *                                            prevent server from overriding local state.
 * - p001l/xma::S3-delegating methods (W3, X3, d4, e4, h4, i4, j4, l4, m4)
 *                                          → These call S3() and return true when EXPIRED.
 *                                            Patched to return false (not expired).
 *                                            Critical: h4() controls "See who likes me" feature.
 * - p001l/xma::ALL other no-arg static boolean methods
 *                                          → Wrapper methods that check w4() directly or
 *                                            delegate to !S3()/b4(). Patched to return true.
 * - p001l/zva0::B0(User)                   → Tier rank lookup → 3 (Ultra Premium)
 * - p001l/th5::d(), f(), h()               → Remote config gates for swipe actions → false
 * - p001l/n3b0::q()                        → "has likers limit been exceeded?" → true
 *                                            (limit NOT exceeded, so show clear images)
 *                                            Controls blur in old VIP likers screen.
 * - p001l/sb90::c(User)                    → "can show clear profile image?" → true
 *                                            Overrides privacy checks to always show clear images.
 * - com/p1/mobile/putong/data/CounterSuperlikeAndUndoLimit::remainToday(), remainAll()
 *                                          → Super like remaining count → Integer.MAX_VALUE
 *                                            Indicates unlimited super likes available.
 * - com/p1/mobile/putong/core/api/CoreProduct::u4(String)
 *                                          → "is product promotion active?" → true
 * - p001l/ugc0::k(PurchaseType)            → "is subscription upgraded?" → true
 *
 * Note: Purchase dialog blocking was removed because it's redundant. When privilege gates
 * return correct values, the code paths that show purchase dialogs are never reached.
 *
 * Note: Some code directly accesses Counter.likersLimit.remaining and similar public fields.
 * These field accesses cannot be patched directly, but the methods that check them
 * (like n3b0.q()) are patched to return the correct values.
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

private val userArgFinalReturnIntFingerprint = Fingerprint(
    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.FINAL),
    returnType = "I",
    parameters = listOf("Lcom/p1/mobile/putong/data/User;"),
)

private val noArgReturnIntFingerprint = Fingerprint(
    accessFlags = listOf(AccessFlags.PUBLIC),
    returnType = "I",
    parameters = emptyList(),
)

// Server refresh methods: u4() returns c<List<UserPrivilege>>, x4() returns c<roj0>
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

private const val RETURN_THREE = """
    const/4 v0, 0x3
    return v0
"""

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
                // xma privilege & gate methods (S3, b4, L3, u4, x4, and all wrapper methods)
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
                            // u4, x4: server refresh methods → return null to prevent override
                            method.name == "u4" && method.parameterTypes.isEmpty() &&
                                method.returnType == "Lp001l/c;" -> {
                                serverRefreshU4Fingerprint.matchOrNull(method)?.let { match ->
                                    match.method.addInstructions(0, """
                                        const/4 v0, 0x0
                                        return-object v0
                                    """)
                                }
                            }
                            method.name == "x4" && method.parameterTypes.isEmpty() &&
                                method.returnType == "Lp001l/c;" -> {
                                serverRefreshX4Fingerprint.matchOrNull(method)?.let { match ->
                                    match.method.addInstructions(0, """
                                        const/4 v0, 0x0
                                        return-object v0
                                    """)
                                }
                            }
                            // S3-delegating methods: these call S3() which returns true when EXPIRED
                            // Most must return false (not expired) to indicate privilege is active
                            // Exception: e4() (svip) and j4() (ultraPremium) must return true (expired)
                            // because the filter UI has inverted logic that blocks selection when these return false
                            method.name in setOf("W3", "X3", "d4", "h4", "i4", "l4", "m4") &&
                                method.parameterTypes.isEmpty() && method.returnType == "Z" &&
                                AccessFlags.STATIC.isSet(method.accessFlags) -> {
                                noArgStaticReturnBoolFingerprint.matchOrNull(method)?.let { match ->
                                    match.method.addInstructions(0, RETURN_FALSE)
                                }
                            }
                            // e4() and j4() need special handling - return true for filter to work
                            method.name in setOf("e4", "j4") &&
                                method.parameterTypes.isEmpty() && method.returnType == "Z" &&
                                AccessFlags.STATIC.isSet(method.accessFlags) -> {
                                noArgStaticReturnBoolFingerprint.matchOrNull(method)?.let { match ->
                                    match.method.addInstructions(0, RETURN_TRUE)
                                }
                            }
                            // Non-ultraPremium tier methods: return false (not active)
                            // This ensures subscription management only shows ultraPremium as active
                            // f4() = svip, H3()/Z3() = platinum, B3()/U3() = femaleVip
                            method.name in setOf("f4", "H3", "Z3", "B3", "U3") &&
                                method.parameterTypes.isEmpty() && method.returnType == "Z" &&
                                AccessFlags.STATIC.isSet(method.accessFlags) -> {
                                noArgStaticReturnBoolFingerprint.matchOrNull(method)?.let { match ->
                                    match.method.addInstructions(0, RETURN_FALSE)
                                }
                            }
                            // WARNING: This catch-all matches ALL no-arg static boolean methods except L3.
                            // Risk: Future Tantan versions may add safety-critical methods that should return false.
                            // TODO: Replace with explicit allowlist after verifying against current APK.
                            // All other no-arg static boolean methods → return true (has privilege)
                            // This covers ultraPremium methods (C3, k4) and feature gates
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

                // zva0.B0: tier rank lookup (3=Ultra Premium, 2=SVIP, 1=VIP).
                // Force to 3 so the profile UI surfaces Ultra Premium (the highest
                // tier the patches unlock) regardless of the user's actual paid tier.
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

                // th5 remote config gates: d(), f(), h() control whether swipe actions
                // show purchase dialogs. Patch to return false to prevent them.
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

                // n3b0.q(): "has likers limit been exceeded?" → true (limit NOT exceeded)
                // This controls blur in the old VIP likers screen (LikersFrag).
                // Called by CoreBusinessServiceIml.e2() → c.Q1() → LikersItemView.m()
                // Note: The method returns true when remaining > 0 (limit NOT exceeded)
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

                // sb90.c(): "should apply blur?" → false (no blur, always show clear)
                // This controls blur in LikersBigCardItemView and other places.
                // Callers: if (sb90.c(user)) { applyBlur } else { showClear }
                // Return false so clear images are always shown.
                "Lp001l/sb90;" -> {
                    classDef.methods.forEach { method ->
                        if (method.name == "c" && method.parameterTypes.size == 1 &&
                            method.parameterTypes[0] == "Lcom/p1/mobile/putong/data/User;" &&
                            method.returnType == "Z"
                        ) {
                            val userArgReturnBoolFingerprint = Fingerprint(
                                accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.FINAL),
                                returnType = "Z",
                                parameters = listOf("Lcom/p1/mobile/putong/data/User;"),
                            )
                            userArgReturnBoolFingerprint.matchOrNull(method)?.let { match ->
                                match.method.addInstructions(0, """
                                    const/4 v0, 0x0
                                    return v0
                                """)
                            }
                        }
                    }
                }

                // CounterSuperlikeAndUndoLimit: patch remain methods to return unlimited
                // remainToday() and remainAll() return remaining counts for super likes
                // Patch to return Integer.MAX_VALUE to indicate unlimited super likes
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

                // User: patch subscription tier display methods and nullCheck
                // isVIP(), isSVIP(), isPlatinum() → false for current user only (isMe()-guarded)
                // isUltraPremium() is owned by UserPatches.kt with its own isMe() guard
                // nullCheck() → initialize status, set membership.name to "boostVip"
                TANTAN_USER_CLASS -> {
                    classDef.methods.forEach { method ->
                        when {
                            // isVIP(), isSVIP(), isPlatinum() → return false for current user only
                            // Other users' tier status falls through to original implementation
                            method.name in setOf("isVIP", "isSVIP", "isPlatinum") &&
                                method.parameterTypes.isEmpty() && method.returnType == "Z" -> {
                                val userInstanceReturnBoolFingerprint = Fingerprint(
                                    accessFlags = listOf(AccessFlags.PUBLIC),
                                    returnType = "Z",
                                    parameters = emptyList(),
                                )
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
                            // nullCheck() → initialize status and set membership.name to "boostVip"
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
            }
        }
    }
}
