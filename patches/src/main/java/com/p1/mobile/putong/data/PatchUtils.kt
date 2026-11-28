package com.p1.mobile.putong.data

import app.morphe.patcher.patch.BytecodePatchContext
import app.morphe.patcher.util.smali.InlineSmaliCompiler
import com.android.tools.smali.dexlib2.AccessFlags
import com.android.tools.smali.dexlib2.iface.ClassDef
import com.android.tools.smali.dexlib2.iface.Method
import com.android.tools.smali.dexlib2.iface.instruction.Instruction
import com.android.tools.smali.dexlib2.iface.instruction.ReferenceInstruction
import com.android.tools.smali.dexlib2.iface.instruction.WideLiteralInstruction
import com.android.tools.smali.dexlib2.iface.reference.FieldReference
import com.android.tools.smali.dexlib2.iface.reference.MethodReference
import com.android.tools.smali.dexlib2.iface.reference.StringReference
import java.util.WeakHashMap

val sharedInstructionCache = WeakHashMap<Method, List<Instruction>>()
fun Method.sharedCachedInstructions(): List<Instruction> =
    sharedInstructionCache.getOrPut(this) { implementation?.instructions?.toList() ?: emptyList() }

fun Method.containsExactString(str: String): Boolean =
    sharedCachedInstructions().any { instr ->
        instr is ReferenceInstruction && (instr.reference as? StringReference)?.string == str
    }

fun Method.preflightSmali(smali: String, expectedInstructions: Int) {
    val compiled = InlineSmaliCompiler.Companion.compile(
        smali,
        parameterTypes.joinToString(""),
        implementation?.registerCount ?: 1,
        AccessFlags.STATIC.isSet(accessFlags)
    )
    check(compiled.size == expectedInstructions) {
        "Smali pre-flight failed for $name: expected $expectedInstructions instructions, compiled ${compiled.size} " +
            "(a dropped instruction means an invalid register field — gotcha #9)"
    }
}

private val sharedResolverCache = WeakHashMap<BytecodePatchContext, UnifiedClassResolver>()

fun BytecodePatchContext.getSharedResolver(): UnifiedClassResolver {
    return sharedResolverCache.getOrPut(this) {
        UnifiedClassResolver(this).also { it.resolve() }
    }
}

class UnifiedClassResolver(private val context: BytecodePatchContext) {
    private val resolvedClasses = mutableMapOf<String, ClassDef>()
    
    private val analyticsAnchors = setOf(
        "miit_oaid", "Please init Beatles!!!",
        "add_payment_info", "com.google.android.gms.ads.identifier.service.START",
        "mmfile_push_statistic", "BatteryMetrics", "live-PerfTracer",
        "DNS_SLA", "_getOrCreate", "_compressRecordFile",
        "getSubmitAlternative",
        "0.9.3.2-SNAPSHOT",
        "com.facebook.appevents.internal.ActivityLifecycleTracker",
        "Warning: Please call AppEventsLogger.activateApp(...)from the long-lived activity's onResume() methodbefore logging other app events.",
        "app_events_feature_bitmask",
        "firebase_analytics_collection_deactivated",
        "https://deviceid.tantanapp.com/oneid/createid",
        "android.permission.READ_EXTERNAL_STORAGE",
        "android.permission.WRITE_EXTERNAL_STORAGE",
        "https://client-monitor.tantanapp.com/push?",
        "xlog.upload",
        "marsxlog"
    )

    private val OMS_DIALOG_ENUM = "Lcom/p1/mobile/putong/core/oms/OmsDialog;"
    private val SVIP_SEE_RECOVER_DLG = "Lcom/p1/mobile/putong/core/ui/dlg/SVipSeeRecoverDlg;"
    private val NEW_PROFILE_PAGER_TYPE = "Lcom/p1/mobile/putong/core/newui/profile/newme/NewProfilePrivilegedPager;"
    private var oneIdUploaderType: String? = null
    private val oneIdStorageCandidates = mutableListOf<Pair<ClassDef, Set<String>>>()
    private var rbb0Type: String? = null
    private val themeUnlockCandidates = mutableListOf<Pair<ClassDef, Set<String>>>()
    private val clipboardInviteClasses = mutableListOf<ClassDef>()
    private val mixedContentClasses = mutableListOf<ClassDef>()
    private val voiceRecordInnerCandidates = mutableListOf<ClassDef>()
    private val typingIndicatorClasses = mutableListOf<ClassDef>()
    private val locationUploadGateCandidates = mutableListOf<ClassDef>()
    private val meTabPagerClasses = mutableListOf<ClassDef>()

    private val adsAnchorStrings = setOf(
        "ca-app-pub-6567608331519569/1891609663",
        "ixxn_ad_channel",
        "p_incentive_ad_choose_page",
        "/intl-live-casualGameMenu",
        "intl_ad_show_bottom_banner",
        "ttt_tab_bar_bottom_banner",
        "repeat suggested card"
    )

    private val miscAnchorStrings = setOf(
        "p_get_screenshoot_warning",
        "/experience-questionnaire?scene=",
        "p_recall_match_popup",
        "p_match_invitation_popup",
        "bundle_from_notification",
        "buzzProlong",
        "checkContacts",
        "contacts_new",
        "android.permission.READ_CONTACTS",
        "tantan:.*邀请码：[A-Z|1-9]{4,}",
        "checkAppInstalled",
        "bubble_superlike_bubble",
        "superlike_promotion_config",
        "saved_device_uid_md5",
        "newabgroups_mode_device",
        "oms_mercury",
        "intlWhisperConversationOrder",
        "tantan_coin_intl_letter_confirm_dialog_shown_",
        "aiChatAdvice",
        "aiChatAnalysis",
        "pinChat",
        "e_platinum_top_chat",
        "msg_ice_break_config_v2",
        "IntlSeeAnimBubble"
    )
    
    private val FOX_STATS_DEFAULT_ENV = "Lcom/tantanapp/foxstatistics/a;"
    
    private val uiCleanupAnchors = mapOf(
        "aiChatGuide" to setOf("core_messages_ai_p2p_chat_guide"),
        "aiTranslateGuide" to setOf("e_intl_ai_translate_bubble", "ai_chat_advice_guide"),
        "newFunctionGuide" to setOf("svip_new_function_guide_shown_Intl"),
        "discountEntryBanner" to setOf("discount_entry_banner", "IntlMeetILikeNewLikeDiscountEntry"),
        "positioningGuide" to setOf("p_alert_positioning_authority_open_guide_popup"),
        "buzzPopup" to setOf("p_intl_buzz_memoji_paired")
    )
    
    private val dialogAnchors = mapOf(
        "mx0" to setOf("p_appstore_rating_filter_popup", "showRankGuideDlg"),
        "zrj0" to setOf("p_alert_version_upgrade_popup", "updateDlg"),
        "ok3" to setOf("p_offline_popup", "LikersDialogView"),
        "vipUpgradePopup" to setOf("vip_upgrade_popup"),
        "omsDialogController" to setOf("limitDialogLastShowTime"),
        "gpRateGuide" to setOf("p_intl_5star_dialog_view", "rate_popup_last_shown_new"),
        "seePurchaseGuide" to setOf("p_no_match_see_purchase_guide_view"),
        "newLikeDialog" to setOf("new_like_dialog_show_count_", "app_sission_has_show_new_like_", "new_like_dilaog_show_rime_")
    )
    
    private val gmsTargetStrings = setOf(
        "com.google.android.gms",
        "X-Android-Cert",
        "X-Android-Package",
        "218526224262-usliqg20cepnb3ql98amgeum18v8uatv.apps.googleusercontent.com",
        "The SDK has not been initialized"
    )
    
    private val loveBuzzFields = setOf(
        "remainingVoiceBuzz", "remainingTextBuzz", "remainingVideoBuzz", "remainingMemojiBuzz"
    )
    
    private val privacyAnchors = mapOf(
        "jmd0" to setOf("/system/app/Superuser.apk", "/system/xbin/daemonsu"),
        "mmd0" to setOf("/system/bin/cufsdosck", "/system/bin/conbb"),
        "ert0" to setOf("ranchu", "generic", "emulator"),
        "fbEmulator" to setOf("google_sdk", "Genymotion", "vbox86p"),
        "additionalRoot" to setOf("/data/local/su", "/system/xbin/su", "/su/bin/su"),
        "shuMeng" to setOf("2918efe07"),
        "adClickSubstitution" to setOf("ANDROIDID", "OAID", "\\[(.*?)]")
    )
    
    private val premiumAnchorStrings = setOf(
        "/summarized-privileges?with=diamond", "intl_receive_like_guide_get", "receive_like_guide_get",
        "fake_conversation_surprise_gift_box", "fake_conversation_profile_like_enter",
        "fake_conversation_greeting", "conversation_feed_state", "meet_entrance",
        "fake_conversation_local_instant_chat_conversation", "fake_conversation_anonymous_greeting",
        "fake_conversation_local_team_group_conversation", "fake_conversation_local_limited_trial_see_fold",
        "intlSeeChatRequest", "intl_chat_request_insert_users", "fake_conversation_oof_pick",
        "intl_sl_guide_config", "intl_good_c_bage_config", "e_intl_spotlight_activity_card",
        "ttt_membership_price_diff",         "seeUpgradeToPremium",
        "location_bubule_has_shown_", "e_vip_banner",
        "vas_commercial_card_right_slide_strategy", "暂未激活黑金会员",
        "last_privilege_banner_picks_item_clicked_time_", "p_offline_popup", "p_see_popup_expired_svip", "last_likers_req_time",
        "offline_dialog_show_time", "reBackAppGuideDialog", "open_fill_info_debug",
        "fromWhoLikedMe", "e_red_dot_message_see", "MeetLikersNewLikersData",
        "IntlMeetLikersNewLikersData", "matched",
        "business_entrance_last_show_time", "today_new_likes_changed",
        "last_total_likes_count", "last_new_likes_count",
        "%s people liked you", "Someone's %s y/o ; %s away",
        "e_see_who_liked_me_banner", "p_suggest_user_profile_info_view",
        "p_intl_visitors_list,e_intl_me_tab_visitors_old_visitor_discount_entry_banner,click",
        "p_meet_view,e_intl_meet_visitors_new_visitor_discount_entry_banner,click",
        "distance", "online"
    )
    
