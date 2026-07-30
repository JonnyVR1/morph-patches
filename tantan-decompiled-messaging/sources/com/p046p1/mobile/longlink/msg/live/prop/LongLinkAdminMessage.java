package com.p046p1.mobile.longlink.msg.live.prop;

import com.google.protobuf.AbstractC3403a;
import com.google.protobuf.ByteString;
import com.google.protobuf.C3407e;
import com.google.protobuf.C3410h;
import com.google.protobuf.C3414l;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InterfaceC3419q;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.io.InputStream;
import p149l.aag0;
import p149l.bz00;
import p149l.i860;
import p149l.o6z;

/* JADX INFO: loaded from: classes8.dex */
public final class LongLinkAdminMessage {

    /* JADX INFO: renamed from: com.p1.mobile.longlink.msg.live.prop.LongLinkAdminMessage$1 */
    public static /* synthetic */ class C44271 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f15949xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15949xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15949xa1df5c61[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15949xa1df5c61[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15949xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15949xa1df5c61[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15949xa1df5c61[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15949xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f15949xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public interface AvatarConfigOrBuilder extends o6z {
        @Override // p149l.o6z
        /* synthetic */ InterfaceC3419q getDefaultInstanceForType();

        PictureConfig getFrameConfig();

        boolean hasFrameConfig();

        @Override // p149l.o6z
        /* synthetic */ boolean isInitialized();
    }

    public interface LivePropSendEventOrBuilder extends o6z {
        long getAmount();

        @Override // p149l.o6z
        /* synthetic */ InterfaceC3419q getDefaultInstanceForType();

        String getFromUserId();

        ByteString getFromUserIdBytes();

        String getId();

        ByteString getIdBytes();

        String getToUserId();

        ByteString getToUserIdBytes();

        LivePropType getType();

        int getTypeValue();

        @Override // p149l.o6z
        /* synthetic */ boolean isInitialized();
    }

    public interface LivePropSendMsgOrBuilder extends o6z {
        long getAmount();

        @Override // p149l.o6z
        /* synthetic */ InterfaceC3419q getDefaultInstanceForType();

        UserMask getFromUser();

        String getIcon();

        ByteString getIconBytes();

        String getSvgaUrl();

        ByteString getSvgaUrlBytes();

        UserMask getToUser();

        LivePropType getType();

        int getTypeValue();

        boolean hasFromUser();

        boolean hasToUser();

        @Override // p149l.o6z
        /* synthetic */ boolean isInitialized();
    }

    public interface PictureConfigOrBuilder extends o6z {
        @Override // p149l.o6z
        /* synthetic */ InterfaceC3419q getDefaultInstanceForType();

        String getDynamicUrl();

        ByteString getDynamicUrlBytes();

        String getStaticUrl();

        ByteString getStaticUrlBytes();

        @Override // p149l.o6z
        /* synthetic */ boolean isInitialized();
    }

    public interface UserMaskOrBuilder extends o6z {
        String getAvatar();

        ByteString getAvatarBytes();

        AvatarConfig getAvatarConfig();

        @Override // p149l.o6z
        /* synthetic */ InterfaceC3419q getDefaultInstanceForType();

        String getName();

        ByteString getNameBytes();

        String getUserId();

        ByteString getUserIdBytes();

        VoiceMaskModeAddition getVoiceMaskModeAddition();

        boolean hasAvatarConfig();

        boolean hasVoiceMaskModeAddition();

        @Override // p149l.o6z
        /* synthetic */ boolean isInitialized();
    }

    public interface VoiceMaskModeAdditionOrBuilder extends o6z {
        String getColor();

        ByteString getColorBytes();

        @Override // p149l.o6z
        /* synthetic */ InterfaceC3419q getDefaultInstanceForType();

        String getGender();

        ByteString getGenderBytes();

        @Override // p149l.o6z
        /* synthetic */ boolean isInitialized();
    }

    private LongLinkAdminMessage() {
    }

    public static void registerAllExtensions(C3410h c3410h) {
    }

    public static final class AvatarConfig extends GeneratedMessageLite<AvatarConfig, Builder> implements AvatarConfigOrBuilder {
        private static final AvatarConfig DEFAULT_INSTANCE;
        public static final int FRAMECONFIG_FIELD_NUMBER = 1;
        private static volatile i860<AvatarConfig> PARSER;
        private PictureConfig frameConfig_;

        static {
            AvatarConfig avatarConfig = new AvatarConfig();
            DEFAULT_INSTANCE = avatarConfig;
            avatarConfig.makeImmutable();
        }

        private AvatarConfig() {
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

        public static i860<AvatarConfig> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFrameConfig(PictureConfig.Builder builder) {
            this.frameConfig_ = builder.build();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C44271.f15949xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new AvatarConfig();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    this.frameConfig_ = (PictureConfig) ((GeneratedMessageLite.InterfaceC3386h) obj).mo17006o(this.frameConfig_, ((AvatarConfig) obj2).frameConfig_);
                    GeneratedMessageLite.C3385g c3385g = GeneratedMessageLite.C3385g.INSTANCE;
                    return this;
                case 6:
                    C3407e c3407e = (C3407e) obj;
                    C3410h c3410h = (C3410h) obj2;
                    boolean z = false;
                    while (!z) {
                        try {
                            int iM17116M = c3407e.m17116M();
                            if (iM17116M != 0) {
                                if (iM17116M == 10) {
                                    PictureConfig pictureConfig = this.frameConfig_;
                                    PictureConfig.Builder builder = pictureConfig != null ? pictureConfig.toBuilder() : null;
                                    PictureConfig pictureConfig2 = (PictureConfig) c3407e.m17143w(PictureConfig.parser(), c3410h);
                                    this.frameConfig_ = pictureConfig2;
                                    if (builder != null) {
                                        builder.mergeFrom(pictureConfig2);
                                        this.frameConfig_ = builder.buildPartial();
                                    }
                                } else if (!c3407e.m17121R(iM17116M)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            aag0.m95543a(e.setUnfinishedMessage(this));
                            return null;
                        } catch (IOException e2) {
                            aag0.m95543a(new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this));
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
                                    PARSER = new GeneratedMessageLite.C3381c(DEFAULT_INSTANCE);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return PARSER;
                default:
                    bz00.m104536a();
                    return null;
            }
            return DEFAULT_INSTANCE;
        }

        @Override // com.p1.mobile.longlink.msg.live.prop.LongLinkAdminMessage.AvatarConfigOrBuilder
        public PictureConfig getFrameConfig() {
            PictureConfig pictureConfig = this.frameConfig_;
            return pictureConfig == null ? PictureConfig.getDefaultInstance() : pictureConfig;
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16893C = this.frameConfig_ != null ? CodedOutputStream.m16893C(1, getFrameConfig()) : 0;
            this.memoizedSerializedSize = iM16893C;
            return iM16893C;
        }

        @Override // com.p1.mobile.longlink.msg.live.prop.LongLinkAdminMessage.AvatarConfigOrBuilder
        public boolean hasFrameConfig() {
            return this.frameConfig_ != null;
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.frameConfig_ != null) {
                codedOutputStream.mo16974w0(1, getFrameConfig());
            }
        }

        public static AvatarConfig parseDelimitedFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (AvatarConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static AvatarConfig parseFrom(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
            return (AvatarConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3410h);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFrameConfig(PictureConfig pictureConfig) {
            pictureConfig.getClass();
            this.frameConfig_ = pictureConfig;
        }

        public static final class Builder extends GeneratedMessageLite.AbstractC3380b<AvatarConfig, Builder> implements AvatarConfigOrBuilder {
            private Builder() {
                super(AvatarConfig.DEFAULT_INSTANCE);
            }

            public Builder clearFrameConfig() {
                copyOnWrite();
                ((AvatarConfig) this.instance).clearFrameConfig();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.live.prop.LongLinkAdminMessage.AvatarConfigOrBuilder
            public PictureConfig getFrameConfig() {
                return ((AvatarConfig) this.instance).getFrameConfig();
            }

            @Override // com.p1.mobile.longlink.msg.live.prop.LongLinkAdminMessage.AvatarConfigOrBuilder
            public boolean hasFrameConfig() {
                return ((AvatarConfig) this.instance).hasFrameConfig();
            }

            public Builder mergeFrameConfig(PictureConfig pictureConfig) {
                copyOnWrite();
                ((AvatarConfig) this.instance).mergeFrameConfig(pictureConfig);
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

        public static AvatarConfig parseFrom(byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
            return (AvatarConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3410h);
        }

        public static AvatarConfig parseFrom(InputStream inputStream) throws IOException {
            return (AvatarConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AvatarConfig parseFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (AvatarConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static AvatarConfig parseFrom(C3407e c3407e) throws IOException {
            return (AvatarConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static AvatarConfig parseFrom(C3407e c3407e, C3410h c3410h) throws IOException {
            return (AvatarConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e, c3410h);
        }
    }

    public static final class LivePropSendEvent extends GeneratedMessageLite<LivePropSendEvent, Builder> implements LivePropSendEventOrBuilder {
        public static final int AMOUNT_FIELD_NUMBER = 5;
        private static final LivePropSendEvent DEFAULT_INSTANCE;
        public static final int FROMUSERID_FIELD_NUMBER = 2;
        public static final int ID_FIELD_NUMBER = 1;
        private static volatile i860<LivePropSendEvent> PARSER = null;
        public static final int TOUSERID_FIELD_NUMBER = 3;
        public static final int TYPE_FIELD_NUMBER = 4;
        private long amount_;
        private int type_;
        private String id_ = "";
        private String fromUserId_ = "";
        private String toUserId_ = "";

        public static final class Builder extends GeneratedMessageLite.AbstractC3380b<LivePropSendEvent, Builder> implements LivePropSendEventOrBuilder {
            private Builder() {
                super(LivePropSendEvent.DEFAULT_INSTANCE);
            }

            public Builder clearAmount() {
                copyOnWrite();
                ((LivePropSendEvent) this.instance).clearAmount();
                return this;
            }

            public Builder clearFromUserId() {
                copyOnWrite();
                ((LivePropSendEvent) this.instance).clearFromUserId();
                return this;
            }

            public Builder clearId() {
                copyOnWrite();
                ((LivePropSendEvent) this.instance).clearId();
                return this;
            }

            public Builder clearToUserId() {
                copyOnWrite();
                ((LivePropSendEvent) this.instance).clearToUserId();
                return this;
            }

            public Builder clearType() {
                copyOnWrite();
                ((LivePropSendEvent) this.instance).clearType();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.live.prop.LongLinkAdminMessage.LivePropSendEventOrBuilder
            public long getAmount() {
                return ((LivePropSendEvent) this.instance).getAmount();
            }

            @Override // com.p1.mobile.longlink.msg.live.prop.LongLinkAdminMessage.LivePropSendEventOrBuilder
            public String getFromUserId() {
                return ((LivePropSendEvent) this.instance).getFromUserId();
            }

            @Override // com.p1.mobile.longlink.msg.live.prop.LongLinkAdminMessage.LivePropSendEventOrBuilder
            public ByteString getFromUserIdBytes() {
                return ((LivePropSendEvent) this.instance).getFromUserIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.live.prop.LongLinkAdminMessage.LivePropSendEventOrBuilder
            public String getId() {
                return ((LivePropSendEvent) this.instance).getId();
            }

            @Override // com.p1.mobile.longlink.msg.live.prop.LongLinkAdminMessage.LivePropSendEventOrBuilder
            public ByteString getIdBytes() {
                return ((LivePropSendEvent) this.instance).getIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.live.prop.LongLinkAdminMessage.LivePropSendEventOrBuilder
            public String getToUserId() {
                return ((LivePropSendEvent) this.instance).getToUserId();
            }

            @Override // com.p1.mobile.longlink.msg.live.prop.LongLinkAdminMessage.LivePropSendEventOrBuilder
            public ByteString getToUserIdBytes() {
                return ((LivePropSendEvent) this.instance).getToUserIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.live.prop.LongLinkAdminMessage.LivePropSendEventOrBuilder
            public LivePropType getType() {
                return ((LivePropSendEvent) this.instance).getType();
            }

            @Override // com.p1.mobile.longlink.msg.live.prop.LongLinkAdminMessage.LivePropSendEventOrBuilder
            public int getTypeValue() {
                return ((LivePropSendEvent) this.instance).getTypeValue();
            }

            public Builder setAmount(long j) {
                copyOnWrite();
                ((LivePropSendEvent) this.instance).setAmount(j);
                return this;
            }

            public Builder setFromUserId(String str) {
                copyOnWrite();
                ((LivePropSendEvent) this.instance).setFromUserId(str);
                return this;
            }

            public Builder setFromUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((LivePropSendEvent) this.instance).setFromUserIdBytes(byteString);
                return this;
            }

            public Builder setId(String str) {
                copyOnWrite();
                ((LivePropSendEvent) this.instance).setId(str);
                return this;
            }

            public Builder setIdBytes(ByteString byteString) {
                copyOnWrite();
                ((LivePropSendEvent) this.instance).setIdBytes(byteString);
                return this;
            }

            public Builder setToUserId(String str) {
                copyOnWrite();
                ((LivePropSendEvent) this.instance).setToUserId(str);
                return this;
            }

            public Builder setToUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((LivePropSendEvent) this.instance).setToUserIdBytes(byteString);
                return this;
            }

            public Builder setType(LivePropType livePropType) {
                copyOnWrite();
                ((LivePropSendEvent) this.instance).setType(livePropType);
                return this;
            }

            public Builder setTypeValue(int i) {
                copyOnWrite();
                ((LivePropSendEvent) this.instance).setTypeValue(i);
                return this;
            }
        }

        static {
            LivePropSendEvent livePropSendEvent = new LivePropSendEvent();
            DEFAULT_INSTANCE = livePropSendEvent;
            livePropSendEvent.makeImmutable();
        }

        private LivePropSendEvent() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAmount() {
            this.amount_ = 0L;
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
        public void clearToUserId() {
            this.toUserId_ = getDefaultInstance().getToUserId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearType() {
            this.type_ = 0;
        }

        public static LivePropSendEvent getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(LivePropSendEvent livePropSendEvent) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(livePropSendEvent);
        }

        public static LivePropSendEvent parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (LivePropSendEvent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LivePropSendEvent parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (LivePropSendEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<LivePropSendEvent> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAmount(long j) {
            this.amount_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFromUserId(String str) {
            str.getClass();
            this.fromUserId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFromUserIdBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
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
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.id_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setToUserId(String str) {
            str.getClass();
            this.toUserId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setToUserIdBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.toUserId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setType(LivePropType livePropType) {
            livePropType.getClass();
            this.type_ = livePropType.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTypeValue(int i) {
            this.type_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C44271.f15949xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new LivePropSendEvent();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3386h interfaceC3386h = (GeneratedMessageLite.InterfaceC3386h) obj;
                    LivePropSendEvent livePropSendEvent = (LivePropSendEvent) obj2;
                    this.id_ = interfaceC3386h.mo16997f(!this.id_.isEmpty(), this.id_, !livePropSendEvent.id_.isEmpty(), livePropSendEvent.id_);
                    this.fromUserId_ = interfaceC3386h.mo16997f(!this.fromUserId_.isEmpty(), this.fromUserId_, !livePropSendEvent.fromUserId_.isEmpty(), livePropSendEvent.fromUserId_);
                    this.toUserId_ = interfaceC3386h.mo16997f(!this.toUserId_.isEmpty(), this.toUserId_, !livePropSendEvent.toUserId_.isEmpty(), livePropSendEvent.toUserId_);
                    int i = this.type_;
                    boolean z2 = i != 0;
                    int i2 = livePropSendEvent.type_;
                    this.type_ = interfaceC3386h.mo16996e(z2, i, i2 != 0, i2);
                    long j = this.amount_;
                    boolean z3 = j != 0;
                    long j2 = livePropSendEvent.amount_;
                    this.amount_ = interfaceC3386h.mo17000i(z3, j, j2 != 0, j2);
                    GeneratedMessageLite.C3385g c3385g = GeneratedMessageLite.C3385g.INSTANCE;
                    return this;
                case 6:
                    C3407e c3407e = (C3407e) obj;
                    while (!z) {
                        try {
                            int iM17116M = c3407e.m17116M();
                            if (iM17116M != 0) {
                                if (iM17116M == 10) {
                                    this.id_ = c3407e.m17115L();
                                } else if (iM17116M == 18) {
                                    this.fromUserId_ = c3407e.m17115L();
                                } else if (iM17116M == 26) {
                                    this.toUserId_ = c3407e.m17115L();
                                } else if (iM17116M == 32) {
                                    this.type_ = c3407e.m17136p();
                                } else if (iM17116M == 40) {
                                    this.amount_ = c3407e.m17142v();
                                } else if (!c3407e.m17121R(iM17116M)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            aag0.m95543a(e.setUnfinishedMessage(this));
                            return null;
                        } catch (IOException e2) {
                            aag0.m95543a(new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this));
                            return null;
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (PARSER == null) {
                        synchronized (LivePropSendEvent.class) {
                            try {
                                if (PARSER == null) {
                                    PARSER = new GeneratedMessageLite.C3381c(DEFAULT_INSTANCE);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return PARSER;
                default:
                    bz00.m104536a();
                    return null;
            }
            return DEFAULT_INSTANCE;
        }

        @Override // com.p1.mobile.longlink.msg.live.prop.LongLinkAdminMessage.LivePropSendEventOrBuilder
        public long getAmount() {
            return this.amount_;
        }

        @Override // com.p1.mobile.longlink.msg.live.prop.LongLinkAdminMessage.LivePropSendEventOrBuilder
        public String getFromUserId() {
            return this.fromUserId_;
        }

        @Override // com.p1.mobile.longlink.msg.live.prop.LongLinkAdminMessage.LivePropSendEventOrBuilder
        public ByteString getFromUserIdBytes() {
            return ByteString.copyFromUtf8(this.fromUserId_);
        }

        @Override // com.p1.mobile.longlink.msg.live.prop.LongLinkAdminMessage.LivePropSendEventOrBuilder
        public String getId() {
            return this.id_;
        }

        @Override // com.p1.mobile.longlink.msg.live.prop.LongLinkAdminMessage.LivePropSendEventOrBuilder
        public ByteString getIdBytes() {
            return ByteString.copyFromUtf8(this.id_);
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16901K = !this.id_.isEmpty() ? CodedOutputStream.m16901K(1, getId()) : 0;
            if (!this.fromUserId_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(2, getFromUserId());
            }
            if (!this.toUserId_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(3, getToUserId());
            }
            if (this.type_ != LivePropType.unknown.getNumber()) {
                iM16901K += CodedOutputStream.m16922m(4, this.type_);
            }
            long j = this.amount_;
            if (j != 0) {
                iM16901K += CodedOutputStream.m16931v(5, j);
            }
            this.memoizedSerializedSize = iM16901K;
            return iM16901K;
        }

        @Override // com.p1.mobile.longlink.msg.live.prop.LongLinkAdminMessage.LivePropSendEventOrBuilder
        public String getToUserId() {
            return this.toUserId_;
        }

        @Override // com.p1.mobile.longlink.msg.live.prop.LongLinkAdminMessage.LivePropSendEventOrBuilder
        public ByteString getToUserIdBytes() {
            return ByteString.copyFromUtf8(this.toUserId_);
        }

        @Override // com.p1.mobile.longlink.msg.live.prop.LongLinkAdminMessage.LivePropSendEventOrBuilder
        public LivePropType getType() {
            LivePropType livePropTypeForNumber = LivePropType.forNumber(this.type_);
            return livePropTypeForNumber == null ? LivePropType.UNRECOGNIZED : livePropTypeForNumber;
        }

        @Override // com.p1.mobile.longlink.msg.live.prop.LongLinkAdminMessage.LivePropSendEventOrBuilder
        public int getTypeValue() {
            return this.type_;
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.id_.isEmpty()) {
                codedOutputStream.mo16939D0(1, getId());
            }
            if (!this.fromUserId_.isEmpty()) {
                codedOutputStream.mo16939D0(2, getFromUserId());
            }
            if (!this.toUserId_.isEmpty()) {
                codedOutputStream.mo16939D0(3, getToUserId());
            }
            if (this.type_ != LivePropType.unknown.getNumber()) {
                codedOutputStream.m16960i0(4, this.type_);
            }
            long j = this.amount_;
            if (j != 0) {
                codedOutputStream.m16972u0(5, j);
            }
        }

        public static LivePropSendEvent parseDelimitedFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (LivePropSendEvent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static LivePropSendEvent parseFrom(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
            return (LivePropSendEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3410h);
        }

        public static LivePropSendEvent parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (LivePropSendEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static LivePropSendEvent parseFrom(byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
            return (LivePropSendEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3410h);
        }

        public static LivePropSendEvent parseFrom(InputStream inputStream) throws IOException {
            return (LivePropSendEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LivePropSendEvent parseFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (LivePropSendEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static LivePropSendEvent parseFrom(C3407e c3407e) throws IOException {
            return (LivePropSendEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static LivePropSendEvent parseFrom(C3407e c3407e, C3410h c3410h) throws IOException {
            return (LivePropSendEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e, c3410h);
        }
    }

    public static final class LivePropSendMsg extends GeneratedMessageLite<LivePropSendMsg, Builder> implements LivePropSendMsgOrBuilder {
        public static final int AMOUNT_FIELD_NUMBER = 4;
        private static final LivePropSendMsg DEFAULT_INSTANCE;
        public static final int FROMUSER_FIELD_NUMBER = 1;
        public static final int ICON_FIELD_NUMBER = 5;
        private static volatile i860<LivePropSendMsg> PARSER = null;
        public static final int SVGAURL_FIELD_NUMBER = 6;
        public static final int TOUSER_FIELD_NUMBER = 2;
        public static final int TYPE_FIELD_NUMBER = 3;
        private long amount_;
        private UserMask fromUser_;
        private String icon_ = "";
        private String svgaUrl_ = "";
        private UserMask toUser_;
        private int type_;

        static {
            LivePropSendMsg livePropSendMsg = new LivePropSendMsg();
            DEFAULT_INSTANCE = livePropSendMsg;
            livePropSendMsg.makeImmutable();
        }

        private LivePropSendMsg() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAmount() {
            this.amount_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFromUser() {
            this.fromUser_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIcon() {
            this.icon_ = getDefaultInstance().getIcon();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSvgaUrl() {
            this.svgaUrl_ = getDefaultInstance().getSvgaUrl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearToUser() {
            this.toUser_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearType() {
            this.type_ = 0;
        }

        public static LivePropSendMsg getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeFromUser(UserMask userMask) {
            UserMask userMask2 = this.fromUser_;
            if (userMask2 == null || userMask2 == UserMask.getDefaultInstance()) {
                this.fromUser_ = userMask;
            } else {
                this.fromUser_ = UserMask.newBuilder(this.fromUser_).mergeFrom(userMask).buildPartial();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeToUser(UserMask userMask) {
            UserMask userMask2 = this.toUser_;
            if (userMask2 == null || userMask2 == UserMask.getDefaultInstance()) {
                this.toUser_ = userMask;
            } else {
                this.toUser_ = UserMask.newBuilder(this.toUser_).mergeFrom(userMask).buildPartial();
            }
        }

        public static Builder newBuilder(LivePropSendMsg livePropSendMsg) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(livePropSendMsg);
        }

        public static LivePropSendMsg parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (LivePropSendMsg) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LivePropSendMsg parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (LivePropSendMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<LivePropSendMsg> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAmount(long j) {
            this.amount_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFromUser(UserMask.Builder builder) {
            this.fromUser_ = builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIcon(String str) {
            str.getClass();
            this.icon_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIconBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.icon_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSvgaUrl(String str) {
            str.getClass();
            this.svgaUrl_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSvgaUrlBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.svgaUrl_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setToUser(UserMask.Builder builder) {
            this.toUser_ = builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setType(LivePropType livePropType) {
            livePropType.getClass();
            this.type_ = livePropType.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTypeValue(int i) {
            this.type_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C44271.f15949xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new LivePropSendMsg();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3386h interfaceC3386h = (GeneratedMessageLite.InterfaceC3386h) obj;
                    LivePropSendMsg livePropSendMsg = (LivePropSendMsg) obj2;
                    this.fromUser_ = (UserMask) interfaceC3386h.mo17006o(this.fromUser_, livePropSendMsg.fromUser_);
                    this.toUser_ = (UserMask) interfaceC3386h.mo17006o(this.toUser_, livePropSendMsg.toUser_);
                    int i = this.type_;
                    boolean z2 = i != 0;
                    int i2 = livePropSendMsg.type_;
                    this.type_ = interfaceC3386h.mo16996e(z2, i, i2 != 0, i2);
                    long j = this.amount_;
                    boolean z3 = j != 0;
                    long j2 = livePropSendMsg.amount_;
                    this.amount_ = interfaceC3386h.mo17000i(z3, j, j2 != 0, j2);
                    this.icon_ = interfaceC3386h.mo16997f(!this.icon_.isEmpty(), this.icon_, !livePropSendMsg.icon_.isEmpty(), livePropSendMsg.icon_);
                    this.svgaUrl_ = interfaceC3386h.mo16997f(!this.svgaUrl_.isEmpty(), this.svgaUrl_, !livePropSendMsg.svgaUrl_.isEmpty(), livePropSendMsg.svgaUrl_);
                    GeneratedMessageLite.C3385g c3385g = GeneratedMessageLite.C3385g.INSTANCE;
                    return this;
                case 6:
                    C3407e c3407e = (C3407e) obj;
                    C3410h c3410h = (C3410h) obj2;
                    while (!z) {
                        try {
                            int iM17116M = c3407e.m17116M();
                            if (iM17116M != 0) {
                                if (iM17116M == 10) {
                                    UserMask userMask = this.fromUser_;
                                    UserMask.Builder builder = userMask != null ? userMask.toBuilder() : null;
                                    UserMask userMask2 = (UserMask) c3407e.m17143w(UserMask.parser(), c3410h);
                                    this.fromUser_ = userMask2;
                                    if (builder != null) {
                                        builder.mergeFrom(userMask2);
                                        this.fromUser_ = builder.buildPartial();
                                    }
                                } else if (iM17116M == 18) {
                                    UserMask userMask3 = this.toUser_;
                                    UserMask.Builder builder2 = userMask3 != null ? userMask3.toBuilder() : null;
                                    UserMask userMask4 = (UserMask) c3407e.m17143w(UserMask.parser(), c3410h);
                                    this.toUser_ = userMask4;
                                    if (builder2 != null) {
                                        builder2.mergeFrom(userMask4);
                                        this.toUser_ = builder2.buildPartial();
                                    }
                                } else if (iM17116M == 24) {
                                    this.type_ = c3407e.m17136p();
                                } else if (iM17116M == 32) {
                                    this.amount_ = c3407e.m17142v();
                                } else if (iM17116M == 42) {
                                    this.icon_ = c3407e.m17115L();
                                } else if (iM17116M == 50) {
                                    this.svgaUrl_ = c3407e.m17115L();
                                } else if (!c3407e.m17121R(iM17116M)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            aag0.m95543a(e.setUnfinishedMessage(this));
                            return null;
                        } catch (IOException e2) {
                            aag0.m95543a(new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this));
                            return null;
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (PARSER == null) {
                        synchronized (LivePropSendMsg.class) {
                            try {
                                if (PARSER == null) {
                                    PARSER = new GeneratedMessageLite.C3381c(DEFAULT_INSTANCE);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return PARSER;
                default:
                    bz00.m104536a();
                    return null;
            }
            return DEFAULT_INSTANCE;
        }

        @Override // com.p1.mobile.longlink.msg.live.prop.LongLinkAdminMessage.LivePropSendMsgOrBuilder
        public long getAmount() {
            return this.amount_;
        }

        @Override // com.p1.mobile.longlink.msg.live.prop.LongLinkAdminMessage.LivePropSendMsgOrBuilder
        public UserMask getFromUser() {
            UserMask userMask = this.fromUser_;
            return userMask == null ? UserMask.getDefaultInstance() : userMask;
        }

        @Override // com.p1.mobile.longlink.msg.live.prop.LongLinkAdminMessage.LivePropSendMsgOrBuilder
        public String getIcon() {
            return this.icon_;
        }

        @Override // com.p1.mobile.longlink.msg.live.prop.LongLinkAdminMessage.LivePropSendMsgOrBuilder
        public ByteString getIconBytes() {
            return ByteString.copyFromUtf8(this.icon_);
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16893C = this.fromUser_ != null ? CodedOutputStream.m16893C(1, getFromUser()) : 0;
            if (this.toUser_ != null) {
                iM16893C += CodedOutputStream.m16893C(2, getToUser());
            }
            if (this.type_ != LivePropType.unknown.getNumber()) {
                iM16893C += CodedOutputStream.m16922m(3, this.type_);
            }
            long j = this.amount_;
            if (j != 0) {
                iM16893C += CodedOutputStream.m16931v(4, j);
            }
            if (!this.icon_.isEmpty()) {
                iM16893C += CodedOutputStream.m16901K(5, getIcon());
            }
            if (!this.svgaUrl_.isEmpty()) {
                iM16893C += CodedOutputStream.m16901K(6, getSvgaUrl());
            }
            this.memoizedSerializedSize = iM16893C;
            return iM16893C;
        }

        @Override // com.p1.mobile.longlink.msg.live.prop.LongLinkAdminMessage.LivePropSendMsgOrBuilder
        public String getSvgaUrl() {
            return this.svgaUrl_;
        }

        @Override // com.p1.mobile.longlink.msg.live.prop.LongLinkAdminMessage.LivePropSendMsgOrBuilder
        public ByteString getSvgaUrlBytes() {
            return ByteString.copyFromUtf8(this.svgaUrl_);
        }

        @Override // com.p1.mobile.longlink.msg.live.prop.LongLinkAdminMessage.LivePropSendMsgOrBuilder
        public UserMask getToUser() {
            UserMask userMask = this.toUser_;
            return userMask == null ? UserMask.getDefaultInstance() : userMask;
        }

        @Override // com.p1.mobile.longlink.msg.live.prop.LongLinkAdminMessage.LivePropSendMsgOrBuilder
        public LivePropType getType() {
            LivePropType livePropTypeForNumber = LivePropType.forNumber(this.type_);
            return livePropTypeForNumber == null ? LivePropType.UNRECOGNIZED : livePropTypeForNumber;
        }

        @Override // com.p1.mobile.longlink.msg.live.prop.LongLinkAdminMessage.LivePropSendMsgOrBuilder
        public int getTypeValue() {
            return this.type_;
        }

        @Override // com.p1.mobile.longlink.msg.live.prop.LongLinkAdminMessage.LivePropSendMsgOrBuilder
        public boolean hasFromUser() {
            return this.fromUser_ != null;
        }

        @Override // com.p1.mobile.longlink.msg.live.prop.LongLinkAdminMessage.LivePropSendMsgOrBuilder
        public boolean hasToUser() {
            return this.toUser_ != null;
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.fromUser_ != null) {
                codedOutputStream.mo16974w0(1, getFromUser());
            }
            if (this.toUser_ != null) {
                codedOutputStream.mo16974w0(2, getToUser());
            }
            if (this.type_ != LivePropType.unknown.getNumber()) {
                codedOutputStream.m16960i0(3, this.type_);
            }
            long j = this.amount_;
            if (j != 0) {
                codedOutputStream.m16972u0(4, j);
            }
            if (!this.icon_.isEmpty()) {
                codedOutputStream.mo16939D0(5, getIcon());
            }
            if (this.svgaUrl_.isEmpty()) {
                return;
            }
            codedOutputStream.mo16939D0(6, getSvgaUrl());
        }

        public static LivePropSendMsg parseDelimitedFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (LivePropSendMsg) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static LivePropSendMsg parseFrom(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
            return (LivePropSendMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3410h);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFromUser(UserMask userMask) {
            userMask.getClass();
            this.fromUser_ = userMask;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setToUser(UserMask userMask) {
            userMask.getClass();
            this.toUser_ = userMask;
        }

        public static final class Builder extends GeneratedMessageLite.AbstractC3380b<LivePropSendMsg, Builder> implements LivePropSendMsgOrBuilder {
            private Builder() {
                super(LivePropSendMsg.DEFAULT_INSTANCE);
            }

            public Builder clearAmount() {
                copyOnWrite();
                ((LivePropSendMsg) this.instance).clearAmount();
                return this;
            }

            public Builder clearFromUser() {
                copyOnWrite();
                ((LivePropSendMsg) this.instance).clearFromUser();
                return this;
            }

            public Builder clearIcon() {
                copyOnWrite();
                ((LivePropSendMsg) this.instance).clearIcon();
                return this;
            }

            public Builder clearSvgaUrl() {
                copyOnWrite();
                ((LivePropSendMsg) this.instance).clearSvgaUrl();
                return this;
            }

            public Builder clearToUser() {
                copyOnWrite();
                ((LivePropSendMsg) this.instance).clearToUser();
                return this;
            }

            public Builder clearType() {
                copyOnWrite();
                ((LivePropSendMsg) this.instance).clearType();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.live.prop.LongLinkAdminMessage.LivePropSendMsgOrBuilder
            public long getAmount() {
                return ((LivePropSendMsg) this.instance).getAmount();
            }

            @Override // com.p1.mobile.longlink.msg.live.prop.LongLinkAdminMessage.LivePropSendMsgOrBuilder
            public UserMask getFromUser() {
                return ((LivePropSendMsg) this.instance).getFromUser();
            }

            @Override // com.p1.mobile.longlink.msg.live.prop.LongLinkAdminMessage.LivePropSendMsgOrBuilder
            public String getIcon() {
                return ((LivePropSendMsg) this.instance).getIcon();
            }

            @Override // com.p1.mobile.longlink.msg.live.prop.LongLinkAdminMessage.LivePropSendMsgOrBuilder
            public ByteString getIconBytes() {
                return ((LivePropSendMsg) this.instance).getIconBytes();
            }

            @Override // com.p1.mobile.longlink.msg.live.prop.LongLinkAdminMessage.LivePropSendMsgOrBuilder
            public String getSvgaUrl() {
                return ((LivePropSendMsg) this.instance).getSvgaUrl();
            }

            @Override // com.p1.mobile.longlink.msg.live.prop.LongLinkAdminMessage.LivePropSendMsgOrBuilder
            public ByteString getSvgaUrlBytes() {
                return ((LivePropSendMsg) this.instance).getSvgaUrlBytes();
            }

            @Override // com.p1.mobile.longlink.msg.live.prop.LongLinkAdminMessage.LivePropSendMsgOrBuilder
            public UserMask getToUser() {
                return ((LivePropSendMsg) this.instance).getToUser();
            }

            @Override // com.p1.mobile.longlink.msg.live.prop.LongLinkAdminMessage.LivePropSendMsgOrBuilder
            public LivePropType getType() {
                return ((LivePropSendMsg) this.instance).getType();
            }

            @Override // com.p1.mobile.longlink.msg.live.prop.LongLinkAdminMessage.LivePropSendMsgOrBuilder
            public int getTypeValue() {
                return ((LivePropSendMsg) this.instance).getTypeValue();
            }

            @Override // com.p1.mobile.longlink.msg.live.prop.LongLinkAdminMessage.LivePropSendMsgOrBuilder
            public boolean hasFromUser() {
                return ((LivePropSendMsg) this.instance).hasFromUser();
            }

            @Override // com.p1.mobile.longlink.msg.live.prop.LongLinkAdminMessage.LivePropSendMsgOrBuilder
            public boolean hasToUser() {
                return ((LivePropSendMsg) this.instance).hasToUser();
            }

            public Builder mergeFromUser(UserMask userMask) {
                copyOnWrite();
                ((LivePropSendMsg) this.instance).mergeFromUser(userMask);
                return this;
            }

            public Builder mergeToUser(UserMask userMask) {
                copyOnWrite();
                ((LivePropSendMsg) this.instance).mergeToUser(userMask);
                return this;
            }

            public Builder setAmount(long j) {
                copyOnWrite();
                ((LivePropSendMsg) this.instance).setAmount(j);
                return this;
            }

            public Builder setFromUser(UserMask userMask) {
                copyOnWrite();
                ((LivePropSendMsg) this.instance).setFromUser(userMask);
                return this;
            }

            public Builder setIcon(String str) {
                copyOnWrite();
                ((LivePropSendMsg) this.instance).setIcon(str);
                return this;
            }

            public Builder setIconBytes(ByteString byteString) {
                copyOnWrite();
                ((LivePropSendMsg) this.instance).setIconBytes(byteString);
                return this;
            }

            public Builder setSvgaUrl(String str) {
                copyOnWrite();
                ((LivePropSendMsg) this.instance).setSvgaUrl(str);
                return this;
            }

            public Builder setSvgaUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((LivePropSendMsg) this.instance).setSvgaUrlBytes(byteString);
                return this;
            }

            public Builder setToUser(UserMask userMask) {
                copyOnWrite();
                ((LivePropSendMsg) this.instance).setToUser(userMask);
                return this;
            }

            public Builder setType(LivePropType livePropType) {
                copyOnWrite();
                ((LivePropSendMsg) this.instance).setType(livePropType);
                return this;
            }

            public Builder setTypeValue(int i) {
                copyOnWrite();
                ((LivePropSendMsg) this.instance).setTypeValue(i);
                return this;
            }

            public Builder setFromUser(UserMask.Builder builder) {
                copyOnWrite();
                ((LivePropSendMsg) this.instance).setFromUser(builder);
                return this;
            }

            public Builder setToUser(UserMask.Builder builder) {
                copyOnWrite();
                ((LivePropSendMsg) this.instance).setToUser(builder);
                return this;
            }
        }

        public static LivePropSendMsg parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (LivePropSendMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static LivePropSendMsg parseFrom(byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
            return (LivePropSendMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3410h);
        }

        public static LivePropSendMsg parseFrom(InputStream inputStream) throws IOException {
            return (LivePropSendMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LivePropSendMsg parseFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (LivePropSendMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static LivePropSendMsg parseFrom(C3407e c3407e) throws IOException {
            return (LivePropSendMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static LivePropSendMsg parseFrom(C3407e c3407e, C3410h c3410h) throws IOException {
            return (LivePropSendMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e, c3410h);
        }
    }

    public enum LivePropType implements C3414l.c {
        unknown(0),
        littleFlame(1),
        UNRECOGNIZED(-1);

        private static final C3414l.d<LivePropType> internalValueMap = new C3414l.d<LivePropType>() { // from class: com.p1.mobile.longlink.msg.live.prop.LongLinkAdminMessage.LivePropType.1
            @Override // com.google.protobuf.C3414l.d
            public LivePropType findValueByNumber(int i) {
                return LivePropType.forNumber(i);
            }
        };
        public static final int littleFlame_VALUE = 1;
        public static final int unknown_VALUE = 0;
        private final int value;

        LivePropType(int i) {
            this.value = i;
        }

        public static LivePropType forNumber(int i) {
            if (i == 0) {
                return unknown;
            }
            if (i != 1) {
                return null;
            }
            return littleFlame;
        }

        public static C3414l.d<LivePropType> internalGetValueMap() {
            return internalValueMap;
        }

        @Override // com.google.protobuf.C3414l.c
        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static LivePropType valueOf(int i) {
            return forNumber(i);
        }
    }

    public static final class PictureConfig extends GeneratedMessageLite<PictureConfig, Builder> implements PictureConfigOrBuilder {
        private static final PictureConfig DEFAULT_INSTANCE;
        public static final int DYNAMICURL_FIELD_NUMBER = 2;
        private static volatile i860<PictureConfig> PARSER = null;
        public static final int STATICURL_FIELD_NUMBER = 1;
        private String staticUrl_ = "";
        private String dynamicUrl_ = "";

        public static final class Builder extends GeneratedMessageLite.AbstractC3380b<PictureConfig, Builder> implements PictureConfigOrBuilder {
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

            @Override // com.p1.mobile.longlink.msg.live.prop.LongLinkAdminMessage.PictureConfigOrBuilder
            public String getDynamicUrl() {
                return ((PictureConfig) this.instance).getDynamicUrl();
            }

            @Override // com.p1.mobile.longlink.msg.live.prop.LongLinkAdminMessage.PictureConfigOrBuilder
            public ByteString getDynamicUrlBytes() {
                return ((PictureConfig) this.instance).getDynamicUrlBytes();
            }

            @Override // com.p1.mobile.longlink.msg.live.prop.LongLinkAdminMessage.PictureConfigOrBuilder
            public String getStaticUrl() {
                return ((PictureConfig) this.instance).getStaticUrl();
            }

            @Override // com.p1.mobile.longlink.msg.live.prop.LongLinkAdminMessage.PictureConfigOrBuilder
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

        public static i860<PictureConfig> parser() {
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
            AbstractC3403a.checkByteStringIsUtf8(byteString);
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
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.staticUrl_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C44271.f15949xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new PictureConfig();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3386h interfaceC3386h = (GeneratedMessageLite.InterfaceC3386h) obj;
                    PictureConfig pictureConfig = (PictureConfig) obj2;
                    this.staticUrl_ = interfaceC3386h.mo16997f(!this.staticUrl_.isEmpty(), this.staticUrl_, !pictureConfig.staticUrl_.isEmpty(), pictureConfig.staticUrl_);
                    this.dynamicUrl_ = interfaceC3386h.mo16997f(!this.dynamicUrl_.isEmpty(), this.dynamicUrl_, true ^ pictureConfig.dynamicUrl_.isEmpty(), pictureConfig.dynamicUrl_);
                    GeneratedMessageLite.C3385g c3385g = GeneratedMessageLite.C3385g.INSTANCE;
                    return this;
                case 6:
                    C3407e c3407e = (C3407e) obj;
                    boolean z = false;
                    while (!z) {
                        try {
                            int iM17116M = c3407e.m17116M();
                            if (iM17116M != 0) {
                                if (iM17116M == 10) {
                                    this.staticUrl_ = c3407e.m17115L();
                                } else if (iM17116M == 18) {
                                    this.dynamicUrl_ = c3407e.m17115L();
                                } else if (!c3407e.m17121R(iM17116M)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            aag0.m95543a(e.setUnfinishedMessage(this));
                            return null;
                        } catch (IOException e2) {
                            aag0.m95543a(new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this));
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
                                    PARSER = new GeneratedMessageLite.C3381c(DEFAULT_INSTANCE);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return PARSER;
                default:
                    bz00.m104536a();
                    return null;
            }
            return DEFAULT_INSTANCE;
        }

        @Override // com.p1.mobile.longlink.msg.live.prop.LongLinkAdminMessage.PictureConfigOrBuilder
        public String getDynamicUrl() {
            return this.dynamicUrl_;
        }

        @Override // com.p1.mobile.longlink.msg.live.prop.LongLinkAdminMessage.PictureConfigOrBuilder
        public ByteString getDynamicUrlBytes() {
            return ByteString.copyFromUtf8(this.dynamicUrl_);
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16901K = !this.staticUrl_.isEmpty() ? CodedOutputStream.m16901K(1, getStaticUrl()) : 0;
            if (!this.dynamicUrl_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(2, getDynamicUrl());
            }
            this.memoizedSerializedSize = iM16901K;
            return iM16901K;
        }

        @Override // com.p1.mobile.longlink.msg.live.prop.LongLinkAdminMessage.PictureConfigOrBuilder
        public String getStaticUrl() {
            return this.staticUrl_;
        }

        @Override // com.p1.mobile.longlink.msg.live.prop.LongLinkAdminMessage.PictureConfigOrBuilder
        public ByteString getStaticUrlBytes() {
            return ByteString.copyFromUtf8(this.staticUrl_);
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.staticUrl_.isEmpty()) {
                codedOutputStream.mo16939D0(1, getStaticUrl());
            }
            if (this.dynamicUrl_.isEmpty()) {
                return;
            }
            codedOutputStream.mo16939D0(2, getDynamicUrl());
        }

        public static PictureConfig parseDelimitedFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (PictureConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static PictureConfig parseFrom(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
            return (PictureConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3410h);
        }

        public static PictureConfig parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (PictureConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static PictureConfig parseFrom(byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
            return (PictureConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3410h);
        }

        public static PictureConfig parseFrom(InputStream inputStream) throws IOException {
            return (PictureConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PictureConfig parseFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (PictureConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static PictureConfig parseFrom(C3407e c3407e) throws IOException {
            return (PictureConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static PictureConfig parseFrom(C3407e c3407e, C3410h c3410h) throws IOException {
            return (PictureConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e, c3410h);
        }
    }

    public static final class UserMask extends GeneratedMessageLite<UserMask, Builder> implements UserMaskOrBuilder {
        public static final int AVATARCONFIG_FIELD_NUMBER = 4;
        public static final int AVATAR_FIELD_NUMBER = 3;
        private static final UserMask DEFAULT_INSTANCE;
        public static final int NAME_FIELD_NUMBER = 2;
        private static volatile i860<UserMask> PARSER = null;
        public static final int USERID_FIELD_NUMBER = 1;
        public static final int VOICEMASKMODEADDITION_FIELD_NUMBER = 5;
        private AvatarConfig avatarConfig_;
        private VoiceMaskModeAddition voiceMaskModeAddition_;
        private String userId_ = "";
        private String name_ = "";
        private String avatar_ = "";

        static {
            UserMask userMask = new UserMask();
            DEFAULT_INSTANCE = userMask;
            userMask.makeImmutable();
        }

        private UserMask() {
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
        public void clearName() {
            this.name_ = getDefaultInstance().getName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUserId() {
            this.userId_ = getDefaultInstance().getUserId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVoiceMaskModeAddition() {
            this.voiceMaskModeAddition_ = null;
        }

        public static UserMask getDefaultInstance() {
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
        public void mergeVoiceMaskModeAddition(VoiceMaskModeAddition voiceMaskModeAddition) {
            VoiceMaskModeAddition voiceMaskModeAddition2 = this.voiceMaskModeAddition_;
            if (voiceMaskModeAddition2 == null || voiceMaskModeAddition2 == VoiceMaskModeAddition.getDefaultInstance()) {
                this.voiceMaskModeAddition_ = voiceMaskModeAddition;
            } else {
                this.voiceMaskModeAddition_ = VoiceMaskModeAddition.newBuilder(this.voiceMaskModeAddition_).mergeFrom(voiceMaskModeAddition).buildPartial();
            }
        }

        public static Builder newBuilder(UserMask userMask) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(userMask);
        }

        public static UserMask parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (UserMask) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static UserMask parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (UserMask) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<UserMask> parser() {
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
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.avatar_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAvatarConfig(AvatarConfig.Builder builder) {
            this.avatarConfig_ = builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setName(String str) {
            str.getClass();
            this.name_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNameBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
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
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.userId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVoiceMaskModeAddition(VoiceMaskModeAddition.Builder builder) {
            this.voiceMaskModeAddition_ = builder.build();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C44271.f15949xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new UserMask();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3386h interfaceC3386h = (GeneratedMessageLite.InterfaceC3386h) obj;
                    UserMask userMask = (UserMask) obj2;
                    this.userId_ = interfaceC3386h.mo16997f(!this.userId_.isEmpty(), this.userId_, !userMask.userId_.isEmpty(), userMask.userId_);
                    this.name_ = interfaceC3386h.mo16997f(!this.name_.isEmpty(), this.name_, !userMask.name_.isEmpty(), userMask.name_);
                    this.avatar_ = interfaceC3386h.mo16997f(!this.avatar_.isEmpty(), this.avatar_, true ^ userMask.avatar_.isEmpty(), userMask.avatar_);
                    this.avatarConfig_ = (AvatarConfig) interfaceC3386h.mo17006o(this.avatarConfig_, userMask.avatarConfig_);
                    this.voiceMaskModeAddition_ = (VoiceMaskModeAddition) interfaceC3386h.mo17006o(this.voiceMaskModeAddition_, userMask.voiceMaskModeAddition_);
                    GeneratedMessageLite.C3385g c3385g = GeneratedMessageLite.C3385g.INSTANCE;
                    return this;
                case 6:
                    C3407e c3407e = (C3407e) obj;
                    C3410h c3410h = (C3410h) obj2;
                    boolean z = false;
                    while (!z) {
                        try {
                            int iM17116M = c3407e.m17116M();
                            if (iM17116M != 0) {
                                if (iM17116M == 10) {
                                    this.userId_ = c3407e.m17115L();
                                } else if (iM17116M == 18) {
                                    this.name_ = c3407e.m17115L();
                                } else if (iM17116M == 26) {
                                    this.avatar_ = c3407e.m17115L();
                                } else if (iM17116M == 34) {
                                    AvatarConfig avatarConfig = this.avatarConfig_;
                                    AvatarConfig.Builder builder = avatarConfig != null ? avatarConfig.toBuilder() : null;
                                    AvatarConfig avatarConfig2 = (AvatarConfig) c3407e.m17143w(AvatarConfig.parser(), c3410h);
                                    this.avatarConfig_ = avatarConfig2;
                                    if (builder != null) {
                                        builder.mergeFrom(avatarConfig2);
                                        this.avatarConfig_ = builder.buildPartial();
                                    }
                                } else if (iM17116M == 42) {
                                    VoiceMaskModeAddition voiceMaskModeAddition = this.voiceMaskModeAddition_;
                                    VoiceMaskModeAddition.Builder builder2 = voiceMaskModeAddition != null ? voiceMaskModeAddition.toBuilder() : null;
                                    VoiceMaskModeAddition voiceMaskModeAddition2 = (VoiceMaskModeAddition) c3407e.m17143w(VoiceMaskModeAddition.parser(), c3410h);
                                    this.voiceMaskModeAddition_ = voiceMaskModeAddition2;
                                    if (builder2 != null) {
                                        builder2.mergeFrom(voiceMaskModeAddition2);
                                        this.voiceMaskModeAddition_ = builder2.buildPartial();
                                    }
                                } else if (!c3407e.m17121R(iM17116M)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            aag0.m95543a(e.setUnfinishedMessage(this));
                            return null;
                        } catch (IOException e2) {
                            aag0.m95543a(new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this));
                            return null;
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (PARSER == null) {
                        synchronized (UserMask.class) {
                            try {
                                if (PARSER == null) {
                                    PARSER = new GeneratedMessageLite.C3381c(DEFAULT_INSTANCE);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return PARSER;
                default:
                    bz00.m104536a();
                    return null;
            }
            return DEFAULT_INSTANCE;
        }

        @Override // com.p1.mobile.longlink.msg.live.prop.LongLinkAdminMessage.UserMaskOrBuilder
        public String getAvatar() {
            return this.avatar_;
        }

        @Override // com.p1.mobile.longlink.msg.live.prop.LongLinkAdminMessage.UserMaskOrBuilder
        public ByteString getAvatarBytes() {
            return ByteString.copyFromUtf8(this.avatar_);
        }

        @Override // com.p1.mobile.longlink.msg.live.prop.LongLinkAdminMessage.UserMaskOrBuilder
        public AvatarConfig getAvatarConfig() {
            AvatarConfig avatarConfig = this.avatarConfig_;
            return avatarConfig == null ? AvatarConfig.getDefaultInstance() : avatarConfig;
        }

        @Override // com.p1.mobile.longlink.msg.live.prop.LongLinkAdminMessage.UserMaskOrBuilder
        public String getName() {
            return this.name_;
        }

        @Override // com.p1.mobile.longlink.msg.live.prop.LongLinkAdminMessage.UserMaskOrBuilder
        public ByteString getNameBytes() {
            return ByteString.copyFromUtf8(this.name_);
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16901K = !this.userId_.isEmpty() ? CodedOutputStream.m16901K(1, getUserId()) : 0;
            if (!this.name_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(2, getName());
            }
            if (!this.avatar_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(3, getAvatar());
            }
            if (this.avatarConfig_ != null) {
                iM16901K += CodedOutputStream.m16893C(4, getAvatarConfig());
            }
            if (this.voiceMaskModeAddition_ != null) {
                iM16901K += CodedOutputStream.m16893C(5, getVoiceMaskModeAddition());
            }
            this.memoizedSerializedSize = iM16901K;
            return iM16901K;
        }

        @Override // com.p1.mobile.longlink.msg.live.prop.LongLinkAdminMessage.UserMaskOrBuilder
        public String getUserId() {
            return this.userId_;
        }

        @Override // com.p1.mobile.longlink.msg.live.prop.LongLinkAdminMessage.UserMaskOrBuilder
        public ByteString getUserIdBytes() {
            return ByteString.copyFromUtf8(this.userId_);
        }

        @Override // com.p1.mobile.longlink.msg.live.prop.LongLinkAdminMessage.UserMaskOrBuilder
        public VoiceMaskModeAddition getVoiceMaskModeAddition() {
            VoiceMaskModeAddition voiceMaskModeAddition = this.voiceMaskModeAddition_;
            return voiceMaskModeAddition == null ? VoiceMaskModeAddition.getDefaultInstance() : voiceMaskModeAddition;
        }

        @Override // com.p1.mobile.longlink.msg.live.prop.LongLinkAdminMessage.UserMaskOrBuilder
        public boolean hasAvatarConfig() {
            return this.avatarConfig_ != null;
        }

        @Override // com.p1.mobile.longlink.msg.live.prop.LongLinkAdminMessage.UserMaskOrBuilder
        public boolean hasVoiceMaskModeAddition() {
            return this.voiceMaskModeAddition_ != null;
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.userId_.isEmpty()) {
                codedOutputStream.mo16939D0(1, getUserId());
            }
            if (!this.name_.isEmpty()) {
                codedOutputStream.mo16939D0(2, getName());
            }
            if (!this.avatar_.isEmpty()) {
                codedOutputStream.mo16939D0(3, getAvatar());
            }
            if (this.avatarConfig_ != null) {
                codedOutputStream.mo16974w0(4, getAvatarConfig());
            }
            if (this.voiceMaskModeAddition_ != null) {
                codedOutputStream.mo16974w0(5, getVoiceMaskModeAddition());
            }
        }

        public static UserMask parseDelimitedFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (UserMask) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static UserMask parseFrom(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
            return (UserMask) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3410h);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAvatarConfig(AvatarConfig avatarConfig) {
            avatarConfig.getClass();
            this.avatarConfig_ = avatarConfig;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVoiceMaskModeAddition(VoiceMaskModeAddition voiceMaskModeAddition) {
            voiceMaskModeAddition.getClass();
            this.voiceMaskModeAddition_ = voiceMaskModeAddition;
        }

        public static final class Builder extends GeneratedMessageLite.AbstractC3380b<UserMask, Builder> implements UserMaskOrBuilder {
            private Builder() {
                super(UserMask.DEFAULT_INSTANCE);
            }

            public Builder clearAvatar() {
                copyOnWrite();
                ((UserMask) this.instance).clearAvatar();
                return this;
            }

            public Builder clearAvatarConfig() {
                copyOnWrite();
                ((UserMask) this.instance).clearAvatarConfig();
                return this;
            }

            public Builder clearName() {
                copyOnWrite();
                ((UserMask) this.instance).clearName();
                return this;
            }

            public Builder clearUserId() {
                copyOnWrite();
                ((UserMask) this.instance).clearUserId();
                return this;
            }

            public Builder clearVoiceMaskModeAddition() {
                copyOnWrite();
                ((UserMask) this.instance).clearVoiceMaskModeAddition();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.live.prop.LongLinkAdminMessage.UserMaskOrBuilder
            public String getAvatar() {
                return ((UserMask) this.instance).getAvatar();
            }

            @Override // com.p1.mobile.longlink.msg.live.prop.LongLinkAdminMessage.UserMaskOrBuilder
            public ByteString getAvatarBytes() {
                return ((UserMask) this.instance).getAvatarBytes();
            }

            @Override // com.p1.mobile.longlink.msg.live.prop.LongLinkAdminMessage.UserMaskOrBuilder
            public AvatarConfig getAvatarConfig() {
                return ((UserMask) this.instance).getAvatarConfig();
            }

            @Override // com.p1.mobile.longlink.msg.live.prop.LongLinkAdminMessage.UserMaskOrBuilder
            public String getName() {
                return ((UserMask) this.instance).getName();
            }

            @Override // com.p1.mobile.longlink.msg.live.prop.LongLinkAdminMessage.UserMaskOrBuilder
            public ByteString getNameBytes() {
                return ((UserMask) this.instance).getNameBytes();
            }

            @Override // com.p1.mobile.longlink.msg.live.prop.LongLinkAdminMessage.UserMaskOrBuilder
            public String getUserId() {
                return ((UserMask) this.instance).getUserId();
            }

            @Override // com.p1.mobile.longlink.msg.live.prop.LongLinkAdminMessage.UserMaskOrBuilder
            public ByteString getUserIdBytes() {
                return ((UserMask) this.instance).getUserIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.live.prop.LongLinkAdminMessage.UserMaskOrBuilder
            public VoiceMaskModeAddition getVoiceMaskModeAddition() {
                return ((UserMask) this.instance).getVoiceMaskModeAddition();
            }

            @Override // com.p1.mobile.longlink.msg.live.prop.LongLinkAdminMessage.UserMaskOrBuilder
            public boolean hasAvatarConfig() {
                return ((UserMask) this.instance).hasAvatarConfig();
            }

            @Override // com.p1.mobile.longlink.msg.live.prop.LongLinkAdminMessage.UserMaskOrBuilder
            public boolean hasVoiceMaskModeAddition() {
                return ((UserMask) this.instance).hasVoiceMaskModeAddition();
            }

            public Builder mergeAvatarConfig(AvatarConfig avatarConfig) {
                copyOnWrite();
                ((UserMask) this.instance).mergeAvatarConfig(avatarConfig);
                return this;
            }

            public Builder mergeVoiceMaskModeAddition(VoiceMaskModeAddition voiceMaskModeAddition) {
                copyOnWrite();
                ((UserMask) this.instance).mergeVoiceMaskModeAddition(voiceMaskModeAddition);
                return this;
            }

            public Builder setAvatar(String str) {
                copyOnWrite();
                ((UserMask) this.instance).setAvatar(str);
                return this;
            }

            public Builder setAvatarBytes(ByteString byteString) {
                copyOnWrite();
                ((UserMask) this.instance).setAvatarBytes(byteString);
                return this;
            }

            public Builder setAvatarConfig(AvatarConfig avatarConfig) {
                copyOnWrite();
                ((UserMask) this.instance).setAvatarConfig(avatarConfig);
                return this;
            }

            public Builder setName(String str) {
                copyOnWrite();
                ((UserMask) this.instance).setName(str);
                return this;
            }

            public Builder setNameBytes(ByteString byteString) {
                copyOnWrite();
                ((UserMask) this.instance).setNameBytes(byteString);
                return this;
            }

            public Builder setUserId(String str) {
                copyOnWrite();
                ((UserMask) this.instance).setUserId(str);
                return this;
            }

            public Builder setUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((UserMask) this.instance).setUserIdBytes(byteString);
                return this;
            }

            public Builder setVoiceMaskModeAddition(VoiceMaskModeAddition voiceMaskModeAddition) {
                copyOnWrite();
                ((UserMask) this.instance).setVoiceMaskModeAddition(voiceMaskModeAddition);
                return this;
            }

            public Builder setAvatarConfig(AvatarConfig.Builder builder) {
                copyOnWrite();
                ((UserMask) this.instance).setAvatarConfig(builder);
                return this;
            }

            public Builder setVoiceMaskModeAddition(VoiceMaskModeAddition.Builder builder) {
                copyOnWrite();
                ((UserMask) this.instance).setVoiceMaskModeAddition(builder);
                return this;
            }
        }

        public static UserMask parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (UserMask) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static UserMask parseFrom(byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
            return (UserMask) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3410h);
        }

        public static UserMask parseFrom(InputStream inputStream) throws IOException {
            return (UserMask) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static UserMask parseFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (UserMask) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static UserMask parseFrom(C3407e c3407e) throws IOException {
            return (UserMask) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static UserMask parseFrom(C3407e c3407e, C3410h c3410h) throws IOException {
            return (UserMask) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e, c3410h);
        }
    }

    public static final class VoiceMaskModeAddition extends GeneratedMessageLite<VoiceMaskModeAddition, Builder> implements VoiceMaskModeAdditionOrBuilder {
        public static final int COLOR_FIELD_NUMBER = 1;
        private static final VoiceMaskModeAddition DEFAULT_INSTANCE;
        public static final int GENDER_FIELD_NUMBER = 2;
        private static volatile i860<VoiceMaskModeAddition> PARSER;
        private String color_ = "";
        private String gender_ = "";

        public static final class Builder extends GeneratedMessageLite.AbstractC3380b<VoiceMaskModeAddition, Builder> implements VoiceMaskModeAdditionOrBuilder {
            private Builder() {
                super(VoiceMaskModeAddition.DEFAULT_INSTANCE);
            }

            public Builder clearColor() {
                copyOnWrite();
                ((VoiceMaskModeAddition) this.instance).clearColor();
                return this;
            }

            public Builder clearGender() {
                copyOnWrite();
                ((VoiceMaskModeAddition) this.instance).clearGender();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.live.prop.LongLinkAdminMessage.VoiceMaskModeAdditionOrBuilder
            public String getColor() {
                return ((VoiceMaskModeAddition) this.instance).getColor();
            }

            @Override // com.p1.mobile.longlink.msg.live.prop.LongLinkAdminMessage.VoiceMaskModeAdditionOrBuilder
            public ByteString getColorBytes() {
                return ((VoiceMaskModeAddition) this.instance).getColorBytes();
            }

            @Override // com.p1.mobile.longlink.msg.live.prop.LongLinkAdminMessage.VoiceMaskModeAdditionOrBuilder
            public String getGender() {
                return ((VoiceMaskModeAddition) this.instance).getGender();
            }

            @Override // com.p1.mobile.longlink.msg.live.prop.LongLinkAdminMessage.VoiceMaskModeAdditionOrBuilder
            public ByteString getGenderBytes() {
                return ((VoiceMaskModeAddition) this.instance).getGenderBytes();
            }

            public Builder setColor(String str) {
                copyOnWrite();
                ((VoiceMaskModeAddition) this.instance).setColor(str);
                return this;
            }

            public Builder setColorBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceMaskModeAddition) this.instance).setColorBytes(byteString);
                return this;
            }

            public Builder setGender(String str) {
                copyOnWrite();
                ((VoiceMaskModeAddition) this.instance).setGender(str);
                return this;
            }

            public Builder setGenderBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceMaskModeAddition) this.instance).setGenderBytes(byteString);
                return this;
            }
        }

        static {
            VoiceMaskModeAddition voiceMaskModeAddition = new VoiceMaskModeAddition();
            DEFAULT_INSTANCE = voiceMaskModeAddition;
            voiceMaskModeAddition.makeImmutable();
        }

        private VoiceMaskModeAddition() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearColor() {
            this.color_ = getDefaultInstance().getColor();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGender() {
            this.gender_ = getDefaultInstance().getGender();
        }

        public static VoiceMaskModeAddition getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(VoiceMaskModeAddition voiceMaskModeAddition) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(voiceMaskModeAddition);
        }

        public static VoiceMaskModeAddition parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VoiceMaskModeAddition) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceMaskModeAddition parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VoiceMaskModeAddition) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<VoiceMaskModeAddition> parser() {
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
            AbstractC3403a.checkByteStringIsUtf8(byteString);
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
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.gender_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C44271.f15949xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoiceMaskModeAddition();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3386h interfaceC3386h = (GeneratedMessageLite.InterfaceC3386h) obj;
                    VoiceMaskModeAddition voiceMaskModeAddition = (VoiceMaskModeAddition) obj2;
                    this.color_ = interfaceC3386h.mo16997f(!this.color_.isEmpty(), this.color_, !voiceMaskModeAddition.color_.isEmpty(), voiceMaskModeAddition.color_);
                    this.gender_ = interfaceC3386h.mo16997f(!this.gender_.isEmpty(), this.gender_, true ^ voiceMaskModeAddition.gender_.isEmpty(), voiceMaskModeAddition.gender_);
                    GeneratedMessageLite.C3385g c3385g = GeneratedMessageLite.C3385g.INSTANCE;
                    return this;
                case 6:
                    C3407e c3407e = (C3407e) obj;
                    boolean z = false;
                    while (!z) {
                        try {
                            int iM17116M = c3407e.m17116M();
                            if (iM17116M != 0) {
                                if (iM17116M == 10) {
                                    this.color_ = c3407e.m17115L();
                                } else if (iM17116M == 18) {
                                    this.gender_ = c3407e.m17115L();
                                } else if (!c3407e.m17121R(iM17116M)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            aag0.m95543a(e.setUnfinishedMessage(this));
                            return null;
                        } catch (IOException e2) {
                            aag0.m95543a(new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this));
                            return null;
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (PARSER == null) {
                        synchronized (VoiceMaskModeAddition.class) {
                            try {
                                if (PARSER == null) {
                                    PARSER = new GeneratedMessageLite.C3381c(DEFAULT_INSTANCE);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return PARSER;
                default:
                    bz00.m104536a();
                    return null;
            }
            return DEFAULT_INSTANCE;
        }

        @Override // com.p1.mobile.longlink.msg.live.prop.LongLinkAdminMessage.VoiceMaskModeAdditionOrBuilder
        public String getColor() {
            return this.color_;
        }

        @Override // com.p1.mobile.longlink.msg.live.prop.LongLinkAdminMessage.VoiceMaskModeAdditionOrBuilder
        public ByteString getColorBytes() {
            return ByteString.copyFromUtf8(this.color_);
        }

        @Override // com.p1.mobile.longlink.msg.live.prop.LongLinkAdminMessage.VoiceMaskModeAdditionOrBuilder
        public String getGender() {
            return this.gender_;
        }

        @Override // com.p1.mobile.longlink.msg.live.prop.LongLinkAdminMessage.VoiceMaskModeAdditionOrBuilder
        public ByteString getGenderBytes() {
            return ByteString.copyFromUtf8(this.gender_);
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16901K = !this.color_.isEmpty() ? CodedOutputStream.m16901K(1, getColor()) : 0;
            if (!this.gender_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(2, getGender());
            }
            this.memoizedSerializedSize = iM16901K;
            return iM16901K;
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.color_.isEmpty()) {
                codedOutputStream.mo16939D0(1, getColor());
            }
            if (this.gender_.isEmpty()) {
                return;
            }
            codedOutputStream.mo16939D0(2, getGender());
        }

        public static VoiceMaskModeAddition parseDelimitedFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (VoiceMaskModeAddition) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static VoiceMaskModeAddition parseFrom(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
            return (VoiceMaskModeAddition) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3410h);
        }

        public static VoiceMaskModeAddition parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoiceMaskModeAddition) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoiceMaskModeAddition parseFrom(byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
            return (VoiceMaskModeAddition) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3410h);
        }

        public static VoiceMaskModeAddition parseFrom(InputStream inputStream) throws IOException {
            return (VoiceMaskModeAddition) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceMaskModeAddition parseFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (VoiceMaskModeAddition) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static VoiceMaskModeAddition parseFrom(C3407e c3407e) throws IOException {
            return (VoiceMaskModeAddition) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static VoiceMaskModeAddition parseFrom(C3407e c3407e, C3410h c3410h) throws IOException {
            return (VoiceMaskModeAddition) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e, c3410h);
        }
    }
}
