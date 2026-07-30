package com.p051p1.mobile.longlink.msg.livechat;

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
import org.spongycastle.crypto.tls.CipherSuite;
import p153l.iig0;
import p153l.l710;
import p153l.lfz;
import p153l.ng60;

/* JADX INFO: loaded from: classes8.dex */
public final class LongLinkChatMessage {

    /* JADX INFO: renamed from: com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage$1 */
    public static /* synthetic */ class C45911 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16674xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f16674xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16674xa1df5c61[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16674xa1df5c61[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16674xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16674xa1df5c61[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16674xa1df5c61[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16674xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f16674xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public interface AtUserInfoOrBuilder extends lfz {
        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        String getUserId();

        ByteString getUserIdBytes();

        String getUserName();

        ByteString getUserNameBytes();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface ClientPostMessageRequestOrBuilder extends lfz {
        String getAnchorId();

        ByteString getAnchorIdBytes();

        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        LiveChatMessage getMsg();

        boolean hasMsg();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface GiftMessageOrBuilder extends lfz {
        String getAnchorId();

        ByteString getAnchorIdBytes();

        int getCount();

        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        long getId();

        String getLiveId();

        ByteString getLiveIdBytes();

        String getName();

        ByteString getNameBytes();

        String getOriginId();

        ByteString getOriginIdBytes();

        String getType();

        ByteString getTypeBytes();

        String getUrl();

        ByteString getUrlBytes();

        String getVersion();

        ByteString getVersionBytes();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface HierarchyMessageOrBuilder extends lfz {
        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        long getGrade();

        String getImageUrl();

        ByteString getImageUrlBytes();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface LiveBackgroundColorConfigOrBuilder extends lfz {
        String getColors(int i);

        ByteString getColorsBytes(int i);

        int getColorsCount();

        List<String> getColorsList();

        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        long getGradientDirection();

        long getTransparency();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface LiveChatMessageExtInfoOrBuilder extends lfz {
        AtUserInfo getAtUserInfos(int i);

        int getAtUserInfosCount();

        List<AtUserInfo> getAtUserInfosList();

        boolean getColorfulMode();

        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        boolean getGroupControl();

        String getGroupType();

        ByteString getGroupTypeBytes();

        String getImageUrl();

        ByteString getImageUrlBytes();

        Mask getMask();

        boolean getMaskMode();

        String getSenderCityID();

        ByteString getSenderCityIDBytes();

        String getSharedVoiceRoomID();

        ByteString getSharedVoiceRoomIDBytes();

        String getTraceInfo();

        ByteString getTraceInfoBytes();

        userMaskConfig.UserMask getUserMask();

        boolean hasMask();

        boolean hasUserMask();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface LiveChatMessageOrBuilder extends lfz {
        Action getAction();

        int getActionValue();

        String getAnchorId();

        ByteString getAnchorIdBytes();

        LiveChatShadingConfig getChatShadingConfig();

        long getCreatedTime();

        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        LiveChatMessageExtInfo getExtInfo();

        String getFakeId();

        ByteString getFakeIdBytes();

        String getFakeName();

        ByteString getFakeNameBytes();

        GiftMessage getGift();

        String getGiftTargetUserId();

        ByteString getGiftTargetUserIdBytes();

        String getH5();

        ByteString getH5Bytes();

        HierarchyMessage getHierarchy();

        String getLiveId();

        ByteString getLiveIdBytes();

        String getLiveMode();

        ByteString getLiveModeBytes();

        LiveRevenueCampaignVip getLiveRevenueCampaignVip();

        MedalMessage getMedal();

        String getMsgId();

        ByteString getMsgIdBytes();

        long getPreSeq();

        long getPreTimestamp();

        String getRoomId();

        ByteString getRoomIdBytes();

        RoomType getRoomType();

        int getRoomTypeValue();

        long getSeq();

        SharedVoiceLiveInfo getSharedVoiceLiveInfo();

        String getSource();

        ByteString getSourceBytes();

        HierarchyMessage getStarlightHierarchy();

        Template.TemplateData getTemplate();

        String getTemplateType();

        ByteString getTemplateTypeBytes();

        LiveChatMessageType getType();

        int getTypeValue();

        String getUserId();

        ByteString getUserIdBytes();

        String getUserIdentity();

        ByteString getUserIdentityBytes();

        String getUsername();

        ByteString getUsernameBytes();

        String getValue();

        ByteString getValueBytes();

        boolean hasChatShadingConfig();

        boolean hasExtInfo();

        boolean hasGift();

        boolean hasHierarchy();

        boolean hasLiveRevenueCampaignVip();

        boolean hasMedal();

        boolean hasSharedVoiceLiveInfo();

        boolean hasStarlightHierarchy();

        boolean hasTemplate();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface LiveChatShadingConfigOrBuilder extends lfz {
        LiveBackgroundColorConfig getBackgroundColorConfig();

        LiveBackgroundColorConfig getBorderColorConfig();

        LiveCornerConfig getCornerConfig();

        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        boolean hasBackgroundColorConfig();

        boolean hasBorderColorConfig();

        boolean hasCornerConfig();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface LiveCornerConfigOrBuilder extends lfz {
        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        String getPictureUrl();

        ByteString getPictureUrlBytes();

        long getPosition();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface LiveRevenueCampaignVipOrBuilder extends lfz {
        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        boolean getIsVip();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface MaskOrBuilder extends lfz {
        String getColor();

        ByteString getColorBytes();

        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        String getGender();

        ByteString getGenderBytes();

        String getIcon();

        ByteString getIconBytes();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface MedalMessageOrBuilder extends lfz {
        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        String getIds(int i);

        ByteString getIdsBytes(int i);

        int getIdsCount();

        List<String> getIdsList();

        Medal getMultiRoomMedals(int i);

        int getMultiRoomMedalsCount();

        List<Medal> getMultiRoomMedalsList();

        Medal getSingleRoomMedals(int i);

        int getSingleRoomMedalsCount();

        List<Medal> getSingleRoomMedalsList();

        String getVersion();

        ByteString getVersionBytes();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface MedalOrBuilder extends lfz {
        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        long getFamilyGrade();

        boolean getFamilyLight();

        String getFamilyText();

        ByteString getFamilyTextBytes();

        long getFanbaseGrade();

        String getId();

        ByteString getIdBytes();

        String getVoiceFanbaseColor();

        ByteString getVoiceFanbaseColorBytes();

        long getVoiceFanbaseGrade();

        String getVoiceFanbaseText();

        ByteString getVoiceFanbaseTextBytes();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface PostMessageAckOrBuilder extends lfz {
        PostMessageCode getCode();

        String getCodeMessage();

        ByteString getCodeMessageBytes();

        int getCodeValue();

        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        LiveChatMessage getMessage();

        boolean hasMessage();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface SharedVoiceLiveInfoOrBuilder extends lfz {
        String getAnchorId();

        ByteString getAnchorIdBytes();

        int getAudienceCount();

        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        String getDescription();

        ByteString getDescriptionBytes();

        String getLiveId();

        ByteString getLiveIdBytes();

        String getRoomId();

        ByteString getRoomIdBytes();

        int getVoiceCallCount();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface UserMedalOrBuilder extends lfz {
        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        String getIds(int i);

        ByteString getIdsBytes(int i);

        int getIdsCount();

        List<String> getIdsList();

        String getVersion();

        ByteString getVersionBytes();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface VoiceLiveMaskModeFollowApplyInfoOrBuilder extends lfz {
        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        String getLiveId();

        ByteString getLiveIdBytes();

        String getOtherUserId();

        ByteString getOtherUserIdBytes();

        String getRoomId();

        ByteString getRoomIdBytes();

        String getUserId();

        ByteString getUserIdBytes();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    private LongLinkChatMessage() {
    }

    public static void registerAllExtensions(C3433h c3433h) {
    }

    public enum Action implements C3437l.c {
        DEFAULT(0),
        PROFILE(1),
        H5(2),
        SYSTEM(3),
        UNRECOGNIZED(-1);

        public static final int DEFAULT_VALUE = 0;
        public static final int H5_VALUE = 2;
        public static final int PROFILE_VALUE = 1;
        public static final int SYSTEM_VALUE = 3;
        private static final C3437l.d<Action> internalValueMap = new C3437l.d<Action>() { // from class: com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.Action.1
            @Override // com.google.protobuf.C3437l.d
            public Action findValueByNumber(int i) {
                return Action.forNumber(i);
            }
        };
        private final int value;

        Action(int i) {
            this.value = i;
        }

        public static Action forNumber(int i) {
            if (i == 0) {
                return DEFAULT;
            }
            if (i == 1) {
                return PROFILE;
            }
            if (i == 2) {
                return H5;
            }
            if (i != 3) {
                return null;
            }
            return SYSTEM;
        }

        public static C3437l.d<Action> internalGetValueMap() {
            return internalValueMap;
        }

        @Override // com.google.protobuf.C3437l.c
        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static Action valueOf(int i) {
            return forNumber(i);
        }
    }

    public static final class AtUserInfo extends GeneratedMessageLite<AtUserInfo, Builder> implements AtUserInfoOrBuilder {
        private static final AtUserInfo DEFAULT_INSTANCE;
        private static volatile ng60<AtUserInfo> PARSER = null;
        public static final int USERID_FIELD_NUMBER = 1;
        public static final int USERNAME_FIELD_NUMBER = 2;
        private String userId_ = "";
        private String userName_ = "";

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<AtUserInfo, Builder> implements AtUserInfoOrBuilder {
            private Builder() {
                super(AtUserInfo.DEFAULT_INSTANCE);
            }

            public Builder clearUserId() {
                copyOnWrite();
                ((AtUserInfo) this.instance).clearUserId();
                return this;
            }

            public Builder clearUserName() {
                copyOnWrite();
                ((AtUserInfo) this.instance).clearUserName();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.AtUserInfoOrBuilder
            public String getUserId() {
                return ((AtUserInfo) this.instance).getUserId();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.AtUserInfoOrBuilder
            public ByteString getUserIdBytes() {
                return ((AtUserInfo) this.instance).getUserIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.AtUserInfoOrBuilder
            public String getUserName() {
                return ((AtUserInfo) this.instance).getUserName();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.AtUserInfoOrBuilder
            public ByteString getUserNameBytes() {
                return ((AtUserInfo) this.instance).getUserNameBytes();
            }

            public Builder setUserId(String str) {
                copyOnWrite();
                ((AtUserInfo) this.instance).setUserId(str);
                return this;
            }

            public Builder setUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((AtUserInfo) this.instance).setUserIdBytes(byteString);
                return this;
            }

            public Builder setUserName(String str) {
                copyOnWrite();
                ((AtUserInfo) this.instance).setUserName(str);
                return this;
            }

            public Builder setUserNameBytes(ByteString byteString) {
                copyOnWrite();
                ((AtUserInfo) this.instance).setUserNameBytes(byteString);
                return this;
            }
        }

        static {
            AtUserInfo atUserInfo = new AtUserInfo();
            DEFAULT_INSTANCE = atUserInfo;
            atUserInfo.makeImmutable();
        }

        private AtUserInfo() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUserId() {
            this.userId_ = getDefaultInstance().getUserId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUserName() {
            this.userName_ = getDefaultInstance().getUserName();
        }

        public static AtUserInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(AtUserInfo atUserInfo) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(atUserInfo);
        }

        public static AtUserInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (AtUserInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AtUserInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (AtUserInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<AtUserInfo> parser() {
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
            switch (C45911.f16674xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new AtUserInfo();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    AtUserInfo atUserInfo = (AtUserInfo) obj2;
                    this.userId_ = interfaceC3409h.mo17052f(!this.userId_.isEmpty(), this.userId_, !atUserInfo.userId_.isEmpty(), atUserInfo.userId_);
                    this.userName_ = interfaceC3409h.mo17052f(!this.userName_.isEmpty(), this.userName_, true ^ atUserInfo.userName_.isEmpty(), atUserInfo.userName_);
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
                                    this.userName_ = c3430e.m17170L();
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
                        synchronized (AtUserInfo.class) {
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
            if (!this.userName_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(2, getUserName());
            }
            this.memoizedSerializedSize = iM16956K;
            return iM16956K;
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.AtUserInfoOrBuilder
        public String getUserId() {
            return this.userId_;
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.AtUserInfoOrBuilder
        public ByteString getUserIdBytes() {
            return ByteString.copyFromUtf8(this.userId_);
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.AtUserInfoOrBuilder
        public String getUserName() {
            return this.userName_;
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.AtUserInfoOrBuilder
        public ByteString getUserNameBytes() {
            return ByteString.copyFromUtf8(this.userName_);
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.userId_.isEmpty()) {
                codedOutputStream.mo16994D0(1, getUserId());
            }
            if (this.userName_.isEmpty()) {
                return;
            }
            codedOutputStream.mo16994D0(2, getUserName());
        }

        public static AtUserInfo parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (AtUserInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static AtUserInfo parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (AtUserInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        public static AtUserInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (AtUserInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static AtUserInfo parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (AtUserInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static AtUserInfo parseFrom(InputStream inputStream) throws IOException {
            return (AtUserInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AtUserInfo parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (AtUserInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static AtUserInfo parseFrom(C3430e c3430e) throws IOException {
            return (AtUserInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static AtUserInfo parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (AtUserInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }

    public static final class ClientPostMessageRequest extends GeneratedMessageLite<ClientPostMessageRequest, Builder> implements ClientPostMessageRequestOrBuilder {
        public static final int ANCHORID_FIELD_NUMBER = 1;
        private static final ClientPostMessageRequest DEFAULT_INSTANCE;
        public static final int MSG_FIELD_NUMBER = 2;
        private static volatile ng60<ClientPostMessageRequest> PARSER;
        private String anchorId_ = "";
        private LiveChatMessage msg_;

        static {
            ClientPostMessageRequest clientPostMessageRequest = new ClientPostMessageRequest();
            DEFAULT_INSTANCE = clientPostMessageRequest;
            clientPostMessageRequest.makeImmutable();
        }

        private ClientPostMessageRequest() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAnchorId() {
            this.anchorId_ = getDefaultInstance().getAnchorId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMsg() {
            this.msg_ = null;
        }

        public static ClientPostMessageRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeMsg(LiveChatMessage liveChatMessage) {
            LiveChatMessage liveChatMessage2 = this.msg_;
            if (liveChatMessage2 == null || liveChatMessage2 == LiveChatMessage.getDefaultInstance()) {
                this.msg_ = liveChatMessage;
            } else {
                this.msg_ = LiveChatMessage.newBuilder(this.msg_).mergeFrom(liveChatMessage).buildPartial();
            }
        }

        public static Builder newBuilder(ClientPostMessageRequest clientPostMessageRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(clientPostMessageRequest);
        }

        public static ClientPostMessageRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ClientPostMessageRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ClientPostMessageRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ClientPostMessageRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<ClientPostMessageRequest> parser() {
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.anchorId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMsg(LiveChatMessage.Builder builder) {
            this.msg_ = builder.build();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C45911.f16674xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new ClientPostMessageRequest();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    ClientPostMessageRequest clientPostMessageRequest = (ClientPostMessageRequest) obj2;
                    this.anchorId_ = interfaceC3409h.mo17052f(!this.anchorId_.isEmpty(), this.anchorId_, true ^ clientPostMessageRequest.anchorId_.isEmpty(), clientPostMessageRequest.anchorId_);
                    this.msg_ = (LiveChatMessage) interfaceC3409h.mo17061o(this.msg_, clientPostMessageRequest.msg_);
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
                                    this.anchorId_ = c3430e.m17170L();
                                } else if (iM17171M == 18) {
                                    LiveChatMessage liveChatMessage = this.msg_;
                                    LiveChatMessage.Builder builder = liveChatMessage != null ? liveChatMessage.toBuilder() : null;
                                    LiveChatMessage liveChatMessage2 = (LiveChatMessage) c3430e.m17198w(LiveChatMessage.parser(), c3433h);
                                    this.msg_ = liveChatMessage2;
                                    if (builder != null) {
                                        builder.mergeFrom(liveChatMessage2);
                                        this.msg_ = builder.buildPartial();
                                    }
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
                        synchronized (ClientPostMessageRequest.class) {
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

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.ClientPostMessageRequestOrBuilder
        public String getAnchorId() {
            return this.anchorId_;
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.ClientPostMessageRequestOrBuilder
        public ByteString getAnchorIdBytes() {
            return ByteString.copyFromUtf8(this.anchorId_);
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.ClientPostMessageRequestOrBuilder
        public LiveChatMessage getMsg() {
            LiveChatMessage liveChatMessage = this.msg_;
            return liveChatMessage == null ? LiveChatMessage.getDefaultInstance() : liveChatMessage;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16956K = !this.anchorId_.isEmpty() ? CodedOutputStream.m16956K(1, getAnchorId()) : 0;
            if (this.msg_ != null) {
                iM16956K += CodedOutputStream.m16948C(2, getMsg());
            }
            this.memoizedSerializedSize = iM16956K;
            return iM16956K;
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.ClientPostMessageRequestOrBuilder
        public boolean hasMsg() {
            return this.msg_ != null;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.anchorId_.isEmpty()) {
                codedOutputStream.mo16994D0(1, getAnchorId());
            }
            if (this.msg_ != null) {
                codedOutputStream.mo17029w0(2, getMsg());
            }
        }

        public static ClientPostMessageRequest parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (ClientPostMessageRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static ClientPostMessageRequest parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (ClientPostMessageRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMsg(LiveChatMessage liveChatMessage) {
            liveChatMessage.getClass();
            this.msg_ = liveChatMessage;
        }

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<ClientPostMessageRequest, Builder> implements ClientPostMessageRequestOrBuilder {
            private Builder() {
                super(ClientPostMessageRequest.DEFAULT_INSTANCE);
            }

            public Builder clearAnchorId() {
                copyOnWrite();
                ((ClientPostMessageRequest) this.instance).clearAnchorId();
                return this;
            }

            public Builder clearMsg() {
                copyOnWrite();
                ((ClientPostMessageRequest) this.instance).clearMsg();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.ClientPostMessageRequestOrBuilder
            public String getAnchorId() {
                return ((ClientPostMessageRequest) this.instance).getAnchorId();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.ClientPostMessageRequestOrBuilder
            public ByteString getAnchorIdBytes() {
                return ((ClientPostMessageRequest) this.instance).getAnchorIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.ClientPostMessageRequestOrBuilder
            public LiveChatMessage getMsg() {
                return ((ClientPostMessageRequest) this.instance).getMsg();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.ClientPostMessageRequestOrBuilder
            public boolean hasMsg() {
                return ((ClientPostMessageRequest) this.instance).hasMsg();
            }

            public Builder mergeMsg(LiveChatMessage liveChatMessage) {
                copyOnWrite();
                ((ClientPostMessageRequest) this.instance).mergeMsg(liveChatMessage);
                return this;
            }

            public Builder setAnchorId(String str) {
                copyOnWrite();
                ((ClientPostMessageRequest) this.instance).setAnchorId(str);
                return this;
            }

            public Builder setAnchorIdBytes(ByteString byteString) {
                copyOnWrite();
                ((ClientPostMessageRequest) this.instance).setAnchorIdBytes(byteString);
                return this;
            }

            public Builder setMsg(LiveChatMessage liveChatMessage) {
                copyOnWrite();
                ((ClientPostMessageRequest) this.instance).setMsg(liveChatMessage);
                return this;
            }

            public Builder setMsg(LiveChatMessage.Builder builder) {
                copyOnWrite();
                ((ClientPostMessageRequest) this.instance).setMsg(builder);
                return this;
            }
        }

        public static ClientPostMessageRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ClientPostMessageRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ClientPostMessageRequest parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (ClientPostMessageRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static ClientPostMessageRequest parseFrom(InputStream inputStream) throws IOException {
            return (ClientPostMessageRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ClientPostMessageRequest parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (ClientPostMessageRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static ClientPostMessageRequest parseFrom(C3430e c3430e) throws IOException {
            return (ClientPostMessageRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ClientPostMessageRequest parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (ClientPostMessageRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }

    public static final class GiftMessage extends GeneratedMessageLite<GiftMessage, Builder> implements GiftMessageOrBuilder {
        public static final int ANCHORID_FIELD_NUMBER = 7;
        public static final int COUNT_FIELD_NUMBER = 6;
        private static final GiftMessage DEFAULT_INSTANCE;
        public static final int ID_FIELD_NUMBER = 1;
        public static final int LIVEID_FIELD_NUMBER = 8;
        public static final int NAME_FIELD_NUMBER = 3;
        public static final int ORIGINID_FIELD_NUMBER = 5;
        private static volatile ng60<GiftMessage> PARSER = null;
        public static final int TYPE_FIELD_NUMBER = 2;
        public static final int URL_FIELD_NUMBER = 4;
        public static final int VERSION_FIELD_NUMBER = 9;
        private int count_;
        private long id_;
        private String type_ = "";
        private String name_ = "";
        private String url_ = "";
        private String originId_ = "";
        private String anchorId_ = "";
        private String liveId_ = "";
        private String version_ = "";

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<GiftMessage, Builder> implements GiftMessageOrBuilder {
            private Builder() {
                super(GiftMessage.DEFAULT_INSTANCE);
            }

            public Builder clearAnchorId() {
                copyOnWrite();
                ((GiftMessage) this.instance).clearAnchorId();
                return this;
            }

            public Builder clearCount() {
                copyOnWrite();
                ((GiftMessage) this.instance).clearCount();
                return this;
            }

            public Builder clearId() {
                copyOnWrite();
                ((GiftMessage) this.instance).clearId();
                return this;
            }

            public Builder clearLiveId() {
                copyOnWrite();
                ((GiftMessage) this.instance).clearLiveId();
                return this;
            }

            public Builder clearName() {
                copyOnWrite();
                ((GiftMessage) this.instance).clearName();
                return this;
            }

            public Builder clearOriginId() {
                copyOnWrite();
                ((GiftMessage) this.instance).clearOriginId();
                return this;
            }

            public Builder clearType() {
                copyOnWrite();
                ((GiftMessage) this.instance).clearType();
                return this;
            }

            public Builder clearUrl() {
                copyOnWrite();
                ((GiftMessage) this.instance).clearUrl();
                return this;
            }

            public Builder clearVersion() {
                copyOnWrite();
                ((GiftMessage) this.instance).clearVersion();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.GiftMessageOrBuilder
            public String getAnchorId() {
                return ((GiftMessage) this.instance).getAnchorId();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.GiftMessageOrBuilder
            public ByteString getAnchorIdBytes() {
                return ((GiftMessage) this.instance).getAnchorIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.GiftMessageOrBuilder
            public int getCount() {
                return ((GiftMessage) this.instance).getCount();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.GiftMessageOrBuilder
            public long getId() {
                return ((GiftMessage) this.instance).getId();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.GiftMessageOrBuilder
            public String getLiveId() {
                return ((GiftMessage) this.instance).getLiveId();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.GiftMessageOrBuilder
            public ByteString getLiveIdBytes() {
                return ((GiftMessage) this.instance).getLiveIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.GiftMessageOrBuilder
            public String getName() {
                return ((GiftMessage) this.instance).getName();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.GiftMessageOrBuilder
            public ByteString getNameBytes() {
                return ((GiftMessage) this.instance).getNameBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.GiftMessageOrBuilder
            public String getOriginId() {
                return ((GiftMessage) this.instance).getOriginId();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.GiftMessageOrBuilder
            public ByteString getOriginIdBytes() {
                return ((GiftMessage) this.instance).getOriginIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.GiftMessageOrBuilder
            public String getType() {
                return ((GiftMessage) this.instance).getType();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.GiftMessageOrBuilder
            public ByteString getTypeBytes() {
                return ((GiftMessage) this.instance).getTypeBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.GiftMessageOrBuilder
            public String getUrl() {
                return ((GiftMessage) this.instance).getUrl();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.GiftMessageOrBuilder
            public ByteString getUrlBytes() {
                return ((GiftMessage) this.instance).getUrlBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.GiftMessageOrBuilder
            public String getVersion() {
                return ((GiftMessage) this.instance).getVersion();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.GiftMessageOrBuilder
            public ByteString getVersionBytes() {
                return ((GiftMessage) this.instance).getVersionBytes();
            }

            public Builder setAnchorId(String str) {
                copyOnWrite();
                ((GiftMessage) this.instance).setAnchorId(str);
                return this;
            }

            public Builder setAnchorIdBytes(ByteString byteString) {
                copyOnWrite();
                ((GiftMessage) this.instance).setAnchorIdBytes(byteString);
                return this;
            }

            public Builder setCount(int i) {
                copyOnWrite();
                ((GiftMessage) this.instance).setCount(i);
                return this;
            }

            public Builder setId(long j) {
                copyOnWrite();
                ((GiftMessage) this.instance).setId(j);
                return this;
            }

            public Builder setLiveId(String str) {
                copyOnWrite();
                ((GiftMessage) this.instance).setLiveId(str);
                return this;
            }

            public Builder setLiveIdBytes(ByteString byteString) {
                copyOnWrite();
                ((GiftMessage) this.instance).setLiveIdBytes(byteString);
                return this;
            }

            public Builder setName(String str) {
                copyOnWrite();
                ((GiftMessage) this.instance).setName(str);
                return this;
            }

            public Builder setNameBytes(ByteString byteString) {
                copyOnWrite();
                ((GiftMessage) this.instance).setNameBytes(byteString);
                return this;
            }

            public Builder setOriginId(String str) {
                copyOnWrite();
                ((GiftMessage) this.instance).setOriginId(str);
                return this;
            }

            public Builder setOriginIdBytes(ByteString byteString) {
                copyOnWrite();
                ((GiftMessage) this.instance).setOriginIdBytes(byteString);
                return this;
            }

            public Builder setType(String str) {
                copyOnWrite();
                ((GiftMessage) this.instance).setType(str);
                return this;
            }

            public Builder setTypeBytes(ByteString byteString) {
                copyOnWrite();
                ((GiftMessage) this.instance).setTypeBytes(byteString);
                return this;
            }

            public Builder setUrl(String str) {
                copyOnWrite();
                ((GiftMessage) this.instance).setUrl(str);
                return this;
            }

            public Builder setUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((GiftMessage) this.instance).setUrlBytes(byteString);
                return this;
            }

            public Builder setVersion(String str) {
                copyOnWrite();
                ((GiftMessage) this.instance).setVersion(str);
                return this;
            }

            public Builder setVersionBytes(ByteString byteString) {
                copyOnWrite();
                ((GiftMessage) this.instance).setVersionBytes(byteString);
                return this;
            }
        }

        static {
            GiftMessage giftMessage = new GiftMessage();
            DEFAULT_INSTANCE = giftMessage;
            giftMessage.makeImmutable();
        }

        private GiftMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAnchorId() {
            this.anchorId_ = getDefaultInstance().getAnchorId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCount() {
            this.count_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearId() {
            this.id_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLiveId() {
            this.liveId_ = getDefaultInstance().getLiveId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearName() {
            this.name_ = getDefaultInstance().getName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOriginId() {
            this.originId_ = getDefaultInstance().getOriginId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearType() {
            this.type_ = getDefaultInstance().getType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUrl() {
            this.url_ = getDefaultInstance().getUrl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVersion() {
            this.version_ = getDefaultInstance().getVersion();
        }

        public static GiftMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(GiftMessage giftMessage) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(giftMessage);
        }

        public static GiftMessage parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (GiftMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GiftMessage parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (GiftMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<GiftMessage> parser() {
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.anchorId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCount(int i) {
            this.count_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setId(long j) {
            this.id_ = j;
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
        public void setOriginId(String str) {
            str.getClass();
            this.originId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOriginIdBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.originId_ = byteString.toStringUtf8();
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

        /* JADX INFO: Access modifiers changed from: private */
        public void setUrl(String str) {
            str.getClass();
            this.url_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUrlBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.url_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVersion(String str) {
            str.getClass();
            this.version_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVersionBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.version_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C45911.f16674xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new GiftMessage();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    GiftMessage giftMessage = (GiftMessage) obj2;
                    long j = this.id_;
                    boolean z2 = j != 0;
                    long j2 = giftMessage.id_;
                    this.id_ = interfaceC3409h.mo17055i(z2, j, j2 != 0, j2);
                    this.type_ = interfaceC3409h.mo17052f(!this.type_.isEmpty(), this.type_, !giftMessage.type_.isEmpty(), giftMessage.type_);
                    this.name_ = interfaceC3409h.mo17052f(!this.name_.isEmpty(), this.name_, !giftMessage.name_.isEmpty(), giftMessage.name_);
                    this.url_ = interfaceC3409h.mo17052f(!this.url_.isEmpty(), this.url_, !giftMessage.url_.isEmpty(), giftMessage.url_);
                    this.originId_ = interfaceC3409h.mo17052f(!this.originId_.isEmpty(), this.originId_, !giftMessage.originId_.isEmpty(), giftMessage.originId_);
                    int i = this.count_;
                    boolean z3 = i != 0;
                    int i2 = giftMessage.count_;
                    this.count_ = interfaceC3409h.mo17051e(z3, i, i2 != 0, i2);
                    this.anchorId_ = interfaceC3409h.mo17052f(!this.anchorId_.isEmpty(), this.anchorId_, !giftMessage.anchorId_.isEmpty(), giftMessage.anchorId_);
                    this.liveId_ = interfaceC3409h.mo17052f(!this.liveId_.isEmpty(), this.liveId_, !giftMessage.liveId_.isEmpty(), giftMessage.liveId_);
                    this.version_ = interfaceC3409h.mo17052f(!this.version_.isEmpty(), this.version_, !giftMessage.version_.isEmpty(), giftMessage.version_);
                    GeneratedMessageLite.C3408g c3408g = GeneratedMessageLite.C3408g.INSTANCE;
                    return this;
                case 6:
                    C3430e c3430e = (C3430e) obj;
                    while (!z) {
                        try {
                            int iM17171M = c3430e.m17171M();
                            if (iM17171M != 0) {
                                if (iM17171M == 8) {
                                    this.id_ = c3430e.m17197v();
                                } else if (iM17171M == 18) {
                                    this.type_ = c3430e.m17170L();
                                } else if (iM17171M == 26) {
                                    this.name_ = c3430e.m17170L();
                                } else if (iM17171M == 34) {
                                    this.url_ = c3430e.m17170L();
                                } else if (iM17171M == 42) {
                                    this.originId_ = c3430e.m17170L();
                                } else if (iM17171M == 48) {
                                    this.count_ = c3430e.m17172N();
                                } else if (iM17171M == 58) {
                                    this.anchorId_ = c3430e.m17170L();
                                } else if (iM17171M == 66) {
                                    this.liveId_ = c3430e.m17170L();
                                } else if (iM17171M == 74) {
                                    this.version_ = c3430e.m17170L();
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
                        synchronized (GiftMessage.class) {
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

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.GiftMessageOrBuilder
        public String getAnchorId() {
            return this.anchorId_;
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.GiftMessageOrBuilder
        public ByteString getAnchorIdBytes() {
            return ByteString.copyFromUtf8(this.anchorId_);
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.GiftMessageOrBuilder
        public int getCount() {
            return this.count_;
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.GiftMessageOrBuilder
        public long getId() {
            return this.id_;
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.GiftMessageOrBuilder
        public String getLiveId() {
            return this.liveId_;
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.GiftMessageOrBuilder
        public ByteString getLiveIdBytes() {
            return ByteString.copyFromUtf8(this.liveId_);
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.GiftMessageOrBuilder
        public String getName() {
            return this.name_;
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.GiftMessageOrBuilder
        public ByteString getNameBytes() {
            return ByteString.copyFromUtf8(this.name_);
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.GiftMessageOrBuilder
        public String getOriginId() {
            return this.originId_;
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.GiftMessageOrBuilder
        public ByteString getOriginIdBytes() {
            return ByteString.copyFromUtf8(this.originId_);
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            long j = this.id_;
            int iM16986v = j != 0 ? CodedOutputStream.m16986v(1, j) : 0;
            if (!this.type_.isEmpty()) {
                iM16986v += CodedOutputStream.m16956K(2, getType());
            }
            if (!this.name_.isEmpty()) {
                iM16986v += CodedOutputStream.m16956K(3, getName());
            }
            if (!this.url_.isEmpty()) {
                iM16986v += CodedOutputStream.m16956K(4, getUrl());
            }
            if (!this.originId_.isEmpty()) {
                iM16986v += CodedOutputStream.m16956K(5, getOriginId());
            }
            int i2 = this.count_;
            if (i2 != 0) {
                iM16986v += CodedOutputStream.m16959N(6, i2);
            }
            if (!this.anchorId_.isEmpty()) {
                iM16986v += CodedOutputStream.m16956K(7, getAnchorId());
            }
            if (!this.liveId_.isEmpty()) {
                iM16986v += CodedOutputStream.m16956K(8, getLiveId());
            }
            if (!this.version_.isEmpty()) {
                iM16986v += CodedOutputStream.m16956K(9, getVersion());
            }
            this.memoizedSerializedSize = iM16986v;
            return iM16986v;
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.GiftMessageOrBuilder
        public String getType() {
            return this.type_;
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.GiftMessageOrBuilder
        public ByteString getTypeBytes() {
            return ByteString.copyFromUtf8(this.type_);
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.GiftMessageOrBuilder
        public String getUrl() {
            return this.url_;
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.GiftMessageOrBuilder
        public ByteString getUrlBytes() {
            return ByteString.copyFromUtf8(this.url_);
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.GiftMessageOrBuilder
        public String getVersion() {
            return this.version_;
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.GiftMessageOrBuilder
        public ByteString getVersionBytes() {
            return ByteString.copyFromUtf8(this.version_);
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            long j = this.id_;
            if (j != 0) {
                codedOutputStream.m17027u0(1, j);
            }
            if (!this.type_.isEmpty()) {
                codedOutputStream.mo16994D0(2, getType());
            }
            if (!this.name_.isEmpty()) {
                codedOutputStream.mo16994D0(3, getName());
            }
            if (!this.url_.isEmpty()) {
                codedOutputStream.mo16994D0(4, getUrl());
            }
            if (!this.originId_.isEmpty()) {
                codedOutputStream.mo16994D0(5, getOriginId());
            }
            int i = this.count_;
            if (i != 0) {
                codedOutputStream.mo16997G0(6, i);
            }
            if (!this.anchorId_.isEmpty()) {
                codedOutputStream.mo16994D0(7, getAnchorId());
            }
            if (!this.liveId_.isEmpty()) {
                codedOutputStream.mo16994D0(8, getLiveId());
            }
            if (this.version_.isEmpty()) {
                return;
            }
            codedOutputStream.mo16994D0(9, getVersion());
        }

        public static GiftMessage parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (GiftMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static GiftMessage parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (GiftMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        public static GiftMessage parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (GiftMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static GiftMessage parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (GiftMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static GiftMessage parseFrom(InputStream inputStream) throws IOException {
            return (GiftMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GiftMessage parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (GiftMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static GiftMessage parseFrom(C3430e c3430e) throws IOException {
            return (GiftMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static GiftMessage parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (GiftMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }

    public static final class HierarchyMessage extends GeneratedMessageLite<HierarchyMessage, Builder> implements HierarchyMessageOrBuilder {
        private static final HierarchyMessage DEFAULT_INSTANCE;
        public static final int GRADE_FIELD_NUMBER = 1;
        public static final int IMAGEURL_FIELD_NUMBER = 2;
        private static volatile ng60<HierarchyMessage> PARSER;
        private long grade_;
        private String imageUrl_ = "";

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<HierarchyMessage, Builder> implements HierarchyMessageOrBuilder {
            private Builder() {
                super(HierarchyMessage.DEFAULT_INSTANCE);
            }

            public Builder clearGrade() {
                copyOnWrite();
                ((HierarchyMessage) this.instance).clearGrade();
                return this;
            }

            public Builder clearImageUrl() {
                copyOnWrite();
                ((HierarchyMessage) this.instance).clearImageUrl();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.HierarchyMessageOrBuilder
            public long getGrade() {
                return ((HierarchyMessage) this.instance).getGrade();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.HierarchyMessageOrBuilder
            public String getImageUrl() {
                return ((HierarchyMessage) this.instance).getImageUrl();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.HierarchyMessageOrBuilder
            public ByteString getImageUrlBytes() {
                return ((HierarchyMessage) this.instance).getImageUrlBytes();
            }

            public Builder setGrade(long j) {
                copyOnWrite();
                ((HierarchyMessage) this.instance).setGrade(j);
                return this;
            }

            public Builder setImageUrl(String str) {
                copyOnWrite();
                ((HierarchyMessage) this.instance).setImageUrl(str);
                return this;
            }

            public Builder setImageUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((HierarchyMessage) this.instance).setImageUrlBytes(byteString);
                return this;
            }
        }

        static {
            HierarchyMessage hierarchyMessage = new HierarchyMessage();
            DEFAULT_INSTANCE = hierarchyMessage;
            hierarchyMessage.makeImmutable();
        }

        private HierarchyMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGrade() {
            this.grade_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearImageUrl() {
            this.imageUrl_ = getDefaultInstance().getImageUrl();
        }

        public static HierarchyMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(HierarchyMessage hierarchyMessage) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(hierarchyMessage);
        }

        public static HierarchyMessage parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (HierarchyMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static HierarchyMessage parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (HierarchyMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<HierarchyMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGrade(long j) {
            this.grade_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setImageUrl(String str) {
            str.getClass();
            this.imageUrl_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setImageUrlBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.imageUrl_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C45911.f16674xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new HierarchyMessage();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    HierarchyMessage hierarchyMessage = (HierarchyMessage) obj2;
                    long j = this.grade_;
                    boolean z2 = j != 0;
                    long j2 = hierarchyMessage.grade_;
                    this.grade_ = interfaceC3409h.mo17055i(z2, j, j2 != 0, j2);
                    this.imageUrl_ = interfaceC3409h.mo17052f(!this.imageUrl_.isEmpty(), this.imageUrl_, !hierarchyMessage.imageUrl_.isEmpty(), hierarchyMessage.imageUrl_);
                    GeneratedMessageLite.C3408g c3408g = GeneratedMessageLite.C3408g.INSTANCE;
                    return this;
                case 6:
                    C3430e c3430e = (C3430e) obj;
                    while (!z) {
                        try {
                            int iM17171M = c3430e.m17171M();
                            if (iM17171M != 0) {
                                if (iM17171M == 8) {
                                    this.grade_ = c3430e.m17197v();
                                } else if (iM17171M == 18) {
                                    this.imageUrl_ = c3430e.m17170L();
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
                        synchronized (HierarchyMessage.class) {
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

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.HierarchyMessageOrBuilder
        public long getGrade() {
            return this.grade_;
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.HierarchyMessageOrBuilder
        public String getImageUrl() {
            return this.imageUrl_;
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.HierarchyMessageOrBuilder
        public ByteString getImageUrlBytes() {
            return ByteString.copyFromUtf8(this.imageUrl_);
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            long j = this.grade_;
            int iM16986v = j != 0 ? CodedOutputStream.m16986v(1, j) : 0;
            if (!this.imageUrl_.isEmpty()) {
                iM16986v += CodedOutputStream.m16956K(2, getImageUrl());
            }
            this.memoizedSerializedSize = iM16986v;
            return iM16986v;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            long j = this.grade_;
            if (j != 0) {
                codedOutputStream.m17027u0(1, j);
            }
            if (this.imageUrl_.isEmpty()) {
                return;
            }
            codedOutputStream.mo16994D0(2, getImageUrl());
        }

        public static HierarchyMessage parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (HierarchyMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static HierarchyMessage parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (HierarchyMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        public static HierarchyMessage parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (HierarchyMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static HierarchyMessage parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (HierarchyMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static HierarchyMessage parseFrom(InputStream inputStream) throws IOException {
            return (HierarchyMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static HierarchyMessage parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (HierarchyMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static HierarchyMessage parseFrom(C3430e c3430e) throws IOException {
            return (HierarchyMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static HierarchyMessage parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (HierarchyMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }

    public static final class LiveBackgroundColorConfig extends GeneratedMessageLite<LiveBackgroundColorConfig, Builder> implements LiveBackgroundColorConfigOrBuilder {
        public static final int COLORS_FIELD_NUMBER = 2;
        private static final LiveBackgroundColorConfig DEFAULT_INSTANCE;
        public static final int GRADIENTDIRECTION_FIELD_NUMBER = 1;
        private static volatile ng60<LiveBackgroundColorConfig> PARSER = null;
        public static final int TRANSPARENCY_FIELD_NUMBER = 3;
        private int bitField0_;
        private C3437l.h<String> colors_ = GeneratedMessageLite.emptyProtobufList();
        private long gradientDirection_;
        private long transparency_;

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<LiveBackgroundColorConfig, Builder> implements LiveBackgroundColorConfigOrBuilder {
            private Builder() {
                super(LiveBackgroundColorConfig.DEFAULT_INSTANCE);
            }

            public Builder addAllColors(Iterable<String> iterable) {
                copyOnWrite();
                ((LiveBackgroundColorConfig) this.instance).addAllColors(iterable);
                return this;
            }

            public Builder addColors(String str) {
                copyOnWrite();
                ((LiveBackgroundColorConfig) this.instance).addColors(str);
                return this;
            }

            public Builder addColorsBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveBackgroundColorConfig) this.instance).addColorsBytes(byteString);
                return this;
            }

            public Builder clearColors() {
                copyOnWrite();
                ((LiveBackgroundColorConfig) this.instance).clearColors();
                return this;
            }

            public Builder clearGradientDirection() {
                copyOnWrite();
                ((LiveBackgroundColorConfig) this.instance).clearGradientDirection();
                return this;
            }

            public Builder clearTransparency() {
                copyOnWrite();
                ((LiveBackgroundColorConfig) this.instance).clearTransparency();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveBackgroundColorConfigOrBuilder
            public String getColors(int i) {
                return ((LiveBackgroundColorConfig) this.instance).getColors(i);
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveBackgroundColorConfigOrBuilder
            public ByteString getColorsBytes(int i) {
                return ((LiveBackgroundColorConfig) this.instance).getColorsBytes(i);
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveBackgroundColorConfigOrBuilder
            public int getColorsCount() {
                return ((LiveBackgroundColorConfig) this.instance).getColorsCount();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveBackgroundColorConfigOrBuilder
            public List<String> getColorsList() {
                return Collections.unmodifiableList(((LiveBackgroundColorConfig) this.instance).getColorsList());
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveBackgroundColorConfigOrBuilder
            public long getGradientDirection() {
                return ((LiveBackgroundColorConfig) this.instance).getGradientDirection();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveBackgroundColorConfigOrBuilder
            public long getTransparency() {
                return ((LiveBackgroundColorConfig) this.instance).getTransparency();
            }

            public Builder setColors(int i, String str) {
                copyOnWrite();
                ((LiveBackgroundColorConfig) this.instance).setColors(i, str);
                return this;
            }

            public Builder setGradientDirection(long j) {
                copyOnWrite();
                ((LiveBackgroundColorConfig) this.instance).setGradientDirection(j);
                return this;
            }

            public Builder setTransparency(long j) {
                copyOnWrite();
                ((LiveBackgroundColorConfig) this.instance).setTransparency(j);
                return this;
            }
        }

        static {
            LiveBackgroundColorConfig liveBackgroundColorConfig = new LiveBackgroundColorConfig();
            DEFAULT_INSTANCE = liveBackgroundColorConfig;
            liveBackgroundColorConfig.makeImmutable();
        }

        private LiveBackgroundColorConfig() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllColors(Iterable<String> iterable) {
            ensureColorsIsMutable();
            AbstractC3426a.addAll(iterable, this.colors_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addColors(String str) {
            str.getClass();
            ensureColorsIsMutable();
            this.colors_.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addColorsBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            ensureColorsIsMutable();
            this.colors_.add(byteString.toStringUtf8());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearColors() {
            this.colors_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGradientDirection() {
            this.gradientDirection_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTransparency() {
            this.transparency_ = 0L;
        }

        private void ensureColorsIsMutable() {
            if (this.colors_.mo17140q()) {
                return;
            }
            this.colors_ = GeneratedMessageLite.mutableCopy(this.colors_);
        }

        public static LiveBackgroundColorConfig getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(LiveBackgroundColorConfig liveBackgroundColorConfig) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(liveBackgroundColorConfig);
        }

        public static LiveBackgroundColorConfig parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (LiveBackgroundColorConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LiveBackgroundColorConfig parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (LiveBackgroundColorConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<LiveBackgroundColorConfig> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setColors(int i, String str) {
            str.getClass();
            ensureColorsIsMutable();
            this.colors_.set(i, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGradientDirection(long j) {
            this.gradientDirection_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTransparency(long j) {
            this.transparency_ = j;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C45911.f16674xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new LiveBackgroundColorConfig();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.colors_.mo17139n();
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    LiveBackgroundColorConfig liveBackgroundColorConfig = (LiveBackgroundColorConfig) obj2;
                    long j = this.gradientDirection_;
                    boolean z2 = j != 0;
                    long j2 = liveBackgroundColorConfig.gradientDirection_;
                    this.gradientDirection_ = interfaceC3409h.mo17055i(z2, j, j2 != 0, j2);
                    this.colors_ = interfaceC3409h.mo17053g(this.colors_, liveBackgroundColorConfig.colors_);
                    boolean z3 = false;
                    long j3 = this.transparency_;
                    if (j3 != 0) {
                        z3 = true;
                    }
                    long j4 = liveBackgroundColorConfig.transparency_;
                    this.transparency_ = interfaceC3409h.mo17055i(z3, j3, j4 != 0, j4);
                    if (interfaceC3409h == GeneratedMessageLite.C3408g.INSTANCE) {
                        this.bitField0_ |= liveBackgroundColorConfig.bitField0_;
                    }
                    return this;
                case 6:
                    C3430e c3430e = (C3430e) obj;
                    while (!z) {
                        try {
                            int iM17171M = c3430e.m17171M();
                            if (iM17171M != 0) {
                                if (iM17171M == 8) {
                                    this.gradientDirection_ = c3430e.m17197v();
                                } else if (iM17171M == 18) {
                                    String strM17170L = c3430e.m17170L();
                                    if (!this.colors_.mo17140q()) {
                                        this.colors_ = GeneratedMessageLite.mutableCopy(this.colors_);
                                    }
                                    this.colors_.add(strM17170L);
                                } else if (iM17171M == 24) {
                                    this.transparency_ = c3430e.m17197v();
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
                        synchronized (LiveBackgroundColorConfig.class) {
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

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveBackgroundColorConfigOrBuilder
        public String getColors(int i) {
            return this.colors_.get(i);
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveBackgroundColorConfigOrBuilder
        public ByteString getColorsBytes(int i) {
            return ByteString.copyFromUtf8(this.colors_.get(i));
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveBackgroundColorConfigOrBuilder
        public int getColorsCount() {
            return this.colors_.size();
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveBackgroundColorConfigOrBuilder
        public List<String> getColorsList() {
            return this.colors_;
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveBackgroundColorConfigOrBuilder
        public long getGradientDirection() {
            return this.gradientDirection_;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            long j = this.gradientDirection_;
            int iM16986v = j != 0 ? CodedOutputStream.m16986v(1, j) : 0;
            int iM16957L = 0;
            for (int i2 = 0; i2 < this.colors_.size(); i2++) {
                iM16957L += CodedOutputStream.m16957L(this.colors_.get(i2));
            }
            int size = iM16986v + iM16957L + getColorsList().size();
            long j2 = this.transparency_;
            if (j2 != 0) {
                size += CodedOutputStream.m16986v(3, j2);
            }
            this.memoizedSerializedSize = size;
            return size;
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveBackgroundColorConfigOrBuilder
        public long getTransparency() {
            return this.transparency_;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            long j = this.gradientDirection_;
            if (j != 0) {
                codedOutputStream.m17027u0(1, j);
            }
            for (int i = 0; i < this.colors_.size(); i++) {
                codedOutputStream.mo16994D0(2, this.colors_.get(i));
            }
            long j2 = this.transparency_;
            if (j2 != 0) {
                codedOutputStream.m17027u0(3, j2);
            }
        }

        public static LiveBackgroundColorConfig parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (LiveBackgroundColorConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static LiveBackgroundColorConfig parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (LiveBackgroundColorConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        public static LiveBackgroundColorConfig parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (LiveBackgroundColorConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static LiveBackgroundColorConfig parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (LiveBackgroundColorConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static LiveBackgroundColorConfig parseFrom(InputStream inputStream) throws IOException {
            return (LiveBackgroundColorConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LiveBackgroundColorConfig parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (LiveBackgroundColorConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static LiveBackgroundColorConfig parseFrom(C3430e c3430e) throws IOException {
            return (LiveBackgroundColorConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static LiveBackgroundColorConfig parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (LiveBackgroundColorConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }

    public static final class LiveChatMessage extends GeneratedMessageLite<LiveChatMessage, Builder> implements LiveChatMessageOrBuilder {
        public static final int ACTION_FIELD_NUMBER = 7;
        public static final int ANCHORID_FIELD_NUMBER = 22;
        public static final int CHATSHADINGCONFIG_FIELD_NUMBER = 18;
        public static final int CREATEDTIME_FIELD_NUMBER = 13;
        private static final LiveChatMessage DEFAULT_INSTANCE;
        public static final int EXTINFO_FIELD_NUMBER = 17;
        public static final int FAKEID_FIELD_NUMBER = 19;
        public static final int FAKENAME_FIELD_NUMBER = 21;
        public static final int GIFTTARGETUSERID_FIELD_NUMBER = 23;
        public static final int GIFT_FIELD_NUMBER = 8;
        public static final int H5_FIELD_NUMBER = 9;
        public static final int HIERARCHY_FIELD_NUMBER = 14;
        public static final int LIVEID_FIELD_NUMBER = 11;
        public static final int LIVEMODE_FIELD_NUMBER = 25;
        public static final int LIVEREVENUECAMPAIGNVIP_FIELD_NUMBER = 15;
        public static final int MEDAL_FIELD_NUMBER = 12;
        public static final int MSGID_FIELD_NUMBER = 20;
        private static volatile ng60<LiveChatMessage> PARSER = null;
        public static final int PRESEQ_FIELD_NUMBER = 27;
        public static final int PRETIMESTAMP_FIELD_NUMBER = 28;
        public static final int ROOMID_FIELD_NUMBER = 1;
        public static final int ROOMTYPE_FIELD_NUMBER = 16;
        public static final int SEQ_FIELD_NUMBER = 2;
        public static final int SHAREDVOICELIVEINFO_FIELD_NUMBER = 24;
        public static final int SOURCE_FIELD_NUMBER = 32;
        public static final int STARLIGHTHIERARCHY_FIELD_NUMBER = 33;
        public static final int TEMPLATETYPE_FIELD_NUMBER = 26;
        public static final int TEMPLATE_FIELD_NUMBER = 10;
        public static final int TYPE_FIELD_NUMBER = 3;
        public static final int USERIDENTITY_FIELD_NUMBER = 29;
        public static final int USERID_FIELD_NUMBER = 4;
        public static final int USERNAME_FIELD_NUMBER = 5;
        public static final int VALUE_FIELD_NUMBER = 6;
        private int action_;
        private LiveChatShadingConfig chatShadingConfig_;
        private long createdTime_;
        private LiveChatMessageExtInfo extInfo_;
        private GiftMessage gift_;
        private HierarchyMessage hierarchy_;
        private LiveRevenueCampaignVip liveRevenueCampaignVip_;
        private MedalMessage medal_;
        private long preSeq_;
        private long preTimestamp_;
        private int roomType_;
        private long seq_;
        private SharedVoiceLiveInfo sharedVoiceLiveInfo_;
        private HierarchyMessage starlightHierarchy_;
        private Template.TemplateData template_;
        private int type_;
        private String roomId_ = "";
        private String userId_ = "";
        private String username_ = "";
        private String value_ = "";
        private String h5_ = "";
        private String liveId_ = "";
        private String fakeId_ = "";
        private String msgId_ = "";
        private String fakeName_ = "";
        private String anchorId_ = "";
        private String giftTargetUserId_ = "";
        private String liveMode_ = "";
        private String templateType_ = "";
        private String userIdentity_ = "";
        private String source_ = "";

        static {
            LiveChatMessage liveChatMessage = new LiveChatMessage();
            DEFAULT_INSTANCE = liveChatMessage;
            liveChatMessage.makeImmutable();
        }

        private LiveChatMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAction() {
            this.action_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAnchorId() {
            this.anchorId_ = getDefaultInstance().getAnchorId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearChatShadingConfig() {
            this.chatShadingConfig_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCreatedTime() {
            this.createdTime_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearExtInfo() {
            this.extInfo_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFakeId() {
            this.fakeId_ = getDefaultInstance().getFakeId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFakeName() {
            this.fakeName_ = getDefaultInstance().getFakeName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGift() {
            this.gift_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGiftTargetUserId() {
            this.giftTargetUserId_ = getDefaultInstance().getGiftTargetUserId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearH5() {
            this.h5_ = getDefaultInstance().getH5();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHierarchy() {
            this.hierarchy_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLiveId() {
            this.liveId_ = getDefaultInstance().getLiveId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLiveMode() {
            this.liveMode_ = getDefaultInstance().getLiveMode();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLiveRevenueCampaignVip() {
            this.liveRevenueCampaignVip_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMedal() {
            this.medal_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMsgId() {
            this.msgId_ = getDefaultInstance().getMsgId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPreSeq() {
            this.preSeq_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPreTimestamp() {
            this.preTimestamp_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRoomId() {
            this.roomId_ = getDefaultInstance().getRoomId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRoomType() {
            this.roomType_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSeq() {
            this.seq_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSharedVoiceLiveInfo() {
            this.sharedVoiceLiveInfo_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSource() {
            this.source_ = getDefaultInstance().getSource();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStarlightHierarchy() {
            this.starlightHierarchy_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTemplate() {
            this.template_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTemplateType() {
            this.templateType_ = getDefaultInstance().getTemplateType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearType() {
            this.type_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUserId() {
            this.userId_ = getDefaultInstance().getUserId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUserIdentity() {
            this.userIdentity_ = getDefaultInstance().getUserIdentity();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUsername() {
            this.username_ = getDefaultInstance().getUsername();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearValue() {
            this.value_ = getDefaultInstance().getValue();
        }

        public static LiveChatMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeChatShadingConfig(LiveChatShadingConfig liveChatShadingConfig) {
            LiveChatShadingConfig liveChatShadingConfig2 = this.chatShadingConfig_;
            if (liveChatShadingConfig2 == null || liveChatShadingConfig2 == LiveChatShadingConfig.getDefaultInstance()) {
                this.chatShadingConfig_ = liveChatShadingConfig;
            } else {
                this.chatShadingConfig_ = LiveChatShadingConfig.newBuilder(this.chatShadingConfig_).mergeFrom(liveChatShadingConfig).buildPartial();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeExtInfo(LiveChatMessageExtInfo liveChatMessageExtInfo) {
            LiveChatMessageExtInfo liveChatMessageExtInfo2 = this.extInfo_;
            if (liveChatMessageExtInfo2 == null || liveChatMessageExtInfo2 == LiveChatMessageExtInfo.getDefaultInstance()) {
                this.extInfo_ = liveChatMessageExtInfo;
            } else {
                this.extInfo_ = LiveChatMessageExtInfo.newBuilder(this.extInfo_).mergeFrom(liveChatMessageExtInfo).buildPartial();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeGift(GiftMessage giftMessage) {
            GiftMessage giftMessage2 = this.gift_;
            if (giftMessage2 == null || giftMessage2 == GiftMessage.getDefaultInstance()) {
                this.gift_ = giftMessage;
            } else {
                this.gift_ = GiftMessage.newBuilder(this.gift_).mergeFrom(giftMessage).buildPartial();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeHierarchy(HierarchyMessage hierarchyMessage) {
            HierarchyMessage hierarchyMessage2 = this.hierarchy_;
            if (hierarchyMessage2 == null || hierarchyMessage2 == HierarchyMessage.getDefaultInstance()) {
                this.hierarchy_ = hierarchyMessage;
            } else {
                this.hierarchy_ = HierarchyMessage.newBuilder(this.hierarchy_).mergeFrom(hierarchyMessage).buildPartial();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeLiveRevenueCampaignVip(LiveRevenueCampaignVip liveRevenueCampaignVip) {
            LiveRevenueCampaignVip liveRevenueCampaignVip2 = this.liveRevenueCampaignVip_;
            if (liveRevenueCampaignVip2 == null || liveRevenueCampaignVip2 == LiveRevenueCampaignVip.getDefaultInstance()) {
                this.liveRevenueCampaignVip_ = liveRevenueCampaignVip;
            } else {
                this.liveRevenueCampaignVip_ = LiveRevenueCampaignVip.newBuilder(this.liveRevenueCampaignVip_).mergeFrom(liveRevenueCampaignVip).buildPartial();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeMedal(MedalMessage medalMessage) {
            MedalMessage medalMessage2 = this.medal_;
            if (medalMessage2 == null || medalMessage2 == MedalMessage.getDefaultInstance()) {
                this.medal_ = medalMessage;
            } else {
                this.medal_ = MedalMessage.newBuilder(this.medal_).mergeFrom(medalMessage).buildPartial();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeSharedVoiceLiveInfo(SharedVoiceLiveInfo sharedVoiceLiveInfo) {
            SharedVoiceLiveInfo sharedVoiceLiveInfo2 = this.sharedVoiceLiveInfo_;
            if (sharedVoiceLiveInfo2 == null || sharedVoiceLiveInfo2 == SharedVoiceLiveInfo.getDefaultInstance()) {
                this.sharedVoiceLiveInfo_ = sharedVoiceLiveInfo;
            } else {
                this.sharedVoiceLiveInfo_ = SharedVoiceLiveInfo.newBuilder(this.sharedVoiceLiveInfo_).mergeFrom(sharedVoiceLiveInfo).buildPartial();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeStarlightHierarchy(HierarchyMessage hierarchyMessage) {
            HierarchyMessage hierarchyMessage2 = this.starlightHierarchy_;
            if (hierarchyMessage2 == null || hierarchyMessage2 == HierarchyMessage.getDefaultInstance()) {
                this.starlightHierarchy_ = hierarchyMessage;
            } else {
                this.starlightHierarchy_ = HierarchyMessage.newBuilder(this.starlightHierarchy_).mergeFrom(hierarchyMessage).buildPartial();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeTemplate(Template.TemplateData templateData) {
            Template.TemplateData templateData2 = this.template_;
            if (templateData2 == null || templateData2 == Template.TemplateData.getDefaultInstance()) {
                this.template_ = templateData;
            } else {
                this.template_ = Template.TemplateData.newBuilder(this.template_).mergeFrom(templateData).buildPartial();
            }
        }

        public static Builder newBuilder(LiveChatMessage liveChatMessage) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(liveChatMessage);
        }

        public static LiveChatMessage parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (LiveChatMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LiveChatMessage parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (LiveChatMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<LiveChatMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAction(Action action) {
            action.getClass();
            this.action_ = action.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setActionValue(int i) {
            this.action_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAnchorId(String str) {
            str.getClass();
            this.anchorId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAnchorIdBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.anchorId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setChatShadingConfig(LiveChatShadingConfig.Builder builder) {
            this.chatShadingConfig_ = builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCreatedTime(long j) {
            this.createdTime_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setExtInfo(LiveChatMessageExtInfo.Builder builder) {
            this.extInfo_ = builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFakeId(String str) {
            str.getClass();
            this.fakeId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFakeIdBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.fakeId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFakeName(String str) {
            str.getClass();
            this.fakeName_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFakeNameBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.fakeName_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGift(GiftMessage.Builder builder) {
            this.gift_ = builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGiftTargetUserId(String str) {
            str.getClass();
            this.giftTargetUserId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGiftTargetUserIdBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.giftTargetUserId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setH5(String str) {
            str.getClass();
            this.h5_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setH5Bytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.h5_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHierarchy(HierarchyMessage.Builder builder) {
            this.hierarchy_ = builder.build();
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
        public void setLiveMode(String str) {
            str.getClass();
            this.liveMode_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLiveModeBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.liveMode_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLiveRevenueCampaignVip(LiveRevenueCampaignVip.Builder builder) {
            this.liveRevenueCampaignVip_ = builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMedal(MedalMessage.Builder builder) {
            this.medal_ = builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMsgId(String str) {
            str.getClass();
            this.msgId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMsgIdBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.msgId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPreSeq(long j) {
            this.preSeq_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPreTimestamp(long j) {
            this.preTimestamp_ = j;
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
        public void setRoomType(RoomType roomType) {
            roomType.getClass();
            this.roomType_ = roomType.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRoomTypeValue(int i) {
            this.roomType_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSeq(long j) {
            this.seq_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSharedVoiceLiveInfo(SharedVoiceLiveInfo.Builder builder) {
            this.sharedVoiceLiveInfo_ = builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSource(String str) {
            str.getClass();
            this.source_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSourceBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.source_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStarlightHierarchy(HierarchyMessage.Builder builder) {
            this.starlightHierarchy_ = builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTemplate(Template.TemplateData.Builder builder) {
            this.template_ = builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTemplateType(String str) {
            str.getClass();
            this.templateType_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTemplateTypeBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.templateType_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setType(LiveChatMessageType liveChatMessageType) {
            liveChatMessageType.getClass();
            this.type_ = liveChatMessageType.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTypeValue(int i) {
            this.type_ = i;
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
        public void setUserIdentity(String str) {
            str.getClass();
            this.userIdentity_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserIdentityBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.userIdentity_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUsername(String str) {
            str.getClass();
            this.username_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUsernameBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.username_ = byteString.toStringUtf8();
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
            switch (C45911.f16674xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new LiveChatMessage();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    LiveChatMessage liveChatMessage = (LiveChatMessage) obj2;
                    this.roomId_ = interfaceC3409h.mo17052f(!this.roomId_.isEmpty(), this.roomId_, !liveChatMessage.roomId_.isEmpty(), liveChatMessage.roomId_);
                    long j = this.seq_;
                    boolean z2 = j != 0;
                    long j2 = liveChatMessage.seq_;
                    this.seq_ = interfaceC3409h.mo17055i(z2, j, j2 != 0, j2);
                    int i = this.type_;
                    boolean z3 = i != 0;
                    int i2 = liveChatMessage.type_;
                    this.type_ = interfaceC3409h.mo17051e(z3, i, i2 != 0, i2);
                    this.userId_ = interfaceC3409h.mo17052f(!this.userId_.isEmpty(), this.userId_, !liveChatMessage.userId_.isEmpty(), liveChatMessage.userId_);
                    this.username_ = interfaceC3409h.mo17052f(!this.username_.isEmpty(), this.username_, !liveChatMessage.username_.isEmpty(), liveChatMessage.username_);
                    this.value_ = interfaceC3409h.mo17052f(!this.value_.isEmpty(), this.value_, !liveChatMessage.value_.isEmpty(), liveChatMessage.value_);
                    int i3 = this.action_;
                    boolean z4 = i3 != 0;
                    int i4 = liveChatMessage.action_;
                    this.action_ = interfaceC3409h.mo17051e(z4, i3, i4 != 0, i4);
                    this.gift_ = (GiftMessage) interfaceC3409h.mo17061o(this.gift_, liveChatMessage.gift_);
                    this.h5_ = interfaceC3409h.mo17052f(!this.h5_.isEmpty(), this.h5_, !liveChatMessage.h5_.isEmpty(), liveChatMessage.h5_);
                    this.template_ = (Template.TemplateData) interfaceC3409h.mo17061o(this.template_, liveChatMessage.template_);
                    this.liveId_ = interfaceC3409h.mo17052f(!this.liveId_.isEmpty(), this.liveId_, !liveChatMessage.liveId_.isEmpty(), liveChatMessage.liveId_);
                    this.medal_ = (MedalMessage) interfaceC3409h.mo17061o(this.medal_, liveChatMessage.medal_);
                    long j3 = this.createdTime_;
                    boolean z5 = j3 != 0;
                    long j4 = liveChatMessage.createdTime_;
                    this.createdTime_ = interfaceC3409h.mo17055i(z5, j3, j4 != 0, j4);
                    this.hierarchy_ = (HierarchyMessage) interfaceC3409h.mo17061o(this.hierarchy_, liveChatMessage.hierarchy_);
                    this.liveRevenueCampaignVip_ = (LiveRevenueCampaignVip) interfaceC3409h.mo17061o(this.liveRevenueCampaignVip_, liveChatMessage.liveRevenueCampaignVip_);
                    int i5 = this.roomType_;
                    boolean z6 = i5 != 0;
                    int i6 = liveChatMessage.roomType_;
                    this.roomType_ = interfaceC3409h.mo17051e(z6, i5, i6 != 0, i6);
                    this.extInfo_ = (LiveChatMessageExtInfo) interfaceC3409h.mo17061o(this.extInfo_, liveChatMessage.extInfo_);
                    this.chatShadingConfig_ = (LiveChatShadingConfig) interfaceC3409h.mo17061o(this.chatShadingConfig_, liveChatMessage.chatShadingConfig_);
                    this.fakeId_ = interfaceC3409h.mo17052f(!this.fakeId_.isEmpty(), this.fakeId_, !liveChatMessage.fakeId_.isEmpty(), liveChatMessage.fakeId_);
                    this.msgId_ = interfaceC3409h.mo17052f(!this.msgId_.isEmpty(), this.msgId_, !liveChatMessage.msgId_.isEmpty(), liveChatMessage.msgId_);
                    this.fakeName_ = interfaceC3409h.mo17052f(!this.fakeName_.isEmpty(), this.fakeName_, !liveChatMessage.fakeName_.isEmpty(), liveChatMessage.fakeName_);
                    this.anchorId_ = interfaceC3409h.mo17052f(!this.anchorId_.isEmpty(), this.anchorId_, !liveChatMessage.anchorId_.isEmpty(), liveChatMessage.anchorId_);
                    this.giftTargetUserId_ = interfaceC3409h.mo17052f(!this.giftTargetUserId_.isEmpty(), this.giftTargetUserId_, !liveChatMessage.giftTargetUserId_.isEmpty(), liveChatMessage.giftTargetUserId_);
                    this.sharedVoiceLiveInfo_ = (SharedVoiceLiveInfo) interfaceC3409h.mo17061o(this.sharedVoiceLiveInfo_, liveChatMessage.sharedVoiceLiveInfo_);
                    this.liveMode_ = interfaceC3409h.mo17052f(!this.liveMode_.isEmpty(), this.liveMode_, !liveChatMessage.liveMode_.isEmpty(), liveChatMessage.liveMode_);
                    this.templateType_ = interfaceC3409h.mo17052f(!this.templateType_.isEmpty(), this.templateType_, !liveChatMessage.templateType_.isEmpty(), liveChatMessage.templateType_);
                    long j5 = this.preSeq_;
                    boolean z7 = j5 != 0;
                    long j6 = liveChatMessage.preSeq_;
                    this.preSeq_ = interfaceC3409h.mo17055i(z7, j5, j6 != 0, j6);
                    long j7 = this.preTimestamp_;
                    boolean z8 = j7 != 0;
                    long j8 = liveChatMessage.preTimestamp_;
                    this.preTimestamp_ = interfaceC3409h.mo17055i(z8, j7, j8 != 0, j8);
                    this.userIdentity_ = interfaceC3409h.mo17052f(!this.userIdentity_.isEmpty(), this.userIdentity_, !liveChatMessage.userIdentity_.isEmpty(), liveChatMessage.userIdentity_);
                    this.source_ = interfaceC3409h.mo17052f(!this.source_.isEmpty(), this.source_, !liveChatMessage.source_.isEmpty(), liveChatMessage.source_);
                    this.starlightHierarchy_ = (HierarchyMessage) interfaceC3409h.mo17061o(this.starlightHierarchy_, liveChatMessage.starlightHierarchy_);
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
                                    this.roomId_ = c3430e.m17170L();
                                    continue;
                                case 16:
                                    this.seq_ = c3430e.m17173O();
                                    continue;
                                case 24:
                                    this.type_ = c3430e.m17191p();
                                    continue;
                                case 34:
                                    this.userId_ = c3430e.m17170L();
                                    continue;
                                case 42:
                                    this.username_ = c3430e.m17170L();
                                    continue;
                                case 50:
                                    this.value_ = c3430e.m17170L();
                                    continue;
                                case 56:
                                    this.action_ = c3430e.m17191p();
                                    continue;
                                case 66:
                                    GiftMessage giftMessage = this.gift_;
                                    GiftMessage.Builder builder = giftMessage != null ? giftMessage.toBuilder() : null;
                                    GiftMessage giftMessage2 = (GiftMessage) c3430e.m17198w(GiftMessage.parser(), c3433h);
                                    this.gift_ = giftMessage2;
                                    if (builder != null) {
                                        builder.mergeFrom(giftMessage2);
                                        this.gift_ = builder.buildPartial();
                                    } else {
                                        continue;
                                    }
                                    break;
                                case 74:
                                    this.h5_ = c3430e.m17170L();
                                    continue;
                                case EACTags.COMMAND_TO_PERFORM /* 82 */:
                                    Template.TemplateData templateData = this.template_;
                                    Template.TemplateData.Builder builder2 = templateData != null ? templateData.toBuilder() : null;
                                    Template.TemplateData templateData2 = (Template.TemplateData) c3430e.m17198w(Template.TemplateData.parser(), c3433h);
                                    this.template_ = templateData2;
                                    if (builder2 != null) {
                                        builder2.mergeFrom(templateData2);
                                        this.template_ = builder2.buildPartial();
                                    } else {
                                        continue;
                                    }
                                    break;
                                case 90:
                                    this.liveId_ = c3430e.m17170L();
                                    continue;
                                case EACTags.FCP_TEMPLATE /* 98 */:
                                    MedalMessage medalMessage = this.medal_;
                                    MedalMessage.Builder builder3 = medalMessage != null ? medalMessage.toBuilder() : null;
                                    MedalMessage medalMessage2 = (MedalMessage) c3430e.m17198w(MedalMessage.parser(), c3433h);
                                    this.medal_ = medalMessage2;
                                    if (builder3 != null) {
                                        builder3.mergeFrom(medalMessage2);
                                        this.medal_ = builder3.buildPartial();
                                    } else {
                                        continue;
                                    }
                                    break;
                                case 104:
                                    this.createdTime_ = c3430e.m17197v();
                                    continue;
                                case 114:
                                    HierarchyMessage hierarchyMessage = this.hierarchy_;
                                    HierarchyMessage.Builder builder4 = hierarchyMessage != null ? hierarchyMessage.toBuilder() : null;
                                    HierarchyMessage hierarchyMessage2 = (HierarchyMessage) c3430e.m17198w(HierarchyMessage.parser(), c3433h);
                                    this.hierarchy_ = hierarchyMessage2;
                                    if (builder4 != null) {
                                        builder4.mergeFrom(hierarchyMessage2);
                                        this.hierarchy_ = builder4.buildPartial();
                                    } else {
                                        continue;
                                    }
                                    break;
                                case 122:
                                    LiveRevenueCampaignVip liveRevenueCampaignVip = this.liveRevenueCampaignVip_;
                                    LiveRevenueCampaignVip.Builder builder5 = liveRevenueCampaignVip != null ? liveRevenueCampaignVip.toBuilder() : null;
                                    LiveRevenueCampaignVip liveRevenueCampaignVip2 = (LiveRevenueCampaignVip) c3430e.m17198w(LiveRevenueCampaignVip.parser(), c3433h);
                                    this.liveRevenueCampaignVip_ = liveRevenueCampaignVip2;
                                    if (builder5 != null) {
                                        builder5.mergeFrom(liveRevenueCampaignVip2);
                                        this.liveRevenueCampaignVip_ = builder5.buildPartial();
                                    } else {
                                        continue;
                                    }
                                    break;
                                case 128:
                                    this.roomType_ = c3430e.m17191p();
                                    continue;
                                case CipherSuite.TLS_PSK_WITH_RC4_128_SHA /* 138 */:
                                    LiveChatMessageExtInfo liveChatMessageExtInfo = this.extInfo_;
                                    LiveChatMessageExtInfo.Builder builder6 = liveChatMessageExtInfo != null ? liveChatMessageExtInfo.toBuilder() : null;
                                    LiveChatMessageExtInfo liveChatMessageExtInfo2 = (LiveChatMessageExtInfo) c3430e.m17198w(LiveChatMessageExtInfo.parser(), c3433h);
                                    this.extInfo_ = liveChatMessageExtInfo2;
                                    if (builder6 != null) {
                                        builder6.mergeFrom(liveChatMessageExtInfo2);
                                        this.extInfo_ = builder6.buildPartial();
                                    } else {
                                        continue;
                                    }
                                    break;
                                case CipherSuite.TLS_RSA_PSK_WITH_RC4_128_SHA /* 146 */:
                                    LiveChatShadingConfig liveChatShadingConfig = this.chatShadingConfig_;
                                    LiveChatShadingConfig.Builder builder7 = liveChatShadingConfig != null ? liveChatShadingConfig.toBuilder() : null;
                                    LiveChatShadingConfig liveChatShadingConfig2 = (LiveChatShadingConfig) c3430e.m17198w(LiveChatShadingConfig.parser(), c3433h);
                                    this.chatShadingConfig_ = liveChatShadingConfig2;
                                    if (builder7 != null) {
                                        builder7.mergeFrom(liveChatShadingConfig2);
                                        this.chatShadingConfig_ = builder7.buildPartial();
                                    } else {
                                        continue;
                                    }
                                    break;
                                case 154:
                                    this.fakeId_ = c3430e.m17170L();
                                    continue;
                                case 162:
                                    this.msgId_ = c3430e.m17170L();
                                    continue;
                                case CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256 /* 170 */:
                                    this.fakeName_ = c3430e.m17170L();
                                    continue;
                                case 178:
                                    this.anchorId_ = c3430e.m17170L();
                                    continue;
                                case CipherSuite.TLS_RSA_WITH_CAMELLIA_128_CBC_SHA256 /* 186 */:
                                    this.giftTargetUserId_ = c3430e.m17170L();
                                    continue;
                                case CipherSuite.TLS_DH_RSA_WITH_CAMELLIA_256_CBC_SHA256 /* 194 */:
                                    SharedVoiceLiveInfo sharedVoiceLiveInfo = this.sharedVoiceLiveInfo_;
                                    SharedVoiceLiveInfo.Builder builder8 = sharedVoiceLiveInfo != null ? sharedVoiceLiveInfo.toBuilder() : null;
                                    SharedVoiceLiveInfo sharedVoiceLiveInfo2 = (SharedVoiceLiveInfo) c3430e.m17198w(SharedVoiceLiveInfo.parser(), c3433h);
                                    this.sharedVoiceLiveInfo_ = sharedVoiceLiveInfo2;
                                    if (builder8 != null) {
                                        builder8.mergeFrom(sharedVoiceLiveInfo2);
                                        this.sharedVoiceLiveInfo_ = builder8.buildPartial();
                                    } else {
                                        continue;
                                    }
                                    break;
                                case 202:
                                    this.liveMode_ = c3430e.m17170L();
                                    continue;
                                case 210:
                                    this.templateType_ = c3430e.m17170L();
                                    continue;
                                case 216:
                                    this.preSeq_ = c3430e.m17173O();
                                    continue;
                                case 224:
                                    this.preTimestamp_ = c3430e.m17197v();
                                    continue;
                                case 234:
                                    this.userIdentity_ = c3430e.m17170L();
                                    continue;
                                case 258:
                                    this.source_ = c3430e.m17170L();
                                    continue;
                                case 266:
                                    HierarchyMessage hierarchyMessage3 = this.starlightHierarchy_;
                                    HierarchyMessage.Builder builder9 = hierarchyMessage3 != null ? hierarchyMessage3.toBuilder() : null;
                                    HierarchyMessage hierarchyMessage4 = (HierarchyMessage) c3430e.m17198w(HierarchyMessage.parser(), c3433h);
                                    this.starlightHierarchy_ = hierarchyMessage4;
                                    if (builder9 != null) {
                                        builder9.mergeFrom(hierarchyMessage4);
                                        this.starlightHierarchy_ = builder9.buildPartial();
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
                        synchronized (LiveChatMessage.class) {
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

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageOrBuilder
        public Action getAction() {
            Action actionForNumber = Action.forNumber(this.action_);
            return actionForNumber == null ? Action.UNRECOGNIZED : actionForNumber;
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageOrBuilder
        public int getActionValue() {
            return this.action_;
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageOrBuilder
        public String getAnchorId() {
            return this.anchorId_;
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageOrBuilder
        public ByteString getAnchorIdBytes() {
            return ByteString.copyFromUtf8(this.anchorId_);
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageOrBuilder
        public LiveChatShadingConfig getChatShadingConfig() {
            LiveChatShadingConfig liveChatShadingConfig = this.chatShadingConfig_;
            return liveChatShadingConfig == null ? LiveChatShadingConfig.getDefaultInstance() : liveChatShadingConfig;
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageOrBuilder
        public long getCreatedTime() {
            return this.createdTime_;
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageOrBuilder
        public LiveChatMessageExtInfo getExtInfo() {
            LiveChatMessageExtInfo liveChatMessageExtInfo = this.extInfo_;
            return liveChatMessageExtInfo == null ? LiveChatMessageExtInfo.getDefaultInstance() : liveChatMessageExtInfo;
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageOrBuilder
        public String getFakeId() {
            return this.fakeId_;
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageOrBuilder
        public ByteString getFakeIdBytes() {
            return ByteString.copyFromUtf8(this.fakeId_);
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageOrBuilder
        public String getFakeName() {
            return this.fakeName_;
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageOrBuilder
        public ByteString getFakeNameBytes() {
            return ByteString.copyFromUtf8(this.fakeName_);
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageOrBuilder
        public GiftMessage getGift() {
            GiftMessage giftMessage = this.gift_;
            return giftMessage == null ? GiftMessage.getDefaultInstance() : giftMessage;
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageOrBuilder
        public String getGiftTargetUserId() {
            return this.giftTargetUserId_;
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageOrBuilder
        public ByteString getGiftTargetUserIdBytes() {
            return ByteString.copyFromUtf8(this.giftTargetUserId_);
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageOrBuilder
        public String getH5() {
            return this.h5_;
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageOrBuilder
        public ByteString getH5Bytes() {
            return ByteString.copyFromUtf8(this.h5_);
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageOrBuilder
        public HierarchyMessage getHierarchy() {
            HierarchyMessage hierarchyMessage = this.hierarchy_;
            return hierarchyMessage == null ? HierarchyMessage.getDefaultInstance() : hierarchyMessage;
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageOrBuilder
        public String getLiveId() {
            return this.liveId_;
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageOrBuilder
        public ByteString getLiveIdBytes() {
            return ByteString.copyFromUtf8(this.liveId_);
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageOrBuilder
        public String getLiveMode() {
            return this.liveMode_;
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageOrBuilder
        public ByteString getLiveModeBytes() {
            return ByteString.copyFromUtf8(this.liveMode_);
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageOrBuilder
        public LiveRevenueCampaignVip getLiveRevenueCampaignVip() {
            LiveRevenueCampaignVip liveRevenueCampaignVip = this.liveRevenueCampaignVip_;
            return liveRevenueCampaignVip == null ? LiveRevenueCampaignVip.getDefaultInstance() : liveRevenueCampaignVip;
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageOrBuilder
        public MedalMessage getMedal() {
            MedalMessage medalMessage = this.medal_;
            return medalMessage == null ? MedalMessage.getDefaultInstance() : medalMessage;
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageOrBuilder
        public String getMsgId() {
            return this.msgId_;
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageOrBuilder
        public ByteString getMsgIdBytes() {
            return ByteString.copyFromUtf8(this.msgId_);
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageOrBuilder
        public long getPreSeq() {
            return this.preSeq_;
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageOrBuilder
        public long getPreTimestamp() {
            return this.preTimestamp_;
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageOrBuilder
        public String getRoomId() {
            return this.roomId_;
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageOrBuilder
        public ByteString getRoomIdBytes() {
            return ByteString.copyFromUtf8(this.roomId_);
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageOrBuilder
        public RoomType getRoomType() {
            RoomType roomTypeForNumber = RoomType.forNumber(this.roomType_);
            return roomTypeForNumber == null ? RoomType.UNRECOGNIZED : roomTypeForNumber;
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageOrBuilder
        public int getRoomTypeValue() {
            return this.roomType_;
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageOrBuilder
        public long getSeq() {
            return this.seq_;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16956K = !this.roomId_.isEmpty() ? CodedOutputStream.m16956K(1, getRoomId()) : 0;
            long j = this.seq_;
            if (j != 0) {
                iM16956K += CodedOutputStream.m16961P(2, j);
            }
            if (this.type_ != LiveChatMessageType.TEXT.getNumber()) {
                iM16956K += CodedOutputStream.m16977m(3, this.type_);
            }
            if (!this.userId_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(4, getUserId());
            }
            if (!this.username_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(5, getUsername());
            }
            if (!this.value_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(6, getValue());
            }
            if (this.action_ != Action.DEFAULT.getNumber()) {
                iM16956K += CodedOutputStream.m16977m(7, this.action_);
            }
            if (this.gift_ != null) {
                iM16956K += CodedOutputStream.m16948C(8, getGift());
            }
            if (!this.h5_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(9, getH5());
            }
            if (this.template_ != null) {
                iM16956K += CodedOutputStream.m16948C(10, getTemplate());
            }
            if (!this.liveId_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(11, getLiveId());
            }
            if (this.medal_ != null) {
                iM16956K += CodedOutputStream.m16948C(12, getMedal());
            }
            long j2 = this.createdTime_;
            if (j2 != 0) {
                iM16956K += CodedOutputStream.m16986v(13, j2);
            }
            if (this.hierarchy_ != null) {
                iM16956K += CodedOutputStream.m16948C(14, getHierarchy());
            }
            if (this.liveRevenueCampaignVip_ != null) {
                iM16956K += CodedOutputStream.m16948C(15, getLiveRevenueCampaignVip());
            }
            if (this.roomType_ != RoomType.video.getNumber()) {
                iM16956K += CodedOutputStream.m16977m(16, this.roomType_);
            }
            if (this.extInfo_ != null) {
                iM16956K += CodedOutputStream.m16948C(17, getExtInfo());
            }
            if (this.chatShadingConfig_ != null) {
                iM16956K += CodedOutputStream.m16948C(18, getChatShadingConfig());
            }
            if (!this.fakeId_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(19, getFakeId());
            }
            if (!this.msgId_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(20, getMsgId());
            }
            if (!this.fakeName_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(21, getFakeName());
            }
            if (!this.anchorId_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(22, getAnchorId());
            }
            if (!this.giftTargetUserId_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(23, getGiftTargetUserId());
            }
            if (this.sharedVoiceLiveInfo_ != null) {
                iM16956K += CodedOutputStream.m16948C(24, getSharedVoiceLiveInfo());
            }
            if (!this.liveMode_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(25, getLiveMode());
            }
            if (!this.templateType_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(26, getTemplateType());
            }
            long j3 = this.preSeq_;
            if (j3 != 0) {
                iM16956K += CodedOutputStream.m16961P(27, j3);
            }
            long j4 = this.preTimestamp_;
            if (j4 != 0) {
                iM16956K += CodedOutputStream.m16986v(28, j4);
            }
            if (!this.userIdentity_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(29, getUserIdentity());
            }
            if (!this.source_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(32, getSource());
            }
            if (this.starlightHierarchy_ != null) {
                iM16956K += CodedOutputStream.m16948C(33, getStarlightHierarchy());
            }
            this.memoizedSerializedSize = iM16956K;
            return iM16956K;
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageOrBuilder
        public SharedVoiceLiveInfo getSharedVoiceLiveInfo() {
            SharedVoiceLiveInfo sharedVoiceLiveInfo = this.sharedVoiceLiveInfo_;
            return sharedVoiceLiveInfo == null ? SharedVoiceLiveInfo.getDefaultInstance() : sharedVoiceLiveInfo;
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageOrBuilder
        public String getSource() {
            return this.source_;
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageOrBuilder
        public ByteString getSourceBytes() {
            return ByteString.copyFromUtf8(this.source_);
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageOrBuilder
        public HierarchyMessage getStarlightHierarchy() {
            HierarchyMessage hierarchyMessage = this.starlightHierarchy_;
            return hierarchyMessage == null ? HierarchyMessage.getDefaultInstance() : hierarchyMessage;
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageOrBuilder
        public Template.TemplateData getTemplate() {
            Template.TemplateData templateData = this.template_;
            return templateData == null ? Template.TemplateData.getDefaultInstance() : templateData;
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageOrBuilder
        public String getTemplateType() {
            return this.templateType_;
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageOrBuilder
        public ByteString getTemplateTypeBytes() {
            return ByteString.copyFromUtf8(this.templateType_);
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageOrBuilder
        public LiveChatMessageType getType() {
            LiveChatMessageType liveChatMessageTypeForNumber = LiveChatMessageType.forNumber(this.type_);
            return liveChatMessageTypeForNumber == null ? LiveChatMessageType.UNRECOGNIZED : liveChatMessageTypeForNumber;
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageOrBuilder
        public int getTypeValue() {
            return this.type_;
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageOrBuilder
        public String getUserId() {
            return this.userId_;
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageOrBuilder
        public ByteString getUserIdBytes() {
            return ByteString.copyFromUtf8(this.userId_);
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageOrBuilder
        public String getUserIdentity() {
            return this.userIdentity_;
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageOrBuilder
        public ByteString getUserIdentityBytes() {
            return ByteString.copyFromUtf8(this.userIdentity_);
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageOrBuilder
        public String getUsername() {
            return this.username_;
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageOrBuilder
        public ByteString getUsernameBytes() {
            return ByteString.copyFromUtf8(this.username_);
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageOrBuilder
        public String getValue() {
            return this.value_;
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageOrBuilder
        public ByteString getValueBytes() {
            return ByteString.copyFromUtf8(this.value_);
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageOrBuilder
        public boolean hasChatShadingConfig() {
            return this.chatShadingConfig_ != null;
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageOrBuilder
        public boolean hasExtInfo() {
            return this.extInfo_ != null;
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageOrBuilder
        public boolean hasGift() {
            return this.gift_ != null;
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageOrBuilder
        public boolean hasHierarchy() {
            return this.hierarchy_ != null;
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageOrBuilder
        public boolean hasLiveRevenueCampaignVip() {
            return this.liveRevenueCampaignVip_ != null;
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageOrBuilder
        public boolean hasMedal() {
            return this.medal_ != null;
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageOrBuilder
        public boolean hasSharedVoiceLiveInfo() {
            return this.sharedVoiceLiveInfo_ != null;
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageOrBuilder
        public boolean hasStarlightHierarchy() {
            return this.starlightHierarchy_ != null;
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageOrBuilder
        public boolean hasTemplate() {
            return this.template_ != null;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.roomId_.isEmpty()) {
                codedOutputStream.mo16994D0(1, getRoomId());
            }
            long j = this.seq_;
            if (j != 0) {
                codedOutputStream.mo16999I0(2, j);
            }
            if (this.type_ != LiveChatMessageType.TEXT.getNumber()) {
                codedOutputStream.m17015i0(3, this.type_);
            }
            if (!this.userId_.isEmpty()) {
                codedOutputStream.mo16994D0(4, getUserId());
            }
            if (!this.username_.isEmpty()) {
                codedOutputStream.mo16994D0(5, getUsername());
            }
            if (!this.value_.isEmpty()) {
                codedOutputStream.mo16994D0(6, getValue());
            }
            if (this.action_ != Action.DEFAULT.getNumber()) {
                codedOutputStream.m17015i0(7, this.action_);
            }
            if (this.gift_ != null) {
                codedOutputStream.mo17029w0(8, getGift());
            }
            if (!this.h5_.isEmpty()) {
                codedOutputStream.mo16994D0(9, getH5());
            }
            if (this.template_ != null) {
                codedOutputStream.mo17029w0(10, getTemplate());
            }
            if (!this.liveId_.isEmpty()) {
                codedOutputStream.mo16994D0(11, getLiveId());
            }
            if (this.medal_ != null) {
                codedOutputStream.mo17029w0(12, getMedal());
            }
            long j2 = this.createdTime_;
            if (j2 != 0) {
                codedOutputStream.m17027u0(13, j2);
            }
            if (this.hierarchy_ != null) {
                codedOutputStream.mo17029w0(14, getHierarchy());
            }
            if (this.liveRevenueCampaignVip_ != null) {
                codedOutputStream.mo17029w0(15, getLiveRevenueCampaignVip());
            }
            if (this.roomType_ != RoomType.video.getNumber()) {
                codedOutputStream.m17015i0(16, this.roomType_);
            }
            if (this.extInfo_ != null) {
                codedOutputStream.mo17029w0(17, getExtInfo());
            }
            if (this.chatShadingConfig_ != null) {
                codedOutputStream.mo17029w0(18, getChatShadingConfig());
            }
            if (!this.fakeId_.isEmpty()) {
                codedOutputStream.mo16994D0(19, getFakeId());
            }
            if (!this.msgId_.isEmpty()) {
                codedOutputStream.mo16994D0(20, getMsgId());
            }
            if (!this.fakeName_.isEmpty()) {
                codedOutputStream.mo16994D0(21, getFakeName());
            }
            if (!this.anchorId_.isEmpty()) {
                codedOutputStream.mo16994D0(22, getAnchorId());
            }
            if (!this.giftTargetUserId_.isEmpty()) {
                codedOutputStream.mo16994D0(23, getGiftTargetUserId());
            }
            if (this.sharedVoiceLiveInfo_ != null) {
                codedOutputStream.mo17029w0(24, getSharedVoiceLiveInfo());
            }
            if (!this.liveMode_.isEmpty()) {
                codedOutputStream.mo16994D0(25, getLiveMode());
            }
            if (!this.templateType_.isEmpty()) {
                codedOutputStream.mo16994D0(26, getTemplateType());
            }
            long j3 = this.preSeq_;
            if (j3 != 0) {
                codedOutputStream.mo16999I0(27, j3);
            }
            long j4 = this.preTimestamp_;
            if (j4 != 0) {
                codedOutputStream.m17027u0(28, j4);
            }
            if (!this.userIdentity_.isEmpty()) {
                codedOutputStream.mo16994D0(29, getUserIdentity());
            }
            if (!this.source_.isEmpty()) {
                codedOutputStream.mo16994D0(32, getSource());
            }
            if (this.starlightHierarchy_ != null) {
                codedOutputStream.mo17029w0(33, getStarlightHierarchy());
            }
        }

        public static LiveChatMessage parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (LiveChatMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static LiveChatMessage parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (LiveChatMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setChatShadingConfig(LiveChatShadingConfig liveChatShadingConfig) {
            liveChatShadingConfig.getClass();
            this.chatShadingConfig_ = liveChatShadingConfig;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setExtInfo(LiveChatMessageExtInfo liveChatMessageExtInfo) {
            liveChatMessageExtInfo.getClass();
            this.extInfo_ = liveChatMessageExtInfo;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGift(GiftMessage giftMessage) {
            giftMessage.getClass();
            this.gift_ = giftMessage;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHierarchy(HierarchyMessage hierarchyMessage) {
            hierarchyMessage.getClass();
            this.hierarchy_ = hierarchyMessage;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLiveRevenueCampaignVip(LiveRevenueCampaignVip liveRevenueCampaignVip) {
            liveRevenueCampaignVip.getClass();
            this.liveRevenueCampaignVip_ = liveRevenueCampaignVip;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMedal(MedalMessage medalMessage) {
            medalMessage.getClass();
            this.medal_ = medalMessage;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSharedVoiceLiveInfo(SharedVoiceLiveInfo sharedVoiceLiveInfo) {
            sharedVoiceLiveInfo.getClass();
            this.sharedVoiceLiveInfo_ = sharedVoiceLiveInfo;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStarlightHierarchy(HierarchyMessage hierarchyMessage) {
            hierarchyMessage.getClass();
            this.starlightHierarchy_ = hierarchyMessage;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTemplate(Template.TemplateData templateData) {
            templateData.getClass();
            this.template_ = templateData;
        }

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<LiveChatMessage, Builder> implements LiveChatMessageOrBuilder {
            private Builder() {
                super(LiveChatMessage.DEFAULT_INSTANCE);
            }

            public Builder clearAction() {
                copyOnWrite();
                ((LiveChatMessage) this.instance).clearAction();
                return this;
            }

            public Builder clearAnchorId() {
                copyOnWrite();
                ((LiveChatMessage) this.instance).clearAnchorId();
                return this;
            }

            public Builder clearChatShadingConfig() {
                copyOnWrite();
                ((LiveChatMessage) this.instance).clearChatShadingConfig();
                return this;
            }

            public Builder clearCreatedTime() {
                copyOnWrite();
                ((LiveChatMessage) this.instance).clearCreatedTime();
                return this;
            }

            public Builder clearExtInfo() {
                copyOnWrite();
                ((LiveChatMessage) this.instance).clearExtInfo();
                return this;
            }

            public Builder clearFakeId() {
                copyOnWrite();
                ((LiveChatMessage) this.instance).clearFakeId();
                return this;
            }

            public Builder clearFakeName() {
                copyOnWrite();
                ((LiveChatMessage) this.instance).clearFakeName();
                return this;
            }

            public Builder clearGift() {
                copyOnWrite();
                ((LiveChatMessage) this.instance).clearGift();
                return this;
            }

            public Builder clearGiftTargetUserId() {
                copyOnWrite();
                ((LiveChatMessage) this.instance).clearGiftTargetUserId();
                return this;
            }

            public Builder clearH5() {
                copyOnWrite();
                ((LiveChatMessage) this.instance).clearH5();
                return this;
            }

            public Builder clearHierarchy() {
                copyOnWrite();
                ((LiveChatMessage) this.instance).clearHierarchy();
                return this;
            }

            public Builder clearLiveId() {
                copyOnWrite();
                ((LiveChatMessage) this.instance).clearLiveId();
                return this;
            }

            public Builder clearLiveMode() {
                copyOnWrite();
                ((LiveChatMessage) this.instance).clearLiveMode();
                return this;
            }

            public Builder clearLiveRevenueCampaignVip() {
                copyOnWrite();
                ((LiveChatMessage) this.instance).clearLiveRevenueCampaignVip();
                return this;
            }

            public Builder clearMedal() {
                copyOnWrite();
                ((LiveChatMessage) this.instance).clearMedal();
                return this;
            }

            public Builder clearMsgId() {
                copyOnWrite();
                ((LiveChatMessage) this.instance).clearMsgId();
                return this;
            }

            public Builder clearPreSeq() {
                copyOnWrite();
                ((LiveChatMessage) this.instance).clearPreSeq();
                return this;
            }

            public Builder clearPreTimestamp() {
                copyOnWrite();
                ((LiveChatMessage) this.instance).clearPreTimestamp();
                return this;
            }

            public Builder clearRoomId() {
                copyOnWrite();
                ((LiveChatMessage) this.instance).clearRoomId();
                return this;
            }

            public Builder clearRoomType() {
                copyOnWrite();
                ((LiveChatMessage) this.instance).clearRoomType();
                return this;
            }

            public Builder clearSeq() {
                copyOnWrite();
                ((LiveChatMessage) this.instance).clearSeq();
                return this;
            }

            public Builder clearSharedVoiceLiveInfo() {
                copyOnWrite();
                ((LiveChatMessage) this.instance).clearSharedVoiceLiveInfo();
                return this;
            }

            public Builder clearSource() {
                copyOnWrite();
                ((LiveChatMessage) this.instance).clearSource();
                return this;
            }

            public Builder clearStarlightHierarchy() {
                copyOnWrite();
                ((LiveChatMessage) this.instance).clearStarlightHierarchy();
                return this;
            }

            public Builder clearTemplate() {
                copyOnWrite();
                ((LiveChatMessage) this.instance).clearTemplate();
                return this;
            }

            public Builder clearTemplateType() {
                copyOnWrite();
                ((LiveChatMessage) this.instance).clearTemplateType();
                return this;
            }

            public Builder clearType() {
                copyOnWrite();
                ((LiveChatMessage) this.instance).clearType();
                return this;
            }

            public Builder clearUserId() {
                copyOnWrite();
                ((LiveChatMessage) this.instance).clearUserId();
                return this;
            }

            public Builder clearUserIdentity() {
                copyOnWrite();
                ((LiveChatMessage) this.instance).clearUserIdentity();
                return this;
            }

            public Builder clearUsername() {
                copyOnWrite();
                ((LiveChatMessage) this.instance).clearUsername();
                return this;
            }

            public Builder clearValue() {
                copyOnWrite();
                ((LiveChatMessage) this.instance).clearValue();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageOrBuilder
            public Action getAction() {
                return ((LiveChatMessage) this.instance).getAction();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageOrBuilder
            public int getActionValue() {
                return ((LiveChatMessage) this.instance).getActionValue();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageOrBuilder
            public String getAnchorId() {
                return ((LiveChatMessage) this.instance).getAnchorId();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageOrBuilder
            public ByteString getAnchorIdBytes() {
                return ((LiveChatMessage) this.instance).getAnchorIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageOrBuilder
            public LiveChatShadingConfig getChatShadingConfig() {
                return ((LiveChatMessage) this.instance).getChatShadingConfig();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageOrBuilder
            public long getCreatedTime() {
                return ((LiveChatMessage) this.instance).getCreatedTime();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageOrBuilder
            public LiveChatMessageExtInfo getExtInfo() {
                return ((LiveChatMessage) this.instance).getExtInfo();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageOrBuilder
            public String getFakeId() {
                return ((LiveChatMessage) this.instance).getFakeId();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageOrBuilder
            public ByteString getFakeIdBytes() {
                return ((LiveChatMessage) this.instance).getFakeIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageOrBuilder
            public String getFakeName() {
                return ((LiveChatMessage) this.instance).getFakeName();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageOrBuilder
            public ByteString getFakeNameBytes() {
                return ((LiveChatMessage) this.instance).getFakeNameBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageOrBuilder
            public GiftMessage getGift() {
                return ((LiveChatMessage) this.instance).getGift();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageOrBuilder
            public String getGiftTargetUserId() {
                return ((LiveChatMessage) this.instance).getGiftTargetUserId();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageOrBuilder
            public ByteString getGiftTargetUserIdBytes() {
                return ((LiveChatMessage) this.instance).getGiftTargetUserIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageOrBuilder
            public String getH5() {
                return ((LiveChatMessage) this.instance).getH5();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageOrBuilder
            public ByteString getH5Bytes() {
                return ((LiveChatMessage) this.instance).getH5Bytes();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageOrBuilder
            public HierarchyMessage getHierarchy() {
                return ((LiveChatMessage) this.instance).getHierarchy();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageOrBuilder
            public String getLiveId() {
                return ((LiveChatMessage) this.instance).getLiveId();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageOrBuilder
            public ByteString getLiveIdBytes() {
                return ((LiveChatMessage) this.instance).getLiveIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageOrBuilder
            public String getLiveMode() {
                return ((LiveChatMessage) this.instance).getLiveMode();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageOrBuilder
            public ByteString getLiveModeBytes() {
                return ((LiveChatMessage) this.instance).getLiveModeBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageOrBuilder
            public LiveRevenueCampaignVip getLiveRevenueCampaignVip() {
                return ((LiveChatMessage) this.instance).getLiveRevenueCampaignVip();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageOrBuilder
            public MedalMessage getMedal() {
                return ((LiveChatMessage) this.instance).getMedal();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageOrBuilder
            public String getMsgId() {
                return ((LiveChatMessage) this.instance).getMsgId();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageOrBuilder
            public ByteString getMsgIdBytes() {
                return ((LiveChatMessage) this.instance).getMsgIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageOrBuilder
            public long getPreSeq() {
                return ((LiveChatMessage) this.instance).getPreSeq();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageOrBuilder
            public long getPreTimestamp() {
                return ((LiveChatMessage) this.instance).getPreTimestamp();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageOrBuilder
            public String getRoomId() {
                return ((LiveChatMessage) this.instance).getRoomId();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageOrBuilder
            public ByteString getRoomIdBytes() {
                return ((LiveChatMessage) this.instance).getRoomIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageOrBuilder
            public RoomType getRoomType() {
                return ((LiveChatMessage) this.instance).getRoomType();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageOrBuilder
            public int getRoomTypeValue() {
                return ((LiveChatMessage) this.instance).getRoomTypeValue();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageOrBuilder
            public long getSeq() {
                return ((LiveChatMessage) this.instance).getSeq();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageOrBuilder
            public SharedVoiceLiveInfo getSharedVoiceLiveInfo() {
                return ((LiveChatMessage) this.instance).getSharedVoiceLiveInfo();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageOrBuilder
            public String getSource() {
                return ((LiveChatMessage) this.instance).getSource();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageOrBuilder
            public ByteString getSourceBytes() {
                return ((LiveChatMessage) this.instance).getSourceBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageOrBuilder
            public HierarchyMessage getStarlightHierarchy() {
                return ((LiveChatMessage) this.instance).getStarlightHierarchy();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageOrBuilder
            public Template.TemplateData getTemplate() {
                return ((LiveChatMessage) this.instance).getTemplate();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageOrBuilder
            public String getTemplateType() {
                return ((LiveChatMessage) this.instance).getTemplateType();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageOrBuilder
            public ByteString getTemplateTypeBytes() {
                return ((LiveChatMessage) this.instance).getTemplateTypeBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageOrBuilder
            public LiveChatMessageType getType() {
                return ((LiveChatMessage) this.instance).getType();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageOrBuilder
            public int getTypeValue() {
                return ((LiveChatMessage) this.instance).getTypeValue();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageOrBuilder
            public String getUserId() {
                return ((LiveChatMessage) this.instance).getUserId();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageOrBuilder
            public ByteString getUserIdBytes() {
                return ((LiveChatMessage) this.instance).getUserIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageOrBuilder
            public String getUserIdentity() {
                return ((LiveChatMessage) this.instance).getUserIdentity();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageOrBuilder
            public ByteString getUserIdentityBytes() {
                return ((LiveChatMessage) this.instance).getUserIdentityBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageOrBuilder
            public String getUsername() {
                return ((LiveChatMessage) this.instance).getUsername();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageOrBuilder
            public ByteString getUsernameBytes() {
                return ((LiveChatMessage) this.instance).getUsernameBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageOrBuilder
            public String getValue() {
                return ((LiveChatMessage) this.instance).getValue();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageOrBuilder
            public ByteString getValueBytes() {
                return ((LiveChatMessage) this.instance).getValueBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageOrBuilder
            public boolean hasChatShadingConfig() {
                return ((LiveChatMessage) this.instance).hasChatShadingConfig();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageOrBuilder
            public boolean hasExtInfo() {
                return ((LiveChatMessage) this.instance).hasExtInfo();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageOrBuilder
            public boolean hasGift() {
                return ((LiveChatMessage) this.instance).hasGift();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageOrBuilder
            public boolean hasHierarchy() {
                return ((LiveChatMessage) this.instance).hasHierarchy();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageOrBuilder
            public boolean hasLiveRevenueCampaignVip() {
                return ((LiveChatMessage) this.instance).hasLiveRevenueCampaignVip();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageOrBuilder
            public boolean hasMedal() {
                return ((LiveChatMessage) this.instance).hasMedal();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageOrBuilder
            public boolean hasSharedVoiceLiveInfo() {
                return ((LiveChatMessage) this.instance).hasSharedVoiceLiveInfo();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageOrBuilder
            public boolean hasStarlightHierarchy() {
                return ((LiveChatMessage) this.instance).hasStarlightHierarchy();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageOrBuilder
            public boolean hasTemplate() {
                return ((LiveChatMessage) this.instance).hasTemplate();
            }

            public Builder mergeChatShadingConfig(LiveChatShadingConfig liveChatShadingConfig) {
                copyOnWrite();
                ((LiveChatMessage) this.instance).mergeChatShadingConfig(liveChatShadingConfig);
                return this;
            }

            public Builder mergeExtInfo(LiveChatMessageExtInfo liveChatMessageExtInfo) {
                copyOnWrite();
                ((LiveChatMessage) this.instance).mergeExtInfo(liveChatMessageExtInfo);
                return this;
            }

            public Builder mergeGift(GiftMessage giftMessage) {
                copyOnWrite();
                ((LiveChatMessage) this.instance).mergeGift(giftMessage);
                return this;
            }

            public Builder mergeHierarchy(HierarchyMessage hierarchyMessage) {
                copyOnWrite();
                ((LiveChatMessage) this.instance).mergeHierarchy(hierarchyMessage);
                return this;
            }

            public Builder mergeLiveRevenueCampaignVip(LiveRevenueCampaignVip liveRevenueCampaignVip) {
                copyOnWrite();
                ((LiveChatMessage) this.instance).mergeLiveRevenueCampaignVip(liveRevenueCampaignVip);
                return this;
            }

            public Builder mergeMedal(MedalMessage medalMessage) {
                copyOnWrite();
                ((LiveChatMessage) this.instance).mergeMedal(medalMessage);
                return this;
            }

            public Builder mergeSharedVoiceLiveInfo(SharedVoiceLiveInfo sharedVoiceLiveInfo) {
                copyOnWrite();
                ((LiveChatMessage) this.instance).mergeSharedVoiceLiveInfo(sharedVoiceLiveInfo);
                return this;
            }

            public Builder mergeStarlightHierarchy(HierarchyMessage hierarchyMessage) {
                copyOnWrite();
                ((LiveChatMessage) this.instance).mergeStarlightHierarchy(hierarchyMessage);
                return this;
            }

            public Builder mergeTemplate(Template.TemplateData templateData) {
                copyOnWrite();
                ((LiveChatMessage) this.instance).mergeTemplate(templateData);
                return this;
            }

            public Builder setAction(Action action) {
                copyOnWrite();
                ((LiveChatMessage) this.instance).setAction(action);
                return this;
            }

            public Builder setActionValue(int i) {
                copyOnWrite();
                ((LiveChatMessage) this.instance).setActionValue(i);
                return this;
            }

            public Builder setAnchorId(String str) {
                copyOnWrite();
                ((LiveChatMessage) this.instance).setAnchorId(str);
                return this;
            }

            public Builder setAnchorIdBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveChatMessage) this.instance).setAnchorIdBytes(byteString);
                return this;
            }

            public Builder setChatShadingConfig(LiveChatShadingConfig liveChatShadingConfig) {
                copyOnWrite();
                ((LiveChatMessage) this.instance).setChatShadingConfig(liveChatShadingConfig);
                return this;
            }

            public Builder setCreatedTime(long j) {
                copyOnWrite();
                ((LiveChatMessage) this.instance).setCreatedTime(j);
                return this;
            }

            public Builder setExtInfo(LiveChatMessageExtInfo liveChatMessageExtInfo) {
                copyOnWrite();
                ((LiveChatMessage) this.instance).setExtInfo(liveChatMessageExtInfo);
                return this;
            }

            public Builder setFakeId(String str) {
                copyOnWrite();
                ((LiveChatMessage) this.instance).setFakeId(str);
                return this;
            }

            public Builder setFakeIdBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveChatMessage) this.instance).setFakeIdBytes(byteString);
                return this;
            }

            public Builder setFakeName(String str) {
                copyOnWrite();
                ((LiveChatMessage) this.instance).setFakeName(str);
                return this;
            }

            public Builder setFakeNameBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveChatMessage) this.instance).setFakeNameBytes(byteString);
                return this;
            }

            public Builder setGift(GiftMessage giftMessage) {
                copyOnWrite();
                ((LiveChatMessage) this.instance).setGift(giftMessage);
                return this;
            }

            public Builder setGiftTargetUserId(String str) {
                copyOnWrite();
                ((LiveChatMessage) this.instance).setGiftTargetUserId(str);
                return this;
            }

            public Builder setGiftTargetUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveChatMessage) this.instance).setGiftTargetUserIdBytes(byteString);
                return this;
            }

            public Builder setH5(String str) {
                copyOnWrite();
                ((LiveChatMessage) this.instance).setH5(str);
                return this;
            }

            public Builder setH5Bytes(ByteString byteString) {
                copyOnWrite();
                ((LiveChatMessage) this.instance).setH5Bytes(byteString);
                return this;
            }

            public Builder setHierarchy(HierarchyMessage hierarchyMessage) {
                copyOnWrite();
                ((LiveChatMessage) this.instance).setHierarchy(hierarchyMessage);
                return this;
            }

            public Builder setLiveId(String str) {
                copyOnWrite();
                ((LiveChatMessage) this.instance).setLiveId(str);
                return this;
            }

            public Builder setLiveIdBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveChatMessage) this.instance).setLiveIdBytes(byteString);
                return this;
            }

            public Builder setLiveMode(String str) {
                copyOnWrite();
                ((LiveChatMessage) this.instance).setLiveMode(str);
                return this;
            }

            public Builder setLiveModeBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveChatMessage) this.instance).setLiveModeBytes(byteString);
                return this;
            }

            public Builder setLiveRevenueCampaignVip(LiveRevenueCampaignVip liveRevenueCampaignVip) {
                copyOnWrite();
                ((LiveChatMessage) this.instance).setLiveRevenueCampaignVip(liveRevenueCampaignVip);
                return this;
            }

            public Builder setMedal(MedalMessage medalMessage) {
                copyOnWrite();
                ((LiveChatMessage) this.instance).setMedal(medalMessage);
                return this;
            }

            public Builder setMsgId(String str) {
                copyOnWrite();
                ((LiveChatMessage) this.instance).setMsgId(str);
                return this;
            }

            public Builder setMsgIdBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveChatMessage) this.instance).setMsgIdBytes(byteString);
                return this;
            }

            public Builder setPreSeq(long j) {
                copyOnWrite();
                ((LiveChatMessage) this.instance).setPreSeq(j);
                return this;
            }

            public Builder setPreTimestamp(long j) {
                copyOnWrite();
                ((LiveChatMessage) this.instance).setPreTimestamp(j);
                return this;
            }

            public Builder setRoomId(String str) {
                copyOnWrite();
                ((LiveChatMessage) this.instance).setRoomId(str);
                return this;
            }

            public Builder setRoomIdBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveChatMessage) this.instance).setRoomIdBytes(byteString);
                return this;
            }

            public Builder setRoomType(RoomType roomType) {
                copyOnWrite();
                ((LiveChatMessage) this.instance).setRoomType(roomType);
                return this;
            }

            public Builder setRoomTypeValue(int i) {
                copyOnWrite();
                ((LiveChatMessage) this.instance).setRoomTypeValue(i);
                return this;
            }

            public Builder setSeq(long j) {
                copyOnWrite();
                ((LiveChatMessage) this.instance).setSeq(j);
                return this;
            }

            public Builder setSharedVoiceLiveInfo(SharedVoiceLiveInfo sharedVoiceLiveInfo) {
                copyOnWrite();
                ((LiveChatMessage) this.instance).setSharedVoiceLiveInfo(sharedVoiceLiveInfo);
                return this;
            }

            public Builder setSource(String str) {
                copyOnWrite();
                ((LiveChatMessage) this.instance).setSource(str);
                return this;
            }

            public Builder setSourceBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveChatMessage) this.instance).setSourceBytes(byteString);
                return this;
            }

            public Builder setStarlightHierarchy(HierarchyMessage hierarchyMessage) {
                copyOnWrite();
                ((LiveChatMessage) this.instance).setStarlightHierarchy(hierarchyMessage);
                return this;
            }

            public Builder setTemplate(Template.TemplateData templateData) {
                copyOnWrite();
                ((LiveChatMessage) this.instance).setTemplate(templateData);
                return this;
            }

            public Builder setTemplateType(String str) {
                copyOnWrite();
                ((LiveChatMessage) this.instance).setTemplateType(str);
                return this;
            }

            public Builder setTemplateTypeBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveChatMessage) this.instance).setTemplateTypeBytes(byteString);
                return this;
            }

            public Builder setType(LiveChatMessageType liveChatMessageType) {
                copyOnWrite();
                ((LiveChatMessage) this.instance).setType(liveChatMessageType);
                return this;
            }

            public Builder setTypeValue(int i) {
                copyOnWrite();
                ((LiveChatMessage) this.instance).setTypeValue(i);
                return this;
            }

            public Builder setUserId(String str) {
                copyOnWrite();
                ((LiveChatMessage) this.instance).setUserId(str);
                return this;
            }

            public Builder setUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveChatMessage) this.instance).setUserIdBytes(byteString);
                return this;
            }

            public Builder setUserIdentity(String str) {
                copyOnWrite();
                ((LiveChatMessage) this.instance).setUserIdentity(str);
                return this;
            }

            public Builder setUserIdentityBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveChatMessage) this.instance).setUserIdentityBytes(byteString);
                return this;
            }

            public Builder setUsername(String str) {
                copyOnWrite();
                ((LiveChatMessage) this.instance).setUsername(str);
                return this;
            }

            public Builder setUsernameBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveChatMessage) this.instance).setUsernameBytes(byteString);
                return this;
            }

            public Builder setValue(String str) {
                copyOnWrite();
                ((LiveChatMessage) this.instance).setValue(str);
                return this;
            }

            public Builder setValueBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveChatMessage) this.instance).setValueBytes(byteString);
                return this;
            }

            public Builder setChatShadingConfig(LiveChatShadingConfig.Builder builder) {
                copyOnWrite();
                ((LiveChatMessage) this.instance).setChatShadingConfig(builder);
                return this;
            }

            public Builder setExtInfo(LiveChatMessageExtInfo.Builder builder) {
                copyOnWrite();
                ((LiveChatMessage) this.instance).setExtInfo(builder);
                return this;
            }

            public Builder setGift(GiftMessage.Builder builder) {
                copyOnWrite();
                ((LiveChatMessage) this.instance).setGift(builder);
                return this;
            }

            public Builder setHierarchy(HierarchyMessage.Builder builder) {
                copyOnWrite();
                ((LiveChatMessage) this.instance).setHierarchy(builder);
                return this;
            }

            public Builder setLiveRevenueCampaignVip(LiveRevenueCampaignVip.Builder builder) {
                copyOnWrite();
                ((LiveChatMessage) this.instance).setLiveRevenueCampaignVip(builder);
                return this;
            }

            public Builder setMedal(MedalMessage.Builder builder) {
                copyOnWrite();
                ((LiveChatMessage) this.instance).setMedal(builder);
                return this;
            }

            public Builder setSharedVoiceLiveInfo(SharedVoiceLiveInfo.Builder builder) {
                copyOnWrite();
                ((LiveChatMessage) this.instance).setSharedVoiceLiveInfo(builder);
                return this;
            }

            public Builder setStarlightHierarchy(HierarchyMessage.Builder builder) {
                copyOnWrite();
                ((LiveChatMessage) this.instance).setStarlightHierarchy(builder);
                return this;
            }

            public Builder setTemplate(Template.TemplateData.Builder builder) {
                copyOnWrite();
                ((LiveChatMessage) this.instance).setTemplate(builder);
                return this;
            }
        }

        public static LiveChatMessage parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (LiveChatMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static LiveChatMessage parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (LiveChatMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static LiveChatMessage parseFrom(InputStream inputStream) throws IOException {
            return (LiveChatMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LiveChatMessage parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (LiveChatMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static LiveChatMessage parseFrom(C3430e c3430e) throws IOException {
            return (LiveChatMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static LiveChatMessage parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (LiveChatMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }

    public static final class LiveChatMessageExtInfo extends GeneratedMessageLite<LiveChatMessageExtInfo, Builder> implements LiveChatMessageExtInfoOrBuilder {
        public static final int ATUSERINFOS_FIELD_NUMBER = 9;
        public static final int COLORFULMODE_FIELD_NUMBER = 12;
        private static final LiveChatMessageExtInfo DEFAULT_INSTANCE;
        public static final int GROUPCONTROL_FIELD_NUMBER = 7;
        public static final int GROUPTYPE_FIELD_NUMBER = 8;
        public static final int IMAGEURL_FIELD_NUMBER = 1;
        public static final int MASKMODE_FIELD_NUMBER = 4;
        public static final int MASK_FIELD_NUMBER = 3;
        private static volatile ng60<LiveChatMessageExtInfo> PARSER = null;
        public static final int SENDERCITYID_FIELD_NUMBER = 2;
        public static final int SHAREDVOICEROOMID_FIELD_NUMBER = 10;
        public static final int TRACEINFO_FIELD_NUMBER = 11;
        public static final int USERMASK_FIELD_NUMBER = 6;
        private int bitField0_;
        private boolean colorfulMode_;
        private boolean groupControl_;
        private boolean maskMode_;
        private Mask mask_;
        private userMaskConfig.UserMask userMask_;
        private String imageUrl_ = "";
        private String senderCityID_ = "";
        private String groupType_ = "";
        private C3437l.h<AtUserInfo> atUserInfos_ = GeneratedMessageLite.emptyProtobufList();
        private String sharedVoiceRoomID_ = "";
        private String traceInfo_ = "";

        static {
            LiveChatMessageExtInfo liveChatMessageExtInfo = new LiveChatMessageExtInfo();
            DEFAULT_INSTANCE = liveChatMessageExtInfo;
            liveChatMessageExtInfo.makeImmutable();
        }

        private LiveChatMessageExtInfo() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllAtUserInfos(Iterable<? extends AtUserInfo> iterable) {
            ensureAtUserInfosIsMutable();
            AbstractC3426a.addAll(iterable, this.atUserInfos_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAtUserInfos(AtUserInfo.Builder builder) {
            ensureAtUserInfosIsMutable();
            this.atUserInfos_.add(builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAtUserInfos() {
            this.atUserInfos_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearColorfulMode() {
            this.colorfulMode_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGroupControl() {
            this.groupControl_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGroupType() {
            this.groupType_ = getDefaultInstance().getGroupType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearImageUrl() {
            this.imageUrl_ = getDefaultInstance().getImageUrl();
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
        public void clearSenderCityID() {
            this.senderCityID_ = getDefaultInstance().getSenderCityID();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSharedVoiceRoomID() {
            this.sharedVoiceRoomID_ = getDefaultInstance().getSharedVoiceRoomID();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTraceInfo() {
            this.traceInfo_ = getDefaultInstance().getTraceInfo();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUserMask() {
            this.userMask_ = null;
        }

        private void ensureAtUserInfosIsMutable() {
            if (this.atUserInfos_.mo17140q()) {
                return;
            }
            this.atUserInfos_ = GeneratedMessageLite.mutableCopy(this.atUserInfos_);
        }

        public static LiveChatMessageExtInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeMask(Mask mask) {
            Mask mask2 = this.mask_;
            if (mask2 == null || mask2 == Mask.getDefaultInstance()) {
                this.mask_ = mask;
            } else {
                this.mask_ = Mask.newBuilder(this.mask_).mergeFrom(mask).buildPartial();
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

        public static Builder newBuilder(LiveChatMessageExtInfo liveChatMessageExtInfo) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(liveChatMessageExtInfo);
        }

        public static LiveChatMessageExtInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (LiveChatMessageExtInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LiveChatMessageExtInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (LiveChatMessageExtInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<LiveChatMessageExtInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeAtUserInfos(int i) {
            ensureAtUserInfosIsMutable();
            this.atUserInfos_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAtUserInfos(int i, AtUserInfo.Builder builder) {
            ensureAtUserInfosIsMutable();
            this.atUserInfos_.set(i, builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setColorfulMode(boolean z) {
            this.colorfulMode_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGroupControl(boolean z) {
            this.groupControl_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGroupType(String str) {
            str.getClass();
            this.groupType_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGroupTypeBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.groupType_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setImageUrl(String str) {
            str.getClass();
            this.imageUrl_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setImageUrlBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.imageUrl_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMask(Mask.Builder builder) {
            this.mask_ = builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMaskMode(boolean z) {
            this.maskMode_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSenderCityID(String str) {
            str.getClass();
            this.senderCityID_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSenderCityIDBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.senderCityID_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSharedVoiceRoomID(String str) {
            str.getClass();
            this.sharedVoiceRoomID_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSharedVoiceRoomIDBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.sharedVoiceRoomID_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTraceInfo(String str) {
            str.getClass();
            this.traceInfo_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTraceInfoBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.traceInfo_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserMask(userMaskConfig.UserMask.Builder builder) {
            this.userMask_ = builder.build();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C45911.f16674xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new LiveChatMessageExtInfo();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.atUserInfos_.mo17139n();
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    LiveChatMessageExtInfo liveChatMessageExtInfo = (LiveChatMessageExtInfo) obj2;
                    this.imageUrl_ = interfaceC3409h.mo17052f(!this.imageUrl_.isEmpty(), this.imageUrl_, !liveChatMessageExtInfo.imageUrl_.isEmpty(), liveChatMessageExtInfo.imageUrl_);
                    this.senderCityID_ = interfaceC3409h.mo17052f(!this.senderCityID_.isEmpty(), this.senderCityID_, !liveChatMessageExtInfo.senderCityID_.isEmpty(), liveChatMessageExtInfo.senderCityID_);
                    this.mask_ = (Mask) interfaceC3409h.mo17061o(this.mask_, liveChatMessageExtInfo.mask_);
                    boolean z = this.maskMode_;
                    boolean z2 = liveChatMessageExtInfo.maskMode_;
                    this.maskMode_ = interfaceC3409h.mo17050d(z, z, z2, z2);
                    this.userMask_ = (userMaskConfig.UserMask) interfaceC3409h.mo17061o(this.userMask_, liveChatMessageExtInfo.userMask_);
                    boolean z3 = this.groupControl_;
                    boolean z4 = liveChatMessageExtInfo.groupControl_;
                    this.groupControl_ = interfaceC3409h.mo17050d(z3, z3, z4, z4);
                    this.groupType_ = interfaceC3409h.mo17052f(!this.groupType_.isEmpty(), this.groupType_, !liveChatMessageExtInfo.groupType_.isEmpty(), liveChatMessageExtInfo.groupType_);
                    this.atUserInfos_ = interfaceC3409h.mo17053g(this.atUserInfos_, liveChatMessageExtInfo.atUserInfos_);
                    this.sharedVoiceRoomID_ = interfaceC3409h.mo17052f(!this.sharedVoiceRoomID_.isEmpty(), this.sharedVoiceRoomID_, !liveChatMessageExtInfo.sharedVoiceRoomID_.isEmpty(), liveChatMessageExtInfo.sharedVoiceRoomID_);
                    this.traceInfo_ = interfaceC3409h.mo17052f(!this.traceInfo_.isEmpty(), this.traceInfo_, true ^ liveChatMessageExtInfo.traceInfo_.isEmpty(), liveChatMessageExtInfo.traceInfo_);
                    boolean z5 = this.colorfulMode_;
                    boolean z6 = liveChatMessageExtInfo.colorfulMode_;
                    this.colorfulMode_ = interfaceC3409h.mo17050d(z5, z5, z6, z6);
                    if (interfaceC3409h == GeneratedMessageLite.C3408g.INSTANCE) {
                        this.bitField0_ |= liveChatMessageExtInfo.bitField0_;
                    }
                    return this;
                case 6:
                    C3430e c3430e = (C3430e) obj;
                    C3433h c3433h = (C3433h) obj2;
                    boolean z7 = false;
                    while (!z7) {
                        try {
                            int iM17171M = c3430e.m17171M();
                            switch (iM17171M) {
                                case 0:
                                    break;
                                case 10:
                                    this.imageUrl_ = c3430e.m17170L();
                                    continue;
                                case 18:
                                    this.senderCityID_ = c3430e.m17170L();
                                    continue;
                                case 26:
                                    Mask mask = this.mask_;
                                    Mask.Builder builder = mask != null ? mask.toBuilder() : null;
                                    Mask mask2 = (Mask) c3430e.m17198w(Mask.parser(), c3433h);
                                    this.mask_ = mask2;
                                    if (builder != null) {
                                        builder.mergeFrom(mask2);
                                        this.mask_ = builder.buildPartial();
                                    } else {
                                        continue;
                                    }
                                    break;
                                case 32:
                                    this.maskMode_ = c3430e.m17188m();
                                    continue;
                                case 50:
                                    userMaskConfig.UserMask userMask = this.userMask_;
                                    userMaskConfig.UserMask.Builder builder2 = userMask != null ? userMask.toBuilder() : null;
                                    userMaskConfig.UserMask userMask2 = (userMaskConfig.UserMask) c3430e.m17198w(userMaskConfig.UserMask.parser(), c3433h);
                                    this.userMask_ = userMask2;
                                    if (builder2 != null) {
                                        builder2.mergeFrom(userMask2);
                                        this.userMask_ = builder2.buildPartial();
                                    } else {
                                        continue;
                                    }
                                    break;
                                case 56:
                                    this.groupControl_ = c3430e.m17188m();
                                    continue;
                                case 66:
                                    this.groupType_ = c3430e.m17170L();
                                    continue;
                                case 74:
                                    if (!this.atUserInfos_.mo17140q()) {
                                        this.atUserInfos_ = GeneratedMessageLite.mutableCopy(this.atUserInfos_);
                                    }
                                    this.atUserInfos_.add((AtUserInfo) c3430e.m17198w(AtUserInfo.parser(), c3433h));
                                    continue;
                                case EACTags.COMMAND_TO_PERFORM /* 82 */:
                                    this.sharedVoiceRoomID_ = c3430e.m17170L();
                                    continue;
                                case 90:
                                    this.traceInfo_ = c3430e.m17170L();
                                    continue;
                                case Opcodes.IADD /* 96 */:
                                    this.colorfulMode_ = c3430e.m17188m();
                                    continue;
                                default:
                                    if (!c3430e.m17176R(iM17171M)) {
                                        break;
                                    }
                                    break;
                            }
                            z7 = true;
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
                        synchronized (LiveChatMessageExtInfo.class) {
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

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageExtInfoOrBuilder
        public AtUserInfo getAtUserInfos(int i) {
            return this.atUserInfos_.get(i);
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageExtInfoOrBuilder
        public int getAtUserInfosCount() {
            return this.atUserInfos_.size();
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageExtInfoOrBuilder
        public List<AtUserInfo> getAtUserInfosList() {
            return this.atUserInfos_;
        }

        public AtUserInfoOrBuilder getAtUserInfosOrBuilder(int i) {
            return this.atUserInfos_.get(i);
        }

        public List<? extends AtUserInfoOrBuilder> getAtUserInfosOrBuilderList() {
            return this.atUserInfos_;
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageExtInfoOrBuilder
        public boolean getColorfulMode() {
            return this.colorfulMode_;
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageExtInfoOrBuilder
        public boolean getGroupControl() {
            return this.groupControl_;
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageExtInfoOrBuilder
        public String getGroupType() {
            return this.groupType_;
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageExtInfoOrBuilder
        public ByteString getGroupTypeBytes() {
            return ByteString.copyFromUtf8(this.groupType_);
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageExtInfoOrBuilder
        public String getImageUrl() {
            return this.imageUrl_;
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageExtInfoOrBuilder
        public ByteString getImageUrlBytes() {
            return ByteString.copyFromUtf8(this.imageUrl_);
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageExtInfoOrBuilder
        public Mask getMask() {
            Mask mask = this.mask_;
            return mask == null ? Mask.getDefaultInstance() : mask;
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageExtInfoOrBuilder
        public boolean getMaskMode() {
            return this.maskMode_;
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageExtInfoOrBuilder
        public String getSenderCityID() {
            return this.senderCityID_;
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageExtInfoOrBuilder
        public ByteString getSenderCityIDBytes() {
            return ByteString.copyFromUtf8(this.senderCityID_);
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16956K = !this.imageUrl_.isEmpty() ? CodedOutputStream.m16956K(1, getImageUrl()) : 0;
            if (!this.senderCityID_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(2, getSenderCityID());
            }
            if (this.mask_ != null) {
                iM16956K += CodedOutputStream.m16948C(3, getMask());
            }
            boolean z = this.maskMode_;
            if (z) {
                iM16956K += CodedOutputStream.m16970f(4, z);
            }
            if (this.userMask_ != null) {
                iM16956K += CodedOutputStream.m16948C(6, getUserMask());
            }
            boolean z2 = this.groupControl_;
            if (z2) {
                iM16956K += CodedOutputStream.m16970f(7, z2);
            }
            if (!this.groupType_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(8, getGroupType());
            }
            for (int i2 = 0; i2 < this.atUserInfos_.size(); i2++) {
                iM16956K += CodedOutputStream.m16948C(9, this.atUserInfos_.get(i2));
            }
            if (!this.sharedVoiceRoomID_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(10, getSharedVoiceRoomID());
            }
            if (!this.traceInfo_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(11, getTraceInfo());
            }
            boolean z3 = this.colorfulMode_;
            if (z3) {
                iM16956K += CodedOutputStream.m16970f(12, z3);
            }
            this.memoizedSerializedSize = iM16956K;
            return iM16956K;
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageExtInfoOrBuilder
        public String getSharedVoiceRoomID() {
            return this.sharedVoiceRoomID_;
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageExtInfoOrBuilder
        public ByteString getSharedVoiceRoomIDBytes() {
            return ByteString.copyFromUtf8(this.sharedVoiceRoomID_);
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageExtInfoOrBuilder
        public String getTraceInfo() {
            return this.traceInfo_;
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageExtInfoOrBuilder
        public ByteString getTraceInfoBytes() {
            return ByteString.copyFromUtf8(this.traceInfo_);
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageExtInfoOrBuilder
        public userMaskConfig.UserMask getUserMask() {
            userMaskConfig.UserMask userMask = this.userMask_;
            return userMask == null ? userMaskConfig.UserMask.getDefaultInstance() : userMask;
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageExtInfoOrBuilder
        public boolean hasMask() {
            return this.mask_ != null;
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageExtInfoOrBuilder
        public boolean hasUserMask() {
            return this.userMask_ != null;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.imageUrl_.isEmpty()) {
                codedOutputStream.mo16994D0(1, getImageUrl());
            }
            if (!this.senderCityID_.isEmpty()) {
                codedOutputStream.mo16994D0(2, getSenderCityID());
            }
            if (this.mask_ != null) {
                codedOutputStream.mo17029w0(3, getMask());
            }
            boolean z = this.maskMode_;
            if (z) {
                codedOutputStream.mo17005a0(4, z);
            }
            if (this.userMask_ != null) {
                codedOutputStream.mo17029w0(6, getUserMask());
            }
            boolean z2 = this.groupControl_;
            if (z2) {
                codedOutputStream.mo17005a0(7, z2);
            }
            if (!this.groupType_.isEmpty()) {
                codedOutputStream.mo16994D0(8, getGroupType());
            }
            for (int i = 0; i < this.atUserInfos_.size(); i++) {
                codedOutputStream.mo17029w0(9, this.atUserInfos_.get(i));
            }
            if (!this.sharedVoiceRoomID_.isEmpty()) {
                codedOutputStream.mo16994D0(10, getSharedVoiceRoomID());
            }
            if (!this.traceInfo_.isEmpty()) {
                codedOutputStream.mo16994D0(11, getTraceInfo());
            }
            boolean z3 = this.colorfulMode_;
            if (z3) {
                codedOutputStream.mo17005a0(12, z3);
            }
        }

        public static LiveChatMessageExtInfo parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (LiveChatMessageExtInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static LiveChatMessageExtInfo parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (LiveChatMessageExtInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMask(Mask mask) {
            mask.getClass();
            this.mask_ = mask;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserMask(userMaskConfig.UserMask userMask) {
            userMask.getClass();
            this.userMask_ = userMask;
        }

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<LiveChatMessageExtInfo, Builder> implements LiveChatMessageExtInfoOrBuilder {
            private Builder() {
                super(LiveChatMessageExtInfo.DEFAULT_INSTANCE);
            }

            public Builder addAllAtUserInfos(Iterable<? extends AtUserInfo> iterable) {
                copyOnWrite();
                ((LiveChatMessageExtInfo) this.instance).addAllAtUserInfos(iterable);
                return this;
            }

            public Builder addAtUserInfos(AtUserInfo atUserInfo) {
                copyOnWrite();
                ((LiveChatMessageExtInfo) this.instance).addAtUserInfos(atUserInfo);
                return this;
            }

            public Builder clearAtUserInfos() {
                copyOnWrite();
                ((LiveChatMessageExtInfo) this.instance).clearAtUserInfos();
                return this;
            }

            public Builder clearColorfulMode() {
                copyOnWrite();
                ((LiveChatMessageExtInfo) this.instance).clearColorfulMode();
                return this;
            }

            public Builder clearGroupControl() {
                copyOnWrite();
                ((LiveChatMessageExtInfo) this.instance).clearGroupControl();
                return this;
            }

            public Builder clearGroupType() {
                copyOnWrite();
                ((LiveChatMessageExtInfo) this.instance).clearGroupType();
                return this;
            }

            public Builder clearImageUrl() {
                copyOnWrite();
                ((LiveChatMessageExtInfo) this.instance).clearImageUrl();
                return this;
            }

            public Builder clearMask() {
                copyOnWrite();
                ((LiveChatMessageExtInfo) this.instance).clearMask();
                return this;
            }

            public Builder clearMaskMode() {
                copyOnWrite();
                ((LiveChatMessageExtInfo) this.instance).clearMaskMode();
                return this;
            }

            public Builder clearSenderCityID() {
                copyOnWrite();
                ((LiveChatMessageExtInfo) this.instance).clearSenderCityID();
                return this;
            }

            public Builder clearSharedVoiceRoomID() {
                copyOnWrite();
                ((LiveChatMessageExtInfo) this.instance).clearSharedVoiceRoomID();
                return this;
            }

            public Builder clearTraceInfo() {
                copyOnWrite();
                ((LiveChatMessageExtInfo) this.instance).clearTraceInfo();
                return this;
            }

            public Builder clearUserMask() {
                copyOnWrite();
                ((LiveChatMessageExtInfo) this.instance).clearUserMask();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageExtInfoOrBuilder
            public AtUserInfo getAtUserInfos(int i) {
                return ((LiveChatMessageExtInfo) this.instance).getAtUserInfos(i);
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageExtInfoOrBuilder
            public int getAtUserInfosCount() {
                return ((LiveChatMessageExtInfo) this.instance).getAtUserInfosCount();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageExtInfoOrBuilder
            public List<AtUserInfo> getAtUserInfosList() {
                return Collections.unmodifiableList(((LiveChatMessageExtInfo) this.instance).getAtUserInfosList());
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageExtInfoOrBuilder
            public boolean getColorfulMode() {
                return ((LiveChatMessageExtInfo) this.instance).getColorfulMode();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageExtInfoOrBuilder
            public boolean getGroupControl() {
                return ((LiveChatMessageExtInfo) this.instance).getGroupControl();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageExtInfoOrBuilder
            public String getGroupType() {
                return ((LiveChatMessageExtInfo) this.instance).getGroupType();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageExtInfoOrBuilder
            public ByteString getGroupTypeBytes() {
                return ((LiveChatMessageExtInfo) this.instance).getGroupTypeBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageExtInfoOrBuilder
            public String getImageUrl() {
                return ((LiveChatMessageExtInfo) this.instance).getImageUrl();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageExtInfoOrBuilder
            public ByteString getImageUrlBytes() {
                return ((LiveChatMessageExtInfo) this.instance).getImageUrlBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageExtInfoOrBuilder
            public Mask getMask() {
                return ((LiveChatMessageExtInfo) this.instance).getMask();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageExtInfoOrBuilder
            public boolean getMaskMode() {
                return ((LiveChatMessageExtInfo) this.instance).getMaskMode();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageExtInfoOrBuilder
            public String getSenderCityID() {
                return ((LiveChatMessageExtInfo) this.instance).getSenderCityID();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageExtInfoOrBuilder
            public ByteString getSenderCityIDBytes() {
                return ((LiveChatMessageExtInfo) this.instance).getSenderCityIDBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageExtInfoOrBuilder
            public String getSharedVoiceRoomID() {
                return ((LiveChatMessageExtInfo) this.instance).getSharedVoiceRoomID();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageExtInfoOrBuilder
            public ByteString getSharedVoiceRoomIDBytes() {
                return ((LiveChatMessageExtInfo) this.instance).getSharedVoiceRoomIDBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageExtInfoOrBuilder
            public String getTraceInfo() {
                return ((LiveChatMessageExtInfo) this.instance).getTraceInfo();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageExtInfoOrBuilder
            public ByteString getTraceInfoBytes() {
                return ((LiveChatMessageExtInfo) this.instance).getTraceInfoBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageExtInfoOrBuilder
            public userMaskConfig.UserMask getUserMask() {
                return ((LiveChatMessageExtInfo) this.instance).getUserMask();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageExtInfoOrBuilder
            public boolean hasMask() {
                return ((LiveChatMessageExtInfo) this.instance).hasMask();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageExtInfoOrBuilder
            public boolean hasUserMask() {
                return ((LiveChatMessageExtInfo) this.instance).hasUserMask();
            }

            public Builder mergeMask(Mask mask) {
                copyOnWrite();
                ((LiveChatMessageExtInfo) this.instance).mergeMask(mask);
                return this;
            }

            public Builder mergeUserMask(userMaskConfig.UserMask userMask) {
                copyOnWrite();
                ((LiveChatMessageExtInfo) this.instance).mergeUserMask(userMask);
                return this;
            }

            public Builder removeAtUserInfos(int i) {
                copyOnWrite();
                ((LiveChatMessageExtInfo) this.instance).removeAtUserInfos(i);
                return this;
            }

            public Builder setAtUserInfos(int i, AtUserInfo atUserInfo) {
                copyOnWrite();
                ((LiveChatMessageExtInfo) this.instance).setAtUserInfos(i, atUserInfo);
                return this;
            }

            public Builder setColorfulMode(boolean z) {
                copyOnWrite();
                ((LiveChatMessageExtInfo) this.instance).setColorfulMode(z);
                return this;
            }

            public Builder setGroupControl(boolean z) {
                copyOnWrite();
                ((LiveChatMessageExtInfo) this.instance).setGroupControl(z);
                return this;
            }

            public Builder setGroupType(String str) {
                copyOnWrite();
                ((LiveChatMessageExtInfo) this.instance).setGroupType(str);
                return this;
            }

            public Builder setGroupTypeBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveChatMessageExtInfo) this.instance).setGroupTypeBytes(byteString);
                return this;
            }

            public Builder setImageUrl(String str) {
                copyOnWrite();
                ((LiveChatMessageExtInfo) this.instance).setImageUrl(str);
                return this;
            }

            public Builder setImageUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveChatMessageExtInfo) this.instance).setImageUrlBytes(byteString);
                return this;
            }

            public Builder setMask(Mask mask) {
                copyOnWrite();
                ((LiveChatMessageExtInfo) this.instance).setMask(mask);
                return this;
            }

            public Builder setMaskMode(boolean z) {
                copyOnWrite();
                ((LiveChatMessageExtInfo) this.instance).setMaskMode(z);
                return this;
            }

            public Builder setSenderCityID(String str) {
                copyOnWrite();
                ((LiveChatMessageExtInfo) this.instance).setSenderCityID(str);
                return this;
            }

            public Builder setSenderCityIDBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveChatMessageExtInfo) this.instance).setSenderCityIDBytes(byteString);
                return this;
            }

            public Builder setSharedVoiceRoomID(String str) {
                copyOnWrite();
                ((LiveChatMessageExtInfo) this.instance).setSharedVoiceRoomID(str);
                return this;
            }

            public Builder setSharedVoiceRoomIDBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveChatMessageExtInfo) this.instance).setSharedVoiceRoomIDBytes(byteString);
                return this;
            }

            public Builder setTraceInfo(String str) {
                copyOnWrite();
                ((LiveChatMessageExtInfo) this.instance).setTraceInfo(str);
                return this;
            }

            public Builder setTraceInfoBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveChatMessageExtInfo) this.instance).setTraceInfoBytes(byteString);
                return this;
            }

            public Builder setUserMask(userMaskConfig.UserMask userMask) {
                copyOnWrite();
                ((LiveChatMessageExtInfo) this.instance).setUserMask(userMask);
                return this;
            }

            public Builder addAtUserInfos(int i, AtUserInfo atUserInfo) {
                copyOnWrite();
                ((LiveChatMessageExtInfo) this.instance).addAtUserInfos(i, atUserInfo);
                return this;
            }

            public Builder setAtUserInfos(int i, AtUserInfo.Builder builder) {
                copyOnWrite();
                ((LiveChatMessageExtInfo) this.instance).setAtUserInfos(i, builder);
                return this;
            }

            public Builder setMask(Mask.Builder builder) {
                copyOnWrite();
                ((LiveChatMessageExtInfo) this.instance).setMask(builder);
                return this;
            }

            public Builder setUserMask(userMaskConfig.UserMask.Builder builder) {
                copyOnWrite();
                ((LiveChatMessageExtInfo) this.instance).setUserMask(builder);
                return this;
            }

            public Builder addAtUserInfos(AtUserInfo.Builder builder) {
                copyOnWrite();
                ((LiveChatMessageExtInfo) this.instance).addAtUserInfos(builder);
                return this;
            }

            public Builder addAtUserInfos(int i, AtUserInfo.Builder builder) {
                copyOnWrite();
                ((LiveChatMessageExtInfo) this.instance).addAtUserInfos(i, builder);
                return this;
            }
        }

        public static LiveChatMessageExtInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (LiveChatMessageExtInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static LiveChatMessageExtInfo parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (LiveChatMessageExtInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static LiveChatMessageExtInfo parseFrom(InputStream inputStream) throws IOException {
            return (LiveChatMessageExtInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LiveChatMessageExtInfo parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (LiveChatMessageExtInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static LiveChatMessageExtInfo parseFrom(C3430e c3430e) throws IOException {
            return (LiveChatMessageExtInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAtUserInfos(int i, AtUserInfo atUserInfo) {
            atUserInfo.getClass();
            ensureAtUserInfosIsMutable();
            this.atUserInfos_.add(i, atUserInfo);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static LiveChatMessageExtInfo parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (LiveChatMessageExtInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAtUserInfos(int i, AtUserInfo atUserInfo) {
            atUserInfo.getClass();
            ensureAtUserInfosIsMutable();
            this.atUserInfos_.set(i, atUserInfo);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAtUserInfos(AtUserInfo atUserInfo) {
            atUserInfo.getClass();
            ensureAtUserInfosIsMutable();
            this.atUserInfos_.add(atUserInfo);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAtUserInfos(int i, AtUserInfo.Builder builder) {
            ensureAtUserInfosIsMutable();
            this.atUserInfos_.add(i, builder.build());
        }
    }

    public enum LiveChatMessageType implements C3437l.c {
        TEXT(0),
        GIFT(1),
        BULLETCOMMENT(2),
        UNRECOGNIZED(-1);

        public static final int BULLETCOMMENT_VALUE = 2;
        public static final int GIFT_VALUE = 1;
        public static final int TEXT_VALUE = 0;
        private static final C3437l.d<LiveChatMessageType> internalValueMap = new C3437l.d<LiveChatMessageType>() { // from class: com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatMessageType.1
            @Override // com.google.protobuf.C3437l.d
            public LiveChatMessageType findValueByNumber(int i) {
                return LiveChatMessageType.forNumber(i);
            }
        };
        private final int value;

        LiveChatMessageType(int i) {
            this.value = i;
        }

        public static LiveChatMessageType forNumber(int i) {
            if (i == 0) {
                return TEXT;
            }
            if (i == 1) {
                return GIFT;
            }
            if (i != 2) {
                return null;
            }
            return BULLETCOMMENT;
        }

        public static C3437l.d<LiveChatMessageType> internalGetValueMap() {
            return internalValueMap;
        }

        @Override // com.google.protobuf.C3437l.c
        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static LiveChatMessageType valueOf(int i) {
            return forNumber(i);
        }
    }

    public static final class LiveChatShadingConfig extends GeneratedMessageLite<LiveChatShadingConfig, Builder> implements LiveChatShadingConfigOrBuilder {
        public static final int BACKGROUNDCOLORCONFIG_FIELD_NUMBER = 2;
        public static final int BORDERCOLORCONFIG_FIELD_NUMBER = 1;
        public static final int CORNERCONFIG_FIELD_NUMBER = 3;
        private static final LiveChatShadingConfig DEFAULT_INSTANCE;
        private static volatile ng60<LiveChatShadingConfig> PARSER;
        private LiveBackgroundColorConfig backgroundColorConfig_;
        private LiveBackgroundColorConfig borderColorConfig_;
        private LiveCornerConfig cornerConfig_;

        static {
            LiveChatShadingConfig liveChatShadingConfig = new LiveChatShadingConfig();
            DEFAULT_INSTANCE = liveChatShadingConfig;
            liveChatShadingConfig.makeImmutable();
        }

        private LiveChatShadingConfig() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBackgroundColorConfig() {
            this.backgroundColorConfig_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBorderColorConfig() {
            this.borderColorConfig_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCornerConfig() {
            this.cornerConfig_ = null;
        }

        public static LiveChatShadingConfig getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeBackgroundColorConfig(LiveBackgroundColorConfig liveBackgroundColorConfig) {
            LiveBackgroundColorConfig liveBackgroundColorConfig2 = this.backgroundColorConfig_;
            if (liveBackgroundColorConfig2 == null || liveBackgroundColorConfig2 == LiveBackgroundColorConfig.getDefaultInstance()) {
                this.backgroundColorConfig_ = liveBackgroundColorConfig;
            } else {
                this.backgroundColorConfig_ = LiveBackgroundColorConfig.newBuilder(this.backgroundColorConfig_).mergeFrom(liveBackgroundColorConfig).buildPartial();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeBorderColorConfig(LiveBackgroundColorConfig liveBackgroundColorConfig) {
            LiveBackgroundColorConfig liveBackgroundColorConfig2 = this.borderColorConfig_;
            if (liveBackgroundColorConfig2 == null || liveBackgroundColorConfig2 == LiveBackgroundColorConfig.getDefaultInstance()) {
                this.borderColorConfig_ = liveBackgroundColorConfig;
            } else {
                this.borderColorConfig_ = LiveBackgroundColorConfig.newBuilder(this.borderColorConfig_).mergeFrom(liveBackgroundColorConfig).buildPartial();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeCornerConfig(LiveCornerConfig liveCornerConfig) {
            LiveCornerConfig liveCornerConfig2 = this.cornerConfig_;
            if (liveCornerConfig2 == null || liveCornerConfig2 == LiveCornerConfig.getDefaultInstance()) {
                this.cornerConfig_ = liveCornerConfig;
            } else {
                this.cornerConfig_ = LiveCornerConfig.newBuilder(this.cornerConfig_).mergeFrom(liveCornerConfig).buildPartial();
            }
        }

        public static Builder newBuilder(LiveChatShadingConfig liveChatShadingConfig) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(liveChatShadingConfig);
        }

        public static LiveChatShadingConfig parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (LiveChatShadingConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LiveChatShadingConfig parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (LiveChatShadingConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<LiveChatShadingConfig> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBackgroundColorConfig(LiveBackgroundColorConfig.Builder builder) {
            this.backgroundColorConfig_ = builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBorderColorConfig(LiveBackgroundColorConfig.Builder builder) {
            this.borderColorConfig_ = builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCornerConfig(LiveCornerConfig.Builder builder) {
            this.cornerConfig_ = builder.build();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C45911.f16674xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new LiveChatShadingConfig();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    LiveChatShadingConfig liveChatShadingConfig = (LiveChatShadingConfig) obj2;
                    this.borderColorConfig_ = (LiveBackgroundColorConfig) interfaceC3409h.mo17061o(this.borderColorConfig_, liveChatShadingConfig.borderColorConfig_);
                    this.backgroundColorConfig_ = (LiveBackgroundColorConfig) interfaceC3409h.mo17061o(this.backgroundColorConfig_, liveChatShadingConfig.backgroundColorConfig_);
                    this.cornerConfig_ = (LiveCornerConfig) interfaceC3409h.mo17061o(this.cornerConfig_, liveChatShadingConfig.cornerConfig_);
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
                                    LiveBackgroundColorConfig liveBackgroundColorConfig = this.borderColorConfig_;
                                    LiveBackgroundColorConfig.Builder builder = liveBackgroundColorConfig != null ? liveBackgroundColorConfig.toBuilder() : null;
                                    LiveBackgroundColorConfig liveBackgroundColorConfig2 = (LiveBackgroundColorConfig) c3430e.m17198w(LiveBackgroundColorConfig.parser(), c3433h);
                                    this.borderColorConfig_ = liveBackgroundColorConfig2;
                                    if (builder != null) {
                                        builder.mergeFrom(liveBackgroundColorConfig2);
                                        this.borderColorConfig_ = builder.buildPartial();
                                    }
                                } else if (iM17171M == 18) {
                                    LiveBackgroundColorConfig liveBackgroundColorConfig3 = this.backgroundColorConfig_;
                                    LiveBackgroundColorConfig.Builder builder2 = liveBackgroundColorConfig3 != null ? liveBackgroundColorConfig3.toBuilder() : null;
                                    LiveBackgroundColorConfig liveBackgroundColorConfig4 = (LiveBackgroundColorConfig) c3430e.m17198w(LiveBackgroundColorConfig.parser(), c3433h);
                                    this.backgroundColorConfig_ = liveBackgroundColorConfig4;
                                    if (builder2 != null) {
                                        builder2.mergeFrom(liveBackgroundColorConfig4);
                                        this.backgroundColorConfig_ = builder2.buildPartial();
                                    }
                                } else if (iM17171M == 26) {
                                    LiveCornerConfig liveCornerConfig = this.cornerConfig_;
                                    LiveCornerConfig.Builder builder3 = liveCornerConfig != null ? liveCornerConfig.toBuilder() : null;
                                    LiveCornerConfig liveCornerConfig2 = (LiveCornerConfig) c3430e.m17198w(LiveCornerConfig.parser(), c3433h);
                                    this.cornerConfig_ = liveCornerConfig2;
                                    if (builder3 != null) {
                                        builder3.mergeFrom(liveCornerConfig2);
                                        this.cornerConfig_ = builder3.buildPartial();
                                    }
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
                        synchronized (LiveChatShadingConfig.class) {
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

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatShadingConfigOrBuilder
        public LiveBackgroundColorConfig getBackgroundColorConfig() {
            LiveBackgroundColorConfig liveBackgroundColorConfig = this.backgroundColorConfig_;
            return liveBackgroundColorConfig == null ? LiveBackgroundColorConfig.getDefaultInstance() : liveBackgroundColorConfig;
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatShadingConfigOrBuilder
        public LiveBackgroundColorConfig getBorderColorConfig() {
            LiveBackgroundColorConfig liveBackgroundColorConfig = this.borderColorConfig_;
            return liveBackgroundColorConfig == null ? LiveBackgroundColorConfig.getDefaultInstance() : liveBackgroundColorConfig;
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatShadingConfigOrBuilder
        public LiveCornerConfig getCornerConfig() {
            LiveCornerConfig liveCornerConfig = this.cornerConfig_;
            return liveCornerConfig == null ? LiveCornerConfig.getDefaultInstance() : liveCornerConfig;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16948C = this.borderColorConfig_ != null ? CodedOutputStream.m16948C(1, getBorderColorConfig()) : 0;
            if (this.backgroundColorConfig_ != null) {
                iM16948C += CodedOutputStream.m16948C(2, getBackgroundColorConfig());
            }
            if (this.cornerConfig_ != null) {
                iM16948C += CodedOutputStream.m16948C(3, getCornerConfig());
            }
            this.memoizedSerializedSize = iM16948C;
            return iM16948C;
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatShadingConfigOrBuilder
        public boolean hasBackgroundColorConfig() {
            return this.backgroundColorConfig_ != null;
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatShadingConfigOrBuilder
        public boolean hasBorderColorConfig() {
            return this.borderColorConfig_ != null;
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatShadingConfigOrBuilder
        public boolean hasCornerConfig() {
            return this.cornerConfig_ != null;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.borderColorConfig_ != null) {
                codedOutputStream.mo17029w0(1, getBorderColorConfig());
            }
            if (this.backgroundColorConfig_ != null) {
                codedOutputStream.mo17029w0(2, getBackgroundColorConfig());
            }
            if (this.cornerConfig_ != null) {
                codedOutputStream.mo17029w0(3, getCornerConfig());
            }
        }

        public static LiveChatShadingConfig parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (LiveChatShadingConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static LiveChatShadingConfig parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (LiveChatShadingConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBackgroundColorConfig(LiveBackgroundColorConfig liveBackgroundColorConfig) {
            liveBackgroundColorConfig.getClass();
            this.backgroundColorConfig_ = liveBackgroundColorConfig;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBorderColorConfig(LiveBackgroundColorConfig liveBackgroundColorConfig) {
            liveBackgroundColorConfig.getClass();
            this.borderColorConfig_ = liveBackgroundColorConfig;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCornerConfig(LiveCornerConfig liveCornerConfig) {
            liveCornerConfig.getClass();
            this.cornerConfig_ = liveCornerConfig;
        }

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<LiveChatShadingConfig, Builder> implements LiveChatShadingConfigOrBuilder {
            private Builder() {
                super(LiveChatShadingConfig.DEFAULT_INSTANCE);
            }

            public Builder clearBackgroundColorConfig() {
                copyOnWrite();
                ((LiveChatShadingConfig) this.instance).clearBackgroundColorConfig();
                return this;
            }

            public Builder clearBorderColorConfig() {
                copyOnWrite();
                ((LiveChatShadingConfig) this.instance).clearBorderColorConfig();
                return this;
            }

            public Builder clearCornerConfig() {
                copyOnWrite();
                ((LiveChatShadingConfig) this.instance).clearCornerConfig();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatShadingConfigOrBuilder
            public LiveBackgroundColorConfig getBackgroundColorConfig() {
                return ((LiveChatShadingConfig) this.instance).getBackgroundColorConfig();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatShadingConfigOrBuilder
            public LiveBackgroundColorConfig getBorderColorConfig() {
                return ((LiveChatShadingConfig) this.instance).getBorderColorConfig();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatShadingConfigOrBuilder
            public LiveCornerConfig getCornerConfig() {
                return ((LiveChatShadingConfig) this.instance).getCornerConfig();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatShadingConfigOrBuilder
            public boolean hasBackgroundColorConfig() {
                return ((LiveChatShadingConfig) this.instance).hasBackgroundColorConfig();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatShadingConfigOrBuilder
            public boolean hasBorderColorConfig() {
                return ((LiveChatShadingConfig) this.instance).hasBorderColorConfig();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveChatShadingConfigOrBuilder
            public boolean hasCornerConfig() {
                return ((LiveChatShadingConfig) this.instance).hasCornerConfig();
            }

            public Builder mergeBackgroundColorConfig(LiveBackgroundColorConfig liveBackgroundColorConfig) {
                copyOnWrite();
                ((LiveChatShadingConfig) this.instance).mergeBackgroundColorConfig(liveBackgroundColorConfig);
                return this;
            }

            public Builder mergeBorderColorConfig(LiveBackgroundColorConfig liveBackgroundColorConfig) {
                copyOnWrite();
                ((LiveChatShadingConfig) this.instance).mergeBorderColorConfig(liveBackgroundColorConfig);
                return this;
            }

            public Builder mergeCornerConfig(LiveCornerConfig liveCornerConfig) {
                copyOnWrite();
                ((LiveChatShadingConfig) this.instance).mergeCornerConfig(liveCornerConfig);
                return this;
            }

            public Builder setBackgroundColorConfig(LiveBackgroundColorConfig liveBackgroundColorConfig) {
                copyOnWrite();
                ((LiveChatShadingConfig) this.instance).setBackgroundColorConfig(liveBackgroundColorConfig);
                return this;
            }

            public Builder setBorderColorConfig(LiveBackgroundColorConfig liveBackgroundColorConfig) {
                copyOnWrite();
                ((LiveChatShadingConfig) this.instance).setBorderColorConfig(liveBackgroundColorConfig);
                return this;
            }

            public Builder setCornerConfig(LiveCornerConfig liveCornerConfig) {
                copyOnWrite();
                ((LiveChatShadingConfig) this.instance).setCornerConfig(liveCornerConfig);
                return this;
            }

            public Builder setBackgroundColorConfig(LiveBackgroundColorConfig.Builder builder) {
                copyOnWrite();
                ((LiveChatShadingConfig) this.instance).setBackgroundColorConfig(builder);
                return this;
            }

            public Builder setBorderColorConfig(LiveBackgroundColorConfig.Builder builder) {
                copyOnWrite();
                ((LiveChatShadingConfig) this.instance).setBorderColorConfig(builder);
                return this;
            }

            public Builder setCornerConfig(LiveCornerConfig.Builder builder) {
                copyOnWrite();
                ((LiveChatShadingConfig) this.instance).setCornerConfig(builder);
                return this;
            }
        }

        public static LiveChatShadingConfig parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (LiveChatShadingConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static LiveChatShadingConfig parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (LiveChatShadingConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static LiveChatShadingConfig parseFrom(InputStream inputStream) throws IOException {
            return (LiveChatShadingConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LiveChatShadingConfig parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (LiveChatShadingConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static LiveChatShadingConfig parseFrom(C3430e c3430e) throws IOException {
            return (LiveChatShadingConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static LiveChatShadingConfig parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (LiveChatShadingConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }

    public static final class LiveCornerConfig extends GeneratedMessageLite<LiveCornerConfig, Builder> implements LiveCornerConfigOrBuilder {
        private static final LiveCornerConfig DEFAULT_INSTANCE;
        private static volatile ng60<LiveCornerConfig> PARSER = null;
        public static final int PICTUREURL_FIELD_NUMBER = 1;
        public static final int POSITION_FIELD_NUMBER = 2;
        private String pictureUrl_ = "";
        private long position_;

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<LiveCornerConfig, Builder> implements LiveCornerConfigOrBuilder {
            private Builder() {
                super(LiveCornerConfig.DEFAULT_INSTANCE);
            }

            public Builder clearPictureUrl() {
                copyOnWrite();
                ((LiveCornerConfig) this.instance).clearPictureUrl();
                return this;
            }

            public Builder clearPosition() {
                copyOnWrite();
                ((LiveCornerConfig) this.instance).clearPosition();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveCornerConfigOrBuilder
            public String getPictureUrl() {
                return ((LiveCornerConfig) this.instance).getPictureUrl();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveCornerConfigOrBuilder
            public ByteString getPictureUrlBytes() {
                return ((LiveCornerConfig) this.instance).getPictureUrlBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveCornerConfigOrBuilder
            public long getPosition() {
                return ((LiveCornerConfig) this.instance).getPosition();
            }

            public Builder setPictureUrl(String str) {
                copyOnWrite();
                ((LiveCornerConfig) this.instance).setPictureUrl(str);
                return this;
            }

            public Builder setPictureUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveCornerConfig) this.instance).setPictureUrlBytes(byteString);
                return this;
            }

            public Builder setPosition(long j) {
                copyOnWrite();
                ((LiveCornerConfig) this.instance).setPosition(j);
                return this;
            }
        }

        static {
            LiveCornerConfig liveCornerConfig = new LiveCornerConfig();
            DEFAULT_INSTANCE = liveCornerConfig;
            liveCornerConfig.makeImmutable();
        }

        private LiveCornerConfig() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPictureUrl() {
            this.pictureUrl_ = getDefaultInstance().getPictureUrl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPosition() {
            this.position_ = 0L;
        }

        public static LiveCornerConfig getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(LiveCornerConfig liveCornerConfig) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(liveCornerConfig);
        }

        public static LiveCornerConfig parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (LiveCornerConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LiveCornerConfig parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (LiveCornerConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<LiveCornerConfig> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPictureUrl(String str) {
            str.getClass();
            this.pictureUrl_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPictureUrlBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.pictureUrl_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPosition(long j) {
            this.position_ = j;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C45911.f16674xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new LiveCornerConfig();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    LiveCornerConfig liveCornerConfig = (LiveCornerConfig) obj2;
                    this.pictureUrl_ = interfaceC3409h.mo17052f(!this.pictureUrl_.isEmpty(), this.pictureUrl_, !liveCornerConfig.pictureUrl_.isEmpty(), liveCornerConfig.pictureUrl_);
                    long j = this.position_;
                    boolean z2 = j != 0;
                    long j2 = liveCornerConfig.position_;
                    this.position_ = interfaceC3409h.mo17055i(z2, j, j2 != 0, j2);
                    GeneratedMessageLite.C3408g c3408g = GeneratedMessageLite.C3408g.INSTANCE;
                    return this;
                case 6:
                    C3430e c3430e = (C3430e) obj;
                    while (!z) {
                        try {
                            int iM17171M = c3430e.m17171M();
                            if (iM17171M != 0) {
                                if (iM17171M == 10) {
                                    this.pictureUrl_ = c3430e.m17170L();
                                } else if (iM17171M == 16) {
                                    this.position_ = c3430e.m17197v();
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
                        synchronized (LiveCornerConfig.class) {
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

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveCornerConfigOrBuilder
        public String getPictureUrl() {
            return this.pictureUrl_;
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveCornerConfigOrBuilder
        public ByteString getPictureUrlBytes() {
            return ByteString.copyFromUtf8(this.pictureUrl_);
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveCornerConfigOrBuilder
        public long getPosition() {
            return this.position_;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16956K = !this.pictureUrl_.isEmpty() ? CodedOutputStream.m16956K(1, getPictureUrl()) : 0;
            long j = this.position_;
            if (j != 0) {
                iM16956K += CodedOutputStream.m16986v(2, j);
            }
            this.memoizedSerializedSize = iM16956K;
            return iM16956K;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.pictureUrl_.isEmpty()) {
                codedOutputStream.mo16994D0(1, getPictureUrl());
            }
            long j = this.position_;
            if (j != 0) {
                codedOutputStream.m17027u0(2, j);
            }
        }

        public static LiveCornerConfig parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (LiveCornerConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static LiveCornerConfig parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (LiveCornerConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        public static LiveCornerConfig parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (LiveCornerConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static LiveCornerConfig parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (LiveCornerConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static LiveCornerConfig parseFrom(InputStream inputStream) throws IOException {
            return (LiveCornerConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LiveCornerConfig parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (LiveCornerConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static LiveCornerConfig parseFrom(C3430e c3430e) throws IOException {
            return (LiveCornerConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static LiveCornerConfig parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (LiveCornerConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }

    public static final class LiveRevenueCampaignVip extends GeneratedMessageLite<LiveRevenueCampaignVip, Builder> implements LiveRevenueCampaignVipOrBuilder {
        private static final LiveRevenueCampaignVip DEFAULT_INSTANCE;
        public static final int ISVIP_FIELD_NUMBER = 1;
        private static volatile ng60<LiveRevenueCampaignVip> PARSER;
        private boolean isVip_;

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<LiveRevenueCampaignVip, Builder> implements LiveRevenueCampaignVipOrBuilder {
            private Builder() {
                super(LiveRevenueCampaignVip.DEFAULT_INSTANCE);
            }

            public Builder clearIsVip() {
                copyOnWrite();
                ((LiveRevenueCampaignVip) this.instance).clearIsVip();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveRevenueCampaignVipOrBuilder
            public boolean getIsVip() {
                return ((LiveRevenueCampaignVip) this.instance).getIsVip();
            }

            public Builder setIsVip(boolean z) {
                copyOnWrite();
                ((LiveRevenueCampaignVip) this.instance).setIsVip(z);
                return this;
            }
        }

        static {
            LiveRevenueCampaignVip liveRevenueCampaignVip = new LiveRevenueCampaignVip();
            DEFAULT_INSTANCE = liveRevenueCampaignVip;
            liveRevenueCampaignVip.makeImmutable();
        }

        private LiveRevenueCampaignVip() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIsVip() {
            this.isVip_ = false;
        }

        public static LiveRevenueCampaignVip getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(LiveRevenueCampaignVip liveRevenueCampaignVip) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(liveRevenueCampaignVip);
        }

        public static LiveRevenueCampaignVip parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (LiveRevenueCampaignVip) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LiveRevenueCampaignVip parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (LiveRevenueCampaignVip) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<LiveRevenueCampaignVip> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIsVip(boolean z) {
            this.isVip_ = z;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C45911.f16674xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new LiveRevenueCampaignVip();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    boolean z = this.isVip_;
                    boolean z2 = ((LiveRevenueCampaignVip) obj2).isVip_;
                    this.isVip_ = ((GeneratedMessageLite.InterfaceC3409h) obj).mo17050d(z, z, z2, z2);
                    GeneratedMessageLite.C3408g c3408g = GeneratedMessageLite.C3408g.INSTANCE;
                    return this;
                case 6:
                    C3430e c3430e = (C3430e) obj;
                    boolean z3 = false;
                    while (!z3) {
                        try {
                            int iM17171M = c3430e.m17171M();
                            if (iM17171M != 0) {
                                if (iM17171M == 8) {
                                    this.isVip_ = c3430e.m17188m();
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
                        synchronized (LiveRevenueCampaignVip.class) {
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

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.LiveRevenueCampaignVipOrBuilder
        public boolean getIsVip() {
            return this.isVip_;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            boolean z = this.isVip_;
            int iM16970f = z ? CodedOutputStream.m16970f(1, z) : 0;
            this.memoizedSerializedSize = iM16970f;
            return iM16970f;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            boolean z = this.isVip_;
            if (z) {
                codedOutputStream.mo17005a0(1, z);
            }
        }

        public static LiveRevenueCampaignVip parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (LiveRevenueCampaignVip) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static LiveRevenueCampaignVip parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (LiveRevenueCampaignVip) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        public static LiveRevenueCampaignVip parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (LiveRevenueCampaignVip) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static LiveRevenueCampaignVip parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (LiveRevenueCampaignVip) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static LiveRevenueCampaignVip parseFrom(InputStream inputStream) throws IOException {
            return (LiveRevenueCampaignVip) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LiveRevenueCampaignVip parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (LiveRevenueCampaignVip) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static LiveRevenueCampaignVip parseFrom(C3430e c3430e) throws IOException {
            return (LiveRevenueCampaignVip) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static LiveRevenueCampaignVip parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (LiveRevenueCampaignVip) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }

    public static final class Mask extends GeneratedMessageLite<Mask, Builder> implements MaskOrBuilder {
        public static final int COLOR_FIELD_NUMBER = 1;
        private static final Mask DEFAULT_INSTANCE;
        public static final int GENDER_FIELD_NUMBER = 3;
        public static final int ICON_FIELD_NUMBER = 2;
        private static volatile ng60<Mask> PARSER;
        private String color_ = "";
        private String icon_ = "";
        private String gender_ = "";

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<Mask, Builder> implements MaskOrBuilder {
            private Builder() {
                super(Mask.DEFAULT_INSTANCE);
            }

            public Builder clearColor() {
                copyOnWrite();
                ((Mask) this.instance).clearColor();
                return this;
            }

            public Builder clearGender() {
                copyOnWrite();
                ((Mask) this.instance).clearGender();
                return this;
            }

            public Builder clearIcon() {
                copyOnWrite();
                ((Mask) this.instance).clearIcon();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.MaskOrBuilder
            public String getColor() {
                return ((Mask) this.instance).getColor();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.MaskOrBuilder
            public ByteString getColorBytes() {
                return ((Mask) this.instance).getColorBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.MaskOrBuilder
            public String getGender() {
                return ((Mask) this.instance).getGender();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.MaskOrBuilder
            public ByteString getGenderBytes() {
                return ((Mask) this.instance).getGenderBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.MaskOrBuilder
            public String getIcon() {
                return ((Mask) this.instance).getIcon();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.MaskOrBuilder
            public ByteString getIconBytes() {
                return ((Mask) this.instance).getIconBytes();
            }

            public Builder setColor(String str) {
                copyOnWrite();
                ((Mask) this.instance).setColor(str);
                return this;
            }

            public Builder setColorBytes(ByteString byteString) {
                copyOnWrite();
                ((Mask) this.instance).setColorBytes(byteString);
                return this;
            }

            public Builder setGender(String str) {
                copyOnWrite();
                ((Mask) this.instance).setGender(str);
                return this;
            }

            public Builder setGenderBytes(ByteString byteString) {
                copyOnWrite();
                ((Mask) this.instance).setGenderBytes(byteString);
                return this;
            }

            public Builder setIcon(String str) {
                copyOnWrite();
                ((Mask) this.instance).setIcon(str);
                return this;
            }

            public Builder setIconBytes(ByteString byteString) {
                copyOnWrite();
                ((Mask) this.instance).setIconBytes(byteString);
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
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(mask);
        }

        public static Mask parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Mask) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Mask parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Mask) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<Mask> parser() {
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

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C45911.f16674xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new Mask();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    Mask mask = (Mask) obj2;
                    this.color_ = interfaceC3409h.mo17052f(!this.color_.isEmpty(), this.color_, !mask.color_.isEmpty(), mask.color_);
                    this.icon_ = interfaceC3409h.mo17052f(!this.icon_.isEmpty(), this.icon_, !mask.icon_.isEmpty(), mask.icon_);
                    this.gender_ = interfaceC3409h.mo17052f(!this.gender_.isEmpty(), this.gender_, true ^ mask.gender_.isEmpty(), mask.gender_);
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
                                    this.color_ = c3430e.m17170L();
                                } else if (iM17171M == 18) {
                                    this.icon_ = c3430e.m17170L();
                                } else if (iM17171M == 26) {
                                    this.gender_ = c3430e.m17170L();
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
                        synchronized (Mask.class) {
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

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.MaskOrBuilder
        public String getColor() {
            return this.color_;
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.MaskOrBuilder
        public ByteString getColorBytes() {
            return ByteString.copyFromUtf8(this.color_);
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.MaskOrBuilder
        public String getGender() {
            return this.gender_;
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.MaskOrBuilder
        public ByteString getGenderBytes() {
            return ByteString.copyFromUtf8(this.gender_);
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.MaskOrBuilder
        public String getIcon() {
            return this.icon_;
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.MaskOrBuilder
        public ByteString getIconBytes() {
            return ByteString.copyFromUtf8(this.icon_);
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16956K = !this.color_.isEmpty() ? CodedOutputStream.m16956K(1, getColor()) : 0;
            if (!this.icon_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(2, getIcon());
            }
            if (!this.gender_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(3, getGender());
            }
            this.memoizedSerializedSize = iM16956K;
            return iM16956K;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.color_.isEmpty()) {
                codedOutputStream.mo16994D0(1, getColor());
            }
            if (!this.icon_.isEmpty()) {
                codedOutputStream.mo16994D0(2, getIcon());
            }
            if (this.gender_.isEmpty()) {
                return;
            }
            codedOutputStream.mo16994D0(3, getGender());
        }

        public static Mask parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (Mask) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static Mask parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (Mask) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        public static Mask parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Mask) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Mask parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (Mask) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static Mask parseFrom(InputStream inputStream) throws IOException {
            return (Mask) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Mask parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (Mask) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static Mask parseFrom(C3430e c3430e) throws IOException {
            return (Mask) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Mask parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (Mask) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }

    public static final class Medal extends GeneratedMessageLite<Medal, Builder> implements MedalOrBuilder {
        private static final Medal DEFAULT_INSTANCE;
        public static final int FAMILYGRADE_FIELD_NUMBER = 3;
        public static final int FAMILYLIGHT_FIELD_NUMBER = 8;
        public static final int FAMILYTEXT_FIELD_NUMBER = 4;
        public static final int FANBASEGRADE_FIELD_NUMBER = 2;
        public static final int ID_FIELD_NUMBER = 1;
        private static volatile ng60<Medal> PARSER = null;
        public static final int VOICEFANBASECOLOR_FIELD_NUMBER = 6;
        public static final int VOICEFANBASEGRADE_FIELD_NUMBER = 5;
        public static final int VOICEFANBASETEXT_FIELD_NUMBER = 7;
        private long familyGrade_;
        private boolean familyLight_;
        private long fanbaseGrade_;
        private long voiceFanbaseGrade_;
        private String id_ = "";
        private String familyText_ = "";
        private String voiceFanbaseColor_ = "";
        private String voiceFanbaseText_ = "";

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<Medal, Builder> implements MedalOrBuilder {
            private Builder() {
                super(Medal.DEFAULT_INSTANCE);
            }

            public Builder clearFamilyGrade() {
                copyOnWrite();
                ((Medal) this.instance).clearFamilyGrade();
                return this;
            }

            public Builder clearFamilyLight() {
                copyOnWrite();
                ((Medal) this.instance).clearFamilyLight();
                return this;
            }

            public Builder clearFamilyText() {
                copyOnWrite();
                ((Medal) this.instance).clearFamilyText();
                return this;
            }

            public Builder clearFanbaseGrade() {
                copyOnWrite();
                ((Medal) this.instance).clearFanbaseGrade();
                return this;
            }

            public Builder clearId() {
                copyOnWrite();
                ((Medal) this.instance).clearId();
                return this;
            }

            public Builder clearVoiceFanbaseColor() {
                copyOnWrite();
                ((Medal) this.instance).clearVoiceFanbaseColor();
                return this;
            }

            public Builder clearVoiceFanbaseGrade() {
                copyOnWrite();
                ((Medal) this.instance).clearVoiceFanbaseGrade();
                return this;
            }

            public Builder clearVoiceFanbaseText() {
                copyOnWrite();
                ((Medal) this.instance).clearVoiceFanbaseText();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.MedalOrBuilder
            public long getFamilyGrade() {
                return ((Medal) this.instance).getFamilyGrade();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.MedalOrBuilder
            public boolean getFamilyLight() {
                return ((Medal) this.instance).getFamilyLight();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.MedalOrBuilder
            public String getFamilyText() {
                return ((Medal) this.instance).getFamilyText();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.MedalOrBuilder
            public ByteString getFamilyTextBytes() {
                return ((Medal) this.instance).getFamilyTextBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.MedalOrBuilder
            public long getFanbaseGrade() {
                return ((Medal) this.instance).getFanbaseGrade();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.MedalOrBuilder
            public String getId() {
                return ((Medal) this.instance).getId();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.MedalOrBuilder
            public ByteString getIdBytes() {
                return ((Medal) this.instance).getIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.MedalOrBuilder
            public String getVoiceFanbaseColor() {
                return ((Medal) this.instance).getVoiceFanbaseColor();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.MedalOrBuilder
            public ByteString getVoiceFanbaseColorBytes() {
                return ((Medal) this.instance).getVoiceFanbaseColorBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.MedalOrBuilder
            public long getVoiceFanbaseGrade() {
                return ((Medal) this.instance).getVoiceFanbaseGrade();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.MedalOrBuilder
            public String getVoiceFanbaseText() {
                return ((Medal) this.instance).getVoiceFanbaseText();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.MedalOrBuilder
            public ByteString getVoiceFanbaseTextBytes() {
                return ((Medal) this.instance).getVoiceFanbaseTextBytes();
            }

            public Builder setFamilyGrade(long j) {
                copyOnWrite();
                ((Medal) this.instance).setFamilyGrade(j);
                return this;
            }

            public Builder setFamilyLight(boolean z) {
                copyOnWrite();
                ((Medal) this.instance).setFamilyLight(z);
                return this;
            }

            public Builder setFamilyText(String str) {
                copyOnWrite();
                ((Medal) this.instance).setFamilyText(str);
                return this;
            }

            public Builder setFamilyTextBytes(ByteString byteString) {
                copyOnWrite();
                ((Medal) this.instance).setFamilyTextBytes(byteString);
                return this;
            }

            public Builder setFanbaseGrade(long j) {
                copyOnWrite();
                ((Medal) this.instance).setFanbaseGrade(j);
                return this;
            }

            public Builder setId(String str) {
                copyOnWrite();
                ((Medal) this.instance).setId(str);
                return this;
            }

            public Builder setIdBytes(ByteString byteString) {
                copyOnWrite();
                ((Medal) this.instance).setIdBytes(byteString);
                return this;
            }

            public Builder setVoiceFanbaseColor(String str) {
                copyOnWrite();
                ((Medal) this.instance).setVoiceFanbaseColor(str);
                return this;
            }

            public Builder setVoiceFanbaseColorBytes(ByteString byteString) {
                copyOnWrite();
                ((Medal) this.instance).setVoiceFanbaseColorBytes(byteString);
                return this;
            }

            public Builder setVoiceFanbaseGrade(long j) {
                copyOnWrite();
                ((Medal) this.instance).setVoiceFanbaseGrade(j);
                return this;
            }

            public Builder setVoiceFanbaseText(String str) {
                copyOnWrite();
                ((Medal) this.instance).setVoiceFanbaseText(str);
                return this;
            }

            public Builder setVoiceFanbaseTextBytes(ByteString byteString) {
                copyOnWrite();
                ((Medal) this.instance).setVoiceFanbaseTextBytes(byteString);
                return this;
            }
        }

        static {
            Medal medal = new Medal();
            DEFAULT_INSTANCE = medal;
            medal.makeImmutable();
        }

        private Medal() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFamilyGrade() {
            this.familyGrade_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFamilyLight() {
            this.familyLight_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFamilyText() {
            this.familyText_ = getDefaultInstance().getFamilyText();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFanbaseGrade() {
            this.fanbaseGrade_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearId() {
            this.id_ = getDefaultInstance().getId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVoiceFanbaseColor() {
            this.voiceFanbaseColor_ = getDefaultInstance().getVoiceFanbaseColor();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVoiceFanbaseGrade() {
            this.voiceFanbaseGrade_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVoiceFanbaseText() {
            this.voiceFanbaseText_ = getDefaultInstance().getVoiceFanbaseText();
        }

        public static Medal getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(Medal medal) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(medal);
        }

        public static Medal parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Medal) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Medal parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Medal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<Medal> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFamilyGrade(long j) {
            this.familyGrade_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFamilyLight(boolean z) {
            this.familyLight_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFamilyText(String str) {
            str.getClass();
            this.familyText_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFamilyTextBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.familyText_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFanbaseGrade(long j) {
            this.fanbaseGrade_ = j;
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
        public void setVoiceFanbaseColor(String str) {
            str.getClass();
            this.voiceFanbaseColor_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVoiceFanbaseColorBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.voiceFanbaseColor_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVoiceFanbaseGrade(long j) {
            this.voiceFanbaseGrade_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVoiceFanbaseText(String str) {
            str.getClass();
            this.voiceFanbaseText_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVoiceFanbaseTextBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.voiceFanbaseText_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C45911.f16674xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new Medal();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    Medal medal = (Medal) obj2;
                    this.id_ = interfaceC3409h.mo17052f(!this.id_.isEmpty(), this.id_, !medal.id_.isEmpty(), medal.id_);
                    long j = this.fanbaseGrade_;
                    boolean z2 = j != 0;
                    long j2 = medal.fanbaseGrade_;
                    this.fanbaseGrade_ = interfaceC3409h.mo17055i(z2, j, j2 != 0, j2);
                    long j3 = this.familyGrade_;
                    boolean z3 = j3 != 0;
                    long j4 = medal.familyGrade_;
                    this.familyGrade_ = interfaceC3409h.mo17055i(z3, j3, j4 != 0, j4);
                    this.familyText_ = interfaceC3409h.mo17052f(!this.familyText_.isEmpty(), this.familyText_, !medal.familyText_.isEmpty(), medal.familyText_);
                    long j5 = this.voiceFanbaseGrade_;
                    boolean z4 = j5 != 0;
                    long j6 = medal.voiceFanbaseGrade_;
                    this.voiceFanbaseGrade_ = interfaceC3409h.mo17055i(z4, j5, j6 != 0, j6);
                    this.voiceFanbaseColor_ = interfaceC3409h.mo17052f(!this.voiceFanbaseColor_.isEmpty(), this.voiceFanbaseColor_, !medal.voiceFanbaseColor_.isEmpty(), medal.voiceFanbaseColor_);
                    this.voiceFanbaseText_ = interfaceC3409h.mo17052f(!this.voiceFanbaseText_.isEmpty(), this.voiceFanbaseText_, !medal.voiceFanbaseText_.isEmpty(), medal.voiceFanbaseText_);
                    boolean z5 = this.familyLight_;
                    boolean z6 = medal.familyLight_;
                    this.familyLight_ = interfaceC3409h.mo17050d(z5, z5, z6, z6);
                    GeneratedMessageLite.C3408g c3408g = GeneratedMessageLite.C3408g.INSTANCE;
                    return this;
                case 6:
                    C3430e c3430e = (C3430e) obj;
                    while (!z) {
                        try {
                            int iM17171M = c3430e.m17171M();
                            if (iM17171M != 0) {
                                if (iM17171M == 10) {
                                    this.id_ = c3430e.m17170L();
                                } else if (iM17171M == 16) {
                                    this.fanbaseGrade_ = c3430e.m17197v();
                                } else if (iM17171M == 24) {
                                    this.familyGrade_ = c3430e.m17197v();
                                } else if (iM17171M == 34) {
                                    this.familyText_ = c3430e.m17170L();
                                } else if (iM17171M == 40) {
                                    this.voiceFanbaseGrade_ = c3430e.m17197v();
                                } else if (iM17171M == 50) {
                                    this.voiceFanbaseColor_ = c3430e.m17170L();
                                } else if (iM17171M == 58) {
                                    this.voiceFanbaseText_ = c3430e.m17170L();
                                } else if (iM17171M == 64) {
                                    this.familyLight_ = c3430e.m17188m();
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
                        synchronized (Medal.class) {
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

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.MedalOrBuilder
        public long getFamilyGrade() {
            return this.familyGrade_;
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.MedalOrBuilder
        public boolean getFamilyLight() {
            return this.familyLight_;
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.MedalOrBuilder
        public String getFamilyText() {
            return this.familyText_;
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.MedalOrBuilder
        public ByteString getFamilyTextBytes() {
            return ByteString.copyFromUtf8(this.familyText_);
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.MedalOrBuilder
        public long getFanbaseGrade() {
            return this.fanbaseGrade_;
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.MedalOrBuilder
        public String getId() {
            return this.id_;
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.MedalOrBuilder
        public ByteString getIdBytes() {
            return ByteString.copyFromUtf8(this.id_);
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16956K = !this.id_.isEmpty() ? CodedOutputStream.m16956K(1, getId()) : 0;
            long j = this.fanbaseGrade_;
            if (j != 0) {
                iM16956K += CodedOutputStream.m16986v(2, j);
            }
            long j2 = this.familyGrade_;
            if (j2 != 0) {
                iM16956K += CodedOutputStream.m16986v(3, j2);
            }
            if (!this.familyText_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(4, getFamilyText());
            }
            long j3 = this.voiceFanbaseGrade_;
            if (j3 != 0) {
                iM16956K += CodedOutputStream.m16986v(5, j3);
            }
            if (!this.voiceFanbaseColor_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(6, getVoiceFanbaseColor());
            }
            if (!this.voiceFanbaseText_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(7, getVoiceFanbaseText());
            }
            boolean z = this.familyLight_;
            if (z) {
                iM16956K += CodedOutputStream.m16970f(8, z);
            }
            this.memoizedSerializedSize = iM16956K;
            return iM16956K;
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.MedalOrBuilder
        public String getVoiceFanbaseColor() {
            return this.voiceFanbaseColor_;
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.MedalOrBuilder
        public ByteString getVoiceFanbaseColorBytes() {
            return ByteString.copyFromUtf8(this.voiceFanbaseColor_);
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.MedalOrBuilder
        public long getVoiceFanbaseGrade() {
            return this.voiceFanbaseGrade_;
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.MedalOrBuilder
        public String getVoiceFanbaseText() {
            return this.voiceFanbaseText_;
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.MedalOrBuilder
        public ByteString getVoiceFanbaseTextBytes() {
            return ByteString.copyFromUtf8(this.voiceFanbaseText_);
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.id_.isEmpty()) {
                codedOutputStream.mo16994D0(1, getId());
            }
            long j = this.fanbaseGrade_;
            if (j != 0) {
                codedOutputStream.m17027u0(2, j);
            }
            long j2 = this.familyGrade_;
            if (j2 != 0) {
                codedOutputStream.m17027u0(3, j2);
            }
            if (!this.familyText_.isEmpty()) {
                codedOutputStream.mo16994D0(4, getFamilyText());
            }
            long j3 = this.voiceFanbaseGrade_;
            if (j3 != 0) {
                codedOutputStream.m17027u0(5, j3);
            }
            if (!this.voiceFanbaseColor_.isEmpty()) {
                codedOutputStream.mo16994D0(6, getVoiceFanbaseColor());
            }
            if (!this.voiceFanbaseText_.isEmpty()) {
                codedOutputStream.mo16994D0(7, getVoiceFanbaseText());
            }
            boolean z = this.familyLight_;
            if (z) {
                codedOutputStream.mo17005a0(8, z);
            }
        }

        public static Medal parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (Medal) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static Medal parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (Medal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        public static Medal parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Medal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Medal parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (Medal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static Medal parseFrom(InputStream inputStream) throws IOException {
            return (Medal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Medal parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (Medal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static Medal parseFrom(C3430e c3430e) throws IOException {
            return (Medal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Medal parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (Medal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }

    public static final class MedalMessage extends GeneratedMessageLite<MedalMessage, Builder> implements MedalMessageOrBuilder {
        private static final MedalMessage DEFAULT_INSTANCE;
        public static final int IDS_FIELD_NUMBER = 1;
        public static final int MULTIROOMMEDALS_FIELD_NUMBER = 4;
        private static volatile ng60<MedalMessage> PARSER = null;
        public static final int SINGLEROOMMEDALS_FIELD_NUMBER = 3;
        public static final int VERSION_FIELD_NUMBER = 2;
        private int bitField0_;
        private C3437l.h<String> ids_ = GeneratedMessageLite.emptyProtobufList();
        private String version_ = "";
        private C3437l.h<Medal> singleRoomMedals_ = GeneratedMessageLite.emptyProtobufList();
        private C3437l.h<Medal> multiRoomMedals_ = GeneratedMessageLite.emptyProtobufList();

        static {
            MedalMessage medalMessage = new MedalMessage();
            DEFAULT_INSTANCE = medalMessage;
            medalMessage.makeImmutable();
        }

        private MedalMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllIds(Iterable<String> iterable) {
            ensureIdsIsMutable();
            AbstractC3426a.addAll(iterable, this.ids_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllMultiRoomMedals(Iterable<? extends Medal> iterable) {
            ensureMultiRoomMedalsIsMutable();
            AbstractC3426a.addAll(iterable, this.multiRoomMedals_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllSingleRoomMedals(Iterable<? extends Medal> iterable) {
            ensureSingleRoomMedalsIsMutable();
            AbstractC3426a.addAll(iterable, this.singleRoomMedals_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addIds(String str) {
            str.getClass();
            ensureIdsIsMutable();
            this.ids_.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addIdsBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            ensureIdsIsMutable();
            this.ids_.add(byteString.toStringUtf8());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addMultiRoomMedals(Medal.Builder builder) {
            ensureMultiRoomMedalsIsMutable();
            this.multiRoomMedals_.add(builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addSingleRoomMedals(Medal.Builder builder) {
            ensureSingleRoomMedalsIsMutable();
            this.singleRoomMedals_.add(builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIds() {
            this.ids_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMultiRoomMedals() {
            this.multiRoomMedals_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSingleRoomMedals() {
            this.singleRoomMedals_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVersion() {
            this.version_ = getDefaultInstance().getVersion();
        }

        private void ensureIdsIsMutable() {
            if (this.ids_.mo17140q()) {
                return;
            }
            this.ids_ = GeneratedMessageLite.mutableCopy(this.ids_);
        }

        private void ensureMultiRoomMedalsIsMutable() {
            if (this.multiRoomMedals_.mo17140q()) {
                return;
            }
            this.multiRoomMedals_ = GeneratedMessageLite.mutableCopy(this.multiRoomMedals_);
        }

        private void ensureSingleRoomMedalsIsMutable() {
            if (this.singleRoomMedals_.mo17140q()) {
                return;
            }
            this.singleRoomMedals_ = GeneratedMessageLite.mutableCopy(this.singleRoomMedals_);
        }

        public static MedalMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(MedalMessage medalMessage) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(medalMessage);
        }

        public static MedalMessage parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (MedalMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MedalMessage parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (MedalMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<MedalMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeMultiRoomMedals(int i) {
            ensureMultiRoomMedalsIsMutable();
            this.multiRoomMedals_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeSingleRoomMedals(int i) {
            ensureSingleRoomMedalsIsMutable();
            this.singleRoomMedals_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIds(int i, String str) {
            str.getClass();
            ensureIdsIsMutable();
            this.ids_.set(i, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMultiRoomMedals(int i, Medal.Builder builder) {
            ensureMultiRoomMedalsIsMutable();
            this.multiRoomMedals_.set(i, builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSingleRoomMedals(int i, Medal.Builder builder) {
            ensureSingleRoomMedalsIsMutable();
            this.singleRoomMedals_.set(i, builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVersion(String str) {
            str.getClass();
            this.version_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVersionBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.version_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C45911.f16674xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new MedalMessage();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.ids_.mo17139n();
                    this.singleRoomMedals_.mo17139n();
                    this.multiRoomMedals_.mo17139n();
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    MedalMessage medalMessage = (MedalMessage) obj2;
                    this.ids_ = interfaceC3409h.mo17053g(this.ids_, medalMessage.ids_);
                    this.version_ = interfaceC3409h.mo17052f(!this.version_.isEmpty(), this.version_, true ^ medalMessage.version_.isEmpty(), medalMessage.version_);
                    this.singleRoomMedals_ = interfaceC3409h.mo17053g(this.singleRoomMedals_, medalMessage.singleRoomMedals_);
                    this.multiRoomMedals_ = interfaceC3409h.mo17053g(this.multiRoomMedals_, medalMessage.multiRoomMedals_);
                    if (interfaceC3409h == GeneratedMessageLite.C3408g.INSTANCE) {
                        this.bitField0_ |= medalMessage.bitField0_;
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
                                    String strM17170L = c3430e.m17170L();
                                    if (!this.ids_.mo17140q()) {
                                        this.ids_ = GeneratedMessageLite.mutableCopy(this.ids_);
                                    }
                                    this.ids_.add(strM17170L);
                                } else if (iM17171M == 18) {
                                    this.version_ = c3430e.m17170L();
                                } else if (iM17171M == 26) {
                                    if (!this.singleRoomMedals_.mo17140q()) {
                                        this.singleRoomMedals_ = GeneratedMessageLite.mutableCopy(this.singleRoomMedals_);
                                    }
                                    this.singleRoomMedals_.add((Medal) c3430e.m17198w(Medal.parser(), c3433h));
                                } else if (iM17171M == 34) {
                                    if (!this.multiRoomMedals_.mo17140q()) {
                                        this.multiRoomMedals_ = GeneratedMessageLite.mutableCopy(this.multiRoomMedals_);
                                    }
                                    this.multiRoomMedals_.add((Medal) c3430e.m17198w(Medal.parser(), c3433h));
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
                        synchronized (MedalMessage.class) {
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

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.MedalMessageOrBuilder
        public String getIds(int i) {
            return this.ids_.get(i);
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.MedalMessageOrBuilder
        public ByteString getIdsBytes(int i) {
            return ByteString.copyFromUtf8(this.ids_.get(i));
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.MedalMessageOrBuilder
        public int getIdsCount() {
            return this.ids_.size();
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.MedalMessageOrBuilder
        public List<String> getIdsList() {
            return this.ids_;
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.MedalMessageOrBuilder
        public Medal getMultiRoomMedals(int i) {
            return this.multiRoomMedals_.get(i);
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.MedalMessageOrBuilder
        public int getMultiRoomMedalsCount() {
            return this.multiRoomMedals_.size();
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.MedalMessageOrBuilder
        public List<Medal> getMultiRoomMedalsList() {
            return this.multiRoomMedals_;
        }

        public MedalOrBuilder getMultiRoomMedalsOrBuilder(int i) {
            return this.multiRoomMedals_.get(i);
        }

        public List<? extends MedalOrBuilder> getMultiRoomMedalsOrBuilderList() {
            return this.multiRoomMedals_;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16957L = 0;
            for (int i2 = 0; i2 < this.ids_.size(); i2++) {
                iM16957L += CodedOutputStream.m16957L(this.ids_.get(i2));
            }
            int size = iM16957L + getIdsList().size();
            if (!this.version_.isEmpty()) {
                size += CodedOutputStream.m16956K(2, getVersion());
            }
            for (int i3 = 0; i3 < this.singleRoomMedals_.size(); i3++) {
                size += CodedOutputStream.m16948C(3, this.singleRoomMedals_.get(i3));
            }
            for (int i4 = 0; i4 < this.multiRoomMedals_.size(); i4++) {
                size += CodedOutputStream.m16948C(4, this.multiRoomMedals_.get(i4));
            }
            this.memoizedSerializedSize = size;
            return size;
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.MedalMessageOrBuilder
        public Medal getSingleRoomMedals(int i) {
            return this.singleRoomMedals_.get(i);
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.MedalMessageOrBuilder
        public int getSingleRoomMedalsCount() {
            return this.singleRoomMedals_.size();
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.MedalMessageOrBuilder
        public List<Medal> getSingleRoomMedalsList() {
            return this.singleRoomMedals_;
        }

        public MedalOrBuilder getSingleRoomMedalsOrBuilder(int i) {
            return this.singleRoomMedals_.get(i);
        }

        public List<? extends MedalOrBuilder> getSingleRoomMedalsOrBuilderList() {
            return this.singleRoomMedals_;
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.MedalMessageOrBuilder
        public String getVersion() {
            return this.version_;
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.MedalMessageOrBuilder
        public ByteString getVersionBytes() {
            return ByteString.copyFromUtf8(this.version_);
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            for (int i = 0; i < this.ids_.size(); i++) {
                codedOutputStream.mo16994D0(1, this.ids_.get(i));
            }
            if (!this.version_.isEmpty()) {
                codedOutputStream.mo16994D0(2, getVersion());
            }
            for (int i2 = 0; i2 < this.singleRoomMedals_.size(); i2++) {
                codedOutputStream.mo17029w0(3, this.singleRoomMedals_.get(i2));
            }
            for (int i3 = 0; i3 < this.multiRoomMedals_.size(); i3++) {
                codedOutputStream.mo17029w0(4, this.multiRoomMedals_.get(i3));
            }
        }

        public static MedalMessage parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (MedalMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static MedalMessage parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (MedalMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<MedalMessage, Builder> implements MedalMessageOrBuilder {
            private Builder() {
                super(MedalMessage.DEFAULT_INSTANCE);
            }

            public Builder addAllIds(Iterable<String> iterable) {
                copyOnWrite();
                ((MedalMessage) this.instance).addAllIds(iterable);
                return this;
            }

            public Builder addAllMultiRoomMedals(Iterable<? extends Medal> iterable) {
                copyOnWrite();
                ((MedalMessage) this.instance).addAllMultiRoomMedals(iterable);
                return this;
            }

            public Builder addAllSingleRoomMedals(Iterable<? extends Medal> iterable) {
                copyOnWrite();
                ((MedalMessage) this.instance).addAllSingleRoomMedals(iterable);
                return this;
            }

            public Builder addIds(String str) {
                copyOnWrite();
                ((MedalMessage) this.instance).addIds(str);
                return this;
            }

            public Builder addIdsBytes(ByteString byteString) {
                copyOnWrite();
                ((MedalMessage) this.instance).addIdsBytes(byteString);
                return this;
            }

            public Builder addMultiRoomMedals(Medal medal) {
                copyOnWrite();
                ((MedalMessage) this.instance).addMultiRoomMedals(medal);
                return this;
            }

            public Builder addSingleRoomMedals(Medal medal) {
                copyOnWrite();
                ((MedalMessage) this.instance).addSingleRoomMedals(medal);
                return this;
            }

            public Builder clearIds() {
                copyOnWrite();
                ((MedalMessage) this.instance).clearIds();
                return this;
            }

            public Builder clearMultiRoomMedals() {
                copyOnWrite();
                ((MedalMessage) this.instance).clearMultiRoomMedals();
                return this;
            }

            public Builder clearSingleRoomMedals() {
                copyOnWrite();
                ((MedalMessage) this.instance).clearSingleRoomMedals();
                return this;
            }

            public Builder clearVersion() {
                copyOnWrite();
                ((MedalMessage) this.instance).clearVersion();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.MedalMessageOrBuilder
            public String getIds(int i) {
                return ((MedalMessage) this.instance).getIds(i);
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.MedalMessageOrBuilder
            public ByteString getIdsBytes(int i) {
                return ((MedalMessage) this.instance).getIdsBytes(i);
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.MedalMessageOrBuilder
            public int getIdsCount() {
                return ((MedalMessage) this.instance).getIdsCount();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.MedalMessageOrBuilder
            public List<String> getIdsList() {
                return Collections.unmodifiableList(((MedalMessage) this.instance).getIdsList());
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.MedalMessageOrBuilder
            public Medal getMultiRoomMedals(int i) {
                return ((MedalMessage) this.instance).getMultiRoomMedals(i);
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.MedalMessageOrBuilder
            public int getMultiRoomMedalsCount() {
                return ((MedalMessage) this.instance).getMultiRoomMedalsCount();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.MedalMessageOrBuilder
            public List<Medal> getMultiRoomMedalsList() {
                return Collections.unmodifiableList(((MedalMessage) this.instance).getMultiRoomMedalsList());
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.MedalMessageOrBuilder
            public Medal getSingleRoomMedals(int i) {
                return ((MedalMessage) this.instance).getSingleRoomMedals(i);
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.MedalMessageOrBuilder
            public int getSingleRoomMedalsCount() {
                return ((MedalMessage) this.instance).getSingleRoomMedalsCount();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.MedalMessageOrBuilder
            public List<Medal> getSingleRoomMedalsList() {
                return Collections.unmodifiableList(((MedalMessage) this.instance).getSingleRoomMedalsList());
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.MedalMessageOrBuilder
            public String getVersion() {
                return ((MedalMessage) this.instance).getVersion();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.MedalMessageOrBuilder
            public ByteString getVersionBytes() {
                return ((MedalMessage) this.instance).getVersionBytes();
            }

            public Builder removeMultiRoomMedals(int i) {
                copyOnWrite();
                ((MedalMessage) this.instance).removeMultiRoomMedals(i);
                return this;
            }

            public Builder removeSingleRoomMedals(int i) {
                copyOnWrite();
                ((MedalMessage) this.instance).removeSingleRoomMedals(i);
                return this;
            }

            public Builder setIds(int i, String str) {
                copyOnWrite();
                ((MedalMessage) this.instance).setIds(i, str);
                return this;
            }

            public Builder setMultiRoomMedals(int i, Medal medal) {
                copyOnWrite();
                ((MedalMessage) this.instance).setMultiRoomMedals(i, medal);
                return this;
            }

            public Builder setSingleRoomMedals(int i, Medal medal) {
                copyOnWrite();
                ((MedalMessage) this.instance).setSingleRoomMedals(i, medal);
                return this;
            }

            public Builder setVersion(String str) {
                copyOnWrite();
                ((MedalMessage) this.instance).setVersion(str);
                return this;
            }

            public Builder setVersionBytes(ByteString byteString) {
                copyOnWrite();
                ((MedalMessage) this.instance).setVersionBytes(byteString);
                return this;
            }

            public Builder addMultiRoomMedals(int i, Medal medal) {
                copyOnWrite();
                ((MedalMessage) this.instance).addMultiRoomMedals(i, medal);
                return this;
            }

            public Builder addSingleRoomMedals(int i, Medal medal) {
                copyOnWrite();
                ((MedalMessage) this.instance).addSingleRoomMedals(i, medal);
                return this;
            }

            public Builder setMultiRoomMedals(int i, Medal.Builder builder) {
                copyOnWrite();
                ((MedalMessage) this.instance).setMultiRoomMedals(i, builder);
                return this;
            }

            public Builder setSingleRoomMedals(int i, Medal.Builder builder) {
                copyOnWrite();
                ((MedalMessage) this.instance).setSingleRoomMedals(i, builder);
                return this;
            }

            public Builder addMultiRoomMedals(Medal.Builder builder) {
                copyOnWrite();
                ((MedalMessage) this.instance).addMultiRoomMedals(builder);
                return this;
            }

            public Builder addSingleRoomMedals(Medal.Builder builder) {
                copyOnWrite();
                ((MedalMessage) this.instance).addSingleRoomMedals(builder);
                return this;
            }

            public Builder addMultiRoomMedals(int i, Medal.Builder builder) {
                copyOnWrite();
                ((MedalMessage) this.instance).addMultiRoomMedals(i, builder);
                return this;
            }

            public Builder addSingleRoomMedals(int i, Medal.Builder builder) {
                copyOnWrite();
                ((MedalMessage) this.instance).addSingleRoomMedals(i, builder);
                return this;
            }
        }

        public static MedalMessage parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (MedalMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MedalMessage parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (MedalMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static MedalMessage parseFrom(InputStream inputStream) throws IOException {
            return (MedalMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MedalMessage parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (MedalMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static MedalMessage parseFrom(C3430e c3430e) throws IOException {
            return (MedalMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addMultiRoomMedals(int i, Medal medal) {
            medal.getClass();
            ensureMultiRoomMedalsIsMutable();
            this.multiRoomMedals_.add(i, medal);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addSingleRoomMedals(int i, Medal medal) {
            medal.getClass();
            ensureSingleRoomMedalsIsMutable();
            this.singleRoomMedals_.add(i, medal);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static MedalMessage parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (MedalMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMultiRoomMedals(int i, Medal medal) {
            medal.getClass();
            ensureMultiRoomMedalsIsMutable();
            this.multiRoomMedals_.set(i, medal);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSingleRoomMedals(int i, Medal medal) {
            medal.getClass();
            ensureSingleRoomMedalsIsMutable();
            this.singleRoomMedals_.set(i, medal);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addMultiRoomMedals(Medal medal) {
            medal.getClass();
            ensureMultiRoomMedalsIsMutable();
            this.multiRoomMedals_.add(medal);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addSingleRoomMedals(Medal medal) {
            medal.getClass();
            ensureSingleRoomMedalsIsMutable();
            this.singleRoomMedals_.add(medal);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addMultiRoomMedals(int i, Medal.Builder builder) {
            ensureMultiRoomMedalsIsMutable();
            this.multiRoomMedals_.add(i, builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addSingleRoomMedals(int i, Medal.Builder builder) {
            ensureSingleRoomMedalsIsMutable();
            this.singleRoomMedals_.add(i, builder.build());
        }
    }

    public static final class PostMessageAck extends GeneratedMessageLite<PostMessageAck, Builder> implements PostMessageAckOrBuilder {
        public static final int CODEMESSAGE_FIELD_NUMBER = 2;
        public static final int CODE_FIELD_NUMBER = 1;
        private static final PostMessageAck DEFAULT_INSTANCE;
        public static final int MESSAGE_FIELD_NUMBER = 3;
        private static volatile ng60<PostMessageAck> PARSER;
        private String codeMessage_ = "";
        private int code_;
        private LiveChatMessage message_;

        static {
            PostMessageAck postMessageAck = new PostMessageAck();
            DEFAULT_INSTANCE = postMessageAck;
            postMessageAck.makeImmutable();
        }

        private PostMessageAck() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCode() {
            this.code_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCodeMessage() {
            this.codeMessage_ = getDefaultInstance().getCodeMessage();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMessage() {
            this.message_ = null;
        }

        public static PostMessageAck getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeMessage(LiveChatMessage liveChatMessage) {
            LiveChatMessage liveChatMessage2 = this.message_;
            if (liveChatMessage2 == null || liveChatMessage2 == LiveChatMessage.getDefaultInstance()) {
                this.message_ = liveChatMessage;
            } else {
                this.message_ = LiveChatMessage.newBuilder(this.message_).mergeFrom(liveChatMessage).buildPartial();
            }
        }

        public static Builder newBuilder(PostMessageAck postMessageAck) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(postMessageAck);
        }

        public static PostMessageAck parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (PostMessageAck) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PostMessageAck parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (PostMessageAck) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<PostMessageAck> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCode(PostMessageCode postMessageCode) {
            postMessageCode.getClass();
            this.code_ = postMessageCode.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCodeMessage(String str) {
            str.getClass();
            this.codeMessage_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCodeMessageBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.codeMessage_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCodeValue(int i) {
            this.code_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMessage(LiveChatMessage.Builder builder) {
            this.message_ = builder.build();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C45911.f16674xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new PostMessageAck();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    PostMessageAck postMessageAck = (PostMessageAck) obj2;
                    int i = this.code_;
                    boolean z2 = i != 0;
                    int i2 = postMessageAck.code_;
                    this.code_ = interfaceC3409h.mo17051e(z2, i, i2 != 0, i2);
                    this.codeMessage_ = interfaceC3409h.mo17052f(!this.codeMessage_.isEmpty(), this.codeMessage_, !postMessageAck.codeMessage_.isEmpty(), postMessageAck.codeMessage_);
                    this.message_ = (LiveChatMessage) interfaceC3409h.mo17061o(this.message_, postMessageAck.message_);
                    GeneratedMessageLite.C3408g c3408g = GeneratedMessageLite.C3408g.INSTANCE;
                    return this;
                case 6:
                    C3430e c3430e = (C3430e) obj;
                    C3433h c3433h = (C3433h) obj2;
                    while (!z) {
                        try {
                            int iM17171M = c3430e.m17171M();
                            if (iM17171M != 0) {
                                if (iM17171M == 8) {
                                    this.code_ = c3430e.m17191p();
                                } else if (iM17171M == 18) {
                                    this.codeMessage_ = c3430e.m17170L();
                                } else if (iM17171M == 26) {
                                    LiveChatMessage liveChatMessage = this.message_;
                                    LiveChatMessage.Builder builder = liveChatMessage != null ? liveChatMessage.toBuilder() : null;
                                    LiveChatMessage liveChatMessage2 = (LiveChatMessage) c3430e.m17198w(LiveChatMessage.parser(), c3433h);
                                    this.message_ = liveChatMessage2;
                                    if (builder != null) {
                                        builder.mergeFrom(liveChatMessage2);
                                        this.message_ = builder.buildPartial();
                                    }
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
                        synchronized (PostMessageAck.class) {
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

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.PostMessageAckOrBuilder
        public PostMessageCode getCode() {
            PostMessageCode postMessageCodeForNumber = PostMessageCode.forNumber(this.code_);
            return postMessageCodeForNumber == null ? PostMessageCode.UNRECOGNIZED : postMessageCodeForNumber;
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.PostMessageAckOrBuilder
        public String getCodeMessage() {
            return this.codeMessage_;
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.PostMessageAckOrBuilder
        public ByteString getCodeMessageBytes() {
            return ByteString.copyFromUtf8(this.codeMessage_);
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.PostMessageAckOrBuilder
        public int getCodeValue() {
            return this.code_;
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.PostMessageAckOrBuilder
        public LiveChatMessage getMessage() {
            LiveChatMessage liveChatMessage = this.message_;
            return liveChatMessage == null ? LiveChatMessage.getDefaultInstance() : liveChatMessage;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16977m = this.code_ != PostMessageCode.POST_CODE_PLACEHOLDER.getNumber() ? CodedOutputStream.m16977m(1, this.code_) : 0;
            if (!this.codeMessage_.isEmpty()) {
                iM16977m += CodedOutputStream.m16956K(2, getCodeMessage());
            }
            if (this.message_ != null) {
                iM16977m += CodedOutputStream.m16948C(3, getMessage());
            }
            this.memoizedSerializedSize = iM16977m;
            return iM16977m;
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.PostMessageAckOrBuilder
        public boolean hasMessage() {
            return this.message_ != null;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.code_ != PostMessageCode.POST_CODE_PLACEHOLDER.getNumber()) {
                codedOutputStream.m17015i0(1, this.code_);
            }
            if (!this.codeMessage_.isEmpty()) {
                codedOutputStream.mo16994D0(2, getCodeMessage());
            }
            if (this.message_ != null) {
                codedOutputStream.mo17029w0(3, getMessage());
            }
        }

        public static PostMessageAck parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (PostMessageAck) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static PostMessageAck parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (PostMessageAck) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMessage(LiveChatMessage liveChatMessage) {
            liveChatMessage.getClass();
            this.message_ = liveChatMessage;
        }

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<PostMessageAck, Builder> implements PostMessageAckOrBuilder {
            private Builder() {
                super(PostMessageAck.DEFAULT_INSTANCE);
            }

            public Builder clearCode() {
                copyOnWrite();
                ((PostMessageAck) this.instance).clearCode();
                return this;
            }

            public Builder clearCodeMessage() {
                copyOnWrite();
                ((PostMessageAck) this.instance).clearCodeMessage();
                return this;
            }

            public Builder clearMessage() {
                copyOnWrite();
                ((PostMessageAck) this.instance).clearMessage();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.PostMessageAckOrBuilder
            public PostMessageCode getCode() {
                return ((PostMessageAck) this.instance).getCode();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.PostMessageAckOrBuilder
            public String getCodeMessage() {
                return ((PostMessageAck) this.instance).getCodeMessage();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.PostMessageAckOrBuilder
            public ByteString getCodeMessageBytes() {
                return ((PostMessageAck) this.instance).getCodeMessageBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.PostMessageAckOrBuilder
            public int getCodeValue() {
                return ((PostMessageAck) this.instance).getCodeValue();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.PostMessageAckOrBuilder
            public LiveChatMessage getMessage() {
                return ((PostMessageAck) this.instance).getMessage();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.PostMessageAckOrBuilder
            public boolean hasMessage() {
                return ((PostMessageAck) this.instance).hasMessage();
            }

            public Builder mergeMessage(LiveChatMessage liveChatMessage) {
                copyOnWrite();
                ((PostMessageAck) this.instance).mergeMessage(liveChatMessage);
                return this;
            }

            public Builder setCode(PostMessageCode postMessageCode) {
                copyOnWrite();
                ((PostMessageAck) this.instance).setCode(postMessageCode);
                return this;
            }

            public Builder setCodeMessage(String str) {
                copyOnWrite();
                ((PostMessageAck) this.instance).setCodeMessage(str);
                return this;
            }

            public Builder setCodeMessageBytes(ByteString byteString) {
                copyOnWrite();
                ((PostMessageAck) this.instance).setCodeMessageBytes(byteString);
                return this;
            }

            public Builder setCodeValue(int i) {
                copyOnWrite();
                ((PostMessageAck) this.instance).setCodeValue(i);
                return this;
            }

            public Builder setMessage(LiveChatMessage liveChatMessage) {
                copyOnWrite();
                ((PostMessageAck) this.instance).setMessage(liveChatMessage);
                return this;
            }

            public Builder setMessage(LiveChatMessage.Builder builder) {
                copyOnWrite();
                ((PostMessageAck) this.instance).setMessage(builder);
                return this;
            }
        }

        public static PostMessageAck parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (PostMessageAck) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static PostMessageAck parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (PostMessageAck) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static PostMessageAck parseFrom(InputStream inputStream) throws IOException {
            return (PostMessageAck) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PostMessageAck parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (PostMessageAck) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static PostMessageAck parseFrom(C3430e c3430e) throws IOException {
            return (PostMessageAck) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static PostMessageAck parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (PostMessageAck) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }

    public enum PostMessageCode implements C3437l.c {
        POST_CODE_PLACEHOLDER(0),
        SUCCESS(1),
        FAIL(2),
        JAIL(3),
        BLOCK(4),
        NOT_IN_ROOM(5),
        BAD_REQUEST(6),
        CONTENT_ILLEGAL(7),
        PMC_TANTAN_BANNED(8),
        PMC_TANTAN_JAILED(9),
        UNRECOGNIZED(-1);

        public static final int BAD_REQUEST_VALUE = 6;
        public static final int BLOCK_VALUE = 4;
        public static final int CONTENT_ILLEGAL_VALUE = 7;
        public static final int FAIL_VALUE = 2;
        public static final int JAIL_VALUE = 3;
        public static final int NOT_IN_ROOM_VALUE = 5;
        public static final int PMC_TANTAN_BANNED_VALUE = 8;
        public static final int PMC_TANTAN_JAILED_VALUE = 9;
        public static final int POST_CODE_PLACEHOLDER_VALUE = 0;
        public static final int SUCCESS_VALUE = 1;
        private static final C3437l.d<PostMessageCode> internalValueMap = new C3437l.d<PostMessageCode>() { // from class: com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.PostMessageCode.1
            @Override // com.google.protobuf.C3437l.d
            public PostMessageCode findValueByNumber(int i) {
                return PostMessageCode.forNumber(i);
            }
        };
        private final int value;

        PostMessageCode(int i) {
            this.value = i;
        }

        public static PostMessageCode forNumber(int i) {
            switch (i) {
                case 0:
                    return POST_CODE_PLACEHOLDER;
                case 1:
                    return SUCCESS;
                case 2:
                    return FAIL;
                case 3:
                    return JAIL;
                case 4:
                    return BLOCK;
                case 5:
                    return NOT_IN_ROOM;
                case 6:
                    return BAD_REQUEST;
                case 7:
                    return CONTENT_ILLEGAL;
                case 8:
                    return PMC_TANTAN_BANNED;
                case 9:
                    return PMC_TANTAN_JAILED;
                default:
                    return null;
            }
        }

        public static C3437l.d<PostMessageCode> internalGetValueMap() {
            return internalValueMap;
        }

        @Override // com.google.protobuf.C3437l.c
        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static PostMessageCode valueOf(int i) {
            return forNumber(i);
        }
    }

    public enum PredefineMessageType implements C3437l.c {
        PLACEHOLDER(0),
        OPENLIVE_NOTICE(1),
        ENTERROOM_NOTICE(2),
        UNRECOGNIZED(-1);

        public static final int ENTERROOM_NOTICE_VALUE = 2;
        public static final int OPENLIVE_NOTICE_VALUE = 1;
        public static final int PLACEHOLDER_VALUE = 0;
        private static final C3437l.d<PredefineMessageType> internalValueMap = new C3437l.d<PredefineMessageType>() { // from class: com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.PredefineMessageType.1
            @Override // com.google.protobuf.C3437l.d
            public PredefineMessageType findValueByNumber(int i) {
                return PredefineMessageType.forNumber(i);
            }
        };
        private final int value;

        PredefineMessageType(int i) {
            this.value = i;
        }

        public static PredefineMessageType forNumber(int i) {
            if (i == 0) {
                return PLACEHOLDER;
            }
            if (i == 1) {
                return OPENLIVE_NOTICE;
            }
            if (i != 2) {
                return null;
            }
            return ENTERROOM_NOTICE;
        }

        public static C3437l.d<PredefineMessageType> internalGetValueMap() {
            return internalValueMap;
        }

        @Override // com.google.protobuf.C3437l.c
        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static PredefineMessageType valueOf(int i) {
            return forNumber(i);
        }
    }

    public enum RoomType implements C3437l.c {
        video(0),
        voice(1),
        text(2),
        guild(3),
        UNRECOGNIZED(-1);

        public static final int guild_VALUE = 3;
        private static final C3437l.d<RoomType> internalValueMap = new C3437l.d<RoomType>() { // from class: com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.RoomType.1
            @Override // com.google.protobuf.C3437l.d
            public RoomType findValueByNumber(int i) {
                return RoomType.forNumber(i);
            }
        };
        public static final int text_VALUE = 2;
        public static final int video_VALUE = 0;
        public static final int voice_VALUE = 1;
        private final int value;

        RoomType(int i) {
            this.value = i;
        }

        public static RoomType forNumber(int i) {
            if (i == 0) {
                return video;
            }
            if (i == 1) {
                return voice;
            }
            if (i == 2) {
                return text;
            }
            if (i != 3) {
                return null;
            }
            return guild;
        }

        public static C3437l.d<RoomType> internalGetValueMap() {
            return internalValueMap;
        }

        @Override // com.google.protobuf.C3437l.c
        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static RoomType valueOf(int i) {
            return forNumber(i);
        }
    }

    public static final class SharedVoiceLiveInfo extends GeneratedMessageLite<SharedVoiceLiveInfo, Builder> implements SharedVoiceLiveInfoOrBuilder {
        public static final int ANCHORID_FIELD_NUMBER = 6;
        public static final int AUDIENCECOUNT_FIELD_NUMBER = 4;
        private static final SharedVoiceLiveInfo DEFAULT_INSTANCE;
        public static final int DESCRIPTION_FIELD_NUMBER = 3;
        public static final int LIVEID_FIELD_NUMBER = 2;
        private static volatile ng60<SharedVoiceLiveInfo> PARSER = null;
        public static final int ROOMID_FIELD_NUMBER = 1;
        public static final int VOICECALLCOUNT_FIELD_NUMBER = 5;
        private int audienceCount_;
        private int voiceCallCount_;
        private String roomId_ = "";
        private String liveId_ = "";
        private String description_ = "";
        private String anchorId_ = "";

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<SharedVoiceLiveInfo, Builder> implements SharedVoiceLiveInfoOrBuilder {
            private Builder() {
                super(SharedVoiceLiveInfo.DEFAULT_INSTANCE);
            }

            public Builder clearAnchorId() {
                copyOnWrite();
                ((SharedVoiceLiveInfo) this.instance).clearAnchorId();
                return this;
            }

            public Builder clearAudienceCount() {
                copyOnWrite();
                ((SharedVoiceLiveInfo) this.instance).clearAudienceCount();
                return this;
            }

            public Builder clearDescription() {
                copyOnWrite();
                ((SharedVoiceLiveInfo) this.instance).clearDescription();
                return this;
            }

            public Builder clearLiveId() {
                copyOnWrite();
                ((SharedVoiceLiveInfo) this.instance).clearLiveId();
                return this;
            }

            public Builder clearRoomId() {
                copyOnWrite();
                ((SharedVoiceLiveInfo) this.instance).clearRoomId();
                return this;
            }

            public Builder clearVoiceCallCount() {
                copyOnWrite();
                ((SharedVoiceLiveInfo) this.instance).clearVoiceCallCount();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.SharedVoiceLiveInfoOrBuilder
            public String getAnchorId() {
                return ((SharedVoiceLiveInfo) this.instance).getAnchorId();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.SharedVoiceLiveInfoOrBuilder
            public ByteString getAnchorIdBytes() {
                return ((SharedVoiceLiveInfo) this.instance).getAnchorIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.SharedVoiceLiveInfoOrBuilder
            public int getAudienceCount() {
                return ((SharedVoiceLiveInfo) this.instance).getAudienceCount();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.SharedVoiceLiveInfoOrBuilder
            public String getDescription() {
                return ((SharedVoiceLiveInfo) this.instance).getDescription();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.SharedVoiceLiveInfoOrBuilder
            public ByteString getDescriptionBytes() {
                return ((SharedVoiceLiveInfo) this.instance).getDescriptionBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.SharedVoiceLiveInfoOrBuilder
            public String getLiveId() {
                return ((SharedVoiceLiveInfo) this.instance).getLiveId();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.SharedVoiceLiveInfoOrBuilder
            public ByteString getLiveIdBytes() {
                return ((SharedVoiceLiveInfo) this.instance).getLiveIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.SharedVoiceLiveInfoOrBuilder
            public String getRoomId() {
                return ((SharedVoiceLiveInfo) this.instance).getRoomId();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.SharedVoiceLiveInfoOrBuilder
            public ByteString getRoomIdBytes() {
                return ((SharedVoiceLiveInfo) this.instance).getRoomIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.SharedVoiceLiveInfoOrBuilder
            public int getVoiceCallCount() {
                return ((SharedVoiceLiveInfo) this.instance).getVoiceCallCount();
            }

            public Builder setAnchorId(String str) {
                copyOnWrite();
                ((SharedVoiceLiveInfo) this.instance).setAnchorId(str);
                return this;
            }

            public Builder setAnchorIdBytes(ByteString byteString) {
                copyOnWrite();
                ((SharedVoiceLiveInfo) this.instance).setAnchorIdBytes(byteString);
                return this;
            }

            public Builder setAudienceCount(int i) {
                copyOnWrite();
                ((SharedVoiceLiveInfo) this.instance).setAudienceCount(i);
                return this;
            }

            public Builder setDescription(String str) {
                copyOnWrite();
                ((SharedVoiceLiveInfo) this.instance).setDescription(str);
                return this;
            }

            public Builder setDescriptionBytes(ByteString byteString) {
                copyOnWrite();
                ((SharedVoiceLiveInfo) this.instance).setDescriptionBytes(byteString);
                return this;
            }

            public Builder setLiveId(String str) {
                copyOnWrite();
                ((SharedVoiceLiveInfo) this.instance).setLiveId(str);
                return this;
            }

            public Builder setLiveIdBytes(ByteString byteString) {
                copyOnWrite();
                ((SharedVoiceLiveInfo) this.instance).setLiveIdBytes(byteString);
                return this;
            }

            public Builder setRoomId(String str) {
                copyOnWrite();
                ((SharedVoiceLiveInfo) this.instance).setRoomId(str);
                return this;
            }

            public Builder setRoomIdBytes(ByteString byteString) {
                copyOnWrite();
                ((SharedVoiceLiveInfo) this.instance).setRoomIdBytes(byteString);
                return this;
            }

            public Builder setVoiceCallCount(int i) {
                copyOnWrite();
                ((SharedVoiceLiveInfo) this.instance).setVoiceCallCount(i);
                return this;
            }
        }

        static {
            SharedVoiceLiveInfo sharedVoiceLiveInfo = new SharedVoiceLiveInfo();
            DEFAULT_INSTANCE = sharedVoiceLiveInfo;
            sharedVoiceLiveInfo.makeImmutable();
        }

        private SharedVoiceLiveInfo() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAnchorId() {
            this.anchorId_ = getDefaultInstance().getAnchorId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAudienceCount() {
            this.audienceCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDescription() {
            this.description_ = getDefaultInstance().getDescription();
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
        public void clearVoiceCallCount() {
            this.voiceCallCount_ = 0;
        }

        public static SharedVoiceLiveInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(SharedVoiceLiveInfo sharedVoiceLiveInfo) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sharedVoiceLiveInfo);
        }

        public static SharedVoiceLiveInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (SharedVoiceLiveInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SharedVoiceLiveInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (SharedVoiceLiveInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<SharedVoiceLiveInfo> parser() {
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.anchorId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAudienceCount(int i) {
            this.audienceCount_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDescription(String str) {
            str.getClass();
            this.description_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDescriptionBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.description_ = byteString.toStringUtf8();
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
        public void setVoiceCallCount(int i) {
            this.voiceCallCount_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C45911.f16674xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new SharedVoiceLiveInfo();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    SharedVoiceLiveInfo sharedVoiceLiveInfo = (SharedVoiceLiveInfo) obj2;
                    this.roomId_ = interfaceC3409h.mo17052f(!this.roomId_.isEmpty(), this.roomId_, !sharedVoiceLiveInfo.roomId_.isEmpty(), sharedVoiceLiveInfo.roomId_);
                    this.liveId_ = interfaceC3409h.mo17052f(!this.liveId_.isEmpty(), this.liveId_, !sharedVoiceLiveInfo.liveId_.isEmpty(), sharedVoiceLiveInfo.liveId_);
                    this.description_ = interfaceC3409h.mo17052f(!this.description_.isEmpty(), this.description_, !sharedVoiceLiveInfo.description_.isEmpty(), sharedVoiceLiveInfo.description_);
                    int i = this.audienceCount_;
                    boolean z2 = i != 0;
                    int i2 = sharedVoiceLiveInfo.audienceCount_;
                    this.audienceCount_ = interfaceC3409h.mo17051e(z2, i, i2 != 0, i2);
                    int i3 = this.voiceCallCount_;
                    boolean z3 = i3 != 0;
                    int i4 = sharedVoiceLiveInfo.voiceCallCount_;
                    this.voiceCallCount_ = interfaceC3409h.mo17051e(z3, i3, i4 != 0, i4);
                    this.anchorId_ = interfaceC3409h.mo17052f(!this.anchorId_.isEmpty(), this.anchorId_, !sharedVoiceLiveInfo.anchorId_.isEmpty(), sharedVoiceLiveInfo.anchorId_);
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
                                } else if (iM17171M == 26) {
                                    this.description_ = c3430e.m17170L();
                                } else if (iM17171M == 32) {
                                    this.audienceCount_ = c3430e.m17196u();
                                } else if (iM17171M == 40) {
                                    this.voiceCallCount_ = c3430e.m17196u();
                                } else if (iM17171M == 50) {
                                    this.anchorId_ = c3430e.m17170L();
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
                        synchronized (SharedVoiceLiveInfo.class) {
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

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.SharedVoiceLiveInfoOrBuilder
        public String getAnchorId() {
            return this.anchorId_;
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.SharedVoiceLiveInfoOrBuilder
        public ByteString getAnchorIdBytes() {
            return ByteString.copyFromUtf8(this.anchorId_);
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.SharedVoiceLiveInfoOrBuilder
        public int getAudienceCount() {
            return this.audienceCount_;
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.SharedVoiceLiveInfoOrBuilder
        public String getDescription() {
            return this.description_;
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.SharedVoiceLiveInfoOrBuilder
        public ByteString getDescriptionBytes() {
            return ByteString.copyFromUtf8(this.description_);
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.SharedVoiceLiveInfoOrBuilder
        public String getLiveId() {
            return this.liveId_;
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.SharedVoiceLiveInfoOrBuilder
        public ByteString getLiveIdBytes() {
            return ByteString.copyFromUtf8(this.liveId_);
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.SharedVoiceLiveInfoOrBuilder
        public String getRoomId() {
            return this.roomId_;
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.SharedVoiceLiveInfoOrBuilder
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
            if (!this.description_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(3, getDescription());
            }
            int i2 = this.audienceCount_;
            if (i2 != 0) {
                iM16956K += CodedOutputStream.m16984t(4, i2);
            }
            int i3 = this.voiceCallCount_;
            if (i3 != 0) {
                iM16956K += CodedOutputStream.m16984t(5, i3);
            }
            if (!this.anchorId_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(6, getAnchorId());
            }
            this.memoizedSerializedSize = iM16956K;
            return iM16956K;
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.SharedVoiceLiveInfoOrBuilder
        public int getVoiceCallCount() {
            return this.voiceCallCount_;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.roomId_.isEmpty()) {
                codedOutputStream.mo16994D0(1, getRoomId());
            }
            if (!this.liveId_.isEmpty()) {
                codedOutputStream.mo16994D0(2, getLiveId());
            }
            if (!this.description_.isEmpty()) {
                codedOutputStream.mo16994D0(3, getDescription());
            }
            int i = this.audienceCount_;
            if (i != 0) {
                codedOutputStream.mo17025s0(4, i);
            }
            int i2 = this.voiceCallCount_;
            if (i2 != 0) {
                codedOutputStream.mo17025s0(5, i2);
            }
            if (this.anchorId_.isEmpty()) {
                return;
            }
            codedOutputStream.mo16994D0(6, getAnchorId());
        }

        public static SharedVoiceLiveInfo parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (SharedVoiceLiveInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static SharedVoiceLiveInfo parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (SharedVoiceLiveInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        public static SharedVoiceLiveInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (SharedVoiceLiveInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SharedVoiceLiveInfo parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (SharedVoiceLiveInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static SharedVoiceLiveInfo parseFrom(InputStream inputStream) throws IOException {
            return (SharedVoiceLiveInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SharedVoiceLiveInfo parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (SharedVoiceLiveInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static SharedVoiceLiveInfo parseFrom(C3430e c3430e) throws IOException {
            return (SharedVoiceLiveInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SharedVoiceLiveInfo parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (SharedVoiceLiveInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }

    public static final class UserMedal extends GeneratedMessageLite<UserMedal, Builder> implements UserMedalOrBuilder {
        private static final UserMedal DEFAULT_INSTANCE;
        public static final int IDS_FIELD_NUMBER = 1;
        private static volatile ng60<UserMedal> PARSER = null;
        public static final int VERSION_FIELD_NUMBER = 2;
        private int bitField0_;
        private C3437l.h<String> ids_ = GeneratedMessageLite.emptyProtobufList();
        private String version_ = "";

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<UserMedal, Builder> implements UserMedalOrBuilder {
            private Builder() {
                super(UserMedal.DEFAULT_INSTANCE);
            }

            public Builder addAllIds(Iterable<String> iterable) {
                copyOnWrite();
                ((UserMedal) this.instance).addAllIds(iterable);
                return this;
            }

            public Builder addIds(String str) {
                copyOnWrite();
                ((UserMedal) this.instance).addIds(str);
                return this;
            }

            public Builder addIdsBytes(ByteString byteString) {
                copyOnWrite();
                ((UserMedal) this.instance).addIdsBytes(byteString);
                return this;
            }

            public Builder clearIds() {
                copyOnWrite();
                ((UserMedal) this.instance).clearIds();
                return this;
            }

            public Builder clearVersion() {
                copyOnWrite();
                ((UserMedal) this.instance).clearVersion();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.UserMedalOrBuilder
            public String getIds(int i) {
                return ((UserMedal) this.instance).getIds(i);
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.UserMedalOrBuilder
            public ByteString getIdsBytes(int i) {
                return ((UserMedal) this.instance).getIdsBytes(i);
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.UserMedalOrBuilder
            public int getIdsCount() {
                return ((UserMedal) this.instance).getIdsCount();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.UserMedalOrBuilder
            public List<String> getIdsList() {
                return Collections.unmodifiableList(((UserMedal) this.instance).getIdsList());
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.UserMedalOrBuilder
            public String getVersion() {
                return ((UserMedal) this.instance).getVersion();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.UserMedalOrBuilder
            public ByteString getVersionBytes() {
                return ((UserMedal) this.instance).getVersionBytes();
            }

            public Builder setIds(int i, String str) {
                copyOnWrite();
                ((UserMedal) this.instance).setIds(i, str);
                return this;
            }

            public Builder setVersion(String str) {
                copyOnWrite();
                ((UserMedal) this.instance).setVersion(str);
                return this;
            }

            public Builder setVersionBytes(ByteString byteString) {
                copyOnWrite();
                ((UserMedal) this.instance).setVersionBytes(byteString);
                return this;
            }
        }

        static {
            UserMedal userMedal = new UserMedal();
            DEFAULT_INSTANCE = userMedal;
            userMedal.makeImmutable();
        }

        private UserMedal() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllIds(Iterable<String> iterable) {
            ensureIdsIsMutable();
            AbstractC3426a.addAll(iterable, this.ids_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addIds(String str) {
            str.getClass();
            ensureIdsIsMutable();
            this.ids_.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addIdsBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            ensureIdsIsMutable();
            this.ids_.add(byteString.toStringUtf8());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIds() {
            this.ids_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVersion() {
            this.version_ = getDefaultInstance().getVersion();
        }

        private void ensureIdsIsMutable() {
            if (this.ids_.mo17140q()) {
                return;
            }
            this.ids_ = GeneratedMessageLite.mutableCopy(this.ids_);
        }

        public static UserMedal getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(UserMedal userMedal) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(userMedal);
        }

        public static UserMedal parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (UserMedal) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static UserMedal parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (UserMedal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<UserMedal> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIds(int i, String str) {
            str.getClass();
            ensureIdsIsMutable();
            this.ids_.set(i, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVersion(String str) {
            str.getClass();
            this.version_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVersionBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.version_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C45911.f16674xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new UserMedal();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.ids_.mo17139n();
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    UserMedal userMedal = (UserMedal) obj2;
                    this.ids_ = interfaceC3409h.mo17053g(this.ids_, userMedal.ids_);
                    this.version_ = interfaceC3409h.mo17052f(!this.version_.isEmpty(), this.version_, true ^ userMedal.version_.isEmpty(), userMedal.version_);
                    if (interfaceC3409h == GeneratedMessageLite.C3408g.INSTANCE) {
                        this.bitField0_ |= userMedal.bitField0_;
                    }
                    return this;
                case 6:
                    C3430e c3430e = (C3430e) obj;
                    boolean z = false;
                    while (!z) {
                        try {
                            int iM17171M = c3430e.m17171M();
                            if (iM17171M != 0) {
                                if (iM17171M == 10) {
                                    String strM17170L = c3430e.m17170L();
                                    if (!this.ids_.mo17140q()) {
                                        this.ids_ = GeneratedMessageLite.mutableCopy(this.ids_);
                                    }
                                    this.ids_.add(strM17170L);
                                } else if (iM17171M == 18) {
                                    this.version_ = c3430e.m17170L();
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
                        synchronized (UserMedal.class) {
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

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.UserMedalOrBuilder
        public String getIds(int i) {
            return this.ids_.get(i);
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.UserMedalOrBuilder
        public ByteString getIdsBytes(int i) {
            return ByteString.copyFromUtf8(this.ids_.get(i));
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.UserMedalOrBuilder
        public int getIdsCount() {
            return this.ids_.size();
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.UserMedalOrBuilder
        public List<String> getIdsList() {
            return this.ids_;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16957L = 0;
            for (int i2 = 0; i2 < this.ids_.size(); i2++) {
                iM16957L += CodedOutputStream.m16957L(this.ids_.get(i2));
            }
            int size = iM16957L + getIdsList().size();
            if (!this.version_.isEmpty()) {
                size += CodedOutputStream.m16956K(2, getVersion());
            }
            this.memoizedSerializedSize = size;
            return size;
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.UserMedalOrBuilder
        public String getVersion() {
            return this.version_;
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.UserMedalOrBuilder
        public ByteString getVersionBytes() {
            return ByteString.copyFromUtf8(this.version_);
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            for (int i = 0; i < this.ids_.size(); i++) {
                codedOutputStream.mo16994D0(1, this.ids_.get(i));
            }
            if (this.version_.isEmpty()) {
                return;
            }
            codedOutputStream.mo16994D0(2, getVersion());
        }

        public static UserMedal parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (UserMedal) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static UserMedal parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (UserMedal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        public static UserMedal parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (UserMedal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static UserMedal parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (UserMedal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static UserMedal parseFrom(InputStream inputStream) throws IOException {
            return (UserMedal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static UserMedal parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (UserMedal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static UserMedal parseFrom(C3430e c3430e) throws IOException {
            return (UserMedal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static UserMedal parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (UserMedal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }

    public static final class VoiceLiveMaskModeFollowApplyInfo extends GeneratedMessageLite<VoiceLiveMaskModeFollowApplyInfo, Builder> implements VoiceLiveMaskModeFollowApplyInfoOrBuilder {
        private static final VoiceLiveMaskModeFollowApplyInfo DEFAULT_INSTANCE;
        public static final int LIVEID_FIELD_NUMBER = 2;
        public static final int OTHERUSERID_FIELD_NUMBER = 4;
        private static volatile ng60<VoiceLiveMaskModeFollowApplyInfo> PARSER = null;
        public static final int ROOMID_FIELD_NUMBER = 1;
        public static final int USERID_FIELD_NUMBER = 3;
        private String roomId_ = "";
        private String liveId_ = "";
        private String userId_ = "";
        private String otherUserId_ = "";

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<VoiceLiveMaskModeFollowApplyInfo, Builder> implements VoiceLiveMaskModeFollowApplyInfoOrBuilder {
            private Builder() {
                super(VoiceLiveMaskModeFollowApplyInfo.DEFAULT_INSTANCE);
            }

            public Builder clearLiveId() {
                copyOnWrite();
                ((VoiceLiveMaskModeFollowApplyInfo) this.instance).clearLiveId();
                return this;
            }

            public Builder clearOtherUserId() {
                copyOnWrite();
                ((VoiceLiveMaskModeFollowApplyInfo) this.instance).clearOtherUserId();
                return this;
            }

            public Builder clearRoomId() {
                copyOnWrite();
                ((VoiceLiveMaskModeFollowApplyInfo) this.instance).clearRoomId();
                return this;
            }

            public Builder clearUserId() {
                copyOnWrite();
                ((VoiceLiveMaskModeFollowApplyInfo) this.instance).clearUserId();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.VoiceLiveMaskModeFollowApplyInfoOrBuilder
            public String getLiveId() {
                return ((VoiceLiveMaskModeFollowApplyInfo) this.instance).getLiveId();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.VoiceLiveMaskModeFollowApplyInfoOrBuilder
            public ByteString getLiveIdBytes() {
                return ((VoiceLiveMaskModeFollowApplyInfo) this.instance).getLiveIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.VoiceLiveMaskModeFollowApplyInfoOrBuilder
            public String getOtherUserId() {
                return ((VoiceLiveMaskModeFollowApplyInfo) this.instance).getOtherUserId();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.VoiceLiveMaskModeFollowApplyInfoOrBuilder
            public ByteString getOtherUserIdBytes() {
                return ((VoiceLiveMaskModeFollowApplyInfo) this.instance).getOtherUserIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.VoiceLiveMaskModeFollowApplyInfoOrBuilder
            public String getRoomId() {
                return ((VoiceLiveMaskModeFollowApplyInfo) this.instance).getRoomId();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.VoiceLiveMaskModeFollowApplyInfoOrBuilder
            public ByteString getRoomIdBytes() {
                return ((VoiceLiveMaskModeFollowApplyInfo) this.instance).getRoomIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.VoiceLiveMaskModeFollowApplyInfoOrBuilder
            public String getUserId() {
                return ((VoiceLiveMaskModeFollowApplyInfo) this.instance).getUserId();
            }

            @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.VoiceLiveMaskModeFollowApplyInfoOrBuilder
            public ByteString getUserIdBytes() {
                return ((VoiceLiveMaskModeFollowApplyInfo) this.instance).getUserIdBytes();
            }

            public Builder setLiveId(String str) {
                copyOnWrite();
                ((VoiceLiveMaskModeFollowApplyInfo) this.instance).setLiveId(str);
                return this;
            }

            public Builder setLiveIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceLiveMaskModeFollowApplyInfo) this.instance).setLiveIdBytes(byteString);
                return this;
            }

            public Builder setOtherUserId(String str) {
                copyOnWrite();
                ((VoiceLiveMaskModeFollowApplyInfo) this.instance).setOtherUserId(str);
                return this;
            }

            public Builder setOtherUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceLiveMaskModeFollowApplyInfo) this.instance).setOtherUserIdBytes(byteString);
                return this;
            }

            public Builder setRoomId(String str) {
                copyOnWrite();
                ((VoiceLiveMaskModeFollowApplyInfo) this.instance).setRoomId(str);
                return this;
            }

            public Builder setRoomIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceLiveMaskModeFollowApplyInfo) this.instance).setRoomIdBytes(byteString);
                return this;
            }

            public Builder setUserId(String str) {
                copyOnWrite();
                ((VoiceLiveMaskModeFollowApplyInfo) this.instance).setUserId(str);
                return this;
            }

            public Builder setUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceLiveMaskModeFollowApplyInfo) this.instance).setUserIdBytes(byteString);
                return this;
            }
        }

        static {
            VoiceLiveMaskModeFollowApplyInfo voiceLiveMaskModeFollowApplyInfo = new VoiceLiveMaskModeFollowApplyInfo();
            DEFAULT_INSTANCE = voiceLiveMaskModeFollowApplyInfo;
            voiceLiveMaskModeFollowApplyInfo.makeImmutable();
        }

        private VoiceLiveMaskModeFollowApplyInfo() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLiveId() {
            this.liveId_ = getDefaultInstance().getLiveId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOtherUserId() {
            this.otherUserId_ = getDefaultInstance().getOtherUserId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRoomId() {
            this.roomId_ = getDefaultInstance().getRoomId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUserId() {
            this.userId_ = getDefaultInstance().getUserId();
        }

        public static VoiceLiveMaskModeFollowApplyInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(VoiceLiveMaskModeFollowApplyInfo voiceLiveMaskModeFollowApplyInfo) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(voiceLiveMaskModeFollowApplyInfo);
        }

        public static VoiceLiveMaskModeFollowApplyInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VoiceLiveMaskModeFollowApplyInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceLiveMaskModeFollowApplyInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VoiceLiveMaskModeFollowApplyInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<VoiceLiveMaskModeFollowApplyInfo> parser() {
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
            switch (C45911.f16674xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoiceLiveMaskModeFollowApplyInfo();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    VoiceLiveMaskModeFollowApplyInfo voiceLiveMaskModeFollowApplyInfo = (VoiceLiveMaskModeFollowApplyInfo) obj2;
                    this.roomId_ = interfaceC3409h.mo17052f(!this.roomId_.isEmpty(), this.roomId_, !voiceLiveMaskModeFollowApplyInfo.roomId_.isEmpty(), voiceLiveMaskModeFollowApplyInfo.roomId_);
                    this.liveId_ = interfaceC3409h.mo17052f(!this.liveId_.isEmpty(), this.liveId_, !voiceLiveMaskModeFollowApplyInfo.liveId_.isEmpty(), voiceLiveMaskModeFollowApplyInfo.liveId_);
                    this.userId_ = interfaceC3409h.mo17052f(!this.userId_.isEmpty(), this.userId_, !voiceLiveMaskModeFollowApplyInfo.userId_.isEmpty(), voiceLiveMaskModeFollowApplyInfo.userId_);
                    this.otherUserId_ = interfaceC3409h.mo17052f(!this.otherUserId_.isEmpty(), this.otherUserId_, true ^ voiceLiveMaskModeFollowApplyInfo.otherUserId_.isEmpty(), voiceLiveMaskModeFollowApplyInfo.otherUserId_);
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
                                    this.liveId_ = c3430e.m17170L();
                                } else if (iM17171M == 26) {
                                    this.userId_ = c3430e.m17170L();
                                } else if (iM17171M == 34) {
                                    this.otherUserId_ = c3430e.m17170L();
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
                        synchronized (VoiceLiveMaskModeFollowApplyInfo.class) {
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

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.VoiceLiveMaskModeFollowApplyInfoOrBuilder
        public String getLiveId() {
            return this.liveId_;
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.VoiceLiveMaskModeFollowApplyInfoOrBuilder
        public ByteString getLiveIdBytes() {
            return ByteString.copyFromUtf8(this.liveId_);
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.VoiceLiveMaskModeFollowApplyInfoOrBuilder
        public String getOtherUserId() {
            return this.otherUserId_;
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.VoiceLiveMaskModeFollowApplyInfoOrBuilder
        public ByteString getOtherUserIdBytes() {
            return ByteString.copyFromUtf8(this.otherUserId_);
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.VoiceLiveMaskModeFollowApplyInfoOrBuilder
        public String getRoomId() {
            return this.roomId_;
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.VoiceLiveMaskModeFollowApplyInfoOrBuilder
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
            if (!this.userId_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(3, getUserId());
            }
            if (!this.otherUserId_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(4, getOtherUserId());
            }
            this.memoizedSerializedSize = iM16956K;
            return iM16956K;
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.VoiceLiveMaskModeFollowApplyInfoOrBuilder
        public String getUserId() {
            return this.userId_;
        }

        @Override // com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage.VoiceLiveMaskModeFollowApplyInfoOrBuilder
        public ByteString getUserIdBytes() {
            return ByteString.copyFromUtf8(this.userId_);
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.roomId_.isEmpty()) {
                codedOutputStream.mo16994D0(1, getRoomId());
            }
            if (!this.liveId_.isEmpty()) {
                codedOutputStream.mo16994D0(2, getLiveId());
            }
            if (!this.userId_.isEmpty()) {
                codedOutputStream.mo16994D0(3, getUserId());
            }
            if (this.otherUserId_.isEmpty()) {
                return;
            }
            codedOutputStream.mo16994D0(4, getOtherUserId());
        }

        public static VoiceLiveMaskModeFollowApplyInfo parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (VoiceLiveMaskModeFollowApplyInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static VoiceLiveMaskModeFollowApplyInfo parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (VoiceLiveMaskModeFollowApplyInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        public static VoiceLiveMaskModeFollowApplyInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoiceLiveMaskModeFollowApplyInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoiceLiveMaskModeFollowApplyInfo parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (VoiceLiveMaskModeFollowApplyInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static VoiceLiveMaskModeFollowApplyInfo parseFrom(InputStream inputStream) throws IOException {
            return (VoiceLiveMaskModeFollowApplyInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceLiveMaskModeFollowApplyInfo parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (VoiceLiveMaskModeFollowApplyInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static VoiceLiveMaskModeFollowApplyInfo parseFrom(C3430e c3430e) throws IOException {
            return (VoiceLiveMaskModeFollowApplyInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static VoiceLiveMaskModeFollowApplyInfo parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (VoiceLiveMaskModeFollowApplyInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }
}