    private val premiumAnchorFields = setOf(
        "Lcom/p1/mobile/putong/data/Counter;.likersLimit",
        "Lcom/p1/mobile/putong/data/LikersLimit;.remaining",
        "Lcom/p1/mobile/putong/data/User;.localRelationship",
        "Lcom/p1/mobile/putong/data/Counter;.secretCrushLimit",
        "Lcom/p1/mobile/putong/data/CounterSecretCrushLimit;.remaining",
        "Lcom/p1/mobile/putong/core/data/GreetingCounter;.replyThanksRemain",
        "Lcom/p1/mobile/putong/core/data/SwipeRateLimitConfig;.enable",
        "Lcom/p1/mobile/putong/core/data/LeftSwipeLimitConfig;.swipeLimit",
        "Lcom/p1/mobile/putong/core/data/IntlUltraPremiumConfig;.androidEnable",
        "Lcom/p1/mobile/putong/core/data/CoreData;.surpriseGiftExpirationTime",
        "Lcom/p1/mobile/putong/data/User;.isVIP",
        "Lcom/p1/mobile/putong/core/data/PurchaseType;.TYPE_ROAMING_PKG",
        "Lcom/p1/mobile/putong/core/data/Conversation;.property",
        "Lcom/p1/mobile/putong/core/data/UltraRightsUpgradeInfo;.isCanUpgradeUltra",
        "Lcom/p1/mobile/putong/data/User;.pictures",
        "Lcom/p1/mobile/putong/core/ui/poplevel/CorePopLevel;.INTL_SEE_ANIM_BUBBLE",
        "Lcom/p1/mobile/putong/core/oms/OmsDialog;.p_offline_popup",
        "Lcom/p1/mobile/putong/core/data/TpTelepathyConv;.replyLengthLimit",
        "Lcom/p1/mobile/putong/core/data/Privilege;.letter",
        "Lcom/p1/mobile/putong/core/data/MsgIcebreakConfigV2;.iceBreakLastMessageShowCountLimit"
    )
    
    private val premiumAnchorMethods = setOf(
        "Lcom/p1/mobile/putong/data/User;.isSupremePartnerOpenMystery",
        "Lcom/p1/mobile/putong/data/User;.isHideIconFromSVipWithMe",
        "Lcom/p1/mobile/putong/ab/IntlCountryCodeController;.f",
        "Ll/hkd0;.b", "Ll/hkd0;.d", "Ll/hkd0;.e", "Ll/hkd0;.j",
        "Ll/mv6;.S0", "Ll/gxe0;.G"
    )
    
    private val allAnchorStrings = analyticsAnchors + 
        uiCleanupAnchors.values.flatten().toSet() +
        dialogAnchors.values.flatten().toSet() +
        premiumAnchorStrings +
        gmsTargetStrings +
        privacyAnchors.values.flatten().toSet() +
        adsAnchorStrings +
        miscAnchorStrings
    
