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
import com.android.tools.smali.dexlib2.iface.reference.FieldReference
import com.android.tools.smali.dexlib2.iface.reference.MethodReference
import com.android.tools.smali.dexlib2.iface.reference.StringReference

private val instructionCache = java.util.WeakHashMap<com.android.tools.smali.dexlib2.iface.Method, List<Instruction>>()

private fun com.android.tools.smali.dexlib2.iface.Method.cachedInstructions(): List<Instruction> =
    instructionCache.getOrPut(this) {
        implementation?.instructions?.toList() ?: emptyList()
    }

private const val RETURN_VOID = "return-void"

private const val RETURN_FALSE = """
    const/4 v0, 0x0
    return v0
"""

private const val RETURN_EMPTY_STRING = """
    const-string v0, ""
    return-object v0
"""

private val SHOW_LIKE_METHODS = setOf("show", "display", "init", "onResume")
private val AI_TRANSLATE_METHODS = setOf("show", "showGuide", "display")
private val NEW_FUNC_METHODS = setOf("show", "showGuide", "display")
private val DISCOUNT_METHODS = setOf("show", "display", "init", "bind", "setup")
private val BUZZ_METHODS = setOf("show", "display", "showPopup")

private val FINGERPRINT_METHOD_MAP = mapOf(
    "aiChatGuide" to SHOW_LIKE_METHODS,
    "discountEntryBanner" to DISCOUNT_METHODS,
    "buzzPopup" to BUZZ_METHODS,
)

private val FINGERPRINT_BOOL_METHOD_MAP = mapOf(
    "aiTranslateGuide" to "isGuideShown",
    "newFunctionGuide" to "isShown",
)

private val seeAnimTriggerClassFingerprint = Fingerprint(
    filters = listOf(string("IntlSeeAnimBubble")),
)

private val seeAnimRenderClassFingerprint = Fingerprint(
    filters = listOf(
        string("see_anim_bubble"),
        methodCall(name = "x6"),
    ),
)

private val seeWhoLikedMeBannerClassFingerprint = Fingerprint(
    filters = listOf(
        string("e_see_who_liked_me_banner"),
        string("p_suggest_user_profile_info_view"),
    ),
)

private val seeWhoLikedMeProfileCardFingerprint = Fingerprint(
    filters = listOf(
        string("e_see_who_liked_me_banner"),
        fieldAccess(name = "receivedLikes"),
    ),
)

private val bubbleManagerClassFingerprint = Fingerprint(
    filters = listOf(string("MagicBubble")),
)

private val friendsOnlinePopupClassFingerprint = Fingerprint(
    filters = listOf(
        string("e_friends_online_popup"),
        string("[See_Toast]"),
    ),
)

