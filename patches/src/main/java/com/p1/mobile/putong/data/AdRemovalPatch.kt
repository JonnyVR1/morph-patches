package com.p1.mobile.putong.data

import app.morphe.patcher.Fingerprint
import app.morphe.patcher.extensions.InstructionExtensions.addInstructions
import app.morphe.patcher.methodCall
import app.morphe.patcher.patch.bytecodePatch
import app.morphe.patcher.string
import com.android.tools.smali.dexlib2.AccessFlags
import com.android.tools.smali.dexlib2.Opcode
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

private val RETURN_NULL_OBSERVABLE = """
    const/4 v0, 0x0
    invoke-static {v0}, Ll/vpf;->just(Ljava/lang/Object;)Ll/vpf;
    move-result-object v0
    return-object v0
"""

private val CONVERSATION_PROMO_FILTER = """
    move-object/from16 v1, p2
    invoke-interface {v1}, Ljava/util/List;->size()I
    move-result v2
    const/4 v3, 0x0
    :morph_scan
    if-ge v3, v2, :morph_end
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;
    move-result-object v4
    instance-of v0, v4, Lcom/p1/mobile/putong/core/data/Conversation;
    if-eqz v0, :morph_scan_next
    check-cast v4, Lcom/p1/mobile/putong/core/data/Conversation;
    iget-object v4, v4, Lcom/p1/mobile/putong/core/data/Conversation;->convType:Ljava/lang/String;
    if-eqz v4, :morph_scan_next
    const-string v0, "fakeReceiveLikeGuideSVip"
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    move-result v0
    if-nez v0, :morph_build
    const-string v0, "fakeIntlReceiveLikeGuideSVip"
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    move-result v0
    if-nez v0, :morph_build
    const-string v0, "intlSeeChatRequest"
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    move-result v0
    if-nez v0, :morph_build
    :morph_scan_next
    add-int/lit8 v3, v3, 0x1
    goto :morph_scan
    :morph_build
    new-instance v0, Ljava/util/ArrayList;
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
    const/4 v2, 0x0
    :morph_loop
    invoke-interface {v1}, Ljava/util/List;->size()I
    move-result v4
    if-ge v2, v4, :morph_done
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;
    move-result-object v3
    instance-of v4, v3, Lcom/p1/mobile/putong/core/data/Conversation;
    if-eqz v4, :morph_add
    check-cast v3, Lcom/p1/mobile/putong/core/data/Conversation;
    iget-object v4, v3, Lcom/p1/mobile/putong/core/data/Conversation;->convType:Ljava/lang/String;
    if-eqz v4, :morph_add
    const-string v3, "fakeReceiveLikeGuideSVip"
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    move-result v3
    if-nez v3, :morph_skip
    const-string v3, "fakeIntlReceiveLikeGuideSVip"
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    move-result v3
    if-nez v3, :morph_skip
    const-string v3, "intlSeeChatRequest"
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    move-result v3
    if-nez v3, :morph_skip
    :morph_add
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;
    move-result-object v3
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :morph_skip
    add-int/lit8 v2, v2, 0x1
    goto :morph_loop
    :morph_done
    move-object/16 p2, v0
    :morph_end
"""

