package com.p1.mobile.putong.data

import app.morphe.patcher.extensions.InstructionExtensions.addInstructions
import app.morphe.patcher.patch.bytecodePatch
import com.android.tools.smali.dexlib2.AccessFlags

private fun buildI0Instructions(paramReg: Int): String {
    return """
        move-object v0, v$paramReg

        const-string v1, "chat_newmatch_continue"
        invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
        move-result v1
        if-eqz v1, :skip_chat_newmatch
        const-string v0, "exp_strategy"
        return-object v0
        :skip_chat_newmatch

        const-string v1, "quick_message"
        invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
        move-result v1
        if-eqz v1, :skip_quick_message
        const-string v0, "exp"
        return-object v0
        :skip_quick_message

        const-string v1, "batch_icebreak"
        invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
        move-result v1
        if-eqz v1, :skip_batch_icebreak
        const-string v0, "exp1"
        return-object v0
        :skip_batch_icebreak

        const-string v1, "newuser_icebreak_lead"
        invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
        move-result v1
        if-eqz v1, :skip_icebreak_lead
        const-string v0, "exp"
        return-object v0
        :skip_icebreak_lead

        const-string v1, "chat_match"
        invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
        move-result v1
        if-eqz v1, :skip_chat_match
        const-string v0, "with_icebreak_text"
        return-object v0
        :skip_chat_match

        const-string v1, "ChatViewOptimizationAndroid"
        invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
        move-result v1
        if-eqz v1, :skip_chat_view_opt
        const-string v0, "_exp"
        return-object v0
        :skip_chat_view_opt

        const-string v1, "chat_cell_active"
        invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
        move-result v1
        if-eqz v1, :skip_chat_cell
        const-string v0, "exp"
        return-object v0
        :skip_chat_cell

        const-string v1, "verified_to_chat"
        invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
        move-result v1
        if-eqz v1, :skip_verified_chat
        const-string v0, "exp"
        return-object v0
        :skip_verified_chat

        const-string v1, "sticker_show_time"
        invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
        move-result v1
        if-eqz v1, :skip_sticker
        const-string v0, "exp"
        return-object v0
        :skip_sticker

        const-string v1, "e_surprisebox"
        invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
        move-result v1
        if-eqz v1, :skip_surprisebox
        const-string v0, "exp"
        return-object v0
        :skip_surprisebox

        const-string v1, "quickchat_male_ring"
        invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
        move-result v1
        if-eqz v1, :skip_quickchat_ring
        const-string v0, "exp1"
        return-object v0
        :skip_quickchat_ring

        const-string v1, "anti_harass_customiza_set"
        invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
        move-result v1
        if-eqz v1, :skip_anti_harass
        const-string v0, "_match_include"
        return-object v0
        :skip_anti_harass

        const-string v1, "REV_tieredmembership"
        invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
        move-result v1
        if-eqz v1, :skip_tiered
        const-string v0, "exp"
        return-object v0
        :skip_tiered

        const-string v1, "REV_platinum_membership_2"
        invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
        move-result v1
        if-eqz v1, :skip_plat2
        const-string v0, "exp"
        return-object v0
        :skip_plat2

        const-string v1, "REV_platinum_membership_3"
        invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
        move-result v1
        if-eqz v1, :skip_plat3
        const-string v0, "exp"
        return-object v0
        :skip_plat3

        const-string v1, "REV_platinium_4"
        invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
        move-result v1
        if-eqz v1, :skip_plat4
        const-string v0, "exp1"
        return-object v0
        :skip_plat4

        const-string v1, "REV_promo_upgrade1"
        invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
        move-result v1
        if-eqz v1, :skip_promo
        const-string v0, "exp"
        return-object v0
        :skip_promo
    """
}

private fun buildJ0Instructions(paramReg: Int): String {
    // Single-scratch pattern: the key stays in its param register (v$paramReg) and only v0
    // is clobbered, so this is safe at registers==2 (7.5.4 j0: p0=v1, scratch v0). The old
    // two-scratch pattern required regs>=3 and was a SILENT NO-OP in 7.5.4 (j0 has regs=2).
    // Pre-existing entry values are unchanged; the three promo keys return "" (off).
    return """
        const-string v0, "intl_instantmatch_open_user"
        invoke-virtual {v$paramReg, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
        move-result v0
        if-nez v0, :val_test
        const-string v0, "intl_me_tab_revamp"
        invoke-virtual {v$paramReg, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
        move-result v0
        if-nez v0, :val_test
        const-string v0, "intl_letterc"
        invoke-virtual {v$paramReg, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
        move-result v0
        if-nez v0, :val_a
        const-string v0, "intl_consume_iap_large_page"
        invoke-virtual {v$paramReg, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
        move-result v0
        if-nez v0, :val_Test
        const-string v0, "intl_see_card_tag"
        invoke-virtual {v$paramReg, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
        move-result v0
        if-nez v0, :val_test2
        const-string v0, "intl_photo_verification_banner"
        invoke-virtual {v$paramReg, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
        move-result v0
        if-nez v0, :val_empty
        const-string v0, "intl_me_subscription_card_show"
        invoke-virtual {v$paramReg, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
        move-result v0
        if-nez v0, :val_empty
        const-string v0, "IntlRewardAds"
        invoke-virtual {v$paramReg, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
        move-result v0
        if-nez v0, :val_empty
        goto :not_matched
        :val_test
        const-string v0, "test"
        return-object v0
        :val_a
        const-string v0, "a"
        return-object v0
        :val_Test
        const-string v0, "_Test"
        return-object v0
        :val_test2
        const-string v0, "test2"
        return-object v0
        :val_empty
        const-string v0, ""
        return-object v0
        :not_matched
        move-object v0, v$paramReg
        return-object v0
    """
}

@Suppress("unused")
@JvmField
val abTestOverridePatch = bytecodePatch(
    name = "AB Test Override",
    description = "Overrides A/B test values to enable beneficial features: instant match, quick message, batch icebreak, chat optimization, letter features, me tab revamp, verified chat, tiered membership, platinum membership, surprise box, anti-harass customization",
    default = true,
) {
    compatibleWith(tantanCompatibility)
    execute {
        // 7.5.6.1: ABManager was obfuscated to Ll/q; (only ABManager$Mode keeps the name). The
        // live AB bucket read is the public static (String)String getter (q.t, regs=2). Resolve
        // version-agnostically via the "newabgroups_mode_device" anchor + getter shape. The old
        // i0 map is gone (legacy null-stub overrides dropped). Single-scratch injection unchanged:
        // key stays in its param register (rc-1), only v0 clobbered, safe at regs==2.
        getSharedResolver().getMiscClass("abManager")?.let { classDef ->
            mutableClassDefBy(classDef).methods
                .filter { method ->
                    method.parameterTypes == listOf("Ljava/lang/String;") &&
                        method.returnType == "Ljava/lang/String;" &&
                        AccessFlags.PUBLIC.isSet(method.accessFlags) &&
                        AccessFlags.STATIC.isSet(method.accessFlags)
                }
                .forEach { method ->
                    val registerCount = method.implementation?.registerCount ?: 0
                    val paramReg = registerCount - 1
                    if (registerCount >= 2 && paramReg <= 15) {
                        val smali = buildJ0Instructions(paramReg)
                        method.preflightSmali(smali, 45)
                        method.addInstructions(0, smali)
                    }
                }
        }
    }
}
