package com.p046p1.mobile.longlink.msg.live.intl.giftleaderboard;

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
import java.util.Collections;
import java.util.List;
import p149l.aag0;
import p149l.bz00;
import p149l.i860;
import p149l.o6z;

/* JADX INFO: loaded from: classes8.dex */
public final class LongLinkLiveIntlGiftLeaderboard {

    /* JADX INFO: renamed from: com.p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard$1 */
    public static /* synthetic */ class C44231 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f15946xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15946xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15946xa1df5c61[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15946xa1df5c61[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15946xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15946xa1df5c61[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15946xa1df5c61[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15946xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f15946xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public interface GiftLeaderboardConfigOrBuilder extends o6z {
        @Override // p149l.o6z
        /* synthetic */ InterfaceC3419q getDefaultInstanceForType();

        long getPollingIntervalInSeconds();

        long getScrollIntervalInSeconds();

        @Override // p149l.o6z
        /* synthetic */ boolean isInitialized();
    }

    public interface GiftLeaderboardItemOrBuilder extends o6z {
        long getAmount();

        @Override // p149l.o6z
        /* synthetic */ InterfaceC3419q getDefaultInstanceForType();

        long getGap();

        String getGiftIcon();

        ByteString getGiftIconBytes();

        String getGiftId();

        ByteString getGiftIdBytes();

        String getName();

        ByteString getNameBytes();

        long getRank();

        @Override // p149l.o6z
        /* synthetic */ boolean isInitialized();
    }

    public interface GiftLeaderboardOrBuilder extends o6z {
        GiftLeaderboardConfig getConfig();

        GiftLeaderboardItem getCurrent(int i);

        int getCurrentCount();

        List<GiftLeaderboardItem> getCurrentList();

        @Override // p149l.o6z
        /* synthetic */ InterfaceC3419q getDefaultInstanceForType();

        boolean getHomeStretch();

        String getJumpUrl();

        ByteString getJumpUrlBytes();

        boolean getOpen();

        boolean hasConfig();

        @Override // p149l.o6z
        /* synthetic */ boolean isInitialized();
    }

    public interface GiftLeaderboardTopEffectOrBuilder extends o6z {
        String getBackgroundSvgaUrl();

        ByteString getBackgroundSvgaUrlBytes();

        String getBackgroundUrl();

        ByteString getBackgroundUrlBytes();

        @Override // p149l.o6z
        /* synthetic */ InterfaceC3419q getDefaultInstanceForType();

        long getDuration();

        String getEffectBackgroundUrl();

        ByteString getEffectBackgroundUrlBytes();

        String getEndBackendColor();

        ByteString getEndBackendColorBytes();

        String getRoomId();

        ByteString getRoomIdBytes();

        String getStartBackendColor();

        ByteString getStartBackendColorBytes();

        TemplateData getTemplate();

        boolean hasTemplate();

        @Override // p149l.o6z
        /* synthetic */ boolean isInitialized();
    }

    public interface TemplateDataOrBuilder extends o6z {
        @Override // p149l.o6z
        /* synthetic */ InterfaceC3419q getDefaultInstanceForType();

        String getFields(int i);

        ByteString getFieldsBytes(int i);

        int getFieldsCount();

        List<String> getFieldsList();

        int getId();

        @Override // p149l.o6z
        /* synthetic */ boolean isInitialized();
    }

    private LongLinkLiveIntlGiftLeaderboard() {
    }

    public static void registerAllExtensions(C3410h c3410h) {
    }

    public static final class GiftLeaderboard extends GeneratedMessageLite<GiftLeaderboard, Builder> implements GiftLeaderboardOrBuilder {
        public static final int CONFIG_FIELD_NUMBER = 3;
        public static final int CURRENT_FIELD_NUMBER = 4;
        private static final GiftLeaderboard DEFAULT_INSTANCE;
        public static final int HOMESTRETCH_FIELD_NUMBER = 2;
        public static final int JUMPURL_FIELD_NUMBER = 5;
        public static final int OPEN_FIELD_NUMBER = 1;
        private static volatile i860<GiftLeaderboard> PARSER;
        private int bitField0_;
        private GiftLeaderboardConfig config_;
        private boolean homeStretch_;
        private boolean open_;
        private C3414l.h<GiftLeaderboardItem> current_ = GeneratedMessageLite.emptyProtobufList();
        private String jumpUrl_ = "";

        static {
            GiftLeaderboard giftLeaderboard = new GiftLeaderboard();
            DEFAULT_INSTANCE = giftLeaderboard;
            giftLeaderboard.makeImmutable();
        }

        private GiftLeaderboard() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllCurrent(Iterable<? extends GiftLeaderboardItem> iterable) {
            ensureCurrentIsMutable();
            AbstractC3403a.addAll(iterable, this.current_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addCurrent(GiftLeaderboardItem.Builder builder) {
            ensureCurrentIsMutable();
            this.current_.add(builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearConfig() {
            this.config_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCurrent() {
            this.current_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHomeStretch() {
            this.homeStretch_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearJumpUrl() {
            this.jumpUrl_ = getDefaultInstance().getJumpUrl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOpen() {
            this.open_ = false;
        }

        private void ensureCurrentIsMutable() {
            if (this.current_.mo17085q()) {
                return;
            }
            this.current_ = GeneratedMessageLite.mutableCopy(this.current_);
        }

        public static GiftLeaderboard getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeConfig(GiftLeaderboardConfig giftLeaderboardConfig) {
            GiftLeaderboardConfig giftLeaderboardConfig2 = this.config_;
            if (giftLeaderboardConfig2 == null || giftLeaderboardConfig2 == GiftLeaderboardConfig.getDefaultInstance()) {
                this.config_ = giftLeaderboardConfig;
            } else {
                this.config_ = GiftLeaderboardConfig.newBuilder(this.config_).mergeFrom(giftLeaderboardConfig).buildPartial();
            }
        }

        public static Builder newBuilder(GiftLeaderboard giftLeaderboard) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(giftLeaderboard);
        }

        public static GiftLeaderboard parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (GiftLeaderboard) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GiftLeaderboard parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (GiftLeaderboard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<GiftLeaderboard> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeCurrent(int i) {
            ensureCurrentIsMutable();
            this.current_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setConfig(GiftLeaderboardConfig.Builder builder) {
            this.config_ = builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCurrent(int i, GiftLeaderboardItem.Builder builder) {
            ensureCurrentIsMutable();
            this.current_.set(i, builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHomeStretch(boolean z) {
            this.homeStretch_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setJumpUrl(String str) {
            str.getClass();
            this.jumpUrl_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setJumpUrlBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.jumpUrl_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOpen(boolean z) {
            this.open_ = z;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C44231.f15946xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new GiftLeaderboard();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.current_.mo17084n();
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3386h interfaceC3386h = (GeneratedMessageLite.InterfaceC3386h) obj;
                    GiftLeaderboard giftLeaderboard = (GiftLeaderboard) obj2;
                    boolean z = this.open_;
                    boolean z2 = giftLeaderboard.open_;
                    this.open_ = interfaceC3386h.mo16995d(z, z, z2, z2);
                    boolean z3 = this.homeStretch_;
                    boolean z4 = giftLeaderboard.homeStretch_;
                    this.homeStretch_ = interfaceC3386h.mo16995d(z3, z3, z4, z4);
                    this.config_ = (GiftLeaderboardConfig) interfaceC3386h.mo17006o(this.config_, giftLeaderboard.config_);
                    this.current_ = interfaceC3386h.mo16998g(this.current_, giftLeaderboard.current_);
                    this.jumpUrl_ = interfaceC3386h.mo16997f(!this.jumpUrl_.isEmpty(), this.jumpUrl_, true ^ giftLeaderboard.jumpUrl_.isEmpty(), giftLeaderboard.jumpUrl_);
                    if (interfaceC3386h == GeneratedMessageLite.C3385g.INSTANCE) {
                        this.bitField0_ |= giftLeaderboard.bitField0_;
                    }
                    return this;
                case 6:
                    C3407e c3407e = (C3407e) obj;
                    C3410h c3410h = (C3410h) obj2;
                    boolean z5 = false;
                    while (!z5) {
                        try {
                            int iM17116M = c3407e.m17116M();
                            if (iM17116M != 0) {
                                if (iM17116M == 8) {
                                    this.open_ = c3407e.m17133m();
                                } else if (iM17116M == 16) {
                                    this.homeStretch_ = c3407e.m17133m();
                                } else if (iM17116M == 26) {
                                    GiftLeaderboardConfig giftLeaderboardConfig = this.config_;
                                    GiftLeaderboardConfig.Builder builder = giftLeaderboardConfig != null ? giftLeaderboardConfig.toBuilder() : null;
                                    GiftLeaderboardConfig giftLeaderboardConfig2 = (GiftLeaderboardConfig) c3407e.m17143w(GiftLeaderboardConfig.parser(), c3410h);
                                    this.config_ = giftLeaderboardConfig2;
                                    if (builder != null) {
                                        builder.mergeFrom(giftLeaderboardConfig2);
                                        this.config_ = builder.buildPartial();
                                    }
                                } else if (iM17116M == 34) {
                                    if (!this.current_.mo17085q()) {
                                        this.current_ = GeneratedMessageLite.mutableCopy(this.current_);
                                    }
                                    this.current_.add((GiftLeaderboardItem) c3407e.m17143w(GiftLeaderboardItem.parser(), c3410h));
                                } else if (iM17116M == 42) {
                                    this.jumpUrl_ = c3407e.m17115L();
                                } else if (!c3407e.m17121R(iM17116M)) {
                                }
                            }
                            z5 = true;
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
                        synchronized (GiftLeaderboard.class) {
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

        @Override // com.p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard.GiftLeaderboardOrBuilder
        public GiftLeaderboardConfig getConfig() {
            GiftLeaderboardConfig giftLeaderboardConfig = this.config_;
            return giftLeaderboardConfig == null ? GiftLeaderboardConfig.getDefaultInstance() : giftLeaderboardConfig;
        }

        @Override // com.p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard.GiftLeaderboardOrBuilder
        public GiftLeaderboardItem getCurrent(int i) {
            return this.current_.get(i);
        }

        @Override // com.p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard.GiftLeaderboardOrBuilder
        public int getCurrentCount() {
            return this.current_.size();
        }

        @Override // com.p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard.GiftLeaderboardOrBuilder
        public List<GiftLeaderboardItem> getCurrentList() {
            return this.current_;
        }

        public GiftLeaderboardItemOrBuilder getCurrentOrBuilder(int i) {
            return this.current_.get(i);
        }

        public List<? extends GiftLeaderboardItemOrBuilder> getCurrentOrBuilderList() {
            return this.current_;
        }

        @Override // com.p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard.GiftLeaderboardOrBuilder
        public boolean getHomeStretch() {
            return this.homeStretch_;
        }

        @Override // com.p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard.GiftLeaderboardOrBuilder
        public String getJumpUrl() {
            return this.jumpUrl_;
        }

        @Override // com.p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard.GiftLeaderboardOrBuilder
        public ByteString getJumpUrlBytes() {
            return ByteString.copyFromUtf8(this.jumpUrl_);
        }

        @Override // com.p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard.GiftLeaderboardOrBuilder
        public boolean getOpen() {
            return this.open_;
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            boolean z = this.open_;
            int iM16915f = z ? CodedOutputStream.m16915f(1, z) : 0;
            boolean z2 = this.homeStretch_;
            if (z2) {
                iM16915f += CodedOutputStream.m16915f(2, z2);
            }
            if (this.config_ != null) {
                iM16915f += CodedOutputStream.m16893C(3, getConfig());
            }
            for (int i2 = 0; i2 < this.current_.size(); i2++) {
                iM16915f += CodedOutputStream.m16893C(4, this.current_.get(i2));
            }
            if (!this.jumpUrl_.isEmpty()) {
                iM16915f += CodedOutputStream.m16901K(5, getJumpUrl());
            }
            this.memoizedSerializedSize = iM16915f;
            return iM16915f;
        }

        @Override // com.p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard.GiftLeaderboardOrBuilder
        public boolean hasConfig() {
            return this.config_ != null;
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            boolean z = this.open_;
            if (z) {
                codedOutputStream.mo16950a0(1, z);
            }
            boolean z2 = this.homeStretch_;
            if (z2) {
                codedOutputStream.mo16950a0(2, z2);
            }
            if (this.config_ != null) {
                codedOutputStream.mo16974w0(3, getConfig());
            }
            for (int i = 0; i < this.current_.size(); i++) {
                codedOutputStream.mo16974w0(4, this.current_.get(i));
            }
            if (this.jumpUrl_.isEmpty()) {
                return;
            }
            codedOutputStream.mo16939D0(5, getJumpUrl());
        }

        public static GiftLeaderboard parseDelimitedFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (GiftLeaderboard) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static GiftLeaderboard parseFrom(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
            return (GiftLeaderboard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3410h);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setConfig(GiftLeaderboardConfig giftLeaderboardConfig) {
            giftLeaderboardConfig.getClass();
            this.config_ = giftLeaderboardConfig;
        }

        public static final class Builder extends GeneratedMessageLite.AbstractC3380b<GiftLeaderboard, Builder> implements GiftLeaderboardOrBuilder {
            private Builder() {
                super(GiftLeaderboard.DEFAULT_INSTANCE);
            }

            public Builder addAllCurrent(Iterable<? extends GiftLeaderboardItem> iterable) {
                copyOnWrite();
                ((GiftLeaderboard) this.instance).addAllCurrent(iterable);
                return this;
            }

            public Builder addCurrent(GiftLeaderboardItem giftLeaderboardItem) {
                copyOnWrite();
                ((GiftLeaderboard) this.instance).addCurrent(giftLeaderboardItem);
                return this;
            }

            public Builder clearConfig() {
                copyOnWrite();
                ((GiftLeaderboard) this.instance).clearConfig();
                return this;
            }

            public Builder clearCurrent() {
                copyOnWrite();
                ((GiftLeaderboard) this.instance).clearCurrent();
                return this;
            }

            public Builder clearHomeStretch() {
                copyOnWrite();
                ((GiftLeaderboard) this.instance).clearHomeStretch();
                return this;
            }

            public Builder clearJumpUrl() {
                copyOnWrite();
                ((GiftLeaderboard) this.instance).clearJumpUrl();
                return this;
            }

            public Builder clearOpen() {
                copyOnWrite();
                ((GiftLeaderboard) this.instance).clearOpen();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard.GiftLeaderboardOrBuilder
            public GiftLeaderboardConfig getConfig() {
                return ((GiftLeaderboard) this.instance).getConfig();
            }

            @Override // com.p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard.GiftLeaderboardOrBuilder
            public GiftLeaderboardItem getCurrent(int i) {
                return ((GiftLeaderboard) this.instance).getCurrent(i);
            }

            @Override // com.p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard.GiftLeaderboardOrBuilder
            public int getCurrentCount() {
                return ((GiftLeaderboard) this.instance).getCurrentCount();
            }

            @Override // com.p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard.GiftLeaderboardOrBuilder
            public List<GiftLeaderboardItem> getCurrentList() {
                return Collections.unmodifiableList(((GiftLeaderboard) this.instance).getCurrentList());
            }

            @Override // com.p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard.GiftLeaderboardOrBuilder
            public boolean getHomeStretch() {
                return ((GiftLeaderboard) this.instance).getHomeStretch();
            }

            @Override // com.p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard.GiftLeaderboardOrBuilder
            public String getJumpUrl() {
                return ((GiftLeaderboard) this.instance).getJumpUrl();
            }

            @Override // com.p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard.GiftLeaderboardOrBuilder
            public ByteString getJumpUrlBytes() {
                return ((GiftLeaderboard) this.instance).getJumpUrlBytes();
            }

            @Override // com.p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard.GiftLeaderboardOrBuilder
            public boolean getOpen() {
                return ((GiftLeaderboard) this.instance).getOpen();
            }

            @Override // com.p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard.GiftLeaderboardOrBuilder
            public boolean hasConfig() {
                return ((GiftLeaderboard) this.instance).hasConfig();
            }

            public Builder mergeConfig(GiftLeaderboardConfig giftLeaderboardConfig) {
                copyOnWrite();
                ((GiftLeaderboard) this.instance).mergeConfig(giftLeaderboardConfig);
                return this;
            }

            public Builder removeCurrent(int i) {
                copyOnWrite();
                ((GiftLeaderboard) this.instance).removeCurrent(i);
                return this;
            }

            public Builder setConfig(GiftLeaderboardConfig giftLeaderboardConfig) {
                copyOnWrite();
                ((GiftLeaderboard) this.instance).setConfig(giftLeaderboardConfig);
                return this;
            }

            public Builder setCurrent(int i, GiftLeaderboardItem giftLeaderboardItem) {
                copyOnWrite();
                ((GiftLeaderboard) this.instance).setCurrent(i, giftLeaderboardItem);
                return this;
            }

            public Builder setHomeStretch(boolean z) {
                copyOnWrite();
                ((GiftLeaderboard) this.instance).setHomeStretch(z);
                return this;
            }

            public Builder setJumpUrl(String str) {
                copyOnWrite();
                ((GiftLeaderboard) this.instance).setJumpUrl(str);
                return this;
            }

            public Builder setJumpUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((GiftLeaderboard) this.instance).setJumpUrlBytes(byteString);
                return this;
            }

            public Builder setOpen(boolean z) {
                copyOnWrite();
                ((GiftLeaderboard) this.instance).setOpen(z);
                return this;
            }

            public Builder addCurrent(int i, GiftLeaderboardItem giftLeaderboardItem) {
                copyOnWrite();
                ((GiftLeaderboard) this.instance).addCurrent(i, giftLeaderboardItem);
                return this;
            }

            public Builder setConfig(GiftLeaderboardConfig.Builder builder) {
                copyOnWrite();
                ((GiftLeaderboard) this.instance).setConfig(builder);
                return this;
            }

            public Builder setCurrent(int i, GiftLeaderboardItem.Builder builder) {
                copyOnWrite();
                ((GiftLeaderboard) this.instance).setCurrent(i, builder);
                return this;
            }

            public Builder addCurrent(GiftLeaderboardItem.Builder builder) {
                copyOnWrite();
                ((GiftLeaderboard) this.instance).addCurrent(builder);
                return this;
            }

            public Builder addCurrent(int i, GiftLeaderboardItem.Builder builder) {
                copyOnWrite();
                ((GiftLeaderboard) this.instance).addCurrent(i, builder);
                return this;
            }
        }

        public static GiftLeaderboard parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (GiftLeaderboard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static GiftLeaderboard parseFrom(byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
            return (GiftLeaderboard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3410h);
        }

        public static GiftLeaderboard parseFrom(InputStream inputStream) throws IOException {
            return (GiftLeaderboard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GiftLeaderboard parseFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (GiftLeaderboard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static GiftLeaderboard parseFrom(C3407e c3407e) throws IOException {
            return (GiftLeaderboard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addCurrent(int i, GiftLeaderboardItem giftLeaderboardItem) {
            giftLeaderboardItem.getClass();
            ensureCurrentIsMutable();
            this.current_.add(i, giftLeaderboardItem);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static GiftLeaderboard parseFrom(C3407e c3407e, C3410h c3410h) throws IOException {
            return (GiftLeaderboard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e, c3410h);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCurrent(int i, GiftLeaderboardItem giftLeaderboardItem) {
            giftLeaderboardItem.getClass();
            ensureCurrentIsMutable();
            this.current_.set(i, giftLeaderboardItem);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addCurrent(GiftLeaderboardItem giftLeaderboardItem) {
            giftLeaderboardItem.getClass();
            ensureCurrentIsMutable();
            this.current_.add(giftLeaderboardItem);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addCurrent(int i, GiftLeaderboardItem.Builder builder) {
            ensureCurrentIsMutable();
            this.current_.add(i, builder.build());
        }
    }

    public static final class GiftLeaderboardConfig extends GeneratedMessageLite<GiftLeaderboardConfig, Builder> implements GiftLeaderboardConfigOrBuilder {
        private static final GiftLeaderboardConfig DEFAULT_INSTANCE;
        private static volatile i860<GiftLeaderboardConfig> PARSER = null;
        public static final int POLLINGINTERVALINSECONDS_FIELD_NUMBER = 1;
        public static final int SCROLLINTERVALINSECONDS_FIELD_NUMBER = 2;
        private long pollingIntervalInSeconds_;
        private long scrollIntervalInSeconds_;

        public static final class Builder extends GeneratedMessageLite.AbstractC3380b<GiftLeaderboardConfig, Builder> implements GiftLeaderboardConfigOrBuilder {
            private Builder() {
                super(GiftLeaderboardConfig.DEFAULT_INSTANCE);
            }

            public Builder clearPollingIntervalInSeconds() {
                copyOnWrite();
                ((GiftLeaderboardConfig) this.instance).clearPollingIntervalInSeconds();
                return this;
            }

            public Builder clearScrollIntervalInSeconds() {
                copyOnWrite();
                ((GiftLeaderboardConfig) this.instance).clearScrollIntervalInSeconds();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard.GiftLeaderboardConfigOrBuilder
            public long getPollingIntervalInSeconds() {
                return ((GiftLeaderboardConfig) this.instance).getPollingIntervalInSeconds();
            }

            @Override // com.p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard.GiftLeaderboardConfigOrBuilder
            public long getScrollIntervalInSeconds() {
                return ((GiftLeaderboardConfig) this.instance).getScrollIntervalInSeconds();
            }

            public Builder setPollingIntervalInSeconds(long j) {
                copyOnWrite();
                ((GiftLeaderboardConfig) this.instance).setPollingIntervalInSeconds(j);
                return this;
            }

            public Builder setScrollIntervalInSeconds(long j) {
                copyOnWrite();
                ((GiftLeaderboardConfig) this.instance).setScrollIntervalInSeconds(j);
                return this;
            }
        }

        static {
            GiftLeaderboardConfig giftLeaderboardConfig = new GiftLeaderboardConfig();
            DEFAULT_INSTANCE = giftLeaderboardConfig;
            giftLeaderboardConfig.makeImmutable();
        }

        private GiftLeaderboardConfig() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPollingIntervalInSeconds() {
            this.pollingIntervalInSeconds_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearScrollIntervalInSeconds() {
            this.scrollIntervalInSeconds_ = 0L;
        }

        public static GiftLeaderboardConfig getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(GiftLeaderboardConfig giftLeaderboardConfig) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(giftLeaderboardConfig);
        }

        public static GiftLeaderboardConfig parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (GiftLeaderboardConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GiftLeaderboardConfig parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (GiftLeaderboardConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<GiftLeaderboardConfig> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPollingIntervalInSeconds(long j) {
            this.pollingIntervalInSeconds_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setScrollIntervalInSeconds(long j) {
            this.scrollIntervalInSeconds_ = j;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C44231.f15946xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new GiftLeaderboardConfig();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3386h interfaceC3386h = (GeneratedMessageLite.InterfaceC3386h) obj;
                    GiftLeaderboardConfig giftLeaderboardConfig = (GiftLeaderboardConfig) obj2;
                    long j = this.pollingIntervalInSeconds_;
                    boolean z2 = j != 0;
                    long j2 = giftLeaderboardConfig.pollingIntervalInSeconds_;
                    this.pollingIntervalInSeconds_ = interfaceC3386h.mo17000i(z2, j, j2 != 0, j2);
                    boolean z3 = false;
                    long j3 = this.scrollIntervalInSeconds_;
                    if (j3 != 0) {
                        z3 = true;
                    }
                    long j4 = giftLeaderboardConfig.scrollIntervalInSeconds_;
                    this.scrollIntervalInSeconds_ = interfaceC3386h.mo17000i(z3, j3, j4 != 0, j4);
                    GeneratedMessageLite.C3385g c3385g = GeneratedMessageLite.C3385g.INSTANCE;
                    return this;
                case 6:
                    C3407e c3407e = (C3407e) obj;
                    while (!z) {
                        try {
                            int iM17116M = c3407e.m17116M();
                            if (iM17116M != 0) {
                                if (iM17116M == 8) {
                                    this.pollingIntervalInSeconds_ = c3407e.m17142v();
                                } else if (iM17116M == 16) {
                                    this.scrollIntervalInSeconds_ = c3407e.m17142v();
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
                        synchronized (GiftLeaderboardConfig.class) {
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

        @Override // com.p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard.GiftLeaderboardConfigOrBuilder
        public long getPollingIntervalInSeconds() {
            return this.pollingIntervalInSeconds_;
        }

        @Override // com.p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard.GiftLeaderboardConfigOrBuilder
        public long getScrollIntervalInSeconds() {
            return this.scrollIntervalInSeconds_;
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            long j = this.pollingIntervalInSeconds_;
            int iM16931v = j != 0 ? CodedOutputStream.m16931v(1, j) : 0;
            long j2 = this.scrollIntervalInSeconds_;
            if (j2 != 0) {
                iM16931v += CodedOutputStream.m16931v(2, j2);
            }
            this.memoizedSerializedSize = iM16931v;
            return iM16931v;
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            long j = this.pollingIntervalInSeconds_;
            if (j != 0) {
                codedOutputStream.m16972u0(1, j);
            }
            long j2 = this.scrollIntervalInSeconds_;
            if (j2 != 0) {
                codedOutputStream.m16972u0(2, j2);
            }
        }

        public static GiftLeaderboardConfig parseDelimitedFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (GiftLeaderboardConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static GiftLeaderboardConfig parseFrom(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
            return (GiftLeaderboardConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3410h);
        }

        public static GiftLeaderboardConfig parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (GiftLeaderboardConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static GiftLeaderboardConfig parseFrom(byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
            return (GiftLeaderboardConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3410h);
        }

        public static GiftLeaderboardConfig parseFrom(InputStream inputStream) throws IOException {
            return (GiftLeaderboardConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GiftLeaderboardConfig parseFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (GiftLeaderboardConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static GiftLeaderboardConfig parseFrom(C3407e c3407e) throws IOException {
            return (GiftLeaderboardConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static GiftLeaderboardConfig parseFrom(C3407e c3407e, C3410h c3410h) throws IOException {
            return (GiftLeaderboardConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e, c3410h);
        }
    }

    public static final class GiftLeaderboardItem extends GeneratedMessageLite<GiftLeaderboardItem, Builder> implements GiftLeaderboardItemOrBuilder {
        public static final int AMOUNT_FIELD_NUMBER = 4;
        private static final GiftLeaderboardItem DEFAULT_INSTANCE;
        public static final int GAP_FIELD_NUMBER = 6;
        public static final int GIFTICON_FIELD_NUMBER = 3;
        public static final int GIFTID_FIELD_NUMBER = 2;
        public static final int NAME_FIELD_NUMBER = 1;
        private static volatile i860<GiftLeaderboardItem> PARSER = null;
        public static final int RANK_FIELD_NUMBER = 5;
        private long amount_;
        private long gap_;
        private long rank_;
        private String name_ = "";
        private String giftId_ = "";
        private String giftIcon_ = "";

        public static final class Builder extends GeneratedMessageLite.AbstractC3380b<GiftLeaderboardItem, Builder> implements GiftLeaderboardItemOrBuilder {
            private Builder() {
                super(GiftLeaderboardItem.DEFAULT_INSTANCE);
            }

            public Builder clearAmount() {
                copyOnWrite();
                ((GiftLeaderboardItem) this.instance).clearAmount();
                return this;
            }

            public Builder clearGap() {
                copyOnWrite();
                ((GiftLeaderboardItem) this.instance).clearGap();
                return this;
            }

            public Builder clearGiftIcon() {
                copyOnWrite();
                ((GiftLeaderboardItem) this.instance).clearGiftIcon();
                return this;
            }

            public Builder clearGiftId() {
                copyOnWrite();
                ((GiftLeaderboardItem) this.instance).clearGiftId();
                return this;
            }

            public Builder clearName() {
                copyOnWrite();
                ((GiftLeaderboardItem) this.instance).clearName();
                return this;
            }

            public Builder clearRank() {
                copyOnWrite();
                ((GiftLeaderboardItem) this.instance).clearRank();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard.GiftLeaderboardItemOrBuilder
            public long getAmount() {
                return ((GiftLeaderboardItem) this.instance).getAmount();
            }

            @Override // com.p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard.GiftLeaderboardItemOrBuilder
            public long getGap() {
                return ((GiftLeaderboardItem) this.instance).getGap();
            }

            @Override // com.p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard.GiftLeaderboardItemOrBuilder
            public String getGiftIcon() {
                return ((GiftLeaderboardItem) this.instance).getGiftIcon();
            }

            @Override // com.p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard.GiftLeaderboardItemOrBuilder
            public ByteString getGiftIconBytes() {
                return ((GiftLeaderboardItem) this.instance).getGiftIconBytes();
            }

            @Override // com.p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard.GiftLeaderboardItemOrBuilder
            public String getGiftId() {
                return ((GiftLeaderboardItem) this.instance).getGiftId();
            }

            @Override // com.p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard.GiftLeaderboardItemOrBuilder
            public ByteString getGiftIdBytes() {
                return ((GiftLeaderboardItem) this.instance).getGiftIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard.GiftLeaderboardItemOrBuilder
            public String getName() {
                return ((GiftLeaderboardItem) this.instance).getName();
            }

            @Override // com.p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard.GiftLeaderboardItemOrBuilder
            public ByteString getNameBytes() {
                return ((GiftLeaderboardItem) this.instance).getNameBytes();
            }

            @Override // com.p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard.GiftLeaderboardItemOrBuilder
            public long getRank() {
                return ((GiftLeaderboardItem) this.instance).getRank();
            }

            public Builder setAmount(long j) {
                copyOnWrite();
                ((GiftLeaderboardItem) this.instance).setAmount(j);
                return this;
            }

            public Builder setGap(long j) {
                copyOnWrite();
                ((GiftLeaderboardItem) this.instance).setGap(j);
                return this;
            }

            public Builder setGiftIcon(String str) {
                copyOnWrite();
                ((GiftLeaderboardItem) this.instance).setGiftIcon(str);
                return this;
            }

            public Builder setGiftIconBytes(ByteString byteString) {
                copyOnWrite();
                ((GiftLeaderboardItem) this.instance).setGiftIconBytes(byteString);
                return this;
            }

            public Builder setGiftId(String str) {
                copyOnWrite();
                ((GiftLeaderboardItem) this.instance).setGiftId(str);
                return this;
            }

            public Builder setGiftIdBytes(ByteString byteString) {
                copyOnWrite();
                ((GiftLeaderboardItem) this.instance).setGiftIdBytes(byteString);
                return this;
            }

            public Builder setName(String str) {
                copyOnWrite();
                ((GiftLeaderboardItem) this.instance).setName(str);
                return this;
            }

            public Builder setNameBytes(ByteString byteString) {
                copyOnWrite();
                ((GiftLeaderboardItem) this.instance).setNameBytes(byteString);
                return this;
            }

            public Builder setRank(long j) {
                copyOnWrite();
                ((GiftLeaderboardItem) this.instance).setRank(j);
                return this;
            }
        }

        static {
            GiftLeaderboardItem giftLeaderboardItem = new GiftLeaderboardItem();
            DEFAULT_INSTANCE = giftLeaderboardItem;
            giftLeaderboardItem.makeImmutable();
        }

        private GiftLeaderboardItem() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAmount() {
            this.amount_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGap() {
            this.gap_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGiftIcon() {
            this.giftIcon_ = getDefaultInstance().getGiftIcon();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGiftId() {
            this.giftId_ = getDefaultInstance().getGiftId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearName() {
            this.name_ = getDefaultInstance().getName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRank() {
            this.rank_ = 0L;
        }

        public static GiftLeaderboardItem getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(GiftLeaderboardItem giftLeaderboardItem) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(giftLeaderboardItem);
        }

        public static GiftLeaderboardItem parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (GiftLeaderboardItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GiftLeaderboardItem parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (GiftLeaderboardItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<GiftLeaderboardItem> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAmount(long j) {
            this.amount_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGap(long j) {
            this.gap_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGiftIcon(String str) {
            str.getClass();
            this.giftIcon_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGiftIconBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.giftIcon_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGiftId(String str) {
            str.getClass();
            this.giftId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGiftIdBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.giftId_ = byteString.toStringUtf8();
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
        public void setRank(long j) {
            this.rank_ = j;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C44231.f15946xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new GiftLeaderboardItem();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3386h interfaceC3386h = (GeneratedMessageLite.InterfaceC3386h) obj;
                    GiftLeaderboardItem giftLeaderboardItem = (GiftLeaderboardItem) obj2;
                    this.name_ = interfaceC3386h.mo16997f(!this.name_.isEmpty(), this.name_, !giftLeaderboardItem.name_.isEmpty(), giftLeaderboardItem.name_);
                    this.giftId_ = interfaceC3386h.mo16997f(!this.giftId_.isEmpty(), this.giftId_, !giftLeaderboardItem.giftId_.isEmpty(), giftLeaderboardItem.giftId_);
                    this.giftIcon_ = interfaceC3386h.mo16997f(!this.giftIcon_.isEmpty(), this.giftIcon_, !giftLeaderboardItem.giftIcon_.isEmpty(), giftLeaderboardItem.giftIcon_);
                    long j = this.amount_;
                    boolean z2 = j != 0;
                    long j2 = giftLeaderboardItem.amount_;
                    this.amount_ = interfaceC3386h.mo17000i(z2, j, j2 != 0, j2);
                    long j3 = this.rank_;
                    boolean z3 = j3 != 0;
                    long j4 = giftLeaderboardItem.rank_;
                    this.rank_ = interfaceC3386h.mo17000i(z3, j3, j4 != 0, j4);
                    boolean z4 = false;
                    long j5 = this.gap_;
                    if (j5 != 0) {
                        z4 = true;
                    }
                    long j6 = giftLeaderboardItem.gap_;
                    this.gap_ = interfaceC3386h.mo17000i(z4, j5, j6 != 0, j6);
                    GeneratedMessageLite.C3385g c3385g = GeneratedMessageLite.C3385g.INSTANCE;
                    return this;
                case 6:
                    C3407e c3407e = (C3407e) obj;
                    while (!z) {
                        try {
                            int iM17116M = c3407e.m17116M();
                            if (iM17116M != 0) {
                                if (iM17116M == 10) {
                                    this.name_ = c3407e.m17115L();
                                } else if (iM17116M == 18) {
                                    this.giftId_ = c3407e.m17115L();
                                } else if (iM17116M == 26) {
                                    this.giftIcon_ = c3407e.m17115L();
                                } else if (iM17116M == 32) {
                                    this.amount_ = c3407e.m17142v();
                                } else if (iM17116M == 40) {
                                    this.rank_ = c3407e.m17142v();
                                } else if (iM17116M == 48) {
                                    this.gap_ = c3407e.m17142v();
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
                        synchronized (GiftLeaderboardItem.class) {
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

        @Override // com.p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard.GiftLeaderboardItemOrBuilder
        public long getAmount() {
            return this.amount_;
        }

        @Override // com.p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard.GiftLeaderboardItemOrBuilder
        public long getGap() {
            return this.gap_;
        }

        @Override // com.p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard.GiftLeaderboardItemOrBuilder
        public String getGiftIcon() {
            return this.giftIcon_;
        }

        @Override // com.p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard.GiftLeaderboardItemOrBuilder
        public ByteString getGiftIconBytes() {
            return ByteString.copyFromUtf8(this.giftIcon_);
        }

        @Override // com.p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard.GiftLeaderboardItemOrBuilder
        public String getGiftId() {
            return this.giftId_;
        }

        @Override // com.p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard.GiftLeaderboardItemOrBuilder
        public ByteString getGiftIdBytes() {
            return ByteString.copyFromUtf8(this.giftId_);
        }

        @Override // com.p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard.GiftLeaderboardItemOrBuilder
        public String getName() {
            return this.name_;
        }

        @Override // com.p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard.GiftLeaderboardItemOrBuilder
        public ByteString getNameBytes() {
            return ByteString.copyFromUtf8(this.name_);
        }

        @Override // com.p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard.GiftLeaderboardItemOrBuilder
        public long getRank() {
            return this.rank_;
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16901K = !this.name_.isEmpty() ? CodedOutputStream.m16901K(1, getName()) : 0;
            if (!this.giftId_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(2, getGiftId());
            }
            if (!this.giftIcon_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(3, getGiftIcon());
            }
            long j = this.amount_;
            if (j != 0) {
                iM16901K += CodedOutputStream.m16931v(4, j);
            }
            long j2 = this.rank_;
            if (j2 != 0) {
                iM16901K += CodedOutputStream.m16931v(5, j2);
            }
            long j3 = this.gap_;
            if (j3 != 0) {
                iM16901K += CodedOutputStream.m16931v(6, j3);
            }
            this.memoizedSerializedSize = iM16901K;
            return iM16901K;
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.name_.isEmpty()) {
                codedOutputStream.mo16939D0(1, getName());
            }
            if (!this.giftId_.isEmpty()) {
                codedOutputStream.mo16939D0(2, getGiftId());
            }
            if (!this.giftIcon_.isEmpty()) {
                codedOutputStream.mo16939D0(3, getGiftIcon());
            }
            long j = this.amount_;
            if (j != 0) {
                codedOutputStream.m16972u0(4, j);
            }
            long j2 = this.rank_;
            if (j2 != 0) {
                codedOutputStream.m16972u0(5, j2);
            }
            long j3 = this.gap_;
            if (j3 != 0) {
                codedOutputStream.m16972u0(6, j3);
            }
        }

        public static GiftLeaderboardItem parseDelimitedFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (GiftLeaderboardItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static GiftLeaderboardItem parseFrom(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
            return (GiftLeaderboardItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3410h);
        }

        public static GiftLeaderboardItem parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (GiftLeaderboardItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static GiftLeaderboardItem parseFrom(byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
            return (GiftLeaderboardItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3410h);
        }

        public static GiftLeaderboardItem parseFrom(InputStream inputStream) throws IOException {
            return (GiftLeaderboardItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GiftLeaderboardItem parseFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (GiftLeaderboardItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static GiftLeaderboardItem parseFrom(C3407e c3407e) throws IOException {
            return (GiftLeaderboardItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static GiftLeaderboardItem parseFrom(C3407e c3407e, C3410h c3410h) throws IOException {
            return (GiftLeaderboardItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e, c3410h);
        }
    }

    public static final class GiftLeaderboardTopEffect extends GeneratedMessageLite<GiftLeaderboardTopEffect, Builder> implements GiftLeaderboardTopEffectOrBuilder {
        public static final int BACKGROUNDSVGAURL_FIELD_NUMBER = 7;
        public static final int BACKGROUNDURL_FIELD_NUMBER = 6;
        private static final GiftLeaderboardTopEffect DEFAULT_INSTANCE;
        public static final int DURATION_FIELD_NUMBER = 4;
        public static final int EFFECTBACKGROUNDURL_FIELD_NUMBER = 8;
        public static final int ENDBACKENDCOLOR_FIELD_NUMBER = 3;
        private static volatile i860<GiftLeaderboardTopEffect> PARSER = null;
        public static final int ROOMID_FIELD_NUMBER = 5;
        public static final int STARTBACKENDCOLOR_FIELD_NUMBER = 2;
        public static final int TEMPLATE_FIELD_NUMBER = 1;
        private long duration_;
        private TemplateData template_;
        private String startBackendColor_ = "";
        private String endBackendColor_ = "";
        private String roomId_ = "";
        private String backgroundUrl_ = "";
        private String backgroundSvgaUrl_ = "";
        private String effectBackgroundUrl_ = "";

        static {
            GiftLeaderboardTopEffect giftLeaderboardTopEffect = new GiftLeaderboardTopEffect();
            DEFAULT_INSTANCE = giftLeaderboardTopEffect;
            giftLeaderboardTopEffect.makeImmutable();
        }

        private GiftLeaderboardTopEffect() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBackgroundSvgaUrl() {
            this.backgroundSvgaUrl_ = getDefaultInstance().getBackgroundSvgaUrl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBackgroundUrl() {
            this.backgroundUrl_ = getDefaultInstance().getBackgroundUrl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDuration() {
            this.duration_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEffectBackgroundUrl() {
            this.effectBackgroundUrl_ = getDefaultInstance().getEffectBackgroundUrl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEndBackendColor() {
            this.endBackendColor_ = getDefaultInstance().getEndBackendColor();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRoomId() {
            this.roomId_ = getDefaultInstance().getRoomId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStartBackendColor() {
            this.startBackendColor_ = getDefaultInstance().getStartBackendColor();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTemplate() {
            this.template_ = null;
        }

        public static GiftLeaderboardTopEffect getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeTemplate(TemplateData templateData) {
            TemplateData templateData2 = this.template_;
            if (templateData2 == null || templateData2 == TemplateData.getDefaultInstance()) {
                this.template_ = templateData;
            } else {
                this.template_ = TemplateData.newBuilder(this.template_).mergeFrom(templateData).buildPartial();
            }
        }

        public static Builder newBuilder(GiftLeaderboardTopEffect giftLeaderboardTopEffect) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(giftLeaderboardTopEffect);
        }

        public static GiftLeaderboardTopEffect parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (GiftLeaderboardTopEffect) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GiftLeaderboardTopEffect parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (GiftLeaderboardTopEffect) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<GiftLeaderboardTopEffect> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBackgroundSvgaUrl(String str) {
            str.getClass();
            this.backgroundSvgaUrl_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBackgroundSvgaUrlBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.backgroundSvgaUrl_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBackgroundUrl(String str) {
            str.getClass();
            this.backgroundUrl_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBackgroundUrlBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.backgroundUrl_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDuration(long j) {
            this.duration_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEffectBackgroundUrl(String str) {
            str.getClass();
            this.effectBackgroundUrl_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEffectBackgroundUrlBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.effectBackgroundUrl_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEndBackendColor(String str) {
            str.getClass();
            this.endBackendColor_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEndBackendColorBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.endBackendColor_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRoomId(String str) {
            str.getClass();
            this.roomId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRoomIdBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.roomId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStartBackendColor(String str) {
            str.getClass();
            this.startBackendColor_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStartBackendColorBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.startBackendColor_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTemplate(TemplateData.Builder builder) {
            this.template_ = builder.build();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C44231.f15946xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new GiftLeaderboardTopEffect();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3386h interfaceC3386h = (GeneratedMessageLite.InterfaceC3386h) obj;
                    GiftLeaderboardTopEffect giftLeaderboardTopEffect = (GiftLeaderboardTopEffect) obj2;
                    this.template_ = (TemplateData) interfaceC3386h.mo17006o(this.template_, giftLeaderboardTopEffect.template_);
                    this.startBackendColor_ = interfaceC3386h.mo16997f(!this.startBackendColor_.isEmpty(), this.startBackendColor_, !giftLeaderboardTopEffect.startBackendColor_.isEmpty(), giftLeaderboardTopEffect.startBackendColor_);
                    this.endBackendColor_ = interfaceC3386h.mo16997f(!this.endBackendColor_.isEmpty(), this.endBackendColor_, !giftLeaderboardTopEffect.endBackendColor_.isEmpty(), giftLeaderboardTopEffect.endBackendColor_);
                    long j = this.duration_;
                    boolean z2 = j != 0;
                    long j2 = giftLeaderboardTopEffect.duration_;
                    this.duration_ = interfaceC3386h.mo17000i(z2, j, j2 != 0, j2);
                    this.roomId_ = interfaceC3386h.mo16997f(!this.roomId_.isEmpty(), this.roomId_, !giftLeaderboardTopEffect.roomId_.isEmpty(), giftLeaderboardTopEffect.roomId_);
                    this.backgroundUrl_ = interfaceC3386h.mo16997f(!this.backgroundUrl_.isEmpty(), this.backgroundUrl_, !giftLeaderboardTopEffect.backgroundUrl_.isEmpty(), giftLeaderboardTopEffect.backgroundUrl_);
                    this.backgroundSvgaUrl_ = interfaceC3386h.mo16997f(!this.backgroundSvgaUrl_.isEmpty(), this.backgroundSvgaUrl_, !giftLeaderboardTopEffect.backgroundSvgaUrl_.isEmpty(), giftLeaderboardTopEffect.backgroundSvgaUrl_);
                    this.effectBackgroundUrl_ = interfaceC3386h.mo16997f(!this.effectBackgroundUrl_.isEmpty(), this.effectBackgroundUrl_, !giftLeaderboardTopEffect.effectBackgroundUrl_.isEmpty(), giftLeaderboardTopEffect.effectBackgroundUrl_);
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
                                    TemplateData templateData = this.template_;
                                    TemplateData.Builder builder = templateData != null ? templateData.toBuilder() : null;
                                    TemplateData templateData2 = (TemplateData) c3407e.m17143w(TemplateData.parser(), c3410h);
                                    this.template_ = templateData2;
                                    if (builder != null) {
                                        builder.mergeFrom(templateData2);
                                        this.template_ = builder.buildPartial();
                                    }
                                } else if (iM17116M == 18) {
                                    this.startBackendColor_ = c3407e.m17115L();
                                } else if (iM17116M == 26) {
                                    this.endBackendColor_ = c3407e.m17115L();
                                } else if (iM17116M == 32) {
                                    this.duration_ = c3407e.m17142v();
                                } else if (iM17116M == 42) {
                                    this.roomId_ = c3407e.m17115L();
                                } else if (iM17116M == 50) {
                                    this.backgroundUrl_ = c3407e.m17115L();
                                } else if (iM17116M == 58) {
                                    this.backgroundSvgaUrl_ = c3407e.m17115L();
                                } else if (iM17116M == 66) {
                                    this.effectBackgroundUrl_ = c3407e.m17115L();
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
                        synchronized (GiftLeaderboardTopEffect.class) {
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

        @Override // com.p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard.GiftLeaderboardTopEffectOrBuilder
        public String getBackgroundSvgaUrl() {
            return this.backgroundSvgaUrl_;
        }

        @Override // com.p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard.GiftLeaderboardTopEffectOrBuilder
        public ByteString getBackgroundSvgaUrlBytes() {
            return ByteString.copyFromUtf8(this.backgroundSvgaUrl_);
        }

        @Override // com.p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard.GiftLeaderboardTopEffectOrBuilder
        public String getBackgroundUrl() {
            return this.backgroundUrl_;
        }

        @Override // com.p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard.GiftLeaderboardTopEffectOrBuilder
        public ByteString getBackgroundUrlBytes() {
            return ByteString.copyFromUtf8(this.backgroundUrl_);
        }

        @Override // com.p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard.GiftLeaderboardTopEffectOrBuilder
        public long getDuration() {
            return this.duration_;
        }

        @Override // com.p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard.GiftLeaderboardTopEffectOrBuilder
        public String getEffectBackgroundUrl() {
            return this.effectBackgroundUrl_;
        }

        @Override // com.p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard.GiftLeaderboardTopEffectOrBuilder
        public ByteString getEffectBackgroundUrlBytes() {
            return ByteString.copyFromUtf8(this.effectBackgroundUrl_);
        }

        @Override // com.p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard.GiftLeaderboardTopEffectOrBuilder
        public String getEndBackendColor() {
            return this.endBackendColor_;
        }

        @Override // com.p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard.GiftLeaderboardTopEffectOrBuilder
        public ByteString getEndBackendColorBytes() {
            return ByteString.copyFromUtf8(this.endBackendColor_);
        }

        @Override // com.p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard.GiftLeaderboardTopEffectOrBuilder
        public String getRoomId() {
            return this.roomId_;
        }

        @Override // com.p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard.GiftLeaderboardTopEffectOrBuilder
        public ByteString getRoomIdBytes() {
            return ByteString.copyFromUtf8(this.roomId_);
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16893C = this.template_ != null ? CodedOutputStream.m16893C(1, getTemplate()) : 0;
            if (!this.startBackendColor_.isEmpty()) {
                iM16893C += CodedOutputStream.m16901K(2, getStartBackendColor());
            }
            if (!this.endBackendColor_.isEmpty()) {
                iM16893C += CodedOutputStream.m16901K(3, getEndBackendColor());
            }
            long j = this.duration_;
            if (j != 0) {
                iM16893C += CodedOutputStream.m16931v(4, j);
            }
            if (!this.roomId_.isEmpty()) {
                iM16893C += CodedOutputStream.m16901K(5, getRoomId());
            }
            if (!this.backgroundUrl_.isEmpty()) {
                iM16893C += CodedOutputStream.m16901K(6, getBackgroundUrl());
            }
            if (!this.backgroundSvgaUrl_.isEmpty()) {
                iM16893C += CodedOutputStream.m16901K(7, getBackgroundSvgaUrl());
            }
            if (!this.effectBackgroundUrl_.isEmpty()) {
                iM16893C += CodedOutputStream.m16901K(8, getEffectBackgroundUrl());
            }
            this.memoizedSerializedSize = iM16893C;
            return iM16893C;
        }

        @Override // com.p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard.GiftLeaderboardTopEffectOrBuilder
        public String getStartBackendColor() {
            return this.startBackendColor_;
        }

        @Override // com.p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard.GiftLeaderboardTopEffectOrBuilder
        public ByteString getStartBackendColorBytes() {
            return ByteString.copyFromUtf8(this.startBackendColor_);
        }

        @Override // com.p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard.GiftLeaderboardTopEffectOrBuilder
        public TemplateData getTemplate() {
            TemplateData templateData = this.template_;
            return templateData == null ? TemplateData.getDefaultInstance() : templateData;
        }

        @Override // com.p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard.GiftLeaderboardTopEffectOrBuilder
        public boolean hasTemplate() {
            return this.template_ != null;
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.template_ != null) {
                codedOutputStream.mo16974w0(1, getTemplate());
            }
            if (!this.startBackendColor_.isEmpty()) {
                codedOutputStream.mo16939D0(2, getStartBackendColor());
            }
            if (!this.endBackendColor_.isEmpty()) {
                codedOutputStream.mo16939D0(3, getEndBackendColor());
            }
            long j = this.duration_;
            if (j != 0) {
                codedOutputStream.m16972u0(4, j);
            }
            if (!this.roomId_.isEmpty()) {
                codedOutputStream.mo16939D0(5, getRoomId());
            }
            if (!this.backgroundUrl_.isEmpty()) {
                codedOutputStream.mo16939D0(6, getBackgroundUrl());
            }
            if (!this.backgroundSvgaUrl_.isEmpty()) {
                codedOutputStream.mo16939D0(7, getBackgroundSvgaUrl());
            }
            if (this.effectBackgroundUrl_.isEmpty()) {
                return;
            }
            codedOutputStream.mo16939D0(8, getEffectBackgroundUrl());
        }

        public static GiftLeaderboardTopEffect parseDelimitedFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (GiftLeaderboardTopEffect) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static GiftLeaderboardTopEffect parseFrom(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
            return (GiftLeaderboardTopEffect) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3410h);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTemplate(TemplateData templateData) {
            templateData.getClass();
            this.template_ = templateData;
        }

        public static final class Builder extends GeneratedMessageLite.AbstractC3380b<GiftLeaderboardTopEffect, Builder> implements GiftLeaderboardTopEffectOrBuilder {
            private Builder() {
                super(GiftLeaderboardTopEffect.DEFAULT_INSTANCE);
            }

            public Builder clearBackgroundSvgaUrl() {
                copyOnWrite();
                ((GiftLeaderboardTopEffect) this.instance).clearBackgroundSvgaUrl();
                return this;
            }

            public Builder clearBackgroundUrl() {
                copyOnWrite();
                ((GiftLeaderboardTopEffect) this.instance).clearBackgroundUrl();
                return this;
            }

            public Builder clearDuration() {
                copyOnWrite();
                ((GiftLeaderboardTopEffect) this.instance).clearDuration();
                return this;
            }

            public Builder clearEffectBackgroundUrl() {
                copyOnWrite();
                ((GiftLeaderboardTopEffect) this.instance).clearEffectBackgroundUrl();
                return this;
            }

            public Builder clearEndBackendColor() {
                copyOnWrite();
                ((GiftLeaderboardTopEffect) this.instance).clearEndBackendColor();
                return this;
            }

            public Builder clearRoomId() {
                copyOnWrite();
                ((GiftLeaderboardTopEffect) this.instance).clearRoomId();
                return this;
            }

            public Builder clearStartBackendColor() {
                copyOnWrite();
                ((GiftLeaderboardTopEffect) this.instance).clearStartBackendColor();
                return this;
            }

            public Builder clearTemplate() {
                copyOnWrite();
                ((GiftLeaderboardTopEffect) this.instance).clearTemplate();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard.GiftLeaderboardTopEffectOrBuilder
            public String getBackgroundSvgaUrl() {
                return ((GiftLeaderboardTopEffect) this.instance).getBackgroundSvgaUrl();
            }

            @Override // com.p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard.GiftLeaderboardTopEffectOrBuilder
            public ByteString getBackgroundSvgaUrlBytes() {
                return ((GiftLeaderboardTopEffect) this.instance).getBackgroundSvgaUrlBytes();
            }

            @Override // com.p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard.GiftLeaderboardTopEffectOrBuilder
            public String getBackgroundUrl() {
                return ((GiftLeaderboardTopEffect) this.instance).getBackgroundUrl();
            }

            @Override // com.p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard.GiftLeaderboardTopEffectOrBuilder
            public ByteString getBackgroundUrlBytes() {
                return ((GiftLeaderboardTopEffect) this.instance).getBackgroundUrlBytes();
            }

            @Override // com.p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard.GiftLeaderboardTopEffectOrBuilder
            public long getDuration() {
                return ((GiftLeaderboardTopEffect) this.instance).getDuration();
            }

            @Override // com.p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard.GiftLeaderboardTopEffectOrBuilder
            public String getEffectBackgroundUrl() {
                return ((GiftLeaderboardTopEffect) this.instance).getEffectBackgroundUrl();
            }

            @Override // com.p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard.GiftLeaderboardTopEffectOrBuilder
            public ByteString getEffectBackgroundUrlBytes() {
                return ((GiftLeaderboardTopEffect) this.instance).getEffectBackgroundUrlBytes();
            }

            @Override // com.p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard.GiftLeaderboardTopEffectOrBuilder
            public String getEndBackendColor() {
                return ((GiftLeaderboardTopEffect) this.instance).getEndBackendColor();
            }

            @Override // com.p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard.GiftLeaderboardTopEffectOrBuilder
            public ByteString getEndBackendColorBytes() {
                return ((GiftLeaderboardTopEffect) this.instance).getEndBackendColorBytes();
            }

            @Override // com.p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard.GiftLeaderboardTopEffectOrBuilder
            public String getRoomId() {
                return ((GiftLeaderboardTopEffect) this.instance).getRoomId();
            }

            @Override // com.p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard.GiftLeaderboardTopEffectOrBuilder
            public ByteString getRoomIdBytes() {
                return ((GiftLeaderboardTopEffect) this.instance).getRoomIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard.GiftLeaderboardTopEffectOrBuilder
            public String getStartBackendColor() {
                return ((GiftLeaderboardTopEffect) this.instance).getStartBackendColor();
            }

            @Override // com.p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard.GiftLeaderboardTopEffectOrBuilder
            public ByteString getStartBackendColorBytes() {
                return ((GiftLeaderboardTopEffect) this.instance).getStartBackendColorBytes();
            }

            @Override // com.p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard.GiftLeaderboardTopEffectOrBuilder
            public TemplateData getTemplate() {
                return ((GiftLeaderboardTopEffect) this.instance).getTemplate();
            }

            @Override // com.p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard.GiftLeaderboardTopEffectOrBuilder
            public boolean hasTemplate() {
                return ((GiftLeaderboardTopEffect) this.instance).hasTemplate();
            }

            public Builder mergeTemplate(TemplateData templateData) {
                copyOnWrite();
                ((GiftLeaderboardTopEffect) this.instance).mergeTemplate(templateData);
                return this;
            }

            public Builder setBackgroundSvgaUrl(String str) {
                copyOnWrite();
                ((GiftLeaderboardTopEffect) this.instance).setBackgroundSvgaUrl(str);
                return this;
            }

            public Builder setBackgroundSvgaUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((GiftLeaderboardTopEffect) this.instance).setBackgroundSvgaUrlBytes(byteString);
                return this;
            }

            public Builder setBackgroundUrl(String str) {
                copyOnWrite();
                ((GiftLeaderboardTopEffect) this.instance).setBackgroundUrl(str);
                return this;
            }

            public Builder setBackgroundUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((GiftLeaderboardTopEffect) this.instance).setBackgroundUrlBytes(byteString);
                return this;
            }

            public Builder setDuration(long j) {
                copyOnWrite();
                ((GiftLeaderboardTopEffect) this.instance).setDuration(j);
                return this;
            }

            public Builder setEffectBackgroundUrl(String str) {
                copyOnWrite();
                ((GiftLeaderboardTopEffect) this.instance).setEffectBackgroundUrl(str);
                return this;
            }

            public Builder setEffectBackgroundUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((GiftLeaderboardTopEffect) this.instance).setEffectBackgroundUrlBytes(byteString);
                return this;
            }

            public Builder setEndBackendColor(String str) {
                copyOnWrite();
                ((GiftLeaderboardTopEffect) this.instance).setEndBackendColor(str);
                return this;
            }

            public Builder setEndBackendColorBytes(ByteString byteString) {
                copyOnWrite();
                ((GiftLeaderboardTopEffect) this.instance).setEndBackendColorBytes(byteString);
                return this;
            }

            public Builder setRoomId(String str) {
                copyOnWrite();
                ((GiftLeaderboardTopEffect) this.instance).setRoomId(str);
                return this;
            }

            public Builder setRoomIdBytes(ByteString byteString) {
                copyOnWrite();
                ((GiftLeaderboardTopEffect) this.instance).setRoomIdBytes(byteString);
                return this;
            }

            public Builder setStartBackendColor(String str) {
                copyOnWrite();
                ((GiftLeaderboardTopEffect) this.instance).setStartBackendColor(str);
                return this;
            }

            public Builder setStartBackendColorBytes(ByteString byteString) {
                copyOnWrite();
                ((GiftLeaderboardTopEffect) this.instance).setStartBackendColorBytes(byteString);
                return this;
            }

            public Builder setTemplate(TemplateData templateData) {
                copyOnWrite();
                ((GiftLeaderboardTopEffect) this.instance).setTemplate(templateData);
                return this;
            }

            public Builder setTemplate(TemplateData.Builder builder) {
                copyOnWrite();
                ((GiftLeaderboardTopEffect) this.instance).setTemplate(builder);
                return this;
            }
        }

        public static GiftLeaderboardTopEffect parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (GiftLeaderboardTopEffect) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static GiftLeaderboardTopEffect parseFrom(byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
            return (GiftLeaderboardTopEffect) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3410h);
        }

        public static GiftLeaderboardTopEffect parseFrom(InputStream inputStream) throws IOException {
            return (GiftLeaderboardTopEffect) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GiftLeaderboardTopEffect parseFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (GiftLeaderboardTopEffect) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static GiftLeaderboardTopEffect parseFrom(C3407e c3407e) throws IOException {
            return (GiftLeaderboardTopEffect) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static GiftLeaderboardTopEffect parseFrom(C3407e c3407e, C3410h c3410h) throws IOException {
            return (GiftLeaderboardTopEffect) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e, c3410h);
        }
    }

    public static final class TemplateData extends GeneratedMessageLite<TemplateData, Builder> implements TemplateDataOrBuilder {
        private static final TemplateData DEFAULT_INSTANCE;
        public static final int FIELDS_FIELD_NUMBER = 2;
        public static final int ID_FIELD_NUMBER = 1;
        private static volatile i860<TemplateData> PARSER;
        private int bitField0_;
        private C3414l.h<String> fields_ = GeneratedMessageLite.emptyProtobufList();
        private int id_;

        public static final class Builder extends GeneratedMessageLite.AbstractC3380b<TemplateData, Builder> implements TemplateDataOrBuilder {
            private Builder() {
                super(TemplateData.DEFAULT_INSTANCE);
            }

            public Builder addAllFields(Iterable<String> iterable) {
                copyOnWrite();
                ((TemplateData) this.instance).addAllFields(iterable);
                return this;
            }

            public Builder addFields(String str) {
                copyOnWrite();
                ((TemplateData) this.instance).addFields(str);
                return this;
            }

            public Builder addFieldsBytes(ByteString byteString) {
                copyOnWrite();
                ((TemplateData) this.instance).addFieldsBytes(byteString);
                return this;
            }

            public Builder clearFields() {
                copyOnWrite();
                ((TemplateData) this.instance).clearFields();
                return this;
            }

            public Builder clearId() {
                copyOnWrite();
                ((TemplateData) this.instance).clearId();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard.TemplateDataOrBuilder
            public String getFields(int i) {
                return ((TemplateData) this.instance).getFields(i);
            }

            @Override // com.p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard.TemplateDataOrBuilder
            public ByteString getFieldsBytes(int i) {
                return ((TemplateData) this.instance).getFieldsBytes(i);
            }

            @Override // com.p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard.TemplateDataOrBuilder
            public int getFieldsCount() {
                return ((TemplateData) this.instance).getFieldsCount();
            }

            @Override // com.p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard.TemplateDataOrBuilder
            public List<String> getFieldsList() {
                return Collections.unmodifiableList(((TemplateData) this.instance).getFieldsList());
            }

            @Override // com.p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard.TemplateDataOrBuilder
            public int getId() {
                return ((TemplateData) this.instance).getId();
            }

            public Builder setFields(int i, String str) {
                copyOnWrite();
                ((TemplateData) this.instance).setFields(i, str);
                return this;
            }

            public Builder setId(int i) {
                copyOnWrite();
                ((TemplateData) this.instance).setId(i);
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
            AbstractC3403a.addAll(iterable, this.fields_);
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
            AbstractC3403a.checkByteStringIsUtf8(byteString);
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
            if (this.fields_.mo17085q()) {
                return;
            }
            this.fields_ = GeneratedMessageLite.mutableCopy(this.fields_);
        }

        public static TemplateData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(TemplateData templateData) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(templateData);
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

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C44231.f15946xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new TemplateData();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.fields_.mo17084n();
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3386h interfaceC3386h = (GeneratedMessageLite.InterfaceC3386h) obj;
                    TemplateData templateData = (TemplateData) obj2;
                    int i = this.id_;
                    boolean z2 = i != 0;
                    int i2 = templateData.id_;
                    this.id_ = interfaceC3386h.mo16996e(z2, i, i2 != 0, i2);
                    this.fields_ = interfaceC3386h.mo16998g(this.fields_, templateData.fields_);
                    if (interfaceC3386h == GeneratedMessageLite.C3385g.INSTANCE) {
                        this.bitField0_ |= templateData.bitField0_;
                    }
                    return this;
                case 6:
                    C3407e c3407e = (C3407e) obj;
                    while (!z) {
                        try {
                            int iM17116M = c3407e.m17116M();
                            if (iM17116M != 0) {
                                if (iM17116M == 8) {
                                    this.id_ = c3407e.m17117N();
                                } else if (iM17116M == 18) {
                                    String strM17115L = c3407e.m17115L();
                                    if (!this.fields_.mo17085q()) {
                                        this.fields_ = GeneratedMessageLite.mutableCopy(this.fields_);
                                    }
                                    this.fields_.add(strM17115L);
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
                        synchronized (TemplateData.class) {
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

        @Override // com.p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard.TemplateDataOrBuilder
        public String getFields(int i) {
            return this.fields_.get(i);
        }

        @Override // com.p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard.TemplateDataOrBuilder
        public ByteString getFieldsBytes(int i) {
            return ByteString.copyFromUtf8(this.fields_.get(i));
        }

        @Override // com.p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard.TemplateDataOrBuilder
        public int getFieldsCount() {
            return this.fields_.size();
        }

        @Override // com.p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard.TemplateDataOrBuilder
        public List<String> getFieldsList() {
            return this.fields_;
        }

        @Override // com.p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard.TemplateDataOrBuilder
        public int getId() {
            return this.id_;
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = this.id_;
            int iM16904N = i2 != 0 ? CodedOutputStream.m16904N(1, i2) : 0;
            int iM16902L = 0;
            for (int i3 = 0; i3 < this.fields_.size(); i3++) {
                iM16902L += CodedOutputStream.m16902L(this.fields_.get(i3));
            }
            int size = iM16904N + iM16902L + getFieldsList().size();
            this.memoizedSerializedSize = size;
            return size;
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            int i = this.id_;
            if (i != 0) {
                codedOutputStream.mo16942G0(1, i);
            }
            for (int i2 = 0; i2 < this.fields_.size(); i2++) {
                codedOutputStream.mo16939D0(2, this.fields_.get(i2));
            }
        }

        public static TemplateData parseDelimitedFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (TemplateData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static TemplateData parseFrom(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
            return (TemplateData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3410h);
        }

        public static TemplateData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (TemplateData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TemplateData parseFrom(byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
            return (TemplateData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3410h);
        }

        public static TemplateData parseFrom(InputStream inputStream) throws IOException {
            return (TemplateData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TemplateData parseFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (TemplateData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static TemplateData parseFrom(C3407e c3407e) throws IOException {
            return (TemplateData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static TemplateData parseFrom(C3407e c3407e, C3410h c3410h) throws IOException {
            return (TemplateData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e, c3410h);
        }
    }
}
