package com.p1.mobile.putong.data

import app.morphe.patcher.extensions.InstructionExtensions.addInstructions
import app.morphe.patcher.patch.bytecodePatch
import com.android.tools.smali.dexlib2.AccessFlags
import com.android.tools.smali.dexlib2.iface.instruction.ReferenceInstruction
import com.android.tools.smali.dexlib2.iface.reference.MethodReference

private const val RC_F_OVERRIDE = """
    move-object/from16 v0, p1
    const-string v1, "popup_schedule_config"
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    move-result v0
    if-nez v0, :rc_empty_obj
    move-object/from16 v0, p1
    const-string v1, "mytab_see_red_dot_config"
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    move-result v0
    if-nez v0, :rc_red_dot
    move-object/from16 v0, p1
    const-string v1, "me_badge_icon_see_configs"
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    move-result v0
    if-nez v0, :rc_badge_interval
    move-object/from16 v0, p1
    const-string v1, "private_custom_config"
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    move-result v0
    if-nez v0, :rc_bubble_times
    move-object/from16 v0, p1
    const-string v1, "ttt_verification_guide_config"
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    move-result v0
    if-nez v0, :rc_verif_guide
    move-object/from16 v0, p1
    const-string v1, "ttt_lgbt_gender_for_ttt"
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    move-result v0
    if-nez v0, :rc_lgbt_gender
    move-object/from16 v0, p1
    const-string v1, "home_top_item_web_config"
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    move-result v0
    if-nez v0, :rc_disable
    move-object/from16 v0, p1
    const-string v1, "my_tab_opt_v2_config"
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    move-result v0
    if-nez v0, :rc_disable
    move-object/from16 v0, p1
    const-string v1, "verify_enter_config"
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    move-result v0
    if-nez v0, :rc_verify_enter
    move-object/from16 v0, p1
    const-string v1, "luckytantan_native_entrance"
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    move-result v0
    if-nez v0, :rc_empty_str
    move-object/from16 v0, p1
    const-string v1, "my_tab_vip"
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    move-result v0
    if-nez v0, :rc_my_tab_vip
    move-object/from16 v0, p1
    const-string v1, "moment_unread_notes"
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    move-result v0
    if-nez v0, :rc_moment_unread
    move-object/from16 v0, p1
    const-string v1, "vas_enhanced_promotion_perception"
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    move-result v0
    if-nez v0, :rc_promo_perception
    move-object/from16 v0, p1
    const-string v1, "superlike_promotion_config"
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    move-result v0
    if-nez v0, :rc_superlike_promo
    move-object/from16 v0, p1
    const-string v1, "intl_sl_guide_config"
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    move-result v0
    if-nez v0, :rc_sl_guide
    move-object/from16 v0, p1
    const-string v1, "optimize_tag_config"
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    move-result v0
    if-nez v0, :rc_optimize_tag
    move-object/from16 v0, p1
    const-string v1, "meet_feed_limit"
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    move-result v0
    if-nez v0, :rc_meet_feed
    goto :rc_not_matched
    :rc_empty_obj
    const-string v0, "{}"
    return-object v0
    :rc_red_dot
    const-string v0, "{\"male_noprivilege_or_vip_show\":false,\"male_overSVIP_show\":false,\"female_noprivilege_or_vip_show\":false,\"female_overSVIP_show\":false}"
    return-object v0
    :rc_badge_interval
    const-string v0, "{\"see_interval_days\":9999}"
    return-object v0
    :rc_bubble_times
    const-string v0, "{\"home_tab_bubble_times\":0}"
    return-object v0
    :rc_verif_guide
    const-string v0, "{\"swipedCard\":2147483647,\"displayCount\":0}"
    return-object v0
    :rc_lgbt_gender
    const-string v0, "{\"enable\":true,\"disabledMcc\":[]}"
    return-object v0
    :rc_disable
    const-string v0, "{\"enable\":false}"
    return-object v0
    :rc_verify_enter
    const-string v0, "{\"tantan_tab\":{\"enable\":false},\"me_tab\":{\"enable\":false}}"
    return-object v0
    :rc_empty_str
    const-string v0, ""
    return-object v0
    :rc_my_tab_vip
    const-string v0, "{\"enable_scroll_guide\":false}"
    return-object v0
    :rc_moment_unread
    const-string v0, "{\"MomentUnreadNotesAll\":true,\"unreadNotes\":100,\"autoClearSwitch\":true,\"unreadnoticenumber\":0,\"unreadguidepopshownumber\":0}"
    return-object v0
    :rc_promo_perception
    const-string v0, "{\"show_promotion_hours_limit\":0}"
    return-object v0
    :rc_superlike_promo
    const-string v0, "{\"male_poplevel\":999,\"female_poplevel\":999}"
    return-object v0
    :rc_sl_guide
    const-string v0, "{\"intl_sl_card_guide_dlg_men\":0,\"intl_sl_card_guide_dlg_women\":0,\"intl_pop_0_20_men\":0.395,\"intl_pop_0_20_women\":0.74,\"intl_pop_0_30_men\":0.355,\"intl_pop_0_30_women\":0.705,\"intl_card_user_last_active_limit_time\":24}"
    return-object v0
    :rc_optimize_tag
    const-string v0, "{\"maximumSelectableTagCount\":999,\"minimumSelectableTagCount\":0,\"tagClickable\":true}"
    return-object v0
    :rc_meet_feed
    const-string v0, "{\"mask_feed_num\":0,\"clear_feed_num\":0}"
    return-object v0
    :rc_not_matched
"""

