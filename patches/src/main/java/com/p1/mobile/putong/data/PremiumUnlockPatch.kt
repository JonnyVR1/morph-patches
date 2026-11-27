package com.p1.mobile.putong.data

import app.morphe.patcher.Fingerprint
import app.morphe.patcher.extensions.InstructionExtensions.addInstructions
import app.morphe.patcher.extensions.InstructionExtensions.replaceInstruction
import app.morphe.patcher.fieldAccess
import app.morphe.patcher.methodCall
import app.morphe.patcher.patch.bytecodePatch
import app.morphe.patcher.string
import com.android.tools.smali.dexlib2.AccessFlags
import com.android.tools.smali.dexlib2.Opcode
import com.android.tools.smali.dexlib2.builder.instruction.BuilderInstruction20t
import com.android.tools.smali.dexlib2.builder.instruction.BuilderInstruction22t
import com.android.tools.smali.dexlib2.iface.instruction.Instruction
import com.android.tools.smali.dexlib2.iface.instruction.NarrowLiteralInstruction
import com.android.tools.smali.dexlib2.iface.instruction.ReferenceInstruction
import com.android.tools.smali.dexlib2.iface.instruction.TwoRegisterInstruction
import com.android.tools.smali.dexlib2.iface.reference.FieldReference
import com.android.tools.smali.dexlib2.iface.reference.MethodReference
import com.android.tools.smali.dexlib2.iface.reference.StringReference
import com.android.tools.smali.dexlib2.iface.reference.TypeReference
import com.android.tools.smali.dexlib2.iface.Method

/**
 * Unified premium unlock patch.
 *
 * Anchors every obfuscated class/method by stable behavioral fingerprints
 * (string literals, calls into stable APIs, signature shape) rather than by
 * obfuscated names like `Lp001l/xma;` or `S3`/`u4`/`x4`/... Those names
 * change between Tantan releases but the underlying product semantics do not,
 * so the patches here survive obfuscation churn.
 *
 * Stable, un-obfuscated classes (User, CounterSuperlikeAndUndoLimit,
 * CoreProduct, CoreBusinessServiceIml) keep their classDefForEach dispatch.
 */

private const val RETURN_TRUE = """
    const/4 v0, 0x1
    return v0
"""

private const val RETURN_FALSE = """
    const/4 v0, 0x0
    return v0
"""

// ── Diagnostic logging DISABLED — smali invoke-static caused startup crashes ──
// All LOG_* variants reverted to plain return values (no MorphDebug calls).

private val LOG_AND_RETURN_NULL = """
    const/4 v0, 0x0
    return-object v0
"""

// LOG_XMA_SERVER_REFRESH_NULL removed - xma server refresh patch no longer used
private val LOG_XMA_X3_FALSE = RETURN_FALSE
private val LOG_SWIPE_M_B_FALSE = RETURN_FALSE
private val LOG_TH5_FALSE = RETURN_FALSE
private val LOG_COREPRODUCT_Q4_FALSE = RETURN_FALSE
private val LOG_COREPRODUCT_GATE_FALSE = RETURN_FALSE
private val LOG_SB90_FALSE = RETURN_FALSE
// pib.W9() and xma server refresh patches REMOVED - let server calls run normally.
//
// Evolution:
// - null: caused NPE on subscribe → infinite loading
// - Observable.just(roj0.a): emitted Unit but skipped M8 side effects → swipe hung
// - Observable.empty(): completed without emitting → swipe worked but picks blank
// - NO PATCH: let server call run → M8 side effects execute normally
//
// xma server refresh methods (u4/x4) return RxJava Observable (Lrx/c;).
// Patching to null causes NoClassDefFoundError for rx.Observable when calling
// code tries to use the returned value. Let these methods run normally.
//
// RATIONALE: The existing patches to User.isVIP(), isUltraPremium(), isMembership(), etc.
// already check isMe() first and return true for the current user, regardless of what the
// server sends. By letting the server call run:
// 1. Swipe interface works (M8 side effects q9 + Q.y3 execute, updating UI state)
// 2. Picks section shows real data (picksUsers fetched from server)
// 3. Premium status preserved (patched getters return true for current user)
//
// The server response updates User.membership fields, but our patched getter methods
// override the return values for the current user, so premium status is preserved.
private val LOG_XMA_F3_TRUE = RETURN_TRUE
private val LOG_XMA_Y3_TRUE = RETURN_TRUE

private const val RETURN_NULL_OBJECT = """
    const/4 v0, 0x0
    return-object v0
"""

private const val RETURN_VOID = "return-void"

private const val RETURN_LONG_MAX = """
    const-wide v0, 0x7fffffffffffffffL
    return-wide v0
"""

private const val RETURN_LONG_365 = """
    const-wide/16 v0, 0x16d
    return-wide v0
"""

private const val RETURN_INT_200000 = """
    const v0, 0x30d40
    return v0
"""

private const val RETURN_INT_365 = """
    const v0, 0x16d
    return v0
"""

private const val RETURN_INT_100 = """
    const v0, 0x64
    return v0
"""

private const val RETURN_INT_1 = """
    const v0, 0x1
    return v0
"""

private const val RETURN_INTEGER_200000 = """
    const v0, 0x30d40
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    move-result-object v0
    return-object v0
"""

private const val RETURN_INTEGER_100 = """
    const v0, 0x64
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    move-result-object v0
    return-object v0
"""

private const val RETURN_INTEGER_18 = """
    const v0, 0x12
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    move-result-object v0
    return-object v0
"""

private const val RETURN_INTEGER_1 = """
    const v0, 0x1
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    move-result-object v0
    return-object v0
"""

// 365 days in milliseconds
private val FAR_FUTURE_MS_BODY: String = """
    const-wide v0, 0x66700F60000L
    return-wide v0
"""

private val QGL0_D_BODY: String = """
    if-eqz p0, :qgl0_skip
    iget-object v0, p0, Lcom/p1/mobile/putong/core/data/UserPrivilege;->content:Lcom/p1/mobile/putong/core/data/UserPrivilegeContent;
    if-eqz v0, :qgl0_skip
    iget-wide v1, v0, Lcom/p1/mobile/putong/core/data/UserPrivilegeContent;->expiredTime:J
    const-wide/16 v3, 0x0
    cmp-long v5, v1, v3
    if-nez v5, :qgl0_skip
    const-wide v1, 0x66700F60000L
    iput-wide v1, v0, Lcom/p1/mobile/putong/core/data/UserPrivilegeContent;->expiredTime:J
    :qgl0_skip
"""

// PIB_G9_BODY REMOVED for 7.3.3 - pib.g9 no longer references Membership.active field

// pib.S9() and M8() patches removed - can't mock Observable due to classpath issues

private val U59_V_BODY: String = """
    invoke-virtual {p0}, Lcom/p1/mobile/putong/data/User;->isMe()Z
    move-result v0
    if-eqz v0, :not_me
    const/4 v0, 0x1
    return v0
    :not_me
    const/4 v0, 0x0
    return v0
"""

private val ZVA0_B0_BODY: String = """
    invoke-virtual {p0}, Lcom/p1/mobile/putong/data/User;->isMe()Z
    move-result v0
    if-eqz v0, :not_me
    const/4 v0, 0x2
    return v0
    :not_me
"""

private val GET_VIP_EXPIRE_FAR_FUTURE_BODY: String = """
    invoke-virtual {p0}, Lcom/p1/mobile/putong/data/User;->isMe()Z
    move-result v0
    if-eqz v0, :not_me
    const-wide v0, 0x7fffffffffffffffL
    return-wide v0
    :not_me
"""

private val USER_NULL_CHECK_BODY: String = """
    iget-object v0, p0, Lcom/p1/mobile/putong/data/User;->status:Ljava/util/List;
    if-nez v0, :status_not_null
    new-instance v0, Ljava/util/ArrayList;
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
    iput-object v0, p0, Lcom/p1/mobile/putong/data/User;->status:Ljava/util/List;
    :status_not_null
"""

// ── Class-level fingerprints (resolve obfuscated classes by stable strings /
//    field-access / method-call anchors) ──

// LikeFrom redirect REMOVED — was causing normal match swipes to route through instant match
// server path, resulting in infinite loading and server errors. Normal cards now use the
// standard /relationships/ endpoint without business_type="instantChat".
// Commercial cards (payCardStyle="match") may still have issues but normal swipe interface works.

// Ll/xma; uniquely references "/summarized-privileges?with=diamond" in both
// its u4() and x4() refresh methods. The shorter "/summarized-privileges"
// literal also appears in Lcom/p1/mobile/putong/core/api/a;->o2 (the URL
// builder), so using the bare string makes the class fingerprint ambiguous
// and it sometimes resolves to the URL-builder class instead of xma.
// Anchoring on the "?with=diamond" variant forces a unique match to xma.
private val xmaClassFingerprint = Fingerprint(
    filters = listOf(string("/summarized-privileges?with=diamond")),
)

private val n3b0ClassFingerprint = Fingerprint(
    filters = listOf(
        // n3b0.q() and g() both touch Counter.likersLimit
        fieldAccess(
            definingClass = "Lcom/p1/mobile/putong/data/Counter;",
            name = "likersLimit",
        ),
    ),
)

private val secretCrushClassFingerprint = Fingerprint(
    filters = listOf(
        fieldAccess(
            definingClass = "Lcom/p1/mobile/putong/data/Counter;",
            name = "secretCrushLimit",
        ),
        fieldAccess(
            definingClass = "Lcom/p1/mobile/putong/data/CounterSecretCrushLimit;",
            name = "remaining",
        ),
    ),
)

private val coreDataClassFingerprint = Fingerprint(
    filters = listOf(
        fieldAccess(
            definingClass = "Lcom/p1/mobile/putong/core/data/CoreData;",
            name = "surpriseGiftExpirationTime",
        ),
    ),
)

private val sb90CompanionClassFingerprint = Fingerprint(
    returnType = "Z",
    parameters = listOf("Lcom/p1/mobile/putong/data/User;"),
    filters = listOf(
        fieldAccess(
            definingClass = "Lcom/p1/mobile/putong/data/User;",
            name = "localRelationship",
            type = "Lcom/p1/mobile/putong/data/Relationship;",
        ),
        string("matched"),
        methodCall(
            definingClass = "Lcom/p1/mobile/putong/data/User;",
            name = "isSupremePartnerOpenMystery",
            parameters = emptyList(),
            returnType = "Z",
        ),
        methodCall(
            definingClass = "Lcom/p1/mobile/putong/data/User;",
            name = "isHideIconFromSVipWithMe",
            parameters = emptyList(),
            returnType = "Z",
        ),
    ),
)

private val u59ClassFingerprint = Fingerprint(
    filters = listOf(
        string("intl_sl_guide_config"),
    ),
)

private val tm90ClassFingerprint = Fingerprint(
    filters = listOf(
        string("intl_good_c_bage_config"),
    ),
)

private val gqf0ClassFingerprint = Fingerprint(
    filters = listOf(
        string("e_intl_spotlight_activity_card"),
    ),
)

private val h6aClassFingerprint = Fingerprint(
    filters = listOf(
        string("ttt_membership_price_diff"),
    ),
)

private val ugc0ClassFingerprint = Fingerprint(
    filters = listOf(
        string("seeUpgradeToPremium"),
    ),
)

private val zva0ClassFingerprint = Fingerprint(
    filters = listOf(
        string("e_vip_banner"),
    ),
)

private val th5ClassFingerprint = Fingerprint(
    filters = listOf(
        string("vas_commercial_card_right_slide_strategy"),
    ),
)

private val qgl0ClassFingerprint = Fingerprint(
    filters = listOf(
        string("暂未激活黑金会员"),
    ),
)

// src0ClassFingerprint removed - class matching issues in 7.3.3

// ── xma method fingerprints (grouped by behavior) ──

// Expiry-checker (static SummarizedPrivilegesId → Z, calls guessedCurrentServerTime): patch → false
private val xmaS3Fingerprint = Fingerprint(
    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.STATIC),
    returnType = "Z",
    parameters = listOf("Lcom/p1/mobile/putong/core/data/SummarizedPrivilegesId;"),
    filters = listOf(methodCall(name = "guessedCurrentServerTime")),
)

// Expiry-reader (static SummarizedPrivilegesId → J): patch → MAX. Matches v3 and w3.
private val xmaV3W3Fingerprint = Fingerprint(
    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.STATIC),
    returnType = "J",
    parameters = listOf("Lcom/p1/mobile/putong/core/data/SummarizedPrivilegesId;"),
)

// Long timestamp wrappers (static no-arg → J). q3 → femaleVip, s3 → limitedTrialSee.
private val xmaQ3Fingerprint = Fingerprint(
    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.STATIC),
    returnType = "J",
    parameters = emptyList(),
    filters = listOf(string("femaleVip")),
)

private val xmaS3LongWrapperFingerprint = Fingerprint(
    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.STATIC),
    returnType = "J",
    parameters = emptyList(),
    filters = listOf(string("limitedTrialSee")),
)

// Instance expiry check (static UserPrivilege → Z, calls guessedCurrentServerTime): patch → false
private val xmaT3Fingerprint = Fingerprint(
    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.STATIC),
    returnType = "Z",
    parameters = listOf("Lcom/p1/mobile/putong/core/data/UserPrivilege;"),
    filters = listOf(methodCall(name = "guessedCurrentServerTime")),
)

// Purchase expiry (static PurchaseType → Z, loads "unknown_"/"svip"): patch → false
private val xmaA4Fingerprint = Fingerprint(
    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.STATIC),
    returnType = "Z",
    parameters = listOf("Lcom/p1/mobile/putong/core/data/PurchaseType;"),
    filters = listOf(string("unknown_")),
)

// Credit-count methods (static no-arg → I): patch → 200000
private val xmaCreditCountFingerprint = Fingerprint(
    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.STATIC),
    returnType = "I",
    parameters = emptyList(),
)

// ── Other class fingerprints ──

// sja: picks remaining count (static no-arg → I). Matches both r3 and B3.
private val sjaPicksRemainingFingerprint = Fingerprint(
    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.STATIC),
    returnType = "I",
    parameters = emptyList(),
)

// src0WDaysRemainingFingerprint removed

// src0XDaysRemainingFingerprint removed

// gqf0: spotlight pass-through. The single no-arg Z method (f()) → true. PUBLIC only —
// f() is instance in 7.5.4 (was static in older builds); PUBLIC matches both.
private val gqf0FFingerprint = Fingerprint(
    accessFlags = listOf(AccessFlags.PUBLIC),
    returnType = "Z",
    parameters = emptyList(),
)

// h6a: pricing restriction (static no-arg → Z): patch → true.
private val h6aCFingerprint = Fingerprint(
    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.STATIC),
    returnType = "Z",
    parameters = emptyList(),
)



// ugc0.k(PurchaseType) → true (subscription upgraded).
private val ugc0KFingerprint = Fingerprint(
    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.STATIC),
    returnType = "Z",
    parameters = listOf("Lcom/p1/mobile/putong/core/data/PurchaseType;"),
)

// zva0.B0(User) → tier rank (3 = Ultra Premium) when current user, 0 otherwise.
private val zva0B0Fingerprint = Fingerprint(
    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.FINAL),
    returnType = "I",
    parameters = listOf("Lcom/p1/mobile/putong/data/User;"),
    filters = listOf(methodCall(name = "isUltraPremium")),
)

// zva0.S() → true (show banner)
private val zva0SFingerprint = Fingerprint(
    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.FINAL),
    returnType = "Z",
    parameters = emptyList(),
)

// th5: any static no-arg Z that references "showPurchaseDialog" → false (d/f/h).
private val th5PurchaseDialogFingerprint = Fingerprint(
    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.STATIC),
    returnType = "Z",
    parameters = emptyList(),
    filters = listOf(string("showPurchaseDialog")),
)

