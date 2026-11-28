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
import com.android.tools.smali.dexlib2.iface.instruction.NarrowLiteralInstruction
import com.android.tools.smali.dexlib2.iface.instruction.ReferenceInstruction
import com.android.tools.smali.dexlib2.iface.instruction.WideLiteralInstruction
import com.android.tools.smali.dexlib2.iface.reference.FieldReference
import com.android.tools.smali.dexlib2.iface.reference.MethodReference

private const val RETURN_TRUE = """
    const/4 v0, 0x1
    return v0
"""

private const val RETURN_FALSE = """
    const/4 v0, 0x0
    return v0
"""

private const val ITEM_MESSAGE_BASE_CLASS = "Lcom/p1/mobile/putong/core/ui/messages/ItemMessageBase;"
private const val CORE_BUSINESS_SERVICE_IML_CLASS = "Lcom/p1/mobile/putong/core/module/CoreBusinessServiceIml;"
private const val LOCATION_CLASS = "Lcom/p1/mobile/putong/location/a;"
private const val LOCATION_PARAM = "Lcom/p1/mobile/putong/location/Location;"
private const val CORE_BUZZ_INNER_SERVICE_CLASS = "Lcom/p1/mobile/putong/core/buzz/module/CoreBuzzInnerServiceImpl;"
private const val ACT_CLASS = "Lcom/p1/mobile/android/app/Act;"
private const val VIEW_CLASS = "Landroid/view/View;"
private const val USER_PRIVILEGE_CONTENT_CLASS = "Lcom/p1/mobile/putong/core/data/UserPrivilegeContent;"
private const val AI_CHAT_ADVICE_CONVS_CLASS = "Lcom/p1/mobile/putong/core/data/AiChatAdviceConvs;"

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

        resolver.getMiscClass("aiChatGuideVm")?.let { classDef ->
            val mutable = mutableClassDefBy(classDef)
            val adviceShow = mutable.methods.filter { m ->
                m.returnType == "Z" && m.parameterTypes.isEmpty() &&
                    m.containsExactString("aiChatAdvice") &&
                    m.sharedCachedInstructions().any { instr ->
                        instr is ReferenceInstruction && (instr.reference as? FieldReference)?.let {
                            it.definingClass == AI_CHAT_ADVICE_CONVS_CLASS && it.name == "adviceConvList"
                        } == true
                    }
            }
            check(adviceShow.size == 1) { "aiChatAdvice w2 cardinality ${adviceShow.size}" }
            adviceShow.forEach { m ->
                m.preflightSmali(RETURN_TRUE, 2)
                m.addInstructions(0, RETURN_TRUE)
            }
            val methodMap = classDef.methods.zip(mutable.methods).toMap()
            var edited = 0
            classDef.methods.forEach { method ->
                if (method.returnType != "V" || !method.containsExactString("aiChatAnalysis")) return@forEach
                val mutableMethod = methodMap[method] ?: return@forEach
                edited += openRemainingCountGates(method.sharedCachedInstructions(), mutableMethod)
            }
            check(edited == 1) { "aiChatAnalysis z2 count-gate edits: $edited" }
        }

        resolver.getMiscClass("aiChatGuideListener")?.let { classDef ->
            val mutable = mutableClassDefBy(classDef)
            val methodMap = classDef.methods.zip(mutable.methods).toMap()
            var edited = 0
            classDef.methods.forEach { method ->
                if (method.name != "onClick" || method.returnType != "V" ||
                    method.parameterTypes != listOf(VIEW_CLASS)) return@forEach
                val mutableMethod = methodMap[method] ?: return@forEach
                edited += openRemainingCountGates(method.sharedCachedInstructions(), mutableMethod)
            }
            check(edited == 2) { "aiChatGuideListener onClick count-gate edits: $edited" }
        }

        // 7e. AI chat companion remaining-count gate (j4e.o). Skip the remaining<=0 check so
        // the AI companion is always available. Anchored on UserPrivilegeContent.remaining +
        // if-lez; replacing if-lez with nop makes execution always fall through to the continue
        // point (the goto at the next instruction).
        classDefByOrNull("Ll/j4e;")?.let { classDef ->
            val mutable = mutableClassDefBy(classDef)
            val methodMap = classDef.methods.zip(mutable.methods).toMap()
            classDef.methods
                .filter { method ->
                    method.name == "o" &&
                        method.parameterTypes.size == 2 &&
                        method.parameterTypes[0] == "Lcom/p1/mobile/putong/core/data/Message;" &&
                        method.parameterTypes[1] == "Lcom/p1/mobile/putong/core/data/Sticker;" &&
                        method.returnType == "V" &&
                        method.containsExactString("aiChatCompanion")
                }
                .forEach { method ->
                    val mutableMethod = methodMap[method] ?: return@forEach
                    val instructions = method.implementation?.instructions?.toList() ?: return@forEach
                    val remainingIdx = instructions.indexOfFirst { instr ->
                        instr.opcode == Opcode.IGET && instr is ReferenceInstruction &&
                            (instr.reference as? FieldReference)?.let {
                                it.definingClass == "Lcom/p1/mobile/putong/core/data/UserPrivilegeContent;" &&
                                it.name == "remaining"
                            } == true
                    }
                    if (remainingIdx < 0) return@forEach
                    val ifLezIdx = (remainingIdx + 1 until instructions.size).firstOrNull { i ->
                        instructions[i].opcode == Opcode.IF_LEZ
                    } ?: return@forEach
                    mutableMethod.replaceInstruction(ifLezIdx, InlineSmaliCompiler.Companion.compile(
                        "nop",
                        method.parameterTypes.joinToString(""),
                        mutableMethod.implementation?.registerCount ?: 1,
                        AccessFlags.STATIC.isSet(method.accessFlags)
                    ).first())
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