    fun resolve() {
        context.classDefForEach { classDef ->
            val classType = classDef.type
            if (classType.startsWith("Landroid/") || 
                classType.startsWith("Lkotlin/") ||
                classType.startsWith("Ljava/")) {
                return@classDefForEach
            }
            
            val isSettingsUi = classType.startsWith("Lcom/p1/mobile/putong/core/ui/settings/")
            
            val foundStrings = mutableSetOf<String>()
            val foundFields = mutableSetOf<String>()
            val foundMethods = mutableSetOf<String>()
            val methodCallFull = mutableSetOf<String>()
            val methodCallSigs = mutableSetOf<String>()
            val methodCallFullSigs = mutableSetOf<String>()
            val methodNameRet = mutableSetOf<String>()
            var hasZUserMethod = false
            var hasCoreEventLoggerRef = false
            
            classDef.methods.forEach { method ->
                if (method.returnType == "Z" && method.parameterTypes.size == 1 && 
                    method.parameterTypes[0] == "Lcom/p1/mobile/putong/data/User;") {
                    hasZUserMethod = true
                }
                
                method.sharedCachedInstructions().forEach { instr ->
                    if (instr is ReferenceInstruction) {
                        when (val ref = instr.reference) {
                            is StringReference -> {
                                val s = ref.string
                                if (s in allAnchorStrings) foundStrings.add(s)
                            }
                            is FieldReference -> {
                                val fieldFull = "${ref.definingClass}.${ref.name}"
                                if (fieldFull in premiumAnchorFields) foundFields.add(fieldFull)
                                if (ref.definingClass == "Lcom/p1/mobile/putong/core/data/LoveBuzzData;" && 
                                    ref.name in loveBuzzFields) {
                                    foundFields.add("LoveBuzzData.${ref.name}")
                                }
                            }
                            is MethodReference -> {
                                val methodFull = "${ref.definingClass}.${ref.name}"
                                if (methodFull in premiumAnchorMethods) foundMethods.add(methodFull)
                                if (ref.definingClass == FOX_STATS_DEFAULT_ENV) hasCoreEventLoggerRef = true
                                methodCallFull.add(methodFull)
                                val sig = "${ref.name}.${ref.parameterTypes.size}.${ref.returnType}"
                                methodCallSigs.add(sig)
                                val fullSig = "${ref.definingClass}.${ref.name}.${ref.parameterTypes.size}.${ref.returnType}"
                                methodCallFullSigs.add(fullSig)
                                methodNameRet.add("${ref.name}\u0001${ref.returnType}")
                            }
                        }
                    }
                }
            }
            
            if ("android.permission.READ_EXTERNAL_STORAGE" in foundStrings &&
                "android.permission.WRITE_EXTERNAL_STORAGE" in foundStrings) {
                oneIdStorageCandidates.add(classDef to methodCallFull.toSet())
            }

            if ("online" in foundStrings && classDef.methods.any {
                    AccessFlags.STATIC.isSet(it.accessFlags) && it.returnType == "Z" &&
                        it.parameterTypes.size == 1 && it.parameterTypes[0] == "Ljava/lang/String;"
                }) {
                themeUnlockCandidates.add(classDef to methodCallFull.toSet())
            }

            // mockLocationFlag (nr5) carries only rex-encrypted strings, so it would be dropped
            // by the anchor gate below. Resolve it from the unique isFromMockProvider call site
            // before that gate (methodCallFull is already complete at this point).
            if ("mockLocationFlag" !in resolvedClasses &&
                methodCallFull.contains("Landroid/location/Location;.isFromMockProvider")) {
                resolvedClasses["mockLocationFlag"] = classDef
            }

            // Mixed-content hardening candidates: every class calling WebSettings.setMixedContentMode.
            // Collected before the anchor gate (jb10 carries no anchor strings). The patch edits only
            // const-0 feeds (NEVER_ALLOW), so mode-2 sites (AdMob lw0, Weibo) are untouched by design.
            if (methodCallFull.contains("Landroid/webkit/WebSettings;.setMixedContentMode")) {
                mixedContentClasses.add(classDef)
            }

            // Location-upload 500m gate candidates: any class calling into location/a AND
            // carrying the const-wide 500.0 threshold. In 7.5.6.1 the gate lives in a synthetic
            // lambda dispatcher (a33.call), not the old core/api/c — collected pre-gate because
            // the dispatcher carries no anchor strings. The patch verifies the distance-call shape.
            if (methodCallFull.any { it.startsWith("Lcom/p1/mobile/putong/location/a;.") } &&
                classDef.methods.any { m ->
                    m.sharedCachedInstructions().any {
                        it is WideLiteralInstruction && it.wideLiteral == 0x407f400000000000L
                    }
                }) {
                locationUploadGateCandidates.add(classDef)
            }

            if ("affiliatePromotions" !in resolvedClasses &&
                classDef.methods.any {
                    it.returnType == "Z" &&
                        it.parameterTypes == listOf("Lcom/p1/mobile/putong/core/api/CoreIntlAffiliatePromotions${'$'}IntlAffiliateDiscountEntryTab;")
                }) {
                resolvedClasses["affiliatePromotions"] = classDef
            }

            if ((classDef.fields.any { it.type == NEW_PROFILE_PAGER_TYPE } ||
                    classDef.methods.any { it.parameterTypes.isEmpty() && it.returnType == NEW_PROFILE_PAGER_TYPE }) &&
                classDef.methods.any {
                    !AccessFlags.STATIC.isSet(it.accessFlags) && it.returnType == "V" &&
                        it.parameterTypes == listOf("Ljava/util/ArrayList;", "Z")
                }) {
                meTabPagerClasses.add(classDef)
            }

            // voiceRecord (a310): the MessagesAct voice recorder. setRecordStartTime is also called
            // by the telepathy twin mal0 — discriminate by the MessagesAct constructor param
            // (mal0 takes TpMessagesAct). No const-strings in the outer class, so resolve pre-gate.
            if ("voiceRecord" !in resolvedClasses &&
                methodCallFull.contains("Lcom/p1/mobile/putong/core/ui/messages/model/record/view/RecordAnimLayout;.setRecordStartTime") &&
                classDef.methods.any {
                    it.name == "<init>" && it.parameterTypes.size == 1 &&
                        it.parameterTypes[0] == "Lcom/p1/mobile/putong/core/ui/messages/MessagesAct;"
                }) {
                resolvedClasses["voiceRecord"] = classDef
            }

            // voiceRecord inner-class candidates: run()V carrying the inlined 60000 ms cap
            // (Constants.ONE_MIN_IN_MILLIS) + SystemClock.uptimeMillis. The post-pass picks the
            // one whose DEX type is prefixed by the resolved outer type (a310$b, not mal0$b).
            if (methodCallFull.contains("Landroid/os/SystemClock;.uptimeMillis") &&
                classDef.methods.any { m ->
                    m.name == "run" && m.returnType == "V" && m.parameterTypes.isEmpty() &&
                        m.sharedCachedInstructions().any { it is WideLiteralInstruction && it.wideLiteral == 60000L }
                }) {
                voiceRecordInnerCandidates.add(classDef)
            }

            if (classDef.methods.any { m ->
                    !AccessFlags.STATIC.isSet(m.accessFlags) && m.returnType == "V" &&
                        m.parameterTypes.isEmpty() &&
                        m.sharedCachedInstructions().any { instr ->
                            instr is ReferenceInstruction && (instr.reference as? FieldReference)?.let {
                                it.definingClass == "Lcom/p1/mobile/putong/core/data/KeepConnection;" &&
                                    it.name == "chatTypingOpen"
                            } == true
                        } &&
                        m.sharedCachedInstructions().any { instr ->
                            instr is ReferenceInstruction && (instr.reference as? FieldReference)?.let {
                                it.definingClass == "Lcom/p1/mobile/putong/core/data/KeepConnection;" &&
                                    it.name == "chatTypingInterval"
                            } == true
                        }
                }) {
                typingIndicatorClasses.add(classDef)
            }

            // Crash-collector upload transport (7.5.6.1 rmm): the giq event Runnable and ga2
            // attachment Runnable POST straight to seiya /events + /attachments via
            // rmm.c(jii,String,ete)UploadStatus, bypassing the c41 facade. Anchored purely on
            // the stable product enum return type — MUST run before the anchorless-class
            // early-return below (rmm carries no anchor strings).
            if ("beatlesUpload" !in resolvedClasses &&
                classDef.methods.any { m ->
                    m.returnType == "Lcom/tantanapp/beatles/v2/upload/UploadStatus;" &&
                        m.parameterTypes.size == 3 && m.parameterTypes[1] == "Ljava/lang/String;"
                }) {
                resolvedClasses["beatlesUpload"] = classDef
            }

            // Outgoing typing telemetry sink (7.5.6.1 l53): the interface default
            // x(String)V builds the LongLink MSG_TYPE_CHAT_TYPING frame — the ONLY sender.
            // Voiding it kills "typing..." egress without touching u2e.j0/g6m.R lifecycle
            // (method voids caused stale-subscription crashes; the live sends caused a
            // server-rejected "Something went wrong" dialog while typing). Anchored on the
            // stable product enum field name; emc.f() returns the enum (shape mismatch) and
            // the receiver path uses a different shape. Pre-gate: l53 carries no anchor strings.
            if ("typingSink" !in resolvedClasses &&
                classDef.methods.any { m ->
                    m.returnType == "V" && m.parameterTypes.size == 1 &&
                        m.parameterTypes[0] == "Ljava/lang/String;" &&
                        m.sharedCachedInstructions().any { instr ->
                            instr is ReferenceInstruction &&
                                (instr.reference as? FieldReference)?.name == "MSG_TYPE_CHAT_TYPING"
                        }
                }) {
                resolvedClasses["typingSink"] = classDef
            }

            if (foundStrings.isEmpty() && foundFields.isEmpty() && foundMethods.isEmpty() && !hasCoreEventLoggerRef) {
                return@classDefForEach
            }
            
            resolveAnalytics(foundStrings, classDef, hasCoreEventLoggerRef, methodCallFull)
            resolveUiCleanup(foundStrings, classDef)
            resolveDialogs(foundStrings, classDef)
            resolvePremium(foundStrings, foundFields, foundMethods, methodCallFull, 
                          methodCallSigs, methodCallFullSigs, methodNameRet, hasZUserMethod, isSettingsUi, classDef)
            resolveGms(foundStrings, classDef, classType)
            resolveLoveBuzz(foundFields, classDef)
            resolvePrivacy(foundStrings, classDef)
            resolveAds(foundStrings, classDef)
            resolveMisc(foundStrings, foundFields, classDef)
            resolveExpansion(foundStrings, classDef)
        }

        val uploader = oneIdUploaderType
        if (uploader != null && "oneIdStorage" !in resolvedClasses) {
            for ((cd, calls) in oneIdStorageCandidates) {
                if (calls.contains("$uploader.e")) {
                    resolvedClasses["oneIdStorage"] = cd
                    break
                }
            }
        }

        // Theme gate (7.5.6.1 cj7.a, was j5k.a): a static (String)Z carrying "online"/"popular"
        // that calls the likers-quota gate. Resolve directly by shape + strings (independent of
        // the rbb0 quota method name, which churned q->c). Forcing it FALSE keeps theme cards
        // unlocked even when the quota gate reports exhausted.
        if ("themeUnlock" !in resolvedClasses) {
            for ((cd, _) in themeUnlockCandidates) {
                val hasThemeGate = cd.methods.any { m ->
                    AccessFlags.STATIC.isSet(m.accessFlags) && m.returnType == "Z" &&
                        m.parameterTypes == listOf("Ljava/lang/String;") &&
                        m.sharedCachedInstructions().any { instr ->
                            instr is ReferenceInstruction &&
                                ((instr.reference as? StringReference)?.string == "online" ||
                                    (instr.reference as? StringReference)?.string == "popular")
                        }
                }
                if (hasThemeGate) {
                    resolvedClasses["themeUnlock"] = cd
                    break
                }
            }
        }

        if ("voiceRecordInner" !in resolvedClasses) {
            for (cd in voiceRecordInnerCandidates) {
                val readsMessagesAct = cd.methods.any { m ->
                    m.name == "run" && m.returnType == "V" && m.parameterTypes.isEmpty() &&
                        m.sharedCachedInstructions().any { instr ->
                            instr is ReferenceInstruction &&
                                (instr.reference as? FieldReference)?.definingClass ==
                                    "Lcom/p1/mobile/putong/core/ui/messages/MessagesAct;"
                        }
                }
                if (readsMessagesAct) {
                    resolvedClasses["voiceRecordInner"] = cd
                    break
                }
            }
        }
    }
    
