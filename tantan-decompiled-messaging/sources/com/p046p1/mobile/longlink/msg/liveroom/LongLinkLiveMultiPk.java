package com.p046p1.mobile.longlink.msg.liveroom;

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
public final class LongLinkLiveMultiPk {

    /* JADX INFO: renamed from: com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk$1 */
    public static /* synthetic */ class C45001 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f15976xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15976xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15976xa1df5c61[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15976xa1df5c61[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15976xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15976xa1df5c61[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15976xa1df5c61[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15976xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f15976xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public interface MultiPkAnimationOrBuilder extends o6z {
        String getAnimationUrl();

        ByteString getAnimationUrlBytes();

        @Override // p149l.o6z
        /* synthetic */ InterfaceC3419q getDefaultInstanceForType();

        String getMultiPkId();

        ByteString getMultiPkIdBytes();

        @Override // p149l.o6z
        /* synthetic */ boolean isInitialized();
    }

    public interface MultiPkInviteAcceptedOrBuilder extends o6z {
        @Override // p149l.o6z
        /* synthetic */ InterfaceC3419q getDefaultInstanceForType();

        String getMultiPkInviteId();

        ByteString getMultiPkInviteIdBytes();

        @Override // p149l.o6z
        /* synthetic */ boolean isInitialized();
    }

    public interface MultiPkInviteNotifyOrBuilder extends o6z {
        @Override // p149l.o6z
        /* synthetic */ InterfaceC3419q getDefaultInstanceForType();

        MultiPkPlayer getFromUser();

        String getMultiPkInviteId();

        ByteString getMultiPkInviteIdBytes();

        boolean hasFromUser();

        @Override // p149l.o6z
        /* synthetic */ boolean isInitialized();
    }

    public interface MultiPkInviteRejectedOrBuilder extends o6z {
        @Override // p149l.o6z
        /* synthetic */ InterfaceC3419q getDefaultInstanceForType();

        String getMultiPkInviteId();

        ByteString getMultiPkInviteIdBytes();

        MultiPkPlayer getRejectUser();

        boolean hasRejectUser();

        @Override // p149l.o6z
        /* synthetic */ boolean isInitialized();
    }

    public interface MultiPkOrBuilder extends o6z {
        String getAnimationUrl();

        ByteString getAnimationUrlBytes();

        @Override // p149l.o6z
        /* synthetic */ InterfaceC3419q getDefaultInstanceForType();

        int getDuration();

        String getId();

        ByteString getIdBytes();

        MultiPkPlayer getPlayers(int i);

        int getPlayersCount();

        List<MultiPkPlayer> getPlayersList();

        String getStage();

        ByteString getStageBytes();

        long getStartTs();

        String getToast();

        ByteString getToastBytes();

        String getWinnerUserId();

        ByteString getWinnerUserIdBytes();

        @Override // p149l.o6z
        /* synthetic */ boolean isInitialized();
    }

    public interface MultiPkPlayerOrBuilder extends o6z {
        String getAvatar();

        ByteString getAvatarBytes();

        @Override // p149l.o6z
        /* synthetic */ InterfaceC3419q getDefaultInstanceForType();

        String getLiveId();

        ByteString getLiveIdBytes();

        long getPoint();

        long getPosition();

        long getRank();

        String getRole();

        ByteString getRoleBytes();

        String getRoomId();

        ByteString getRoomIdBytes();

        String getUserId();

        ByteString getUserIdBytes();

        String getUserName();

        ByteString getUserNameBytes();

        @Override // p149l.o6z
        /* synthetic */ boolean isInitialized();
    }

    public interface MultiPkPointsOrBuilder extends o6z {
        @Override // p149l.o6z
        /* synthetic */ InterfaceC3419q getDefaultInstanceForType();

        String getPkId();

        ByteString getPkIdBytes();

        MultiPkPlayer getPlayer(int i);

        int getPlayerCount();

        List<MultiPkPlayer> getPlayerList();

        long getServerTimeTs();

        @Override // p149l.o6z
        /* synthetic */ boolean isInitialized();
    }

    public interface MultiPkStageChangeOrBuilder extends o6z {
        @Override // p149l.o6z
        /* synthetic */ InterfaceC3419q getDefaultInstanceForType();

        MultiPk getMultiPk();

        boolean hasMultiPk();

        @Override // p149l.o6z
        /* synthetic */ boolean isInitialized();
    }

    private LongLinkLiveMultiPk() {
    }

    public static void registerAllExtensions(C3410h c3410h) {
    }

    public static final class MultiPk extends GeneratedMessageLite<MultiPk, Builder> implements MultiPkOrBuilder {
        public static final int ANIMATIONURL_FIELD_NUMBER = 7;
        private static final MultiPk DEFAULT_INSTANCE;
        public static final int DURATION_FIELD_NUMBER = 4;
        public static final int ID_FIELD_NUMBER = 1;
        private static volatile i860<MultiPk> PARSER = null;
        public static final int PLAYERS_FIELD_NUMBER = 5;
        public static final int STAGE_FIELD_NUMBER = 2;
        public static final int STARTTS_FIELD_NUMBER = 3;
        public static final int TOAST_FIELD_NUMBER = 8;
        public static final int WINNERUSERID_FIELD_NUMBER = 6;
        private int bitField0_;
        private int duration_;
        private long startTs_;
        private String id_ = "";
        private String stage_ = "";
        private C3414l.h<MultiPkPlayer> players_ = GeneratedMessageLite.emptyProtobufList();
        private String winnerUserId_ = "";
        private String animationUrl_ = "";
        private String toast_ = "";

        static {
            MultiPk multiPk = new MultiPk();
            DEFAULT_INSTANCE = multiPk;
            multiPk.makeImmutable();
        }

        private MultiPk() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllPlayers(Iterable<? extends MultiPkPlayer> iterable) {
            ensurePlayersIsMutable();
            AbstractC3403a.addAll(iterable, this.players_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addPlayers(MultiPkPlayer.Builder builder) {
            ensurePlayersIsMutable();
            this.players_.add(builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAnimationUrl() {
            this.animationUrl_ = getDefaultInstance().getAnimationUrl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDuration() {
            this.duration_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearId() {
            this.id_ = getDefaultInstance().getId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPlayers() {
            this.players_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStage() {
            this.stage_ = getDefaultInstance().getStage();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStartTs() {
            this.startTs_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearToast() {
            this.toast_ = getDefaultInstance().getToast();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWinnerUserId() {
            this.winnerUserId_ = getDefaultInstance().getWinnerUserId();
        }

        private void ensurePlayersIsMutable() {
            if (this.players_.mo17085q()) {
                return;
            }
            this.players_ = GeneratedMessageLite.mutableCopy(this.players_);
        }

        public static MultiPk getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(MultiPk multiPk) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(multiPk);
        }

        public static MultiPk parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (MultiPk) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MultiPk parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (MultiPk) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<MultiPk> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removePlayers(int i) {
            ensurePlayersIsMutable();
            this.players_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAnimationUrl(String str) {
            str.getClass();
            this.animationUrl_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAnimationUrlBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.animationUrl_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDuration(int i) {
            this.duration_ = i;
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
        public void setPlayers(int i, MultiPkPlayer.Builder builder) {
            ensurePlayersIsMutable();
            this.players_.set(i, builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStage(String str) {
            str.getClass();
            this.stage_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStageBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.stage_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStartTs(long j) {
            this.startTs_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setToast(String str) {
            str.getClass();
            this.toast_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setToastBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.toast_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWinnerUserId(String str) {
            str.getClass();
            this.winnerUserId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWinnerUserIdBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.winnerUserId_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C45001.f15976xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new MultiPk();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.players_.mo17084n();
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3386h interfaceC3386h = (GeneratedMessageLite.InterfaceC3386h) obj;
                    MultiPk multiPk = (MultiPk) obj2;
                    this.id_ = interfaceC3386h.mo16997f(!this.id_.isEmpty(), this.id_, !multiPk.id_.isEmpty(), multiPk.id_);
                    this.stage_ = interfaceC3386h.mo16997f(!this.stage_.isEmpty(), this.stage_, !multiPk.stage_.isEmpty(), multiPk.stage_);
                    long j = this.startTs_;
                    boolean z2 = j != 0;
                    long j2 = multiPk.startTs_;
                    this.startTs_ = interfaceC3386h.mo17000i(z2, j, j2 != 0, j2);
                    int i = this.duration_;
                    boolean z3 = i != 0;
                    int i2 = multiPk.duration_;
                    this.duration_ = interfaceC3386h.mo16996e(z3, i, i2 != 0, i2);
                    this.players_ = interfaceC3386h.mo16998g(this.players_, multiPk.players_);
                    this.winnerUserId_ = interfaceC3386h.mo16997f(!this.winnerUserId_.isEmpty(), this.winnerUserId_, !multiPk.winnerUserId_.isEmpty(), multiPk.winnerUserId_);
                    this.animationUrl_ = interfaceC3386h.mo16997f(!this.animationUrl_.isEmpty(), this.animationUrl_, !multiPk.animationUrl_.isEmpty(), multiPk.animationUrl_);
                    this.toast_ = interfaceC3386h.mo16997f(!this.toast_.isEmpty(), this.toast_, !multiPk.toast_.isEmpty(), multiPk.toast_);
                    if (interfaceC3386h == GeneratedMessageLite.C3385g.INSTANCE) {
                        this.bitField0_ |= multiPk.bitField0_;
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
                                    this.id_ = c3407e.m17115L();
                                } else if (iM17116M == 18) {
                                    this.stage_ = c3407e.m17115L();
                                } else if (iM17116M == 24) {
                                    this.startTs_ = c3407e.m17142v();
                                } else if (iM17116M == 32) {
                                    this.duration_ = c3407e.m17141u();
                                } else if (iM17116M == 42) {
                                    if (!this.players_.mo17085q()) {
                                        this.players_ = GeneratedMessageLite.mutableCopy(this.players_);
                                    }
                                    this.players_.add((MultiPkPlayer) c3407e.m17143w(MultiPkPlayer.parser(), c3410h));
                                } else if (iM17116M == 50) {
                                    this.winnerUserId_ = c3407e.m17115L();
                                } else if (iM17116M == 58) {
                                    this.animationUrl_ = c3407e.m17115L();
                                } else if (iM17116M == 66) {
                                    this.toast_ = c3407e.m17115L();
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
                        synchronized (MultiPk.class) {
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

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk.MultiPkOrBuilder
        public String getAnimationUrl() {
            return this.animationUrl_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk.MultiPkOrBuilder
        public ByteString getAnimationUrlBytes() {
            return ByteString.copyFromUtf8(this.animationUrl_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk.MultiPkOrBuilder
        public int getDuration() {
            return this.duration_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk.MultiPkOrBuilder
        public String getId() {
            return this.id_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk.MultiPkOrBuilder
        public ByteString getIdBytes() {
            return ByteString.copyFromUtf8(this.id_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk.MultiPkOrBuilder
        public MultiPkPlayer getPlayers(int i) {
            return this.players_.get(i);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk.MultiPkOrBuilder
        public int getPlayersCount() {
            return this.players_.size();
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk.MultiPkOrBuilder
        public List<MultiPkPlayer> getPlayersList() {
            return this.players_;
        }

        public MultiPkPlayerOrBuilder getPlayersOrBuilder(int i) {
            return this.players_.get(i);
        }

        public List<? extends MultiPkPlayerOrBuilder> getPlayersOrBuilderList() {
            return this.players_;
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16901K = !this.id_.isEmpty() ? CodedOutputStream.m16901K(1, getId()) : 0;
            if (!this.stage_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(2, getStage());
            }
            long j = this.startTs_;
            if (j != 0) {
                iM16901K += CodedOutputStream.m16931v(3, j);
            }
            int i2 = this.duration_;
            if (i2 != 0) {
                iM16901K += CodedOutputStream.m16929t(4, i2);
            }
            for (int i3 = 0; i3 < this.players_.size(); i3++) {
                iM16901K += CodedOutputStream.m16893C(5, this.players_.get(i3));
            }
            if (!this.winnerUserId_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(6, getWinnerUserId());
            }
            if (!this.animationUrl_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(7, getAnimationUrl());
            }
            if (!this.toast_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(8, getToast());
            }
            this.memoizedSerializedSize = iM16901K;
            return iM16901K;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk.MultiPkOrBuilder
        public String getStage() {
            return this.stage_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk.MultiPkOrBuilder
        public ByteString getStageBytes() {
            return ByteString.copyFromUtf8(this.stage_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk.MultiPkOrBuilder
        public long getStartTs() {
            return this.startTs_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk.MultiPkOrBuilder
        public String getToast() {
            return this.toast_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk.MultiPkOrBuilder
        public ByteString getToastBytes() {
            return ByteString.copyFromUtf8(this.toast_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk.MultiPkOrBuilder
        public String getWinnerUserId() {
            return this.winnerUserId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk.MultiPkOrBuilder
        public ByteString getWinnerUserIdBytes() {
            return ByteString.copyFromUtf8(this.winnerUserId_);
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.id_.isEmpty()) {
                codedOutputStream.mo16939D0(1, getId());
            }
            if (!this.stage_.isEmpty()) {
                codedOutputStream.mo16939D0(2, getStage());
            }
            long j = this.startTs_;
            if (j != 0) {
                codedOutputStream.m16972u0(3, j);
            }
            int i = this.duration_;
            if (i != 0) {
                codedOutputStream.mo16970s0(4, i);
            }
            for (int i2 = 0; i2 < this.players_.size(); i2++) {
                codedOutputStream.mo16974w0(5, this.players_.get(i2));
            }
            if (!this.winnerUserId_.isEmpty()) {
                codedOutputStream.mo16939D0(6, getWinnerUserId());
            }
            if (!this.animationUrl_.isEmpty()) {
                codedOutputStream.mo16939D0(7, getAnimationUrl());
            }
            if (this.toast_.isEmpty()) {
                return;
            }
            codedOutputStream.mo16939D0(8, getToast());
        }

        public static MultiPk parseDelimitedFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (MultiPk) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static MultiPk parseFrom(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
            return (MultiPk) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3410h);
        }

        public static final class Builder extends GeneratedMessageLite.AbstractC3380b<MultiPk, Builder> implements MultiPkOrBuilder {
            private Builder() {
                super(MultiPk.DEFAULT_INSTANCE);
            }

            public Builder addAllPlayers(Iterable<? extends MultiPkPlayer> iterable) {
                copyOnWrite();
                ((MultiPk) this.instance).addAllPlayers(iterable);
                return this;
            }

            public Builder addPlayers(MultiPkPlayer multiPkPlayer) {
                copyOnWrite();
                ((MultiPk) this.instance).addPlayers(multiPkPlayer);
                return this;
            }

            public Builder clearAnimationUrl() {
                copyOnWrite();
                ((MultiPk) this.instance).clearAnimationUrl();
                return this;
            }

            public Builder clearDuration() {
                copyOnWrite();
                ((MultiPk) this.instance).clearDuration();
                return this;
            }

            public Builder clearId() {
                copyOnWrite();
                ((MultiPk) this.instance).clearId();
                return this;
            }

            public Builder clearPlayers() {
                copyOnWrite();
                ((MultiPk) this.instance).clearPlayers();
                return this;
            }

            public Builder clearStage() {
                copyOnWrite();
                ((MultiPk) this.instance).clearStage();
                return this;
            }

            public Builder clearStartTs() {
                copyOnWrite();
                ((MultiPk) this.instance).clearStartTs();
                return this;
            }

            public Builder clearToast() {
                copyOnWrite();
                ((MultiPk) this.instance).clearToast();
                return this;
            }

            public Builder clearWinnerUserId() {
                copyOnWrite();
                ((MultiPk) this.instance).clearWinnerUserId();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk.MultiPkOrBuilder
            public String getAnimationUrl() {
                return ((MultiPk) this.instance).getAnimationUrl();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk.MultiPkOrBuilder
            public ByteString getAnimationUrlBytes() {
                return ((MultiPk) this.instance).getAnimationUrlBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk.MultiPkOrBuilder
            public int getDuration() {
                return ((MultiPk) this.instance).getDuration();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk.MultiPkOrBuilder
            public String getId() {
                return ((MultiPk) this.instance).getId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk.MultiPkOrBuilder
            public ByteString getIdBytes() {
                return ((MultiPk) this.instance).getIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk.MultiPkOrBuilder
            public MultiPkPlayer getPlayers(int i) {
                return ((MultiPk) this.instance).getPlayers(i);
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk.MultiPkOrBuilder
            public int getPlayersCount() {
                return ((MultiPk) this.instance).getPlayersCount();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk.MultiPkOrBuilder
            public List<MultiPkPlayer> getPlayersList() {
                return Collections.unmodifiableList(((MultiPk) this.instance).getPlayersList());
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk.MultiPkOrBuilder
            public String getStage() {
                return ((MultiPk) this.instance).getStage();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk.MultiPkOrBuilder
            public ByteString getStageBytes() {
                return ((MultiPk) this.instance).getStageBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk.MultiPkOrBuilder
            public long getStartTs() {
                return ((MultiPk) this.instance).getStartTs();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk.MultiPkOrBuilder
            public String getToast() {
                return ((MultiPk) this.instance).getToast();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk.MultiPkOrBuilder
            public ByteString getToastBytes() {
                return ((MultiPk) this.instance).getToastBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk.MultiPkOrBuilder
            public String getWinnerUserId() {
                return ((MultiPk) this.instance).getWinnerUserId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk.MultiPkOrBuilder
            public ByteString getWinnerUserIdBytes() {
                return ((MultiPk) this.instance).getWinnerUserIdBytes();
            }

            public Builder removePlayers(int i) {
                copyOnWrite();
                ((MultiPk) this.instance).removePlayers(i);
                return this;
            }

            public Builder setAnimationUrl(String str) {
                copyOnWrite();
                ((MultiPk) this.instance).setAnimationUrl(str);
                return this;
            }

            public Builder setAnimationUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((MultiPk) this.instance).setAnimationUrlBytes(byteString);
                return this;
            }

            public Builder setDuration(int i) {
                copyOnWrite();
                ((MultiPk) this.instance).setDuration(i);
                return this;
            }

            public Builder setId(String str) {
                copyOnWrite();
                ((MultiPk) this.instance).setId(str);
                return this;
            }

            public Builder setIdBytes(ByteString byteString) {
                copyOnWrite();
                ((MultiPk) this.instance).setIdBytes(byteString);
                return this;
            }

            public Builder setPlayers(int i, MultiPkPlayer multiPkPlayer) {
                copyOnWrite();
                ((MultiPk) this.instance).setPlayers(i, multiPkPlayer);
                return this;
            }

            public Builder setStage(String str) {
                copyOnWrite();
                ((MultiPk) this.instance).setStage(str);
                return this;
            }

            public Builder setStageBytes(ByteString byteString) {
                copyOnWrite();
                ((MultiPk) this.instance).setStageBytes(byteString);
                return this;
            }

            public Builder setStartTs(long j) {
                copyOnWrite();
                ((MultiPk) this.instance).setStartTs(j);
                return this;
            }

            public Builder setToast(String str) {
                copyOnWrite();
                ((MultiPk) this.instance).setToast(str);
                return this;
            }

            public Builder setToastBytes(ByteString byteString) {
                copyOnWrite();
                ((MultiPk) this.instance).setToastBytes(byteString);
                return this;
            }

            public Builder setWinnerUserId(String str) {
                copyOnWrite();
                ((MultiPk) this.instance).setWinnerUserId(str);
                return this;
            }

            public Builder setWinnerUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((MultiPk) this.instance).setWinnerUserIdBytes(byteString);
                return this;
            }

            public Builder addPlayers(int i, MultiPkPlayer multiPkPlayer) {
                copyOnWrite();
                ((MultiPk) this.instance).addPlayers(i, multiPkPlayer);
                return this;
            }

            public Builder setPlayers(int i, MultiPkPlayer.Builder builder) {
                copyOnWrite();
                ((MultiPk) this.instance).setPlayers(i, builder);
                return this;
            }

            public Builder addPlayers(MultiPkPlayer.Builder builder) {
                copyOnWrite();
                ((MultiPk) this.instance).addPlayers(builder);
                return this;
            }

            public Builder addPlayers(int i, MultiPkPlayer.Builder builder) {
                copyOnWrite();
                ((MultiPk) this.instance).addPlayers(i, builder);
                return this;
            }
        }

        public static MultiPk parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (MultiPk) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MultiPk parseFrom(byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
            return (MultiPk) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3410h);
        }

        public static MultiPk parseFrom(InputStream inputStream) throws IOException {
            return (MultiPk) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MultiPk parseFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (MultiPk) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static MultiPk parseFrom(C3407e c3407e) throws IOException {
            return (MultiPk) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addPlayers(int i, MultiPkPlayer multiPkPlayer) {
            multiPkPlayer.getClass();
            ensurePlayersIsMutable();
            this.players_.add(i, multiPkPlayer);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static MultiPk parseFrom(C3407e c3407e, C3410h c3410h) throws IOException {
            return (MultiPk) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e, c3410h);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPlayers(int i, MultiPkPlayer multiPkPlayer) {
            multiPkPlayer.getClass();
            ensurePlayersIsMutable();
            this.players_.set(i, multiPkPlayer);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addPlayers(MultiPkPlayer multiPkPlayer) {
            multiPkPlayer.getClass();
            ensurePlayersIsMutable();
            this.players_.add(multiPkPlayer);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addPlayers(int i, MultiPkPlayer.Builder builder) {
            ensurePlayersIsMutable();
            this.players_.add(i, builder.build());
        }
    }

    public static final class MultiPkAnimation extends GeneratedMessageLite<MultiPkAnimation, Builder> implements MultiPkAnimationOrBuilder {
        public static final int ANIMATIONURL_FIELD_NUMBER = 2;
        private static final MultiPkAnimation DEFAULT_INSTANCE;
        public static final int MULTIPKID_FIELD_NUMBER = 1;
        private static volatile i860<MultiPkAnimation> PARSER;
        private String multiPkId_ = "";
        private String animationUrl_ = "";

        public static final class Builder extends GeneratedMessageLite.AbstractC3380b<MultiPkAnimation, Builder> implements MultiPkAnimationOrBuilder {
            private Builder() {
                super(MultiPkAnimation.DEFAULT_INSTANCE);
            }

            public Builder clearAnimationUrl() {
                copyOnWrite();
                ((MultiPkAnimation) this.instance).clearAnimationUrl();
                return this;
            }

            public Builder clearMultiPkId() {
                copyOnWrite();
                ((MultiPkAnimation) this.instance).clearMultiPkId();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk.MultiPkAnimationOrBuilder
            public String getAnimationUrl() {
                return ((MultiPkAnimation) this.instance).getAnimationUrl();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk.MultiPkAnimationOrBuilder
            public ByteString getAnimationUrlBytes() {
                return ((MultiPkAnimation) this.instance).getAnimationUrlBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk.MultiPkAnimationOrBuilder
            public String getMultiPkId() {
                return ((MultiPkAnimation) this.instance).getMultiPkId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk.MultiPkAnimationOrBuilder
            public ByteString getMultiPkIdBytes() {
                return ((MultiPkAnimation) this.instance).getMultiPkIdBytes();
            }

            public Builder setAnimationUrl(String str) {
                copyOnWrite();
                ((MultiPkAnimation) this.instance).setAnimationUrl(str);
                return this;
            }

            public Builder setAnimationUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((MultiPkAnimation) this.instance).setAnimationUrlBytes(byteString);
                return this;
            }

            public Builder setMultiPkId(String str) {
                copyOnWrite();
                ((MultiPkAnimation) this.instance).setMultiPkId(str);
                return this;
            }

            public Builder setMultiPkIdBytes(ByteString byteString) {
                copyOnWrite();
                ((MultiPkAnimation) this.instance).setMultiPkIdBytes(byteString);
                return this;
            }
        }

        static {
            MultiPkAnimation multiPkAnimation = new MultiPkAnimation();
            DEFAULT_INSTANCE = multiPkAnimation;
            multiPkAnimation.makeImmutable();
        }

        private MultiPkAnimation() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAnimationUrl() {
            this.animationUrl_ = getDefaultInstance().getAnimationUrl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMultiPkId() {
            this.multiPkId_ = getDefaultInstance().getMultiPkId();
        }

        public static MultiPkAnimation getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(MultiPkAnimation multiPkAnimation) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(multiPkAnimation);
        }

        public static MultiPkAnimation parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (MultiPkAnimation) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MultiPkAnimation parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (MultiPkAnimation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<MultiPkAnimation> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAnimationUrl(String str) {
            str.getClass();
            this.animationUrl_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAnimationUrlBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.animationUrl_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMultiPkId(String str) {
            str.getClass();
            this.multiPkId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMultiPkIdBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.multiPkId_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C45001.f15976xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new MultiPkAnimation();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3386h interfaceC3386h = (GeneratedMessageLite.InterfaceC3386h) obj;
                    MultiPkAnimation multiPkAnimation = (MultiPkAnimation) obj2;
                    this.multiPkId_ = interfaceC3386h.mo16997f(!this.multiPkId_.isEmpty(), this.multiPkId_, !multiPkAnimation.multiPkId_.isEmpty(), multiPkAnimation.multiPkId_);
                    this.animationUrl_ = interfaceC3386h.mo16997f(!this.animationUrl_.isEmpty(), this.animationUrl_, true ^ multiPkAnimation.animationUrl_.isEmpty(), multiPkAnimation.animationUrl_);
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
                                    this.multiPkId_ = c3407e.m17115L();
                                } else if (iM17116M == 18) {
                                    this.animationUrl_ = c3407e.m17115L();
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
                        synchronized (MultiPkAnimation.class) {
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

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk.MultiPkAnimationOrBuilder
        public String getAnimationUrl() {
            return this.animationUrl_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk.MultiPkAnimationOrBuilder
        public ByteString getAnimationUrlBytes() {
            return ByteString.copyFromUtf8(this.animationUrl_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk.MultiPkAnimationOrBuilder
        public String getMultiPkId() {
            return this.multiPkId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk.MultiPkAnimationOrBuilder
        public ByteString getMultiPkIdBytes() {
            return ByteString.copyFromUtf8(this.multiPkId_);
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16901K = !this.multiPkId_.isEmpty() ? CodedOutputStream.m16901K(1, getMultiPkId()) : 0;
            if (!this.animationUrl_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(2, getAnimationUrl());
            }
            this.memoizedSerializedSize = iM16901K;
            return iM16901K;
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.multiPkId_.isEmpty()) {
                codedOutputStream.mo16939D0(1, getMultiPkId());
            }
            if (this.animationUrl_.isEmpty()) {
                return;
            }
            codedOutputStream.mo16939D0(2, getAnimationUrl());
        }

        public static MultiPkAnimation parseDelimitedFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (MultiPkAnimation) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static MultiPkAnimation parseFrom(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
            return (MultiPkAnimation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3410h);
        }

        public static MultiPkAnimation parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (MultiPkAnimation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MultiPkAnimation parseFrom(byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
            return (MultiPkAnimation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3410h);
        }

        public static MultiPkAnimation parseFrom(InputStream inputStream) throws IOException {
            return (MultiPkAnimation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MultiPkAnimation parseFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (MultiPkAnimation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static MultiPkAnimation parseFrom(C3407e c3407e) throws IOException {
            return (MultiPkAnimation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static MultiPkAnimation parseFrom(C3407e c3407e, C3410h c3410h) throws IOException {
            return (MultiPkAnimation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e, c3410h);
        }
    }

    public static final class MultiPkInviteAccepted extends GeneratedMessageLite<MultiPkInviteAccepted, Builder> implements MultiPkInviteAcceptedOrBuilder {
        private static final MultiPkInviteAccepted DEFAULT_INSTANCE;
        public static final int MULTIPKINVITEID_FIELD_NUMBER = 1;
        private static volatile i860<MultiPkInviteAccepted> PARSER;
        private String multiPkInviteId_ = "";

        public static final class Builder extends GeneratedMessageLite.AbstractC3380b<MultiPkInviteAccepted, Builder> implements MultiPkInviteAcceptedOrBuilder {
            private Builder() {
                super(MultiPkInviteAccepted.DEFAULT_INSTANCE);
            }

            public Builder clearMultiPkInviteId() {
                copyOnWrite();
                ((MultiPkInviteAccepted) this.instance).clearMultiPkInviteId();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk.MultiPkInviteAcceptedOrBuilder
            public String getMultiPkInviteId() {
                return ((MultiPkInviteAccepted) this.instance).getMultiPkInviteId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk.MultiPkInviteAcceptedOrBuilder
            public ByteString getMultiPkInviteIdBytes() {
                return ((MultiPkInviteAccepted) this.instance).getMultiPkInviteIdBytes();
            }

            public Builder setMultiPkInviteId(String str) {
                copyOnWrite();
                ((MultiPkInviteAccepted) this.instance).setMultiPkInviteId(str);
                return this;
            }

            public Builder setMultiPkInviteIdBytes(ByteString byteString) {
                copyOnWrite();
                ((MultiPkInviteAccepted) this.instance).setMultiPkInviteIdBytes(byteString);
                return this;
            }
        }

        static {
            MultiPkInviteAccepted multiPkInviteAccepted = new MultiPkInviteAccepted();
            DEFAULT_INSTANCE = multiPkInviteAccepted;
            multiPkInviteAccepted.makeImmutable();
        }

        private MultiPkInviteAccepted() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMultiPkInviteId() {
            this.multiPkInviteId_ = getDefaultInstance().getMultiPkInviteId();
        }

        public static MultiPkInviteAccepted getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(MultiPkInviteAccepted multiPkInviteAccepted) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(multiPkInviteAccepted);
        }

        public static MultiPkInviteAccepted parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (MultiPkInviteAccepted) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MultiPkInviteAccepted parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (MultiPkInviteAccepted) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<MultiPkInviteAccepted> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMultiPkInviteId(String str) {
            str.getClass();
            this.multiPkInviteId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMultiPkInviteIdBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.multiPkInviteId_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C45001.f15976xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new MultiPkInviteAccepted();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    MultiPkInviteAccepted multiPkInviteAccepted = (MultiPkInviteAccepted) obj2;
                    this.multiPkInviteId_ = ((GeneratedMessageLite.InterfaceC3386h) obj).mo16997f(!this.multiPkInviteId_.isEmpty(), this.multiPkInviteId_, true ^ multiPkInviteAccepted.multiPkInviteId_.isEmpty(), multiPkInviteAccepted.multiPkInviteId_);
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
                                    this.multiPkInviteId_ = c3407e.m17115L();
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
                        synchronized (MultiPkInviteAccepted.class) {
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

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk.MultiPkInviteAcceptedOrBuilder
        public String getMultiPkInviteId() {
            return this.multiPkInviteId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk.MultiPkInviteAcceptedOrBuilder
        public ByteString getMultiPkInviteIdBytes() {
            return ByteString.copyFromUtf8(this.multiPkInviteId_);
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16901K = !this.multiPkInviteId_.isEmpty() ? CodedOutputStream.m16901K(1, getMultiPkInviteId()) : 0;
            this.memoizedSerializedSize = iM16901K;
            return iM16901K;
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.multiPkInviteId_.isEmpty()) {
                return;
            }
            codedOutputStream.mo16939D0(1, getMultiPkInviteId());
        }

        public static MultiPkInviteAccepted parseDelimitedFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (MultiPkInviteAccepted) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static MultiPkInviteAccepted parseFrom(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
            return (MultiPkInviteAccepted) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3410h);
        }

        public static MultiPkInviteAccepted parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (MultiPkInviteAccepted) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MultiPkInviteAccepted parseFrom(byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
            return (MultiPkInviteAccepted) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3410h);
        }

        public static MultiPkInviteAccepted parseFrom(InputStream inputStream) throws IOException {
            return (MultiPkInviteAccepted) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MultiPkInviteAccepted parseFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (MultiPkInviteAccepted) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static MultiPkInviteAccepted parseFrom(C3407e c3407e) throws IOException {
            return (MultiPkInviteAccepted) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static MultiPkInviteAccepted parseFrom(C3407e c3407e, C3410h c3410h) throws IOException {
            return (MultiPkInviteAccepted) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e, c3410h);
        }
    }

    public static final class MultiPkInviteNotify extends GeneratedMessageLite<MultiPkInviteNotify, Builder> implements MultiPkInviteNotifyOrBuilder {
        private static final MultiPkInviteNotify DEFAULT_INSTANCE;
        public static final int FROMUSER_FIELD_NUMBER = 2;
        public static final int MULTIPKINVITEID_FIELD_NUMBER = 1;
        private static volatile i860<MultiPkInviteNotify> PARSER;
        private MultiPkPlayer fromUser_;
        private String multiPkInviteId_ = "";

        static {
            MultiPkInviteNotify multiPkInviteNotify = new MultiPkInviteNotify();
            DEFAULT_INSTANCE = multiPkInviteNotify;
            multiPkInviteNotify.makeImmutable();
        }

        private MultiPkInviteNotify() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFromUser() {
            this.fromUser_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMultiPkInviteId() {
            this.multiPkInviteId_ = getDefaultInstance().getMultiPkInviteId();
        }

        public static MultiPkInviteNotify getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeFromUser(MultiPkPlayer multiPkPlayer) {
            MultiPkPlayer multiPkPlayer2 = this.fromUser_;
            if (multiPkPlayer2 == null || multiPkPlayer2 == MultiPkPlayer.getDefaultInstance()) {
                this.fromUser_ = multiPkPlayer;
            } else {
                this.fromUser_ = MultiPkPlayer.newBuilder(this.fromUser_).mergeFrom(multiPkPlayer).buildPartial();
            }
        }

        public static Builder newBuilder(MultiPkInviteNotify multiPkInviteNotify) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(multiPkInviteNotify);
        }

        public static MultiPkInviteNotify parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (MultiPkInviteNotify) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MultiPkInviteNotify parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (MultiPkInviteNotify) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<MultiPkInviteNotify> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFromUser(MultiPkPlayer.Builder builder) {
            this.fromUser_ = builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMultiPkInviteId(String str) {
            str.getClass();
            this.multiPkInviteId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMultiPkInviteIdBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.multiPkInviteId_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C45001.f15976xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new MultiPkInviteNotify();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3386h interfaceC3386h = (GeneratedMessageLite.InterfaceC3386h) obj;
                    MultiPkInviteNotify multiPkInviteNotify = (MultiPkInviteNotify) obj2;
                    this.multiPkInviteId_ = interfaceC3386h.mo16997f(!this.multiPkInviteId_.isEmpty(), this.multiPkInviteId_, true ^ multiPkInviteNotify.multiPkInviteId_.isEmpty(), multiPkInviteNotify.multiPkInviteId_);
                    this.fromUser_ = (MultiPkPlayer) interfaceC3386h.mo17006o(this.fromUser_, multiPkInviteNotify.fromUser_);
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
                                    this.multiPkInviteId_ = c3407e.m17115L();
                                } else if (iM17116M == 18) {
                                    MultiPkPlayer multiPkPlayer = this.fromUser_;
                                    MultiPkPlayer.Builder builder = multiPkPlayer != null ? multiPkPlayer.toBuilder() : null;
                                    MultiPkPlayer multiPkPlayer2 = (MultiPkPlayer) c3407e.m17143w(MultiPkPlayer.parser(), c3410h);
                                    this.fromUser_ = multiPkPlayer2;
                                    if (builder != null) {
                                        builder.mergeFrom(multiPkPlayer2);
                                        this.fromUser_ = builder.buildPartial();
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
                        synchronized (MultiPkInviteNotify.class) {
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

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk.MultiPkInviteNotifyOrBuilder
        public MultiPkPlayer getFromUser() {
            MultiPkPlayer multiPkPlayer = this.fromUser_;
            return multiPkPlayer == null ? MultiPkPlayer.getDefaultInstance() : multiPkPlayer;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk.MultiPkInviteNotifyOrBuilder
        public String getMultiPkInviteId() {
            return this.multiPkInviteId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk.MultiPkInviteNotifyOrBuilder
        public ByteString getMultiPkInviteIdBytes() {
            return ByteString.copyFromUtf8(this.multiPkInviteId_);
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16901K = !this.multiPkInviteId_.isEmpty() ? CodedOutputStream.m16901K(1, getMultiPkInviteId()) : 0;
            if (this.fromUser_ != null) {
                iM16901K += CodedOutputStream.m16893C(2, getFromUser());
            }
            this.memoizedSerializedSize = iM16901K;
            return iM16901K;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk.MultiPkInviteNotifyOrBuilder
        public boolean hasFromUser() {
            return this.fromUser_ != null;
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.multiPkInviteId_.isEmpty()) {
                codedOutputStream.mo16939D0(1, getMultiPkInviteId());
            }
            if (this.fromUser_ != null) {
                codedOutputStream.mo16974w0(2, getFromUser());
            }
        }

        public static MultiPkInviteNotify parseDelimitedFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (MultiPkInviteNotify) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static MultiPkInviteNotify parseFrom(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
            return (MultiPkInviteNotify) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3410h);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFromUser(MultiPkPlayer multiPkPlayer) {
            multiPkPlayer.getClass();
            this.fromUser_ = multiPkPlayer;
        }

        public static final class Builder extends GeneratedMessageLite.AbstractC3380b<MultiPkInviteNotify, Builder> implements MultiPkInviteNotifyOrBuilder {
            private Builder() {
                super(MultiPkInviteNotify.DEFAULT_INSTANCE);
            }

            public Builder clearFromUser() {
                copyOnWrite();
                ((MultiPkInviteNotify) this.instance).clearFromUser();
                return this;
            }

            public Builder clearMultiPkInviteId() {
                copyOnWrite();
                ((MultiPkInviteNotify) this.instance).clearMultiPkInviteId();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk.MultiPkInviteNotifyOrBuilder
            public MultiPkPlayer getFromUser() {
                return ((MultiPkInviteNotify) this.instance).getFromUser();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk.MultiPkInviteNotifyOrBuilder
            public String getMultiPkInviteId() {
                return ((MultiPkInviteNotify) this.instance).getMultiPkInviteId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk.MultiPkInviteNotifyOrBuilder
            public ByteString getMultiPkInviteIdBytes() {
                return ((MultiPkInviteNotify) this.instance).getMultiPkInviteIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk.MultiPkInviteNotifyOrBuilder
            public boolean hasFromUser() {
                return ((MultiPkInviteNotify) this.instance).hasFromUser();
            }

            public Builder mergeFromUser(MultiPkPlayer multiPkPlayer) {
                copyOnWrite();
                ((MultiPkInviteNotify) this.instance).mergeFromUser(multiPkPlayer);
                return this;
            }

            public Builder setFromUser(MultiPkPlayer multiPkPlayer) {
                copyOnWrite();
                ((MultiPkInviteNotify) this.instance).setFromUser(multiPkPlayer);
                return this;
            }

            public Builder setMultiPkInviteId(String str) {
                copyOnWrite();
                ((MultiPkInviteNotify) this.instance).setMultiPkInviteId(str);
                return this;
            }

            public Builder setMultiPkInviteIdBytes(ByteString byteString) {
                copyOnWrite();
                ((MultiPkInviteNotify) this.instance).setMultiPkInviteIdBytes(byteString);
                return this;
            }

            public Builder setFromUser(MultiPkPlayer.Builder builder) {
                copyOnWrite();
                ((MultiPkInviteNotify) this.instance).setFromUser(builder);
                return this;
            }
        }

        public static MultiPkInviteNotify parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (MultiPkInviteNotify) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MultiPkInviteNotify parseFrom(byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
            return (MultiPkInviteNotify) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3410h);
        }

        public static MultiPkInviteNotify parseFrom(InputStream inputStream) throws IOException {
            return (MultiPkInviteNotify) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MultiPkInviteNotify parseFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (MultiPkInviteNotify) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static MultiPkInviteNotify parseFrom(C3407e c3407e) throws IOException {
            return (MultiPkInviteNotify) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static MultiPkInviteNotify parseFrom(C3407e c3407e, C3410h c3410h) throws IOException {
            return (MultiPkInviteNotify) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e, c3410h);
        }
    }

    public static final class MultiPkInviteRejected extends GeneratedMessageLite<MultiPkInviteRejected, Builder> implements MultiPkInviteRejectedOrBuilder {
        private static final MultiPkInviteRejected DEFAULT_INSTANCE;
        public static final int MULTIPKINVITEID_FIELD_NUMBER = 1;
        private static volatile i860<MultiPkInviteRejected> PARSER = null;
        public static final int REJECTUSER_FIELD_NUMBER = 2;
        private String multiPkInviteId_ = "";
        private MultiPkPlayer rejectUser_;

        static {
            MultiPkInviteRejected multiPkInviteRejected = new MultiPkInviteRejected();
            DEFAULT_INSTANCE = multiPkInviteRejected;
            multiPkInviteRejected.makeImmutable();
        }

        private MultiPkInviteRejected() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMultiPkInviteId() {
            this.multiPkInviteId_ = getDefaultInstance().getMultiPkInviteId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRejectUser() {
            this.rejectUser_ = null;
        }

        public static MultiPkInviteRejected getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeRejectUser(MultiPkPlayer multiPkPlayer) {
            MultiPkPlayer multiPkPlayer2 = this.rejectUser_;
            if (multiPkPlayer2 == null || multiPkPlayer2 == MultiPkPlayer.getDefaultInstance()) {
                this.rejectUser_ = multiPkPlayer;
            } else {
                this.rejectUser_ = MultiPkPlayer.newBuilder(this.rejectUser_).mergeFrom(multiPkPlayer).buildPartial();
            }
        }

        public static Builder newBuilder(MultiPkInviteRejected multiPkInviteRejected) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(multiPkInviteRejected);
        }

        public static MultiPkInviteRejected parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (MultiPkInviteRejected) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MultiPkInviteRejected parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (MultiPkInviteRejected) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<MultiPkInviteRejected> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMultiPkInviteId(String str) {
            str.getClass();
            this.multiPkInviteId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMultiPkInviteIdBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.multiPkInviteId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRejectUser(MultiPkPlayer.Builder builder) {
            this.rejectUser_ = builder.build();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C45001.f15976xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new MultiPkInviteRejected();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3386h interfaceC3386h = (GeneratedMessageLite.InterfaceC3386h) obj;
                    MultiPkInviteRejected multiPkInviteRejected = (MultiPkInviteRejected) obj2;
                    this.multiPkInviteId_ = interfaceC3386h.mo16997f(!this.multiPkInviteId_.isEmpty(), this.multiPkInviteId_, true ^ multiPkInviteRejected.multiPkInviteId_.isEmpty(), multiPkInviteRejected.multiPkInviteId_);
                    this.rejectUser_ = (MultiPkPlayer) interfaceC3386h.mo17006o(this.rejectUser_, multiPkInviteRejected.rejectUser_);
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
                                    this.multiPkInviteId_ = c3407e.m17115L();
                                } else if (iM17116M == 18) {
                                    MultiPkPlayer multiPkPlayer = this.rejectUser_;
                                    MultiPkPlayer.Builder builder = multiPkPlayer != null ? multiPkPlayer.toBuilder() : null;
                                    MultiPkPlayer multiPkPlayer2 = (MultiPkPlayer) c3407e.m17143w(MultiPkPlayer.parser(), c3410h);
                                    this.rejectUser_ = multiPkPlayer2;
                                    if (builder != null) {
                                        builder.mergeFrom(multiPkPlayer2);
                                        this.rejectUser_ = builder.buildPartial();
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
                        synchronized (MultiPkInviteRejected.class) {
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

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk.MultiPkInviteRejectedOrBuilder
        public String getMultiPkInviteId() {
            return this.multiPkInviteId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk.MultiPkInviteRejectedOrBuilder
        public ByteString getMultiPkInviteIdBytes() {
            return ByteString.copyFromUtf8(this.multiPkInviteId_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk.MultiPkInviteRejectedOrBuilder
        public MultiPkPlayer getRejectUser() {
            MultiPkPlayer multiPkPlayer = this.rejectUser_;
            return multiPkPlayer == null ? MultiPkPlayer.getDefaultInstance() : multiPkPlayer;
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16901K = !this.multiPkInviteId_.isEmpty() ? CodedOutputStream.m16901K(1, getMultiPkInviteId()) : 0;
            if (this.rejectUser_ != null) {
                iM16901K += CodedOutputStream.m16893C(2, getRejectUser());
            }
            this.memoizedSerializedSize = iM16901K;
            return iM16901K;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk.MultiPkInviteRejectedOrBuilder
        public boolean hasRejectUser() {
            return this.rejectUser_ != null;
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.multiPkInviteId_.isEmpty()) {
                codedOutputStream.mo16939D0(1, getMultiPkInviteId());
            }
            if (this.rejectUser_ != null) {
                codedOutputStream.mo16974w0(2, getRejectUser());
            }
        }

        public static MultiPkInviteRejected parseDelimitedFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (MultiPkInviteRejected) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static MultiPkInviteRejected parseFrom(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
            return (MultiPkInviteRejected) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3410h);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRejectUser(MultiPkPlayer multiPkPlayer) {
            multiPkPlayer.getClass();
            this.rejectUser_ = multiPkPlayer;
        }

        public static final class Builder extends GeneratedMessageLite.AbstractC3380b<MultiPkInviteRejected, Builder> implements MultiPkInviteRejectedOrBuilder {
            private Builder() {
                super(MultiPkInviteRejected.DEFAULT_INSTANCE);
            }

            public Builder clearMultiPkInviteId() {
                copyOnWrite();
                ((MultiPkInviteRejected) this.instance).clearMultiPkInviteId();
                return this;
            }

            public Builder clearRejectUser() {
                copyOnWrite();
                ((MultiPkInviteRejected) this.instance).clearRejectUser();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk.MultiPkInviteRejectedOrBuilder
            public String getMultiPkInviteId() {
                return ((MultiPkInviteRejected) this.instance).getMultiPkInviteId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk.MultiPkInviteRejectedOrBuilder
            public ByteString getMultiPkInviteIdBytes() {
                return ((MultiPkInviteRejected) this.instance).getMultiPkInviteIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk.MultiPkInviteRejectedOrBuilder
            public MultiPkPlayer getRejectUser() {
                return ((MultiPkInviteRejected) this.instance).getRejectUser();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk.MultiPkInviteRejectedOrBuilder
            public boolean hasRejectUser() {
                return ((MultiPkInviteRejected) this.instance).hasRejectUser();
            }

            public Builder mergeRejectUser(MultiPkPlayer multiPkPlayer) {
                copyOnWrite();
                ((MultiPkInviteRejected) this.instance).mergeRejectUser(multiPkPlayer);
                return this;
            }

            public Builder setMultiPkInviteId(String str) {
                copyOnWrite();
                ((MultiPkInviteRejected) this.instance).setMultiPkInviteId(str);
                return this;
            }

            public Builder setMultiPkInviteIdBytes(ByteString byteString) {
                copyOnWrite();
                ((MultiPkInviteRejected) this.instance).setMultiPkInviteIdBytes(byteString);
                return this;
            }

            public Builder setRejectUser(MultiPkPlayer multiPkPlayer) {
                copyOnWrite();
                ((MultiPkInviteRejected) this.instance).setRejectUser(multiPkPlayer);
                return this;
            }

            public Builder setRejectUser(MultiPkPlayer.Builder builder) {
                copyOnWrite();
                ((MultiPkInviteRejected) this.instance).setRejectUser(builder);
                return this;
            }
        }

        public static MultiPkInviteRejected parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (MultiPkInviteRejected) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MultiPkInviteRejected parseFrom(byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
            return (MultiPkInviteRejected) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3410h);
        }

        public static MultiPkInviteRejected parseFrom(InputStream inputStream) throws IOException {
            return (MultiPkInviteRejected) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MultiPkInviteRejected parseFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (MultiPkInviteRejected) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static MultiPkInviteRejected parseFrom(C3407e c3407e) throws IOException {
            return (MultiPkInviteRejected) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static MultiPkInviteRejected parseFrom(C3407e c3407e, C3410h c3410h) throws IOException {
            return (MultiPkInviteRejected) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e, c3410h);
        }
    }

    public static final class MultiPkPlayer extends GeneratedMessageLite<MultiPkPlayer, Builder> implements MultiPkPlayerOrBuilder {
        public static final int AVATAR_FIELD_NUMBER = 8;
        private static final MultiPkPlayer DEFAULT_INSTANCE;
        public static final int LIVEID_FIELD_NUMBER = 5;
        private static volatile i860<MultiPkPlayer> PARSER = null;
        public static final int POINT_FIELD_NUMBER = 6;
        public static final int POSITION_FIELD_NUMBER = 2;
        public static final int RANK_FIELD_NUMBER = 9;
        public static final int ROLE_FIELD_NUMBER = 3;
        public static final int ROOMID_FIELD_NUMBER = 4;
        public static final int USERID_FIELD_NUMBER = 1;
        public static final int USERNAME_FIELD_NUMBER = 7;
        private long point_;
        private long position_;
        private long rank_;
        private String userId_ = "";
        private String role_ = "";
        private String roomId_ = "";
        private String liveId_ = "";
        private String userName_ = "";
        private String avatar_ = "";

        public static final class Builder extends GeneratedMessageLite.AbstractC3380b<MultiPkPlayer, Builder> implements MultiPkPlayerOrBuilder {
            private Builder() {
                super(MultiPkPlayer.DEFAULT_INSTANCE);
            }

            public Builder clearAvatar() {
                copyOnWrite();
                ((MultiPkPlayer) this.instance).clearAvatar();
                return this;
            }

            public Builder clearLiveId() {
                copyOnWrite();
                ((MultiPkPlayer) this.instance).clearLiveId();
                return this;
            }

            public Builder clearPoint() {
                copyOnWrite();
                ((MultiPkPlayer) this.instance).clearPoint();
                return this;
            }

            public Builder clearPosition() {
                copyOnWrite();
                ((MultiPkPlayer) this.instance).clearPosition();
                return this;
            }

            public Builder clearRank() {
                copyOnWrite();
                ((MultiPkPlayer) this.instance).clearRank();
                return this;
            }

            public Builder clearRole() {
                copyOnWrite();
                ((MultiPkPlayer) this.instance).clearRole();
                return this;
            }

            public Builder clearRoomId() {
                copyOnWrite();
                ((MultiPkPlayer) this.instance).clearRoomId();
                return this;
            }

            public Builder clearUserId() {
                copyOnWrite();
                ((MultiPkPlayer) this.instance).clearUserId();
                return this;
            }

            public Builder clearUserName() {
                copyOnWrite();
                ((MultiPkPlayer) this.instance).clearUserName();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk.MultiPkPlayerOrBuilder
            public String getAvatar() {
                return ((MultiPkPlayer) this.instance).getAvatar();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk.MultiPkPlayerOrBuilder
            public ByteString getAvatarBytes() {
                return ((MultiPkPlayer) this.instance).getAvatarBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk.MultiPkPlayerOrBuilder
            public String getLiveId() {
                return ((MultiPkPlayer) this.instance).getLiveId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk.MultiPkPlayerOrBuilder
            public ByteString getLiveIdBytes() {
                return ((MultiPkPlayer) this.instance).getLiveIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk.MultiPkPlayerOrBuilder
            public long getPoint() {
                return ((MultiPkPlayer) this.instance).getPoint();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk.MultiPkPlayerOrBuilder
            public long getPosition() {
                return ((MultiPkPlayer) this.instance).getPosition();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk.MultiPkPlayerOrBuilder
            public long getRank() {
                return ((MultiPkPlayer) this.instance).getRank();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk.MultiPkPlayerOrBuilder
            public String getRole() {
                return ((MultiPkPlayer) this.instance).getRole();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk.MultiPkPlayerOrBuilder
            public ByteString getRoleBytes() {
                return ((MultiPkPlayer) this.instance).getRoleBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk.MultiPkPlayerOrBuilder
            public String getRoomId() {
                return ((MultiPkPlayer) this.instance).getRoomId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk.MultiPkPlayerOrBuilder
            public ByteString getRoomIdBytes() {
                return ((MultiPkPlayer) this.instance).getRoomIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk.MultiPkPlayerOrBuilder
            public String getUserId() {
                return ((MultiPkPlayer) this.instance).getUserId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk.MultiPkPlayerOrBuilder
            public ByteString getUserIdBytes() {
                return ((MultiPkPlayer) this.instance).getUserIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk.MultiPkPlayerOrBuilder
            public String getUserName() {
                return ((MultiPkPlayer) this.instance).getUserName();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk.MultiPkPlayerOrBuilder
            public ByteString getUserNameBytes() {
                return ((MultiPkPlayer) this.instance).getUserNameBytes();
            }

            public Builder setAvatar(String str) {
                copyOnWrite();
                ((MultiPkPlayer) this.instance).setAvatar(str);
                return this;
            }

            public Builder setAvatarBytes(ByteString byteString) {
                copyOnWrite();
                ((MultiPkPlayer) this.instance).setAvatarBytes(byteString);
                return this;
            }

            public Builder setLiveId(String str) {
                copyOnWrite();
                ((MultiPkPlayer) this.instance).setLiveId(str);
                return this;
            }

            public Builder setLiveIdBytes(ByteString byteString) {
                copyOnWrite();
                ((MultiPkPlayer) this.instance).setLiveIdBytes(byteString);
                return this;
            }

            public Builder setPoint(long j) {
                copyOnWrite();
                ((MultiPkPlayer) this.instance).setPoint(j);
                return this;
            }

            public Builder setPosition(long j) {
                copyOnWrite();
                ((MultiPkPlayer) this.instance).setPosition(j);
                return this;
            }

            public Builder setRank(long j) {
                copyOnWrite();
                ((MultiPkPlayer) this.instance).setRank(j);
                return this;
            }

            public Builder setRole(String str) {
                copyOnWrite();
                ((MultiPkPlayer) this.instance).setRole(str);
                return this;
            }

            public Builder setRoleBytes(ByteString byteString) {
                copyOnWrite();
                ((MultiPkPlayer) this.instance).setRoleBytes(byteString);
                return this;
            }

            public Builder setRoomId(String str) {
                copyOnWrite();
                ((MultiPkPlayer) this.instance).setRoomId(str);
                return this;
            }

            public Builder setRoomIdBytes(ByteString byteString) {
                copyOnWrite();
                ((MultiPkPlayer) this.instance).setRoomIdBytes(byteString);
                return this;
            }

            public Builder setUserId(String str) {
                copyOnWrite();
                ((MultiPkPlayer) this.instance).setUserId(str);
                return this;
            }

            public Builder setUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((MultiPkPlayer) this.instance).setUserIdBytes(byteString);
                return this;
            }

            public Builder setUserName(String str) {
                copyOnWrite();
                ((MultiPkPlayer) this.instance).setUserName(str);
                return this;
            }

            public Builder setUserNameBytes(ByteString byteString) {
                copyOnWrite();
                ((MultiPkPlayer) this.instance).setUserNameBytes(byteString);
                return this;
            }
        }

        static {
            MultiPkPlayer multiPkPlayer = new MultiPkPlayer();
            DEFAULT_INSTANCE = multiPkPlayer;
            multiPkPlayer.makeImmutable();
        }

        private MultiPkPlayer() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAvatar() {
            this.avatar_ = getDefaultInstance().getAvatar();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLiveId() {
            this.liveId_ = getDefaultInstance().getLiveId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPoint() {
            this.point_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPosition() {
            this.position_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRank() {
            this.rank_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRole() {
            this.role_ = getDefaultInstance().getRole();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRoomId() {
            this.roomId_ = getDefaultInstance().getRoomId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUserId() {
            this.userId_ = getDefaultInstance().getUserId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUserName() {
            this.userName_ = getDefaultInstance().getUserName();
        }

        public static MultiPkPlayer getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(MultiPkPlayer multiPkPlayer) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(multiPkPlayer);
        }

        public static MultiPkPlayer parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (MultiPkPlayer) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MultiPkPlayer parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (MultiPkPlayer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<MultiPkPlayer> parser() {
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
        public void setPoint(long j) {
            this.point_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPosition(long j) {
            this.position_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRank(long j) {
            this.rank_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRole(String str) {
            str.getClass();
            this.role_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRoleBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.role_ = byteString.toStringUtf8();
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
        public void setUserName(String str) {
            str.getClass();
            this.userName_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserNameBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.userName_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C45001.f15976xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new MultiPkPlayer();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3386h interfaceC3386h = (GeneratedMessageLite.InterfaceC3386h) obj;
                    MultiPkPlayer multiPkPlayer = (MultiPkPlayer) obj2;
                    this.userId_ = interfaceC3386h.mo16997f(!this.userId_.isEmpty(), this.userId_, !multiPkPlayer.userId_.isEmpty(), multiPkPlayer.userId_);
                    long j = this.position_;
                    boolean z2 = j != 0;
                    long j2 = multiPkPlayer.position_;
                    this.position_ = interfaceC3386h.mo17000i(z2, j, j2 != 0, j2);
                    this.role_ = interfaceC3386h.mo16997f(!this.role_.isEmpty(), this.role_, !multiPkPlayer.role_.isEmpty(), multiPkPlayer.role_);
                    this.roomId_ = interfaceC3386h.mo16997f(!this.roomId_.isEmpty(), this.roomId_, !multiPkPlayer.roomId_.isEmpty(), multiPkPlayer.roomId_);
                    this.liveId_ = interfaceC3386h.mo16997f(!this.liveId_.isEmpty(), this.liveId_, !multiPkPlayer.liveId_.isEmpty(), multiPkPlayer.liveId_);
                    long j3 = this.point_;
                    boolean z3 = j3 != 0;
                    long j4 = multiPkPlayer.point_;
                    this.point_ = interfaceC3386h.mo17000i(z3, j3, j4 != 0, j4);
                    this.userName_ = interfaceC3386h.mo16997f(!this.userName_.isEmpty(), this.userName_, !multiPkPlayer.userName_.isEmpty(), multiPkPlayer.userName_);
                    this.avatar_ = interfaceC3386h.mo16997f(!this.avatar_.isEmpty(), this.avatar_, !multiPkPlayer.avatar_.isEmpty(), multiPkPlayer.avatar_);
                    boolean z4 = false;
                    long j5 = this.rank_;
                    if (j5 != 0) {
                        z4 = true;
                    }
                    long j6 = multiPkPlayer.rank_;
                    this.rank_ = interfaceC3386h.mo17000i(z4, j5, j6 != 0, j6);
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
                                    this.position_ = c3407e.m17142v();
                                } else if (iM17116M == 26) {
                                    this.role_ = c3407e.m17115L();
                                } else if (iM17116M == 34) {
                                    this.roomId_ = c3407e.m17115L();
                                } else if (iM17116M == 42) {
                                    this.liveId_ = c3407e.m17115L();
                                } else if (iM17116M == 48) {
                                    this.point_ = c3407e.m17118O();
                                } else if (iM17116M == 58) {
                                    this.userName_ = c3407e.m17115L();
                                } else if (iM17116M == 66) {
                                    this.avatar_ = c3407e.m17115L();
                                } else if (iM17116M == 72) {
                                    this.rank_ = c3407e.m17142v();
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
                        synchronized (MultiPkPlayer.class) {
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

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk.MultiPkPlayerOrBuilder
        public String getAvatar() {
            return this.avatar_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk.MultiPkPlayerOrBuilder
        public ByteString getAvatarBytes() {
            return ByteString.copyFromUtf8(this.avatar_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk.MultiPkPlayerOrBuilder
        public String getLiveId() {
            return this.liveId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk.MultiPkPlayerOrBuilder
        public ByteString getLiveIdBytes() {
            return ByteString.copyFromUtf8(this.liveId_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk.MultiPkPlayerOrBuilder
        public long getPoint() {
            return this.point_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk.MultiPkPlayerOrBuilder
        public long getPosition() {
            return this.position_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk.MultiPkPlayerOrBuilder
        public long getRank() {
            return this.rank_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk.MultiPkPlayerOrBuilder
        public String getRole() {
            return this.role_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk.MultiPkPlayerOrBuilder
        public ByteString getRoleBytes() {
            return ByteString.copyFromUtf8(this.role_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk.MultiPkPlayerOrBuilder
        public String getRoomId() {
            return this.roomId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk.MultiPkPlayerOrBuilder
        public ByteString getRoomIdBytes() {
            return ByteString.copyFromUtf8(this.roomId_);
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16901K = !this.userId_.isEmpty() ? CodedOutputStream.m16901K(1, getUserId()) : 0;
            long j = this.position_;
            if (j != 0) {
                iM16901K += CodedOutputStream.m16931v(2, j);
            }
            if (!this.role_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(3, getRole());
            }
            if (!this.roomId_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(4, getRoomId());
            }
            if (!this.liveId_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(5, getLiveId());
            }
            long j2 = this.point_;
            if (j2 != 0) {
                iM16901K += CodedOutputStream.m16906P(6, j2);
            }
            if (!this.userName_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(7, getUserName());
            }
            if (!this.avatar_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(8, getAvatar());
            }
            long j3 = this.rank_;
            if (j3 != 0) {
                iM16901K += CodedOutputStream.m16931v(9, j3);
            }
            this.memoizedSerializedSize = iM16901K;
            return iM16901K;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk.MultiPkPlayerOrBuilder
        public String getUserId() {
            return this.userId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk.MultiPkPlayerOrBuilder
        public ByteString getUserIdBytes() {
            return ByteString.copyFromUtf8(this.userId_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk.MultiPkPlayerOrBuilder
        public String getUserName() {
            return this.userName_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk.MultiPkPlayerOrBuilder
        public ByteString getUserNameBytes() {
            return ByteString.copyFromUtf8(this.userName_);
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.userId_.isEmpty()) {
                codedOutputStream.mo16939D0(1, getUserId());
            }
            long j = this.position_;
            if (j != 0) {
                codedOutputStream.m16972u0(2, j);
            }
            if (!this.role_.isEmpty()) {
                codedOutputStream.mo16939D0(3, getRole());
            }
            if (!this.roomId_.isEmpty()) {
                codedOutputStream.mo16939D0(4, getRoomId());
            }
            if (!this.liveId_.isEmpty()) {
                codedOutputStream.mo16939D0(5, getLiveId());
            }
            long j2 = this.point_;
            if (j2 != 0) {
                codedOutputStream.mo16944I0(6, j2);
            }
            if (!this.userName_.isEmpty()) {
                codedOutputStream.mo16939D0(7, getUserName());
            }
            if (!this.avatar_.isEmpty()) {
                codedOutputStream.mo16939D0(8, getAvatar());
            }
            long j3 = this.rank_;
            if (j3 != 0) {
                codedOutputStream.m16972u0(9, j3);
            }
        }

        public static MultiPkPlayer parseDelimitedFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (MultiPkPlayer) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static MultiPkPlayer parseFrom(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
            return (MultiPkPlayer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3410h);
        }

        public static MultiPkPlayer parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (MultiPkPlayer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MultiPkPlayer parseFrom(byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
            return (MultiPkPlayer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3410h);
        }

        public static MultiPkPlayer parseFrom(InputStream inputStream) throws IOException {
            return (MultiPkPlayer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MultiPkPlayer parseFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (MultiPkPlayer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static MultiPkPlayer parseFrom(C3407e c3407e) throws IOException {
            return (MultiPkPlayer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static MultiPkPlayer parseFrom(C3407e c3407e, C3410h c3410h) throws IOException {
            return (MultiPkPlayer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e, c3410h);
        }
    }

    public static final class MultiPkPoints extends GeneratedMessageLite<MultiPkPoints, Builder> implements MultiPkPointsOrBuilder {
        private static final MultiPkPoints DEFAULT_INSTANCE;
        private static volatile i860<MultiPkPoints> PARSER = null;
        public static final int PKID_FIELD_NUMBER = 1;
        public static final int PLAYER_FIELD_NUMBER = 2;
        public static final int SERVERTIMETS_FIELD_NUMBER = 3;
        private int bitField0_;
        private String pkId_ = "";
        private C3414l.h<MultiPkPlayer> player_ = GeneratedMessageLite.emptyProtobufList();
        private long serverTimeTs_;

        static {
            MultiPkPoints multiPkPoints = new MultiPkPoints();
            DEFAULT_INSTANCE = multiPkPoints;
            multiPkPoints.makeImmutable();
        }

        private MultiPkPoints() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllPlayer(Iterable<? extends MultiPkPlayer> iterable) {
            ensurePlayerIsMutable();
            AbstractC3403a.addAll(iterable, this.player_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addPlayer(MultiPkPlayer.Builder builder) {
            ensurePlayerIsMutable();
            this.player_.add(builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPkId() {
            this.pkId_ = getDefaultInstance().getPkId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPlayer() {
            this.player_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearServerTimeTs() {
            this.serverTimeTs_ = 0L;
        }

        private void ensurePlayerIsMutable() {
            if (this.player_.mo17085q()) {
                return;
            }
            this.player_ = GeneratedMessageLite.mutableCopy(this.player_);
        }

        public static MultiPkPoints getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(MultiPkPoints multiPkPoints) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(multiPkPoints);
        }

        public static MultiPkPoints parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (MultiPkPoints) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MultiPkPoints parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (MultiPkPoints) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<MultiPkPoints> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removePlayer(int i) {
            ensurePlayerIsMutable();
            this.player_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPkId(String str) {
            str.getClass();
            this.pkId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPkIdBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.pkId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPlayer(int i, MultiPkPlayer.Builder builder) {
            ensurePlayerIsMutable();
            this.player_.set(i, builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setServerTimeTs(long j) {
            this.serverTimeTs_ = j;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C45001.f15976xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new MultiPkPoints();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.player_.mo17084n();
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3386h interfaceC3386h = (GeneratedMessageLite.InterfaceC3386h) obj;
                    MultiPkPoints multiPkPoints = (MultiPkPoints) obj2;
                    this.pkId_ = interfaceC3386h.mo16997f(!this.pkId_.isEmpty(), this.pkId_, !multiPkPoints.pkId_.isEmpty(), multiPkPoints.pkId_);
                    this.player_ = interfaceC3386h.mo16998g(this.player_, multiPkPoints.player_);
                    long j = this.serverTimeTs_;
                    boolean z2 = j != 0;
                    long j2 = multiPkPoints.serverTimeTs_;
                    this.serverTimeTs_ = interfaceC3386h.mo17000i(z2, j, j2 != 0, j2);
                    if (interfaceC3386h == GeneratedMessageLite.C3385g.INSTANCE) {
                        this.bitField0_ |= multiPkPoints.bitField0_;
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
                                    this.pkId_ = c3407e.m17115L();
                                } else if (iM17116M == 18) {
                                    if (!this.player_.mo17085q()) {
                                        this.player_ = GeneratedMessageLite.mutableCopy(this.player_);
                                    }
                                    this.player_.add((MultiPkPlayer) c3407e.m17143w(MultiPkPlayer.parser(), c3410h));
                                } else if (iM17116M == 24) {
                                    this.serverTimeTs_ = c3407e.m17142v();
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
                        synchronized (MultiPkPoints.class) {
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

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk.MultiPkPointsOrBuilder
        public String getPkId() {
            return this.pkId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk.MultiPkPointsOrBuilder
        public ByteString getPkIdBytes() {
            return ByteString.copyFromUtf8(this.pkId_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk.MultiPkPointsOrBuilder
        public MultiPkPlayer getPlayer(int i) {
            return this.player_.get(i);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk.MultiPkPointsOrBuilder
        public int getPlayerCount() {
            return this.player_.size();
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk.MultiPkPointsOrBuilder
        public List<MultiPkPlayer> getPlayerList() {
            return this.player_;
        }

        public MultiPkPlayerOrBuilder getPlayerOrBuilder(int i) {
            return this.player_.get(i);
        }

        public List<? extends MultiPkPlayerOrBuilder> getPlayerOrBuilderList() {
            return this.player_;
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16901K = !this.pkId_.isEmpty() ? CodedOutputStream.m16901K(1, getPkId()) : 0;
            for (int i2 = 0; i2 < this.player_.size(); i2++) {
                iM16901K += CodedOutputStream.m16893C(2, this.player_.get(i2));
            }
            long j = this.serverTimeTs_;
            if (j != 0) {
                iM16901K += CodedOutputStream.m16931v(3, j);
            }
            this.memoizedSerializedSize = iM16901K;
            return iM16901K;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk.MultiPkPointsOrBuilder
        public long getServerTimeTs() {
            return this.serverTimeTs_;
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.pkId_.isEmpty()) {
                codedOutputStream.mo16939D0(1, getPkId());
            }
            for (int i = 0; i < this.player_.size(); i++) {
                codedOutputStream.mo16974w0(2, this.player_.get(i));
            }
            long j = this.serverTimeTs_;
            if (j != 0) {
                codedOutputStream.m16972u0(3, j);
            }
        }

        public static MultiPkPoints parseDelimitedFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (MultiPkPoints) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static MultiPkPoints parseFrom(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
            return (MultiPkPoints) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3410h);
        }

        public static final class Builder extends GeneratedMessageLite.AbstractC3380b<MultiPkPoints, Builder> implements MultiPkPointsOrBuilder {
            private Builder() {
                super(MultiPkPoints.DEFAULT_INSTANCE);
            }

            public Builder addAllPlayer(Iterable<? extends MultiPkPlayer> iterable) {
                copyOnWrite();
                ((MultiPkPoints) this.instance).addAllPlayer(iterable);
                return this;
            }

            public Builder addPlayer(MultiPkPlayer multiPkPlayer) {
                copyOnWrite();
                ((MultiPkPoints) this.instance).addPlayer(multiPkPlayer);
                return this;
            }

            public Builder clearPkId() {
                copyOnWrite();
                ((MultiPkPoints) this.instance).clearPkId();
                return this;
            }

            public Builder clearPlayer() {
                copyOnWrite();
                ((MultiPkPoints) this.instance).clearPlayer();
                return this;
            }

            public Builder clearServerTimeTs() {
                copyOnWrite();
                ((MultiPkPoints) this.instance).clearServerTimeTs();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk.MultiPkPointsOrBuilder
            public String getPkId() {
                return ((MultiPkPoints) this.instance).getPkId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk.MultiPkPointsOrBuilder
            public ByteString getPkIdBytes() {
                return ((MultiPkPoints) this.instance).getPkIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk.MultiPkPointsOrBuilder
            public MultiPkPlayer getPlayer(int i) {
                return ((MultiPkPoints) this.instance).getPlayer(i);
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk.MultiPkPointsOrBuilder
            public int getPlayerCount() {
                return ((MultiPkPoints) this.instance).getPlayerCount();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk.MultiPkPointsOrBuilder
            public List<MultiPkPlayer> getPlayerList() {
                return Collections.unmodifiableList(((MultiPkPoints) this.instance).getPlayerList());
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk.MultiPkPointsOrBuilder
            public long getServerTimeTs() {
                return ((MultiPkPoints) this.instance).getServerTimeTs();
            }

            public Builder removePlayer(int i) {
                copyOnWrite();
                ((MultiPkPoints) this.instance).removePlayer(i);
                return this;
            }

            public Builder setPkId(String str) {
                copyOnWrite();
                ((MultiPkPoints) this.instance).setPkId(str);
                return this;
            }

            public Builder setPkIdBytes(ByteString byteString) {
                copyOnWrite();
                ((MultiPkPoints) this.instance).setPkIdBytes(byteString);
                return this;
            }

            public Builder setPlayer(int i, MultiPkPlayer multiPkPlayer) {
                copyOnWrite();
                ((MultiPkPoints) this.instance).setPlayer(i, multiPkPlayer);
                return this;
            }

            public Builder setServerTimeTs(long j) {
                copyOnWrite();
                ((MultiPkPoints) this.instance).setServerTimeTs(j);
                return this;
            }

            public Builder addPlayer(int i, MultiPkPlayer multiPkPlayer) {
                copyOnWrite();
                ((MultiPkPoints) this.instance).addPlayer(i, multiPkPlayer);
                return this;
            }

            public Builder setPlayer(int i, MultiPkPlayer.Builder builder) {
                copyOnWrite();
                ((MultiPkPoints) this.instance).setPlayer(i, builder);
                return this;
            }

            public Builder addPlayer(MultiPkPlayer.Builder builder) {
                copyOnWrite();
                ((MultiPkPoints) this.instance).addPlayer(builder);
                return this;
            }

            public Builder addPlayer(int i, MultiPkPlayer.Builder builder) {
                copyOnWrite();
                ((MultiPkPoints) this.instance).addPlayer(i, builder);
                return this;
            }
        }

        public static MultiPkPoints parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (MultiPkPoints) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MultiPkPoints parseFrom(byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
            return (MultiPkPoints) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3410h);
        }

        public static MultiPkPoints parseFrom(InputStream inputStream) throws IOException {
            return (MultiPkPoints) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MultiPkPoints parseFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (MultiPkPoints) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static MultiPkPoints parseFrom(C3407e c3407e) throws IOException {
            return (MultiPkPoints) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addPlayer(int i, MultiPkPlayer multiPkPlayer) {
            multiPkPlayer.getClass();
            ensurePlayerIsMutable();
            this.player_.add(i, multiPkPlayer);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static MultiPkPoints parseFrom(C3407e c3407e, C3410h c3410h) throws IOException {
            return (MultiPkPoints) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e, c3410h);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPlayer(int i, MultiPkPlayer multiPkPlayer) {
            multiPkPlayer.getClass();
            ensurePlayerIsMutable();
            this.player_.set(i, multiPkPlayer);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addPlayer(MultiPkPlayer multiPkPlayer) {
            multiPkPlayer.getClass();
            ensurePlayerIsMutable();
            this.player_.add(multiPkPlayer);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addPlayer(int i, MultiPkPlayer.Builder builder) {
            ensurePlayerIsMutable();
            this.player_.add(i, builder.build());
        }
    }

    public static final class MultiPkStageChange extends GeneratedMessageLite<MultiPkStageChange, Builder> implements MultiPkStageChangeOrBuilder {
        private static final MultiPkStageChange DEFAULT_INSTANCE;
        public static final int MULTIPK_FIELD_NUMBER = 1;
        private static volatile i860<MultiPkStageChange> PARSER;
        private MultiPk multiPk_;

        static {
            MultiPkStageChange multiPkStageChange = new MultiPkStageChange();
            DEFAULT_INSTANCE = multiPkStageChange;
            multiPkStageChange.makeImmutable();
        }

        private MultiPkStageChange() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMultiPk() {
            this.multiPk_ = null;
        }

        public static MultiPkStageChange getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeMultiPk(MultiPk multiPk) {
            MultiPk multiPk2 = this.multiPk_;
            if (multiPk2 == null || multiPk2 == MultiPk.getDefaultInstance()) {
                this.multiPk_ = multiPk;
            } else {
                this.multiPk_ = MultiPk.newBuilder(this.multiPk_).mergeFrom(multiPk).buildPartial();
            }
        }

        public static Builder newBuilder(MultiPkStageChange multiPkStageChange) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(multiPkStageChange);
        }

        public static MultiPkStageChange parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (MultiPkStageChange) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MultiPkStageChange parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (MultiPkStageChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<MultiPkStageChange> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMultiPk(MultiPk.Builder builder) {
            this.multiPk_ = builder.build();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C45001.f15976xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new MultiPkStageChange();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    this.multiPk_ = (MultiPk) ((GeneratedMessageLite.InterfaceC3386h) obj).mo17006o(this.multiPk_, ((MultiPkStageChange) obj2).multiPk_);
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
                                    MultiPk multiPk = this.multiPk_;
                                    MultiPk.Builder builder = multiPk != null ? multiPk.toBuilder() : null;
                                    MultiPk multiPk2 = (MultiPk) c3407e.m17143w(MultiPk.parser(), c3410h);
                                    this.multiPk_ = multiPk2;
                                    if (builder != null) {
                                        builder.mergeFrom(multiPk2);
                                        this.multiPk_ = builder.buildPartial();
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
                        synchronized (MultiPkStageChange.class) {
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

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk.MultiPkStageChangeOrBuilder
        public MultiPk getMultiPk() {
            MultiPk multiPk = this.multiPk_;
            return multiPk == null ? MultiPk.getDefaultInstance() : multiPk;
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16893C = this.multiPk_ != null ? CodedOutputStream.m16893C(1, getMultiPk()) : 0;
            this.memoizedSerializedSize = iM16893C;
            return iM16893C;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk.MultiPkStageChangeOrBuilder
        public boolean hasMultiPk() {
            return this.multiPk_ != null;
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.multiPk_ != null) {
                codedOutputStream.mo16974w0(1, getMultiPk());
            }
        }

        public static MultiPkStageChange parseDelimitedFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (MultiPkStageChange) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static MultiPkStageChange parseFrom(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
            return (MultiPkStageChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3410h);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMultiPk(MultiPk multiPk) {
            multiPk.getClass();
            this.multiPk_ = multiPk;
        }

        public static final class Builder extends GeneratedMessageLite.AbstractC3380b<MultiPkStageChange, Builder> implements MultiPkStageChangeOrBuilder {
            private Builder() {
                super(MultiPkStageChange.DEFAULT_INSTANCE);
            }

            public Builder clearMultiPk() {
                copyOnWrite();
                ((MultiPkStageChange) this.instance).clearMultiPk();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk.MultiPkStageChangeOrBuilder
            public MultiPk getMultiPk() {
                return ((MultiPkStageChange) this.instance).getMultiPk();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk.MultiPkStageChangeOrBuilder
            public boolean hasMultiPk() {
                return ((MultiPkStageChange) this.instance).hasMultiPk();
            }

            public Builder mergeMultiPk(MultiPk multiPk) {
                copyOnWrite();
                ((MultiPkStageChange) this.instance).mergeMultiPk(multiPk);
                return this;
            }

            public Builder setMultiPk(MultiPk multiPk) {
                copyOnWrite();
                ((MultiPkStageChange) this.instance).setMultiPk(multiPk);
                return this;
            }

            public Builder setMultiPk(MultiPk.Builder builder) {
                copyOnWrite();
                ((MultiPkStageChange) this.instance).setMultiPk(builder);
                return this;
            }
        }

        public static MultiPkStageChange parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (MultiPkStageChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MultiPkStageChange parseFrom(byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
            return (MultiPkStageChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3410h);
        }

        public static MultiPkStageChange parseFrom(InputStream inputStream) throws IOException {
            return (MultiPkStageChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MultiPkStageChange parseFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (MultiPkStageChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static MultiPkStageChange parseFrom(C3407e c3407e) throws IOException {
            return (MultiPkStageChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static MultiPkStageChange parseFrom(C3407e c3407e, C3410h c3410h) throws IOException {
            return (MultiPkStageChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e, c3410h);
        }
    }
}
