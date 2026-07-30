package com.p046p1.mobile.longlink.msg.voicelivemessage;

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
public final class VoiceLiveRankingBoard {

    /* JADX INFO: renamed from: com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard$1 */
    public static /* synthetic */ class C45641 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16006xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f16006xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16006xa1df5c61[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16006xa1df5c61[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16006xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16006xa1df5c61[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16006xa1df5c61[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16006xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f16006xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
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

    public interface CurrentHourSuggestConfigOrBuilder extends o6z {
        @Override // p149l.o6z
        /* synthetic */ InterfaceC3419q getDefaultInstanceForType();

        boolean getEnable();

        @Override // p149l.o6z
        /* synthetic */ boolean isInitialized();
    }

    public interface PictureConfigOrBuilder extends o6z {
        long getChangeVoiceNo();

        @Override // p149l.o6z
        /* synthetic */ InterfaceC3419q getDefaultInstanceForType();

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

    public interface VoiceLiveRankingOrBuilder extends o6z {
        long getAmount();

        String getAnchorId();

        ByteString getAnchorIdBytes();

        String getAnchorImage();

        ByteString getAnchorImageBytes();

        String getAnchorName();

        ByteString getAnchorNameBytes();

        String getContent();

        ByteString getContentBytes();

        @Override // p149l.o6z
        /* synthetic */ InterfaceC3419q getDefaultInstanceForType();

        long getGap();

        String getLiveId();

        ByteString getLiveIdBytes();

        long getRank();

        String getRoomId();

        ByteString getRoomIdBytes();

        VoiceLiveStateEnum getUserLiveState();

        int getUserLiveStateValue();

        @Override // p149l.o6z
        /* synthetic */ boolean isInitialized();
    }

    public interface VoiceLiveRankingsOrBuilder extends o6z {
        VoiceLiveRankingAction getAction();

        int getActionValue();

        @Override // p149l.o6z
        /* synthetic */ InterfaceC3419q getDefaultInstanceForType();

        String getLiveId();

        ByteString getLiveIdBytes();

        VoiceLiveRankingMsgType getMsgType();

        int getMsgTypeValue();

        long getRankingTime();

        VoiceLiveRanking getRankings(int i);

        int getRankingsCount();

        List<VoiceLiveRanking> getRankingsList();

        String getRoomId();

        ByteString getRoomIdBytes();

        String getTitle();

        ByteString getTitleBytes();

        VoiceLiveRankingType getType();

        int getTypeValue();

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

    private VoiceLiveRankingBoard() {
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
            switch (C45641.f16006xa1df5c61[methodToInvoke.ordinal()]) {
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

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard.AvatarConfigOrBuilder
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

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard.AvatarConfigOrBuilder
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

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard.AvatarConfigOrBuilder
            public PictureConfig getFrameConfig() {
                return ((AvatarConfig) this.instance).getFrameConfig();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard.AvatarConfigOrBuilder
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

    public static final class CurrentHourSuggestConfig extends GeneratedMessageLite<CurrentHourSuggestConfig, Builder> implements CurrentHourSuggestConfigOrBuilder {
        private static final CurrentHourSuggestConfig DEFAULT_INSTANCE;
        public static final int ENABLE_FIELD_NUMBER = 1;
        private static volatile i860<CurrentHourSuggestConfig> PARSER;
        private boolean enable_;

        public static final class Builder extends GeneratedMessageLite.AbstractC3380b<CurrentHourSuggestConfig, Builder> implements CurrentHourSuggestConfigOrBuilder {
            private Builder() {
                super(CurrentHourSuggestConfig.DEFAULT_INSTANCE);
            }

            public Builder clearEnable() {
                copyOnWrite();
                ((CurrentHourSuggestConfig) this.instance).clearEnable();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard.CurrentHourSuggestConfigOrBuilder
            public boolean getEnable() {
                return ((CurrentHourSuggestConfig) this.instance).getEnable();
            }

            public Builder setEnable(boolean z) {
                copyOnWrite();
                ((CurrentHourSuggestConfig) this.instance).setEnable(z);
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
        public void clearEnable() {
            this.enable_ = false;
        }

        public static CurrentHourSuggestConfig getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(CurrentHourSuggestConfig currentHourSuggestConfig) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(currentHourSuggestConfig);
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

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C45641.f16006xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new CurrentHourSuggestConfig();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    boolean z = this.enable_;
                    boolean z2 = ((CurrentHourSuggestConfig) obj2).enable_;
                    this.enable_ = ((GeneratedMessageLite.InterfaceC3386h) obj).mo16995d(z, z, z2, z2);
                    GeneratedMessageLite.C3385g c3385g = GeneratedMessageLite.C3385g.INSTANCE;
                    return this;
                case 6:
                    C3407e c3407e = (C3407e) obj;
                    boolean z3 = false;
                    while (!z3) {
                        try {
                            int iM17116M = c3407e.m17116M();
                            if (iM17116M != 0) {
                                if (iM17116M == 8) {
                                    this.enable_ = c3407e.m17133m();
                                } else if (!c3407e.m17121R(iM17116M)) {
                                }
                            }
                            z3 = true;
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
                        synchronized (CurrentHourSuggestConfig.class) {
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

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard.CurrentHourSuggestConfigOrBuilder
        public boolean getEnable() {
            return this.enable_;
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            boolean z = this.enable_;
            int iM16915f = z ? CodedOutputStream.m16915f(1, z) : 0;
            this.memoizedSerializedSize = iM16915f;
            return iM16915f;
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            boolean z = this.enable_;
            if (z) {
                codedOutputStream.mo16950a0(1, z);
            }
        }

        public static CurrentHourSuggestConfig parseDelimitedFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (CurrentHourSuggestConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static CurrentHourSuggestConfig parseFrom(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
            return (CurrentHourSuggestConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3410h);
        }

        public static CurrentHourSuggestConfig parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (CurrentHourSuggestConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CurrentHourSuggestConfig parseFrom(byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
            return (CurrentHourSuggestConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3410h);
        }

        public static CurrentHourSuggestConfig parseFrom(InputStream inputStream) throws IOException {
            return (CurrentHourSuggestConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CurrentHourSuggestConfig parseFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (CurrentHourSuggestConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static CurrentHourSuggestConfig parseFrom(C3407e c3407e) throws IOException {
            return (CurrentHourSuggestConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static CurrentHourSuggestConfig parseFrom(C3407e c3407e, C3410h c3410h) throws IOException {
            return (CurrentHourSuggestConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e, c3410h);
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

        public static final class Builder extends GeneratedMessageLite.AbstractC3380b<PictureConfig, Builder> implements PictureConfigOrBuilder {
            private Builder() {
                super(PictureConfig.DEFAULT_INSTANCE);
            }

            public Builder clearChangeVoiceNo() {
                copyOnWrite();
                ((PictureConfig) this.instance).clearChangeVoiceNo();
                return this;
            }

            public Builder clearDynamicUrl() {
                copyOnWrite();
                ((PictureConfig) this.instance).clearDynamicUrl();
                return this;
            }

            public Builder clearEndMill() {
                copyOnWrite();
                ((PictureConfig) this.instance).clearEndMill();
                return this;
            }

            public Builder clearFunnyUrl() {
                copyOnWrite();
                ((PictureConfig) this.instance).clearFunnyUrl();
                return this;
            }

            public Builder clearMediumDynamicUrl() {
                copyOnWrite();
                ((PictureConfig) this.instance).clearMediumDynamicUrl();
                return this;
            }

            public Builder clearRemainingSec() {
                copyOnWrite();
                ((PictureConfig) this.instance).clearRemainingSec();
                return this;
            }

            public Builder clearSmallDynamicUrl() {
                copyOnWrite();
                ((PictureConfig) this.instance).clearSmallDynamicUrl();
                return this;
            }

            public Builder clearStaticUrl() {
                copyOnWrite();
                ((PictureConfig) this.instance).clearStaticUrl();
                return this;
            }

            public Builder clearTotalSec() {
                copyOnWrite();
                ((PictureConfig) this.instance).clearTotalSec();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard.PictureConfigOrBuilder
            public long getChangeVoiceNo() {
                return ((PictureConfig) this.instance).getChangeVoiceNo();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard.PictureConfigOrBuilder
            public String getDynamicUrl() {
                return ((PictureConfig) this.instance).getDynamicUrl();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard.PictureConfigOrBuilder
            public ByteString getDynamicUrlBytes() {
                return ((PictureConfig) this.instance).getDynamicUrlBytes();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard.PictureConfigOrBuilder
            public long getEndMill() {
                return ((PictureConfig) this.instance).getEndMill();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard.PictureConfigOrBuilder
            public String getFunnyUrl() {
                return ((PictureConfig) this.instance).getFunnyUrl();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard.PictureConfigOrBuilder
            public ByteString getFunnyUrlBytes() {
                return ((PictureConfig) this.instance).getFunnyUrlBytes();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard.PictureConfigOrBuilder
            public String getMediumDynamicUrl() {
                return ((PictureConfig) this.instance).getMediumDynamicUrl();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard.PictureConfigOrBuilder
            public ByteString getMediumDynamicUrlBytes() {
                return ((PictureConfig) this.instance).getMediumDynamicUrlBytes();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard.PictureConfigOrBuilder
            public long getRemainingSec() {
                return ((PictureConfig) this.instance).getRemainingSec();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard.PictureConfigOrBuilder
            public String getSmallDynamicUrl() {
                return ((PictureConfig) this.instance).getSmallDynamicUrl();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard.PictureConfigOrBuilder
            public ByteString getSmallDynamicUrlBytes() {
                return ((PictureConfig) this.instance).getSmallDynamicUrlBytes();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard.PictureConfigOrBuilder
            public String getStaticUrl() {
                return ((PictureConfig) this.instance).getStaticUrl();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard.PictureConfigOrBuilder
            public ByteString getStaticUrlBytes() {
                return ((PictureConfig) this.instance).getStaticUrlBytes();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard.PictureConfigOrBuilder
            public long getTotalSec() {
                return ((PictureConfig) this.instance).getTotalSec();
            }

            public Builder setChangeVoiceNo(long j) {
                copyOnWrite();
                ((PictureConfig) this.instance).setChangeVoiceNo(j);
                return this;
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

            public Builder setEndMill(long j) {
                copyOnWrite();
                ((PictureConfig) this.instance).setEndMill(j);
                return this;
            }

            public Builder setFunnyUrl(String str) {
                copyOnWrite();
                ((PictureConfig) this.instance).setFunnyUrl(str);
                return this;
            }

            public Builder setFunnyUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((PictureConfig) this.instance).setFunnyUrlBytes(byteString);
                return this;
            }

            public Builder setMediumDynamicUrl(String str) {
                copyOnWrite();
                ((PictureConfig) this.instance).setMediumDynamicUrl(str);
                return this;
            }

            public Builder setMediumDynamicUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((PictureConfig) this.instance).setMediumDynamicUrlBytes(byteString);
                return this;
            }

            public Builder setRemainingSec(long j) {
                copyOnWrite();
                ((PictureConfig) this.instance).setRemainingSec(j);
                return this;
            }

            public Builder setSmallDynamicUrl(String str) {
                copyOnWrite();
                ((PictureConfig) this.instance).setSmallDynamicUrl(str);
                return this;
            }

            public Builder setSmallDynamicUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((PictureConfig) this.instance).setSmallDynamicUrlBytes(byteString);
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

            public Builder setTotalSec(long j) {
                copyOnWrite();
                ((PictureConfig) this.instance).setTotalSec(j);
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
            AbstractC3403a.checkByteStringIsUtf8(byteString);
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
            AbstractC3403a.checkByteStringIsUtf8(byteString);
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
            AbstractC3403a.checkByteStringIsUtf8(byteString);
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
            AbstractC3403a.checkByteStringIsUtf8(byteString);
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
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.staticUrl_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTotalSec(long j) {
            this.totalSec_ = j;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C45641.f16006xa1df5c61[methodToInvoke.ordinal()]) {
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
                    this.dynamicUrl_ = interfaceC3386h.mo16997f(!this.dynamicUrl_.isEmpty(), this.dynamicUrl_, !pictureConfig.dynamicUrl_.isEmpty(), pictureConfig.dynamicUrl_);
                    this.smallDynamicUrl_ = interfaceC3386h.mo16997f(!this.smallDynamicUrl_.isEmpty(), this.smallDynamicUrl_, !pictureConfig.smallDynamicUrl_.isEmpty(), pictureConfig.smallDynamicUrl_);
                    this.mediumDynamicUrl_ = interfaceC3386h.mo16997f(!this.mediumDynamicUrl_.isEmpty(), this.mediumDynamicUrl_, !pictureConfig.mediumDynamicUrl_.isEmpty(), pictureConfig.mediumDynamicUrl_);
                    long j = this.totalSec_;
                    boolean z2 = j != 0;
                    long j2 = pictureConfig.totalSec_;
                    this.totalSec_ = interfaceC3386h.mo17000i(z2, j, j2 != 0, j2);
                    long j3 = this.remainingSec_;
                    boolean z3 = j3 != 0;
                    long j4 = pictureConfig.remainingSec_;
                    this.remainingSec_ = interfaceC3386h.mo17000i(z3, j3, j4 != 0, j4);
                    long j5 = this.changeVoiceNo_;
                    boolean z4 = j5 != 0;
                    long j6 = pictureConfig.changeVoiceNo_;
                    this.changeVoiceNo_ = interfaceC3386h.mo17000i(z4, j5, j6 != 0, j6);
                    long j7 = this.endMill_;
                    boolean z5 = j7 != 0;
                    long j8 = pictureConfig.endMill_;
                    this.endMill_ = interfaceC3386h.mo17000i(z5, j7, j8 != 0, j8);
                    this.funnyUrl_ = interfaceC3386h.mo16997f(!this.funnyUrl_.isEmpty(), this.funnyUrl_, !pictureConfig.funnyUrl_.isEmpty(), pictureConfig.funnyUrl_);
                    GeneratedMessageLite.C3385g c3385g = GeneratedMessageLite.C3385g.INSTANCE;
                    return this;
                case 6:
                    C3407e c3407e = (C3407e) obj;
                    while (!z) {
                        try {
                            int iM17116M = c3407e.m17116M();
                            if (iM17116M != 0) {
                                if (iM17116M == 10) {
                                    this.staticUrl_ = c3407e.m17115L();
                                } else if (iM17116M == 18) {
                                    this.dynamicUrl_ = c3407e.m17115L();
                                } else if (iM17116M == 26) {
                                    this.smallDynamicUrl_ = c3407e.m17115L();
                                } else if (iM17116M == 34) {
                                    this.mediumDynamicUrl_ = c3407e.m17115L();
                                } else if (iM17116M == 40) {
                                    this.totalSec_ = c3407e.m17142v();
                                } else if (iM17116M == 48) {
                                    this.remainingSec_ = c3407e.m17142v();
                                } else if (iM17116M == 56) {
                                    this.changeVoiceNo_ = c3407e.m17142v();
                                } else if (iM17116M == 64) {
                                    this.endMill_ = c3407e.m17142v();
                                } else if (iM17116M == 74) {
                                    this.funnyUrl_ = c3407e.m17115L();
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

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard.PictureConfigOrBuilder
        public long getChangeVoiceNo() {
            return this.changeVoiceNo_;
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard.PictureConfigOrBuilder
        public String getDynamicUrl() {
            return this.dynamicUrl_;
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard.PictureConfigOrBuilder
        public ByteString getDynamicUrlBytes() {
            return ByteString.copyFromUtf8(this.dynamicUrl_);
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard.PictureConfigOrBuilder
        public long getEndMill() {
            return this.endMill_;
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard.PictureConfigOrBuilder
        public String getFunnyUrl() {
            return this.funnyUrl_;
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard.PictureConfigOrBuilder
        public ByteString getFunnyUrlBytes() {
            return ByteString.copyFromUtf8(this.funnyUrl_);
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard.PictureConfigOrBuilder
        public String getMediumDynamicUrl() {
            return this.mediumDynamicUrl_;
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard.PictureConfigOrBuilder
        public ByteString getMediumDynamicUrlBytes() {
            return ByteString.copyFromUtf8(this.mediumDynamicUrl_);
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard.PictureConfigOrBuilder
        public long getRemainingSec() {
            return this.remainingSec_;
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
            if (!this.smallDynamicUrl_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(3, getSmallDynamicUrl());
            }
            if (!this.mediumDynamicUrl_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(4, getMediumDynamicUrl());
            }
            long j = this.totalSec_;
            if (j != 0) {
                iM16901K += CodedOutputStream.m16931v(5, j);
            }
            long j2 = this.remainingSec_;
            if (j2 != 0) {
                iM16901K += CodedOutputStream.m16931v(6, j2);
            }
            long j3 = this.changeVoiceNo_;
            if (j3 != 0) {
                iM16901K += CodedOutputStream.m16931v(7, j3);
            }
            long j4 = this.endMill_;
            if (j4 != 0) {
                iM16901K += CodedOutputStream.m16931v(8, j4);
            }
            if (!this.funnyUrl_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(9, getFunnyUrl());
            }
            this.memoizedSerializedSize = iM16901K;
            return iM16901K;
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard.PictureConfigOrBuilder
        public String getSmallDynamicUrl() {
            return this.smallDynamicUrl_;
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard.PictureConfigOrBuilder
        public ByteString getSmallDynamicUrlBytes() {
            return ByteString.copyFromUtf8(this.smallDynamicUrl_);
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard.PictureConfigOrBuilder
        public String getStaticUrl() {
            return this.staticUrl_;
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard.PictureConfigOrBuilder
        public ByteString getStaticUrlBytes() {
            return ByteString.copyFromUtf8(this.staticUrl_);
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard.PictureConfigOrBuilder
        public long getTotalSec() {
            return this.totalSec_;
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.staticUrl_.isEmpty()) {
                codedOutputStream.mo16939D0(1, getStaticUrl());
            }
            if (!this.dynamicUrl_.isEmpty()) {
                codedOutputStream.mo16939D0(2, getDynamicUrl());
            }
            if (!this.smallDynamicUrl_.isEmpty()) {
                codedOutputStream.mo16939D0(3, getSmallDynamicUrl());
            }
            if (!this.mediumDynamicUrl_.isEmpty()) {
                codedOutputStream.mo16939D0(4, getMediumDynamicUrl());
            }
            long j = this.totalSec_;
            if (j != 0) {
                codedOutputStream.m16972u0(5, j);
            }
            long j2 = this.remainingSec_;
            if (j2 != 0) {
                codedOutputStream.m16972u0(6, j2);
            }
            long j3 = this.changeVoiceNo_;
            if (j3 != 0) {
                codedOutputStream.m16972u0(7, j3);
            }
            long j4 = this.endMill_;
            if (j4 != 0) {
                codedOutputStream.m16972u0(8, j4);
            }
            if (this.funnyUrl_.isEmpty()) {
                return;
            }
            codedOutputStream.mo16939D0(9, getFunnyUrl());
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
            switch (C45641.f16006xa1df5c61[methodToInvoke.ordinal()]) {
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

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard.UserMaskOrBuilder
        public String getAvatar() {
            return this.avatar_;
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard.UserMaskOrBuilder
        public ByteString getAvatarBytes() {
            return ByteString.copyFromUtf8(this.avatar_);
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard.UserMaskOrBuilder
        public AvatarConfig getAvatarConfig() {
            AvatarConfig avatarConfig = this.avatarConfig_;
            return avatarConfig == null ? AvatarConfig.getDefaultInstance() : avatarConfig;
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard.UserMaskOrBuilder
        public String getName() {
            return this.name_;
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard.UserMaskOrBuilder
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

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard.UserMaskOrBuilder
        public String getUserId() {
            return this.userId_;
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard.UserMaskOrBuilder
        public ByteString getUserIdBytes() {
            return ByteString.copyFromUtf8(this.userId_);
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard.UserMaskOrBuilder
        public VoiceMaskModeAddition getVoiceMaskModeAddition() {
            VoiceMaskModeAddition voiceMaskModeAddition = this.voiceMaskModeAddition_;
            return voiceMaskModeAddition == null ? VoiceMaskModeAddition.getDefaultInstance() : voiceMaskModeAddition;
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard.UserMaskOrBuilder
        public boolean hasAvatarConfig() {
            return this.avatarConfig_ != null;
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard.UserMaskOrBuilder
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

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard.UserMaskOrBuilder
            public String getAvatar() {
                return ((UserMask) this.instance).getAvatar();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard.UserMaskOrBuilder
            public ByteString getAvatarBytes() {
                return ((UserMask) this.instance).getAvatarBytes();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard.UserMaskOrBuilder
            public AvatarConfig getAvatarConfig() {
                return ((UserMask) this.instance).getAvatarConfig();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard.UserMaskOrBuilder
            public String getName() {
                return ((UserMask) this.instance).getName();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard.UserMaskOrBuilder
            public ByteString getNameBytes() {
                return ((UserMask) this.instance).getNameBytes();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard.UserMaskOrBuilder
            public String getUserId() {
                return ((UserMask) this.instance).getUserId();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard.UserMaskOrBuilder
            public ByteString getUserIdBytes() {
                return ((UserMask) this.instance).getUserIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard.UserMaskOrBuilder
            public VoiceMaskModeAddition getVoiceMaskModeAddition() {
                return ((UserMask) this.instance).getVoiceMaskModeAddition();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard.UserMaskOrBuilder
            public boolean hasAvatarConfig() {
                return ((UserMask) this.instance).hasAvatarConfig();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard.UserMaskOrBuilder
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

    public static final class VoiceLiveRanking extends GeneratedMessageLite<VoiceLiveRanking, Builder> implements VoiceLiveRankingOrBuilder {
        public static final int AMOUNT_FIELD_NUMBER = 7;
        public static final int ANCHORID_FIELD_NUMBER = 2;
        public static final int ANCHORIMAGE_FIELD_NUMBER = 5;
        public static final int ANCHORNAME_FIELD_NUMBER = 6;
        public static final int CONTENT_FIELD_NUMBER = 9;
        private static final VoiceLiveRanking DEFAULT_INSTANCE;
        public static final int GAP_FIELD_NUMBER = 10;
        public static final int LIVEID_FIELD_NUMBER = 4;
        private static volatile i860<VoiceLiveRanking> PARSER = null;
        public static final int RANK_FIELD_NUMBER = 1;
        public static final int ROOMID_FIELD_NUMBER = 3;
        public static final int USERLIVESTATE_FIELD_NUMBER = 8;
        private long amount_;
        private long gap_;
        private long rank_;
        private int userLiveState_;
        private String anchorId_ = "";
        private String roomId_ = "";
        private String liveId_ = "";
        private String anchorImage_ = "";
        private String anchorName_ = "";
        private String content_ = "";

        public static final class Builder extends GeneratedMessageLite.AbstractC3380b<VoiceLiveRanking, Builder> implements VoiceLiveRankingOrBuilder {
            private Builder() {
                super(VoiceLiveRanking.DEFAULT_INSTANCE);
            }

            public Builder clearAmount() {
                copyOnWrite();
                ((VoiceLiveRanking) this.instance).clearAmount();
                return this;
            }

            public Builder clearAnchorId() {
                copyOnWrite();
                ((VoiceLiveRanking) this.instance).clearAnchorId();
                return this;
            }

            public Builder clearAnchorImage() {
                copyOnWrite();
                ((VoiceLiveRanking) this.instance).clearAnchorImage();
                return this;
            }

            public Builder clearAnchorName() {
                copyOnWrite();
                ((VoiceLiveRanking) this.instance).clearAnchorName();
                return this;
            }

            public Builder clearContent() {
                copyOnWrite();
                ((VoiceLiveRanking) this.instance).clearContent();
                return this;
            }

            public Builder clearGap() {
                copyOnWrite();
                ((VoiceLiveRanking) this.instance).clearGap();
                return this;
            }

            public Builder clearLiveId() {
                copyOnWrite();
                ((VoiceLiveRanking) this.instance).clearLiveId();
                return this;
            }

            public Builder clearRank() {
                copyOnWrite();
                ((VoiceLiveRanking) this.instance).clearRank();
                return this;
            }

            public Builder clearRoomId() {
                copyOnWrite();
                ((VoiceLiveRanking) this.instance).clearRoomId();
                return this;
            }

            public Builder clearUserLiveState() {
                copyOnWrite();
                ((VoiceLiveRanking) this.instance).clearUserLiveState();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard.VoiceLiveRankingOrBuilder
            public long getAmount() {
                return ((VoiceLiveRanking) this.instance).getAmount();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard.VoiceLiveRankingOrBuilder
            public String getAnchorId() {
                return ((VoiceLiveRanking) this.instance).getAnchorId();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard.VoiceLiveRankingOrBuilder
            public ByteString getAnchorIdBytes() {
                return ((VoiceLiveRanking) this.instance).getAnchorIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard.VoiceLiveRankingOrBuilder
            public String getAnchorImage() {
                return ((VoiceLiveRanking) this.instance).getAnchorImage();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard.VoiceLiveRankingOrBuilder
            public ByteString getAnchorImageBytes() {
                return ((VoiceLiveRanking) this.instance).getAnchorImageBytes();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard.VoiceLiveRankingOrBuilder
            public String getAnchorName() {
                return ((VoiceLiveRanking) this.instance).getAnchorName();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard.VoiceLiveRankingOrBuilder
            public ByteString getAnchorNameBytes() {
                return ((VoiceLiveRanking) this.instance).getAnchorNameBytes();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard.VoiceLiveRankingOrBuilder
            public String getContent() {
                return ((VoiceLiveRanking) this.instance).getContent();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard.VoiceLiveRankingOrBuilder
            public ByteString getContentBytes() {
                return ((VoiceLiveRanking) this.instance).getContentBytes();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard.VoiceLiveRankingOrBuilder
            public long getGap() {
                return ((VoiceLiveRanking) this.instance).getGap();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard.VoiceLiveRankingOrBuilder
            public String getLiveId() {
                return ((VoiceLiveRanking) this.instance).getLiveId();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard.VoiceLiveRankingOrBuilder
            public ByteString getLiveIdBytes() {
                return ((VoiceLiveRanking) this.instance).getLiveIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard.VoiceLiveRankingOrBuilder
            public long getRank() {
                return ((VoiceLiveRanking) this.instance).getRank();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard.VoiceLiveRankingOrBuilder
            public String getRoomId() {
                return ((VoiceLiveRanking) this.instance).getRoomId();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard.VoiceLiveRankingOrBuilder
            public ByteString getRoomIdBytes() {
                return ((VoiceLiveRanking) this.instance).getRoomIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard.VoiceLiveRankingOrBuilder
            public VoiceLiveStateEnum getUserLiveState() {
                return ((VoiceLiveRanking) this.instance).getUserLiveState();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard.VoiceLiveRankingOrBuilder
            public int getUserLiveStateValue() {
                return ((VoiceLiveRanking) this.instance).getUserLiveStateValue();
            }

            public Builder setAmount(long j) {
                copyOnWrite();
                ((VoiceLiveRanking) this.instance).setAmount(j);
                return this;
            }

            public Builder setAnchorId(String str) {
                copyOnWrite();
                ((VoiceLiveRanking) this.instance).setAnchorId(str);
                return this;
            }

            public Builder setAnchorIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceLiveRanking) this.instance).setAnchorIdBytes(byteString);
                return this;
            }

            public Builder setAnchorImage(String str) {
                copyOnWrite();
                ((VoiceLiveRanking) this.instance).setAnchorImage(str);
                return this;
            }

            public Builder setAnchorImageBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceLiveRanking) this.instance).setAnchorImageBytes(byteString);
                return this;
            }

            public Builder setAnchorName(String str) {
                copyOnWrite();
                ((VoiceLiveRanking) this.instance).setAnchorName(str);
                return this;
            }

            public Builder setAnchorNameBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceLiveRanking) this.instance).setAnchorNameBytes(byteString);
                return this;
            }

            public Builder setContent(String str) {
                copyOnWrite();
                ((VoiceLiveRanking) this.instance).setContent(str);
                return this;
            }

            public Builder setContentBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceLiveRanking) this.instance).setContentBytes(byteString);
                return this;
            }

            public Builder setGap(long j) {
                copyOnWrite();
                ((VoiceLiveRanking) this.instance).setGap(j);
                return this;
            }

            public Builder setLiveId(String str) {
                copyOnWrite();
                ((VoiceLiveRanking) this.instance).setLiveId(str);
                return this;
            }

            public Builder setLiveIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceLiveRanking) this.instance).setLiveIdBytes(byteString);
                return this;
            }

            public Builder setRank(long j) {
                copyOnWrite();
                ((VoiceLiveRanking) this.instance).setRank(j);
                return this;
            }

            public Builder setRoomId(String str) {
                copyOnWrite();
                ((VoiceLiveRanking) this.instance).setRoomId(str);
                return this;
            }

            public Builder setRoomIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceLiveRanking) this.instance).setRoomIdBytes(byteString);
                return this;
            }

            public Builder setUserLiveState(VoiceLiveStateEnum voiceLiveStateEnum) {
                copyOnWrite();
                ((VoiceLiveRanking) this.instance).setUserLiveState(voiceLiveStateEnum);
                return this;
            }

            public Builder setUserLiveStateValue(int i) {
                copyOnWrite();
                ((VoiceLiveRanking) this.instance).setUserLiveStateValue(i);
                return this;
            }
        }

        static {
            VoiceLiveRanking voiceLiveRanking = new VoiceLiveRanking();
            DEFAULT_INSTANCE = voiceLiveRanking;
            voiceLiveRanking.makeImmutable();
        }

        private VoiceLiveRanking() {
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
        public void clearAnchorImage() {
            this.anchorImage_ = getDefaultInstance().getAnchorImage();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAnchorName() {
            this.anchorName_ = getDefaultInstance().getAnchorName();
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
        public void clearUserLiveState() {
            this.userLiveState_ = 0;
        }

        public static VoiceLiveRanking getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(VoiceLiveRanking voiceLiveRanking) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(voiceLiveRanking);
        }

        public static VoiceLiveRanking parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VoiceLiveRanking) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceLiveRanking parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VoiceLiveRanking) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<VoiceLiveRanking> parser() {
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
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.anchorId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAnchorImage(String str) {
            str.getClass();
            this.anchorImage_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAnchorImageBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.anchorImage_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAnchorName(String str) {
            str.getClass();
            this.anchorName_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAnchorNameBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.anchorName_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setContent(String str) {
            str.getClass();
            this.content_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setContentBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
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
            AbstractC3403a.checkByteStringIsUtf8(byteString);
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
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.roomId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserLiveState(VoiceLiveStateEnum voiceLiveStateEnum) {
            voiceLiveStateEnum.getClass();
            this.userLiveState_ = voiceLiveStateEnum.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserLiveStateValue(int i) {
            this.userLiveState_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C45641.f16006xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoiceLiveRanking();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3386h interfaceC3386h = (GeneratedMessageLite.InterfaceC3386h) obj;
                    VoiceLiveRanking voiceLiveRanking = (VoiceLiveRanking) obj2;
                    long j = this.rank_;
                    boolean z2 = j != 0;
                    long j2 = voiceLiveRanking.rank_;
                    this.rank_ = interfaceC3386h.mo17000i(z2, j, j2 != 0, j2);
                    this.anchorId_ = interfaceC3386h.mo16997f(!this.anchorId_.isEmpty(), this.anchorId_, !voiceLiveRanking.anchorId_.isEmpty(), voiceLiveRanking.anchorId_);
                    this.roomId_ = interfaceC3386h.mo16997f(!this.roomId_.isEmpty(), this.roomId_, !voiceLiveRanking.roomId_.isEmpty(), voiceLiveRanking.roomId_);
                    this.liveId_ = interfaceC3386h.mo16997f(!this.liveId_.isEmpty(), this.liveId_, !voiceLiveRanking.liveId_.isEmpty(), voiceLiveRanking.liveId_);
                    this.anchorImage_ = interfaceC3386h.mo16997f(!this.anchorImage_.isEmpty(), this.anchorImage_, !voiceLiveRanking.anchorImage_.isEmpty(), voiceLiveRanking.anchorImage_);
                    this.anchorName_ = interfaceC3386h.mo16997f(!this.anchorName_.isEmpty(), this.anchorName_, !voiceLiveRanking.anchorName_.isEmpty(), voiceLiveRanking.anchorName_);
                    long j3 = this.amount_;
                    boolean z3 = j3 != 0;
                    long j4 = voiceLiveRanking.amount_;
                    this.amount_ = interfaceC3386h.mo17000i(z3, j3, j4 != 0, j4);
                    int i = this.userLiveState_;
                    boolean z4 = i != 0;
                    int i2 = voiceLiveRanking.userLiveState_;
                    this.userLiveState_ = interfaceC3386h.mo16996e(z4, i, i2 != 0, i2);
                    this.content_ = interfaceC3386h.mo16997f(!this.content_.isEmpty(), this.content_, !voiceLiveRanking.content_.isEmpty(), voiceLiveRanking.content_);
                    boolean z5 = false;
                    long j5 = this.gap_;
                    if (j5 != 0) {
                        z5 = true;
                    }
                    long j6 = voiceLiveRanking.gap_;
                    this.gap_ = interfaceC3386h.mo17000i(z5, j5, j6 != 0, j6);
                    GeneratedMessageLite.C3385g c3385g = GeneratedMessageLite.C3385g.INSTANCE;
                    return this;
                case 6:
                    C3407e c3407e = (C3407e) obj;
                    while (!z) {
                        try {
                            int iM17116M = c3407e.m17116M();
                            switch (iM17116M) {
                                case 0:
                                    break;
                                case 8:
                                    this.rank_ = c3407e.m17142v();
                                    continue;
                                case 18:
                                    this.anchorId_ = c3407e.m17115L();
                                    continue;
                                case 26:
                                    this.roomId_ = c3407e.m17115L();
                                    continue;
                                case 34:
                                    this.liveId_ = c3407e.m17115L();
                                    continue;
                                case 42:
                                    this.anchorImage_ = c3407e.m17115L();
                                    continue;
                                case 50:
                                    this.anchorName_ = c3407e.m17115L();
                                    continue;
                                case 56:
                                    this.amount_ = c3407e.m17142v();
                                    continue;
                                case 64:
                                    this.userLiveState_ = c3407e.m17136p();
                                    continue;
                                case 74:
                                    this.content_ = c3407e.m17115L();
                                    continue;
                                case 80:
                                    this.gap_ = c3407e.m17142v();
                                    continue;
                                default:
                                    if (!c3407e.m17121R(iM17116M)) {
                                        break;
                                    }
                                    break;
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
                        synchronized (VoiceLiveRanking.class) {
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

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard.VoiceLiveRankingOrBuilder
        public long getAmount() {
            return this.amount_;
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard.VoiceLiveRankingOrBuilder
        public String getAnchorId() {
            return this.anchorId_;
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard.VoiceLiveRankingOrBuilder
        public ByteString getAnchorIdBytes() {
            return ByteString.copyFromUtf8(this.anchorId_);
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard.VoiceLiveRankingOrBuilder
        public String getAnchorImage() {
            return this.anchorImage_;
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard.VoiceLiveRankingOrBuilder
        public ByteString getAnchorImageBytes() {
            return ByteString.copyFromUtf8(this.anchorImage_);
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard.VoiceLiveRankingOrBuilder
        public String getAnchorName() {
            return this.anchorName_;
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard.VoiceLiveRankingOrBuilder
        public ByteString getAnchorNameBytes() {
            return ByteString.copyFromUtf8(this.anchorName_);
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard.VoiceLiveRankingOrBuilder
        public String getContent() {
            return this.content_;
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard.VoiceLiveRankingOrBuilder
        public ByteString getContentBytes() {
            return ByteString.copyFromUtf8(this.content_);
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard.VoiceLiveRankingOrBuilder
        public long getGap() {
            return this.gap_;
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard.VoiceLiveRankingOrBuilder
        public String getLiveId() {
            return this.liveId_;
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard.VoiceLiveRankingOrBuilder
        public ByteString getLiveIdBytes() {
            return ByteString.copyFromUtf8(this.liveId_);
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard.VoiceLiveRankingOrBuilder
        public long getRank() {
            return this.rank_;
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard.VoiceLiveRankingOrBuilder
        public String getRoomId() {
            return this.roomId_;
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard.VoiceLiveRankingOrBuilder
        public ByteString getRoomIdBytes() {
            return ByteString.copyFromUtf8(this.roomId_);
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            long j = this.rank_;
            int iM16931v = j != 0 ? CodedOutputStream.m16931v(1, j) : 0;
            if (!this.anchorId_.isEmpty()) {
                iM16931v += CodedOutputStream.m16901K(2, getAnchorId());
            }
            if (!this.roomId_.isEmpty()) {
                iM16931v += CodedOutputStream.m16901K(3, getRoomId());
            }
            if (!this.liveId_.isEmpty()) {
                iM16931v += CodedOutputStream.m16901K(4, getLiveId());
            }
            if (!this.anchorImage_.isEmpty()) {
                iM16931v += CodedOutputStream.m16901K(5, getAnchorImage());
            }
            if (!this.anchorName_.isEmpty()) {
                iM16931v += CodedOutputStream.m16901K(6, getAnchorName());
            }
            long j2 = this.amount_;
            if (j2 != 0) {
                iM16931v += CodedOutputStream.m16931v(7, j2);
            }
            if (this.userLiveState_ != VoiceLiveStateEnum.onlive.getNumber()) {
                iM16931v += CodedOutputStream.m16922m(8, this.userLiveState_);
            }
            if (!this.content_.isEmpty()) {
                iM16931v += CodedOutputStream.m16901K(9, getContent());
            }
            long j3 = this.gap_;
            if (j3 != 0) {
                iM16931v += CodedOutputStream.m16931v(10, j3);
            }
            this.memoizedSerializedSize = iM16931v;
            return iM16931v;
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard.VoiceLiveRankingOrBuilder
        public VoiceLiveStateEnum getUserLiveState() {
            VoiceLiveStateEnum voiceLiveStateEnumForNumber = VoiceLiveStateEnum.forNumber(this.userLiveState_);
            return voiceLiveStateEnumForNumber == null ? VoiceLiveStateEnum.UNRECOGNIZED : voiceLiveStateEnumForNumber;
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard.VoiceLiveRankingOrBuilder
        public int getUserLiveStateValue() {
            return this.userLiveState_;
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            long j = this.rank_;
            if (j != 0) {
                codedOutputStream.m16972u0(1, j);
            }
            if (!this.anchorId_.isEmpty()) {
                codedOutputStream.mo16939D0(2, getAnchorId());
            }
            if (!this.roomId_.isEmpty()) {
                codedOutputStream.mo16939D0(3, getRoomId());
            }
            if (!this.liveId_.isEmpty()) {
                codedOutputStream.mo16939D0(4, getLiveId());
            }
            if (!this.anchorImage_.isEmpty()) {
                codedOutputStream.mo16939D0(5, getAnchorImage());
            }
            if (!this.anchorName_.isEmpty()) {
                codedOutputStream.mo16939D0(6, getAnchorName());
            }
            long j2 = this.amount_;
            if (j2 != 0) {
                codedOutputStream.m16972u0(7, j2);
            }
            if (this.userLiveState_ != VoiceLiveStateEnum.onlive.getNumber()) {
                codedOutputStream.m16960i0(8, this.userLiveState_);
            }
            if (!this.content_.isEmpty()) {
                codedOutputStream.mo16939D0(9, getContent());
            }
            long j3 = this.gap_;
            if (j3 != 0) {
                codedOutputStream.m16972u0(10, j3);
            }
        }

        public static VoiceLiveRanking parseDelimitedFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (VoiceLiveRanking) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static VoiceLiveRanking parseFrom(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
            return (VoiceLiveRanking) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3410h);
        }

        public static VoiceLiveRanking parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoiceLiveRanking) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoiceLiveRanking parseFrom(byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
            return (VoiceLiveRanking) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3410h);
        }

        public static VoiceLiveRanking parseFrom(InputStream inputStream) throws IOException {
            return (VoiceLiveRanking) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceLiveRanking parseFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (VoiceLiveRanking) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static VoiceLiveRanking parseFrom(C3407e c3407e) throws IOException {
            return (VoiceLiveRanking) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static VoiceLiveRanking parseFrom(C3407e c3407e, C3410h c3410h) throws IOException {
            return (VoiceLiveRanking) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e, c3410h);
        }
    }

    public enum VoiceLiveRankingAction implements C3414l.c {
        all(0),
        current(1),
        top(2),
        UNRECOGNIZED(-1);

        public static final int all_VALUE = 0;
        public static final int current_VALUE = 1;
        private static final C3414l.d<VoiceLiveRankingAction> internalValueMap = new C3414l.d<VoiceLiveRankingAction>() { // from class: com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard.VoiceLiveRankingAction.1
            @Override // com.google.protobuf.C3414l.d
            public VoiceLiveRankingAction findValueByNumber(int i) {
                return VoiceLiveRankingAction.forNumber(i);
            }
        };
        public static final int top_VALUE = 2;
        private final int value;

        VoiceLiveRankingAction(int i) {
            this.value = i;
        }

        public static VoiceLiveRankingAction forNumber(int i) {
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

        public static C3414l.d<VoiceLiveRankingAction> internalGetValueMap() {
            return internalValueMap;
        }

        @Override // com.google.protobuf.C3414l.c
        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static VoiceLiveRankingAction valueOf(int i) {
            return forNumber(i);
        }
    }

    public enum VoiceLiveRankingMsgType implements C3414l.c {
        normal(0),
        start(1),
        progress(2),
        sprint(3),
        UNRECOGNIZED(-1);

        private static final C3414l.d<VoiceLiveRankingMsgType> internalValueMap = new C3414l.d<VoiceLiveRankingMsgType>() { // from class: com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard.VoiceLiveRankingMsgType.1
            @Override // com.google.protobuf.C3414l.d
            public VoiceLiveRankingMsgType findValueByNumber(int i) {
                return VoiceLiveRankingMsgType.forNumber(i);
            }
        };
        public static final int normal_VALUE = 0;
        public static final int progress_VALUE = 2;
        public static final int sprint_VALUE = 3;
        public static final int start_VALUE = 1;
        private final int value;

        VoiceLiveRankingMsgType(int i) {
            this.value = i;
        }

        public static VoiceLiveRankingMsgType forNumber(int i) {
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

        public static C3414l.d<VoiceLiveRankingMsgType> internalGetValueMap() {
            return internalValueMap;
        }

        @Override // com.google.protobuf.C3414l.c
        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static VoiceLiveRankingMsgType valueOf(int i) {
            return forNumber(i);
        }
    }

    public enum VoiceLiveRankingType implements C3414l.c {
        currentHour(0),
        lastHour(1),
        UNRECOGNIZED(-1);

        public static final int currentHour_VALUE = 0;
        private static final C3414l.d<VoiceLiveRankingType> internalValueMap = new C3414l.d<VoiceLiveRankingType>() { // from class: com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard.VoiceLiveRankingType.1
            @Override // com.google.protobuf.C3414l.d
            public VoiceLiveRankingType findValueByNumber(int i) {
                return VoiceLiveRankingType.forNumber(i);
            }
        };
        public static final int lastHour_VALUE = 1;
        private final int value;

        VoiceLiveRankingType(int i) {
            this.value = i;
        }

        public static VoiceLiveRankingType forNumber(int i) {
            if (i == 0) {
                return currentHour;
            }
            if (i != 1) {
                return null;
            }
            return lastHour;
        }

        public static C3414l.d<VoiceLiveRankingType> internalGetValueMap() {
            return internalValueMap;
        }

        @Override // com.google.protobuf.C3414l.c
        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static VoiceLiveRankingType valueOf(int i) {
            return forNumber(i);
        }
    }

    public static final class VoiceLiveRankings extends GeneratedMessageLite<VoiceLiveRankings, Builder> implements VoiceLiveRankingsOrBuilder {
        public static final int ACTION_FIELD_NUMBER = 3;
        private static final VoiceLiveRankings DEFAULT_INSTANCE;
        public static final int LIVEID_FIELD_NUMBER = 6;
        public static final int MSGTYPE_FIELD_NUMBER = 9;
        private static volatile i860<VoiceLiveRankings> PARSER = null;
        public static final int RANKINGS_FIELD_NUMBER = 4;
        public static final int RANKINGTIME_FIELD_NUMBER = 7;
        public static final int ROOMID_FIELD_NUMBER = 5;
        public static final int TITLE_FIELD_NUMBER = 1;
        public static final int TYPE_FIELD_NUMBER = 2;
        private int action_;
        private int bitField0_;
        private int msgType_;
        private long rankingTime_;
        private int type_;
        private String title_ = "";
        private C3414l.h<VoiceLiveRanking> rankings_ = GeneratedMessageLite.emptyProtobufList();
        private String roomId_ = "";
        private String liveId_ = "";

        static {
            VoiceLiveRankings voiceLiveRankings = new VoiceLiveRankings();
            DEFAULT_INSTANCE = voiceLiveRankings;
            voiceLiveRankings.makeImmutable();
        }

        private VoiceLiveRankings() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllRankings(Iterable<? extends VoiceLiveRanking> iterable) {
            ensureRankingsIsMutable();
            AbstractC3403a.addAll(iterable, this.rankings_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addRankings(VoiceLiveRanking.Builder builder) {
            ensureRankingsIsMutable();
            this.rankings_.add(builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAction() {
            this.action_ = 0;
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
            if (this.rankings_.mo17085q()) {
                return;
            }
            this.rankings_ = GeneratedMessageLite.mutableCopy(this.rankings_);
        }

        public static VoiceLiveRankings getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(VoiceLiveRankings voiceLiveRankings) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(voiceLiveRankings);
        }

        public static VoiceLiveRankings parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VoiceLiveRankings) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceLiveRankings parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VoiceLiveRankings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<VoiceLiveRankings> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeRankings(int i) {
            ensureRankingsIsMutable();
            this.rankings_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAction(VoiceLiveRankingAction voiceLiveRankingAction) {
            voiceLiveRankingAction.getClass();
            this.action_ = voiceLiveRankingAction.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setActionValue(int i) {
            this.action_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLiveId(String str) {
            str.getClass();
            this.liveId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLiveIdBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.liveId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMsgType(VoiceLiveRankingMsgType voiceLiveRankingMsgType) {
            voiceLiveRankingMsgType.getClass();
            this.msgType_ = voiceLiveRankingMsgType.getNumber();
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
        public void setRankings(int i, VoiceLiveRanking.Builder builder) {
            ensureRankingsIsMutable();
            this.rankings_.set(i, builder.build());
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
        public void setTitle(String str) {
            str.getClass();
            this.title_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTitleBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.title_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setType(VoiceLiveRankingType voiceLiveRankingType) {
            voiceLiveRankingType.getClass();
            this.type_ = voiceLiveRankingType.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTypeValue(int i) {
            this.type_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C45641.f16006xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoiceLiveRankings();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.rankings_.mo17084n();
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3386h interfaceC3386h = (GeneratedMessageLite.InterfaceC3386h) obj;
                    VoiceLiveRankings voiceLiveRankings = (VoiceLiveRankings) obj2;
                    this.title_ = interfaceC3386h.mo16997f(!this.title_.isEmpty(), this.title_, !voiceLiveRankings.title_.isEmpty(), voiceLiveRankings.title_);
                    int i = this.type_;
                    boolean z2 = i != 0;
                    int i2 = voiceLiveRankings.type_;
                    this.type_ = interfaceC3386h.mo16996e(z2, i, i2 != 0, i2);
                    int i3 = this.action_;
                    boolean z3 = i3 != 0;
                    int i4 = voiceLiveRankings.action_;
                    this.action_ = interfaceC3386h.mo16996e(z3, i3, i4 != 0, i4);
                    this.rankings_ = interfaceC3386h.mo16998g(this.rankings_, voiceLiveRankings.rankings_);
                    this.roomId_ = interfaceC3386h.mo16997f(!this.roomId_.isEmpty(), this.roomId_, !voiceLiveRankings.roomId_.isEmpty(), voiceLiveRankings.roomId_);
                    this.liveId_ = interfaceC3386h.mo16997f(!this.liveId_.isEmpty(), this.liveId_, !voiceLiveRankings.liveId_.isEmpty(), voiceLiveRankings.liveId_);
                    long j = this.rankingTime_;
                    boolean z4 = j != 0;
                    long j2 = voiceLiveRankings.rankingTime_;
                    this.rankingTime_ = interfaceC3386h.mo17000i(z4, j, j2 != 0, j2);
                    int i5 = this.msgType_;
                    boolean z5 = i5 != 0;
                    int i6 = voiceLiveRankings.msgType_;
                    this.msgType_ = interfaceC3386h.mo16996e(z5, i5, i6 != 0, i6);
                    if (interfaceC3386h == GeneratedMessageLite.C3385g.INSTANCE) {
                        this.bitField0_ |= voiceLiveRankings.bitField0_;
                    }
                    return this;
                case 6:
                    C3407e c3407e = (C3407e) obj;
                    C3410h c3410h = (C3410h) obj2;
                    while (!z) {
                        try {
                            int iM17116M = c3407e.m17116M();
                            if (iM17116M != 0) {
                                if (iM17116M == 10) {
                                    this.title_ = c3407e.m17115L();
                                } else if (iM17116M == 16) {
                                    this.type_ = c3407e.m17136p();
                                } else if (iM17116M == 24) {
                                    this.action_ = c3407e.m17136p();
                                } else if (iM17116M == 34) {
                                    if (!this.rankings_.mo17085q()) {
                                        this.rankings_ = GeneratedMessageLite.mutableCopy(this.rankings_);
                                    }
                                    this.rankings_.add((VoiceLiveRanking) c3407e.m17143w(VoiceLiveRanking.parser(), c3410h));
                                } else if (iM17116M == 42) {
                                    this.roomId_ = c3407e.m17115L();
                                } else if (iM17116M == 50) {
                                    this.liveId_ = c3407e.m17115L();
                                } else if (iM17116M == 56) {
                                    this.rankingTime_ = c3407e.m17142v();
                                } else if (iM17116M == 72) {
                                    this.msgType_ = c3407e.m17136p();
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
                        synchronized (VoiceLiveRankings.class) {
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

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard.VoiceLiveRankingsOrBuilder
        public VoiceLiveRankingAction getAction() {
            VoiceLiveRankingAction voiceLiveRankingActionForNumber = VoiceLiveRankingAction.forNumber(this.action_);
            return voiceLiveRankingActionForNumber == null ? VoiceLiveRankingAction.UNRECOGNIZED : voiceLiveRankingActionForNumber;
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard.VoiceLiveRankingsOrBuilder
        public int getActionValue() {
            return this.action_;
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard.VoiceLiveRankingsOrBuilder
        public String getLiveId() {
            return this.liveId_;
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard.VoiceLiveRankingsOrBuilder
        public ByteString getLiveIdBytes() {
            return ByteString.copyFromUtf8(this.liveId_);
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard.VoiceLiveRankingsOrBuilder
        public VoiceLiveRankingMsgType getMsgType() {
            VoiceLiveRankingMsgType voiceLiveRankingMsgTypeForNumber = VoiceLiveRankingMsgType.forNumber(this.msgType_);
            return voiceLiveRankingMsgTypeForNumber == null ? VoiceLiveRankingMsgType.UNRECOGNIZED : voiceLiveRankingMsgTypeForNumber;
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard.VoiceLiveRankingsOrBuilder
        public int getMsgTypeValue() {
            return this.msgType_;
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard.VoiceLiveRankingsOrBuilder
        public long getRankingTime() {
            return this.rankingTime_;
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard.VoiceLiveRankingsOrBuilder
        public VoiceLiveRanking getRankings(int i) {
            return this.rankings_.get(i);
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard.VoiceLiveRankingsOrBuilder
        public int getRankingsCount() {
            return this.rankings_.size();
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard.VoiceLiveRankingsOrBuilder
        public List<VoiceLiveRanking> getRankingsList() {
            return this.rankings_;
        }

        public VoiceLiveRankingOrBuilder getRankingsOrBuilder(int i) {
            return this.rankings_.get(i);
        }

        public List<? extends VoiceLiveRankingOrBuilder> getRankingsOrBuilderList() {
            return this.rankings_;
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard.VoiceLiveRankingsOrBuilder
        public String getRoomId() {
            return this.roomId_;
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard.VoiceLiveRankingsOrBuilder
        public ByteString getRoomIdBytes() {
            return ByteString.copyFromUtf8(this.roomId_);
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16901K = !this.title_.isEmpty() ? CodedOutputStream.m16901K(1, getTitle()) : 0;
            if (this.type_ != VoiceLiveRankingType.currentHour.getNumber()) {
                iM16901K += CodedOutputStream.m16922m(2, this.type_);
            }
            if (this.action_ != VoiceLiveRankingAction.all.getNumber()) {
                iM16901K += CodedOutputStream.m16922m(3, this.action_);
            }
            for (int i2 = 0; i2 < this.rankings_.size(); i2++) {
                iM16901K += CodedOutputStream.m16893C(4, this.rankings_.get(i2));
            }
            if (!this.roomId_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(5, getRoomId());
            }
            if (!this.liveId_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(6, getLiveId());
            }
            long j = this.rankingTime_;
            if (j != 0) {
                iM16901K += CodedOutputStream.m16931v(7, j);
            }
            if (this.msgType_ != VoiceLiveRankingMsgType.normal.getNumber()) {
                iM16901K += CodedOutputStream.m16922m(9, this.msgType_);
            }
            this.memoizedSerializedSize = iM16901K;
            return iM16901K;
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard.VoiceLiveRankingsOrBuilder
        public String getTitle() {
            return this.title_;
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard.VoiceLiveRankingsOrBuilder
        public ByteString getTitleBytes() {
            return ByteString.copyFromUtf8(this.title_);
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard.VoiceLiveRankingsOrBuilder
        public VoiceLiveRankingType getType() {
            VoiceLiveRankingType voiceLiveRankingTypeForNumber = VoiceLiveRankingType.forNumber(this.type_);
            return voiceLiveRankingTypeForNumber == null ? VoiceLiveRankingType.UNRECOGNIZED : voiceLiveRankingTypeForNumber;
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard.VoiceLiveRankingsOrBuilder
        public int getTypeValue() {
            return this.type_;
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.title_.isEmpty()) {
                codedOutputStream.mo16939D0(1, getTitle());
            }
            if (this.type_ != VoiceLiveRankingType.currentHour.getNumber()) {
                codedOutputStream.m16960i0(2, this.type_);
            }
            if (this.action_ != VoiceLiveRankingAction.all.getNumber()) {
                codedOutputStream.m16960i0(3, this.action_);
            }
            for (int i = 0; i < this.rankings_.size(); i++) {
                codedOutputStream.mo16974w0(4, this.rankings_.get(i));
            }
            if (!this.roomId_.isEmpty()) {
                codedOutputStream.mo16939D0(5, getRoomId());
            }
            if (!this.liveId_.isEmpty()) {
                codedOutputStream.mo16939D0(6, getLiveId());
            }
            long j = this.rankingTime_;
            if (j != 0) {
                codedOutputStream.m16972u0(7, j);
            }
            if (this.msgType_ != VoiceLiveRankingMsgType.normal.getNumber()) {
                codedOutputStream.m16960i0(9, this.msgType_);
            }
        }

        public static VoiceLiveRankings parseDelimitedFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (VoiceLiveRankings) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static VoiceLiveRankings parseFrom(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
            return (VoiceLiveRankings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3410h);
        }

        public static final class Builder extends GeneratedMessageLite.AbstractC3380b<VoiceLiveRankings, Builder> implements VoiceLiveRankingsOrBuilder {
            private Builder() {
                super(VoiceLiveRankings.DEFAULT_INSTANCE);
            }

            public Builder addAllRankings(Iterable<? extends VoiceLiveRanking> iterable) {
                copyOnWrite();
                ((VoiceLiveRankings) this.instance).addAllRankings(iterable);
                return this;
            }

            public Builder addRankings(VoiceLiveRanking voiceLiveRanking) {
                copyOnWrite();
                ((VoiceLiveRankings) this.instance).addRankings(voiceLiveRanking);
                return this;
            }

            public Builder clearAction() {
                copyOnWrite();
                ((VoiceLiveRankings) this.instance).clearAction();
                return this;
            }

            public Builder clearLiveId() {
                copyOnWrite();
                ((VoiceLiveRankings) this.instance).clearLiveId();
                return this;
            }

            public Builder clearMsgType() {
                copyOnWrite();
                ((VoiceLiveRankings) this.instance).clearMsgType();
                return this;
            }

            public Builder clearRankingTime() {
                copyOnWrite();
                ((VoiceLiveRankings) this.instance).clearRankingTime();
                return this;
            }

            public Builder clearRankings() {
                copyOnWrite();
                ((VoiceLiveRankings) this.instance).clearRankings();
                return this;
            }

            public Builder clearRoomId() {
                copyOnWrite();
                ((VoiceLiveRankings) this.instance).clearRoomId();
                return this;
            }

            public Builder clearTitle() {
                copyOnWrite();
                ((VoiceLiveRankings) this.instance).clearTitle();
                return this;
            }

            public Builder clearType() {
                copyOnWrite();
                ((VoiceLiveRankings) this.instance).clearType();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard.VoiceLiveRankingsOrBuilder
            public VoiceLiveRankingAction getAction() {
                return ((VoiceLiveRankings) this.instance).getAction();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard.VoiceLiveRankingsOrBuilder
            public int getActionValue() {
                return ((VoiceLiveRankings) this.instance).getActionValue();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard.VoiceLiveRankingsOrBuilder
            public String getLiveId() {
                return ((VoiceLiveRankings) this.instance).getLiveId();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard.VoiceLiveRankingsOrBuilder
            public ByteString getLiveIdBytes() {
                return ((VoiceLiveRankings) this.instance).getLiveIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard.VoiceLiveRankingsOrBuilder
            public VoiceLiveRankingMsgType getMsgType() {
                return ((VoiceLiveRankings) this.instance).getMsgType();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard.VoiceLiveRankingsOrBuilder
            public int getMsgTypeValue() {
                return ((VoiceLiveRankings) this.instance).getMsgTypeValue();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard.VoiceLiveRankingsOrBuilder
            public long getRankingTime() {
                return ((VoiceLiveRankings) this.instance).getRankingTime();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard.VoiceLiveRankingsOrBuilder
            public VoiceLiveRanking getRankings(int i) {
                return ((VoiceLiveRankings) this.instance).getRankings(i);
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard.VoiceLiveRankingsOrBuilder
            public int getRankingsCount() {
                return ((VoiceLiveRankings) this.instance).getRankingsCount();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard.VoiceLiveRankingsOrBuilder
            public List<VoiceLiveRanking> getRankingsList() {
                return Collections.unmodifiableList(((VoiceLiveRankings) this.instance).getRankingsList());
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard.VoiceLiveRankingsOrBuilder
            public String getRoomId() {
                return ((VoiceLiveRankings) this.instance).getRoomId();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard.VoiceLiveRankingsOrBuilder
            public ByteString getRoomIdBytes() {
                return ((VoiceLiveRankings) this.instance).getRoomIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard.VoiceLiveRankingsOrBuilder
            public String getTitle() {
                return ((VoiceLiveRankings) this.instance).getTitle();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard.VoiceLiveRankingsOrBuilder
            public ByteString getTitleBytes() {
                return ((VoiceLiveRankings) this.instance).getTitleBytes();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard.VoiceLiveRankingsOrBuilder
            public VoiceLiveRankingType getType() {
                return ((VoiceLiveRankings) this.instance).getType();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard.VoiceLiveRankingsOrBuilder
            public int getTypeValue() {
                return ((VoiceLiveRankings) this.instance).getTypeValue();
            }

            public Builder removeRankings(int i) {
                copyOnWrite();
                ((VoiceLiveRankings) this.instance).removeRankings(i);
                return this;
            }

            public Builder setAction(VoiceLiveRankingAction voiceLiveRankingAction) {
                copyOnWrite();
                ((VoiceLiveRankings) this.instance).setAction(voiceLiveRankingAction);
                return this;
            }

            public Builder setActionValue(int i) {
                copyOnWrite();
                ((VoiceLiveRankings) this.instance).setActionValue(i);
                return this;
            }

            public Builder setLiveId(String str) {
                copyOnWrite();
                ((VoiceLiveRankings) this.instance).setLiveId(str);
                return this;
            }

            public Builder setLiveIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceLiveRankings) this.instance).setLiveIdBytes(byteString);
                return this;
            }

            public Builder setMsgType(VoiceLiveRankingMsgType voiceLiveRankingMsgType) {
                copyOnWrite();
                ((VoiceLiveRankings) this.instance).setMsgType(voiceLiveRankingMsgType);
                return this;
            }

            public Builder setMsgTypeValue(int i) {
                copyOnWrite();
                ((VoiceLiveRankings) this.instance).setMsgTypeValue(i);
                return this;
            }

            public Builder setRankingTime(long j) {
                copyOnWrite();
                ((VoiceLiveRankings) this.instance).setRankingTime(j);
                return this;
            }

            public Builder setRankings(int i, VoiceLiveRanking voiceLiveRanking) {
                copyOnWrite();
                ((VoiceLiveRankings) this.instance).setRankings(i, voiceLiveRanking);
                return this;
            }

            public Builder setRoomId(String str) {
                copyOnWrite();
                ((VoiceLiveRankings) this.instance).setRoomId(str);
                return this;
            }

            public Builder setRoomIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceLiveRankings) this.instance).setRoomIdBytes(byteString);
                return this;
            }

            public Builder setTitle(String str) {
                copyOnWrite();
                ((VoiceLiveRankings) this.instance).setTitle(str);
                return this;
            }

            public Builder setTitleBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceLiveRankings) this.instance).setTitleBytes(byteString);
                return this;
            }

            public Builder setType(VoiceLiveRankingType voiceLiveRankingType) {
                copyOnWrite();
                ((VoiceLiveRankings) this.instance).setType(voiceLiveRankingType);
                return this;
            }

            public Builder setTypeValue(int i) {
                copyOnWrite();
                ((VoiceLiveRankings) this.instance).setTypeValue(i);
                return this;
            }

            public Builder addRankings(int i, VoiceLiveRanking voiceLiveRanking) {
                copyOnWrite();
                ((VoiceLiveRankings) this.instance).addRankings(i, voiceLiveRanking);
                return this;
            }

            public Builder setRankings(int i, VoiceLiveRanking.Builder builder) {
                copyOnWrite();
                ((VoiceLiveRankings) this.instance).setRankings(i, builder);
                return this;
            }

            public Builder addRankings(VoiceLiveRanking.Builder builder) {
                copyOnWrite();
                ((VoiceLiveRankings) this.instance).addRankings(builder);
                return this;
            }

            public Builder addRankings(int i, VoiceLiveRanking.Builder builder) {
                copyOnWrite();
                ((VoiceLiveRankings) this.instance).addRankings(i, builder);
                return this;
            }
        }

        public static VoiceLiveRankings parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoiceLiveRankings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoiceLiveRankings parseFrom(byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
            return (VoiceLiveRankings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3410h);
        }

        public static VoiceLiveRankings parseFrom(InputStream inputStream) throws IOException {
            return (VoiceLiveRankings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceLiveRankings parseFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (VoiceLiveRankings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static VoiceLiveRankings parseFrom(C3407e c3407e) throws IOException {
            return (VoiceLiveRankings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addRankings(int i, VoiceLiveRanking voiceLiveRanking) {
            voiceLiveRanking.getClass();
            ensureRankingsIsMutable();
            this.rankings_.add(i, voiceLiveRanking);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static VoiceLiveRankings parseFrom(C3407e c3407e, C3410h c3410h) throws IOException {
            return (VoiceLiveRankings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e, c3410h);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRankings(int i, VoiceLiveRanking voiceLiveRanking) {
            voiceLiveRanking.getClass();
            ensureRankingsIsMutable();
            this.rankings_.set(i, voiceLiveRanking);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addRankings(VoiceLiveRanking voiceLiveRanking) {
            voiceLiveRanking.getClass();
            ensureRankingsIsMutable();
            this.rankings_.add(voiceLiveRanking);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addRankings(int i, VoiceLiveRanking.Builder builder) {
            ensureRankingsIsMutable();
            this.rankings_.add(i, builder.build());
        }
    }

    public enum VoiceLiveStateEnum implements C3414l.c {
        onlive(0),
        stopped(1),
        suspended(2),
        born(3),
        UNRECOGNIZED(-1);

        public static final int born_VALUE = 3;
        private static final C3414l.d<VoiceLiveStateEnum> internalValueMap = new C3414l.d<VoiceLiveStateEnum>() { // from class: com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard.VoiceLiveStateEnum.1
            @Override // com.google.protobuf.C3414l.d
            public VoiceLiveStateEnum findValueByNumber(int i) {
                return VoiceLiveStateEnum.forNumber(i);
            }
        };
        public static final int onlive_VALUE = 0;
        public static final int stopped_VALUE = 1;
        public static final int suspended_VALUE = 2;
        private final int value;

        VoiceLiveStateEnum(int i) {
            this.value = i;
        }

        public static VoiceLiveStateEnum forNumber(int i) {
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

        public static C3414l.d<VoiceLiveStateEnum> internalGetValueMap() {
            return internalValueMap;
        }

        @Override // com.google.protobuf.C3414l.c
        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static VoiceLiveStateEnum valueOf(int i) {
            return forNumber(i);
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

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard.VoiceMaskModeAdditionOrBuilder
            public String getColor() {
                return ((VoiceMaskModeAddition) this.instance).getColor();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard.VoiceMaskModeAdditionOrBuilder
            public ByteString getColorBytes() {
                return ((VoiceMaskModeAddition) this.instance).getColorBytes();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard.VoiceMaskModeAdditionOrBuilder
            public String getGender() {
                return ((VoiceMaskModeAddition) this.instance).getGender();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard.VoiceMaskModeAdditionOrBuilder
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
            switch (C45641.f16006xa1df5c61[methodToInvoke.ordinal()]) {
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

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard.VoiceMaskModeAdditionOrBuilder
        public String getColor() {
            return this.color_;
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard.VoiceMaskModeAdditionOrBuilder
        public ByteString getColorBytes() {
            return ByteString.copyFromUtf8(this.color_);
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard.VoiceMaskModeAdditionOrBuilder
        public String getGender() {
            return this.gender_;
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard.VoiceMaskModeAdditionOrBuilder
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
