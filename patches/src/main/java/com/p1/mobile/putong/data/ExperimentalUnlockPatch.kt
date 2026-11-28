package com.p1.mobile.putong.data

import app.morphe.patcher.extensions.InstructionExtensions.addInstructions
import app.morphe.patcher.extensions.InstructionExtensions.replaceInstruction
import app.morphe.patcher.patch.bytecodePatch
import app.morphe.patcher.util.proxy.mutableTypes.MutableMethod
import app.morphe.patcher.util.smali.InlineSmaliCompiler
import com.android.tools.smali.dexlib2.AccessFlags
import com.android.tools.smali.dexlib2.Opcode
import com.android.tools.smali.dexlib2.builder.instruction.BuilderInstruction20t
import com.android.tools.smali.dexlib2.builder.instruction.BuilderInstruction21t
import com.android.tools.smali.dexlib2.iface.Method
import com.android.tools.smali.dexlib2.iface.instruction.Instruction
import com.android.tools.smali.dexlib2.iface.instruction.ReferenceInstruction
import com.android.tools.smali.dexlib2.iface.instruction.WideLiteralInstruction
import com.android.tools.smali.dexlib2.iface.reference.FieldReference

private const val RETURN_TRUE = """
    const/4 v0, 0x1
    return v0
"""

private const val RETURN_FALSE = """
    const/4 v0, 0x0
    return v0
"""

private const val LOCATION_CLASS = "Lcom/p1/mobile/putong/location/a;"
private const val LOCATION_PARAM = "Lcom/p1/mobile/putong/location/Location;"
private const val CORE_BUZZ_INNER_SERVICE_CLASS = "Lcom/p1/mobile/putong/core/buzz/module/CoreBuzzInnerServiceImpl;"
private const val ACT_CLASS = "Lcom/p1/mobile/android/app/Act;"
private const val VIEW_CLASS = "Landroid/view/View;"
private const val USER_PRIVILEGE_CONTENT_CLASS = "Lcom/p1/mobile/putong/core/data/UserPrivilegeContent;"
private const val AI_CHAT_ADVICE_CONVS_CLASS = "Lcom/p1/mobile/putong/core/data/AiChatAdviceConvs;"

private const val LAT_30_BITS = 0x403e000000000000L
private const val LNG_104_BITS = 0x405a000000000000L

private fun openRemainingCountGates(
    instrs: List<Instruction>,
    mutableMethod: MutableMethod
): Int {
    val mutableInstrs = mutableMethod.implementation?.instructions?.toList() ?: return 0
    val remainingIndices = instrs.withIndex().filter { (_, instr) ->
        instr.opcode == Opcode.IGET && instr is ReferenceInstruction &&
            (instr.reference as? FieldReference)?.let {
                it.definingClass == USER_PRIVILEGE_CONTENT_CLASS && it.name == "remaining"
            } == true
    }.map { it.index }
    var edited = 0
    remainingIndices.forEachIndexed { k, i ->
        val limit = if (k + 1 < remainingIndices.size) remainingIndices[k + 1] else instrs.size
        for (j in i + 1 until limit) {
            if (instrs[j].opcode == Opcode.IF_GTZ) {
                val branch = mutableInstrs.getOrNull(j)
                if (branch is BuilderInstruction21t) {
                    mutableMethod.replaceInstruction(j, BuilderInstruction20t(Opcode.GOTO_16, branch.target))
                    edited++
                }
                break
            }
        }
    }
    return edited
}

@Suppress("unused")
@JvmField
val experimentalUnlockPatch = bytecodePatch(
    name = "Experimental Unlock",
    description = "Opt-in, server-dependent unlocks: buzz call +time (prolong) count, pin-chat remaining count, AI chat advice/analysis guide counts, and fake-GPS default-coordinate blacklist bypass. Client gates only — the server may refuse (quota/region); each has a graceful failure path. Enable only after device-testing",
    default = false,
) {
    compatibleWith(tantanCompatibility)
    execute {
        val resolver = getSharedResolver()

        classDefByOrNull(CORE_BUZZ_INNER_SERVICE_CLASS)?.let { classDef ->
            val mutable = mutableClassDefBy(classDef)
            val methodMap = classDef.methods.zip(mutable.methods).toMap()
            var edited = 0
            classDef.methods.forEach { method ->
                if (method.returnType != "V" ||
                    method.parameterTypes != listOf(ACT_CLASS, "Ljava/lang/String;") ||
                    !method.containsExactString("buzzProlong")) return@forEach
                val mutableMethod = methodMap[method] ?: return@forEach
                edited += openRemainingCountGates(method.sharedCachedInstructions(), mutableMethod)
            }
            check(edited == 1) { "buzzProlong V5 count-gate edits: $edited" }
        }

        resolver.getMiscClass("pinChatListener")?.let { classDef ->
            val mutable = mutableClassDefBy(classDef)
            val methodMap = classDef.methods.zip(mutable.methods).toMap()
            var edited = 0
            classDef.methods.forEach { method ->
                if (method.name != "onClick" || method.returnType != "V" ||
                    method.parameterTypes != listOf(VIEW_CLASS)) return@forEach
                val mutableMethod = methodMap[method] ?: return@forEach
                edited += openRemainingCountGates(method.sharedCachedInstructions(), mutableMethod)
            }
            check(edited == 1) { "pinChat onClick count-gate edits: $edited" }
        }

        // 7f. AI chat advice/analysis gates: NOT patched (reverted 2026-11-28). Same trap class
        // as 7e (aiChatCompanion): w2() and z2()'s remaining<=0 guards are the client half of a
        // SERVER-ENFORCED entitlement. Forcing them made a4e schedule /show-analysis-guide/ +
        // e0/B0 advice calls seconds after typing begins -> server rejects -> "Something went
        // wrong" dialog during input (device regression on wave 6 with the toggle enabled).

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
