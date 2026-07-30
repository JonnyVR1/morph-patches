package com.p003p1.mobile.longlink.msg.gift;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.a;
import com.google.protobuf.e;
import com.google.protobuf.h;
import com.google.protobuf.l;
import com.google.protobuf.q;
import com.p003p1.mobile.longlink.msg.livechat.LongLinkChatMessage;
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
public final class LongLinkGiftMessage {

    /* JADX INFO: renamed from: com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage$1 */
    public static /* synthetic */ class C03231 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f1639xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f1639xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1639xa1df5c61[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1639xa1df5c61[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1639xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1639xa1df5c61[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1639xa1df5c61[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1639xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f1639xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public interface ContentUpdateNoticeOrBuilder extends o6z {
        LongLinkUpdateAction getAction();

        int getActionValue();

        /* synthetic */ q getDefaultInstanceForType();

        LiveCampaignInfo getLiveCampaigns(int i);

        int getLiveCampaignsCount();

        List<LiveCampaignInfo> getLiveCampaignsList();

        LongLinkUpdatePosition getPosition();

        int getPositionValue();

        String getRoomId();

        ByteString getRoomIdBytes();

        /* synthetic */ boolean isInitialized();
    }

    public interface CurrentHourSuggestConfigOrBuilder extends o6z {
        /* synthetic */ q getDefaultInstanceForType();

        boolean getEnable();

        long getNodes(int i);

        int getNodesCount();

        List<Long> getNodesList();

        long getTarget();

        /* synthetic */ boolean isInitialized();
    }

    public interface DynamicEffectExtendOrBuilder extends o6z {
        /* synthetic */ q getDefaultInstanceForType();

        String getKey();

        ByteString getKeyBytes();

        String getValue(int i);

        ByteString getValueBytes(int i);

        int getValueCount();

        List<String> getValueList();

        /* synthetic */ boolean isInitialized();
    }

    public interface GiftFlyMicInfoOrBuilder extends o6z {
        /* synthetic */ q getDefaultInstanceForType();

        DynamicEffectExtend getDynamicEffectExtends(int i);

        int getDynamicEffectExtendsCount();

        List<DynamicEffectExtend> getDynamicEffectExtendsList();

        String getEndEffectIcon();

        ByteString getEndEffectIconBytes();

        String getReceiveUserId();

        ByteString getReceiveUserIdBytes();

        String getStartEffectIcon();

        ByteString getStartEffectIconBytes();

        /* synthetic */ boolean isInitialized();
    }

    public interface GiftItemBriefOrBuilder extends o6z {
        String getAvatarTag();

        ByteString getAvatarTagBytes();

        String getComboId();

        ByteString getComboIdBytes();

        long getCombos();

        /* synthetic */ q getDefaultInstanceForType();

        LiveGiftExtraInfo getExtraInfo();

        GiftFlyMicInfo getFlyMicInfo();

        String getGiftBottomTag();

        ByteString getGiftBottomTagBytes();

        long getGiftNum();

        long getGiftSource();

        String getGiftType();

        ByteString getGiftTypeBytes();

        long getId();

        boolean getIsGear();

        boolean getIsNamed();

        long getLotteryGiftId();

        long getLuckyPrizeGiftInfoItemId();

        long getStep();

        long getStickFacePositionType();

        long getThreshold();

        GiftItemBriefTray getTray();

        String getUserName();

        ByteString getUserNameBytes();

        String getUserUrl();

        ByteString getUserUrlBytes();

        String getVersion();

        ByteString getVersionBytes();

        boolean hasExtraInfo();

        boolean hasFlyMicInfo();

        boolean hasTray();

        /* synthetic */ boolean isInitialized();
    }

    public interface GiftItemBriefTrayOrBuilder extends o6z {
        String getBackground();

        ByteString getBackgroundBytes();

        /* synthetic */ q getDefaultInstanceForType();

        String getSvg();

        ByteString getSvgBytes();

        /* synthetic */ boolean isInitialized();
    }

    public interface GiftMultiCallOrBuilder extends o6z {
        String getCallId();

        ByteString getCallIdBytes();

        /* synthetic */ q getDefaultInstanceForType();

        GiftMultiCall.ReceiveGiftRole getReceiveGiftRole();

        boolean hasReceiveGiftRole();

        /* synthetic */ boolean isInitialized();
    }

    public interface GiftVideoChatInfoOrBuilder extends o6z {
        String getChatId();

        ByteString getChatIdBytes();

        /* synthetic */ q getDefaultInstanceForType();

        /* synthetic */ boolean isInitialized();
    }

    public interface HeadlineOrBuilder extends o6z {
        Headline.User getAnchor();

        Headline.User getAudience();

        /* synthetic */ q getDefaultInstanceForType();

        Headline.GiftRecord getGiftRecord();

        Headline.GiftRecord getGrabGiftRecords(int i);

        int getGrabGiftRecordsCount();

        List<Headline.GiftRecord> getGrabGiftRecordsList();

        long getLeftTime();

        Headline.LiveStatus getLiveStatus();

        long getPrice();

        Headline.Resource getResource();

        boolean getStatus();

        String getText();

        ByteString getTextBytes();

        long getVersion();

        boolean hasAnchor();

        boolean hasAudience();

        boolean hasGiftRecord();

        boolean hasLiveStatus();

        boolean hasResource();

        /* synthetic */ boolean isInitialized();
    }

    public interface LiveBreakingLeaderboardOrBuilder extends o6z {
        /* synthetic */ q getDefaultInstanceForType();

        long getFrom();

        String getLiveID();

        ByteString getLiveIDBytes();

        String getRoomID();

        ByteString getRoomIDBytes();

        TemplateData getTempdata();

        String getUserID();

        ByteString getUserIDBytes();

        boolean hasTempdata();

        /* synthetic */ boolean isInitialized();
    }

    public interface LiveCampaignInfoOrBuilder extends o6z {
        String getData();

        ByteString getDataBytes();

        /* synthetic */ q getDefaultInstanceForType();

        String getId();

        ByteString getIdBytes();

        long getPosition();

        String getSubscribeType();

        ByteString getSubscribeTypeBytes();

        LiveCampaignType getType();

        int getTypeValue();

        String getUpdateType();

        ByteString getUpdateTypeBytes();

        /* synthetic */ boolean isInitialized();
    }

    public interface LiveCoordinateOrBuilder extends o6z {
        /* synthetic */ q getDefaultInstanceForType();

        float getX();

        float getY();

        /* synthetic */ boolean isInitialized();
    }

    public interface LiveGiftDrawInfoOrBuilder extends o6z {
        LiveCoordinate getCoordinates(int i);

        int getCoordinatesCount();

        List<LiveCoordinate> getCoordinatesList();

        /* synthetic */ q getDefaultInstanceForType();

        float getLength();

        float getWidth();

        /* synthetic */ boolean isInitialized();
    }

    public interface LiveGiftExtraInfoOrBuilder extends o6z {
        /* synthetic */ q getDefaultInstanceForType();

        LiveGiftDrawInfo getDrawInfo();

        String getEffectExt();

        ByteString getEffectExtBytes();

        Mask getMask();

        boolean getMaskMode();

        userMaskConfig.UserMask getPreviewMask();

        userMaskConfig.UserMask getReceiverShowMask();

        userMaskConfig.UserMask getSenderShowMask();

        userMaskConfig.UserMask getUserMask();

        VideoEffectExtra getVideoEffectExtras(int i);

        int getVideoEffectExtrasCount();

        List<VideoEffectExtra> getVideoEffectExtrasList();

        boolean hasDrawInfo();

        boolean hasMask();

        boolean hasPreviewMask();

        boolean hasReceiverShowMask();

        boolean hasSenderShowMask();

        boolean hasUserMask();

        /* synthetic */ boolean isInitialized();
    }

    public interface LiveGiftMessageOrBuilder extends o6z {
        /* synthetic */ q getDefaultInstanceForType();

        String getRoomId();

        ByteString getRoomIdBytes();

        TemplateData getTempdata();

        boolean hasTempdata();

        /* synthetic */ boolean isInitialized();
    }

    public interface LiveGiftReceivedMsgOrBuilder extends o6z {
        String getAnchorId();

        ByteString getAnchorIdBytes();

        String getAnchorUserName();

        ByteString getAnchorUserNameBytes();

        /* synthetic */ q getDefaultInstanceForType();

        GiftItemBrief getGiftItemBrief();

        GiftMultiCall getGuildCall();

        String getId();

        ByteString getIdBytes();

        String getLiveId();

        ByteString getLiveIdBytes();

        GiftMultiCall getMultiCall();

        String getUserId();

        ByteString getUserIdBytes();

        GiftVideoChatInfo getVideoChat();

        boolean hasGiftItemBrief();

        boolean hasGuildCall();

        boolean hasMultiCall();

        boolean hasVideoChat();

        /* synthetic */ boolean isInitialized();
    }

    public interface LiveLeaderboardMessageOrBuilder extends o6z {
        /* synthetic */ q getDefaultInstanceForType();

        String getLiveId();

        ByteString getLiveIdBytes();

        /* synthetic */ boolean isInitialized();
    }

    public interface LiveRankingOrBuilder extends o6z {
        long getAmount();

        String getAnchorId();

        ByteString getAnchorIdBytes();

        String getContent();

        ByteString getContentBytes();

        /* synthetic */ q getDefaultInstanceForType();

        long getGap();

        String getLiveId();

        ByteString getLiveIdBytes();

        long getRank();

        String getRoomId();

        ByteString getRoomIdBytes();

        String getUserId();

        ByteString getUserIdBytes();

        String getUserImage();

        ByteString getUserImageBytes();

        LiveStateEnum getUserLiveState();

        int getUserLiveStateValue();

        userMaskConfig.UserMask getUserMask();

        String getUserName();

        ByteString getUserNameBytes();

        boolean hasUserMask();

        /* synthetic */ boolean isInitialized();
    }

    public interface LiveRankingsOrBuilder extends o6z {
        LiveRankingAction getAction();

        int getActionValue();

        CurrentHourSuggestConfig getCurrentHourSuggestConfig();

        /* synthetic */ q getDefaultInstanceForType();

        String getLiveId();

        ByteString getLiveIdBytes();

        LiveRankingMsgType getMsgType();

        int getMsgTypeValue();

        long getRankingTime();

        LiveRanking getRankings(int i);

        int getRankingsCount();

        List<LiveRanking> getRankingsList();

        String getRoomId();

        ByteString getRoomIdBytes();

        String getTitle();

        ByteString getTitleBytes();

        LiveRankingType getType();

        int getTypeValue();

        boolean hasCurrentHourSuggestConfig();

        /* synthetic */ boolean isInitialized();
    }

    public interface LuckyPrizeMsgOrBuilder extends o6z {
        /* synthetic */ q getDefaultInstanceForType();

        String getIconUrl();

        ByteString getIconUrlBytes();

        String getJumpRoomID();

        ByteString getJumpRoomIDBytes();

        String getLiveID();

        ByteString getLiveIDBytes();

        TemplateData getTemplate();

        boolean hasTemplate();

        /* synthetic */ boolean isInitialized();
    }

    public interface MaskOrBuilder extends o6z {
        String getColor();

        ByteString getColorBytes();

        /* synthetic */ q getDefaultInstanceForType();

        String getGender();

        ByteString getGenderBytes();

        String getIcon();

        ByteString getIconBytes();

        /* synthetic */ boolean isInitialized();
    }

    public interface PreHourLeaderboardsTopChatOrBuilder extends o6z {
        /* synthetic */ q getDefaultInstanceForType();

        String getRoomId();

        ByteString getRoomIdBytes();

        TemplateData getTempdata();

        String getTopLiveId();

        ByteString getTopLiveIdBytes();

        boolean hasTempdata();

        /* synthetic */ boolean isInitialized();
    }

    public interface SystemLiveCommentBackgroundOrBuilder extends o6z {
        String getBottomImgUrl();

        ByteString getBottomImgUrlBytes();

        String getCoverImgUrl();

        ByteString getCoverImgUrlBytes();

        /* synthetic */ q getDefaultInstanceForType();

        String getHeaderImgUrl();

        ByteString getHeaderImgUrlBytes();

        String getMiddleImgUrl();

        ByteString getMiddleImgUrlBytes();

        /* synthetic */ boolean isInitialized();
    }

    public interface SystemLiveCommentsMsgOrBuilder extends o6z {
        Alignment getAlignment();

        int getAlignmentValue();

        SystemLiveCommentBackground getBackground();

        /* synthetic */ q getDefaultInstanceForType();

        long getDisplayDuration();

        String getEndColor();

        ByteString getEndColorBytes();

        String getGotoSchema();

        ByteString getGotoSchemaBytes();

        String getIconUrl();

        ByteString getIconUrlBytes();

        String getId();

        ByteString getIdBytes();

        long getPriority();

        String getRoomID();

        ByteString getRoomIDBytes();

        String getStartColor();

        ByteString getStartColorBytes();

        TemplateData getTemplate();

        String getType();

        ByteString getTypeBytes();

        boolean hasBackground();

        boolean hasTemplate();

        /* synthetic */ boolean isInitialized();
    }

    public interface TemplateDataOrBuilder extends o6z {
        /* synthetic */ q getDefaultInstanceForType();

        String getFields(int i);

        ByteString getFieldsBytes(int i);

        int getFieldsCount();

        List<String> getFieldsList();

        int getId();

        /* synthetic */ boolean isInitialized();
    }

    public interface VideoChatDurationOrBuilder extends o6z {
        String getChatId();

        ByteString getChatIdBytes();

        /* synthetic */ q getDefaultInstanceForType();

        long getRemainingDurationSec();

        long getSinceSec();

        String getUserId();

        ByteString getUserIdBytes();

        /* synthetic */ boolean isInitialized();
    }

    public interface VideoEffectExtraOrBuilder extends o6z {
        /* synthetic */ q getDefaultInstanceForType();

        String getId();

        ByteString getIdBytes();

        long getType();

        String getValue();

        ByteString getValueBytes();

        /* synthetic */ boolean isInitialized();
    }

    private LongLinkGiftMessage() {
    }

    public static void registerAllExtensions(h hVar) {
    }

    public static final class GiftMultiCall extends GeneratedMessageLite<GiftMultiCall, Builder> implements GiftMultiCallOrBuilder {
        public static final int CALLID_FIELD_NUMBER = 1;
        private static final GiftMultiCall DEFAULT_INSTANCE;
        private static volatile i860<GiftMultiCall> PARSER = null;
        public static final int RECEIVEGIFTROLE_FIELD_NUMBER = 2;
        private String callId_ = "";
        private ReceiveGiftRole receiveGiftRole_;

        public interface ReceiveGiftRoleOrBuilder extends o6z {
            /* synthetic */ q getDefaultInstanceForType();

            String getName();

            ByteString getNameBytes();

            String getPosition();

            ByteString getPositionBytes();

            /* synthetic */ boolean isInitialized();
        }

        static {
            GiftMultiCall giftMultiCall = new GiftMultiCall();
            DEFAULT_INSTANCE = giftMultiCall;
            giftMultiCall.makeImmutable();
        }

        private GiftMultiCall() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCallId() {
            this.callId_ = getDefaultInstance().getCallId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearReceiveGiftRole() {
            this.receiveGiftRole_ = null;
        }

        public static GiftMultiCall getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeReceiveGiftRole(ReceiveGiftRole receiveGiftRole) {
            ReceiveGiftRole receiveGiftRole2 = this.receiveGiftRole_;
            if (receiveGiftRole2 == null || receiveGiftRole2 == ReceiveGiftRole.getDefaultInstance()) {
                this.receiveGiftRole_ = receiveGiftRole;
            } else {
                this.receiveGiftRole_ = (ReceiveGiftRole) ((ReceiveGiftRole.Builder) ReceiveGiftRole.newBuilder(this.receiveGiftRole_).mergeFrom(receiveGiftRole)).buildPartial();
            }
        }

        public static Builder newBuilder(GiftMultiCall giftMultiCall) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(giftMultiCall);
        }

        public static GiftMultiCall parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (GiftMultiCall) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GiftMultiCall parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (GiftMultiCall) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<GiftMultiCall> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCallId(String str) {
            str.getClass();
            this.callId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCallIdBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.callId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setReceiveGiftRole(ReceiveGiftRole.Builder builder) {
            this.receiveGiftRole_ = (ReceiveGiftRole) builder.build();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C03231.f1639xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new GiftMultiCall();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    GiftMultiCall giftMultiCall = (GiftMultiCall) obj2;
                    this.callId_ = hVar.f(!this.callId_.isEmpty(), this.callId_, true ^ giftMultiCall.callId_.isEmpty(), giftMultiCall.callId_);
                    this.receiveGiftRole_ = hVar.o(this.receiveGiftRole_, giftMultiCall.receiveGiftRole_);
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
                                    this.callId_ = eVar.L();
                                } else if (iM == 18) {
                                    ReceiveGiftRole receiveGiftRole = this.receiveGiftRole_;
                                    ReceiveGiftRole.Builder builder = receiveGiftRole != null ? (ReceiveGiftRole.Builder) receiveGiftRole.toBuilder() : null;
                                    ReceiveGiftRole receiveGiftRoleW = eVar.w(ReceiveGiftRole.parser(), hVar2);
                                    this.receiveGiftRole_ = receiveGiftRoleW;
                                    if (builder != null) {
                                        builder.mergeFrom(receiveGiftRoleW);
                                        this.receiveGiftRole_ = (ReceiveGiftRole) builder.buildPartial();
                                    }
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
                        synchronized (GiftMultiCall.class) {
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

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.GiftMultiCallOrBuilder
        public String getCallId() {
            return this.callId_;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.GiftMultiCallOrBuilder
        public ByteString getCallIdBytes() {
            return ByteString.copyFromUtf8(this.callId_);
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.GiftMultiCallOrBuilder
        public ReceiveGiftRole getReceiveGiftRole() {
            ReceiveGiftRole receiveGiftRole = this.receiveGiftRole_;
            return receiveGiftRole == null ? ReceiveGiftRole.getDefaultInstance() : receiveGiftRole;
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iK = !this.callId_.isEmpty() ? CodedOutputStream.K(1, getCallId()) : 0;
            if (this.receiveGiftRole_ != null) {
                iK += CodedOutputStream.C(2, getReceiveGiftRole());
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iK;
            return iK;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.GiftMultiCallOrBuilder
        public boolean hasReceiveGiftRole() {
            return this.receiveGiftRole_ != null;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.callId_.isEmpty()) {
                codedOutputStream.D0(1, getCallId());
            }
            if (this.receiveGiftRole_ != null) {
                codedOutputStream.w0(2, getReceiveGiftRole());
            }
        }

        public static final class ReceiveGiftRole extends GeneratedMessageLite<ReceiveGiftRole, Builder> implements ReceiveGiftRoleOrBuilder {
            private static final ReceiveGiftRole DEFAULT_INSTANCE;
            public static final int NAME_FIELD_NUMBER = 2;
            private static volatile i860<ReceiveGiftRole> PARSER = null;
            public static final int POSITION_FIELD_NUMBER = 1;
            private String position_ = "";
            private String name_ = "";

            public static final class Builder extends GeneratedMessageLite.b<ReceiveGiftRole, Builder> implements ReceiveGiftRoleOrBuilder {
                private Builder() {
                    super(ReceiveGiftRole.DEFAULT_INSTANCE);
                }

                public Builder clearName() {
                    copyOnWrite();
                    ((ReceiveGiftRole) ((GeneratedMessageLite.b) this).instance).clearName();
                    return this;
                }

                public Builder clearPosition() {
                    copyOnWrite();
                    ((ReceiveGiftRole) ((GeneratedMessageLite.b) this).instance).clearPosition();
                    return this;
                }

                @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.GiftMultiCall.ReceiveGiftRoleOrBuilder
                public String getName() {
                    return ((ReceiveGiftRole) ((GeneratedMessageLite.b) this).instance).getName();
                }

                @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.GiftMultiCall.ReceiveGiftRoleOrBuilder
                public ByteString getNameBytes() {
                    return ((ReceiveGiftRole) ((GeneratedMessageLite.b) this).instance).getNameBytes();
                }

                @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.GiftMultiCall.ReceiveGiftRoleOrBuilder
                public String getPosition() {
                    return ((ReceiveGiftRole) ((GeneratedMessageLite.b) this).instance).getPosition();
                }

                @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.GiftMultiCall.ReceiveGiftRoleOrBuilder
                public ByteString getPositionBytes() {
                    return ((ReceiveGiftRole) ((GeneratedMessageLite.b) this).instance).getPositionBytes();
                }

                public Builder setName(String str) {
                    copyOnWrite();
                    ((ReceiveGiftRole) ((GeneratedMessageLite.b) this).instance).setName(str);
                    return this;
                }

                public Builder setNameBytes(ByteString byteString) {
                    copyOnWrite();
                    ((ReceiveGiftRole) ((GeneratedMessageLite.b) this).instance).setNameBytes(byteString);
                    return this;
                }

                public Builder setPosition(String str) {
                    copyOnWrite();
                    ((ReceiveGiftRole) ((GeneratedMessageLite.b) this).instance).setPosition(str);
                    return this;
                }

                public Builder setPositionBytes(ByteString byteString) {
                    copyOnWrite();
                    ((ReceiveGiftRole) ((GeneratedMessageLite.b) this).instance).setPositionBytes(byteString);
                    return this;
                }
            }

            static {
                ReceiveGiftRole receiveGiftRole = new ReceiveGiftRole();
                DEFAULT_INSTANCE = receiveGiftRole;
                receiveGiftRole.makeImmutable();
            }

            private ReceiveGiftRole() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearName() {
                this.name_ = getDefaultInstance().getName();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearPosition() {
                this.position_ = getDefaultInstance().getPosition();
            }

            public static ReceiveGiftRole getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Builder newBuilder(ReceiveGiftRole receiveGiftRole) {
                return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(receiveGiftRole);
            }

            public static ReceiveGiftRole parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (ReceiveGiftRole) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static ReceiveGiftRole parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (ReceiveGiftRole) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static i860<ReceiveGiftRole> parser() {
                return DEFAULT_INSTANCE.getParserForType();
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
            public void setPosition(String str) {
                str.getClass();
                this.position_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setPositionBytes(ByteString byteString) {
                byteString.getClass();
                a.checkByteStringIsUtf8(byteString);
                this.position_ = byteString.toStringUtf8();
            }

            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (C03231.f1639xa1df5c61[methodToInvoke.ordinal()]) {
                    case 1:
                        return new ReceiveGiftRole();
                    case 2:
                        return DEFAULT_INSTANCE;
                    case 3:
                        return null;
                    case 4:
                        return new Builder();
                    case 5:
                        GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                        ReceiveGiftRole receiveGiftRole = (ReceiveGiftRole) obj2;
                        this.position_ = hVar.f(!this.position_.isEmpty(), this.position_, !receiveGiftRole.position_.isEmpty(), receiveGiftRole.position_);
                        this.name_ = hVar.f(!this.name_.isEmpty(), this.name_, true ^ receiveGiftRole.name_.isEmpty(), receiveGiftRole.name_);
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
                                        this.position_ = eVar.L();
                                    } else if (iM == 18) {
                                        this.name_ = eVar.L();
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
                            synchronized (ReceiveGiftRole.class) {
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

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.GiftMultiCall.ReceiveGiftRoleOrBuilder
            public String getName() {
                return this.name_;
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.GiftMultiCall.ReceiveGiftRoleOrBuilder
            public ByteString getNameBytes() {
                return ByteString.copyFromUtf8(this.name_);
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.GiftMultiCall.ReceiveGiftRoleOrBuilder
            public String getPosition() {
                return this.position_;
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.GiftMultiCall.ReceiveGiftRoleOrBuilder
            public ByteString getPositionBytes() {
                return ByteString.copyFromUtf8(this.position_);
            }

            public int getSerializedSize() {
                int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
                if (i != -1) {
                    return i;
                }
                int iK = !this.position_.isEmpty() ? CodedOutputStream.K(1, getPosition()) : 0;
                if (!this.name_.isEmpty()) {
                    iK += CodedOutputStream.K(2, getName());
                }
                ((GeneratedMessageLite) this).memoizedSerializedSize = iK;
                return iK;
            }

            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                if (!this.position_.isEmpty()) {
                    codedOutputStream.D0(1, getPosition());
                }
                if (this.name_.isEmpty()) {
                    return;
                }
                codedOutputStream.D0(2, getName());
            }

            public static ReceiveGiftRole parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
                return (ReceiveGiftRole) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
            }

            public static ReceiveGiftRole parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
                return (ReceiveGiftRole) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
            }

            public static ReceiveGiftRole parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (ReceiveGiftRole) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static ReceiveGiftRole parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
                return (ReceiveGiftRole) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
            }

            public static ReceiveGiftRole parseFrom(InputStream inputStream) throws IOException {
                return (ReceiveGiftRole) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static ReceiveGiftRole parseFrom(InputStream inputStream, h hVar) throws IOException {
                return (ReceiveGiftRole) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
            }

            public static ReceiveGiftRole parseFrom(e eVar) throws IOException {
                return (ReceiveGiftRole) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
            }

            public static Builder newBuilder() {
                return (Builder) DEFAULT_INSTANCE.toBuilder();
            }

            public static ReceiveGiftRole parseFrom(e eVar, h hVar) throws IOException {
                return (ReceiveGiftRole) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
            }
        }

        public static GiftMultiCall parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (GiftMultiCall) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static GiftMultiCall parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (GiftMultiCall) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setReceiveGiftRole(ReceiveGiftRole receiveGiftRole) {
            receiveGiftRole.getClass();
            this.receiveGiftRole_ = receiveGiftRole;
        }

        public static final class Builder extends GeneratedMessageLite.b<GiftMultiCall, Builder> implements GiftMultiCallOrBuilder {
            private Builder() {
                super(GiftMultiCall.DEFAULT_INSTANCE);
            }

            public Builder clearCallId() {
                copyOnWrite();
                ((GiftMultiCall) ((GeneratedMessageLite.b) this).instance).clearCallId();
                return this;
            }

            public Builder clearReceiveGiftRole() {
                copyOnWrite();
                ((GiftMultiCall) ((GeneratedMessageLite.b) this).instance).clearReceiveGiftRole();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.GiftMultiCallOrBuilder
            public String getCallId() {
                return ((GiftMultiCall) ((GeneratedMessageLite.b) this).instance).getCallId();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.GiftMultiCallOrBuilder
            public ByteString getCallIdBytes() {
                return ((GiftMultiCall) ((GeneratedMessageLite.b) this).instance).getCallIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.GiftMultiCallOrBuilder
            public ReceiveGiftRole getReceiveGiftRole() {
                return ((GiftMultiCall) ((GeneratedMessageLite.b) this).instance).getReceiveGiftRole();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.GiftMultiCallOrBuilder
            public boolean hasReceiveGiftRole() {
                return ((GiftMultiCall) ((GeneratedMessageLite.b) this).instance).hasReceiveGiftRole();
            }

            public Builder mergeReceiveGiftRole(ReceiveGiftRole receiveGiftRole) {
                copyOnWrite();
                ((GiftMultiCall) ((GeneratedMessageLite.b) this).instance).mergeReceiveGiftRole(receiveGiftRole);
                return this;
            }

            public Builder setCallId(String str) {
                copyOnWrite();
                ((GiftMultiCall) ((GeneratedMessageLite.b) this).instance).setCallId(str);
                return this;
            }

            public Builder setCallIdBytes(ByteString byteString) {
                copyOnWrite();
                ((GiftMultiCall) ((GeneratedMessageLite.b) this).instance).setCallIdBytes(byteString);
                return this;
            }

            public Builder setReceiveGiftRole(ReceiveGiftRole receiveGiftRole) {
                copyOnWrite();
                ((GiftMultiCall) ((GeneratedMessageLite.b) this).instance).setReceiveGiftRole(receiveGiftRole);
                return this;
            }

            public Builder setReceiveGiftRole(ReceiveGiftRole.Builder builder) {
                copyOnWrite();
                ((GiftMultiCall) ((GeneratedMessageLite.b) this).instance).setReceiveGiftRole(builder);
                return this;
            }
        }

        public static GiftMultiCall parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (GiftMultiCall) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static GiftMultiCall parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (GiftMultiCall) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static GiftMultiCall parseFrom(InputStream inputStream) throws IOException {
            return (GiftMultiCall) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GiftMultiCall parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (GiftMultiCall) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static GiftMultiCall parseFrom(e eVar) throws IOException {
            return (GiftMultiCall) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static GiftMultiCall parseFrom(e eVar, h hVar) throws IOException {
            return (GiftMultiCall) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public static final class Headline extends GeneratedMessageLite<Headline, Builder> implements HeadlineOrBuilder {
        public static final int ANCHOR_FIELD_NUMBER = 1;
        public static final int AUDIENCE_FIELD_NUMBER = 2;
        private static final Headline DEFAULT_INSTANCE;
        public static final int GIFTRECORD_FIELD_NUMBER = 9;
        public static final int GRABGIFTRECORDS_FIELD_NUMBER = 10;
        public static final int LEFTTIME_FIELD_NUMBER = 5;
        public static final int LIVESTATUS_FIELD_NUMBER = 8;
        private static volatile i860<Headline> PARSER = null;
        public static final int PRICE_FIELD_NUMBER = 11;
        public static final int RESOURCE_FIELD_NUMBER = 3;
        public static final int STATUS_FIELD_NUMBER = 6;
        public static final int TEXT_FIELD_NUMBER = 7;
        public static final int VERSION_FIELD_NUMBER = 4;
        private User anchor_;
        private User audience_;
        private int bitField0_;
        private GiftRecord giftRecord_;
        private long leftTime_;
        private LiveStatus liveStatus_;
        private long price_;
        private Resource resource_;
        private boolean status_;
        private long version_;
        private String text_ = "";
        private l.h<GiftRecord> grabGiftRecords_ = GeneratedMessageLite.emptyProtobufList();

        public interface GiftRecordOrBuilder extends o6z {
            /* synthetic */ q getDefaultInstanceForType();

            long getGiftID();

            long getGiftNum();

            /* synthetic */ boolean isInitialized();
        }

        public interface LiveStatusOrBuilder extends o6z {
            long getAudienceCnt();

            String getAvatars(int i);

            ByteString getAvatarsBytes(int i);

            int getAvatarsCount();

            List<String> getAvatarsList();

            /* synthetic */ q getDefaultInstanceForType();

            /* synthetic */ boolean isInitialized();
        }

        public interface ResourceOrBuilder extends o6z {
            /* synthetic */ q getDefaultInstanceForType();

            long getId();

            long getVersion();

            /* synthetic */ boolean isInitialized();
        }

        public interface UserOrBuilder extends o6z {
            String getAvatar();

            ByteString getAvatarBytes();

            /* synthetic */ q getDefaultInstanceForType();

            long getId();

            String getLiveID();

            ByteString getLiveIDBytes();

            String getRoomID();

            ByteString getRoomIDBytes();

            /* synthetic */ boolean isInitialized();
        }

        static {
            Headline headline = new Headline();
            DEFAULT_INSTANCE = headline;
            headline.makeImmutable();
        }

        private Headline() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllGrabGiftRecords(Iterable<? extends GiftRecord> iterable) {
            ensureGrabGiftRecordsIsMutable();
            a.addAll(iterable, this.grabGiftRecords_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addGrabGiftRecords(GiftRecord.Builder builder) {
            ensureGrabGiftRecordsIsMutable();
            this.grabGiftRecords_.add((GiftRecord) builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAnchor() {
            this.anchor_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAudience() {
            this.audience_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGiftRecord() {
            this.giftRecord_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGrabGiftRecords() {
            this.grabGiftRecords_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLeftTime() {
            this.leftTime_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLiveStatus() {
            this.liveStatus_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPrice() {
            this.price_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearResource() {
            this.resource_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStatus() {
            this.status_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearText() {
            this.text_ = getDefaultInstance().getText();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVersion() {
            this.version_ = 0L;
        }

        private void ensureGrabGiftRecordsIsMutable() {
            if (this.grabGiftRecords_.q()) {
                return;
            }
            this.grabGiftRecords_ = GeneratedMessageLite.mutableCopy(this.grabGiftRecords_);
        }

        public static Headline getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeAnchor(User user) {
            User user2 = this.anchor_;
            if (user2 == null || user2 == User.getDefaultInstance()) {
                this.anchor_ = user;
            } else {
                this.anchor_ = (User) ((User.Builder) User.newBuilder(this.anchor_).mergeFrom(user)).buildPartial();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeAudience(User user) {
            User user2 = this.audience_;
            if (user2 == null || user2 == User.getDefaultInstance()) {
                this.audience_ = user;
            } else {
                this.audience_ = (User) ((User.Builder) User.newBuilder(this.audience_).mergeFrom(user)).buildPartial();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeGiftRecord(GiftRecord giftRecord) {
            GiftRecord giftRecord2 = this.giftRecord_;
            if (giftRecord2 == null || giftRecord2 == GiftRecord.getDefaultInstance()) {
                this.giftRecord_ = giftRecord;
            } else {
                this.giftRecord_ = (GiftRecord) ((GiftRecord.Builder) GiftRecord.newBuilder(this.giftRecord_).mergeFrom(giftRecord)).buildPartial();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeLiveStatus(LiveStatus liveStatus) {
            LiveStatus liveStatus2 = this.liveStatus_;
            if (liveStatus2 == null || liveStatus2 == LiveStatus.getDefaultInstance()) {
                this.liveStatus_ = liveStatus;
            } else {
                this.liveStatus_ = (LiveStatus) ((LiveStatus.Builder) LiveStatus.newBuilder(this.liveStatus_).mergeFrom(liveStatus)).buildPartial();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeResource(Resource resource) {
            Resource resource2 = this.resource_;
            if (resource2 == null || resource2 == Resource.getDefaultInstance()) {
                this.resource_ = resource;
            } else {
                this.resource_ = (Resource) ((Resource.Builder) Resource.newBuilder(this.resource_).mergeFrom(resource)).buildPartial();
            }
        }

        public static Builder newBuilder(Headline headline) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(headline);
        }

        public static Headline parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Headline) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Headline parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Headline) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<Headline> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeGrabGiftRecords(int i) {
            ensureGrabGiftRecordsIsMutable();
            this.grabGiftRecords_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAnchor(User.Builder builder) {
            this.anchor_ = (User) builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAudience(User.Builder builder) {
            this.audience_ = (User) builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGiftRecord(GiftRecord.Builder builder) {
            this.giftRecord_ = (GiftRecord) builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGrabGiftRecords(int i, GiftRecord.Builder builder) {
            ensureGrabGiftRecordsIsMutable();
            this.grabGiftRecords_.set(i, (GiftRecord) builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLeftTime(long j) {
            this.leftTime_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLiveStatus(LiveStatus.Builder builder) {
            this.liveStatus_ = (LiveStatus) builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPrice(long j) {
            this.price_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setResource(Resource.Builder builder) {
            this.resource_ = (Resource) builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStatus(boolean z) {
            this.status_ = z;
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
        public void setVersion(long j) {
            this.version_ = j;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C03231.f1639xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new Headline();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.grabGiftRecords_.n();
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.g gVar = (GeneratedMessageLite.h) obj;
                    Headline headline = (Headline) obj2;
                    this.anchor_ = gVar.o(this.anchor_, headline.anchor_);
                    this.audience_ = gVar.o(this.audience_, headline.audience_);
                    this.resource_ = gVar.o(this.resource_, headline.resource_);
                    long j = this.version_;
                    boolean z2 = j != 0;
                    long j2 = headline.version_;
                    this.version_ = gVar.i(z2, j, j2 != 0, j2);
                    long j3 = this.leftTime_;
                    boolean z3 = j3 != 0;
                    long j4 = headline.leftTime_;
                    this.leftTime_ = gVar.i(z3, j3, j4 != 0, j4);
                    boolean z4 = this.status_;
                    boolean z5 = headline.status_;
                    this.status_ = gVar.d(z4, z4, z5, z5);
                    this.text_ = gVar.f(!this.text_.isEmpty(), this.text_, !headline.text_.isEmpty(), headline.text_);
                    this.liveStatus_ = gVar.o(this.liveStatus_, headline.liveStatus_);
                    this.giftRecord_ = gVar.o(this.giftRecord_, headline.giftRecord_);
                    this.grabGiftRecords_ = gVar.g(this.grabGiftRecords_, headline.grabGiftRecords_);
                    boolean z6 = false;
                    long j5 = this.price_;
                    if (j5 != 0) {
                        z6 = true;
                    }
                    long j6 = headline.price_;
                    this.price_ = gVar.i(z6, j5, j6 != 0, j6);
                    if (gVar == GeneratedMessageLite.g.INSTANCE) {
                        this.bitField0_ |= headline.bitField0_;
                    }
                    return this;
                case 6:
                    e eVar = (e) obj;
                    h hVar = (h) obj2;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            switch (iM) {
                                case 0:
                                    break;
                                case 10:
                                    User user = this.anchor_;
                                    User.Builder builder = user != null ? (User.Builder) user.toBuilder() : null;
                                    User userW = eVar.w(User.parser(), hVar);
                                    this.anchor_ = userW;
                                    if (builder != null) {
                                        builder.mergeFrom(userW);
                                        this.anchor_ = (User) builder.buildPartial();
                                    } else {
                                        continue;
                                    }
                                    break;
                                case 18:
                                    User user2 = this.audience_;
                                    User.Builder builder2 = user2 != null ? (User.Builder) user2.toBuilder() : null;
                                    User userW2 = eVar.w(User.parser(), hVar);
                                    this.audience_ = userW2;
                                    if (builder2 != null) {
                                        builder2.mergeFrom(userW2);
                                        this.audience_ = (User) builder2.buildPartial();
                                    } else {
                                        continue;
                                    }
                                    break;
                                case 26:
                                    Resource resource = this.resource_;
                                    Resource.Builder builder3 = resource != null ? (Resource.Builder) resource.toBuilder() : null;
                                    Resource resourceW = eVar.w(Resource.parser(), hVar);
                                    this.resource_ = resourceW;
                                    if (builder3 != null) {
                                        builder3.mergeFrom(resourceW);
                                        this.resource_ = (Resource) builder3.buildPartial();
                                    } else {
                                        continue;
                                    }
                                    break;
                                case LongLinkChatMessage.LiveChatMessage.SOURCE_FIELD_NUMBER /* 32 */:
                                    this.version_ = eVar.v();
                                    continue;
                                case 40:
                                    this.leftTime_ = eVar.v();
                                    continue;
                                case 48:
                                    this.status_ = eVar.m();
                                    continue;
                                case 58:
                                    this.text_ = eVar.L();
                                    continue;
                                case 66:
                                    LiveStatus liveStatus = this.liveStatus_;
                                    LiveStatus.Builder builder4 = liveStatus != null ? (LiveStatus.Builder) liveStatus.toBuilder() : null;
                                    LiveStatus liveStatusW = eVar.w(LiveStatus.parser(), hVar);
                                    this.liveStatus_ = liveStatusW;
                                    if (builder4 != null) {
                                        builder4.mergeFrom(liveStatusW);
                                        this.liveStatus_ = (LiveStatus) builder4.buildPartial();
                                    } else {
                                        continue;
                                    }
                                    break;
                                case 74:
                                    GiftRecord giftRecord = this.giftRecord_;
                                    GiftRecord.Builder builder5 = giftRecord != null ? (GiftRecord.Builder) giftRecord.toBuilder() : null;
                                    GiftRecord giftRecordW = eVar.w(GiftRecord.parser(), hVar);
                                    this.giftRecord_ = giftRecordW;
                                    if (builder5 != null) {
                                        builder5.mergeFrom(giftRecordW);
                                        this.giftRecord_ = (GiftRecord) builder5.buildPartial();
                                    } else {
                                        continue;
                                    }
                                    break;
                                case 82:
                                    if (!this.grabGiftRecords_.q()) {
                                        this.grabGiftRecords_ = GeneratedMessageLite.mutableCopy(this.grabGiftRecords_);
                                    }
                                    this.grabGiftRecords_.add(eVar.w(GiftRecord.parser(), hVar));
                                    continue;
                                case 88:
                                    this.price_ = eVar.v();
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
                        synchronized (Headline.class) {
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

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.HeadlineOrBuilder
        public User getAnchor() {
            User user = this.anchor_;
            return user == null ? User.getDefaultInstance() : user;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.HeadlineOrBuilder
        public User getAudience() {
            User user = this.audience_;
            return user == null ? User.getDefaultInstance() : user;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.HeadlineOrBuilder
        public GiftRecord getGiftRecord() {
            GiftRecord giftRecord = this.giftRecord_;
            return giftRecord == null ? GiftRecord.getDefaultInstance() : giftRecord;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.HeadlineOrBuilder
        public GiftRecord getGrabGiftRecords(int i) {
            return (GiftRecord) this.grabGiftRecords_.get(i);
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.HeadlineOrBuilder
        public int getGrabGiftRecordsCount() {
            return this.grabGiftRecords_.size();
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.HeadlineOrBuilder
        public List<GiftRecord> getGrabGiftRecordsList() {
            return this.grabGiftRecords_;
        }

        public GiftRecordOrBuilder getGrabGiftRecordsOrBuilder(int i) {
            return (GiftRecordOrBuilder) this.grabGiftRecords_.get(i);
        }

        public List<? extends GiftRecordOrBuilder> getGrabGiftRecordsOrBuilderList() {
            return this.grabGiftRecords_;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.HeadlineOrBuilder
        public long getLeftTime() {
            return this.leftTime_;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.HeadlineOrBuilder
        public LiveStatus getLiveStatus() {
            LiveStatus liveStatus = this.liveStatus_;
            return liveStatus == null ? LiveStatus.getDefaultInstance() : liveStatus;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.HeadlineOrBuilder
        public long getPrice() {
            return this.price_;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.HeadlineOrBuilder
        public Resource getResource() {
            Resource resource = this.resource_;
            return resource == null ? Resource.getDefaultInstance() : resource;
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iC = this.anchor_ != null ? CodedOutputStream.C(1, getAnchor()) : 0;
            if (this.audience_ != null) {
                iC += CodedOutputStream.C(2, getAudience());
            }
            if (this.resource_ != null) {
                iC += CodedOutputStream.C(3, getResource());
            }
            long j = this.version_;
            if (j != 0) {
                iC += CodedOutputStream.v(4, j);
            }
            long j2 = this.leftTime_;
            if (j2 != 0) {
                iC += CodedOutputStream.v(5, j2);
            }
            boolean z = this.status_;
            if (z) {
                iC += CodedOutputStream.f(6, z);
            }
            if (!this.text_.isEmpty()) {
                iC += CodedOutputStream.K(7, getText());
            }
            if (this.liveStatus_ != null) {
                iC += CodedOutputStream.C(8, getLiveStatus());
            }
            if (this.giftRecord_ != null) {
                iC += CodedOutputStream.C(9, getGiftRecord());
            }
            for (int i2 = 0; i2 < this.grabGiftRecords_.size(); i2++) {
                iC += CodedOutputStream.C(10, (q) this.grabGiftRecords_.get(i2));
            }
            long j3 = this.price_;
            if (j3 != 0) {
                iC += CodedOutputStream.v(11, j3);
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iC;
            return iC;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.HeadlineOrBuilder
        public boolean getStatus() {
            return this.status_;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.HeadlineOrBuilder
        public String getText() {
            return this.text_;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.HeadlineOrBuilder
        public ByteString getTextBytes() {
            return ByteString.copyFromUtf8(this.text_);
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.HeadlineOrBuilder
        public long getVersion() {
            return this.version_;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.HeadlineOrBuilder
        public boolean hasAnchor() {
            return this.anchor_ != null;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.HeadlineOrBuilder
        public boolean hasAudience() {
            return this.audience_ != null;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.HeadlineOrBuilder
        public boolean hasGiftRecord() {
            return this.giftRecord_ != null;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.HeadlineOrBuilder
        public boolean hasLiveStatus() {
            return this.liveStatus_ != null;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.HeadlineOrBuilder
        public boolean hasResource() {
            return this.resource_ != null;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.anchor_ != null) {
                codedOutputStream.w0(1, getAnchor());
            }
            if (this.audience_ != null) {
                codedOutputStream.w0(2, getAudience());
            }
            if (this.resource_ != null) {
                codedOutputStream.w0(3, getResource());
            }
            long j = this.version_;
            if (j != 0) {
                codedOutputStream.u0(4, j);
            }
            long j2 = this.leftTime_;
            if (j2 != 0) {
                codedOutputStream.u0(5, j2);
            }
            boolean z = this.status_;
            if (z) {
                codedOutputStream.a0(6, z);
            }
            if (!this.text_.isEmpty()) {
                codedOutputStream.D0(7, getText());
            }
            if (this.liveStatus_ != null) {
                codedOutputStream.w0(8, getLiveStatus());
            }
            if (this.giftRecord_ != null) {
                codedOutputStream.w0(9, getGiftRecord());
            }
            for (int i = 0; i < this.grabGiftRecords_.size(); i++) {
                codedOutputStream.w0(10, (q) this.grabGiftRecords_.get(i));
            }
            long j3 = this.price_;
            if (j3 != 0) {
                codedOutputStream.u0(11, j3);
            }
        }

        public static final class GiftRecord extends GeneratedMessageLite<GiftRecord, Builder> implements GiftRecordOrBuilder {
            private static final GiftRecord DEFAULT_INSTANCE;
            public static final int GIFTID_FIELD_NUMBER = 1;
            public static final int GIFTNUM_FIELD_NUMBER = 2;
            private static volatile i860<GiftRecord> PARSER;
            private long giftID_;
            private long giftNum_;

            public static final class Builder extends GeneratedMessageLite.b<GiftRecord, Builder> implements GiftRecordOrBuilder {
                private Builder() {
                    super(GiftRecord.DEFAULT_INSTANCE);
                }

                public Builder clearGiftID() {
                    copyOnWrite();
                    ((GiftRecord) ((GeneratedMessageLite.b) this).instance).clearGiftID();
                    return this;
                }

                public Builder clearGiftNum() {
                    copyOnWrite();
                    ((GiftRecord) ((GeneratedMessageLite.b) this).instance).clearGiftNum();
                    return this;
                }

                @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.Headline.GiftRecordOrBuilder
                public long getGiftID() {
                    return ((GiftRecord) ((GeneratedMessageLite.b) this).instance).getGiftID();
                }

                @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.Headline.GiftRecordOrBuilder
                public long getGiftNum() {
                    return ((GiftRecord) ((GeneratedMessageLite.b) this).instance).getGiftNum();
                }

                public Builder setGiftID(long j) {
                    copyOnWrite();
                    ((GiftRecord) ((GeneratedMessageLite.b) this).instance).setGiftID(j);
                    return this;
                }

                public Builder setGiftNum(long j) {
                    copyOnWrite();
                    ((GiftRecord) ((GeneratedMessageLite.b) this).instance).setGiftNum(j);
                    return this;
                }
            }

            static {
                GiftRecord giftRecord = new GiftRecord();
                DEFAULT_INSTANCE = giftRecord;
                giftRecord.makeImmutable();
            }

            private GiftRecord() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearGiftID() {
                this.giftID_ = 0L;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearGiftNum() {
                this.giftNum_ = 0L;
            }

            public static GiftRecord getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Builder newBuilder(GiftRecord giftRecord) {
                return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(giftRecord);
            }

            public static GiftRecord parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (GiftRecord) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static GiftRecord parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (GiftRecord) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static i860<GiftRecord> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setGiftID(long j) {
                this.giftID_ = j;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setGiftNum(long j) {
                this.giftNum_ = j;
            }

            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                boolean z = false;
                switch (C03231.f1639xa1df5c61[methodToInvoke.ordinal()]) {
                    case 1:
                        return new GiftRecord();
                    case 2:
                        return DEFAULT_INSTANCE;
                    case 3:
                        return null;
                    case 4:
                        return new Builder();
                    case 5:
                        GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                        GiftRecord giftRecord = (GiftRecord) obj2;
                        long j = this.giftID_;
                        boolean z2 = j != 0;
                        long j2 = giftRecord.giftID_;
                        this.giftID_ = hVar.i(z2, j, j2 != 0, j2);
                        boolean z3 = false;
                        long j3 = this.giftNum_;
                        if (j3 != 0) {
                            z3 = true;
                        }
                        long j4 = giftRecord.giftNum_;
                        this.giftNum_ = hVar.i(z3, j3, j4 != 0, j4);
                        GeneratedMessageLite.g gVar = GeneratedMessageLite.g.INSTANCE;
                        return this;
                    case 6:
                        e eVar = (e) obj;
                        while (!z) {
                            try {
                                int iM = eVar.M();
                                if (iM != 0) {
                                    if (iM == 8) {
                                        this.giftID_ = eVar.v();
                                    } else if (iM == 16) {
                                        this.giftNum_ = eVar.v();
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
                            synchronized (GiftRecord.class) {
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

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.Headline.GiftRecordOrBuilder
            public long getGiftID() {
                return this.giftID_;
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.Headline.GiftRecordOrBuilder
            public long getGiftNum() {
                return this.giftNum_;
            }

            public int getSerializedSize() {
                int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
                if (i != -1) {
                    return i;
                }
                long j = this.giftID_;
                int iV = j != 0 ? CodedOutputStream.v(1, j) : 0;
                long j2 = this.giftNum_;
                if (j2 != 0) {
                    iV += CodedOutputStream.v(2, j2);
                }
                ((GeneratedMessageLite) this).memoizedSerializedSize = iV;
                return iV;
            }

            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                long j = this.giftID_;
                if (j != 0) {
                    codedOutputStream.u0(1, j);
                }
                long j2 = this.giftNum_;
                if (j2 != 0) {
                    codedOutputStream.u0(2, j2);
                }
            }

            public static GiftRecord parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
                return (GiftRecord) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
            }

            public static GiftRecord parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
                return (GiftRecord) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
            }

            public static GiftRecord parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (GiftRecord) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static GiftRecord parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
                return (GiftRecord) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
            }

            public static GiftRecord parseFrom(InputStream inputStream) throws IOException {
                return (GiftRecord) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static GiftRecord parseFrom(InputStream inputStream, h hVar) throws IOException {
                return (GiftRecord) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
            }

            public static GiftRecord parseFrom(e eVar) throws IOException {
                return (GiftRecord) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
            }

            public static Builder newBuilder() {
                return (Builder) DEFAULT_INSTANCE.toBuilder();
            }

            public static GiftRecord parseFrom(e eVar, h hVar) throws IOException {
                return (GiftRecord) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
            }
        }

        public static final class LiveStatus extends GeneratedMessageLite<LiveStatus, Builder> implements LiveStatusOrBuilder {
            public static final int AUDIENCECNT_FIELD_NUMBER = 1;
            public static final int AVATARS_FIELD_NUMBER = 2;
            private static final LiveStatus DEFAULT_INSTANCE;
            private static volatile i860<LiveStatus> PARSER;
            private long audienceCnt_;
            private l.h<String> avatars_ = GeneratedMessageLite.emptyProtobufList();
            private int bitField0_;

            public static final class Builder extends GeneratedMessageLite.b<LiveStatus, Builder> implements LiveStatusOrBuilder {
                private Builder() {
                    super(LiveStatus.DEFAULT_INSTANCE);
                }

                public Builder addAllAvatars(Iterable<String> iterable) {
                    copyOnWrite();
                    ((LiveStatus) ((GeneratedMessageLite.b) this).instance).addAllAvatars(iterable);
                    return this;
                }

                public Builder addAvatars(String str) {
                    copyOnWrite();
                    ((LiveStatus) ((GeneratedMessageLite.b) this).instance).addAvatars(str);
                    return this;
                }

                public Builder addAvatarsBytes(ByteString byteString) {
                    copyOnWrite();
                    ((LiveStatus) ((GeneratedMessageLite.b) this).instance).addAvatarsBytes(byteString);
                    return this;
                }

                public Builder clearAudienceCnt() {
                    copyOnWrite();
                    ((LiveStatus) ((GeneratedMessageLite.b) this).instance).clearAudienceCnt();
                    return this;
                }

                public Builder clearAvatars() {
                    copyOnWrite();
                    ((LiveStatus) ((GeneratedMessageLite.b) this).instance).clearAvatars();
                    return this;
                }

                @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.Headline.LiveStatusOrBuilder
                public long getAudienceCnt() {
                    return ((LiveStatus) ((GeneratedMessageLite.b) this).instance).getAudienceCnt();
                }

                @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.Headline.LiveStatusOrBuilder
                public String getAvatars(int i) {
                    return ((LiveStatus) ((GeneratedMessageLite.b) this).instance).getAvatars(i);
                }

                @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.Headline.LiveStatusOrBuilder
                public ByteString getAvatarsBytes(int i) {
                    return ((LiveStatus) ((GeneratedMessageLite.b) this).instance).getAvatarsBytes(i);
                }

                @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.Headline.LiveStatusOrBuilder
                public int getAvatarsCount() {
                    return ((LiveStatus) ((GeneratedMessageLite.b) this).instance).getAvatarsCount();
                }

                @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.Headline.LiveStatusOrBuilder
                public List<String> getAvatarsList() {
                    return Collections.unmodifiableList(((LiveStatus) ((GeneratedMessageLite.b) this).instance).getAvatarsList());
                }

                public Builder setAudienceCnt(long j) {
                    copyOnWrite();
                    ((LiveStatus) ((GeneratedMessageLite.b) this).instance).setAudienceCnt(j);
                    return this;
                }

                public Builder setAvatars(int i, String str) {
                    copyOnWrite();
                    ((LiveStatus) ((GeneratedMessageLite.b) this).instance).setAvatars(i, str);
                    return this;
                }
            }

            static {
                LiveStatus liveStatus = new LiveStatus();
                DEFAULT_INSTANCE = liveStatus;
                liveStatus.makeImmutable();
            }

            private LiveStatus() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addAllAvatars(Iterable<String> iterable) {
                ensureAvatarsIsMutable();
                a.addAll(iterable, this.avatars_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addAvatars(String str) {
                str.getClass();
                ensureAvatarsIsMutable();
                this.avatars_.add(str);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addAvatarsBytes(ByteString byteString) {
                byteString.getClass();
                a.checkByteStringIsUtf8(byteString);
                ensureAvatarsIsMutable();
                this.avatars_.add(byteString.toStringUtf8());
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearAudienceCnt() {
                this.audienceCnt_ = 0L;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearAvatars() {
                this.avatars_ = GeneratedMessageLite.emptyProtobufList();
            }

            private void ensureAvatarsIsMutable() {
                if (this.avatars_.q()) {
                    return;
                }
                this.avatars_ = GeneratedMessageLite.mutableCopy(this.avatars_);
            }

            public static LiveStatus getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Builder newBuilder(LiveStatus liveStatus) {
                return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(liveStatus);
            }

            public static LiveStatus parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (LiveStatus) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static LiveStatus parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (LiveStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static i860<LiveStatus> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setAudienceCnt(long j) {
                this.audienceCnt_ = j;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setAvatars(int i, String str) {
                str.getClass();
                ensureAvatarsIsMutable();
                this.avatars_.set(i, str);
            }

            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                boolean z = false;
                switch (C03231.f1639xa1df5c61[methodToInvoke.ordinal()]) {
                    case 1:
                        return new LiveStatus();
                    case 2:
                        return DEFAULT_INSTANCE;
                    case 3:
                        this.avatars_.n();
                        return null;
                    case 4:
                        return new Builder();
                    case 5:
                        GeneratedMessageLite.g gVar = (GeneratedMessageLite.h) obj;
                        LiveStatus liveStatus = (LiveStatus) obj2;
                        long j = this.audienceCnt_;
                        boolean z2 = j != 0;
                        long j2 = liveStatus.audienceCnt_;
                        this.audienceCnt_ = gVar.i(z2, j, j2 != 0, j2);
                        this.avatars_ = gVar.g(this.avatars_, liveStatus.avatars_);
                        if (gVar == GeneratedMessageLite.g.INSTANCE) {
                            this.bitField0_ |= liveStatus.bitField0_;
                        }
                        return this;
                    case 6:
                        e eVar = (e) obj;
                        while (!z) {
                            try {
                                int iM = eVar.M();
                                if (iM != 0) {
                                    if (iM == 8) {
                                        this.audienceCnt_ = eVar.v();
                                    } else if (iM == 18) {
                                        String strL = eVar.L();
                                        if (!this.avatars_.q()) {
                                            this.avatars_ = GeneratedMessageLite.mutableCopy(this.avatars_);
                                        }
                                        this.avatars_.add(strL);
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
                            synchronized (LiveStatus.class) {
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

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.Headline.LiveStatusOrBuilder
            public long getAudienceCnt() {
                return this.audienceCnt_;
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.Headline.LiveStatusOrBuilder
            public String getAvatars(int i) {
                return (String) this.avatars_.get(i);
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.Headline.LiveStatusOrBuilder
            public ByteString getAvatarsBytes(int i) {
                return ByteString.copyFromUtf8((String) this.avatars_.get(i));
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.Headline.LiveStatusOrBuilder
            public int getAvatarsCount() {
                return this.avatars_.size();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.Headline.LiveStatusOrBuilder
            public List<String> getAvatarsList() {
                return this.avatars_;
            }

            public int getSerializedSize() {
                int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
                if (i != -1) {
                    return i;
                }
                long j = this.audienceCnt_;
                int iV = j != 0 ? CodedOutputStream.v(1, j) : 0;
                int iL = 0;
                for (int i2 = 0; i2 < this.avatars_.size(); i2++) {
                    iL += CodedOutputStream.L((String) this.avatars_.get(i2));
                }
                int size = iV + iL + getAvatarsList().size();
                ((GeneratedMessageLite) this).memoizedSerializedSize = size;
                return size;
            }

            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                long j = this.audienceCnt_;
                if (j != 0) {
                    codedOutputStream.u0(1, j);
                }
                for (int i = 0; i < this.avatars_.size(); i++) {
                    codedOutputStream.D0(2, (String) this.avatars_.get(i));
                }
            }

            public static LiveStatus parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
                return (LiveStatus) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
            }

            public static LiveStatus parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
                return (LiveStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
            }

            public static LiveStatus parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (LiveStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static LiveStatus parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
                return (LiveStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
            }

            public static LiveStatus parseFrom(InputStream inputStream) throws IOException {
                return (LiveStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static LiveStatus parseFrom(InputStream inputStream, h hVar) throws IOException {
                return (LiveStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
            }

            public static LiveStatus parseFrom(e eVar) throws IOException {
                return (LiveStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
            }

            public static Builder newBuilder() {
                return (Builder) DEFAULT_INSTANCE.toBuilder();
            }

            public static LiveStatus parseFrom(e eVar, h hVar) throws IOException {
                return (LiveStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
            }
        }

        public static final class Resource extends GeneratedMessageLite<Resource, Builder> implements ResourceOrBuilder {
            private static final Resource DEFAULT_INSTANCE;
            public static final int ID_FIELD_NUMBER = 2;
            private static volatile i860<Resource> PARSER = null;
            public static final int VERSION_FIELD_NUMBER = 1;
            private long id_;
            private long version_;

            public static final class Builder extends GeneratedMessageLite.b<Resource, Builder> implements ResourceOrBuilder {
                private Builder() {
                    super(Resource.DEFAULT_INSTANCE);
                }

                public Builder clearId() {
                    copyOnWrite();
                    ((Resource) ((GeneratedMessageLite.b) this).instance).clearId();
                    return this;
                }

                public Builder clearVersion() {
                    copyOnWrite();
                    ((Resource) ((GeneratedMessageLite.b) this).instance).clearVersion();
                    return this;
                }

                @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.Headline.ResourceOrBuilder
                public long getId() {
                    return ((Resource) ((GeneratedMessageLite.b) this).instance).getId();
                }

                @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.Headline.ResourceOrBuilder
                public long getVersion() {
                    return ((Resource) ((GeneratedMessageLite.b) this).instance).getVersion();
                }

                public Builder setId(long j) {
                    copyOnWrite();
                    ((Resource) ((GeneratedMessageLite.b) this).instance).setId(j);
                    return this;
                }

                public Builder setVersion(long j) {
                    copyOnWrite();
                    ((Resource) ((GeneratedMessageLite.b) this).instance).setVersion(j);
                    return this;
                }
            }

            static {
                Resource resource = new Resource();
                DEFAULT_INSTANCE = resource;
                resource.makeImmutable();
            }

            private Resource() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearId() {
                this.id_ = 0L;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearVersion() {
                this.version_ = 0L;
            }

            public static Resource getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Builder newBuilder(Resource resource) {
                return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(resource);
            }

            public static Resource parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Resource) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Resource parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (Resource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static i860<Resource> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setId(long j) {
                this.id_ = j;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setVersion(long j) {
                this.version_ = j;
            }

            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                boolean z = false;
                switch (C03231.f1639xa1df5c61[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Resource();
                    case 2:
                        return DEFAULT_INSTANCE;
                    case 3:
                        return null;
                    case 4:
                        return new Builder();
                    case 5:
                        GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                        Resource resource = (Resource) obj2;
                        long j = this.version_;
                        boolean z2 = j != 0;
                        long j2 = resource.version_;
                        this.version_ = hVar.i(z2, j, j2 != 0, j2);
                        boolean z3 = false;
                        long j3 = this.id_;
                        if (j3 != 0) {
                            z3 = true;
                        }
                        long j4 = resource.id_;
                        this.id_ = hVar.i(z3, j3, j4 != 0, j4);
                        GeneratedMessageLite.g gVar = GeneratedMessageLite.g.INSTANCE;
                        return this;
                    case 6:
                        e eVar = (e) obj;
                        while (!z) {
                            try {
                                int iM = eVar.M();
                                if (iM != 0) {
                                    if (iM == 8) {
                                        this.version_ = eVar.v();
                                    } else if (iM == 16) {
                                        this.id_ = eVar.v();
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
                            synchronized (Resource.class) {
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

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.Headline.ResourceOrBuilder
            public long getId() {
                return this.id_;
            }

            public int getSerializedSize() {
                int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
                if (i != -1) {
                    return i;
                }
                long j = this.version_;
                int iV = j != 0 ? CodedOutputStream.v(1, j) : 0;
                long j2 = this.id_;
                if (j2 != 0) {
                    iV += CodedOutputStream.v(2, j2);
                }
                ((GeneratedMessageLite) this).memoizedSerializedSize = iV;
                return iV;
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.Headline.ResourceOrBuilder
            public long getVersion() {
                return this.version_;
            }

            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                long j = this.version_;
                if (j != 0) {
                    codedOutputStream.u0(1, j);
                }
                long j2 = this.id_;
                if (j2 != 0) {
                    codedOutputStream.u0(2, j2);
                }
            }

            public static Resource parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
                return (Resource) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
            }

            public static Resource parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
                return (Resource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
            }

            public static Resource parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (Resource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static Resource parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
                return (Resource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
            }

            public static Resource parseFrom(InputStream inputStream) throws IOException {
                return (Resource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Resource parseFrom(InputStream inputStream, h hVar) throws IOException {
                return (Resource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
            }

            public static Resource parseFrom(e eVar) throws IOException {
                return (Resource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
            }

            public static Builder newBuilder() {
                return (Builder) DEFAULT_INSTANCE.toBuilder();
            }

            public static Resource parseFrom(e eVar, h hVar) throws IOException {
                return (Resource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
            }
        }

        public static final class User extends GeneratedMessageLite<User, Builder> implements UserOrBuilder {
            public static final int AVATAR_FIELD_NUMBER = 2;
            private static final User DEFAULT_INSTANCE;
            public static final int ID_FIELD_NUMBER = 1;
            public static final int LIVEID_FIELD_NUMBER = 4;
            private static volatile i860<User> PARSER = null;
            public static final int ROOMID_FIELD_NUMBER = 3;
            private long id_;
            private String avatar_ = "";
            private String roomID_ = "";
            private String liveID_ = "";

            public static final class Builder extends GeneratedMessageLite.b<User, Builder> implements UserOrBuilder {
                private Builder() {
                    super(User.DEFAULT_INSTANCE);
                }

                public Builder clearAvatar() {
                    copyOnWrite();
                    ((User) ((GeneratedMessageLite.b) this).instance).clearAvatar();
                    return this;
                }

                public Builder clearId() {
                    copyOnWrite();
                    ((User) ((GeneratedMessageLite.b) this).instance).clearId();
                    return this;
                }

                public Builder clearLiveID() {
                    copyOnWrite();
                    ((User) ((GeneratedMessageLite.b) this).instance).clearLiveID();
                    return this;
                }

                public Builder clearRoomID() {
                    copyOnWrite();
                    ((User) ((GeneratedMessageLite.b) this).instance).clearRoomID();
                    return this;
                }

                @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.Headline.UserOrBuilder
                public String getAvatar() {
                    return ((User) ((GeneratedMessageLite.b) this).instance).getAvatar();
                }

                @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.Headline.UserOrBuilder
                public ByteString getAvatarBytes() {
                    return ((User) ((GeneratedMessageLite.b) this).instance).getAvatarBytes();
                }

                @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.Headline.UserOrBuilder
                public long getId() {
                    return ((User) ((GeneratedMessageLite.b) this).instance).getId();
                }

                @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.Headline.UserOrBuilder
                public String getLiveID() {
                    return ((User) ((GeneratedMessageLite.b) this).instance).getLiveID();
                }

                @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.Headline.UserOrBuilder
                public ByteString getLiveIDBytes() {
                    return ((User) ((GeneratedMessageLite.b) this).instance).getLiveIDBytes();
                }

                @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.Headline.UserOrBuilder
                public String getRoomID() {
                    return ((User) ((GeneratedMessageLite.b) this).instance).getRoomID();
                }

                @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.Headline.UserOrBuilder
                public ByteString getRoomIDBytes() {
                    return ((User) ((GeneratedMessageLite.b) this).instance).getRoomIDBytes();
                }

                public Builder setAvatar(String str) {
                    copyOnWrite();
                    ((User) ((GeneratedMessageLite.b) this).instance).setAvatar(str);
                    return this;
                }

                public Builder setAvatarBytes(ByteString byteString) {
                    copyOnWrite();
                    ((User) ((GeneratedMessageLite.b) this).instance).setAvatarBytes(byteString);
                    return this;
                }

                public Builder setId(long j) {
                    copyOnWrite();
                    ((User) ((GeneratedMessageLite.b) this).instance).setId(j);
                    return this;
                }

                public Builder setLiveID(String str) {
                    copyOnWrite();
                    ((User) ((GeneratedMessageLite.b) this).instance).setLiveID(str);
                    return this;
                }

                public Builder setLiveIDBytes(ByteString byteString) {
                    copyOnWrite();
                    ((User) ((GeneratedMessageLite.b) this).instance).setLiveIDBytes(byteString);
                    return this;
                }

                public Builder setRoomID(String str) {
                    copyOnWrite();
                    ((User) ((GeneratedMessageLite.b) this).instance).setRoomID(str);
                    return this;
                }

                public Builder setRoomIDBytes(ByteString byteString) {
                    copyOnWrite();
                    ((User) ((GeneratedMessageLite.b) this).instance).setRoomIDBytes(byteString);
                    return this;
                }
            }

            static {
                User user = new User();
                DEFAULT_INSTANCE = user;
                user.makeImmutable();
            }

            private User() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearAvatar() {
                this.avatar_ = getDefaultInstance().getAvatar();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearId() {
                this.id_ = 0L;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearLiveID() {
                this.liveID_ = getDefaultInstance().getLiveID();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearRoomID() {
                this.roomID_ = getDefaultInstance().getRoomID();
            }

            public static User getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Builder newBuilder(User user) {
                return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(user);
            }

            public static User parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (User) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static User parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (User) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static i860<User> parser() {
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
            public void setId(long j) {
                this.id_ = j;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setLiveID(String str) {
                str.getClass();
                this.liveID_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setLiveIDBytes(ByteString byteString) {
                byteString.getClass();
                a.checkByteStringIsUtf8(byteString);
                this.liveID_ = byteString.toStringUtf8();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setRoomID(String str) {
                str.getClass();
                this.roomID_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setRoomIDBytes(ByteString byteString) {
                byteString.getClass();
                a.checkByteStringIsUtf8(byteString);
                this.roomID_ = byteString.toStringUtf8();
            }

            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                boolean z = false;
                switch (C03231.f1639xa1df5c61[methodToInvoke.ordinal()]) {
                    case 1:
                        return new User();
                    case 2:
                        return DEFAULT_INSTANCE;
                    case 3:
                        return null;
                    case 4:
                        return new Builder();
                    case 5:
                        GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                        User user = (User) obj2;
                        long j = this.id_;
                        boolean z2 = j != 0;
                        long j2 = user.id_;
                        this.id_ = hVar.i(z2, j, j2 != 0, j2);
                        this.avatar_ = hVar.f(!this.avatar_.isEmpty(), this.avatar_, !user.avatar_.isEmpty(), user.avatar_);
                        this.roomID_ = hVar.f(!this.roomID_.isEmpty(), this.roomID_, !user.roomID_.isEmpty(), user.roomID_);
                        this.liveID_ = hVar.f(!this.liveID_.isEmpty(), this.liveID_, !user.liveID_.isEmpty(), user.liveID_);
                        GeneratedMessageLite.g gVar = GeneratedMessageLite.g.INSTANCE;
                        return this;
                    case 6:
                        e eVar = (e) obj;
                        while (!z) {
                            try {
                                int iM = eVar.M();
                                if (iM != 0) {
                                    if (iM == 8) {
                                        this.id_ = eVar.v();
                                    } else if (iM == 18) {
                                        this.avatar_ = eVar.L();
                                    } else if (iM == 26) {
                                        this.roomID_ = eVar.L();
                                    } else if (iM == 34) {
                                        this.liveID_ = eVar.L();
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
                            synchronized (User.class) {
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

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.Headline.UserOrBuilder
            public String getAvatar() {
                return this.avatar_;
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.Headline.UserOrBuilder
            public ByteString getAvatarBytes() {
                return ByteString.copyFromUtf8(this.avatar_);
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.Headline.UserOrBuilder
            public long getId() {
                return this.id_;
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.Headline.UserOrBuilder
            public String getLiveID() {
                return this.liveID_;
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.Headline.UserOrBuilder
            public ByteString getLiveIDBytes() {
                return ByteString.copyFromUtf8(this.liveID_);
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.Headline.UserOrBuilder
            public String getRoomID() {
                return this.roomID_;
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.Headline.UserOrBuilder
            public ByteString getRoomIDBytes() {
                return ByteString.copyFromUtf8(this.roomID_);
            }

            public int getSerializedSize() {
                int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
                if (i != -1) {
                    return i;
                }
                long j = this.id_;
                int iV = j != 0 ? CodedOutputStream.v(1, j) : 0;
                if (!this.avatar_.isEmpty()) {
                    iV += CodedOutputStream.K(2, getAvatar());
                }
                if (!this.roomID_.isEmpty()) {
                    iV += CodedOutputStream.K(3, getRoomID());
                }
                if (!this.liveID_.isEmpty()) {
                    iV += CodedOutputStream.K(4, getLiveID());
                }
                ((GeneratedMessageLite) this).memoizedSerializedSize = iV;
                return iV;
            }

            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                long j = this.id_;
                if (j != 0) {
                    codedOutputStream.u0(1, j);
                }
                if (!this.avatar_.isEmpty()) {
                    codedOutputStream.D0(2, getAvatar());
                }
                if (!this.roomID_.isEmpty()) {
                    codedOutputStream.D0(3, getRoomID());
                }
                if (this.liveID_.isEmpty()) {
                    return;
                }
                codedOutputStream.D0(4, getLiveID());
            }

            public static User parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
                return (User) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
            }

            public static User parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
                return (User) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
            }

            public static User parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (User) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static User parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
                return (User) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
            }

            public static User parseFrom(InputStream inputStream) throws IOException {
                return (User) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static User parseFrom(InputStream inputStream, h hVar) throws IOException {
                return (User) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
            }

            public static User parseFrom(e eVar) throws IOException {
                return (User) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
            }

            public static Builder newBuilder() {
                return (Builder) DEFAULT_INSTANCE.toBuilder();
            }

            public static User parseFrom(e eVar, h hVar) throws IOException {
                return (User) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
            }
        }

        public static Headline parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (Headline) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static Headline parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (Headline) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAnchor(User user) {
            user.getClass();
            this.anchor_ = user;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAudience(User user) {
            user.getClass();
            this.audience_ = user;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGiftRecord(GiftRecord giftRecord) {
            giftRecord.getClass();
            this.giftRecord_ = giftRecord;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLiveStatus(LiveStatus liveStatus) {
            liveStatus.getClass();
            this.liveStatus_ = liveStatus;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setResource(Resource resource) {
            resource.getClass();
            this.resource_ = resource;
        }

        public static final class Builder extends GeneratedMessageLite.b<Headline, Builder> implements HeadlineOrBuilder {
            private Builder() {
                super(Headline.DEFAULT_INSTANCE);
            }

            public Builder addAllGrabGiftRecords(Iterable<? extends GiftRecord> iterable) {
                copyOnWrite();
                ((Headline) ((GeneratedMessageLite.b) this).instance).addAllGrabGiftRecords(iterable);
                return this;
            }

            public Builder addGrabGiftRecords(GiftRecord giftRecord) {
                copyOnWrite();
                ((Headline) ((GeneratedMessageLite.b) this).instance).addGrabGiftRecords(giftRecord);
                return this;
            }

            public Builder clearAnchor() {
                copyOnWrite();
                ((Headline) ((GeneratedMessageLite.b) this).instance).clearAnchor();
                return this;
            }

            public Builder clearAudience() {
                copyOnWrite();
                ((Headline) ((GeneratedMessageLite.b) this).instance).clearAudience();
                return this;
            }

            public Builder clearGiftRecord() {
                copyOnWrite();
                ((Headline) ((GeneratedMessageLite.b) this).instance).clearGiftRecord();
                return this;
            }

            public Builder clearGrabGiftRecords() {
                copyOnWrite();
                ((Headline) ((GeneratedMessageLite.b) this).instance).clearGrabGiftRecords();
                return this;
            }

            public Builder clearLeftTime() {
                copyOnWrite();
                ((Headline) ((GeneratedMessageLite.b) this).instance).clearLeftTime();
                return this;
            }

            public Builder clearLiveStatus() {
                copyOnWrite();
                ((Headline) ((GeneratedMessageLite.b) this).instance).clearLiveStatus();
                return this;
            }

            public Builder clearPrice() {
                copyOnWrite();
                ((Headline) ((GeneratedMessageLite.b) this).instance).clearPrice();
                return this;
            }

            public Builder clearResource() {
                copyOnWrite();
                ((Headline) ((GeneratedMessageLite.b) this).instance).clearResource();
                return this;
            }

            public Builder clearStatus() {
                copyOnWrite();
                ((Headline) ((GeneratedMessageLite.b) this).instance).clearStatus();
                return this;
            }

            public Builder clearText() {
                copyOnWrite();
                ((Headline) ((GeneratedMessageLite.b) this).instance).clearText();
                return this;
            }

            public Builder clearVersion() {
                copyOnWrite();
                ((Headline) ((GeneratedMessageLite.b) this).instance).clearVersion();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.HeadlineOrBuilder
            public User getAnchor() {
                return ((Headline) ((GeneratedMessageLite.b) this).instance).getAnchor();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.HeadlineOrBuilder
            public User getAudience() {
                return ((Headline) ((GeneratedMessageLite.b) this).instance).getAudience();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.HeadlineOrBuilder
            public GiftRecord getGiftRecord() {
                return ((Headline) ((GeneratedMessageLite.b) this).instance).getGiftRecord();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.HeadlineOrBuilder
            public GiftRecord getGrabGiftRecords(int i) {
                return ((Headline) ((GeneratedMessageLite.b) this).instance).getGrabGiftRecords(i);
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.HeadlineOrBuilder
            public int getGrabGiftRecordsCount() {
                return ((Headline) ((GeneratedMessageLite.b) this).instance).getGrabGiftRecordsCount();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.HeadlineOrBuilder
            public List<GiftRecord> getGrabGiftRecordsList() {
                return Collections.unmodifiableList(((Headline) ((GeneratedMessageLite.b) this).instance).getGrabGiftRecordsList());
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.HeadlineOrBuilder
            public long getLeftTime() {
                return ((Headline) ((GeneratedMessageLite.b) this).instance).getLeftTime();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.HeadlineOrBuilder
            public LiveStatus getLiveStatus() {
                return ((Headline) ((GeneratedMessageLite.b) this).instance).getLiveStatus();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.HeadlineOrBuilder
            public long getPrice() {
                return ((Headline) ((GeneratedMessageLite.b) this).instance).getPrice();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.HeadlineOrBuilder
            public Resource getResource() {
                return ((Headline) ((GeneratedMessageLite.b) this).instance).getResource();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.HeadlineOrBuilder
            public boolean getStatus() {
                return ((Headline) ((GeneratedMessageLite.b) this).instance).getStatus();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.HeadlineOrBuilder
            public String getText() {
                return ((Headline) ((GeneratedMessageLite.b) this).instance).getText();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.HeadlineOrBuilder
            public ByteString getTextBytes() {
                return ((Headline) ((GeneratedMessageLite.b) this).instance).getTextBytes();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.HeadlineOrBuilder
            public long getVersion() {
                return ((Headline) ((GeneratedMessageLite.b) this).instance).getVersion();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.HeadlineOrBuilder
            public boolean hasAnchor() {
                return ((Headline) ((GeneratedMessageLite.b) this).instance).hasAnchor();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.HeadlineOrBuilder
            public boolean hasAudience() {
                return ((Headline) ((GeneratedMessageLite.b) this).instance).hasAudience();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.HeadlineOrBuilder
            public boolean hasGiftRecord() {
                return ((Headline) ((GeneratedMessageLite.b) this).instance).hasGiftRecord();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.HeadlineOrBuilder
            public boolean hasLiveStatus() {
                return ((Headline) ((GeneratedMessageLite.b) this).instance).hasLiveStatus();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.HeadlineOrBuilder
            public boolean hasResource() {
                return ((Headline) ((GeneratedMessageLite.b) this).instance).hasResource();
            }

            public Builder mergeAnchor(User user) {
                copyOnWrite();
                ((Headline) ((GeneratedMessageLite.b) this).instance).mergeAnchor(user);
                return this;
            }

            public Builder mergeAudience(User user) {
                copyOnWrite();
                ((Headline) ((GeneratedMessageLite.b) this).instance).mergeAudience(user);
                return this;
            }

            public Builder mergeGiftRecord(GiftRecord giftRecord) {
                copyOnWrite();
                ((Headline) ((GeneratedMessageLite.b) this).instance).mergeGiftRecord(giftRecord);
                return this;
            }

            public Builder mergeLiveStatus(LiveStatus liveStatus) {
                copyOnWrite();
                ((Headline) ((GeneratedMessageLite.b) this).instance).mergeLiveStatus(liveStatus);
                return this;
            }

            public Builder mergeResource(Resource resource) {
                copyOnWrite();
                ((Headline) ((GeneratedMessageLite.b) this).instance).mergeResource(resource);
                return this;
            }

            public Builder removeGrabGiftRecords(int i) {
                copyOnWrite();
                ((Headline) ((GeneratedMessageLite.b) this).instance).removeGrabGiftRecords(i);
                return this;
            }

            public Builder setAnchor(User user) {
                copyOnWrite();
                ((Headline) ((GeneratedMessageLite.b) this).instance).setAnchor(user);
                return this;
            }

            public Builder setAudience(User user) {
                copyOnWrite();
                ((Headline) ((GeneratedMessageLite.b) this).instance).setAudience(user);
                return this;
            }

            public Builder setGiftRecord(GiftRecord giftRecord) {
                copyOnWrite();
                ((Headline) ((GeneratedMessageLite.b) this).instance).setGiftRecord(giftRecord);
                return this;
            }

            public Builder setGrabGiftRecords(int i, GiftRecord giftRecord) {
                copyOnWrite();
                ((Headline) ((GeneratedMessageLite.b) this).instance).setGrabGiftRecords(i, giftRecord);
                return this;
            }

            public Builder setLeftTime(long j) {
                copyOnWrite();
                ((Headline) ((GeneratedMessageLite.b) this).instance).setLeftTime(j);
                return this;
            }

            public Builder setLiveStatus(LiveStatus liveStatus) {
                copyOnWrite();
                ((Headline) ((GeneratedMessageLite.b) this).instance).setLiveStatus(liveStatus);
                return this;
            }

            public Builder setPrice(long j) {
                copyOnWrite();
                ((Headline) ((GeneratedMessageLite.b) this).instance).setPrice(j);
                return this;
            }

            public Builder setResource(Resource resource) {
                copyOnWrite();
                ((Headline) ((GeneratedMessageLite.b) this).instance).setResource(resource);
                return this;
            }

            public Builder setStatus(boolean z) {
                copyOnWrite();
                ((Headline) ((GeneratedMessageLite.b) this).instance).setStatus(z);
                return this;
            }

            public Builder setText(String str) {
                copyOnWrite();
                ((Headline) ((GeneratedMessageLite.b) this).instance).setText(str);
                return this;
            }

            public Builder setTextBytes(ByteString byteString) {
                copyOnWrite();
                ((Headline) ((GeneratedMessageLite.b) this).instance).setTextBytes(byteString);
                return this;
            }

            public Builder setVersion(long j) {
                copyOnWrite();
                ((Headline) ((GeneratedMessageLite.b) this).instance).setVersion(j);
                return this;
            }

            public Builder addGrabGiftRecords(int i, GiftRecord giftRecord) {
                copyOnWrite();
                ((Headline) ((GeneratedMessageLite.b) this).instance).addGrabGiftRecords(i, giftRecord);
                return this;
            }

            public Builder setAnchor(User.Builder builder) {
                copyOnWrite();
                ((Headline) ((GeneratedMessageLite.b) this).instance).setAnchor(builder);
                return this;
            }

            public Builder setAudience(User.Builder builder) {
                copyOnWrite();
                ((Headline) ((GeneratedMessageLite.b) this).instance).setAudience(builder);
                return this;
            }

            public Builder setGiftRecord(GiftRecord.Builder builder) {
                copyOnWrite();
                ((Headline) ((GeneratedMessageLite.b) this).instance).setGiftRecord(builder);
                return this;
            }

            public Builder setGrabGiftRecords(int i, GiftRecord.Builder builder) {
                copyOnWrite();
                ((Headline) ((GeneratedMessageLite.b) this).instance).setGrabGiftRecords(i, builder);
                return this;
            }

            public Builder setLiveStatus(LiveStatus.Builder builder) {
                copyOnWrite();
                ((Headline) ((GeneratedMessageLite.b) this).instance).setLiveStatus(builder);
                return this;
            }

            public Builder setResource(Resource.Builder builder) {
                copyOnWrite();
                ((Headline) ((GeneratedMessageLite.b) this).instance).setResource(builder);
                return this;
            }

            public Builder addGrabGiftRecords(GiftRecord.Builder builder) {
                copyOnWrite();
                ((Headline) ((GeneratedMessageLite.b) this).instance).addGrabGiftRecords(builder);
                return this;
            }

            public Builder addGrabGiftRecords(int i, GiftRecord.Builder builder) {
                copyOnWrite();
                ((Headline) ((GeneratedMessageLite.b) this).instance).addGrabGiftRecords(i, builder);
                return this;
            }
        }

        public static Headline parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Headline) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Headline parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (Headline) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static Headline parseFrom(InputStream inputStream) throws IOException {
            return (Headline) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Headline parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (Headline) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static Headline parseFrom(e eVar) throws IOException {
            return (Headline) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addGrabGiftRecords(int i, GiftRecord giftRecord) {
            giftRecord.getClass();
            ensureGrabGiftRecordsIsMutable();
            this.grabGiftRecords_.add(i, giftRecord);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static Headline parseFrom(e eVar, h hVar) throws IOException {
            return (Headline) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGrabGiftRecords(int i, GiftRecord giftRecord) {
            giftRecord.getClass();
            ensureGrabGiftRecordsIsMutable();
            this.grabGiftRecords_.set(i, giftRecord);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addGrabGiftRecords(GiftRecord giftRecord) {
            giftRecord.getClass();
            ensureGrabGiftRecordsIsMutable();
            this.grabGiftRecords_.add(giftRecord);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addGrabGiftRecords(int i, GiftRecord.Builder builder) {
            ensureGrabGiftRecordsIsMutable();
            this.grabGiftRecords_.add(i, (GiftRecord) builder.build());
        }
    }

    public enum Alignment implements l.c {
        Center(0),
        Left(1),
        UNRECOGNIZED(-1);

        public static final int Center_VALUE = 0;
        public static final int Left_VALUE = 1;
        private static final l.d<Alignment> internalValueMap = new l.d<Alignment>() { // from class: com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.Alignment.1
            public Alignment findValueByNumber(int i) {
                return Alignment.forNumber(i);
            }
        };
        private final int value;

        Alignment(int i) {
            this.value = i;
        }

        public static Alignment forNumber(int i) {
            if (i == 0) {
                return Center;
            }
            if (i != 1) {
                return null;
            }
            return Left;
        }

        public static l.d<Alignment> internalGetValueMap() {
            return internalValueMap;
        }

        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static Alignment valueOf(int i) {
            return forNumber(i);
        }
    }

    public static final class ContentUpdateNotice extends GeneratedMessageLite<ContentUpdateNotice, Builder> implements ContentUpdateNoticeOrBuilder {
        public static final int ACTION_FIELD_NUMBER = 1;
        private static final ContentUpdateNotice DEFAULT_INSTANCE;
        public static final int LIVECAMPAIGNS_FIELD_NUMBER = 4;
        private static volatile i860<ContentUpdateNotice> PARSER = null;
        public static final int POSITION_FIELD_NUMBER = 2;
        public static final int ROOMID_FIELD_NUMBER = 3;
        private int action_;
        private int bitField0_;
        private int position_;
        private String roomId_ = "";
        private l.h<LiveCampaignInfo> liveCampaigns_ = GeneratedMessageLite.emptyProtobufList();

        static {
            ContentUpdateNotice contentUpdateNotice = new ContentUpdateNotice();
            DEFAULT_INSTANCE = contentUpdateNotice;
            contentUpdateNotice.makeImmutable();
        }

        private ContentUpdateNotice() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllLiveCampaigns(Iterable<? extends LiveCampaignInfo> iterable) {
            ensureLiveCampaignsIsMutable();
            a.addAll(iterable, this.liveCampaigns_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addLiveCampaigns(LiveCampaignInfo.Builder builder) {
            ensureLiveCampaignsIsMutable();
            this.liveCampaigns_.add((LiveCampaignInfo) builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAction() {
            this.action_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLiveCampaigns() {
            this.liveCampaigns_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPosition() {
            this.position_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRoomId() {
            this.roomId_ = getDefaultInstance().getRoomId();
        }

        private void ensureLiveCampaignsIsMutable() {
            if (this.liveCampaigns_.q()) {
                return;
            }
            this.liveCampaigns_ = GeneratedMessageLite.mutableCopy(this.liveCampaigns_);
        }

        public static ContentUpdateNotice getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(ContentUpdateNotice contentUpdateNotice) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(contentUpdateNotice);
        }

        public static ContentUpdateNotice parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ContentUpdateNotice) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ContentUpdateNotice parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ContentUpdateNotice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<ContentUpdateNotice> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeLiveCampaigns(int i) {
            ensureLiveCampaignsIsMutable();
            this.liveCampaigns_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAction(LongLinkUpdateAction longLinkUpdateAction) {
            longLinkUpdateAction.getClass();
            this.action_ = longLinkUpdateAction.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setActionValue(int i) {
            this.action_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLiveCampaigns(int i, LiveCampaignInfo.Builder builder) {
            ensureLiveCampaignsIsMutable();
            this.liveCampaigns_.set(i, (LiveCampaignInfo) builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPosition(LongLinkUpdatePosition longLinkUpdatePosition) {
            longLinkUpdatePosition.getClass();
            this.position_ = longLinkUpdatePosition.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPositionValue(int i) {
            this.position_ = i;
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
            switch (C03231.f1639xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new ContentUpdateNotice();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.liveCampaigns_.n();
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.g gVar = (GeneratedMessageLite.h) obj;
                    ContentUpdateNotice contentUpdateNotice = (ContentUpdateNotice) obj2;
                    int i = this.action_;
                    boolean z2 = i != 0;
                    int i2 = contentUpdateNotice.action_;
                    this.action_ = gVar.e(z2, i, i2 != 0, i2);
                    int i3 = this.position_;
                    boolean z3 = i3 != 0;
                    int i4 = contentUpdateNotice.position_;
                    this.position_ = gVar.e(z3, i3, i4 != 0, i4);
                    this.roomId_ = gVar.f(!this.roomId_.isEmpty(), this.roomId_, !contentUpdateNotice.roomId_.isEmpty(), contentUpdateNotice.roomId_);
                    this.liveCampaigns_ = gVar.g(this.liveCampaigns_, contentUpdateNotice.liveCampaigns_);
                    if (gVar == GeneratedMessageLite.g.INSTANCE) {
                        this.bitField0_ |= contentUpdateNotice.bitField0_;
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
                                    this.action_ = eVar.p();
                                } else if (iM == 16) {
                                    this.position_ = eVar.p();
                                } else if (iM == 26) {
                                    this.roomId_ = eVar.L();
                                } else if (iM == 34) {
                                    if (!this.liveCampaigns_.q()) {
                                        this.liveCampaigns_ = GeneratedMessageLite.mutableCopy(this.liveCampaigns_);
                                    }
                                    this.liveCampaigns_.add(eVar.w(LiveCampaignInfo.parser(), hVar));
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
                        synchronized (ContentUpdateNotice.class) {
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

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.ContentUpdateNoticeOrBuilder
        public LongLinkUpdateAction getAction() {
            LongLinkUpdateAction longLinkUpdateActionForNumber = LongLinkUpdateAction.forNumber(this.action_);
            return longLinkUpdateActionForNumber == null ? LongLinkUpdateAction.UNRECOGNIZED : longLinkUpdateActionForNumber;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.ContentUpdateNoticeOrBuilder
        public int getActionValue() {
            return this.action_;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.ContentUpdateNoticeOrBuilder
        public LiveCampaignInfo getLiveCampaigns(int i) {
            return (LiveCampaignInfo) this.liveCampaigns_.get(i);
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.ContentUpdateNoticeOrBuilder
        public int getLiveCampaignsCount() {
            return this.liveCampaigns_.size();
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.ContentUpdateNoticeOrBuilder
        public List<LiveCampaignInfo> getLiveCampaignsList() {
            return this.liveCampaigns_;
        }

        public LiveCampaignInfoOrBuilder getLiveCampaignsOrBuilder(int i) {
            return (LiveCampaignInfoOrBuilder) this.liveCampaigns_.get(i);
        }

        public List<? extends LiveCampaignInfoOrBuilder> getLiveCampaignsOrBuilderList() {
            return this.liveCampaigns_;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.ContentUpdateNoticeOrBuilder
        public LongLinkUpdatePosition getPosition() {
            LongLinkUpdatePosition longLinkUpdatePositionForNumber = LongLinkUpdatePosition.forNumber(this.position_);
            return longLinkUpdatePositionForNumber == null ? LongLinkUpdatePosition.UNRECOGNIZED : longLinkUpdatePositionForNumber;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.ContentUpdateNoticeOrBuilder
        public int getPositionValue() {
            return this.position_;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.ContentUpdateNoticeOrBuilder
        public String getRoomId() {
            return this.roomId_;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.ContentUpdateNoticeOrBuilder
        public ByteString getRoomIdBytes() {
            return ByteString.copyFromUtf8(this.roomId_);
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM = this.action_ != LongLinkUpdateAction.ActionUnknow.getNumber() ? CodedOutputStream.m(1, this.action_) : 0;
            if (this.position_ != LongLinkUpdatePosition.PositionUnknow.getNumber()) {
                iM += CodedOutputStream.m(2, this.position_);
            }
            if (!this.roomId_.isEmpty()) {
                iM += CodedOutputStream.K(3, getRoomId());
            }
            for (int i2 = 0; i2 < this.liveCampaigns_.size(); i2++) {
                iM += CodedOutputStream.C(4, (q) this.liveCampaigns_.get(i2));
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iM;
            return iM;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.action_ != LongLinkUpdateAction.ActionUnknow.getNumber()) {
                codedOutputStream.i0(1, this.action_);
            }
            if (this.position_ != LongLinkUpdatePosition.PositionUnknow.getNumber()) {
                codedOutputStream.i0(2, this.position_);
            }
            if (!this.roomId_.isEmpty()) {
                codedOutputStream.D0(3, getRoomId());
            }
            for (int i = 0; i < this.liveCampaigns_.size(); i++) {
                codedOutputStream.w0(4, (q) this.liveCampaigns_.get(i));
            }
        }

        public static ContentUpdateNotice parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (ContentUpdateNotice) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static ContentUpdateNotice parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (ContentUpdateNotice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static final class Builder extends GeneratedMessageLite.b<ContentUpdateNotice, Builder> implements ContentUpdateNoticeOrBuilder {
            private Builder() {
                super(ContentUpdateNotice.DEFAULT_INSTANCE);
            }

            public Builder addAllLiveCampaigns(Iterable<? extends LiveCampaignInfo> iterable) {
                copyOnWrite();
                ((ContentUpdateNotice) ((GeneratedMessageLite.b) this).instance).addAllLiveCampaigns(iterable);
                return this;
            }

            public Builder addLiveCampaigns(LiveCampaignInfo liveCampaignInfo) {
                copyOnWrite();
                ((ContentUpdateNotice) ((GeneratedMessageLite.b) this).instance).addLiveCampaigns(liveCampaignInfo);
                return this;
            }

            public Builder clearAction() {
                copyOnWrite();
                ((ContentUpdateNotice) ((GeneratedMessageLite.b) this).instance).clearAction();
                return this;
            }

            public Builder clearLiveCampaigns() {
                copyOnWrite();
                ((ContentUpdateNotice) ((GeneratedMessageLite.b) this).instance).clearLiveCampaigns();
                return this;
            }

            public Builder clearPosition() {
                copyOnWrite();
                ((ContentUpdateNotice) ((GeneratedMessageLite.b) this).instance).clearPosition();
                return this;
            }

            public Builder clearRoomId() {
                copyOnWrite();
                ((ContentUpdateNotice) ((GeneratedMessageLite.b) this).instance).clearRoomId();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.ContentUpdateNoticeOrBuilder
            public LongLinkUpdateAction getAction() {
                return ((ContentUpdateNotice) ((GeneratedMessageLite.b) this).instance).getAction();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.ContentUpdateNoticeOrBuilder
            public int getActionValue() {
                return ((ContentUpdateNotice) ((GeneratedMessageLite.b) this).instance).getActionValue();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.ContentUpdateNoticeOrBuilder
            public LiveCampaignInfo getLiveCampaigns(int i) {
                return ((ContentUpdateNotice) ((GeneratedMessageLite.b) this).instance).getLiveCampaigns(i);
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.ContentUpdateNoticeOrBuilder
            public int getLiveCampaignsCount() {
                return ((ContentUpdateNotice) ((GeneratedMessageLite.b) this).instance).getLiveCampaignsCount();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.ContentUpdateNoticeOrBuilder
            public List<LiveCampaignInfo> getLiveCampaignsList() {
                return Collections.unmodifiableList(((ContentUpdateNotice) ((GeneratedMessageLite.b) this).instance).getLiveCampaignsList());
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.ContentUpdateNoticeOrBuilder
            public LongLinkUpdatePosition getPosition() {
                return ((ContentUpdateNotice) ((GeneratedMessageLite.b) this).instance).getPosition();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.ContentUpdateNoticeOrBuilder
            public int getPositionValue() {
                return ((ContentUpdateNotice) ((GeneratedMessageLite.b) this).instance).getPositionValue();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.ContentUpdateNoticeOrBuilder
            public String getRoomId() {
                return ((ContentUpdateNotice) ((GeneratedMessageLite.b) this).instance).getRoomId();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.ContentUpdateNoticeOrBuilder
            public ByteString getRoomIdBytes() {
                return ((ContentUpdateNotice) ((GeneratedMessageLite.b) this).instance).getRoomIdBytes();
            }

            public Builder removeLiveCampaigns(int i) {
                copyOnWrite();
                ((ContentUpdateNotice) ((GeneratedMessageLite.b) this).instance).removeLiveCampaigns(i);
                return this;
            }

            public Builder setAction(LongLinkUpdateAction longLinkUpdateAction) {
                copyOnWrite();
                ((ContentUpdateNotice) ((GeneratedMessageLite.b) this).instance).setAction(longLinkUpdateAction);
                return this;
            }

            public Builder setActionValue(int i) {
                copyOnWrite();
                ((ContentUpdateNotice) ((GeneratedMessageLite.b) this).instance).setActionValue(i);
                return this;
            }

            public Builder setLiveCampaigns(int i, LiveCampaignInfo liveCampaignInfo) {
                copyOnWrite();
                ((ContentUpdateNotice) ((GeneratedMessageLite.b) this).instance).setLiveCampaigns(i, liveCampaignInfo);
                return this;
            }

            public Builder setPosition(LongLinkUpdatePosition longLinkUpdatePosition) {
                copyOnWrite();
                ((ContentUpdateNotice) ((GeneratedMessageLite.b) this).instance).setPosition(longLinkUpdatePosition);
                return this;
            }

            public Builder setPositionValue(int i) {
                copyOnWrite();
                ((ContentUpdateNotice) ((GeneratedMessageLite.b) this).instance).setPositionValue(i);
                return this;
            }

            public Builder setRoomId(String str) {
                copyOnWrite();
                ((ContentUpdateNotice) ((GeneratedMessageLite.b) this).instance).setRoomId(str);
                return this;
            }

            public Builder setRoomIdBytes(ByteString byteString) {
                copyOnWrite();
                ((ContentUpdateNotice) ((GeneratedMessageLite.b) this).instance).setRoomIdBytes(byteString);
                return this;
            }

            public Builder addLiveCampaigns(int i, LiveCampaignInfo liveCampaignInfo) {
                copyOnWrite();
                ((ContentUpdateNotice) ((GeneratedMessageLite.b) this).instance).addLiveCampaigns(i, liveCampaignInfo);
                return this;
            }

            public Builder setLiveCampaigns(int i, LiveCampaignInfo.Builder builder) {
                copyOnWrite();
                ((ContentUpdateNotice) ((GeneratedMessageLite.b) this).instance).setLiveCampaigns(i, builder);
                return this;
            }

            public Builder addLiveCampaigns(LiveCampaignInfo.Builder builder) {
                copyOnWrite();
                ((ContentUpdateNotice) ((GeneratedMessageLite.b) this).instance).addLiveCampaigns(builder);
                return this;
            }

            public Builder addLiveCampaigns(int i, LiveCampaignInfo.Builder builder) {
                copyOnWrite();
                ((ContentUpdateNotice) ((GeneratedMessageLite.b) this).instance).addLiveCampaigns(i, builder);
                return this;
            }
        }

        public static ContentUpdateNotice parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ContentUpdateNotice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ContentUpdateNotice parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (ContentUpdateNotice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static ContentUpdateNotice parseFrom(InputStream inputStream) throws IOException {
            return (ContentUpdateNotice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ContentUpdateNotice parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (ContentUpdateNotice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static ContentUpdateNotice parseFrom(e eVar) throws IOException {
            return (ContentUpdateNotice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addLiveCampaigns(int i, LiveCampaignInfo liveCampaignInfo) {
            liveCampaignInfo.getClass();
            ensureLiveCampaignsIsMutable();
            this.liveCampaigns_.add(i, liveCampaignInfo);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static ContentUpdateNotice parseFrom(e eVar, h hVar) throws IOException {
            return (ContentUpdateNotice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLiveCampaigns(int i, LiveCampaignInfo liveCampaignInfo) {
            liveCampaignInfo.getClass();
            ensureLiveCampaignsIsMutable();
            this.liveCampaigns_.set(i, liveCampaignInfo);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addLiveCampaigns(LiveCampaignInfo liveCampaignInfo) {
            liveCampaignInfo.getClass();
            ensureLiveCampaignsIsMutable();
            this.liveCampaigns_.add(liveCampaignInfo);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addLiveCampaigns(int i, LiveCampaignInfo.Builder builder) {
            ensureLiveCampaignsIsMutable();
            this.liveCampaigns_.add(i, (LiveCampaignInfo) builder.build());
        }
    }

    public static final class CurrentHourSuggestConfig extends GeneratedMessageLite<CurrentHourSuggestConfig, Builder> implements CurrentHourSuggestConfigOrBuilder {
        private static final CurrentHourSuggestConfig DEFAULT_INSTANCE;
        public static final int ENABLE_FIELD_NUMBER = 1;
        public static final int NODES_FIELD_NUMBER = 3;
        private static volatile i860<CurrentHourSuggestConfig> PARSER = null;
        public static final int TARGET_FIELD_NUMBER = 2;
        private int bitField0_;
        private boolean enable_;
        private l.g nodes_ = GeneratedMessageLite.emptyLongList();
        private long target_;

        public static final class Builder extends GeneratedMessageLite.b<CurrentHourSuggestConfig, Builder> implements CurrentHourSuggestConfigOrBuilder {
            private Builder() {
                super(CurrentHourSuggestConfig.DEFAULT_INSTANCE);
            }

            public Builder addAllNodes(Iterable<? extends Long> iterable) {
                copyOnWrite();
                ((CurrentHourSuggestConfig) ((GeneratedMessageLite.b) this).instance).addAllNodes(iterable);
                return this;
            }

            public Builder addNodes(long j) {
                copyOnWrite();
                ((CurrentHourSuggestConfig) ((GeneratedMessageLite.b) this).instance).addNodes(j);
                return this;
            }

            public Builder clearEnable() {
                copyOnWrite();
                ((CurrentHourSuggestConfig) ((GeneratedMessageLite.b) this).instance).clearEnable();
                return this;
            }

            public Builder clearNodes() {
                copyOnWrite();
                ((CurrentHourSuggestConfig) ((GeneratedMessageLite.b) this).instance).clearNodes();
                return this;
            }

            public Builder clearTarget() {
                copyOnWrite();
                ((CurrentHourSuggestConfig) ((GeneratedMessageLite.b) this).instance).clearTarget();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.CurrentHourSuggestConfigOrBuilder
            public boolean getEnable() {
                return ((CurrentHourSuggestConfig) ((GeneratedMessageLite.b) this).instance).getEnable();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.CurrentHourSuggestConfigOrBuilder
            public long getNodes(int i) {
                return ((CurrentHourSuggestConfig) ((GeneratedMessageLite.b) this).instance).getNodes(i);
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.CurrentHourSuggestConfigOrBuilder
            public int getNodesCount() {
                return ((CurrentHourSuggestConfig) ((GeneratedMessageLite.b) this).instance).getNodesCount();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.CurrentHourSuggestConfigOrBuilder
            public List<Long> getNodesList() {
                return Collections.unmodifiableList(((CurrentHourSuggestConfig) ((GeneratedMessageLite.b) this).instance).getNodesList());
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.CurrentHourSuggestConfigOrBuilder
            public long getTarget() {
                return ((CurrentHourSuggestConfig) ((GeneratedMessageLite.b) this).instance).getTarget();
            }

            public Builder setEnable(boolean z) {
                copyOnWrite();
                ((CurrentHourSuggestConfig) ((GeneratedMessageLite.b) this).instance).setEnable(z);
                return this;
            }

            public Builder setNodes(int i, long j) {
                copyOnWrite();
                ((CurrentHourSuggestConfig) ((GeneratedMessageLite.b) this).instance).setNodes(i, j);
                return this;
            }

            public Builder setTarget(long j) {
                copyOnWrite();
                ((CurrentHourSuggestConfig) ((GeneratedMessageLite.b) this).instance).setTarget(j);
                return this;
            }
        }

        static {
            CurrentHourSuggestConfig currentHourSuggestConfig = new CurrentHourSuggestConfig();
            DEFAULT_INSTANCE = currentHourSuggestConfig;
            currentHourSuggestConfig.makeImmutable();
        }

        private CurrentHourSuggestConfig() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllNodes(Iterable<? extends Long> iterable) {
            ensureNodesIsMutable();
            a.addAll(iterable, this.nodes_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addNodes(long j) {
            ensureNodesIsMutable();
            this.nodes_.u(j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEnable() {
            this.enable_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNodes() {
            this.nodes_ = GeneratedMessageLite.emptyLongList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTarget() {
            this.target_ = 0L;
        }

        private void ensureNodesIsMutable() {
            if (this.nodes_.q()) {
                return;
            }
            this.nodes_ = GeneratedMessageLite.mutableCopy(this.nodes_);
        }

        public static CurrentHourSuggestConfig getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(CurrentHourSuggestConfig currentHourSuggestConfig) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(currentHourSuggestConfig);
        }

        public static CurrentHourSuggestConfig parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (CurrentHourSuggestConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CurrentHourSuggestConfig parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (CurrentHourSuggestConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<CurrentHourSuggestConfig> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEnable(boolean z) {
            this.enable_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNodes(int i, long j) {
            ensureNodesIsMutable();
            this.nodes_.setLong(i, j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTarget(long j) {
            this.target_ = j;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C03231.f1639xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new CurrentHourSuggestConfig();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.nodes_.n();
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.g gVar = (GeneratedMessageLite.h) obj;
                    CurrentHourSuggestConfig currentHourSuggestConfig = (CurrentHourSuggestConfig) obj2;
                    boolean z2 = this.enable_;
                    boolean z3 = currentHourSuggestConfig.enable_;
                    this.enable_ = gVar.d(z2, z2, z3, z3);
                    long j = this.target_;
                    boolean z4 = j != 0;
                    long j2 = currentHourSuggestConfig.target_;
                    this.target_ = gVar.i(z4, j, j2 != 0, j2);
                    this.nodes_ = gVar.q(this.nodes_, currentHourSuggestConfig.nodes_);
                    if (gVar == GeneratedMessageLite.g.INSTANCE) {
                        this.bitField0_ |= currentHourSuggestConfig.bitField0_;
                    }
                    return this;
                case 6:
                    e eVar = (e) obj;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            if (iM != 0) {
                                if (iM == 8) {
                                    this.enable_ = eVar.m();
                                } else if (iM == 16) {
                                    this.target_ = eVar.v();
                                } else if (iM == 24) {
                                    if (!this.nodes_.q()) {
                                        this.nodes_ = GeneratedMessageLite.mutableCopy(this.nodes_);
                                    }
                                    this.nodes_.u(eVar.v());
                                } else if (iM == 26) {
                                    int iL = eVar.l(eVar.C());
                                    if (!this.nodes_.q() && eVar.d() > 0) {
                                        this.nodes_ = GeneratedMessageLite.mutableCopy(this.nodes_);
                                    }
                                    while (eVar.d() > 0) {
                                        this.nodes_.u(eVar.v());
                                    }
                                    eVar.k(iL);
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
                        synchronized (CurrentHourSuggestConfig.class) {
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

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.CurrentHourSuggestConfigOrBuilder
        public boolean getEnable() {
            return this.enable_;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.CurrentHourSuggestConfigOrBuilder
        public long getNodes(int i) {
            return this.nodes_.getLong(i);
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.CurrentHourSuggestConfigOrBuilder
        public int getNodesCount() {
            return this.nodes_.size();
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.CurrentHourSuggestConfigOrBuilder
        public List<Long> getNodesList() {
            return this.nodes_;
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            boolean z = this.enable_;
            int iF = z ? CodedOutputStream.f(1, z) : 0;
            long j = this.target_;
            if (j != 0) {
                iF += CodedOutputStream.v(2, j);
            }
            int iW = 0;
            for (int i2 = 0; i2 < this.nodes_.size(); i2++) {
                iW += CodedOutputStream.w(this.nodes_.getLong(i2));
            }
            int size = iF + iW + getNodesList().size();
            ((GeneratedMessageLite) this).memoizedSerializedSize = size;
            return size;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.CurrentHourSuggestConfigOrBuilder
        public long getTarget() {
            return this.target_;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            boolean z = this.enable_;
            if (z) {
                codedOutputStream.a0(1, z);
            }
            long j = this.target_;
            if (j != 0) {
                codedOutputStream.u0(2, j);
            }
            for (int i = 0; i < this.nodes_.size(); i++) {
                codedOutputStream.u0(3, this.nodes_.getLong(i));
            }
        }

        public static CurrentHourSuggestConfig parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (CurrentHourSuggestConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static CurrentHourSuggestConfig parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (CurrentHourSuggestConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static CurrentHourSuggestConfig parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (CurrentHourSuggestConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CurrentHourSuggestConfig parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (CurrentHourSuggestConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static CurrentHourSuggestConfig parseFrom(InputStream inputStream) throws IOException {
            return (CurrentHourSuggestConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CurrentHourSuggestConfig parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (CurrentHourSuggestConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static CurrentHourSuggestConfig parseFrom(e eVar) throws IOException {
            return (CurrentHourSuggestConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static CurrentHourSuggestConfig parseFrom(e eVar, h hVar) throws IOException {
            return (CurrentHourSuggestConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public static final class DynamicEffectExtend extends GeneratedMessageLite<DynamicEffectExtend, Builder> implements DynamicEffectExtendOrBuilder {
        private static final DynamicEffectExtend DEFAULT_INSTANCE;
        public static final int KEY_FIELD_NUMBER = 1;
        private static volatile i860<DynamicEffectExtend> PARSER = null;
        public static final int VALUE_FIELD_NUMBER = 3;
        private int bitField0_;
        private String key_ = "";
        private l.h<String> value_ = GeneratedMessageLite.emptyProtobufList();

        public static final class Builder extends GeneratedMessageLite.b<DynamicEffectExtend, Builder> implements DynamicEffectExtendOrBuilder {
            private Builder() {
                super(DynamicEffectExtend.DEFAULT_INSTANCE);
            }

            public Builder addAllValue(Iterable<String> iterable) {
                copyOnWrite();
                ((DynamicEffectExtend) ((GeneratedMessageLite.b) this).instance).addAllValue(iterable);
                return this;
            }

            public Builder addValue(String str) {
                copyOnWrite();
                ((DynamicEffectExtend) ((GeneratedMessageLite.b) this).instance).addValue(str);
                return this;
            }

            public Builder addValueBytes(ByteString byteString) {
                copyOnWrite();
                ((DynamicEffectExtend) ((GeneratedMessageLite.b) this).instance).addValueBytes(byteString);
                return this;
            }

            public Builder clearKey() {
                copyOnWrite();
                ((DynamicEffectExtend) ((GeneratedMessageLite.b) this).instance).clearKey();
                return this;
            }

            public Builder clearValue() {
                copyOnWrite();
                ((DynamicEffectExtend) ((GeneratedMessageLite.b) this).instance).clearValue();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.DynamicEffectExtendOrBuilder
            public String getKey() {
                return ((DynamicEffectExtend) ((GeneratedMessageLite.b) this).instance).getKey();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.DynamicEffectExtendOrBuilder
            public ByteString getKeyBytes() {
                return ((DynamicEffectExtend) ((GeneratedMessageLite.b) this).instance).getKeyBytes();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.DynamicEffectExtendOrBuilder
            public String getValue(int i) {
                return ((DynamicEffectExtend) ((GeneratedMessageLite.b) this).instance).getValue(i);
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.DynamicEffectExtendOrBuilder
            public ByteString getValueBytes(int i) {
                return ((DynamicEffectExtend) ((GeneratedMessageLite.b) this).instance).getValueBytes(i);
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.DynamicEffectExtendOrBuilder
            public int getValueCount() {
                return ((DynamicEffectExtend) ((GeneratedMessageLite.b) this).instance).getValueCount();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.DynamicEffectExtendOrBuilder
            public List<String> getValueList() {
                return Collections.unmodifiableList(((DynamicEffectExtend) ((GeneratedMessageLite.b) this).instance).getValueList());
            }

            public Builder setKey(String str) {
                copyOnWrite();
                ((DynamicEffectExtend) ((GeneratedMessageLite.b) this).instance).setKey(str);
                return this;
            }

            public Builder setKeyBytes(ByteString byteString) {
                copyOnWrite();
                ((DynamicEffectExtend) ((GeneratedMessageLite.b) this).instance).setKeyBytes(byteString);
                return this;
            }

            public Builder setValue(int i, String str) {
                copyOnWrite();
                ((DynamicEffectExtend) ((GeneratedMessageLite.b) this).instance).setValue(i, str);
                return this;
            }
        }

        static {
            DynamicEffectExtend dynamicEffectExtend = new DynamicEffectExtend();
            DEFAULT_INSTANCE = dynamicEffectExtend;
            dynamicEffectExtend.makeImmutable();
        }

        private DynamicEffectExtend() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllValue(Iterable<String> iterable) {
            ensureValueIsMutable();
            a.addAll(iterable, this.value_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addValue(String str) {
            str.getClass();
            ensureValueIsMutable();
            this.value_.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addValueBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            ensureValueIsMutable();
            this.value_.add(byteString.toStringUtf8());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearKey() {
            this.key_ = getDefaultInstance().getKey();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearValue() {
            this.value_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureValueIsMutable() {
            if (this.value_.q()) {
                return;
            }
            this.value_ = GeneratedMessageLite.mutableCopy(this.value_);
        }

        public static DynamicEffectExtend getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(DynamicEffectExtend dynamicEffectExtend) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(dynamicEffectExtend);
        }

        public static DynamicEffectExtend parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (DynamicEffectExtend) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DynamicEffectExtend parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (DynamicEffectExtend) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<DynamicEffectExtend> parser() {
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
        public void setValue(int i, String str) {
            str.getClass();
            ensureValueIsMutable();
            this.value_.set(i, str);
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C03231.f1639xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new DynamicEffectExtend();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.value_.n();
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.g gVar = (GeneratedMessageLite.h) obj;
                    DynamicEffectExtend dynamicEffectExtend = (DynamicEffectExtend) obj2;
                    this.key_ = gVar.f(!this.key_.isEmpty(), this.key_, true ^ dynamicEffectExtend.key_.isEmpty(), dynamicEffectExtend.key_);
                    this.value_ = gVar.g(this.value_, dynamicEffectExtend.value_);
                    if (gVar == GeneratedMessageLite.g.INSTANCE) {
                        this.bitField0_ |= dynamicEffectExtend.bitField0_;
                    }
                    return this;
                case 6:
                    e eVar = (e) obj;
                    boolean z = false;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            if (iM != 0) {
                                if (iM == 10) {
                                    this.key_ = eVar.L();
                                } else if (iM == 26) {
                                    String strL = eVar.L();
                                    if (!this.value_.q()) {
                                        this.value_ = GeneratedMessageLite.mutableCopy(this.value_);
                                    }
                                    this.value_.add(strL);
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
                        synchronized (DynamicEffectExtend.class) {
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

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.DynamicEffectExtendOrBuilder
        public String getKey() {
            return this.key_;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.DynamicEffectExtendOrBuilder
        public ByteString getKeyBytes() {
            return ByteString.copyFromUtf8(this.key_);
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iK = !this.key_.isEmpty() ? CodedOutputStream.K(1, getKey()) : 0;
            int iL = 0;
            for (int i2 = 0; i2 < this.value_.size(); i2++) {
                iL += CodedOutputStream.L((String) this.value_.get(i2));
            }
            int size = iK + iL + getValueList().size();
            ((GeneratedMessageLite) this).memoizedSerializedSize = size;
            return size;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.DynamicEffectExtendOrBuilder
        public String getValue(int i) {
            return (String) this.value_.get(i);
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.DynamicEffectExtendOrBuilder
        public ByteString getValueBytes(int i) {
            return ByteString.copyFromUtf8((String) this.value_.get(i));
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.DynamicEffectExtendOrBuilder
        public int getValueCount() {
            return this.value_.size();
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.DynamicEffectExtendOrBuilder
        public List<String> getValueList() {
            return this.value_;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.key_.isEmpty()) {
                codedOutputStream.D0(1, getKey());
            }
            for (int i = 0; i < this.value_.size(); i++) {
                codedOutputStream.D0(3, (String) this.value_.get(i));
            }
        }

        public static DynamicEffectExtend parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (DynamicEffectExtend) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static DynamicEffectExtend parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (DynamicEffectExtend) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static DynamicEffectExtend parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (DynamicEffectExtend) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static DynamicEffectExtend parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (DynamicEffectExtend) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static DynamicEffectExtend parseFrom(InputStream inputStream) throws IOException {
            return (DynamicEffectExtend) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DynamicEffectExtend parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (DynamicEffectExtend) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static DynamicEffectExtend parseFrom(e eVar) throws IOException {
            return (DynamicEffectExtend) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static DynamicEffectExtend parseFrom(e eVar, h hVar) throws IOException {
            return (DynamicEffectExtend) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public static final class GiftFlyMicInfo extends GeneratedMessageLite<GiftFlyMicInfo, Builder> implements GiftFlyMicInfoOrBuilder {
        private static final GiftFlyMicInfo DEFAULT_INSTANCE;
        public static final int DYNAMICEFFECTEXTENDS_FIELD_NUMBER = 4;
        public static final int ENDEFFECTICON_FIELD_NUMBER = 3;
        private static volatile i860<GiftFlyMicInfo> PARSER = null;
        public static final int RECEIVEUSERID_FIELD_NUMBER = 1;
        public static final int STARTEFFECTICON_FIELD_NUMBER = 2;
        private int bitField0_;
        private String receiveUserId_ = "";
        private String startEffectIcon_ = "";
        private String endEffectIcon_ = "";
        private l.h<DynamicEffectExtend> dynamicEffectExtends_ = GeneratedMessageLite.emptyProtobufList();

        static {
            GiftFlyMicInfo giftFlyMicInfo = new GiftFlyMicInfo();
            DEFAULT_INSTANCE = giftFlyMicInfo;
            giftFlyMicInfo.makeImmutable();
        }

        private GiftFlyMicInfo() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllDynamicEffectExtends(Iterable<? extends DynamicEffectExtend> iterable) {
            ensureDynamicEffectExtendsIsMutable();
            a.addAll(iterable, this.dynamicEffectExtends_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addDynamicEffectExtends(DynamicEffectExtend.Builder builder) {
            ensureDynamicEffectExtendsIsMutable();
            this.dynamicEffectExtends_.add((DynamicEffectExtend) builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDynamicEffectExtends() {
            this.dynamicEffectExtends_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEndEffectIcon() {
            this.endEffectIcon_ = getDefaultInstance().getEndEffectIcon();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearReceiveUserId() {
            this.receiveUserId_ = getDefaultInstance().getReceiveUserId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStartEffectIcon() {
            this.startEffectIcon_ = getDefaultInstance().getStartEffectIcon();
        }

        private void ensureDynamicEffectExtendsIsMutable() {
            if (this.dynamicEffectExtends_.q()) {
                return;
            }
            this.dynamicEffectExtends_ = GeneratedMessageLite.mutableCopy(this.dynamicEffectExtends_);
        }

        public static GiftFlyMicInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(GiftFlyMicInfo giftFlyMicInfo) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(giftFlyMicInfo);
        }

        public static GiftFlyMicInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (GiftFlyMicInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GiftFlyMicInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (GiftFlyMicInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<GiftFlyMicInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeDynamicEffectExtends(int i) {
            ensureDynamicEffectExtendsIsMutable();
            this.dynamicEffectExtends_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDynamicEffectExtends(int i, DynamicEffectExtend.Builder builder) {
            ensureDynamicEffectExtendsIsMutable();
            this.dynamicEffectExtends_.set(i, (DynamicEffectExtend) builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEndEffectIcon(String str) {
            str.getClass();
            this.endEffectIcon_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEndEffectIconBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.endEffectIcon_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setReceiveUserId(String str) {
            str.getClass();
            this.receiveUserId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setReceiveUserIdBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.receiveUserId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStartEffectIcon(String str) {
            str.getClass();
            this.startEffectIcon_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStartEffectIconBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.startEffectIcon_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C03231.f1639xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new GiftFlyMicInfo();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.dynamicEffectExtends_.n();
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.g gVar = (GeneratedMessageLite.h) obj;
                    GiftFlyMicInfo giftFlyMicInfo = (GiftFlyMicInfo) obj2;
                    this.receiveUserId_ = gVar.f(!this.receiveUserId_.isEmpty(), this.receiveUserId_, !giftFlyMicInfo.receiveUserId_.isEmpty(), giftFlyMicInfo.receiveUserId_);
                    this.startEffectIcon_ = gVar.f(!this.startEffectIcon_.isEmpty(), this.startEffectIcon_, !giftFlyMicInfo.startEffectIcon_.isEmpty(), giftFlyMicInfo.startEffectIcon_);
                    this.endEffectIcon_ = gVar.f(!this.endEffectIcon_.isEmpty(), this.endEffectIcon_, true ^ giftFlyMicInfo.endEffectIcon_.isEmpty(), giftFlyMicInfo.endEffectIcon_);
                    this.dynamicEffectExtends_ = gVar.g(this.dynamicEffectExtends_, giftFlyMicInfo.dynamicEffectExtends_);
                    if (gVar == GeneratedMessageLite.g.INSTANCE) {
                        this.bitField0_ |= giftFlyMicInfo.bitField0_;
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
                                    this.receiveUserId_ = eVar.L();
                                } else if (iM == 18) {
                                    this.startEffectIcon_ = eVar.L();
                                } else if (iM == 26) {
                                    this.endEffectIcon_ = eVar.L();
                                } else if (iM == 34) {
                                    if (!this.dynamicEffectExtends_.q()) {
                                        this.dynamicEffectExtends_ = GeneratedMessageLite.mutableCopy(this.dynamicEffectExtends_);
                                    }
                                    this.dynamicEffectExtends_.add(eVar.w(DynamicEffectExtend.parser(), hVar));
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
                        synchronized (GiftFlyMicInfo.class) {
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

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.GiftFlyMicInfoOrBuilder
        public DynamicEffectExtend getDynamicEffectExtends(int i) {
            return (DynamicEffectExtend) this.dynamicEffectExtends_.get(i);
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.GiftFlyMicInfoOrBuilder
        public int getDynamicEffectExtendsCount() {
            return this.dynamicEffectExtends_.size();
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.GiftFlyMicInfoOrBuilder
        public List<DynamicEffectExtend> getDynamicEffectExtendsList() {
            return this.dynamicEffectExtends_;
        }

        public DynamicEffectExtendOrBuilder getDynamicEffectExtendsOrBuilder(int i) {
            return (DynamicEffectExtendOrBuilder) this.dynamicEffectExtends_.get(i);
        }

        public List<? extends DynamicEffectExtendOrBuilder> getDynamicEffectExtendsOrBuilderList() {
            return this.dynamicEffectExtends_;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.GiftFlyMicInfoOrBuilder
        public String getEndEffectIcon() {
            return this.endEffectIcon_;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.GiftFlyMicInfoOrBuilder
        public ByteString getEndEffectIconBytes() {
            return ByteString.copyFromUtf8(this.endEffectIcon_);
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.GiftFlyMicInfoOrBuilder
        public String getReceiveUserId() {
            return this.receiveUserId_;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.GiftFlyMicInfoOrBuilder
        public ByteString getReceiveUserIdBytes() {
            return ByteString.copyFromUtf8(this.receiveUserId_);
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iK = !this.receiveUserId_.isEmpty() ? CodedOutputStream.K(1, getReceiveUserId()) : 0;
            if (!this.startEffectIcon_.isEmpty()) {
                iK += CodedOutputStream.K(2, getStartEffectIcon());
            }
            if (!this.endEffectIcon_.isEmpty()) {
                iK += CodedOutputStream.K(3, getEndEffectIcon());
            }
            for (int i2 = 0; i2 < this.dynamicEffectExtends_.size(); i2++) {
                iK += CodedOutputStream.C(4, (q) this.dynamicEffectExtends_.get(i2));
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iK;
            return iK;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.GiftFlyMicInfoOrBuilder
        public String getStartEffectIcon() {
            return this.startEffectIcon_;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.GiftFlyMicInfoOrBuilder
        public ByteString getStartEffectIconBytes() {
            return ByteString.copyFromUtf8(this.startEffectIcon_);
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.receiveUserId_.isEmpty()) {
                codedOutputStream.D0(1, getReceiveUserId());
            }
            if (!this.startEffectIcon_.isEmpty()) {
                codedOutputStream.D0(2, getStartEffectIcon());
            }
            if (!this.endEffectIcon_.isEmpty()) {
                codedOutputStream.D0(3, getEndEffectIcon());
            }
            for (int i = 0; i < this.dynamicEffectExtends_.size(); i++) {
                codedOutputStream.w0(4, (q) this.dynamicEffectExtends_.get(i));
            }
        }

        public static GiftFlyMicInfo parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (GiftFlyMicInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static GiftFlyMicInfo parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (GiftFlyMicInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static final class Builder extends GeneratedMessageLite.b<GiftFlyMicInfo, Builder> implements GiftFlyMicInfoOrBuilder {
            private Builder() {
                super(GiftFlyMicInfo.DEFAULT_INSTANCE);
            }

            public Builder addAllDynamicEffectExtends(Iterable<? extends DynamicEffectExtend> iterable) {
                copyOnWrite();
                ((GiftFlyMicInfo) ((GeneratedMessageLite.b) this).instance).addAllDynamicEffectExtends(iterable);
                return this;
            }

            public Builder addDynamicEffectExtends(DynamicEffectExtend dynamicEffectExtend) {
                copyOnWrite();
                ((GiftFlyMicInfo) ((GeneratedMessageLite.b) this).instance).addDynamicEffectExtends(dynamicEffectExtend);
                return this;
            }

            public Builder clearDynamicEffectExtends() {
                copyOnWrite();
                ((GiftFlyMicInfo) ((GeneratedMessageLite.b) this).instance).clearDynamicEffectExtends();
                return this;
            }

            public Builder clearEndEffectIcon() {
                copyOnWrite();
                ((GiftFlyMicInfo) ((GeneratedMessageLite.b) this).instance).clearEndEffectIcon();
                return this;
            }

            public Builder clearReceiveUserId() {
                copyOnWrite();
                ((GiftFlyMicInfo) ((GeneratedMessageLite.b) this).instance).clearReceiveUserId();
                return this;
            }

            public Builder clearStartEffectIcon() {
                copyOnWrite();
                ((GiftFlyMicInfo) ((GeneratedMessageLite.b) this).instance).clearStartEffectIcon();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.GiftFlyMicInfoOrBuilder
            public DynamicEffectExtend getDynamicEffectExtends(int i) {
                return ((GiftFlyMicInfo) ((GeneratedMessageLite.b) this).instance).getDynamicEffectExtends(i);
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.GiftFlyMicInfoOrBuilder
            public int getDynamicEffectExtendsCount() {
                return ((GiftFlyMicInfo) ((GeneratedMessageLite.b) this).instance).getDynamicEffectExtendsCount();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.GiftFlyMicInfoOrBuilder
            public List<DynamicEffectExtend> getDynamicEffectExtendsList() {
                return Collections.unmodifiableList(((GiftFlyMicInfo) ((GeneratedMessageLite.b) this).instance).getDynamicEffectExtendsList());
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.GiftFlyMicInfoOrBuilder
            public String getEndEffectIcon() {
                return ((GiftFlyMicInfo) ((GeneratedMessageLite.b) this).instance).getEndEffectIcon();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.GiftFlyMicInfoOrBuilder
            public ByteString getEndEffectIconBytes() {
                return ((GiftFlyMicInfo) ((GeneratedMessageLite.b) this).instance).getEndEffectIconBytes();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.GiftFlyMicInfoOrBuilder
            public String getReceiveUserId() {
                return ((GiftFlyMicInfo) ((GeneratedMessageLite.b) this).instance).getReceiveUserId();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.GiftFlyMicInfoOrBuilder
            public ByteString getReceiveUserIdBytes() {
                return ((GiftFlyMicInfo) ((GeneratedMessageLite.b) this).instance).getReceiveUserIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.GiftFlyMicInfoOrBuilder
            public String getStartEffectIcon() {
                return ((GiftFlyMicInfo) ((GeneratedMessageLite.b) this).instance).getStartEffectIcon();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.GiftFlyMicInfoOrBuilder
            public ByteString getStartEffectIconBytes() {
                return ((GiftFlyMicInfo) ((GeneratedMessageLite.b) this).instance).getStartEffectIconBytes();
            }

            public Builder removeDynamicEffectExtends(int i) {
                copyOnWrite();
                ((GiftFlyMicInfo) ((GeneratedMessageLite.b) this).instance).removeDynamicEffectExtends(i);
                return this;
            }

            public Builder setDynamicEffectExtends(int i, DynamicEffectExtend dynamicEffectExtend) {
                copyOnWrite();
                ((GiftFlyMicInfo) ((GeneratedMessageLite.b) this).instance).setDynamicEffectExtends(i, dynamicEffectExtend);
                return this;
            }

            public Builder setEndEffectIcon(String str) {
                copyOnWrite();
                ((GiftFlyMicInfo) ((GeneratedMessageLite.b) this).instance).setEndEffectIcon(str);
                return this;
            }

            public Builder setEndEffectIconBytes(ByteString byteString) {
                copyOnWrite();
                ((GiftFlyMicInfo) ((GeneratedMessageLite.b) this).instance).setEndEffectIconBytes(byteString);
                return this;
            }

            public Builder setReceiveUserId(String str) {
                copyOnWrite();
                ((GiftFlyMicInfo) ((GeneratedMessageLite.b) this).instance).setReceiveUserId(str);
                return this;
            }

            public Builder setReceiveUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((GiftFlyMicInfo) ((GeneratedMessageLite.b) this).instance).setReceiveUserIdBytes(byteString);
                return this;
            }

            public Builder setStartEffectIcon(String str) {
                copyOnWrite();
                ((GiftFlyMicInfo) ((GeneratedMessageLite.b) this).instance).setStartEffectIcon(str);
                return this;
            }

            public Builder setStartEffectIconBytes(ByteString byteString) {
                copyOnWrite();
                ((GiftFlyMicInfo) ((GeneratedMessageLite.b) this).instance).setStartEffectIconBytes(byteString);
                return this;
            }

            public Builder addDynamicEffectExtends(int i, DynamicEffectExtend dynamicEffectExtend) {
                copyOnWrite();
                ((GiftFlyMicInfo) ((GeneratedMessageLite.b) this).instance).addDynamicEffectExtends(i, dynamicEffectExtend);
                return this;
            }

            public Builder setDynamicEffectExtends(int i, DynamicEffectExtend.Builder builder) {
                copyOnWrite();
                ((GiftFlyMicInfo) ((GeneratedMessageLite.b) this).instance).setDynamicEffectExtends(i, builder);
                return this;
            }

            public Builder addDynamicEffectExtends(DynamicEffectExtend.Builder builder) {
                copyOnWrite();
                ((GiftFlyMicInfo) ((GeneratedMessageLite.b) this).instance).addDynamicEffectExtends(builder);
                return this;
            }

            public Builder addDynamicEffectExtends(int i, DynamicEffectExtend.Builder builder) {
                copyOnWrite();
                ((GiftFlyMicInfo) ((GeneratedMessageLite.b) this).instance).addDynamicEffectExtends(i, builder);
                return this;
            }
        }

        public static GiftFlyMicInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (GiftFlyMicInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static GiftFlyMicInfo parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (GiftFlyMicInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static GiftFlyMicInfo parseFrom(InputStream inputStream) throws IOException {
            return (GiftFlyMicInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GiftFlyMicInfo parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (GiftFlyMicInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static GiftFlyMicInfo parseFrom(e eVar) throws IOException {
            return (GiftFlyMicInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addDynamicEffectExtends(int i, DynamicEffectExtend dynamicEffectExtend) {
            dynamicEffectExtend.getClass();
            ensureDynamicEffectExtendsIsMutable();
            this.dynamicEffectExtends_.add(i, dynamicEffectExtend);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static GiftFlyMicInfo parseFrom(e eVar, h hVar) throws IOException {
            return (GiftFlyMicInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDynamicEffectExtends(int i, DynamicEffectExtend dynamicEffectExtend) {
            dynamicEffectExtend.getClass();
            ensureDynamicEffectExtendsIsMutable();
            this.dynamicEffectExtends_.set(i, dynamicEffectExtend);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addDynamicEffectExtends(DynamicEffectExtend dynamicEffectExtend) {
            dynamicEffectExtend.getClass();
            ensureDynamicEffectExtendsIsMutable();
            this.dynamicEffectExtends_.add(dynamicEffectExtend);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addDynamicEffectExtends(int i, DynamicEffectExtend.Builder builder) {
            ensureDynamicEffectExtendsIsMutable();
            this.dynamicEffectExtends_.add(i, (DynamicEffectExtend) builder.build());
        }
    }

    public static final class GiftItemBrief extends GeneratedMessageLite<GiftItemBrief, Builder> implements GiftItemBriefOrBuilder {
        public static final int AVATARTAG_FIELD_NUMBER = 20;
        public static final int COMBOID_FIELD_NUMBER = 4;
        public static final int COMBOS_FIELD_NUMBER = 3;
        private static final GiftItemBrief DEFAULT_INSTANCE;
        public static final int EXTRAINFO_FIELD_NUMBER = 11;
        public static final int FLYMICINFO_FIELD_NUMBER = 18;
        public static final int GIFTBOTTOMTAG_FIELD_NUMBER = 21;
        public static final int GIFTNUM_FIELD_NUMBER = 12;
        public static final int GIFTSOURCE_FIELD_NUMBER = 10;
        public static final int GIFTTYPE_FIELD_NUMBER = 2;
        public static final int ID_FIELD_NUMBER = 1;
        public static final int ISGEAR_FIELD_NUMBER = 13;
        public static final int ISNAMED_FIELD_NUMBER = 16;
        public static final int LOTTERYGIFTID_FIELD_NUMBER = 19;
        public static final int LUCKYPRIZEGIFTINFOITEMID_FIELD_NUMBER = 9;
        private static volatile i860<GiftItemBrief> PARSER = null;
        public static final int STEP_FIELD_NUMBER = 15;
        public static final int STICKFACEPOSITIONTYPE_FIELD_NUMBER = 8;
        public static final int THRESHOLD_FIELD_NUMBER = 14;
        public static final int TRAY_FIELD_NUMBER = 17;
        public static final int USERNAME_FIELD_NUMBER = 6;
        public static final int USERURL_FIELD_NUMBER = 7;
        public static final int VERSION_FIELD_NUMBER = 5;
        private long combos_;
        private LiveGiftExtraInfo extraInfo_;
        private GiftFlyMicInfo flyMicInfo_;
        private long giftNum_;
        private long giftSource_;
        private long id_;
        private boolean isGear_;
        private boolean isNamed_;
        private long lotteryGiftId_;
        private long luckyPrizeGiftInfoItemId_;
        private long step_;
        private long stickFacePositionType_;
        private long threshold_;
        private GiftItemBriefTray tray_;
        private String giftType_ = "";
        private String comboId_ = "";
        private String version_ = "";
        private String userName_ = "";
        private String userUrl_ = "";
        private String avatarTag_ = "";
        private String giftBottomTag_ = "";

        static {
            GiftItemBrief giftItemBrief = new GiftItemBrief();
            DEFAULT_INSTANCE = giftItemBrief;
            giftItemBrief.makeImmutable();
        }

        private GiftItemBrief() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAvatarTag() {
            this.avatarTag_ = getDefaultInstance().getAvatarTag();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearComboId() {
            this.comboId_ = getDefaultInstance().getComboId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCombos() {
            this.combos_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearExtraInfo() {
            this.extraInfo_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFlyMicInfo() {
            this.flyMicInfo_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGiftBottomTag() {
            this.giftBottomTag_ = getDefaultInstance().getGiftBottomTag();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGiftNum() {
            this.giftNum_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGiftSource() {
            this.giftSource_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGiftType() {
            this.giftType_ = getDefaultInstance().getGiftType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearId() {
            this.id_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIsGear() {
            this.isGear_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIsNamed() {
            this.isNamed_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLotteryGiftId() {
            this.lotteryGiftId_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLuckyPrizeGiftInfoItemId() {
            this.luckyPrizeGiftInfoItemId_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStep() {
            this.step_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStickFacePositionType() {
            this.stickFacePositionType_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearThreshold() {
            this.threshold_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTray() {
            this.tray_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUserName() {
            this.userName_ = getDefaultInstance().getUserName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUserUrl() {
            this.userUrl_ = getDefaultInstance().getUserUrl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVersion() {
            this.version_ = getDefaultInstance().getVersion();
        }

        public static GiftItemBrief getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeExtraInfo(LiveGiftExtraInfo liveGiftExtraInfo) {
            LiveGiftExtraInfo liveGiftExtraInfo2 = this.extraInfo_;
            if (liveGiftExtraInfo2 == null || liveGiftExtraInfo2 == LiveGiftExtraInfo.getDefaultInstance()) {
                this.extraInfo_ = liveGiftExtraInfo;
            } else {
                this.extraInfo_ = (LiveGiftExtraInfo) ((LiveGiftExtraInfo.Builder) LiveGiftExtraInfo.newBuilder(this.extraInfo_).mergeFrom(liveGiftExtraInfo)).buildPartial();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeFlyMicInfo(GiftFlyMicInfo giftFlyMicInfo) {
            GiftFlyMicInfo giftFlyMicInfo2 = this.flyMicInfo_;
            if (giftFlyMicInfo2 == null || giftFlyMicInfo2 == GiftFlyMicInfo.getDefaultInstance()) {
                this.flyMicInfo_ = giftFlyMicInfo;
            } else {
                this.flyMicInfo_ = (GiftFlyMicInfo) ((GiftFlyMicInfo.Builder) GiftFlyMicInfo.newBuilder(this.flyMicInfo_).mergeFrom(giftFlyMicInfo)).buildPartial();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeTray(GiftItemBriefTray giftItemBriefTray) {
            GiftItemBriefTray giftItemBriefTray2 = this.tray_;
            if (giftItemBriefTray2 == null || giftItemBriefTray2 == GiftItemBriefTray.getDefaultInstance()) {
                this.tray_ = giftItemBriefTray;
            } else {
                this.tray_ = (GiftItemBriefTray) ((GiftItemBriefTray.Builder) GiftItemBriefTray.newBuilder(this.tray_).mergeFrom(giftItemBriefTray)).buildPartial();
            }
        }

        public static Builder newBuilder(GiftItemBrief giftItemBrief) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(giftItemBrief);
        }

        public static GiftItemBrief parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (GiftItemBrief) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GiftItemBrief parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (GiftItemBrief) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<GiftItemBrief> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAvatarTag(String str) {
            str.getClass();
            this.avatarTag_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAvatarTagBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.avatarTag_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setComboId(String str) {
            str.getClass();
            this.comboId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setComboIdBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.comboId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCombos(long j) {
            this.combos_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setExtraInfo(LiveGiftExtraInfo.Builder builder) {
            this.extraInfo_ = (LiveGiftExtraInfo) builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFlyMicInfo(GiftFlyMicInfo.Builder builder) {
            this.flyMicInfo_ = (GiftFlyMicInfo) builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGiftBottomTag(String str) {
            str.getClass();
            this.giftBottomTag_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGiftBottomTagBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.giftBottomTag_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGiftNum(long j) {
            this.giftNum_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGiftSource(long j) {
            this.giftSource_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGiftType(String str) {
            str.getClass();
            this.giftType_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGiftTypeBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.giftType_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setId(long j) {
            this.id_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIsGear(boolean z) {
            this.isGear_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIsNamed(boolean z) {
            this.isNamed_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLotteryGiftId(long j) {
            this.lotteryGiftId_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLuckyPrizeGiftInfoItemId(long j) {
            this.luckyPrizeGiftInfoItemId_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStep(long j) {
            this.step_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStickFacePositionType(long j) {
            this.stickFacePositionType_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setThreshold(long j) {
            this.threshold_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTray(GiftItemBriefTray.Builder builder) {
            this.tray_ = (GiftItemBriefTray) builder.build();
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

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserUrl(String str) {
            str.getClass();
            this.userUrl_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserUrlBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.userUrl_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVersion(String str) {
            str.getClass();
            this.version_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVersionBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.version_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C03231.f1639xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new GiftItemBrief();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    GiftItemBrief giftItemBrief = (GiftItemBrief) obj2;
                    long j = this.id_;
                    boolean z2 = j != 0;
                    long j2 = giftItemBrief.id_;
                    this.id_ = hVar.i(z2, j, j2 != 0, j2);
                    this.giftType_ = hVar.f(!this.giftType_.isEmpty(), this.giftType_, !giftItemBrief.giftType_.isEmpty(), giftItemBrief.giftType_);
                    long j3 = this.combos_;
                    boolean z3 = j3 != 0;
                    long j4 = giftItemBrief.combos_;
                    this.combos_ = hVar.i(z3, j3, j4 != 0, j4);
                    this.comboId_ = hVar.f(!this.comboId_.isEmpty(), this.comboId_, !giftItemBrief.comboId_.isEmpty(), giftItemBrief.comboId_);
                    this.version_ = hVar.f(!this.version_.isEmpty(), this.version_, !giftItemBrief.version_.isEmpty(), giftItemBrief.version_);
                    this.userName_ = hVar.f(!this.userName_.isEmpty(), this.userName_, !giftItemBrief.userName_.isEmpty(), giftItemBrief.userName_);
                    this.userUrl_ = hVar.f(!this.userUrl_.isEmpty(), this.userUrl_, !giftItemBrief.userUrl_.isEmpty(), giftItemBrief.userUrl_);
                    long j5 = this.stickFacePositionType_;
                    boolean z4 = j5 != 0;
                    long j6 = giftItemBrief.stickFacePositionType_;
                    this.stickFacePositionType_ = hVar.i(z4, j5, j6 != 0, j6);
                    long j7 = this.luckyPrizeGiftInfoItemId_;
                    boolean z5 = j7 != 0;
                    long j8 = giftItemBrief.luckyPrizeGiftInfoItemId_;
                    this.luckyPrizeGiftInfoItemId_ = hVar.i(z5, j7, j8 != 0, j8);
                    long j9 = this.giftSource_;
                    boolean z6 = j9 != 0;
                    long j10 = giftItemBrief.giftSource_;
                    this.giftSource_ = hVar.i(z6, j9, j10 != 0, j10);
                    this.extraInfo_ = hVar.o(this.extraInfo_, giftItemBrief.extraInfo_);
                    long j11 = this.giftNum_;
                    boolean z7 = j11 != 0;
                    long j12 = giftItemBrief.giftNum_;
                    this.giftNum_ = hVar.i(z7, j11, j12 != 0, j12);
                    boolean z8 = this.isGear_;
                    boolean z9 = giftItemBrief.isGear_;
                    this.isGear_ = hVar.d(z8, z8, z9, z9);
                    long j13 = this.threshold_;
                    boolean z10 = j13 != 0;
                    long j14 = giftItemBrief.threshold_;
                    this.threshold_ = hVar.i(z10, j13, j14 != 0, j14);
                    long j15 = this.step_;
                    boolean z11 = j15 != 0;
                    long j16 = giftItemBrief.step_;
                    this.step_ = hVar.i(z11, j15, j16 != 0, j16);
                    boolean z12 = this.isNamed_;
                    boolean z13 = giftItemBrief.isNamed_;
                    this.isNamed_ = hVar.d(z12, z12, z13, z13);
                    this.tray_ = hVar.o(this.tray_, giftItemBrief.tray_);
                    this.flyMicInfo_ = hVar.o(this.flyMicInfo_, giftItemBrief.flyMicInfo_);
                    long j17 = this.lotteryGiftId_;
                    boolean z14 = j17 != 0;
                    long j18 = giftItemBrief.lotteryGiftId_;
                    this.lotteryGiftId_ = hVar.i(z14, j17, j18 != 0, j18);
                    this.avatarTag_ = hVar.f(!this.avatarTag_.isEmpty(), this.avatarTag_, !giftItemBrief.avatarTag_.isEmpty(), giftItemBrief.avatarTag_);
                    this.giftBottomTag_ = hVar.f(!this.giftBottomTag_.isEmpty(), this.giftBottomTag_, !giftItemBrief.giftBottomTag_.isEmpty(), giftItemBrief.giftBottomTag_);
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
                                case 8:
                                    this.id_ = eVar.v();
                                    continue;
                                case 18:
                                    this.giftType_ = eVar.L();
                                    continue;
                                case 24:
                                    this.combos_ = eVar.v();
                                    continue;
                                case 34:
                                    this.comboId_ = eVar.L();
                                    continue;
                                case 42:
                                    this.version_ = eVar.L();
                                    continue;
                                case 50:
                                    this.userName_ = eVar.L();
                                    continue;
                                case 58:
                                    this.userUrl_ = eVar.L();
                                    continue;
                                case 64:
                                    this.stickFacePositionType_ = eVar.v();
                                    continue;
                                case 72:
                                    this.luckyPrizeGiftInfoItemId_ = eVar.v();
                                    continue;
                                case 80:
                                    this.giftSource_ = eVar.v();
                                    continue;
                                case 90:
                                    LiveGiftExtraInfo liveGiftExtraInfo = this.extraInfo_;
                                    LiveGiftExtraInfo.Builder builder = liveGiftExtraInfo != null ? (LiveGiftExtraInfo.Builder) liveGiftExtraInfo.toBuilder() : null;
                                    LiveGiftExtraInfo liveGiftExtraInfoW = eVar.w(LiveGiftExtraInfo.parser(), hVar2);
                                    this.extraInfo_ = liveGiftExtraInfoW;
                                    if (builder != null) {
                                        builder.mergeFrom(liveGiftExtraInfoW);
                                        this.extraInfo_ = (LiveGiftExtraInfo) builder.buildPartial();
                                    } else {
                                        continue;
                                    }
                                    break;
                                case 96:
                                    this.giftNum_ = eVar.v();
                                    continue;
                                case 104:
                                    this.isGear_ = eVar.m();
                                    continue;
                                case 112:
                                    this.threshold_ = eVar.v();
                                    continue;
                                case 120:
                                    this.step_ = eVar.v();
                                    continue;
                                case 128:
                                    this.isNamed_ = eVar.m();
                                    continue;
                                case 138:
                                    GiftItemBriefTray giftItemBriefTray = this.tray_;
                                    GiftItemBriefTray.Builder builder2 = giftItemBriefTray != null ? (GiftItemBriefTray.Builder) giftItemBriefTray.toBuilder() : null;
                                    GiftItemBriefTray giftItemBriefTrayW = eVar.w(GiftItemBriefTray.parser(), hVar2);
                                    this.tray_ = giftItemBriefTrayW;
                                    if (builder2 != null) {
                                        builder2.mergeFrom(giftItemBriefTrayW);
                                        this.tray_ = (GiftItemBriefTray) builder2.buildPartial();
                                    } else {
                                        continue;
                                    }
                                    break;
                                case 146:
                                    GiftFlyMicInfo giftFlyMicInfo = this.flyMicInfo_;
                                    GiftFlyMicInfo.Builder builder3 = giftFlyMicInfo != null ? (GiftFlyMicInfo.Builder) giftFlyMicInfo.toBuilder() : null;
                                    GiftFlyMicInfo giftFlyMicInfoW = eVar.w(GiftFlyMicInfo.parser(), hVar2);
                                    this.flyMicInfo_ = giftFlyMicInfoW;
                                    if (builder3 != null) {
                                        builder3.mergeFrom(giftFlyMicInfoW);
                                        this.flyMicInfo_ = (GiftFlyMicInfo) builder3.buildPartial();
                                    } else {
                                        continue;
                                    }
                                    break;
                                case 152:
                                    this.lotteryGiftId_ = eVar.v();
                                    continue;
                                case 162:
                                    this.avatarTag_ = eVar.L();
                                    continue;
                                case 170:
                                    this.giftBottomTag_ = eVar.L();
                                    continue;
                                default:
                                    if (!eVar.R(iM)) {
                                        break;
                                    }
                                    break;
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
                        synchronized (GiftItemBrief.class) {
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

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.GiftItemBriefOrBuilder
        public String getAvatarTag() {
            return this.avatarTag_;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.GiftItemBriefOrBuilder
        public ByteString getAvatarTagBytes() {
            return ByteString.copyFromUtf8(this.avatarTag_);
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.GiftItemBriefOrBuilder
        public String getComboId() {
            return this.comboId_;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.GiftItemBriefOrBuilder
        public ByteString getComboIdBytes() {
            return ByteString.copyFromUtf8(this.comboId_);
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.GiftItemBriefOrBuilder
        public long getCombos() {
            return this.combos_;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.GiftItemBriefOrBuilder
        public LiveGiftExtraInfo getExtraInfo() {
            LiveGiftExtraInfo liveGiftExtraInfo = this.extraInfo_;
            return liveGiftExtraInfo == null ? LiveGiftExtraInfo.getDefaultInstance() : liveGiftExtraInfo;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.GiftItemBriefOrBuilder
        public GiftFlyMicInfo getFlyMicInfo() {
            GiftFlyMicInfo giftFlyMicInfo = this.flyMicInfo_;
            return giftFlyMicInfo == null ? GiftFlyMicInfo.getDefaultInstance() : giftFlyMicInfo;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.GiftItemBriefOrBuilder
        public String getGiftBottomTag() {
            return this.giftBottomTag_;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.GiftItemBriefOrBuilder
        public ByteString getGiftBottomTagBytes() {
            return ByteString.copyFromUtf8(this.giftBottomTag_);
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.GiftItemBriefOrBuilder
        public long getGiftNum() {
            return this.giftNum_;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.GiftItemBriefOrBuilder
        public long getGiftSource() {
            return this.giftSource_;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.GiftItemBriefOrBuilder
        public String getGiftType() {
            return this.giftType_;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.GiftItemBriefOrBuilder
        public ByteString getGiftTypeBytes() {
            return ByteString.copyFromUtf8(this.giftType_);
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.GiftItemBriefOrBuilder
        public long getId() {
            return this.id_;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.GiftItemBriefOrBuilder
        public boolean getIsGear() {
            return this.isGear_;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.GiftItemBriefOrBuilder
        public boolean getIsNamed() {
            return this.isNamed_;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.GiftItemBriefOrBuilder
        public long getLotteryGiftId() {
            return this.lotteryGiftId_;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.GiftItemBriefOrBuilder
        public long getLuckyPrizeGiftInfoItemId() {
            return this.luckyPrizeGiftInfoItemId_;
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            long j = this.id_;
            int iV = j != 0 ? CodedOutputStream.v(1, j) : 0;
            if (!this.giftType_.isEmpty()) {
                iV += CodedOutputStream.K(2, getGiftType());
            }
            long j2 = this.combos_;
            if (j2 != 0) {
                iV += CodedOutputStream.v(3, j2);
            }
            if (!this.comboId_.isEmpty()) {
                iV += CodedOutputStream.K(4, getComboId());
            }
            if (!this.version_.isEmpty()) {
                iV += CodedOutputStream.K(5, getVersion());
            }
            if (!this.userName_.isEmpty()) {
                iV += CodedOutputStream.K(6, getUserName());
            }
            if (!this.userUrl_.isEmpty()) {
                iV += CodedOutputStream.K(7, getUserUrl());
            }
            long j3 = this.stickFacePositionType_;
            if (j3 != 0) {
                iV += CodedOutputStream.v(8, j3);
            }
            long j4 = this.luckyPrizeGiftInfoItemId_;
            if (j4 != 0) {
                iV += CodedOutputStream.v(9, j4);
            }
            long j5 = this.giftSource_;
            if (j5 != 0) {
                iV += CodedOutputStream.v(10, j5);
            }
            if (this.extraInfo_ != null) {
                iV += CodedOutputStream.C(11, getExtraInfo());
            }
            long j6 = this.giftNum_;
            if (j6 != 0) {
                iV += CodedOutputStream.v(12, j6);
            }
            boolean z = this.isGear_;
            if (z) {
                iV += CodedOutputStream.f(13, z);
            }
            long j7 = this.threshold_;
            if (j7 != 0) {
                iV += CodedOutputStream.v(14, j7);
            }
            long j8 = this.step_;
            if (j8 != 0) {
                iV += CodedOutputStream.v(15, j8);
            }
            boolean z2 = this.isNamed_;
            if (z2) {
                iV += CodedOutputStream.f(16, z2);
            }
            if (this.tray_ != null) {
                iV += CodedOutputStream.C(17, getTray());
            }
            if (this.flyMicInfo_ != null) {
                iV += CodedOutputStream.C(18, getFlyMicInfo());
            }
            long j9 = this.lotteryGiftId_;
            if (j9 != 0) {
                iV += CodedOutputStream.v(19, j9);
            }
            if (!this.avatarTag_.isEmpty()) {
                iV += CodedOutputStream.K(20, getAvatarTag());
            }
            if (!this.giftBottomTag_.isEmpty()) {
                iV += CodedOutputStream.K(21, getGiftBottomTag());
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iV;
            return iV;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.GiftItemBriefOrBuilder
        public long getStep() {
            return this.step_;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.GiftItemBriefOrBuilder
        public long getStickFacePositionType() {
            return this.stickFacePositionType_;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.GiftItemBriefOrBuilder
        public long getThreshold() {
            return this.threshold_;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.GiftItemBriefOrBuilder
        public GiftItemBriefTray getTray() {
            GiftItemBriefTray giftItemBriefTray = this.tray_;
            return giftItemBriefTray == null ? GiftItemBriefTray.getDefaultInstance() : giftItemBriefTray;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.GiftItemBriefOrBuilder
        public String getUserName() {
            return this.userName_;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.GiftItemBriefOrBuilder
        public ByteString getUserNameBytes() {
            return ByteString.copyFromUtf8(this.userName_);
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.GiftItemBriefOrBuilder
        public String getUserUrl() {
            return this.userUrl_;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.GiftItemBriefOrBuilder
        public ByteString getUserUrlBytes() {
            return ByteString.copyFromUtf8(this.userUrl_);
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.GiftItemBriefOrBuilder
        public String getVersion() {
            return this.version_;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.GiftItemBriefOrBuilder
        public ByteString getVersionBytes() {
            return ByteString.copyFromUtf8(this.version_);
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.GiftItemBriefOrBuilder
        public boolean hasExtraInfo() {
            return this.extraInfo_ != null;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.GiftItemBriefOrBuilder
        public boolean hasFlyMicInfo() {
            return this.flyMicInfo_ != null;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.GiftItemBriefOrBuilder
        public boolean hasTray() {
            return this.tray_ != null;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            long j = this.id_;
            if (j != 0) {
                codedOutputStream.u0(1, j);
            }
            if (!this.giftType_.isEmpty()) {
                codedOutputStream.D0(2, getGiftType());
            }
            long j2 = this.combos_;
            if (j2 != 0) {
                codedOutputStream.u0(3, j2);
            }
            if (!this.comboId_.isEmpty()) {
                codedOutputStream.D0(4, getComboId());
            }
            if (!this.version_.isEmpty()) {
                codedOutputStream.D0(5, getVersion());
            }
            if (!this.userName_.isEmpty()) {
                codedOutputStream.D0(6, getUserName());
            }
            if (!this.userUrl_.isEmpty()) {
                codedOutputStream.D0(7, getUserUrl());
            }
            long j3 = this.stickFacePositionType_;
            if (j3 != 0) {
                codedOutputStream.u0(8, j3);
            }
            long j4 = this.luckyPrizeGiftInfoItemId_;
            if (j4 != 0) {
                codedOutputStream.u0(9, j4);
            }
            long j5 = this.giftSource_;
            if (j5 != 0) {
                codedOutputStream.u0(10, j5);
            }
            if (this.extraInfo_ != null) {
                codedOutputStream.w0(11, getExtraInfo());
            }
            long j6 = this.giftNum_;
            if (j6 != 0) {
                codedOutputStream.u0(12, j6);
            }
            boolean z = this.isGear_;
            if (z) {
                codedOutputStream.a0(13, z);
            }
            long j7 = this.threshold_;
            if (j7 != 0) {
                codedOutputStream.u0(14, j7);
            }
            long j8 = this.step_;
            if (j8 != 0) {
                codedOutputStream.u0(15, j8);
            }
            boolean z2 = this.isNamed_;
            if (z2) {
                codedOutputStream.a0(16, z2);
            }
            if (this.tray_ != null) {
                codedOutputStream.w0(17, getTray());
            }
            if (this.flyMicInfo_ != null) {
                codedOutputStream.w0(18, getFlyMicInfo());
            }
            long j9 = this.lotteryGiftId_;
            if (j9 != 0) {
                codedOutputStream.u0(19, j9);
            }
            if (!this.avatarTag_.isEmpty()) {
                codedOutputStream.D0(20, getAvatarTag());
            }
            if (this.giftBottomTag_.isEmpty()) {
                return;
            }
            codedOutputStream.D0(21, getGiftBottomTag());
        }

        public static GiftItemBrief parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (GiftItemBrief) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static GiftItemBrief parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (GiftItemBrief) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setExtraInfo(LiveGiftExtraInfo liveGiftExtraInfo) {
            liveGiftExtraInfo.getClass();
            this.extraInfo_ = liveGiftExtraInfo;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFlyMicInfo(GiftFlyMicInfo giftFlyMicInfo) {
            giftFlyMicInfo.getClass();
            this.flyMicInfo_ = giftFlyMicInfo;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTray(GiftItemBriefTray giftItemBriefTray) {
            giftItemBriefTray.getClass();
            this.tray_ = giftItemBriefTray;
        }

        public static final class Builder extends GeneratedMessageLite.b<GiftItemBrief, Builder> implements GiftItemBriefOrBuilder {
            private Builder() {
                super(GiftItemBrief.DEFAULT_INSTANCE);
            }

            public Builder clearAvatarTag() {
                copyOnWrite();
                ((GiftItemBrief) ((GeneratedMessageLite.b) this).instance).clearAvatarTag();
                return this;
            }

            public Builder clearComboId() {
                copyOnWrite();
                ((GiftItemBrief) ((GeneratedMessageLite.b) this).instance).clearComboId();
                return this;
            }

            public Builder clearCombos() {
                copyOnWrite();
                ((GiftItemBrief) ((GeneratedMessageLite.b) this).instance).clearCombos();
                return this;
            }

            public Builder clearExtraInfo() {
                copyOnWrite();
                ((GiftItemBrief) ((GeneratedMessageLite.b) this).instance).clearExtraInfo();
                return this;
            }

            public Builder clearFlyMicInfo() {
                copyOnWrite();
                ((GiftItemBrief) ((GeneratedMessageLite.b) this).instance).clearFlyMicInfo();
                return this;
            }

            public Builder clearGiftBottomTag() {
                copyOnWrite();
                ((GiftItemBrief) ((GeneratedMessageLite.b) this).instance).clearGiftBottomTag();
                return this;
            }

            public Builder clearGiftNum() {
                copyOnWrite();
                ((GiftItemBrief) ((GeneratedMessageLite.b) this).instance).clearGiftNum();
                return this;
            }

            public Builder clearGiftSource() {
                copyOnWrite();
                ((GiftItemBrief) ((GeneratedMessageLite.b) this).instance).clearGiftSource();
                return this;
            }

            public Builder clearGiftType() {
                copyOnWrite();
                ((GiftItemBrief) ((GeneratedMessageLite.b) this).instance).clearGiftType();
                return this;
            }

            public Builder clearId() {
                copyOnWrite();
                ((GiftItemBrief) ((GeneratedMessageLite.b) this).instance).clearId();
                return this;
            }

            public Builder clearIsGear() {
                copyOnWrite();
                ((GiftItemBrief) ((GeneratedMessageLite.b) this).instance).clearIsGear();
                return this;
            }

            public Builder clearIsNamed() {
                copyOnWrite();
                ((GiftItemBrief) ((GeneratedMessageLite.b) this).instance).clearIsNamed();
                return this;
            }

            public Builder clearLotteryGiftId() {
                copyOnWrite();
                ((GiftItemBrief) ((GeneratedMessageLite.b) this).instance).clearLotteryGiftId();
                return this;
            }

            public Builder clearLuckyPrizeGiftInfoItemId() {
                copyOnWrite();
                ((GiftItemBrief) ((GeneratedMessageLite.b) this).instance).clearLuckyPrizeGiftInfoItemId();
                return this;
            }

            public Builder clearStep() {
                copyOnWrite();
                ((GiftItemBrief) ((GeneratedMessageLite.b) this).instance).clearStep();
                return this;
            }

            public Builder clearStickFacePositionType() {
                copyOnWrite();
                ((GiftItemBrief) ((GeneratedMessageLite.b) this).instance).clearStickFacePositionType();
                return this;
            }

            public Builder clearThreshold() {
                copyOnWrite();
                ((GiftItemBrief) ((GeneratedMessageLite.b) this).instance).clearThreshold();
                return this;
            }

            public Builder clearTray() {
                copyOnWrite();
                ((GiftItemBrief) ((GeneratedMessageLite.b) this).instance).clearTray();
                return this;
            }

            public Builder clearUserName() {
                copyOnWrite();
                ((GiftItemBrief) ((GeneratedMessageLite.b) this).instance).clearUserName();
                return this;
            }

            public Builder clearUserUrl() {
                copyOnWrite();
                ((GiftItemBrief) ((GeneratedMessageLite.b) this).instance).clearUserUrl();
                return this;
            }

            public Builder clearVersion() {
                copyOnWrite();
                ((GiftItemBrief) ((GeneratedMessageLite.b) this).instance).clearVersion();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.GiftItemBriefOrBuilder
            public String getAvatarTag() {
                return ((GiftItemBrief) ((GeneratedMessageLite.b) this).instance).getAvatarTag();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.GiftItemBriefOrBuilder
            public ByteString getAvatarTagBytes() {
                return ((GiftItemBrief) ((GeneratedMessageLite.b) this).instance).getAvatarTagBytes();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.GiftItemBriefOrBuilder
            public String getComboId() {
                return ((GiftItemBrief) ((GeneratedMessageLite.b) this).instance).getComboId();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.GiftItemBriefOrBuilder
            public ByteString getComboIdBytes() {
                return ((GiftItemBrief) ((GeneratedMessageLite.b) this).instance).getComboIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.GiftItemBriefOrBuilder
            public long getCombos() {
                return ((GiftItemBrief) ((GeneratedMessageLite.b) this).instance).getCombos();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.GiftItemBriefOrBuilder
            public LiveGiftExtraInfo getExtraInfo() {
                return ((GiftItemBrief) ((GeneratedMessageLite.b) this).instance).getExtraInfo();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.GiftItemBriefOrBuilder
            public GiftFlyMicInfo getFlyMicInfo() {
                return ((GiftItemBrief) ((GeneratedMessageLite.b) this).instance).getFlyMicInfo();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.GiftItemBriefOrBuilder
            public String getGiftBottomTag() {
                return ((GiftItemBrief) ((GeneratedMessageLite.b) this).instance).getGiftBottomTag();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.GiftItemBriefOrBuilder
            public ByteString getGiftBottomTagBytes() {
                return ((GiftItemBrief) ((GeneratedMessageLite.b) this).instance).getGiftBottomTagBytes();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.GiftItemBriefOrBuilder
            public long getGiftNum() {
                return ((GiftItemBrief) ((GeneratedMessageLite.b) this).instance).getGiftNum();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.GiftItemBriefOrBuilder
            public long getGiftSource() {
                return ((GiftItemBrief) ((GeneratedMessageLite.b) this).instance).getGiftSource();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.GiftItemBriefOrBuilder
            public String getGiftType() {
                return ((GiftItemBrief) ((GeneratedMessageLite.b) this).instance).getGiftType();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.GiftItemBriefOrBuilder
            public ByteString getGiftTypeBytes() {
                return ((GiftItemBrief) ((GeneratedMessageLite.b) this).instance).getGiftTypeBytes();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.GiftItemBriefOrBuilder
            public long getId() {
                return ((GiftItemBrief) ((GeneratedMessageLite.b) this).instance).getId();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.GiftItemBriefOrBuilder
            public boolean getIsGear() {
                return ((GiftItemBrief) ((GeneratedMessageLite.b) this).instance).getIsGear();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.GiftItemBriefOrBuilder
            public boolean getIsNamed() {
                return ((GiftItemBrief) ((GeneratedMessageLite.b) this).instance).getIsNamed();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.GiftItemBriefOrBuilder
            public long getLotteryGiftId() {
                return ((GiftItemBrief) ((GeneratedMessageLite.b) this).instance).getLotteryGiftId();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.GiftItemBriefOrBuilder
            public long getLuckyPrizeGiftInfoItemId() {
                return ((GiftItemBrief) ((GeneratedMessageLite.b) this).instance).getLuckyPrizeGiftInfoItemId();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.GiftItemBriefOrBuilder
            public long getStep() {
                return ((GiftItemBrief) ((GeneratedMessageLite.b) this).instance).getStep();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.GiftItemBriefOrBuilder
            public long getStickFacePositionType() {
                return ((GiftItemBrief) ((GeneratedMessageLite.b) this).instance).getStickFacePositionType();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.GiftItemBriefOrBuilder
            public long getThreshold() {
                return ((GiftItemBrief) ((GeneratedMessageLite.b) this).instance).getThreshold();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.GiftItemBriefOrBuilder
            public GiftItemBriefTray getTray() {
                return ((GiftItemBrief) ((GeneratedMessageLite.b) this).instance).getTray();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.GiftItemBriefOrBuilder
            public String getUserName() {
                return ((GiftItemBrief) ((GeneratedMessageLite.b) this).instance).getUserName();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.GiftItemBriefOrBuilder
            public ByteString getUserNameBytes() {
                return ((GiftItemBrief) ((GeneratedMessageLite.b) this).instance).getUserNameBytes();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.GiftItemBriefOrBuilder
            public String getUserUrl() {
                return ((GiftItemBrief) ((GeneratedMessageLite.b) this).instance).getUserUrl();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.GiftItemBriefOrBuilder
            public ByteString getUserUrlBytes() {
                return ((GiftItemBrief) ((GeneratedMessageLite.b) this).instance).getUserUrlBytes();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.GiftItemBriefOrBuilder
            public String getVersion() {
                return ((GiftItemBrief) ((GeneratedMessageLite.b) this).instance).getVersion();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.GiftItemBriefOrBuilder
            public ByteString getVersionBytes() {
                return ((GiftItemBrief) ((GeneratedMessageLite.b) this).instance).getVersionBytes();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.GiftItemBriefOrBuilder
            public boolean hasExtraInfo() {
                return ((GiftItemBrief) ((GeneratedMessageLite.b) this).instance).hasExtraInfo();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.GiftItemBriefOrBuilder
            public boolean hasFlyMicInfo() {
                return ((GiftItemBrief) ((GeneratedMessageLite.b) this).instance).hasFlyMicInfo();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.GiftItemBriefOrBuilder
            public boolean hasTray() {
                return ((GiftItemBrief) ((GeneratedMessageLite.b) this).instance).hasTray();
            }

            public Builder mergeExtraInfo(LiveGiftExtraInfo liveGiftExtraInfo) {
                copyOnWrite();
                ((GiftItemBrief) ((GeneratedMessageLite.b) this).instance).mergeExtraInfo(liveGiftExtraInfo);
                return this;
            }

            public Builder mergeFlyMicInfo(GiftFlyMicInfo giftFlyMicInfo) {
                copyOnWrite();
                ((GiftItemBrief) ((GeneratedMessageLite.b) this).instance).mergeFlyMicInfo(giftFlyMicInfo);
                return this;
            }

            public Builder mergeTray(GiftItemBriefTray giftItemBriefTray) {
                copyOnWrite();
                ((GiftItemBrief) ((GeneratedMessageLite.b) this).instance).mergeTray(giftItemBriefTray);
                return this;
            }

            public Builder setAvatarTag(String str) {
                copyOnWrite();
                ((GiftItemBrief) ((GeneratedMessageLite.b) this).instance).setAvatarTag(str);
                return this;
            }

            public Builder setAvatarTagBytes(ByteString byteString) {
                copyOnWrite();
                ((GiftItemBrief) ((GeneratedMessageLite.b) this).instance).setAvatarTagBytes(byteString);
                return this;
            }

            public Builder setComboId(String str) {
                copyOnWrite();
                ((GiftItemBrief) ((GeneratedMessageLite.b) this).instance).setComboId(str);
                return this;
            }

            public Builder setComboIdBytes(ByteString byteString) {
                copyOnWrite();
                ((GiftItemBrief) ((GeneratedMessageLite.b) this).instance).setComboIdBytes(byteString);
                return this;
            }

            public Builder setCombos(long j) {
                copyOnWrite();
                ((GiftItemBrief) ((GeneratedMessageLite.b) this).instance).setCombos(j);
                return this;
            }

            public Builder setExtraInfo(LiveGiftExtraInfo liveGiftExtraInfo) {
                copyOnWrite();
                ((GiftItemBrief) ((GeneratedMessageLite.b) this).instance).setExtraInfo(liveGiftExtraInfo);
                return this;
            }

            public Builder setFlyMicInfo(GiftFlyMicInfo giftFlyMicInfo) {
                copyOnWrite();
                ((GiftItemBrief) ((GeneratedMessageLite.b) this).instance).setFlyMicInfo(giftFlyMicInfo);
                return this;
            }

            public Builder setGiftBottomTag(String str) {
                copyOnWrite();
                ((GiftItemBrief) ((GeneratedMessageLite.b) this).instance).setGiftBottomTag(str);
                return this;
            }

            public Builder setGiftBottomTagBytes(ByteString byteString) {
                copyOnWrite();
                ((GiftItemBrief) ((GeneratedMessageLite.b) this).instance).setGiftBottomTagBytes(byteString);
                return this;
            }

            public Builder setGiftNum(long j) {
                copyOnWrite();
                ((GiftItemBrief) ((GeneratedMessageLite.b) this).instance).setGiftNum(j);
                return this;
            }

            public Builder setGiftSource(long j) {
                copyOnWrite();
                ((GiftItemBrief) ((GeneratedMessageLite.b) this).instance).setGiftSource(j);
                return this;
            }

            public Builder setGiftType(String str) {
                copyOnWrite();
                ((GiftItemBrief) ((GeneratedMessageLite.b) this).instance).setGiftType(str);
                return this;
            }

            public Builder setGiftTypeBytes(ByteString byteString) {
                copyOnWrite();
                ((GiftItemBrief) ((GeneratedMessageLite.b) this).instance).setGiftTypeBytes(byteString);
                return this;
            }

            public Builder setId(long j) {
                copyOnWrite();
                ((GiftItemBrief) ((GeneratedMessageLite.b) this).instance).setId(j);
                return this;
            }

            public Builder setIsGear(boolean z) {
                copyOnWrite();
                ((GiftItemBrief) ((GeneratedMessageLite.b) this).instance).setIsGear(z);
                return this;
            }

            public Builder setIsNamed(boolean z) {
                copyOnWrite();
                ((GiftItemBrief) ((GeneratedMessageLite.b) this).instance).setIsNamed(z);
                return this;
            }

            public Builder setLotteryGiftId(long j) {
                copyOnWrite();
                ((GiftItemBrief) ((GeneratedMessageLite.b) this).instance).setLotteryGiftId(j);
                return this;
            }

            public Builder setLuckyPrizeGiftInfoItemId(long j) {
                copyOnWrite();
                ((GiftItemBrief) ((GeneratedMessageLite.b) this).instance).setLuckyPrizeGiftInfoItemId(j);
                return this;
            }

            public Builder setStep(long j) {
                copyOnWrite();
                ((GiftItemBrief) ((GeneratedMessageLite.b) this).instance).setStep(j);
                return this;
            }

            public Builder setStickFacePositionType(long j) {
                copyOnWrite();
                ((GiftItemBrief) ((GeneratedMessageLite.b) this).instance).setStickFacePositionType(j);
                return this;
            }

            public Builder setThreshold(long j) {
                copyOnWrite();
                ((GiftItemBrief) ((GeneratedMessageLite.b) this).instance).setThreshold(j);
                return this;
            }

            public Builder setTray(GiftItemBriefTray giftItemBriefTray) {
                copyOnWrite();
                ((GiftItemBrief) ((GeneratedMessageLite.b) this).instance).setTray(giftItemBriefTray);
                return this;
            }

            public Builder setUserName(String str) {
                copyOnWrite();
                ((GiftItemBrief) ((GeneratedMessageLite.b) this).instance).setUserName(str);
                return this;
            }

            public Builder setUserNameBytes(ByteString byteString) {
                copyOnWrite();
                ((GiftItemBrief) ((GeneratedMessageLite.b) this).instance).setUserNameBytes(byteString);
                return this;
            }

            public Builder setUserUrl(String str) {
                copyOnWrite();
                ((GiftItemBrief) ((GeneratedMessageLite.b) this).instance).setUserUrl(str);
                return this;
            }

            public Builder setUserUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((GiftItemBrief) ((GeneratedMessageLite.b) this).instance).setUserUrlBytes(byteString);
                return this;
            }

            public Builder setVersion(String str) {
                copyOnWrite();
                ((GiftItemBrief) ((GeneratedMessageLite.b) this).instance).setVersion(str);
                return this;
            }

            public Builder setVersionBytes(ByteString byteString) {
                copyOnWrite();
                ((GiftItemBrief) ((GeneratedMessageLite.b) this).instance).setVersionBytes(byteString);
                return this;
            }

            public Builder setExtraInfo(LiveGiftExtraInfo.Builder builder) {
                copyOnWrite();
                ((GiftItemBrief) ((GeneratedMessageLite.b) this).instance).setExtraInfo(builder);
                return this;
            }

            public Builder setFlyMicInfo(GiftFlyMicInfo.Builder builder) {
                copyOnWrite();
                ((GiftItemBrief) ((GeneratedMessageLite.b) this).instance).setFlyMicInfo(builder);
                return this;
            }

            public Builder setTray(GiftItemBriefTray.Builder builder) {
                copyOnWrite();
                ((GiftItemBrief) ((GeneratedMessageLite.b) this).instance).setTray(builder);
                return this;
            }
        }

        public static GiftItemBrief parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (GiftItemBrief) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static GiftItemBrief parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (GiftItemBrief) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static GiftItemBrief parseFrom(InputStream inputStream) throws IOException {
            return (GiftItemBrief) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GiftItemBrief parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (GiftItemBrief) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static GiftItemBrief parseFrom(e eVar) throws IOException {
            return (GiftItemBrief) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static GiftItemBrief parseFrom(e eVar, h hVar) throws IOException {
            return (GiftItemBrief) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public static final class GiftItemBriefTray extends GeneratedMessageLite<GiftItemBriefTray, Builder> implements GiftItemBriefTrayOrBuilder {
        public static final int BACKGROUND_FIELD_NUMBER = 2;
        private static final GiftItemBriefTray DEFAULT_INSTANCE;
        private static volatile i860<GiftItemBriefTray> PARSER = null;
        public static final int SVG_FIELD_NUMBER = 1;
        private String svg_ = "";
        private String background_ = "";

        public static final class Builder extends GeneratedMessageLite.b<GiftItemBriefTray, Builder> implements GiftItemBriefTrayOrBuilder {
            private Builder() {
                super(GiftItemBriefTray.DEFAULT_INSTANCE);
            }

            public Builder clearBackground() {
                copyOnWrite();
                ((GiftItemBriefTray) ((GeneratedMessageLite.b) this).instance).clearBackground();
                return this;
            }

            public Builder clearSvg() {
                copyOnWrite();
                ((GiftItemBriefTray) ((GeneratedMessageLite.b) this).instance).clearSvg();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.GiftItemBriefTrayOrBuilder
            public String getBackground() {
                return ((GiftItemBriefTray) ((GeneratedMessageLite.b) this).instance).getBackground();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.GiftItemBriefTrayOrBuilder
            public ByteString getBackgroundBytes() {
                return ((GiftItemBriefTray) ((GeneratedMessageLite.b) this).instance).getBackgroundBytes();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.GiftItemBriefTrayOrBuilder
            public String getSvg() {
                return ((GiftItemBriefTray) ((GeneratedMessageLite.b) this).instance).getSvg();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.GiftItemBriefTrayOrBuilder
            public ByteString getSvgBytes() {
                return ((GiftItemBriefTray) ((GeneratedMessageLite.b) this).instance).getSvgBytes();
            }

            public Builder setBackground(String str) {
                copyOnWrite();
                ((GiftItemBriefTray) ((GeneratedMessageLite.b) this).instance).setBackground(str);
                return this;
            }

            public Builder setBackgroundBytes(ByteString byteString) {
                copyOnWrite();
                ((GiftItemBriefTray) ((GeneratedMessageLite.b) this).instance).setBackgroundBytes(byteString);
                return this;
            }

            public Builder setSvg(String str) {
                copyOnWrite();
                ((GiftItemBriefTray) ((GeneratedMessageLite.b) this).instance).setSvg(str);
                return this;
            }

            public Builder setSvgBytes(ByteString byteString) {
                copyOnWrite();
                ((GiftItemBriefTray) ((GeneratedMessageLite.b) this).instance).setSvgBytes(byteString);
                return this;
            }
        }

        static {
            GiftItemBriefTray giftItemBriefTray = new GiftItemBriefTray();
            DEFAULT_INSTANCE = giftItemBriefTray;
            giftItemBriefTray.makeImmutable();
        }

        private GiftItemBriefTray() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBackground() {
            this.background_ = getDefaultInstance().getBackground();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSvg() {
            this.svg_ = getDefaultInstance().getSvg();
        }

        public static GiftItemBriefTray getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(GiftItemBriefTray giftItemBriefTray) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(giftItemBriefTray);
        }

        public static GiftItemBriefTray parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (GiftItemBriefTray) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GiftItemBriefTray parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (GiftItemBriefTray) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<GiftItemBriefTray> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBackground(String str) {
            str.getClass();
            this.background_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBackgroundBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.background_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSvg(String str) {
            str.getClass();
            this.svg_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSvgBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.svg_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C03231.f1639xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new GiftItemBriefTray();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    GiftItemBriefTray giftItemBriefTray = (GiftItemBriefTray) obj2;
                    this.svg_ = hVar.f(!this.svg_.isEmpty(), this.svg_, !giftItemBriefTray.svg_.isEmpty(), giftItemBriefTray.svg_);
                    this.background_ = hVar.f(!this.background_.isEmpty(), this.background_, true ^ giftItemBriefTray.background_.isEmpty(), giftItemBriefTray.background_);
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
                                    this.svg_ = eVar.L();
                                } else if (iM == 18) {
                                    this.background_ = eVar.L();
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
                        synchronized (GiftItemBriefTray.class) {
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

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.GiftItemBriefTrayOrBuilder
        public String getBackground() {
            return this.background_;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.GiftItemBriefTrayOrBuilder
        public ByteString getBackgroundBytes() {
            return ByteString.copyFromUtf8(this.background_);
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iK = !this.svg_.isEmpty() ? CodedOutputStream.K(1, getSvg()) : 0;
            if (!this.background_.isEmpty()) {
                iK += CodedOutputStream.K(2, getBackground());
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iK;
            return iK;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.GiftItemBriefTrayOrBuilder
        public String getSvg() {
            return this.svg_;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.GiftItemBriefTrayOrBuilder
        public ByteString getSvgBytes() {
            return ByteString.copyFromUtf8(this.svg_);
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.svg_.isEmpty()) {
                codedOutputStream.D0(1, getSvg());
            }
            if (this.background_.isEmpty()) {
                return;
            }
            codedOutputStream.D0(2, getBackground());
        }

        public static GiftItemBriefTray parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (GiftItemBriefTray) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static GiftItemBriefTray parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (GiftItemBriefTray) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static GiftItemBriefTray parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (GiftItemBriefTray) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static GiftItemBriefTray parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (GiftItemBriefTray) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static GiftItemBriefTray parseFrom(InputStream inputStream) throws IOException {
            return (GiftItemBriefTray) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GiftItemBriefTray parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (GiftItemBriefTray) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static GiftItemBriefTray parseFrom(e eVar) throws IOException {
            return (GiftItemBriefTray) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static GiftItemBriefTray parseFrom(e eVar, h hVar) throws IOException {
            return (GiftItemBriefTray) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public static final class GiftVideoChatInfo extends GeneratedMessageLite<GiftVideoChatInfo, Builder> implements GiftVideoChatInfoOrBuilder {
        public static final int CHATID_FIELD_NUMBER = 1;
        private static final GiftVideoChatInfo DEFAULT_INSTANCE;
        private static volatile i860<GiftVideoChatInfo> PARSER;
        private String chatId_ = "";

        public static final class Builder extends GeneratedMessageLite.b<GiftVideoChatInfo, Builder> implements GiftVideoChatInfoOrBuilder {
            private Builder() {
                super(GiftVideoChatInfo.DEFAULT_INSTANCE);
            }

            public Builder clearChatId() {
                copyOnWrite();
                ((GiftVideoChatInfo) ((GeneratedMessageLite.b) this).instance).clearChatId();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.GiftVideoChatInfoOrBuilder
            public String getChatId() {
                return ((GiftVideoChatInfo) ((GeneratedMessageLite.b) this).instance).getChatId();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.GiftVideoChatInfoOrBuilder
            public ByteString getChatIdBytes() {
                return ((GiftVideoChatInfo) ((GeneratedMessageLite.b) this).instance).getChatIdBytes();
            }

            public Builder setChatId(String str) {
                copyOnWrite();
                ((GiftVideoChatInfo) ((GeneratedMessageLite.b) this).instance).setChatId(str);
                return this;
            }

            public Builder setChatIdBytes(ByteString byteString) {
                copyOnWrite();
                ((GiftVideoChatInfo) ((GeneratedMessageLite.b) this).instance).setChatIdBytes(byteString);
                return this;
            }
        }

        static {
            GiftVideoChatInfo giftVideoChatInfo = new GiftVideoChatInfo();
            DEFAULT_INSTANCE = giftVideoChatInfo;
            giftVideoChatInfo.makeImmutable();
        }

        private GiftVideoChatInfo() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearChatId() {
            this.chatId_ = getDefaultInstance().getChatId();
        }

        public static GiftVideoChatInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(GiftVideoChatInfo giftVideoChatInfo) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(giftVideoChatInfo);
        }

        public static GiftVideoChatInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (GiftVideoChatInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GiftVideoChatInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (GiftVideoChatInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<GiftVideoChatInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setChatId(String str) {
            str.getClass();
            this.chatId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setChatIdBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.chatId_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C03231.f1639xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new GiftVideoChatInfo();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GiftVideoChatInfo giftVideoChatInfo = (GiftVideoChatInfo) obj2;
                    this.chatId_ = ((GeneratedMessageLite.h) obj).f(!this.chatId_.isEmpty(), this.chatId_, true ^ giftVideoChatInfo.chatId_.isEmpty(), giftVideoChatInfo.chatId_);
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
                                    this.chatId_ = eVar.L();
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
                        synchronized (GiftVideoChatInfo.class) {
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

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.GiftVideoChatInfoOrBuilder
        public String getChatId() {
            return this.chatId_;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.GiftVideoChatInfoOrBuilder
        public ByteString getChatIdBytes() {
            return ByteString.copyFromUtf8(this.chatId_);
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iK = !this.chatId_.isEmpty() ? CodedOutputStream.K(1, getChatId()) : 0;
            ((GeneratedMessageLite) this).memoizedSerializedSize = iK;
            return iK;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.chatId_.isEmpty()) {
                return;
            }
            codedOutputStream.D0(1, getChatId());
        }

        public static GiftVideoChatInfo parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (GiftVideoChatInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static GiftVideoChatInfo parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (GiftVideoChatInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static GiftVideoChatInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (GiftVideoChatInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static GiftVideoChatInfo parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (GiftVideoChatInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static GiftVideoChatInfo parseFrom(InputStream inputStream) throws IOException {
            return (GiftVideoChatInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GiftVideoChatInfo parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (GiftVideoChatInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static GiftVideoChatInfo parseFrom(e eVar) throws IOException {
            return (GiftVideoChatInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static GiftVideoChatInfo parseFrom(e eVar, h hVar) throws IOException {
            return (GiftVideoChatInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public static final class LiveBreakingLeaderboard extends GeneratedMessageLite<LiveBreakingLeaderboard, Builder> implements LiveBreakingLeaderboardOrBuilder {
        private static final LiveBreakingLeaderboard DEFAULT_INSTANCE;
        public static final int FROM_FIELD_NUMBER = 4;
        public static final int LIVEID_FIELD_NUMBER = 3;
        private static volatile i860<LiveBreakingLeaderboard> PARSER = null;
        public static final int ROOMID_FIELD_NUMBER = 2;
        public static final int TEMPDATA_FIELD_NUMBER = 5;
        public static final int USERID_FIELD_NUMBER = 1;
        private long from_;
        private TemplateData tempdata_;
        private String userID_ = "";
        private String roomID_ = "";
        private String liveID_ = "";

        static {
            LiveBreakingLeaderboard liveBreakingLeaderboard = new LiveBreakingLeaderboard();
            DEFAULT_INSTANCE = liveBreakingLeaderboard;
            liveBreakingLeaderboard.makeImmutable();
        }

        private LiveBreakingLeaderboard() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFrom() {
            this.from_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLiveID() {
            this.liveID_ = getDefaultInstance().getLiveID();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRoomID() {
            this.roomID_ = getDefaultInstance().getRoomID();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTempdata() {
            this.tempdata_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUserID() {
            this.userID_ = getDefaultInstance().getUserID();
        }

        public static LiveBreakingLeaderboard getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeTempdata(TemplateData templateData) {
            TemplateData templateData2 = this.tempdata_;
            if (templateData2 == null || templateData2 == TemplateData.getDefaultInstance()) {
                this.tempdata_ = templateData;
            } else {
                this.tempdata_ = (TemplateData) ((TemplateData.Builder) TemplateData.newBuilder(this.tempdata_).mergeFrom(templateData)).buildPartial();
            }
        }

        public static Builder newBuilder(LiveBreakingLeaderboard liveBreakingLeaderboard) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(liveBreakingLeaderboard);
        }

        public static LiveBreakingLeaderboard parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (LiveBreakingLeaderboard) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LiveBreakingLeaderboard parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (LiveBreakingLeaderboard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<LiveBreakingLeaderboard> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFrom(long j) {
            this.from_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLiveID(String str) {
            str.getClass();
            this.liveID_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLiveIDBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.liveID_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRoomID(String str) {
            str.getClass();
            this.roomID_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRoomIDBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.roomID_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTempdata(TemplateData.Builder builder) {
            this.tempdata_ = (TemplateData) builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserID(String str) {
            str.getClass();
            this.userID_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserIDBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.userID_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C03231.f1639xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new LiveBreakingLeaderboard();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    LiveBreakingLeaderboard liveBreakingLeaderboard = (LiveBreakingLeaderboard) obj2;
                    this.userID_ = hVar.f(!this.userID_.isEmpty(), this.userID_, !liveBreakingLeaderboard.userID_.isEmpty(), liveBreakingLeaderboard.userID_);
                    this.roomID_ = hVar.f(!this.roomID_.isEmpty(), this.roomID_, !liveBreakingLeaderboard.roomID_.isEmpty(), liveBreakingLeaderboard.roomID_);
                    this.liveID_ = hVar.f(!this.liveID_.isEmpty(), this.liveID_, !liveBreakingLeaderboard.liveID_.isEmpty(), liveBreakingLeaderboard.liveID_);
                    long j = this.from_;
                    boolean z2 = j != 0;
                    long j2 = liveBreakingLeaderboard.from_;
                    this.from_ = hVar.i(z2, j, j2 != 0, j2);
                    this.tempdata_ = hVar.o(this.tempdata_, liveBreakingLeaderboard.tempdata_);
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
                                    this.userID_ = eVar.L();
                                } else if (iM == 18) {
                                    this.roomID_ = eVar.L();
                                } else if (iM == 26) {
                                    this.liveID_ = eVar.L();
                                } else if (iM == 32) {
                                    this.from_ = eVar.v();
                                } else if (iM == 42) {
                                    TemplateData templateData = this.tempdata_;
                                    TemplateData.Builder builder = templateData != null ? (TemplateData.Builder) templateData.toBuilder() : null;
                                    TemplateData templateDataW = eVar.w(TemplateData.parser(), hVar2);
                                    this.tempdata_ = templateDataW;
                                    if (builder != null) {
                                        builder.mergeFrom(templateDataW);
                                        this.tempdata_ = (TemplateData) builder.buildPartial();
                                    }
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
                        synchronized (LiveBreakingLeaderboard.class) {
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

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveBreakingLeaderboardOrBuilder
        public long getFrom() {
            return this.from_;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveBreakingLeaderboardOrBuilder
        public String getLiveID() {
            return this.liveID_;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveBreakingLeaderboardOrBuilder
        public ByteString getLiveIDBytes() {
            return ByteString.copyFromUtf8(this.liveID_);
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveBreakingLeaderboardOrBuilder
        public String getRoomID() {
            return this.roomID_;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveBreakingLeaderboardOrBuilder
        public ByteString getRoomIDBytes() {
            return ByteString.copyFromUtf8(this.roomID_);
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iK = !this.userID_.isEmpty() ? CodedOutputStream.K(1, getUserID()) : 0;
            if (!this.roomID_.isEmpty()) {
                iK += CodedOutputStream.K(2, getRoomID());
            }
            if (!this.liveID_.isEmpty()) {
                iK += CodedOutputStream.K(3, getLiveID());
            }
            long j = this.from_;
            if (j != 0) {
                iK += CodedOutputStream.v(4, j);
            }
            if (this.tempdata_ != null) {
                iK += CodedOutputStream.C(5, getTempdata());
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iK;
            return iK;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveBreakingLeaderboardOrBuilder
        public TemplateData getTempdata() {
            TemplateData templateData = this.tempdata_;
            return templateData == null ? TemplateData.getDefaultInstance() : templateData;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveBreakingLeaderboardOrBuilder
        public String getUserID() {
            return this.userID_;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveBreakingLeaderboardOrBuilder
        public ByteString getUserIDBytes() {
            return ByteString.copyFromUtf8(this.userID_);
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveBreakingLeaderboardOrBuilder
        public boolean hasTempdata() {
            return this.tempdata_ != null;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.userID_.isEmpty()) {
                codedOutputStream.D0(1, getUserID());
            }
            if (!this.roomID_.isEmpty()) {
                codedOutputStream.D0(2, getRoomID());
            }
            if (!this.liveID_.isEmpty()) {
                codedOutputStream.D0(3, getLiveID());
            }
            long j = this.from_;
            if (j != 0) {
                codedOutputStream.u0(4, j);
            }
            if (this.tempdata_ != null) {
                codedOutputStream.w0(5, getTempdata());
            }
        }

        public static LiveBreakingLeaderboard parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (LiveBreakingLeaderboard) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static LiveBreakingLeaderboard parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (LiveBreakingLeaderboard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTempdata(TemplateData templateData) {
            templateData.getClass();
            this.tempdata_ = templateData;
        }

        public static final class Builder extends GeneratedMessageLite.b<LiveBreakingLeaderboard, Builder> implements LiveBreakingLeaderboardOrBuilder {
            private Builder() {
                super(LiveBreakingLeaderboard.DEFAULT_INSTANCE);
            }

            public Builder clearFrom() {
                copyOnWrite();
                ((LiveBreakingLeaderboard) ((GeneratedMessageLite.b) this).instance).clearFrom();
                return this;
            }

            public Builder clearLiveID() {
                copyOnWrite();
                ((LiveBreakingLeaderboard) ((GeneratedMessageLite.b) this).instance).clearLiveID();
                return this;
            }

            public Builder clearRoomID() {
                copyOnWrite();
                ((LiveBreakingLeaderboard) ((GeneratedMessageLite.b) this).instance).clearRoomID();
                return this;
            }

            public Builder clearTempdata() {
                copyOnWrite();
                ((LiveBreakingLeaderboard) ((GeneratedMessageLite.b) this).instance).clearTempdata();
                return this;
            }

            public Builder clearUserID() {
                copyOnWrite();
                ((LiveBreakingLeaderboard) ((GeneratedMessageLite.b) this).instance).clearUserID();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveBreakingLeaderboardOrBuilder
            public long getFrom() {
                return ((LiveBreakingLeaderboard) ((GeneratedMessageLite.b) this).instance).getFrom();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveBreakingLeaderboardOrBuilder
            public String getLiveID() {
                return ((LiveBreakingLeaderboard) ((GeneratedMessageLite.b) this).instance).getLiveID();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveBreakingLeaderboardOrBuilder
            public ByteString getLiveIDBytes() {
                return ((LiveBreakingLeaderboard) ((GeneratedMessageLite.b) this).instance).getLiveIDBytes();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveBreakingLeaderboardOrBuilder
            public String getRoomID() {
                return ((LiveBreakingLeaderboard) ((GeneratedMessageLite.b) this).instance).getRoomID();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveBreakingLeaderboardOrBuilder
            public ByteString getRoomIDBytes() {
                return ((LiveBreakingLeaderboard) ((GeneratedMessageLite.b) this).instance).getRoomIDBytes();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveBreakingLeaderboardOrBuilder
            public TemplateData getTempdata() {
                return ((LiveBreakingLeaderboard) ((GeneratedMessageLite.b) this).instance).getTempdata();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveBreakingLeaderboardOrBuilder
            public String getUserID() {
                return ((LiveBreakingLeaderboard) ((GeneratedMessageLite.b) this).instance).getUserID();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveBreakingLeaderboardOrBuilder
            public ByteString getUserIDBytes() {
                return ((LiveBreakingLeaderboard) ((GeneratedMessageLite.b) this).instance).getUserIDBytes();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveBreakingLeaderboardOrBuilder
            public boolean hasTempdata() {
                return ((LiveBreakingLeaderboard) ((GeneratedMessageLite.b) this).instance).hasTempdata();
            }

            public Builder mergeTempdata(TemplateData templateData) {
                copyOnWrite();
                ((LiveBreakingLeaderboard) ((GeneratedMessageLite.b) this).instance).mergeTempdata(templateData);
                return this;
            }

            public Builder setFrom(long j) {
                copyOnWrite();
                ((LiveBreakingLeaderboard) ((GeneratedMessageLite.b) this).instance).setFrom(j);
                return this;
            }

            public Builder setLiveID(String str) {
                copyOnWrite();
                ((LiveBreakingLeaderboard) ((GeneratedMessageLite.b) this).instance).setLiveID(str);
                return this;
            }

            public Builder setLiveIDBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveBreakingLeaderboard) ((GeneratedMessageLite.b) this).instance).setLiveIDBytes(byteString);
                return this;
            }

            public Builder setRoomID(String str) {
                copyOnWrite();
                ((LiveBreakingLeaderboard) ((GeneratedMessageLite.b) this).instance).setRoomID(str);
                return this;
            }

            public Builder setRoomIDBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveBreakingLeaderboard) ((GeneratedMessageLite.b) this).instance).setRoomIDBytes(byteString);
                return this;
            }

            public Builder setTempdata(TemplateData templateData) {
                copyOnWrite();
                ((LiveBreakingLeaderboard) ((GeneratedMessageLite.b) this).instance).setTempdata(templateData);
                return this;
            }

            public Builder setUserID(String str) {
                copyOnWrite();
                ((LiveBreakingLeaderboard) ((GeneratedMessageLite.b) this).instance).setUserID(str);
                return this;
            }

            public Builder setUserIDBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveBreakingLeaderboard) ((GeneratedMessageLite.b) this).instance).setUserIDBytes(byteString);
                return this;
            }

            public Builder setTempdata(TemplateData.Builder builder) {
                copyOnWrite();
                ((LiveBreakingLeaderboard) ((GeneratedMessageLite.b) this).instance).setTempdata(builder);
                return this;
            }
        }

        public static LiveBreakingLeaderboard parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (LiveBreakingLeaderboard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static LiveBreakingLeaderboard parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (LiveBreakingLeaderboard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static LiveBreakingLeaderboard parseFrom(InputStream inputStream) throws IOException {
            return (LiveBreakingLeaderboard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LiveBreakingLeaderboard parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (LiveBreakingLeaderboard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static LiveBreakingLeaderboard parseFrom(e eVar) throws IOException {
            return (LiveBreakingLeaderboard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static LiveBreakingLeaderboard parseFrom(e eVar, h hVar) throws IOException {
            return (LiveBreakingLeaderboard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public static final class LiveCampaignInfo extends GeneratedMessageLite<LiveCampaignInfo, Builder> implements LiveCampaignInfoOrBuilder {
        public static final int DATA_FIELD_NUMBER = 6;
        private static final LiveCampaignInfo DEFAULT_INSTANCE;
        public static final int ID_FIELD_NUMBER = 2;
        private static volatile i860<LiveCampaignInfo> PARSER = null;
        public static final int POSITION_FIELD_NUMBER = 3;
        public static final int SUBSCRIBETYPE_FIELD_NUMBER = 4;
        public static final int TYPE_FIELD_NUMBER = 1;
        public static final int UPDATETYPE_FIELD_NUMBER = 5;
        private long position_;
        private int type_;
        private String id_ = "";
        private String subscribeType_ = "";
        private String updateType_ = "";
        private String data_ = "";

        public static final class Builder extends GeneratedMessageLite.b<LiveCampaignInfo, Builder> implements LiveCampaignInfoOrBuilder {
            private Builder() {
                super(LiveCampaignInfo.DEFAULT_INSTANCE);
            }

            public Builder clearData() {
                copyOnWrite();
                ((LiveCampaignInfo) ((GeneratedMessageLite.b) this).instance).clearData();
                return this;
            }

            public Builder clearId() {
                copyOnWrite();
                ((LiveCampaignInfo) ((GeneratedMessageLite.b) this).instance).clearId();
                return this;
            }

            public Builder clearPosition() {
                copyOnWrite();
                ((LiveCampaignInfo) ((GeneratedMessageLite.b) this).instance).clearPosition();
                return this;
            }

            public Builder clearSubscribeType() {
                copyOnWrite();
                ((LiveCampaignInfo) ((GeneratedMessageLite.b) this).instance).clearSubscribeType();
                return this;
            }

            public Builder clearType() {
                copyOnWrite();
                ((LiveCampaignInfo) ((GeneratedMessageLite.b) this).instance).clearType();
                return this;
            }

            public Builder clearUpdateType() {
                copyOnWrite();
                ((LiveCampaignInfo) ((GeneratedMessageLite.b) this).instance).clearUpdateType();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveCampaignInfoOrBuilder
            public String getData() {
                return ((LiveCampaignInfo) ((GeneratedMessageLite.b) this).instance).getData();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveCampaignInfoOrBuilder
            public ByteString getDataBytes() {
                return ((LiveCampaignInfo) ((GeneratedMessageLite.b) this).instance).getDataBytes();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveCampaignInfoOrBuilder
            public String getId() {
                return ((LiveCampaignInfo) ((GeneratedMessageLite.b) this).instance).getId();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveCampaignInfoOrBuilder
            public ByteString getIdBytes() {
                return ((LiveCampaignInfo) ((GeneratedMessageLite.b) this).instance).getIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveCampaignInfoOrBuilder
            public long getPosition() {
                return ((LiveCampaignInfo) ((GeneratedMessageLite.b) this).instance).getPosition();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveCampaignInfoOrBuilder
            public String getSubscribeType() {
                return ((LiveCampaignInfo) ((GeneratedMessageLite.b) this).instance).getSubscribeType();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveCampaignInfoOrBuilder
            public ByteString getSubscribeTypeBytes() {
                return ((LiveCampaignInfo) ((GeneratedMessageLite.b) this).instance).getSubscribeTypeBytes();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveCampaignInfoOrBuilder
            public LiveCampaignType getType() {
                return ((LiveCampaignInfo) ((GeneratedMessageLite.b) this).instance).getType();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveCampaignInfoOrBuilder
            public int getTypeValue() {
                return ((LiveCampaignInfo) ((GeneratedMessageLite.b) this).instance).getTypeValue();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveCampaignInfoOrBuilder
            public String getUpdateType() {
                return ((LiveCampaignInfo) ((GeneratedMessageLite.b) this).instance).getUpdateType();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveCampaignInfoOrBuilder
            public ByteString getUpdateTypeBytes() {
                return ((LiveCampaignInfo) ((GeneratedMessageLite.b) this).instance).getUpdateTypeBytes();
            }

            public Builder setData(String str) {
                copyOnWrite();
                ((LiveCampaignInfo) ((GeneratedMessageLite.b) this).instance).setData(str);
                return this;
            }

            public Builder setDataBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveCampaignInfo) ((GeneratedMessageLite.b) this).instance).setDataBytes(byteString);
                return this;
            }

            public Builder setId(String str) {
                copyOnWrite();
                ((LiveCampaignInfo) ((GeneratedMessageLite.b) this).instance).setId(str);
                return this;
            }

            public Builder setIdBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveCampaignInfo) ((GeneratedMessageLite.b) this).instance).setIdBytes(byteString);
                return this;
            }

            public Builder setPosition(long j) {
                copyOnWrite();
                ((LiveCampaignInfo) ((GeneratedMessageLite.b) this).instance).setPosition(j);
                return this;
            }

            public Builder setSubscribeType(String str) {
                copyOnWrite();
                ((LiveCampaignInfo) ((GeneratedMessageLite.b) this).instance).setSubscribeType(str);
                return this;
            }

            public Builder setSubscribeTypeBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveCampaignInfo) ((GeneratedMessageLite.b) this).instance).setSubscribeTypeBytes(byteString);
                return this;
            }

            public Builder setType(LiveCampaignType liveCampaignType) {
                copyOnWrite();
                ((LiveCampaignInfo) ((GeneratedMessageLite.b) this).instance).setType(liveCampaignType);
                return this;
            }

            public Builder setTypeValue(int i) {
                copyOnWrite();
                ((LiveCampaignInfo) ((GeneratedMessageLite.b) this).instance).setTypeValue(i);
                return this;
            }

            public Builder setUpdateType(String str) {
                copyOnWrite();
                ((LiveCampaignInfo) ((GeneratedMessageLite.b) this).instance).setUpdateType(str);
                return this;
            }

            public Builder setUpdateTypeBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveCampaignInfo) ((GeneratedMessageLite.b) this).instance).setUpdateTypeBytes(byteString);
                return this;
            }
        }

        static {
            LiveCampaignInfo liveCampaignInfo = new LiveCampaignInfo();
            DEFAULT_INSTANCE = liveCampaignInfo;
            liveCampaignInfo.makeImmutable();
        }

        private LiveCampaignInfo() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearData() {
            this.data_ = getDefaultInstance().getData();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearId() {
            this.id_ = getDefaultInstance().getId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPosition() {
            this.position_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSubscribeType() {
            this.subscribeType_ = getDefaultInstance().getSubscribeType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearType() {
            this.type_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUpdateType() {
            this.updateType_ = getDefaultInstance().getUpdateType();
        }

        public static LiveCampaignInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(LiveCampaignInfo liveCampaignInfo) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(liveCampaignInfo);
        }

        public static LiveCampaignInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (LiveCampaignInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LiveCampaignInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (LiveCampaignInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<LiveCampaignInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setData(String str) {
            str.getClass();
            this.data_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDataBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.data_ = byteString.toStringUtf8();
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
        public void setPosition(long j) {
            this.position_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSubscribeType(String str) {
            str.getClass();
            this.subscribeType_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSubscribeTypeBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.subscribeType_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setType(LiveCampaignType liveCampaignType) {
            liveCampaignType.getClass();
            this.type_ = liveCampaignType.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTypeValue(int i) {
            this.type_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUpdateType(String str) {
            str.getClass();
            this.updateType_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUpdateTypeBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.updateType_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C03231.f1639xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new LiveCampaignInfo();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    LiveCampaignInfo liveCampaignInfo = (LiveCampaignInfo) obj2;
                    int i = this.type_;
                    boolean z2 = i != 0;
                    int i2 = liveCampaignInfo.type_;
                    this.type_ = hVar.e(z2, i, i2 != 0, i2);
                    this.id_ = hVar.f(!this.id_.isEmpty(), this.id_, !liveCampaignInfo.id_.isEmpty(), liveCampaignInfo.id_);
                    long j = this.position_;
                    boolean z3 = j != 0;
                    long j2 = liveCampaignInfo.position_;
                    this.position_ = hVar.i(z3, j, j2 != 0, j2);
                    this.subscribeType_ = hVar.f(!this.subscribeType_.isEmpty(), this.subscribeType_, !liveCampaignInfo.subscribeType_.isEmpty(), liveCampaignInfo.subscribeType_);
                    this.updateType_ = hVar.f(!this.updateType_.isEmpty(), this.updateType_, !liveCampaignInfo.updateType_.isEmpty(), liveCampaignInfo.updateType_);
                    this.data_ = hVar.f(!this.data_.isEmpty(), this.data_, !liveCampaignInfo.data_.isEmpty(), liveCampaignInfo.data_);
                    GeneratedMessageLite.g gVar = GeneratedMessageLite.g.INSTANCE;
                    return this;
                case 6:
                    e eVar = (e) obj;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            if (iM != 0) {
                                if (iM == 8) {
                                    this.type_ = eVar.p();
                                } else if (iM == 18) {
                                    this.id_ = eVar.L();
                                } else if (iM == 24) {
                                    this.position_ = eVar.v();
                                } else if (iM == 34) {
                                    this.subscribeType_ = eVar.L();
                                } else if (iM == 42) {
                                    this.updateType_ = eVar.L();
                                } else if (iM == 50) {
                                    this.data_ = eVar.L();
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
                        synchronized (LiveCampaignInfo.class) {
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

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveCampaignInfoOrBuilder
        public String getData() {
            return this.data_;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveCampaignInfoOrBuilder
        public ByteString getDataBytes() {
            return ByteString.copyFromUtf8(this.data_);
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveCampaignInfoOrBuilder
        public String getId() {
            return this.id_;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveCampaignInfoOrBuilder
        public ByteString getIdBytes() {
            return ByteString.copyFromUtf8(this.id_);
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveCampaignInfoOrBuilder
        public long getPosition() {
            return this.position_;
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM = this.type_ != LiveCampaignType.List.getNumber() ? CodedOutputStream.m(1, this.type_) : 0;
            if (!this.id_.isEmpty()) {
                iM += CodedOutputStream.K(2, getId());
            }
            long j = this.position_;
            if (j != 0) {
                iM += CodedOutputStream.v(3, j);
            }
            if (!this.subscribeType_.isEmpty()) {
                iM += CodedOutputStream.K(4, getSubscribeType());
            }
            if (!this.updateType_.isEmpty()) {
                iM += CodedOutputStream.K(5, getUpdateType());
            }
            if (!this.data_.isEmpty()) {
                iM += CodedOutputStream.K(6, getData());
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iM;
            return iM;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveCampaignInfoOrBuilder
        public String getSubscribeType() {
            return this.subscribeType_;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveCampaignInfoOrBuilder
        public ByteString getSubscribeTypeBytes() {
            return ByteString.copyFromUtf8(this.subscribeType_);
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveCampaignInfoOrBuilder
        public LiveCampaignType getType() {
            LiveCampaignType liveCampaignTypeForNumber = LiveCampaignType.forNumber(this.type_);
            return liveCampaignTypeForNumber == null ? LiveCampaignType.UNRECOGNIZED : liveCampaignTypeForNumber;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveCampaignInfoOrBuilder
        public int getTypeValue() {
            return this.type_;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveCampaignInfoOrBuilder
        public String getUpdateType() {
            return this.updateType_;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveCampaignInfoOrBuilder
        public ByteString getUpdateTypeBytes() {
            return ByteString.copyFromUtf8(this.updateType_);
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.type_ != LiveCampaignType.List.getNumber()) {
                codedOutputStream.i0(1, this.type_);
            }
            if (!this.id_.isEmpty()) {
                codedOutputStream.D0(2, getId());
            }
            long j = this.position_;
            if (j != 0) {
                codedOutputStream.u0(3, j);
            }
            if (!this.subscribeType_.isEmpty()) {
                codedOutputStream.D0(4, getSubscribeType());
            }
            if (!this.updateType_.isEmpty()) {
                codedOutputStream.D0(5, getUpdateType());
            }
            if (this.data_.isEmpty()) {
                return;
            }
            codedOutputStream.D0(6, getData());
        }

        public static LiveCampaignInfo parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (LiveCampaignInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static LiveCampaignInfo parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (LiveCampaignInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static LiveCampaignInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (LiveCampaignInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static LiveCampaignInfo parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (LiveCampaignInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static LiveCampaignInfo parseFrom(InputStream inputStream) throws IOException {
            return (LiveCampaignInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LiveCampaignInfo parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (LiveCampaignInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static LiveCampaignInfo parseFrom(e eVar) throws IOException {
            return (LiveCampaignInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static LiveCampaignInfo parseFrom(e eVar, h hVar) throws IOException {
            return (LiveCampaignInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public enum LiveCampaignType implements l.c {
        List(0),
        Entrance(1),
        UNRECOGNIZED(-1);

        public static final int Entrance_VALUE = 1;
        public static final int List_VALUE = 0;
        private static final l.d<LiveCampaignType> internalValueMap = new l.d<LiveCampaignType>() { // from class: com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveCampaignType.1
            public LiveCampaignType findValueByNumber(int i) {
                return LiveCampaignType.forNumber(i);
            }
        };
        private final int value;

        LiveCampaignType(int i) {
            this.value = i;
        }

        public static LiveCampaignType forNumber(int i) {
            if (i == 0) {
                return List;
            }
            if (i != 1) {
                return null;
            }
            return Entrance;
        }

        public static l.d<LiveCampaignType> internalGetValueMap() {
            return internalValueMap;
        }

        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static LiveCampaignType valueOf(int i) {
            return forNumber(i);
        }
    }

    public static final class LiveCoordinate extends GeneratedMessageLite<LiveCoordinate, Builder> implements LiveCoordinateOrBuilder {
        private static final LiveCoordinate DEFAULT_INSTANCE;
        private static volatile i860<LiveCoordinate> PARSER = null;
        public static final int X_FIELD_NUMBER = 1;
        public static final int Y_FIELD_NUMBER = 2;

        /* JADX INFO: renamed from: x_ */
        private float f1640x_;

        /* JADX INFO: renamed from: y_ */
        private float f1641y_;

        public static final class Builder extends GeneratedMessageLite.b<LiveCoordinate, Builder> implements LiveCoordinateOrBuilder {
            private Builder() {
                super(LiveCoordinate.DEFAULT_INSTANCE);
            }

            public Builder clearX() {
                copyOnWrite();
                ((LiveCoordinate) ((GeneratedMessageLite.b) this).instance).clearX();
                return this;
            }

            public Builder clearY() {
                copyOnWrite();
                ((LiveCoordinate) ((GeneratedMessageLite.b) this).instance).clearY();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveCoordinateOrBuilder
            public float getX() {
                return ((LiveCoordinate) ((GeneratedMessageLite.b) this).instance).getX();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveCoordinateOrBuilder
            public float getY() {
                return ((LiveCoordinate) ((GeneratedMessageLite.b) this).instance).getY();
            }

            public Builder setX(float f) {
                copyOnWrite();
                ((LiveCoordinate) ((GeneratedMessageLite.b) this).instance).setX(f);
                return this;
            }

            public Builder setY(float f) {
                copyOnWrite();
                ((LiveCoordinate) ((GeneratedMessageLite.b) this).instance).setY(f);
                return this;
            }
        }

        static {
            LiveCoordinate liveCoordinate = new LiveCoordinate();
            DEFAULT_INSTANCE = liveCoordinate;
            liveCoordinate.makeImmutable();
        }

        private LiveCoordinate() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearX() {
            this.f1640x_ = 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearY() {
            this.f1641y_ = 0.0f;
        }

        public static LiveCoordinate getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(LiveCoordinate liveCoordinate) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(liveCoordinate);
        }

        public static LiveCoordinate parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (LiveCoordinate) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LiveCoordinate parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (LiveCoordinate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<LiveCoordinate> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setX(float f) {
            this.f1640x_ = f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setY(float f) {
            this.f1641y_ = f;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C03231.f1639xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new LiveCoordinate();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    LiveCoordinate liveCoordinate = (LiveCoordinate) obj2;
                    float f = this.f1640x_;
                    boolean z2 = f != 0.0f;
                    float f2 = liveCoordinate.f1640x_;
                    this.f1640x_ = hVar.p(z2, f, f2 != 0.0f, f2);
                    float f3 = this.f1641y_;
                    boolean z3 = f3 != 0.0f;
                    float f4 = liveCoordinate.f1641y_;
                    this.f1641y_ = hVar.p(z3, f3, f4 != 0.0f, f4);
                    GeneratedMessageLite.g gVar = GeneratedMessageLite.g.INSTANCE;
                    return this;
                case 6:
                    e eVar = (e) obj;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            if (iM != 0) {
                                if (iM == 13) {
                                    this.f1640x_ = eVar.s();
                                } else if (iM == 21) {
                                    this.f1641y_ = eVar.s();
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
                        synchronized (LiveCoordinate.class) {
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
            float f = this.f1640x_;
            int iQ = f != 0.0f ? CodedOutputStream.q(1, f) : 0;
            float f2 = this.f1641y_;
            if (f2 != 0.0f) {
                iQ += CodedOutputStream.q(2, f2);
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iQ;
            return iQ;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveCoordinateOrBuilder
        public float getX() {
            return this.f1640x_;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveCoordinateOrBuilder
        public float getY() {
            return this.f1641y_;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            float f = this.f1640x_;
            if (f != 0.0f) {
                codedOutputStream.o0(1, f);
            }
            float f2 = this.f1641y_;
            if (f2 != 0.0f) {
                codedOutputStream.o0(2, f2);
            }
        }

        public static LiveCoordinate parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (LiveCoordinate) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static LiveCoordinate parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (LiveCoordinate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static LiveCoordinate parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (LiveCoordinate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static LiveCoordinate parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (LiveCoordinate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static LiveCoordinate parseFrom(InputStream inputStream) throws IOException {
            return (LiveCoordinate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LiveCoordinate parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (LiveCoordinate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static LiveCoordinate parseFrom(e eVar) throws IOException {
            return (LiveCoordinate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static LiveCoordinate parseFrom(e eVar, h hVar) throws IOException {
            return (LiveCoordinate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public static final class LiveGiftDrawInfo extends GeneratedMessageLite<LiveGiftDrawInfo, Builder> implements LiveGiftDrawInfoOrBuilder {
        public static final int COORDINATES_FIELD_NUMBER = 1;
        private static final LiveGiftDrawInfo DEFAULT_INSTANCE;
        public static final int LENGTH_FIELD_NUMBER = 2;
        private static volatile i860<LiveGiftDrawInfo> PARSER = null;
        public static final int WIDTH_FIELD_NUMBER = 3;
        private int bitField0_;
        private l.h<LiveCoordinate> coordinates_ = GeneratedMessageLite.emptyProtobufList();
        private float length_;
        private float width_;

        static {
            LiveGiftDrawInfo liveGiftDrawInfo = new LiveGiftDrawInfo();
            DEFAULT_INSTANCE = liveGiftDrawInfo;
            liveGiftDrawInfo.makeImmutable();
        }

        private LiveGiftDrawInfo() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllCoordinates(Iterable<? extends LiveCoordinate> iterable) {
            ensureCoordinatesIsMutable();
            a.addAll(iterable, this.coordinates_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addCoordinates(LiveCoordinate.Builder builder) {
            ensureCoordinatesIsMutable();
            this.coordinates_.add((LiveCoordinate) builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCoordinates() {
            this.coordinates_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLength() {
            this.length_ = 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWidth() {
            this.width_ = 0.0f;
        }

        private void ensureCoordinatesIsMutable() {
            if (this.coordinates_.q()) {
                return;
            }
            this.coordinates_ = GeneratedMessageLite.mutableCopy(this.coordinates_);
        }

        public static LiveGiftDrawInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(LiveGiftDrawInfo liveGiftDrawInfo) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(liveGiftDrawInfo);
        }

        public static LiveGiftDrawInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (LiveGiftDrawInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LiveGiftDrawInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (LiveGiftDrawInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<LiveGiftDrawInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeCoordinates(int i) {
            ensureCoordinatesIsMutable();
            this.coordinates_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCoordinates(int i, LiveCoordinate.Builder builder) {
            ensureCoordinatesIsMutable();
            this.coordinates_.set(i, (LiveCoordinate) builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLength(float f) {
            this.length_ = f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWidth(float f) {
            this.width_ = f;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C03231.f1639xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new LiveGiftDrawInfo();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.coordinates_.n();
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.g gVar = (GeneratedMessageLite.h) obj;
                    LiveGiftDrawInfo liveGiftDrawInfo = (LiveGiftDrawInfo) obj2;
                    this.coordinates_ = gVar.g(this.coordinates_, liveGiftDrawInfo.coordinates_);
                    float f = this.length_;
                    boolean z2 = f != 0.0f;
                    float f2 = liveGiftDrawInfo.length_;
                    this.length_ = gVar.p(z2, f, f2 != 0.0f, f2);
                    float f3 = this.width_;
                    boolean z3 = f3 != 0.0f;
                    float f4 = liveGiftDrawInfo.width_;
                    this.width_ = gVar.p(z3, f3, f4 != 0.0f, f4);
                    if (gVar == GeneratedMessageLite.g.INSTANCE) {
                        this.bitField0_ |= liveGiftDrawInfo.bitField0_;
                    }
                    return this;
                case 6:
                    e eVar = (e) obj;
                    h hVar = (h) obj2;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            if (iM != 0) {
                                if (iM == 10) {
                                    if (!this.coordinates_.q()) {
                                        this.coordinates_ = GeneratedMessageLite.mutableCopy(this.coordinates_);
                                    }
                                    this.coordinates_.add(eVar.w(LiveCoordinate.parser(), hVar));
                                } else if (iM == 21) {
                                    this.length_ = eVar.s();
                                } else if (iM == 29) {
                                    this.width_ = eVar.s();
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
                        synchronized (LiveGiftDrawInfo.class) {
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

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveGiftDrawInfoOrBuilder
        public LiveCoordinate getCoordinates(int i) {
            return (LiveCoordinate) this.coordinates_.get(i);
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveGiftDrawInfoOrBuilder
        public int getCoordinatesCount() {
            return this.coordinates_.size();
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveGiftDrawInfoOrBuilder
        public List<LiveCoordinate> getCoordinatesList() {
            return this.coordinates_;
        }

        public LiveCoordinateOrBuilder getCoordinatesOrBuilder(int i) {
            return (LiveCoordinateOrBuilder) this.coordinates_.get(i);
        }

        public List<? extends LiveCoordinateOrBuilder> getCoordinatesOrBuilderList() {
            return this.coordinates_;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveGiftDrawInfoOrBuilder
        public float getLength() {
            return this.length_;
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iQ = 0;
            for (int i2 = 0; i2 < this.coordinates_.size(); i2++) {
                iQ += CodedOutputStream.C(1, (q) this.coordinates_.get(i2));
            }
            float f = this.length_;
            if (f != 0.0f) {
                iQ += CodedOutputStream.q(2, f);
            }
            float f2 = this.width_;
            if (f2 != 0.0f) {
                iQ += CodedOutputStream.q(3, f2);
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iQ;
            return iQ;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveGiftDrawInfoOrBuilder
        public float getWidth() {
            return this.width_;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            for (int i = 0; i < this.coordinates_.size(); i++) {
                codedOutputStream.w0(1, (q) this.coordinates_.get(i));
            }
            float f = this.length_;
            if (f != 0.0f) {
                codedOutputStream.o0(2, f);
            }
            float f2 = this.width_;
            if (f2 != 0.0f) {
                codedOutputStream.o0(3, f2);
            }
        }

        public static LiveGiftDrawInfo parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (LiveGiftDrawInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static LiveGiftDrawInfo parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (LiveGiftDrawInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static final class Builder extends GeneratedMessageLite.b<LiveGiftDrawInfo, Builder> implements LiveGiftDrawInfoOrBuilder {
            private Builder() {
                super(LiveGiftDrawInfo.DEFAULT_INSTANCE);
            }

            public Builder addAllCoordinates(Iterable<? extends LiveCoordinate> iterable) {
                copyOnWrite();
                ((LiveGiftDrawInfo) ((GeneratedMessageLite.b) this).instance).addAllCoordinates(iterable);
                return this;
            }

            public Builder addCoordinates(LiveCoordinate liveCoordinate) {
                copyOnWrite();
                ((LiveGiftDrawInfo) ((GeneratedMessageLite.b) this).instance).addCoordinates(liveCoordinate);
                return this;
            }

            public Builder clearCoordinates() {
                copyOnWrite();
                ((LiveGiftDrawInfo) ((GeneratedMessageLite.b) this).instance).clearCoordinates();
                return this;
            }

            public Builder clearLength() {
                copyOnWrite();
                ((LiveGiftDrawInfo) ((GeneratedMessageLite.b) this).instance).clearLength();
                return this;
            }

            public Builder clearWidth() {
                copyOnWrite();
                ((LiveGiftDrawInfo) ((GeneratedMessageLite.b) this).instance).clearWidth();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveGiftDrawInfoOrBuilder
            public LiveCoordinate getCoordinates(int i) {
                return ((LiveGiftDrawInfo) ((GeneratedMessageLite.b) this).instance).getCoordinates(i);
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveGiftDrawInfoOrBuilder
            public int getCoordinatesCount() {
                return ((LiveGiftDrawInfo) ((GeneratedMessageLite.b) this).instance).getCoordinatesCount();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveGiftDrawInfoOrBuilder
            public List<LiveCoordinate> getCoordinatesList() {
                return Collections.unmodifiableList(((LiveGiftDrawInfo) ((GeneratedMessageLite.b) this).instance).getCoordinatesList());
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveGiftDrawInfoOrBuilder
            public float getLength() {
                return ((LiveGiftDrawInfo) ((GeneratedMessageLite.b) this).instance).getLength();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveGiftDrawInfoOrBuilder
            public float getWidth() {
                return ((LiveGiftDrawInfo) ((GeneratedMessageLite.b) this).instance).getWidth();
            }

            public Builder removeCoordinates(int i) {
                copyOnWrite();
                ((LiveGiftDrawInfo) ((GeneratedMessageLite.b) this).instance).removeCoordinates(i);
                return this;
            }

            public Builder setCoordinates(int i, LiveCoordinate liveCoordinate) {
                copyOnWrite();
                ((LiveGiftDrawInfo) ((GeneratedMessageLite.b) this).instance).setCoordinates(i, liveCoordinate);
                return this;
            }

            public Builder setLength(float f) {
                copyOnWrite();
                ((LiveGiftDrawInfo) ((GeneratedMessageLite.b) this).instance).setLength(f);
                return this;
            }

            public Builder setWidth(float f) {
                copyOnWrite();
                ((LiveGiftDrawInfo) ((GeneratedMessageLite.b) this).instance).setWidth(f);
                return this;
            }

            public Builder addCoordinates(int i, LiveCoordinate liveCoordinate) {
                copyOnWrite();
                ((LiveGiftDrawInfo) ((GeneratedMessageLite.b) this).instance).addCoordinates(i, liveCoordinate);
                return this;
            }

            public Builder setCoordinates(int i, LiveCoordinate.Builder builder) {
                copyOnWrite();
                ((LiveGiftDrawInfo) ((GeneratedMessageLite.b) this).instance).setCoordinates(i, builder);
                return this;
            }

            public Builder addCoordinates(LiveCoordinate.Builder builder) {
                copyOnWrite();
                ((LiveGiftDrawInfo) ((GeneratedMessageLite.b) this).instance).addCoordinates(builder);
                return this;
            }

            public Builder addCoordinates(int i, LiveCoordinate.Builder builder) {
                copyOnWrite();
                ((LiveGiftDrawInfo) ((GeneratedMessageLite.b) this).instance).addCoordinates(i, builder);
                return this;
            }
        }

        public static LiveGiftDrawInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (LiveGiftDrawInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static LiveGiftDrawInfo parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (LiveGiftDrawInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static LiveGiftDrawInfo parseFrom(InputStream inputStream) throws IOException {
            return (LiveGiftDrawInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LiveGiftDrawInfo parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (LiveGiftDrawInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static LiveGiftDrawInfo parseFrom(e eVar) throws IOException {
            return (LiveGiftDrawInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addCoordinates(int i, LiveCoordinate liveCoordinate) {
            liveCoordinate.getClass();
            ensureCoordinatesIsMutable();
            this.coordinates_.add(i, liveCoordinate);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static LiveGiftDrawInfo parseFrom(e eVar, h hVar) throws IOException {
            return (LiveGiftDrawInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCoordinates(int i, LiveCoordinate liveCoordinate) {
            liveCoordinate.getClass();
            ensureCoordinatesIsMutable();
            this.coordinates_.set(i, liveCoordinate);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addCoordinates(LiveCoordinate liveCoordinate) {
            liveCoordinate.getClass();
            ensureCoordinatesIsMutable();
            this.coordinates_.add(liveCoordinate);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addCoordinates(int i, LiveCoordinate.Builder builder) {
            ensureCoordinatesIsMutable();
            this.coordinates_.add(i, (LiveCoordinate) builder.build());
        }
    }

    public static final class LiveGiftExtraInfo extends GeneratedMessageLite<LiveGiftExtraInfo, Builder> implements LiveGiftExtraInfoOrBuilder {
        private static final LiveGiftExtraInfo DEFAULT_INSTANCE;
        public static final int DRAWINFO_FIELD_NUMBER = 1;
        public static final int EFFECTEXT_FIELD_NUMBER = 6;
        public static final int MASKMODE_FIELD_NUMBER = 2;
        public static final int MASK_FIELD_NUMBER = 3;
        private static volatile i860<LiveGiftExtraInfo> PARSER = null;
        public static final int PREVIEWMASK_FIELD_NUMBER = 7;
        public static final int RECEIVERSHOWMASK_FIELD_NUMBER = 9;
        public static final int SENDERSHOWMASK_FIELD_NUMBER = 8;
        public static final int USERMASK_FIELD_NUMBER = 4;
        public static final int VIDEOEFFECTEXTRAS_FIELD_NUMBER = 5;
        private int bitField0_;
        private LiveGiftDrawInfo drawInfo_;
        private boolean maskMode_;
        private Mask mask_;
        private userMaskConfig.UserMask previewMask_;
        private userMaskConfig.UserMask receiverShowMask_;
        private userMaskConfig.UserMask senderShowMask_;
        private userMaskConfig.UserMask userMask_;
        private l.h<VideoEffectExtra> videoEffectExtras_ = GeneratedMessageLite.emptyProtobufList();
        private String effectExt_ = "";

        static {
            LiveGiftExtraInfo liveGiftExtraInfo = new LiveGiftExtraInfo();
            DEFAULT_INSTANCE = liveGiftExtraInfo;
            liveGiftExtraInfo.makeImmutable();
        }

        private LiveGiftExtraInfo() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllVideoEffectExtras(Iterable<? extends VideoEffectExtra> iterable) {
            ensureVideoEffectExtrasIsMutable();
            a.addAll(iterable, this.videoEffectExtras_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addVideoEffectExtras(VideoEffectExtra.Builder builder) {
            ensureVideoEffectExtrasIsMutable();
            this.videoEffectExtras_.add((VideoEffectExtra) builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDrawInfo() {
            this.drawInfo_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEffectExt() {
            this.effectExt_ = getDefaultInstance().getEffectExt();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMask() {
            this.mask_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMaskMode() {
            this.maskMode_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPreviewMask() {
            this.previewMask_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearReceiverShowMask() {
            this.receiverShowMask_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSenderShowMask() {
            this.senderShowMask_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUserMask() {
            this.userMask_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVideoEffectExtras() {
            this.videoEffectExtras_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureVideoEffectExtrasIsMutable() {
            if (this.videoEffectExtras_.q()) {
                return;
            }
            this.videoEffectExtras_ = GeneratedMessageLite.mutableCopy(this.videoEffectExtras_);
        }

        public static LiveGiftExtraInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeDrawInfo(LiveGiftDrawInfo liveGiftDrawInfo) {
            LiveGiftDrawInfo liveGiftDrawInfo2 = this.drawInfo_;
            if (liveGiftDrawInfo2 == null || liveGiftDrawInfo2 == LiveGiftDrawInfo.getDefaultInstance()) {
                this.drawInfo_ = liveGiftDrawInfo;
            } else {
                this.drawInfo_ = (LiveGiftDrawInfo) ((LiveGiftDrawInfo.Builder) LiveGiftDrawInfo.newBuilder(this.drawInfo_).mergeFrom(liveGiftDrawInfo)).buildPartial();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeMask(Mask mask) {
            Mask mask2 = this.mask_;
            if (mask2 == null || mask2 == Mask.getDefaultInstance()) {
                this.mask_ = mask;
            } else {
                this.mask_ = (Mask) ((Mask.Builder) Mask.newBuilder(this.mask_).mergeFrom(mask)).buildPartial();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergePreviewMask(userMaskConfig.UserMask userMask) {
            userMaskConfig.UserMask userMask2 = this.previewMask_;
            if (userMask2 == null || userMask2 == userMaskConfig.UserMask.getDefaultInstance()) {
                this.previewMask_ = userMask;
            } else {
                this.previewMask_ = (userMaskConfig.UserMask) ((userMaskConfig.UserMask.Builder) userMaskConfig.UserMask.newBuilder(this.previewMask_).mergeFrom(userMask)).buildPartial();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeReceiverShowMask(userMaskConfig.UserMask userMask) {
            userMaskConfig.UserMask userMask2 = this.receiverShowMask_;
            if (userMask2 == null || userMask2 == userMaskConfig.UserMask.getDefaultInstance()) {
                this.receiverShowMask_ = userMask;
            } else {
                this.receiverShowMask_ = (userMaskConfig.UserMask) ((userMaskConfig.UserMask.Builder) userMaskConfig.UserMask.newBuilder(this.receiverShowMask_).mergeFrom(userMask)).buildPartial();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeSenderShowMask(userMaskConfig.UserMask userMask) {
            userMaskConfig.UserMask userMask2 = this.senderShowMask_;
            if (userMask2 == null || userMask2 == userMaskConfig.UserMask.getDefaultInstance()) {
                this.senderShowMask_ = userMask;
            } else {
                this.senderShowMask_ = (userMaskConfig.UserMask) ((userMaskConfig.UserMask.Builder) userMaskConfig.UserMask.newBuilder(this.senderShowMask_).mergeFrom(userMask)).buildPartial();
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

        public static Builder newBuilder(LiveGiftExtraInfo liveGiftExtraInfo) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(liveGiftExtraInfo);
        }

        public static LiveGiftExtraInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (LiveGiftExtraInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LiveGiftExtraInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (LiveGiftExtraInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<LiveGiftExtraInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeVideoEffectExtras(int i) {
            ensureVideoEffectExtrasIsMutable();
            this.videoEffectExtras_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDrawInfo(LiveGiftDrawInfo.Builder builder) {
            this.drawInfo_ = (LiveGiftDrawInfo) builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEffectExt(String str) {
            str.getClass();
            this.effectExt_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEffectExtBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.effectExt_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMask(Mask.Builder builder) {
            this.mask_ = (Mask) builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMaskMode(boolean z) {
            this.maskMode_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPreviewMask(userMaskConfig.UserMask.Builder builder) {
            this.previewMask_ = (userMaskConfig.UserMask) builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setReceiverShowMask(userMaskConfig.UserMask.Builder builder) {
            this.receiverShowMask_ = (userMaskConfig.UserMask) builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSenderShowMask(userMaskConfig.UserMask.Builder builder) {
            this.senderShowMask_ = (userMaskConfig.UserMask) builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserMask(userMaskConfig.UserMask.Builder builder) {
            this.userMask_ = (userMaskConfig.UserMask) builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVideoEffectExtras(int i, VideoEffectExtra.Builder builder) {
            ensureVideoEffectExtrasIsMutable();
            this.videoEffectExtras_.set(i, (VideoEffectExtra) builder.build());
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C03231.f1639xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new LiveGiftExtraInfo();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.videoEffectExtras_.n();
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.g gVar = (GeneratedMessageLite.h) obj;
                    LiveGiftExtraInfo liveGiftExtraInfo = (LiveGiftExtraInfo) obj2;
                    this.drawInfo_ = gVar.o(this.drawInfo_, liveGiftExtraInfo.drawInfo_);
                    boolean z = this.maskMode_;
                    boolean z2 = liveGiftExtraInfo.maskMode_;
                    this.maskMode_ = gVar.d(z, z, z2, z2);
                    this.mask_ = gVar.o(this.mask_, liveGiftExtraInfo.mask_);
                    this.userMask_ = gVar.o(this.userMask_, liveGiftExtraInfo.userMask_);
                    this.videoEffectExtras_ = gVar.g(this.videoEffectExtras_, liveGiftExtraInfo.videoEffectExtras_);
                    this.effectExt_ = gVar.f(!this.effectExt_.isEmpty(), this.effectExt_, true ^ liveGiftExtraInfo.effectExt_.isEmpty(), liveGiftExtraInfo.effectExt_);
                    this.previewMask_ = gVar.o(this.previewMask_, liveGiftExtraInfo.previewMask_);
                    this.senderShowMask_ = gVar.o(this.senderShowMask_, liveGiftExtraInfo.senderShowMask_);
                    this.receiverShowMask_ = gVar.o(this.receiverShowMask_, liveGiftExtraInfo.receiverShowMask_);
                    if (gVar == GeneratedMessageLite.g.INSTANCE) {
                        this.bitField0_ |= liveGiftExtraInfo.bitField0_;
                    }
                    return this;
                case 6:
                    e eVar = (e) obj;
                    h hVar = (h) obj2;
                    boolean z3 = false;
                    while (!z3) {
                        try {
                            int iM = eVar.M();
                            if (iM != 0) {
                                if (iM == 10) {
                                    LiveGiftDrawInfo liveGiftDrawInfo = this.drawInfo_;
                                    LiveGiftDrawInfo.Builder builder = liveGiftDrawInfo != null ? (LiveGiftDrawInfo.Builder) liveGiftDrawInfo.toBuilder() : null;
                                    LiveGiftDrawInfo liveGiftDrawInfoW = eVar.w(LiveGiftDrawInfo.parser(), hVar);
                                    this.drawInfo_ = liveGiftDrawInfoW;
                                    if (builder != null) {
                                        builder.mergeFrom(liveGiftDrawInfoW);
                                        this.drawInfo_ = (LiveGiftDrawInfo) builder.buildPartial();
                                    }
                                } else if (iM == 16) {
                                    this.maskMode_ = eVar.m();
                                } else if (iM == 26) {
                                    Mask mask = this.mask_;
                                    Mask.Builder builder2 = mask != null ? (Mask.Builder) mask.toBuilder() : null;
                                    Mask maskW = eVar.w(Mask.parser(), hVar);
                                    this.mask_ = maskW;
                                    if (builder2 != null) {
                                        builder2.mergeFrom(maskW);
                                        this.mask_ = (Mask) builder2.buildPartial();
                                    }
                                } else if (iM == 34) {
                                    userMaskConfig.UserMask userMask = this.userMask_;
                                    userMaskConfig.UserMask.Builder builder3 = userMask != null ? (userMaskConfig.UserMask.Builder) userMask.toBuilder() : null;
                                    userMaskConfig.UserMask userMaskW = eVar.w(userMaskConfig.UserMask.parser(), hVar);
                                    this.userMask_ = userMaskW;
                                    if (builder3 != null) {
                                        builder3.mergeFrom(userMaskW);
                                        this.userMask_ = (userMaskConfig.UserMask) builder3.buildPartial();
                                    }
                                } else if (iM == 42) {
                                    if (!this.videoEffectExtras_.q()) {
                                        this.videoEffectExtras_ = GeneratedMessageLite.mutableCopy(this.videoEffectExtras_);
                                    }
                                    this.videoEffectExtras_.add(eVar.w(VideoEffectExtra.parser(), hVar));
                                } else if (iM == 50) {
                                    this.effectExt_ = eVar.L();
                                } else if (iM == 58) {
                                    userMaskConfig.UserMask userMask2 = this.previewMask_;
                                    userMaskConfig.UserMask.Builder builder4 = userMask2 != null ? (userMaskConfig.UserMask.Builder) userMask2.toBuilder() : null;
                                    userMaskConfig.UserMask userMaskW2 = eVar.w(userMaskConfig.UserMask.parser(), hVar);
                                    this.previewMask_ = userMaskW2;
                                    if (builder4 != null) {
                                        builder4.mergeFrom(userMaskW2);
                                        this.previewMask_ = (userMaskConfig.UserMask) builder4.buildPartial();
                                    }
                                } else if (iM == 66) {
                                    userMaskConfig.UserMask userMask3 = this.senderShowMask_;
                                    userMaskConfig.UserMask.Builder builder5 = userMask3 != null ? (userMaskConfig.UserMask.Builder) userMask3.toBuilder() : null;
                                    userMaskConfig.UserMask userMaskW3 = eVar.w(userMaskConfig.UserMask.parser(), hVar);
                                    this.senderShowMask_ = userMaskW3;
                                    if (builder5 != null) {
                                        builder5.mergeFrom(userMaskW3);
                                        this.senderShowMask_ = (userMaskConfig.UserMask) builder5.buildPartial();
                                    }
                                } else if (iM == 74) {
                                    userMaskConfig.UserMask userMask4 = this.receiverShowMask_;
                                    userMaskConfig.UserMask.Builder builder6 = userMask4 != null ? (userMaskConfig.UserMask.Builder) userMask4.toBuilder() : null;
                                    userMaskConfig.UserMask userMaskW4 = eVar.w(userMaskConfig.UserMask.parser(), hVar);
                                    this.receiverShowMask_ = userMaskW4;
                                    if (builder6 != null) {
                                        builder6.mergeFrom(userMaskW4);
                                        this.receiverShowMask_ = (userMaskConfig.UserMask) builder6.buildPartial();
                                    }
                                } else if (!eVar.R(iM)) {
                                }
                            }
                            z3 = true;
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
                        synchronized (LiveGiftExtraInfo.class) {
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

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveGiftExtraInfoOrBuilder
        public LiveGiftDrawInfo getDrawInfo() {
            LiveGiftDrawInfo liveGiftDrawInfo = this.drawInfo_;
            return liveGiftDrawInfo == null ? LiveGiftDrawInfo.getDefaultInstance() : liveGiftDrawInfo;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveGiftExtraInfoOrBuilder
        public String getEffectExt() {
            return this.effectExt_;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveGiftExtraInfoOrBuilder
        public ByteString getEffectExtBytes() {
            return ByteString.copyFromUtf8(this.effectExt_);
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveGiftExtraInfoOrBuilder
        public Mask getMask() {
            Mask mask = this.mask_;
            return mask == null ? Mask.getDefaultInstance() : mask;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveGiftExtraInfoOrBuilder
        public boolean getMaskMode() {
            return this.maskMode_;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveGiftExtraInfoOrBuilder
        public userMaskConfig.UserMask getPreviewMask() {
            userMaskConfig.UserMask userMask = this.previewMask_;
            return userMask == null ? userMaskConfig.UserMask.getDefaultInstance() : userMask;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveGiftExtraInfoOrBuilder
        public userMaskConfig.UserMask getReceiverShowMask() {
            userMaskConfig.UserMask userMask = this.receiverShowMask_;
            return userMask == null ? userMaskConfig.UserMask.getDefaultInstance() : userMask;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveGiftExtraInfoOrBuilder
        public userMaskConfig.UserMask getSenderShowMask() {
            userMaskConfig.UserMask userMask = this.senderShowMask_;
            return userMask == null ? userMaskConfig.UserMask.getDefaultInstance() : userMask;
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iC = this.drawInfo_ != null ? CodedOutputStream.C(1, getDrawInfo()) : 0;
            boolean z = this.maskMode_;
            if (z) {
                iC += CodedOutputStream.f(2, z);
            }
            if (this.mask_ != null) {
                iC += CodedOutputStream.C(3, getMask());
            }
            if (this.userMask_ != null) {
                iC += CodedOutputStream.C(4, getUserMask());
            }
            for (int i2 = 0; i2 < this.videoEffectExtras_.size(); i2++) {
                iC += CodedOutputStream.C(5, (q) this.videoEffectExtras_.get(i2));
            }
            if (!this.effectExt_.isEmpty()) {
                iC += CodedOutputStream.K(6, getEffectExt());
            }
            if (this.previewMask_ != null) {
                iC += CodedOutputStream.C(7, getPreviewMask());
            }
            if (this.senderShowMask_ != null) {
                iC += CodedOutputStream.C(8, getSenderShowMask());
            }
            if (this.receiverShowMask_ != null) {
                iC += CodedOutputStream.C(9, getReceiverShowMask());
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iC;
            return iC;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveGiftExtraInfoOrBuilder
        public userMaskConfig.UserMask getUserMask() {
            userMaskConfig.UserMask userMask = this.userMask_;
            return userMask == null ? userMaskConfig.UserMask.getDefaultInstance() : userMask;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveGiftExtraInfoOrBuilder
        public VideoEffectExtra getVideoEffectExtras(int i) {
            return (VideoEffectExtra) this.videoEffectExtras_.get(i);
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveGiftExtraInfoOrBuilder
        public int getVideoEffectExtrasCount() {
            return this.videoEffectExtras_.size();
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveGiftExtraInfoOrBuilder
        public List<VideoEffectExtra> getVideoEffectExtrasList() {
            return this.videoEffectExtras_;
        }

        public VideoEffectExtraOrBuilder getVideoEffectExtrasOrBuilder(int i) {
            return (VideoEffectExtraOrBuilder) this.videoEffectExtras_.get(i);
        }

        public List<? extends VideoEffectExtraOrBuilder> getVideoEffectExtrasOrBuilderList() {
            return this.videoEffectExtras_;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveGiftExtraInfoOrBuilder
        public boolean hasDrawInfo() {
            return this.drawInfo_ != null;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveGiftExtraInfoOrBuilder
        public boolean hasMask() {
            return this.mask_ != null;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveGiftExtraInfoOrBuilder
        public boolean hasPreviewMask() {
            return this.previewMask_ != null;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveGiftExtraInfoOrBuilder
        public boolean hasReceiverShowMask() {
            return this.receiverShowMask_ != null;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveGiftExtraInfoOrBuilder
        public boolean hasSenderShowMask() {
            return this.senderShowMask_ != null;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveGiftExtraInfoOrBuilder
        public boolean hasUserMask() {
            return this.userMask_ != null;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.drawInfo_ != null) {
                codedOutputStream.w0(1, getDrawInfo());
            }
            boolean z = this.maskMode_;
            if (z) {
                codedOutputStream.a0(2, z);
            }
            if (this.mask_ != null) {
                codedOutputStream.w0(3, getMask());
            }
            if (this.userMask_ != null) {
                codedOutputStream.w0(4, getUserMask());
            }
            for (int i = 0; i < this.videoEffectExtras_.size(); i++) {
                codedOutputStream.w0(5, (q) this.videoEffectExtras_.get(i));
            }
            if (!this.effectExt_.isEmpty()) {
                codedOutputStream.D0(6, getEffectExt());
            }
            if (this.previewMask_ != null) {
                codedOutputStream.w0(7, getPreviewMask());
            }
            if (this.senderShowMask_ != null) {
                codedOutputStream.w0(8, getSenderShowMask());
            }
            if (this.receiverShowMask_ != null) {
                codedOutputStream.w0(9, getReceiverShowMask());
            }
        }

        public static LiveGiftExtraInfo parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (LiveGiftExtraInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static LiveGiftExtraInfo parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (LiveGiftExtraInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDrawInfo(LiveGiftDrawInfo liveGiftDrawInfo) {
            liveGiftDrawInfo.getClass();
            this.drawInfo_ = liveGiftDrawInfo;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMask(Mask mask) {
            mask.getClass();
            this.mask_ = mask;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPreviewMask(userMaskConfig.UserMask userMask) {
            userMask.getClass();
            this.previewMask_ = userMask;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setReceiverShowMask(userMaskConfig.UserMask userMask) {
            userMask.getClass();
            this.receiverShowMask_ = userMask;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSenderShowMask(userMaskConfig.UserMask userMask) {
            userMask.getClass();
            this.senderShowMask_ = userMask;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserMask(userMaskConfig.UserMask userMask) {
            userMask.getClass();
            this.userMask_ = userMask;
        }

        public static final class Builder extends GeneratedMessageLite.b<LiveGiftExtraInfo, Builder> implements LiveGiftExtraInfoOrBuilder {
            private Builder() {
                super(LiveGiftExtraInfo.DEFAULT_INSTANCE);
            }

            public Builder addAllVideoEffectExtras(Iterable<? extends VideoEffectExtra> iterable) {
                copyOnWrite();
                ((LiveGiftExtraInfo) ((GeneratedMessageLite.b) this).instance).addAllVideoEffectExtras(iterable);
                return this;
            }

            public Builder addVideoEffectExtras(VideoEffectExtra videoEffectExtra) {
                copyOnWrite();
                ((LiveGiftExtraInfo) ((GeneratedMessageLite.b) this).instance).addVideoEffectExtras(videoEffectExtra);
                return this;
            }

            public Builder clearDrawInfo() {
                copyOnWrite();
                ((LiveGiftExtraInfo) ((GeneratedMessageLite.b) this).instance).clearDrawInfo();
                return this;
            }

            public Builder clearEffectExt() {
                copyOnWrite();
                ((LiveGiftExtraInfo) ((GeneratedMessageLite.b) this).instance).clearEffectExt();
                return this;
            }

            public Builder clearMask() {
                copyOnWrite();
                ((LiveGiftExtraInfo) ((GeneratedMessageLite.b) this).instance).clearMask();
                return this;
            }

            public Builder clearMaskMode() {
                copyOnWrite();
                ((LiveGiftExtraInfo) ((GeneratedMessageLite.b) this).instance).clearMaskMode();
                return this;
            }

            public Builder clearPreviewMask() {
                copyOnWrite();
                ((LiveGiftExtraInfo) ((GeneratedMessageLite.b) this).instance).clearPreviewMask();
                return this;
            }

            public Builder clearReceiverShowMask() {
                copyOnWrite();
                ((LiveGiftExtraInfo) ((GeneratedMessageLite.b) this).instance).clearReceiverShowMask();
                return this;
            }

            public Builder clearSenderShowMask() {
                copyOnWrite();
                ((LiveGiftExtraInfo) ((GeneratedMessageLite.b) this).instance).clearSenderShowMask();
                return this;
            }

            public Builder clearUserMask() {
                copyOnWrite();
                ((LiveGiftExtraInfo) ((GeneratedMessageLite.b) this).instance).clearUserMask();
                return this;
            }

            public Builder clearVideoEffectExtras() {
                copyOnWrite();
                ((LiveGiftExtraInfo) ((GeneratedMessageLite.b) this).instance).clearVideoEffectExtras();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveGiftExtraInfoOrBuilder
            public LiveGiftDrawInfo getDrawInfo() {
                return ((LiveGiftExtraInfo) ((GeneratedMessageLite.b) this).instance).getDrawInfo();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveGiftExtraInfoOrBuilder
            public String getEffectExt() {
                return ((LiveGiftExtraInfo) ((GeneratedMessageLite.b) this).instance).getEffectExt();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveGiftExtraInfoOrBuilder
            public ByteString getEffectExtBytes() {
                return ((LiveGiftExtraInfo) ((GeneratedMessageLite.b) this).instance).getEffectExtBytes();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveGiftExtraInfoOrBuilder
            public Mask getMask() {
                return ((LiveGiftExtraInfo) ((GeneratedMessageLite.b) this).instance).getMask();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveGiftExtraInfoOrBuilder
            public boolean getMaskMode() {
                return ((LiveGiftExtraInfo) ((GeneratedMessageLite.b) this).instance).getMaskMode();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveGiftExtraInfoOrBuilder
            public userMaskConfig.UserMask getPreviewMask() {
                return ((LiveGiftExtraInfo) ((GeneratedMessageLite.b) this).instance).getPreviewMask();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveGiftExtraInfoOrBuilder
            public userMaskConfig.UserMask getReceiverShowMask() {
                return ((LiveGiftExtraInfo) ((GeneratedMessageLite.b) this).instance).getReceiverShowMask();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveGiftExtraInfoOrBuilder
            public userMaskConfig.UserMask getSenderShowMask() {
                return ((LiveGiftExtraInfo) ((GeneratedMessageLite.b) this).instance).getSenderShowMask();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveGiftExtraInfoOrBuilder
            public userMaskConfig.UserMask getUserMask() {
                return ((LiveGiftExtraInfo) ((GeneratedMessageLite.b) this).instance).getUserMask();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveGiftExtraInfoOrBuilder
            public VideoEffectExtra getVideoEffectExtras(int i) {
                return ((LiveGiftExtraInfo) ((GeneratedMessageLite.b) this).instance).getVideoEffectExtras(i);
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveGiftExtraInfoOrBuilder
            public int getVideoEffectExtrasCount() {
                return ((LiveGiftExtraInfo) ((GeneratedMessageLite.b) this).instance).getVideoEffectExtrasCount();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveGiftExtraInfoOrBuilder
            public List<VideoEffectExtra> getVideoEffectExtrasList() {
                return Collections.unmodifiableList(((LiveGiftExtraInfo) ((GeneratedMessageLite.b) this).instance).getVideoEffectExtrasList());
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveGiftExtraInfoOrBuilder
            public boolean hasDrawInfo() {
                return ((LiveGiftExtraInfo) ((GeneratedMessageLite.b) this).instance).hasDrawInfo();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveGiftExtraInfoOrBuilder
            public boolean hasMask() {
                return ((LiveGiftExtraInfo) ((GeneratedMessageLite.b) this).instance).hasMask();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveGiftExtraInfoOrBuilder
            public boolean hasPreviewMask() {
                return ((LiveGiftExtraInfo) ((GeneratedMessageLite.b) this).instance).hasPreviewMask();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveGiftExtraInfoOrBuilder
            public boolean hasReceiverShowMask() {
                return ((LiveGiftExtraInfo) ((GeneratedMessageLite.b) this).instance).hasReceiverShowMask();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveGiftExtraInfoOrBuilder
            public boolean hasSenderShowMask() {
                return ((LiveGiftExtraInfo) ((GeneratedMessageLite.b) this).instance).hasSenderShowMask();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveGiftExtraInfoOrBuilder
            public boolean hasUserMask() {
                return ((LiveGiftExtraInfo) ((GeneratedMessageLite.b) this).instance).hasUserMask();
            }

            public Builder mergeDrawInfo(LiveGiftDrawInfo liveGiftDrawInfo) {
                copyOnWrite();
                ((LiveGiftExtraInfo) ((GeneratedMessageLite.b) this).instance).mergeDrawInfo(liveGiftDrawInfo);
                return this;
            }

            public Builder mergeMask(Mask mask) {
                copyOnWrite();
                ((LiveGiftExtraInfo) ((GeneratedMessageLite.b) this).instance).mergeMask(mask);
                return this;
            }

            public Builder mergePreviewMask(userMaskConfig.UserMask userMask) {
                copyOnWrite();
                ((LiveGiftExtraInfo) ((GeneratedMessageLite.b) this).instance).mergePreviewMask(userMask);
                return this;
            }

            public Builder mergeReceiverShowMask(userMaskConfig.UserMask userMask) {
                copyOnWrite();
                ((LiveGiftExtraInfo) ((GeneratedMessageLite.b) this).instance).mergeReceiverShowMask(userMask);
                return this;
            }

            public Builder mergeSenderShowMask(userMaskConfig.UserMask userMask) {
                copyOnWrite();
                ((LiveGiftExtraInfo) ((GeneratedMessageLite.b) this).instance).mergeSenderShowMask(userMask);
                return this;
            }

            public Builder mergeUserMask(userMaskConfig.UserMask userMask) {
                copyOnWrite();
                ((LiveGiftExtraInfo) ((GeneratedMessageLite.b) this).instance).mergeUserMask(userMask);
                return this;
            }

            public Builder removeVideoEffectExtras(int i) {
                copyOnWrite();
                ((LiveGiftExtraInfo) ((GeneratedMessageLite.b) this).instance).removeVideoEffectExtras(i);
                return this;
            }

            public Builder setDrawInfo(LiveGiftDrawInfo liveGiftDrawInfo) {
                copyOnWrite();
                ((LiveGiftExtraInfo) ((GeneratedMessageLite.b) this).instance).setDrawInfo(liveGiftDrawInfo);
                return this;
            }

            public Builder setEffectExt(String str) {
                copyOnWrite();
                ((LiveGiftExtraInfo) ((GeneratedMessageLite.b) this).instance).setEffectExt(str);
                return this;
            }

            public Builder setEffectExtBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveGiftExtraInfo) ((GeneratedMessageLite.b) this).instance).setEffectExtBytes(byteString);
                return this;
            }

            public Builder setMask(Mask mask) {
                copyOnWrite();
                ((LiveGiftExtraInfo) ((GeneratedMessageLite.b) this).instance).setMask(mask);
                return this;
            }

            public Builder setMaskMode(boolean z) {
                copyOnWrite();
                ((LiveGiftExtraInfo) ((GeneratedMessageLite.b) this).instance).setMaskMode(z);
                return this;
            }

            public Builder setPreviewMask(userMaskConfig.UserMask userMask) {
                copyOnWrite();
                ((LiveGiftExtraInfo) ((GeneratedMessageLite.b) this).instance).setPreviewMask(userMask);
                return this;
            }

            public Builder setReceiverShowMask(userMaskConfig.UserMask userMask) {
                copyOnWrite();
                ((LiveGiftExtraInfo) ((GeneratedMessageLite.b) this).instance).setReceiverShowMask(userMask);
                return this;
            }

            public Builder setSenderShowMask(userMaskConfig.UserMask userMask) {
                copyOnWrite();
                ((LiveGiftExtraInfo) ((GeneratedMessageLite.b) this).instance).setSenderShowMask(userMask);
                return this;
            }

            public Builder setUserMask(userMaskConfig.UserMask userMask) {
                copyOnWrite();
                ((LiveGiftExtraInfo) ((GeneratedMessageLite.b) this).instance).setUserMask(userMask);
                return this;
            }

            public Builder setVideoEffectExtras(int i, VideoEffectExtra videoEffectExtra) {
                copyOnWrite();
                ((LiveGiftExtraInfo) ((GeneratedMessageLite.b) this).instance).setVideoEffectExtras(i, videoEffectExtra);
                return this;
            }

            public Builder addVideoEffectExtras(int i, VideoEffectExtra videoEffectExtra) {
                copyOnWrite();
                ((LiveGiftExtraInfo) ((GeneratedMessageLite.b) this).instance).addVideoEffectExtras(i, videoEffectExtra);
                return this;
            }

            public Builder setDrawInfo(LiveGiftDrawInfo.Builder builder) {
                copyOnWrite();
                ((LiveGiftExtraInfo) ((GeneratedMessageLite.b) this).instance).setDrawInfo(builder);
                return this;
            }

            public Builder setMask(Mask.Builder builder) {
                copyOnWrite();
                ((LiveGiftExtraInfo) ((GeneratedMessageLite.b) this).instance).setMask(builder);
                return this;
            }

            public Builder setPreviewMask(userMaskConfig.UserMask.Builder builder) {
                copyOnWrite();
                ((LiveGiftExtraInfo) ((GeneratedMessageLite.b) this).instance).setPreviewMask(builder);
                return this;
            }

            public Builder setReceiverShowMask(userMaskConfig.UserMask.Builder builder) {
                copyOnWrite();
                ((LiveGiftExtraInfo) ((GeneratedMessageLite.b) this).instance).setReceiverShowMask(builder);
                return this;
            }

            public Builder setSenderShowMask(userMaskConfig.UserMask.Builder builder) {
                copyOnWrite();
                ((LiveGiftExtraInfo) ((GeneratedMessageLite.b) this).instance).setSenderShowMask(builder);
                return this;
            }

            public Builder setUserMask(userMaskConfig.UserMask.Builder builder) {
                copyOnWrite();
                ((LiveGiftExtraInfo) ((GeneratedMessageLite.b) this).instance).setUserMask(builder);
                return this;
            }

            public Builder setVideoEffectExtras(int i, VideoEffectExtra.Builder builder) {
                copyOnWrite();
                ((LiveGiftExtraInfo) ((GeneratedMessageLite.b) this).instance).setVideoEffectExtras(i, builder);
                return this;
            }

            public Builder addVideoEffectExtras(VideoEffectExtra.Builder builder) {
                copyOnWrite();
                ((LiveGiftExtraInfo) ((GeneratedMessageLite.b) this).instance).addVideoEffectExtras(builder);
                return this;
            }

            public Builder addVideoEffectExtras(int i, VideoEffectExtra.Builder builder) {
                copyOnWrite();
                ((LiveGiftExtraInfo) ((GeneratedMessageLite.b) this).instance).addVideoEffectExtras(i, builder);
                return this;
            }
        }

        public static LiveGiftExtraInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (LiveGiftExtraInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static LiveGiftExtraInfo parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (LiveGiftExtraInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static LiveGiftExtraInfo parseFrom(InputStream inputStream) throws IOException {
            return (LiveGiftExtraInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LiveGiftExtraInfo parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (LiveGiftExtraInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static LiveGiftExtraInfo parseFrom(e eVar) throws IOException {
            return (LiveGiftExtraInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addVideoEffectExtras(int i, VideoEffectExtra videoEffectExtra) {
            videoEffectExtra.getClass();
            ensureVideoEffectExtrasIsMutable();
            this.videoEffectExtras_.add(i, videoEffectExtra);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static LiveGiftExtraInfo parseFrom(e eVar, h hVar) throws IOException {
            return (LiveGiftExtraInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVideoEffectExtras(int i, VideoEffectExtra videoEffectExtra) {
            videoEffectExtra.getClass();
            ensureVideoEffectExtrasIsMutable();
            this.videoEffectExtras_.set(i, videoEffectExtra);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addVideoEffectExtras(VideoEffectExtra videoEffectExtra) {
            videoEffectExtra.getClass();
            ensureVideoEffectExtrasIsMutable();
            this.videoEffectExtras_.add(videoEffectExtra);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addVideoEffectExtras(int i, VideoEffectExtra.Builder builder) {
            ensureVideoEffectExtrasIsMutable();
            this.videoEffectExtras_.add(i, (VideoEffectExtra) builder.build());
        }
    }

    public static final class LiveGiftMessage extends GeneratedMessageLite<LiveGiftMessage, Builder> implements LiveGiftMessageOrBuilder {
        private static final LiveGiftMessage DEFAULT_INSTANCE;
        private static volatile i860<LiveGiftMessage> PARSER = null;
        public static final int ROOMID_FIELD_NUMBER = 2;
        public static final int TEMPDATA_FIELD_NUMBER = 1;
        private String roomId_ = "";
        private TemplateData tempdata_;

        static {
            LiveGiftMessage liveGiftMessage = new LiveGiftMessage();
            DEFAULT_INSTANCE = liveGiftMessage;
            liveGiftMessage.makeImmutable();
        }

        private LiveGiftMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRoomId() {
            this.roomId_ = getDefaultInstance().getRoomId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTempdata() {
            this.tempdata_ = null;
        }

        public static LiveGiftMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeTempdata(TemplateData templateData) {
            TemplateData templateData2 = this.tempdata_;
            if (templateData2 == null || templateData2 == TemplateData.getDefaultInstance()) {
                this.tempdata_ = templateData;
            } else {
                this.tempdata_ = (TemplateData) ((TemplateData.Builder) TemplateData.newBuilder(this.tempdata_).mergeFrom(templateData)).buildPartial();
            }
        }

        public static Builder newBuilder(LiveGiftMessage liveGiftMessage) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(liveGiftMessage);
        }

        public static LiveGiftMessage parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (LiveGiftMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LiveGiftMessage parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (LiveGiftMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<LiveGiftMessage> parser() {
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
        public void setTempdata(TemplateData.Builder builder) {
            this.tempdata_ = (TemplateData) builder.build();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C03231.f1639xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new LiveGiftMessage();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    LiveGiftMessage liveGiftMessage = (LiveGiftMessage) obj2;
                    this.tempdata_ = hVar.o(this.tempdata_, liveGiftMessage.tempdata_);
                    this.roomId_ = hVar.f(!this.roomId_.isEmpty(), this.roomId_, true ^ liveGiftMessage.roomId_.isEmpty(), liveGiftMessage.roomId_);
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
                                    TemplateData templateData = this.tempdata_;
                                    TemplateData.Builder builder = templateData != null ? (TemplateData.Builder) templateData.toBuilder() : null;
                                    TemplateData templateDataW = eVar.w(TemplateData.parser(), hVar2);
                                    this.tempdata_ = templateDataW;
                                    if (builder != null) {
                                        builder.mergeFrom(templateDataW);
                                        this.tempdata_ = (TemplateData) builder.buildPartial();
                                    }
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
                        synchronized (LiveGiftMessage.class) {
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

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveGiftMessageOrBuilder
        public String getRoomId() {
            return this.roomId_;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveGiftMessageOrBuilder
        public ByteString getRoomIdBytes() {
            return ByteString.copyFromUtf8(this.roomId_);
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iC = this.tempdata_ != null ? CodedOutputStream.C(1, getTempdata()) : 0;
            if (!this.roomId_.isEmpty()) {
                iC += CodedOutputStream.K(2, getRoomId());
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iC;
            return iC;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveGiftMessageOrBuilder
        public TemplateData getTempdata() {
            TemplateData templateData = this.tempdata_;
            return templateData == null ? TemplateData.getDefaultInstance() : templateData;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveGiftMessageOrBuilder
        public boolean hasTempdata() {
            return this.tempdata_ != null;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.tempdata_ != null) {
                codedOutputStream.w0(1, getTempdata());
            }
            if (this.roomId_.isEmpty()) {
                return;
            }
            codedOutputStream.D0(2, getRoomId());
        }

        public static LiveGiftMessage parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (LiveGiftMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static LiveGiftMessage parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (LiveGiftMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTempdata(TemplateData templateData) {
            templateData.getClass();
            this.tempdata_ = templateData;
        }

        public static final class Builder extends GeneratedMessageLite.b<LiveGiftMessage, Builder> implements LiveGiftMessageOrBuilder {
            private Builder() {
                super(LiveGiftMessage.DEFAULT_INSTANCE);
            }

            public Builder clearRoomId() {
                copyOnWrite();
                ((LiveGiftMessage) ((GeneratedMessageLite.b) this).instance).clearRoomId();
                return this;
            }

            public Builder clearTempdata() {
                copyOnWrite();
                ((LiveGiftMessage) ((GeneratedMessageLite.b) this).instance).clearTempdata();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveGiftMessageOrBuilder
            public String getRoomId() {
                return ((LiveGiftMessage) ((GeneratedMessageLite.b) this).instance).getRoomId();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveGiftMessageOrBuilder
            public ByteString getRoomIdBytes() {
                return ((LiveGiftMessage) ((GeneratedMessageLite.b) this).instance).getRoomIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveGiftMessageOrBuilder
            public TemplateData getTempdata() {
                return ((LiveGiftMessage) ((GeneratedMessageLite.b) this).instance).getTempdata();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveGiftMessageOrBuilder
            public boolean hasTempdata() {
                return ((LiveGiftMessage) ((GeneratedMessageLite.b) this).instance).hasTempdata();
            }

            public Builder mergeTempdata(TemplateData templateData) {
                copyOnWrite();
                ((LiveGiftMessage) ((GeneratedMessageLite.b) this).instance).mergeTempdata(templateData);
                return this;
            }

            public Builder setRoomId(String str) {
                copyOnWrite();
                ((LiveGiftMessage) ((GeneratedMessageLite.b) this).instance).setRoomId(str);
                return this;
            }

            public Builder setRoomIdBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveGiftMessage) ((GeneratedMessageLite.b) this).instance).setRoomIdBytes(byteString);
                return this;
            }

            public Builder setTempdata(TemplateData templateData) {
                copyOnWrite();
                ((LiveGiftMessage) ((GeneratedMessageLite.b) this).instance).setTempdata(templateData);
                return this;
            }

            public Builder setTempdata(TemplateData.Builder builder) {
                copyOnWrite();
                ((LiveGiftMessage) ((GeneratedMessageLite.b) this).instance).setTempdata(builder);
                return this;
            }
        }

        public static LiveGiftMessage parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (LiveGiftMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static LiveGiftMessage parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (LiveGiftMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static LiveGiftMessage parseFrom(InputStream inputStream) throws IOException {
            return (LiveGiftMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LiveGiftMessage parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (LiveGiftMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static LiveGiftMessage parseFrom(e eVar) throws IOException {
            return (LiveGiftMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static LiveGiftMessage parseFrom(e eVar, h hVar) throws IOException {
            return (LiveGiftMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public static final class LiveGiftReceivedMsg extends GeneratedMessageLite<LiveGiftReceivedMsg, Builder> implements LiveGiftReceivedMsgOrBuilder {
        public static final int ANCHORID_FIELD_NUMBER = 4;
        public static final int ANCHORUSERNAME_FIELD_NUMBER = 6;
        private static final LiveGiftReceivedMsg DEFAULT_INSTANCE;
        public static final int GIFTITEMBRIEF_FIELD_NUMBER = 5;
        public static final int GUILDCALL_FIELD_NUMBER = 8;
        public static final int ID_FIELD_NUMBER = 2;
        public static final int LIVEID_FIELD_NUMBER = 1;
        public static final int MULTICALL_FIELD_NUMBER = 7;
        private static volatile i860<LiveGiftReceivedMsg> PARSER = null;
        public static final int USERID_FIELD_NUMBER = 3;
        public static final int VIDEOCHAT_FIELD_NUMBER = 9;
        private GiftItemBrief giftItemBrief_;
        private GiftMultiCall guildCall_;
        private GiftMultiCall multiCall_;
        private GiftVideoChatInfo videoChat_;
        private String liveId_ = "";
        private String id_ = "";
        private String userId_ = "";
        private String anchorId_ = "";
        private String anchorUserName_ = "";

        static {
            LiveGiftReceivedMsg liveGiftReceivedMsg = new LiveGiftReceivedMsg();
            DEFAULT_INSTANCE = liveGiftReceivedMsg;
            liveGiftReceivedMsg.makeImmutable();
        }

        private LiveGiftReceivedMsg() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAnchorId() {
            this.anchorId_ = getDefaultInstance().getAnchorId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAnchorUserName() {
            this.anchorUserName_ = getDefaultInstance().getAnchorUserName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGiftItemBrief() {
            this.giftItemBrief_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGuildCall() {
            this.guildCall_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearId() {
            this.id_ = getDefaultInstance().getId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLiveId() {
            this.liveId_ = getDefaultInstance().getLiveId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMultiCall() {
            this.multiCall_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUserId() {
            this.userId_ = getDefaultInstance().getUserId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVideoChat() {
            this.videoChat_ = null;
        }

        public static LiveGiftReceivedMsg getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeGiftItemBrief(GiftItemBrief giftItemBrief) {
            GiftItemBrief giftItemBrief2 = this.giftItemBrief_;
            if (giftItemBrief2 == null || giftItemBrief2 == GiftItemBrief.getDefaultInstance()) {
                this.giftItemBrief_ = giftItemBrief;
            } else {
                this.giftItemBrief_ = (GiftItemBrief) ((GiftItemBrief.Builder) GiftItemBrief.newBuilder(this.giftItemBrief_).mergeFrom(giftItemBrief)).buildPartial();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeGuildCall(GiftMultiCall giftMultiCall) {
            GiftMultiCall giftMultiCall2 = this.guildCall_;
            if (giftMultiCall2 == null || giftMultiCall2 == GiftMultiCall.getDefaultInstance()) {
                this.guildCall_ = giftMultiCall;
            } else {
                this.guildCall_ = (GiftMultiCall) ((GiftMultiCall.Builder) GiftMultiCall.newBuilder(this.guildCall_).mergeFrom(giftMultiCall)).buildPartial();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeMultiCall(GiftMultiCall giftMultiCall) {
            GiftMultiCall giftMultiCall2 = this.multiCall_;
            if (giftMultiCall2 == null || giftMultiCall2 == GiftMultiCall.getDefaultInstance()) {
                this.multiCall_ = giftMultiCall;
            } else {
                this.multiCall_ = (GiftMultiCall) ((GiftMultiCall.Builder) GiftMultiCall.newBuilder(this.multiCall_).mergeFrom(giftMultiCall)).buildPartial();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeVideoChat(GiftVideoChatInfo giftVideoChatInfo) {
            GiftVideoChatInfo giftVideoChatInfo2 = this.videoChat_;
            if (giftVideoChatInfo2 == null || giftVideoChatInfo2 == GiftVideoChatInfo.getDefaultInstance()) {
                this.videoChat_ = giftVideoChatInfo;
            } else {
                this.videoChat_ = (GiftVideoChatInfo) ((GiftVideoChatInfo.Builder) GiftVideoChatInfo.newBuilder(this.videoChat_).mergeFrom(giftVideoChatInfo)).buildPartial();
            }
        }

        public static Builder newBuilder(LiveGiftReceivedMsg liveGiftReceivedMsg) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(liveGiftReceivedMsg);
        }

        public static LiveGiftReceivedMsg parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (LiveGiftReceivedMsg) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LiveGiftReceivedMsg parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (LiveGiftReceivedMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<LiveGiftReceivedMsg> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAnchorId(String str) {
            str.getClass();
            this.anchorId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAnchorIdBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.anchorId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAnchorUserName(String str) {
            str.getClass();
            this.anchorUserName_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAnchorUserNameBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.anchorUserName_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGiftItemBrief(GiftItemBrief.Builder builder) {
            this.giftItemBrief_ = (GiftItemBrief) builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGuildCall(GiftMultiCall.Builder builder) {
            this.guildCall_ = (GiftMultiCall) builder.build();
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
        public void setMultiCall(GiftMultiCall.Builder builder) {
            this.multiCall_ = (GiftMultiCall) builder.build();
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
        public void setVideoChat(GiftVideoChatInfo.Builder builder) {
            this.videoChat_ = (GiftVideoChatInfo) builder.build();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C03231.f1639xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new LiveGiftReceivedMsg();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    LiveGiftReceivedMsg liveGiftReceivedMsg = (LiveGiftReceivedMsg) obj2;
                    this.liveId_ = hVar.f(!this.liveId_.isEmpty(), this.liveId_, !liveGiftReceivedMsg.liveId_.isEmpty(), liveGiftReceivedMsg.liveId_);
                    this.id_ = hVar.f(!this.id_.isEmpty(), this.id_, !liveGiftReceivedMsg.id_.isEmpty(), liveGiftReceivedMsg.id_);
                    this.userId_ = hVar.f(!this.userId_.isEmpty(), this.userId_, !liveGiftReceivedMsg.userId_.isEmpty(), liveGiftReceivedMsg.userId_);
                    this.anchorId_ = hVar.f(!this.anchorId_.isEmpty(), this.anchorId_, !liveGiftReceivedMsg.anchorId_.isEmpty(), liveGiftReceivedMsg.anchorId_);
                    this.giftItemBrief_ = hVar.o(this.giftItemBrief_, liveGiftReceivedMsg.giftItemBrief_);
                    this.anchorUserName_ = hVar.f(!this.anchorUserName_.isEmpty(), this.anchorUserName_, true ^ liveGiftReceivedMsg.anchorUserName_.isEmpty(), liveGiftReceivedMsg.anchorUserName_);
                    this.multiCall_ = hVar.o(this.multiCall_, liveGiftReceivedMsg.multiCall_);
                    this.guildCall_ = hVar.o(this.guildCall_, liveGiftReceivedMsg.guildCall_);
                    this.videoChat_ = hVar.o(this.videoChat_, liveGiftReceivedMsg.videoChat_);
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
                                    this.liveId_ = eVar.L();
                                } else if (iM == 18) {
                                    this.id_ = eVar.L();
                                } else if (iM == 26) {
                                    this.userId_ = eVar.L();
                                } else if (iM == 34) {
                                    this.anchorId_ = eVar.L();
                                } else if (iM == 42) {
                                    GiftItemBrief giftItemBrief = this.giftItemBrief_;
                                    GiftItemBrief.Builder builder = giftItemBrief != null ? (GiftItemBrief.Builder) giftItemBrief.toBuilder() : null;
                                    GiftItemBrief giftItemBriefW = eVar.w(GiftItemBrief.parser(), hVar2);
                                    this.giftItemBrief_ = giftItemBriefW;
                                    if (builder != null) {
                                        builder.mergeFrom(giftItemBriefW);
                                        this.giftItemBrief_ = (GiftItemBrief) builder.buildPartial();
                                    }
                                } else if (iM == 50) {
                                    this.anchorUserName_ = eVar.L();
                                } else if (iM == 58) {
                                    GiftMultiCall giftMultiCall = this.multiCall_;
                                    GiftMultiCall.Builder builder2 = giftMultiCall != null ? (GiftMultiCall.Builder) giftMultiCall.toBuilder() : null;
                                    GiftMultiCall giftMultiCallW = eVar.w(GiftMultiCall.parser(), hVar2);
                                    this.multiCall_ = giftMultiCallW;
                                    if (builder2 != null) {
                                        builder2.mergeFrom(giftMultiCallW);
                                        this.multiCall_ = (GiftMultiCall) builder2.buildPartial();
                                    }
                                } else if (iM == 66) {
                                    GiftMultiCall giftMultiCall2 = this.guildCall_;
                                    GiftMultiCall.Builder builder3 = giftMultiCall2 != null ? (GiftMultiCall.Builder) giftMultiCall2.toBuilder() : null;
                                    GiftMultiCall giftMultiCallW2 = eVar.w(GiftMultiCall.parser(), hVar2);
                                    this.guildCall_ = giftMultiCallW2;
                                    if (builder3 != null) {
                                        builder3.mergeFrom(giftMultiCallW2);
                                        this.guildCall_ = (GiftMultiCall) builder3.buildPartial();
                                    }
                                } else if (iM == 74) {
                                    GiftVideoChatInfo giftVideoChatInfo = this.videoChat_;
                                    GiftVideoChatInfo.Builder builder4 = giftVideoChatInfo != null ? (GiftVideoChatInfo.Builder) giftVideoChatInfo.toBuilder() : null;
                                    GiftVideoChatInfo giftVideoChatInfoW = eVar.w(GiftVideoChatInfo.parser(), hVar2);
                                    this.videoChat_ = giftVideoChatInfoW;
                                    if (builder4 != null) {
                                        builder4.mergeFrom(giftVideoChatInfoW);
                                        this.videoChat_ = (GiftVideoChatInfo) builder4.buildPartial();
                                    }
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
                        synchronized (LiveGiftReceivedMsg.class) {
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

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveGiftReceivedMsgOrBuilder
        public String getAnchorId() {
            return this.anchorId_;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveGiftReceivedMsgOrBuilder
        public ByteString getAnchorIdBytes() {
            return ByteString.copyFromUtf8(this.anchorId_);
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveGiftReceivedMsgOrBuilder
        public String getAnchorUserName() {
            return this.anchorUserName_;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveGiftReceivedMsgOrBuilder
        public ByteString getAnchorUserNameBytes() {
            return ByteString.copyFromUtf8(this.anchorUserName_);
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveGiftReceivedMsgOrBuilder
        public GiftItemBrief getGiftItemBrief() {
            GiftItemBrief giftItemBrief = this.giftItemBrief_;
            return giftItemBrief == null ? GiftItemBrief.getDefaultInstance() : giftItemBrief;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveGiftReceivedMsgOrBuilder
        public GiftMultiCall getGuildCall() {
            GiftMultiCall giftMultiCall = this.guildCall_;
            return giftMultiCall == null ? GiftMultiCall.getDefaultInstance() : giftMultiCall;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveGiftReceivedMsgOrBuilder
        public String getId() {
            return this.id_;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveGiftReceivedMsgOrBuilder
        public ByteString getIdBytes() {
            return ByteString.copyFromUtf8(this.id_);
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveGiftReceivedMsgOrBuilder
        public String getLiveId() {
            return this.liveId_;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveGiftReceivedMsgOrBuilder
        public ByteString getLiveIdBytes() {
            return ByteString.copyFromUtf8(this.liveId_);
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveGiftReceivedMsgOrBuilder
        public GiftMultiCall getMultiCall() {
            GiftMultiCall giftMultiCall = this.multiCall_;
            return giftMultiCall == null ? GiftMultiCall.getDefaultInstance() : giftMultiCall;
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iK = !this.liveId_.isEmpty() ? CodedOutputStream.K(1, getLiveId()) : 0;
            if (!this.id_.isEmpty()) {
                iK += CodedOutputStream.K(2, getId());
            }
            if (!this.userId_.isEmpty()) {
                iK += CodedOutputStream.K(3, getUserId());
            }
            if (!this.anchorId_.isEmpty()) {
                iK += CodedOutputStream.K(4, getAnchorId());
            }
            if (this.giftItemBrief_ != null) {
                iK += CodedOutputStream.C(5, getGiftItemBrief());
            }
            if (!this.anchorUserName_.isEmpty()) {
                iK += CodedOutputStream.K(6, getAnchorUserName());
            }
            if (this.multiCall_ != null) {
                iK += CodedOutputStream.C(7, getMultiCall());
            }
            if (this.guildCall_ != null) {
                iK += CodedOutputStream.C(8, getGuildCall());
            }
            if (this.videoChat_ != null) {
                iK += CodedOutputStream.C(9, getVideoChat());
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iK;
            return iK;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveGiftReceivedMsgOrBuilder
        public String getUserId() {
            return this.userId_;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveGiftReceivedMsgOrBuilder
        public ByteString getUserIdBytes() {
            return ByteString.copyFromUtf8(this.userId_);
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveGiftReceivedMsgOrBuilder
        public GiftVideoChatInfo getVideoChat() {
            GiftVideoChatInfo giftVideoChatInfo = this.videoChat_;
            return giftVideoChatInfo == null ? GiftVideoChatInfo.getDefaultInstance() : giftVideoChatInfo;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveGiftReceivedMsgOrBuilder
        public boolean hasGiftItemBrief() {
            return this.giftItemBrief_ != null;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveGiftReceivedMsgOrBuilder
        public boolean hasGuildCall() {
            return this.guildCall_ != null;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveGiftReceivedMsgOrBuilder
        public boolean hasMultiCall() {
            return this.multiCall_ != null;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveGiftReceivedMsgOrBuilder
        public boolean hasVideoChat() {
            return this.videoChat_ != null;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.liveId_.isEmpty()) {
                codedOutputStream.D0(1, getLiveId());
            }
            if (!this.id_.isEmpty()) {
                codedOutputStream.D0(2, getId());
            }
            if (!this.userId_.isEmpty()) {
                codedOutputStream.D0(3, getUserId());
            }
            if (!this.anchorId_.isEmpty()) {
                codedOutputStream.D0(4, getAnchorId());
            }
            if (this.giftItemBrief_ != null) {
                codedOutputStream.w0(5, getGiftItemBrief());
            }
            if (!this.anchorUserName_.isEmpty()) {
                codedOutputStream.D0(6, getAnchorUserName());
            }
            if (this.multiCall_ != null) {
                codedOutputStream.w0(7, getMultiCall());
            }
            if (this.guildCall_ != null) {
                codedOutputStream.w0(8, getGuildCall());
            }
            if (this.videoChat_ != null) {
                codedOutputStream.w0(9, getVideoChat());
            }
        }

        public static LiveGiftReceivedMsg parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (LiveGiftReceivedMsg) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static LiveGiftReceivedMsg parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (LiveGiftReceivedMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGiftItemBrief(GiftItemBrief giftItemBrief) {
            giftItemBrief.getClass();
            this.giftItemBrief_ = giftItemBrief;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGuildCall(GiftMultiCall giftMultiCall) {
            giftMultiCall.getClass();
            this.guildCall_ = giftMultiCall;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMultiCall(GiftMultiCall giftMultiCall) {
            giftMultiCall.getClass();
            this.multiCall_ = giftMultiCall;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVideoChat(GiftVideoChatInfo giftVideoChatInfo) {
            giftVideoChatInfo.getClass();
            this.videoChat_ = giftVideoChatInfo;
        }

        public static final class Builder extends GeneratedMessageLite.b<LiveGiftReceivedMsg, Builder> implements LiveGiftReceivedMsgOrBuilder {
            private Builder() {
                super(LiveGiftReceivedMsg.DEFAULT_INSTANCE);
            }

            public Builder clearAnchorId() {
                copyOnWrite();
                ((LiveGiftReceivedMsg) ((GeneratedMessageLite.b) this).instance).clearAnchorId();
                return this;
            }

            public Builder clearAnchorUserName() {
                copyOnWrite();
                ((LiveGiftReceivedMsg) ((GeneratedMessageLite.b) this).instance).clearAnchorUserName();
                return this;
            }

            public Builder clearGiftItemBrief() {
                copyOnWrite();
                ((LiveGiftReceivedMsg) ((GeneratedMessageLite.b) this).instance).clearGiftItemBrief();
                return this;
            }

            public Builder clearGuildCall() {
                copyOnWrite();
                ((LiveGiftReceivedMsg) ((GeneratedMessageLite.b) this).instance).clearGuildCall();
                return this;
            }

            public Builder clearId() {
                copyOnWrite();
                ((LiveGiftReceivedMsg) ((GeneratedMessageLite.b) this).instance).clearId();
                return this;
            }

            public Builder clearLiveId() {
                copyOnWrite();
                ((LiveGiftReceivedMsg) ((GeneratedMessageLite.b) this).instance).clearLiveId();
                return this;
            }

            public Builder clearMultiCall() {
                copyOnWrite();
                ((LiveGiftReceivedMsg) ((GeneratedMessageLite.b) this).instance).clearMultiCall();
                return this;
            }

            public Builder clearUserId() {
                copyOnWrite();
                ((LiveGiftReceivedMsg) ((GeneratedMessageLite.b) this).instance).clearUserId();
                return this;
            }

            public Builder clearVideoChat() {
                copyOnWrite();
                ((LiveGiftReceivedMsg) ((GeneratedMessageLite.b) this).instance).clearVideoChat();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveGiftReceivedMsgOrBuilder
            public String getAnchorId() {
                return ((LiveGiftReceivedMsg) ((GeneratedMessageLite.b) this).instance).getAnchorId();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveGiftReceivedMsgOrBuilder
            public ByteString getAnchorIdBytes() {
                return ((LiveGiftReceivedMsg) ((GeneratedMessageLite.b) this).instance).getAnchorIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveGiftReceivedMsgOrBuilder
            public String getAnchorUserName() {
                return ((LiveGiftReceivedMsg) ((GeneratedMessageLite.b) this).instance).getAnchorUserName();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveGiftReceivedMsgOrBuilder
            public ByteString getAnchorUserNameBytes() {
                return ((LiveGiftReceivedMsg) ((GeneratedMessageLite.b) this).instance).getAnchorUserNameBytes();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveGiftReceivedMsgOrBuilder
            public GiftItemBrief getGiftItemBrief() {
                return ((LiveGiftReceivedMsg) ((GeneratedMessageLite.b) this).instance).getGiftItemBrief();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveGiftReceivedMsgOrBuilder
            public GiftMultiCall getGuildCall() {
                return ((LiveGiftReceivedMsg) ((GeneratedMessageLite.b) this).instance).getGuildCall();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveGiftReceivedMsgOrBuilder
            public String getId() {
                return ((LiveGiftReceivedMsg) ((GeneratedMessageLite.b) this).instance).getId();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveGiftReceivedMsgOrBuilder
            public ByteString getIdBytes() {
                return ((LiveGiftReceivedMsg) ((GeneratedMessageLite.b) this).instance).getIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveGiftReceivedMsgOrBuilder
            public String getLiveId() {
                return ((LiveGiftReceivedMsg) ((GeneratedMessageLite.b) this).instance).getLiveId();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveGiftReceivedMsgOrBuilder
            public ByteString getLiveIdBytes() {
                return ((LiveGiftReceivedMsg) ((GeneratedMessageLite.b) this).instance).getLiveIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveGiftReceivedMsgOrBuilder
            public GiftMultiCall getMultiCall() {
                return ((LiveGiftReceivedMsg) ((GeneratedMessageLite.b) this).instance).getMultiCall();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveGiftReceivedMsgOrBuilder
            public String getUserId() {
                return ((LiveGiftReceivedMsg) ((GeneratedMessageLite.b) this).instance).getUserId();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveGiftReceivedMsgOrBuilder
            public ByteString getUserIdBytes() {
                return ((LiveGiftReceivedMsg) ((GeneratedMessageLite.b) this).instance).getUserIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveGiftReceivedMsgOrBuilder
            public GiftVideoChatInfo getVideoChat() {
                return ((LiveGiftReceivedMsg) ((GeneratedMessageLite.b) this).instance).getVideoChat();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveGiftReceivedMsgOrBuilder
            public boolean hasGiftItemBrief() {
                return ((LiveGiftReceivedMsg) ((GeneratedMessageLite.b) this).instance).hasGiftItemBrief();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveGiftReceivedMsgOrBuilder
            public boolean hasGuildCall() {
                return ((LiveGiftReceivedMsg) ((GeneratedMessageLite.b) this).instance).hasGuildCall();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveGiftReceivedMsgOrBuilder
            public boolean hasMultiCall() {
                return ((LiveGiftReceivedMsg) ((GeneratedMessageLite.b) this).instance).hasMultiCall();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveGiftReceivedMsgOrBuilder
            public boolean hasVideoChat() {
                return ((LiveGiftReceivedMsg) ((GeneratedMessageLite.b) this).instance).hasVideoChat();
            }

            public Builder mergeGiftItemBrief(GiftItemBrief giftItemBrief) {
                copyOnWrite();
                ((LiveGiftReceivedMsg) ((GeneratedMessageLite.b) this).instance).mergeGiftItemBrief(giftItemBrief);
                return this;
            }

            public Builder mergeGuildCall(GiftMultiCall giftMultiCall) {
                copyOnWrite();
                ((LiveGiftReceivedMsg) ((GeneratedMessageLite.b) this).instance).mergeGuildCall(giftMultiCall);
                return this;
            }

            public Builder mergeMultiCall(GiftMultiCall giftMultiCall) {
                copyOnWrite();
                ((LiveGiftReceivedMsg) ((GeneratedMessageLite.b) this).instance).mergeMultiCall(giftMultiCall);
                return this;
            }

            public Builder mergeVideoChat(GiftVideoChatInfo giftVideoChatInfo) {
                copyOnWrite();
                ((LiveGiftReceivedMsg) ((GeneratedMessageLite.b) this).instance).mergeVideoChat(giftVideoChatInfo);
                return this;
            }

            public Builder setAnchorId(String str) {
                copyOnWrite();
                ((LiveGiftReceivedMsg) ((GeneratedMessageLite.b) this).instance).setAnchorId(str);
                return this;
            }

            public Builder setAnchorIdBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveGiftReceivedMsg) ((GeneratedMessageLite.b) this).instance).setAnchorIdBytes(byteString);
                return this;
            }

            public Builder setAnchorUserName(String str) {
                copyOnWrite();
                ((LiveGiftReceivedMsg) ((GeneratedMessageLite.b) this).instance).setAnchorUserName(str);
                return this;
            }

            public Builder setAnchorUserNameBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveGiftReceivedMsg) ((GeneratedMessageLite.b) this).instance).setAnchorUserNameBytes(byteString);
                return this;
            }

            public Builder setGiftItemBrief(GiftItemBrief giftItemBrief) {
                copyOnWrite();
                ((LiveGiftReceivedMsg) ((GeneratedMessageLite.b) this).instance).setGiftItemBrief(giftItemBrief);
                return this;
            }

            public Builder setGuildCall(GiftMultiCall giftMultiCall) {
                copyOnWrite();
                ((LiveGiftReceivedMsg) ((GeneratedMessageLite.b) this).instance).setGuildCall(giftMultiCall);
                return this;
            }

            public Builder setId(String str) {
                copyOnWrite();
                ((LiveGiftReceivedMsg) ((GeneratedMessageLite.b) this).instance).setId(str);
                return this;
            }

            public Builder setIdBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveGiftReceivedMsg) ((GeneratedMessageLite.b) this).instance).setIdBytes(byteString);
                return this;
            }

            public Builder setLiveId(String str) {
                copyOnWrite();
                ((LiveGiftReceivedMsg) ((GeneratedMessageLite.b) this).instance).setLiveId(str);
                return this;
            }

            public Builder setLiveIdBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveGiftReceivedMsg) ((GeneratedMessageLite.b) this).instance).setLiveIdBytes(byteString);
                return this;
            }

            public Builder setMultiCall(GiftMultiCall giftMultiCall) {
                copyOnWrite();
                ((LiveGiftReceivedMsg) ((GeneratedMessageLite.b) this).instance).setMultiCall(giftMultiCall);
                return this;
            }

            public Builder setUserId(String str) {
                copyOnWrite();
                ((LiveGiftReceivedMsg) ((GeneratedMessageLite.b) this).instance).setUserId(str);
                return this;
            }

            public Builder setUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveGiftReceivedMsg) ((GeneratedMessageLite.b) this).instance).setUserIdBytes(byteString);
                return this;
            }

            public Builder setVideoChat(GiftVideoChatInfo giftVideoChatInfo) {
                copyOnWrite();
                ((LiveGiftReceivedMsg) ((GeneratedMessageLite.b) this).instance).setVideoChat(giftVideoChatInfo);
                return this;
            }

            public Builder setGiftItemBrief(GiftItemBrief.Builder builder) {
                copyOnWrite();
                ((LiveGiftReceivedMsg) ((GeneratedMessageLite.b) this).instance).setGiftItemBrief(builder);
                return this;
            }

            public Builder setGuildCall(GiftMultiCall.Builder builder) {
                copyOnWrite();
                ((LiveGiftReceivedMsg) ((GeneratedMessageLite.b) this).instance).setGuildCall(builder);
                return this;
            }

            public Builder setMultiCall(GiftMultiCall.Builder builder) {
                copyOnWrite();
                ((LiveGiftReceivedMsg) ((GeneratedMessageLite.b) this).instance).setMultiCall(builder);
                return this;
            }

            public Builder setVideoChat(GiftVideoChatInfo.Builder builder) {
                copyOnWrite();
                ((LiveGiftReceivedMsg) ((GeneratedMessageLite.b) this).instance).setVideoChat(builder);
                return this;
            }
        }

        public static LiveGiftReceivedMsg parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (LiveGiftReceivedMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static LiveGiftReceivedMsg parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (LiveGiftReceivedMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static LiveGiftReceivedMsg parseFrom(InputStream inputStream) throws IOException {
            return (LiveGiftReceivedMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LiveGiftReceivedMsg parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (LiveGiftReceivedMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static LiveGiftReceivedMsg parseFrom(e eVar) throws IOException {
            return (LiveGiftReceivedMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static LiveGiftReceivedMsg parseFrom(e eVar, h hVar) throws IOException {
            return (LiveGiftReceivedMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public static final class LiveLeaderboardMessage extends GeneratedMessageLite<LiveLeaderboardMessage, Builder> implements LiveLeaderboardMessageOrBuilder {
        private static final LiveLeaderboardMessage DEFAULT_INSTANCE;
        public static final int LIVEID_FIELD_NUMBER = 1;
        private static volatile i860<LiveLeaderboardMessage> PARSER;
        private String liveId_ = "";

        public static final class Builder extends GeneratedMessageLite.b<LiveLeaderboardMessage, Builder> implements LiveLeaderboardMessageOrBuilder {
            private Builder() {
                super(LiveLeaderboardMessage.DEFAULT_INSTANCE);
            }

            public Builder clearLiveId() {
                copyOnWrite();
                ((LiveLeaderboardMessage) ((GeneratedMessageLite.b) this).instance).clearLiveId();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveLeaderboardMessageOrBuilder
            public String getLiveId() {
                return ((LiveLeaderboardMessage) ((GeneratedMessageLite.b) this).instance).getLiveId();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveLeaderboardMessageOrBuilder
            public ByteString getLiveIdBytes() {
                return ((LiveLeaderboardMessage) ((GeneratedMessageLite.b) this).instance).getLiveIdBytes();
            }

            public Builder setLiveId(String str) {
                copyOnWrite();
                ((LiveLeaderboardMessage) ((GeneratedMessageLite.b) this).instance).setLiveId(str);
                return this;
            }

            public Builder setLiveIdBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveLeaderboardMessage) ((GeneratedMessageLite.b) this).instance).setLiveIdBytes(byteString);
                return this;
            }
        }

        static {
            LiveLeaderboardMessage liveLeaderboardMessage = new LiveLeaderboardMessage();
            DEFAULT_INSTANCE = liveLeaderboardMessage;
            liveLeaderboardMessage.makeImmutable();
        }

        private LiveLeaderboardMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLiveId() {
            this.liveId_ = getDefaultInstance().getLiveId();
        }

        public static LiveLeaderboardMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(LiveLeaderboardMessage liveLeaderboardMessage) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(liveLeaderboardMessage);
        }

        public static LiveLeaderboardMessage parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (LiveLeaderboardMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LiveLeaderboardMessage parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (LiveLeaderboardMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<LiveLeaderboardMessage> parser() {
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

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C03231.f1639xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new LiveLeaderboardMessage();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    LiveLeaderboardMessage liveLeaderboardMessage = (LiveLeaderboardMessage) obj2;
                    this.liveId_ = ((GeneratedMessageLite.h) obj).f(!this.liveId_.isEmpty(), this.liveId_, true ^ liveLeaderboardMessage.liveId_.isEmpty(), liveLeaderboardMessage.liveId_);
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
                        synchronized (LiveLeaderboardMessage.class) {
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

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveLeaderboardMessageOrBuilder
        public String getLiveId() {
            return this.liveId_;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveLeaderboardMessageOrBuilder
        public ByteString getLiveIdBytes() {
            return ByteString.copyFromUtf8(this.liveId_);
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iK = !this.liveId_.isEmpty() ? CodedOutputStream.K(1, getLiveId()) : 0;
            ((GeneratedMessageLite) this).memoizedSerializedSize = iK;
            return iK;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.liveId_.isEmpty()) {
                return;
            }
            codedOutputStream.D0(1, getLiveId());
        }

        public static LiveLeaderboardMessage parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (LiveLeaderboardMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static LiveLeaderboardMessage parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (LiveLeaderboardMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static LiveLeaderboardMessage parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (LiveLeaderboardMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static LiveLeaderboardMessage parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (LiveLeaderboardMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static LiveLeaderboardMessage parseFrom(InputStream inputStream) throws IOException {
            return (LiveLeaderboardMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LiveLeaderboardMessage parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (LiveLeaderboardMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static LiveLeaderboardMessage parseFrom(e eVar) throws IOException {
            return (LiveLeaderboardMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static LiveLeaderboardMessage parseFrom(e eVar, h hVar) throws IOException {
            return (LiveLeaderboardMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public static final class LiveRanking extends GeneratedMessageLite<LiveRanking, Builder> implements LiveRankingOrBuilder {
        public static final int AMOUNT_FIELD_NUMBER = 7;
        public static final int ANCHORID_FIELD_NUMBER = 2;
        public static final int CONTENT_FIELD_NUMBER = 9;
        private static final LiveRanking DEFAULT_INSTANCE;
        public static final int GAP_FIELD_NUMBER = 12;
        public static final int LIVEID_FIELD_NUMBER = 4;
        private static volatile i860<LiveRanking> PARSER = null;
        public static final int RANK_FIELD_NUMBER = 1;
        public static final int ROOMID_FIELD_NUMBER = 3;
        public static final int USERID_FIELD_NUMBER = 10;
        public static final int USERIMAGE_FIELD_NUMBER = 5;
        public static final int USERLIVESTATE_FIELD_NUMBER = 8;
        public static final int USERMASK_FIELD_NUMBER = 11;
        public static final int USERNAME_FIELD_NUMBER = 6;
        private long amount_;
        private long gap_;
        private long rank_;
        private int userLiveState_;
        private userMaskConfig.UserMask userMask_;
        private String anchorId_ = "";
        private String roomId_ = "";
        private String liveId_ = "";
        private String userImage_ = "";
        private String userName_ = "";
        private String content_ = "";
        private String userId_ = "";

        static {
            LiveRanking liveRanking = new LiveRanking();
            DEFAULT_INSTANCE = liveRanking;
            liveRanking.makeImmutable();
        }

        private LiveRanking() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAmount() {
            this.amount_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAnchorId() {
            this.anchorId_ = getDefaultInstance().getAnchorId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearContent() {
            this.content_ = getDefaultInstance().getContent();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGap() {
            this.gap_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLiveId() {
            this.liveId_ = getDefaultInstance().getLiveId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRank() {
            this.rank_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRoomId() {
            this.roomId_ = getDefaultInstance().getRoomId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUserId() {
            this.userId_ = getDefaultInstance().getUserId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUserImage() {
            this.userImage_ = getDefaultInstance().getUserImage();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUserLiveState() {
            this.userLiveState_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUserMask() {
            this.userMask_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUserName() {
            this.userName_ = getDefaultInstance().getUserName();
        }

        public static LiveRanking getDefaultInstance() {
            return DEFAULT_INSTANCE;
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

        public static Builder newBuilder(LiveRanking liveRanking) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(liveRanking);
        }

        public static LiveRanking parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (LiveRanking) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LiveRanking parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (LiveRanking) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<LiveRanking> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAmount(long j) {
            this.amount_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAnchorId(String str) {
            str.getClass();
            this.anchorId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAnchorIdBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.anchorId_ = byteString.toStringUtf8();
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
        public void setGap(long j) {
            this.gap_ = j;
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
        public void setRank(long j) {
            this.rank_ = j;
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

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserImage(String str) {
            str.getClass();
            this.userImage_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserImageBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.userImage_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserLiveState(LiveStateEnum liveStateEnum) {
            liveStateEnum.getClass();
            this.userLiveState_ = liveStateEnum.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserLiveStateValue(int i) {
            this.userLiveState_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserMask(userMaskConfig.UserMask.Builder builder) {
            this.userMask_ = (userMaskConfig.UserMask) builder.build();
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
            switch (C03231.f1639xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new LiveRanking();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    LiveRanking liveRanking = (LiveRanking) obj2;
                    long j = this.rank_;
                    boolean z2 = j != 0;
                    long j2 = liveRanking.rank_;
                    this.rank_ = hVar.i(z2, j, j2 != 0, j2);
                    this.anchorId_ = hVar.f(!this.anchorId_.isEmpty(), this.anchorId_, !liveRanking.anchorId_.isEmpty(), liveRanking.anchorId_);
                    this.roomId_ = hVar.f(!this.roomId_.isEmpty(), this.roomId_, !liveRanking.roomId_.isEmpty(), liveRanking.roomId_);
                    this.liveId_ = hVar.f(!this.liveId_.isEmpty(), this.liveId_, !liveRanking.liveId_.isEmpty(), liveRanking.liveId_);
                    this.userImage_ = hVar.f(!this.userImage_.isEmpty(), this.userImage_, !liveRanking.userImage_.isEmpty(), liveRanking.userImage_);
                    this.userName_ = hVar.f(!this.userName_.isEmpty(), this.userName_, !liveRanking.userName_.isEmpty(), liveRanking.userName_);
                    long j3 = this.amount_;
                    boolean z3 = j3 != 0;
                    long j4 = liveRanking.amount_;
                    this.amount_ = hVar.i(z3, j3, j4 != 0, j4);
                    int i = this.userLiveState_;
                    boolean z4 = i != 0;
                    int i2 = liveRanking.userLiveState_;
                    this.userLiveState_ = hVar.e(z4, i, i2 != 0, i2);
                    this.content_ = hVar.f(!this.content_.isEmpty(), this.content_, !liveRanking.content_.isEmpty(), liveRanking.content_);
                    this.userId_ = hVar.f(!this.userId_.isEmpty(), this.userId_, !liveRanking.userId_.isEmpty(), liveRanking.userId_);
                    this.userMask_ = hVar.o(this.userMask_, liveRanking.userMask_);
                    boolean z5 = false;
                    long j5 = this.gap_;
                    if (j5 != 0) {
                        z5 = true;
                    }
                    long j6 = liveRanking.gap_;
                    this.gap_ = hVar.i(z5, j5, j6 != 0, j6);
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
                                case 8:
                                    this.rank_ = eVar.v();
                                    continue;
                                case 18:
                                    this.anchorId_ = eVar.L();
                                    continue;
                                case 26:
                                    this.roomId_ = eVar.L();
                                    continue;
                                case 34:
                                    this.liveId_ = eVar.L();
                                    continue;
                                case 42:
                                    this.userImage_ = eVar.L();
                                    continue;
                                case 50:
                                    this.userName_ = eVar.L();
                                    continue;
                                case 56:
                                    this.amount_ = eVar.v();
                                    continue;
                                case 64:
                                    this.userLiveState_ = eVar.p();
                                    continue;
                                case 74:
                                    this.content_ = eVar.L();
                                    continue;
                                case 82:
                                    this.userId_ = eVar.L();
                                    continue;
                                case 90:
                                    userMaskConfig.UserMask userMask = this.userMask_;
                                    userMaskConfig.UserMask.Builder builder = userMask != null ? (userMaskConfig.UserMask.Builder) userMask.toBuilder() : null;
                                    userMaskConfig.UserMask userMaskW = eVar.w(userMaskConfig.UserMask.parser(), hVar2);
                                    this.userMask_ = userMaskW;
                                    if (builder != null) {
                                        builder.mergeFrom(userMaskW);
                                        this.userMask_ = (userMaskConfig.UserMask) builder.buildPartial();
                                    } else {
                                        continue;
                                    }
                                    break;
                                case 96:
                                    this.gap_ = eVar.v();
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
                        synchronized (LiveRanking.class) {
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

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveRankingOrBuilder
        public long getAmount() {
            return this.amount_;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveRankingOrBuilder
        public String getAnchorId() {
            return this.anchorId_;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveRankingOrBuilder
        public ByteString getAnchorIdBytes() {
            return ByteString.copyFromUtf8(this.anchorId_);
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveRankingOrBuilder
        public String getContent() {
            return this.content_;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveRankingOrBuilder
        public ByteString getContentBytes() {
            return ByteString.copyFromUtf8(this.content_);
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveRankingOrBuilder
        public long getGap() {
            return this.gap_;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveRankingOrBuilder
        public String getLiveId() {
            return this.liveId_;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveRankingOrBuilder
        public ByteString getLiveIdBytes() {
            return ByteString.copyFromUtf8(this.liveId_);
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveRankingOrBuilder
        public long getRank() {
            return this.rank_;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveRankingOrBuilder
        public String getRoomId() {
            return this.roomId_;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveRankingOrBuilder
        public ByteString getRoomIdBytes() {
            return ByteString.copyFromUtf8(this.roomId_);
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            long j = this.rank_;
            int iV = j != 0 ? CodedOutputStream.v(1, j) : 0;
            if (!this.anchorId_.isEmpty()) {
                iV += CodedOutputStream.K(2, getAnchorId());
            }
            if (!this.roomId_.isEmpty()) {
                iV += CodedOutputStream.K(3, getRoomId());
            }
            if (!this.liveId_.isEmpty()) {
                iV += CodedOutputStream.K(4, getLiveId());
            }
            if (!this.userImage_.isEmpty()) {
                iV += CodedOutputStream.K(5, getUserImage());
            }
            if (!this.userName_.isEmpty()) {
                iV += CodedOutputStream.K(6, getUserName());
            }
            long j2 = this.amount_;
            if (j2 != 0) {
                iV += CodedOutputStream.v(7, j2);
            }
            if (this.userLiveState_ != LiveStateEnum.onlive.getNumber()) {
                iV += CodedOutputStream.m(8, this.userLiveState_);
            }
            if (!this.content_.isEmpty()) {
                iV += CodedOutputStream.K(9, getContent());
            }
            if (!this.userId_.isEmpty()) {
                iV += CodedOutputStream.K(10, getUserId());
            }
            if (this.userMask_ != null) {
                iV += CodedOutputStream.C(11, getUserMask());
            }
            long j3 = this.gap_;
            if (j3 != 0) {
                iV += CodedOutputStream.v(12, j3);
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iV;
            return iV;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveRankingOrBuilder
        public String getUserId() {
            return this.userId_;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveRankingOrBuilder
        public ByteString getUserIdBytes() {
            return ByteString.copyFromUtf8(this.userId_);
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveRankingOrBuilder
        public String getUserImage() {
            return this.userImage_;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveRankingOrBuilder
        public ByteString getUserImageBytes() {
            return ByteString.copyFromUtf8(this.userImage_);
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveRankingOrBuilder
        public LiveStateEnum getUserLiveState() {
            LiveStateEnum liveStateEnumForNumber = LiveStateEnum.forNumber(this.userLiveState_);
            return liveStateEnumForNumber == null ? LiveStateEnum.UNRECOGNIZED : liveStateEnumForNumber;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveRankingOrBuilder
        public int getUserLiveStateValue() {
            return this.userLiveState_;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveRankingOrBuilder
        public userMaskConfig.UserMask getUserMask() {
            userMaskConfig.UserMask userMask = this.userMask_;
            return userMask == null ? userMaskConfig.UserMask.getDefaultInstance() : userMask;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveRankingOrBuilder
        public String getUserName() {
            return this.userName_;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveRankingOrBuilder
        public ByteString getUserNameBytes() {
            return ByteString.copyFromUtf8(this.userName_);
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveRankingOrBuilder
        public boolean hasUserMask() {
            return this.userMask_ != null;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            long j = this.rank_;
            if (j != 0) {
                codedOutputStream.u0(1, j);
            }
            if (!this.anchorId_.isEmpty()) {
                codedOutputStream.D0(2, getAnchorId());
            }
            if (!this.roomId_.isEmpty()) {
                codedOutputStream.D0(3, getRoomId());
            }
            if (!this.liveId_.isEmpty()) {
                codedOutputStream.D0(4, getLiveId());
            }
            if (!this.userImage_.isEmpty()) {
                codedOutputStream.D0(5, getUserImage());
            }
            if (!this.userName_.isEmpty()) {
                codedOutputStream.D0(6, getUserName());
            }
            long j2 = this.amount_;
            if (j2 != 0) {
                codedOutputStream.u0(7, j2);
            }
            if (this.userLiveState_ != LiveStateEnum.onlive.getNumber()) {
                codedOutputStream.i0(8, this.userLiveState_);
            }
            if (!this.content_.isEmpty()) {
                codedOutputStream.D0(9, getContent());
            }
            if (!this.userId_.isEmpty()) {
                codedOutputStream.D0(10, getUserId());
            }
            if (this.userMask_ != null) {
                codedOutputStream.w0(11, getUserMask());
            }
            long j3 = this.gap_;
            if (j3 != 0) {
                codedOutputStream.u0(12, j3);
            }
        }

        public static LiveRanking parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (LiveRanking) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static LiveRanking parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (LiveRanking) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserMask(userMaskConfig.UserMask userMask) {
            userMask.getClass();
            this.userMask_ = userMask;
        }

        public static final class Builder extends GeneratedMessageLite.b<LiveRanking, Builder> implements LiveRankingOrBuilder {
            private Builder() {
                super(LiveRanking.DEFAULT_INSTANCE);
            }

            public Builder clearAmount() {
                copyOnWrite();
                ((LiveRanking) ((GeneratedMessageLite.b) this).instance).clearAmount();
                return this;
            }

            public Builder clearAnchorId() {
                copyOnWrite();
                ((LiveRanking) ((GeneratedMessageLite.b) this).instance).clearAnchorId();
                return this;
            }

            public Builder clearContent() {
                copyOnWrite();
                ((LiveRanking) ((GeneratedMessageLite.b) this).instance).clearContent();
                return this;
            }

            public Builder clearGap() {
                copyOnWrite();
                ((LiveRanking) ((GeneratedMessageLite.b) this).instance).clearGap();
                return this;
            }

            public Builder clearLiveId() {
                copyOnWrite();
                ((LiveRanking) ((GeneratedMessageLite.b) this).instance).clearLiveId();
                return this;
            }

            public Builder clearRank() {
                copyOnWrite();
                ((LiveRanking) ((GeneratedMessageLite.b) this).instance).clearRank();
                return this;
            }

            public Builder clearRoomId() {
                copyOnWrite();
                ((LiveRanking) ((GeneratedMessageLite.b) this).instance).clearRoomId();
                return this;
            }

            public Builder clearUserId() {
                copyOnWrite();
                ((LiveRanking) ((GeneratedMessageLite.b) this).instance).clearUserId();
                return this;
            }

            public Builder clearUserImage() {
                copyOnWrite();
                ((LiveRanking) ((GeneratedMessageLite.b) this).instance).clearUserImage();
                return this;
            }

            public Builder clearUserLiveState() {
                copyOnWrite();
                ((LiveRanking) ((GeneratedMessageLite.b) this).instance).clearUserLiveState();
                return this;
            }

            public Builder clearUserMask() {
                copyOnWrite();
                ((LiveRanking) ((GeneratedMessageLite.b) this).instance).clearUserMask();
                return this;
            }

            public Builder clearUserName() {
                copyOnWrite();
                ((LiveRanking) ((GeneratedMessageLite.b) this).instance).clearUserName();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveRankingOrBuilder
            public long getAmount() {
                return ((LiveRanking) ((GeneratedMessageLite.b) this).instance).getAmount();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveRankingOrBuilder
            public String getAnchorId() {
                return ((LiveRanking) ((GeneratedMessageLite.b) this).instance).getAnchorId();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveRankingOrBuilder
            public ByteString getAnchorIdBytes() {
                return ((LiveRanking) ((GeneratedMessageLite.b) this).instance).getAnchorIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveRankingOrBuilder
            public String getContent() {
                return ((LiveRanking) ((GeneratedMessageLite.b) this).instance).getContent();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveRankingOrBuilder
            public ByteString getContentBytes() {
                return ((LiveRanking) ((GeneratedMessageLite.b) this).instance).getContentBytes();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveRankingOrBuilder
            public long getGap() {
                return ((LiveRanking) ((GeneratedMessageLite.b) this).instance).getGap();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveRankingOrBuilder
            public String getLiveId() {
                return ((LiveRanking) ((GeneratedMessageLite.b) this).instance).getLiveId();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveRankingOrBuilder
            public ByteString getLiveIdBytes() {
                return ((LiveRanking) ((GeneratedMessageLite.b) this).instance).getLiveIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveRankingOrBuilder
            public long getRank() {
                return ((LiveRanking) ((GeneratedMessageLite.b) this).instance).getRank();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveRankingOrBuilder
            public String getRoomId() {
                return ((LiveRanking) ((GeneratedMessageLite.b) this).instance).getRoomId();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveRankingOrBuilder
            public ByteString getRoomIdBytes() {
                return ((LiveRanking) ((GeneratedMessageLite.b) this).instance).getRoomIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveRankingOrBuilder
            public String getUserId() {
                return ((LiveRanking) ((GeneratedMessageLite.b) this).instance).getUserId();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveRankingOrBuilder
            public ByteString getUserIdBytes() {
                return ((LiveRanking) ((GeneratedMessageLite.b) this).instance).getUserIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveRankingOrBuilder
            public String getUserImage() {
                return ((LiveRanking) ((GeneratedMessageLite.b) this).instance).getUserImage();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveRankingOrBuilder
            public ByteString getUserImageBytes() {
                return ((LiveRanking) ((GeneratedMessageLite.b) this).instance).getUserImageBytes();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveRankingOrBuilder
            public LiveStateEnum getUserLiveState() {
                return ((LiveRanking) ((GeneratedMessageLite.b) this).instance).getUserLiveState();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveRankingOrBuilder
            public int getUserLiveStateValue() {
                return ((LiveRanking) ((GeneratedMessageLite.b) this).instance).getUserLiveStateValue();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveRankingOrBuilder
            public userMaskConfig.UserMask getUserMask() {
                return ((LiveRanking) ((GeneratedMessageLite.b) this).instance).getUserMask();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveRankingOrBuilder
            public String getUserName() {
                return ((LiveRanking) ((GeneratedMessageLite.b) this).instance).getUserName();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveRankingOrBuilder
            public ByteString getUserNameBytes() {
                return ((LiveRanking) ((GeneratedMessageLite.b) this).instance).getUserNameBytes();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveRankingOrBuilder
            public boolean hasUserMask() {
                return ((LiveRanking) ((GeneratedMessageLite.b) this).instance).hasUserMask();
            }

            public Builder mergeUserMask(userMaskConfig.UserMask userMask) {
                copyOnWrite();
                ((LiveRanking) ((GeneratedMessageLite.b) this).instance).mergeUserMask(userMask);
                return this;
            }

            public Builder setAmount(long j) {
                copyOnWrite();
                ((LiveRanking) ((GeneratedMessageLite.b) this).instance).setAmount(j);
                return this;
            }

            public Builder setAnchorId(String str) {
                copyOnWrite();
                ((LiveRanking) ((GeneratedMessageLite.b) this).instance).setAnchorId(str);
                return this;
            }

            public Builder setAnchorIdBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveRanking) ((GeneratedMessageLite.b) this).instance).setAnchorIdBytes(byteString);
                return this;
            }

            public Builder setContent(String str) {
                copyOnWrite();
                ((LiveRanking) ((GeneratedMessageLite.b) this).instance).setContent(str);
                return this;
            }

            public Builder setContentBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveRanking) ((GeneratedMessageLite.b) this).instance).setContentBytes(byteString);
                return this;
            }

            public Builder setGap(long j) {
                copyOnWrite();
                ((LiveRanking) ((GeneratedMessageLite.b) this).instance).setGap(j);
                return this;
            }

            public Builder setLiveId(String str) {
                copyOnWrite();
                ((LiveRanking) ((GeneratedMessageLite.b) this).instance).setLiveId(str);
                return this;
            }

            public Builder setLiveIdBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveRanking) ((GeneratedMessageLite.b) this).instance).setLiveIdBytes(byteString);
                return this;
            }

            public Builder setRank(long j) {
                copyOnWrite();
                ((LiveRanking) ((GeneratedMessageLite.b) this).instance).setRank(j);
                return this;
            }

            public Builder setRoomId(String str) {
                copyOnWrite();
                ((LiveRanking) ((GeneratedMessageLite.b) this).instance).setRoomId(str);
                return this;
            }

            public Builder setRoomIdBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveRanking) ((GeneratedMessageLite.b) this).instance).setRoomIdBytes(byteString);
                return this;
            }

            public Builder setUserId(String str) {
                copyOnWrite();
                ((LiveRanking) ((GeneratedMessageLite.b) this).instance).setUserId(str);
                return this;
            }

            public Builder setUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveRanking) ((GeneratedMessageLite.b) this).instance).setUserIdBytes(byteString);
                return this;
            }

            public Builder setUserImage(String str) {
                copyOnWrite();
                ((LiveRanking) ((GeneratedMessageLite.b) this).instance).setUserImage(str);
                return this;
            }

            public Builder setUserImageBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveRanking) ((GeneratedMessageLite.b) this).instance).setUserImageBytes(byteString);
                return this;
            }

            public Builder setUserLiveState(LiveStateEnum liveStateEnum) {
                copyOnWrite();
                ((LiveRanking) ((GeneratedMessageLite.b) this).instance).setUserLiveState(liveStateEnum);
                return this;
            }

            public Builder setUserLiveStateValue(int i) {
                copyOnWrite();
                ((LiveRanking) ((GeneratedMessageLite.b) this).instance).setUserLiveStateValue(i);
                return this;
            }

            public Builder setUserMask(userMaskConfig.UserMask userMask) {
                copyOnWrite();
                ((LiveRanking) ((GeneratedMessageLite.b) this).instance).setUserMask(userMask);
                return this;
            }

            public Builder setUserName(String str) {
                copyOnWrite();
                ((LiveRanking) ((GeneratedMessageLite.b) this).instance).setUserName(str);
                return this;
            }

            public Builder setUserNameBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveRanking) ((GeneratedMessageLite.b) this).instance).setUserNameBytes(byteString);
                return this;
            }

            public Builder setUserMask(userMaskConfig.UserMask.Builder builder) {
                copyOnWrite();
                ((LiveRanking) ((GeneratedMessageLite.b) this).instance).setUserMask(builder);
                return this;
            }
        }

        public static LiveRanking parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (LiveRanking) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static LiveRanking parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (LiveRanking) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static LiveRanking parseFrom(InputStream inputStream) throws IOException {
            return (LiveRanking) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LiveRanking parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (LiveRanking) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static LiveRanking parseFrom(e eVar) throws IOException {
            return (LiveRanking) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static LiveRanking parseFrom(e eVar, h hVar) throws IOException {
            return (LiveRanking) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public enum LiveRankingAction implements l.c {
        all(0),
        current(1),
        top(2),
        UNRECOGNIZED(-1);

        public static final int all_VALUE = 0;
        public static final int current_VALUE = 1;
        private static final l.d<LiveRankingAction> internalValueMap = new l.d<LiveRankingAction>() { // from class: com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveRankingAction.1
            public LiveRankingAction findValueByNumber(int i) {
                return LiveRankingAction.forNumber(i);
            }
        };
        public static final int top_VALUE = 2;
        private final int value;

        LiveRankingAction(int i) {
            this.value = i;
        }

        public static LiveRankingAction forNumber(int i) {
            if (i == 0) {
                return all;
            }
            if (i == 1) {
                return current;
            }
            if (i != 2) {
                return null;
            }
            return top;
        }

        public static l.d<LiveRankingAction> internalGetValueMap() {
            return internalValueMap;
        }

        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static LiveRankingAction valueOf(int i) {
            return forNumber(i);
        }
    }

    public enum LiveRankingMsgType implements l.c {
        normal(0),
        start(1),
        progress(2),
        sprint(3),
        UNRECOGNIZED(-1);

        private static final l.d<LiveRankingMsgType> internalValueMap = new l.d<LiveRankingMsgType>() { // from class: com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveRankingMsgType.1
            public LiveRankingMsgType findValueByNumber(int i) {
                return LiveRankingMsgType.forNumber(i);
            }
        };
        public static final int normal_VALUE = 0;
        public static final int progress_VALUE = 2;
        public static final int sprint_VALUE = 3;
        public static final int start_VALUE = 1;
        private final int value;

        LiveRankingMsgType(int i) {
            this.value = i;
        }

        public static LiveRankingMsgType forNumber(int i) {
            if (i == 0) {
                return normal;
            }
            if (i == 1) {
                return start;
            }
            if (i == 2) {
                return progress;
            }
            if (i != 3) {
                return null;
            }
            return sprint;
        }

        public static l.d<LiveRankingMsgType> internalGetValueMap() {
            return internalValueMap;
        }

        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static LiveRankingMsgType valueOf(int i) {
            return forNumber(i);
        }
    }

    public enum LiveRankingType implements l.c {
        hour(0),
        week(1),
        live(2),
        UNRECOGNIZED(-1);

        public static final int hour_VALUE = 0;
        private static final l.d<LiveRankingType> internalValueMap = new l.d<LiveRankingType>() { // from class: com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveRankingType.1
            public LiveRankingType findValueByNumber(int i) {
                return LiveRankingType.forNumber(i);
            }
        };
        public static final int live_VALUE = 2;
        public static final int week_VALUE = 1;
        private final int value;

        LiveRankingType(int i) {
            this.value = i;
        }

        public static LiveRankingType forNumber(int i) {
            if (i == 0) {
                return hour;
            }
            if (i == 1) {
                return week;
            }
            if (i != 2) {
                return null;
            }
            return live;
        }

        public static l.d<LiveRankingType> internalGetValueMap() {
            return internalValueMap;
        }

        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static LiveRankingType valueOf(int i) {
            return forNumber(i);
        }
    }

    public static final class LiveRankings extends GeneratedMessageLite<LiveRankings, Builder> implements LiveRankingsOrBuilder {
        public static final int ACTION_FIELD_NUMBER = 3;
        public static final int CURRENTHOURSUGGESTCONFIG_FIELD_NUMBER = 8;
        private static final LiveRankings DEFAULT_INSTANCE;
        public static final int LIVEID_FIELD_NUMBER = 6;
        public static final int MSGTYPE_FIELD_NUMBER = 9;
        private static volatile i860<LiveRankings> PARSER = null;
        public static final int RANKINGS_FIELD_NUMBER = 4;
        public static final int RANKINGTIME_FIELD_NUMBER = 7;
        public static final int ROOMID_FIELD_NUMBER = 5;
        public static final int TITLE_FIELD_NUMBER = 1;
        public static final int TYPE_FIELD_NUMBER = 2;
        private int action_;
        private int bitField0_;
        private CurrentHourSuggestConfig currentHourSuggestConfig_;
        private int msgType_;
        private long rankingTime_;
        private int type_;
        private String title_ = "";
        private l.h<LiveRanking> rankings_ = GeneratedMessageLite.emptyProtobufList();
        private String roomId_ = "";
        private String liveId_ = "";

        static {
            LiveRankings liveRankings = new LiveRankings();
            DEFAULT_INSTANCE = liveRankings;
            liveRankings.makeImmutable();
        }

        private LiveRankings() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllRankings(Iterable<? extends LiveRanking> iterable) {
            ensureRankingsIsMutable();
            a.addAll(iterable, this.rankings_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addRankings(LiveRanking.Builder builder) {
            ensureRankingsIsMutable();
            this.rankings_.add((LiveRanking) builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAction() {
            this.action_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCurrentHourSuggestConfig() {
            this.currentHourSuggestConfig_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLiveId() {
            this.liveId_ = getDefaultInstance().getLiveId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMsgType() {
            this.msgType_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRankingTime() {
            this.rankingTime_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRankings() {
            this.rankings_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRoomId() {
            this.roomId_ = getDefaultInstance().getRoomId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTitle() {
            this.title_ = getDefaultInstance().getTitle();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearType() {
            this.type_ = 0;
        }

        private void ensureRankingsIsMutable() {
            if (this.rankings_.q()) {
                return;
            }
            this.rankings_ = GeneratedMessageLite.mutableCopy(this.rankings_);
        }

        public static LiveRankings getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeCurrentHourSuggestConfig(CurrentHourSuggestConfig currentHourSuggestConfig) {
            CurrentHourSuggestConfig currentHourSuggestConfig2 = this.currentHourSuggestConfig_;
            if (currentHourSuggestConfig2 == null || currentHourSuggestConfig2 == CurrentHourSuggestConfig.getDefaultInstance()) {
                this.currentHourSuggestConfig_ = currentHourSuggestConfig;
            } else {
                this.currentHourSuggestConfig_ = (CurrentHourSuggestConfig) ((CurrentHourSuggestConfig.Builder) CurrentHourSuggestConfig.newBuilder(this.currentHourSuggestConfig_).mergeFrom(currentHourSuggestConfig)).buildPartial();
            }
        }

        public static Builder newBuilder(LiveRankings liveRankings) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(liveRankings);
        }

        public static LiveRankings parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (LiveRankings) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LiveRankings parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (LiveRankings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<LiveRankings> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeRankings(int i) {
            ensureRankingsIsMutable();
            this.rankings_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAction(LiveRankingAction liveRankingAction) {
            liveRankingAction.getClass();
            this.action_ = liveRankingAction.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setActionValue(int i) {
            this.action_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCurrentHourSuggestConfig(CurrentHourSuggestConfig.Builder builder) {
            this.currentHourSuggestConfig_ = (CurrentHourSuggestConfig) builder.build();
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
        public void setMsgType(LiveRankingMsgType liveRankingMsgType) {
            liveRankingMsgType.getClass();
            this.msgType_ = liveRankingMsgType.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMsgTypeValue(int i) {
            this.msgType_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRankingTime(long j) {
            this.rankingTime_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRankings(int i, LiveRanking.Builder builder) {
            ensureRankingsIsMutable();
            this.rankings_.set(i, (LiveRanking) builder.build());
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
        public void setType(LiveRankingType liveRankingType) {
            liveRankingType.getClass();
            this.type_ = liveRankingType.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTypeValue(int i) {
            this.type_ = i;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C03231.f1639xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new LiveRankings();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.rankings_.n();
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.g gVar = (GeneratedMessageLite.h) obj;
                    LiveRankings liveRankings = (LiveRankings) obj2;
                    this.title_ = gVar.f(!this.title_.isEmpty(), this.title_, !liveRankings.title_.isEmpty(), liveRankings.title_);
                    int i = this.type_;
                    boolean z2 = i != 0;
                    int i2 = liveRankings.type_;
                    this.type_ = gVar.e(z2, i, i2 != 0, i2);
                    int i3 = this.action_;
                    boolean z3 = i3 != 0;
                    int i4 = liveRankings.action_;
                    this.action_ = gVar.e(z3, i3, i4 != 0, i4);
                    this.rankings_ = gVar.g(this.rankings_, liveRankings.rankings_);
                    this.roomId_ = gVar.f(!this.roomId_.isEmpty(), this.roomId_, !liveRankings.roomId_.isEmpty(), liveRankings.roomId_);
                    this.liveId_ = gVar.f(!this.liveId_.isEmpty(), this.liveId_, !liveRankings.liveId_.isEmpty(), liveRankings.liveId_);
                    long j = this.rankingTime_;
                    boolean z4 = j != 0;
                    long j2 = liveRankings.rankingTime_;
                    this.rankingTime_ = gVar.i(z4, j, j2 != 0, j2);
                    this.currentHourSuggestConfig_ = gVar.o(this.currentHourSuggestConfig_, liveRankings.currentHourSuggestConfig_);
                    int i5 = this.msgType_;
                    boolean z5 = i5 != 0;
                    int i6 = liveRankings.msgType_;
                    this.msgType_ = gVar.e(z5, i5, i6 != 0, i6);
                    if (gVar == GeneratedMessageLite.g.INSTANCE) {
                        this.bitField0_ |= liveRankings.bitField0_;
                    }
                    return this;
                case 6:
                    e eVar = (e) obj;
                    h hVar = (h) obj2;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            if (iM != 0) {
                                if (iM == 10) {
                                    this.title_ = eVar.L();
                                } else if (iM == 16) {
                                    this.type_ = eVar.p();
                                } else if (iM == 24) {
                                    this.action_ = eVar.p();
                                } else if (iM == 34) {
                                    if (!this.rankings_.q()) {
                                        this.rankings_ = GeneratedMessageLite.mutableCopy(this.rankings_);
                                    }
                                    this.rankings_.add(eVar.w(LiveRanking.parser(), hVar));
                                } else if (iM == 42) {
                                    this.roomId_ = eVar.L();
                                } else if (iM == 50) {
                                    this.liveId_ = eVar.L();
                                } else if (iM == 56) {
                                    this.rankingTime_ = eVar.v();
                                } else if (iM == 66) {
                                    CurrentHourSuggestConfig currentHourSuggestConfig = this.currentHourSuggestConfig_;
                                    CurrentHourSuggestConfig.Builder builder = currentHourSuggestConfig != null ? (CurrentHourSuggestConfig.Builder) currentHourSuggestConfig.toBuilder() : null;
                                    CurrentHourSuggestConfig currentHourSuggestConfigW = eVar.w(CurrentHourSuggestConfig.parser(), hVar);
                                    this.currentHourSuggestConfig_ = currentHourSuggestConfigW;
                                    if (builder != null) {
                                        builder.mergeFrom(currentHourSuggestConfigW);
                                        this.currentHourSuggestConfig_ = (CurrentHourSuggestConfig) builder.buildPartial();
                                    }
                                } else if (iM == 72) {
                                    this.msgType_ = eVar.p();
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
                        synchronized (LiveRankings.class) {
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

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveRankingsOrBuilder
        public LiveRankingAction getAction() {
            LiveRankingAction liveRankingActionForNumber = LiveRankingAction.forNumber(this.action_);
            return liveRankingActionForNumber == null ? LiveRankingAction.UNRECOGNIZED : liveRankingActionForNumber;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveRankingsOrBuilder
        public int getActionValue() {
            return this.action_;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveRankingsOrBuilder
        public CurrentHourSuggestConfig getCurrentHourSuggestConfig() {
            CurrentHourSuggestConfig currentHourSuggestConfig = this.currentHourSuggestConfig_;
            return currentHourSuggestConfig == null ? CurrentHourSuggestConfig.getDefaultInstance() : currentHourSuggestConfig;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveRankingsOrBuilder
        public String getLiveId() {
            return this.liveId_;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveRankingsOrBuilder
        public ByteString getLiveIdBytes() {
            return ByteString.copyFromUtf8(this.liveId_);
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveRankingsOrBuilder
        public LiveRankingMsgType getMsgType() {
            LiveRankingMsgType liveRankingMsgTypeForNumber = LiveRankingMsgType.forNumber(this.msgType_);
            return liveRankingMsgTypeForNumber == null ? LiveRankingMsgType.UNRECOGNIZED : liveRankingMsgTypeForNumber;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveRankingsOrBuilder
        public int getMsgTypeValue() {
            return this.msgType_;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveRankingsOrBuilder
        public long getRankingTime() {
            return this.rankingTime_;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveRankingsOrBuilder
        public LiveRanking getRankings(int i) {
            return (LiveRanking) this.rankings_.get(i);
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveRankingsOrBuilder
        public int getRankingsCount() {
            return this.rankings_.size();
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveRankingsOrBuilder
        public List<LiveRanking> getRankingsList() {
            return this.rankings_;
        }

        public LiveRankingOrBuilder getRankingsOrBuilder(int i) {
            return (LiveRankingOrBuilder) this.rankings_.get(i);
        }

        public List<? extends LiveRankingOrBuilder> getRankingsOrBuilderList() {
            return this.rankings_;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveRankingsOrBuilder
        public String getRoomId() {
            return this.roomId_;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveRankingsOrBuilder
        public ByteString getRoomIdBytes() {
            return ByteString.copyFromUtf8(this.roomId_);
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iK = !this.title_.isEmpty() ? CodedOutputStream.K(1, getTitle()) : 0;
            if (this.type_ != LiveRankingType.hour.getNumber()) {
                iK += CodedOutputStream.m(2, this.type_);
            }
            if (this.action_ != LiveRankingAction.all.getNumber()) {
                iK += CodedOutputStream.m(3, this.action_);
            }
            for (int i2 = 0; i2 < this.rankings_.size(); i2++) {
                iK += CodedOutputStream.C(4, (q) this.rankings_.get(i2));
            }
            if (!this.roomId_.isEmpty()) {
                iK += CodedOutputStream.K(5, getRoomId());
            }
            if (!this.liveId_.isEmpty()) {
                iK += CodedOutputStream.K(6, getLiveId());
            }
            long j = this.rankingTime_;
            if (j != 0) {
                iK += CodedOutputStream.v(7, j);
            }
            if (this.currentHourSuggestConfig_ != null) {
                iK += CodedOutputStream.C(8, getCurrentHourSuggestConfig());
            }
            if (this.msgType_ != LiveRankingMsgType.normal.getNumber()) {
                iK += CodedOutputStream.m(9, this.msgType_);
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iK;
            return iK;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveRankingsOrBuilder
        public String getTitle() {
            return this.title_;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveRankingsOrBuilder
        public ByteString getTitleBytes() {
            return ByteString.copyFromUtf8(this.title_);
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveRankingsOrBuilder
        public LiveRankingType getType() {
            LiveRankingType liveRankingTypeForNumber = LiveRankingType.forNumber(this.type_);
            return liveRankingTypeForNumber == null ? LiveRankingType.UNRECOGNIZED : liveRankingTypeForNumber;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveRankingsOrBuilder
        public int getTypeValue() {
            return this.type_;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveRankingsOrBuilder
        public boolean hasCurrentHourSuggestConfig() {
            return this.currentHourSuggestConfig_ != null;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.title_.isEmpty()) {
                codedOutputStream.D0(1, getTitle());
            }
            if (this.type_ != LiveRankingType.hour.getNumber()) {
                codedOutputStream.i0(2, this.type_);
            }
            if (this.action_ != LiveRankingAction.all.getNumber()) {
                codedOutputStream.i0(3, this.action_);
            }
            for (int i = 0; i < this.rankings_.size(); i++) {
                codedOutputStream.w0(4, (q) this.rankings_.get(i));
            }
            if (!this.roomId_.isEmpty()) {
                codedOutputStream.D0(5, getRoomId());
            }
            if (!this.liveId_.isEmpty()) {
                codedOutputStream.D0(6, getLiveId());
            }
            long j = this.rankingTime_;
            if (j != 0) {
                codedOutputStream.u0(7, j);
            }
            if (this.currentHourSuggestConfig_ != null) {
                codedOutputStream.w0(8, getCurrentHourSuggestConfig());
            }
            if (this.msgType_ != LiveRankingMsgType.normal.getNumber()) {
                codedOutputStream.i0(9, this.msgType_);
            }
        }

        public static LiveRankings parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (LiveRankings) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static LiveRankings parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (LiveRankings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCurrentHourSuggestConfig(CurrentHourSuggestConfig currentHourSuggestConfig) {
            currentHourSuggestConfig.getClass();
            this.currentHourSuggestConfig_ = currentHourSuggestConfig;
        }

        public static final class Builder extends GeneratedMessageLite.b<LiveRankings, Builder> implements LiveRankingsOrBuilder {
            private Builder() {
                super(LiveRankings.DEFAULT_INSTANCE);
            }

            public Builder addAllRankings(Iterable<? extends LiveRanking> iterable) {
                copyOnWrite();
                ((LiveRankings) ((GeneratedMessageLite.b) this).instance).addAllRankings(iterable);
                return this;
            }

            public Builder addRankings(LiveRanking liveRanking) {
                copyOnWrite();
                ((LiveRankings) ((GeneratedMessageLite.b) this).instance).addRankings(liveRanking);
                return this;
            }

            public Builder clearAction() {
                copyOnWrite();
                ((LiveRankings) ((GeneratedMessageLite.b) this).instance).clearAction();
                return this;
            }

            public Builder clearCurrentHourSuggestConfig() {
                copyOnWrite();
                ((LiveRankings) ((GeneratedMessageLite.b) this).instance).clearCurrentHourSuggestConfig();
                return this;
            }

            public Builder clearLiveId() {
                copyOnWrite();
                ((LiveRankings) ((GeneratedMessageLite.b) this).instance).clearLiveId();
                return this;
            }

            public Builder clearMsgType() {
                copyOnWrite();
                ((LiveRankings) ((GeneratedMessageLite.b) this).instance).clearMsgType();
                return this;
            }

            public Builder clearRankingTime() {
                copyOnWrite();
                ((LiveRankings) ((GeneratedMessageLite.b) this).instance).clearRankingTime();
                return this;
            }

            public Builder clearRankings() {
                copyOnWrite();
                ((LiveRankings) ((GeneratedMessageLite.b) this).instance).clearRankings();
                return this;
            }

            public Builder clearRoomId() {
                copyOnWrite();
                ((LiveRankings) ((GeneratedMessageLite.b) this).instance).clearRoomId();
                return this;
            }

            public Builder clearTitle() {
                copyOnWrite();
                ((LiveRankings) ((GeneratedMessageLite.b) this).instance).clearTitle();
                return this;
            }

            public Builder clearType() {
                copyOnWrite();
                ((LiveRankings) ((GeneratedMessageLite.b) this).instance).clearType();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveRankingsOrBuilder
            public LiveRankingAction getAction() {
                return ((LiveRankings) ((GeneratedMessageLite.b) this).instance).getAction();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveRankingsOrBuilder
            public int getActionValue() {
                return ((LiveRankings) ((GeneratedMessageLite.b) this).instance).getActionValue();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveRankingsOrBuilder
            public CurrentHourSuggestConfig getCurrentHourSuggestConfig() {
                return ((LiveRankings) ((GeneratedMessageLite.b) this).instance).getCurrentHourSuggestConfig();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveRankingsOrBuilder
            public String getLiveId() {
                return ((LiveRankings) ((GeneratedMessageLite.b) this).instance).getLiveId();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveRankingsOrBuilder
            public ByteString getLiveIdBytes() {
                return ((LiveRankings) ((GeneratedMessageLite.b) this).instance).getLiveIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveRankingsOrBuilder
            public LiveRankingMsgType getMsgType() {
                return ((LiveRankings) ((GeneratedMessageLite.b) this).instance).getMsgType();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveRankingsOrBuilder
            public int getMsgTypeValue() {
                return ((LiveRankings) ((GeneratedMessageLite.b) this).instance).getMsgTypeValue();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveRankingsOrBuilder
            public long getRankingTime() {
                return ((LiveRankings) ((GeneratedMessageLite.b) this).instance).getRankingTime();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveRankingsOrBuilder
            public LiveRanking getRankings(int i) {
                return ((LiveRankings) ((GeneratedMessageLite.b) this).instance).getRankings(i);
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveRankingsOrBuilder
            public int getRankingsCount() {
                return ((LiveRankings) ((GeneratedMessageLite.b) this).instance).getRankingsCount();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveRankingsOrBuilder
            public List<LiveRanking> getRankingsList() {
                return Collections.unmodifiableList(((LiveRankings) ((GeneratedMessageLite.b) this).instance).getRankingsList());
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveRankingsOrBuilder
            public String getRoomId() {
                return ((LiveRankings) ((GeneratedMessageLite.b) this).instance).getRoomId();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveRankingsOrBuilder
            public ByteString getRoomIdBytes() {
                return ((LiveRankings) ((GeneratedMessageLite.b) this).instance).getRoomIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveRankingsOrBuilder
            public String getTitle() {
                return ((LiveRankings) ((GeneratedMessageLite.b) this).instance).getTitle();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveRankingsOrBuilder
            public ByteString getTitleBytes() {
                return ((LiveRankings) ((GeneratedMessageLite.b) this).instance).getTitleBytes();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveRankingsOrBuilder
            public LiveRankingType getType() {
                return ((LiveRankings) ((GeneratedMessageLite.b) this).instance).getType();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveRankingsOrBuilder
            public int getTypeValue() {
                return ((LiveRankings) ((GeneratedMessageLite.b) this).instance).getTypeValue();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveRankingsOrBuilder
            public boolean hasCurrentHourSuggestConfig() {
                return ((LiveRankings) ((GeneratedMessageLite.b) this).instance).hasCurrentHourSuggestConfig();
            }

            public Builder mergeCurrentHourSuggestConfig(CurrentHourSuggestConfig currentHourSuggestConfig) {
                copyOnWrite();
                ((LiveRankings) ((GeneratedMessageLite.b) this).instance).mergeCurrentHourSuggestConfig(currentHourSuggestConfig);
                return this;
            }

            public Builder removeRankings(int i) {
                copyOnWrite();
                ((LiveRankings) ((GeneratedMessageLite.b) this).instance).removeRankings(i);
                return this;
            }

            public Builder setAction(LiveRankingAction liveRankingAction) {
                copyOnWrite();
                ((LiveRankings) ((GeneratedMessageLite.b) this).instance).setAction(liveRankingAction);
                return this;
            }

            public Builder setActionValue(int i) {
                copyOnWrite();
                ((LiveRankings) ((GeneratedMessageLite.b) this).instance).setActionValue(i);
                return this;
            }

            public Builder setCurrentHourSuggestConfig(CurrentHourSuggestConfig currentHourSuggestConfig) {
                copyOnWrite();
                ((LiveRankings) ((GeneratedMessageLite.b) this).instance).setCurrentHourSuggestConfig(currentHourSuggestConfig);
                return this;
            }

            public Builder setLiveId(String str) {
                copyOnWrite();
                ((LiveRankings) ((GeneratedMessageLite.b) this).instance).setLiveId(str);
                return this;
            }

            public Builder setLiveIdBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveRankings) ((GeneratedMessageLite.b) this).instance).setLiveIdBytes(byteString);
                return this;
            }

            public Builder setMsgType(LiveRankingMsgType liveRankingMsgType) {
                copyOnWrite();
                ((LiveRankings) ((GeneratedMessageLite.b) this).instance).setMsgType(liveRankingMsgType);
                return this;
            }

            public Builder setMsgTypeValue(int i) {
                copyOnWrite();
                ((LiveRankings) ((GeneratedMessageLite.b) this).instance).setMsgTypeValue(i);
                return this;
            }

            public Builder setRankingTime(long j) {
                copyOnWrite();
                ((LiveRankings) ((GeneratedMessageLite.b) this).instance).setRankingTime(j);
                return this;
            }

            public Builder setRankings(int i, LiveRanking liveRanking) {
                copyOnWrite();
                ((LiveRankings) ((GeneratedMessageLite.b) this).instance).setRankings(i, liveRanking);
                return this;
            }

            public Builder setRoomId(String str) {
                copyOnWrite();
                ((LiveRankings) ((GeneratedMessageLite.b) this).instance).setRoomId(str);
                return this;
            }

            public Builder setRoomIdBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveRankings) ((GeneratedMessageLite.b) this).instance).setRoomIdBytes(byteString);
                return this;
            }

            public Builder setTitle(String str) {
                copyOnWrite();
                ((LiveRankings) ((GeneratedMessageLite.b) this).instance).setTitle(str);
                return this;
            }

            public Builder setTitleBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveRankings) ((GeneratedMessageLite.b) this).instance).setTitleBytes(byteString);
                return this;
            }

            public Builder setType(LiveRankingType liveRankingType) {
                copyOnWrite();
                ((LiveRankings) ((GeneratedMessageLite.b) this).instance).setType(liveRankingType);
                return this;
            }

            public Builder setTypeValue(int i) {
                copyOnWrite();
                ((LiveRankings) ((GeneratedMessageLite.b) this).instance).setTypeValue(i);
                return this;
            }

            public Builder addRankings(int i, LiveRanking liveRanking) {
                copyOnWrite();
                ((LiveRankings) ((GeneratedMessageLite.b) this).instance).addRankings(i, liveRanking);
                return this;
            }

            public Builder setCurrentHourSuggestConfig(CurrentHourSuggestConfig.Builder builder) {
                copyOnWrite();
                ((LiveRankings) ((GeneratedMessageLite.b) this).instance).setCurrentHourSuggestConfig(builder);
                return this;
            }

            public Builder setRankings(int i, LiveRanking.Builder builder) {
                copyOnWrite();
                ((LiveRankings) ((GeneratedMessageLite.b) this).instance).setRankings(i, builder);
                return this;
            }

            public Builder addRankings(LiveRanking.Builder builder) {
                copyOnWrite();
                ((LiveRankings) ((GeneratedMessageLite.b) this).instance).addRankings(builder);
                return this;
            }

            public Builder addRankings(int i, LiveRanking.Builder builder) {
                copyOnWrite();
                ((LiveRankings) ((GeneratedMessageLite.b) this).instance).addRankings(i, builder);
                return this;
            }
        }

        public static LiveRankings parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (LiveRankings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static LiveRankings parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (LiveRankings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static LiveRankings parseFrom(InputStream inputStream) throws IOException {
            return (LiveRankings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LiveRankings parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (LiveRankings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static LiveRankings parseFrom(e eVar) throws IOException {
            return (LiveRankings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addRankings(int i, LiveRanking liveRanking) {
            liveRanking.getClass();
            ensureRankingsIsMutable();
            this.rankings_.add(i, liveRanking);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static LiveRankings parseFrom(e eVar, h hVar) throws IOException {
            return (LiveRankings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRankings(int i, LiveRanking liveRanking) {
            liveRanking.getClass();
            ensureRankingsIsMutable();
            this.rankings_.set(i, liveRanking);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addRankings(LiveRanking liveRanking) {
            liveRanking.getClass();
            ensureRankingsIsMutable();
            this.rankings_.add(liveRanking);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addRankings(int i, LiveRanking.Builder builder) {
            ensureRankingsIsMutable();
            this.rankings_.add(i, (LiveRanking) builder.build());
        }
    }

    public enum LiveStateEnum implements l.c {
        onlive(0),
        stopped(1),
        suspended(2),
        born(3),
        UNRECOGNIZED(-1);

        public static final int born_VALUE = 3;
        private static final l.d<LiveStateEnum> internalValueMap = new l.d<LiveStateEnum>() { // from class: com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LiveStateEnum.1
            public LiveStateEnum findValueByNumber(int i) {
                return LiveStateEnum.forNumber(i);
            }
        };
        public static final int onlive_VALUE = 0;
        public static final int stopped_VALUE = 1;
        public static final int suspended_VALUE = 2;
        private final int value;

        LiveStateEnum(int i) {
            this.value = i;
        }

        public static LiveStateEnum forNumber(int i) {
            if (i == 0) {
                return onlive;
            }
            if (i == 1) {
                return stopped;
            }
            if (i == 2) {
                return suspended;
            }
            if (i != 3) {
                return null;
            }
            return born;
        }

        public static l.d<LiveStateEnum> internalGetValueMap() {
            return internalValueMap;
        }

        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static LiveStateEnum valueOf(int i) {
            return forNumber(i);
        }
    }

    public enum LongLinkUpdateAction implements l.c {
        ActionUnknow(0),
        ReRequest(1),
        Refresh(2),
        Complete(3),
        UNRECOGNIZED(-1);

        public static final int ActionUnknow_VALUE = 0;
        public static final int Complete_VALUE = 3;
        public static final int ReRequest_VALUE = 1;
        public static final int Refresh_VALUE = 2;
        private static final l.d<LongLinkUpdateAction> internalValueMap = new l.d<LongLinkUpdateAction>() { // from class: com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LongLinkUpdateAction.1
            public LongLinkUpdateAction findValueByNumber(int i) {
                return LongLinkUpdateAction.forNumber(i);
            }
        };
        private final int value;

        LongLinkUpdateAction(int i) {
            this.value = i;
        }

        public static LongLinkUpdateAction forNumber(int i) {
            if (i == 0) {
                return ActionUnknow;
            }
            if (i == 1) {
                return ReRequest;
            }
            if (i == 2) {
                return Refresh;
            }
            if (i != 3) {
                return null;
            }
            return Complete;
        }

        public static l.d<LongLinkUpdateAction> internalGetValueMap() {
            return internalValueMap;
        }

        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static LongLinkUpdateAction valueOf(int i) {
            return forNumber(i);
        }
    }

    public enum LongLinkUpdatePosition implements l.c {
        PositionUnknow(0),
        CampaignEntrance(1),
        GiftList(2),
        FirstRechargeCampaign(3),
        LiveCampaign(4),
        FirstRechargeStimulus(5),
        UNRECOGNIZED(-1);

        public static final int CampaignEntrance_VALUE = 1;
        public static final int FirstRechargeCampaign_VALUE = 3;
        public static final int FirstRechargeStimulus_VALUE = 5;
        public static final int GiftList_VALUE = 2;
        public static final int LiveCampaign_VALUE = 4;
        public static final int PositionUnknow_VALUE = 0;
        private static final l.d<LongLinkUpdatePosition> internalValueMap = new l.d<LongLinkUpdatePosition>() { // from class: com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LongLinkUpdatePosition.1
            public LongLinkUpdatePosition findValueByNumber(int i) {
                return LongLinkUpdatePosition.forNumber(i);
            }
        };
        private final int value;

        LongLinkUpdatePosition(int i) {
            this.value = i;
        }

        public static LongLinkUpdatePosition forNumber(int i) {
            if (i == 0) {
                return PositionUnknow;
            }
            if (i == 1) {
                return CampaignEntrance;
            }
            if (i == 2) {
                return GiftList;
            }
            if (i == 3) {
                return FirstRechargeCampaign;
            }
            if (i == 4) {
                return LiveCampaign;
            }
            if (i != 5) {
                return null;
            }
            return FirstRechargeStimulus;
        }

        public static l.d<LongLinkUpdatePosition> internalGetValueMap() {
            return internalValueMap;
        }

        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static LongLinkUpdatePosition valueOf(int i) {
            return forNumber(i);
        }
    }

    public static final class LuckyPrizeMsg extends GeneratedMessageLite<LuckyPrizeMsg, Builder> implements LuckyPrizeMsgOrBuilder {
        private static final LuckyPrizeMsg DEFAULT_INSTANCE;
        public static final int ICONURL_FIELD_NUMBER = 3;
        public static final int JUMPROOMID_FIELD_NUMBER = 1;
        public static final int LIVEID_FIELD_NUMBER = 2;
        private static volatile i860<LuckyPrizeMsg> PARSER = null;
        public static final int TEMPLATE_FIELD_NUMBER = 4;
        private TemplateData template_;
        private String jumpRoomID_ = "";
        private String liveID_ = "";
        private String iconUrl_ = "";

        static {
            LuckyPrizeMsg luckyPrizeMsg = new LuckyPrizeMsg();
            DEFAULT_INSTANCE = luckyPrizeMsg;
            luckyPrizeMsg.makeImmutable();
        }

        private LuckyPrizeMsg() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIconUrl() {
            this.iconUrl_ = getDefaultInstance().getIconUrl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearJumpRoomID() {
            this.jumpRoomID_ = getDefaultInstance().getJumpRoomID();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLiveID() {
            this.liveID_ = getDefaultInstance().getLiveID();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTemplate() {
            this.template_ = null;
        }

        public static LuckyPrizeMsg getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeTemplate(TemplateData templateData) {
            TemplateData templateData2 = this.template_;
            if (templateData2 == null || templateData2 == TemplateData.getDefaultInstance()) {
                this.template_ = templateData;
            } else {
                this.template_ = (TemplateData) ((TemplateData.Builder) TemplateData.newBuilder(this.template_).mergeFrom(templateData)).buildPartial();
            }
        }

        public static Builder newBuilder(LuckyPrizeMsg luckyPrizeMsg) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(luckyPrizeMsg);
        }

        public static LuckyPrizeMsg parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (LuckyPrizeMsg) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LuckyPrizeMsg parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (LuckyPrizeMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<LuckyPrizeMsg> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIconUrl(String str) {
            str.getClass();
            this.iconUrl_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIconUrlBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.iconUrl_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setJumpRoomID(String str) {
            str.getClass();
            this.jumpRoomID_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setJumpRoomIDBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.jumpRoomID_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLiveID(String str) {
            str.getClass();
            this.liveID_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLiveIDBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.liveID_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTemplate(TemplateData.Builder builder) {
            this.template_ = (TemplateData) builder.build();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C03231.f1639xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new LuckyPrizeMsg();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    LuckyPrizeMsg luckyPrizeMsg = (LuckyPrizeMsg) obj2;
                    this.jumpRoomID_ = hVar.f(!this.jumpRoomID_.isEmpty(), this.jumpRoomID_, !luckyPrizeMsg.jumpRoomID_.isEmpty(), luckyPrizeMsg.jumpRoomID_);
                    this.liveID_ = hVar.f(!this.liveID_.isEmpty(), this.liveID_, !luckyPrizeMsg.liveID_.isEmpty(), luckyPrizeMsg.liveID_);
                    this.iconUrl_ = hVar.f(!this.iconUrl_.isEmpty(), this.iconUrl_, true ^ luckyPrizeMsg.iconUrl_.isEmpty(), luckyPrizeMsg.iconUrl_);
                    this.template_ = hVar.o(this.template_, luckyPrizeMsg.template_);
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
                                    this.jumpRoomID_ = eVar.L();
                                } else if (iM == 18) {
                                    this.liveID_ = eVar.L();
                                } else if (iM == 26) {
                                    this.iconUrl_ = eVar.L();
                                } else if (iM == 34) {
                                    TemplateData templateData = this.template_;
                                    TemplateData.Builder builder = templateData != null ? (TemplateData.Builder) templateData.toBuilder() : null;
                                    TemplateData templateDataW = eVar.w(TemplateData.parser(), hVar2);
                                    this.template_ = templateDataW;
                                    if (builder != null) {
                                        builder.mergeFrom(templateDataW);
                                        this.template_ = (TemplateData) builder.buildPartial();
                                    }
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
                        synchronized (LuckyPrizeMsg.class) {
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

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LuckyPrizeMsgOrBuilder
        public String getIconUrl() {
            return this.iconUrl_;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LuckyPrizeMsgOrBuilder
        public ByteString getIconUrlBytes() {
            return ByteString.copyFromUtf8(this.iconUrl_);
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LuckyPrizeMsgOrBuilder
        public String getJumpRoomID() {
            return this.jumpRoomID_;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LuckyPrizeMsgOrBuilder
        public ByteString getJumpRoomIDBytes() {
            return ByteString.copyFromUtf8(this.jumpRoomID_);
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LuckyPrizeMsgOrBuilder
        public String getLiveID() {
            return this.liveID_;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LuckyPrizeMsgOrBuilder
        public ByteString getLiveIDBytes() {
            return ByteString.copyFromUtf8(this.liveID_);
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iK = !this.jumpRoomID_.isEmpty() ? CodedOutputStream.K(1, getJumpRoomID()) : 0;
            if (!this.liveID_.isEmpty()) {
                iK += CodedOutputStream.K(2, getLiveID());
            }
            if (!this.iconUrl_.isEmpty()) {
                iK += CodedOutputStream.K(3, getIconUrl());
            }
            if (this.template_ != null) {
                iK += CodedOutputStream.C(4, getTemplate());
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iK;
            return iK;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LuckyPrizeMsgOrBuilder
        public TemplateData getTemplate() {
            TemplateData templateData = this.template_;
            return templateData == null ? TemplateData.getDefaultInstance() : templateData;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LuckyPrizeMsgOrBuilder
        public boolean hasTemplate() {
            return this.template_ != null;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.jumpRoomID_.isEmpty()) {
                codedOutputStream.D0(1, getJumpRoomID());
            }
            if (!this.liveID_.isEmpty()) {
                codedOutputStream.D0(2, getLiveID());
            }
            if (!this.iconUrl_.isEmpty()) {
                codedOutputStream.D0(3, getIconUrl());
            }
            if (this.template_ != null) {
                codedOutputStream.w0(4, getTemplate());
            }
        }

        public static LuckyPrizeMsg parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (LuckyPrizeMsg) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static LuckyPrizeMsg parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (LuckyPrizeMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTemplate(TemplateData templateData) {
            templateData.getClass();
            this.template_ = templateData;
        }

        public static final class Builder extends GeneratedMessageLite.b<LuckyPrizeMsg, Builder> implements LuckyPrizeMsgOrBuilder {
            private Builder() {
                super(LuckyPrizeMsg.DEFAULT_INSTANCE);
            }

            public Builder clearIconUrl() {
                copyOnWrite();
                ((LuckyPrizeMsg) ((GeneratedMessageLite.b) this).instance).clearIconUrl();
                return this;
            }

            public Builder clearJumpRoomID() {
                copyOnWrite();
                ((LuckyPrizeMsg) ((GeneratedMessageLite.b) this).instance).clearJumpRoomID();
                return this;
            }

            public Builder clearLiveID() {
                copyOnWrite();
                ((LuckyPrizeMsg) ((GeneratedMessageLite.b) this).instance).clearLiveID();
                return this;
            }

            public Builder clearTemplate() {
                copyOnWrite();
                ((LuckyPrizeMsg) ((GeneratedMessageLite.b) this).instance).clearTemplate();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LuckyPrizeMsgOrBuilder
            public String getIconUrl() {
                return ((LuckyPrizeMsg) ((GeneratedMessageLite.b) this).instance).getIconUrl();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LuckyPrizeMsgOrBuilder
            public ByteString getIconUrlBytes() {
                return ((LuckyPrizeMsg) ((GeneratedMessageLite.b) this).instance).getIconUrlBytes();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LuckyPrizeMsgOrBuilder
            public String getJumpRoomID() {
                return ((LuckyPrizeMsg) ((GeneratedMessageLite.b) this).instance).getJumpRoomID();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LuckyPrizeMsgOrBuilder
            public ByteString getJumpRoomIDBytes() {
                return ((LuckyPrizeMsg) ((GeneratedMessageLite.b) this).instance).getJumpRoomIDBytes();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LuckyPrizeMsgOrBuilder
            public String getLiveID() {
                return ((LuckyPrizeMsg) ((GeneratedMessageLite.b) this).instance).getLiveID();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LuckyPrizeMsgOrBuilder
            public ByteString getLiveIDBytes() {
                return ((LuckyPrizeMsg) ((GeneratedMessageLite.b) this).instance).getLiveIDBytes();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LuckyPrizeMsgOrBuilder
            public TemplateData getTemplate() {
                return ((LuckyPrizeMsg) ((GeneratedMessageLite.b) this).instance).getTemplate();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.LuckyPrizeMsgOrBuilder
            public boolean hasTemplate() {
                return ((LuckyPrizeMsg) ((GeneratedMessageLite.b) this).instance).hasTemplate();
            }

            public Builder mergeTemplate(TemplateData templateData) {
                copyOnWrite();
                ((LuckyPrizeMsg) ((GeneratedMessageLite.b) this).instance).mergeTemplate(templateData);
                return this;
            }

            public Builder setIconUrl(String str) {
                copyOnWrite();
                ((LuckyPrizeMsg) ((GeneratedMessageLite.b) this).instance).setIconUrl(str);
                return this;
            }

            public Builder setIconUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((LuckyPrizeMsg) ((GeneratedMessageLite.b) this).instance).setIconUrlBytes(byteString);
                return this;
            }

            public Builder setJumpRoomID(String str) {
                copyOnWrite();
                ((LuckyPrizeMsg) ((GeneratedMessageLite.b) this).instance).setJumpRoomID(str);
                return this;
            }

            public Builder setJumpRoomIDBytes(ByteString byteString) {
                copyOnWrite();
                ((LuckyPrizeMsg) ((GeneratedMessageLite.b) this).instance).setJumpRoomIDBytes(byteString);
                return this;
            }

            public Builder setLiveID(String str) {
                copyOnWrite();
                ((LuckyPrizeMsg) ((GeneratedMessageLite.b) this).instance).setLiveID(str);
                return this;
            }

            public Builder setLiveIDBytes(ByteString byteString) {
                copyOnWrite();
                ((LuckyPrizeMsg) ((GeneratedMessageLite.b) this).instance).setLiveIDBytes(byteString);
                return this;
            }

            public Builder setTemplate(TemplateData templateData) {
                copyOnWrite();
                ((LuckyPrizeMsg) ((GeneratedMessageLite.b) this).instance).setTemplate(templateData);
                return this;
            }

            public Builder setTemplate(TemplateData.Builder builder) {
                copyOnWrite();
                ((LuckyPrizeMsg) ((GeneratedMessageLite.b) this).instance).setTemplate(builder);
                return this;
            }
        }

        public static LuckyPrizeMsg parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (LuckyPrizeMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static LuckyPrizeMsg parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (LuckyPrizeMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static LuckyPrizeMsg parseFrom(InputStream inputStream) throws IOException {
            return (LuckyPrizeMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LuckyPrizeMsg parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (LuckyPrizeMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static LuckyPrizeMsg parseFrom(e eVar) throws IOException {
            return (LuckyPrizeMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static LuckyPrizeMsg parseFrom(e eVar, h hVar) throws IOException {
            return (LuckyPrizeMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public static final class Mask extends GeneratedMessageLite<Mask, Builder> implements MaskOrBuilder {
        public static final int COLOR_FIELD_NUMBER = 1;
        private static final Mask DEFAULT_INSTANCE;
        public static final int GENDER_FIELD_NUMBER = 3;
        public static final int ICON_FIELD_NUMBER = 2;
        private static volatile i860<Mask> PARSER;
        private String color_ = "";
        private String icon_ = "";
        private String gender_ = "";

        public static final class Builder extends GeneratedMessageLite.b<Mask, Builder> implements MaskOrBuilder {
            private Builder() {
                super(Mask.DEFAULT_INSTANCE);
            }

            public Builder clearColor() {
                copyOnWrite();
                ((Mask) ((GeneratedMessageLite.b) this).instance).clearColor();
                return this;
            }

            public Builder clearGender() {
                copyOnWrite();
                ((Mask) ((GeneratedMessageLite.b) this).instance).clearGender();
                return this;
            }

            public Builder clearIcon() {
                copyOnWrite();
                ((Mask) ((GeneratedMessageLite.b) this).instance).clearIcon();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.MaskOrBuilder
            public String getColor() {
                return ((Mask) ((GeneratedMessageLite.b) this).instance).getColor();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.MaskOrBuilder
            public ByteString getColorBytes() {
                return ((Mask) ((GeneratedMessageLite.b) this).instance).getColorBytes();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.MaskOrBuilder
            public String getGender() {
                return ((Mask) ((GeneratedMessageLite.b) this).instance).getGender();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.MaskOrBuilder
            public ByteString getGenderBytes() {
                return ((Mask) ((GeneratedMessageLite.b) this).instance).getGenderBytes();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.MaskOrBuilder
            public String getIcon() {
                return ((Mask) ((GeneratedMessageLite.b) this).instance).getIcon();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.MaskOrBuilder
            public ByteString getIconBytes() {
                return ((Mask) ((GeneratedMessageLite.b) this).instance).getIconBytes();
            }

            public Builder setColor(String str) {
                copyOnWrite();
                ((Mask) ((GeneratedMessageLite.b) this).instance).setColor(str);
                return this;
            }

            public Builder setColorBytes(ByteString byteString) {
                copyOnWrite();
                ((Mask) ((GeneratedMessageLite.b) this).instance).setColorBytes(byteString);
                return this;
            }

            public Builder setGender(String str) {
                copyOnWrite();
                ((Mask) ((GeneratedMessageLite.b) this).instance).setGender(str);
                return this;
            }

            public Builder setGenderBytes(ByteString byteString) {
                copyOnWrite();
                ((Mask) ((GeneratedMessageLite.b) this).instance).setGenderBytes(byteString);
                return this;
            }

            public Builder setIcon(String str) {
                copyOnWrite();
                ((Mask) ((GeneratedMessageLite.b) this).instance).setIcon(str);
                return this;
            }

            public Builder setIconBytes(ByteString byteString) {
                copyOnWrite();
                ((Mask) ((GeneratedMessageLite.b) this).instance).setIconBytes(byteString);
                return this;
            }
        }

        static {
            Mask mask = new Mask();
            DEFAULT_INSTANCE = mask;
            mask.makeImmutable();
        }

        private Mask() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearColor() {
            this.color_ = getDefaultInstance().getColor();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGender() {
            this.gender_ = getDefaultInstance().getGender();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIcon() {
            this.icon_ = getDefaultInstance().getIcon();
        }

        public static Mask getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(Mask mask) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(mask);
        }

        public static Mask parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Mask) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Mask parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Mask) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<Mask> parser() {
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

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C03231.f1639xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new Mask();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    Mask mask = (Mask) obj2;
                    this.color_ = hVar.f(!this.color_.isEmpty(), this.color_, !mask.color_.isEmpty(), mask.color_);
                    this.icon_ = hVar.f(!this.icon_.isEmpty(), this.icon_, !mask.icon_.isEmpty(), mask.icon_);
                    this.gender_ = hVar.f(!this.gender_.isEmpty(), this.gender_, true ^ mask.gender_.isEmpty(), mask.gender_);
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
                                    this.color_ = eVar.L();
                                } else if (iM == 18) {
                                    this.icon_ = eVar.L();
                                } else if (iM == 26) {
                                    this.gender_ = eVar.L();
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
                        synchronized (Mask.class) {
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

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.MaskOrBuilder
        public String getColor() {
            return this.color_;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.MaskOrBuilder
        public ByteString getColorBytes() {
            return ByteString.copyFromUtf8(this.color_);
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.MaskOrBuilder
        public String getGender() {
            return this.gender_;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.MaskOrBuilder
        public ByteString getGenderBytes() {
            return ByteString.copyFromUtf8(this.gender_);
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.MaskOrBuilder
        public String getIcon() {
            return this.icon_;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.MaskOrBuilder
        public ByteString getIconBytes() {
            return ByteString.copyFromUtf8(this.icon_);
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iK = !this.color_.isEmpty() ? CodedOutputStream.K(1, getColor()) : 0;
            if (!this.icon_.isEmpty()) {
                iK += CodedOutputStream.K(2, getIcon());
            }
            if (!this.gender_.isEmpty()) {
                iK += CodedOutputStream.K(3, getGender());
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iK;
            return iK;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.color_.isEmpty()) {
                codedOutputStream.D0(1, getColor());
            }
            if (!this.icon_.isEmpty()) {
                codedOutputStream.D0(2, getIcon());
            }
            if (this.gender_.isEmpty()) {
                return;
            }
            codedOutputStream.D0(3, getGender());
        }

        public static Mask parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (Mask) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static Mask parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (Mask) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static Mask parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Mask) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Mask parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (Mask) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static Mask parseFrom(InputStream inputStream) throws IOException {
            return (Mask) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Mask parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (Mask) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static Mask parseFrom(e eVar) throws IOException {
            return (Mask) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static Mask parseFrom(e eVar, h hVar) throws IOException {
            return (Mask) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public static final class PreHourLeaderboardsTopChat extends GeneratedMessageLite<PreHourLeaderboardsTopChat, Builder> implements PreHourLeaderboardsTopChatOrBuilder {
        private static final PreHourLeaderboardsTopChat DEFAULT_INSTANCE;
        private static volatile i860<PreHourLeaderboardsTopChat> PARSER = null;
        public static final int ROOMID_FIELD_NUMBER = 1;
        public static final int TEMPDATA_FIELD_NUMBER = 3;
        public static final int TOPLIVEID_FIELD_NUMBER = 2;
        private TemplateData tempdata_;
        private String roomId_ = "";
        private String topLiveId_ = "";

        static {
            PreHourLeaderboardsTopChat preHourLeaderboardsTopChat = new PreHourLeaderboardsTopChat();
            DEFAULT_INSTANCE = preHourLeaderboardsTopChat;
            preHourLeaderboardsTopChat.makeImmutable();
        }

        private PreHourLeaderboardsTopChat() {
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
        public void clearTopLiveId() {
            this.topLiveId_ = getDefaultInstance().getTopLiveId();
        }

        public static PreHourLeaderboardsTopChat getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeTempdata(TemplateData templateData) {
            TemplateData templateData2 = this.tempdata_;
            if (templateData2 == null || templateData2 == TemplateData.getDefaultInstance()) {
                this.tempdata_ = templateData;
            } else {
                this.tempdata_ = (TemplateData) ((TemplateData.Builder) TemplateData.newBuilder(this.tempdata_).mergeFrom(templateData)).buildPartial();
            }
        }

        public static Builder newBuilder(PreHourLeaderboardsTopChat preHourLeaderboardsTopChat) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(preHourLeaderboardsTopChat);
        }

        public static PreHourLeaderboardsTopChat parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (PreHourLeaderboardsTopChat) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PreHourLeaderboardsTopChat parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (PreHourLeaderboardsTopChat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<PreHourLeaderboardsTopChat> parser() {
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
        public void setTempdata(TemplateData.Builder builder) {
            this.tempdata_ = (TemplateData) builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTopLiveId(String str) {
            str.getClass();
            this.topLiveId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTopLiveIdBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.topLiveId_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C03231.f1639xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new PreHourLeaderboardsTopChat();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    PreHourLeaderboardsTopChat preHourLeaderboardsTopChat = (PreHourLeaderboardsTopChat) obj2;
                    this.roomId_ = hVar.f(!this.roomId_.isEmpty(), this.roomId_, !preHourLeaderboardsTopChat.roomId_.isEmpty(), preHourLeaderboardsTopChat.roomId_);
                    this.topLiveId_ = hVar.f(!this.topLiveId_.isEmpty(), this.topLiveId_, true ^ preHourLeaderboardsTopChat.topLiveId_.isEmpty(), preHourLeaderboardsTopChat.topLiveId_);
                    this.tempdata_ = hVar.o(this.tempdata_, preHourLeaderboardsTopChat.tempdata_);
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
                                    this.topLiveId_ = eVar.L();
                                } else if (iM == 26) {
                                    TemplateData templateData = this.tempdata_;
                                    TemplateData.Builder builder = templateData != null ? (TemplateData.Builder) templateData.toBuilder() : null;
                                    TemplateData templateDataW = eVar.w(TemplateData.parser(), hVar2);
                                    this.tempdata_ = templateDataW;
                                    if (builder != null) {
                                        builder.mergeFrom(templateDataW);
                                        this.tempdata_ = (TemplateData) builder.buildPartial();
                                    }
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
                        synchronized (PreHourLeaderboardsTopChat.class) {
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

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.PreHourLeaderboardsTopChatOrBuilder
        public String getRoomId() {
            return this.roomId_;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.PreHourLeaderboardsTopChatOrBuilder
        public ByteString getRoomIdBytes() {
            return ByteString.copyFromUtf8(this.roomId_);
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iK = !this.roomId_.isEmpty() ? CodedOutputStream.K(1, getRoomId()) : 0;
            if (!this.topLiveId_.isEmpty()) {
                iK += CodedOutputStream.K(2, getTopLiveId());
            }
            if (this.tempdata_ != null) {
                iK += CodedOutputStream.C(3, getTempdata());
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iK;
            return iK;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.PreHourLeaderboardsTopChatOrBuilder
        public TemplateData getTempdata() {
            TemplateData templateData = this.tempdata_;
            return templateData == null ? TemplateData.getDefaultInstance() : templateData;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.PreHourLeaderboardsTopChatOrBuilder
        public String getTopLiveId() {
            return this.topLiveId_;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.PreHourLeaderboardsTopChatOrBuilder
        public ByteString getTopLiveIdBytes() {
            return ByteString.copyFromUtf8(this.topLiveId_);
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.PreHourLeaderboardsTopChatOrBuilder
        public boolean hasTempdata() {
            return this.tempdata_ != null;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.roomId_.isEmpty()) {
                codedOutputStream.D0(1, getRoomId());
            }
            if (!this.topLiveId_.isEmpty()) {
                codedOutputStream.D0(2, getTopLiveId());
            }
            if (this.tempdata_ != null) {
                codedOutputStream.w0(3, getTempdata());
            }
        }

        public static PreHourLeaderboardsTopChat parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (PreHourLeaderboardsTopChat) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static PreHourLeaderboardsTopChat parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (PreHourLeaderboardsTopChat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTempdata(TemplateData templateData) {
            templateData.getClass();
            this.tempdata_ = templateData;
        }

        public static final class Builder extends GeneratedMessageLite.b<PreHourLeaderboardsTopChat, Builder> implements PreHourLeaderboardsTopChatOrBuilder {
            private Builder() {
                super(PreHourLeaderboardsTopChat.DEFAULT_INSTANCE);
            }

            public Builder clearRoomId() {
                copyOnWrite();
                ((PreHourLeaderboardsTopChat) ((GeneratedMessageLite.b) this).instance).clearRoomId();
                return this;
            }

            public Builder clearTempdata() {
                copyOnWrite();
                ((PreHourLeaderboardsTopChat) ((GeneratedMessageLite.b) this).instance).clearTempdata();
                return this;
            }

            public Builder clearTopLiveId() {
                copyOnWrite();
                ((PreHourLeaderboardsTopChat) ((GeneratedMessageLite.b) this).instance).clearTopLiveId();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.PreHourLeaderboardsTopChatOrBuilder
            public String getRoomId() {
                return ((PreHourLeaderboardsTopChat) ((GeneratedMessageLite.b) this).instance).getRoomId();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.PreHourLeaderboardsTopChatOrBuilder
            public ByteString getRoomIdBytes() {
                return ((PreHourLeaderboardsTopChat) ((GeneratedMessageLite.b) this).instance).getRoomIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.PreHourLeaderboardsTopChatOrBuilder
            public TemplateData getTempdata() {
                return ((PreHourLeaderboardsTopChat) ((GeneratedMessageLite.b) this).instance).getTempdata();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.PreHourLeaderboardsTopChatOrBuilder
            public String getTopLiveId() {
                return ((PreHourLeaderboardsTopChat) ((GeneratedMessageLite.b) this).instance).getTopLiveId();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.PreHourLeaderboardsTopChatOrBuilder
            public ByteString getTopLiveIdBytes() {
                return ((PreHourLeaderboardsTopChat) ((GeneratedMessageLite.b) this).instance).getTopLiveIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.PreHourLeaderboardsTopChatOrBuilder
            public boolean hasTempdata() {
                return ((PreHourLeaderboardsTopChat) ((GeneratedMessageLite.b) this).instance).hasTempdata();
            }

            public Builder mergeTempdata(TemplateData templateData) {
                copyOnWrite();
                ((PreHourLeaderboardsTopChat) ((GeneratedMessageLite.b) this).instance).mergeTempdata(templateData);
                return this;
            }

            public Builder setRoomId(String str) {
                copyOnWrite();
                ((PreHourLeaderboardsTopChat) ((GeneratedMessageLite.b) this).instance).setRoomId(str);
                return this;
            }

            public Builder setRoomIdBytes(ByteString byteString) {
                copyOnWrite();
                ((PreHourLeaderboardsTopChat) ((GeneratedMessageLite.b) this).instance).setRoomIdBytes(byteString);
                return this;
            }

            public Builder setTempdata(TemplateData templateData) {
                copyOnWrite();
                ((PreHourLeaderboardsTopChat) ((GeneratedMessageLite.b) this).instance).setTempdata(templateData);
                return this;
            }

            public Builder setTopLiveId(String str) {
                copyOnWrite();
                ((PreHourLeaderboardsTopChat) ((GeneratedMessageLite.b) this).instance).setTopLiveId(str);
                return this;
            }

            public Builder setTopLiveIdBytes(ByteString byteString) {
                copyOnWrite();
                ((PreHourLeaderboardsTopChat) ((GeneratedMessageLite.b) this).instance).setTopLiveIdBytes(byteString);
                return this;
            }

            public Builder setTempdata(TemplateData.Builder builder) {
                copyOnWrite();
                ((PreHourLeaderboardsTopChat) ((GeneratedMessageLite.b) this).instance).setTempdata(builder);
                return this;
            }
        }

        public static PreHourLeaderboardsTopChat parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (PreHourLeaderboardsTopChat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static PreHourLeaderboardsTopChat parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (PreHourLeaderboardsTopChat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static PreHourLeaderboardsTopChat parseFrom(InputStream inputStream) throws IOException {
            return (PreHourLeaderboardsTopChat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PreHourLeaderboardsTopChat parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (PreHourLeaderboardsTopChat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static PreHourLeaderboardsTopChat parseFrom(e eVar) throws IOException {
            return (PreHourLeaderboardsTopChat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static PreHourLeaderboardsTopChat parseFrom(e eVar, h hVar) throws IOException {
            return (PreHourLeaderboardsTopChat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public static final class SystemLiveCommentBackground extends GeneratedMessageLite<SystemLiveCommentBackground, Builder> implements SystemLiveCommentBackgroundOrBuilder {
        public static final int BOTTOMIMGURL_FIELD_NUMBER = 3;
        public static final int COVERIMGURL_FIELD_NUMBER = 4;
        private static final SystemLiveCommentBackground DEFAULT_INSTANCE;
        public static final int HEADERIMGURL_FIELD_NUMBER = 1;
        public static final int MIDDLEIMGURL_FIELD_NUMBER = 2;
        private static volatile i860<SystemLiveCommentBackground> PARSER;
        private String headerImgUrl_ = "";
        private String middleImgUrl_ = "";
        private String bottomImgUrl_ = "";
        private String coverImgUrl_ = "";

        public static final class Builder extends GeneratedMessageLite.b<SystemLiveCommentBackground, Builder> implements SystemLiveCommentBackgroundOrBuilder {
            private Builder() {
                super(SystemLiveCommentBackground.DEFAULT_INSTANCE);
            }

            public Builder clearBottomImgUrl() {
                copyOnWrite();
                ((SystemLiveCommentBackground) ((GeneratedMessageLite.b) this).instance).clearBottomImgUrl();
                return this;
            }

            public Builder clearCoverImgUrl() {
                copyOnWrite();
                ((SystemLiveCommentBackground) ((GeneratedMessageLite.b) this).instance).clearCoverImgUrl();
                return this;
            }

            public Builder clearHeaderImgUrl() {
                copyOnWrite();
                ((SystemLiveCommentBackground) ((GeneratedMessageLite.b) this).instance).clearHeaderImgUrl();
                return this;
            }

            public Builder clearMiddleImgUrl() {
                copyOnWrite();
                ((SystemLiveCommentBackground) ((GeneratedMessageLite.b) this).instance).clearMiddleImgUrl();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.SystemLiveCommentBackgroundOrBuilder
            public String getBottomImgUrl() {
                return ((SystemLiveCommentBackground) ((GeneratedMessageLite.b) this).instance).getBottomImgUrl();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.SystemLiveCommentBackgroundOrBuilder
            public ByteString getBottomImgUrlBytes() {
                return ((SystemLiveCommentBackground) ((GeneratedMessageLite.b) this).instance).getBottomImgUrlBytes();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.SystemLiveCommentBackgroundOrBuilder
            public String getCoverImgUrl() {
                return ((SystemLiveCommentBackground) ((GeneratedMessageLite.b) this).instance).getCoverImgUrl();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.SystemLiveCommentBackgroundOrBuilder
            public ByteString getCoverImgUrlBytes() {
                return ((SystemLiveCommentBackground) ((GeneratedMessageLite.b) this).instance).getCoverImgUrlBytes();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.SystemLiveCommentBackgroundOrBuilder
            public String getHeaderImgUrl() {
                return ((SystemLiveCommentBackground) ((GeneratedMessageLite.b) this).instance).getHeaderImgUrl();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.SystemLiveCommentBackgroundOrBuilder
            public ByteString getHeaderImgUrlBytes() {
                return ((SystemLiveCommentBackground) ((GeneratedMessageLite.b) this).instance).getHeaderImgUrlBytes();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.SystemLiveCommentBackgroundOrBuilder
            public String getMiddleImgUrl() {
                return ((SystemLiveCommentBackground) ((GeneratedMessageLite.b) this).instance).getMiddleImgUrl();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.SystemLiveCommentBackgroundOrBuilder
            public ByteString getMiddleImgUrlBytes() {
                return ((SystemLiveCommentBackground) ((GeneratedMessageLite.b) this).instance).getMiddleImgUrlBytes();
            }

            public Builder setBottomImgUrl(String str) {
                copyOnWrite();
                ((SystemLiveCommentBackground) ((GeneratedMessageLite.b) this).instance).setBottomImgUrl(str);
                return this;
            }

            public Builder setBottomImgUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((SystemLiveCommentBackground) ((GeneratedMessageLite.b) this).instance).setBottomImgUrlBytes(byteString);
                return this;
            }

            public Builder setCoverImgUrl(String str) {
                copyOnWrite();
                ((SystemLiveCommentBackground) ((GeneratedMessageLite.b) this).instance).setCoverImgUrl(str);
                return this;
            }

            public Builder setCoverImgUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((SystemLiveCommentBackground) ((GeneratedMessageLite.b) this).instance).setCoverImgUrlBytes(byteString);
                return this;
            }

            public Builder setHeaderImgUrl(String str) {
                copyOnWrite();
                ((SystemLiveCommentBackground) ((GeneratedMessageLite.b) this).instance).setHeaderImgUrl(str);
                return this;
            }

            public Builder setHeaderImgUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((SystemLiveCommentBackground) ((GeneratedMessageLite.b) this).instance).setHeaderImgUrlBytes(byteString);
                return this;
            }

            public Builder setMiddleImgUrl(String str) {
                copyOnWrite();
                ((SystemLiveCommentBackground) ((GeneratedMessageLite.b) this).instance).setMiddleImgUrl(str);
                return this;
            }

            public Builder setMiddleImgUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((SystemLiveCommentBackground) ((GeneratedMessageLite.b) this).instance).setMiddleImgUrlBytes(byteString);
                return this;
            }
        }

        static {
            SystemLiveCommentBackground systemLiveCommentBackground = new SystemLiveCommentBackground();
            DEFAULT_INSTANCE = systemLiveCommentBackground;
            systemLiveCommentBackground.makeImmutable();
        }

        private SystemLiveCommentBackground() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBottomImgUrl() {
            this.bottomImgUrl_ = getDefaultInstance().getBottomImgUrl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCoverImgUrl() {
            this.coverImgUrl_ = getDefaultInstance().getCoverImgUrl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHeaderImgUrl() {
            this.headerImgUrl_ = getDefaultInstance().getHeaderImgUrl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMiddleImgUrl() {
            this.middleImgUrl_ = getDefaultInstance().getMiddleImgUrl();
        }

        public static SystemLiveCommentBackground getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(SystemLiveCommentBackground systemLiveCommentBackground) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(systemLiveCommentBackground);
        }

        public static SystemLiveCommentBackground parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (SystemLiveCommentBackground) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SystemLiveCommentBackground parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (SystemLiveCommentBackground) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<SystemLiveCommentBackground> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBottomImgUrl(String str) {
            str.getClass();
            this.bottomImgUrl_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBottomImgUrlBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.bottomImgUrl_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCoverImgUrl(String str) {
            str.getClass();
            this.coverImgUrl_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCoverImgUrlBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.coverImgUrl_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHeaderImgUrl(String str) {
            str.getClass();
            this.headerImgUrl_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHeaderImgUrlBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.headerImgUrl_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMiddleImgUrl(String str) {
            str.getClass();
            this.middleImgUrl_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMiddleImgUrlBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.middleImgUrl_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C03231.f1639xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new SystemLiveCommentBackground();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    SystemLiveCommentBackground systemLiveCommentBackground = (SystemLiveCommentBackground) obj2;
                    this.headerImgUrl_ = hVar.f(!this.headerImgUrl_.isEmpty(), this.headerImgUrl_, !systemLiveCommentBackground.headerImgUrl_.isEmpty(), systemLiveCommentBackground.headerImgUrl_);
                    this.middleImgUrl_ = hVar.f(!this.middleImgUrl_.isEmpty(), this.middleImgUrl_, !systemLiveCommentBackground.middleImgUrl_.isEmpty(), systemLiveCommentBackground.middleImgUrl_);
                    this.bottomImgUrl_ = hVar.f(!this.bottomImgUrl_.isEmpty(), this.bottomImgUrl_, !systemLiveCommentBackground.bottomImgUrl_.isEmpty(), systemLiveCommentBackground.bottomImgUrl_);
                    this.coverImgUrl_ = hVar.f(!this.coverImgUrl_.isEmpty(), this.coverImgUrl_, true ^ systemLiveCommentBackground.coverImgUrl_.isEmpty(), systemLiveCommentBackground.coverImgUrl_);
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
                                    this.headerImgUrl_ = eVar.L();
                                } else if (iM == 18) {
                                    this.middleImgUrl_ = eVar.L();
                                } else if (iM == 26) {
                                    this.bottomImgUrl_ = eVar.L();
                                } else if (iM == 34) {
                                    this.coverImgUrl_ = eVar.L();
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
                        synchronized (SystemLiveCommentBackground.class) {
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

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.SystemLiveCommentBackgroundOrBuilder
        public String getBottomImgUrl() {
            return this.bottomImgUrl_;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.SystemLiveCommentBackgroundOrBuilder
        public ByteString getBottomImgUrlBytes() {
            return ByteString.copyFromUtf8(this.bottomImgUrl_);
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.SystemLiveCommentBackgroundOrBuilder
        public String getCoverImgUrl() {
            return this.coverImgUrl_;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.SystemLiveCommentBackgroundOrBuilder
        public ByteString getCoverImgUrlBytes() {
            return ByteString.copyFromUtf8(this.coverImgUrl_);
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.SystemLiveCommentBackgroundOrBuilder
        public String getHeaderImgUrl() {
            return this.headerImgUrl_;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.SystemLiveCommentBackgroundOrBuilder
        public ByteString getHeaderImgUrlBytes() {
            return ByteString.copyFromUtf8(this.headerImgUrl_);
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.SystemLiveCommentBackgroundOrBuilder
        public String getMiddleImgUrl() {
            return this.middleImgUrl_;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.SystemLiveCommentBackgroundOrBuilder
        public ByteString getMiddleImgUrlBytes() {
            return ByteString.copyFromUtf8(this.middleImgUrl_);
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iK = !this.headerImgUrl_.isEmpty() ? CodedOutputStream.K(1, getHeaderImgUrl()) : 0;
            if (!this.middleImgUrl_.isEmpty()) {
                iK += CodedOutputStream.K(2, getMiddleImgUrl());
            }
            if (!this.bottomImgUrl_.isEmpty()) {
                iK += CodedOutputStream.K(3, getBottomImgUrl());
            }
            if (!this.coverImgUrl_.isEmpty()) {
                iK += CodedOutputStream.K(4, getCoverImgUrl());
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iK;
            return iK;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.headerImgUrl_.isEmpty()) {
                codedOutputStream.D0(1, getHeaderImgUrl());
            }
            if (!this.middleImgUrl_.isEmpty()) {
                codedOutputStream.D0(2, getMiddleImgUrl());
            }
            if (!this.bottomImgUrl_.isEmpty()) {
                codedOutputStream.D0(3, getBottomImgUrl());
            }
            if (this.coverImgUrl_.isEmpty()) {
                return;
            }
            codedOutputStream.D0(4, getCoverImgUrl());
        }

        public static SystemLiveCommentBackground parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (SystemLiveCommentBackground) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static SystemLiveCommentBackground parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (SystemLiveCommentBackground) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static SystemLiveCommentBackground parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (SystemLiveCommentBackground) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SystemLiveCommentBackground parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (SystemLiveCommentBackground) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static SystemLiveCommentBackground parseFrom(InputStream inputStream) throws IOException {
            return (SystemLiveCommentBackground) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SystemLiveCommentBackground parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (SystemLiveCommentBackground) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static SystemLiveCommentBackground parseFrom(e eVar) throws IOException {
            return (SystemLiveCommentBackground) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static SystemLiveCommentBackground parseFrom(e eVar, h hVar) throws IOException {
            return (SystemLiveCommentBackground) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public static final class SystemLiveCommentsMsg extends GeneratedMessageLite<SystemLiveCommentsMsg, Builder> implements SystemLiveCommentsMsgOrBuilder {
        public static final int ALIGNMENT_FIELD_NUMBER = 12;
        public static final int BACKGROUND_FIELD_NUMBER = 10;
        private static final SystemLiveCommentsMsg DEFAULT_INSTANCE;
        public static final int DISPLAYDURATION_FIELD_NUMBER = 5;
        public static final int ENDCOLOR_FIELD_NUMBER = 4;
        public static final int GOTOSCHEMA_FIELD_NUMBER = 6;
        public static final int ICONURL_FIELD_NUMBER = 2;
        public static final int ID_FIELD_NUMBER = 8;
        private static volatile i860<SystemLiveCommentsMsg> PARSER = null;
        public static final int PRIORITY_FIELD_NUMBER = 11;
        public static final int ROOMID_FIELD_NUMBER = 1;
        public static final int STARTCOLOR_FIELD_NUMBER = 3;
        public static final int TEMPLATE_FIELD_NUMBER = 7;
        public static final int TYPE_FIELD_NUMBER = 9;
        private int alignment_;
        private SystemLiveCommentBackground background_;
        private long displayDuration_;
        private long priority_;
        private TemplateData template_;
        private String roomID_ = "";
        private String iconUrl_ = "";
        private String startColor_ = "";
        private String endColor_ = "";
        private String gotoSchema_ = "";
        private String id_ = "";
        private String type_ = "";

        static {
            SystemLiveCommentsMsg systemLiveCommentsMsg = new SystemLiveCommentsMsg();
            DEFAULT_INSTANCE = systemLiveCommentsMsg;
            systemLiveCommentsMsg.makeImmutable();
        }

        private SystemLiveCommentsMsg() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlignment() {
            this.alignment_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBackground() {
            this.background_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDisplayDuration() {
            this.displayDuration_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEndColor() {
            this.endColor_ = getDefaultInstance().getEndColor();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGotoSchema() {
            this.gotoSchema_ = getDefaultInstance().getGotoSchema();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIconUrl() {
            this.iconUrl_ = getDefaultInstance().getIconUrl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearId() {
            this.id_ = getDefaultInstance().getId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPriority() {
            this.priority_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRoomID() {
            this.roomID_ = getDefaultInstance().getRoomID();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStartColor() {
            this.startColor_ = getDefaultInstance().getStartColor();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTemplate() {
            this.template_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearType() {
            this.type_ = getDefaultInstance().getType();
        }

        public static SystemLiveCommentsMsg getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeBackground(SystemLiveCommentBackground systemLiveCommentBackground) {
            SystemLiveCommentBackground systemLiveCommentBackground2 = this.background_;
            if (systemLiveCommentBackground2 == null || systemLiveCommentBackground2 == SystemLiveCommentBackground.getDefaultInstance()) {
                this.background_ = systemLiveCommentBackground;
            } else {
                this.background_ = (SystemLiveCommentBackground) ((SystemLiveCommentBackground.Builder) SystemLiveCommentBackground.newBuilder(this.background_).mergeFrom(systemLiveCommentBackground)).buildPartial();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeTemplate(TemplateData templateData) {
            TemplateData templateData2 = this.template_;
            if (templateData2 == null || templateData2 == TemplateData.getDefaultInstance()) {
                this.template_ = templateData;
            } else {
                this.template_ = (TemplateData) ((TemplateData.Builder) TemplateData.newBuilder(this.template_).mergeFrom(templateData)).buildPartial();
            }
        }

        public static Builder newBuilder(SystemLiveCommentsMsg systemLiveCommentsMsg) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(systemLiveCommentsMsg);
        }

        public static SystemLiveCommentsMsg parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (SystemLiveCommentsMsg) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SystemLiveCommentsMsg parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (SystemLiveCommentsMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<SystemLiveCommentsMsg> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlignment(Alignment alignment) {
            alignment.getClass();
            this.alignment_ = alignment.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlignmentValue(int i) {
            this.alignment_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBackground(SystemLiveCommentBackground.Builder builder) {
            this.background_ = (SystemLiveCommentBackground) builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDisplayDuration(long j) {
            this.displayDuration_ = j;
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
        public void setGotoSchema(String str) {
            str.getClass();
            this.gotoSchema_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGotoSchemaBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.gotoSchema_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIconUrl(String str) {
            str.getClass();
            this.iconUrl_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIconUrlBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.iconUrl_ = byteString.toStringUtf8();
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
        public void setPriority(long j) {
            this.priority_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRoomID(String str) {
            str.getClass();
            this.roomID_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRoomIDBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.roomID_ = byteString.toStringUtf8();
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
        public void setTemplate(TemplateData.Builder builder) {
            this.template_ = (TemplateData) builder.build();
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
            boolean z = false;
            switch (C03231.f1639xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new SystemLiveCommentsMsg();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    SystemLiveCommentsMsg systemLiveCommentsMsg = (SystemLiveCommentsMsg) obj2;
                    this.roomID_ = hVar.f(!this.roomID_.isEmpty(), this.roomID_, !systemLiveCommentsMsg.roomID_.isEmpty(), systemLiveCommentsMsg.roomID_);
                    this.iconUrl_ = hVar.f(!this.iconUrl_.isEmpty(), this.iconUrl_, !systemLiveCommentsMsg.iconUrl_.isEmpty(), systemLiveCommentsMsg.iconUrl_);
                    this.startColor_ = hVar.f(!this.startColor_.isEmpty(), this.startColor_, !systemLiveCommentsMsg.startColor_.isEmpty(), systemLiveCommentsMsg.startColor_);
                    this.endColor_ = hVar.f(!this.endColor_.isEmpty(), this.endColor_, !systemLiveCommentsMsg.endColor_.isEmpty(), systemLiveCommentsMsg.endColor_);
                    long j = this.displayDuration_;
                    boolean z2 = j != 0;
                    long j2 = systemLiveCommentsMsg.displayDuration_;
                    this.displayDuration_ = hVar.i(z2, j, j2 != 0, j2);
                    this.gotoSchema_ = hVar.f(!this.gotoSchema_.isEmpty(), this.gotoSchema_, !systemLiveCommentsMsg.gotoSchema_.isEmpty(), systemLiveCommentsMsg.gotoSchema_);
                    this.template_ = hVar.o(this.template_, systemLiveCommentsMsg.template_);
                    this.id_ = hVar.f(!this.id_.isEmpty(), this.id_, !systemLiveCommentsMsg.id_.isEmpty(), systemLiveCommentsMsg.id_);
                    this.type_ = hVar.f(!this.type_.isEmpty(), this.type_, !systemLiveCommentsMsg.type_.isEmpty(), systemLiveCommentsMsg.type_);
                    this.background_ = hVar.o(this.background_, systemLiveCommentsMsg.background_);
                    long j3 = this.priority_;
                    boolean z3 = j3 != 0;
                    long j4 = systemLiveCommentsMsg.priority_;
                    this.priority_ = hVar.i(z3, j3, j4 != 0, j4);
                    int i = this.alignment_;
                    boolean z4 = i != 0;
                    int i2 = systemLiveCommentsMsg.alignment_;
                    this.alignment_ = hVar.e(z4, i, i2 != 0, i2);
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
                                    this.roomID_ = eVar.L();
                                    continue;
                                case 18:
                                    this.iconUrl_ = eVar.L();
                                    continue;
                                case 26:
                                    this.startColor_ = eVar.L();
                                    continue;
                                case 34:
                                    this.endColor_ = eVar.L();
                                    continue;
                                case 40:
                                    this.displayDuration_ = eVar.v();
                                    continue;
                                case 50:
                                    this.gotoSchema_ = eVar.L();
                                    continue;
                                case 58:
                                    TemplateData templateData = this.template_;
                                    TemplateData.Builder builder = templateData != null ? (TemplateData.Builder) templateData.toBuilder() : null;
                                    TemplateData templateDataW = eVar.w(TemplateData.parser(), hVar2);
                                    this.template_ = templateDataW;
                                    if (builder != null) {
                                        builder.mergeFrom(templateDataW);
                                        this.template_ = (TemplateData) builder.buildPartial();
                                    } else {
                                        continue;
                                    }
                                    break;
                                case 66:
                                    this.id_ = eVar.L();
                                    continue;
                                case 74:
                                    this.type_ = eVar.L();
                                    continue;
                                case 82:
                                    SystemLiveCommentBackground systemLiveCommentBackground = this.background_;
                                    SystemLiveCommentBackground.Builder builder2 = systemLiveCommentBackground != null ? (SystemLiveCommentBackground.Builder) systemLiveCommentBackground.toBuilder() : null;
                                    SystemLiveCommentBackground systemLiveCommentBackgroundW = eVar.w(SystemLiveCommentBackground.parser(), hVar2);
                                    this.background_ = systemLiveCommentBackgroundW;
                                    if (builder2 != null) {
                                        builder2.mergeFrom(systemLiveCommentBackgroundW);
                                        this.background_ = (SystemLiveCommentBackground) builder2.buildPartial();
                                    } else {
                                        continue;
                                    }
                                    break;
                                case 88:
                                    this.priority_ = eVar.v();
                                    continue;
                                case 96:
                                    this.alignment_ = eVar.p();
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
                        synchronized (SystemLiveCommentsMsg.class) {
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

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.SystemLiveCommentsMsgOrBuilder
        public Alignment getAlignment() {
            Alignment alignmentForNumber = Alignment.forNumber(this.alignment_);
            return alignmentForNumber == null ? Alignment.UNRECOGNIZED : alignmentForNumber;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.SystemLiveCommentsMsgOrBuilder
        public int getAlignmentValue() {
            return this.alignment_;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.SystemLiveCommentsMsgOrBuilder
        public SystemLiveCommentBackground getBackground() {
            SystemLiveCommentBackground systemLiveCommentBackground = this.background_;
            return systemLiveCommentBackground == null ? SystemLiveCommentBackground.getDefaultInstance() : systemLiveCommentBackground;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.SystemLiveCommentsMsgOrBuilder
        public long getDisplayDuration() {
            return this.displayDuration_;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.SystemLiveCommentsMsgOrBuilder
        public String getEndColor() {
            return this.endColor_;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.SystemLiveCommentsMsgOrBuilder
        public ByteString getEndColorBytes() {
            return ByteString.copyFromUtf8(this.endColor_);
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.SystemLiveCommentsMsgOrBuilder
        public String getGotoSchema() {
            return this.gotoSchema_;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.SystemLiveCommentsMsgOrBuilder
        public ByteString getGotoSchemaBytes() {
            return ByteString.copyFromUtf8(this.gotoSchema_);
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.SystemLiveCommentsMsgOrBuilder
        public String getIconUrl() {
            return this.iconUrl_;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.SystemLiveCommentsMsgOrBuilder
        public ByteString getIconUrlBytes() {
            return ByteString.copyFromUtf8(this.iconUrl_);
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.SystemLiveCommentsMsgOrBuilder
        public String getId() {
            return this.id_;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.SystemLiveCommentsMsgOrBuilder
        public ByteString getIdBytes() {
            return ByteString.copyFromUtf8(this.id_);
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.SystemLiveCommentsMsgOrBuilder
        public long getPriority() {
            return this.priority_;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.SystemLiveCommentsMsgOrBuilder
        public String getRoomID() {
            return this.roomID_;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.SystemLiveCommentsMsgOrBuilder
        public ByteString getRoomIDBytes() {
            return ByteString.copyFromUtf8(this.roomID_);
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iK = !this.roomID_.isEmpty() ? CodedOutputStream.K(1, getRoomID()) : 0;
            if (!this.iconUrl_.isEmpty()) {
                iK += CodedOutputStream.K(2, getIconUrl());
            }
            if (!this.startColor_.isEmpty()) {
                iK += CodedOutputStream.K(3, getStartColor());
            }
            if (!this.endColor_.isEmpty()) {
                iK += CodedOutputStream.K(4, getEndColor());
            }
            long j = this.displayDuration_;
            if (j != 0) {
                iK += CodedOutputStream.v(5, j);
            }
            if (!this.gotoSchema_.isEmpty()) {
                iK += CodedOutputStream.K(6, getGotoSchema());
            }
            if (this.template_ != null) {
                iK += CodedOutputStream.C(7, getTemplate());
            }
            if (!this.id_.isEmpty()) {
                iK += CodedOutputStream.K(8, getId());
            }
            if (!this.type_.isEmpty()) {
                iK += CodedOutputStream.K(9, getType());
            }
            if (this.background_ != null) {
                iK += CodedOutputStream.C(10, getBackground());
            }
            long j2 = this.priority_;
            if (j2 != 0) {
                iK += CodedOutputStream.v(11, j2);
            }
            if (this.alignment_ != Alignment.Center.getNumber()) {
                iK += CodedOutputStream.m(12, this.alignment_);
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iK;
            return iK;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.SystemLiveCommentsMsgOrBuilder
        public String getStartColor() {
            return this.startColor_;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.SystemLiveCommentsMsgOrBuilder
        public ByteString getStartColorBytes() {
            return ByteString.copyFromUtf8(this.startColor_);
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.SystemLiveCommentsMsgOrBuilder
        public TemplateData getTemplate() {
            TemplateData templateData = this.template_;
            return templateData == null ? TemplateData.getDefaultInstance() : templateData;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.SystemLiveCommentsMsgOrBuilder
        public String getType() {
            return this.type_;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.SystemLiveCommentsMsgOrBuilder
        public ByteString getTypeBytes() {
            return ByteString.copyFromUtf8(this.type_);
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.SystemLiveCommentsMsgOrBuilder
        public boolean hasBackground() {
            return this.background_ != null;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.SystemLiveCommentsMsgOrBuilder
        public boolean hasTemplate() {
            return this.template_ != null;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.roomID_.isEmpty()) {
                codedOutputStream.D0(1, getRoomID());
            }
            if (!this.iconUrl_.isEmpty()) {
                codedOutputStream.D0(2, getIconUrl());
            }
            if (!this.startColor_.isEmpty()) {
                codedOutputStream.D0(3, getStartColor());
            }
            if (!this.endColor_.isEmpty()) {
                codedOutputStream.D0(4, getEndColor());
            }
            long j = this.displayDuration_;
            if (j != 0) {
                codedOutputStream.u0(5, j);
            }
            if (!this.gotoSchema_.isEmpty()) {
                codedOutputStream.D0(6, getGotoSchema());
            }
            if (this.template_ != null) {
                codedOutputStream.w0(7, getTemplate());
            }
            if (!this.id_.isEmpty()) {
                codedOutputStream.D0(8, getId());
            }
            if (!this.type_.isEmpty()) {
                codedOutputStream.D0(9, getType());
            }
            if (this.background_ != null) {
                codedOutputStream.w0(10, getBackground());
            }
            long j2 = this.priority_;
            if (j2 != 0) {
                codedOutputStream.u0(11, j2);
            }
            if (this.alignment_ != Alignment.Center.getNumber()) {
                codedOutputStream.i0(12, this.alignment_);
            }
        }

        public static SystemLiveCommentsMsg parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (SystemLiveCommentsMsg) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static SystemLiveCommentsMsg parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (SystemLiveCommentsMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBackground(SystemLiveCommentBackground systemLiveCommentBackground) {
            systemLiveCommentBackground.getClass();
            this.background_ = systemLiveCommentBackground;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTemplate(TemplateData templateData) {
            templateData.getClass();
            this.template_ = templateData;
        }

        public static final class Builder extends GeneratedMessageLite.b<SystemLiveCommentsMsg, Builder> implements SystemLiveCommentsMsgOrBuilder {
            private Builder() {
                super(SystemLiveCommentsMsg.DEFAULT_INSTANCE);
            }

            public Builder clearAlignment() {
                copyOnWrite();
                ((SystemLiveCommentsMsg) ((GeneratedMessageLite.b) this).instance).clearAlignment();
                return this;
            }

            public Builder clearBackground() {
                copyOnWrite();
                ((SystemLiveCommentsMsg) ((GeneratedMessageLite.b) this).instance).clearBackground();
                return this;
            }

            public Builder clearDisplayDuration() {
                copyOnWrite();
                ((SystemLiveCommentsMsg) ((GeneratedMessageLite.b) this).instance).clearDisplayDuration();
                return this;
            }

            public Builder clearEndColor() {
                copyOnWrite();
                ((SystemLiveCommentsMsg) ((GeneratedMessageLite.b) this).instance).clearEndColor();
                return this;
            }

            public Builder clearGotoSchema() {
                copyOnWrite();
                ((SystemLiveCommentsMsg) ((GeneratedMessageLite.b) this).instance).clearGotoSchema();
                return this;
            }

            public Builder clearIconUrl() {
                copyOnWrite();
                ((SystemLiveCommentsMsg) ((GeneratedMessageLite.b) this).instance).clearIconUrl();
                return this;
            }

            public Builder clearId() {
                copyOnWrite();
                ((SystemLiveCommentsMsg) ((GeneratedMessageLite.b) this).instance).clearId();
                return this;
            }

            public Builder clearPriority() {
                copyOnWrite();
                ((SystemLiveCommentsMsg) ((GeneratedMessageLite.b) this).instance).clearPriority();
                return this;
            }

            public Builder clearRoomID() {
                copyOnWrite();
                ((SystemLiveCommentsMsg) ((GeneratedMessageLite.b) this).instance).clearRoomID();
                return this;
            }

            public Builder clearStartColor() {
                copyOnWrite();
                ((SystemLiveCommentsMsg) ((GeneratedMessageLite.b) this).instance).clearStartColor();
                return this;
            }

            public Builder clearTemplate() {
                copyOnWrite();
                ((SystemLiveCommentsMsg) ((GeneratedMessageLite.b) this).instance).clearTemplate();
                return this;
            }

            public Builder clearType() {
                copyOnWrite();
                ((SystemLiveCommentsMsg) ((GeneratedMessageLite.b) this).instance).clearType();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.SystemLiveCommentsMsgOrBuilder
            public Alignment getAlignment() {
                return ((SystemLiveCommentsMsg) ((GeneratedMessageLite.b) this).instance).getAlignment();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.SystemLiveCommentsMsgOrBuilder
            public int getAlignmentValue() {
                return ((SystemLiveCommentsMsg) ((GeneratedMessageLite.b) this).instance).getAlignmentValue();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.SystemLiveCommentsMsgOrBuilder
            public SystemLiveCommentBackground getBackground() {
                return ((SystemLiveCommentsMsg) ((GeneratedMessageLite.b) this).instance).getBackground();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.SystemLiveCommentsMsgOrBuilder
            public long getDisplayDuration() {
                return ((SystemLiveCommentsMsg) ((GeneratedMessageLite.b) this).instance).getDisplayDuration();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.SystemLiveCommentsMsgOrBuilder
            public String getEndColor() {
                return ((SystemLiveCommentsMsg) ((GeneratedMessageLite.b) this).instance).getEndColor();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.SystemLiveCommentsMsgOrBuilder
            public ByteString getEndColorBytes() {
                return ((SystemLiveCommentsMsg) ((GeneratedMessageLite.b) this).instance).getEndColorBytes();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.SystemLiveCommentsMsgOrBuilder
            public String getGotoSchema() {
                return ((SystemLiveCommentsMsg) ((GeneratedMessageLite.b) this).instance).getGotoSchema();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.SystemLiveCommentsMsgOrBuilder
            public ByteString getGotoSchemaBytes() {
                return ((SystemLiveCommentsMsg) ((GeneratedMessageLite.b) this).instance).getGotoSchemaBytes();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.SystemLiveCommentsMsgOrBuilder
            public String getIconUrl() {
                return ((SystemLiveCommentsMsg) ((GeneratedMessageLite.b) this).instance).getIconUrl();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.SystemLiveCommentsMsgOrBuilder
            public ByteString getIconUrlBytes() {
                return ((SystemLiveCommentsMsg) ((GeneratedMessageLite.b) this).instance).getIconUrlBytes();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.SystemLiveCommentsMsgOrBuilder
            public String getId() {
                return ((SystemLiveCommentsMsg) ((GeneratedMessageLite.b) this).instance).getId();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.SystemLiveCommentsMsgOrBuilder
            public ByteString getIdBytes() {
                return ((SystemLiveCommentsMsg) ((GeneratedMessageLite.b) this).instance).getIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.SystemLiveCommentsMsgOrBuilder
            public long getPriority() {
                return ((SystemLiveCommentsMsg) ((GeneratedMessageLite.b) this).instance).getPriority();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.SystemLiveCommentsMsgOrBuilder
            public String getRoomID() {
                return ((SystemLiveCommentsMsg) ((GeneratedMessageLite.b) this).instance).getRoomID();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.SystemLiveCommentsMsgOrBuilder
            public ByteString getRoomIDBytes() {
                return ((SystemLiveCommentsMsg) ((GeneratedMessageLite.b) this).instance).getRoomIDBytes();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.SystemLiveCommentsMsgOrBuilder
            public String getStartColor() {
                return ((SystemLiveCommentsMsg) ((GeneratedMessageLite.b) this).instance).getStartColor();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.SystemLiveCommentsMsgOrBuilder
            public ByteString getStartColorBytes() {
                return ((SystemLiveCommentsMsg) ((GeneratedMessageLite.b) this).instance).getStartColorBytes();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.SystemLiveCommentsMsgOrBuilder
            public TemplateData getTemplate() {
                return ((SystemLiveCommentsMsg) ((GeneratedMessageLite.b) this).instance).getTemplate();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.SystemLiveCommentsMsgOrBuilder
            public String getType() {
                return ((SystemLiveCommentsMsg) ((GeneratedMessageLite.b) this).instance).getType();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.SystemLiveCommentsMsgOrBuilder
            public ByteString getTypeBytes() {
                return ((SystemLiveCommentsMsg) ((GeneratedMessageLite.b) this).instance).getTypeBytes();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.SystemLiveCommentsMsgOrBuilder
            public boolean hasBackground() {
                return ((SystemLiveCommentsMsg) ((GeneratedMessageLite.b) this).instance).hasBackground();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.SystemLiveCommentsMsgOrBuilder
            public boolean hasTemplate() {
                return ((SystemLiveCommentsMsg) ((GeneratedMessageLite.b) this).instance).hasTemplate();
            }

            public Builder mergeBackground(SystemLiveCommentBackground systemLiveCommentBackground) {
                copyOnWrite();
                ((SystemLiveCommentsMsg) ((GeneratedMessageLite.b) this).instance).mergeBackground(systemLiveCommentBackground);
                return this;
            }

            public Builder mergeTemplate(TemplateData templateData) {
                copyOnWrite();
                ((SystemLiveCommentsMsg) ((GeneratedMessageLite.b) this).instance).mergeTemplate(templateData);
                return this;
            }

            public Builder setAlignment(Alignment alignment) {
                copyOnWrite();
                ((SystemLiveCommentsMsg) ((GeneratedMessageLite.b) this).instance).setAlignment(alignment);
                return this;
            }

            public Builder setAlignmentValue(int i) {
                copyOnWrite();
                ((SystemLiveCommentsMsg) ((GeneratedMessageLite.b) this).instance).setAlignmentValue(i);
                return this;
            }

            public Builder setBackground(SystemLiveCommentBackground systemLiveCommentBackground) {
                copyOnWrite();
                ((SystemLiveCommentsMsg) ((GeneratedMessageLite.b) this).instance).setBackground(systemLiveCommentBackground);
                return this;
            }

            public Builder setDisplayDuration(long j) {
                copyOnWrite();
                ((SystemLiveCommentsMsg) ((GeneratedMessageLite.b) this).instance).setDisplayDuration(j);
                return this;
            }

            public Builder setEndColor(String str) {
                copyOnWrite();
                ((SystemLiveCommentsMsg) ((GeneratedMessageLite.b) this).instance).setEndColor(str);
                return this;
            }

            public Builder setEndColorBytes(ByteString byteString) {
                copyOnWrite();
                ((SystemLiveCommentsMsg) ((GeneratedMessageLite.b) this).instance).setEndColorBytes(byteString);
                return this;
            }

            public Builder setGotoSchema(String str) {
                copyOnWrite();
                ((SystemLiveCommentsMsg) ((GeneratedMessageLite.b) this).instance).setGotoSchema(str);
                return this;
            }

            public Builder setGotoSchemaBytes(ByteString byteString) {
                copyOnWrite();
                ((SystemLiveCommentsMsg) ((GeneratedMessageLite.b) this).instance).setGotoSchemaBytes(byteString);
                return this;
            }

            public Builder setIconUrl(String str) {
                copyOnWrite();
                ((SystemLiveCommentsMsg) ((GeneratedMessageLite.b) this).instance).setIconUrl(str);
                return this;
            }

            public Builder setIconUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((SystemLiveCommentsMsg) ((GeneratedMessageLite.b) this).instance).setIconUrlBytes(byteString);
                return this;
            }

            public Builder setId(String str) {
                copyOnWrite();
                ((SystemLiveCommentsMsg) ((GeneratedMessageLite.b) this).instance).setId(str);
                return this;
            }

            public Builder setIdBytes(ByteString byteString) {
                copyOnWrite();
                ((SystemLiveCommentsMsg) ((GeneratedMessageLite.b) this).instance).setIdBytes(byteString);
                return this;
            }

            public Builder setPriority(long j) {
                copyOnWrite();
                ((SystemLiveCommentsMsg) ((GeneratedMessageLite.b) this).instance).setPriority(j);
                return this;
            }

            public Builder setRoomID(String str) {
                copyOnWrite();
                ((SystemLiveCommentsMsg) ((GeneratedMessageLite.b) this).instance).setRoomID(str);
                return this;
            }

            public Builder setRoomIDBytes(ByteString byteString) {
                copyOnWrite();
                ((SystemLiveCommentsMsg) ((GeneratedMessageLite.b) this).instance).setRoomIDBytes(byteString);
                return this;
            }

            public Builder setStartColor(String str) {
                copyOnWrite();
                ((SystemLiveCommentsMsg) ((GeneratedMessageLite.b) this).instance).setStartColor(str);
                return this;
            }

            public Builder setStartColorBytes(ByteString byteString) {
                copyOnWrite();
                ((SystemLiveCommentsMsg) ((GeneratedMessageLite.b) this).instance).setStartColorBytes(byteString);
                return this;
            }

            public Builder setTemplate(TemplateData templateData) {
                copyOnWrite();
                ((SystemLiveCommentsMsg) ((GeneratedMessageLite.b) this).instance).setTemplate(templateData);
                return this;
            }

            public Builder setType(String str) {
                copyOnWrite();
                ((SystemLiveCommentsMsg) ((GeneratedMessageLite.b) this).instance).setType(str);
                return this;
            }

            public Builder setTypeBytes(ByteString byteString) {
                copyOnWrite();
                ((SystemLiveCommentsMsg) ((GeneratedMessageLite.b) this).instance).setTypeBytes(byteString);
                return this;
            }

            public Builder setBackground(SystemLiveCommentBackground.Builder builder) {
                copyOnWrite();
                ((SystemLiveCommentsMsg) ((GeneratedMessageLite.b) this).instance).setBackground(builder);
                return this;
            }

            public Builder setTemplate(TemplateData.Builder builder) {
                copyOnWrite();
                ((SystemLiveCommentsMsg) ((GeneratedMessageLite.b) this).instance).setTemplate(builder);
                return this;
            }
        }

        public static SystemLiveCommentsMsg parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (SystemLiveCommentsMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SystemLiveCommentsMsg parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (SystemLiveCommentsMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static SystemLiveCommentsMsg parseFrom(InputStream inputStream) throws IOException {
            return (SystemLiveCommentsMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SystemLiveCommentsMsg parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (SystemLiveCommentsMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static SystemLiveCommentsMsg parseFrom(e eVar) throws IOException {
            return (SystemLiveCommentsMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static SystemLiveCommentsMsg parseFrom(e eVar, h hVar) throws IOException {
            return (SystemLiveCommentsMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public static final class TemplateData extends GeneratedMessageLite<TemplateData, Builder> implements TemplateDataOrBuilder {
        private static final TemplateData DEFAULT_INSTANCE;
        public static final int FIELDS_FIELD_NUMBER = 2;
        public static final int ID_FIELD_NUMBER = 1;
        private static volatile i860<TemplateData> PARSER;
        private int bitField0_;
        private l.h<String> fields_ = GeneratedMessageLite.emptyProtobufList();
        private int id_;

        public static final class Builder extends GeneratedMessageLite.b<TemplateData, Builder> implements TemplateDataOrBuilder {
            private Builder() {
                super(TemplateData.DEFAULT_INSTANCE);
            }

            public Builder addAllFields(Iterable<String> iterable) {
                copyOnWrite();
                ((TemplateData) ((GeneratedMessageLite.b) this).instance).addAllFields(iterable);
                return this;
            }

            public Builder addFields(String str) {
                copyOnWrite();
                ((TemplateData) ((GeneratedMessageLite.b) this).instance).addFields(str);
                return this;
            }

            public Builder addFieldsBytes(ByteString byteString) {
                copyOnWrite();
                ((TemplateData) ((GeneratedMessageLite.b) this).instance).addFieldsBytes(byteString);
                return this;
            }

            public Builder clearFields() {
                copyOnWrite();
                ((TemplateData) ((GeneratedMessageLite.b) this).instance).clearFields();
                return this;
            }

            public Builder clearId() {
                copyOnWrite();
                ((TemplateData) ((GeneratedMessageLite.b) this).instance).clearId();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.TemplateDataOrBuilder
            public String getFields(int i) {
                return ((TemplateData) ((GeneratedMessageLite.b) this).instance).getFields(i);
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.TemplateDataOrBuilder
            public ByteString getFieldsBytes(int i) {
                return ((TemplateData) ((GeneratedMessageLite.b) this).instance).getFieldsBytes(i);
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.TemplateDataOrBuilder
            public int getFieldsCount() {
                return ((TemplateData) ((GeneratedMessageLite.b) this).instance).getFieldsCount();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.TemplateDataOrBuilder
            public List<String> getFieldsList() {
                return Collections.unmodifiableList(((TemplateData) ((GeneratedMessageLite.b) this).instance).getFieldsList());
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.TemplateDataOrBuilder
            public int getId() {
                return ((TemplateData) ((GeneratedMessageLite.b) this).instance).getId();
            }

            public Builder setFields(int i, String str) {
                copyOnWrite();
                ((TemplateData) ((GeneratedMessageLite.b) this).instance).setFields(i, str);
                return this;
            }

            public Builder setId(int i) {
                copyOnWrite();
                ((TemplateData) ((GeneratedMessageLite.b) this).instance).setId(i);
                return this;
            }
        }

        static {
            TemplateData templateData = new TemplateData();
            DEFAULT_INSTANCE = templateData;
            templateData.makeImmutable();
        }

        private TemplateData() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllFields(Iterable<String> iterable) {
            ensureFieldsIsMutable();
            a.addAll(iterable, this.fields_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addFields(String str) {
            str.getClass();
            ensureFieldsIsMutable();
            this.fields_.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addFieldsBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            ensureFieldsIsMutable();
            this.fields_.add(byteString.toStringUtf8());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFields() {
            this.fields_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearId() {
            this.id_ = 0;
        }

        private void ensureFieldsIsMutable() {
            if (this.fields_.q()) {
                return;
            }
            this.fields_ = GeneratedMessageLite.mutableCopy(this.fields_);
        }

        public static TemplateData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(TemplateData templateData) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(templateData);
        }

        public static TemplateData parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (TemplateData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TemplateData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (TemplateData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<TemplateData> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFields(int i, String str) {
            str.getClass();
            ensureFieldsIsMutable();
            this.fields_.set(i, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setId(int i) {
            this.id_ = i;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C03231.f1639xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new TemplateData();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.fields_.n();
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.g gVar = (GeneratedMessageLite.h) obj;
                    TemplateData templateData = (TemplateData) obj2;
                    int i = this.id_;
                    boolean z2 = i != 0;
                    int i2 = templateData.id_;
                    this.id_ = gVar.e(z2, i, i2 != 0, i2);
                    this.fields_ = gVar.g(this.fields_, templateData.fields_);
                    if (gVar == GeneratedMessageLite.g.INSTANCE) {
                        this.bitField0_ |= templateData.bitField0_;
                    }
                    return this;
                case 6:
                    e eVar = (e) obj;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            if (iM != 0) {
                                if (iM == 8) {
                                    this.id_ = eVar.N();
                                } else if (iM == 18) {
                                    String strL = eVar.L();
                                    if (!this.fields_.q()) {
                                        this.fields_ = GeneratedMessageLite.mutableCopy(this.fields_);
                                    }
                                    this.fields_.add(strL);
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
                        synchronized (TemplateData.class) {
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

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.TemplateDataOrBuilder
        public String getFields(int i) {
            return (String) this.fields_.get(i);
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.TemplateDataOrBuilder
        public ByteString getFieldsBytes(int i) {
            return ByteString.copyFromUtf8((String) this.fields_.get(i));
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.TemplateDataOrBuilder
        public int getFieldsCount() {
            return this.fields_.size();
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.TemplateDataOrBuilder
        public List<String> getFieldsList() {
            return this.fields_;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.TemplateDataOrBuilder
        public int getId() {
            return this.id_;
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = this.id_;
            int iN = i2 != 0 ? CodedOutputStream.N(1, i2) : 0;
            int iL = 0;
            for (int i3 = 0; i3 < this.fields_.size(); i3++) {
                iL += CodedOutputStream.L((String) this.fields_.get(i3));
            }
            int size = iN + iL + getFieldsList().size();
            ((GeneratedMessageLite) this).memoizedSerializedSize = size;
            return size;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            int i = this.id_;
            if (i != 0) {
                codedOutputStream.G0(1, i);
            }
            for (int i2 = 0; i2 < this.fields_.size(); i2++) {
                codedOutputStream.D0(2, (String) this.fields_.get(i2));
            }
        }

        public static TemplateData parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (TemplateData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static TemplateData parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (TemplateData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static TemplateData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (TemplateData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TemplateData parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (TemplateData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static TemplateData parseFrom(InputStream inputStream) throws IOException {
            return (TemplateData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TemplateData parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (TemplateData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static TemplateData parseFrom(e eVar) throws IOException {
            return (TemplateData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static TemplateData parseFrom(e eVar, h hVar) throws IOException {
            return (TemplateData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public static final class VideoChatDuration extends GeneratedMessageLite<VideoChatDuration, Builder> implements VideoChatDurationOrBuilder {
        public static final int CHATID_FIELD_NUMBER = 1;
        private static final VideoChatDuration DEFAULT_INSTANCE;
        private static volatile i860<VideoChatDuration> PARSER = null;
        public static final int REMAININGDURATIONSEC_FIELD_NUMBER = 3;
        public static final int SINCESEC_FIELD_NUMBER = 4;
        public static final int USERID_FIELD_NUMBER = 2;
        private long remainingDurationSec_;
        private long sinceSec_;
        private String chatId_ = "";
        private String userId_ = "";

        public static final class Builder extends GeneratedMessageLite.b<VideoChatDuration, Builder> implements VideoChatDurationOrBuilder {
            private Builder() {
                super(VideoChatDuration.DEFAULT_INSTANCE);
            }

            public Builder clearChatId() {
                copyOnWrite();
                ((VideoChatDuration) ((GeneratedMessageLite.b) this).instance).clearChatId();
                return this;
            }

            public Builder clearRemainingDurationSec() {
                copyOnWrite();
                ((VideoChatDuration) ((GeneratedMessageLite.b) this).instance).clearRemainingDurationSec();
                return this;
            }

            public Builder clearSinceSec() {
                copyOnWrite();
                ((VideoChatDuration) ((GeneratedMessageLite.b) this).instance).clearSinceSec();
                return this;
            }

            public Builder clearUserId() {
                copyOnWrite();
                ((VideoChatDuration) ((GeneratedMessageLite.b) this).instance).clearUserId();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.VideoChatDurationOrBuilder
            public String getChatId() {
                return ((VideoChatDuration) ((GeneratedMessageLite.b) this).instance).getChatId();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.VideoChatDurationOrBuilder
            public ByteString getChatIdBytes() {
                return ((VideoChatDuration) ((GeneratedMessageLite.b) this).instance).getChatIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.VideoChatDurationOrBuilder
            public long getRemainingDurationSec() {
                return ((VideoChatDuration) ((GeneratedMessageLite.b) this).instance).getRemainingDurationSec();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.VideoChatDurationOrBuilder
            public long getSinceSec() {
                return ((VideoChatDuration) ((GeneratedMessageLite.b) this).instance).getSinceSec();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.VideoChatDurationOrBuilder
            public String getUserId() {
                return ((VideoChatDuration) ((GeneratedMessageLite.b) this).instance).getUserId();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.VideoChatDurationOrBuilder
            public ByteString getUserIdBytes() {
                return ((VideoChatDuration) ((GeneratedMessageLite.b) this).instance).getUserIdBytes();
            }

            public Builder setChatId(String str) {
                copyOnWrite();
                ((VideoChatDuration) ((GeneratedMessageLite.b) this).instance).setChatId(str);
                return this;
            }

            public Builder setChatIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VideoChatDuration) ((GeneratedMessageLite.b) this).instance).setChatIdBytes(byteString);
                return this;
            }

            public Builder setRemainingDurationSec(long j) {
                copyOnWrite();
                ((VideoChatDuration) ((GeneratedMessageLite.b) this).instance).setRemainingDurationSec(j);
                return this;
            }

            public Builder setSinceSec(long j) {
                copyOnWrite();
                ((VideoChatDuration) ((GeneratedMessageLite.b) this).instance).setSinceSec(j);
                return this;
            }

            public Builder setUserId(String str) {
                copyOnWrite();
                ((VideoChatDuration) ((GeneratedMessageLite.b) this).instance).setUserId(str);
                return this;
            }

            public Builder setUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VideoChatDuration) ((GeneratedMessageLite.b) this).instance).setUserIdBytes(byteString);
                return this;
            }
        }

        static {
            VideoChatDuration videoChatDuration = new VideoChatDuration();
            DEFAULT_INSTANCE = videoChatDuration;
            videoChatDuration.makeImmutable();
        }

        private VideoChatDuration() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearChatId() {
            this.chatId_ = getDefaultInstance().getChatId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRemainingDurationSec() {
            this.remainingDurationSec_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSinceSec() {
            this.sinceSec_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUserId() {
            this.userId_ = getDefaultInstance().getUserId();
        }

        public static VideoChatDuration getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(VideoChatDuration videoChatDuration) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(videoChatDuration);
        }

        public static VideoChatDuration parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VideoChatDuration) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VideoChatDuration parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VideoChatDuration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<VideoChatDuration> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setChatId(String str) {
            str.getClass();
            this.chatId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setChatIdBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.chatId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRemainingDurationSec(long j) {
            this.remainingDurationSec_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSinceSec(long j) {
            this.sinceSec_ = j;
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
            switch (C03231.f1639xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VideoChatDuration();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    VideoChatDuration videoChatDuration = (VideoChatDuration) obj2;
                    this.chatId_ = hVar.f(!this.chatId_.isEmpty(), this.chatId_, !videoChatDuration.chatId_.isEmpty(), videoChatDuration.chatId_);
                    this.userId_ = hVar.f(!this.userId_.isEmpty(), this.userId_, !videoChatDuration.userId_.isEmpty(), videoChatDuration.userId_);
                    long j = this.remainingDurationSec_;
                    boolean z2 = j != 0;
                    long j2 = videoChatDuration.remainingDurationSec_;
                    this.remainingDurationSec_ = hVar.i(z2, j, j2 != 0, j2);
                    boolean z3 = false;
                    long j3 = this.sinceSec_;
                    if (j3 != 0) {
                        z3 = true;
                    }
                    long j4 = videoChatDuration.sinceSec_;
                    this.sinceSec_ = hVar.i(z3, j3, j4 != 0, j4);
                    GeneratedMessageLite.g gVar = GeneratedMessageLite.g.INSTANCE;
                    return this;
                case 6:
                    e eVar = (e) obj;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            if (iM != 0) {
                                if (iM == 10) {
                                    this.chatId_ = eVar.L();
                                } else if (iM == 18) {
                                    this.userId_ = eVar.L();
                                } else if (iM == 24) {
                                    this.remainingDurationSec_ = eVar.v();
                                } else if (iM == 32) {
                                    this.sinceSec_ = eVar.v();
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
                        synchronized (VideoChatDuration.class) {
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

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.VideoChatDurationOrBuilder
        public String getChatId() {
            return this.chatId_;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.VideoChatDurationOrBuilder
        public ByteString getChatIdBytes() {
            return ByteString.copyFromUtf8(this.chatId_);
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.VideoChatDurationOrBuilder
        public long getRemainingDurationSec() {
            return this.remainingDurationSec_;
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iK = !this.chatId_.isEmpty() ? CodedOutputStream.K(1, getChatId()) : 0;
            if (!this.userId_.isEmpty()) {
                iK += CodedOutputStream.K(2, getUserId());
            }
            long j = this.remainingDurationSec_;
            if (j != 0) {
                iK += CodedOutputStream.v(3, j);
            }
            long j2 = this.sinceSec_;
            if (j2 != 0) {
                iK += CodedOutputStream.v(4, j2);
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iK;
            return iK;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.VideoChatDurationOrBuilder
        public long getSinceSec() {
            return this.sinceSec_;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.VideoChatDurationOrBuilder
        public String getUserId() {
            return this.userId_;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.VideoChatDurationOrBuilder
        public ByteString getUserIdBytes() {
            return ByteString.copyFromUtf8(this.userId_);
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.chatId_.isEmpty()) {
                codedOutputStream.D0(1, getChatId());
            }
            if (!this.userId_.isEmpty()) {
                codedOutputStream.D0(2, getUserId());
            }
            long j = this.remainingDurationSec_;
            if (j != 0) {
                codedOutputStream.u0(3, j);
            }
            long j2 = this.sinceSec_;
            if (j2 != 0) {
                codedOutputStream.u0(4, j2);
            }
        }

        public static VideoChatDuration parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (VideoChatDuration) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static VideoChatDuration parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (VideoChatDuration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static VideoChatDuration parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VideoChatDuration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VideoChatDuration parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (VideoChatDuration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static VideoChatDuration parseFrom(InputStream inputStream) throws IOException {
            return (VideoChatDuration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VideoChatDuration parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (VideoChatDuration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static VideoChatDuration parseFrom(e eVar) throws IOException {
            return (VideoChatDuration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static VideoChatDuration parseFrom(e eVar, h hVar) throws IOException {
            return (VideoChatDuration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public static final class VideoEffectExtra extends GeneratedMessageLite<VideoEffectExtra, Builder> implements VideoEffectExtraOrBuilder {
        private static final VideoEffectExtra DEFAULT_INSTANCE;
        public static final int ID_FIELD_NUMBER = 1;
        private static volatile i860<VideoEffectExtra> PARSER = null;
        public static final int TYPE_FIELD_NUMBER = 2;
        public static final int VALUE_FIELD_NUMBER = 3;
        private long type_;
        private String id_ = "";
        private String value_ = "";

        public static final class Builder extends GeneratedMessageLite.b<VideoEffectExtra, Builder> implements VideoEffectExtraOrBuilder {
            private Builder() {
                super(VideoEffectExtra.DEFAULT_INSTANCE);
            }

            public Builder clearId() {
                copyOnWrite();
                ((VideoEffectExtra) ((GeneratedMessageLite.b) this).instance).clearId();
                return this;
            }

            public Builder clearType() {
                copyOnWrite();
                ((VideoEffectExtra) ((GeneratedMessageLite.b) this).instance).clearType();
                return this;
            }

            public Builder clearValue() {
                copyOnWrite();
                ((VideoEffectExtra) ((GeneratedMessageLite.b) this).instance).clearValue();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.VideoEffectExtraOrBuilder
            public String getId() {
                return ((VideoEffectExtra) ((GeneratedMessageLite.b) this).instance).getId();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.VideoEffectExtraOrBuilder
            public ByteString getIdBytes() {
                return ((VideoEffectExtra) ((GeneratedMessageLite.b) this).instance).getIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.VideoEffectExtraOrBuilder
            public long getType() {
                return ((VideoEffectExtra) ((GeneratedMessageLite.b) this).instance).getType();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.VideoEffectExtraOrBuilder
            public String getValue() {
                return ((VideoEffectExtra) ((GeneratedMessageLite.b) this).instance).getValue();
            }

            @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.VideoEffectExtraOrBuilder
            public ByteString getValueBytes() {
                return ((VideoEffectExtra) ((GeneratedMessageLite.b) this).instance).getValueBytes();
            }

            public Builder setId(String str) {
                copyOnWrite();
                ((VideoEffectExtra) ((GeneratedMessageLite.b) this).instance).setId(str);
                return this;
            }

            public Builder setIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VideoEffectExtra) ((GeneratedMessageLite.b) this).instance).setIdBytes(byteString);
                return this;
            }

            public Builder setType(long j) {
                copyOnWrite();
                ((VideoEffectExtra) ((GeneratedMessageLite.b) this).instance).setType(j);
                return this;
            }

            public Builder setValue(String str) {
                copyOnWrite();
                ((VideoEffectExtra) ((GeneratedMessageLite.b) this).instance).setValue(str);
                return this;
            }

            public Builder setValueBytes(ByteString byteString) {
                copyOnWrite();
                ((VideoEffectExtra) ((GeneratedMessageLite.b) this).instance).setValueBytes(byteString);
                return this;
            }
        }

        static {
            VideoEffectExtra videoEffectExtra = new VideoEffectExtra();
            DEFAULT_INSTANCE = videoEffectExtra;
            videoEffectExtra.makeImmutable();
        }

        private VideoEffectExtra() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearId() {
            this.id_ = getDefaultInstance().getId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearType() {
            this.type_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearValue() {
            this.value_ = getDefaultInstance().getValue();
        }

        public static VideoEffectExtra getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(VideoEffectExtra videoEffectExtra) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(videoEffectExtra);
        }

        public static VideoEffectExtra parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VideoEffectExtra) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VideoEffectExtra parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VideoEffectExtra) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<VideoEffectExtra> parser() {
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
            switch (C03231.f1639xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VideoEffectExtra();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    VideoEffectExtra videoEffectExtra = (VideoEffectExtra) obj2;
                    this.id_ = hVar.f(!this.id_.isEmpty(), this.id_, !videoEffectExtra.id_.isEmpty(), videoEffectExtra.id_);
                    long j = this.type_;
                    boolean z2 = j != 0;
                    long j2 = videoEffectExtra.type_;
                    this.type_ = hVar.i(z2, j, j2 != 0, j2);
                    this.value_ = hVar.f(!this.value_.isEmpty(), this.value_, !videoEffectExtra.value_.isEmpty(), videoEffectExtra.value_);
                    GeneratedMessageLite.g gVar = GeneratedMessageLite.g.INSTANCE;
                    return this;
                case 6:
                    e eVar = (e) obj;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            if (iM != 0) {
                                if (iM == 10) {
                                    this.id_ = eVar.L();
                                } else if (iM == 16) {
                                    this.type_ = eVar.v();
                                } else if (iM == 26) {
                                    this.value_ = eVar.L();
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
                        synchronized (VideoEffectExtra.class) {
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

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.VideoEffectExtraOrBuilder
        public String getId() {
            return this.id_;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.VideoEffectExtraOrBuilder
        public ByteString getIdBytes() {
            return ByteString.copyFromUtf8(this.id_);
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iK = !this.id_.isEmpty() ? CodedOutputStream.K(1, getId()) : 0;
            long j = this.type_;
            if (j != 0) {
                iK += CodedOutputStream.v(2, j);
            }
            if (!this.value_.isEmpty()) {
                iK += CodedOutputStream.K(3, getValue());
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iK;
            return iK;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.VideoEffectExtraOrBuilder
        public long getType() {
            return this.type_;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.VideoEffectExtraOrBuilder
        public String getValue() {
            return this.value_;
        }

        @Override // com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage.VideoEffectExtraOrBuilder
        public ByteString getValueBytes() {
            return ByteString.copyFromUtf8(this.value_);
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.id_.isEmpty()) {
                codedOutputStream.D0(1, getId());
            }
            long j = this.type_;
            if (j != 0) {
                codedOutputStream.u0(2, j);
            }
            if (this.value_.isEmpty()) {
                return;
            }
            codedOutputStream.D0(3, getValue());
        }

        public static VideoEffectExtra parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (VideoEffectExtra) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static VideoEffectExtra parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (VideoEffectExtra) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static VideoEffectExtra parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VideoEffectExtra) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VideoEffectExtra parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (VideoEffectExtra) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static VideoEffectExtra parseFrom(InputStream inputStream) throws IOException {
            return (VideoEffectExtra) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VideoEffectExtra parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (VideoEffectExtra) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static VideoEffectExtra parseFrom(e eVar) throws IOException {
            return (VideoEffectExtra) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static VideoEffectExtra parseFrom(e eVar, h hVar) throws IOException {
            return (VideoEffectExtra) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }
}
