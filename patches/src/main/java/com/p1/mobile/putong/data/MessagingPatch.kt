package com.p1.mobile.putong.data

import app.morphe.patcher.Fingerprint
import app.morphe.patcher.extensions.InstructionExtensions.addInstructions
import app.morphe.patcher.extensions.InstructionExtensions.replaceInstruction
import app.morphe.patcher.fieldAccess
import app.morphe.patcher.methodCall
import app.morphe.patcher.patch.bytecodePatch
import app.morphe.patcher.string
import com.android.tools.smali.dexlib2.AccessFlags
import com.android.tools.smali.dexlib2.Opcode
import com.android.tools.smali.dexlib2.builder.instruction.BuilderInstruction11n
import com.android.tools.smali.dexlib2.builder.instruction.BuilderInstruction51l
import com.android.tools.smali.dexlib2.iface.instruction.ReferenceInstruction
import com.android.tools.smali.dexlib2.iface.instruction.Instruction
import com.android.tools.smali.dexlib2.iface.instruction.OneRegisterInstruction
import com.android.tools.smali.dexlib2.iface.instruction.WideLiteralInstruction
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

private const val RETURN_INT_5 = """
    const/4 v0, 0x5
    return v0
"""

private const val RETURN_INT_10 = """
    const/16 v0, 0xa
    return v0
"""

private const val RETURN_LONG_MAX = """
    const-wide v0, 0x7fffffffffffffffL
    return-wide v0
"""

private const val RETURN_DOUBLE_MAX = """
    const-wide v0, 0x7fefffffffffffffL
    return-wide v0
"""

private val FAKE_CONV_UPSERT_GUARD = """
    iget-object v0, v2, Lcom/p1/mobile/putong/core/data/Conversation;->convType:Ljava/lang/String;
    if-eqz v0, :morph_g1_orig
    const-string v1, "fakeReceiveLikeGuideSVip"
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    move-result v1
    if-nez v1, :morph_g1_ret
    const-string v1, "fakeIntlReceiveLikeGuideSVip"
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    move-result v1
    if-eqz v1, :morph_g1_orig
    :morph_g1_ret
    return-void
    :morph_g1_orig
"""

private val EXCLUDED_METHODS = setOf(
    "<init>", "<clinit>", "hashCode", "equals", "clone",
    "toString", "nullCheck", "getClassParseName", "toJson"
)

private val EXCLUDED_METHODS_EXTENDED = EXCLUDED_METHODS + "mo225055clone"

private const val FREE_GIFT_INFO_CLASS = "Lcom/p1/mobile/putong/core/data/FreeGiftInfo;"
private const val MESSAGE_CLASS = "Lcom/p1/mobile/putong/core/data/Message;"
private const val MESSAGE_SETTING_CLASS = "Lcom/p1/mobile/putong/core/data/MessageSetting;"

private const val READ_RECEIPTS_CLASS = "Lcom/p1/mobile/putong/core/ui/messages/view/IntlMessageReadReceiptsView;"
private const val AI_TRANSLATE_CLASS = "Lcom/p1/mobile/putong/core/api/CoreAITranslate;"
private const val RECALL_CONFIG_CLASS = "Lcom/p1/mobile/putong/core/data/RecallConfig;"
private const val GROUP_CREATION_LIMIT_CLASS = "Lcom/p1/mobile/putong/core/data/GroupCreationLimit;"
private const val LIVE_CHAT_LIMIT_CLASS = "Lcom/p1/mobile/putong/data/LiveChatLimit;"
private const val MESSAGE_FILTER_CONFIG_CLASS = "Lcom/p1/mobile/putong/core/data/MessageFilterConfig;"
private const val MSG_ICEBREAK_CONFIG_CLASS = "Lcom/p1/mobile/putong/core/data/MsgIcebreakConfig;"
private const val MSG_ICEBREAK_CONFIG_V2_CLASS = "Lcom/p1/mobile/putong/core/data/MsgIcebreakConfigV2;"
private const val GREETING_PERMISSION_CLASS = "Lcom/p1/mobile/putong/core/data/GreetingPermission;"
private const val GREETING_PERMISSION_FEED_CLASS = "Lcom/p1/mobile/putong/feed/data/GreetingPermission;"
private const val CHAT_ROUNDS_CONFIG_CLASS = "Lcom/p1/mobile/putong/core/data/ChatRoundsDisplayedExternallyConfig;"
private const val QUICK_CHAT_LOFT_CONFIG_CLASS = "Lcom/p1/mobile/putong/core/data/QuickChatLoftConfig;"
private const val CONTINUOUS_CHAT_CLASS = "Lcom/p1/mobile/putong/core/data/ContinuousChat;"
private const val ODIAMOND_VISITOR_CONFIG_CLASS = "Lcom/p1/mobile/putong/core/data/ODiamondVisitorMessageGuideConfig;"
private const val PROLOGUE_CONFIG_CLASS = "Lcom/p1/mobile/putong/core/data/PrologueConfig;"
private const val MESSAGE_TAB_REVISION_CONFIG_CLASS = "Lcom/p1/mobile/putong/core/data/MessageTabRevisionConfig;"
private const val COLLAPSIBLE_CONVERSATION_CONFIG_CLASS = "Lcom/p1/mobile/putong/core/data/CollapsibleConversationConfig;"
private const val CHAT_HELPER_CONFIG_CLASS = "Lcom/p1/mobile/putong/core/data/ChatHelperConfig;"
private const val CALL_RECORD_CLASS = "Lcom/p1/mobile/putong/core/data/CallRecord;"
private const val CONVERSATION_REFRESH_INTERVAL_CONFIG_CLASS = "Lcom/p1/mobile/putong/core/data/ConversationRefreshIntervalConfig;"
private const val HEARTBEAT_MATCH_DATA_CLASS = "Lcom/p1/mobile/putong/core/data/HeartbeatMatchData;"
private const val MESSAGE_INTEGRATION_CLASS = "Lcom/p1/mobile/putong/core/data/MessageIntegration;"
private const val ASSISTANT_MESSAGE_CLEAR_CLASS = "Lcom/p1/mobile/putong/core/data/AssistantMessageClear;"
private const val LOVE_BUZZ_DATA_CLASS = "Lcom/p1/mobile/putong/core/data/LoveBuzzData;"
private const val ICE_BREAK_DLG_CONFIG_CLASS = "Lcom/p1/mobile/putong/core/data/IceBreakDlgConfig;"
private const val CONTINUES_OP_CONV_CONFIG_CLASS = "Lcom/p1/mobile/putong/core/data/ContinuesOpConvConfig;"
private const val ITEM_MESSAGE_BASE_CLASS = "Lcom/p1/mobile/putong/core/ui/messages/ItemMessageBase;"
private const val KEEP_CONNECTION_CLASS = "Lcom/p1/mobile/putong/core/data/KeepConnection;"
private const val PRIVILEGE_CLASS = "Lcom/p1/mobile/putong/core/data/Privilege;"
private const val USER_PRIVILEGE_CONTENT_CLASS = "Lcom/p1/mobile/putong/core/data/UserPrivilegeContent;"

