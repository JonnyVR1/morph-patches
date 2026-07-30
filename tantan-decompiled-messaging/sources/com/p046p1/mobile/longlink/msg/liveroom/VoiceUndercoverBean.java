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
import com.p046p1.mobile.longlink.msg.userMask.userMaskConfig;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;
import p149l.aag0;
import p149l.bz00;
import p149l.i860;
import p149l.o6z;

/* JADX INFO: loaded from: classes8.dex */
public final class VoiceUndercoverBean {

    /* JADX INFO: renamed from: com.p1.mobile.longlink.msg.liveroom.VoiceUndercoverBean$1 */
    public static /* synthetic */ class C45381 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f15990xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15990xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15990xa1df5c61[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15990xa1df5c61[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15990xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15990xa1df5c61[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15990xa1df5c61[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15990xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f15990xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public interface VoiceUndercoverOrBuilder extends o6z {
        int getCountDownSeconds();

        VoiceUndercover.Player getCurrentPlayers(int i);

        int getCurrentPlayersCount();

        List<VoiceUndercover.Player> getCurrentPlayersList();

        @Override // p149l.o6z
        /* synthetic */ InterfaceC3419q getDefaultInstanceForType();

        VoiceUndercover.GameResult getGameResult();

        String getId();

        ByteString getIdBytes();

        String getLiveId();

        ByteString getLiveIdBytes();

        int getRemainSeconds();

        String getStatus();

        ByteString getStatusBytes();

        String getToast();

        ByteString getToastBytes();

        VoiceUndercover.VoteResult getVoteResult();

        VoiceUndercover.Vote getVotes(int i);

        int getVotesCount();

        List<VoiceUndercover.Vote> getVotesList();

        String getWord();

        ByteString getWordBytes();

        boolean hasGameResult();

        boolean hasVoteResult();

        @Override // p149l.o6z
        /* synthetic */ boolean isInitialized();
    }

    private VoiceUndercoverBean() {
    }

    public static void registerAllExtensions(C3410h c3410h) {
    }

    public static final class VoiceUndercover extends GeneratedMessageLite<VoiceUndercover, Builder> implements VoiceUndercoverOrBuilder {
        public static final int COUNTDOWNSECONDS_FIELD_NUMBER = 10;
        public static final int CURRENTPLAYERS_FIELD_NUMBER = 5;
        private static final VoiceUndercover DEFAULT_INSTANCE;
        public static final int GAMERESULT_FIELD_NUMBER = 9;
        public static final int ID_FIELD_NUMBER = 1;
        public static final int LIVEID_FIELD_NUMBER = 2;
        private static volatile i860<VoiceUndercover> PARSER = null;
        public static final int REMAINSECONDS_FIELD_NUMBER = 6;
        public static final int STATUS_FIELD_NUMBER = 3;
        public static final int TOAST_FIELD_NUMBER = 4;
        public static final int VOTERESULT_FIELD_NUMBER = 8;
        public static final int VOTES_FIELD_NUMBER = 7;
        public static final int WORD_FIELD_NUMBER = 11;
        private int bitField0_;
        private int countDownSeconds_;
        private GameResult gameResult_;
        private int remainSeconds_;
        private VoteResult voteResult_;
        private String id_ = "";
        private String liveId_ = "";
        private String status_ = "";
        private String toast_ = "";
        private C3414l.h<Player> currentPlayers_ = GeneratedMessageLite.emptyProtobufList();
        private C3414l.h<Vote> votes_ = GeneratedMessageLite.emptyProtobufList();
        private String word_ = "";

        public interface GameResultOrBuilder extends o6z {
            @Override // p149l.o6z
            /* synthetic */ InterfaceC3419q getDefaultInstanceForType();

            userMaskConfig.UserMask getNormalMasks(int i);

            int getNormalMasksCount();

            List<userMaskConfig.UserMask> getNormalMasksList();

            String getNormalWord();

            ByteString getNormalWordBytes();

            userMaskConfig.UserMask getUndercoverMasks(int i);

            int getUndercoverMasksCount();

            List<userMaskConfig.UserMask> getUndercoverMasksList();

            String getUndercoverWord();

            ByteString getUndercoverWordBytes();

            String getWinnerRole();

            ByteString getWinnerRoleBytes();

            @Override // p149l.o6z
            /* synthetic */ boolean isInitialized();
        }

        public interface PlayerOrBuilder extends o6z {
            @Override // p149l.o6z
            /* synthetic */ InterfaceC3419q getDefaultInstanceForType();

            userMaskConfig.UserMask getMask();

            int getNumber();

            String getRole();

            ByteString getRoleBytes();

            String getUserId();

            ByteString getUserIdBytes();

            boolean hasMask();

            @Override // p149l.o6z
            /* synthetic */ boolean isInitialized();
        }

        public interface VoteOrBuilder extends o6z {
            userMaskConfig.UserMask getCandidateMask();

            @Override // p149l.o6z
            /* synthetic */ InterfaceC3419q getDefaultInstanceForType();

            int getNumber();

            int getVoterNumbers(int i);

            int getVoterNumbersCount();

            List<Integer> getVoterNumbersList();

            boolean hasCandidateMask();

            @Override // p149l.o6z
            /* synthetic */ boolean isInitialized();
        }

        public interface VoteResultOrBuilder extends o6z {
            @Override // p149l.o6z
            /* synthetic */ InterfaceC3419q getDefaultInstanceForType();

            boolean getIsDraw();

            userMaskConfig.UserMask getOutUserMask();

            String getOutUserRole();

            ByteString getOutUserRoleBytes();

            String getResult();

            ByteString getResultBytes();

            boolean hasOutUserMask();

            @Override // p149l.o6z
            /* synthetic */ boolean isInitialized();
        }

        static {
            VoiceUndercover voiceUndercover = new VoiceUndercover();
            DEFAULT_INSTANCE = voiceUndercover;
            voiceUndercover.makeImmutable();
        }

        private VoiceUndercover() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllCurrentPlayers(Iterable<? extends Player> iterable) {
            ensureCurrentPlayersIsMutable();
            AbstractC3403a.addAll(iterable, this.currentPlayers_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllVotes(Iterable<? extends Vote> iterable) {
            ensureVotesIsMutable();
            AbstractC3403a.addAll(iterable, this.votes_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addCurrentPlayers(Player.Builder builder) {
            ensureCurrentPlayersIsMutable();
            this.currentPlayers_.add(builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addVotes(Vote.Builder builder) {
            ensureVotesIsMutable();
            this.votes_.add(builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCountDownSeconds() {
            this.countDownSeconds_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCurrentPlayers() {
            this.currentPlayers_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGameResult() {
            this.gameResult_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearId() {
            this.id_ = getDefaultInstance().getId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLiveId() {
            this.liveId_ = getDefaultInstance().getLiveId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRemainSeconds() {
            this.remainSeconds_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStatus() {
            this.status_ = getDefaultInstance().getStatus();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearToast() {
            this.toast_ = getDefaultInstance().getToast();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVoteResult() {
            this.voteResult_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVotes() {
            this.votes_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWord() {
            this.word_ = getDefaultInstance().getWord();
        }

        private void ensureCurrentPlayersIsMutable() {
            if (this.currentPlayers_.mo17085q()) {
                return;
            }
            this.currentPlayers_ = GeneratedMessageLite.mutableCopy(this.currentPlayers_);
        }

        private void ensureVotesIsMutable() {
            if (this.votes_.mo17085q()) {
                return;
            }
            this.votes_ = GeneratedMessageLite.mutableCopy(this.votes_);
        }

        public static VoiceUndercover getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeGameResult(GameResult gameResult) {
            GameResult gameResult2 = this.gameResult_;
            if (gameResult2 == null || gameResult2 == GameResult.getDefaultInstance()) {
                this.gameResult_ = gameResult;
            } else {
                this.gameResult_ = GameResult.newBuilder(this.gameResult_).mergeFrom(gameResult).buildPartial();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeVoteResult(VoteResult voteResult) {
            VoteResult voteResult2 = this.voteResult_;
            if (voteResult2 == null || voteResult2 == VoteResult.getDefaultInstance()) {
                this.voteResult_ = voteResult;
            } else {
                this.voteResult_ = VoteResult.newBuilder(this.voteResult_).mergeFrom(voteResult).buildPartial();
            }
        }

        public static Builder newBuilder(VoiceUndercover voiceUndercover) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(voiceUndercover);
        }

        public static VoiceUndercover parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VoiceUndercover) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceUndercover parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VoiceUndercover) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<VoiceUndercover> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeCurrentPlayers(int i) {
            ensureCurrentPlayersIsMutable();
            this.currentPlayers_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeVotes(int i) {
            ensureVotesIsMutable();
            this.votes_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCountDownSeconds(int i) {
            this.countDownSeconds_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCurrentPlayers(int i, Player.Builder builder) {
            ensureCurrentPlayersIsMutable();
            this.currentPlayers_.set(i, builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGameResult(GameResult.Builder builder) {
            this.gameResult_ = builder.build();
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
        public void setRemainSeconds(int i) {
            this.remainSeconds_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStatus(String str) {
            str.getClass();
            this.status_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStatusBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.status_ = byteString.toStringUtf8();
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
        public void setVoteResult(VoteResult.Builder builder) {
            this.voteResult_ = builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVotes(int i, Vote.Builder builder) {
            ensureVotesIsMutable();
            this.votes_.set(i, builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWord(String str) {
            str.getClass();
            this.word_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWordBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.word_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C45381.f15990xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoiceUndercover();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.currentPlayers_.mo17084n();
                    this.votes_.mo17084n();
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3386h interfaceC3386h = (GeneratedMessageLite.InterfaceC3386h) obj;
                    VoiceUndercover voiceUndercover = (VoiceUndercover) obj2;
                    this.id_ = interfaceC3386h.mo16997f(!this.id_.isEmpty(), this.id_, !voiceUndercover.id_.isEmpty(), voiceUndercover.id_);
                    this.liveId_ = interfaceC3386h.mo16997f(!this.liveId_.isEmpty(), this.liveId_, !voiceUndercover.liveId_.isEmpty(), voiceUndercover.liveId_);
                    this.status_ = interfaceC3386h.mo16997f(!this.status_.isEmpty(), this.status_, !voiceUndercover.status_.isEmpty(), voiceUndercover.status_);
                    this.toast_ = interfaceC3386h.mo16997f(!this.toast_.isEmpty(), this.toast_, !voiceUndercover.toast_.isEmpty(), voiceUndercover.toast_);
                    this.currentPlayers_ = interfaceC3386h.mo16998g(this.currentPlayers_, voiceUndercover.currentPlayers_);
                    int i = this.remainSeconds_;
                    boolean z2 = i != 0;
                    int i2 = voiceUndercover.remainSeconds_;
                    this.remainSeconds_ = interfaceC3386h.mo16996e(z2, i, i2 != 0, i2);
                    this.votes_ = interfaceC3386h.mo16998g(this.votes_, voiceUndercover.votes_);
                    this.voteResult_ = (VoteResult) interfaceC3386h.mo17006o(this.voteResult_, voiceUndercover.voteResult_);
                    this.gameResult_ = (GameResult) interfaceC3386h.mo17006o(this.gameResult_, voiceUndercover.gameResult_);
                    int i3 = this.countDownSeconds_;
                    boolean z3 = i3 != 0;
                    int i4 = voiceUndercover.countDownSeconds_;
                    this.countDownSeconds_ = interfaceC3386h.mo16996e(z3, i3, i4 != 0, i4);
                    this.word_ = interfaceC3386h.mo16997f(!this.word_.isEmpty(), this.word_, !voiceUndercover.word_.isEmpty(), voiceUndercover.word_);
                    if (interfaceC3386h == GeneratedMessageLite.C3385g.INSTANCE) {
                        this.bitField0_ |= voiceUndercover.bitField0_;
                    }
                    return this;
                case 6:
                    C3407e c3407e = (C3407e) obj;
                    C3410h c3410h = (C3410h) obj2;
                    while (!z) {
                        try {
                            int iM17116M = c3407e.m17116M();
                            switch (iM17116M) {
                                case 0:
                                    break;
                                case 10:
                                    this.id_ = c3407e.m17115L();
                                    continue;
                                case 18:
                                    this.liveId_ = c3407e.m17115L();
                                    continue;
                                case 26:
                                    this.status_ = c3407e.m17115L();
                                    continue;
                                case 34:
                                    this.toast_ = c3407e.m17115L();
                                    continue;
                                case 42:
                                    if (!this.currentPlayers_.mo17085q()) {
                                        this.currentPlayers_ = GeneratedMessageLite.mutableCopy(this.currentPlayers_);
                                    }
                                    this.currentPlayers_.add((Player) c3407e.m17143w(Player.parser(), c3410h));
                                    continue;
                                case 48:
                                    this.remainSeconds_ = c3407e.m17141u();
                                    continue;
                                case 58:
                                    if (!this.votes_.mo17085q()) {
                                        this.votes_ = GeneratedMessageLite.mutableCopy(this.votes_);
                                    }
                                    this.votes_.add((Vote) c3407e.m17143w(Vote.parser(), c3410h));
                                    continue;
                                case 66:
                                    VoteResult voteResult = this.voteResult_;
                                    VoteResult.Builder builder = voteResult != null ? voteResult.toBuilder() : null;
                                    VoteResult voteResult2 = (VoteResult) c3407e.m17143w(VoteResult.parser(), c3410h);
                                    this.voteResult_ = voteResult2;
                                    if (builder != null) {
                                        builder.mergeFrom(voteResult2);
                                        this.voteResult_ = builder.buildPartial();
                                    } else {
                                        continue;
                                    }
                                    break;
                                case 74:
                                    GameResult gameResult = this.gameResult_;
                                    GameResult.Builder builder2 = gameResult != null ? gameResult.toBuilder() : null;
                                    GameResult gameResult2 = (GameResult) c3407e.m17143w(GameResult.parser(), c3410h);
                                    this.gameResult_ = gameResult2;
                                    if (builder2 != null) {
                                        builder2.mergeFrom(gameResult2);
                                        this.gameResult_ = builder2.buildPartial();
                                    } else {
                                        continue;
                                    }
                                    break;
                                case 80:
                                    this.countDownSeconds_ = c3407e.m17141u();
                                    continue;
                                case 90:
                                    this.word_ = c3407e.m17115L();
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
                        synchronized (VoiceUndercover.class) {
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

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceUndercoverBean.VoiceUndercoverOrBuilder
        public int getCountDownSeconds() {
            return this.countDownSeconds_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceUndercoverBean.VoiceUndercoverOrBuilder
        public Player getCurrentPlayers(int i) {
            return this.currentPlayers_.get(i);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceUndercoverBean.VoiceUndercoverOrBuilder
        public int getCurrentPlayersCount() {
            return this.currentPlayers_.size();
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceUndercoverBean.VoiceUndercoverOrBuilder
        public List<Player> getCurrentPlayersList() {
            return this.currentPlayers_;
        }

        public PlayerOrBuilder getCurrentPlayersOrBuilder(int i) {
            return this.currentPlayers_.get(i);
        }

        public List<? extends PlayerOrBuilder> getCurrentPlayersOrBuilderList() {
            return this.currentPlayers_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceUndercoverBean.VoiceUndercoverOrBuilder
        public GameResult getGameResult() {
            GameResult gameResult = this.gameResult_;
            return gameResult == null ? GameResult.getDefaultInstance() : gameResult;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceUndercoverBean.VoiceUndercoverOrBuilder
        public String getId() {
            return this.id_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceUndercoverBean.VoiceUndercoverOrBuilder
        public ByteString getIdBytes() {
            return ByteString.copyFromUtf8(this.id_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceUndercoverBean.VoiceUndercoverOrBuilder
        public String getLiveId() {
            return this.liveId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceUndercoverBean.VoiceUndercoverOrBuilder
        public ByteString getLiveIdBytes() {
            return ByteString.copyFromUtf8(this.liveId_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceUndercoverBean.VoiceUndercoverOrBuilder
        public int getRemainSeconds() {
            return this.remainSeconds_;
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16901K = !this.id_.isEmpty() ? CodedOutputStream.m16901K(1, getId()) : 0;
            if (!this.liveId_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(2, getLiveId());
            }
            if (!this.status_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(3, getStatus());
            }
            if (!this.toast_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(4, getToast());
            }
            for (int i2 = 0; i2 < this.currentPlayers_.size(); i2++) {
                iM16901K += CodedOutputStream.m16893C(5, this.currentPlayers_.get(i2));
            }
            int i3 = this.remainSeconds_;
            if (i3 != 0) {
                iM16901K += CodedOutputStream.m16929t(6, i3);
            }
            for (int i4 = 0; i4 < this.votes_.size(); i4++) {
                iM16901K += CodedOutputStream.m16893C(7, this.votes_.get(i4));
            }
            if (this.voteResult_ != null) {
                iM16901K += CodedOutputStream.m16893C(8, getVoteResult());
            }
            if (this.gameResult_ != null) {
                iM16901K += CodedOutputStream.m16893C(9, getGameResult());
            }
            int i5 = this.countDownSeconds_;
            if (i5 != 0) {
                iM16901K += CodedOutputStream.m16929t(10, i5);
            }
            if (!this.word_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(11, getWord());
            }
            this.memoizedSerializedSize = iM16901K;
            return iM16901K;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceUndercoverBean.VoiceUndercoverOrBuilder
        public String getStatus() {
            return this.status_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceUndercoverBean.VoiceUndercoverOrBuilder
        public ByteString getStatusBytes() {
            return ByteString.copyFromUtf8(this.status_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceUndercoverBean.VoiceUndercoverOrBuilder
        public String getToast() {
            return this.toast_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceUndercoverBean.VoiceUndercoverOrBuilder
        public ByteString getToastBytes() {
            return ByteString.copyFromUtf8(this.toast_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceUndercoverBean.VoiceUndercoverOrBuilder
        public VoteResult getVoteResult() {
            VoteResult voteResult = this.voteResult_;
            return voteResult == null ? VoteResult.getDefaultInstance() : voteResult;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceUndercoverBean.VoiceUndercoverOrBuilder
        public Vote getVotes(int i) {
            return this.votes_.get(i);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceUndercoverBean.VoiceUndercoverOrBuilder
        public int getVotesCount() {
            return this.votes_.size();
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceUndercoverBean.VoiceUndercoverOrBuilder
        public List<Vote> getVotesList() {
            return this.votes_;
        }

        public VoteOrBuilder getVotesOrBuilder(int i) {
            return this.votes_.get(i);
        }

        public List<? extends VoteOrBuilder> getVotesOrBuilderList() {
            return this.votes_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceUndercoverBean.VoiceUndercoverOrBuilder
        public String getWord() {
            return this.word_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceUndercoverBean.VoiceUndercoverOrBuilder
        public ByteString getWordBytes() {
            return ByteString.copyFromUtf8(this.word_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceUndercoverBean.VoiceUndercoverOrBuilder
        public boolean hasGameResult() {
            return this.gameResult_ != null;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.VoiceUndercoverBean.VoiceUndercoverOrBuilder
        public boolean hasVoteResult() {
            return this.voteResult_ != null;
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.id_.isEmpty()) {
                codedOutputStream.mo16939D0(1, getId());
            }
            if (!this.liveId_.isEmpty()) {
                codedOutputStream.mo16939D0(2, getLiveId());
            }
            if (!this.status_.isEmpty()) {
                codedOutputStream.mo16939D0(3, getStatus());
            }
            if (!this.toast_.isEmpty()) {
                codedOutputStream.mo16939D0(4, getToast());
            }
            for (int i = 0; i < this.currentPlayers_.size(); i++) {
                codedOutputStream.mo16974w0(5, this.currentPlayers_.get(i));
            }
            int i2 = this.remainSeconds_;
            if (i2 != 0) {
                codedOutputStream.mo16970s0(6, i2);
            }
            for (int i3 = 0; i3 < this.votes_.size(); i3++) {
                codedOutputStream.mo16974w0(7, this.votes_.get(i3));
            }
            if (this.voteResult_ != null) {
                codedOutputStream.mo16974w0(8, getVoteResult());
            }
            if (this.gameResult_ != null) {
                codedOutputStream.mo16974w0(9, getGameResult());
            }
            int i4 = this.countDownSeconds_;
            if (i4 != 0) {
                codedOutputStream.mo16970s0(10, i4);
            }
            if (this.word_.isEmpty()) {
                return;
            }
            codedOutputStream.mo16939D0(11, getWord());
        }

        public static final class GameResult extends GeneratedMessageLite<GameResult, Builder> implements GameResultOrBuilder {
            private static final GameResult DEFAULT_INSTANCE;
            public static final int NORMALMASKS_FIELD_NUMBER = 2;
            public static final int NORMALWORD_FIELD_NUMBER = 3;
            private static volatile i860<GameResult> PARSER = null;
            public static final int UNDERCOVERMASKS_FIELD_NUMBER = 4;
            public static final int UNDERCOVERWORD_FIELD_NUMBER = 5;
            public static final int WINNERROLE_FIELD_NUMBER = 1;
            private int bitField0_;
            private String winnerRole_ = "";
            private C3414l.h<userMaskConfig.UserMask> normalMasks_ = GeneratedMessageLite.emptyProtobufList();
            private String normalWord_ = "";
            private C3414l.h<userMaskConfig.UserMask> undercoverMasks_ = GeneratedMessageLite.emptyProtobufList();
            private String undercoverWord_ = "";

            static {
                GameResult gameResult = new GameResult();
                DEFAULT_INSTANCE = gameResult;
                gameResult.makeImmutable();
            }

            private GameResult() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addAllNormalMasks(Iterable<? extends userMaskConfig.UserMask> iterable) {
                ensureNormalMasksIsMutable();
                AbstractC3403a.addAll(iterable, this.normalMasks_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addAllUndercoverMasks(Iterable<? extends userMaskConfig.UserMask> iterable) {
                ensureUndercoverMasksIsMutable();
                AbstractC3403a.addAll(iterable, this.undercoverMasks_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addNormalMasks(userMaskConfig.UserMask.Builder builder) {
                ensureNormalMasksIsMutable();
                this.normalMasks_.add(builder.build());
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addUndercoverMasks(userMaskConfig.UserMask.Builder builder) {
                ensureUndercoverMasksIsMutable();
                this.undercoverMasks_.add(builder.build());
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearNormalMasks() {
                this.normalMasks_ = GeneratedMessageLite.emptyProtobufList();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearNormalWord() {
                this.normalWord_ = getDefaultInstance().getNormalWord();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearUndercoverMasks() {
                this.undercoverMasks_ = GeneratedMessageLite.emptyProtobufList();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearUndercoverWord() {
                this.undercoverWord_ = getDefaultInstance().getUndercoverWord();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearWinnerRole() {
                this.winnerRole_ = getDefaultInstance().getWinnerRole();
            }

            private void ensureNormalMasksIsMutable() {
                if (this.normalMasks_.mo17085q()) {
                    return;
                }
                this.normalMasks_ = GeneratedMessageLite.mutableCopy(this.normalMasks_);
            }

            private void ensureUndercoverMasksIsMutable() {
                if (this.undercoverMasks_.mo17085q()) {
                    return;
                }
                this.undercoverMasks_ = GeneratedMessageLite.mutableCopy(this.undercoverMasks_);
            }

            public static GameResult getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Builder newBuilder(GameResult gameResult) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(gameResult);
            }

            public static GameResult parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (GameResult) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static GameResult parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (GameResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static i860<GameResult> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void removeNormalMasks(int i) {
                ensureNormalMasksIsMutable();
                this.normalMasks_.remove(i);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void removeUndercoverMasks(int i) {
                ensureUndercoverMasksIsMutable();
                this.undercoverMasks_.remove(i);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setNormalMasks(int i, userMaskConfig.UserMask.Builder builder) {
                ensureNormalMasksIsMutable();
                this.normalMasks_.set(i, builder.build());
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setNormalWord(String str) {
                str.getClass();
                this.normalWord_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setNormalWordBytes(ByteString byteString) {
                byteString.getClass();
                AbstractC3403a.checkByteStringIsUtf8(byteString);
                this.normalWord_ = byteString.toStringUtf8();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setUndercoverMasks(int i, userMaskConfig.UserMask.Builder builder) {
                ensureUndercoverMasksIsMutable();
                this.undercoverMasks_.set(i, builder.build());
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setUndercoverWord(String str) {
                str.getClass();
                this.undercoverWord_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setUndercoverWordBytes(ByteString byteString) {
                byteString.getClass();
                AbstractC3403a.checkByteStringIsUtf8(byteString);
                this.undercoverWord_ = byteString.toStringUtf8();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setWinnerRole(String str) {
                str.getClass();
                this.winnerRole_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setWinnerRoleBytes(ByteString byteString) {
                byteString.getClass();
                AbstractC3403a.checkByteStringIsUtf8(byteString);
                this.winnerRole_ = byteString.toStringUtf8();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (C45381.f15990xa1df5c61[methodToInvoke.ordinal()]) {
                    case 1:
                        return new GameResult();
                    case 2:
                        return DEFAULT_INSTANCE;
                    case 3:
                        this.normalMasks_.mo17084n();
                        this.undercoverMasks_.mo17084n();
                        return null;
                    case 4:
                        return new Builder();
                    case 5:
                        GeneratedMessageLite.InterfaceC3386h interfaceC3386h = (GeneratedMessageLite.InterfaceC3386h) obj;
                        GameResult gameResult = (GameResult) obj2;
                        this.winnerRole_ = interfaceC3386h.mo16997f(!this.winnerRole_.isEmpty(), this.winnerRole_, !gameResult.winnerRole_.isEmpty(), gameResult.winnerRole_);
                        this.normalMasks_ = interfaceC3386h.mo16998g(this.normalMasks_, gameResult.normalMasks_);
                        this.normalWord_ = interfaceC3386h.mo16997f(!this.normalWord_.isEmpty(), this.normalWord_, !gameResult.normalWord_.isEmpty(), gameResult.normalWord_);
                        this.undercoverMasks_ = interfaceC3386h.mo16998g(this.undercoverMasks_, gameResult.undercoverMasks_);
                        this.undercoverWord_ = interfaceC3386h.mo16997f(!this.undercoverWord_.isEmpty(), this.undercoverWord_, true ^ gameResult.undercoverWord_.isEmpty(), gameResult.undercoverWord_);
                        if (interfaceC3386h == GeneratedMessageLite.C3385g.INSTANCE) {
                            this.bitField0_ |= gameResult.bitField0_;
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
                                        this.winnerRole_ = c3407e.m17115L();
                                    } else if (iM17116M == 18) {
                                        if (!this.normalMasks_.mo17085q()) {
                                            this.normalMasks_ = GeneratedMessageLite.mutableCopy(this.normalMasks_);
                                        }
                                        this.normalMasks_.add((userMaskConfig.UserMask) c3407e.m17143w(userMaskConfig.UserMask.parser(), c3410h));
                                    } else if (iM17116M == 26) {
                                        this.normalWord_ = c3407e.m17115L();
                                    } else if (iM17116M == 34) {
                                        if (!this.undercoverMasks_.mo17085q()) {
                                            this.undercoverMasks_ = GeneratedMessageLite.mutableCopy(this.undercoverMasks_);
                                        }
                                        this.undercoverMasks_.add((userMaskConfig.UserMask) c3407e.m17143w(userMaskConfig.UserMask.parser(), c3410h));
                                    } else if (iM17116M == 42) {
                                        this.undercoverWord_ = c3407e.m17115L();
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
                            synchronized (GameResult.class) {
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

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceUndercoverBean.VoiceUndercover.GameResultOrBuilder
            public userMaskConfig.UserMask getNormalMasks(int i) {
                return this.normalMasks_.get(i);
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceUndercoverBean.VoiceUndercover.GameResultOrBuilder
            public int getNormalMasksCount() {
                return this.normalMasks_.size();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceUndercoverBean.VoiceUndercover.GameResultOrBuilder
            public List<userMaskConfig.UserMask> getNormalMasksList() {
                return this.normalMasks_;
            }

            public userMaskConfig.UserMaskOrBuilder getNormalMasksOrBuilder(int i) {
                return this.normalMasks_.get(i);
            }

            public List<? extends userMaskConfig.UserMaskOrBuilder> getNormalMasksOrBuilderList() {
                return this.normalMasks_;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceUndercoverBean.VoiceUndercover.GameResultOrBuilder
            public String getNormalWord() {
                return this.normalWord_;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceUndercoverBean.VoiceUndercover.GameResultOrBuilder
            public ByteString getNormalWordBytes() {
                return ByteString.copyFromUtf8(this.normalWord_);
            }

            @Override // com.google.protobuf.InterfaceC3419q
            public int getSerializedSize() {
                int i = this.memoizedSerializedSize;
                if (i != -1) {
                    return i;
                }
                int iM16901K = !this.winnerRole_.isEmpty() ? CodedOutputStream.m16901K(1, getWinnerRole()) : 0;
                for (int i2 = 0; i2 < this.normalMasks_.size(); i2++) {
                    iM16901K += CodedOutputStream.m16893C(2, this.normalMasks_.get(i2));
                }
                if (!this.normalWord_.isEmpty()) {
                    iM16901K += CodedOutputStream.m16901K(3, getNormalWord());
                }
                for (int i3 = 0; i3 < this.undercoverMasks_.size(); i3++) {
                    iM16901K += CodedOutputStream.m16893C(4, this.undercoverMasks_.get(i3));
                }
                if (!this.undercoverWord_.isEmpty()) {
                    iM16901K += CodedOutputStream.m16901K(5, getUndercoverWord());
                }
                this.memoizedSerializedSize = iM16901K;
                return iM16901K;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceUndercoverBean.VoiceUndercover.GameResultOrBuilder
            public userMaskConfig.UserMask getUndercoverMasks(int i) {
                return this.undercoverMasks_.get(i);
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceUndercoverBean.VoiceUndercover.GameResultOrBuilder
            public int getUndercoverMasksCount() {
                return this.undercoverMasks_.size();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceUndercoverBean.VoiceUndercover.GameResultOrBuilder
            public List<userMaskConfig.UserMask> getUndercoverMasksList() {
                return this.undercoverMasks_;
            }

            public userMaskConfig.UserMaskOrBuilder getUndercoverMasksOrBuilder(int i) {
                return this.undercoverMasks_.get(i);
            }

            public List<? extends userMaskConfig.UserMaskOrBuilder> getUndercoverMasksOrBuilderList() {
                return this.undercoverMasks_;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceUndercoverBean.VoiceUndercover.GameResultOrBuilder
            public String getUndercoverWord() {
                return this.undercoverWord_;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceUndercoverBean.VoiceUndercover.GameResultOrBuilder
            public ByteString getUndercoverWordBytes() {
                return ByteString.copyFromUtf8(this.undercoverWord_);
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceUndercoverBean.VoiceUndercover.GameResultOrBuilder
            public String getWinnerRole() {
                return this.winnerRole_;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceUndercoverBean.VoiceUndercover.GameResultOrBuilder
            public ByteString getWinnerRoleBytes() {
                return ByteString.copyFromUtf8(this.winnerRole_);
            }

            @Override // com.google.protobuf.InterfaceC3419q
            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                if (!this.winnerRole_.isEmpty()) {
                    codedOutputStream.mo16939D0(1, getWinnerRole());
                }
                for (int i = 0; i < this.normalMasks_.size(); i++) {
                    codedOutputStream.mo16974w0(2, this.normalMasks_.get(i));
                }
                if (!this.normalWord_.isEmpty()) {
                    codedOutputStream.mo16939D0(3, getNormalWord());
                }
                for (int i2 = 0; i2 < this.undercoverMasks_.size(); i2++) {
                    codedOutputStream.mo16974w0(4, this.undercoverMasks_.get(i2));
                }
                if (this.undercoverWord_.isEmpty()) {
                    return;
                }
                codedOutputStream.mo16939D0(5, getUndercoverWord());
            }

            public static GameResult parseDelimitedFrom(InputStream inputStream, C3410h c3410h) throws IOException {
                return (GameResult) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3410h);
            }

            public static GameResult parseFrom(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
                return (GameResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3410h);
            }

            public static final class Builder extends GeneratedMessageLite.AbstractC3380b<GameResult, Builder> implements GameResultOrBuilder {
                private Builder() {
                    super(GameResult.DEFAULT_INSTANCE);
                }

                public Builder addAllNormalMasks(Iterable<? extends userMaskConfig.UserMask> iterable) {
                    copyOnWrite();
                    ((GameResult) this.instance).addAllNormalMasks(iterable);
                    return this;
                }

                public Builder addAllUndercoverMasks(Iterable<? extends userMaskConfig.UserMask> iterable) {
                    copyOnWrite();
                    ((GameResult) this.instance).addAllUndercoverMasks(iterable);
                    return this;
                }

                public Builder addNormalMasks(userMaskConfig.UserMask userMask) {
                    copyOnWrite();
                    ((GameResult) this.instance).addNormalMasks(userMask);
                    return this;
                }

                public Builder addUndercoverMasks(userMaskConfig.UserMask userMask) {
                    copyOnWrite();
                    ((GameResult) this.instance).addUndercoverMasks(userMask);
                    return this;
                }

                public Builder clearNormalMasks() {
                    copyOnWrite();
                    ((GameResult) this.instance).clearNormalMasks();
                    return this;
                }

                public Builder clearNormalWord() {
                    copyOnWrite();
                    ((GameResult) this.instance).clearNormalWord();
                    return this;
                }

                public Builder clearUndercoverMasks() {
                    copyOnWrite();
                    ((GameResult) this.instance).clearUndercoverMasks();
                    return this;
                }

                public Builder clearUndercoverWord() {
                    copyOnWrite();
                    ((GameResult) this.instance).clearUndercoverWord();
                    return this;
                }

                public Builder clearWinnerRole() {
                    copyOnWrite();
                    ((GameResult) this.instance).clearWinnerRole();
                    return this;
                }

                @Override // com.p1.mobile.longlink.msg.liveroom.VoiceUndercoverBean.VoiceUndercover.GameResultOrBuilder
                public userMaskConfig.UserMask getNormalMasks(int i) {
                    return ((GameResult) this.instance).getNormalMasks(i);
                }

                @Override // com.p1.mobile.longlink.msg.liveroom.VoiceUndercoverBean.VoiceUndercover.GameResultOrBuilder
                public int getNormalMasksCount() {
                    return ((GameResult) this.instance).getNormalMasksCount();
                }

                @Override // com.p1.mobile.longlink.msg.liveroom.VoiceUndercoverBean.VoiceUndercover.GameResultOrBuilder
                public List<userMaskConfig.UserMask> getNormalMasksList() {
                    return Collections.unmodifiableList(((GameResult) this.instance).getNormalMasksList());
                }

                @Override // com.p1.mobile.longlink.msg.liveroom.VoiceUndercoverBean.VoiceUndercover.GameResultOrBuilder
                public String getNormalWord() {
                    return ((GameResult) this.instance).getNormalWord();
                }

                @Override // com.p1.mobile.longlink.msg.liveroom.VoiceUndercoverBean.VoiceUndercover.GameResultOrBuilder
                public ByteString getNormalWordBytes() {
                    return ((GameResult) this.instance).getNormalWordBytes();
                }

                @Override // com.p1.mobile.longlink.msg.liveroom.VoiceUndercoverBean.VoiceUndercover.GameResultOrBuilder
                public userMaskConfig.UserMask getUndercoverMasks(int i) {
                    return ((GameResult) this.instance).getUndercoverMasks(i);
                }

                @Override // com.p1.mobile.longlink.msg.liveroom.VoiceUndercoverBean.VoiceUndercover.GameResultOrBuilder
                public int getUndercoverMasksCount() {
                    return ((GameResult) this.instance).getUndercoverMasksCount();
                }

                @Override // com.p1.mobile.longlink.msg.liveroom.VoiceUndercoverBean.VoiceUndercover.GameResultOrBuilder
                public List<userMaskConfig.UserMask> getUndercoverMasksList() {
                    return Collections.unmodifiableList(((GameResult) this.instance).getUndercoverMasksList());
                }

                @Override // com.p1.mobile.longlink.msg.liveroom.VoiceUndercoverBean.VoiceUndercover.GameResultOrBuilder
                public String getUndercoverWord() {
                    return ((GameResult) this.instance).getUndercoverWord();
                }

                @Override // com.p1.mobile.longlink.msg.liveroom.VoiceUndercoverBean.VoiceUndercover.GameResultOrBuilder
                public ByteString getUndercoverWordBytes() {
                    return ((GameResult) this.instance).getUndercoverWordBytes();
                }

                @Override // com.p1.mobile.longlink.msg.liveroom.VoiceUndercoverBean.VoiceUndercover.GameResultOrBuilder
                public String getWinnerRole() {
                    return ((GameResult) this.instance).getWinnerRole();
                }

                @Override // com.p1.mobile.longlink.msg.liveroom.VoiceUndercoverBean.VoiceUndercover.GameResultOrBuilder
                public ByteString getWinnerRoleBytes() {
                    return ((GameResult) this.instance).getWinnerRoleBytes();
                }

                public Builder removeNormalMasks(int i) {
                    copyOnWrite();
                    ((GameResult) this.instance).removeNormalMasks(i);
                    return this;
                }

                public Builder removeUndercoverMasks(int i) {
                    copyOnWrite();
                    ((GameResult) this.instance).removeUndercoverMasks(i);
                    return this;
                }

                public Builder setNormalMasks(int i, userMaskConfig.UserMask userMask) {
                    copyOnWrite();
                    ((GameResult) this.instance).setNormalMasks(i, userMask);
                    return this;
                }

                public Builder setNormalWord(String str) {
                    copyOnWrite();
                    ((GameResult) this.instance).setNormalWord(str);
                    return this;
                }

                public Builder setNormalWordBytes(ByteString byteString) {
                    copyOnWrite();
                    ((GameResult) this.instance).setNormalWordBytes(byteString);
                    return this;
                }

                public Builder setUndercoverMasks(int i, userMaskConfig.UserMask userMask) {
                    copyOnWrite();
                    ((GameResult) this.instance).setUndercoverMasks(i, userMask);
                    return this;
                }

                public Builder setUndercoverWord(String str) {
                    copyOnWrite();
                    ((GameResult) this.instance).setUndercoverWord(str);
                    return this;
                }

                public Builder setUndercoverWordBytes(ByteString byteString) {
                    copyOnWrite();
                    ((GameResult) this.instance).setUndercoverWordBytes(byteString);
                    return this;
                }

                public Builder setWinnerRole(String str) {
                    copyOnWrite();
                    ((GameResult) this.instance).setWinnerRole(str);
                    return this;
                }

                public Builder setWinnerRoleBytes(ByteString byteString) {
                    copyOnWrite();
                    ((GameResult) this.instance).setWinnerRoleBytes(byteString);
                    return this;
                }

                public Builder addNormalMasks(int i, userMaskConfig.UserMask userMask) {
                    copyOnWrite();
                    ((GameResult) this.instance).addNormalMasks(i, userMask);
                    return this;
                }

                public Builder addUndercoverMasks(int i, userMaskConfig.UserMask userMask) {
                    copyOnWrite();
                    ((GameResult) this.instance).addUndercoverMasks(i, userMask);
                    return this;
                }

                public Builder setNormalMasks(int i, userMaskConfig.UserMask.Builder builder) {
                    copyOnWrite();
                    ((GameResult) this.instance).setNormalMasks(i, builder);
                    return this;
                }

                public Builder setUndercoverMasks(int i, userMaskConfig.UserMask.Builder builder) {
                    copyOnWrite();
                    ((GameResult) this.instance).setUndercoverMasks(i, builder);
                    return this;
                }

                public Builder addNormalMasks(userMaskConfig.UserMask.Builder builder) {
                    copyOnWrite();
                    ((GameResult) this.instance).addNormalMasks(builder);
                    return this;
                }

                public Builder addUndercoverMasks(userMaskConfig.UserMask.Builder builder) {
                    copyOnWrite();
                    ((GameResult) this.instance).addUndercoverMasks(builder);
                    return this;
                }

                public Builder addNormalMasks(int i, userMaskConfig.UserMask.Builder builder) {
                    copyOnWrite();
                    ((GameResult) this.instance).addNormalMasks(i, builder);
                    return this;
                }

                public Builder addUndercoverMasks(int i, userMaskConfig.UserMask.Builder builder) {
                    copyOnWrite();
                    ((GameResult) this.instance).addUndercoverMasks(i, builder);
                    return this;
                }
            }

            public static GameResult parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (GameResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static GameResult parseFrom(byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
                return (GameResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3410h);
            }

            public static GameResult parseFrom(InputStream inputStream) throws IOException {
                return (GameResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static GameResult parseFrom(InputStream inputStream, C3410h c3410h) throws IOException {
                return (GameResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3410h);
            }

            public static GameResult parseFrom(C3407e c3407e) throws IOException {
                return (GameResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addNormalMasks(int i, userMaskConfig.UserMask userMask) {
                userMask.getClass();
                ensureNormalMasksIsMutable();
                this.normalMasks_.add(i, userMask);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addUndercoverMasks(int i, userMaskConfig.UserMask userMask) {
                userMask.getClass();
                ensureUndercoverMasksIsMutable();
                this.undercoverMasks_.add(i, userMask);
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static GameResult parseFrom(C3407e c3407e, C3410h c3410h) throws IOException {
                return (GameResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e, c3410h);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setNormalMasks(int i, userMaskConfig.UserMask userMask) {
                userMask.getClass();
                ensureNormalMasksIsMutable();
                this.normalMasks_.set(i, userMask);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setUndercoverMasks(int i, userMaskConfig.UserMask userMask) {
                userMask.getClass();
                ensureUndercoverMasksIsMutable();
                this.undercoverMasks_.set(i, userMask);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addNormalMasks(userMaskConfig.UserMask userMask) {
                userMask.getClass();
                ensureNormalMasksIsMutable();
                this.normalMasks_.add(userMask);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addUndercoverMasks(userMaskConfig.UserMask userMask) {
                userMask.getClass();
                ensureUndercoverMasksIsMutable();
                this.undercoverMasks_.add(userMask);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addNormalMasks(int i, userMaskConfig.UserMask.Builder builder) {
                ensureNormalMasksIsMutable();
                this.normalMasks_.add(i, builder.build());
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addUndercoverMasks(int i, userMaskConfig.UserMask.Builder builder) {
                ensureUndercoverMasksIsMutable();
                this.undercoverMasks_.add(i, builder.build());
            }
        }

        public static final class Player extends GeneratedMessageLite<Player, Builder> implements PlayerOrBuilder {
            private static final Player DEFAULT_INSTANCE;
            public static final int MASK_FIELD_NUMBER = 3;
            public static final int NUMBER_FIELD_NUMBER = 2;
            private static volatile i860<Player> PARSER = null;
            public static final int ROLE_FIELD_NUMBER = 4;
            public static final int USERID_FIELD_NUMBER = 1;
            private userMaskConfig.UserMask mask_;
            private int number_;
            private String userId_ = "";
            private String role_ = "";

            static {
                Player player = new Player();
                DEFAULT_INSTANCE = player;
                player.makeImmutable();
            }

            private Player() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearMask() {
                this.mask_ = null;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearNumber() {
                this.number_ = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearRole() {
                this.role_ = getDefaultInstance().getRole();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearUserId() {
                this.userId_ = getDefaultInstance().getUserId();
            }

            public static Player getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergeMask(userMaskConfig.UserMask userMask) {
                userMaskConfig.UserMask userMask2 = this.mask_;
                if (userMask2 == null || userMask2 == userMaskConfig.UserMask.getDefaultInstance()) {
                    this.mask_ = userMask;
                } else {
                    this.mask_ = userMaskConfig.UserMask.newBuilder(this.mask_).mergeFrom(userMask).buildPartial();
                }
            }

            public static Builder newBuilder(Player player) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(player);
            }

            public static Player parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Player) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Player parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (Player) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static i860<Player> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setMask(userMaskConfig.UserMask.Builder builder) {
                this.mask_ = builder.build();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setNumber(int i) {
                this.number_ = i;
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
                switch (C45381.f15990xa1df5c61[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Player();
                    case 2:
                        return DEFAULT_INSTANCE;
                    case 3:
                        return null;
                    case 4:
                        return new Builder();
                    case 5:
                        GeneratedMessageLite.InterfaceC3386h interfaceC3386h = (GeneratedMessageLite.InterfaceC3386h) obj;
                        Player player = (Player) obj2;
                        this.userId_ = interfaceC3386h.mo16997f(!this.userId_.isEmpty(), this.userId_, !player.userId_.isEmpty(), player.userId_);
                        int i = this.number_;
                        boolean z2 = i != 0;
                        int i2 = player.number_;
                        this.number_ = interfaceC3386h.mo16996e(z2, i, i2 != 0, i2);
                        this.mask_ = (userMaskConfig.UserMask) interfaceC3386h.mo17006o(this.mask_, player.mask_);
                        this.role_ = interfaceC3386h.mo16997f(!this.role_.isEmpty(), this.role_, !player.role_.isEmpty(), player.role_);
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
                                        this.userId_ = c3407e.m17115L();
                                    } else if (iM17116M == 16) {
                                        this.number_ = c3407e.m17141u();
                                    } else if (iM17116M == 26) {
                                        userMaskConfig.UserMask userMask = this.mask_;
                                        userMaskConfig.UserMask.Builder builder = userMask != null ? userMask.toBuilder() : null;
                                        userMaskConfig.UserMask userMask2 = (userMaskConfig.UserMask) c3407e.m17143w(userMaskConfig.UserMask.parser(), c3410h);
                                        this.mask_ = userMask2;
                                        if (builder != null) {
                                            builder.mergeFrom(userMask2);
                                            this.mask_ = builder.buildPartial();
                                        }
                                    } else if (iM17116M == 34) {
                                        this.role_ = c3407e.m17115L();
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
                            synchronized (Player.class) {
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

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceUndercoverBean.VoiceUndercover.PlayerOrBuilder
            public userMaskConfig.UserMask getMask() {
                userMaskConfig.UserMask userMask = this.mask_;
                return userMask == null ? userMaskConfig.UserMask.getDefaultInstance() : userMask;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceUndercoverBean.VoiceUndercover.PlayerOrBuilder
            public int getNumber() {
                return this.number_;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceUndercoverBean.VoiceUndercover.PlayerOrBuilder
            public String getRole() {
                return this.role_;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceUndercoverBean.VoiceUndercover.PlayerOrBuilder
            public ByteString getRoleBytes() {
                return ByteString.copyFromUtf8(this.role_);
            }

            @Override // com.google.protobuf.InterfaceC3419q
            public int getSerializedSize() {
                int i = this.memoizedSerializedSize;
                if (i != -1) {
                    return i;
                }
                int iM16901K = !this.userId_.isEmpty() ? CodedOutputStream.m16901K(1, getUserId()) : 0;
                int i2 = this.number_;
                if (i2 != 0) {
                    iM16901K += CodedOutputStream.m16929t(2, i2);
                }
                if (this.mask_ != null) {
                    iM16901K += CodedOutputStream.m16893C(3, getMask());
                }
                if (!this.role_.isEmpty()) {
                    iM16901K += CodedOutputStream.m16901K(4, getRole());
                }
                this.memoizedSerializedSize = iM16901K;
                return iM16901K;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceUndercoverBean.VoiceUndercover.PlayerOrBuilder
            public String getUserId() {
                return this.userId_;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceUndercoverBean.VoiceUndercover.PlayerOrBuilder
            public ByteString getUserIdBytes() {
                return ByteString.copyFromUtf8(this.userId_);
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceUndercoverBean.VoiceUndercover.PlayerOrBuilder
            public boolean hasMask() {
                return this.mask_ != null;
            }

            @Override // com.google.protobuf.InterfaceC3419q
            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                if (!this.userId_.isEmpty()) {
                    codedOutputStream.mo16939D0(1, getUserId());
                }
                int i = this.number_;
                if (i != 0) {
                    codedOutputStream.mo16970s0(2, i);
                }
                if (this.mask_ != null) {
                    codedOutputStream.mo16974w0(3, getMask());
                }
                if (this.role_.isEmpty()) {
                    return;
                }
                codedOutputStream.mo16939D0(4, getRole());
            }

            public static Player parseDelimitedFrom(InputStream inputStream, C3410h c3410h) throws IOException {
                return (Player) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3410h);
            }

            public static Player parseFrom(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
                return (Player) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3410h);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setMask(userMaskConfig.UserMask userMask) {
                userMask.getClass();
                this.mask_ = userMask;
            }

            public static final class Builder extends GeneratedMessageLite.AbstractC3380b<Player, Builder> implements PlayerOrBuilder {
                private Builder() {
                    super(Player.DEFAULT_INSTANCE);
                }

                public Builder clearMask() {
                    copyOnWrite();
                    ((Player) this.instance).clearMask();
                    return this;
                }

                public Builder clearNumber() {
                    copyOnWrite();
                    ((Player) this.instance).clearNumber();
                    return this;
                }

                public Builder clearRole() {
                    copyOnWrite();
                    ((Player) this.instance).clearRole();
                    return this;
                }

                public Builder clearUserId() {
                    copyOnWrite();
                    ((Player) this.instance).clearUserId();
                    return this;
                }

                @Override // com.p1.mobile.longlink.msg.liveroom.VoiceUndercoverBean.VoiceUndercover.PlayerOrBuilder
                public userMaskConfig.UserMask getMask() {
                    return ((Player) this.instance).getMask();
                }

                @Override // com.p1.mobile.longlink.msg.liveroom.VoiceUndercoverBean.VoiceUndercover.PlayerOrBuilder
                public int getNumber() {
                    return ((Player) this.instance).getNumber();
                }

                @Override // com.p1.mobile.longlink.msg.liveroom.VoiceUndercoverBean.VoiceUndercover.PlayerOrBuilder
                public String getRole() {
                    return ((Player) this.instance).getRole();
                }

                @Override // com.p1.mobile.longlink.msg.liveroom.VoiceUndercoverBean.VoiceUndercover.PlayerOrBuilder
                public ByteString getRoleBytes() {
                    return ((Player) this.instance).getRoleBytes();
                }

                @Override // com.p1.mobile.longlink.msg.liveroom.VoiceUndercoverBean.VoiceUndercover.PlayerOrBuilder
                public String getUserId() {
                    return ((Player) this.instance).getUserId();
                }

                @Override // com.p1.mobile.longlink.msg.liveroom.VoiceUndercoverBean.VoiceUndercover.PlayerOrBuilder
                public ByteString getUserIdBytes() {
                    return ((Player) this.instance).getUserIdBytes();
                }

                @Override // com.p1.mobile.longlink.msg.liveroom.VoiceUndercoverBean.VoiceUndercover.PlayerOrBuilder
                public boolean hasMask() {
                    return ((Player) this.instance).hasMask();
                }

                public Builder mergeMask(userMaskConfig.UserMask userMask) {
                    copyOnWrite();
                    ((Player) this.instance).mergeMask(userMask);
                    return this;
                }

                public Builder setMask(userMaskConfig.UserMask userMask) {
                    copyOnWrite();
                    ((Player) this.instance).setMask(userMask);
                    return this;
                }

                public Builder setNumber(int i) {
                    copyOnWrite();
                    ((Player) this.instance).setNumber(i);
                    return this;
                }

                public Builder setRole(String str) {
                    copyOnWrite();
                    ((Player) this.instance).setRole(str);
                    return this;
                }

                public Builder setRoleBytes(ByteString byteString) {
                    copyOnWrite();
                    ((Player) this.instance).setRoleBytes(byteString);
                    return this;
                }

                public Builder setUserId(String str) {
                    copyOnWrite();
                    ((Player) this.instance).setUserId(str);
                    return this;
                }

                public Builder setUserIdBytes(ByteString byteString) {
                    copyOnWrite();
                    ((Player) this.instance).setUserIdBytes(byteString);
                    return this;
                }

                public Builder setMask(userMaskConfig.UserMask.Builder builder) {
                    copyOnWrite();
                    ((Player) this.instance).setMask(builder);
                    return this;
                }
            }

            public static Player parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (Player) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static Player parseFrom(byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
                return (Player) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3410h);
            }

            public static Player parseFrom(InputStream inputStream) throws IOException {
                return (Player) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Player parseFrom(InputStream inputStream, C3410h c3410h) throws IOException {
                return (Player) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3410h);
            }

            public static Player parseFrom(C3407e c3407e) throws IOException {
                return (Player) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e);
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static Player parseFrom(C3407e c3407e, C3410h c3410h) throws IOException {
                return (Player) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e, c3410h);
            }
        }

        public static final class Vote extends GeneratedMessageLite<Vote, Builder> implements VoteOrBuilder {
            public static final int CANDIDATEMASK_FIELD_NUMBER = 1;
            private static final Vote DEFAULT_INSTANCE;
            public static final int NUMBER_FIELD_NUMBER = 2;
            private static volatile i860<Vote> PARSER = null;
            public static final int VOTERNUMBERS_FIELD_NUMBER = 3;
            private int bitField0_;
            private userMaskConfig.UserMask candidateMask_;
            private int number_;
            private C3414l.f voterNumbers_ = GeneratedMessageLite.emptyIntList();

            static {
                Vote vote = new Vote();
                DEFAULT_INSTANCE = vote;
                vote.makeImmutable();
            }

            private Vote() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addAllVoterNumbers(Iterable<? extends Integer> iterable) {
                ensureVoterNumbersIsMutable();
                AbstractC3403a.addAll(iterable, this.voterNumbers_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addVoterNumbers(int i) {
                ensureVoterNumbersIsMutable();
                this.voterNumbers_.mo17200T(i);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearCandidateMask() {
                this.candidateMask_ = null;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearNumber() {
                this.number_ = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearVoterNumbers() {
                this.voterNumbers_ = GeneratedMessageLite.emptyIntList();
            }

            private void ensureVoterNumbersIsMutable() {
                if (this.voterNumbers_.mo17085q()) {
                    return;
                }
                this.voterNumbers_ = GeneratedMessageLite.mutableCopy(this.voterNumbers_);
            }

            public static Vote getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergeCandidateMask(userMaskConfig.UserMask userMask) {
                userMaskConfig.UserMask userMask2 = this.candidateMask_;
                if (userMask2 == null || userMask2 == userMaskConfig.UserMask.getDefaultInstance()) {
                    this.candidateMask_ = userMask;
                } else {
                    this.candidateMask_ = userMaskConfig.UserMask.newBuilder(this.candidateMask_).mergeFrom(userMask).buildPartial();
                }
            }

            public static Builder newBuilder(Vote vote) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(vote);
            }

            public static Vote parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Vote) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Vote parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (Vote) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static i860<Vote> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setCandidateMask(userMaskConfig.UserMask.Builder builder) {
                this.candidateMask_ = builder.build();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setNumber(int i) {
                this.number_ = i;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setVoterNumbers(int i, int i2) {
                ensureVoterNumbersIsMutable();
                this.voterNumbers_.setInt(i, i2);
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                boolean z = false;
                switch (C45381.f15990xa1df5c61[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Vote();
                    case 2:
                        return DEFAULT_INSTANCE;
                    case 3:
                        this.voterNumbers_.mo17084n();
                        return null;
                    case 4:
                        return new Builder();
                    case 5:
                        GeneratedMessageLite.InterfaceC3386h interfaceC3386h = (GeneratedMessageLite.InterfaceC3386h) obj;
                        Vote vote = (Vote) obj2;
                        this.candidateMask_ = (userMaskConfig.UserMask) interfaceC3386h.mo17006o(this.candidateMask_, vote.candidateMask_);
                        int i = this.number_;
                        boolean z2 = i != 0;
                        int i2 = vote.number_;
                        this.number_ = interfaceC3386h.mo16996e(z2, i, i2 != 0, i2);
                        this.voterNumbers_ = interfaceC3386h.mo17005n(this.voterNumbers_, vote.voterNumbers_);
                        if (interfaceC3386h == GeneratedMessageLite.C3385g.INSTANCE) {
                            this.bitField0_ |= vote.bitField0_;
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
                                        userMaskConfig.UserMask userMask = this.candidateMask_;
                                        userMaskConfig.UserMask.Builder builder = userMask != null ? userMask.toBuilder() : null;
                                        userMaskConfig.UserMask userMask2 = (userMaskConfig.UserMask) c3407e.m17143w(userMaskConfig.UserMask.parser(), c3410h);
                                        this.candidateMask_ = userMask2;
                                        if (builder != null) {
                                            builder.mergeFrom(userMask2);
                                            this.candidateMask_ = builder.buildPartial();
                                        }
                                    } else if (iM17116M == 16) {
                                        this.number_ = c3407e.m17141u();
                                    } else if (iM17116M == 24) {
                                        if (!this.voterNumbers_.mo17085q()) {
                                            this.voterNumbers_ = GeneratedMessageLite.mutableCopy(this.voterNumbers_);
                                        }
                                        this.voterNumbers_.mo17200T(c3407e.m17141u());
                                    } else if (iM17116M == 26) {
                                        int iM17132l = c3407e.m17132l(c3407e.m17107C());
                                        if (!this.voterNumbers_.mo17085q() && c3407e.m17129d() > 0) {
                                            this.voterNumbers_ = GeneratedMessageLite.mutableCopy(this.voterNumbers_);
                                        }
                                        while (c3407e.m17129d() > 0) {
                                            this.voterNumbers_.mo17200T(c3407e.m17141u());
                                        }
                                        c3407e.m17131k(iM17132l);
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
                            synchronized (Vote.class) {
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

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceUndercoverBean.VoiceUndercover.VoteOrBuilder
            public userMaskConfig.UserMask getCandidateMask() {
                userMaskConfig.UserMask userMask = this.candidateMask_;
                return userMask == null ? userMaskConfig.UserMask.getDefaultInstance() : userMask;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceUndercoverBean.VoiceUndercover.VoteOrBuilder
            public int getNumber() {
                return this.number_;
            }

            @Override // com.google.protobuf.InterfaceC3419q
            public int getSerializedSize() {
                int i = this.memoizedSerializedSize;
                if (i != -1) {
                    return i;
                }
                int iM16893C = this.candidateMask_ != null ? CodedOutputStream.m16893C(1, getCandidateMask()) : 0;
                int i2 = this.number_;
                if (i2 != 0) {
                    iM16893C += CodedOutputStream.m16929t(2, i2);
                }
                int iM16930u = 0;
                for (int i3 = 0; i3 < this.voterNumbers_.size(); i3++) {
                    iM16930u += CodedOutputStream.m16930u(this.voterNumbers_.getInt(i3));
                }
                int size = iM16893C + iM16930u + getVoterNumbersList().size();
                this.memoizedSerializedSize = size;
                return size;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceUndercoverBean.VoiceUndercover.VoteOrBuilder
            public int getVoterNumbers(int i) {
                return this.voterNumbers_.getInt(i);
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceUndercoverBean.VoiceUndercover.VoteOrBuilder
            public int getVoterNumbersCount() {
                return this.voterNumbers_.size();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceUndercoverBean.VoiceUndercover.VoteOrBuilder
            public List<Integer> getVoterNumbersList() {
                return this.voterNumbers_;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceUndercoverBean.VoiceUndercover.VoteOrBuilder
            public boolean hasCandidateMask() {
                return this.candidateMask_ != null;
            }

            @Override // com.google.protobuf.InterfaceC3419q
            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                getSerializedSize();
                if (this.candidateMask_ != null) {
                    codedOutputStream.mo16974w0(1, getCandidateMask());
                }
                int i = this.number_;
                if (i != 0) {
                    codedOutputStream.mo16970s0(2, i);
                }
                for (int i2 = 0; i2 < this.voterNumbers_.size(); i2++) {
                    codedOutputStream.mo16970s0(3, this.voterNumbers_.getInt(i2));
                }
            }

            public static Vote parseDelimitedFrom(InputStream inputStream, C3410h c3410h) throws IOException {
                return (Vote) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3410h);
            }

            public static Vote parseFrom(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
                return (Vote) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3410h);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setCandidateMask(userMaskConfig.UserMask userMask) {
                userMask.getClass();
                this.candidateMask_ = userMask;
            }

            public static final class Builder extends GeneratedMessageLite.AbstractC3380b<Vote, Builder> implements VoteOrBuilder {
                private Builder() {
                    super(Vote.DEFAULT_INSTANCE);
                }

                public Builder addAllVoterNumbers(Iterable<? extends Integer> iterable) {
                    copyOnWrite();
                    ((Vote) this.instance).addAllVoterNumbers(iterable);
                    return this;
                }

                public Builder addVoterNumbers(int i) {
                    copyOnWrite();
                    ((Vote) this.instance).addVoterNumbers(i);
                    return this;
                }

                public Builder clearCandidateMask() {
                    copyOnWrite();
                    ((Vote) this.instance).clearCandidateMask();
                    return this;
                }

                public Builder clearNumber() {
                    copyOnWrite();
                    ((Vote) this.instance).clearNumber();
                    return this;
                }

                public Builder clearVoterNumbers() {
                    copyOnWrite();
                    ((Vote) this.instance).clearVoterNumbers();
                    return this;
                }

                @Override // com.p1.mobile.longlink.msg.liveroom.VoiceUndercoverBean.VoiceUndercover.VoteOrBuilder
                public userMaskConfig.UserMask getCandidateMask() {
                    return ((Vote) this.instance).getCandidateMask();
                }

                @Override // com.p1.mobile.longlink.msg.liveroom.VoiceUndercoverBean.VoiceUndercover.VoteOrBuilder
                public int getNumber() {
                    return ((Vote) this.instance).getNumber();
                }

                @Override // com.p1.mobile.longlink.msg.liveroom.VoiceUndercoverBean.VoiceUndercover.VoteOrBuilder
                public int getVoterNumbers(int i) {
                    return ((Vote) this.instance).getVoterNumbers(i);
                }

                @Override // com.p1.mobile.longlink.msg.liveroom.VoiceUndercoverBean.VoiceUndercover.VoteOrBuilder
                public int getVoterNumbersCount() {
                    return ((Vote) this.instance).getVoterNumbersCount();
                }

                @Override // com.p1.mobile.longlink.msg.liveroom.VoiceUndercoverBean.VoiceUndercover.VoteOrBuilder
                public List<Integer> getVoterNumbersList() {
                    return Collections.unmodifiableList(((Vote) this.instance).getVoterNumbersList());
                }

                @Override // com.p1.mobile.longlink.msg.liveroom.VoiceUndercoverBean.VoiceUndercover.VoteOrBuilder
                public boolean hasCandidateMask() {
                    return ((Vote) this.instance).hasCandidateMask();
                }

                public Builder mergeCandidateMask(userMaskConfig.UserMask userMask) {
                    copyOnWrite();
                    ((Vote) this.instance).mergeCandidateMask(userMask);
                    return this;
                }

                public Builder setCandidateMask(userMaskConfig.UserMask userMask) {
                    copyOnWrite();
                    ((Vote) this.instance).setCandidateMask(userMask);
                    return this;
                }

                public Builder setNumber(int i) {
                    copyOnWrite();
                    ((Vote) this.instance).setNumber(i);
                    return this;
                }

                public Builder setVoterNumbers(int i, int i2) {
                    copyOnWrite();
                    ((Vote) this.instance).setVoterNumbers(i, i2);
                    return this;
                }

                public Builder setCandidateMask(userMaskConfig.UserMask.Builder builder) {
                    copyOnWrite();
                    ((Vote) this.instance).setCandidateMask(builder);
                    return this;
                }
            }

            public static Vote parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (Vote) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static Vote parseFrom(byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
                return (Vote) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3410h);
            }

            public static Vote parseFrom(InputStream inputStream) throws IOException {
                return (Vote) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Vote parseFrom(InputStream inputStream, C3410h c3410h) throws IOException {
                return (Vote) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3410h);
            }

            public static Vote parseFrom(C3407e c3407e) throws IOException {
                return (Vote) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e);
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static Vote parseFrom(C3407e c3407e, C3410h c3410h) throws IOException {
                return (Vote) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e, c3410h);
            }
        }

        public static final class VoteResult extends GeneratedMessageLite<VoteResult, Builder> implements VoteResultOrBuilder {
            private static final VoteResult DEFAULT_INSTANCE;
            public static final int ISDRAW_FIELD_NUMBER = 1;
            public static final int OUTUSERMASK_FIELD_NUMBER = 4;
            public static final int OUTUSERROLE_FIELD_NUMBER = 3;
            private static volatile i860<VoteResult> PARSER = null;
            public static final int RESULT_FIELD_NUMBER = 2;
            private boolean isDraw_;
            private userMaskConfig.UserMask outUserMask_;
            private String result_ = "";
            private String outUserRole_ = "";

            static {
                VoteResult voteResult = new VoteResult();
                DEFAULT_INSTANCE = voteResult;
                voteResult.makeImmutable();
            }

            private VoteResult() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearIsDraw() {
                this.isDraw_ = false;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearOutUserMask() {
                this.outUserMask_ = null;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearOutUserRole() {
                this.outUserRole_ = getDefaultInstance().getOutUserRole();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearResult() {
                this.result_ = getDefaultInstance().getResult();
            }

            public static VoteResult getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergeOutUserMask(userMaskConfig.UserMask userMask) {
                userMaskConfig.UserMask userMask2 = this.outUserMask_;
                if (userMask2 == null || userMask2 == userMaskConfig.UserMask.getDefaultInstance()) {
                    this.outUserMask_ = userMask;
                } else {
                    this.outUserMask_ = userMaskConfig.UserMask.newBuilder(this.outUserMask_).mergeFrom(userMask).buildPartial();
                }
            }

            public static Builder newBuilder(VoteResult voteResult) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(voteResult);
            }

            public static VoteResult parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (VoteResult) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static VoteResult parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (VoteResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static i860<VoteResult> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setIsDraw(boolean z) {
                this.isDraw_ = z;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setOutUserMask(userMaskConfig.UserMask.Builder builder) {
                this.outUserMask_ = builder.build();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setOutUserRole(String str) {
                str.getClass();
                this.outUserRole_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setOutUserRoleBytes(ByteString byteString) {
                byteString.getClass();
                AbstractC3403a.checkByteStringIsUtf8(byteString);
                this.outUserRole_ = byteString.toStringUtf8();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setResult(String str) {
                str.getClass();
                this.result_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setResultBytes(ByteString byteString) {
                byteString.getClass();
                AbstractC3403a.checkByteStringIsUtf8(byteString);
                this.result_ = byteString.toStringUtf8();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (C45381.f15990xa1df5c61[methodToInvoke.ordinal()]) {
                    case 1:
                        return new VoteResult();
                    case 2:
                        return DEFAULT_INSTANCE;
                    case 3:
                        return null;
                    case 4:
                        return new Builder();
                    case 5:
                        GeneratedMessageLite.InterfaceC3386h interfaceC3386h = (GeneratedMessageLite.InterfaceC3386h) obj;
                        VoteResult voteResult = (VoteResult) obj2;
                        boolean z = this.isDraw_;
                        boolean z2 = voteResult.isDraw_;
                        this.isDraw_ = interfaceC3386h.mo16995d(z, z, z2, z2);
                        this.result_ = interfaceC3386h.mo16997f(!this.result_.isEmpty(), this.result_, !voteResult.result_.isEmpty(), voteResult.result_);
                        this.outUserRole_ = interfaceC3386h.mo16997f(!this.outUserRole_.isEmpty(), this.outUserRole_, true ^ voteResult.outUserRole_.isEmpty(), voteResult.outUserRole_);
                        this.outUserMask_ = (userMaskConfig.UserMask) interfaceC3386h.mo17006o(this.outUserMask_, voteResult.outUserMask_);
                        GeneratedMessageLite.C3385g c3385g = GeneratedMessageLite.C3385g.INSTANCE;
                        return this;
                    case 6:
                        C3407e c3407e = (C3407e) obj;
                        C3410h c3410h = (C3410h) obj2;
                        boolean z3 = false;
                        while (!z3) {
                            try {
                                int iM17116M = c3407e.m17116M();
                                if (iM17116M != 0) {
                                    if (iM17116M == 8) {
                                        this.isDraw_ = c3407e.m17133m();
                                    } else if (iM17116M == 18) {
                                        this.result_ = c3407e.m17115L();
                                    } else if (iM17116M == 26) {
                                        this.outUserRole_ = c3407e.m17115L();
                                    } else if (iM17116M == 34) {
                                        userMaskConfig.UserMask userMask = this.outUserMask_;
                                        userMaskConfig.UserMask.Builder builder = userMask != null ? userMask.toBuilder() : null;
                                        userMaskConfig.UserMask userMask2 = (userMaskConfig.UserMask) c3407e.m17143w(userMaskConfig.UserMask.parser(), c3410h);
                                        this.outUserMask_ = userMask2;
                                        if (builder != null) {
                                            builder.mergeFrom(userMask2);
                                            this.outUserMask_ = builder.buildPartial();
                                        }
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
                            synchronized (VoteResult.class) {
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

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceUndercoverBean.VoiceUndercover.VoteResultOrBuilder
            public boolean getIsDraw() {
                return this.isDraw_;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceUndercoverBean.VoiceUndercover.VoteResultOrBuilder
            public userMaskConfig.UserMask getOutUserMask() {
                userMaskConfig.UserMask userMask = this.outUserMask_;
                return userMask == null ? userMaskConfig.UserMask.getDefaultInstance() : userMask;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceUndercoverBean.VoiceUndercover.VoteResultOrBuilder
            public String getOutUserRole() {
                return this.outUserRole_;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceUndercoverBean.VoiceUndercover.VoteResultOrBuilder
            public ByteString getOutUserRoleBytes() {
                return ByteString.copyFromUtf8(this.outUserRole_);
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceUndercoverBean.VoiceUndercover.VoteResultOrBuilder
            public String getResult() {
                return this.result_;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceUndercoverBean.VoiceUndercover.VoteResultOrBuilder
            public ByteString getResultBytes() {
                return ByteString.copyFromUtf8(this.result_);
            }

            @Override // com.google.protobuf.InterfaceC3419q
            public int getSerializedSize() {
                int i = this.memoizedSerializedSize;
                if (i != -1) {
                    return i;
                }
                boolean z = this.isDraw_;
                int iM16915f = z ? CodedOutputStream.m16915f(1, z) : 0;
                if (!this.result_.isEmpty()) {
                    iM16915f += CodedOutputStream.m16901K(2, getResult());
                }
                if (!this.outUserRole_.isEmpty()) {
                    iM16915f += CodedOutputStream.m16901K(3, getOutUserRole());
                }
                if (this.outUserMask_ != null) {
                    iM16915f += CodedOutputStream.m16893C(4, getOutUserMask());
                }
                this.memoizedSerializedSize = iM16915f;
                return iM16915f;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceUndercoverBean.VoiceUndercover.VoteResultOrBuilder
            public boolean hasOutUserMask() {
                return this.outUserMask_ != null;
            }

            @Override // com.google.protobuf.InterfaceC3419q
            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                boolean z = this.isDraw_;
                if (z) {
                    codedOutputStream.mo16950a0(1, z);
                }
                if (!this.result_.isEmpty()) {
                    codedOutputStream.mo16939D0(2, getResult());
                }
                if (!this.outUserRole_.isEmpty()) {
                    codedOutputStream.mo16939D0(3, getOutUserRole());
                }
                if (this.outUserMask_ != null) {
                    codedOutputStream.mo16974w0(4, getOutUserMask());
                }
            }

            public static VoteResult parseDelimitedFrom(InputStream inputStream, C3410h c3410h) throws IOException {
                return (VoteResult) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3410h);
            }

            public static VoteResult parseFrom(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
                return (VoteResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3410h);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setOutUserMask(userMaskConfig.UserMask userMask) {
                userMask.getClass();
                this.outUserMask_ = userMask;
            }

            public static final class Builder extends GeneratedMessageLite.AbstractC3380b<VoteResult, Builder> implements VoteResultOrBuilder {
                private Builder() {
                    super(VoteResult.DEFAULT_INSTANCE);
                }

                public Builder clearIsDraw() {
                    copyOnWrite();
                    ((VoteResult) this.instance).clearIsDraw();
                    return this;
                }

                public Builder clearOutUserMask() {
                    copyOnWrite();
                    ((VoteResult) this.instance).clearOutUserMask();
                    return this;
                }

                public Builder clearOutUserRole() {
                    copyOnWrite();
                    ((VoteResult) this.instance).clearOutUserRole();
                    return this;
                }

                public Builder clearResult() {
                    copyOnWrite();
                    ((VoteResult) this.instance).clearResult();
                    return this;
                }

                @Override // com.p1.mobile.longlink.msg.liveroom.VoiceUndercoverBean.VoiceUndercover.VoteResultOrBuilder
                public boolean getIsDraw() {
                    return ((VoteResult) this.instance).getIsDraw();
                }

                @Override // com.p1.mobile.longlink.msg.liveroom.VoiceUndercoverBean.VoiceUndercover.VoteResultOrBuilder
                public userMaskConfig.UserMask getOutUserMask() {
                    return ((VoteResult) this.instance).getOutUserMask();
                }

                @Override // com.p1.mobile.longlink.msg.liveroom.VoiceUndercoverBean.VoiceUndercover.VoteResultOrBuilder
                public String getOutUserRole() {
                    return ((VoteResult) this.instance).getOutUserRole();
                }

                @Override // com.p1.mobile.longlink.msg.liveroom.VoiceUndercoverBean.VoiceUndercover.VoteResultOrBuilder
                public ByteString getOutUserRoleBytes() {
                    return ((VoteResult) this.instance).getOutUserRoleBytes();
                }

                @Override // com.p1.mobile.longlink.msg.liveroom.VoiceUndercoverBean.VoiceUndercover.VoteResultOrBuilder
                public String getResult() {
                    return ((VoteResult) this.instance).getResult();
                }

                @Override // com.p1.mobile.longlink.msg.liveroom.VoiceUndercoverBean.VoiceUndercover.VoteResultOrBuilder
                public ByteString getResultBytes() {
                    return ((VoteResult) this.instance).getResultBytes();
                }

                @Override // com.p1.mobile.longlink.msg.liveroom.VoiceUndercoverBean.VoiceUndercover.VoteResultOrBuilder
                public boolean hasOutUserMask() {
                    return ((VoteResult) this.instance).hasOutUserMask();
                }

                public Builder mergeOutUserMask(userMaskConfig.UserMask userMask) {
                    copyOnWrite();
                    ((VoteResult) this.instance).mergeOutUserMask(userMask);
                    return this;
                }

                public Builder setIsDraw(boolean z) {
                    copyOnWrite();
                    ((VoteResult) this.instance).setIsDraw(z);
                    return this;
                }

                public Builder setOutUserMask(userMaskConfig.UserMask userMask) {
                    copyOnWrite();
                    ((VoteResult) this.instance).setOutUserMask(userMask);
                    return this;
                }

                public Builder setOutUserRole(String str) {
                    copyOnWrite();
                    ((VoteResult) this.instance).setOutUserRole(str);
                    return this;
                }

                public Builder setOutUserRoleBytes(ByteString byteString) {
                    copyOnWrite();
                    ((VoteResult) this.instance).setOutUserRoleBytes(byteString);
                    return this;
                }

                public Builder setResult(String str) {
                    copyOnWrite();
                    ((VoteResult) this.instance).setResult(str);
                    return this;
                }

                public Builder setResultBytes(ByteString byteString) {
                    copyOnWrite();
                    ((VoteResult) this.instance).setResultBytes(byteString);
                    return this;
                }

                public Builder setOutUserMask(userMaskConfig.UserMask.Builder builder) {
                    copyOnWrite();
                    ((VoteResult) this.instance).setOutUserMask(builder);
                    return this;
                }
            }

            public static VoteResult parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (VoteResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static VoteResult parseFrom(byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
                return (VoteResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3410h);
            }

            public static VoteResult parseFrom(InputStream inputStream) throws IOException {
                return (VoteResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static VoteResult parseFrom(InputStream inputStream, C3410h c3410h) throws IOException {
                return (VoteResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3410h);
            }

            public static VoteResult parseFrom(C3407e c3407e) throws IOException {
                return (VoteResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e);
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static VoteResult parseFrom(C3407e c3407e, C3410h c3410h) throws IOException {
                return (VoteResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e, c3410h);
            }
        }

        public static VoiceUndercover parseDelimitedFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (VoiceUndercover) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static VoiceUndercover parseFrom(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
            return (VoiceUndercover) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3410h);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGameResult(GameResult gameResult) {
            gameResult.getClass();
            this.gameResult_ = gameResult;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVoteResult(VoteResult voteResult) {
            voteResult.getClass();
            this.voteResult_ = voteResult;
        }

        public static final class Builder extends GeneratedMessageLite.AbstractC3380b<VoiceUndercover, Builder> implements VoiceUndercoverOrBuilder {
            private Builder() {
                super(VoiceUndercover.DEFAULT_INSTANCE);
            }

            public Builder addAllCurrentPlayers(Iterable<? extends Player> iterable) {
                copyOnWrite();
                ((VoiceUndercover) this.instance).addAllCurrentPlayers(iterable);
                return this;
            }

            public Builder addAllVotes(Iterable<? extends Vote> iterable) {
                copyOnWrite();
                ((VoiceUndercover) this.instance).addAllVotes(iterable);
                return this;
            }

            public Builder addCurrentPlayers(Player player) {
                copyOnWrite();
                ((VoiceUndercover) this.instance).addCurrentPlayers(player);
                return this;
            }

            public Builder addVotes(Vote vote) {
                copyOnWrite();
                ((VoiceUndercover) this.instance).addVotes(vote);
                return this;
            }

            public Builder clearCountDownSeconds() {
                copyOnWrite();
                ((VoiceUndercover) this.instance).clearCountDownSeconds();
                return this;
            }

            public Builder clearCurrentPlayers() {
                copyOnWrite();
                ((VoiceUndercover) this.instance).clearCurrentPlayers();
                return this;
            }

            public Builder clearGameResult() {
                copyOnWrite();
                ((VoiceUndercover) this.instance).clearGameResult();
                return this;
            }

            public Builder clearId() {
                copyOnWrite();
                ((VoiceUndercover) this.instance).clearId();
                return this;
            }

            public Builder clearLiveId() {
                copyOnWrite();
                ((VoiceUndercover) this.instance).clearLiveId();
                return this;
            }

            public Builder clearRemainSeconds() {
                copyOnWrite();
                ((VoiceUndercover) this.instance).clearRemainSeconds();
                return this;
            }

            public Builder clearStatus() {
                copyOnWrite();
                ((VoiceUndercover) this.instance).clearStatus();
                return this;
            }

            public Builder clearToast() {
                copyOnWrite();
                ((VoiceUndercover) this.instance).clearToast();
                return this;
            }

            public Builder clearVoteResult() {
                copyOnWrite();
                ((VoiceUndercover) this.instance).clearVoteResult();
                return this;
            }

            public Builder clearVotes() {
                copyOnWrite();
                ((VoiceUndercover) this.instance).clearVotes();
                return this;
            }

            public Builder clearWord() {
                copyOnWrite();
                ((VoiceUndercover) this.instance).clearWord();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceUndercoverBean.VoiceUndercoverOrBuilder
            public int getCountDownSeconds() {
                return ((VoiceUndercover) this.instance).getCountDownSeconds();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceUndercoverBean.VoiceUndercoverOrBuilder
            public Player getCurrentPlayers(int i) {
                return ((VoiceUndercover) this.instance).getCurrentPlayers(i);
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceUndercoverBean.VoiceUndercoverOrBuilder
            public int getCurrentPlayersCount() {
                return ((VoiceUndercover) this.instance).getCurrentPlayersCount();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceUndercoverBean.VoiceUndercoverOrBuilder
            public List<Player> getCurrentPlayersList() {
                return Collections.unmodifiableList(((VoiceUndercover) this.instance).getCurrentPlayersList());
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceUndercoverBean.VoiceUndercoverOrBuilder
            public GameResult getGameResult() {
                return ((VoiceUndercover) this.instance).getGameResult();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceUndercoverBean.VoiceUndercoverOrBuilder
            public String getId() {
                return ((VoiceUndercover) this.instance).getId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceUndercoverBean.VoiceUndercoverOrBuilder
            public ByteString getIdBytes() {
                return ((VoiceUndercover) this.instance).getIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceUndercoverBean.VoiceUndercoverOrBuilder
            public String getLiveId() {
                return ((VoiceUndercover) this.instance).getLiveId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceUndercoverBean.VoiceUndercoverOrBuilder
            public ByteString getLiveIdBytes() {
                return ((VoiceUndercover) this.instance).getLiveIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceUndercoverBean.VoiceUndercoverOrBuilder
            public int getRemainSeconds() {
                return ((VoiceUndercover) this.instance).getRemainSeconds();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceUndercoverBean.VoiceUndercoverOrBuilder
            public String getStatus() {
                return ((VoiceUndercover) this.instance).getStatus();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceUndercoverBean.VoiceUndercoverOrBuilder
            public ByteString getStatusBytes() {
                return ((VoiceUndercover) this.instance).getStatusBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceUndercoverBean.VoiceUndercoverOrBuilder
            public String getToast() {
                return ((VoiceUndercover) this.instance).getToast();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceUndercoverBean.VoiceUndercoverOrBuilder
            public ByteString getToastBytes() {
                return ((VoiceUndercover) this.instance).getToastBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceUndercoverBean.VoiceUndercoverOrBuilder
            public VoteResult getVoteResult() {
                return ((VoiceUndercover) this.instance).getVoteResult();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceUndercoverBean.VoiceUndercoverOrBuilder
            public Vote getVotes(int i) {
                return ((VoiceUndercover) this.instance).getVotes(i);
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceUndercoverBean.VoiceUndercoverOrBuilder
            public int getVotesCount() {
                return ((VoiceUndercover) this.instance).getVotesCount();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceUndercoverBean.VoiceUndercoverOrBuilder
            public List<Vote> getVotesList() {
                return Collections.unmodifiableList(((VoiceUndercover) this.instance).getVotesList());
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceUndercoverBean.VoiceUndercoverOrBuilder
            public String getWord() {
                return ((VoiceUndercover) this.instance).getWord();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceUndercoverBean.VoiceUndercoverOrBuilder
            public ByteString getWordBytes() {
                return ((VoiceUndercover) this.instance).getWordBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceUndercoverBean.VoiceUndercoverOrBuilder
            public boolean hasGameResult() {
                return ((VoiceUndercover) this.instance).hasGameResult();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.VoiceUndercoverBean.VoiceUndercoverOrBuilder
            public boolean hasVoteResult() {
                return ((VoiceUndercover) this.instance).hasVoteResult();
            }

            public Builder mergeGameResult(GameResult gameResult) {
                copyOnWrite();
                ((VoiceUndercover) this.instance).mergeGameResult(gameResult);
                return this;
            }

            public Builder mergeVoteResult(VoteResult voteResult) {
                copyOnWrite();
                ((VoiceUndercover) this.instance).mergeVoteResult(voteResult);
                return this;
            }

            public Builder removeCurrentPlayers(int i) {
                copyOnWrite();
                ((VoiceUndercover) this.instance).removeCurrentPlayers(i);
                return this;
            }

            public Builder removeVotes(int i) {
                copyOnWrite();
                ((VoiceUndercover) this.instance).removeVotes(i);
                return this;
            }

            public Builder setCountDownSeconds(int i) {
                copyOnWrite();
                ((VoiceUndercover) this.instance).setCountDownSeconds(i);
                return this;
            }

            public Builder setCurrentPlayers(int i, Player player) {
                copyOnWrite();
                ((VoiceUndercover) this.instance).setCurrentPlayers(i, player);
                return this;
            }

            public Builder setGameResult(GameResult gameResult) {
                copyOnWrite();
                ((VoiceUndercover) this.instance).setGameResult(gameResult);
                return this;
            }

            public Builder setId(String str) {
                copyOnWrite();
                ((VoiceUndercover) this.instance).setId(str);
                return this;
            }

            public Builder setIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceUndercover) this.instance).setIdBytes(byteString);
                return this;
            }

            public Builder setLiveId(String str) {
                copyOnWrite();
                ((VoiceUndercover) this.instance).setLiveId(str);
                return this;
            }

            public Builder setLiveIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceUndercover) this.instance).setLiveIdBytes(byteString);
                return this;
            }

            public Builder setRemainSeconds(int i) {
                copyOnWrite();
                ((VoiceUndercover) this.instance).setRemainSeconds(i);
                return this;
            }

            public Builder setStatus(String str) {
                copyOnWrite();
                ((VoiceUndercover) this.instance).setStatus(str);
                return this;
            }

            public Builder setStatusBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceUndercover) this.instance).setStatusBytes(byteString);
                return this;
            }

            public Builder setToast(String str) {
                copyOnWrite();
                ((VoiceUndercover) this.instance).setToast(str);
                return this;
            }

            public Builder setToastBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceUndercover) this.instance).setToastBytes(byteString);
                return this;
            }

            public Builder setVoteResult(VoteResult voteResult) {
                copyOnWrite();
                ((VoiceUndercover) this.instance).setVoteResult(voteResult);
                return this;
            }

            public Builder setVotes(int i, Vote vote) {
                copyOnWrite();
                ((VoiceUndercover) this.instance).setVotes(i, vote);
                return this;
            }

            public Builder setWord(String str) {
                copyOnWrite();
                ((VoiceUndercover) this.instance).setWord(str);
                return this;
            }

            public Builder setWordBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceUndercover) this.instance).setWordBytes(byteString);
                return this;
            }

            public Builder addCurrentPlayers(int i, Player player) {
                copyOnWrite();
                ((VoiceUndercover) this.instance).addCurrentPlayers(i, player);
                return this;
            }

            public Builder addVotes(int i, Vote vote) {
                copyOnWrite();
                ((VoiceUndercover) this.instance).addVotes(i, vote);
                return this;
            }

            public Builder setCurrentPlayers(int i, Player.Builder builder) {
                copyOnWrite();
                ((VoiceUndercover) this.instance).setCurrentPlayers(i, builder);
                return this;
            }

            public Builder setGameResult(GameResult.Builder builder) {
                copyOnWrite();
                ((VoiceUndercover) this.instance).setGameResult(builder);
                return this;
            }

            public Builder setVoteResult(VoteResult.Builder builder) {
                copyOnWrite();
                ((VoiceUndercover) this.instance).setVoteResult(builder);
                return this;
            }

            public Builder setVotes(int i, Vote.Builder builder) {
                copyOnWrite();
                ((VoiceUndercover) this.instance).setVotes(i, builder);
                return this;
            }

            public Builder addCurrentPlayers(Player.Builder builder) {
                copyOnWrite();
                ((VoiceUndercover) this.instance).addCurrentPlayers(builder);
                return this;
            }

            public Builder addVotes(Vote.Builder builder) {
                copyOnWrite();
                ((VoiceUndercover) this.instance).addVotes(builder);
                return this;
            }

            public Builder addCurrentPlayers(int i, Player.Builder builder) {
                copyOnWrite();
                ((VoiceUndercover) this.instance).addCurrentPlayers(i, builder);
                return this;
            }

            public Builder addVotes(int i, Vote.Builder builder) {
                copyOnWrite();
                ((VoiceUndercover) this.instance).addVotes(i, builder);
                return this;
            }
        }

        public static VoiceUndercover parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoiceUndercover) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoiceUndercover parseFrom(byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
            return (VoiceUndercover) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3410h);
        }

        public static VoiceUndercover parseFrom(InputStream inputStream) throws IOException {
            return (VoiceUndercover) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceUndercover parseFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (VoiceUndercover) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static VoiceUndercover parseFrom(C3407e c3407e) throws IOException {
            return (VoiceUndercover) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addCurrentPlayers(int i, Player player) {
            player.getClass();
            ensureCurrentPlayersIsMutable();
            this.currentPlayers_.add(i, player);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addVotes(int i, Vote vote) {
            vote.getClass();
            ensureVotesIsMutable();
            this.votes_.add(i, vote);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static VoiceUndercover parseFrom(C3407e c3407e, C3410h c3410h) throws IOException {
            return (VoiceUndercover) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e, c3410h);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCurrentPlayers(int i, Player player) {
            player.getClass();
            ensureCurrentPlayersIsMutable();
            this.currentPlayers_.set(i, player);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVotes(int i, Vote vote) {
            vote.getClass();
            ensureVotesIsMutable();
            this.votes_.set(i, vote);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addCurrentPlayers(Player player) {
            player.getClass();
            ensureCurrentPlayersIsMutable();
            this.currentPlayers_.add(player);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addVotes(Vote vote) {
            vote.getClass();
            ensureVotesIsMutable();
            this.votes_.add(vote);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addCurrentPlayers(int i, Player.Builder builder) {
            ensureCurrentPlayersIsMutable();
            this.currentPlayers_.add(i, builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addVotes(int i, Vote.Builder builder) {
            ensureVotesIsMutable();
            this.votes_.add(i, builder.build());
        }
    }
}
