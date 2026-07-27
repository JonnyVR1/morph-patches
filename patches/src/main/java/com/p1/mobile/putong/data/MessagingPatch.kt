package com.p1.mobile.putong.data

import app.morphe.patcher.Fingerprint
import app.morphe.patcher.extensions.InstructionExtensions.addInstructions
import app.morphe.patcher.fieldAccess
import app.morphe.patcher.methodCall
import app.morphe.patcher.patch.bytecodePatch
import app.morphe.patcher.string
import com.android.tools.smali.dexlib2.AccessFlags

private const val RETURN_TRUE = """
    const/4 v0, 0x1
    return v0
"""

private const val RETURN_FALSE = """
    const/4 v0, 0x0
    return v0
"""

private const val RETURN_VOID = "return-void"

private val j15ClassFingerprint = Fingerprint(
    filters = listOf(
        fieldAccess(
            definingClass = "Lcom/p1/mobile/putong/core/data/ChatPartnerConfig;",
            name = "messageLimit",
        ),
        fieldAccess(
            definingClass = "Lcom/p1/mobile/putong/core/data/ChatPartnerConfig;",
            name = "perday",
        ),
    ),
)

private val rd6ClassFingerprint = Fingerprint(
    filters = listOf(
        fieldAccess(
            definingClass = "Lcom/p1/mobile/putong/core/data/PlatinumPinChat;",
            name = "expireTime",
        ),
        fieldAccess(
            definingClass = "Lcom/p1/mobile/putong/core/data/PlatinumPinChat;",
            name = "pin",
        ),
        methodCall(
            definingClass = "Lcom/p1/mobile/putong/core/data/Conversation;",
            name = "getLevel",
        ),
    ),
)

private val h6wClassFingerprint = Fingerprint(
    filters = listOf(
        fieldAccess(
            definingClass = "Lcom/p1/mobile/putong/core/data/LoveBuzzData;",
            name = "remainingVoiceBuzz",
        ),
        string("voiceBuzz"),
        string("videoBuzz"),
        string("memojiBuzz"),
    ),
)

private val jlm0ClassFingerprint = Fingerprint(
    filters = listOf(
        fieldAccess(
            definingClass = "Lcom/p1/mobile/putong/core/data/LoveBuzzData;",
            name = "remainingVoiceBuzz",
        ),
        methodCall(name = "getNOT_LIMIT_VALUE"),
    ),
)

private val eii0ClassFingerprint = Fingerprint(
    filters = listOf(
        fieldAccess(
            definingClass = "Lcom/p1/mobile/putong/core/data/LoveBuzzData;",
            name = "remainingTextBuzz",
        ),
        methodCall(name = "getNOT_LIMIT_VALUE"),
    ),
)

private val q1l0ClassFingerprint = Fingerprint(
    filters = listOf(
        fieldAccess(
            definingClass = "Lcom/p1/mobile/putong/core/data/LoveBuzzData;",
            name = "remainingVideoBuzz",
        ),
        methodCall(name = "getNOT_LIMIT_VALUE"),
    ),
)

private val dgyClassFingerprint = Fingerprint(
    filters = listOf(
        fieldAccess(
            definingClass = "Lcom/p1/mobile/putong/core/data/LoveBuzzData;",
            name = "remainingMemojiBuzz",
        ),
        methodCall(name = "getNOT_LIMIT_VALUE"),
    ),
)

@Suppress("unused")
@JvmField
val messagingPatch = bytecodePatch(
    name = "Messaging Enhancement",
    description = "Removes message limits, unlimited pin chat, voice/video calls, quick chat",
    default = true,
) {
    compatibleWith(tantanCompatibility)
    execute {
        j15ClassFingerprint.matchOrNull()?.classDef?.let { j15ClassDef ->
            mutableClassDefBy(j15ClassDef).methods
                .filter { method ->
                    method.name == "g" &&
                        method.parameterTypes.size == 1 &&
                        method.parameterTypes[0] == "Lcom/p1/mobile/putong/core/data/ChatPartnerScene;" &&
                        method.returnType == "Z" &&
                        AccessFlags.PUBLIC.isSet(method.accessFlags) &&
                        AccessFlags.STATIC.isSet(method.accessFlags)
                }
                .forEach { it.addInstructions(0, RETURN_FALSE) }
        }

        rd6ClassFingerprint.matchOrNull()?.classDef?.let { rd6ClassDef ->
            mutableClassDefBy(rd6ClassDef).methods
                .filter { method ->
                    method.name == "X" &&
                        method.parameterTypes.size == 1 &&
                        method.parameterTypes[0] == "Lcom/p1/mobile/putong/core/data/Conversation;" &&
                        method.returnType == "Z"
                }
                .forEach { it.addInstructions(0, RETURN_TRUE) }
        }

        h6wClassFingerprint.matchOrNull()?.classDef?.let { h6wClassDef ->
            mutableClassDefBy(h6wClassDef).methods
                .filter { method ->
                    method.name == "a" &&
                        method.parameterTypes.size == 1 &&
                        method.parameterTypes[0] == "Ljava/lang/String;" &&
                        method.returnType == "Z"
                }
                .forEach { it.addInstructions(0, RETURN_FALSE) }
        }

        jlm0ClassFingerprint.matchOrNull()?.classDef?.let { classDef ->
            mutableClassDefBy(classDef).methods
                .filter { method ->
                    method.name == "j0" &&
                        method.parameterTypes.size == 2 &&
                        method.returnType == "V"
                }
                .forEach { it.addInstructions(0, RETURN_VOID) }
        }

        eii0ClassFingerprint.matchOrNull()?.classDef?.let { classDef ->
            mutableClassDefBy(classDef).methods
                .filter { method ->
                    method.name == "j0" &&
                        method.parameterTypes.size == 2 &&
                        method.returnType == "V"
                }
                .forEach { it.addInstructions(0, RETURN_VOID) }
        }

        q1l0ClassFingerprint.matchOrNull()?.classDef?.let { classDef ->
            mutableClassDefBy(classDef).methods
                .filter { method ->
                    method.name == "j0" &&
                        method.parameterTypes.size == 2 &&
                        method.returnType == "V"
                }
                .forEach { it.addInstructions(0, RETURN_VOID) }
        }

        dgyClassFingerprint.matchOrNull()?.classDef?.let { classDef ->
            mutableClassDefBy(classDef).methods
                .filter { method ->
                    method.name == "j0" &&
                        method.parameterTypes.size == 2 &&
                        method.returnType == "V"
                }
                .forEach { it.addInstructions(0, RETURN_VOID) }
        }
    }
}