    private fun resolveAnalytics(foundStrings: Set<String>, classDef: ClassDef, hasCoreEventLoggerRef: Boolean, methodCallFull: Set<String>) {
        if ("miit_oaid" in foundStrings) resolvedClasses.putIfAbsent("oaidHelper", classDef)
        if ("add_payment_info" in foundStrings) resolvedClasses.putIfAbsent("firebaseAnalytics", classDef)
        if ("com.google.android.gms.ads.identifier.service.START" in foundStrings) resolvedClasses.putIfAbsent("googleAdId", classDef)
        if ("mmfile_push_statistic" in foundStrings) resolvedClasses.putIfAbsent("pushStats", classDef)
        if ("BatteryMetrics" in foundStrings) resolvedClasses.putIfAbsent("batteryMetrics", classDef)
        if ("live-PerfTracer" in foundStrings) resolvedClasses.putIfAbsent("moLiveApm", classDef)
        if ("DNS_SLA" in foundStrings) resolvedClasses.putIfAbsent("dnsSla", classDef)
        if ("getSubmitAlternative" in foundStrings) resolvedClasses.putIfAbsent("moLiveApm2", classDef)
        if ("_getOrCreate" in foundStrings && "_compressRecordFile" in foundStrings) resolvedClasses.putIfAbsent("moTracing", classDef)

        val hasStaticVoid = classDef.methods.any {
            AccessFlags.STATIC.isSet(it.accessFlags) && it.returnType == "V" && it.implementation != null
        }
        // Fox facade (7.5.6.1 l7k): calls into foxstatistics.a AND exposes the varargs event
        // method static V (String,String,[array). The shape discriminator excludes the engine /
        // runnables / mmm sender that also reference foxstatistics.a (gotcha #18).
        val hasFoxEventShape = classDef.methods.any {
            AccessFlags.STATIC.isSet(it.accessFlags) && it.returnType == "V" &&
                it.parameterTypes.size == 3 &&
                it.parameterTypes[0] == "Ljava/lang/String;" &&
                it.parameterTypes[1] == "Ljava/lang/String;" &&
                it.parameterTypes[2].startsWith("[")
        }
        if (hasCoreEventLoggerRef && hasFoxEventShape && hasStaticVoid) {
            resolvedClasses.putIfAbsent("coreEventLogger", classDef)
        }
        // Fox HTTP sender (7.5.6.1 mmm.b): the single upload choke point for BOTH report and
        // sc-report endpoints (the endpoint strings now live only in shared runnables a14/t7g,
        // so the old per-endpoint static (String,I)V anchors are dead). Anchor on the SDK version
        // string + the static (String,JsonArray,I)Z shape; forcing true purges the upload queues.
        if ("0.9.3.2-SNAPSHOT" in foundStrings &&
            classDef.methods.any {
                AccessFlags.STATIC.isSet(it.accessFlags) && it.returnType == "Z" &&
                    it.parameterTypes == listOf("Ljava/lang/String;", "Lcom/google/gson/JsonArray;", "I")
            }) {
            resolvedClasses.putIfAbsent("foxSender", classDef)
        }
        if ("com.facebook.appevents.internal.ActivityLifecycleTracker" in foundStrings) resolvedClasses.putIfAbsent("fbAutoEvents", classDef)
        // Facebook AppEventsLogger (7.5.6.1 na0): outer class obfuscated; anchor on the unique
        // activateApp warning string + the static (Application,String)V activateApp shape.
        if ("Warning: Please call AppEventsLogger.activateApp(...)from the long-lived activity's onResume() methodbefore logging other app events." in foundStrings &&
            classDef.methods.any {
                AccessFlags.STATIC.isSet(it.accessFlags) && it.returnType == "V" &&
                    it.parameterTypes == listOf("Landroid/app/Application;", "Ljava/lang/String;")
            }) {
            resolvedClasses.putIfAbsent("fbAppEvents", classDef)
        }
        // Facebook FetchedAppSettingsManager (7.5.6.1 ru6): outer obfuscated; the fetch executor
        // is now static a()JSONObject (no args). Anchor on the unique app-settings field name
        // (only ru6 carries it) + a static ()JSONObject method.
        if ("app_events_feature_bitmask" in foundStrings &&
            classDef.methods.any {
                AccessFlags.STATIC.isSet(it.accessFlags) && it.returnType == "Lorg/json/JSONObject;" &&
                    it.parameterTypes.isEmpty()
            }) {
            resolvedClasses.putIfAbsent("fbAppSettings", classDef)
        }
        // GA4 collection gate (7.5.6.1 dyq.g()I): the deactivated-metadata read now returns I
        // (1 = collection off), not Z. Pair the string with a no-arg ()I carrier so the resolver
        // does not pick the first string holder (b2r.Y(J,Z)V) which has no ()I gate.
        if ("firebase_analytics_collection_deactivated" in foundStrings &&
            classDef.methods.any { m ->
                m.returnType == "I" && m.parameterTypes.isEmpty() &&
                    m.containsExactString("firebase_analytics_collection_deactivated")
            }) {
            resolvedClasses.putIfAbsent("ga4Collection", classDef)
        }
        if ("https://deviceid.tantanapp.com/oneid/createid" in foundStrings &&
            classDef.methods.any {
                AccessFlags.STATIC.isSet(it.accessFlags) && it.returnType == "V" &&
                    it.parameterTypes.size == 2 && it.parameterTypes[0] == "J"
            }) {
            oneIdUploaderType = classDef.type
            resolvedClasses.putIfAbsent("oneIdUploader", classDef)
        }
    }
    
    private fun resolveUiCleanup(foundStrings: Set<String>, classDef: ClassDef) {
        if (classDef.type == OMS_DIALOG_ENUM) return
        for ((key, anchors) in uiCleanupAnchors) {
            if (key in resolvedClasses || anchors.none { it in foundStrings }) continue
            if (key == "positioningGuide") {
                val hasCreator = classDef.methods.any { m ->
                    AccessFlags.STATIC.isSet(m.accessFlags) && m.returnType == "V" &&
                        m.parameterTypes.isNotEmpty() &&
                        m.parameterTypes[0] == "Lcom/p1/mobile/android/app/Act;" &&
                        m.sharedCachedInstructions().any { instr ->
                            instr is ReferenceInstruction &&
                                (instr.reference as? StringReference)?.string == "p_alert_positioning_authority_open_guide_popup"
                        }
                }
                if (!hasCreator) continue
            }
            resolvedClasses[key] = classDef
        }
    }
    
    private fun resolveDialogs(foundStrings: Set<String>, classDef: ClassDef) {
        if (classDef.type == OMS_DIALOG_ENUM) return
        for ((key, anchors) in dialogAnchors) {
            if (key !in resolvedClasses && anchors.any { it in foundStrings }) {
                resolvedClasses[key] = classDef
            }
        }
    }
    
