package com.p1.mobile.putong.data

import app.morphe.patcher.Fingerprint
import app.morphe.patcher.extensions.InstructionExtensions.addInstructions
import app.morphe.patcher.methodCall
import app.morphe.patcher.patch.bytecodePatch
import app.morphe.patcher.string
import com.android.tools.smali.dexlib2.AccessFlags
import com.android.tools.smali.dexlib2.iface.instruction.Instruction
import com.android.tools.smali.dexlib2.iface.instruction.ReferenceInstruction
import com.android.tools.smali.dexlib2.iface.reference.FieldReference
import com.android.tools.smali.dexlib2.iface.reference.MethodReference
import com.android.tools.smali.dexlib2.iface.reference.StringReference

private val adInstructionCache = java.util.WeakHashMap<com.android.tools.smali.dexlib2.iface.Method, List<Instruction>>()

private fun com.android.tools.smali.dexlib2.iface.Method.cachedAdInstructions(): List<Instruction> =
    adInstructionCache.getOrPut(this) {
        implementation?.instructions?.toList() ?: emptyList()
    }

private fun com.android.tools.smali.dexlib2.iface.Method.containsString(value: String): Boolean =
    cachedAdInstructions().any { instr ->
        instr is ReferenceInstruction && instr.reference is StringReference &&
        (instr.reference as StringReference).string == value
    }

private fun com.android.tools.smali.dexlib2.iface.Method.accessesFieldNamed(name: String): Boolean =
    cachedAdInstructions().any { instr ->
        instr is ReferenceInstruction && instr.reference is FieldReference &&
        (instr.reference as FieldReference).name == name
    }

private const val RETURN_VOID = "return-void"

private const val RETURN_FALSE = """
    const/4 v0, 0x0
    return v0
"""

private val omsAdCardPipelineFingerprint = Fingerprint(
    filters = listOf(
        string("e_oms_180club"),
        string("literatureCardGuide"),
    ),
)

private val liveAdPreloadSwitchFingerprint = Fingerprint(
    filters = listOf(
        string("ad_monetize_live_banner_switch"),
    ),
)

private val liveActiveGiftPopupFingerprint = Fingerprint(
    filters = listOf(
        methodCall(
            definingClass = "Lcom/p1/mobile/putong/live/external/intl/view/widgets/IntlLiveSquareActiveGiftDialogView;",
            name = "S",
        ),
    ),
)

private val liveVoicePayGuideFingerprint = Fingerprint(
    filters = listOf(
        methodCall(
            definingClass = "Lcom/p1/mobile/putong/live/livingroom/virtual/payGuide/LiveVoicePayGuideBottomDialog;",
            name = "g",
        ),
    ),
)

