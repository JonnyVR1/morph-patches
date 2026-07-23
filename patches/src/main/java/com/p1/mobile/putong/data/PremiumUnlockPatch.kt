package com.p1.mobile.putong.data

import app.morphe.patcher.Fingerprint
import app.morphe.patcher.extensions.InstructionExtensions.addInstructions
import app.morphe.patcher.fieldAccess
import app.morphe.patcher.methodCall
import app.morphe.patcher.patch.bytecodePatch
import app.morphe.patcher.string
import com.android.tools.smali.dexlib2.AccessFlags
import com.android.tools.smali.dexlib2.iface.instruction.Instruction
import com.android.tools.smali.dexlib2.iface.instruction.ReferenceInstruction
import com.android.tools.smali.dexlib2.iface.reference.MethodReference
import com.android.tools.smali.dexlib2.iface.reference.StringReference

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

private const val RETURN_TRUE_WITH_ME_CHECK = """
    invoke-virtual {p0}, Lcom/p1/mobile/putong/data/User;->isMe()Z
    move-result v0
    if-eqz v0, :cond_0
    const/4 v0, 0x1
    return v0
    :cond_0
"""

private const val RETURN_FALSE_WITH_ME_CHECK = """
    invoke-virtual {p0}, Lcom/p1/mobile/putong/data/User;->isMe()Z
    move-result v0
    if-eqz v0, :cond_0
    const/4 v0, 0x0
    return v0
    :cond_0
"""

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

private val PIB_G9_BODY: String = """
    if-eqz p1, :user_null
    iget-object v0, p1, Lcom/p1/mobile/putong/data/User;->membership:Lcom/p1/mobile/putong/data/Membership;
    if-eqz v0, :membership_null
    const/4 v1, 0x1
    iput-boolean v1, v0, Lcom/p1/mobile/putong/data/Membership;->active:Z
    :membership_null
    :user_null
"""

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

// ProfileImagesItemHolder.t(): defensive null-K2 guard
//
// `t()` is the holder's bind method. It reads `User userK2 = O().K2()` and
// then `arrayList.addAll(userK2.pictures)` (NPE site: `iget-object v5, v0,
// User->pictures` at offset ~14 of the original body). On a first-frame
// cache miss, RxJava combineLatest can dispatch the bind call before the
// second source has emitted, so K2() returns null and `t()` NPEs.
//
// Real Tantan doesn't hit this because the production fragment gates the
// bind call behind `viewModel.user.distinctUntilChanged()` etc. — but our
// patches have shifted timing enough that the race is visible in the
// patched build.
//
// Patch shape: load K2() into v1, branch over the original body if null.
// `goto :t_continue` falls through to the original body's first instruction
// when v1 != 0. v1 is overwritten by the original body at offset 5
// (`move-result-object v1` after the second O() call) so no register
// conflict; `.registers 8` stays unchanged.
//
// Mirrors the original bytecode 1:1 (including the `Ll/c5m;` interface
// dispatch for K2()) so behavior is byte-identical when K2() != null.
private val PROFILE_IMAGES_NULL_GUARD_BODY: String = """
    invoke-virtual {p0}, Lcom/p1/mobile/putong/core/ui/profile/profilelist/itemholders/ProfileImagesItemHolder;->O()Ll/a1m;
    move-result-object v0
    invoke-interface {v0}, Ll/c5m;->K2()Lcom/p1/mobile/putong/data/User;
    move-result-object v1
    if-eqz v1, :t_early_exit
    goto :t_continue
    :t_early_exit
    return-void
    :t_continue
"""

// ── Class-level fingerprints (resolve obfuscated classes by stable strings /
//    field-access / method-call anchors) ──

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

private val src0ClassFingerprint = Fingerprint(
    filters = listOf(
        string("recall_dlg_show"),
        string("reauto_duration"),
        string("reauto_product"),
        string("if_auto_order"),
    ),
)

private val sjaClassFingerprint = Fingerprint(
    filters = listOf(
        string("picksUser id is not found in users : "),
    ),
)

private val pibClassFingerprint = Fingerprint(
    filters = listOf(
        string("/antispam/guide-change-avatar"),
    ),
)

// mb90.c() is the only method that BOTH calls User.isVIP and reads
// PurchaseType.TYPE_ROAMING_PKG; that combination is unique to mb90.
private val mb90ClassFingerprint = Fingerprint(
    filters = listOf(
        methodCall(definingClass = "Lcom/p1/mobile/putong/data/User;", name = "isVIP"),
        fieldAccess(
            definingClass = "Lcom/p1/mobile/putong/core/data/PurchaseType;",
            name = "TYPE_ROAMING_PKG",
        ),
    ),
)

// ── Stable-class fingerprints ──

private val userIsUltraPremiumFingerprint = Fingerprint(
    accessFlags = listOf(AccessFlags.PUBLIC),
    returnType = "Z",
    parameters = emptyList(),
)

private val userIsMembershipFingerprint = Fingerprint(
    accessFlags = listOf(AccessFlags.PUBLIC),
    returnType = "Z",
    parameters = listOf("Lcom/p1/mobile/putong/data/MembershipType;"),
)

private val userNullCheckFingerprint = Fingerprint(
    accessFlags = listOf(AccessFlags.PUBLIC),
    returnType = "V",
    parameters = emptyList(),
)

private val userGetVipExpireFingerprint = Fingerprint(
    accessFlags = listOf(AccessFlags.PUBLIC),
    returnType = "J",
    parameters = emptyList(),
)

private val coreProductU4Fingerprint = Fingerprint(
    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.FINAL),
    returnType = "Z",
    parameters = listOf("Ljava/lang/String;"),
)

private val coreProductZ4Fingerprint = Fingerprint(
    accessFlags = listOf(AccessFlags.PUBLIC),
    returnType = "Z",
    parameters = emptyList(),
)

private val counterSuperlikeFingerprint = Fingerprint(
    accessFlags = listOf(AccessFlags.PUBLIC),
    returnType = "I",
    parameters = emptyList(),
)

