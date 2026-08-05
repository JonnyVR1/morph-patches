package com.p1.mobile.putong.data

import app.morphe.patcher.extensions.InstructionExtensions.addInstructions
import app.morphe.patcher.patch.bytecodePatch
import com.android.tools.smali.dexlib2.AccessFlags
import com.android.tools.smali.dexlib2.iface.instruction.ReferenceInstruction
import com.android.tools.smali.dexlib2.iface.instruction.Instruction
import com.android.tools.smali.dexlib2.iface.reference.FieldReference
import com.android.tools.smali.dexlib2.iface.reference.MethodReference
import com.android.tools.smali.dexlib2.iface.reference.StringReference
import java.util.concurrent.atomic.AtomicInteger

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
    const/16 v0, 0x9
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    move-result-object v0
    return-object v0
"""

private const val RETURN_INT_1440 = """
    const/16 v0, 0x5a0
    return v0
"""

private const val RETURN_INT_999 = """
    const/16 v0, 0x3e7
    return v0
"""

private const val RETURN_INT_500 = """
    const/16 v0, 0x1f4
    return v0
"""

private const val RETURN_INT_9999 = """
    const/16 v0, 0x270f
    return v0
"""

private const val FREE_GIFT_INFO_CLASS = "Lcom/p1/mobile/putong/core/data/FreeGiftInfo;"
private const val MESSAGE_CLASS = "Lcom/p1/mobile/putong/core/data/Message;"
private const val MESSAGE_SETTING_CLASS = "Lcom/p1/mobile/putong/core/data/MessageSetting;"

private const val READ_RECEIPTS_CLASS = "Lcom/p1/mobile/putong/core/ui/messages/view/IntlMessageReadReceiptsView;"
private const val AI_TRANSLATE_CLASS = "Lcom/p1/mobile/putong/core/api/CoreAITranslate;"
private const val RECALL_CONFIG_CLASS = "Lcom/p1/mobile/putong/core/data/RecallConfig;"
private const val GROUP_CREATION_LIMIT_CLASS = "Lcom/p1/mobile/putong/core/data/GroupCreationLimit;"
private const val LIVE_CHAT_LIMIT_CLASS = "Lcom/p1/mobile/putong/data/LiveChatLimit;"
private const val MESSAGE_FILTER_CONFIG_CLASS = "Lcom/p1/mobile/putong/core/data/MessageFilterConfig;"

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
    description = "Removes message limits, unlimited pin chat, voice/video calls, quick chat, typing indicator, free gifts, letter, greeting, ice breaker, read receipts, AI translation, message recall, group chat, live chat, message filter",
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
        val resolvedCount = AtomicInteger(0)
        val totalTargets = 12

        classDefForEach { classDef ->
            if (resolvedCount.get() >= totalTargets) {
                return@classDefForEach
            }

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

            var newlyResolved = 0

            if ("j15" !in resolved &&
                "Lcom/p1/mobile/putong/core/data/ChatPartnerConfig;.messageLimit" in fieldAccessFull &&
                "Lcom/p1/mobile/putong/core/data/ChatPartnerConfig;.perday" in fieldAccessFull) {
                resolved["j15"] = classDef
                newlyResolved++
            }

            if ("rd6" !in resolved &&
                "Lcom/p1/mobile/putong/core/data/PlatinumPinChat;.expireTime" in fieldAccessFull &&
                "Lcom/p1/mobile/putong/core/data/PlatinumPinChat;.pin" in fieldAccessFull &&
                "Lcom/p1/mobile/putong/core/data/Conversation;.getLevel" in methodCallFull) {
                resolved["rd6"] = classDef
                newlyResolved++
            }

            if ("h6w" !in resolved &&
                "Lcom/p1/mobile/putong/core/data/LoveBuzzData;.remainingVoiceBuzz" in fieldAccessFull &&
                "voiceBuzz" in strings &&
                "videoBuzz" in strings &&
                "memojiBuzz" in strings) {
                resolved["h6w"] = classDef
                newlyResolved++
            }

            if ("jlm0" !in resolved &&
                "Lcom/p1/mobile/putong/core/data/LoveBuzzData;.remainingVoiceBuzz" in fieldAccessFull &&
                "getNOT_LIMIT_VALUE" in methodCallNames) {
                resolved["jlm0"] = classDef
                newlyResolved++
            }

            if ("eii0" !in resolved &&
                "Lcom/p1/mobile/putong/core/data/LoveBuzzData;.remainingTextBuzz" in fieldAccessFull &&
                "getNOT_LIMIT_VALUE" in methodCallNames) {
                resolved["eii0"] = classDef
                newlyResolved++
            }

            if ("q1l0" !in resolved &&
                "Lcom/p1/mobile/putong/core/data/LoveBuzzData;.remainingVideoBuzz" in fieldAccessFull &&
                "getNOT_LIMIT_VALUE" in methodCallNames) {
                resolved["q1l0"] = classDef
                newlyResolved++
            }

            if ("dgy" !in resolved &&
                "Lcom/p1/mobile/putong/core/data/LoveBuzzData;.remainingMemojiBuzz" in fieldAccessFull &&
                "getNOT_LIMIT_VALUE" in methodCallNames) {
                resolved["dgy"] = classDef
                newlyResolved++
            }

            if ("fcz" !in resolved &&
                "Lcom/p1/mobile/putong/core/data/KeepConnection;.chatTypingOpen" in fieldAccessFull &&
                "Lcom/p1/mobile/putong/core/data/KeepConnection;.chatTypingInterval" in fieldAccessFull) {
                resolved["fcz"] = classDef
                newlyResolved++
            }

            if ("swh0" !in resolved &&
                "tantan_coin_intl_letter_confirm_dialog_shown_" in strings &&
                "Lcom/p1/mobile/putong/core/data/Privilege;.letter" in fieldAccessFull) {
                resolved["swh0"] = classDef
                newlyResolved++
            }

            if ("oxe" !in resolved &&
                "Lcom/p1/mobile/putong/core/data/MsgIcebreakConfigV2;.iceBreakLastMessageShowCountLimit" in fieldAccessFull &&
                "Lcom/p1/mobile/putong/core/newui/messages/util/ConversationCounterTypeSp;.iceBreakLastMessageShowCountLimit" in fieldAccessFull) {
                resolved["oxe"] = classDef
                newlyResolved++
            }

            if ("chatGameInfo" !in resolved &&
                "Lcom/p1/mobile/putong/core/data/ChatGameInfo;.enable" in fieldAccessFull &&
                "chatgameinfo" in strings) {
                resolved["chatGameInfo"] = classDef
                newlyResolved++
            }

            if ("jailedGroupChat" !in resolved &&
                "Lcom/p1/mobile/putong/data/JailedGroupChat;.active" in fieldAccessFull &&
                "Lcom/p1/mobile/putong/data/JailedGroupChat;.expireTime" in fieldAccessFull &&
                "m174454o" in methodCallNames) {
                resolved["jailedGroupChat"] = classDef
                newlyResolved++
            }

            if (newlyResolved > 0) {
                resolvedCount.addAndGet(newlyResolved)
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
            val mutableClass = mutableClassDefBy(classDef)
            mutableClass.methods.forEach { method ->
                when {
                    method.name == "G" &&
                        method.parameterTypes.isEmpty() &&
                        method.returnType == "Z" -> method.addInstructions(0, RETURN_TRUE)
                    method.name == "x" &&
                        method.parameterTypes.size == 1 &&
                        method.returnType == "Z" -> method.addInstructions(0, RETURN_TRUE)
                }
            }
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

        classDefByOrNull(READ_RECEIPTS_CLASS)?.let { classDef ->
            mutableClassDefBy(classDef).methods
                .filter { method ->
                    method.name == "X" &&
                        method.parameterTypes.size == 1 &&
                        method.returnType == "V" &&
                        AccessFlags.PRIVATE.isSet(method.accessFlags)
                }
                .forEach {
                    it.addInstructions(0, """
                        invoke-virtual {p0}, Lcom/p1/mobile/putong/core/ui/messages/view/IntlMessageReadReceiptsView;->Y()V
                        return-void
                    """)
                }
        }

        classDefByOrNull(AI_TRANSLATE_CLASS)?.let { classDef ->
            mutableClassDefBy(classDef).methods
                .filter { method ->
                    method.name == "p3" &&
                        method.parameterTypes.isEmpty() &&
                        method.returnType == "Z"
                }
                .forEach { it.addInstructions(0, RETURN_TRUE) }
        }

        classDefByOrNull(RECALL_CONFIG_CLASS)?.let { classDef ->
            val mutableClass = mutableClassDefBy(classDef)
            mutableClass.methods
                .filter { method ->
                    method.name !in setOf("<init>", "<clinit>", "hashCode", "equals", "clone", "toString", "nullCheck", "getClassParseName", "toJson") &&
                        method.accessesField(RECALL_CONFIG_CLASS, "enable") &&
                        method.returnType == "Z" &&
                        method.parameterTypes.isEmpty()
                }
                .forEach { it.addInstructions(0, RETURN_TRUE) }
            mutableClass.methods
                .filter { method ->
                    method.name !in setOf("<init>", "<clinit>", "hashCode", "equals", "clone", "toString", "nullCheck", "getClassParseName", "toJson") &&
                        method.accessesField(RECALL_CONFIG_CLASS, "minutes") &&
                        method.returnType == "I" &&
                        method.parameterTypes.isEmpty()
                }
                .forEach { it.addInstructions(0, RETURN_INT_1440) }
        }

        classDefByOrNull(GROUP_CREATION_LIMIT_CLASS)?.let { classDef ->
            val mutableClass = mutableClassDefBy(classDef)
            mutableClass.methods
                .filter { method ->
                    method.name !in setOf("<init>", "<clinit>", "hashCode", "equals", "clone", "toString", "nullCheck", "getClassParseName", "toJson") &&
                        method.accessesField(GROUP_CREATION_LIMIT_CLASS, "groupRemaining") &&
                        method.returnType == "I" &&
                        method.parameterTypes.isEmpty()
                }
                .forEach { it.addInstructions(0, RETURN_INT_999) }
            mutableClass.methods
                .filter { method ->
                    method.name !in setOf("<init>", "<clinit>", "hashCode", "equals", "clone", "toString", "nullCheck", "getClassParseName", "toJson") &&
                        method.accessesField(GROUP_CREATION_LIMIT_CLASS, "memberLimit") &&
                        method.returnType == "I" &&
                        method.parameterTypes.isEmpty()
                }
                .forEach { it.addInstructions(0, RETURN_INT_500) }
        }

        classDefByOrNull(LIVE_CHAT_LIMIT_CLASS)?.let { classDef ->
            mutableClassDefBy(classDef).methods
                .filter { method ->
                    method.name !in setOf("<init>", "<clinit>", "hashCode", "equals", "clone", "toString", "nullCheck", "getClassParseName", "toJson") &&
                        method.accessesField(LIVE_CHAT_LIMIT_CLASS, "remaining") &&
                        method.returnType == "I" &&
                        method.parameterTypes.isEmpty()
                }
                .forEach { it.addInstructions(0, RETURN_INT_9999) }
        }

        classDefByOrNull(MESSAGE_FILTER_CONFIG_CLASS)?.let { classDef ->
            val mutableClass = mutableClassDefBy(classDef)
            mutableClass.methods
                .filter { method ->
                    method.name !in setOf("<init>", "<clinit>", "hashCode", "equals", "clone", "toString", "nullCheck", "getClassParseName", "toJson") &&
                        method.accessesField(MESSAGE_FILTER_CONFIG_CLASS, "convUnreadLimit") &&
                        method.returnType == "I" &&
                        method.parameterTypes.isEmpty()
                }
                .forEach { it.addInstructions(0, RETURN_INT_9999) }
            mutableClass.methods
                .filter { method ->
                    method.name !in setOf("<init>", "<clinit>", "hashCode", "equals", "clone", "toString", "nullCheck", "getClassParseName", "toJson") &&
                        method.accessesField(MESSAGE_FILTER_CONFIG_CLASS, "redDotLimit") &&
                        method.returnType == "I" &&
                        method.parameterTypes.isEmpty()
                }
                .forEach { it.addInstructions(0, RETURN_INT_9999) }
            mutableClass.methods
                .filter { method ->
                    method.name !in setOf("<init>", "<clinit>", "hashCode", "equals", "clone", "toString", "nullCheck", "getClassParseName", "toJson") &&
                        method.accessesField(MESSAGE_FILTER_CONFIG_CLASS, "shownDayLimit") &&
                        method.returnType == "I" &&
                        method.parameterTypes.isEmpty()
                }
                .forEach { it.addInstructions(0, RETURN_INT_9999) }
        }
    }
}
