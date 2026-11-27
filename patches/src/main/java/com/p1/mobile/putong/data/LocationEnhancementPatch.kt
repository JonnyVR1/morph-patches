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

        // 5a. Location-upload 500m gate: the distance check `location/a.b(lat1,lat2,lon1,lon2)
        // < 500.0` skips uploads for small moves. In 7.5.6.1 the gate lives in a synthetic lambda
        // dispatcher (a33.call), not the old core/api/c.p3 — the resolver collects candidate
        // classes calling into location/a AND carrying the 500.0 literal. Replace the const-wide
        // 500.0 with 1.0 in place (same 51l format, zero register/branch risk; only the location
        // branch of the dispatcher is affected).
        resolver.getLocationUploadGateCandidates().forEach { classDef ->
            val mutable = mutableClassDefBy(classDef)
            val methodMap = classDef.methods.zip(mutable.methods).toMap()
            classDef.methods.forEach { method ->
                val instrs = method.sharedCachedInstructions()
                val callsDistance = instrs.any { instr ->
                    instr is ReferenceInstruction &&
                        (instr.reference as? MethodReference)?.let {
                            it.definingClass == LOCATION_CLASS && it.returnType == "D" &&
                                it.parameterTypes.isNotEmpty() && it.parameterTypes.all { p -> p == "D" }
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

        // 5b. GPS re-fetch throttle (7.5.6.1 location/a.h(J)V): `if (this.b + j < now) i(false)`.
        // The Z param was removed (was v(J,Z)V); replace the body with an unconditional i(false).
        // The (Z)V target name is derived from the original invoke (version-agnostic). h(J)V has
        // regs=5: this=rc-3=v2, J=v3/v4, free scratch v0/v1. Shuttle this with /from16 (gotcha #9).
        classDefByOrNull(LOCATION_CLASS)?.let { classDef ->
            val mutable = mutableClassDefBy(classDef)
            val methodMap = classDef.methods.zip(mutable.methods).toMap()
            classDef.methods.forEach { method ->
                if (method.parameterTypes != listOf("J") || method.returnType != "V") return@forEach
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
                // (J) instance layout: this(1)+J(2)=3 param words -> this=rc-3. Require rc>=4 so
                // scratch v0/v1 stay below the param block.
                val registerCount = mutableMethod.implementation?.registerCount ?: 0
                if (registerCount < 4) return@forEach
                val thisReg = registerCount - 3
                if (thisReg > 15) return@forEach
                val smali = """
                    move-object/from16 v0, v$thisReg
                    const/4 v1, 0x0
                    invoke-virtual {v0, v1}, $LOCATION_CLASS->${target.name}(Z)V
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
