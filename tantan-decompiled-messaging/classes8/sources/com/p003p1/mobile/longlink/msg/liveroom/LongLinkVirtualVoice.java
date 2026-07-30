package com.p003p1.mobile.longlink.msg.liveroom;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.a;
import com.google.protobuf.e;
import com.google.protobuf.h;
import com.google.protobuf.l;
import com.google.protobuf.q;
import com.momo.xeengine.gift.XEGiftErrorCode;
import com.p003p1.mobile.longlink.msg.livechat.LongLinkChatMessage;
import com.p003p1.mobile.longlink.msg.template.Template;
import com.p003p1.mobile.longlink.msg.userMask.userMaskConfig;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;
import l.aag0;
import l.bz00;
import l.i860;
import l.o6z;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public final class LongLinkVirtualVoice {

    /* JADX INFO: renamed from: com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice$1 */
    public static /* synthetic */ class C04221 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f1679xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f1679xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1679xa1df5c61[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1679xa1df5c61[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1679xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1679xa1df5c61[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1679xa1df5c61[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1679xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f1679xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public interface BgStyleOrBuilder extends o6z {
        String getAlpha();

        ByteString getAlphaBytes();

        /* synthetic */ q getDefaultInstanceForType();

        String getEndColor();

        ByteString getEndColorBytes();

        String getStartColor();

        ByteString getStartColorBytes();

        /* synthetic */ boolean isInitialized();
    }

    public interface LuckyParadiseEntranceOrBuilder extends o6z {
        String getCrazyIcon();

        ByteString getCrazyIconBytes();

        long getCurrentTime();

        String getDefaultIcon();

        ByteString getDefaultIconBytes();

        /* synthetic */ q getDefaultInstanceForType();

        long getEndTime();

        boolean getIsCrazyNow();

        String getPoolType();

        ByteString getPoolTypeBytes();

        /* synthetic */ boolean isInitialized();
    }

    public interface StarRedpacketInfoOrBuilder extends o6z {
        /* synthetic */ q getDefaultInstanceForType();

        String getId();

        ByteString getIdBytes();

        String getRoomId();

        ByteString getRoomIdBytes();

        String getState();

        ByteString getStateBytes();

        /* synthetic */ boolean isInitialized();
    }

    public interface VoiceAdminPanelCounterMessageOrBuilder extends o6z {
        /* synthetic */ q getDefaultInstanceForType();

        VoiceAdminPanelCounterMessage.MsgType getMsgType();

        int getMsgTypeValue();

        String getRoomId();

        ByteString getRoomIdBytes();

        /* synthetic */ boolean isInitialized();
    }

    public interface VoiceAvatarFramePayGuidePopUpOrBuilder extends o6z {
        String getButtonSubTitle();

        ByteString getButtonSubTitleBytes();

        String getButtonTitle();

        ByteString getButtonTitleBytes();

        /* synthetic */ q getDefaultInstanceForType();

        userMaskConfig.UserMask getFromUserMask();

        long getGiftCount();

        long getGiftId();

        String getSubTitle();

        ByteString getSubTitleBytes();

        String getTitle();

        ByteString getTitleBytes();

        userMaskConfig.UserMask getToUserMask();

        String getUserId();

        ByteString getUserIdBytes();

        boolean hasFromUserMask();

        boolean hasToUserMask();

        /* synthetic */ boolean isInitialized();
    }

    public interface VoiceChatTopicMessageOrBuilder extends o6z {
        /* synthetic */ q getDefaultInstanceForType();

        String getTag();

        ByteString getTagBytes();

        String getTopic();

        ByteString getTopicBytes();

        /* synthetic */ boolean isInitialized();
    }

    public interface VoiceFunFairEntranceOrBuilder extends o6z {
        boolean getBuff();

        String getBuffIcon();

        ByteString getBuffIconBytes();

        String getBuffText();

        ByteString getBuffTextBytes();

        long getCurrentTime();

        String getDefaultIcon();

        ByteString getDefaultIconBytes();

        /* synthetic */ q getDefaultInstanceForType();

        long getEndTime();

        String getPoolType();

        ByteString getPoolTypeBytes();

        String getTip();

        ByteString getTipBytes();

        /* synthetic */ boolean isInitialized();
    }

    public interface VoiceGameMessageOrBuilder extends o6z {
        /* synthetic */ q getDefaultInstanceForType();

        String getGameId();

        ByteString getGameIdBytes();

        String getGameType();

        ByteString getGameTypeBytes();

        VoiceGameMessage.MsgType getMsgType();

        int getMsgTypeValue();

        /* synthetic */ boolean isInitialized();
    }

    public interface VoiceLiveGameTypeMessageOrBuilder extends o6z {
        /* synthetic */ q getDefaultInstanceForType();

        String getGameType();

        ByteString getGameTypeBytes();

        String getLiveId();

        ByteString getLiveIdBytes();

        /* synthetic */ boolean isInitialized();
    }

    public interface VoiceLiveLovePlanetUpdateOrBuilder extends o6z {
        long getCurrentTime();

        /* synthetic */ q getDefaultInstanceForType();

        VoiceLovePlanetUser getHost();

        String getLovePlanetId();

        ByteString getLovePlanetIdBytes();

        VoiceLovePlanetUser getMvp();

        VoiceLovePlanetUser getPlayers(int i);

        int getPlayersCount();

        List<VoiceLovePlanetUser> getPlayersList();

        VoiceLovePlanetTeam getTeams(int i);

        int getTeamsCount();

        List<VoiceLovePlanetTeam> getTeamsList();

        VoiceLiveLovePlanetUpdate.Type getUpdateType();

        int getUpdateTypeValue();

        boolean hasHost();

        boolean hasMvp();

        /* synthetic */ boolean isInitialized();
    }

    public interface VoiceLiveSGVAAnimationExtraOrBuilder extends o6z {
        /* synthetic */ q getDefaultInstanceForType();

        String getKey();

        ByteString getKeyBytes();

        String getTextColor();

        ByteString getTextColorBytes();

        long getTextFont();

        long getTextSize();

        long getType();

        String getValue();

        ByteString getValueBytes();

        /* synthetic */ boolean isInitialized();
    }

    public interface VoiceLiveSVGAAnimationOrBuilder extends o6z {
        VoiceLiveSGVAAnimationExtra getAnimationExtras(int i);

        int getAnimationExtrasCount();

        List<VoiceLiveSGVAAnimationExtra> getAnimationExtrasList();

        /* synthetic */ q getDefaultInstanceForType();

        String getRoomId();

        ByteString getRoomIdBytes();

        String getSvgaUrl();

        ByteString getSvgaUrlBytes();

        /* synthetic */ boolean isInitialized();
    }

    public interface VoiceLiveTemplateMessageOrBuilder extends o6z {
        /* synthetic */ q getDefaultInstanceForType();

        String getLiveId();

        ByteString getLiveIdBytes();

        String getRoomId();

        ByteString getRoomIdBytes();

        String getTemplate();

        ByteString getTemplateBytes();

        String getUserId();

        ByteString getUserIdBytes();

        /* synthetic */ boolean isInitialized();
    }

    public interface VoiceLovePlanetTeamOrBuilder extends o6z {
        /* synthetic */ q getDefaultInstanceForType();

        String getOtherUserId();

        ByteString getOtherUserIdBytes();

        String getTips();

        ByteString getTipsBytes();

        long getTotalScore();

        String getUserId();

        ByteString getUserIdBytes();

        /* synthetic */ boolean isInitialized();
    }

    public interface VoiceLovePlanetUserOrBuilder extends o6z {
        String getAvatar();

        ByteString getAvatarBytes();

        userMaskConfig.AvatarConfig getAvatarConfig();

        /* synthetic */ q getDefaultInstanceForType();

        String getGender();

        ByteString getGenderBytes();

        boolean getIsLeave();

        long getPosition();

        long getReceivedScore();

        long getSelectPosition();

        long getSendScore();

        String getUserId();

        ByteString getUserIdBytes();

        String getUserName();

        ByteString getUserNameBytes();

        boolean hasAvatarConfig();

        /* synthetic */ boolean isInitialized();
    }

    public interface VoicePayGuidePopUpOrBuilder extends o6z {
        String getBubbleTitle();

        ByteString getBubbleTitleBytes();

        String getButtonTitle();

        ByteString getButtonTitleBytes();

        /* synthetic */ q getDefaultInstanceForType();

        long getGiftCount();

        String getGiftIcon();

        ByteString getGiftIconBytes();

        long getGiftId();

        GuideType getGuideType();

        int getGuideTypeValue();

        String getRoomId();

        ByteString getRoomIdBytes();

        String getSubTitle();

        ByteString getSubTitleBytes();

        String getTitle();

        ByteString getTitleBytes();

        userMaskConfig.UserMask getToUserMask();

        String getUserId();

        ByteString getUserIdBytes();

        String getUserTag();

        ByteString getUserTagBytes();

        boolean hasToUserMask();

        /* synthetic */ boolean isInitialized();
    }

    public interface VoicePayGuideUserInfoOrBuilder extends o6z {
        int getAge();

        String getAvatar();

        ByteString getAvatarBytes();

        /* synthetic */ q getDefaultInstanceForType();

        String getGender();

        ByteString getGenderBytes();

        String getName();

        ByteString getNameBytes();

        String getUserId();

        ByteString getUserIdBytes();

        String getZodiac();

        ByteString getZodiacBytes();

        /* synthetic */ boolean isInitialized();
    }

    public interface VoicePayGuideUserOrBuilder extends o6z {
        /* synthetic */ q getDefaultInstanceForType();

        String getUserId();

        ByteString getUserIdBytes();

        /* synthetic */ boolean isInitialized();
    }

    public interface VoicePayGuideUserTagOrBuilder extends o6z {
        String getColor();

        ByteString getColorBytes();

        /* synthetic */ q getDefaultInstanceForType();

        String getText();

        ByteString getTextBytes();

        String getType();

        ByteString getTypeBytes();

        /* synthetic */ boolean isInitialized();
    }

    public interface VoicePayGuideV2PopUpOrBuilder extends o6z {
        String getBizType();

        ByteString getBizTypeBytes();

        String getBubbleTitle();

        ByteString getBubbleTitleBytes();

        String getButtonTitle();

        ByteString getButtonTitleBytes();

        /* synthetic */ q getDefaultInstanceForType();

        long getGiftCount();

        String getGiftIcon();

        ByteString getGiftIconBytes();

        long getGiftId();

        GuideType getGuideType();

        int getGuideTypeValue();

        String getRelationshipType();

        ByteString getRelationshipTypeBytes();

        String getRoomId();

        ByteString getRoomIdBytes();

        String getSubTitle();

        ByteString getSubTitleBytes();

        String getTitle();

        ByteString getTitleBytes();

        VoicePayGuideUserInfo getToUserInfo();

        String getUserId();

        ByteString getUserIdBytes();

        VoicePayGuideUserTag getUserTag();

        boolean hasToUserInfo();

        boolean hasUserTag();

        /* synthetic */ boolean isInitialized();
    }

    public interface VoiceRoomCoverOrBuilder extends o6z {
        String getCoverUrl();

        ByteString getCoverUrlBytes();

        /* synthetic */ q getDefaultInstanceForType();

        String getRoomId();

        ByteString getRoomIdBytes();

        /* synthetic */ boolean isInitialized();
    }

    public interface VoiceRoomDissolveOrBuilder extends o6z {
        /* synthetic */ q getDefaultInstanceForType();

        String getRoomId();

        ByteString getRoomIdBytes();

        String getUserId();

        ByteString getUserIdBytes();

        /* synthetic */ boolean isInitialized();
    }

    public interface VoiceRoomHeatUpdateOrBuilder extends o6z {
        /* synthetic */ q getDefaultInstanceForType();

        long getHeat();

        String getHeatIcon();

        ByteString getHeatIconBytes();

        String getHeatSvga();

        ByteString getHeatSvgaBytes();

        String getRoomId();

        ByteString getRoomIdBytes();

        long getUpdatedTime();

        /* synthetic */ boolean isInitialized();
    }

    public interface VoiceRoomLevelUpOrBuilder extends o6z {
        /* synthetic */ q getDefaultInstanceForType();

        String getEndColor();

        ByteString getEndColorBytes();

        int getLevel();

        String getLevelIcon();

        ByteString getLevelIconBytes();

        String getLevelSmallIcon();

        ByteString getLevelSmallIconBytes();

        String getRoomId();

        ByteString getRoomIdBytes();

        String getStartColor();

        ByteString getStartColorBytes();

        long getUpdatedTime();

        /* synthetic */ boolean isInitialized();
    }

    public interface VoiceRoomPersonalUpdateOrBuilder extends o6z {
        /* synthetic */ q getDefaultInstanceForType();

        boolean getIsPersonal();

        String getRoomId();

        ByteString getRoomIdBytes();

        /* synthetic */ boolean isInitialized();
    }

    public interface VoiceRoomTitleUpdateOrBuilder extends o6z {
        /* synthetic */ q getDefaultInstanceForType();

        String getRoomId();

        ByteString getRoomIdBytes();

        Template.TemplateData getTempdata();

        String getTitle();

        ByteString getTitleBytes();

        boolean hasTempdata();

        /* synthetic */ boolean isInitialized();
    }

    public interface VoiceSettleInviteMessageOrBuilder extends o6z {
        String getApplyToken();

        ByteString getApplyTokenBytes();

        /* synthetic */ q getDefaultInstanceForType();

        String getFromUserId();

        ByteString getFromUserIdBytes();

        String getFromUserName();

        ByteString getFromUserNameBytes();

        String getRoomId();

        ByteString getRoomIdBytes();

        String getUserId();

        ByteString getUserIdBytes();

        /* synthetic */ boolean isInitialized();
    }

    public interface VoiceSettleMessageOrBuilder extends o6z {
        /* synthetic */ q getDefaultInstanceForType();

        String getId();

        ByteString getIdBytes();

        VoiceSettleMessage.MsgType getMsgType();

        int getMsgTypeValue();

        String getRoomId();

        ByteString getRoomIdBytes();

        String getUserId();

        ByteString getUserIdBytes();

        /* synthetic */ boolean isInitialized();
    }

    public interface VoiceShareScreenDescOrBuilder extends o6z {
        /* synthetic */ q getDefaultInstanceForType();

        String getDesc();

        ByteString getDescBytes();

        String getId();

        ByteString getIdBytes();

        String getRoomId();

        ByteString getRoomIdBytes();

        String getUserId();

        ByteString getUserIdBytes();

        /* synthetic */ boolean isInitialized();
    }

    public interface VoiceShareScreenOrBuilder extends o6z {
        /* synthetic */ q getDefaultInstanceForType();

        String getDesc();

        ByteString getDescBytes();

        String getId();

        ByteString getIdBytes();

        float getRatio();

        String getRoomId();

        ByteString getRoomIdBytes();

        VoiceShareScreen.Status getStatus();

        int getStatusValue();

        Template.TemplateData getTemplateData();

        String getToast();

        ByteString getToastBytes();

        String getUserId();

        ByteString getUserIdBytes();

        userMaskConfig.UserMask getUserMask();

        boolean hasTemplateData();

        boolean hasUserMask();

        /* synthetic */ boolean isInitialized();
    }

    public interface VoiceStreamBizTypeMessageOrBuilder extends o6z {
        int getBizType();

        /* synthetic */ q getDefaultInstanceForType();

        String getLiveId();

        ByteString getLiveIdBytes();

        String getRoomId();

        ByteString getRoomIdBytes();

        /* synthetic */ boolean isInitialized();
    }

    public interface VoiceToneMessageOrBuilder extends o6z {
        /* synthetic */ q getDefaultInstanceForType();

        /* synthetic */ boolean isInitialized();
    }

    public interface VoiceUserGuideOrBuilder extends o6z {
        BgStyle getBgStyle();

        String getContent();

        ByteString getContentBytes();

        /* synthetic */ q getDefaultInstanceForType();

        String getGuideType();

        ByteString getGuideTypeBytes();

        String getIcon();

        ByteString getIconBytes();

        String getSchema();

        ByteString getSchemaBytes();

        long getShowSeconds();

        boolean hasBgStyle();

        /* synthetic */ boolean isInitialized();
    }

    private LongLinkVirtualVoice() {
    }

    public static void registerAllExtensions(h hVar) {
    }

    public static final class VoiceAdminPanelCounterMessage extends GeneratedMessageLite<VoiceAdminPanelCounterMessage, Builder> implements VoiceAdminPanelCounterMessageOrBuilder {
        private static final VoiceAdminPanelCounterMessage DEFAULT_INSTANCE;
        public static final int MSGTYPE_FIELD_NUMBER = 1;
        private static volatile i860<VoiceAdminPanelCounterMessage> PARSER = null;
        public static final int ROOMID_FIELD_NUMBER = 2;
        private int msgType_;
        private String roomId_ = "";

        public static final class Builder extends GeneratedMessageLite.b<VoiceAdminPanelCounterMessage, Builder> implements VoiceAdminPanelCounterMessageOrBuilder {
            private Builder() {
                super(VoiceAdminPanelCounterMessage.DEFAULT_INSTANCE);
            }

            public Builder clearMsgType() {
                copyOnWrite();
                ((VoiceAdminPanelCounterMessage) ((GeneratedMessageLite.b) this).instance).clearMsgType();
                return this;
            }

            public Builder clearRoomId() {
                copyOnWrite();
                ((VoiceAdminPanelCounterMessage) ((GeneratedMessageLite.b) this).instance).clearRoomId();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceAdminPanelCounterMessageOrBuilder
            public MsgType getMsgType() {
                return ((VoiceAdminPanelCounterMessage) ((GeneratedMessageLite.b) this).instance).getMsgType();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceAdminPanelCounterMessageOrBuilder
            public int getMsgTypeValue() {
                return ((VoiceAdminPanelCounterMessage) ((GeneratedMessageLite.b) this).instance).getMsgTypeValue();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceAdminPanelCounterMessageOrBuilder
            public String getRoomId() {
                return ((VoiceAdminPanelCounterMessage) ((GeneratedMessageLite.b) this).instance).getRoomId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceAdminPanelCounterMessageOrBuilder
            public ByteString getRoomIdBytes() {
                return ((VoiceAdminPanelCounterMessage) ((GeneratedMessageLite.b) this).instance).getRoomIdBytes();
            }

            public Builder setMsgType(MsgType msgType) {
                copyOnWrite();
                ((VoiceAdminPanelCounterMessage) ((GeneratedMessageLite.b) this).instance).setMsgType(msgType);
                return this;
            }

            public Builder setMsgTypeValue(int i) {
                copyOnWrite();
                ((VoiceAdminPanelCounterMessage) ((GeneratedMessageLite.b) this).instance).setMsgTypeValue(i);
                return this;
            }

            public Builder setRoomId(String str) {
                copyOnWrite();
                ((VoiceAdminPanelCounterMessage) ((GeneratedMessageLite.b) this).instance).setRoomId(str);
                return this;
            }

            public Builder setRoomIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceAdminPanelCounterMessage) ((GeneratedMessageLite.b) this).instance).setRoomIdBytes(byteString);
                return this;
            }
        }

        static {
            VoiceAdminPanelCounterMessage voiceAdminPanelCounterMessage = new VoiceAdminPanelCounterMessage();
            DEFAULT_INSTANCE = voiceAdminPanelCounterMessage;
            voiceAdminPanelCounterMessage.makeImmutable();
        }

        private VoiceAdminPanelCounterMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMsgType() {
            this.msgType_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRoomId() {
            this.roomId_ = getDefaultInstance().getRoomId();
        }

        public static VoiceAdminPanelCounterMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(VoiceAdminPanelCounterMessage voiceAdminPanelCounterMessage) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(voiceAdminPanelCounterMessage);
        }

        public static VoiceAdminPanelCounterMessage parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VoiceAdminPanelCounterMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceAdminPanelCounterMessage parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VoiceAdminPanelCounterMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<VoiceAdminPanelCounterMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMsgType(MsgType msgType) {
            msgType.getClass();
            this.msgType_ = msgType.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMsgTypeValue(int i) {
            this.msgType_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRoomId(String str) {
            str.getClass();
            this.roomId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRoomIdBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.roomId_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C04221.f1679xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoiceAdminPanelCounterMessage();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    VoiceAdminPanelCounterMessage voiceAdminPanelCounterMessage = (VoiceAdminPanelCounterMessage) obj2;
                    int i = this.msgType_;
                    boolean z2 = i != 0;
                    int i2 = voiceAdminPanelCounterMessage.msgType_;
                    this.msgType_ = hVar.e(z2, i, i2 != 0, i2);
                    this.roomId_ = hVar.f(!this.roomId_.isEmpty(), this.roomId_, !voiceAdminPanelCounterMessage.roomId_.isEmpty(), voiceAdminPanelCounterMessage.roomId_);
                    GeneratedMessageLite.g gVar = GeneratedMessageLite.g.INSTANCE;
                    return this;
                case 6:
                    e eVar = (e) obj;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            if (iM != 0) {
                                if (iM == 8) {
                                    this.msgType_ = eVar.p();
                                } else if (iM == 18) {
                                    this.roomId_ = eVar.L();
                                } else if (!eVar.R(iM)) {
                                }
                            }
                            z = true;
                        } catch (IOException e) {
                            aag0.a(new InvalidProtocolBufferException(e.getMessage()).setUnfinishedMessage(this));
                            return null;
                        } catch (InvalidProtocolBufferException e2) {
                            aag0.a(e2.setUnfinishedMessage(this));
                            return null;
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (PARSER == null) {
                        synchronized (VoiceAdminPanelCounterMessage.class) {
                            try {
                                if (PARSER == null) {
                                    PARSER = new GeneratedMessageLite.c(DEFAULT_INSTANCE);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return PARSER;
                default:
                    bz00.a();
                    return null;
            }
            return DEFAULT_INSTANCE;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceAdminPanelCounterMessageOrBuilder
        public MsgType getMsgType() {
            MsgType msgTypeForNumber = MsgType.forNumber(this.msgType_);
            return msgTypeForNumber == null ? MsgType.UNRECOGNIZED : msgTypeForNumber;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceAdminPanelCounterMessageOrBuilder
        public int getMsgTypeValue() {
            return this.msgType_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceAdminPanelCounterMessageOrBuilder
        public String getRoomId() {
            return this.roomId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceAdminPanelCounterMessageOrBuilder
        public ByteString getRoomIdBytes() {
            return ByteString.copyFromUtf8(this.roomId_);
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM = this.msgType_ != MsgType.refresh.getNumber() ? CodedOutputStream.m(1, this.msgType_) : 0;
            if (!this.roomId_.isEmpty()) {
                iM += CodedOutputStream.K(2, getRoomId());
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iM;
            return iM;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.msgType_ != MsgType.refresh.getNumber()) {
                codedOutputStream.i0(1, this.msgType_);
            }
            if (this.roomId_.isEmpty()) {
                return;
            }
            codedOutputStream.D0(2, getRoomId());
        }

        public enum MsgType implements l.c {
            refresh(0),
            UNRECOGNIZED(-1);

            private static final l.d<MsgType> internalValueMap = new l.d<MsgType>() { // from class: com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceAdminPanelCounterMessage.MsgType.1
                public MsgType findValueByNumber(int i) {
                    return MsgType.forNumber(i);
                }
            };
            public static final int refresh_VALUE = 0;
            private final int value;

            MsgType(int i) {
                this.value = i;
            }

            public static MsgType forNumber(int i) {
                if (i != 0) {
                    return null;
                }
                return refresh;
            }

            public static l.d<MsgType> internalGetValueMap() {
                return internalValueMap;
            }

            public final int getNumber() {
                return this.value;
            }

            @Deprecated
            public static MsgType valueOf(int i) {
                return forNumber(i);
            }
        }

        public static VoiceAdminPanelCounterMessage parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (VoiceAdminPanelCounterMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static VoiceAdminPanelCounterMessage parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (VoiceAdminPanelCounterMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static VoiceAdminPanelCounterMessage parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoiceAdminPanelCounterMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoiceAdminPanelCounterMessage parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (VoiceAdminPanelCounterMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static VoiceAdminPanelCounterMessage parseFrom(InputStream inputStream) throws IOException {
            return (VoiceAdminPanelCounterMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceAdminPanelCounterMessage parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (VoiceAdminPanelCounterMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static VoiceAdminPanelCounterMessage parseFrom(e eVar) throws IOException {
            return (VoiceAdminPanelCounterMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static VoiceAdminPanelCounterMessage parseFrom(e eVar, h hVar) throws IOException {
            return (VoiceAdminPanelCounterMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public static final class VoiceGameMessage extends GeneratedMessageLite<VoiceGameMessage, Builder> implements VoiceGameMessageOrBuilder {
        private static final VoiceGameMessage DEFAULT_INSTANCE;
        public static final int GAMEID_FIELD_NUMBER = 2;
        public static final int GAMETYPE_FIELD_NUMBER = 3;
        public static final int MSGTYPE_FIELD_NUMBER = 1;
        private static volatile i860<VoiceGameMessage> PARSER;
        private String gameId_ = "";
        private String gameType_ = "";
        private int msgType_;

        public static final class Builder extends GeneratedMessageLite.b<VoiceGameMessage, Builder> implements VoiceGameMessageOrBuilder {
            private Builder() {
                super(VoiceGameMessage.DEFAULT_INSTANCE);
            }

            public Builder clearGameId() {
                copyOnWrite();
                ((VoiceGameMessage) ((GeneratedMessageLite.b) this).instance).clearGameId();
                return this;
            }

            public Builder clearGameType() {
                copyOnWrite();
                ((VoiceGameMessage) ((GeneratedMessageLite.b) this).instance).clearGameType();
                return this;
            }

            public Builder clearMsgType() {
                copyOnWrite();
                ((VoiceGameMessage) ((GeneratedMessageLite.b) this).instance).clearMsgType();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceGameMessageOrBuilder
            public String getGameId() {
                return ((VoiceGameMessage) ((GeneratedMessageLite.b) this).instance).getGameId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceGameMessageOrBuilder
            public ByteString getGameIdBytes() {
                return ((VoiceGameMessage) ((GeneratedMessageLite.b) this).instance).getGameIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceGameMessageOrBuilder
            public String getGameType() {
                return ((VoiceGameMessage) ((GeneratedMessageLite.b) this).instance).getGameType();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceGameMessageOrBuilder
            public ByteString getGameTypeBytes() {
                return ((VoiceGameMessage) ((GeneratedMessageLite.b) this).instance).getGameTypeBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceGameMessageOrBuilder
            public MsgType getMsgType() {
                return ((VoiceGameMessage) ((GeneratedMessageLite.b) this).instance).getMsgType();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceGameMessageOrBuilder
            public int getMsgTypeValue() {
                return ((VoiceGameMessage) ((GeneratedMessageLite.b) this).instance).getMsgTypeValue();
            }

            public Builder setGameId(String str) {
                copyOnWrite();
                ((VoiceGameMessage) ((GeneratedMessageLite.b) this).instance).setGameId(str);
                return this;
            }

            public Builder setGameIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceGameMessage) ((GeneratedMessageLite.b) this).instance).setGameIdBytes(byteString);
                return this;
            }

            public Builder setGameType(String str) {
                copyOnWrite();
                ((VoiceGameMessage) ((GeneratedMessageLite.b) this).instance).setGameType(str);
                return this;
            }

            public Builder setGameTypeBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceGameMessage) ((GeneratedMessageLite.b) this).instance).setGameTypeBytes(byteString);
                return this;
            }

            public Builder setMsgType(MsgType msgType) {
                copyOnWrite();
                ((VoiceGameMessage) ((GeneratedMessageLite.b) this).instance).setMsgType(msgType);
                return this;
            }

            public Builder setMsgTypeValue(int i) {
                copyOnWrite();
                ((VoiceGameMessage) ((GeneratedMessageLite.b) this).instance).setMsgTypeValue(i);
                return this;
            }
        }

        static {
            VoiceGameMessage voiceGameMessage = new VoiceGameMessage();
            DEFAULT_INSTANCE = voiceGameMessage;
            voiceGameMessage.makeImmutable();
        }

        private VoiceGameMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGameId() {
            this.gameId_ = getDefaultInstance().getGameId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGameType() {
            this.gameType_ = getDefaultInstance().getGameType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMsgType() {
            this.msgType_ = 0;
        }

        public static VoiceGameMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(VoiceGameMessage voiceGameMessage) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(voiceGameMessage);
        }

        public static VoiceGameMessage parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VoiceGameMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceGameMessage parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VoiceGameMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<VoiceGameMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGameId(String str) {
            str.getClass();
            this.gameId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGameIdBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.gameId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGameType(String str) {
            str.getClass();
            this.gameType_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGameTypeBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.gameType_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMsgType(MsgType msgType) {
            msgType.getClass();
            this.msgType_ = msgType.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMsgTypeValue(int i) {
            this.msgType_ = i;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C04221.f1679xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoiceGameMessage();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    VoiceGameMessage voiceGameMessage = (VoiceGameMessage) obj2;
                    int i = this.msgType_;
                    boolean z2 = i != 0;
                    int i2 = voiceGameMessage.msgType_;
                    this.msgType_ = hVar.e(z2, i, i2 != 0, i2);
                    this.gameId_ = hVar.f(!this.gameId_.isEmpty(), this.gameId_, !voiceGameMessage.gameId_.isEmpty(), voiceGameMessage.gameId_);
                    this.gameType_ = hVar.f(!this.gameType_.isEmpty(), this.gameType_, !voiceGameMessage.gameType_.isEmpty(), voiceGameMessage.gameType_);
                    GeneratedMessageLite.g gVar = GeneratedMessageLite.g.INSTANCE;
                    return this;
                case 6:
                    e eVar = (e) obj;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            if (iM != 0) {
                                if (iM == 8) {
                                    this.msgType_ = eVar.p();
                                } else if (iM == 18) {
                                    this.gameId_ = eVar.L();
                                } else if (iM == 26) {
                                    this.gameType_ = eVar.L();
                                } else if (!eVar.R(iM)) {
                                }
                            }
                            z = true;
                        } catch (IOException e) {
                            aag0.a(new InvalidProtocolBufferException(e.getMessage()).setUnfinishedMessage(this));
                            return null;
                        } catch (InvalidProtocolBufferException e2) {
                            aag0.a(e2.setUnfinishedMessage(this));
                            return null;
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (PARSER == null) {
                        synchronized (VoiceGameMessage.class) {
                            try {
                                if (PARSER == null) {
                                    PARSER = new GeneratedMessageLite.c(DEFAULT_INSTANCE);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return PARSER;
                default:
                    bz00.a();
                    return null;
            }
            return DEFAULT_INSTANCE;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceGameMessageOrBuilder
        public String getGameId() {
            return this.gameId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceGameMessageOrBuilder
        public ByteString getGameIdBytes() {
            return ByteString.copyFromUtf8(this.gameId_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceGameMessageOrBuilder
        public String getGameType() {
            return this.gameType_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceGameMessageOrBuilder
        public ByteString getGameTypeBytes() {
            return ByteString.copyFromUtf8(this.gameType_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceGameMessageOrBuilder
        public MsgType getMsgType() {
            MsgType msgTypeForNumber = MsgType.forNumber(this.msgType_);
            return msgTypeForNumber == null ? MsgType.UNRECOGNIZED : msgTypeForNumber;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceGameMessageOrBuilder
        public int getMsgTypeValue() {
            return this.msgType_;
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM = this.msgType_ != MsgType.unknown.getNumber() ? CodedOutputStream.m(1, this.msgType_) : 0;
            if (!this.gameId_.isEmpty()) {
                iM += CodedOutputStream.K(2, getGameId());
            }
            if (!this.gameType_.isEmpty()) {
                iM += CodedOutputStream.K(3, getGameType());
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iM;
            return iM;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.msgType_ != MsgType.unknown.getNumber()) {
                codedOutputStream.i0(1, this.msgType_);
            }
            if (!this.gameId_.isEmpty()) {
                codedOutputStream.D0(2, getGameId());
            }
            if (this.gameType_.isEmpty()) {
                return;
            }
            codedOutputStream.D0(3, getGameType());
        }

        public enum MsgType implements l.c {
            unknown(0),
            start(1),
            end(2),
            UNRECOGNIZED(-1);

            public static final int end_VALUE = 2;
            private static final l.d<MsgType> internalValueMap = new l.d<MsgType>() { // from class: com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceGameMessage.MsgType.1
                public MsgType findValueByNumber(int i) {
                    return MsgType.forNumber(i);
                }
            };
            public static final int start_VALUE = 1;
            public static final int unknown_VALUE = 0;
            private final int value;

            MsgType(int i) {
                this.value = i;
            }

            public static MsgType forNumber(int i) {
                if (i == 0) {
                    return unknown;
                }
                if (i == 1) {
                    return start;
                }
                if (i != 2) {
                    return null;
                }
                return end;
            }

            public static l.d<MsgType> internalGetValueMap() {
                return internalValueMap;
            }

            public final int getNumber() {
                return this.value;
            }

            @Deprecated
            public static MsgType valueOf(int i) {
                return forNumber(i);
            }
        }

        public static VoiceGameMessage parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (VoiceGameMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static VoiceGameMessage parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (VoiceGameMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static VoiceGameMessage parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoiceGameMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoiceGameMessage parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (VoiceGameMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static VoiceGameMessage parseFrom(InputStream inputStream) throws IOException {
            return (VoiceGameMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceGameMessage parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (VoiceGameMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static VoiceGameMessage parseFrom(e eVar) throws IOException {
            return (VoiceGameMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static VoiceGameMessage parseFrom(e eVar, h hVar) throws IOException {
            return (VoiceGameMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public static final class VoiceLiveLovePlanetUpdate extends GeneratedMessageLite<VoiceLiveLovePlanetUpdate, Builder> implements VoiceLiveLovePlanetUpdateOrBuilder {
        public static final int CURRENTTIME_FIELD_NUMBER = 2;
        private static final VoiceLiveLovePlanetUpdate DEFAULT_INSTANCE;
        public static final int HOST_FIELD_NUMBER = 5;
        public static final int LOVEPLANETID_FIELD_NUMBER = 3;
        public static final int MVP_FIELD_NUMBER = 4;
        private static volatile i860<VoiceLiveLovePlanetUpdate> PARSER = null;
        public static final int PLAYERS_FIELD_NUMBER = 6;
        public static final int TEAMS_FIELD_NUMBER = 7;
        public static final int UPDATETYPE_FIELD_NUMBER = 1;
        private int bitField0_;
        private long currentTime_;
        private VoiceLovePlanetUser host_;
        private VoiceLovePlanetUser mvp_;
        private int updateType_;
        private String lovePlanetId_ = "";
        private l.h<VoiceLovePlanetUser> players_ = GeneratedMessageLite.emptyProtobufList();
        private l.h<VoiceLovePlanetTeam> teams_ = GeneratedMessageLite.emptyProtobufList();

        static {
            VoiceLiveLovePlanetUpdate voiceLiveLovePlanetUpdate = new VoiceLiveLovePlanetUpdate();
            DEFAULT_INSTANCE = voiceLiveLovePlanetUpdate;
            voiceLiveLovePlanetUpdate.makeImmutable();
        }

        private VoiceLiveLovePlanetUpdate() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllPlayers(Iterable<? extends VoiceLovePlanetUser> iterable) {
            ensurePlayersIsMutable();
            a.addAll(iterable, this.players_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllTeams(Iterable<? extends VoiceLovePlanetTeam> iterable) {
            ensureTeamsIsMutable();
            a.addAll(iterable, this.teams_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addPlayers(VoiceLovePlanetUser.Builder builder) {
            ensurePlayersIsMutable();
            this.players_.add((VoiceLovePlanetUser) builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addTeams(VoiceLovePlanetTeam.Builder builder) {
            ensureTeamsIsMutable();
            this.teams_.add((VoiceLovePlanetTeam) builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCurrentTime() {
            this.currentTime_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHost() {
            this.host_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLovePlanetId() {
            this.lovePlanetId_ = getDefaultInstance().getLovePlanetId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMvp() {
            this.mvp_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPlayers() {
            this.players_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTeams() {
            this.teams_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUpdateType() {
            this.updateType_ = 0;
        }

        private void ensurePlayersIsMutable() {
            if (this.players_.q()) {
                return;
            }
            this.players_ = GeneratedMessageLite.mutableCopy(this.players_);
        }

        private void ensureTeamsIsMutable() {
            if (this.teams_.q()) {
                return;
            }
            this.teams_ = GeneratedMessageLite.mutableCopy(this.teams_);
        }

        public static VoiceLiveLovePlanetUpdate getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeHost(VoiceLovePlanetUser voiceLovePlanetUser) {
            VoiceLovePlanetUser voiceLovePlanetUser2 = this.host_;
            if (voiceLovePlanetUser2 == null || voiceLovePlanetUser2 == VoiceLovePlanetUser.getDefaultInstance()) {
                this.host_ = voiceLovePlanetUser;
            } else {
                this.host_ = (VoiceLovePlanetUser) ((VoiceLovePlanetUser.Builder) VoiceLovePlanetUser.newBuilder(this.host_).mergeFrom(voiceLovePlanetUser)).buildPartial();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeMvp(VoiceLovePlanetUser voiceLovePlanetUser) {
            VoiceLovePlanetUser voiceLovePlanetUser2 = this.mvp_;
            if (voiceLovePlanetUser2 == null || voiceLovePlanetUser2 == VoiceLovePlanetUser.getDefaultInstance()) {
                this.mvp_ = voiceLovePlanetUser;
            } else {
                this.mvp_ = (VoiceLovePlanetUser) ((VoiceLovePlanetUser.Builder) VoiceLovePlanetUser.newBuilder(this.mvp_).mergeFrom(voiceLovePlanetUser)).buildPartial();
            }
        }

        public static Builder newBuilder(VoiceLiveLovePlanetUpdate voiceLiveLovePlanetUpdate) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(voiceLiveLovePlanetUpdate);
        }

        public static VoiceLiveLovePlanetUpdate parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VoiceLiveLovePlanetUpdate) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceLiveLovePlanetUpdate parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VoiceLiveLovePlanetUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<VoiceLiveLovePlanetUpdate> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removePlayers(int i) {
            ensurePlayersIsMutable();
            this.players_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeTeams(int i) {
            ensureTeamsIsMutable();
            this.teams_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCurrentTime(long j) {
            this.currentTime_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHost(VoiceLovePlanetUser.Builder builder) {
            this.host_ = (VoiceLovePlanetUser) builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLovePlanetId(String str) {
            str.getClass();
            this.lovePlanetId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLovePlanetIdBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.lovePlanetId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMvp(VoiceLovePlanetUser.Builder builder) {
            this.mvp_ = (VoiceLovePlanetUser) builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPlayers(int i, VoiceLovePlanetUser.Builder builder) {
            ensurePlayersIsMutable();
            this.players_.set(i, (VoiceLovePlanetUser) builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTeams(int i, VoiceLovePlanetTeam.Builder builder) {
            ensureTeamsIsMutable();
            this.teams_.set(i, (VoiceLovePlanetTeam) builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUpdateType(Type type) {
            type.getClass();
            this.updateType_ = type.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUpdateTypeValue(int i) {
            this.updateType_ = i;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C04221.f1679xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoiceLiveLovePlanetUpdate();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.players_.n();
                    this.teams_.n();
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.g gVar = (GeneratedMessageLite.h) obj;
                    VoiceLiveLovePlanetUpdate voiceLiveLovePlanetUpdate = (VoiceLiveLovePlanetUpdate) obj2;
                    int i = this.updateType_;
                    boolean z2 = i != 0;
                    int i2 = voiceLiveLovePlanetUpdate.updateType_;
                    this.updateType_ = gVar.e(z2, i, i2 != 0, i2);
                    long j = this.currentTime_;
                    boolean z3 = j != 0;
                    long j2 = voiceLiveLovePlanetUpdate.currentTime_;
                    this.currentTime_ = gVar.i(z3, j, j2 != 0, j2);
                    this.lovePlanetId_ = gVar.f(!this.lovePlanetId_.isEmpty(), this.lovePlanetId_, !voiceLiveLovePlanetUpdate.lovePlanetId_.isEmpty(), voiceLiveLovePlanetUpdate.lovePlanetId_);
                    this.mvp_ = gVar.o(this.mvp_, voiceLiveLovePlanetUpdate.mvp_);
                    this.host_ = gVar.o(this.host_, voiceLiveLovePlanetUpdate.host_);
                    this.players_ = gVar.g(this.players_, voiceLiveLovePlanetUpdate.players_);
                    this.teams_ = gVar.g(this.teams_, voiceLiveLovePlanetUpdate.teams_);
                    if (gVar == GeneratedMessageLite.g.INSTANCE) {
                        this.bitField0_ |= voiceLiveLovePlanetUpdate.bitField0_;
                    }
                    return this;
                case 6:
                    e eVar = (e) obj;
                    h hVar = (h) obj2;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            if (iM != 0) {
                                if (iM == 8) {
                                    this.updateType_ = eVar.p();
                                } else if (iM == 16) {
                                    this.currentTime_ = eVar.v();
                                } else if (iM == 26) {
                                    this.lovePlanetId_ = eVar.L();
                                } else if (iM == 34) {
                                    VoiceLovePlanetUser voiceLovePlanetUser = this.mvp_;
                                    VoiceLovePlanetUser.Builder builder = voiceLovePlanetUser != null ? (VoiceLovePlanetUser.Builder) voiceLovePlanetUser.toBuilder() : null;
                                    VoiceLovePlanetUser voiceLovePlanetUserW = eVar.w(VoiceLovePlanetUser.parser(), hVar);
                                    this.mvp_ = voiceLovePlanetUserW;
                                    if (builder != null) {
                                        builder.mergeFrom(voiceLovePlanetUserW);
                                        this.mvp_ = (VoiceLovePlanetUser) builder.buildPartial();
                                    }
                                } else if (iM == 42) {
                                    VoiceLovePlanetUser voiceLovePlanetUser2 = this.host_;
                                    VoiceLovePlanetUser.Builder builder2 = voiceLovePlanetUser2 != null ? (VoiceLovePlanetUser.Builder) voiceLovePlanetUser2.toBuilder() : null;
                                    VoiceLovePlanetUser voiceLovePlanetUserW2 = eVar.w(VoiceLovePlanetUser.parser(), hVar);
                                    this.host_ = voiceLovePlanetUserW2;
                                    if (builder2 != null) {
                                        builder2.mergeFrom(voiceLovePlanetUserW2);
                                        this.host_ = (VoiceLovePlanetUser) builder2.buildPartial();
                                    }
                                } else if (iM == 50) {
                                    if (!this.players_.q()) {
                                        this.players_ = GeneratedMessageLite.mutableCopy(this.players_);
                                    }
                                    this.players_.add(eVar.w(VoiceLovePlanetUser.parser(), hVar));
                                } else if (iM == 58) {
                                    if (!this.teams_.q()) {
                                        this.teams_ = GeneratedMessageLite.mutableCopy(this.teams_);
                                    }
                                    this.teams_.add(eVar.w(VoiceLovePlanetTeam.parser(), hVar));
                                } else if (!eVar.R(iM)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            aag0.a(e.setUnfinishedMessage(this));
                            return null;
                        } catch (IOException e2) {
                            aag0.a(new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this));
                            return null;
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (PARSER == null) {
                        synchronized (VoiceLiveLovePlanetUpdate.class) {
                            try {
                                if (PARSER == null) {
                                    PARSER = new GeneratedMessageLite.c(DEFAULT_INSTANCE);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return PARSER;
                default:
                    bz00.a();
                    return null;
            }
            return DEFAULT_INSTANCE;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLiveLovePlanetUpdateOrBuilder
        public long getCurrentTime() {
            return this.currentTime_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLiveLovePlanetUpdateOrBuilder
        public VoiceLovePlanetUser getHost() {
            VoiceLovePlanetUser voiceLovePlanetUser = this.host_;
            return voiceLovePlanetUser == null ? VoiceLovePlanetUser.getDefaultInstance() : voiceLovePlanetUser;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLiveLovePlanetUpdateOrBuilder
        public String getLovePlanetId() {
            return this.lovePlanetId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLiveLovePlanetUpdateOrBuilder
        public ByteString getLovePlanetIdBytes() {
            return ByteString.copyFromUtf8(this.lovePlanetId_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLiveLovePlanetUpdateOrBuilder
        public VoiceLovePlanetUser getMvp() {
            VoiceLovePlanetUser voiceLovePlanetUser = this.mvp_;
            return voiceLovePlanetUser == null ? VoiceLovePlanetUser.getDefaultInstance() : voiceLovePlanetUser;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLiveLovePlanetUpdateOrBuilder
        public VoiceLovePlanetUser getPlayers(int i) {
            return (VoiceLovePlanetUser) this.players_.get(i);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLiveLovePlanetUpdateOrBuilder
        public int getPlayersCount() {
            return this.players_.size();
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLiveLovePlanetUpdateOrBuilder
        public List<VoiceLovePlanetUser> getPlayersList() {
            return this.players_;
        }

        public VoiceLovePlanetUserOrBuilder getPlayersOrBuilder(int i) {
            return (VoiceLovePlanetUserOrBuilder) this.players_.get(i);
        }

        public List<? extends VoiceLovePlanetUserOrBuilder> getPlayersOrBuilderList() {
            return this.players_;
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM = this.updateType_ != Type.refreshLovePlanet.getNumber() ? CodedOutputStream.m(1, this.updateType_) : 0;
            long j = this.currentTime_;
            if (j != 0) {
                iM += CodedOutputStream.v(2, j);
            }
            if (!this.lovePlanetId_.isEmpty()) {
                iM += CodedOutputStream.K(3, getLovePlanetId());
            }
            if (this.mvp_ != null) {
                iM += CodedOutputStream.C(4, getMvp());
            }
            if (this.host_ != null) {
                iM += CodedOutputStream.C(5, getHost());
            }
            for (int i2 = 0; i2 < this.players_.size(); i2++) {
                iM += CodedOutputStream.C(6, (q) this.players_.get(i2));
            }
            for (int i3 = 0; i3 < this.teams_.size(); i3++) {
                iM += CodedOutputStream.C(7, (q) this.teams_.get(i3));
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iM;
            return iM;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLiveLovePlanetUpdateOrBuilder
        public VoiceLovePlanetTeam getTeams(int i) {
            return (VoiceLovePlanetTeam) this.teams_.get(i);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLiveLovePlanetUpdateOrBuilder
        public int getTeamsCount() {
            return this.teams_.size();
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLiveLovePlanetUpdateOrBuilder
        public List<VoiceLovePlanetTeam> getTeamsList() {
            return this.teams_;
        }

        public VoiceLovePlanetTeamOrBuilder getTeamsOrBuilder(int i) {
            return (VoiceLovePlanetTeamOrBuilder) this.teams_.get(i);
        }

        public List<? extends VoiceLovePlanetTeamOrBuilder> getTeamsOrBuilderList() {
            return this.teams_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLiveLovePlanetUpdateOrBuilder
        public Type getUpdateType() {
            Type typeForNumber = Type.forNumber(this.updateType_);
            return typeForNumber == null ? Type.UNRECOGNIZED : typeForNumber;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLiveLovePlanetUpdateOrBuilder
        public int getUpdateTypeValue() {
            return this.updateType_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLiveLovePlanetUpdateOrBuilder
        public boolean hasHost() {
            return this.host_ != null;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLiveLovePlanetUpdateOrBuilder
        public boolean hasMvp() {
            return this.mvp_ != null;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.updateType_ != Type.refreshLovePlanet.getNumber()) {
                codedOutputStream.i0(1, this.updateType_);
            }
            long j = this.currentTime_;
            if (j != 0) {
                codedOutputStream.u0(2, j);
            }
            if (!this.lovePlanetId_.isEmpty()) {
                codedOutputStream.D0(3, getLovePlanetId());
            }
            if (this.mvp_ != null) {
                codedOutputStream.w0(4, getMvp());
            }
            if (this.host_ != null) {
                codedOutputStream.w0(5, getHost());
            }
            for (int i = 0; i < this.players_.size(); i++) {
                codedOutputStream.w0(6, (q) this.players_.get(i));
            }
            for (int i2 = 0; i2 < this.teams_.size(); i2++) {
                codedOutputStream.w0(7, (q) this.teams_.get(i2));
            }
        }

        public enum Type implements l.c {
            refreshLovePlanet(0),
            updateMvp(1),
            insertHost(2),
            deleteHost(3),
            updatePlayers(4),
            insertPlayers(5),
            deletePlayers(6),
            updateTeamAndPlayer(7),
            UNRECOGNIZED(-1);

            public static final int deleteHost_VALUE = 3;
            public static final int deletePlayers_VALUE = 6;
            public static final int insertHost_VALUE = 2;
            public static final int insertPlayers_VALUE = 5;
            private static final l.d<Type> internalValueMap = new l.d<Type>() { // from class: com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLiveLovePlanetUpdate.Type.1
                public Type findValueByNumber(int i) {
                    return Type.forNumber(i);
                }
            };
            public static final int refreshLovePlanet_VALUE = 0;
            public static final int updateMvp_VALUE = 1;
            public static final int updatePlayers_VALUE = 4;
            public static final int updateTeamAndPlayer_VALUE = 7;
            private final int value;

            Type(int i) {
                this.value = i;
            }

            public static Type forNumber(int i) {
                switch (i) {
                    case 0:
                        return refreshLovePlanet;
                    case 1:
                        return updateMvp;
                    case 2:
                        return insertHost;
                    case 3:
                        return deleteHost;
                    case 4:
                        return updatePlayers;
                    case 5:
                        return insertPlayers;
                    case 6:
                        return deletePlayers;
                    case 7:
                        return updateTeamAndPlayer;
                    default:
                        return null;
                }
            }

            public static l.d<Type> internalGetValueMap() {
                return internalValueMap;
            }

            public final int getNumber() {
                return this.value;
            }

            @Deprecated
            public static Type valueOf(int i) {
                return forNumber(i);
            }
        }

        public static VoiceLiveLovePlanetUpdate parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (VoiceLiveLovePlanetUpdate) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static VoiceLiveLovePlanetUpdate parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (VoiceLiveLovePlanetUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHost(VoiceLovePlanetUser voiceLovePlanetUser) {
            voiceLovePlanetUser.getClass();
            this.host_ = voiceLovePlanetUser;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMvp(VoiceLovePlanetUser voiceLovePlanetUser) {
            voiceLovePlanetUser.getClass();
            this.mvp_ = voiceLovePlanetUser;
        }

        public static final class Builder extends GeneratedMessageLite.b<VoiceLiveLovePlanetUpdate, Builder> implements VoiceLiveLovePlanetUpdateOrBuilder {
            private Builder() {
                super(VoiceLiveLovePlanetUpdate.DEFAULT_INSTANCE);
            }

            public Builder addAllPlayers(Iterable<? extends VoiceLovePlanetUser> iterable) {
                copyOnWrite();
                ((VoiceLiveLovePlanetUpdate) ((GeneratedMessageLite.b) this).instance).addAllPlayers(iterable);
                return this;
            }

            public Builder addAllTeams(Iterable<? extends VoiceLovePlanetTeam> iterable) {
                copyOnWrite();
                ((VoiceLiveLovePlanetUpdate) ((GeneratedMessageLite.b) this).instance).addAllTeams(iterable);
                return this;
            }

            public Builder addPlayers(VoiceLovePlanetUser voiceLovePlanetUser) {
                copyOnWrite();
                ((VoiceLiveLovePlanetUpdate) ((GeneratedMessageLite.b) this).instance).addPlayers(voiceLovePlanetUser);
                return this;
            }

            public Builder addTeams(VoiceLovePlanetTeam voiceLovePlanetTeam) {
                copyOnWrite();
                ((VoiceLiveLovePlanetUpdate) ((GeneratedMessageLite.b) this).instance).addTeams(voiceLovePlanetTeam);
                return this;
            }

            public Builder clearCurrentTime() {
                copyOnWrite();
                ((VoiceLiveLovePlanetUpdate) ((GeneratedMessageLite.b) this).instance).clearCurrentTime();
                return this;
            }

            public Builder clearHost() {
                copyOnWrite();
                ((VoiceLiveLovePlanetUpdate) ((GeneratedMessageLite.b) this).instance).clearHost();
                return this;
            }

            public Builder clearLovePlanetId() {
                copyOnWrite();
                ((VoiceLiveLovePlanetUpdate) ((GeneratedMessageLite.b) this).instance).clearLovePlanetId();
                return this;
            }

            public Builder clearMvp() {
                copyOnWrite();
                ((VoiceLiveLovePlanetUpdate) ((GeneratedMessageLite.b) this).instance).clearMvp();
                return this;
            }

            public Builder clearPlayers() {
                copyOnWrite();
                ((VoiceLiveLovePlanetUpdate) ((GeneratedMessageLite.b) this).instance).clearPlayers();
                return this;
            }

            public Builder clearTeams() {
                copyOnWrite();
                ((VoiceLiveLovePlanetUpdate) ((GeneratedMessageLite.b) this).instance).clearTeams();
                return this;
            }

            public Builder clearUpdateType() {
                copyOnWrite();
                ((VoiceLiveLovePlanetUpdate) ((GeneratedMessageLite.b) this).instance).clearUpdateType();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLiveLovePlanetUpdateOrBuilder
            public long getCurrentTime() {
                return ((VoiceLiveLovePlanetUpdate) ((GeneratedMessageLite.b) this).instance).getCurrentTime();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLiveLovePlanetUpdateOrBuilder
            public VoiceLovePlanetUser getHost() {
                return ((VoiceLiveLovePlanetUpdate) ((GeneratedMessageLite.b) this).instance).getHost();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLiveLovePlanetUpdateOrBuilder
            public String getLovePlanetId() {
                return ((VoiceLiveLovePlanetUpdate) ((GeneratedMessageLite.b) this).instance).getLovePlanetId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLiveLovePlanetUpdateOrBuilder
            public ByteString getLovePlanetIdBytes() {
                return ((VoiceLiveLovePlanetUpdate) ((GeneratedMessageLite.b) this).instance).getLovePlanetIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLiveLovePlanetUpdateOrBuilder
            public VoiceLovePlanetUser getMvp() {
                return ((VoiceLiveLovePlanetUpdate) ((GeneratedMessageLite.b) this).instance).getMvp();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLiveLovePlanetUpdateOrBuilder
            public VoiceLovePlanetUser getPlayers(int i) {
                return ((VoiceLiveLovePlanetUpdate) ((GeneratedMessageLite.b) this).instance).getPlayers(i);
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLiveLovePlanetUpdateOrBuilder
            public int getPlayersCount() {
                return ((VoiceLiveLovePlanetUpdate) ((GeneratedMessageLite.b) this).instance).getPlayersCount();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLiveLovePlanetUpdateOrBuilder
            public List<VoiceLovePlanetUser> getPlayersList() {
                return Collections.unmodifiableList(((VoiceLiveLovePlanetUpdate) ((GeneratedMessageLite.b) this).instance).getPlayersList());
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLiveLovePlanetUpdateOrBuilder
            public VoiceLovePlanetTeam getTeams(int i) {
                return ((VoiceLiveLovePlanetUpdate) ((GeneratedMessageLite.b) this).instance).getTeams(i);
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLiveLovePlanetUpdateOrBuilder
            public int getTeamsCount() {
                return ((VoiceLiveLovePlanetUpdate) ((GeneratedMessageLite.b) this).instance).getTeamsCount();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLiveLovePlanetUpdateOrBuilder
            public List<VoiceLovePlanetTeam> getTeamsList() {
                return Collections.unmodifiableList(((VoiceLiveLovePlanetUpdate) ((GeneratedMessageLite.b) this).instance).getTeamsList());
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLiveLovePlanetUpdateOrBuilder
            public Type getUpdateType() {
                return ((VoiceLiveLovePlanetUpdate) ((GeneratedMessageLite.b) this).instance).getUpdateType();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLiveLovePlanetUpdateOrBuilder
            public int getUpdateTypeValue() {
                return ((VoiceLiveLovePlanetUpdate) ((GeneratedMessageLite.b) this).instance).getUpdateTypeValue();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLiveLovePlanetUpdateOrBuilder
            public boolean hasHost() {
                return ((VoiceLiveLovePlanetUpdate) ((GeneratedMessageLite.b) this).instance).hasHost();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLiveLovePlanetUpdateOrBuilder
            public boolean hasMvp() {
                return ((VoiceLiveLovePlanetUpdate) ((GeneratedMessageLite.b) this).instance).hasMvp();
            }

            public Builder mergeHost(VoiceLovePlanetUser voiceLovePlanetUser) {
                copyOnWrite();
                ((VoiceLiveLovePlanetUpdate) ((GeneratedMessageLite.b) this).instance).mergeHost(voiceLovePlanetUser);
                return this;
            }

            public Builder mergeMvp(VoiceLovePlanetUser voiceLovePlanetUser) {
                copyOnWrite();
                ((VoiceLiveLovePlanetUpdate) ((GeneratedMessageLite.b) this).instance).mergeMvp(voiceLovePlanetUser);
                return this;
            }

            public Builder removePlayers(int i) {
                copyOnWrite();
                ((VoiceLiveLovePlanetUpdate) ((GeneratedMessageLite.b) this).instance).removePlayers(i);
                return this;
            }

            public Builder removeTeams(int i) {
                copyOnWrite();
                ((VoiceLiveLovePlanetUpdate) ((GeneratedMessageLite.b) this).instance).removeTeams(i);
                return this;
            }

            public Builder setCurrentTime(long j) {
                copyOnWrite();
                ((VoiceLiveLovePlanetUpdate) ((GeneratedMessageLite.b) this).instance).setCurrentTime(j);
                return this;
            }

            public Builder setHost(VoiceLovePlanetUser voiceLovePlanetUser) {
                copyOnWrite();
                ((VoiceLiveLovePlanetUpdate) ((GeneratedMessageLite.b) this).instance).setHost(voiceLovePlanetUser);
                return this;
            }

            public Builder setLovePlanetId(String str) {
                copyOnWrite();
                ((VoiceLiveLovePlanetUpdate) ((GeneratedMessageLite.b) this).instance).setLovePlanetId(str);
                return this;
            }

            public Builder setLovePlanetIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceLiveLovePlanetUpdate) ((GeneratedMessageLite.b) this).instance).setLovePlanetIdBytes(byteString);
                return this;
            }

            public Builder setMvp(VoiceLovePlanetUser voiceLovePlanetUser) {
                copyOnWrite();
                ((VoiceLiveLovePlanetUpdate) ((GeneratedMessageLite.b) this).instance).setMvp(voiceLovePlanetUser);
                return this;
            }

            public Builder setPlayers(int i, VoiceLovePlanetUser voiceLovePlanetUser) {
                copyOnWrite();
                ((VoiceLiveLovePlanetUpdate) ((GeneratedMessageLite.b) this).instance).setPlayers(i, voiceLovePlanetUser);
                return this;
            }

            public Builder setTeams(int i, VoiceLovePlanetTeam voiceLovePlanetTeam) {
                copyOnWrite();
                ((VoiceLiveLovePlanetUpdate) ((GeneratedMessageLite.b) this).instance).setTeams(i, voiceLovePlanetTeam);
                return this;
            }

            public Builder setUpdateType(Type type) {
                copyOnWrite();
                ((VoiceLiveLovePlanetUpdate) ((GeneratedMessageLite.b) this).instance).setUpdateType(type);
                return this;
            }

            public Builder setUpdateTypeValue(int i) {
                copyOnWrite();
                ((VoiceLiveLovePlanetUpdate) ((GeneratedMessageLite.b) this).instance).setUpdateTypeValue(i);
                return this;
            }

            public Builder addPlayers(int i, VoiceLovePlanetUser voiceLovePlanetUser) {
                copyOnWrite();
                ((VoiceLiveLovePlanetUpdate) ((GeneratedMessageLite.b) this).instance).addPlayers(i, voiceLovePlanetUser);
                return this;
            }

            public Builder addTeams(int i, VoiceLovePlanetTeam voiceLovePlanetTeam) {
                copyOnWrite();
                ((VoiceLiveLovePlanetUpdate) ((GeneratedMessageLite.b) this).instance).addTeams(i, voiceLovePlanetTeam);
                return this;
            }

            public Builder setHost(VoiceLovePlanetUser.Builder builder) {
                copyOnWrite();
                ((VoiceLiveLovePlanetUpdate) ((GeneratedMessageLite.b) this).instance).setHost(builder);
                return this;
            }

            public Builder setMvp(VoiceLovePlanetUser.Builder builder) {
                copyOnWrite();
                ((VoiceLiveLovePlanetUpdate) ((GeneratedMessageLite.b) this).instance).setMvp(builder);
                return this;
            }

            public Builder setPlayers(int i, VoiceLovePlanetUser.Builder builder) {
                copyOnWrite();
                ((VoiceLiveLovePlanetUpdate) ((GeneratedMessageLite.b) this).instance).setPlayers(i, builder);
                return this;
            }

            public Builder setTeams(int i, VoiceLovePlanetTeam.Builder builder) {
                copyOnWrite();
                ((VoiceLiveLovePlanetUpdate) ((GeneratedMessageLite.b) this).instance).setTeams(i, builder);
                return this;
            }

            public Builder addPlayers(VoiceLovePlanetUser.Builder builder) {
                copyOnWrite();
                ((VoiceLiveLovePlanetUpdate) ((GeneratedMessageLite.b) this).instance).addPlayers(builder);
                return this;
            }

            public Builder addTeams(VoiceLovePlanetTeam.Builder builder) {
                copyOnWrite();
                ((VoiceLiveLovePlanetUpdate) ((GeneratedMessageLite.b) this).instance).addTeams(builder);
                return this;
            }

            public Builder addPlayers(int i, VoiceLovePlanetUser.Builder builder) {
                copyOnWrite();
                ((VoiceLiveLovePlanetUpdate) ((GeneratedMessageLite.b) this).instance).addPlayers(i, builder);
                return this;
            }

            public Builder addTeams(int i, VoiceLovePlanetTeam.Builder builder) {
                copyOnWrite();
                ((VoiceLiveLovePlanetUpdate) ((GeneratedMessageLite.b) this).instance).addTeams(i, builder);
                return this;
            }
        }

        public static VoiceLiveLovePlanetUpdate parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoiceLiveLovePlanetUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoiceLiveLovePlanetUpdate parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (VoiceLiveLovePlanetUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static VoiceLiveLovePlanetUpdate parseFrom(InputStream inputStream) throws IOException {
            return (VoiceLiveLovePlanetUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceLiveLovePlanetUpdate parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (VoiceLiveLovePlanetUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static VoiceLiveLovePlanetUpdate parseFrom(e eVar) throws IOException {
            return (VoiceLiveLovePlanetUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addPlayers(int i, VoiceLovePlanetUser voiceLovePlanetUser) {
            voiceLovePlanetUser.getClass();
            ensurePlayersIsMutable();
            this.players_.add(i, voiceLovePlanetUser);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addTeams(int i, VoiceLovePlanetTeam voiceLovePlanetTeam) {
            voiceLovePlanetTeam.getClass();
            ensureTeamsIsMutable();
            this.teams_.add(i, voiceLovePlanetTeam);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static VoiceLiveLovePlanetUpdate parseFrom(e eVar, h hVar) throws IOException {
            return (VoiceLiveLovePlanetUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPlayers(int i, VoiceLovePlanetUser voiceLovePlanetUser) {
            voiceLovePlanetUser.getClass();
            ensurePlayersIsMutable();
            this.players_.set(i, voiceLovePlanetUser);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTeams(int i, VoiceLovePlanetTeam voiceLovePlanetTeam) {
            voiceLovePlanetTeam.getClass();
            ensureTeamsIsMutable();
            this.teams_.set(i, voiceLovePlanetTeam);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addPlayers(VoiceLovePlanetUser voiceLovePlanetUser) {
            voiceLovePlanetUser.getClass();
            ensurePlayersIsMutable();
            this.players_.add(voiceLovePlanetUser);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addTeams(VoiceLovePlanetTeam voiceLovePlanetTeam) {
            voiceLovePlanetTeam.getClass();
            ensureTeamsIsMutable();
            this.teams_.add(voiceLovePlanetTeam);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addPlayers(int i, VoiceLovePlanetUser.Builder builder) {
            ensurePlayersIsMutable();
            this.players_.add(i, (VoiceLovePlanetUser) builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addTeams(int i, VoiceLovePlanetTeam.Builder builder) {
            ensureTeamsIsMutable();
            this.teams_.add(i, (VoiceLovePlanetTeam) builder.build());
        }
    }

    public static final class VoiceSettleMessage extends GeneratedMessageLite<VoiceSettleMessage, Builder> implements VoiceSettleMessageOrBuilder {
        private static final VoiceSettleMessage DEFAULT_INSTANCE;
        public static final int ID_FIELD_NUMBER = 2;
        public static final int MSGTYPE_FIELD_NUMBER = 1;
        private static volatile i860<VoiceSettleMessage> PARSER = null;
        public static final int ROOMID_FIELD_NUMBER = 4;
        public static final int USERID_FIELD_NUMBER = 3;
        private int msgType_;
        private String id_ = "";
        private String userId_ = "";
        private String roomId_ = "";

        public static final class Builder extends GeneratedMessageLite.b<VoiceSettleMessage, Builder> implements VoiceSettleMessageOrBuilder {
            private Builder() {
                super(VoiceSettleMessage.DEFAULT_INSTANCE);
            }

            public Builder clearId() {
                copyOnWrite();
                ((VoiceSettleMessage) ((GeneratedMessageLite.b) this).instance).clearId();
                return this;
            }

            public Builder clearMsgType() {
                copyOnWrite();
                ((VoiceSettleMessage) ((GeneratedMessageLite.b) this).instance).clearMsgType();
                return this;
            }

            public Builder clearRoomId() {
                copyOnWrite();
                ((VoiceSettleMessage) ((GeneratedMessageLite.b) this).instance).clearRoomId();
                return this;
            }

            public Builder clearUserId() {
                copyOnWrite();
                ((VoiceSettleMessage) ((GeneratedMessageLite.b) this).instance).clearUserId();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceSettleMessageOrBuilder
            public String getId() {
                return ((VoiceSettleMessage) ((GeneratedMessageLite.b) this).instance).getId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceSettleMessageOrBuilder
            public ByteString getIdBytes() {
                return ((VoiceSettleMessage) ((GeneratedMessageLite.b) this).instance).getIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceSettleMessageOrBuilder
            public MsgType getMsgType() {
                return ((VoiceSettleMessage) ((GeneratedMessageLite.b) this).instance).getMsgType();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceSettleMessageOrBuilder
            public int getMsgTypeValue() {
                return ((VoiceSettleMessage) ((GeneratedMessageLite.b) this).instance).getMsgTypeValue();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceSettleMessageOrBuilder
            public String getRoomId() {
                return ((VoiceSettleMessage) ((GeneratedMessageLite.b) this).instance).getRoomId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceSettleMessageOrBuilder
            public ByteString getRoomIdBytes() {
                return ((VoiceSettleMessage) ((GeneratedMessageLite.b) this).instance).getRoomIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceSettleMessageOrBuilder
            public String getUserId() {
                return ((VoiceSettleMessage) ((GeneratedMessageLite.b) this).instance).getUserId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceSettleMessageOrBuilder
            public ByteString getUserIdBytes() {
                return ((VoiceSettleMessage) ((GeneratedMessageLite.b) this).instance).getUserIdBytes();
            }

            public Builder setId(String str) {
                copyOnWrite();
                ((VoiceSettleMessage) ((GeneratedMessageLite.b) this).instance).setId(str);
                return this;
            }

            public Builder setIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceSettleMessage) ((GeneratedMessageLite.b) this).instance).setIdBytes(byteString);
                return this;
            }

            public Builder setMsgType(MsgType msgType) {
                copyOnWrite();
                ((VoiceSettleMessage) ((GeneratedMessageLite.b) this).instance).setMsgType(msgType);
                return this;
            }

            public Builder setMsgTypeValue(int i) {
                copyOnWrite();
                ((VoiceSettleMessage) ((GeneratedMessageLite.b) this).instance).setMsgTypeValue(i);
                return this;
            }

            public Builder setRoomId(String str) {
                copyOnWrite();
                ((VoiceSettleMessage) ((GeneratedMessageLite.b) this).instance).setRoomId(str);
                return this;
            }

            public Builder setRoomIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceSettleMessage) ((GeneratedMessageLite.b) this).instance).setRoomIdBytes(byteString);
                return this;
            }

            public Builder setUserId(String str) {
                copyOnWrite();
                ((VoiceSettleMessage) ((GeneratedMessageLite.b) this).instance).setUserId(str);
                return this;
            }

            public Builder setUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceSettleMessage) ((GeneratedMessageLite.b) this).instance).setUserIdBytes(byteString);
                return this;
            }
        }

        static {
            VoiceSettleMessage voiceSettleMessage = new VoiceSettleMessage();
            DEFAULT_INSTANCE = voiceSettleMessage;
            voiceSettleMessage.makeImmutable();
        }

        private VoiceSettleMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearId() {
            this.id_ = getDefaultInstance().getId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMsgType() {
            this.msgType_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRoomId() {
            this.roomId_ = getDefaultInstance().getRoomId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUserId() {
            this.userId_ = getDefaultInstance().getUserId();
        }

        public static VoiceSettleMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(VoiceSettleMessage voiceSettleMessage) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(voiceSettleMessage);
        }

        public static VoiceSettleMessage parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VoiceSettleMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceSettleMessage parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VoiceSettleMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<VoiceSettleMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setId(String str) {
            str.getClass();
            this.id_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIdBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.id_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMsgType(MsgType msgType) {
            msgType.getClass();
            this.msgType_ = msgType.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMsgTypeValue(int i) {
            this.msgType_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRoomId(String str) {
            str.getClass();
            this.roomId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRoomIdBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.roomId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserId(String str) {
            str.getClass();
            this.userId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserIdBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.userId_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C04221.f1679xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoiceSettleMessage();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    VoiceSettleMessage voiceSettleMessage = (VoiceSettleMessage) obj2;
                    int i = this.msgType_;
                    boolean z2 = i != 0;
                    int i2 = voiceSettleMessage.msgType_;
                    this.msgType_ = hVar.e(z2, i, i2 != 0, i2);
                    this.id_ = hVar.f(!this.id_.isEmpty(), this.id_, !voiceSettleMessage.id_.isEmpty(), voiceSettleMessage.id_);
                    this.userId_ = hVar.f(!this.userId_.isEmpty(), this.userId_, !voiceSettleMessage.userId_.isEmpty(), voiceSettleMessage.userId_);
                    this.roomId_ = hVar.f(!this.roomId_.isEmpty(), this.roomId_, !voiceSettleMessage.roomId_.isEmpty(), voiceSettleMessage.roomId_);
                    GeneratedMessageLite.g gVar = GeneratedMessageLite.g.INSTANCE;
                    return this;
                case 6:
                    e eVar = (e) obj;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            if (iM != 0) {
                                if (iM == 8) {
                                    this.msgType_ = eVar.p();
                                } else if (iM == 18) {
                                    this.id_ = eVar.L();
                                } else if (iM == 26) {
                                    this.userId_ = eVar.L();
                                } else if (iM == 34) {
                                    this.roomId_ = eVar.L();
                                } else if (!eVar.R(iM)) {
                                }
                            }
                            z = true;
                        } catch (IOException e) {
                            aag0.a(new InvalidProtocolBufferException(e.getMessage()).setUnfinishedMessage(this));
                            return null;
                        } catch (InvalidProtocolBufferException e2) {
                            aag0.a(e2.setUnfinishedMessage(this));
                            return null;
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (PARSER == null) {
                        synchronized (VoiceSettleMessage.class) {
                            try {
                                if (PARSER == null) {
                                    PARSER = new GeneratedMessageLite.c(DEFAULT_INSTANCE);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return PARSER;
                default:
                    bz00.a();
                    return null;
            }
            return DEFAULT_INSTANCE;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceSettleMessageOrBuilder
        public String getId() {
            return this.id_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceSettleMessageOrBuilder
        public ByteString getIdBytes() {
            return ByteString.copyFromUtf8(this.id_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceSettleMessageOrBuilder
        public MsgType getMsgType() {
            MsgType msgTypeForNumber = MsgType.forNumber(this.msgType_);
            return msgTypeForNumber == null ? MsgType.UNRECOGNIZED : msgTypeForNumber;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceSettleMessageOrBuilder
        public int getMsgTypeValue() {
            return this.msgType_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceSettleMessageOrBuilder
        public String getRoomId() {
            return this.roomId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceSettleMessageOrBuilder
        public ByteString getRoomIdBytes() {
            return ByteString.copyFromUtf8(this.roomId_);
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM = this.msgType_ != MsgType.apply.getNumber() ? CodedOutputStream.m(1, this.msgType_) : 0;
            if (!this.id_.isEmpty()) {
                iM += CodedOutputStream.K(2, getId());
            }
            if (!this.userId_.isEmpty()) {
                iM += CodedOutputStream.K(3, getUserId());
            }
            if (!this.roomId_.isEmpty()) {
                iM += CodedOutputStream.K(4, getRoomId());
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iM;
            return iM;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceSettleMessageOrBuilder
        public String getUserId() {
            return this.userId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceSettleMessageOrBuilder
        public ByteString getUserIdBytes() {
            return ByteString.copyFromUtf8(this.userId_);
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.msgType_ != MsgType.apply.getNumber()) {
                codedOutputStream.i0(1, this.msgType_);
            }
            if (!this.id_.isEmpty()) {
                codedOutputStream.D0(2, getId());
            }
            if (!this.userId_.isEmpty()) {
                codedOutputStream.D0(3, getUserId());
            }
            if (this.roomId_.isEmpty()) {
                return;
            }
            codedOutputStream.D0(4, getRoomId());
        }

        public enum MsgType implements l.c {
            apply(0),
            approve(1),
            reject(2),
            quit(3),
            updateSettledCount(4),
            UNRECOGNIZED(-1);

            public static final int apply_VALUE = 0;
            public static final int approve_VALUE = 1;
            private static final l.d<MsgType> internalValueMap = new l.d<MsgType>() { // from class: com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceSettleMessage.MsgType.1
                public MsgType findValueByNumber(int i) {
                    return MsgType.forNumber(i);
                }
            };
            public static final int quit_VALUE = 3;
            public static final int reject_VALUE = 2;
            public static final int updateSettledCount_VALUE = 4;
            private final int value;

            MsgType(int i) {
                this.value = i;
            }

            public static MsgType forNumber(int i) {
                if (i == 0) {
                    return apply;
                }
                if (i == 1) {
                    return approve;
                }
                if (i == 2) {
                    return reject;
                }
                if (i == 3) {
                    return quit;
                }
                if (i != 4) {
                    return null;
                }
                return updateSettledCount;
            }

            public static l.d<MsgType> internalGetValueMap() {
                return internalValueMap;
            }

            public final int getNumber() {
                return this.value;
            }

            @Deprecated
            public static MsgType valueOf(int i) {
                return forNumber(i);
            }
        }

        public static VoiceSettleMessage parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (VoiceSettleMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static VoiceSettleMessage parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (VoiceSettleMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static VoiceSettleMessage parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoiceSettleMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoiceSettleMessage parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (VoiceSettleMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static VoiceSettleMessage parseFrom(InputStream inputStream) throws IOException {
            return (VoiceSettleMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceSettleMessage parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (VoiceSettleMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static VoiceSettleMessage parseFrom(e eVar) throws IOException {
            return (VoiceSettleMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static VoiceSettleMessage parseFrom(e eVar, h hVar) throws IOException {
            return (VoiceSettleMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public static final class VoiceShareScreen extends GeneratedMessageLite<VoiceShareScreen, Builder> implements VoiceShareScreenOrBuilder {
        private static final VoiceShareScreen DEFAULT_INSTANCE;
        public static final int DESC_FIELD_NUMBER = 9;
        public static final int ID_FIELD_NUMBER = 1;
        private static volatile i860<VoiceShareScreen> PARSER = null;
        public static final int RATIO_FIELD_NUMBER = 8;
        public static final int ROOMID_FIELD_NUMBER = 3;
        public static final int STATUS_FIELD_NUMBER = 4;
        public static final int TEMPLATEDATA_FIELD_NUMBER = 6;
        public static final int TOAST_FIELD_NUMBER = 7;
        public static final int USERID_FIELD_NUMBER = 2;
        public static final int USERMASK_FIELD_NUMBER = 5;
        private float ratio_;
        private int status_;
        private Template.TemplateData templateData_;
        private userMaskConfig.UserMask userMask_;
        private String id_ = "";
        private String userId_ = "";
        private String roomId_ = "";
        private String toast_ = "";
        private String desc_ = "";

        static {
            VoiceShareScreen voiceShareScreen = new VoiceShareScreen();
            DEFAULT_INSTANCE = voiceShareScreen;
            voiceShareScreen.makeImmutable();
        }

        private VoiceShareScreen() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDesc() {
            this.desc_ = getDefaultInstance().getDesc();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearId() {
            this.id_ = getDefaultInstance().getId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRatio() {
            this.ratio_ = 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRoomId() {
            this.roomId_ = getDefaultInstance().getRoomId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStatus() {
            this.status_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTemplateData() {
            this.templateData_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearToast() {
            this.toast_ = getDefaultInstance().getToast();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUserId() {
            this.userId_ = getDefaultInstance().getUserId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUserMask() {
            this.userMask_ = null;
        }

        public static VoiceShareScreen getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeTemplateData(Template.TemplateData templateData) {
            Template.TemplateData templateData2 = this.templateData_;
            if (templateData2 == null || templateData2 == Template.TemplateData.getDefaultInstance()) {
                this.templateData_ = templateData;
            } else {
                this.templateData_ = (Template.TemplateData) ((Template.TemplateData.Builder) Template.TemplateData.newBuilder(this.templateData_).mergeFrom(templateData)).buildPartial();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeUserMask(userMaskConfig.UserMask userMask) {
            userMaskConfig.UserMask userMask2 = this.userMask_;
            if (userMask2 == null || userMask2 == userMaskConfig.UserMask.getDefaultInstance()) {
                this.userMask_ = userMask;
            } else {
                this.userMask_ = (userMaskConfig.UserMask) ((userMaskConfig.UserMask.Builder) userMaskConfig.UserMask.newBuilder(this.userMask_).mergeFrom(userMask)).buildPartial();
            }
        }

        public static Builder newBuilder(VoiceShareScreen voiceShareScreen) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(voiceShareScreen);
        }

        public static VoiceShareScreen parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VoiceShareScreen) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceShareScreen parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VoiceShareScreen) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<VoiceShareScreen> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDesc(String str) {
            str.getClass();
            this.desc_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDescBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.desc_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setId(String str) {
            str.getClass();
            this.id_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIdBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.id_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRatio(float f) {
            this.ratio_ = f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRoomId(String str) {
            str.getClass();
            this.roomId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRoomIdBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.roomId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStatus(Status status) {
            status.getClass();
            this.status_ = status.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStatusValue(int i) {
            this.status_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTemplateData(Template.TemplateData.Builder builder) {
            this.templateData_ = (Template.TemplateData) builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setToast(String str) {
            str.getClass();
            this.toast_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setToastBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.toast_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserId(String str) {
            str.getClass();
            this.userId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserIdBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.userId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserMask(userMaskConfig.UserMask.Builder builder) {
            this.userMask_ = (userMaskConfig.UserMask) builder.build();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C04221.f1679xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoiceShareScreen();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    VoiceShareScreen voiceShareScreen = (VoiceShareScreen) obj2;
                    this.id_ = hVar.f(!this.id_.isEmpty(), this.id_, !voiceShareScreen.id_.isEmpty(), voiceShareScreen.id_);
                    this.userId_ = hVar.f(!this.userId_.isEmpty(), this.userId_, !voiceShareScreen.userId_.isEmpty(), voiceShareScreen.userId_);
                    this.roomId_ = hVar.f(!this.roomId_.isEmpty(), this.roomId_, !voiceShareScreen.roomId_.isEmpty(), voiceShareScreen.roomId_);
                    int i = this.status_;
                    boolean z2 = i != 0;
                    int i2 = voiceShareScreen.status_;
                    this.status_ = hVar.e(z2, i, i2 != 0, i2);
                    this.userMask_ = hVar.o(this.userMask_, voiceShareScreen.userMask_);
                    this.templateData_ = hVar.o(this.templateData_, voiceShareScreen.templateData_);
                    this.toast_ = hVar.f(!this.toast_.isEmpty(), this.toast_, !voiceShareScreen.toast_.isEmpty(), voiceShareScreen.toast_);
                    float f = this.ratio_;
                    boolean z3 = f != 0.0f;
                    float f2 = voiceShareScreen.ratio_;
                    this.ratio_ = hVar.p(z3, f, f2 != 0.0f, f2);
                    this.desc_ = hVar.f(!this.desc_.isEmpty(), this.desc_, !voiceShareScreen.desc_.isEmpty(), voiceShareScreen.desc_);
                    GeneratedMessageLite.g gVar = GeneratedMessageLite.g.INSTANCE;
                    return this;
                case 6:
                    e eVar = (e) obj;
                    h hVar2 = (h) obj2;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            if (iM != 0) {
                                if (iM == 10) {
                                    this.id_ = eVar.L();
                                } else if (iM == 18) {
                                    this.userId_ = eVar.L();
                                } else if (iM == 26) {
                                    this.roomId_ = eVar.L();
                                } else if (iM == 32) {
                                    this.status_ = eVar.p();
                                } else if (iM == 42) {
                                    userMaskConfig.UserMask userMask = this.userMask_;
                                    userMaskConfig.UserMask.Builder builder = userMask != null ? (userMaskConfig.UserMask.Builder) userMask.toBuilder() : null;
                                    userMaskConfig.UserMask userMaskW = eVar.w(userMaskConfig.UserMask.parser(), hVar2);
                                    this.userMask_ = userMaskW;
                                    if (builder != null) {
                                        builder.mergeFrom(userMaskW);
                                        this.userMask_ = (userMaskConfig.UserMask) builder.buildPartial();
                                    }
                                } else if (iM == 50) {
                                    Template.TemplateData templateData = this.templateData_;
                                    Template.TemplateData.Builder builder2 = templateData != null ? (Template.TemplateData.Builder) templateData.toBuilder() : null;
                                    Template.TemplateData templateDataW = eVar.w(Template.TemplateData.parser(), hVar2);
                                    this.templateData_ = templateDataW;
                                    if (builder2 != null) {
                                        builder2.mergeFrom(templateDataW);
                                        this.templateData_ = (Template.TemplateData) builder2.buildPartial();
                                    }
                                } else if (iM == 58) {
                                    this.toast_ = eVar.L();
                                } else if (iM == 69) {
                                    this.ratio_ = eVar.s();
                                } else if (iM == 74) {
                                    this.desc_ = eVar.L();
                                } else if (!eVar.R(iM)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            aag0.a(e.setUnfinishedMessage(this));
                            return null;
                        } catch (IOException e2) {
                            aag0.a(new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this));
                            return null;
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (PARSER == null) {
                        synchronized (VoiceShareScreen.class) {
                            try {
                                if (PARSER == null) {
                                    PARSER = new GeneratedMessageLite.c(DEFAULT_INSTANCE);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return PARSER;
                default:
                    bz00.a();
                    return null;
            }
            return DEFAULT_INSTANCE;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceShareScreenOrBuilder
        public String getDesc() {
            return this.desc_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceShareScreenOrBuilder
        public ByteString getDescBytes() {
            return ByteString.copyFromUtf8(this.desc_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceShareScreenOrBuilder
        public String getId() {
            return this.id_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceShareScreenOrBuilder
        public ByteString getIdBytes() {
            return ByteString.copyFromUtf8(this.id_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceShareScreenOrBuilder
        public float getRatio() {
            return this.ratio_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceShareScreenOrBuilder
        public String getRoomId() {
            return this.roomId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceShareScreenOrBuilder
        public ByteString getRoomIdBytes() {
            return ByteString.copyFromUtf8(this.roomId_);
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iK = !this.id_.isEmpty() ? CodedOutputStream.K(1, getId()) : 0;
            if (!this.userId_.isEmpty()) {
                iK += CodedOutputStream.K(2, getUserId());
            }
            if (!this.roomId_.isEmpty()) {
                iK += CodedOutputStream.K(3, getRoomId());
            }
            if (this.status_ != Status.start.getNumber()) {
                iK += CodedOutputStream.m(4, this.status_);
            }
            if (this.userMask_ != null) {
                iK += CodedOutputStream.C(5, getUserMask());
            }
            if (this.templateData_ != null) {
                iK += CodedOutputStream.C(6, getTemplateData());
            }
            if (!this.toast_.isEmpty()) {
                iK += CodedOutputStream.K(7, getToast());
            }
            float f = this.ratio_;
            if (f != 0.0f) {
                iK += CodedOutputStream.q(8, f);
            }
            if (!this.desc_.isEmpty()) {
                iK += CodedOutputStream.K(9, getDesc());
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iK;
            return iK;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceShareScreenOrBuilder
        public Status getStatus() {
            Status statusForNumber = Status.forNumber(this.status_);
            return statusForNumber == null ? Status.UNRECOGNIZED : statusForNumber;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceShareScreenOrBuilder
        public int getStatusValue() {
            return this.status_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceShareScreenOrBuilder
        public Template.TemplateData getTemplateData() {
            Template.TemplateData templateData = this.templateData_;
            return templateData == null ? Template.TemplateData.getDefaultInstance() : templateData;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceShareScreenOrBuilder
        public String getToast() {
            return this.toast_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceShareScreenOrBuilder
        public ByteString getToastBytes() {
            return ByteString.copyFromUtf8(this.toast_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceShareScreenOrBuilder
        public String getUserId() {
            return this.userId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceShareScreenOrBuilder
        public ByteString getUserIdBytes() {
            return ByteString.copyFromUtf8(this.userId_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceShareScreenOrBuilder
        public userMaskConfig.UserMask getUserMask() {
            userMaskConfig.UserMask userMask = this.userMask_;
            return userMask == null ? userMaskConfig.UserMask.getDefaultInstance() : userMask;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceShareScreenOrBuilder
        public boolean hasTemplateData() {
            return this.templateData_ != null;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceShareScreenOrBuilder
        public boolean hasUserMask() {
            return this.userMask_ != null;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.id_.isEmpty()) {
                codedOutputStream.D0(1, getId());
            }
            if (!this.userId_.isEmpty()) {
                codedOutputStream.D0(2, getUserId());
            }
            if (!this.roomId_.isEmpty()) {
                codedOutputStream.D0(3, getRoomId());
            }
            if (this.status_ != Status.start.getNumber()) {
                codedOutputStream.i0(4, this.status_);
            }
            if (this.userMask_ != null) {
                codedOutputStream.w0(5, getUserMask());
            }
            if (this.templateData_ != null) {
                codedOutputStream.w0(6, getTemplateData());
            }
            if (!this.toast_.isEmpty()) {
                codedOutputStream.D0(7, getToast());
            }
            float f = this.ratio_;
            if (f != 0.0f) {
                codedOutputStream.o0(8, f);
            }
            if (this.desc_.isEmpty()) {
                return;
            }
            codedOutputStream.D0(9, getDesc());
        }

        public enum Status implements l.c {
            start(0),
            sharing(1),
            stopped(2),
            UNRECOGNIZED(-1);

            private static final l.d<Status> internalValueMap = new l.d<Status>() { // from class: com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceShareScreen.Status.1
                public Status findValueByNumber(int i) {
                    return Status.forNumber(i);
                }
            };
            public static final int sharing_VALUE = 1;
            public static final int start_VALUE = 0;
            public static final int stopped_VALUE = 2;
            private final int value;

            Status(int i) {
                this.value = i;
            }

            public static Status forNumber(int i) {
                if (i == 0) {
                    return start;
                }
                if (i == 1) {
                    return sharing;
                }
                if (i != 2) {
                    return null;
                }
                return stopped;
            }

            public static l.d<Status> internalGetValueMap() {
                return internalValueMap;
            }

            public final int getNumber() {
                return this.value;
            }

            @Deprecated
            public static Status valueOf(int i) {
                return forNumber(i);
            }
        }

        public static VoiceShareScreen parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (VoiceShareScreen) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static VoiceShareScreen parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (VoiceShareScreen) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTemplateData(Template.TemplateData templateData) {
            templateData.getClass();
            this.templateData_ = templateData;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserMask(userMaskConfig.UserMask userMask) {
            userMask.getClass();
            this.userMask_ = userMask;
        }

        public static final class Builder extends GeneratedMessageLite.b<VoiceShareScreen, Builder> implements VoiceShareScreenOrBuilder {
            private Builder() {
                super(VoiceShareScreen.DEFAULT_INSTANCE);
            }

            public Builder clearDesc() {
                copyOnWrite();
                ((VoiceShareScreen) ((GeneratedMessageLite.b) this).instance).clearDesc();
                return this;
            }

            public Builder clearId() {
                copyOnWrite();
                ((VoiceShareScreen) ((GeneratedMessageLite.b) this).instance).clearId();
                return this;
            }

            public Builder clearRatio() {
                copyOnWrite();
                ((VoiceShareScreen) ((GeneratedMessageLite.b) this).instance).clearRatio();
                return this;
            }

            public Builder clearRoomId() {
                copyOnWrite();
                ((VoiceShareScreen) ((GeneratedMessageLite.b) this).instance).clearRoomId();
                return this;
            }

            public Builder clearStatus() {
                copyOnWrite();
                ((VoiceShareScreen) ((GeneratedMessageLite.b) this).instance).clearStatus();
                return this;
            }

            public Builder clearTemplateData() {
                copyOnWrite();
                ((VoiceShareScreen) ((GeneratedMessageLite.b) this).instance).clearTemplateData();
                return this;
            }

            public Builder clearToast() {
                copyOnWrite();
                ((VoiceShareScreen) ((GeneratedMessageLite.b) this).instance).clearToast();
                return this;
            }

            public Builder clearUserId() {
                copyOnWrite();
                ((VoiceShareScreen) ((GeneratedMessageLite.b) this).instance).clearUserId();
                return this;
            }

            public Builder clearUserMask() {
                copyOnWrite();
                ((VoiceShareScreen) ((GeneratedMessageLite.b) this).instance).clearUserMask();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceShareScreenOrBuilder
            public String getDesc() {
                return ((VoiceShareScreen) ((GeneratedMessageLite.b) this).instance).getDesc();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceShareScreenOrBuilder
            public ByteString getDescBytes() {
                return ((VoiceShareScreen) ((GeneratedMessageLite.b) this).instance).getDescBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceShareScreenOrBuilder
            public String getId() {
                return ((VoiceShareScreen) ((GeneratedMessageLite.b) this).instance).getId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceShareScreenOrBuilder
            public ByteString getIdBytes() {
                return ((VoiceShareScreen) ((GeneratedMessageLite.b) this).instance).getIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceShareScreenOrBuilder
            public float getRatio() {
                return ((VoiceShareScreen) ((GeneratedMessageLite.b) this).instance).getRatio();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceShareScreenOrBuilder
            public String getRoomId() {
                return ((VoiceShareScreen) ((GeneratedMessageLite.b) this).instance).getRoomId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceShareScreenOrBuilder
            public ByteString getRoomIdBytes() {
                return ((VoiceShareScreen) ((GeneratedMessageLite.b) this).instance).getRoomIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceShareScreenOrBuilder
            public Status getStatus() {
                return ((VoiceShareScreen) ((GeneratedMessageLite.b) this).instance).getStatus();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceShareScreenOrBuilder
            public int getStatusValue() {
                return ((VoiceShareScreen) ((GeneratedMessageLite.b) this).instance).getStatusValue();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceShareScreenOrBuilder
            public Template.TemplateData getTemplateData() {
                return ((VoiceShareScreen) ((GeneratedMessageLite.b) this).instance).getTemplateData();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceShareScreenOrBuilder
            public String getToast() {
                return ((VoiceShareScreen) ((GeneratedMessageLite.b) this).instance).getToast();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceShareScreenOrBuilder
            public ByteString getToastBytes() {
                return ((VoiceShareScreen) ((GeneratedMessageLite.b) this).instance).getToastBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceShareScreenOrBuilder
            public String getUserId() {
                return ((VoiceShareScreen) ((GeneratedMessageLite.b) this).instance).getUserId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceShareScreenOrBuilder
            public ByteString getUserIdBytes() {
                return ((VoiceShareScreen) ((GeneratedMessageLite.b) this).instance).getUserIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceShareScreenOrBuilder
            public userMaskConfig.UserMask getUserMask() {
                return ((VoiceShareScreen) ((GeneratedMessageLite.b) this).instance).getUserMask();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceShareScreenOrBuilder
            public boolean hasTemplateData() {
                return ((VoiceShareScreen) ((GeneratedMessageLite.b) this).instance).hasTemplateData();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceShareScreenOrBuilder
            public boolean hasUserMask() {
                return ((VoiceShareScreen) ((GeneratedMessageLite.b) this).instance).hasUserMask();
            }

            public Builder mergeTemplateData(Template.TemplateData templateData) {
                copyOnWrite();
                ((VoiceShareScreen) ((GeneratedMessageLite.b) this).instance).mergeTemplateData(templateData);
                return this;
            }

            public Builder mergeUserMask(userMaskConfig.UserMask userMask) {
                copyOnWrite();
                ((VoiceShareScreen) ((GeneratedMessageLite.b) this).instance).mergeUserMask(userMask);
                return this;
            }

            public Builder setDesc(String str) {
                copyOnWrite();
                ((VoiceShareScreen) ((GeneratedMessageLite.b) this).instance).setDesc(str);
                return this;
            }

            public Builder setDescBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceShareScreen) ((GeneratedMessageLite.b) this).instance).setDescBytes(byteString);
                return this;
            }

            public Builder setId(String str) {
                copyOnWrite();
                ((VoiceShareScreen) ((GeneratedMessageLite.b) this).instance).setId(str);
                return this;
            }

            public Builder setIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceShareScreen) ((GeneratedMessageLite.b) this).instance).setIdBytes(byteString);
                return this;
            }

            public Builder setRatio(float f) {
                copyOnWrite();
                ((VoiceShareScreen) ((GeneratedMessageLite.b) this).instance).setRatio(f);
                return this;
            }

            public Builder setRoomId(String str) {
                copyOnWrite();
                ((VoiceShareScreen) ((GeneratedMessageLite.b) this).instance).setRoomId(str);
                return this;
            }

            public Builder setRoomIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceShareScreen) ((GeneratedMessageLite.b) this).instance).setRoomIdBytes(byteString);
                return this;
            }

            public Builder setStatus(Status status) {
                copyOnWrite();
                ((VoiceShareScreen) ((GeneratedMessageLite.b) this).instance).setStatus(status);
                return this;
            }

            public Builder setStatusValue(int i) {
                copyOnWrite();
                ((VoiceShareScreen) ((GeneratedMessageLite.b) this).instance).setStatusValue(i);
                return this;
            }

            public Builder setTemplateData(Template.TemplateData templateData) {
                copyOnWrite();
                ((VoiceShareScreen) ((GeneratedMessageLite.b) this).instance).setTemplateData(templateData);
                return this;
            }

            public Builder setToast(String str) {
                copyOnWrite();
                ((VoiceShareScreen) ((GeneratedMessageLite.b) this).instance).setToast(str);
                return this;
            }

            public Builder setToastBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceShareScreen) ((GeneratedMessageLite.b) this).instance).setToastBytes(byteString);
                return this;
            }

            public Builder setUserId(String str) {
                copyOnWrite();
                ((VoiceShareScreen) ((GeneratedMessageLite.b) this).instance).setUserId(str);
                return this;
            }

            public Builder setUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceShareScreen) ((GeneratedMessageLite.b) this).instance).setUserIdBytes(byteString);
                return this;
            }

            public Builder setUserMask(userMaskConfig.UserMask userMask) {
                copyOnWrite();
                ((VoiceShareScreen) ((GeneratedMessageLite.b) this).instance).setUserMask(userMask);
                return this;
            }

            public Builder setTemplateData(Template.TemplateData.Builder builder) {
                copyOnWrite();
                ((VoiceShareScreen) ((GeneratedMessageLite.b) this).instance).setTemplateData(builder);
                return this;
            }

            public Builder setUserMask(userMaskConfig.UserMask.Builder builder) {
                copyOnWrite();
                ((VoiceShareScreen) ((GeneratedMessageLite.b) this).instance).setUserMask(builder);
                return this;
            }
        }

        public static VoiceShareScreen parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoiceShareScreen) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoiceShareScreen parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (VoiceShareScreen) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static VoiceShareScreen parseFrom(InputStream inputStream) throws IOException {
            return (VoiceShareScreen) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceShareScreen parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (VoiceShareScreen) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static VoiceShareScreen parseFrom(e eVar) throws IOException {
            return (VoiceShareScreen) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static VoiceShareScreen parseFrom(e eVar, h hVar) throws IOException {
            return (VoiceShareScreen) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public static final class BgStyle extends GeneratedMessageLite<BgStyle, Builder> implements BgStyleOrBuilder {
        public static final int ALPHA_FIELD_NUMBER = 3;
        private static final BgStyle DEFAULT_INSTANCE;
        public static final int ENDCOLOR_FIELD_NUMBER = 2;
        private static volatile i860<BgStyle> PARSER = null;
        public static final int STARTCOLOR_FIELD_NUMBER = 1;
        private String startColor_ = "";
        private String endColor_ = "";
        private String alpha_ = "";

        public static final class Builder extends GeneratedMessageLite.b<BgStyle, Builder> implements BgStyleOrBuilder {
            private Builder() {
                super(BgStyle.DEFAULT_INSTANCE);
            }

            public Builder clearAlpha() {
                copyOnWrite();
                ((BgStyle) ((GeneratedMessageLite.b) this).instance).clearAlpha();
                return this;
            }

            public Builder clearEndColor() {
                copyOnWrite();
                ((BgStyle) ((GeneratedMessageLite.b) this).instance).clearEndColor();
                return this;
            }

            public Builder clearStartColor() {
                copyOnWrite();
                ((BgStyle) ((GeneratedMessageLite.b) this).instance).clearStartColor();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.BgStyleOrBuilder
            public String getAlpha() {
                return ((BgStyle) ((GeneratedMessageLite.b) this).instance).getAlpha();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.BgStyleOrBuilder
            public ByteString getAlphaBytes() {
                return ((BgStyle) ((GeneratedMessageLite.b) this).instance).getAlphaBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.BgStyleOrBuilder
            public String getEndColor() {
                return ((BgStyle) ((GeneratedMessageLite.b) this).instance).getEndColor();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.BgStyleOrBuilder
            public ByteString getEndColorBytes() {
                return ((BgStyle) ((GeneratedMessageLite.b) this).instance).getEndColorBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.BgStyleOrBuilder
            public String getStartColor() {
                return ((BgStyle) ((GeneratedMessageLite.b) this).instance).getStartColor();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.BgStyleOrBuilder
            public ByteString getStartColorBytes() {
                return ((BgStyle) ((GeneratedMessageLite.b) this).instance).getStartColorBytes();
            }

            public Builder setAlpha(String str) {
                copyOnWrite();
                ((BgStyle) ((GeneratedMessageLite.b) this).instance).setAlpha(str);
                return this;
            }

            public Builder setAlphaBytes(ByteString byteString) {
                copyOnWrite();
                ((BgStyle) ((GeneratedMessageLite.b) this).instance).setAlphaBytes(byteString);
                return this;
            }

            public Builder setEndColor(String str) {
                copyOnWrite();
                ((BgStyle) ((GeneratedMessageLite.b) this).instance).setEndColor(str);
                return this;
            }

            public Builder setEndColorBytes(ByteString byteString) {
                copyOnWrite();
                ((BgStyle) ((GeneratedMessageLite.b) this).instance).setEndColorBytes(byteString);
                return this;
            }

            public Builder setStartColor(String str) {
                copyOnWrite();
                ((BgStyle) ((GeneratedMessageLite.b) this).instance).setStartColor(str);
                return this;
            }

            public Builder setStartColorBytes(ByteString byteString) {
                copyOnWrite();
                ((BgStyle) ((GeneratedMessageLite.b) this).instance).setStartColorBytes(byteString);
                return this;
            }
        }

        static {
            BgStyle bgStyle = new BgStyle();
            DEFAULT_INSTANCE = bgStyle;
            bgStyle.makeImmutable();
        }

        private BgStyle() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlpha() {
            this.alpha_ = getDefaultInstance().getAlpha();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEndColor() {
            this.endColor_ = getDefaultInstance().getEndColor();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStartColor() {
            this.startColor_ = getDefaultInstance().getStartColor();
        }

        public static BgStyle getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(BgStyle bgStyle) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(bgStyle);
        }

        public static BgStyle parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (BgStyle) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BgStyle parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (BgStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<BgStyle> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlpha(String str) {
            str.getClass();
            this.alpha_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlphaBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.alpha_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEndColor(String str) {
            str.getClass();
            this.endColor_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEndColorBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.endColor_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStartColor(String str) {
            str.getClass();
            this.startColor_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStartColorBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.startColor_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C04221.f1679xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new BgStyle();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    BgStyle bgStyle = (BgStyle) obj2;
                    this.startColor_ = hVar.f(!this.startColor_.isEmpty(), this.startColor_, !bgStyle.startColor_.isEmpty(), bgStyle.startColor_);
                    this.endColor_ = hVar.f(!this.endColor_.isEmpty(), this.endColor_, !bgStyle.endColor_.isEmpty(), bgStyle.endColor_);
                    this.alpha_ = hVar.f(!this.alpha_.isEmpty(), this.alpha_, true ^ bgStyle.alpha_.isEmpty(), bgStyle.alpha_);
                    GeneratedMessageLite.g gVar = GeneratedMessageLite.g.INSTANCE;
                    return this;
                case 6:
                    e eVar = (e) obj;
                    boolean z = false;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            if (iM != 0) {
                                if (iM == 10) {
                                    this.startColor_ = eVar.L();
                                } else if (iM == 18) {
                                    this.endColor_ = eVar.L();
                                } else if (iM == 26) {
                                    this.alpha_ = eVar.L();
                                } else if (!eVar.R(iM)) {
                                }
                            }
                            z = true;
                        } catch (IOException e) {
                            aag0.a(new InvalidProtocolBufferException(e.getMessage()).setUnfinishedMessage(this));
                            return null;
                        } catch (InvalidProtocolBufferException e2) {
                            aag0.a(e2.setUnfinishedMessage(this));
                            return null;
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (PARSER == null) {
                        synchronized (BgStyle.class) {
                            try {
                                if (PARSER == null) {
                                    PARSER = new GeneratedMessageLite.c(DEFAULT_INSTANCE);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return PARSER;
                default:
                    bz00.a();
                    return null;
            }
            return DEFAULT_INSTANCE;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.BgStyleOrBuilder
        public String getAlpha() {
            return this.alpha_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.BgStyleOrBuilder
        public ByteString getAlphaBytes() {
            return ByteString.copyFromUtf8(this.alpha_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.BgStyleOrBuilder
        public String getEndColor() {
            return this.endColor_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.BgStyleOrBuilder
        public ByteString getEndColorBytes() {
            return ByteString.copyFromUtf8(this.endColor_);
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iK = !this.startColor_.isEmpty() ? CodedOutputStream.K(1, getStartColor()) : 0;
            if (!this.endColor_.isEmpty()) {
                iK += CodedOutputStream.K(2, getEndColor());
            }
            if (!this.alpha_.isEmpty()) {
                iK += CodedOutputStream.K(3, getAlpha());
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iK;
            return iK;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.BgStyleOrBuilder
        public String getStartColor() {
            return this.startColor_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.BgStyleOrBuilder
        public ByteString getStartColorBytes() {
            return ByteString.copyFromUtf8(this.startColor_);
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.startColor_.isEmpty()) {
                codedOutputStream.D0(1, getStartColor());
            }
            if (!this.endColor_.isEmpty()) {
                codedOutputStream.D0(2, getEndColor());
            }
            if (this.alpha_.isEmpty()) {
                return;
            }
            codedOutputStream.D0(3, getAlpha());
        }

        public static BgStyle parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (BgStyle) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static BgStyle parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (BgStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static BgStyle parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (BgStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static BgStyle parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (BgStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static BgStyle parseFrom(InputStream inputStream) throws IOException {
            return (BgStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BgStyle parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (BgStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static BgStyle parseFrom(e eVar) throws IOException {
            return (BgStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static BgStyle parseFrom(e eVar, h hVar) throws IOException {
            return (BgStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public enum GuideType implements l.c {
        empty(0),
        fromUser(1),
        other(2),
        UNRECOGNIZED(-1);

        public static final int empty_VALUE = 0;
        public static final int fromUser_VALUE = 1;
        private static final l.d<GuideType> internalValueMap = new l.d<GuideType>() { // from class: com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.GuideType.1
            public GuideType findValueByNumber(int i) {
                return GuideType.forNumber(i);
            }
        };
        public static final int other_VALUE = 2;
        private final int value;

        GuideType(int i) {
            this.value = i;
        }

        public static GuideType forNumber(int i) {
            if (i == 0) {
                return empty;
            }
            if (i == 1) {
                return fromUser;
            }
            if (i != 2) {
                return null;
            }
            return other;
        }

        public static l.d<GuideType> internalGetValueMap() {
            return internalValueMap;
        }

        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static GuideType valueOf(int i) {
            return forNumber(i);
        }
    }

    public static final class LuckyParadiseEntrance extends GeneratedMessageLite<LuckyParadiseEntrance, Builder> implements LuckyParadiseEntranceOrBuilder {
        public static final int CRAZYICON_FIELD_NUMBER = 6;
        public static final int CURRENTTIME_FIELD_NUMBER = 3;
        public static final int DEFAULTICON_FIELD_NUMBER = 5;
        private static final LuckyParadiseEntrance DEFAULT_INSTANCE;
        public static final int ENDTIME_FIELD_NUMBER = 4;
        public static final int ISCRAZYNOW_FIELD_NUMBER = 1;
        private static volatile i860<LuckyParadiseEntrance> PARSER = null;
        public static final int POOLTYPE_FIELD_NUMBER = 2;
        private long currentTime_;
        private long endTime_;
        private boolean isCrazyNow_;
        private String poolType_ = "";
        private String defaultIcon_ = "";
        private String crazyIcon_ = "";

        public static final class Builder extends GeneratedMessageLite.b<LuckyParadiseEntrance, Builder> implements LuckyParadiseEntranceOrBuilder {
            private Builder() {
                super(LuckyParadiseEntrance.DEFAULT_INSTANCE);
            }

            public Builder clearCrazyIcon() {
                copyOnWrite();
                ((LuckyParadiseEntrance) ((GeneratedMessageLite.b) this).instance).clearCrazyIcon();
                return this;
            }

            public Builder clearCurrentTime() {
                copyOnWrite();
                ((LuckyParadiseEntrance) ((GeneratedMessageLite.b) this).instance).clearCurrentTime();
                return this;
            }

            public Builder clearDefaultIcon() {
                copyOnWrite();
                ((LuckyParadiseEntrance) ((GeneratedMessageLite.b) this).instance).clearDefaultIcon();
                return this;
            }

            public Builder clearEndTime() {
                copyOnWrite();
                ((LuckyParadiseEntrance) ((GeneratedMessageLite.b) this).instance).clearEndTime();
                return this;
            }

            public Builder clearIsCrazyNow() {
                copyOnWrite();
                ((LuckyParadiseEntrance) ((GeneratedMessageLite.b) this).instance).clearIsCrazyNow();
                return this;
            }

            public Builder clearPoolType() {
                copyOnWrite();
                ((LuckyParadiseEntrance) ((GeneratedMessageLite.b) this).instance).clearPoolType();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.LuckyParadiseEntranceOrBuilder
            public String getCrazyIcon() {
                return ((LuckyParadiseEntrance) ((GeneratedMessageLite.b) this).instance).getCrazyIcon();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.LuckyParadiseEntranceOrBuilder
            public ByteString getCrazyIconBytes() {
                return ((LuckyParadiseEntrance) ((GeneratedMessageLite.b) this).instance).getCrazyIconBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.LuckyParadiseEntranceOrBuilder
            public long getCurrentTime() {
                return ((LuckyParadiseEntrance) ((GeneratedMessageLite.b) this).instance).getCurrentTime();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.LuckyParadiseEntranceOrBuilder
            public String getDefaultIcon() {
                return ((LuckyParadiseEntrance) ((GeneratedMessageLite.b) this).instance).getDefaultIcon();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.LuckyParadiseEntranceOrBuilder
            public ByteString getDefaultIconBytes() {
                return ((LuckyParadiseEntrance) ((GeneratedMessageLite.b) this).instance).getDefaultIconBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.LuckyParadiseEntranceOrBuilder
            public long getEndTime() {
                return ((LuckyParadiseEntrance) ((GeneratedMessageLite.b) this).instance).getEndTime();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.LuckyParadiseEntranceOrBuilder
            public boolean getIsCrazyNow() {
                return ((LuckyParadiseEntrance) ((GeneratedMessageLite.b) this).instance).getIsCrazyNow();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.LuckyParadiseEntranceOrBuilder
            public String getPoolType() {
                return ((LuckyParadiseEntrance) ((GeneratedMessageLite.b) this).instance).getPoolType();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.LuckyParadiseEntranceOrBuilder
            public ByteString getPoolTypeBytes() {
                return ((LuckyParadiseEntrance) ((GeneratedMessageLite.b) this).instance).getPoolTypeBytes();
            }

            public Builder setCrazyIcon(String str) {
                copyOnWrite();
                ((LuckyParadiseEntrance) ((GeneratedMessageLite.b) this).instance).setCrazyIcon(str);
                return this;
            }

            public Builder setCrazyIconBytes(ByteString byteString) {
                copyOnWrite();
                ((LuckyParadiseEntrance) ((GeneratedMessageLite.b) this).instance).setCrazyIconBytes(byteString);
                return this;
            }

            public Builder setCurrentTime(long j) {
                copyOnWrite();
                ((LuckyParadiseEntrance) ((GeneratedMessageLite.b) this).instance).setCurrentTime(j);
                return this;
            }

            public Builder setDefaultIcon(String str) {
                copyOnWrite();
                ((LuckyParadiseEntrance) ((GeneratedMessageLite.b) this).instance).setDefaultIcon(str);
                return this;
            }

            public Builder setDefaultIconBytes(ByteString byteString) {
                copyOnWrite();
                ((LuckyParadiseEntrance) ((GeneratedMessageLite.b) this).instance).setDefaultIconBytes(byteString);
                return this;
            }

            public Builder setEndTime(long j) {
                copyOnWrite();
                ((LuckyParadiseEntrance) ((GeneratedMessageLite.b) this).instance).setEndTime(j);
                return this;
            }

            public Builder setIsCrazyNow(boolean z) {
                copyOnWrite();
                ((LuckyParadiseEntrance) ((GeneratedMessageLite.b) this).instance).setIsCrazyNow(z);
                return this;
            }

            public Builder setPoolType(String str) {
                copyOnWrite();
                ((LuckyParadiseEntrance) ((GeneratedMessageLite.b) this).instance).setPoolType(str);
                return this;
            }

            public Builder setPoolTypeBytes(ByteString byteString) {
                copyOnWrite();
                ((LuckyParadiseEntrance) ((GeneratedMessageLite.b) this).instance).setPoolTypeBytes(byteString);
                return this;
            }
        }

        static {
            LuckyParadiseEntrance luckyParadiseEntrance = new LuckyParadiseEntrance();
            DEFAULT_INSTANCE = luckyParadiseEntrance;
            luckyParadiseEntrance.makeImmutable();
        }

        private LuckyParadiseEntrance() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCrazyIcon() {
            this.crazyIcon_ = getDefaultInstance().getCrazyIcon();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCurrentTime() {
            this.currentTime_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDefaultIcon() {
            this.defaultIcon_ = getDefaultInstance().getDefaultIcon();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEndTime() {
            this.endTime_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIsCrazyNow() {
            this.isCrazyNow_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPoolType() {
            this.poolType_ = getDefaultInstance().getPoolType();
        }

        public static LuckyParadiseEntrance getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(LuckyParadiseEntrance luckyParadiseEntrance) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(luckyParadiseEntrance);
        }

        public static LuckyParadiseEntrance parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (LuckyParadiseEntrance) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LuckyParadiseEntrance parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (LuckyParadiseEntrance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<LuckyParadiseEntrance> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCrazyIcon(String str) {
            str.getClass();
            this.crazyIcon_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCrazyIconBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.crazyIcon_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCurrentTime(long j) {
            this.currentTime_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDefaultIcon(String str) {
            str.getClass();
            this.defaultIcon_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDefaultIconBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.defaultIcon_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEndTime(long j) {
            this.endTime_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIsCrazyNow(boolean z) {
            this.isCrazyNow_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPoolType(String str) {
            str.getClass();
            this.poolType_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPoolTypeBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.poolType_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C04221.f1679xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new LuckyParadiseEntrance();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    LuckyParadiseEntrance luckyParadiseEntrance = (LuckyParadiseEntrance) obj2;
                    boolean z2 = this.isCrazyNow_;
                    boolean z3 = luckyParadiseEntrance.isCrazyNow_;
                    this.isCrazyNow_ = hVar.d(z2, z2, z3, z3);
                    this.poolType_ = hVar.f(!this.poolType_.isEmpty(), this.poolType_, !luckyParadiseEntrance.poolType_.isEmpty(), luckyParadiseEntrance.poolType_);
                    long j = this.currentTime_;
                    boolean z4 = j != 0;
                    long j2 = luckyParadiseEntrance.currentTime_;
                    this.currentTime_ = hVar.i(z4, j, j2 != 0, j2);
                    long j3 = this.endTime_;
                    boolean z5 = j3 != 0;
                    long j4 = luckyParadiseEntrance.endTime_;
                    this.endTime_ = hVar.i(z5, j3, j4 != 0, j4);
                    this.defaultIcon_ = hVar.f(!this.defaultIcon_.isEmpty(), this.defaultIcon_, !luckyParadiseEntrance.defaultIcon_.isEmpty(), luckyParadiseEntrance.defaultIcon_);
                    this.crazyIcon_ = hVar.f(!this.crazyIcon_.isEmpty(), this.crazyIcon_, !luckyParadiseEntrance.crazyIcon_.isEmpty(), luckyParadiseEntrance.crazyIcon_);
                    GeneratedMessageLite.g gVar = GeneratedMessageLite.g.INSTANCE;
                    return this;
                case 6:
                    e eVar = (e) obj;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            if (iM != 0) {
                                if (iM == 8) {
                                    this.isCrazyNow_ = eVar.m();
                                } else if (iM == 18) {
                                    this.poolType_ = eVar.L();
                                } else if (iM == 24) {
                                    this.currentTime_ = eVar.v();
                                } else if (iM == 32) {
                                    this.endTime_ = eVar.v();
                                } else if (iM == 42) {
                                    this.defaultIcon_ = eVar.L();
                                } else if (iM == 50) {
                                    this.crazyIcon_ = eVar.L();
                                } else if (!eVar.R(iM)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            aag0.a(e.setUnfinishedMessage(this));
                            return null;
                        } catch (IOException e2) {
                            aag0.a(new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this));
                            return null;
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (PARSER == null) {
                        synchronized (LuckyParadiseEntrance.class) {
                            try {
                                if (PARSER == null) {
                                    PARSER = new GeneratedMessageLite.c(DEFAULT_INSTANCE);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return PARSER;
                default:
                    bz00.a();
                    return null;
            }
            return DEFAULT_INSTANCE;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.LuckyParadiseEntranceOrBuilder
        public String getCrazyIcon() {
            return this.crazyIcon_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.LuckyParadiseEntranceOrBuilder
        public ByteString getCrazyIconBytes() {
            return ByteString.copyFromUtf8(this.crazyIcon_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.LuckyParadiseEntranceOrBuilder
        public long getCurrentTime() {
            return this.currentTime_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.LuckyParadiseEntranceOrBuilder
        public String getDefaultIcon() {
            return this.defaultIcon_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.LuckyParadiseEntranceOrBuilder
        public ByteString getDefaultIconBytes() {
            return ByteString.copyFromUtf8(this.defaultIcon_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.LuckyParadiseEntranceOrBuilder
        public long getEndTime() {
            return this.endTime_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.LuckyParadiseEntranceOrBuilder
        public boolean getIsCrazyNow() {
            return this.isCrazyNow_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.LuckyParadiseEntranceOrBuilder
        public String getPoolType() {
            return this.poolType_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.LuckyParadiseEntranceOrBuilder
        public ByteString getPoolTypeBytes() {
            return ByteString.copyFromUtf8(this.poolType_);
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            boolean z = this.isCrazyNow_;
            int iF = z ? CodedOutputStream.f(1, z) : 0;
            if (!this.poolType_.isEmpty()) {
                iF += CodedOutputStream.K(2, getPoolType());
            }
            long j = this.currentTime_;
            if (j != 0) {
                iF += CodedOutputStream.v(3, j);
            }
            long j2 = this.endTime_;
            if (j2 != 0) {
                iF += CodedOutputStream.v(4, j2);
            }
            if (!this.defaultIcon_.isEmpty()) {
                iF += CodedOutputStream.K(5, getDefaultIcon());
            }
            if (!this.crazyIcon_.isEmpty()) {
                iF += CodedOutputStream.K(6, getCrazyIcon());
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iF;
            return iF;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            boolean z = this.isCrazyNow_;
            if (z) {
                codedOutputStream.a0(1, z);
            }
            if (!this.poolType_.isEmpty()) {
                codedOutputStream.D0(2, getPoolType());
            }
            long j = this.currentTime_;
            if (j != 0) {
                codedOutputStream.u0(3, j);
            }
            long j2 = this.endTime_;
            if (j2 != 0) {
                codedOutputStream.u0(4, j2);
            }
            if (!this.defaultIcon_.isEmpty()) {
                codedOutputStream.D0(5, getDefaultIcon());
            }
            if (this.crazyIcon_.isEmpty()) {
                return;
            }
            codedOutputStream.D0(6, getCrazyIcon());
        }

        public static LuckyParadiseEntrance parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (LuckyParadiseEntrance) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static LuckyParadiseEntrance parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (LuckyParadiseEntrance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static LuckyParadiseEntrance parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (LuckyParadiseEntrance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static LuckyParadiseEntrance parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (LuckyParadiseEntrance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static LuckyParadiseEntrance parseFrom(InputStream inputStream) throws IOException {
            return (LuckyParadiseEntrance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LuckyParadiseEntrance parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (LuckyParadiseEntrance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static LuckyParadiseEntrance parseFrom(e eVar) throws IOException {
            return (LuckyParadiseEntrance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static LuckyParadiseEntrance parseFrom(e eVar, h hVar) throws IOException {
            return (LuckyParadiseEntrance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public static final class StarRedpacketInfo extends GeneratedMessageLite<StarRedpacketInfo, Builder> implements StarRedpacketInfoOrBuilder {
        private static final StarRedpacketInfo DEFAULT_INSTANCE;
        public static final int ID_FIELD_NUMBER = 1;
        private static volatile i860<StarRedpacketInfo> PARSER = null;
        public static final int ROOMID_FIELD_NUMBER = 2;
        public static final int STATE_FIELD_NUMBER = 3;
        private String id_ = "";
        private String roomId_ = "";
        private String state_ = "";

        public static final class Builder extends GeneratedMessageLite.b<StarRedpacketInfo, Builder> implements StarRedpacketInfoOrBuilder {
            private Builder() {
                super(StarRedpacketInfo.DEFAULT_INSTANCE);
            }

            public Builder clearId() {
                copyOnWrite();
                ((StarRedpacketInfo) ((GeneratedMessageLite.b) this).instance).clearId();
                return this;
            }

            public Builder clearRoomId() {
                copyOnWrite();
                ((StarRedpacketInfo) ((GeneratedMessageLite.b) this).instance).clearRoomId();
                return this;
            }

            public Builder clearState() {
                copyOnWrite();
                ((StarRedpacketInfo) ((GeneratedMessageLite.b) this).instance).clearState();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.StarRedpacketInfoOrBuilder
            public String getId() {
                return ((StarRedpacketInfo) ((GeneratedMessageLite.b) this).instance).getId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.StarRedpacketInfoOrBuilder
            public ByteString getIdBytes() {
                return ((StarRedpacketInfo) ((GeneratedMessageLite.b) this).instance).getIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.StarRedpacketInfoOrBuilder
            public String getRoomId() {
                return ((StarRedpacketInfo) ((GeneratedMessageLite.b) this).instance).getRoomId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.StarRedpacketInfoOrBuilder
            public ByteString getRoomIdBytes() {
                return ((StarRedpacketInfo) ((GeneratedMessageLite.b) this).instance).getRoomIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.StarRedpacketInfoOrBuilder
            public String getState() {
                return ((StarRedpacketInfo) ((GeneratedMessageLite.b) this).instance).getState();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.StarRedpacketInfoOrBuilder
            public ByteString getStateBytes() {
                return ((StarRedpacketInfo) ((GeneratedMessageLite.b) this).instance).getStateBytes();
            }

            public Builder setId(String str) {
                copyOnWrite();
                ((StarRedpacketInfo) ((GeneratedMessageLite.b) this).instance).setId(str);
                return this;
            }

            public Builder setIdBytes(ByteString byteString) {
                copyOnWrite();
                ((StarRedpacketInfo) ((GeneratedMessageLite.b) this).instance).setIdBytes(byteString);
                return this;
            }

            public Builder setRoomId(String str) {
                copyOnWrite();
                ((StarRedpacketInfo) ((GeneratedMessageLite.b) this).instance).setRoomId(str);
                return this;
            }

            public Builder setRoomIdBytes(ByteString byteString) {
                copyOnWrite();
                ((StarRedpacketInfo) ((GeneratedMessageLite.b) this).instance).setRoomIdBytes(byteString);
                return this;
            }

            public Builder setState(String str) {
                copyOnWrite();
                ((StarRedpacketInfo) ((GeneratedMessageLite.b) this).instance).setState(str);
                return this;
            }

            public Builder setStateBytes(ByteString byteString) {
                copyOnWrite();
                ((StarRedpacketInfo) ((GeneratedMessageLite.b) this).instance).setStateBytes(byteString);
                return this;
            }
        }

        static {
            StarRedpacketInfo starRedpacketInfo = new StarRedpacketInfo();
            DEFAULT_INSTANCE = starRedpacketInfo;
            starRedpacketInfo.makeImmutable();
        }

        private StarRedpacketInfo() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearId() {
            this.id_ = getDefaultInstance().getId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRoomId() {
            this.roomId_ = getDefaultInstance().getRoomId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearState() {
            this.state_ = getDefaultInstance().getState();
        }

        public static StarRedpacketInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(StarRedpacketInfo starRedpacketInfo) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(starRedpacketInfo);
        }

        public static StarRedpacketInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (StarRedpacketInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static StarRedpacketInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (StarRedpacketInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<StarRedpacketInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setId(String str) {
            str.getClass();
            this.id_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIdBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.id_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRoomId(String str) {
            str.getClass();
            this.roomId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRoomIdBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.roomId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setState(String str) {
            str.getClass();
            this.state_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStateBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.state_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C04221.f1679xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new StarRedpacketInfo();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    StarRedpacketInfo starRedpacketInfo = (StarRedpacketInfo) obj2;
                    this.id_ = hVar.f(!this.id_.isEmpty(), this.id_, !starRedpacketInfo.id_.isEmpty(), starRedpacketInfo.id_);
                    this.roomId_ = hVar.f(!this.roomId_.isEmpty(), this.roomId_, !starRedpacketInfo.roomId_.isEmpty(), starRedpacketInfo.roomId_);
                    this.state_ = hVar.f(!this.state_.isEmpty(), this.state_, true ^ starRedpacketInfo.state_.isEmpty(), starRedpacketInfo.state_);
                    GeneratedMessageLite.g gVar = GeneratedMessageLite.g.INSTANCE;
                    return this;
                case 6:
                    e eVar = (e) obj;
                    boolean z = false;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            if (iM != 0) {
                                if (iM == 10) {
                                    this.id_ = eVar.L();
                                } else if (iM == 18) {
                                    this.roomId_ = eVar.L();
                                } else if (iM == 26) {
                                    this.state_ = eVar.L();
                                } else if (!eVar.R(iM)) {
                                }
                            }
                            z = true;
                        } catch (IOException e) {
                            aag0.a(new InvalidProtocolBufferException(e.getMessage()).setUnfinishedMessage(this));
                            return null;
                        } catch (InvalidProtocolBufferException e2) {
                            aag0.a(e2.setUnfinishedMessage(this));
                            return null;
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (PARSER == null) {
                        synchronized (StarRedpacketInfo.class) {
                            try {
                                if (PARSER == null) {
                                    PARSER = new GeneratedMessageLite.c(DEFAULT_INSTANCE);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return PARSER;
                default:
                    bz00.a();
                    return null;
            }
            return DEFAULT_INSTANCE;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.StarRedpacketInfoOrBuilder
        public String getId() {
            return this.id_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.StarRedpacketInfoOrBuilder
        public ByteString getIdBytes() {
            return ByteString.copyFromUtf8(this.id_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.StarRedpacketInfoOrBuilder
        public String getRoomId() {
            return this.roomId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.StarRedpacketInfoOrBuilder
        public ByteString getRoomIdBytes() {
            return ByteString.copyFromUtf8(this.roomId_);
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iK = !this.id_.isEmpty() ? CodedOutputStream.K(1, getId()) : 0;
            if (!this.roomId_.isEmpty()) {
                iK += CodedOutputStream.K(2, getRoomId());
            }
            if (!this.state_.isEmpty()) {
                iK += CodedOutputStream.K(3, getState());
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iK;
            return iK;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.StarRedpacketInfoOrBuilder
        public String getState() {
            return this.state_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.StarRedpacketInfoOrBuilder
        public ByteString getStateBytes() {
            return ByteString.copyFromUtf8(this.state_);
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.id_.isEmpty()) {
                codedOutputStream.D0(1, getId());
            }
            if (!this.roomId_.isEmpty()) {
                codedOutputStream.D0(2, getRoomId());
            }
            if (this.state_.isEmpty()) {
                return;
            }
            codedOutputStream.D0(3, getState());
        }

        public static StarRedpacketInfo parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (StarRedpacketInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static StarRedpacketInfo parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (StarRedpacketInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static StarRedpacketInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (StarRedpacketInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static StarRedpacketInfo parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (StarRedpacketInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static StarRedpacketInfo parseFrom(InputStream inputStream) throws IOException {
            return (StarRedpacketInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static StarRedpacketInfo parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (StarRedpacketInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static StarRedpacketInfo parseFrom(e eVar) throws IOException {
            return (StarRedpacketInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static StarRedpacketInfo parseFrom(e eVar, h hVar) throws IOException {
            return (StarRedpacketInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public static final class VoiceAvatarFramePayGuidePopUp extends GeneratedMessageLite<VoiceAvatarFramePayGuidePopUp, Builder> implements VoiceAvatarFramePayGuidePopUpOrBuilder {
        public static final int BUTTONSUBTITLE_FIELD_NUMBER = 7;
        public static final int BUTTONTITLE_FIELD_NUMBER = 6;
        private static final VoiceAvatarFramePayGuidePopUp DEFAULT_INSTANCE;
        public static final int FROMUSERMASK_FIELD_NUMBER = 4;
        public static final int GIFTCOUNT_FIELD_NUMBER = 9;
        public static final int GIFTID_FIELD_NUMBER = 8;
        private static volatile i860<VoiceAvatarFramePayGuidePopUp> PARSER = null;
        public static final int SUBTITLE_FIELD_NUMBER = 3;
        public static final int TITLE_FIELD_NUMBER = 2;
        public static final int TOUSERMASK_FIELD_NUMBER = 5;
        public static final int USERID_FIELD_NUMBER = 1;
        private userMaskConfig.UserMask fromUserMask_;
        private long giftCount_;
        private long giftId_;
        private userMaskConfig.UserMask toUserMask_;
        private String userId_ = "";
        private String title_ = "";
        private String subTitle_ = "";
        private String buttonTitle_ = "";
        private String buttonSubTitle_ = "";

        static {
            VoiceAvatarFramePayGuidePopUp voiceAvatarFramePayGuidePopUp = new VoiceAvatarFramePayGuidePopUp();
            DEFAULT_INSTANCE = voiceAvatarFramePayGuidePopUp;
            voiceAvatarFramePayGuidePopUp.makeImmutable();
        }

        private VoiceAvatarFramePayGuidePopUp() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearButtonSubTitle() {
            this.buttonSubTitle_ = getDefaultInstance().getButtonSubTitle();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearButtonTitle() {
            this.buttonTitle_ = getDefaultInstance().getButtonTitle();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFromUserMask() {
            this.fromUserMask_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGiftCount() {
            this.giftCount_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGiftId() {
            this.giftId_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSubTitle() {
            this.subTitle_ = getDefaultInstance().getSubTitle();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTitle() {
            this.title_ = getDefaultInstance().getTitle();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearToUserMask() {
            this.toUserMask_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUserId() {
            this.userId_ = getDefaultInstance().getUserId();
        }

        public static VoiceAvatarFramePayGuidePopUp getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeFromUserMask(userMaskConfig.UserMask userMask) {
            userMaskConfig.UserMask userMask2 = this.fromUserMask_;
            if (userMask2 == null || userMask2 == userMaskConfig.UserMask.getDefaultInstance()) {
                this.fromUserMask_ = userMask;
            } else {
                this.fromUserMask_ = (userMaskConfig.UserMask) ((userMaskConfig.UserMask.Builder) userMaskConfig.UserMask.newBuilder(this.fromUserMask_).mergeFrom(userMask)).buildPartial();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeToUserMask(userMaskConfig.UserMask userMask) {
            userMaskConfig.UserMask userMask2 = this.toUserMask_;
            if (userMask2 == null || userMask2 == userMaskConfig.UserMask.getDefaultInstance()) {
                this.toUserMask_ = userMask;
            } else {
                this.toUserMask_ = (userMaskConfig.UserMask) ((userMaskConfig.UserMask.Builder) userMaskConfig.UserMask.newBuilder(this.toUserMask_).mergeFrom(userMask)).buildPartial();
            }
        }

        public static Builder newBuilder(VoiceAvatarFramePayGuidePopUp voiceAvatarFramePayGuidePopUp) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(voiceAvatarFramePayGuidePopUp);
        }

        public static VoiceAvatarFramePayGuidePopUp parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VoiceAvatarFramePayGuidePopUp) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceAvatarFramePayGuidePopUp parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VoiceAvatarFramePayGuidePopUp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<VoiceAvatarFramePayGuidePopUp> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setButtonSubTitle(String str) {
            str.getClass();
            this.buttonSubTitle_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setButtonSubTitleBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.buttonSubTitle_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setButtonTitle(String str) {
            str.getClass();
            this.buttonTitle_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setButtonTitleBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.buttonTitle_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFromUserMask(userMaskConfig.UserMask.Builder builder) {
            this.fromUserMask_ = (userMaskConfig.UserMask) builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGiftCount(long j) {
            this.giftCount_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGiftId(long j) {
            this.giftId_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSubTitle(String str) {
            str.getClass();
            this.subTitle_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSubTitleBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.subTitle_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTitle(String str) {
            str.getClass();
            this.title_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTitleBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.title_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setToUserMask(userMaskConfig.UserMask.Builder builder) {
            this.toUserMask_ = (userMaskConfig.UserMask) builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserId(String str) {
            str.getClass();
            this.userId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserIdBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.userId_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C04221.f1679xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoiceAvatarFramePayGuidePopUp();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    VoiceAvatarFramePayGuidePopUp voiceAvatarFramePayGuidePopUp = (VoiceAvatarFramePayGuidePopUp) obj2;
                    this.userId_ = hVar.f(!this.userId_.isEmpty(), this.userId_, !voiceAvatarFramePayGuidePopUp.userId_.isEmpty(), voiceAvatarFramePayGuidePopUp.userId_);
                    this.title_ = hVar.f(!this.title_.isEmpty(), this.title_, !voiceAvatarFramePayGuidePopUp.title_.isEmpty(), voiceAvatarFramePayGuidePopUp.title_);
                    this.subTitle_ = hVar.f(!this.subTitle_.isEmpty(), this.subTitle_, !voiceAvatarFramePayGuidePopUp.subTitle_.isEmpty(), voiceAvatarFramePayGuidePopUp.subTitle_);
                    this.fromUserMask_ = hVar.o(this.fromUserMask_, voiceAvatarFramePayGuidePopUp.fromUserMask_);
                    this.toUserMask_ = hVar.o(this.toUserMask_, voiceAvatarFramePayGuidePopUp.toUserMask_);
                    this.buttonTitle_ = hVar.f(!this.buttonTitle_.isEmpty(), this.buttonTitle_, !voiceAvatarFramePayGuidePopUp.buttonTitle_.isEmpty(), voiceAvatarFramePayGuidePopUp.buttonTitle_);
                    this.buttonSubTitle_ = hVar.f(!this.buttonSubTitle_.isEmpty(), this.buttonSubTitle_, !voiceAvatarFramePayGuidePopUp.buttonSubTitle_.isEmpty(), voiceAvatarFramePayGuidePopUp.buttonSubTitle_);
                    long j = this.giftId_;
                    boolean z2 = j != 0;
                    long j2 = voiceAvatarFramePayGuidePopUp.giftId_;
                    this.giftId_ = hVar.i(z2, j, j2 != 0, j2);
                    boolean z3 = false;
                    long j3 = this.giftCount_;
                    if (j3 != 0) {
                        z3 = true;
                    }
                    long j4 = voiceAvatarFramePayGuidePopUp.giftCount_;
                    this.giftCount_ = hVar.i(z3, j3, j4 != 0, j4);
                    GeneratedMessageLite.g gVar = GeneratedMessageLite.g.INSTANCE;
                    return this;
                case 6:
                    e eVar = (e) obj;
                    h hVar2 = (h) obj2;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            if (iM != 0) {
                                if (iM == 10) {
                                    this.userId_ = eVar.L();
                                } else if (iM == 18) {
                                    this.title_ = eVar.L();
                                } else if (iM == 26) {
                                    this.subTitle_ = eVar.L();
                                } else if (iM == 34) {
                                    userMaskConfig.UserMask userMask = this.fromUserMask_;
                                    userMaskConfig.UserMask.Builder builder = userMask != null ? (userMaskConfig.UserMask.Builder) userMask.toBuilder() : null;
                                    userMaskConfig.UserMask userMaskW = eVar.w(userMaskConfig.UserMask.parser(), hVar2);
                                    this.fromUserMask_ = userMaskW;
                                    if (builder != null) {
                                        builder.mergeFrom(userMaskW);
                                        this.fromUserMask_ = (userMaskConfig.UserMask) builder.buildPartial();
                                    }
                                } else if (iM == 42) {
                                    userMaskConfig.UserMask userMask2 = this.toUserMask_;
                                    userMaskConfig.UserMask.Builder builder2 = userMask2 != null ? (userMaskConfig.UserMask.Builder) userMask2.toBuilder() : null;
                                    userMaskConfig.UserMask userMaskW2 = eVar.w(userMaskConfig.UserMask.parser(), hVar2);
                                    this.toUserMask_ = userMaskW2;
                                    if (builder2 != null) {
                                        builder2.mergeFrom(userMaskW2);
                                        this.toUserMask_ = (userMaskConfig.UserMask) builder2.buildPartial();
                                    }
                                } else if (iM == 50) {
                                    this.buttonTitle_ = eVar.L();
                                } else if (iM == 58) {
                                    this.buttonSubTitle_ = eVar.L();
                                } else if (iM == 64) {
                                    this.giftId_ = eVar.v();
                                } else if (iM == 72) {
                                    this.giftCount_ = eVar.v();
                                } else if (!eVar.R(iM)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            aag0.a(e.setUnfinishedMessage(this));
                            return null;
                        } catch (IOException e2) {
                            aag0.a(new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this));
                            return null;
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (PARSER == null) {
                        synchronized (VoiceAvatarFramePayGuidePopUp.class) {
                            try {
                                if (PARSER == null) {
                                    PARSER = new GeneratedMessageLite.c(DEFAULT_INSTANCE);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return PARSER;
                default:
                    bz00.a();
                    return null;
            }
            return DEFAULT_INSTANCE;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceAvatarFramePayGuidePopUpOrBuilder
        public String getButtonSubTitle() {
            return this.buttonSubTitle_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceAvatarFramePayGuidePopUpOrBuilder
        public ByteString getButtonSubTitleBytes() {
            return ByteString.copyFromUtf8(this.buttonSubTitle_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceAvatarFramePayGuidePopUpOrBuilder
        public String getButtonTitle() {
            return this.buttonTitle_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceAvatarFramePayGuidePopUpOrBuilder
        public ByteString getButtonTitleBytes() {
            return ByteString.copyFromUtf8(this.buttonTitle_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceAvatarFramePayGuidePopUpOrBuilder
        public userMaskConfig.UserMask getFromUserMask() {
            userMaskConfig.UserMask userMask = this.fromUserMask_;
            return userMask == null ? userMaskConfig.UserMask.getDefaultInstance() : userMask;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceAvatarFramePayGuidePopUpOrBuilder
        public long getGiftCount() {
            return this.giftCount_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceAvatarFramePayGuidePopUpOrBuilder
        public long getGiftId() {
            return this.giftId_;
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iK = !this.userId_.isEmpty() ? CodedOutputStream.K(1, getUserId()) : 0;
            if (!this.title_.isEmpty()) {
                iK += CodedOutputStream.K(2, getTitle());
            }
            if (!this.subTitle_.isEmpty()) {
                iK += CodedOutputStream.K(3, getSubTitle());
            }
            if (this.fromUserMask_ != null) {
                iK += CodedOutputStream.C(4, getFromUserMask());
            }
            if (this.toUserMask_ != null) {
                iK += CodedOutputStream.C(5, getToUserMask());
            }
            if (!this.buttonTitle_.isEmpty()) {
                iK += CodedOutputStream.K(6, getButtonTitle());
            }
            if (!this.buttonSubTitle_.isEmpty()) {
                iK += CodedOutputStream.K(7, getButtonSubTitle());
            }
            long j = this.giftId_;
            if (j != 0) {
                iK += CodedOutputStream.v(8, j);
            }
            long j2 = this.giftCount_;
            if (j2 != 0) {
                iK += CodedOutputStream.v(9, j2);
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iK;
            return iK;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceAvatarFramePayGuidePopUpOrBuilder
        public String getSubTitle() {
            return this.subTitle_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceAvatarFramePayGuidePopUpOrBuilder
        public ByteString getSubTitleBytes() {
            return ByteString.copyFromUtf8(this.subTitle_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceAvatarFramePayGuidePopUpOrBuilder
        public String getTitle() {
            return this.title_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceAvatarFramePayGuidePopUpOrBuilder
        public ByteString getTitleBytes() {
            return ByteString.copyFromUtf8(this.title_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceAvatarFramePayGuidePopUpOrBuilder
        public userMaskConfig.UserMask getToUserMask() {
            userMaskConfig.UserMask userMask = this.toUserMask_;
            return userMask == null ? userMaskConfig.UserMask.getDefaultInstance() : userMask;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceAvatarFramePayGuidePopUpOrBuilder
        public String getUserId() {
            return this.userId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceAvatarFramePayGuidePopUpOrBuilder
        public ByteString getUserIdBytes() {
            return ByteString.copyFromUtf8(this.userId_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceAvatarFramePayGuidePopUpOrBuilder
        public boolean hasFromUserMask() {
            return this.fromUserMask_ != null;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceAvatarFramePayGuidePopUpOrBuilder
        public boolean hasToUserMask() {
            return this.toUserMask_ != null;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.userId_.isEmpty()) {
                codedOutputStream.D0(1, getUserId());
            }
            if (!this.title_.isEmpty()) {
                codedOutputStream.D0(2, getTitle());
            }
            if (!this.subTitle_.isEmpty()) {
                codedOutputStream.D0(3, getSubTitle());
            }
            if (this.fromUserMask_ != null) {
                codedOutputStream.w0(4, getFromUserMask());
            }
            if (this.toUserMask_ != null) {
                codedOutputStream.w0(5, getToUserMask());
            }
            if (!this.buttonTitle_.isEmpty()) {
                codedOutputStream.D0(6, getButtonTitle());
            }
            if (!this.buttonSubTitle_.isEmpty()) {
                codedOutputStream.D0(7, getButtonSubTitle());
            }
            long j = this.giftId_;
            if (j != 0) {
                codedOutputStream.u0(8, j);
            }
            long j2 = this.giftCount_;
            if (j2 != 0) {
                codedOutputStream.u0(9, j2);
            }
        }

        public static VoiceAvatarFramePayGuidePopUp parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (VoiceAvatarFramePayGuidePopUp) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static VoiceAvatarFramePayGuidePopUp parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (VoiceAvatarFramePayGuidePopUp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFromUserMask(userMaskConfig.UserMask userMask) {
            userMask.getClass();
            this.fromUserMask_ = userMask;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setToUserMask(userMaskConfig.UserMask userMask) {
            userMask.getClass();
            this.toUserMask_ = userMask;
        }

        public static final class Builder extends GeneratedMessageLite.b<VoiceAvatarFramePayGuidePopUp, Builder> implements VoiceAvatarFramePayGuidePopUpOrBuilder {
            private Builder() {
                super(VoiceAvatarFramePayGuidePopUp.DEFAULT_INSTANCE);
            }

            public Builder clearButtonSubTitle() {
                copyOnWrite();
                ((VoiceAvatarFramePayGuidePopUp) ((GeneratedMessageLite.b) this).instance).clearButtonSubTitle();
                return this;
            }

            public Builder clearButtonTitle() {
                copyOnWrite();
                ((VoiceAvatarFramePayGuidePopUp) ((GeneratedMessageLite.b) this).instance).clearButtonTitle();
                return this;
            }

            public Builder clearFromUserMask() {
                copyOnWrite();
                ((VoiceAvatarFramePayGuidePopUp) ((GeneratedMessageLite.b) this).instance).clearFromUserMask();
                return this;
            }

            public Builder clearGiftCount() {
                copyOnWrite();
                ((VoiceAvatarFramePayGuidePopUp) ((GeneratedMessageLite.b) this).instance).clearGiftCount();
                return this;
            }

            public Builder clearGiftId() {
                copyOnWrite();
                ((VoiceAvatarFramePayGuidePopUp) ((GeneratedMessageLite.b) this).instance).clearGiftId();
                return this;
            }

            public Builder clearSubTitle() {
                copyOnWrite();
                ((VoiceAvatarFramePayGuidePopUp) ((GeneratedMessageLite.b) this).instance).clearSubTitle();
                return this;
            }

            public Builder clearTitle() {
                copyOnWrite();
                ((VoiceAvatarFramePayGuidePopUp) ((GeneratedMessageLite.b) this).instance).clearTitle();
                return this;
            }

            public Builder clearToUserMask() {
                copyOnWrite();
                ((VoiceAvatarFramePayGuidePopUp) ((GeneratedMessageLite.b) this).instance).clearToUserMask();
                return this;
            }

            public Builder clearUserId() {
                copyOnWrite();
                ((VoiceAvatarFramePayGuidePopUp) ((GeneratedMessageLite.b) this).instance).clearUserId();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceAvatarFramePayGuidePopUpOrBuilder
            public String getButtonSubTitle() {
                return ((VoiceAvatarFramePayGuidePopUp) ((GeneratedMessageLite.b) this).instance).getButtonSubTitle();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceAvatarFramePayGuidePopUpOrBuilder
            public ByteString getButtonSubTitleBytes() {
                return ((VoiceAvatarFramePayGuidePopUp) ((GeneratedMessageLite.b) this).instance).getButtonSubTitleBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceAvatarFramePayGuidePopUpOrBuilder
            public String getButtonTitle() {
                return ((VoiceAvatarFramePayGuidePopUp) ((GeneratedMessageLite.b) this).instance).getButtonTitle();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceAvatarFramePayGuidePopUpOrBuilder
            public ByteString getButtonTitleBytes() {
                return ((VoiceAvatarFramePayGuidePopUp) ((GeneratedMessageLite.b) this).instance).getButtonTitleBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceAvatarFramePayGuidePopUpOrBuilder
            public userMaskConfig.UserMask getFromUserMask() {
                return ((VoiceAvatarFramePayGuidePopUp) ((GeneratedMessageLite.b) this).instance).getFromUserMask();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceAvatarFramePayGuidePopUpOrBuilder
            public long getGiftCount() {
                return ((VoiceAvatarFramePayGuidePopUp) ((GeneratedMessageLite.b) this).instance).getGiftCount();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceAvatarFramePayGuidePopUpOrBuilder
            public long getGiftId() {
                return ((VoiceAvatarFramePayGuidePopUp) ((GeneratedMessageLite.b) this).instance).getGiftId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceAvatarFramePayGuidePopUpOrBuilder
            public String getSubTitle() {
                return ((VoiceAvatarFramePayGuidePopUp) ((GeneratedMessageLite.b) this).instance).getSubTitle();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceAvatarFramePayGuidePopUpOrBuilder
            public ByteString getSubTitleBytes() {
                return ((VoiceAvatarFramePayGuidePopUp) ((GeneratedMessageLite.b) this).instance).getSubTitleBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceAvatarFramePayGuidePopUpOrBuilder
            public String getTitle() {
                return ((VoiceAvatarFramePayGuidePopUp) ((GeneratedMessageLite.b) this).instance).getTitle();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceAvatarFramePayGuidePopUpOrBuilder
            public ByteString getTitleBytes() {
                return ((VoiceAvatarFramePayGuidePopUp) ((GeneratedMessageLite.b) this).instance).getTitleBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceAvatarFramePayGuidePopUpOrBuilder
            public userMaskConfig.UserMask getToUserMask() {
                return ((VoiceAvatarFramePayGuidePopUp) ((GeneratedMessageLite.b) this).instance).getToUserMask();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceAvatarFramePayGuidePopUpOrBuilder
            public String getUserId() {
                return ((VoiceAvatarFramePayGuidePopUp) ((GeneratedMessageLite.b) this).instance).getUserId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceAvatarFramePayGuidePopUpOrBuilder
            public ByteString getUserIdBytes() {
                return ((VoiceAvatarFramePayGuidePopUp) ((GeneratedMessageLite.b) this).instance).getUserIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceAvatarFramePayGuidePopUpOrBuilder
            public boolean hasFromUserMask() {
                return ((VoiceAvatarFramePayGuidePopUp) ((GeneratedMessageLite.b) this).instance).hasFromUserMask();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceAvatarFramePayGuidePopUpOrBuilder
            public boolean hasToUserMask() {
                return ((VoiceAvatarFramePayGuidePopUp) ((GeneratedMessageLite.b) this).instance).hasToUserMask();
            }

            public Builder mergeFromUserMask(userMaskConfig.UserMask userMask) {
                copyOnWrite();
                ((VoiceAvatarFramePayGuidePopUp) ((GeneratedMessageLite.b) this).instance).mergeFromUserMask(userMask);
                return this;
            }

            public Builder mergeToUserMask(userMaskConfig.UserMask userMask) {
                copyOnWrite();
                ((VoiceAvatarFramePayGuidePopUp) ((GeneratedMessageLite.b) this).instance).mergeToUserMask(userMask);
                return this;
            }

            public Builder setButtonSubTitle(String str) {
                copyOnWrite();
                ((VoiceAvatarFramePayGuidePopUp) ((GeneratedMessageLite.b) this).instance).setButtonSubTitle(str);
                return this;
            }

            public Builder setButtonSubTitleBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceAvatarFramePayGuidePopUp) ((GeneratedMessageLite.b) this).instance).setButtonSubTitleBytes(byteString);
                return this;
            }

            public Builder setButtonTitle(String str) {
                copyOnWrite();
                ((VoiceAvatarFramePayGuidePopUp) ((GeneratedMessageLite.b) this).instance).setButtonTitle(str);
                return this;
            }

            public Builder setButtonTitleBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceAvatarFramePayGuidePopUp) ((GeneratedMessageLite.b) this).instance).setButtonTitleBytes(byteString);
                return this;
            }

            public Builder setFromUserMask(userMaskConfig.UserMask userMask) {
                copyOnWrite();
                ((VoiceAvatarFramePayGuidePopUp) ((GeneratedMessageLite.b) this).instance).setFromUserMask(userMask);
                return this;
            }

            public Builder setGiftCount(long j) {
                copyOnWrite();
                ((VoiceAvatarFramePayGuidePopUp) ((GeneratedMessageLite.b) this).instance).setGiftCount(j);
                return this;
            }

            public Builder setGiftId(long j) {
                copyOnWrite();
                ((VoiceAvatarFramePayGuidePopUp) ((GeneratedMessageLite.b) this).instance).setGiftId(j);
                return this;
            }

            public Builder setSubTitle(String str) {
                copyOnWrite();
                ((VoiceAvatarFramePayGuidePopUp) ((GeneratedMessageLite.b) this).instance).setSubTitle(str);
                return this;
            }

            public Builder setSubTitleBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceAvatarFramePayGuidePopUp) ((GeneratedMessageLite.b) this).instance).setSubTitleBytes(byteString);
                return this;
            }

            public Builder setTitle(String str) {
                copyOnWrite();
                ((VoiceAvatarFramePayGuidePopUp) ((GeneratedMessageLite.b) this).instance).setTitle(str);
                return this;
            }

            public Builder setTitleBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceAvatarFramePayGuidePopUp) ((GeneratedMessageLite.b) this).instance).setTitleBytes(byteString);
                return this;
            }

            public Builder setToUserMask(userMaskConfig.UserMask userMask) {
                copyOnWrite();
                ((VoiceAvatarFramePayGuidePopUp) ((GeneratedMessageLite.b) this).instance).setToUserMask(userMask);
                return this;
            }

            public Builder setUserId(String str) {
                copyOnWrite();
                ((VoiceAvatarFramePayGuidePopUp) ((GeneratedMessageLite.b) this).instance).setUserId(str);
                return this;
            }

            public Builder setUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceAvatarFramePayGuidePopUp) ((GeneratedMessageLite.b) this).instance).setUserIdBytes(byteString);
                return this;
            }

            public Builder setFromUserMask(userMaskConfig.UserMask.Builder builder) {
                copyOnWrite();
                ((VoiceAvatarFramePayGuidePopUp) ((GeneratedMessageLite.b) this).instance).setFromUserMask(builder);
                return this;
            }

            public Builder setToUserMask(userMaskConfig.UserMask.Builder builder) {
                copyOnWrite();
                ((VoiceAvatarFramePayGuidePopUp) ((GeneratedMessageLite.b) this).instance).setToUserMask(builder);
                return this;
            }
        }

        public static VoiceAvatarFramePayGuidePopUp parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoiceAvatarFramePayGuidePopUp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoiceAvatarFramePayGuidePopUp parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (VoiceAvatarFramePayGuidePopUp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static VoiceAvatarFramePayGuidePopUp parseFrom(InputStream inputStream) throws IOException {
            return (VoiceAvatarFramePayGuidePopUp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceAvatarFramePayGuidePopUp parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (VoiceAvatarFramePayGuidePopUp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static VoiceAvatarFramePayGuidePopUp parseFrom(e eVar) throws IOException {
            return (VoiceAvatarFramePayGuidePopUp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static VoiceAvatarFramePayGuidePopUp parseFrom(e eVar, h hVar) throws IOException {
            return (VoiceAvatarFramePayGuidePopUp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public static final class VoiceChatTopicMessage extends GeneratedMessageLite<VoiceChatTopicMessage, Builder> implements VoiceChatTopicMessageOrBuilder {
        private static final VoiceChatTopicMessage DEFAULT_INSTANCE;
        private static volatile i860<VoiceChatTopicMessage> PARSER = null;
        public static final int TAG_FIELD_NUMBER = 2;
        public static final int TOPIC_FIELD_NUMBER = 1;
        private String topic_ = "";
        private String tag_ = "";

        public static final class Builder extends GeneratedMessageLite.b<VoiceChatTopicMessage, Builder> implements VoiceChatTopicMessageOrBuilder {
            private Builder() {
                super(VoiceChatTopicMessage.DEFAULT_INSTANCE);
            }

            public Builder clearTag() {
                copyOnWrite();
                ((VoiceChatTopicMessage) ((GeneratedMessageLite.b) this).instance).clearTag();
                return this;
            }

            public Builder clearTopic() {
                copyOnWrite();
                ((VoiceChatTopicMessage) ((GeneratedMessageLite.b) this).instance).clearTopic();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceChatTopicMessageOrBuilder
            public String getTag() {
                return ((VoiceChatTopicMessage) ((GeneratedMessageLite.b) this).instance).getTag();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceChatTopicMessageOrBuilder
            public ByteString getTagBytes() {
                return ((VoiceChatTopicMessage) ((GeneratedMessageLite.b) this).instance).getTagBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceChatTopicMessageOrBuilder
            public String getTopic() {
                return ((VoiceChatTopicMessage) ((GeneratedMessageLite.b) this).instance).getTopic();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceChatTopicMessageOrBuilder
            public ByteString getTopicBytes() {
                return ((VoiceChatTopicMessage) ((GeneratedMessageLite.b) this).instance).getTopicBytes();
            }

            public Builder setTag(String str) {
                copyOnWrite();
                ((VoiceChatTopicMessage) ((GeneratedMessageLite.b) this).instance).setTag(str);
                return this;
            }

            public Builder setTagBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceChatTopicMessage) ((GeneratedMessageLite.b) this).instance).setTagBytes(byteString);
                return this;
            }

            public Builder setTopic(String str) {
                copyOnWrite();
                ((VoiceChatTopicMessage) ((GeneratedMessageLite.b) this).instance).setTopic(str);
                return this;
            }

            public Builder setTopicBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceChatTopicMessage) ((GeneratedMessageLite.b) this).instance).setTopicBytes(byteString);
                return this;
            }
        }

        static {
            VoiceChatTopicMessage voiceChatTopicMessage = new VoiceChatTopicMessage();
            DEFAULT_INSTANCE = voiceChatTopicMessage;
            voiceChatTopicMessage.makeImmutable();
        }

        private VoiceChatTopicMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTag() {
            this.tag_ = getDefaultInstance().getTag();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTopic() {
            this.topic_ = getDefaultInstance().getTopic();
        }

        public static VoiceChatTopicMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(VoiceChatTopicMessage voiceChatTopicMessage) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(voiceChatTopicMessage);
        }

        public static VoiceChatTopicMessage parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VoiceChatTopicMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceChatTopicMessage parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VoiceChatTopicMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<VoiceChatTopicMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTag(String str) {
            str.getClass();
            this.tag_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTagBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.tag_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTopic(String str) {
            str.getClass();
            this.topic_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTopicBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.topic_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C04221.f1679xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoiceChatTopicMessage();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    VoiceChatTopicMessage voiceChatTopicMessage = (VoiceChatTopicMessage) obj2;
                    this.topic_ = hVar.f(!this.topic_.isEmpty(), this.topic_, !voiceChatTopicMessage.topic_.isEmpty(), voiceChatTopicMessage.topic_);
                    this.tag_ = hVar.f(!this.tag_.isEmpty(), this.tag_, true ^ voiceChatTopicMessage.tag_.isEmpty(), voiceChatTopicMessage.tag_);
                    GeneratedMessageLite.g gVar = GeneratedMessageLite.g.INSTANCE;
                    return this;
                case 6:
                    e eVar = (e) obj;
                    boolean z = false;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            if (iM != 0) {
                                if (iM == 10) {
                                    this.topic_ = eVar.L();
                                } else if (iM == 18) {
                                    this.tag_ = eVar.L();
                                } else if (!eVar.R(iM)) {
                                }
                            }
                            z = true;
                        } catch (IOException e) {
                            aag0.a(new InvalidProtocolBufferException(e.getMessage()).setUnfinishedMessage(this));
                            return null;
                        } catch (InvalidProtocolBufferException e2) {
                            aag0.a(e2.setUnfinishedMessage(this));
                            return null;
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (PARSER == null) {
                        synchronized (VoiceChatTopicMessage.class) {
                            try {
                                if (PARSER == null) {
                                    PARSER = new GeneratedMessageLite.c(DEFAULT_INSTANCE);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return PARSER;
                default:
                    bz00.a();
                    return null;
            }
            return DEFAULT_INSTANCE;
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iK = !this.topic_.isEmpty() ? CodedOutputStream.K(1, getTopic()) : 0;
            if (!this.tag_.isEmpty()) {
                iK += CodedOutputStream.K(2, getTag());
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iK;
            return iK;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceChatTopicMessageOrBuilder
        public String getTag() {
            return this.tag_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceChatTopicMessageOrBuilder
        public ByteString getTagBytes() {
            return ByteString.copyFromUtf8(this.tag_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceChatTopicMessageOrBuilder
        public String getTopic() {
            return this.topic_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceChatTopicMessageOrBuilder
        public ByteString getTopicBytes() {
            return ByteString.copyFromUtf8(this.topic_);
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.topic_.isEmpty()) {
                codedOutputStream.D0(1, getTopic());
            }
            if (this.tag_.isEmpty()) {
                return;
            }
            codedOutputStream.D0(2, getTag());
        }

        public static VoiceChatTopicMessage parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (VoiceChatTopicMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static VoiceChatTopicMessage parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (VoiceChatTopicMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static VoiceChatTopicMessage parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoiceChatTopicMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoiceChatTopicMessage parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (VoiceChatTopicMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static VoiceChatTopicMessage parseFrom(InputStream inputStream) throws IOException {
            return (VoiceChatTopicMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceChatTopicMessage parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (VoiceChatTopicMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static VoiceChatTopicMessage parseFrom(e eVar) throws IOException {
            return (VoiceChatTopicMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static VoiceChatTopicMessage parseFrom(e eVar, h hVar) throws IOException {
            return (VoiceChatTopicMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public static final class VoiceFunFairEntrance extends GeneratedMessageLite<VoiceFunFairEntrance, Builder> implements VoiceFunFairEntranceOrBuilder {
        public static final int BUFFICON_FIELD_NUMBER = 6;
        public static final int BUFFTEXT_FIELD_NUMBER = 7;
        public static final int BUFF_FIELD_NUMBER = 4;
        public static final int CURRENTTIME_FIELD_NUMBER = 1;
        public static final int DEFAULTICON_FIELD_NUMBER = 2;
        private static final VoiceFunFairEntrance DEFAULT_INSTANCE;
        public static final int ENDTIME_FIELD_NUMBER = 8;
        private static volatile i860<VoiceFunFairEntrance> PARSER = null;
        public static final int POOLTYPE_FIELD_NUMBER = 5;
        public static final int TIP_FIELD_NUMBER = 3;
        private boolean buff_;
        private long currentTime_;
        private long endTime_;
        private String defaultIcon_ = "";
        private String tip_ = "";
        private String poolType_ = "";
        private String buffIcon_ = "";
        private String buffText_ = "";

        public static final class Builder extends GeneratedMessageLite.b<VoiceFunFairEntrance, Builder> implements VoiceFunFairEntranceOrBuilder {
            private Builder() {
                super(VoiceFunFairEntrance.DEFAULT_INSTANCE);
            }

            public Builder clearBuff() {
                copyOnWrite();
                ((VoiceFunFairEntrance) ((GeneratedMessageLite.b) this).instance).clearBuff();
                return this;
            }

            public Builder clearBuffIcon() {
                copyOnWrite();
                ((VoiceFunFairEntrance) ((GeneratedMessageLite.b) this).instance).clearBuffIcon();
                return this;
            }

            public Builder clearBuffText() {
                copyOnWrite();
                ((VoiceFunFairEntrance) ((GeneratedMessageLite.b) this).instance).clearBuffText();
                return this;
            }

            public Builder clearCurrentTime() {
                copyOnWrite();
                ((VoiceFunFairEntrance) ((GeneratedMessageLite.b) this).instance).clearCurrentTime();
                return this;
            }

            public Builder clearDefaultIcon() {
                copyOnWrite();
                ((VoiceFunFairEntrance) ((GeneratedMessageLite.b) this).instance).clearDefaultIcon();
                return this;
            }

            public Builder clearEndTime() {
                copyOnWrite();
                ((VoiceFunFairEntrance) ((GeneratedMessageLite.b) this).instance).clearEndTime();
                return this;
            }

            public Builder clearPoolType() {
                copyOnWrite();
                ((VoiceFunFairEntrance) ((GeneratedMessageLite.b) this).instance).clearPoolType();
                return this;
            }

            public Builder clearTip() {
                copyOnWrite();
                ((VoiceFunFairEntrance) ((GeneratedMessageLite.b) this).instance).clearTip();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceFunFairEntranceOrBuilder
            public boolean getBuff() {
                return ((VoiceFunFairEntrance) ((GeneratedMessageLite.b) this).instance).getBuff();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceFunFairEntranceOrBuilder
            public String getBuffIcon() {
                return ((VoiceFunFairEntrance) ((GeneratedMessageLite.b) this).instance).getBuffIcon();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceFunFairEntranceOrBuilder
            public ByteString getBuffIconBytes() {
                return ((VoiceFunFairEntrance) ((GeneratedMessageLite.b) this).instance).getBuffIconBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceFunFairEntranceOrBuilder
            public String getBuffText() {
                return ((VoiceFunFairEntrance) ((GeneratedMessageLite.b) this).instance).getBuffText();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceFunFairEntranceOrBuilder
            public ByteString getBuffTextBytes() {
                return ((VoiceFunFairEntrance) ((GeneratedMessageLite.b) this).instance).getBuffTextBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceFunFairEntranceOrBuilder
            public long getCurrentTime() {
                return ((VoiceFunFairEntrance) ((GeneratedMessageLite.b) this).instance).getCurrentTime();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceFunFairEntranceOrBuilder
            public String getDefaultIcon() {
                return ((VoiceFunFairEntrance) ((GeneratedMessageLite.b) this).instance).getDefaultIcon();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceFunFairEntranceOrBuilder
            public ByteString getDefaultIconBytes() {
                return ((VoiceFunFairEntrance) ((GeneratedMessageLite.b) this).instance).getDefaultIconBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceFunFairEntranceOrBuilder
            public long getEndTime() {
                return ((VoiceFunFairEntrance) ((GeneratedMessageLite.b) this).instance).getEndTime();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceFunFairEntranceOrBuilder
            public String getPoolType() {
                return ((VoiceFunFairEntrance) ((GeneratedMessageLite.b) this).instance).getPoolType();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceFunFairEntranceOrBuilder
            public ByteString getPoolTypeBytes() {
                return ((VoiceFunFairEntrance) ((GeneratedMessageLite.b) this).instance).getPoolTypeBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceFunFairEntranceOrBuilder
            public String getTip() {
                return ((VoiceFunFairEntrance) ((GeneratedMessageLite.b) this).instance).getTip();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceFunFairEntranceOrBuilder
            public ByteString getTipBytes() {
                return ((VoiceFunFairEntrance) ((GeneratedMessageLite.b) this).instance).getTipBytes();
            }

            public Builder setBuff(boolean z) {
                copyOnWrite();
                ((VoiceFunFairEntrance) ((GeneratedMessageLite.b) this).instance).setBuff(z);
                return this;
            }

            public Builder setBuffIcon(String str) {
                copyOnWrite();
                ((VoiceFunFairEntrance) ((GeneratedMessageLite.b) this).instance).setBuffIcon(str);
                return this;
            }

            public Builder setBuffIconBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceFunFairEntrance) ((GeneratedMessageLite.b) this).instance).setBuffIconBytes(byteString);
                return this;
            }

            public Builder setBuffText(String str) {
                copyOnWrite();
                ((VoiceFunFairEntrance) ((GeneratedMessageLite.b) this).instance).setBuffText(str);
                return this;
            }

            public Builder setBuffTextBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceFunFairEntrance) ((GeneratedMessageLite.b) this).instance).setBuffTextBytes(byteString);
                return this;
            }

            public Builder setCurrentTime(long j) {
                copyOnWrite();
                ((VoiceFunFairEntrance) ((GeneratedMessageLite.b) this).instance).setCurrentTime(j);
                return this;
            }

            public Builder setDefaultIcon(String str) {
                copyOnWrite();
                ((VoiceFunFairEntrance) ((GeneratedMessageLite.b) this).instance).setDefaultIcon(str);
                return this;
            }

            public Builder setDefaultIconBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceFunFairEntrance) ((GeneratedMessageLite.b) this).instance).setDefaultIconBytes(byteString);
                return this;
            }

            public Builder setEndTime(long j) {
                copyOnWrite();
                ((VoiceFunFairEntrance) ((GeneratedMessageLite.b) this).instance).setEndTime(j);
                return this;
            }

            public Builder setPoolType(String str) {
                copyOnWrite();
                ((VoiceFunFairEntrance) ((GeneratedMessageLite.b) this).instance).setPoolType(str);
                return this;
            }

            public Builder setPoolTypeBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceFunFairEntrance) ((GeneratedMessageLite.b) this).instance).setPoolTypeBytes(byteString);
                return this;
            }

            public Builder setTip(String str) {
                copyOnWrite();
                ((VoiceFunFairEntrance) ((GeneratedMessageLite.b) this).instance).setTip(str);
                return this;
            }

            public Builder setTipBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceFunFairEntrance) ((GeneratedMessageLite.b) this).instance).setTipBytes(byteString);
                return this;
            }
        }

        static {
            VoiceFunFairEntrance voiceFunFairEntrance = new VoiceFunFairEntrance();
            DEFAULT_INSTANCE = voiceFunFairEntrance;
            voiceFunFairEntrance.makeImmutable();
        }

        private VoiceFunFairEntrance() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBuff() {
            this.buff_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBuffIcon() {
            this.buffIcon_ = getDefaultInstance().getBuffIcon();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBuffText() {
            this.buffText_ = getDefaultInstance().getBuffText();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCurrentTime() {
            this.currentTime_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDefaultIcon() {
            this.defaultIcon_ = getDefaultInstance().getDefaultIcon();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEndTime() {
            this.endTime_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPoolType() {
            this.poolType_ = getDefaultInstance().getPoolType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTip() {
            this.tip_ = getDefaultInstance().getTip();
        }

        public static VoiceFunFairEntrance getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(VoiceFunFairEntrance voiceFunFairEntrance) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(voiceFunFairEntrance);
        }

        public static VoiceFunFairEntrance parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VoiceFunFairEntrance) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceFunFairEntrance parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VoiceFunFairEntrance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<VoiceFunFairEntrance> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBuff(boolean z) {
            this.buff_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBuffIcon(String str) {
            str.getClass();
            this.buffIcon_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBuffIconBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.buffIcon_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBuffText(String str) {
            str.getClass();
            this.buffText_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBuffTextBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.buffText_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCurrentTime(long j) {
            this.currentTime_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDefaultIcon(String str) {
            str.getClass();
            this.defaultIcon_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDefaultIconBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.defaultIcon_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEndTime(long j) {
            this.endTime_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPoolType(String str) {
            str.getClass();
            this.poolType_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPoolTypeBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.poolType_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTip(String str) {
            str.getClass();
            this.tip_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTipBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.tip_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C04221.f1679xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoiceFunFairEntrance();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    VoiceFunFairEntrance voiceFunFairEntrance = (VoiceFunFairEntrance) obj2;
                    long j = this.currentTime_;
                    boolean z2 = j != 0;
                    long j2 = voiceFunFairEntrance.currentTime_;
                    this.currentTime_ = hVar.i(z2, j, j2 != 0, j2);
                    this.defaultIcon_ = hVar.f(!this.defaultIcon_.isEmpty(), this.defaultIcon_, !voiceFunFairEntrance.defaultIcon_.isEmpty(), voiceFunFairEntrance.defaultIcon_);
                    this.tip_ = hVar.f(!this.tip_.isEmpty(), this.tip_, !voiceFunFairEntrance.tip_.isEmpty(), voiceFunFairEntrance.tip_);
                    boolean z3 = this.buff_;
                    boolean z4 = voiceFunFairEntrance.buff_;
                    this.buff_ = hVar.d(z3, z3, z4, z4);
                    this.poolType_ = hVar.f(!this.poolType_.isEmpty(), this.poolType_, !voiceFunFairEntrance.poolType_.isEmpty(), voiceFunFairEntrance.poolType_);
                    this.buffIcon_ = hVar.f(!this.buffIcon_.isEmpty(), this.buffIcon_, !voiceFunFairEntrance.buffIcon_.isEmpty(), voiceFunFairEntrance.buffIcon_);
                    this.buffText_ = hVar.f(!this.buffText_.isEmpty(), this.buffText_, !voiceFunFairEntrance.buffText_.isEmpty(), voiceFunFairEntrance.buffText_);
                    boolean z5 = false;
                    long j3 = this.endTime_;
                    if (j3 != 0) {
                        z5 = true;
                    }
                    long j4 = voiceFunFairEntrance.endTime_;
                    this.endTime_ = hVar.i(z5, j3, j4 != 0, j4);
                    GeneratedMessageLite.g gVar = GeneratedMessageLite.g.INSTANCE;
                    return this;
                case 6:
                    e eVar = (e) obj;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            if (iM != 0) {
                                if (iM == 8) {
                                    this.currentTime_ = eVar.v();
                                } else if (iM == 18) {
                                    this.defaultIcon_ = eVar.L();
                                } else if (iM == 26) {
                                    this.tip_ = eVar.L();
                                } else if (iM == 32) {
                                    this.buff_ = eVar.m();
                                } else if (iM == 42) {
                                    this.poolType_ = eVar.L();
                                } else if (iM == 50) {
                                    this.buffIcon_ = eVar.L();
                                } else if (iM == 58) {
                                    this.buffText_ = eVar.L();
                                } else if (iM == 64) {
                                    this.endTime_ = eVar.v();
                                } else if (!eVar.R(iM)) {
                                }
                            }
                            z = true;
                        } catch (IOException e) {
                            aag0.a(new InvalidProtocolBufferException(e.getMessage()).setUnfinishedMessage(this));
                            return null;
                        } catch (InvalidProtocolBufferException e2) {
                            aag0.a(e2.setUnfinishedMessage(this));
                            return null;
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (PARSER == null) {
                        synchronized (VoiceFunFairEntrance.class) {
                            try {
                                if (PARSER == null) {
                                    PARSER = new GeneratedMessageLite.c(DEFAULT_INSTANCE);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return PARSER;
                default:
                    bz00.a();
                    return null;
            }
            return DEFAULT_INSTANCE;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceFunFairEntranceOrBuilder
        public boolean getBuff() {
            return this.buff_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceFunFairEntranceOrBuilder
        public String getBuffIcon() {
            return this.buffIcon_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceFunFairEntranceOrBuilder
        public ByteString getBuffIconBytes() {
            return ByteString.copyFromUtf8(this.buffIcon_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceFunFairEntranceOrBuilder
        public String getBuffText() {
            return this.buffText_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceFunFairEntranceOrBuilder
        public ByteString getBuffTextBytes() {
            return ByteString.copyFromUtf8(this.buffText_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceFunFairEntranceOrBuilder
        public long getCurrentTime() {
            return this.currentTime_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceFunFairEntranceOrBuilder
        public String getDefaultIcon() {
            return this.defaultIcon_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceFunFairEntranceOrBuilder
        public ByteString getDefaultIconBytes() {
            return ByteString.copyFromUtf8(this.defaultIcon_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceFunFairEntranceOrBuilder
        public long getEndTime() {
            return this.endTime_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceFunFairEntranceOrBuilder
        public String getPoolType() {
            return this.poolType_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceFunFairEntranceOrBuilder
        public ByteString getPoolTypeBytes() {
            return ByteString.copyFromUtf8(this.poolType_);
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            long j = this.currentTime_;
            int iV = j != 0 ? CodedOutputStream.v(1, j) : 0;
            if (!this.defaultIcon_.isEmpty()) {
                iV += CodedOutputStream.K(2, getDefaultIcon());
            }
            if (!this.tip_.isEmpty()) {
                iV += CodedOutputStream.K(3, getTip());
            }
            boolean z = this.buff_;
            if (z) {
                iV += CodedOutputStream.f(4, z);
            }
            if (!this.poolType_.isEmpty()) {
                iV += CodedOutputStream.K(5, getPoolType());
            }
            if (!this.buffIcon_.isEmpty()) {
                iV += CodedOutputStream.K(6, getBuffIcon());
            }
            if (!this.buffText_.isEmpty()) {
                iV += CodedOutputStream.K(7, getBuffText());
            }
            long j2 = this.endTime_;
            if (j2 != 0) {
                iV += CodedOutputStream.v(8, j2);
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iV;
            return iV;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceFunFairEntranceOrBuilder
        public String getTip() {
            return this.tip_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceFunFairEntranceOrBuilder
        public ByteString getTipBytes() {
            return ByteString.copyFromUtf8(this.tip_);
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            long j = this.currentTime_;
            if (j != 0) {
                codedOutputStream.u0(1, j);
            }
            if (!this.defaultIcon_.isEmpty()) {
                codedOutputStream.D0(2, getDefaultIcon());
            }
            if (!this.tip_.isEmpty()) {
                codedOutputStream.D0(3, getTip());
            }
            boolean z = this.buff_;
            if (z) {
                codedOutputStream.a0(4, z);
            }
            if (!this.poolType_.isEmpty()) {
                codedOutputStream.D0(5, getPoolType());
            }
            if (!this.buffIcon_.isEmpty()) {
                codedOutputStream.D0(6, getBuffIcon());
            }
            if (!this.buffText_.isEmpty()) {
                codedOutputStream.D0(7, getBuffText());
            }
            long j2 = this.endTime_;
            if (j2 != 0) {
                codedOutputStream.u0(8, j2);
            }
        }

        public static VoiceFunFairEntrance parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (VoiceFunFairEntrance) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static VoiceFunFairEntrance parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (VoiceFunFairEntrance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static VoiceFunFairEntrance parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoiceFunFairEntrance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoiceFunFairEntrance parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (VoiceFunFairEntrance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static VoiceFunFairEntrance parseFrom(InputStream inputStream) throws IOException {
            return (VoiceFunFairEntrance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceFunFairEntrance parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (VoiceFunFairEntrance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static VoiceFunFairEntrance parseFrom(e eVar) throws IOException {
            return (VoiceFunFairEntrance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static VoiceFunFairEntrance parseFrom(e eVar, h hVar) throws IOException {
            return (VoiceFunFairEntrance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public static final class VoiceLiveGameTypeMessage extends GeneratedMessageLite<VoiceLiveGameTypeMessage, Builder> implements VoiceLiveGameTypeMessageOrBuilder {
        private static final VoiceLiveGameTypeMessage DEFAULT_INSTANCE;
        public static final int GAMETYPE_FIELD_NUMBER = 2;
        public static final int LIVEID_FIELD_NUMBER = 1;
        private static volatile i860<VoiceLiveGameTypeMessage> PARSER;
        private String liveId_ = "";
        private String gameType_ = "";

        public static final class Builder extends GeneratedMessageLite.b<VoiceLiveGameTypeMessage, Builder> implements VoiceLiveGameTypeMessageOrBuilder {
            private Builder() {
                super(VoiceLiveGameTypeMessage.DEFAULT_INSTANCE);
            }

            public Builder clearGameType() {
                copyOnWrite();
                ((VoiceLiveGameTypeMessage) ((GeneratedMessageLite.b) this).instance).clearGameType();
                return this;
            }

            public Builder clearLiveId() {
                copyOnWrite();
                ((VoiceLiveGameTypeMessage) ((GeneratedMessageLite.b) this).instance).clearLiveId();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLiveGameTypeMessageOrBuilder
            public String getGameType() {
                return ((VoiceLiveGameTypeMessage) ((GeneratedMessageLite.b) this).instance).getGameType();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLiveGameTypeMessageOrBuilder
            public ByteString getGameTypeBytes() {
                return ((VoiceLiveGameTypeMessage) ((GeneratedMessageLite.b) this).instance).getGameTypeBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLiveGameTypeMessageOrBuilder
            public String getLiveId() {
                return ((VoiceLiveGameTypeMessage) ((GeneratedMessageLite.b) this).instance).getLiveId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLiveGameTypeMessageOrBuilder
            public ByteString getLiveIdBytes() {
                return ((VoiceLiveGameTypeMessage) ((GeneratedMessageLite.b) this).instance).getLiveIdBytes();
            }

            public Builder setGameType(String str) {
                copyOnWrite();
                ((VoiceLiveGameTypeMessage) ((GeneratedMessageLite.b) this).instance).setGameType(str);
                return this;
            }

            public Builder setGameTypeBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceLiveGameTypeMessage) ((GeneratedMessageLite.b) this).instance).setGameTypeBytes(byteString);
                return this;
            }

            public Builder setLiveId(String str) {
                copyOnWrite();
                ((VoiceLiveGameTypeMessage) ((GeneratedMessageLite.b) this).instance).setLiveId(str);
                return this;
            }

            public Builder setLiveIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceLiveGameTypeMessage) ((GeneratedMessageLite.b) this).instance).setLiveIdBytes(byteString);
                return this;
            }
        }

        static {
            VoiceLiveGameTypeMessage voiceLiveGameTypeMessage = new VoiceLiveGameTypeMessage();
            DEFAULT_INSTANCE = voiceLiveGameTypeMessage;
            voiceLiveGameTypeMessage.makeImmutable();
        }

        private VoiceLiveGameTypeMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGameType() {
            this.gameType_ = getDefaultInstance().getGameType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLiveId() {
            this.liveId_ = getDefaultInstance().getLiveId();
        }

        public static VoiceLiveGameTypeMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(VoiceLiveGameTypeMessage voiceLiveGameTypeMessage) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(voiceLiveGameTypeMessage);
        }

        public static VoiceLiveGameTypeMessage parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VoiceLiveGameTypeMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceLiveGameTypeMessage parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VoiceLiveGameTypeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<VoiceLiveGameTypeMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGameType(String str) {
            str.getClass();
            this.gameType_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGameTypeBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.gameType_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLiveId(String str) {
            str.getClass();
            this.liveId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLiveIdBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.liveId_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C04221.f1679xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoiceLiveGameTypeMessage();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    VoiceLiveGameTypeMessage voiceLiveGameTypeMessage = (VoiceLiveGameTypeMessage) obj2;
                    this.liveId_ = hVar.f(!this.liveId_.isEmpty(), this.liveId_, !voiceLiveGameTypeMessage.liveId_.isEmpty(), voiceLiveGameTypeMessage.liveId_);
                    this.gameType_ = hVar.f(!this.gameType_.isEmpty(), this.gameType_, true ^ voiceLiveGameTypeMessage.gameType_.isEmpty(), voiceLiveGameTypeMessage.gameType_);
                    GeneratedMessageLite.g gVar = GeneratedMessageLite.g.INSTANCE;
                    return this;
                case 6:
                    e eVar = (e) obj;
                    boolean z = false;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            if (iM != 0) {
                                if (iM == 10) {
                                    this.liveId_ = eVar.L();
                                } else if (iM == 18) {
                                    this.gameType_ = eVar.L();
                                } else if (!eVar.R(iM)) {
                                }
                            }
                            z = true;
                        } catch (IOException e) {
                            aag0.a(new InvalidProtocolBufferException(e.getMessage()).setUnfinishedMessage(this));
                            return null;
                        } catch (InvalidProtocolBufferException e2) {
                            aag0.a(e2.setUnfinishedMessage(this));
                            return null;
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (PARSER == null) {
                        synchronized (VoiceLiveGameTypeMessage.class) {
                            try {
                                if (PARSER == null) {
                                    PARSER = new GeneratedMessageLite.c(DEFAULT_INSTANCE);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return PARSER;
                default:
                    bz00.a();
                    return null;
            }
            return DEFAULT_INSTANCE;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLiveGameTypeMessageOrBuilder
        public String getGameType() {
            return this.gameType_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLiveGameTypeMessageOrBuilder
        public ByteString getGameTypeBytes() {
            return ByteString.copyFromUtf8(this.gameType_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLiveGameTypeMessageOrBuilder
        public String getLiveId() {
            return this.liveId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLiveGameTypeMessageOrBuilder
        public ByteString getLiveIdBytes() {
            return ByteString.copyFromUtf8(this.liveId_);
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iK = !this.liveId_.isEmpty() ? CodedOutputStream.K(1, getLiveId()) : 0;
            if (!this.gameType_.isEmpty()) {
                iK += CodedOutputStream.K(2, getGameType());
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iK;
            return iK;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.liveId_.isEmpty()) {
                codedOutputStream.D0(1, getLiveId());
            }
            if (this.gameType_.isEmpty()) {
                return;
            }
            codedOutputStream.D0(2, getGameType());
        }

        public static VoiceLiveGameTypeMessage parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (VoiceLiveGameTypeMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static VoiceLiveGameTypeMessage parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (VoiceLiveGameTypeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static VoiceLiveGameTypeMessage parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoiceLiveGameTypeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoiceLiveGameTypeMessage parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (VoiceLiveGameTypeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static VoiceLiveGameTypeMessage parseFrom(InputStream inputStream) throws IOException {
            return (VoiceLiveGameTypeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceLiveGameTypeMessage parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (VoiceLiveGameTypeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static VoiceLiveGameTypeMessage parseFrom(e eVar) throws IOException {
            return (VoiceLiveGameTypeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static VoiceLiveGameTypeMessage parseFrom(e eVar, h hVar) throws IOException {
            return (VoiceLiveGameTypeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public static final class VoiceLiveSGVAAnimationExtra extends GeneratedMessageLite<VoiceLiveSGVAAnimationExtra, Builder> implements VoiceLiveSGVAAnimationExtraOrBuilder {
        private static final VoiceLiveSGVAAnimationExtra DEFAULT_INSTANCE;
        public static final int KEY_FIELD_NUMBER = 1;
        private static volatile i860<VoiceLiveSGVAAnimationExtra> PARSER = null;
        public static final int TEXTCOLOR_FIELD_NUMBER = 4;
        public static final int TEXTFONT_FIELD_NUMBER = 6;
        public static final int TEXTSIZE_FIELD_NUMBER = 5;
        public static final int TYPE_FIELD_NUMBER = 2;
        public static final int VALUE_FIELD_NUMBER = 3;
        private long textFont_;
        private long textSize_;
        private long type_;
        private String key_ = "";
        private String value_ = "";
        private String textColor_ = "";

        public static final class Builder extends GeneratedMessageLite.b<VoiceLiveSGVAAnimationExtra, Builder> implements VoiceLiveSGVAAnimationExtraOrBuilder {
            private Builder() {
                super(VoiceLiveSGVAAnimationExtra.DEFAULT_INSTANCE);
            }

            public Builder clearKey() {
                copyOnWrite();
                ((VoiceLiveSGVAAnimationExtra) ((GeneratedMessageLite.b) this).instance).clearKey();
                return this;
            }

            public Builder clearTextColor() {
                copyOnWrite();
                ((VoiceLiveSGVAAnimationExtra) ((GeneratedMessageLite.b) this).instance).clearTextColor();
                return this;
            }

            public Builder clearTextFont() {
                copyOnWrite();
                ((VoiceLiveSGVAAnimationExtra) ((GeneratedMessageLite.b) this).instance).clearTextFont();
                return this;
            }

            public Builder clearTextSize() {
                copyOnWrite();
                ((VoiceLiveSGVAAnimationExtra) ((GeneratedMessageLite.b) this).instance).clearTextSize();
                return this;
            }

            public Builder clearType() {
                copyOnWrite();
                ((VoiceLiveSGVAAnimationExtra) ((GeneratedMessageLite.b) this).instance).clearType();
                return this;
            }

            public Builder clearValue() {
                copyOnWrite();
                ((VoiceLiveSGVAAnimationExtra) ((GeneratedMessageLite.b) this).instance).clearValue();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLiveSGVAAnimationExtraOrBuilder
            public String getKey() {
                return ((VoiceLiveSGVAAnimationExtra) ((GeneratedMessageLite.b) this).instance).getKey();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLiveSGVAAnimationExtraOrBuilder
            public ByteString getKeyBytes() {
                return ((VoiceLiveSGVAAnimationExtra) ((GeneratedMessageLite.b) this).instance).getKeyBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLiveSGVAAnimationExtraOrBuilder
            public String getTextColor() {
                return ((VoiceLiveSGVAAnimationExtra) ((GeneratedMessageLite.b) this).instance).getTextColor();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLiveSGVAAnimationExtraOrBuilder
            public ByteString getTextColorBytes() {
                return ((VoiceLiveSGVAAnimationExtra) ((GeneratedMessageLite.b) this).instance).getTextColorBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLiveSGVAAnimationExtraOrBuilder
            public long getTextFont() {
                return ((VoiceLiveSGVAAnimationExtra) ((GeneratedMessageLite.b) this).instance).getTextFont();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLiveSGVAAnimationExtraOrBuilder
            public long getTextSize() {
                return ((VoiceLiveSGVAAnimationExtra) ((GeneratedMessageLite.b) this).instance).getTextSize();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLiveSGVAAnimationExtraOrBuilder
            public long getType() {
                return ((VoiceLiveSGVAAnimationExtra) ((GeneratedMessageLite.b) this).instance).getType();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLiveSGVAAnimationExtraOrBuilder
            public String getValue() {
                return ((VoiceLiveSGVAAnimationExtra) ((GeneratedMessageLite.b) this).instance).getValue();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLiveSGVAAnimationExtraOrBuilder
            public ByteString getValueBytes() {
                return ((VoiceLiveSGVAAnimationExtra) ((GeneratedMessageLite.b) this).instance).getValueBytes();
            }

            public Builder setKey(String str) {
                copyOnWrite();
                ((VoiceLiveSGVAAnimationExtra) ((GeneratedMessageLite.b) this).instance).setKey(str);
                return this;
            }

            public Builder setKeyBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceLiveSGVAAnimationExtra) ((GeneratedMessageLite.b) this).instance).setKeyBytes(byteString);
                return this;
            }

            public Builder setTextColor(String str) {
                copyOnWrite();
                ((VoiceLiveSGVAAnimationExtra) ((GeneratedMessageLite.b) this).instance).setTextColor(str);
                return this;
            }

            public Builder setTextColorBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceLiveSGVAAnimationExtra) ((GeneratedMessageLite.b) this).instance).setTextColorBytes(byteString);
                return this;
            }

            public Builder setTextFont(long j) {
                copyOnWrite();
                ((VoiceLiveSGVAAnimationExtra) ((GeneratedMessageLite.b) this).instance).setTextFont(j);
                return this;
            }

            public Builder setTextSize(long j) {
                copyOnWrite();
                ((VoiceLiveSGVAAnimationExtra) ((GeneratedMessageLite.b) this).instance).setTextSize(j);
                return this;
            }

            public Builder setType(long j) {
                copyOnWrite();
                ((VoiceLiveSGVAAnimationExtra) ((GeneratedMessageLite.b) this).instance).setType(j);
                return this;
            }

            public Builder setValue(String str) {
                copyOnWrite();
                ((VoiceLiveSGVAAnimationExtra) ((GeneratedMessageLite.b) this).instance).setValue(str);
                return this;
            }

            public Builder setValueBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceLiveSGVAAnimationExtra) ((GeneratedMessageLite.b) this).instance).setValueBytes(byteString);
                return this;
            }
        }

        static {
            VoiceLiveSGVAAnimationExtra voiceLiveSGVAAnimationExtra = new VoiceLiveSGVAAnimationExtra();
            DEFAULT_INSTANCE = voiceLiveSGVAAnimationExtra;
            voiceLiveSGVAAnimationExtra.makeImmutable();
        }

        private VoiceLiveSGVAAnimationExtra() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearKey() {
            this.key_ = getDefaultInstance().getKey();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTextColor() {
            this.textColor_ = getDefaultInstance().getTextColor();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTextFont() {
            this.textFont_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTextSize() {
            this.textSize_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearType() {
            this.type_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearValue() {
            this.value_ = getDefaultInstance().getValue();
        }

        public static VoiceLiveSGVAAnimationExtra getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(VoiceLiveSGVAAnimationExtra voiceLiveSGVAAnimationExtra) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(voiceLiveSGVAAnimationExtra);
        }

        public static VoiceLiveSGVAAnimationExtra parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VoiceLiveSGVAAnimationExtra) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceLiveSGVAAnimationExtra parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VoiceLiveSGVAAnimationExtra) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<VoiceLiveSGVAAnimationExtra> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setKey(String str) {
            str.getClass();
            this.key_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setKeyBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.key_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTextColor(String str) {
            str.getClass();
            this.textColor_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTextColorBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.textColor_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTextFont(long j) {
            this.textFont_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTextSize(long j) {
            this.textSize_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setType(long j) {
            this.type_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setValue(String str) {
            str.getClass();
            this.value_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setValueBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.value_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C04221.f1679xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoiceLiveSGVAAnimationExtra();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    VoiceLiveSGVAAnimationExtra voiceLiveSGVAAnimationExtra = (VoiceLiveSGVAAnimationExtra) obj2;
                    this.key_ = hVar.f(!this.key_.isEmpty(), this.key_, !voiceLiveSGVAAnimationExtra.key_.isEmpty(), voiceLiveSGVAAnimationExtra.key_);
                    long j = this.type_;
                    boolean z2 = j != 0;
                    long j2 = voiceLiveSGVAAnimationExtra.type_;
                    this.type_ = hVar.i(z2, j, j2 != 0, j2);
                    this.value_ = hVar.f(!this.value_.isEmpty(), this.value_, !voiceLiveSGVAAnimationExtra.value_.isEmpty(), voiceLiveSGVAAnimationExtra.value_);
                    this.textColor_ = hVar.f(!this.textColor_.isEmpty(), this.textColor_, !voiceLiveSGVAAnimationExtra.textColor_.isEmpty(), voiceLiveSGVAAnimationExtra.textColor_);
                    long j3 = this.textSize_;
                    boolean z3 = j3 != 0;
                    long j4 = voiceLiveSGVAAnimationExtra.textSize_;
                    this.textSize_ = hVar.i(z3, j3, j4 != 0, j4);
                    boolean z4 = false;
                    long j5 = this.textFont_;
                    if (j5 != 0) {
                        z4 = true;
                    }
                    long j6 = voiceLiveSGVAAnimationExtra.textFont_;
                    this.textFont_ = hVar.i(z4, j5, j6 != 0, j6);
                    GeneratedMessageLite.g gVar = GeneratedMessageLite.g.INSTANCE;
                    return this;
                case 6:
                    e eVar = (e) obj;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            if (iM != 0) {
                                if (iM == 10) {
                                    this.key_ = eVar.L();
                                } else if (iM == 16) {
                                    this.type_ = eVar.v();
                                } else if (iM == 26) {
                                    this.value_ = eVar.L();
                                } else if (iM == 34) {
                                    this.textColor_ = eVar.L();
                                } else if (iM == 40) {
                                    this.textSize_ = eVar.v();
                                } else if (iM == 48) {
                                    this.textFont_ = eVar.v();
                                } else if (!eVar.R(iM)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            aag0.a(e.setUnfinishedMessage(this));
                            return null;
                        } catch (IOException e2) {
                            aag0.a(new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this));
                            return null;
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (PARSER == null) {
                        synchronized (VoiceLiveSGVAAnimationExtra.class) {
                            try {
                                if (PARSER == null) {
                                    PARSER = new GeneratedMessageLite.c(DEFAULT_INSTANCE);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return PARSER;
                default:
                    bz00.a();
                    return null;
            }
            return DEFAULT_INSTANCE;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLiveSGVAAnimationExtraOrBuilder
        public String getKey() {
            return this.key_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLiveSGVAAnimationExtraOrBuilder
        public ByteString getKeyBytes() {
            return ByteString.copyFromUtf8(this.key_);
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iK = !this.key_.isEmpty() ? CodedOutputStream.K(1, getKey()) : 0;
            long j = this.type_;
            if (j != 0) {
                iK += CodedOutputStream.v(2, j);
            }
            if (!this.value_.isEmpty()) {
                iK += CodedOutputStream.K(3, getValue());
            }
            if (!this.textColor_.isEmpty()) {
                iK += CodedOutputStream.K(4, getTextColor());
            }
            long j2 = this.textSize_;
            if (j2 != 0) {
                iK += CodedOutputStream.v(5, j2);
            }
            long j3 = this.textFont_;
            if (j3 != 0) {
                iK += CodedOutputStream.v(6, j3);
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iK;
            return iK;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLiveSGVAAnimationExtraOrBuilder
        public String getTextColor() {
            return this.textColor_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLiveSGVAAnimationExtraOrBuilder
        public ByteString getTextColorBytes() {
            return ByteString.copyFromUtf8(this.textColor_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLiveSGVAAnimationExtraOrBuilder
        public long getTextFont() {
            return this.textFont_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLiveSGVAAnimationExtraOrBuilder
        public long getTextSize() {
            return this.textSize_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLiveSGVAAnimationExtraOrBuilder
        public long getType() {
            return this.type_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLiveSGVAAnimationExtraOrBuilder
        public String getValue() {
            return this.value_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLiveSGVAAnimationExtraOrBuilder
        public ByteString getValueBytes() {
            return ByteString.copyFromUtf8(this.value_);
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.key_.isEmpty()) {
                codedOutputStream.D0(1, getKey());
            }
            long j = this.type_;
            if (j != 0) {
                codedOutputStream.u0(2, j);
            }
            if (!this.value_.isEmpty()) {
                codedOutputStream.D0(3, getValue());
            }
            if (!this.textColor_.isEmpty()) {
                codedOutputStream.D0(4, getTextColor());
            }
            long j2 = this.textSize_;
            if (j2 != 0) {
                codedOutputStream.u0(5, j2);
            }
            long j3 = this.textFont_;
            if (j3 != 0) {
                codedOutputStream.u0(6, j3);
            }
        }

        public static VoiceLiveSGVAAnimationExtra parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (VoiceLiveSGVAAnimationExtra) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static VoiceLiveSGVAAnimationExtra parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (VoiceLiveSGVAAnimationExtra) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static VoiceLiveSGVAAnimationExtra parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoiceLiveSGVAAnimationExtra) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoiceLiveSGVAAnimationExtra parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (VoiceLiveSGVAAnimationExtra) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static VoiceLiveSGVAAnimationExtra parseFrom(InputStream inputStream) throws IOException {
            return (VoiceLiveSGVAAnimationExtra) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceLiveSGVAAnimationExtra parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (VoiceLiveSGVAAnimationExtra) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static VoiceLiveSGVAAnimationExtra parseFrom(e eVar) throws IOException {
            return (VoiceLiveSGVAAnimationExtra) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static VoiceLiveSGVAAnimationExtra parseFrom(e eVar, h hVar) throws IOException {
            return (VoiceLiveSGVAAnimationExtra) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public static final class VoiceLiveSVGAAnimation extends GeneratedMessageLite<VoiceLiveSVGAAnimation, Builder> implements VoiceLiveSVGAAnimationOrBuilder {
        public static final int ANIMATIONEXTRAS_FIELD_NUMBER = 3;
        private static final VoiceLiveSVGAAnimation DEFAULT_INSTANCE;
        private static volatile i860<VoiceLiveSVGAAnimation> PARSER = null;
        public static final int ROOMID_FIELD_NUMBER = 1;
        public static final int SVGAURL_FIELD_NUMBER = 2;
        private int bitField0_;
        private String roomId_ = "";
        private String svgaUrl_ = "";
        private l.h<VoiceLiveSGVAAnimationExtra> animationExtras_ = GeneratedMessageLite.emptyProtobufList();

        static {
            VoiceLiveSVGAAnimation voiceLiveSVGAAnimation = new VoiceLiveSVGAAnimation();
            DEFAULT_INSTANCE = voiceLiveSVGAAnimation;
            voiceLiveSVGAAnimation.makeImmutable();
        }

        private VoiceLiveSVGAAnimation() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllAnimationExtras(Iterable<? extends VoiceLiveSGVAAnimationExtra> iterable) {
            ensureAnimationExtrasIsMutable();
            a.addAll(iterable, this.animationExtras_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAnimationExtras(VoiceLiveSGVAAnimationExtra.Builder builder) {
            ensureAnimationExtrasIsMutable();
            this.animationExtras_.add((VoiceLiveSGVAAnimationExtra) builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAnimationExtras() {
            this.animationExtras_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRoomId() {
            this.roomId_ = getDefaultInstance().getRoomId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSvgaUrl() {
            this.svgaUrl_ = getDefaultInstance().getSvgaUrl();
        }

        private void ensureAnimationExtrasIsMutable() {
            if (this.animationExtras_.q()) {
                return;
            }
            this.animationExtras_ = GeneratedMessageLite.mutableCopy(this.animationExtras_);
        }

        public static VoiceLiveSVGAAnimation getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(VoiceLiveSVGAAnimation voiceLiveSVGAAnimation) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(voiceLiveSVGAAnimation);
        }

        public static VoiceLiveSVGAAnimation parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VoiceLiveSVGAAnimation) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceLiveSVGAAnimation parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VoiceLiveSVGAAnimation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<VoiceLiveSVGAAnimation> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeAnimationExtras(int i) {
            ensureAnimationExtrasIsMutable();
            this.animationExtras_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAnimationExtras(int i, VoiceLiveSGVAAnimationExtra.Builder builder) {
            ensureAnimationExtrasIsMutable();
            this.animationExtras_.set(i, (VoiceLiveSGVAAnimationExtra) builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRoomId(String str) {
            str.getClass();
            this.roomId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRoomIdBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.roomId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSvgaUrl(String str) {
            str.getClass();
            this.svgaUrl_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSvgaUrlBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.svgaUrl_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C04221.f1679xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoiceLiveSVGAAnimation();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.animationExtras_.n();
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.g gVar = (GeneratedMessageLite.h) obj;
                    VoiceLiveSVGAAnimation voiceLiveSVGAAnimation = (VoiceLiveSVGAAnimation) obj2;
                    this.roomId_ = gVar.f(!this.roomId_.isEmpty(), this.roomId_, !voiceLiveSVGAAnimation.roomId_.isEmpty(), voiceLiveSVGAAnimation.roomId_);
                    this.svgaUrl_ = gVar.f(!this.svgaUrl_.isEmpty(), this.svgaUrl_, true ^ voiceLiveSVGAAnimation.svgaUrl_.isEmpty(), voiceLiveSVGAAnimation.svgaUrl_);
                    this.animationExtras_ = gVar.g(this.animationExtras_, voiceLiveSVGAAnimation.animationExtras_);
                    if (gVar == GeneratedMessageLite.g.INSTANCE) {
                        this.bitField0_ |= voiceLiveSVGAAnimation.bitField0_;
                    }
                    return this;
                case 6:
                    e eVar = (e) obj;
                    h hVar = (h) obj2;
                    boolean z = false;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            if (iM != 0) {
                                if (iM == 10) {
                                    this.roomId_ = eVar.L();
                                } else if (iM == 18) {
                                    this.svgaUrl_ = eVar.L();
                                } else if (iM == 26) {
                                    if (!this.animationExtras_.q()) {
                                        this.animationExtras_ = GeneratedMessageLite.mutableCopy(this.animationExtras_);
                                    }
                                    this.animationExtras_.add(eVar.w(VoiceLiveSGVAAnimationExtra.parser(), hVar));
                                } else if (!eVar.R(iM)) {
                                }
                            }
                            z = true;
                        } catch (IOException e) {
                            aag0.a(new InvalidProtocolBufferException(e.getMessage()).setUnfinishedMessage(this));
                            return null;
                        } catch (InvalidProtocolBufferException e2) {
                            aag0.a(e2.setUnfinishedMessage(this));
                            return null;
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (PARSER == null) {
                        synchronized (VoiceLiveSVGAAnimation.class) {
                            try {
                                if (PARSER == null) {
                                    PARSER = new GeneratedMessageLite.c(DEFAULT_INSTANCE);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return PARSER;
                default:
                    bz00.a();
                    return null;
            }
            return DEFAULT_INSTANCE;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLiveSVGAAnimationOrBuilder
        public VoiceLiveSGVAAnimationExtra getAnimationExtras(int i) {
            return (VoiceLiveSGVAAnimationExtra) this.animationExtras_.get(i);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLiveSVGAAnimationOrBuilder
        public int getAnimationExtrasCount() {
            return this.animationExtras_.size();
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLiveSVGAAnimationOrBuilder
        public List<VoiceLiveSGVAAnimationExtra> getAnimationExtrasList() {
            return this.animationExtras_;
        }

        public VoiceLiveSGVAAnimationExtraOrBuilder getAnimationExtrasOrBuilder(int i) {
            return (VoiceLiveSGVAAnimationExtraOrBuilder) this.animationExtras_.get(i);
        }

        public List<? extends VoiceLiveSGVAAnimationExtraOrBuilder> getAnimationExtrasOrBuilderList() {
            return this.animationExtras_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLiveSVGAAnimationOrBuilder
        public String getRoomId() {
            return this.roomId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLiveSVGAAnimationOrBuilder
        public ByteString getRoomIdBytes() {
            return ByteString.copyFromUtf8(this.roomId_);
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iK = !this.roomId_.isEmpty() ? CodedOutputStream.K(1, getRoomId()) : 0;
            if (!this.svgaUrl_.isEmpty()) {
                iK += CodedOutputStream.K(2, getSvgaUrl());
            }
            for (int i2 = 0; i2 < this.animationExtras_.size(); i2++) {
                iK += CodedOutputStream.C(3, (q) this.animationExtras_.get(i2));
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iK;
            return iK;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLiveSVGAAnimationOrBuilder
        public String getSvgaUrl() {
            return this.svgaUrl_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLiveSVGAAnimationOrBuilder
        public ByteString getSvgaUrlBytes() {
            return ByteString.copyFromUtf8(this.svgaUrl_);
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.roomId_.isEmpty()) {
                codedOutputStream.D0(1, getRoomId());
            }
            if (!this.svgaUrl_.isEmpty()) {
                codedOutputStream.D0(2, getSvgaUrl());
            }
            for (int i = 0; i < this.animationExtras_.size(); i++) {
                codedOutputStream.w0(3, (q) this.animationExtras_.get(i));
            }
        }

        public static VoiceLiveSVGAAnimation parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (VoiceLiveSVGAAnimation) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static VoiceLiveSVGAAnimation parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (VoiceLiveSVGAAnimation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static final class Builder extends GeneratedMessageLite.b<VoiceLiveSVGAAnimation, Builder> implements VoiceLiveSVGAAnimationOrBuilder {
            private Builder() {
                super(VoiceLiveSVGAAnimation.DEFAULT_INSTANCE);
            }

            public Builder addAllAnimationExtras(Iterable<? extends VoiceLiveSGVAAnimationExtra> iterable) {
                copyOnWrite();
                ((VoiceLiveSVGAAnimation) ((GeneratedMessageLite.b) this).instance).addAllAnimationExtras(iterable);
                return this;
            }

            public Builder addAnimationExtras(VoiceLiveSGVAAnimationExtra voiceLiveSGVAAnimationExtra) {
                copyOnWrite();
                ((VoiceLiveSVGAAnimation) ((GeneratedMessageLite.b) this).instance).addAnimationExtras(voiceLiveSGVAAnimationExtra);
                return this;
            }

            public Builder clearAnimationExtras() {
                copyOnWrite();
                ((VoiceLiveSVGAAnimation) ((GeneratedMessageLite.b) this).instance).clearAnimationExtras();
                return this;
            }

            public Builder clearRoomId() {
                copyOnWrite();
                ((VoiceLiveSVGAAnimation) ((GeneratedMessageLite.b) this).instance).clearRoomId();
                return this;
            }

            public Builder clearSvgaUrl() {
                copyOnWrite();
                ((VoiceLiveSVGAAnimation) ((GeneratedMessageLite.b) this).instance).clearSvgaUrl();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLiveSVGAAnimationOrBuilder
            public VoiceLiveSGVAAnimationExtra getAnimationExtras(int i) {
                return ((VoiceLiveSVGAAnimation) ((GeneratedMessageLite.b) this).instance).getAnimationExtras(i);
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLiveSVGAAnimationOrBuilder
            public int getAnimationExtrasCount() {
                return ((VoiceLiveSVGAAnimation) ((GeneratedMessageLite.b) this).instance).getAnimationExtrasCount();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLiveSVGAAnimationOrBuilder
            public List<VoiceLiveSGVAAnimationExtra> getAnimationExtrasList() {
                return Collections.unmodifiableList(((VoiceLiveSVGAAnimation) ((GeneratedMessageLite.b) this).instance).getAnimationExtrasList());
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLiveSVGAAnimationOrBuilder
            public String getRoomId() {
                return ((VoiceLiveSVGAAnimation) ((GeneratedMessageLite.b) this).instance).getRoomId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLiveSVGAAnimationOrBuilder
            public ByteString getRoomIdBytes() {
                return ((VoiceLiveSVGAAnimation) ((GeneratedMessageLite.b) this).instance).getRoomIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLiveSVGAAnimationOrBuilder
            public String getSvgaUrl() {
                return ((VoiceLiveSVGAAnimation) ((GeneratedMessageLite.b) this).instance).getSvgaUrl();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLiveSVGAAnimationOrBuilder
            public ByteString getSvgaUrlBytes() {
                return ((VoiceLiveSVGAAnimation) ((GeneratedMessageLite.b) this).instance).getSvgaUrlBytes();
            }

            public Builder removeAnimationExtras(int i) {
                copyOnWrite();
                ((VoiceLiveSVGAAnimation) ((GeneratedMessageLite.b) this).instance).removeAnimationExtras(i);
                return this;
            }

            public Builder setAnimationExtras(int i, VoiceLiveSGVAAnimationExtra voiceLiveSGVAAnimationExtra) {
                copyOnWrite();
                ((VoiceLiveSVGAAnimation) ((GeneratedMessageLite.b) this).instance).setAnimationExtras(i, voiceLiveSGVAAnimationExtra);
                return this;
            }

            public Builder setRoomId(String str) {
                copyOnWrite();
                ((VoiceLiveSVGAAnimation) ((GeneratedMessageLite.b) this).instance).setRoomId(str);
                return this;
            }

            public Builder setRoomIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceLiveSVGAAnimation) ((GeneratedMessageLite.b) this).instance).setRoomIdBytes(byteString);
                return this;
            }

            public Builder setSvgaUrl(String str) {
                copyOnWrite();
                ((VoiceLiveSVGAAnimation) ((GeneratedMessageLite.b) this).instance).setSvgaUrl(str);
                return this;
            }

            public Builder setSvgaUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceLiveSVGAAnimation) ((GeneratedMessageLite.b) this).instance).setSvgaUrlBytes(byteString);
                return this;
            }

            public Builder addAnimationExtras(int i, VoiceLiveSGVAAnimationExtra voiceLiveSGVAAnimationExtra) {
                copyOnWrite();
                ((VoiceLiveSVGAAnimation) ((GeneratedMessageLite.b) this).instance).addAnimationExtras(i, voiceLiveSGVAAnimationExtra);
                return this;
            }

            public Builder setAnimationExtras(int i, VoiceLiveSGVAAnimationExtra.Builder builder) {
                copyOnWrite();
                ((VoiceLiveSVGAAnimation) ((GeneratedMessageLite.b) this).instance).setAnimationExtras(i, builder);
                return this;
            }

            public Builder addAnimationExtras(VoiceLiveSGVAAnimationExtra.Builder builder) {
                copyOnWrite();
                ((VoiceLiveSVGAAnimation) ((GeneratedMessageLite.b) this).instance).addAnimationExtras(builder);
                return this;
            }

            public Builder addAnimationExtras(int i, VoiceLiveSGVAAnimationExtra.Builder builder) {
                copyOnWrite();
                ((VoiceLiveSVGAAnimation) ((GeneratedMessageLite.b) this).instance).addAnimationExtras(i, builder);
                return this;
            }
        }

        public static VoiceLiveSVGAAnimation parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoiceLiveSVGAAnimation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoiceLiveSVGAAnimation parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (VoiceLiveSVGAAnimation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static VoiceLiveSVGAAnimation parseFrom(InputStream inputStream) throws IOException {
            return (VoiceLiveSVGAAnimation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceLiveSVGAAnimation parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (VoiceLiveSVGAAnimation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static VoiceLiveSVGAAnimation parseFrom(e eVar) throws IOException {
            return (VoiceLiveSVGAAnimation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAnimationExtras(int i, VoiceLiveSGVAAnimationExtra voiceLiveSGVAAnimationExtra) {
            voiceLiveSGVAAnimationExtra.getClass();
            ensureAnimationExtrasIsMutable();
            this.animationExtras_.add(i, voiceLiveSGVAAnimationExtra);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static VoiceLiveSVGAAnimation parseFrom(e eVar, h hVar) throws IOException {
            return (VoiceLiveSVGAAnimation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAnimationExtras(int i, VoiceLiveSGVAAnimationExtra voiceLiveSGVAAnimationExtra) {
            voiceLiveSGVAAnimationExtra.getClass();
            ensureAnimationExtrasIsMutable();
            this.animationExtras_.set(i, voiceLiveSGVAAnimationExtra);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAnimationExtras(VoiceLiveSGVAAnimationExtra voiceLiveSGVAAnimationExtra) {
            voiceLiveSGVAAnimationExtra.getClass();
            ensureAnimationExtrasIsMutable();
            this.animationExtras_.add(voiceLiveSGVAAnimationExtra);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAnimationExtras(int i, VoiceLiveSGVAAnimationExtra.Builder builder) {
            ensureAnimationExtrasIsMutable();
            this.animationExtras_.add(i, (VoiceLiveSGVAAnimationExtra) builder.build());
        }
    }

    public static final class VoiceLiveTemplateMessage extends GeneratedMessageLite<VoiceLiveTemplateMessage, Builder> implements VoiceLiveTemplateMessageOrBuilder {
        private static final VoiceLiveTemplateMessage DEFAULT_INSTANCE;
        public static final int LIVEID_FIELD_NUMBER = 3;
        private static volatile i860<VoiceLiveTemplateMessage> PARSER = null;
        public static final int ROOMID_FIELD_NUMBER = 2;
        public static final int TEMPLATE_FIELD_NUMBER = 4;
        public static final int USERID_FIELD_NUMBER = 1;
        private String userId_ = "";
        private String roomId_ = "";
        private String liveId_ = "";
        private String template_ = "";

        public static final class Builder extends GeneratedMessageLite.b<VoiceLiveTemplateMessage, Builder> implements VoiceLiveTemplateMessageOrBuilder {
            private Builder() {
                super(VoiceLiveTemplateMessage.DEFAULT_INSTANCE);
            }

            public Builder clearLiveId() {
                copyOnWrite();
                ((VoiceLiveTemplateMessage) ((GeneratedMessageLite.b) this).instance).clearLiveId();
                return this;
            }

            public Builder clearRoomId() {
                copyOnWrite();
                ((VoiceLiveTemplateMessage) ((GeneratedMessageLite.b) this).instance).clearRoomId();
                return this;
            }

            public Builder clearTemplate() {
                copyOnWrite();
                ((VoiceLiveTemplateMessage) ((GeneratedMessageLite.b) this).instance).clearTemplate();
                return this;
            }

            public Builder clearUserId() {
                copyOnWrite();
                ((VoiceLiveTemplateMessage) ((GeneratedMessageLite.b) this).instance).clearUserId();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLiveTemplateMessageOrBuilder
            public String getLiveId() {
                return ((VoiceLiveTemplateMessage) ((GeneratedMessageLite.b) this).instance).getLiveId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLiveTemplateMessageOrBuilder
            public ByteString getLiveIdBytes() {
                return ((VoiceLiveTemplateMessage) ((GeneratedMessageLite.b) this).instance).getLiveIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLiveTemplateMessageOrBuilder
            public String getRoomId() {
                return ((VoiceLiveTemplateMessage) ((GeneratedMessageLite.b) this).instance).getRoomId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLiveTemplateMessageOrBuilder
            public ByteString getRoomIdBytes() {
                return ((VoiceLiveTemplateMessage) ((GeneratedMessageLite.b) this).instance).getRoomIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLiveTemplateMessageOrBuilder
            public String getTemplate() {
                return ((VoiceLiveTemplateMessage) ((GeneratedMessageLite.b) this).instance).getTemplate();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLiveTemplateMessageOrBuilder
            public ByteString getTemplateBytes() {
                return ((VoiceLiveTemplateMessage) ((GeneratedMessageLite.b) this).instance).getTemplateBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLiveTemplateMessageOrBuilder
            public String getUserId() {
                return ((VoiceLiveTemplateMessage) ((GeneratedMessageLite.b) this).instance).getUserId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLiveTemplateMessageOrBuilder
            public ByteString getUserIdBytes() {
                return ((VoiceLiveTemplateMessage) ((GeneratedMessageLite.b) this).instance).getUserIdBytes();
            }

            public Builder setLiveId(String str) {
                copyOnWrite();
                ((VoiceLiveTemplateMessage) ((GeneratedMessageLite.b) this).instance).setLiveId(str);
                return this;
            }

            public Builder setLiveIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceLiveTemplateMessage) ((GeneratedMessageLite.b) this).instance).setLiveIdBytes(byteString);
                return this;
            }

            public Builder setRoomId(String str) {
                copyOnWrite();
                ((VoiceLiveTemplateMessage) ((GeneratedMessageLite.b) this).instance).setRoomId(str);
                return this;
            }

            public Builder setRoomIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceLiveTemplateMessage) ((GeneratedMessageLite.b) this).instance).setRoomIdBytes(byteString);
                return this;
            }

            public Builder setTemplate(String str) {
                copyOnWrite();
                ((VoiceLiveTemplateMessage) ((GeneratedMessageLite.b) this).instance).setTemplate(str);
                return this;
            }

            public Builder setTemplateBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceLiveTemplateMessage) ((GeneratedMessageLite.b) this).instance).setTemplateBytes(byteString);
                return this;
            }

            public Builder setUserId(String str) {
                copyOnWrite();
                ((VoiceLiveTemplateMessage) ((GeneratedMessageLite.b) this).instance).setUserId(str);
                return this;
            }

            public Builder setUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceLiveTemplateMessage) ((GeneratedMessageLite.b) this).instance).setUserIdBytes(byteString);
                return this;
            }
        }

        static {
            VoiceLiveTemplateMessage voiceLiveTemplateMessage = new VoiceLiveTemplateMessage();
            DEFAULT_INSTANCE = voiceLiveTemplateMessage;
            voiceLiveTemplateMessage.makeImmutable();
        }

        private VoiceLiveTemplateMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLiveId() {
            this.liveId_ = getDefaultInstance().getLiveId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRoomId() {
            this.roomId_ = getDefaultInstance().getRoomId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTemplate() {
            this.template_ = getDefaultInstance().getTemplate();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUserId() {
            this.userId_ = getDefaultInstance().getUserId();
        }

        public static VoiceLiveTemplateMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(VoiceLiveTemplateMessage voiceLiveTemplateMessage) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(voiceLiveTemplateMessage);
        }

        public static VoiceLiveTemplateMessage parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VoiceLiveTemplateMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceLiveTemplateMessage parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VoiceLiveTemplateMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<VoiceLiveTemplateMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLiveId(String str) {
            str.getClass();
            this.liveId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLiveIdBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.liveId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRoomId(String str) {
            str.getClass();
            this.roomId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRoomIdBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.roomId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTemplate(String str) {
            str.getClass();
            this.template_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTemplateBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.template_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserId(String str) {
            str.getClass();
            this.userId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserIdBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.userId_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C04221.f1679xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoiceLiveTemplateMessage();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    VoiceLiveTemplateMessage voiceLiveTemplateMessage = (VoiceLiveTemplateMessage) obj2;
                    this.userId_ = hVar.f(!this.userId_.isEmpty(), this.userId_, !voiceLiveTemplateMessage.userId_.isEmpty(), voiceLiveTemplateMessage.userId_);
                    this.roomId_ = hVar.f(!this.roomId_.isEmpty(), this.roomId_, !voiceLiveTemplateMessage.roomId_.isEmpty(), voiceLiveTemplateMessage.roomId_);
                    this.liveId_ = hVar.f(!this.liveId_.isEmpty(), this.liveId_, !voiceLiveTemplateMessage.liveId_.isEmpty(), voiceLiveTemplateMessage.liveId_);
                    this.template_ = hVar.f(!this.template_.isEmpty(), this.template_, true ^ voiceLiveTemplateMessage.template_.isEmpty(), voiceLiveTemplateMessage.template_);
                    GeneratedMessageLite.g gVar = GeneratedMessageLite.g.INSTANCE;
                    return this;
                case 6:
                    e eVar = (e) obj;
                    boolean z = false;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            if (iM != 0) {
                                if (iM == 10) {
                                    this.userId_ = eVar.L();
                                } else if (iM == 18) {
                                    this.roomId_ = eVar.L();
                                } else if (iM == 26) {
                                    this.liveId_ = eVar.L();
                                } else if (iM == 34) {
                                    this.template_ = eVar.L();
                                } else if (!eVar.R(iM)) {
                                }
                            }
                            z = true;
                        } catch (IOException e) {
                            aag0.a(new InvalidProtocolBufferException(e.getMessage()).setUnfinishedMessage(this));
                            return null;
                        } catch (InvalidProtocolBufferException e2) {
                            aag0.a(e2.setUnfinishedMessage(this));
                            return null;
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (PARSER == null) {
                        synchronized (VoiceLiveTemplateMessage.class) {
                            try {
                                if (PARSER == null) {
                                    PARSER = new GeneratedMessageLite.c(DEFAULT_INSTANCE);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return PARSER;
                default:
                    bz00.a();
                    return null;
            }
            return DEFAULT_INSTANCE;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLiveTemplateMessageOrBuilder
        public String getLiveId() {
            return this.liveId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLiveTemplateMessageOrBuilder
        public ByteString getLiveIdBytes() {
            return ByteString.copyFromUtf8(this.liveId_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLiveTemplateMessageOrBuilder
        public String getRoomId() {
            return this.roomId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLiveTemplateMessageOrBuilder
        public ByteString getRoomIdBytes() {
            return ByteString.copyFromUtf8(this.roomId_);
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iK = !this.userId_.isEmpty() ? CodedOutputStream.K(1, getUserId()) : 0;
            if (!this.roomId_.isEmpty()) {
                iK += CodedOutputStream.K(2, getRoomId());
            }
            if (!this.liveId_.isEmpty()) {
                iK += CodedOutputStream.K(3, getLiveId());
            }
            if (!this.template_.isEmpty()) {
                iK += CodedOutputStream.K(4, getTemplate());
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iK;
            return iK;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLiveTemplateMessageOrBuilder
        public String getTemplate() {
            return this.template_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLiveTemplateMessageOrBuilder
        public ByteString getTemplateBytes() {
            return ByteString.copyFromUtf8(this.template_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLiveTemplateMessageOrBuilder
        public String getUserId() {
            return this.userId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLiveTemplateMessageOrBuilder
        public ByteString getUserIdBytes() {
            return ByteString.copyFromUtf8(this.userId_);
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.userId_.isEmpty()) {
                codedOutputStream.D0(1, getUserId());
            }
            if (!this.roomId_.isEmpty()) {
                codedOutputStream.D0(2, getRoomId());
            }
            if (!this.liveId_.isEmpty()) {
                codedOutputStream.D0(3, getLiveId());
            }
            if (this.template_.isEmpty()) {
                return;
            }
            codedOutputStream.D0(4, getTemplate());
        }

        public static VoiceLiveTemplateMessage parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (VoiceLiveTemplateMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static VoiceLiveTemplateMessage parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (VoiceLiveTemplateMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static VoiceLiveTemplateMessage parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoiceLiveTemplateMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoiceLiveTemplateMessage parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (VoiceLiveTemplateMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static VoiceLiveTemplateMessage parseFrom(InputStream inputStream) throws IOException {
            return (VoiceLiveTemplateMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceLiveTemplateMessage parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (VoiceLiveTemplateMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static VoiceLiveTemplateMessage parseFrom(e eVar) throws IOException {
            return (VoiceLiveTemplateMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static VoiceLiveTemplateMessage parseFrom(e eVar, h hVar) throws IOException {
            return (VoiceLiveTemplateMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public static final class VoiceLovePlanetTeam extends GeneratedMessageLite<VoiceLovePlanetTeam, Builder> implements VoiceLovePlanetTeamOrBuilder {
        private static final VoiceLovePlanetTeam DEFAULT_INSTANCE;
        public static final int OTHERUSERID_FIELD_NUMBER = 2;
        private static volatile i860<VoiceLovePlanetTeam> PARSER = null;
        public static final int TIPS_FIELD_NUMBER = 4;
        public static final int TOTALSCORE_FIELD_NUMBER = 3;
        public static final int USERID_FIELD_NUMBER = 1;
        private long totalScore_;
        private String userId_ = "";
        private String otherUserId_ = "";
        private String tips_ = "";

        public static final class Builder extends GeneratedMessageLite.b<VoiceLovePlanetTeam, Builder> implements VoiceLovePlanetTeamOrBuilder {
            private Builder() {
                super(VoiceLovePlanetTeam.DEFAULT_INSTANCE);
            }

            public Builder clearOtherUserId() {
                copyOnWrite();
                ((VoiceLovePlanetTeam) ((GeneratedMessageLite.b) this).instance).clearOtherUserId();
                return this;
            }

            public Builder clearTips() {
                copyOnWrite();
                ((VoiceLovePlanetTeam) ((GeneratedMessageLite.b) this).instance).clearTips();
                return this;
            }

            public Builder clearTotalScore() {
                copyOnWrite();
                ((VoiceLovePlanetTeam) ((GeneratedMessageLite.b) this).instance).clearTotalScore();
                return this;
            }

            public Builder clearUserId() {
                copyOnWrite();
                ((VoiceLovePlanetTeam) ((GeneratedMessageLite.b) this).instance).clearUserId();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLovePlanetTeamOrBuilder
            public String getOtherUserId() {
                return ((VoiceLovePlanetTeam) ((GeneratedMessageLite.b) this).instance).getOtherUserId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLovePlanetTeamOrBuilder
            public ByteString getOtherUserIdBytes() {
                return ((VoiceLovePlanetTeam) ((GeneratedMessageLite.b) this).instance).getOtherUserIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLovePlanetTeamOrBuilder
            public String getTips() {
                return ((VoiceLovePlanetTeam) ((GeneratedMessageLite.b) this).instance).getTips();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLovePlanetTeamOrBuilder
            public ByteString getTipsBytes() {
                return ((VoiceLovePlanetTeam) ((GeneratedMessageLite.b) this).instance).getTipsBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLovePlanetTeamOrBuilder
            public long getTotalScore() {
                return ((VoiceLovePlanetTeam) ((GeneratedMessageLite.b) this).instance).getTotalScore();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLovePlanetTeamOrBuilder
            public String getUserId() {
                return ((VoiceLovePlanetTeam) ((GeneratedMessageLite.b) this).instance).getUserId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLovePlanetTeamOrBuilder
            public ByteString getUserIdBytes() {
                return ((VoiceLovePlanetTeam) ((GeneratedMessageLite.b) this).instance).getUserIdBytes();
            }

            public Builder setOtherUserId(String str) {
                copyOnWrite();
                ((VoiceLovePlanetTeam) ((GeneratedMessageLite.b) this).instance).setOtherUserId(str);
                return this;
            }

            public Builder setOtherUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceLovePlanetTeam) ((GeneratedMessageLite.b) this).instance).setOtherUserIdBytes(byteString);
                return this;
            }

            public Builder setTips(String str) {
                copyOnWrite();
                ((VoiceLovePlanetTeam) ((GeneratedMessageLite.b) this).instance).setTips(str);
                return this;
            }

            public Builder setTipsBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceLovePlanetTeam) ((GeneratedMessageLite.b) this).instance).setTipsBytes(byteString);
                return this;
            }

            public Builder setTotalScore(long j) {
                copyOnWrite();
                ((VoiceLovePlanetTeam) ((GeneratedMessageLite.b) this).instance).setTotalScore(j);
                return this;
            }

            public Builder setUserId(String str) {
                copyOnWrite();
                ((VoiceLovePlanetTeam) ((GeneratedMessageLite.b) this).instance).setUserId(str);
                return this;
            }

            public Builder setUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceLovePlanetTeam) ((GeneratedMessageLite.b) this).instance).setUserIdBytes(byteString);
                return this;
            }
        }

        static {
            VoiceLovePlanetTeam voiceLovePlanetTeam = new VoiceLovePlanetTeam();
            DEFAULT_INSTANCE = voiceLovePlanetTeam;
            voiceLovePlanetTeam.makeImmutable();
        }

        private VoiceLovePlanetTeam() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOtherUserId() {
            this.otherUserId_ = getDefaultInstance().getOtherUserId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTips() {
            this.tips_ = getDefaultInstance().getTips();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTotalScore() {
            this.totalScore_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUserId() {
            this.userId_ = getDefaultInstance().getUserId();
        }

        public static VoiceLovePlanetTeam getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(VoiceLovePlanetTeam voiceLovePlanetTeam) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(voiceLovePlanetTeam);
        }

        public static VoiceLovePlanetTeam parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VoiceLovePlanetTeam) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceLovePlanetTeam parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VoiceLovePlanetTeam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<VoiceLovePlanetTeam> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOtherUserId(String str) {
            str.getClass();
            this.otherUserId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOtherUserIdBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.otherUserId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTips(String str) {
            str.getClass();
            this.tips_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTipsBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.tips_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTotalScore(long j) {
            this.totalScore_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserId(String str) {
            str.getClass();
            this.userId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserIdBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.userId_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C04221.f1679xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoiceLovePlanetTeam();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    VoiceLovePlanetTeam voiceLovePlanetTeam = (VoiceLovePlanetTeam) obj2;
                    this.userId_ = hVar.f(!this.userId_.isEmpty(), this.userId_, !voiceLovePlanetTeam.userId_.isEmpty(), voiceLovePlanetTeam.userId_);
                    this.otherUserId_ = hVar.f(!this.otherUserId_.isEmpty(), this.otherUserId_, !voiceLovePlanetTeam.otherUserId_.isEmpty(), voiceLovePlanetTeam.otherUserId_);
                    long j = this.totalScore_;
                    boolean z2 = j != 0;
                    long j2 = voiceLovePlanetTeam.totalScore_;
                    this.totalScore_ = hVar.i(z2, j, j2 != 0, j2);
                    this.tips_ = hVar.f(!this.tips_.isEmpty(), this.tips_, !voiceLovePlanetTeam.tips_.isEmpty(), voiceLovePlanetTeam.tips_);
                    GeneratedMessageLite.g gVar = GeneratedMessageLite.g.INSTANCE;
                    return this;
                case 6:
                    e eVar = (e) obj;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            if (iM != 0) {
                                if (iM == 10) {
                                    this.userId_ = eVar.L();
                                } else if (iM == 18) {
                                    this.otherUserId_ = eVar.L();
                                } else if (iM == 24) {
                                    this.totalScore_ = eVar.v();
                                } else if (iM == 34) {
                                    this.tips_ = eVar.L();
                                } else if (!eVar.R(iM)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            aag0.a(e.setUnfinishedMessage(this));
                            return null;
                        } catch (IOException e2) {
                            aag0.a(new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this));
                            return null;
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (PARSER == null) {
                        synchronized (VoiceLovePlanetTeam.class) {
                            try {
                                if (PARSER == null) {
                                    PARSER = new GeneratedMessageLite.c(DEFAULT_INSTANCE);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return PARSER;
                default:
                    bz00.a();
                    return null;
            }
            return DEFAULT_INSTANCE;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLovePlanetTeamOrBuilder
        public String getOtherUserId() {
            return this.otherUserId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLovePlanetTeamOrBuilder
        public ByteString getOtherUserIdBytes() {
            return ByteString.copyFromUtf8(this.otherUserId_);
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iK = !this.userId_.isEmpty() ? CodedOutputStream.K(1, getUserId()) : 0;
            if (!this.otherUserId_.isEmpty()) {
                iK += CodedOutputStream.K(2, getOtherUserId());
            }
            long j = this.totalScore_;
            if (j != 0) {
                iK += CodedOutputStream.v(3, j);
            }
            if (!this.tips_.isEmpty()) {
                iK += CodedOutputStream.K(4, getTips());
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iK;
            return iK;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLovePlanetTeamOrBuilder
        public String getTips() {
            return this.tips_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLovePlanetTeamOrBuilder
        public ByteString getTipsBytes() {
            return ByteString.copyFromUtf8(this.tips_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLovePlanetTeamOrBuilder
        public long getTotalScore() {
            return this.totalScore_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLovePlanetTeamOrBuilder
        public String getUserId() {
            return this.userId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLovePlanetTeamOrBuilder
        public ByteString getUserIdBytes() {
            return ByteString.copyFromUtf8(this.userId_);
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.userId_.isEmpty()) {
                codedOutputStream.D0(1, getUserId());
            }
            if (!this.otherUserId_.isEmpty()) {
                codedOutputStream.D0(2, getOtherUserId());
            }
            long j = this.totalScore_;
            if (j != 0) {
                codedOutputStream.u0(3, j);
            }
            if (this.tips_.isEmpty()) {
                return;
            }
            codedOutputStream.D0(4, getTips());
        }

        public static VoiceLovePlanetTeam parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (VoiceLovePlanetTeam) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static VoiceLovePlanetTeam parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (VoiceLovePlanetTeam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static VoiceLovePlanetTeam parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoiceLovePlanetTeam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoiceLovePlanetTeam parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (VoiceLovePlanetTeam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static VoiceLovePlanetTeam parseFrom(InputStream inputStream) throws IOException {
            return (VoiceLovePlanetTeam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceLovePlanetTeam parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (VoiceLovePlanetTeam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static VoiceLovePlanetTeam parseFrom(e eVar) throws IOException {
            return (VoiceLovePlanetTeam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static VoiceLovePlanetTeam parseFrom(e eVar, h hVar) throws IOException {
            return (VoiceLovePlanetTeam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public static final class VoiceLovePlanetUser extends GeneratedMessageLite<VoiceLovePlanetUser, Builder> implements VoiceLovePlanetUserOrBuilder {
        public static final int AVATARCONFIG_FIELD_NUMBER = 10;
        public static final int AVATAR_FIELD_NUMBER = 3;
        private static final VoiceLovePlanetUser DEFAULT_INSTANCE;
        public static final int GENDER_FIELD_NUMBER = 7;
        public static final int ISLEAVE_FIELD_NUMBER = 8;
        private static volatile i860<VoiceLovePlanetUser> PARSER = null;
        public static final int POSITION_FIELD_NUMBER = 5;
        public static final int RECEIVEDSCORE_FIELD_NUMBER = 4;
        public static final int SELECTPOSITION_FIELD_NUMBER = 6;
        public static final int SENDSCORE_FIELD_NUMBER = 9;
        public static final int USERID_FIELD_NUMBER = 1;
        public static final int USERNAME_FIELD_NUMBER = 2;
        private userMaskConfig.AvatarConfig avatarConfig_;
        private boolean isLeave_;
        private long position_;
        private long receivedScore_;
        private long selectPosition_;
        private long sendScore_;
        private String userId_ = "";
        private String userName_ = "";
        private String avatar_ = "";
        private String gender_ = "";

        static {
            VoiceLovePlanetUser voiceLovePlanetUser = new VoiceLovePlanetUser();
            DEFAULT_INSTANCE = voiceLovePlanetUser;
            voiceLovePlanetUser.makeImmutable();
        }

        private VoiceLovePlanetUser() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAvatar() {
            this.avatar_ = getDefaultInstance().getAvatar();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAvatarConfig() {
            this.avatarConfig_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGender() {
            this.gender_ = getDefaultInstance().getGender();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIsLeave() {
            this.isLeave_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPosition() {
            this.position_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearReceivedScore() {
            this.receivedScore_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSelectPosition() {
            this.selectPosition_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSendScore() {
            this.sendScore_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUserId() {
            this.userId_ = getDefaultInstance().getUserId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUserName() {
            this.userName_ = getDefaultInstance().getUserName();
        }

        public static VoiceLovePlanetUser getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeAvatarConfig(userMaskConfig.AvatarConfig avatarConfig) {
            userMaskConfig.AvatarConfig avatarConfig2 = this.avatarConfig_;
            if (avatarConfig2 == null || avatarConfig2 == userMaskConfig.AvatarConfig.getDefaultInstance()) {
                this.avatarConfig_ = avatarConfig;
            } else {
                this.avatarConfig_ = (userMaskConfig.AvatarConfig) ((userMaskConfig.AvatarConfig.Builder) userMaskConfig.AvatarConfig.newBuilder(this.avatarConfig_).mergeFrom(avatarConfig)).buildPartial();
            }
        }

        public static Builder newBuilder(VoiceLovePlanetUser voiceLovePlanetUser) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(voiceLovePlanetUser);
        }

        public static VoiceLovePlanetUser parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VoiceLovePlanetUser) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceLovePlanetUser parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VoiceLovePlanetUser) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<VoiceLovePlanetUser> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAvatar(String str) {
            str.getClass();
            this.avatar_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAvatarBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.avatar_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAvatarConfig(userMaskConfig.AvatarConfig.Builder builder) {
            this.avatarConfig_ = (userMaskConfig.AvatarConfig) builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGender(String str) {
            str.getClass();
            this.gender_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGenderBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.gender_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIsLeave(boolean z) {
            this.isLeave_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPosition(long j) {
            this.position_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setReceivedScore(long j) {
            this.receivedScore_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSelectPosition(long j) {
            this.selectPosition_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSendScore(long j) {
            this.sendScore_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserId(String str) {
            str.getClass();
            this.userId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserIdBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.userId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserName(String str) {
            str.getClass();
            this.userName_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserNameBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.userName_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C04221.f1679xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoiceLovePlanetUser();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    VoiceLovePlanetUser voiceLovePlanetUser = (VoiceLovePlanetUser) obj2;
                    this.userId_ = hVar.f(!this.userId_.isEmpty(), this.userId_, !voiceLovePlanetUser.userId_.isEmpty(), voiceLovePlanetUser.userId_);
                    this.userName_ = hVar.f(!this.userName_.isEmpty(), this.userName_, !voiceLovePlanetUser.userName_.isEmpty(), voiceLovePlanetUser.userName_);
                    this.avatar_ = hVar.f(!this.avatar_.isEmpty(), this.avatar_, !voiceLovePlanetUser.avatar_.isEmpty(), voiceLovePlanetUser.avatar_);
                    long j = this.receivedScore_;
                    boolean z2 = j != 0;
                    long j2 = voiceLovePlanetUser.receivedScore_;
                    this.receivedScore_ = hVar.i(z2, j, j2 != 0, j2);
                    long j3 = this.position_;
                    boolean z3 = j3 != 0;
                    long j4 = voiceLovePlanetUser.position_;
                    this.position_ = hVar.i(z3, j3, j4 != 0, j4);
                    long j5 = this.selectPosition_;
                    boolean z4 = j5 != 0;
                    long j6 = voiceLovePlanetUser.selectPosition_;
                    this.selectPosition_ = hVar.i(z4, j5, j6 != 0, j6);
                    this.gender_ = hVar.f(!this.gender_.isEmpty(), this.gender_, !voiceLovePlanetUser.gender_.isEmpty(), voiceLovePlanetUser.gender_);
                    boolean z5 = this.isLeave_;
                    boolean z6 = voiceLovePlanetUser.isLeave_;
                    this.isLeave_ = hVar.d(z5, z5, z6, z6);
                    boolean z7 = false;
                    long j7 = this.sendScore_;
                    if (j7 != 0) {
                        z7 = true;
                    }
                    long j8 = voiceLovePlanetUser.sendScore_;
                    this.sendScore_ = hVar.i(z7, j7, j8 != 0, j8);
                    this.avatarConfig_ = hVar.o(this.avatarConfig_, voiceLovePlanetUser.avatarConfig_);
                    GeneratedMessageLite.g gVar = GeneratedMessageLite.g.INSTANCE;
                    return this;
                case 6:
                    e eVar = (e) obj;
                    h hVar2 = (h) obj2;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            switch (iM) {
                                case 0:
                                    break;
                                case 10:
                                    this.userId_ = eVar.L();
                                    continue;
                                case 18:
                                    this.userName_ = eVar.L();
                                    continue;
                                case 26:
                                    this.avatar_ = eVar.L();
                                    continue;
                                case LongLinkChatMessage.LiveChatMessage.SOURCE_FIELD_NUMBER /* 32 */:
                                    this.receivedScore_ = eVar.v();
                                    continue;
                                case 40:
                                    this.position_ = eVar.v();
                                    continue;
                                case 48:
                                    this.selectPosition_ = eVar.v();
                                    continue;
                                case 58:
                                    this.gender_ = eVar.L();
                                    continue;
                                case 64:
                                    this.isLeave_ = eVar.m();
                                    continue;
                                case 72:
                                    this.sendScore_ = eVar.v();
                                    continue;
                                case 82:
                                    userMaskConfig.AvatarConfig avatarConfig = this.avatarConfig_;
                                    userMaskConfig.AvatarConfig.Builder builder = avatarConfig != null ? (userMaskConfig.AvatarConfig.Builder) avatarConfig.toBuilder() : null;
                                    userMaskConfig.AvatarConfig avatarConfigW = eVar.w(userMaskConfig.AvatarConfig.parser(), hVar2);
                                    this.avatarConfig_ = avatarConfigW;
                                    if (builder != null) {
                                        builder.mergeFrom(avatarConfigW);
                                        this.avatarConfig_ = (userMaskConfig.AvatarConfig) builder.buildPartial();
                                    } else {
                                        continue;
                                    }
                                    break;
                                default:
                                    if (!eVar.R(iM)) {
                                        break;
                                    }
                                    break;
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            aag0.a(e.setUnfinishedMessage(this));
                            return null;
                        } catch (IOException e2) {
                            aag0.a(new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this));
                            return null;
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (PARSER == null) {
                        synchronized (VoiceLovePlanetUser.class) {
                            try {
                                if (PARSER == null) {
                                    PARSER = new GeneratedMessageLite.c(DEFAULT_INSTANCE);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return PARSER;
                default:
                    bz00.a();
                    return null;
            }
            return DEFAULT_INSTANCE;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLovePlanetUserOrBuilder
        public String getAvatar() {
            return this.avatar_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLovePlanetUserOrBuilder
        public ByteString getAvatarBytes() {
            return ByteString.copyFromUtf8(this.avatar_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLovePlanetUserOrBuilder
        public userMaskConfig.AvatarConfig getAvatarConfig() {
            userMaskConfig.AvatarConfig avatarConfig = this.avatarConfig_;
            return avatarConfig == null ? userMaskConfig.AvatarConfig.getDefaultInstance() : avatarConfig;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLovePlanetUserOrBuilder
        public String getGender() {
            return this.gender_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLovePlanetUserOrBuilder
        public ByteString getGenderBytes() {
            return ByteString.copyFromUtf8(this.gender_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLovePlanetUserOrBuilder
        public boolean getIsLeave() {
            return this.isLeave_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLovePlanetUserOrBuilder
        public long getPosition() {
            return this.position_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLovePlanetUserOrBuilder
        public long getReceivedScore() {
            return this.receivedScore_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLovePlanetUserOrBuilder
        public long getSelectPosition() {
            return this.selectPosition_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLovePlanetUserOrBuilder
        public long getSendScore() {
            return this.sendScore_;
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iK = !this.userId_.isEmpty() ? CodedOutputStream.K(1, getUserId()) : 0;
            if (!this.userName_.isEmpty()) {
                iK += CodedOutputStream.K(2, getUserName());
            }
            if (!this.avatar_.isEmpty()) {
                iK += CodedOutputStream.K(3, getAvatar());
            }
            long j = this.receivedScore_;
            if (j != 0) {
                iK += CodedOutputStream.v(4, j);
            }
            long j2 = this.position_;
            if (j2 != 0) {
                iK += CodedOutputStream.v(5, j2);
            }
            long j3 = this.selectPosition_;
            if (j3 != 0) {
                iK += CodedOutputStream.v(6, j3);
            }
            if (!this.gender_.isEmpty()) {
                iK += CodedOutputStream.K(7, getGender());
            }
            boolean z = this.isLeave_;
            if (z) {
                iK += CodedOutputStream.f(8, z);
            }
            long j4 = this.sendScore_;
            if (j4 != 0) {
                iK += CodedOutputStream.v(9, j4);
            }
            if (this.avatarConfig_ != null) {
                iK += CodedOutputStream.C(10, getAvatarConfig());
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iK;
            return iK;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLovePlanetUserOrBuilder
        public String getUserId() {
            return this.userId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLovePlanetUserOrBuilder
        public ByteString getUserIdBytes() {
            return ByteString.copyFromUtf8(this.userId_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLovePlanetUserOrBuilder
        public String getUserName() {
            return this.userName_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLovePlanetUserOrBuilder
        public ByteString getUserNameBytes() {
            return ByteString.copyFromUtf8(this.userName_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLovePlanetUserOrBuilder
        public boolean hasAvatarConfig() {
            return this.avatarConfig_ != null;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.userId_.isEmpty()) {
                codedOutputStream.D0(1, getUserId());
            }
            if (!this.userName_.isEmpty()) {
                codedOutputStream.D0(2, getUserName());
            }
            if (!this.avatar_.isEmpty()) {
                codedOutputStream.D0(3, getAvatar());
            }
            long j = this.receivedScore_;
            if (j != 0) {
                codedOutputStream.u0(4, j);
            }
            long j2 = this.position_;
            if (j2 != 0) {
                codedOutputStream.u0(5, j2);
            }
            long j3 = this.selectPosition_;
            if (j3 != 0) {
                codedOutputStream.u0(6, j3);
            }
            if (!this.gender_.isEmpty()) {
                codedOutputStream.D0(7, getGender());
            }
            boolean z = this.isLeave_;
            if (z) {
                codedOutputStream.a0(8, z);
            }
            long j4 = this.sendScore_;
            if (j4 != 0) {
                codedOutputStream.u0(9, j4);
            }
            if (this.avatarConfig_ != null) {
                codedOutputStream.w0(10, getAvatarConfig());
            }
        }

        public static VoiceLovePlanetUser parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (VoiceLovePlanetUser) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static VoiceLovePlanetUser parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (VoiceLovePlanetUser) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAvatarConfig(userMaskConfig.AvatarConfig avatarConfig) {
            avatarConfig.getClass();
            this.avatarConfig_ = avatarConfig;
        }

        public static final class Builder extends GeneratedMessageLite.b<VoiceLovePlanetUser, Builder> implements VoiceLovePlanetUserOrBuilder {
            private Builder() {
                super(VoiceLovePlanetUser.DEFAULT_INSTANCE);
            }

            public Builder clearAvatar() {
                copyOnWrite();
                ((VoiceLovePlanetUser) ((GeneratedMessageLite.b) this).instance).clearAvatar();
                return this;
            }

            public Builder clearAvatarConfig() {
                copyOnWrite();
                ((VoiceLovePlanetUser) ((GeneratedMessageLite.b) this).instance).clearAvatarConfig();
                return this;
            }

            public Builder clearGender() {
                copyOnWrite();
                ((VoiceLovePlanetUser) ((GeneratedMessageLite.b) this).instance).clearGender();
                return this;
            }

            public Builder clearIsLeave() {
                copyOnWrite();
                ((VoiceLovePlanetUser) ((GeneratedMessageLite.b) this).instance).clearIsLeave();
                return this;
            }

            public Builder clearPosition() {
                copyOnWrite();
                ((VoiceLovePlanetUser) ((GeneratedMessageLite.b) this).instance).clearPosition();
                return this;
            }

            public Builder clearReceivedScore() {
                copyOnWrite();
                ((VoiceLovePlanetUser) ((GeneratedMessageLite.b) this).instance).clearReceivedScore();
                return this;
            }

            public Builder clearSelectPosition() {
                copyOnWrite();
                ((VoiceLovePlanetUser) ((GeneratedMessageLite.b) this).instance).clearSelectPosition();
                return this;
            }

            public Builder clearSendScore() {
                copyOnWrite();
                ((VoiceLovePlanetUser) ((GeneratedMessageLite.b) this).instance).clearSendScore();
                return this;
            }

            public Builder clearUserId() {
                copyOnWrite();
                ((VoiceLovePlanetUser) ((GeneratedMessageLite.b) this).instance).clearUserId();
                return this;
            }

            public Builder clearUserName() {
                copyOnWrite();
                ((VoiceLovePlanetUser) ((GeneratedMessageLite.b) this).instance).clearUserName();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLovePlanetUserOrBuilder
            public String getAvatar() {
                return ((VoiceLovePlanetUser) ((GeneratedMessageLite.b) this).instance).getAvatar();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLovePlanetUserOrBuilder
            public ByteString getAvatarBytes() {
                return ((VoiceLovePlanetUser) ((GeneratedMessageLite.b) this).instance).getAvatarBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLovePlanetUserOrBuilder
            public userMaskConfig.AvatarConfig getAvatarConfig() {
                return ((VoiceLovePlanetUser) ((GeneratedMessageLite.b) this).instance).getAvatarConfig();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLovePlanetUserOrBuilder
            public String getGender() {
                return ((VoiceLovePlanetUser) ((GeneratedMessageLite.b) this).instance).getGender();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLovePlanetUserOrBuilder
            public ByteString getGenderBytes() {
                return ((VoiceLovePlanetUser) ((GeneratedMessageLite.b) this).instance).getGenderBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLovePlanetUserOrBuilder
            public boolean getIsLeave() {
                return ((VoiceLovePlanetUser) ((GeneratedMessageLite.b) this).instance).getIsLeave();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLovePlanetUserOrBuilder
            public long getPosition() {
                return ((VoiceLovePlanetUser) ((GeneratedMessageLite.b) this).instance).getPosition();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLovePlanetUserOrBuilder
            public long getReceivedScore() {
                return ((VoiceLovePlanetUser) ((GeneratedMessageLite.b) this).instance).getReceivedScore();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLovePlanetUserOrBuilder
            public long getSelectPosition() {
                return ((VoiceLovePlanetUser) ((GeneratedMessageLite.b) this).instance).getSelectPosition();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLovePlanetUserOrBuilder
            public long getSendScore() {
                return ((VoiceLovePlanetUser) ((GeneratedMessageLite.b) this).instance).getSendScore();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLovePlanetUserOrBuilder
            public String getUserId() {
                return ((VoiceLovePlanetUser) ((GeneratedMessageLite.b) this).instance).getUserId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLovePlanetUserOrBuilder
            public ByteString getUserIdBytes() {
                return ((VoiceLovePlanetUser) ((GeneratedMessageLite.b) this).instance).getUserIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLovePlanetUserOrBuilder
            public String getUserName() {
                return ((VoiceLovePlanetUser) ((GeneratedMessageLite.b) this).instance).getUserName();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLovePlanetUserOrBuilder
            public ByteString getUserNameBytes() {
                return ((VoiceLovePlanetUser) ((GeneratedMessageLite.b) this).instance).getUserNameBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLovePlanetUserOrBuilder
            public boolean hasAvatarConfig() {
                return ((VoiceLovePlanetUser) ((GeneratedMessageLite.b) this).instance).hasAvatarConfig();
            }

            public Builder mergeAvatarConfig(userMaskConfig.AvatarConfig avatarConfig) {
                copyOnWrite();
                ((VoiceLovePlanetUser) ((GeneratedMessageLite.b) this).instance).mergeAvatarConfig(avatarConfig);
                return this;
            }

            public Builder setAvatar(String str) {
                copyOnWrite();
                ((VoiceLovePlanetUser) ((GeneratedMessageLite.b) this).instance).setAvatar(str);
                return this;
            }

            public Builder setAvatarBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceLovePlanetUser) ((GeneratedMessageLite.b) this).instance).setAvatarBytes(byteString);
                return this;
            }

            public Builder setAvatarConfig(userMaskConfig.AvatarConfig avatarConfig) {
                copyOnWrite();
                ((VoiceLovePlanetUser) ((GeneratedMessageLite.b) this).instance).setAvatarConfig(avatarConfig);
                return this;
            }

            public Builder setGender(String str) {
                copyOnWrite();
                ((VoiceLovePlanetUser) ((GeneratedMessageLite.b) this).instance).setGender(str);
                return this;
            }

            public Builder setGenderBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceLovePlanetUser) ((GeneratedMessageLite.b) this).instance).setGenderBytes(byteString);
                return this;
            }

            public Builder setIsLeave(boolean z) {
                copyOnWrite();
                ((VoiceLovePlanetUser) ((GeneratedMessageLite.b) this).instance).setIsLeave(z);
                return this;
            }

            public Builder setPosition(long j) {
                copyOnWrite();
                ((VoiceLovePlanetUser) ((GeneratedMessageLite.b) this).instance).setPosition(j);
                return this;
            }

            public Builder setReceivedScore(long j) {
                copyOnWrite();
                ((VoiceLovePlanetUser) ((GeneratedMessageLite.b) this).instance).setReceivedScore(j);
                return this;
            }

            public Builder setSelectPosition(long j) {
                copyOnWrite();
                ((VoiceLovePlanetUser) ((GeneratedMessageLite.b) this).instance).setSelectPosition(j);
                return this;
            }

            public Builder setSendScore(long j) {
                copyOnWrite();
                ((VoiceLovePlanetUser) ((GeneratedMessageLite.b) this).instance).setSendScore(j);
                return this;
            }

            public Builder setUserId(String str) {
                copyOnWrite();
                ((VoiceLovePlanetUser) ((GeneratedMessageLite.b) this).instance).setUserId(str);
                return this;
            }

            public Builder setUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceLovePlanetUser) ((GeneratedMessageLite.b) this).instance).setUserIdBytes(byteString);
                return this;
            }

            public Builder setUserName(String str) {
                copyOnWrite();
                ((VoiceLovePlanetUser) ((GeneratedMessageLite.b) this).instance).setUserName(str);
                return this;
            }

            public Builder setUserNameBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceLovePlanetUser) ((GeneratedMessageLite.b) this).instance).setUserNameBytes(byteString);
                return this;
            }

            public Builder setAvatarConfig(userMaskConfig.AvatarConfig.Builder builder) {
                copyOnWrite();
                ((VoiceLovePlanetUser) ((GeneratedMessageLite.b) this).instance).setAvatarConfig(builder);
                return this;
            }
        }

        public static VoiceLovePlanetUser parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoiceLovePlanetUser) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoiceLovePlanetUser parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (VoiceLovePlanetUser) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static VoiceLovePlanetUser parseFrom(InputStream inputStream) throws IOException {
            return (VoiceLovePlanetUser) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceLovePlanetUser parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (VoiceLovePlanetUser) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static VoiceLovePlanetUser parseFrom(e eVar) throws IOException {
            return (VoiceLovePlanetUser) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static VoiceLovePlanetUser parseFrom(e eVar, h hVar) throws IOException {
            return (VoiceLovePlanetUser) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public static final class VoicePayGuidePopUp extends GeneratedMessageLite<VoicePayGuidePopUp, Builder> implements VoicePayGuidePopUpOrBuilder {
        public static final int BUBBLETITLE_FIELD_NUMBER = 5;
        public static final int BUTTONTITLE_FIELD_NUMBER = 6;
        private static final VoicePayGuidePopUp DEFAULT_INSTANCE;
        public static final int GIFTCOUNT_FIELD_NUMBER = 12;
        public static final int GIFTICON_FIELD_NUMBER = 8;
        public static final int GIFTID_FIELD_NUMBER = 7;
        public static final int GUIDETYPE_FIELD_NUMBER = 9;
        private static volatile i860<VoicePayGuidePopUp> PARSER = null;
        public static final int ROOMID_FIELD_NUMBER = 2;
        public static final int SUBTITLE_FIELD_NUMBER = 4;
        public static final int TITLE_FIELD_NUMBER = 3;
        public static final int TOUSERMASK_FIELD_NUMBER = 10;
        public static final int USERID_FIELD_NUMBER = 1;
        public static final int USERTAG_FIELD_NUMBER = 11;
        private long giftCount_;
        private long giftId_;
        private int guideType_;
        private userMaskConfig.UserMask toUserMask_;
        private String userId_ = "";
        private String roomId_ = "";
        private String title_ = "";
        private String subTitle_ = "";
        private String bubbleTitle_ = "";
        private String buttonTitle_ = "";
        private String giftIcon_ = "";
        private String userTag_ = "";

        static {
            VoicePayGuidePopUp voicePayGuidePopUp = new VoicePayGuidePopUp();
            DEFAULT_INSTANCE = voicePayGuidePopUp;
            voicePayGuidePopUp.makeImmutable();
        }

        private VoicePayGuidePopUp() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBubbleTitle() {
            this.bubbleTitle_ = getDefaultInstance().getBubbleTitle();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearButtonTitle() {
            this.buttonTitle_ = getDefaultInstance().getButtonTitle();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGiftCount() {
            this.giftCount_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGiftIcon() {
            this.giftIcon_ = getDefaultInstance().getGiftIcon();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGiftId() {
            this.giftId_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGuideType() {
            this.guideType_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRoomId() {
            this.roomId_ = getDefaultInstance().getRoomId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSubTitle() {
            this.subTitle_ = getDefaultInstance().getSubTitle();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTitle() {
            this.title_ = getDefaultInstance().getTitle();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearToUserMask() {
            this.toUserMask_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUserId() {
            this.userId_ = getDefaultInstance().getUserId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUserTag() {
            this.userTag_ = getDefaultInstance().getUserTag();
        }

        public static VoicePayGuidePopUp getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeToUserMask(userMaskConfig.UserMask userMask) {
            userMaskConfig.UserMask userMask2 = this.toUserMask_;
            if (userMask2 == null || userMask2 == userMaskConfig.UserMask.getDefaultInstance()) {
                this.toUserMask_ = userMask;
            } else {
                this.toUserMask_ = (userMaskConfig.UserMask) ((userMaskConfig.UserMask.Builder) userMaskConfig.UserMask.newBuilder(this.toUserMask_).mergeFrom(userMask)).buildPartial();
            }
        }

        public static Builder newBuilder(VoicePayGuidePopUp voicePayGuidePopUp) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(voicePayGuidePopUp);
        }

        public static VoicePayGuidePopUp parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VoicePayGuidePopUp) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoicePayGuidePopUp parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VoicePayGuidePopUp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<VoicePayGuidePopUp> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBubbleTitle(String str) {
            str.getClass();
            this.bubbleTitle_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBubbleTitleBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.bubbleTitle_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setButtonTitle(String str) {
            str.getClass();
            this.buttonTitle_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setButtonTitleBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.buttonTitle_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGiftCount(long j) {
            this.giftCount_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGiftIcon(String str) {
            str.getClass();
            this.giftIcon_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGiftIconBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.giftIcon_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGiftId(long j) {
            this.giftId_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGuideType(GuideType guideType) {
            guideType.getClass();
            this.guideType_ = guideType.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGuideTypeValue(int i) {
            this.guideType_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRoomId(String str) {
            str.getClass();
            this.roomId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRoomIdBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.roomId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSubTitle(String str) {
            str.getClass();
            this.subTitle_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSubTitleBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.subTitle_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTitle(String str) {
            str.getClass();
            this.title_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTitleBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.title_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setToUserMask(userMaskConfig.UserMask.Builder builder) {
            this.toUserMask_ = (userMaskConfig.UserMask) builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserId(String str) {
            str.getClass();
            this.userId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserIdBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.userId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserTag(String str) {
            str.getClass();
            this.userTag_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserTagBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.userTag_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C04221.f1679xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoicePayGuidePopUp();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    VoicePayGuidePopUp voicePayGuidePopUp = (VoicePayGuidePopUp) obj2;
                    this.userId_ = hVar.f(!this.userId_.isEmpty(), this.userId_, !voicePayGuidePopUp.userId_.isEmpty(), voicePayGuidePopUp.userId_);
                    this.roomId_ = hVar.f(!this.roomId_.isEmpty(), this.roomId_, !voicePayGuidePopUp.roomId_.isEmpty(), voicePayGuidePopUp.roomId_);
                    this.title_ = hVar.f(!this.title_.isEmpty(), this.title_, !voicePayGuidePopUp.title_.isEmpty(), voicePayGuidePopUp.title_);
                    this.subTitle_ = hVar.f(!this.subTitle_.isEmpty(), this.subTitle_, !voicePayGuidePopUp.subTitle_.isEmpty(), voicePayGuidePopUp.subTitle_);
                    this.bubbleTitle_ = hVar.f(!this.bubbleTitle_.isEmpty(), this.bubbleTitle_, !voicePayGuidePopUp.bubbleTitle_.isEmpty(), voicePayGuidePopUp.bubbleTitle_);
                    this.buttonTitle_ = hVar.f(!this.buttonTitle_.isEmpty(), this.buttonTitle_, !voicePayGuidePopUp.buttonTitle_.isEmpty(), voicePayGuidePopUp.buttonTitle_);
                    long j = this.giftId_;
                    boolean z2 = j != 0;
                    long j2 = voicePayGuidePopUp.giftId_;
                    this.giftId_ = hVar.i(z2, j, j2 != 0, j2);
                    this.giftIcon_ = hVar.f(!this.giftIcon_.isEmpty(), this.giftIcon_, !voicePayGuidePopUp.giftIcon_.isEmpty(), voicePayGuidePopUp.giftIcon_);
                    int i = this.guideType_;
                    boolean z3 = i != 0;
                    int i2 = voicePayGuidePopUp.guideType_;
                    this.guideType_ = hVar.e(z3, i, i2 != 0, i2);
                    this.toUserMask_ = hVar.o(this.toUserMask_, voicePayGuidePopUp.toUserMask_);
                    this.userTag_ = hVar.f(!this.userTag_.isEmpty(), this.userTag_, !voicePayGuidePopUp.userTag_.isEmpty(), voicePayGuidePopUp.userTag_);
                    boolean z4 = false;
                    long j3 = this.giftCount_;
                    if (j3 != 0) {
                        z4 = true;
                    }
                    long j4 = voicePayGuidePopUp.giftCount_;
                    this.giftCount_ = hVar.i(z4, j3, j4 != 0, j4);
                    GeneratedMessageLite.g gVar = GeneratedMessageLite.g.INSTANCE;
                    return this;
                case 6:
                    e eVar = (e) obj;
                    h hVar2 = (h) obj2;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            switch (iM) {
                                case 0:
                                    break;
                                case 10:
                                    this.userId_ = eVar.L();
                                    continue;
                                case 18:
                                    this.roomId_ = eVar.L();
                                    continue;
                                case 26:
                                    this.title_ = eVar.L();
                                    continue;
                                case 34:
                                    this.subTitle_ = eVar.L();
                                    continue;
                                case 42:
                                    this.bubbleTitle_ = eVar.L();
                                    continue;
                                case 50:
                                    this.buttonTitle_ = eVar.L();
                                    continue;
                                case 56:
                                    this.giftId_ = eVar.v();
                                    continue;
                                case 66:
                                    this.giftIcon_ = eVar.L();
                                    continue;
                                case 72:
                                    this.guideType_ = eVar.p();
                                    continue;
                                case 82:
                                    userMaskConfig.UserMask userMask = this.toUserMask_;
                                    userMaskConfig.UserMask.Builder builder = userMask != null ? (userMaskConfig.UserMask.Builder) userMask.toBuilder() : null;
                                    userMaskConfig.UserMask userMaskW = eVar.w(userMaskConfig.UserMask.parser(), hVar2);
                                    this.toUserMask_ = userMaskW;
                                    if (builder != null) {
                                        builder.mergeFrom(userMaskW);
                                        this.toUserMask_ = (userMaskConfig.UserMask) builder.buildPartial();
                                    } else {
                                        continue;
                                    }
                                    break;
                                case 90:
                                    this.userTag_ = eVar.L();
                                    continue;
                                case 96:
                                    this.giftCount_ = eVar.v();
                                    continue;
                                default:
                                    if (!eVar.R(iM)) {
                                        break;
                                    }
                                    break;
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            aag0.a(e.setUnfinishedMessage(this));
                            return null;
                        } catch (IOException e2) {
                            aag0.a(new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this));
                            return null;
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (PARSER == null) {
                        synchronized (VoicePayGuidePopUp.class) {
                            try {
                                if (PARSER == null) {
                                    PARSER = new GeneratedMessageLite.c(DEFAULT_INSTANCE);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return PARSER;
                default:
                    bz00.a();
                    return null;
            }
            return DEFAULT_INSTANCE;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuidePopUpOrBuilder
        public String getBubbleTitle() {
            return this.bubbleTitle_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuidePopUpOrBuilder
        public ByteString getBubbleTitleBytes() {
            return ByteString.copyFromUtf8(this.bubbleTitle_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuidePopUpOrBuilder
        public String getButtonTitle() {
            return this.buttonTitle_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuidePopUpOrBuilder
        public ByteString getButtonTitleBytes() {
            return ByteString.copyFromUtf8(this.buttonTitle_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuidePopUpOrBuilder
        public long getGiftCount() {
            return this.giftCount_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuidePopUpOrBuilder
        public String getGiftIcon() {
            return this.giftIcon_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuidePopUpOrBuilder
        public ByteString getGiftIconBytes() {
            return ByteString.copyFromUtf8(this.giftIcon_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuidePopUpOrBuilder
        public long getGiftId() {
            return this.giftId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuidePopUpOrBuilder
        public GuideType getGuideType() {
            GuideType guideTypeForNumber = GuideType.forNumber(this.guideType_);
            return guideTypeForNumber == null ? GuideType.UNRECOGNIZED : guideTypeForNumber;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuidePopUpOrBuilder
        public int getGuideTypeValue() {
            return this.guideType_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuidePopUpOrBuilder
        public String getRoomId() {
            return this.roomId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuidePopUpOrBuilder
        public ByteString getRoomIdBytes() {
            return ByteString.copyFromUtf8(this.roomId_);
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iK = !this.userId_.isEmpty() ? CodedOutputStream.K(1, getUserId()) : 0;
            if (!this.roomId_.isEmpty()) {
                iK += CodedOutputStream.K(2, getRoomId());
            }
            if (!this.title_.isEmpty()) {
                iK += CodedOutputStream.K(3, getTitle());
            }
            if (!this.subTitle_.isEmpty()) {
                iK += CodedOutputStream.K(4, getSubTitle());
            }
            if (!this.bubbleTitle_.isEmpty()) {
                iK += CodedOutputStream.K(5, getBubbleTitle());
            }
            if (!this.buttonTitle_.isEmpty()) {
                iK += CodedOutputStream.K(6, getButtonTitle());
            }
            long j = this.giftId_;
            if (j != 0) {
                iK += CodedOutputStream.v(7, j);
            }
            if (!this.giftIcon_.isEmpty()) {
                iK += CodedOutputStream.K(8, getGiftIcon());
            }
            if (this.guideType_ != GuideType.empty.getNumber()) {
                iK += CodedOutputStream.m(9, this.guideType_);
            }
            if (this.toUserMask_ != null) {
                iK += CodedOutputStream.C(10, getToUserMask());
            }
            if (!this.userTag_.isEmpty()) {
                iK += CodedOutputStream.K(11, getUserTag());
            }
            long j2 = this.giftCount_;
            if (j2 != 0) {
                iK += CodedOutputStream.v(12, j2);
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iK;
            return iK;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuidePopUpOrBuilder
        public String getSubTitle() {
            return this.subTitle_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuidePopUpOrBuilder
        public ByteString getSubTitleBytes() {
            return ByteString.copyFromUtf8(this.subTitle_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuidePopUpOrBuilder
        public String getTitle() {
            return this.title_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuidePopUpOrBuilder
        public ByteString getTitleBytes() {
            return ByteString.copyFromUtf8(this.title_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuidePopUpOrBuilder
        public userMaskConfig.UserMask getToUserMask() {
            userMaskConfig.UserMask userMask = this.toUserMask_;
            return userMask == null ? userMaskConfig.UserMask.getDefaultInstance() : userMask;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuidePopUpOrBuilder
        public String getUserId() {
            return this.userId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuidePopUpOrBuilder
        public ByteString getUserIdBytes() {
            return ByteString.copyFromUtf8(this.userId_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuidePopUpOrBuilder
        public String getUserTag() {
            return this.userTag_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuidePopUpOrBuilder
        public ByteString getUserTagBytes() {
            return ByteString.copyFromUtf8(this.userTag_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuidePopUpOrBuilder
        public boolean hasToUserMask() {
            return this.toUserMask_ != null;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.userId_.isEmpty()) {
                codedOutputStream.D0(1, getUserId());
            }
            if (!this.roomId_.isEmpty()) {
                codedOutputStream.D0(2, getRoomId());
            }
            if (!this.title_.isEmpty()) {
                codedOutputStream.D0(3, getTitle());
            }
            if (!this.subTitle_.isEmpty()) {
                codedOutputStream.D0(4, getSubTitle());
            }
            if (!this.bubbleTitle_.isEmpty()) {
                codedOutputStream.D0(5, getBubbleTitle());
            }
            if (!this.buttonTitle_.isEmpty()) {
                codedOutputStream.D0(6, getButtonTitle());
            }
            long j = this.giftId_;
            if (j != 0) {
                codedOutputStream.u0(7, j);
            }
            if (!this.giftIcon_.isEmpty()) {
                codedOutputStream.D0(8, getGiftIcon());
            }
            if (this.guideType_ != GuideType.empty.getNumber()) {
                codedOutputStream.i0(9, this.guideType_);
            }
            if (this.toUserMask_ != null) {
                codedOutputStream.w0(10, getToUserMask());
            }
            if (!this.userTag_.isEmpty()) {
                codedOutputStream.D0(11, getUserTag());
            }
            long j2 = this.giftCount_;
            if (j2 != 0) {
                codedOutputStream.u0(12, j2);
            }
        }

        public static VoicePayGuidePopUp parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (VoicePayGuidePopUp) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static VoicePayGuidePopUp parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (VoicePayGuidePopUp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setToUserMask(userMaskConfig.UserMask userMask) {
            userMask.getClass();
            this.toUserMask_ = userMask;
        }

        public static final class Builder extends GeneratedMessageLite.b<VoicePayGuidePopUp, Builder> implements VoicePayGuidePopUpOrBuilder {
            private Builder() {
                super(VoicePayGuidePopUp.DEFAULT_INSTANCE);
            }

            public Builder clearBubbleTitle() {
                copyOnWrite();
                ((VoicePayGuidePopUp) ((GeneratedMessageLite.b) this).instance).clearBubbleTitle();
                return this;
            }

            public Builder clearButtonTitle() {
                copyOnWrite();
                ((VoicePayGuidePopUp) ((GeneratedMessageLite.b) this).instance).clearButtonTitle();
                return this;
            }

            public Builder clearGiftCount() {
                copyOnWrite();
                ((VoicePayGuidePopUp) ((GeneratedMessageLite.b) this).instance).clearGiftCount();
                return this;
            }

            public Builder clearGiftIcon() {
                copyOnWrite();
                ((VoicePayGuidePopUp) ((GeneratedMessageLite.b) this).instance).clearGiftIcon();
                return this;
            }

            public Builder clearGiftId() {
                copyOnWrite();
                ((VoicePayGuidePopUp) ((GeneratedMessageLite.b) this).instance).clearGiftId();
                return this;
            }

            public Builder clearGuideType() {
                copyOnWrite();
                ((VoicePayGuidePopUp) ((GeneratedMessageLite.b) this).instance).clearGuideType();
                return this;
            }

            public Builder clearRoomId() {
                copyOnWrite();
                ((VoicePayGuidePopUp) ((GeneratedMessageLite.b) this).instance).clearRoomId();
                return this;
            }

            public Builder clearSubTitle() {
                copyOnWrite();
                ((VoicePayGuidePopUp) ((GeneratedMessageLite.b) this).instance).clearSubTitle();
                return this;
            }

            public Builder clearTitle() {
                copyOnWrite();
                ((VoicePayGuidePopUp) ((GeneratedMessageLite.b) this).instance).clearTitle();
                return this;
            }

            public Builder clearToUserMask() {
                copyOnWrite();
                ((VoicePayGuidePopUp) ((GeneratedMessageLite.b) this).instance).clearToUserMask();
                return this;
            }

            public Builder clearUserId() {
                copyOnWrite();
                ((VoicePayGuidePopUp) ((GeneratedMessageLite.b) this).instance).clearUserId();
                return this;
            }

            public Builder clearUserTag() {
                copyOnWrite();
                ((VoicePayGuidePopUp) ((GeneratedMessageLite.b) this).instance).clearUserTag();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuidePopUpOrBuilder
            public String getBubbleTitle() {
                return ((VoicePayGuidePopUp) ((GeneratedMessageLite.b) this).instance).getBubbleTitle();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuidePopUpOrBuilder
            public ByteString getBubbleTitleBytes() {
                return ((VoicePayGuidePopUp) ((GeneratedMessageLite.b) this).instance).getBubbleTitleBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuidePopUpOrBuilder
            public String getButtonTitle() {
                return ((VoicePayGuidePopUp) ((GeneratedMessageLite.b) this).instance).getButtonTitle();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuidePopUpOrBuilder
            public ByteString getButtonTitleBytes() {
                return ((VoicePayGuidePopUp) ((GeneratedMessageLite.b) this).instance).getButtonTitleBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuidePopUpOrBuilder
            public long getGiftCount() {
                return ((VoicePayGuidePopUp) ((GeneratedMessageLite.b) this).instance).getGiftCount();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuidePopUpOrBuilder
            public String getGiftIcon() {
                return ((VoicePayGuidePopUp) ((GeneratedMessageLite.b) this).instance).getGiftIcon();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuidePopUpOrBuilder
            public ByteString getGiftIconBytes() {
                return ((VoicePayGuidePopUp) ((GeneratedMessageLite.b) this).instance).getGiftIconBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuidePopUpOrBuilder
            public long getGiftId() {
                return ((VoicePayGuidePopUp) ((GeneratedMessageLite.b) this).instance).getGiftId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuidePopUpOrBuilder
            public GuideType getGuideType() {
                return ((VoicePayGuidePopUp) ((GeneratedMessageLite.b) this).instance).getGuideType();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuidePopUpOrBuilder
            public int getGuideTypeValue() {
                return ((VoicePayGuidePopUp) ((GeneratedMessageLite.b) this).instance).getGuideTypeValue();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuidePopUpOrBuilder
            public String getRoomId() {
                return ((VoicePayGuidePopUp) ((GeneratedMessageLite.b) this).instance).getRoomId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuidePopUpOrBuilder
            public ByteString getRoomIdBytes() {
                return ((VoicePayGuidePopUp) ((GeneratedMessageLite.b) this).instance).getRoomIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuidePopUpOrBuilder
            public String getSubTitle() {
                return ((VoicePayGuidePopUp) ((GeneratedMessageLite.b) this).instance).getSubTitle();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuidePopUpOrBuilder
            public ByteString getSubTitleBytes() {
                return ((VoicePayGuidePopUp) ((GeneratedMessageLite.b) this).instance).getSubTitleBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuidePopUpOrBuilder
            public String getTitle() {
                return ((VoicePayGuidePopUp) ((GeneratedMessageLite.b) this).instance).getTitle();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuidePopUpOrBuilder
            public ByteString getTitleBytes() {
                return ((VoicePayGuidePopUp) ((GeneratedMessageLite.b) this).instance).getTitleBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuidePopUpOrBuilder
            public userMaskConfig.UserMask getToUserMask() {
                return ((VoicePayGuidePopUp) ((GeneratedMessageLite.b) this).instance).getToUserMask();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuidePopUpOrBuilder
            public String getUserId() {
                return ((VoicePayGuidePopUp) ((GeneratedMessageLite.b) this).instance).getUserId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuidePopUpOrBuilder
            public ByteString getUserIdBytes() {
                return ((VoicePayGuidePopUp) ((GeneratedMessageLite.b) this).instance).getUserIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuidePopUpOrBuilder
            public String getUserTag() {
                return ((VoicePayGuidePopUp) ((GeneratedMessageLite.b) this).instance).getUserTag();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuidePopUpOrBuilder
            public ByteString getUserTagBytes() {
                return ((VoicePayGuidePopUp) ((GeneratedMessageLite.b) this).instance).getUserTagBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuidePopUpOrBuilder
            public boolean hasToUserMask() {
                return ((VoicePayGuidePopUp) ((GeneratedMessageLite.b) this).instance).hasToUserMask();
            }

            public Builder mergeToUserMask(userMaskConfig.UserMask userMask) {
                copyOnWrite();
                ((VoicePayGuidePopUp) ((GeneratedMessageLite.b) this).instance).mergeToUserMask(userMask);
                return this;
            }

            public Builder setBubbleTitle(String str) {
                copyOnWrite();
                ((VoicePayGuidePopUp) ((GeneratedMessageLite.b) this).instance).setBubbleTitle(str);
                return this;
            }

            public Builder setBubbleTitleBytes(ByteString byteString) {
                copyOnWrite();
                ((VoicePayGuidePopUp) ((GeneratedMessageLite.b) this).instance).setBubbleTitleBytes(byteString);
                return this;
            }

            public Builder setButtonTitle(String str) {
                copyOnWrite();
                ((VoicePayGuidePopUp) ((GeneratedMessageLite.b) this).instance).setButtonTitle(str);
                return this;
            }

            public Builder setButtonTitleBytes(ByteString byteString) {
                copyOnWrite();
                ((VoicePayGuidePopUp) ((GeneratedMessageLite.b) this).instance).setButtonTitleBytes(byteString);
                return this;
            }

            public Builder setGiftCount(long j) {
                copyOnWrite();
                ((VoicePayGuidePopUp) ((GeneratedMessageLite.b) this).instance).setGiftCount(j);
                return this;
            }

            public Builder setGiftIcon(String str) {
                copyOnWrite();
                ((VoicePayGuidePopUp) ((GeneratedMessageLite.b) this).instance).setGiftIcon(str);
                return this;
            }

            public Builder setGiftIconBytes(ByteString byteString) {
                copyOnWrite();
                ((VoicePayGuidePopUp) ((GeneratedMessageLite.b) this).instance).setGiftIconBytes(byteString);
                return this;
            }

            public Builder setGiftId(long j) {
                copyOnWrite();
                ((VoicePayGuidePopUp) ((GeneratedMessageLite.b) this).instance).setGiftId(j);
                return this;
            }

            public Builder setGuideType(GuideType guideType) {
                copyOnWrite();
                ((VoicePayGuidePopUp) ((GeneratedMessageLite.b) this).instance).setGuideType(guideType);
                return this;
            }

            public Builder setGuideTypeValue(int i) {
                copyOnWrite();
                ((VoicePayGuidePopUp) ((GeneratedMessageLite.b) this).instance).setGuideTypeValue(i);
                return this;
            }

            public Builder setRoomId(String str) {
                copyOnWrite();
                ((VoicePayGuidePopUp) ((GeneratedMessageLite.b) this).instance).setRoomId(str);
                return this;
            }

            public Builder setRoomIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoicePayGuidePopUp) ((GeneratedMessageLite.b) this).instance).setRoomIdBytes(byteString);
                return this;
            }

            public Builder setSubTitle(String str) {
                copyOnWrite();
                ((VoicePayGuidePopUp) ((GeneratedMessageLite.b) this).instance).setSubTitle(str);
                return this;
            }

            public Builder setSubTitleBytes(ByteString byteString) {
                copyOnWrite();
                ((VoicePayGuidePopUp) ((GeneratedMessageLite.b) this).instance).setSubTitleBytes(byteString);
                return this;
            }

            public Builder setTitle(String str) {
                copyOnWrite();
                ((VoicePayGuidePopUp) ((GeneratedMessageLite.b) this).instance).setTitle(str);
                return this;
            }

            public Builder setTitleBytes(ByteString byteString) {
                copyOnWrite();
                ((VoicePayGuidePopUp) ((GeneratedMessageLite.b) this).instance).setTitleBytes(byteString);
                return this;
            }

            public Builder setToUserMask(userMaskConfig.UserMask userMask) {
                copyOnWrite();
                ((VoicePayGuidePopUp) ((GeneratedMessageLite.b) this).instance).setToUserMask(userMask);
                return this;
            }

            public Builder setUserId(String str) {
                copyOnWrite();
                ((VoicePayGuidePopUp) ((GeneratedMessageLite.b) this).instance).setUserId(str);
                return this;
            }

            public Builder setUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoicePayGuidePopUp) ((GeneratedMessageLite.b) this).instance).setUserIdBytes(byteString);
                return this;
            }

            public Builder setUserTag(String str) {
                copyOnWrite();
                ((VoicePayGuidePopUp) ((GeneratedMessageLite.b) this).instance).setUserTag(str);
                return this;
            }

            public Builder setUserTagBytes(ByteString byteString) {
                copyOnWrite();
                ((VoicePayGuidePopUp) ((GeneratedMessageLite.b) this).instance).setUserTagBytes(byteString);
                return this;
            }

            public Builder setToUserMask(userMaskConfig.UserMask.Builder builder) {
                copyOnWrite();
                ((VoicePayGuidePopUp) ((GeneratedMessageLite.b) this).instance).setToUserMask(builder);
                return this;
            }
        }

        public static VoicePayGuidePopUp parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoicePayGuidePopUp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoicePayGuidePopUp parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (VoicePayGuidePopUp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static VoicePayGuidePopUp parseFrom(InputStream inputStream) throws IOException {
            return (VoicePayGuidePopUp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoicePayGuidePopUp parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (VoicePayGuidePopUp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static VoicePayGuidePopUp parseFrom(e eVar) throws IOException {
            return (VoicePayGuidePopUp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static VoicePayGuidePopUp parseFrom(e eVar, h hVar) throws IOException {
            return (VoicePayGuidePopUp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public static final class VoicePayGuideUser extends GeneratedMessageLite<VoicePayGuideUser, Builder> implements VoicePayGuideUserOrBuilder {
        private static final VoicePayGuideUser DEFAULT_INSTANCE;
        private static volatile i860<VoicePayGuideUser> PARSER = null;
        public static final int USERID_FIELD_NUMBER = 1;
        private String userId_ = "";

        public static final class Builder extends GeneratedMessageLite.b<VoicePayGuideUser, Builder> implements VoicePayGuideUserOrBuilder {
            private Builder() {
                super(VoicePayGuideUser.DEFAULT_INSTANCE);
            }

            public Builder clearUserId() {
                copyOnWrite();
                ((VoicePayGuideUser) ((GeneratedMessageLite.b) this).instance).clearUserId();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideUserOrBuilder
            public String getUserId() {
                return ((VoicePayGuideUser) ((GeneratedMessageLite.b) this).instance).getUserId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideUserOrBuilder
            public ByteString getUserIdBytes() {
                return ((VoicePayGuideUser) ((GeneratedMessageLite.b) this).instance).getUserIdBytes();
            }

            public Builder setUserId(String str) {
                copyOnWrite();
                ((VoicePayGuideUser) ((GeneratedMessageLite.b) this).instance).setUserId(str);
                return this;
            }

            public Builder setUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoicePayGuideUser) ((GeneratedMessageLite.b) this).instance).setUserIdBytes(byteString);
                return this;
            }
        }

        static {
            VoicePayGuideUser voicePayGuideUser = new VoicePayGuideUser();
            DEFAULT_INSTANCE = voicePayGuideUser;
            voicePayGuideUser.makeImmutable();
        }

        private VoicePayGuideUser() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUserId() {
            this.userId_ = getDefaultInstance().getUserId();
        }

        public static VoicePayGuideUser getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(VoicePayGuideUser voicePayGuideUser) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(voicePayGuideUser);
        }

        public static VoicePayGuideUser parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VoicePayGuideUser) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoicePayGuideUser parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VoicePayGuideUser) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<VoicePayGuideUser> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserId(String str) {
            str.getClass();
            this.userId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserIdBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.userId_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C04221.f1679xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoicePayGuideUser();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    VoicePayGuideUser voicePayGuideUser = (VoicePayGuideUser) obj2;
                    this.userId_ = ((GeneratedMessageLite.h) obj).f(!this.userId_.isEmpty(), this.userId_, true ^ voicePayGuideUser.userId_.isEmpty(), voicePayGuideUser.userId_);
                    GeneratedMessageLite.g gVar = GeneratedMessageLite.g.INSTANCE;
                    return this;
                case 6:
                    e eVar = (e) obj;
                    boolean z = false;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            if (iM != 0) {
                                if (iM == 10) {
                                    this.userId_ = eVar.L();
                                } else if (!eVar.R(iM)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            aag0.a(e.setUnfinishedMessage(this));
                            return null;
                        } catch (IOException e2) {
                            aag0.a(new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this));
                            return null;
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (PARSER == null) {
                        synchronized (VoicePayGuideUser.class) {
                            try {
                                if (PARSER == null) {
                                    PARSER = new GeneratedMessageLite.c(DEFAULT_INSTANCE);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return PARSER;
                default:
                    bz00.a();
                    return null;
            }
            return DEFAULT_INSTANCE;
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iK = !this.userId_.isEmpty() ? CodedOutputStream.K(1, getUserId()) : 0;
            ((GeneratedMessageLite) this).memoizedSerializedSize = iK;
            return iK;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideUserOrBuilder
        public String getUserId() {
            return this.userId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideUserOrBuilder
        public ByteString getUserIdBytes() {
            return ByteString.copyFromUtf8(this.userId_);
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.userId_.isEmpty()) {
                return;
            }
            codedOutputStream.D0(1, getUserId());
        }

        public static VoicePayGuideUser parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (VoicePayGuideUser) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static VoicePayGuideUser parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (VoicePayGuideUser) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static VoicePayGuideUser parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoicePayGuideUser) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoicePayGuideUser parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (VoicePayGuideUser) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static VoicePayGuideUser parseFrom(InputStream inputStream) throws IOException {
            return (VoicePayGuideUser) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoicePayGuideUser parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (VoicePayGuideUser) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static VoicePayGuideUser parseFrom(e eVar) throws IOException {
            return (VoicePayGuideUser) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static VoicePayGuideUser parseFrom(e eVar, h hVar) throws IOException {
            return (VoicePayGuideUser) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public static final class VoicePayGuideUserInfo extends GeneratedMessageLite<VoicePayGuideUserInfo, Builder> implements VoicePayGuideUserInfoOrBuilder {
        public static final int AGE_FIELD_NUMBER = 5;
        public static final int AVATAR_FIELD_NUMBER = 3;
        private static final VoicePayGuideUserInfo DEFAULT_INSTANCE;
        public static final int GENDER_FIELD_NUMBER = 4;
        public static final int NAME_FIELD_NUMBER = 2;
        private static volatile i860<VoicePayGuideUserInfo> PARSER = null;
        public static final int USERID_FIELD_NUMBER = 1;
        public static final int ZODIAC_FIELD_NUMBER = 6;
        private int age_;
        private String userId_ = "";
        private String name_ = "";
        private String avatar_ = "";
        private String gender_ = "";
        private String zodiac_ = "";

        public static final class Builder extends GeneratedMessageLite.b<VoicePayGuideUserInfo, Builder> implements VoicePayGuideUserInfoOrBuilder {
            private Builder() {
                super(VoicePayGuideUserInfo.DEFAULT_INSTANCE);
            }

            public Builder clearAge() {
                copyOnWrite();
                ((VoicePayGuideUserInfo) ((GeneratedMessageLite.b) this).instance).clearAge();
                return this;
            }

            public Builder clearAvatar() {
                copyOnWrite();
                ((VoicePayGuideUserInfo) ((GeneratedMessageLite.b) this).instance).clearAvatar();
                return this;
            }

            public Builder clearGender() {
                copyOnWrite();
                ((VoicePayGuideUserInfo) ((GeneratedMessageLite.b) this).instance).clearGender();
                return this;
            }

            public Builder clearName() {
                copyOnWrite();
                ((VoicePayGuideUserInfo) ((GeneratedMessageLite.b) this).instance).clearName();
                return this;
            }

            public Builder clearUserId() {
                copyOnWrite();
                ((VoicePayGuideUserInfo) ((GeneratedMessageLite.b) this).instance).clearUserId();
                return this;
            }

            public Builder clearZodiac() {
                copyOnWrite();
                ((VoicePayGuideUserInfo) ((GeneratedMessageLite.b) this).instance).clearZodiac();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideUserInfoOrBuilder
            public int getAge() {
                return ((VoicePayGuideUserInfo) ((GeneratedMessageLite.b) this).instance).getAge();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideUserInfoOrBuilder
            public String getAvatar() {
                return ((VoicePayGuideUserInfo) ((GeneratedMessageLite.b) this).instance).getAvatar();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideUserInfoOrBuilder
            public ByteString getAvatarBytes() {
                return ((VoicePayGuideUserInfo) ((GeneratedMessageLite.b) this).instance).getAvatarBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideUserInfoOrBuilder
            public String getGender() {
                return ((VoicePayGuideUserInfo) ((GeneratedMessageLite.b) this).instance).getGender();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideUserInfoOrBuilder
            public ByteString getGenderBytes() {
                return ((VoicePayGuideUserInfo) ((GeneratedMessageLite.b) this).instance).getGenderBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideUserInfoOrBuilder
            public String getName() {
                return ((VoicePayGuideUserInfo) ((GeneratedMessageLite.b) this).instance).getName();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideUserInfoOrBuilder
            public ByteString getNameBytes() {
                return ((VoicePayGuideUserInfo) ((GeneratedMessageLite.b) this).instance).getNameBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideUserInfoOrBuilder
            public String getUserId() {
                return ((VoicePayGuideUserInfo) ((GeneratedMessageLite.b) this).instance).getUserId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideUserInfoOrBuilder
            public ByteString getUserIdBytes() {
                return ((VoicePayGuideUserInfo) ((GeneratedMessageLite.b) this).instance).getUserIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideUserInfoOrBuilder
            public String getZodiac() {
                return ((VoicePayGuideUserInfo) ((GeneratedMessageLite.b) this).instance).getZodiac();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideUserInfoOrBuilder
            public ByteString getZodiacBytes() {
                return ((VoicePayGuideUserInfo) ((GeneratedMessageLite.b) this).instance).getZodiacBytes();
            }

            public Builder setAge(int i) {
                copyOnWrite();
                ((VoicePayGuideUserInfo) ((GeneratedMessageLite.b) this).instance).setAge(i);
                return this;
            }

            public Builder setAvatar(String str) {
                copyOnWrite();
                ((VoicePayGuideUserInfo) ((GeneratedMessageLite.b) this).instance).setAvatar(str);
                return this;
            }

            public Builder setAvatarBytes(ByteString byteString) {
                copyOnWrite();
                ((VoicePayGuideUserInfo) ((GeneratedMessageLite.b) this).instance).setAvatarBytes(byteString);
                return this;
            }

            public Builder setGender(String str) {
                copyOnWrite();
                ((VoicePayGuideUserInfo) ((GeneratedMessageLite.b) this).instance).setGender(str);
                return this;
            }

            public Builder setGenderBytes(ByteString byteString) {
                copyOnWrite();
                ((VoicePayGuideUserInfo) ((GeneratedMessageLite.b) this).instance).setGenderBytes(byteString);
                return this;
            }

            public Builder setName(String str) {
                copyOnWrite();
                ((VoicePayGuideUserInfo) ((GeneratedMessageLite.b) this).instance).setName(str);
                return this;
            }

            public Builder setNameBytes(ByteString byteString) {
                copyOnWrite();
                ((VoicePayGuideUserInfo) ((GeneratedMessageLite.b) this).instance).setNameBytes(byteString);
                return this;
            }

            public Builder setUserId(String str) {
                copyOnWrite();
                ((VoicePayGuideUserInfo) ((GeneratedMessageLite.b) this).instance).setUserId(str);
                return this;
            }

            public Builder setUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoicePayGuideUserInfo) ((GeneratedMessageLite.b) this).instance).setUserIdBytes(byteString);
                return this;
            }

            public Builder setZodiac(String str) {
                copyOnWrite();
                ((VoicePayGuideUserInfo) ((GeneratedMessageLite.b) this).instance).setZodiac(str);
                return this;
            }

            public Builder setZodiacBytes(ByteString byteString) {
                copyOnWrite();
                ((VoicePayGuideUserInfo) ((GeneratedMessageLite.b) this).instance).setZodiacBytes(byteString);
                return this;
            }
        }

        static {
            VoicePayGuideUserInfo voicePayGuideUserInfo = new VoicePayGuideUserInfo();
            DEFAULT_INSTANCE = voicePayGuideUserInfo;
            voicePayGuideUserInfo.makeImmutable();
        }

        private VoicePayGuideUserInfo() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAge() {
            this.age_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAvatar() {
            this.avatar_ = getDefaultInstance().getAvatar();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGender() {
            this.gender_ = getDefaultInstance().getGender();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearName() {
            this.name_ = getDefaultInstance().getName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUserId() {
            this.userId_ = getDefaultInstance().getUserId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearZodiac() {
            this.zodiac_ = getDefaultInstance().getZodiac();
        }

        public static VoicePayGuideUserInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(VoicePayGuideUserInfo voicePayGuideUserInfo) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(voicePayGuideUserInfo);
        }

        public static VoicePayGuideUserInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VoicePayGuideUserInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoicePayGuideUserInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VoicePayGuideUserInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<VoicePayGuideUserInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAge(int i) {
            this.age_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAvatar(String str) {
            str.getClass();
            this.avatar_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAvatarBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.avatar_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGender(String str) {
            str.getClass();
            this.gender_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGenderBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.gender_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setName(String str) {
            str.getClass();
            this.name_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNameBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.name_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserId(String str) {
            str.getClass();
            this.userId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserIdBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.userId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setZodiac(String str) {
            str.getClass();
            this.zodiac_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setZodiacBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.zodiac_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C04221.f1679xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoicePayGuideUserInfo();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    VoicePayGuideUserInfo voicePayGuideUserInfo = (VoicePayGuideUserInfo) obj2;
                    this.userId_ = hVar.f(!this.userId_.isEmpty(), this.userId_, !voicePayGuideUserInfo.userId_.isEmpty(), voicePayGuideUserInfo.userId_);
                    this.name_ = hVar.f(!this.name_.isEmpty(), this.name_, !voicePayGuideUserInfo.name_.isEmpty(), voicePayGuideUserInfo.name_);
                    this.avatar_ = hVar.f(!this.avatar_.isEmpty(), this.avatar_, !voicePayGuideUserInfo.avatar_.isEmpty(), voicePayGuideUserInfo.avatar_);
                    this.gender_ = hVar.f(!this.gender_.isEmpty(), this.gender_, !voicePayGuideUserInfo.gender_.isEmpty(), voicePayGuideUserInfo.gender_);
                    int i = this.age_;
                    boolean z2 = i != 0;
                    int i2 = voicePayGuideUserInfo.age_;
                    this.age_ = hVar.e(z2, i, i2 != 0, i2);
                    this.zodiac_ = hVar.f(!this.zodiac_.isEmpty(), this.zodiac_, !voicePayGuideUserInfo.zodiac_.isEmpty(), voicePayGuideUserInfo.zodiac_);
                    GeneratedMessageLite.g gVar = GeneratedMessageLite.g.INSTANCE;
                    return this;
                case 6:
                    e eVar = (e) obj;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            if (iM != 0) {
                                if (iM == 10) {
                                    this.userId_ = eVar.L();
                                } else if (iM == 18) {
                                    this.name_ = eVar.L();
                                } else if (iM == 26) {
                                    this.avatar_ = eVar.L();
                                } else if (iM == 34) {
                                    this.gender_ = eVar.L();
                                } else if (iM == 40) {
                                    this.age_ = eVar.u();
                                } else if (iM == 50) {
                                    this.zodiac_ = eVar.L();
                                } else if (!eVar.R(iM)) {
                                }
                            }
                            z = true;
                        } catch (IOException e) {
                            aag0.a(new InvalidProtocolBufferException(e.getMessage()).setUnfinishedMessage(this));
                            return null;
                        } catch (InvalidProtocolBufferException e2) {
                            aag0.a(e2.setUnfinishedMessage(this));
                            return null;
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (PARSER == null) {
                        synchronized (VoicePayGuideUserInfo.class) {
                            try {
                                if (PARSER == null) {
                                    PARSER = new GeneratedMessageLite.c(DEFAULT_INSTANCE);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return PARSER;
                default:
                    bz00.a();
                    return null;
            }
            return DEFAULT_INSTANCE;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideUserInfoOrBuilder
        public int getAge() {
            return this.age_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideUserInfoOrBuilder
        public String getAvatar() {
            return this.avatar_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideUserInfoOrBuilder
        public ByteString getAvatarBytes() {
            return ByteString.copyFromUtf8(this.avatar_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideUserInfoOrBuilder
        public String getGender() {
            return this.gender_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideUserInfoOrBuilder
        public ByteString getGenderBytes() {
            return ByteString.copyFromUtf8(this.gender_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideUserInfoOrBuilder
        public String getName() {
            return this.name_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideUserInfoOrBuilder
        public ByteString getNameBytes() {
            return ByteString.copyFromUtf8(this.name_);
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iK = !this.userId_.isEmpty() ? CodedOutputStream.K(1, getUserId()) : 0;
            if (!this.name_.isEmpty()) {
                iK += CodedOutputStream.K(2, getName());
            }
            if (!this.avatar_.isEmpty()) {
                iK += CodedOutputStream.K(3, getAvatar());
            }
            if (!this.gender_.isEmpty()) {
                iK += CodedOutputStream.K(4, getGender());
            }
            int i2 = this.age_;
            if (i2 != 0) {
                iK += CodedOutputStream.t(5, i2);
            }
            if (!this.zodiac_.isEmpty()) {
                iK += CodedOutputStream.K(6, getZodiac());
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iK;
            return iK;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideUserInfoOrBuilder
        public String getUserId() {
            return this.userId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideUserInfoOrBuilder
        public ByteString getUserIdBytes() {
            return ByteString.copyFromUtf8(this.userId_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideUserInfoOrBuilder
        public String getZodiac() {
            return this.zodiac_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideUserInfoOrBuilder
        public ByteString getZodiacBytes() {
            return ByteString.copyFromUtf8(this.zodiac_);
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.userId_.isEmpty()) {
                codedOutputStream.D0(1, getUserId());
            }
            if (!this.name_.isEmpty()) {
                codedOutputStream.D0(2, getName());
            }
            if (!this.avatar_.isEmpty()) {
                codedOutputStream.D0(3, getAvatar());
            }
            if (!this.gender_.isEmpty()) {
                codedOutputStream.D0(4, getGender());
            }
            int i = this.age_;
            if (i != 0) {
                codedOutputStream.s0(5, i);
            }
            if (this.zodiac_.isEmpty()) {
                return;
            }
            codedOutputStream.D0(6, getZodiac());
        }

        public static VoicePayGuideUserInfo parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (VoicePayGuideUserInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static VoicePayGuideUserInfo parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (VoicePayGuideUserInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static VoicePayGuideUserInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoicePayGuideUserInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoicePayGuideUserInfo parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (VoicePayGuideUserInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static VoicePayGuideUserInfo parseFrom(InputStream inputStream) throws IOException {
            return (VoicePayGuideUserInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoicePayGuideUserInfo parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (VoicePayGuideUserInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static VoicePayGuideUserInfo parseFrom(e eVar) throws IOException {
            return (VoicePayGuideUserInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static VoicePayGuideUserInfo parseFrom(e eVar, h hVar) throws IOException {
            return (VoicePayGuideUserInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public static final class VoicePayGuideUserTag extends GeneratedMessageLite<VoicePayGuideUserTag, Builder> implements VoicePayGuideUserTagOrBuilder {
        public static final int COLOR_FIELD_NUMBER = 2;
        private static final VoicePayGuideUserTag DEFAULT_INSTANCE;
        private static volatile i860<VoicePayGuideUserTag> PARSER = null;
        public static final int TEXT_FIELD_NUMBER = 1;
        public static final int TYPE_FIELD_NUMBER = 3;
        private String text_ = "";
        private String color_ = "";
        private String type_ = "";

        public static final class Builder extends GeneratedMessageLite.b<VoicePayGuideUserTag, Builder> implements VoicePayGuideUserTagOrBuilder {
            private Builder() {
                super(VoicePayGuideUserTag.DEFAULT_INSTANCE);
            }

            public Builder clearColor() {
                copyOnWrite();
                ((VoicePayGuideUserTag) ((GeneratedMessageLite.b) this).instance).clearColor();
                return this;
            }

            public Builder clearText() {
                copyOnWrite();
                ((VoicePayGuideUserTag) ((GeneratedMessageLite.b) this).instance).clearText();
                return this;
            }

            public Builder clearType() {
                copyOnWrite();
                ((VoicePayGuideUserTag) ((GeneratedMessageLite.b) this).instance).clearType();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideUserTagOrBuilder
            public String getColor() {
                return ((VoicePayGuideUserTag) ((GeneratedMessageLite.b) this).instance).getColor();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideUserTagOrBuilder
            public ByteString getColorBytes() {
                return ((VoicePayGuideUserTag) ((GeneratedMessageLite.b) this).instance).getColorBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideUserTagOrBuilder
            public String getText() {
                return ((VoicePayGuideUserTag) ((GeneratedMessageLite.b) this).instance).getText();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideUserTagOrBuilder
            public ByteString getTextBytes() {
                return ((VoicePayGuideUserTag) ((GeneratedMessageLite.b) this).instance).getTextBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideUserTagOrBuilder
            public String getType() {
                return ((VoicePayGuideUserTag) ((GeneratedMessageLite.b) this).instance).getType();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideUserTagOrBuilder
            public ByteString getTypeBytes() {
                return ((VoicePayGuideUserTag) ((GeneratedMessageLite.b) this).instance).getTypeBytes();
            }

            public Builder setColor(String str) {
                copyOnWrite();
                ((VoicePayGuideUserTag) ((GeneratedMessageLite.b) this).instance).setColor(str);
                return this;
            }

            public Builder setColorBytes(ByteString byteString) {
                copyOnWrite();
                ((VoicePayGuideUserTag) ((GeneratedMessageLite.b) this).instance).setColorBytes(byteString);
                return this;
            }

            public Builder setText(String str) {
                copyOnWrite();
                ((VoicePayGuideUserTag) ((GeneratedMessageLite.b) this).instance).setText(str);
                return this;
            }

            public Builder setTextBytes(ByteString byteString) {
                copyOnWrite();
                ((VoicePayGuideUserTag) ((GeneratedMessageLite.b) this).instance).setTextBytes(byteString);
                return this;
            }

            public Builder setType(String str) {
                copyOnWrite();
                ((VoicePayGuideUserTag) ((GeneratedMessageLite.b) this).instance).setType(str);
                return this;
            }

            public Builder setTypeBytes(ByteString byteString) {
                copyOnWrite();
                ((VoicePayGuideUserTag) ((GeneratedMessageLite.b) this).instance).setTypeBytes(byteString);
                return this;
            }
        }

        static {
            VoicePayGuideUserTag voicePayGuideUserTag = new VoicePayGuideUserTag();
            DEFAULT_INSTANCE = voicePayGuideUserTag;
            voicePayGuideUserTag.makeImmutable();
        }

        private VoicePayGuideUserTag() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearColor() {
            this.color_ = getDefaultInstance().getColor();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearText() {
            this.text_ = getDefaultInstance().getText();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearType() {
            this.type_ = getDefaultInstance().getType();
        }

        public static VoicePayGuideUserTag getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(VoicePayGuideUserTag voicePayGuideUserTag) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(voicePayGuideUserTag);
        }

        public static VoicePayGuideUserTag parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VoicePayGuideUserTag) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoicePayGuideUserTag parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VoicePayGuideUserTag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<VoicePayGuideUserTag> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setColor(String str) {
            str.getClass();
            this.color_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setColorBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.color_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setText(String str) {
            str.getClass();
            this.text_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTextBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.text_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setType(String str) {
            str.getClass();
            this.type_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTypeBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.type_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C04221.f1679xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoicePayGuideUserTag();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    VoicePayGuideUserTag voicePayGuideUserTag = (VoicePayGuideUserTag) obj2;
                    this.text_ = hVar.f(!this.text_.isEmpty(), this.text_, !voicePayGuideUserTag.text_.isEmpty(), voicePayGuideUserTag.text_);
                    this.color_ = hVar.f(!this.color_.isEmpty(), this.color_, !voicePayGuideUserTag.color_.isEmpty(), voicePayGuideUserTag.color_);
                    this.type_ = hVar.f(!this.type_.isEmpty(), this.type_, true ^ voicePayGuideUserTag.type_.isEmpty(), voicePayGuideUserTag.type_);
                    GeneratedMessageLite.g gVar = GeneratedMessageLite.g.INSTANCE;
                    return this;
                case 6:
                    e eVar = (e) obj;
                    boolean z = false;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            if (iM != 0) {
                                if (iM == 10) {
                                    this.text_ = eVar.L();
                                } else if (iM == 18) {
                                    this.color_ = eVar.L();
                                } else if (iM == 26) {
                                    this.type_ = eVar.L();
                                } else if (!eVar.R(iM)) {
                                }
                            }
                            z = true;
                        } catch (IOException e) {
                            aag0.a(new InvalidProtocolBufferException(e.getMessage()).setUnfinishedMessage(this));
                            return null;
                        } catch (InvalidProtocolBufferException e2) {
                            aag0.a(e2.setUnfinishedMessage(this));
                            return null;
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (PARSER == null) {
                        synchronized (VoicePayGuideUserTag.class) {
                            try {
                                if (PARSER == null) {
                                    PARSER = new GeneratedMessageLite.c(DEFAULT_INSTANCE);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return PARSER;
                default:
                    bz00.a();
                    return null;
            }
            return DEFAULT_INSTANCE;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideUserTagOrBuilder
        public String getColor() {
            return this.color_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideUserTagOrBuilder
        public ByteString getColorBytes() {
            return ByteString.copyFromUtf8(this.color_);
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iK = !this.text_.isEmpty() ? CodedOutputStream.K(1, getText()) : 0;
            if (!this.color_.isEmpty()) {
                iK += CodedOutputStream.K(2, getColor());
            }
            if (!this.type_.isEmpty()) {
                iK += CodedOutputStream.K(3, getType());
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iK;
            return iK;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideUserTagOrBuilder
        public String getText() {
            return this.text_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideUserTagOrBuilder
        public ByteString getTextBytes() {
            return ByteString.copyFromUtf8(this.text_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideUserTagOrBuilder
        public String getType() {
            return this.type_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideUserTagOrBuilder
        public ByteString getTypeBytes() {
            return ByteString.copyFromUtf8(this.type_);
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.text_.isEmpty()) {
                codedOutputStream.D0(1, getText());
            }
            if (!this.color_.isEmpty()) {
                codedOutputStream.D0(2, getColor());
            }
            if (this.type_.isEmpty()) {
                return;
            }
            codedOutputStream.D0(3, getType());
        }

        public static VoicePayGuideUserTag parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (VoicePayGuideUserTag) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static VoicePayGuideUserTag parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (VoicePayGuideUserTag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static VoicePayGuideUserTag parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoicePayGuideUserTag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoicePayGuideUserTag parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (VoicePayGuideUserTag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static VoicePayGuideUserTag parseFrom(InputStream inputStream) throws IOException {
            return (VoicePayGuideUserTag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoicePayGuideUserTag parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (VoicePayGuideUserTag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static VoicePayGuideUserTag parseFrom(e eVar) throws IOException {
            return (VoicePayGuideUserTag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static VoicePayGuideUserTag parseFrom(e eVar, h hVar) throws IOException {
            return (VoicePayGuideUserTag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public static final class VoicePayGuideV2PopUp extends GeneratedMessageLite<VoicePayGuideV2PopUp, Builder> implements VoicePayGuideV2PopUpOrBuilder {
        public static final int BIZTYPE_FIELD_NUMBER = 14;
        public static final int BUBBLETITLE_FIELD_NUMBER = 5;
        public static final int BUTTONTITLE_FIELD_NUMBER = 6;
        private static final VoicePayGuideV2PopUp DEFAULT_INSTANCE;
        public static final int GIFTCOUNT_FIELD_NUMBER = 9;
        public static final int GIFTICON_FIELD_NUMBER = 8;
        public static final int GIFTID_FIELD_NUMBER = 7;
        public static final int GUIDETYPE_FIELD_NUMBER = 10;
        private static volatile i860<VoicePayGuideV2PopUp> PARSER = null;
        public static final int RELATIONSHIPTYPE_FIELD_NUMBER = 13;
        public static final int ROOMID_FIELD_NUMBER = 2;
        public static final int SUBTITLE_FIELD_NUMBER = 4;
        public static final int TITLE_FIELD_NUMBER = 3;
        public static final int TOUSERINFO_FIELD_NUMBER = 11;
        public static final int USERID_FIELD_NUMBER = 1;
        public static final int USERTAG_FIELD_NUMBER = 12;
        private long giftCount_;
        private long giftId_;
        private int guideType_;
        private VoicePayGuideUserInfo toUserInfo_;
        private VoicePayGuideUserTag userTag_;
        private String userId_ = "";
        private String roomId_ = "";
        private String title_ = "";
        private String subTitle_ = "";
        private String bubbleTitle_ = "";
        private String buttonTitle_ = "";
        private String giftIcon_ = "";
        private String relationshipType_ = "";
        private String bizType_ = "";

        static {
            VoicePayGuideV2PopUp voicePayGuideV2PopUp = new VoicePayGuideV2PopUp();
            DEFAULT_INSTANCE = voicePayGuideV2PopUp;
            voicePayGuideV2PopUp.makeImmutable();
        }

        private VoicePayGuideV2PopUp() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBizType() {
            this.bizType_ = getDefaultInstance().getBizType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBubbleTitle() {
            this.bubbleTitle_ = getDefaultInstance().getBubbleTitle();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearButtonTitle() {
            this.buttonTitle_ = getDefaultInstance().getButtonTitle();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGiftCount() {
            this.giftCount_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGiftIcon() {
            this.giftIcon_ = getDefaultInstance().getGiftIcon();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGiftId() {
            this.giftId_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGuideType() {
            this.guideType_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRelationshipType() {
            this.relationshipType_ = getDefaultInstance().getRelationshipType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRoomId() {
            this.roomId_ = getDefaultInstance().getRoomId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSubTitle() {
            this.subTitle_ = getDefaultInstance().getSubTitle();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTitle() {
            this.title_ = getDefaultInstance().getTitle();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearToUserInfo() {
            this.toUserInfo_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUserId() {
            this.userId_ = getDefaultInstance().getUserId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUserTag() {
            this.userTag_ = null;
        }

        public static VoicePayGuideV2PopUp getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeToUserInfo(VoicePayGuideUserInfo voicePayGuideUserInfo) {
            VoicePayGuideUserInfo voicePayGuideUserInfo2 = this.toUserInfo_;
            if (voicePayGuideUserInfo2 == null || voicePayGuideUserInfo2 == VoicePayGuideUserInfo.getDefaultInstance()) {
                this.toUserInfo_ = voicePayGuideUserInfo;
            } else {
                this.toUserInfo_ = (VoicePayGuideUserInfo) ((VoicePayGuideUserInfo.Builder) VoicePayGuideUserInfo.newBuilder(this.toUserInfo_).mergeFrom(voicePayGuideUserInfo)).buildPartial();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeUserTag(VoicePayGuideUserTag voicePayGuideUserTag) {
            VoicePayGuideUserTag voicePayGuideUserTag2 = this.userTag_;
            if (voicePayGuideUserTag2 == null || voicePayGuideUserTag2 == VoicePayGuideUserTag.getDefaultInstance()) {
                this.userTag_ = voicePayGuideUserTag;
            } else {
                this.userTag_ = (VoicePayGuideUserTag) ((VoicePayGuideUserTag.Builder) VoicePayGuideUserTag.newBuilder(this.userTag_).mergeFrom(voicePayGuideUserTag)).buildPartial();
            }
        }

        public static Builder newBuilder(VoicePayGuideV2PopUp voicePayGuideV2PopUp) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(voicePayGuideV2PopUp);
        }

        public static VoicePayGuideV2PopUp parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VoicePayGuideV2PopUp) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoicePayGuideV2PopUp parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VoicePayGuideV2PopUp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<VoicePayGuideV2PopUp> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBizType(String str) {
            str.getClass();
            this.bizType_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBizTypeBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.bizType_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBubbleTitle(String str) {
            str.getClass();
            this.bubbleTitle_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBubbleTitleBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.bubbleTitle_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setButtonTitle(String str) {
            str.getClass();
            this.buttonTitle_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setButtonTitleBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.buttonTitle_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGiftCount(long j) {
            this.giftCount_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGiftIcon(String str) {
            str.getClass();
            this.giftIcon_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGiftIconBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.giftIcon_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGiftId(long j) {
            this.giftId_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGuideType(GuideType guideType) {
            guideType.getClass();
            this.guideType_ = guideType.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGuideTypeValue(int i) {
            this.guideType_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRelationshipType(String str) {
            str.getClass();
            this.relationshipType_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRelationshipTypeBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.relationshipType_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRoomId(String str) {
            str.getClass();
            this.roomId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRoomIdBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.roomId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSubTitle(String str) {
            str.getClass();
            this.subTitle_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSubTitleBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.subTitle_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTitle(String str) {
            str.getClass();
            this.title_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTitleBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.title_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setToUserInfo(VoicePayGuideUserInfo.Builder builder) {
            this.toUserInfo_ = (VoicePayGuideUserInfo) builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserId(String str) {
            str.getClass();
            this.userId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserIdBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.userId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserTag(VoicePayGuideUserTag.Builder builder) {
            this.userTag_ = (VoicePayGuideUserTag) builder.build();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C04221.f1679xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoicePayGuideV2PopUp();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    VoicePayGuideV2PopUp voicePayGuideV2PopUp = (VoicePayGuideV2PopUp) obj2;
                    this.userId_ = hVar.f(!this.userId_.isEmpty(), this.userId_, !voicePayGuideV2PopUp.userId_.isEmpty(), voicePayGuideV2PopUp.userId_);
                    this.roomId_ = hVar.f(!this.roomId_.isEmpty(), this.roomId_, !voicePayGuideV2PopUp.roomId_.isEmpty(), voicePayGuideV2PopUp.roomId_);
                    this.title_ = hVar.f(!this.title_.isEmpty(), this.title_, !voicePayGuideV2PopUp.title_.isEmpty(), voicePayGuideV2PopUp.title_);
                    this.subTitle_ = hVar.f(!this.subTitle_.isEmpty(), this.subTitle_, !voicePayGuideV2PopUp.subTitle_.isEmpty(), voicePayGuideV2PopUp.subTitle_);
                    this.bubbleTitle_ = hVar.f(!this.bubbleTitle_.isEmpty(), this.bubbleTitle_, !voicePayGuideV2PopUp.bubbleTitle_.isEmpty(), voicePayGuideV2PopUp.bubbleTitle_);
                    this.buttonTitle_ = hVar.f(!this.buttonTitle_.isEmpty(), this.buttonTitle_, !voicePayGuideV2PopUp.buttonTitle_.isEmpty(), voicePayGuideV2PopUp.buttonTitle_);
                    long j = this.giftId_;
                    boolean z2 = j != 0;
                    long j2 = voicePayGuideV2PopUp.giftId_;
                    this.giftId_ = hVar.i(z2, j, j2 != 0, j2);
                    this.giftIcon_ = hVar.f(!this.giftIcon_.isEmpty(), this.giftIcon_, !voicePayGuideV2PopUp.giftIcon_.isEmpty(), voicePayGuideV2PopUp.giftIcon_);
                    long j3 = this.giftCount_;
                    boolean z3 = j3 != 0;
                    long j4 = voicePayGuideV2PopUp.giftCount_;
                    this.giftCount_ = hVar.i(z3, j3, j4 != 0, j4);
                    int i = this.guideType_;
                    boolean z4 = i != 0;
                    int i2 = voicePayGuideV2PopUp.guideType_;
                    this.guideType_ = hVar.e(z4, i, i2 != 0, i2);
                    this.toUserInfo_ = hVar.o(this.toUserInfo_, voicePayGuideV2PopUp.toUserInfo_);
                    this.userTag_ = hVar.o(this.userTag_, voicePayGuideV2PopUp.userTag_);
                    this.relationshipType_ = hVar.f(!this.relationshipType_.isEmpty(), this.relationshipType_, !voicePayGuideV2PopUp.relationshipType_.isEmpty(), voicePayGuideV2PopUp.relationshipType_);
                    this.bizType_ = hVar.f(!this.bizType_.isEmpty(), this.bizType_, !voicePayGuideV2PopUp.bizType_.isEmpty(), voicePayGuideV2PopUp.bizType_);
                    GeneratedMessageLite.g gVar = GeneratedMessageLite.g.INSTANCE;
                    return this;
                case 6:
                    e eVar = (e) obj;
                    h hVar2 = (h) obj2;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            switch (iM) {
                                case 0:
                                    break;
                                case 10:
                                    this.userId_ = eVar.L();
                                    continue;
                                case 18:
                                    this.roomId_ = eVar.L();
                                    continue;
                                case 26:
                                    this.title_ = eVar.L();
                                    continue;
                                case 34:
                                    this.subTitle_ = eVar.L();
                                    continue;
                                case 42:
                                    this.bubbleTitle_ = eVar.L();
                                    continue;
                                case 50:
                                    this.buttonTitle_ = eVar.L();
                                    continue;
                                case 56:
                                    this.giftId_ = eVar.v();
                                    continue;
                                case 66:
                                    this.giftIcon_ = eVar.L();
                                    continue;
                                case 72:
                                    this.giftCount_ = eVar.v();
                                    continue;
                                case 80:
                                    this.guideType_ = eVar.p();
                                    continue;
                                case 90:
                                    VoicePayGuideUserInfo voicePayGuideUserInfo = this.toUserInfo_;
                                    VoicePayGuideUserInfo.Builder builder = voicePayGuideUserInfo != null ? (VoicePayGuideUserInfo.Builder) voicePayGuideUserInfo.toBuilder() : null;
                                    VoicePayGuideUserInfo voicePayGuideUserInfoW = eVar.w(VoicePayGuideUserInfo.parser(), hVar2);
                                    this.toUserInfo_ = voicePayGuideUserInfoW;
                                    if (builder != null) {
                                        builder.mergeFrom(voicePayGuideUserInfoW);
                                        this.toUserInfo_ = (VoicePayGuideUserInfo) builder.buildPartial();
                                    } else {
                                        continue;
                                    }
                                    break;
                                case 98:
                                    VoicePayGuideUserTag voicePayGuideUserTag = this.userTag_;
                                    VoicePayGuideUserTag.Builder builder2 = voicePayGuideUserTag != null ? (VoicePayGuideUserTag.Builder) voicePayGuideUserTag.toBuilder() : null;
                                    VoicePayGuideUserTag voicePayGuideUserTagW = eVar.w(VoicePayGuideUserTag.parser(), hVar2);
                                    this.userTag_ = voicePayGuideUserTagW;
                                    if (builder2 != null) {
                                        builder2.mergeFrom(voicePayGuideUserTagW);
                                        this.userTag_ = (VoicePayGuideUserTag) builder2.buildPartial();
                                    } else {
                                        continue;
                                    }
                                    break;
                                case 106:
                                    this.relationshipType_ = eVar.L();
                                    continue;
                                case XEGiftErrorCode.ERROR_CODE_VIDEO_TIMEOUT /* 114 */:
                                    this.bizType_ = eVar.L();
                                    continue;
                                default:
                                    if (!eVar.R(iM)) {
                                        break;
                                    }
                                    break;
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            aag0.a(e.setUnfinishedMessage(this));
                            return null;
                        } catch (IOException e2) {
                            aag0.a(new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this));
                            return null;
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (PARSER == null) {
                        synchronized (VoicePayGuideV2PopUp.class) {
                            try {
                                if (PARSER == null) {
                                    PARSER = new GeneratedMessageLite.c(DEFAULT_INSTANCE);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return PARSER;
                default:
                    bz00.a();
                    return null;
            }
            return DEFAULT_INSTANCE;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideV2PopUpOrBuilder
        public String getBizType() {
            return this.bizType_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideV2PopUpOrBuilder
        public ByteString getBizTypeBytes() {
            return ByteString.copyFromUtf8(this.bizType_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideV2PopUpOrBuilder
        public String getBubbleTitle() {
            return this.bubbleTitle_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideV2PopUpOrBuilder
        public ByteString getBubbleTitleBytes() {
            return ByteString.copyFromUtf8(this.bubbleTitle_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideV2PopUpOrBuilder
        public String getButtonTitle() {
            return this.buttonTitle_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideV2PopUpOrBuilder
        public ByteString getButtonTitleBytes() {
            return ByteString.copyFromUtf8(this.buttonTitle_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideV2PopUpOrBuilder
        public long getGiftCount() {
            return this.giftCount_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideV2PopUpOrBuilder
        public String getGiftIcon() {
            return this.giftIcon_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideV2PopUpOrBuilder
        public ByteString getGiftIconBytes() {
            return ByteString.copyFromUtf8(this.giftIcon_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideV2PopUpOrBuilder
        public long getGiftId() {
            return this.giftId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideV2PopUpOrBuilder
        public GuideType getGuideType() {
            GuideType guideTypeForNumber = GuideType.forNumber(this.guideType_);
            return guideTypeForNumber == null ? GuideType.UNRECOGNIZED : guideTypeForNumber;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideV2PopUpOrBuilder
        public int getGuideTypeValue() {
            return this.guideType_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideV2PopUpOrBuilder
        public String getRelationshipType() {
            return this.relationshipType_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideV2PopUpOrBuilder
        public ByteString getRelationshipTypeBytes() {
            return ByteString.copyFromUtf8(this.relationshipType_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideV2PopUpOrBuilder
        public String getRoomId() {
            return this.roomId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideV2PopUpOrBuilder
        public ByteString getRoomIdBytes() {
            return ByteString.copyFromUtf8(this.roomId_);
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iK = !this.userId_.isEmpty() ? CodedOutputStream.K(1, getUserId()) : 0;
            if (!this.roomId_.isEmpty()) {
                iK += CodedOutputStream.K(2, getRoomId());
            }
            if (!this.title_.isEmpty()) {
                iK += CodedOutputStream.K(3, getTitle());
            }
            if (!this.subTitle_.isEmpty()) {
                iK += CodedOutputStream.K(4, getSubTitle());
            }
            if (!this.bubbleTitle_.isEmpty()) {
                iK += CodedOutputStream.K(5, getBubbleTitle());
            }
            if (!this.buttonTitle_.isEmpty()) {
                iK += CodedOutputStream.K(6, getButtonTitle());
            }
            long j = this.giftId_;
            if (j != 0) {
                iK += CodedOutputStream.v(7, j);
            }
            if (!this.giftIcon_.isEmpty()) {
                iK += CodedOutputStream.K(8, getGiftIcon());
            }
            long j2 = this.giftCount_;
            if (j2 != 0) {
                iK += CodedOutputStream.v(9, j2);
            }
            if (this.guideType_ != GuideType.empty.getNumber()) {
                iK += CodedOutputStream.m(10, this.guideType_);
            }
            if (this.toUserInfo_ != null) {
                iK += CodedOutputStream.C(11, getToUserInfo());
            }
            if (this.userTag_ != null) {
                iK += CodedOutputStream.C(12, getUserTag());
            }
            if (!this.relationshipType_.isEmpty()) {
                iK += CodedOutputStream.K(13, getRelationshipType());
            }
            if (!this.bizType_.isEmpty()) {
                iK += CodedOutputStream.K(14, getBizType());
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iK;
            return iK;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideV2PopUpOrBuilder
        public String getSubTitle() {
            return this.subTitle_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideV2PopUpOrBuilder
        public ByteString getSubTitleBytes() {
            return ByteString.copyFromUtf8(this.subTitle_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideV2PopUpOrBuilder
        public String getTitle() {
            return this.title_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideV2PopUpOrBuilder
        public ByteString getTitleBytes() {
            return ByteString.copyFromUtf8(this.title_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideV2PopUpOrBuilder
        public VoicePayGuideUserInfo getToUserInfo() {
            VoicePayGuideUserInfo voicePayGuideUserInfo = this.toUserInfo_;
            return voicePayGuideUserInfo == null ? VoicePayGuideUserInfo.getDefaultInstance() : voicePayGuideUserInfo;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideV2PopUpOrBuilder
        public String getUserId() {
            return this.userId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideV2PopUpOrBuilder
        public ByteString getUserIdBytes() {
            return ByteString.copyFromUtf8(this.userId_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideV2PopUpOrBuilder
        public VoicePayGuideUserTag getUserTag() {
            VoicePayGuideUserTag voicePayGuideUserTag = this.userTag_;
            return voicePayGuideUserTag == null ? VoicePayGuideUserTag.getDefaultInstance() : voicePayGuideUserTag;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideV2PopUpOrBuilder
        public boolean hasToUserInfo() {
            return this.toUserInfo_ != null;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideV2PopUpOrBuilder
        public boolean hasUserTag() {
            return this.userTag_ != null;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.userId_.isEmpty()) {
                codedOutputStream.D0(1, getUserId());
            }
            if (!this.roomId_.isEmpty()) {
                codedOutputStream.D0(2, getRoomId());
            }
            if (!this.title_.isEmpty()) {
                codedOutputStream.D0(3, getTitle());
            }
            if (!this.subTitle_.isEmpty()) {
                codedOutputStream.D0(4, getSubTitle());
            }
            if (!this.bubbleTitle_.isEmpty()) {
                codedOutputStream.D0(5, getBubbleTitle());
            }
            if (!this.buttonTitle_.isEmpty()) {
                codedOutputStream.D0(6, getButtonTitle());
            }
            long j = this.giftId_;
            if (j != 0) {
                codedOutputStream.u0(7, j);
            }
            if (!this.giftIcon_.isEmpty()) {
                codedOutputStream.D0(8, getGiftIcon());
            }
            long j2 = this.giftCount_;
            if (j2 != 0) {
                codedOutputStream.u0(9, j2);
            }
            if (this.guideType_ != GuideType.empty.getNumber()) {
                codedOutputStream.i0(10, this.guideType_);
            }
            if (this.toUserInfo_ != null) {
                codedOutputStream.w0(11, getToUserInfo());
            }
            if (this.userTag_ != null) {
                codedOutputStream.w0(12, getUserTag());
            }
            if (!this.relationshipType_.isEmpty()) {
                codedOutputStream.D0(13, getRelationshipType());
            }
            if (this.bizType_.isEmpty()) {
                return;
            }
            codedOutputStream.D0(14, getBizType());
        }

        public static VoicePayGuideV2PopUp parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (VoicePayGuideV2PopUp) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static VoicePayGuideV2PopUp parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (VoicePayGuideV2PopUp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setToUserInfo(VoicePayGuideUserInfo voicePayGuideUserInfo) {
            voicePayGuideUserInfo.getClass();
            this.toUserInfo_ = voicePayGuideUserInfo;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserTag(VoicePayGuideUserTag voicePayGuideUserTag) {
            voicePayGuideUserTag.getClass();
            this.userTag_ = voicePayGuideUserTag;
        }

        public static final class Builder extends GeneratedMessageLite.b<VoicePayGuideV2PopUp, Builder> implements VoicePayGuideV2PopUpOrBuilder {
            private Builder() {
                super(VoicePayGuideV2PopUp.DEFAULT_INSTANCE);
            }

            public Builder clearBizType() {
                copyOnWrite();
                ((VoicePayGuideV2PopUp) ((GeneratedMessageLite.b) this).instance).clearBizType();
                return this;
            }

            public Builder clearBubbleTitle() {
                copyOnWrite();
                ((VoicePayGuideV2PopUp) ((GeneratedMessageLite.b) this).instance).clearBubbleTitle();
                return this;
            }

            public Builder clearButtonTitle() {
                copyOnWrite();
                ((VoicePayGuideV2PopUp) ((GeneratedMessageLite.b) this).instance).clearButtonTitle();
                return this;
            }

            public Builder clearGiftCount() {
                copyOnWrite();
                ((VoicePayGuideV2PopUp) ((GeneratedMessageLite.b) this).instance).clearGiftCount();
                return this;
            }

            public Builder clearGiftIcon() {
                copyOnWrite();
                ((VoicePayGuideV2PopUp) ((GeneratedMessageLite.b) this).instance).clearGiftIcon();
                return this;
            }

            public Builder clearGiftId() {
                copyOnWrite();
                ((VoicePayGuideV2PopUp) ((GeneratedMessageLite.b) this).instance).clearGiftId();
                return this;
            }

            public Builder clearGuideType() {
                copyOnWrite();
                ((VoicePayGuideV2PopUp) ((GeneratedMessageLite.b) this).instance).clearGuideType();
                return this;
            }

            public Builder clearRelationshipType() {
                copyOnWrite();
                ((VoicePayGuideV2PopUp) ((GeneratedMessageLite.b) this).instance).clearRelationshipType();
                return this;
            }

            public Builder clearRoomId() {
                copyOnWrite();
                ((VoicePayGuideV2PopUp) ((GeneratedMessageLite.b) this).instance).clearRoomId();
                return this;
            }

            public Builder clearSubTitle() {
                copyOnWrite();
                ((VoicePayGuideV2PopUp) ((GeneratedMessageLite.b) this).instance).clearSubTitle();
                return this;
            }

            public Builder clearTitle() {
                copyOnWrite();
                ((VoicePayGuideV2PopUp) ((GeneratedMessageLite.b) this).instance).clearTitle();
                return this;
            }

            public Builder clearToUserInfo() {
                copyOnWrite();
                ((VoicePayGuideV2PopUp) ((GeneratedMessageLite.b) this).instance).clearToUserInfo();
                return this;
            }

            public Builder clearUserId() {
                copyOnWrite();
                ((VoicePayGuideV2PopUp) ((GeneratedMessageLite.b) this).instance).clearUserId();
                return this;
            }

            public Builder clearUserTag() {
                copyOnWrite();
                ((VoicePayGuideV2PopUp) ((GeneratedMessageLite.b) this).instance).clearUserTag();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideV2PopUpOrBuilder
            public String getBizType() {
                return ((VoicePayGuideV2PopUp) ((GeneratedMessageLite.b) this).instance).getBizType();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideV2PopUpOrBuilder
            public ByteString getBizTypeBytes() {
                return ((VoicePayGuideV2PopUp) ((GeneratedMessageLite.b) this).instance).getBizTypeBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideV2PopUpOrBuilder
            public String getBubbleTitle() {
                return ((VoicePayGuideV2PopUp) ((GeneratedMessageLite.b) this).instance).getBubbleTitle();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideV2PopUpOrBuilder
            public ByteString getBubbleTitleBytes() {
                return ((VoicePayGuideV2PopUp) ((GeneratedMessageLite.b) this).instance).getBubbleTitleBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideV2PopUpOrBuilder
            public String getButtonTitle() {
                return ((VoicePayGuideV2PopUp) ((GeneratedMessageLite.b) this).instance).getButtonTitle();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideV2PopUpOrBuilder
            public ByteString getButtonTitleBytes() {
                return ((VoicePayGuideV2PopUp) ((GeneratedMessageLite.b) this).instance).getButtonTitleBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideV2PopUpOrBuilder
            public long getGiftCount() {
                return ((VoicePayGuideV2PopUp) ((GeneratedMessageLite.b) this).instance).getGiftCount();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideV2PopUpOrBuilder
            public String getGiftIcon() {
                return ((VoicePayGuideV2PopUp) ((GeneratedMessageLite.b) this).instance).getGiftIcon();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideV2PopUpOrBuilder
            public ByteString getGiftIconBytes() {
                return ((VoicePayGuideV2PopUp) ((GeneratedMessageLite.b) this).instance).getGiftIconBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideV2PopUpOrBuilder
            public long getGiftId() {
                return ((VoicePayGuideV2PopUp) ((GeneratedMessageLite.b) this).instance).getGiftId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideV2PopUpOrBuilder
            public GuideType getGuideType() {
                return ((VoicePayGuideV2PopUp) ((GeneratedMessageLite.b) this).instance).getGuideType();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideV2PopUpOrBuilder
            public int getGuideTypeValue() {
                return ((VoicePayGuideV2PopUp) ((GeneratedMessageLite.b) this).instance).getGuideTypeValue();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideV2PopUpOrBuilder
            public String getRelationshipType() {
                return ((VoicePayGuideV2PopUp) ((GeneratedMessageLite.b) this).instance).getRelationshipType();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideV2PopUpOrBuilder
            public ByteString getRelationshipTypeBytes() {
                return ((VoicePayGuideV2PopUp) ((GeneratedMessageLite.b) this).instance).getRelationshipTypeBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideV2PopUpOrBuilder
            public String getRoomId() {
                return ((VoicePayGuideV2PopUp) ((GeneratedMessageLite.b) this).instance).getRoomId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideV2PopUpOrBuilder
            public ByteString getRoomIdBytes() {
                return ((VoicePayGuideV2PopUp) ((GeneratedMessageLite.b) this).instance).getRoomIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideV2PopUpOrBuilder
            public String getSubTitle() {
                return ((VoicePayGuideV2PopUp) ((GeneratedMessageLite.b) this).instance).getSubTitle();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideV2PopUpOrBuilder
            public ByteString getSubTitleBytes() {
                return ((VoicePayGuideV2PopUp) ((GeneratedMessageLite.b) this).instance).getSubTitleBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideV2PopUpOrBuilder
            public String getTitle() {
                return ((VoicePayGuideV2PopUp) ((GeneratedMessageLite.b) this).instance).getTitle();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideV2PopUpOrBuilder
            public ByteString getTitleBytes() {
                return ((VoicePayGuideV2PopUp) ((GeneratedMessageLite.b) this).instance).getTitleBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideV2PopUpOrBuilder
            public VoicePayGuideUserInfo getToUserInfo() {
                return ((VoicePayGuideV2PopUp) ((GeneratedMessageLite.b) this).instance).getToUserInfo();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideV2PopUpOrBuilder
            public String getUserId() {
                return ((VoicePayGuideV2PopUp) ((GeneratedMessageLite.b) this).instance).getUserId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideV2PopUpOrBuilder
            public ByteString getUserIdBytes() {
                return ((VoicePayGuideV2PopUp) ((GeneratedMessageLite.b) this).instance).getUserIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideV2PopUpOrBuilder
            public VoicePayGuideUserTag getUserTag() {
                return ((VoicePayGuideV2PopUp) ((GeneratedMessageLite.b) this).instance).getUserTag();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideV2PopUpOrBuilder
            public boolean hasToUserInfo() {
                return ((VoicePayGuideV2PopUp) ((GeneratedMessageLite.b) this).instance).hasToUserInfo();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideV2PopUpOrBuilder
            public boolean hasUserTag() {
                return ((VoicePayGuideV2PopUp) ((GeneratedMessageLite.b) this).instance).hasUserTag();
            }

            public Builder mergeToUserInfo(VoicePayGuideUserInfo voicePayGuideUserInfo) {
                copyOnWrite();
                ((VoicePayGuideV2PopUp) ((GeneratedMessageLite.b) this).instance).mergeToUserInfo(voicePayGuideUserInfo);
                return this;
            }

            public Builder mergeUserTag(VoicePayGuideUserTag voicePayGuideUserTag) {
                copyOnWrite();
                ((VoicePayGuideV2PopUp) ((GeneratedMessageLite.b) this).instance).mergeUserTag(voicePayGuideUserTag);
                return this;
            }

            public Builder setBizType(String str) {
                copyOnWrite();
                ((VoicePayGuideV2PopUp) ((GeneratedMessageLite.b) this).instance).setBizType(str);
                return this;
            }

            public Builder setBizTypeBytes(ByteString byteString) {
                copyOnWrite();
                ((VoicePayGuideV2PopUp) ((GeneratedMessageLite.b) this).instance).setBizTypeBytes(byteString);
                return this;
            }

            public Builder setBubbleTitle(String str) {
                copyOnWrite();
                ((VoicePayGuideV2PopUp) ((GeneratedMessageLite.b) this).instance).setBubbleTitle(str);
                return this;
            }

            public Builder setBubbleTitleBytes(ByteString byteString) {
                copyOnWrite();
                ((VoicePayGuideV2PopUp) ((GeneratedMessageLite.b) this).instance).setBubbleTitleBytes(byteString);
                return this;
            }

            public Builder setButtonTitle(String str) {
                copyOnWrite();
                ((VoicePayGuideV2PopUp) ((GeneratedMessageLite.b) this).instance).setButtonTitle(str);
                return this;
            }

            public Builder setButtonTitleBytes(ByteString byteString) {
                copyOnWrite();
                ((VoicePayGuideV2PopUp) ((GeneratedMessageLite.b) this).instance).setButtonTitleBytes(byteString);
                return this;
            }

            public Builder setGiftCount(long j) {
                copyOnWrite();
                ((VoicePayGuideV2PopUp) ((GeneratedMessageLite.b) this).instance).setGiftCount(j);
                return this;
            }

            public Builder setGiftIcon(String str) {
                copyOnWrite();
                ((VoicePayGuideV2PopUp) ((GeneratedMessageLite.b) this).instance).setGiftIcon(str);
                return this;
            }

            public Builder setGiftIconBytes(ByteString byteString) {
                copyOnWrite();
                ((VoicePayGuideV2PopUp) ((GeneratedMessageLite.b) this).instance).setGiftIconBytes(byteString);
                return this;
            }

            public Builder setGiftId(long j) {
                copyOnWrite();
                ((VoicePayGuideV2PopUp) ((GeneratedMessageLite.b) this).instance).setGiftId(j);
                return this;
            }

            public Builder setGuideType(GuideType guideType) {
                copyOnWrite();
                ((VoicePayGuideV2PopUp) ((GeneratedMessageLite.b) this).instance).setGuideType(guideType);
                return this;
            }

            public Builder setGuideTypeValue(int i) {
                copyOnWrite();
                ((VoicePayGuideV2PopUp) ((GeneratedMessageLite.b) this).instance).setGuideTypeValue(i);
                return this;
            }

            public Builder setRelationshipType(String str) {
                copyOnWrite();
                ((VoicePayGuideV2PopUp) ((GeneratedMessageLite.b) this).instance).setRelationshipType(str);
                return this;
            }

            public Builder setRelationshipTypeBytes(ByteString byteString) {
                copyOnWrite();
                ((VoicePayGuideV2PopUp) ((GeneratedMessageLite.b) this).instance).setRelationshipTypeBytes(byteString);
                return this;
            }

            public Builder setRoomId(String str) {
                copyOnWrite();
                ((VoicePayGuideV2PopUp) ((GeneratedMessageLite.b) this).instance).setRoomId(str);
                return this;
            }

            public Builder setRoomIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoicePayGuideV2PopUp) ((GeneratedMessageLite.b) this).instance).setRoomIdBytes(byteString);
                return this;
            }

            public Builder setSubTitle(String str) {
                copyOnWrite();
                ((VoicePayGuideV2PopUp) ((GeneratedMessageLite.b) this).instance).setSubTitle(str);
                return this;
            }

            public Builder setSubTitleBytes(ByteString byteString) {
                copyOnWrite();
                ((VoicePayGuideV2PopUp) ((GeneratedMessageLite.b) this).instance).setSubTitleBytes(byteString);
                return this;
            }

            public Builder setTitle(String str) {
                copyOnWrite();
                ((VoicePayGuideV2PopUp) ((GeneratedMessageLite.b) this).instance).setTitle(str);
                return this;
            }

            public Builder setTitleBytes(ByteString byteString) {
                copyOnWrite();
                ((VoicePayGuideV2PopUp) ((GeneratedMessageLite.b) this).instance).setTitleBytes(byteString);
                return this;
            }

            public Builder setToUserInfo(VoicePayGuideUserInfo voicePayGuideUserInfo) {
                copyOnWrite();
                ((VoicePayGuideV2PopUp) ((GeneratedMessageLite.b) this).instance).setToUserInfo(voicePayGuideUserInfo);
                return this;
            }

            public Builder setUserId(String str) {
                copyOnWrite();
                ((VoicePayGuideV2PopUp) ((GeneratedMessageLite.b) this).instance).setUserId(str);
                return this;
            }

            public Builder setUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoicePayGuideV2PopUp) ((GeneratedMessageLite.b) this).instance).setUserIdBytes(byteString);
                return this;
            }

            public Builder setUserTag(VoicePayGuideUserTag voicePayGuideUserTag) {
                copyOnWrite();
                ((VoicePayGuideV2PopUp) ((GeneratedMessageLite.b) this).instance).setUserTag(voicePayGuideUserTag);
                return this;
            }

            public Builder setToUserInfo(VoicePayGuideUserInfo.Builder builder) {
                copyOnWrite();
                ((VoicePayGuideV2PopUp) ((GeneratedMessageLite.b) this).instance).setToUserInfo(builder);
                return this;
            }

            public Builder setUserTag(VoicePayGuideUserTag.Builder builder) {
                copyOnWrite();
                ((VoicePayGuideV2PopUp) ((GeneratedMessageLite.b) this).instance).setUserTag(builder);
                return this;
            }
        }

        public static VoicePayGuideV2PopUp parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoicePayGuideV2PopUp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoicePayGuideV2PopUp parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (VoicePayGuideV2PopUp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static VoicePayGuideV2PopUp parseFrom(InputStream inputStream) throws IOException {
            return (VoicePayGuideV2PopUp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoicePayGuideV2PopUp parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (VoicePayGuideV2PopUp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static VoicePayGuideV2PopUp parseFrom(e eVar) throws IOException {
            return (VoicePayGuideV2PopUp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static VoicePayGuideV2PopUp parseFrom(e eVar, h hVar) throws IOException {
            return (VoicePayGuideV2PopUp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public static final class VoiceRoomCover extends GeneratedMessageLite<VoiceRoomCover, Builder> implements VoiceRoomCoverOrBuilder {
        public static final int COVERURL_FIELD_NUMBER = 2;
        private static final VoiceRoomCover DEFAULT_INSTANCE;
        private static volatile i860<VoiceRoomCover> PARSER = null;
        public static final int ROOMID_FIELD_NUMBER = 1;
        private String roomId_ = "";
        private String coverUrl_ = "";

        public static final class Builder extends GeneratedMessageLite.b<VoiceRoomCover, Builder> implements VoiceRoomCoverOrBuilder {
            private Builder() {
                super(VoiceRoomCover.DEFAULT_INSTANCE);
            }

            public Builder clearCoverUrl() {
                copyOnWrite();
                ((VoiceRoomCover) ((GeneratedMessageLite.b) this).instance).clearCoverUrl();
                return this;
            }

            public Builder clearRoomId() {
                copyOnWrite();
                ((VoiceRoomCover) ((GeneratedMessageLite.b) this).instance).clearRoomId();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceRoomCoverOrBuilder
            public String getCoverUrl() {
                return ((VoiceRoomCover) ((GeneratedMessageLite.b) this).instance).getCoverUrl();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceRoomCoverOrBuilder
            public ByteString getCoverUrlBytes() {
                return ((VoiceRoomCover) ((GeneratedMessageLite.b) this).instance).getCoverUrlBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceRoomCoverOrBuilder
            public String getRoomId() {
                return ((VoiceRoomCover) ((GeneratedMessageLite.b) this).instance).getRoomId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceRoomCoverOrBuilder
            public ByteString getRoomIdBytes() {
                return ((VoiceRoomCover) ((GeneratedMessageLite.b) this).instance).getRoomIdBytes();
            }

            public Builder setCoverUrl(String str) {
                copyOnWrite();
                ((VoiceRoomCover) ((GeneratedMessageLite.b) this).instance).setCoverUrl(str);
                return this;
            }

            public Builder setCoverUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceRoomCover) ((GeneratedMessageLite.b) this).instance).setCoverUrlBytes(byteString);
                return this;
            }

            public Builder setRoomId(String str) {
                copyOnWrite();
                ((VoiceRoomCover) ((GeneratedMessageLite.b) this).instance).setRoomId(str);
                return this;
            }

            public Builder setRoomIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceRoomCover) ((GeneratedMessageLite.b) this).instance).setRoomIdBytes(byteString);
                return this;
            }
        }

        static {
            VoiceRoomCover voiceRoomCover = new VoiceRoomCover();
            DEFAULT_INSTANCE = voiceRoomCover;
            voiceRoomCover.makeImmutable();
        }

        private VoiceRoomCover() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCoverUrl() {
            this.coverUrl_ = getDefaultInstance().getCoverUrl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRoomId() {
            this.roomId_ = getDefaultInstance().getRoomId();
        }

        public static VoiceRoomCover getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(VoiceRoomCover voiceRoomCover) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(voiceRoomCover);
        }

        public static VoiceRoomCover parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VoiceRoomCover) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceRoomCover parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VoiceRoomCover) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<VoiceRoomCover> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCoverUrl(String str) {
            str.getClass();
            this.coverUrl_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCoverUrlBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.coverUrl_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRoomId(String str) {
            str.getClass();
            this.roomId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRoomIdBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.roomId_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C04221.f1679xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoiceRoomCover();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    VoiceRoomCover voiceRoomCover = (VoiceRoomCover) obj2;
                    this.roomId_ = hVar.f(!this.roomId_.isEmpty(), this.roomId_, !voiceRoomCover.roomId_.isEmpty(), voiceRoomCover.roomId_);
                    this.coverUrl_ = hVar.f(!this.coverUrl_.isEmpty(), this.coverUrl_, true ^ voiceRoomCover.coverUrl_.isEmpty(), voiceRoomCover.coverUrl_);
                    GeneratedMessageLite.g gVar = GeneratedMessageLite.g.INSTANCE;
                    return this;
                case 6:
                    e eVar = (e) obj;
                    boolean z = false;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            if (iM != 0) {
                                if (iM == 10) {
                                    this.roomId_ = eVar.L();
                                } else if (iM == 18) {
                                    this.coverUrl_ = eVar.L();
                                } else if (!eVar.R(iM)) {
                                }
                            }
                            z = true;
                        } catch (IOException e) {
                            aag0.a(new InvalidProtocolBufferException(e.getMessage()).setUnfinishedMessage(this));
                            return null;
                        } catch (InvalidProtocolBufferException e2) {
                            aag0.a(e2.setUnfinishedMessage(this));
                            return null;
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (PARSER == null) {
                        synchronized (VoiceRoomCover.class) {
                            try {
                                if (PARSER == null) {
                                    PARSER = new GeneratedMessageLite.c(DEFAULT_INSTANCE);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return PARSER;
                default:
                    bz00.a();
                    return null;
            }
            return DEFAULT_INSTANCE;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceRoomCoverOrBuilder
        public String getCoverUrl() {
            return this.coverUrl_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceRoomCoverOrBuilder
        public ByteString getCoverUrlBytes() {
            return ByteString.copyFromUtf8(this.coverUrl_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceRoomCoverOrBuilder
        public String getRoomId() {
            return this.roomId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceRoomCoverOrBuilder
        public ByteString getRoomIdBytes() {
            return ByteString.copyFromUtf8(this.roomId_);
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iK = !this.roomId_.isEmpty() ? CodedOutputStream.K(1, getRoomId()) : 0;
            if (!this.coverUrl_.isEmpty()) {
                iK += CodedOutputStream.K(2, getCoverUrl());
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iK;
            return iK;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.roomId_.isEmpty()) {
                codedOutputStream.D0(1, getRoomId());
            }
            if (this.coverUrl_.isEmpty()) {
                return;
            }
            codedOutputStream.D0(2, getCoverUrl());
        }

        public static VoiceRoomCover parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (VoiceRoomCover) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static VoiceRoomCover parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (VoiceRoomCover) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static VoiceRoomCover parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoiceRoomCover) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoiceRoomCover parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (VoiceRoomCover) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static VoiceRoomCover parseFrom(InputStream inputStream) throws IOException {
            return (VoiceRoomCover) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceRoomCover parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (VoiceRoomCover) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static VoiceRoomCover parseFrom(e eVar) throws IOException {
            return (VoiceRoomCover) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static VoiceRoomCover parseFrom(e eVar, h hVar) throws IOException {
            return (VoiceRoomCover) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public static final class VoiceRoomDissolve extends GeneratedMessageLite<VoiceRoomDissolve, Builder> implements VoiceRoomDissolveOrBuilder {
        private static final VoiceRoomDissolve DEFAULT_INSTANCE;
        private static volatile i860<VoiceRoomDissolve> PARSER = null;
        public static final int ROOMID_FIELD_NUMBER = 2;
        public static final int USERID_FIELD_NUMBER = 1;
        private String userId_ = "";
        private String roomId_ = "";

        public static final class Builder extends GeneratedMessageLite.b<VoiceRoomDissolve, Builder> implements VoiceRoomDissolveOrBuilder {
            private Builder() {
                super(VoiceRoomDissolve.DEFAULT_INSTANCE);
            }

            public Builder clearRoomId() {
                copyOnWrite();
                ((VoiceRoomDissolve) ((GeneratedMessageLite.b) this).instance).clearRoomId();
                return this;
            }

            public Builder clearUserId() {
                copyOnWrite();
                ((VoiceRoomDissolve) ((GeneratedMessageLite.b) this).instance).clearUserId();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceRoomDissolveOrBuilder
            public String getRoomId() {
                return ((VoiceRoomDissolve) ((GeneratedMessageLite.b) this).instance).getRoomId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceRoomDissolveOrBuilder
            public ByteString getRoomIdBytes() {
                return ((VoiceRoomDissolve) ((GeneratedMessageLite.b) this).instance).getRoomIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceRoomDissolveOrBuilder
            public String getUserId() {
                return ((VoiceRoomDissolve) ((GeneratedMessageLite.b) this).instance).getUserId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceRoomDissolveOrBuilder
            public ByteString getUserIdBytes() {
                return ((VoiceRoomDissolve) ((GeneratedMessageLite.b) this).instance).getUserIdBytes();
            }

            public Builder setRoomId(String str) {
                copyOnWrite();
                ((VoiceRoomDissolve) ((GeneratedMessageLite.b) this).instance).setRoomId(str);
                return this;
            }

            public Builder setRoomIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceRoomDissolve) ((GeneratedMessageLite.b) this).instance).setRoomIdBytes(byteString);
                return this;
            }

            public Builder setUserId(String str) {
                copyOnWrite();
                ((VoiceRoomDissolve) ((GeneratedMessageLite.b) this).instance).setUserId(str);
                return this;
            }

            public Builder setUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceRoomDissolve) ((GeneratedMessageLite.b) this).instance).setUserIdBytes(byteString);
                return this;
            }
        }

        static {
            VoiceRoomDissolve voiceRoomDissolve = new VoiceRoomDissolve();
            DEFAULT_INSTANCE = voiceRoomDissolve;
            voiceRoomDissolve.makeImmutable();
        }

        private VoiceRoomDissolve() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRoomId() {
            this.roomId_ = getDefaultInstance().getRoomId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUserId() {
            this.userId_ = getDefaultInstance().getUserId();
        }

        public static VoiceRoomDissolve getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(VoiceRoomDissolve voiceRoomDissolve) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(voiceRoomDissolve);
        }

        public static VoiceRoomDissolve parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VoiceRoomDissolve) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceRoomDissolve parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VoiceRoomDissolve) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<VoiceRoomDissolve> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRoomId(String str) {
            str.getClass();
            this.roomId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRoomIdBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.roomId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserId(String str) {
            str.getClass();
            this.userId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserIdBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.userId_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C04221.f1679xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoiceRoomDissolve();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    VoiceRoomDissolve voiceRoomDissolve = (VoiceRoomDissolve) obj2;
                    this.userId_ = hVar.f(!this.userId_.isEmpty(), this.userId_, !voiceRoomDissolve.userId_.isEmpty(), voiceRoomDissolve.userId_);
                    this.roomId_ = hVar.f(!this.roomId_.isEmpty(), this.roomId_, true ^ voiceRoomDissolve.roomId_.isEmpty(), voiceRoomDissolve.roomId_);
                    GeneratedMessageLite.g gVar = GeneratedMessageLite.g.INSTANCE;
                    return this;
                case 6:
                    e eVar = (e) obj;
                    boolean z = false;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            if (iM != 0) {
                                if (iM == 10) {
                                    this.userId_ = eVar.L();
                                } else if (iM == 18) {
                                    this.roomId_ = eVar.L();
                                } else if (!eVar.R(iM)) {
                                }
                            }
                            z = true;
                        } catch (IOException e) {
                            aag0.a(new InvalidProtocolBufferException(e.getMessage()).setUnfinishedMessage(this));
                            return null;
                        } catch (InvalidProtocolBufferException e2) {
                            aag0.a(e2.setUnfinishedMessage(this));
                            return null;
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (PARSER == null) {
                        synchronized (VoiceRoomDissolve.class) {
                            try {
                                if (PARSER == null) {
                                    PARSER = new GeneratedMessageLite.c(DEFAULT_INSTANCE);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return PARSER;
                default:
                    bz00.a();
                    return null;
            }
            return DEFAULT_INSTANCE;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceRoomDissolveOrBuilder
        public String getRoomId() {
            return this.roomId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceRoomDissolveOrBuilder
        public ByteString getRoomIdBytes() {
            return ByteString.copyFromUtf8(this.roomId_);
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iK = !this.userId_.isEmpty() ? CodedOutputStream.K(1, getUserId()) : 0;
            if (!this.roomId_.isEmpty()) {
                iK += CodedOutputStream.K(2, getRoomId());
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iK;
            return iK;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceRoomDissolveOrBuilder
        public String getUserId() {
            return this.userId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceRoomDissolveOrBuilder
        public ByteString getUserIdBytes() {
            return ByteString.copyFromUtf8(this.userId_);
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.userId_.isEmpty()) {
                codedOutputStream.D0(1, getUserId());
            }
            if (this.roomId_.isEmpty()) {
                return;
            }
            codedOutputStream.D0(2, getRoomId());
        }

        public static VoiceRoomDissolve parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (VoiceRoomDissolve) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static VoiceRoomDissolve parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (VoiceRoomDissolve) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static VoiceRoomDissolve parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoiceRoomDissolve) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoiceRoomDissolve parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (VoiceRoomDissolve) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static VoiceRoomDissolve parseFrom(InputStream inputStream) throws IOException {
            return (VoiceRoomDissolve) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceRoomDissolve parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (VoiceRoomDissolve) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static VoiceRoomDissolve parseFrom(e eVar) throws IOException {
            return (VoiceRoomDissolve) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static VoiceRoomDissolve parseFrom(e eVar, h hVar) throws IOException {
            return (VoiceRoomDissolve) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public static final class VoiceRoomHeatUpdate extends GeneratedMessageLite<VoiceRoomHeatUpdate, Builder> implements VoiceRoomHeatUpdateOrBuilder {
        private static final VoiceRoomHeatUpdate DEFAULT_INSTANCE;
        public static final int HEATICON_FIELD_NUMBER = 4;
        public static final int HEATSVGA_FIELD_NUMBER = 5;
        public static final int HEAT_FIELD_NUMBER = 2;
        private static volatile i860<VoiceRoomHeatUpdate> PARSER = null;
        public static final int ROOMID_FIELD_NUMBER = 1;
        public static final int UPDATEDTIME_FIELD_NUMBER = 3;
        private long heat_;
        private long updatedTime_;
        private String roomId_ = "";
        private String heatIcon_ = "";
        private String heatSvga_ = "";

        public static final class Builder extends GeneratedMessageLite.b<VoiceRoomHeatUpdate, Builder> implements VoiceRoomHeatUpdateOrBuilder {
            private Builder() {
                super(VoiceRoomHeatUpdate.DEFAULT_INSTANCE);
            }

            public Builder clearHeat() {
                copyOnWrite();
                ((VoiceRoomHeatUpdate) ((GeneratedMessageLite.b) this).instance).clearHeat();
                return this;
            }

            public Builder clearHeatIcon() {
                copyOnWrite();
                ((VoiceRoomHeatUpdate) ((GeneratedMessageLite.b) this).instance).clearHeatIcon();
                return this;
            }

            public Builder clearHeatSvga() {
                copyOnWrite();
                ((VoiceRoomHeatUpdate) ((GeneratedMessageLite.b) this).instance).clearHeatSvga();
                return this;
            }

            public Builder clearRoomId() {
                copyOnWrite();
                ((VoiceRoomHeatUpdate) ((GeneratedMessageLite.b) this).instance).clearRoomId();
                return this;
            }

            public Builder clearUpdatedTime() {
                copyOnWrite();
                ((VoiceRoomHeatUpdate) ((GeneratedMessageLite.b) this).instance).clearUpdatedTime();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceRoomHeatUpdateOrBuilder
            public long getHeat() {
                return ((VoiceRoomHeatUpdate) ((GeneratedMessageLite.b) this).instance).getHeat();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceRoomHeatUpdateOrBuilder
            public String getHeatIcon() {
                return ((VoiceRoomHeatUpdate) ((GeneratedMessageLite.b) this).instance).getHeatIcon();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceRoomHeatUpdateOrBuilder
            public ByteString getHeatIconBytes() {
                return ((VoiceRoomHeatUpdate) ((GeneratedMessageLite.b) this).instance).getHeatIconBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceRoomHeatUpdateOrBuilder
            public String getHeatSvga() {
                return ((VoiceRoomHeatUpdate) ((GeneratedMessageLite.b) this).instance).getHeatSvga();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceRoomHeatUpdateOrBuilder
            public ByteString getHeatSvgaBytes() {
                return ((VoiceRoomHeatUpdate) ((GeneratedMessageLite.b) this).instance).getHeatSvgaBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceRoomHeatUpdateOrBuilder
            public String getRoomId() {
                return ((VoiceRoomHeatUpdate) ((GeneratedMessageLite.b) this).instance).getRoomId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceRoomHeatUpdateOrBuilder
            public ByteString getRoomIdBytes() {
                return ((VoiceRoomHeatUpdate) ((GeneratedMessageLite.b) this).instance).getRoomIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceRoomHeatUpdateOrBuilder
            public long getUpdatedTime() {
                return ((VoiceRoomHeatUpdate) ((GeneratedMessageLite.b) this).instance).getUpdatedTime();
            }

            public Builder setHeat(long j) {
                copyOnWrite();
                ((VoiceRoomHeatUpdate) ((GeneratedMessageLite.b) this).instance).setHeat(j);
                return this;
            }

            public Builder setHeatIcon(String str) {
                copyOnWrite();
                ((VoiceRoomHeatUpdate) ((GeneratedMessageLite.b) this).instance).setHeatIcon(str);
                return this;
            }

            public Builder setHeatIconBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceRoomHeatUpdate) ((GeneratedMessageLite.b) this).instance).setHeatIconBytes(byteString);
                return this;
            }

            public Builder setHeatSvga(String str) {
                copyOnWrite();
                ((VoiceRoomHeatUpdate) ((GeneratedMessageLite.b) this).instance).setHeatSvga(str);
                return this;
            }

            public Builder setHeatSvgaBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceRoomHeatUpdate) ((GeneratedMessageLite.b) this).instance).setHeatSvgaBytes(byteString);
                return this;
            }

            public Builder setRoomId(String str) {
                copyOnWrite();
                ((VoiceRoomHeatUpdate) ((GeneratedMessageLite.b) this).instance).setRoomId(str);
                return this;
            }

            public Builder setRoomIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceRoomHeatUpdate) ((GeneratedMessageLite.b) this).instance).setRoomIdBytes(byteString);
                return this;
            }

            public Builder setUpdatedTime(long j) {
                copyOnWrite();
                ((VoiceRoomHeatUpdate) ((GeneratedMessageLite.b) this).instance).setUpdatedTime(j);
                return this;
            }
        }

        static {
            VoiceRoomHeatUpdate voiceRoomHeatUpdate = new VoiceRoomHeatUpdate();
            DEFAULT_INSTANCE = voiceRoomHeatUpdate;
            voiceRoomHeatUpdate.makeImmutable();
        }

        private VoiceRoomHeatUpdate() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHeat() {
            this.heat_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHeatIcon() {
            this.heatIcon_ = getDefaultInstance().getHeatIcon();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHeatSvga() {
            this.heatSvga_ = getDefaultInstance().getHeatSvga();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRoomId() {
            this.roomId_ = getDefaultInstance().getRoomId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUpdatedTime() {
            this.updatedTime_ = 0L;
        }

        public static VoiceRoomHeatUpdate getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(VoiceRoomHeatUpdate voiceRoomHeatUpdate) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(voiceRoomHeatUpdate);
        }

        public static VoiceRoomHeatUpdate parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VoiceRoomHeatUpdate) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceRoomHeatUpdate parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VoiceRoomHeatUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<VoiceRoomHeatUpdate> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHeat(long j) {
            this.heat_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHeatIcon(String str) {
            str.getClass();
            this.heatIcon_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHeatIconBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.heatIcon_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHeatSvga(String str) {
            str.getClass();
            this.heatSvga_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHeatSvgaBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.heatSvga_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRoomId(String str) {
            str.getClass();
            this.roomId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRoomIdBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.roomId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUpdatedTime(long j) {
            this.updatedTime_ = j;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C04221.f1679xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoiceRoomHeatUpdate();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    VoiceRoomHeatUpdate voiceRoomHeatUpdate = (VoiceRoomHeatUpdate) obj2;
                    this.roomId_ = hVar.f(!this.roomId_.isEmpty(), this.roomId_, !voiceRoomHeatUpdate.roomId_.isEmpty(), voiceRoomHeatUpdate.roomId_);
                    long j = this.heat_;
                    boolean z2 = j != 0;
                    long j2 = voiceRoomHeatUpdate.heat_;
                    this.heat_ = hVar.i(z2, j, j2 != 0, j2);
                    long j3 = this.updatedTime_;
                    boolean z3 = j3 != 0;
                    long j4 = voiceRoomHeatUpdate.updatedTime_;
                    this.updatedTime_ = hVar.i(z3, j3, j4 != 0, j4);
                    this.heatIcon_ = hVar.f(!this.heatIcon_.isEmpty(), this.heatIcon_, !voiceRoomHeatUpdate.heatIcon_.isEmpty(), voiceRoomHeatUpdate.heatIcon_);
                    this.heatSvga_ = hVar.f(!this.heatSvga_.isEmpty(), this.heatSvga_, !voiceRoomHeatUpdate.heatSvga_.isEmpty(), voiceRoomHeatUpdate.heatSvga_);
                    GeneratedMessageLite.g gVar = GeneratedMessageLite.g.INSTANCE;
                    return this;
                case 6:
                    e eVar = (e) obj;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            if (iM != 0) {
                                if (iM == 10) {
                                    this.roomId_ = eVar.L();
                                } else if (iM == 16) {
                                    this.heat_ = eVar.v();
                                } else if (iM == 24) {
                                    this.updatedTime_ = eVar.v();
                                } else if (iM == 34) {
                                    this.heatIcon_ = eVar.L();
                                } else if (iM == 42) {
                                    this.heatSvga_ = eVar.L();
                                } else if (!eVar.R(iM)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            aag0.a(e.setUnfinishedMessage(this));
                            return null;
                        } catch (IOException e2) {
                            aag0.a(new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this));
                            return null;
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (PARSER == null) {
                        synchronized (VoiceRoomHeatUpdate.class) {
                            try {
                                if (PARSER == null) {
                                    PARSER = new GeneratedMessageLite.c(DEFAULT_INSTANCE);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return PARSER;
                default:
                    bz00.a();
                    return null;
            }
            return DEFAULT_INSTANCE;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceRoomHeatUpdateOrBuilder
        public long getHeat() {
            return this.heat_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceRoomHeatUpdateOrBuilder
        public String getHeatIcon() {
            return this.heatIcon_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceRoomHeatUpdateOrBuilder
        public ByteString getHeatIconBytes() {
            return ByteString.copyFromUtf8(this.heatIcon_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceRoomHeatUpdateOrBuilder
        public String getHeatSvga() {
            return this.heatSvga_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceRoomHeatUpdateOrBuilder
        public ByteString getHeatSvgaBytes() {
            return ByteString.copyFromUtf8(this.heatSvga_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceRoomHeatUpdateOrBuilder
        public String getRoomId() {
            return this.roomId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceRoomHeatUpdateOrBuilder
        public ByteString getRoomIdBytes() {
            return ByteString.copyFromUtf8(this.roomId_);
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iK = !this.roomId_.isEmpty() ? CodedOutputStream.K(1, getRoomId()) : 0;
            long j = this.heat_;
            if (j != 0) {
                iK += CodedOutputStream.v(2, j);
            }
            long j2 = this.updatedTime_;
            if (j2 != 0) {
                iK += CodedOutputStream.v(3, j2);
            }
            if (!this.heatIcon_.isEmpty()) {
                iK += CodedOutputStream.K(4, getHeatIcon());
            }
            if (!this.heatSvga_.isEmpty()) {
                iK += CodedOutputStream.K(5, getHeatSvga());
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iK;
            return iK;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceRoomHeatUpdateOrBuilder
        public long getUpdatedTime() {
            return this.updatedTime_;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.roomId_.isEmpty()) {
                codedOutputStream.D0(1, getRoomId());
            }
            long j = this.heat_;
            if (j != 0) {
                codedOutputStream.u0(2, j);
            }
            long j2 = this.updatedTime_;
            if (j2 != 0) {
                codedOutputStream.u0(3, j2);
            }
            if (!this.heatIcon_.isEmpty()) {
                codedOutputStream.D0(4, getHeatIcon());
            }
            if (this.heatSvga_.isEmpty()) {
                return;
            }
            codedOutputStream.D0(5, getHeatSvga());
        }

        public static VoiceRoomHeatUpdate parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (VoiceRoomHeatUpdate) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static VoiceRoomHeatUpdate parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (VoiceRoomHeatUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static VoiceRoomHeatUpdate parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoiceRoomHeatUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoiceRoomHeatUpdate parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (VoiceRoomHeatUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static VoiceRoomHeatUpdate parseFrom(InputStream inputStream) throws IOException {
            return (VoiceRoomHeatUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceRoomHeatUpdate parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (VoiceRoomHeatUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static VoiceRoomHeatUpdate parseFrom(e eVar) throws IOException {
            return (VoiceRoomHeatUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static VoiceRoomHeatUpdate parseFrom(e eVar, h hVar) throws IOException {
            return (VoiceRoomHeatUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public static final class VoiceRoomLevelUp extends GeneratedMessageLite<VoiceRoomLevelUp, Builder> implements VoiceRoomLevelUpOrBuilder {
        private static final VoiceRoomLevelUp DEFAULT_INSTANCE;
        public static final int ENDCOLOR_FIELD_NUMBER = 6;
        public static final int LEVELICON_FIELD_NUMBER = 3;
        public static final int LEVELSMALLICON_FIELD_NUMBER = 7;
        public static final int LEVEL_FIELD_NUMBER = 2;
        private static volatile i860<VoiceRoomLevelUp> PARSER = null;
        public static final int ROOMID_FIELD_NUMBER = 1;
        public static final int STARTCOLOR_FIELD_NUMBER = 5;
        public static final int UPDATEDTIME_FIELD_NUMBER = 4;
        private int level_;
        private long updatedTime_;
        private String roomId_ = "";
        private String levelIcon_ = "";
        private String startColor_ = "";
        private String endColor_ = "";
        private String levelSmallIcon_ = "";

        public static final class Builder extends GeneratedMessageLite.b<VoiceRoomLevelUp, Builder> implements VoiceRoomLevelUpOrBuilder {
            private Builder() {
                super(VoiceRoomLevelUp.DEFAULT_INSTANCE);
            }

            public Builder clearEndColor() {
                copyOnWrite();
                ((VoiceRoomLevelUp) ((GeneratedMessageLite.b) this).instance).clearEndColor();
                return this;
            }

            public Builder clearLevel() {
                copyOnWrite();
                ((VoiceRoomLevelUp) ((GeneratedMessageLite.b) this).instance).clearLevel();
                return this;
            }

            public Builder clearLevelIcon() {
                copyOnWrite();
                ((VoiceRoomLevelUp) ((GeneratedMessageLite.b) this).instance).clearLevelIcon();
                return this;
            }

            public Builder clearLevelSmallIcon() {
                copyOnWrite();
                ((VoiceRoomLevelUp) ((GeneratedMessageLite.b) this).instance).clearLevelSmallIcon();
                return this;
            }

            public Builder clearRoomId() {
                copyOnWrite();
                ((VoiceRoomLevelUp) ((GeneratedMessageLite.b) this).instance).clearRoomId();
                return this;
            }

            public Builder clearStartColor() {
                copyOnWrite();
                ((VoiceRoomLevelUp) ((GeneratedMessageLite.b) this).instance).clearStartColor();
                return this;
            }

            public Builder clearUpdatedTime() {
                copyOnWrite();
                ((VoiceRoomLevelUp) ((GeneratedMessageLite.b) this).instance).clearUpdatedTime();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceRoomLevelUpOrBuilder
            public String getEndColor() {
                return ((VoiceRoomLevelUp) ((GeneratedMessageLite.b) this).instance).getEndColor();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceRoomLevelUpOrBuilder
            public ByteString getEndColorBytes() {
                return ((VoiceRoomLevelUp) ((GeneratedMessageLite.b) this).instance).getEndColorBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceRoomLevelUpOrBuilder
            public int getLevel() {
                return ((VoiceRoomLevelUp) ((GeneratedMessageLite.b) this).instance).getLevel();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceRoomLevelUpOrBuilder
            public String getLevelIcon() {
                return ((VoiceRoomLevelUp) ((GeneratedMessageLite.b) this).instance).getLevelIcon();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceRoomLevelUpOrBuilder
            public ByteString getLevelIconBytes() {
                return ((VoiceRoomLevelUp) ((GeneratedMessageLite.b) this).instance).getLevelIconBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceRoomLevelUpOrBuilder
            public String getLevelSmallIcon() {
                return ((VoiceRoomLevelUp) ((GeneratedMessageLite.b) this).instance).getLevelSmallIcon();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceRoomLevelUpOrBuilder
            public ByteString getLevelSmallIconBytes() {
                return ((VoiceRoomLevelUp) ((GeneratedMessageLite.b) this).instance).getLevelSmallIconBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceRoomLevelUpOrBuilder
            public String getRoomId() {
                return ((VoiceRoomLevelUp) ((GeneratedMessageLite.b) this).instance).getRoomId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceRoomLevelUpOrBuilder
            public ByteString getRoomIdBytes() {
                return ((VoiceRoomLevelUp) ((GeneratedMessageLite.b) this).instance).getRoomIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceRoomLevelUpOrBuilder
            public String getStartColor() {
                return ((VoiceRoomLevelUp) ((GeneratedMessageLite.b) this).instance).getStartColor();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceRoomLevelUpOrBuilder
            public ByteString getStartColorBytes() {
                return ((VoiceRoomLevelUp) ((GeneratedMessageLite.b) this).instance).getStartColorBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceRoomLevelUpOrBuilder
            public long getUpdatedTime() {
                return ((VoiceRoomLevelUp) ((GeneratedMessageLite.b) this).instance).getUpdatedTime();
            }

            public Builder setEndColor(String str) {
                copyOnWrite();
                ((VoiceRoomLevelUp) ((GeneratedMessageLite.b) this).instance).setEndColor(str);
                return this;
            }

            public Builder setEndColorBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceRoomLevelUp) ((GeneratedMessageLite.b) this).instance).setEndColorBytes(byteString);
                return this;
            }

            public Builder setLevel(int i) {
                copyOnWrite();
                ((VoiceRoomLevelUp) ((GeneratedMessageLite.b) this).instance).setLevel(i);
                return this;
            }

            public Builder setLevelIcon(String str) {
                copyOnWrite();
                ((VoiceRoomLevelUp) ((GeneratedMessageLite.b) this).instance).setLevelIcon(str);
                return this;
            }

            public Builder setLevelIconBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceRoomLevelUp) ((GeneratedMessageLite.b) this).instance).setLevelIconBytes(byteString);
                return this;
            }

            public Builder setLevelSmallIcon(String str) {
                copyOnWrite();
                ((VoiceRoomLevelUp) ((GeneratedMessageLite.b) this).instance).setLevelSmallIcon(str);
                return this;
            }

            public Builder setLevelSmallIconBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceRoomLevelUp) ((GeneratedMessageLite.b) this).instance).setLevelSmallIconBytes(byteString);
                return this;
            }

            public Builder setRoomId(String str) {
                copyOnWrite();
                ((VoiceRoomLevelUp) ((GeneratedMessageLite.b) this).instance).setRoomId(str);
                return this;
            }

            public Builder setRoomIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceRoomLevelUp) ((GeneratedMessageLite.b) this).instance).setRoomIdBytes(byteString);
                return this;
            }

            public Builder setStartColor(String str) {
                copyOnWrite();
                ((VoiceRoomLevelUp) ((GeneratedMessageLite.b) this).instance).setStartColor(str);
                return this;
            }

            public Builder setStartColorBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceRoomLevelUp) ((GeneratedMessageLite.b) this).instance).setStartColorBytes(byteString);
                return this;
            }

            public Builder setUpdatedTime(long j) {
                copyOnWrite();
                ((VoiceRoomLevelUp) ((GeneratedMessageLite.b) this).instance).setUpdatedTime(j);
                return this;
            }
        }

        static {
            VoiceRoomLevelUp voiceRoomLevelUp = new VoiceRoomLevelUp();
            DEFAULT_INSTANCE = voiceRoomLevelUp;
            voiceRoomLevelUp.makeImmutable();
        }

        private VoiceRoomLevelUp() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEndColor() {
            this.endColor_ = getDefaultInstance().getEndColor();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLevel() {
            this.level_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLevelIcon() {
            this.levelIcon_ = getDefaultInstance().getLevelIcon();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLevelSmallIcon() {
            this.levelSmallIcon_ = getDefaultInstance().getLevelSmallIcon();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRoomId() {
            this.roomId_ = getDefaultInstance().getRoomId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStartColor() {
            this.startColor_ = getDefaultInstance().getStartColor();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUpdatedTime() {
            this.updatedTime_ = 0L;
        }

        public static VoiceRoomLevelUp getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(VoiceRoomLevelUp voiceRoomLevelUp) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(voiceRoomLevelUp);
        }

        public static VoiceRoomLevelUp parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VoiceRoomLevelUp) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceRoomLevelUp parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VoiceRoomLevelUp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<VoiceRoomLevelUp> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEndColor(String str) {
            str.getClass();
            this.endColor_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEndColorBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.endColor_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLevel(int i) {
            this.level_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLevelIcon(String str) {
            str.getClass();
            this.levelIcon_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLevelIconBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.levelIcon_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLevelSmallIcon(String str) {
            str.getClass();
            this.levelSmallIcon_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLevelSmallIconBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.levelSmallIcon_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRoomId(String str) {
            str.getClass();
            this.roomId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRoomIdBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.roomId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStartColor(String str) {
            str.getClass();
            this.startColor_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStartColorBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.startColor_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUpdatedTime(long j) {
            this.updatedTime_ = j;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C04221.f1679xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoiceRoomLevelUp();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    VoiceRoomLevelUp voiceRoomLevelUp = (VoiceRoomLevelUp) obj2;
                    this.roomId_ = hVar.f(!this.roomId_.isEmpty(), this.roomId_, !voiceRoomLevelUp.roomId_.isEmpty(), voiceRoomLevelUp.roomId_);
                    int i = this.level_;
                    boolean z2 = i != 0;
                    int i2 = voiceRoomLevelUp.level_;
                    this.level_ = hVar.e(z2, i, i2 != 0, i2);
                    this.levelIcon_ = hVar.f(!this.levelIcon_.isEmpty(), this.levelIcon_, !voiceRoomLevelUp.levelIcon_.isEmpty(), voiceRoomLevelUp.levelIcon_);
                    long j = this.updatedTime_;
                    boolean z3 = j != 0;
                    long j2 = voiceRoomLevelUp.updatedTime_;
                    this.updatedTime_ = hVar.i(z3, j, j2 != 0, j2);
                    this.startColor_ = hVar.f(!this.startColor_.isEmpty(), this.startColor_, !voiceRoomLevelUp.startColor_.isEmpty(), voiceRoomLevelUp.startColor_);
                    this.endColor_ = hVar.f(!this.endColor_.isEmpty(), this.endColor_, !voiceRoomLevelUp.endColor_.isEmpty(), voiceRoomLevelUp.endColor_);
                    this.levelSmallIcon_ = hVar.f(!this.levelSmallIcon_.isEmpty(), this.levelSmallIcon_, !voiceRoomLevelUp.levelSmallIcon_.isEmpty(), voiceRoomLevelUp.levelSmallIcon_);
                    GeneratedMessageLite.g gVar = GeneratedMessageLite.g.INSTANCE;
                    return this;
                case 6:
                    e eVar = (e) obj;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            if (iM != 0) {
                                if (iM == 10) {
                                    this.roomId_ = eVar.L();
                                } else if (iM == 16) {
                                    this.level_ = eVar.u();
                                } else if (iM == 26) {
                                    this.levelIcon_ = eVar.L();
                                } else if (iM == 32) {
                                    this.updatedTime_ = eVar.v();
                                } else if (iM == 42) {
                                    this.startColor_ = eVar.L();
                                } else if (iM == 50) {
                                    this.endColor_ = eVar.L();
                                } else if (iM == 58) {
                                    this.levelSmallIcon_ = eVar.L();
                                } else if (!eVar.R(iM)) {
                                }
                            }
                            z = true;
                        } catch (IOException e) {
                            aag0.a(new InvalidProtocolBufferException(e.getMessage()).setUnfinishedMessage(this));
                            return null;
                        } catch (InvalidProtocolBufferException e2) {
                            aag0.a(e2.setUnfinishedMessage(this));
                            return null;
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (PARSER == null) {
                        synchronized (VoiceRoomLevelUp.class) {
                            try {
                                if (PARSER == null) {
                                    PARSER = new GeneratedMessageLite.c(DEFAULT_INSTANCE);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return PARSER;
                default:
                    bz00.a();
                    return null;
            }
            return DEFAULT_INSTANCE;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceRoomLevelUpOrBuilder
        public String getEndColor() {
            return this.endColor_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceRoomLevelUpOrBuilder
        public ByteString getEndColorBytes() {
            return ByteString.copyFromUtf8(this.endColor_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceRoomLevelUpOrBuilder
        public int getLevel() {
            return this.level_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceRoomLevelUpOrBuilder
        public String getLevelIcon() {
            return this.levelIcon_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceRoomLevelUpOrBuilder
        public ByteString getLevelIconBytes() {
            return ByteString.copyFromUtf8(this.levelIcon_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceRoomLevelUpOrBuilder
        public String getLevelSmallIcon() {
            return this.levelSmallIcon_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceRoomLevelUpOrBuilder
        public ByteString getLevelSmallIconBytes() {
            return ByteString.copyFromUtf8(this.levelSmallIcon_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceRoomLevelUpOrBuilder
        public String getRoomId() {
            return this.roomId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceRoomLevelUpOrBuilder
        public ByteString getRoomIdBytes() {
            return ByteString.copyFromUtf8(this.roomId_);
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iK = !this.roomId_.isEmpty() ? CodedOutputStream.K(1, getRoomId()) : 0;
            int i2 = this.level_;
            if (i2 != 0) {
                iK += CodedOutputStream.t(2, i2);
            }
            if (!this.levelIcon_.isEmpty()) {
                iK += CodedOutputStream.K(3, getLevelIcon());
            }
            long j = this.updatedTime_;
            if (j != 0) {
                iK += CodedOutputStream.v(4, j);
            }
            if (!this.startColor_.isEmpty()) {
                iK += CodedOutputStream.K(5, getStartColor());
            }
            if (!this.endColor_.isEmpty()) {
                iK += CodedOutputStream.K(6, getEndColor());
            }
            if (!this.levelSmallIcon_.isEmpty()) {
                iK += CodedOutputStream.K(7, getLevelSmallIcon());
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iK;
            return iK;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceRoomLevelUpOrBuilder
        public String getStartColor() {
            return this.startColor_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceRoomLevelUpOrBuilder
        public ByteString getStartColorBytes() {
            return ByteString.copyFromUtf8(this.startColor_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceRoomLevelUpOrBuilder
        public long getUpdatedTime() {
            return this.updatedTime_;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.roomId_.isEmpty()) {
                codedOutputStream.D0(1, getRoomId());
            }
            int i = this.level_;
            if (i != 0) {
                codedOutputStream.s0(2, i);
            }
            if (!this.levelIcon_.isEmpty()) {
                codedOutputStream.D0(3, getLevelIcon());
            }
            long j = this.updatedTime_;
            if (j != 0) {
                codedOutputStream.u0(4, j);
            }
            if (!this.startColor_.isEmpty()) {
                codedOutputStream.D0(5, getStartColor());
            }
            if (!this.endColor_.isEmpty()) {
                codedOutputStream.D0(6, getEndColor());
            }
            if (this.levelSmallIcon_.isEmpty()) {
                return;
            }
            codedOutputStream.D0(7, getLevelSmallIcon());
        }

        public static VoiceRoomLevelUp parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (VoiceRoomLevelUp) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static VoiceRoomLevelUp parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (VoiceRoomLevelUp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static VoiceRoomLevelUp parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoiceRoomLevelUp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoiceRoomLevelUp parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (VoiceRoomLevelUp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static VoiceRoomLevelUp parseFrom(InputStream inputStream) throws IOException {
            return (VoiceRoomLevelUp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceRoomLevelUp parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (VoiceRoomLevelUp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static VoiceRoomLevelUp parseFrom(e eVar) throws IOException {
            return (VoiceRoomLevelUp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static VoiceRoomLevelUp parseFrom(e eVar, h hVar) throws IOException {
            return (VoiceRoomLevelUp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public static final class VoiceRoomPersonalUpdate extends GeneratedMessageLite<VoiceRoomPersonalUpdate, Builder> implements VoiceRoomPersonalUpdateOrBuilder {
        private static final VoiceRoomPersonalUpdate DEFAULT_INSTANCE;
        public static final int ISPERSONAL_FIELD_NUMBER = 2;
        private static volatile i860<VoiceRoomPersonalUpdate> PARSER = null;
        public static final int ROOMID_FIELD_NUMBER = 1;
        private boolean isPersonal_;
        private String roomId_ = "";

        public static final class Builder extends GeneratedMessageLite.b<VoiceRoomPersonalUpdate, Builder> implements VoiceRoomPersonalUpdateOrBuilder {
            private Builder() {
                super(VoiceRoomPersonalUpdate.DEFAULT_INSTANCE);
            }

            public Builder clearIsPersonal() {
                copyOnWrite();
                ((VoiceRoomPersonalUpdate) ((GeneratedMessageLite.b) this).instance).clearIsPersonal();
                return this;
            }

            public Builder clearRoomId() {
                copyOnWrite();
                ((VoiceRoomPersonalUpdate) ((GeneratedMessageLite.b) this).instance).clearRoomId();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceRoomPersonalUpdateOrBuilder
            public boolean getIsPersonal() {
                return ((VoiceRoomPersonalUpdate) ((GeneratedMessageLite.b) this).instance).getIsPersonal();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceRoomPersonalUpdateOrBuilder
            public String getRoomId() {
                return ((VoiceRoomPersonalUpdate) ((GeneratedMessageLite.b) this).instance).getRoomId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceRoomPersonalUpdateOrBuilder
            public ByteString getRoomIdBytes() {
                return ((VoiceRoomPersonalUpdate) ((GeneratedMessageLite.b) this).instance).getRoomIdBytes();
            }

            public Builder setIsPersonal(boolean z) {
                copyOnWrite();
                ((VoiceRoomPersonalUpdate) ((GeneratedMessageLite.b) this).instance).setIsPersonal(z);
                return this;
            }

            public Builder setRoomId(String str) {
                copyOnWrite();
                ((VoiceRoomPersonalUpdate) ((GeneratedMessageLite.b) this).instance).setRoomId(str);
                return this;
            }

            public Builder setRoomIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceRoomPersonalUpdate) ((GeneratedMessageLite.b) this).instance).setRoomIdBytes(byteString);
                return this;
            }
        }

        static {
            VoiceRoomPersonalUpdate voiceRoomPersonalUpdate = new VoiceRoomPersonalUpdate();
            DEFAULT_INSTANCE = voiceRoomPersonalUpdate;
            voiceRoomPersonalUpdate.makeImmutable();
        }

        private VoiceRoomPersonalUpdate() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIsPersonal() {
            this.isPersonal_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRoomId() {
            this.roomId_ = getDefaultInstance().getRoomId();
        }

        public static VoiceRoomPersonalUpdate getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(VoiceRoomPersonalUpdate voiceRoomPersonalUpdate) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(voiceRoomPersonalUpdate);
        }

        public static VoiceRoomPersonalUpdate parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VoiceRoomPersonalUpdate) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceRoomPersonalUpdate parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VoiceRoomPersonalUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<VoiceRoomPersonalUpdate> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIsPersonal(boolean z) {
            this.isPersonal_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRoomId(String str) {
            str.getClass();
            this.roomId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRoomIdBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.roomId_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C04221.f1679xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoiceRoomPersonalUpdate();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    VoiceRoomPersonalUpdate voiceRoomPersonalUpdate = (VoiceRoomPersonalUpdate) obj2;
                    this.roomId_ = hVar.f(!this.roomId_.isEmpty(), this.roomId_, true ^ voiceRoomPersonalUpdate.roomId_.isEmpty(), voiceRoomPersonalUpdate.roomId_);
                    boolean z = this.isPersonal_;
                    boolean z2 = voiceRoomPersonalUpdate.isPersonal_;
                    this.isPersonal_ = hVar.d(z, z, z2, z2);
                    GeneratedMessageLite.g gVar = GeneratedMessageLite.g.INSTANCE;
                    return this;
                case 6:
                    e eVar = (e) obj;
                    boolean z3 = false;
                    while (!z3) {
                        try {
                            int iM = eVar.M();
                            if (iM != 0) {
                                if (iM == 10) {
                                    this.roomId_ = eVar.L();
                                } else if (iM == 16) {
                                    this.isPersonal_ = eVar.m();
                                } else if (!eVar.R(iM)) {
                                }
                            }
                            z3 = true;
                        } catch (IOException e) {
                            aag0.a(new InvalidProtocolBufferException(e.getMessage()).setUnfinishedMessage(this));
                            return null;
                        } catch (InvalidProtocolBufferException e2) {
                            aag0.a(e2.setUnfinishedMessage(this));
                            return null;
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (PARSER == null) {
                        synchronized (VoiceRoomPersonalUpdate.class) {
                            try {
                                if (PARSER == null) {
                                    PARSER = new GeneratedMessageLite.c(DEFAULT_INSTANCE);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return PARSER;
                default:
                    bz00.a();
                    return null;
            }
            return DEFAULT_INSTANCE;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceRoomPersonalUpdateOrBuilder
        public boolean getIsPersonal() {
            return this.isPersonal_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceRoomPersonalUpdateOrBuilder
        public String getRoomId() {
            return this.roomId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceRoomPersonalUpdateOrBuilder
        public ByteString getRoomIdBytes() {
            return ByteString.copyFromUtf8(this.roomId_);
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iK = !this.roomId_.isEmpty() ? CodedOutputStream.K(1, getRoomId()) : 0;
            boolean z = this.isPersonal_;
            if (z) {
                iK += CodedOutputStream.f(2, z);
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iK;
            return iK;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.roomId_.isEmpty()) {
                codedOutputStream.D0(1, getRoomId());
            }
            boolean z = this.isPersonal_;
            if (z) {
                codedOutputStream.a0(2, z);
            }
        }

        public static VoiceRoomPersonalUpdate parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (VoiceRoomPersonalUpdate) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static VoiceRoomPersonalUpdate parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (VoiceRoomPersonalUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static VoiceRoomPersonalUpdate parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoiceRoomPersonalUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoiceRoomPersonalUpdate parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (VoiceRoomPersonalUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static VoiceRoomPersonalUpdate parseFrom(InputStream inputStream) throws IOException {
            return (VoiceRoomPersonalUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceRoomPersonalUpdate parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (VoiceRoomPersonalUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static VoiceRoomPersonalUpdate parseFrom(e eVar) throws IOException {
            return (VoiceRoomPersonalUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static VoiceRoomPersonalUpdate parseFrom(e eVar, h hVar) throws IOException {
            return (VoiceRoomPersonalUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public static final class VoiceRoomTitleUpdate extends GeneratedMessageLite<VoiceRoomTitleUpdate, Builder> implements VoiceRoomTitleUpdateOrBuilder {
        private static final VoiceRoomTitleUpdate DEFAULT_INSTANCE;
        private static volatile i860<VoiceRoomTitleUpdate> PARSER = null;
        public static final int ROOMID_FIELD_NUMBER = 1;
        public static final int TEMPDATA_FIELD_NUMBER = 2;
        public static final int TITLE_FIELD_NUMBER = 3;
        private Template.TemplateData tempdata_;
        private String roomId_ = "";
        private String title_ = "";

        static {
            VoiceRoomTitleUpdate voiceRoomTitleUpdate = new VoiceRoomTitleUpdate();
            DEFAULT_INSTANCE = voiceRoomTitleUpdate;
            voiceRoomTitleUpdate.makeImmutable();
        }

        private VoiceRoomTitleUpdate() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRoomId() {
            this.roomId_ = getDefaultInstance().getRoomId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTempdata() {
            this.tempdata_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTitle() {
            this.title_ = getDefaultInstance().getTitle();
        }

        public static VoiceRoomTitleUpdate getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeTempdata(Template.TemplateData templateData) {
            Template.TemplateData templateData2 = this.tempdata_;
            if (templateData2 == null || templateData2 == Template.TemplateData.getDefaultInstance()) {
                this.tempdata_ = templateData;
            } else {
                this.tempdata_ = (Template.TemplateData) ((Template.TemplateData.Builder) Template.TemplateData.newBuilder(this.tempdata_).mergeFrom(templateData)).buildPartial();
            }
        }

        public static Builder newBuilder(VoiceRoomTitleUpdate voiceRoomTitleUpdate) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(voiceRoomTitleUpdate);
        }

        public static VoiceRoomTitleUpdate parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VoiceRoomTitleUpdate) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceRoomTitleUpdate parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VoiceRoomTitleUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<VoiceRoomTitleUpdate> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRoomId(String str) {
            str.getClass();
            this.roomId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRoomIdBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.roomId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTempdata(Template.TemplateData.Builder builder) {
            this.tempdata_ = (Template.TemplateData) builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTitle(String str) {
            str.getClass();
            this.title_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTitleBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.title_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C04221.f1679xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoiceRoomTitleUpdate();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    VoiceRoomTitleUpdate voiceRoomTitleUpdate = (VoiceRoomTitleUpdate) obj2;
                    this.roomId_ = hVar.f(!this.roomId_.isEmpty(), this.roomId_, !voiceRoomTitleUpdate.roomId_.isEmpty(), voiceRoomTitleUpdate.roomId_);
                    this.tempdata_ = hVar.o(this.tempdata_, voiceRoomTitleUpdate.tempdata_);
                    this.title_ = hVar.f(!this.title_.isEmpty(), this.title_, true ^ voiceRoomTitleUpdate.title_.isEmpty(), voiceRoomTitleUpdate.title_);
                    GeneratedMessageLite.g gVar = GeneratedMessageLite.g.INSTANCE;
                    return this;
                case 6:
                    e eVar = (e) obj;
                    h hVar2 = (h) obj2;
                    boolean z = false;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            if (iM != 0) {
                                if (iM == 10) {
                                    this.roomId_ = eVar.L();
                                } else if (iM == 18) {
                                    Template.TemplateData templateData = this.tempdata_;
                                    Template.TemplateData.Builder builder = templateData != null ? (Template.TemplateData.Builder) templateData.toBuilder() : null;
                                    Template.TemplateData templateDataW = eVar.w(Template.TemplateData.parser(), hVar2);
                                    this.tempdata_ = templateDataW;
                                    if (builder != null) {
                                        builder.mergeFrom(templateDataW);
                                        this.tempdata_ = (Template.TemplateData) builder.buildPartial();
                                    }
                                } else if (iM == 26) {
                                    this.title_ = eVar.L();
                                } else if (!eVar.R(iM)) {
                                }
                            }
                            z = true;
                        } catch (IOException e) {
                            aag0.a(new InvalidProtocolBufferException(e.getMessage()).setUnfinishedMessage(this));
                            return null;
                        } catch (InvalidProtocolBufferException e2) {
                            aag0.a(e2.setUnfinishedMessage(this));
                            return null;
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (PARSER == null) {
                        synchronized (VoiceRoomTitleUpdate.class) {
                            try {
                                if (PARSER == null) {
                                    PARSER = new GeneratedMessageLite.c(DEFAULT_INSTANCE);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return PARSER;
                default:
                    bz00.a();
                    return null;
            }
            return DEFAULT_INSTANCE;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceRoomTitleUpdateOrBuilder
        public String getRoomId() {
            return this.roomId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceRoomTitleUpdateOrBuilder
        public ByteString getRoomIdBytes() {
            return ByteString.copyFromUtf8(this.roomId_);
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iK = !this.roomId_.isEmpty() ? CodedOutputStream.K(1, getRoomId()) : 0;
            if (this.tempdata_ != null) {
                iK += CodedOutputStream.C(2, getTempdata());
            }
            if (!this.title_.isEmpty()) {
                iK += CodedOutputStream.K(3, getTitle());
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iK;
            return iK;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceRoomTitleUpdateOrBuilder
        public Template.TemplateData getTempdata() {
            Template.TemplateData templateData = this.tempdata_;
            return templateData == null ? Template.TemplateData.getDefaultInstance() : templateData;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceRoomTitleUpdateOrBuilder
        public String getTitle() {
            return this.title_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceRoomTitleUpdateOrBuilder
        public ByteString getTitleBytes() {
            return ByteString.copyFromUtf8(this.title_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceRoomTitleUpdateOrBuilder
        public boolean hasTempdata() {
            return this.tempdata_ != null;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.roomId_.isEmpty()) {
                codedOutputStream.D0(1, getRoomId());
            }
            if (this.tempdata_ != null) {
                codedOutputStream.w0(2, getTempdata());
            }
            if (this.title_.isEmpty()) {
                return;
            }
            codedOutputStream.D0(3, getTitle());
        }

        public static VoiceRoomTitleUpdate parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (VoiceRoomTitleUpdate) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static VoiceRoomTitleUpdate parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (VoiceRoomTitleUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTempdata(Template.TemplateData templateData) {
            templateData.getClass();
            this.tempdata_ = templateData;
        }

        public static final class Builder extends GeneratedMessageLite.b<VoiceRoomTitleUpdate, Builder> implements VoiceRoomTitleUpdateOrBuilder {
            private Builder() {
                super(VoiceRoomTitleUpdate.DEFAULT_INSTANCE);
            }

            public Builder clearRoomId() {
                copyOnWrite();
                ((VoiceRoomTitleUpdate) ((GeneratedMessageLite.b) this).instance).clearRoomId();
                return this;
            }

            public Builder clearTempdata() {
                copyOnWrite();
                ((VoiceRoomTitleUpdate) ((GeneratedMessageLite.b) this).instance).clearTempdata();
                return this;
            }

            public Builder clearTitle() {
                copyOnWrite();
                ((VoiceRoomTitleUpdate) ((GeneratedMessageLite.b) this).instance).clearTitle();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceRoomTitleUpdateOrBuilder
            public String getRoomId() {
                return ((VoiceRoomTitleUpdate) ((GeneratedMessageLite.b) this).instance).getRoomId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceRoomTitleUpdateOrBuilder
            public ByteString getRoomIdBytes() {
                return ((VoiceRoomTitleUpdate) ((GeneratedMessageLite.b) this).instance).getRoomIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceRoomTitleUpdateOrBuilder
            public Template.TemplateData getTempdata() {
                return ((VoiceRoomTitleUpdate) ((GeneratedMessageLite.b) this).instance).getTempdata();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceRoomTitleUpdateOrBuilder
            public String getTitle() {
                return ((VoiceRoomTitleUpdate) ((GeneratedMessageLite.b) this).instance).getTitle();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceRoomTitleUpdateOrBuilder
            public ByteString getTitleBytes() {
                return ((VoiceRoomTitleUpdate) ((GeneratedMessageLite.b) this).instance).getTitleBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceRoomTitleUpdateOrBuilder
            public boolean hasTempdata() {
                return ((VoiceRoomTitleUpdate) ((GeneratedMessageLite.b) this).instance).hasTempdata();
            }

            public Builder mergeTempdata(Template.TemplateData templateData) {
                copyOnWrite();
                ((VoiceRoomTitleUpdate) ((GeneratedMessageLite.b) this).instance).mergeTempdata(templateData);
                return this;
            }

            public Builder setRoomId(String str) {
                copyOnWrite();
                ((VoiceRoomTitleUpdate) ((GeneratedMessageLite.b) this).instance).setRoomId(str);
                return this;
            }

            public Builder setRoomIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceRoomTitleUpdate) ((GeneratedMessageLite.b) this).instance).setRoomIdBytes(byteString);
                return this;
            }

            public Builder setTempdata(Template.TemplateData templateData) {
                copyOnWrite();
                ((VoiceRoomTitleUpdate) ((GeneratedMessageLite.b) this).instance).setTempdata(templateData);
                return this;
            }

            public Builder setTitle(String str) {
                copyOnWrite();
                ((VoiceRoomTitleUpdate) ((GeneratedMessageLite.b) this).instance).setTitle(str);
                return this;
            }

            public Builder setTitleBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceRoomTitleUpdate) ((GeneratedMessageLite.b) this).instance).setTitleBytes(byteString);
                return this;
            }

            public Builder setTempdata(Template.TemplateData.Builder builder) {
                copyOnWrite();
                ((VoiceRoomTitleUpdate) ((GeneratedMessageLite.b) this).instance).setTempdata(builder);
                return this;
            }
        }

        public static VoiceRoomTitleUpdate parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoiceRoomTitleUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoiceRoomTitleUpdate parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (VoiceRoomTitleUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static VoiceRoomTitleUpdate parseFrom(InputStream inputStream) throws IOException {
            return (VoiceRoomTitleUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceRoomTitleUpdate parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (VoiceRoomTitleUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static VoiceRoomTitleUpdate parseFrom(e eVar) throws IOException {
            return (VoiceRoomTitleUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static VoiceRoomTitleUpdate parseFrom(e eVar, h hVar) throws IOException {
            return (VoiceRoomTitleUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public static final class VoiceSettleInviteMessage extends GeneratedMessageLite<VoiceSettleInviteMessage, Builder> implements VoiceSettleInviteMessageOrBuilder {
        public static final int APPLYTOKEN_FIELD_NUMBER = 5;
        private static final VoiceSettleInviteMessage DEFAULT_INSTANCE;
        public static final int FROMUSERID_FIELD_NUMBER = 1;
        public static final int FROMUSERNAME_FIELD_NUMBER = 2;
        private static volatile i860<VoiceSettleInviteMessage> PARSER = null;
        public static final int ROOMID_FIELD_NUMBER = 4;
        public static final int USERID_FIELD_NUMBER = 3;
        private String fromUserId_ = "";
        private String fromUserName_ = "";
        private String userId_ = "";
        private String roomId_ = "";
        private String applyToken_ = "";

        public static final class Builder extends GeneratedMessageLite.b<VoiceSettleInviteMessage, Builder> implements VoiceSettleInviteMessageOrBuilder {
            private Builder() {
                super(VoiceSettleInviteMessage.DEFAULT_INSTANCE);
            }

            public Builder clearApplyToken() {
                copyOnWrite();
                ((VoiceSettleInviteMessage) ((GeneratedMessageLite.b) this).instance).clearApplyToken();
                return this;
            }

            public Builder clearFromUserId() {
                copyOnWrite();
                ((VoiceSettleInviteMessage) ((GeneratedMessageLite.b) this).instance).clearFromUserId();
                return this;
            }

            public Builder clearFromUserName() {
                copyOnWrite();
                ((VoiceSettleInviteMessage) ((GeneratedMessageLite.b) this).instance).clearFromUserName();
                return this;
            }

            public Builder clearRoomId() {
                copyOnWrite();
                ((VoiceSettleInviteMessage) ((GeneratedMessageLite.b) this).instance).clearRoomId();
                return this;
            }

            public Builder clearUserId() {
                copyOnWrite();
                ((VoiceSettleInviteMessage) ((GeneratedMessageLite.b) this).instance).clearUserId();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceSettleInviteMessageOrBuilder
            public String getApplyToken() {
                return ((VoiceSettleInviteMessage) ((GeneratedMessageLite.b) this).instance).getApplyToken();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceSettleInviteMessageOrBuilder
            public ByteString getApplyTokenBytes() {
                return ((VoiceSettleInviteMessage) ((GeneratedMessageLite.b) this).instance).getApplyTokenBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceSettleInviteMessageOrBuilder
            public String getFromUserId() {
                return ((VoiceSettleInviteMessage) ((GeneratedMessageLite.b) this).instance).getFromUserId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceSettleInviteMessageOrBuilder
            public ByteString getFromUserIdBytes() {
                return ((VoiceSettleInviteMessage) ((GeneratedMessageLite.b) this).instance).getFromUserIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceSettleInviteMessageOrBuilder
            public String getFromUserName() {
                return ((VoiceSettleInviteMessage) ((GeneratedMessageLite.b) this).instance).getFromUserName();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceSettleInviteMessageOrBuilder
            public ByteString getFromUserNameBytes() {
                return ((VoiceSettleInviteMessage) ((GeneratedMessageLite.b) this).instance).getFromUserNameBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceSettleInviteMessageOrBuilder
            public String getRoomId() {
                return ((VoiceSettleInviteMessage) ((GeneratedMessageLite.b) this).instance).getRoomId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceSettleInviteMessageOrBuilder
            public ByteString getRoomIdBytes() {
                return ((VoiceSettleInviteMessage) ((GeneratedMessageLite.b) this).instance).getRoomIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceSettleInviteMessageOrBuilder
            public String getUserId() {
                return ((VoiceSettleInviteMessage) ((GeneratedMessageLite.b) this).instance).getUserId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceSettleInviteMessageOrBuilder
            public ByteString getUserIdBytes() {
                return ((VoiceSettleInviteMessage) ((GeneratedMessageLite.b) this).instance).getUserIdBytes();
            }

            public Builder setApplyToken(String str) {
                copyOnWrite();
                ((VoiceSettleInviteMessage) ((GeneratedMessageLite.b) this).instance).setApplyToken(str);
                return this;
            }

            public Builder setApplyTokenBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceSettleInviteMessage) ((GeneratedMessageLite.b) this).instance).setApplyTokenBytes(byteString);
                return this;
            }

            public Builder setFromUserId(String str) {
                copyOnWrite();
                ((VoiceSettleInviteMessage) ((GeneratedMessageLite.b) this).instance).setFromUserId(str);
                return this;
            }

            public Builder setFromUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceSettleInviteMessage) ((GeneratedMessageLite.b) this).instance).setFromUserIdBytes(byteString);
                return this;
            }

            public Builder setFromUserName(String str) {
                copyOnWrite();
                ((VoiceSettleInviteMessage) ((GeneratedMessageLite.b) this).instance).setFromUserName(str);
                return this;
            }

            public Builder setFromUserNameBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceSettleInviteMessage) ((GeneratedMessageLite.b) this).instance).setFromUserNameBytes(byteString);
                return this;
            }

            public Builder setRoomId(String str) {
                copyOnWrite();
                ((VoiceSettleInviteMessage) ((GeneratedMessageLite.b) this).instance).setRoomId(str);
                return this;
            }

            public Builder setRoomIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceSettleInviteMessage) ((GeneratedMessageLite.b) this).instance).setRoomIdBytes(byteString);
                return this;
            }

            public Builder setUserId(String str) {
                copyOnWrite();
                ((VoiceSettleInviteMessage) ((GeneratedMessageLite.b) this).instance).setUserId(str);
                return this;
            }

            public Builder setUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceSettleInviteMessage) ((GeneratedMessageLite.b) this).instance).setUserIdBytes(byteString);
                return this;
            }
        }

        static {
            VoiceSettleInviteMessage voiceSettleInviteMessage = new VoiceSettleInviteMessage();
            DEFAULT_INSTANCE = voiceSettleInviteMessage;
            voiceSettleInviteMessage.makeImmutable();
        }

        private VoiceSettleInviteMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearApplyToken() {
            this.applyToken_ = getDefaultInstance().getApplyToken();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFromUserId() {
            this.fromUserId_ = getDefaultInstance().getFromUserId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFromUserName() {
            this.fromUserName_ = getDefaultInstance().getFromUserName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRoomId() {
            this.roomId_ = getDefaultInstance().getRoomId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUserId() {
            this.userId_ = getDefaultInstance().getUserId();
        }

        public static VoiceSettleInviteMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(VoiceSettleInviteMessage voiceSettleInviteMessage) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(voiceSettleInviteMessage);
        }

        public static VoiceSettleInviteMessage parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VoiceSettleInviteMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceSettleInviteMessage parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VoiceSettleInviteMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<VoiceSettleInviteMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setApplyToken(String str) {
            str.getClass();
            this.applyToken_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setApplyTokenBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.applyToken_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFromUserId(String str) {
            str.getClass();
            this.fromUserId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFromUserIdBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.fromUserId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFromUserName(String str) {
            str.getClass();
            this.fromUserName_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFromUserNameBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.fromUserName_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRoomId(String str) {
            str.getClass();
            this.roomId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRoomIdBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.roomId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserId(String str) {
            str.getClass();
            this.userId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserIdBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.userId_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C04221.f1679xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoiceSettleInviteMessage();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    VoiceSettleInviteMessage voiceSettleInviteMessage = (VoiceSettleInviteMessage) obj2;
                    this.fromUserId_ = hVar.f(!this.fromUserId_.isEmpty(), this.fromUserId_, !voiceSettleInviteMessage.fromUserId_.isEmpty(), voiceSettleInviteMessage.fromUserId_);
                    this.fromUserName_ = hVar.f(!this.fromUserName_.isEmpty(), this.fromUserName_, !voiceSettleInviteMessage.fromUserName_.isEmpty(), voiceSettleInviteMessage.fromUserName_);
                    this.userId_ = hVar.f(!this.userId_.isEmpty(), this.userId_, !voiceSettleInviteMessage.userId_.isEmpty(), voiceSettleInviteMessage.userId_);
                    this.roomId_ = hVar.f(!this.roomId_.isEmpty(), this.roomId_, !voiceSettleInviteMessage.roomId_.isEmpty(), voiceSettleInviteMessage.roomId_);
                    this.applyToken_ = hVar.f(!this.applyToken_.isEmpty(), this.applyToken_, true ^ voiceSettleInviteMessage.applyToken_.isEmpty(), voiceSettleInviteMessage.applyToken_);
                    GeneratedMessageLite.g gVar = GeneratedMessageLite.g.INSTANCE;
                    return this;
                case 6:
                    e eVar = (e) obj;
                    boolean z = false;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            if (iM != 0) {
                                if (iM == 10) {
                                    this.fromUserId_ = eVar.L();
                                } else if (iM == 18) {
                                    this.fromUserName_ = eVar.L();
                                } else if (iM == 26) {
                                    this.userId_ = eVar.L();
                                } else if (iM == 34) {
                                    this.roomId_ = eVar.L();
                                } else if (iM == 42) {
                                    this.applyToken_ = eVar.L();
                                } else if (!eVar.R(iM)) {
                                }
                            }
                            z = true;
                        } catch (IOException e) {
                            aag0.a(new InvalidProtocolBufferException(e.getMessage()).setUnfinishedMessage(this));
                            return null;
                        } catch (InvalidProtocolBufferException e2) {
                            aag0.a(e2.setUnfinishedMessage(this));
                            return null;
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (PARSER == null) {
                        synchronized (VoiceSettleInviteMessage.class) {
                            try {
                                if (PARSER == null) {
                                    PARSER = new GeneratedMessageLite.c(DEFAULT_INSTANCE);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return PARSER;
                default:
                    bz00.a();
                    return null;
            }
            return DEFAULT_INSTANCE;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceSettleInviteMessageOrBuilder
        public String getApplyToken() {
            return this.applyToken_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceSettleInviteMessageOrBuilder
        public ByteString getApplyTokenBytes() {
            return ByteString.copyFromUtf8(this.applyToken_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceSettleInviteMessageOrBuilder
        public String getFromUserId() {
            return this.fromUserId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceSettleInviteMessageOrBuilder
        public ByteString getFromUserIdBytes() {
            return ByteString.copyFromUtf8(this.fromUserId_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceSettleInviteMessageOrBuilder
        public String getFromUserName() {
            return this.fromUserName_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceSettleInviteMessageOrBuilder
        public ByteString getFromUserNameBytes() {
            return ByteString.copyFromUtf8(this.fromUserName_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceSettleInviteMessageOrBuilder
        public String getRoomId() {
            return this.roomId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceSettleInviteMessageOrBuilder
        public ByteString getRoomIdBytes() {
            return ByteString.copyFromUtf8(this.roomId_);
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iK = !this.fromUserId_.isEmpty() ? CodedOutputStream.K(1, getFromUserId()) : 0;
            if (!this.fromUserName_.isEmpty()) {
                iK += CodedOutputStream.K(2, getFromUserName());
            }
            if (!this.userId_.isEmpty()) {
                iK += CodedOutputStream.K(3, getUserId());
            }
            if (!this.roomId_.isEmpty()) {
                iK += CodedOutputStream.K(4, getRoomId());
            }
            if (!this.applyToken_.isEmpty()) {
                iK += CodedOutputStream.K(5, getApplyToken());
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iK;
            return iK;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceSettleInviteMessageOrBuilder
        public String getUserId() {
            return this.userId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceSettleInviteMessageOrBuilder
        public ByteString getUserIdBytes() {
            return ByteString.copyFromUtf8(this.userId_);
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.fromUserId_.isEmpty()) {
                codedOutputStream.D0(1, getFromUserId());
            }
            if (!this.fromUserName_.isEmpty()) {
                codedOutputStream.D0(2, getFromUserName());
            }
            if (!this.userId_.isEmpty()) {
                codedOutputStream.D0(3, getUserId());
            }
            if (!this.roomId_.isEmpty()) {
                codedOutputStream.D0(4, getRoomId());
            }
            if (this.applyToken_.isEmpty()) {
                return;
            }
            codedOutputStream.D0(5, getApplyToken());
        }

        public static VoiceSettleInviteMessage parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (VoiceSettleInviteMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static VoiceSettleInviteMessage parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (VoiceSettleInviteMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static VoiceSettleInviteMessage parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoiceSettleInviteMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoiceSettleInviteMessage parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (VoiceSettleInviteMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static VoiceSettleInviteMessage parseFrom(InputStream inputStream) throws IOException {
            return (VoiceSettleInviteMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceSettleInviteMessage parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (VoiceSettleInviteMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static VoiceSettleInviteMessage parseFrom(e eVar) throws IOException {
            return (VoiceSettleInviteMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static VoiceSettleInviteMessage parseFrom(e eVar, h hVar) throws IOException {
            return (VoiceSettleInviteMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public static final class VoiceShareScreenDesc extends GeneratedMessageLite<VoiceShareScreenDesc, Builder> implements VoiceShareScreenDescOrBuilder {
        private static final VoiceShareScreenDesc DEFAULT_INSTANCE;
        public static final int DESC_FIELD_NUMBER = 4;
        public static final int ID_FIELD_NUMBER = 1;
        private static volatile i860<VoiceShareScreenDesc> PARSER = null;
        public static final int ROOMID_FIELD_NUMBER = 3;
        public static final int USERID_FIELD_NUMBER = 2;
        private String id_ = "";
        private String userId_ = "";
        private String roomId_ = "";
        private String desc_ = "";

        public static final class Builder extends GeneratedMessageLite.b<VoiceShareScreenDesc, Builder> implements VoiceShareScreenDescOrBuilder {
            private Builder() {
                super(VoiceShareScreenDesc.DEFAULT_INSTANCE);
            }

            public Builder clearDesc() {
                copyOnWrite();
                ((VoiceShareScreenDesc) ((GeneratedMessageLite.b) this).instance).clearDesc();
                return this;
            }

            public Builder clearId() {
                copyOnWrite();
                ((VoiceShareScreenDesc) ((GeneratedMessageLite.b) this).instance).clearId();
                return this;
            }

            public Builder clearRoomId() {
                copyOnWrite();
                ((VoiceShareScreenDesc) ((GeneratedMessageLite.b) this).instance).clearRoomId();
                return this;
            }

            public Builder clearUserId() {
                copyOnWrite();
                ((VoiceShareScreenDesc) ((GeneratedMessageLite.b) this).instance).clearUserId();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceShareScreenDescOrBuilder
            public String getDesc() {
                return ((VoiceShareScreenDesc) ((GeneratedMessageLite.b) this).instance).getDesc();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceShareScreenDescOrBuilder
            public ByteString getDescBytes() {
                return ((VoiceShareScreenDesc) ((GeneratedMessageLite.b) this).instance).getDescBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceShareScreenDescOrBuilder
            public String getId() {
                return ((VoiceShareScreenDesc) ((GeneratedMessageLite.b) this).instance).getId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceShareScreenDescOrBuilder
            public ByteString getIdBytes() {
                return ((VoiceShareScreenDesc) ((GeneratedMessageLite.b) this).instance).getIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceShareScreenDescOrBuilder
            public String getRoomId() {
                return ((VoiceShareScreenDesc) ((GeneratedMessageLite.b) this).instance).getRoomId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceShareScreenDescOrBuilder
            public ByteString getRoomIdBytes() {
                return ((VoiceShareScreenDesc) ((GeneratedMessageLite.b) this).instance).getRoomIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceShareScreenDescOrBuilder
            public String getUserId() {
                return ((VoiceShareScreenDesc) ((GeneratedMessageLite.b) this).instance).getUserId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceShareScreenDescOrBuilder
            public ByteString getUserIdBytes() {
                return ((VoiceShareScreenDesc) ((GeneratedMessageLite.b) this).instance).getUserIdBytes();
            }

            public Builder setDesc(String str) {
                copyOnWrite();
                ((VoiceShareScreenDesc) ((GeneratedMessageLite.b) this).instance).setDesc(str);
                return this;
            }

            public Builder setDescBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceShareScreenDesc) ((GeneratedMessageLite.b) this).instance).setDescBytes(byteString);
                return this;
            }

            public Builder setId(String str) {
                copyOnWrite();
                ((VoiceShareScreenDesc) ((GeneratedMessageLite.b) this).instance).setId(str);
                return this;
            }

            public Builder setIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceShareScreenDesc) ((GeneratedMessageLite.b) this).instance).setIdBytes(byteString);
                return this;
            }

            public Builder setRoomId(String str) {
                copyOnWrite();
                ((VoiceShareScreenDesc) ((GeneratedMessageLite.b) this).instance).setRoomId(str);
                return this;
            }

            public Builder setRoomIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceShareScreenDesc) ((GeneratedMessageLite.b) this).instance).setRoomIdBytes(byteString);
                return this;
            }

            public Builder setUserId(String str) {
                copyOnWrite();
                ((VoiceShareScreenDesc) ((GeneratedMessageLite.b) this).instance).setUserId(str);
                return this;
            }

            public Builder setUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceShareScreenDesc) ((GeneratedMessageLite.b) this).instance).setUserIdBytes(byteString);
                return this;
            }
        }

        static {
            VoiceShareScreenDesc voiceShareScreenDesc = new VoiceShareScreenDesc();
            DEFAULT_INSTANCE = voiceShareScreenDesc;
            voiceShareScreenDesc.makeImmutable();
        }

        private VoiceShareScreenDesc() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDesc() {
            this.desc_ = getDefaultInstance().getDesc();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearId() {
            this.id_ = getDefaultInstance().getId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRoomId() {
            this.roomId_ = getDefaultInstance().getRoomId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUserId() {
            this.userId_ = getDefaultInstance().getUserId();
        }

        public static VoiceShareScreenDesc getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(VoiceShareScreenDesc voiceShareScreenDesc) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(voiceShareScreenDesc);
        }

        public static VoiceShareScreenDesc parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VoiceShareScreenDesc) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceShareScreenDesc parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VoiceShareScreenDesc) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<VoiceShareScreenDesc> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDesc(String str) {
            str.getClass();
            this.desc_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDescBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.desc_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setId(String str) {
            str.getClass();
            this.id_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIdBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.id_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRoomId(String str) {
            str.getClass();
            this.roomId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRoomIdBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.roomId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserId(String str) {
            str.getClass();
            this.userId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserIdBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.userId_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C04221.f1679xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoiceShareScreenDesc();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    VoiceShareScreenDesc voiceShareScreenDesc = (VoiceShareScreenDesc) obj2;
                    this.id_ = hVar.f(!this.id_.isEmpty(), this.id_, !voiceShareScreenDesc.id_.isEmpty(), voiceShareScreenDesc.id_);
                    this.userId_ = hVar.f(!this.userId_.isEmpty(), this.userId_, !voiceShareScreenDesc.userId_.isEmpty(), voiceShareScreenDesc.userId_);
                    this.roomId_ = hVar.f(!this.roomId_.isEmpty(), this.roomId_, !voiceShareScreenDesc.roomId_.isEmpty(), voiceShareScreenDesc.roomId_);
                    this.desc_ = hVar.f(!this.desc_.isEmpty(), this.desc_, true ^ voiceShareScreenDesc.desc_.isEmpty(), voiceShareScreenDesc.desc_);
                    GeneratedMessageLite.g gVar = GeneratedMessageLite.g.INSTANCE;
                    return this;
                case 6:
                    e eVar = (e) obj;
                    boolean z = false;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            if (iM != 0) {
                                if (iM == 10) {
                                    this.id_ = eVar.L();
                                } else if (iM == 18) {
                                    this.userId_ = eVar.L();
                                } else if (iM == 26) {
                                    this.roomId_ = eVar.L();
                                } else if (iM == 34) {
                                    this.desc_ = eVar.L();
                                } else if (!eVar.R(iM)) {
                                }
                            }
                            z = true;
                        } catch (IOException e) {
                            aag0.a(new InvalidProtocolBufferException(e.getMessage()).setUnfinishedMessage(this));
                            return null;
                        } catch (InvalidProtocolBufferException e2) {
                            aag0.a(e2.setUnfinishedMessage(this));
                            return null;
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (PARSER == null) {
                        synchronized (VoiceShareScreenDesc.class) {
                            try {
                                if (PARSER == null) {
                                    PARSER = new GeneratedMessageLite.c(DEFAULT_INSTANCE);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return PARSER;
                default:
                    bz00.a();
                    return null;
            }
            return DEFAULT_INSTANCE;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceShareScreenDescOrBuilder
        public String getDesc() {
            return this.desc_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceShareScreenDescOrBuilder
        public ByteString getDescBytes() {
            return ByteString.copyFromUtf8(this.desc_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceShareScreenDescOrBuilder
        public String getId() {
            return this.id_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceShareScreenDescOrBuilder
        public ByteString getIdBytes() {
            return ByteString.copyFromUtf8(this.id_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceShareScreenDescOrBuilder
        public String getRoomId() {
            return this.roomId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceShareScreenDescOrBuilder
        public ByteString getRoomIdBytes() {
            return ByteString.copyFromUtf8(this.roomId_);
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iK = !this.id_.isEmpty() ? CodedOutputStream.K(1, getId()) : 0;
            if (!this.userId_.isEmpty()) {
                iK += CodedOutputStream.K(2, getUserId());
            }
            if (!this.roomId_.isEmpty()) {
                iK += CodedOutputStream.K(3, getRoomId());
            }
            if (!this.desc_.isEmpty()) {
                iK += CodedOutputStream.K(4, getDesc());
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iK;
            return iK;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceShareScreenDescOrBuilder
        public String getUserId() {
            return this.userId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceShareScreenDescOrBuilder
        public ByteString getUserIdBytes() {
            return ByteString.copyFromUtf8(this.userId_);
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.id_.isEmpty()) {
                codedOutputStream.D0(1, getId());
            }
            if (!this.userId_.isEmpty()) {
                codedOutputStream.D0(2, getUserId());
            }
            if (!this.roomId_.isEmpty()) {
                codedOutputStream.D0(3, getRoomId());
            }
            if (this.desc_.isEmpty()) {
                return;
            }
            codedOutputStream.D0(4, getDesc());
        }

        public static VoiceShareScreenDesc parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (VoiceShareScreenDesc) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static VoiceShareScreenDesc parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (VoiceShareScreenDesc) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static VoiceShareScreenDesc parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoiceShareScreenDesc) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoiceShareScreenDesc parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (VoiceShareScreenDesc) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static VoiceShareScreenDesc parseFrom(InputStream inputStream) throws IOException {
            return (VoiceShareScreenDesc) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceShareScreenDesc parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (VoiceShareScreenDesc) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static VoiceShareScreenDesc parseFrom(e eVar) throws IOException {
            return (VoiceShareScreenDesc) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static VoiceShareScreenDesc parseFrom(e eVar, h hVar) throws IOException {
            return (VoiceShareScreenDesc) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public static final class VoiceStreamBizTypeMessage extends GeneratedMessageLite<VoiceStreamBizTypeMessage, Builder> implements VoiceStreamBizTypeMessageOrBuilder {
        public static final int BIZTYPE_FIELD_NUMBER = 3;
        private static final VoiceStreamBizTypeMessage DEFAULT_INSTANCE;
        public static final int LIVEID_FIELD_NUMBER = 2;
        private static volatile i860<VoiceStreamBizTypeMessage> PARSER = null;
        public static final int ROOMID_FIELD_NUMBER = 1;
        private int bizType_;
        private String roomId_ = "";
        private String liveId_ = "";

        public static final class Builder extends GeneratedMessageLite.b<VoiceStreamBizTypeMessage, Builder> implements VoiceStreamBizTypeMessageOrBuilder {
            private Builder() {
                super(VoiceStreamBizTypeMessage.DEFAULT_INSTANCE);
            }

            public Builder clearBizType() {
                copyOnWrite();
                ((VoiceStreamBizTypeMessage) ((GeneratedMessageLite.b) this).instance).clearBizType();
                return this;
            }

            public Builder clearLiveId() {
                copyOnWrite();
                ((VoiceStreamBizTypeMessage) ((GeneratedMessageLite.b) this).instance).clearLiveId();
                return this;
            }

            public Builder clearRoomId() {
                copyOnWrite();
                ((VoiceStreamBizTypeMessage) ((GeneratedMessageLite.b) this).instance).clearRoomId();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceStreamBizTypeMessageOrBuilder
            public int getBizType() {
                return ((VoiceStreamBizTypeMessage) ((GeneratedMessageLite.b) this).instance).getBizType();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceStreamBizTypeMessageOrBuilder
            public String getLiveId() {
                return ((VoiceStreamBizTypeMessage) ((GeneratedMessageLite.b) this).instance).getLiveId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceStreamBizTypeMessageOrBuilder
            public ByteString getLiveIdBytes() {
                return ((VoiceStreamBizTypeMessage) ((GeneratedMessageLite.b) this).instance).getLiveIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceStreamBizTypeMessageOrBuilder
            public String getRoomId() {
                return ((VoiceStreamBizTypeMessage) ((GeneratedMessageLite.b) this).instance).getRoomId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceStreamBizTypeMessageOrBuilder
            public ByteString getRoomIdBytes() {
                return ((VoiceStreamBizTypeMessage) ((GeneratedMessageLite.b) this).instance).getRoomIdBytes();
            }

            public Builder setBizType(int i) {
                copyOnWrite();
                ((VoiceStreamBizTypeMessage) ((GeneratedMessageLite.b) this).instance).setBizType(i);
                return this;
            }

            public Builder setLiveId(String str) {
                copyOnWrite();
                ((VoiceStreamBizTypeMessage) ((GeneratedMessageLite.b) this).instance).setLiveId(str);
                return this;
            }

            public Builder setLiveIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceStreamBizTypeMessage) ((GeneratedMessageLite.b) this).instance).setLiveIdBytes(byteString);
                return this;
            }

            public Builder setRoomId(String str) {
                copyOnWrite();
                ((VoiceStreamBizTypeMessage) ((GeneratedMessageLite.b) this).instance).setRoomId(str);
                return this;
            }

            public Builder setRoomIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceStreamBizTypeMessage) ((GeneratedMessageLite.b) this).instance).setRoomIdBytes(byteString);
                return this;
            }
        }

        static {
            VoiceStreamBizTypeMessage voiceStreamBizTypeMessage = new VoiceStreamBizTypeMessage();
            DEFAULT_INSTANCE = voiceStreamBizTypeMessage;
            voiceStreamBizTypeMessage.makeImmutable();
        }

        private VoiceStreamBizTypeMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBizType() {
            this.bizType_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLiveId() {
            this.liveId_ = getDefaultInstance().getLiveId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRoomId() {
            this.roomId_ = getDefaultInstance().getRoomId();
        }

        public static VoiceStreamBizTypeMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(VoiceStreamBizTypeMessage voiceStreamBizTypeMessage) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(voiceStreamBizTypeMessage);
        }

        public static VoiceStreamBizTypeMessage parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VoiceStreamBizTypeMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceStreamBizTypeMessage parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VoiceStreamBizTypeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<VoiceStreamBizTypeMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBizType(int i) {
            this.bizType_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLiveId(String str) {
            str.getClass();
            this.liveId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLiveIdBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.liveId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRoomId(String str) {
            str.getClass();
            this.roomId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRoomIdBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.roomId_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C04221.f1679xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoiceStreamBizTypeMessage();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    VoiceStreamBizTypeMessage voiceStreamBizTypeMessage = (VoiceStreamBizTypeMessage) obj2;
                    this.roomId_ = hVar.f(!this.roomId_.isEmpty(), this.roomId_, !voiceStreamBizTypeMessage.roomId_.isEmpty(), voiceStreamBizTypeMessage.roomId_);
                    this.liveId_ = hVar.f(!this.liveId_.isEmpty(), this.liveId_, !voiceStreamBizTypeMessage.liveId_.isEmpty(), voiceStreamBizTypeMessage.liveId_);
                    int i = this.bizType_;
                    boolean z2 = i != 0;
                    int i2 = voiceStreamBizTypeMessage.bizType_;
                    this.bizType_ = hVar.e(z2, i, i2 != 0, i2);
                    GeneratedMessageLite.g gVar = GeneratedMessageLite.g.INSTANCE;
                    return this;
                case 6:
                    e eVar = (e) obj;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            if (iM != 0) {
                                if (iM == 10) {
                                    this.roomId_ = eVar.L();
                                } else if (iM == 18) {
                                    this.liveId_ = eVar.L();
                                } else if (iM == 24) {
                                    this.bizType_ = eVar.u();
                                } else if (!eVar.R(iM)) {
                                }
                            }
                            z = true;
                        } catch (IOException e) {
                            aag0.a(new InvalidProtocolBufferException(e.getMessage()).setUnfinishedMessage(this));
                            return null;
                        } catch (InvalidProtocolBufferException e2) {
                            aag0.a(e2.setUnfinishedMessage(this));
                            return null;
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (PARSER == null) {
                        synchronized (VoiceStreamBizTypeMessage.class) {
                            try {
                                if (PARSER == null) {
                                    PARSER = new GeneratedMessageLite.c(DEFAULT_INSTANCE);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return PARSER;
                default:
                    bz00.a();
                    return null;
            }
            return DEFAULT_INSTANCE;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceStreamBizTypeMessageOrBuilder
        public int getBizType() {
            return this.bizType_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceStreamBizTypeMessageOrBuilder
        public String getLiveId() {
            return this.liveId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceStreamBizTypeMessageOrBuilder
        public ByteString getLiveIdBytes() {
            return ByteString.copyFromUtf8(this.liveId_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceStreamBizTypeMessageOrBuilder
        public String getRoomId() {
            return this.roomId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceStreamBizTypeMessageOrBuilder
        public ByteString getRoomIdBytes() {
            return ByteString.copyFromUtf8(this.roomId_);
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iK = !this.roomId_.isEmpty() ? CodedOutputStream.K(1, getRoomId()) : 0;
            if (!this.liveId_.isEmpty()) {
                iK += CodedOutputStream.K(2, getLiveId());
            }
            int i2 = this.bizType_;
            if (i2 != 0) {
                iK += CodedOutputStream.t(3, i2);
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iK;
            return iK;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.roomId_.isEmpty()) {
                codedOutputStream.D0(1, getRoomId());
            }
            if (!this.liveId_.isEmpty()) {
                codedOutputStream.D0(2, getLiveId());
            }
            int i = this.bizType_;
            if (i != 0) {
                codedOutputStream.s0(3, i);
            }
        }

        public static VoiceStreamBizTypeMessage parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (VoiceStreamBizTypeMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static VoiceStreamBizTypeMessage parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (VoiceStreamBizTypeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static VoiceStreamBizTypeMessage parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoiceStreamBizTypeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoiceStreamBizTypeMessage parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (VoiceStreamBizTypeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static VoiceStreamBizTypeMessage parseFrom(InputStream inputStream) throws IOException {
            return (VoiceStreamBizTypeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceStreamBizTypeMessage parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (VoiceStreamBizTypeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static VoiceStreamBizTypeMessage parseFrom(e eVar) throws IOException {
            return (VoiceStreamBizTypeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static VoiceStreamBizTypeMessage parseFrom(e eVar, h hVar) throws IOException {
            return (VoiceStreamBizTypeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public static final class VoiceToneMessage extends GeneratedMessageLite<VoiceToneMessage, Builder> implements VoiceToneMessageOrBuilder {
        private static final VoiceToneMessage DEFAULT_INSTANCE;
        private static volatile i860<VoiceToneMessage> PARSER;

        public static final class Builder extends GeneratedMessageLite.b<VoiceToneMessage, Builder> implements VoiceToneMessageOrBuilder {
            private Builder() {
                super(VoiceToneMessage.DEFAULT_INSTANCE);
            }
        }

        static {
            VoiceToneMessage voiceToneMessage = new VoiceToneMessage();
            DEFAULT_INSTANCE = voiceToneMessage;
            voiceToneMessage.makeImmutable();
        }

        private VoiceToneMessage() {
        }

        public static VoiceToneMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(VoiceToneMessage voiceToneMessage) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(voiceToneMessage);
        }

        public static VoiceToneMessage parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VoiceToneMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceToneMessage parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VoiceToneMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<VoiceToneMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C04221.f1679xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoiceToneMessage();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.g gVar = GeneratedMessageLite.g.INSTANCE;
                    return this;
                case 6:
                    e eVar = (e) obj;
                    boolean z = false;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            if (iM == 0 || !eVar.R(iM)) {
                                z = true;
                            }
                        } catch (InvalidProtocolBufferException e) {
                            aag0.a(e.setUnfinishedMessage(this));
                            return null;
                        } catch (IOException e2) {
                            aag0.a(new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this));
                            return null;
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (PARSER == null) {
                        synchronized (VoiceToneMessage.class) {
                            try {
                                if (PARSER == null) {
                                    PARSER = new GeneratedMessageLite.c(DEFAULT_INSTANCE);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return PARSER;
                default:
                    bz00.a();
                    return null;
            }
            return DEFAULT_INSTANCE;
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = 0;
            return 0;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        }

        public static VoiceToneMessage parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (VoiceToneMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static VoiceToneMessage parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (VoiceToneMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static VoiceToneMessage parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoiceToneMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoiceToneMessage parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (VoiceToneMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static VoiceToneMessage parseFrom(InputStream inputStream) throws IOException {
            return (VoiceToneMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceToneMessage parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (VoiceToneMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static VoiceToneMessage parseFrom(e eVar) throws IOException {
            return (VoiceToneMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static VoiceToneMessage parseFrom(e eVar, h hVar) throws IOException {
            return (VoiceToneMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public static final class VoiceUserGuide extends GeneratedMessageLite<VoiceUserGuide, Builder> implements VoiceUserGuideOrBuilder {
        public static final int BGSTYLE_FIELD_NUMBER = 2;
        public static final int CONTENT_FIELD_NUMBER = 3;
        private static final VoiceUserGuide DEFAULT_INSTANCE;
        public static final int GUIDETYPE_FIELD_NUMBER = 6;
        public static final int ICON_FIELD_NUMBER = 1;
        private static volatile i860<VoiceUserGuide> PARSER = null;
        public static final int SCHEMA_FIELD_NUMBER = 4;
        public static final int SHOWSECONDS_FIELD_NUMBER = 5;
        private BgStyle bgStyle_;
        private long showSeconds_;
        private String icon_ = "";
        private String content_ = "";
        private String schema_ = "";
        private String guideType_ = "";

        static {
            VoiceUserGuide voiceUserGuide = new VoiceUserGuide();
            DEFAULT_INSTANCE = voiceUserGuide;
            voiceUserGuide.makeImmutable();
        }

        private VoiceUserGuide() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBgStyle() {
            this.bgStyle_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearContent() {
            this.content_ = getDefaultInstance().getContent();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGuideType() {
            this.guideType_ = getDefaultInstance().getGuideType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIcon() {
            this.icon_ = getDefaultInstance().getIcon();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSchema() {
            this.schema_ = getDefaultInstance().getSchema();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearShowSeconds() {
            this.showSeconds_ = 0L;
        }

        public static VoiceUserGuide getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeBgStyle(BgStyle bgStyle) {
            BgStyle bgStyle2 = this.bgStyle_;
            if (bgStyle2 == null || bgStyle2 == BgStyle.getDefaultInstance()) {
                this.bgStyle_ = bgStyle;
            } else {
                this.bgStyle_ = (BgStyle) ((BgStyle.Builder) BgStyle.newBuilder(this.bgStyle_).mergeFrom(bgStyle)).buildPartial();
            }
        }

        public static Builder newBuilder(VoiceUserGuide voiceUserGuide) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(voiceUserGuide);
        }

        public static VoiceUserGuide parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VoiceUserGuide) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceUserGuide parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VoiceUserGuide) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<VoiceUserGuide> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBgStyle(BgStyle.Builder builder) {
            this.bgStyle_ = (BgStyle) builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setContent(String str) {
            str.getClass();
            this.content_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setContentBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.content_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGuideType(String str) {
            str.getClass();
            this.guideType_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGuideTypeBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.guideType_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIcon(String str) {
            str.getClass();
            this.icon_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIconBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.icon_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSchema(String str) {
            str.getClass();
            this.schema_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSchemaBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.schema_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setShowSeconds(long j) {
            this.showSeconds_ = j;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C04221.f1679xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoiceUserGuide();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    VoiceUserGuide voiceUserGuide = (VoiceUserGuide) obj2;
                    this.icon_ = hVar.f(!this.icon_.isEmpty(), this.icon_, !voiceUserGuide.icon_.isEmpty(), voiceUserGuide.icon_);
                    this.bgStyle_ = hVar.o(this.bgStyle_, voiceUserGuide.bgStyle_);
                    this.content_ = hVar.f(!this.content_.isEmpty(), this.content_, !voiceUserGuide.content_.isEmpty(), voiceUserGuide.content_);
                    this.schema_ = hVar.f(!this.schema_.isEmpty(), this.schema_, !voiceUserGuide.schema_.isEmpty(), voiceUserGuide.schema_);
                    long j = this.showSeconds_;
                    boolean z2 = j != 0;
                    long j2 = voiceUserGuide.showSeconds_;
                    this.showSeconds_ = hVar.i(z2, j, j2 != 0, j2);
                    this.guideType_ = hVar.f(!this.guideType_.isEmpty(), this.guideType_, !voiceUserGuide.guideType_.isEmpty(), voiceUserGuide.guideType_);
                    GeneratedMessageLite.g gVar = GeneratedMessageLite.g.INSTANCE;
                    return this;
                case 6:
                    e eVar = (e) obj;
                    h hVar2 = (h) obj2;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            if (iM != 0) {
                                if (iM == 10) {
                                    this.icon_ = eVar.L();
                                } else if (iM == 18) {
                                    BgStyle bgStyle = this.bgStyle_;
                                    BgStyle.Builder builder = bgStyle != null ? (BgStyle.Builder) bgStyle.toBuilder() : null;
                                    BgStyle bgStyleW = eVar.w(BgStyle.parser(), hVar2);
                                    this.bgStyle_ = bgStyleW;
                                    if (builder != null) {
                                        builder.mergeFrom(bgStyleW);
                                        this.bgStyle_ = (BgStyle) builder.buildPartial();
                                    }
                                } else if (iM == 26) {
                                    this.content_ = eVar.L();
                                } else if (iM == 34) {
                                    this.schema_ = eVar.L();
                                } else if (iM == 40) {
                                    this.showSeconds_ = eVar.v();
                                } else if (iM == 50) {
                                    this.guideType_ = eVar.L();
                                } else if (!eVar.R(iM)) {
                                }
                            }
                            z = true;
                        } catch (IOException e) {
                            aag0.a(new InvalidProtocolBufferException(e.getMessage()).setUnfinishedMessage(this));
                            return null;
                        } catch (InvalidProtocolBufferException e2) {
                            aag0.a(e2.setUnfinishedMessage(this));
                            return null;
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (PARSER == null) {
                        synchronized (VoiceUserGuide.class) {
                            try {
                                if (PARSER == null) {
                                    PARSER = new GeneratedMessageLite.c(DEFAULT_INSTANCE);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return PARSER;
                default:
                    bz00.a();
                    return null;
            }
            return DEFAULT_INSTANCE;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceUserGuideOrBuilder
        public BgStyle getBgStyle() {
            BgStyle bgStyle = this.bgStyle_;
            return bgStyle == null ? BgStyle.getDefaultInstance() : bgStyle;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceUserGuideOrBuilder
        public String getContent() {
            return this.content_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceUserGuideOrBuilder
        public ByteString getContentBytes() {
            return ByteString.copyFromUtf8(this.content_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceUserGuideOrBuilder
        public String getGuideType() {
            return this.guideType_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceUserGuideOrBuilder
        public ByteString getGuideTypeBytes() {
            return ByteString.copyFromUtf8(this.guideType_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceUserGuideOrBuilder
        public String getIcon() {
            return this.icon_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceUserGuideOrBuilder
        public ByteString getIconBytes() {
            return ByteString.copyFromUtf8(this.icon_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceUserGuideOrBuilder
        public String getSchema() {
            return this.schema_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceUserGuideOrBuilder
        public ByteString getSchemaBytes() {
            return ByteString.copyFromUtf8(this.schema_);
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iK = !this.icon_.isEmpty() ? CodedOutputStream.K(1, getIcon()) : 0;
            if (this.bgStyle_ != null) {
                iK += CodedOutputStream.C(2, getBgStyle());
            }
            if (!this.content_.isEmpty()) {
                iK += CodedOutputStream.K(3, getContent());
            }
            if (!this.schema_.isEmpty()) {
                iK += CodedOutputStream.K(4, getSchema());
            }
            long j = this.showSeconds_;
            if (j != 0) {
                iK += CodedOutputStream.v(5, j);
            }
            if (!this.guideType_.isEmpty()) {
                iK += CodedOutputStream.K(6, getGuideType());
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iK;
            return iK;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceUserGuideOrBuilder
        public long getShowSeconds() {
            return this.showSeconds_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceUserGuideOrBuilder
        public boolean hasBgStyle() {
            return this.bgStyle_ != null;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.icon_.isEmpty()) {
                codedOutputStream.D0(1, getIcon());
            }
            if (this.bgStyle_ != null) {
                codedOutputStream.w0(2, getBgStyle());
            }
            if (!this.content_.isEmpty()) {
                codedOutputStream.D0(3, getContent());
            }
            if (!this.schema_.isEmpty()) {
                codedOutputStream.D0(4, getSchema());
            }
            long j = this.showSeconds_;
            if (j != 0) {
                codedOutputStream.u0(5, j);
            }
            if (this.guideType_.isEmpty()) {
                return;
            }
            codedOutputStream.D0(6, getGuideType());
        }

        public static VoiceUserGuide parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (VoiceUserGuide) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static VoiceUserGuide parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (VoiceUserGuide) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBgStyle(BgStyle bgStyle) {
            bgStyle.getClass();
            this.bgStyle_ = bgStyle;
        }

        public static final class Builder extends GeneratedMessageLite.b<VoiceUserGuide, Builder> implements VoiceUserGuideOrBuilder {
            private Builder() {
                super(VoiceUserGuide.DEFAULT_INSTANCE);
            }

            public Builder clearBgStyle() {
                copyOnWrite();
                ((VoiceUserGuide) ((GeneratedMessageLite.b) this).instance).clearBgStyle();
                return this;
            }

            public Builder clearContent() {
                copyOnWrite();
                ((VoiceUserGuide) ((GeneratedMessageLite.b) this).instance).clearContent();
                return this;
            }

            public Builder clearGuideType() {
                copyOnWrite();
                ((VoiceUserGuide) ((GeneratedMessageLite.b) this).instance).clearGuideType();
                return this;
            }

            public Builder clearIcon() {
                copyOnWrite();
                ((VoiceUserGuide) ((GeneratedMessageLite.b) this).instance).clearIcon();
                return this;
            }

            public Builder clearSchema() {
                copyOnWrite();
                ((VoiceUserGuide) ((GeneratedMessageLite.b) this).instance).clearSchema();
                return this;
            }

            public Builder clearShowSeconds() {
                copyOnWrite();
                ((VoiceUserGuide) ((GeneratedMessageLite.b) this).instance).clearShowSeconds();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceUserGuideOrBuilder
            public BgStyle getBgStyle() {
                return ((VoiceUserGuide) ((GeneratedMessageLite.b) this).instance).getBgStyle();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceUserGuideOrBuilder
            public String getContent() {
                return ((VoiceUserGuide) ((GeneratedMessageLite.b) this).instance).getContent();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceUserGuideOrBuilder
            public ByteString getContentBytes() {
                return ((VoiceUserGuide) ((GeneratedMessageLite.b) this).instance).getContentBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceUserGuideOrBuilder
            public String getGuideType() {
                return ((VoiceUserGuide) ((GeneratedMessageLite.b) this).instance).getGuideType();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceUserGuideOrBuilder
            public ByteString getGuideTypeBytes() {
                return ((VoiceUserGuide) ((GeneratedMessageLite.b) this).instance).getGuideTypeBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceUserGuideOrBuilder
            public String getIcon() {
                return ((VoiceUserGuide) ((GeneratedMessageLite.b) this).instance).getIcon();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceUserGuideOrBuilder
            public ByteString getIconBytes() {
                return ((VoiceUserGuide) ((GeneratedMessageLite.b) this).instance).getIconBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceUserGuideOrBuilder
            public String getSchema() {
                return ((VoiceUserGuide) ((GeneratedMessageLite.b) this).instance).getSchema();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceUserGuideOrBuilder
            public ByteString getSchemaBytes() {
                return ((VoiceUserGuide) ((GeneratedMessageLite.b) this).instance).getSchemaBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceUserGuideOrBuilder
            public long getShowSeconds() {
                return ((VoiceUserGuide) ((GeneratedMessageLite.b) this).instance).getShowSeconds();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceUserGuideOrBuilder
            public boolean hasBgStyle() {
                return ((VoiceUserGuide) ((GeneratedMessageLite.b) this).instance).hasBgStyle();
            }

            public Builder mergeBgStyle(BgStyle bgStyle) {
                copyOnWrite();
                ((VoiceUserGuide) ((GeneratedMessageLite.b) this).instance).mergeBgStyle(bgStyle);
                return this;
            }

            public Builder setBgStyle(BgStyle bgStyle) {
                copyOnWrite();
                ((VoiceUserGuide) ((GeneratedMessageLite.b) this).instance).setBgStyle(bgStyle);
                return this;
            }

            public Builder setContent(String str) {
                copyOnWrite();
                ((VoiceUserGuide) ((GeneratedMessageLite.b) this).instance).setContent(str);
                return this;
            }

            public Builder setContentBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceUserGuide) ((GeneratedMessageLite.b) this).instance).setContentBytes(byteString);
                return this;
            }

            public Builder setGuideType(String str) {
                copyOnWrite();
                ((VoiceUserGuide) ((GeneratedMessageLite.b) this).instance).setGuideType(str);
                return this;
            }

            public Builder setGuideTypeBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceUserGuide) ((GeneratedMessageLite.b) this).instance).setGuideTypeBytes(byteString);
                return this;
            }

            public Builder setIcon(String str) {
                copyOnWrite();
                ((VoiceUserGuide) ((GeneratedMessageLite.b) this).instance).setIcon(str);
                return this;
            }

            public Builder setIconBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceUserGuide) ((GeneratedMessageLite.b) this).instance).setIconBytes(byteString);
                return this;
            }

            public Builder setSchema(String str) {
                copyOnWrite();
                ((VoiceUserGuide) ((GeneratedMessageLite.b) this).instance).setSchema(str);
                return this;
            }

            public Builder setSchemaBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceUserGuide) ((GeneratedMessageLite.b) this).instance).setSchemaBytes(byteString);
                return this;
            }

            public Builder setShowSeconds(long j) {
                copyOnWrite();
                ((VoiceUserGuide) ((GeneratedMessageLite.b) this).instance).setShowSeconds(j);
                return this;
            }

            public Builder setBgStyle(BgStyle.Builder builder) {
                copyOnWrite();
                ((VoiceUserGuide) ((GeneratedMessageLite.b) this).instance).setBgStyle(builder);
                return this;
            }
        }

        public static VoiceUserGuide parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoiceUserGuide) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoiceUserGuide parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (VoiceUserGuide) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static VoiceUserGuide parseFrom(InputStream inputStream) throws IOException {
            return (VoiceUserGuide) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceUserGuide parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (VoiceUserGuide) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static VoiceUserGuide parseFrom(e eVar) throws IOException {
            return (VoiceUserGuide) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static VoiceUserGuide parseFrom(e eVar, h hVar) throws IOException {
            return (VoiceUserGuide) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }
}
