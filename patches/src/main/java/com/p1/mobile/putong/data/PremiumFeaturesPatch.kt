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
 * - p001l/zva0::B0(User)                   → "what is the highest active tier rank?"
 *                                          → 3 (Ultra Premium) for any user. Ensures
 *                                            the profile UI surfaces the highest tier the
 *                                            patches unlock, rather than the user's
 *                                            actual paid tier.
 * - com/p1/mobile/putong/core/ui/purchase/c::C0(...)
 *                                          → THE central purchase dialog funnel. All
 *                                            purchase popups flow through this method.
 *                                            Patched to return-void immediately, blocking
 *                                            every purchase dialog regardless of source.
 * - com/p1/mobile/putong/core/api/CoreServiceImpl::startJailedDialogLikeAct()
 *                                          → Separate "jailed" popup path that bypasses
 *                                            c.C0(). Patched to no-op.
 * - p001l/th5::d(), f(), h()               → Remote config gates controlling whether
 *                                            swipe actions show purchase dialogs.
 *                                            Patched to return false.
 * - com/p1/mobile/putong/core/ui/purchase/b::L0()
 *                                          → Alternative purchase dialog (TYPE_GET_LIKERS,
 *                                            TYPE_O_DIAMOND, TYPE_PICKS_MEMBERSHIP).
 *                                            Patched to return-void.
 * - com/p1/mobile/putong/core/ui/purchase/mediator/c::n()
 *                                          → Alternative purchase dialog (TYPE_GET_ACCELERATE_PAIRING,
 *                                            TYPE_YOUTH_VIP, TYPE_FEMALE_VIP).
 *                                            Patched to return-void.
 * - com/p1/mobile/putong/core/ui/purchase/mediator/d::e()
 *                                          → Alternative purchase dialog (TYPE_LIMITED_TRIAL_SEE).
 *                                            Patched to return-void.
 * - p001l/fd5::e0()                        → SuperLike coin purchase dialog.
 *                                            Patched to return-void.
 * - p001l/w6p$a::k()                       → Ultra Premium/VIP purchase dialog.
 *                                            Patched to return-void.
 * - p001l/zvo$a::j()                       → Fallback Ultra Premium/VIP purchase dialog.
 *                                            Patched to return-void.
 * - p001l/r5b0$a::j()                      → Another purchase dialog variant.
 *                                            Patched to return-void.
 * - p001l/kkp0::c(Act, String)             → Opens web payment URL.
 *                                            Patched to return-void.
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

private val userArgFinalReturnIntFingerprint = Fingerprint(
    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.FINAL),
    returnType = "I",
    parameters = listOf("Lcom/p1/mobile/putong/data/User;"),
)

// Purchase dialog funnel: c.C0() - all purchase dialogs converge here
private val purchaseDialogFunnelFingerprint = Fingerprint(
    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.STATIC, AccessFlags.FINAL),
    returnType = "V",
    parameters = listOf(
        "Lcom/p1/mobile/android/app/Act;",
        "Ljava/lang/String;",
        "Lcom/p1/mobile/putong/core/data/Privilege;",
        "Lcom/p1/mobile/putong/core/data/PurchaseType;",
        "Lp001l/e30;",
        "I",
        "Lp001l/d30;",
        "Lp001l/d30;",
        "Ljava/lang/String;",
        "Ljava/lang/Object;",
        "Z",
        "Z"
    ),
)

// Jailed dialog: CoreServiceImpl.startJailedDialogLikeAct()
private val noArgPublicReturnVoidFingerprint = Fingerprint(
    accessFlags = listOf(AccessFlags.PUBLIC),
    returnType = "V",
    parameters = emptyList(),
)

private const val RETURN_THREE = """
    const/4 v0, 0x3
    return v0
"""

