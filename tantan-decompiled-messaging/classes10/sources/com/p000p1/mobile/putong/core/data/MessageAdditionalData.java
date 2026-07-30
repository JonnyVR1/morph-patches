package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.BreakIce;
import com.p000p1.mobile.putong.core.data.ChatAssistantQuestion;
import com.p000p1.mobile.putong.core.data.QuestionResult;
import com.p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.MessageNanoAdapter;
import com.tantanapp.common.data.ProtobufAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class MessageAdditionalData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "messageadditionaldata";

    @Nullable
    @ProtobufIndex(index = 38)
    public String aiChatGuideType;

    @Nullable
    @ProtobufIndex(index = 28)
    public AiPicture aiPicture;

    @Nullable
    @ProtobufIndex(index = 4)
    public String callee;

    @Nullable
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String caller;

    @Nullable
    @ProtobufIndex(index = 25)
    public List<ChatAssistantQuestion> chatAssistantQuestions;

    @Nullable
    @ProtobufIndex(index = 18)
    public ChatGiftInfo chatGiftInfo;

    @NonNull
    @ProtobufIndex(index = 13)
    public String coinSign;

    @Nullable
    @ProtobufIndex(index = 33)
    public CommonTipBox commonTipBox;

    @Nullable
    @ProtobufIndex(index = 39)
    public MessageAdditionalDataCompliment compliment;

    @NonNull
    @ProtobufIndex(index = 12)
    public String consumeType;

    @Nullable
    @ProtobufIndex(index = 14)
    public MessageContact contact;

    @NonNull
    @ProtobufIndex(index = 1)
    public String contactInfoRequestMessageId;

    @Nullable
    @ProtobufIndex(index = 30)
    public ContinuousChatTip continuousChatTip;

    @Nullable
    @ProtobufIndex(index = 17)
    public ConversationNotification conversationNotification;

    @Nullable
    @ProtobufIndex(index = 6)
    public String duration;

    @Nullable
    @ProtobufIndex(index = 24)
    public ExchangePicture exchangePicture;

    @Nullable
    @ProtobufIndex(index = 26)
    public FemaleUnreplyReminder femaleUnreplyReminder;

    @ProtobufIndex(index = 11)
    public boolean forceSend;

    @Nullable
    @ProtobufIndex(index = 20)
    public GroupInvitation groupInvitation;

    @Nullable
    @ProtobufIndex(index = 29)
    public HarassAlertInfo harassAlertInfo;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String href;

    @Nullable
    public String iceBreakQuestionID;

    @Nullable
    @ProtobufIndex(index = 36)
    public IceBreakingQA iceBreakingQA;

    @Nullable
    @ProtobufIndex(index = Conversation.SURPRISE_LEVEL_TOP)
    public IceBreakingQuestion iceBreakingQuestion;

    @Nullable
    @ProtobufIndex(index = 32)
    public LimitTimePicture limitTimePicture;

    @Nullable
    @ProtobufIndex(index = 22)
    public List<BreakIce> localBreakIce;

    @Nullable
    @ProtobufIndex(index = 34)
    public Questionnaire localUXQuestionnaire;

    @Nullable
    @ProtobufIndex(index = 35)
    public LoveLetterMessageInfo loveLetterInfo;

    @Nullable
    @ProtobufIndex(index = 19)
    public ChatGiftInfo momentGiftInfo;

    @Nullable
    @ProtobufIndex(index = 7)
    public NewQuestion newQuestion;

    @Nullable
    @ProtobufIndex(index = 8)
    public NewQuestionAnswer newQuestionAnswer;

    @Nullable
    @ProtobufIndex(index = 15)
    public OneSideNoMatchMessage oneSideNoMatch;

    @Nullable
    @ProtobufIndex(index = 37)
    public PrologueMessageAdditional prologue;

    @Nullable
    @ProtobufIndex(index = 9)
    public List<QuestionResult> questionResult;

    @Nullable
    @ProtobufIndex(index = 16)
    public MessageMusic song;

    @Nullable
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public String status;

    @Nullable
    @ProtobufIndex(index = 31)
    public SystemReminder systemReminder;

    @Nullable
    @ProtobufIndex(index = 27)
    public ChatTips twoSidesDifferentTip;

    @Nullable
    @ProtobufIndex(index = 21)
    public KnowMyselfShareMessageAdditional understandShare;

    @Nullable
    @ProtobufIndex(index = 23)
    public WoodenFishHint woodenFishHint;
    public static ProtobufAdapter<MessageAdditionalData> PROTOBUF_ADAPTER = new MessageNanoAdapter<MessageAdditionalData>() { // from class: com.p1.mobile.putong.core.data.MessageAdditionalData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(MessageAdditionalData messageAdditionalData) {
            String str = messageAdditionalData.contactInfoRequestMessageId;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = messageAdditionalData.href;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = messageAdditionalData.caller;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            String str4 = messageAdditionalData.callee;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(4, str4);
            }
            String str5 = messageAdditionalData.status;
            if (str5 != null) {
                iO += CodedOutputByteBufferNano.o(5, str5);
            }
            String str6 = messageAdditionalData.duration;
            if (str6 != null) {
                iO += CodedOutputByteBufferNano.o(6, str6);
            }
            NewQuestion newQuestion = messageAdditionalData.newQuestion;
            if (newQuestion != null) {
                iO += CodedOutputByteBufferNano.l(7, newQuestion, NewQuestion.PROTOBUF_ADAPTER);
            }
            NewQuestionAnswer newQuestionAnswer = messageAdditionalData.newQuestionAnswer;
            if (newQuestionAnswer != null) {
                iO += CodedOutputByteBufferNano.l(8, newQuestionAnswer, NewQuestionAnswer.PROTOBUF_ADAPTER);
            }
            List<QuestionResult> list = messageAdditionalData.questionResult;
            if (list != null) {
                iO += CodedOutputByteBufferNano.l(9, list, QuestionResult.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            IceBreakingQuestion iceBreakingQuestion = messageAdditionalData.iceBreakingQuestion;
            if (iceBreakingQuestion != null) {
                iO += CodedOutputByteBufferNano.l(10, iceBreakingQuestion, IceBreakingQuestion.PROTOBUF_ADAPTER);
            }
            int iB = iO + CodedOutputByteBufferNano.b(11, messageAdditionalData.forceSend);
            String str7 = messageAdditionalData.consumeType;
            if (str7 != null) {
                iB += CodedOutputByteBufferNano.o(12, str7);
            }
            String str8 = messageAdditionalData.coinSign;
            if (str8 != null) {
                iB += CodedOutputByteBufferNano.o(13, str8);
            }
            MessageContact messageContact = messageAdditionalData.contact;
            if (messageContact != null) {
                iB += CodedOutputByteBufferNano.l(14, messageContact, MessageContact.PROTOBUF_ADAPTER);
            }
            OneSideNoMatchMessage oneSideNoMatchMessage = messageAdditionalData.oneSideNoMatch;
            if (oneSideNoMatchMessage != null) {
                iB += CodedOutputByteBufferNano.l(15, oneSideNoMatchMessage, OneSideNoMatchMessage.PROTOBUF_ADAPTER);
            }
            MessageMusic messageMusic = messageAdditionalData.song;
            if (messageMusic != null) {
                iB += CodedOutputByteBufferNano.l(16, messageMusic, MessageMusic.PROTOBUF_ADAPTER);
            }
            ConversationNotification conversationNotification = messageAdditionalData.conversationNotification;
            if (conversationNotification != null) {
                iB += CodedOutputByteBufferNano.l(17, conversationNotification, ConversationNotification.PROTOBUF_ADAPTER);
            }
            ChatGiftInfo chatGiftInfo = messageAdditionalData.chatGiftInfo;
            if (chatGiftInfo != null) {
                iB += CodedOutputByteBufferNano.l(18, chatGiftInfo, ChatGiftInfo.PROTOBUF_ADAPTER);
            }
            ChatGiftInfo chatGiftInfo2 = messageAdditionalData.momentGiftInfo;
            if (chatGiftInfo2 != null) {
                iB += CodedOutputByteBufferNano.l(19, chatGiftInfo2, ChatGiftInfo.PROTOBUF_ADAPTER);
            }
            GroupInvitation groupInvitation = messageAdditionalData.groupInvitation;
            if (groupInvitation != null) {
                iB += CodedOutputByteBufferNano.l(20, groupInvitation, GroupInvitation.PROTOBUF_ADAPTER);
            }
            KnowMyselfShareMessageAdditional knowMyselfShareMessageAdditional = messageAdditionalData.understandShare;
            if (knowMyselfShareMessageAdditional != null) {
                iB += CodedOutputByteBufferNano.l(21, knowMyselfShareMessageAdditional, KnowMyselfShareMessageAdditional.PROTOBUF_ADAPTER);
            }
            List<BreakIce> list2 = messageAdditionalData.localBreakIce;
            if (list2 != null) {
                iB += CodedOutputByteBufferNano.l(22, list2, BreakIce.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            WoodenFishHint woodenFishHint = messageAdditionalData.woodenFishHint;
            if (woodenFishHint != null) {
                iB += CodedOutputByteBufferNano.l(23, woodenFishHint, WoodenFishHint.PROTOBUF_ADAPTER);
            }
            ExchangePicture exchangePicture = messageAdditionalData.exchangePicture;
            if (exchangePicture != null) {
                iB += CodedOutputByteBufferNano.l(24, exchangePicture, ExchangePicture.PROTOBUF_ADAPTER);
            }
            List<ChatAssistantQuestion> list3 = messageAdditionalData.chatAssistantQuestions;
            if (list3 != null) {
                iB += CodedOutputByteBufferNano.l(25, list3, ChatAssistantQuestion.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            FemaleUnreplyReminder femaleUnreplyReminder = messageAdditionalData.femaleUnreplyReminder;
            if (femaleUnreplyReminder != null) {
                iB += CodedOutputByteBufferNano.l(26, femaleUnreplyReminder, FemaleUnreplyReminder.PROTOBUF_ADAPTER);
            }
            ChatTips chatTips = messageAdditionalData.twoSidesDifferentTip;
            if (chatTips != null) {
                iB += CodedOutputByteBufferNano.l(27, chatTips, ChatTips.PROTOBUF_ADAPTER);
            }
            AiPicture aiPicture = messageAdditionalData.aiPicture;
            if (aiPicture != null) {
                iB += CodedOutputByteBufferNano.l(28, aiPicture, AiPicture.PROTOBUF_ADAPTER);
            }
            HarassAlertInfo harassAlertInfo = messageAdditionalData.harassAlertInfo;
            if (harassAlertInfo != null) {
                iB += CodedOutputByteBufferNano.l(29, harassAlertInfo, HarassAlertInfo.PROTOBUF_ADAPTER);
            }
            ContinuousChatTip continuousChatTip = messageAdditionalData.continuousChatTip;
            if (continuousChatTip != null) {
                iB += CodedOutputByteBufferNano.l(30, continuousChatTip, ContinuousChatTip.PROTOBUF_ADAPTER);
            }
            SystemReminder systemReminder = messageAdditionalData.systemReminder;
            if (systemReminder != null) {
                iB += CodedOutputByteBufferNano.l(31, systemReminder, SystemReminder.PROTOBUF_ADAPTER);
            }
            LimitTimePicture limitTimePicture = messageAdditionalData.limitTimePicture;
            if (limitTimePicture != null) {
                iB += CodedOutputByteBufferNano.l(32, limitTimePicture, LimitTimePicture.PROTOBUF_ADAPTER);
            }
            CommonTipBox commonTipBox = messageAdditionalData.commonTipBox;
            if (commonTipBox != null) {
                iB += CodedOutputByteBufferNano.l(33, commonTipBox, CommonTipBox.PROTOBUF_ADAPTER);
            }
            Questionnaire questionnaire = messageAdditionalData.localUXQuestionnaire;
            if (questionnaire != null) {
                iB += CodedOutputByteBufferNano.l(34, questionnaire, Questionnaire.PROTOBUF_ADAPTER);
            }
            LoveLetterMessageInfo loveLetterMessageInfo = messageAdditionalData.loveLetterInfo;
            if (loveLetterMessageInfo != null) {
                iB += CodedOutputByteBufferNano.l(35, loveLetterMessageInfo, LoveLetterMessageInfo.PROTOBUF_ADAPTER);
            }
            IceBreakingQA iceBreakingQA = messageAdditionalData.iceBreakingQA;
            if (iceBreakingQA != null) {
                iB += CodedOutputByteBufferNano.l(36, iceBreakingQA, IceBreakingQA.PROTOBUF_ADAPTER);
            }
            PrologueMessageAdditional prologueMessageAdditional = messageAdditionalData.prologue;
            if (prologueMessageAdditional != null) {
                iB += CodedOutputByteBufferNano.l(37, prologueMessageAdditional, PrologueMessageAdditional.PROTOBUF_ADAPTER);
            }
            String str9 = messageAdditionalData.aiChatGuideType;
            if (str9 != null) {
                iB += CodedOutputByteBufferNano.o(38, str9);
            }
            MessageAdditionalDataCompliment messageAdditionalDataCompliment = messageAdditionalData.compliment;
            if (messageAdditionalDataCompliment != null) {
                iB += CodedOutputByteBufferNano.l(39, messageAdditionalDataCompliment, MessageAdditionalDataCompliment.PROTOBUF_ADAPTER);
            }
            ((MessageNano) messageAdditionalData).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public MessageAdditionalData m14164parse(nb5 nb5Var) throws IOException {
            MessageAdditionalData messageAdditionalData = new MessageAdditionalData();
            while (true) {
                switch (nb5Var.u()) {
                    case 0:
                        if (messageAdditionalData.contactInfoRequestMessageId == null) {
                            messageAdditionalData.contactInfoRequestMessageId = "";
                        }
                        if (messageAdditionalData.href == null) {
                            messageAdditionalData.href = "";
                        }
                        if (messageAdditionalData.consumeType == null) {
                            messageAdditionalData.consumeType = "";
                        }
                        if (messageAdditionalData.coinSign == null) {
                            messageAdditionalData.coinSign = "";
                        }
                        break;
                    case Conversation.SURPRISE_LEVEL_TOP /* 10 */:
                        messageAdditionalData.contactInfoRequestMessageId = nb5Var.s();
                        continue;
                    case 18:
                        messageAdditionalData.href = nb5Var.s();
                        continue;
                    case 26:
                        messageAdditionalData.caller = nb5Var.s();
                        continue;
                    case 34:
                        messageAdditionalData.callee = nb5Var.s();
                        continue;
                    case 42:
                        messageAdditionalData.status = nb5Var.s();
                        continue;
                    case Conversation.EXPOSURE_LEVEL_TOP /* 50 */:
                        messageAdditionalData.duration = nb5Var.s();
                        continue;
                    case 58:
                        messageAdditionalData.newQuestion = (NewQuestion) nb5Var.l(NewQuestion.PROTOBUF_ADAPTER);
                        continue;
                    case 66:
                        messageAdditionalData.newQuestionAnswer = (NewQuestionAnswer) nb5Var.l(NewQuestionAnswer.PROTOBUF_ADAPTER);
                        continue;
                    case 74:
                        messageAdditionalData.questionResult = (List) nb5Var.l(QuestionResult.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 82:
                        messageAdditionalData.iceBreakingQuestion = (IceBreakingQuestion) nb5Var.l(IceBreakingQuestion.PROTOBUF_ADAPTER);
                        continue;
                    case 88:
                        messageAdditionalData.forceSend = nb5Var.g();
                        continue;
                    case 98:
                        messageAdditionalData.consumeType = nb5Var.s();
                        continue;
                    case 106:
                        messageAdditionalData.coinSign = nb5Var.s();
                        continue;
                    case 114:
                        messageAdditionalData.contact = (MessageContact) nb5Var.l(MessageContact.PROTOBUF_ADAPTER);
                        continue;
                    case 122:
                        messageAdditionalData.oneSideNoMatch = (OneSideNoMatchMessage) nb5Var.l(OneSideNoMatchMessage.PROTOBUF_ADAPTER);
                        continue;
                    case 130:
                        messageAdditionalData.song = (MessageMusic) nb5Var.l(MessageMusic.PROTOBUF_ADAPTER);
                        continue;
                    case 138:
                        messageAdditionalData.conversationNotification = (ConversationNotification) nb5Var.l(ConversationNotification.PROTOBUF_ADAPTER);
                        continue;
                    case 146:
                        messageAdditionalData.chatGiftInfo = (ChatGiftInfo) nb5Var.l(ChatGiftInfo.PROTOBUF_ADAPTER);
                        continue;
                    case 154:
                        messageAdditionalData.momentGiftInfo = (ChatGiftInfo) nb5Var.l(ChatGiftInfo.PROTOBUF_ADAPTER);
                        continue;
                    case 162:
                        messageAdditionalData.groupInvitation = (GroupInvitation) nb5Var.l(GroupInvitation.PROTOBUF_ADAPTER);
                        continue;
                    case 170:
                        messageAdditionalData.understandShare = (KnowMyselfShareMessageAdditional) nb5Var.l(KnowMyselfShareMessageAdditional.PROTOBUF_ADAPTER);
                        continue;
                    case 178:
                        messageAdditionalData.localBreakIce = (List) nb5Var.l(BreakIce.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 186:
                        messageAdditionalData.woodenFishHint = (WoodenFishHint) nb5Var.l(WoodenFishHint.PROTOBUF_ADAPTER);
                        continue;
                    case 194:
                        messageAdditionalData.exchangePicture = (ExchangePicture) nb5Var.l(ExchangePicture.PROTOBUF_ADAPTER);
                        continue;
                    case 202:
                        messageAdditionalData.chatAssistantQuestions = (List) nb5Var.l(ChatAssistantQuestion.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 210:
                        messageAdditionalData.femaleUnreplyReminder = (FemaleUnreplyReminder) nb5Var.l(FemaleUnreplyReminder.PROTOBUF_ADAPTER);
                        continue;
                    case 218:
                        messageAdditionalData.twoSidesDifferentTip = (ChatTips) nb5Var.l(ChatTips.PROTOBUF_ADAPTER);
                        continue;
                    case 226:
                        messageAdditionalData.aiPicture = (AiPicture) nb5Var.l(AiPicture.PROTOBUF_ADAPTER);
                        continue;
                    case 234:
                        messageAdditionalData.harassAlertInfo = (HarassAlertInfo) nb5Var.l(HarassAlertInfo.PROTOBUF_ADAPTER);
                        continue;
                    case 242:
                        messageAdditionalData.continuousChatTip = (ContinuousChatTip) nb5Var.l(ContinuousChatTip.PROTOBUF_ADAPTER);
                        continue;
                    case 250:
                        messageAdditionalData.systemReminder = (SystemReminder) nb5Var.l(SystemReminder.PROTOBUF_ADAPTER);
                        continue;
                    case 258:
                        messageAdditionalData.limitTimePicture = (LimitTimePicture) nb5Var.l(LimitTimePicture.PROTOBUF_ADAPTER);
                        continue;
                    case 266:
                        messageAdditionalData.commonTipBox = (CommonTipBox) nb5Var.l(CommonTipBox.PROTOBUF_ADAPTER);
                        continue;
                    case 274:
                        messageAdditionalData.localUXQuestionnaire = (Questionnaire) nb5Var.l(Questionnaire.PROTOBUF_ADAPTER);
                        continue;
                    case 282:
                        messageAdditionalData.loveLetterInfo = (LoveLetterMessageInfo) nb5Var.l(LoveLetterMessageInfo.PROTOBUF_ADAPTER);
                        continue;
                    case 290:
                        messageAdditionalData.iceBreakingQA = (IceBreakingQA) nb5Var.l(IceBreakingQA.PROTOBUF_ADAPTER);
                        continue;
                    case 298:
                        messageAdditionalData.prologue = (PrologueMessageAdditional) nb5Var.l(PrologueMessageAdditional.PROTOBUF_ADAPTER);
                        continue;
                    case 306:
                        messageAdditionalData.aiChatGuideType = nb5Var.s();
                        continue;
                    case 314:
                        messageAdditionalData.compliment = (MessageAdditionalDataCompliment) nb5Var.l(MessageAdditionalDataCompliment.PROTOBUF_ADAPTER);
                        continue;
                    default:
                        if (messageAdditionalData.contactInfoRequestMessageId == null) {
                            messageAdditionalData.contactInfoRequestMessageId = "";
                        }
                        if (messageAdditionalData.href == null) {
                            messageAdditionalData.href = "";
                        }
                        if (messageAdditionalData.consumeType == null) {
                            messageAdditionalData.consumeType = "";
                        }
                        if (messageAdditionalData.coinSign == null) {
                            messageAdditionalData.coinSign = "";
                            return messageAdditionalData;
                        }
                        break;
                }
            }
            return messageAdditionalData;
        }

        public void serialize(MessageAdditionalData messageAdditionalData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = messageAdditionalData.contactInfoRequestMessageId;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = messageAdditionalData.href;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = messageAdditionalData.caller;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            String str4 = messageAdditionalData.callee;
            if (str4 != null) {
                codedOutputByteBufferNano.R(4, str4);
            }
            String str5 = messageAdditionalData.status;
            if (str5 != null) {
                codedOutputByteBufferNano.R(5, str5);
            }
            String str6 = messageAdditionalData.duration;
            if (str6 != null) {
                codedOutputByteBufferNano.R(6, str6);
            }
            NewQuestion newQuestion = messageAdditionalData.newQuestion;
            if (newQuestion != null) {
                codedOutputByteBufferNano.K(7, newQuestion, NewQuestion.PROTOBUF_ADAPTER);
            }
            NewQuestionAnswer newQuestionAnswer = messageAdditionalData.newQuestionAnswer;
            if (newQuestionAnswer != null) {
                codedOutputByteBufferNano.K(8, newQuestionAnswer, NewQuestionAnswer.PROTOBUF_ADAPTER);
            }
            List<QuestionResult> list = messageAdditionalData.questionResult;
            if (list != null) {
                codedOutputByteBufferNano.K(9, list, QuestionResult.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            IceBreakingQuestion iceBreakingQuestion = messageAdditionalData.iceBreakingQuestion;
            if (iceBreakingQuestion != null) {
                codedOutputByteBufferNano.K(10, iceBreakingQuestion, IceBreakingQuestion.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.A(11, messageAdditionalData.forceSend);
            String str7 = messageAdditionalData.consumeType;
            if (str7 != null) {
                codedOutputByteBufferNano.R(12, str7);
            }
            String str8 = messageAdditionalData.coinSign;
            if (str8 != null) {
                codedOutputByteBufferNano.R(13, str8);
            }
            MessageContact messageContact = messageAdditionalData.contact;
            if (messageContact != null) {
                codedOutputByteBufferNano.K(14, messageContact, MessageContact.PROTOBUF_ADAPTER);
            }
            OneSideNoMatchMessage oneSideNoMatchMessage = messageAdditionalData.oneSideNoMatch;
            if (oneSideNoMatchMessage != null) {
                codedOutputByteBufferNano.K(15, oneSideNoMatchMessage, OneSideNoMatchMessage.PROTOBUF_ADAPTER);
            }
            MessageMusic messageMusic = messageAdditionalData.song;
            if (messageMusic != null) {
                codedOutputByteBufferNano.K(16, messageMusic, MessageMusic.PROTOBUF_ADAPTER);
            }
            ConversationNotification conversationNotification = messageAdditionalData.conversationNotification;
            if (conversationNotification != null) {
                codedOutputByteBufferNano.K(17, conversationNotification, ConversationNotification.PROTOBUF_ADAPTER);
            }
            ChatGiftInfo chatGiftInfo = messageAdditionalData.chatGiftInfo;
            if (chatGiftInfo != null) {
                codedOutputByteBufferNano.K(18, chatGiftInfo, ChatGiftInfo.PROTOBUF_ADAPTER);
            }
            ChatGiftInfo chatGiftInfo2 = messageAdditionalData.momentGiftInfo;
            if (chatGiftInfo2 != null) {
                codedOutputByteBufferNano.K(19, chatGiftInfo2, ChatGiftInfo.PROTOBUF_ADAPTER);
            }
            GroupInvitation groupInvitation = messageAdditionalData.groupInvitation;
            if (groupInvitation != null) {
                codedOutputByteBufferNano.K(20, groupInvitation, GroupInvitation.PROTOBUF_ADAPTER);
            }
            KnowMyselfShareMessageAdditional knowMyselfShareMessageAdditional = messageAdditionalData.understandShare;
            if (knowMyselfShareMessageAdditional != null) {
                codedOutputByteBufferNano.K(21, knowMyselfShareMessageAdditional, KnowMyselfShareMessageAdditional.PROTOBUF_ADAPTER);
            }
            List<BreakIce> list2 = messageAdditionalData.localBreakIce;
            if (list2 != null) {
                codedOutputByteBufferNano.K(22, list2, BreakIce.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            WoodenFishHint woodenFishHint = messageAdditionalData.woodenFishHint;
            if (woodenFishHint != null) {
                codedOutputByteBufferNano.K(23, woodenFishHint, WoodenFishHint.PROTOBUF_ADAPTER);
            }
            ExchangePicture exchangePicture = messageAdditionalData.exchangePicture;
            if (exchangePicture != null) {
                codedOutputByteBufferNano.K(24, exchangePicture, ExchangePicture.PROTOBUF_ADAPTER);
            }
            List<ChatAssistantQuestion> list3 = messageAdditionalData.chatAssistantQuestions;
            if (list3 != null) {
                codedOutputByteBufferNano.K(25, list3, ChatAssistantQuestion.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            FemaleUnreplyReminder femaleUnreplyReminder = messageAdditionalData.femaleUnreplyReminder;
            if (femaleUnreplyReminder != null) {
                codedOutputByteBufferNano.K(26, femaleUnreplyReminder, FemaleUnreplyReminder.PROTOBUF_ADAPTER);
            }
            ChatTips chatTips = messageAdditionalData.twoSidesDifferentTip;
            if (chatTips != null) {
                codedOutputByteBufferNano.K(27, chatTips, ChatTips.PROTOBUF_ADAPTER);
            }
            AiPicture aiPicture = messageAdditionalData.aiPicture;
            if (aiPicture != null) {
                codedOutputByteBufferNano.K(28, aiPicture, AiPicture.PROTOBUF_ADAPTER);
            }
            HarassAlertInfo harassAlertInfo = messageAdditionalData.harassAlertInfo;
            if (harassAlertInfo != null) {
                codedOutputByteBufferNano.K(29, harassAlertInfo, HarassAlertInfo.PROTOBUF_ADAPTER);
            }
            ContinuousChatTip continuousChatTip = messageAdditionalData.continuousChatTip;
            if (continuousChatTip != null) {
                codedOutputByteBufferNano.K(30, continuousChatTip, ContinuousChatTip.PROTOBUF_ADAPTER);
            }
            SystemReminder systemReminder = messageAdditionalData.systemReminder;
            if (systemReminder != null) {
                codedOutputByteBufferNano.K(31, systemReminder, SystemReminder.PROTOBUF_ADAPTER);
            }
            LimitTimePicture limitTimePicture = messageAdditionalData.limitTimePicture;
            if (limitTimePicture != null) {
                codedOutputByteBufferNano.K(32, limitTimePicture, LimitTimePicture.PROTOBUF_ADAPTER);
            }
            CommonTipBox commonTipBox = messageAdditionalData.commonTipBox;
            if (commonTipBox != null) {
                codedOutputByteBufferNano.K(33, commonTipBox, CommonTipBox.PROTOBUF_ADAPTER);
            }
            Questionnaire questionnaire = messageAdditionalData.localUXQuestionnaire;
            if (questionnaire != null) {
                codedOutputByteBufferNano.K(34, questionnaire, Questionnaire.PROTOBUF_ADAPTER);
            }
            LoveLetterMessageInfo loveLetterMessageInfo = messageAdditionalData.loveLetterInfo;
            if (loveLetterMessageInfo != null) {
                codedOutputByteBufferNano.K(35, loveLetterMessageInfo, LoveLetterMessageInfo.PROTOBUF_ADAPTER);
            }
            IceBreakingQA iceBreakingQA = messageAdditionalData.iceBreakingQA;
            if (iceBreakingQA != null) {
                codedOutputByteBufferNano.K(36, iceBreakingQA, IceBreakingQA.PROTOBUF_ADAPTER);
            }
            PrologueMessageAdditional prologueMessageAdditional = messageAdditionalData.prologue;
            if (prologueMessageAdditional != null) {
                codedOutputByteBufferNano.K(37, prologueMessageAdditional, PrologueMessageAdditional.PROTOBUF_ADAPTER);
            }
            String str9 = messageAdditionalData.aiChatGuideType;
            if (str9 != null) {
                codedOutputByteBufferNano.R(38, str9);
            }
            MessageAdditionalDataCompliment messageAdditionalDataCompliment = messageAdditionalData.compliment;
            if (messageAdditionalDataCompliment != null) {
                codedOutputByteBufferNano.K(39, messageAdditionalDataCompliment, MessageAdditionalDataCompliment.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<MessageAdditionalData> JSON_ADAPTER = new ObjectJsonAdapter<MessageAdditionalData>() { // from class: com.p1.mobile.putong.core.data.MessageAdditionalData.2
        public Class getDataClass() {
            return MessageAdditionalData.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public MessageAdditionalData m14165newInstance() {
            return new MessageAdditionalData();
        }

        public boolean parseField(MessageAdditionalData messageAdditionalData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "iceBreakingQuestion":
                    messageAdditionalData.iceBreakingQuestion = (IceBreakingQuestion) IceBreakingQuestion.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "systemReminder":
                    messageAdditionalData.systemReminder = (SystemReminder) SystemReminder.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "duration":
                    messageAdditionalData.duration = jsonParser.getValueAsString();
                    return true;
                case "groupInvitation":
                    messageAdditionalData.groupInvitation = (GroupInvitation) GroupInvitation.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "newQuestionAnswer":
                    messageAdditionalData.newQuestionAnswer = (NewQuestionAnswer) NewQuestionAnswer.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "twoSidesDifferentTip":
                    messageAdditionalData.twoSidesDifferentTip = (ChatTips) ChatTips.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "chatAssistantQuestions":
                    messageAdditionalData.chatAssistantQuestions = JsonAdapter.parseArray(jsonParser, ChatAssistantQuestion.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "contactInfoRequestMessageId":
                    messageAdditionalData.contactInfoRequestMessageId = jsonParser.getValueAsString();
                    return true;
                case "callee":
                    messageAdditionalData.callee = jsonParser.getValueAsString();
                    return true;
                case "caller":
                    messageAdditionalData.caller = jsonParser.getValueAsString();
                    return true;
                case "oneSideNoMatch":
                    messageAdditionalData.oneSideNoMatch = (OneSideNoMatchMessage) OneSideNoMatchMessage.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "conversationNotification":
                    messageAdditionalData.conversationNotification = (ConversationNotification) ConversationNotification.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "loveLetterInfo":
                    messageAdditionalData.loveLetterInfo = (LoveLetterMessageInfo) LoveLetterMessageInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "prologue":
                    messageAdditionalData.prologue = (PrologueMessageAdditional) PrologueMessageAdditional.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "femaleUnreplyReminder":
                    messageAdditionalData.femaleUnreplyReminder = (FemaleUnreplyReminder) FemaleUnreplyReminder.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "status":
                    messageAdditionalData.status = jsonParser.getValueAsString();
                    return true;
                case "consumeType":
                    messageAdditionalData.consumeType = jsonParser.getValueAsString();
                    return true;
                case "coinSign":
                    messageAdditionalData.coinSign = jsonParser.getValueAsString();
                    return true;
                case "compliment":
                    messageAdditionalData.compliment = (MessageAdditionalDataCompliment) MessageAdditionalDataCompliment.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "woodenFishHint":
                    messageAdditionalData.woodenFishHint = (WoodenFishHint) WoodenFishHint.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "limitTimePicture":
                    messageAdditionalData.limitTimePicture = (LimitTimePicture) LimitTimePicture.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "exchangePicture":
                    messageAdditionalData.exchangePicture = (ExchangePicture) ExchangePicture.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "harassAlertInfo":
                    messageAdditionalData.harassAlertInfo = (HarassAlertInfo) HarassAlertInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "momentGiftInfo":
                    messageAdditionalData.momentGiftInfo = (ChatGiftInfo) ChatGiftInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "href":
                    messageAdditionalData.href = jsonParser.getValueAsString();
                    return true;
                case "song":
                    messageAdditionalData.song = (MessageMusic) MessageMusic.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "newQuestion":
                    messageAdditionalData.newQuestion = (NewQuestion) NewQuestion.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "commonTipBox":
                    messageAdditionalData.commonTipBox = (CommonTipBox) CommonTipBox.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "aiPicture":
                    messageAdditionalData.aiPicture = (AiPicture) AiPicture.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "continuousChatTip":
                    messageAdditionalData.continuousChatTip = (ContinuousChatTip) ContinuousChatTip.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "localUXQuestionnaire":
                    messageAdditionalData.localUXQuestionnaire = (Questionnaire) Questionnaire.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "contact":
                    messageAdditionalData.contact = (MessageContact) MessageContact.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "iceBreakingQA":
                    messageAdditionalData.iceBreakingQA = (IceBreakingQA) IceBreakingQA.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "understandShare":
                    messageAdditionalData.understandShare = (KnowMyselfShareMessageAdditional) KnowMyselfShareMessageAdditional.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "aiChatGuideType":
                    messageAdditionalData.aiChatGuideType = jsonParser.getValueAsString();
                    return true;
                case "forceSend":
                    messageAdditionalData.forceSend = jsonParser.getValueAsBoolean();
                    return true;
                case "iceBreakQuestionID":
                    messageAdditionalData.iceBreakQuestionID = jsonParser.getValueAsString();
                    return true;
                case "chatGiftInfo":
                    messageAdditionalData.chatGiftInfo = (ChatGiftInfo) ChatGiftInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "questionResult":
                    messageAdditionalData.questionResult = JsonAdapter.parseArray(jsonParser, QuestionResult.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(MessageAdditionalData messageAdditionalData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "iceBreakingQuestion":
                case "systemReminder":
                case "duration":
                case "groupInvitation":
                case "newQuestionAnswer":
                case "twoSidesDifferentTip":
                case "chatAssistantQuestions":
                case "contactInfoRequestMessageId":
                case "callee":
                case "caller":
                case "oneSideNoMatch":
                case "conversationNotification":
                case "loveLetterInfo":
                case "prologue":
                case "femaleUnreplyReminder":
                case "status":
                case "consumeType":
                case "coinSign":
                case "compliment":
                case "woodenFishHint":
                case "limitTimePicture":
                case "exchangePicture":
                case "harassAlertInfo":
                case "momentGiftInfo":
                case "href":
                case "song":
                case "newQuestion":
                case "commonTipBox":
                case "aiPicture":
                case "continuousChatTip":
                case "localUXQuestionnaire":
                case "contact":
                case "iceBreakingQA":
                case "understandShare":
                case "aiChatGuideType":
                case "forceSend":
                case "iceBreakQuestionID":
                case "chatGiftInfo":
                case "questionResult":
                    return true;
                default:
                    return super.parseFieldCheck(messageAdditionalData, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(MessageAdditionalData messageAdditionalData, JsonGenerator jsonGenerator) throws IOException {
            String str = messageAdditionalData.contactInfoRequestMessageId;
            if (str != null) {
                jsonGenerator.writeStringField("contactInfoRequestMessageId", str);
            }
            String str2 = messageAdditionalData.href;
            if (str2 != null) {
                jsonGenerator.writeStringField("href", str2);
            }
            String str3 = messageAdditionalData.caller;
            if (str3 != null) {
                jsonGenerator.writeStringField("caller", str3);
            }
            String str4 = messageAdditionalData.callee;
            if (str4 != null) {
                jsonGenerator.writeStringField("callee", str4);
            }
            String str5 = messageAdditionalData.status;
            if (str5 != null) {
                jsonGenerator.writeStringField("status", str5);
            }
            String str6 = messageAdditionalData.duration;
            if (str6 != null) {
                jsonGenerator.writeStringField("duration", str6);
            }
            if (messageAdditionalData.newQuestion != null) {
                jsonGenerator.writeFieldName("newQuestion");
                NewQuestion.JSON_ADAPTER.serialize(messageAdditionalData.newQuestion, jsonGenerator, true);
            }
            if (messageAdditionalData.newQuestionAnswer != null) {
                jsonGenerator.writeFieldName("newQuestionAnswer");
                NewQuestionAnswer.JSON_ADAPTER.serialize(messageAdditionalData.newQuestionAnswer, jsonGenerator, true);
            }
            if (messageAdditionalData.questionResult != null) {
                jsonGenerator.writeFieldName("questionResult");
                JsonAdapter.serializeArray(messageAdditionalData.questionResult, jsonGenerator, QuestionResult.JSON_ADAPTER);
            }
            if (messageAdditionalData.iceBreakingQuestion != null) {
                jsonGenerator.writeFieldName("iceBreakingQuestion");
                IceBreakingQuestion.JSON_ADAPTER.serialize(messageAdditionalData.iceBreakingQuestion, jsonGenerator, true);
            }
            jsonGenerator.writeBooleanField("forceSend", messageAdditionalData.forceSend);
            String str7 = messageAdditionalData.consumeType;
            if (str7 != null) {
                jsonGenerator.writeStringField("consumeType", str7);
            }
            String str8 = messageAdditionalData.coinSign;
            if (str8 != null) {
                jsonGenerator.writeStringField("coinSign", str8);
            }
            if (messageAdditionalData.contact != null) {
                jsonGenerator.writeFieldName("contact");
                MessageContact.JSON_ADAPTER.serialize(messageAdditionalData.contact, jsonGenerator, true);
            }
            if (messageAdditionalData.oneSideNoMatch != null) {
                jsonGenerator.writeFieldName("oneSideNoMatch");
                OneSideNoMatchMessage.JSON_ADAPTER.serialize(messageAdditionalData.oneSideNoMatch, jsonGenerator, true);
            }
            if (messageAdditionalData.song != null) {
                jsonGenerator.writeFieldName(MessageType.song);
                MessageMusic.JSON_ADAPTER.serialize(messageAdditionalData.song, jsonGenerator, true);
            }
            if (messageAdditionalData.conversationNotification != null) {
                jsonGenerator.writeFieldName("conversationNotification");
                ConversationNotification.JSON_ADAPTER.serialize(messageAdditionalData.conversationNotification, jsonGenerator, true);
            }
            if (messageAdditionalData.chatGiftInfo != null) {
                jsonGenerator.writeFieldName("chatGiftInfo");
                ChatGiftInfo.JSON_ADAPTER.serialize(messageAdditionalData.chatGiftInfo, jsonGenerator, true);
            }
            if (messageAdditionalData.momentGiftInfo != null) {
                jsonGenerator.writeFieldName("momentGiftInfo");
                ChatGiftInfo.JSON_ADAPTER.serialize(messageAdditionalData.momentGiftInfo, jsonGenerator, true);
            }
            if (messageAdditionalData.groupInvitation != null) {
                jsonGenerator.writeFieldName("groupInvitation");
                GroupInvitation.JSON_ADAPTER.serialize(messageAdditionalData.groupInvitation, jsonGenerator, true);
            }
            if (messageAdditionalData.understandShare != null) {
                jsonGenerator.writeFieldName("understandShare");
                KnowMyselfShareMessageAdditional.JSON_ADAPTER.serialize(messageAdditionalData.understandShare, jsonGenerator, true);
            }
            if (messageAdditionalData.woodenFishHint != null) {
                jsonGenerator.writeFieldName("woodenFishHint");
                WoodenFishHint.JSON_ADAPTER.serialize(messageAdditionalData.woodenFishHint, jsonGenerator, true);
            }
            if (messageAdditionalData.exchangePicture != null) {
                jsonGenerator.writeFieldName("exchangePicture");
                ExchangePicture.JSON_ADAPTER.serialize(messageAdditionalData.exchangePicture, jsonGenerator, true);
            }
            if (messageAdditionalData.chatAssistantQuestions != null) {
                jsonGenerator.writeFieldName("chatAssistantQuestions");
                JsonAdapter.serializeArray(messageAdditionalData.chatAssistantQuestions, jsonGenerator, ChatAssistantQuestion.JSON_ADAPTER);
            }
            if (messageAdditionalData.twoSidesDifferentTip != null) {
                jsonGenerator.writeFieldName("twoSidesDifferentTip");
                ChatTips.JSON_ADAPTER.serialize(messageAdditionalData.twoSidesDifferentTip, jsonGenerator, true);
            }
            if (messageAdditionalData.femaleUnreplyReminder != null) {
                jsonGenerator.writeFieldName("femaleUnreplyReminder");
                FemaleUnreplyReminder.JSON_ADAPTER.serialize(messageAdditionalData.femaleUnreplyReminder, jsonGenerator, true);
            }
            if (messageAdditionalData.aiPicture != null) {
                jsonGenerator.writeFieldName("aiPicture");
                AiPicture.JSON_ADAPTER.serialize(messageAdditionalData.aiPicture, jsonGenerator, true);
            }
            if (messageAdditionalData.harassAlertInfo != null) {
                jsonGenerator.writeFieldName("harassAlertInfo");
                HarassAlertInfo.JSON_ADAPTER.serialize(messageAdditionalData.harassAlertInfo, jsonGenerator, true);
            }
            if (messageAdditionalData.continuousChatTip != null) {
                jsonGenerator.writeFieldName("continuousChatTip");
                ContinuousChatTip.JSON_ADAPTER.serialize(messageAdditionalData.continuousChatTip, jsonGenerator, true);
            }
            if (messageAdditionalData.systemReminder != null) {
                jsonGenerator.writeFieldName("systemReminder");
                SystemReminder.JSON_ADAPTER.serialize(messageAdditionalData.systemReminder, jsonGenerator, true);
            }
            if (messageAdditionalData.limitTimePicture != null) {
                jsonGenerator.writeFieldName("limitTimePicture");
                LimitTimePicture.JSON_ADAPTER.serialize(messageAdditionalData.limitTimePicture, jsonGenerator, true);
            }
            if (messageAdditionalData.commonTipBox != null) {
                jsonGenerator.writeFieldName("commonTipBox");
                CommonTipBox.JSON_ADAPTER.serialize(messageAdditionalData.commonTipBox, jsonGenerator, true);
            }
            String str9 = messageAdditionalData.iceBreakQuestionID;
            if (str9 != null) {
                jsonGenerator.writeStringField("iceBreakQuestionID", str9);
            }
            if (messageAdditionalData.localUXQuestionnaire != null) {
                jsonGenerator.writeFieldName("localUXQuestionnaire");
                Questionnaire.JSON_ADAPTER.serialize(messageAdditionalData.localUXQuestionnaire, jsonGenerator, true);
            }
            if (messageAdditionalData.loveLetterInfo != null) {
                jsonGenerator.writeFieldName("loveLetterInfo");
                LoveLetterMessageInfo.JSON_ADAPTER.serialize(messageAdditionalData.loveLetterInfo, jsonGenerator, true);
            }
            if (messageAdditionalData.iceBreakingQA != null) {
                jsonGenerator.writeFieldName("iceBreakingQA");
                IceBreakingQA.JSON_ADAPTER.serialize(messageAdditionalData.iceBreakingQA, jsonGenerator, true);
            }
            if (messageAdditionalData.prologue != null) {
                jsonGenerator.writeFieldName("prologue");
                PrologueMessageAdditional.JSON_ADAPTER.serialize(messageAdditionalData.prologue, jsonGenerator, true);
            }
            String str10 = messageAdditionalData.aiChatGuideType;
            if (str10 != null) {
                jsonGenerator.writeStringField("aiChatGuideType", str10);
            }
            if (messageAdditionalData.compliment != null) {
                jsonGenerator.writeFieldName("compliment");
                MessageAdditionalDataCompliment.JSON_ADAPTER.serialize(messageAdditionalData.compliment, jsonGenerator, true);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MessageAdditionalData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MessageAdditionalData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MessageAdditionalData new_() {
        MessageAdditionalData messageAdditionalData = new MessageAdditionalData();
        messageAdditionalData.nullCheck();
        return messageAdditionalData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public MessageAdditionalData m14163clone() {
        MessageAdditionalData messageAdditionalData = new MessageAdditionalData();
        messageAdditionalData.contactInfoRequestMessageId = this.contactInfoRequestMessageId;
        messageAdditionalData.href = this.href;
        messageAdditionalData.caller = this.caller;
        messageAdditionalData.callee = this.callee;
        messageAdditionalData.status = this.status;
        messageAdditionalData.duration = this.duration;
        NewQuestion newQuestion = this.newQuestion;
        if (newQuestion != null) {
            messageAdditionalData.newQuestion = newQuestion.m14530clone();
        }
        NewQuestionAnswer newQuestionAnswer = this.newQuestionAnswer;
        if (newQuestionAnswer != null) {
            messageAdditionalData.newQuestionAnswer = newQuestionAnswer.m14534clone();
        }
        List<QuestionResult> list = this.questionResult;
        if (list != null) {
            messageAdditionalData.questionResult = ValueObject.util_map(list, new w9j() { // from class: l.lny
                public final Object call(Object obj) {
                    return ((QuestionResult) obj).m15124clone();
                }
            });
        }
        IceBreakingQuestion iceBreakingQuestion = this.iceBreakingQuestion;
        if (iceBreakingQuestion != null) {
            messageAdditionalData.iceBreakingQuestion = iceBreakingQuestion.m13400clone();
        }
        messageAdditionalData.forceSend = this.forceSend;
        messageAdditionalData.consumeType = this.consumeType;
        messageAdditionalData.coinSign = this.coinSign;
        MessageContact messageContact = this.contact;
        if (messageContact != null) {
            messageAdditionalData.contact = messageContact.m14184clone();
        }
        OneSideNoMatchMessage oneSideNoMatchMessage = this.oneSideNoMatch;
        if (oneSideNoMatchMessage != null) {
            messageAdditionalData.oneSideNoMatch = oneSideNoMatchMessage.m14660clone();
        }
        MessageMusic messageMusic = this.song;
        if (messageMusic != null) {
            messageAdditionalData.song = messageMusic.m14236clone();
        }
        ConversationNotification conversationNotification = this.conversationNotification;
        if (conversationNotification != null) {
            messageAdditionalData.conversationNotification = conversationNotification.m12400clone();
        }
        ChatGiftInfo chatGiftInfo = this.chatGiftInfo;
        if (chatGiftInfo != null) {
            messageAdditionalData.chatGiftInfo = chatGiftInfo.m12006clone();
        }
        ChatGiftInfo chatGiftInfo2 = this.momentGiftInfo;
        if (chatGiftInfo2 != null) {
            messageAdditionalData.momentGiftInfo = chatGiftInfo2.m12006clone();
        }
        GroupInvitation groupInvitation = this.groupInvitation;
        if (groupInvitation != null) {
            messageAdditionalData.groupInvitation = groupInvitation.m13090clone();
        }
        KnowMyselfShareMessageAdditional knowMyselfShareMessageAdditional = this.understandShare;
        if (knowMyselfShareMessageAdditional != null) {
            messageAdditionalData.understandShare = knowMyselfShareMessageAdditional.m13780clone();
        }
        List<BreakIce> list2 = this.localBreakIce;
        if (list2 != null) {
            messageAdditionalData.localBreakIce = ValueObject.util_map(list2, new w9j() { // from class: l.mny
                public final Object call(Object obj) {
                    return ((BreakIce) obj).m11814clone();
                }
            });
        }
        WoodenFishHint woodenFishHint = this.woodenFishHint;
        if (woodenFishHint != null) {
            messageAdditionalData.woodenFishHint = woodenFishHint.m16344clone();
        }
        ExchangePicture exchangePicture = this.exchangePicture;
        if (exchangePicture != null) {
            messageAdditionalData.exchangePicture = exchangePicture.m12664clone();
        }
        List<ChatAssistantQuestion> list3 = this.chatAssistantQuestions;
        if (list3 != null) {
            messageAdditionalData.chatAssistantQuestions = ValueObject.util_map(list3, new w9j() { // from class: l.nny
                public final Object call(Object obj) {
                    return ((ChatAssistantQuestion) obj).m11972clone();
                }
            });
        }
        ChatTips chatTips = this.twoSidesDifferentTip;
        if (chatTips != null) {
            messageAdditionalData.twoSidesDifferentTip = chatTips.m12156clone();
        }
        FemaleUnreplyReminder femaleUnreplyReminder = this.femaleUnreplyReminder;
        if (femaleUnreplyReminder != null) {
            messageAdditionalData.femaleUnreplyReminder = femaleUnreplyReminder.m12762clone();
        }
        AiPicture aiPicture = this.aiPicture;
        if (aiPicture != null) {
            messageAdditionalData.aiPicture = aiPicture.m11604clone();
        }
        HarassAlertInfo harassAlertInfo = this.harassAlertInfo;
        if (harassAlertInfo != null) {
            messageAdditionalData.harassAlertInfo = harassAlertInfo.m13222clone();
        }
        ContinuousChatTip continuousChatTip = this.continuousChatTip;
        if (continuousChatTip != null) {
            messageAdditionalData.continuousChatTip = continuousChatTip.m12276clone();
        }
        SystemReminder systemReminder = this.systemReminder;
        if (systemReminder != null) {
            messageAdditionalData.systemReminder = systemReminder.m15877clone();
        }
        LimitTimePicture limitTimePicture = this.limitTimePicture;
        if (limitTimePicture != null) {
            messageAdditionalData.limitTimePicture = limitTimePicture.m13900clone();
        }
        CommonTipBox commonTipBox = this.commonTipBox;
        if (commonTipBox != null) {
            messageAdditionalData.commonTipBox = commonTipBox.m12228clone();
        }
        messageAdditionalData.iceBreakQuestionID = this.iceBreakQuestionID;
        Questionnaire questionnaire = this.localUXQuestionnaire;
        if (questionnaire != null) {
            messageAdditionalData.localUXQuestionnaire = questionnaire.m15128clone();
        }
        LoveLetterMessageInfo loveLetterMessageInfo = this.loveLetterInfo;
        if (loveLetterMessageInfo != null) {
            messageAdditionalData.loveLetterInfo = loveLetterMessageInfo.m14010clone();
        }
        IceBreakingQA iceBreakingQA = this.iceBreakingQA;
        if (iceBreakingQA != null) {
            messageAdditionalData.iceBreakingQA = iceBreakingQA.m13396clone();
        }
        PrologueMessageAdditional prologueMessageAdditional = this.prologue;
        if (prologueMessageAdditional != null) {
            messageAdditionalData.prologue = prologueMessageAdditional.m15054clone();
        }
        messageAdditionalData.aiChatGuideType = this.aiChatGuideType;
        MessageAdditionalDataCompliment messageAdditionalDataCompliment = this.compliment;
        if (messageAdditionalDataCompliment != null) {
            messageAdditionalData.compliment = messageAdditionalDataCompliment.m14167clone();
        }
        return messageAdditionalData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MessageAdditionalData)) {
            return false;
        }
        MessageAdditionalData messageAdditionalData = (MessageAdditionalData) obj;
        return ValueObject.util_equals(this.contactInfoRequestMessageId, messageAdditionalData.contactInfoRequestMessageId) && ValueObject.util_equals(this.href, messageAdditionalData.href) && ValueObject.util_equals(this.caller, messageAdditionalData.caller) && ValueObject.util_equals(this.callee, messageAdditionalData.callee) && ValueObject.util_equals(this.status, messageAdditionalData.status) && ValueObject.util_equals(this.duration, messageAdditionalData.duration) && ValueObject.util_equals(this.newQuestion, messageAdditionalData.newQuestion) && ValueObject.util_equals(this.newQuestionAnswer, messageAdditionalData.newQuestionAnswer) && ValueObject.util_equals(this.questionResult, messageAdditionalData.questionResult) && ValueObject.util_equals(this.iceBreakingQuestion, messageAdditionalData.iceBreakingQuestion) && this.forceSend == messageAdditionalData.forceSend && ValueObject.util_equals(this.consumeType, messageAdditionalData.consumeType) && ValueObject.util_equals(this.coinSign, messageAdditionalData.coinSign) && ValueObject.util_equals(this.contact, messageAdditionalData.contact) && ValueObject.util_equals(this.oneSideNoMatch, messageAdditionalData.oneSideNoMatch) && ValueObject.util_equals(this.song, messageAdditionalData.song) && ValueObject.util_equals(this.conversationNotification, messageAdditionalData.conversationNotification) && ValueObject.util_equals(this.chatGiftInfo, messageAdditionalData.chatGiftInfo) && ValueObject.util_equals(this.momentGiftInfo, messageAdditionalData.momentGiftInfo) && ValueObject.util_equals(this.groupInvitation, messageAdditionalData.groupInvitation) && ValueObject.util_equals(this.understandShare, messageAdditionalData.understandShare) && ValueObject.util_equals(this.localBreakIce, messageAdditionalData.localBreakIce) && ValueObject.util_equals(this.woodenFishHint, messageAdditionalData.woodenFishHint) && ValueObject.util_equals(this.exchangePicture, messageAdditionalData.exchangePicture) && ValueObject.util_equals(this.chatAssistantQuestions, messageAdditionalData.chatAssistantQuestions) && ValueObject.util_equals(this.twoSidesDifferentTip, messageAdditionalData.twoSidesDifferentTip) && ValueObject.util_equals(this.femaleUnreplyReminder, messageAdditionalData.femaleUnreplyReminder) && ValueObject.util_equals(this.aiPicture, messageAdditionalData.aiPicture) && ValueObject.util_equals(this.harassAlertInfo, messageAdditionalData.harassAlertInfo) && ValueObject.util_equals(this.continuousChatTip, messageAdditionalData.continuousChatTip) && ValueObject.util_equals(this.systemReminder, messageAdditionalData.systemReminder) && ValueObject.util_equals(this.limitTimePicture, messageAdditionalData.limitTimePicture) && ValueObject.util_equals(this.commonTipBox, messageAdditionalData.commonTipBox) && ValueObject.util_equals(this.iceBreakQuestionID, messageAdditionalData.iceBreakQuestionID) && ValueObject.util_equals(this.localUXQuestionnaire, messageAdditionalData.localUXQuestionnaire) && ValueObject.util_equals(this.loveLetterInfo, messageAdditionalData.loveLetterInfo) && ValueObject.util_equals(this.iceBreakingQA, messageAdditionalData.iceBreakingQA) && ValueObject.util_equals(this.prologue, messageAdditionalData.prologue) && ValueObject.util_equals(this.aiChatGuideType, messageAdditionalData.aiChatGuideType) && ValueObject.util_equals(this.compliment, messageAdditionalData.compliment);
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.contactInfoRequestMessageId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.href;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.caller;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.callee;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.status;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.duration;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 41;
        NewQuestion newQuestion = this.newQuestion;
        int iHashCode7 = (iHashCode6 + (newQuestion != null ? newQuestion.hashCode() : 0)) * 41;
        NewQuestionAnswer newQuestionAnswer = this.newQuestionAnswer;
        int iHashCode8 = (iHashCode7 + (newQuestionAnswer != null ? newQuestionAnswer.hashCode() : 0)) * 41;
        List<QuestionResult> list = this.questionResult;
        int iHashCode9 = (iHashCode8 + (list != null ? list.hashCode() : 0)) * 41;
        IceBreakingQuestion iceBreakingQuestion = this.iceBreakingQuestion;
        int iHashCode10 = (((iHashCode9 + (iceBreakingQuestion != null ? iceBreakingQuestion.hashCode() : 0)) * 41) + (this.forceSend ? 1231 : 1237)) * 41;
        String str7 = this.consumeType;
        int iHashCode11 = (iHashCode10 + (str7 != null ? str7.hashCode() : 0)) * 41;
        String str8 = this.coinSign;
        int iHashCode12 = (iHashCode11 + (str8 != null ? str8.hashCode() : 0)) * 41;
        MessageContact messageContact = this.contact;
        int iHashCode13 = (iHashCode12 + (messageContact != null ? messageContact.hashCode() : 0)) * 41;
        OneSideNoMatchMessage oneSideNoMatchMessage = this.oneSideNoMatch;
        int iHashCode14 = (iHashCode13 + (oneSideNoMatchMessage != null ? oneSideNoMatchMessage.hashCode() : 0)) * 41;
        MessageMusic messageMusic = this.song;
        int iHashCode15 = (iHashCode14 + (messageMusic != null ? messageMusic.hashCode() : 0)) * 41;
        ConversationNotification conversationNotification = this.conversationNotification;
        int iHashCode16 = (iHashCode15 + (conversationNotification != null ? conversationNotification.hashCode() : 0)) * 41;
        ChatGiftInfo chatGiftInfo = this.chatGiftInfo;
        int iHashCode17 = (iHashCode16 + (chatGiftInfo != null ? chatGiftInfo.hashCode() : 0)) * 41;
        ChatGiftInfo chatGiftInfo2 = this.momentGiftInfo;
        int iHashCode18 = (iHashCode17 + (chatGiftInfo2 != null ? chatGiftInfo2.hashCode() : 0)) * 41;
        GroupInvitation groupInvitation = this.groupInvitation;
        int iHashCode19 = (iHashCode18 + (groupInvitation != null ? groupInvitation.hashCode() : 0)) * 41;
        KnowMyselfShareMessageAdditional knowMyselfShareMessageAdditional = this.understandShare;
        int iHashCode20 = (iHashCode19 + (knowMyselfShareMessageAdditional != null ? knowMyselfShareMessageAdditional.hashCode() : 0)) * 41;
        List<BreakIce> list2 = this.localBreakIce;
        int iHashCode21 = (iHashCode20 + (list2 != null ? list2.hashCode() : 0)) * 41;
        WoodenFishHint woodenFishHint = this.woodenFishHint;
        int iHashCode22 = (iHashCode21 + (woodenFishHint != null ? woodenFishHint.hashCode() : 0)) * 41;
        ExchangePicture exchangePicture = this.exchangePicture;
        int iHashCode23 = (iHashCode22 + (exchangePicture != null ? exchangePicture.hashCode() : 0)) * 41;
        List<ChatAssistantQuestion> list3 = this.chatAssistantQuestions;
        int iHashCode24 = (iHashCode23 + (list3 != null ? list3.hashCode() : 0)) * 41;
        ChatTips chatTips = this.twoSidesDifferentTip;
        int iHashCode25 = (iHashCode24 + (chatTips != null ? chatTips.hashCode() : 0)) * 41;
        FemaleUnreplyReminder femaleUnreplyReminder = this.femaleUnreplyReminder;
        int iHashCode26 = (iHashCode25 + (femaleUnreplyReminder != null ? femaleUnreplyReminder.hashCode() : 0)) * 41;
        AiPicture aiPicture = this.aiPicture;
        int iHashCode27 = (iHashCode26 + (aiPicture != null ? aiPicture.hashCode() : 0)) * 41;
        HarassAlertInfo harassAlertInfo = this.harassAlertInfo;
        int iHashCode28 = (iHashCode27 + (harassAlertInfo != null ? harassAlertInfo.hashCode() : 0)) * 41;
        ContinuousChatTip continuousChatTip = this.continuousChatTip;
        int iHashCode29 = (iHashCode28 + (continuousChatTip != null ? continuousChatTip.hashCode() : 0)) * 41;
        SystemReminder systemReminder = this.systemReminder;
        int iHashCode30 = (iHashCode29 + (systemReminder != null ? systemReminder.hashCode() : 0)) * 41;
        LimitTimePicture limitTimePicture = this.limitTimePicture;
        int iHashCode31 = (iHashCode30 + (limitTimePicture != null ? limitTimePicture.hashCode() : 0)) * 41;
        CommonTipBox commonTipBox = this.commonTipBox;
        int iHashCode32 = (iHashCode31 + (commonTipBox != null ? commonTipBox.hashCode() : 0)) * 41;
        String str9 = this.iceBreakQuestionID;
        int iHashCode33 = (iHashCode32 + (str9 != null ? str9.hashCode() : 0)) * 41;
        Questionnaire questionnaire = this.localUXQuestionnaire;
        int iHashCode34 = (iHashCode33 + (questionnaire != null ? questionnaire.hashCode() : 0)) * 41;
        LoveLetterMessageInfo loveLetterMessageInfo = this.loveLetterInfo;
        int iHashCode35 = (iHashCode34 + (loveLetterMessageInfo != null ? loveLetterMessageInfo.hashCode() : 0)) * 41;
        IceBreakingQA iceBreakingQA = this.iceBreakingQA;
        int iHashCode36 = (iHashCode35 + (iceBreakingQA != null ? iceBreakingQA.hashCode() : 0)) * 41;
        PrologueMessageAdditional prologueMessageAdditional = this.prologue;
        int iHashCode37 = (iHashCode36 + (prologueMessageAdditional != null ? prologueMessageAdditional.hashCode() : 0)) * 41;
        String str10 = this.aiChatGuideType;
        int iHashCode38 = (iHashCode37 + (str10 != null ? str10.hashCode() : 0)) * 41;
        MessageAdditionalDataCompliment messageAdditionalDataCompliment = this.compliment;
        int iHashCode39 = iHashCode38 + (messageAdditionalDataCompliment != null ? messageAdditionalDataCompliment.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode39;
        return iHashCode39;
    }

    public void nullCheck() {
        if (this.contactInfoRequestMessageId == null) {
            this.contactInfoRequestMessageId = "";
        }
        if (this.href == null) {
            this.href = "";
        }
        if (this.consumeType == null) {
            this.consumeType = "";
        }
        if (this.coinSign == null) {
            this.coinSign = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
