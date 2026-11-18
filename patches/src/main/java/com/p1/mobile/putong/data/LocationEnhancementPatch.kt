package com.p1.mobile.putong.data

import app.morphe.patcher.extensions.InstructionExtensions.addInstructions
import app.morphe.patcher.extensions.InstructionExtensions.replaceInstruction
import app.morphe.patcher.patch.bytecodePatch
import com.android.tools.smali.dexlib2.AccessFlags
import com.android.tools.smali.dexlib2.Opcode
import com.android.tools.smali.dexlib2.builder.instruction.BuilderInstruction11n
import com.android.tools.smali.dexlib2.builder.instruction.BuilderInstruction51l
import com.android.tools.smali.dexlib2.iface.instruction.OneRegisterInstruction
import com.android.tools.smali.dexlib2.iface.instruction.ReferenceInstruction
import com.android.tools.smali.dexlib2.iface.instruction.WideLiteralInstruction
import com.android.tools.smali.dexlib2.iface.reference.MethodReference

private const val LOCATION_CLASS = "Lcom/p1/mobile/putong/location/a;"
private const val CORE_API_CLASS = "Lcom/p1/mobile/putong/core/api/c;"
private const val LOCATION_PARAM = "Lcom/p1/mobile/putong/location/Location;"

private const val DISTANCE_500_BITS = 0x407f400000000000L
private const val DISTANCE_1_BITS = 0x3ff0000000000000L

@Suppress("unused")
@JvmField
val locationEnhancementPatch = bytecodePatch(
    name = "Location Enhancement",
    description = "Improves location handling for roaming/fake-GPS: lowers the location-upload distance gate from 500m to 1m, removes the GPS re-fetch throttle so moves apply on the next deck reload, and zeroes the mock-location flag in the momosec payload",
    default = true,
) {
    compatibleWith(tantanCompatibility)
    execute {
        val resolver = getSharedResolver()

        // 5a. Location-upload 500m gate (core/api/c.p3): the distance check
        // a.f(DDDDDD)D < 500.0 skips uploads for small moves. Replace the const-wide 500.0
        // literal with 1.0 in place (same 51l format, zero register/branch risk).
        classDefByOrNull(CORE_API_CLASS)?.let { classDef ->
            val mutable = mutableClassDefBy(classDef)
            val methodMap = classDef.methods.zip(mutable.methods).toMap()
            classDef.methods.forEach { method ->
                if (method.parameterTypes != listOf(LOCATION_PARAM) || method.returnType != "V") return@forEach
                val instrs = method.sharedCachedInstructions()
                val callsDistance = instrs.any { instr ->
                    instr is ReferenceInstruction &&
                        (instr.reference as? MethodReference)?.let {
                            it.definingClass == LOCATION_CLASS &&
                                it.parameterTypes == listOf("D", "D", "D", "D", "D", "D") && it.returnType == "D"
                        } == true
                }
                if (!callsDistance) return@forEach
                val mutableMethod = methodMap[method] ?: return@forEach
                instrs.forEachIndexed { i, cur ->
                    if (cur.opcode == Opcode.CONST_WIDE && cur is WideLiteralInstruction && cur.wideLiteral == DISTANCE_500_BITS) {
                        val reg = (cur as OneRegisterInstruction).registerA
                        mutableMethod.replaceInstruction(i, BuilderInstruction51l(Opcode.CONST_WIDE, reg, DISTANCE_1_BITS))
                    }
                }
            }
        }

        // 5b. GPS re-fetch throttle (location/a.v(JZ)V): `if (this.i + j < now) w(z)`.
        // Replace the body with an unconditional w(z) call. The (Z)V target name is derived
        // from the original invoke (version-agnostic). v(JZ)V has regs=6 in 7.5.4: p0=this=v2,
        // J=p1=v3/v4, Z=p2=v5, free scratch v0/v1. Shuttle high params with /from16 (gotcha #9).
        classDefByOrNull(LOCATION_CLASS)?.let { classDef ->
            val mutable = mutableClassDefBy(classDef)
            val methodMap = classDef.methods.zip(mutable.methods).toMap()
            classDef.methods.forEach { method ->
                if (method.parameterTypes != listOf("J", "Z") || method.returnType != "V") return@forEach
                val instrs = method.sharedCachedInstructions()
                val callsClock = instrs.any { instr ->
                    instr is ReferenceInstruction &&
                        (instr.reference as? MethodReference)?.let {
                            it.definingClass == "Ljava/lang/System;" && it.name == "currentTimeMillis"
                        } == true
                }
                if (!callsClock) return@forEach
                val target = instrs.asSequence()
                    .filterIsInstance<ReferenceInstruction>()
                    .map { it.reference }
                    .filterIsInstance<MethodReference>()
                    .firstOrNull {
                        it.definingClass == LOCATION_CLASS && it.parameterTypes == listOf("Z") && it.returnType == "V"
                    } ?: return@forEach
                val mutableMethod = methodMap[method] ?: return@forEach
                // InlineSmaliCompiler's pN aliases mis-count wide params (p2 resolved to the
                // high word of J, not Z), so compute absolute registers from registerCount.
                // (J,Z) instance layout: this(1)+J(2)+Z(1)=4 param words → this=rc-4, Z=rc-1.
                // Require rc>=6 so scratch v0/v1 stay below the param block.
                val registerCount = mutableMethod.implementation?.registerCount ?: 0
                if (registerCount < 6) return@forEach
                val thisReg = registerCount - 4
                val zReg = registerCount - 1
                val smali = """
                    move/from16 v0, v$zReg
                    move-object/from16 v1, v$thisReg
                    invoke-virtual {v1, v0}, $LOCATION_CLASS->${target.name}(Z)V
                    return-void
                """.trimIndent()
                mutableMethod.preflightSmali(smali, 4)
                mutableMethod.addInstructions(0, smali)
            }
        }

        // 5c. Mock-location flag zero in momosec payload (POLICY EXCEPTION — user approved).
        // nr5.c()V is the UNIQUE caller of Location.isFromMockProvider()Z. The ternary
        // `isFromMockProvider() ? 1 : 0` compiles to a boolean→int passthrough:
        //   invoke-virtual isFromMockProvider; move-result vY; JSONObject.put(String,I)
        // Replace the 1-unit move-result with const/4 vY,0 (same unit count, no offset shift).
        // The side-effect-free invoke is kept. momosec otherwise remains KEPT; the server can
        // still infer mocking from other signals.
        resolver.getMiscClass("mockLocationFlag")?.let { classDef ->
            val mutable = mutableClassDefBy(classDef)
            val methodMap = classDef.methods.zip(mutable.methods).toMap()
            classDef.methods.forEach { method ->
                val instrs = method.sharedCachedInstructions()
                val idx = instrs.indexOfFirst { instr ->
                    instr is ReferenceInstruction &&
                        (instr.reference as? MethodReference)?.let {
                            it.definingClass == "Landroid/location/Location;" && it.name == "isFromMockProvider"
                        } == true
                }
                if (idx < 0 || idx + 1 >= instrs.size) return@forEach
                val next = instrs[idx + 1]
                if (next.opcode != Opcode.MOVE_RESULT || next !is OneRegisterInstruction) return@forEach
                val reg = next.registerA
                if (reg > 15) return@forEach
                val mutableMethod = methodMap[method] ?: return@forEach
                mutableMethod.replaceInstruction(idx + 1, BuilderInstruction11n(Opcode.CONST_4, reg, 0))
            }
        }
    }
}