    private fun resolvePremium(
        foundStrings: Set<String>,
        foundFields: Set<String>,
        foundMethods: Set<String>,
        methodCallFull: Set<String>,
        methodCallSigs: Set<String>,
        methodCallFullSigs: Set<String>,
        methodNameRet: Set<String>,
        hasZUserMethod: Boolean,
        isSettingsUi: Boolean,
        classDef: ClassDef
    ) {
        val hasConvNew_ = "Lcom/p1/mobile/putong/core/data/Conversation;.new_.0.Lcom/p1/mobile/putong/core/data/Conversation;" in methodCallFullSigs
        
        if ("xma" !in resolvedClasses && !isSettingsUi && "/summarized-privileges?with=diamond" in foundStrings) {
            resolvedClasses["xma"] = classDef
        }
        if ("qa9" !in resolvedClasses && "intl_receive_like_guide_get" in foundStrings && hasConvNew_) {
            resolvedClasses["qa9"] = classDef
        }
        if ("hva" !in resolvedClasses && "receive_like_guide_get" in foundStrings && hasConvNew_) {
            resolvedClasses["hva"] = classDef
        }
        if ("coreApiFakeConv" !in resolvedClasses && "fake_conversation_surprise_gift_box" in foundStrings && hasConvNew_) {
            resolvedClasses["coreApiFakeConv"] = classDef
        }
        if ("profileLikeEnter" !in resolvedClasses && "fake_conversation_profile_like_enter" in foundStrings && hasConvNew_) {
            resolvedClasses["profileLikeEnter"] = classDef
        }
        if ("greetingFakeConv" !in resolvedClasses && "fake_conversation_greeting" in foundStrings && hasConvNew_) {
            resolvedClasses["greetingFakeConv"] = classDef
        }
        if ("feedStateFakeConv" !in resolvedClasses && "conversation_feed_state" in foundStrings && hasConvNew_) {
            resolvedClasses["feedStateFakeConv"] = classDef
        }
        if ("meetEntranceBanner" !in resolvedClasses && "meet_entrance" in foundStrings && "w.0.V" in methodCallSigs) {
            resolvedClasses["meetEntranceBanner"] = classDef
        }
        if ("instantChatGuide" !in resolvedClasses && "fake_conversation_local_instant_chat_conversation" in foundStrings && hasConvNew_) {
            resolvedClasses["instantChatGuide"] = classDef
        }
        if ("mainUiFakeConv" !in resolvedClasses && "fake_conversation_anonymous_greeting" in foundStrings && hasConvNew_) {
            resolvedClasses["mainUiFakeConv"] = classDef
        }
        if ("coreApiTeamGroup" !in resolvedClasses && "fake_conversation_local_team_group_conversation" in foundStrings && hasConvNew_) {
            resolvedClasses["coreApiTeamGroup"] = classDef
        }
        if ("coreApiLimitedTrialFold" !in resolvedClasses && "fake_conversation_local_limited_trial_see_fold" in foundStrings && hasConvNew_) {
            resolvedClasses["coreApiLimitedTrialFold"] = classDef
        }
        if ("intlSeeChatRequestCreator" !in resolvedClasses && "intlSeeChatRequest" in foundStrings && hasConvNew_) {
            resolvedClasses["intlSeeChatRequestCreator"] = classDef
        }
        if ("r8n" !in resolvedClasses && "intl_chat_request_insert_users" in foundStrings) {
            resolvedClasses["r8n"] = classDef
        }
        if ("headRecommendAdapter" !in resolvedClasses && "fake_conversation_profile_like_enter" in foundStrings && 
            "fake_conversation_oof_pick" in foundStrings && "getItemViewType.1.I" in methodCallSigs) {
            resolvedClasses["headRecommendAdapter"] = classDef
        }
        
        if ("sb90Companion" !in resolvedClasses && !isSettingsUi && "Lcom/p1/mobile/putong/data/User;.localRelationship" in foundFields && 
            "matched" in foundStrings && "Lcom/p1/mobile/putong/data/User;.isSupremePartnerOpenMystery" in foundMethods && 
            "Lcom/p1/mobile/putong/data/User;.isHideIconFromSVipWithMe" in foundMethods && hasZUserMethod) {
            resolvedClasses["sb90Companion"] = classDef
        }
        if ("u59" !in resolvedClasses && !isSettingsUi && "intl_sl_guide_config" in foundStrings) {
            resolvedClasses["u59"] = classDef
        }
        if ("tm90" !in resolvedClasses && !isSettingsUi && "intl_good_c_bage_config" in foundStrings &&
            classDef.methods.any { AccessFlags.STATIC.isSet(it.accessFlags) && it.returnType == "Z" &&
                it.parameterTypes == listOf("Lcom/p1/mobile/putong/data/User;") }) {
            resolvedClasses["tm90"] = classDef
        }
        if ("gqf0" !in resolvedClasses && !isSettingsUi && "e_intl_spotlight_activity_card" in foundStrings &&
            classDef.methods.any { AccessFlags.PUBLIC.isSet(it.accessFlags) && it.returnType == "Z" &&
                it.parameterTypes.isEmpty() }) {
            resolvedClasses["gqf0"] = classDef
        }
        if ("h6a" !in resolvedClasses && !isSettingsUi && "ttt_membership_price_diff" in foundStrings) {
            resolvedClasses["h6a"] = classDef
        }
        if ("ugc0" !in resolvedClasses && !isSettingsUi && "seeUpgradeToPremium" in foundStrings) {
            resolvedClasses["ugc0"] = classDef
        }
        // CoreProduct was obfuscated to Ll/is3; in 7.5.6.1 (only CoreProduct$PromotionStatus keeps
        // the name). Anchor on the unique location-bubble pref + a (PurchaseType)Z purchase gate.
        if ("coreProduct" !in resolvedClasses && "location_bubule_has_shown_" in foundStrings &&
            classDef.methods.any {
                it.returnType == "Z" && it.parameterTypes == listOf("Lcom/p1/mobile/putong/core/data/PurchaseType;")
            }) {
            resolvedClasses["coreProduct"] = classDef
        }
        if ("zva0" !in resolvedClasses && !isSettingsUi && "e_vip_banner" in foundStrings &&
            classDef.methods.any { AccessFlags.PUBLIC.isSet(it.accessFlags) && AccessFlags.FINAL.isSet(it.accessFlags) &&
                it.returnType == "Z" && it.parameterTypes.isEmpty() }) {
            resolvedClasses["zva0"] = classDef
        }
        if ("th5" !in resolvedClasses && !isSettingsUi && "vas_commercial_card_right_slide_strategy" in foundStrings) {
            resolvedClasses["th5"] = classDef
        }
        if ("qgl0" !in resolvedClasses && !isSettingsUi && "暂未激活黑金会员" in foundStrings) {
            resolvedClasses["qgl0"] = classDef
        }
        if ("sja" !in resolvedClasses && !isSettingsUi && "last_privilege_banner_picks_item_clicked_time_" in foundStrings &&
            classDef.methods.any {
                AccessFlags.PUBLIC.isSet(it.accessFlags) && AccessFlags.STATIC.isSet(it.accessFlags) &&
                    it.returnType == "I" && it.parameterTypes.isEmpty()
            }) {
            resolvedClasses["sja"] = classDef
        }
        if ("n3b0" !in resolvedClasses && !isSettingsUi && "Lcom/p1/mobile/putong/data/Counter;.likersLimit" in foundFields &&
            classDef.methods.any { it.returnType == "Z" && it.parameterTypes.isEmpty() && AccessFlags.STATIC.isSet(it.accessFlags) }) {
            resolvedClasses["n3b0"] = classDef
        }
        if ("rbb0" !in resolvedClasses && !isSettingsUi && "Lcom/p1/mobile/putong/data/LikersLimit;.remaining" in foundFields) {
            // 7.5.6.1: the quota gate is oth.c()Z (no-arg static) reading LikersLimit.remaining.
            // Require the static ()Z method ITSELF to read remaining (narrows to oth, avoids
            // first-wins hijack by other classes that merely reference the field elsewhere).
            val hasQuotaGate = classDef.methods.any { m ->
                m.returnType == "Z" && AccessFlags.STATIC.isSet(m.accessFlags) &&
                    m.parameterTypes.isEmpty() &&
                    m.sharedCachedInstructions().any { instr ->
                        instr is ReferenceInstruction &&
                            (instr.reference as? FieldReference)?.let {
                                it.definingClass == "Lcom/p1/mobile/putong/data/LikersLimit;" && it.name == "remaining"
                            } == true
                    }
            }
            if (hasQuotaGate) {
                resolvedClasses["rbb0"] = classDef
                rbb0Type = classDef.type
            }
        }
        
        if ("svipRecoverStrategy" !in resolvedClasses &&
            "p_see_popup_expired_svip" in foundStrings &&
            classDef.methods.any { m ->
                !AccessFlags.STATIC.isSet(m.accessFlags) && m.returnType == "Z" &&
                    m.parameterTypes.size == 1 &&
                    m.containsExactString("p_see_popup_expired_svip") &&
                    m.sharedCachedInstructions().any { instr ->
                        instr is ReferenceInstruction &&
                            ((instr.reference as? FieldReference)?.definingClass == SVIP_SEE_RECOVER_DLG ||
                                (instr.reference as? MethodReference)?.definingClass == SVIP_SEE_RECOVER_DLG)
                    }
            }) {
            resolvedClasses["svipRecoverStrategy"] = classDef
        }

        if ("visitorsDiscountBanner" !in resolvedClasses &&
            "p_intl_visitors_list,e_intl_me_tab_visitors_old_visitor_discount_entry_banner,click" in foundStrings &&
            methodCallFull.any { it.contains("IntlDiscountEntryBannerView;.<init>") }) {
            resolvedClasses["visitorsDiscountBanner"] = classDef
        }

        if ("meetDiscountBanner" !in resolvedClasses &&
            "p_meet_view,e_intl_meet_visitors_new_visitor_discount_entry_banner,click" in foundStrings &&
            methodCallFull.any { it.contains("IntlDiscountEntryBannerView;.<init>") }) {
            resolvedClasses["meetDiscountBanner"] = classDef
        }

        if ("proximityBubble" !in resolvedClasses &&
            "distance" in foundStrings &&
            classDef.methods.any { m ->
                m.returnType == "V" &&
                    m.parameterTypes.any { it == "Lcom/p1/mobile/putong/core/data/Figure;" } &&
                    m.parameterTypes.any { it == "Ljava/lang/CharSequence;" } &&
                    m.containsExactString("distance")
            }) {
            resolvedClasses["proximityBubble"] = classDef
        }
        
        if ("secretCrush" !in resolvedClasses && !isSettingsUi && "Lcom/p1/mobile/putong/data/Counter;.secretCrushLimit" in foundFields && 
            "Lcom/p1/mobile/putong/data/CounterSecretCrushLimit;.remaining" in foundFields) {
            resolvedClasses["secretCrush"] = classDef
        }
        if ("greetingCounter" !in resolvedClasses && !isSettingsUi && "Lcom/p1/mobile/putong/core/data/GreetingCounter;.replyThanksRemain" in foundFields) {
            resolvedClasses["greetingCounter"] = classDef
        }
        if ("swipeRateLimit" !in resolvedClasses && !isSettingsUi && "Lcom/p1/mobile/putong/core/data/SwipeRateLimitConfig;.enable" in foundFields) {
            resolvedClasses["swipeRateLimit"] = classDef
        }
        if ("leftSwipeLimit" !in resolvedClasses && !isSettingsUi && "Lcom/p1/mobile/putong/core/data/LeftSwipeLimitConfig;.swipeLimit" in foundFields) {
            resolvedClasses["leftSwipeLimit"] = classDef
        }
        if ("intlUltraPremium" !in resolvedClasses && !isSettingsUi && "Lcom/p1/mobile/putong/core/data/IntlUltraPremiumConfig;.androidEnable" in foundFields) {
            resolvedClasses["intlUltraPremium"] = classDef
        }
        if ("coreData" !in resolvedClasses && !isSettingsUi && "Lcom/p1/mobile/putong/core/data/CoreData;.surpriseGiftExpirationTime" in foundFields) {
            resolvedClasses["coreData"] = classDef
        }
        if ("mb90" !in resolvedClasses && !isSettingsUi && "Lcom/p1/mobile/putong/data/User;.isVIP" in foundFields && 
            "Lcom/p1/mobile/putong/core/data/PurchaseType;.TYPE_ROAMING_PKG" in foundFields && !classDef.type.contains("/ui/settings/")) {
            val hasPurchaseTypeZ = classDef.methods.any { it.parameterTypes.size == 1 && it.parameterTypes[0] == "Lcom/p1/mobile/putong/core/data/PurchaseType;" && it.returnType == "Z" }
            if (hasPurchaseTypeZ) resolvedClasses["mb90"] = classDef
        }
        if ("businessEntranceAdapter" !in resolvedClasses && "open_fill_info_debug" in foundStrings && "clear" in methodCallFull.map { it.split(".").last() }) {
            resolvedClasses["businessEntranceAdapter"] = classDef
        }
        
        if ("pm6" !in resolvedClasses && "fromWhoLikedMe" in foundStrings &&
            "Lcom/p1/mobile/putong/core/data/Conversation;.property" in foundFields &&
            methodCallFull.any { it.contains("isFemale") }) {
            resolvedClasses["pm6"] = classDef
        }
        
        if ("bhe0" !in resolvedClasses && "e_red_dot_message_see" in foundStrings &&
            methodCallFull.any { it.contains("Lcom/p1/mobile/putong/core/newui/messages/business/BusinessEntranceStyle;") }) {
            resolvedClasses["bhe0"] = classDef
        }
        
        val hasCharSeqM = classDef.methods.any { it.name == "m" && it.parameterTypes.isEmpty() && it.returnType == "Ljava/lang/CharSequence;" }
        val hasCharSeqN = classDef.methods.any { it.name == "n" && it.parameterTypes.isEmpty() && it.returnType == "Ljava/lang/CharSequence;" }
        
        if (hasCharSeqM && hasCharSeqN) {
            val hasPairReturn = classDef.methods.any { it.returnType == "Landroid/util/Pair;" }
            val hasVPairMethod = classDef.methods.any { it.name == "v" && it.returnType == "Landroid/util/Pair;" }
            val hasGStringReturn = methodCallFullSigs.any { it.contains(".G.") && it.endsWith(".Ljava/lang/String;") }
            
            if ("vqo" !in resolvedClasses && hasVPairMethod && hasGStringReturn) {
                resolvedClasses["vqo"] = classDef
            }
        }
        
        if ("meetNewLikersData" !in resolvedClasses && "MeetLikersNewLikersData" in foundStrings &&
            classDef.methods.any { it.parameterTypes.isEmpty() && it.returnType == "I" && it.name != "hashCode" }) {
            resolvedClasses["meetNewLikersData"] = classDef
        }
        
        if ("intlMeetNewLikersData" !in resolvedClasses && "IntlMeetLikersNewLikersData" in foundStrings &&
            classDef.methods.any { it.parameterTypes.isEmpty() && it.returnType == "I" && it.name != "hashCode" }) {
            resolvedClasses["intlMeetNewLikersData"] = classDef
        }
        
        if ("intlMeetNewLikersAdapter" !in resolvedClasses &&
            methodCallFull.any { it.contains("Lcom/p1/mobile/putong/core/newui/intlmeet/likers/items/IntlMeetLikersNewLikersItem;") }) {
            resolvedClasses["intlMeetNewLikersAdapter"] = classDef
        }
        
        if ("meetNewLikersAdapter" !in resolvedClasses &&
            methodCallFull.any { it.contains("Lcom/p1/mobile/putong/core/newui/meet/likers/items/MeetLikersNewLikersItem;") }) {
            resolvedClasses["meetNewLikersAdapter"] = classDef
        }
        
        if ("ae9" !in resolvedClasses && !isSettingsUi &&
            "Lcom/p1/mobile/putong/core/data/UltraRightsUpgradeInfo;.isCanUpgradeUltra" in foundFields &&
            "Lcom/p1/mobile/putong/ab/IntlCountryCodeController;.f" in foundMethods) {
            resolvedClasses["ae9"] = classDef
        }
        
        // c4m0: VIP roaming location UI gate (7.5.6.1 yan.a(Act,String,String)Z). The gate reads
        // PurchaseType.TYPE_ROAMING_PKG; the old VipLocationHistoryAct reference is now a held
        // field (no method call), so anchor on the static (Act,String,String)Z method that itself
        // reads TYPE_ROAMING_PKG rather than a class-wide call anchor.
        if ("c4m0" !in resolvedClasses && !isSettingsUi &&
            "Lcom/p1/mobile/putong/core/data/PurchaseType;.TYPE_ROAMING_PKG" in foundFields) {
            val hasRoamingGate = classDef.methods.any { m ->
                AccessFlags.STATIC.isSet(m.accessFlags) &&
                m.returnType == "Z" &&
                m.parameterTypes == listOf("Lcom/p1/mobile/android/app/Act;", "Ljava/lang/String;", "Ljava/lang/String;") &&
                m.sharedCachedInstructions().any { instr ->
                    instr is ReferenceInstruction &&
                        (instr.reference as? FieldReference)?.let {
                            it.definingClass == "Lcom/p1/mobile/putong/core/data/PurchaseType;" && it.name == "TYPE_ROAMING_PKG"
                        } == true
                }
            }
            if (hasRoamingGate) resolvedClasses["c4m0"] = classDef
        }
        
        if ("businessEntranceStateManager" !in resolvedClasses &&
            "business_entrance_last_show_time" in foundStrings &&
            "today_new_likes_changed" in foundStrings &&
            classDef.methods.any { it.name == "b" && AccessFlags.STATIC.isSet(it.accessFlags) &&
                                  it.returnType == classDef.type }) {
            resolvedClasses["businessEntranceStateManager"] = classDef
        }
        
        if ("serverDataFlagSetter" !in resolvedClasses &&
            methodCallFull.any { it.contains("hkd0") && it.contains(".b") } &&
            classDef.methods.any { it.name == "S0" && it.parameterTypes.size == 1 &&
                                  it.parameterTypes[0] == "Z" && it.returnType == "V" }) {
            resolvedClasses["serverDataFlagSetter"] = classDef
        }
        
        if ("newLikesFlagSetter" !in resolvedClasses &&
            methodCallFull.any { it.contains("hkd0") && it.contains(".l") } &&
            classDef.methods.any { it.name == "G" && it.parameterTypes.size == 1 && it.returnType == "V" }) {
            resolvedClasses["newLikesFlagSetter"] = classDef
        }
        
        if ("profilePageBanner" !in resolvedClasses &&
            "e_see_who_liked_me_banner" in foundStrings &&
            classDef.methods.any { it.name == "l" && it.parameterTypes.isEmpty() && it.returnType == "Z" } &&
            classDef.methods.any { it.name == "t" && it.parameterTypes.isEmpty() && it.returnType == "V" }) {
            resolvedClasses["profilePageBanner"] = classDef
        }
        
        if ("suggestedUsersBanner" !in resolvedClasses &&
            "p_suggest_user_profile_info_view" in foundStrings &&
            classDef.methods.any { it.name == "B" && it.parameterTypes.size == 4 && it.returnType == "V" }) {
            resolvedClasses["suggestedUsersBanner"] = classDef
        }
        
        if ("profileImagesHolder" !in resolvedClasses &&
            "Lcom/p1/mobile/putong/data/User;.pictures" in foundFields &&
            classDef.methods.any { m ->
                !AccessFlags.STATIC.isSet(m.accessFlags) && m.returnType == "V" && m.parameterTypes.isEmpty() &&
                    m.sharedCachedInstructions().any { instr ->
                        instr is ReferenceInstruction && (instr.reference as? FieldReference)?.let {
                            it.definingClass == "Lcom/p1/mobile/putong/data/User;" && it.name == "pictures"
                        } == true
                    } &&
                    m.sharedCachedInstructions().any { instr ->
                        instr is ReferenceInstruction && (instr.reference as? MethodReference)?.let {
                            it.definingClass == "Lv/VPagerCircleIndicator;" && it.name == "c" &&
                                it.parameterTypes == listOf("Landroidx/viewpager/widget/ViewPager;", "I") &&
                                it.returnType == "V"
                        } == true
                    }
            }) {
            resolvedClasses["profileImagesHolder"] = classDef
        }
    }
    