// ── CoreBusinessServiceIml: only the first 3 parameter types are stable ──

private val coreBusinessLfFingerprint = Fingerprint(
    accessFlags = listOf(AccessFlags.PUBLIC),
    returnType = "V",
    parameters = listOf(
        "Lcom/p1/mobile/android/app/Act;",
        "Ljava/lang/String;",
        "Lcom/p1/mobile/putong/core/data/Privilege;",
        "L",
        "L",
    ),
)

private val coreBusinessR6Fingerprint = Fingerprint(
    accessFlags = listOf(AccessFlags.PUBLIC),
    returnType = "V",
    parameters = listOf(
        "Lcom/p1/mobile/android/app/Act;",
        "Ljava/lang/String;",
        "Lcom/p1/mobile/putong/core/data/Privilege;",
        "L",
        "L",
    ),
)

private val coreBusinessSlFingerprint = Fingerprint(
    accessFlags = listOf(AccessFlags.PUBLIC),
    returnType = "V",
    parameters = listOf(
        "Lcom/p1/mobile/android/app/Act;",
        "Ljava/lang/String;",
        "Lcom/p1/mobile/putong/core/data/Privilege;",
        "L",
        "Ljava/lang/Object;",
    ),
)

// ── xma method fingerprints (grouped by behavior) ──

// Expiry-checker (static SummarizedPrivilegesId → Z, calls guessedCurrentServerTime): patch → false
private val xmaS3Fingerprint = Fingerprint(
    classFingerprint = xmaClassFingerprint,
    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.STATIC),
    returnType = "Z",
    parameters = listOf("Lcom/p1/mobile/putong/core/data/SummarizedPrivilegesId;"),
    filters = listOf(methodCall(name = "guessedCurrentServerTime")),
)

// Expiry-reader (static SummarizedPrivilegesId → J): patch → MAX. Matches v3 and w3.
private val xmaV3W3Fingerprint = Fingerprint(
    classFingerprint = xmaClassFingerprint,
    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.STATIC),
    returnType = "J",
    parameters = listOf("Lcom/p1/mobile/putong/core/data/SummarizedPrivilegesId;"),
)

// Long timestamp wrappers (static no-arg → J). q3 → femaleVip, s3 → limitedTrialSee.
private val xmaQ3Fingerprint = Fingerprint(
    classFingerprint = xmaClassFingerprint,
    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.STATIC),
    returnType = "J",
    parameters = emptyList(),
    filters = listOf(string("femaleVip")),
)

private val xmaS3LongWrapperFingerprint = Fingerprint(
    classFingerprint = xmaClassFingerprint,
    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.STATIC),
    returnType = "J",
    parameters = emptyList(),
    filters = listOf(string("limitedTrialSee")),
)

// Instance expiry check (static UserPrivilege → Z, calls guessedCurrentServerTime): patch → false
private val xmaT3Fingerprint = Fingerprint(
    classFingerprint = xmaClassFingerprint,
    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.STATIC),
    returnType = "Z",
    parameters = listOf("Lcom/p1/mobile/putong/core/data/UserPrivilege;"),
    filters = listOf(methodCall(name = "guessedCurrentServerTime")),
)

// Purchase expiry (static PurchaseType → Z, loads "unknown_"/"svip"): patch → false
private val xmaA4Fingerprint = Fingerprint(
    classFingerprint = xmaClassFingerprint,
    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.STATIC),
    returnType = "Z",
    parameters = listOf("Lcom/p1/mobile/putong/core/data/PurchaseType;"),
    filters = listOf(string("unknown_")),
)

// Server refresh (instance no-arg → Lrx/c;): patch → null. Matches u4 and x4.
private val xmaServerRefreshFingerprint = Fingerprint(
    classFingerprint = xmaClassFingerprint,
    accessFlags = listOf(AccessFlags.PUBLIC),
    returnType = "Lrx/c;",
    parameters = emptyList(),
    filters = listOf(string("/summarized-privileges")),
)

// L3 (static no-arg → Z, calls ura.e().d().h5()): patch → true
private val xmaL3Fingerprint = Fingerprint(
    classFingerprint = xmaClassFingerprint,
    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.STATIC),
    returnType = "Z",
    parameters = emptyList(),
    filters = listOf(methodCall(name = "h5")),
)

// m4 (static no-arg → Z, loads "vip"): patch → true (VIP override)
private val xmaM4Fingerprint = Fingerprint(
    classFingerprint = xmaClassFingerprint,
    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.STATIC),
    returnType = "Z",
    parameters = emptyList(),
    filters = listOf(string("vip")),
)

// J3 (instance no-arg → Z, loads "intlReadMessage"): patch → true
private val xmaJ3Fingerprint = Fingerprint(
    classFingerprint = xmaClassFingerprint,
    accessFlags = listOf(AccessFlags.PUBLIC),
    returnType = "Z",
    parameters = emptyList(),
    filters = listOf(string("intlReadMessage")),
)

// K3 (instance no-arg → Z, loads "revokeUnPair"): patch → false
private val xmaK3Fingerprint = Fingerprint(
    classFingerprint = xmaClassFingerprint,
    accessFlags = listOf(AccessFlags.PUBLIC),
    returnType = "Z",
    parameters = emptyList(),
    filters = listOf(string("revokeUnPair")),
)

// S3-style wrappers (static no-arg → Z, unique product key): patch → false
private val xmaWrapperW3Fingerprint = Fingerprint(
    classFingerprint = xmaClassFingerprint,
    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.STATIC),
    returnType = "Z",
    parameters = emptyList(),
    filters = listOf(string("unlimitedSwipes")),
)

// oDiamond methods (F3, X3, Y3) are handled by direct iteration below
// because they all contain the "oDiamond" string and need to be distinguished
// by bytecode shape (see the oDiamond methods section in the xma patch block).

private val xmaWrapperD4Fingerprint = Fingerprint(
    classFingerprint = xmaClassFingerprint,
    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.STATIC),
    returnType = "Z",
    parameters = emptyList(),
    filters = listOf(string("roaming")),
)

