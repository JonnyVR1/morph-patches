package com.p003p1.mobile.longlink.msg.live.intl.giftleaderboard;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.a;
import com.google.protobuf.e;
import com.google.protobuf.h;
import com.google.protobuf.l;
import com.google.protobuf.q;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;
import l.aag0;
import l.bz00;
import l.i860;
import l.o6z;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public final class LongLinkLiveIntlGiftLeaderboard {

    /* JADX INFO: renamed from: com.p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard$1 */
    public static /* synthetic */ class C03351 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f1645xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f1645xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1645xa1df5c61[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1645xa1df5c61[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1645xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1645xa1df5c61[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1645xa1df5c61[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1645xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f1645xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public interface GiftLeaderboardConfigOrBuilder extends o6z {
        /* synthetic */ q getDefaultInstanceForType();

        long getPollingIntervalInSeconds();

        long getScrollIntervalInSeconds();

        /* synthetic */ boolean isInitialized();
    }

    public interface GiftLeaderboardItemOrBuilder extends o6z {
        long getAmount();

        /* synthetic */ q getDefaultInstanceForType();

        long getGap();

        String getGiftIcon();

        ByteString getGiftIconBytes();

        String getGiftId();

        ByteString getGiftIdBytes();

        String getName();

        ByteString getNameBytes();

        long getRank();

        /* synthetic */ boolean isInitialized();
    }

    public interface GiftLeaderboardOrBuilder extends o6z {
        GiftLeaderboardConfig getConfig();

        GiftLeaderboardItem getCurrent(int i);

        int getCurrentCount();

        List<GiftLeaderboardItem> getCurrentList();

        /* synthetic */ q getDefaultInstanceForType();

        boolean getHomeStretch();

        String getJumpUrl();

        ByteString getJumpUrlBytes();

        boolean getOpen();

        boolean hasConfig();

        /* synthetic */ boolean isInitialized();
    }

    public interface GiftLeaderboardTopEffectOrBuilder extends o6z {
        String getBackgroundSvgaUrl();

        ByteString getBackgroundSvgaUrlBytes();

        String getBackgroundUrl();

        ByteString getBackgroundUrlBytes();

        /* synthetic */ q getDefaultInstanceForType();

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

    private LongLinkLiveIntlGiftLeaderboard() {
    }

    public static void registerAllExtensions(h hVar) {
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
        private l.h<GiftLeaderboardItem> current_ = GeneratedMessageLite.emptyProtobufList();
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
            a.addAll(iterable, this.current_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addCurrent(GiftLeaderboardItem.Builder builder) {
            ensureCurrentIsMutable();
            this.current_.add((GiftLeaderboardItem) builder.build());
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
            if (this.current_.q()) {
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
                this.config_ = (GiftLeaderboardConfig) ((GiftLeaderboardConfig.Builder) GiftLeaderboardConfig.newBuilder(this.config_).mergeFrom(giftLeaderboardConfig)).buildPartial();
            }
        }

        public static Builder newBuilder(GiftLeaderboard giftLeaderboard) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(giftLeaderboard);
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
            this.config_ = (GiftLeaderboardConfig) builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCurrent(int i, GiftLeaderboardItem.Builder builder) {
            ensureCurrentIsMutable();
            this.current_.set(i, (GiftLeaderboardItem) builder.build());
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
            a.checkByteStringIsUtf8(byteString);
            this.jumpUrl_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOpen(boolean z) {
            this.open_ = z;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C03351.f1645xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new GiftLeaderboard();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.current_.n();
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.g gVar = (GeneratedMessageLite.h) obj;
                    GiftLeaderboard giftLeaderboard = (GiftLeaderboard) obj2;
                    boolean z = this.open_;
                    boolean z2 = giftLeaderboard.open_;
                    this.open_ = gVar.d(z, z, z2, z2);
                    boolean z3 = this.homeStretch_;
                    boolean z4 = giftLeaderboard.homeStretch_;
                    this.homeStretch_ = gVar.d(z3, z3, z4, z4);
                    this.config_ = gVar.o(this.config_, giftLeaderboard.config_);
                    this.current_ = gVar.g(this.current_, giftLeaderboard.current_);
                    this.jumpUrl_ = gVar.f(!this.jumpUrl_.isEmpty(), this.jumpUrl_, true ^ giftLeaderboard.jumpUrl_.isEmpty(), giftLeaderboard.jumpUrl_);
                    if (gVar == GeneratedMessageLite.g.INSTANCE) {
                        this.bitField0_ |= giftLeaderboard.bitField0_;
                    }
                    return this;
                case 6:
                    e eVar = (e) obj;
                    h hVar = (h) obj2;
                    boolean z5 = false;
                    while (!z5) {
                        try {
                            int iM = eVar.M();
                            if (iM != 0) {
                                if (iM == 8) {
                                    this.open_ = eVar.m();
                                } else if (iM == 16) {
                                    this.homeStretch_ = eVar.m();
                                } else if (iM == 26) {
                                    GiftLeaderboardConfig giftLeaderboardConfig = this.config_;
                                    GiftLeaderboardConfig.Builder builder = giftLeaderboardConfig != null ? (GiftLeaderboardConfig.Builder) giftLeaderboardConfig.toBuilder() : null;
                                    GiftLeaderboardConfig giftLeaderboardConfigW = eVar.w(GiftLeaderboardConfig.parser(), hVar);
                                    this.config_ = giftLeaderboardConfigW;
                                    if (builder != null) {
                                        builder.mergeFrom(giftLeaderboardConfigW);
                                        this.config_ = (GiftLeaderboardConfig) builder.buildPartial();
                                    }
                                } else if (iM == 34) {
                                    if (!this.current_.q()) {
                                        this.current_ = GeneratedMessageLite.mutableCopy(this.current_);
                                    }
                                    this.current_.add(eVar.w(GiftLeaderboardItem.parser(), hVar));
                                } else if (iM == 42) {
                                    this.jumpUrl_ = eVar.L();
                                } else if (!eVar.R(iM)) {
                                }
                            }
                            z5 = true;
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
                        synchronized (GiftLeaderboard.class) {
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

        @Override // com.p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard.GiftLeaderboardOrBuilder
        public GiftLeaderboardConfig getConfig() {
            GiftLeaderboardConfig giftLeaderboardConfig = this.config_;
            return giftLeaderboardConfig == null ? GiftLeaderboardConfig.getDefaultInstance() : giftLeaderboardConfig;
        }

        @Override // com.p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard.GiftLeaderboardOrBuilder
        public GiftLeaderboardItem getCurrent(int i) {
            return (GiftLeaderboardItem) this.current_.get(i);
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
            return (GiftLeaderboardItemOrBuilder) this.current_.get(i);
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

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            boolean z = this.open_;
            int iF = z ? CodedOutputStream.f(1, z) : 0;
            boolean z2 = this.homeStretch_;
            if (z2) {
                iF += CodedOutputStream.f(2, z2);
            }
            if (this.config_ != null) {
                iF += CodedOutputStream.C(3, getConfig());
            }
            for (int i2 = 0; i2 < this.current_.size(); i2++) {
                iF += CodedOutputStream.C(4, (q) this.current_.get(i2));
            }
            if (!this.jumpUrl_.isEmpty()) {
                iF += CodedOutputStream.K(5, getJumpUrl());
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iF;
            return iF;
        }

        @Override // com.p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard.GiftLeaderboardOrBuilder
        public boolean hasConfig() {
            return this.config_ != null;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            boolean z = this.open_;
            if (z) {
                codedOutputStream.a0(1, z);
            }
            boolean z2 = this.homeStretch_;
            if (z2) {
                codedOutputStream.a0(2, z2);
            }
            if (this.config_ != null) {
                codedOutputStream.w0(3, getConfig());
            }
            for (int i = 0; i < this.current_.size(); i++) {
                codedOutputStream.w0(4, (q) this.current_.get(i));
            }
            if (this.jumpUrl_.isEmpty()) {
                return;
            }
            codedOutputStream.D0(5, getJumpUrl());
        }

        public static GiftLeaderboard parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (GiftLeaderboard) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static GiftLeaderboard parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (GiftLeaderboard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setConfig(GiftLeaderboardConfig giftLeaderboardConfig) {
            giftLeaderboardConfig.getClass();
            this.config_ = giftLeaderboardConfig;
        }

        public static final class Builder extends GeneratedMessageLite.b<GiftLeaderboard, Builder> implements GiftLeaderboardOrBuilder {
            private Builder() {
                super(GiftLeaderboard.DEFAULT_INSTANCE);
            }

            public Builder addAllCurrent(Iterable<? extends GiftLeaderboardItem> iterable) {
                copyOnWrite();
                ((GiftLeaderboard) ((GeneratedMessageLite.b) this).instance).addAllCurrent(iterable);
                return this;
            }

            public Builder addCurrent(GiftLeaderboardItem giftLeaderboardItem) {
                copyOnWrite();
                ((GiftLeaderboard) ((GeneratedMessageLite.b) this).instance).addCurrent(giftLeaderboardItem);
                return this;
            }

            public Builder clearConfig() {
                copyOnWrite();
                ((GiftLeaderboard) ((GeneratedMessageLite.b) this).instance).clearConfig();
                return this;
            }

            public Builder clearCurrent() {
                copyOnWrite();
                ((GiftLeaderboard) ((GeneratedMessageLite.b) this).instance).clearCurrent();
                return this;
            }

            public Builder clearHomeStretch() {
                copyOnWrite();
                ((GiftLeaderboard) ((GeneratedMessageLite.b) this).instance).clearHomeStretch();
                return this;
            }

            public Builder clearJumpUrl() {
                copyOnWrite();
                ((GiftLeaderboard) ((GeneratedMessageLite.b) this).instance).clearJumpUrl();
                return this;
            }

            public Builder clearOpen() {
                copyOnWrite();
                ((GiftLeaderboard) ((GeneratedMessageLite.b) this).instance).clearOpen();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard.GiftLeaderboardOrBuilder
            public GiftLeaderboardConfig getConfig() {
                return ((GiftLeaderboard) ((GeneratedMessageLite.b) this).instance).getConfig();
            }

            @Override // com.p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard.GiftLeaderboardOrBuilder
            public GiftLeaderboardItem getCurrent(int i) {
                return ((GiftLeaderboard) ((GeneratedMessageLite.b) this).instance).getCurrent(i);
            }

            @Override // com.p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard.GiftLeaderboardOrBuilder
            public int getCurrentCount() {
                return ((GiftLeaderboard) ((GeneratedMessageLite.b) this).instance).getCurrentCount();
            }

            @Override // com.p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard.GiftLeaderboardOrBuilder
            public List<GiftLeaderboardItem> getCurrentList() {
                return Collections.unmodifiableList(((GiftLeaderboard) ((GeneratedMessageLite.b) this).instance).getCurrentList());
            }

            @Override // com.p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard.GiftLeaderboardOrBuilder
            public boolean getHomeStretch() {
                return ((GiftLeaderboard) ((GeneratedMessageLite.b) this).instance).getHomeStretch();
            }

            @Override // com.p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard.GiftLeaderboardOrBuilder
            public String getJumpUrl() {
                return ((GiftLeaderboard) ((GeneratedMessageLite.b) this).instance).getJumpUrl();
            }

            @Override // com.p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard.GiftLeaderboardOrBuilder
            public ByteString getJumpUrlBytes() {
                return ((GiftLeaderboard) ((GeneratedMessageLite.b) this).instance).getJumpUrlBytes();
            }

            @Override // com.p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard.GiftLeaderboardOrBuilder
            public boolean getOpen() {
                return ((GiftLeaderboard) ((GeneratedMessageLite.b) this).instance).getOpen();
            }

            @Override // com.p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard.GiftLeaderboardOrBuilder
            public boolean hasConfig() {
                return ((GiftLeaderboard) ((GeneratedMessageLite.b) this).instance).hasConfig();
            }

            public Builder mergeConfig(GiftLeaderboardConfig giftLeaderboardConfig) {
                copyOnWrite();
                ((GiftLeaderboard) ((GeneratedMessageLite.b) this).instance).mergeConfig(giftLeaderboardConfig);
                return this;
            }

            public Builder removeCurrent(int i) {
                copyOnWrite();
                ((GiftLeaderboard) ((GeneratedMessageLite.b) this).instance).removeCurrent(i);
                return this;
            }

            public Builder setConfig(GiftLeaderboardConfig giftLeaderboardConfig) {
                copyOnWrite();
                ((GiftLeaderboard) ((GeneratedMessageLite.b) this).instance).setConfig(giftLeaderboardConfig);
                return this;
            }

            public Builder setCurrent(int i, GiftLeaderboardItem giftLeaderboardItem) {
                copyOnWrite();
                ((GiftLeaderboard) ((GeneratedMessageLite.b) this).instance).setCurrent(i, giftLeaderboardItem);
                return this;
            }

            public Builder setHomeStretch(boolean z) {
                copyOnWrite();
                ((GiftLeaderboard) ((GeneratedMessageLite.b) this).instance).setHomeStretch(z);
                return this;
            }

            public Builder setJumpUrl(String str) {
                copyOnWrite();
                ((GiftLeaderboard) ((GeneratedMessageLite.b) this).instance).setJumpUrl(str);
                return this;
            }

            public Builder setJumpUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((GiftLeaderboard) ((GeneratedMessageLite.b) this).instance).setJumpUrlBytes(byteString);
                return this;
            }

            public Builder setOpen(boolean z) {
                copyOnWrite();
                ((GiftLeaderboard) ((GeneratedMessageLite.b) this).instance).setOpen(z);
                return this;
            }

            public Builder addCurrent(int i, GiftLeaderboardItem giftLeaderboardItem) {
                copyOnWrite();
                ((GiftLeaderboard) ((GeneratedMessageLite.b) this).instance).addCurrent(i, giftLeaderboardItem);
                return this;
            }

            public Builder setConfig(GiftLeaderboardConfig.Builder builder) {
                copyOnWrite();
                ((GiftLeaderboard) ((GeneratedMessageLite.b) this).instance).setConfig(builder);
                return this;
            }

            public Builder setCurrent(int i, GiftLeaderboardItem.Builder builder) {
                copyOnWrite();
                ((GiftLeaderboard) ((GeneratedMessageLite.b) this).instance).setCurrent(i, builder);
                return this;
            }

            public Builder addCurrent(GiftLeaderboardItem.Builder builder) {
                copyOnWrite();
                ((GiftLeaderboard) ((GeneratedMessageLite.b) this).instance).addCurrent(builder);
                return this;
            }

            public Builder addCurrent(int i, GiftLeaderboardItem.Builder builder) {
                copyOnWrite();
                ((GiftLeaderboard) ((GeneratedMessageLite.b) this).instance).addCurrent(i, builder);
                return this;
            }
        }

        public static GiftLeaderboard parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (GiftLeaderboard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static GiftLeaderboard parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (GiftLeaderboard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static GiftLeaderboard parseFrom(InputStream inputStream) throws IOException {
            return (GiftLeaderboard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GiftLeaderboard parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (GiftLeaderboard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static GiftLeaderboard parseFrom(e eVar) throws IOException {
            return (GiftLeaderboard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addCurrent(int i, GiftLeaderboardItem giftLeaderboardItem) {
            giftLeaderboardItem.getClass();
            ensureCurrentIsMutable();
            this.current_.add(i, giftLeaderboardItem);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static GiftLeaderboard parseFrom(e eVar, h hVar) throws IOException {
            return (GiftLeaderboard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
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
            this.current_.add(i, (GiftLeaderboardItem) builder.build());
        }
    }

    public static final class GiftLeaderboardConfig extends GeneratedMessageLite<GiftLeaderboardConfig, Builder> implements GiftLeaderboardConfigOrBuilder {
        private static final GiftLeaderboardConfig DEFAULT_INSTANCE;
        private static volatile i860<GiftLeaderboardConfig> PARSER = null;
        public static final int POLLINGINTERVALINSECONDS_FIELD_NUMBER = 1;
        public static final int SCROLLINTERVALINSECONDS_FIELD_NUMBER = 2;
        private long pollingIntervalInSeconds_;
        private long scrollIntervalInSeconds_;

        public static final class Builder extends GeneratedMessageLite.b<GiftLeaderboardConfig, Builder> implements GiftLeaderboardConfigOrBuilder {
            private Builder() {
                super(GiftLeaderboardConfig.DEFAULT_INSTANCE);
            }

            public Builder clearPollingIntervalInSeconds() {
                copyOnWrite();
                ((GiftLeaderboardConfig) ((GeneratedMessageLite.b) this).instance).clearPollingIntervalInSeconds();
                return this;
            }

            public Builder clearScrollIntervalInSeconds() {
                copyOnWrite();
                ((GiftLeaderboardConfig) ((GeneratedMessageLite.b) this).instance).clearScrollIntervalInSeconds();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard.GiftLeaderboardConfigOrBuilder
            public long getPollingIntervalInSeconds() {
                return ((GiftLeaderboardConfig) ((GeneratedMessageLite.b) this).instance).getPollingIntervalInSeconds();
            }

            @Override // com.p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard.GiftLeaderboardConfigOrBuilder
            public long getScrollIntervalInSeconds() {
                return ((GiftLeaderboardConfig) ((GeneratedMessageLite.b) this).instance).getScrollIntervalInSeconds();
            }

            public Builder setPollingIntervalInSeconds(long j) {
                copyOnWrite();
                ((GiftLeaderboardConfig) ((GeneratedMessageLite.b) this).instance).setPollingIntervalInSeconds(j);
                return this;
            }

            public Builder setScrollIntervalInSeconds(long j) {
                copyOnWrite();
                ((GiftLeaderboardConfig) ((GeneratedMessageLite.b) this).instance).setScrollIntervalInSeconds(j);
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
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(giftLeaderboardConfig);
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

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C03351.f1645xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new GiftLeaderboardConfig();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    GiftLeaderboardConfig giftLeaderboardConfig = (GiftLeaderboardConfig) obj2;
                    long j = this.pollingIntervalInSeconds_;
                    boolean z2 = j != 0;
                    long j2 = giftLeaderboardConfig.pollingIntervalInSeconds_;
                    this.pollingIntervalInSeconds_ = hVar.i(z2, j, j2 != 0, j2);
                    boolean z3 = false;
                    long j3 = this.scrollIntervalInSeconds_;
                    if (j3 != 0) {
                        z3 = true;
                    }
                    long j4 = giftLeaderboardConfig.scrollIntervalInSeconds_;
                    this.scrollIntervalInSeconds_ = hVar.i(z3, j3, j4 != 0, j4);
                    GeneratedMessageLite.g gVar = GeneratedMessageLite.g.INSTANCE;
                    return this;
                case 6:
                    e eVar = (e) obj;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            if (iM != 0) {
                                if (iM == 8) {
                                    this.pollingIntervalInSeconds_ = eVar.v();
                                } else if (iM == 16) {
                                    this.scrollIntervalInSeconds_ = eVar.v();
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
                        synchronized (GiftLeaderboardConfig.class) {
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

        @Override // com.p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard.GiftLeaderboardConfigOrBuilder
        public long getPollingIntervalInSeconds() {
            return this.pollingIntervalInSeconds_;
        }

        @Override // com.p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard.GiftLeaderboardConfigOrBuilder
        public long getScrollIntervalInSeconds() {
            return this.scrollIntervalInSeconds_;
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            long j = this.pollingIntervalInSeconds_;
            int iV = j != 0 ? CodedOutputStream.v(1, j) : 0;
            long j2 = this.scrollIntervalInSeconds_;
            if (j2 != 0) {
                iV += CodedOutputStream.v(2, j2);
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iV;
            return iV;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            long j = this.pollingIntervalInSeconds_;
            if (j != 0) {
                codedOutputStream.u0(1, j);
            }
            long j2 = this.scrollIntervalInSeconds_;
            if (j2 != 0) {
                codedOutputStream.u0(2, j2);
            }
        }

        public static GiftLeaderboardConfig parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (GiftLeaderboardConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static GiftLeaderboardConfig parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (GiftLeaderboardConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static GiftLeaderboardConfig parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (GiftLeaderboardConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static GiftLeaderboardConfig parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (GiftLeaderboardConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static GiftLeaderboardConfig parseFrom(InputStream inputStream) throws IOException {
            return (GiftLeaderboardConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GiftLeaderboardConfig parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (GiftLeaderboardConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static GiftLeaderboardConfig parseFrom(e eVar) throws IOException {
            return (GiftLeaderboardConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static GiftLeaderboardConfig parseFrom(e eVar, h hVar) throws IOException {
            return (GiftLeaderboardConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
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

        public static final class Builder extends GeneratedMessageLite.b<GiftLeaderboardItem, Builder> implements GiftLeaderboardItemOrBuilder {
            private Builder() {
                super(GiftLeaderboardItem.DEFAULT_INSTANCE);
            }

            public Builder clearAmount() {
                copyOnWrite();
                ((GiftLeaderboardItem) ((GeneratedMessageLite.b) this).instance).clearAmount();
                return this;
            }

            public Builder clearGap() {
                copyOnWrite();
                ((GiftLeaderboardItem) ((GeneratedMessageLite.b) this).instance).clearGap();
                return this;
            }

            public Builder clearGiftIcon() {
                copyOnWrite();
                ((GiftLeaderboardItem) ((GeneratedMessageLite.b) this).instance).clearGiftIcon();
                return this;
            }

            public Builder clearGiftId() {
                copyOnWrite();
                ((GiftLeaderboardItem) ((GeneratedMessageLite.b) this).instance).clearGiftId();
                return this;
            }

            public Builder clearName() {
                copyOnWrite();
                ((GiftLeaderboardItem) ((GeneratedMessageLite.b) this).instance).clearName();
                return this;
            }

            public Builder clearRank() {
                copyOnWrite();
                ((GiftLeaderboardItem) ((GeneratedMessageLite.b) this).instance).clearRank();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard.GiftLeaderboardItemOrBuilder
            public long getAmount() {
                return ((GiftLeaderboardItem) ((GeneratedMessageLite.b) this).instance).getAmount();
            }

            @Override // com.p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard.GiftLeaderboardItemOrBuilder
            public long getGap() {
                return ((GiftLeaderboardItem) ((GeneratedMessageLite.b) this).instance).getGap();
            }

            @Override // com.p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard.GiftLeaderboardItemOrBuilder
            public String getGiftIcon() {
                return ((GiftLeaderboardItem) ((GeneratedMessageLite.b) this).instance).getGiftIcon();
            }

            @Override // com.p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard.GiftLeaderboardItemOrBuilder
            public ByteString getGiftIconBytes() {
                return ((GiftLeaderboardItem) ((GeneratedMessageLite.b) this).instance).getGiftIconBytes();
            }

            @Override // com.p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard.GiftLeaderboardItemOrBuilder
            public String getGiftId() {
                return ((GiftLeaderboardItem) ((GeneratedMessageLite.b) this).instance).getGiftId();
            }

            @Override // com.p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard.GiftLeaderboardItemOrBuilder
            public ByteString getGiftIdBytes() {
                return ((GiftLeaderboardItem) ((GeneratedMessageLite.b) this).instance).getGiftIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard.GiftLeaderboardItemOrBuilder
            public String getName() {
                return ((GiftLeaderboardItem) ((GeneratedMessageLite.b) this).instance).getName();
            }

            @Override // com.p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard.GiftLeaderboardItemOrBuilder
            public ByteString getNameBytes() {
                return ((GiftLeaderboardItem) ((GeneratedMessageLite.b) this).instance).getNameBytes();
            }

            @Override // com.p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard.GiftLeaderboardItemOrBuilder
            public long getRank() {
                return ((GiftLeaderboardItem) ((GeneratedMessageLite.b) this).instance).getRank();
            }

            public Builder setAmount(long j) {
                copyOnWrite();
                ((GiftLeaderboardItem) ((GeneratedMessageLite.b) this).instance).setAmount(j);
                return this;
            }

            public Builder setGap(long j) {
                copyOnWrite();
                ((GiftLeaderboardItem) ((GeneratedMessageLite.b) this).instance).setGap(j);
                return this;
            }

            public Builder setGiftIcon(String str) {
                copyOnWrite();
                ((GiftLeaderboardItem) ((GeneratedMessageLite.b) this).instance).setGiftIcon(str);
                return this;
            }

            public Builder setGiftIconBytes(ByteString byteString) {
                copyOnWrite();
                ((GiftLeaderboardItem) ((GeneratedMessageLite.b) this).instance).setGiftIconBytes(byteString);
                return this;
            }

            public Builder setGiftId(String str) {
                copyOnWrite();
                ((GiftLeaderboardItem) ((GeneratedMessageLite.b) this).instance).setGiftId(str);
                return this;
            }

            public Builder setGiftIdBytes(ByteString byteString) {
                copyOnWrite();
                ((GiftLeaderboardItem) ((GeneratedMessageLite.b) this).instance).setGiftIdBytes(byteString);
                return this;
            }

            public Builder setName(String str) {
                copyOnWrite();
                ((GiftLeaderboardItem) ((GeneratedMessageLite.b) this).instance).setName(str);
                return this;
            }

            public Builder setNameBytes(ByteString byteString) {
                copyOnWrite();
                ((GiftLeaderboardItem) ((GeneratedMessageLite.b) this).instance).setNameBytes(byteString);
                return this;
            }

            public Builder setRank(long j) {
                copyOnWrite();
                ((GiftLeaderboardItem) ((GeneratedMessageLite.b) this).instance).setRank(j);
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
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(giftLeaderboardItem);
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
            a.checkByteStringIsUtf8(byteString);
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
            a.checkByteStringIsUtf8(byteString);
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
            a.checkByteStringIsUtf8(byteString);
            this.name_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRank(long j) {
            this.rank_ = j;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C03351.f1645xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new GiftLeaderboardItem();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    GiftLeaderboardItem giftLeaderboardItem = (GiftLeaderboardItem) obj2;
                    this.name_ = hVar.f(!this.name_.isEmpty(), this.name_, !giftLeaderboardItem.name_.isEmpty(), giftLeaderboardItem.name_);
                    this.giftId_ = hVar.f(!this.giftId_.isEmpty(), this.giftId_, !giftLeaderboardItem.giftId_.isEmpty(), giftLeaderboardItem.giftId_);
                    this.giftIcon_ = hVar.f(!this.giftIcon_.isEmpty(), this.giftIcon_, !giftLeaderboardItem.giftIcon_.isEmpty(), giftLeaderboardItem.giftIcon_);
                    long j = this.amount_;
                    boolean z2 = j != 0;
                    long j2 = giftLeaderboardItem.amount_;
                    this.amount_ = hVar.i(z2, j, j2 != 0, j2);
                    long j3 = this.rank_;
                    boolean z3 = j3 != 0;
                    long j4 = giftLeaderboardItem.rank_;
                    this.rank_ = hVar.i(z3, j3, j4 != 0, j4);
                    boolean z4 = false;
                    long j5 = this.gap_;
                    if (j5 != 0) {
                        z4 = true;
                    }
                    long j6 = giftLeaderboardItem.gap_;
                    this.gap_ = hVar.i(z4, j5, j6 != 0, j6);
                    GeneratedMessageLite.g gVar = GeneratedMessageLite.g.INSTANCE;
                    return this;
                case 6:
                    e eVar = (e) obj;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            if (iM != 0) {
                                if (iM == 10) {
                                    this.name_ = eVar.L();
                                } else if (iM == 18) {
                                    this.giftId_ = eVar.L();
                                } else if (iM == 26) {
                                    this.giftIcon_ = eVar.L();
                                } else if (iM == 32) {
                                    this.amount_ = eVar.v();
                                } else if (iM == 40) {
                                    this.rank_ = eVar.v();
                                } else if (iM == 48) {
                                    this.gap_ = eVar.v();
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
                        synchronized (GiftLeaderboardItem.class) {
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

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iK = !this.name_.isEmpty() ? CodedOutputStream.K(1, getName()) : 0;
            if (!this.giftId_.isEmpty()) {
                iK += CodedOutputStream.K(2, getGiftId());
            }
            if (!this.giftIcon_.isEmpty()) {
                iK += CodedOutputStream.K(3, getGiftIcon());
            }
            long j = this.amount_;
            if (j != 0) {
                iK += CodedOutputStream.v(4, j);
            }
            long j2 = this.rank_;
            if (j2 != 0) {
                iK += CodedOutputStream.v(5, j2);
            }
            long j3 = this.gap_;
            if (j3 != 0) {
                iK += CodedOutputStream.v(6, j3);
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iK;
            return iK;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.name_.isEmpty()) {
                codedOutputStream.D0(1, getName());
            }
            if (!this.giftId_.isEmpty()) {
                codedOutputStream.D0(2, getGiftId());
            }
            if (!this.giftIcon_.isEmpty()) {
                codedOutputStream.D0(3, getGiftIcon());
            }
            long j = this.amount_;
            if (j != 0) {
                codedOutputStream.u0(4, j);
            }
            long j2 = this.rank_;
            if (j2 != 0) {
                codedOutputStream.u0(5, j2);
            }
            long j3 = this.gap_;
            if (j3 != 0) {
                codedOutputStream.u0(6, j3);
            }
        }

        public static GiftLeaderboardItem parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (GiftLeaderboardItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static GiftLeaderboardItem parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (GiftLeaderboardItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static GiftLeaderboardItem parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (GiftLeaderboardItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static GiftLeaderboardItem parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (GiftLeaderboardItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static GiftLeaderboardItem parseFrom(InputStream inputStream) throws IOException {
            return (GiftLeaderboardItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GiftLeaderboardItem parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (GiftLeaderboardItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static GiftLeaderboardItem parseFrom(e eVar) throws IOException {
            return (GiftLeaderboardItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static GiftLeaderboardItem parseFrom(e eVar, h hVar) throws IOException {
            return (GiftLeaderboardItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
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
                this.template_ = (TemplateData) ((TemplateData.Builder) TemplateData.newBuilder(this.template_).mergeFrom(templateData)).buildPartial();
            }
        }

        public static Builder newBuilder(GiftLeaderboardTopEffect giftLeaderboardTopEffect) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(giftLeaderboardTopEffect);
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
            a.checkByteStringIsUtf8(byteString);
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
            a.checkByteStringIsUtf8(byteString);
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
            a.checkByteStringIsUtf8(byteString);
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
            a.checkByteStringIsUtf8(byteString);
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
            a.checkByteStringIsUtf8(byteString);
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
            a.checkByteStringIsUtf8(byteString);
            this.startBackendColor_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTemplate(TemplateData.Builder builder) {
            this.template_ = (TemplateData) builder.build();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C03351.f1645xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new GiftLeaderboardTopEffect();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    GiftLeaderboardTopEffect giftLeaderboardTopEffect = (GiftLeaderboardTopEffect) obj2;
                    this.template_ = hVar.o(this.template_, giftLeaderboardTopEffect.template_);
                    this.startBackendColor_ = hVar.f(!this.startBackendColor_.isEmpty(), this.startBackendColor_, !giftLeaderboardTopEffect.startBackendColor_.isEmpty(), giftLeaderboardTopEffect.startBackendColor_);
                    this.endBackendColor_ = hVar.f(!this.endBackendColor_.isEmpty(), this.endBackendColor_, !giftLeaderboardTopEffect.endBackendColor_.isEmpty(), giftLeaderboardTopEffect.endBackendColor_);
                    long j = this.duration_;
                    boolean z2 = j != 0;
                    long j2 = giftLeaderboardTopEffect.duration_;
                    this.duration_ = hVar.i(z2, j, j2 != 0, j2);
                    this.roomId_ = hVar.f(!this.roomId_.isEmpty(), this.roomId_, !giftLeaderboardTopEffect.roomId_.isEmpty(), giftLeaderboardTopEffect.roomId_);
                    this.backgroundUrl_ = hVar.f(!this.backgroundUrl_.isEmpty(), this.backgroundUrl_, !giftLeaderboardTopEffect.backgroundUrl_.isEmpty(), giftLeaderboardTopEffect.backgroundUrl_);
                    this.backgroundSvgaUrl_ = hVar.f(!this.backgroundSvgaUrl_.isEmpty(), this.backgroundSvgaUrl_, !giftLeaderboardTopEffect.backgroundSvgaUrl_.isEmpty(), giftLeaderboardTopEffect.backgroundSvgaUrl_);
                    this.effectBackgroundUrl_ = hVar.f(!this.effectBackgroundUrl_.isEmpty(), this.effectBackgroundUrl_, !giftLeaderboardTopEffect.effectBackgroundUrl_.isEmpty(), giftLeaderboardTopEffect.effectBackgroundUrl_);
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
                                    TemplateData templateData = this.template_;
                                    TemplateData.Builder builder = templateData != null ? (TemplateData.Builder) templateData.toBuilder() : null;
                                    TemplateData templateDataW = eVar.w(TemplateData.parser(), hVar2);
                                    this.template_ = templateDataW;
                                    if (builder != null) {
                                        builder.mergeFrom(templateDataW);
                                        this.template_ = (TemplateData) builder.buildPartial();
                                    }
                                } else if (iM == 18) {
                                    this.startBackendColor_ = eVar.L();
                                } else if (iM == 26) {
                                    this.endBackendColor_ = eVar.L();
                                } else if (iM == 32) {
                                    this.duration_ = eVar.v();
                                } else if (iM == 42) {
                                    this.roomId_ = eVar.L();
                                } else if (iM == 50) {
                                    this.backgroundUrl_ = eVar.L();
                                } else if (iM == 58) {
                                    this.backgroundSvgaUrl_ = eVar.L();
                                } else if (iM == 66) {
                                    this.effectBackgroundUrl_ = eVar.L();
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
                        synchronized (GiftLeaderboardTopEffect.class) {
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

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iC = this.template_ != null ? CodedOutputStream.C(1, getTemplate()) : 0;
            if (!this.startBackendColor_.isEmpty()) {
                iC += CodedOutputStream.K(2, getStartBackendColor());
            }
            if (!this.endBackendColor_.isEmpty()) {
                iC += CodedOutputStream.K(3, getEndBackendColor());
            }
            long j = this.duration_;
            if (j != 0) {
                iC += CodedOutputStream.v(4, j);
            }
            if (!this.roomId_.isEmpty()) {
                iC += CodedOutputStream.K(5, getRoomId());
            }
            if (!this.backgroundUrl_.isEmpty()) {
                iC += CodedOutputStream.K(6, getBackgroundUrl());
            }
            if (!this.backgroundSvgaUrl_.isEmpty()) {
                iC += CodedOutputStream.K(7, getBackgroundSvgaUrl());
            }
            if (!this.effectBackgroundUrl_.isEmpty()) {
                iC += CodedOutputStream.K(8, getEffectBackgroundUrl());
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iC;
            return iC;
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

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.template_ != null) {
                codedOutputStream.w0(1, getTemplate());
            }
            if (!this.startBackendColor_.isEmpty()) {
                codedOutputStream.D0(2, getStartBackendColor());
            }
            if (!this.endBackendColor_.isEmpty()) {
                codedOutputStream.D0(3, getEndBackendColor());
            }
            long j = this.duration_;
            if (j != 0) {
                codedOutputStream.u0(4, j);
            }
            if (!this.roomId_.isEmpty()) {
                codedOutputStream.D0(5, getRoomId());
            }
            if (!this.backgroundUrl_.isEmpty()) {
                codedOutputStream.D0(6, getBackgroundUrl());
            }
            if (!this.backgroundSvgaUrl_.isEmpty()) {
                codedOutputStream.D0(7, getBackgroundSvgaUrl());
            }
            if (this.effectBackgroundUrl_.isEmpty()) {
                return;
            }
            codedOutputStream.D0(8, getEffectBackgroundUrl());
        }

        public static GiftLeaderboardTopEffect parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (GiftLeaderboardTopEffect) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static GiftLeaderboardTopEffect parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (GiftLeaderboardTopEffect) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTemplate(TemplateData templateData) {
            templateData.getClass();
            this.template_ = templateData;
        }

        public static final class Builder extends GeneratedMessageLite.b<GiftLeaderboardTopEffect, Builder> implements GiftLeaderboardTopEffectOrBuilder {
            private Builder() {
                super(GiftLeaderboardTopEffect.DEFAULT_INSTANCE);
            }

            public Builder clearBackgroundSvgaUrl() {
                copyOnWrite();
                ((GiftLeaderboardTopEffect) ((GeneratedMessageLite.b) this).instance).clearBackgroundSvgaUrl();
                return this;
            }

            public Builder clearBackgroundUrl() {
                copyOnWrite();
                ((GiftLeaderboardTopEffect) ((GeneratedMessageLite.b) this).instance).clearBackgroundUrl();
                return this;
            }

            public Builder clearDuration() {
                copyOnWrite();
                ((GiftLeaderboardTopEffect) ((GeneratedMessageLite.b) this).instance).clearDuration();
                return this;
            }

            public Builder clearEffectBackgroundUrl() {
                copyOnWrite();
                ((GiftLeaderboardTopEffect) ((GeneratedMessageLite.b) this).instance).clearEffectBackgroundUrl();
                return this;
            }

            public Builder clearEndBackendColor() {
                copyOnWrite();
                ((GiftLeaderboardTopEffect) ((GeneratedMessageLite.b) this).instance).clearEndBackendColor();
                return this;
            }

            public Builder clearRoomId() {
                copyOnWrite();
                ((GiftLeaderboardTopEffect) ((GeneratedMessageLite.b) this).instance).clearRoomId();
                return this;
            }

            public Builder clearStartBackendColor() {
                copyOnWrite();
                ((GiftLeaderboardTopEffect) ((GeneratedMessageLite.b) this).instance).clearStartBackendColor();
                return this;
            }

            public Builder clearTemplate() {
                copyOnWrite();
                ((GiftLeaderboardTopEffect) ((GeneratedMessageLite.b) this).instance).clearTemplate();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard.GiftLeaderboardTopEffectOrBuilder
            public String getBackgroundSvgaUrl() {
                return ((GiftLeaderboardTopEffect) ((GeneratedMessageLite.b) this).instance).getBackgroundSvgaUrl();
            }

            @Override // com.p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard.GiftLeaderboardTopEffectOrBuilder
            public ByteString getBackgroundSvgaUrlBytes() {
                return ((GiftLeaderboardTopEffect) ((GeneratedMessageLite.b) this).instance).getBackgroundSvgaUrlBytes();
            }

            @Override // com.p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard.GiftLeaderboardTopEffectOrBuilder
            public String getBackgroundUrl() {
                return ((GiftLeaderboardTopEffect) ((GeneratedMessageLite.b) this).instance).getBackgroundUrl();
            }

            @Override // com.p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard.GiftLeaderboardTopEffectOrBuilder
            public ByteString getBackgroundUrlBytes() {
                return ((GiftLeaderboardTopEffect) ((GeneratedMessageLite.b) this).instance).getBackgroundUrlBytes();
            }

            @Override // com.p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard.GiftLeaderboardTopEffectOrBuilder
            public long getDuration() {
                return ((GiftLeaderboardTopEffect) ((GeneratedMessageLite.b) this).instance).getDuration();
            }

            @Override // com.p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard.GiftLeaderboardTopEffectOrBuilder
            public String getEffectBackgroundUrl() {
                return ((GiftLeaderboardTopEffect) ((GeneratedMessageLite.b) this).instance).getEffectBackgroundUrl();
            }

            @Override // com.p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard.GiftLeaderboardTopEffectOrBuilder
            public ByteString getEffectBackgroundUrlBytes() {
                return ((GiftLeaderboardTopEffect) ((GeneratedMessageLite.b) this).instance).getEffectBackgroundUrlBytes();
            }

            @Override // com.p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard.GiftLeaderboardTopEffectOrBuilder
            public String getEndBackendColor() {
                return ((GiftLeaderboardTopEffect) ((GeneratedMessageLite.b) this).instance).getEndBackendColor();
            }

            @Override // com.p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard.GiftLeaderboardTopEffectOrBuilder
            public ByteString getEndBackendColorBytes() {
                return ((GiftLeaderboardTopEffect) ((GeneratedMessageLite.b) this).instance).getEndBackendColorBytes();
            }

            @Override // com.p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard.GiftLeaderboardTopEffectOrBuilder
            public String getRoomId() {
                return ((GiftLeaderboardTopEffect) ((GeneratedMessageLite.b) this).instance).getRoomId();
            }

            @Override // com.p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard.GiftLeaderboardTopEffectOrBuilder
            public ByteString getRoomIdBytes() {
                return ((GiftLeaderboardTopEffect) ((GeneratedMessageLite.b) this).instance).getRoomIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard.GiftLeaderboardTopEffectOrBuilder
            public String getStartBackendColor() {
                return ((GiftLeaderboardTopEffect) ((GeneratedMessageLite.b) this).instance).getStartBackendColor();
            }

            @Override // com.p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard.GiftLeaderboardTopEffectOrBuilder
            public ByteString getStartBackendColorBytes() {
                return ((GiftLeaderboardTopEffect) ((GeneratedMessageLite.b) this).instance).getStartBackendColorBytes();
            }

            @Override // com.p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard.GiftLeaderboardTopEffectOrBuilder
            public TemplateData getTemplate() {
                return ((GiftLeaderboardTopEffect) ((GeneratedMessageLite.b) this).instance).getTemplate();
            }

            @Override // com.p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard.GiftLeaderboardTopEffectOrBuilder
            public boolean hasTemplate() {
                return ((GiftLeaderboardTopEffect) ((GeneratedMessageLite.b) this).instance).hasTemplate();
            }

            public Builder mergeTemplate(TemplateData templateData) {
                copyOnWrite();
                ((GiftLeaderboardTopEffect) ((GeneratedMessageLite.b) this).instance).mergeTemplate(templateData);
                return this;
            }

            public Builder setBackgroundSvgaUrl(String str) {
                copyOnWrite();
                ((GiftLeaderboardTopEffect) ((GeneratedMessageLite.b) this).instance).setBackgroundSvgaUrl(str);
                return this;
            }

            public Builder setBackgroundSvgaUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((GiftLeaderboardTopEffect) ((GeneratedMessageLite.b) this).instance).setBackgroundSvgaUrlBytes(byteString);
                return this;
            }

            public Builder setBackgroundUrl(String str) {
                copyOnWrite();
                ((GiftLeaderboardTopEffect) ((GeneratedMessageLite.b) this).instance).setBackgroundUrl(str);
                return this;
            }

            public Builder setBackgroundUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((GiftLeaderboardTopEffect) ((GeneratedMessageLite.b) this).instance).setBackgroundUrlBytes(byteString);
                return this;
            }

            public Builder setDuration(long j) {
                copyOnWrite();
                ((GiftLeaderboardTopEffect) ((GeneratedMessageLite.b) this).instance).setDuration(j);
                return this;
            }

            public Builder setEffectBackgroundUrl(String str) {
                copyOnWrite();
                ((GiftLeaderboardTopEffect) ((GeneratedMessageLite.b) this).instance).setEffectBackgroundUrl(str);
                return this;
            }

            public Builder setEffectBackgroundUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((GiftLeaderboardTopEffect) ((GeneratedMessageLite.b) this).instance).setEffectBackgroundUrlBytes(byteString);
                return this;
            }

            public Builder setEndBackendColor(String str) {
                copyOnWrite();
                ((GiftLeaderboardTopEffect) ((GeneratedMessageLite.b) this).instance).setEndBackendColor(str);
                return this;
            }

            public Builder setEndBackendColorBytes(ByteString byteString) {
                copyOnWrite();
                ((GiftLeaderboardTopEffect) ((GeneratedMessageLite.b) this).instance).setEndBackendColorBytes(byteString);
                return this;
            }

            public Builder setRoomId(String str) {
                copyOnWrite();
                ((GiftLeaderboardTopEffect) ((GeneratedMessageLite.b) this).instance).setRoomId(str);
                return this;
            }

            public Builder setRoomIdBytes(ByteString byteString) {
                copyOnWrite();
                ((GiftLeaderboardTopEffect) ((GeneratedMessageLite.b) this).instance).setRoomIdBytes(byteString);
                return this;
            }

            public Builder setStartBackendColor(String str) {
                copyOnWrite();
                ((GiftLeaderboardTopEffect) ((GeneratedMessageLite.b) this).instance).setStartBackendColor(str);
                return this;
            }

            public Builder setStartBackendColorBytes(ByteString byteString) {
                copyOnWrite();
                ((GiftLeaderboardTopEffect) ((GeneratedMessageLite.b) this).instance).setStartBackendColorBytes(byteString);
                return this;
            }

            public Builder setTemplate(TemplateData templateData) {
                copyOnWrite();
                ((GiftLeaderboardTopEffect) ((GeneratedMessageLite.b) this).instance).setTemplate(templateData);
                return this;
            }

            public Builder setTemplate(TemplateData.Builder builder) {
                copyOnWrite();
                ((GiftLeaderboardTopEffect) ((GeneratedMessageLite.b) this).instance).setTemplate(builder);
                return this;
            }
        }

        public static GiftLeaderboardTopEffect parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (GiftLeaderboardTopEffect) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static GiftLeaderboardTopEffect parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (GiftLeaderboardTopEffect) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static GiftLeaderboardTopEffect parseFrom(InputStream inputStream) throws IOException {
            return (GiftLeaderboardTopEffect) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GiftLeaderboardTopEffect parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (GiftLeaderboardTopEffect) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static GiftLeaderboardTopEffect parseFrom(e eVar) throws IOException {
            return (GiftLeaderboardTopEffect) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static GiftLeaderboardTopEffect parseFrom(e eVar, h hVar) throws IOException {
            return (GiftLeaderboardTopEffect) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
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

            @Override // com.p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard.TemplateDataOrBuilder
            public String getFields(int i) {
                return ((TemplateData) ((GeneratedMessageLite.b) this).instance).getFields(i);
            }

            @Override // com.p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard.TemplateDataOrBuilder
            public ByteString getFieldsBytes(int i) {
                return ((TemplateData) ((GeneratedMessageLite.b) this).instance).getFieldsBytes(i);
            }

            @Override // com.p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard.TemplateDataOrBuilder
            public int getFieldsCount() {
                return ((TemplateData) ((GeneratedMessageLite.b) this).instance).getFieldsCount();
            }

            @Override // com.p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard.TemplateDataOrBuilder
            public List<String> getFieldsList() {
                return Collections.unmodifiableList(((TemplateData) ((GeneratedMessageLite.b) this).instance).getFieldsList());
            }

            @Override // com.p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard.TemplateDataOrBuilder
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
            switch (C03351.f1645xa1df5c61[methodToInvoke.ordinal()]) {
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

        @Override // com.p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard.TemplateDataOrBuilder
        public String getFields(int i) {
            return (String) this.fields_.get(i);
        }

        @Override // com.p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard.TemplateDataOrBuilder
        public ByteString getFieldsBytes(int i) {
            return ByteString.copyFromUtf8((String) this.fields_.get(i));
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
}
