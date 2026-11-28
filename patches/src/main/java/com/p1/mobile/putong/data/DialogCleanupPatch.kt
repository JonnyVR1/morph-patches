package com.p1.mobile.putong.data

import app.morphe.patcher.extensions.InstructionExtensions.addInstructions
import app.morphe.patcher.patch.bytecodePatch
import com.android.tools.smali.dexlib2.AccessFlags
import com.android.tools.smali.dexlib2.Opcode
import com.android.tools.smali.dexlib2.iface.instruction.ReferenceInstruction
import com.android.tools.smali.dexlib2.iface.reference.FieldReference
import com.android.tools.smali.dexlib2.iface.reference.MethodReference
import com.android.tools.smali.dexlib2.iface.reference.StringReference

private const val RETURN_VOID = "return-void"

private const val RETURN_FALSE = """
    const/4 v0, 0x0
    return v0
"""

private const val RETURN_RX_EMPTY = """
    invoke-static {}, Ll/vpf;->empty()Ll/vpf;
    move-result-object v0
    return-object v0
"""

@Suppress("unused")
@JvmField
val dialogCleanupPatch = bytecodePatch(
    name = "Dialog Cleanup",
    description = "Removes annoying promotional dialogs: 5-star rating, appstore rating, version upgrade, offline popup, notification permission, phone auth prompts, purchase pages, purchase confirm, overheat popup, phone verify, fake recall-match bait popup, UX experience questionnaire, post-swipe suggesters interrupt",
    default = true,
) {
    compatibleWith(tantanCompatibility)
    execute {
        val resolver = getSharedResolver()

        val dialogClasses = mutableMapOf<String, com.android.tools.smali.dexlib2.iface.ClassDef>()
        val dialogKeys = listOf("mx0", "zrj0", "ok3", "vipUpgradePopup", "omsDialogController", "gpRateGuide", "seePurchaseGuide")
        for (key in dialogKeys) {
            resolver.getDialogClass(key)?.let { dialogClasses[key] = it }
        }

        dialogClasses["mx0"]?.let { classDef ->
            mutableClassDefBy(classDef).methods
                .filter {
                    it.name == "H" &&
                    it.returnType == "V" &&
                    it.parameterTypes.size == 1 && it.parameterTypes[0] == "Lcom/p1/mobile/android/app/Act;" &&
                    AccessFlags.PUBLIC.isSet(it.accessFlags) && AccessFlags.FINAL.isSet(it.accessFlags)
                }
                .forEach { it.addInstructions(0, RETURN_VOID) }
        }

        dialogClasses["zrj0"]?.let { classDef ->
            mutableClassDefBy(classDef).methods
                .filter {
                    it.name == "c" &&
                    it.returnType == "V" &&
                    it.parameterTypes.size == 3 && it.parameterTypes[0] == "Z" && it.parameterTypes[1] == "Lcom/p1/mobile/android/app/Act;" && it.parameterTypes[2] == "Lcom/p1/mobile/putong/data/UpdateApiResult;" &&
                    AccessFlags.PUBLIC.isSet(it.accessFlags) && AccessFlags.STATIC.isSet(it.accessFlags)
                }
                .forEach { it.addInstructions(0, RETURN_VOID) }
        }

        dialogClasses["ok3"]?.let { classDef ->
            mutableClassDefBy(classDef).methods
                .filter { method ->
                    (method.name == "J" &&
                        method.parameterTypes.size == 3 &&
                        method.parameterTypes[0] == "Lcom/p1/mobile/android/app/Act;" &&
                        method.returnType == "V" &&
                        AccessFlags.PUBLIC.isSet(method.accessFlags) &&
                        AccessFlags.STATIC.isSet(method.accessFlags)) ||
                        (method.name == "L" &&
                            method.parameterTypes.size == 2 &&
                            method.parameterTypes[0] == "Lcom/p1/mobile/android/app/Act;" &&
                            method.parameterTypes[1] == "I" &&
                            method.returnType == "V" &&
                            AccessFlags.PUBLIC.isSet(method.accessFlags) &&
                            AccessFlags.STATIC.isSet(method.accessFlags))
                }
                .forEach { it.addInstructions(0, RETURN_VOID) }
        }

        classDefByOrNull("Lcom/p1/mobile/putong/core/ui/pricerecall/PriceRecall2Dialog;")?.let { classDef ->
            mutableClassDefBy(classDef).methods
                .filter {
                    (it.name == "show" || it.name == "display" || it.name == "present") &&
                    it.returnType == "V"
                }
                .forEach { it.addInstructions(0, RETURN_VOID) }
        }

        classDefByOrNull("Lcom/p1/mobile/putong/core/ui/pricerecall/PriceRecallGetSurprise2Dialog;")?.let { classDef ->
            mutableClassDefBy(classDef).methods
                .filter {
                    (it.name == "show" || it.name == "display" || it.name == "present") &&
                    it.returnType == "V"
                }
                .forEach { it.addInstructions(0, RETURN_VOID) }
        }

        dialogClasses["vipUpgradePopup"]?.let { classDef ->
            mutableClassDefBy(classDef).methods
                .filter {
                    it.name == "d" &&
                    it.returnType == "Z" &&
                    it.parameterTypes.size == 1 &&
                    AccessFlags.PUBLIC.isSet(it.accessFlags)
                }
                .forEach { it.addInstructions(0, RETURN_FALSE) }
        }

        // OMS promo engine (em60): M(String,Z)Z is the dialog show-permission gate consulted by the
        // swipe-after trigger L (e_swipe_after / p_suggest_users_home_view), see_guide, offline_popup,
        // 5-star, positioning and the purchase nags; N(String,Z)Z is the matching ad-card gate (id0).
        // Forcing both false suppresses EVERY OMS promo dialog/card at the root instead of enumerating
        // popup keys (the old blocklist fell through to the original logic for unlisted keys, leaking
        // the likers/see promos). Verification/cheat-prevention popups route through s0 -> hn60.n and
        // never consult M/N, so they stay intact. Match by shape (public instance (String,Z)Z == {M,N}
        // in 7.5.4), not the obfuscated name; RETURN_FALSE is register-safe at any count.
        dialogClasses["omsDialogController"]?.let { classDef ->
            mutableClassDefBy(classDef).methods
                .filter { method ->
                    method.returnType == "Z" &&
                    method.parameterTypes.size == 2 &&
                    method.parameterTypes[0] == "Ljava/lang/String;" &&
                    method.parameterTypes[1] == "Z" &&
                    AccessFlags.PUBLIC.isSet(method.accessFlags) &&
                    !AccessFlags.STATIC.isSet(method.accessFlags)
                }
                .forEach { it.addInstructions(0, RETURN_FALSE) }
        }

        // Morph promo router (7.5.6.1 btf.c, was hn60.n): server-driven morph promos with text
        // absent from local resources bypass the OMS M/N gate and the likers creators. They route
        // through btf.c which either renders inline or starts OmsPageAct (fullscreen). Force c
        // false for morph content; verification popups use a different contentType and still work.
        // Resolve via the "oms_mercury" anchor + (Act,OMSDialogInfo)Z shape (version-agnostic).
        resolver.getMiscClass("morphRouter")?.let { classDef ->
            mutableClassDefBy(classDef).methods
                .filter { method ->
                    method.returnType == "Z" &&
                        method.parameterTypes == listOf("Lcom/p1/mobile/android/app/Act;", "Lcom/p1/mobile/putong/data/OMSDialogInfo;") &&
                        AccessFlags.PUBLIC.isSet(method.accessFlags) &&
                        !AccessFlags.STATIC.isSet(method.accessFlags)
                }
                .forEach { it.addInstructions(0, RETURN_FALSE) }
        }

        // Removed: splashProxyActFingerprint patch - too aggressive
        // Patching all public void no-arg methods breaks lifecycle methods (onCreate, onResume, etc.)
        // Phone auth dialogs are already handled by the OMS show-permission gate (M/N) above

        dialogClasses["gpRateGuide"]?.let { classDef ->
            mutableClassDefBy(classDef).methods
                .filter { method ->
                    method.parameterTypes.size == 1 &&
                    method.parameterTypes[0] == "Lcom/p1/mobile/android/app/Act;" &&
                    method.returnType == "V" &&
                    AccessFlags.PUBLIC.isSet(method.accessFlags) &&
                    !AccessFlags.STATIC.isSet(method.accessFlags)
                }
                .forEach { it.addInstructions(0, RETURN_VOID) }
        }

        // Fake "87% match" recall-match bait popup (ih9.x): raw PopupWindow, bypasses the OMS
        // M/N gate; percentage is fabricated Random().nextInt(19)+80; AB-gated (recall_guide)
        // not region-gated, so it leaks zh text to intl users. All triggers converge E→H→I→x.
        // Match the (Act,GrowthPushConfig,*)V method carrying BOTH popup-key strings in one
        // method (gotcha #15); sibling H has the same shape but no strings → excluded.
        resolver.getMiscClass("recallMatchPopup")?.let { classDef ->
            mutableClassDefBy(classDef).methods
                .filter { method ->
                    method.returnType == "V" && method.parameterTypes.size == 3 &&
                        method.parameterTypes[0] == "Lcom/p1/mobile/android/app/Act;" &&
                        method.parameterTypes[1] == "Lcom/p1/mobile/putong/core/data/GrowthPushConfig;" &&
                        method.containsExactString("p_recall_match_popup") &&
                        method.containsExactString("p_match_invitation_popup")
                }
                .forEach { it.addInstructions(0, RETURN_VOID) }
        }

        // "%s girls just liked you! / Match to Chat / Maybe Later" fake-likers growth dialog
        // (c9f, ex8 strategy-queue member registered by lb8). ex8.b(hu8)Z is the canShow gate
        // the queue checks before a() shows; force it false. Anchor: session-scope storage keys.
        resolver.getDialogClass("newLikeDialog")?.let { classDef ->
            mutableClassDefBy(classDef).methods
                .filter { method ->
                    method.returnType == "Z" && method.parameterTypes.size == 1 &&
                        !AccessFlags.STATIC.isSet(method.accessFlags)
                }
                .forEach { method ->
                    method.preflightSmali(RETURN_FALSE, 2)
                    method.addInstructions(0, RETURN_FALSE)
                }
        }

        // UX experience-questionnaire fetch (ytb.Z2): return an empty Observable instead of
        // hitting /experience-questionnaire. rx.c.empty() is non-null → subscribers safe.
        // NOT the /risk/ content-moderation pipeline (dt9.h3), which stays untouched.
        resolver.getMiscClass("uxQuestionnaire")?.let { classDef ->
            mutableClassDefBy(classDef).methods
                .filter { method ->
                    method.returnType == "Ll/vpf;" &&
                        method.containsExactString("/experience-questionnaire?scene=")
                }
                .forEach { method ->
                    method.preflightSmali(RETURN_RX_EMPTY, 3)
                    method.addInstructions(0, RETURN_RX_EMPTY)
                }
        }

        // Post-swipe full-screen "people who liked you" interrupt (SuggestersAct.c2 launcher).
        // Both callers are promo: g350 k7 routes showRules=="immediately" here, and the
        // type=newpage deeplink (jjf0). The functional See-Who-Likes-Me page (LikersAct) is a
        // separate activity and stays untouched. Stable CamelCase descriptor, cardinality 1.
        classDefByOrNull("Lcom/p1/mobile/putong/core/newui/suggest/SuggestersAct;")?.let { classDef ->
            mutableClassDefBy(classDef).methods
                .filter { method ->
                    AccessFlags.STATIC.isSet(method.accessFlags) &&
                        method.returnType == "V" &&
                        method.parameterTypes.size == 2 &&
                        method.parameterTypes[0] == "Landroid/content/Context;" &&
                        method.parameterTypes[1] == "Lcom/p1/mobile/putong/core/data/ActionPageFormat;"
                }
                .forEach { method ->
                    method.preflightSmali(RETURN_VOID, 1)
                    method.addInstructions(0, RETURN_VOID)
                }
        }

        // See-purchase-guide dialog (rcf.call case containing p_no_match_see_purchase_guide_view).
        // Shared dispatcher with packed-switch; find the case-entry check-cast (a check-cast
        // immediately after packed-switch or return-void) whose block contains the target string,
        // and inject return-void there.
        dialogClasses["seePurchaseGuide"]?.let { classDef ->
            mutableClassDefBy(classDef).methods
                .filter { method ->
                    method.parameterTypes.size == 1 &&
                        method.parameterTypes[0] == "Ljava/lang/Object;" &&
                        method.returnType == "V" &&
                        method.containsExactString("p_no_match_see_purchase_guide_view")
                }
                .forEach { method ->
                    val instructions = method.implementation?.instructions?.toList() ?: return@forEach
                    val targetIdx = instructions.indexOfFirst { instr ->
                        instr is ReferenceInstruction &&
                            (instr.reference as? StringReference)?.string == "p_no_match_see_purchase_guide_view"
                    }
                    if (targetIdx < 0) return@forEach
                    // Case-entry check-casts come right after packed-switch or return-void (end of prev case)
                    val caseEntries = instructions.withIndex().filter { (i, instr) ->
                        i > 0 && instr.opcode.name.startsWith("check-cast") &&
                            (instructions[i - 1].opcode.name == "packed-switch" ||
                                instructions[i - 1].opcode.name == "return-void")
                    }.map { it.index }
                    val blockEntry = caseEntries.firstOrNull { entryIdx ->
                        val nextEntry = caseEntries.firstOrNull { it > entryIdx } ?: instructions.size
                        instructions.subList(entryIdx, nextEntry).any { instr ->
                            instr is ReferenceInstruction &&
                                (instr.reference as? StringReference)?.string == "p_no_match_see_purchase_guide_view"
                        }
                    } ?: -1
                    if (blockEntry >= 0) {
                        method.addInstructions(blockEntry, RETURN_VOID)
                    }
                }
        }

        // Deck insert filters (uu3.call case 0): virtual promo cards (see-likers, native ad
        // cards, OMB) are inserted into the swipe deck's loaded list and List.add'ed at the
        // end of the case; the old home/c consumer backstop is gone in 7.5.6.1. The case
        // checks isVirtualCard() -> move-result -> if-nez (virtual branches to the skip-dedup
        // path which still adds the card). Replace the if-nez with a self-contained block:
        // non-virtual cards branch over the return-void (unchanged behavior); virtual cards
        // fall through and return before List.add, dropping the promo card.
        resolver.getMiscClass("repeatSuggestedCard")?.let { classDef ->
            mutableClassDefBy(classDef).methods
                .filter { method ->
                    method.parameterTypes.size == 1 &&
                        method.parameterTypes[0] == "Ljava/lang/Object;" &&
                        method.returnType == "V" &&
                        method.containsExactString("repeat suggested card")
                }
                .forEach { method ->
                    val instructions = method.sharedCachedInstructions()
                    val virtualIdx = instructions.indexOfFirst { instr ->
                        instr.opcode == Opcode.INVOKE_VIRTUAL && instr is ReferenceInstruction &&
                            (instr.reference as? MethodReference)?.let { ref ->
                                ref.definingClass == "Lcom/p1/mobile/putong/core/api/CoreSuggested\$UserInfo;" &&
                                    ref.name == "isVirtualCard"
                            } == true
                    }
                    if (virtualIdx < 0) return@forEach
                    val moveResultIdx = virtualIdx + 1
                    val ifNezIdx = virtualIdx + 2
                    if (ifNezIdx >= instructions.size ||
                        instructions[moveResultIdx].opcode != Opcode.MOVE_RESULT ||
                        instructions[ifNezIdx].opcode != Opcode.IF_NEZ) return@forEach
                    // The original if-nez sends virtual cards to the skip-dedup path which still
                    // List.add()s them. Mid-method label injection mis-resolves branch offsets
                    // (gotcha #9: internal labels resolve at index 0 only), so install the
                    // filter at the method entry instead, gated to case 0 (b==0) so the other
                    // dispatcher cases are untouched: non-virtual cards fall through to the
                    // normal dedup/add path; virtual promo cards (Town Tales, see-likers, OMB,
                    // native-ad cards) return before List.add. v17 is p0 (this); v8 is a free
                    // local at entry.
                    val block = """
                        move-object/from16 v8, v17
                        iget v9, v8, Ll/uu3;->b:I
                        if-nez v9, :uu3_not_deck
                        iget-object v8, v8, Ll/uu3;->f:Ljava/lang/Object;
                        check-cast v8, Lcom/p1/mobile/putong/core/api/CoreSuggested${'$'}UserInfo;
                        invoke-virtual {v8}, Lcom/p1/mobile/putong/core/api/CoreSuggested${'$'}UserInfo;->isVirtualCard()Z
                        move-result v8
                        if-eqz v8, :uu3_not_deck
                        return-void
                        :uu3_not_deck
                        nop
                    """.trimIndent()
                    method.preflightSmali(block, 10)
                    method.addInstructions(0, block)
                }
        }
    }
}