private const val RETURN_VOID = """
    return-void
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
                                match.method.addInstructions(0, RETURN_THREE)
                            }
                        }
                    }
                }

                // c.C0: THE central purchase dialog funnel. Every purchase popup in the
                // app flows through this method. Patching it to return-void immediately
                // blocks ALL purchase dialogs regardless of which feature tried to trigger it.
                "Lcom/p1/mobile/putong/core/ui/purchase/c;" -> {
                    classDef.methods.forEach { method ->
                        if (method.name == "C0" && method.returnType == "V" &&
                            method.parameterTypes.size == 12
                        ) {
                            purchaseDialogFunnelFingerprint.matchOrNull(method)?.let { match ->
                                match.method.addInstructions(0, RETURN_VOID)
                            }
                        }
                    }
                }

                // CoreServiceImpl.startJailedDialogLikeAct: separate "jailed" popup path
                // that doesn't go through c.C0(). Patch to no-op.
                "Lcom/p1/mobile/putong/core/api/CoreServiceImpl;" -> {
                    classDef.methods.forEach { method ->
                        if (method.name == "startJailedDialogLikeAct" &&
                            method.parameterTypes.isEmpty() && method.returnType == "V"
                        ) {
                            noArgPublicReturnVoidFingerprint.matchOrNull(method)?.let { match ->
                                match.method.addInstructions(0, RETURN_VOID)
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

                // Alternative purchase dialog paths that bypass c.C0():
                
                // b dialog: used by TYPE_GET_LIKERS, TYPE_O_DIAMOND, TYPE_PICKS_MEMBERSHIP
                // b.L0() is the show method
                "Lcom/p1/mobile/putong/core/ui/purchase/b;" -> {
                    classDef.methods.forEach { method ->
                        if (method.name == "L0" && method.parameterTypes.isEmpty() &&
                            method.returnType == "V"
                        ) {
                            noArgPublicReturnVoidFingerprint.matchOrNull(method)?.let { match ->
                                match.method.addInstructions(0, RETURN_VOID)
                            }
                        }
                    }
                }

                // mediator.c dialog: used by TYPE_GET_ACCELERATE_PAIRING, TYPE_YOUTH_VIP, etc.
                // mediator.c.n() is the show method
                "Lcom/p1/mobile/putong/core/ui/purchase/mediator/c;" -> {
                    classDef.methods.forEach { method ->
                        if (method.name == "n" && method.parameterTypes.isEmpty() &&
                            method.returnType == "V"
                        ) {
                            noArgPublicReturnVoidFingerprint.matchOrNull(method)?.let { match ->
                                match.method.addInstructions(0, RETURN_VOID)
                            }
                        }
                    }
                }

                // mediator.d dialog: used by TYPE_LIMITED_TRIAL_SEE
                // mediator.d.e() is the show method
                "Lcom/p1/mobile/putong/core/ui/purchase/mediator/d;" -> {
                    classDef.methods.forEach { method ->
                        if (method.name == "e" && method.parameterTypes.isEmpty() &&
                            method.returnType == "V"
                        ) {
                            noArgPublicReturnVoidFingerprint.matchOrNull(method)?.let { match ->
                                match.method.addInstructions(0, RETURN_VOID)
                            }
                        }
                    }
                }

                // fd5 dialog: used by SuperLike coin purchases
                // fd5.e0() is the show method
                "Lp001l/fd5;" -> {
                    classDef.methods.forEach { method ->
                        if (method.name == "e0" && method.parameterTypes.isEmpty() &&
                            method.returnType == "V"
                        ) {
                            noArgPublicReturnVoidFingerprint.matchOrNull(method)?.let { match ->
                                match.method.addInstructions(0, RETURN_VOID)
                            }
                        }
                    }
                }

                // w6p dialog: used by TYPE_ULTRA_PREMIUM, TYPE_GET_VIP
                // w6p$a.k() is the show method (inner class builder)
                "Lp001l/w6p\$a;" -> {
                    classDef.methods.forEach { method ->
                        if (method.name == "k" && method.parameterTypes.isEmpty() &&
                            method.returnType == "V"
                        ) {
                            noArgPublicReturnVoidFingerprint.matchOrNull(method)?.let { match ->
                                match.method.addInstructions(0, RETURN_VOID)
                            }
                        }
                    }
                }

                // zvo dialog: fallback for TYPE_ULTRA_PREMIUM, TYPE_GET_VIP
                // zvo$a.j() is the show method (inner class builder)
                "Lp001l/zvo\$a;" -> {
                    classDef.methods.forEach { method ->
                        if (method.name == "j" && method.parameterTypes.isEmpty() &&
                            method.returnType == "V"
                        ) {
                            noArgPublicReturnVoidFingerprint.matchOrNull(method)?.let { match ->
                                match.method.addInstructions(0, RETURN_VOID)
                            }
                        }
                    }
                }

                // r5b0 dialog: another purchase dialog variant
                // r5b0$a.j() is the show method (inner class builder)
                "Lp001l/r5b0\$a;" -> {
                    classDef.methods.forEach { method ->
                        if (method.name == "j" && method.parameterTypes.isEmpty() &&
                            method.returnType == "V"
                        ) {
                            noArgPublicReturnVoidFingerprint.matchOrNull(method)?.let { match ->
                                match.method.addInstructions(0, RETURN_VOID)
                            }
                        }
                    }
                }

                // kkp0.c: opens web payment URL (not a dialog, but a purchase path)
                // Patch to return-void to prevent web payment navigation
                "Lp001l/kkp0;" -> {
                    classDef.methods.forEach { method ->
                        if (method.name == "c" && method.parameterTypes.size == 2 &&
                            method.parameterTypes[0] == "Lcom/p1/mobile/android/app/Act;" &&
                            method.parameterTypes[1] == "Ljava/lang/String;" &&
                            method.returnType == "V"
                        ) {
                            val fingerprint = Fingerprint(
                                accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.STATIC),
                                returnType = "V",
                                parameters = listOf(
                                    "Lcom/p1/mobile/android/app/Act;",
                                    "Ljava/lang/String;"
                                ),
                            )
                            fingerprint.matchOrNull(method)?.let { match ->
                                match.method.addInstructions(0, RETURN_VOID)
                            }
                        }
                    }
                }
            }
        }
    }
}