// qgl0.d(UserPrivilege) → String: fix expiredTime when 0.
private val qgl0DFingerprint = Fingerprint(
    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.STATIC),
    returnType = "Ljava/lang/String;",
    parameters = listOf("Lcom/p1/mobile/putong/core/data/UserPrivilege;"),
)



// secretCrush: remaining check (static no-arg → Z, reads CounterSecretCrushLimit.remaining) → false
private val secretCrushRemainingFingerprint = Fingerprint(
    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.STATIC),
    returnType = "Z",
    parameters = emptyList(),
    filters = listOf(
        fieldAccess(
            definingClass = "Lcom/p1/mobile/putong/data/CounterSecretCrushLimit;",
            name = "remaining",
        ),
    ),
)

// rbb0: Likers limit gate checks - matched directly without class fingerprint
// to avoid ambiguity with other classes that access LikersLimit.remaining

// CoreSuggested: Likers data source
// CoreSuggested.n8() initiates the likers poll with home_new_liker_float/home_total_liker_float triggers
// This is the ROOT SOURCE of data that feeds all popup chains
// Anchored on "home_new_liker_float" + "home_total_liker_float" strings

// secretCrush: expiration time (static no-arg → J, reads CounterSecretCrushLimit) → far future
private val secretCrushExpirationFingerprint = Fingerprint(
    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.STATIC),
    returnType = "J",
    parameters = emptyList(),
    filters = listOf(
        fieldAccess(
            definingClass = "Lcom/p1/mobile/putong/data/Counter;",
            name = "secretCrushLimit",
        ),
    ),
)

// coreData: surpriseGiftExpirationTime reader → far future
private val coreDataSurpriseGiftFingerprint = Fingerprint(
    accessFlags = listOf(AccessFlags.PUBLIC),
    returnType = "J",
    parameters = emptyList(),
    filters = listOf(
        fieldAccess(
            definingClass = "Lcom/p1/mobile/putong/core/data/CoreData;",
            name = "surpriseGiftExpirationTime",
        ),
    ),
)

// sb90 (Companion).c(User) → false. Outer sb90 just delegates, so patching
// Companion alone is sufficient.
private val sb90CFingerprint = Fingerprint(
    returnType = "Z",
    parameters = listOf("Lcom/p1/mobile/putong/data/User;"),
    filters = listOf(
        fieldAccess(
            definingClass = "Lcom/p1/mobile/putong/data/User;",
            name = "localRelationship",
            type = "Lcom/p1/mobile/putong/data/Relationship;",
        ),
        string("matched"),
        methodCall(
            definingClass = "Lcom/p1/mobile/putong/data/User;",
            name = "isHideIconFromSVipWithMe",
            parameters = emptyList(),
            returnType = "Z",
        ),
    ),
)

// tm90.g(User) → false (no VIP badge override)
private val tm90GFingerprint = Fingerprint(
    accessFlags = listOf(AccessFlags.PUBLIC),
    returnType = "Z",
    parameters = listOf("Lcom/p1/mobile/putong/data/User;"),
)

// pib.g9(String, User) fingerprint REMOVED for 7.3.3
// The g9 method no longer references Membership.active field, so this fingerprint won't match.
// The User.isVIP()/isUltraPremium() patches already override premium status via isMe() checks,
// so this membership flip is no longer needed.

// ── Helpers ──────────────────────────────────────────────────────────────────

private val instructionCache = java.util.WeakHashMap<com.android.tools.smali.dexlib2.iface.Method, List<Instruction>>()

private fun com.android.tools.smali.dexlib2.iface.Method.cachedInstructions(): List<Instruction> =
    instructionCache.getOrPut(this) {
        implementation?.instructions?.toList() ?: emptyList()
    }

internal fun instructionsOf(method: com.android.tools.smali.dexlib2.iface.Method): Iterable<Instruction> =
    method.cachedInstructions()

private fun com.android.tools.smali.dexlib2.iface.Method.callsGuessedCurrentServerTime(): Boolean {
    return cachedInstructions().any { instr ->
        instr is ReferenceInstruction &&
            instr.reference is MethodReference &&
            (instr.reference as MethodReference).name == "guessedCurrentServerTime"
    }
}

private fun com.android.tools.smali.dexlib2.iface.Method.callsU4WithString(): Boolean {
    return try {
        cachedInstructions().any { instr ->
            instr is ReferenceInstruction &&
                instr.reference is MethodReference &&
                (instr.reference as MethodReference).definingClass == "Lcom/p1/mobile/putong/core/api/CoreProduct;" &&
                (instr.reference as MethodReference).parameterTypes.size == 1 &&
                (instr.reference as MethodReference).parameterTypes[0] == "Ljava/lang/String;" &&
                (instr.reference as MethodReference).returnType == "Z"
        }
    } catch (e: Exception) {
        false
    }
}

private fun com.android.tools.smali.dexlib2.iface.Method.hasNegation(): Boolean {
    return try {
        cachedInstructions().any { instr ->
            val opcode = instr.opcode
            opcode.name == "xor-int/lit8" || opcode.name == "not-int"
        }
    } catch (e: Exception) {
        false
    }
}

private fun com.android.tools.smali.dexlib2.iface.Method.callsMethodNamed(methodName: String): Boolean {
    return try {
        cachedInstructions().any { instr ->
            instr is ReferenceInstruction &&
                instr.reference is MethodReference &&
                (instr.reference as MethodReference).name == methodName
        }
    } catch (e: Exception) {
        false
    }
}

private fun com.android.tools.smali.dexlib2.iface.Method.isStaticSummarizedPrivilegesIdReturnBool(): Boolean =
    AccessFlags.PUBLIC.isSet(accessFlags) &&
        AccessFlags.STATIC.isSet(accessFlags) &&
        returnType == "Z" &&
        parameterTypes.size == 1 &&
        parameterTypes[0] == "Lcom/p1/mobile/putong/core/data/SummarizedPrivilegesId;"

private fun com.android.tools.smali.dexlib2.iface.Method.isStaticUserPrivilegeReturnBool(): Boolean =
    AccessFlags.PUBLIC.isSet(accessFlags) &&
        AccessFlags.STATIC.isSet(accessFlags) &&
        returnType == "Z" &&
        parameterTypes.size == 1 &&
        parameterTypes[0] == "Lcom/p1/mobile/putong/core/data/UserPrivilege;"

private fun com.android.tools.smali.dexlib2.iface.Method.isStaticNoArgReturnBool(): Boolean =
    AccessFlags.PUBLIC.isSet(accessFlags) &&
        AccessFlags.STATIC.isSet(accessFlags) &&
        returnType == "Z" &&
        parameterTypes.isEmpty()

private fun com.android.tools.smali.dexlib2.iface.Method.containsString(str: String): Boolean =
    cachedInstructions().any { instr ->
        instr is ReferenceInstruction &&
            instr.reference is StringReference &&
            (instr.reference as StringReference).string == str
    }

// True if the method invokes a no-arg boolean AB-flag method on the core provider
// (CoreProviderInterface / CoreProviderImpl). Within the privilege class this uniquely
// identifies the Top Picks gate J3() = (g5() || Lg()) && !c4(); the other ()Z gates call
// only same-class privilege helpers or carry privilege string literals.
private fun com.android.tools.smali.dexlib2.iface.Method.callsCoreProviderAbFlag(): Boolean {
    return try {
        cachedInstructions().any { instr ->
            instr is ReferenceInstruction &&
                instr.reference is MethodReference &&
                (instr.reference as MethodReference).let { ref ->
                    ref.definingClass in setOf(
                        "Lcom/p1/mobile/putong/core/api/inject/provider/CoreProviderInterface;",
                        "Lcom/p1/mobile/putong/core/module/CoreProviderImpl;"
                    ) && ref.returnType == "Z" && ref.parameterTypes.isEmpty()
                }
        }
    } catch (e: Exception) {
        false
    }
}

private fun com.android.tools.smali.dexlib2.iface.Method.instructionCount(): Int =
    cachedInstructions().size

private fun com.android.tools.smali.dexlib2.iface.ClassDef.containsString(str: String): Boolean =
    methods.any { method ->
        instructionsOf(method).any { instr ->
            instr is ReferenceInstruction &&
                instr.reference is StringReference &&
                (instr.reference as StringReference).string == str
        }
    }

private fun com.android.tools.smali.dexlib2.iface.ClassDef.callsMethod(
    definingClass: String? = null,
    name: String? = null,
    returnType: String? = null,
): Boolean = methods.any { method ->
    instructionsOf(method).any { instr ->
        instr is ReferenceInstruction &&
            instr.reference is MethodReference &&
            (definingClass == null || (instr.reference as MethodReference).definingClass == definingClass) &&
            (name == null || (instr.reference as MethodReference).name == name) &&
            (returnType == null || (instr.reference as MethodReference).returnType == returnType)
    }
}

private fun com.android.tools.smali.dexlib2.iface.ClassDef.accessesField(
    definingClass: String? = null,
    name: String? = null,
): Boolean = methods.any { method ->
    instructionsOf(method).any { instr ->
        instr is ReferenceInstruction &&
            instr.reference is com.android.tools.smali.dexlib2.iface.reference.FieldReference &&
            (definingClass == null || (instr.reference as com.android.tools.smali.dexlib2.iface.reference.FieldReference).definingClass == definingClass) &&
            (name == null || (instr.reference as com.android.tools.smali.dexlib2.iface.reference.FieldReference).name == name)
    }
}



// ── Patch ────────────────────────────────────────────────────────────────────