private val xmaWrapperI4Fingerprint = Fingerprint(
    classFingerprint = xmaClassFingerprint,
    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.STATIC),
    returnType = "Z",
    parameters = emptyList(),
    filters = listOf(string("superLikeMembership")),
)

private val xmaWrapperL4Fingerprint = Fingerprint(
    classFingerprint = xmaClassFingerprint,
    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.STATIC),
    returnType = "Z",
    parameters = emptyList(),
    filters = listOf(string("undoMembership")),
)

private val xmaWrapperH4Fingerprint = Fingerprint(
    classFingerprint = xmaClassFingerprint,
    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.STATIC),
    returnType = "Z",
    parameters = emptyList(),
    filters = listOf(string("seeWhoLikedMe")),
)

private val xmaWrapperJ4Fingerprint = Fingerprint(
    classFingerprint = xmaClassFingerprint,
    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.STATIC),
    returnType = "Z",
    parameters = emptyList(),
    filters = listOf(string("ultraPremium")),
)

private val xmaWrapperZ3Fingerprint = Fingerprint(
    classFingerprint = xmaClassFingerprint,
    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.STATIC),
    returnType = "Z",
    parameters = emptyList(),
    filters = listOf(string("platinum")),
)

private val xmaWrapperB3Fingerprint = Fingerprint(
    classFingerprint = xmaClassFingerprint,
    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.STATIC),
    returnType = "Z",
    parameters = emptyList(),
    filters = listOf(methodCall(name = "TEnum")),
)

// e4 and f4 both load "svip"; patches both → false
private val xmaWrapperSvipFingerprint = Fingerprint(
    classFingerprint = xmaClassFingerprint,
    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.STATIC),
    returnType = "Z",
    parameters = emptyList(),
    filters = listOf(string("svip")),
)

// Credit-count methods (static no-arg → I): patch → 200000
private val xmaCreditCountFingerprint = Fingerprint(
    classFingerprint = xmaClassFingerprint,
    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.STATIC),
    returnType = "I",
    parameters = emptyList(),
)

// ── Other class fingerprints ──

// sja: picks remaining count (static no-arg → I). Matches both r3 and B3.
private val sjaPicksRemainingFingerprint = Fingerprint(
    classFingerprint = sjaClassFingerprint,
    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.STATIC),
    returnType = "I",
    parameters = emptyList(),
)

private val src0WDaysRemainingFingerprint = Fingerprint(
    classFingerprint = src0ClassFingerprint,
    accessFlags = listOf(AccessFlags.PUBLIC),
    returnType = "J",
    parameters = emptyList(),
    filters = listOf(
        string("svip"),
        methodCall(name = "guessedCurrentServerTime"),
        methodCall(name = "getVipExpireTime"),
    ),
)

private val src0XDaysRemainingFingerprint = Fingerprint(
    classFingerprint = src0ClassFingerprint,
    accessFlags = listOf(AccessFlags.PUBLIC),
    returnType = "J",
    parameters = listOf("Lcom/p1/mobile/putong/core/data/SummarizedPrivilegesId;"),
    filters = listOf(
        string("svip"),
        string("oDiamond"),
        methodCall(name = "guessedCurrentServerTime"),
        methodCall(name = "getVipExpireTime"),
    ),
)

// gqf0: spotlight pass-through. The single static no-arg Z method (f()) → true.
private val gqf0FFingerprint = Fingerprint(
    classFingerprint = gqf0ClassFingerprint,
    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.STATIC),
    returnType = "Z",
    parameters = emptyList(),
)

// h6a: pricing restriction (static no-arg → Z): patch → true.
private val h6aCFingerprint = Fingerprint(
    classFingerprint = h6aClassFingerprint,
    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.STATIC),
    returnType = "Z",
    parameters = emptyList(),
)

// u59: regional gates. U/S/O/F/Z/a0/D all gate on IntlCountryCodeController.k()
// (returns true when NOT in a restricted region). We force all to true
// so premium tier availability is unconditional.
private val u59RegionalGateFingerprint = Fingerprint(
    classFingerprint = u59ClassFingerprint,
    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.STATIC),
    returnType = "Z",
    parameters = emptyList(),
    filters = listOf(
        methodCall(
            definingClass = "Lcom/p1/mobile/putong/ab/IntlCountryCodeController;",
            name = "k",
        ),
    ),
)

// u59.R() — instant-match open-user gate. Unique config key.
private val u59RFingerprint = Fingerprint(
    classFingerprint = u59ClassFingerprint,
    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.STATIC),
    returnType = "Z",
    parameters = emptyList(),
    filters = listOf(string("intl_instantmatch_open_user")),
)

private val u59VFingerprint = Fingerprint(
    classFingerprint = u59ClassFingerprint,
    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.STATIC),
    returnType = "Z",
    parameters = listOf("Lcom/p1/mobile/putong/data/User;"),
    filters = listOf(methodCall(name = "isUltraPremium")),
)

// ugc0.k(PurchaseType) → true (subscription upgraded).
private val ugc0KFingerprint = Fingerprint(
    classFingerprint = ugc0ClassFingerprint,
    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.STATIC),
    returnType = "Z",
    parameters = listOf("Lcom/p1/mobile/putong/core/data/PurchaseType;"),
)

// zva0.B0(User) → tier rank (3 = Ultra Premium) when current user, 0 otherwise.
private val zva0B0Fingerprint = Fingerprint(
    classFingerprint = zva0ClassFingerprint,
    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.FINAL),
    returnType = "I",
    parameters = listOf("Lcom/p1/mobile/putong/data/User;"),
    filters = listOf(methodCall(name = "isUltraPremium")),
)

// zva0.S() → true (show banner)
private val zva0SFingerprint = Fingerprint(
    classFingerprint = zva0ClassFingerprint,
    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.FINAL),
    returnType = "Z",
    parameters = emptyList(),
)

// th5: any static no-arg Z that references "showPurchaseDialog" → false (d/f/h).
private val th5PurchaseDialogFingerprint = Fingerprint(
    classFingerprint = th5ClassFingerprint,
    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.STATIC),
    returnType = "Z",
    parameters = emptyList(),
    filters = listOf(string("showPurchaseDialog")),
)

