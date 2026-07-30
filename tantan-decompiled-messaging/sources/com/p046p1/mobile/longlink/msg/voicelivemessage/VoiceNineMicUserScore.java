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
public final class VoiceNineMicUserScore {

    /* JADX INFO: renamed from: com.p1.mobile.longlink.msg.voicelivemessage.VoiceNineMicUserScore$1 */
    public static /* synthetic */ class C45711 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16009xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f16009xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16009xa1df5c61[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16009xa1df5c61[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16009xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16009xa1df5c61[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16009xa1df5c61[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16009xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f16009xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public interface VoiceLiveBossUserScoreOrBuilder extends o6z {
        VoiceLiveBossUserScore.BossUserScore getBossUserScore(int i);

        int getBossUserScoreCount();

        List<VoiceLiveBossUserScore.BossUserScore> getBossUserScoreList();

        @Override // p149l.o6z
        /* synthetic */ InterfaceC3419q getDefaultInstanceForType();

        String getLiveId();

        ByteString getLiveIdBytes();

        String getRoomId();

        ByteString getRoomIdBytes();

        @Override // p149l.o6z
        /* synthetic */ boolean isInitialized();
    }

    private VoiceNineMicUserScore() {
    }

    public static void registerAllExtensions(C3410h c3410h) {
    }

    public static final class VoiceLiveBossUserScore extends GeneratedMessageLite<VoiceLiveBossUserScore, Builder> implements VoiceLiveBossUserScoreOrBuilder {
        public static final int BOSSUSERSCORE_FIELD_NUMBER = 3;
        private static final VoiceLiveBossUserScore DEFAULT_INSTANCE;
        public static final int LIVEID_FIELD_NUMBER = 2;
        private static volatile i860<VoiceLiveBossUserScore> PARSER = null;
        public static final int ROOMID_FIELD_NUMBER = 1;
        private int bitField0_;
        private String roomId_ = "";
        private String liveId_ = "";
        private C3414l.h<BossUserScore> bossUserScore_ = GeneratedMessageLite.emptyProtobufList();

        public interface BossUserScoreOrBuilder extends o6z {
            long getContribution();

            @Override // p149l.o6z
            /* synthetic */ InterfaceC3419q getDefaultInstanceForType();

            long getPopularity();

            String getUserId();

            ByteString getUserIdBytes();

            @Override // p149l.o6z
            /* synthetic */ boolean isInitialized();
        }

        static {
            VoiceLiveBossUserScore voiceLiveBossUserScore = new VoiceLiveBossUserScore();
            DEFAULT_INSTANCE = voiceLiveBossUserScore;
            voiceLiveBossUserScore.makeImmutable();
        }

        private VoiceLiveBossUserScore() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllBossUserScore(Iterable<? extends BossUserScore> iterable) {
            ensureBossUserScoreIsMutable();
            AbstractC3403a.addAll(iterable, this.bossUserScore_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addBossUserScore(BossUserScore.Builder builder) {
            ensureBossUserScoreIsMutable();
            this.bossUserScore_.add(builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBossUserScore() {
            this.bossUserScore_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLiveId() {
            this.liveId_ = getDefaultInstance().getLiveId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRoomId() {
            this.roomId_ = getDefaultInstance().getRoomId();
        }

        private void ensureBossUserScoreIsMutable() {
            if (this.bossUserScore_.mo17085q()) {
                return;
            }
            this.bossUserScore_ = GeneratedMessageLite.mutableCopy(this.bossUserScore_);
        }

        public static VoiceLiveBossUserScore getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(VoiceLiveBossUserScore voiceLiveBossUserScore) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(voiceLiveBossUserScore);
        }

        public static VoiceLiveBossUserScore parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VoiceLiveBossUserScore) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceLiveBossUserScore parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VoiceLiveBossUserScore) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<VoiceLiveBossUserScore> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeBossUserScore(int i) {
            ensureBossUserScoreIsMutable();
            this.bossUserScore_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBossUserScore(int i, BossUserScore.Builder builder) {
            ensureBossUserScoreIsMutable();
            this.bossUserScore_.set(i, builder.build());
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

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C45711.f16009xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoiceLiveBossUserScore();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.bossUserScore_.mo17084n();
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3386h interfaceC3386h = (GeneratedMessageLite.InterfaceC3386h) obj;
                    VoiceLiveBossUserScore voiceLiveBossUserScore = (VoiceLiveBossUserScore) obj2;
                    this.roomId_ = interfaceC3386h.mo16997f(!this.roomId_.isEmpty(), this.roomId_, !voiceLiveBossUserScore.roomId_.isEmpty(), voiceLiveBossUserScore.roomId_);
                    this.liveId_ = interfaceC3386h.mo16997f(!this.liveId_.isEmpty(), this.liveId_, true ^ voiceLiveBossUserScore.liveId_.isEmpty(), voiceLiveBossUserScore.liveId_);
                    this.bossUserScore_ = interfaceC3386h.mo16998g(this.bossUserScore_, voiceLiveBossUserScore.bossUserScore_);
                    if (interfaceC3386h == GeneratedMessageLite.C3385g.INSTANCE) {
                        this.bitField0_ |= voiceLiveBossUserScore.bitField0_;
                    }
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
                                    this.roomId_ = c3407e.m17115L();
                                } else if (iM17116M == 18) {
                                    this.liveId_ = c3407e.m17115L();
                                } else if (iM17116M == 26) {
                                    if (!this.bossUserScore_.mo17085q()) {
                                        this.bossUserScore_ = GeneratedMessageLite.mutableCopy(this.bossUserScore_);
                                    }
                                    this.bossUserScore_.add((BossUserScore) c3407e.m17143w(BossUserScore.parser(), c3410h));
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
                        synchronized (VoiceLiveBossUserScore.class) {
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

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceNineMicUserScore.VoiceLiveBossUserScoreOrBuilder
        public BossUserScore getBossUserScore(int i) {
            return this.bossUserScore_.get(i);
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceNineMicUserScore.VoiceLiveBossUserScoreOrBuilder
        public int getBossUserScoreCount() {
            return this.bossUserScore_.size();
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceNineMicUserScore.VoiceLiveBossUserScoreOrBuilder
        public List<BossUserScore> getBossUserScoreList() {
            return this.bossUserScore_;
        }

        public BossUserScoreOrBuilder getBossUserScoreOrBuilder(int i) {
            return this.bossUserScore_.get(i);
        }

        public List<? extends BossUserScoreOrBuilder> getBossUserScoreOrBuilderList() {
            return this.bossUserScore_;
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceNineMicUserScore.VoiceLiveBossUserScoreOrBuilder
        public String getLiveId() {
            return this.liveId_;
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceNineMicUserScore.VoiceLiveBossUserScoreOrBuilder
        public ByteString getLiveIdBytes() {
            return ByteString.copyFromUtf8(this.liveId_);
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceNineMicUserScore.VoiceLiveBossUserScoreOrBuilder
        public String getRoomId() {
            return this.roomId_;
        }

        @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceNineMicUserScore.VoiceLiveBossUserScoreOrBuilder
        public ByteString getRoomIdBytes() {
            return ByteString.copyFromUtf8(this.roomId_);
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16901K = !this.roomId_.isEmpty() ? CodedOutputStream.m16901K(1, getRoomId()) : 0;
            if (!this.liveId_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(2, getLiveId());
            }
            for (int i2 = 0; i2 < this.bossUserScore_.size(); i2++) {
                iM16901K += CodedOutputStream.m16893C(3, this.bossUserScore_.get(i2));
            }
            this.memoizedSerializedSize = iM16901K;
            return iM16901K;
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.roomId_.isEmpty()) {
                codedOutputStream.mo16939D0(1, getRoomId());
            }
            if (!this.liveId_.isEmpty()) {
                codedOutputStream.mo16939D0(2, getLiveId());
            }
            for (int i = 0; i < this.bossUserScore_.size(); i++) {
                codedOutputStream.mo16974w0(3, this.bossUserScore_.get(i));
            }
        }

        public static final class BossUserScore extends GeneratedMessageLite<BossUserScore, Builder> implements BossUserScoreOrBuilder {
            public static final int CONTRIBUTION_FIELD_NUMBER = 3;
            private static final BossUserScore DEFAULT_INSTANCE;
            private static volatile i860<BossUserScore> PARSER = null;
            public static final int POPULARITY_FIELD_NUMBER = 2;
            public static final int USERID_FIELD_NUMBER = 1;
            private long contribution_;
            private long popularity_;
            private String userId_ = "";

            public static final class Builder extends GeneratedMessageLite.AbstractC3380b<BossUserScore, Builder> implements BossUserScoreOrBuilder {
                private Builder() {
                    super(BossUserScore.DEFAULT_INSTANCE);
                }

                public Builder clearContribution() {
                    copyOnWrite();
                    ((BossUserScore) this.instance).clearContribution();
                    return this;
                }

                public Builder clearPopularity() {
                    copyOnWrite();
                    ((BossUserScore) this.instance).clearPopularity();
                    return this;
                }

                public Builder clearUserId() {
                    copyOnWrite();
                    ((BossUserScore) this.instance).clearUserId();
                    return this;
                }

                @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceNineMicUserScore.VoiceLiveBossUserScore.BossUserScoreOrBuilder
                public long getContribution() {
                    return ((BossUserScore) this.instance).getContribution();
                }

                @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceNineMicUserScore.VoiceLiveBossUserScore.BossUserScoreOrBuilder
                public long getPopularity() {
                    return ((BossUserScore) this.instance).getPopularity();
                }

                @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceNineMicUserScore.VoiceLiveBossUserScore.BossUserScoreOrBuilder
                public String getUserId() {
                    return ((BossUserScore) this.instance).getUserId();
                }

                @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceNineMicUserScore.VoiceLiveBossUserScore.BossUserScoreOrBuilder
                public ByteString getUserIdBytes() {
                    return ((BossUserScore) this.instance).getUserIdBytes();
                }

                public Builder setContribution(long j) {
                    copyOnWrite();
                    ((BossUserScore) this.instance).setContribution(j);
                    return this;
                }

                public Builder setPopularity(long j) {
                    copyOnWrite();
                    ((BossUserScore) this.instance).setPopularity(j);
                    return this;
                }

                public Builder setUserId(String str) {
                    copyOnWrite();
                    ((BossUserScore) this.instance).setUserId(str);
                    return this;
                }

                public Builder setUserIdBytes(ByteString byteString) {
                    copyOnWrite();
                    ((BossUserScore) this.instance).setUserIdBytes(byteString);
                    return this;
                }
            }

            static {
                BossUserScore bossUserScore = new BossUserScore();
                DEFAULT_INSTANCE = bossUserScore;
                bossUserScore.makeImmutable();
            }

            private BossUserScore() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearContribution() {
                this.contribution_ = 0L;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearPopularity() {
                this.popularity_ = 0L;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearUserId() {
                this.userId_ = getDefaultInstance().getUserId();
            }

            public static BossUserScore getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Builder newBuilder(BossUserScore bossUserScore) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(bossUserScore);
            }

            public static BossUserScore parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (BossUserScore) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static BossUserScore parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (BossUserScore) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static i860<BossUserScore> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setContribution(long j) {
                this.contribution_ = j;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setPopularity(long j) {
                this.popularity_ = j;
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

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                boolean z = false;
                switch (C45711.f16009xa1df5c61[methodToInvoke.ordinal()]) {
                    case 1:
                        return new BossUserScore();
                    case 2:
                        return DEFAULT_INSTANCE;
                    case 3:
                        return null;
                    case 4:
                        return new Builder();
                    case 5:
                        GeneratedMessageLite.InterfaceC3386h interfaceC3386h = (GeneratedMessageLite.InterfaceC3386h) obj;
                        BossUserScore bossUserScore = (BossUserScore) obj2;
                        this.userId_ = interfaceC3386h.mo16997f(!this.userId_.isEmpty(), this.userId_, !bossUserScore.userId_.isEmpty(), bossUserScore.userId_);
                        long j = this.popularity_;
                        boolean z2 = j != 0;
                        long j2 = bossUserScore.popularity_;
                        this.popularity_ = interfaceC3386h.mo17000i(z2, j, j2 != 0, j2);
                        boolean z3 = false;
                        long j3 = this.contribution_;
                        if (j3 != 0) {
                            z3 = true;
                        }
                        long j4 = bossUserScore.contribution_;
                        this.contribution_ = interfaceC3386h.mo17000i(z3, j3, j4 != 0, j4);
                        GeneratedMessageLite.C3385g c3385g = GeneratedMessageLite.C3385g.INSTANCE;
                        return this;
                    case 6:
                        C3407e c3407e = (C3407e) obj;
                        while (!z) {
                            try {
                                int iM17116M = c3407e.m17116M();
                                if (iM17116M != 0) {
                                    if (iM17116M == 10) {
                                        this.userId_ = c3407e.m17115L();
                                    } else if (iM17116M == 16) {
                                        this.popularity_ = c3407e.m17142v();
                                    } else if (iM17116M == 24) {
                                        this.contribution_ = c3407e.m17142v();
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
                            synchronized (BossUserScore.class) {
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

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceNineMicUserScore.VoiceLiveBossUserScore.BossUserScoreOrBuilder
            public long getContribution() {
                return this.contribution_;
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceNineMicUserScore.VoiceLiveBossUserScore.BossUserScoreOrBuilder
            public long getPopularity() {
                return this.popularity_;
            }

            @Override // com.google.protobuf.InterfaceC3419q
            public int getSerializedSize() {
                int i = this.memoizedSerializedSize;
                if (i != -1) {
                    return i;
                }
                int iM16901K = !this.userId_.isEmpty() ? CodedOutputStream.m16901K(1, getUserId()) : 0;
                long j = this.popularity_;
                if (j != 0) {
                    iM16901K += CodedOutputStream.m16931v(2, j);
                }
                long j2 = this.contribution_;
                if (j2 != 0) {
                    iM16901K += CodedOutputStream.m16931v(3, j2);
                }
                this.memoizedSerializedSize = iM16901K;
                return iM16901K;
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceNineMicUserScore.VoiceLiveBossUserScore.BossUserScoreOrBuilder
            public String getUserId() {
                return this.userId_;
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceNineMicUserScore.VoiceLiveBossUserScore.BossUserScoreOrBuilder
            public ByteString getUserIdBytes() {
                return ByteString.copyFromUtf8(this.userId_);
            }

            @Override // com.google.protobuf.InterfaceC3419q
            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                if (!this.userId_.isEmpty()) {
                    codedOutputStream.mo16939D0(1, getUserId());
                }
                long j = this.popularity_;
                if (j != 0) {
                    codedOutputStream.m16972u0(2, j);
                }
                long j2 = this.contribution_;
                if (j2 != 0) {
                    codedOutputStream.m16972u0(3, j2);
                }
            }

            public static BossUserScore parseDelimitedFrom(InputStream inputStream, C3410h c3410h) throws IOException {
                return (BossUserScore) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3410h);
            }

            public static BossUserScore parseFrom(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
                return (BossUserScore) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3410h);
            }

            public static BossUserScore parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (BossUserScore) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static BossUserScore parseFrom(byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
                return (BossUserScore) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3410h);
            }

            public static BossUserScore parseFrom(InputStream inputStream) throws IOException {
                return (BossUserScore) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static BossUserScore parseFrom(InputStream inputStream, C3410h c3410h) throws IOException {
                return (BossUserScore) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3410h);
            }

            public static BossUserScore parseFrom(C3407e c3407e) throws IOException {
                return (BossUserScore) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e);
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static BossUserScore parseFrom(C3407e c3407e, C3410h c3410h) throws IOException {
                return (BossUserScore) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e, c3410h);
            }
        }

        public static VoiceLiveBossUserScore parseDelimitedFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (VoiceLiveBossUserScore) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static VoiceLiveBossUserScore parseFrom(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
            return (VoiceLiveBossUserScore) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3410h);
        }

        public static final class Builder extends GeneratedMessageLite.AbstractC3380b<VoiceLiveBossUserScore, Builder> implements VoiceLiveBossUserScoreOrBuilder {
            private Builder() {
                super(VoiceLiveBossUserScore.DEFAULT_INSTANCE);
            }

            public Builder addAllBossUserScore(Iterable<? extends BossUserScore> iterable) {
                copyOnWrite();
                ((VoiceLiveBossUserScore) this.instance).addAllBossUserScore(iterable);
                return this;
            }

            public Builder addBossUserScore(BossUserScore bossUserScore) {
                copyOnWrite();
                ((VoiceLiveBossUserScore) this.instance).addBossUserScore(bossUserScore);
                return this;
            }

            public Builder clearBossUserScore() {
                copyOnWrite();
                ((VoiceLiveBossUserScore) this.instance).clearBossUserScore();
                return this;
            }

            public Builder clearLiveId() {
                copyOnWrite();
                ((VoiceLiveBossUserScore) this.instance).clearLiveId();
                return this;
            }

            public Builder clearRoomId() {
                copyOnWrite();
                ((VoiceLiveBossUserScore) this.instance).clearRoomId();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceNineMicUserScore.VoiceLiveBossUserScoreOrBuilder
            public BossUserScore getBossUserScore(int i) {
                return ((VoiceLiveBossUserScore) this.instance).getBossUserScore(i);
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceNineMicUserScore.VoiceLiveBossUserScoreOrBuilder
            public int getBossUserScoreCount() {
                return ((VoiceLiveBossUserScore) this.instance).getBossUserScoreCount();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceNineMicUserScore.VoiceLiveBossUserScoreOrBuilder
            public List<BossUserScore> getBossUserScoreList() {
                return Collections.unmodifiableList(((VoiceLiveBossUserScore) this.instance).getBossUserScoreList());
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceNineMicUserScore.VoiceLiveBossUserScoreOrBuilder
            public String getLiveId() {
                return ((VoiceLiveBossUserScore) this.instance).getLiveId();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceNineMicUserScore.VoiceLiveBossUserScoreOrBuilder
            public ByteString getLiveIdBytes() {
                return ((VoiceLiveBossUserScore) this.instance).getLiveIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceNineMicUserScore.VoiceLiveBossUserScoreOrBuilder
            public String getRoomId() {
                return ((VoiceLiveBossUserScore) this.instance).getRoomId();
            }

            @Override // com.p1.mobile.longlink.msg.voicelivemessage.VoiceNineMicUserScore.VoiceLiveBossUserScoreOrBuilder
            public ByteString getRoomIdBytes() {
                return ((VoiceLiveBossUserScore) this.instance).getRoomIdBytes();
            }

            public Builder removeBossUserScore(int i) {
                copyOnWrite();
                ((VoiceLiveBossUserScore) this.instance).removeBossUserScore(i);
                return this;
            }

            public Builder setBossUserScore(int i, BossUserScore bossUserScore) {
                copyOnWrite();
                ((VoiceLiveBossUserScore) this.instance).setBossUserScore(i, bossUserScore);
                return this;
            }

            public Builder setLiveId(String str) {
                copyOnWrite();
                ((VoiceLiveBossUserScore) this.instance).setLiveId(str);
                return this;
            }

            public Builder setLiveIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceLiveBossUserScore) this.instance).setLiveIdBytes(byteString);
                return this;
            }

            public Builder setRoomId(String str) {
                copyOnWrite();
                ((VoiceLiveBossUserScore) this.instance).setRoomId(str);
                return this;
            }

            public Builder setRoomIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceLiveBossUserScore) this.instance).setRoomIdBytes(byteString);
                return this;
            }

            public Builder addBossUserScore(int i, BossUserScore bossUserScore) {
                copyOnWrite();
                ((VoiceLiveBossUserScore) this.instance).addBossUserScore(i, bossUserScore);
                return this;
            }

            public Builder setBossUserScore(int i, BossUserScore.Builder builder) {
                copyOnWrite();
                ((VoiceLiveBossUserScore) this.instance).setBossUserScore(i, builder);
                return this;
            }

            public Builder addBossUserScore(BossUserScore.Builder builder) {
                copyOnWrite();
                ((VoiceLiveBossUserScore) this.instance).addBossUserScore(builder);
                return this;
            }

            public Builder addBossUserScore(int i, BossUserScore.Builder builder) {
                copyOnWrite();
                ((VoiceLiveBossUserScore) this.instance).addBossUserScore(i, builder);
                return this;
            }
        }

        public static VoiceLiveBossUserScore parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoiceLiveBossUserScore) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoiceLiveBossUserScore parseFrom(byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
            return (VoiceLiveBossUserScore) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3410h);
        }

        public static VoiceLiveBossUserScore parseFrom(InputStream inputStream) throws IOException {
            return (VoiceLiveBossUserScore) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceLiveBossUserScore parseFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (VoiceLiveBossUserScore) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static VoiceLiveBossUserScore parseFrom(C3407e c3407e) throws IOException {
            return (VoiceLiveBossUserScore) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addBossUserScore(int i, BossUserScore bossUserScore) {
            bossUserScore.getClass();
            ensureBossUserScoreIsMutable();
            this.bossUserScore_.add(i, bossUserScore);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static VoiceLiveBossUserScore parseFrom(C3407e c3407e, C3410h c3410h) throws IOException {
            return (VoiceLiveBossUserScore) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e, c3410h);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBossUserScore(int i, BossUserScore bossUserScore) {
            bossUserScore.getClass();
            ensureBossUserScoreIsMutable();
            this.bossUserScore_.set(i, bossUserScore);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addBossUserScore(BossUserScore bossUserScore) {
            bossUserScore.getClass();
            ensureBossUserScoreIsMutable();
            this.bossUserScore_.add(bossUserScore);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addBossUserScore(int i, BossUserScore.Builder builder) {
            ensureBossUserScoreIsMutable();
            this.bossUserScore_.add(i, builder.build());
        }
    }
}