    private fun resolveGms(foundStrings: Set<String>, classDef: ClassDef, classType: String) {
        if (classType == "Lcom/google/android/gms/common/internal/zzo;") return
        
        // Only patch actual GMS/Firebase/Google classes, not app classes that reference GMS strings
        // This prevents patching app network layers that happen to contain GMS-related headers
        val isGmsClass = classType.startsWith("Lcom/google/android/gms/") ||
            classType.startsWith("Lcom/google/firebase/") ||
            classType.startsWith("Lcom/google/android/gmscommon/") ||
            classType.startsWith("Lcom/cosmos/photon/") ||  // Tantan's GMS wrapper
            classType.startsWith("Lcom/p1/mobile/putong/data/extension/")  // Signature extension
        
        if (!isGmsClass) return
        
        val hasGmsString = foundStrings.any { it in gmsTargetStrings }
        if (!hasGmsString) return
        
        if ("gmsClasses" !in resolvedClasses) {
            resolvedClasses["gmsClasses"] = classDef
        } else {
            val key = "gmsClasses_${resolvedClasses.keys.count { it.startsWith("gmsClasses_") }}"
            resolvedClasses[key] = classDef
        }
    }
    
    private fun resolveLoveBuzz(foundFields: Set<String>, classDef: ClassDef) {
        val hasLoveBuzzField = foundFields.any { it.startsWith("LoveBuzzData.") }
        if (!hasLoveBuzzField) return
        
        if ("loveBuzzClasses" !in resolvedClasses) {
            resolvedClasses["loveBuzzClasses"] = classDef
        } else {
            val key = "loveBuzzClasses_${resolvedClasses.keys.count { it.startsWith("loveBuzzClasses_") }}"
            resolvedClasses[key] = classDef
        }
    }
    
    private fun resolvePrivacy(foundStrings: Set<String>, classDef: ClassDef) {
        for ((key, anchors) in privacyAnchors) {
            if (key !in resolvedClasses && foundStrings.containsAll(anchors)) {
                resolvedClasses["privacy_$key"] = classDef
            }
        }
    }
    
    private fun resolveAds(foundStrings: Set<String>, classDef: ClassDef) {
        if ("profileCarouselAd" !in resolvedClasses &&
            "ca-app-pub-6567608331519569/1891609663" in foundStrings &&
            classDef.methods.any {
                it.parameterTypes.size == 2 &&
                    it.parameterTypes[0] == "Lcom/p1/mobile/android/app/Act;" &&
                    it.parameterTypes[1] == "Z" &&
                    it.returnType == "Ll/vpf;"
            }) {
            resolvedClasses["profileCarouselAd"] = classDef
        }
        if ("officialAdvert" !in resolvedClasses &&
            "ixxn_ad_channel" in foundStrings &&
            classDef.methods.any {
                it.parameterTypes.size == 2 &&
                    it.parameterTypes[0] == "Lcom/p1/mobile/android/app/Act;" &&
                    it.parameterTypes[1] == "Landroid/view/ViewGroup;" &&
                    it.returnType == "V"
            }) {
            resolvedClasses["officialAdvert"] = classDef
        }
        if ("adRewardDialog" !in resolvedClasses &&
            "p_incentive_ad_choose_page" in foundStrings &&
            classDef.methods.any {
                it.parameterTypes.size == 1 &&
                    it.parameterTypes[0] == "Lcom/p1/mobile/putong/data/AdConfiguration;" &&
                    it.returnType == "Z"
            }) {
            resolvedClasses["adRewardDialog"] = classDef
        }
        if ("casualGameManager" !in resolvedClasses &&
            "/intl-live-casualGameMenu" in foundStrings &&
            classDef.methods.any {
                AccessFlags.STATIC.isSet(it.accessFlags) &&
                    it.returnType == "V" &&
                    it.parameterTypes == listOf("Z")
            }) {
            resolvedClasses["casualGameManager"] = classDef
        }
        if ("navBarAdHelper" !in resolvedClasses &&
            "intl_ad_show_bottom_banner" in foundStrings &&
            "ttt_tab_bar_bottom_banner" in foundStrings &&
            classDef.methods.any {
                AccessFlags.STATIC.isSet(it.accessFlags) &&
                    it.returnType == "Z" &&
                    it.parameterTypes == listOf("Lkotlin/jvm/functions/Function0;")
            }) {
            resolvedClasses["navBarAdHelper"] = classDef
        }
    }