// qgl0.d(UserPrivilege) → String: fix expiredTime when 0.
private val qgl0DFingerprint = Fingerprint(
    classFingerprint = qgl0ClassFingerprint,
    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.STATIC),
    returnType = "Ljava/lang/String;",
    parameters = listOf("Lcom/p1/mobile/putong/core/data/UserPrivilege;"),
)

// n3b0.q() → false (likers limit not exceeded)
private val n3b0QFingerprint = Fingerprint(
    classFingerprint = n3b0ClassFingerprint,
    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.STATIC),
    returnType = "Z",
    parameters = emptyList(),
    filters = listOf(
        fieldAccess(
            definingClass = "Lcom/p1/mobile/putong/data/LikersLimit;",
            name = "remaining",
        ),
    ),
)

// n3b0.g() → far-future timestamp
private val n3b0GFingerprint = Fingerprint(
    classFingerprint = n3b0ClassFingerprint,
    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.STATIC),
    returnType = "J",
    parameters = emptyList(),
    filters = listOf(
        fieldAccess(
            definingClass = "Lcom/p1/mobile/putong/data/LikersLimit;",
            name = "expiresTime",
        ),
    ),
)

// sb90 (Companion).c(User) → false. Outer sb90 just delegates, so patching
// Companion alone is sufficient.
private val sb90CFingerprint = Fingerprint(
    classFingerprint = sb90CompanionClassFingerprint,
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
    classFingerprint = tm90ClassFingerprint,
    accessFlags = listOf(AccessFlags.PUBLIC),
    returnType = "Z",
    parameters = listOf("Lcom/p1/mobile/putong/data/User;"),
)

// mb90.b(PurchaseType) → true (purchase active)
private val mb90BFingerprint = Fingerprint(
    classFingerprint = mb90ClassFingerprint,
    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.STATIC),
    returnType = "Z",
    parameters = listOf("Lcom/p1/mobile/putong/core/data/PurchaseType;"),
)

// mb90.c(User, PurchaseType) → true
private val mb90CFingerprint = Fingerprint(
    classFingerprint = mb90ClassFingerprint,
    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.STATIC),
    returnType = "Z",
    parameters = listOf(
        "Lcom/p1/mobile/putong/data/User;",
        "Lcom/p1/mobile/putong/core/data/PurchaseType;",
    ),
)

// pib.W9(String) → null (server refresh no-op)
private val pibW9Fingerprint = Fingerprint(
    classFingerprint = pibClassFingerprint,
    accessFlags = listOf(AccessFlags.PUBLIC),
    returnType = "Lrx/c;",
    parameters = listOf("Ljava/lang/String;"),
)

// pib.g9(String, User) → flip Membership.active to true before downstream emit
private val pibG9Fingerprint = Fingerprint(
    classFingerprint = pibClassFingerprint,
    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.FINAL),
    returnType = "V",
    parameters = listOf("Ljava/lang/String;", "Lcom/p1/mobile/putong/data/User;"),
    filters = listOf(
        fieldAccess(
            definingClass = "Lcom/p1/mobile/putong/data/Membership;",
            name = "active",
            type = "Z",
        ),
    ),
)

// ── Helpers ──────────────────────────────────────────────────────────────────

private fun instructionsOf(method: com.android.tools.smali.dexlib2.iface.Method): Iterable<Instruction> =
    method.implementation?.instructions ?: emptyList()

private fun com.android.tools.smali.dexlib2.iface.Method.callsGuessedCurrentServerTime(): Boolean {
    return instructionsOf(this).any { instr ->
        instr is ReferenceInstruction &&
            instr.reference is MethodReference &&
            (instr.reference as MethodReference).name == "guessedCurrentServerTime"
    }
}

private fun com.android.tools.smali.dexlib2.iface.Method.callsU4WithString(): Boolean {
    // Check if this method calls u4(String) - the upgrade dialog gate pattern
    // u4 is the only public final Z(String) method in CoreProduct
    return try {
        this.implementation?.instructions?.any { instr ->
            instr is ReferenceInstruction &&
                instr.reference is MethodReference &&
                (instr.reference as MethodReference).definingClass == "Lcom/p1/mobile/putong/core/api/CoreProduct;" &&
                (instr.reference as MethodReference).parameterTypes.size == 1 &&
                (instr.reference as MethodReference).parameterTypes[0] == "Ljava/lang/String;" &&
                (instr.reference as MethodReference).returnType == "Z"
        } ?: false
    } catch (e: Exception) {
        false
    }
}

private fun com.android.tools.smali.dexlib2.iface.Method.hasNegation(): Boolean {
    // Check if this method has a negation instruction (xor-int/lit8 or not-int)
    // Used to distinguish F3() which has !S3(...) from X3() which has S3(...)
    return try {
        this.implementation?.instructions?.any { instr ->
            val opcode = instr.opcode
            // xor-int/lit8 is used for boolean negation (!value)
            // not-int is another form of bitwise NOT
            opcode.name == "xor-int/lit8" || opcode.name == "not-int"
        } ?: false
    } catch (e: Exception) {
        false
    }
}

