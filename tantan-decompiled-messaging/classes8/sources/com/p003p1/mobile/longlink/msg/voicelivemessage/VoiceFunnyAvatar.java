package com.p003p1.mobile.longlink.msg.voicelivemessage;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.a;
import com.google.protobuf.e;
import com.google.protobuf.h;
import com.google.protobuf.q;
import java.io.IOException;
import java.io.InputStream;
import l.aag0;
import l.bz00;
import l.i860;
import l.o6z;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public final class VoiceFunnyAvatar {

    /* JADX INFO: renamed from: com.p1.mobile.longlink.msg.voicelivemessage.VoiceFunnyAvatar$1 */
    public static /* synthetic */ class C04721 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f1702xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f1702xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1702xa1df5c61[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1702xa1df5c61[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1702xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1702xa1df5c61[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1702xa1df5c61[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1702xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f1702xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public interface VoiceLivePhotoStickerOrBuilder extends o6z {
        /* synthetic */ q getDefaultInstanceForType();

        VoiceLiveRankingBoard.PictureConfig getFrameConfig();

        String getPthotoType();

        ByteString getPthotoTypeBytes();

        long getServerTimeInSeconds();

        String getUserId();

        ByteString getUserIdBytes();

        boolean hasFrameConfig();

        /* synthetic */ boolean isInitialized();
    }

    private VoiceFunnyAvatar() {
    }

    public static void registerAllExtensions(h hVar) {
    }

    public static final class VoiceLivePhotoSticker extends GeneratedMessageLite<VoiceLivePhotoSticker, Builder> implements VoiceLivePhotoStickerOrBuilder {
        private static final VoiceLivePhotoSticker DEFAULT_INSTANCE;
        public static final int FRAMECONFIG_FIELD_NUMBER = 3;
        private static volatile i860<VoiceLivePhotoSticker> PARSER = null;
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
                this.frameConfig_ = (VoiceLiveRankingBoard.PictureConfig) ((VoiceLiveRankingBoard.PictureConfig.Builder) VoiceLiveRankingBoard.PictureConfig.newBuilder(this.frameConfig_).mergeFrom(pictureConfig)).buildPartial();
            }
        }

        public static Builder newBuilder(VoiceLivePhotoSticker voiceLivePhotoSticker) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(voiceLivePhotoSticker);
        }

        public static VoiceLivePhotoSticker parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VoiceLivePhotoSticker) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceLivePhotoSticker parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VoiceLivePhotoSticker) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<VoiceLivePhotoSticker> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFrameConfig(VoiceLiveRankingBoard.PictureConfig.Builder builder) {
            this.frameConfig_ = (VoiceLiveRankingBoard.PictureConfig) builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPthotoType(String str) {
            str.getClass();
            this.pthotoType_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPthotoTypeBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
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
            a.checkByteStringIsUtf8(byteString);
            this.userId_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C04721.f1702xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoiceLivePhotoSticker();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    VoiceLivePhotoSticker voiceLivePhotoSticker = (VoiceLivePhotoSticker) obj2;
                    this.userId_ = hVar.f(!this.userId_.isEmpty(), this.userId_, !voiceLivePhotoSticker.userId_.isEmpty(), voiceLivePhotoSticker.userId_);
                    this.pthotoType_ = hVar.f(!this.pthotoType_.isEmpty(), this.pthotoType_, !voiceLivePhotoSticker.pthotoType_.isEmpty(), voiceLivePhotoSticker.pthotoType_);
                    this.frameConfig_ = hVar.o(this.frameConfig_, voiceLivePhotoSticker.frameConfig_);
                    long j = this.serverTimeInSeconds_;
                    boolean z2 = j != 0;
                    long j2 = voiceLivePhotoSticker.serverTimeInSeconds_;
                    this.serverTimeInSeconds_ = hVar.i(z2, j, j2 != 0, j2);
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
                                    this.pthotoType_ = eVar.L();
                                } else if (iM == 26) {
                                    VoiceLiveRankingBoard.PictureConfig pictureConfig = this.frameConfig_;
                                    VoiceLiveRankingBoard.PictureConfig.Builder builder = pictureConfig != null ? (VoiceLiveRankingBoard.PictureConfig.Builder) pictureConfig.toBuilder() : null;
                                    VoiceLiveRankingBoard.PictureConfig pictureConfigW = eVar.w(VoiceLiveRankingBoard.PictureConfig.parser(), hVar2);
                                    this.frameConfig_ = pictureConfigW;
                                    if (builder != null) {
                                        builder.mergeFrom(pictureConfigW);
                                        this.frameConfig_ = (VoiceLiveRankingBoard.PictureConfig) builder.buildPartial();
                                    }
                                } else if (iM == 32) {
                                    this.serverTimeInSeconds_ = eVar.v();
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
                        synchronized (VoiceLivePhotoSticker.class) {
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

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iK = !this.userId_.isEmpty() ? CodedOutputStream.K(1, getUserId()) : 0;
            if (!this.pthotoType_.isEmpty()) {
                iK += CodedOutputStream.K(2, getPthotoType());
            }
            if (this.frameConfig_ != null) {
                iK += CodedOutputStream.C(3, getFrameConfig());
            }
            long j = this.serverTimeInSeconds_;
            if (j != 0) {
                iK += CodedOutputStream.v(4, j);
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iK;
            return iK;
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

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.userId_.isEmpty()) {
                codedOutputStream.D0(1, getUserId());
            }
            if (!this.pthotoType_.isEmpty()) {
                codedOutputStream.D0(2, getPthotoType());
            }
            if (this.frameConfig_ != null) {
                codedOutputStream.w0(3, getFrameConfig());
            }
            long j = this.serverTimeInSeconds_;
            if (j != 0) {
                codedOutputStream.u0(4, j);
            }
        }

        public static VoiceLivePhotoSticker parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (VoiceLivePhotoSticker) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static VoiceLivePhotoSticker parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (VoiceLivePhotoSticker) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFrameConfig(VoiceLiveRankingBoard.PictureConfig pictureConfig) {
            pictureConfig.getClass();
            this.frameConfig_ = pictureConfig;
        }

        public static final class Builder extends GeneratedMessageLite.b<VoiceLivePhotoSticker, Builder> implements VoiceLivePhotoStickerOrBuilder {
            private Builder() {
                super(VoiceLivePhotoSticker.DEFAULT_INSTANCE);
            }

            public Builder clearFrameConfig() {
                copyOnWrite();
                ((VoiceLivePhotoSticker) ((GeneratedMessageLite.b) this).instance).clearFrameConfig();
                return this;
            }

            public Builder clearPthotoType() {
                copyOnWrite();
                ((VoiceLivePhotoSticker) ((GeneratedMessageLite.b) this).instance).clearPthotoType();
                return this;
            }

            public Builder clearServerTimeInSeconds() {
                copyOnWrite();
                ((VoiceLivePhotoSticker) ((GeneratedMessageLite.b) this).instance).clearServerTimeInSeconds();
                return this;
            }

            public Builder clearUserId() {
                copyOnWrite();
                ((VoiceLivePhotoSticker) ((GeneratedMessageLite.b) this).instance).clearUserId();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceFunnyAvatar.VoiceLivePhotoStickerOrBuilder
            public VoiceLiveRankingBoard.PictureConfig getFrameConfig() {
                return ((VoiceLivePhotoSticker) ((GeneratedMessageLite.b) this).instance).getFrameConfig();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceFunnyAvatar.VoiceLivePhotoStickerOrBuilder
            public String getPthotoType() {
                return ((VoiceLivePhotoSticker) ((GeneratedMessageLite.b) this).instance).getPthotoType();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceFunnyAvatar.VoiceLivePhotoStickerOrBuilder
            public ByteString getPthotoTypeBytes() {
                return ((VoiceLivePhotoSticker) ((GeneratedMessageLite.b) this).instance).getPthotoTypeBytes();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceFunnyAvatar.VoiceLivePhotoStickerOrBuilder
            public long getServerTimeInSeconds() {
                return ((VoiceLivePhotoSticker) ((GeneratedMessageLite.b) this).instance).getServerTimeInSeconds();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceFunnyAvatar.VoiceLivePhotoStickerOrBuilder
            public String getUserId() {
                return ((VoiceLivePhotoSticker) ((GeneratedMessageLite.b) this).instance).getUserId();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceFunnyAvatar.VoiceLivePhotoStickerOrBuilder
            public ByteString getUserIdBytes() {
                return ((VoiceLivePhotoSticker) ((GeneratedMessageLite.b) this).instance).getUserIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceFunnyAvatar.VoiceLivePhotoStickerOrBuilder
            public boolean hasFrameConfig() {
                return ((VoiceLivePhotoSticker) ((GeneratedMessageLite.b) this).instance).hasFrameConfig();
            }

            public Builder mergeFrameConfig(VoiceLiveRankingBoard.PictureConfig pictureConfig) {
                copyOnWrite();
                ((VoiceLivePhotoSticker) ((GeneratedMessageLite.b) this).instance).mergeFrameConfig(pictureConfig);
                return this;
            }

            public Builder setFrameConfig(VoiceLiveRankingBoard.PictureConfig pictureConfig) {
                copyOnWrite();
                ((VoiceLivePhotoSticker) ((GeneratedMessageLite.b) this).instance).setFrameConfig(pictureConfig);
                return this;
            }

            public Builder setPthotoType(String str) {
                copyOnWrite();
                ((VoiceLivePhotoSticker) ((GeneratedMessageLite.b) this).instance).setPthotoType(str);
                return this;
            }

            public Builder setPthotoTypeBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceLivePhotoSticker) ((GeneratedMessageLite.b) this).instance).setPthotoTypeBytes(byteString);
                return this;
            }

            public Builder setServerTimeInSeconds(long j) {
                copyOnWrite();
                ((VoiceLivePhotoSticker) ((GeneratedMessageLite.b) this).instance).setServerTimeInSeconds(j);
                return this;
            }

            public Builder setUserId(String str) {
                copyOnWrite();
                ((VoiceLivePhotoSticker) ((GeneratedMessageLite.b) this).instance).setUserId(str);
                return this;
            }

            public Builder setUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceLivePhotoSticker) ((GeneratedMessageLite.b) this).instance).setUserIdBytes(byteString);
                return this;
            }

            public Builder setFrameConfig(VoiceLiveRankingBoard.PictureConfig.Builder builder) {
                copyOnWrite();
                ((VoiceLivePhotoSticker) ((GeneratedMessageLite.b) this).instance).setFrameConfig(builder);
                return this;
            }
        }

        public static VoiceLivePhotoSticker parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoiceLivePhotoSticker) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoiceLivePhotoSticker parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (VoiceLivePhotoSticker) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static VoiceLivePhotoSticker parseFrom(InputStream inputStream) throws IOException {
            return (VoiceLivePhotoSticker) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceLivePhotoSticker parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (VoiceLivePhotoSticker) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static VoiceLivePhotoSticker parseFrom(e eVar) throws IOException {
            return (VoiceLivePhotoSticker) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static VoiceLivePhotoSticker parseFrom(e eVar, h hVar) throws IOException {
            return (VoiceLivePhotoSticker) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }
}
