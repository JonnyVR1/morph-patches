package com.p1.mobile.putong.data

import app.morphe.patcher.extensions.InstructionExtensions.addInstructions
import app.morphe.patcher.patch.bytecodePatch
import com.android.tools.smali.dexlib2.iface.instruction.FiveRegisterInstruction
import com.android.tools.smali.dexlib2.iface.instruction.ReferenceInstruction
import com.android.tools.smali.dexlib2.iface.instruction.RegisterRangeInstruction
import com.android.tools.smali.dexlib2.iface.instruction.formats.Instruction21c
import com.android.tools.smali.dexlib2.iface.reference.MethodReference
import com.android.tools.smali.dexlib2.iface.reference.StringReference

private const val ORIGINAL_PACKAGE = "com.tantantribe.tribe"
private const val ORIGINAL_SHA1 = "715BAB0F363395FE34D187684B0EF771A9D400F0"

private const val TAG = "MapsAuthHeaders"

private fun extractValueRegister(instruction: com.android.tools.smali.dexlib2.iface.instruction.Instruction, headerReg: Int): Int? {
    if ((instruction as? ReferenceInstruction)?.reference !is MethodReference) return null
    return when (instruction) {
        is FiveRegisterInstruction -> {
            if (instruction.registerCount < 3) return null
            val regs = listOf(instruction.registerC, instruction.registerD, instruction.registerE, instruction.registerF, instruction.registerG)
                .take(instruction.registerCount)
            val headerIdx = regs.indexOf(headerReg)
            if (headerIdx < 0 || headerIdx >= regs.size - 1) null
            else regs[headerIdx + 1]
        }
        is RegisterRangeInstruction -> {
            if (instruction.registerCount < 3) return null
            val offset = headerReg - instruction.startRegister
            if (offset < 0 || offset >= instruction.registerCount - 1) null
            else instruction.startRegister + offset + 1
        }
        else -> null
    }
}

@Suppress("unused")
@JvmField
val mapsAuthHeadersPatch = bytecodePatch(
    name = "Maps Auth Headers",
    description = "Replaces Google Maps/Places API X-Android-Cert and X-Android-Package headers with original Tantan values",
    default = true,
) {
    compatibleWith(tantanCompatibility)

    execute {
        println("[$TAG] Scanning for X-Android-Cert/X-Android-Package header setters...")

        var totalInjections = 0

        classDefForEach { classDef ->
            val hasMethods = classDef.methods.any { it.implementation != null }
            if (!hasMethods) return@classDefForEach

            val containsTargetStrings = classDef.methods.any { method ->
                method.implementation?.instructions?.any { instruction ->
                    val ref = (instruction as? Instruction21c)?.reference as? StringReference ?: return@any false
                    ref.string == "X-Android-Cert" || ref.string == "X-Android-Package"
                } == true
            }

            if (!containsTargetStrings) return@classDefForEach

            println("[$TAG] Found header setter in: ${classDef.type}")

            val mutableClass = mutableClassDefBy(classDef)

            classDef.methods.forEach { method ->
                val implementation = method.implementation ?: return@forEach
                val mutableMethod = mutableClass.methods.firstOrNull {
                    it.name == method.name && it.parameterTypes == method.parameterTypes
                } ?: return@forEach

                data class Injection(val index: Int, val registerName: String, val value: String)
                val injections = mutableListOf<Injection>()

                val instructions = implementation.instructions.toList()

                instructions.forEachIndexed { index, instruction ->
                    val strRef = (instruction as? Instruction21c)?.reference as? StringReference ?: return@forEachIndexed
                    val replacementValue = when (strRef.string) {
                        "X-Android-Cert" -> ORIGINAL_SHA1
                        "X-Android-Package" -> ORIGINAL_PACKAGE
                        else -> return@forEachIndexed
                    }
                    val headerReg = instruction.registerA

                    for (j in index + 1 until minOf(index + 30, instructions.size)) {
                        val candidate = instructions[j]
                        val valueRegNum = extractValueRegister(candidate, headerReg) ?: continue
                        injections.add(Injection(j, "v$valueRegNum", replacementValue))
                        break
                    }
                }

                injections.sortedByDescending { it.index }.forEach { injection ->
                    mutableMethod.addInstructions(injection.index, "const-string ${injection.registerName}, \"${injection.value}\"")
                    totalInjections++
                    println("[$TAG] ${classDef.type}->${method.name}@${injection.index}: ${injection.registerName} = ${injection.value}")
                }
            }
        }

        println("[$TAG] Total header value injections: $totalInjections")
    }
}