    private fun resolveMisc(foundStrings: Set<String>, foundFields: Set<String>, classDef: ClassDef) {
        if ("screenshotWarning" !in resolvedClasses && "p_get_screenshoot_warning" in foundStrings &&
            classDef.methods.any {
                AccessFlags.STATIC.isSet(it.accessFlags) && it.returnType == "Z" && it.parameterTypes.isEmpty()
            }) {
            resolvedClasses["screenshotWarning"] = classDef
        }

        if ("uxQuestionnaire" !in resolvedClasses && "/experience-questionnaire?scene=" in foundStrings &&
            classDef.methods.any { m ->
                m.returnType == "Ll/vpf;" &&
                    m.containsExactString("/experience-questionnaire?scene=")
            }) {
            resolvedClasses["uxQuestionnaire"] = classDef
        }

        if ("recallMatchPopup" !in resolvedClasses &&
            "p_recall_match_popup" in foundStrings && "p_match_invitation_popup" in foundStrings &&
            classDef.methods.any { m ->
                m.returnType == "V" && m.parameterTypes.size == 3 &&
                    m.parameterTypes[0] == "Lcom/p1/mobile/android/app/Act;" &&
                    m.parameterTypes[1] == "Lcom/p1/mobile/putong/core/data/GrowthPushConfig;" &&
                    m.containsExactString("p_recall_match_popup") &&
                    m.containsExactString("p_match_invitation_popup")
            }) {
            resolvedClasses["recallMatchPopup"] = classDef
        }

        if ("pushPoster" !in resolvedClasses && "bundle_from_notification" in foundStrings &&
            classDef.methods.any {
                AccessFlags.STATIC.isSet(it.accessFlags) && it.returnType == "V" &&
                    it.parameterTypes == listOf(
                        "Lcom/p1/mobile/putong/data/PushMessage;",
                        "Landroid/app/PendingIntent;",
                        "Landroid/content/Intent;",
                        "Landroidx/core/app/NotificationCompat${'$'}Action;",
                        "Landroidx/core/app/NotificationCompat${'$'}Action;"
                    )
            }) {
            resolvedClasses["pushPoster"] = classDef
        }

        // buzzProlong is a compile-time String constant on SummarizedPrivilegesId, so it is
        // INLINED to const-string in consumers (gotcha #18) — anchor on the string co-occurring
        // with a ()I method, not a field access. SummarizedPrivilegesId itself only carries the
        // string in <clinit> (()V), so the shape check excludes it.
        if ("buzzProlong" !in resolvedClasses && "buzzProlong" in foundStrings &&
            classDef.methods.any { m ->
                m.returnType == "I" && m.parameterTypes.isEmpty() && m.containsExactString("buzzProlong")
            }) {
            resolvedClasses["buzzProlong"] = classDef
        }

        // Telepathy reply-length gate (7.5.6.1 x3r.b(g6m)Z): the gate now takes the telepathy
        // view-model (obfuscated g6m), not TpTelepathyConv directly, but still reads the stable
        // TpTelepathyConv.replyLengthLimit field. Match any single-reference-param static ()Z
        // carrier of that field (version-agnostic; do not hardcode the obfuscated param type).
        if ("telepathyReplyLimit" !in resolvedClasses &&
            "Lcom/p1/mobile/putong/core/data/TpTelepathyConv;.replyLengthLimit" in foundFields &&
            classDef.methods.any { m ->
                AccessFlags.STATIC.isSet(m.accessFlags) && m.returnType == "Z" &&
                    m.parameterTypes.size == 1 &&
                    m.parameterTypes[0].startsWith("L") &&
                    m.sharedCachedInstructions().any { instr ->
                        instr is ReferenceInstruction &&
                            (instr.reference as? FieldReference)?.let {
                                it.definingClass == "Lcom/p1/mobile/putong/core/data/TpTelepathyConv;" &&
                                    it.name == "replyLengthLimit"
                            } == true
                    }
            }) {
            resolvedClasses["telepathyReplyLimit"] = classDef
        }

        // RemoteConfig accessor (7.5.6.1 ngi): the stable RemoteConfig class was obfuscated; only
        // RemoteConfig$ConfigStep / RemoteConfigException keep the name. Anchor on the unique
        // "saved_device_uid_md5" pref key + the (String)String / (String)Z / (String,I)I getter trio.
        if ("remoteConfig" !in resolvedClasses && "saved_device_uid_md5" in foundStrings &&
            classDef.methods.any { it.parameterTypes == listOf("Ljava/lang/String;") && it.returnType == "Ljava/lang/String;" } &&
            classDef.methods.any { it.parameterTypes == listOf("Ljava/lang/String;") && it.returnType == "Z" } &&
            classDef.methods.any { it.parameterTypes == listOf("Ljava/lang/String;", "I") && it.returnType == "I" }) {
            resolvedClasses["remoteConfig"] = classDef
        }

        // AB-test accessor (7.5.6.1 q.t): ABManager was obfuscated (only ABManager$Mode keeps the
        // name). Anchor on the unique "newabgroups_mode_device" pref key + a public static
        // (String)String getter (the live AB bucket map read).
        if ("abManager" !in resolvedClasses && "newabgroups_mode_device" in foundStrings &&
            classDef.methods.any {
                AccessFlags.STATIC.isSet(it.accessFlags) && AccessFlags.PUBLIC.isSet(it.accessFlags) &&
                    it.parameterTypes == listOf("Ljava/lang/String;") && it.returnType == "Ljava/lang/String;"
            }) {
            resolvedClasses["abManager"] = classDef
        }

        // OMS morph promo router (7.5.6.1 btf.c, was hn60.n): server-driven morph promos bypass
        // the ssf M/N gate. Anchor on "oms_mercury" + the public instance (Act,OMSDialogInfo)Z
        // shape (OmsPageAct also carries the string but its method is ()V, so shape excludes it).
        if ("morphRouter" !in resolvedClasses && "oms_mercury" in foundStrings &&
            classDef.methods.any {
                it.returnType == "Z" &&
                    it.parameterTypes == listOf("Lcom/p1/mobile/android/app/Act;", "Lcom/p1/mobile/putong/data/OMSDialogInfo;") &&
                    AccessFlags.PUBLIC.isSet(it.accessFlags) && !AccessFlags.STATIC.isSet(it.accessFlags)
            }) {
            resolvedClasses["morphRouter"] = classDef
        }

        // Conversation persistence facade (7.5.6.1 mc3.G1): every local fake-conversation
        // factory lambda upserts through this single public static (Conversation)V entry
        // (no server-merge caller). Anchor on the unique whisper-order query key + the
        // static (Conversation)V shape; the consumer additionally requires the DB upsert call.
        if ("convUpsert" !in resolvedClasses && "intlWhisperConversationOrder" in foundStrings &&
            classDef.methods.any {
                AccessFlags.PUBLIC.isSet(it.accessFlags) && AccessFlags.STATIC.isSet(it.accessFlags) &&
                    it.returnType == "V" &&
                    it.parameterTypes == listOf("Lcom/p1/mobile/putong/core/data/Conversation;")
            }) {
            resolvedClasses["convUpsert"] = classDef
        }

        if ("letterCoinGate" !in resolvedClasses &&
            "tantan_coin_intl_letter_confirm_dialog_shown_" in foundStrings &&
            "Lcom/p1/mobile/putong/core/data/Privilege;.letter" in foundFields) {
            resolvedClasses["letterCoinGate"] = classDef
        }

        if ("aiChatGuideVm" !in resolvedClasses &&
            "aiChatAdvice" in foundStrings && "aiChatAnalysis" in foundStrings &&
            classDef.methods.any { m ->
                m.returnType == "Z" && m.parameterTypes.isEmpty() &&
                    m.containsExactString("aiChatAdvice") &&
                    m.sharedCachedInstructions().any { instr ->
                        instr is ReferenceInstruction && (instr.reference as? FieldReference)?.let {
                            it.definingClass == "Lcom/p1/mobile/putong/core/data/AiChatAdviceConvs;" &&
                                it.name == "adviceConvList"
                        } == true
                    }
            }) {
            resolvedClasses["aiChatGuideVm"] = classDef
        }

        if ("aiChatGuideListener" !in resolvedClasses &&
            "aiChatAdvice" in foundStrings && "aiChatAnalysis" in foundStrings &&
            classDef.fields.any { it.type == "Lcom/p1/mobile/putong/core/ui/messages/ItemAiChatGuideMessage;" } &&
            classDef.methods.any { m ->
                m.name == "onClick" && m.returnType == "V" &&
                    m.parameterTypes == listOf("Landroid/view/View;") &&
                    m.containsExactString("aiChatAdvice") && m.containsExactString("aiChatAnalysis")
            }) {
            resolvedClasses["aiChatGuideListener"] = classDef
        }

        if ("pinChatListener" !in resolvedClasses &&
            "pinChat" in foundStrings && "e_platinum_top_chat" in foundStrings &&
            classDef.methods.any { m ->
                m.name == "onClick" && m.returnType == "V" &&
                    m.parameterTypes == listOf("Landroid/view/View;") &&
                    m.containsExactString("pinChat") && m.containsExactString("e_platinum_top_chat")
            }) {
            resolvedClasses["pinChatListener"] = classDef
        }
    }

