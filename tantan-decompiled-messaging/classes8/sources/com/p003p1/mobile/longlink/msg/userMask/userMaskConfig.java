package com.p003p1.mobile.longlink.msg.userMask;

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
public final class userMaskConfig {

    /* JADX INFO: renamed from: com.p1.mobile.longlink.msg.userMask.userMaskConfig$1 */
    public static /* synthetic */ class C04611 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f1697xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f1697xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1697xa1df5c61[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1697xa1df5c61[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1697xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1697xa1df5c61[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1697xa1df5c61[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1697xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f1697xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public interface AvatarConfigOrBuilder extends o6z {
        /* synthetic */ q getDefaultInstanceForType();

        PictureConfig getFrameConfig();

        boolean hasFrameConfig();

        /* synthetic */ boolean isInitialized();
    }

    public interface PictureConfigOrBuilder extends o6z {
        long getChangeVoiceNo();

        /* synthetic */ q getDefaultInstanceForType();

        String getDynamicUrl();

        ByteString getDynamicUrlBytes();

        long getEndMill();

        String getFunnyUrl();

        ByteString getFunnyUrlBytes();

        String getMediumDynamicUrl();

        ByteString getMediumDynamicUrlBytes();

        long getRemainingSec();

        String getSmallDynamicUrl();

        ByteString getSmallDynamicUrlBytes();

        String getStaticUrl();

        ByteString getStaticUrlBytes();

        long getTotalSec();

        /* synthetic */ boolean isInitialized();
    }

    public interface UserMaskOrBuilder extends o6z {
        String getAvatar();

        ByteString getAvatarBytes();

        AvatarConfig getAvatarConfig();

        String getAvatarResourceType();

        ByteString getAvatarResourceTypeBytes();

        /* synthetic */ q getDefaultInstanceForType();

        String getName();

        ByteString getNameBytes();

        String getUserId();

        ByteString getUserIdBytes();

        String getUserNameGradientColors(int i);

        ByteString getUserNameGradientColorsBytes(int i);

        int getUserNameGradientColorsCount();

        List<String> getUserNameGradientColorsList();

        VoiceMaskModeAddition getVoiceMaskModeAddition();

        boolean hasAvatarConfig();

        boolean hasVoiceMaskModeAddition();

        /* synthetic */ boolean isInitialized();
    }

    public interface VoiceMaskModeAdditionOrBuilder extends o6z {
        String getColor();

        ByteString getColorBytes();

        /* synthetic */ q getDefaultInstanceForType();

        String getGender();

        ByteString getGenderBytes();

        /* synthetic */ boolean isInitialized();
    }

    private userMaskConfig() {
    }

    public static void registerAllExtensions(h hVar) {
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
                this.frameConfig_ = (PictureConfig) ((PictureConfig.Builder) PictureConfig.newBuilder(this.frameConfig_).mergeFrom(pictureConfig)).buildPartial();
            }
        }

        public static Builder newBuilder(AvatarConfig avatarConfig) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(avatarConfig);
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
            this.frameConfig_ = (PictureConfig) builder.build();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C04611.f1697xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new AvatarConfig();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    this.frameConfig_ = ((GeneratedMessageLite.h) obj).o(this.frameConfig_, ((AvatarConfig) obj2).frameConfig_);
                    GeneratedMessageLite.g gVar = GeneratedMessageLite.g.INSTANCE;
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
                                    PictureConfig pictureConfig = this.frameConfig_;
                                    PictureConfig.Builder builder = pictureConfig != null ? (PictureConfig.Builder) pictureConfig.toBuilder() : null;
                                    PictureConfig pictureConfigW = eVar.w(PictureConfig.parser(), hVar);
                                    this.frameConfig_ = pictureConfigW;
                                    if (builder != null) {
                                        builder.mergeFrom(pictureConfigW);
                                        this.frameConfig_ = (PictureConfig) builder.buildPartial();
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
                        synchronized (AvatarConfig.class) {
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

        @Override // com.p1.mobile.longlink.msg.userMask.userMaskConfig.AvatarConfigOrBuilder
        public PictureConfig getFrameConfig() {
            PictureConfig pictureConfig = this.frameConfig_;
            return pictureConfig == null ? PictureConfig.getDefaultInstance() : pictureConfig;
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iC = this.frameConfig_ != null ? CodedOutputStream.C(1, getFrameConfig()) : 0;
            ((GeneratedMessageLite) this).memoizedSerializedSize = iC;
            return iC;
        }

        @Override // com.p1.mobile.longlink.msg.userMask.userMaskConfig.AvatarConfigOrBuilder
        public boolean hasFrameConfig() {
            return this.frameConfig_ != null;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.frameConfig_ != null) {
                codedOutputStream.w0(1, getFrameConfig());
            }
        }

        public static AvatarConfig parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (AvatarConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static AvatarConfig parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (AvatarConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFrameConfig(PictureConfig pictureConfig) {
            pictureConfig.getClass();
            this.frameConfig_ = pictureConfig;
        }

        public static final class Builder extends GeneratedMessageLite.b<AvatarConfig, Builder> implements AvatarConfigOrBuilder {
            private Builder() {
                super(AvatarConfig.DEFAULT_INSTANCE);
            }

            public Builder clearFrameConfig() {
                copyOnWrite();
                ((AvatarConfig) ((GeneratedMessageLite.b) this).instance).clearFrameConfig();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.userMask.userMaskConfig.AvatarConfigOrBuilder
            public PictureConfig getFrameConfig() {
                return ((AvatarConfig) ((GeneratedMessageLite.b) this).instance).getFrameConfig();
            }

            @Override // com.p1.mobile.longlink.msg.userMask.userMaskConfig.AvatarConfigOrBuilder
            public boolean hasFrameConfig() {
                return ((AvatarConfig) ((GeneratedMessageLite.b) this).instance).hasFrameConfig();
            }

            public Builder mergeFrameConfig(PictureConfig pictureConfig) {
                copyOnWrite();
                ((AvatarConfig) ((GeneratedMessageLite.b) this).instance).mergeFrameConfig(pictureConfig);
                return this;
            }

            public Builder setFrameConfig(PictureConfig pictureConfig) {
                copyOnWrite();
                ((AvatarConfig) ((GeneratedMessageLite.b) this).instance).setFrameConfig(pictureConfig);
                return this;
            }

            public Builder setFrameConfig(PictureConfig.Builder builder) {
                copyOnWrite();
                ((AvatarConfig) ((GeneratedMessageLite.b) this).instance).setFrameConfig(builder);
                return this;
            }
        }

        public static AvatarConfig parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (AvatarConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static AvatarConfig parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (AvatarConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static AvatarConfig parseFrom(InputStream inputStream) throws IOException {
            return (AvatarConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AvatarConfig parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (AvatarConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static AvatarConfig parseFrom(e eVar) throws IOException {
            return (AvatarConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static AvatarConfig parseFrom(e eVar, h hVar) throws IOException {
            return (AvatarConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public static final class PictureConfig extends GeneratedMessageLite<PictureConfig, Builder> implements PictureConfigOrBuilder {
        public static final int CHANGEVOICENO_FIELD_NUMBER = 7;
        private static final PictureConfig DEFAULT_INSTANCE;
        public static final int DYNAMICURL_FIELD_NUMBER = 2;
        public static final int ENDMILL_FIELD_NUMBER = 8;
        public static final int FUNNYURL_FIELD_NUMBER = 9;
        public static final int MEDIUMDYNAMICURL_FIELD_NUMBER = 4;
        private static volatile i860<PictureConfig> PARSER = null;
        public static final int REMAININGSEC_FIELD_NUMBER = 6;
        public static final int SMALLDYNAMICURL_FIELD_NUMBER = 3;
        public static final int STATICURL_FIELD_NUMBER = 1;
        public static final int TOTALSEC_FIELD_NUMBER = 5;
        private long changeVoiceNo_;
        private long endMill_;
        private long remainingSec_;
        private long totalSec_;
        private String staticUrl_ = "";
        private String dynamicUrl_ = "";
        private String smallDynamicUrl_ = "";
        private String mediumDynamicUrl_ = "";
        private String funnyUrl_ = "";

        public static final class Builder extends GeneratedMessageLite.b<PictureConfig, Builder> implements PictureConfigOrBuilder {
            private Builder() {
                super(PictureConfig.DEFAULT_INSTANCE);
            }

            public Builder clearChangeVoiceNo() {
                copyOnWrite();
                ((PictureConfig) ((GeneratedMessageLite.b) this).instance).clearChangeVoiceNo();
                return this;
            }

            public Builder clearDynamicUrl() {
                copyOnWrite();
                ((PictureConfig) ((GeneratedMessageLite.b) this).instance).clearDynamicUrl();
                return this;
            }

            public Builder clearEndMill() {
                copyOnWrite();
                ((PictureConfig) ((GeneratedMessageLite.b) this).instance).clearEndMill();
                return this;
            }

            public Builder clearFunnyUrl() {
                copyOnWrite();
                ((PictureConfig) ((GeneratedMessageLite.b) this).instance).clearFunnyUrl();
                return this;
            }

            public Builder clearMediumDynamicUrl() {
                copyOnWrite();
                ((PictureConfig) ((GeneratedMessageLite.b) this).instance).clearMediumDynamicUrl();
                return this;
            }

            public Builder clearRemainingSec() {
                copyOnWrite();
                ((PictureConfig) ((GeneratedMessageLite.b) this).instance).clearRemainingSec();
                return this;
            }

            public Builder clearSmallDynamicUrl() {
                copyOnWrite();
                ((PictureConfig) ((GeneratedMessageLite.b) this).instance).clearSmallDynamicUrl();
                return this;
            }

            public Builder clearStaticUrl() {
                copyOnWrite();
                ((PictureConfig) ((GeneratedMessageLite.b) this).instance).clearStaticUrl();
                return this;
            }

            public Builder clearTotalSec() {
                copyOnWrite();
                ((PictureConfig) ((GeneratedMessageLite.b) this).instance).clearTotalSec();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.userMask.userMaskConfig.PictureConfigOrBuilder
            public long getChangeVoiceNo() {
                return ((PictureConfig) ((GeneratedMessageLite.b) this).instance).getChangeVoiceNo();
            }

            @Override // com.p1.mobile.longlink.msg.userMask.userMaskConfig.PictureConfigOrBuilder
            public String getDynamicUrl() {
                return ((PictureConfig) ((GeneratedMessageLite.b) this).instance).getDynamicUrl();
            }

            @Override // com.p1.mobile.longlink.msg.userMask.userMaskConfig.PictureConfigOrBuilder
            public ByteString getDynamicUrlBytes() {
                return ((PictureConfig) ((GeneratedMessageLite.b) this).instance).getDynamicUrlBytes();
            }

            @Override // com.p1.mobile.longlink.msg.userMask.userMaskConfig.PictureConfigOrBuilder
            public long getEndMill() {
                return ((PictureConfig) ((GeneratedMessageLite.b) this).instance).getEndMill();
            }

            @Override // com.p1.mobile.longlink.msg.userMask.userMaskConfig.PictureConfigOrBuilder
            public String getFunnyUrl() {
                return ((PictureConfig) ((GeneratedMessageLite.b) this).instance).getFunnyUrl();
            }

            @Override // com.p1.mobile.longlink.msg.userMask.userMaskConfig.PictureConfigOrBuilder
            public ByteString getFunnyUrlBytes() {
                return ((PictureConfig) ((GeneratedMessageLite.b) this).instance).getFunnyUrlBytes();
            }

            @Override // com.p1.mobile.longlink.msg.userMask.userMaskConfig.PictureConfigOrBuilder
            public String getMediumDynamicUrl() {
                return ((PictureConfig) ((GeneratedMessageLite.b) this).instance).getMediumDynamicUrl();
            }

            @Override // com.p1.mobile.longlink.msg.userMask.userMaskConfig.PictureConfigOrBuilder
            public ByteString getMediumDynamicUrlBytes() {
                return ((PictureConfig) ((GeneratedMessageLite.b) this).instance).getMediumDynamicUrlBytes();
            }

            @Override // com.p1.mobile.longlink.msg.userMask.userMaskConfig.PictureConfigOrBuilder
            public long getRemainingSec() {
                return ((PictureConfig) ((GeneratedMessageLite.b) this).instance).getRemainingSec();
            }

            @Override // com.p1.mobile.longlink.msg.userMask.userMaskConfig.PictureConfigOrBuilder
            public String getSmallDynamicUrl() {
                return ((PictureConfig) ((GeneratedMessageLite.b) this).instance).getSmallDynamicUrl();
            }

            @Override // com.p1.mobile.longlink.msg.userMask.userMaskConfig.PictureConfigOrBuilder
            public ByteString getSmallDynamicUrlBytes() {
                return ((PictureConfig) ((GeneratedMessageLite.b) this).instance).getSmallDynamicUrlBytes();
            }

            @Override // com.p1.mobile.longlink.msg.userMask.userMaskConfig.PictureConfigOrBuilder
            public String getStaticUrl() {
                return ((PictureConfig) ((GeneratedMessageLite.b) this).instance).getStaticUrl();
            }

            @Override // com.p1.mobile.longlink.msg.userMask.userMaskConfig.PictureConfigOrBuilder
            public ByteString getStaticUrlBytes() {
                return ((PictureConfig) ((GeneratedMessageLite.b) this).instance).getStaticUrlBytes();
            }

            @Override // com.p1.mobile.longlink.msg.userMask.userMaskConfig.PictureConfigOrBuilder
            public long getTotalSec() {
                return ((PictureConfig) ((GeneratedMessageLite.b) this).instance).getTotalSec();
            }

            public Builder setChangeVoiceNo(long j) {
                copyOnWrite();
                ((PictureConfig) ((GeneratedMessageLite.b) this).instance).setChangeVoiceNo(j);
                return this;
            }

            public Builder setDynamicUrl(String str) {
                copyOnWrite();
                ((PictureConfig) ((GeneratedMessageLite.b) this).instance).setDynamicUrl(str);
                return this;
            }

            public Builder setDynamicUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((PictureConfig) ((GeneratedMessageLite.b) this).instance).setDynamicUrlBytes(byteString);
                return this;
            }

            public Builder setEndMill(long j) {
                copyOnWrite();
                ((PictureConfig) ((GeneratedMessageLite.b) this).instance).setEndMill(j);
                return this;
            }

            public Builder setFunnyUrl(String str) {
                copyOnWrite();
                ((PictureConfig) ((GeneratedMessageLite.b) this).instance).setFunnyUrl(str);
                return this;
            }

            public Builder setFunnyUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((PictureConfig) ((GeneratedMessageLite.b) this).instance).setFunnyUrlBytes(byteString);
                return this;
            }

            public Builder setMediumDynamicUrl(String str) {
                copyOnWrite();
                ((PictureConfig) ((GeneratedMessageLite.b) this).instance).setMediumDynamicUrl(str);
                return this;
            }

            public Builder setMediumDynamicUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((PictureConfig) ((GeneratedMessageLite.b) this).instance).setMediumDynamicUrlBytes(byteString);
                return this;
            }

            public Builder setRemainingSec(long j) {
                copyOnWrite();
                ((PictureConfig) ((GeneratedMessageLite.b) this).instance).setRemainingSec(j);
                return this;
            }

            public Builder setSmallDynamicUrl(String str) {
                copyOnWrite();
                ((PictureConfig) ((GeneratedMessageLite.b) this).instance).setSmallDynamicUrl(str);
                return this;
            }

            public Builder setSmallDynamicUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((PictureConfig) ((GeneratedMessageLite.b) this).instance).setSmallDynamicUrlBytes(byteString);
                return this;
            }

            public Builder setStaticUrl(String str) {
                copyOnWrite();
                ((PictureConfig) ((GeneratedMessageLite.b) this).instance).setStaticUrl(str);
                return this;
            }

            public Builder setStaticUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((PictureConfig) ((GeneratedMessageLite.b) this).instance).setStaticUrlBytes(byteString);
                return this;
            }

            public Builder setTotalSec(long j) {
                copyOnWrite();
                ((PictureConfig) ((GeneratedMessageLite.b) this).instance).setTotalSec(j);
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
        public void clearChangeVoiceNo() {
            this.changeVoiceNo_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDynamicUrl() {
            this.dynamicUrl_ = getDefaultInstance().getDynamicUrl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEndMill() {
            this.endMill_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFunnyUrl() {
            this.funnyUrl_ = getDefaultInstance().getFunnyUrl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMediumDynamicUrl() {
            this.mediumDynamicUrl_ = getDefaultInstance().getMediumDynamicUrl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRemainingSec() {
            this.remainingSec_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSmallDynamicUrl() {
            this.smallDynamicUrl_ = getDefaultInstance().getSmallDynamicUrl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStaticUrl() {
            this.staticUrl_ = getDefaultInstance().getStaticUrl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTotalSec() {
            this.totalSec_ = 0L;
        }

        public static PictureConfig getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(PictureConfig pictureConfig) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(pictureConfig);
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
        public void setChangeVoiceNo(long j) {
            this.changeVoiceNo_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDynamicUrl(String str) {
            str.getClass();
            this.dynamicUrl_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDynamicUrlBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.dynamicUrl_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEndMill(long j) {
            this.endMill_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFunnyUrl(String str) {
            str.getClass();
            this.funnyUrl_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFunnyUrlBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.funnyUrl_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMediumDynamicUrl(String str) {
            str.getClass();
            this.mediumDynamicUrl_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMediumDynamicUrlBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.mediumDynamicUrl_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRemainingSec(long j) {
            this.remainingSec_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSmallDynamicUrl(String str) {
            str.getClass();
            this.smallDynamicUrl_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSmallDynamicUrlBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.smallDynamicUrl_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStaticUrl(String str) {
            str.getClass();
            this.staticUrl_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStaticUrlBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.staticUrl_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTotalSec(long j) {
            this.totalSec_ = j;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C04611.f1697xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new PictureConfig();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    PictureConfig pictureConfig = (PictureConfig) obj2;
                    this.staticUrl_ = hVar.f(!this.staticUrl_.isEmpty(), this.staticUrl_, !pictureConfig.staticUrl_.isEmpty(), pictureConfig.staticUrl_);
                    this.dynamicUrl_ = hVar.f(!this.dynamicUrl_.isEmpty(), this.dynamicUrl_, !pictureConfig.dynamicUrl_.isEmpty(), pictureConfig.dynamicUrl_);
                    this.smallDynamicUrl_ = hVar.f(!this.smallDynamicUrl_.isEmpty(), this.smallDynamicUrl_, !pictureConfig.smallDynamicUrl_.isEmpty(), pictureConfig.smallDynamicUrl_);
                    this.mediumDynamicUrl_ = hVar.f(!this.mediumDynamicUrl_.isEmpty(), this.mediumDynamicUrl_, !pictureConfig.mediumDynamicUrl_.isEmpty(), pictureConfig.mediumDynamicUrl_);
                    long j = this.totalSec_;
                    boolean z2 = j != 0;
                    long j2 = pictureConfig.totalSec_;
                    this.totalSec_ = hVar.i(z2, j, j2 != 0, j2);
                    long j3 = this.remainingSec_;
                    boolean z3 = j3 != 0;
                    long j4 = pictureConfig.remainingSec_;
                    this.remainingSec_ = hVar.i(z3, j3, j4 != 0, j4);
                    long j5 = this.changeVoiceNo_;
                    boolean z4 = j5 != 0;
                    long j6 = pictureConfig.changeVoiceNo_;
                    this.changeVoiceNo_ = hVar.i(z4, j5, j6 != 0, j6);
                    long j7 = this.endMill_;
                    boolean z5 = j7 != 0;
                    long j8 = pictureConfig.endMill_;
                    this.endMill_ = hVar.i(z5, j7, j8 != 0, j8);
                    this.funnyUrl_ = hVar.f(!this.funnyUrl_.isEmpty(), this.funnyUrl_, !pictureConfig.funnyUrl_.isEmpty(), pictureConfig.funnyUrl_);
                    GeneratedMessageLite.g gVar = GeneratedMessageLite.g.INSTANCE;
                    return this;
                case 6:
                    e eVar = (e) obj;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            if (iM != 0) {
                                if (iM == 10) {
                                    this.staticUrl_ = eVar.L();
                                } else if (iM == 18) {
                                    this.dynamicUrl_ = eVar.L();
                                } else if (iM == 26) {
                                    this.smallDynamicUrl_ = eVar.L();
                                } else if (iM == 34) {
                                    this.mediumDynamicUrl_ = eVar.L();
                                } else if (iM == 40) {
                                    this.totalSec_ = eVar.v();
                                } else if (iM == 48) {
                                    this.remainingSec_ = eVar.v();
                                } else if (iM == 56) {
                                    this.changeVoiceNo_ = eVar.v();
                                } else if (iM == 64) {
                                    this.endMill_ = eVar.v();
                                } else if (iM == 74) {
                                    this.funnyUrl_ = eVar.L();
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
                        synchronized (PictureConfig.class) {
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

        @Override // com.p1.mobile.longlink.msg.userMask.userMaskConfig.PictureConfigOrBuilder
        public long getChangeVoiceNo() {
            return this.changeVoiceNo_;
        }

        @Override // com.p1.mobile.longlink.msg.userMask.userMaskConfig.PictureConfigOrBuilder
        public String getDynamicUrl() {
            return this.dynamicUrl_;
        }

        @Override // com.p1.mobile.longlink.msg.userMask.userMaskConfig.PictureConfigOrBuilder
        public ByteString getDynamicUrlBytes() {
            return ByteString.copyFromUtf8(this.dynamicUrl_);
        }

        @Override // com.p1.mobile.longlink.msg.userMask.userMaskConfig.PictureConfigOrBuilder
        public long getEndMill() {
            return this.endMill_;
        }

        @Override // com.p1.mobile.longlink.msg.userMask.userMaskConfig.PictureConfigOrBuilder
        public String getFunnyUrl() {
            return this.funnyUrl_;
        }

        @Override // com.p1.mobile.longlink.msg.userMask.userMaskConfig.PictureConfigOrBuilder
        public ByteString getFunnyUrlBytes() {
            return ByteString.copyFromUtf8(this.funnyUrl_);
        }

        @Override // com.p1.mobile.longlink.msg.userMask.userMaskConfig.PictureConfigOrBuilder
        public String getMediumDynamicUrl() {
            return this.mediumDynamicUrl_;
        }

        @Override // com.p1.mobile.longlink.msg.userMask.userMaskConfig.PictureConfigOrBuilder
        public ByteString getMediumDynamicUrlBytes() {
            return ByteString.copyFromUtf8(this.mediumDynamicUrl_);
        }

        @Override // com.p1.mobile.longlink.msg.userMask.userMaskConfig.PictureConfigOrBuilder
        public long getRemainingSec() {
            return this.remainingSec_;
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iK = !this.staticUrl_.isEmpty() ? CodedOutputStream.K(1, getStaticUrl()) : 0;
            if (!this.dynamicUrl_.isEmpty()) {
                iK += CodedOutputStream.K(2, getDynamicUrl());
            }
            if (!this.smallDynamicUrl_.isEmpty()) {
                iK += CodedOutputStream.K(3, getSmallDynamicUrl());
            }
            if (!this.mediumDynamicUrl_.isEmpty()) {
                iK += CodedOutputStream.K(4, getMediumDynamicUrl());
            }
            long j = this.totalSec_;
            if (j != 0) {
                iK += CodedOutputStream.v(5, j);
            }
            long j2 = this.remainingSec_;
            if (j2 != 0) {
                iK += CodedOutputStream.v(6, j2);
            }
            long j3 = this.changeVoiceNo_;
            if (j3 != 0) {
                iK += CodedOutputStream.v(7, j3);
            }
            long j4 = this.endMill_;
            if (j4 != 0) {
                iK += CodedOutputStream.v(8, j4);
            }
            if (!this.funnyUrl_.isEmpty()) {
                iK += CodedOutputStream.K(9, getFunnyUrl());
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iK;
            return iK;
        }

        @Override // com.p1.mobile.longlink.msg.userMask.userMaskConfig.PictureConfigOrBuilder
        public String getSmallDynamicUrl() {
            return this.smallDynamicUrl_;
        }

        @Override // com.p1.mobile.longlink.msg.userMask.userMaskConfig.PictureConfigOrBuilder
        public ByteString getSmallDynamicUrlBytes() {
            return ByteString.copyFromUtf8(this.smallDynamicUrl_);
        }

        @Override // com.p1.mobile.longlink.msg.userMask.userMaskConfig.PictureConfigOrBuilder
        public String getStaticUrl() {
            return this.staticUrl_;
        }

        @Override // com.p1.mobile.longlink.msg.userMask.userMaskConfig.PictureConfigOrBuilder
        public ByteString getStaticUrlBytes() {
            return ByteString.copyFromUtf8(this.staticUrl_);
        }

        @Override // com.p1.mobile.longlink.msg.userMask.userMaskConfig.PictureConfigOrBuilder
        public long getTotalSec() {
            return this.totalSec_;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.staticUrl_.isEmpty()) {
                codedOutputStream.D0(1, getStaticUrl());
            }
            if (!this.dynamicUrl_.isEmpty()) {
                codedOutputStream.D0(2, getDynamicUrl());
            }
            if (!this.smallDynamicUrl_.isEmpty()) {
                codedOutputStream.D0(3, getSmallDynamicUrl());
            }
            if (!this.mediumDynamicUrl_.isEmpty()) {
                codedOutputStream.D0(4, getMediumDynamicUrl());
            }
            long j = this.totalSec_;
            if (j != 0) {
                codedOutputStream.u0(5, j);
            }
            long j2 = this.remainingSec_;
            if (j2 != 0) {
                codedOutputStream.u0(6, j2);
            }
            long j3 = this.changeVoiceNo_;
            if (j3 != 0) {
                codedOutputStream.u0(7, j3);
            }
            long j4 = this.endMill_;
            if (j4 != 0) {
                codedOutputStream.u0(8, j4);
            }
            if (this.funnyUrl_.isEmpty()) {
                return;
            }
            codedOutputStream.D0(9, getFunnyUrl());
        }

        public static PictureConfig parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (PictureConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static PictureConfig parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (PictureConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static PictureConfig parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (PictureConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static PictureConfig parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (PictureConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static PictureConfig parseFrom(InputStream inputStream) throws IOException {
            return (PictureConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PictureConfig parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (PictureConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static PictureConfig parseFrom(e eVar) throws IOException {
            return (PictureConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static PictureConfig parseFrom(e eVar, h hVar) throws IOException {
            return (PictureConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public static final class UserMask extends GeneratedMessageLite<UserMask, Builder> implements UserMaskOrBuilder {
        public static final int AVATARCONFIG_FIELD_NUMBER = 4;
        public static final int AVATARRESOURCETYPE_FIELD_NUMBER = 6;
        public static final int AVATAR_FIELD_NUMBER = 3;
        private static final UserMask DEFAULT_INSTANCE;
        public static final int NAME_FIELD_NUMBER = 2;
        private static volatile i860<UserMask> PARSER = null;
        public static final int USERID_FIELD_NUMBER = 1;
        public static final int USERNAMEGRADIENTCOLORS_FIELD_NUMBER = 7;
        public static final int VOICEMASKMODEADDITION_FIELD_NUMBER = 5;
        private AvatarConfig avatarConfig_;
        private int bitField0_;
        private VoiceMaskModeAddition voiceMaskModeAddition_;
        private String userId_ = "";
        private String name_ = "";
        private String avatar_ = "";
        private String avatarResourceType_ = "";
        private l.h<String> userNameGradientColors_ = GeneratedMessageLite.emptyProtobufList();

        static {
            UserMask userMask = new UserMask();
            DEFAULT_INSTANCE = userMask;
            userMask.makeImmutable();
        }

        private UserMask() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllUserNameGradientColors(Iterable<String> iterable) {
            ensureUserNameGradientColorsIsMutable();
            a.addAll(iterable, this.userNameGradientColors_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addUserNameGradientColors(String str) {
            str.getClass();
            ensureUserNameGradientColorsIsMutable();
            this.userNameGradientColors_.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addUserNameGradientColorsBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            ensureUserNameGradientColorsIsMutable();
            this.userNameGradientColors_.add(byteString.toStringUtf8());
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
        public void clearAvatarResourceType() {
            this.avatarResourceType_ = getDefaultInstance().getAvatarResourceType();
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
        public void clearUserNameGradientColors() {
            this.userNameGradientColors_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVoiceMaskModeAddition() {
            this.voiceMaskModeAddition_ = null;
        }

        private void ensureUserNameGradientColorsIsMutable() {
            if (this.userNameGradientColors_.q()) {
                return;
            }
            this.userNameGradientColors_ = GeneratedMessageLite.mutableCopy(this.userNameGradientColors_);
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
                this.avatarConfig_ = (AvatarConfig) ((AvatarConfig.Builder) AvatarConfig.newBuilder(this.avatarConfig_).mergeFrom(avatarConfig)).buildPartial();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeVoiceMaskModeAddition(VoiceMaskModeAddition voiceMaskModeAddition) {
            VoiceMaskModeAddition voiceMaskModeAddition2 = this.voiceMaskModeAddition_;
            if (voiceMaskModeAddition2 == null || voiceMaskModeAddition2 == VoiceMaskModeAddition.getDefaultInstance()) {
                this.voiceMaskModeAddition_ = voiceMaskModeAddition;
            } else {
                this.voiceMaskModeAddition_ = (VoiceMaskModeAddition) ((VoiceMaskModeAddition.Builder) VoiceMaskModeAddition.newBuilder(this.voiceMaskModeAddition_).mergeFrom(voiceMaskModeAddition)).buildPartial();
            }
        }

        public static Builder newBuilder(UserMask userMask) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(userMask);
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
            a.checkByteStringIsUtf8(byteString);
            this.avatar_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAvatarConfig(AvatarConfig.Builder builder) {
            this.avatarConfig_ = (AvatarConfig) builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAvatarResourceType(String str) {
            str.getClass();
            this.avatarResourceType_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAvatarResourceTypeBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.avatarResourceType_ = byteString.toStringUtf8();
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
        public void setUserNameGradientColors(int i, String str) {
            str.getClass();
            ensureUserNameGradientColorsIsMutable();
            this.userNameGradientColors_.set(i, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVoiceMaskModeAddition(VoiceMaskModeAddition.Builder builder) {
            this.voiceMaskModeAddition_ = (VoiceMaskModeAddition) builder.build();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C04611.f1697xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new UserMask();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.userNameGradientColors_.n();
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.g gVar = (GeneratedMessageLite.h) obj;
                    UserMask userMask = (UserMask) obj2;
                    this.userId_ = gVar.f(!this.userId_.isEmpty(), this.userId_, !userMask.userId_.isEmpty(), userMask.userId_);
                    this.name_ = gVar.f(!this.name_.isEmpty(), this.name_, !userMask.name_.isEmpty(), userMask.name_);
                    this.avatar_ = gVar.f(!this.avatar_.isEmpty(), this.avatar_, !userMask.avatar_.isEmpty(), userMask.avatar_);
                    this.avatarConfig_ = gVar.o(this.avatarConfig_, userMask.avatarConfig_);
                    this.voiceMaskModeAddition_ = gVar.o(this.voiceMaskModeAddition_, userMask.voiceMaskModeAddition_);
                    this.avatarResourceType_ = gVar.f(!this.avatarResourceType_.isEmpty(), this.avatarResourceType_, true ^ userMask.avatarResourceType_.isEmpty(), userMask.avatarResourceType_);
                    this.userNameGradientColors_ = gVar.g(this.userNameGradientColors_, userMask.userNameGradientColors_);
                    if (gVar == GeneratedMessageLite.g.INSTANCE) {
                        this.bitField0_ |= userMask.bitField0_;
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
                                    this.userId_ = eVar.L();
                                } else if (iM == 18) {
                                    this.name_ = eVar.L();
                                } else if (iM == 26) {
                                    this.avatar_ = eVar.L();
                                } else if (iM == 34) {
                                    AvatarConfig avatarConfig = this.avatarConfig_;
                                    AvatarConfig.Builder builder = avatarConfig != null ? (AvatarConfig.Builder) avatarConfig.toBuilder() : null;
                                    AvatarConfig avatarConfigW = eVar.w(AvatarConfig.parser(), hVar);
                                    this.avatarConfig_ = avatarConfigW;
                                    if (builder != null) {
                                        builder.mergeFrom(avatarConfigW);
                                        this.avatarConfig_ = (AvatarConfig) builder.buildPartial();
                                    }
                                } else if (iM == 42) {
                                    VoiceMaskModeAddition voiceMaskModeAddition = this.voiceMaskModeAddition_;
                                    VoiceMaskModeAddition.Builder builder2 = voiceMaskModeAddition != null ? (VoiceMaskModeAddition.Builder) voiceMaskModeAddition.toBuilder() : null;
                                    VoiceMaskModeAddition voiceMaskModeAdditionW = eVar.w(VoiceMaskModeAddition.parser(), hVar);
                                    this.voiceMaskModeAddition_ = voiceMaskModeAdditionW;
                                    if (builder2 != null) {
                                        builder2.mergeFrom(voiceMaskModeAdditionW);
                                        this.voiceMaskModeAddition_ = (VoiceMaskModeAddition) builder2.buildPartial();
                                    }
                                } else if (iM == 50) {
                                    this.avatarResourceType_ = eVar.L();
                                } else if (iM == 58) {
                                    String strL = eVar.L();
                                    if (!this.userNameGradientColors_.q()) {
                                        this.userNameGradientColors_ = GeneratedMessageLite.mutableCopy(this.userNameGradientColors_);
                                    }
                                    this.userNameGradientColors_.add(strL);
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
                        synchronized (UserMask.class) {
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

        @Override // com.p1.mobile.longlink.msg.userMask.userMaskConfig.UserMaskOrBuilder
        public String getAvatar() {
            return this.avatar_;
        }

        @Override // com.p1.mobile.longlink.msg.userMask.userMaskConfig.UserMaskOrBuilder
        public ByteString getAvatarBytes() {
            return ByteString.copyFromUtf8(this.avatar_);
        }

        @Override // com.p1.mobile.longlink.msg.userMask.userMaskConfig.UserMaskOrBuilder
        public AvatarConfig getAvatarConfig() {
            AvatarConfig avatarConfig = this.avatarConfig_;
            return avatarConfig == null ? AvatarConfig.getDefaultInstance() : avatarConfig;
        }

        @Override // com.p1.mobile.longlink.msg.userMask.userMaskConfig.UserMaskOrBuilder
        public String getAvatarResourceType() {
            return this.avatarResourceType_;
        }

        @Override // com.p1.mobile.longlink.msg.userMask.userMaskConfig.UserMaskOrBuilder
        public ByteString getAvatarResourceTypeBytes() {
            return ByteString.copyFromUtf8(this.avatarResourceType_);
        }

        @Override // com.p1.mobile.longlink.msg.userMask.userMaskConfig.UserMaskOrBuilder
        public String getName() {
            return this.name_;
        }

        @Override // com.p1.mobile.longlink.msg.userMask.userMaskConfig.UserMaskOrBuilder
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
            if (this.avatarConfig_ != null) {
                iK += CodedOutputStream.C(4, getAvatarConfig());
            }
            if (this.voiceMaskModeAddition_ != null) {
                iK += CodedOutputStream.C(5, getVoiceMaskModeAddition());
            }
            if (!this.avatarResourceType_.isEmpty()) {
                iK += CodedOutputStream.K(6, getAvatarResourceType());
            }
            int iL = 0;
            for (int i2 = 0; i2 < this.userNameGradientColors_.size(); i2++) {
                iL += CodedOutputStream.L((String) this.userNameGradientColors_.get(i2));
            }
            int size = iK + iL + getUserNameGradientColorsList().size();
            ((GeneratedMessageLite) this).memoizedSerializedSize = size;
            return size;
        }

        @Override // com.p1.mobile.longlink.msg.userMask.userMaskConfig.UserMaskOrBuilder
        public String getUserId() {
            return this.userId_;
        }

        @Override // com.p1.mobile.longlink.msg.userMask.userMaskConfig.UserMaskOrBuilder
        public ByteString getUserIdBytes() {
            return ByteString.copyFromUtf8(this.userId_);
        }

        @Override // com.p1.mobile.longlink.msg.userMask.userMaskConfig.UserMaskOrBuilder
        public String getUserNameGradientColors(int i) {
            return (String) this.userNameGradientColors_.get(i);
        }

        @Override // com.p1.mobile.longlink.msg.userMask.userMaskConfig.UserMaskOrBuilder
        public ByteString getUserNameGradientColorsBytes(int i) {
            return ByteString.copyFromUtf8((String) this.userNameGradientColors_.get(i));
        }

        @Override // com.p1.mobile.longlink.msg.userMask.userMaskConfig.UserMaskOrBuilder
        public int getUserNameGradientColorsCount() {
            return this.userNameGradientColors_.size();
        }

        @Override // com.p1.mobile.longlink.msg.userMask.userMaskConfig.UserMaskOrBuilder
        public List<String> getUserNameGradientColorsList() {
            return this.userNameGradientColors_;
        }

        @Override // com.p1.mobile.longlink.msg.userMask.userMaskConfig.UserMaskOrBuilder
        public VoiceMaskModeAddition getVoiceMaskModeAddition() {
            VoiceMaskModeAddition voiceMaskModeAddition = this.voiceMaskModeAddition_;
            return voiceMaskModeAddition == null ? VoiceMaskModeAddition.getDefaultInstance() : voiceMaskModeAddition;
        }

        @Override // com.p1.mobile.longlink.msg.userMask.userMaskConfig.UserMaskOrBuilder
        public boolean hasAvatarConfig() {
            return this.avatarConfig_ != null;
        }

        @Override // com.p1.mobile.longlink.msg.userMask.userMaskConfig.UserMaskOrBuilder
        public boolean hasVoiceMaskModeAddition() {
            return this.voiceMaskModeAddition_ != null;
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
            if (this.avatarConfig_ != null) {
                codedOutputStream.w0(4, getAvatarConfig());
            }
            if (this.voiceMaskModeAddition_ != null) {
                codedOutputStream.w0(5, getVoiceMaskModeAddition());
            }
            if (!this.avatarResourceType_.isEmpty()) {
                codedOutputStream.D0(6, getAvatarResourceType());
            }
            for (int i = 0; i < this.userNameGradientColors_.size(); i++) {
                codedOutputStream.D0(7, (String) this.userNameGradientColors_.get(i));
            }
        }

        public static UserMask parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (UserMask) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static UserMask parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (UserMask) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
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

        public static final class Builder extends GeneratedMessageLite.b<UserMask, Builder> implements UserMaskOrBuilder {
            private Builder() {
                super(UserMask.DEFAULT_INSTANCE);
            }

            public Builder addAllUserNameGradientColors(Iterable<String> iterable) {
                copyOnWrite();
                ((UserMask) ((GeneratedMessageLite.b) this).instance).addAllUserNameGradientColors(iterable);
                return this;
            }

            public Builder addUserNameGradientColors(String str) {
                copyOnWrite();
                ((UserMask) ((GeneratedMessageLite.b) this).instance).addUserNameGradientColors(str);
                return this;
            }

            public Builder addUserNameGradientColorsBytes(ByteString byteString) {
                copyOnWrite();
                ((UserMask) ((GeneratedMessageLite.b) this).instance).addUserNameGradientColorsBytes(byteString);
                return this;
            }

            public Builder clearAvatar() {
                copyOnWrite();
                ((UserMask) ((GeneratedMessageLite.b) this).instance).clearAvatar();
                return this;
            }

            public Builder clearAvatarConfig() {
                copyOnWrite();
                ((UserMask) ((GeneratedMessageLite.b) this).instance).clearAvatarConfig();
                return this;
            }

            public Builder clearAvatarResourceType() {
                copyOnWrite();
                ((UserMask) ((GeneratedMessageLite.b) this).instance).clearAvatarResourceType();
                return this;
            }

            public Builder clearName() {
                copyOnWrite();
                ((UserMask) ((GeneratedMessageLite.b) this).instance).clearName();
                return this;
            }

            public Builder clearUserId() {
                copyOnWrite();
                ((UserMask) ((GeneratedMessageLite.b) this).instance).clearUserId();
                return this;
            }

            public Builder clearUserNameGradientColors() {
                copyOnWrite();
                ((UserMask) ((GeneratedMessageLite.b) this).instance).clearUserNameGradientColors();
                return this;
            }

            public Builder clearVoiceMaskModeAddition() {
                copyOnWrite();
                ((UserMask) ((GeneratedMessageLite.b) this).instance).clearVoiceMaskModeAddition();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.userMask.userMaskConfig.UserMaskOrBuilder
            public String getAvatar() {
                return ((UserMask) ((GeneratedMessageLite.b) this).instance).getAvatar();
            }

            @Override // com.p1.mobile.longlink.msg.userMask.userMaskConfig.UserMaskOrBuilder
            public ByteString getAvatarBytes() {
                return ((UserMask) ((GeneratedMessageLite.b) this).instance).getAvatarBytes();
            }

            @Override // com.p1.mobile.longlink.msg.userMask.userMaskConfig.UserMaskOrBuilder
            public AvatarConfig getAvatarConfig() {
                return ((UserMask) ((GeneratedMessageLite.b) this).instance).getAvatarConfig();
            }

            @Override // com.p1.mobile.longlink.msg.userMask.userMaskConfig.UserMaskOrBuilder
            public String getAvatarResourceType() {
                return ((UserMask) ((GeneratedMessageLite.b) this).instance).getAvatarResourceType();
            }

            @Override // com.p1.mobile.longlink.msg.userMask.userMaskConfig.UserMaskOrBuilder
            public ByteString getAvatarResourceTypeBytes() {
                return ((UserMask) ((GeneratedMessageLite.b) this).instance).getAvatarResourceTypeBytes();
            }

            @Override // com.p1.mobile.longlink.msg.userMask.userMaskConfig.UserMaskOrBuilder
            public String getName() {
                return ((UserMask) ((GeneratedMessageLite.b) this).instance).getName();
            }

            @Override // com.p1.mobile.longlink.msg.userMask.userMaskConfig.UserMaskOrBuilder
            public ByteString getNameBytes() {
                return ((UserMask) ((GeneratedMessageLite.b) this).instance).getNameBytes();
            }

            @Override // com.p1.mobile.longlink.msg.userMask.userMaskConfig.UserMaskOrBuilder
            public String getUserId() {
                return ((UserMask) ((GeneratedMessageLite.b) this).instance).getUserId();
            }

            @Override // com.p1.mobile.longlink.msg.userMask.userMaskConfig.UserMaskOrBuilder
            public ByteString getUserIdBytes() {
                return ((UserMask) ((GeneratedMessageLite.b) this).instance).getUserIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.userMask.userMaskConfig.UserMaskOrBuilder
            public String getUserNameGradientColors(int i) {
                return ((UserMask) ((GeneratedMessageLite.b) this).instance).getUserNameGradientColors(i);
            }

            @Override // com.p1.mobile.longlink.msg.userMask.userMaskConfig.UserMaskOrBuilder
            public ByteString getUserNameGradientColorsBytes(int i) {
                return ((UserMask) ((GeneratedMessageLite.b) this).instance).getUserNameGradientColorsBytes(i);
            }

            @Override // com.p1.mobile.longlink.msg.userMask.userMaskConfig.UserMaskOrBuilder
            public int getUserNameGradientColorsCount() {
                return ((UserMask) ((GeneratedMessageLite.b) this).instance).getUserNameGradientColorsCount();
            }

            @Override // com.p1.mobile.longlink.msg.userMask.userMaskConfig.UserMaskOrBuilder
            public List<String> getUserNameGradientColorsList() {
                return Collections.unmodifiableList(((UserMask) ((GeneratedMessageLite.b) this).instance).getUserNameGradientColorsList());
            }

            @Override // com.p1.mobile.longlink.msg.userMask.userMaskConfig.UserMaskOrBuilder
            public VoiceMaskModeAddition getVoiceMaskModeAddition() {
                return ((UserMask) ((GeneratedMessageLite.b) this).instance).getVoiceMaskModeAddition();
            }

            @Override // com.p1.mobile.longlink.msg.userMask.userMaskConfig.UserMaskOrBuilder
            public boolean hasAvatarConfig() {
                return ((UserMask) ((GeneratedMessageLite.b) this).instance).hasAvatarConfig();
            }

            @Override // com.p1.mobile.longlink.msg.userMask.userMaskConfig.UserMaskOrBuilder
            public boolean hasVoiceMaskModeAddition() {
                return ((UserMask) ((GeneratedMessageLite.b) this).instance).hasVoiceMaskModeAddition();
            }

            public Builder mergeAvatarConfig(AvatarConfig avatarConfig) {
                copyOnWrite();
                ((UserMask) ((GeneratedMessageLite.b) this).instance).mergeAvatarConfig(avatarConfig);
                return this;
            }

            public Builder mergeVoiceMaskModeAddition(VoiceMaskModeAddition voiceMaskModeAddition) {
                copyOnWrite();
                ((UserMask) ((GeneratedMessageLite.b) this).instance).mergeVoiceMaskModeAddition(voiceMaskModeAddition);
                return this;
            }

            public Builder setAvatar(String str) {
                copyOnWrite();
                ((UserMask) ((GeneratedMessageLite.b) this).instance).setAvatar(str);
                return this;
            }

            public Builder setAvatarBytes(ByteString byteString) {
                copyOnWrite();
                ((UserMask) ((GeneratedMessageLite.b) this).instance).setAvatarBytes(byteString);
                return this;
            }

            public Builder setAvatarConfig(AvatarConfig avatarConfig) {
                copyOnWrite();
                ((UserMask) ((GeneratedMessageLite.b) this).instance).setAvatarConfig(avatarConfig);
                return this;
            }

            public Builder setAvatarResourceType(String str) {
                copyOnWrite();
                ((UserMask) ((GeneratedMessageLite.b) this).instance).setAvatarResourceType(str);
                return this;
            }

            public Builder setAvatarResourceTypeBytes(ByteString byteString) {
                copyOnWrite();
                ((UserMask) ((GeneratedMessageLite.b) this).instance).setAvatarResourceTypeBytes(byteString);
                return this;
            }

            public Builder setName(String str) {
                copyOnWrite();
                ((UserMask) ((GeneratedMessageLite.b) this).instance).setName(str);
                return this;
            }

            public Builder setNameBytes(ByteString byteString) {
                copyOnWrite();
                ((UserMask) ((GeneratedMessageLite.b) this).instance).setNameBytes(byteString);
                return this;
            }

            public Builder setUserId(String str) {
                copyOnWrite();
                ((UserMask) ((GeneratedMessageLite.b) this).instance).setUserId(str);
                return this;
            }

            public Builder setUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((UserMask) ((GeneratedMessageLite.b) this).instance).setUserIdBytes(byteString);
                return this;
            }

            public Builder setUserNameGradientColors(int i, String str) {
                copyOnWrite();
                ((UserMask) ((GeneratedMessageLite.b) this).instance).setUserNameGradientColors(i, str);
                return this;
            }

            public Builder setVoiceMaskModeAddition(VoiceMaskModeAddition voiceMaskModeAddition) {
                copyOnWrite();
                ((UserMask) ((GeneratedMessageLite.b) this).instance).setVoiceMaskModeAddition(voiceMaskModeAddition);
                return this;
            }

            public Builder setAvatarConfig(AvatarConfig.Builder builder) {
                copyOnWrite();
                ((UserMask) ((GeneratedMessageLite.b) this).instance).setAvatarConfig(builder);
                return this;
            }

            public Builder setVoiceMaskModeAddition(VoiceMaskModeAddition.Builder builder) {
                copyOnWrite();
                ((UserMask) ((GeneratedMessageLite.b) this).instance).setVoiceMaskModeAddition(builder);
                return this;
            }
        }

        public static UserMask parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (UserMask) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static UserMask parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (UserMask) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static UserMask parseFrom(InputStream inputStream) throws IOException {
            return (UserMask) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static UserMask parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (UserMask) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static UserMask parseFrom(e eVar) throws IOException {
            return (UserMask) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static UserMask parseFrom(e eVar, h hVar) throws IOException {
            return (UserMask) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public static final class VoiceMaskModeAddition extends GeneratedMessageLite<VoiceMaskModeAddition, Builder> implements VoiceMaskModeAdditionOrBuilder {
        public static final int COLOR_FIELD_NUMBER = 1;
        private static final VoiceMaskModeAddition DEFAULT_INSTANCE;
        public static final int GENDER_FIELD_NUMBER = 2;
        private static volatile i860<VoiceMaskModeAddition> PARSER;
        private String color_ = "";
        private String gender_ = "";

        public static final class Builder extends GeneratedMessageLite.b<VoiceMaskModeAddition, Builder> implements VoiceMaskModeAdditionOrBuilder {
            private Builder() {
                super(VoiceMaskModeAddition.DEFAULT_INSTANCE);
            }

            public Builder clearColor() {
                copyOnWrite();
                ((VoiceMaskModeAddition) ((GeneratedMessageLite.b) this).instance).clearColor();
                return this;
            }

            public Builder clearGender() {
                copyOnWrite();
                ((VoiceMaskModeAddition) ((GeneratedMessageLite.b) this).instance).clearGender();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.userMask.userMaskConfig.VoiceMaskModeAdditionOrBuilder
            public String getColor() {
                return ((VoiceMaskModeAddition) ((GeneratedMessageLite.b) this).instance).getColor();
            }

            @Override // com.p1.mobile.longlink.msg.userMask.userMaskConfig.VoiceMaskModeAdditionOrBuilder
            public ByteString getColorBytes() {
                return ((VoiceMaskModeAddition) ((GeneratedMessageLite.b) this).instance).getColorBytes();
            }

            @Override // com.p1.mobile.longlink.msg.userMask.userMaskConfig.VoiceMaskModeAdditionOrBuilder
            public String getGender() {
                return ((VoiceMaskModeAddition) ((GeneratedMessageLite.b) this).instance).getGender();
            }

            @Override // com.p1.mobile.longlink.msg.userMask.userMaskConfig.VoiceMaskModeAdditionOrBuilder
            public ByteString getGenderBytes() {
                return ((VoiceMaskModeAddition) ((GeneratedMessageLite.b) this).instance).getGenderBytes();
            }

            public Builder setColor(String str) {
                copyOnWrite();
                ((VoiceMaskModeAddition) ((GeneratedMessageLite.b) this).instance).setColor(str);
                return this;
            }

            public Builder setColorBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceMaskModeAddition) ((GeneratedMessageLite.b) this).instance).setColorBytes(byteString);
                return this;
            }

            public Builder setGender(String str) {
                copyOnWrite();
                ((VoiceMaskModeAddition) ((GeneratedMessageLite.b) this).instance).setGender(str);
                return this;
            }

            public Builder setGenderBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceMaskModeAddition) ((GeneratedMessageLite.b) this).instance).setGenderBytes(byteString);
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
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(voiceMaskModeAddition);
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

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C04611.f1697xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoiceMaskModeAddition();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    VoiceMaskModeAddition voiceMaskModeAddition = (VoiceMaskModeAddition) obj2;
                    this.color_ = hVar.f(!this.color_.isEmpty(), this.color_, !voiceMaskModeAddition.color_.isEmpty(), voiceMaskModeAddition.color_);
                    this.gender_ = hVar.f(!this.gender_.isEmpty(), this.gender_, true ^ voiceMaskModeAddition.gender_.isEmpty(), voiceMaskModeAddition.gender_);
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
                        synchronized (VoiceMaskModeAddition.class) {
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

        @Override // com.p1.mobile.longlink.msg.userMask.userMaskConfig.VoiceMaskModeAdditionOrBuilder
        public String getColor() {
            return this.color_;
        }

        @Override // com.p1.mobile.longlink.msg.userMask.userMaskConfig.VoiceMaskModeAdditionOrBuilder
        public ByteString getColorBytes() {
            return ByteString.copyFromUtf8(this.color_);
        }

        @Override // com.p1.mobile.longlink.msg.userMask.userMaskConfig.VoiceMaskModeAdditionOrBuilder
        public String getGender() {
            return this.gender_;
        }

        @Override // com.p1.mobile.longlink.msg.userMask.userMaskConfig.VoiceMaskModeAdditionOrBuilder
        public ByteString getGenderBytes() {
            return ByteString.copyFromUtf8(this.gender_);
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iK = !this.color_.isEmpty() ? CodedOutputStream.K(1, getColor()) : 0;
            if (!this.gender_.isEmpty()) {
                iK += CodedOutputStream.K(2, getGender());
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iK;
            return iK;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.color_.isEmpty()) {
                codedOutputStream.D0(1, getColor());
            }
            if (this.gender_.isEmpty()) {
                return;
            }
            codedOutputStream.D0(2, getGender());
        }

        public static VoiceMaskModeAddition parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (VoiceMaskModeAddition) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static VoiceMaskModeAddition parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (VoiceMaskModeAddition) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static VoiceMaskModeAddition parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoiceMaskModeAddition) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoiceMaskModeAddition parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (VoiceMaskModeAddition) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static VoiceMaskModeAddition parseFrom(InputStream inputStream) throws IOException {
            return (VoiceMaskModeAddition) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceMaskModeAddition parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (VoiceMaskModeAddition) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static VoiceMaskModeAddition parseFrom(e eVar) throws IOException {
            return (VoiceMaskModeAddition) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static VoiceMaskModeAddition parseFrom(e eVar, h hVar) throws IOException {
            return (VoiceMaskModeAddition) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }
}