@Suppress("unused")
@JvmField
val premiumUnlockPatch = bytecodePatch(
    name = "Premium Unlock",
    description = "Unlocks all premium features, tier statuses, subscription validation, and display",
    default = true,
) {
    compatibleWith(tantanCompatibility)
    execute {
        // ----------------------------------------------------------------------
        // Pass 1: Stable classes — O(1) direct lookups via classDefByOrNull
        // ----------------------------------------------------------------------
            // ── User: stable, real method names (no obfuscation) ──────────────
            //
            // We patch methods directly here (no fingerprint) because the same
            // `Fingerprint._matchOrNull` cache trap as in CoreProduct would
            // cause `matchOrNull(method)` to return the first match in each
            // set (e.g. isUltraPremium) for every subsequent call (e.g.
            // isSupremePartner), so only the first method in each `setOf(...)`
            // would actually get patched.
            classDefByOrNull(TANTAN_USER_CLASS)?.let { classDef ->
                mutableClassDefBy(classDef).methods.forEach { method ->
                    when {
                        method.name in setOf("isUltraPremium", "isSupremePartner") &&
                            method.parameterTypes.isEmpty() && method.returnType == "Z" -> {
                            method.addInstructions(0, RETURN_TRUE)
                        }
                         // isVIP/isSVIP/isPlatinum: Ultra Premium is a superset that includes all
                         // VIP/SVIP/Platinum features. The app uses isVIP() as a baseline premium
                         // check across 50+ call sites (hide-last-seen, super likes, roaming, etc.).
                         // Returning FALSE broke all those features. Badge display (zva0.B0()) checks
                         // isUltraPremium() FIRST, so returning TRUE here doesn't affect badge precedence.
                         method.name in setOf("isVIP", "isSVIP", "isPlatinum") &&
                             method.parameterTypes.isEmpty() && method.returnType == "Z" -> {
                             method.addInstructions(0, RETURN_TRUE)
                         }
                        method.name in setOf("gpHideVip", "isHideIconFromSVipWithMe") &&
                            method.parameterTypes.isEmpty() && method.returnType == "Z" -> {
                            method.addInstructions(0, RETURN_FALSE)
                        }

                        method.name == "isVIPExpired" &&
                            method.parameterTypes.isEmpty() && method.returnType == "Z" -> {
                            method.addInstructions(0, RETURN_FALSE)
                        }
                        method.name == "isVIPUsed" &&
                            method.parameterTypes.isEmpty() && method.returnType == "Z" -> {
                            method.addInstructions(0, RETURN_TRUE)
                        }
                        method.name in setOf("getVipExpireTime", "getVipToExpireTimeInMill") &&
                            method.parameterTypes.isEmpty() && method.returnType == "J" -> {
                            method.addInstructions(0, GET_VIP_EXPIRE_FAR_FUTURE_BODY)
                        }
                        method.name == "isMembership" -> {
                            method.addInstructions(0, RETURN_TRUE)
                        }
                         method.name == "isMembershipUsed" -> {
                             method.addInstructions(0, RETURN_FALSE)
                         }
                         method.name in setOf("isPicVerificationVerified", "isIdCardVerified", "isStudentVerified", "isIdAndPicBothVerified") &&
                             method.parameterTypes.isEmpty() && method.returnType == "Z" -> {
                             method.addInstructions(0, RETURN_TRUE)
                         }
                        method.name == "isODiamond" &&
                            method.parameterTypes.isEmpty() && method.returnType == "Z" -> {
                            method.addInstructions(0, RETURN_TRUE)
                        }
                        method.name == "isBlackDiamondVIP" &&
                            method.parameterTypes.isEmpty() && method.returnType == "Z" -> {
                            method.addInstructions(0, RETURN_TRUE)
        // ── Messages tab promotional content suppression ──────────────────────

        // ConversationRecommendItemView.X(): bind method for carousel item
        classDefByOrNull("Lcom/p1/mobile/putong/core/newui/messages/ConversationRecommendItemView;")?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.name == "X" && method.returnType == "V") {
                    method.addInstructions(0, RETURN_VOID)
                }
            }
        }

        // RecommendNormalUserView.a0(): bind method for normal user carousel item
        classDefByOrNull("Lcom/p1/mobile/putong/core/newui/messages/RecommendNormalUserView;")?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.name == "a0" && method.returnType == "V") {
                    method.addInstructions(0, RETURN_VOID)
                }
            }
        }

        // ConversationAllPairItemView.Z(): bind method for pair carousel item
        classDefByOrNull("Lcom/p1/mobile/putong/core/newui/messages/ConversationAllPairItemView;")?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.name == "Z" && method.returnType == "V") {
                    method.addInstructions(0, RETURN_VOID)
                }
            }
        }

        // ConversationMatchItemLayout.P(): FUNCTIONAL new-match carousel bind (async-loads the
        // matched users, shows "You have 1 new match"). Deliberately NOT voided: voiding it left
        // the "Matched %s" (MATCHED_BEFORE) placeholder + shimmer permanently. Placeholder fix Nov 2026.

        // ConversationSuperBoostItemView.D0(): bind method for super boost carousel item
        classDefByOrNull("Lcom/p1/mobile/putong/core/newui/messages/ConversationSuperBoostItemView;")?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.name == "D0" && method.returnType == "V") {
                    method.addInstructions(0, RETURN_VOID)
                }
            }
        }

        // ConversationHeadBackUserTipLayout.z(): bind method for back user tip carousel item
        classDefByOrNull("Lcom/p1/mobile/putong/core/newui/messages/ConversationHeadBackUserTipLayout;")?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.name == "z" && method.returnType == "V") {
                    method.addInstructions(0, RETURN_VOID)
                }
            }
        }

        // ConversationCityCentreCardLayout.l(): bind method for city centre card carousel item
        classDefByOrNull("Lcom/p1/mobile/putong/core/newui/messages/ConversationCityCentreCardLayout;")?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.name == "l" && method.returnType == "V") {
                    method.addInstructions(0, RETURN_VOID)
                }
            }
        }

        // NewMatchItemLayout.o(): FUNCTIONAL new-match carousel bind (async-loads matched user,
        // sets avatar/name). Deliberately NOT voided — voiding left shimmer + default text. Nov 2026.
        //
        // ConversationItemUserStatesView.i() (type 16), ConversationFoldView.T() (type 39, old-messages
        // fold) and IntlVisitorConversationView.m0() (type 48, visitor cell) are FUNCTIONAL conversation
        // cell binds, NOT promo. They were previously voided under the promo-suppression banner, which
        // left those cells unbound (default/placeholder text). Deliberately NOT voided now (Nov 2026).
        // Only genuine promo binds above/below (RecommendItemView, RecommendNormalUserView,
        // AllPairItemView, SuperBoostItemView, HeadBackUserTipLayout, CityCentreCardLayout,
        // PrivilegePromotionHeaderView) remain suppressed.

        // PrivilegePromotionHeaderView.d(): loads promotional image, prevents display
        // PrivilegePromotionHeaderView.e(): updates promotion text, prevents display
        classDefByOrNull("Lcom/p1/mobile/putong/core/newui/messages/promotion/PrivilegePromotionHeaderView;")?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.name in setOf("d", "e") && method.parameterTypes.isEmpty() && method.returnType == "V") {
                    method.addInstructions(0, RETURN_VOID)
                }
            }
        }

    }
}
                 }
             }

            // ── CoreProduct: stable class, obfuscated methods ──────────────────
            //
            // NOTE: We deliberately do NOT use `coreProductZ4Fingerprint.matchOrNull(method)`
            // or `coreProductU4Fingerprint.matchOrNull(method)` here. Those overloads
            // share a global per-Fingerprint-instance cache (`_matchOrNull`) — the first
            // call to match a method caches the Match, and every subsequent call returns
            // the cached Match regardless of the method passed in. Iterating
            // classDef.methods.forEach { matchOrNull(it) } therefore patches only the
            // FIRST matching method (A4 in this case) and silently leaves B4/y4/T4/Q4/
            // z4/R4/L4/O4/P4 untouched. Those gates then keep returning their original
            // values — B4()/y4() keep calling u4("vip") which our u4-patch forces to
            // TRUE, so the "send message" / "see who liked me" purchase dialogs open
            // and crash with NPE on `FreeTrialData.titleText` (r0 was never populated).
            //
            // Since we've already narrowed to a single stable class, we can filter and
            // patch directly via `mutableClassDefBy(classDef).methods` (which returns
            // MutableMethod instances — the only type with `addInstructions(String)`).
            // CoreProduct: promotion and purchase gate checks
            // q4(String) checks if a promotion is active by type (e.g., "vip", "premium", "seeWhoLikedMe")
            // It returns FALSE when FreeTrialData is null (non-promotional user state)
            // We do NOT patch q4() because it already returns the correct value for free users
            // Patching it breaks the promotion state machine and causes crashes
            
            // Q4(PurchaseType) - purchase requirement check (7.5.6.1: CoreProduct obfuscated to
            // Ll/is3;, Q4 -> S static). Resolve via the location-bubble pref anchor; match the
            // (PurchaseType)Z gate by shape (name-agnostic). Returns TRUE if a purchase is needed;
            // force FALSE to bypass purchase requirements.
            getSharedResolver().getPremiumClass("coreProduct")?.let { classDef ->
                mutableClassDefBy(classDef).methods.forEach { method ->
                    if (method.parameterTypes == listOf("Lcom/p1/mobile/putong/core/data/PurchaseType;") &&
                        method.returnType == "Z"
                    ) {
                        method.addInstructions(0, RETURN_FALSE)
                    }
                }
            }

            // ── CounterSuperlikeAndUndoLimit: stable class, stable methods ────
            // (Direct patch — see CoreProduct note about the matchOrNull cache trap.)
            classDefByOrNull("Lcom/p1/mobile/putong/data/CounterSuperlikeAndUndoLimit;")?.let { classDef ->
                mutableClassDefBy(classDef).methods.forEach { method ->
                    if (method.name in setOf("remainToday", "remainAll") &&
                        method.parameterTypes.isEmpty() && method.returnType == "I"
                    ) {
                        method.addInstructions(0, RETURN_INT_200000)
                    }
                }
            }

            // ── CoreBusinessServiceIml: stable class, obfuscated param types ──
            classDefByOrNull("Lcom/p1/mobile/putong/core/module/CoreBusinessServiceIml;")?.let { classDef ->
                // Void the (Act,String,Privilege,<ref>,<ref>)V purchase-guide entries. The old
                // name-based Lf/R6/Sl fingerprints threw on 7.5.4 (multiple methods share this
                // shape: Of/Wl/q6). Match by shape directly; the real 11-param purchase flow
                // (Id) and 3/4-param entries are untouched.
                mutableClassDefBy(classDef).methods.forEach { method ->
                    if (AccessFlags.PUBLIC.isSet(method.accessFlags) && method.returnType == "V" &&
                        method.parameterTypes.size == 5 &&
                        method.parameterTypes[0] == "Lcom/p1/mobile/android/app/Act;" &&
                        method.parameterTypes[1] == "Ljava/lang/String;" &&
                        method.parameterTypes[2] == "Lcom/p1/mobile/putong/core/data/Privilege;" &&
                        method.parameterTypes[3].startsWith("L") &&
                        method.parameterTypes[4].startsWith("L")
                    ) {
                        method.addInstructions(0, RETURN_VOID)
                    }
                }
                // Ai(Act) → true: allows boost activation (Gate 3 in f93.y())
                // Original: hardcoded `return false` — blocks actual boost activation.
                mutableClassDefBy(classDef).methods.forEach { method ->
                    if (method.name == "Ai" &&
                        method.parameterTypes.size == 1 &&
                        method.parameterTypes[0] == "Lcom/p1/mobile/android/app/Act;" &&
                        method.returnType == "Z"
                    ) {
                        method.addInstructions(0, RETURN_TRUE)
                    }
                    // en()Z hardcoded false gates chat-history search (sole consumer si9.U();
                    // search UI + ConversationSearchAct fully present, local DB only).
                    if (method.name == "en" &&
                        method.parameterTypes.isEmpty() &&
                        method.returnType == "Z"
                    ) {
                        method.addInstructions(0, RETURN_TRUE)
                    }
                }
                val emptySpannableBody = """
                    new-instance v0, Landroid/text/SpannableString;
                    const-string v1, ""
                    invoke-direct {v0, v1}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V
                    return-object v0
                """
                val distanceAgeMethods = mutableClassDefBy(classDef).methods.filter {
                    it.parameterTypes == listOf("Lcom/p1/mobile/putong/data/User;", "Landroid/content/Context;", "[I") &&
                        it.returnType == "Landroid/text/SpannableString;"
                }
                check(distanceAgeMethods.size == 1) {
                    "CoreBusinessServiceIml distance/age (User,Context,int[])SpannableString: expected 1, found ${distanceAgeMethods.size}"
                }
                distanceAgeMethods.forEach { method ->
                    method.preflightSmali(emptySpannableBody, 4)
                    method.addInstructions(0, emptySpannableBody)
                }
            }

            // ── Instant Match regional gate: REMOVED ──
            // Hardcoded descriptor Lcom/p1/mobile/putong/core/ui/match/a; is obfuscated in 7.3.3
            // and doesn't match the actual class in the APK. This patch would need fingerprint-based
            // discovery to work correctly. Removed to fix test failures.

            // ── Swipe right purchase dialog: REMOVED ──
            // Hardcoded descriptor Lcom/p1/mobile/putong/core/newui/home/base/impl/swipe/m; is obfuscated
            // in 7.3.3 and doesn't match the actual class in the APK. This patch would need fingerprint-based
            // discovery to work correctly. Removed to fix test failures.

            // ── Me tab affiliate discount entry banner: CoreIntlAffiliatePromotions.S() ──
            //
            // The Me tab shows an affiliate discount banner driven by server-side promotion
            // data, NOT user tier. S() checks if there's a cached IapAffiliatePromotion
            // for the given tab. Patching to FALSE hides ALL discount entry banners
            // (ME_TAB, MESSAGE_TAB, WHISPER_TAB, etc.) — desired for premium unlock.
            getSharedResolver().getPremiumClass("affiliatePromotions")?.let { classDef ->
                mutableClassDefBy(classDef).methods.forEach { method ->
                    if (method.parameterTypes == listOf("Lcom/p1/mobile/putong/core/api/CoreIntlAffiliatePromotions\$IntlAffiliateDiscountEntryTab;") &&
                        method.returnType == "Z"
                    ) {
                        method.preflightSmali(RETURN_FALSE, 2)
                        method.addInstructions(0, RETURN_FALSE)
                    }
                }
            }

            // ── Daily like limit bypass: REMOVED ──
            // Hardcoded descriptors for h0, l1, m1 are obfuscated in 7.3.3 and don't match
            // the actual classes in the APK. These patches would need fingerprint-based
            // discovery to work correctly. Removed to fix test failures.

            // ── CoreProviderImpl.Er(): infinite loading fix ──
            //
            // CoreProviderImpl.Er() is hardcoded to return false, causing pib.q9()
            // to skip processing user data, leading to infinite loading.
            // Patching to return true allows pib.q9() to pass the guard condition
            // and call pa() to process user data.
            classDefByOrNull("Lcom/p1/mobile/putong/core/module/CoreProviderImpl;")?.let { classDef ->
                mutableClassDefBy(classDef).methods.forEach { method ->
                    if (method.name == "Er" &&
                        method.parameterTypes.isEmpty() &&
                        method.returnType == "Z"
                    ) {
                        method.addInstructions(0, RETURN_TRUE)
                    }
                    // l()Z hardcoded false gates per-contact chat backgrounds + nicknames
                    // (9 call sites audited; background 100% local localChatBg). Match the
                    // exact no-arg l() — CoreProviderImpl has many *l() variants.
                    if (method.name == "l" &&
                        method.parameterTypes.isEmpty() &&
                        method.returnType == "Z"
                    ) {
                        method.addInstructions(0, RETURN_TRUE)
                    }
                }
            }

            // ── Live streaming permissions: LiveAssertApi ──
            //
            // LiveAssertApi gates client-side live streaming capabilities:
            //   - isCanStartLive(): ability to start live streams
            //   - getCanUseMaskMode(): anonymous/mask mode in live streams
            //   - isUserStartVoiceLiveEnable(): voice live streaming capability
            // All three are static no-arg → Z. Patching to TRUE unlocks all live features.
            classDefByOrNull("Lcom/p1/mobile/putong/live/external/module/api/LiveAssertApi;")?.let { classDef ->
                mutableClassDefBy(classDef).methods.forEach { method ->
                    if (method.name in setOf("isCanStartLive", "getCanUseMaskMode", "isUserStartVoiceLiveEnable") &&
                        method.parameterTypes.isEmpty() &&
                        method.returnType == "Z" &&
                        AccessFlags.STATIC.isSet(method.accessFlags)
                    ) {
                        method.addInstructions(0, RETURN_TRUE)
                    }
                }
            }

            // ── Search filter expansion + ultra premium flag: Settings ──
            classDefByOrNull("Lcom/p1/mobile/putong/data/Settings;")?.let { classDef ->
                mutableClassDefBy(classDef).methods.forEach { method ->
                    when {
                        method.name == "getRadiusAllowedMaximum" &&
                            method.parameterTypes.isEmpty() &&
                            method.returnType == "Ljava/lang/Integer;" -> {
                            method.addInstructions(0, RETURN_INTEGER_200000)
                        }
                        method.name == "getRadiusAllowedMinimum" &&
                            method.parameterTypes.isEmpty() &&
                            method.returnType == "Ljava/lang/Integer;" -> {
                            method.addInstructions(0, RETURN_INTEGER_1)
                        }
                        method.name == "getSearchAgeAllowedMaximum" &&
                            method.parameterTypes.isEmpty() &&
                            method.returnType == "Ljava/lang/Integer;" -> {
                            method.addInstructions(0, RETURN_INTEGER_100)
                        }
                        method.name == "getSearchAgeAllowedMinimum" &&
                            method.parameterTypes.isEmpty() &&
                            method.returnType == "Ljava/lang/Integer;" -> {
                            method.addInstructions(0, RETURN_INTEGER_18)
                        }
                        method.name == "userIsODiamond" &&
                            method.parameterTypes.isEmpty() &&
                            method.returnType == "Z" -> {
                            method.addInstructions(0, RETURN_TRUE)
                        }
                        method.name == "getSearchRadius" &&
                            method.parameterTypes.isEmpty() &&
                            method.returnType == "Ljava/lang/Integer;" -> {
                            method.addInstructions(0, RETURN_INTEGER_200000)
                        }
                        method.name == "getSearchMaxAge" &&
                            method.parameterTypes.isEmpty() &&
                            method.returnType == "Ljava/lang/Integer;" -> {
                            method.addInstructions(0, RETURN_INTEGER_100)
                        }
                        method.name == "getSearchMinAge" &&
                            method.parameterTypes.isEmpty() &&
                            method.returnType == "Ljava/lang/Integer;" -> {
                            method.addInstructions(0, RETURN_INTEGER_18)
                        }
                        method.name == "isCityTop" &&
                            method.parameterTypes.isEmpty() &&
                            method.returnType == "Z" -> {
                            method.addInstructions(0, RETURN_TRUE)
                        }
                        method.name == "isPlatinum" &&
                            method.parameterTypes.isEmpty() &&
                            method.returnType == "Z" -> {
                            method.addInstructions(0, RETURN_TRUE)
                        }
                        method.name == "isSupremePartner" &&
                            method.parameterTypes.isEmpty() &&
                            method.returnType == "Z" -> {
                            method.addInstructions(0, RETURN_TRUE)
                        }
                        method.name == "isSupremePartnerOpenMystery" &&
                            method.parameterTypes.isEmpty() &&
                            method.returnType == "Z" -> {
                            method.addInstructions(0, RETURN_TRUE)
                        }
                    }
                }
            }

            // ── SwipeRateLimitConfig: disable swipe rate limiting ──
            // Overwrite enable field to false after every write (protobuf/JSON parse, clone)
            classDefByOrNull("Lcom/p1/mobile/putong/core/data/SwipeRateLimitConfig;")?.let { classDef ->
                mutableClassDefBy(classDef).methods.forEach { method ->
                    val instrs = method.cachedInstructions()
                    val writeIndices = instrs.withIndex().filter { (_, instr) ->
                        instr.opcode.name == "iput-byte" &&
                            instr is ReferenceInstruction &&
                            instr.reference is FieldReference &&
                            (instr.reference as FieldReference).name == "enable" &&
                            (instr.reference as FieldReference).definingClass == "Lcom/p1/mobile/putong/core/data/SwipeRateLimitConfig;"
                    }.map { it.index }

                    if (writeIndices.isEmpty()) return@forEach

                    writeIndices.reversed().forEach { idx ->
                        val instr = instrs[idx]
                        if (instr is TwoRegisterInstruction) {
                            val objReg = instr.registerB
                            val fieldRef = (instr as ReferenceInstruction).reference as FieldReference
                            val tempReg = if (objReg != 0) "v0" else "v1"
                            method.addInstructions(idx + 1, """
                                const/4 $tempReg, 0x0
                                iput-byte $tempReg, v$objReg, ${fieldRef.definingClass}->${fieldRef.name}:${fieldRef.type}
                            """)
                        }
                    }
                }
            }

            // ── LeftSwipeLimitConfig: remove left swipe (dislike) limits ──
            // Overwrite swipeLimit field to null after every write
            classDefByOrNull("Lcom/p1/mobile/putong/core/data/LeftSwipeLimitConfig;")?.let { classDef ->
                mutableClassDefBy(classDef).methods.forEach { method ->
                    val instrs = method.cachedInstructions()
                    val writeIndices = instrs.withIndex().filter { (_, instr) ->
                        instr.opcode.name == "iput-object" &&
                            instr is ReferenceInstruction &&
                            instr.reference is FieldReference &&
                            (instr.reference as FieldReference).name == "swipeLimit" &&
                            (instr.reference as FieldReference).definingClass == "Lcom/p1/mobile/putong/core/data/LeftSwipeLimitConfig;"
                    }.map { it.index }

                    if (writeIndices.isEmpty()) return@forEach

                    writeIndices.reversed().forEach { idx ->
                        val instr = instrs[idx]
                        if (instr is TwoRegisterInstruction) {
                            val objReg = instr.registerB
                            val fieldRef = (instr as ReferenceInstruction).reference as FieldReference
                            val tempReg = if (objReg != 0) "v0" else "v1"
                            method.addInstructions(idx + 1, """
                                const/4 $tempReg, 0x0
                                iput-object $tempReg, v$objReg, ${fieldRef.definingClass}->${fieldRef.name}:${fieldRef.type}
                            """)
                        }
                    }
                }
            }

            // ── IntlUltraPremiumConfig: enable ultra premium features ──
            // Overwrite androidEnable field to true after every write
            classDefByOrNull("Lcom/p1/mobile/putong/core/data/IntlUltraPremiumConfig;")?.let { classDef ->
                mutableClassDefBy(classDef).methods.forEach { method ->
                    val instrs = method.cachedInstructions()
                    val writeIndices = instrs.withIndex().filter { (_, instr) ->
                        instr.opcode.name == "iput-byte" &&
                            instr is ReferenceInstruction &&
                            instr.reference is FieldReference &&
                            (instr.reference as FieldReference).name == "androidEnable" &&
                            (instr.reference as FieldReference).definingClass == "Lcom/p1/mobile/putong/core/data/IntlUltraPremiumConfig;"
                    }.map { it.index }

                    if (writeIndices.isEmpty()) return@forEach

                    writeIndices.reversed().forEach { idx ->
                        val instr = instrs[idx]
                        if (instr is TwoRegisterInstruction) {
                            val objReg = instr.registerB
                            val fieldRef = (instr as ReferenceInstruction).reference as FieldReference
                            val tempReg = if (objReg != 0) "v0" else "v1"
                            method.addInstructions(idx + 1, """
                                const/4 $tempReg, 0x1
                                iput-byte $tempReg, v$objReg, ${fieldRef.definingClass}->${fieldRef.name}:${fieldRef.type}
                            """)
                        }
                    }
                }
            }

            // ── CounterLikeLimit: remove daily like limits ──
            // Overwrite remaining, total, tribeRemaining, tribeTotalCount to 200000 after every write
            classDefByOrNull("Lcom/p1/mobile/putong/data/CounterLikeLimit;")?.let { classDef ->
                mutableClassDefBy(classDef).methods.forEach { method ->
                    val instrs = method.cachedInstructions()
                    val likeLimitFields = setOf("remaining", "total", "tribeRemaining", "tribeTotalCount")
                    val writeIndices = instrs.withIndex().filter { (_, instr) ->
                        instr.opcode.name == "iput" &&
                            instr is ReferenceInstruction &&
                            instr.reference is FieldReference &&
                            (instr.reference as FieldReference).name in likeLimitFields &&
                            (instr.reference as FieldReference).definingClass == "Lcom/p1/mobile/putong/data/CounterLikeLimit;"
                    }.map { it.index }

                    if (writeIndices.isEmpty()) return@forEach

                    writeIndices.reversed().forEach { idx ->
                        val instr = instrs[idx]
                        if (instr is TwoRegisterInstruction) {
                            val objReg = instr.registerB
                            val fieldRef = (instr as ReferenceInstruction).reference as FieldReference
                            val tempReg = if (objReg != 0) "v0" else "v1"
                            method.addInstructions(idx + 1, """
                                const $tempReg, 0x30d40
                                iput $tempReg, v$objReg, ${fieldRef.definingClass}->${fieldRef.name}:${fieldRef.type}
                            """)
                        }
                    }
                }
            }

            // ── LikersLimit: remove "who liked me" view limits ──
            // Overwrite remaining, total to 200000 after every write
            classDefByOrNull("Lcom/p1/mobile/putong/data/LikersLimit;")?.let { classDef ->
                mutableClassDefBy(classDef).methods.forEach { method ->
                    val instrs = method.cachedInstructions()
                    val likersLimitFields = setOf("remaining", "total")
                    val writeIndices = instrs.withIndex().filter { (_, instr) ->
                        instr.opcode.name == "iput" &&
                            instr is ReferenceInstruction &&
                            instr.reference is FieldReference &&
                            (instr.reference as FieldReference).name in likersLimitFields &&
                            (instr.reference as FieldReference).definingClass == "Lcom/p1/mobile/putong/data/LikersLimit;"
                    }.map { it.index }

                    if (writeIndices.isEmpty()) return@forEach

                    writeIndices.reversed().forEach { idx ->
                        val instr = instrs[idx]
                        if (instr is TwoRegisterInstruction) {
                            val objReg = instr.registerB
                            val fieldRef = (instr as ReferenceInstruction).reference as FieldReference
                            val tempReg = if (objReg != 0) "v0" else "v1"
                            method.addInstructions(idx + 1, """
                                const $tempReg, 0x30d40
                                iput $tempReg, v$objReg, ${fieldRef.definingClass}->${fieldRef.name}:${fieldRef.type}
                            """)
                        }
                    }
                }
            }

            // ── VerificationLimit: remove tribe verification limits ──
            // Overwrite tribeTotalCount, tribeSwipeCount to 200000 after every write
            classDefByOrNull("Lcom/p1/mobile/putong/data/VerificationLimit;")?.let { classDef ->
                mutableClassDefBy(classDef).methods.forEach { method ->
                    val instrs = method.cachedInstructions()
                    val verificationLimitFields = setOf("tribeTotalCount", "tribeSwipeCount")
                    val writeIndices = instrs.withIndex().filter { (_, instr) ->
                        instr.opcode.name == "iput" &&
                            instr is ReferenceInstruction &&
                            instr.reference is FieldReference &&
                            (instr.reference as FieldReference).name in verificationLimitFields &&
                            (instr.reference as FieldReference).definingClass == "Lcom/p1/mobile/putong/data/VerificationLimit;"
                    }.map { it.index }

                    if (writeIndices.isEmpty()) return@forEach

                    writeIndices.reversed().forEach { idx ->
                        val instr = instrs[idx]
                        if (instr is TwoRegisterInstruction) {
                            val objReg = instr.registerB
                            val fieldRef = (instr as ReferenceInstruction).reference as FieldReference
                            val tempReg = if (objReg != 0) "v0" else "v1"
                            method.addInstructions(idx + 1, """
                                const $tempReg, 0x30d40
                                iput $tempReg, v$objReg, ${fieldRef.definingClass}->${fieldRef.name}:${fieldRef.type}
                            """)
                        }
                    }
                }
            }

            // ── UserSVIPSettings: force SVIP tier flag ──
            // Overwrite isSvip field to Boolean.TRUE after every write
            classDefByOrNull("Lcom/p1/mobile/putong/data/UserSVIPSettings;")?.let { classDef ->
                mutableClassDefBy(classDef).methods.forEach { method ->
                    val instrs = method.cachedInstructions()
                    val writeIndices = instrs.withIndex().filter { (_, instr) ->
                        instr.opcode.name == "iput-object" &&
                            instr is ReferenceInstruction &&
                            instr.reference is FieldReference &&
                            (instr.reference as FieldReference).name == "isSvip" &&
                            (instr.reference as FieldReference).definingClass == "Lcom/p1/mobile/putong/data/UserSVIPSettings;"
                    }.map { it.index }

                    if (writeIndices.isEmpty()) return@forEach

                    writeIndices.reversed().forEach { idx ->
                        val instr = instrs[idx]
                        if (instr is TwoRegisterInstruction) {
                            val objReg = instr.registerB
                            val fieldRef = (instr as ReferenceInstruction).reference as FieldReference
                            val tempReg = if (objReg != 0) "v0" else "v1"
                            method.addInstructions(idx + 1, """
                                sget-object $tempReg, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
                                iput-object $tempReg, v$objReg, ${fieldRef.definingClass}->${fieldRef.name}:${fieldRef.type}
                            """)
                        }
                    }
                }
            }

            // ── CoreProduct.S4(PurchaseType): no purchase needed ──
            // Merged with CoreProduct u4/gate patch above (single classDefByOrNull lookup)

            // ── BLiveCoin: REMOVED ──
            // Previously attempted to patch new_() factory to set available field to Long.MAX_VALUE.
            // Caused startup crashes due to register allocation issues (const-wide requires 2 registers,
            // but the method likely only has .registers 2, making v2 out of bounds).
            // Virtual currency is server-validated anyway, so local patching is ineffective.

            // ── Boost remaining count: BoostRemainingCountView ──
            //
            // getBoostLimitCount() sums BoostLimit.remaining across all boost types.
            // Patching to return 200000 makes the UI show unlimited boost availability.
            classDefByOrNull("Lcom/p1/mobile/putong/core/newui/home/BoostRemainingCountView;")?.let { classDef ->
                mutableClassDefBy(classDef).methods.forEach { method ->
                    if (method.parameterTypes.isEmpty() &&
                        method.returnType == "I" &&
                        AccessFlags.PRIVATE.isSet(method.accessFlags)
                    ) {
                        method.addInstructions(0, RETURN_INT_200000)
                    }
                }
            }

            // ── Boost remaining count: LikersBoostRemainingCountView ──
            //
            // Same pattern as BoostRemainingCountView — getBoostLimitCount() sums
            // BoostLimit.remaining. Patch to 200000 for unlimited display.
            classDefByOrNull("Lcom/p1/mobile/putong/core/newui/home/LikersBoostRemainingCountView;")?.let { classDef ->
                mutableClassDefBy(classDef).methods.forEach { method ->
                    if (method.parameterTypes.isEmpty() &&
                        method.returnType == "I" &&
                        AccessFlags.PRIVATE.isSet(method.accessFlags)
                    ) {
                        method.addInstructions(0, RETURN_INT_200000)
                    }
                }
            }

            // b8d0, zt6, lke0 moved to Pass 2 (fingerprint-based via UnifiedClassResolver)

            // ── b240 and kfe0 patches moved to Pass 2 (fingerprint-based) ──
            // Hardcoded descriptors (Lp153l/b240;, Lp153l/kfe0;) don't match actual DEX.
            // Using fingerprint-based discovery instead.

            // tje0 moved to Pass 2 (fingerprint-based via UnifiedClassResolver)

            // ── Messages tab promotional content suppression ──
            // Moved to Pass 2 using fingerprint-based discovery (see below)
            // The old hardcoded class descriptors (Ll/qa9;, Ll/hva;, etc.) don't exist in the APK.
            // Suppresses the "x girls just liked you" premium upsell dialog entirely
            // Patch F(Act, CoreLikers.a, y20) - the static method that creates and shows the dialog
            // so it never gets created at all
            classDefByOrNull("Lcom/p1/mobile/putong/core/ui/seepop/NewLikeView;")?.let { classDef ->
                mutableClassDefBy(classDef).methods.forEach { method ->
                    if (method.name == "F" && method.parameterTypes.size == 3 && method.returnType == "V" &&
                        AccessFlags.STATIC.isSet(method.accessFlags)) {
                        method.addInstructions(0, "return-void")
                    }
                }
            }

            // ConversationHeadLikerItemLayout: bind method (Act, ConversationHeadRecommendLayout.c) → return-void
            // Suppresses the server-text "X women Y miles liked you" gold card in the head recommend carousel.
            // 7.5.4 renamed u → w; match by signature (instance, V, 2 params, first = Act) instead of name.
            classDefByOrNull("Lcom/p1/mobile/putong/core/newui/messages/ConversationHeadLikerItemLayout;")?.let { classDef ->
                mutableClassDefBy(classDef).methods.forEach { method ->
                    if (method.parameterTypes.size == 2 && method.returnType == "V" &&
                        method.parameterTypes[0] == "Lcom/p1/mobile/android/app/Act;" &&
                        !AccessFlags.STATIC.isSet(method.accessFlags)) {
                        method.addInstructions(0, "return-void")
                    }
                }
            }

            // ConversationHeadIntlSeeItem: L(C8265b) + K(C4870a) + M(int) → return-void
            // Suppresses the "See who liked you" / "Tap to respond" banner in the head recommend carousel
            // L() sets up click listener and subscribes to CoreLikers.S6() observable
            // K() is the callback that sets text on the views (title, subtitle, count)
            // M() sets the count text on the auto-fit text view (called from K when count <= 0)
            classDefByOrNull("Lcom/p1/mobile/putong/core/newui/messages/ConversationHeadIntlSeeItem;")?.let { classDef ->
                mutableClassDefBy(classDef).methods.forEach { method ->
                    if (method.name == "L" && method.parameterTypes.size == 1 && method.returnType == "V") {
                        method.addInstructions(0, "return-void")
                    }
                    if (method.name == "K" && method.parameterTypes.size == 1 && method.returnType == "V") {
                        method.addInstructions(0, "return-void")
                    }
                    if (method.name == "M" && method.parameterTypes.size == 1 && method.returnType == "V") {
                        method.addInstructions(0, "return-void")
                    }
                }
            }

            // TODO: ViewTreeObserverOnGlobalLayoutListenerC8017b was renamed to ViewTreeObserverOnGlobalLayoutListenerC0351b
            // and moved to an inner class in com/p1/mobile/putong/feed/ui/moments/b.java
            // The old descriptor no longer exists. Needs fingerprint-based discovery to re-enable.
            // ── ViewTreeObserverOnGlobalLayoutListenerC8017b.u6(): Bubble display method ──
            // This is the FINAL method that renders the floating "x girls y miles away" bubble.
            // It calls act().m7() to display the bubble on screen.
            // Patching u6() to return-void prevents ANY bubble from being displayed, regardless
            // of which code path (u7, k8, w7) created it.
            // classDefByOrNull("Lcom/p1/mobile/putong/core/newui/home/ViewTreeObserverOnGlobalLayoutListenerC8017b;")?.let { classDef ->
            //     mutableClassDefBy(classDef).methods.forEach { method ->
            //         if (method.name == "u6" && method.parameterTypes.size == 8 && method.returnType == "V" &&
            //             !AccessFlags.STATIC.isSet(method.accessFlags)) {
            //             method.addInstructions(0, RETURN_VOID)
            //         }
            //     }
            // }

            // n1b0, ela0 moved to Pass 2 (fingerprint-based via UnifiedClassResolver)

            // IntlMeetLikersNewLikersView: Suppress "New like" section in intlmeet
            // Shows "x more girls liked you" / "x more people liked you" promotional content
            classDefByOrNull("Lcom/p1/mobile/putong/core/newui/intlmeet/likers/items/IntlMeetLikersNewLikersView;")?.let { classDef ->
                mutableClassDefBy(classDef).methods.forEach { method ->
                    // e(afo) - data binding method that populates the view
                    if (method.name == "e" && method.parameterTypes.size == 1 && method.returnType == "V") {
                        method.addInstructions(0, RETURN_VOID)
                    }
                }
            }

            // MeetLikersNewLikersView: Suppress "New like" section in meet
            // Similar promotional content for non-international meet section
            classDefByOrNull("Lcom/p1/mobile/putong/core/newui/meet/likers/items/MeetLikersNewLikersView;")?.let { classDef ->
                mutableClassDefBy(classDef).methods.forEach { method ->
                    // e(afo) - data binding method that populates the view
                    if (method.name == "e" && method.parameterTypes.size == 1 && method.returnType == "V") {
                        method.addInstructions(0, RETURN_VOID)
                    }
                }
            }

            // LikersNewLikeBubble: Suppress animated floating bubble
            // Shows animated "new like" notifications that float on screen
            classDefByOrNull("Lcom/p1/mobile/putong/core/ui/vip/likers/LikersNewLikeBubble;")?.let { classDef ->
                mutableClassDefBy(classDef).methods.forEach { method ->
                    // d() and e() - animation show/dismiss methods
                    if (method.name in setOf("d", "e") && method.parameterTypes.isEmpty() && method.returnType == "V") {
                        method.addInstructions(0, RETURN_VOID)
                    }
                }
            }

            // IntlMeetLikersNewLikersItem: Suppress individual new liker item binding in intlmeet
            classDefByOrNull("Lcom/p1/mobile/putong/core/newui/intlmeet/likers/items/IntlMeetLikersNewLikersItem;")?.let { classDef ->
                mutableClassDefBy(classDef).methods.forEach { method ->
                    if (method.name == "S" && method.parameterTypes.size == 1 && method.parameterTypes[0] == "Lcom/p1/mobile/putong/data/User;" && method.returnType == "V") {
                        method.addInstructions(0, RETURN_VOID)
                    }
                }
            }

            // MeetLikersNewLikersItem: Suppress individual new liker item binding in meet
            classDefByOrNull("Lcom/p1/mobile/putong/core/newui/meet/likers/items/MeetLikersNewLikersItem;")?.let { classDef ->
                mutableClassDefBy(classDef).methods.forEach { method ->
                    if (method.name == "T" && method.parameterTypes.size == 1 && method.parameterTypes[0] == "Lcom/p1/mobile/putong/data/User;" && method.returnType == "V") {
                        method.addInstructions(0, RETURN_VOID)
                    }
                }
            }

            // CoreSuggested: Likers data source - n8() initiates the likers poll
            classDefByOrNull("Lcom/p1/mobile/putong/core/api/CoreSuggested;")?.let { classDef ->
                mutableClassDefBy(classDef).methods.forEach { method ->
                    if (method.name == "n8" && method.parameterTypes.isEmpty() &&
                        (method.returnType.startsWith("Lrx/") || method.returnType.startsWith("Lio/reactivex/"))) {
                        method.addInstructions(0, """
                            invoke-static {}, Lrx/c;->a()Lrx/c;
                            move-result-object v0
                            return-object v0
                        """)
                    }
                }
            }

            // FakeLikersAct: Suppress fake likers activity launch
            classDefByOrNull("Lcom/p1/mobile/putong/core/ui/seepage/likers/FakeLikersAct;")?.let { classDef ->
                mutableClassDefBy(classDef).methods.forEach { method ->
                    if (method.name == "Y1" && AccessFlags.STATIC.isSet(method.accessFlags) && method.parameterTypes.size == 2 && method.returnType == "Landroid/content/Intent;") {
                        method.addInstructions(0, """
                            const/4 v0, 0x0
                            return-object v0
                        """)
                    }
                    if (method.name == "a2" && AccessFlags.STATIC.isSet(method.accessFlags) && method.parameterTypes.size == 2 && method.returnType == "V") {
                        method.addInstructions(0, RETURN_VOID)
                    }
                }
            }

            // FakeLikersItem: Suppress fake liker item binding
            classDefByOrNull("Lcom/p1/mobile/putong/core/ui/seepage/likers/FakeLikersItem;")?.let { classDef ->
                mutableClassDefBy(classDef).methods.forEach { method ->
                    if (method.name == "k" && method.parameterTypes.size == 2 && method.parameterTypes[0] == "Lcom/p1/mobile/putong/data/User;" && method.returnType == "V") {
                        method.addInstructions(0, RETURN_VOID)
                    }
                    if (method.name == "l" && method.parameterTypes.size == 1 && method.parameterTypes[0] == "Lcom/p1/mobile/putong/data/User;" && method.returnType == "V") {
                        method.addInstructions(0, RETURN_VOID)
                    }
                }
            }

            // IntlFakeLikersItem: Suppress international fake liker item binding
            classDefByOrNull("Lcom/p1/mobile/putong/core/ui/seepage/likers/IntlFakeLikersItem;")?.let { classDef ->
                mutableClassDefBy(classDef).methods.forEach { method ->
                    if (method.name == "i" && method.parameterTypes.size == 1 && method.parameterTypes[0] == "Lcom/p1/mobile/putong/data/User;" && method.returnType == "V") {
                        method.addInstructions(0, RETURN_VOID)
                    }
                }
            }

            // IntlMeetFakeLikersItem: Suppress international meet fake liker item binding
            classDefByOrNull("Lcom/p1/mobile/putong/core/newui/intlmeet/likers/items/IntlMeetFakeLikersItem;")?.let { classDef ->
                mutableClassDefBy(classDef).methods.forEach { method ->
                    if (method.name == "n" && method.parameterTypes.size == 2 && method.returnType == "V") {
                        method.addInstructions(0, RETURN_VOID)
                    }
                }
            }

            // MeetPromotionItemView: Suppress promotion item display
            classDefByOrNull("Lcom/p1/mobile/putong/core/newui/newmeet/feed/likers/MeetPromotionItemView;")?.let { classDef ->
                mutableClassDefBy(classDef).methods.forEach { method ->
                    if (method.name == "m" && method.parameterTypes.size == 2 && method.returnType == "V") {
                        method.addInstructions(0, RETURN_VOID)
                    }
                    if (method.name == "o" && method.parameterTypes.size == 1 && method.parameterTypes[0] == "I" && method.returnType == "V") {
                        method.addInstructions(0, RETURN_VOID)
                    }
                }
            }

            // DATA LAYER PATCHES - String formatter
            // Patch the string formatter that creates "people liked you" text
            // Anchored on the string "people liked you"
            val wid0StringFormatterFingerprint = Fingerprint(
                filters = listOf(string("people liked you")),
            )
            wid0StringFormatterFingerprint.matchOrNull()?.classDef?.let { classDef ->
                mutableClassDefBy(classDef).methods.forEach { method ->
                    if (method.name == "j" && method.parameterTypes.size == 1 && method.parameterTypes[0] == "I" && method.returnType == "Ljava/lang/CharSequence;") {
                        method.addInstructions(0, """
                            const-string v0, ""
                            return-object v0
                        """)
                    }
                }
            }
            
            // ConversationsList adapter: Enhanced view hiding for promotional types
            // Instead of just setVisibility(GONE), also set height to 0 to prevent ListView from allocating space
            // This is more reliable than just GONE in ListView context
            
            // ConversationsList$e.getItemViewType() patch removed:
            // The previous smali patch had critical bugs:
            // 1. Used Conversation.convType instead of DbObject.id (wrong field)
            // 2. NPE when convType was null
            // 3. Returning view type 0 for fake conversations caused ClassCastException
            //    when the adapter tried to bind fake conversations as normal conversation views
            // Promotional items are now hidden by view-level patches (set GONE + zero height)
            // on each ConversationItem*View class, which is safe and doesn't interfere with
            // the adapter's view type mapping.

            // ConversationItem views: data-driven hiding
            val convItemHideBody = """
                const/16 v0, 0x8
                invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V
                const/4 v0, 0x0
                invoke-virtual {p0, v0}, Landroid/view/View;->setMinimumHeight(I)V
                invoke-virtual {p0, v0}, Landroid/view/View;->setMinimumWidth(I)V
                return-void
            """
            val convItemHideTargets = listOf(
                "Lcom/p1/mobile/putong/core/newui/messages/ConversationItemIntlReceiveLikeView;" to setOf("k"),
                "Lcom/p1/mobile/putong/core/newui/messages/ConversationItemReceiveLikeView;" to setOf("k"),
                "Lcom/p1/mobile/putong/core/newui/messages/ConversationItemInstantChatGuideView;" to setOf("m"),
                "Lcom/p1/mobile/putong/core/newui/messages/ConversationItemBlindBoxEntrance;" to setOf("e"),
                "Lcom/p1/mobile/putong/core/newui/messages/ConversationItemSurpriseBoxEntrance;" to setOf("f"),
                "Lcom/p1/mobile/putong/core/newui/messages/ConversationItemProfileLikeEntrance;" to setOf("i", "show", "display"),
                "Lcom/p1/mobile/putong/core/newui/messages/ConversationItemPlatinumPinLike;" to setOf("q"),
                "Lcom/p1/mobile/putong/core/newui/messages/ConversationItemFriendMoments;" to setOf("o", "p", "q"),
                "Lcom/p1/mobile/putong/core/newui/messages/ConversationItemTeamGroup;" to setOf("o"),
                "Lcom/p1/mobile/putong/core/newui/messages/ConversationWeakenView;" to setOf("d0"),
            )
            convItemHideTargets.forEach { (descriptor, methodNames) ->
                classDefByOrNull(descriptor)?.let { classDef ->
                    mutableClassDefBy(classDef).methods.forEach { method ->
                        if (method.name in methodNames && method.returnType == "V") {
                            method.addInstructions(0, convItemHideBody)
                        }
                        if (method.name in setOf("getSubFrontText", "getSubContentText") &&
                            method.parameterTypes.isEmpty() && method.returnType == "Ljava/lang/String;") {
                            method.addInstructions(0, """
                                const-string v0, ""
                                return-object v0
                            """)
                        }
                        if (method.name == "o" && method.parameterTypes.isEmpty() && method.returnType == "V") {
                            method.addInstructions(0, "return-void")
                        }
                    }
                }
            }

        // ----------------------------------------------------------------------
        // Pass 2: Batch resolution of obfuscated class fingerprints (unified)
        // ----------------------------------------------------------------------

        val resolver = getSharedResolver()

        val resolved = mutableMapOf<String, com.android.tools.smali.dexlib2.iface.ClassDef>()
        val premiumKeys = listOf(
            "xma", "qa9", "hva", "coreApiFakeConv", "profileLikeEnter", "greetingFakeConv",
            "feedStateFakeConv", "meetEntranceBanner", "instantChatGuide", "mainUiFakeConv",
            "coreApiTeamGroup", "coreApiLimitedTrialFold", "intlSeeChatRequestCreator", "r8n",
            "headRecommendAdapter", "seeAnimBubbleCreator", "sb90Companion", "u59", "tm90",
            "gqf0", "h6a", "ugc0", "zva0", "th5", "qgl0", "sja", "n3b0", "rbb0", "svipRecoverStrategy",
            "secretCrush", "greetingCounter", "swipeRateLimit",
            "leftSwipeLimit", "intlUltraPremium", "coreData", "mb90",
            "businessEntranceAdapter", "pm6", "bhe0", "vqo", "re90", "i0p",
            "meetNewLikersData", "intlMeetNewLikersData", "intlMeetNewLikersAdapter",
            "meetNewLikersAdapter", "ae9", "c4m0",
            "businessEntranceStateManager", "serverDataFlagSetter", "newLikesFlagSetter",
            "profilePageBanner", "suggestedUsersBanner", "themeUnlock", "profileImagesHolder"
        )
        for (key in premiumKeys) {
            resolver.getPremiumClass(key)?.let { resolved[key] = it }
        }

        resolved["xma"]?.let { xmaClassDef ->
            val mutableXma = mutableClassDefBy(xmaClassDef)
            val s3StyleKeys = setOf(
                "unlimitedSwipes", "roaming", "superLikeMembership", "undoMembership", "seeWhoLikedMe",
                "message_read_state", "top_like", "top_chat", "premium_compliment",
                "city_topping", "exclusive_dressing_up", "leave_message",
                "live_entry_animation", "block_harassing_words",
                "hide_me_from_nearby", "visitor_hide_footprint", "nearby_people",
            )
            val negatedKeys = setOf("ultraPremium", "platinum")
            // intlReadMessage/revokeUnPair removed: their gates H3/I3 are INSTANCE methods,
            // skipped by this static-only loop; Q3 forcing already yields the correct values
            // (H3 -> true read receipts, I3 -> true recall/unpair).
            val singleMethodKeys = mapOf(
                "svip" to false,
                "vip" to false
            )

            mutableXma.methods.forEach { method ->
                if (!AccessFlags.PUBLIC.isSet(method.accessFlags) || !AccessFlags.STATIC.isSet(method.accessFlags)) return@forEach
                when {
                    method.returnType == "Z" && method.parameterTypes.size == 1 &&
                        method.parameterTypes[0] == "Lcom/p1/mobile/putong/core/data/SummarizedPrivilegesId;" &&
                        method.callsGuessedCurrentServerTime() -> {
                        method.addInstructions(0, RETURN_FALSE)
                    }
                    method.returnType == "J" && method.parameterTypes.size == 1 &&
                        method.parameterTypes[0] == "Lcom/p1/mobile/putong/core/data/SummarizedPrivilegesId;" -> {
                        method.addInstructions(0, RETURN_LONG_MAX)
                    }
                    method.returnType == "Z" && method.parameterTypes.size == 1 &&
                        method.parameterTypes[0] == "Lcom/p1/mobile/putong/core/data/UserPrivilege;" &&
                        method.callsGuessedCurrentServerTime() -> {
                        method.addInstructions(0, RETURN_FALSE)
                    }
                    method.returnType == "Z" && method.parameterTypes.size == 1 &&
                        method.parameterTypes[0] == "Lcom/p1/mobile/putong/core/data/PurchaseType;" &&
                        method.containsString("unknown_") -> {
                        method.addInstructions(0, RETURN_FALSE)
                    }
                    method.isStaticSummarizedPrivilegesIdReturnBool() -> {
                        method.addInstructions(0, RETURN_TRUE)
                    }
                    method.isStaticUserPrivilegeReturnBool() -> {
                        method.addInstructions(0, RETURN_TRUE)
                    }
                    method.returnType == "J" && method.parameterTypes.isEmpty() && method.containsString("femaleVip") -> {
                        method.addInstructions(0, RETURN_LONG_MAX)
                    }
                    method.returnType == "J" && method.parameterTypes.isEmpty() && method.containsString("limitedTrialSee") -> {
                        method.addInstructions(0, RETURN_LONG_MAX)
                    }
                    method.returnType == "I" && method.parameterTypes.isEmpty() -> {
                        method.addInstructions(0, RETURN_INT_200000)
                    }
                    method.returnType == "Z" && method.parameterTypes.isEmpty() && method.containsString("oDiamond") -> {
                        when {
                            method.hasNegation() -> method.addInstructions(0, LOG_XMA_F3_TRUE)
                            method.callsMethodNamed("c4") -> method.addInstructions(0, LOG_XMA_Y3_TRUE)
                            else -> method.addInstructions(0, LOG_XMA_X3_FALSE)
                        }
                    }
                    method.returnType == "Z" && method.parameterTypes.isEmpty() -> {
                        when {
                            // Picks membership E3() = !(Q3(svipPicksMembership) && Q3(picksMembership)).
                            // Force "has membership": every freePicks paywall is guarded by !E3, so this
                            // also clears the freePicks-remaining gates on all Picks surfaces.
                            method.containsString("picksMembership") -> method.addInstructions(0, RETURN_TRUE)
                            method.containsExactString("letter") -> method.addInstructions(0, RETURN_TRUE)
                            // Top Picks AB-bucket gate J3() = (g5() || Lg()) && !c4(); force enabled so
                            // control-bucket accounts can like Top Picks (client gate; server authoritative).
                            method.callsCoreProviderAbFlag() -> method.addInstructions(0, RETURN_TRUE)
                            method.callsMethodNamed("h5") -> method.addInstructions(0, RETURN_TRUE)
                            method.callsMethodNamed("TEnum") -> method.addInstructions(0, RETURN_FALSE)
                            negatedKeys.any { method.containsString(it) } && method.hasNegation() -> method.addInstructions(0, RETURN_TRUE)
                            s3StyleKeys.any { method.containsString(it) } -> method.addInstructions(0, RETURN_FALSE)
                            else -> {
                                singleMethodKeys.entries.firstOrNull { (key, _) -> method.containsString(key) }?.let { (_, returnValue) ->
                                    method.addInstructions(0, if (returnValue) RETURN_TRUE else RETURN_FALSE)
                                }
                            }
                        }
                    }
                }
            }
        }

        resolved["qa9"]?.let { qa9ClassDef ->
            mutableClassDefBy(qa9ClassDef).methods.forEach { method ->
                if (method.name == "D3" && method.parameterTypes == listOf("Ljava/lang/String;", "J") && method.returnType == "V") {
                    method.addInstructions(0, "return-void")
                }
                if (method.name == "w3" && method.parameterTypes.isEmpty() && method.returnType == "V") {
                    method.addInstructions(0, "return-void")
                }
                if (method.name == "C3" && method.parameterTypes == listOf("Ljava/lang/String;", "J") && method.returnType == "V") {
                    method.addInstructions(0, "return-void")
                }
                if (method.name == "J3" && method.parameterTypes == listOf("Ljava/lang/String;") && method.returnType == "V") {
                    method.addInstructions(0, "return-void")
                }
                if (method.name == "E3" && method.parameterTypes == listOf("Ljava/lang/String;") && method.returnType == "V") {
                    method.addInstructions(0, "return-void")
                }
                if (method.name == "y3" && method.parameterTypes.size == 2 && method.returnType == "V") {
                    method.addInstructions(0, "return-void")
                }
            }
        }

        resolved["hva"]?.let { hvaClassDef ->
            mutableClassDefBy(hvaClassDef).methods.forEach { method ->
                if (method.name == "u3" && method.parameterTypes.isEmpty() && method.returnType == "V") {
                    method.addInstructions(0, "return-void")
                }
                if (method.name == "E3" && method.parameterTypes.size == 2 && method.returnType == "V") {
                    method.addInstructions(0, "return-void")
                }
            }
        }

        resolved["coreApiFakeConv"]?.let { coreApiClassDef ->
            mutableClassDefBy(coreApiClassDef).methods.forEach { method ->
                if (method.name == "Xb" && method.parameterTypes.size == 2 && method.returnType == "V") {
                    method.addInstructions(0, "return-void")
                }
                if (method.name == "o7" && method.parameterTypes.size == 1 && method.returnType == "V") {
                    method.addInstructions(0, "return-void")
                }
                if (method.name == "Ti" && method.parameterTypes.size == 4 && method.returnType == "V") {
                    method.addInstructions(0, "return-void")
                }
            }
        }

        resolved["profileLikeEnter"]?.let { profileLikeEnterClassDef ->
            mutableClassDefBy(profileLikeEnterClassDef).methods.forEach { method ->
                if (method.name == "n3" && method.parameterTypes.isEmpty() && method.returnType == "V") {
                    method.addInstructions(0, "return-void")
                }
            }
        }

        resolved["greetingFakeConv"]?.let { greetingClassDef ->
            mutableClassDefBy(greetingClassDef).methods.forEach { method ->
                if (method.name == "Q3" && method.parameterTypes.isEmpty() && method.returnType == "V") {
                    method.addInstructions(0, "return-void")
                }
            }
        }

        resolved["feedStateFakeConv"]?.let { feedStateClassDef ->
            mutableClassDefBy(feedStateClassDef).methods.forEach { method ->
                if (method.name == "o3" && method.parameterTypes.size == 1 && method.returnType == "V") {
                    method.addInstructions(0, "return-void")
                }
            }
        }

        resolved["meetEntranceBanner"]?.let { meetEntranceClassDef ->
            mutableClassDefBy(meetEntranceClassDef).methods.forEach { method ->
                if (method.name == "w" && method.parameterTypes.isEmpty() && method.returnType == "V") {
                    method.addInstructions(0, "return-void")
                }
            }
        }

        resolved["instantChatGuide"]?.let { instantChatClassDef ->
            mutableClassDefBy(instantChatClassDef).methods.forEach { method ->
                if (method.name == "n3" && method.parameterTypes.size == 1 && method.returnType == "V") {
                    method.addInstructions(0, RETURN_VOID)
                }
            }
        }

        resolved["mainUiFakeConv"]?.let { mainUiClassDef ->
            mutableClassDefBy(mainUiClassDef).methods.forEach { method ->
                if (method.name in setOf("Q3", "Xb", "o7") && method.parameterTypes.isEmpty() && method.returnType == "V") {
                    method.addInstructions(0, RETURN_VOID)
                }
            }
        }

        resolved["coreApiTeamGroup"]?.let { teamGroupClassDef ->
            mutableClassDefBy(teamGroupClassDef).methods.forEach { method ->
                if (method.name == "n3" && method.parameterTypes.size == 1 && method.returnType == "V") {
                    method.addInstructions(0, RETURN_VOID)
                }
            }
        }

        resolved["coreApiLimitedTrialFold"]?.let { limitedTrialClassDef ->
            mutableClassDefBy(limitedTrialClassDef).methods.forEach { method ->
                if (method.name == "n3" && method.parameterTypes.size == 1 && method.returnType == "V") {
                    method.addInstructions(0, RETURN_VOID)
                }
            }
        }

        resolved["intlSeeChatRequestCreator"]?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.name == "Vi" && method.parameterTypes.size == 1 && method.returnType == "V") {
                    method.addInstructions(0, RETURN_VOID)
                }
                if (method.name == "Wi" && method.parameterTypes.size == 1 && method.returnType == "V") {
                    method.addInstructions(0, RETURN_VOID)
                }
            }
        }

        resolved["r8n"]?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.name == "g" && method.parameterTypes.size == 1 &&
                    method.parameterTypes[0] == "Ljava/util/List;" && method.returnType == "V") {
                    method.addInstructions(0, RETURN_VOID)
                }
            }
        }

        // headRecommendAdapter patch removed: returning 0 for all view types causes ClassCastException
        // when the carousel adapter tries to bind fake conversations to normal conversation view holders.
        // Promotional content in the head recommend carousel is already suppressed by:
        // - ConversationHeadLikerItemLayout.u() → return-void
        // - ConversationHeadIntlSeeItem.L()/K()/M() → return-void

        resolved["seeAnimBubbleCreator"]?.let { bubbleCreatorClassDef ->
            mutableClassDefBy(bubbleCreatorClassDef).methods.forEach { method ->
                // Patch z2() - subscription state handler (static method)
                // DEX name is "z2" (JADX renames to m101873z2)
                if (method.name == "z2" && method.parameterTypes.size == 1 && method.returnType == "V" &&
                    AccessFlags.STATIC.isSet(method.accessFlags)) {
                    method.addInstructions(0, RETURN_VOID)
                }
                // Patch u7() - "new likers" bubble creator (instance method)
                // DEX name is "u7" (JADX renames to m102077u7)
                if (method.name == "u7" && method.parameterTypes.size == 1 && method.returnType == "V" &&
                    !AccessFlags.STATIC.isSet(method.accessFlags)) {
                    method.addInstructions(0, RETURN_VOID)
                }
                // Patch k8() - "total likers" bubble creator (instance method, returns boolean)
                // DEX name is "k8" (JADX renames to m102036k8)
                if (method.name == "k8" && method.parameterTypes.size == 1 && method.returnType == "Z" &&
                    !AccessFlags.STATIC.isSet(method.accessFlags)) {
                    method.addInstructions(0, RETURN_FALSE)
                }
                // Patch w7() - "suggested users" bubble path (instance method)
                // DEX name is "w7" (JADX renames to m102085w7)
                if (method.name == "w7" && method.parameterTypes.size == 1 && method.returnType == "V" &&
                    !AccessFlags.STATIC.isSet(method.accessFlags)) {
                    method.addInstructions(0, RETURN_VOID)
                }
            }
        }



        resolved["sja"]?.let { sjaClassDef ->
            sjaPicksRemainingFingerprint.matchAllOrNull(sjaClassDef).orEmpty().forEach { match ->
                match.method.preflightSmali(RETURN_INT_200000, 2)
                match.method.addInstructions(0, RETURN_INT_200000)
            }
        }

        // src0 patch removed

        resolved["gqf0"]?.let { gqf0ClassDef ->
            gqf0FFingerprint.matchAllOrNull(gqf0ClassDef).orEmpty().forEach { match -> match.method.addInstructions(0, RETURN_TRUE) }
        }

        resolved["h6a"]?.let { h6aClassDef ->
            h6aCFingerprint.matchAllOrNull(h6aClassDef).orEmpty().forEach { match -> match.method.addInstructions(0, RETURN_TRUE) }
        }

        resolved["u59"]?.let { u59ClassDef ->
            mutableClassDefBy(u59ClassDef).methods.forEach { method ->
                if (!AccessFlags.PUBLIC.isSet(method.accessFlags) || !AccessFlags.STATIC.isSet(method.accessFlags)) return@forEach
                when {
                    method.returnType == "Z" && method.parameterTypes.size == 1 &&
                        method.parameterTypes[0] == "Lcom/p1/mobile/putong/data/User;" &&
                        method.callsMethodNamed("isUltraPremium") -> {
                        method.addInstructions(0, U59_V_BODY)
                    }
                    method.returnType == "Z" && method.parameterTypes.isEmpty() &&
                        method.cachedInstructions().any { it is ReferenceInstruction && it.reference is MethodReference &&
                            (it.reference as MethodReference).definingClass == "Lcom/p1/mobile/putong/ab/IntlCountryCodeController;" &&
                            (it.reference as MethodReference).name in setOf("k", "l") } -> {
                        method.addInstructions(0, RETURN_TRUE)
                    }
                    method.returnType == "Z" && method.parameterTypes.isEmpty() &&
                        method.containsString("intl_instantmatch_open_user") -> {
                        method.addInstructions(0, RETURN_TRUE)
                    }
                }
            }
        }

        resolved["ugc0"]?.let { ugc0ClassDef ->
            ugc0KFingerprint.matchAllOrNull(ugc0ClassDef).orEmpty().forEach { match -> match.method.addInstructions(0, RETURN_TRUE) }
        }

        resolved["zva0"]?.let { zva0ClassDef ->
            zva0B0Fingerprint.matchAllOrNull(zva0ClassDef).orEmpty().forEach { match -> match.method.addInstructions(0, ZVA0_B0_BODY) }
            zva0SFingerprint.matchAllOrNull(zva0ClassDef).orEmpty().forEach { match -> match.method.addInstructions(0, RETURN_TRUE) }
        }

        resolved["th5"]?.let { th5ClassDef ->
            th5PurchaseDialogFingerprint.matchAllOrNull(th5ClassDef).orEmpty().forEach { match ->
                match.method.addInstructions(0, LOG_TH5_FALSE)
            }
        }

        resolved["qgl0"]?.let { qgl0ClassDef ->
            qgl0DFingerprint.matchAllOrNull(qgl0ClassDef).orEmpty().forEach { match -> match.method.addInstructions(0, QGL0_D_BODY) }
        }

        resolved["n3b0"]?.let { n3b0ClassDef ->
            mutableClassDefBy(n3b0ClassDef).methods.forEach { method ->
                if (!AccessFlags.STATIC.isSet(method.accessFlags)) return@forEach
                val instrs = method.cachedInstructions()
                when {
                    method.returnType == "Z" && method.parameterTypes.isEmpty() &&
                        instrs.any { it is ReferenceInstruction && it.reference is FieldReference &&
                            (it.reference as FieldReference).definingClass == "Lcom/p1/mobile/putong/data/LikersLimit;" &&
                            (it.reference as FieldReference).name == "remaining" } -> {
                        method.addInstructions(0, RETURN_FALSE)
                    }
                    method.returnType == "J" && method.parameterTypes.isEmpty() &&
                        instrs.any { it is ReferenceInstruction && it.reference is FieldReference &&
                            (it.reference as FieldReference).definingClass == "Lcom/p1/mobile/putong/data/LikersLimit;" &&
                            (it.reference as FieldReference).name == "expiresTime" } -> {
                        method.addInstructions(0, FAR_FUTURE_MS_BODY)
                    }
                    method.returnType == "I" && method.parameterTypes.size == 1 &&
                        method.parameterTypes[0] == "Lcom/p1/mobile/putong/data/Counter;" &&
                        instrs.any { it is ReferenceInstruction && it.reference is FieldReference &&
                            (it.reference as FieldReference).definingClass == "Lcom/p1/mobile/putong/data/Counter;" &&
                            (it.reference as FieldReference).name == "boostLimits" } -> {
                        method.addInstructions(0, RETURN_INT_200000)
                    }
                    method.returnType == "Z" && method.parameterTypes.isEmpty() &&
                        instrs.any { it is ReferenceInstruction && it.reference is FieldReference &&
                            (it.reference as FieldReference).definingClass == "Lcom/p1/mobile/putong/data/Counter;" &&
                            (it.reference as FieldReference).name == "boostLimits" } -> {
                        method.addInstructions(0, RETURN_TRUE)
                    }
                    method.returnType == "Z" && method.parameterTypes.isEmpty() &&
                        instrs.any { it is ReferenceInstruction && it.reference is MethodReference &&
                            (it.reference as MethodReference).name == "e" } -> {
                        method.addInstructions(0, RETURN_FALSE)
                    }
                }
            }
        }

        // rbb0: likers-quota gate (7.5.6.1 oth.c()Z / a()J / b()J, was gjc0.q/r/s/g/i).
        // Force the static no-arg ()Z quota gate TRUE (callers see 0 likers remaining -> no
        // "x people liked you" popups) and the static no-arg ()J expiry gates to 0L. Match by
        // shape, not the churned method names. The theme gate (themeUnlock/cj7.a) is forced
        // FALSE separately so theme cards stay unlocked despite the quota gate reporting exhausted.
        resolved["rbb0"]?.let { rbb0ClassDef ->
            mutableClassDefBy(rbb0ClassDef).methods.forEach { method ->
                if (!AccessFlags.STATIC.isSet(method.accessFlags)) return@forEach
                if (method.returnType == "Z" && method.parameterTypes.isEmpty()) {
                    method.addInstructions(0, RETURN_TRUE)
                }
                if (method.returnType == "Z" && method.parameterTypes.size == 1 &&
                    method.parameterTypes[0] == "Lcom/p1/mobile/putong/data/Counter;") {
                    method.addInstructions(0, RETURN_TRUE)
                }
                if (method.returnType == "J" && method.parameterTypes.isEmpty()) {
                    method.addInstructions(0, """
                        const-wide v0, 0x0
                        return-wide v0
                    """)
                }
            }
        }

        resolved["svipRecoverStrategy"]?.let { svipRecoverClassDef ->
            mutableClassDefBy(svipRecoverClassDef).methods.forEach { method ->
                if (AccessFlags.STATIC.isSet(method.accessFlags) || method.returnType != "Z" ||
                    method.parameterTypes.size != 1) return@forEach
                val hasRecoverKey = method.cachedInstructions().any { instr ->
                    instr is ReferenceInstruction && instr.reference is StringReference &&
                        (instr.reference as StringReference).string == "p_see_popup_expired_svip"
                }
                if (hasRecoverKey) {
                    method.preflightSmali(RETURN_FALSE, 2)
                    method.addInstructions(0, RETURN_FALSE)
                }
            }
        }

        // OmsPageAct: full-screen server-driven OMS "morph" promo container. Server
        // campaigns (e.g. "99+ people liked you / Waiting for your match", text absent
        // from local resources) render here via hn60.n -> OmsPageAct.Y1. Void b2() (reads
        // "oms_identifier" intent extra) and c2() (reads OmsMerCuryData.id) so d/e stay
        // null; r() then sees hn60.d(null)==false and self-finishes. Verification popups
        // use the inline OmsBaseRender.c0 branch, NOT this activity, so they stay intact.
        classDefByOrNull("Lcom/p1/mobile/putong/ui/oms/OmsPageAct;")?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.returnType != "V" || !method.parameterTypes.isEmpty()) return@forEach
                val instrs = method.cachedInstructions()
                val readsOmsIdentifier = instrs.any { instr ->
                    instr is ReferenceInstruction && instr.reference is StringReference &&
                        (instr.reference as StringReference).string == "oms_identifier"
                }
                val readsMercuryId = instrs.any { instr ->
                    instr is ReferenceInstruction && instr.reference is FieldReference &&
                        (instr.reference as FieldReference).definingClass == "Lcom/p1/mobile/putong/data/OmsMerCuryData;" &&
                        (instr.reference as FieldReference).name == "id"
                }
                if (readsOmsIdentifier || readsMercuryId) method.addInstructions(0, RETURN_VOID)
            }
        }

        // LikersDialogView: Dialog content populator
        // LikersDialogView.b(int, CoreLikers$a) populates dialog with likers data
        // LikersDialogView.c(List) populates dialog with photo URLs
        // Both are instance methods that return void. Patching to return-void prevents content.
        classDefByOrNull("Lcom/p1/mobile/putong/core/ui/vip/likers/LikersDialogView;")?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                // b(int, CoreLikers$a) → void
                if (method.name == "b" && method.parameterTypes.size == 2 &&
                    method.parameterTypes[0] == "I" &&
                    method.parameterTypes[1].contains("CoreLikers") &&
                    method.returnType == "V") {
                    method.addInstructions(0, RETURN_VOID)
                }
                // c(List) → void
                if (method.name == "c" && method.parameterTypes.size == 1 &&
                    method.parameterTypes[0] == "Ljava/util/List;" &&
                    method.returnType == "V") {
                    method.addInstructions(0, RETURN_VOID)
                }
            }
        }

        resolved["sb90Companion"]?.let { sb90CompanionClassDef ->
            sb90CFingerprint.matchAllOrNull(sb90CompanionClassDef).orEmpty().forEach { match -> match.method.addInstructions(0, LOG_SB90_FALSE) }
        }

        resolved["secretCrush"]?.let { secretCrushClassDef ->
            secretCrushRemainingFingerprint.matchAllOrNull(secretCrushClassDef).orEmpty().forEach { match -> match.method.addInstructions(0, RETURN_FALSE) }
            secretCrushExpirationFingerprint.matchAllOrNull(secretCrushClassDef).orEmpty().forEach { match -> match.method.addInstructions(0, FAR_FUTURE_MS_BODY) }
        }

        resolved["greetingCounter"]?.let { greetingCounterClassDef ->
            mutableClassDefBy(greetingCounterClassDef).methods.forEach { method ->
                val accessesGreetingCounterField = method.cachedInstructions().any { instr ->
                    instr is ReferenceInstruction &&
                        instr.reference is FieldReference &&
                        (instr.reference as FieldReference).definingClass == "Lcom/p1/mobile/putong/core/data/GreetingCounter;" &&
                        (instr.reference as FieldReference).name in setOf("remaining", "max", "replyThanksRemain")
                }
                if (!accessesGreetingCounterField) return@forEach
                when (method.returnType) {
                    "I" -> method.addInstructions(0, RETURN_INT_200000)
                    "Ljava/lang/Integer;" -> method.addInstructions(0, RETURN_INTEGER_200000)
                    "Z" -> method.addInstructions(0, RETURN_TRUE)
                }
            }
        }

        resolved["swipeRateLimit"]?.let { swipeRateLimitClassDef ->
            mutableClassDefBy(swipeRateLimitClassDef).methods.forEach { method ->
                val accessesEnableField = method.cachedInstructions().any { instr ->
                    instr is ReferenceInstruction &&
                        instr.reference is FieldReference &&
                        (instr.reference as FieldReference).definingClass == "Lcom/p1/mobile/putong/core/data/SwipeRateLimitConfig;" &&
                        (instr.reference as FieldReference).name == "enable"
                }
                if (!accessesEnableField) return@forEach
                if (method.returnType == "Z") {
                    method.addInstructions(0, RETURN_FALSE)
                }
            }
        }

        resolved["leftSwipeLimit"]?.let { leftSwipeLimitClassDef ->
            mutableClassDefBy(leftSwipeLimitClassDef).methods.forEach { method ->
                val accessesSwipeLimitField = method.cachedInstructions().any { instr ->
                    instr is ReferenceInstruction &&
                        instr.reference is FieldReference &&
                        (instr.reference as FieldReference).definingClass == "Lcom/p1/mobile/putong/core/data/LeftSwipeLimitConfig;" &&
                        (instr.reference as FieldReference).name == "swipeLimit"
                }
                if (!accessesSwipeLimitField) return@forEach
                if (method.returnType == "Lcom/p1/mobile/putong/core/data/PurchaseDialogConfigTrigger;") {
                    method.addInstructions(0, "const/4 v0, 0x0\nreturn-object v0")
                }
            }
        }

        resolved["intlUltraPremium"]?.let { intlUltraPremiumClassDef ->
            mutableClassDefBy(intlUltraPremiumClassDef).methods.forEach { method ->
                val accessesAndroidEnableField = method.cachedInstructions().any { instr ->
                    instr is ReferenceInstruction &&
                        instr.reference is FieldReference &&
                        (instr.reference as FieldReference).definingClass == "Lcom/p1/mobile/putong/core/data/IntlUltraPremiumConfig;" &&
                        (instr.reference as FieldReference).name == "androidEnable"
                }
                if (!accessesAndroidEnableField) return@forEach
                if (method.returnType == "Z") {
                    method.addInstructions(0, RETURN_TRUE)
                }
            }
        }

        resolved["coreData"]?.let { coreDataClassDef ->
            coreDataSurpriseGiftFingerprint.matchAllOrNull(coreDataClassDef).orEmpty().forEach { match -> match.method.addInstructions(0, RETURN_LONG_MAX) }
        }

        resolved["tm90"]?.let { tm90ClassDef ->
            tm90GFingerprint.matchAllOrNull(tm90ClassDef).orEmpty().forEach { match -> match.method.addInstructions(0, RETURN_FALSE) }
        }

        resolved["mb90"]?.let { mb90ClassDef ->
            mutableClassDefBy(mb90ClassDef).methods.forEach { method ->
                if (method.returnType == "Z" && AccessFlags.STATIC.isSet(method.accessFlags)) {
                    if (method.parameterTypes.size == 1 && method.parameterTypes[0] == "Lcom/p1/mobile/putong/core/data/PurchaseType;") {
                        method.addInstructions(0, RETURN_TRUE)
                    }
                    if (method.parameterTypes.size == 2 && method.parameterTypes[0] == "Lcom/p1/mobile/putong/data/User;" && method.parameterTypes[1] == "Lcom/p1/mobile/putong/core/data/PurchaseType;") {
                        method.addInstructions(0, RETURN_TRUE)
                    }
                }
            }
        }

        // joa patch removed: in 7.3.3 xma and joa are the same class, xma patch handles these methods

        resolver.getMeTabPagerClasses().forEach { classDef ->
            val pagerType = "Lcom/p1/mobile/putong/core/newui/profile/newme/NewProfilePrivilegedPager;"
            val pagerField = classDef.fields.firstOrNull { it.type == pagerType } ?: return@forEach
            val populateMethods = mutableClassDefBy(classDef).methods.filter {
                !AccessFlags.STATIC.isSet(it.accessFlags) && it.returnType == "V" &&
                    it.parameterTypes == listOf("Ljava/util/ArrayList;", "Z")
            }
            check(populateMethods.size == 1) {
                "meTabPager ${classDef.type}: expected 1 (ArrayList,Z)V method, found ${populateMethods.size}"
            }
            populateMethods.forEach { method ->
                val pagerHideBody = """
                    move-object/from16 v0, p0
                    iget-object v0, v0, ${classDef.type}->${pagerField.name}:$pagerType
                    if-eqz v0, :morph_done
                    const/16 v1, 0x8
                    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V
                    :morph_done
                    return-void
                """
                method.preflightSmali(pagerHideBody, 6)
                method.addInstructions(0, pagerHideBody)
            }
        }

        resolved["businessEntranceAdapter"]?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.name != "<init>" && method.name != "<clinit>" &&
                    method.returnType == "V" && method.parameterTypes.isEmpty()) {
                    method.addInstructions(0, RETURN_VOID)
                }
            }
        }

        // pm6: fromWhoLikedMe gate check
        // pm6.f(Conversation) returns true if conversation is a "fromWhoLikedMe" type
        // This is the international-specific gate that controls whether the "liked me" icon appears
        // Patching to return false prevents the icon from showing on conversation items
        resolved["pm6"]?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.name == "f" && method.parameterTypes.size == 1 &&
                    method.parameterTypes[0] == "Lcom/p1/mobile/putong/core/data/Conversation;" &&
                    method.returnType == "Z" && AccessFlags.STATIC.isSet(method.accessFlags)) {
                    method.addInstructions(0, RETURN_FALSE)
                }
            }
        }

        // bhe0: Business entrance navigation and analytics
        // bhe0.d() navigates to LikersAct/IntlMeetAct when user clicks the banner
        // bhe0.e()/f() fire analytics events for red dot display
        // Patching all to return-void prevents navigation and analytics tracking
        resolved["bhe0"]?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                // d(Context, boolean, BusinessEntranceStyle) → void (navigation)
                if (method.name == "d" && method.parameterTypes.size == 3 && method.returnType == "V" &&
                    AccessFlags.STATIC.isSet(method.accessFlags)) {
                    method.addInstructions(0, RETURN_VOID)
                }
                // e(boolean) → void (analytics event)
                if (method.name == "e" && method.parameterTypes.size == 1 && method.returnType == "V" &&
                    AccessFlags.STATIC.isSet(method.accessFlags)) {
                    method.addInstructions(0, RETURN_VOID)
                }
                // f() → void (analytics event)
                if (method.name == "f" && method.parameterTypes.isEmpty() && method.returnType == "V" &&
                    AccessFlags.STATIC.isSet(method.accessFlags)) {
                    method.addInstructions(0, RETURN_VOID)
                }
            }
        }

        resolved["vqo"]?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.name == "m" && method.parameterTypes.isEmpty() && method.returnType == "Ljava/lang/CharSequence;") {
                    method.addInstructions(0, """
                        const-string v0, ""
                        return-object v0
                    """)
                }
                if (method.name == "n" && method.parameterTypes.isEmpty() && method.returnType == "Ljava/lang/CharSequence;") {
                    method.addInstructions(0, """
                        const-string v0, ""
                        return-object v0
                    """)
                }
                if (method.name == "v" && method.returnType == "Landroid/util/Pair;") {
                    method.addInstructions(0, """
                        const-string v0, ""
                        const-string v1, ""
                        invoke-static {v0, v1}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;
                        move-result-object v0
                        return-object v0
                    """)
                }
            }
        }

        resolved["re90"]?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.name == "m" && method.parameterTypes.isEmpty() && method.returnType == "Ljava/lang/CharSequence;") {
                    method.addInstructions(0, """
                        const-string v0, ""
                        return-object v0
                    """)
                }
                if (method.name == "n" && method.parameterTypes.isEmpty() && method.returnType == "Ljava/lang/CharSequence;") {
                    method.addInstructions(0, """
                        const-string v0, ""
                        return-object v0
                    """)
                }
            }
        }

        resolved["i0p"]?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.name == "m" && method.parameterTypes.isEmpty() && method.returnType == "Ljava/lang/CharSequence;") {
                    method.addInstructions(0, """
                        const-string v0, ""
                        return-object v0
                    """)
                }
                if (method.name == "n" && method.parameterTypes.isEmpty() && method.returnType == "Ljava/lang/CharSequence;") {
                    method.addInstructions(0, """
                        const-string v0, ""
                        return-object v0
                    """)
                }
            }
        }



        // ajy: MeetLikersNewLikersData - patch getNewLikersCount() to return 0
        // The method returns int and accesses this.newLikersCount field
        resolved["meetNewLikersData"]?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.parameterTypes.isEmpty() && method.returnType == "I" && method.name != "hashCode") {
                    method.addInstructions(0, """
                        const/4 v0, 0x0
                        return v0
                    """)
                }
            }
        }

        // ano: IntlMeetLikersNewLikersData - patch getNewLikersCount() to return 0
        // The method returns int and accesses this.newLikersCount field
        resolved["intlMeetNewLikersData"]?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.parameterTypes.isEmpty() && method.returnType == "I" && method.name != "hashCode") {
                    method.addInstructions(0, """
                        const/4 v0, 0x0
                        return v0
                    """)
                }
            }
        }

        // zmo: IntlMeetLikersNewLikersAdapter - patch G(List) to return void
        // Prevents adapter from populating the new likers list
        resolved["intlMeetNewLikersAdapter"]?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.name == "G" && method.parameterTypes.size == 1 && method.parameterTypes[0] == "Ljava/util/List;" && method.returnType == "V") {
                    method.addInstructions(0, RETURN_VOID)
                }
            }
        }

        // ziy: MeetLikersNewLikersAdapter - patch J(DbLinks, List) to return void
        // Prevents adapter from populating the new likers list
        resolved["meetNewLikersAdapter"]?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.name == "J" && method.parameterTypes.size == 2 && method.parameterTypes[0] == "Lcom/p1/mobile/putong/data/DbLinks;" && method.parameterTypes[1] == "Ljava/util/List;" && method.returnType == "V") {
                    method.addInstructions(0, RETURN_VOID)
                }
            }
        }

        // ── Promotional label suppression (swipe/home tab) ─────────────────────
        // Force server-driven promotional boolean fields to false at the data level.
        // Kills "x people like you" / "She/He liked you" labels and overlays.
        //
        // Targets:
        // - CardInfos.momentLikedYou / boostLikeYou (protobuf + JSON parsing)
        // - CardModel.momentLikedYou / boostLikeYou (protobuf + JSON parsing)
        // - CoreSuggested$UserInfo.hasLikeMeSlideCardTop
        //
        // Approach: after every iput-byte that writes to a target field, inject
        // a second iput-byte that overwrites it with false (0). This catches all
        // write sites (protobuf parse, JSON parseField, copy/clone) without
        // needing to identify each individually.

        data class PromoFieldTarget(val classDesc: String, val fieldNames: Set<String>)

        val promoTargets = listOf(
            PromoFieldTarget(
                "Lcom/p1/mobile/putong/core/data/CardInfos;",
                setOf("momentLikedYou", "boostLikeYou")
            ),
            PromoFieldTarget(
                "Lcom/p1/mobile/putong/core/data/CardModel;",
                setOf("momentLikedYou", "boostLikeYou")
            ),
            PromoFieldTarget(
                "Lcom/p1/mobile/putong/core/api/CoreSuggested\$UserInfo;",
                setOf("hasLikeMeSlideCardTop")
            ),
        )

        for (target in promoTargets) {
            classDefByOrNull(target.classDesc)?.let { classDef ->
                mutableClassDefBy(classDef).methods.forEach { method ->
                    val instrs = method.cachedInstructions()
                    val writeIndices = instrs.withIndex().filter { (_, instr) ->
                        instr.opcode.name == "iput-byte" &&
                            instr is ReferenceInstruction &&
                            instr.reference is FieldReference &&
                            (instr.reference as FieldReference).name in target.fieldNames &&
                            (instr.reference as FieldReference).definingClass == target.classDesc
                    }.map { it.index }

                    if (writeIndices.isEmpty()) return@forEach

                    writeIndices.reversed().forEach { idx ->
                        val instr = instrs[idx]
                        if (instr is TwoRegisterInstruction) {
                            val objReg = instr.registerB
                            val fieldRef = (instr as ReferenceInstruction).reference as FieldReference
                            val tempReg = if (objReg != 0) "v0" else "v1"
                            method.addInstructions(idx + 1, """
                                const/4 $tempReg, 0x0
                                iput-byte $tempReg, v$objReg, ${fieldRef.definingClass}->${fieldRef.name}:${fieldRef.type}
                            """)
                        }
                    }
                }
            }
        }

        // ── 2. UltraRightsUpgradeInfo gates (7.5.6.1 zi3.G/H/I, was ae9.j3/k3) ──
        // Patch to return FALSE (suppress "upgrade to Ultra Premium" prompts).
        // Match by shape: instance ()Z reading isCanUpgradeUltra, static
        // (ProductCategory)Z, instance (PurchaseType)Z.
        resolved["ae9"]?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.returnType != "Z") return@forEach
                val isUpgradeGate = !AccessFlags.STATIC.isSet(method.accessFlags) &&
                    method.parameterTypes.isEmpty() &&
                    method.cachedInstructions().any { instr ->
                        instr is ReferenceInstruction && instr.reference is FieldReference &&
                            (instr.reference as FieldReference).definingClass == "Lcom/p1/mobile/putong/core/data/UltraRightsUpgradeInfo;" &&
                            (instr.reference as FieldReference).name == "isCanUpgradeUltra"
                    }
                val isCategoryGate = AccessFlags.STATIC.isSet(method.accessFlags) &&
                    method.parameterTypes == listOf("Lcom/p1/mobile/putong/core/data/ProductCategory;")
                val isPurchaseGate = !AccessFlags.STATIC.isSet(method.accessFlags) &&
                    method.parameterTypes == listOf("Lcom/p1/mobile/putong/core/data/PurchaseType;")
                if (isUpgradeGate || isCategoryGate || isPurchaseGate) {
                    method.preflightSmali(RETURN_FALSE, 2)
                    method.addInstructions(0, RETURN_FALSE)
                }
            }
        }

        // ── 5. VIP roaming location UI gate (7.5.6.1 yan.a, was c4m0/bun0.n) ──────
        // Patch the static (Act,String,String)Z roaming gate to TRUE (always allow roaming).
        // Param order changed (String,Act,String)->(Act,String,String); match by shape, not name.
        resolved["c4m0"]?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (AccessFlags.STATIC.isSet(method.accessFlags) &&
                    method.returnType == "Z" &&
                    method.parameterTypes.size == 3 &&
                    method.parameterTypes[0] == "Lcom/p1/mobile/android/app/Act;" &&
                    method.parameterTypes[1] == "Ljava/lang/String;" &&
                    method.parameterTypes[2] == "Ljava/lang/String;") {
                    method.addInstructions(0, RETURN_TRUE)
                }
            }
        }

        // ── 6. Business entrance state manager (b8d0 → hkd0) ──
        resolved["businessEntranceStateManager"]?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.name == "d" && method.parameterTypes.size == 2 && method.returnType == "Ljava/lang/CharSequence;" &&
                    AccessFlags.STATIC.isSet(method.accessFlags)) {
                    method.addInstructions(0, """
                        const-string v0, ""
                        return-object v0
                    """)
                }
                if (method.name == "e" && method.parameterTypes.size == 2 && method.returnType == "Ljava/lang/CharSequence;" &&
                    AccessFlags.STATIC.isSet(method.accessFlags)) {
                    method.addInstructions(0, """
                        const-string v0, ""
                        return-object v0
                    """)
                }
                if (method.name == "j" && method.parameterTypes.size == 1 && method.returnType == "Ljava/lang/CharSequence;" &&
                    AccessFlags.STATIC.isSet(method.accessFlags)) {
                    method.addInstructions(0, """
                        const-string v0, ""
                        return-object v0
                    """)
                }
                if (method.name == "g" && method.parameterTypes.isEmpty() && method.returnType == "Z" &&
                    !AccessFlags.STATIC.isSet(method.accessFlags)) {
                    method.addInstructions(0, RETURN_FALSE)
                }
                if (method.name == "i" && method.parameterTypes.isEmpty() && method.returnType == "V" &&
                    !AccessFlags.STATIC.isSet(method.accessFlags)) {
                    method.addInstructions(0, RETURN_VOID)
                }
                if (method.name == "k" && method.parameterTypes.size == 1 && method.returnType == "V" &&
                    !AccessFlags.STATIC.isSet(method.accessFlags)) {
                    method.addInstructions(0, RETURN_VOID)
                }
                if (method.name == "l" && method.parameterTypes.size == 1 && method.returnType == "V" &&
                    !AccessFlags.STATIC.isSet(method.accessFlags)) {
                    method.addInstructions(0, RETURN_VOID)
                }
            }
        }

        // ── 7. Server data flag setter (zt6 → mv6) ──
        resolved["serverDataFlagSetter"]?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.name == "S0" && method.parameterTypes.size == 1 && method.returnType == "V") {
                    method.addInstructions(0, RETURN_VOID)
                }
            }
        }

        // ── 8. New likes flag setter (lke0 → gxe0) ──
        resolved["newLikesFlagSetter"]?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.name == "G" && method.parameterTypes.size == 1 && method.returnType == "V") {
                    method.addInstructions(0, RETURN_VOID)
                }
            }
        }

        // ── 10. Profile page banner (n1b0) ──
        resolved["profilePageBanner"]?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.name == "l" && method.parameterTypes.isEmpty() && method.returnType == "Z") {
                    method.addInstructions(0, RETURN_FALSE)
                }
                if (method.name == "t" && method.parameterTypes.isEmpty() && method.returnType == "V") {
                    method.addInstructions(0, RETURN_VOID)
                }
            }
        }

        // ── 11. Suggested users banner (ela0) ──
        resolved["suggestedUsersBanner"]?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.name == "B" && method.parameterTypes.size == 4 && method.returnType == "V") {
                    method.addInstructions(0, RETURN_VOID)
                }
            }
        }

        resolved["profileImagesHolder"]?.let { classDef ->
            val target = classDef.methods.firstOrNull { m ->
                !AccessFlags.STATIC.isSet(m.accessFlags) && m.returnType == "V" && m.parameterTypes.isEmpty() &&
                    m.cachedInstructions().any { instr ->
                        instr is ReferenceInstruction && instr.reference is FieldReference &&
                            (instr.reference as FieldReference).definingClass == "Lcom/p1/mobile/putong/data/User;" &&
                            (instr.reference as FieldReference).name == "pictures"
                    } &&
                    m.cachedInstructions().any { instr ->
                        instr is ReferenceInstruction && instr.reference is MethodReference &&
                            (instr.reference as MethodReference).definingClass == "Lv/VPagerCircleIndicator;" &&
                            (instr.reference as MethodReference).name == "c"
                    }
            } ?: return@let
            val instrs = target.cachedInstructions()
            if (instrs.size < 3 ||
                instrs[0].opcode != Opcode.IGET_OBJECT ||
                instrs[1].opcode != Opcode.CHECK_CAST ||
                instrs[2].opcode != Opcode.INVOKE_INTERFACE
            ) return@let
            val fieldRef = (instrs[0] as ReferenceInstruction).reference as? FieldReference ?: return@let
            val typeRef = (instrs[1] as ReferenceInstruction).reference as? TypeReference ?: return@let
            val methodRef = (instrs[2] as ReferenceInstruction).reference as? MethodReference ?: return@let
            if (methodRef.returnType != "Lcom/p1/mobile/putong/data/User;" || !methodRef.parameterTypes.isEmpty()) return@let
            val nullGuardBody = """
                move-object/from16 v0, p0
                iget-object v0, v0, ${fieldRef.definingClass}->${fieldRef.name}:${fieldRef.type}
                check-cast v0, ${typeRef.type}
                invoke-interface {v0}, ${methodRef.definingClass}->${methodRef.name}(${methodRef.parameterTypes.joinToString("")})${methodRef.returnType}
                move-result-object v0
                if-eqz v0, :morph_guard_exit
                goto :morph_guard_continue
                :morph_guard_exit
                return-void
                :morph_guard_continue
            """
            val mutableTarget = mutableClassDefBy(classDef).methods
                .first { it.name == target.name && it.parameterTypes == target.parameterTypes }
            mutableTarget.preflightSmali(nullGuardBody, 8)
            mutableTarget.addInstructions(0, nullGuardBody)
        }

        // ── Discovery theme unlock (regression fix): j5k.a(String)Z ──
        // Our rbb0 patch forces gjc0.q() TRUE (quota exhausted) to suppress likers popups, which
        // also makes j5k.a true for "online"/"popular" theme cards -> SuggestUserItem blurs them
        // and routes taps to purchase. Force j5k.a FALSE so theme cards render clear + open chat.
        // Keep rbb0 q/r/s TRUE (60+ nag-suppression call sites). Resolved as the unique static
        // (String)Z caller of rbb0.q() carrying "online" (the online/popular strings alone are
        // ambiguous — qee0 theme-card helper shares them).
        resolved["themeUnlock"]?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (AccessFlags.STATIC.isSet(method.accessFlags) && method.returnType == "Z" &&
                    method.parameterTypes.size == 1 && method.parameterTypes[0] == "Ljava/lang/String;"
                ) {
                    method.addInstructions(0, RETURN_FALSE)
                }
            }
        }

        // ── Roaming location cap 5 -> unlimited (bun0.u) ──
        // The client cap is `const/4 v2,0x5; if-lt v0,v2 -> add` (size<5 skips the toast).
        // const/4 (1 unit) cannot become const/16 (2 units) in place, so replace the 2-unit
        // if-lt with a same-size goto/16 to the same target (always proceed to add). Server
        // remains authoritative for >5 saved locations (device-verify).
        val roamingCapFingerprint = Fingerprint(
            filters = listOf(string("passport_entrance"), string("e_add_roam_location"))
        )
        roamingCapFingerprint.matchOrNull()?.classDef?.let { classDef ->
            val mutable = mutableClassDefBy(classDef)
            val methodMap = classDef.methods.zip(mutable.methods).toMap()
            classDef.methods.forEach { method ->
                val instrs = method.cachedInstructions()
                val hasBoth = instrs.any { it is ReferenceInstruction && (it.reference as? StringReference)?.string == "passport_entrance" } &&
                    instrs.any { it is ReferenceInstruction && (it.reference as? StringReference)?.string == "e_add_roam_location" }
                if (!hasBoth) return@forEach
                val mutableMethod = methodMap[method] ?: return@forEach
                val mutableInstrs = mutableMethod.implementation?.instructions?.toList() ?: return@forEach
                for (i in 0 until instrs.size - 1) {
                    val cur = instrs[i]
                    val next = instrs[i + 1]
                    if (cur.opcode == Opcode.CONST_4 && cur is NarrowLiteralInstruction && cur.narrowLiteral == 5 &&
                        next.opcode == Opcode.IF_LT
                    ) {
                        val mutableNext = mutableInstrs.getOrNull(i + 1)
                        if (mutableNext is BuilderInstruction22t) {
                            mutableMethod.replaceInstruction(i + 1, BuilderInstruction20t(Opcode.GOTO_16, mutableNext.target))
                        }
                    }
                }
            }
        }

        // ── ProfileLike quota display: remaining/total -> 200000 (clone LikersLimit pattern) ──
        // Button appears; SEND remains server-quota-enforced. Override iput writes in the data
        // class and its protobuf/json adapters. nullCheck() is never touched (gotcha #8).
        listOf(
            "Lcom/p1/mobile/putong/data/ProfileLike;",
            "Lcom/p1/mobile/putong/data/ProfileLike\$1;",
            "Lcom/p1/mobile/putong/data/ProfileLike\$2;"
        ).forEach { descriptor ->
            classDefByOrNull(descriptor)?.let { classDef ->
                mutableClassDefBy(classDef).methods.forEach { method ->
                    if (method.name == "nullCheck") return@forEach
                    val instrs = method.cachedInstructions()
                    val writeIndices = instrs.withIndex().filter { (_, instr) ->
                        instr.opcode.name == "iput" &&
                            instr is ReferenceInstruction &&
                            instr.reference is FieldReference &&
                            (instr.reference as FieldReference).name in setOf("remaining", "total") &&
                            (instr.reference as FieldReference).definingClass == "Lcom/p1/mobile/putong/data/ProfileLike;"
                    }.map { it.index }
                    writeIndices.reversed().forEach { idx ->
                        val instr = instrs[idx]
                        if (instr is TwoRegisterInstruction) {
                            val objReg = instr.registerB
                            val fieldRef = (instr as ReferenceInstruction).reference as FieldReference
                            val tempReg = if (objReg != 0) "v0" else "v1"
                            method.addInstructions(idx + 1, """
                                const $tempReg, 0x30d40
                                iput $tempReg, v$objReg, ${fieldRef.definingClass}->${fieldRef.name}:${fieldRef.type}
                            """)
                        }
                    }
                }
            }
        }

        // ── Quick Chat tickets (onlinematch/a, stable descriptor) ──
        // b0() = remaining quickchatNumber privilege -> 200000 (S() carries quickchatSpeedUpNum,
        // a different literal, untouched). Clears the OnlineMatchManager s0()<=0 start gate
        // (s0 = b0 + coins). Server may validate ticket balance on match start — worst case
        // error toast / status quo; device-test starting a Quick Chat.
        // U() (active check, expiredTime >= now) -> true; V() (expired-for-male check,
        // expiredTime < now) -> false. Both carry "quickchatMembership"; distinguished by the
        // conditional branch direction immediately after cmp-long (U: if-ltz, V: if-gez).
        classDefByOrNull("Lcom/p1/mobile/putong/core/ui/onlinematch/a;")?.let { classDef ->
            val mutable = mutableClassDefBy(classDef)
            mutable.methods
                .filter {
                    AccessFlags.STATIC.isSet(it.accessFlags) && it.returnType == "I" &&
                        it.parameterTypes.isEmpty() && it.containsExactString("quickchatNumber")
                }
                .forEach {
                    it.preflightSmali(RETURN_INT_200000, 2)
                    it.addInstructions(0, RETURN_INT_200000)
                }
            val membershipMethods = mutable.methods.filter {
                AccessFlags.STATIC.isSet(it.accessFlags) && it.returnType == "Z" &&
                    it.parameterTypes.isEmpty() && it.containsExactString("quickchatMembership")
            }
            check(membershipMethods.size == 2) {
                "onlinematch/a quickchatMembership ()Z gates: expected 2 (U/V), found ${membershipMethods.size}"
            }
            membershipMethods.forEach { method ->
                val instrs = method.implementation?.instructions?.toList() ?: return@forEach
                val cmpIdx = instrs.indexOfFirst { it.opcode == Opcode.CMP_LONG }
                if (cmpIdx < 0 || cmpIdx + 1 >= instrs.size) return@forEach
                when (instrs[cmpIdx + 1].opcode) {
                    Opcode.IF_LTZ -> {
                        method.preflightSmali(RETURN_TRUE, 2)
                        method.addInstructions(0, RETURN_TRUE)
                    }
                    Opcode.IF_GEZ -> {
                        method.preflightSmali(RETURN_FALSE, 2)
                        method.addInstructions(0, RETURN_FALSE)
                    }
                    else -> {}
                }
            }
        }

        // REMOVED: ysa.g1, PremiumWeeklyGuideData.needGuide, SvipResumePurchase limits, FreeTrialConfig gates
        // These patches used unsafe mid-method injection (addInstructions(idx + 1, ...)) which corrupts
        // register state and causes app hangs on splash screen. The ysa.g1 patch also attempted to create
        // a new SwipeRateLimitConfig instance, which could fail if the constructor or field doesn't exist.
        // Safe patches that prepend at index 0 are retained above.

    }
}
