package com.p1.mobile.putong.data

import app.morphe.patcher.extensions.InstructionExtensions.addInstructions
import app.morphe.patcher.patch.bytecodePatch
import com.android.tools.smali.dexlib2.AccessFlags
import com.android.tools.smali.dexlib2.Opcode
import com.android.tools.smali.dexlib2.iface.Method
import com.android.tools.smali.dexlib2.iface.instruction.NarrowLiteralInstruction
import com.android.tools.smali.dexlib2.iface.instruction.ReferenceInstruction
import com.android.tools.smali.dexlib2.iface.instruction.WideLiteralInstruction
import com.android.tools.smali.dexlib2.iface.reference.MethodReference

private const val RETURN_TRUE = """
    const/4 v0, 0x1
    return v0
"""

private const val RETURN_FALSE = """
    const/4 v0, 0x0
    return v0
"""

private const val RETURN_INT_999 = """
    const/16 v0, 0x3e7
    return v0
"""

private const val ITEM_MESSAGE_BASE_CLASS = "Lcom/p1/mobile/putong/core/ui/messages/ItemMessageBase;"
private const val CORE_BUSINESS_SERVICE_IML_CLASS = "Lcom/p1/mobile/putong/core/module/CoreBusinessServiceIml;"
private const val LOCATION_CLASS = "Lcom/p1/mobile/putong/location/a;"
private const val LOCATION_PARAM = "Lcom/p1/mobile/putong/location/Location;"

private const val LAT_30_BITS = 0x403e000000000000L
private const val LNG_104_BITS = 0x405a000000000000L

private fun isConstFalseBody(method: Method): Boolean {
    val instrs = method.sharedCachedInstructions()
    if (instrs.size != 2) return false
    val first = instrs[0]
    val second = instrs[1]
    return first.opcode == Opcode.CONST_4 && first is NarrowLiteralInstruction && first.narrowLiteral == 0 &&
        second.opcode == Opcode.RETURN
}

@Suppress("unused")
@JvmField
val experimentalUnlockPatch = bytecodePatch(
    name = "Experimental Unlock",
    description = "Opt-in, server-dependent unlocks: voice-to-text transcription flag, buzz call +time (prolong) count, AI chat companion gate, and fake-GPS default-coordinate blacklist bypass. Client gates only — the server may refuse (quota/region); each has a graceful failure path. Enable only after device-testing",
    default = false,
) {
    compatibleWith(tantanCompatibility)
    execute {
        val resolver = getSharedResolver()

        // 7a. Voice-to-text transcription flag. The gate is an interface default ()Z returning
        // const/4 0, invoked from ItemMessageBase. CoreBusinessServiceIml does NOT override it.
        // Resolve version-agnostically: find the ItemMessageBase method carrying the stable
        // convert-to-text analytics string, collect its invokeinterface ()Z names, then force
        // the matching const-false default in CoreBusinessServiceIml's interfaces to true.
        // (The other const-false default v() is excluded: it is not called from that method.)
        val gateNames = classDefByOrNull(ITEM_MESSAGE_BASE_CLASS)?.methods
            ?.filter { it.containsExactString("e_chat_message_convert_to_text_hold_press_button") }
            ?.flatMap { it.sharedCachedInstructions() }
            ?.filter { it.opcode == Opcode.INVOKE_INTERFACE && it is ReferenceInstruction }
            ?.mapNotNull { (it as ReferenceInstruction).reference as? MethodReference }
            ?.filter { it.parameterTypes.isEmpty() && it.returnType == "Z" }
            ?.map { it.name }
            ?.toSet()
            .orEmpty()
        if (gateNames.isNotEmpty()) {
            classDefByOrNull(CORE_BUSINESS_SERVICE_IML_CLASS)?.interfaces?.forEach { ifaceDesc ->
                classDefByOrNull(ifaceDesc)?.let { iface ->
                    mutableClassDefBy(iface).methods
                        .filter { m ->
                            m.name in gateNames && m.parameterTypes.isEmpty() && m.returnType == "Z" &&
                                m.implementation != null && !AccessFlags.ABSTRACT.isSet(m.accessFlags) &&
                                isConstFalseBody(m)
                        }
                        .forEach { m ->
                            m.preflightSmali(RETURN_TRUE, 2)
                            m.addInstructions(0, RETURN_TRUE)
                        }
                }
            }
        }

        // 7b. Buzz call +time (prolong) count (i4x.f). Enables the +time button; the server
        // consumes the privilege and may reject at remaining=0. Matched calls already unlimited.
        // The ymy countdown is server-push-driven and deliberately NOT patched.
        resolver.getMiscClass("buzzProlong")?.let { classDef ->
            mutableClassDefBy(classDef).methods
                .filter { m ->
                    m.returnType == "I" && m.parameterTypes.isEmpty() && m.containsExactString("buzzProlong")
                }
                .forEach { m ->
                    m.preflightSmali(RETURN_INT_999, 2)
                    m.addInstructions(0, RETURN_INT_999)
                }
        }

        // 7c. AI chat companion gate (xma.x3). The AI count getters (aiChatAnalysis/aiChatAdvice/
        // letter) are ALREADY forced to 200000 by PremiumUnlock's blanket static ()I override —
        // do not duplicate them here (gotcha #7). Only the ()Z companion gate is unpatched.
        resolver.getPremiumClass("xma")?.let { xma ->
            mutableClassDefBy(xma).methods
                .filter { m ->
                    AccessFlags.PUBLIC.isSet(m.accessFlags) && AccessFlags.STATIC.isSet(m.accessFlags) &&
                        m.returnType == "Z" && m.parameterTypes.isEmpty() &&
                        m.containsExactString("aiChatCompanion")
                }
                .forEach { m ->
                    m.preflightSmali(RETURN_TRUE, 2)
                    m.addInstructions(0, RETURN_TRUE)
                }
        }

        // 7d. Fake-GPS default-coordinate blacklist (location/a.k). Accept all fixes by forcing
        // the invalid-coordinate detector false. Risk: genuine (0,0) invalid fixes → "null
        // island" profile; opt-in only. Anchored on the 30.0/104.0 default-coordinate literals.
        classDefByOrNull(LOCATION_CLASS)?.let { classDef ->
            mutableClassDefBy(classDef).methods
                .filter { m ->
                    m.returnType == "Z" && m.parameterTypes == listOf(LOCATION_PARAM) &&
                        m.sharedCachedInstructions().any { it is WideLiteralInstruction && it.wideLiteral == LAT_30_BITS } &&
                        m.sharedCachedInstructions().any { it is WideLiteralInstruction && it.wideLiteral == LNG_104_BITS }
                }
                .forEach { m ->
                    m.preflightSmali(RETURN_FALSE, 2)
                    m.addInstructions(0, RETURN_FALSE)
                }
        }
    }
}