private val BUZZ_TYPE_STRINGS = setOf("voiceBuzz", "videoBuzz", "memojiBuzz", "textBuzz")

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
    description = "Removes message limits, unlimited pin chat, voice/video calls, quick chat, typing indicator, free gifts, letter, greeting, ice breaker, read receipts, AI translation, message recall, group chat, live chat, message filter, chat partner config, ODiamond visitor config, prologue config, love buzz data, secret crush limit, boost limit, message tab revision, collapsible conversation, chat helper AI, call duration, conversation refresh interval, heartbeat match, message integration, assistant message clear, love buzz prolong count, ice break dialog config, continues op conv config, unlimited recall window, telepathy reply minimums",
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

        j15ClassFingerprint.matchOrNull()?.classDef?.let { classDef ->
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

        rd6ClassFingerprint.matchOrNull()?.classDef?.let { classDef ->
            mutableClassDefBy(classDef).methods
                .filter { method ->
                    method.name == "X" &&
                        method.parameterTypes.size == 1 &&
                        method.parameterTypes[0] == "Lcom/p1/mobile/putong/core/data/Conversation;" &&
                        method.returnType == "Z"
                }
                .forEach { it.addInstructions(0, RETURN_TRUE) }
        }

        val resolver = getSharedResolver()
        val loveBuzzDataClasses = resolver.getLoveBuzzClasses()

        var loveBuzzGateEdits = 0
        loveBuzzDataClasses.forEach { classDef ->
            val mutable = mutableClassDefBy(classDef)
            val methodMap = classDef.methods.zip(mutable.methods).toMap()
            classDef.methods.forEach { method ->
                val instrs = method.cachedInstructions()
                if (!BUZZ_TYPE_STRINGS.all { s ->
                        instrs.any { it is ReferenceInstruction && (it.reference as? StringReference)?.string == s }
                    }) return@forEach
                val intValueIdx = instrs.indexOfFirst { instr ->
                    instr is ReferenceInstruction && (instr.reference as? MethodReference)?.let {
                        it.definingClass == "Ljava/lang/Integer;" && it.name == "intValue"
                    } == true
                }
                if (intValueIdx < 0 || intValueIdx + 1 >= instrs.size) return@forEach
                val next = instrs[intValueIdx + 1]
                if (next.opcode != Opcode.MOVE_RESULT || next !is OneRegisterInstruction) return@forEach
                val reg = next.registerA
                if (reg > 15) return@forEach
                val mutableMethod = methodMap[method] ?: return@forEach
                mutableMethod.replaceInstruction(intValueIdx + 1, BuilderInstruction11n(Opcode.CONST_4, reg, -1))
                loveBuzzGateEdits++
            }
        }
        check(loveBuzzGateEdits == 1) { "loveBuzz master gate edits: $loveBuzzGateEdits" }

        resolver.getTypingIndicatorClasses().forEach { classDef ->
            mutableClassDefBy(classDef).methods
                .filter { method ->
                    !AccessFlags.STATIC.isSet(method.accessFlags) &&
                        method.parameterTypes.isEmpty() &&
                        method.returnType == "V" &&
                        method.accessesField(KEEP_CONNECTION_CLASS, "chatTypingOpen") &&
                        method.accessesField(KEEP_CONNECTION_CLASS, "chatTypingInterval")
                }
                .forEach { method ->
                    method.preflightSmali(RETURN_VOID, 1)
                    method.addInstructions(0, RETURN_VOID)
                }
        }

        resolver.getMiscClass("letterCoinGate")?.let { classDef ->
            val mutable = mutableClassDefBy(classDef)
            val letterGate = mutable.methods.filter { method ->
                AccessFlags.STATIC.isSet(method.accessFlags) &&
                    method.returnType == "Z" &&
                    method.parameterTypes == listOf(PRIVILEGE_CLASS) &&
                    method.accessesField(PRIVILEGE_CLASS, "letter")
            }
            check(letterGate.size == 1) { "letterCoinGate b(Privilege) cardinality ${letterGate.size}" }
            letterGate.forEach { method ->
                method.preflightSmali(RETURN_TRUE, 2)
                method.addInstructions(0, RETURN_TRUE)
            }
            val coinAffordability = mutable.methods.filter { method ->
                if (!(AccessFlags.STATIC.isSet(method.accessFlags) &&
                        method.returnType == "Z" && method.parameterTypes.isEmpty())) return@filter false
                val calls = method.cachedInstructions().mapNotNull {
                    (it as? ReferenceInstruction)?.reference as? MethodReference
                }
                val repeatedInt = calls.filter { it.returnType == "I" && it.parameterTypes.isEmpty() }
                    .groupBy { "${it.definingClass}.${it.name}" }
                    .filter { it.value.size >= 2 }
                repeatedInt.size == 1 && calls.all { call ->
                    call.returnType == "J" ||
                        (call.returnType == "I" && call.parameterTypes.isEmpty() &&
                            repeatedInt.containsKey("${call.definingClass}.${call.name}"))
                }
            }
            check(coinAffordability.size == 1) { "letterCoinGate d() cardinality ${coinAffordability.size}" }
            coinAffordability.forEach { method ->
                method.preflightSmali(RETURN_TRUE, 2)
                method.addInstructions(0, RETURN_TRUE)
            }
        }

        oxeClassFingerprint.matchOrNull()?.classDef?.let { classDef ->
            mutableClassDefBy(classDef).methods
                .filter { method ->
                    method.name == "g" &&
                        method.parameterTypes.size == 1 &&
                        method.returnType == "Ljava/lang/Integer;"
                }
                .forEach { it.addInstructions(0, RETURN_INTEGER_9) }
        }

        chatGameInfoClassFingerprint.matchOrNull()?.classDef?.let { classDef ->
            mutableClassDefBy(classDef).methods
                .filter { method ->
                    method.accessesField("Lcom/p1/mobile/putong/core/data/ChatGameInfo;", "enable") &&
                        method.returnType == "Z" &&
                        method.parameterTypes.isEmpty()
                }
                .forEach { it.addInstructions(0, RETURN_TRUE) }
        }

        jailedGroupChatClassFingerprint.matchOrNull()?.classDef?.let { classDef ->
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

        // AI translate (CoreAITranslate.p3): In 7.3.6, p3() had signature ()Z (boolean availability gate).
        // In 7.4.3, p3 was changed to the actual translation API call:
        //   p3(String scene, String targetUserId, long messageId, long questionId, String promptId)Lrx/c;
        // The boolean gate was removed entirely -- the feature is unconditionally available client-side.
        // No patch needed. If the server restricts the /ai-translate/translate endpoint for non-premium
        // users, that cannot be fixed client-side without faking translation results.

        classDefByOrNull(RECALL_CONFIG_CLASS)?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                when {
                    method.name !in EXCLUDED_METHODS &&
                        method.accessesField(RECALL_CONFIG_CLASS, "enable") &&
                        method.returnType == "Z" &&
                        method.parameterTypes.isEmpty() -> method.addInstructions(0, RETURN_TRUE)

                    method.name !in EXCLUDED_METHODS &&
                        method.accessesField(RECALL_CONFIG_CLASS, "minutes") &&
                        method.returnType == "I" &&
                        method.parameterTypes.isEmpty() -> method.addInstructions(0, RETURN_INT_1440)
                }
            }
        }

        classDefByOrNull(GROUP_CREATION_LIMIT_CLASS)?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                when {
                    method.name !in EXCLUDED_METHODS &&
                        method.accessesField(GROUP_CREATION_LIMIT_CLASS, "groupRemaining") &&
                        method.returnType == "I" &&
                        method.parameterTypes.isEmpty() -> method.addInstructions(0, RETURN_INT_999)

                    method.name !in EXCLUDED_METHODS &&
                        method.accessesField(GROUP_CREATION_LIMIT_CLASS, "memberLimit") &&
                        method.returnType == "I" &&
                        method.parameterTypes.isEmpty() -> method.addInstructions(0, RETURN_INT_500)
                }
            }
        }

        classDefByOrNull(LIVE_CHAT_LIMIT_CLASS)?.let { classDef ->
            mutableClassDefBy(classDef).methods
                .filter { method ->
                    method.name !in EXCLUDED_METHODS &&
                        method.accessesField(LIVE_CHAT_LIMIT_CLASS, "remaining") &&
                        method.returnType == "I" &&
                        method.parameterTypes.isEmpty()
                }
                .forEach { it.addInstructions(0, RETURN_INT_9999) }
        }

        classDefByOrNull(MESSAGE_FILTER_CONFIG_CLASS)?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                when {
                    method.name !in EXCLUDED_METHODS &&
                        method.accessesField(MESSAGE_FILTER_CONFIG_CLASS, "convUnreadLimit") &&
                        method.returnType == "I" &&
                        method.parameterTypes.isEmpty() -> method.addInstructions(0, RETURN_INT_9999)

                    method.name !in EXCLUDED_METHODS &&
                        method.accessesField(MESSAGE_FILTER_CONFIG_CLASS, "redDotLimit") &&
                        method.returnType == "I" &&
                        method.parameterTypes.isEmpty() -> method.addInstructions(0, RETURN_INT_9999)

                    method.name !in EXCLUDED_METHODS &&
                        method.accessesField(MESSAGE_FILTER_CONFIG_CLASS, "shownDayLimit") &&
                        method.returnType == "I" &&
                        method.parameterTypes.isEmpty() -> method.addInstructions(0, RETURN_INT_9999)
                }
            }
        }

        classDefByOrNull(MSG_ICEBREAK_CONFIG_CLASS)?.let { classDef ->
            mutableClassDefBy(classDef).methods
                .filter { method ->
                    method.name !in EXCLUDED_METHODS_EXTENDED &&
                        method.accessesField(MSG_ICEBREAK_CONFIG_CLASS, "enable") &&
                        method.returnType == "Z" &&
                        method.parameterTypes.isEmpty()
                }
                .forEach { it.addInstructions(0, RETURN_TRUE) }
        }

        classDefByOrNull(MSG_ICEBREAK_CONFIG_V2_CLASS)?.let { classDef ->
            mutableClassDefBy(classDef).methods
                .filter { method ->
                    method.name !in EXCLUDED_METHODS_EXTENDED &&
                        method.accessesField(MSG_ICEBREAK_CONFIG_V2_CLASS, "enable") &&
                        method.returnType == "Z" &&
                        method.parameterTypes.isEmpty()
                }
                .forEach { it.addInstructions(0, RETURN_TRUE) }
        }

        classDefByOrNull(GREETING_PERMISSION_CLASS)?.let { classDef ->
            mutableClassDefBy(classDef).methods
                .filter { method ->
                    method.name !in EXCLUDED_METHODS_EXTENDED &&
                        method.accessesField(GREETING_PERMISSION_CLASS, "enable") &&
                        method.returnType == "Z" &&
                        method.parameterTypes.isEmpty()
                }
                .forEach { it.addInstructions(0, RETURN_TRUE) }
        }

        classDefByOrNull(GREETING_PERMISSION_FEED_CLASS)?.let { classDef ->
            mutableClassDefBy(classDef).methods
                .filter { method ->
                    method.name !in EXCLUDED_METHODS_EXTENDED &&
                        method.accessesField(GREETING_PERMISSION_FEED_CLASS, "enable") &&
                        method.returnType == "Z" &&
                        method.parameterTypes.isEmpty()
                }
                .forEach { it.addInstructions(0, RETURN_TRUE) }
        }

        classDefByOrNull(CHAT_ROUNDS_CONFIG_CLASS)?.let { classDef ->
            mutableClassDefBy(classDef).methods
                .filter { method ->
                    method.name !in EXCLUDED_METHODS_EXTENDED &&
                        method.accessesField(CHAT_ROUNDS_CONFIG_CLASS, "enabled") &&
                        method.returnType == "Z" &&
                        method.parameterTypes.isEmpty()
                }
                .forEach { it.addInstructions(0, RETURN_TRUE) }
        }

        classDefByOrNull(QUICK_CHAT_LOFT_CONFIG_CLASS)?.let { classDef ->
            mutableClassDefBy(classDef).methods
                .filter { method ->
                    method.name !in EXCLUDED_METHODS_EXTENDED &&
                        method.accessesField(QUICK_CHAT_LOFT_CONFIG_CLASS, "online_count_max") &&
                        method.returnType == "I" &&
                        method.parameterTypes.isEmpty()
                }
                .forEach { it.addInstructions(0, RETURN_INT_9999) }
        }

        classDefByOrNull(CONTINUOUS_CHAT_CLASS)?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                when {
                    method.name !in EXCLUDED_METHODS_EXTENDED &&
                        method.accessesField(CONTINUOUS_CHAT_CLASS, "days") &&
                        method.returnType == "I" &&
                        method.parameterTypes.isEmpty() -> method.addInstructions(0, RETURN_INT_999)

                    method.name !in EXCLUDED_METHODS_EXTENDED &&
                        method.accessesField(CONTINUOUS_CHAT_CLASS, "lastTime") &&
                        method.returnType == "J" &&
                        method.parameterTypes.isEmpty() -> method.addInstructions(0, RETURN_LONG_MAX)

                    method.name !in EXCLUDED_METHODS_EXTENDED &&
                        method.accessesField(CONTINUOUS_CHAT_CLASS, "todayMM") &&
                        method.returnType == "I" &&
                        method.parameterTypes.isEmpty() -> method.addInstructions(0, RETURN_INT_999)
                }
            }
        }

        classDefByOrNull(ODIAMOND_VISITOR_CONFIG_CLASS)?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                when {
                    method.name !in EXCLUDED_METHODS &&
                        method.accessesField(ODIAMOND_VISITOR_CONFIG_CLASS, "total_limit_daily") &&
                        method.returnType == "I" &&
                        method.parameterTypes.isEmpty() -> method.addInstructions(0, RETURN_INT_9999)

                    method.name !in EXCLUDED_METHODS &&
                        method.accessesField(ODIAMOND_VISITOR_CONFIG_CLASS, "user_limit_daily") &&
                        method.returnType == "I" &&
                        method.parameterTypes.isEmpty() -> method.addInstructions(0, RETURN_INT_9999)
                }
            }
        }

        classDefByOrNull(PROLOGUE_CONFIG_CLASS)?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                when {
                    method.name !in EXCLUDED_METHODS &&
                        method.accessesField(PROLOGUE_CONFIG_CLASS, "enable") &&
                        method.returnType == "Z" &&
                        method.parameterTypes.isEmpty() -> method.addInstructions(0, RETURN_TRUE)

                    method.name !in EXCLUDED_METHODS &&
                        method.accessesField(PROLOGUE_CONFIG_CLASS, "enter_conv_limit") &&
                        method.returnType == "I" &&
                        method.parameterTypes.isEmpty() -> method.addInstructions(0, RETURN_INT_9999)

                    method.name !in EXCLUDED_METHODS &&
                        method.accessesField(PROLOGUE_CONFIG_CLASS, "untalked_daily_show_count") &&
                        method.returnType == "I" &&
                        method.parameterTypes.isEmpty() -> method.addInstructions(0, RETURN_INT_9999)

                    method.name !in EXCLUDED_METHODS &&
                        method.accessesField(PROLOGUE_CONFIG_CLASS, "unreply_daily_show_count") &&
                        method.returnType == "I" &&
                        method.parameterTypes.isEmpty() -> method.addInstructions(0, RETURN_INT_9999)
                }
            }
        }

        classDefByOrNull(MESSAGE_TAB_REVISION_CONFIG_CLASS)?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                when {
                    method.name !in EXCLUDED_METHODS &&
                        method.accessesField(MESSAGE_TAB_REVISION_CONFIG_CLASS, "enabled") &&
                        method.returnType == "Z" &&
                        method.parameterTypes.isEmpty() -> method.addInstructions(0, RETURN_TRUE)

                    method.name !in EXCLUDED_METHODS &&
                        method.accessesField(MESSAGE_TAB_REVISION_CONFIG_CLASS, "new_tag_show_max_time") &&
                        method.returnType == "I" &&
                        method.parameterTypes.isEmpty() -> method.addInstructions(0, RETURN_INT_9999)

                    method.name !in EXCLUDED_METHODS &&
                        method.accessesField(MESSAGE_TAB_REVISION_CONFIG_CLASS, "new_tag_exposure_after_max_time") &&
                        method.returnType == "I" &&
                        method.parameterTypes.isEmpty() -> method.addInstructions(0, RETURN_INT_9999)

                    method.name !in EXCLUDED_METHODS &&
                        method.accessesField(MESSAGE_TAB_REVISION_CONFIG_CLASS, "click_chat_tab_interval_time") &&
                        method.returnType == "I" &&
                        method.parameterTypes.isEmpty() -> method.addInstructions(0, RETURN_INT_9999)

                    method.name !in EXCLUDED_METHODS &&
                        method.accessesField(MESSAGE_TAB_REVISION_CONFIG_CLASS, "new_tag_exposure_after_max_minutes") &&
                        method.returnType == "I" &&
                        method.parameterTypes.isEmpty() -> method.addInstructions(0, RETURN_INT_9999)
                }
            }
        }

        classDefByOrNull(COLLAPSIBLE_CONVERSATION_CONFIG_CLASS)?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                when {
                    method.name !in EXCLUDED_METHODS &&
                        method.accessesField(COLLAPSIBLE_CONVERSATION_CONFIG_CLASS, "enabled") &&
                        method.returnType == "Z" &&
                        method.parameterTypes.isEmpty() -> method.addInstructions(0, RETURN_TRUE)

                    method.name !in EXCLUDED_METHODS &&
                        method.accessesField(COLLAPSIBLE_CONVERSATION_CONFIG_CLASS, "ignore_old_unread_msg") &&
                        method.returnType == "Z" &&
                        method.parameterTypes.isEmpty() -> method.addInstructions(0, RETURN_TRUE)

                    method.name !in EXCLUDED_METHODS &&
                        method.accessesField(COLLAPSIBLE_CONVERSATION_CONFIG_CLASS, "ignorable_unread_msg_days") &&
                        method.returnType == "I" &&
                        method.parameterTypes.isEmpty() -> method.addInstructions(0, RETURN_INT_9999)

                    method.name !in EXCLUDED_METHODS &&
                        method.accessesField(COLLAPSIBLE_CONVERSATION_CONFIG_CLASS, "ignore_msg_days") &&
                        method.returnType == "I" &&
                        method.parameterTypes.isEmpty() -> method.addInstructions(0, RETURN_INT_9999)

                    method.name !in EXCLUDED_METHODS &&
                        method.accessesField(COLLAPSIBLE_CONVERSATION_CONFIG_CLASS, "ignore_tip_expose_threshold") &&
                        method.returnType == "I" &&
                        method.parameterTypes.isEmpty() -> method.addInstructions(0, RETURN_INT_9999)

                    method.name !in EXCLUDED_METHODS &&
                        method.accessesField(COLLAPSIBLE_CONVERSATION_CONFIG_CLASS, "last_conversation_not_participating") &&
                        method.returnType == "I" &&
                        method.parameterTypes.isEmpty() -> method.addInstructions(0, RETURN_INT_9999)
                }
            }
        }

        classDefByOrNull(CHAT_HELPER_CONFIG_CLASS)?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                when {
                    method.name !in EXCLUDED_METHODS &&
                        method.accessesField(CHAT_HELPER_CONFIG_CLASS, "female_chat_assistant_enable") &&
                        method.returnType == "Z" &&
                        method.parameterTypes.isEmpty() -> method.addInstructions(0, RETURN_TRUE)

                    method.name !in EXCLUDED_METHODS &&
                        method.accessesField(CHAT_HELPER_CONFIG_CLASS, "female_chat_assistant_profile_dlg_close_max") &&
                        method.returnType == "I" &&
                        method.parameterTypes.isEmpty() -> method.addInstructions(0, RETURN_INT_9999)
                }
            }
        }

        classDefByOrNull(CALL_RECORD_CLASS)?.let { classDef ->
            mutableClassDefBy(classDef).methods
                .filter { method ->
                    method.name !in EXCLUDED_METHODS &&
                        method.accessesField(CALL_RECORD_CLASS, "duration") &&
                        method.returnType == "J" &&
                        method.parameterTypes.isEmpty()
                }
                .forEach { it.addInstructions(0, RETURN_LONG_MAX) }
        }

        classDefByOrNull(CONVERSATION_REFRESH_INTERVAL_CONFIG_CLASS)?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                when {
                    method.name !in EXCLUDED_METHODS &&
                        method.accessesField(CONVERSATION_REFRESH_INTERVAL_CONFIG_CLASS, "conversationRefreshObsInterval") &&
                        method.returnType == "I" &&
                        method.parameterTypes.isEmpty() -> method.addInstructions(0, RETURN_INT_5)

                    method.name !in EXCLUDED_METHODS &&
                        method.accessesField(CONVERSATION_REFRESH_INTERVAL_CONFIG_CLASS, "conversationListRefreshInterval") &&
                        method.returnType == "I" &&
                        method.parameterTypes.isEmpty() -> method.addInstructions(0, RETURN_INT_10)

                    method.name !in EXCLUDED_METHODS &&
                        method.accessesField(CONVERSATION_REFRESH_INTERVAL_CONFIG_CLASS, "monitorEnable") &&
                        method.returnType == "Z" &&
                        method.parameterTypes.isEmpty() -> method.addInstructions(0, RETURN_TRUE)
                }
            }
        }

        classDefByOrNull(HEARTBEAT_MATCH_DATA_CLASS)?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                when {
                    method.name !in EXCLUDED_METHODS &&
                        method.accessesField(HEARTBEAT_MATCH_DATA_CLASS, "remaining") &&
                        method.returnType == "I" &&
                        method.parameterTypes.isEmpty() -> method.addInstructions(0, RETURN_INT_9999)

                    method.name !in EXCLUDED_METHODS &&
                        method.accessesField(HEARTBEAT_MATCH_DATA_CLASS, "expiredTime") &&
                        method.returnType == "D" &&
                        method.parameterTypes.isEmpty() -> method.addInstructions(0, RETURN_DOUBLE_MAX)
                }
            }
        }

        classDefByOrNull(MESSAGE_INTEGRATION_CLASS)?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                when {
                    method.name !in EXCLUDED_METHODS &&
                        method.accessesField(MESSAGE_INTEGRATION_CLASS, "enable") &&
                        method.returnType == "Z" &&
                        method.parameterTypes.isEmpty() -> method.addInstructions(0, RETURN_TRUE)

                    method.name !in EXCLUDED_METHODS &&
                        method.accessesField(MESSAGE_INTEGRATION_CLASS, "limit") &&
                        method.returnType == "I" &&
                        method.parameterTypes.isEmpty() -> method.addInstructions(0, RETURN_INT_9999)
                }
            }
        }

        classDefByOrNull(ASSISTANT_MESSAGE_CLEAR_CLASS)?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                when {
                    method.name !in EXCLUDED_METHODS &&
                        method.accessesField(ASSISTANT_MESSAGE_CLEAR_CLASS, "enabled") &&
                        method.returnType == "Z" &&
                        method.parameterTypes.isEmpty() -> method.addInstructions(0, RETURN_TRUE)

                    method.name !in EXCLUDED_METHODS &&
                        method.accessesField(ASSISTANT_MESSAGE_CLEAR_CLASS, "limit_days") &&
                        method.returnType == "I" &&
                        method.parameterTypes.isEmpty() -> method.addInstructions(0, RETURN_INT_9999)
                }
            }
        }

        classDefByOrNull(LOVE_BUZZ_DATA_CLASS)?.let { classDef ->
            mutableClassDefBy(classDef).methods
                .filter { method ->
                    method.name !in EXCLUDED_METHODS &&
                        method.accessesField(LOVE_BUZZ_DATA_CLASS, "remainingProlongCount") &&
                        method.returnType == "I" &&
                        method.parameterTypes.isEmpty()
                }
                .forEach { it.addInstructions(0, RETURN_INT_9999) }
        }

        classDefByOrNull(ICE_BREAK_DLG_CONFIG_CLASS)?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                when {
                    method.name !in EXCLUDED_METHODS &&
                        method.accessesField(ICE_BREAK_DLG_CONFIG_CLASS, "maxNum") &&
                        method.returnType == "I" &&
                        method.parameterTypes.isEmpty() -> method.addInstructions(0, RETURN_INT_9999)

                    method.name !in EXCLUDED_METHODS &&
                        method.accessesField(ICE_BREAK_DLG_CONFIG_CLASS, "timeInterval") &&
                        method.returnType == "I" &&
                        method.parameterTypes.isEmpty() -> method.addInstructions(0, RETURN_INT_9999)
                }
            }
        }

        classDefByOrNull(CONTINUES_OP_CONV_CONFIG_CLASS)?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                when {
                    method.name !in EXCLUDED_METHODS &&
                        method.accessesField(CONTINUES_OP_CONV_CONFIG_CLASS, "enable") &&
                        method.returnType == "Z" &&
                        method.parameterTypes.isEmpty() -> method.addInstructions(0, RETURN_TRUE)

                    method.name !in EXCLUDED_METHODS &&
                        method.accessesField(CONTINUES_OP_CONV_CONFIG_CLASS, "max_count") &&
                        method.returnType == "I" &&
                        method.parameterTypes.isEmpty() -> method.addInstructions(0, RETURN_INT_9999)

                    method.name !in EXCLUDED_METHODS &&
                        method.accessesField(CONTINUES_OP_CONV_CONFIG_CLASS, "branch_size") &&
                        method.returnType == "I" &&
                        method.parameterTypes.isEmpty() -> method.addInstructions(0, RETURN_INT_9999)
                }
            }
        }

        // Unlimited recall window: ItemMessageBase.S(Message,Z)Z returns true when the message
        // is EXPIRED (createdTime + minutes*60000 < now). Forcing false keeps the recall menu
        // offered and passes the confirm re-check. Server may still enforce its own window
        // (TantanForbidden toast) — worst case status quo. Signature cardinality 1 in 7.5.4.
        classDefByOrNull(ITEM_MESSAGE_BASE_CLASS)?.let { classDef ->
            val hasRecallConfig = classDef.methods.any { it.cachedInstructions().any { instr ->
                instr is ReferenceInstruction &&
                    (instr.reference as? StringReference)?.string == "recall_config"
            } }
            if (hasRecallConfig) {
                mutableClassDefBy(classDef).methods
                    .filter { method ->
                        method.parameterTypes.size == 2 &&
                            method.parameterTypes[0] == MESSAGE_CLASS &&
                            method.parameterTypes[1] == "Z" &&
                            method.returnType == "Z"
                    }
                    .forEach { method ->
                        method.preflightSmali(RETURN_FALSE, 2)
                        method.addInstructions(0, RETURN_FALSE)
                    }
            }
        }

        // Telepathy reply-length minimums: the gate (7.5.6.1 x3r.b(g6m)Z, was o3k0.b(TpTelepathyConv)Z)
        // reads the server flag replyLengthLimit. Force the gate false; the actual check methods
        // are left untouched. Match the static ()Z carrier of the replyLengthLimit field by shape
        // (the param type is now the obfuscated telepathy view-model, not TpTelepathyConv).
        resolver.getMiscClass("telepathyReplyLimit")?.let { classDef ->
            mutableClassDefBy(classDef).methods
                .filter { method ->
                    AccessFlags.STATIC.isSet(method.accessFlags) &&
                        method.returnType == "Z" &&
                        method.parameterTypes.size == 1 &&
                        method.parameterTypes[0].startsWith("L") &&
                        method.sharedCachedInstructions().any { instr ->
                            instr is ReferenceInstruction &&
                                (instr.reference as? FieldReference)?.let {
                                    it.definingClass == "Lcom/p1/mobile/putong/core/data/TpTelepathyConv;" &&
                                        it.name == "replyLengthLimit"
                                } == true
                        }
                }
                .forEach { method ->
                    method.preflightSmali(RETURN_FALSE, 2)
                    method.addInstructions(0, RETURN_FALSE)
                }
        }

        // Voice-message 60 s cap (a310$b.run): the 1 s tick reposts while elapsed <= 60000
        // (inlined Constants.ONE_MIN_IN_MILLIS), else auto-stops/sends. Replace the const-wide
        // 60000 literal with Long.MAX_VALUE via replaceInstruction (builder re-lays-out code
        // offsets symbolically; branch structure and the UI tick are preserved). The 49700 ms
        // start delay and the 50 ms sound-level sibling c.run are untouched. Pure client timer
        // — the server may reject over-long audio on send (device-test; worst case status quo).
        // The telepathy twin mal0$b carries the same cap but is intentionally NOT patched:
        // telepathy has its own server-driven time gate (o3k0.e) on the send path.
        resolver.getMiscClass("voiceRecordInner")?.let { classDef ->
            val mutable = mutableClassDefBy(classDef)
            val methodMap = classDef.methods.zip(mutable.methods).toMap()
            var edited = false
            classDef.methods.forEach { method ->
                if (method.name != "run" || method.returnType != "V" ||
                    method.parameterTypes.isNotEmpty()) return@forEach
                val mutableMethod = methodMap[method] ?: return@forEach
                method.cachedInstructions().forEachIndexed { i, instr ->
                    if (instr is WideLiteralInstruction && instr.wideLiteral == 60000L &&
                        instr.opcode.name.startsWith("const-wide") &&
                        instr is OneRegisterInstruction) {
                        mutableMethod.replaceInstruction(
                            i, BuilderInstruction51l(Opcode.CONST_WIDE, instr.registerA, Long.MAX_VALUE)
                        )
                        edited = true
                    }
                }
            }
            check(edited) { "voiceRecordInner: no const-wide 60000 literal found in run()V" }
        }

        // Local fake-conversation persistence choke point (7.5.6.1 mc3.G1): every caller is
        // a local fake-factory lambda (no server-merge caller), so guarding this single public
        // static (Conversation)V upsert suppresses LOCAL like-guide promos only. Drop the two
        // pure promo convTypes before the DB write; everything else (fake_one_side*,
        // intlSeeChatRequest, real server conversations) passes through. The method has 3 regs
        // (static: conversation=p0=v2, scratch v0/v1); the original prologue redefines v0/v1
        // before reading them. Match by shape + the (Conversation,*)V DB upsert call, never
        // the obfuscated names (gotcha #17/#18).
        resolver.getMiscClass("convUpsert")?.let { classDef ->
            val targets = mutableClassDefBy(classDef).methods.filter { method ->
                AccessFlags.PUBLIC.isSet(method.accessFlags) &&
                    AccessFlags.STATIC.isSet(method.accessFlags) &&
                    method.returnType == "V" &&
                    method.parameterTypes == listOf("Lcom/p1/mobile/putong/core/data/Conversation;") &&
                    method.sharedCachedInstructions().any { instr ->
                        instr is ReferenceInstruction &&
                            (instr.reference as? MethodReference)?.let { ref ->
                                ref.returnType == "V" && ref.parameterTypes.size == 2 &&
                                    ref.parameterTypes[0] == "Lcom/p1/mobile/putong/core/data/Conversation;"
                            } == true
                    }
            }
            check(targets.size == 1) { "convUpsert cardinality ${targets.size}" }
            targets.forEach { method ->
                method.preflightSmali(FAKE_CONV_UPSERT_GUARD, 11)
                method.addInstructions(0, FAKE_CONV_UPSERT_GUARD)
            }
        }

        // Icebreak limit (y95.call [67]): the iget reading iceBreakLastMessageShowCountLimit
        // from MsgIcebreakConfigV2 controls how many times the icebreak prompt is shown.
        // Replace with const/16 30000 to effectively remove the limit. Size-preserving:
        // iget (22c, 2 code units) → const/16 (21s, 2 code units).
        resolver.getMiscClass("icebreakLimit")?.let { classDef ->
            mutableClassDefBy(classDef).methods
                .filter { method ->
                    method.parameterTypes.size == 1 &&
                        method.parameterTypes[0] == "Ljava/lang/Object;" &&
                        method.returnType == "Ljava/lang/Object;" &&
                        method.containsExactString("msg_ice_break_config_v2")
                }
                .forEach { method ->
                    val instructions = method.implementation?.instructions?.toList() ?: return@forEach
                    val targetIdx = instructions.indexOfFirst { instr ->
                        instr is ReferenceInstruction &&
                            (instr.reference as? FieldReference)?.name == "iceBreakLastMessageShowCountLimit" &&
                            instr.opcode.name.startsWith("iget")
                    }
                    if (targetIdx < 0) return@forEach
                    val targetInstr = instructions[targetIdx]
                    val register = (targetInstr as? OneRegisterInstruction)?.registerA ?: return@forEach
                    val replacement = com.android.tools.smali.dexlib2.builder.instruction.BuilderInstruction21s(
                        Opcode.CONST_16,
                        register,
                        30000
                    )
                    method.replaceInstruction(targetIdx, replacement)
                }
        }
    }
}

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
    ),
)
