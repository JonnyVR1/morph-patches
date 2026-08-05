package com.p1.mobile.putong.data

import app.morphe.patcher.Fingerprint
import app.morphe.patcher.extensions.InstructionExtensions.addInstructions
import app.morphe.patcher.fieldAccess
import app.morphe.patcher.methodCall
import app.morphe.patcher.patch.bytecodePatch
import app.morphe.patcher.string
import com.android.tools.smali.dexlib2.AccessFlags
import com.android.tools.smali.dexlib2.iface.instruction.ReferenceInstruction
import com.android.tools.smali.dexlib2.iface.instruction.Instruction
import com.android.tools.smali.dexlib2.iface.reference.FieldReference
import com.android.tools.smali.dexlib2.iface.reference.MethodReference
import com.android.tools.smali.dexlib2.iface.reference.StringReference

private const val RETURN_TRUE = """
    const/4 v0, 0x1
    return v0
"""

private const val RETURN_FALSE = """
    const/4 v0, 0x0
    return v0
"""

private const val RETURN_VOID = "return-void"

private const val RETURN_INTEGER_9 = """
    const/4 v0, 0x9
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    move-result-object v0
    return-object v0
"""

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

private val fczClassFingerprint = Fingerprint(
    filters = listOf(
        fieldAccess(
            definingClass = "Lcom/p1/mobile/putong/core/data/KeepConnection;",
            name = "chatTypingOpen",
        ),
        fieldAccess(
            definingClass = "Lcom/p1/mobile/putong/core/data/KeepConnection;",
            name = "chatTypingInterval",
        ),
    ),
)

private val swh0ClassFingerprint = Fingerprint(
    filters = listOf(
        string("tantan_coin_intl_letter_confirm_dialog_shown_"),
        fieldAccess(
            definingClass = "Lcom/p1/mobile/putong/core/data/Privilege;",
            name = "letter",
        ),
    ),
)

private val oxeClassFingerprint = Fingerprint(
    filters = listOf(
        fieldAccess(
            definingClass = "Lcom/p1/mobile/putong/core/data/MsgIcebreakConfigV2;",
            name = "iceBreakLastMessageShowCountLimit",
        ),
        fieldAccess(
            definingClass = "Lcom/p1/mobile/putong/core/newui/messages/util/ConversationCounterTypeSp;",
            name = "iceBreakLastMessageShowCountLimit",
        ),
    ),
)

private const val FREE_GIFT_INFO_CLASS = "Lcom/p1/mobile/putong/core/data/FreeGiftInfo;"

private const val MESSAGE_CLASS = "Lcom/p1/mobile/putong/core/data/Message;"
private const val MESSAGE_SETTING_CLASS = "Lcom/p1/mobile/putong/core/data/MessageSetting;"

private val chatGameInfoClassFingerprint = Fingerprint(
    filters = listOf(
        fieldAccess(
            definingClass = "Lcom/p1/mobile/putong/core/data/ChatGameInfo;",
            name = "enable",
        ),
        string("chatgameinfo"),
    ),
)

private val jailedGroupChatClassFingerprint = Fingerprint(
    filters = listOf(
        fieldAccess(
            definingClass = "Lcom/p1/mobile/putong/data/JailedGroupChat;",
            name = "active",
        ),
        fieldAccess(
            definingClass = "Lcom/p1/mobile/putong/data/JailedGroupChat;",
            name = "expireTime",
        ),
        methodCall(name = "m174454o"),
    ),
)

private val instructionCache = java.util.WeakHashMap<com.android.tools.smali.dexlib2.iface.Method, List<Instruction>>()

private fun com.android.tools.smali.dexlib2.iface.Method.cachedInstructions(): List<Instruction> =
    instructionCache.getOrPut(this) {
        implementation?.instructions?.toList() ?: emptyList()
    }

private fun com.android.tools.smali.dexlib2.iface.Method.accessesField(definingClass: String, fieldName: String): Boolean =
    cachedInstructions().any { instr ->
        instr is ReferenceInstruction &&
            instr.reference is FieldReference &&
            (instr.reference as FieldReference).definingClass == definingClass &&
            (instr.reference as FieldReference).name == fieldName
    }

