package com.p051p1.mobile.longlink.msg.liveroom;

import com.alibaba.fastjson.asm.Opcodes;
import com.google.protobuf.AbstractC3426a;
import com.google.protobuf.ByteString;
import com.google.protobuf.C3430e;
import com.google.protobuf.C3433h;
import com.google.protobuf.C3437l;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InterfaceC3442q;
import com.google.protobuf.InvalidProtocolBufferException;
import com.p051p1.mobile.longlink.msg.template.Template;
import com.p051p1.mobile.longlink.msg.userMask.userMaskConfig;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;
import org.spongycastle.asn1.eac.EACTags;
import p153l.iig0;
import p153l.l710;
import p153l.lfz;
import p153l.ng60;

/* JADX INFO: loaded from: classes8.dex */
public final class LongLinkVirtualVoice {

    /* JADX INFO: renamed from: com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice$1 */
    public static /* synthetic */ class C46611 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16699xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f16699xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16699xa1df5c61[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16699xa1df5c61[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16699xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16699xa1df5c61[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16699xa1df5c61[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16699xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f16699xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public interface BgStyleOrBuilder extends lfz {
        String getAlpha();

        ByteString getAlphaBytes();

        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        String getEndColor();

        ByteString getEndColorBytes();

        String getStartColor();

        ByteString getStartColorBytes();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface LuckyParadiseEntranceOrBuilder extends lfz {
        String getCrazyIcon();

        ByteString getCrazyIconBytes();

        long getCurrentTime();

        String getDefaultIcon();

        ByteString getDefaultIconBytes();

        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        long getEndTime();

        boolean getIsCrazyNow();

        String getPoolType();

        ByteString getPoolTypeBytes();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface StarRedpacketInfoOrBuilder extends lfz {
        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        String getId();

        ByteString getIdBytes();

        String getRoomId();

        ByteString getRoomIdBytes();

        String getState();

        ByteString getStateBytes();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface VoiceAdminPanelCounterMessageOrBuilder extends lfz {
        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        VoiceAdminPanelCounterMessage.MsgType getMsgType();

        int getMsgTypeValue();

        String getRoomId();

        ByteString getRoomIdBytes();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface VoiceAvatarFramePayGuidePopUpOrBuilder extends lfz {
        String getButtonSubTitle();

        ByteString getButtonSubTitleBytes();

        String getButtonTitle();

        ByteString getButtonTitleBytes();

        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

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

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface VoiceChatTopicMessageOrBuilder extends lfz {
        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        String getTag();

        ByteString getTagBytes();

        String getTopic();

        ByteString getTopicBytes();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface VoiceFunFairEntranceOrBuilder extends lfz {
        boolean getBuff();

        String getBuffIcon();

        ByteString getBuffIconBytes();

        String getBuffText();

        ByteString getBuffTextBytes();

        long getCurrentTime();

        String getDefaultIcon();

        ByteString getDefaultIconBytes();

        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        long getEndTime();

        String getPoolType();

        ByteString getPoolTypeBytes();

        String getTip();

        ByteString getTipBytes();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface VoiceGameMessageOrBuilder extends lfz {
        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        String getGameId();

        ByteString getGameIdBytes();

        String getGameType();

        ByteString getGameTypeBytes();

        VoiceGameMessage.MsgType getMsgType();

        int getMsgTypeValue();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface VoiceLiveGameTypeMessageOrBuilder extends lfz {
        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        String getGameType();

        ByteString getGameTypeBytes();

        String getLiveId();

        ByteString getLiveIdBytes();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface VoiceLiveLovePlanetUpdateOrBuilder extends lfz {
        long getCurrentTime();

        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

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

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface VoiceLiveSGVAAnimationExtraOrBuilder extends lfz {
        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        String getKey();

        ByteString getKeyBytes();

        String getTextColor();

        ByteString getTextColorBytes();

        long getTextFont();

        long getTextSize();

        long getType();

        String getValue();

        ByteString getValueBytes();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface VoiceLiveSVGAAnimationOrBuilder extends lfz {
        VoiceLiveSGVAAnimationExtra getAnimationExtras(int i);

        int getAnimationExtrasCount();

        List<VoiceLiveSGVAAnimationExtra> getAnimationExtrasList();

        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        String getRoomId();

        ByteString getRoomIdBytes();

        String getSvgaUrl();

        ByteString getSvgaUrlBytes();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface VoiceLiveTemplateMessageOrBuilder extends lfz {
        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        String getLiveId();

        ByteString getLiveIdBytes();

        String getRoomId();

        ByteString getRoomIdBytes();

        String getTemplate();

        ByteString getTemplateBytes();

        String getUserId();

        ByteString getUserIdBytes();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface VoiceLovePlanetTeamOrBuilder extends lfz {
        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        String getOtherUserId();

        ByteString getOtherUserIdBytes();

        String getTips();

        ByteString getTipsBytes();

        long getTotalScore();

        String getUserId();

        ByteString getUserIdBytes();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface VoiceLovePlanetUserOrBuilder extends lfz {
        String getAvatar();

        ByteString getAvatarBytes();

        userMaskConfig.AvatarConfig getAvatarConfig();

        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

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

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface VoicePayGuidePopUpOrBuilder extends lfz {
        String getBubbleTitle();

        ByteString getBubbleTitleBytes();

        String getButtonTitle();

        ByteString getButtonTitleBytes();

        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

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

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface VoicePayGuideUserInfoOrBuilder extends lfz {
        int getAge();

        String getAvatar();

        ByteString getAvatarBytes();

        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        String getGender();

        ByteString getGenderBytes();

        String getName();

        ByteString getNameBytes();

        String getUserId();

        ByteString getUserIdBytes();

        String getZodiac();

        ByteString getZodiacBytes();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface VoicePayGuideUserOrBuilder extends lfz {
        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        String getUserId();

        ByteString getUserIdBytes();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface VoicePayGuideUserTagOrBuilder extends lfz {
        String getColor();

        ByteString getColorBytes();

        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        String getText();

        ByteString getTextBytes();

        String getType();

        ByteString getTypeBytes();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface VoicePayGuideV2PopUpOrBuilder extends lfz {
        String getBizType();

        ByteString getBizTypeBytes();

        String getBubbleTitle();

        ByteString getBubbleTitleBytes();

        String getButtonTitle();

        ByteString getButtonTitleBytes();

        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

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

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface VoiceRoomCoverOrBuilder extends lfz {
        String getCoverUrl();

        ByteString getCoverUrlBytes();

        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        String getRoomId();

        ByteString getRoomIdBytes();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface VoiceRoomDissolveOrBuilder extends lfz {
        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        String getRoomId();

        ByteString getRoomIdBytes();

        String getUserId();

        ByteString getUserIdBytes();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface VoiceRoomHeatUpdateOrBuilder extends lfz {
        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        long getHeat();

        String getHeatIcon();

        ByteString getHeatIconBytes();

        String getHeatSvga();

        ByteString getHeatSvgaBytes();

        String getRoomId();

        ByteString getRoomIdBytes();

        long getUpdatedTime();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface VoiceRoomLevelUpOrBuilder extends lfz {
        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

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

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface VoiceRoomPersonalUpdateOrBuilder extends lfz {
        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        boolean getIsPersonal();

        String getRoomId();

        ByteString getRoomIdBytes();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface VoiceRoomTitleUpdateOrBuilder extends lfz {
        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        String getRoomId();

        ByteString getRoomIdBytes();

        Template.TemplateData getTempdata();

        String getTitle();

        ByteString getTitleBytes();

        boolean hasTempdata();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface VoiceSettleInviteMessageOrBuilder extends lfz {
        String getApplyToken();

        ByteString getApplyTokenBytes();

        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        String getFromUserId();

        ByteString getFromUserIdBytes();

        String getFromUserName();

        ByteString getFromUserNameBytes();

        String getRoomId();

        ByteString getRoomIdBytes();

        String getUserId();

        ByteString getUserIdBytes();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface VoiceSettleMessageOrBuilder extends lfz {
        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        String getId();

        ByteString getIdBytes();

        VoiceSettleMessage.MsgType getMsgType();

        int getMsgTypeValue();

        String getRoomId();

        ByteString getRoomIdBytes();

        String getUserId();

        ByteString getUserIdBytes();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface VoiceShareScreenDescOrBuilder extends lfz {
        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        String getDesc();

        ByteString getDescBytes();

        String getId();

        ByteString getIdBytes();

        String getRoomId();

        ByteString getRoomIdBytes();

        String getUserId();

        ByteString getUserIdBytes();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface VoiceShareScreenOrBuilder extends lfz {
        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

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

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface VoiceStreamBizTypeMessageOrBuilder extends lfz {
        int getBizType();

        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        String getLiveId();

        ByteString getLiveIdBytes();

        String getRoomId();

        ByteString getRoomIdBytes();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface VoiceToneMessageOrBuilder extends lfz {
        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface VoiceUserGuideOrBuilder extends lfz {
        BgStyle getBgStyle();

        String getContent();

        ByteString getContentBytes();

        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        String getGuideType();

        ByteString getGuideTypeBytes();

        String getIcon();

        ByteString getIconBytes();

        String getSchema();

        ByteString getSchemaBytes();

        long getShowSeconds();

        boolean hasBgStyle();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    private LongLinkVirtualVoice() {
    }

    public static void registerAllExtensions(C3433h c3433h) {
    }

    public static final class VoiceAdminPanelCounterMessage extends GeneratedMessageLite<VoiceAdminPanelCounterMessage, Builder> implements VoiceAdminPanelCounterMessageOrBuilder {
        private static final VoiceAdminPanelCounterMessage DEFAULT_INSTANCE;
        public static final int MSGTYPE_FIELD_NUMBER = 1;
        private static volatile ng60<VoiceAdminPanelCounterMessage> PARSER = null;
        public static final int ROOMID_FIELD_NUMBER = 2;
        private int msgType_;
        private String roomId_ = "";

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<VoiceAdminPanelCounterMessage, Builder> implements VoiceAdminPanelCounterMessageOrBuilder {
            private Builder() {
                super(VoiceAdminPanelCounterMessage.DEFAULT_INSTANCE);
            }

            public Builder clearMsgType() {
                copyOnWrite();
                ((VoiceAdminPanelCounterMessage) this.instance).clearMsgType();
                return this;
            }

            public Builder clearRoomId() {
                copyOnWrite();
                ((VoiceAdminPanelCounterMessage) this.instance).clearRoomId();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceAdminPanelCounterMessageOrBuilder
            public MsgType getMsgType() {
                return ((VoiceAdminPanelCounterMessage) this.instance).getMsgType();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceAdminPanelCounterMessageOrBuilder
            public int getMsgTypeValue() {
                return ((VoiceAdminPanelCounterMessage) this.instance).getMsgTypeValue();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceAdminPanelCounterMessageOrBuilder
            public String getRoomId() {
                return ((VoiceAdminPanelCounterMessage) this.instance).getRoomId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceAdminPanelCounterMessageOrBuilder
            public ByteString getRoomIdBytes() {
                return ((VoiceAdminPanelCounterMessage) this.instance).getRoomIdBytes();
            }

            public Builder setMsgType(MsgType msgType) {
                copyOnWrite();
                ((VoiceAdminPanelCounterMessage) this.instance).setMsgType(msgType);
                return this;
            }

            public Builder setMsgTypeValue(int i) {
                copyOnWrite();
                ((VoiceAdminPanelCounterMessage) this.instance).setMsgTypeValue(i);
                return this;
            }

            public Builder setRoomId(String str) {
                copyOnWrite();
                ((VoiceAdminPanelCounterMessage) this.instance).setRoomId(str);
                return this;
            }

            public Builder setRoomIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceAdminPanelCounterMessage) this.instance).setRoomIdBytes(byteString);
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
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(voiceAdminPanelCounterMessage);
        }

        public static VoiceAdminPanelCounterMessage parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VoiceAdminPanelCounterMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceAdminPanelCounterMessage parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VoiceAdminPanelCounterMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<VoiceAdminPanelCounterMessage> parser() {
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.roomId_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C46611.f16699xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoiceAdminPanelCounterMessage();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    VoiceAdminPanelCounterMessage voiceAdminPanelCounterMessage = (VoiceAdminPanelCounterMessage) obj2;
                    int i = this.msgType_;
                    boolean z2 = i != 0;
                    int i2 = voiceAdminPanelCounterMessage.msgType_;
                    this.msgType_ = interfaceC3409h.mo17051e(z2, i, i2 != 0, i2);
                    this.roomId_ = interfaceC3409h.mo17052f(!this.roomId_.isEmpty(), this.roomId_, !voiceAdminPanelCounterMessage.roomId_.isEmpty(), voiceAdminPanelCounterMessage.roomId_);
                    GeneratedMessageLite.C3408g c3408g = GeneratedMessageLite.C3408g.INSTANCE;
                    return this;
                case 6:
                    C3430e c3430e = (C3430e) obj;
                    while (!z) {
                        try {
                            int iM17171M = c3430e.m17171M();
                            if (iM17171M != 0) {
                                if (iM17171M == 8) {
                                    this.msgType_ = c3430e.m17191p();
                                } else if (iM17171M == 18) {
                                    this.roomId_ = c3430e.m17170L();
                                } else if (!c3430e.m17176R(iM17171M)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            iig0.m140070a(e.setUnfinishedMessage(this));
                            return null;
                        } catch (IOException e2) {
                            iig0.m140070a(new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this));
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
                                    PARSER = new GeneratedMessageLite.C3404c(DEFAULT_INSTANCE);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return PARSER;
                default:
                    l710.m153113a();
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

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16977m = this.msgType_ != MsgType.refresh.getNumber() ? CodedOutputStream.m16977m(1, this.msgType_) : 0;
            if (!this.roomId_.isEmpty()) {
                iM16977m += CodedOutputStream.m16956K(2, getRoomId());
            }
            this.memoizedSerializedSize = iM16977m;
            return iM16977m;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.msgType_ != MsgType.refresh.getNumber()) {
                codedOutputStream.m17015i0(1, this.msgType_);
            }
            if (this.roomId_.isEmpty()) {
                return;
            }
            codedOutputStream.mo16994D0(2, getRoomId());
        }

        public enum MsgType implements C3437l.c {
            refresh(0),
            UNRECOGNIZED(-1);

            private static final C3437l.d<MsgType> internalValueMap = new C3437l.d<MsgType>() { // from class: com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceAdminPanelCounterMessage.MsgType.1
                @Override // com.google.protobuf.C3437l.d
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

            public static C3437l.d<MsgType> internalGetValueMap() {
                return internalValueMap;
            }

            @Override // com.google.protobuf.C3437l.c
            public final int getNumber() {
                return this.value;
            }

            @Deprecated
            public static MsgType valueOf(int i) {
                return forNumber(i);
            }
        }

        public static VoiceAdminPanelCounterMessage parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (VoiceAdminPanelCounterMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static VoiceAdminPanelCounterMessage parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (VoiceAdminPanelCounterMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        public static VoiceAdminPanelCounterMessage parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoiceAdminPanelCounterMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoiceAdminPanelCounterMessage parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (VoiceAdminPanelCounterMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static VoiceAdminPanelCounterMessage parseFrom(InputStream inputStream) throws IOException {
            return (VoiceAdminPanelCounterMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceAdminPanelCounterMessage parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (VoiceAdminPanelCounterMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static VoiceAdminPanelCounterMessage parseFrom(C3430e c3430e) throws IOException {
            return (VoiceAdminPanelCounterMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static VoiceAdminPanelCounterMessage parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (VoiceAdminPanelCounterMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }

    public static final class VoiceGameMessage extends GeneratedMessageLite<VoiceGameMessage, Builder> implements VoiceGameMessageOrBuilder {
        private static final VoiceGameMessage DEFAULT_INSTANCE;
        public static final int GAMEID_FIELD_NUMBER = 2;
        public static final int GAMETYPE_FIELD_NUMBER = 3;
        public static final int MSGTYPE_FIELD_NUMBER = 1;
        private static volatile ng60<VoiceGameMessage> PARSER;
        private String gameId_ = "";
        private String gameType_ = "";
        private int msgType_;

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<VoiceGameMessage, Builder> implements VoiceGameMessageOrBuilder {
            private Builder() {
                super(VoiceGameMessage.DEFAULT_INSTANCE);
            }

            public Builder clearGameId() {
                copyOnWrite();
                ((VoiceGameMessage) this.instance).clearGameId();
                return this;
            }

            public Builder clearGameType() {
                copyOnWrite();
                ((VoiceGameMessage) this.instance).clearGameType();
                return this;
            }

            public Builder clearMsgType() {
                copyOnWrite();
                ((VoiceGameMessage) this.instance).clearMsgType();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceGameMessageOrBuilder
            public String getGameId() {
                return ((VoiceGameMessage) this.instance).getGameId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceGameMessageOrBuilder
            public ByteString getGameIdBytes() {
                return ((VoiceGameMessage) this.instance).getGameIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceGameMessageOrBuilder
            public String getGameType() {
                return ((VoiceGameMessage) this.instance).getGameType();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceGameMessageOrBuilder
            public ByteString getGameTypeBytes() {
                return ((VoiceGameMessage) this.instance).getGameTypeBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceGameMessageOrBuilder
            public MsgType getMsgType() {
                return ((VoiceGameMessage) this.instance).getMsgType();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceGameMessageOrBuilder
            public int getMsgTypeValue() {
                return ((VoiceGameMessage) this.instance).getMsgTypeValue();
            }

            public Builder setGameId(String str) {
                copyOnWrite();
                ((VoiceGameMessage) this.instance).setGameId(str);
                return this;
            }

            public Builder setGameIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceGameMessage) this.instance).setGameIdBytes(byteString);
                return this;
            }

            public Builder setGameType(String str) {
                copyOnWrite();
                ((VoiceGameMessage) this.instance).setGameType(str);
                return this;
            }

            public Builder setGameTypeBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceGameMessage) this.instance).setGameTypeBytes(byteString);
                return this;
            }

            public Builder setMsgType(MsgType msgType) {
                copyOnWrite();
                ((VoiceGameMessage) this.instance).setMsgType(msgType);
                return this;
            }

            public Builder setMsgTypeValue(int i) {
                copyOnWrite();
                ((VoiceGameMessage) this.instance).setMsgTypeValue(i);
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
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(voiceGameMessage);
        }

        public static VoiceGameMessage parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VoiceGameMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceGameMessage parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VoiceGameMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<VoiceGameMessage> parser() {
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
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

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C46611.f16699xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoiceGameMessage();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    VoiceGameMessage voiceGameMessage = (VoiceGameMessage) obj2;
                    int i = this.msgType_;
                    boolean z2 = i != 0;
                    int i2 = voiceGameMessage.msgType_;
                    this.msgType_ = interfaceC3409h.mo17051e(z2, i, i2 != 0, i2);
                    this.gameId_ = interfaceC3409h.mo17052f(!this.gameId_.isEmpty(), this.gameId_, !voiceGameMessage.gameId_.isEmpty(), voiceGameMessage.gameId_);
                    this.gameType_ = interfaceC3409h.mo17052f(!this.gameType_.isEmpty(), this.gameType_, !voiceGameMessage.gameType_.isEmpty(), voiceGameMessage.gameType_);
                    GeneratedMessageLite.C3408g c3408g = GeneratedMessageLite.C3408g.INSTANCE;
                    return this;
                case 6:
                    C3430e c3430e = (C3430e) obj;
                    while (!z) {
                        try {
                            int iM17171M = c3430e.m17171M();
                            if (iM17171M != 0) {
                                if (iM17171M == 8) {
                                    this.msgType_ = c3430e.m17191p();
                                } else if (iM17171M == 18) {
                                    this.gameId_ = c3430e.m17170L();
                                } else if (iM17171M == 26) {
                                    this.gameType_ = c3430e.m17170L();
                                } else if (!c3430e.m17176R(iM17171M)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            iig0.m140070a(e.setUnfinishedMessage(this));
                            return null;
                        } catch (IOException e2) {
                            iig0.m140070a(new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this));
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
                                    PARSER = new GeneratedMessageLite.C3404c(DEFAULT_INSTANCE);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return PARSER;
                default:
                    l710.m153113a();
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

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16977m = this.msgType_ != MsgType.unknown.getNumber() ? CodedOutputStream.m16977m(1, this.msgType_) : 0;
            if (!this.gameId_.isEmpty()) {
                iM16977m += CodedOutputStream.m16956K(2, getGameId());
            }
            if (!this.gameType_.isEmpty()) {
                iM16977m += CodedOutputStream.m16956K(3, getGameType());
            }
            this.memoizedSerializedSize = iM16977m;
            return iM16977m;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.msgType_ != MsgType.unknown.getNumber()) {
                codedOutputStream.m17015i0(1, this.msgType_);
            }
            if (!this.gameId_.isEmpty()) {
                codedOutputStream.mo16994D0(2, getGameId());
            }
            if (this.gameType_.isEmpty()) {
                return;
            }
            codedOutputStream.mo16994D0(3, getGameType());
        }

        public enum MsgType implements C3437l.c {
            unknown(0),
            start(1),
            end(2),
            UNRECOGNIZED(-1);

            public static final int end_VALUE = 2;
            private static final C3437l.d<MsgType> internalValueMap = new C3437l.d<MsgType>() { // from class: com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceGameMessage.MsgType.1
                @Override // com.google.protobuf.C3437l.d
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

            public static C3437l.d<MsgType> internalGetValueMap() {
                return internalValueMap;
            }

            @Override // com.google.protobuf.C3437l.c
            public final int getNumber() {
                return this.value;
            }

            @Deprecated
            public static MsgType valueOf(int i) {
                return forNumber(i);
            }
        }

        public static VoiceGameMessage parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (VoiceGameMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static VoiceGameMessage parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (VoiceGameMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        public static VoiceGameMessage parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoiceGameMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoiceGameMessage parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (VoiceGameMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static VoiceGameMessage parseFrom(InputStream inputStream) throws IOException {
            return (VoiceGameMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceGameMessage parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (VoiceGameMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static VoiceGameMessage parseFrom(C3430e c3430e) throws IOException {
            return (VoiceGameMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static VoiceGameMessage parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (VoiceGameMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }

    public static final class VoiceLiveLovePlanetUpdate extends GeneratedMessageLite<VoiceLiveLovePlanetUpdate, Builder> implements VoiceLiveLovePlanetUpdateOrBuilder {
        public static final int CURRENTTIME_FIELD_NUMBER = 2;
        private static final VoiceLiveLovePlanetUpdate DEFAULT_INSTANCE;
        public static final int HOST_FIELD_NUMBER = 5;
        public static final int LOVEPLANETID_FIELD_NUMBER = 3;
        public static final int MVP_FIELD_NUMBER = 4;
        private static volatile ng60<VoiceLiveLovePlanetUpdate> PARSER = null;
        public static final int PLAYERS_FIELD_NUMBER = 6;
        public static final int TEAMS_FIELD_NUMBER = 7;
        public static final int UPDATETYPE_FIELD_NUMBER = 1;
        private int bitField0_;
        private long currentTime_;
        private VoiceLovePlanetUser host_;
        private VoiceLovePlanetUser mvp_;
        private int updateType_;
        private String lovePlanetId_ = "";
        private C3437l.h<VoiceLovePlanetUser> players_ = GeneratedMessageLite.emptyProtobufList();
        private C3437l.h<VoiceLovePlanetTeam> teams_ = GeneratedMessageLite.emptyProtobufList();

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
            AbstractC3426a.addAll(iterable, this.players_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllTeams(Iterable<? extends VoiceLovePlanetTeam> iterable) {
            ensureTeamsIsMutable();
            AbstractC3426a.addAll(iterable, this.teams_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addPlayers(VoiceLovePlanetUser.Builder builder) {
            ensurePlayersIsMutable();
            this.players_.add(builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addTeams(VoiceLovePlanetTeam.Builder builder) {
            ensureTeamsIsMutable();
            this.teams_.add(builder.build());
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
            if (this.players_.mo17140q()) {
                return;
            }
            this.players_ = GeneratedMessageLite.mutableCopy(this.players_);
        }

        private void ensureTeamsIsMutable() {
            if (this.teams_.mo17140q()) {
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
                this.host_ = VoiceLovePlanetUser.newBuilder(this.host_).mergeFrom(voiceLovePlanetUser).buildPartial();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeMvp(VoiceLovePlanetUser voiceLovePlanetUser) {
            VoiceLovePlanetUser voiceLovePlanetUser2 = this.mvp_;
            if (voiceLovePlanetUser2 == null || voiceLovePlanetUser2 == VoiceLovePlanetUser.getDefaultInstance()) {
                this.mvp_ = voiceLovePlanetUser;
            } else {
                this.mvp_ = VoiceLovePlanetUser.newBuilder(this.mvp_).mergeFrom(voiceLovePlanetUser).buildPartial();
            }
        }

        public static Builder newBuilder(VoiceLiveLovePlanetUpdate voiceLiveLovePlanetUpdate) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(voiceLiveLovePlanetUpdate);
        }

        public static VoiceLiveLovePlanetUpdate parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VoiceLiveLovePlanetUpdate) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceLiveLovePlanetUpdate parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VoiceLiveLovePlanetUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<VoiceLiveLovePlanetUpdate> parser() {
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
            this.host_ = builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLovePlanetId(String str) {
            str.getClass();
            this.lovePlanetId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLovePlanetIdBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.lovePlanetId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMvp(VoiceLovePlanetUser.Builder builder) {
            this.mvp_ = builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPlayers(int i, VoiceLovePlanetUser.Builder builder) {
            ensurePlayersIsMutable();
            this.players_.set(i, builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTeams(int i, VoiceLovePlanetTeam.Builder builder) {
            ensureTeamsIsMutable();
            this.teams_.set(i, builder.build());
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

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C46611.f16699xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoiceLiveLovePlanetUpdate();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.players_.mo17139n();
                    this.teams_.mo17139n();
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    VoiceLiveLovePlanetUpdate voiceLiveLovePlanetUpdate = (VoiceLiveLovePlanetUpdate) obj2;
                    int i = this.updateType_;
                    boolean z2 = i != 0;
                    int i2 = voiceLiveLovePlanetUpdate.updateType_;
                    this.updateType_ = interfaceC3409h.mo17051e(z2, i, i2 != 0, i2);
                    long j = this.currentTime_;
                    boolean z3 = j != 0;
                    long j2 = voiceLiveLovePlanetUpdate.currentTime_;
                    this.currentTime_ = interfaceC3409h.mo17055i(z3, j, j2 != 0, j2);
                    this.lovePlanetId_ = interfaceC3409h.mo17052f(!this.lovePlanetId_.isEmpty(), this.lovePlanetId_, !voiceLiveLovePlanetUpdate.lovePlanetId_.isEmpty(), voiceLiveLovePlanetUpdate.lovePlanetId_);
                    this.mvp_ = (VoiceLovePlanetUser) interfaceC3409h.mo17061o(this.mvp_, voiceLiveLovePlanetUpdate.mvp_);
                    this.host_ = (VoiceLovePlanetUser) interfaceC3409h.mo17061o(this.host_, voiceLiveLovePlanetUpdate.host_);
                    this.players_ = interfaceC3409h.mo17053g(this.players_, voiceLiveLovePlanetUpdate.players_);
                    this.teams_ = interfaceC3409h.mo17053g(this.teams_, voiceLiveLovePlanetUpdate.teams_);
                    if (interfaceC3409h == GeneratedMessageLite.C3408g.INSTANCE) {
                        this.bitField0_ |= voiceLiveLovePlanetUpdate.bitField0_;
                    }
                    return this;
                case 6:
                    C3430e c3430e = (C3430e) obj;
                    C3433h c3433h = (C3433h) obj2;
                    while (!z) {
                        try {
                            int iM17171M = c3430e.m17171M();
                            if (iM17171M != 0) {
                                if (iM17171M == 8) {
                                    this.updateType_ = c3430e.m17191p();
                                } else if (iM17171M == 16) {
                                    this.currentTime_ = c3430e.m17197v();
                                } else if (iM17171M == 26) {
                                    this.lovePlanetId_ = c3430e.m17170L();
                                } else if (iM17171M == 34) {
                                    VoiceLovePlanetUser voiceLovePlanetUser = this.mvp_;
                                    VoiceLovePlanetUser.Builder builder = voiceLovePlanetUser != null ? voiceLovePlanetUser.toBuilder() : null;
                                    VoiceLovePlanetUser voiceLovePlanetUser2 = (VoiceLovePlanetUser) c3430e.m17198w(VoiceLovePlanetUser.parser(), c3433h);
                                    this.mvp_ = voiceLovePlanetUser2;
                                    if (builder != null) {
                                        builder.mergeFrom(voiceLovePlanetUser2);
                                        this.mvp_ = builder.buildPartial();
                                    }
                                } else if (iM17171M == 42) {
                                    VoiceLovePlanetUser voiceLovePlanetUser3 = this.host_;
                                    VoiceLovePlanetUser.Builder builder2 = voiceLovePlanetUser3 != null ? voiceLovePlanetUser3.toBuilder() : null;
                                    VoiceLovePlanetUser voiceLovePlanetUser4 = (VoiceLovePlanetUser) c3430e.m17198w(VoiceLovePlanetUser.parser(), c3433h);
                                    this.host_ = voiceLovePlanetUser4;
                                    if (builder2 != null) {
                                        builder2.mergeFrom(voiceLovePlanetUser4);
                                        this.host_ = builder2.buildPartial();
                                    }
                                } else if (iM17171M == 50) {
                                    if (!this.players_.mo17140q()) {
                                        this.players_ = GeneratedMessageLite.mutableCopy(this.players_);
                                    }
                                    this.players_.add((VoiceLovePlanetUser) c3430e.m17198w(VoiceLovePlanetUser.parser(), c3433h));
                                } else if (iM17171M == 58) {
                                    if (!this.teams_.mo17140q()) {
                                        this.teams_ = GeneratedMessageLite.mutableCopy(this.teams_);
                                    }
                                    this.teams_.add((VoiceLovePlanetTeam) c3430e.m17198w(VoiceLovePlanetTeam.parser(), c3433h));
                                } else if (!c3430e.m17176R(iM17171M)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            iig0.m140070a(e.setUnfinishedMessage(this));
                            return null;
                        } catch (IOException e2) {
                            iig0.m140070a(new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this));
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
                                    PARSER = new GeneratedMessageLite.C3404c(DEFAULT_INSTANCE);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return PARSER;
                default:
                    l710.m153113a();
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
            return this.players_.get(i);
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
            return this.players_.get(i);
        }

        public List<? extends VoiceLovePlanetUserOrBuilder> getPlayersOrBuilderList() {
            return this.players_;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16977m = this.updateType_ != Type.refreshLovePlanet.getNumber() ? CodedOutputStream.m16977m(1, this.updateType_) : 0;
            long j = this.currentTime_;
            if (j != 0) {
                iM16977m += CodedOutputStream.m16986v(2, j);
            }
            if (!this.lovePlanetId_.isEmpty()) {
                iM16977m += CodedOutputStream.m16956K(3, getLovePlanetId());
            }
            if (this.mvp_ != null) {
                iM16977m += CodedOutputStream.m16948C(4, getMvp());
            }
            if (this.host_ != null) {
                iM16977m += CodedOutputStream.m16948C(5, getHost());
            }
            for (int i2 = 0; i2 < this.players_.size(); i2++) {
                iM16977m += CodedOutputStream.m16948C(6, this.players_.get(i2));
            }
            for (int i3 = 0; i3 < this.teams_.size(); i3++) {
                iM16977m += CodedOutputStream.m16948C(7, this.teams_.get(i3));
            }
            this.memoizedSerializedSize = iM16977m;
            return iM16977m;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLiveLovePlanetUpdateOrBuilder
        public VoiceLovePlanetTeam getTeams(int i) {
            return this.teams_.get(i);
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
            return this.teams_.get(i);
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

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.updateType_ != Type.refreshLovePlanet.getNumber()) {
                codedOutputStream.m17015i0(1, this.updateType_);
            }
            long j = this.currentTime_;
            if (j != 0) {
                codedOutputStream.m17027u0(2, j);
            }
            if (!this.lovePlanetId_.isEmpty()) {
                codedOutputStream.mo16994D0(3, getLovePlanetId());
            }
            if (this.mvp_ != null) {
                codedOutputStream.mo17029w0(4, getMvp());
            }
            if (this.host_ != null) {
                codedOutputStream.mo17029w0(5, getHost());
            }
            for (int i = 0; i < this.players_.size(); i++) {
                codedOutputStream.mo17029w0(6, this.players_.get(i));
            }
            for (int i2 = 0; i2 < this.teams_.size(); i2++) {
                codedOutputStream.mo17029w0(7, this.teams_.get(i2));
            }
        }

        public enum Type implements C3437l.c {
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
            private static final C3437l.d<Type> internalValueMap = new C3437l.d<Type>() { // from class: com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLiveLovePlanetUpdate.Type.1
                @Override // com.google.protobuf.C3437l.d
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

            public static C3437l.d<Type> internalGetValueMap() {
                return internalValueMap;
            }

            @Override // com.google.protobuf.C3437l.c
            public final int getNumber() {
                return this.value;
            }

            @Deprecated
            public static Type valueOf(int i) {
                return forNumber(i);
            }
        }

        public static VoiceLiveLovePlanetUpdate parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (VoiceLiveLovePlanetUpdate) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static VoiceLiveLovePlanetUpdate parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (VoiceLiveLovePlanetUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
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

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<VoiceLiveLovePlanetUpdate, Builder> implements VoiceLiveLovePlanetUpdateOrBuilder {
            private Builder() {
                super(VoiceLiveLovePlanetUpdate.DEFAULT_INSTANCE);
            }

            public Builder addAllPlayers(Iterable<? extends VoiceLovePlanetUser> iterable) {
                copyOnWrite();
                ((VoiceLiveLovePlanetUpdate) this.instance).addAllPlayers(iterable);
                return this;
            }

            public Builder addAllTeams(Iterable<? extends VoiceLovePlanetTeam> iterable) {
                copyOnWrite();
                ((VoiceLiveLovePlanetUpdate) this.instance).addAllTeams(iterable);
                return this;
            }

            public Builder addPlayers(VoiceLovePlanetUser voiceLovePlanetUser) {
                copyOnWrite();
                ((VoiceLiveLovePlanetUpdate) this.instance).addPlayers(voiceLovePlanetUser);
                return this;
            }

            public Builder addTeams(VoiceLovePlanetTeam voiceLovePlanetTeam) {
                copyOnWrite();
                ((VoiceLiveLovePlanetUpdate) this.instance).addTeams(voiceLovePlanetTeam);
                return this;
            }

            public Builder clearCurrentTime() {
                copyOnWrite();
                ((VoiceLiveLovePlanetUpdate) this.instance).clearCurrentTime();
                return this;
            }

            public Builder clearHost() {
                copyOnWrite();
                ((VoiceLiveLovePlanetUpdate) this.instance).clearHost();
                return this;
            }

            public Builder clearLovePlanetId() {
                copyOnWrite();
                ((VoiceLiveLovePlanetUpdate) this.instance).clearLovePlanetId();
                return this;
            }

            public Builder clearMvp() {
                copyOnWrite();
                ((VoiceLiveLovePlanetUpdate) this.instance).clearMvp();
                return this;
            }

            public Builder clearPlayers() {
                copyOnWrite();
                ((VoiceLiveLovePlanetUpdate) this.instance).clearPlayers();
                return this;
            }

            public Builder clearTeams() {
                copyOnWrite();
                ((VoiceLiveLovePlanetUpdate) this.instance).clearTeams();
                return this;
            }

            public Builder clearUpdateType() {
                copyOnWrite();
                ((VoiceLiveLovePlanetUpdate) this.instance).clearUpdateType();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLiveLovePlanetUpdateOrBuilder
            public long getCurrentTime() {
                return ((VoiceLiveLovePlanetUpdate) this.instance).getCurrentTime();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLiveLovePlanetUpdateOrBuilder
            public VoiceLovePlanetUser getHost() {
                return ((VoiceLiveLovePlanetUpdate) this.instance).getHost();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLiveLovePlanetUpdateOrBuilder
            public String getLovePlanetId() {
                return ((VoiceLiveLovePlanetUpdate) this.instance).getLovePlanetId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLiveLovePlanetUpdateOrBuilder
            public ByteString getLovePlanetIdBytes() {
                return ((VoiceLiveLovePlanetUpdate) this.instance).getLovePlanetIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLiveLovePlanetUpdateOrBuilder
            public VoiceLovePlanetUser getMvp() {
                return ((VoiceLiveLovePlanetUpdate) this.instance).getMvp();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLiveLovePlanetUpdateOrBuilder
            public VoiceLovePlanetUser getPlayers(int i) {
                return ((VoiceLiveLovePlanetUpdate) this.instance).getPlayers(i);
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLiveLovePlanetUpdateOrBuilder
            public int getPlayersCount() {
                return ((VoiceLiveLovePlanetUpdate) this.instance).getPlayersCount();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLiveLovePlanetUpdateOrBuilder
            public List<VoiceLovePlanetUser> getPlayersList() {
                return Collections.unmodifiableList(((VoiceLiveLovePlanetUpdate) this.instance).getPlayersList());
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLiveLovePlanetUpdateOrBuilder
            public VoiceLovePlanetTeam getTeams(int i) {
                return ((VoiceLiveLovePlanetUpdate) this.instance).getTeams(i);
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLiveLovePlanetUpdateOrBuilder
            public int getTeamsCount() {
                return ((VoiceLiveLovePlanetUpdate) this.instance).getTeamsCount();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLiveLovePlanetUpdateOrBuilder
            public List<VoiceLovePlanetTeam> getTeamsList() {
                return Collections.unmodifiableList(((VoiceLiveLovePlanetUpdate) this.instance).getTeamsList());
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLiveLovePlanetUpdateOrBuilder
            public Type getUpdateType() {
                return ((VoiceLiveLovePlanetUpdate) this.instance).getUpdateType();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLiveLovePlanetUpdateOrBuilder
            public int getUpdateTypeValue() {
                return ((VoiceLiveLovePlanetUpdate) this.instance).getUpdateTypeValue();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLiveLovePlanetUpdateOrBuilder
            public boolean hasHost() {
                return ((VoiceLiveLovePlanetUpdate) this.instance).hasHost();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLiveLovePlanetUpdateOrBuilder
            public boolean hasMvp() {
                return ((VoiceLiveLovePlanetUpdate) this.instance).hasMvp();
            }

            public Builder mergeHost(VoiceLovePlanetUser voiceLovePlanetUser) {
                copyOnWrite();
                ((VoiceLiveLovePlanetUpdate) this.instance).mergeHost(voiceLovePlanetUser);
                return this;
            }

            public Builder mergeMvp(VoiceLovePlanetUser voiceLovePlanetUser) {
                copyOnWrite();
                ((VoiceLiveLovePlanetUpdate) this.instance).mergeMvp(voiceLovePlanetUser);
                return this;
            }

            public Builder removePlayers(int i) {
                copyOnWrite();
                ((VoiceLiveLovePlanetUpdate) this.instance).removePlayers(i);
                return this;
            }

            public Builder removeTeams(int i) {
                copyOnWrite();
                ((VoiceLiveLovePlanetUpdate) this.instance).removeTeams(i);
                return this;
            }

            public Builder setCurrentTime(long j) {
                copyOnWrite();
                ((VoiceLiveLovePlanetUpdate) this.instance).setCurrentTime(j);
                return this;
            }

            public Builder setHost(VoiceLovePlanetUser voiceLovePlanetUser) {
                copyOnWrite();
                ((VoiceLiveLovePlanetUpdate) this.instance).setHost(voiceLovePlanetUser);
                return this;
            }

            public Builder setLovePlanetId(String str) {
                copyOnWrite();
                ((VoiceLiveLovePlanetUpdate) this.instance).setLovePlanetId(str);
                return this;
            }

            public Builder setLovePlanetIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceLiveLovePlanetUpdate) this.instance).setLovePlanetIdBytes(byteString);
                return this;
            }

            public Builder setMvp(VoiceLovePlanetUser voiceLovePlanetUser) {
                copyOnWrite();
                ((VoiceLiveLovePlanetUpdate) this.instance).setMvp(voiceLovePlanetUser);
                return this;
            }

            public Builder setPlayers(int i, VoiceLovePlanetUser voiceLovePlanetUser) {
                copyOnWrite();
                ((VoiceLiveLovePlanetUpdate) this.instance).setPlayers(i, voiceLovePlanetUser);
                return this;
            }

            public Builder setTeams(int i, VoiceLovePlanetTeam voiceLovePlanetTeam) {
                copyOnWrite();
                ((VoiceLiveLovePlanetUpdate) this.instance).setTeams(i, voiceLovePlanetTeam);
                return this;
            }

            public Builder setUpdateType(Type type) {
                copyOnWrite();
                ((VoiceLiveLovePlanetUpdate) this.instance).setUpdateType(type);
                return this;
            }

            public Builder setUpdateTypeValue(int i) {
                copyOnWrite();
                ((VoiceLiveLovePlanetUpdate) this.instance).setUpdateTypeValue(i);
                return this;
            }

            public Builder addPlayers(int i, VoiceLovePlanetUser voiceLovePlanetUser) {
                copyOnWrite();
                ((VoiceLiveLovePlanetUpdate) this.instance).addPlayers(i, voiceLovePlanetUser);
                return this;
            }

            public Builder addTeams(int i, VoiceLovePlanetTeam voiceLovePlanetTeam) {
                copyOnWrite();
                ((VoiceLiveLovePlanetUpdate) this.instance).addTeams(i, voiceLovePlanetTeam);
                return this;
            }

            public Builder setHost(VoiceLovePlanetUser.Builder builder) {
                copyOnWrite();
                ((VoiceLiveLovePlanetUpdate) this.instance).setHost(builder);
                return this;
            }

            public Builder setMvp(VoiceLovePlanetUser.Builder builder) {
                copyOnWrite();
                ((VoiceLiveLovePlanetUpdate) this.instance).setMvp(builder);
                return this;
            }

            public Builder setPlayers(int i, VoiceLovePlanetUser.Builder builder) {
                copyOnWrite();
                ((VoiceLiveLovePlanetUpdate) this.instance).setPlayers(i, builder);
                return this;
            }

            public Builder setTeams(int i, VoiceLovePlanetTeam.Builder builder) {
                copyOnWrite();
                ((VoiceLiveLovePlanetUpdate) this.instance).setTeams(i, builder);
                return this;
            }

            public Builder addPlayers(VoiceLovePlanetUser.Builder builder) {
                copyOnWrite();
                ((VoiceLiveLovePlanetUpdate) this.instance).addPlayers(builder);
                return this;
            }

            public Builder addTeams(VoiceLovePlanetTeam.Builder builder) {
                copyOnWrite();
                ((VoiceLiveLovePlanetUpdate) this.instance).addTeams(builder);
                return this;
            }

            public Builder addPlayers(int i, VoiceLovePlanetUser.Builder builder) {
                copyOnWrite();
                ((VoiceLiveLovePlanetUpdate) this.instance).addPlayers(i, builder);
                return this;
            }

            public Builder addTeams(int i, VoiceLovePlanetTeam.Builder builder) {
                copyOnWrite();
                ((VoiceLiveLovePlanetUpdate) this.instance).addTeams(i, builder);
                return this;
            }
        }

        public static VoiceLiveLovePlanetUpdate parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoiceLiveLovePlanetUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoiceLiveLovePlanetUpdate parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (VoiceLiveLovePlanetUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static VoiceLiveLovePlanetUpdate parseFrom(InputStream inputStream) throws IOException {
            return (VoiceLiveLovePlanetUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceLiveLovePlanetUpdate parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (VoiceLiveLovePlanetUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static VoiceLiveLovePlanetUpdate parseFrom(C3430e c3430e) throws IOException {
            return (VoiceLiveLovePlanetUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
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
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static VoiceLiveLovePlanetUpdate parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (VoiceLiveLovePlanetUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
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
            this.players_.add(i, builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addTeams(int i, VoiceLovePlanetTeam.Builder builder) {
            ensureTeamsIsMutable();
            this.teams_.add(i, builder.build());
        }
    }

    public static final class VoiceSettleMessage extends GeneratedMessageLite<VoiceSettleMessage, Builder> implements VoiceSettleMessageOrBuilder {
        private static final VoiceSettleMessage DEFAULT_INSTANCE;
        public static final int ID_FIELD_NUMBER = 2;
        public static final int MSGTYPE_FIELD_NUMBER = 1;
        private static volatile ng60<VoiceSettleMessage> PARSER = null;
        public static final int ROOMID_FIELD_NUMBER = 4;
        public static final int USERID_FIELD_NUMBER = 3;
        private int msgType_;
        private String id_ = "";
        private String userId_ = "";
        private String roomId_ = "";

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<VoiceSettleMessage, Builder> implements VoiceSettleMessageOrBuilder {
            private Builder() {
                super(VoiceSettleMessage.DEFAULT_INSTANCE);
            }

            public Builder clearId() {
                copyOnWrite();
                ((VoiceSettleMessage) this.instance).clearId();
                return this;
            }

            public Builder clearMsgType() {
                copyOnWrite();
                ((VoiceSettleMessage) this.instance).clearMsgType();
                return this;
            }

            public Builder clearRoomId() {
                copyOnWrite();
                ((VoiceSettleMessage) this.instance).clearRoomId();
                return this;
            }

            public Builder clearUserId() {
                copyOnWrite();
                ((VoiceSettleMessage) this.instance).clearUserId();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceSettleMessageOrBuilder
            public String getId() {
                return ((VoiceSettleMessage) this.instance).getId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceSettleMessageOrBuilder
            public ByteString getIdBytes() {
                return ((VoiceSettleMessage) this.instance).getIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceSettleMessageOrBuilder
            public MsgType getMsgType() {
                return ((VoiceSettleMessage) this.instance).getMsgType();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceSettleMessageOrBuilder
            public int getMsgTypeValue() {
                return ((VoiceSettleMessage) this.instance).getMsgTypeValue();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceSettleMessageOrBuilder
            public String getRoomId() {
                return ((VoiceSettleMessage) this.instance).getRoomId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceSettleMessageOrBuilder
            public ByteString getRoomIdBytes() {
                return ((VoiceSettleMessage) this.instance).getRoomIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceSettleMessageOrBuilder
            public String getUserId() {
                return ((VoiceSettleMessage) this.instance).getUserId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceSettleMessageOrBuilder
            public ByteString getUserIdBytes() {
                return ((VoiceSettleMessage) this.instance).getUserIdBytes();
            }

            public Builder setId(String str) {
                copyOnWrite();
                ((VoiceSettleMessage) this.instance).setId(str);
                return this;
            }

            public Builder setIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceSettleMessage) this.instance).setIdBytes(byteString);
                return this;
            }

            public Builder setMsgType(MsgType msgType) {
                copyOnWrite();
                ((VoiceSettleMessage) this.instance).setMsgType(msgType);
                return this;
            }

            public Builder setMsgTypeValue(int i) {
                copyOnWrite();
                ((VoiceSettleMessage) this.instance).setMsgTypeValue(i);
                return this;
            }

            public Builder setRoomId(String str) {
                copyOnWrite();
                ((VoiceSettleMessage) this.instance).setRoomId(str);
                return this;
            }

            public Builder setRoomIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceSettleMessage) this.instance).setRoomIdBytes(byteString);
                return this;
            }

            public Builder setUserId(String str) {
                copyOnWrite();
                ((VoiceSettleMessage) this.instance).setUserId(str);
                return this;
            }

            public Builder setUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceSettleMessage) this.instance).setUserIdBytes(byteString);
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
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(voiceSettleMessage);
        }

        public static VoiceSettleMessage parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VoiceSettleMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceSettleMessage parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VoiceSettleMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<VoiceSettleMessage> parser() {
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.userId_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C46611.f16699xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoiceSettleMessage();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    VoiceSettleMessage voiceSettleMessage = (VoiceSettleMessage) obj2;
                    int i = this.msgType_;
                    boolean z2 = i != 0;
                    int i2 = voiceSettleMessage.msgType_;
                    this.msgType_ = interfaceC3409h.mo17051e(z2, i, i2 != 0, i2);
                    this.id_ = interfaceC3409h.mo17052f(!this.id_.isEmpty(), this.id_, !voiceSettleMessage.id_.isEmpty(), voiceSettleMessage.id_);
                    this.userId_ = interfaceC3409h.mo17052f(!this.userId_.isEmpty(), this.userId_, !voiceSettleMessage.userId_.isEmpty(), voiceSettleMessage.userId_);
                    this.roomId_ = interfaceC3409h.mo17052f(!this.roomId_.isEmpty(), this.roomId_, !voiceSettleMessage.roomId_.isEmpty(), voiceSettleMessage.roomId_);
                    GeneratedMessageLite.C3408g c3408g = GeneratedMessageLite.C3408g.INSTANCE;
                    return this;
                case 6:
                    C3430e c3430e = (C3430e) obj;
                    while (!z) {
                        try {
                            int iM17171M = c3430e.m17171M();
                            if (iM17171M != 0) {
                                if (iM17171M == 8) {
                                    this.msgType_ = c3430e.m17191p();
                                } else if (iM17171M == 18) {
                                    this.id_ = c3430e.m17170L();
                                } else if (iM17171M == 26) {
                                    this.userId_ = c3430e.m17170L();
                                } else if (iM17171M == 34) {
                                    this.roomId_ = c3430e.m17170L();
                                } else if (!c3430e.m17176R(iM17171M)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            iig0.m140070a(e.setUnfinishedMessage(this));
                            return null;
                        } catch (IOException e2) {
                            iig0.m140070a(new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this));
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
                                    PARSER = new GeneratedMessageLite.C3404c(DEFAULT_INSTANCE);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return PARSER;
                default:
                    l710.m153113a();
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

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16977m = this.msgType_ != MsgType.apply.getNumber() ? CodedOutputStream.m16977m(1, this.msgType_) : 0;
            if (!this.id_.isEmpty()) {
                iM16977m += CodedOutputStream.m16956K(2, getId());
            }
            if (!this.userId_.isEmpty()) {
                iM16977m += CodedOutputStream.m16956K(3, getUserId());
            }
            if (!this.roomId_.isEmpty()) {
                iM16977m += CodedOutputStream.m16956K(4, getRoomId());
            }
            this.memoizedSerializedSize = iM16977m;
            return iM16977m;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceSettleMessageOrBuilder
        public String getUserId() {
            return this.userId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceSettleMessageOrBuilder
        public ByteString getUserIdBytes() {
            return ByteString.copyFromUtf8(this.userId_);
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.msgType_ != MsgType.apply.getNumber()) {
                codedOutputStream.m17015i0(1, this.msgType_);
            }
            if (!this.id_.isEmpty()) {
                codedOutputStream.mo16994D0(2, getId());
            }
            if (!this.userId_.isEmpty()) {
                codedOutputStream.mo16994D0(3, getUserId());
            }
            if (this.roomId_.isEmpty()) {
                return;
            }
            codedOutputStream.mo16994D0(4, getRoomId());
        }

        public enum MsgType implements C3437l.c {
            apply(0),
            approve(1),
            reject(2),
            quit(3),
            updateSettledCount(4),
            UNRECOGNIZED(-1);

            public static final int apply_VALUE = 0;
            public static final int approve_VALUE = 1;
            private static final C3437l.d<MsgType> internalValueMap = new C3437l.d<MsgType>() { // from class: com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceSettleMessage.MsgType.1
                @Override // com.google.protobuf.C3437l.d
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

            public static C3437l.d<MsgType> internalGetValueMap() {
                return internalValueMap;
            }

            @Override // com.google.protobuf.C3437l.c
            public final int getNumber() {
                return this.value;
            }

            @Deprecated
            public static MsgType valueOf(int i) {
                return forNumber(i);
            }
        }

        public static VoiceSettleMessage parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (VoiceSettleMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static VoiceSettleMessage parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (VoiceSettleMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        public static VoiceSettleMessage parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoiceSettleMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoiceSettleMessage parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (VoiceSettleMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static VoiceSettleMessage parseFrom(InputStream inputStream) throws IOException {
            return (VoiceSettleMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceSettleMessage parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (VoiceSettleMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static VoiceSettleMessage parseFrom(C3430e c3430e) throws IOException {
            return (VoiceSettleMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static VoiceSettleMessage parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (VoiceSettleMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }

    public static final class VoiceShareScreen extends GeneratedMessageLite<VoiceShareScreen, Builder> implements VoiceShareScreenOrBuilder {
        private static final VoiceShareScreen DEFAULT_INSTANCE;
        public static final int DESC_FIELD_NUMBER = 9;
        public static final int ID_FIELD_NUMBER = 1;
        private static volatile ng60<VoiceShareScreen> PARSER = null;
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
                this.templateData_ = Template.TemplateData.newBuilder(this.templateData_).mergeFrom(templateData).buildPartial();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeUserMask(userMaskConfig.UserMask userMask) {
            userMaskConfig.UserMask userMask2 = this.userMask_;
            if (userMask2 == null || userMask2 == userMaskConfig.UserMask.getDefaultInstance()) {
                this.userMask_ = userMask;
            } else {
                this.userMask_ = userMaskConfig.UserMask.newBuilder(this.userMask_).mergeFrom(userMask).buildPartial();
            }
        }

        public static Builder newBuilder(VoiceShareScreen voiceShareScreen) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(voiceShareScreen);
        }

        public static VoiceShareScreen parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VoiceShareScreen) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceShareScreen parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VoiceShareScreen) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<VoiceShareScreen> parser() {
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
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
            this.templateData_ = builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setToast(String str) {
            str.getClass();
            this.toast_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setToastBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.userId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserMask(userMaskConfig.UserMask.Builder builder) {
            this.userMask_ = builder.build();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C46611.f16699xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoiceShareScreen();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    VoiceShareScreen voiceShareScreen = (VoiceShareScreen) obj2;
                    this.id_ = interfaceC3409h.mo17052f(!this.id_.isEmpty(), this.id_, !voiceShareScreen.id_.isEmpty(), voiceShareScreen.id_);
                    this.userId_ = interfaceC3409h.mo17052f(!this.userId_.isEmpty(), this.userId_, !voiceShareScreen.userId_.isEmpty(), voiceShareScreen.userId_);
                    this.roomId_ = interfaceC3409h.mo17052f(!this.roomId_.isEmpty(), this.roomId_, !voiceShareScreen.roomId_.isEmpty(), voiceShareScreen.roomId_);
                    int i = this.status_;
                    boolean z2 = i != 0;
                    int i2 = voiceShareScreen.status_;
                    this.status_ = interfaceC3409h.mo17051e(z2, i, i2 != 0, i2);
                    this.userMask_ = (userMaskConfig.UserMask) interfaceC3409h.mo17061o(this.userMask_, voiceShareScreen.userMask_);
                    this.templateData_ = (Template.TemplateData) interfaceC3409h.mo17061o(this.templateData_, voiceShareScreen.templateData_);
                    this.toast_ = interfaceC3409h.mo17052f(!this.toast_.isEmpty(), this.toast_, !voiceShareScreen.toast_.isEmpty(), voiceShareScreen.toast_);
                    float f = this.ratio_;
                    boolean z3 = f != 0.0f;
                    float f2 = voiceShareScreen.ratio_;
                    this.ratio_ = interfaceC3409h.mo17062p(z3, f, f2 != 0.0f, f2);
                    this.desc_ = interfaceC3409h.mo17052f(!this.desc_.isEmpty(), this.desc_, !voiceShareScreen.desc_.isEmpty(), voiceShareScreen.desc_);
                    GeneratedMessageLite.C3408g c3408g = GeneratedMessageLite.C3408g.INSTANCE;
                    return this;
                case 6:
                    C3430e c3430e = (C3430e) obj;
                    C3433h c3433h = (C3433h) obj2;
                    while (!z) {
                        try {
                            int iM17171M = c3430e.m17171M();
                            if (iM17171M != 0) {
                                if (iM17171M == 10) {
                                    this.id_ = c3430e.m17170L();
                                } else if (iM17171M == 18) {
                                    this.userId_ = c3430e.m17170L();
                                } else if (iM17171M == 26) {
                                    this.roomId_ = c3430e.m17170L();
                                } else if (iM17171M == 32) {
                                    this.status_ = c3430e.m17191p();
                                } else if (iM17171M == 42) {
                                    userMaskConfig.UserMask userMask = this.userMask_;
                                    userMaskConfig.UserMask.Builder builder = userMask != null ? userMask.toBuilder() : null;
                                    userMaskConfig.UserMask userMask2 = (userMaskConfig.UserMask) c3430e.m17198w(userMaskConfig.UserMask.parser(), c3433h);
                                    this.userMask_ = userMask2;
                                    if (builder != null) {
                                        builder.mergeFrom(userMask2);
                                        this.userMask_ = builder.buildPartial();
                                    }
                                } else if (iM17171M == 50) {
                                    Template.TemplateData templateData = this.templateData_;
                                    Template.TemplateData.Builder builder2 = templateData != null ? templateData.toBuilder() : null;
                                    Template.TemplateData templateData2 = (Template.TemplateData) c3430e.m17198w(Template.TemplateData.parser(), c3433h);
                                    this.templateData_ = templateData2;
                                    if (builder2 != null) {
                                        builder2.mergeFrom(templateData2);
                                        this.templateData_ = builder2.buildPartial();
                                    }
                                } else if (iM17171M == 58) {
                                    this.toast_ = c3430e.m17170L();
                                } else if (iM17171M == 69) {
                                    this.ratio_ = c3430e.m17194s();
                                } else if (iM17171M == 74) {
                                    this.desc_ = c3430e.m17170L();
                                } else if (!c3430e.m17176R(iM17171M)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            iig0.m140070a(e.setUnfinishedMessage(this));
                            return null;
                        } catch (IOException e2) {
                            iig0.m140070a(new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this));
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
                                    PARSER = new GeneratedMessageLite.C3404c(DEFAULT_INSTANCE);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return PARSER;
                default:
                    l710.m153113a();
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

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16956K = !this.id_.isEmpty() ? CodedOutputStream.m16956K(1, getId()) : 0;
            if (!this.userId_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(2, getUserId());
            }
            if (!this.roomId_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(3, getRoomId());
            }
            if (this.status_ != Status.start.getNumber()) {
                iM16956K += CodedOutputStream.m16977m(4, this.status_);
            }
            if (this.userMask_ != null) {
                iM16956K += CodedOutputStream.m16948C(5, getUserMask());
            }
            if (this.templateData_ != null) {
                iM16956K += CodedOutputStream.m16948C(6, getTemplateData());
            }
            if (!this.toast_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(7, getToast());
            }
            float f = this.ratio_;
            if (f != 0.0f) {
                iM16956K += CodedOutputStream.m16981q(8, f);
            }
            if (!this.desc_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(9, getDesc());
            }
            this.memoizedSerializedSize = iM16956K;
            return iM16956K;
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

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.id_.isEmpty()) {
                codedOutputStream.mo16994D0(1, getId());
            }
            if (!this.userId_.isEmpty()) {
                codedOutputStream.mo16994D0(2, getUserId());
            }
            if (!this.roomId_.isEmpty()) {
                codedOutputStream.mo16994D0(3, getRoomId());
            }
            if (this.status_ != Status.start.getNumber()) {
                codedOutputStream.m17015i0(4, this.status_);
            }
            if (this.userMask_ != null) {
                codedOutputStream.mo17029w0(5, getUserMask());
            }
            if (this.templateData_ != null) {
                codedOutputStream.mo17029w0(6, getTemplateData());
            }
            if (!this.toast_.isEmpty()) {
                codedOutputStream.mo16994D0(7, getToast());
            }
            float f = this.ratio_;
            if (f != 0.0f) {
                codedOutputStream.m17021o0(8, f);
            }
            if (this.desc_.isEmpty()) {
                return;
            }
            codedOutputStream.mo16994D0(9, getDesc());
        }

        public enum Status implements C3437l.c {
            start(0),
            sharing(1),
            stopped(2),
            UNRECOGNIZED(-1);

            private static final C3437l.d<Status> internalValueMap = new C3437l.d<Status>() { // from class: com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceShareScreen.Status.1
                @Override // com.google.protobuf.C3437l.d
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

            public static C3437l.d<Status> internalGetValueMap() {
                return internalValueMap;
            }

            @Override // com.google.protobuf.C3437l.c
            public final int getNumber() {
                return this.value;
            }

            @Deprecated
            public static Status valueOf(int i) {
                return forNumber(i);
            }
        }

        public static VoiceShareScreen parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (VoiceShareScreen) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static VoiceShareScreen parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (VoiceShareScreen) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
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

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<VoiceShareScreen, Builder> implements VoiceShareScreenOrBuilder {
            private Builder() {
                super(VoiceShareScreen.DEFAULT_INSTANCE);
            }

            public Builder clearDesc() {
                copyOnWrite();
                ((VoiceShareScreen) this.instance).clearDesc();
                return this;
            }

            public Builder clearId() {
                copyOnWrite();
                ((VoiceShareScreen) this.instance).clearId();
                return this;
            }

            public Builder clearRatio() {
                copyOnWrite();
                ((VoiceShareScreen) this.instance).clearRatio();
                return this;
            }

            public Builder clearRoomId() {
                copyOnWrite();
                ((VoiceShareScreen) this.instance).clearRoomId();
                return this;
            }

            public Builder clearStatus() {
                copyOnWrite();
                ((VoiceShareScreen) this.instance).clearStatus();
                return this;
            }

            public Builder clearTemplateData() {
                copyOnWrite();
                ((VoiceShareScreen) this.instance).clearTemplateData();
                return this;
            }

            public Builder clearToast() {
                copyOnWrite();
                ((VoiceShareScreen) this.instance).clearToast();
                return this;
            }

            public Builder clearUserId() {
                copyOnWrite();
                ((VoiceShareScreen) this.instance).clearUserId();
                return this;
            }

            public Builder clearUserMask() {
                copyOnWrite();
                ((VoiceShareScreen) this.instance).clearUserMask();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceShareScreenOrBuilder
            public String getDesc() {
                return ((VoiceShareScreen) this.instance).getDesc();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceShareScreenOrBuilder
            public ByteString getDescBytes() {
                return ((VoiceShareScreen) this.instance).getDescBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceShareScreenOrBuilder
            public String getId() {
                return ((VoiceShareScreen) this.instance).getId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceShareScreenOrBuilder
            public ByteString getIdBytes() {
                return ((VoiceShareScreen) this.instance).getIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceShareScreenOrBuilder
            public float getRatio() {
                return ((VoiceShareScreen) this.instance).getRatio();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceShareScreenOrBuilder
            public String getRoomId() {
                return ((VoiceShareScreen) this.instance).getRoomId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceShareScreenOrBuilder
            public ByteString getRoomIdBytes() {
                return ((VoiceShareScreen) this.instance).getRoomIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceShareScreenOrBuilder
            public Status getStatus() {
                return ((VoiceShareScreen) this.instance).getStatus();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceShareScreenOrBuilder
            public int getStatusValue() {
                return ((VoiceShareScreen) this.instance).getStatusValue();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceShareScreenOrBuilder
            public Template.TemplateData getTemplateData() {
                return ((VoiceShareScreen) this.instance).getTemplateData();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceShareScreenOrBuilder
            public String getToast() {
                return ((VoiceShareScreen) this.instance).getToast();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceShareScreenOrBuilder
            public ByteString getToastBytes() {
                return ((VoiceShareScreen) this.instance).getToastBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceShareScreenOrBuilder
            public String getUserId() {
                return ((VoiceShareScreen) this.instance).getUserId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceShareScreenOrBuilder
            public ByteString getUserIdBytes() {
                return ((VoiceShareScreen) this.instance).getUserIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceShareScreenOrBuilder
            public userMaskConfig.UserMask getUserMask() {
                return ((VoiceShareScreen) this.instance).getUserMask();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceShareScreenOrBuilder
            public boolean hasTemplateData() {
                return ((VoiceShareScreen) this.instance).hasTemplateData();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceShareScreenOrBuilder
            public boolean hasUserMask() {
                return ((VoiceShareScreen) this.instance).hasUserMask();
            }

            public Builder mergeTemplateData(Template.TemplateData templateData) {
                copyOnWrite();
                ((VoiceShareScreen) this.instance).mergeTemplateData(templateData);
                return this;
            }

            public Builder mergeUserMask(userMaskConfig.UserMask userMask) {
                copyOnWrite();
                ((VoiceShareScreen) this.instance).mergeUserMask(userMask);
                return this;
            }

            public Builder setDesc(String str) {
                copyOnWrite();
                ((VoiceShareScreen) this.instance).setDesc(str);
                return this;
            }

            public Builder setDescBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceShareScreen) this.instance).setDescBytes(byteString);
                return this;
            }

            public Builder setId(String str) {
                copyOnWrite();
                ((VoiceShareScreen) this.instance).setId(str);
                return this;
            }

            public Builder setIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceShareScreen) this.instance).setIdBytes(byteString);
                return this;
            }

            public Builder setRatio(float f) {
                copyOnWrite();
                ((VoiceShareScreen) this.instance).setRatio(f);
                return this;
            }

            public Builder setRoomId(String str) {
                copyOnWrite();
                ((VoiceShareScreen) this.instance).setRoomId(str);
                return this;
            }

            public Builder setRoomIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceShareScreen) this.instance).setRoomIdBytes(byteString);
                return this;
            }

            public Builder setStatus(Status status) {
                copyOnWrite();
                ((VoiceShareScreen) this.instance).setStatus(status);
                return this;
            }

            public Builder setStatusValue(int i) {
                copyOnWrite();
                ((VoiceShareScreen) this.instance).setStatusValue(i);
                return this;
            }

            public Builder setTemplateData(Template.TemplateData templateData) {
                copyOnWrite();
                ((VoiceShareScreen) this.instance).setTemplateData(templateData);
                return this;
            }

            public Builder setToast(String str) {
                copyOnWrite();
                ((VoiceShareScreen) this.instance).setToast(str);
                return this;
            }

            public Builder setToastBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceShareScreen) this.instance).setToastBytes(byteString);
                return this;
            }

            public Builder setUserId(String str) {
                copyOnWrite();
                ((VoiceShareScreen) this.instance).setUserId(str);
                return this;
            }

            public Builder setUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceShareScreen) this.instance).setUserIdBytes(byteString);
                return this;
            }

            public Builder setUserMask(userMaskConfig.UserMask userMask) {
                copyOnWrite();
                ((VoiceShareScreen) this.instance).setUserMask(userMask);
                return this;
            }

            public Builder setTemplateData(Template.TemplateData.Builder builder) {
                copyOnWrite();
                ((VoiceShareScreen) this.instance).setTemplateData(builder);
                return this;
            }

            public Builder setUserMask(userMaskConfig.UserMask.Builder builder) {
                copyOnWrite();
                ((VoiceShareScreen) this.instance).setUserMask(builder);
                return this;
            }
        }

        public static VoiceShareScreen parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoiceShareScreen) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoiceShareScreen parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (VoiceShareScreen) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static VoiceShareScreen parseFrom(InputStream inputStream) throws IOException {
            return (VoiceShareScreen) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceShareScreen parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (VoiceShareScreen) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static VoiceShareScreen parseFrom(C3430e c3430e) throws IOException {
            return (VoiceShareScreen) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static VoiceShareScreen parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (VoiceShareScreen) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }

    public static final class BgStyle extends GeneratedMessageLite<BgStyle, Builder> implements BgStyleOrBuilder {
        public static final int ALPHA_FIELD_NUMBER = 3;
        private static final BgStyle DEFAULT_INSTANCE;
        public static final int ENDCOLOR_FIELD_NUMBER = 2;
        private static volatile ng60<BgStyle> PARSER = null;
        public static final int STARTCOLOR_FIELD_NUMBER = 1;
        private String startColor_ = "";
        private String endColor_ = "";
        private String alpha_ = "";

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<BgStyle, Builder> implements BgStyleOrBuilder {
            private Builder() {
                super(BgStyle.DEFAULT_INSTANCE);
            }

            public Builder clearAlpha() {
                copyOnWrite();
                ((BgStyle) this.instance).clearAlpha();
                return this;
            }

            public Builder clearEndColor() {
                copyOnWrite();
                ((BgStyle) this.instance).clearEndColor();
                return this;
            }

            public Builder clearStartColor() {
                copyOnWrite();
                ((BgStyle) this.instance).clearStartColor();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.BgStyleOrBuilder
            public String getAlpha() {
                return ((BgStyle) this.instance).getAlpha();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.BgStyleOrBuilder
            public ByteString getAlphaBytes() {
                return ((BgStyle) this.instance).getAlphaBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.BgStyleOrBuilder
            public String getEndColor() {
                return ((BgStyle) this.instance).getEndColor();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.BgStyleOrBuilder
            public ByteString getEndColorBytes() {
                return ((BgStyle) this.instance).getEndColorBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.BgStyleOrBuilder
            public String getStartColor() {
                return ((BgStyle) this.instance).getStartColor();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.BgStyleOrBuilder
            public ByteString getStartColorBytes() {
                return ((BgStyle) this.instance).getStartColorBytes();
            }

            public Builder setAlpha(String str) {
                copyOnWrite();
                ((BgStyle) this.instance).setAlpha(str);
                return this;
            }

            public Builder setAlphaBytes(ByteString byteString) {
                copyOnWrite();
                ((BgStyle) this.instance).setAlphaBytes(byteString);
                return this;
            }

            public Builder setEndColor(String str) {
                copyOnWrite();
                ((BgStyle) this.instance).setEndColor(str);
                return this;
            }

            public Builder setEndColorBytes(ByteString byteString) {
                copyOnWrite();
                ((BgStyle) this.instance).setEndColorBytes(byteString);
                return this;
            }

            public Builder setStartColor(String str) {
                copyOnWrite();
                ((BgStyle) this.instance).setStartColor(str);
                return this;
            }

            public Builder setStartColorBytes(ByteString byteString) {
                copyOnWrite();
                ((BgStyle) this.instance).setStartColorBytes(byteString);
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
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(bgStyle);
        }

        public static BgStyle parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (BgStyle) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BgStyle parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (BgStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<BgStyle> parser() {
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.startColor_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C46611.f16699xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new BgStyle();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    BgStyle bgStyle = (BgStyle) obj2;
                    this.startColor_ = interfaceC3409h.mo17052f(!this.startColor_.isEmpty(), this.startColor_, !bgStyle.startColor_.isEmpty(), bgStyle.startColor_);
                    this.endColor_ = interfaceC3409h.mo17052f(!this.endColor_.isEmpty(), this.endColor_, !bgStyle.endColor_.isEmpty(), bgStyle.endColor_);
                    this.alpha_ = interfaceC3409h.mo17052f(!this.alpha_.isEmpty(), this.alpha_, true ^ bgStyle.alpha_.isEmpty(), bgStyle.alpha_);
                    GeneratedMessageLite.C3408g c3408g = GeneratedMessageLite.C3408g.INSTANCE;
                    return this;
                case 6:
                    C3430e c3430e = (C3430e) obj;
                    boolean z = false;
                    while (!z) {
                        try {
                            int iM17171M = c3430e.m17171M();
                            if (iM17171M != 0) {
                                if (iM17171M == 10) {
                                    this.startColor_ = c3430e.m17170L();
                                } else if (iM17171M == 18) {
                                    this.endColor_ = c3430e.m17170L();
                                } else if (iM17171M == 26) {
                                    this.alpha_ = c3430e.m17170L();
                                } else if (!c3430e.m17176R(iM17171M)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            iig0.m140070a(e.setUnfinishedMessage(this));
                            return null;
                        } catch (IOException e2) {
                            iig0.m140070a(new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this));
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
                                    PARSER = new GeneratedMessageLite.C3404c(DEFAULT_INSTANCE);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return PARSER;
                default:
                    l710.m153113a();
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

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16956K = !this.startColor_.isEmpty() ? CodedOutputStream.m16956K(1, getStartColor()) : 0;
            if (!this.endColor_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(2, getEndColor());
            }
            if (!this.alpha_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(3, getAlpha());
            }
            this.memoizedSerializedSize = iM16956K;
            return iM16956K;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.BgStyleOrBuilder
        public String getStartColor() {
            return this.startColor_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.BgStyleOrBuilder
        public ByteString getStartColorBytes() {
            return ByteString.copyFromUtf8(this.startColor_);
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.startColor_.isEmpty()) {
                codedOutputStream.mo16994D0(1, getStartColor());
            }
            if (!this.endColor_.isEmpty()) {
                codedOutputStream.mo16994D0(2, getEndColor());
            }
            if (this.alpha_.isEmpty()) {
                return;
            }
            codedOutputStream.mo16994D0(3, getAlpha());
        }

        public static BgStyle parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (BgStyle) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static BgStyle parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (BgStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        public static BgStyle parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (BgStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static BgStyle parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (BgStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static BgStyle parseFrom(InputStream inputStream) throws IOException {
            return (BgStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BgStyle parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (BgStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static BgStyle parseFrom(C3430e c3430e) throws IOException {
            return (BgStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static BgStyle parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (BgStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }

    public enum GuideType implements C3437l.c {
        empty(0),
        fromUser(1),
        other(2),
        UNRECOGNIZED(-1);

        public static final int empty_VALUE = 0;
        public static final int fromUser_VALUE = 1;
        private static final C3437l.d<GuideType> internalValueMap = new C3437l.d<GuideType>() { // from class: com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.GuideType.1
            @Override // com.google.protobuf.C3437l.d
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

        public static C3437l.d<GuideType> internalGetValueMap() {
            return internalValueMap;
        }

        @Override // com.google.protobuf.C3437l.c
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
        private static volatile ng60<LuckyParadiseEntrance> PARSER = null;
        public static final int POOLTYPE_FIELD_NUMBER = 2;
        private long currentTime_;
        private long endTime_;
        private boolean isCrazyNow_;
        private String poolType_ = "";
        private String defaultIcon_ = "";
        private String crazyIcon_ = "";

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<LuckyParadiseEntrance, Builder> implements LuckyParadiseEntranceOrBuilder {
            private Builder() {
                super(LuckyParadiseEntrance.DEFAULT_INSTANCE);
            }

            public Builder clearCrazyIcon() {
                copyOnWrite();
                ((LuckyParadiseEntrance) this.instance).clearCrazyIcon();
                return this;
            }

            public Builder clearCurrentTime() {
                copyOnWrite();
                ((LuckyParadiseEntrance) this.instance).clearCurrentTime();
                return this;
            }

            public Builder clearDefaultIcon() {
                copyOnWrite();
                ((LuckyParadiseEntrance) this.instance).clearDefaultIcon();
                return this;
            }

            public Builder clearEndTime() {
                copyOnWrite();
                ((LuckyParadiseEntrance) this.instance).clearEndTime();
                return this;
            }

            public Builder clearIsCrazyNow() {
                copyOnWrite();
                ((LuckyParadiseEntrance) this.instance).clearIsCrazyNow();
                return this;
            }

            public Builder clearPoolType() {
                copyOnWrite();
                ((LuckyParadiseEntrance) this.instance).clearPoolType();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.LuckyParadiseEntranceOrBuilder
            public String getCrazyIcon() {
                return ((LuckyParadiseEntrance) this.instance).getCrazyIcon();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.LuckyParadiseEntranceOrBuilder
            public ByteString getCrazyIconBytes() {
                return ((LuckyParadiseEntrance) this.instance).getCrazyIconBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.LuckyParadiseEntranceOrBuilder
            public long getCurrentTime() {
                return ((LuckyParadiseEntrance) this.instance).getCurrentTime();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.LuckyParadiseEntranceOrBuilder
            public String getDefaultIcon() {
                return ((LuckyParadiseEntrance) this.instance).getDefaultIcon();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.LuckyParadiseEntranceOrBuilder
            public ByteString getDefaultIconBytes() {
                return ((LuckyParadiseEntrance) this.instance).getDefaultIconBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.LuckyParadiseEntranceOrBuilder
            public long getEndTime() {
                return ((LuckyParadiseEntrance) this.instance).getEndTime();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.LuckyParadiseEntranceOrBuilder
            public boolean getIsCrazyNow() {
                return ((LuckyParadiseEntrance) this.instance).getIsCrazyNow();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.LuckyParadiseEntranceOrBuilder
            public String getPoolType() {
                return ((LuckyParadiseEntrance) this.instance).getPoolType();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.LuckyParadiseEntranceOrBuilder
            public ByteString getPoolTypeBytes() {
                return ((LuckyParadiseEntrance) this.instance).getPoolTypeBytes();
            }

            public Builder setCrazyIcon(String str) {
                copyOnWrite();
                ((LuckyParadiseEntrance) this.instance).setCrazyIcon(str);
                return this;
            }

            public Builder setCrazyIconBytes(ByteString byteString) {
                copyOnWrite();
                ((LuckyParadiseEntrance) this.instance).setCrazyIconBytes(byteString);
                return this;
            }

            public Builder setCurrentTime(long j) {
                copyOnWrite();
                ((LuckyParadiseEntrance) this.instance).setCurrentTime(j);
                return this;
            }

            public Builder setDefaultIcon(String str) {
                copyOnWrite();
                ((LuckyParadiseEntrance) this.instance).setDefaultIcon(str);
                return this;
            }

            public Builder setDefaultIconBytes(ByteString byteString) {
                copyOnWrite();
                ((LuckyParadiseEntrance) this.instance).setDefaultIconBytes(byteString);
                return this;
            }

            public Builder setEndTime(long j) {
                copyOnWrite();
                ((LuckyParadiseEntrance) this.instance).setEndTime(j);
                return this;
            }

            public Builder setIsCrazyNow(boolean z) {
                copyOnWrite();
                ((LuckyParadiseEntrance) this.instance).setIsCrazyNow(z);
                return this;
            }

            public Builder setPoolType(String str) {
                copyOnWrite();
                ((LuckyParadiseEntrance) this.instance).setPoolType(str);
                return this;
            }

            public Builder setPoolTypeBytes(ByteString byteString) {
                copyOnWrite();
                ((LuckyParadiseEntrance) this.instance).setPoolTypeBytes(byteString);
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
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(luckyParadiseEntrance);
        }

        public static LuckyParadiseEntrance parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (LuckyParadiseEntrance) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LuckyParadiseEntrance parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (LuckyParadiseEntrance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<LuckyParadiseEntrance> parser() {
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.poolType_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C46611.f16699xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new LuckyParadiseEntrance();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    LuckyParadiseEntrance luckyParadiseEntrance = (LuckyParadiseEntrance) obj2;
                    boolean z2 = this.isCrazyNow_;
                    boolean z3 = luckyParadiseEntrance.isCrazyNow_;
                    this.isCrazyNow_ = interfaceC3409h.mo17050d(z2, z2, z3, z3);
                    this.poolType_ = interfaceC3409h.mo17052f(!this.poolType_.isEmpty(), this.poolType_, !luckyParadiseEntrance.poolType_.isEmpty(), luckyParadiseEntrance.poolType_);
                    long j = this.currentTime_;
                    boolean z4 = j != 0;
                    long j2 = luckyParadiseEntrance.currentTime_;
                    this.currentTime_ = interfaceC3409h.mo17055i(z4, j, j2 != 0, j2);
                    long j3 = this.endTime_;
                    boolean z5 = j3 != 0;
                    long j4 = luckyParadiseEntrance.endTime_;
                    this.endTime_ = interfaceC3409h.mo17055i(z5, j3, j4 != 0, j4);
                    this.defaultIcon_ = interfaceC3409h.mo17052f(!this.defaultIcon_.isEmpty(), this.defaultIcon_, !luckyParadiseEntrance.defaultIcon_.isEmpty(), luckyParadiseEntrance.defaultIcon_);
                    this.crazyIcon_ = interfaceC3409h.mo17052f(!this.crazyIcon_.isEmpty(), this.crazyIcon_, !luckyParadiseEntrance.crazyIcon_.isEmpty(), luckyParadiseEntrance.crazyIcon_);
                    GeneratedMessageLite.C3408g c3408g = GeneratedMessageLite.C3408g.INSTANCE;
                    return this;
                case 6:
                    C3430e c3430e = (C3430e) obj;
                    while (!z) {
                        try {
                            int iM17171M = c3430e.m17171M();
                            if (iM17171M != 0) {
                                if (iM17171M == 8) {
                                    this.isCrazyNow_ = c3430e.m17188m();
                                } else if (iM17171M == 18) {
                                    this.poolType_ = c3430e.m17170L();
                                } else if (iM17171M == 24) {
                                    this.currentTime_ = c3430e.m17197v();
                                } else if (iM17171M == 32) {
                                    this.endTime_ = c3430e.m17197v();
                                } else if (iM17171M == 42) {
                                    this.defaultIcon_ = c3430e.m17170L();
                                } else if (iM17171M == 50) {
                                    this.crazyIcon_ = c3430e.m17170L();
                                } else if (!c3430e.m17176R(iM17171M)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            iig0.m140070a(e.setUnfinishedMessage(this));
                            return null;
                        } catch (IOException e2) {
                            iig0.m140070a(new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this));
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
                                    PARSER = new GeneratedMessageLite.C3404c(DEFAULT_INSTANCE);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return PARSER;
                default:
                    l710.m153113a();
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

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            boolean z = this.isCrazyNow_;
            int iM16970f = z ? CodedOutputStream.m16970f(1, z) : 0;
            if (!this.poolType_.isEmpty()) {
                iM16970f += CodedOutputStream.m16956K(2, getPoolType());
            }
            long j = this.currentTime_;
            if (j != 0) {
                iM16970f += CodedOutputStream.m16986v(3, j);
            }
            long j2 = this.endTime_;
            if (j2 != 0) {
                iM16970f += CodedOutputStream.m16986v(4, j2);
            }
            if (!this.defaultIcon_.isEmpty()) {
                iM16970f += CodedOutputStream.m16956K(5, getDefaultIcon());
            }
            if (!this.crazyIcon_.isEmpty()) {
                iM16970f += CodedOutputStream.m16956K(6, getCrazyIcon());
            }
            this.memoizedSerializedSize = iM16970f;
            return iM16970f;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            boolean z = this.isCrazyNow_;
            if (z) {
                codedOutputStream.mo17005a0(1, z);
            }
            if (!this.poolType_.isEmpty()) {
                codedOutputStream.mo16994D0(2, getPoolType());
            }
            long j = this.currentTime_;
            if (j != 0) {
                codedOutputStream.m17027u0(3, j);
            }
            long j2 = this.endTime_;
            if (j2 != 0) {
                codedOutputStream.m17027u0(4, j2);
            }
            if (!this.defaultIcon_.isEmpty()) {
                codedOutputStream.mo16994D0(5, getDefaultIcon());
            }
            if (this.crazyIcon_.isEmpty()) {
                return;
            }
            codedOutputStream.mo16994D0(6, getCrazyIcon());
        }

        public static LuckyParadiseEntrance parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (LuckyParadiseEntrance) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static LuckyParadiseEntrance parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (LuckyParadiseEntrance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        public static LuckyParadiseEntrance parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (LuckyParadiseEntrance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static LuckyParadiseEntrance parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (LuckyParadiseEntrance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static LuckyParadiseEntrance parseFrom(InputStream inputStream) throws IOException {
            return (LuckyParadiseEntrance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LuckyParadiseEntrance parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (LuckyParadiseEntrance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static LuckyParadiseEntrance parseFrom(C3430e c3430e) throws IOException {
            return (LuckyParadiseEntrance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static LuckyParadiseEntrance parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (LuckyParadiseEntrance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }

    public static final class StarRedpacketInfo extends GeneratedMessageLite<StarRedpacketInfo, Builder> implements StarRedpacketInfoOrBuilder {
        private static final StarRedpacketInfo DEFAULT_INSTANCE;
        public static final int ID_FIELD_NUMBER = 1;
        private static volatile ng60<StarRedpacketInfo> PARSER = null;
        public static final int ROOMID_FIELD_NUMBER = 2;
        public static final int STATE_FIELD_NUMBER = 3;
        private String id_ = "";
        private String roomId_ = "";
        private String state_ = "";

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<StarRedpacketInfo, Builder> implements StarRedpacketInfoOrBuilder {
            private Builder() {
                super(StarRedpacketInfo.DEFAULT_INSTANCE);
            }

            public Builder clearId() {
                copyOnWrite();
                ((StarRedpacketInfo) this.instance).clearId();
                return this;
            }

            public Builder clearRoomId() {
                copyOnWrite();
                ((StarRedpacketInfo) this.instance).clearRoomId();
                return this;
            }

            public Builder clearState() {
                copyOnWrite();
                ((StarRedpacketInfo) this.instance).clearState();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.StarRedpacketInfoOrBuilder
            public String getId() {
                return ((StarRedpacketInfo) this.instance).getId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.StarRedpacketInfoOrBuilder
            public ByteString getIdBytes() {
                return ((StarRedpacketInfo) this.instance).getIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.StarRedpacketInfoOrBuilder
            public String getRoomId() {
                return ((StarRedpacketInfo) this.instance).getRoomId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.StarRedpacketInfoOrBuilder
            public ByteString getRoomIdBytes() {
                return ((StarRedpacketInfo) this.instance).getRoomIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.StarRedpacketInfoOrBuilder
            public String getState() {
                return ((StarRedpacketInfo) this.instance).getState();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.StarRedpacketInfoOrBuilder
            public ByteString getStateBytes() {
                return ((StarRedpacketInfo) this.instance).getStateBytes();
            }

            public Builder setId(String str) {
                copyOnWrite();
                ((StarRedpacketInfo) this.instance).setId(str);
                return this;
            }

            public Builder setIdBytes(ByteString byteString) {
                copyOnWrite();
                ((StarRedpacketInfo) this.instance).setIdBytes(byteString);
                return this;
            }

            public Builder setRoomId(String str) {
                copyOnWrite();
                ((StarRedpacketInfo) this.instance).setRoomId(str);
                return this;
            }

            public Builder setRoomIdBytes(ByteString byteString) {
                copyOnWrite();
                ((StarRedpacketInfo) this.instance).setRoomIdBytes(byteString);
                return this;
            }

            public Builder setState(String str) {
                copyOnWrite();
                ((StarRedpacketInfo) this.instance).setState(str);
                return this;
            }

            public Builder setStateBytes(ByteString byteString) {
                copyOnWrite();
                ((StarRedpacketInfo) this.instance).setStateBytes(byteString);
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
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(starRedpacketInfo);
        }

        public static StarRedpacketInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (StarRedpacketInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static StarRedpacketInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (StarRedpacketInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<StarRedpacketInfo> parser() {
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.state_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C46611.f16699xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new StarRedpacketInfo();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    StarRedpacketInfo starRedpacketInfo = (StarRedpacketInfo) obj2;
                    this.id_ = interfaceC3409h.mo17052f(!this.id_.isEmpty(), this.id_, !starRedpacketInfo.id_.isEmpty(), starRedpacketInfo.id_);
                    this.roomId_ = interfaceC3409h.mo17052f(!this.roomId_.isEmpty(), this.roomId_, !starRedpacketInfo.roomId_.isEmpty(), starRedpacketInfo.roomId_);
                    this.state_ = interfaceC3409h.mo17052f(!this.state_.isEmpty(), this.state_, true ^ starRedpacketInfo.state_.isEmpty(), starRedpacketInfo.state_);
                    GeneratedMessageLite.C3408g c3408g = GeneratedMessageLite.C3408g.INSTANCE;
                    return this;
                case 6:
                    C3430e c3430e = (C3430e) obj;
                    boolean z = false;
                    while (!z) {
                        try {
                            int iM17171M = c3430e.m17171M();
                            if (iM17171M != 0) {
                                if (iM17171M == 10) {
                                    this.id_ = c3430e.m17170L();
                                } else if (iM17171M == 18) {
                                    this.roomId_ = c3430e.m17170L();
                                } else if (iM17171M == 26) {
                                    this.state_ = c3430e.m17170L();
                                } else if (!c3430e.m17176R(iM17171M)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            iig0.m140070a(e.setUnfinishedMessage(this));
                            return null;
                        } catch (IOException e2) {
                            iig0.m140070a(new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this));
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
                                    PARSER = new GeneratedMessageLite.C3404c(DEFAULT_INSTANCE);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return PARSER;
                default:
                    l710.m153113a();
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

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16956K = !this.id_.isEmpty() ? CodedOutputStream.m16956K(1, getId()) : 0;
            if (!this.roomId_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(2, getRoomId());
            }
            if (!this.state_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(3, getState());
            }
            this.memoizedSerializedSize = iM16956K;
            return iM16956K;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.StarRedpacketInfoOrBuilder
        public String getState() {
            return this.state_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.StarRedpacketInfoOrBuilder
        public ByteString getStateBytes() {
            return ByteString.copyFromUtf8(this.state_);
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.id_.isEmpty()) {
                codedOutputStream.mo16994D0(1, getId());
            }
            if (!this.roomId_.isEmpty()) {
                codedOutputStream.mo16994D0(2, getRoomId());
            }
            if (this.state_.isEmpty()) {
                return;
            }
            codedOutputStream.mo16994D0(3, getState());
        }

        public static StarRedpacketInfo parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (StarRedpacketInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static StarRedpacketInfo parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (StarRedpacketInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        public static StarRedpacketInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (StarRedpacketInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static StarRedpacketInfo parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (StarRedpacketInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static StarRedpacketInfo parseFrom(InputStream inputStream) throws IOException {
            return (StarRedpacketInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static StarRedpacketInfo parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (StarRedpacketInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static StarRedpacketInfo parseFrom(C3430e c3430e) throws IOException {
            return (StarRedpacketInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static StarRedpacketInfo parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (StarRedpacketInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }

    public static final class VoiceAvatarFramePayGuidePopUp extends GeneratedMessageLite<VoiceAvatarFramePayGuidePopUp, Builder> implements VoiceAvatarFramePayGuidePopUpOrBuilder {
        public static final int BUTTONSUBTITLE_FIELD_NUMBER = 7;
        public static final int BUTTONTITLE_FIELD_NUMBER = 6;
        private static final VoiceAvatarFramePayGuidePopUp DEFAULT_INSTANCE;
        public static final int FROMUSERMASK_FIELD_NUMBER = 4;
        public static final int GIFTCOUNT_FIELD_NUMBER = 9;
        public static final int GIFTID_FIELD_NUMBER = 8;
        private static volatile ng60<VoiceAvatarFramePayGuidePopUp> PARSER = null;
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
                this.fromUserMask_ = userMaskConfig.UserMask.newBuilder(this.fromUserMask_).mergeFrom(userMask).buildPartial();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeToUserMask(userMaskConfig.UserMask userMask) {
            userMaskConfig.UserMask userMask2 = this.toUserMask_;
            if (userMask2 == null || userMask2 == userMaskConfig.UserMask.getDefaultInstance()) {
                this.toUserMask_ = userMask;
            } else {
                this.toUserMask_ = userMaskConfig.UserMask.newBuilder(this.toUserMask_).mergeFrom(userMask).buildPartial();
            }
        }

        public static Builder newBuilder(VoiceAvatarFramePayGuidePopUp voiceAvatarFramePayGuidePopUp) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(voiceAvatarFramePayGuidePopUp);
        }

        public static VoiceAvatarFramePayGuidePopUp parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VoiceAvatarFramePayGuidePopUp) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceAvatarFramePayGuidePopUp parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VoiceAvatarFramePayGuidePopUp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<VoiceAvatarFramePayGuidePopUp> parser() {
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.buttonTitle_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFromUserMask(userMaskConfig.UserMask.Builder builder) {
            this.fromUserMask_ = builder.build();
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.title_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setToUserMask(userMaskConfig.UserMask.Builder builder) {
            this.toUserMask_ = builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserId(String str) {
            str.getClass();
            this.userId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserIdBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.userId_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C46611.f16699xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoiceAvatarFramePayGuidePopUp();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    VoiceAvatarFramePayGuidePopUp voiceAvatarFramePayGuidePopUp = (VoiceAvatarFramePayGuidePopUp) obj2;
                    this.userId_ = interfaceC3409h.mo17052f(!this.userId_.isEmpty(), this.userId_, !voiceAvatarFramePayGuidePopUp.userId_.isEmpty(), voiceAvatarFramePayGuidePopUp.userId_);
                    this.title_ = interfaceC3409h.mo17052f(!this.title_.isEmpty(), this.title_, !voiceAvatarFramePayGuidePopUp.title_.isEmpty(), voiceAvatarFramePayGuidePopUp.title_);
                    this.subTitle_ = interfaceC3409h.mo17052f(!this.subTitle_.isEmpty(), this.subTitle_, !voiceAvatarFramePayGuidePopUp.subTitle_.isEmpty(), voiceAvatarFramePayGuidePopUp.subTitle_);
                    this.fromUserMask_ = (userMaskConfig.UserMask) interfaceC3409h.mo17061o(this.fromUserMask_, voiceAvatarFramePayGuidePopUp.fromUserMask_);
                    this.toUserMask_ = (userMaskConfig.UserMask) interfaceC3409h.mo17061o(this.toUserMask_, voiceAvatarFramePayGuidePopUp.toUserMask_);
                    this.buttonTitle_ = interfaceC3409h.mo17052f(!this.buttonTitle_.isEmpty(), this.buttonTitle_, !voiceAvatarFramePayGuidePopUp.buttonTitle_.isEmpty(), voiceAvatarFramePayGuidePopUp.buttonTitle_);
                    this.buttonSubTitle_ = interfaceC3409h.mo17052f(!this.buttonSubTitle_.isEmpty(), this.buttonSubTitle_, !voiceAvatarFramePayGuidePopUp.buttonSubTitle_.isEmpty(), voiceAvatarFramePayGuidePopUp.buttonSubTitle_);
                    long j = this.giftId_;
                    boolean z2 = j != 0;
                    long j2 = voiceAvatarFramePayGuidePopUp.giftId_;
                    this.giftId_ = interfaceC3409h.mo17055i(z2, j, j2 != 0, j2);
                    boolean z3 = false;
                    long j3 = this.giftCount_;
                    if (j3 != 0) {
                        z3 = true;
                    }
                    long j4 = voiceAvatarFramePayGuidePopUp.giftCount_;
                    this.giftCount_ = interfaceC3409h.mo17055i(z3, j3, j4 != 0, j4);
                    GeneratedMessageLite.C3408g c3408g = GeneratedMessageLite.C3408g.INSTANCE;
                    return this;
                case 6:
                    C3430e c3430e = (C3430e) obj;
                    C3433h c3433h = (C3433h) obj2;
                    while (!z) {
                        try {
                            int iM17171M = c3430e.m17171M();
                            if (iM17171M != 0) {
                                if (iM17171M == 10) {
                                    this.userId_ = c3430e.m17170L();
                                } else if (iM17171M == 18) {
                                    this.title_ = c3430e.m17170L();
                                } else if (iM17171M == 26) {
                                    this.subTitle_ = c3430e.m17170L();
                                } else if (iM17171M == 34) {
                                    userMaskConfig.UserMask userMask = this.fromUserMask_;
                                    userMaskConfig.UserMask.Builder builder = userMask != null ? userMask.toBuilder() : null;
                                    userMaskConfig.UserMask userMask2 = (userMaskConfig.UserMask) c3430e.m17198w(userMaskConfig.UserMask.parser(), c3433h);
                                    this.fromUserMask_ = userMask2;
                                    if (builder != null) {
                                        builder.mergeFrom(userMask2);
                                        this.fromUserMask_ = builder.buildPartial();
                                    }
                                } else if (iM17171M == 42) {
                                    userMaskConfig.UserMask userMask3 = this.toUserMask_;
                                    userMaskConfig.UserMask.Builder builder2 = userMask3 != null ? userMask3.toBuilder() : null;
                                    userMaskConfig.UserMask userMask4 = (userMaskConfig.UserMask) c3430e.m17198w(userMaskConfig.UserMask.parser(), c3433h);
                                    this.toUserMask_ = userMask4;
                                    if (builder2 != null) {
                                        builder2.mergeFrom(userMask4);
                                        this.toUserMask_ = builder2.buildPartial();
                                    }
                                } else if (iM17171M == 50) {
                                    this.buttonTitle_ = c3430e.m17170L();
                                } else if (iM17171M == 58) {
                                    this.buttonSubTitle_ = c3430e.m17170L();
                                } else if (iM17171M == 64) {
                                    this.giftId_ = c3430e.m17197v();
                                } else if (iM17171M == 72) {
                                    this.giftCount_ = c3430e.m17197v();
                                } else if (!c3430e.m17176R(iM17171M)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            iig0.m140070a(e.setUnfinishedMessage(this));
                            return null;
                        } catch (IOException e2) {
                            iig0.m140070a(new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this));
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
                                    PARSER = new GeneratedMessageLite.C3404c(DEFAULT_INSTANCE);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return PARSER;
                default:
                    l710.m153113a();
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

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16956K = !this.userId_.isEmpty() ? CodedOutputStream.m16956K(1, getUserId()) : 0;
            if (!this.title_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(2, getTitle());
            }
            if (!this.subTitle_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(3, getSubTitle());
            }
            if (this.fromUserMask_ != null) {
                iM16956K += CodedOutputStream.m16948C(4, getFromUserMask());
            }
            if (this.toUserMask_ != null) {
                iM16956K += CodedOutputStream.m16948C(5, getToUserMask());
            }
            if (!this.buttonTitle_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(6, getButtonTitle());
            }
            if (!this.buttonSubTitle_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(7, getButtonSubTitle());
            }
            long j = this.giftId_;
            if (j != 0) {
                iM16956K += CodedOutputStream.m16986v(8, j);
            }
            long j2 = this.giftCount_;
            if (j2 != 0) {
                iM16956K += CodedOutputStream.m16986v(9, j2);
            }
            this.memoizedSerializedSize = iM16956K;
            return iM16956K;
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

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.userId_.isEmpty()) {
                codedOutputStream.mo16994D0(1, getUserId());
            }
            if (!this.title_.isEmpty()) {
                codedOutputStream.mo16994D0(2, getTitle());
            }
            if (!this.subTitle_.isEmpty()) {
                codedOutputStream.mo16994D0(3, getSubTitle());
            }
            if (this.fromUserMask_ != null) {
                codedOutputStream.mo17029w0(4, getFromUserMask());
            }
            if (this.toUserMask_ != null) {
                codedOutputStream.mo17029w0(5, getToUserMask());
            }
            if (!this.buttonTitle_.isEmpty()) {
                codedOutputStream.mo16994D0(6, getButtonTitle());
            }
            if (!this.buttonSubTitle_.isEmpty()) {
                codedOutputStream.mo16994D0(7, getButtonSubTitle());
            }
            long j = this.giftId_;
            if (j != 0) {
                codedOutputStream.m17027u0(8, j);
            }
            long j2 = this.giftCount_;
            if (j2 != 0) {
                codedOutputStream.m17027u0(9, j2);
            }
        }

        public static VoiceAvatarFramePayGuidePopUp parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (VoiceAvatarFramePayGuidePopUp) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static VoiceAvatarFramePayGuidePopUp parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (VoiceAvatarFramePayGuidePopUp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
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

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<VoiceAvatarFramePayGuidePopUp, Builder> implements VoiceAvatarFramePayGuidePopUpOrBuilder {
            private Builder() {
                super(VoiceAvatarFramePayGuidePopUp.DEFAULT_INSTANCE);
            }

            public Builder clearButtonSubTitle() {
                copyOnWrite();
                ((VoiceAvatarFramePayGuidePopUp) this.instance).clearButtonSubTitle();
                return this;
            }

            public Builder clearButtonTitle() {
                copyOnWrite();
                ((VoiceAvatarFramePayGuidePopUp) this.instance).clearButtonTitle();
                return this;
            }

            public Builder clearFromUserMask() {
                copyOnWrite();
                ((VoiceAvatarFramePayGuidePopUp) this.instance).clearFromUserMask();
                return this;
            }

            public Builder clearGiftCount() {
                copyOnWrite();
                ((VoiceAvatarFramePayGuidePopUp) this.instance).clearGiftCount();
                return this;
            }

            public Builder clearGiftId() {
                copyOnWrite();
                ((VoiceAvatarFramePayGuidePopUp) this.instance).clearGiftId();
                return this;
            }

            public Builder clearSubTitle() {
                copyOnWrite();
                ((VoiceAvatarFramePayGuidePopUp) this.instance).clearSubTitle();
                return this;
            }

            public Builder clearTitle() {
                copyOnWrite();
                ((VoiceAvatarFramePayGuidePopUp) this.instance).clearTitle();
                return this;
            }

            public Builder clearToUserMask() {
                copyOnWrite();
                ((VoiceAvatarFramePayGuidePopUp) this.instance).clearToUserMask();
                return this;
            }

            public Builder clearUserId() {
                copyOnWrite();
                ((VoiceAvatarFramePayGuidePopUp) this.instance).clearUserId();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceAvatarFramePayGuidePopUpOrBuilder
            public String getButtonSubTitle() {
                return ((VoiceAvatarFramePayGuidePopUp) this.instance).getButtonSubTitle();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceAvatarFramePayGuidePopUpOrBuilder
            public ByteString getButtonSubTitleBytes() {
                return ((VoiceAvatarFramePayGuidePopUp) this.instance).getButtonSubTitleBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceAvatarFramePayGuidePopUpOrBuilder
            public String getButtonTitle() {
                return ((VoiceAvatarFramePayGuidePopUp) this.instance).getButtonTitle();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceAvatarFramePayGuidePopUpOrBuilder
            public ByteString getButtonTitleBytes() {
                return ((VoiceAvatarFramePayGuidePopUp) this.instance).getButtonTitleBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceAvatarFramePayGuidePopUpOrBuilder
            public userMaskConfig.UserMask getFromUserMask() {
                return ((VoiceAvatarFramePayGuidePopUp) this.instance).getFromUserMask();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceAvatarFramePayGuidePopUpOrBuilder
            public long getGiftCount() {
                return ((VoiceAvatarFramePayGuidePopUp) this.instance).getGiftCount();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceAvatarFramePayGuidePopUpOrBuilder
            public long getGiftId() {
                return ((VoiceAvatarFramePayGuidePopUp) this.instance).getGiftId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceAvatarFramePayGuidePopUpOrBuilder
            public String getSubTitle() {
                return ((VoiceAvatarFramePayGuidePopUp) this.instance).getSubTitle();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceAvatarFramePayGuidePopUpOrBuilder
            public ByteString getSubTitleBytes() {
                return ((VoiceAvatarFramePayGuidePopUp) this.instance).getSubTitleBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceAvatarFramePayGuidePopUpOrBuilder
            public String getTitle() {
                return ((VoiceAvatarFramePayGuidePopUp) this.instance).getTitle();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceAvatarFramePayGuidePopUpOrBuilder
            public ByteString getTitleBytes() {
                return ((VoiceAvatarFramePayGuidePopUp) this.instance).getTitleBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceAvatarFramePayGuidePopUpOrBuilder
            public userMaskConfig.UserMask getToUserMask() {
                return ((VoiceAvatarFramePayGuidePopUp) this.instance).getToUserMask();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceAvatarFramePayGuidePopUpOrBuilder
            public String getUserId() {
                return ((VoiceAvatarFramePayGuidePopUp) this.instance).getUserId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceAvatarFramePayGuidePopUpOrBuilder
            public ByteString getUserIdBytes() {
                return ((VoiceAvatarFramePayGuidePopUp) this.instance).getUserIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceAvatarFramePayGuidePopUpOrBuilder
            public boolean hasFromUserMask() {
                return ((VoiceAvatarFramePayGuidePopUp) this.instance).hasFromUserMask();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceAvatarFramePayGuidePopUpOrBuilder
            public boolean hasToUserMask() {
                return ((VoiceAvatarFramePayGuidePopUp) this.instance).hasToUserMask();
            }

            public Builder mergeFromUserMask(userMaskConfig.UserMask userMask) {
                copyOnWrite();
                ((VoiceAvatarFramePayGuidePopUp) this.instance).mergeFromUserMask(userMask);
                return this;
            }

            public Builder mergeToUserMask(userMaskConfig.UserMask userMask) {
                copyOnWrite();
                ((VoiceAvatarFramePayGuidePopUp) this.instance).mergeToUserMask(userMask);
                return this;
            }

            public Builder setButtonSubTitle(String str) {
                copyOnWrite();
                ((VoiceAvatarFramePayGuidePopUp) this.instance).setButtonSubTitle(str);
                return this;
            }

            public Builder setButtonSubTitleBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceAvatarFramePayGuidePopUp) this.instance).setButtonSubTitleBytes(byteString);
                return this;
            }

            public Builder setButtonTitle(String str) {
                copyOnWrite();
                ((VoiceAvatarFramePayGuidePopUp) this.instance).setButtonTitle(str);
                return this;
            }

            public Builder setButtonTitleBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceAvatarFramePayGuidePopUp) this.instance).setButtonTitleBytes(byteString);
                return this;
            }

            public Builder setFromUserMask(userMaskConfig.UserMask userMask) {
                copyOnWrite();
                ((VoiceAvatarFramePayGuidePopUp) this.instance).setFromUserMask(userMask);
                return this;
            }

            public Builder setGiftCount(long j) {
                copyOnWrite();
                ((VoiceAvatarFramePayGuidePopUp) this.instance).setGiftCount(j);
                return this;
            }

            public Builder setGiftId(long j) {
                copyOnWrite();
                ((VoiceAvatarFramePayGuidePopUp) this.instance).setGiftId(j);
                return this;
            }

            public Builder setSubTitle(String str) {
                copyOnWrite();
                ((VoiceAvatarFramePayGuidePopUp) this.instance).setSubTitle(str);
                return this;
            }

            public Builder setSubTitleBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceAvatarFramePayGuidePopUp) this.instance).setSubTitleBytes(byteString);
                return this;
            }

            public Builder setTitle(String str) {
                copyOnWrite();
                ((VoiceAvatarFramePayGuidePopUp) this.instance).setTitle(str);
                return this;
            }

            public Builder setTitleBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceAvatarFramePayGuidePopUp) this.instance).setTitleBytes(byteString);
                return this;
            }

            public Builder setToUserMask(userMaskConfig.UserMask userMask) {
                copyOnWrite();
                ((VoiceAvatarFramePayGuidePopUp) this.instance).setToUserMask(userMask);
                return this;
            }

            public Builder setUserId(String str) {
                copyOnWrite();
                ((VoiceAvatarFramePayGuidePopUp) this.instance).setUserId(str);
                return this;
            }

            public Builder setUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceAvatarFramePayGuidePopUp) this.instance).setUserIdBytes(byteString);
                return this;
            }

            public Builder setFromUserMask(userMaskConfig.UserMask.Builder builder) {
                copyOnWrite();
                ((VoiceAvatarFramePayGuidePopUp) this.instance).setFromUserMask(builder);
                return this;
            }

            public Builder setToUserMask(userMaskConfig.UserMask.Builder builder) {
                copyOnWrite();
                ((VoiceAvatarFramePayGuidePopUp) this.instance).setToUserMask(builder);
                return this;
            }
        }

        public static VoiceAvatarFramePayGuidePopUp parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoiceAvatarFramePayGuidePopUp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoiceAvatarFramePayGuidePopUp parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (VoiceAvatarFramePayGuidePopUp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static VoiceAvatarFramePayGuidePopUp parseFrom(InputStream inputStream) throws IOException {
            return (VoiceAvatarFramePayGuidePopUp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceAvatarFramePayGuidePopUp parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (VoiceAvatarFramePayGuidePopUp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static VoiceAvatarFramePayGuidePopUp parseFrom(C3430e c3430e) throws IOException {
            return (VoiceAvatarFramePayGuidePopUp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static VoiceAvatarFramePayGuidePopUp parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (VoiceAvatarFramePayGuidePopUp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }

    public static final class VoiceChatTopicMessage extends GeneratedMessageLite<VoiceChatTopicMessage, Builder> implements VoiceChatTopicMessageOrBuilder {
        private static final VoiceChatTopicMessage DEFAULT_INSTANCE;
        private static volatile ng60<VoiceChatTopicMessage> PARSER = null;
        public static final int TAG_FIELD_NUMBER = 2;
        public static final int TOPIC_FIELD_NUMBER = 1;
        private String topic_ = "";
        private String tag_ = "";

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<VoiceChatTopicMessage, Builder> implements VoiceChatTopicMessageOrBuilder {
            private Builder() {
                super(VoiceChatTopicMessage.DEFAULT_INSTANCE);
            }

            public Builder clearTag() {
                copyOnWrite();
                ((VoiceChatTopicMessage) this.instance).clearTag();
                return this;
            }

            public Builder clearTopic() {
                copyOnWrite();
                ((VoiceChatTopicMessage) this.instance).clearTopic();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceChatTopicMessageOrBuilder
            public String getTag() {
                return ((VoiceChatTopicMessage) this.instance).getTag();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceChatTopicMessageOrBuilder
            public ByteString getTagBytes() {
                return ((VoiceChatTopicMessage) this.instance).getTagBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceChatTopicMessageOrBuilder
            public String getTopic() {
                return ((VoiceChatTopicMessage) this.instance).getTopic();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceChatTopicMessageOrBuilder
            public ByteString getTopicBytes() {
                return ((VoiceChatTopicMessage) this.instance).getTopicBytes();
            }

            public Builder setTag(String str) {
                copyOnWrite();
                ((VoiceChatTopicMessage) this.instance).setTag(str);
                return this;
            }

            public Builder setTagBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceChatTopicMessage) this.instance).setTagBytes(byteString);
                return this;
            }

            public Builder setTopic(String str) {
                copyOnWrite();
                ((VoiceChatTopicMessage) this.instance).setTopic(str);
                return this;
            }

            public Builder setTopicBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceChatTopicMessage) this.instance).setTopicBytes(byteString);
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
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(voiceChatTopicMessage);
        }

        public static VoiceChatTopicMessage parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VoiceChatTopicMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceChatTopicMessage parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VoiceChatTopicMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<VoiceChatTopicMessage> parser() {
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.topic_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C46611.f16699xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoiceChatTopicMessage();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    VoiceChatTopicMessage voiceChatTopicMessage = (VoiceChatTopicMessage) obj2;
                    this.topic_ = interfaceC3409h.mo17052f(!this.topic_.isEmpty(), this.topic_, !voiceChatTopicMessage.topic_.isEmpty(), voiceChatTopicMessage.topic_);
                    this.tag_ = interfaceC3409h.mo17052f(!this.tag_.isEmpty(), this.tag_, true ^ voiceChatTopicMessage.tag_.isEmpty(), voiceChatTopicMessage.tag_);
                    GeneratedMessageLite.C3408g c3408g = GeneratedMessageLite.C3408g.INSTANCE;
                    return this;
                case 6:
                    C3430e c3430e = (C3430e) obj;
                    boolean z = false;
                    while (!z) {
                        try {
                            int iM17171M = c3430e.m17171M();
                            if (iM17171M != 0) {
                                if (iM17171M == 10) {
                                    this.topic_ = c3430e.m17170L();
                                } else if (iM17171M == 18) {
                                    this.tag_ = c3430e.m17170L();
                                } else if (!c3430e.m17176R(iM17171M)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            iig0.m140070a(e.setUnfinishedMessage(this));
                            return null;
                        } catch (IOException e2) {
                            iig0.m140070a(new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this));
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
                                    PARSER = new GeneratedMessageLite.C3404c(DEFAULT_INSTANCE);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return PARSER;
                default:
                    l710.m153113a();
                    return null;
            }
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16956K = !this.topic_.isEmpty() ? CodedOutputStream.m16956K(1, getTopic()) : 0;
            if (!this.tag_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(2, getTag());
            }
            this.memoizedSerializedSize = iM16956K;
            return iM16956K;
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

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.topic_.isEmpty()) {
                codedOutputStream.mo16994D0(1, getTopic());
            }
            if (this.tag_.isEmpty()) {
                return;
            }
            codedOutputStream.mo16994D0(2, getTag());
        }

        public static VoiceChatTopicMessage parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (VoiceChatTopicMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static VoiceChatTopicMessage parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (VoiceChatTopicMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        public static VoiceChatTopicMessage parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoiceChatTopicMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoiceChatTopicMessage parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (VoiceChatTopicMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static VoiceChatTopicMessage parseFrom(InputStream inputStream) throws IOException {
            return (VoiceChatTopicMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceChatTopicMessage parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (VoiceChatTopicMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static VoiceChatTopicMessage parseFrom(C3430e c3430e) throws IOException {
            return (VoiceChatTopicMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static VoiceChatTopicMessage parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (VoiceChatTopicMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
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
        private static volatile ng60<VoiceFunFairEntrance> PARSER = null;
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

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<VoiceFunFairEntrance, Builder> implements VoiceFunFairEntranceOrBuilder {
            private Builder() {
                super(VoiceFunFairEntrance.DEFAULT_INSTANCE);
            }

            public Builder clearBuff() {
                copyOnWrite();
                ((VoiceFunFairEntrance) this.instance).clearBuff();
                return this;
            }

            public Builder clearBuffIcon() {
                copyOnWrite();
                ((VoiceFunFairEntrance) this.instance).clearBuffIcon();
                return this;
            }

            public Builder clearBuffText() {
                copyOnWrite();
                ((VoiceFunFairEntrance) this.instance).clearBuffText();
                return this;
            }

            public Builder clearCurrentTime() {
                copyOnWrite();
                ((VoiceFunFairEntrance) this.instance).clearCurrentTime();
                return this;
            }

            public Builder clearDefaultIcon() {
                copyOnWrite();
                ((VoiceFunFairEntrance) this.instance).clearDefaultIcon();
                return this;
            }

            public Builder clearEndTime() {
                copyOnWrite();
                ((VoiceFunFairEntrance) this.instance).clearEndTime();
                return this;
            }

            public Builder clearPoolType() {
                copyOnWrite();
                ((VoiceFunFairEntrance) this.instance).clearPoolType();
                return this;
            }

            public Builder clearTip() {
                copyOnWrite();
                ((VoiceFunFairEntrance) this.instance).clearTip();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceFunFairEntranceOrBuilder
            public boolean getBuff() {
                return ((VoiceFunFairEntrance) this.instance).getBuff();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceFunFairEntranceOrBuilder
            public String getBuffIcon() {
                return ((VoiceFunFairEntrance) this.instance).getBuffIcon();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceFunFairEntranceOrBuilder
            public ByteString getBuffIconBytes() {
                return ((VoiceFunFairEntrance) this.instance).getBuffIconBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceFunFairEntranceOrBuilder
            public String getBuffText() {
                return ((VoiceFunFairEntrance) this.instance).getBuffText();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceFunFairEntranceOrBuilder
            public ByteString getBuffTextBytes() {
                return ((VoiceFunFairEntrance) this.instance).getBuffTextBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceFunFairEntranceOrBuilder
            public long getCurrentTime() {
                return ((VoiceFunFairEntrance) this.instance).getCurrentTime();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceFunFairEntranceOrBuilder
            public String getDefaultIcon() {
                return ((VoiceFunFairEntrance) this.instance).getDefaultIcon();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceFunFairEntranceOrBuilder
            public ByteString getDefaultIconBytes() {
                return ((VoiceFunFairEntrance) this.instance).getDefaultIconBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceFunFairEntranceOrBuilder
            public long getEndTime() {
                return ((VoiceFunFairEntrance) this.instance).getEndTime();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceFunFairEntranceOrBuilder
            public String getPoolType() {
                return ((VoiceFunFairEntrance) this.instance).getPoolType();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceFunFairEntranceOrBuilder
            public ByteString getPoolTypeBytes() {
                return ((VoiceFunFairEntrance) this.instance).getPoolTypeBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceFunFairEntranceOrBuilder
            public String getTip() {
                return ((VoiceFunFairEntrance) this.instance).getTip();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceFunFairEntranceOrBuilder
            public ByteString getTipBytes() {
                return ((VoiceFunFairEntrance) this.instance).getTipBytes();
            }

            public Builder setBuff(boolean z) {
                copyOnWrite();
                ((VoiceFunFairEntrance) this.instance).setBuff(z);
                return this;
            }

            public Builder setBuffIcon(String str) {
                copyOnWrite();
                ((VoiceFunFairEntrance) this.instance).setBuffIcon(str);
                return this;
            }

            public Builder setBuffIconBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceFunFairEntrance) this.instance).setBuffIconBytes(byteString);
                return this;
            }

            public Builder setBuffText(String str) {
                copyOnWrite();
                ((VoiceFunFairEntrance) this.instance).setBuffText(str);
                return this;
            }

            public Builder setBuffTextBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceFunFairEntrance) this.instance).setBuffTextBytes(byteString);
                return this;
            }

            public Builder setCurrentTime(long j) {
                copyOnWrite();
                ((VoiceFunFairEntrance) this.instance).setCurrentTime(j);
                return this;
            }

            public Builder setDefaultIcon(String str) {
                copyOnWrite();
                ((VoiceFunFairEntrance) this.instance).setDefaultIcon(str);
                return this;
            }

            public Builder setDefaultIconBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceFunFairEntrance) this.instance).setDefaultIconBytes(byteString);
                return this;
            }

            public Builder setEndTime(long j) {
                copyOnWrite();
                ((VoiceFunFairEntrance) this.instance).setEndTime(j);
                return this;
            }

            public Builder setPoolType(String str) {
                copyOnWrite();
                ((VoiceFunFairEntrance) this.instance).setPoolType(str);
                return this;
            }

            public Builder setPoolTypeBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceFunFairEntrance) this.instance).setPoolTypeBytes(byteString);
                return this;
            }

            public Builder setTip(String str) {
                copyOnWrite();
                ((VoiceFunFairEntrance) this.instance).setTip(str);
                return this;
            }

            public Builder setTipBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceFunFairEntrance) this.instance).setTipBytes(byteString);
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
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(voiceFunFairEntrance);
        }

        public static VoiceFunFairEntrance parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VoiceFunFairEntrance) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceFunFairEntrance parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VoiceFunFairEntrance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<VoiceFunFairEntrance> parser() {
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.tip_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C46611.f16699xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoiceFunFairEntrance();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    VoiceFunFairEntrance voiceFunFairEntrance = (VoiceFunFairEntrance) obj2;
                    long j = this.currentTime_;
                    boolean z2 = j != 0;
                    long j2 = voiceFunFairEntrance.currentTime_;
                    this.currentTime_ = interfaceC3409h.mo17055i(z2, j, j2 != 0, j2);
                    this.defaultIcon_ = interfaceC3409h.mo17052f(!this.defaultIcon_.isEmpty(), this.defaultIcon_, !voiceFunFairEntrance.defaultIcon_.isEmpty(), voiceFunFairEntrance.defaultIcon_);
                    this.tip_ = interfaceC3409h.mo17052f(!this.tip_.isEmpty(), this.tip_, !voiceFunFairEntrance.tip_.isEmpty(), voiceFunFairEntrance.tip_);
                    boolean z3 = this.buff_;
                    boolean z4 = voiceFunFairEntrance.buff_;
                    this.buff_ = interfaceC3409h.mo17050d(z3, z3, z4, z4);
                    this.poolType_ = interfaceC3409h.mo17052f(!this.poolType_.isEmpty(), this.poolType_, !voiceFunFairEntrance.poolType_.isEmpty(), voiceFunFairEntrance.poolType_);
                    this.buffIcon_ = interfaceC3409h.mo17052f(!this.buffIcon_.isEmpty(), this.buffIcon_, !voiceFunFairEntrance.buffIcon_.isEmpty(), voiceFunFairEntrance.buffIcon_);
                    this.buffText_ = interfaceC3409h.mo17052f(!this.buffText_.isEmpty(), this.buffText_, !voiceFunFairEntrance.buffText_.isEmpty(), voiceFunFairEntrance.buffText_);
                    boolean z5 = false;
                    long j3 = this.endTime_;
                    if (j3 != 0) {
                        z5 = true;
                    }
                    long j4 = voiceFunFairEntrance.endTime_;
                    this.endTime_ = interfaceC3409h.mo17055i(z5, j3, j4 != 0, j4);
                    GeneratedMessageLite.C3408g c3408g = GeneratedMessageLite.C3408g.INSTANCE;
                    return this;
                case 6:
                    C3430e c3430e = (C3430e) obj;
                    while (!z) {
                        try {
                            int iM17171M = c3430e.m17171M();
                            if (iM17171M != 0) {
                                if (iM17171M == 8) {
                                    this.currentTime_ = c3430e.m17197v();
                                } else if (iM17171M == 18) {
                                    this.defaultIcon_ = c3430e.m17170L();
                                } else if (iM17171M == 26) {
                                    this.tip_ = c3430e.m17170L();
                                } else if (iM17171M == 32) {
                                    this.buff_ = c3430e.m17188m();
                                } else if (iM17171M == 42) {
                                    this.poolType_ = c3430e.m17170L();
                                } else if (iM17171M == 50) {
                                    this.buffIcon_ = c3430e.m17170L();
                                } else if (iM17171M == 58) {
                                    this.buffText_ = c3430e.m17170L();
                                } else if (iM17171M == 64) {
                                    this.endTime_ = c3430e.m17197v();
                                } else if (!c3430e.m17176R(iM17171M)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            iig0.m140070a(e.setUnfinishedMessage(this));
                            return null;
                        } catch (IOException e2) {
                            iig0.m140070a(new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this));
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
                                    PARSER = new GeneratedMessageLite.C3404c(DEFAULT_INSTANCE);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return PARSER;
                default:
                    l710.m153113a();
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

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            long j = this.currentTime_;
            int iM16986v = j != 0 ? CodedOutputStream.m16986v(1, j) : 0;
            if (!this.defaultIcon_.isEmpty()) {
                iM16986v += CodedOutputStream.m16956K(2, getDefaultIcon());
            }
            if (!this.tip_.isEmpty()) {
                iM16986v += CodedOutputStream.m16956K(3, getTip());
            }
            boolean z = this.buff_;
            if (z) {
                iM16986v += CodedOutputStream.m16970f(4, z);
            }
            if (!this.poolType_.isEmpty()) {
                iM16986v += CodedOutputStream.m16956K(5, getPoolType());
            }
            if (!this.buffIcon_.isEmpty()) {
                iM16986v += CodedOutputStream.m16956K(6, getBuffIcon());
            }
            if (!this.buffText_.isEmpty()) {
                iM16986v += CodedOutputStream.m16956K(7, getBuffText());
            }
            long j2 = this.endTime_;
            if (j2 != 0) {
                iM16986v += CodedOutputStream.m16986v(8, j2);
            }
            this.memoizedSerializedSize = iM16986v;
            return iM16986v;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceFunFairEntranceOrBuilder
        public String getTip() {
            return this.tip_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceFunFairEntranceOrBuilder
        public ByteString getTipBytes() {
            return ByteString.copyFromUtf8(this.tip_);
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            long j = this.currentTime_;
            if (j != 0) {
                codedOutputStream.m17027u0(1, j);
            }
            if (!this.defaultIcon_.isEmpty()) {
                codedOutputStream.mo16994D0(2, getDefaultIcon());
            }
            if (!this.tip_.isEmpty()) {
                codedOutputStream.mo16994D0(3, getTip());
            }
            boolean z = this.buff_;
            if (z) {
                codedOutputStream.mo17005a0(4, z);
            }
            if (!this.poolType_.isEmpty()) {
                codedOutputStream.mo16994D0(5, getPoolType());
            }
            if (!this.buffIcon_.isEmpty()) {
                codedOutputStream.mo16994D0(6, getBuffIcon());
            }
            if (!this.buffText_.isEmpty()) {
                codedOutputStream.mo16994D0(7, getBuffText());
            }
            long j2 = this.endTime_;
            if (j2 != 0) {
                codedOutputStream.m17027u0(8, j2);
            }
        }

        public static VoiceFunFairEntrance parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (VoiceFunFairEntrance) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static VoiceFunFairEntrance parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (VoiceFunFairEntrance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        public static VoiceFunFairEntrance parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoiceFunFairEntrance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoiceFunFairEntrance parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (VoiceFunFairEntrance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static VoiceFunFairEntrance parseFrom(InputStream inputStream) throws IOException {
            return (VoiceFunFairEntrance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceFunFairEntrance parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (VoiceFunFairEntrance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static VoiceFunFairEntrance parseFrom(C3430e c3430e) throws IOException {
            return (VoiceFunFairEntrance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static VoiceFunFairEntrance parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (VoiceFunFairEntrance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }

    public static final class VoiceLiveGameTypeMessage extends GeneratedMessageLite<VoiceLiveGameTypeMessage, Builder> implements VoiceLiveGameTypeMessageOrBuilder {
        private static final VoiceLiveGameTypeMessage DEFAULT_INSTANCE;
        public static final int GAMETYPE_FIELD_NUMBER = 2;
        public static final int LIVEID_FIELD_NUMBER = 1;
        private static volatile ng60<VoiceLiveGameTypeMessage> PARSER;
        private String liveId_ = "";
        private String gameType_ = "";

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<VoiceLiveGameTypeMessage, Builder> implements VoiceLiveGameTypeMessageOrBuilder {
            private Builder() {
                super(VoiceLiveGameTypeMessage.DEFAULT_INSTANCE);
            }

            public Builder clearGameType() {
                copyOnWrite();
                ((VoiceLiveGameTypeMessage) this.instance).clearGameType();
                return this;
            }

            public Builder clearLiveId() {
                copyOnWrite();
                ((VoiceLiveGameTypeMessage) this.instance).clearLiveId();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLiveGameTypeMessageOrBuilder
            public String getGameType() {
                return ((VoiceLiveGameTypeMessage) this.instance).getGameType();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLiveGameTypeMessageOrBuilder
            public ByteString getGameTypeBytes() {
                return ((VoiceLiveGameTypeMessage) this.instance).getGameTypeBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLiveGameTypeMessageOrBuilder
            public String getLiveId() {
                return ((VoiceLiveGameTypeMessage) this.instance).getLiveId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLiveGameTypeMessageOrBuilder
            public ByteString getLiveIdBytes() {
                return ((VoiceLiveGameTypeMessage) this.instance).getLiveIdBytes();
            }

            public Builder setGameType(String str) {
                copyOnWrite();
                ((VoiceLiveGameTypeMessage) this.instance).setGameType(str);
                return this;
            }

            public Builder setGameTypeBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceLiveGameTypeMessage) this.instance).setGameTypeBytes(byteString);
                return this;
            }

            public Builder setLiveId(String str) {
                copyOnWrite();
                ((VoiceLiveGameTypeMessage) this.instance).setLiveId(str);
                return this;
            }

            public Builder setLiveIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceLiveGameTypeMessage) this.instance).setLiveIdBytes(byteString);
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
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(voiceLiveGameTypeMessage);
        }

        public static VoiceLiveGameTypeMessage parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VoiceLiveGameTypeMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceLiveGameTypeMessage parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VoiceLiveGameTypeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<VoiceLiveGameTypeMessage> parser() {
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.liveId_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C46611.f16699xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoiceLiveGameTypeMessage();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    VoiceLiveGameTypeMessage voiceLiveGameTypeMessage = (VoiceLiveGameTypeMessage) obj2;
                    this.liveId_ = interfaceC3409h.mo17052f(!this.liveId_.isEmpty(), this.liveId_, !voiceLiveGameTypeMessage.liveId_.isEmpty(), voiceLiveGameTypeMessage.liveId_);
                    this.gameType_ = interfaceC3409h.mo17052f(!this.gameType_.isEmpty(), this.gameType_, true ^ voiceLiveGameTypeMessage.gameType_.isEmpty(), voiceLiveGameTypeMessage.gameType_);
                    GeneratedMessageLite.C3408g c3408g = GeneratedMessageLite.C3408g.INSTANCE;
                    return this;
                case 6:
                    C3430e c3430e = (C3430e) obj;
                    boolean z = false;
                    while (!z) {
                        try {
                            int iM17171M = c3430e.m17171M();
                            if (iM17171M != 0) {
                                if (iM17171M == 10) {
                                    this.liveId_ = c3430e.m17170L();
                                } else if (iM17171M == 18) {
                                    this.gameType_ = c3430e.m17170L();
                                } else if (!c3430e.m17176R(iM17171M)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            iig0.m140070a(e.setUnfinishedMessage(this));
                            return null;
                        } catch (IOException e2) {
                            iig0.m140070a(new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this));
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
                                    PARSER = new GeneratedMessageLite.C3404c(DEFAULT_INSTANCE);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return PARSER;
                default:
                    l710.m153113a();
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

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16956K = !this.liveId_.isEmpty() ? CodedOutputStream.m16956K(1, getLiveId()) : 0;
            if (!this.gameType_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(2, getGameType());
            }
            this.memoizedSerializedSize = iM16956K;
            return iM16956K;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.liveId_.isEmpty()) {
                codedOutputStream.mo16994D0(1, getLiveId());
            }
            if (this.gameType_.isEmpty()) {
                return;
            }
            codedOutputStream.mo16994D0(2, getGameType());
        }

        public static VoiceLiveGameTypeMessage parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (VoiceLiveGameTypeMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static VoiceLiveGameTypeMessage parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (VoiceLiveGameTypeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        public static VoiceLiveGameTypeMessage parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoiceLiveGameTypeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoiceLiveGameTypeMessage parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (VoiceLiveGameTypeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static VoiceLiveGameTypeMessage parseFrom(InputStream inputStream) throws IOException {
            return (VoiceLiveGameTypeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceLiveGameTypeMessage parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (VoiceLiveGameTypeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static VoiceLiveGameTypeMessage parseFrom(C3430e c3430e) throws IOException {
            return (VoiceLiveGameTypeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static VoiceLiveGameTypeMessage parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (VoiceLiveGameTypeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }

    public static final class VoiceLiveSGVAAnimationExtra extends GeneratedMessageLite<VoiceLiveSGVAAnimationExtra, Builder> implements VoiceLiveSGVAAnimationExtraOrBuilder {
        private static final VoiceLiveSGVAAnimationExtra DEFAULT_INSTANCE;
        public static final int KEY_FIELD_NUMBER = 1;
        private static volatile ng60<VoiceLiveSGVAAnimationExtra> PARSER = null;
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

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<VoiceLiveSGVAAnimationExtra, Builder> implements VoiceLiveSGVAAnimationExtraOrBuilder {
            private Builder() {
                super(VoiceLiveSGVAAnimationExtra.DEFAULT_INSTANCE);
            }

            public Builder clearKey() {
                copyOnWrite();
                ((VoiceLiveSGVAAnimationExtra) this.instance).clearKey();
                return this;
            }

            public Builder clearTextColor() {
                copyOnWrite();
                ((VoiceLiveSGVAAnimationExtra) this.instance).clearTextColor();
                return this;
            }

            public Builder clearTextFont() {
                copyOnWrite();
                ((VoiceLiveSGVAAnimationExtra) this.instance).clearTextFont();
                return this;
            }

            public Builder clearTextSize() {
                copyOnWrite();
                ((VoiceLiveSGVAAnimationExtra) this.instance).clearTextSize();
                return this;
            }

            public Builder clearType() {
                copyOnWrite();
                ((VoiceLiveSGVAAnimationExtra) this.instance).clearType();
                return this;
            }

            public Builder clearValue() {
                copyOnWrite();
                ((VoiceLiveSGVAAnimationExtra) this.instance).clearValue();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLiveSGVAAnimationExtraOrBuilder
            public String getKey() {
                return ((VoiceLiveSGVAAnimationExtra) this.instance).getKey();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLiveSGVAAnimationExtraOrBuilder
            public ByteString getKeyBytes() {
                return ((VoiceLiveSGVAAnimationExtra) this.instance).getKeyBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLiveSGVAAnimationExtraOrBuilder
            public String getTextColor() {
                return ((VoiceLiveSGVAAnimationExtra) this.instance).getTextColor();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLiveSGVAAnimationExtraOrBuilder
            public ByteString getTextColorBytes() {
                return ((VoiceLiveSGVAAnimationExtra) this.instance).getTextColorBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLiveSGVAAnimationExtraOrBuilder
            public long getTextFont() {
                return ((VoiceLiveSGVAAnimationExtra) this.instance).getTextFont();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLiveSGVAAnimationExtraOrBuilder
            public long getTextSize() {
                return ((VoiceLiveSGVAAnimationExtra) this.instance).getTextSize();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLiveSGVAAnimationExtraOrBuilder
            public long getType() {
                return ((VoiceLiveSGVAAnimationExtra) this.instance).getType();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLiveSGVAAnimationExtraOrBuilder
            public String getValue() {
                return ((VoiceLiveSGVAAnimationExtra) this.instance).getValue();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLiveSGVAAnimationExtraOrBuilder
            public ByteString getValueBytes() {
                return ((VoiceLiveSGVAAnimationExtra) this.instance).getValueBytes();
            }

            public Builder setKey(String str) {
                copyOnWrite();
                ((VoiceLiveSGVAAnimationExtra) this.instance).setKey(str);
                return this;
            }

            public Builder setKeyBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceLiveSGVAAnimationExtra) this.instance).setKeyBytes(byteString);
                return this;
            }

            public Builder setTextColor(String str) {
                copyOnWrite();
                ((VoiceLiveSGVAAnimationExtra) this.instance).setTextColor(str);
                return this;
            }

            public Builder setTextColorBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceLiveSGVAAnimationExtra) this.instance).setTextColorBytes(byteString);
                return this;
            }

            public Builder setTextFont(long j) {
                copyOnWrite();
                ((VoiceLiveSGVAAnimationExtra) this.instance).setTextFont(j);
                return this;
            }

            public Builder setTextSize(long j) {
                copyOnWrite();
                ((VoiceLiveSGVAAnimationExtra) this.instance).setTextSize(j);
                return this;
            }

            public Builder setType(long j) {
                copyOnWrite();
                ((VoiceLiveSGVAAnimationExtra) this.instance).setType(j);
                return this;
            }

            public Builder setValue(String str) {
                copyOnWrite();
                ((VoiceLiveSGVAAnimationExtra) this.instance).setValue(str);
                return this;
            }

            public Builder setValueBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceLiveSGVAAnimationExtra) this.instance).setValueBytes(byteString);
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
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(voiceLiveSGVAAnimationExtra);
        }

        public static VoiceLiveSGVAAnimationExtra parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VoiceLiveSGVAAnimationExtra) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceLiveSGVAAnimationExtra parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VoiceLiveSGVAAnimationExtra) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<VoiceLiveSGVAAnimationExtra> parser() {
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.value_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C46611.f16699xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoiceLiveSGVAAnimationExtra();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    VoiceLiveSGVAAnimationExtra voiceLiveSGVAAnimationExtra = (VoiceLiveSGVAAnimationExtra) obj2;
                    this.key_ = interfaceC3409h.mo17052f(!this.key_.isEmpty(), this.key_, !voiceLiveSGVAAnimationExtra.key_.isEmpty(), voiceLiveSGVAAnimationExtra.key_);
                    long j = this.type_;
                    boolean z2 = j != 0;
                    long j2 = voiceLiveSGVAAnimationExtra.type_;
                    this.type_ = interfaceC3409h.mo17055i(z2, j, j2 != 0, j2);
                    this.value_ = interfaceC3409h.mo17052f(!this.value_.isEmpty(), this.value_, !voiceLiveSGVAAnimationExtra.value_.isEmpty(), voiceLiveSGVAAnimationExtra.value_);
                    this.textColor_ = interfaceC3409h.mo17052f(!this.textColor_.isEmpty(), this.textColor_, !voiceLiveSGVAAnimationExtra.textColor_.isEmpty(), voiceLiveSGVAAnimationExtra.textColor_);
                    long j3 = this.textSize_;
                    boolean z3 = j3 != 0;
                    long j4 = voiceLiveSGVAAnimationExtra.textSize_;
                    this.textSize_ = interfaceC3409h.mo17055i(z3, j3, j4 != 0, j4);
                    boolean z4 = false;
                    long j5 = this.textFont_;
                    if (j5 != 0) {
                        z4 = true;
                    }
                    long j6 = voiceLiveSGVAAnimationExtra.textFont_;
                    this.textFont_ = interfaceC3409h.mo17055i(z4, j5, j6 != 0, j6);
                    GeneratedMessageLite.C3408g c3408g = GeneratedMessageLite.C3408g.INSTANCE;
                    return this;
                case 6:
                    C3430e c3430e = (C3430e) obj;
                    while (!z) {
                        try {
                            int iM17171M = c3430e.m17171M();
                            if (iM17171M != 0) {
                                if (iM17171M == 10) {
                                    this.key_ = c3430e.m17170L();
                                } else if (iM17171M == 16) {
                                    this.type_ = c3430e.m17197v();
                                } else if (iM17171M == 26) {
                                    this.value_ = c3430e.m17170L();
                                } else if (iM17171M == 34) {
                                    this.textColor_ = c3430e.m17170L();
                                } else if (iM17171M == 40) {
                                    this.textSize_ = c3430e.m17197v();
                                } else if (iM17171M == 48) {
                                    this.textFont_ = c3430e.m17197v();
                                } else if (!c3430e.m17176R(iM17171M)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            iig0.m140070a(e.setUnfinishedMessage(this));
                            return null;
                        } catch (IOException e2) {
                            iig0.m140070a(new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this));
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
                                    PARSER = new GeneratedMessageLite.C3404c(DEFAULT_INSTANCE);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return PARSER;
                default:
                    l710.m153113a();
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

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16956K = !this.key_.isEmpty() ? CodedOutputStream.m16956K(1, getKey()) : 0;
            long j = this.type_;
            if (j != 0) {
                iM16956K += CodedOutputStream.m16986v(2, j);
            }
            if (!this.value_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(3, getValue());
            }
            if (!this.textColor_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(4, getTextColor());
            }
            long j2 = this.textSize_;
            if (j2 != 0) {
                iM16956K += CodedOutputStream.m16986v(5, j2);
            }
            long j3 = this.textFont_;
            if (j3 != 0) {
                iM16956K += CodedOutputStream.m16986v(6, j3);
            }
            this.memoizedSerializedSize = iM16956K;
            return iM16956K;
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

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.key_.isEmpty()) {
                codedOutputStream.mo16994D0(1, getKey());
            }
            long j = this.type_;
            if (j != 0) {
                codedOutputStream.m17027u0(2, j);
            }
            if (!this.value_.isEmpty()) {
                codedOutputStream.mo16994D0(3, getValue());
            }
            if (!this.textColor_.isEmpty()) {
                codedOutputStream.mo16994D0(4, getTextColor());
            }
            long j2 = this.textSize_;
            if (j2 != 0) {
                codedOutputStream.m17027u0(5, j2);
            }
            long j3 = this.textFont_;
            if (j3 != 0) {
                codedOutputStream.m17027u0(6, j3);
            }
        }

        public static VoiceLiveSGVAAnimationExtra parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (VoiceLiveSGVAAnimationExtra) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static VoiceLiveSGVAAnimationExtra parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (VoiceLiveSGVAAnimationExtra) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        public static VoiceLiveSGVAAnimationExtra parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoiceLiveSGVAAnimationExtra) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoiceLiveSGVAAnimationExtra parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (VoiceLiveSGVAAnimationExtra) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static VoiceLiveSGVAAnimationExtra parseFrom(InputStream inputStream) throws IOException {
            return (VoiceLiveSGVAAnimationExtra) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceLiveSGVAAnimationExtra parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (VoiceLiveSGVAAnimationExtra) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static VoiceLiveSGVAAnimationExtra parseFrom(C3430e c3430e) throws IOException {
            return (VoiceLiveSGVAAnimationExtra) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static VoiceLiveSGVAAnimationExtra parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (VoiceLiveSGVAAnimationExtra) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }

    public static final class VoiceLiveSVGAAnimation extends GeneratedMessageLite<VoiceLiveSVGAAnimation, Builder> implements VoiceLiveSVGAAnimationOrBuilder {
        public static final int ANIMATIONEXTRAS_FIELD_NUMBER = 3;
        private static final VoiceLiveSVGAAnimation DEFAULT_INSTANCE;
        private static volatile ng60<VoiceLiveSVGAAnimation> PARSER = null;
        public static final int ROOMID_FIELD_NUMBER = 1;
        public static final int SVGAURL_FIELD_NUMBER = 2;
        private int bitField0_;
        private String roomId_ = "";
        private String svgaUrl_ = "";
        private C3437l.h<VoiceLiveSGVAAnimationExtra> animationExtras_ = GeneratedMessageLite.emptyProtobufList();

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
            AbstractC3426a.addAll(iterable, this.animationExtras_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAnimationExtras(VoiceLiveSGVAAnimationExtra.Builder builder) {
            ensureAnimationExtrasIsMutable();
            this.animationExtras_.add(builder.build());
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
            if (this.animationExtras_.mo17140q()) {
                return;
            }
            this.animationExtras_ = GeneratedMessageLite.mutableCopy(this.animationExtras_);
        }

        public static VoiceLiveSVGAAnimation getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(VoiceLiveSVGAAnimation voiceLiveSVGAAnimation) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(voiceLiveSVGAAnimation);
        }

        public static VoiceLiveSVGAAnimation parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VoiceLiveSVGAAnimation) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceLiveSVGAAnimation parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VoiceLiveSVGAAnimation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<VoiceLiveSVGAAnimation> parser() {
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
            this.animationExtras_.set(i, builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRoomId(String str) {
            str.getClass();
            this.roomId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRoomIdBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.svgaUrl_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C46611.f16699xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoiceLiveSVGAAnimation();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.animationExtras_.mo17139n();
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    VoiceLiveSVGAAnimation voiceLiveSVGAAnimation = (VoiceLiveSVGAAnimation) obj2;
                    this.roomId_ = interfaceC3409h.mo17052f(!this.roomId_.isEmpty(), this.roomId_, !voiceLiveSVGAAnimation.roomId_.isEmpty(), voiceLiveSVGAAnimation.roomId_);
                    this.svgaUrl_ = interfaceC3409h.mo17052f(!this.svgaUrl_.isEmpty(), this.svgaUrl_, true ^ voiceLiveSVGAAnimation.svgaUrl_.isEmpty(), voiceLiveSVGAAnimation.svgaUrl_);
                    this.animationExtras_ = interfaceC3409h.mo17053g(this.animationExtras_, voiceLiveSVGAAnimation.animationExtras_);
                    if (interfaceC3409h == GeneratedMessageLite.C3408g.INSTANCE) {
                        this.bitField0_ |= voiceLiveSVGAAnimation.bitField0_;
                    }
                    return this;
                case 6:
                    C3430e c3430e = (C3430e) obj;
                    C3433h c3433h = (C3433h) obj2;
                    boolean z = false;
                    while (!z) {
                        try {
                            int iM17171M = c3430e.m17171M();
                            if (iM17171M != 0) {
                                if (iM17171M == 10) {
                                    this.roomId_ = c3430e.m17170L();
                                } else if (iM17171M == 18) {
                                    this.svgaUrl_ = c3430e.m17170L();
                                } else if (iM17171M == 26) {
                                    if (!this.animationExtras_.mo17140q()) {
                                        this.animationExtras_ = GeneratedMessageLite.mutableCopy(this.animationExtras_);
                                    }
                                    this.animationExtras_.add((VoiceLiveSGVAAnimationExtra) c3430e.m17198w(VoiceLiveSGVAAnimationExtra.parser(), c3433h));
                                } else if (!c3430e.m17176R(iM17171M)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            iig0.m140070a(e.setUnfinishedMessage(this));
                            return null;
                        } catch (IOException e2) {
                            iig0.m140070a(new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this));
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
                                    PARSER = new GeneratedMessageLite.C3404c(DEFAULT_INSTANCE);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return PARSER;
                default:
                    l710.m153113a();
                    return null;
            }
            return DEFAULT_INSTANCE;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLiveSVGAAnimationOrBuilder
        public VoiceLiveSGVAAnimationExtra getAnimationExtras(int i) {
            return this.animationExtras_.get(i);
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
            return this.animationExtras_.get(i);
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

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16956K = !this.roomId_.isEmpty() ? CodedOutputStream.m16956K(1, getRoomId()) : 0;
            if (!this.svgaUrl_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(2, getSvgaUrl());
            }
            for (int i2 = 0; i2 < this.animationExtras_.size(); i2++) {
                iM16956K += CodedOutputStream.m16948C(3, this.animationExtras_.get(i2));
            }
            this.memoizedSerializedSize = iM16956K;
            return iM16956K;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLiveSVGAAnimationOrBuilder
        public String getSvgaUrl() {
            return this.svgaUrl_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLiveSVGAAnimationOrBuilder
        public ByteString getSvgaUrlBytes() {
            return ByteString.copyFromUtf8(this.svgaUrl_);
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.roomId_.isEmpty()) {
                codedOutputStream.mo16994D0(1, getRoomId());
            }
            if (!this.svgaUrl_.isEmpty()) {
                codedOutputStream.mo16994D0(2, getSvgaUrl());
            }
            for (int i = 0; i < this.animationExtras_.size(); i++) {
                codedOutputStream.mo17029w0(3, this.animationExtras_.get(i));
            }
        }

        public static VoiceLiveSVGAAnimation parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (VoiceLiveSVGAAnimation) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static VoiceLiveSVGAAnimation parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (VoiceLiveSVGAAnimation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<VoiceLiveSVGAAnimation, Builder> implements VoiceLiveSVGAAnimationOrBuilder {
            private Builder() {
                super(VoiceLiveSVGAAnimation.DEFAULT_INSTANCE);
            }

            public Builder addAllAnimationExtras(Iterable<? extends VoiceLiveSGVAAnimationExtra> iterable) {
                copyOnWrite();
                ((VoiceLiveSVGAAnimation) this.instance).addAllAnimationExtras(iterable);
                return this;
            }

            public Builder addAnimationExtras(VoiceLiveSGVAAnimationExtra voiceLiveSGVAAnimationExtra) {
                copyOnWrite();
                ((VoiceLiveSVGAAnimation) this.instance).addAnimationExtras(voiceLiveSGVAAnimationExtra);
                return this;
            }

            public Builder clearAnimationExtras() {
                copyOnWrite();
                ((VoiceLiveSVGAAnimation) this.instance).clearAnimationExtras();
                return this;
            }

            public Builder clearRoomId() {
                copyOnWrite();
                ((VoiceLiveSVGAAnimation) this.instance).clearRoomId();
                return this;
            }

            public Builder clearSvgaUrl() {
                copyOnWrite();
                ((VoiceLiveSVGAAnimation) this.instance).clearSvgaUrl();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLiveSVGAAnimationOrBuilder
            public VoiceLiveSGVAAnimationExtra getAnimationExtras(int i) {
                return ((VoiceLiveSVGAAnimation) this.instance).getAnimationExtras(i);
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLiveSVGAAnimationOrBuilder
            public int getAnimationExtrasCount() {
                return ((VoiceLiveSVGAAnimation) this.instance).getAnimationExtrasCount();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLiveSVGAAnimationOrBuilder
            public List<VoiceLiveSGVAAnimationExtra> getAnimationExtrasList() {
                return Collections.unmodifiableList(((VoiceLiveSVGAAnimation) this.instance).getAnimationExtrasList());
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLiveSVGAAnimationOrBuilder
            public String getRoomId() {
                return ((VoiceLiveSVGAAnimation) this.instance).getRoomId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLiveSVGAAnimationOrBuilder
            public ByteString getRoomIdBytes() {
                return ((VoiceLiveSVGAAnimation) this.instance).getRoomIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLiveSVGAAnimationOrBuilder
            public String getSvgaUrl() {
                return ((VoiceLiveSVGAAnimation) this.instance).getSvgaUrl();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLiveSVGAAnimationOrBuilder
            public ByteString getSvgaUrlBytes() {
                return ((VoiceLiveSVGAAnimation) this.instance).getSvgaUrlBytes();
            }

            public Builder removeAnimationExtras(int i) {
                copyOnWrite();
                ((VoiceLiveSVGAAnimation) this.instance).removeAnimationExtras(i);
                return this;
            }

            public Builder setAnimationExtras(int i, VoiceLiveSGVAAnimationExtra voiceLiveSGVAAnimationExtra) {
                copyOnWrite();
                ((VoiceLiveSVGAAnimation) this.instance).setAnimationExtras(i, voiceLiveSGVAAnimationExtra);
                return this;
            }

            public Builder setRoomId(String str) {
                copyOnWrite();
                ((VoiceLiveSVGAAnimation) this.instance).setRoomId(str);
                return this;
            }

            public Builder setRoomIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceLiveSVGAAnimation) this.instance).setRoomIdBytes(byteString);
                return this;
            }

            public Builder setSvgaUrl(String str) {
                copyOnWrite();
                ((VoiceLiveSVGAAnimation) this.instance).setSvgaUrl(str);
                return this;
            }

            public Builder setSvgaUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceLiveSVGAAnimation) this.instance).setSvgaUrlBytes(byteString);
                return this;
            }

            public Builder addAnimationExtras(int i, VoiceLiveSGVAAnimationExtra voiceLiveSGVAAnimationExtra) {
                copyOnWrite();
                ((VoiceLiveSVGAAnimation) this.instance).addAnimationExtras(i, voiceLiveSGVAAnimationExtra);
                return this;
            }

            public Builder setAnimationExtras(int i, VoiceLiveSGVAAnimationExtra.Builder builder) {
                copyOnWrite();
                ((VoiceLiveSVGAAnimation) this.instance).setAnimationExtras(i, builder);
                return this;
            }

            public Builder addAnimationExtras(VoiceLiveSGVAAnimationExtra.Builder builder) {
                copyOnWrite();
                ((VoiceLiveSVGAAnimation) this.instance).addAnimationExtras(builder);
                return this;
            }

            public Builder addAnimationExtras(int i, VoiceLiveSGVAAnimationExtra.Builder builder) {
                copyOnWrite();
                ((VoiceLiveSVGAAnimation) this.instance).addAnimationExtras(i, builder);
                return this;
            }
        }

        public static VoiceLiveSVGAAnimation parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoiceLiveSVGAAnimation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoiceLiveSVGAAnimation parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (VoiceLiveSVGAAnimation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static VoiceLiveSVGAAnimation parseFrom(InputStream inputStream) throws IOException {
            return (VoiceLiveSVGAAnimation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceLiveSVGAAnimation parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (VoiceLiveSVGAAnimation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static VoiceLiveSVGAAnimation parseFrom(C3430e c3430e) throws IOException {
            return (VoiceLiveSVGAAnimation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAnimationExtras(int i, VoiceLiveSGVAAnimationExtra voiceLiveSGVAAnimationExtra) {
            voiceLiveSGVAAnimationExtra.getClass();
            ensureAnimationExtrasIsMutable();
            this.animationExtras_.add(i, voiceLiveSGVAAnimationExtra);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static VoiceLiveSVGAAnimation parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (VoiceLiveSVGAAnimation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
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
            this.animationExtras_.add(i, builder.build());
        }
    }

    public static final class VoiceLiveTemplateMessage extends GeneratedMessageLite<VoiceLiveTemplateMessage, Builder> implements VoiceLiveTemplateMessageOrBuilder {
        private static final VoiceLiveTemplateMessage DEFAULT_INSTANCE;
        public static final int LIVEID_FIELD_NUMBER = 3;
        private static volatile ng60<VoiceLiveTemplateMessage> PARSER = null;
        public static final int ROOMID_FIELD_NUMBER = 2;
        public static final int TEMPLATE_FIELD_NUMBER = 4;
        public static final int USERID_FIELD_NUMBER = 1;
        private String userId_ = "";
        private String roomId_ = "";
        private String liveId_ = "";
        private String template_ = "";

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<VoiceLiveTemplateMessage, Builder> implements VoiceLiveTemplateMessageOrBuilder {
            private Builder() {
                super(VoiceLiveTemplateMessage.DEFAULT_INSTANCE);
            }

            public Builder clearLiveId() {
                copyOnWrite();
                ((VoiceLiveTemplateMessage) this.instance).clearLiveId();
                return this;
            }

            public Builder clearRoomId() {
                copyOnWrite();
                ((VoiceLiveTemplateMessage) this.instance).clearRoomId();
                return this;
            }

            public Builder clearTemplate() {
                copyOnWrite();
                ((VoiceLiveTemplateMessage) this.instance).clearTemplate();
                return this;
            }

            public Builder clearUserId() {
                copyOnWrite();
                ((VoiceLiveTemplateMessage) this.instance).clearUserId();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLiveTemplateMessageOrBuilder
            public String getLiveId() {
                return ((VoiceLiveTemplateMessage) this.instance).getLiveId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLiveTemplateMessageOrBuilder
            public ByteString getLiveIdBytes() {
                return ((VoiceLiveTemplateMessage) this.instance).getLiveIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLiveTemplateMessageOrBuilder
            public String getRoomId() {
                return ((VoiceLiveTemplateMessage) this.instance).getRoomId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLiveTemplateMessageOrBuilder
            public ByteString getRoomIdBytes() {
                return ((VoiceLiveTemplateMessage) this.instance).getRoomIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLiveTemplateMessageOrBuilder
            public String getTemplate() {
                return ((VoiceLiveTemplateMessage) this.instance).getTemplate();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLiveTemplateMessageOrBuilder
            public ByteString getTemplateBytes() {
                return ((VoiceLiveTemplateMessage) this.instance).getTemplateBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLiveTemplateMessageOrBuilder
            public String getUserId() {
                return ((VoiceLiveTemplateMessage) this.instance).getUserId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLiveTemplateMessageOrBuilder
            public ByteString getUserIdBytes() {
                return ((VoiceLiveTemplateMessage) this.instance).getUserIdBytes();
            }

            public Builder setLiveId(String str) {
                copyOnWrite();
                ((VoiceLiveTemplateMessage) this.instance).setLiveId(str);
                return this;
            }

            public Builder setLiveIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceLiveTemplateMessage) this.instance).setLiveIdBytes(byteString);
                return this;
            }

            public Builder setRoomId(String str) {
                copyOnWrite();
                ((VoiceLiveTemplateMessage) this.instance).setRoomId(str);
                return this;
            }

            public Builder setRoomIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceLiveTemplateMessage) this.instance).setRoomIdBytes(byteString);
                return this;
            }

            public Builder setTemplate(String str) {
                copyOnWrite();
                ((VoiceLiveTemplateMessage) this.instance).setTemplate(str);
                return this;
            }

            public Builder setTemplateBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceLiveTemplateMessage) this.instance).setTemplateBytes(byteString);
                return this;
            }

            public Builder setUserId(String str) {
                copyOnWrite();
                ((VoiceLiveTemplateMessage) this.instance).setUserId(str);
                return this;
            }

            public Builder setUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceLiveTemplateMessage) this.instance).setUserIdBytes(byteString);
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
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(voiceLiveTemplateMessage);
        }

        public static VoiceLiveTemplateMessage parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VoiceLiveTemplateMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceLiveTemplateMessage parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VoiceLiveTemplateMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<VoiceLiveTemplateMessage> parser() {
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.userId_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C46611.f16699xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoiceLiveTemplateMessage();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    VoiceLiveTemplateMessage voiceLiveTemplateMessage = (VoiceLiveTemplateMessage) obj2;
                    this.userId_ = interfaceC3409h.mo17052f(!this.userId_.isEmpty(), this.userId_, !voiceLiveTemplateMessage.userId_.isEmpty(), voiceLiveTemplateMessage.userId_);
                    this.roomId_ = interfaceC3409h.mo17052f(!this.roomId_.isEmpty(), this.roomId_, !voiceLiveTemplateMessage.roomId_.isEmpty(), voiceLiveTemplateMessage.roomId_);
                    this.liveId_ = interfaceC3409h.mo17052f(!this.liveId_.isEmpty(), this.liveId_, !voiceLiveTemplateMessage.liveId_.isEmpty(), voiceLiveTemplateMessage.liveId_);
                    this.template_ = interfaceC3409h.mo17052f(!this.template_.isEmpty(), this.template_, true ^ voiceLiveTemplateMessage.template_.isEmpty(), voiceLiveTemplateMessage.template_);
                    GeneratedMessageLite.C3408g c3408g = GeneratedMessageLite.C3408g.INSTANCE;
                    return this;
                case 6:
                    C3430e c3430e = (C3430e) obj;
                    boolean z = false;
                    while (!z) {
                        try {
                            int iM17171M = c3430e.m17171M();
                            if (iM17171M != 0) {
                                if (iM17171M == 10) {
                                    this.userId_ = c3430e.m17170L();
                                } else if (iM17171M == 18) {
                                    this.roomId_ = c3430e.m17170L();
                                } else if (iM17171M == 26) {
                                    this.liveId_ = c3430e.m17170L();
                                } else if (iM17171M == 34) {
                                    this.template_ = c3430e.m17170L();
                                } else if (!c3430e.m17176R(iM17171M)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            iig0.m140070a(e.setUnfinishedMessage(this));
                            return null;
                        } catch (IOException e2) {
                            iig0.m140070a(new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this));
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
                                    PARSER = new GeneratedMessageLite.C3404c(DEFAULT_INSTANCE);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return PARSER;
                default:
                    l710.m153113a();
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

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16956K = !this.userId_.isEmpty() ? CodedOutputStream.m16956K(1, getUserId()) : 0;
            if (!this.roomId_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(2, getRoomId());
            }
            if (!this.liveId_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(3, getLiveId());
            }
            if (!this.template_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(4, getTemplate());
            }
            this.memoizedSerializedSize = iM16956K;
            return iM16956K;
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

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.userId_.isEmpty()) {
                codedOutputStream.mo16994D0(1, getUserId());
            }
            if (!this.roomId_.isEmpty()) {
                codedOutputStream.mo16994D0(2, getRoomId());
            }
            if (!this.liveId_.isEmpty()) {
                codedOutputStream.mo16994D0(3, getLiveId());
            }
            if (this.template_.isEmpty()) {
                return;
            }
            codedOutputStream.mo16994D0(4, getTemplate());
        }

        public static VoiceLiveTemplateMessage parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (VoiceLiveTemplateMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static VoiceLiveTemplateMessage parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (VoiceLiveTemplateMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        public static VoiceLiveTemplateMessage parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoiceLiveTemplateMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoiceLiveTemplateMessage parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (VoiceLiveTemplateMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static VoiceLiveTemplateMessage parseFrom(InputStream inputStream) throws IOException {
            return (VoiceLiveTemplateMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceLiveTemplateMessage parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (VoiceLiveTemplateMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static VoiceLiveTemplateMessage parseFrom(C3430e c3430e) throws IOException {
            return (VoiceLiveTemplateMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static VoiceLiveTemplateMessage parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (VoiceLiveTemplateMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }

    public static final class VoiceLovePlanetTeam extends GeneratedMessageLite<VoiceLovePlanetTeam, Builder> implements VoiceLovePlanetTeamOrBuilder {
        private static final VoiceLovePlanetTeam DEFAULT_INSTANCE;
        public static final int OTHERUSERID_FIELD_NUMBER = 2;
        private static volatile ng60<VoiceLovePlanetTeam> PARSER = null;
        public static final int TIPS_FIELD_NUMBER = 4;
        public static final int TOTALSCORE_FIELD_NUMBER = 3;
        public static final int USERID_FIELD_NUMBER = 1;
        private long totalScore_;
        private String userId_ = "";
        private String otherUserId_ = "";
        private String tips_ = "";

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<VoiceLovePlanetTeam, Builder> implements VoiceLovePlanetTeamOrBuilder {
            private Builder() {
                super(VoiceLovePlanetTeam.DEFAULT_INSTANCE);
            }

            public Builder clearOtherUserId() {
                copyOnWrite();
                ((VoiceLovePlanetTeam) this.instance).clearOtherUserId();
                return this;
            }

            public Builder clearTips() {
                copyOnWrite();
                ((VoiceLovePlanetTeam) this.instance).clearTips();
                return this;
            }

            public Builder clearTotalScore() {
                copyOnWrite();
                ((VoiceLovePlanetTeam) this.instance).clearTotalScore();
                return this;
            }

            public Builder clearUserId() {
                copyOnWrite();
                ((VoiceLovePlanetTeam) this.instance).clearUserId();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLovePlanetTeamOrBuilder
            public String getOtherUserId() {
                return ((VoiceLovePlanetTeam) this.instance).getOtherUserId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLovePlanetTeamOrBuilder
            public ByteString getOtherUserIdBytes() {
                return ((VoiceLovePlanetTeam) this.instance).getOtherUserIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLovePlanetTeamOrBuilder
            public String getTips() {
                return ((VoiceLovePlanetTeam) this.instance).getTips();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLovePlanetTeamOrBuilder
            public ByteString getTipsBytes() {
                return ((VoiceLovePlanetTeam) this.instance).getTipsBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLovePlanetTeamOrBuilder
            public long getTotalScore() {
                return ((VoiceLovePlanetTeam) this.instance).getTotalScore();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLovePlanetTeamOrBuilder
            public String getUserId() {
                return ((VoiceLovePlanetTeam) this.instance).getUserId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLovePlanetTeamOrBuilder
            public ByteString getUserIdBytes() {
                return ((VoiceLovePlanetTeam) this.instance).getUserIdBytes();
            }

            public Builder setOtherUserId(String str) {
                copyOnWrite();
                ((VoiceLovePlanetTeam) this.instance).setOtherUserId(str);
                return this;
            }

            public Builder setOtherUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceLovePlanetTeam) this.instance).setOtherUserIdBytes(byteString);
                return this;
            }

            public Builder setTips(String str) {
                copyOnWrite();
                ((VoiceLovePlanetTeam) this.instance).setTips(str);
                return this;
            }

            public Builder setTipsBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceLovePlanetTeam) this.instance).setTipsBytes(byteString);
                return this;
            }

            public Builder setTotalScore(long j) {
                copyOnWrite();
                ((VoiceLovePlanetTeam) this.instance).setTotalScore(j);
                return this;
            }

            public Builder setUserId(String str) {
                copyOnWrite();
                ((VoiceLovePlanetTeam) this.instance).setUserId(str);
                return this;
            }

            public Builder setUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceLovePlanetTeam) this.instance).setUserIdBytes(byteString);
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
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(voiceLovePlanetTeam);
        }

        public static VoiceLovePlanetTeam parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VoiceLovePlanetTeam) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceLovePlanetTeam parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VoiceLovePlanetTeam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<VoiceLovePlanetTeam> parser() {
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.userId_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C46611.f16699xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoiceLovePlanetTeam();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    VoiceLovePlanetTeam voiceLovePlanetTeam = (VoiceLovePlanetTeam) obj2;
                    this.userId_ = interfaceC3409h.mo17052f(!this.userId_.isEmpty(), this.userId_, !voiceLovePlanetTeam.userId_.isEmpty(), voiceLovePlanetTeam.userId_);
                    this.otherUserId_ = interfaceC3409h.mo17052f(!this.otherUserId_.isEmpty(), this.otherUserId_, !voiceLovePlanetTeam.otherUserId_.isEmpty(), voiceLovePlanetTeam.otherUserId_);
                    long j = this.totalScore_;
                    boolean z2 = j != 0;
                    long j2 = voiceLovePlanetTeam.totalScore_;
                    this.totalScore_ = interfaceC3409h.mo17055i(z2, j, j2 != 0, j2);
                    this.tips_ = interfaceC3409h.mo17052f(!this.tips_.isEmpty(), this.tips_, !voiceLovePlanetTeam.tips_.isEmpty(), voiceLovePlanetTeam.tips_);
                    GeneratedMessageLite.C3408g c3408g = GeneratedMessageLite.C3408g.INSTANCE;
                    return this;
                case 6:
                    C3430e c3430e = (C3430e) obj;
                    while (!z) {
                        try {
                            int iM17171M = c3430e.m17171M();
                            if (iM17171M != 0) {
                                if (iM17171M == 10) {
                                    this.userId_ = c3430e.m17170L();
                                } else if (iM17171M == 18) {
                                    this.otherUserId_ = c3430e.m17170L();
                                } else if (iM17171M == 24) {
                                    this.totalScore_ = c3430e.m17197v();
                                } else if (iM17171M == 34) {
                                    this.tips_ = c3430e.m17170L();
                                } else if (!c3430e.m17176R(iM17171M)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            iig0.m140070a(e.setUnfinishedMessage(this));
                            return null;
                        } catch (IOException e2) {
                            iig0.m140070a(new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this));
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
                                    PARSER = new GeneratedMessageLite.C3404c(DEFAULT_INSTANCE);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return PARSER;
                default:
                    l710.m153113a();
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

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16956K = !this.userId_.isEmpty() ? CodedOutputStream.m16956K(1, getUserId()) : 0;
            if (!this.otherUserId_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(2, getOtherUserId());
            }
            long j = this.totalScore_;
            if (j != 0) {
                iM16956K += CodedOutputStream.m16986v(3, j);
            }
            if (!this.tips_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(4, getTips());
            }
            this.memoizedSerializedSize = iM16956K;
            return iM16956K;
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

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.userId_.isEmpty()) {
                codedOutputStream.mo16994D0(1, getUserId());
            }
            if (!this.otherUserId_.isEmpty()) {
                codedOutputStream.mo16994D0(2, getOtherUserId());
            }
            long j = this.totalScore_;
            if (j != 0) {
                codedOutputStream.m17027u0(3, j);
            }
            if (this.tips_.isEmpty()) {
                return;
            }
            codedOutputStream.mo16994D0(4, getTips());
        }

        public static VoiceLovePlanetTeam parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (VoiceLovePlanetTeam) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static VoiceLovePlanetTeam parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (VoiceLovePlanetTeam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        public static VoiceLovePlanetTeam parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoiceLovePlanetTeam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoiceLovePlanetTeam parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (VoiceLovePlanetTeam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static VoiceLovePlanetTeam parseFrom(InputStream inputStream) throws IOException {
            return (VoiceLovePlanetTeam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceLovePlanetTeam parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (VoiceLovePlanetTeam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static VoiceLovePlanetTeam parseFrom(C3430e c3430e) throws IOException {
            return (VoiceLovePlanetTeam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static VoiceLovePlanetTeam parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (VoiceLovePlanetTeam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }

    public static final class VoiceLovePlanetUser extends GeneratedMessageLite<VoiceLovePlanetUser, Builder> implements VoiceLovePlanetUserOrBuilder {
        public static final int AVATARCONFIG_FIELD_NUMBER = 10;
        public static final int AVATAR_FIELD_NUMBER = 3;
        private static final VoiceLovePlanetUser DEFAULT_INSTANCE;
        public static final int GENDER_FIELD_NUMBER = 7;
        public static final int ISLEAVE_FIELD_NUMBER = 8;
        private static volatile ng60<VoiceLovePlanetUser> PARSER = null;
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
                this.avatarConfig_ = userMaskConfig.AvatarConfig.newBuilder(this.avatarConfig_).mergeFrom(avatarConfig).buildPartial();
            }
        }

        public static Builder newBuilder(VoiceLovePlanetUser voiceLovePlanetUser) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(voiceLovePlanetUser);
        }

        public static VoiceLovePlanetUser parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VoiceLovePlanetUser) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceLovePlanetUser parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VoiceLovePlanetUser) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<VoiceLovePlanetUser> parser() {
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.avatar_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAvatarConfig(userMaskConfig.AvatarConfig.Builder builder) {
            this.avatarConfig_ = builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGender(String str) {
            str.getClass();
            this.gender_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGenderBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.userName_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C46611.f16699xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoiceLovePlanetUser();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    VoiceLovePlanetUser voiceLovePlanetUser = (VoiceLovePlanetUser) obj2;
                    this.userId_ = interfaceC3409h.mo17052f(!this.userId_.isEmpty(), this.userId_, !voiceLovePlanetUser.userId_.isEmpty(), voiceLovePlanetUser.userId_);
                    this.userName_ = interfaceC3409h.mo17052f(!this.userName_.isEmpty(), this.userName_, !voiceLovePlanetUser.userName_.isEmpty(), voiceLovePlanetUser.userName_);
                    this.avatar_ = interfaceC3409h.mo17052f(!this.avatar_.isEmpty(), this.avatar_, !voiceLovePlanetUser.avatar_.isEmpty(), voiceLovePlanetUser.avatar_);
                    long j = this.receivedScore_;
                    boolean z2 = j != 0;
                    long j2 = voiceLovePlanetUser.receivedScore_;
                    this.receivedScore_ = interfaceC3409h.mo17055i(z2, j, j2 != 0, j2);
                    long j3 = this.position_;
                    boolean z3 = j3 != 0;
                    long j4 = voiceLovePlanetUser.position_;
                    this.position_ = interfaceC3409h.mo17055i(z3, j3, j4 != 0, j4);
                    long j5 = this.selectPosition_;
                    boolean z4 = j5 != 0;
                    long j6 = voiceLovePlanetUser.selectPosition_;
                    this.selectPosition_ = interfaceC3409h.mo17055i(z4, j5, j6 != 0, j6);
                    this.gender_ = interfaceC3409h.mo17052f(!this.gender_.isEmpty(), this.gender_, !voiceLovePlanetUser.gender_.isEmpty(), voiceLovePlanetUser.gender_);
                    boolean z5 = this.isLeave_;
                    boolean z6 = voiceLovePlanetUser.isLeave_;
                    this.isLeave_ = interfaceC3409h.mo17050d(z5, z5, z6, z6);
                    boolean z7 = false;
                    long j7 = this.sendScore_;
                    if (j7 != 0) {
                        z7 = true;
                    }
                    long j8 = voiceLovePlanetUser.sendScore_;
                    this.sendScore_ = interfaceC3409h.mo17055i(z7, j7, j8 != 0, j8);
                    this.avatarConfig_ = (userMaskConfig.AvatarConfig) interfaceC3409h.mo17061o(this.avatarConfig_, voiceLovePlanetUser.avatarConfig_);
                    GeneratedMessageLite.C3408g c3408g = GeneratedMessageLite.C3408g.INSTANCE;
                    return this;
                case 6:
                    C3430e c3430e = (C3430e) obj;
                    C3433h c3433h = (C3433h) obj2;
                    while (!z) {
                        try {
                            int iM17171M = c3430e.m17171M();
                            switch (iM17171M) {
                                case 0:
                                    break;
                                case 10:
                                    this.userId_ = c3430e.m17170L();
                                    continue;
                                case 18:
                                    this.userName_ = c3430e.m17170L();
                                    continue;
                                case 26:
                                    this.avatar_ = c3430e.m17170L();
                                    continue;
                                case 32:
                                    this.receivedScore_ = c3430e.m17197v();
                                    continue;
                                case 40:
                                    this.position_ = c3430e.m17197v();
                                    continue;
                                case 48:
                                    this.selectPosition_ = c3430e.m17197v();
                                    continue;
                                case 58:
                                    this.gender_ = c3430e.m17170L();
                                    continue;
                                case 64:
                                    this.isLeave_ = c3430e.m17188m();
                                    continue;
                                case 72:
                                    this.sendScore_ = c3430e.m17197v();
                                    continue;
                                case EACTags.COMMAND_TO_PERFORM /* 82 */:
                                    userMaskConfig.AvatarConfig avatarConfig = this.avatarConfig_;
                                    userMaskConfig.AvatarConfig.Builder builder = avatarConfig != null ? avatarConfig.toBuilder() : null;
                                    userMaskConfig.AvatarConfig avatarConfig2 = (userMaskConfig.AvatarConfig) c3430e.m17198w(userMaskConfig.AvatarConfig.parser(), c3433h);
                                    this.avatarConfig_ = avatarConfig2;
                                    if (builder != null) {
                                        builder.mergeFrom(avatarConfig2);
                                        this.avatarConfig_ = builder.buildPartial();
                                    } else {
                                        continue;
                                    }
                                    break;
                                default:
                                    if (!c3430e.m17176R(iM17171M)) {
                                        break;
                                    }
                                    break;
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            iig0.m140070a(e.setUnfinishedMessage(this));
                            return null;
                        } catch (IOException e2) {
                            iig0.m140070a(new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this));
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
                                    PARSER = new GeneratedMessageLite.C3404c(DEFAULT_INSTANCE);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return PARSER;
                default:
                    l710.m153113a();
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

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16956K = !this.userId_.isEmpty() ? CodedOutputStream.m16956K(1, getUserId()) : 0;
            if (!this.userName_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(2, getUserName());
            }
            if (!this.avatar_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(3, getAvatar());
            }
            long j = this.receivedScore_;
            if (j != 0) {
                iM16956K += CodedOutputStream.m16986v(4, j);
            }
            long j2 = this.position_;
            if (j2 != 0) {
                iM16956K += CodedOutputStream.m16986v(5, j2);
            }
            long j3 = this.selectPosition_;
            if (j3 != 0) {
                iM16956K += CodedOutputStream.m16986v(6, j3);
            }
            if (!this.gender_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(7, getGender());
            }
            boolean z = this.isLeave_;
            if (z) {
                iM16956K += CodedOutputStream.m16970f(8, z);
            }
            long j4 = this.sendScore_;
            if (j4 != 0) {
                iM16956K += CodedOutputStream.m16986v(9, j4);
            }
            if (this.avatarConfig_ != null) {
                iM16956K += CodedOutputStream.m16948C(10, getAvatarConfig());
            }
            this.memoizedSerializedSize = iM16956K;
            return iM16956K;
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

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.userId_.isEmpty()) {
                codedOutputStream.mo16994D0(1, getUserId());
            }
            if (!this.userName_.isEmpty()) {
                codedOutputStream.mo16994D0(2, getUserName());
            }
            if (!this.avatar_.isEmpty()) {
                codedOutputStream.mo16994D0(3, getAvatar());
            }
            long j = this.receivedScore_;
            if (j != 0) {
                codedOutputStream.m17027u0(4, j);
            }
            long j2 = this.position_;
            if (j2 != 0) {
                codedOutputStream.m17027u0(5, j2);
            }
            long j3 = this.selectPosition_;
            if (j3 != 0) {
                codedOutputStream.m17027u0(6, j3);
            }
            if (!this.gender_.isEmpty()) {
                codedOutputStream.mo16994D0(7, getGender());
            }
            boolean z = this.isLeave_;
            if (z) {
                codedOutputStream.mo17005a0(8, z);
            }
            long j4 = this.sendScore_;
            if (j4 != 0) {
                codedOutputStream.m17027u0(9, j4);
            }
            if (this.avatarConfig_ != null) {
                codedOutputStream.mo17029w0(10, getAvatarConfig());
            }
        }

        public static VoiceLovePlanetUser parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (VoiceLovePlanetUser) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static VoiceLovePlanetUser parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (VoiceLovePlanetUser) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAvatarConfig(userMaskConfig.AvatarConfig avatarConfig) {
            avatarConfig.getClass();
            this.avatarConfig_ = avatarConfig;
        }

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<VoiceLovePlanetUser, Builder> implements VoiceLovePlanetUserOrBuilder {
            private Builder() {
                super(VoiceLovePlanetUser.DEFAULT_INSTANCE);
            }

            public Builder clearAvatar() {
                copyOnWrite();
                ((VoiceLovePlanetUser) this.instance).clearAvatar();
                return this;
            }

            public Builder clearAvatarConfig() {
                copyOnWrite();
                ((VoiceLovePlanetUser) this.instance).clearAvatarConfig();
                return this;
            }

            public Builder clearGender() {
                copyOnWrite();
                ((VoiceLovePlanetUser) this.instance).clearGender();
                return this;
            }

            public Builder clearIsLeave() {
                copyOnWrite();
                ((VoiceLovePlanetUser) this.instance).clearIsLeave();
                return this;
            }

            public Builder clearPosition() {
                copyOnWrite();
                ((VoiceLovePlanetUser) this.instance).clearPosition();
                return this;
            }

            public Builder clearReceivedScore() {
                copyOnWrite();
                ((VoiceLovePlanetUser) this.instance).clearReceivedScore();
                return this;
            }

            public Builder clearSelectPosition() {
                copyOnWrite();
                ((VoiceLovePlanetUser) this.instance).clearSelectPosition();
                return this;
            }

            public Builder clearSendScore() {
                copyOnWrite();
                ((VoiceLovePlanetUser) this.instance).clearSendScore();
                return this;
            }

            public Builder clearUserId() {
                copyOnWrite();
                ((VoiceLovePlanetUser) this.instance).clearUserId();
                return this;
            }

            public Builder clearUserName() {
                copyOnWrite();
                ((VoiceLovePlanetUser) this.instance).clearUserName();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLovePlanetUserOrBuilder
            public String getAvatar() {
                return ((VoiceLovePlanetUser) this.instance).getAvatar();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLovePlanetUserOrBuilder
            public ByteString getAvatarBytes() {
                return ((VoiceLovePlanetUser) this.instance).getAvatarBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLovePlanetUserOrBuilder
            public userMaskConfig.AvatarConfig getAvatarConfig() {
                return ((VoiceLovePlanetUser) this.instance).getAvatarConfig();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLovePlanetUserOrBuilder
            public String getGender() {
                return ((VoiceLovePlanetUser) this.instance).getGender();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLovePlanetUserOrBuilder
            public ByteString getGenderBytes() {
                return ((VoiceLovePlanetUser) this.instance).getGenderBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLovePlanetUserOrBuilder
            public boolean getIsLeave() {
                return ((VoiceLovePlanetUser) this.instance).getIsLeave();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLovePlanetUserOrBuilder
            public long getPosition() {
                return ((VoiceLovePlanetUser) this.instance).getPosition();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLovePlanetUserOrBuilder
            public long getReceivedScore() {
                return ((VoiceLovePlanetUser) this.instance).getReceivedScore();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLovePlanetUserOrBuilder
            public long getSelectPosition() {
                return ((VoiceLovePlanetUser) this.instance).getSelectPosition();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLovePlanetUserOrBuilder
            public long getSendScore() {
                return ((VoiceLovePlanetUser) this.instance).getSendScore();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLovePlanetUserOrBuilder
            public String getUserId() {
                return ((VoiceLovePlanetUser) this.instance).getUserId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLovePlanetUserOrBuilder
            public ByteString getUserIdBytes() {
                return ((VoiceLovePlanetUser) this.instance).getUserIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLovePlanetUserOrBuilder
            public String getUserName() {
                return ((VoiceLovePlanetUser) this.instance).getUserName();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLovePlanetUserOrBuilder
            public ByteString getUserNameBytes() {
                return ((VoiceLovePlanetUser) this.instance).getUserNameBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceLovePlanetUserOrBuilder
            public boolean hasAvatarConfig() {
                return ((VoiceLovePlanetUser) this.instance).hasAvatarConfig();
            }

            public Builder mergeAvatarConfig(userMaskConfig.AvatarConfig avatarConfig) {
                copyOnWrite();
                ((VoiceLovePlanetUser) this.instance).mergeAvatarConfig(avatarConfig);
                return this;
            }

            public Builder setAvatar(String str) {
                copyOnWrite();
                ((VoiceLovePlanetUser) this.instance).setAvatar(str);
                return this;
            }

            public Builder setAvatarBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceLovePlanetUser) this.instance).setAvatarBytes(byteString);
                return this;
            }

            public Builder setAvatarConfig(userMaskConfig.AvatarConfig avatarConfig) {
                copyOnWrite();
                ((VoiceLovePlanetUser) this.instance).setAvatarConfig(avatarConfig);
                return this;
            }

            public Builder setGender(String str) {
                copyOnWrite();
                ((VoiceLovePlanetUser) this.instance).setGender(str);
                return this;
            }

            public Builder setGenderBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceLovePlanetUser) this.instance).setGenderBytes(byteString);
                return this;
            }

            public Builder setIsLeave(boolean z) {
                copyOnWrite();
                ((VoiceLovePlanetUser) this.instance).setIsLeave(z);
                return this;
            }

            public Builder setPosition(long j) {
                copyOnWrite();
                ((VoiceLovePlanetUser) this.instance).setPosition(j);
                return this;
            }

            public Builder setReceivedScore(long j) {
                copyOnWrite();
                ((VoiceLovePlanetUser) this.instance).setReceivedScore(j);
                return this;
            }

            public Builder setSelectPosition(long j) {
                copyOnWrite();
                ((VoiceLovePlanetUser) this.instance).setSelectPosition(j);
                return this;
            }

            public Builder setSendScore(long j) {
                copyOnWrite();
                ((VoiceLovePlanetUser) this.instance).setSendScore(j);
                return this;
            }

            public Builder setUserId(String str) {
                copyOnWrite();
                ((VoiceLovePlanetUser) this.instance).setUserId(str);
                return this;
            }

            public Builder setUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceLovePlanetUser) this.instance).setUserIdBytes(byteString);
                return this;
            }

            public Builder setUserName(String str) {
                copyOnWrite();
                ((VoiceLovePlanetUser) this.instance).setUserName(str);
                return this;
            }

            public Builder setUserNameBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceLovePlanetUser) this.instance).setUserNameBytes(byteString);
                return this;
            }

            public Builder setAvatarConfig(userMaskConfig.AvatarConfig.Builder builder) {
                copyOnWrite();
                ((VoiceLovePlanetUser) this.instance).setAvatarConfig(builder);
                return this;
            }
        }

        public static VoiceLovePlanetUser parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoiceLovePlanetUser) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoiceLovePlanetUser parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (VoiceLovePlanetUser) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static VoiceLovePlanetUser parseFrom(InputStream inputStream) throws IOException {
            return (VoiceLovePlanetUser) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceLovePlanetUser parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (VoiceLovePlanetUser) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static VoiceLovePlanetUser parseFrom(C3430e c3430e) throws IOException {
            return (VoiceLovePlanetUser) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static VoiceLovePlanetUser parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (VoiceLovePlanetUser) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
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
        private static volatile ng60<VoicePayGuidePopUp> PARSER = null;
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
                this.toUserMask_ = userMaskConfig.UserMask.newBuilder(this.toUserMask_).mergeFrom(userMask).buildPartial();
            }
        }

        public static Builder newBuilder(VoicePayGuidePopUp voicePayGuidePopUp) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(voicePayGuidePopUp);
        }

        public static VoicePayGuidePopUp parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VoicePayGuidePopUp) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoicePayGuidePopUp parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VoicePayGuidePopUp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<VoicePayGuidePopUp> parser() {
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.title_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setToUserMask(userMaskConfig.UserMask.Builder builder) {
            this.toUserMask_ = builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserId(String str) {
            str.getClass();
            this.userId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserIdBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.userTag_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C46611.f16699xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoicePayGuidePopUp();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    VoicePayGuidePopUp voicePayGuidePopUp = (VoicePayGuidePopUp) obj2;
                    this.userId_ = interfaceC3409h.mo17052f(!this.userId_.isEmpty(), this.userId_, !voicePayGuidePopUp.userId_.isEmpty(), voicePayGuidePopUp.userId_);
                    this.roomId_ = interfaceC3409h.mo17052f(!this.roomId_.isEmpty(), this.roomId_, !voicePayGuidePopUp.roomId_.isEmpty(), voicePayGuidePopUp.roomId_);
                    this.title_ = interfaceC3409h.mo17052f(!this.title_.isEmpty(), this.title_, !voicePayGuidePopUp.title_.isEmpty(), voicePayGuidePopUp.title_);
                    this.subTitle_ = interfaceC3409h.mo17052f(!this.subTitle_.isEmpty(), this.subTitle_, !voicePayGuidePopUp.subTitle_.isEmpty(), voicePayGuidePopUp.subTitle_);
                    this.bubbleTitle_ = interfaceC3409h.mo17052f(!this.bubbleTitle_.isEmpty(), this.bubbleTitle_, !voicePayGuidePopUp.bubbleTitle_.isEmpty(), voicePayGuidePopUp.bubbleTitle_);
                    this.buttonTitle_ = interfaceC3409h.mo17052f(!this.buttonTitle_.isEmpty(), this.buttonTitle_, !voicePayGuidePopUp.buttonTitle_.isEmpty(), voicePayGuidePopUp.buttonTitle_);
                    long j = this.giftId_;
                    boolean z2 = j != 0;
                    long j2 = voicePayGuidePopUp.giftId_;
                    this.giftId_ = interfaceC3409h.mo17055i(z2, j, j2 != 0, j2);
                    this.giftIcon_ = interfaceC3409h.mo17052f(!this.giftIcon_.isEmpty(), this.giftIcon_, !voicePayGuidePopUp.giftIcon_.isEmpty(), voicePayGuidePopUp.giftIcon_);
                    int i = this.guideType_;
                    boolean z3 = i != 0;
                    int i2 = voicePayGuidePopUp.guideType_;
                    this.guideType_ = interfaceC3409h.mo17051e(z3, i, i2 != 0, i2);
                    this.toUserMask_ = (userMaskConfig.UserMask) interfaceC3409h.mo17061o(this.toUserMask_, voicePayGuidePopUp.toUserMask_);
                    this.userTag_ = interfaceC3409h.mo17052f(!this.userTag_.isEmpty(), this.userTag_, !voicePayGuidePopUp.userTag_.isEmpty(), voicePayGuidePopUp.userTag_);
                    boolean z4 = false;
                    long j3 = this.giftCount_;
                    if (j3 != 0) {
                        z4 = true;
                    }
                    long j4 = voicePayGuidePopUp.giftCount_;
                    this.giftCount_ = interfaceC3409h.mo17055i(z4, j3, j4 != 0, j4);
                    GeneratedMessageLite.C3408g c3408g = GeneratedMessageLite.C3408g.INSTANCE;
                    return this;
                case 6:
                    C3430e c3430e = (C3430e) obj;
                    C3433h c3433h = (C3433h) obj2;
                    while (!z) {
                        try {
                            int iM17171M = c3430e.m17171M();
                            switch (iM17171M) {
                                case 0:
                                    break;
                                case 10:
                                    this.userId_ = c3430e.m17170L();
                                    continue;
                                case 18:
                                    this.roomId_ = c3430e.m17170L();
                                    continue;
                                case 26:
                                    this.title_ = c3430e.m17170L();
                                    continue;
                                case 34:
                                    this.subTitle_ = c3430e.m17170L();
                                    continue;
                                case 42:
                                    this.bubbleTitle_ = c3430e.m17170L();
                                    continue;
                                case 50:
                                    this.buttonTitle_ = c3430e.m17170L();
                                    continue;
                                case 56:
                                    this.giftId_ = c3430e.m17197v();
                                    continue;
                                case 66:
                                    this.giftIcon_ = c3430e.m17170L();
                                    continue;
                                case 72:
                                    this.guideType_ = c3430e.m17191p();
                                    continue;
                                case EACTags.COMMAND_TO_PERFORM /* 82 */:
                                    userMaskConfig.UserMask userMask = this.toUserMask_;
                                    userMaskConfig.UserMask.Builder builder = userMask != null ? userMask.toBuilder() : null;
                                    userMaskConfig.UserMask userMask2 = (userMaskConfig.UserMask) c3430e.m17198w(userMaskConfig.UserMask.parser(), c3433h);
                                    this.toUserMask_ = userMask2;
                                    if (builder != null) {
                                        builder.mergeFrom(userMask2);
                                        this.toUserMask_ = builder.buildPartial();
                                    } else {
                                        continue;
                                    }
                                    break;
                                case 90:
                                    this.userTag_ = c3430e.m17170L();
                                    continue;
                                case Opcodes.IADD /* 96 */:
                                    this.giftCount_ = c3430e.m17197v();
                                    continue;
                                default:
                                    if (!c3430e.m17176R(iM17171M)) {
                                        break;
                                    }
                                    break;
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            iig0.m140070a(e.setUnfinishedMessage(this));
                            return null;
                        } catch (IOException e2) {
                            iig0.m140070a(new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this));
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
                                    PARSER = new GeneratedMessageLite.C3404c(DEFAULT_INSTANCE);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return PARSER;
                default:
                    l710.m153113a();
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

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16956K = !this.userId_.isEmpty() ? CodedOutputStream.m16956K(1, getUserId()) : 0;
            if (!this.roomId_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(2, getRoomId());
            }
            if (!this.title_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(3, getTitle());
            }
            if (!this.subTitle_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(4, getSubTitle());
            }
            if (!this.bubbleTitle_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(5, getBubbleTitle());
            }
            if (!this.buttonTitle_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(6, getButtonTitle());
            }
            long j = this.giftId_;
            if (j != 0) {
                iM16956K += CodedOutputStream.m16986v(7, j);
            }
            if (!this.giftIcon_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(8, getGiftIcon());
            }
            if (this.guideType_ != GuideType.empty.getNumber()) {
                iM16956K += CodedOutputStream.m16977m(9, this.guideType_);
            }
            if (this.toUserMask_ != null) {
                iM16956K += CodedOutputStream.m16948C(10, getToUserMask());
            }
            if (!this.userTag_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(11, getUserTag());
            }
            long j2 = this.giftCount_;
            if (j2 != 0) {
                iM16956K += CodedOutputStream.m16986v(12, j2);
            }
            this.memoizedSerializedSize = iM16956K;
            return iM16956K;
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

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.userId_.isEmpty()) {
                codedOutputStream.mo16994D0(1, getUserId());
            }
            if (!this.roomId_.isEmpty()) {
                codedOutputStream.mo16994D0(2, getRoomId());
            }
            if (!this.title_.isEmpty()) {
                codedOutputStream.mo16994D0(3, getTitle());
            }
            if (!this.subTitle_.isEmpty()) {
                codedOutputStream.mo16994D0(4, getSubTitle());
            }
            if (!this.bubbleTitle_.isEmpty()) {
                codedOutputStream.mo16994D0(5, getBubbleTitle());
            }
            if (!this.buttonTitle_.isEmpty()) {
                codedOutputStream.mo16994D0(6, getButtonTitle());
            }
            long j = this.giftId_;
            if (j != 0) {
                codedOutputStream.m17027u0(7, j);
            }
            if (!this.giftIcon_.isEmpty()) {
                codedOutputStream.mo16994D0(8, getGiftIcon());
            }
            if (this.guideType_ != GuideType.empty.getNumber()) {
                codedOutputStream.m17015i0(9, this.guideType_);
            }
            if (this.toUserMask_ != null) {
                codedOutputStream.mo17029w0(10, getToUserMask());
            }
            if (!this.userTag_.isEmpty()) {
                codedOutputStream.mo16994D0(11, getUserTag());
            }
            long j2 = this.giftCount_;
            if (j2 != 0) {
                codedOutputStream.m17027u0(12, j2);
            }
        }

        public static VoicePayGuidePopUp parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (VoicePayGuidePopUp) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static VoicePayGuidePopUp parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (VoicePayGuidePopUp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setToUserMask(userMaskConfig.UserMask userMask) {
            userMask.getClass();
            this.toUserMask_ = userMask;
        }

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<VoicePayGuidePopUp, Builder> implements VoicePayGuidePopUpOrBuilder {
            private Builder() {
                super(VoicePayGuidePopUp.DEFAULT_INSTANCE);
            }

            public Builder clearBubbleTitle() {
                copyOnWrite();
                ((VoicePayGuidePopUp) this.instance).clearBubbleTitle();
                return this;
            }

            public Builder clearButtonTitle() {
                copyOnWrite();
                ((VoicePayGuidePopUp) this.instance).clearButtonTitle();
                return this;
            }

            public Builder clearGiftCount() {
                copyOnWrite();
                ((VoicePayGuidePopUp) this.instance).clearGiftCount();
                return this;
            }

            public Builder clearGiftIcon() {
                copyOnWrite();
                ((VoicePayGuidePopUp) this.instance).clearGiftIcon();
                return this;
            }

            public Builder clearGiftId() {
                copyOnWrite();
                ((VoicePayGuidePopUp) this.instance).clearGiftId();
                return this;
            }

            public Builder clearGuideType() {
                copyOnWrite();
                ((VoicePayGuidePopUp) this.instance).clearGuideType();
                return this;
            }

            public Builder clearRoomId() {
                copyOnWrite();
                ((VoicePayGuidePopUp) this.instance).clearRoomId();
                return this;
            }

            public Builder clearSubTitle() {
                copyOnWrite();
                ((VoicePayGuidePopUp) this.instance).clearSubTitle();
                return this;
            }

            public Builder clearTitle() {
                copyOnWrite();
                ((VoicePayGuidePopUp) this.instance).clearTitle();
                return this;
            }

            public Builder clearToUserMask() {
                copyOnWrite();
                ((VoicePayGuidePopUp) this.instance).clearToUserMask();
                return this;
            }

            public Builder clearUserId() {
                copyOnWrite();
                ((VoicePayGuidePopUp) this.instance).clearUserId();
                return this;
            }

            public Builder clearUserTag() {
                copyOnWrite();
                ((VoicePayGuidePopUp) this.instance).clearUserTag();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuidePopUpOrBuilder
            public String getBubbleTitle() {
                return ((VoicePayGuidePopUp) this.instance).getBubbleTitle();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuidePopUpOrBuilder
            public ByteString getBubbleTitleBytes() {
                return ((VoicePayGuidePopUp) this.instance).getBubbleTitleBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuidePopUpOrBuilder
            public String getButtonTitle() {
                return ((VoicePayGuidePopUp) this.instance).getButtonTitle();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuidePopUpOrBuilder
            public ByteString getButtonTitleBytes() {
                return ((VoicePayGuidePopUp) this.instance).getButtonTitleBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuidePopUpOrBuilder
            public long getGiftCount() {
                return ((VoicePayGuidePopUp) this.instance).getGiftCount();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuidePopUpOrBuilder
            public String getGiftIcon() {
                return ((VoicePayGuidePopUp) this.instance).getGiftIcon();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuidePopUpOrBuilder
            public ByteString getGiftIconBytes() {
                return ((VoicePayGuidePopUp) this.instance).getGiftIconBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuidePopUpOrBuilder
            public long getGiftId() {
                return ((VoicePayGuidePopUp) this.instance).getGiftId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuidePopUpOrBuilder
            public GuideType getGuideType() {
                return ((VoicePayGuidePopUp) this.instance).getGuideType();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuidePopUpOrBuilder
            public int getGuideTypeValue() {
                return ((VoicePayGuidePopUp) this.instance).getGuideTypeValue();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuidePopUpOrBuilder
            public String getRoomId() {
                return ((VoicePayGuidePopUp) this.instance).getRoomId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuidePopUpOrBuilder
            public ByteString getRoomIdBytes() {
                return ((VoicePayGuidePopUp) this.instance).getRoomIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuidePopUpOrBuilder
            public String getSubTitle() {
                return ((VoicePayGuidePopUp) this.instance).getSubTitle();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuidePopUpOrBuilder
            public ByteString getSubTitleBytes() {
                return ((VoicePayGuidePopUp) this.instance).getSubTitleBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuidePopUpOrBuilder
            public String getTitle() {
                return ((VoicePayGuidePopUp) this.instance).getTitle();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuidePopUpOrBuilder
            public ByteString getTitleBytes() {
                return ((VoicePayGuidePopUp) this.instance).getTitleBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuidePopUpOrBuilder
            public userMaskConfig.UserMask getToUserMask() {
                return ((VoicePayGuidePopUp) this.instance).getToUserMask();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuidePopUpOrBuilder
            public String getUserId() {
                return ((VoicePayGuidePopUp) this.instance).getUserId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuidePopUpOrBuilder
            public ByteString getUserIdBytes() {
                return ((VoicePayGuidePopUp) this.instance).getUserIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuidePopUpOrBuilder
            public String getUserTag() {
                return ((VoicePayGuidePopUp) this.instance).getUserTag();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuidePopUpOrBuilder
            public ByteString getUserTagBytes() {
                return ((VoicePayGuidePopUp) this.instance).getUserTagBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuidePopUpOrBuilder
            public boolean hasToUserMask() {
                return ((VoicePayGuidePopUp) this.instance).hasToUserMask();
            }

            public Builder mergeToUserMask(userMaskConfig.UserMask userMask) {
                copyOnWrite();
                ((VoicePayGuidePopUp) this.instance).mergeToUserMask(userMask);
                return this;
            }

            public Builder setBubbleTitle(String str) {
                copyOnWrite();
                ((VoicePayGuidePopUp) this.instance).setBubbleTitle(str);
                return this;
            }

            public Builder setBubbleTitleBytes(ByteString byteString) {
                copyOnWrite();
                ((VoicePayGuidePopUp) this.instance).setBubbleTitleBytes(byteString);
                return this;
            }

            public Builder setButtonTitle(String str) {
                copyOnWrite();
                ((VoicePayGuidePopUp) this.instance).setButtonTitle(str);
                return this;
            }

            public Builder setButtonTitleBytes(ByteString byteString) {
                copyOnWrite();
                ((VoicePayGuidePopUp) this.instance).setButtonTitleBytes(byteString);
                return this;
            }

            public Builder setGiftCount(long j) {
                copyOnWrite();
                ((VoicePayGuidePopUp) this.instance).setGiftCount(j);
                return this;
            }

            public Builder setGiftIcon(String str) {
                copyOnWrite();
                ((VoicePayGuidePopUp) this.instance).setGiftIcon(str);
                return this;
            }

            public Builder setGiftIconBytes(ByteString byteString) {
                copyOnWrite();
                ((VoicePayGuidePopUp) this.instance).setGiftIconBytes(byteString);
                return this;
            }

            public Builder setGiftId(long j) {
                copyOnWrite();
                ((VoicePayGuidePopUp) this.instance).setGiftId(j);
                return this;
            }

            public Builder setGuideType(GuideType guideType) {
                copyOnWrite();
                ((VoicePayGuidePopUp) this.instance).setGuideType(guideType);
                return this;
            }

            public Builder setGuideTypeValue(int i) {
                copyOnWrite();
                ((VoicePayGuidePopUp) this.instance).setGuideTypeValue(i);
                return this;
            }

            public Builder setRoomId(String str) {
                copyOnWrite();
                ((VoicePayGuidePopUp) this.instance).setRoomId(str);
                return this;
            }

            public Builder setRoomIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoicePayGuidePopUp) this.instance).setRoomIdBytes(byteString);
                return this;
            }

            public Builder setSubTitle(String str) {
                copyOnWrite();
                ((VoicePayGuidePopUp) this.instance).setSubTitle(str);
                return this;
            }

            public Builder setSubTitleBytes(ByteString byteString) {
                copyOnWrite();
                ((VoicePayGuidePopUp) this.instance).setSubTitleBytes(byteString);
                return this;
            }

            public Builder setTitle(String str) {
                copyOnWrite();
                ((VoicePayGuidePopUp) this.instance).setTitle(str);
                return this;
            }

            public Builder setTitleBytes(ByteString byteString) {
                copyOnWrite();
                ((VoicePayGuidePopUp) this.instance).setTitleBytes(byteString);
                return this;
            }

            public Builder setToUserMask(userMaskConfig.UserMask userMask) {
                copyOnWrite();
                ((VoicePayGuidePopUp) this.instance).setToUserMask(userMask);
                return this;
            }

            public Builder setUserId(String str) {
                copyOnWrite();
                ((VoicePayGuidePopUp) this.instance).setUserId(str);
                return this;
            }

            public Builder setUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoicePayGuidePopUp) this.instance).setUserIdBytes(byteString);
                return this;
            }

            public Builder setUserTag(String str) {
                copyOnWrite();
                ((VoicePayGuidePopUp) this.instance).setUserTag(str);
                return this;
            }

            public Builder setUserTagBytes(ByteString byteString) {
                copyOnWrite();
                ((VoicePayGuidePopUp) this.instance).setUserTagBytes(byteString);
                return this;
            }

            public Builder setToUserMask(userMaskConfig.UserMask.Builder builder) {
                copyOnWrite();
                ((VoicePayGuidePopUp) this.instance).setToUserMask(builder);
                return this;
            }
        }

        public static VoicePayGuidePopUp parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoicePayGuidePopUp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoicePayGuidePopUp parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (VoicePayGuidePopUp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static VoicePayGuidePopUp parseFrom(InputStream inputStream) throws IOException {
            return (VoicePayGuidePopUp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoicePayGuidePopUp parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (VoicePayGuidePopUp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static VoicePayGuidePopUp parseFrom(C3430e c3430e) throws IOException {
            return (VoicePayGuidePopUp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static VoicePayGuidePopUp parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (VoicePayGuidePopUp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }

    public static final class VoicePayGuideUser extends GeneratedMessageLite<VoicePayGuideUser, Builder> implements VoicePayGuideUserOrBuilder {
        private static final VoicePayGuideUser DEFAULT_INSTANCE;
        private static volatile ng60<VoicePayGuideUser> PARSER = null;
        public static final int USERID_FIELD_NUMBER = 1;
        private String userId_ = "";

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<VoicePayGuideUser, Builder> implements VoicePayGuideUserOrBuilder {
            private Builder() {
                super(VoicePayGuideUser.DEFAULT_INSTANCE);
            }

            public Builder clearUserId() {
                copyOnWrite();
                ((VoicePayGuideUser) this.instance).clearUserId();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideUserOrBuilder
            public String getUserId() {
                return ((VoicePayGuideUser) this.instance).getUserId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideUserOrBuilder
            public ByteString getUserIdBytes() {
                return ((VoicePayGuideUser) this.instance).getUserIdBytes();
            }

            public Builder setUserId(String str) {
                copyOnWrite();
                ((VoicePayGuideUser) this.instance).setUserId(str);
                return this;
            }

            public Builder setUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoicePayGuideUser) this.instance).setUserIdBytes(byteString);
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
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(voicePayGuideUser);
        }

        public static VoicePayGuideUser parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VoicePayGuideUser) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoicePayGuideUser parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VoicePayGuideUser) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<VoicePayGuideUser> parser() {
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.userId_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C46611.f16699xa1df5c61[methodToInvoke.ordinal()]) {
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
                    this.userId_ = ((GeneratedMessageLite.InterfaceC3409h) obj).mo17052f(!this.userId_.isEmpty(), this.userId_, true ^ voicePayGuideUser.userId_.isEmpty(), voicePayGuideUser.userId_);
                    GeneratedMessageLite.C3408g c3408g = GeneratedMessageLite.C3408g.INSTANCE;
                    return this;
                case 6:
                    C3430e c3430e = (C3430e) obj;
                    boolean z = false;
                    while (!z) {
                        try {
                            int iM17171M = c3430e.m17171M();
                            if (iM17171M != 0) {
                                if (iM17171M == 10) {
                                    this.userId_ = c3430e.m17170L();
                                } else if (!c3430e.m17176R(iM17171M)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            iig0.m140070a(e.setUnfinishedMessage(this));
                            return null;
                        } catch (IOException e2) {
                            iig0.m140070a(new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this));
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
                                    PARSER = new GeneratedMessageLite.C3404c(DEFAULT_INSTANCE);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return PARSER;
                default:
                    l710.m153113a();
                    return null;
            }
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16956K = !this.userId_.isEmpty() ? CodedOutputStream.m16956K(1, getUserId()) : 0;
            this.memoizedSerializedSize = iM16956K;
            return iM16956K;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideUserOrBuilder
        public String getUserId() {
            return this.userId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideUserOrBuilder
        public ByteString getUserIdBytes() {
            return ByteString.copyFromUtf8(this.userId_);
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.userId_.isEmpty()) {
                return;
            }
            codedOutputStream.mo16994D0(1, getUserId());
        }

        public static VoicePayGuideUser parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (VoicePayGuideUser) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static VoicePayGuideUser parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (VoicePayGuideUser) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        public static VoicePayGuideUser parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoicePayGuideUser) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoicePayGuideUser parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (VoicePayGuideUser) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static VoicePayGuideUser parseFrom(InputStream inputStream) throws IOException {
            return (VoicePayGuideUser) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoicePayGuideUser parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (VoicePayGuideUser) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static VoicePayGuideUser parseFrom(C3430e c3430e) throws IOException {
            return (VoicePayGuideUser) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static VoicePayGuideUser parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (VoicePayGuideUser) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }

    public static final class VoicePayGuideUserInfo extends GeneratedMessageLite<VoicePayGuideUserInfo, Builder> implements VoicePayGuideUserInfoOrBuilder {
        public static final int AGE_FIELD_NUMBER = 5;
        public static final int AVATAR_FIELD_NUMBER = 3;
        private static final VoicePayGuideUserInfo DEFAULT_INSTANCE;
        public static final int GENDER_FIELD_NUMBER = 4;
        public static final int NAME_FIELD_NUMBER = 2;
        private static volatile ng60<VoicePayGuideUserInfo> PARSER = null;
        public static final int USERID_FIELD_NUMBER = 1;
        public static final int ZODIAC_FIELD_NUMBER = 6;
        private int age_;
        private String userId_ = "";
        private String name_ = "";
        private String avatar_ = "";
        private String gender_ = "";
        private String zodiac_ = "";

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<VoicePayGuideUserInfo, Builder> implements VoicePayGuideUserInfoOrBuilder {
            private Builder() {
                super(VoicePayGuideUserInfo.DEFAULT_INSTANCE);
            }

            public Builder clearAge() {
                copyOnWrite();
                ((VoicePayGuideUserInfo) this.instance).clearAge();
                return this;
            }

            public Builder clearAvatar() {
                copyOnWrite();
                ((VoicePayGuideUserInfo) this.instance).clearAvatar();
                return this;
            }

            public Builder clearGender() {
                copyOnWrite();
                ((VoicePayGuideUserInfo) this.instance).clearGender();
                return this;
            }

            public Builder clearName() {
                copyOnWrite();
                ((VoicePayGuideUserInfo) this.instance).clearName();
                return this;
            }

            public Builder clearUserId() {
                copyOnWrite();
                ((VoicePayGuideUserInfo) this.instance).clearUserId();
                return this;
            }

            public Builder clearZodiac() {
                copyOnWrite();
                ((VoicePayGuideUserInfo) this.instance).clearZodiac();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideUserInfoOrBuilder
            public int getAge() {
                return ((VoicePayGuideUserInfo) this.instance).getAge();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideUserInfoOrBuilder
            public String getAvatar() {
                return ((VoicePayGuideUserInfo) this.instance).getAvatar();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideUserInfoOrBuilder
            public ByteString getAvatarBytes() {
                return ((VoicePayGuideUserInfo) this.instance).getAvatarBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideUserInfoOrBuilder
            public String getGender() {
                return ((VoicePayGuideUserInfo) this.instance).getGender();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideUserInfoOrBuilder
            public ByteString getGenderBytes() {
                return ((VoicePayGuideUserInfo) this.instance).getGenderBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideUserInfoOrBuilder
            public String getName() {
                return ((VoicePayGuideUserInfo) this.instance).getName();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideUserInfoOrBuilder
            public ByteString getNameBytes() {
                return ((VoicePayGuideUserInfo) this.instance).getNameBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideUserInfoOrBuilder
            public String getUserId() {
                return ((VoicePayGuideUserInfo) this.instance).getUserId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideUserInfoOrBuilder
            public ByteString getUserIdBytes() {
                return ((VoicePayGuideUserInfo) this.instance).getUserIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideUserInfoOrBuilder
            public String getZodiac() {
                return ((VoicePayGuideUserInfo) this.instance).getZodiac();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideUserInfoOrBuilder
            public ByteString getZodiacBytes() {
                return ((VoicePayGuideUserInfo) this.instance).getZodiacBytes();
            }

            public Builder setAge(int i) {
                copyOnWrite();
                ((VoicePayGuideUserInfo) this.instance).setAge(i);
                return this;
            }

            public Builder setAvatar(String str) {
                copyOnWrite();
                ((VoicePayGuideUserInfo) this.instance).setAvatar(str);
                return this;
            }

            public Builder setAvatarBytes(ByteString byteString) {
                copyOnWrite();
                ((VoicePayGuideUserInfo) this.instance).setAvatarBytes(byteString);
                return this;
            }

            public Builder setGender(String str) {
                copyOnWrite();
                ((VoicePayGuideUserInfo) this.instance).setGender(str);
                return this;
            }

            public Builder setGenderBytes(ByteString byteString) {
                copyOnWrite();
                ((VoicePayGuideUserInfo) this.instance).setGenderBytes(byteString);
                return this;
            }

            public Builder setName(String str) {
                copyOnWrite();
                ((VoicePayGuideUserInfo) this.instance).setName(str);
                return this;
            }

            public Builder setNameBytes(ByteString byteString) {
                copyOnWrite();
                ((VoicePayGuideUserInfo) this.instance).setNameBytes(byteString);
                return this;
            }

            public Builder setUserId(String str) {
                copyOnWrite();
                ((VoicePayGuideUserInfo) this.instance).setUserId(str);
                return this;
            }

            public Builder setUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoicePayGuideUserInfo) this.instance).setUserIdBytes(byteString);
                return this;
            }

            public Builder setZodiac(String str) {
                copyOnWrite();
                ((VoicePayGuideUserInfo) this.instance).setZodiac(str);
                return this;
            }

            public Builder setZodiacBytes(ByteString byteString) {
                copyOnWrite();
                ((VoicePayGuideUserInfo) this.instance).setZodiacBytes(byteString);
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
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(voicePayGuideUserInfo);
        }

        public static VoicePayGuideUserInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VoicePayGuideUserInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoicePayGuideUserInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VoicePayGuideUserInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<VoicePayGuideUserInfo> parser() {
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.zodiac_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C46611.f16699xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoicePayGuideUserInfo();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    VoicePayGuideUserInfo voicePayGuideUserInfo = (VoicePayGuideUserInfo) obj2;
                    this.userId_ = interfaceC3409h.mo17052f(!this.userId_.isEmpty(), this.userId_, !voicePayGuideUserInfo.userId_.isEmpty(), voicePayGuideUserInfo.userId_);
                    this.name_ = interfaceC3409h.mo17052f(!this.name_.isEmpty(), this.name_, !voicePayGuideUserInfo.name_.isEmpty(), voicePayGuideUserInfo.name_);
                    this.avatar_ = interfaceC3409h.mo17052f(!this.avatar_.isEmpty(), this.avatar_, !voicePayGuideUserInfo.avatar_.isEmpty(), voicePayGuideUserInfo.avatar_);
                    this.gender_ = interfaceC3409h.mo17052f(!this.gender_.isEmpty(), this.gender_, !voicePayGuideUserInfo.gender_.isEmpty(), voicePayGuideUserInfo.gender_);
                    int i = this.age_;
                    boolean z2 = i != 0;
                    int i2 = voicePayGuideUserInfo.age_;
                    this.age_ = interfaceC3409h.mo17051e(z2, i, i2 != 0, i2);
                    this.zodiac_ = interfaceC3409h.mo17052f(!this.zodiac_.isEmpty(), this.zodiac_, !voicePayGuideUserInfo.zodiac_.isEmpty(), voicePayGuideUserInfo.zodiac_);
                    GeneratedMessageLite.C3408g c3408g = GeneratedMessageLite.C3408g.INSTANCE;
                    return this;
                case 6:
                    C3430e c3430e = (C3430e) obj;
                    while (!z) {
                        try {
                            int iM17171M = c3430e.m17171M();
                            if (iM17171M != 0) {
                                if (iM17171M == 10) {
                                    this.userId_ = c3430e.m17170L();
                                } else if (iM17171M == 18) {
                                    this.name_ = c3430e.m17170L();
                                } else if (iM17171M == 26) {
                                    this.avatar_ = c3430e.m17170L();
                                } else if (iM17171M == 34) {
                                    this.gender_ = c3430e.m17170L();
                                } else if (iM17171M == 40) {
                                    this.age_ = c3430e.m17196u();
                                } else if (iM17171M == 50) {
                                    this.zodiac_ = c3430e.m17170L();
                                } else if (!c3430e.m17176R(iM17171M)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            iig0.m140070a(e.setUnfinishedMessage(this));
                            return null;
                        } catch (IOException e2) {
                            iig0.m140070a(new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this));
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
                                    PARSER = new GeneratedMessageLite.C3404c(DEFAULT_INSTANCE);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return PARSER;
                default:
                    l710.m153113a();
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

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16956K = !this.userId_.isEmpty() ? CodedOutputStream.m16956K(1, getUserId()) : 0;
            if (!this.name_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(2, getName());
            }
            if (!this.avatar_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(3, getAvatar());
            }
            if (!this.gender_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(4, getGender());
            }
            int i2 = this.age_;
            if (i2 != 0) {
                iM16956K += CodedOutputStream.m16984t(5, i2);
            }
            if (!this.zodiac_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(6, getZodiac());
            }
            this.memoizedSerializedSize = iM16956K;
            return iM16956K;
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

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.userId_.isEmpty()) {
                codedOutputStream.mo16994D0(1, getUserId());
            }
            if (!this.name_.isEmpty()) {
                codedOutputStream.mo16994D0(2, getName());
            }
            if (!this.avatar_.isEmpty()) {
                codedOutputStream.mo16994D0(3, getAvatar());
            }
            if (!this.gender_.isEmpty()) {
                codedOutputStream.mo16994D0(4, getGender());
            }
            int i = this.age_;
            if (i != 0) {
                codedOutputStream.mo17025s0(5, i);
            }
            if (this.zodiac_.isEmpty()) {
                return;
            }
            codedOutputStream.mo16994D0(6, getZodiac());
        }

        public static VoicePayGuideUserInfo parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (VoicePayGuideUserInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static VoicePayGuideUserInfo parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (VoicePayGuideUserInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        public static VoicePayGuideUserInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoicePayGuideUserInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoicePayGuideUserInfo parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (VoicePayGuideUserInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static VoicePayGuideUserInfo parseFrom(InputStream inputStream) throws IOException {
            return (VoicePayGuideUserInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoicePayGuideUserInfo parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (VoicePayGuideUserInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static VoicePayGuideUserInfo parseFrom(C3430e c3430e) throws IOException {
            return (VoicePayGuideUserInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static VoicePayGuideUserInfo parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (VoicePayGuideUserInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }

    public static final class VoicePayGuideUserTag extends GeneratedMessageLite<VoicePayGuideUserTag, Builder> implements VoicePayGuideUserTagOrBuilder {
        public static final int COLOR_FIELD_NUMBER = 2;
        private static final VoicePayGuideUserTag DEFAULT_INSTANCE;
        private static volatile ng60<VoicePayGuideUserTag> PARSER = null;
        public static final int TEXT_FIELD_NUMBER = 1;
        public static final int TYPE_FIELD_NUMBER = 3;
        private String text_ = "";
        private String color_ = "";
        private String type_ = "";

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<VoicePayGuideUserTag, Builder> implements VoicePayGuideUserTagOrBuilder {
            private Builder() {
                super(VoicePayGuideUserTag.DEFAULT_INSTANCE);
            }

            public Builder clearColor() {
                copyOnWrite();
                ((VoicePayGuideUserTag) this.instance).clearColor();
                return this;
            }

            public Builder clearText() {
                copyOnWrite();
                ((VoicePayGuideUserTag) this.instance).clearText();
                return this;
            }

            public Builder clearType() {
                copyOnWrite();
                ((VoicePayGuideUserTag) this.instance).clearType();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideUserTagOrBuilder
            public String getColor() {
                return ((VoicePayGuideUserTag) this.instance).getColor();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideUserTagOrBuilder
            public ByteString getColorBytes() {
                return ((VoicePayGuideUserTag) this.instance).getColorBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideUserTagOrBuilder
            public String getText() {
                return ((VoicePayGuideUserTag) this.instance).getText();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideUserTagOrBuilder
            public ByteString getTextBytes() {
                return ((VoicePayGuideUserTag) this.instance).getTextBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideUserTagOrBuilder
            public String getType() {
                return ((VoicePayGuideUserTag) this.instance).getType();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideUserTagOrBuilder
            public ByteString getTypeBytes() {
                return ((VoicePayGuideUserTag) this.instance).getTypeBytes();
            }

            public Builder setColor(String str) {
                copyOnWrite();
                ((VoicePayGuideUserTag) this.instance).setColor(str);
                return this;
            }

            public Builder setColorBytes(ByteString byteString) {
                copyOnWrite();
                ((VoicePayGuideUserTag) this.instance).setColorBytes(byteString);
                return this;
            }

            public Builder setText(String str) {
                copyOnWrite();
                ((VoicePayGuideUserTag) this.instance).setText(str);
                return this;
            }

            public Builder setTextBytes(ByteString byteString) {
                copyOnWrite();
                ((VoicePayGuideUserTag) this.instance).setTextBytes(byteString);
                return this;
            }

            public Builder setType(String str) {
                copyOnWrite();
                ((VoicePayGuideUserTag) this.instance).setType(str);
                return this;
            }

            public Builder setTypeBytes(ByteString byteString) {
                copyOnWrite();
                ((VoicePayGuideUserTag) this.instance).setTypeBytes(byteString);
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
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(voicePayGuideUserTag);
        }

        public static VoicePayGuideUserTag parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VoicePayGuideUserTag) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoicePayGuideUserTag parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VoicePayGuideUserTag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<VoicePayGuideUserTag> parser() {
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.type_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C46611.f16699xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoicePayGuideUserTag();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    VoicePayGuideUserTag voicePayGuideUserTag = (VoicePayGuideUserTag) obj2;
                    this.text_ = interfaceC3409h.mo17052f(!this.text_.isEmpty(), this.text_, !voicePayGuideUserTag.text_.isEmpty(), voicePayGuideUserTag.text_);
                    this.color_ = interfaceC3409h.mo17052f(!this.color_.isEmpty(), this.color_, !voicePayGuideUserTag.color_.isEmpty(), voicePayGuideUserTag.color_);
                    this.type_ = interfaceC3409h.mo17052f(!this.type_.isEmpty(), this.type_, true ^ voicePayGuideUserTag.type_.isEmpty(), voicePayGuideUserTag.type_);
                    GeneratedMessageLite.C3408g c3408g = GeneratedMessageLite.C3408g.INSTANCE;
                    return this;
                case 6:
                    C3430e c3430e = (C3430e) obj;
                    boolean z = false;
                    while (!z) {
                        try {
                            int iM17171M = c3430e.m17171M();
                            if (iM17171M != 0) {
                                if (iM17171M == 10) {
                                    this.text_ = c3430e.m17170L();
                                } else if (iM17171M == 18) {
                                    this.color_ = c3430e.m17170L();
                                } else if (iM17171M == 26) {
                                    this.type_ = c3430e.m17170L();
                                } else if (!c3430e.m17176R(iM17171M)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            iig0.m140070a(e.setUnfinishedMessage(this));
                            return null;
                        } catch (IOException e2) {
                            iig0.m140070a(new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this));
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
                                    PARSER = new GeneratedMessageLite.C3404c(DEFAULT_INSTANCE);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return PARSER;
                default:
                    l710.m153113a();
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

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16956K = !this.text_.isEmpty() ? CodedOutputStream.m16956K(1, getText()) : 0;
            if (!this.color_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(2, getColor());
            }
            if (!this.type_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(3, getType());
            }
            this.memoizedSerializedSize = iM16956K;
            return iM16956K;
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

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.text_.isEmpty()) {
                codedOutputStream.mo16994D0(1, getText());
            }
            if (!this.color_.isEmpty()) {
                codedOutputStream.mo16994D0(2, getColor());
            }
            if (this.type_.isEmpty()) {
                return;
            }
            codedOutputStream.mo16994D0(3, getType());
        }

        public static VoicePayGuideUserTag parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (VoicePayGuideUserTag) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static VoicePayGuideUserTag parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (VoicePayGuideUserTag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        public static VoicePayGuideUserTag parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoicePayGuideUserTag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoicePayGuideUserTag parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (VoicePayGuideUserTag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static VoicePayGuideUserTag parseFrom(InputStream inputStream) throws IOException {
            return (VoicePayGuideUserTag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoicePayGuideUserTag parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (VoicePayGuideUserTag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static VoicePayGuideUserTag parseFrom(C3430e c3430e) throws IOException {
            return (VoicePayGuideUserTag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static VoicePayGuideUserTag parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (VoicePayGuideUserTag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
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
        private static volatile ng60<VoicePayGuideV2PopUp> PARSER = null;
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
                this.toUserInfo_ = VoicePayGuideUserInfo.newBuilder(this.toUserInfo_).mergeFrom(voicePayGuideUserInfo).buildPartial();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeUserTag(VoicePayGuideUserTag voicePayGuideUserTag) {
            VoicePayGuideUserTag voicePayGuideUserTag2 = this.userTag_;
            if (voicePayGuideUserTag2 == null || voicePayGuideUserTag2 == VoicePayGuideUserTag.getDefaultInstance()) {
                this.userTag_ = voicePayGuideUserTag;
            } else {
                this.userTag_ = VoicePayGuideUserTag.newBuilder(this.userTag_).mergeFrom(voicePayGuideUserTag).buildPartial();
            }
        }

        public static Builder newBuilder(VoicePayGuideV2PopUp voicePayGuideV2PopUp) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(voicePayGuideV2PopUp);
        }

        public static VoicePayGuideV2PopUp parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VoicePayGuideV2PopUp) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoicePayGuideV2PopUp parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VoicePayGuideV2PopUp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<VoicePayGuideV2PopUp> parser() {
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.title_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setToUserInfo(VoicePayGuideUserInfo.Builder builder) {
            this.toUserInfo_ = builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserId(String str) {
            str.getClass();
            this.userId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserIdBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.userId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserTag(VoicePayGuideUserTag.Builder builder) {
            this.userTag_ = builder.build();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C46611.f16699xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoicePayGuideV2PopUp();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    VoicePayGuideV2PopUp voicePayGuideV2PopUp = (VoicePayGuideV2PopUp) obj2;
                    this.userId_ = interfaceC3409h.mo17052f(!this.userId_.isEmpty(), this.userId_, !voicePayGuideV2PopUp.userId_.isEmpty(), voicePayGuideV2PopUp.userId_);
                    this.roomId_ = interfaceC3409h.mo17052f(!this.roomId_.isEmpty(), this.roomId_, !voicePayGuideV2PopUp.roomId_.isEmpty(), voicePayGuideV2PopUp.roomId_);
                    this.title_ = interfaceC3409h.mo17052f(!this.title_.isEmpty(), this.title_, !voicePayGuideV2PopUp.title_.isEmpty(), voicePayGuideV2PopUp.title_);
                    this.subTitle_ = interfaceC3409h.mo17052f(!this.subTitle_.isEmpty(), this.subTitle_, !voicePayGuideV2PopUp.subTitle_.isEmpty(), voicePayGuideV2PopUp.subTitle_);
                    this.bubbleTitle_ = interfaceC3409h.mo17052f(!this.bubbleTitle_.isEmpty(), this.bubbleTitle_, !voicePayGuideV2PopUp.bubbleTitle_.isEmpty(), voicePayGuideV2PopUp.bubbleTitle_);
                    this.buttonTitle_ = interfaceC3409h.mo17052f(!this.buttonTitle_.isEmpty(), this.buttonTitle_, !voicePayGuideV2PopUp.buttonTitle_.isEmpty(), voicePayGuideV2PopUp.buttonTitle_);
                    long j = this.giftId_;
                    boolean z2 = j != 0;
                    long j2 = voicePayGuideV2PopUp.giftId_;
                    this.giftId_ = interfaceC3409h.mo17055i(z2, j, j2 != 0, j2);
                    this.giftIcon_ = interfaceC3409h.mo17052f(!this.giftIcon_.isEmpty(), this.giftIcon_, !voicePayGuideV2PopUp.giftIcon_.isEmpty(), voicePayGuideV2PopUp.giftIcon_);
                    long j3 = this.giftCount_;
                    boolean z3 = j3 != 0;
                    long j4 = voicePayGuideV2PopUp.giftCount_;
                    this.giftCount_ = interfaceC3409h.mo17055i(z3, j3, j4 != 0, j4);
                    int i = this.guideType_;
                    boolean z4 = i != 0;
                    int i2 = voicePayGuideV2PopUp.guideType_;
                    this.guideType_ = interfaceC3409h.mo17051e(z4, i, i2 != 0, i2);
                    this.toUserInfo_ = (VoicePayGuideUserInfo) interfaceC3409h.mo17061o(this.toUserInfo_, voicePayGuideV2PopUp.toUserInfo_);
                    this.userTag_ = (VoicePayGuideUserTag) interfaceC3409h.mo17061o(this.userTag_, voicePayGuideV2PopUp.userTag_);
                    this.relationshipType_ = interfaceC3409h.mo17052f(!this.relationshipType_.isEmpty(), this.relationshipType_, !voicePayGuideV2PopUp.relationshipType_.isEmpty(), voicePayGuideV2PopUp.relationshipType_);
                    this.bizType_ = interfaceC3409h.mo17052f(!this.bizType_.isEmpty(), this.bizType_, !voicePayGuideV2PopUp.bizType_.isEmpty(), voicePayGuideV2PopUp.bizType_);
                    GeneratedMessageLite.C3408g c3408g = GeneratedMessageLite.C3408g.INSTANCE;
                    return this;
                case 6:
                    C3430e c3430e = (C3430e) obj;
                    C3433h c3433h = (C3433h) obj2;
                    while (!z) {
                        try {
                            int iM17171M = c3430e.m17171M();
                            switch (iM17171M) {
                                case 0:
                                    break;
                                case 10:
                                    this.userId_ = c3430e.m17170L();
                                    continue;
                                case 18:
                                    this.roomId_ = c3430e.m17170L();
                                    continue;
                                case 26:
                                    this.title_ = c3430e.m17170L();
                                    continue;
                                case 34:
                                    this.subTitle_ = c3430e.m17170L();
                                    continue;
                                case 42:
                                    this.bubbleTitle_ = c3430e.m17170L();
                                    continue;
                                case 50:
                                    this.buttonTitle_ = c3430e.m17170L();
                                    continue;
                                case 56:
                                    this.giftId_ = c3430e.m17197v();
                                    continue;
                                case 66:
                                    this.giftIcon_ = c3430e.m17170L();
                                    continue;
                                case 72:
                                    this.giftCount_ = c3430e.m17197v();
                                    continue;
                                case 80:
                                    this.guideType_ = c3430e.m17191p();
                                    continue;
                                case 90:
                                    VoicePayGuideUserInfo voicePayGuideUserInfo = this.toUserInfo_;
                                    VoicePayGuideUserInfo.Builder builder = voicePayGuideUserInfo != null ? voicePayGuideUserInfo.toBuilder() : null;
                                    VoicePayGuideUserInfo voicePayGuideUserInfo2 = (VoicePayGuideUserInfo) c3430e.m17198w(VoicePayGuideUserInfo.parser(), c3433h);
                                    this.toUserInfo_ = voicePayGuideUserInfo2;
                                    if (builder != null) {
                                        builder.mergeFrom(voicePayGuideUserInfo2);
                                        this.toUserInfo_ = builder.buildPartial();
                                    } else {
                                        continue;
                                    }
                                    break;
                                case EACTags.FCP_TEMPLATE /* 98 */:
                                    VoicePayGuideUserTag voicePayGuideUserTag = this.userTag_;
                                    VoicePayGuideUserTag.Builder builder2 = voicePayGuideUserTag != null ? voicePayGuideUserTag.toBuilder() : null;
                                    VoicePayGuideUserTag voicePayGuideUserTag2 = (VoicePayGuideUserTag) c3430e.m17198w(VoicePayGuideUserTag.parser(), c3433h);
                                    this.userTag_ = voicePayGuideUserTag2;
                                    if (builder2 != null) {
                                        builder2.mergeFrom(voicePayGuideUserTag2);
                                        this.userTag_ = builder2.buildPartial();
                                    } else {
                                        continue;
                                    }
                                    break;
                                case 106:
                                    this.relationshipType_ = c3430e.m17170L();
                                    continue;
                                case 114:
                                    this.bizType_ = c3430e.m17170L();
                                    continue;
                                default:
                                    if (!c3430e.m17176R(iM17171M)) {
                                        break;
                                    }
                                    break;
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            iig0.m140070a(e.setUnfinishedMessage(this));
                            return null;
                        } catch (IOException e2) {
                            iig0.m140070a(new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this));
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
                                    PARSER = new GeneratedMessageLite.C3404c(DEFAULT_INSTANCE);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return PARSER;
                default:
                    l710.m153113a();
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

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16956K = !this.userId_.isEmpty() ? CodedOutputStream.m16956K(1, getUserId()) : 0;
            if (!this.roomId_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(2, getRoomId());
            }
            if (!this.title_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(3, getTitle());
            }
            if (!this.subTitle_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(4, getSubTitle());
            }
            if (!this.bubbleTitle_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(5, getBubbleTitle());
            }
            if (!this.buttonTitle_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(6, getButtonTitle());
            }
            long j = this.giftId_;
            if (j != 0) {
                iM16956K += CodedOutputStream.m16986v(7, j);
            }
            if (!this.giftIcon_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(8, getGiftIcon());
            }
            long j2 = this.giftCount_;
            if (j2 != 0) {
                iM16956K += CodedOutputStream.m16986v(9, j2);
            }
            if (this.guideType_ != GuideType.empty.getNumber()) {
                iM16956K += CodedOutputStream.m16977m(10, this.guideType_);
            }
            if (this.toUserInfo_ != null) {
                iM16956K += CodedOutputStream.m16948C(11, getToUserInfo());
            }
            if (this.userTag_ != null) {
                iM16956K += CodedOutputStream.m16948C(12, getUserTag());
            }
            if (!this.relationshipType_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(13, getRelationshipType());
            }
            if (!this.bizType_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(14, getBizType());
            }
            this.memoizedSerializedSize = iM16956K;
            return iM16956K;
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

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.userId_.isEmpty()) {
                codedOutputStream.mo16994D0(1, getUserId());
            }
            if (!this.roomId_.isEmpty()) {
                codedOutputStream.mo16994D0(2, getRoomId());
            }
            if (!this.title_.isEmpty()) {
                codedOutputStream.mo16994D0(3, getTitle());
            }
            if (!this.subTitle_.isEmpty()) {
                codedOutputStream.mo16994D0(4, getSubTitle());
            }
            if (!this.bubbleTitle_.isEmpty()) {
                codedOutputStream.mo16994D0(5, getBubbleTitle());
            }
            if (!this.buttonTitle_.isEmpty()) {
                codedOutputStream.mo16994D0(6, getButtonTitle());
            }
            long j = this.giftId_;
            if (j != 0) {
                codedOutputStream.m17027u0(7, j);
            }
            if (!this.giftIcon_.isEmpty()) {
                codedOutputStream.mo16994D0(8, getGiftIcon());
            }
            long j2 = this.giftCount_;
            if (j2 != 0) {
                codedOutputStream.m17027u0(9, j2);
            }
            if (this.guideType_ != GuideType.empty.getNumber()) {
                codedOutputStream.m17015i0(10, this.guideType_);
            }
            if (this.toUserInfo_ != null) {
                codedOutputStream.mo17029w0(11, getToUserInfo());
            }
            if (this.userTag_ != null) {
                codedOutputStream.mo17029w0(12, getUserTag());
            }
            if (!this.relationshipType_.isEmpty()) {
                codedOutputStream.mo16994D0(13, getRelationshipType());
            }
            if (this.bizType_.isEmpty()) {
                return;
            }
            codedOutputStream.mo16994D0(14, getBizType());
        }

        public static VoicePayGuideV2PopUp parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (VoicePayGuideV2PopUp) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static VoicePayGuideV2PopUp parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (VoicePayGuideV2PopUp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
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

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<VoicePayGuideV2PopUp, Builder> implements VoicePayGuideV2PopUpOrBuilder {
            private Builder() {
                super(VoicePayGuideV2PopUp.DEFAULT_INSTANCE);
            }

            public Builder clearBizType() {
                copyOnWrite();
                ((VoicePayGuideV2PopUp) this.instance).clearBizType();
                return this;
            }

            public Builder clearBubbleTitle() {
                copyOnWrite();
                ((VoicePayGuideV2PopUp) this.instance).clearBubbleTitle();
                return this;
            }

            public Builder clearButtonTitle() {
                copyOnWrite();
                ((VoicePayGuideV2PopUp) this.instance).clearButtonTitle();
                return this;
            }

            public Builder clearGiftCount() {
                copyOnWrite();
                ((VoicePayGuideV2PopUp) this.instance).clearGiftCount();
                return this;
            }

            public Builder clearGiftIcon() {
                copyOnWrite();
                ((VoicePayGuideV2PopUp) this.instance).clearGiftIcon();
                return this;
            }

            public Builder clearGiftId() {
                copyOnWrite();
                ((VoicePayGuideV2PopUp) this.instance).clearGiftId();
                return this;
            }

            public Builder clearGuideType() {
                copyOnWrite();
                ((VoicePayGuideV2PopUp) this.instance).clearGuideType();
                return this;
            }

            public Builder clearRelationshipType() {
                copyOnWrite();
                ((VoicePayGuideV2PopUp) this.instance).clearRelationshipType();
                return this;
            }

            public Builder clearRoomId() {
                copyOnWrite();
                ((VoicePayGuideV2PopUp) this.instance).clearRoomId();
                return this;
            }

            public Builder clearSubTitle() {
                copyOnWrite();
                ((VoicePayGuideV2PopUp) this.instance).clearSubTitle();
                return this;
            }

            public Builder clearTitle() {
                copyOnWrite();
                ((VoicePayGuideV2PopUp) this.instance).clearTitle();
                return this;
            }

            public Builder clearToUserInfo() {
                copyOnWrite();
                ((VoicePayGuideV2PopUp) this.instance).clearToUserInfo();
                return this;
            }

            public Builder clearUserId() {
                copyOnWrite();
                ((VoicePayGuideV2PopUp) this.instance).clearUserId();
                return this;
            }

            public Builder clearUserTag() {
                copyOnWrite();
                ((VoicePayGuideV2PopUp) this.instance).clearUserTag();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideV2PopUpOrBuilder
            public String getBizType() {
                return ((VoicePayGuideV2PopUp) this.instance).getBizType();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideV2PopUpOrBuilder
            public ByteString getBizTypeBytes() {
                return ((VoicePayGuideV2PopUp) this.instance).getBizTypeBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideV2PopUpOrBuilder
            public String getBubbleTitle() {
                return ((VoicePayGuideV2PopUp) this.instance).getBubbleTitle();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideV2PopUpOrBuilder
            public ByteString getBubbleTitleBytes() {
                return ((VoicePayGuideV2PopUp) this.instance).getBubbleTitleBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideV2PopUpOrBuilder
            public String getButtonTitle() {
                return ((VoicePayGuideV2PopUp) this.instance).getButtonTitle();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideV2PopUpOrBuilder
            public ByteString getButtonTitleBytes() {
                return ((VoicePayGuideV2PopUp) this.instance).getButtonTitleBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideV2PopUpOrBuilder
            public long getGiftCount() {
                return ((VoicePayGuideV2PopUp) this.instance).getGiftCount();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideV2PopUpOrBuilder
            public String getGiftIcon() {
                return ((VoicePayGuideV2PopUp) this.instance).getGiftIcon();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideV2PopUpOrBuilder
            public ByteString getGiftIconBytes() {
                return ((VoicePayGuideV2PopUp) this.instance).getGiftIconBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideV2PopUpOrBuilder
            public long getGiftId() {
                return ((VoicePayGuideV2PopUp) this.instance).getGiftId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideV2PopUpOrBuilder
            public GuideType getGuideType() {
                return ((VoicePayGuideV2PopUp) this.instance).getGuideType();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideV2PopUpOrBuilder
            public int getGuideTypeValue() {
                return ((VoicePayGuideV2PopUp) this.instance).getGuideTypeValue();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideV2PopUpOrBuilder
            public String getRelationshipType() {
                return ((VoicePayGuideV2PopUp) this.instance).getRelationshipType();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideV2PopUpOrBuilder
            public ByteString getRelationshipTypeBytes() {
                return ((VoicePayGuideV2PopUp) this.instance).getRelationshipTypeBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideV2PopUpOrBuilder
            public String getRoomId() {
                return ((VoicePayGuideV2PopUp) this.instance).getRoomId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideV2PopUpOrBuilder
            public ByteString getRoomIdBytes() {
                return ((VoicePayGuideV2PopUp) this.instance).getRoomIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideV2PopUpOrBuilder
            public String getSubTitle() {
                return ((VoicePayGuideV2PopUp) this.instance).getSubTitle();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideV2PopUpOrBuilder
            public ByteString getSubTitleBytes() {
                return ((VoicePayGuideV2PopUp) this.instance).getSubTitleBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideV2PopUpOrBuilder
            public String getTitle() {
                return ((VoicePayGuideV2PopUp) this.instance).getTitle();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideV2PopUpOrBuilder
            public ByteString getTitleBytes() {
                return ((VoicePayGuideV2PopUp) this.instance).getTitleBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideV2PopUpOrBuilder
            public VoicePayGuideUserInfo getToUserInfo() {
                return ((VoicePayGuideV2PopUp) this.instance).getToUserInfo();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideV2PopUpOrBuilder
            public String getUserId() {
                return ((VoicePayGuideV2PopUp) this.instance).getUserId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideV2PopUpOrBuilder
            public ByteString getUserIdBytes() {
                return ((VoicePayGuideV2PopUp) this.instance).getUserIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideV2PopUpOrBuilder
            public VoicePayGuideUserTag getUserTag() {
                return ((VoicePayGuideV2PopUp) this.instance).getUserTag();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideV2PopUpOrBuilder
            public boolean hasToUserInfo() {
                return ((VoicePayGuideV2PopUp) this.instance).hasToUserInfo();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoicePayGuideV2PopUpOrBuilder
            public boolean hasUserTag() {
                return ((VoicePayGuideV2PopUp) this.instance).hasUserTag();
            }

            public Builder mergeToUserInfo(VoicePayGuideUserInfo voicePayGuideUserInfo) {
                copyOnWrite();
                ((VoicePayGuideV2PopUp) this.instance).mergeToUserInfo(voicePayGuideUserInfo);
                return this;
            }

            public Builder mergeUserTag(VoicePayGuideUserTag voicePayGuideUserTag) {
                copyOnWrite();
                ((VoicePayGuideV2PopUp) this.instance).mergeUserTag(voicePayGuideUserTag);
                return this;
            }

            public Builder setBizType(String str) {
                copyOnWrite();
                ((VoicePayGuideV2PopUp) this.instance).setBizType(str);
                return this;
            }

            public Builder setBizTypeBytes(ByteString byteString) {
                copyOnWrite();
                ((VoicePayGuideV2PopUp) this.instance).setBizTypeBytes(byteString);
                return this;
            }

            public Builder setBubbleTitle(String str) {
                copyOnWrite();
                ((VoicePayGuideV2PopUp) this.instance).setBubbleTitle(str);
                return this;
            }

            public Builder setBubbleTitleBytes(ByteString byteString) {
                copyOnWrite();
                ((VoicePayGuideV2PopUp) this.instance).setBubbleTitleBytes(byteString);
                return this;
            }

            public Builder setButtonTitle(String str) {
                copyOnWrite();
                ((VoicePayGuideV2PopUp) this.instance).setButtonTitle(str);
                return this;
            }

            public Builder setButtonTitleBytes(ByteString byteString) {
                copyOnWrite();
                ((VoicePayGuideV2PopUp) this.instance).setButtonTitleBytes(byteString);
                return this;
            }

            public Builder setGiftCount(long j) {
                copyOnWrite();
                ((VoicePayGuideV2PopUp) this.instance).setGiftCount(j);
                return this;
            }

            public Builder setGiftIcon(String str) {
                copyOnWrite();
                ((VoicePayGuideV2PopUp) this.instance).setGiftIcon(str);
                return this;
            }

            public Builder setGiftIconBytes(ByteString byteString) {
                copyOnWrite();
                ((VoicePayGuideV2PopUp) this.instance).setGiftIconBytes(byteString);
                return this;
            }

            public Builder setGiftId(long j) {
                copyOnWrite();
                ((VoicePayGuideV2PopUp) this.instance).setGiftId(j);
                return this;
            }

            public Builder setGuideType(GuideType guideType) {
                copyOnWrite();
                ((VoicePayGuideV2PopUp) this.instance).setGuideType(guideType);
                return this;
            }

            public Builder setGuideTypeValue(int i) {
                copyOnWrite();
                ((VoicePayGuideV2PopUp) this.instance).setGuideTypeValue(i);
                return this;
            }

            public Builder setRelationshipType(String str) {
                copyOnWrite();
                ((VoicePayGuideV2PopUp) this.instance).setRelationshipType(str);
                return this;
            }

            public Builder setRelationshipTypeBytes(ByteString byteString) {
                copyOnWrite();
                ((VoicePayGuideV2PopUp) this.instance).setRelationshipTypeBytes(byteString);
                return this;
            }

            public Builder setRoomId(String str) {
                copyOnWrite();
                ((VoicePayGuideV2PopUp) this.instance).setRoomId(str);
                return this;
            }

            public Builder setRoomIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoicePayGuideV2PopUp) this.instance).setRoomIdBytes(byteString);
                return this;
            }

            public Builder setSubTitle(String str) {
                copyOnWrite();
                ((VoicePayGuideV2PopUp) this.instance).setSubTitle(str);
                return this;
            }

            public Builder setSubTitleBytes(ByteString byteString) {
                copyOnWrite();
                ((VoicePayGuideV2PopUp) this.instance).setSubTitleBytes(byteString);
                return this;
            }

            public Builder setTitle(String str) {
                copyOnWrite();
                ((VoicePayGuideV2PopUp) this.instance).setTitle(str);
                return this;
            }

            public Builder setTitleBytes(ByteString byteString) {
                copyOnWrite();
                ((VoicePayGuideV2PopUp) this.instance).setTitleBytes(byteString);
                return this;
            }

            public Builder setToUserInfo(VoicePayGuideUserInfo voicePayGuideUserInfo) {
                copyOnWrite();
                ((VoicePayGuideV2PopUp) this.instance).setToUserInfo(voicePayGuideUserInfo);
                return this;
            }

            public Builder setUserId(String str) {
                copyOnWrite();
                ((VoicePayGuideV2PopUp) this.instance).setUserId(str);
                return this;
            }

            public Builder setUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoicePayGuideV2PopUp) this.instance).setUserIdBytes(byteString);
                return this;
            }

            public Builder setUserTag(VoicePayGuideUserTag voicePayGuideUserTag) {
                copyOnWrite();
                ((VoicePayGuideV2PopUp) this.instance).setUserTag(voicePayGuideUserTag);
                return this;
            }

            public Builder setToUserInfo(VoicePayGuideUserInfo.Builder builder) {
                copyOnWrite();
                ((VoicePayGuideV2PopUp) this.instance).setToUserInfo(builder);
                return this;
            }

            public Builder setUserTag(VoicePayGuideUserTag.Builder builder) {
                copyOnWrite();
                ((VoicePayGuideV2PopUp) this.instance).setUserTag(builder);
                return this;
            }
        }

        public static VoicePayGuideV2PopUp parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoicePayGuideV2PopUp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoicePayGuideV2PopUp parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (VoicePayGuideV2PopUp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static VoicePayGuideV2PopUp parseFrom(InputStream inputStream) throws IOException {
            return (VoicePayGuideV2PopUp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoicePayGuideV2PopUp parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (VoicePayGuideV2PopUp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static VoicePayGuideV2PopUp parseFrom(C3430e c3430e) throws IOException {
            return (VoicePayGuideV2PopUp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static VoicePayGuideV2PopUp parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (VoicePayGuideV2PopUp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }

    public static final class VoiceRoomCover extends GeneratedMessageLite<VoiceRoomCover, Builder> implements VoiceRoomCoverOrBuilder {
        public static final int COVERURL_FIELD_NUMBER = 2;
        private static final VoiceRoomCover DEFAULT_INSTANCE;
        private static volatile ng60<VoiceRoomCover> PARSER = null;
        public static final int ROOMID_FIELD_NUMBER = 1;
        private String roomId_ = "";
        private String coverUrl_ = "";

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<VoiceRoomCover, Builder> implements VoiceRoomCoverOrBuilder {
            private Builder() {
                super(VoiceRoomCover.DEFAULT_INSTANCE);
            }

            public Builder clearCoverUrl() {
                copyOnWrite();
                ((VoiceRoomCover) this.instance).clearCoverUrl();
                return this;
            }

            public Builder clearRoomId() {
                copyOnWrite();
                ((VoiceRoomCover) this.instance).clearRoomId();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceRoomCoverOrBuilder
            public String getCoverUrl() {
                return ((VoiceRoomCover) this.instance).getCoverUrl();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceRoomCoverOrBuilder
            public ByteString getCoverUrlBytes() {
                return ((VoiceRoomCover) this.instance).getCoverUrlBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceRoomCoverOrBuilder
            public String getRoomId() {
                return ((VoiceRoomCover) this.instance).getRoomId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceRoomCoverOrBuilder
            public ByteString getRoomIdBytes() {
                return ((VoiceRoomCover) this.instance).getRoomIdBytes();
            }

            public Builder setCoverUrl(String str) {
                copyOnWrite();
                ((VoiceRoomCover) this.instance).setCoverUrl(str);
                return this;
            }

            public Builder setCoverUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceRoomCover) this.instance).setCoverUrlBytes(byteString);
                return this;
            }

            public Builder setRoomId(String str) {
                copyOnWrite();
                ((VoiceRoomCover) this.instance).setRoomId(str);
                return this;
            }

            public Builder setRoomIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceRoomCover) this.instance).setRoomIdBytes(byteString);
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
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(voiceRoomCover);
        }

        public static VoiceRoomCover parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VoiceRoomCover) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceRoomCover parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VoiceRoomCover) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<VoiceRoomCover> parser() {
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.roomId_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C46611.f16699xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoiceRoomCover();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    VoiceRoomCover voiceRoomCover = (VoiceRoomCover) obj2;
                    this.roomId_ = interfaceC3409h.mo17052f(!this.roomId_.isEmpty(), this.roomId_, !voiceRoomCover.roomId_.isEmpty(), voiceRoomCover.roomId_);
                    this.coverUrl_ = interfaceC3409h.mo17052f(!this.coverUrl_.isEmpty(), this.coverUrl_, true ^ voiceRoomCover.coverUrl_.isEmpty(), voiceRoomCover.coverUrl_);
                    GeneratedMessageLite.C3408g c3408g = GeneratedMessageLite.C3408g.INSTANCE;
                    return this;
                case 6:
                    C3430e c3430e = (C3430e) obj;
                    boolean z = false;
                    while (!z) {
                        try {
                            int iM17171M = c3430e.m17171M();
                            if (iM17171M != 0) {
                                if (iM17171M == 10) {
                                    this.roomId_ = c3430e.m17170L();
                                } else if (iM17171M == 18) {
                                    this.coverUrl_ = c3430e.m17170L();
                                } else if (!c3430e.m17176R(iM17171M)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            iig0.m140070a(e.setUnfinishedMessage(this));
                            return null;
                        } catch (IOException e2) {
                            iig0.m140070a(new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this));
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
                                    PARSER = new GeneratedMessageLite.C3404c(DEFAULT_INSTANCE);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return PARSER;
                default:
                    l710.m153113a();
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

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16956K = !this.roomId_.isEmpty() ? CodedOutputStream.m16956K(1, getRoomId()) : 0;
            if (!this.coverUrl_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(2, getCoverUrl());
            }
            this.memoizedSerializedSize = iM16956K;
            return iM16956K;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.roomId_.isEmpty()) {
                codedOutputStream.mo16994D0(1, getRoomId());
            }
            if (this.coverUrl_.isEmpty()) {
                return;
            }
            codedOutputStream.mo16994D0(2, getCoverUrl());
        }

        public static VoiceRoomCover parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (VoiceRoomCover) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static VoiceRoomCover parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (VoiceRoomCover) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        public static VoiceRoomCover parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoiceRoomCover) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoiceRoomCover parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (VoiceRoomCover) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static VoiceRoomCover parseFrom(InputStream inputStream) throws IOException {
            return (VoiceRoomCover) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceRoomCover parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (VoiceRoomCover) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static VoiceRoomCover parseFrom(C3430e c3430e) throws IOException {
            return (VoiceRoomCover) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static VoiceRoomCover parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (VoiceRoomCover) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }

    public static final class VoiceRoomDissolve extends GeneratedMessageLite<VoiceRoomDissolve, Builder> implements VoiceRoomDissolveOrBuilder {
        private static final VoiceRoomDissolve DEFAULT_INSTANCE;
        private static volatile ng60<VoiceRoomDissolve> PARSER = null;
        public static final int ROOMID_FIELD_NUMBER = 2;
        public static final int USERID_FIELD_NUMBER = 1;
        private String userId_ = "";
        private String roomId_ = "";

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<VoiceRoomDissolve, Builder> implements VoiceRoomDissolveOrBuilder {
            private Builder() {
                super(VoiceRoomDissolve.DEFAULT_INSTANCE);
            }

            public Builder clearRoomId() {
                copyOnWrite();
                ((VoiceRoomDissolve) this.instance).clearRoomId();
                return this;
            }

            public Builder clearUserId() {
                copyOnWrite();
                ((VoiceRoomDissolve) this.instance).clearUserId();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceRoomDissolveOrBuilder
            public String getRoomId() {
                return ((VoiceRoomDissolve) this.instance).getRoomId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceRoomDissolveOrBuilder
            public ByteString getRoomIdBytes() {
                return ((VoiceRoomDissolve) this.instance).getRoomIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceRoomDissolveOrBuilder
            public String getUserId() {
                return ((VoiceRoomDissolve) this.instance).getUserId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceRoomDissolveOrBuilder
            public ByteString getUserIdBytes() {
                return ((VoiceRoomDissolve) this.instance).getUserIdBytes();
            }

            public Builder setRoomId(String str) {
                copyOnWrite();
                ((VoiceRoomDissolve) this.instance).setRoomId(str);
                return this;
            }

            public Builder setRoomIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceRoomDissolve) this.instance).setRoomIdBytes(byteString);
                return this;
            }

            public Builder setUserId(String str) {
                copyOnWrite();
                ((VoiceRoomDissolve) this.instance).setUserId(str);
                return this;
            }

            public Builder setUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceRoomDissolve) this.instance).setUserIdBytes(byteString);
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
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(voiceRoomDissolve);
        }

        public static VoiceRoomDissolve parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VoiceRoomDissolve) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceRoomDissolve parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VoiceRoomDissolve) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<VoiceRoomDissolve> parser() {
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.userId_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C46611.f16699xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoiceRoomDissolve();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    VoiceRoomDissolve voiceRoomDissolve = (VoiceRoomDissolve) obj2;
                    this.userId_ = interfaceC3409h.mo17052f(!this.userId_.isEmpty(), this.userId_, !voiceRoomDissolve.userId_.isEmpty(), voiceRoomDissolve.userId_);
                    this.roomId_ = interfaceC3409h.mo17052f(!this.roomId_.isEmpty(), this.roomId_, true ^ voiceRoomDissolve.roomId_.isEmpty(), voiceRoomDissolve.roomId_);
                    GeneratedMessageLite.C3408g c3408g = GeneratedMessageLite.C3408g.INSTANCE;
                    return this;
                case 6:
                    C3430e c3430e = (C3430e) obj;
                    boolean z = false;
                    while (!z) {
                        try {
                            int iM17171M = c3430e.m17171M();
                            if (iM17171M != 0) {
                                if (iM17171M == 10) {
                                    this.userId_ = c3430e.m17170L();
                                } else if (iM17171M == 18) {
                                    this.roomId_ = c3430e.m17170L();
                                } else if (!c3430e.m17176R(iM17171M)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            iig0.m140070a(e.setUnfinishedMessage(this));
                            return null;
                        } catch (IOException e2) {
                            iig0.m140070a(new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this));
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
                                    PARSER = new GeneratedMessageLite.C3404c(DEFAULT_INSTANCE);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return PARSER;
                default:
                    l710.m153113a();
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

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16956K = !this.userId_.isEmpty() ? CodedOutputStream.m16956K(1, getUserId()) : 0;
            if (!this.roomId_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(2, getRoomId());
            }
            this.memoizedSerializedSize = iM16956K;
            return iM16956K;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceRoomDissolveOrBuilder
        public String getUserId() {
            return this.userId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceRoomDissolveOrBuilder
        public ByteString getUserIdBytes() {
            return ByteString.copyFromUtf8(this.userId_);
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.userId_.isEmpty()) {
                codedOutputStream.mo16994D0(1, getUserId());
            }
            if (this.roomId_.isEmpty()) {
                return;
            }
            codedOutputStream.mo16994D0(2, getRoomId());
        }

        public static VoiceRoomDissolve parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (VoiceRoomDissolve) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static VoiceRoomDissolve parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (VoiceRoomDissolve) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        public static VoiceRoomDissolve parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoiceRoomDissolve) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoiceRoomDissolve parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (VoiceRoomDissolve) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static VoiceRoomDissolve parseFrom(InputStream inputStream) throws IOException {
            return (VoiceRoomDissolve) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceRoomDissolve parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (VoiceRoomDissolve) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static VoiceRoomDissolve parseFrom(C3430e c3430e) throws IOException {
            return (VoiceRoomDissolve) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static VoiceRoomDissolve parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (VoiceRoomDissolve) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }

    public static final class VoiceRoomHeatUpdate extends GeneratedMessageLite<VoiceRoomHeatUpdate, Builder> implements VoiceRoomHeatUpdateOrBuilder {
        private static final VoiceRoomHeatUpdate DEFAULT_INSTANCE;
        public static final int HEATICON_FIELD_NUMBER = 4;
        public static final int HEATSVGA_FIELD_NUMBER = 5;
        public static final int HEAT_FIELD_NUMBER = 2;
        private static volatile ng60<VoiceRoomHeatUpdate> PARSER = null;
        public static final int ROOMID_FIELD_NUMBER = 1;
        public static final int UPDATEDTIME_FIELD_NUMBER = 3;
        private long heat_;
        private long updatedTime_;
        private String roomId_ = "";
        private String heatIcon_ = "";
        private String heatSvga_ = "";

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<VoiceRoomHeatUpdate, Builder> implements VoiceRoomHeatUpdateOrBuilder {
            private Builder() {
                super(VoiceRoomHeatUpdate.DEFAULT_INSTANCE);
            }

            public Builder clearHeat() {
                copyOnWrite();
                ((VoiceRoomHeatUpdate) this.instance).clearHeat();
                return this;
            }

            public Builder clearHeatIcon() {
                copyOnWrite();
                ((VoiceRoomHeatUpdate) this.instance).clearHeatIcon();
                return this;
            }

            public Builder clearHeatSvga() {
                copyOnWrite();
                ((VoiceRoomHeatUpdate) this.instance).clearHeatSvga();
                return this;
            }

            public Builder clearRoomId() {
                copyOnWrite();
                ((VoiceRoomHeatUpdate) this.instance).clearRoomId();
                return this;
            }

            public Builder clearUpdatedTime() {
                copyOnWrite();
                ((VoiceRoomHeatUpdate) this.instance).clearUpdatedTime();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceRoomHeatUpdateOrBuilder
            public long getHeat() {
                return ((VoiceRoomHeatUpdate) this.instance).getHeat();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceRoomHeatUpdateOrBuilder
            public String getHeatIcon() {
                return ((VoiceRoomHeatUpdate) this.instance).getHeatIcon();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceRoomHeatUpdateOrBuilder
            public ByteString getHeatIconBytes() {
                return ((VoiceRoomHeatUpdate) this.instance).getHeatIconBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceRoomHeatUpdateOrBuilder
            public String getHeatSvga() {
                return ((VoiceRoomHeatUpdate) this.instance).getHeatSvga();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceRoomHeatUpdateOrBuilder
            public ByteString getHeatSvgaBytes() {
                return ((VoiceRoomHeatUpdate) this.instance).getHeatSvgaBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceRoomHeatUpdateOrBuilder
            public String getRoomId() {
                return ((VoiceRoomHeatUpdate) this.instance).getRoomId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceRoomHeatUpdateOrBuilder
            public ByteString getRoomIdBytes() {
                return ((VoiceRoomHeatUpdate) this.instance).getRoomIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceRoomHeatUpdateOrBuilder
            public long getUpdatedTime() {
                return ((VoiceRoomHeatUpdate) this.instance).getUpdatedTime();
            }

            public Builder setHeat(long j) {
                copyOnWrite();
                ((VoiceRoomHeatUpdate) this.instance).setHeat(j);
                return this;
            }

            public Builder setHeatIcon(String str) {
                copyOnWrite();
                ((VoiceRoomHeatUpdate) this.instance).setHeatIcon(str);
                return this;
            }

            public Builder setHeatIconBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceRoomHeatUpdate) this.instance).setHeatIconBytes(byteString);
                return this;
            }

            public Builder setHeatSvga(String str) {
                copyOnWrite();
                ((VoiceRoomHeatUpdate) this.instance).setHeatSvga(str);
                return this;
            }

            public Builder setHeatSvgaBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceRoomHeatUpdate) this.instance).setHeatSvgaBytes(byteString);
                return this;
            }

            public Builder setRoomId(String str) {
                copyOnWrite();
                ((VoiceRoomHeatUpdate) this.instance).setRoomId(str);
                return this;
            }

            public Builder setRoomIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceRoomHeatUpdate) this.instance).setRoomIdBytes(byteString);
                return this;
            }

            public Builder setUpdatedTime(long j) {
                copyOnWrite();
                ((VoiceRoomHeatUpdate) this.instance).setUpdatedTime(j);
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
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(voiceRoomHeatUpdate);
        }

        public static VoiceRoomHeatUpdate parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VoiceRoomHeatUpdate) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceRoomHeatUpdate parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VoiceRoomHeatUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<VoiceRoomHeatUpdate> parser() {
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.roomId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUpdatedTime(long j) {
            this.updatedTime_ = j;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C46611.f16699xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoiceRoomHeatUpdate();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    VoiceRoomHeatUpdate voiceRoomHeatUpdate = (VoiceRoomHeatUpdate) obj2;
                    this.roomId_ = interfaceC3409h.mo17052f(!this.roomId_.isEmpty(), this.roomId_, !voiceRoomHeatUpdate.roomId_.isEmpty(), voiceRoomHeatUpdate.roomId_);
                    long j = this.heat_;
                    boolean z2 = j != 0;
                    long j2 = voiceRoomHeatUpdate.heat_;
                    this.heat_ = interfaceC3409h.mo17055i(z2, j, j2 != 0, j2);
                    long j3 = this.updatedTime_;
                    boolean z3 = j3 != 0;
                    long j4 = voiceRoomHeatUpdate.updatedTime_;
                    this.updatedTime_ = interfaceC3409h.mo17055i(z3, j3, j4 != 0, j4);
                    this.heatIcon_ = interfaceC3409h.mo17052f(!this.heatIcon_.isEmpty(), this.heatIcon_, !voiceRoomHeatUpdate.heatIcon_.isEmpty(), voiceRoomHeatUpdate.heatIcon_);
                    this.heatSvga_ = interfaceC3409h.mo17052f(!this.heatSvga_.isEmpty(), this.heatSvga_, !voiceRoomHeatUpdate.heatSvga_.isEmpty(), voiceRoomHeatUpdate.heatSvga_);
                    GeneratedMessageLite.C3408g c3408g = GeneratedMessageLite.C3408g.INSTANCE;
                    return this;
                case 6:
                    C3430e c3430e = (C3430e) obj;
                    while (!z) {
                        try {
                            int iM17171M = c3430e.m17171M();
                            if (iM17171M != 0) {
                                if (iM17171M == 10) {
                                    this.roomId_ = c3430e.m17170L();
                                } else if (iM17171M == 16) {
                                    this.heat_ = c3430e.m17197v();
                                } else if (iM17171M == 24) {
                                    this.updatedTime_ = c3430e.m17197v();
                                } else if (iM17171M == 34) {
                                    this.heatIcon_ = c3430e.m17170L();
                                } else if (iM17171M == 42) {
                                    this.heatSvga_ = c3430e.m17170L();
                                } else if (!c3430e.m17176R(iM17171M)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            iig0.m140070a(e.setUnfinishedMessage(this));
                            return null;
                        } catch (IOException e2) {
                            iig0.m140070a(new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this));
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
                                    PARSER = new GeneratedMessageLite.C3404c(DEFAULT_INSTANCE);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return PARSER;
                default:
                    l710.m153113a();
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

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16956K = !this.roomId_.isEmpty() ? CodedOutputStream.m16956K(1, getRoomId()) : 0;
            long j = this.heat_;
            if (j != 0) {
                iM16956K += CodedOutputStream.m16986v(2, j);
            }
            long j2 = this.updatedTime_;
            if (j2 != 0) {
                iM16956K += CodedOutputStream.m16986v(3, j2);
            }
            if (!this.heatIcon_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(4, getHeatIcon());
            }
            if (!this.heatSvga_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(5, getHeatSvga());
            }
            this.memoizedSerializedSize = iM16956K;
            return iM16956K;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceRoomHeatUpdateOrBuilder
        public long getUpdatedTime() {
            return this.updatedTime_;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.roomId_.isEmpty()) {
                codedOutputStream.mo16994D0(1, getRoomId());
            }
            long j = this.heat_;
            if (j != 0) {
                codedOutputStream.m17027u0(2, j);
            }
            long j2 = this.updatedTime_;
            if (j2 != 0) {
                codedOutputStream.m17027u0(3, j2);
            }
            if (!this.heatIcon_.isEmpty()) {
                codedOutputStream.mo16994D0(4, getHeatIcon());
            }
            if (this.heatSvga_.isEmpty()) {
                return;
            }
            codedOutputStream.mo16994D0(5, getHeatSvga());
        }

        public static VoiceRoomHeatUpdate parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (VoiceRoomHeatUpdate) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static VoiceRoomHeatUpdate parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (VoiceRoomHeatUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        public static VoiceRoomHeatUpdate parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoiceRoomHeatUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoiceRoomHeatUpdate parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (VoiceRoomHeatUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static VoiceRoomHeatUpdate parseFrom(InputStream inputStream) throws IOException {
            return (VoiceRoomHeatUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceRoomHeatUpdate parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (VoiceRoomHeatUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static VoiceRoomHeatUpdate parseFrom(C3430e c3430e) throws IOException {
            return (VoiceRoomHeatUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static VoiceRoomHeatUpdate parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (VoiceRoomHeatUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }

    public static final class VoiceRoomLevelUp extends GeneratedMessageLite<VoiceRoomLevelUp, Builder> implements VoiceRoomLevelUpOrBuilder {
        private static final VoiceRoomLevelUp DEFAULT_INSTANCE;
        public static final int ENDCOLOR_FIELD_NUMBER = 6;
        public static final int LEVELICON_FIELD_NUMBER = 3;
        public static final int LEVELSMALLICON_FIELD_NUMBER = 7;
        public static final int LEVEL_FIELD_NUMBER = 2;
        private static volatile ng60<VoiceRoomLevelUp> PARSER = null;
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

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<VoiceRoomLevelUp, Builder> implements VoiceRoomLevelUpOrBuilder {
            private Builder() {
                super(VoiceRoomLevelUp.DEFAULT_INSTANCE);
            }

            public Builder clearEndColor() {
                copyOnWrite();
                ((VoiceRoomLevelUp) this.instance).clearEndColor();
                return this;
            }

            public Builder clearLevel() {
                copyOnWrite();
                ((VoiceRoomLevelUp) this.instance).clearLevel();
                return this;
            }

            public Builder clearLevelIcon() {
                copyOnWrite();
                ((VoiceRoomLevelUp) this.instance).clearLevelIcon();
                return this;
            }

            public Builder clearLevelSmallIcon() {
                copyOnWrite();
                ((VoiceRoomLevelUp) this.instance).clearLevelSmallIcon();
                return this;
            }

            public Builder clearRoomId() {
                copyOnWrite();
                ((VoiceRoomLevelUp) this.instance).clearRoomId();
                return this;
            }

            public Builder clearStartColor() {
                copyOnWrite();
                ((VoiceRoomLevelUp) this.instance).clearStartColor();
                return this;
            }

            public Builder clearUpdatedTime() {
                copyOnWrite();
                ((VoiceRoomLevelUp) this.instance).clearUpdatedTime();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceRoomLevelUpOrBuilder
            public String getEndColor() {
                return ((VoiceRoomLevelUp) this.instance).getEndColor();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceRoomLevelUpOrBuilder
            public ByteString getEndColorBytes() {
                return ((VoiceRoomLevelUp) this.instance).getEndColorBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceRoomLevelUpOrBuilder
            public int getLevel() {
                return ((VoiceRoomLevelUp) this.instance).getLevel();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceRoomLevelUpOrBuilder
            public String getLevelIcon() {
                return ((VoiceRoomLevelUp) this.instance).getLevelIcon();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceRoomLevelUpOrBuilder
            public ByteString getLevelIconBytes() {
                return ((VoiceRoomLevelUp) this.instance).getLevelIconBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceRoomLevelUpOrBuilder
            public String getLevelSmallIcon() {
                return ((VoiceRoomLevelUp) this.instance).getLevelSmallIcon();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceRoomLevelUpOrBuilder
            public ByteString getLevelSmallIconBytes() {
                return ((VoiceRoomLevelUp) this.instance).getLevelSmallIconBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceRoomLevelUpOrBuilder
            public String getRoomId() {
                return ((VoiceRoomLevelUp) this.instance).getRoomId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceRoomLevelUpOrBuilder
            public ByteString getRoomIdBytes() {
                return ((VoiceRoomLevelUp) this.instance).getRoomIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceRoomLevelUpOrBuilder
            public String getStartColor() {
                return ((VoiceRoomLevelUp) this.instance).getStartColor();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceRoomLevelUpOrBuilder
            public ByteString getStartColorBytes() {
                return ((VoiceRoomLevelUp) this.instance).getStartColorBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceRoomLevelUpOrBuilder
            public long getUpdatedTime() {
                return ((VoiceRoomLevelUp) this.instance).getUpdatedTime();
            }

            public Builder setEndColor(String str) {
                copyOnWrite();
                ((VoiceRoomLevelUp) this.instance).setEndColor(str);
                return this;
            }

            public Builder setEndColorBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceRoomLevelUp) this.instance).setEndColorBytes(byteString);
                return this;
            }

            public Builder setLevel(int i) {
                copyOnWrite();
                ((VoiceRoomLevelUp) this.instance).setLevel(i);
                return this;
            }

            public Builder setLevelIcon(String str) {
                copyOnWrite();
                ((VoiceRoomLevelUp) this.instance).setLevelIcon(str);
                return this;
            }

            public Builder setLevelIconBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceRoomLevelUp) this.instance).setLevelIconBytes(byteString);
                return this;
            }

            public Builder setLevelSmallIcon(String str) {
                copyOnWrite();
                ((VoiceRoomLevelUp) this.instance).setLevelSmallIcon(str);
                return this;
            }

            public Builder setLevelSmallIconBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceRoomLevelUp) this.instance).setLevelSmallIconBytes(byteString);
                return this;
            }

            public Builder setRoomId(String str) {
                copyOnWrite();
                ((VoiceRoomLevelUp) this.instance).setRoomId(str);
                return this;
            }

            public Builder setRoomIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceRoomLevelUp) this.instance).setRoomIdBytes(byteString);
                return this;
            }

            public Builder setStartColor(String str) {
                copyOnWrite();
                ((VoiceRoomLevelUp) this.instance).setStartColor(str);
                return this;
            }

            public Builder setStartColorBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceRoomLevelUp) this.instance).setStartColorBytes(byteString);
                return this;
            }

            public Builder setUpdatedTime(long j) {
                copyOnWrite();
                ((VoiceRoomLevelUp) this.instance).setUpdatedTime(j);
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
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(voiceRoomLevelUp);
        }

        public static VoiceRoomLevelUp parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VoiceRoomLevelUp) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceRoomLevelUp parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VoiceRoomLevelUp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<VoiceRoomLevelUp> parser() {
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.startColor_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUpdatedTime(long j) {
            this.updatedTime_ = j;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C46611.f16699xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoiceRoomLevelUp();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    VoiceRoomLevelUp voiceRoomLevelUp = (VoiceRoomLevelUp) obj2;
                    this.roomId_ = interfaceC3409h.mo17052f(!this.roomId_.isEmpty(), this.roomId_, !voiceRoomLevelUp.roomId_.isEmpty(), voiceRoomLevelUp.roomId_);
                    int i = this.level_;
                    boolean z2 = i != 0;
                    int i2 = voiceRoomLevelUp.level_;
                    this.level_ = interfaceC3409h.mo17051e(z2, i, i2 != 0, i2);
                    this.levelIcon_ = interfaceC3409h.mo17052f(!this.levelIcon_.isEmpty(), this.levelIcon_, !voiceRoomLevelUp.levelIcon_.isEmpty(), voiceRoomLevelUp.levelIcon_);
                    long j = this.updatedTime_;
                    boolean z3 = j != 0;
                    long j2 = voiceRoomLevelUp.updatedTime_;
                    this.updatedTime_ = interfaceC3409h.mo17055i(z3, j, j2 != 0, j2);
                    this.startColor_ = interfaceC3409h.mo17052f(!this.startColor_.isEmpty(), this.startColor_, !voiceRoomLevelUp.startColor_.isEmpty(), voiceRoomLevelUp.startColor_);
                    this.endColor_ = interfaceC3409h.mo17052f(!this.endColor_.isEmpty(), this.endColor_, !voiceRoomLevelUp.endColor_.isEmpty(), voiceRoomLevelUp.endColor_);
                    this.levelSmallIcon_ = interfaceC3409h.mo17052f(!this.levelSmallIcon_.isEmpty(), this.levelSmallIcon_, !voiceRoomLevelUp.levelSmallIcon_.isEmpty(), voiceRoomLevelUp.levelSmallIcon_);
                    GeneratedMessageLite.C3408g c3408g = GeneratedMessageLite.C3408g.INSTANCE;
                    return this;
                case 6:
                    C3430e c3430e = (C3430e) obj;
                    while (!z) {
                        try {
                            int iM17171M = c3430e.m17171M();
                            if (iM17171M != 0) {
                                if (iM17171M == 10) {
                                    this.roomId_ = c3430e.m17170L();
                                } else if (iM17171M == 16) {
                                    this.level_ = c3430e.m17196u();
                                } else if (iM17171M == 26) {
                                    this.levelIcon_ = c3430e.m17170L();
                                } else if (iM17171M == 32) {
                                    this.updatedTime_ = c3430e.m17197v();
                                } else if (iM17171M == 42) {
                                    this.startColor_ = c3430e.m17170L();
                                } else if (iM17171M == 50) {
                                    this.endColor_ = c3430e.m17170L();
                                } else if (iM17171M == 58) {
                                    this.levelSmallIcon_ = c3430e.m17170L();
                                } else if (!c3430e.m17176R(iM17171M)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            iig0.m140070a(e.setUnfinishedMessage(this));
                            return null;
                        } catch (IOException e2) {
                            iig0.m140070a(new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this));
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
                                    PARSER = new GeneratedMessageLite.C3404c(DEFAULT_INSTANCE);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return PARSER;
                default:
                    l710.m153113a();
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

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16956K = !this.roomId_.isEmpty() ? CodedOutputStream.m16956K(1, getRoomId()) : 0;
            int i2 = this.level_;
            if (i2 != 0) {
                iM16956K += CodedOutputStream.m16984t(2, i2);
            }
            if (!this.levelIcon_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(3, getLevelIcon());
            }
            long j = this.updatedTime_;
            if (j != 0) {
                iM16956K += CodedOutputStream.m16986v(4, j);
            }
            if (!this.startColor_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(5, getStartColor());
            }
            if (!this.endColor_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(6, getEndColor());
            }
            if (!this.levelSmallIcon_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(7, getLevelSmallIcon());
            }
            this.memoizedSerializedSize = iM16956K;
            return iM16956K;
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

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.roomId_.isEmpty()) {
                codedOutputStream.mo16994D0(1, getRoomId());
            }
            int i = this.level_;
            if (i != 0) {
                codedOutputStream.mo17025s0(2, i);
            }
            if (!this.levelIcon_.isEmpty()) {
                codedOutputStream.mo16994D0(3, getLevelIcon());
            }
            long j = this.updatedTime_;
            if (j != 0) {
                codedOutputStream.m17027u0(4, j);
            }
            if (!this.startColor_.isEmpty()) {
                codedOutputStream.mo16994D0(5, getStartColor());
            }
            if (!this.endColor_.isEmpty()) {
                codedOutputStream.mo16994D0(6, getEndColor());
            }
            if (this.levelSmallIcon_.isEmpty()) {
                return;
            }
            codedOutputStream.mo16994D0(7, getLevelSmallIcon());
        }

        public static VoiceRoomLevelUp parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (VoiceRoomLevelUp) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static VoiceRoomLevelUp parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (VoiceRoomLevelUp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        public static VoiceRoomLevelUp parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoiceRoomLevelUp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoiceRoomLevelUp parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (VoiceRoomLevelUp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static VoiceRoomLevelUp parseFrom(InputStream inputStream) throws IOException {
            return (VoiceRoomLevelUp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceRoomLevelUp parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (VoiceRoomLevelUp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static VoiceRoomLevelUp parseFrom(C3430e c3430e) throws IOException {
            return (VoiceRoomLevelUp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static VoiceRoomLevelUp parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (VoiceRoomLevelUp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }

    public static final class VoiceRoomPersonalUpdate extends GeneratedMessageLite<VoiceRoomPersonalUpdate, Builder> implements VoiceRoomPersonalUpdateOrBuilder {
        private static final VoiceRoomPersonalUpdate DEFAULT_INSTANCE;
        public static final int ISPERSONAL_FIELD_NUMBER = 2;
        private static volatile ng60<VoiceRoomPersonalUpdate> PARSER = null;
        public static final int ROOMID_FIELD_NUMBER = 1;
        private boolean isPersonal_;
        private String roomId_ = "";

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<VoiceRoomPersonalUpdate, Builder> implements VoiceRoomPersonalUpdateOrBuilder {
            private Builder() {
                super(VoiceRoomPersonalUpdate.DEFAULT_INSTANCE);
            }

            public Builder clearIsPersonal() {
                copyOnWrite();
                ((VoiceRoomPersonalUpdate) this.instance).clearIsPersonal();
                return this;
            }

            public Builder clearRoomId() {
                copyOnWrite();
                ((VoiceRoomPersonalUpdate) this.instance).clearRoomId();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceRoomPersonalUpdateOrBuilder
            public boolean getIsPersonal() {
                return ((VoiceRoomPersonalUpdate) this.instance).getIsPersonal();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceRoomPersonalUpdateOrBuilder
            public String getRoomId() {
                return ((VoiceRoomPersonalUpdate) this.instance).getRoomId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceRoomPersonalUpdateOrBuilder
            public ByteString getRoomIdBytes() {
                return ((VoiceRoomPersonalUpdate) this.instance).getRoomIdBytes();
            }

            public Builder setIsPersonal(boolean z) {
                copyOnWrite();
                ((VoiceRoomPersonalUpdate) this.instance).setIsPersonal(z);
                return this;
            }

            public Builder setRoomId(String str) {
                copyOnWrite();
                ((VoiceRoomPersonalUpdate) this.instance).setRoomId(str);
                return this;
            }

            public Builder setRoomIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceRoomPersonalUpdate) this.instance).setRoomIdBytes(byteString);
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
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(voiceRoomPersonalUpdate);
        }

        public static VoiceRoomPersonalUpdate parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VoiceRoomPersonalUpdate) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceRoomPersonalUpdate parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VoiceRoomPersonalUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<VoiceRoomPersonalUpdate> parser() {
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.roomId_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C46611.f16699xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoiceRoomPersonalUpdate();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    VoiceRoomPersonalUpdate voiceRoomPersonalUpdate = (VoiceRoomPersonalUpdate) obj2;
                    this.roomId_ = interfaceC3409h.mo17052f(!this.roomId_.isEmpty(), this.roomId_, true ^ voiceRoomPersonalUpdate.roomId_.isEmpty(), voiceRoomPersonalUpdate.roomId_);
                    boolean z = this.isPersonal_;
                    boolean z2 = voiceRoomPersonalUpdate.isPersonal_;
                    this.isPersonal_ = interfaceC3409h.mo17050d(z, z, z2, z2);
                    GeneratedMessageLite.C3408g c3408g = GeneratedMessageLite.C3408g.INSTANCE;
                    return this;
                case 6:
                    C3430e c3430e = (C3430e) obj;
                    boolean z3 = false;
                    while (!z3) {
                        try {
                            int iM17171M = c3430e.m17171M();
                            if (iM17171M != 0) {
                                if (iM17171M == 10) {
                                    this.roomId_ = c3430e.m17170L();
                                } else if (iM17171M == 16) {
                                    this.isPersonal_ = c3430e.m17188m();
                                } else if (!c3430e.m17176R(iM17171M)) {
                                }
                            }
                            z3 = true;
                        } catch (InvalidProtocolBufferException e) {
                            iig0.m140070a(e.setUnfinishedMessage(this));
                            return null;
                        } catch (IOException e2) {
                            iig0.m140070a(new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this));
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
                                    PARSER = new GeneratedMessageLite.C3404c(DEFAULT_INSTANCE);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return PARSER;
                default:
                    l710.m153113a();
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

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16956K = !this.roomId_.isEmpty() ? CodedOutputStream.m16956K(1, getRoomId()) : 0;
            boolean z = this.isPersonal_;
            if (z) {
                iM16956K += CodedOutputStream.m16970f(2, z);
            }
            this.memoizedSerializedSize = iM16956K;
            return iM16956K;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.roomId_.isEmpty()) {
                codedOutputStream.mo16994D0(1, getRoomId());
            }
            boolean z = this.isPersonal_;
            if (z) {
                codedOutputStream.mo17005a0(2, z);
            }
        }

        public static VoiceRoomPersonalUpdate parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (VoiceRoomPersonalUpdate) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static VoiceRoomPersonalUpdate parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (VoiceRoomPersonalUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        public static VoiceRoomPersonalUpdate parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoiceRoomPersonalUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoiceRoomPersonalUpdate parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (VoiceRoomPersonalUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static VoiceRoomPersonalUpdate parseFrom(InputStream inputStream) throws IOException {
            return (VoiceRoomPersonalUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceRoomPersonalUpdate parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (VoiceRoomPersonalUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static VoiceRoomPersonalUpdate parseFrom(C3430e c3430e) throws IOException {
            return (VoiceRoomPersonalUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static VoiceRoomPersonalUpdate parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (VoiceRoomPersonalUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }

    public static final class VoiceRoomTitleUpdate extends GeneratedMessageLite<VoiceRoomTitleUpdate, Builder> implements VoiceRoomTitleUpdateOrBuilder {
        private static final VoiceRoomTitleUpdate DEFAULT_INSTANCE;
        private static volatile ng60<VoiceRoomTitleUpdate> PARSER = null;
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
                this.tempdata_ = Template.TemplateData.newBuilder(this.tempdata_).mergeFrom(templateData).buildPartial();
            }
        }

        public static Builder newBuilder(VoiceRoomTitleUpdate voiceRoomTitleUpdate) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(voiceRoomTitleUpdate);
        }

        public static VoiceRoomTitleUpdate parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VoiceRoomTitleUpdate) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceRoomTitleUpdate parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VoiceRoomTitleUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<VoiceRoomTitleUpdate> parser() {
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.roomId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTempdata(Template.TemplateData.Builder builder) {
            this.tempdata_ = builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTitle(String str) {
            str.getClass();
            this.title_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTitleBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.title_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C46611.f16699xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoiceRoomTitleUpdate();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    VoiceRoomTitleUpdate voiceRoomTitleUpdate = (VoiceRoomTitleUpdate) obj2;
                    this.roomId_ = interfaceC3409h.mo17052f(!this.roomId_.isEmpty(), this.roomId_, !voiceRoomTitleUpdate.roomId_.isEmpty(), voiceRoomTitleUpdate.roomId_);
                    this.tempdata_ = (Template.TemplateData) interfaceC3409h.mo17061o(this.tempdata_, voiceRoomTitleUpdate.tempdata_);
                    this.title_ = interfaceC3409h.mo17052f(!this.title_.isEmpty(), this.title_, true ^ voiceRoomTitleUpdate.title_.isEmpty(), voiceRoomTitleUpdate.title_);
                    GeneratedMessageLite.C3408g c3408g = GeneratedMessageLite.C3408g.INSTANCE;
                    return this;
                case 6:
                    C3430e c3430e = (C3430e) obj;
                    C3433h c3433h = (C3433h) obj2;
                    boolean z = false;
                    while (!z) {
                        try {
                            int iM17171M = c3430e.m17171M();
                            if (iM17171M != 0) {
                                if (iM17171M == 10) {
                                    this.roomId_ = c3430e.m17170L();
                                } else if (iM17171M == 18) {
                                    Template.TemplateData templateData = this.tempdata_;
                                    Template.TemplateData.Builder builder = templateData != null ? templateData.toBuilder() : null;
                                    Template.TemplateData templateData2 = (Template.TemplateData) c3430e.m17198w(Template.TemplateData.parser(), c3433h);
                                    this.tempdata_ = templateData2;
                                    if (builder != null) {
                                        builder.mergeFrom(templateData2);
                                        this.tempdata_ = builder.buildPartial();
                                    }
                                } else if (iM17171M == 26) {
                                    this.title_ = c3430e.m17170L();
                                } else if (!c3430e.m17176R(iM17171M)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            iig0.m140070a(e.setUnfinishedMessage(this));
                            return null;
                        } catch (IOException e2) {
                            iig0.m140070a(new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this));
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
                                    PARSER = new GeneratedMessageLite.C3404c(DEFAULT_INSTANCE);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return PARSER;
                default:
                    l710.m153113a();
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

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16956K = !this.roomId_.isEmpty() ? CodedOutputStream.m16956K(1, getRoomId()) : 0;
            if (this.tempdata_ != null) {
                iM16956K += CodedOutputStream.m16948C(2, getTempdata());
            }
            if (!this.title_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(3, getTitle());
            }
            this.memoizedSerializedSize = iM16956K;
            return iM16956K;
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

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.roomId_.isEmpty()) {
                codedOutputStream.mo16994D0(1, getRoomId());
            }
            if (this.tempdata_ != null) {
                codedOutputStream.mo17029w0(2, getTempdata());
            }
            if (this.title_.isEmpty()) {
                return;
            }
            codedOutputStream.mo16994D0(3, getTitle());
        }

        public static VoiceRoomTitleUpdate parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (VoiceRoomTitleUpdate) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static VoiceRoomTitleUpdate parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (VoiceRoomTitleUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTempdata(Template.TemplateData templateData) {
            templateData.getClass();
            this.tempdata_ = templateData;
        }

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<VoiceRoomTitleUpdate, Builder> implements VoiceRoomTitleUpdateOrBuilder {
            private Builder() {
                super(VoiceRoomTitleUpdate.DEFAULT_INSTANCE);
            }

            public Builder clearRoomId() {
                copyOnWrite();
                ((VoiceRoomTitleUpdate) this.instance).clearRoomId();
                return this;
            }

            public Builder clearTempdata() {
                copyOnWrite();
                ((VoiceRoomTitleUpdate) this.instance).clearTempdata();
                return this;
            }

            public Builder clearTitle() {
                copyOnWrite();
                ((VoiceRoomTitleUpdate) this.instance).clearTitle();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceRoomTitleUpdateOrBuilder
            public String getRoomId() {
                return ((VoiceRoomTitleUpdate) this.instance).getRoomId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceRoomTitleUpdateOrBuilder
            public ByteString getRoomIdBytes() {
                return ((VoiceRoomTitleUpdate) this.instance).getRoomIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceRoomTitleUpdateOrBuilder
            public Template.TemplateData getTempdata() {
                return ((VoiceRoomTitleUpdate) this.instance).getTempdata();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceRoomTitleUpdateOrBuilder
            public String getTitle() {
                return ((VoiceRoomTitleUpdate) this.instance).getTitle();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceRoomTitleUpdateOrBuilder
            public ByteString getTitleBytes() {
                return ((VoiceRoomTitleUpdate) this.instance).getTitleBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceRoomTitleUpdateOrBuilder
            public boolean hasTempdata() {
                return ((VoiceRoomTitleUpdate) this.instance).hasTempdata();
            }

            public Builder mergeTempdata(Template.TemplateData templateData) {
                copyOnWrite();
                ((VoiceRoomTitleUpdate) this.instance).mergeTempdata(templateData);
                return this;
            }

            public Builder setRoomId(String str) {
                copyOnWrite();
                ((VoiceRoomTitleUpdate) this.instance).setRoomId(str);
                return this;
            }

            public Builder setRoomIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceRoomTitleUpdate) this.instance).setRoomIdBytes(byteString);
                return this;
            }

            public Builder setTempdata(Template.TemplateData templateData) {
                copyOnWrite();
                ((VoiceRoomTitleUpdate) this.instance).setTempdata(templateData);
                return this;
            }

            public Builder setTitle(String str) {
                copyOnWrite();
                ((VoiceRoomTitleUpdate) this.instance).setTitle(str);
                return this;
            }

            public Builder setTitleBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceRoomTitleUpdate) this.instance).setTitleBytes(byteString);
                return this;
            }

            public Builder setTempdata(Template.TemplateData.Builder builder) {
                copyOnWrite();
                ((VoiceRoomTitleUpdate) this.instance).setTempdata(builder);
                return this;
            }
        }

        public static VoiceRoomTitleUpdate parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoiceRoomTitleUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoiceRoomTitleUpdate parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (VoiceRoomTitleUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static VoiceRoomTitleUpdate parseFrom(InputStream inputStream) throws IOException {
            return (VoiceRoomTitleUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceRoomTitleUpdate parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (VoiceRoomTitleUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static VoiceRoomTitleUpdate parseFrom(C3430e c3430e) throws IOException {
            return (VoiceRoomTitleUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static VoiceRoomTitleUpdate parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (VoiceRoomTitleUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }

    public static final class VoiceSettleInviteMessage extends GeneratedMessageLite<VoiceSettleInviteMessage, Builder> implements VoiceSettleInviteMessageOrBuilder {
        public static final int APPLYTOKEN_FIELD_NUMBER = 5;
        private static final VoiceSettleInviteMessage DEFAULT_INSTANCE;
        public static final int FROMUSERID_FIELD_NUMBER = 1;
        public static final int FROMUSERNAME_FIELD_NUMBER = 2;
        private static volatile ng60<VoiceSettleInviteMessage> PARSER = null;
        public static final int ROOMID_FIELD_NUMBER = 4;
        public static final int USERID_FIELD_NUMBER = 3;
        private String fromUserId_ = "";
        private String fromUserName_ = "";
        private String userId_ = "";
        private String roomId_ = "";
        private String applyToken_ = "";

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<VoiceSettleInviteMessage, Builder> implements VoiceSettleInviteMessageOrBuilder {
            private Builder() {
                super(VoiceSettleInviteMessage.DEFAULT_INSTANCE);
            }

            public Builder clearApplyToken() {
                copyOnWrite();
                ((VoiceSettleInviteMessage) this.instance).clearApplyToken();
                return this;
            }

            public Builder clearFromUserId() {
                copyOnWrite();
                ((VoiceSettleInviteMessage) this.instance).clearFromUserId();
                return this;
            }

            public Builder clearFromUserName() {
                copyOnWrite();
                ((VoiceSettleInviteMessage) this.instance).clearFromUserName();
                return this;
            }

            public Builder clearRoomId() {
                copyOnWrite();
                ((VoiceSettleInviteMessage) this.instance).clearRoomId();
                return this;
            }

            public Builder clearUserId() {
                copyOnWrite();
                ((VoiceSettleInviteMessage) this.instance).clearUserId();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceSettleInviteMessageOrBuilder
            public String getApplyToken() {
                return ((VoiceSettleInviteMessage) this.instance).getApplyToken();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceSettleInviteMessageOrBuilder
            public ByteString getApplyTokenBytes() {
                return ((VoiceSettleInviteMessage) this.instance).getApplyTokenBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceSettleInviteMessageOrBuilder
            public String getFromUserId() {
                return ((VoiceSettleInviteMessage) this.instance).getFromUserId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceSettleInviteMessageOrBuilder
            public ByteString getFromUserIdBytes() {
                return ((VoiceSettleInviteMessage) this.instance).getFromUserIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceSettleInviteMessageOrBuilder
            public String getFromUserName() {
                return ((VoiceSettleInviteMessage) this.instance).getFromUserName();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceSettleInviteMessageOrBuilder
            public ByteString getFromUserNameBytes() {
                return ((VoiceSettleInviteMessage) this.instance).getFromUserNameBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceSettleInviteMessageOrBuilder
            public String getRoomId() {
                return ((VoiceSettleInviteMessage) this.instance).getRoomId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceSettleInviteMessageOrBuilder
            public ByteString getRoomIdBytes() {
                return ((VoiceSettleInviteMessage) this.instance).getRoomIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceSettleInviteMessageOrBuilder
            public String getUserId() {
                return ((VoiceSettleInviteMessage) this.instance).getUserId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceSettleInviteMessageOrBuilder
            public ByteString getUserIdBytes() {
                return ((VoiceSettleInviteMessage) this.instance).getUserIdBytes();
            }

            public Builder setApplyToken(String str) {
                copyOnWrite();
                ((VoiceSettleInviteMessage) this.instance).setApplyToken(str);
                return this;
            }

            public Builder setApplyTokenBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceSettleInviteMessage) this.instance).setApplyTokenBytes(byteString);
                return this;
            }

            public Builder setFromUserId(String str) {
                copyOnWrite();
                ((VoiceSettleInviteMessage) this.instance).setFromUserId(str);
                return this;
            }

            public Builder setFromUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceSettleInviteMessage) this.instance).setFromUserIdBytes(byteString);
                return this;
            }

            public Builder setFromUserName(String str) {
                copyOnWrite();
                ((VoiceSettleInviteMessage) this.instance).setFromUserName(str);
                return this;
            }

            public Builder setFromUserNameBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceSettleInviteMessage) this.instance).setFromUserNameBytes(byteString);
                return this;
            }

            public Builder setRoomId(String str) {
                copyOnWrite();
                ((VoiceSettleInviteMessage) this.instance).setRoomId(str);
                return this;
            }

            public Builder setRoomIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceSettleInviteMessage) this.instance).setRoomIdBytes(byteString);
                return this;
            }

            public Builder setUserId(String str) {
                copyOnWrite();
                ((VoiceSettleInviteMessage) this.instance).setUserId(str);
                return this;
            }

            public Builder setUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceSettleInviteMessage) this.instance).setUserIdBytes(byteString);
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
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(voiceSettleInviteMessage);
        }

        public static VoiceSettleInviteMessage parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VoiceSettleInviteMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceSettleInviteMessage parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VoiceSettleInviteMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<VoiceSettleInviteMessage> parser() {
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.userId_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C46611.f16699xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoiceSettleInviteMessage();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    VoiceSettleInviteMessage voiceSettleInviteMessage = (VoiceSettleInviteMessage) obj2;
                    this.fromUserId_ = interfaceC3409h.mo17052f(!this.fromUserId_.isEmpty(), this.fromUserId_, !voiceSettleInviteMessage.fromUserId_.isEmpty(), voiceSettleInviteMessage.fromUserId_);
                    this.fromUserName_ = interfaceC3409h.mo17052f(!this.fromUserName_.isEmpty(), this.fromUserName_, !voiceSettleInviteMessage.fromUserName_.isEmpty(), voiceSettleInviteMessage.fromUserName_);
                    this.userId_ = interfaceC3409h.mo17052f(!this.userId_.isEmpty(), this.userId_, !voiceSettleInviteMessage.userId_.isEmpty(), voiceSettleInviteMessage.userId_);
                    this.roomId_ = interfaceC3409h.mo17052f(!this.roomId_.isEmpty(), this.roomId_, !voiceSettleInviteMessage.roomId_.isEmpty(), voiceSettleInviteMessage.roomId_);
                    this.applyToken_ = interfaceC3409h.mo17052f(!this.applyToken_.isEmpty(), this.applyToken_, true ^ voiceSettleInviteMessage.applyToken_.isEmpty(), voiceSettleInviteMessage.applyToken_);
                    GeneratedMessageLite.C3408g c3408g = GeneratedMessageLite.C3408g.INSTANCE;
                    return this;
                case 6:
                    C3430e c3430e = (C3430e) obj;
                    boolean z = false;
                    while (!z) {
                        try {
                            int iM17171M = c3430e.m17171M();
                            if (iM17171M != 0) {
                                if (iM17171M == 10) {
                                    this.fromUserId_ = c3430e.m17170L();
                                } else if (iM17171M == 18) {
                                    this.fromUserName_ = c3430e.m17170L();
                                } else if (iM17171M == 26) {
                                    this.userId_ = c3430e.m17170L();
                                } else if (iM17171M == 34) {
                                    this.roomId_ = c3430e.m17170L();
                                } else if (iM17171M == 42) {
                                    this.applyToken_ = c3430e.m17170L();
                                } else if (!c3430e.m17176R(iM17171M)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            iig0.m140070a(e.setUnfinishedMessage(this));
                            return null;
                        } catch (IOException e2) {
                            iig0.m140070a(new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this));
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
                                    PARSER = new GeneratedMessageLite.C3404c(DEFAULT_INSTANCE);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return PARSER;
                default:
                    l710.m153113a();
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

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16956K = !this.fromUserId_.isEmpty() ? CodedOutputStream.m16956K(1, getFromUserId()) : 0;
            if (!this.fromUserName_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(2, getFromUserName());
            }
            if (!this.userId_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(3, getUserId());
            }
            if (!this.roomId_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(4, getRoomId());
            }
            if (!this.applyToken_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(5, getApplyToken());
            }
            this.memoizedSerializedSize = iM16956K;
            return iM16956K;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceSettleInviteMessageOrBuilder
        public String getUserId() {
            return this.userId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceSettleInviteMessageOrBuilder
        public ByteString getUserIdBytes() {
            return ByteString.copyFromUtf8(this.userId_);
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.fromUserId_.isEmpty()) {
                codedOutputStream.mo16994D0(1, getFromUserId());
            }
            if (!this.fromUserName_.isEmpty()) {
                codedOutputStream.mo16994D0(2, getFromUserName());
            }
            if (!this.userId_.isEmpty()) {
                codedOutputStream.mo16994D0(3, getUserId());
            }
            if (!this.roomId_.isEmpty()) {
                codedOutputStream.mo16994D0(4, getRoomId());
            }
            if (this.applyToken_.isEmpty()) {
                return;
            }
            codedOutputStream.mo16994D0(5, getApplyToken());
        }

        public static VoiceSettleInviteMessage parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (VoiceSettleInviteMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static VoiceSettleInviteMessage parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (VoiceSettleInviteMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        public static VoiceSettleInviteMessage parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoiceSettleInviteMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoiceSettleInviteMessage parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (VoiceSettleInviteMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static VoiceSettleInviteMessage parseFrom(InputStream inputStream) throws IOException {
            return (VoiceSettleInviteMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceSettleInviteMessage parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (VoiceSettleInviteMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static VoiceSettleInviteMessage parseFrom(C3430e c3430e) throws IOException {
            return (VoiceSettleInviteMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static VoiceSettleInviteMessage parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (VoiceSettleInviteMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }

    public static final class VoiceShareScreenDesc extends GeneratedMessageLite<VoiceShareScreenDesc, Builder> implements VoiceShareScreenDescOrBuilder {
        private static final VoiceShareScreenDesc DEFAULT_INSTANCE;
        public static final int DESC_FIELD_NUMBER = 4;
        public static final int ID_FIELD_NUMBER = 1;
        private static volatile ng60<VoiceShareScreenDesc> PARSER = null;
        public static final int ROOMID_FIELD_NUMBER = 3;
        public static final int USERID_FIELD_NUMBER = 2;
        private String id_ = "";
        private String userId_ = "";
        private String roomId_ = "";
        private String desc_ = "";

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<VoiceShareScreenDesc, Builder> implements VoiceShareScreenDescOrBuilder {
            private Builder() {
                super(VoiceShareScreenDesc.DEFAULT_INSTANCE);
            }

            public Builder clearDesc() {
                copyOnWrite();
                ((VoiceShareScreenDesc) this.instance).clearDesc();
                return this;
            }

            public Builder clearId() {
                copyOnWrite();
                ((VoiceShareScreenDesc) this.instance).clearId();
                return this;
            }

            public Builder clearRoomId() {
                copyOnWrite();
                ((VoiceShareScreenDesc) this.instance).clearRoomId();
                return this;
            }

            public Builder clearUserId() {
                copyOnWrite();
                ((VoiceShareScreenDesc) this.instance).clearUserId();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceShareScreenDescOrBuilder
            public String getDesc() {
                return ((VoiceShareScreenDesc) this.instance).getDesc();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceShareScreenDescOrBuilder
            public ByteString getDescBytes() {
                return ((VoiceShareScreenDesc) this.instance).getDescBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceShareScreenDescOrBuilder
            public String getId() {
                return ((VoiceShareScreenDesc) this.instance).getId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceShareScreenDescOrBuilder
            public ByteString getIdBytes() {
                return ((VoiceShareScreenDesc) this.instance).getIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceShareScreenDescOrBuilder
            public String getRoomId() {
                return ((VoiceShareScreenDesc) this.instance).getRoomId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceShareScreenDescOrBuilder
            public ByteString getRoomIdBytes() {
                return ((VoiceShareScreenDesc) this.instance).getRoomIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceShareScreenDescOrBuilder
            public String getUserId() {
                return ((VoiceShareScreenDesc) this.instance).getUserId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceShareScreenDescOrBuilder
            public ByteString getUserIdBytes() {
                return ((VoiceShareScreenDesc) this.instance).getUserIdBytes();
            }

            public Builder setDesc(String str) {
                copyOnWrite();
                ((VoiceShareScreenDesc) this.instance).setDesc(str);
                return this;
            }

            public Builder setDescBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceShareScreenDesc) this.instance).setDescBytes(byteString);
                return this;
            }

            public Builder setId(String str) {
                copyOnWrite();
                ((VoiceShareScreenDesc) this.instance).setId(str);
                return this;
            }

            public Builder setIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceShareScreenDesc) this.instance).setIdBytes(byteString);
                return this;
            }

            public Builder setRoomId(String str) {
                copyOnWrite();
                ((VoiceShareScreenDesc) this.instance).setRoomId(str);
                return this;
            }

            public Builder setRoomIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceShareScreenDesc) this.instance).setRoomIdBytes(byteString);
                return this;
            }

            public Builder setUserId(String str) {
                copyOnWrite();
                ((VoiceShareScreenDesc) this.instance).setUserId(str);
                return this;
            }

            public Builder setUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceShareScreenDesc) this.instance).setUserIdBytes(byteString);
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
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(voiceShareScreenDesc);
        }

        public static VoiceShareScreenDesc parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VoiceShareScreenDesc) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceShareScreenDesc parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VoiceShareScreenDesc) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<VoiceShareScreenDesc> parser() {
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.userId_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C46611.f16699xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoiceShareScreenDesc();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    VoiceShareScreenDesc voiceShareScreenDesc = (VoiceShareScreenDesc) obj2;
                    this.id_ = interfaceC3409h.mo17052f(!this.id_.isEmpty(), this.id_, !voiceShareScreenDesc.id_.isEmpty(), voiceShareScreenDesc.id_);
                    this.userId_ = interfaceC3409h.mo17052f(!this.userId_.isEmpty(), this.userId_, !voiceShareScreenDesc.userId_.isEmpty(), voiceShareScreenDesc.userId_);
                    this.roomId_ = interfaceC3409h.mo17052f(!this.roomId_.isEmpty(), this.roomId_, !voiceShareScreenDesc.roomId_.isEmpty(), voiceShareScreenDesc.roomId_);
                    this.desc_ = interfaceC3409h.mo17052f(!this.desc_.isEmpty(), this.desc_, true ^ voiceShareScreenDesc.desc_.isEmpty(), voiceShareScreenDesc.desc_);
                    GeneratedMessageLite.C3408g c3408g = GeneratedMessageLite.C3408g.INSTANCE;
                    return this;
                case 6:
                    C3430e c3430e = (C3430e) obj;
                    boolean z = false;
                    while (!z) {
                        try {
                            int iM17171M = c3430e.m17171M();
                            if (iM17171M != 0) {
                                if (iM17171M == 10) {
                                    this.id_ = c3430e.m17170L();
                                } else if (iM17171M == 18) {
                                    this.userId_ = c3430e.m17170L();
                                } else if (iM17171M == 26) {
                                    this.roomId_ = c3430e.m17170L();
                                } else if (iM17171M == 34) {
                                    this.desc_ = c3430e.m17170L();
                                } else if (!c3430e.m17176R(iM17171M)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            iig0.m140070a(e.setUnfinishedMessage(this));
                            return null;
                        } catch (IOException e2) {
                            iig0.m140070a(new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this));
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
                                    PARSER = new GeneratedMessageLite.C3404c(DEFAULT_INSTANCE);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return PARSER;
                default:
                    l710.m153113a();
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

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16956K = !this.id_.isEmpty() ? CodedOutputStream.m16956K(1, getId()) : 0;
            if (!this.userId_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(2, getUserId());
            }
            if (!this.roomId_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(3, getRoomId());
            }
            if (!this.desc_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(4, getDesc());
            }
            this.memoizedSerializedSize = iM16956K;
            return iM16956K;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceShareScreenDescOrBuilder
        public String getUserId() {
            return this.userId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceShareScreenDescOrBuilder
        public ByteString getUserIdBytes() {
            return ByteString.copyFromUtf8(this.userId_);
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.id_.isEmpty()) {
                codedOutputStream.mo16994D0(1, getId());
            }
            if (!this.userId_.isEmpty()) {
                codedOutputStream.mo16994D0(2, getUserId());
            }
            if (!this.roomId_.isEmpty()) {
                codedOutputStream.mo16994D0(3, getRoomId());
            }
            if (this.desc_.isEmpty()) {
                return;
            }
            codedOutputStream.mo16994D0(4, getDesc());
        }

        public static VoiceShareScreenDesc parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (VoiceShareScreenDesc) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static VoiceShareScreenDesc parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (VoiceShareScreenDesc) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        public static VoiceShareScreenDesc parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoiceShareScreenDesc) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoiceShareScreenDesc parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (VoiceShareScreenDesc) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static VoiceShareScreenDesc parseFrom(InputStream inputStream) throws IOException {
            return (VoiceShareScreenDesc) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceShareScreenDesc parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (VoiceShareScreenDesc) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static VoiceShareScreenDesc parseFrom(C3430e c3430e) throws IOException {
            return (VoiceShareScreenDesc) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static VoiceShareScreenDesc parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (VoiceShareScreenDesc) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }

    public static final class VoiceStreamBizTypeMessage extends GeneratedMessageLite<VoiceStreamBizTypeMessage, Builder> implements VoiceStreamBizTypeMessageOrBuilder {
        public static final int BIZTYPE_FIELD_NUMBER = 3;
        private static final VoiceStreamBizTypeMessage DEFAULT_INSTANCE;
        public static final int LIVEID_FIELD_NUMBER = 2;
        private static volatile ng60<VoiceStreamBizTypeMessage> PARSER = null;
        public static final int ROOMID_FIELD_NUMBER = 1;
        private int bizType_;
        private String roomId_ = "";
        private String liveId_ = "";

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<VoiceStreamBizTypeMessage, Builder> implements VoiceStreamBizTypeMessageOrBuilder {
            private Builder() {
                super(VoiceStreamBizTypeMessage.DEFAULT_INSTANCE);
            }

            public Builder clearBizType() {
                copyOnWrite();
                ((VoiceStreamBizTypeMessage) this.instance).clearBizType();
                return this;
            }

            public Builder clearLiveId() {
                copyOnWrite();
                ((VoiceStreamBizTypeMessage) this.instance).clearLiveId();
                return this;
            }

            public Builder clearRoomId() {
                copyOnWrite();
                ((VoiceStreamBizTypeMessage) this.instance).clearRoomId();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceStreamBizTypeMessageOrBuilder
            public int getBizType() {
                return ((VoiceStreamBizTypeMessage) this.instance).getBizType();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceStreamBizTypeMessageOrBuilder
            public String getLiveId() {
                return ((VoiceStreamBizTypeMessage) this.instance).getLiveId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceStreamBizTypeMessageOrBuilder
            public ByteString getLiveIdBytes() {
                return ((VoiceStreamBizTypeMessage) this.instance).getLiveIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceStreamBizTypeMessageOrBuilder
            public String getRoomId() {
                return ((VoiceStreamBizTypeMessage) this.instance).getRoomId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceStreamBizTypeMessageOrBuilder
            public ByteString getRoomIdBytes() {
                return ((VoiceStreamBizTypeMessage) this.instance).getRoomIdBytes();
            }

            public Builder setBizType(int i) {
                copyOnWrite();
                ((VoiceStreamBizTypeMessage) this.instance).setBizType(i);
                return this;
            }

            public Builder setLiveId(String str) {
                copyOnWrite();
                ((VoiceStreamBizTypeMessage) this.instance).setLiveId(str);
                return this;
            }

            public Builder setLiveIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceStreamBizTypeMessage) this.instance).setLiveIdBytes(byteString);
                return this;
            }

            public Builder setRoomId(String str) {
                copyOnWrite();
                ((VoiceStreamBizTypeMessage) this.instance).setRoomId(str);
                return this;
            }

            public Builder setRoomIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceStreamBizTypeMessage) this.instance).setRoomIdBytes(byteString);
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
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(voiceStreamBizTypeMessage);
        }

        public static VoiceStreamBizTypeMessage parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VoiceStreamBizTypeMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceStreamBizTypeMessage parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VoiceStreamBizTypeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<VoiceStreamBizTypeMessage> parser() {
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.roomId_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C46611.f16699xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoiceStreamBizTypeMessage();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    VoiceStreamBizTypeMessage voiceStreamBizTypeMessage = (VoiceStreamBizTypeMessage) obj2;
                    this.roomId_ = interfaceC3409h.mo17052f(!this.roomId_.isEmpty(), this.roomId_, !voiceStreamBizTypeMessage.roomId_.isEmpty(), voiceStreamBizTypeMessage.roomId_);
                    this.liveId_ = interfaceC3409h.mo17052f(!this.liveId_.isEmpty(), this.liveId_, !voiceStreamBizTypeMessage.liveId_.isEmpty(), voiceStreamBizTypeMessage.liveId_);
                    int i = this.bizType_;
                    boolean z2 = i != 0;
                    int i2 = voiceStreamBizTypeMessage.bizType_;
                    this.bizType_ = interfaceC3409h.mo17051e(z2, i, i2 != 0, i2);
                    GeneratedMessageLite.C3408g c3408g = GeneratedMessageLite.C3408g.INSTANCE;
                    return this;
                case 6:
                    C3430e c3430e = (C3430e) obj;
                    while (!z) {
                        try {
                            int iM17171M = c3430e.m17171M();
                            if (iM17171M != 0) {
                                if (iM17171M == 10) {
                                    this.roomId_ = c3430e.m17170L();
                                } else if (iM17171M == 18) {
                                    this.liveId_ = c3430e.m17170L();
                                } else if (iM17171M == 24) {
                                    this.bizType_ = c3430e.m17196u();
                                } else if (!c3430e.m17176R(iM17171M)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            iig0.m140070a(e.setUnfinishedMessage(this));
                            return null;
                        } catch (IOException e2) {
                            iig0.m140070a(new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this));
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
                                    PARSER = new GeneratedMessageLite.C3404c(DEFAULT_INSTANCE);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return PARSER;
                default:
                    l710.m153113a();
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

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16956K = !this.roomId_.isEmpty() ? CodedOutputStream.m16956K(1, getRoomId()) : 0;
            if (!this.liveId_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(2, getLiveId());
            }
            int i2 = this.bizType_;
            if (i2 != 0) {
                iM16956K += CodedOutputStream.m16984t(3, i2);
            }
            this.memoizedSerializedSize = iM16956K;
            return iM16956K;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.roomId_.isEmpty()) {
                codedOutputStream.mo16994D0(1, getRoomId());
            }
            if (!this.liveId_.isEmpty()) {
                codedOutputStream.mo16994D0(2, getLiveId());
            }
            int i = this.bizType_;
            if (i != 0) {
                codedOutputStream.mo17025s0(3, i);
            }
        }

        public static VoiceStreamBizTypeMessage parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (VoiceStreamBizTypeMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static VoiceStreamBizTypeMessage parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (VoiceStreamBizTypeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        public static VoiceStreamBizTypeMessage parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoiceStreamBizTypeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoiceStreamBizTypeMessage parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (VoiceStreamBizTypeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static VoiceStreamBizTypeMessage parseFrom(InputStream inputStream) throws IOException {
            return (VoiceStreamBizTypeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceStreamBizTypeMessage parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (VoiceStreamBizTypeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static VoiceStreamBizTypeMessage parseFrom(C3430e c3430e) throws IOException {
            return (VoiceStreamBizTypeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static VoiceStreamBizTypeMessage parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (VoiceStreamBizTypeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }

    public static final class VoiceToneMessage extends GeneratedMessageLite<VoiceToneMessage, Builder> implements VoiceToneMessageOrBuilder {
        private static final VoiceToneMessage DEFAULT_INSTANCE;
        private static volatile ng60<VoiceToneMessage> PARSER;

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<VoiceToneMessage, Builder> implements VoiceToneMessageOrBuilder {
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
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(voiceToneMessage);
        }

        public static VoiceToneMessage parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VoiceToneMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceToneMessage parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VoiceToneMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<VoiceToneMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C46611.f16699xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoiceToneMessage();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.C3408g c3408g = GeneratedMessageLite.C3408g.INSTANCE;
                    return this;
                case 6:
                    C3430e c3430e = (C3430e) obj;
                    boolean z = false;
                    while (!z) {
                        try {
                            int iM17171M = c3430e.m17171M();
                            if (iM17171M == 0 || !c3430e.m17176R(iM17171M)) {
                                z = true;
                            }
                        } catch (InvalidProtocolBufferException e) {
                            iig0.m140070a(e.setUnfinishedMessage(this));
                            return null;
                        } catch (IOException e2) {
                            iig0.m140070a(new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this));
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
                                    PARSER = new GeneratedMessageLite.C3404c(DEFAULT_INSTANCE);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return PARSER;
                default:
                    l710.m153113a();
                    return null;
            }
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            this.memoizedSerializedSize = 0;
            return 0;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        }

        public static VoiceToneMessage parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (VoiceToneMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static VoiceToneMessage parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (VoiceToneMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        public static VoiceToneMessage parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoiceToneMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoiceToneMessage parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (VoiceToneMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static VoiceToneMessage parseFrom(InputStream inputStream) throws IOException {
            return (VoiceToneMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceToneMessage parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (VoiceToneMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static VoiceToneMessage parseFrom(C3430e c3430e) throws IOException {
            return (VoiceToneMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static VoiceToneMessage parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (VoiceToneMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }

    public static final class VoiceUserGuide extends GeneratedMessageLite<VoiceUserGuide, Builder> implements VoiceUserGuideOrBuilder {
        public static final int BGSTYLE_FIELD_NUMBER = 2;
        public static final int CONTENT_FIELD_NUMBER = 3;
        private static final VoiceUserGuide DEFAULT_INSTANCE;
        public static final int GUIDETYPE_FIELD_NUMBER = 6;
        public static final int ICON_FIELD_NUMBER = 1;
        private static volatile ng60<VoiceUserGuide> PARSER = null;
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
                this.bgStyle_ = BgStyle.newBuilder(this.bgStyle_).mergeFrom(bgStyle).buildPartial();
            }
        }

        public static Builder newBuilder(VoiceUserGuide voiceUserGuide) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(voiceUserGuide);
        }

        public static VoiceUserGuide parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VoiceUserGuide) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceUserGuide parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VoiceUserGuide) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<VoiceUserGuide> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBgStyle(BgStyle.Builder builder) {
            this.bgStyle_ = builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setContent(String str) {
            str.getClass();
            this.content_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setContentBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.schema_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setShowSeconds(long j) {
            this.showSeconds_ = j;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C46611.f16699xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoiceUserGuide();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    VoiceUserGuide voiceUserGuide = (VoiceUserGuide) obj2;
                    this.icon_ = interfaceC3409h.mo17052f(!this.icon_.isEmpty(), this.icon_, !voiceUserGuide.icon_.isEmpty(), voiceUserGuide.icon_);
                    this.bgStyle_ = (BgStyle) interfaceC3409h.mo17061o(this.bgStyle_, voiceUserGuide.bgStyle_);
                    this.content_ = interfaceC3409h.mo17052f(!this.content_.isEmpty(), this.content_, !voiceUserGuide.content_.isEmpty(), voiceUserGuide.content_);
                    this.schema_ = interfaceC3409h.mo17052f(!this.schema_.isEmpty(), this.schema_, !voiceUserGuide.schema_.isEmpty(), voiceUserGuide.schema_);
                    long j = this.showSeconds_;
                    boolean z2 = j != 0;
                    long j2 = voiceUserGuide.showSeconds_;
                    this.showSeconds_ = interfaceC3409h.mo17055i(z2, j, j2 != 0, j2);
                    this.guideType_ = interfaceC3409h.mo17052f(!this.guideType_.isEmpty(), this.guideType_, !voiceUserGuide.guideType_.isEmpty(), voiceUserGuide.guideType_);
                    GeneratedMessageLite.C3408g c3408g = GeneratedMessageLite.C3408g.INSTANCE;
                    return this;
                case 6:
                    C3430e c3430e = (C3430e) obj;
                    C3433h c3433h = (C3433h) obj2;
                    while (!z) {
                        try {
                            int iM17171M = c3430e.m17171M();
                            if (iM17171M != 0) {
                                if (iM17171M == 10) {
                                    this.icon_ = c3430e.m17170L();
                                } else if (iM17171M == 18) {
                                    BgStyle bgStyle = this.bgStyle_;
                                    BgStyle.Builder builder = bgStyle != null ? bgStyle.toBuilder() : null;
                                    BgStyle bgStyle2 = (BgStyle) c3430e.m17198w(BgStyle.parser(), c3433h);
                                    this.bgStyle_ = bgStyle2;
                                    if (builder != null) {
                                        builder.mergeFrom(bgStyle2);
                                        this.bgStyle_ = builder.buildPartial();
                                    }
                                } else if (iM17171M == 26) {
                                    this.content_ = c3430e.m17170L();
                                } else if (iM17171M == 34) {
                                    this.schema_ = c3430e.m17170L();
                                } else if (iM17171M == 40) {
                                    this.showSeconds_ = c3430e.m17197v();
                                } else if (iM17171M == 50) {
                                    this.guideType_ = c3430e.m17170L();
                                } else if (!c3430e.m17176R(iM17171M)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            iig0.m140070a(e.setUnfinishedMessage(this));
                            return null;
                        } catch (IOException e2) {
                            iig0.m140070a(new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this));
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
                                    PARSER = new GeneratedMessageLite.C3404c(DEFAULT_INSTANCE);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return PARSER;
                default:
                    l710.m153113a();
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

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16956K = !this.icon_.isEmpty() ? CodedOutputStream.m16956K(1, getIcon()) : 0;
            if (this.bgStyle_ != null) {
                iM16956K += CodedOutputStream.m16948C(2, getBgStyle());
            }
            if (!this.content_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(3, getContent());
            }
            if (!this.schema_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(4, getSchema());
            }
            long j = this.showSeconds_;
            if (j != 0) {
                iM16956K += CodedOutputStream.m16986v(5, j);
            }
            if (!this.guideType_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(6, getGuideType());
            }
            this.memoizedSerializedSize = iM16956K;
            return iM16956K;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceUserGuideOrBuilder
        public long getShowSeconds() {
            return this.showSeconds_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceUserGuideOrBuilder
        public boolean hasBgStyle() {
            return this.bgStyle_ != null;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.icon_.isEmpty()) {
                codedOutputStream.mo16994D0(1, getIcon());
            }
            if (this.bgStyle_ != null) {
                codedOutputStream.mo17029w0(2, getBgStyle());
            }
            if (!this.content_.isEmpty()) {
                codedOutputStream.mo16994D0(3, getContent());
            }
            if (!this.schema_.isEmpty()) {
                codedOutputStream.mo16994D0(4, getSchema());
            }
            long j = this.showSeconds_;
            if (j != 0) {
                codedOutputStream.m17027u0(5, j);
            }
            if (this.guideType_.isEmpty()) {
                return;
            }
            codedOutputStream.mo16994D0(6, getGuideType());
        }

        public static VoiceUserGuide parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (VoiceUserGuide) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static VoiceUserGuide parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (VoiceUserGuide) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBgStyle(BgStyle bgStyle) {
            bgStyle.getClass();
            this.bgStyle_ = bgStyle;
        }

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<VoiceUserGuide, Builder> implements VoiceUserGuideOrBuilder {
            private Builder() {
                super(VoiceUserGuide.DEFAULT_INSTANCE);
            }

            public Builder clearBgStyle() {
                copyOnWrite();
                ((VoiceUserGuide) this.instance).clearBgStyle();
                return this;
            }

            public Builder clearContent() {
                copyOnWrite();
                ((VoiceUserGuide) this.instance).clearContent();
                return this;
            }

            public Builder clearGuideType() {
                copyOnWrite();
                ((VoiceUserGuide) this.instance).clearGuideType();
                return this;
            }

            public Builder clearIcon() {
                copyOnWrite();
                ((VoiceUserGuide) this.instance).clearIcon();
                return this;
            }

            public Builder clearSchema() {
                copyOnWrite();
                ((VoiceUserGuide) this.instance).clearSchema();
                return this;
            }

            public Builder clearShowSeconds() {
                copyOnWrite();
                ((VoiceUserGuide) this.instance).clearShowSeconds();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceUserGuideOrBuilder
            public BgStyle getBgStyle() {
                return ((VoiceUserGuide) this.instance).getBgStyle();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceUserGuideOrBuilder
            public String getContent() {
                return ((VoiceUserGuide) this.instance).getContent();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceUserGuideOrBuilder
            public ByteString getContentBytes() {
                return ((VoiceUserGuide) this.instance).getContentBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceUserGuideOrBuilder
            public String getGuideType() {
                return ((VoiceUserGuide) this.instance).getGuideType();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceUserGuideOrBuilder
            public ByteString getGuideTypeBytes() {
                return ((VoiceUserGuide) this.instance).getGuideTypeBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceUserGuideOrBuilder
            public String getIcon() {
                return ((VoiceUserGuide) this.instance).getIcon();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceUserGuideOrBuilder
            public ByteString getIconBytes() {
                return ((VoiceUserGuide) this.instance).getIconBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceUserGuideOrBuilder
            public String getSchema() {
                return ((VoiceUserGuide) this.instance).getSchema();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceUserGuideOrBuilder
            public ByteString getSchemaBytes() {
                return ((VoiceUserGuide) this.instance).getSchemaBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceUserGuideOrBuilder
            public long getShowSeconds() {
                return ((VoiceUserGuide) this.instance).getShowSeconds();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice.VoiceUserGuideOrBuilder
            public boolean hasBgStyle() {
                return ((VoiceUserGuide) this.instance).hasBgStyle();
            }

            public Builder mergeBgStyle(BgStyle bgStyle) {
                copyOnWrite();
                ((VoiceUserGuide) this.instance).mergeBgStyle(bgStyle);
                return this;
            }

            public Builder setBgStyle(BgStyle bgStyle) {
                copyOnWrite();
                ((VoiceUserGuide) this.instance).setBgStyle(bgStyle);
                return this;
            }

            public Builder setContent(String str) {
                copyOnWrite();
                ((VoiceUserGuide) this.instance).setContent(str);
                return this;
            }

            public Builder setContentBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceUserGuide) this.instance).setContentBytes(byteString);
                return this;
            }

            public Builder setGuideType(String str) {
                copyOnWrite();
                ((VoiceUserGuide) this.instance).setGuideType(str);
                return this;
            }

            public Builder setGuideTypeBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceUserGuide) this.instance).setGuideTypeBytes(byteString);
                return this;
            }

            public Builder setIcon(String str) {
                copyOnWrite();
                ((VoiceUserGuide) this.instance).setIcon(str);
                return this;
            }

            public Builder setIconBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceUserGuide) this.instance).setIconBytes(byteString);
                return this;
            }

            public Builder setSchema(String str) {
                copyOnWrite();
                ((VoiceUserGuide) this.instance).setSchema(str);
                return this;
            }

            public Builder setSchemaBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceUserGuide) this.instance).setSchemaBytes(byteString);
                return this;
            }

            public Builder setShowSeconds(long j) {
                copyOnWrite();
                ((VoiceUserGuide) this.instance).setShowSeconds(j);
                return this;
            }

            public Builder setBgStyle(BgStyle.Builder builder) {
                copyOnWrite();
                ((VoiceUserGuide) this.instance).setBgStyle(builder);
                return this;
            }
        }

        public static VoiceUserGuide parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoiceUserGuide) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoiceUserGuide parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (VoiceUserGuide) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static VoiceUserGuide parseFrom(InputStream inputStream) throws IOException {
            return (VoiceUserGuide) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceUserGuide parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (VoiceUserGuide) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static VoiceUserGuide parseFrom(C3430e c3430e) throws IOException {
            return (VoiceUserGuide) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static VoiceUserGuide parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (VoiceUserGuide) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }
}
