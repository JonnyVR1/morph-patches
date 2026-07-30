package com.p051p1.mobile.longlink.msg.voicelivemessage;

import com.google.protobuf.AbstractC3426a;
import com.google.protobuf.ByteString;
import com.google.protobuf.C3430e;
import com.google.protobuf.C3433h;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InterfaceC3442q;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.io.InputStream;
import p153l.iig0;
import p153l.l710;
import p153l.lfz;
import p153l.ng60;

/* JADX INFO: loaded from: classes9.dex */
public final class VoiceFunnyAvatar {

    /* JADX INFO: renamed from: com.p1.mobile.longlink.msg.voicelivemessage.VoiceFunnyAvatar$1 */
    public static /* synthetic */ class C47111 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16722xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f16722xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16722xa1df5c61[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16722xa1df5c61[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16722xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16722xa1df5c61[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16722xa1df5c61[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16722xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f16722xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public interface VoiceLivePhotoStickerOrBuilder extends lfz {
        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        VoiceLiveRankingBoard.PictureConfig getFrameConfig();

        String getPthotoType();

        ByteString getPthotoTypeBytes();

        long getServerTimeInSeconds();

        String getUserId();

        ByteString getUserIdBytes();

        boolean hasFrameConfig();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    private VoiceFunnyAvatar() {
    }

    public static void registerAllExtensions(C3433h c3433h) {
    }

    public static final class VoiceLivePhotoSticker extends GeneratedMessageLite<VoiceLivePhotoSticker, Builder> implements VoiceLivePhotoStickerOrBuilder {
        private static final VoiceLivePhotoSticker DEFAULT_INSTANCE;
        public static final int FRAMECONFIG_FIELD_NUMBER = 3;
        private static volatile ng60<VoiceLivePhotoSticker> PARSER = null;
        public static final int PTHOTOTYPE_FIELD_NUMBER = 2;
        public static final int SERVERTIMEINSECONDS_FIELD_NUMBER = 4;
        public static final int USERID_FIELD_NUMBER = 1;
        private VoiceLiveRankingBoard.PictureConfig frameConfig_;
        private long serverTimeInSeconds_;
        private String userId_ = "";
        private String pthotoType_ = "";

        static {
            VoiceLivePhotoSticker voiceLivePhotoSticker = new VoiceLivePhotoSticker();
            DEFAULT_INSTANCE = voiceLivePhotoSticker;
            voiceLivePhotoSticker.makeImmutable();
        }

        private VoiceLivePhotoSticker() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFrameConfig() {
            this.frameConfig_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPthotoType() {
            this.pthotoType_ = getDefaultInstance().getPthotoType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearServerTimeInSeconds() {
            this.serverTimeInSeconds_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUserId() {
            this.userId_ = getDefaultInstance().getUserId();
        }

        public static VoiceLivePhotoSticker getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeFrameConfig(VoiceLiveRankingBoard.PictureConfig pictureConfig) {
            VoiceLiveRankingBoard.PictureConfig pictureConfig2 = this.frameConfig_;
            if (pictureConfig2 == null || pictureConfig2 == VoiceLiveRankingBoard.PictureConfig.getDefaultInstance()) {
                this.frameConfig_ = pictureConfig;
            } else {
                this.frameConfig_ = VoiceLiveRankingBoard.PictureConfig.newBuilder(this.frameConfig_).mergeFrom(pictureConfig).buildPartial();
            }
        }

        public static Builder newBuilder(VoiceLivePhotoSticker voiceLivePhotoSticker) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(voiceLivePhotoSticker);
        }

        public static VoiceLivePhotoSticker parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VoiceLivePhotoSticker) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceLivePhotoSticker parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VoiceLivePhotoSticker) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<VoiceLivePhotoSticker> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFrameConfig(VoiceLiveRankingBoard.PictureConfig.Builder builder) {
            this.frameConfig_ = builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPthotoType(String str) {
            str.getClass();
            this.pthotoType_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPthotoTypeBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.pthotoType_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setServerTimeInSeconds(long j) {
            this.serverTimeInSeconds_ = j;
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
            switch (C47111.f16722xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoiceLivePhotoSticker();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    VoiceLivePhotoSticker voiceLivePhotoSticker = (VoiceLivePhotoSticker) obj2;
                    this.userId_ = interfaceC3409h.mo17052f(!this.userId_.isEmpty(), this.userId_, !voiceLivePhotoSticker.userId_.isEmpty(), voiceLivePhotoSticker.userId_);
                    this.pthotoType_ = interfaceC3409h.mo17052f(!this.pthotoType_.isEmpty(), this.pthotoType_, !voiceLivePhotoSticker.pthotoType_.isEmpty(), voiceLivePhotoSticker.pthotoType_);
                    this.frameConfig_ = (VoiceLiveRankingBoard.PictureConfig) interfaceC3409h.mo17061o(this.frameConfig_, voiceLivePhotoSticker.frameConfig_);
                    long j = this.serverTimeInSeconds_;
                    boolean z2 = j != 0;
                    long j2 = voiceLivePhotoSticker.serverTimeInSeconds_;
                    this.serverTimeInSeconds_ = interfaceC3409h.mo17055i(z2, j, j2 != 0, j2);
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
                                    this.pthotoType_ = c3430e.m17170L();
                                } else if (iM17171M == 26) {
                                    VoiceLiveRankingBoard.PictureConfig pictureConfig = this.frameConfig_;
                                    VoiceLiveRankingBoard.PictureConfig.Builder builder = pictureConfig != null ? pictureConfig.toBuilder() : null;
                                    VoiceLiveRankingBoard.PictureConfig pictureConfig2 = (VoiceLiveRankingBoard.PictureConfig) c3430e.m17198w(VoiceLiveRankingBoard.PictureConfig.parser(), c3433h);
                                    this.frameConfig_ = pictureConfig2;
                                    if (builder != null) {
                                        builder.mergeFrom(pictureConfig2);
                                        this.frameConfig_ = builder.buildPartial();
                                    }
                                } else if (iM17171M == 32) {
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
                        synchronized (VoiceLivePhotoSticker.class) {
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

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceFunnyAvatar.VoiceLivePhotoStickerOrBuilder
        public VoiceLiveRankingBoard.PictureConfig getFrameConfig() {
            VoiceLiveRankingBoard.PictureConfig pictureConfig = this.frameConfig_;
            return pictureConfig == null ? VoiceLiveRankingBoard.PictureConfig.getDefaultInstance() : pictureConfig;
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceFunnyAvatar.VoiceLivePhotoStickerOrBuilder
        public String getPthotoType() {
            return this.pthotoType_;
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceFunnyAvatar.VoiceLivePhotoStickerOrBuilder
        public ByteString getPthotoTypeBytes() {
            return ByteString.copyFromUtf8(this.pthotoType_);
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16956K = !this.userId_.isEmpty() ? CodedOutputStream.m16956K(1, getUserId()) : 0;
            if (!this.pthotoType_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(2, getPthotoType());
            }
            if (this.frameConfig_ != null) {
                iM16956K += CodedOutputStream.m16948C(3, getFrameConfig());
            }
            long j = this.serverTimeInSeconds_;
            if (j != 0) {
                iM16956K += CodedOutputStream.m16986v(4, j);
            }
            this.memoizedSerializedSize = iM16956K;
            return iM16956K;
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceFunnyAvatar.VoiceLivePhotoStickerOrBuilder
        public long getServerTimeInSeconds() {
            return this.serverTimeInSeconds_;
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceFunnyAvatar.VoiceLivePhotoStickerOrBuilder
        public String getUserId() {
            return this.userId_;
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceFunnyAvatar.VoiceLivePhotoStickerOrBuilder
        public ByteString getUserIdBytes() {
            return ByteString.copyFromUtf8(this.userId_);
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceFunnyAvatar.VoiceLivePhotoStickerOrBuilder
        public boolean hasFrameConfig() {
            return this.frameConfig_ != null;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.userId_.isEmpty()) {
                codedOutputStream.mo16994D0(1, getUserId());
            }
            if (!this.pthotoType_.isEmpty()) {
                codedOutputStream.mo16994D0(2, getPthotoType());
            }
            if (this.frameConfig_ != null) {
                codedOutputStream.mo17029w0(3, getFrameConfig());
            }
            long j = this.serverTimeInSeconds_;
            if (j != 0) {
                codedOutputStream.m17027u0(4, j);
            }
        }

        public static VoiceLivePhotoSticker parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (VoiceLivePhotoSticker) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static VoiceLivePhotoSticker parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (VoiceLivePhotoSticker) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFrameConfig(VoiceLiveRankingBoard.PictureConfig pictureConfig) {
            pictureConfig.getClass();
            this.frameConfig_ = pictureConfig;
        }

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<VoiceLivePhotoSticker, Builder> implements VoiceLivePhotoStickerOrBuilder {
            private Builder() {
                super(VoiceLivePhotoSticker.DEFAULT_INSTANCE);
            }

            public Builder clearFrameConfig() {
                copyOnWrite();
                ((VoiceLivePhotoSticker) this.instance).clearFrameConfig();
                return this;
            }

            public Builder clearPthotoType() {
                copyOnWrite();
                ((VoiceLivePhotoSticker) this.instance).clearPthotoType();
                return this;
            }

            public Builder clearServerTimeInSeconds() {
                copyOnWrite();
                ((VoiceLivePhotoSticker) this.instance).clearServerTimeInSeconds();
                return this;
            }

            public Builder clearUserId() {
                copyOnWrite();
                ((VoiceLivePhotoSticker) this.instance).clearUserId();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceFunnyAvatar.VoiceLivePhotoStickerOrBuilder
            public VoiceLiveRankingBoard.PictureConfig getFrameConfig() {
                return ((VoiceLivePhotoSticker) this.instance).getFrameConfig();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceFunnyAvatar.VoiceLivePhotoStickerOrBuilder
            public String getPthotoType() {
                return ((VoiceLivePhotoSticker) this.instance).getPthotoType();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceFunnyAvatar.VoiceLivePhotoStickerOrBuilder
            public ByteString getPthotoTypeBytes() {
                return ((VoiceLivePhotoSticker) this.instance).getPthotoTypeBytes();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceFunnyAvatar.VoiceLivePhotoStickerOrBuilder
            public long getServerTimeInSeconds() {
                return ((VoiceLivePhotoSticker) this.instance).getServerTimeInSeconds();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceFunnyAvatar.VoiceLivePhotoStickerOrBuilder
            public String getUserId() {
                return ((VoiceLivePhotoSticker) this.instance).getUserId();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceFunnyAvatar.VoiceLivePhotoStickerOrBuilder
            public ByteString getUserIdBytes() {
                return ((VoiceLivePhotoSticker) this.instance).getUserIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceFunnyAvatar.VoiceLivePhotoStickerOrBuilder
            public boolean hasFrameConfig() {
                return ((VoiceLivePhotoSticker) this.instance).hasFrameConfig();
            }

            public Builder mergeFrameConfig(VoiceLiveRankingBoard.PictureConfig pictureConfig) {
                copyOnWrite();
                ((VoiceLivePhotoSticker) this.instance).mergeFrameConfig(pictureConfig);
                return this;
            }

            public Builder setFrameConfig(VoiceLiveRankingBoard.PictureConfig pictureConfig) {
                copyOnWrite();
                ((VoiceLivePhotoSticker) this.instance).setFrameConfig(pictureConfig);
                return this;
            }

            public Builder setPthotoType(String str) {
                copyOnWrite();
                ((VoiceLivePhotoSticker) this.instance).setPthotoType(str);
                return this;
            }

            public Builder setPthotoTypeBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceLivePhotoSticker) this.instance).setPthotoTypeBytes(byteString);
                return this;
            }

            public Builder setServerTimeInSeconds(long j) {
                copyOnWrite();
                ((VoiceLivePhotoSticker) this.instance).setServerTimeInSeconds(j);
                return this;
            }

            public Builder setUserId(String str) {
                copyOnWrite();
                ((VoiceLivePhotoSticker) this.instance).setUserId(str);
                return this;
            }

            public Builder setUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceLivePhotoSticker) this.instance).setUserIdBytes(byteString);
                return this;
            }

            public Builder setFrameConfig(VoiceLiveRankingBoard.PictureConfig.Builder builder) {
                copyOnWrite();
                ((VoiceLivePhotoSticker) this.instance).setFrameConfig(builder);
                return this;
            }
        }

        public static VoiceLivePhotoSticker parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoiceLivePhotoSticker) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoiceLivePhotoSticker parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (VoiceLivePhotoSticker) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static VoiceLivePhotoSticker parseFrom(InputStream inputStream) throws IOException {
            return (VoiceLivePhotoSticker) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceLivePhotoSticker parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (VoiceLivePhotoSticker) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static VoiceLivePhotoSticker parseFrom(C3430e c3430e) throws IOException {
            return (VoiceLivePhotoSticker) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static VoiceLivePhotoSticker parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (VoiceLivePhotoSticker) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }
}
