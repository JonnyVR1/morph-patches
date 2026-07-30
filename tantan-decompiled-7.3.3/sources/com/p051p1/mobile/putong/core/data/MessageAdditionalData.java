package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.BreakIce;
import com.p051p1.mobile.putong.core.data.ChatAssistantQuestion;
import com.p051p1.mobile.putong.core.data.QuestionResult;
import com.p051p1.mobile.putong.data.Contact;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.p051p1.mobile.putong.live.base.data.BLiveRole;
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
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.asn1.eac.EACTags;
import org.spongycastle.crypto.tls.CipherSuite;
import org.spongycastle.math.p135ec.Tnaf;
import p153l.nc5;
import p153l.qcj;

/* JADX INFO: loaded from: classes10.dex */
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
    @ProtobufIndex(index = 3)
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
    @ProtobufIndex(index = 2)
    public String href;

    @Nullable
    public String iceBreakQuestionID;

    @Nullable
    @ProtobufIndex(index = 36)
    public IceBreakingQA iceBreakingQA;

    @Nullable
    @ProtobufIndex(index = 10)
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
    @ProtobufIndex(index = 5)
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
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(MessageAdditionalData messageAdditionalData) {
            String str = messageAdditionalData.contactInfoRequestMessageId;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = messageAdditionalData.href;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            String str3 = messageAdditionalData.caller;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str3);
            }
            String str4 = messageAdditionalData.callee;
            if (str4 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(4, str4);
            }
            String str5 = messageAdditionalData.status;
            if (str5 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(5, str5);
            }
            String str6 = messageAdditionalData.duration;
            if (str6 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(6, str6);
            }
            NewQuestion newQuestion = messageAdditionalData.newQuestion;
            if (newQuestion != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(7, newQuestion, NewQuestion.PROTOBUF_ADAPTER);
            }
            NewQuestionAnswer newQuestionAnswer = messageAdditionalData.newQuestionAnswer;
            if (newQuestionAnswer != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(8, newQuestionAnswer, NewQuestionAnswer.PROTOBUF_ADAPTER);
            }
            List<QuestionResult> list = messageAdditionalData.questionResult;
            if (list != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(9, list, QuestionResult.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            IceBreakingQuestion iceBreakingQuestion = messageAdditionalData.iceBreakingQuestion;
            if (iceBreakingQuestion != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(10, iceBreakingQuestion, IceBreakingQuestion.PROTOBUF_ADAPTER);
            }
            int iM17275b = iM17288o + CodedOutputByteBufferNano.m17275b(11, messageAdditionalData.forceSend);
            String str7 = messageAdditionalData.consumeType;
            if (str7 != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(12, str7);
            }
            String str8 = messageAdditionalData.coinSign;
            if (str8 != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(13, str8);
            }
            MessageContact messageContact = messageAdditionalData.contact;
            if (messageContact != null) {
                iM17275b += CodedOutputByteBufferNano.m17285l(14, messageContact, MessageContact.PROTOBUF_ADAPTER);
            }
            OneSideNoMatchMessage oneSideNoMatchMessage = messageAdditionalData.oneSideNoMatch;
            if (oneSideNoMatchMessage != null) {
                iM17275b += CodedOutputByteBufferNano.m17285l(15, oneSideNoMatchMessage, OneSideNoMatchMessage.PROTOBUF_ADAPTER);
            }
            MessageMusic messageMusic = messageAdditionalData.song;
            if (messageMusic != null) {
                iM17275b += CodedOutputByteBufferNano.m17285l(16, messageMusic, MessageMusic.PROTOBUF_ADAPTER);
            }
            ConversationNotification conversationNotification = messageAdditionalData.conversationNotification;
            if (conversationNotification != null) {
                iM17275b += CodedOutputByteBufferNano.m17285l(17, conversationNotification, ConversationNotification.PROTOBUF_ADAPTER);
            }
            ChatGiftInfo chatGiftInfo = messageAdditionalData.chatGiftInfo;
            if (chatGiftInfo != null) {
                iM17275b += CodedOutputByteBufferNano.m17285l(18, chatGiftInfo, ChatGiftInfo.PROTOBUF_ADAPTER);
            }
            ChatGiftInfo chatGiftInfo2 = messageAdditionalData.momentGiftInfo;
            if (chatGiftInfo2 != null) {
                iM17275b += CodedOutputByteBufferNano.m17285l(19, chatGiftInfo2, ChatGiftInfo.PROTOBUF_ADAPTER);
            }
            GroupInvitation groupInvitation = messageAdditionalData.groupInvitation;
            if (groupInvitation != null) {
                iM17275b += CodedOutputByteBufferNano.m17285l(20, groupInvitation, GroupInvitation.PROTOBUF_ADAPTER);
            }
            KnowMyselfShareMessageAdditional knowMyselfShareMessageAdditional = messageAdditionalData.understandShare;
            if (knowMyselfShareMessageAdditional != null) {
                iM17275b += CodedOutputByteBufferNano.m17285l(21, knowMyselfShareMessageAdditional, KnowMyselfShareMessageAdditional.PROTOBUF_ADAPTER);
            }
            List<BreakIce> list2 = messageAdditionalData.localBreakIce;
            if (list2 != null) {
                iM17275b += CodedOutputByteBufferNano.m17285l(22, list2, BreakIce.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            WoodenFishHint woodenFishHint = messageAdditionalData.woodenFishHint;
            if (woodenFishHint != null) {
                iM17275b += CodedOutputByteBufferNano.m17285l(23, woodenFishHint, WoodenFishHint.PROTOBUF_ADAPTER);
            }
            ExchangePicture exchangePicture = messageAdditionalData.exchangePicture;
            if (exchangePicture != null) {
                iM17275b += CodedOutputByteBufferNano.m17285l(24, exchangePicture, ExchangePicture.PROTOBUF_ADAPTER);
            }
            List<ChatAssistantQuestion> list3 = messageAdditionalData.chatAssistantQuestions;
            if (list3 != null) {
                iM17275b += CodedOutputByteBufferNano.m17285l(25, list3, ChatAssistantQuestion.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            FemaleUnreplyReminder femaleUnreplyReminder = messageAdditionalData.femaleUnreplyReminder;
            if (femaleUnreplyReminder != null) {
                iM17275b += CodedOutputByteBufferNano.m17285l(26, femaleUnreplyReminder, FemaleUnreplyReminder.PROTOBUF_ADAPTER);
            }
            ChatTips chatTips = messageAdditionalData.twoSidesDifferentTip;
            if (chatTips != null) {
                iM17275b += CodedOutputByteBufferNano.m17285l(27, chatTips, ChatTips.PROTOBUF_ADAPTER);
            }
            AiPicture aiPicture = messageAdditionalData.aiPicture;
            if (aiPicture != null) {
                iM17275b += CodedOutputByteBufferNano.m17285l(28, aiPicture, AiPicture.PROTOBUF_ADAPTER);
            }
            HarassAlertInfo harassAlertInfo = messageAdditionalData.harassAlertInfo;
            if (harassAlertInfo != null) {
                iM17275b += CodedOutputByteBufferNano.m17285l(29, harassAlertInfo, HarassAlertInfo.PROTOBUF_ADAPTER);
            }
            ContinuousChatTip continuousChatTip = messageAdditionalData.continuousChatTip;
            if (continuousChatTip != null) {
                iM17275b += CodedOutputByteBufferNano.m17285l(30, continuousChatTip, ContinuousChatTip.PROTOBUF_ADAPTER);
            }
            SystemReminder systemReminder = messageAdditionalData.systemReminder;
            if (systemReminder != null) {
                iM17275b += CodedOutputByteBufferNano.m17285l(31, systemReminder, SystemReminder.PROTOBUF_ADAPTER);
            }
            LimitTimePicture limitTimePicture = messageAdditionalData.limitTimePicture;
            if (limitTimePicture != null) {
                iM17275b += CodedOutputByteBufferNano.m17285l(32, limitTimePicture, LimitTimePicture.PROTOBUF_ADAPTER);
            }
            CommonTipBox commonTipBox = messageAdditionalData.commonTipBox;
            if (commonTipBox != null) {
                iM17275b += CodedOutputByteBufferNano.m17285l(33, commonTipBox, CommonTipBox.PROTOBUF_ADAPTER);
            }
            Questionnaire questionnaire = messageAdditionalData.localUXQuestionnaire;
            if (questionnaire != null) {
                iM17275b += CodedOutputByteBufferNano.m17285l(34, questionnaire, Questionnaire.PROTOBUF_ADAPTER);
            }
            LoveLetterMessageInfo loveLetterMessageInfo = messageAdditionalData.loveLetterInfo;
            if (loveLetterMessageInfo != null) {
                iM17275b += CodedOutputByteBufferNano.m17285l(35, loveLetterMessageInfo, LoveLetterMessageInfo.PROTOBUF_ADAPTER);
            }
            IceBreakingQA iceBreakingQA = messageAdditionalData.iceBreakingQA;
            if (iceBreakingQA != null) {
                iM17275b += CodedOutputByteBufferNano.m17285l(36, iceBreakingQA, IceBreakingQA.PROTOBUF_ADAPTER);
            }
            PrologueMessageAdditional prologueMessageAdditional = messageAdditionalData.prologue;
            if (prologueMessageAdditional != null) {
                iM17275b += CodedOutputByteBufferNano.m17285l(37, prologueMessageAdditional, PrologueMessageAdditional.PROTOBUF_ADAPTER);
            }
            String str9 = messageAdditionalData.aiChatGuideType;
            if (str9 != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(38, str9);
            }
            MessageAdditionalDataCompliment messageAdditionalDataCompliment = messageAdditionalData.compliment;
            if (messageAdditionalDataCompliment != null) {
                iM17275b += CodedOutputByteBufferNano.m17285l(39, messageAdditionalDataCompliment, MessageAdditionalDataCompliment.PROTOBUF_ADAPTER);
            }
            messageAdditionalData.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MessageAdditionalData parse(nc5 nc5Var) throws IOException {
            MessageAdditionalData messageAdditionalData = new MessageAdditionalData();
            while (true) {
                switch (nc5Var.m162497u()) {
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
                    case 10:
                        messageAdditionalData.contactInfoRequestMessageId = nc5Var.m162495s();
                        continue;
                    case 18:
                        messageAdditionalData.href = nc5Var.m162495s();
                        continue;
                    case 26:
                        messageAdditionalData.caller = nc5Var.m162495s();
                        continue;
                    case 34:
                        messageAdditionalData.callee = nc5Var.m162495s();
                        continue;
                    case 42:
                        messageAdditionalData.status = nc5Var.m162495s();
                        continue;
                    case 50:
                        messageAdditionalData.duration = nc5Var.m162495s();
                        continue;
                    case 58:
                        messageAdditionalData.newQuestion = (NewQuestion) nc5Var.m162488l(NewQuestion.PROTOBUF_ADAPTER);
                        continue;
                    case 66:
                        messageAdditionalData.newQuestionAnswer = (NewQuestionAnswer) nc5Var.m162488l(NewQuestionAnswer.PROTOBUF_ADAPTER);
                        continue;
                    case 74:
                        messageAdditionalData.questionResult = (List) nc5Var.m162488l(QuestionResult.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case EACTags.COMMAND_TO_PERFORM /* 82 */:
                        messageAdditionalData.iceBreakingQuestion = (IceBreakingQuestion) nc5Var.m162488l(IceBreakingQuestion.PROTOBUF_ADAPTER);
                        continue;
                    case 88:
                        messageAdditionalData.forceSend = nc5Var.m162483g();
                        continue;
                    case EACTags.FCP_TEMPLATE /* 98 */:
                        messageAdditionalData.consumeType = nc5Var.m162495s();
                        continue;
                    case 106:
                        messageAdditionalData.coinSign = nc5Var.m162495s();
                        continue;
                    case 114:
                        messageAdditionalData.contact = (MessageContact) nc5Var.m162488l(MessageContact.PROTOBUF_ADAPTER);
                        continue;
                    case 122:
                        messageAdditionalData.oneSideNoMatch = (OneSideNoMatchMessage) nc5Var.m162488l(OneSideNoMatchMessage.PROTOBUF_ADAPTER);
                        continue;
                    case 130:
                        messageAdditionalData.song = (MessageMusic) nc5Var.m162488l(MessageMusic.PROTOBUF_ADAPTER);
                        continue;
                    case CipherSuite.TLS_PSK_WITH_RC4_128_SHA /* 138 */:
                        messageAdditionalData.conversationNotification = (ConversationNotification) nc5Var.m162488l(ConversationNotification.PROTOBUF_ADAPTER);
                        continue;
                    case CipherSuite.TLS_RSA_PSK_WITH_RC4_128_SHA /* 146 */:
                        messageAdditionalData.chatGiftInfo = (ChatGiftInfo) nc5Var.m162488l(ChatGiftInfo.PROTOBUF_ADAPTER);
                        continue;
                    case 154:
                        messageAdditionalData.momentGiftInfo = (ChatGiftInfo) nc5Var.m162488l(ChatGiftInfo.PROTOBUF_ADAPTER);
                        continue;
                    case 162:
                        messageAdditionalData.groupInvitation = (GroupInvitation) nc5Var.m162488l(GroupInvitation.PROTOBUF_ADAPTER);
                        continue;
                    case CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256 /* 170 */:
                        messageAdditionalData.understandShare = (KnowMyselfShareMessageAdditional) nc5Var.m162488l(KnowMyselfShareMessageAdditional.PROTOBUF_ADAPTER);
                        continue;
                    case 178:
                        messageAdditionalData.localBreakIce = (List) nc5Var.m162488l(BreakIce.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case CipherSuite.TLS_RSA_WITH_CAMELLIA_128_CBC_SHA256 /* 186 */:
                        messageAdditionalData.woodenFishHint = (WoodenFishHint) nc5Var.m162488l(WoodenFishHint.PROTOBUF_ADAPTER);
                        continue;
                    case CipherSuite.TLS_DH_RSA_WITH_CAMELLIA_256_CBC_SHA256 /* 194 */:
                        messageAdditionalData.exchangePicture = (ExchangePicture) nc5Var.m162488l(ExchangePicture.PROTOBUF_ADAPTER);
                        continue;
                    case 202:
                        messageAdditionalData.chatAssistantQuestions = (List) nc5Var.m162488l(ChatAssistantQuestion.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 210:
                        messageAdditionalData.femaleUnreplyReminder = (FemaleUnreplyReminder) nc5Var.m162488l(FemaleUnreplyReminder.PROTOBUF_ADAPTER);
                        continue;
                    case 218:
                        messageAdditionalData.twoSidesDifferentTip = (ChatTips) nc5Var.m162488l(ChatTips.PROTOBUF_ADAPTER);
                        continue;
                    case 226:
                        messageAdditionalData.aiPicture = (AiPicture) nc5Var.m162488l(AiPicture.PROTOBUF_ADAPTER);
                        continue;
                    case 234:
                        messageAdditionalData.harassAlertInfo = (HarassAlertInfo) nc5Var.m162488l(HarassAlertInfo.PROTOBUF_ADAPTER);
                        continue;
                    case 242:
                        messageAdditionalData.continuousChatTip = (ContinuousChatTip) nc5Var.m162488l(ContinuousChatTip.PROTOBUF_ADAPTER);
                        continue;
                    case 250:
                        messageAdditionalData.systemReminder = (SystemReminder) nc5Var.m162488l(SystemReminder.PROTOBUF_ADAPTER);
                        continue;
                    case 258:
                        messageAdditionalData.limitTimePicture = (LimitTimePicture) nc5Var.m162488l(LimitTimePicture.PROTOBUF_ADAPTER);
                        continue;
                    case 266:
                        messageAdditionalData.commonTipBox = (CommonTipBox) nc5Var.m162488l(CommonTipBox.PROTOBUF_ADAPTER);
                        continue;
                    case 274:
                        messageAdditionalData.localUXQuestionnaire = (Questionnaire) nc5Var.m162488l(Questionnaire.PROTOBUF_ADAPTER);
                        continue;
                    case 282:
                        messageAdditionalData.loveLetterInfo = (LoveLetterMessageInfo) nc5Var.m162488l(LoveLetterMessageInfo.PROTOBUF_ADAPTER);
                        continue;
                    case 290:
                        messageAdditionalData.iceBreakingQA = (IceBreakingQA) nc5Var.m162488l(IceBreakingQA.PROTOBUF_ADAPTER);
                        continue;
                    case 298:
                        messageAdditionalData.prologue = (PrologueMessageAdditional) nc5Var.m162488l(PrologueMessageAdditional.PROTOBUF_ADAPTER);
                        continue;
                    case 306:
                        messageAdditionalData.aiChatGuideType = nc5Var.m162495s();
                        continue;
                    case 314:
                        messageAdditionalData.compliment = (MessageAdditionalDataCompliment) nc5Var.m162488l(MessageAdditionalDataCompliment.PROTOBUF_ADAPTER);
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

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MessageAdditionalData messageAdditionalData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = messageAdditionalData.contactInfoRequestMessageId;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = messageAdditionalData.href;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            String str3 = messageAdditionalData.caller;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(3, str3);
            }
            String str4 = messageAdditionalData.callee;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(4, str4);
            }
            String str5 = messageAdditionalData.status;
            if (str5 != null) {
                codedOutputByteBufferNano.m17316R(5, str5);
            }
            String str6 = messageAdditionalData.duration;
            if (str6 != null) {
                codedOutputByteBufferNano.m17316R(6, str6);
            }
            NewQuestion newQuestion = messageAdditionalData.newQuestion;
            if (newQuestion != null) {
                codedOutputByteBufferNano.m17309K(7, newQuestion, NewQuestion.PROTOBUF_ADAPTER);
            }
            NewQuestionAnswer newQuestionAnswer = messageAdditionalData.newQuestionAnswer;
            if (newQuestionAnswer != null) {
                codedOutputByteBufferNano.m17309K(8, newQuestionAnswer, NewQuestionAnswer.PROTOBUF_ADAPTER);
            }
            List<QuestionResult> list = messageAdditionalData.questionResult;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(9, list, QuestionResult.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            IceBreakingQuestion iceBreakingQuestion = messageAdditionalData.iceBreakingQuestion;
            if (iceBreakingQuestion != null) {
                codedOutputByteBufferNano.m17309K(10, iceBreakingQuestion, IceBreakingQuestion.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.m17299A(11, messageAdditionalData.forceSend);
            String str7 = messageAdditionalData.consumeType;
            if (str7 != null) {
                codedOutputByteBufferNano.m17316R(12, str7);
            }
            String str8 = messageAdditionalData.coinSign;
            if (str8 != null) {
                codedOutputByteBufferNano.m17316R(13, str8);
            }
            MessageContact messageContact = messageAdditionalData.contact;
            if (messageContact != null) {
                codedOutputByteBufferNano.m17309K(14, messageContact, MessageContact.PROTOBUF_ADAPTER);
            }
            OneSideNoMatchMessage oneSideNoMatchMessage = messageAdditionalData.oneSideNoMatch;
            if (oneSideNoMatchMessage != null) {
                codedOutputByteBufferNano.m17309K(15, oneSideNoMatchMessage, OneSideNoMatchMessage.PROTOBUF_ADAPTER);
            }
            MessageMusic messageMusic = messageAdditionalData.song;
            if (messageMusic != null) {
                codedOutputByteBufferNano.m17309K(16, messageMusic, MessageMusic.PROTOBUF_ADAPTER);
            }
            ConversationNotification conversationNotification = messageAdditionalData.conversationNotification;
            if (conversationNotification != null) {
                codedOutputByteBufferNano.m17309K(17, conversationNotification, ConversationNotification.PROTOBUF_ADAPTER);
            }
            ChatGiftInfo chatGiftInfo = messageAdditionalData.chatGiftInfo;
            if (chatGiftInfo != null) {
                codedOutputByteBufferNano.m17309K(18, chatGiftInfo, ChatGiftInfo.PROTOBUF_ADAPTER);
            }
            ChatGiftInfo chatGiftInfo2 = messageAdditionalData.momentGiftInfo;
            if (chatGiftInfo2 != null) {
                codedOutputByteBufferNano.m17309K(19, chatGiftInfo2, ChatGiftInfo.PROTOBUF_ADAPTER);
            }
            GroupInvitation groupInvitation = messageAdditionalData.groupInvitation;
            if (groupInvitation != null) {
                codedOutputByteBufferNano.m17309K(20, groupInvitation, GroupInvitation.PROTOBUF_ADAPTER);
            }
            KnowMyselfShareMessageAdditional knowMyselfShareMessageAdditional = messageAdditionalData.understandShare;
            if (knowMyselfShareMessageAdditional != null) {
                codedOutputByteBufferNano.m17309K(21, knowMyselfShareMessageAdditional, KnowMyselfShareMessageAdditional.PROTOBUF_ADAPTER);
            }
            List<BreakIce> list2 = messageAdditionalData.localBreakIce;
            if (list2 != null) {
                codedOutputByteBufferNano.m17309K(22, list2, BreakIce.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            WoodenFishHint woodenFishHint = messageAdditionalData.woodenFishHint;
            if (woodenFishHint != null) {
                codedOutputByteBufferNano.m17309K(23, woodenFishHint, WoodenFishHint.PROTOBUF_ADAPTER);
            }
            ExchangePicture exchangePicture = messageAdditionalData.exchangePicture;
            if (exchangePicture != null) {
                codedOutputByteBufferNano.m17309K(24, exchangePicture, ExchangePicture.PROTOBUF_ADAPTER);
            }
            List<ChatAssistantQuestion> list3 = messageAdditionalData.chatAssistantQuestions;
            if (list3 != null) {
                codedOutputByteBufferNano.m17309K(25, list3, ChatAssistantQuestion.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            FemaleUnreplyReminder femaleUnreplyReminder = messageAdditionalData.femaleUnreplyReminder;
            if (femaleUnreplyReminder != null) {
                codedOutputByteBufferNano.m17309K(26, femaleUnreplyReminder, FemaleUnreplyReminder.PROTOBUF_ADAPTER);
            }
            ChatTips chatTips = messageAdditionalData.twoSidesDifferentTip;
            if (chatTips != null) {
                codedOutputByteBufferNano.m17309K(27, chatTips, ChatTips.PROTOBUF_ADAPTER);
            }
            AiPicture aiPicture = messageAdditionalData.aiPicture;
            if (aiPicture != null) {
                codedOutputByteBufferNano.m17309K(28, aiPicture, AiPicture.PROTOBUF_ADAPTER);
            }
            HarassAlertInfo harassAlertInfo = messageAdditionalData.harassAlertInfo;
            if (harassAlertInfo != null) {
                codedOutputByteBufferNano.m17309K(29, harassAlertInfo, HarassAlertInfo.PROTOBUF_ADAPTER);
            }
            ContinuousChatTip continuousChatTip = messageAdditionalData.continuousChatTip;
            if (continuousChatTip != null) {
                codedOutputByteBufferNano.m17309K(30, continuousChatTip, ContinuousChatTip.PROTOBUF_ADAPTER);
            }
            SystemReminder systemReminder = messageAdditionalData.systemReminder;
            if (systemReminder != null) {
                codedOutputByteBufferNano.m17309K(31, systemReminder, SystemReminder.PROTOBUF_ADAPTER);
            }
            LimitTimePicture limitTimePicture = messageAdditionalData.limitTimePicture;
            if (limitTimePicture != null) {
                codedOutputByteBufferNano.m17309K(32, limitTimePicture, LimitTimePicture.PROTOBUF_ADAPTER);
            }
            CommonTipBox commonTipBox = messageAdditionalData.commonTipBox;
            if (commonTipBox != null) {
                codedOutputByteBufferNano.m17309K(33, commonTipBox, CommonTipBox.PROTOBUF_ADAPTER);
            }
            Questionnaire questionnaire = messageAdditionalData.localUXQuestionnaire;
            if (questionnaire != null) {
                codedOutputByteBufferNano.m17309K(34, questionnaire, Questionnaire.PROTOBUF_ADAPTER);
            }
            LoveLetterMessageInfo loveLetterMessageInfo = messageAdditionalData.loveLetterInfo;
            if (loveLetterMessageInfo != null) {
                codedOutputByteBufferNano.m17309K(35, loveLetterMessageInfo, LoveLetterMessageInfo.PROTOBUF_ADAPTER);
            }
            IceBreakingQA iceBreakingQA = messageAdditionalData.iceBreakingQA;
            if (iceBreakingQA != null) {
                codedOutputByteBufferNano.m17309K(36, iceBreakingQA, IceBreakingQA.PROTOBUF_ADAPTER);
            }
            PrologueMessageAdditional prologueMessageAdditional = messageAdditionalData.prologue;
            if (prologueMessageAdditional != null) {
                codedOutputByteBufferNano.m17309K(37, prologueMessageAdditional, PrologueMessageAdditional.PROTOBUF_ADAPTER);
            }
            String str9 = messageAdditionalData.aiChatGuideType;
            if (str9 != null) {
                codedOutputByteBufferNano.m17316R(38, str9);
            }
            MessageAdditionalDataCompliment messageAdditionalDataCompliment = messageAdditionalData.compliment;
            if (messageAdditionalDataCompliment != null) {
                codedOutputByteBufferNano.m17309K(39, messageAdditionalDataCompliment, MessageAdditionalDataCompliment.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<MessageAdditionalData> JSON_ADAPTER = new ObjectJsonAdapter<MessageAdditionalData>() { // from class: com.p1.mobile.putong.core.data.MessageAdditionalData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return MessageAdditionalData.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public MessageAdditionalData newInstance() {
            return new MessageAdditionalData();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseField(MessageAdditionalData messageAdditionalData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -2142700492:
                    if (str.equals("iceBreakingQuestion")) {
                        b = 0;
                    }
                    break;
                case -2046036031:
                    if (str.equals("systemReminder")) {
                        b = 1;
                    }
                    break;
                case -1992012396:
                    if (str.equals(BLiveOperationTitleShowType.duration)) {
                        b = 2;
                    }
                    break;
                case -1926531208:
                    if (str.equals("groupInvitation")) {
                        b = 3;
                    }
                    break;
                case -1920892668:
                    if (str.equals("newQuestionAnswer")) {
                        b = 4;
                    }
                    break;
                case -1807628078:
                    if (str.equals("twoSidesDifferentTip")) {
                        b = 5;
                    }
                    break;
                case -1689030265:
                    if (str.equals("chatAssistantQuestions")) {
                        b = 6;
                    }
                    break;
                case -1396156735:
                    if (str.equals("contactInfoRequestMessageId")) {
                        b = 7;
                    }
                    break;
                case -1367775362:
                    if (str.equals("callee")) {
                        b = 8;
                    }
                    break;
                case -1367775349:
                    if (str.equals(BLiveRole.caller)) {
                        b = 9;
                    }
                    break;
                case -1285569305:
                    if (str.equals("oneSideNoMatch")) {
                        b = 10;
                    }
                    break;
                case -1132065522:
                    if (str.equals("conversationNotification")) {
                        b = 11;
                    }
                    break;
                case -1066862842:
                    if (str.equals("loveLetterInfo")) {
                        b = 12;
                    }
                    break;
                case -996548025:
                    if (str.equals("prologue")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case -910329193:
                    if (str.equals("femaleUnreplyReminder")) {
                        b = 14;
                    }
                    break;
                case -892481550:
                    if (str.equals(NotificationCompat.CATEGORY_STATUS)) {
                        b = 15;
                    }
                    break;
                case -859266730:
                    if (str.equals("consumeType")) {
                        b = Tnaf.POW_2_WIDTH;
                    }
                    break;
                case -716550162:
                    if (str.equals("coinSign")) {
                        b = 17;
                    }
                    break;
                case -537721814:
                    if (str.equals("compliment")) {
                        b = 18;
                    }
                    break;
                case -490723531:
                    if (str.equals("woodenFishHint")) {
                        b = 19;
                    }
                    break;
                case -350184778:
                    if (str.equals("limitTimePicture")) {
                        b = 20;
                    }
                    break;
                case -155399845:
                    if (str.equals("exchangePicture")) {
                        b = 21;
                    }
                    break;
                case -154030142:
                    if (str.equals("harassAlertInfo")) {
                        b = 22;
                    }
                    break;
                case -131919842:
                    if (str.equals("momentGiftInfo")) {
                        b = 23;
                    }
                    break;
                case 3211051:
                    if (str.equals("href")) {
                        b = 24;
                    }
                    break;
                case 3536149:
                    if (str.equals(MessageType.song)) {
                        b = 25;
                    }
                    break;
                case 90876326:
                    if (str.equals("newQuestion")) {
                        b = 26;
                    }
                    break;
                case 136803579:
                    if (str.equals("commonTipBox")) {
                        b = 27;
                    }
                    break;
                case 168979382:
                    if (str.equals("aiPicture")) {
                        b = 28;
                    }
                    break;
                case 198958100:
                    if (str.equals("continuousChatTip")) {
                        b = 29;
                    }
                    break;
                case 277860597:
                    if (str.equals("localUXQuestionnaire")) {
                        b = 30;
                    }
                    break;
                case 951526432:
                    if (str.equals(Contact.TYPE)) {
                        b = 31;
                    }
                    break;
                case 1354277054:
                    if (str.equals("iceBreakingQA")) {
                        b = HttpTokens.SPACE;
                    }
                    break;
                case 1398220417:
                    if (str.equals("understandShare")) {
                        b = 33;
                    }
                    break;
                case 1412322454:
                    if (str.equals("aiChatGuideType")) {
                        b = 34;
                    }
                    break;
                case 1527996691:
                    if (str.equals("forceSend")) {
                        b = 35;
                    }
                    break;
                case 1756692437:
                    if (str.equals("iceBreakQuestionID")) {
                        b = 36;
                    }
                    break;
                case 1810319734:
                    if (str.equals("chatGiftInfo")) {
                        b = 37;
                    }
                    break;
                case 2033576867:
                    if (str.equals("questionResult")) {
                        b = 38;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    messageAdditionalData.iceBreakingQuestion = IceBreakingQuestion.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 1:
                    messageAdditionalData.systemReminder = SystemReminder.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 2:
                    messageAdditionalData.duration = jsonParser.getValueAsString();
                    return true;
                case 3:
                    messageAdditionalData.groupInvitation = GroupInvitation.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 4:
                    messageAdditionalData.newQuestionAnswer = NewQuestionAnswer.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 5:
                    messageAdditionalData.twoSidesDifferentTip = ChatTips.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 6:
                    messageAdditionalData.chatAssistantQuestions = JsonAdapter.parseArray(jsonParser, ChatAssistantQuestion.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 7:
                    messageAdditionalData.contactInfoRequestMessageId = jsonParser.getValueAsString();
                    return true;
                case 8:
                    messageAdditionalData.callee = jsonParser.getValueAsString();
                    return true;
                case 9:
                    messageAdditionalData.caller = jsonParser.getValueAsString();
                    return true;
                case 10:
                    messageAdditionalData.oneSideNoMatch = OneSideNoMatchMessage.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 11:
                    messageAdditionalData.conversationNotification = ConversationNotification.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 12:
                    messageAdditionalData.loveLetterInfo = LoveLetterMessageInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 13:
                    messageAdditionalData.prologue = PrologueMessageAdditional.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 14:
                    messageAdditionalData.femaleUnreplyReminder = FemaleUnreplyReminder.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 15:
                    messageAdditionalData.status = jsonParser.getValueAsString();
                    return true;
                case 16:
                    messageAdditionalData.consumeType = jsonParser.getValueAsString();
                    return true;
                case 17:
                    messageAdditionalData.coinSign = jsonParser.getValueAsString();
                    return true;
                case 18:
                    messageAdditionalData.compliment = MessageAdditionalDataCompliment.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 19:
                    messageAdditionalData.woodenFishHint = WoodenFishHint.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 20:
                    messageAdditionalData.limitTimePicture = LimitTimePicture.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 21:
                    messageAdditionalData.exchangePicture = ExchangePicture.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 22:
                    messageAdditionalData.harassAlertInfo = HarassAlertInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 23:
                    messageAdditionalData.momentGiftInfo = ChatGiftInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 24:
                    messageAdditionalData.href = jsonParser.getValueAsString();
                    return true;
                case 25:
                    messageAdditionalData.song = MessageMusic.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 26:
                    messageAdditionalData.newQuestion = NewQuestion.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 27:
                    messageAdditionalData.commonTipBox = CommonTipBox.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 28:
                    messageAdditionalData.aiPicture = AiPicture.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 29:
                    messageAdditionalData.continuousChatTip = ContinuousChatTip.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 30:
                    messageAdditionalData.localUXQuestionnaire = Questionnaire.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 31:
                    messageAdditionalData.contact = MessageContact.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 32:
                    messageAdditionalData.iceBreakingQA = IceBreakingQA.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 33:
                    messageAdditionalData.understandShare = KnowMyselfShareMessageAdditional.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 34:
                    messageAdditionalData.aiChatGuideType = jsonParser.getValueAsString();
                    return true;
                case 35:
                    messageAdditionalData.forceSend = jsonParser.getValueAsBoolean();
                    return true;
                case 36:
                    messageAdditionalData.iceBreakQuestionID = jsonParser.getValueAsString();
                    return true;
                case 37:
                    messageAdditionalData.chatGiftInfo = ChatGiftInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 38:
                    messageAdditionalData.questionResult = JsonAdapter.parseArray(jsonParser, QuestionResult.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseFieldCheck(MessageAdditionalData messageAdditionalData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -2142700492:
                    if (str.equals("iceBreakingQuestion")) {
                        b = 0;
                    }
                    break;
                case -2046036031:
                    if (str.equals("systemReminder")) {
                        b = 1;
                    }
                    break;
                case -1992012396:
                    if (str.equals(BLiveOperationTitleShowType.duration)) {
                        b = 2;
                    }
                    break;
                case -1926531208:
                    if (str.equals("groupInvitation")) {
                        b = 3;
                    }
                    break;
                case -1920892668:
                    if (str.equals("newQuestionAnswer")) {
                        b = 4;
                    }
                    break;
                case -1807628078:
                    if (str.equals("twoSidesDifferentTip")) {
                        b = 5;
                    }
                    break;
                case -1689030265:
                    if (str.equals("chatAssistantQuestions")) {
                        b = 6;
                    }
                    break;
                case -1396156735:
                    if (str.equals("contactInfoRequestMessageId")) {
                        b = 7;
                    }
                    break;
                case -1367775362:
                    if (str.equals("callee")) {
                        b = 8;
                    }
                    break;
                case -1367775349:
                    if (str.equals(BLiveRole.caller)) {
                        b = 9;
                    }
                    break;
                case -1285569305:
                    if (str.equals("oneSideNoMatch")) {
                        b = 10;
                    }
                    break;
                case -1132065522:
                    if (str.equals("conversationNotification")) {
                        b = 11;
                    }
                    break;
                case -1066862842:
                    if (str.equals("loveLetterInfo")) {
                        b = 12;
                    }
                    break;
                case -996548025:
                    if (str.equals("prologue")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case -910329193:
                    if (str.equals("femaleUnreplyReminder")) {
                        b = 14;
                    }
                    break;
                case -892481550:
                    if (str.equals(NotificationCompat.CATEGORY_STATUS)) {
                        b = 15;
                    }
                    break;
                case -859266730:
                    if (str.equals("consumeType")) {
                        b = Tnaf.POW_2_WIDTH;
                    }
                    break;
                case -716550162:
                    if (str.equals("coinSign")) {
                        b = 17;
                    }
                    break;
                case -537721814:
                    if (str.equals("compliment")) {
                        b = 18;
                    }
                    break;
                case -490723531:
                    if (str.equals("woodenFishHint")) {
                        b = 19;
                    }
                    break;
                case -350184778:
                    if (str.equals("limitTimePicture")) {
                        b = 20;
                    }
                    break;
                case -155399845:
                    if (str.equals("exchangePicture")) {
                        b = 21;
                    }
                    break;
                case -154030142:
                    if (str.equals("harassAlertInfo")) {
                        b = 22;
                    }
                    break;
                case -131919842:
                    if (str.equals("momentGiftInfo")) {
                        b = 23;
                    }
                    break;
                case 3211051:
                    if (str.equals("href")) {
                        b = 24;
                    }
                    break;
                case 3536149:
                    if (str.equals(MessageType.song)) {
                        b = 25;
                    }
                    break;
                case 90876326:
                    if (str.equals("newQuestion")) {
                        b = 26;
                    }
                    break;
                case 136803579:
                    if (str.equals("commonTipBox")) {
                        b = 27;
                    }
                    break;
                case 168979382:
                    if (str.equals("aiPicture")) {
                        b = 28;
                    }
                    break;
                case 198958100:
                    if (str.equals("continuousChatTip")) {
                        b = 29;
                    }
                    break;
                case 277860597:
                    if (str.equals("localUXQuestionnaire")) {
                        b = 30;
                    }
                    break;
                case 951526432:
                    if (str.equals(Contact.TYPE)) {
                        b = 31;
                    }
                    break;
                case 1354277054:
                    if (str.equals("iceBreakingQA")) {
                        b = HttpTokens.SPACE;
                    }
                    break;
                case 1398220417:
                    if (str.equals("understandShare")) {
                        b = 33;
                    }
                    break;
                case 1412322454:
                    if (str.equals("aiChatGuideType")) {
                        b = 34;
                    }
                    break;
                case 1527996691:
                    if (str.equals("forceSend")) {
                        b = 35;
                    }
                    break;
                case 1756692437:
                    if (str.equals("iceBreakQuestionID")) {
                        b = 36;
                    }
                    break;
                case 1810319734:
                    if (str.equals("chatGiftInfo")) {
                        b = 37;
                    }
                    break;
                case 2033576867:
                    if (str.equals("questionResult")) {
                        b = 38;
                    }
                    break;
            }
            switch (b) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                    return true;
                default:
                    return super.parseFieldCheck(messageAdditionalData, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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
                jsonGenerator.writeStringField(BLiveRole.caller, str3);
            }
            String str4 = messageAdditionalData.callee;
            if (str4 != null) {
                jsonGenerator.writeStringField("callee", str4);
            }
            String str5 = messageAdditionalData.status;
            if (str5 != null) {
                jsonGenerator.writeStringField(NotificationCompat.CATEGORY_STATUS, str5);
            }
            String str6 = messageAdditionalData.duration;
            if (str6 != null) {
                jsonGenerator.writeStringField(BLiveOperationTitleShowType.duration, str6);
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
                jsonGenerator.writeFieldName(Contact.TYPE);
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MessageAdditionalData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MessageAdditionalData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MessageAdditionalData new_() {
        MessageAdditionalData messageAdditionalData = new MessageAdditionalData();
        messageAdditionalData.nullCheck();
        return messageAdditionalData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public MessageAdditionalData mo225055clone() {
        MessageAdditionalData messageAdditionalData = new MessageAdditionalData();
        messageAdditionalData.contactInfoRequestMessageId = this.contactInfoRequestMessageId;
        messageAdditionalData.href = this.href;
        messageAdditionalData.caller = this.caller;
        messageAdditionalData.callee = this.callee;
        messageAdditionalData.status = this.status;
        messageAdditionalData.duration = this.duration;
        NewQuestion newQuestion = this.newQuestion;
        if (newQuestion != null) {
            messageAdditionalData.newQuestion = newQuestion.mo225055clone();
        }
        NewQuestionAnswer newQuestionAnswer = this.newQuestionAnswer;
        if (newQuestionAnswer != null) {
            messageAdditionalData.newQuestionAnswer = newQuestionAnswer.mo225055clone();
        }
        List<QuestionResult> list = this.questionResult;
        if (list != null) {
            messageAdditionalData.questionResult = ValueObject.util_map(list, new qcj() { // from class: l.iwy
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((QuestionResult) obj).mo225055clone();
                }
            });
        }
        IceBreakingQuestion iceBreakingQuestion = this.iceBreakingQuestion;
        if (iceBreakingQuestion != null) {
            messageAdditionalData.iceBreakingQuestion = iceBreakingQuestion.mo225055clone();
        }
        messageAdditionalData.forceSend = this.forceSend;
        messageAdditionalData.consumeType = this.consumeType;
        messageAdditionalData.coinSign = this.coinSign;
        MessageContact messageContact = this.contact;
        if (messageContact != null) {
            messageAdditionalData.contact = messageContact.mo225055clone();
        }
        OneSideNoMatchMessage oneSideNoMatchMessage = this.oneSideNoMatch;
        if (oneSideNoMatchMessage != null) {
            messageAdditionalData.oneSideNoMatch = oneSideNoMatchMessage.mo225055clone();
        }
        MessageMusic messageMusic = this.song;
        if (messageMusic != null) {
            messageAdditionalData.song = messageMusic.mo225055clone();
        }
        ConversationNotification conversationNotification = this.conversationNotification;
        if (conversationNotification != null) {
            messageAdditionalData.conversationNotification = conversationNotification.mo225055clone();
        }
        ChatGiftInfo chatGiftInfo = this.chatGiftInfo;
        if (chatGiftInfo != null) {
            messageAdditionalData.chatGiftInfo = chatGiftInfo.mo225055clone();
        }
        ChatGiftInfo chatGiftInfo2 = this.momentGiftInfo;
        if (chatGiftInfo2 != null) {
            messageAdditionalData.momentGiftInfo = chatGiftInfo2.mo225055clone();
        }
        GroupInvitation groupInvitation = this.groupInvitation;
        if (groupInvitation != null) {
            messageAdditionalData.groupInvitation = groupInvitation.mo225055clone();
        }
        KnowMyselfShareMessageAdditional knowMyselfShareMessageAdditional = this.understandShare;
        if (knowMyselfShareMessageAdditional != null) {
            messageAdditionalData.understandShare = knowMyselfShareMessageAdditional.mo225055clone();
        }
        List<BreakIce> list2 = this.localBreakIce;
        if (list2 != null) {
            messageAdditionalData.localBreakIce = ValueObject.util_map(list2, new qcj() { // from class: l.jwy
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BreakIce) obj).mo225055clone();
                }
            });
        }
        WoodenFishHint woodenFishHint = this.woodenFishHint;
        if (woodenFishHint != null) {
            messageAdditionalData.woodenFishHint = woodenFishHint.mo225055clone();
        }
        ExchangePicture exchangePicture = this.exchangePicture;
        if (exchangePicture != null) {
            messageAdditionalData.exchangePicture = exchangePicture.mo225055clone();
        }
        List<ChatAssistantQuestion> list3 = this.chatAssistantQuestions;
        if (list3 != null) {
            messageAdditionalData.chatAssistantQuestions = ValueObject.util_map(list3, new qcj() { // from class: l.kwy
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((ChatAssistantQuestion) obj).mo225055clone();
                }
            });
        }
        ChatTips chatTips = this.twoSidesDifferentTip;
        if (chatTips != null) {
            messageAdditionalData.twoSidesDifferentTip = chatTips.mo225055clone();
        }
        FemaleUnreplyReminder femaleUnreplyReminder = this.femaleUnreplyReminder;
        if (femaleUnreplyReminder != null) {
            messageAdditionalData.femaleUnreplyReminder = femaleUnreplyReminder.mo225055clone();
        }
        AiPicture aiPicture = this.aiPicture;
        if (aiPicture != null) {
            messageAdditionalData.aiPicture = aiPicture.mo225055clone();
        }
        HarassAlertInfo harassAlertInfo = this.harassAlertInfo;
        if (harassAlertInfo != null) {
            messageAdditionalData.harassAlertInfo = harassAlertInfo.mo225055clone();
        }
        ContinuousChatTip continuousChatTip = this.continuousChatTip;
        if (continuousChatTip != null) {
            messageAdditionalData.continuousChatTip = continuousChatTip.mo225055clone();
        }
        SystemReminder systemReminder = this.systemReminder;
        if (systemReminder != null) {
            messageAdditionalData.systemReminder = systemReminder.mo225055clone();
        }
        LimitTimePicture limitTimePicture = this.limitTimePicture;
        if (limitTimePicture != null) {
            messageAdditionalData.limitTimePicture = limitTimePicture.mo225055clone();
        }
        CommonTipBox commonTipBox = this.commonTipBox;
        if (commonTipBox != null) {
            messageAdditionalData.commonTipBox = commonTipBox.mo225055clone();
        }
        messageAdditionalData.iceBreakQuestionID = this.iceBreakQuestionID;
        Questionnaire questionnaire = this.localUXQuestionnaire;
        if (questionnaire != null) {
            messageAdditionalData.localUXQuestionnaire = questionnaire.mo225055clone();
        }
        LoveLetterMessageInfo loveLetterMessageInfo = this.loveLetterInfo;
        if (loveLetterMessageInfo != null) {
            messageAdditionalData.loveLetterInfo = loveLetterMessageInfo.mo225055clone();
        }
        IceBreakingQA iceBreakingQA = this.iceBreakingQA;
        if (iceBreakingQA != null) {
            messageAdditionalData.iceBreakingQA = iceBreakingQA.mo225055clone();
        }
        PrologueMessageAdditional prologueMessageAdditional = this.prologue;
        if (prologueMessageAdditional != null) {
            messageAdditionalData.prologue = prologueMessageAdditional.mo225055clone();
        }
        messageAdditionalData.aiChatGuideType = this.aiChatGuideType;
        MessageAdditionalDataCompliment messageAdditionalDataCompliment = this.compliment;
        if (messageAdditionalDataCompliment != null) {
            messageAdditionalData.compliment = messageAdditionalDataCompliment.mo225055clone();
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
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
        this.hashCode = iHashCode39;
        return iHashCode39;
    }

    @Override // com.tantanapp.common.data.ValueObject
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

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
