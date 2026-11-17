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
    goto :rc_not_matched
    :rc_false
    const/4 v0, 0x0
    return v0
    :rc_not_matched
"""

@Suppress("unused")
@JvmField
val remoteConfigOverridePatch = bytecodePatch(
    name = "Remote Config Override",
    description = "Overrides remote configuration values: removes quick chat limits, disables text buzz auto-delete, suppresses scheduled promo popups and see/visitor red-dot nags",
    default = true,
) {
    compatibleWith(tantanCompatibility)
    execute {
        val rcDesc = "Lcom/p1/mobile/putong/remote_config/RemoteConfig;"
        classDefByOrNull(rcDesc)?.let { classDef ->
            val mutableClassDef = mutableClassDefBy(classDef)

            mutableClassDef.methods
                .filter { method ->
                    method.name == "z" &&
                        method.parameterTypes.size == 2 &&
                        method.parameterTypes[0] == "Ljava/lang/String;" &&
                        method.parameterTypes[1] == "I" &&
                        method.returnType == "I" &&
                        AccessFlags.PUBLIC.isSet(method.accessFlags)
                }
                .forEach { method ->
                    method.addInstructions(0, """
                        const-string v0, "showQuickChatCardSwipedCount"
                        invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
                        move-result v0
                        if-eqz v0, :not_matched
                        const v0, 0x270f
                        return v0
                        :not_matched
                        move v0, v2
                        return v0
                    """)
                }

            mutableClassDef.methods
                .filter { method ->
                    method.name == "B" &&
                        method.parameterTypes.size == 2 &&
                        method.parameterTypes[0] == "Ljava/lang/String;" &&
                        method.parameterTypes[1] == "J" &&
                        method.returnType == "J" &&
                        AccessFlags.PUBLIC.isSet(method.accessFlags)
                }
                .forEach { method ->
                    method.addInstructions(0, """
                        const-string v0, "intl_text_buzz_auto_delete_interval"
                        invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
                        move-result v0
                        if-eqz v0, :not_matched
                        const-wide/16 v0, 0x0
                        return-wide v0
                        :not_matched
                        return-wide v2
                    """)
                }

            // F(String)String and s(String)Z have registers==2 (no free scratch) and their
            // bodies read `this` immediately, so they cannot be patched with a fall-through
            // key comparison (gotcha #9). Both delegate to the backing provider returned by
            // u() (7.5.4: Ll/f96;->t(String)String / f(String)Z, registers 4/5 with free
            // scratch). Derive that provider + getter names from the stable RemoteConfig.F/s
            // bodies (version-agnostic) and patch the provider getters, which DO fall through.
            fun delegateGetter(name: String, ret: String): Pair<String, String>? {
                val m = mutableClassDef.methods.firstOrNull {
                    it.name == name && it.parameterTypes.size == 1 &&
                        it.parameterTypes[0] == "Ljava/lang/String;" && it.returnType == ret
                } ?: return null
                val ref = m.implementation?.instructions?.asSequence()
                    ?.mapNotNull { (it as? ReferenceInstruction)?.reference as? MethodReference }
                    ?.firstOrNull {
                        it.definingClass != rcDesc && it.parameterTypes.size == 1 &&
                            it.parameterTypes[0] == "Ljava/lang/String;" && it.returnType == ret
                    } ?: return null
                return ref.definingClass to ref.name
            }

            delegateGetter("F", "Ljava/lang/String;")?.let { (providerDesc, getterName) ->
                classDefByOrNull(providerDesc)?.let { provider ->
                    mutableClassDefBy(provider).methods
                        .filter {
                            it.name == getterName && it.parameterTypes.size == 1 &&
                                it.parameterTypes[0] == "Ljava/lang/String;" &&
                                it.returnType == "Ljava/lang/String;" &&
                                AccessFlags.PUBLIC.isSet(it.accessFlags)
                        }
                        .forEach { it.addInstructions(0, RC_F_OVERRIDE) }
                }
            }

            delegateGetter("s", "Z")?.let { (providerDesc, getterName) ->
                classDefByOrNull(providerDesc)?.let { provider ->
                    mutableClassDefBy(provider).methods
                        .filter {
                            it.name == getterName && it.parameterTypes.size == 1 &&
                                it.parameterTypes[0] == "Ljava/lang/String;" &&
                                it.returnType == "Z" &&
                                AccessFlags.PUBLIC.isSet(it.accessFlags)
                        }
                        .forEach { it.addInstructions(0, RC_S_OVERRIDE) }
                }
            }
        }
    }
}