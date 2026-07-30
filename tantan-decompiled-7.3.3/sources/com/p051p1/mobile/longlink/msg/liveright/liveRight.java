package com.p051p1.mobile.longlink.msg.liveright;

import com.google.protobuf.AbstractC3426a;
import com.google.protobuf.ByteString;
import com.google.protobuf.C3430e;
import com.google.protobuf.C3433h;
import com.google.protobuf.C3437l;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InterfaceC3442q;
import com.google.protobuf.InvalidProtocolBufferException;
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
public final class liveRight {

    /* JADX INFO: renamed from: com.p1.mobile.longlink.msg.liveright.liveRight$1 */
    public static /* synthetic */ class C46081 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16684xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f16684xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16684xa1df5c61[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16684xa1df5c61[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16684xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16684xa1df5c61[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16684xa1df5c61[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16684xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f16684xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public interface AcquireUserLiveRightMsgOrBuilder extends lfz {
        AcquireUserLiveRightMsg.AcquireUserLiveRightAction getAction();

        int getActionValue();

        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        long getServerTimeInSeconds();

        UserLiveRight getUserLiveRight();

        boolean hasUserLiveRight();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface AttributeOrBuilder extends lfz {
        AvatarConfig getAvatarConfig();

        CallEffectConfig getCallEffectConfig();

        ChatShadingConfig getChatShadingConfig();

        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        String getJumpUrl();

        ByteString getJumpUrlBytes();

        ProfileConfig getProfileConfig();

        String getResourceUrl();

        ByteString getResourceUrlBytes();

        Restrict getRestrict();

        String getThumbnailUrl();

        ByteString getThumbnailUrlBytes();

        boolean hasAvatarConfig();

        boolean hasCallEffectConfig();

        boolean hasChatShadingConfig();

        boolean hasProfileConfig();

        boolean hasRestrict();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface AvatarConfigOrBuilder extends lfz {
        String getAvatarUrl();

        ByteString getAvatarUrlBytes();

        String getConnectorImage();

        ByteString getConnectorImageBytes();

        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        PictureConfig getFrameConfig();

        boolean hasFrameConfig();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface CallEffectConfigOrBuilder extends lfz {
        String getCircleVoicingUrl();

        ByteString getCircleVoicingUrlBytes();

        String getDefaultIcon();

        ByteString getDefaultIconBytes();

        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        String getHorizontalBg();

        ByteString getHorizontalBgBytes();

        String getHorizontalVoicingUrl();

        ByteString getHorizontalVoicingUrlBytes();

        String getMuteIcon();

        ByteString getMuteIconBytes();

        String getVerticalBg();

        ByteString getVerticalBgBytes();

        String getVerticalVoicingUrl();

        ByteString getVerticalVoicingUrlBytes();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface ChatShadingConfigOrBuilder extends lfz {
        ColorConfig getBackgroundColorConfig();

        ColorConfig getBorderColorConfig();

        CornerConfig getCornerConfig();

        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        boolean hasBackgroundColorConfig();

        boolean hasBorderColorConfig();

        boolean hasCornerConfig();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface ColorConfigOrBuilder extends lfz {
        String getColors(int i);

        ByteString getColorsBytes(int i);

        int getColorsCount();

        List<String> getColorsList();

        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        GradientDirection getGradientDirection();

        int getGradientDirectionValue();

        long getTransparency();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface CornerConfigOrBuilder extends lfz {
        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        String getPictureUrl();

        ByteString getPictureUrlBytes();

        CornerPosition getPosition();

        int getPositionValue();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface PeriodConfigOrBuilder extends lfz {
        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        FadingType getFadingType();

        int getFadingTypeValue();

        long getFadingValue();

        boolean getShow();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface PictureConfigOrBuilder extends lfz {
        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        String getDynamicUrl();

        ByteString getDynamicUrlBytes();

        String getStaticUrl();

        ByteString getStaticUrlBytes();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface ProfileConfigOrBuilder extends lfz {
        PictureConfig getBackgroundPictureConfig();

        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        PictureConfig getTopFrameConfig();

        boolean hasBackgroundPictureConfig();

        boolean hasTopFrameConfig();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface RestrictOrBuilder extends lfz {
        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        long getGiftIds(int i);

        int getGiftIdsCount();

        List<Long> getGiftIdsList();

        long getGrade();

        ReceiveType getReceiveType();

        int getReceiveTypeValue();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface TopChatUpdateNoticeOrBuilder extends lfz {
        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        long getRandomDelaySeconds();

        long getTimestamp();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface UserLiveRightOrBuilder extends lfz {
        Attribute getAttribute();

        long getCreateTimeInSeconds();

        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        String getFromUserId();

        ByteString getFromUserIdBytes();

        String getId();

        ByteString getIdBytes();

        long getLevel();

        String getLiveRightId();

        ByteString getLiveRightIdBytes();

        String getName();

        ByteString getNameBytes();

        PlaceType getPlaceType();

        int getPlaceTypeValue();

        Type getRightType();

        int getRightTypeValue();

        ShowType getShowType();

        int getShowTypeValue();

        UserLiveRightStatus getStatus();

        int getStatusValue();

        String getUserId();

        ByteString getUserIdBytes();

        long getValidEndTimeInSeconds();

        boolean hasAttribute();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface UserLiveRightResourcesOrBuilder extends lfz {
        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        UserLiveRight getUserLiveRights(int i);

        int getUserLiveRightsCount();

        List<UserLiveRight> getUserLiveRightsList();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    private liveRight() {
    }

    public static void registerAllExtensions(C3433h c3433h) {
    }

    public static final class AcquireUserLiveRightMsg extends GeneratedMessageLite<AcquireUserLiveRightMsg, Builder> implements AcquireUserLiveRightMsgOrBuilder {
        public static final int ACTION_FIELD_NUMBER = 1;
        private static final AcquireUserLiveRightMsg DEFAULT_INSTANCE;
        private static volatile ng60<AcquireUserLiveRightMsg> PARSER = null;
        public static final int SERVERTIMEINSECONDS_FIELD_NUMBER = 3;
        public static final int USERLIVERIGHT_FIELD_NUMBER = 2;
        private int action_;
        private long serverTimeInSeconds_;
        private UserLiveRight userLiveRight_;

        static {
            AcquireUserLiveRightMsg acquireUserLiveRightMsg = new AcquireUserLiveRightMsg();
            DEFAULT_INSTANCE = acquireUserLiveRightMsg;
            acquireUserLiveRightMsg.makeImmutable();
        }

        private AcquireUserLiveRightMsg() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAction() {
            this.action_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearServerTimeInSeconds() {
            this.serverTimeInSeconds_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUserLiveRight() {
            this.userLiveRight_ = null;
        }

        public static AcquireUserLiveRightMsg getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeUserLiveRight(UserLiveRight userLiveRight) {
            UserLiveRight userLiveRight2 = this.userLiveRight_;
            if (userLiveRight2 == null || userLiveRight2 == UserLiveRight.getDefaultInstance()) {
                this.userLiveRight_ = userLiveRight;
            } else {
                this.userLiveRight_ = UserLiveRight.newBuilder(this.userLiveRight_).mergeFrom(userLiveRight).buildPartial();
            }
        }

        public static Builder newBuilder(AcquireUserLiveRightMsg acquireUserLiveRightMsg) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(acquireUserLiveRightMsg);
        }

        public static AcquireUserLiveRightMsg parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (AcquireUserLiveRightMsg) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AcquireUserLiveRightMsg parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (AcquireUserLiveRightMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<AcquireUserLiveRightMsg> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAction(AcquireUserLiveRightAction acquireUserLiveRightAction) {
            acquireUserLiveRightAction.getClass();
            this.action_ = acquireUserLiveRightAction.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setActionValue(int i) {
            this.action_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setServerTimeInSeconds(long j) {
            this.serverTimeInSeconds_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserLiveRight(UserLiveRight.Builder builder) {
            this.userLiveRight_ = builder.build();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C46081.f16684xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new AcquireUserLiveRightMsg();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    AcquireUserLiveRightMsg acquireUserLiveRightMsg = (AcquireUserLiveRightMsg) obj2;
                    int i = this.action_;
                    boolean z2 = i != 0;
                    int i2 = acquireUserLiveRightMsg.action_;
                    this.action_ = interfaceC3409h.mo17051e(z2, i, i2 != 0, i2);
                    this.userLiveRight_ = (UserLiveRight) interfaceC3409h.mo17061o(this.userLiveRight_, acquireUserLiveRightMsg.userLiveRight_);
                    long j = this.serverTimeInSeconds_;
                    boolean z3 = j != 0;
                    long j2 = acquireUserLiveRightMsg.serverTimeInSeconds_;
                    this.serverTimeInSeconds_ = interfaceC3409h.mo17055i(z3, j, j2 != 0, j2);
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
                                    this.action_ = c3430e.m17191p();
                                } else if (iM17171M == 18) {
                                    UserLiveRight userLiveRight = this.userLiveRight_;
                                    UserLiveRight.Builder builder = userLiveRight != null ? userLiveRight.toBuilder() : null;
                                    UserLiveRight userLiveRight2 = (UserLiveRight) c3430e.m17198w(UserLiveRight.parser(), c3433h);
                                    this.userLiveRight_ = userLiveRight2;
                                    if (builder != null) {
                                        builder.mergeFrom(userLiveRight2);
                                        this.userLiveRight_ = builder.buildPartial();
                                    }
                                } else if (iM17171M == 24) {
                                    this.serverTimeInSeconds_ = c3430e.m17197v();
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
                        synchronized (AcquireUserLiveRightMsg.class) {
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

        @Override // com.p1.mobile.longlink.msg.liveright.liveRight.AcquireUserLiveRightMsgOrBuilder
        public AcquireUserLiveRightAction getAction() {
            AcquireUserLiveRightAction acquireUserLiveRightActionForNumber = AcquireUserLiveRightAction.forNumber(this.action_);
            return acquireUserLiveRightActionForNumber == null ? AcquireUserLiveRightAction.UNRECOGNIZED : acquireUserLiveRightActionForNumber;
        }

        @Override // com.p1.mobile.longlink.msg.liveright.liveRight.AcquireUserLiveRightMsgOrBuilder
        public int getActionValue() {
            return this.action_;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16977m = this.action_ != AcquireUserLiveRightAction.equip.getNumber() ? CodedOutputStream.m16977m(1, this.action_) : 0;
            if (this.userLiveRight_ != null) {
                iM16977m += CodedOutputStream.m16948C(2, getUserLiveRight());
            }
            long j = this.serverTimeInSeconds_;
            if (j != 0) {
                iM16977m += CodedOutputStream.m16986v(3, j);
            }
            this.memoizedSerializedSize = iM16977m;
            return iM16977m;
        }

        @Override // com.p1.mobile.longlink.msg.liveright.liveRight.AcquireUserLiveRightMsgOrBuilder
        public long getServerTimeInSeconds() {
            return this.serverTimeInSeconds_;
        }

        @Override // com.p1.mobile.longlink.msg.liveright.liveRight.AcquireUserLiveRightMsgOrBuilder
        public UserLiveRight getUserLiveRight() {
            UserLiveRight userLiveRight = this.userLiveRight_;
            return userLiveRight == null ? UserLiveRight.getDefaultInstance() : userLiveRight;
        }

        @Override // com.p1.mobile.longlink.msg.liveright.liveRight.AcquireUserLiveRightMsgOrBuilder
        public boolean hasUserLiveRight() {
            return this.userLiveRight_ != null;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.action_ != AcquireUserLiveRightAction.equip.getNumber()) {
                codedOutputStream.m17015i0(1, this.action_);
            }
            if (this.userLiveRight_ != null) {
                codedOutputStream.mo17029w0(2, getUserLiveRight());
            }
            long j = this.serverTimeInSeconds_;
            if (j != 0) {
                codedOutputStream.m17027u0(3, j);
            }
        }

        public enum AcquireUserLiveRightAction implements C3437l.c {
            equip(0),
            unequip(1),
            UNRECOGNIZED(-1);

            public static final int equip_VALUE = 0;
            private static final C3437l.d<AcquireUserLiveRightAction> internalValueMap = new C3437l.d<AcquireUserLiveRightAction>() { // from class: com.p1.mobile.longlink.msg.liveright.liveRight.AcquireUserLiveRightMsg.AcquireUserLiveRightAction.1
                @Override // com.google.protobuf.C3437l.d
                public AcquireUserLiveRightAction findValueByNumber(int i) {
                    return AcquireUserLiveRightAction.forNumber(i);
                }
            };
            public static final int unequip_VALUE = 1;
            private final int value;

            AcquireUserLiveRightAction(int i) {
                this.value = i;
            }

            public static AcquireUserLiveRightAction forNumber(int i) {
                if (i == 0) {
                    return equip;
                }
                if (i != 1) {
                    return null;
                }
                return unequip;
            }

            public static C3437l.d<AcquireUserLiveRightAction> internalGetValueMap() {
                return internalValueMap;
            }

            @Override // com.google.protobuf.C3437l.c
            public final int getNumber() {
                return this.value;
            }

            @Deprecated
            public static AcquireUserLiveRightAction valueOf(int i) {
                return forNumber(i);
            }
        }

        public static AcquireUserLiveRightMsg parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (AcquireUserLiveRightMsg) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static AcquireUserLiveRightMsg parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (AcquireUserLiveRightMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserLiveRight(UserLiveRight userLiveRight) {
            userLiveRight.getClass();
            this.userLiveRight_ = userLiveRight;
        }

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<AcquireUserLiveRightMsg, Builder> implements AcquireUserLiveRightMsgOrBuilder {
            private Builder() {
                super(AcquireUserLiveRightMsg.DEFAULT_INSTANCE);
            }

            public Builder clearAction() {
                copyOnWrite();
                ((AcquireUserLiveRightMsg) this.instance).clearAction();
                return this;
            }

            public Builder clearServerTimeInSeconds() {
                copyOnWrite();
                ((AcquireUserLiveRightMsg) this.instance).clearServerTimeInSeconds();
                return this;
            }

            public Builder clearUserLiveRight() {
                copyOnWrite();
                ((AcquireUserLiveRightMsg) this.instance).clearUserLiveRight();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveright.liveRight.AcquireUserLiveRightMsgOrBuilder
            public AcquireUserLiveRightAction getAction() {
                return ((AcquireUserLiveRightMsg) this.instance).getAction();
            }

            @Override // com.p1.mobile.longlink.msg.liveright.liveRight.AcquireUserLiveRightMsgOrBuilder
            public int getActionValue() {
                return ((AcquireUserLiveRightMsg) this.instance).getActionValue();
            }

            @Override // com.p1.mobile.longlink.msg.liveright.liveRight.AcquireUserLiveRightMsgOrBuilder
            public long getServerTimeInSeconds() {
                return ((AcquireUserLiveRightMsg) this.instance).getServerTimeInSeconds();
            }

            @Override // com.p1.mobile.longlink.msg.liveright.liveRight.AcquireUserLiveRightMsgOrBuilder
            public UserLiveRight getUserLiveRight() {
                return ((AcquireUserLiveRightMsg) this.instance).getUserLiveRight();
            }

            @Override // com.p1.mobile.longlink.msg.liveright.liveRight.AcquireUserLiveRightMsgOrBuilder
            public boolean hasUserLiveRight() {
                return ((AcquireUserLiveRightMsg) this.instance).hasUserLiveRight();
            }

            public Builder mergeUserLiveRight(UserLiveRight userLiveRight) {
                copyOnWrite();
                ((AcquireUserLiveRightMsg) this.instance).mergeUserLiveRight(userLiveRight);
                return this;
            }

            public Builder setAction(AcquireUserLiveRightAction acquireUserLiveRightAction) {
                copyOnWrite();
                ((AcquireUserLiveRightMsg) this.instance).setAction(acquireUserLiveRightAction);
                return this;
            }

            public Builder setActionValue(int i) {
                copyOnWrite();
                ((AcquireUserLiveRightMsg) this.instance).setActionValue(i);
                return this;
            }

            public Builder setServerTimeInSeconds(long j) {
                copyOnWrite();
                ((AcquireUserLiveRightMsg) this.instance).setServerTimeInSeconds(j);
                return this;
            }

            public Builder setUserLiveRight(UserLiveRight userLiveRight) {
                copyOnWrite();
                ((AcquireUserLiveRightMsg) this.instance).setUserLiveRight(userLiveRight);
                return this;
            }

            public Builder setUserLiveRight(UserLiveRight.Builder builder) {
                copyOnWrite();
                ((AcquireUserLiveRightMsg) this.instance).setUserLiveRight(builder);
                return this;
            }
        }

        public static AcquireUserLiveRightMsg parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (AcquireUserLiveRightMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static AcquireUserLiveRightMsg parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (AcquireUserLiveRightMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static AcquireUserLiveRightMsg parseFrom(InputStream inputStream) throws IOException {
            return (AcquireUserLiveRightMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AcquireUserLiveRightMsg parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (AcquireUserLiveRightMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static AcquireUserLiveRightMsg parseFrom(C3430e c3430e) throws IOException {
            return (AcquireUserLiveRightMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static AcquireUserLiveRightMsg parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (AcquireUserLiveRightMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }

    public static final class Attribute extends GeneratedMessageLite<Attribute, Builder> implements AttributeOrBuilder {
        public static final int AVATARCONFIG_FIELD_NUMBER = 11;
        public static final int CALLEFFECTCONFIG_FIELD_NUMBER = 13;
        public static final int CHATSHADINGCONFIG_FIELD_NUMBER = 10;
        private static final Attribute DEFAULT_INSTANCE;
        public static final int JUMPURL_FIELD_NUMBER = 3;
        private static volatile ng60<Attribute> PARSER = null;
        public static final int PROFILECONFIG_FIELD_NUMBER = 12;
        public static final int RESOURCEURL_FIELD_NUMBER = 5;
        public static final int RESTRICT_FIELD_NUMBER = 4;
        public static final int THUMBNAILURL_FIELD_NUMBER = 2;
        private AvatarConfig avatarConfig_;
        private CallEffectConfig callEffectConfig_;
        private ChatShadingConfig chatShadingConfig_;
        private ProfileConfig profileConfig_;
        private Restrict restrict_;
        private String thumbnailUrl_ = "";
        private String jumpUrl_ = "";
        private String resourceUrl_ = "";

        static {
            Attribute attribute = new Attribute();
            DEFAULT_INSTANCE = attribute;
            attribute.makeImmutable();
        }

        private Attribute() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAvatarConfig() {
            this.avatarConfig_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCallEffectConfig() {
            this.callEffectConfig_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearChatShadingConfig() {
            this.chatShadingConfig_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearJumpUrl() {
            this.jumpUrl_ = getDefaultInstance().getJumpUrl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearProfileConfig() {
            this.profileConfig_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearResourceUrl() {
            this.resourceUrl_ = getDefaultInstance().getResourceUrl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRestrict() {
            this.restrict_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearThumbnailUrl() {
            this.thumbnailUrl_ = getDefaultInstance().getThumbnailUrl();
        }

        public static Attribute getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeAvatarConfig(AvatarConfig avatarConfig) {
            AvatarConfig avatarConfig2 = this.avatarConfig_;
            if (avatarConfig2 == null || avatarConfig2 == AvatarConfig.getDefaultInstance()) {
                this.avatarConfig_ = avatarConfig;
            } else {
                this.avatarConfig_ = AvatarConfig.newBuilder(this.avatarConfig_).mergeFrom(avatarConfig).buildPartial();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeCallEffectConfig(CallEffectConfig callEffectConfig) {
            CallEffectConfig callEffectConfig2 = this.callEffectConfig_;
            if (callEffectConfig2 == null || callEffectConfig2 == CallEffectConfig.getDefaultInstance()) {
                this.callEffectConfig_ = callEffectConfig;
            } else {
                this.callEffectConfig_ = CallEffectConfig.newBuilder(this.callEffectConfig_).mergeFrom(callEffectConfig).buildPartial();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeChatShadingConfig(ChatShadingConfig chatShadingConfig) {
            ChatShadingConfig chatShadingConfig2 = this.chatShadingConfig_;
            if (chatShadingConfig2 == null || chatShadingConfig2 == ChatShadingConfig.getDefaultInstance()) {
                this.chatShadingConfig_ = chatShadingConfig;
            } else {
                this.chatShadingConfig_ = ChatShadingConfig.newBuilder(this.chatShadingConfig_).mergeFrom(chatShadingConfig).buildPartial();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeProfileConfig(ProfileConfig profileConfig) {
            ProfileConfig profileConfig2 = this.profileConfig_;
            if (profileConfig2 == null || profileConfig2 == ProfileConfig.getDefaultInstance()) {
                this.profileConfig_ = profileConfig;
            } else {
                this.profileConfig_ = ProfileConfig.newBuilder(this.profileConfig_).mergeFrom(profileConfig).buildPartial();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeRestrict(Restrict restrict) {
            Restrict restrict2 = this.restrict_;
            if (restrict2 == null || restrict2 == Restrict.getDefaultInstance()) {
                this.restrict_ = restrict;
            } else {
                this.restrict_ = Restrict.newBuilder(this.restrict_).mergeFrom(restrict).buildPartial();
            }
        }

        public static Builder newBuilder(Attribute attribute) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(attribute);
        }

        public static Attribute parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Attribute) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Attribute parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Attribute) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<Attribute> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAvatarConfig(AvatarConfig.Builder builder) {
            this.avatarConfig_ = builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCallEffectConfig(CallEffectConfig.Builder builder) {
            this.callEffectConfig_ = builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setChatShadingConfig(ChatShadingConfig.Builder builder) {
            this.chatShadingConfig_ = builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setJumpUrl(String str) {
            str.getClass();
            this.jumpUrl_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setJumpUrlBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.jumpUrl_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setProfileConfig(ProfileConfig.Builder builder) {
            this.profileConfig_ = builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setResourceUrl(String str) {
            str.getClass();
            this.resourceUrl_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setResourceUrlBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.resourceUrl_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRestrict(Restrict.Builder builder) {
            this.restrict_ = builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setThumbnailUrl(String str) {
            str.getClass();
            this.thumbnailUrl_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setThumbnailUrlBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.thumbnailUrl_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C46081.f16684xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new Attribute();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    Attribute attribute = (Attribute) obj2;
                    this.thumbnailUrl_ = interfaceC3409h.mo17052f(!this.thumbnailUrl_.isEmpty(), this.thumbnailUrl_, !attribute.thumbnailUrl_.isEmpty(), attribute.thumbnailUrl_);
                    this.jumpUrl_ = interfaceC3409h.mo17052f(!this.jumpUrl_.isEmpty(), this.jumpUrl_, !attribute.jumpUrl_.isEmpty(), attribute.jumpUrl_);
                    this.restrict_ = (Restrict) interfaceC3409h.mo17061o(this.restrict_, attribute.restrict_);
                    this.resourceUrl_ = interfaceC3409h.mo17052f(!this.resourceUrl_.isEmpty(), this.resourceUrl_, true ^ attribute.resourceUrl_.isEmpty(), attribute.resourceUrl_);
                    this.chatShadingConfig_ = (ChatShadingConfig) interfaceC3409h.mo17061o(this.chatShadingConfig_, attribute.chatShadingConfig_);
                    this.avatarConfig_ = (AvatarConfig) interfaceC3409h.mo17061o(this.avatarConfig_, attribute.avatarConfig_);
                    this.profileConfig_ = (ProfileConfig) interfaceC3409h.mo17061o(this.profileConfig_, attribute.profileConfig_);
                    this.callEffectConfig_ = (CallEffectConfig) interfaceC3409h.mo17061o(this.callEffectConfig_, attribute.callEffectConfig_);
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
                                if (iM17171M == 18) {
                                    this.thumbnailUrl_ = c3430e.m17170L();
                                } else if (iM17171M == 26) {
                                    this.jumpUrl_ = c3430e.m17170L();
                                } else if (iM17171M == 34) {
                                    Restrict restrict = this.restrict_;
                                    Restrict.Builder builder = restrict != null ? restrict.toBuilder() : null;
                                    Restrict restrict2 = (Restrict) c3430e.m17198w(Restrict.parser(), c3433h);
                                    this.restrict_ = restrict2;
                                    if (builder != null) {
                                        builder.mergeFrom(restrict2);
                                        this.restrict_ = builder.buildPartial();
                                    }
                                } else if (iM17171M == 42) {
                                    this.resourceUrl_ = c3430e.m17170L();
                                } else if (iM17171M == 82) {
                                    ChatShadingConfig chatShadingConfig = this.chatShadingConfig_;
                                    ChatShadingConfig.Builder builder2 = chatShadingConfig != null ? chatShadingConfig.toBuilder() : null;
                                    ChatShadingConfig chatShadingConfig2 = (ChatShadingConfig) c3430e.m17198w(ChatShadingConfig.parser(), c3433h);
                                    this.chatShadingConfig_ = chatShadingConfig2;
                                    if (builder2 != null) {
                                        builder2.mergeFrom(chatShadingConfig2);
                                        this.chatShadingConfig_ = builder2.buildPartial();
                                    }
                                } else if (iM17171M == 90) {
                                    AvatarConfig avatarConfig = this.avatarConfig_;
                                    AvatarConfig.Builder builder3 = avatarConfig != null ? avatarConfig.toBuilder() : null;
                                    AvatarConfig avatarConfig2 = (AvatarConfig) c3430e.m17198w(AvatarConfig.parser(), c3433h);
                                    this.avatarConfig_ = avatarConfig2;
                                    if (builder3 != null) {
                                        builder3.mergeFrom(avatarConfig2);
                                        this.avatarConfig_ = builder3.buildPartial();
                                    }
                                } else if (iM17171M == 98) {
                                    ProfileConfig profileConfig = this.profileConfig_;
                                    ProfileConfig.Builder builder4 = profileConfig != null ? profileConfig.toBuilder() : null;
                                    ProfileConfig profileConfig2 = (ProfileConfig) c3430e.m17198w(ProfileConfig.parser(), c3433h);
                                    this.profileConfig_ = profileConfig2;
                                    if (builder4 != null) {
                                        builder4.mergeFrom(profileConfig2);
                                        this.profileConfig_ = builder4.buildPartial();
                                    }
                                } else if (iM17171M == 106) {
                                    CallEffectConfig callEffectConfig = this.callEffectConfig_;
                                    CallEffectConfig.Builder builder5 = callEffectConfig != null ? callEffectConfig.toBuilder() : null;
                                    CallEffectConfig callEffectConfig2 = (CallEffectConfig) c3430e.m17198w(CallEffectConfig.parser(), c3433h);
                                    this.callEffectConfig_ = callEffectConfig2;
                                    if (builder5 != null) {
                                        builder5.mergeFrom(callEffectConfig2);
                                        this.callEffectConfig_ = builder5.buildPartial();
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
                        synchronized (Attribute.class) {
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

        @Override // com.p1.mobile.longlink.msg.liveright.liveRight.AttributeOrBuilder
        public AvatarConfig getAvatarConfig() {
            AvatarConfig avatarConfig = this.avatarConfig_;
            return avatarConfig == null ? AvatarConfig.getDefaultInstance() : avatarConfig;
        }

        @Override // com.p1.mobile.longlink.msg.liveright.liveRight.AttributeOrBuilder
        public CallEffectConfig getCallEffectConfig() {
            CallEffectConfig callEffectConfig = this.callEffectConfig_;
            return callEffectConfig == null ? CallEffectConfig.getDefaultInstance() : callEffectConfig;
        }

        @Override // com.p1.mobile.longlink.msg.liveright.liveRight.AttributeOrBuilder
        public ChatShadingConfig getChatShadingConfig() {
            ChatShadingConfig chatShadingConfig = this.chatShadingConfig_;
            return chatShadingConfig == null ? ChatShadingConfig.getDefaultInstance() : chatShadingConfig;
        }

        @Override // com.p1.mobile.longlink.msg.liveright.liveRight.AttributeOrBuilder
        public String getJumpUrl() {
            return this.jumpUrl_;
        }

        @Override // com.p1.mobile.longlink.msg.liveright.liveRight.AttributeOrBuilder
        public ByteString getJumpUrlBytes() {
            return ByteString.copyFromUtf8(this.jumpUrl_);
        }

        @Override // com.p1.mobile.longlink.msg.liveright.liveRight.AttributeOrBuilder
        public ProfileConfig getProfileConfig() {
            ProfileConfig profileConfig = this.profileConfig_;
            return profileConfig == null ? ProfileConfig.getDefaultInstance() : profileConfig;
        }

        @Override // com.p1.mobile.longlink.msg.liveright.liveRight.AttributeOrBuilder
        public String getResourceUrl() {
            return this.resourceUrl_;
        }

        @Override // com.p1.mobile.longlink.msg.liveright.liveRight.AttributeOrBuilder
        public ByteString getResourceUrlBytes() {
            return ByteString.copyFromUtf8(this.resourceUrl_);
        }

        @Override // com.p1.mobile.longlink.msg.liveright.liveRight.AttributeOrBuilder
        public Restrict getRestrict() {
            Restrict restrict = this.restrict_;
            return restrict == null ? Restrict.getDefaultInstance() : restrict;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16956K = !this.thumbnailUrl_.isEmpty() ? CodedOutputStream.m16956K(2, getThumbnailUrl()) : 0;
            if (!this.jumpUrl_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(3, getJumpUrl());
            }
            if (this.restrict_ != null) {
                iM16956K += CodedOutputStream.m16948C(4, getRestrict());
            }
            if (!this.resourceUrl_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(5, getResourceUrl());
            }
            if (this.chatShadingConfig_ != null) {
                iM16956K += CodedOutputStream.m16948C(10, getChatShadingConfig());
            }
            if (this.avatarConfig_ != null) {
                iM16956K += CodedOutputStream.m16948C(11, getAvatarConfig());
            }
            if (this.profileConfig_ != null) {
                iM16956K += CodedOutputStream.m16948C(12, getProfileConfig());
            }
            if (this.callEffectConfig_ != null) {
                iM16956K += CodedOutputStream.m16948C(13, getCallEffectConfig());
            }
            this.memoizedSerializedSize = iM16956K;
            return iM16956K;
        }

        @Override // com.p1.mobile.longlink.msg.liveright.liveRight.AttributeOrBuilder
        public String getThumbnailUrl() {
            return this.thumbnailUrl_;
        }

        @Override // com.p1.mobile.longlink.msg.liveright.liveRight.AttributeOrBuilder
        public ByteString getThumbnailUrlBytes() {
            return ByteString.copyFromUtf8(this.thumbnailUrl_);
        }

        @Override // com.p1.mobile.longlink.msg.liveright.liveRight.AttributeOrBuilder
        public boolean hasAvatarConfig() {
            return this.avatarConfig_ != null;
        }

        @Override // com.p1.mobile.longlink.msg.liveright.liveRight.AttributeOrBuilder
        public boolean hasCallEffectConfig() {
            return this.callEffectConfig_ != null;
        }

        @Override // com.p1.mobile.longlink.msg.liveright.liveRight.AttributeOrBuilder
        public boolean hasChatShadingConfig() {
            return this.chatShadingConfig_ != null;
        }

        @Override // com.p1.mobile.longlink.msg.liveright.liveRight.AttributeOrBuilder
        public boolean hasProfileConfig() {
            return this.profileConfig_ != null;
        }

        @Override // com.p1.mobile.longlink.msg.liveright.liveRight.AttributeOrBuilder
        public boolean hasRestrict() {
            return this.restrict_ != null;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.thumbnailUrl_.isEmpty()) {
                codedOutputStream.mo16994D0(2, getThumbnailUrl());
            }
            if (!this.jumpUrl_.isEmpty()) {
                codedOutputStream.mo16994D0(3, getJumpUrl());
            }
            if (this.restrict_ != null) {
                codedOutputStream.mo17029w0(4, getRestrict());
            }
            if (!this.resourceUrl_.isEmpty()) {
                codedOutputStream.mo16994D0(5, getResourceUrl());
            }
            if (this.chatShadingConfig_ != null) {
                codedOutputStream.mo17029w0(10, getChatShadingConfig());
            }
            if (this.avatarConfig_ != null) {
                codedOutputStream.mo17029w0(11, getAvatarConfig());
            }
            if (this.profileConfig_ != null) {
                codedOutputStream.mo17029w0(12, getProfileConfig());
            }
            if (this.callEffectConfig_ != null) {
                codedOutputStream.mo17029w0(13, getCallEffectConfig());
            }
        }

        public static Attribute parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (Attribute) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static Attribute parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (Attribute) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAvatarConfig(AvatarConfig avatarConfig) {
            avatarConfig.getClass();
            this.avatarConfig_ = avatarConfig;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCallEffectConfig(CallEffectConfig callEffectConfig) {
            callEffectConfig.getClass();
            this.callEffectConfig_ = callEffectConfig;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setChatShadingConfig(ChatShadingConfig chatShadingConfig) {
            chatShadingConfig.getClass();
            this.chatShadingConfig_ = chatShadingConfig;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setProfileConfig(ProfileConfig profileConfig) {
            profileConfig.getClass();
            this.profileConfig_ = profileConfig;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRestrict(Restrict restrict) {
            restrict.getClass();
            this.restrict_ = restrict;
        }

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<Attribute, Builder> implements AttributeOrBuilder {
            private Builder() {
                super(Attribute.DEFAULT_INSTANCE);
            }

            public Builder clearAvatarConfig() {
                copyOnWrite();
                ((Attribute) this.instance).clearAvatarConfig();
                return this;
            }

            public Builder clearCallEffectConfig() {
                copyOnWrite();
                ((Attribute) this.instance).clearCallEffectConfig();
                return this;
            }

            public Builder clearChatShadingConfig() {
                copyOnWrite();
                ((Attribute) this.instance).clearChatShadingConfig();
                return this;
            }

            public Builder clearJumpUrl() {
                copyOnWrite();
                ((Attribute) this.instance).clearJumpUrl();
                return this;
            }

            public Builder clearProfileConfig() {
                copyOnWrite();
                ((Attribute) this.instance).clearProfileConfig();
                return this;
            }

            public Builder clearResourceUrl() {
                copyOnWrite();
                ((Attribute) this.instance).clearResourceUrl();
                return this;
            }

            public Builder clearRestrict() {
                copyOnWrite();
                ((Attribute) this.instance).clearRestrict();
                return this;
            }

            public Builder clearThumbnailUrl() {
                copyOnWrite();
                ((Attribute) this.instance).clearThumbnailUrl();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveright.liveRight.AttributeOrBuilder
            public AvatarConfig getAvatarConfig() {
                return ((Attribute) this.instance).getAvatarConfig();
            }

            @Override // com.p1.mobile.longlink.msg.liveright.liveRight.AttributeOrBuilder
            public CallEffectConfig getCallEffectConfig() {
                return ((Attribute) this.instance).getCallEffectConfig();
            }

            @Override // com.p1.mobile.longlink.msg.liveright.liveRight.AttributeOrBuilder
            public ChatShadingConfig getChatShadingConfig() {
                return ((Attribute) this.instance).getChatShadingConfig();
            }

            @Override // com.p1.mobile.longlink.msg.liveright.liveRight.AttributeOrBuilder
            public String getJumpUrl() {
                return ((Attribute) this.instance).getJumpUrl();
            }

            @Override // com.p1.mobile.longlink.msg.liveright.liveRight.AttributeOrBuilder
            public ByteString getJumpUrlBytes() {
                return ((Attribute) this.instance).getJumpUrlBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveright.liveRight.AttributeOrBuilder
            public ProfileConfig getProfileConfig() {
                return ((Attribute) this.instance).getProfileConfig();
            }

            @Override // com.p1.mobile.longlink.msg.liveright.liveRight.AttributeOrBuilder
            public String getResourceUrl() {
                return ((Attribute) this.instance).getResourceUrl();
            }

            @Override // com.p1.mobile.longlink.msg.liveright.liveRight.AttributeOrBuilder
            public ByteString getResourceUrlBytes() {
                return ((Attribute) this.instance).getResourceUrlBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveright.liveRight.AttributeOrBuilder
            public Restrict getRestrict() {
                return ((Attribute) this.instance).getRestrict();
            }

            @Override // com.p1.mobile.longlink.msg.liveright.liveRight.AttributeOrBuilder
            public String getThumbnailUrl() {
                return ((Attribute) this.instance).getThumbnailUrl();
            }

            @Override // com.p1.mobile.longlink.msg.liveright.liveRight.AttributeOrBuilder
            public ByteString getThumbnailUrlBytes() {
                return ((Attribute) this.instance).getThumbnailUrlBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveright.liveRight.AttributeOrBuilder
            public boolean hasAvatarConfig() {
                return ((Attribute) this.instance).hasAvatarConfig();
            }

            @Override // com.p1.mobile.longlink.msg.liveright.liveRight.AttributeOrBuilder
            public boolean hasCallEffectConfig() {
                return ((Attribute) this.instance).hasCallEffectConfig();
            }

            @Override // com.p1.mobile.longlink.msg.liveright.liveRight.AttributeOrBuilder
            public boolean hasChatShadingConfig() {
                return ((Attribute) this.instance).hasChatShadingConfig();
            }

            @Override // com.p1.mobile.longlink.msg.liveright.liveRight.AttributeOrBuilder
            public boolean hasProfileConfig() {
                return ((Attribute) this.instance).hasProfileConfig();
            }

            @Override // com.p1.mobile.longlink.msg.liveright.liveRight.AttributeOrBuilder
            public boolean hasRestrict() {
                return ((Attribute) this.instance).hasRestrict();
            }

            public Builder mergeAvatarConfig(AvatarConfig avatarConfig) {
                copyOnWrite();
                ((Attribute) this.instance).mergeAvatarConfig(avatarConfig);
                return this;
            }

            public Builder mergeCallEffectConfig(CallEffectConfig callEffectConfig) {
                copyOnWrite();
                ((Attribute) this.instance).mergeCallEffectConfig(callEffectConfig);
                return this;
            }

            public Builder mergeChatShadingConfig(ChatShadingConfig chatShadingConfig) {
                copyOnWrite();
                ((Attribute) this.instance).mergeChatShadingConfig(chatShadingConfig);
                return this;
            }

            public Builder mergeProfileConfig(ProfileConfig profileConfig) {
                copyOnWrite();
                ((Attribute) this.instance).mergeProfileConfig(profileConfig);
                return this;
            }

            public Builder mergeRestrict(Restrict restrict) {
                copyOnWrite();
                ((Attribute) this.instance).mergeRestrict(restrict);
                return this;
            }

            public Builder setAvatarConfig(AvatarConfig avatarConfig) {
                copyOnWrite();
                ((Attribute) this.instance).setAvatarConfig(avatarConfig);
                return this;
            }

            public Builder setCallEffectConfig(CallEffectConfig callEffectConfig) {
                copyOnWrite();
                ((Attribute) this.instance).setCallEffectConfig(callEffectConfig);
                return this;
            }

            public Builder setChatShadingConfig(ChatShadingConfig chatShadingConfig) {
                copyOnWrite();
                ((Attribute) this.instance).setChatShadingConfig(chatShadingConfig);
                return this;
            }

            public Builder setJumpUrl(String str) {
                copyOnWrite();
                ((Attribute) this.instance).setJumpUrl(str);
                return this;
            }

            public Builder setJumpUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((Attribute) this.instance).setJumpUrlBytes(byteString);
                return this;
            }

            public Builder setProfileConfig(ProfileConfig profileConfig) {
                copyOnWrite();
                ((Attribute) this.instance).setProfileConfig(profileConfig);
                return this;
            }

            public Builder setResourceUrl(String str) {
                copyOnWrite();
                ((Attribute) this.instance).setResourceUrl(str);
                return this;
            }

            public Builder setResourceUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((Attribute) this.instance).setResourceUrlBytes(byteString);
                return this;
            }

            public Builder setRestrict(Restrict restrict) {
                copyOnWrite();
                ((Attribute) this.instance).setRestrict(restrict);
                return this;
            }

            public Builder setThumbnailUrl(String str) {
                copyOnWrite();
                ((Attribute) this.instance).setThumbnailUrl(str);
                return this;
            }

            public Builder setThumbnailUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((Attribute) this.instance).setThumbnailUrlBytes(byteString);
                return this;
            }

            public Builder setAvatarConfig(AvatarConfig.Builder builder) {
                copyOnWrite();
                ((Attribute) this.instance).setAvatarConfig(builder);
                return this;
            }

            public Builder setCallEffectConfig(CallEffectConfig.Builder builder) {
                copyOnWrite();
                ((Attribute) this.instance).setCallEffectConfig(builder);
                return this;
            }

            public Builder setChatShadingConfig(ChatShadingConfig.Builder builder) {
                copyOnWrite();
                ((Attribute) this.instance).setChatShadingConfig(builder);
                return this;
            }

            public Builder setProfileConfig(ProfileConfig.Builder builder) {
                copyOnWrite();
                ((Attribute) this.instance).setProfileConfig(builder);
                return this;
            }

            public Builder setRestrict(Restrict.Builder builder) {
                copyOnWrite();
                ((Attribute) this.instance).setRestrict(builder);
                return this;
            }
        }

        public static Attribute parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Attribute) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Attribute parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (Attribute) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static Attribute parseFrom(InputStream inputStream) throws IOException {
            return (Attribute) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Attribute parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (Attribute) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static Attribute parseFrom(C3430e c3430e) throws IOException {
            return (Attribute) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Attribute parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (Attribute) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }

    public static final class AvatarConfig extends GeneratedMessageLite<AvatarConfig, Builder> implements AvatarConfigOrBuilder {
        public static final int AVATARURL_FIELD_NUMBER = 2;
        public static final int CONNECTORIMAGE_FIELD_NUMBER = 3;
        private static final AvatarConfig DEFAULT_INSTANCE;
        public static final int FRAMECONFIG_FIELD_NUMBER = 1;
        private static volatile ng60<AvatarConfig> PARSER;
        private String avatarUrl_ = "";
        private String connectorImage_ = "";
        private PictureConfig frameConfig_;

        static {
            AvatarConfig avatarConfig = new AvatarConfig();
            DEFAULT_INSTANCE = avatarConfig;
            avatarConfig.makeImmutable();
        }

        private AvatarConfig() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAvatarUrl() {
            this.avatarUrl_ = getDefaultInstance().getAvatarUrl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearConnectorImage() {
            this.connectorImage_ = getDefaultInstance().getConnectorImage();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFrameConfig() {
            this.frameConfig_ = null;
        }

        public static AvatarConfig getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeFrameConfig(PictureConfig pictureConfig) {
            PictureConfig pictureConfig2 = this.frameConfig_;
            if (pictureConfig2 == null || pictureConfig2 == PictureConfig.getDefaultInstance()) {
                this.frameConfig_ = pictureConfig;
            } else {
                this.frameConfig_ = PictureConfig.newBuilder(this.frameConfig_).mergeFrom(pictureConfig).buildPartial();
            }
        }

        public static Builder newBuilder(AvatarConfig avatarConfig) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(avatarConfig);
        }

        public static AvatarConfig parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (AvatarConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AvatarConfig parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (AvatarConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<AvatarConfig> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAvatarUrl(String str) {
            str.getClass();
            this.avatarUrl_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAvatarUrlBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.avatarUrl_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setConnectorImage(String str) {
            str.getClass();
            this.connectorImage_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setConnectorImageBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.connectorImage_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFrameConfig(PictureConfig.Builder builder) {
            this.frameConfig_ = builder.build();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C46081.f16684xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new AvatarConfig();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    AvatarConfig avatarConfig = (AvatarConfig) obj2;
                    this.frameConfig_ = (PictureConfig) interfaceC3409h.mo17061o(this.frameConfig_, avatarConfig.frameConfig_);
                    this.avatarUrl_ = interfaceC3409h.mo17052f(!this.avatarUrl_.isEmpty(), this.avatarUrl_, !avatarConfig.avatarUrl_.isEmpty(), avatarConfig.avatarUrl_);
                    this.connectorImage_ = interfaceC3409h.mo17052f(!this.connectorImage_.isEmpty(), this.connectorImage_, true ^ avatarConfig.connectorImage_.isEmpty(), avatarConfig.connectorImage_);
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
                                    PictureConfig pictureConfig = this.frameConfig_;
                                    PictureConfig.Builder builder = pictureConfig != null ? pictureConfig.toBuilder() : null;
                                    PictureConfig pictureConfig2 = (PictureConfig) c3430e.m17198w(PictureConfig.parser(), c3433h);
                                    this.frameConfig_ = pictureConfig2;
                                    if (builder != null) {
                                        builder.mergeFrom(pictureConfig2);
                                        this.frameConfig_ = builder.buildPartial();
                                    }
                                } else if (iM17171M == 18) {
                                    this.avatarUrl_ = c3430e.m17170L();
                                } else if (iM17171M == 26) {
                                    this.connectorImage_ = c3430e.m17170L();
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
                        synchronized (AvatarConfig.class) {
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

        @Override // com.p1.mobile.longlink.msg.liveright.liveRight.AvatarConfigOrBuilder
        public String getAvatarUrl() {
            return this.avatarUrl_;
        }

        @Override // com.p1.mobile.longlink.msg.liveright.liveRight.AvatarConfigOrBuilder
        public ByteString getAvatarUrlBytes() {
            return ByteString.copyFromUtf8(this.avatarUrl_);
        }

        @Override // com.p1.mobile.longlink.msg.liveright.liveRight.AvatarConfigOrBuilder
        public String getConnectorImage() {
            return this.connectorImage_;
        }

        @Override // com.p1.mobile.longlink.msg.liveright.liveRight.AvatarConfigOrBuilder
        public ByteString getConnectorImageBytes() {
            return ByteString.copyFromUtf8(this.connectorImage_);
        }

        @Override // com.p1.mobile.longlink.msg.liveright.liveRight.AvatarConfigOrBuilder
        public PictureConfig getFrameConfig() {
            PictureConfig pictureConfig = this.frameConfig_;
            return pictureConfig == null ? PictureConfig.getDefaultInstance() : pictureConfig;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16948C = this.frameConfig_ != null ? CodedOutputStream.m16948C(1, getFrameConfig()) : 0;
            if (!this.avatarUrl_.isEmpty()) {
                iM16948C += CodedOutputStream.m16956K(2, getAvatarUrl());
            }
            if (!this.connectorImage_.isEmpty()) {
                iM16948C += CodedOutputStream.m16956K(3, getConnectorImage());
            }
            this.memoizedSerializedSize = iM16948C;
            return iM16948C;
        }

        @Override // com.p1.mobile.longlink.msg.liveright.liveRight.AvatarConfigOrBuilder
        public boolean hasFrameConfig() {
            return this.frameConfig_ != null;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.frameConfig_ != null) {
                codedOutputStream.mo17029w0(1, getFrameConfig());
            }
            if (!this.avatarUrl_.isEmpty()) {
                codedOutputStream.mo16994D0(2, getAvatarUrl());
            }
            if (this.connectorImage_.isEmpty()) {
                return;
            }
            codedOutputStream.mo16994D0(3, getConnectorImage());
        }

        public static AvatarConfig parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (AvatarConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static AvatarConfig parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (AvatarConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFrameConfig(PictureConfig pictureConfig) {
            pictureConfig.getClass();
            this.frameConfig_ = pictureConfig;
        }

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<AvatarConfig, Builder> implements AvatarConfigOrBuilder {
            private Builder() {
                super(AvatarConfig.DEFAULT_INSTANCE);
            }

            public Builder clearAvatarUrl() {
                copyOnWrite();
                ((AvatarConfig) this.instance).clearAvatarUrl();
                return this;
            }

            public Builder clearConnectorImage() {
                copyOnWrite();
                ((AvatarConfig) this.instance).clearConnectorImage();
                return this;
            }

            public Builder clearFrameConfig() {
                copyOnWrite();
                ((AvatarConfig) this.instance).clearFrameConfig();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveright.liveRight.AvatarConfigOrBuilder
            public String getAvatarUrl() {
                return ((AvatarConfig) this.instance).getAvatarUrl();
            }

            @Override // com.p1.mobile.longlink.msg.liveright.liveRight.AvatarConfigOrBuilder
            public ByteString getAvatarUrlBytes() {
                return ((AvatarConfig) this.instance).getAvatarUrlBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveright.liveRight.AvatarConfigOrBuilder
            public String getConnectorImage() {
                return ((AvatarConfig) this.instance).getConnectorImage();
            }

            @Override // com.p1.mobile.longlink.msg.liveright.liveRight.AvatarConfigOrBuilder
            public ByteString getConnectorImageBytes() {
                return ((AvatarConfig) this.instance).getConnectorImageBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveright.liveRight.AvatarConfigOrBuilder
            public PictureConfig getFrameConfig() {
                return ((AvatarConfig) this.instance).getFrameConfig();
            }

            @Override // com.p1.mobile.longlink.msg.liveright.liveRight.AvatarConfigOrBuilder
            public boolean hasFrameConfig() {
                return ((AvatarConfig) this.instance).hasFrameConfig();
            }

            public Builder mergeFrameConfig(PictureConfig pictureConfig) {
                copyOnWrite();
                ((AvatarConfig) this.instance).mergeFrameConfig(pictureConfig);
                return this;
            }

            public Builder setAvatarUrl(String str) {
                copyOnWrite();
                ((AvatarConfig) this.instance).setAvatarUrl(str);
                return this;
            }

            public Builder setAvatarUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((AvatarConfig) this.instance).setAvatarUrlBytes(byteString);
                return this;
            }

            public Builder setConnectorImage(String str) {
                copyOnWrite();
                ((AvatarConfig) this.instance).setConnectorImage(str);
                return this;
            }

            public Builder setConnectorImageBytes(ByteString byteString) {
                copyOnWrite();
                ((AvatarConfig) this.instance).setConnectorImageBytes(byteString);
                return this;
            }

            public Builder setFrameConfig(PictureConfig pictureConfig) {
                copyOnWrite();
                ((AvatarConfig) this.instance).setFrameConfig(pictureConfig);
                return this;
            }

            public Builder setFrameConfig(PictureConfig.Builder builder) {
                copyOnWrite();
                ((AvatarConfig) this.instance).setFrameConfig(builder);
                return this;
            }
        }

        public static AvatarConfig parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (AvatarConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static AvatarConfig parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (AvatarConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static AvatarConfig parseFrom(InputStream inputStream) throws IOException {
            return (AvatarConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AvatarConfig parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (AvatarConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static AvatarConfig parseFrom(C3430e c3430e) throws IOException {
            return (AvatarConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static AvatarConfig parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (AvatarConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }

    public enum BizType implements C3437l.c {
        grant(0),
        userHierarchyGrade(1),
        gift(2),
        UNRECOGNIZED(-1);

        public static final int gift_VALUE = 2;
        public static final int grant_VALUE = 0;
        private static final C3437l.d<BizType> internalValueMap = new C3437l.d<BizType>() { // from class: com.p1.mobile.longlink.msg.liveright.liveRight.BizType.1
            @Override // com.google.protobuf.C3437l.d
            public BizType findValueByNumber(int i) {
                return BizType.forNumber(i);
            }
        };
        public static final int userHierarchyGrade_VALUE = 1;
        private final int value;

        BizType(int i) {
            this.value = i;
        }

        public static BizType forNumber(int i) {
            if (i == 0) {
                return grant;
            }
            if (i == 1) {
                return userHierarchyGrade;
            }
            if (i != 2) {
                return null;
            }
            return gift;
        }

        public static C3437l.d<BizType> internalGetValueMap() {
            return internalValueMap;
        }

        @Override // com.google.protobuf.C3437l.c
        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static BizType valueOf(int i) {
            return forNumber(i);
        }
    }

    public static final class CallEffectConfig extends GeneratedMessageLite<CallEffectConfig, Builder> implements CallEffectConfigOrBuilder {
        public static final int CIRCLEVOICINGURL_FIELD_NUMBER = 7;
        public static final int DEFAULTICON_FIELD_NUMBER = 3;
        private static final CallEffectConfig DEFAULT_INSTANCE;
        public static final int HORIZONTALBG_FIELD_NUMBER = 2;
        public static final int HORIZONTALVOICINGURL_FIELD_NUMBER = 6;
        public static final int MUTEICON_FIELD_NUMBER = 4;
        private static volatile ng60<CallEffectConfig> PARSER = null;
        public static final int VERTICALBG_FIELD_NUMBER = 1;
        public static final int VERTICALVOICINGURL_FIELD_NUMBER = 5;
        private String verticalBg_ = "";
        private String horizontalBg_ = "";
        private String defaultIcon_ = "";
        private String muteIcon_ = "";
        private String verticalVoicingUrl_ = "";
        private String horizontalVoicingUrl_ = "";
        private String circleVoicingUrl_ = "";

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<CallEffectConfig, Builder> implements CallEffectConfigOrBuilder {
            private Builder() {
                super(CallEffectConfig.DEFAULT_INSTANCE);
            }

            public Builder clearCircleVoicingUrl() {
                copyOnWrite();
                ((CallEffectConfig) this.instance).clearCircleVoicingUrl();
                return this;
            }

            public Builder clearDefaultIcon() {
                copyOnWrite();
                ((CallEffectConfig) this.instance).clearDefaultIcon();
                return this;
            }

            public Builder clearHorizontalBg() {
                copyOnWrite();
                ((CallEffectConfig) this.instance).clearHorizontalBg();
                return this;
            }

            public Builder clearHorizontalVoicingUrl() {
                copyOnWrite();
                ((CallEffectConfig) this.instance).clearHorizontalVoicingUrl();
                return this;
            }

            public Builder clearMuteIcon() {
                copyOnWrite();
                ((CallEffectConfig) this.instance).clearMuteIcon();
                return this;
            }

            public Builder clearVerticalBg() {
                copyOnWrite();
                ((CallEffectConfig) this.instance).clearVerticalBg();
                return this;
            }

            public Builder clearVerticalVoicingUrl() {
                copyOnWrite();
                ((CallEffectConfig) this.instance).clearVerticalVoicingUrl();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveright.liveRight.CallEffectConfigOrBuilder
            public String getCircleVoicingUrl() {
                return ((CallEffectConfig) this.instance).getCircleVoicingUrl();
            }

            @Override // com.p1.mobile.longlink.msg.liveright.liveRight.CallEffectConfigOrBuilder
            public ByteString getCircleVoicingUrlBytes() {
                return ((CallEffectConfig) this.instance).getCircleVoicingUrlBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveright.liveRight.CallEffectConfigOrBuilder
            public String getDefaultIcon() {
                return ((CallEffectConfig) this.instance).getDefaultIcon();
            }

            @Override // com.p1.mobile.longlink.msg.liveright.liveRight.CallEffectConfigOrBuilder
            public ByteString getDefaultIconBytes() {
                return ((CallEffectConfig) this.instance).getDefaultIconBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveright.liveRight.CallEffectConfigOrBuilder
            public String getHorizontalBg() {
                return ((CallEffectConfig) this.instance).getHorizontalBg();
            }

            @Override // com.p1.mobile.longlink.msg.liveright.liveRight.CallEffectConfigOrBuilder
            public ByteString getHorizontalBgBytes() {
                return ((CallEffectConfig) this.instance).getHorizontalBgBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveright.liveRight.CallEffectConfigOrBuilder
            public String getHorizontalVoicingUrl() {
                return ((CallEffectConfig) this.instance).getHorizontalVoicingUrl();
            }

            @Override // com.p1.mobile.longlink.msg.liveright.liveRight.CallEffectConfigOrBuilder
            public ByteString getHorizontalVoicingUrlBytes() {
                return ((CallEffectConfig) this.instance).getHorizontalVoicingUrlBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveright.liveRight.CallEffectConfigOrBuilder
            public String getMuteIcon() {
                return ((CallEffectConfig) this.instance).getMuteIcon();
            }

            @Override // com.p1.mobile.longlink.msg.liveright.liveRight.CallEffectConfigOrBuilder
            public ByteString getMuteIconBytes() {
                return ((CallEffectConfig) this.instance).getMuteIconBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveright.liveRight.CallEffectConfigOrBuilder
            public String getVerticalBg() {
                return ((CallEffectConfig) this.instance).getVerticalBg();
            }

            @Override // com.p1.mobile.longlink.msg.liveright.liveRight.CallEffectConfigOrBuilder
            public ByteString getVerticalBgBytes() {
                return ((CallEffectConfig) this.instance).getVerticalBgBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveright.liveRight.CallEffectConfigOrBuilder
            public String getVerticalVoicingUrl() {
                return ((CallEffectConfig) this.instance).getVerticalVoicingUrl();
            }

            @Override // com.p1.mobile.longlink.msg.liveright.liveRight.CallEffectConfigOrBuilder
            public ByteString getVerticalVoicingUrlBytes() {
                return ((CallEffectConfig) this.instance).getVerticalVoicingUrlBytes();
            }

            public Builder setCircleVoicingUrl(String str) {
                copyOnWrite();
                ((CallEffectConfig) this.instance).setCircleVoicingUrl(str);
                return this;
            }

            public Builder setCircleVoicingUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((CallEffectConfig) this.instance).setCircleVoicingUrlBytes(byteString);
                return this;
            }

            public Builder setDefaultIcon(String str) {
                copyOnWrite();
                ((CallEffectConfig) this.instance).setDefaultIcon(str);
                return this;
            }

            public Builder setDefaultIconBytes(ByteString byteString) {
                copyOnWrite();
                ((CallEffectConfig) this.instance).setDefaultIconBytes(byteString);
                return this;
            }

            public Builder setHorizontalBg(String str) {
                copyOnWrite();
                ((CallEffectConfig) this.instance).setHorizontalBg(str);
                return this;
            }

            public Builder setHorizontalBgBytes(ByteString byteString) {
                copyOnWrite();
                ((CallEffectConfig) this.instance).setHorizontalBgBytes(byteString);
                return this;
            }

            public Builder setHorizontalVoicingUrl(String str) {
                copyOnWrite();
                ((CallEffectConfig) this.instance).setHorizontalVoicingUrl(str);
                return this;
            }

            public Builder setHorizontalVoicingUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((CallEffectConfig) this.instance).setHorizontalVoicingUrlBytes(byteString);
                return this;
            }

            public Builder setMuteIcon(String str) {
                copyOnWrite();
                ((CallEffectConfig) this.instance).setMuteIcon(str);
                return this;
            }

            public Builder setMuteIconBytes(ByteString byteString) {
                copyOnWrite();
                ((CallEffectConfig) this.instance).setMuteIconBytes(byteString);
                return this;
            }

            public Builder setVerticalBg(String str) {
                copyOnWrite();
                ((CallEffectConfig) this.instance).setVerticalBg(str);
                return this;
            }

            public Builder setVerticalBgBytes(ByteString byteString) {
                copyOnWrite();
                ((CallEffectConfig) this.instance).setVerticalBgBytes(byteString);
                return this;
            }

            public Builder setVerticalVoicingUrl(String str) {
                copyOnWrite();
                ((CallEffectConfig) this.instance).setVerticalVoicingUrl(str);
                return this;
            }

            public Builder setVerticalVoicingUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((CallEffectConfig) this.instance).setVerticalVoicingUrlBytes(byteString);
                return this;
            }
        }

        static {
            CallEffectConfig callEffectConfig = new CallEffectConfig();
            DEFAULT_INSTANCE = callEffectConfig;
            callEffectConfig.makeImmutable();
        }

        private CallEffectConfig() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCircleVoicingUrl() {
            this.circleVoicingUrl_ = getDefaultInstance().getCircleVoicingUrl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDefaultIcon() {
            this.defaultIcon_ = getDefaultInstance().getDefaultIcon();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHorizontalBg() {
            this.horizontalBg_ = getDefaultInstance().getHorizontalBg();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHorizontalVoicingUrl() {
            this.horizontalVoicingUrl_ = getDefaultInstance().getHorizontalVoicingUrl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMuteIcon() {
            this.muteIcon_ = getDefaultInstance().getMuteIcon();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVerticalBg() {
            this.verticalBg_ = getDefaultInstance().getVerticalBg();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVerticalVoicingUrl() {
            this.verticalVoicingUrl_ = getDefaultInstance().getVerticalVoicingUrl();
        }

        public static CallEffectConfig getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(CallEffectConfig callEffectConfig) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(callEffectConfig);
        }

        public static CallEffectConfig parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (CallEffectConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CallEffectConfig parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (CallEffectConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<CallEffectConfig> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCircleVoicingUrl(String str) {
            str.getClass();
            this.circleVoicingUrl_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCircleVoicingUrlBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.circleVoicingUrl_ = byteString.toStringUtf8();
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
        public void setHorizontalBg(String str) {
            str.getClass();
            this.horizontalBg_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHorizontalBgBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.horizontalBg_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHorizontalVoicingUrl(String str) {
            str.getClass();
            this.horizontalVoicingUrl_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHorizontalVoicingUrlBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.horizontalVoicingUrl_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMuteIcon(String str) {
            str.getClass();
            this.muteIcon_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMuteIconBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.muteIcon_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVerticalBg(String str) {
            str.getClass();
            this.verticalBg_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVerticalBgBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.verticalBg_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVerticalVoicingUrl(String str) {
            str.getClass();
            this.verticalVoicingUrl_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVerticalVoicingUrlBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.verticalVoicingUrl_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C46081.f16684xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new CallEffectConfig();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    CallEffectConfig callEffectConfig = (CallEffectConfig) obj2;
                    this.verticalBg_ = interfaceC3409h.mo17052f(!this.verticalBg_.isEmpty(), this.verticalBg_, !callEffectConfig.verticalBg_.isEmpty(), callEffectConfig.verticalBg_);
                    this.horizontalBg_ = interfaceC3409h.mo17052f(!this.horizontalBg_.isEmpty(), this.horizontalBg_, !callEffectConfig.horizontalBg_.isEmpty(), callEffectConfig.horizontalBg_);
                    this.defaultIcon_ = interfaceC3409h.mo17052f(!this.defaultIcon_.isEmpty(), this.defaultIcon_, !callEffectConfig.defaultIcon_.isEmpty(), callEffectConfig.defaultIcon_);
                    this.muteIcon_ = interfaceC3409h.mo17052f(!this.muteIcon_.isEmpty(), this.muteIcon_, !callEffectConfig.muteIcon_.isEmpty(), callEffectConfig.muteIcon_);
                    this.verticalVoicingUrl_ = interfaceC3409h.mo17052f(!this.verticalVoicingUrl_.isEmpty(), this.verticalVoicingUrl_, !callEffectConfig.verticalVoicingUrl_.isEmpty(), callEffectConfig.verticalVoicingUrl_);
                    this.horizontalVoicingUrl_ = interfaceC3409h.mo17052f(!this.horizontalVoicingUrl_.isEmpty(), this.horizontalVoicingUrl_, !callEffectConfig.horizontalVoicingUrl_.isEmpty(), callEffectConfig.horizontalVoicingUrl_);
                    this.circleVoicingUrl_ = interfaceC3409h.mo17052f(!this.circleVoicingUrl_.isEmpty(), this.circleVoicingUrl_, true ^ callEffectConfig.circleVoicingUrl_.isEmpty(), callEffectConfig.circleVoicingUrl_);
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
                                    this.verticalBg_ = c3430e.m17170L();
                                } else if (iM17171M == 18) {
                                    this.horizontalBg_ = c3430e.m17170L();
                                } else if (iM17171M == 26) {
                                    this.defaultIcon_ = c3430e.m17170L();
                                } else if (iM17171M == 34) {
                                    this.muteIcon_ = c3430e.m17170L();
                                } else if (iM17171M == 42) {
                                    this.verticalVoicingUrl_ = c3430e.m17170L();
                                } else if (iM17171M == 50) {
                                    this.horizontalVoicingUrl_ = c3430e.m17170L();
                                } else if (iM17171M == 58) {
                                    this.circleVoicingUrl_ = c3430e.m17170L();
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
                        synchronized (CallEffectConfig.class) {
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

        @Override // com.p1.mobile.longlink.msg.liveright.liveRight.CallEffectConfigOrBuilder
        public String getCircleVoicingUrl() {
            return this.circleVoicingUrl_;
        }

        @Override // com.p1.mobile.longlink.msg.liveright.liveRight.CallEffectConfigOrBuilder
        public ByteString getCircleVoicingUrlBytes() {
            return ByteString.copyFromUtf8(this.circleVoicingUrl_);
        }

        @Override // com.p1.mobile.longlink.msg.liveright.liveRight.CallEffectConfigOrBuilder
        public String getDefaultIcon() {
            return this.defaultIcon_;
        }

        @Override // com.p1.mobile.longlink.msg.liveright.liveRight.CallEffectConfigOrBuilder
        public ByteString getDefaultIconBytes() {
            return ByteString.copyFromUtf8(this.defaultIcon_);
        }

        @Override // com.p1.mobile.longlink.msg.liveright.liveRight.CallEffectConfigOrBuilder
        public String getHorizontalBg() {
            return this.horizontalBg_;
        }

        @Override // com.p1.mobile.longlink.msg.liveright.liveRight.CallEffectConfigOrBuilder
        public ByteString getHorizontalBgBytes() {
            return ByteString.copyFromUtf8(this.horizontalBg_);
        }

        @Override // com.p1.mobile.longlink.msg.liveright.liveRight.CallEffectConfigOrBuilder
        public String getHorizontalVoicingUrl() {
            return this.horizontalVoicingUrl_;
        }

        @Override // com.p1.mobile.longlink.msg.liveright.liveRight.CallEffectConfigOrBuilder
        public ByteString getHorizontalVoicingUrlBytes() {
            return ByteString.copyFromUtf8(this.horizontalVoicingUrl_);
        }

        @Override // com.p1.mobile.longlink.msg.liveright.liveRight.CallEffectConfigOrBuilder
        public String getMuteIcon() {
            return this.muteIcon_;
        }

        @Override // com.p1.mobile.longlink.msg.liveright.liveRight.CallEffectConfigOrBuilder
        public ByteString getMuteIconBytes() {
            return ByteString.copyFromUtf8(this.muteIcon_);
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16956K = !this.verticalBg_.isEmpty() ? CodedOutputStream.m16956K(1, getVerticalBg()) : 0;
            if (!this.horizontalBg_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(2, getHorizontalBg());
            }
            if (!this.defaultIcon_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(3, getDefaultIcon());
            }
            if (!this.muteIcon_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(4, getMuteIcon());
            }
            if (!this.verticalVoicingUrl_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(5, getVerticalVoicingUrl());
            }
            if (!this.horizontalVoicingUrl_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(6, getHorizontalVoicingUrl());
            }
            if (!this.circleVoicingUrl_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(7, getCircleVoicingUrl());
            }
            this.memoizedSerializedSize = iM16956K;
            return iM16956K;
        }

        @Override // com.p1.mobile.longlink.msg.liveright.liveRight.CallEffectConfigOrBuilder
        public String getVerticalBg() {
            return this.verticalBg_;
        }

        @Override // com.p1.mobile.longlink.msg.liveright.liveRight.CallEffectConfigOrBuilder
        public ByteString getVerticalBgBytes() {
            return ByteString.copyFromUtf8(this.verticalBg_);
        }

        @Override // com.p1.mobile.longlink.msg.liveright.liveRight.CallEffectConfigOrBuilder
        public String getVerticalVoicingUrl() {
            return this.verticalVoicingUrl_;
        }

        @Override // com.p1.mobile.longlink.msg.liveright.liveRight.CallEffectConfigOrBuilder
        public ByteString getVerticalVoicingUrlBytes() {
            return ByteString.copyFromUtf8(this.verticalVoicingUrl_);
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.verticalBg_.isEmpty()) {
                codedOutputStream.mo16994D0(1, getVerticalBg());
            }
            if (!this.horizontalBg_.isEmpty()) {
                codedOutputStream.mo16994D0(2, getHorizontalBg());
            }
            if (!this.defaultIcon_.isEmpty()) {
                codedOutputStream.mo16994D0(3, getDefaultIcon());
            }
            if (!this.muteIcon_.isEmpty()) {
                codedOutputStream.mo16994D0(4, getMuteIcon());
            }
            if (!this.verticalVoicingUrl_.isEmpty()) {
                codedOutputStream.mo16994D0(5, getVerticalVoicingUrl());
            }
            if (!this.horizontalVoicingUrl_.isEmpty()) {
                codedOutputStream.mo16994D0(6, getHorizontalVoicingUrl());
            }
            if (this.circleVoicingUrl_.isEmpty()) {
                return;
            }
            codedOutputStream.mo16994D0(7, getCircleVoicingUrl());
        }

        public static CallEffectConfig parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (CallEffectConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static CallEffectConfig parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (CallEffectConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        public static CallEffectConfig parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (CallEffectConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CallEffectConfig parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (CallEffectConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static CallEffectConfig parseFrom(InputStream inputStream) throws IOException {
            return (CallEffectConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CallEffectConfig parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (CallEffectConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static CallEffectConfig parseFrom(C3430e c3430e) throws IOException {
            return (CallEffectConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static CallEffectConfig parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (CallEffectConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }

    public static final class ChatShadingConfig extends GeneratedMessageLite<ChatShadingConfig, Builder> implements ChatShadingConfigOrBuilder {
        public static final int BACKGROUNDCOLORCONFIG_FIELD_NUMBER = 2;
        public static final int BORDERCOLORCONFIG_FIELD_NUMBER = 1;
        public static final int CORNERCONFIG_FIELD_NUMBER = 3;
        private static final ChatShadingConfig DEFAULT_INSTANCE;
        private static volatile ng60<ChatShadingConfig> PARSER;
        private ColorConfig backgroundColorConfig_;
        private ColorConfig borderColorConfig_;
        private CornerConfig cornerConfig_;

        static {
            ChatShadingConfig chatShadingConfig = new ChatShadingConfig();
            DEFAULT_INSTANCE = chatShadingConfig;
            chatShadingConfig.makeImmutable();
        }

        private ChatShadingConfig() {
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

        public static ChatShadingConfig getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeBackgroundColorConfig(ColorConfig colorConfig) {
            ColorConfig colorConfig2 = this.backgroundColorConfig_;
            if (colorConfig2 == null || colorConfig2 == ColorConfig.getDefaultInstance()) {
                this.backgroundColorConfig_ = colorConfig;
            } else {
                this.backgroundColorConfig_ = ColorConfig.newBuilder(this.backgroundColorConfig_).mergeFrom(colorConfig).buildPartial();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeBorderColorConfig(ColorConfig colorConfig) {
            ColorConfig colorConfig2 = this.borderColorConfig_;
            if (colorConfig2 == null || colorConfig2 == ColorConfig.getDefaultInstance()) {
                this.borderColorConfig_ = colorConfig;
            } else {
                this.borderColorConfig_ = ColorConfig.newBuilder(this.borderColorConfig_).mergeFrom(colorConfig).buildPartial();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeCornerConfig(CornerConfig cornerConfig) {
            CornerConfig cornerConfig2 = this.cornerConfig_;
            if (cornerConfig2 == null || cornerConfig2 == CornerConfig.getDefaultInstance()) {
                this.cornerConfig_ = cornerConfig;
            } else {
                this.cornerConfig_ = CornerConfig.newBuilder(this.cornerConfig_).mergeFrom(cornerConfig).buildPartial();
            }
        }

        public static Builder newBuilder(ChatShadingConfig chatShadingConfig) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(chatShadingConfig);
        }

        public static ChatShadingConfig parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ChatShadingConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ChatShadingConfig parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ChatShadingConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<ChatShadingConfig> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBackgroundColorConfig(ColorConfig.Builder builder) {
            this.backgroundColorConfig_ = builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBorderColorConfig(ColorConfig.Builder builder) {
            this.borderColorConfig_ = builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCornerConfig(CornerConfig.Builder builder) {
            this.cornerConfig_ = builder.build();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C46081.f16684xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new ChatShadingConfig();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    ChatShadingConfig chatShadingConfig = (ChatShadingConfig) obj2;
                    this.borderColorConfig_ = (ColorConfig) interfaceC3409h.mo17061o(this.borderColorConfig_, chatShadingConfig.borderColorConfig_);
                    this.backgroundColorConfig_ = (ColorConfig) interfaceC3409h.mo17061o(this.backgroundColorConfig_, chatShadingConfig.backgroundColorConfig_);
                    this.cornerConfig_ = (CornerConfig) interfaceC3409h.mo17061o(this.cornerConfig_, chatShadingConfig.cornerConfig_);
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
                                    ColorConfig colorConfig = this.borderColorConfig_;
                                    ColorConfig.Builder builder = colorConfig != null ? colorConfig.toBuilder() : null;
                                    ColorConfig colorConfig2 = (ColorConfig) c3430e.m17198w(ColorConfig.parser(), c3433h);
                                    this.borderColorConfig_ = colorConfig2;
                                    if (builder != null) {
                                        builder.mergeFrom(colorConfig2);
                                        this.borderColorConfig_ = builder.buildPartial();
                                    }
                                } else if (iM17171M == 18) {
                                    ColorConfig colorConfig3 = this.backgroundColorConfig_;
                                    ColorConfig.Builder builder2 = colorConfig3 != null ? colorConfig3.toBuilder() : null;
                                    ColorConfig colorConfig4 = (ColorConfig) c3430e.m17198w(ColorConfig.parser(), c3433h);
                                    this.backgroundColorConfig_ = colorConfig4;
                                    if (builder2 != null) {
                                        builder2.mergeFrom(colorConfig4);
                                        this.backgroundColorConfig_ = builder2.buildPartial();
                                    }
                                } else if (iM17171M == 26) {
                                    CornerConfig cornerConfig = this.cornerConfig_;
                                    CornerConfig.Builder builder3 = cornerConfig != null ? cornerConfig.toBuilder() : null;
                                    CornerConfig cornerConfig2 = (CornerConfig) c3430e.m17198w(CornerConfig.parser(), c3433h);
                                    this.cornerConfig_ = cornerConfig2;
                                    if (builder3 != null) {
                                        builder3.mergeFrom(cornerConfig2);
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
                        synchronized (ChatShadingConfig.class) {
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

        @Override // com.p1.mobile.longlink.msg.liveright.liveRight.ChatShadingConfigOrBuilder
        public ColorConfig getBackgroundColorConfig() {
            ColorConfig colorConfig = this.backgroundColorConfig_;
            return colorConfig == null ? ColorConfig.getDefaultInstance() : colorConfig;
        }

        @Override // com.p1.mobile.longlink.msg.liveright.liveRight.ChatShadingConfigOrBuilder
        public ColorConfig getBorderColorConfig() {
            ColorConfig colorConfig = this.borderColorConfig_;
            return colorConfig == null ? ColorConfig.getDefaultInstance() : colorConfig;
        }

        @Override // com.p1.mobile.longlink.msg.liveright.liveRight.ChatShadingConfigOrBuilder
        public CornerConfig getCornerConfig() {
            CornerConfig cornerConfig = this.cornerConfig_;
            return cornerConfig == null ? CornerConfig.getDefaultInstance() : cornerConfig;
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

        @Override // com.p1.mobile.longlink.msg.liveright.liveRight.ChatShadingConfigOrBuilder
        public boolean hasBackgroundColorConfig() {
            return this.backgroundColorConfig_ != null;
        }

        @Override // com.p1.mobile.longlink.msg.liveright.liveRight.ChatShadingConfigOrBuilder
        public boolean hasBorderColorConfig() {
            return this.borderColorConfig_ != null;
        }

        @Override // com.p1.mobile.longlink.msg.liveright.liveRight.ChatShadingConfigOrBuilder
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

        public static ChatShadingConfig parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (ChatShadingConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static ChatShadingConfig parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (ChatShadingConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBackgroundColorConfig(ColorConfig colorConfig) {
            colorConfig.getClass();
            this.backgroundColorConfig_ = colorConfig;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBorderColorConfig(ColorConfig colorConfig) {
            colorConfig.getClass();
            this.borderColorConfig_ = colorConfig;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCornerConfig(CornerConfig cornerConfig) {
            cornerConfig.getClass();
            this.cornerConfig_ = cornerConfig;
        }

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<ChatShadingConfig, Builder> implements ChatShadingConfigOrBuilder {
            private Builder() {
                super(ChatShadingConfig.DEFAULT_INSTANCE);
            }

            public Builder clearBackgroundColorConfig() {
                copyOnWrite();
                ((ChatShadingConfig) this.instance).clearBackgroundColorConfig();
                return this;
            }

            public Builder clearBorderColorConfig() {
                copyOnWrite();
                ((ChatShadingConfig) this.instance).clearBorderColorConfig();
                return this;
            }

            public Builder clearCornerConfig() {
                copyOnWrite();
                ((ChatShadingConfig) this.instance).clearCornerConfig();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveright.liveRight.ChatShadingConfigOrBuilder
            public ColorConfig getBackgroundColorConfig() {
                return ((ChatShadingConfig) this.instance).getBackgroundColorConfig();
            }

            @Override // com.p1.mobile.longlink.msg.liveright.liveRight.ChatShadingConfigOrBuilder
            public ColorConfig getBorderColorConfig() {
                return ((ChatShadingConfig) this.instance).getBorderColorConfig();
            }

            @Override // com.p1.mobile.longlink.msg.liveright.liveRight.ChatShadingConfigOrBuilder
            public CornerConfig getCornerConfig() {
                return ((ChatShadingConfig) this.instance).getCornerConfig();
            }

            @Override // com.p1.mobile.longlink.msg.liveright.liveRight.ChatShadingConfigOrBuilder
            public boolean hasBackgroundColorConfig() {
                return ((ChatShadingConfig) this.instance).hasBackgroundColorConfig();
            }

            @Override // com.p1.mobile.longlink.msg.liveright.liveRight.ChatShadingConfigOrBuilder
            public boolean hasBorderColorConfig() {
                return ((ChatShadingConfig) this.instance).hasBorderColorConfig();
            }

            @Override // com.p1.mobile.longlink.msg.liveright.liveRight.ChatShadingConfigOrBuilder
            public boolean hasCornerConfig() {
                return ((ChatShadingConfig) this.instance).hasCornerConfig();
            }

            public Builder mergeBackgroundColorConfig(ColorConfig colorConfig) {
                copyOnWrite();
                ((ChatShadingConfig) this.instance).mergeBackgroundColorConfig(colorConfig);
                return this;
            }

            public Builder mergeBorderColorConfig(ColorConfig colorConfig) {
                copyOnWrite();
                ((ChatShadingConfig) this.instance).mergeBorderColorConfig(colorConfig);
                return this;
            }

            public Builder mergeCornerConfig(CornerConfig cornerConfig) {
                copyOnWrite();
                ((ChatShadingConfig) this.instance).mergeCornerConfig(cornerConfig);
                return this;
            }

            public Builder setBackgroundColorConfig(ColorConfig colorConfig) {
                copyOnWrite();
                ((ChatShadingConfig) this.instance).setBackgroundColorConfig(colorConfig);
                return this;
            }

            public Builder setBorderColorConfig(ColorConfig colorConfig) {
                copyOnWrite();
                ((ChatShadingConfig) this.instance).setBorderColorConfig(colorConfig);
                return this;
            }

            public Builder setCornerConfig(CornerConfig cornerConfig) {
                copyOnWrite();
                ((ChatShadingConfig) this.instance).setCornerConfig(cornerConfig);
                return this;
            }

            public Builder setBackgroundColorConfig(ColorConfig.Builder builder) {
                copyOnWrite();
                ((ChatShadingConfig) this.instance).setBackgroundColorConfig(builder);
                return this;
            }

            public Builder setBorderColorConfig(ColorConfig.Builder builder) {
                copyOnWrite();
                ((ChatShadingConfig) this.instance).setBorderColorConfig(builder);
                return this;
            }

            public Builder setCornerConfig(CornerConfig.Builder builder) {
                copyOnWrite();
                ((ChatShadingConfig) this.instance).setCornerConfig(builder);
                return this;
            }
        }

        public static ChatShadingConfig parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ChatShadingConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ChatShadingConfig parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (ChatShadingConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static ChatShadingConfig parseFrom(InputStream inputStream) throws IOException {
            return (ChatShadingConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ChatShadingConfig parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (ChatShadingConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static ChatShadingConfig parseFrom(C3430e c3430e) throws IOException {
            return (ChatShadingConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ChatShadingConfig parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (ChatShadingConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }

    public static final class ColorConfig extends GeneratedMessageLite<ColorConfig, Builder> implements ColorConfigOrBuilder {
        public static final int COLORS_FIELD_NUMBER = 2;
        private static final ColorConfig DEFAULT_INSTANCE;
        public static final int GRADIENTDIRECTION_FIELD_NUMBER = 1;
        private static volatile ng60<ColorConfig> PARSER = null;
        public static final int TRANSPARENCY_FIELD_NUMBER = 3;
        private int bitField0_;
        private C3437l.h<String> colors_ = GeneratedMessageLite.emptyProtobufList();
        private int gradientDirection_;
        private long transparency_;

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<ColorConfig, Builder> implements ColorConfigOrBuilder {
            private Builder() {
                super(ColorConfig.DEFAULT_INSTANCE);
            }

            public Builder addAllColors(Iterable<String> iterable) {
                copyOnWrite();
                ((ColorConfig) this.instance).addAllColors(iterable);
                return this;
            }

            public Builder addColors(String str) {
                copyOnWrite();
                ((ColorConfig) this.instance).addColors(str);
                return this;
            }

            public Builder addColorsBytes(ByteString byteString) {
                copyOnWrite();
                ((ColorConfig) this.instance).addColorsBytes(byteString);
                return this;
            }

            public Builder clearColors() {
                copyOnWrite();
                ((ColorConfig) this.instance).clearColors();
                return this;
            }

            public Builder clearGradientDirection() {
                copyOnWrite();
                ((ColorConfig) this.instance).clearGradientDirection();
                return this;
            }

            public Builder clearTransparency() {
                copyOnWrite();
                ((ColorConfig) this.instance).clearTransparency();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveright.liveRight.ColorConfigOrBuilder
            public String getColors(int i) {
                return ((ColorConfig) this.instance).getColors(i);
            }

            @Override // com.p1.mobile.longlink.msg.liveright.liveRight.ColorConfigOrBuilder
            public ByteString getColorsBytes(int i) {
                return ((ColorConfig) this.instance).getColorsBytes(i);
            }

            @Override // com.p1.mobile.longlink.msg.liveright.liveRight.ColorConfigOrBuilder
            public int getColorsCount() {
                return ((ColorConfig) this.instance).getColorsCount();
            }

            @Override // com.p1.mobile.longlink.msg.liveright.liveRight.ColorConfigOrBuilder
            public List<String> getColorsList() {
                return Collections.unmodifiableList(((ColorConfig) this.instance).getColorsList());
            }

            @Override // com.p1.mobile.longlink.msg.liveright.liveRight.ColorConfigOrBuilder
            public GradientDirection getGradientDirection() {
                return ((ColorConfig) this.instance).getGradientDirection();
            }

            @Override // com.p1.mobile.longlink.msg.liveright.liveRight.ColorConfigOrBuilder
            public int getGradientDirectionValue() {
                return ((ColorConfig) this.instance).getGradientDirectionValue();
            }

            @Override // com.p1.mobile.longlink.msg.liveright.liveRight.ColorConfigOrBuilder
            public long getTransparency() {
                return ((ColorConfig) this.instance).getTransparency();
            }

            public Builder setColors(int i, String str) {
                copyOnWrite();
                ((ColorConfig) this.instance).setColors(i, str);
                return this;
            }

            public Builder setGradientDirection(GradientDirection gradientDirection) {
                copyOnWrite();
                ((ColorConfig) this.instance).setGradientDirection(gradientDirection);
                return this;
            }

            public Builder setGradientDirectionValue(int i) {
                copyOnWrite();
                ((ColorConfig) this.instance).setGradientDirectionValue(i);
                return this;
            }

            public Builder setTransparency(long j) {
                copyOnWrite();
                ((ColorConfig) this.instance).setTransparency(j);
                return this;
            }
        }

        static {
            ColorConfig colorConfig = new ColorConfig();
            DEFAULT_INSTANCE = colorConfig;
            colorConfig.makeImmutable();
        }

        private ColorConfig() {
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
            this.gradientDirection_ = 0;
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

        public static ColorConfig getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(ColorConfig colorConfig) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(colorConfig);
        }

        public static ColorConfig parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ColorConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ColorConfig parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ColorConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<ColorConfig> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setColors(int i, String str) {
            str.getClass();
            ensureColorsIsMutable();
            this.colors_.set(i, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGradientDirection(GradientDirection gradientDirection) {
            gradientDirection.getClass();
            this.gradientDirection_ = gradientDirection.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGradientDirectionValue(int i) {
            this.gradientDirection_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTransparency(long j) {
            this.transparency_ = j;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C46081.f16684xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new ColorConfig();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.colors_.mo17139n();
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    ColorConfig colorConfig = (ColorConfig) obj2;
                    int i = this.gradientDirection_;
                    boolean z2 = i != 0;
                    int i2 = colorConfig.gradientDirection_;
                    this.gradientDirection_ = interfaceC3409h.mo17051e(z2, i, i2 != 0, i2);
                    this.colors_ = interfaceC3409h.mo17053g(this.colors_, colorConfig.colors_);
                    long j = this.transparency_;
                    boolean z3 = j != 0;
                    long j2 = colorConfig.transparency_;
                    this.transparency_ = interfaceC3409h.mo17055i(z3, j, j2 != 0, j2);
                    if (interfaceC3409h == GeneratedMessageLite.C3408g.INSTANCE) {
                        this.bitField0_ |= colorConfig.bitField0_;
                    }
                    return this;
                case 6:
                    C3430e c3430e = (C3430e) obj;
                    while (!z) {
                        try {
                            int iM17171M = c3430e.m17171M();
                            if (iM17171M != 0) {
                                if (iM17171M == 8) {
                                    this.gradientDirection_ = c3430e.m17191p();
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
                        synchronized (ColorConfig.class) {
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

        @Override // com.p1.mobile.longlink.msg.liveright.liveRight.ColorConfigOrBuilder
        public String getColors(int i) {
            return this.colors_.get(i);
        }

        @Override // com.p1.mobile.longlink.msg.liveright.liveRight.ColorConfigOrBuilder
        public ByteString getColorsBytes(int i) {
            return ByteString.copyFromUtf8(this.colors_.get(i));
        }

        @Override // com.p1.mobile.longlink.msg.liveright.liveRight.ColorConfigOrBuilder
        public int getColorsCount() {
            return this.colors_.size();
        }

        @Override // com.p1.mobile.longlink.msg.liveright.liveRight.ColorConfigOrBuilder
        public List<String> getColorsList() {
            return this.colors_;
        }

        @Override // com.p1.mobile.longlink.msg.liveright.liveRight.ColorConfigOrBuilder
        public GradientDirection getGradientDirection() {
            GradientDirection gradientDirectionForNumber = GradientDirection.forNumber(this.gradientDirection_);
            return gradientDirectionForNumber == null ? GradientDirection.UNRECOGNIZED : gradientDirectionForNumber;
        }

        @Override // com.p1.mobile.longlink.msg.liveright.liveRight.ColorConfigOrBuilder
        public int getGradientDirectionValue() {
            return this.gradientDirection_;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16977m = this.gradientDirection_ != GradientDirection.unknownDirection.getNumber() ? CodedOutputStream.m16977m(1, this.gradientDirection_) : 0;
            int iM16957L = 0;
            for (int i2 = 0; i2 < this.colors_.size(); i2++) {
                iM16957L += CodedOutputStream.m16957L(this.colors_.get(i2));
            }
            int size = iM16977m + iM16957L + getColorsList().size();
            long j = this.transparency_;
            if (j != 0) {
                size += CodedOutputStream.m16986v(3, j);
            }
            this.memoizedSerializedSize = size;
            return size;
        }

        @Override // com.p1.mobile.longlink.msg.liveright.liveRight.ColorConfigOrBuilder
        public long getTransparency() {
            return this.transparency_;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.gradientDirection_ != GradientDirection.unknownDirection.getNumber()) {
                codedOutputStream.m17015i0(1, this.gradientDirection_);
            }
            for (int i = 0; i < this.colors_.size(); i++) {
                codedOutputStream.mo16994D0(2, this.colors_.get(i));
            }
            long j = this.transparency_;
            if (j != 0) {
                codedOutputStream.m17027u0(3, j);
            }
        }

        public static ColorConfig parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (ColorConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static ColorConfig parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (ColorConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        public static ColorConfig parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ColorConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ColorConfig parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (ColorConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static ColorConfig parseFrom(InputStream inputStream) throws IOException {
            return (ColorConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ColorConfig parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (ColorConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static ColorConfig parseFrom(C3430e c3430e) throws IOException {
            return (ColorConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ColorConfig parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (ColorConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }

    public static final class CornerConfig extends GeneratedMessageLite<CornerConfig, Builder> implements CornerConfigOrBuilder {
        private static final CornerConfig DEFAULT_INSTANCE;
        private static volatile ng60<CornerConfig> PARSER = null;
        public static final int PICTUREURL_FIELD_NUMBER = 1;
        public static final int POSITION_FIELD_NUMBER = 2;
        private String pictureUrl_ = "";
        private int position_;

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<CornerConfig, Builder> implements CornerConfigOrBuilder {
            private Builder() {
                super(CornerConfig.DEFAULT_INSTANCE);
            }

            public Builder clearPictureUrl() {
                copyOnWrite();
                ((CornerConfig) this.instance).clearPictureUrl();
                return this;
            }

            public Builder clearPosition() {
                copyOnWrite();
                ((CornerConfig) this.instance).clearPosition();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveright.liveRight.CornerConfigOrBuilder
            public String getPictureUrl() {
                return ((CornerConfig) this.instance).getPictureUrl();
            }

            @Override // com.p1.mobile.longlink.msg.liveright.liveRight.CornerConfigOrBuilder
            public ByteString getPictureUrlBytes() {
                return ((CornerConfig) this.instance).getPictureUrlBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveright.liveRight.CornerConfigOrBuilder
            public CornerPosition getPosition() {
                return ((CornerConfig) this.instance).getPosition();
            }

            @Override // com.p1.mobile.longlink.msg.liveright.liveRight.CornerConfigOrBuilder
            public int getPositionValue() {
                return ((CornerConfig) this.instance).getPositionValue();
            }

            public Builder setPictureUrl(String str) {
                copyOnWrite();
                ((CornerConfig) this.instance).setPictureUrl(str);
                return this;
            }

            public Builder setPictureUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((CornerConfig) this.instance).setPictureUrlBytes(byteString);
                return this;
            }

            public Builder setPosition(CornerPosition cornerPosition) {
                copyOnWrite();
                ((CornerConfig) this.instance).setPosition(cornerPosition);
                return this;
            }

            public Builder setPositionValue(int i) {
                copyOnWrite();
                ((CornerConfig) this.instance).setPositionValue(i);
                return this;
            }
        }

        static {
            CornerConfig cornerConfig = new CornerConfig();
            DEFAULT_INSTANCE = cornerConfig;
            cornerConfig.makeImmutable();
        }

        private CornerConfig() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPictureUrl() {
            this.pictureUrl_ = getDefaultInstance().getPictureUrl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPosition() {
            this.position_ = 0;
        }

        public static CornerConfig getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(CornerConfig cornerConfig) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(cornerConfig);
        }

        public static CornerConfig parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (CornerConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CornerConfig parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (CornerConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<CornerConfig> parser() {
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
        public void setPosition(CornerPosition cornerPosition) {
            cornerPosition.getClass();
            this.position_ = cornerPosition.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPositionValue(int i) {
            this.position_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C46081.f16684xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new CornerConfig();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    CornerConfig cornerConfig = (CornerConfig) obj2;
                    this.pictureUrl_ = interfaceC3409h.mo17052f(!this.pictureUrl_.isEmpty(), this.pictureUrl_, !cornerConfig.pictureUrl_.isEmpty(), cornerConfig.pictureUrl_);
                    int i = this.position_;
                    boolean z2 = i != 0;
                    int i2 = cornerConfig.position_;
                    this.position_ = interfaceC3409h.mo17051e(z2, i, i2 != 0, i2);
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
                                    this.position_ = c3430e.m17191p();
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
                        synchronized (CornerConfig.class) {
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

        @Override // com.p1.mobile.longlink.msg.liveright.liveRight.CornerConfigOrBuilder
        public String getPictureUrl() {
            return this.pictureUrl_;
        }

        @Override // com.p1.mobile.longlink.msg.liveright.liveRight.CornerConfigOrBuilder
        public ByteString getPictureUrlBytes() {
            return ByteString.copyFromUtf8(this.pictureUrl_);
        }

        @Override // com.p1.mobile.longlink.msg.liveright.liveRight.CornerConfigOrBuilder
        public CornerPosition getPosition() {
            CornerPosition cornerPositionForNumber = CornerPosition.forNumber(this.position_);
            return cornerPositionForNumber == null ? CornerPosition.UNRECOGNIZED : cornerPositionForNumber;
        }

        @Override // com.p1.mobile.longlink.msg.liveright.liveRight.CornerConfigOrBuilder
        public int getPositionValue() {
            return this.position_;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16956K = !this.pictureUrl_.isEmpty() ? CodedOutputStream.m16956K(1, getPictureUrl()) : 0;
            if (this.position_ != CornerPosition.nonePosition.getNumber()) {
                iM16956K += CodedOutputStream.m16977m(2, this.position_);
            }
            this.memoizedSerializedSize = iM16956K;
            return iM16956K;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.pictureUrl_.isEmpty()) {
                codedOutputStream.mo16994D0(1, getPictureUrl());
            }
            if (this.position_ != CornerPosition.nonePosition.getNumber()) {
                codedOutputStream.m17015i0(2, this.position_);
            }
        }

        public static CornerConfig parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (CornerConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static CornerConfig parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (CornerConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        public static CornerConfig parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (CornerConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CornerConfig parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (CornerConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static CornerConfig parseFrom(InputStream inputStream) throws IOException {
            return (CornerConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CornerConfig parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (CornerConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static CornerConfig parseFrom(C3430e c3430e) throws IOException {
            return (CornerConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static CornerConfig parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (CornerConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }

    public enum CornerPosition implements C3437l.c {
        nonePosition(0),
        rightTop(1),
        rightMiddle(2),
        rightBottom(3),
        UNRECOGNIZED(-1);

        private static final C3437l.d<CornerPosition> internalValueMap = new C3437l.d<CornerPosition>() { // from class: com.p1.mobile.longlink.msg.liveright.liveRight.CornerPosition.1
            @Override // com.google.protobuf.C3437l.d
            public CornerPosition findValueByNumber(int i) {
                return CornerPosition.forNumber(i);
            }
        };
        public static final int nonePosition_VALUE = 0;
        public static final int rightBottom_VALUE = 3;
        public static final int rightMiddle_VALUE = 2;
        public static final int rightTop_VALUE = 1;
        private final int value;

        CornerPosition(int i) {
            this.value = i;
        }

        public static CornerPosition forNumber(int i) {
            if (i == 0) {
                return nonePosition;
            }
            if (i == 1) {
                return rightTop;
            }
            if (i == 2) {
                return rightMiddle;
            }
            if (i != 3) {
                return null;
            }
            return rightBottom;
        }

        public static C3437l.d<CornerPosition> internalGetValueMap() {
            return internalValueMap;
        }

        @Override // com.google.protobuf.C3437l.c
        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static CornerPosition valueOf(int i) {
            return forNumber(i);
        }
    }

    public enum FadingType implements C3437l.c {
        never(0),
        relative(1),
        absolute(2),
        UNRECOGNIZED(-1);

        public static final int absolute_VALUE = 2;
        private static final C3437l.d<FadingType> internalValueMap = new C3437l.d<FadingType>() { // from class: com.p1.mobile.longlink.msg.liveright.liveRight.FadingType.1
            @Override // com.google.protobuf.C3437l.d
            public FadingType findValueByNumber(int i) {
                return FadingType.forNumber(i);
            }
        };
        public static final int never_VALUE = 0;
        public static final int relative_VALUE = 1;
        private final int value;

        FadingType(int i) {
            this.value = i;
        }

        public static FadingType forNumber(int i) {
            if (i == 0) {
                return never;
            }
            if (i == 1) {
                return relative;
            }
            if (i != 2) {
                return null;
            }
            return absolute;
        }

        public static C3437l.d<FadingType> internalGetValueMap() {
            return internalValueMap;
        }

        @Override // com.google.protobuf.C3437l.c
        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static FadingType valueOf(int i) {
            return forNumber(i);
        }
    }

    public enum GradientDirection implements C3437l.c {
        unknownDirection(0),
        fromUpToDown(1),
        fromLeftToRight(2),
        fromLeftUpToRightDown(3),
        UNRECOGNIZED(-1);

        public static final int fromLeftToRight_VALUE = 2;
        public static final int fromLeftUpToRightDown_VALUE = 3;
        public static final int fromUpToDown_VALUE = 1;
        private static final C3437l.d<GradientDirection> internalValueMap = new C3437l.d<GradientDirection>() { // from class: com.p1.mobile.longlink.msg.liveright.liveRight.GradientDirection.1
            @Override // com.google.protobuf.C3437l.d
            public GradientDirection findValueByNumber(int i) {
                return GradientDirection.forNumber(i);
            }
        };
        public static final int unknownDirection_VALUE = 0;
        private final int value;

        GradientDirection(int i) {
            this.value = i;
        }

        public static GradientDirection forNumber(int i) {
            if (i == 0) {
                return unknownDirection;
            }
            if (i == 1) {
                return fromUpToDown;
            }
            if (i == 2) {
                return fromLeftToRight;
            }
            if (i != 3) {
                return null;
            }
            return fromLeftUpToRightDown;
        }

        public static C3437l.d<GradientDirection> internalGetValueMap() {
            return internalValueMap;
        }

        @Override // com.google.protobuf.C3437l.c
        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static GradientDirection valueOf(int i) {
            return forNumber(i);
        }
    }

    public enum LiveRightStatus implements C3437l.c {
        unknownStatus(0),
        pending(1),
        delete(3),
        UNRECOGNIZED(-1);

        public static final int delete_VALUE = 3;
        private static final C3437l.d<LiveRightStatus> internalValueMap = new C3437l.d<LiveRightStatus>() { // from class: com.p1.mobile.longlink.msg.liveright.liveRight.LiveRightStatus.1
            @Override // com.google.protobuf.C3437l.d
            public LiveRightStatus findValueByNumber(int i) {
                return LiveRightStatus.forNumber(i);
            }
        };
        public static final int pending_VALUE = 1;
        public static final int unknownStatus_VALUE = 0;
        private final int value;

        LiveRightStatus(int i) {
            this.value = i;
        }

        public static LiveRightStatus forNumber(int i) {
            if (i == 0) {
                return unknownStatus;
            }
            if (i == 1) {
                return pending;
            }
            if (i != 3) {
                return null;
            }
            return delete;
        }

        public static C3437l.d<LiveRightStatus> internalGetValueMap() {
            return internalValueMap;
        }

        @Override // com.google.protobuf.C3437l.c
        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static LiveRightStatus valueOf(int i) {
            return forNumber(i);
        }
    }

    public enum OperationType implements C3437l.c {
        auto(0),
        manual(1),
        UNRECOGNIZED(-1);

        public static final int auto_VALUE = 0;
        private static final C3437l.d<OperationType> internalValueMap = new C3437l.d<OperationType>() { // from class: com.p1.mobile.longlink.msg.liveright.liveRight.OperationType.1
            @Override // com.google.protobuf.C3437l.d
            public OperationType findValueByNumber(int i) {
                return OperationType.forNumber(i);
            }
        };
        public static final int manual_VALUE = 1;
        private final int value;

        OperationType(int i) {
            this.value = i;
        }

        public static OperationType forNumber(int i) {
            if (i == 0) {
                return auto;
            }
            if (i != 1) {
                return null;
            }
            return manual;
        }

        public static C3437l.d<OperationType> internalGetValueMap() {
            return internalValueMap;
        }

        @Override // com.google.protobuf.C3437l.c
        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static OperationType valueOf(int i) {
            return forNumber(i);
        }
    }

    public static final class PeriodConfig extends GeneratedMessageLite<PeriodConfig, Builder> implements PeriodConfigOrBuilder {
        private static final PeriodConfig DEFAULT_INSTANCE;
        public static final int FADINGTYPE_FIELD_NUMBER = 1;
        public static final int FADINGVALUE_FIELD_NUMBER = 2;
        private static volatile ng60<PeriodConfig> PARSER = null;
        public static final int SHOW_FIELD_NUMBER = 3;
        private int fadingType_;
        private long fadingValue_;
        private boolean show_;

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<PeriodConfig, Builder> implements PeriodConfigOrBuilder {
            private Builder() {
                super(PeriodConfig.DEFAULT_INSTANCE);
            }

            public Builder clearFadingType() {
                copyOnWrite();
                ((PeriodConfig) this.instance).clearFadingType();
                return this;
            }

            public Builder clearFadingValue() {
                copyOnWrite();
                ((PeriodConfig) this.instance).clearFadingValue();
                return this;
            }

            public Builder clearShow() {
                copyOnWrite();
                ((PeriodConfig) this.instance).clearShow();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveright.liveRight.PeriodConfigOrBuilder
            public FadingType getFadingType() {
                return ((PeriodConfig) this.instance).getFadingType();
            }

            @Override // com.p1.mobile.longlink.msg.liveright.liveRight.PeriodConfigOrBuilder
            public int getFadingTypeValue() {
                return ((PeriodConfig) this.instance).getFadingTypeValue();
            }

            @Override // com.p1.mobile.longlink.msg.liveright.liveRight.PeriodConfigOrBuilder
            public long getFadingValue() {
                return ((PeriodConfig) this.instance).getFadingValue();
            }

            @Override // com.p1.mobile.longlink.msg.liveright.liveRight.PeriodConfigOrBuilder
            public boolean getShow() {
                return ((PeriodConfig) this.instance).getShow();
            }

            public Builder setFadingType(FadingType fadingType) {
                copyOnWrite();
                ((PeriodConfig) this.instance).setFadingType(fadingType);
                return this;
            }

            public Builder setFadingTypeValue(int i) {
                copyOnWrite();
                ((PeriodConfig) this.instance).setFadingTypeValue(i);
                return this;
            }

            public Builder setFadingValue(long j) {
                copyOnWrite();
                ((PeriodConfig) this.instance).setFadingValue(j);
                return this;
            }

            public Builder setShow(boolean z) {
                copyOnWrite();
                ((PeriodConfig) this.instance).setShow(z);
                return this;
            }
        }

        static {
            PeriodConfig periodConfig = new PeriodConfig();
            DEFAULT_INSTANCE = periodConfig;
            periodConfig.makeImmutable();
        }

        private PeriodConfig() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFadingType() {
            this.fadingType_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFadingValue() {
            this.fadingValue_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearShow() {
            this.show_ = false;
        }

        public static PeriodConfig getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(PeriodConfig periodConfig) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(periodConfig);
        }

        public static PeriodConfig parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (PeriodConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PeriodConfig parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (PeriodConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<PeriodConfig> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFadingType(FadingType fadingType) {
            fadingType.getClass();
            this.fadingType_ = fadingType.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFadingTypeValue(int i) {
            this.fadingType_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFadingValue(long j) {
            this.fadingValue_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setShow(boolean z) {
            this.show_ = z;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C46081.f16684xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new PeriodConfig();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    PeriodConfig periodConfig = (PeriodConfig) obj2;
                    int i = this.fadingType_;
                    boolean z2 = i != 0;
                    int i2 = periodConfig.fadingType_;
                    this.fadingType_ = interfaceC3409h.mo17051e(z2, i, i2 != 0, i2);
                    long j = this.fadingValue_;
                    boolean z3 = j != 0;
                    long j2 = periodConfig.fadingValue_;
                    this.fadingValue_ = interfaceC3409h.mo17055i(z3, j, j2 != 0, j2);
                    boolean z4 = this.show_;
                    boolean z5 = periodConfig.show_;
                    this.show_ = interfaceC3409h.mo17050d(z4, z4, z5, z5);
                    GeneratedMessageLite.C3408g c3408g = GeneratedMessageLite.C3408g.INSTANCE;
                    return this;
                case 6:
                    C3430e c3430e = (C3430e) obj;
                    while (!z) {
                        try {
                            int iM17171M = c3430e.m17171M();
                            if (iM17171M != 0) {
                                if (iM17171M == 8) {
                                    this.fadingType_ = c3430e.m17191p();
                                } else if (iM17171M == 16) {
                                    this.fadingValue_ = c3430e.m17197v();
                                } else if (iM17171M == 24) {
                                    this.show_ = c3430e.m17188m();
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
                        synchronized (PeriodConfig.class) {
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

        @Override // com.p1.mobile.longlink.msg.liveright.liveRight.PeriodConfigOrBuilder
        public FadingType getFadingType() {
            FadingType fadingTypeForNumber = FadingType.forNumber(this.fadingType_);
            return fadingTypeForNumber == null ? FadingType.UNRECOGNIZED : fadingTypeForNumber;
        }

        @Override // com.p1.mobile.longlink.msg.liveright.liveRight.PeriodConfigOrBuilder
        public int getFadingTypeValue() {
            return this.fadingType_;
        }

        @Override // com.p1.mobile.longlink.msg.liveright.liveRight.PeriodConfigOrBuilder
        public long getFadingValue() {
            return this.fadingValue_;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16977m = this.fadingType_ != FadingType.never.getNumber() ? CodedOutputStream.m16977m(1, this.fadingType_) : 0;
            long j = this.fadingValue_;
            if (j != 0) {
                iM16977m += CodedOutputStream.m16986v(2, j);
            }
            boolean z = this.show_;
            if (z) {
                iM16977m += CodedOutputStream.m16970f(3, z);
            }
            this.memoizedSerializedSize = iM16977m;
            return iM16977m;
        }

        @Override // com.p1.mobile.longlink.msg.liveright.liveRight.PeriodConfigOrBuilder
        public boolean getShow() {
            return this.show_;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.fadingType_ != FadingType.never.getNumber()) {
                codedOutputStream.m17015i0(1, this.fadingType_);
            }
            long j = this.fadingValue_;
            if (j != 0) {
                codedOutputStream.m17027u0(2, j);
            }
            boolean z = this.show_;
            if (z) {
                codedOutputStream.mo17005a0(3, z);
            }
        }

        public static PeriodConfig parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (PeriodConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static PeriodConfig parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (PeriodConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        public static PeriodConfig parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (PeriodConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static PeriodConfig parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (PeriodConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static PeriodConfig parseFrom(InputStream inputStream) throws IOException {
            return (PeriodConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PeriodConfig parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (PeriodConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static PeriodConfig parseFrom(C3430e c3430e) throws IOException {
            return (PeriodConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static PeriodConfig parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (PeriodConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }

    public static final class PictureConfig extends GeneratedMessageLite<PictureConfig, Builder> implements PictureConfigOrBuilder {
        private static final PictureConfig DEFAULT_INSTANCE;
        public static final int DYNAMICURL_FIELD_NUMBER = 2;
        private static volatile ng60<PictureConfig> PARSER = null;
        public static final int STATICURL_FIELD_NUMBER = 1;
        private String staticUrl_ = "";
        private String dynamicUrl_ = "";

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<PictureConfig, Builder> implements PictureConfigOrBuilder {
            private Builder() {
                super(PictureConfig.DEFAULT_INSTANCE);
            }

            public Builder clearDynamicUrl() {
                copyOnWrite();
                ((PictureConfig) this.instance).clearDynamicUrl();
                return this;
            }

            public Builder clearStaticUrl() {
                copyOnWrite();
                ((PictureConfig) this.instance).clearStaticUrl();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveright.liveRight.PictureConfigOrBuilder
            public String getDynamicUrl() {
                return ((PictureConfig) this.instance).getDynamicUrl();
            }

            @Override // com.p1.mobile.longlink.msg.liveright.liveRight.PictureConfigOrBuilder
            public ByteString getDynamicUrlBytes() {
                return ((PictureConfig) this.instance).getDynamicUrlBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveright.liveRight.PictureConfigOrBuilder
            public String getStaticUrl() {
                return ((PictureConfig) this.instance).getStaticUrl();
            }

            @Override // com.p1.mobile.longlink.msg.liveright.liveRight.PictureConfigOrBuilder
            public ByteString getStaticUrlBytes() {
                return ((PictureConfig) this.instance).getStaticUrlBytes();
            }

            public Builder setDynamicUrl(String str) {
                copyOnWrite();
                ((PictureConfig) this.instance).setDynamicUrl(str);
                return this;
            }

            public Builder setDynamicUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((PictureConfig) this.instance).setDynamicUrlBytes(byteString);
                return this;
            }

            public Builder setStaticUrl(String str) {
                copyOnWrite();
                ((PictureConfig) this.instance).setStaticUrl(str);
                return this;
            }

            public Builder setStaticUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((PictureConfig) this.instance).setStaticUrlBytes(byteString);
                return this;
            }
        }

        static {
            PictureConfig pictureConfig = new PictureConfig();
            DEFAULT_INSTANCE = pictureConfig;
            pictureConfig.makeImmutable();
        }

        private PictureConfig() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDynamicUrl() {
            this.dynamicUrl_ = getDefaultInstance().getDynamicUrl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStaticUrl() {
            this.staticUrl_ = getDefaultInstance().getStaticUrl();
        }

        public static PictureConfig getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(PictureConfig pictureConfig) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(pictureConfig);
        }

        public static PictureConfig parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (PictureConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PictureConfig parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (PictureConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<PictureConfig> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDynamicUrl(String str) {
            str.getClass();
            this.dynamicUrl_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDynamicUrlBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.dynamicUrl_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStaticUrl(String str) {
            str.getClass();
            this.staticUrl_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStaticUrlBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.staticUrl_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C46081.f16684xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new PictureConfig();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    PictureConfig pictureConfig = (PictureConfig) obj2;
                    this.staticUrl_ = interfaceC3409h.mo17052f(!this.staticUrl_.isEmpty(), this.staticUrl_, !pictureConfig.staticUrl_.isEmpty(), pictureConfig.staticUrl_);
                    this.dynamicUrl_ = interfaceC3409h.mo17052f(!this.dynamicUrl_.isEmpty(), this.dynamicUrl_, true ^ pictureConfig.dynamicUrl_.isEmpty(), pictureConfig.dynamicUrl_);
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
                                    this.staticUrl_ = c3430e.m17170L();
                                } else if (iM17171M == 18) {
                                    this.dynamicUrl_ = c3430e.m17170L();
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
                        synchronized (PictureConfig.class) {
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

        @Override // com.p1.mobile.longlink.msg.liveright.liveRight.PictureConfigOrBuilder
        public String getDynamicUrl() {
            return this.dynamicUrl_;
        }

        @Override // com.p1.mobile.longlink.msg.liveright.liveRight.PictureConfigOrBuilder
        public ByteString getDynamicUrlBytes() {
            return ByteString.copyFromUtf8(this.dynamicUrl_);
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16956K = !this.staticUrl_.isEmpty() ? CodedOutputStream.m16956K(1, getStaticUrl()) : 0;
            if (!this.dynamicUrl_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(2, getDynamicUrl());
            }
            this.memoizedSerializedSize = iM16956K;
            return iM16956K;
        }

        @Override // com.p1.mobile.longlink.msg.liveright.liveRight.PictureConfigOrBuilder
        public String getStaticUrl() {
            return this.staticUrl_;
        }

        @Override // com.p1.mobile.longlink.msg.liveright.liveRight.PictureConfigOrBuilder
        public ByteString getStaticUrlBytes() {
            return ByteString.copyFromUtf8(this.staticUrl_);
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.staticUrl_.isEmpty()) {
                codedOutputStream.mo16994D0(1, getStaticUrl());
            }
            if (this.dynamicUrl_.isEmpty()) {
                return;
            }
            codedOutputStream.mo16994D0(2, getDynamicUrl());
        }

        public static PictureConfig parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (PictureConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static PictureConfig parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (PictureConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        public static PictureConfig parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (PictureConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static PictureConfig parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (PictureConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static PictureConfig parseFrom(InputStream inputStream) throws IOException {
            return (PictureConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PictureConfig parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (PictureConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static PictureConfig parseFrom(C3430e c3430e) throws IOException {
            return (PictureConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static PictureConfig parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (PictureConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }

    public enum PlaceType implements C3437l.c {
        videoRoom(0),
        voiceRoom(1),
        UNRECOGNIZED(-1);

        private static final C3437l.d<PlaceType> internalValueMap = new C3437l.d<PlaceType>() { // from class: com.p1.mobile.longlink.msg.liveright.liveRight.PlaceType.1
            @Override // com.google.protobuf.C3437l.d
            public PlaceType findValueByNumber(int i) {
                return PlaceType.forNumber(i);
            }
        };
        public static final int videoRoom_VALUE = 0;
        public static final int voiceRoom_VALUE = 1;
        private final int value;

        PlaceType(int i) {
            this.value = i;
        }

        public static PlaceType forNumber(int i) {
            if (i == 0) {
                return videoRoom;
            }
            if (i != 1) {
                return null;
            }
            return voiceRoom;
        }

        public static C3437l.d<PlaceType> internalGetValueMap() {
            return internalValueMap;
        }

        @Override // com.google.protobuf.C3437l.c
        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static PlaceType valueOf(int i) {
            return forNumber(i);
        }
    }

    public static final class ProfileConfig extends GeneratedMessageLite<ProfileConfig, Builder> implements ProfileConfigOrBuilder {
        public static final int BACKGROUNDPICTURECONFIG_FIELD_NUMBER = 1;
        private static final ProfileConfig DEFAULT_INSTANCE;
        private static volatile ng60<ProfileConfig> PARSER = null;
        public static final int TOPFRAMECONFIG_FIELD_NUMBER = 2;
        private PictureConfig backgroundPictureConfig_;
        private PictureConfig topFrameConfig_;

        static {
            ProfileConfig profileConfig = new ProfileConfig();
            DEFAULT_INSTANCE = profileConfig;
            profileConfig.makeImmutable();
        }

        private ProfileConfig() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBackgroundPictureConfig() {
            this.backgroundPictureConfig_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTopFrameConfig() {
            this.topFrameConfig_ = null;
        }

        public static ProfileConfig getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeBackgroundPictureConfig(PictureConfig pictureConfig) {
            PictureConfig pictureConfig2 = this.backgroundPictureConfig_;
            if (pictureConfig2 == null || pictureConfig2 == PictureConfig.getDefaultInstance()) {
                this.backgroundPictureConfig_ = pictureConfig;
            } else {
                this.backgroundPictureConfig_ = PictureConfig.newBuilder(this.backgroundPictureConfig_).mergeFrom(pictureConfig).buildPartial();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeTopFrameConfig(PictureConfig pictureConfig) {
            PictureConfig pictureConfig2 = this.topFrameConfig_;
            if (pictureConfig2 == null || pictureConfig2 == PictureConfig.getDefaultInstance()) {
                this.topFrameConfig_ = pictureConfig;
            } else {
                this.topFrameConfig_ = PictureConfig.newBuilder(this.topFrameConfig_).mergeFrom(pictureConfig).buildPartial();
            }
        }

        public static Builder newBuilder(ProfileConfig profileConfig) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(profileConfig);
        }

        public static ProfileConfig parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ProfileConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ProfileConfig parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ProfileConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<ProfileConfig> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBackgroundPictureConfig(PictureConfig.Builder builder) {
            this.backgroundPictureConfig_ = builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTopFrameConfig(PictureConfig.Builder builder) {
            this.topFrameConfig_ = builder.build();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C46081.f16684xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new ProfileConfig();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    ProfileConfig profileConfig = (ProfileConfig) obj2;
                    this.backgroundPictureConfig_ = (PictureConfig) interfaceC3409h.mo17061o(this.backgroundPictureConfig_, profileConfig.backgroundPictureConfig_);
                    this.topFrameConfig_ = (PictureConfig) interfaceC3409h.mo17061o(this.topFrameConfig_, profileConfig.topFrameConfig_);
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
                                    PictureConfig pictureConfig = this.backgroundPictureConfig_;
                                    PictureConfig.Builder builder = pictureConfig != null ? pictureConfig.toBuilder() : null;
                                    PictureConfig pictureConfig2 = (PictureConfig) c3430e.m17198w(PictureConfig.parser(), c3433h);
                                    this.backgroundPictureConfig_ = pictureConfig2;
                                    if (builder != null) {
                                        builder.mergeFrom(pictureConfig2);
                                        this.backgroundPictureConfig_ = builder.buildPartial();
                                    }
                                } else if (iM17171M == 18) {
                                    PictureConfig pictureConfig3 = this.topFrameConfig_;
                                    PictureConfig.Builder builder2 = pictureConfig3 != null ? pictureConfig3.toBuilder() : null;
                                    PictureConfig pictureConfig4 = (PictureConfig) c3430e.m17198w(PictureConfig.parser(), c3433h);
                                    this.topFrameConfig_ = pictureConfig4;
                                    if (builder2 != null) {
                                        builder2.mergeFrom(pictureConfig4);
                                        this.topFrameConfig_ = builder2.buildPartial();
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
                        synchronized (ProfileConfig.class) {
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

        @Override // com.p1.mobile.longlink.msg.liveright.liveRight.ProfileConfigOrBuilder
        public PictureConfig getBackgroundPictureConfig() {
            PictureConfig pictureConfig = this.backgroundPictureConfig_;
            return pictureConfig == null ? PictureConfig.getDefaultInstance() : pictureConfig;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16948C = this.backgroundPictureConfig_ != null ? CodedOutputStream.m16948C(1, getBackgroundPictureConfig()) : 0;
            if (this.topFrameConfig_ != null) {
                iM16948C += CodedOutputStream.m16948C(2, getTopFrameConfig());
            }
            this.memoizedSerializedSize = iM16948C;
            return iM16948C;
        }

        @Override // com.p1.mobile.longlink.msg.liveright.liveRight.ProfileConfigOrBuilder
        public PictureConfig getTopFrameConfig() {
            PictureConfig pictureConfig = this.topFrameConfig_;
            return pictureConfig == null ? PictureConfig.getDefaultInstance() : pictureConfig;
        }

        @Override // com.p1.mobile.longlink.msg.liveright.liveRight.ProfileConfigOrBuilder
        public boolean hasBackgroundPictureConfig() {
            return this.backgroundPictureConfig_ != null;
        }

        @Override // com.p1.mobile.longlink.msg.liveright.liveRight.ProfileConfigOrBuilder
        public boolean hasTopFrameConfig() {
            return this.topFrameConfig_ != null;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.backgroundPictureConfig_ != null) {
                codedOutputStream.mo17029w0(1, getBackgroundPictureConfig());
            }
            if (this.topFrameConfig_ != null) {
                codedOutputStream.mo17029w0(2, getTopFrameConfig());
            }
        }

        public static ProfileConfig parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (ProfileConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static ProfileConfig parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (ProfileConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBackgroundPictureConfig(PictureConfig pictureConfig) {
            pictureConfig.getClass();
            this.backgroundPictureConfig_ = pictureConfig;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTopFrameConfig(PictureConfig pictureConfig) {
            pictureConfig.getClass();
            this.topFrameConfig_ = pictureConfig;
        }

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<ProfileConfig, Builder> implements ProfileConfigOrBuilder {
            private Builder() {
                super(ProfileConfig.DEFAULT_INSTANCE);
            }

            public Builder clearBackgroundPictureConfig() {
                copyOnWrite();
                ((ProfileConfig) this.instance).clearBackgroundPictureConfig();
                return this;
            }

            public Builder clearTopFrameConfig() {
                copyOnWrite();
                ((ProfileConfig) this.instance).clearTopFrameConfig();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveright.liveRight.ProfileConfigOrBuilder
            public PictureConfig getBackgroundPictureConfig() {
                return ((ProfileConfig) this.instance).getBackgroundPictureConfig();
            }

            @Override // com.p1.mobile.longlink.msg.liveright.liveRight.ProfileConfigOrBuilder
            public PictureConfig getTopFrameConfig() {
                return ((ProfileConfig) this.instance).getTopFrameConfig();
            }

            @Override // com.p1.mobile.longlink.msg.liveright.liveRight.ProfileConfigOrBuilder
            public boolean hasBackgroundPictureConfig() {
                return ((ProfileConfig) this.instance).hasBackgroundPictureConfig();
            }

            @Override // com.p1.mobile.longlink.msg.liveright.liveRight.ProfileConfigOrBuilder
            public boolean hasTopFrameConfig() {
                return ((ProfileConfig) this.instance).hasTopFrameConfig();
            }

            public Builder mergeBackgroundPictureConfig(PictureConfig pictureConfig) {
                copyOnWrite();
                ((ProfileConfig) this.instance).mergeBackgroundPictureConfig(pictureConfig);
                return this;
            }

            public Builder mergeTopFrameConfig(PictureConfig pictureConfig) {
                copyOnWrite();
                ((ProfileConfig) this.instance).mergeTopFrameConfig(pictureConfig);
                return this;
            }

            public Builder setBackgroundPictureConfig(PictureConfig pictureConfig) {
                copyOnWrite();
                ((ProfileConfig) this.instance).setBackgroundPictureConfig(pictureConfig);
                return this;
            }

            public Builder setTopFrameConfig(PictureConfig pictureConfig) {
                copyOnWrite();
                ((ProfileConfig) this.instance).setTopFrameConfig(pictureConfig);
                return this;
            }

            public Builder setBackgroundPictureConfig(PictureConfig.Builder builder) {
                copyOnWrite();
                ((ProfileConfig) this.instance).setBackgroundPictureConfig(builder);
                return this;
            }

            public Builder setTopFrameConfig(PictureConfig.Builder builder) {
                copyOnWrite();
                ((ProfileConfig) this.instance).setTopFrameConfig(builder);
                return this;
            }
        }

        public static ProfileConfig parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ProfileConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ProfileConfig parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (ProfileConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static ProfileConfig parseFrom(InputStream inputStream) throws IOException {
            return (ProfileConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ProfileConfig parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (ProfileConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static ProfileConfig parseFrom(C3430e c3430e) throws IOException {
            return (ProfileConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ProfileConfig parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (ProfileConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }

    public enum ReceiveType implements C3437l.c {
        forReceiver(0),
        forGiver(1),
        UNRECOGNIZED(-1);

        public static final int forGiver_VALUE = 1;
        public static final int forReceiver_VALUE = 0;
        private static final C3437l.d<ReceiveType> internalValueMap = new C3437l.d<ReceiveType>() { // from class: com.p1.mobile.longlink.msg.liveright.liveRight.ReceiveType.1
            @Override // com.google.protobuf.C3437l.d
            public ReceiveType findValueByNumber(int i) {
                return ReceiveType.forNumber(i);
            }
        };
        private final int value;

        ReceiveType(int i) {
            this.value = i;
        }

        public static ReceiveType forNumber(int i) {
            if (i == 0) {
                return forReceiver;
            }
            if (i != 1) {
                return null;
            }
            return forGiver;
        }

        public static C3437l.d<ReceiveType> internalGetValueMap() {
            return internalValueMap;
        }

        @Override // com.google.protobuf.C3437l.c
        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static ReceiveType valueOf(int i) {
            return forNumber(i);
        }
    }

    public static final class Restrict extends GeneratedMessageLite<Restrict, Builder> implements RestrictOrBuilder {
        private static final Restrict DEFAULT_INSTANCE;
        public static final int GIFTIDS_FIELD_NUMBER = 2;
        public static final int GRADE_FIELD_NUMBER = 1;
        private static volatile ng60<Restrict> PARSER = null;
        public static final int RECEIVETYPE_FIELD_NUMBER = 3;
        private int bitField0_;
        private C3437l.g giftIds_ = GeneratedMessageLite.emptyLongList();
        private long grade_;
        private int receiveType_;

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<Restrict, Builder> implements RestrictOrBuilder {
            private Builder() {
                super(Restrict.DEFAULT_INSTANCE);
            }

            public Builder addAllGiftIds(Iterable<? extends Long> iterable) {
                copyOnWrite();
                ((Restrict) this.instance).addAllGiftIds(iterable);
                return this;
            }

            public Builder addGiftIds(long j) {
                copyOnWrite();
                ((Restrict) this.instance).addGiftIds(j);
                return this;
            }

            public Builder clearGiftIds() {
                copyOnWrite();
                ((Restrict) this.instance).clearGiftIds();
                return this;
            }

            public Builder clearGrade() {
                copyOnWrite();
                ((Restrict) this.instance).clearGrade();
                return this;
            }

            public Builder clearReceiveType() {
                copyOnWrite();
                ((Restrict) this.instance).clearReceiveType();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveright.liveRight.RestrictOrBuilder
            public long getGiftIds(int i) {
                return ((Restrict) this.instance).getGiftIds(i);
            }

            @Override // com.p1.mobile.longlink.msg.liveright.liveRight.RestrictOrBuilder
            public int getGiftIdsCount() {
                return ((Restrict) this.instance).getGiftIdsCount();
            }

            @Override // com.p1.mobile.longlink.msg.liveright.liveRight.RestrictOrBuilder
            public List<Long> getGiftIdsList() {
                return Collections.unmodifiableList(((Restrict) this.instance).getGiftIdsList());
            }

            @Override // com.p1.mobile.longlink.msg.liveright.liveRight.RestrictOrBuilder
            public long getGrade() {
                return ((Restrict) this.instance).getGrade();
            }

            @Override // com.p1.mobile.longlink.msg.liveright.liveRight.RestrictOrBuilder
            public ReceiveType getReceiveType() {
                return ((Restrict) this.instance).getReceiveType();
            }

            @Override // com.p1.mobile.longlink.msg.liveright.liveRight.RestrictOrBuilder
            public int getReceiveTypeValue() {
                return ((Restrict) this.instance).getReceiveTypeValue();
            }

            public Builder setGiftIds(int i, long j) {
                copyOnWrite();
                ((Restrict) this.instance).setGiftIds(i, j);
                return this;
            }

            public Builder setGrade(long j) {
                copyOnWrite();
                ((Restrict) this.instance).setGrade(j);
                return this;
            }

            public Builder setReceiveType(ReceiveType receiveType) {
                copyOnWrite();
                ((Restrict) this.instance).setReceiveType(receiveType);
                return this;
            }

            public Builder setReceiveTypeValue(int i) {
                copyOnWrite();
                ((Restrict) this.instance).setReceiveTypeValue(i);
                return this;
            }
        }

        static {
            Restrict restrict = new Restrict();
            DEFAULT_INSTANCE = restrict;
            restrict.makeImmutable();
        }

        private Restrict() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllGiftIds(Iterable<? extends Long> iterable) {
            ensureGiftIdsIsMutable();
            AbstractC3426a.addAll(iterable, this.giftIds_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addGiftIds(long j) {
            ensureGiftIdsIsMutable();
            this.giftIds_.mo17267u(j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGiftIds() {
            this.giftIds_ = GeneratedMessageLite.emptyLongList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGrade() {
            this.grade_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearReceiveType() {
            this.receiveType_ = 0;
        }

        private void ensureGiftIdsIsMutable() {
            if (this.giftIds_.mo17140q()) {
                return;
            }
            this.giftIds_ = GeneratedMessageLite.mutableCopy(this.giftIds_);
        }

        public static Restrict getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(Restrict restrict) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(restrict);
        }

        public static Restrict parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Restrict) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Restrict parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Restrict) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<Restrict> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGiftIds(int i, long j) {
            ensureGiftIdsIsMutable();
            this.giftIds_.setLong(i, j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGrade(long j) {
            this.grade_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setReceiveType(ReceiveType receiveType) {
            receiveType.getClass();
            this.receiveType_ = receiveType.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setReceiveTypeValue(int i) {
            this.receiveType_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C46081.f16684xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new Restrict();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.giftIds_.mo17139n();
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    Restrict restrict = (Restrict) obj2;
                    long j = this.grade_;
                    boolean z2 = j != 0;
                    long j2 = restrict.grade_;
                    this.grade_ = interfaceC3409h.mo17055i(z2, j, j2 != 0, j2);
                    this.giftIds_ = interfaceC3409h.mo17063q(this.giftIds_, restrict.giftIds_);
                    int i = this.receiveType_;
                    boolean z3 = i != 0;
                    int i2 = restrict.receiveType_;
                    this.receiveType_ = interfaceC3409h.mo17051e(z3, i, i2 != 0, i2);
                    if (interfaceC3409h == GeneratedMessageLite.C3408g.INSTANCE) {
                        this.bitField0_ |= restrict.bitField0_;
                    }
                    return this;
                case 6:
                    C3430e c3430e = (C3430e) obj;
                    while (!z) {
                        try {
                            int iM17171M = c3430e.m17171M();
                            if (iM17171M != 0) {
                                if (iM17171M == 8) {
                                    this.grade_ = c3430e.m17197v();
                                } else if (iM17171M == 16) {
                                    if (!this.giftIds_.mo17140q()) {
                                        this.giftIds_ = GeneratedMessageLite.mutableCopy(this.giftIds_);
                                    }
                                    this.giftIds_.mo17267u(c3430e.m17197v());
                                } else if (iM17171M == 18) {
                                    int iM17187l = c3430e.m17187l(c3430e.m17162C());
                                    if (!this.giftIds_.mo17140q() && c3430e.m17184d() > 0) {
                                        this.giftIds_ = GeneratedMessageLite.mutableCopy(this.giftIds_);
                                    }
                                    while (c3430e.m17184d() > 0) {
                                        this.giftIds_.mo17267u(c3430e.m17197v());
                                    }
                                    c3430e.m17186k(iM17187l);
                                } else if (iM17171M == 24) {
                                    this.receiveType_ = c3430e.m17191p();
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
                        synchronized (Restrict.class) {
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

        @Override // com.p1.mobile.longlink.msg.liveright.liveRight.RestrictOrBuilder
        public long getGiftIds(int i) {
            return this.giftIds_.getLong(i);
        }

        @Override // com.p1.mobile.longlink.msg.liveright.liveRight.RestrictOrBuilder
        public int getGiftIdsCount() {
            return this.giftIds_.size();
        }

        @Override // com.p1.mobile.longlink.msg.liveright.liveRight.RestrictOrBuilder
        public List<Long> getGiftIdsList() {
            return this.giftIds_;
        }

        @Override // com.p1.mobile.longlink.msg.liveright.liveRight.RestrictOrBuilder
        public long getGrade() {
            return this.grade_;
        }

        @Override // com.p1.mobile.longlink.msg.liveright.liveRight.RestrictOrBuilder
        public ReceiveType getReceiveType() {
            ReceiveType receiveTypeForNumber = ReceiveType.forNumber(this.receiveType_);
            return receiveTypeForNumber == null ? ReceiveType.UNRECOGNIZED : receiveTypeForNumber;
        }

        @Override // com.p1.mobile.longlink.msg.liveright.liveRight.RestrictOrBuilder
        public int getReceiveTypeValue() {
            return this.receiveType_;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            long j = this.grade_;
            int iM16986v = j != 0 ? CodedOutputStream.m16986v(1, j) : 0;
            int iM16987w = 0;
            for (int i2 = 0; i2 < this.giftIds_.size(); i2++) {
                iM16987w += CodedOutputStream.m16987w(this.giftIds_.getLong(i2));
            }
            int size = iM16986v + iM16987w + getGiftIdsList().size();
            if (this.receiveType_ != ReceiveType.forReceiver.getNumber()) {
                size += CodedOutputStream.m16977m(3, this.receiveType_);
            }
            this.memoizedSerializedSize = size;
            return size;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            long j = this.grade_;
            if (j != 0) {
                codedOutputStream.m17027u0(1, j);
            }
            for (int i = 0; i < this.giftIds_.size(); i++) {
                codedOutputStream.m17027u0(2, this.giftIds_.getLong(i));
            }
            if (this.receiveType_ != ReceiveType.forReceiver.getNumber()) {
                codedOutputStream.m17015i0(3, this.receiveType_);
            }
        }

        public static Restrict parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (Restrict) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static Restrict parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (Restrict) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        public static Restrict parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Restrict) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Restrict parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (Restrict) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static Restrict parseFrom(InputStream inputStream) throws IOException {
            return (Restrict) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Restrict parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (Restrict) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static Restrict parseFrom(C3430e c3430e) throws IOException {
            return (Restrict) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Restrict parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (Restrict) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }

    public enum ShowType implements C3437l.c {
        single(0),
        multiple(1),
        UNRECOGNIZED(-1);

        private static final C3437l.d<ShowType> internalValueMap = new C3437l.d<ShowType>() { // from class: com.p1.mobile.longlink.msg.liveright.liveRight.ShowType.1
            @Override // com.google.protobuf.C3437l.d
            public ShowType findValueByNumber(int i) {
                return ShowType.forNumber(i);
            }
        };
        public static final int multiple_VALUE = 1;
        public static final int single_VALUE = 0;
        private final int value;

        ShowType(int i) {
            this.value = i;
        }

        public static ShowType forNumber(int i) {
            if (i == 0) {
                return single;
            }
            if (i != 1) {
                return null;
            }
            return multiple;
        }

        public static C3437l.d<ShowType> internalGetValueMap() {
            return internalValueMap;
        }

        @Override // com.google.protobuf.C3437l.c
        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static ShowType valueOf(int i) {
            return forNumber(i);
        }
    }

    public static final class TopChatUpdateNotice extends GeneratedMessageLite<TopChatUpdateNotice, Builder> implements TopChatUpdateNoticeOrBuilder {
        private static final TopChatUpdateNotice DEFAULT_INSTANCE;
        private static volatile ng60<TopChatUpdateNotice> PARSER = null;
        public static final int RANDOMDELAYSECONDS_FIELD_NUMBER = 1;
        public static final int TIMESTAMP_FIELD_NUMBER = 2;
        private long randomDelaySeconds_;
        private long timestamp_;

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<TopChatUpdateNotice, Builder> implements TopChatUpdateNoticeOrBuilder {
            private Builder() {
                super(TopChatUpdateNotice.DEFAULT_INSTANCE);
            }

            public Builder clearRandomDelaySeconds() {
                copyOnWrite();
                ((TopChatUpdateNotice) this.instance).clearRandomDelaySeconds();
                return this;
            }

            public Builder clearTimestamp() {
                copyOnWrite();
                ((TopChatUpdateNotice) this.instance).clearTimestamp();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveright.liveRight.TopChatUpdateNoticeOrBuilder
            public long getRandomDelaySeconds() {
                return ((TopChatUpdateNotice) this.instance).getRandomDelaySeconds();
            }

            @Override // com.p1.mobile.longlink.msg.liveright.liveRight.TopChatUpdateNoticeOrBuilder
            public long getTimestamp() {
                return ((TopChatUpdateNotice) this.instance).getTimestamp();
            }

            public Builder setRandomDelaySeconds(long j) {
                copyOnWrite();
                ((TopChatUpdateNotice) this.instance).setRandomDelaySeconds(j);
                return this;
            }

            public Builder setTimestamp(long j) {
                copyOnWrite();
                ((TopChatUpdateNotice) this.instance).setTimestamp(j);
                return this;
            }
        }

        static {
            TopChatUpdateNotice topChatUpdateNotice = new TopChatUpdateNotice();
            DEFAULT_INSTANCE = topChatUpdateNotice;
            topChatUpdateNotice.makeImmutable();
        }

        private TopChatUpdateNotice() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRandomDelaySeconds() {
            this.randomDelaySeconds_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTimestamp() {
            this.timestamp_ = 0L;
        }

        public static TopChatUpdateNotice getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(TopChatUpdateNotice topChatUpdateNotice) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(topChatUpdateNotice);
        }

        public static TopChatUpdateNotice parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (TopChatUpdateNotice) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TopChatUpdateNotice parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (TopChatUpdateNotice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<TopChatUpdateNotice> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRandomDelaySeconds(long j) {
            this.randomDelaySeconds_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTimestamp(long j) {
            this.timestamp_ = j;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C46081.f16684xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new TopChatUpdateNotice();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    TopChatUpdateNotice topChatUpdateNotice = (TopChatUpdateNotice) obj2;
                    long j = this.randomDelaySeconds_;
                    boolean z2 = j != 0;
                    long j2 = topChatUpdateNotice.randomDelaySeconds_;
                    this.randomDelaySeconds_ = interfaceC3409h.mo17055i(z2, j, j2 != 0, j2);
                    boolean z3 = false;
                    long j3 = this.timestamp_;
                    if (j3 != 0) {
                        z3 = true;
                    }
                    long j4 = topChatUpdateNotice.timestamp_;
                    this.timestamp_ = interfaceC3409h.mo17055i(z3, j3, j4 != 0, j4);
                    GeneratedMessageLite.C3408g c3408g = GeneratedMessageLite.C3408g.INSTANCE;
                    return this;
                case 6:
                    C3430e c3430e = (C3430e) obj;
                    while (!z) {
                        try {
                            int iM17171M = c3430e.m17171M();
                            if (iM17171M != 0) {
                                if (iM17171M == 8) {
                                    this.randomDelaySeconds_ = c3430e.m17197v();
                                } else if (iM17171M == 16) {
                                    this.timestamp_ = c3430e.m17197v();
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
                        synchronized (TopChatUpdateNotice.class) {
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

        @Override // com.p1.mobile.longlink.msg.liveright.liveRight.TopChatUpdateNoticeOrBuilder
        public long getRandomDelaySeconds() {
            return this.randomDelaySeconds_;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            long j = this.randomDelaySeconds_;
            int iM16986v = j != 0 ? CodedOutputStream.m16986v(1, j) : 0;
            long j2 = this.timestamp_;
            if (j2 != 0) {
                iM16986v += CodedOutputStream.m16986v(2, j2);
            }
            this.memoizedSerializedSize = iM16986v;
            return iM16986v;
        }

        @Override // com.p1.mobile.longlink.msg.liveright.liveRight.TopChatUpdateNoticeOrBuilder
        public long getTimestamp() {
            return this.timestamp_;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            long j = this.randomDelaySeconds_;
            if (j != 0) {
                codedOutputStream.m17027u0(1, j);
            }
            long j2 = this.timestamp_;
            if (j2 != 0) {
                codedOutputStream.m17027u0(2, j2);
            }
        }

        public static TopChatUpdateNotice parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (TopChatUpdateNotice) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static TopChatUpdateNotice parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (TopChatUpdateNotice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        public static TopChatUpdateNotice parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (TopChatUpdateNotice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TopChatUpdateNotice parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (TopChatUpdateNotice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static TopChatUpdateNotice parseFrom(InputStream inputStream) throws IOException {
            return (TopChatUpdateNotice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TopChatUpdateNotice parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (TopChatUpdateNotice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static TopChatUpdateNotice parseFrom(C3430e c3430e) throws IOException {
            return (TopChatUpdateNotice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static TopChatUpdateNotice parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (TopChatUpdateNotice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }

    public enum Type implements C3437l.c {
        emptyType(0),
        chatShading(1),
        avatar(2),
        profile(3),
        mystery(4),
        callEffect(5),
        UNRECOGNIZED(-1);

        public static final int avatar_VALUE = 2;
        public static final int callEffect_VALUE = 5;
        public static final int chatShading_VALUE = 1;
        public static final int emptyType_VALUE = 0;
        private static final C3437l.d<Type> internalValueMap = new C3437l.d<Type>() { // from class: com.p1.mobile.longlink.msg.liveright.liveRight.Type.1
            @Override // com.google.protobuf.C3437l.d
            public Type findValueByNumber(int i) {
                return Type.forNumber(i);
            }
        };
        public static final int mystery_VALUE = 4;
        public static final int profile_VALUE = 3;
        private final int value;

        Type(int i) {
            this.value = i;
        }

        public static Type forNumber(int i) {
            if (i == 0) {
                return emptyType;
            }
            if (i == 1) {
                return chatShading;
            }
            if (i == 2) {
                return avatar;
            }
            if (i == 3) {
                return profile;
            }
            if (i == 4) {
                return mystery;
            }
            if (i != 5) {
                return null;
            }
            return callEffect;
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

    public static final class UserLiveRight extends GeneratedMessageLite<UserLiveRight, Builder> implements UserLiveRightOrBuilder {
        public static final int ATTRIBUTE_FIELD_NUMBER = 8;
        public static final int CREATETIMEINSECONDS_FIELD_NUMBER = 10;
        private static final UserLiveRight DEFAULT_INSTANCE;
        public static final int FROMUSERID_FIELD_NUMBER = 12;
        public static final int ID_FIELD_NUMBER = 1;
        public static final int LEVEL_FIELD_NUMBER = 7;
        public static final int LIVERIGHTID_FIELD_NUMBER = 3;
        public static final int NAME_FIELD_NUMBER = 5;
        private static volatile ng60<UserLiveRight> PARSER = null;
        public static final int PLACETYPE_FIELD_NUMBER = 13;
        public static final int RIGHTTYPE_FIELD_NUMBER = 4;
        public static final int SHOWTYPE_FIELD_NUMBER = 6;
        public static final int STATUS_FIELD_NUMBER = 9;
        public static final int USERID_FIELD_NUMBER = 2;
        public static final int VALIDENDTIMEINSECONDS_FIELD_NUMBER = 11;
        private Attribute attribute_;
        private long createTimeInSeconds_;
        private long level_;
        private int placeType_;
        private int rightType_;
        private int showType_;
        private int status_;
        private long validEndTimeInSeconds_;
        private String id_ = "";
        private String userId_ = "";
        private String liveRightId_ = "";
        private String name_ = "";
        private String fromUserId_ = "";

        static {
            UserLiveRight userLiveRight = new UserLiveRight();
            DEFAULT_INSTANCE = userLiveRight;
            userLiveRight.makeImmutable();
        }

        private UserLiveRight() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAttribute() {
            this.attribute_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCreateTimeInSeconds() {
            this.createTimeInSeconds_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFromUserId() {
            this.fromUserId_ = getDefaultInstance().getFromUserId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearId() {
            this.id_ = getDefaultInstance().getId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLevel() {
            this.level_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLiveRightId() {
            this.liveRightId_ = getDefaultInstance().getLiveRightId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearName() {
            this.name_ = getDefaultInstance().getName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPlaceType() {
            this.placeType_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRightType() {
            this.rightType_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearShowType() {
            this.showType_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStatus() {
            this.status_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUserId() {
            this.userId_ = getDefaultInstance().getUserId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearValidEndTimeInSeconds() {
            this.validEndTimeInSeconds_ = 0L;
        }

        public static UserLiveRight getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeAttribute(Attribute attribute) {
            Attribute attribute2 = this.attribute_;
            if (attribute2 == null || attribute2 == Attribute.getDefaultInstance()) {
                this.attribute_ = attribute;
            } else {
                this.attribute_ = Attribute.newBuilder(this.attribute_).mergeFrom(attribute).buildPartial();
            }
        }

        public static Builder newBuilder(UserLiveRight userLiveRight) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(userLiveRight);
        }

        public static UserLiveRight parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (UserLiveRight) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static UserLiveRight parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (UserLiveRight) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<UserLiveRight> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAttribute(Attribute.Builder builder) {
            this.attribute_ = builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCreateTimeInSeconds(long j) {
            this.createTimeInSeconds_ = j;
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
        public void setLevel(long j) {
            this.level_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLiveRightId(String str) {
            str.getClass();
            this.liveRightId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLiveRightIdBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.liveRightId_ = byteString.toStringUtf8();
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
        public void setPlaceType(PlaceType placeType) {
            placeType.getClass();
            this.placeType_ = placeType.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPlaceTypeValue(int i) {
            this.placeType_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRightType(Type type) {
            type.getClass();
            this.rightType_ = type.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRightTypeValue(int i) {
            this.rightType_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setShowType(ShowType showType) {
            showType.getClass();
            this.showType_ = showType.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setShowTypeValue(int i) {
            this.showType_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStatus(UserLiveRightStatus userLiveRightStatus) {
            userLiveRightStatus.getClass();
            this.status_ = userLiveRightStatus.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStatusValue(int i) {
            this.status_ = i;
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
        public void setValidEndTimeInSeconds(long j) {
            this.validEndTimeInSeconds_ = j;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C46081.f16684xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new UserLiveRight();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    UserLiveRight userLiveRight = (UserLiveRight) obj2;
                    this.id_ = interfaceC3409h.mo17052f(!this.id_.isEmpty(), this.id_, !userLiveRight.id_.isEmpty(), userLiveRight.id_);
                    this.userId_ = interfaceC3409h.mo17052f(!this.userId_.isEmpty(), this.userId_, !userLiveRight.userId_.isEmpty(), userLiveRight.userId_);
                    this.liveRightId_ = interfaceC3409h.mo17052f(!this.liveRightId_.isEmpty(), this.liveRightId_, !userLiveRight.liveRightId_.isEmpty(), userLiveRight.liveRightId_);
                    int i = this.rightType_;
                    boolean z2 = i != 0;
                    int i2 = userLiveRight.rightType_;
                    this.rightType_ = interfaceC3409h.mo17051e(z2, i, i2 != 0, i2);
                    this.name_ = interfaceC3409h.mo17052f(!this.name_.isEmpty(), this.name_, !userLiveRight.name_.isEmpty(), userLiveRight.name_);
                    int i3 = this.showType_;
                    boolean z3 = i3 != 0;
                    int i4 = userLiveRight.showType_;
                    this.showType_ = interfaceC3409h.mo17051e(z3, i3, i4 != 0, i4);
                    long j = this.level_;
                    boolean z4 = j != 0;
                    long j2 = userLiveRight.level_;
                    this.level_ = interfaceC3409h.mo17055i(z4, j, j2 != 0, j2);
                    this.attribute_ = (Attribute) interfaceC3409h.mo17061o(this.attribute_, userLiveRight.attribute_);
                    int i5 = this.status_;
                    boolean z5 = i5 != 0;
                    int i6 = userLiveRight.status_;
                    this.status_ = interfaceC3409h.mo17051e(z5, i5, i6 != 0, i6);
                    long j3 = this.createTimeInSeconds_;
                    boolean z6 = j3 != 0;
                    long j4 = userLiveRight.createTimeInSeconds_;
                    this.createTimeInSeconds_ = interfaceC3409h.mo17055i(z6, j3, j4 != 0, j4);
                    long j5 = this.validEndTimeInSeconds_;
                    boolean z7 = j5 != 0;
                    long j6 = userLiveRight.validEndTimeInSeconds_;
                    this.validEndTimeInSeconds_ = interfaceC3409h.mo17055i(z7, j5, j6 != 0, j6);
                    this.fromUserId_ = interfaceC3409h.mo17052f(!this.fromUserId_.isEmpty(), this.fromUserId_, !userLiveRight.fromUserId_.isEmpty(), userLiveRight.fromUserId_);
                    int i7 = this.placeType_;
                    boolean z8 = i7 != 0;
                    int i8 = userLiveRight.placeType_;
                    this.placeType_ = interfaceC3409h.mo17051e(z8, i7, i8 != 0, i8);
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
                                    this.id_ = c3430e.m17170L();
                                    continue;
                                case 18:
                                    this.userId_ = c3430e.m17170L();
                                    continue;
                                case 26:
                                    this.liveRightId_ = c3430e.m17170L();
                                    continue;
                                case 32:
                                    this.rightType_ = c3430e.m17191p();
                                    continue;
                                case 42:
                                    this.name_ = c3430e.m17170L();
                                    continue;
                                case 48:
                                    this.showType_ = c3430e.m17191p();
                                    continue;
                                case 56:
                                    this.level_ = c3430e.m17197v();
                                    continue;
                                case 66:
                                    Attribute attribute = this.attribute_;
                                    Attribute.Builder builder = attribute != null ? attribute.toBuilder() : null;
                                    Attribute attribute2 = (Attribute) c3430e.m17198w(Attribute.parser(), c3433h);
                                    this.attribute_ = attribute2;
                                    if (builder != null) {
                                        builder.mergeFrom(attribute2);
                                        this.attribute_ = builder.buildPartial();
                                    } else {
                                        continue;
                                    }
                                    break;
                                case 72:
                                    this.status_ = c3430e.m17191p();
                                    continue;
                                case 80:
                                    this.createTimeInSeconds_ = c3430e.m17197v();
                                    continue;
                                case 88:
                                    this.validEndTimeInSeconds_ = c3430e.m17197v();
                                    continue;
                                case EACTags.FCP_TEMPLATE /* 98 */:
                                    this.fromUserId_ = c3430e.m17170L();
                                    continue;
                                case 104:
                                    this.placeType_ = c3430e.m17191p();
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
                        synchronized (UserLiveRight.class) {
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

        @Override // com.p1.mobile.longlink.msg.liveright.liveRight.UserLiveRightOrBuilder
        public Attribute getAttribute() {
            Attribute attribute = this.attribute_;
            return attribute == null ? Attribute.getDefaultInstance() : attribute;
        }

        @Override // com.p1.mobile.longlink.msg.liveright.liveRight.UserLiveRightOrBuilder
        public long getCreateTimeInSeconds() {
            return this.createTimeInSeconds_;
        }

        @Override // com.p1.mobile.longlink.msg.liveright.liveRight.UserLiveRightOrBuilder
        public String getFromUserId() {
            return this.fromUserId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveright.liveRight.UserLiveRightOrBuilder
        public ByteString getFromUserIdBytes() {
            return ByteString.copyFromUtf8(this.fromUserId_);
        }

        @Override // com.p1.mobile.longlink.msg.liveright.liveRight.UserLiveRightOrBuilder
        public String getId() {
            return this.id_;
        }

        @Override // com.p1.mobile.longlink.msg.liveright.liveRight.UserLiveRightOrBuilder
        public ByteString getIdBytes() {
            return ByteString.copyFromUtf8(this.id_);
        }

        @Override // com.p1.mobile.longlink.msg.liveright.liveRight.UserLiveRightOrBuilder
        public long getLevel() {
            return this.level_;
        }

        @Override // com.p1.mobile.longlink.msg.liveright.liveRight.UserLiveRightOrBuilder
        public String getLiveRightId() {
            return this.liveRightId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveright.liveRight.UserLiveRightOrBuilder
        public ByteString getLiveRightIdBytes() {
            return ByteString.copyFromUtf8(this.liveRightId_);
        }

        @Override // com.p1.mobile.longlink.msg.liveright.liveRight.UserLiveRightOrBuilder
        public String getName() {
            return this.name_;
        }

        @Override // com.p1.mobile.longlink.msg.liveright.liveRight.UserLiveRightOrBuilder
        public ByteString getNameBytes() {
            return ByteString.copyFromUtf8(this.name_);
        }

        @Override // com.p1.mobile.longlink.msg.liveright.liveRight.UserLiveRightOrBuilder
        public PlaceType getPlaceType() {
            PlaceType placeTypeForNumber = PlaceType.forNumber(this.placeType_);
            return placeTypeForNumber == null ? PlaceType.UNRECOGNIZED : placeTypeForNumber;
        }

        @Override // com.p1.mobile.longlink.msg.liveright.liveRight.UserLiveRightOrBuilder
        public int getPlaceTypeValue() {
            return this.placeType_;
        }

        @Override // com.p1.mobile.longlink.msg.liveright.liveRight.UserLiveRightOrBuilder
        public Type getRightType() {
            Type typeForNumber = Type.forNumber(this.rightType_);
            return typeForNumber == null ? Type.UNRECOGNIZED : typeForNumber;
        }

        @Override // com.p1.mobile.longlink.msg.liveright.liveRight.UserLiveRightOrBuilder
        public int getRightTypeValue() {
            return this.rightType_;
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
            if (!this.liveRightId_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(3, getLiveRightId());
            }
            if (this.rightType_ != Type.emptyType.getNumber()) {
                iM16956K += CodedOutputStream.m16977m(4, this.rightType_);
            }
            if (!this.name_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(5, getName());
            }
            if (this.showType_ != ShowType.single.getNumber()) {
                iM16956K += CodedOutputStream.m16977m(6, this.showType_);
            }
            long j = this.level_;
            if (j != 0) {
                iM16956K += CodedOutputStream.m16986v(7, j);
            }
            if (this.attribute_ != null) {
                iM16956K += CodedOutputStream.m16948C(8, getAttribute());
            }
            if (this.status_ != UserLiveRightStatus.deleted.getNumber()) {
                iM16956K += CodedOutputStream.m16977m(9, this.status_);
            }
            long j2 = this.createTimeInSeconds_;
            if (j2 != 0) {
                iM16956K += CodedOutputStream.m16986v(10, j2);
            }
            long j3 = this.validEndTimeInSeconds_;
            if (j3 != 0) {
                iM16956K += CodedOutputStream.m16986v(11, j3);
            }
            if (!this.fromUserId_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(12, getFromUserId());
            }
            if (this.placeType_ != PlaceType.videoRoom.getNumber()) {
                iM16956K += CodedOutputStream.m16977m(13, this.placeType_);
            }
            this.memoizedSerializedSize = iM16956K;
            return iM16956K;
        }

        @Override // com.p1.mobile.longlink.msg.liveright.liveRight.UserLiveRightOrBuilder
        public ShowType getShowType() {
            ShowType showTypeForNumber = ShowType.forNumber(this.showType_);
            return showTypeForNumber == null ? ShowType.UNRECOGNIZED : showTypeForNumber;
        }

        @Override // com.p1.mobile.longlink.msg.liveright.liveRight.UserLiveRightOrBuilder
        public int getShowTypeValue() {
            return this.showType_;
        }

        @Override // com.p1.mobile.longlink.msg.liveright.liveRight.UserLiveRightOrBuilder
        public UserLiveRightStatus getStatus() {
            UserLiveRightStatus userLiveRightStatusForNumber = UserLiveRightStatus.forNumber(this.status_);
            return userLiveRightStatusForNumber == null ? UserLiveRightStatus.UNRECOGNIZED : userLiveRightStatusForNumber;
        }

        @Override // com.p1.mobile.longlink.msg.liveright.liveRight.UserLiveRightOrBuilder
        public int getStatusValue() {
            return this.status_;
        }

        @Override // com.p1.mobile.longlink.msg.liveright.liveRight.UserLiveRightOrBuilder
        public String getUserId() {
            return this.userId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveright.liveRight.UserLiveRightOrBuilder
        public ByteString getUserIdBytes() {
            return ByteString.copyFromUtf8(this.userId_);
        }

        @Override // com.p1.mobile.longlink.msg.liveright.liveRight.UserLiveRightOrBuilder
        public long getValidEndTimeInSeconds() {
            return this.validEndTimeInSeconds_;
        }

        @Override // com.p1.mobile.longlink.msg.liveright.liveRight.UserLiveRightOrBuilder
        public boolean hasAttribute() {
            return this.attribute_ != null;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.id_.isEmpty()) {
                codedOutputStream.mo16994D0(1, getId());
            }
            if (!this.userId_.isEmpty()) {
                codedOutputStream.mo16994D0(2, getUserId());
            }
            if (!this.liveRightId_.isEmpty()) {
                codedOutputStream.mo16994D0(3, getLiveRightId());
            }
            if (this.rightType_ != Type.emptyType.getNumber()) {
                codedOutputStream.m17015i0(4, this.rightType_);
            }
            if (!this.name_.isEmpty()) {
                codedOutputStream.mo16994D0(5, getName());
            }
            if (this.showType_ != ShowType.single.getNumber()) {
                codedOutputStream.m17015i0(6, this.showType_);
            }
            long j = this.level_;
            if (j != 0) {
                codedOutputStream.m17027u0(7, j);
            }
            if (this.attribute_ != null) {
                codedOutputStream.mo17029w0(8, getAttribute());
            }
            if (this.status_ != UserLiveRightStatus.deleted.getNumber()) {
                codedOutputStream.m17015i0(9, this.status_);
            }
            long j2 = this.createTimeInSeconds_;
            if (j2 != 0) {
                codedOutputStream.m17027u0(10, j2);
            }
            long j3 = this.validEndTimeInSeconds_;
            if (j3 != 0) {
                codedOutputStream.m17027u0(11, j3);
            }
            if (!this.fromUserId_.isEmpty()) {
                codedOutputStream.mo16994D0(12, getFromUserId());
            }
            if (this.placeType_ != PlaceType.videoRoom.getNumber()) {
                codedOutputStream.m17015i0(13, this.placeType_);
            }
        }

        public static UserLiveRight parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (UserLiveRight) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static UserLiveRight parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (UserLiveRight) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAttribute(Attribute attribute) {
            attribute.getClass();
            this.attribute_ = attribute;
        }

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<UserLiveRight, Builder> implements UserLiveRightOrBuilder {
            private Builder() {
                super(UserLiveRight.DEFAULT_INSTANCE);
            }

            public Builder clearAttribute() {
                copyOnWrite();
                ((UserLiveRight) this.instance).clearAttribute();
                return this;
            }

            public Builder clearCreateTimeInSeconds() {
                copyOnWrite();
                ((UserLiveRight) this.instance).clearCreateTimeInSeconds();
                return this;
            }

            public Builder clearFromUserId() {
                copyOnWrite();
                ((UserLiveRight) this.instance).clearFromUserId();
                return this;
            }

            public Builder clearId() {
                copyOnWrite();
                ((UserLiveRight) this.instance).clearId();
                return this;
            }

            public Builder clearLevel() {
                copyOnWrite();
                ((UserLiveRight) this.instance).clearLevel();
                return this;
            }

            public Builder clearLiveRightId() {
                copyOnWrite();
                ((UserLiveRight) this.instance).clearLiveRightId();
                return this;
            }

            public Builder clearName() {
                copyOnWrite();
                ((UserLiveRight) this.instance).clearName();
                return this;
            }

            public Builder clearPlaceType() {
                copyOnWrite();
                ((UserLiveRight) this.instance).clearPlaceType();
                return this;
            }

            public Builder clearRightType() {
                copyOnWrite();
                ((UserLiveRight) this.instance).clearRightType();
                return this;
            }

            public Builder clearShowType() {
                copyOnWrite();
                ((UserLiveRight) this.instance).clearShowType();
                return this;
            }

            public Builder clearStatus() {
                copyOnWrite();
                ((UserLiveRight) this.instance).clearStatus();
                return this;
            }

            public Builder clearUserId() {
                copyOnWrite();
                ((UserLiveRight) this.instance).clearUserId();
                return this;
            }

            public Builder clearValidEndTimeInSeconds() {
                copyOnWrite();
                ((UserLiveRight) this.instance).clearValidEndTimeInSeconds();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveright.liveRight.UserLiveRightOrBuilder
            public Attribute getAttribute() {
                return ((UserLiveRight) this.instance).getAttribute();
            }

            @Override // com.p1.mobile.longlink.msg.liveright.liveRight.UserLiveRightOrBuilder
            public long getCreateTimeInSeconds() {
                return ((UserLiveRight) this.instance).getCreateTimeInSeconds();
            }

            @Override // com.p1.mobile.longlink.msg.liveright.liveRight.UserLiveRightOrBuilder
            public String getFromUserId() {
                return ((UserLiveRight) this.instance).getFromUserId();
            }

            @Override // com.p1.mobile.longlink.msg.liveright.liveRight.UserLiveRightOrBuilder
            public ByteString getFromUserIdBytes() {
                return ((UserLiveRight) this.instance).getFromUserIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveright.liveRight.UserLiveRightOrBuilder
            public String getId() {
                return ((UserLiveRight) this.instance).getId();
            }

            @Override // com.p1.mobile.longlink.msg.liveright.liveRight.UserLiveRightOrBuilder
            public ByteString getIdBytes() {
                return ((UserLiveRight) this.instance).getIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveright.liveRight.UserLiveRightOrBuilder
            public long getLevel() {
                return ((UserLiveRight) this.instance).getLevel();
            }

            @Override // com.p1.mobile.longlink.msg.liveright.liveRight.UserLiveRightOrBuilder
            public String getLiveRightId() {
                return ((UserLiveRight) this.instance).getLiveRightId();
            }

            @Override // com.p1.mobile.longlink.msg.liveright.liveRight.UserLiveRightOrBuilder
            public ByteString getLiveRightIdBytes() {
                return ((UserLiveRight) this.instance).getLiveRightIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveright.liveRight.UserLiveRightOrBuilder
            public String getName() {
                return ((UserLiveRight) this.instance).getName();
            }

            @Override // com.p1.mobile.longlink.msg.liveright.liveRight.UserLiveRightOrBuilder
            public ByteString getNameBytes() {
                return ((UserLiveRight) this.instance).getNameBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveright.liveRight.UserLiveRightOrBuilder
            public PlaceType getPlaceType() {
                return ((UserLiveRight) this.instance).getPlaceType();
            }

            @Override // com.p1.mobile.longlink.msg.liveright.liveRight.UserLiveRightOrBuilder
            public int getPlaceTypeValue() {
                return ((UserLiveRight) this.instance).getPlaceTypeValue();
            }

            @Override // com.p1.mobile.longlink.msg.liveright.liveRight.UserLiveRightOrBuilder
            public Type getRightType() {
                return ((UserLiveRight) this.instance).getRightType();
            }

            @Override // com.p1.mobile.longlink.msg.liveright.liveRight.UserLiveRightOrBuilder
            public int getRightTypeValue() {
                return ((UserLiveRight) this.instance).getRightTypeValue();
            }

            @Override // com.p1.mobile.longlink.msg.liveright.liveRight.UserLiveRightOrBuilder
            public ShowType getShowType() {
                return ((UserLiveRight) this.instance).getShowType();
            }

            @Override // com.p1.mobile.longlink.msg.liveright.liveRight.UserLiveRightOrBuilder
            public int getShowTypeValue() {
                return ((UserLiveRight) this.instance).getShowTypeValue();
            }

            @Override // com.p1.mobile.longlink.msg.liveright.liveRight.UserLiveRightOrBuilder
            public UserLiveRightStatus getStatus() {
                return ((UserLiveRight) this.instance).getStatus();
            }

            @Override // com.p1.mobile.longlink.msg.liveright.liveRight.UserLiveRightOrBuilder
            public int getStatusValue() {
                return ((UserLiveRight) this.instance).getStatusValue();
            }

            @Override // com.p1.mobile.longlink.msg.liveright.liveRight.UserLiveRightOrBuilder
            public String getUserId() {
                return ((UserLiveRight) this.instance).getUserId();
            }

            @Override // com.p1.mobile.longlink.msg.liveright.liveRight.UserLiveRightOrBuilder
            public ByteString getUserIdBytes() {
                return ((UserLiveRight) this.instance).getUserIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveright.liveRight.UserLiveRightOrBuilder
            public long getValidEndTimeInSeconds() {
                return ((UserLiveRight) this.instance).getValidEndTimeInSeconds();
            }

            @Override // com.p1.mobile.longlink.msg.liveright.liveRight.UserLiveRightOrBuilder
            public boolean hasAttribute() {
                return ((UserLiveRight) this.instance).hasAttribute();
            }

            public Builder mergeAttribute(Attribute attribute) {
                copyOnWrite();
                ((UserLiveRight) this.instance).mergeAttribute(attribute);
                return this;
            }

            public Builder setAttribute(Attribute attribute) {
                copyOnWrite();
                ((UserLiveRight) this.instance).setAttribute(attribute);
                return this;
            }

            public Builder setCreateTimeInSeconds(long j) {
                copyOnWrite();
                ((UserLiveRight) this.instance).setCreateTimeInSeconds(j);
                return this;
            }

            public Builder setFromUserId(String str) {
                copyOnWrite();
                ((UserLiveRight) this.instance).setFromUserId(str);
                return this;
            }

            public Builder setFromUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((UserLiveRight) this.instance).setFromUserIdBytes(byteString);
                return this;
            }

            public Builder setId(String str) {
                copyOnWrite();
                ((UserLiveRight) this.instance).setId(str);
                return this;
            }

            public Builder setIdBytes(ByteString byteString) {
                copyOnWrite();
                ((UserLiveRight) this.instance).setIdBytes(byteString);
                return this;
            }

            public Builder setLevel(long j) {
                copyOnWrite();
                ((UserLiveRight) this.instance).setLevel(j);
                return this;
            }

            public Builder setLiveRightId(String str) {
                copyOnWrite();
                ((UserLiveRight) this.instance).setLiveRightId(str);
                return this;
            }

            public Builder setLiveRightIdBytes(ByteString byteString) {
                copyOnWrite();
                ((UserLiveRight) this.instance).setLiveRightIdBytes(byteString);
                return this;
            }

            public Builder setName(String str) {
                copyOnWrite();
                ((UserLiveRight) this.instance).setName(str);
                return this;
            }

            public Builder setNameBytes(ByteString byteString) {
                copyOnWrite();
                ((UserLiveRight) this.instance).setNameBytes(byteString);
                return this;
            }

            public Builder setPlaceType(PlaceType placeType) {
                copyOnWrite();
                ((UserLiveRight) this.instance).setPlaceType(placeType);
                return this;
            }

            public Builder setPlaceTypeValue(int i) {
                copyOnWrite();
                ((UserLiveRight) this.instance).setPlaceTypeValue(i);
                return this;
            }

            public Builder setRightType(Type type) {
                copyOnWrite();
                ((UserLiveRight) this.instance).setRightType(type);
                return this;
            }

            public Builder setRightTypeValue(int i) {
                copyOnWrite();
                ((UserLiveRight) this.instance).setRightTypeValue(i);
                return this;
            }

            public Builder setShowType(ShowType showType) {
                copyOnWrite();
                ((UserLiveRight) this.instance).setShowType(showType);
                return this;
            }

            public Builder setShowTypeValue(int i) {
                copyOnWrite();
                ((UserLiveRight) this.instance).setShowTypeValue(i);
                return this;
            }

            public Builder setStatus(UserLiveRightStatus userLiveRightStatus) {
                copyOnWrite();
                ((UserLiveRight) this.instance).setStatus(userLiveRightStatus);
                return this;
            }

            public Builder setStatusValue(int i) {
                copyOnWrite();
                ((UserLiveRight) this.instance).setStatusValue(i);
                return this;
            }

            public Builder setUserId(String str) {
                copyOnWrite();
                ((UserLiveRight) this.instance).setUserId(str);
                return this;
            }

            public Builder setUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((UserLiveRight) this.instance).setUserIdBytes(byteString);
                return this;
            }

            public Builder setValidEndTimeInSeconds(long j) {
                copyOnWrite();
                ((UserLiveRight) this.instance).setValidEndTimeInSeconds(j);
                return this;
            }

            public Builder setAttribute(Attribute.Builder builder) {
                copyOnWrite();
                ((UserLiveRight) this.instance).setAttribute(builder);
                return this;
            }
        }

        public static UserLiveRight parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (UserLiveRight) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static UserLiveRight parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (UserLiveRight) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static UserLiveRight parseFrom(InputStream inputStream) throws IOException {
            return (UserLiveRight) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static UserLiveRight parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (UserLiveRight) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static UserLiveRight parseFrom(C3430e c3430e) throws IOException {
            return (UserLiveRight) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static UserLiveRight parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (UserLiveRight) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }

    public static final class UserLiveRightResources extends GeneratedMessageLite<UserLiveRightResources, Builder> implements UserLiveRightResourcesOrBuilder {
        private static final UserLiveRightResources DEFAULT_INSTANCE;
        private static volatile ng60<UserLiveRightResources> PARSER = null;
        public static final int USERLIVERIGHTS_FIELD_NUMBER = 1;
        private C3437l.h<UserLiveRight> userLiveRights_ = GeneratedMessageLite.emptyProtobufList();

        static {
            UserLiveRightResources userLiveRightResources = new UserLiveRightResources();
            DEFAULT_INSTANCE = userLiveRightResources;
            userLiveRightResources.makeImmutable();
        }

        private UserLiveRightResources() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllUserLiveRights(Iterable<? extends UserLiveRight> iterable) {
            ensureUserLiveRightsIsMutable();
            AbstractC3426a.addAll(iterable, this.userLiveRights_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addUserLiveRights(UserLiveRight.Builder builder) {
            ensureUserLiveRightsIsMutable();
            this.userLiveRights_.add(builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUserLiveRights() {
            this.userLiveRights_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureUserLiveRightsIsMutable() {
            if (this.userLiveRights_.mo17140q()) {
                return;
            }
            this.userLiveRights_ = GeneratedMessageLite.mutableCopy(this.userLiveRights_);
        }

        public static UserLiveRightResources getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(UserLiveRightResources userLiveRightResources) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(userLiveRightResources);
        }

        public static UserLiveRightResources parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (UserLiveRightResources) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static UserLiveRightResources parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (UserLiveRightResources) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<UserLiveRightResources> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeUserLiveRights(int i) {
            ensureUserLiveRightsIsMutable();
            this.userLiveRights_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserLiveRights(int i, UserLiveRight.Builder builder) {
            ensureUserLiveRightsIsMutable();
            this.userLiveRights_.set(i, builder.build());
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C46081.f16684xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new UserLiveRightResources();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.userLiveRights_.mo17139n();
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    this.userLiveRights_ = ((GeneratedMessageLite.InterfaceC3409h) obj).mo17053g(this.userLiveRights_, ((UserLiveRightResources) obj2).userLiveRights_);
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
                                    if (!this.userLiveRights_.mo17140q()) {
                                        this.userLiveRights_ = GeneratedMessageLite.mutableCopy(this.userLiveRights_);
                                    }
                                    this.userLiveRights_.add((UserLiveRight) c3430e.m17198w(UserLiveRight.parser(), c3433h));
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
                        synchronized (UserLiveRightResources.class) {
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
            int iM16948C = 0;
            for (int i2 = 0; i2 < this.userLiveRights_.size(); i2++) {
                iM16948C += CodedOutputStream.m16948C(1, this.userLiveRights_.get(i2));
            }
            this.memoizedSerializedSize = iM16948C;
            return iM16948C;
        }

        @Override // com.p1.mobile.longlink.msg.liveright.liveRight.UserLiveRightResourcesOrBuilder
        public UserLiveRight getUserLiveRights(int i) {
            return this.userLiveRights_.get(i);
        }

        @Override // com.p1.mobile.longlink.msg.liveright.liveRight.UserLiveRightResourcesOrBuilder
        public int getUserLiveRightsCount() {
            return this.userLiveRights_.size();
        }

        @Override // com.p1.mobile.longlink.msg.liveright.liveRight.UserLiveRightResourcesOrBuilder
        public List<UserLiveRight> getUserLiveRightsList() {
            return this.userLiveRights_;
        }

        public UserLiveRightOrBuilder getUserLiveRightsOrBuilder(int i) {
            return this.userLiveRights_.get(i);
        }

        public List<? extends UserLiveRightOrBuilder> getUserLiveRightsOrBuilderList() {
            return this.userLiveRights_;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            for (int i = 0; i < this.userLiveRights_.size(); i++) {
                codedOutputStream.mo17029w0(1, this.userLiveRights_.get(i));
            }
        }

        public static UserLiveRightResources parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (UserLiveRightResources) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static UserLiveRightResources parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (UserLiveRightResources) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<UserLiveRightResources, Builder> implements UserLiveRightResourcesOrBuilder {
            private Builder() {
                super(UserLiveRightResources.DEFAULT_INSTANCE);
            }

            public Builder addAllUserLiveRights(Iterable<? extends UserLiveRight> iterable) {
                copyOnWrite();
                ((UserLiveRightResources) this.instance).addAllUserLiveRights(iterable);
                return this;
            }

            public Builder addUserLiveRights(UserLiveRight userLiveRight) {
                copyOnWrite();
                ((UserLiveRightResources) this.instance).addUserLiveRights(userLiveRight);
                return this;
            }

            public Builder clearUserLiveRights() {
                copyOnWrite();
                ((UserLiveRightResources) this.instance).clearUserLiveRights();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveright.liveRight.UserLiveRightResourcesOrBuilder
            public UserLiveRight getUserLiveRights(int i) {
                return ((UserLiveRightResources) this.instance).getUserLiveRights(i);
            }

            @Override // com.p1.mobile.longlink.msg.liveright.liveRight.UserLiveRightResourcesOrBuilder
            public int getUserLiveRightsCount() {
                return ((UserLiveRightResources) this.instance).getUserLiveRightsCount();
            }

            @Override // com.p1.mobile.longlink.msg.liveright.liveRight.UserLiveRightResourcesOrBuilder
            public List<UserLiveRight> getUserLiveRightsList() {
                return Collections.unmodifiableList(((UserLiveRightResources) this.instance).getUserLiveRightsList());
            }

            public Builder removeUserLiveRights(int i) {
                copyOnWrite();
                ((UserLiveRightResources) this.instance).removeUserLiveRights(i);
                return this;
            }

            public Builder setUserLiveRights(int i, UserLiveRight userLiveRight) {
                copyOnWrite();
                ((UserLiveRightResources) this.instance).setUserLiveRights(i, userLiveRight);
                return this;
            }

            public Builder addUserLiveRights(int i, UserLiveRight userLiveRight) {
                copyOnWrite();
                ((UserLiveRightResources) this.instance).addUserLiveRights(i, userLiveRight);
                return this;
            }

            public Builder setUserLiveRights(int i, UserLiveRight.Builder builder) {
                copyOnWrite();
                ((UserLiveRightResources) this.instance).setUserLiveRights(i, builder);
                return this;
            }

            public Builder addUserLiveRights(UserLiveRight.Builder builder) {
                copyOnWrite();
                ((UserLiveRightResources) this.instance).addUserLiveRights(builder);
                return this;
            }

            public Builder addUserLiveRights(int i, UserLiveRight.Builder builder) {
                copyOnWrite();
                ((UserLiveRightResources) this.instance).addUserLiveRights(i, builder);
                return this;
            }
        }

        public static UserLiveRightResources parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (UserLiveRightResources) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static UserLiveRightResources parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (UserLiveRightResources) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static UserLiveRightResources parseFrom(InputStream inputStream) throws IOException {
            return (UserLiveRightResources) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static UserLiveRightResources parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (UserLiveRightResources) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static UserLiveRightResources parseFrom(C3430e c3430e) throws IOException {
            return (UserLiveRightResources) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addUserLiveRights(int i, UserLiveRight userLiveRight) {
            userLiveRight.getClass();
            ensureUserLiveRightsIsMutable();
            this.userLiveRights_.add(i, userLiveRight);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static UserLiveRightResources parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (UserLiveRightResources) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserLiveRights(int i, UserLiveRight userLiveRight) {
            userLiveRight.getClass();
            ensureUserLiveRightsIsMutable();
            this.userLiveRights_.set(i, userLiveRight);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addUserLiveRights(UserLiveRight userLiveRight) {
            userLiveRight.getClass();
            ensureUserLiveRightsIsMutable();
            this.userLiveRights_.add(userLiveRight);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addUserLiveRights(int i, UserLiveRight.Builder builder) {
            ensureUserLiveRightsIsMutable();
            this.userLiveRights_.add(i, builder.build());
        }
    }

    public enum UserLiveRightStatus implements C3437l.c {
        deleted(0),
        created(5),
        activated(10),
        equipped(15),
        UNRECOGNIZED(-1);

        public static final int activated_VALUE = 10;
        public static final int created_VALUE = 5;
        public static final int deleted_VALUE = 0;
        public static final int equipped_VALUE = 15;
        private static final C3437l.d<UserLiveRightStatus> internalValueMap = new C3437l.d<UserLiveRightStatus>() { // from class: com.p1.mobile.longlink.msg.liveright.liveRight.UserLiveRightStatus.1
            @Override // com.google.protobuf.C3437l.d
            public UserLiveRightStatus findValueByNumber(int i) {
                return UserLiveRightStatus.forNumber(i);
            }
        };
        private final int value;

        UserLiveRightStatus(int i) {
            this.value = i;
        }

        public static UserLiveRightStatus forNumber(int i) {
            if (i == 0) {
                return deleted;
            }
            if (i == 5) {
                return created;
            }
            if (i == 10) {
                return activated;
            }
            if (i != 15) {
                return null;
            }
            return equipped;
        }

        public static C3437l.d<UserLiveRightStatus> internalGetValueMap() {
            return internalValueMap;
        }

        @Override // com.google.protobuf.C3437l.c
        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static UserLiveRightStatus valueOf(int i) {
            return forNumber(i);
        }
    }
}
