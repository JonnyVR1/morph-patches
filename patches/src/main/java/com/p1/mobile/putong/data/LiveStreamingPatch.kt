package com.p1.mobile.putong.data

import app.morphe.patcher.Fingerprint
import app.morphe.patcher.extensions.InstructionExtensions.addInstructions
import app.morphe.patcher.fieldAccess
import app.morphe.patcher.patch.bytecodePatch
import app.morphe.patcher.string
import com.android.tools.smali.dexlib2.AccessFlags
import com.android.tools.smali.dexlib2.iface.instruction.ReferenceInstruction
import com.android.tools.smali.dexlib2.iface.reference.FieldReference

private const val RETURN_TRUE = """
    const/4 v0, 0x1
    return v0
"""

private const val RETURN_INTEGER_0 = """
    const/4 v0, 0x0
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    move-result-object v0
    return-object v0
"""

private const val RETURN_INTEGER_MAX = """
    const v0, 0x7fffffff
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

private val livePushLimitClassFingerprint = Fingerprint(
    filters = listOf(
        fieldAccess(
            definingClass = "Lcom/p1/mobile/putong/live/base/data/BLivePushLimit;",
            name = "remaining",
        ),
        string("blivepushlimit"),
    ),
)

private val liveSwipeCardClassFingerprint = Fingerprint(
    filters = listOf(
        fieldAccess(
            definingClass = "Lcom/p1/mobile/putong/live/base/data/BLiveSwipeCardUnlimit;",
            name = "minGrade",
        ),
        string("bliveswipecardunlimit"),
    ),
)

private val liveChatLimitationClassFingerprint = Fingerprint(
    filters = listOf(
        fieldAccess(
            definingClass = "Lcom/p1/mobile/putong/live/base/data/BLiveChatLimitation;",
            name = "minSendIntervalMillSeconds",
        ),
        string("blivechatlimitation"),
    ),
)

private val liveVoiceCanJoinGameClassFingerprint = Fingerprint(
    filters = listOf(
        fieldAccess(
            definingClass = "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceCanJoinGame;",
            name = "can",
        ),
        string("blivevoicecanjoingame"),
    ),
)

private val livePkEntranceShowLimitClassFingerprint = Fingerprint(
    filters = listOf(
        fieldAccess(
            definingClass = "Lcom/p1/mobile/putong/live/base/data/BLivePkEntranceShowLimit;",
            name = "allDay",
        ),
        string("blivepkentranceshowlimit"),
    ),
)

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
        livePushLimitClassFingerprint.matchOrNull()?.classDef?.let { classDef ->
            mutableClassDefBy(classDef).methods
                .filter { method ->
                    method.accessesField("Lcom/p1/mobile/putong/live/base/data/BLivePushLimit;", "remaining") &&
                        method.returnType == "I" &&
                        method.parameterTypes.isEmpty()
                }
                .forEach { it.addInstructions(0, """
                    const v0, 0x7fffffff
                    return v0
                """) }
        }

        liveSwipeCardClassFingerprint.matchOrNull()?.classDef?.let { classDef ->
            mutableClassDefBy(classDef).methods
                .filter { method ->
                    method.accessesField("Lcom/p1/mobile/putong/live/base/data/BLiveSwipeCardUnlimit;", "minGrade") &&
                        method.returnType == "Ljava/lang/Integer;" &&
                        method.parameterTypes.isEmpty()
                }
                .forEach { it.addInstructions(0, RETURN_INTEGER_0) }
        }

        liveChatLimitationClassFingerprint.matchOrNull()?.classDef?.let { classDef ->
            mutableClassDefBy(classDef).methods
                .filter { method ->
                    (method.accessesField("Lcom/p1/mobile/putong/live/base/data/BLiveChatLimitation;", "minSendIntervalMillSeconds") ||
                        method.accessesField("Lcom/p1/mobile/putong/live/base/data/BLiveChatLimitation;", "floodsMinSendIntervalSeconds")) &&
                        method.returnType == "J" &&
                        method.parameterTypes.isEmpty()
                }
                .forEach { it.addInstructions(0, RETURN_LONG_0) }
        }

        liveVoiceCanJoinGameClassFingerprint.matchOrNull()?.classDef?.let { classDef ->
            mutableClassDefBy(classDef).methods
                .filter { method ->
                    method.accessesField("Lcom/p1/mobile/putong/live/base/data/BLiveVoiceCanJoinGame;", "can") &&
                        method.returnType == "Z" &&
                        method.parameterTypes.isEmpty()
                }
                .forEach { it.addInstructions(0, RETURN_BOOLEAN_TRUE) }
        }

        livePkEntranceShowLimitClassFingerprint.matchOrNull()?.classDef?.let { classDef ->
            mutableClassDefBy(classDef).methods
                .filter { method ->
                    method.accessesField("Lcom/p1/mobile/putong/live/base/data/BLivePkEntranceShowLimit;", "allDay") &&
                        method.returnType == "Z" &&
                        method.parameterTypes.isEmpty()
                }
                .forEach { it.addInstructions(0, RETURN_BOOLEAN_TRUE) }
        }
    }
}