private const val RC_S_OVERRIDE = """
    move-object/from16 v0, p1
    const-string v1, "bad_token_exprie_control"
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    move-result v0
    if-nez v0, :rc_false
    move-object/from16 v0, p1
    const-string v1, "nearbyBanner_reddot"
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    move-result v0
    if-nez v0, :rc_false
    move-object/from16 v0, p1
    const-string v1, "ttt_profile_voice_enabled"
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    move-result v0
    if-nez v0, :rc_true
    goto :rc_not_matched
    :rc_false
    const/4 v0, 0x0
    return v0
    :rc_true
    const/4 v0, 0x1
    return v0
    :rc_not_matched
"""

@Suppress("unused")
@JvmField
val remoteConfigOverridePatch = bytecodePatch(
    name = "Remote Config Override",
    description = "Overrides remote configuration values: removes quick chat limits, disables text buzz auto-delete, suppresses scheduled promo popups and see/visitor red-dot nags, enables multi-gender / looking-for-everyone selector, kills swipe-tab webview takeover and verification/cert/VIP me-tab nags, raises superlike bubble thresholds, unmasks Meet feed, relaxes profile tag limits, enables profile voice intro",
    default = true,
) {
    compatibleWith(tantanCompatibility)
    execute {
        // 7.5.6.1: the stable RemoteConfig class was obfuscated to Ll/ngi; (only ConfigStep /
        // RemoteConfigException keep the name). Getters: F->k(String)String regs5, s->c(String)Z
        // regs6, z->i(String,I)I regs3, y->h(String)I regs3. The long getter B has no ngi wrapper;
        // consumers call the provider pq2.e(String,J)J regs9 directly. Resolve ngi via the
        // "saved_device_uid_md5" anchor; derive the provider from h's (String,I)I delegate.
        val resolver = getSharedResolver()
        resolver.getMiscClass("remoteConfig")?.let { classDef ->
            val rcDesc = classDef.type
            val mutableClassDef = mutableClassDefBy(classDef)

            // k(String)String: RC_F_OVERRIDE uses v0/v1 scratch + p1 key shuttle; falls through
            // to the original JSON read for unlisted keys (this/key untouched).
            mutableClassDef.methods
                .filter { it.parameterTypes == listOf("Ljava/lang/String;") && it.returnType == "Ljava/lang/String;" &&
                    AccessFlags.PUBLIC.isSet(it.accessFlags) && !AccessFlags.STATIC.isSet(it.accessFlags) }
                .forEach { it.addInstructions(0, RC_F_OVERRIDE) }

            // c(String)Z: RC_S_OVERRIDE, same scratch/shuttle pattern.
            mutableClassDef.methods
                .filter { it.parameterTypes == listOf("Ljava/lang/String;") && it.returnType == "Z" &&
                    AccessFlags.PUBLIC.isSet(it.accessFlags) && !AccessFlags.STATIC.isSet(it.accessFlags) }
                .forEach { it.addInstructions(0, RC_S_OVERRIDE) }

            // i(String,I)I: registers computed absolutely (key=rc-2, default=rc-1; rc=3 ->
            // key=v1, default=v2, v0 scratch clobbers `this` but every branch returns immediately).
            // Unlisted keys return the caller-supplied default.
            mutableClassDef.methods
                .filter { it.parameterTypes == listOf("Ljava/lang/String;", "I") && it.returnType == "I" &&
                    AccessFlags.PUBLIC.isSet(it.accessFlags) }
                .forEach { method ->
                    val rc = method.implementation?.registerCount ?: 0
                    check(rc >= 3) { "RemoteConfig int getter has no scratch register (regs=$rc)" }
                    val keyReg = rc - 2
                    val defReg = rc - 1
                    val zeroKeys = listOf(
                        "vas_platinum_top_message_guide_max_show",
                        "vas_platinum_top_message_guide_max_show_per_conv",
                        "vas_platinum_pin_like_guide_anim_max_count",
                        "vas_hide_visit_banner_show_times_someone_daily",
                        "vas_hide_visit_banner_show_total_times_daily"
                    )
                    val n999Keys = listOf(
                        "platinum_accelerate_pairing_free_num",
                        "vas_diamond_hide_visit_privilege_count_permonth",
                        "vas_diamond_hide_visit_visit_other_times",
                        "moment_interact_quick_comment_limit"
                    )
                    val smali = buildString {
                        appendLine("const-string v0, \"showQuickChatCardSwipedCount\"")
                        appendLine("invoke-virtual {v$keyReg, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z")
                        appendLine("move-result v0")
                        appendLine("if-nez v0, :rc_9999")
                        for (key in zeroKeys) {
                            appendLine("const-string v0, \"$key\"")
                            appendLine("invoke-virtual {v$keyReg, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z")
                            appendLine("move-result v0")
                            appendLine("if-nez v0, :rc_zero")
                        }
                        for (key in n999Keys) {
                            appendLine("const-string v0, \"$key\"")
                            appendLine("invoke-virtual {v$keyReg, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z")
                            appendLine("move-result v0")
                            appendLine("if-nez v0, :rc_999")
                        }
                        appendLine("goto :rc_default")
                        appendLine(":rc_9999")
                        appendLine("const v0, 0x270f")
                        appendLine("return v0")
                        appendLine(":rc_999")
                        appendLine("const/16 v0, 0x3e7")
                        appendLine("return v0")
                        appendLine(":rc_zero")
                        appendLine("const/4 v0, 0x0")
                        appendLine("return v0")
                        appendLine(":rc_default")
                        appendLine("move v0, v$defReg")
                        appendLine("return v0")
                    }
                    val keyChecks = 1 + zeroKeys.size + n999Keys.size
                    method.preflightSmali(smali, keyChecks * 4 + 9)
                    method.addInstructions(0, smali)
                }

            // h(String)I (no-default int): single-scratch pattern (key stays in rc-1, only v0
            // clobbered; the original body redefines v0 before reading). rc=3 -> keyReg=v2.
            val intNoDefaultGetter = mutableClassDef.methods.firstOrNull {
                it.parameterTypes == listOf("Ljava/lang/String;") && it.returnType == "I" &&
                    AccessFlags.PUBLIC.isSet(it.accessFlags) && !AccessFlags.STATIC.isSet(it.accessFlags)
            }
            intNoDefaultGetter?.let { method ->
                val rc = method.implementation?.registerCount ?: 0
                val keyReg = rc - 1
                if (rc >= 3 && keyReg <= 15) {
                    val smali = """
                        const-string v0, "guide_give_superlike_pop"
                        invoke-virtual {v$keyReg, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
                        move-result v0
                        if-nez v0, :rc_999
                        const-string v0, "guide_give_superlike_pop_female"
                        invoke-virtual {v$keyReg, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
                        move-result v0
                        if-nez v0, :rc_999
                        goto :rc_not_matched
                        :rc_999
                        const/16 v0, 0x3e7
                        return v0
                        :rc_not_matched
                    """.trimIndent()
                    method.preflightSmali(smali, 11)
                    method.addInstructions(0, smali)
                }

                // Derive the backing provider (7.5.6.1 pq2) from h's (String,I)I delegate, then
                // patch its long getter e(String,J)J for the text-buzz auto-delete key. h's body
                // is a pure delegate (e().d(str,0)), so the first foreign (String,I)I call is the
                // provider int getter — NOT a JSONObject read (the k/c inlining trap avoids here).
                val providerRef = method.implementation?.instructions?.asSequence()
                    ?.mapNotNull { (it as? ReferenceInstruction)?.reference as? MethodReference }
                    ?.firstOrNull {
                        it.definingClass != rcDesc &&
                            it.parameterTypes == listOf("Ljava/lang/String;", "I") && it.returnType == "I"
                    }
                providerRef?.let { ref ->
                    classDefByOrNull(ref.definingClass)?.let { provider ->
                        mutableClassDefBy(provider).methods
                            .filter { it.parameterTypes == listOf("Ljava/lang/String;", "J") && it.returnType == "J" &&
                                AccessFlags.PUBLIC.isSet(it.accessFlags) }
                            .forEach { longMethod ->
                                val lrc = longMethod.implementation?.registerCount ?: 0
                                // instance (String,J): this=rc-4, key=rc-3, default=rc-2 (wide).
                                val lKeyReg = lrc - 3
                                val lDefReg = lrc - 2
                                if (lrc >= 5 && lKeyReg <= 15) {
                                    val smali = """
                                        const-string v0, "intl_text_buzz_auto_delete_interval"
                                        invoke-virtual {v$lKeyReg, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
                                        move-result v0
                                        if-eqz v0, :not_matched
                                        const-wide/16 v0, 0x0
                                        return-wide v0
                                        :not_matched
                                        return-wide v$lDefReg
                                    """.trimIndent()
                                    longMethod.preflightSmali(smali, 7)
                                    longMethod.addInstructions(0, smali)
                                }
                            }
                    }
                }
            }
        }
    }
}
