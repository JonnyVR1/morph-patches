package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.ConversationAdditional;
import com.p1.mobile.putong.data.LiveActivityConversation;
import com.p1.mobile.putong.data.VirtualVoiceGroupConversationCell;
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
public class ConversationAdditional extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "conversationadditional";

    @Nullable
    @ProtobufIndex(index = Conversation.SURPRISE_LEVEL_TOP)
    public AvatarSummaryCounter avatarSummary;

    @NonNull
    @ProtobufIndex(index = 30)
    public BlackList blackList;

    @Nullable
    @ProtobufIndex(index = 21)
    public GrowthConversationBlindBox blindbox;

    @NonNull
    @ProtobufIndex(index = 17)
    public ConversationAdditionalChatAssistantQuestion chatAssistantQuestion;

    @Nullable
    @ProtobufIndex(index = 29)
    public ChatMM chatMM;

    @NonNull
    @ProtobufIndex(index = 32)
    public ConvAdditionalCompliment compliment;

    @NonNull
    @ProtobufIndex(index = 18)
    public ContinuousChat continuousChat;

    @NonNull
    @ProtobufIndex(index = 24)
    public ConversationAdditionalFateRadar fateRadar;

    @NonNull
    @ProtobufIndex(index = 11)
    public CoreInteractionMessageCounter feedInteractionCounter;

    @NonNull
    @ProtobufIndex(index = 7)
    public CoreFeedStateCounter feedStateCounter;

    @NonNull
    @ProtobufIndex(index = 15)
    public ConversationGame game;

    @NonNull
    @ProtobufIndex(index = 23)
    public GreetingInfo greetingInfo;

    @NonNull
    @ProtobufIndex(index = 9)
    public HeartbeatMatch heartbeatMatch;

    @NonNull
    @ProtobufIndex(index = 6)
    public ConversationAdditionalKanKanContent kankan;

    @NonNull
    @ProtobufIndex(index = 14)
    public LiveActivityConversation liveActivity;

    @NonNull
    @ProtobufIndex(index = 12)
    public VirtualVoiceGroupConversationCell liveVirtualVoice;

    @Nullable
    @ProtobufIndex(index = 13)
    public ConversationMomentInfo localMomentInfo;

    @NonNull
    @ProtobufIndex(index = 28)
    public ConvAdditionalLoveLetter loveLetter;

    @NonNull
    @ProtobufIndex(index = 25)
    public LowPayOneside lowPayOneside;

    @NonNull
    @ProtobufIndex(index = 26)
    public ConvAdditionalMatchInfo matchInfo;

    @NonNull
    @ProtobufIndex(index = 31)
    public MessageRelate messageRelate;

    @NonNull
    @ProtobufIndex(index = 27)
    public ExposureNewMatch newMatch;

    @NonNull
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public ConversationAdditionalOneSide oneSide;

    @NonNull
    @ProtobufIndex(index = 4)
    public OneSideNoMatchConversation oneSideNoMatch;

    @Nullable
    @ProtobufIndex(index = 19)
    public PlatinumPinChat pinChat;

    @NonNull
    @ProtobufIndex(index = 22)
    public List<String> previewTexts;

    @NonNull
    @ProtobufIndex(index = 1)
    public ConversationAdditionalQuickChat quickChat;

    @Nullable
    @ProtobufIndex(index = 20)
    public ReSwipeInfo reSwipe;

    @NonNull
    @ProtobufIndex(index = 8)
    public SuggestedTimeLimitedMatch suggestedTimeLimitedMatch;

    @NonNull
    @ProtobufIndex(index = 33)
    public ConvAdditionalSwiper swiper;

    @NonNull
    @ProtobufIndex(index = 16)
    public ConversationAdditionalTag tag;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public TimeLimited timeLimited;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public VoiceCallAdditional voiceCall;
    public static ProtobufAdapter<ConversationAdditional> PROTOBUF_ADAPTER = new MessageNanoAdapter<ConversationAdditional>() { // from class: com.p1.mobile.putong.core.data.ConversationAdditional.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ConversationAdditional conversationAdditional) {
            ConversationAdditionalQuickChat conversationAdditionalQuickChat = conversationAdditional.quickChat;
            int iL = conversationAdditionalQuickChat != null ? CodedOutputByteBufferNano.l(1, conversationAdditionalQuickChat, ConversationAdditionalQuickChat.PROTOBUF_ADAPTER) : 0;
            VoiceCallAdditional voiceCallAdditional = conversationAdditional.voiceCall;
            if (voiceCallAdditional != null) {
                iL += CodedOutputByteBufferNano.l(2, voiceCallAdditional, VoiceCallAdditional.PROTOBUF_ADAPTER);
            }
            TimeLimited timeLimited = conversationAdditional.timeLimited;
            if (timeLimited != null) {
                iL += CodedOutputByteBufferNano.l(3, timeLimited, TimeLimited.PROTOBUF_ADAPTER);
            }
            OneSideNoMatchConversation oneSideNoMatchConversation = conversationAdditional.oneSideNoMatch;
            if (oneSideNoMatchConversation != null) {
                iL += CodedOutputByteBufferNano.l(4, oneSideNoMatchConversation, OneSideNoMatchConversation.PROTOBUF_ADAPTER);
            }
            ConversationAdditionalOneSide conversationAdditionalOneSide = conversationAdditional.oneSide;
            if (conversationAdditionalOneSide != null) {
                iL += CodedOutputByteBufferNano.l(5, conversationAdditionalOneSide, ConversationAdditionalOneSide.PROTOBUF_ADAPTER);
            }
            ConversationAdditionalKanKanContent conversationAdditionalKanKanContent = conversationAdditional.kankan;
            if (conversationAdditionalKanKanContent != null) {
                iL += CodedOutputByteBufferNano.l(6, conversationAdditionalKanKanContent, ConversationAdditionalKanKanContent.PROTOBUF_ADAPTER);
            }
            CoreFeedStateCounter coreFeedStateCounter = conversationAdditional.feedStateCounter;
            if (coreFeedStateCounter != null) {
                iL += CodedOutputByteBufferNano.l(7, coreFeedStateCounter, CoreFeedStateCounter.PROTOBUF_ADAPTER);
            }
            SuggestedTimeLimitedMatch suggestedTimeLimitedMatch = conversationAdditional.suggestedTimeLimitedMatch;
            if (suggestedTimeLimitedMatch != null) {
                iL += CodedOutputByteBufferNano.l(8, suggestedTimeLimitedMatch, SuggestedTimeLimitedMatch.PROTOBUF_ADAPTER);
            }
            HeartbeatMatch heartbeatMatch = conversationAdditional.heartbeatMatch;
            if (heartbeatMatch != null) {
                iL += CodedOutputByteBufferNano.l(9, heartbeatMatch, HeartbeatMatch.PROTOBUF_ADAPTER);
            }
            AvatarSummaryCounter avatarSummaryCounter = conversationAdditional.avatarSummary;
            if (avatarSummaryCounter != null) {
                iL += CodedOutputByteBufferNano.l(10, avatarSummaryCounter, AvatarSummaryCounter.PROTOBUF_ADAPTER);
            }
            CoreInteractionMessageCounter coreInteractionMessageCounter = conversationAdditional.feedInteractionCounter;
            if (coreInteractionMessageCounter != null) {
                iL += CodedOutputByteBufferNano.l(11, coreInteractionMessageCounter, CoreInteractionMessageCounter.PROTOBUF_ADAPTER);
            }
            VirtualVoiceGroupConversationCell virtualVoiceGroupConversationCell = conversationAdditional.liveVirtualVoice;
            if (virtualVoiceGroupConversationCell != null) {
                iL += CodedOutputByteBufferNano.l(12, virtualVoiceGroupConversationCell, VirtualVoiceGroupConversationCell.PROTOBUF_ADAPTER);
            }
            ConversationMomentInfo conversationMomentInfo = conversationAdditional.localMomentInfo;
            if (conversationMomentInfo != null) {
                iL += CodedOutputByteBufferNano.l(13, conversationMomentInfo, ConversationMomentInfo.PROTOBUF_ADAPTER);
            }
            LiveActivityConversation liveActivityConversation = conversationAdditional.liveActivity;
            if (liveActivityConversation != null) {
                iL += CodedOutputByteBufferNano.l(14, liveActivityConversation, LiveActivityConversation.PROTOBUF_ADAPTER);
            }
            ConversationGame conversationGame = conversationAdditional.game;
            if (conversationGame != null) {
                iL += CodedOutputByteBufferNano.l(15, conversationGame, ConversationGame.PROTOBUF_ADAPTER);
            }
            ConversationAdditionalTag conversationAdditionalTag = conversationAdditional.tag;
            if (conversationAdditionalTag != null) {
                iL += CodedOutputByteBufferNano.l(16, conversationAdditionalTag, ConversationAdditionalTag.PROTOBUF_ADAPTER);
            }
            ConversationAdditionalChatAssistantQuestion conversationAdditionalChatAssistantQuestion = conversationAdditional.chatAssistantQuestion;
            if (conversationAdditionalChatAssistantQuestion != null) {
                iL += CodedOutputByteBufferNano.l(17, conversationAdditionalChatAssistantQuestion, ConversationAdditionalChatAssistantQuestion.PROTOBUF_ADAPTER);
            }
            ContinuousChat continuousChat = conversationAdditional.continuousChat;
            if (continuousChat != null) {
                iL += CodedOutputByteBufferNano.l(18, continuousChat, ContinuousChat.PROTOBUF_ADAPTER);
            }
            PlatinumPinChat platinumPinChat = conversationAdditional.pinChat;
            if (platinumPinChat != null) {
                iL += CodedOutputByteBufferNano.l(19, platinumPinChat, PlatinumPinChat.PROTOBUF_ADAPTER);
            }
            ReSwipeInfo reSwipeInfo = conversationAdditional.reSwipe;
            if (reSwipeInfo != null) {
                iL += CodedOutputByteBufferNano.l(20, reSwipeInfo, ReSwipeInfo.PROTOBUF_ADAPTER);
            }
            GrowthConversationBlindBox growthConversationBlindBox = conversationAdditional.blindbox;
            if (growthConversationBlindBox != null) {
                iL += CodedOutputByteBufferNano.l(21, growthConversationBlindBox, GrowthConversationBlindBox.PROTOBUF_ADAPTER);
            }
            List<String> list = conversationAdditional.previewTexts;
            if (list != null) {
                iL += CodedOutputByteBufferNano.l(22, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            GreetingInfo greetingInfo = conversationAdditional.greetingInfo;
            if (greetingInfo != null) {
                iL += CodedOutputByteBufferNano.l(23, greetingInfo, GreetingInfo.PROTOBUF_ADAPTER);
            }
            ConversationAdditionalFateRadar conversationAdditionalFateRadar = conversationAdditional.fateRadar;
            if (conversationAdditionalFateRadar != null) {
                iL += CodedOutputByteBufferNano.l(24, conversationAdditionalFateRadar, ConversationAdditionalFateRadar.PROTOBUF_ADAPTER);
            }
            LowPayOneside lowPayOneside = conversationAdditional.lowPayOneside;
            if (lowPayOneside != null) {
                iL += CodedOutputByteBufferNano.l(25, lowPayOneside, LowPayOneside.PROTOBUF_ADAPTER);
            }
            ConvAdditionalMatchInfo convAdditionalMatchInfo = conversationAdditional.matchInfo;
            if (convAdditionalMatchInfo != null) {
                iL += CodedOutputByteBufferNano.l(26, convAdditionalMatchInfo, ConvAdditionalMatchInfo.PROTOBUF_ADAPTER);
            }
            ExposureNewMatch exposureNewMatch = conversationAdditional.newMatch;
            if (exposureNewMatch != null) {
                iL += CodedOutputByteBufferNano.l(27, exposureNewMatch, ExposureNewMatch.PROTOBUF_ADAPTER);
            }
            ConvAdditionalLoveLetter convAdditionalLoveLetter = conversationAdditional.loveLetter;
            if (convAdditionalLoveLetter != null) {
                iL += CodedOutputByteBufferNano.l(28, convAdditionalLoveLetter, ConvAdditionalLoveLetter.PROTOBUF_ADAPTER);
            }
            ChatMM chatMM = conversationAdditional.chatMM;
            if (chatMM != null) {
                iL += CodedOutputByteBufferNano.l(29, chatMM, ChatMM.PROTOBUF_ADAPTER);
            }
            BlackList blackList = conversationAdditional.blackList;
            if (blackList != null) {
                iL += CodedOutputByteBufferNano.l(30, blackList, BlackList.PROTOBUF_ADAPTER);
            }
            MessageRelate messageRelate = conversationAdditional.messageRelate;
            if (messageRelate != null) {
                iL += CodedOutputByteBufferNano.l(31, messageRelate, MessageRelate.PROTOBUF_ADAPTER);
            }
            ConvAdditionalCompliment convAdditionalCompliment = conversationAdditional.compliment;
            if (convAdditionalCompliment != null) {
                iL += CodedOutputByteBufferNano.l(32, convAdditionalCompliment, ConvAdditionalCompliment.PROTOBUF_ADAPTER);
            }
            ConvAdditionalSwiper convAdditionalSwiper = conversationAdditional.swiper;
            if (convAdditionalSwiper != null) {
                iL += CodedOutputByteBufferNano.l(33, convAdditionalSwiper, ConvAdditionalSwiper.PROTOBUF_ADAPTER);
            }
            ((MessageNano) conversationAdditional).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ConversationAdditional m12319parse(nb5 nb5Var) throws IOException {
            ConversationAdditional conversationAdditional = new ConversationAdditional();
            while (true) {
                switch (nb5Var.u()) {
                    case 0:
                        if (conversationAdditional.quickChat == null) {
                            conversationAdditional.quickChat = ConversationAdditionalQuickChat.new_();
                        }
                        if (conversationAdditional.voiceCall == null) {
                            conversationAdditional.voiceCall = VoiceCallAdditional.new_();
                        }
                        if (conversationAdditional.timeLimited == null) {
                            conversationAdditional.timeLimited = TimeLimited.new_();
                        }
                        if (conversationAdditional.oneSideNoMatch == null) {
                            conversationAdditional.oneSideNoMatch = OneSideNoMatchConversation.new_();
                        }
                        if (conversationAdditional.oneSide == null) {
                            conversationAdditional.oneSide = ConversationAdditionalOneSide.new_();
                        }
                        if (conversationAdditional.kankan == null) {
                            conversationAdditional.kankan = ConversationAdditionalKanKanContent.new_();
                        }
                        if (conversationAdditional.feedStateCounter == null) {
                            conversationAdditional.feedStateCounter = CoreFeedStateCounter.new_();
                        }
                        if (conversationAdditional.suggestedTimeLimitedMatch == null) {
                            conversationAdditional.suggestedTimeLimitedMatch = SuggestedTimeLimitedMatch.new_();
                        }
                        if (conversationAdditional.heartbeatMatch == null) {
                            conversationAdditional.heartbeatMatch = HeartbeatMatch.new_();
                        }
                        if (conversationAdditional.feedInteractionCounter == null) {
                            conversationAdditional.feedInteractionCounter = CoreInteractionMessageCounter.new_();
                        }
                        if (conversationAdditional.liveVirtualVoice == null) {
                            conversationAdditional.liveVirtualVoice = VirtualVoiceGroupConversationCell.new_();
                        }
                        if (conversationAdditional.liveActivity == null) {
                            conversationAdditional.liveActivity = LiveActivityConversation.new_();
                        }
                        if (conversationAdditional.game == null) {
                            conversationAdditional.game = ConversationGame.new_();
                        }
                        if (conversationAdditional.tag == null) {
                            conversationAdditional.tag = ConversationAdditionalTag.new_();
                        }
                        if (conversationAdditional.chatAssistantQuestion == null) {
                            conversationAdditional.chatAssistantQuestion = ConversationAdditionalChatAssistantQuestion.new_();
                        }
                        if (conversationAdditional.continuousChat == null) {
                            conversationAdditional.continuousChat = ContinuousChat.new_();
                        }
                        if (conversationAdditional.previewTexts == null) {
                            conversationAdditional.previewTexts = new ArrayList();
                        }
                        if (conversationAdditional.greetingInfo == null) {
                            conversationAdditional.greetingInfo = GreetingInfo.new_();
                        }
                        if (conversationAdditional.fateRadar == null) {
                            conversationAdditional.fateRadar = ConversationAdditionalFateRadar.new_();
                        }
                        if (conversationAdditional.lowPayOneside == null) {
                            conversationAdditional.lowPayOneside = LowPayOneside.new_();
                        }
                        if (conversationAdditional.matchInfo == null) {
                            conversationAdditional.matchInfo = ConvAdditionalMatchInfo.new_();
                        }
                        if (conversationAdditional.newMatch == null) {
                            conversationAdditional.newMatch = ExposureNewMatch.new_();
                        }
                        if (conversationAdditional.loveLetter == null) {
                            conversationAdditional.loveLetter = ConvAdditionalLoveLetter.new_();
                        }
                        if (conversationAdditional.blackList == null) {
                            conversationAdditional.blackList = BlackList.new_();
                        }
                        if (conversationAdditional.messageRelate == null) {
                            conversationAdditional.messageRelate = MessageRelate.new_();
                        }
                        if (conversationAdditional.compliment == null) {
                            conversationAdditional.compliment = ConvAdditionalCompliment.new_();
                        }
                        if (conversationAdditional.swiper == null) {
                            conversationAdditional.swiper = ConvAdditionalSwiper.new_();
                        }
                        break;
                    case Conversation.SURPRISE_LEVEL_TOP /* 10 */:
                        conversationAdditional.quickChat = (ConversationAdditionalQuickChat) nb5Var.l(ConversationAdditionalQuickChat.PROTOBUF_ADAPTER);
                        continue;
                    case 18:
                        conversationAdditional.voiceCall = (VoiceCallAdditional) nb5Var.l(VoiceCallAdditional.PROTOBUF_ADAPTER);
                        continue;
                    case 26:
                        conversationAdditional.timeLimited = (TimeLimited) nb5Var.l(TimeLimited.PROTOBUF_ADAPTER);
                        continue;
                    case 34:
                        conversationAdditional.oneSideNoMatch = (OneSideNoMatchConversation) nb5Var.l(OneSideNoMatchConversation.PROTOBUF_ADAPTER);
                        continue;
                    case 42:
                        conversationAdditional.oneSide = (ConversationAdditionalOneSide) nb5Var.l(ConversationAdditionalOneSide.PROTOBUF_ADAPTER);
                        continue;
                    case Conversation.EXPOSURE_LEVEL_TOP /* 50 */:
                        conversationAdditional.kankan = (ConversationAdditionalKanKanContent) nb5Var.l(ConversationAdditionalKanKanContent.PROTOBUF_ADAPTER);
                        continue;
                    case 58:
                        conversationAdditional.feedStateCounter = (CoreFeedStateCounter) nb5Var.l(CoreFeedStateCounter.PROTOBUF_ADAPTER);
                        continue;
                    case 66:
                        conversationAdditional.suggestedTimeLimitedMatch = (SuggestedTimeLimitedMatch) nb5Var.l(SuggestedTimeLimitedMatch.PROTOBUF_ADAPTER);
                        continue;
                    case 74:
                        conversationAdditional.heartbeatMatch = (HeartbeatMatch) nb5Var.l(HeartbeatMatch.PROTOBUF_ADAPTER);
                        continue;
                    case 82:
                        conversationAdditional.avatarSummary = (AvatarSummaryCounter) nb5Var.l(AvatarSummaryCounter.PROTOBUF_ADAPTER);
                        continue;
                    case Conversation.LEVEL_TOP_PLATINUM /* 90 */:
                        conversationAdditional.feedInteractionCounter = (CoreInteractionMessageCounter) nb5Var.l(CoreInteractionMessageCounter.PROTOBUF_ADAPTER);
                        continue;
                    case 98:
                        conversationAdditional.liveVirtualVoice = (VirtualVoiceGroupConversationCell) nb5Var.l(VirtualVoiceGroupConversationCell.PROTOBUF_ADAPTER);
                        continue;
                    case 106:
                        conversationAdditional.localMomentInfo = (ConversationMomentInfo) nb5Var.l(ConversationMomentInfo.PROTOBUF_ADAPTER);
                        continue;
                    case 114:
                        conversationAdditional.liveActivity = (LiveActivityConversation) nb5Var.l(LiveActivityConversation.PROTOBUF_ADAPTER);
                        continue;
                    case 122:
                        conversationAdditional.game = (ConversationGame) nb5Var.l(ConversationGame.PROTOBUF_ADAPTER);
                        continue;
                    case 130:
                        conversationAdditional.tag = (ConversationAdditionalTag) nb5Var.l(ConversationAdditionalTag.PROTOBUF_ADAPTER);
                        continue;
                    case 138:
                        conversationAdditional.chatAssistantQuestion = (ConversationAdditionalChatAssistantQuestion) nb5Var.l(ConversationAdditionalChatAssistantQuestion.PROTOBUF_ADAPTER);
                        continue;
                    case 146:
                        conversationAdditional.continuousChat = (ContinuousChat) nb5Var.l(ContinuousChat.PROTOBUF_ADAPTER);
                        continue;
                    case 154:
                        conversationAdditional.pinChat = (PlatinumPinChat) nb5Var.l(PlatinumPinChat.PROTOBUF_ADAPTER);
                        continue;
                    case 162:
                        conversationAdditional.reSwipe = (ReSwipeInfo) nb5Var.l(ReSwipeInfo.PROTOBUF_ADAPTER);
                        continue;
                    case 170:
                        conversationAdditional.blindbox = (GrowthConversationBlindBox) nb5Var.l(GrowthConversationBlindBox.PROTOBUF_ADAPTER);
                        continue;
                    case 178:
                        conversationAdditional.previewTexts = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 186:
                        conversationAdditional.greetingInfo = (GreetingInfo) nb5Var.l(GreetingInfo.PROTOBUF_ADAPTER);
                        continue;
                    case 194:
                        conversationAdditional.fateRadar = (ConversationAdditionalFateRadar) nb5Var.l(ConversationAdditionalFateRadar.PROTOBUF_ADAPTER);
                        continue;
                    case 202:
                        conversationAdditional.lowPayOneside = (LowPayOneside) nb5Var.l(LowPayOneside.PROTOBUF_ADAPTER);
                        continue;
                    case 210:
                        conversationAdditional.matchInfo = (ConvAdditionalMatchInfo) nb5Var.l(ConvAdditionalMatchInfo.PROTOBUF_ADAPTER);
                        continue;
                    case 218:
                        conversationAdditional.newMatch = (ExposureNewMatch) nb5Var.l(ExposureNewMatch.PROTOBUF_ADAPTER);
                        continue;
                    case 226:
                        conversationAdditional.loveLetter = (ConvAdditionalLoveLetter) nb5Var.l(ConvAdditionalLoveLetter.PROTOBUF_ADAPTER);
                        continue;
                    case 234:
                        conversationAdditional.chatMM = (ChatMM) nb5Var.l(ChatMM.PROTOBUF_ADAPTER);
                        continue;
                    case 242:
                        conversationAdditional.blackList = (BlackList) nb5Var.l(BlackList.PROTOBUF_ADAPTER);
                        continue;
                    case 250:
                        conversationAdditional.messageRelate = (MessageRelate) nb5Var.l(MessageRelate.PROTOBUF_ADAPTER);
                        continue;
                    case 258:
                        conversationAdditional.compliment = (ConvAdditionalCompliment) nb5Var.l(ConvAdditionalCompliment.PROTOBUF_ADAPTER);
                        continue;
                    case 266:
                        conversationAdditional.swiper = (ConvAdditionalSwiper) nb5Var.l(ConvAdditionalSwiper.PROTOBUF_ADAPTER);
                        continue;
                    default:
                        if (conversationAdditional.quickChat == null) {
                            conversationAdditional.quickChat = ConversationAdditionalQuickChat.new_();
                        }
                        if (conversationAdditional.voiceCall == null) {
                            conversationAdditional.voiceCall = VoiceCallAdditional.new_();
                        }
                        if (conversationAdditional.timeLimited == null) {
                            conversationAdditional.timeLimited = TimeLimited.new_();
                        }
                        if (conversationAdditional.oneSideNoMatch == null) {
                            conversationAdditional.oneSideNoMatch = OneSideNoMatchConversation.new_();
                        }
                        if (conversationAdditional.oneSide == null) {
                            conversationAdditional.oneSide = ConversationAdditionalOneSide.new_();
                        }
                        if (conversationAdditional.kankan == null) {
                            conversationAdditional.kankan = ConversationAdditionalKanKanContent.new_();
                        }
                        if (conversationAdditional.feedStateCounter == null) {
                            conversationAdditional.feedStateCounter = CoreFeedStateCounter.new_();
                        }
                        if (conversationAdditional.suggestedTimeLimitedMatch == null) {
                            conversationAdditional.suggestedTimeLimitedMatch = SuggestedTimeLimitedMatch.new_();
                        }
                        if (conversationAdditional.heartbeatMatch == null) {
                            conversationAdditional.heartbeatMatch = HeartbeatMatch.new_();
                        }
                        if (conversationAdditional.feedInteractionCounter == null) {
                            conversationAdditional.feedInteractionCounter = CoreInteractionMessageCounter.new_();
                        }
                        if (conversationAdditional.liveVirtualVoice == null) {
                            conversationAdditional.liveVirtualVoice = VirtualVoiceGroupConversationCell.new_();
                        }
                        if (conversationAdditional.liveActivity == null) {
                            conversationAdditional.liveActivity = LiveActivityConversation.new_();
                        }
                        if (conversationAdditional.game == null) {
                            conversationAdditional.game = ConversationGame.new_();
                        }
                        if (conversationAdditional.tag == null) {
                            conversationAdditional.tag = ConversationAdditionalTag.new_();
                        }
                        if (conversationAdditional.chatAssistantQuestion == null) {
                            conversationAdditional.chatAssistantQuestion = ConversationAdditionalChatAssistantQuestion.new_();
                        }
                        if (conversationAdditional.continuousChat == null) {
                            conversationAdditional.continuousChat = ContinuousChat.new_();
                        }
                        if (conversationAdditional.previewTexts == null) {
                            conversationAdditional.previewTexts = new ArrayList();
                        }
                        if (conversationAdditional.greetingInfo == null) {
                            conversationAdditional.greetingInfo = GreetingInfo.new_();
                        }
                        if (conversationAdditional.fateRadar == null) {
                            conversationAdditional.fateRadar = ConversationAdditionalFateRadar.new_();
                        }
                        if (conversationAdditional.lowPayOneside == null) {
                            conversationAdditional.lowPayOneside = LowPayOneside.new_();
                        }
                        if (conversationAdditional.matchInfo == null) {
                            conversationAdditional.matchInfo = ConvAdditionalMatchInfo.new_();
                        }
                        if (conversationAdditional.newMatch == null) {
                            conversationAdditional.newMatch = ExposureNewMatch.new_();
                        }
                        if (conversationAdditional.loveLetter == null) {
                            conversationAdditional.loveLetter = ConvAdditionalLoveLetter.new_();
                        }
                        if (conversationAdditional.blackList == null) {
                            conversationAdditional.blackList = BlackList.new_();
                        }
                        if (conversationAdditional.messageRelate == null) {
                            conversationAdditional.messageRelate = MessageRelate.new_();
                        }
                        if (conversationAdditional.compliment == null) {
                            conversationAdditional.compliment = ConvAdditionalCompliment.new_();
                        }
                        if (conversationAdditional.swiper == null) {
                            conversationAdditional.swiper = ConvAdditionalSwiper.new_();
                            return conversationAdditional;
                        }
                        break;
                }
            }
            return conversationAdditional;
        }

        public void serialize(ConversationAdditional conversationAdditional, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            ConversationAdditionalQuickChat conversationAdditionalQuickChat = conversationAdditional.quickChat;
            if (conversationAdditionalQuickChat != null) {
                codedOutputByteBufferNano.K(1, conversationAdditionalQuickChat, ConversationAdditionalQuickChat.PROTOBUF_ADAPTER);
            }
            VoiceCallAdditional voiceCallAdditional = conversationAdditional.voiceCall;
            if (voiceCallAdditional != null) {
                codedOutputByteBufferNano.K(2, voiceCallAdditional, VoiceCallAdditional.PROTOBUF_ADAPTER);
            }
            TimeLimited timeLimited = conversationAdditional.timeLimited;
            if (timeLimited != null) {
                codedOutputByteBufferNano.K(3, timeLimited, TimeLimited.PROTOBUF_ADAPTER);
            }
            OneSideNoMatchConversation oneSideNoMatchConversation = conversationAdditional.oneSideNoMatch;
            if (oneSideNoMatchConversation != null) {
                codedOutputByteBufferNano.K(4, oneSideNoMatchConversation, OneSideNoMatchConversation.PROTOBUF_ADAPTER);
            }
            ConversationAdditionalOneSide conversationAdditionalOneSide = conversationAdditional.oneSide;
            if (conversationAdditionalOneSide != null) {
                codedOutputByteBufferNano.K(5, conversationAdditionalOneSide, ConversationAdditionalOneSide.PROTOBUF_ADAPTER);
            }
            ConversationAdditionalKanKanContent conversationAdditionalKanKanContent = conversationAdditional.kankan;
            if (conversationAdditionalKanKanContent != null) {
                codedOutputByteBufferNano.K(6, conversationAdditionalKanKanContent, ConversationAdditionalKanKanContent.PROTOBUF_ADAPTER);
            }
            CoreFeedStateCounter coreFeedStateCounter = conversationAdditional.feedStateCounter;
            if (coreFeedStateCounter != null) {
                codedOutputByteBufferNano.K(7, coreFeedStateCounter, CoreFeedStateCounter.PROTOBUF_ADAPTER);
            }
            SuggestedTimeLimitedMatch suggestedTimeLimitedMatch = conversationAdditional.suggestedTimeLimitedMatch;
            if (suggestedTimeLimitedMatch != null) {
                codedOutputByteBufferNano.K(8, suggestedTimeLimitedMatch, SuggestedTimeLimitedMatch.PROTOBUF_ADAPTER);
            }
            HeartbeatMatch heartbeatMatch = conversationAdditional.heartbeatMatch;
            if (heartbeatMatch != null) {
                codedOutputByteBufferNano.K(9, heartbeatMatch, HeartbeatMatch.PROTOBUF_ADAPTER);
            }
            AvatarSummaryCounter avatarSummaryCounter = conversationAdditional.avatarSummary;
            if (avatarSummaryCounter != null) {
                codedOutputByteBufferNano.K(10, avatarSummaryCounter, AvatarSummaryCounter.PROTOBUF_ADAPTER);
            }
            CoreInteractionMessageCounter coreInteractionMessageCounter = conversationAdditional.feedInteractionCounter;
            if (coreInteractionMessageCounter != null) {
                codedOutputByteBufferNano.K(11, coreInteractionMessageCounter, CoreInteractionMessageCounter.PROTOBUF_ADAPTER);
            }
            VirtualVoiceGroupConversationCell virtualVoiceGroupConversationCell = conversationAdditional.liveVirtualVoice;
            if (virtualVoiceGroupConversationCell != null) {
                codedOutputByteBufferNano.K(12, virtualVoiceGroupConversationCell, VirtualVoiceGroupConversationCell.PROTOBUF_ADAPTER);
            }
            ConversationMomentInfo conversationMomentInfo = conversationAdditional.localMomentInfo;
            if (conversationMomentInfo != null) {
                codedOutputByteBufferNano.K(13, conversationMomentInfo, ConversationMomentInfo.PROTOBUF_ADAPTER);
            }
            LiveActivityConversation liveActivityConversation = conversationAdditional.liveActivity;
            if (liveActivityConversation != null) {
                codedOutputByteBufferNano.K(14, liveActivityConversation, LiveActivityConversation.PROTOBUF_ADAPTER);
            }
            ConversationGame conversationGame = conversationAdditional.game;
            if (conversationGame != null) {
                codedOutputByteBufferNano.K(15, conversationGame, ConversationGame.PROTOBUF_ADAPTER);
            }
            ConversationAdditionalTag conversationAdditionalTag = conversationAdditional.tag;
            if (conversationAdditionalTag != null) {
                codedOutputByteBufferNano.K(16, conversationAdditionalTag, ConversationAdditionalTag.PROTOBUF_ADAPTER);
            }
            ConversationAdditionalChatAssistantQuestion conversationAdditionalChatAssistantQuestion = conversationAdditional.chatAssistantQuestion;
            if (conversationAdditionalChatAssistantQuestion != null) {
                codedOutputByteBufferNano.K(17, conversationAdditionalChatAssistantQuestion, ConversationAdditionalChatAssistantQuestion.PROTOBUF_ADAPTER);
            }
            ContinuousChat continuousChat = conversationAdditional.continuousChat;
            if (continuousChat != null) {
                codedOutputByteBufferNano.K(18, continuousChat, ContinuousChat.PROTOBUF_ADAPTER);
            }
            PlatinumPinChat platinumPinChat = conversationAdditional.pinChat;
            if (platinumPinChat != null) {
                codedOutputByteBufferNano.K(19, platinumPinChat, PlatinumPinChat.PROTOBUF_ADAPTER);
            }
            ReSwipeInfo reSwipeInfo = conversationAdditional.reSwipe;
            if (reSwipeInfo != null) {
                codedOutputByteBufferNano.K(20, reSwipeInfo, ReSwipeInfo.PROTOBUF_ADAPTER);
            }
            GrowthConversationBlindBox growthConversationBlindBox = conversationAdditional.blindbox;
            if (growthConversationBlindBox != null) {
                codedOutputByteBufferNano.K(21, growthConversationBlindBox, GrowthConversationBlindBox.PROTOBUF_ADAPTER);
            }
            List<String> list = conversationAdditional.previewTexts;
            if (list != null) {
                codedOutputByteBufferNano.K(22, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            GreetingInfo greetingInfo = conversationAdditional.greetingInfo;
            if (greetingInfo != null) {
                codedOutputByteBufferNano.K(23, greetingInfo, GreetingInfo.PROTOBUF_ADAPTER);
            }
            ConversationAdditionalFateRadar conversationAdditionalFateRadar = conversationAdditional.fateRadar;
            if (conversationAdditionalFateRadar != null) {
                codedOutputByteBufferNano.K(24, conversationAdditionalFateRadar, ConversationAdditionalFateRadar.PROTOBUF_ADAPTER);
            }
            LowPayOneside lowPayOneside = conversationAdditional.lowPayOneside;
            if (lowPayOneside != null) {
                codedOutputByteBufferNano.K(25, lowPayOneside, LowPayOneside.PROTOBUF_ADAPTER);
            }
            ConvAdditionalMatchInfo convAdditionalMatchInfo = conversationAdditional.matchInfo;
            if (convAdditionalMatchInfo != null) {
                codedOutputByteBufferNano.K(26, convAdditionalMatchInfo, ConvAdditionalMatchInfo.PROTOBUF_ADAPTER);
            }
            ExposureNewMatch exposureNewMatch = conversationAdditional.newMatch;
            if (exposureNewMatch != null) {
                codedOutputByteBufferNano.K(27, exposureNewMatch, ExposureNewMatch.PROTOBUF_ADAPTER);
            }
            ConvAdditionalLoveLetter convAdditionalLoveLetter = conversationAdditional.loveLetter;
            if (convAdditionalLoveLetter != null) {
                codedOutputByteBufferNano.K(28, convAdditionalLoveLetter, ConvAdditionalLoveLetter.PROTOBUF_ADAPTER);
            }
            ChatMM chatMM = conversationAdditional.chatMM;
            if (chatMM != null) {
                codedOutputByteBufferNano.K(29, chatMM, ChatMM.PROTOBUF_ADAPTER);
            }
            BlackList blackList = conversationAdditional.blackList;
            if (blackList != null) {
                codedOutputByteBufferNano.K(30, blackList, BlackList.PROTOBUF_ADAPTER);
            }
            MessageRelate messageRelate = conversationAdditional.messageRelate;
            if (messageRelate != null) {
                codedOutputByteBufferNano.K(31, messageRelate, MessageRelate.PROTOBUF_ADAPTER);
            }
            ConvAdditionalCompliment convAdditionalCompliment = conversationAdditional.compliment;
            if (convAdditionalCompliment != null) {
                codedOutputByteBufferNano.K(32, convAdditionalCompliment, ConvAdditionalCompliment.PROTOBUF_ADAPTER);
            }
            ConvAdditionalSwiper convAdditionalSwiper = conversationAdditional.swiper;
            if (convAdditionalSwiper != null) {
                codedOutputByteBufferNano.K(33, convAdditionalSwiper, ConvAdditionalSwiper.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<ConversationAdditional> JSON_ADAPTER = new ObjectJsonAdapter<ConversationAdditional>() { // from class: com.p1.mobile.putong.core.data.ConversationAdditional.2
        public Class getDataClass() {
            return ConversationAdditional.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ConversationAdditional m12320newInstance() {
            return new ConversationAdditional();
        }

        public boolean parseField(ConversationAdditional conversationAdditional, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "messageRelate":
                    conversationAdditional.messageRelate = (MessageRelate) MessageRelate.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "loveLetter":
                    conversationAdditional.loveLetter = (ConvAdditionalLoveLetter) ConvAdditionalLoveLetter.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "continuousChat":
                    conversationAdditional.continuousChat = (ContinuousChat) ContinuousChat.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "previewTexts":
                    conversationAdditional.previewTexts = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "chatMM":
                    conversationAdditional.chatMM = (ChatMM) ChatMM.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "oneSide":
                    conversationAdditional.oneSide = (ConversationAdditionalOneSide) ConversationAdditionalOneSide.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "oneSideNoMatch":
                    conversationAdditional.oneSideNoMatch = (OneSideNoMatchConversation) OneSideNoMatchConversation.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "chatAssistantQuestion":
                    conversationAdditional.chatAssistantQuestion = (ConversationAdditionalChatAssistantQuestion) ConversationAdditionalChatAssistantQuestion.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "kankan":
                    conversationAdditional.kankan = (ConversationAdditionalKanKanContent) ConversationAdditionalKanKanContent.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "suggestedTimeLimitedMatch":
                    conversationAdditional.suggestedTimeLimitedMatch = (SuggestedTimeLimitedMatch) SuggestedTimeLimitedMatch.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "voiceCall":
                    conversationAdditional.voiceCall = (VoiceCallAdditional) VoiceCallAdditional.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "swiper":
                    conversationAdditional.swiper = (ConvAdditionalSwiper) ConvAdditionalSwiper.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "feedInteractionCounter":
                    conversationAdditional.feedInteractionCounter = (CoreInteractionMessageCounter) CoreInteractionMessageCounter.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "greetingInfo":
                    conversationAdditional.greetingInfo = (GreetingInfo) GreetingInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "blindbox":
                    conversationAdditional.blindbox = (GrowthConversationBlindBox) GrowthConversationBlindBox.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "pinChat":
                    conversationAdditional.pinChat = (PlatinumPinChat) PlatinumPinChat.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "lowPayOneside":
                    conversationAdditional.lowPayOneside = (LowPayOneside) LowPayOneside.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "compliment":
                    conversationAdditional.compliment = (ConvAdditionalCompliment) ConvAdditionalCompliment.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "feedStateCounter":
                    conversationAdditional.feedStateCounter = (CoreFeedStateCounter) CoreFeedStateCounter.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "tag":
                    conversationAdditional.tag = (ConversationAdditionalTag) ConversationAdditionalTag.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "game":
                    conversationAdditional.game = (ConversationGame) ConversationGame.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "liveActivity":
                    conversationAdditional.liveActivity = (LiveActivityConversation) LiveActivityConversation.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "fateRadar":
                    conversationAdditional.fateRadar = (ConversationAdditionalFateRadar) ConversationAdditionalFateRadar.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "liveVirtualVoice":
                    conversationAdditional.liveVirtualVoice = (VirtualVoiceGroupConversationCell) VirtualVoiceGroupConversationCell.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "matchInfo":
                    conversationAdditional.matchInfo = (ConvAdditionalMatchInfo) ConvAdditionalMatchInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "timeLimited":
                    conversationAdditional.timeLimited = (TimeLimited) TimeLimited.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "reSwipe":
                    conversationAdditional.reSwipe = (ReSwipeInfo) ReSwipeInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "quickChat":
                    conversationAdditional.quickChat = (ConversationAdditionalQuickChat) ConversationAdditionalQuickChat.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "blackList":
                    conversationAdditional.blackList = (BlackList) BlackList.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "newMatch":
                    conversationAdditional.newMatch = (ExposureNewMatch) ExposureNewMatch.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "heartbeatMatch":
                    conversationAdditional.heartbeatMatch = (HeartbeatMatch) HeartbeatMatch.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "avatarSummary":
                    conversationAdditional.avatarSummary = (AvatarSummaryCounter) AvatarSummaryCounter.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "localMomentInfo":
                    conversationAdditional.localMomentInfo = (ConversationMomentInfo) ConversationMomentInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(ConversationAdditional conversationAdditional, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "messageRelate":
                case "loveLetter":
                case "continuousChat":
                case "previewTexts":
                case "chatMM":
                case "oneSide":
                case "oneSideNoMatch":
                case "chatAssistantQuestion":
                case "kankan":
                case "suggestedTimeLimitedMatch":
                case "voiceCall":
                case "swiper":
                case "feedInteractionCounter":
                case "greetingInfo":
                case "blindbox":
                case "pinChat":
                case "lowPayOneside":
                case "compliment":
                case "feedStateCounter":
                case "tag":
                case "game":
                case "liveActivity":
                case "fateRadar":
                case "liveVirtualVoice":
                case "matchInfo":
                case "timeLimited":
                case "reSwipe":
                case "quickChat":
                case "blackList":
                case "newMatch":
                case "heartbeatMatch":
                case "avatarSummary":
                case "localMomentInfo":
                    return true;
                default:
                    return super.parseFieldCheck(conversationAdditional, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(ConversationAdditional conversationAdditional, JsonGenerator jsonGenerator) throws IOException {
            if (conversationAdditional.quickChat != null) {
                jsonGenerator.writeFieldName("quickChat");
                ConversationAdditionalQuickChat.JSON_ADAPTER.serialize(conversationAdditional.quickChat, jsonGenerator, true);
            }
            if (conversationAdditional.voiceCall != null) {
                jsonGenerator.writeFieldName("voiceCall");
                VoiceCallAdditional.JSON_ADAPTER.serialize(conversationAdditional.voiceCall, jsonGenerator, true);
            }
            if (conversationAdditional.timeLimited != null) {
                jsonGenerator.writeFieldName("timeLimited");
                TimeLimited.JSON_ADAPTER.serialize(conversationAdditional.timeLimited, jsonGenerator, true);
            }
            if (conversationAdditional.oneSideNoMatch != null) {
                jsonGenerator.writeFieldName("oneSideNoMatch");
                OneSideNoMatchConversation.JSON_ADAPTER.serialize(conversationAdditional.oneSideNoMatch, jsonGenerator, true);
            }
            if (conversationAdditional.oneSide != null) {
                jsonGenerator.writeFieldName("oneSide");
                ConversationAdditionalOneSide.JSON_ADAPTER.serialize(conversationAdditional.oneSide, jsonGenerator, true);
            }
            if (conversationAdditional.kankan != null) {
                jsonGenerator.writeFieldName("kankan");
                ConversationAdditionalKanKanContent.JSON_ADAPTER.serialize(conversationAdditional.kankan, jsonGenerator, true);
            }
            if (conversationAdditional.feedStateCounter != null) {
                jsonGenerator.writeFieldName("feedStateCounter");
                CoreFeedStateCounter.JSON_ADAPTER.serialize(conversationAdditional.feedStateCounter, jsonGenerator, true);
            }
            if (conversationAdditional.suggestedTimeLimitedMatch != null) {
                jsonGenerator.writeFieldName("suggestedTimeLimitedMatch");
                SuggestedTimeLimitedMatch.JSON_ADAPTER.serialize(conversationAdditional.suggestedTimeLimitedMatch, jsonGenerator, true);
            }
            if (conversationAdditional.heartbeatMatch != null) {
                jsonGenerator.writeFieldName("heartbeatMatch");
                HeartbeatMatch.JSON_ADAPTER.serialize(conversationAdditional.heartbeatMatch, jsonGenerator, true);
            }
            if (conversationAdditional.avatarSummary != null) {
                jsonGenerator.writeFieldName("avatarSummary");
                AvatarSummaryCounter.JSON_ADAPTER.serialize(conversationAdditional.avatarSummary, jsonGenerator, true);
            }
            if (conversationAdditional.feedInteractionCounter != null) {
                jsonGenerator.writeFieldName("feedInteractionCounter");
                CoreInteractionMessageCounter.JSON_ADAPTER.serialize(conversationAdditional.feedInteractionCounter, jsonGenerator, true);
            }
            if (conversationAdditional.liveVirtualVoice != null) {
                jsonGenerator.writeFieldName("liveVirtualVoice");
                VirtualVoiceGroupConversationCell.JSON_ADAPTER.serialize(conversationAdditional.liveVirtualVoice, jsonGenerator, true);
            }
            if (conversationAdditional.localMomentInfo != null) {
                jsonGenerator.writeFieldName("localMomentInfo");
                ConversationMomentInfo.JSON_ADAPTER.serialize(conversationAdditional.localMomentInfo, jsonGenerator, true);
            }
            if (conversationAdditional.liveActivity != null) {
                jsonGenerator.writeFieldName("liveActivity");
                LiveActivityConversation.JSON_ADAPTER.serialize(conversationAdditional.liveActivity, jsonGenerator, true);
            }
            if (conversationAdditional.game != null) {
                jsonGenerator.writeFieldName(ProfileLikeType.game);
                ConversationGame.JSON_ADAPTER.serialize(conversationAdditional.game, jsonGenerator, true);
            }
            if (conversationAdditional.tag != null) {
                jsonGenerator.writeFieldName("tag");
                ConversationAdditionalTag.JSON_ADAPTER.serialize(conversationAdditional.tag, jsonGenerator, true);
            }
            if (conversationAdditional.chatAssistantQuestion != null) {
                jsonGenerator.writeFieldName("chatAssistantQuestion");
                ConversationAdditionalChatAssistantQuestion.JSON_ADAPTER.serialize(conversationAdditional.chatAssistantQuestion, jsonGenerator, true);
            }
            if (conversationAdditional.continuousChat != null) {
                jsonGenerator.writeFieldName("continuousChat");
                ContinuousChat.JSON_ADAPTER.serialize(conversationAdditional.continuousChat, jsonGenerator, true);
            }
            if (conversationAdditional.pinChat != null) {
                jsonGenerator.writeFieldName(SummarizedPrivilegesId.pinChat);
                PlatinumPinChat.JSON_ADAPTER.serialize(conversationAdditional.pinChat, jsonGenerator, true);
            }
            if (conversationAdditional.reSwipe != null) {
                jsonGenerator.writeFieldName("reSwipe");
                ReSwipeInfo.JSON_ADAPTER.serialize(conversationAdditional.reSwipe, jsonGenerator, true);
            }
            if (conversationAdditional.blindbox != null) {
                jsonGenerator.writeFieldName("blindbox");
                GrowthConversationBlindBox.JSON_ADAPTER.serialize(conversationAdditional.blindbox, jsonGenerator, true);
            }
            if (conversationAdditional.previewTexts != null) {
                jsonGenerator.writeFieldName("previewTexts");
                JsonAdapter.serializeArray(conversationAdditional.previewTexts, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (conversationAdditional.greetingInfo != null) {
                jsonGenerator.writeFieldName("greetingInfo");
                GreetingInfo.JSON_ADAPTER.serialize(conversationAdditional.greetingInfo, jsonGenerator, true);
            }
            if (conversationAdditional.fateRadar != null) {
                jsonGenerator.writeFieldName("fateRadar");
                ConversationAdditionalFateRadar.JSON_ADAPTER.serialize(conversationAdditional.fateRadar, jsonGenerator, true);
            }
            if (conversationAdditional.lowPayOneside != null) {
                jsonGenerator.writeFieldName("lowPayOneside");
                LowPayOneside.JSON_ADAPTER.serialize(conversationAdditional.lowPayOneside, jsonGenerator, true);
            }
            if (conversationAdditional.matchInfo != null) {
                jsonGenerator.writeFieldName("matchInfo");
                ConvAdditionalMatchInfo.JSON_ADAPTER.serialize(conversationAdditional.matchInfo, jsonGenerator, true);
            }
            if (conversationAdditional.newMatch != null) {
                jsonGenerator.writeFieldName(FriendSuggestReason.newMatch);
                ExposureNewMatch.JSON_ADAPTER.serialize(conversationAdditional.newMatch, jsonGenerator, true);
            }
            if (conversationAdditional.loveLetter != null) {
                jsonGenerator.writeFieldName("loveLetter");
                ConvAdditionalLoveLetter.JSON_ADAPTER.serialize(conversationAdditional.loveLetter, jsonGenerator, true);
            }
            if (conversationAdditional.chatMM != null) {
                jsonGenerator.writeFieldName("chatMM");
                ChatMM.JSON_ADAPTER.serialize(conversationAdditional.chatMM, jsonGenerator, true);
            }
            if (conversationAdditional.blackList != null) {
                jsonGenerator.writeFieldName("blackList");
                BlackList.JSON_ADAPTER.serialize(conversationAdditional.blackList, jsonGenerator, true);
            }
            if (conversationAdditional.messageRelate != null) {
                jsonGenerator.writeFieldName("messageRelate");
                MessageRelate.JSON_ADAPTER.serialize(conversationAdditional.messageRelate, jsonGenerator, true);
            }
            if (conversationAdditional.compliment != null) {
                jsonGenerator.writeFieldName("compliment");
                ConvAdditionalCompliment.JSON_ADAPTER.serialize(conversationAdditional.compliment, jsonGenerator, true);
            }
            if (conversationAdditional.swiper != null) {
                jsonGenerator.writeFieldName(ConversationType.swiper);
                ConvAdditionalSwiper.JSON_ADAPTER.serialize(conversationAdditional.swiper, jsonGenerator, true);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ConversationAdditional) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ConversationAdditional) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m98a(String str) {
        return str;
    }

    public static ConversationAdditional new_() {
        ConversationAdditional conversationAdditional = new ConversationAdditional();
        conversationAdditional.nullCheck();
        return conversationAdditional;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ConversationAdditional m12318clone() {
        ConversationAdditional conversationAdditional = new ConversationAdditional();
        ConversationAdditionalQuickChat conversationAdditionalQuickChat = this.quickChat;
        if (conversationAdditionalQuickChat != null) {
            conversationAdditional.quickChat = conversationAdditionalQuickChat.m12342clone();
        }
        VoiceCallAdditional voiceCallAdditional = this.voiceCall;
        if (voiceCallAdditional != null) {
            conversationAdditional.voiceCall = voiceCallAdditional.m16270clone();
        }
        TimeLimited timeLimited = this.timeLimited;
        if (timeLimited != null) {
            conversationAdditional.timeLimited = timeLimited.m16007clone();
        }
        OneSideNoMatchConversation oneSideNoMatchConversation = this.oneSideNoMatch;
        if (oneSideNoMatchConversation != null) {
            conversationAdditional.oneSideNoMatch = oneSideNoMatchConversation.m14656clone();
        }
        ConversationAdditionalOneSide conversationAdditionalOneSide = this.oneSide;
        if (conversationAdditionalOneSide != null) {
            conversationAdditional.oneSide = conversationAdditionalOneSide.m12338clone();
        }
        ConversationAdditionalKanKanContent conversationAdditionalKanKanContent = this.kankan;
        if (conversationAdditionalKanKanContent != null) {
            conversationAdditional.kankan = conversationAdditionalKanKanContent.m12330clone();
        }
        CoreFeedStateCounter coreFeedStateCounter = this.feedStateCounter;
        if (coreFeedStateCounter != null) {
            conversationAdditional.feedStateCounter = coreFeedStateCounter.m12468clone();
        }
        SuggestedTimeLimitedMatch suggestedTimeLimitedMatch = this.suggestedTimeLimitedMatch;
        if (suggestedTimeLimitedMatch != null) {
            conversationAdditional.suggestedTimeLimitedMatch = suggestedTimeLimitedMatch.m15811clone();
        }
        HeartbeatMatch heartbeatMatch = this.heartbeatMatch;
        if (heartbeatMatch != null) {
            conversationAdditional.heartbeatMatch = heartbeatMatch.m13246clone();
        }
        AvatarSummaryCounter avatarSummaryCounter = this.avatarSummary;
        if (avatarSummaryCounter != null) {
            conversationAdditional.avatarSummary = avatarSummaryCounter.m11686clone();
        }
        CoreInteractionMessageCounter coreInteractionMessageCounter = this.feedInteractionCounter;
        if (coreInteractionMessageCounter != null) {
            conversationAdditional.feedInteractionCounter = coreInteractionMessageCounter.m12502clone();
        }
        VirtualVoiceGroupConversationCell virtualVoiceGroupConversationCell = this.liveVirtualVoice;
        if (virtualVoiceGroupConversationCell != null) {
            conversationAdditional.liveVirtualVoice = virtualVoiceGroupConversationCell.clone();
        }
        ConversationMomentInfo conversationMomentInfo = this.localMomentInfo;
        if (conversationMomentInfo != null) {
            conversationAdditional.localMomentInfo = conversationMomentInfo.m12392clone();
        }
        LiveActivityConversation liveActivityConversation = this.liveActivity;
        if (liveActivityConversation != null) {
            conversationAdditional.liveActivity = liveActivityConversation.clone();
        }
        ConversationGame conversationGame = this.game;
        if (conversationGame != null) {
            conversationAdditional.game = conversationGame.m12364clone();
        }
        ConversationAdditionalTag conversationAdditionalTag = this.tag;
        if (conversationAdditionalTag != null) {
            conversationAdditional.tag = conversationAdditionalTag.m12346clone();
        }
        ConversationAdditionalChatAssistantQuestion conversationAdditionalChatAssistantQuestion = this.chatAssistantQuestion;
        if (conversationAdditionalChatAssistantQuestion != null) {
            conversationAdditional.chatAssistantQuestion = conversationAdditionalChatAssistantQuestion.m12322clone();
        }
        ContinuousChat continuousChat = this.continuousChat;
        if (continuousChat != null) {
            conversationAdditional.continuousChat = continuousChat.m12272clone();
        }
        PlatinumPinChat platinumPinChat = this.pinChat;
        if (platinumPinChat != null) {
            conversationAdditional.pinChat = platinumPinChat.m14820clone();
        }
        ReSwipeInfo reSwipeInfo = this.reSwipe;
        if (reSwipeInfo != null) {
            conversationAdditional.reSwipe = reSwipeInfo.m15240clone();
        }
        GrowthConversationBlindBox growthConversationBlindBox = this.blindbox;
        if (growthConversationBlindBox != null) {
            conversationAdditional.blindbox = growthConversationBlindBox.m13126clone();
        }
        List<String> list = this.previewTexts;
        if (list != null) {
            conversationAdditional.previewTexts = ValueObject.util_map(list, new w9j() { // from class: l.q36
                public final Object call(Object obj) {
                    return ConversationAdditional.m98a((String) obj);
                }
            });
        }
        GreetingInfo greetingInfo = this.greetingInfo;
        if (greetingInfo != null) {
            conversationAdditional.greetingInfo = greetingInfo.m13028clone();
        }
        ConversationAdditionalFateRadar conversationAdditionalFateRadar = this.fateRadar;
        if (conversationAdditionalFateRadar != null) {
            conversationAdditional.fateRadar = conversationAdditionalFateRadar.m12326clone();
        }
        LowPayOneside lowPayOneside = this.lowPayOneside;
        if (lowPayOneside != null) {
            conversationAdditional.lowPayOneside = lowPayOneside.m14024clone();
        }
        ConvAdditionalMatchInfo convAdditionalMatchInfo = this.matchInfo;
        if (convAdditionalMatchInfo != null) {
            conversationAdditional.matchInfo = convAdditionalMatchInfo.m12300clone();
        }
        ExposureNewMatch exposureNewMatch = this.newMatch;
        if (exposureNewMatch != null) {
            conversationAdditional.newMatch = exposureNewMatch.m12680clone();
        }
        ConvAdditionalLoveLetter convAdditionalLoveLetter = this.loveLetter;
        if (convAdditionalLoveLetter != null) {
            conversationAdditional.loveLetter = convAdditionalLoveLetter.m12292clone();
        }
        ChatMM chatMM = this.chatMM;
        if (chatMM != null) {
            conversationAdditional.chatMM = chatMM.m12072clone();
        }
        BlackList blackList = this.blackList;
        if (blackList != null) {
            conversationAdditional.blackList = blackList.m11758clone();
        }
        MessageRelate messageRelate = this.messageRelate;
        if (messageRelate != null) {
            conversationAdditional.messageRelate = messageRelate.m14260clone();
        }
        ConvAdditionalCompliment convAdditionalCompliment = this.compliment;
        if (convAdditionalCompliment != null) {
            conversationAdditional.compliment = convAdditionalCompliment.m12288clone();
        }
        ConvAdditionalSwiper convAdditionalSwiper = this.swiper;
        if (convAdditionalSwiper != null) {
            conversationAdditional.swiper = convAdditionalSwiper.m12304clone();
        }
        return conversationAdditional;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConversationAdditional)) {
            return false;
        }
        ConversationAdditional conversationAdditional = (ConversationAdditional) obj;
        return ValueObject.util_equals(this.quickChat, conversationAdditional.quickChat) && ValueObject.util_equals(this.voiceCall, conversationAdditional.voiceCall) && ValueObject.util_equals(this.timeLimited, conversationAdditional.timeLimited) && ValueObject.util_equals(this.oneSideNoMatch, conversationAdditional.oneSideNoMatch) && ValueObject.util_equals(this.oneSide, conversationAdditional.oneSide) && ValueObject.util_equals(this.kankan, conversationAdditional.kankan) && ValueObject.util_equals(this.feedStateCounter, conversationAdditional.feedStateCounter) && ValueObject.util_equals(this.suggestedTimeLimitedMatch, conversationAdditional.suggestedTimeLimitedMatch) && ValueObject.util_equals(this.heartbeatMatch, conversationAdditional.heartbeatMatch) && ValueObject.util_equals(this.avatarSummary, conversationAdditional.avatarSummary) && ValueObject.util_equals(this.feedInteractionCounter, conversationAdditional.feedInteractionCounter) && ValueObject.util_equals(this.liveVirtualVoice, conversationAdditional.liveVirtualVoice) && ValueObject.util_equals(this.localMomentInfo, conversationAdditional.localMomentInfo) && ValueObject.util_equals(this.liveActivity, conversationAdditional.liveActivity) && ValueObject.util_equals(this.game, conversationAdditional.game) && ValueObject.util_equals(this.tag, conversationAdditional.tag) && ValueObject.util_equals(this.chatAssistantQuestion, conversationAdditional.chatAssistantQuestion) && ValueObject.util_equals(this.continuousChat, conversationAdditional.continuousChat) && ValueObject.util_equals(this.pinChat, conversationAdditional.pinChat) && ValueObject.util_equals(this.reSwipe, conversationAdditional.reSwipe) && ValueObject.util_equals(this.blindbox, conversationAdditional.blindbox) && ValueObject.util_equals(this.previewTexts, conversationAdditional.previewTexts) && ValueObject.util_equals(this.greetingInfo, conversationAdditional.greetingInfo) && ValueObject.util_equals(this.fateRadar, conversationAdditional.fateRadar) && ValueObject.util_equals(this.lowPayOneside, conversationAdditional.lowPayOneside) && ValueObject.util_equals(this.matchInfo, conversationAdditional.matchInfo) && ValueObject.util_equals(this.newMatch, conversationAdditional.newMatch) && ValueObject.util_equals(this.loveLetter, conversationAdditional.loveLetter) && ValueObject.util_equals(this.chatMM, conversationAdditional.chatMM) && ValueObject.util_equals(this.blackList, conversationAdditional.blackList) && ValueObject.util_equals(this.messageRelate, conversationAdditional.messageRelate) && ValueObject.util_equals(this.compliment, conversationAdditional.compliment) && ValueObject.util_equals(this.swiper, conversationAdditional.swiper);
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
        ConversationAdditionalQuickChat conversationAdditionalQuickChat = this.quickChat;
        int iHashCode = (i2 + (conversationAdditionalQuickChat != null ? conversationAdditionalQuickChat.hashCode() : 0)) * 41;
        VoiceCallAdditional voiceCallAdditional = this.voiceCall;
        int iHashCode2 = (iHashCode + (voiceCallAdditional != null ? voiceCallAdditional.hashCode() : 0)) * 41;
        TimeLimited timeLimited = this.timeLimited;
        int iHashCode3 = (iHashCode2 + (timeLimited != null ? timeLimited.hashCode() : 0)) * 41;
        OneSideNoMatchConversation oneSideNoMatchConversation = this.oneSideNoMatch;
        int iHashCode4 = (iHashCode3 + (oneSideNoMatchConversation != null ? oneSideNoMatchConversation.hashCode() : 0)) * 41;
        ConversationAdditionalOneSide conversationAdditionalOneSide = this.oneSide;
        int iHashCode5 = (iHashCode4 + (conversationAdditionalOneSide != null ? conversationAdditionalOneSide.hashCode() : 0)) * 41;
        ConversationAdditionalKanKanContent conversationAdditionalKanKanContent = this.kankan;
        int iHashCode6 = (iHashCode5 + (conversationAdditionalKanKanContent != null ? conversationAdditionalKanKanContent.hashCode() : 0)) * 41;
        CoreFeedStateCounter coreFeedStateCounter = this.feedStateCounter;
        int iHashCode7 = (iHashCode6 + (coreFeedStateCounter != null ? coreFeedStateCounter.hashCode() : 0)) * 41;
        SuggestedTimeLimitedMatch suggestedTimeLimitedMatch = this.suggestedTimeLimitedMatch;
        int iHashCode8 = (iHashCode7 + (suggestedTimeLimitedMatch != null ? suggestedTimeLimitedMatch.hashCode() : 0)) * 41;
        HeartbeatMatch heartbeatMatch = this.heartbeatMatch;
        int iHashCode9 = (iHashCode8 + (heartbeatMatch != null ? heartbeatMatch.hashCode() : 0)) * 41;
        AvatarSummaryCounter avatarSummaryCounter = this.avatarSummary;
        int iHashCode10 = (iHashCode9 + (avatarSummaryCounter != null ? avatarSummaryCounter.hashCode() : 0)) * 41;
        CoreInteractionMessageCounter coreInteractionMessageCounter = this.feedInteractionCounter;
        int iHashCode11 = (iHashCode10 + (coreInteractionMessageCounter != null ? coreInteractionMessageCounter.hashCode() : 0)) * 41;
        VirtualVoiceGroupConversationCell virtualVoiceGroupConversationCell = this.liveVirtualVoice;
        int iHashCode12 = (iHashCode11 + (virtualVoiceGroupConversationCell != null ? virtualVoiceGroupConversationCell.hashCode() : 0)) * 41;
        ConversationMomentInfo conversationMomentInfo = this.localMomentInfo;
        int iHashCode13 = (iHashCode12 + (conversationMomentInfo != null ? conversationMomentInfo.hashCode() : 0)) * 41;
        LiveActivityConversation liveActivityConversation = this.liveActivity;
        int iHashCode14 = (iHashCode13 + (liveActivityConversation != null ? liveActivityConversation.hashCode() : 0)) * 41;
        ConversationGame conversationGame = this.game;
        int iHashCode15 = (iHashCode14 + (conversationGame != null ? conversationGame.hashCode() : 0)) * 41;
        ConversationAdditionalTag conversationAdditionalTag = this.tag;
        int iHashCode16 = (iHashCode15 + (conversationAdditionalTag != null ? conversationAdditionalTag.hashCode() : 0)) * 41;
        ConversationAdditionalChatAssistantQuestion conversationAdditionalChatAssistantQuestion = this.chatAssistantQuestion;
        int iHashCode17 = (iHashCode16 + (conversationAdditionalChatAssistantQuestion != null ? conversationAdditionalChatAssistantQuestion.hashCode() : 0)) * 41;
        ContinuousChat continuousChat = this.continuousChat;
        int iHashCode18 = (iHashCode17 + (continuousChat != null ? continuousChat.hashCode() : 0)) * 41;
        PlatinumPinChat platinumPinChat = this.pinChat;
        int iHashCode19 = (iHashCode18 + (platinumPinChat != null ? platinumPinChat.hashCode() : 0)) * 41;
        ReSwipeInfo reSwipeInfo = this.reSwipe;
        int iHashCode20 = (iHashCode19 + (reSwipeInfo != null ? reSwipeInfo.hashCode() : 0)) * 41;
        GrowthConversationBlindBox growthConversationBlindBox = this.blindbox;
        int iHashCode21 = (iHashCode20 + (growthConversationBlindBox != null ? growthConversationBlindBox.hashCode() : 0)) * 41;
        List<String> list = this.previewTexts;
        int iHashCode22 = (iHashCode21 + (list != null ? list.hashCode() : 0)) * 41;
        GreetingInfo greetingInfo = this.greetingInfo;
        int iHashCode23 = (iHashCode22 + (greetingInfo != null ? greetingInfo.hashCode() : 0)) * 41;
        ConversationAdditionalFateRadar conversationAdditionalFateRadar = this.fateRadar;
        int iHashCode24 = (iHashCode23 + (conversationAdditionalFateRadar != null ? conversationAdditionalFateRadar.hashCode() : 0)) * 41;
        LowPayOneside lowPayOneside = this.lowPayOneside;
        int iHashCode25 = (iHashCode24 + (lowPayOneside != null ? lowPayOneside.hashCode() : 0)) * 41;
        ConvAdditionalMatchInfo convAdditionalMatchInfo = this.matchInfo;
        int iHashCode26 = (iHashCode25 + (convAdditionalMatchInfo != null ? convAdditionalMatchInfo.hashCode() : 0)) * 41;
        ExposureNewMatch exposureNewMatch = this.newMatch;
        int iHashCode27 = (iHashCode26 + (exposureNewMatch != null ? exposureNewMatch.hashCode() : 0)) * 41;
        ConvAdditionalLoveLetter convAdditionalLoveLetter = this.loveLetter;
        int iHashCode28 = (iHashCode27 + (convAdditionalLoveLetter != null ? convAdditionalLoveLetter.hashCode() : 0)) * 41;
        ChatMM chatMM = this.chatMM;
        int iHashCode29 = (iHashCode28 + (chatMM != null ? chatMM.hashCode() : 0)) * 41;
        BlackList blackList = this.blackList;
        int iHashCode30 = (iHashCode29 + (blackList != null ? blackList.hashCode() : 0)) * 41;
        MessageRelate messageRelate = this.messageRelate;
        int iHashCode31 = (iHashCode30 + (messageRelate != null ? messageRelate.hashCode() : 0)) * 41;
        ConvAdditionalCompliment convAdditionalCompliment = this.compliment;
        int iHashCode32 = (iHashCode31 + (convAdditionalCompliment != null ? convAdditionalCompliment.hashCode() : 0)) * 41;
        ConvAdditionalSwiper convAdditionalSwiper = this.swiper;
        int iHashCode33 = iHashCode32 + (convAdditionalSwiper != null ? convAdditionalSwiper.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode33;
        return iHashCode33;
    }

    public void nullCheck() {
        if (this.quickChat == null) {
            this.quickChat = ConversationAdditionalQuickChat.new_();
        }
        if (this.voiceCall == null) {
            this.voiceCall = VoiceCallAdditional.new_();
        }
        if (this.timeLimited == null) {
            this.timeLimited = TimeLimited.new_();
        }
        if (this.oneSideNoMatch == null) {
            this.oneSideNoMatch = OneSideNoMatchConversation.new_();
        }
        if (this.oneSide == null) {
            this.oneSide = ConversationAdditionalOneSide.new_();
        }
        if (this.kankan == null) {
            this.kankan = ConversationAdditionalKanKanContent.new_();
        }
        if (this.feedStateCounter == null) {
            this.feedStateCounter = CoreFeedStateCounter.new_();
        }
        if (this.suggestedTimeLimitedMatch == null) {
            this.suggestedTimeLimitedMatch = SuggestedTimeLimitedMatch.new_();
        }
        if (this.heartbeatMatch == null) {
            this.heartbeatMatch = HeartbeatMatch.new_();
        }
        if (this.feedInteractionCounter == null) {
            this.feedInteractionCounter = CoreInteractionMessageCounter.new_();
        }
        if (this.liveVirtualVoice == null) {
            this.liveVirtualVoice = VirtualVoiceGroupConversationCell.new_();
        }
        if (this.liveActivity == null) {
            this.liveActivity = LiveActivityConversation.new_();
        }
        if (this.game == null) {
            this.game = ConversationGame.new_();
        }
        if (this.tag == null) {
            this.tag = ConversationAdditionalTag.new_();
        }
        if (this.chatAssistantQuestion == null) {
            this.chatAssistantQuestion = ConversationAdditionalChatAssistantQuestion.new_();
        }
        if (this.continuousChat == null) {
            this.continuousChat = ContinuousChat.new_();
        }
        if (this.previewTexts == null) {
            this.previewTexts = new ArrayList();
        }
        if (this.greetingInfo == null) {
            this.greetingInfo = GreetingInfo.new_();
        }
        if (this.fateRadar == null) {
            this.fateRadar = ConversationAdditionalFateRadar.new_();
        }
        if (this.lowPayOneside == null) {
            this.lowPayOneside = LowPayOneside.new_();
        }
        if (this.matchInfo == null) {
            this.matchInfo = ConvAdditionalMatchInfo.new_();
        }
        if (this.newMatch == null) {
            this.newMatch = ExposureNewMatch.new_();
        }
        if (this.loveLetter == null) {
            this.loveLetter = ConvAdditionalLoveLetter.new_();
        }
        if (this.blackList == null) {
            this.blackList = BlackList.new_();
        }
        if (this.messageRelate == null) {
            this.messageRelate = MessageRelate.new_();
        }
        if (this.compliment == null) {
            this.compliment = ConvAdditionalCompliment.new_();
        }
        if (this.swiper == null) {
            this.swiper = ConvAdditionalSwiper.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