@Suppress("unused")
@JvmField
val uiCleanupPatch = bytecodePatch(
    name = "UI Cleanup",
    description = "Removes guides, banners, stickers, decorations, and AI prompts",
    default = true,
) {
    compatibleWith(tantanCompatibility)
    execute {

        val resolver = getSharedResolver()

        val resolved = mutableMapOf<String, com.android.tools.smali.dexlib2.iface.ClassDef>()
        val uiKeys = listOf("aiChatGuide", "aiTranslateGuide",
            "newFunctionGuide", "discountEntryBanner", "buzzPopup")
        for (key in uiKeys) {
            resolver.getUiCleanupClass(key)?.let { resolved[key] = it }
        }

        for ((key, classDef) in resolved) {
            val mutable = mutableClassDefBy(classDef)
            when (key) {
                "aiTranslateGuide" -> {
                    mutable.methods.forEach { method ->
                        if (method.name in AI_TRANSLATE_METHODS && method.returnType == "V") {
                            method.addInstructions(0, RETURN_VOID)
                        }
                        if (method.name == "isGuideShown" && method.returnType == "Z") {
                            method.addInstructions(0, RETURN_FALSE)
                        }
                    }
                }
                "newFunctionGuide" -> {
                    mutable.methods.forEach { method ->
                        if (method.name in NEW_FUNC_METHODS && method.returnType == "V") {
                            method.addInstructions(0, RETURN_VOID)
                        }
                        if (method.name == "isShown" && method.returnType == "Z") {
                            method.addInstructions(0, RETURN_FALSE)
                        }
                    }
                }
                else -> {
                    val targetMethods = FINGERPRINT_METHOD_MAP[key]
                    if (targetMethods != null) {
                        mutable.methods.forEach { method ->
                            if (method.name in targetMethods && method.returnType == "V") {
                                method.addInstructions(0, RETURN_VOID)
                            }
                        }
                    }
                }
            }
        }

        classDefByOrNull("Lcom/p1/mobile/putong/core/ui/popup/ProfileThinPopup;")?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.name == "initDataOnCreate" && method.returnType == "V") {
                    method.addInstructions(0, RETURN_VOID)
                }
            }
        }

        classDefByOrNull("Lcom/p1/mobile/putong/core/ui/profile/CityTopGreetDialog;")?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.name == "show" && method.returnType == "V") {
                    method.addInstructions(0, RETURN_VOID)
                }
            }
        }

        val guideViewDescriptors = listOf(
            "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEnhancedPromotionBannerView;",
            "Lcom/p1/mobile/putong/core/newui/home/views/SuperLikeBannerView;",
            "Lcom/p1/mobile/putong/core/newui/home/views/innerpush/ComplimentReceivedBannerLayout;",
            "Lcom/p1/mobile/putong/core/ui/operation/OperationBannerView;",
            "Lcom/p1/mobile/putong/core/newui/home/views/NewUserSpecialLikeBannerView;",
            "Lcom/p1/mobile/putong/core/ui/popup/ProfileFakeView;",
            "Lcom/p1/mobile/putong/core/ui/home/virtualcard/SuperLikeOrUndoGuideCardView;",
            "Lcom/p1/mobile/putong/core/newui/boost/BoostGuideCardView;",
            "Lcom/p1/mobile/putong/core/ui/superlikeopt/upgrade/SendMultiSuperLikePushBubble;",
            "Lcom/p1/mobile/putong/core/newui/home/intlslguide/IntlSlGuideDialog;",
            "Lcom/p1/mobile/putong/core/newui/profile/newme/ProfilePrivilegePayGuide;",
            "Lcom/p1/mobile/putong/core/newui/boost/BoostGuidePushLayout;",
            "Lcom/p1/mobile/putong/core/newui/messages/ConversationItemInstantChatGuideView;",
            "Lcom/p1/mobile/putong/core/newui/messages/ConversationRealEcrGuideLayout;",
            "Lcom/p1/mobile/putong/core/newui/femalevip/FemaleVipGuideCardView;",
            "Lcom/p1/mobile/putong/core/newui/femalevip/FemaleVerificationGuideCardView;",
            "Lcom/p1/mobile/putong/core/newui/home/card/expanded/view/ExpandedGuideLayout;",
            "Lcom/p1/mobile/putong/core/newui/home/card/expanded/view/SuperLikeExpGuideView;",
            "Lcom/p1/mobile/putong/core/newui/home/card/expanded/view/SuperLikeGuideView;",
            "Lcom/p1/mobile/putong/core/newui/home/card/expanded/view/ExpandedIdealGuideLayout;",
            "Lcom/p1/mobile/putong/core/newui/home/views/CardAuthenticationGuideView;",
            "Lcom/p1/mobile/putong/core/ui/messages/ItemIntlReadReceiptsGuide;",
            "Lcom/p1/mobile/putong/core/ui/messages/ItemPlatinumPinGuideMessage;",
            "Lcom/p1/mobile/putong/core/ui/messages/ItemBlindBoxGuideView;",
            "Lcom/p1/mobile/putong/core/ui/messages/question/MaleChatGuideView;",
            "Lcom/p1/mobile/putong/core/ui/messages/ItemMomentGuide;",
            "Lcom/p1/mobile/putong/core/ui/messages/ItemMomentPostGuide;",
            "Lcom/p1/mobile/putong/core/ui/messages/ItemMomentGuidePhaseTwo;",
            "Lcom/p1/mobile/putong/core/ui/messages/MessagePicLikeGuideLayout;",
            "Lcom/p1/mobile/putong/core/ui/messages/view/MessageLoveLetterGuideView;",
            "Lcom/p1/mobile/putong/core/ui/vip/letter/IntlVipLetterGuideViewForProfile;",
            "Lcom/p1/mobile/putong/core/ui/vip/picks/view/PicksGuideView;",
            "Lcom/p1/mobile/putong/core/ui/vip/picks/view/PicksGuideCarouselView;",
            "Lcom/p1/mobile/putong/core/ui/purchase/CoinGuideView;",
            "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceGuideSigningView;",
            "Lcom/p1/mobile/putong/core/ui/banner/DrawerBannersView;",
            "Lcom/p1/mobile/putong/feed/newui/status/improve/FeedStatusPostGuidePopView;",
            "Lcom/p1/mobile/putong/core/newui/profile/newmine/newprofile/view/UploadGuideImageView;",
            "Lcom/p1/mobile/putong/core/ui/messages/ItemODiamondVisitorGuideMessage;",
            "Lcom/p1/mobile/putong/core/ui/messages/ItemPicCertGuide;",
            "Lcom/p1/mobile/putong/core/ui/messages/ItemAddArtworkGuide;",
            "Lcom/p1/mobile/putong/core/ui/messages/ItemAddTagsGuide;",
            "Lcom/p1/mobile/putong/core/ui/messages/ItemTagGuide;",
            "Lcom/p1/mobile/putong/core/ui/messages/ItemGreetGuidePic;",
            "Lcom/p1/mobile/putong/core/ui/messages/NoMatchSeeGuideDialog;",
            "Lcom/p1/mobile/putong/core/newui/home/views/IntlEmojiSimpleCoverGuideView;",
            "Lcom/p1/mobile/putong/core/ui/verification/AgeVerificationSingleGuideView;",
            "Lcom/p1/mobile/putong/core/ui/verification/AgeVerificationDoubleGuideView;",
            "Lcom/p1/mobile/putong/core/ui/promotion/PurchasePromotionItemView;",
            "Lcom/p1/mobile/putong/core/ui/promotion/PurchasePromotionTitleView;",
            "Lcom/p1/mobile/putong/core/ui/banner/view/PromotionPendantView;",
            "Lcom/p1/mobile/putong/core/ui/purchase/intlpage/discountentry/IntlDiscountEntryBannerView;",
            "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntrancePromotionBottomView;",
            "Lcom/p1/mobile/putong/core/newui/view/PicCertGuideView;",
            "Lcom/p1/mobile/putong/core/ui/growth/swipeguide/SwipeGuideLeftView;",
            "Lcom/p1/mobile/putong/core/ui/growth/swipeguide/SwipeGuideRightView;",
            "Lcom/p1/mobile/putong/core/newui/home/intlslguide/IntlSlGuideDialogView;",
            "Lcom/p1/mobile/putong/core/newui/home/views/SuperLikeBanner;",
            "Lcom/p1/mobile/putong/core/ui/messages/LetterGuideView_IntlB;",
            "Lcom/p1/mobile/putong/core/newui/home/card/expanded/view/ExpandedGuideBgView;",
            "Lcom/p1/mobile/putong/ui/guidetip/GuideTipsView;",
            "Lcom/p1/mobile/putong/core/newui/newmeet/feed/likers/MeetPromotionItemView;",
            "Lcom/p1/mobile/putong/core/ui/operation/OperationBannerFeedView;",
            "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceDefaultView;",
            "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceHasPrivilegeView;",
            "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceODiamondSingleView;",
            "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntrancePaymentView;",
            "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntrancePrivilegeTopView;",
            "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceSingleTextView;",
            "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceSingleTextWithIconBgView;",

            "Lcom/p1/mobile/putong/core/newui/messages/ConversationItemBlindBoxEntrance;",
            "Lcom/p1/mobile/putong/core/newui/messages/ItemMatchIceBreakGuide;",
            "Lcom/p1/mobile/putong/core/ui/emoji/CoreCommendHintEmojiView;",
            "Lcom/p1/mobile/putong/core/ui/messages/ItemAiChatGuideMessage;",
            "Lcom/p1/mobile/putong/core/ui/messages/ItemAiP2PChatGuide;",
            "Lcom/p1/mobile/putong/core/ui/purchase/PurchaseUpgradeIntroView;",
            "Lcom/p1/mobile/putong/core/ui/purchase/showcase/NewUiGPPurchaseUpgradeSectionView;",
            "Lcom/p1/mobile/putong/core/ui/purchase/showcase/NewUiGPPurchaseUpgradeTip;",
            "Lcom/p1/mobile/putong/core/ui/purchase/showcase/ScrollerGPUpgradePurchaseSectionView;",
            "Lcom/p1/mobile/putong/core/ui/purchase/intlUpgrade/IntlUpgradePurchaseSheetItemView;",
            "Lcom/p1/mobile/putong/core/ui/growth/swipeguide/SwipeGuideSettingView;",
            "Lcom/p1/mobile/putong/feed/newui/photoalbum/view/FeedPersonalizeSuggestGuideView;",
            "Lcom/p1/mobile/putong/feed/newui/photoalbum/view/FeedRoamGuideView;",
            "Lcom/p1/mobile/putong/feed/newui/photoalbum/view/FeedPostGuideView;",
            "Lcom/p1/mobile/putong/feed/newui/photoalbum/guide/FeedMomentViewersOperationGuideView;",
            "Lcom/p1/mobile/putong/feed/newui/status/display/view/FeedStateSquareEntranceView;",
            "Lcom/p1/mobile/putong/live/external/internal/live/square/home/submodule/suggest/LiveBubbleGuideView;",
            "Lcom/p1/mobile/putong/live/external/intl/common/gameguide/IntlGameGuideDialogView;",
            "Lcom/p1/mobile/putong/live/external/intl/view/widgets/IntlLiveEntranceStartLiveView;",
            "Lcom/p1/mobile/putong/live/external/intl/view/widgets/IntlLiveSquareBannerView;",
            "Lcom/p1/mobile/putong/live/external/intl/view/widgets/IntlLiveSquareBannerItemView;",
            "Lcom/p1/mobile/putong/live/livingroom/intl/common/bottom/gamepanel/IntlGameBoardBannerView;",
            "Lcom/p1/mobile/putong/feed/newui/group/FeedGroupEntranceItemView;",
            "Lcom/p1/mobile/putong/feed/newui/photoalbum/live/FeedLiveRecommendView;",
            "Lcom/p1/mobile/putong/feed/newui/view/TopicRecommendView;",
            "Lcom/p1/mobile/putong/feed/newui/photoalbum/view/TopicRecommendTopicView;",
            "Lcom/p1/mobile/putong/feed/newui/photoalbum/view/TopicRecommendUserView;",

            "Lcom/p1/mobile/putong/live/livingroom/voice/intl/heatbox/VoiceLiveHeatBoxEntryView;",
            "Lcom/p1/mobile/putong/live/livingroom/voice/intl/increment/leaderboard/hourleaderboard/widget/VoiceLiveHourBoardEntryView;",
            "Lcom/p1/mobile/putong/live/livingroom/increment/leaderboard/intlstarboard/IntlLiveStarBoardEntryView;",
            "Lcom/p1/mobile/putong/live/livingroom/increment/leaderboard/intlstarboard/IntlLiveStarBoardEntryItemView;",
            "Lcom/p1/mobile/putong/live/external/intl/view/widgets/IntlLiveSquareActiveGiftDialogView;",
            "Lcom/p1/mobile/putong/live/external/intl/view/widgets/IntlLiveActivitiesEntryView;",
            "Lcom/p1/mobile/putong/live/external/intl/view/widgets/IntlLiveActivitiesEntryRead;",
            "Lcom/p1/mobile/putong/live/external/intl/view/widgets/IntlLiveActivitiesEntrySignIn;",
            "Lcom/p1/mobile/putong/live/external/intl/view/widgets/IntlLiveActivitiesEntryUnRead;",
            "Lcom/p1/mobile/putong/live/external/intl/view/widgets/IntlLiveActivitiesEntryOrigin;",

            "Lcom/p1/mobile/putong/core/newui/intlmeet/visitor/IntlMeetVisitorsEmptyItemView;",

            "Lcom/p1/mobile/putong/core/ui/nightclub/view/IntlNightClubDlgView;",
            "Lcom/p1/mobile/putong/core/ui/hideandseek/IntlHideAndSeekInfoView;",
            "Lcom/p1/mobile/putong/core/ui/aialbum/view/AiAlbumTemplatesView;",
            "Lcom/p1/mobile/putong/core/ui/constellationmatch/ConstellationInfoView;",
            "Lcom/p1/mobile/putong/feed/newui/photoalbum/view/FeedNewUserBubbleView;",
            "Lcom/p1/mobile/putong/core/ui/dlg/IntlMemberAnimView;",
        )
        guideViewDescriptors.forEach { descriptor ->
            classDefByOrNull(descriptor)?.let { classDef ->
                mutableClassDefBy(classDef).methods.forEach { method ->
                    if (method.name == "onFinishInflate" && method.returnType == "V") {
                        method.addInstructions(0, RETURN_VOID)
                    }
                }
            }
        }

        // Visitor "who viewed me" affiliate discount banners: IntlDiscountEntryBannerView
        // has no onFinishInflate (built programmatically), so the guideViewDescriptors entry
        // above is a no-op. Void the HOST methods that create+add the banner (liq.f / rcp.h,
        // (FrameLayout)V calling the banner <init>). Host refresh early-returns on banner==null.
        val discountBannerDesc = "Lcom/p1/mobile/putong/core/ui/purchase/intlpage/discountentry/IntlDiscountEntryBannerView;"
        listOf("visitorsDiscountBanner", "meetDiscountBanner").forEach { key ->
            resolver.getPremiumClass(key)?.let { classDef ->
                mutableClassDefBy(classDef).methods.forEach { method ->
                    val addsBanner = method.cachedInstructions().any { instr ->
                        instr is ReferenceInstruction && (instr.reference as? MethodReference)?.let {
                            it.definingClass == discountBannerDesc && it.name == "<init>"
                        } == true
                    }
                    if (method.returnType == "V" && method.parameterTypes.size == 1 &&
                        method.parameterTypes[0] == "Landroid/widget/FrameLayout;" && addsBanner
                    ) {
                        method.addInstructions(0, RETURN_VOID)
                    }
                }
            }
        }

        seeAnimTriggerClassFingerprint.matchOrNull()?.classDef?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                when {
                    method.returnType == "Z" && method.parameterTypes.any { it.contains("CoreLikers") } ->
                        method.addInstructions(0, RETURN_FALSE)
                    method.returnType == "V" && method.parameterTypes.any { it.contains("CoreLikers") } ->
                        method.addInstructions(0, RETURN_VOID)
                }
            }
        }

        seeAnimRenderClassFingerprint.matchOrNull()?.classDef?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.returnType == "I" && method.parameterTypes.isEmpty()) {
                    method.addInstructions(0, RETURN_FALSE)
                }
            }
        }

        seeWhoLikedMeBannerClassFingerprint.matchOrNull()?.classDef?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.name == "B" && method.returnType == "V") {
                    method.addInstructions(0, RETURN_VOID)
                }
            }
        }

        seeWhoLikedMeProfileCardFingerprint.matchOrNull()?.classDef?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                when {
                    method.name == "l" && method.returnType == "Z" ->
                        method.addInstructions(0, RETURN_FALSE)
                    method.name == "t" && method.returnType == "V" ->
                        method.addInstructions(0, RETURN_VOID)
                }
            }
        }

        classDefByOrNull("Lcom/p1/mobile/putong/core/view/LookUpView;")?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.name == "u" && method.returnType == "V") {
                    method.addInstructions(0, RETURN_VOID)
                }
            }
        }

        bubbleManagerClassFingerprint.matchOrNull()?.classDef?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.name == "i" && method.returnType == "V") {
                    method.addInstructions(0, RETURN_VOID)
                }
            }
        }

        classDefByOrNull("Lcom/p1/mobile/putong/core/newui/main/NewMainViewModel;")?.let { classDef ->
            mutableClassDefBy(classDef).methods
                .filter { method ->
                    method.returnType == "V" &&
                    method.parameterTypes.size == 6 &&
                    method.parameterTypes[0] == "Ljava/lang/CharSequence;" &&
                    method.parameterTypes.any { it.contains("Figure") }
                }
                .forEach { it.addInstructions(0, RETURN_VOID) }
        }

        resolver.getPremiumClass("proximityBubble")?.let { classDef ->
            mutableClassDefBy(classDef).methods
                .filter { method ->
                    method.returnType == "V" &&
                    method.parameterTypes.any { it.contains("Figure") } &&
                    method.cachedInstructions().any { instr ->
                        instr is ReferenceInstruction && instr.reference is StringReference &&
                        (instr.reference as StringReference).string == "distance"
                    }
                }
                .forEach { it.addInstructions(0, RETURN_VOID) }
        }

        classDefByOrNull("Lcom/p1/mobile/putong/core/api/CoreLikers;")?.let { classDef ->
            mutableClassDefBy(classDef).methods
                .filter { method ->
                    method.cachedInstructions().any { instr ->
                        instr is ReferenceInstruction && instr.reference is StringReference &&
                        (instr.reference as StringReference).string == "likers_for_popup_distance"
                    }
                }
                .forEach { method ->
                    method.addInstructions(0, "const/4 v0, 0x0\nreturn-object v0")
                }
        }

        friendsOnlinePopupClassFingerprint.matchOrNull()?.classDef?.let { classDef ->
            mutableClassDefBy(classDef).methods
                .filter { method ->
                    method.returnType == "V" &&
                    method.parameterTypes.size == 2 &&
                    method.parameterTypes.any { it.contains("ActionData") || it.contains("ActionToast") }
                }
                .forEach { it.addInstructions(0, RETURN_VOID) }
        }

        classDefByOrNull("Lcom/p1/mobile/putong/core/newui/messages/business/meet/MeetEntranceModel;")?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if ((method.name == "a" || method.name == "n") && method.returnType == "V" && method.parameterTypes.isEmpty()) {
                    method.addInstructions(0, RETURN_VOID)
                }
            }
        }

        classDefByOrNull("Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView;")?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.name == "e" && method.returnType == "V" && method.parameterTypes.size == 1) {
                    method.addInstructions(0, RETURN_VOID)
                }
            }
        }

        classDefByOrNull("Lcom/p1/mobile/putong/core/ui/gp/GpRateGuideDialog;")?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.name == "g" && method.returnType == "V" && method.parameterTypes.size == 2) {
                    method.addInstructions(0, RETURN_VOID)
                }
            }
        }

        classDefByOrNull("Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/BuzzComboEntranceView;")?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.name == "j0" && method.returnType == "V" && method.parameterTypes.isEmpty()) {
                    method.addInstructions(0, RETURN_VOID)
                }
            }
        }

        classDefByOrNull("Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/MemojiBuzzComboEntranceView;")?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.name == "n" && method.returnType == "V" && method.parameterTypes.size == 1) {
                    method.addInstructions(0, RETURN_VOID)
                }
            }
        }

        classDefByOrNull("Lcom/p1/mobile/putong/feed/newui/group/FeedGroupEntranceView;")?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.name == "X" && method.returnType == "V" && method.parameterTypes.size == 1) {
                    method.addInstructions(0, RETURN_VOID)
                }
            }
        }

        classDefByOrNull("Lcom/p1/mobile/putong/feed/newui/photoalbum/photoalbumactivities/FeedAlbumInterestedEntranceView;")?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.name == "B" && method.returnType == "V" && method.parameterTypes.isEmpty()) {
                    method.addInstructions(0, RETURN_VOID)
                }
            }
        }

        classDefByOrNull("Lcom/p1/mobile/putong/feed/newui/view/RoamEntranceView;")?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.name in setOf("b", "d") && method.returnType == "V") {
                    method.addInstructions(0, RETURN_VOID)
                }
            }
        }

        classDefByOrNull("Lcom/p1/mobile/putong/core/newui/profile/newme/revamp/common/MeTabRevampMemberCardHelper;")?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.name == "e" && method.returnType == "V" && method.parameterTypes.size == 4) {
                    method.addInstructions(0, RETURN_VOID)
                }
            }
        }

        classDefByOrNull("Lcom/p1/mobile/putong/core/api/CoreIntlAffiliatePromotions;")?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                when {
                    method.name == "O3" && method.returnType == "Z" && method.parameterTypes.isEmpty() ->
                        method.addInstructions(0, RETURN_FALSE)
                    method.name == "s3" && method.returnType.startsWith("L") && method.parameterTypes.isEmpty() ->
                        method.addInstructions(0, "const/4 v0, 0x0\nreturn-object v0")
                }
            }
        }

        classDefByOrNull("Lcom/p1/mobile/putong/live/external/intl/view/widgets/IntlVoiceActivitiesInChatView;")?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.name == "z" && method.returnType == "V" && method.parameterTypes.size == 1 && method.parameterTypes[0] == "I") {
                    method.addInstructions(0, RETURN_VOID)
                }
            }
        }

        // Patch CoreLikers.g7() to prevent "x people like you" promotional popup trigger
        classDefByOrNull("Lcom/p1/mobile/putong/core/api/CoreLikers;")?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.name == "g7" && method.returnType.startsWith("L")) {
                    method.addInstructions(0, "const/4 v0, 0x0\nreturn-object v0")
                }
            }
        }

        // Suppress the top-of-swipe-screen likers-float promo banner ("X more people liked you" /
        // "See who likes me"). The home presenter (obfuscated; 7.5.4 Ll/g350;) runs the pipeline
        //   CoreLikers.P6() -> filter(O3) -> throttle -> filter(J7) -> filter(K7) -> L7 -> NewMainAct.k7()
        // O3 is the FIRST filter: a STATIC Boolean(CoreLikers$a) predicate that returns true iff the
        // trigger is home_total_liker_float / home_new_liker_float. Forcing O3 -> Boolean.FALSE kills
        // the whole pipeline (the 2-line banner AND the related SEE_ANIM avatar bubble) without
        // touching other likers features (msg badge home_tab_msg, new_like_dialog, my_privilege_liker,
        // the See-Who-Likes-Me page). All NewMainAct.k7() callers are downstream of O3.
        //
        // The previous attempt anchored on string("home_total_liker_float")/string("home_new_liker_float")
        // and filtered returnType=="Z": that NEVER matched, because those triggers are ENUM FIELD
        // accesses (sget-object CoreLikers$LikersTriggerBy;->...), not const-string, and O3 returns
        // boxed Ljava/lang/Boolean; (not Z). The block was a no-op. Resolve the presenter via the
        // unique stable pref key "see_anim_show_times_after_launch" (g350-only), then select O3 by
        // static + Boolean return + CoreLikers$a param + both enum field accesses (cardinality 1;
        // J7/K7 are instance methods with an ii70 param, so they are excluded).
        val homePresenterClassFingerprint = Fingerprint(
            filters = listOf(
                string("see_anim_show_times_after_launch"),
            )
        )

        homePresenterClassFingerprint.matchOrNull()?.classDef?.let { classDef ->
            mutableClassDefBy(classDef).methods
                .filter { method ->
                    AccessFlags.STATIC.isSet(method.accessFlags) &&
                    method.returnType == "Ljava/lang/Boolean;" &&
                    method.parameterTypes.size == 1 &&
                    method.parameterTypes[0].startsWith("Lcom/p1/mobile/putong/core/api/CoreLikers") &&
                    method.cachedInstructions().any { instr ->
                        instr is ReferenceInstruction && instr.reference is FieldReference &&
                        (instr.reference as FieldReference).name == "home_total_liker_float"
                    } &&
                    method.cachedInstructions().any { instr ->
                        instr is ReferenceInstruction && instr.reference is FieldReference &&
                        (instr.reference as FieldReference).name == "home_new_liker_float"
                    }
                }
                .forEach { method ->
                    method.addInstructions(0, """
                        const/4 v0, 0x0
                        invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
                        move-result-object v0
                        return-object v0
                    """)
                }
        }

        // Positioning-authority guide popup creator (b2x.j). Resolver excludes the OmsDialog
        // enum and requires a static (Act,...)V creator carrying the popup key. Void it.
        resolver.getUiCleanupClass("positioningGuide")?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (AccessFlags.STATIC.isSet(method.accessFlags) && method.returnType == "V" &&
                    method.parameterTypes.isNotEmpty() &&
                    method.parameterTypes[0] == "Lcom/p1/mobile/android/app/Act;" &&
                    method.cachedInstructions().any { instr ->
                        instr is ReferenceInstruction && instr.reference is StringReference &&
                            (instr.reference as StringReference).string == "p_alert_positioning_authority_open_guide_popup"
                    }
                ) {
                    method.addInstructions(0, RETURN_VOID)
                }
            }
        }

        // Notification-permission nags (s160): void the two dialog creators G(Act,Z)V and
        // H(Act,I,Z)V. KEEP A() (user-initiated system-settings open) and u() (runtime request).
        val notifPermissionFingerprint = Fingerprint(filters = listOf(string("p_open_push_popup")))
        notifPermissionFingerprint.matchOrNull()?.classDef?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (!AccessFlags.STATIC.isSet(method.accessFlags) || method.returnType != "V") return@forEach
                val isCreator = method.parameterTypes.isNotEmpty() &&
                    method.parameterTypes[0] == "Lcom/p1/mobile/android/app/Act;" &&
                    ((method.parameterTypes.size == 2 && method.parameterTypes[1] == "Z") ||
                     (method.parameterTypes.size == 3 && method.parameterTypes[1] == "I" && method.parameterTypes[2] == "Z"))
                if (isCreator) method.addInstructions(0, RETURN_VOID)
            }
        }

        // Post-swipe marketing dispatcher (t5p.a): regular-sticker / flash time-sticker / quiz
        // popups all branch from this single static (I,BooleanRef,Act,Envelope)Unit method.
        // Mark the BooleanRef handled and return Unit so callers do not retry. Also void the
        // instance fetch/show entries m/n(Act,I)V.
        val mktDispatcherFingerprint = Fingerprint(filters = listOf(string("e_intl_mkt_feature_entry")))
        mktDispatcherFingerprint.matchOrNull()?.classDef?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (AccessFlags.STATIC.isSet(method.accessFlags) &&
                    method.returnType == "Lkotlin/Unit;" &&
                    method.parameterTypes.size == 4 &&
                    method.parameterTypes[0] == "I" &&
                    method.parameterTypes[1] == "Lkotlin/jvm/internal/Ref\$BooleanRef;" &&
                    method.parameterTypes[2] == "Lcom/p1/mobile/android/app/Act;"
                ) {
                    method.addInstructions(0, """
                        move-object/from16 v0, p1
                        const/4 v1, 0x1
                        iput-boolean v1, v0, Lkotlin/jvm/internal/Ref${'$'}BooleanRef;->element:Z
                        sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
                        return-object v0
                    """)
                }
                if (!AccessFlags.STATIC.isSet(method.accessFlags) && method.returnType == "V" &&
                    method.parameterTypes.size == 2 &&
                    method.parameterTypes[0] == "Lcom/p1/mobile/android/app/Act;" &&
                    method.parameterTypes[1] == "I"
                ) {
                    method.addInstructions(0, RETURN_VOID)
                }
            }
        }

        // Home operation-activity gates (home/a.Companion): pet/sports/trip (hz70), interests
        // (pyg0), animal (ny0), horoscope (qb6), camping, marketing (t5p). Resolved via the
        // stable campingactivity/b.g() call (single-letter Companion name churns). Force the
        // public ()Z gates false and the skip-flag a() true.
        val homeOpGatesFingerprint = Fingerprint(
            filters = listOf(
                methodCall(
                    definingClass = "Lcom/p1/mobile/putong/core/ui/intloperation/campingactivity/b;",
                    name = "g",
                ),
            )
        )
        homeOpGatesFingerprint.matchOrNull()?.classDef?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.name == "<init>" || method.name == "<clinit>") return@forEach
                if (AccessFlags.PUBLIC.isSet(method.accessFlags) &&
                    method.returnType == "Z" && method.parameterTypes.isEmpty()
                ) {
                    if (method.name == "a") {
                        method.addInstructions(0, """
                            const/4 v0, 0x1
                            return v0
                        """)
                    } else {
                        method.addInstructions(0, RETURN_FALSE)
                    }
                }
            }
        }

        // Left-swipe profile-completeness nag (swipe/o.r): hardcoded zh DatingGuide dialog.
        // Both anchors co-located in r(Act,User)V.
        val profileCompleteNagFingerprint = Fingerprint(
            filters = listOf(
                string("p_left_swipe_complete_profile"),
                string("e_complete_profile"),
            )
        )
        profileCompleteNagFingerprint.matchOrNull()?.classDef?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.returnType == "V" && method.parameterTypes.size == 2 &&
                    method.parameterTypes[0] == "Lcom/p1/mobile/android/app/Act;" &&
                    method.parameterTypes[1] == "Lcom/p1/mobile/putong/data/User;"
                ) {
                    method.addInstructions(0, RETURN_VOID)
                }
            }
        }

        // Me-tab incomplete-profile dot (main/a.F9). Do NOT touch NewMainViewModel.p0 (shared
        // with the Messages unread dot). Void the no-arg V method carrying e_mytab_incomplete.
        val meTabIncompleteFingerprint = Fingerprint(filters = listOf(string("e_mytab_incomplete")))
        meTabIncompleteFingerprint.matchOrNull()?.classDef?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.returnType == "V" && method.parameterTypes.isEmpty() &&
                    method.cachedInstructions().any { instr ->
                        instr is ReferenceInstruction && instr.reference is StringReference &&
                            (instr.reference as StringReference).string == "e_mytab_incomplete"
                    }
                ) {
                    method.addInstructions(0, RETURN_VOID)
                }
            }
        }

        // Edit-profile save drainage notice (wyp.show).
        val profileDrainageFingerprint = Fingerprint(filters = listOf(string("p_edit_profile_save_drainage_notice")))
        profileDrainageFingerprint.matchOrNull()?.classDef?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.name == "show" && method.returnType == "V" && method.parameterTypes.isEmpty()) {
                    method.addInstructions(0, RETURN_VOID)
                }
            }
        }

        // Me-tab PROMOTION/SEE/BOOST/ODIAMOND badge: TabUniteManager.l() true makes o() early-return.
        classDefByOrNull("Lcom/p1/mobile/putong/core/ui/diamond/TabUniteManager;")?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.name == "l" && method.returnType == "Z" && method.parameterTypes.isEmpty()) {
                    method.addInstructions(0, """
                        const/4 v0, 0x1
                        return v0
                    """)
                }
            }
        }

        // New-like notification popup ("99+ people liked you" dialog). NewLikeView.F() is the
        // popup creator; y240 is the DialogStrategyQueue strategy that calls it. Patch both:
        // F() -> return-void kills the popup at the display level (any caller path), and
        // y240.b() -> false prevents the strategy gate from firing at all.
        classDefByOrNull("Lcom/p1/mobile/putong/core/ui/seepop/NewLikeView;")?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.name == "F" && AccessFlags.STATIC.isSet(method.accessFlags) &&
                    method.returnType == "V" && method.parameterTypes.size == 3 &&
                    method.parameterTypes[0] == "Lcom/p1/mobile/android/app/Act;" &&
                    method.parameterTypes[1].contains("CoreLikers") &&
                    method.parameterTypes[2].contains("y20")
                ) {
                    method.addInstructions(0, RETURN_VOID)
                }
            }
        }

        val newLikeStrategyFingerprint = Fingerprint(filters = listOf(string("new_like_dialog_show_count_")))
        newLikeStrategyFingerprint.matchOrNull()?.classDef?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.returnType == "Z" && method.parameterTypes.size == 1 &&
                    (method.parameterTypes[0].contains("lwl") || method.parameterTypes[0].contains("aqm"))
                ) {
                    method.addInstructions(0, RETURN_FALSE)
                }
            }
        }

        // See-anim poplevel bubble ("X people liked you" floating avatar bubble). The upf0 class
        // is the SEE_ANIM bubble (MagicBubble.SEE_ANIM). Multiple code paths create it:
        // - g350.q7() (P6() subscriber bypassing O3 filter)
        // - g350 lines 799, 839, 3365 (various likers event handlers)
        // - DebugUtil line 9180 (debug-only, but patch for completeness)
        // Generic fix: patch upf0.B() to return 0 (duration=0 means "don't show"). This kills
        // ALL see_anim bubbles regardless of which code path creates them.
        classDefByOrNull("Ll/upf0;")?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                // B()I — returns display duration in ms. Return 0 to suppress.
                if (method.name == "B" && method.returnType == "I" && method.parameterTypes.isEmpty()) {
                    method.addInstructions(0, """
                        const/4 v0, 0x0
                        return v0
                    """)
                }
            }
        }

        // Also patch g350.q7() directly — the P6() subscriber that creates upf0 bubbles.
        // This is defense-in-depth alongside the upf0.B() patch above.
        classDefByOrNull("Ll/g350;")?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                // q7(CoreLikers$a)V — the see_anim bubble subscriber
                if (method.name == "q7" && method.returnType == "V" &&
                    method.parameterTypes.size == 1 &&
                    method.parameterTypes[0].contains("CoreLikers")
                ) {
                    method.addInstructions(0, RETURN_VOID)
                }
            }
        }

        // Superlike upsell bubbles (ihi0). The poplevel config override
        // (superlike_promotion_config -> 999) is the first lever; these creator voids are the
        // backstop for bubbles that ignore poplevel. K (remaining-count bubble) is DORMANT:
        // its gate !o3b.L3() && !o3b.A3() is false under tier forcing (Q3->false makes both
        // L3/A3 true), so K is left untouched. String-returning creators get empty-string
        // returns (callers store the bubble id; "" matches nothing), void creators return-void.
        resolver.getMiscClass("superlikeBubble")?.let { classDef ->
            val putongFrag = "Lcom/p1/mobile/putong/app/PutongFrag;"
            val user = "Lcom/p1/mobile/putong/data/User;"
            val view = "Landroid/view/View;"
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.implementation == null) return@forEach
                val p = method.parameterTypes
                val isStatic = AccessFlags.STATIC.isSet(method.accessFlags)
                fun hasString(s: String) = method.cachedInstructions().any { instr ->
                    instr is ReferenceInstruction && (instr.reference as? StringReference)?.string == s
                }
                when {
                    // J(User,PutongFrag,View,I)String — popLevel-gated "很受欢迎" promo bubble
                    !isStatic && method.returnType == "Ljava/lang/String;" && p.size == 4 &&
                        p[0] == user && p[1] == putongFrag && p[2] == view && p[3] == "I" &&
                        hasString("bubble_superlike_coin_guide") -> {
                        method.preflightSmali(RETURN_EMPTY_STRING, 2)
                        method.addInstructions(0, RETURN_EMPTY_STRING)
                    }
                    // y(User,PutongFrag,View,Z)V — combo guidance "试试长按连送"
                    !isStatic && method.returnType == "V" && p.size == 4 &&
                        p[0] == user && p[1] == putongFrag && p[2] == view && p[3] == "Z" &&
                        hasString("e_superlike_combo_guidance") -> {
                        method.preflightSmali(RETURN_VOID, 1)
                        method.addInstructions(0, RETURN_VOID)
                    }
                    // M(PutongFrag,ViewGroup,View,I)V — coin-guide bubble
                    isStatic && method.returnType == "V" && p.size == 4 &&
                        p[0] == putongFrag && p[1] == "Landroid/view/ViewGroup;" && p[2] == view && p[3] == "I" &&
                        hasString("bubble_superlike_coin_guide") -> {
                        method.preflightSmali(RETURN_VOID, 1)
                        method.addInstructions(0, RETURN_VOID)
                    }
                    // E(PutongFrag,View,I,y20)V — multi-superlike bubble (4th param is the
                    // obfuscated click callback; matched by position, not name)
                    isStatic && method.returnType == "V" && p.size == 4 &&
                        p[0] == putongFrag && p[1] == view && p[2] == "I" &&
                        hasString("bubble_multi_superlike_bubble") -> {
                        method.preflightSmali(RETURN_VOID, 1)
                        method.addInstructions(0, RETURN_VOID)
                    }
                    // D(Frag,User,View,I)V — profile-list "很受欢迎" bubble (delegates to C)
                    !isStatic && method.returnType == "V" && p.size == 4 &&
                        p[0] == "Lcom/p1/mobile/android/app/Frag;" && p[1] == user && p[2] == view && p[3] == "I" -> {
                        method.preflightSmali(RETURN_VOID, 1)
                        method.addInstructions(0, RETURN_VOID)
                    }
                }
            }
        }
    }
}