private fun com.android.tools.smali.dexlib2.iface.Method.callsMethodNamed(methodName: String): Boolean {
    // Check if this method calls another method with the given name
    return try {
        this.implementation?.instructions?.any { instr ->
            instr is ReferenceInstruction &&
                instr.reference is MethodReference &&
                (instr.reference as MethodReference).name == methodName
        } ?: false
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
    instructionsOf(this).any { instr ->
        instr is ReferenceInstruction &&
            instr.reference is StringReference &&
            (instr.reference as StringReference).string == str
    }

private fun com.android.tools.smali.dexlib2.iface.Method.instructionCount(): Int =
    this.implementation?.instructions?.count() ?: 0

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
        // Pass 1: Stable classes — match by exact class descriptor
        //
        // Obfuscated class blocks are intentionally NOT resolved here. The
        // global `matchOrNull()` accessor on `Fingerprint` caches its result
        // on the first call, so it MUST only be called once per obfuscated
        // class. Pass 2 resolves each obfuscated class exactly once.
        // ----------------------------------------------------------------------
        classDefForEach { classDef ->
            // ── User: stable, real method names (no obfuscation) ──────────────
            //
            // We patch methods directly here (no fingerprint) because the same
            // `Fingerprint._matchOrNull` cache trap as in CoreProduct would
            // cause `matchOrNull(method)` to return the first match in each
            // set (e.g. isUltraPremium) for every subsequent call (e.g.
            // isSupremePartner), so only the first method in each `setOf(...)`
            // would actually get patched.
            if (classDef.type == TANTAN_USER_CLASS) {
                mutableClassDefBy(classDef).methods.forEach { method ->
                    when {
                        method.name in setOf("isUltraPremium", "isSupremePartner") &&
                            method.parameterTypes.isEmpty() && method.returnType == "Z" -> {
                            method.addInstructions(0, RETURN_TRUE_WITH_ME_CHECK)
                        }
                         // isVIP/isSVIP/isPlatinum: Ultra Premium is a superset that includes all
                         // VIP/SVIP/Platinum features. The app uses isVIP() as a baseline premium
                         // check across 50+ call sites (hide-last-seen, super likes, roaming, etc.).
                         // Returning FALSE broke all those features. Badge display (zva0.B0()) checks
                         // isUltraPremium() FIRST, so returning TRUE here doesn't affect badge precedence.
                         method.name in setOf("isVIP", "isSVIP", "isPlatinum") &&
                             method.parameterTypes.isEmpty() && method.returnType == "Z" -> {
                             method.addInstructions(0, RETURN_TRUE_WITH_ME_CHECK)
                         }
                        method.name in setOf("gpHideVip", "isHideIconFromSVipWithMe") &&
                            method.parameterTypes.isEmpty() && method.returnType == "Z" -> {
                            method.addInstructions(0, RETURN_FALSE_WITH_ME_CHECK)
                        }

                        method.name == "isVIPExpired" &&
                            method.parameterTypes.isEmpty() && method.returnType == "Z" -> {
                            method.addInstructions(0, RETURN_FALSE)
                        }
                        method.name == "isVIPUsed" &&
                            method.parameterTypes.isEmpty() && method.returnType == "Z" -> {
                            method.addInstructions(0, RETURN_TRUE_WITH_ME_CHECK)
                        }
                        method.name in setOf("getVipExpireTime", "getVipToExpireTimeInMill") &&
                            method.parameterTypes.isEmpty() && method.returnType == "J" -> {
                            method.addInstructions(0, GET_VIP_EXPIRE_FAR_FUTURE_BODY)
                        }
                        method.name == "isMembership" -> {
                            method.addInstructions(0, RETURN_TRUE_WITH_ME_CHECK)
                        }
                        method.name == "isMembershipUsed" -> {
                            method.addInstructions(0, RETURN_FALSE_WITH_ME_CHECK)
                        }
                        method.name == "nullCheck" &&
                            method.parameterTypes.isEmpty() && method.returnType == "V" -> {
                            method.addInstructions(0, USER_NULL_CHECK_BODY)
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
            if (classDef.type == "Lcom/p1/mobile/putong/core/api/CoreProduct;") {
                mutableClassDefBy(classDef).methods.forEach { method ->
                    when {
                        // u4(String) — the only public final Z(String) method
                        method.parameterTypes.size == 1 &&
                            method.parameterTypes[0] == "Ljava/lang/String;" &&
                            method.returnType == "Z" &&
                            AccessFlags.FINAL.isSet(method.accessFlags) -> {
                            method.addInstructions(0, RETURN_TRUE)
                        }
                        // Upgrade dialog gates (A4, B4, Q4, y4, z4) — these call u4(String)
                        // with specific strings and should return FALSE to prevent upgrade dialogs.
                        // They have a simple structure: invoke u4(String) and return the result.
                        method.parameterTypes.isEmpty() &&
                            method.returnType == "Z" &&
                            AccessFlags.PUBLIC.isSet(method.accessFlags) &&
                            method.callsU4WithString() -> {
                            method.addInstructions(0, RETURN_FALSE)
                        }
                        // Feature/data gates (L4, O4, P4, R4, T4) — these have different behavior
                        // and should NOT be patched. Leave them unpatched to preserve original behavior.
                    }
                }
            }

            // ── CounterSuperlikeAndUndoLimit: stable class, stable methods ────
            // (Direct patch — see CoreProduct note about the matchOrNull cache trap.)
            if (classDef.type == "Lcom/p1/mobile/putong/data/CounterSuperlikeAndUndoLimit;") {
                mutableClassDefBy(classDef).methods.forEach { method ->
                    if (method.name in setOf("remainToday", "remainAll") &&
                        method.parameterTypes.isEmpty() && method.returnType == "I"
                    ) {
                        method.addInstructions(0, RETURN_INT_200000)
                    }
                }
            }

            // ── ProfileImagesItemHolder.t(): defensive null-K2 guard ────────
            //
            // Stable CamelCase class, but `t()` is the obfuscated bind name.
            // Filter by signature (name == "t", no params, V return) — single
            // method match. Uses direct `mutableClassDefBy().methods.forEach`
            // to avoid the matchOrNull(method) cache trap (AGENTS.md §1b).
            if (classDef.type ==
                "Lcom/p1/mobile/putong/core/ui/profile/profilelist/itemholders/ProfileImagesItemHolder;"
            ) {
                mutableClassDefBy(classDef).methods.forEach { method ->
                    if (method.name == "t" &&
                        method.parameterTypes.isEmpty() &&
                        method.returnType == "V"
                    ) {
                        method.addInstructions(0, PROFILE_IMAGES_NULL_GUARD_BODY)
                    }
                }
            }

            // ── CoreBusinessServiceIml: stable class, obfuscated param types ──
            if (classDef.type == "Lcom/p1/mobile/putong/core/module/CoreBusinessServiceIml;") {
                coreBusinessLfFingerprint.matchOrNull(classDef)?.let { match ->
                    match.method.addInstructions(0, RETURN_VOID)
                }
                coreBusinessR6Fingerprint.matchOrNull(classDef)?.let { match ->
                    match.method.addInstructions(0, RETURN_VOID)
                }
                coreBusinessSlFingerprint.matchOrNull(classDef)?.let { match ->
                    match.method.addInstructions(0, RETURN_VOID)
                }
                // zi(Act) → true: allows boost activation (Gate 3 in f93.y())
                // Original: hardcoded `return false` — blocks actual boost activation.
                mutableClassDefBy(classDef).methods.forEach { method ->
                    if (method.name == "zi" &&
                        method.parameterTypes.size == 1 &&
                        method.parameterTypes[0] == "Lcom/p1/mobile/android/app/Act;" &&
                        method.returnType == "Z"
                    ) {
                        method.addInstructions(0, RETURN_TRUE)
                    }
                }
            }

            // ── Instant Match regional gate: com.p1.mobile.putong.core.ui.match.a.n() ──
            //
            // The privilege check for Instant Match (swh0.x(immediately_match)) requires
            // both Vd() (u59.U(), patched TRUE) and aq() (a.n(), NOT patched) to return TRUE.
            // a.n() returns !IntlCountryCodeController.k() — when user is in restricted region,
            // this returns FALSE, blocking Instant Match even though Vd() is patched.
            if (classDef.type == "Lcom/p1/mobile/putong/core/ui/match/a;") {
                mutableClassDefBy(classDef).methods.forEach { method ->
                    if (method.name == "n" &&
                        method.parameterTypes.isEmpty() &&
                        method.returnType == "Z"
                    ) {
                        method.addInstructions(0, RETURN_TRUE)
                    }
                }
            }

            // ── Swipe right purchase dialog: com.p1.mobile.putong.core.newui.home.base.impl.swipe.m.b() ──
            //
            // The m.b() method checks if a purchase dialog should be shown for commercial cards
            // (match/superlike/chat). When X3() and th5.d() both return FALSE, m.b() returns FALSE,
            // which means the purchase dialog strategy doesn't intercept the swipe. However, this
            // causes the swipe to fall through to the normal swipe handler, which sends a regular
            // cardlike request that the server rejects (40399/40343) because there's no server-side
            // immediately_match entitlement.
            //
            // To fix this, we patch m.b() to return FALSE directly, which prevents the purchase
            // dialog from showing AND prevents the commercial card processing. The swipe will
            // proceed as a normal like without server-side entitlement checks failing.
            if (classDef.type == "Lcom/p1/mobile/putong/core/newui/home/base/impl/swipe/m;") {
                mutableClassDefBy(classDef).methods.forEach { method ->
                    if (method.name == "b" &&
                        method.parameterTypes.size == 1 &&
                        method.parameterTypes[0] == "Lp001l/p3m\$a;" &&
                        method.returnType == "Z"
                    ) {
                        method.addInstructions(0, RETURN_FALSE)
                    }
                }
            }

            // ── Me tab affiliate discount entry banner: CoreIntlAffiliatePromotions.M3() ──
            //
            // The Me tab shows an affiliate discount banner driven by server-side promotion
            // data, NOT user tier. M3() checks if there's a cached IapAffiliatePromotion
            // for the given tab. Patching to FALSE hides ALL discount entry banners
            // (ME_TAB, MESSAGE_TAB, WHISPER_TAB, etc.) — desired for premium unlock.
            if (classDef.type == "Lcom/p1/mobile/putong/core/api/CoreIntlAffiliatePromotions;") {
                mutableClassDefBy(classDef).methods.forEach { method ->
                    if (method.name == "M3" &&
                        method.parameterTypes.size == 1 &&
                        method.parameterTypes[0] == "Lcom/p1/mobile/putong/core/api/CoreIntlAffiliatePromotions\$IntlAffiliateDiscountEntryTab;" &&
                        method.returnType == "Z"
                    ) {
                        method.addInstructions(0, RETURN_FALSE)
                    }
                }
            }

            // ── Me tab profile privilege pay guide: ProfilePrivilegePayGuide.l0() ──
            //
            // The Me tab shows a profile privilege pay guide banner driven by server-side
            // IntlTabMePayGuide data. l0() checks if the guide was clicked within a time
            // window. Patching to FALSE makes the banner think it was already dismissed.
            if (classDef.type == "Lcom/p1/mobile/putong/core/newui/profile/newme/ProfilePrivilegePayGuide;") {
                mutableClassDefBy(classDef).methods.forEach { method ->
                    if (method.name == "l0" &&
                        method.parameterTypes.isEmpty() &&
                        method.returnType == "Z"
                    ) {
                        method.addInstructions(0, RETURN_FALSE)
                    }
                }
            }
        }

        // ----------------------------------------------------------------------
        // Pass 2: Obfuscated classes — each resolved ONCE via global fingerprint
        //
        // `matchOrNull()` (no-arg) performs the actual class resolution and
        // caches the result. Every subsequent match call MUST use the explicit
        // `matchOrNull(classDef)` / `matchAll(classDef, range)` form against
        // the resolved `classDef` from `.classDef`.
        // ----------------------------------------------------------------------

        // xma: privilege gates + display timestamp + server refresh
        xmaClassFingerprint.matchOrNull()?.classDef?.let { xmaClassDef ->
            // Group A: S3 (calls guessedCurrentServerTime) → false
            // Group B: b4 (does NOT call guessedCurrentServerTime) → true
            // Both share the same static SummarizedPrivilegesId → Z signature.
            // After xmaS3Fingerprint matches S3, iterate the remaining
            // signature-matching methods and patch the ones that don't
            // call guessedCurrentServerTime.
            xmaS3Fingerprint.matchOrNull(xmaClassDef)?.let { match ->
                match.method.addInstructions(0, RETURN_FALSE)
            }
            xmaClassDef.methods
                .filter { it.isStaticSummarizedPrivilegesIdReturnBool() }
                .filterNot { it.callsGuessedCurrentServerTime() }
                .forEach { it.addInstructions(0, RETURN_TRUE) }

            // Group C: v3 / w3 (SummarizedPrivilegesId → J) → MAX
            xmaV3W3Fingerprint.matchAll(xmaClassDef, 1..2).forEach { match ->
                match.method.addInstructions(0, RETURN_LONG_MAX)
            }

            // q3 (femaleVip) → MAX
            xmaQ3Fingerprint.matchOrNull(xmaClassDef)?.let { match ->
                match.method.addInstructions(0, RETURN_LONG_MAX)
            }
            // s3 (limitedTrialSee) → MAX
            xmaS3LongWrapperFingerprint.matchOrNull(xmaClassDef)?.let { match ->
                match.method.addInstructions(0, RETURN_LONG_MAX)
            }

            // Group D: T3 (UserPrivilege → Z, calls currentServerTime) → false
            // Group E: c4 (UserPrivilege → Z, no currentServerTime) → true
            xmaT3Fingerprint.matchOrNull(xmaClassDef)?.let { match ->
                match.method.addInstructions(0, RETURN_FALSE)
            }
            xmaClassDef.methods
                .filter { it.isStaticUserPrivilegeReturnBool() }
                .filterNot { it.callsGuessedCurrentServerTime() }
                .forEach { it.addInstructions(0, RETURN_TRUE) }

            // a4 (PurchaseType → Z, loads "unknown_") → false
            xmaA4Fingerprint.matchOrNull(xmaClassDef)?.let { match ->
                match.method.addInstructions(0, RETURN_FALSE)
            }

            // Server refresh u4/x4 (instance no-arg → Lrx/c;) → null
            xmaServerRefreshFingerprint.matchAll(xmaClassDef, 1..2).forEach { match ->
                match.method.addInstructions(0, RETURN_NULL_OBJECT)
            }

            // L3 → true
            xmaL3Fingerprint.matchOrNull(xmaClassDef)?.let { match ->
                match.method.addInstructions(0, RETURN_TRUE)
            }

            // m4 (loads "vip") → true (VIP override)
            xmaM4Fingerprint.matchOrNull(xmaClassDef)?.let { match ->
                match.method.addInstructions(0, RETURN_TRUE)
            }

            // J3 (instance, loads "intlReadMessage") → true
            xmaJ3Fingerprint.matchOrNull(xmaClassDef)?.let { match ->
                match.method.addInstructions(0, RETURN_TRUE)
            }
            // K3 (instance, loads "revokeUnPair") → false
            xmaK3Fingerprint.matchOrNull(xmaClassDef)?.let { match ->
                match.method.addInstructions(0, RETURN_FALSE)
            }

            // S3-style wrappers (static no-arg → Z, unique product key) → false
            // These methods return S3(key) which is TRUE when privilege is EXPIRED.
            // For a premium user, we want them to return FALSE (privilege is active).
            listOf(
                xmaWrapperW3Fingerprint,
                xmaWrapperD4Fingerprint,
                xmaWrapperI4Fingerprint,
                xmaWrapperL4Fingerprint,
                xmaWrapperH4Fingerprint,
            ).forEach { fingerprint ->
                fingerprint.matchOrNull(xmaClassDef)?.let { match ->
                    match.method.addInstructions(0, RETURN_FALSE)
                }
            }

            // !S3-style wrappers (static no-arg → Z, unique product key) → true
            // These methods return !S3(key) which is TRUE when privilege is ACTIVE.
            // For a premium user, we want them to return TRUE (privilege is active).
            listOf(
                xmaWrapperJ4Fingerprint,
                xmaWrapperZ3Fingerprint,
            ).forEach { fingerprint ->
                fingerprint.matchOrNull(xmaClassDef)?.let { match ->
                    match.method.addInstructions(0, RETURN_TRUE)
                }
            }

            // ── oDiamond methods: F3(), X3(), Y3() all contain "oDiamond" string ──
            // F3() = !S3("oDiamond") → TRUE when active → patch to TRUE
            // X3() = S3("oDiamond") → TRUE when expired → patch to FALSE
            // Y3() = b4("oDiamond") → TRUE when expiredTime > 0 → patch to TRUE
            //
            // The generic string("oDiamond") filter matches all three, and matchOrNull()
            // caches the first match (typically F3 due to dex order). We must iterate
            // directly and distinguish by bytecode shape:
            // - F3() has a negation instruction (xor-int/lit8 or not-int)
            // - Y3() calls b4 method
            // - X3() is the remaining one (calls S3 without negation)
            //
            // X3() must return FALSE to prevent infinite loading. When X3() returns TRUE,
            // it triggers purchase dialog checks in swipe logic (m.java line 52), blocking
            // the swipe action and causing infinite loading.
            mutableClassDefBy(xmaClassDef).methods
                .filter { it.isStaticNoArgReturnBool() }
                .filter { it.containsString("oDiamond") }
                .forEach { method ->
                    when {
                        // F3(): !S3-style with negation → TRUE
                        method.hasNegation() -> {
                            method.addInstructions(0, RETURN_TRUE)
                        }
                        // Y3(): b4-style (calls b4 method) → TRUE
                        method.callsMethodNamed("b4") -> {
                            method.addInstructions(0, RETURN_TRUE)
                        }
                        // X3(): S3-style without negation → FALSE (prevent purchase dialog)
                        else -> {
                            method.addInstructions(0, RETURN_FALSE)
                        }
                    }
                }

            // B3-style wrapper (TEnum call) → false
            xmaWrapperB3Fingerprint.matchOrNull(xmaClassDef)?.let { match ->
                match.method.addInstructions(0, RETURN_FALSE)
            }

            // e4 and f4 both load "svip" — patch both → false
            xmaWrapperSvipFingerprint.matchAll(xmaClassDef, 1..2).forEach { match ->
                match.method.addInstructions(0, RETURN_FALSE)
            }

            // Credit count methods (static no-arg → I) → 200000
            xmaCreditCountFingerprint.matchAll(xmaClassDef, 1..15).forEach { match ->
                match.method.addInstructions(0, RETURN_INT_200000)
            }
        }

        // sja: picks remaining
        sjaClassFingerprint.matchOrNull()?.classDef?.let { sjaClassDef ->
            sjaPicksRemainingFingerprint.matchAll(sjaClassDef, 1..5).forEach { match ->
                match.method.addInstructions(0, RETURN_INT_200000)
            }
        }

        // src0: subscription expiry display
        src0ClassFingerprint.matchOrNull()?.classDef?.let { src0ClassDef ->
            src0WDaysRemainingFingerprint.matchOrNull(src0ClassDef)?.let { match ->
                match.method.addInstructions(0, RETURN_LONG_365)
            }
            src0XDaysRemainingFingerprint.matchOrNull(src0ClassDef)?.let { match ->
                match.method.addInstructions(0, RETURN_LONG_365)
            }
        }

        // gqf0: spotlight pass-through (single static no-arg Z)
        gqf0ClassFingerprint.matchOrNull()?.classDef?.let { gqf0ClassDef ->
            gqf0FFingerprint.matchOrNull(gqf0ClassDef)?.let { match ->
                match.method.addInstructions(0, RETURN_TRUE)
            }
        }

        // h6a: pricing restriction
        h6aClassFingerprint.matchOrNull()?.classDef?.let { h6aClassDef ->
            h6aCFingerprint.matchOrNull(h6aClassDef)?.let { match ->
                match.method.addInstructions(0, RETURN_TRUE)
            }
        }

        // u59: tier availability regional gates
        u59ClassFingerprint.matchOrNull()?.classDef?.let { u59ClassDef ->
            // Regional-gate set: D/F/O/S/U/Z/a0 (and other IntlCountryCodeController.k() callers).
            // Currently resolves to ~15 static no-arg Z methods in u59.
            u59RegionalGateFingerprint.matchAll(u59ClassDef, 1..20).forEach { match ->
                match.method.addInstructions(0, RETURN_TRUE)
            }
            // R() — instant-match open-user gate (unique).
            u59RFingerprint.matchOrNull(u59ClassDef)?.let { match ->
                match.method.addInstructions(0, RETURN_TRUE)
            }
            // V(User) — per-user tier check (already correct).
            u59VFingerprint.matchOrNull(u59ClassDef)?.let { match ->
                match.method.addInstructions(0, U59_V_BODY)
            }
        }

        // ugc0: subscription upgraded check
        ugc0ClassFingerprint.matchOrNull()?.classDef?.let { ugc0ClassDef ->
            ugc0KFingerprint.matchOrNull(ugc0ClassDef)?.let { match ->
                match.method.addInstructions(0, RETURN_TRUE)
            }
        }

        // zva0: tier rank + banner
        zva0ClassFingerprint.matchOrNull()?.classDef?.let { zva0ClassDef ->
            zva0B0Fingerprint.matchOrNull(zva0ClassDef)?.let { match ->
                match.method.addInstructions(0, ZVA0_B0_BODY)
            }
            zva0SFingerprint.matchOrNull(zva0ClassDef)?.let { match ->
                match.method.addInstructions(0, RETURN_TRUE)
            }
        }

        // th5: swipe action gates (d/f/h) → false
        // These methods check if the swipe strategy is "showPurchaseDialog".
        // Return FALSE to prevent purchase dialog from showing, allowing swipe actions to proceed.
        th5ClassFingerprint.matchOrNull()?.classDef?.let { th5ClassDef ->
            th5PurchaseDialogFingerprint.matchAll(th5ClassDef, 1..10).forEach { match ->
                match.method.addInstructions(0, RETURN_FALSE)
            }
        }

        // qgl0: privilege display string
        qgl0ClassFingerprint.matchOrNull()?.classDef?.let { qgl0ClassDef ->
            qgl0DFingerprint.matchOrNull(qgl0ClassDef)?.let { match ->
                match.method.addInstructions(0, QGL0_D_BODY)
            }
        }

        // n3b0: likers limit
        n3b0ClassFingerprint.matchOrNull()?.classDef?.let { n3b0ClassDef ->
            n3b0QFingerprint.matchOrNull(n3b0ClassDef)?.let { match ->
                match.method.addInstructions(0, RETURN_FALSE)
            }
            n3b0GFingerprint.matchOrNull(n3b0ClassDef)?.let { match ->
                match.method.addInstructions(0, FAR_FUTURE_MS_BODY)
            }
        }

        // sb90 Companion: blur check (c(User)) → false
        sb90CompanionClassFingerprint.matchOrNull()?.classDef?.let { sb90CompanionClassDef ->
            sb90CFingerprint.matchOrNull(sb90CompanionClassDef)?.let { match ->
                match.method.addInstructions(0, RETURN_FALSE)
            }
        }

        // tm90: VIP badge override
        tm90ClassFingerprint.matchOrNull()?.classDef?.let { tm90ClassDef ->
            tm90GFingerprint.matchOrNull(tm90ClassDef)?.let { match ->
                match.method.addInstructions(0, RETURN_FALSE)
            }
        }

        // mb90: purchase type checks
        mb90ClassFingerprint.matchOrNull()?.classDef?.let { mb90ClassDef ->
            mb90BFingerprint.matchOrNull(mb90ClassDef)?.let { match ->
                match.method.addInstructions(0, RETURN_TRUE)
            }
            mb90CFingerprint.matchOrNull(mb90ClassDef)?.let { match ->
                match.method.addInstructions(0, RETURN_TRUE)
            }
        }

        // pib: server refresh + membership flip
        pibClassFingerprint.matchOrNull()?.classDef?.let { pibClassDef ->
            pibW9Fingerprint.matchOrNull(pibClassDef)?.let { match ->
                match.method.addInstructions(0, RETURN_NULL_OBJECT)
            }
            pibG9Fingerprint.matchOrNull(pibClassDef)?.let { match ->
                match.method.addInstructions(0, PIB_G9_BODY)
            }
        }
    }
}
