package com.p1.mobile.putong.data

import app.morphe.patcher.extensions.InstructionExtensions.addInstructions
import app.morphe.patcher.patch.bytecodePatch
import com.android.tools.smali.dexlib2.iface.instruction.ReferenceInstruction
import com.android.tools.smali.dexlib2.iface.reference.FieldReference

private const val RETURN_INTEGER_0 = """
    const/4 v0, 0x0
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    move-result-object v0
    return-object v0
"""

private const val RETURN_LONG_0 = """
    const-wide/16 v0, 0x0
    return-wide v0
"""

private const val RETURN_BOOLEAN_TRUE = """
    const/4 v0, 0x1
    return v0
"""

private fun com.android.tools.smali.dexlib2.iface.Method.accessesField(definingClass: String, fieldName: String): Boolean =
    this.implementation?.instructions?.any { instr ->
        instr is ReferenceInstruction &&
            instr.reference is FieldReference &&
            (instr.reference as FieldReference).definingClass == definingClass &&
            (instr.reference as FieldReference).name == fieldName
    } ?: false

@Suppress("unused")
@JvmField
val liveStreamingPatch = bytecodePatch(
    name = "Live Streaming Enhancement",
    description = "Live entry animation, push limit bypass, swipe card unlimited, chat rate limit removal, voice game access, all-day PK battles",
    default = true,
) {
    compatibleWith(tantanCompatibility)
    execute {
        classDefForEach { classDef ->
            when (classDef.type) {
                "Lcom/p1/mobile/putong/live/base/data/BLivePushLimit;" -> {
                    mutableClassDefBy(classDef).methods
                        .filter { method ->
                            method.returnType == "I" &&
                                method.parameterTypes.isEmpty() &&
                                method.accessesField("Lcom/p1/mobile/putong/live/base/data/BLivePushLimit;", "remaining")
                        }
                        .forEach { it.addInstructions(0, """
                            const v0, 0x7fffffff
                            return v0
                        """) }
                }

                "Lcom/p1/mobile/putong/live/base/data/BLiveSwipeCardUnlimit;" -> {
                    mutableClassDefBy(classDef).methods
                        .filter { method ->
                            method.returnType == "Ljava/lang/Integer;" &&
                                method.parameterTypes.isEmpty() &&
                                method.accessesField("Lcom/p1/mobile/putong/live/base/data/BLiveSwipeCardUnlimit;", "minGrade")
                        }
                        .forEach { it.addInstructions(0, RETURN_INTEGER_0) }
                }

                "Lcom/p1/mobile/putong/live/base/data/BLiveChatLimitation;" -> {
                    mutableClassDefBy(classDef).methods
                        .filter { method ->
                            method.returnType == "J" &&
                                method.parameterTypes.isEmpty() &&
                                (method.accessesField("Lcom/p1/mobile/putong/live/base/data/BLiveChatLimitation;", "minSendIntervalMillSeconds") ||
                                    method.accessesField("Lcom/p1/mobile/putong/live/base/data/BLiveChatLimitation;", "floodsMinSendIntervalSeconds"))
                        }
                        .forEach { it.addInstructions(0, RETURN_LONG_0) }
                }

                "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceCanJoinGame;" -> {
                    mutableClassDefBy(classDef).methods
                        .filter { method ->
                            method.returnType == "Z" &&
                                method.parameterTypes.isEmpty() &&
                                method.accessesField("Lcom/p1/mobile/putong/live/base/data/BLiveVoiceCanJoinGame;", "can")
                        }
                        .forEach { it.addInstructions(0, RETURN_BOOLEAN_TRUE) }
                }

                "Lcom/p1/mobile/putong/live/base/data/BLivePkEntranceShowLimit;" -> {
                    mutableClassDefBy(classDef).methods
                        .filter { method ->
                            method.returnType == "Z" &&
                                method.parameterTypes.isEmpty() &&
                                method.accessesField("Lcom/p1/mobile/putong/live/base/data/BLivePkEntranceShowLimit;", "allDay")
                        }
                        .forEach { it.addInstructions(0, RETURN_BOOLEAN_TRUE) }
                }
            }
        }
    }
}