@Suppress("unused")
@JvmField
val adRemovalPatch = bytecodePatch(
    name = "Ad Removal",
    description = "Removes all ad displays: navigation bar banner, native feed ads, live streaming banner ads, live video feed ads, live square ads, conversation Google ads, marriage guide card, four-select-one card, daily selection card, visitor list ads, likers ads, meet likers ads, meet visitor ads, splash screen ads, profile photo carousel ads, incentive video ads, fake splash view, video ad player, official advert, ad reward dialogs, live streaming ad user, treasure prize ads, Town Tales overlay, chat request promotional entries",
    default = true,
) {
    compatibleWith(tantanCompatibility)
    execute {
        val resolver = getSharedResolver()

        classDefByOrNull("Lcom/p1/mobile/putong/core/admob/NavigationBarAdView;")?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.name == "<init>") return@forEach
                when {
                    method.name == "L" &&
                        method.parameterTypes.size == 1 &&
                        method.parameterTypes[0] == "Lcom/p1/mobile/android/app/Act;" &&
                        method.returnType == "V" -> {
                        method.addInstructions(0, RETURN_VOID)
                    }
                    method.name == "G" &&
                        method.parameterTypes.isEmpty() &&
                        method.returnType == "V" -> {
                        method.addInstructions(0, RETURN_VOID)
                    }
                    method.name == "M" &&
                        method.parameterTypes.isEmpty() &&
                        method.returnType == "V" -> {
                        method.addInstructions(0, RETURN_VOID)
                    }
                    method.name == "E" &&
                        method.parameterTypes.isEmpty() &&
                        method.returnType == "V" -> {
                        method.addInstructions(0, RETURN_VOID)
                    }
                }
            }
        }

        classDefByOrNull("Lcom/p1/mobile/putong/core/newui/admob/NavigationBarAdmobHelper;")?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.name == "<init>") return@forEach
                when {
                    method.name == "g" &&
                        method.parameterTypes.size == 1 &&
                        method.parameterTypes[0] == "Lkotlin/jvm/functions/Function0;" &&
                        method.returnType == "Z" -> {
                        method.addInstructions(0, RETURN_FALSE)
                    }
                    method.name == "p" &&
                        method.parameterTypes.isEmpty() &&
                        method.returnType == "Z" -> {
                        method.addInstructions(0, RETURN_FALSE)
                    }
                }
            }
        }

        classDefByOrNull("Lcom/p1/mobile/putong/core/admob/NativeAdViewCard\$Companion;")?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.name == "<init>") return@forEach
                // 7.5.4: m(Act) is the ad preload entry (was l in older versions).
                // Voiding it stops the native ad from ever being loaded.
                if (method.name == "m" &&
                    method.parameterTypes.size == 1 &&
                    method.parameterTypes[0] == "Lcom/p1/mobile/android/app/Act;" &&
                    method.returnType == "V"
                ) {
                    method.addInstructions(0, RETURN_VOID)
                }
            }
        }

        classDefByOrNull("Lcom/p1/mobile/putong/core/admob/NativeAdViewCard;")?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.name == "<init>") return@forEach
                when {
                    // 7.5.4: s(NewNewHomeFrag, z20) binds the ad card (was 1-param in older versions)
                    method.name == "s" &&
                        method.parameterTypes.size == 2 &&
                        method.parameterTypes[0].contains("NewNewHomeFrag") &&
                        method.returnType == "V" &&
                        !AccessFlags.STATIC.isSet(method.accessFlags) -> {
                        method.addInstructions(0, RETURN_VOID)
                    }
                    // 7.5.4: t() renders the loaded ad into the card
                    method.name == "t" &&
                        method.parameterTypes.isEmpty() &&
                        method.returnType == "V" &&
                        !AccessFlags.STATIC.isSet(method.accessFlags) -> {
                        method.addInstructions(0, RETURN_VOID)
                    }
                }
            }
        }

        classDefByOrNull("Lcom/p1/mobile/putong/live/base/arch/card/cardmodel/feed/LiveVideoBannerAdCardView;")?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.name == "<init>") return@forEach
                if (method.name == "onFinishInflate" &&
                    method.parameterTypes.isEmpty() &&
                    method.returnType == "V"
                ) {
                    method.addInstructions(0, RETURN_VOID)
                }
            }
        }

        classDefByOrNull("Lcom/p1/mobile/putong/live/external/intl/livesquare/admob/IntlLiveSquareFeedNativeAdView;")?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.name == "<init>") return@forEach
                when {
                    method.name == "a" &&
                        method.parameterTypes.size == 1 &&
                        method.parameterTypes[0] == "Landroid/view/View;" &&
                        method.returnType == "V" -> {
                        method.addInstructions(0, RETURN_VOID)
                    }
                    method.name == "b" &&
                        method.parameterTypes.size == 1 &&
                        method.parameterTypes[0] == "Landroid/view/View;" &&
                        method.returnType == "V" -> {
                        method.addInstructions(0, RETURN_VOID)
                    }
                    method.name == "onFinishInflate" &&
                        method.parameterTypes.isEmpty() &&
                        method.returnType == "V" -> {
                        method.addInstructions(0, RETURN_VOID)
                    }
                }
            }
        }

        classDefByOrNull("Lcom/p1/mobile/putong/live/external/intl/livesquare/admob/IntlLiveSquareFeedBannerAdView;")?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.name == "<init>") return@forEach
                when {
                    method.name == "a" &&
                        method.parameterTypes.size == 1 &&
                        method.parameterTypes[0] == "Landroid/view/View;" &&
                        method.returnType == "V" -> {
                        method.addInstructions(0, RETURN_VOID)
                    }
                    method.name == "b" &&
                        method.parameterTypes.size == 1 &&
                        method.parameterTypes[0] == "Landroid/view/View;" &&
                        method.returnType == "V" -> {
                        method.addInstructions(0, RETURN_VOID)
                    }
                    method.name == "onFinishInflate" &&
                        method.parameterTypes.isEmpty() &&
                        method.returnType == "V" -> {
                        method.addInstructions(0, RETURN_VOID)
                    }
                }
            }
        }

        classDefByOrNull("Lcom/p1/mobile/putong/core/newui/messages/ConversationItemGoogleAdView;")?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.name == "<init>") return@forEach
                when {
                    method.name == "c" &&
                        method.parameterTypes.size == 2 &&
                        method.parameterTypes[0] == "Lcom/p1/mobile/putong/app/PutongAct;" &&
                        method.parameterTypes[1] == "Z" &&
                        method.returnType == "V" -> {
                        method.addInstructions(0, RETURN_VOID)
                    }
                    method.name == "onFinishInflate" &&
                        method.parameterTypes.isEmpty() &&
                        method.returnType == "V" -> {
                        method.addInstructions(0, RETURN_VOID)
                    }
                }
            }
        }

        classDefByOrNull("Lcom/p1/mobile/putong/core/newui/admob/GoogleAdAct;")?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.name == "<init>") return@forEach
                when {
                    method.name == "initSubscription" &&
                        method.parameterTypes.isEmpty() &&
                        method.returnType == "V" -> {
                        method.addInstructions(0, RETURN_VOID)
                    }
                }
            }
        }

        classDefByOrNull("Lcom/p1/mobile/putong/core/ui/home/view/MarryAdCardView;")?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.name == "<init>") return@forEach
                when {
                    method.name == "g" &&
                        method.parameterTypes.isEmpty() &&
                        method.returnType == "V" -> {
                        method.addInstructions(0, RETURN_VOID)
                    }
                    method.name == "onFinishInflate" &&
                        method.parameterTypes.isEmpty() &&
                        method.returnType == "V" -> {
                        method.addInstructions(0, RETURN_VOID)
                    }
                }
            }
        }

        classDefByOrNull("Lcom/p1/mobile/putong/core/ui/home/view/FourSelectOneAdCard;")?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.name == "<init>") return@forEach
                when {
                    method.name == "e" &&
                        method.parameterTypes.size == 1 &&
                        method.parameterTypes[0] == "I" &&
                        method.returnType == "V" -> {
                        method.addInstructions(0, RETURN_VOID)
                    }
                    method.name == "onFinishInflate" &&
                        method.parameterTypes.isEmpty() &&
                        method.returnType == "V" -> {
                        method.addInstructions(0, RETURN_VOID)
                    }
                }
            }
        }

        classDefByOrNull("Lcom/p1/mobile/putong/core/ui/home/view/DailySelectionAdCardView;")?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.name == "<init>") return@forEach
                when {
                    method.name == "g" &&
                        method.parameterTypes.isEmpty() &&
                        method.returnType == "V" -> {
                        method.addInstructions(0, RETURN_VOID)
                    }
                    method.name == "onFinishInflate" &&
                        method.parameterTypes.isEmpty() &&
                        method.returnType == "V" -> {
                        method.addInstructions(0, RETURN_VOID)
                    }
                }
            }
        }

        classDefByOrNull("Lcom/p1/mobile/putong/core/ui/intl/visitor/IntlVisitorAdmobItemView;")?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.name == "<init>") return@forEach
                when {
                    method.name == "b" &&
                        method.parameterTypes.size == 1 &&
                        method.parameterTypes[0] == "Landroid/view/View;" &&
                        method.returnType == "V" -> {
                        method.addInstructions(0, RETURN_VOID)
                    }
                    method.name == "onFinishInflate" &&
                        method.parameterTypes.isEmpty() &&
                        method.returnType == "V" -> {
                        method.addInstructions(0, RETURN_VOID)
                    }
                }
            }
        }

        classDefByOrNull("Lcom/p1/mobile/putong/live/base/arch/card/cardmodel/feed/LiveVideoFeedAdCardView;")?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.name == "<init>") return@forEach
                if (method.name == "onFinishInflate" &&
                    method.parameterTypes.isEmpty() &&
                    method.returnType == "V"
                ) {
                    method.addInstructions(0, RETURN_VOID)
                }
            }
        }

        classDefByOrNull("Lcom/p1/mobile/putong/core/ui/seepage/likers/IntlLikersAdmobItem;")?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.name == "<init>") return@forEach
                when {
                    method.name == "e" &&
                        method.parameterTypes.size == 1 &&
                        method.parameterTypes[0] == "Landroid/view/View;" &&
                        method.returnType == "V" -> {
                        method.addInstructions(0, RETURN_VOID)
                    }
                    method.name == "onFinishInflate" &&
                        method.parameterTypes.isEmpty() &&
                        method.returnType == "V" -> {
                        method.addInstructions(0, RETURN_VOID)
                    }
                }
            }
        }

        classDefByOrNull("Lcom/p1/mobile/putong/core/newui/intlmeet/likers/items/IntlMeetLikersAdmobItem;")?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.name == "<init>") return@forEach
                when {
                    method.name == "e" &&
                        method.parameterTypes.size == 1 &&
                        method.parameterTypes[0] == "Landroid/view/View;" &&
                        method.returnType == "V" -> {
                        method.addInstructions(0, RETURN_VOID)
                    }
                    method.name == "onFinishInflate" &&
                        method.parameterTypes.isEmpty() &&
                        method.returnType == "V" -> {
                        method.addInstructions(0, RETURN_VOID)
                    }
                }
            }
        }

        classDefByOrNull("Lcom/p1/mobile/putong/core/newui/intlmeet/visitor/IntlMeetVisitorAdmobItemView;")?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.name == "<init>") return@forEach
                when {
                    method.name == "b" &&
                        method.parameterTypes.size == 1 &&
                        method.parameterTypes[0] == "Landroid/view/View;" &&
                        method.returnType == "V" -> {
                        method.addInstructions(0, RETURN_VOID)
                    }
                    method.name == "onFinishInflate" &&
                        method.parameterTypes.isEmpty() &&
                        method.returnType == "V" -> {
                        method.addInstructions(0, RETURN_VOID)
                    }
                }
            }
        }

        classDefByOrNull("Lcom/p1/mobile/putong/core/newui/main/view/ExpandedSplashLayout;")?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.name == "<init>") return@forEach
                if (method.name == "j" &&
                    method.parameterTypes.isEmpty() &&
                    method.returnType == "V"
                ) {
                    method.addInstructions(0, RETURN_VOID)
                }
            }
        }

        resolver.getAdClass("profileCarouselAd")?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.name == "<init>" || method.name == "<clinit>") return@forEach
                if (method.parameterTypes.size == 2 &&
                    method.parameterTypes[0] == "Lcom/p1/mobile/android/app/Act;" &&
                    method.parameterTypes[1] == "Z" &&
                    method.returnType == "Lrx/c;"
                ) {
                    method.addInstructions(0, """
                        sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;
                        invoke-static {v0}, Lrx/c;->just(Ljava/lang/Object;)Lrx/c;
                        move-result-object v0
                        return-object v0
                    """)
                }
                if (method.parameterTypes.isEmpty() && method.returnType == "Z" &&
                    method.accessesFieldNamed("settingGroups")
                ) {
                    method.addInstructions(0, RETURN_FALSE)
                }
            }
        }

        classDefByOrNull("Lcom/p1/mobile/putong/ui/splash/FakeSplashView;")?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.name == "<init>") return@forEach
                if (method.name == "onFinishInflate" &&
                    method.parameterTypes.isEmpty() &&
                    method.returnType == "V"
                ) {
                    method.addInstructions(0, RETURN_VOID)
                }
            }
        }

        classDefByOrNull("Lcom/p1/mobile/putong/core/ui/advertisingcard/AdvertisPlayVideoView;")?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.name == "<init>") return@forEach
                when {
                    method.name == "k" &&
                        method.parameterTypes.size == 2 &&
                        method.parameterTypes[0] == "Ljava/lang/String;" &&
                        method.parameterTypes[1] == "F" &&
                        method.returnType == "V" -> {
                        method.addInstructions(0, RETURN_VOID)
                    }
                }
            }
        }

        classDefByOrNull("Lcom/p1/mobile/putong/core/ui/incentivevideo/IncentVideoResultAct;")?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.name == "<init>") return@forEach
                when {
                    method.name == "inflateView" &&
                        method.parameterTypes.size == 2 &&
                        method.returnType == "Landroid/view/View;" -> {
                        method.addInstructions(0, """
                            const/4 v0, 0x0
                            return-object v0
                        """)
                    }
                    method.name == "initDataOnCreate" &&
                        method.parameterTypes.isEmpty() &&
                        method.returnType == "V" -> {
                        method.addInstructions(0, RETURN_VOID)
                    }
                }
            }
        }

        resolver.getAdClass("officialAdvert")?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.name == "<init>" || method.name == "<clinit>") return@forEach
                when {
                    method.parameterTypes.size == 2 &&
                        method.parameterTypes[0] == "Lcom/p1/mobile/android/app/Act;" &&
                        method.parameterTypes[1] == "Landroid/view/ViewGroup;" &&
                        method.returnType == "V" -> {
                        method.addInstructions(0, RETURN_VOID)
                    }
                    method.parameterTypes.size == 3 &&
                        method.parameterTypes[0] == "Lcom/p1/mobile/android/app/Act;" &&
                        method.parameterTypes[1] == "Landroid/view/ViewGroup;" &&
                        method.parameterTypes[2] == "Lcom/p1/mobile/putong/core/data/OfficialAdvertData;" &&
                        method.returnType == "V" -> {
                        method.addInstructions(0, RETURN_VOID)
                    }
                }
            }
        }

        resolver.getAdClass("adRewardDialog")?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.name == "<init>" || method.name == "<clinit>") return@forEach
                when {
                    method.parameterTypes.size == 2 &&
                        method.parameterTypes[0] == "Lcom/p1/mobile/android/app/Act;" &&
                        method.parameterTypes[1] == "Ljava/lang/String;" &&
                        method.returnType == "V" -> {
                        method.addInstructions(0, RETURN_VOID)
                    }
                    method.parameterTypes.size == 3 &&
                        method.parameterTypes[0] == "Lcom/p1/mobile/android/app/Act;" &&
                        method.parameterTypes[1] == "Ljava/lang/String;" &&
                        method.returnType == "V" -> {
                        method.addInstructions(0, RETURN_VOID)
                    }
                    method.parameterTypes.size == 1 &&
                        method.parameterTypes[0] == "Lcom/p1/mobile/putong/data/AdConfiguration;" &&
                        method.returnType == "Z" -> {
                        method.addInstructions(0, RETURN_FALSE)
                    }
                }
            }
        }

        // AdMob init + UMP GDPR consent form (g80). Force the consent gate j()Z false (natural
        // no-consent path; wrn providers null-safe) and void the (Act,Runnable)V init entries
        // (l/q/u) which run MobileAds.initialize, the consent form, and install-referrer collection.
        val admobInitFingerprint = Fingerprint(filters = listOf(string("intl_admob_init")))
        admobInitFingerprint.matchOrNull()?.classDef?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.name == "<init>" || method.name == "<clinit>") return@forEach
                if (!AccessFlags.STATIC.isSet(method.accessFlags) && method.returnType == "Z" &&
                    method.parameterTypes.isEmpty() &&
                    method.cachedAdInstructions().any { instr ->
                        instr is ReferenceInstruction &&
                            (instr.reference as? MethodReference)?.definingClass == "Lcom/google/android/ump/ConsentInformation;"
                    }
                ) {
                    method.addInstructions(0, RETURN_FALSE)
                }
                if (method.returnType == "V" && method.parameterTypes.size == 2 &&
                    method.parameterTypes[0] == "Lcom/p1/mobile/android/app/Act;" &&
                    method.parameterTypes[1] == "Ljava/lang/Runnable;"
                ) {
                    method.addInstructions(0, RETURN_VOID)
                }
            }
        }

        // showLiveForIntlAdUser (yd7) and treasurePrizeAd surfaces are dead code in the
        // international 7.5.4 build (gated by isVIP / never inserted); their old split-anchor
        // fingerprints resolved nothing. Removed per the ad-stack verdict (AdMob only).

        // Town Tales overlay - CasualGameEntranceView
        classDefByOrNull("Lcom/p1/mobile/putong/core/casualgame/CasualGameEntranceView;")?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.name == "<init>" || method.name == "<clinit>") return@forEach
                // Patch g0() which is the main setup method - force visibility to GONE
                if (method.name == "g0" &&
                    method.parameterTypes.size == 1 &&
                    method.returnType == "V"
                ) {
                    method.addInstructions(0, """
                        const/16 v0, 0x8
                        invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V
                        return-void
                    """)
                }
            }
        }

        // Chat request promotional entry - zx6 class (obfuscated as Ll/zx6;)
        classDefByOrNull("Ll/zx6;")?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.name == "<init>" || method.name == "<clinit>") return@forEach
                // Patch m() static method that returns the subtitle
                if (method.name == "m" &&
                    method.parameterTypes.size == 1 &&
                    method.returnType == "Ljava/lang/CharSequence;" &&
                    AccessFlags.STATIC.isSet(method.accessFlags)
                ) {
                    method.addInstructions(0, """
                        const-string v0, ""
                        return-object v0
                    """)
                }
            }
        }

        // Drop fake/bot promo conversations from the Messages display list.
        // The main-list cell binds via NewConversationItemView.w3 -> O0 (NOT x0), so a
        // view-level GONE in ConversationItemView.x0 never runs for these cells. Filter
        // at the data level instead: ConversationsList.O2(List, Z)List builds the display
        // list; every return path returns the input list (or a y4m wrapper copied from it
        // after entry), so rebuilding p1 as a filtered ArrayList at index 0 covers all
        // branches. Match by signature (obfuscated name varies between builds), cardinality 1.
        // Predicate: drop ONLY the two pure like-guide promo cells by EXACT convType —
        // "fakeReceiveLikeGuideSVip" and "fakeIntlReceiveLikeGuideSVip" (these are replaced,
        // not converted, when a real conversation arrives). KEEP fake_one_side /
        // fake_one_side_no_match (REAL one-sided chats: PremiumUnlock forces isSVIP=true so
        // the teaser gate ht6.o is bypassed and they render as normal conversations) and
        // intlSeeChatRequest (a functional chat-request entry once the privilege is unlocked).
        // The earlier startsWith("fake") + intlSeeChatRequest drop emptied inboxes dominated
        // by one-sided chats / chat requests -> "It's quiet in here" empty state. New-match
        // placeholders use convType="default" (kept). Do NOT filter on isFake/fake_id_ alone.
        // p1 is a high register (O2 has 22 regs -> p1=v20): read via move-object/from16,
        // write via move-object/16; all working regs kept in v0-v6. See AGENTS gotcha #9/#10.
        classDefByOrNull("Lcom/p1/mobile/putong/core/newui/messages/ConversationsList;")?.let { classDef ->
            val targets = mutableClassDefBy(classDef).methods.filter { method ->
                method.name != "<init>" && method.name != "<clinit>" &&
                    method.parameterTypes.size == 2 &&
                    method.parameterTypes[0] == "Ljava/util/List;" &&
                    method.parameterTypes[1] == "Z" &&
                    method.returnType == "Ljava/util/List;"
            }
            if (targets.size == 1) {
                targets[0].addInstructions(0, """
                    new-instance v0, Ljava/util/ArrayList;
                    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
                    move-object/from16 v1, p1
                    invoke-interface {v1}, Ljava/util/List;->size()I
                    move-result v2
                    const/4 v3, 0x0
                    :morph_loop
                    if-ge v3, v2, :morph_done
                    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;
                    move-result-object v4
                    check-cast v4, Lcom/p1/mobile/putong/core/data/Conversation;
                    iget-object v5, v4, Lcom/p1/mobile/putong/core/data/Conversation;->convType:Ljava/lang/String;
                    if-eqz v5, :morph_add
                    const-string v6, "fakeReceiveLikeGuideSVip"
                    invoke-static {v5, v6}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z
                    move-result v4
                    if-nez v4, :morph_skip
                    const-string v6, "fakeIntlReceiveLikeGuideSVip"
                    invoke-static {v5, v6}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z
                    move-result v4
                    if-nez v4, :morph_skip
                    :morph_add
                    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;
                    move-result-object v4
                    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
                    :morph_skip
                    add-int/lit8 v3, v3, 0x1
                    goto :morph_loop
                    :morph_done
                    move-object/16 p1, v0
                """)
            }
        }

        // ── Swipe deck virtual-card insertion filters ──
        // Every ad/promo card in the swipe deck is a "virtual card" (id == "VirtualCard").
        // Real profiles (incl. server marketing re-inserts and undo re-inserts) carry real
        // user ids, so filtering on isVirtualCard() provably never removes a real profile.
        // Three insertion choke points in CoreSuggested + the OMS batch pipeline (id0).
        classDefByOrNull("Lcom/p1/mobile/putong/core/api/CoreSuggested;")?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.name == "<init>" || method.name == "<clinit>") return@forEach

                // Server suggest-response merge (intlInsertCardSets): strip virtual cards
                // from the SparseArray before the merge loop inserts them into the deck.
                // Anchored on a unique log string inside the method (name is a synthetic bridge).
                if (method.containsString("suggested data transform to MainThread") &&
                    method.parameterTypes.size == 2 &&
                    method.parameterTypes[0] == "Z"
                ) {
                    method.addInstructions(0, """
                        move-object/from16 v0, p2
                        iget-object v0, v0, Ll/ii70;->b:Ljava/lang/Object;
                        if-eqz v0, :morph_ad_filter_done
                        check-cast v0, Landroid/util/SparseArray;
                        invoke-virtual {v0}, Landroid/util/SparseArray;->size()I
                        move-result v1
                        add-int/lit8 v1, v1, -0x1
                        :morph_ad_filter_loop
                        if-ltz v1, :morph_ad_filter_done
                        invoke-virtual {v0, v1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;
                        move-result-object v2
                        if-eqz v2, :morph_ad_filter_next
                        check-cast v2, Lcom/p1/mobile/putong/core/api/CoreSuggested${'$'}UserInfo;
                        invoke-virtual {v2}, Lcom/p1/mobile/putong/core/api/CoreSuggested${'$'}UserInfo;->isVirtualCard()Z
                        move-result v3
                        if-eqz v3, :morph_ad_filter_next
                        invoke-virtual {v0, v1}, Landroid/util/SparseArray;->removeAt(I)V
                        :morph_ad_filter_next
                        add-int/lit8 v1, v1, -0x1
                        goto :morph_ad_filter_loop
                        :morph_ad_filter_done
                    """)
                }

                // Client single-insert path (SayHi/Marry/Boost/Superlike/Undo guide cards,
                // FakeCard, broadcast cards): drop virtual cards at entry.
                // Real-user undo re-inserts are non-virtual and pass through.
                if (method.containsString("repeat suggested card") &&
                    method.parameterTypes.size == 4 &&
                    method.parameterTypes[0] == "I" &&
                    method.parameterTypes[1] == "Lcom/p1/mobile/putong/core/api/CoreSuggested${'$'}UserInfo;" &&
                    method.returnType == "V"
                ) {
                    method.addInstructions(0, """
                        move-object/from16 v0, p2
                        invoke-virtual {v0}, Lcom/p1/mobile/putong/core/api/CoreSuggested${'$'}UserInfo;->isVirtualCard()Z
                        move-result v0
                        if-eqz v0, :morph_not_virtual_r
                        return-void
                        :morph_not_virtual_r
                    """)
                }

                // Client force-insert path (IntlRecallMembershipCard, INSERT_LOCAL_FINAL) is
                // intentionally NOT patched here: in 7.5.4 l7(UserInfo,I,Z)V is a SYNTHETIC
                // bridge with regs==paramCount==4 (body is just `r6(this,UserInfo,I,Z)`), so it
                // has NO free scratch register. Any isVirtualCard guard clobbers `this` (v0) and
                // falls through to the r6 tail-call -> VerifyError (gotcha #9). The consumer-side
                // home/c.y backstop below strips virtual cards downstream of EVERY insert path
                // (including this one), so the card never renders regardless.
            }
        }

        // Consumer-side backstop: home/c.y(List)List is the FINAL render transform of the
        // Card-tab deck (g350.F6 -> b.N.y -> b.N.K), downstream of EVERY insertion path.
        // The a7/r7/l7 insert filters above only strip the insert SparseArray / client inserts;
        // server promo cards that reach the main loaded list (e.g. the "see churnback" IntlSeeCard:
        // "X more people liked you" / "She is active", SeeActiveCard via holder qpf0) leak through.
        // Filtering here drops every virtual card (isVirtualCard() == id=="VirtualCard"); real
        // profiles carry real user ids so are never removed. Rebuild p1 as a filtered ArrayList at
        // index 0 (same pattern as ConversationsList.O2). c.y has 5 registers (p0=this=v3, p1=v4):
        // save/restore this via v1, shuttle params with /from16 + /16, working regs v0-v4 only.
        // Match by unique (List)->List signature (cardinality 1), not the obfuscated method name.
        classDefByOrNull("Lcom/p1/mobile/putong/core/newui/home/c;")?.let { classDef ->
            val targets = mutableClassDefBy(classDef).methods.filter { method ->
                method.name != "<init>" && method.name != "<clinit>" &&
                    method.parameterTypes.size == 1 &&
                    method.parameterTypes[0] == "Ljava/util/List;" &&
                    method.returnType == "Ljava/util/List;"
            }
            if (targets.size == 1) {
                targets[0].addInstructions(0, """
                    new-instance v0, Ljava/util/ArrayList;
                    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
                    move-object/from16 v1, p0
                    move-object/from16 v4, p1
                    const/4 v2, 0x0
                    :morph_loop
                    invoke-interface {v4}, Ljava/util/List;->size()I
                    move-result v3
                    if-ge v2, v3, :morph_done
                    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;
                    move-result-object v3
                    if-eqz v3, :morph_add
                    check-cast v3, Lcom/p1/mobile/putong/core/api/CoreSuggested${'$'}UserInfo;
                    invoke-virtual {v3}, Lcom/p1/mobile/putong/core/api/CoreSuggested${'$'}UserInfo;->isVirtualCard()Z
                    move-result v3
                    if-nez v3, :morph_skip
                    :morph_add
                    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;
                    move-result-object v3
                    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
                    :morph_skip
                    add-int/lit8 v2, v2, 0x1
                    goto :morph_loop
                    :morph_done
                    move-object/16 p0, v1
                    move-object/16 p1, v0
                """)
            }
        }

        // OMS operational ad cards (tagCard/literatureCardGuide/180club): kill the batch
        // pipeline entry invoked on every deck update. Do NOT touch CoreSuggested.w6 —
        // it also inserts LiveMultipleCard.
        omsAdCardPipelineFingerprint.matchOrNull()?.classDef?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.returnType == "V" &&
                    method.parameterTypes.size == 1 &&
                    method.parameterTypes[0] == "Lcom/p1/mobile/putong/core/data/PartialListOpt;" &&
                    AccessFlags.STATIC.isSet(method.accessFlags)
                ) {
                    method.addInstructions(0, RETURN_VOID)
                }
            }
        }

        // Live-square suggested feed: drop native+banner ad holders at the consumer
        // (Y5/Z5 insert yvo/mwo). Stable CamelCase; (View,List)V cardinality 2.
        // Fixes the blank sized gap left by the view-only ad patches (gotcha #12).
        classDefByOrNull("Lcom/p1/mobile/putong/live/external/intl/livesquare/fragments/suggestedTab/IntlLiveSquareSuggestedFrag;")?.let { classDef ->
            val targets = mutableClassDefBy(classDef).methods.filter { method ->
                !AccessFlags.STATIC.isSet(method.accessFlags) &&
                    method.returnType == "V" &&
                    method.parameterTypes.size == 2 &&
                    method.parameterTypes[0] == "Landroid/view/View;" &&
                    method.parameterTypes[1] == "Ljava/util/List;"
            }
            if (targets.size == 2) targets.forEach { it.addInstructions(0, RETURN_VOID) }
        }

        // Live ad preload Firebase switches (hcj.s/t): void so lm9.s/u stay false ->
        // csn.n()/o() false -> no AdMob preload. Unique string anchors, static ()V.
        liveAdPreloadSwitchFingerprint.matchOrNull()?.classDef?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (AccessFlags.STATIC.isSet(method.accessFlags) &&
                    method.returnType == "V" && method.parameterTypes.isEmpty() &&
                    (method.containsString("ad_monetize_live_banner_switch") ||
                        method.containsString("ad_monetize_live_native_switch"))
                ) {
                    method.addInstructions(0, RETURN_VOID)
                }
            }
        }

        // Live-square active-gift purchase popup creator (rrn.d3(Bean)V): void the
        // creator, not IntlLiveSquareActiveGiftDialogView.S (frame already shown, gotcha #11).
        liveActiveGiftPopupFingerprint.matchOrNull()?.classDef?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (!AccessFlags.STATIC.isSet(method.accessFlags) &&
                    method.returnType == "V" && method.parameterTypes.size == 1 &&
                    method.parameterTypes[0].endsWith("LiveSquareActiveGiftBean;")
                ) {
                    method.addInstructions(0, RETURN_VOID)
                }
            }
        }

        // Voice-room server-pushed pay-guide popups (ciq0.j4/k4/l4 enqueue): void the
        // enqueue choke points; the dialogs show() before bind (gotcha #11).
        liveVoicePayGuideFingerprint.matchOrNull()?.classDef?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (!AccessFlags.STATIC.isSet(method.accessFlags) &&
                    method.returnType == "V" && method.parameterTypes.size == 1 &&
                    method.parameterTypes[0].contains("PayGuide") &&
                    method.parameterTypes[0].endsWith("PopUp;")
                ) {
                    method.addInstructions(0, RETURN_VOID)
                }
            }
        }

    }
}