    // Patch-expansion keys (7.5.4 wave). All conditions are class-wide string+shape pairs —
    // never obfuscated names (gotcha #17), shape paired against inner-class hijack (gotcha #18).
    private fun resolveExpansion(foundStrings: Set<String>, classDef: ClassDef) {
        // Contacts sync pipeline (zf6): q() is the READ_CONTACTS permission gate; forcing it
        // false starves v() -> rx.c.empty() and the whole foreground-triggered upload chain.
        if ("contactsSync" !in resolvedClasses &&
            "checkContacts" in foundStrings && "contacts_new" in foundStrings &&
            classDef.methods.any {
                it.returnType == "Z" && it.parameterTypes.isEmpty() &&
                    it.containsExactString("android.permission.READ_CONTACTS")
            }) {
            resolvedClasses["contactsSync"] = classDef
        }

        // Clipboard invite-code readers: BOTH the live and campaign classes carry the same
        // regex, so collect every class with a no-arg method containing it (multi-class key).
        // In 7.5.6.1 the regex moved from ()String readers (eev.e3/zq4.m4) into ()V campaign
        // senders (ay1.S1/n1c.u1), so accept both return shapes; the consumer empties/voids each.
        if ("tantan:.*邀请码：[A-Z|1-9]{4,}" in foundStrings &&
            classDef.methods.any {
                (it.returnType == "Ljava/lang/String;" || it.returnType == "V") &&
                    it.parameterTypes.isEmpty() &&
                    it.containsExactString("tantan:.*邀请码：[A-Z|1-9]{4,}")
            } &&
            clipboardInviteClasses.none { it.type == classDef.type }) {
            clipboardInviteClasses.add(classDef)
        }

        // MK live-H5 bridge (zv3): checkAppInstalled dispatcher. "pkg_android" lives in the
        // inner zv3$c, so anchor on the outer's dispatcher string + (JSONObject)V shape.
        if ("mkBridge" !in resolvedClasses && "checkAppInstalled" in foundStrings &&
            classDef.methods.any {
                it.returnType == "V" && it.parameterTypes.size == 1 &&
                    it.parameterTypes[0] == "Lorg/json/JSONObject;"
            }) {
            resolvedClasses["mkBridge"] = classDef
        }

        // Push click/delivery tracker (7.5.6.1 mb0): the endpoint string now lives only in a
        // synthetic tracking Runnable (mb0.run), not a static (PushTrackData)V method. Anchor on
        // the endpoint + run()V + the (PushTrackData,I) ctor. Both mb0 cases are analytics
        // (AppOpenWayStats + client-monitor upload); voiding run()V is safe. Do NOT touch the
        // functional push dispatcher hwh.g.
        if ("pushTracker" !in resolvedClasses &&
            "https://client-monitor.tantanapp.com/push?" in foundStrings &&
            classDef.methods.any { it.name == "run" && it.returnType == "V" && it.parameterTypes.isEmpty() } &&
            classDef.methods.any {
                it.name == "<init>" &&
                    it.parameterTypes == listOf("Lcom/p1/mobile/putong/api/push/PushTrackData;", "I")
            }) {
            resolvedClasses["pushTracker"] = classDef
        }

        // Superlike upsell bubbles (ihi0): promo config read in <clinit> + bubble id in C();
        // pair with the J(User,PutongFrag,View,I)String creator shape.
        if ("superlikeBubble" !in resolvedClasses &&
            "bubble_superlike_bubble" in foundStrings && "superlike_promotion_config" in foundStrings &&
            classDef.methods.any {
                it.returnType == "Ljava/lang/String;" && it.parameterTypes.size == 4 &&
                    it.parameterTypes[0] == "Lcom/p1/mobile/putong/data/User;" &&
                    it.parameterTypes[1] == "Lcom/p1/mobile/putong/app/PutongFrag;" &&
                    it.parameterTypes[2] == "Landroid/view/View;" &&
                    it.parameterTypes[3] == "I"
            }) {
            resolvedClasses["superlikeBubble"] = classDef
        }

        // Beatles install + upload facade (7.5.6.1 c41): the old init-check string is gone; the
        // unique "Please init Beatles!!!" log anchors c41. The upload enqueue is now the static
        // f(List,String,J,lmm)V (the old luw.m backend was inlined into it, and the luw$b runnable
        // merged into the shared zic dispatcher — do NOT void zic.run, it carries GA4 cases).
        // Voiding c41.f kills ALL upload enqueues (push xlog via a, feedback via g); local xlog
        // writing (v31.c) stays intact. The old 5-param install shape is gone.
        if ("beatles" !in resolvedClasses &&
            "Please init Beatles!!!" in foundStrings &&
            classDef.methods.any {
                AccessFlags.STATIC.isSet(it.accessFlags) && it.returnType == "V" &&
                    it.parameterTypes.size == 4 &&
                    it.parameterTypes[1] == "Ljava/lang/String;" &&
                    it.parameterTypes[2] == "J" &&
                    (it.parameterTypes[0] == "Ljava/util/List;" || it.parameterTypes[0] == "Ljava/util/Date;")
            }) {
            resolvedClasses["beatles"] = classDef
        }
        if ("seePurchaseGuide" !in resolvedClasses &&
            "p_no_match_see_purchase_guide_view" in foundStrings &&
            classDef.methods.any { it.parameterTypes.size == 1 && it.parameterTypes[0] == "Ljava/lang/Object;" && it.returnType == "V" }) {
            resolvedClasses["seePurchaseGuide"] = classDef
        }
        if ("seeAnimBubbleV" !in resolvedClasses &&
            classDef.methods.any { method ->
                AccessFlags.STATIC.isSet(method.accessFlags) && method.returnType == "V" &&
                    method.parameterTypes.size == 2 &&
                    method.parameterTypes[0].startsWith("Ll/") &&
                    method.parameterTypes[1] == "Ll/kk3;" &&
                    method.sharedCachedInstructions().any { instr ->
                        instr is ReferenceInstruction &&
                            (instr.reference as? FieldReference)?.name == "INTL_SEE_ANIM_BUBBLE"
                    }
            }) {
            resolvedClasses["seeAnimBubbleV"] = classDef
        }
        if ("seeAnimBubbleM1" !in resolvedClasses &&
            classDef.methods.any { method ->
                method.returnType == "Z" && method.parameterTypes.size == 1 &&
                    method.parameterTypes[0] == "Ll/kk3;" &&
                    method.sharedCachedInstructions().any { instr ->
                        instr is ReferenceInstruction &&
                            (instr.reference as? FieldReference)?.name == "INTL_SEE_ANIM_BUBBLE"
                    }
            }) {
            resolvedClasses["seeAnimBubbleM1"] = classDef
        }
        if ("repeatSuggestedCard" !in resolvedClasses &&
            "repeat suggested card" in foundStrings &&
            classDef.methods.any { it.parameterTypes.size == 1 && it.parameterTypes[0] == "Ljava/lang/Object;" && it.returnType == "V" }) {
            resolvedClasses["repeatSuggestedCard"] = classDef
        }
        if ("icebreakLimit" !in resolvedClasses &&
            "msg_ice_break_config_v2" in foundStrings &&
            classDef.methods.any { method ->
                method.parameterTypes.size == 1 && method.parameterTypes[0] == "Ljava/lang/Object;" &&
                    method.returnType == "Ljava/lang/Object;" &&
                    method.sharedCachedInstructions().any { instr ->
                        instr is ReferenceInstruction &&
                            (instr.reference as? FieldReference)?.name == "iceBreakLastMessageShowCountLimit"
                    }
            }) {
            resolvedClasses["icebreakLimit"] = classDef
        }
    }

    fun getAnalyticsClass(key: String): ClassDef? = resolvedClasses[key]
    fun getUiCleanupClass(key: String): ClassDef? = resolvedClasses[key]
    fun getDialogClass(key: String): ClassDef? = resolvedClasses[key]
    fun getPremiumClass(key: String): ClassDef? = resolvedClasses[key]
    fun getMiscClass(key: String): ClassDef? = resolvedClasses[key]
    fun getGmsClasses(): List<ClassDef> = resolvedClasses.filter { it.key.startsWith("gmsClasses") }.values.toList()
    fun getLoveBuzzClasses(): List<ClassDef> = resolvedClasses.filter { it.key.startsWith("loveBuzzClasses") }.values.toList()
    fun getTypingIndicatorClasses(): List<ClassDef> = typingIndicatorClasses.toList()
    fun getTypingSinkClass(): ClassDef? = resolvedClasses["typingSink"]
    fun getMeTabPagerClasses(): List<ClassDef> = meTabPagerClasses.toList()
    fun getPrivacyClass(key: String): ClassDef? = resolvedClasses["privacy_$key"]
    fun getAdClass(key: String): ClassDef? = resolvedClasses[key]
    fun getClipboardInviteClasses(): List<ClassDef> = clipboardInviteClasses.toList()
    fun getMixedContentClasses(): List<ClassDef> = mixedContentClasses.toList()
    fun getLocationUploadGateCandidates(): List<ClassDef> = locationUploadGateCandidates.toList()
}