@Suppress("unused")
@JvmField
val messagingPatch = bytecodePatch(
    name = "Messaging Enhancement",
    description = "Removes message limits, unlimited pin chat, voice/video calls, quick chat, typing indicator, free gifts, letter, greeting, ice breaker",
    default = true,
) {
    compatibleWith(tantanCompatibility)
    execute {
        classDefByOrNull(FREE_GIFT_INFO_CLASS)?.let { classDef ->
            mutableClassDefBy(classDef).methods
                .filter { method ->
                    (method.name == "hasRemaining" || method.name == "inDuration") &&
                        method.parameterTypes.isEmpty() &&
                        method.returnType == "Z"
                }
                .forEach { it.addInstructions(0, RETURN_TRUE) }
        }

        classDefByOrNull(MESSAGE_CLASS)?.let { classDef ->
            mutableClassDefBy(classDef).methods
                .filter { method ->
                    method.accessesField(MESSAGE_SETTING_CLASS, "anonymous") &&
                        (method.returnType == "Ljava/lang/Boolean;" || method.returnType == "Z") &&
                        method.parameterTypes.isEmpty()
                }
                .forEach { it.addInstructions(0, RETURN_TRUE) }
        }

        val resolved = mutableMapOf<String, com.android.tools.smali.dexlib2.iface.ClassDef>()

        classDefForEach { classDef ->
            val strings = mutableSetOf<String>()
            val fieldAccessFull = mutableSetOf<String>()
            val methodCallFull = mutableSetOf<String>()
            val methodCallNames = mutableSetOf<String>()

            classDef.methods.forEach { method ->
                method.cachedInstructions().forEach { instr ->
                    if (instr is ReferenceInstruction) {
                        when (val ref = instr.reference) {
                            is StringReference -> strings.add(ref.string)
                            is MethodReference -> {
                                methodCallNames.add(ref.name)
                                methodCallFull.add("${ref.definingClass}.${ref.name}")
                            }
                            is FieldReference -> {
                                fieldAccessFull.add("${ref.definingClass}.${ref.name}")
                            }
                        }
                    }
                }
            }

            if ("j15" !in resolved &&
                "Lcom/p1/mobile/putong/core/data/ChatPartnerConfig;.messageLimit" in fieldAccessFull &&
                "Lcom/p1/mobile/putong/core/data/ChatPartnerConfig;.perday" in fieldAccessFull) {
                resolved["j15"] = classDef
            }

            if ("rd6" !in resolved &&
                "Lcom/p1/mobile/putong/core/data/PlatinumPinChat;.expireTime" in fieldAccessFull &&
                "Lcom/p1/mobile/putong/core/data/PlatinumPinChat;.pin" in fieldAccessFull &&
                "Lcom/p1/mobile/putong/core/data/Conversation;.getLevel" in methodCallFull) {
                resolved["rd6"] = classDef
            }

            if ("h6w" !in resolved &&
                "Lcom/p1/mobile/putong/core/data/LoveBuzzData;.remainingVoiceBuzz" in fieldAccessFull &&
                "voiceBuzz" in strings &&
                "videoBuzz" in strings &&
                "memojiBuzz" in strings) {
                resolved["h6w"] = classDef
            }

            if ("jlm0" !in resolved &&
                "Lcom/p1/mobile/putong/core/data/LoveBuzzData;.remainingVoiceBuzz" in fieldAccessFull &&
                "getNOT_LIMIT_VALUE" in methodCallNames) {
                resolved["jlm0"] = classDef
            }

            if ("eii0" !in resolved &&
                "Lcom/p1/mobile/putong/core/data/LoveBuzzData;.remainingTextBuzz" in fieldAccessFull &&
                "getNOT_LIMIT_VALUE" in methodCallNames) {
                resolved["eii0"] = classDef
            }

            if ("q1l0" !in resolved &&
                "Lcom/p1/mobile/putong/core/data/LoveBuzzData;.remainingVideoBuzz" in fieldAccessFull &&
                "getNOT_LIMIT_VALUE" in methodCallNames) {
                resolved["q1l0"] = classDef
            }

            if ("dgy" !in resolved &&
                "Lcom/p1/mobile/putong/core/data/LoveBuzzData;.remainingMemojiBuzz" in fieldAccessFull &&
                "getNOT_LIMIT_VALUE" in methodCallNames) {
                resolved["dgy"] = classDef
            }

            if ("fcz" !in resolved &&
                "Lcom/p1/mobile/putong/core/data/KeepConnection;.chatTypingOpen" in fieldAccessFull &&
                "Lcom/p1/mobile/putong/core/data/KeepConnection;.chatTypingInterval" in fieldAccessFull) {
                resolved["fcz"] = classDef
            }

            if ("swh0" !in resolved &&
                "tantan_coin_intl_letter_confirm_dialog_shown_" in strings &&
                "Lcom/p1/mobile/putong/core/data/Privilege;.letter" in fieldAccessFull) {
                resolved["swh0"] = classDef
            }

            if ("oxe" !in resolved &&
                "Lcom/p1/mobile/putong/core/data/MsgIcebreakConfigV2;.iceBreakLastMessageShowCountLimit" in fieldAccessFull &&
                "Lcom/p1/mobile/putong/core/newui/messages/util/ConversationCounterTypeSp;.iceBreakLastMessageShowCountLimit" in fieldAccessFull) {
                resolved["oxe"] = classDef
            }

            if ("chatGameInfo" !in resolved &&
                "Lcom/p1/mobile/putong/core/data/ChatGameInfo;.enable" in fieldAccessFull &&
                "chatgameinfo" in strings) {
                resolved["chatGameInfo"] = classDef
            }

            if ("jailedGroupChat" !in resolved &&
                "Lcom/p1/mobile/putong/data/JailedGroupChat;.active" in fieldAccessFull &&
                "Lcom/p1/mobile/putong/data/JailedGroupChat;.expireTime" in fieldAccessFull &&
                "m174454o" in methodCallNames) {
                resolved["jailedGroupChat"] = classDef
            }
        }

        resolved["j15"]?.let { classDef ->
            mutableClassDefBy(classDef).methods
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

        resolved["rd6"]?.let { classDef ->
            mutableClassDefBy(classDef).methods
                .filter { method ->
                    method.name == "X" &&
                        method.parameterTypes.size == 1 &&
                        method.parameterTypes[0] == "Lcom/p1/mobile/putong/core/data/Conversation;" &&
                        method.returnType == "Z"
                }
                .forEach { it.addInstructions(0, RETURN_TRUE) }
        }

        resolved["h6w"]?.let { classDef ->
            mutableClassDefBy(classDef).methods
                .filter { method ->
                    method.name == "a" &&
                        method.parameterTypes.size == 1 &&
                        method.parameterTypes[0] == "Ljava/lang/String;" &&
                        method.returnType == "Z"
                }
                .forEach { it.addInstructions(0, RETURN_FALSE) }
        }

        resolved["jlm0"]?.let { classDef ->
            mutableClassDefBy(classDef).methods
                .filter { method ->
                    method.name == "j0" &&
                        method.parameterTypes.size == 2 &&
                        method.returnType == "V"
                }
                .forEach { it.addInstructions(0, RETURN_VOID) }
        }

        resolved["eii0"]?.let { classDef ->
            mutableClassDefBy(classDef).methods
                .filter { method ->
                    method.name == "j0" &&
                        method.parameterTypes.size == 2 &&
                        method.returnType == "V"
                }
                .forEach { it.addInstructions(0, RETURN_VOID) }
        }

        resolved["q1l0"]?.let { classDef ->
            mutableClassDefBy(classDef).methods
                .filter { method ->
                    method.name == "j0" &&
                        method.parameterTypes.size == 2 &&
                        method.returnType == "V"
                }
                .forEach { it.addInstructions(0, RETURN_VOID) }
        }

        resolved["dgy"]?.let { classDef ->
            mutableClassDefBy(classDef).methods
                .filter { method ->
                    method.name == "j0" &&
                        method.parameterTypes.size == 2 &&
                        method.returnType == "V"
                }
                .forEach { it.addInstructions(0, RETURN_VOID) }
        }

        resolved["fcz"]?.let { classDef ->
            mutableClassDefBy(classDef).methods
                .filter { method ->
                    method.name == "X2" &&
                        method.parameterTypes.isEmpty() &&
                        method.returnType == "V"
                }
                .forEach { it.addInstructions(0, RETURN_VOID) }
        }

        resolved["swh0"]?.let { classDef ->
            mutableClassDefBy(classDef).methods
                .filter { method ->
                    method.name == "G" &&
                        method.parameterTypes.isEmpty() &&
                        method.returnType == "Z"
                }
                .forEach { it.addInstructions(0, RETURN_TRUE) }

            mutableClassDefBy(classDef).methods
                .filter { method ->
                    method.name == "x" &&
                        method.parameterTypes.size == 1 &&
                        method.returnType == "Z"
                }
                .forEach { it.addInstructions(0, RETURN_TRUE) }
        }

        resolved["oxe"]?.let { classDef ->
            mutableClassDefBy(classDef).methods
                .filter { method ->
                    method.name == "g" &&
                        method.parameterTypes.size == 1 &&
                        method.returnType == "Ljava/lang/Integer;"
                }
                .forEach { it.addInstructions(0, RETURN_INTEGER_9) }
        }

        resolved["chatGameInfo"]?.let { classDef ->
            mutableClassDefBy(classDef).methods
                .filter { method ->
                    method.accessesField("Lcom/p1/mobile/putong/core/data/ChatGameInfo;", "enable") &&
                        method.returnType == "Z" &&
                        method.parameterTypes.isEmpty()
                }
                .forEach { it.addInstructions(0, RETURN_TRUE) }
        }

        resolved["jailedGroupChat"]?.let { classDef ->
            mutableClassDefBy(classDef).methods
                .filter { method ->
                    method.accessesField("Lcom/p1/mobile/putong/data/JailedGroupChat;", "active") &&
                        method.accessesField("Lcom/p1/mobile/putong/data/JailedGroupChat;", "expireTime") &&
                        method.returnType == "V"
                }
                .forEach { it.addInstructions(0, RETURN_VOID) }
        }
    }
}