private val omsAdCardPipelineFingerprint = Fingerprint(
    filters = listOf(
        string("e_oms_180club"),
        string("literatureCardGuide"),
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
    description = "Removes all ad displays: navigation bar banner, native feed ads, live streaming banner ads, live video feed ads, live square ads, conversation Google ads, marriage guide card, four-select-one card, daily selection card, visitor list ads, likers ads, meet likers ads, meet visitor ads, splash screen ads, profile photo carousel ads, incentive video ads, fake splash view, video ad player, official advert, ad reward dialogs, live streaming ad user, treasure prize ads, Town Tales game entrance + menu fetch, chat request promotional entries",
    default = true,
) {
    compatibleWith(tantanCompatibility)
    execute {
        val resolver = getSharedResolver()

        resolver.getAdClass("navBarAdHelper")?.let { classDef ->
            val mutableClassDef = mutableClassDefBy(classDef)
            val showGates = mutableClassDef.methods.filter {
                AccessFlags.STATIC.isSet(it.accessFlags) &&
                    it.returnType == "Z" &&
                    it.parameterTypes == listOf("Lkotlin/jvm/functions/Function0;")
            }
            check(showGates.size == 1) { "navBarAdHelper show gate cardinality ${showGates.size}" }
            showGates.forEach {
                it.preflightSmali(RETURN_FALSE, 2)
                it.addInstructions(0, RETURN_FALSE)
            }
            val targetingGates = mutableClassDef.methods.filter {
                AccessFlags.STATIC.isSet(it.accessFlags) &&
                    it.returnType == "Z" && it.parameterTypes.isEmpty()
            }
            check(targetingGates.size == 2) { "navBarAdHelper targeting gate cardinality ${targetingGates.size}" }
            targetingGates.forEach {
                it.preflightSmali(RETURN_FALSE, 2)
                it.addInstructions(0, RETURN_FALSE)
            }
        }

        classDefByOrNull("Lcom/p1/mobile/putong/core/admob/NativeAdViewCard;")?.let { classDef ->
            val mutableClassDef = mutableClassDefBy(classDef)
            val bindMethods = mutableClassDef.methods.filter {
                !AccessFlags.STATIC.isSet(it.accessFlags) &&
                    it.returnType == "V" &&
                    it.parameterTypes == listOf("Lcom/p1/mobile/putong/core/newui/home/NewNewHomeFrag;")
            }
            check(bindMethods.size == 1) { "NativeAdViewCard bind cardinality ${bindMethods.size}" }
            bindMethods.forEach { it.addInstructions(0, RETURN_VOID) }

            val companionType = classDef.fields.firstOrNull { it.name == "Companion" }?.type
            if (companionType != null) {
                val renderMethods = mutableClassDef.methods.filter {
                    !AccessFlags.STATIC.isSet(it.accessFlags) &&
                        it.returnType == "V" && it.parameterTypes.isEmpty() &&
                        it.cachedAdInstructions().any { instr ->
                            instr.opcode == Opcode.INVOKE_STATIC && instr is ReferenceInstruction &&
                                (instr.reference as? MethodReference)?.definingClass == companionType
                        }
                }
                check(renderMethods.size == 1) { "NativeAdViewCard render cardinality ${renderMethods.size}" }
                renderMethods.forEach { it.addInstructions(0, RETURN_VOID) }
            }
        }

        // LiveVideoBannerAdCardView / LiveVideoFeedAdCardView are redundant shells in 7.5.6.1
        // (constructors + trivial onFinishInflate only, zero bind logic) — the upstream AdMob-init
        // void is the lever. IntlLiveSquareFeedNativeAdView/BannerAdView holder binds are
        // deliberately NOT voided: that leaves an empty SIZED container in the feed (gotcha #12
        // gap defect), and the old gap-free Y5/Z5 feed-list filters are gone (shared F3 dispatcher).
        // The CoreBusinessServiceIml live-ad preload kill below starves the holders instead.

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
                    method.returnType == "Ll/vpf;"
                ) {
                    method.addInstructions(0, """
                        sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;
                        invoke-static {v0}, Ll/vpf;->just(Ljava/lang/Object;)Ll/vpf;
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

        // Town Tales (casual game menu) promo stack. The floating Me-tab entrance
        // (CasualGameEntranceView, inflated only by ProfileFrag) is fed by uu7, which
        // fetches /intl-live-casualGameMenu at startup, on region-rule updates and on
        // every Me-tab selection. Kill the fetch at its single gate (static (Z)V — all
        // fetch overloads delegate to it), force the display gate false, and hide the
        // entrance bind method as a backstop. The layout root defaults to GONE, so with
        // no button data the entrance never shows. sz4 red-dot persistence is only
        // consumed by this view; live-room Sud/octopus games are a separate feature.
        resolver.getAdClass("casualGameManager")?.let { classDef ->
            val fetchGates = mutableClassDefBy(classDef).methods.filter {
                AccessFlags.STATIC.isSet(it.accessFlags) &&
                    it.returnType == "V" &&
                    it.parameterTypes == listOf("Z")
            }
            check(fetchGates.size == 1) { "casualGameManager fetch gate cardinality ${fetchGates.size}" }
            fetchGates.forEach { it.addInstructions(0, RETURN_VOID) }
        }

        classDefByOrNull("Lcom/p1/mobile/putong/core/casualgame/CasualGameButton;")?.let { classDef ->
            val displayGates = mutableClassDefBy(classDef).methods.filter {
                !AccessFlags.STATIC.isSet(it.accessFlags) &&
                    it.returnType == "Z" && it.parameterTypes.isEmpty()
            }
            check(displayGates.size == 1) { "CasualGameButton display gate cardinality ${displayGates.size}" }
            displayGates.forEach { it.addInstructions(0, RETURN_FALSE) }
        }

        classDefByOrNull("Lcom/p1/mobile/putong/core/casualgame/CasualGameEntranceView;")?.let { classDef ->
            // Two instance methods take a single CasualGameButton: the bind method (g0)
            // and the icon renderer (Y). Discriminate by the isDisplayable() call, which
            // only the bind method makes.
            val bindMethods = mutableClassDefBy(classDef).methods.filter {
                !AccessFlags.STATIC.isSet(it.accessFlags) &&
                    it.returnType == "V" &&
                    it.parameterTypes == listOf("Lcom/p1/mobile/putong/core/casualgame/CasualGameButton;") &&
                    it.cachedAdInstructions().any { instr ->
                        instr is ReferenceInstruction &&
                            (instr.reference as? MethodReference)?.let { ref ->
                                ref.definingClass == "Lcom/p1/mobile/putong/core/casualgame/CasualGameButton;" &&
                                    ref.name == "isDisplayable"
                            } == true
                    }
            }
            check(bindMethods.size == 1) { "CasualGameEntranceView bind cardinality ${bindMethods.size}" }
            bindMethods.forEach { method ->
                method.addInstructions(0, """
                    const/16 v0, 0x8
                    move-object/from16 v1, p0
                    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V
                    return-void
                """)
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
        // 7.5.6.1: ConversationsList.O2(List,Z)List is gone; the display transform moved to
        // the adapter setter t03.r(I,List,Z)V, which stores the list param into t03.e and
        // reads List.size() from the same register — rewriting p2 propagates. Resolve the
        // adapter type dynamically from the stable getConversationsAdapter() getter (never
        // hardcode the obfuscated adapter/setter names), then match the setter by signature
        // (cardinality 1). Predicate: drop ONLY the two pure like-guide promo cells by EXACT
        // convType — "fakeReceiveLikeGuideSVip" and "fakeIntlReceiveLikeGuideSVip" (replaced,
        // not converted, when a real conversation arrives). KEEP fake_one_side /
        // fake_one_side_no_match (REAL one-sided chats: PremiumUnlock forces isSVIP=true so
        // the teaser gate is bypassed and they render as normal conversations) and
        // intlSeeChatRequest (a functional chat-request entry once the privilege is unlocked).
        // New-match placeholders use convType="default" (kept). Do NOT filter on isFake/fake_id_
        // alone — the earlier startsWith("fake") drop emptied inboxes dominated by one-sided
        // chats -> "It's quiet in here" empty state. r has 9 regs (this=v5, i=v6, p2=list=v7,
        // z=v8): working regs v0-v4 only, p2 shuttled via /from16 + /16, v5/v6/v8 preserved;
        // the original prologue redefines v0-v4 before reading them (gotcha #9/#10). Scan
        // first: the filtered ArrayList copy is built only when a promo cell is present.
        classDefByOrNull("Lcom/p1/mobile/putong/core/newui/messages/ConversationsList;")?.let { classDef ->
            val adapterGetters = classDef.methods.filter {
                it.name == "getConversationsAdapter" && it.parameterTypes.isEmpty()
            }
            check(adapterGetters.size == 1) { "getConversationsAdapter cardinality ${adapterGetters.size}" }
            classDefByOrNull(adapterGetters[0].returnType)?.let { adapterClass ->
                val targets = mutableClassDefBy(adapterClass).methods.filter { method ->
                    method.parameterTypes == listOf("I", "Ljava/util/List;", "Z") &&
                        method.returnType == "V"
                }
                check(targets.size == 1) { "conversations adapter setter cardinality ${targets.size}" }
                targets.forEach { method ->
                    method.preflightSmali(CONVERSATION_PROMO_FILTER, 57)
                    method.addInstructions(0, CONVERSATION_PROMO_FILTER)
                }
            }
        }

        // ── Swipe deck virtual-card insertion filters ──
        // Every ad/promo card in the swipe deck is a "virtual card" (id == "VirtualCard").


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

        classDefByOrNull("Lcom/p1/mobile/putong/core/module/CoreBusinessServiceIml;")?.let { classDef ->
            val targets = mutableClassDefBy(classDef).methods.filter { method ->
                !AccessFlags.STATIC.isSet(method.accessFlags) &&
                    method.returnType == "Ll/vpf;" &&
                    method.parameterTypes == listOf("Lcom/p1/mobile/android/app/Act;") &&
                    method.containsString("female") &&
                    method.cachedAdInstructions().any { instr ->
                        instr is ReferenceInstruction &&
                            (instr.reference as? MethodReference)?.let { ref ->
                                ref.definingClass == "Lcom/p1/mobile/putong/ab/IntlCountryCodeController;" &&
                                    ref.name == "f"
                            } == true
                    }
            }
            check(targets.size == 2) { "live ad preload cardinality ${targets.size}" }
            targets.forEach { method ->
                method.preflightSmali(RETURN_NULL_OBSERVABLE, 4)
                method.addInstructions(0, RETURN_NULL_OBSERVABLE)
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

        // Repeat suggested card (uu3) is handled by the DialogCleanupPatch deck-insert filter,
        // which gates ONLY virtual cards (isVirtualCard) at method entry. The previous
        // check-cast-heuristic return-void here blocked ALL case-0 inserts (real user cards
        // too) and was removed.

    }
}
