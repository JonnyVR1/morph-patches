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
public final class LongLinkVoiceLiveAuctionMsg {

    /* JADX INFO: renamed from: com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionMsg$1 */
    public static /* synthetic */ class C45271 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f15984xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15984xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15984xa1df5c61[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15984xa1df5c61[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15984xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15984xa1df5c61[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15984xa1df5c61[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15984xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f15984xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public interface AuctionLeaderboardOrBuilder extends o6z {
        long getAmount();

        String getAmountBackgroundId();

        ByteString getAmountBackgroundIdBytes();

        String getAvatar();

        ByteString getAvatarBytes();

        String getAvatarFrameDynamicUrl();

        ByteString getAvatarFrameDynamicUrlBytes();

        String getAvatarFrameUrl();

        ByteString getAvatarFrameUrlBytes();

        String getBackground();

        ByteString getBackgroundBytes();

        @Override // p149l.o6z
        /* synthetic */ InterfaceC3419q getDefaultInstanceForType();

        long getRank();

        String getUserId();

        ByteString getUserIdBytes();

        String getUserName();

        ByteString getUserNameBytes();

        @Override // p149l.o6z
        /* synthetic */ boolean isInitialized();
    }

    public interface VoiceLiveAuctionPledgeChooseOrBuilder extends o6z {
        String getAuctionId();

        ByteString getAuctionIdBytes();

        @Override // p149l.o6z
        /* synthetic */ InterfaceC3419q getDefaultInstanceForType();

        String getPledgeAName();

        ByteString getPledgeANameBytes();

        String getPledgeBName();

        ByteString getPledgeBNameBytes();

        @Override // p149l.o6z
        /* synthetic */ boolean isInitialized();
    }

    public interface VoiceLiveAuctionUpdateOrBuilder extends o6z {
        String getAuctionId();

        ByteString getAuctionIdBytes();

        long getCurrentTime();

        @Override // p149l.o6z
        /* synthetic */ InterfaceC3419q getDefaultInstanceForType();

        boolean getIsChoosingPledgeRelation();

        long getLeaderboardGap();

        AuctionLeaderboard getLeaderboards(int i);

        int getLeaderboardsCount();

        List<AuctionLeaderboard> getLeaderboardsList();

        long getLevel();

        String getPanelBgId();

        ByteString getPanelBgIdBytes();

        UpdateType getUpdateType();

        int getUpdateTypeValue();

        long getWorth();

        String getWorthBubble();

        ByteString getWorthBubbleBytes();

        long getWorthBubbleLevel();

        @Override // p149l.o6z
        /* synthetic */ boolean isInitialized();
    }

    private LongLinkVoiceLiveAuctionMsg() {
    }

    public static void registerAllExtensions(C3410h c3410h) {
    }

    public static final class AuctionLeaderboard extends GeneratedMessageLite<AuctionLeaderboard, Builder> implements AuctionLeaderboardOrBuilder {
        public static final int AMOUNTBACKGROUNDID_FIELD_NUMBER = 9;
        public static final int AMOUNT_FIELD_NUMBER = 2;
        public static final int AVATARFRAMEDYNAMICURL_FIELD_NUMBER = 7;
        public static final int AVATARFRAMEURL_FIELD_NUMBER = 6;
        public static final int AVATAR_FIELD_NUMBER = 5;
        public static final int BACKGROUND_FIELD_NUMBER = 8;
        private static final AuctionLeaderboard DEFAULT_INSTANCE;
        private static volatile i860<AuctionLeaderboard> PARSER = null;
        public static final int RANK_FIELD_NUMBER = 1;
        public static final int USERID_FIELD_NUMBER = 3;
        public static final int USERNAME_FIELD_NUMBER = 4;
        private long amount_;
        private long rank_;
        private String userId_ = "";
        private String userName_ = "";
        private String avatar_ = "";
        private String avatarFrameUrl_ = "";
        private String avatarFrameDynamicUrl_ = "";
        private String background_ = "";
        private String amountBackgroundId_ = "";

        public static final class Builder extends GeneratedMessageLite.AbstractC3380b<AuctionLeaderboard, Builder> implements AuctionLeaderboardOrBuilder {
            private Builder() {
                super(AuctionLeaderboard.DEFAULT_INSTANCE);
            }

            public Builder clearAmount() {
                copyOnWrite();
                ((AuctionLeaderboard) this.instance).clearAmount();
                return this;
            }

            public Builder clearAmountBackgroundId() {
                copyOnWrite();
                ((AuctionLeaderboard) this.instance).clearAmountBackgroundId();
                return this;
            }

            public Builder clearAvatar() {
                copyOnWrite();
                ((AuctionLeaderboard) this.instance).clearAvatar();
                return this;
            }

            public Builder clearAvatarFrameDynamicUrl() {
                copyOnWrite();
                ((AuctionLeaderboard) this.instance).clearAvatarFrameDynamicUrl();
                return this;
            }

            public Builder clearAvatarFrameUrl() {
                copyOnWrite();
                ((AuctionLeaderboard) this.instance).clearAvatarFrameUrl();
                return this;
            }

            public Builder clearBackground() {
                copyOnWrite();
                ((AuctionLeaderboard) this.instance).clearBackground();
                return this;
            }

            public Builder clearRank() {
                copyOnWrite();
                ((AuctionLeaderboard) this.instance).clearRank();
                return this;
            }

            public Builder clearUserId() {
                copyOnWrite();
                ((AuctionLeaderboard) this.instance).clearUserId();
                return this;
            }

            public Builder clearUserName() {
                copyOnWrite();
                ((AuctionLeaderboard) this.instance).clearUserName();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionMsg.AuctionLeaderboardOrBuilder
            public long getAmount() {
                return ((AuctionLeaderboard) this.instance).getAmount();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionMsg.AuctionLeaderboardOrBuilder
            public String getAmountBackgroundId() {
                return ((AuctionLeaderboard) this.instance).getAmountBackgroundId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionMsg.AuctionLeaderboardOrBuilder
            public ByteString getAmountBackgroundIdBytes() {
                return ((AuctionLeaderboard) this.instance).getAmountBackgroundIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionMsg.AuctionLeaderboardOrBuilder
            public String getAvatar() {
                return ((AuctionLeaderboard) this.instance).getAvatar();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionMsg.AuctionLeaderboardOrBuilder
            public ByteString getAvatarBytes() {
                return ((AuctionLeaderboard) this.instance).getAvatarBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionMsg.AuctionLeaderboardOrBuilder
            public String getAvatarFrameDynamicUrl() {
                return ((AuctionLeaderboard) this.instance).getAvatarFrameDynamicUrl();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionMsg.AuctionLeaderboardOrBuilder
            public ByteString getAvatarFrameDynamicUrlBytes() {
                return ((AuctionLeaderboard) this.instance).getAvatarFrameDynamicUrlBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionMsg.AuctionLeaderboardOrBuilder
            public String getAvatarFrameUrl() {
                return ((AuctionLeaderboard) this.instance).getAvatarFrameUrl();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionMsg.AuctionLeaderboardOrBuilder
            public ByteString getAvatarFrameUrlBytes() {
                return ((AuctionLeaderboard) this.instance).getAvatarFrameUrlBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionMsg.AuctionLeaderboardOrBuilder
            public String getBackground() {
                return ((AuctionLeaderboard) this.instance).getBackground();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionMsg.AuctionLeaderboardOrBuilder
            public ByteString getBackgroundBytes() {
                return ((AuctionLeaderboard) this.instance).getBackgroundBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionMsg.AuctionLeaderboardOrBuilder
            public long getRank() {
                return ((AuctionLeaderboard) this.instance).getRank();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionMsg.AuctionLeaderboardOrBuilder
            public String getUserId() {
                return ((AuctionLeaderboard) this.instance).getUserId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionMsg.AuctionLeaderboardOrBuilder
            public ByteString getUserIdBytes() {
                return ((AuctionLeaderboard) this.instance).getUserIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionMsg.AuctionLeaderboardOrBuilder
            public String getUserName() {
                return ((AuctionLeaderboard) this.instance).getUserName();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionMsg.AuctionLeaderboardOrBuilder
            public ByteString getUserNameBytes() {
                return ((AuctionLeaderboard) this.instance).getUserNameBytes();
            }

            public Builder setAmount(long j) {
                copyOnWrite();
                ((AuctionLeaderboard) this.instance).setAmount(j);
                return this;
            }

            public Builder setAmountBackgroundId(String str) {
                copyOnWrite();
                ((AuctionLeaderboard) this.instance).setAmountBackgroundId(str);
                return this;
            }

            public Builder setAmountBackgroundIdBytes(ByteString byteString) {
                copyOnWrite();
                ((AuctionLeaderboard) this.instance).setAmountBackgroundIdBytes(byteString);
                return this;
            }

            public Builder setAvatar(String str) {
                copyOnWrite();
                ((AuctionLeaderboard) this.instance).setAvatar(str);
                return this;
            }

            public Builder setAvatarBytes(ByteString byteString) {
                copyOnWrite();
                ((AuctionLeaderboard) this.instance).setAvatarBytes(byteString);
                return this;
            }

            public Builder setAvatarFrameDynamicUrl(String str) {
                copyOnWrite();
                ((AuctionLeaderboard) this.instance).setAvatarFrameDynamicUrl(str);
                return this;
            }

            public Builder setAvatarFrameDynamicUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((AuctionLeaderboard) this.instance).setAvatarFrameDynamicUrlBytes(byteString);
                return this;
            }

            public Builder setAvatarFrameUrl(String str) {
                copyOnWrite();
                ((AuctionLeaderboard) this.instance).setAvatarFrameUrl(str);
                return this;
            }

            public Builder setAvatarFrameUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((AuctionLeaderboard) this.instance).setAvatarFrameUrlBytes(byteString);
                return this;
            }

            public Builder setBackground(String str) {
                copyOnWrite();
                ((AuctionLeaderboard) this.instance).setBackground(str);
                return this;
            }

            public Builder setBackgroundBytes(ByteString byteString) {
                copyOnWrite();
                ((AuctionLeaderboard) this.instance).setBackgroundBytes(byteString);
                return this;
            }

            public Builder setRank(long j) {
                copyOnWrite();
                ((AuctionLeaderboard) this.instance).setRank(j);
                return this;
            }

            public Builder setUserId(String str) {
                copyOnWrite();
                ((AuctionLeaderboard) this.instance).setUserId(str);
                return this;
            }

            public Builder setUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((AuctionLeaderboard) this.instance).setUserIdBytes(byteString);
                return this;
            }

            public Builder setUserName(String str) {
                copyOnWrite();
                ((AuctionLeaderboard) this.instance).setUserName(str);
                return this;
            }

            public Builder setUserNameBytes(ByteString byteString) {
                copyOnWrite();
                ((AuctionLeaderboard) this.instance).setUserNameBytes(byteString);
                return this;
            }
        }

        static {
            AuctionLeaderboard auctionLeaderboard = new AuctionLeaderboard();
            DEFAULT_INSTANCE = auctionLeaderboard;
            auctionLeaderboard.makeImmutable();
        }

        private AuctionLeaderboard() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAmount() {
            this.amount_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAmountBackgroundId() {
            this.amountBackgroundId_ = getDefaultInstance().getAmountBackgroundId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAvatar() {
            this.avatar_ = getDefaultInstance().getAvatar();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAvatarFrameDynamicUrl() {
            this.avatarFrameDynamicUrl_ = getDefaultInstance().getAvatarFrameDynamicUrl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAvatarFrameUrl() {
            this.avatarFrameUrl_ = getDefaultInstance().getAvatarFrameUrl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBackground() {
            this.background_ = getDefaultInstance().getBackground();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRank() {
            this.rank_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUserId() {
            this.userId_ = getDefaultInstance().getUserId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUserName() {
            this.userName_ = getDefaultInstance().getUserName();
        }

        public static AuctionLeaderboard getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(AuctionLeaderboard auctionLeaderboard) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(auctionLeaderboard);
        }

        public static AuctionLeaderboard parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (AuctionLeaderboard) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AuctionLeaderboard parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (AuctionLeaderboard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<AuctionLeaderboard> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAmount(long j) {
            this.amount_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAmountBackgroundId(String str) {
            str.getClass();
            this.amountBackgroundId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAmountBackgroundIdBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.amountBackgroundId_ = byteString.toStringUtf8();
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
        public void setAvatarFrameDynamicUrl(String str) {
            str.getClass();
            this.avatarFrameDynamicUrl_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAvatarFrameDynamicUrlBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.avatarFrameDynamicUrl_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAvatarFrameUrl(String str) {
            str.getClass();
            this.avatarFrameUrl_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAvatarFrameUrlBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.avatarFrameUrl_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBackground(String str) {
            str.getClass();
            this.background_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBackgroundBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.background_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRank(long j) {
            this.rank_ = j;
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
            switch (C45271.f15984xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new AuctionLeaderboard();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3386h interfaceC3386h = (GeneratedMessageLite.InterfaceC3386h) obj;
                    AuctionLeaderboard auctionLeaderboard = (AuctionLeaderboard) obj2;
                    long j = this.rank_;
                    boolean z2 = j != 0;
                    long j2 = auctionLeaderboard.rank_;
                    this.rank_ = interfaceC3386h.mo17000i(z2, j, j2 != 0, j2);
                    long j3 = this.amount_;
                    boolean z3 = j3 != 0;
                    long j4 = auctionLeaderboard.amount_;
                    this.amount_ = interfaceC3386h.mo17000i(z3, j3, j4 != 0, j4);
                    this.userId_ = interfaceC3386h.mo16997f(!this.userId_.isEmpty(), this.userId_, !auctionLeaderboard.userId_.isEmpty(), auctionLeaderboard.userId_);
                    this.userName_ = interfaceC3386h.mo16997f(!this.userName_.isEmpty(), this.userName_, !auctionLeaderboard.userName_.isEmpty(), auctionLeaderboard.userName_);
                    this.avatar_ = interfaceC3386h.mo16997f(!this.avatar_.isEmpty(), this.avatar_, !auctionLeaderboard.avatar_.isEmpty(), auctionLeaderboard.avatar_);
                    this.avatarFrameUrl_ = interfaceC3386h.mo16997f(!this.avatarFrameUrl_.isEmpty(), this.avatarFrameUrl_, !auctionLeaderboard.avatarFrameUrl_.isEmpty(), auctionLeaderboard.avatarFrameUrl_);
                    this.avatarFrameDynamicUrl_ = interfaceC3386h.mo16997f(!this.avatarFrameDynamicUrl_.isEmpty(), this.avatarFrameDynamicUrl_, !auctionLeaderboard.avatarFrameDynamicUrl_.isEmpty(), auctionLeaderboard.avatarFrameDynamicUrl_);
                    this.background_ = interfaceC3386h.mo16997f(!this.background_.isEmpty(), this.background_, !auctionLeaderboard.background_.isEmpty(), auctionLeaderboard.background_);
                    this.amountBackgroundId_ = interfaceC3386h.mo16997f(!this.amountBackgroundId_.isEmpty(), this.amountBackgroundId_, !auctionLeaderboard.amountBackgroundId_.isEmpty(), auctionLeaderboard.amountBackgroundId_);
                    GeneratedMessageLite.C3385g c3385g = GeneratedMessageLite.C3385g.INSTANCE;
                    return this;
                case 6:
                    C3407e c3407e = (C3407e) obj;
                    while (!z) {
                        try {
                            int iM17116M = c3407e.m17116M();
                            if (iM17116M != 0) {
                                if (iM17116M == 8) {
                                    this.rank_ = c3407e.m17142v();
                                } else if (iM17116M == 16) {
                                    this.amount_ = c3407e.m17142v();
                                } else if (iM17116M == 26) {
                                    this.userId_ = c3407e.m17115L();
                                } else if (iM17116M == 34) {
                                    this.userName_ = c3407e.m17115L();
                                } else if (iM17116M == 42) {
                                    this.avatar_ = c3407e.m17115L();
                                } else if (iM17116M == 50) {
                                    this.avatarFrameUrl_ = c3407e.m17115L();
                                } else if (iM17116M == 58) {
                                    this.avatarFrameDynamicUrl_ = c3407e.m17115L();
                                } else if (iM17116M == 66) {
                                    this.background_ = c3407e.m17115L();
                                } else if (iM17116M == 74) {
                                    this.amountBackgroundId_ = c3407e.m17115L();
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
                        synchronized (AuctionLeaderboard.class) {
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

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionMsg.AuctionLeaderboardOrBuilder
        public long getAmount() {
            return this.amount_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionMsg.AuctionLeaderboardOrBuilder
        public String getAmountBackgroundId() {
            return this.amountBackgroundId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionMsg.AuctionLeaderboardOrBuilder
        public ByteString getAmountBackgroundIdBytes() {
            return ByteString.copyFromUtf8(this.amountBackgroundId_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionMsg.AuctionLeaderboardOrBuilder
        public String getAvatar() {
            return this.avatar_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionMsg.AuctionLeaderboardOrBuilder
        public ByteString getAvatarBytes() {
            return ByteString.copyFromUtf8(this.avatar_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionMsg.AuctionLeaderboardOrBuilder
        public String getAvatarFrameDynamicUrl() {
            return this.avatarFrameDynamicUrl_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionMsg.AuctionLeaderboardOrBuilder
        public ByteString getAvatarFrameDynamicUrlBytes() {
            return ByteString.copyFromUtf8(this.avatarFrameDynamicUrl_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionMsg.AuctionLeaderboardOrBuilder
        public String getAvatarFrameUrl() {
            return this.avatarFrameUrl_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionMsg.AuctionLeaderboardOrBuilder
        public ByteString getAvatarFrameUrlBytes() {
            return ByteString.copyFromUtf8(this.avatarFrameUrl_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionMsg.AuctionLeaderboardOrBuilder
        public String getBackground() {
            return this.background_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionMsg.AuctionLeaderboardOrBuilder
        public ByteString getBackgroundBytes() {
            return ByteString.copyFromUtf8(this.background_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionMsg.AuctionLeaderboardOrBuilder
        public long getRank() {
            return this.rank_;
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            long j = this.rank_;
            int iM16931v = j != 0 ? CodedOutputStream.m16931v(1, j) : 0;
            long j2 = this.amount_;
            if (j2 != 0) {
                iM16931v += CodedOutputStream.m16931v(2, j2);
            }
            if (!this.userId_.isEmpty()) {
                iM16931v += CodedOutputStream.m16901K(3, getUserId());
            }
            if (!this.userName_.isEmpty()) {
                iM16931v += CodedOutputStream.m16901K(4, getUserName());
            }
            if (!this.avatar_.isEmpty()) {
                iM16931v += CodedOutputStream.m16901K(5, getAvatar());
            }
            if (!this.avatarFrameUrl_.isEmpty()) {
                iM16931v += CodedOutputStream.m16901K(6, getAvatarFrameUrl());
            }
            if (!this.avatarFrameDynamicUrl_.isEmpty()) {
                iM16931v += CodedOutputStream.m16901K(7, getAvatarFrameDynamicUrl());
            }
            if (!this.background_.isEmpty()) {
                iM16931v += CodedOutputStream.m16901K(8, getBackground());
            }
            if (!this.amountBackgroundId_.isEmpty()) {
                iM16931v += CodedOutputStream.m16901K(9, getAmountBackgroundId());
            }
            this.memoizedSerializedSize = iM16931v;
            return iM16931v;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionMsg.AuctionLeaderboardOrBuilder
        public String getUserId() {
            return this.userId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionMsg.AuctionLeaderboardOrBuilder
        public ByteString getUserIdBytes() {
            return ByteString.copyFromUtf8(this.userId_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionMsg.AuctionLeaderboardOrBuilder
        public String getUserName() {
            return this.userName_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionMsg.AuctionLeaderboardOrBuilder
        public ByteString getUserNameBytes() {
            return ByteString.copyFromUtf8(this.userName_);
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            long j = this.rank_;
            if (j != 0) {
                codedOutputStream.m16972u0(1, j);
            }
            long j2 = this.amount_;
            if (j2 != 0) {
                codedOutputStream.m16972u0(2, j2);
            }
            if (!this.userId_.isEmpty()) {
                codedOutputStream.mo16939D0(3, getUserId());
            }
            if (!this.userName_.isEmpty()) {
                codedOutputStream.mo16939D0(4, getUserName());
            }
            if (!this.avatar_.isEmpty()) {
                codedOutputStream.mo16939D0(5, getAvatar());
            }
            if (!this.avatarFrameUrl_.isEmpty()) {
                codedOutputStream.mo16939D0(6, getAvatarFrameUrl());
            }
            if (!this.avatarFrameDynamicUrl_.isEmpty()) {
                codedOutputStream.mo16939D0(7, getAvatarFrameDynamicUrl());
            }
            if (!this.background_.isEmpty()) {
                codedOutputStream.mo16939D0(8, getBackground());
            }
            if (this.amountBackgroundId_.isEmpty()) {
                return;
            }
            codedOutputStream.mo16939D0(9, getAmountBackgroundId());
        }

        public static AuctionLeaderboard parseDelimitedFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (AuctionLeaderboard) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static AuctionLeaderboard parseFrom(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
            return (AuctionLeaderboard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3410h);
        }

        public static AuctionLeaderboard parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (AuctionLeaderboard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static AuctionLeaderboard parseFrom(byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
            return (AuctionLeaderboard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3410h);
        }

        public static AuctionLeaderboard parseFrom(InputStream inputStream) throws IOException {
            return (AuctionLeaderboard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AuctionLeaderboard parseFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (AuctionLeaderboard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static AuctionLeaderboard parseFrom(C3407e c3407e) throws IOException {
            return (AuctionLeaderboard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static AuctionLeaderboard parseFrom(C3407e c3407e, C3410h c3410h) throws IOException {
            return (AuctionLeaderboard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e, c3410h);
        }
    }

    public enum UpdateType implements C3414l.c {
        refreshAuction(0),
        updateWorth(1),
        updateRank(2),
        updateGap(3),
        UNRECOGNIZED(-1);

        private static final C3414l.d<UpdateType> internalValueMap = new C3414l.d<UpdateType>() { // from class: com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionMsg.UpdateType.1
            @Override // com.google.protobuf.C3414l.d
            public UpdateType findValueByNumber(int i) {
                return UpdateType.forNumber(i);
            }
        };
        public static final int refreshAuction_VALUE = 0;
        public static final int updateGap_VALUE = 3;
        public static final int updateRank_VALUE = 2;
        public static final int updateWorth_VALUE = 1;
        private final int value;

        UpdateType(int i) {
            this.value = i;
        }

        public static UpdateType forNumber(int i) {
            if (i == 0) {
                return refreshAuction;
            }
            if (i == 1) {
                return updateWorth;
            }
            if (i == 2) {
                return updateRank;
            }
            if (i != 3) {
                return null;
            }
            return updateGap;
        }

        public static C3414l.d<UpdateType> internalGetValueMap() {
            return internalValueMap;
        }

        @Override // com.google.protobuf.C3414l.c
        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static UpdateType valueOf(int i) {
            return forNumber(i);
        }
    }

    public static final class VoiceLiveAuctionPledgeChoose extends GeneratedMessageLite<VoiceLiveAuctionPledgeChoose, Builder> implements VoiceLiveAuctionPledgeChooseOrBuilder {
        public static final int AUCTIONID_FIELD_NUMBER = 1;
        private static final VoiceLiveAuctionPledgeChoose DEFAULT_INSTANCE;
        private static volatile i860<VoiceLiveAuctionPledgeChoose> PARSER = null;
        public static final int PLEDGEANAME_FIELD_NUMBER = 2;
        public static final int PLEDGEBNAME_FIELD_NUMBER = 3;
        private String auctionId_ = "";
        private String pledgeAName_ = "";
        private String pledgeBName_ = "";

        public static final class Builder extends GeneratedMessageLite.AbstractC3380b<VoiceLiveAuctionPledgeChoose, Builder> implements VoiceLiveAuctionPledgeChooseOrBuilder {
            private Builder() {
                super(VoiceLiveAuctionPledgeChoose.DEFAULT_INSTANCE);
            }

            public Builder clearAuctionId() {
                copyOnWrite();
                ((VoiceLiveAuctionPledgeChoose) this.instance).clearAuctionId();
                return this;
            }

            public Builder clearPledgeAName() {
                copyOnWrite();
                ((VoiceLiveAuctionPledgeChoose) this.instance).clearPledgeAName();
                return this;
            }

            public Builder clearPledgeBName() {
                copyOnWrite();
                ((VoiceLiveAuctionPledgeChoose) this.instance).clearPledgeBName();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionMsg.VoiceLiveAuctionPledgeChooseOrBuilder
            public String getAuctionId() {
                return ((VoiceLiveAuctionPledgeChoose) this.instance).getAuctionId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionMsg.VoiceLiveAuctionPledgeChooseOrBuilder
            public ByteString getAuctionIdBytes() {
                return ((VoiceLiveAuctionPledgeChoose) this.instance).getAuctionIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionMsg.VoiceLiveAuctionPledgeChooseOrBuilder
            public String getPledgeAName() {
                return ((VoiceLiveAuctionPledgeChoose) this.instance).getPledgeAName();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionMsg.VoiceLiveAuctionPledgeChooseOrBuilder
            public ByteString getPledgeANameBytes() {
                return ((VoiceLiveAuctionPledgeChoose) this.instance).getPledgeANameBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionMsg.VoiceLiveAuctionPledgeChooseOrBuilder
            public String getPledgeBName() {
                return ((VoiceLiveAuctionPledgeChoose) this.instance).getPledgeBName();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionMsg.VoiceLiveAuctionPledgeChooseOrBuilder
            public ByteString getPledgeBNameBytes() {
                return ((VoiceLiveAuctionPledgeChoose) this.instance).getPledgeBNameBytes();
            }

            public Builder setAuctionId(String str) {
                copyOnWrite();
                ((VoiceLiveAuctionPledgeChoose) this.instance).setAuctionId(str);
                return this;
            }

            public Builder setAuctionIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceLiveAuctionPledgeChoose) this.instance).setAuctionIdBytes(byteString);
                return this;
            }

            public Builder setPledgeAName(String str) {
                copyOnWrite();
                ((VoiceLiveAuctionPledgeChoose) this.instance).setPledgeAName(str);
                return this;
            }

            public Builder setPledgeANameBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceLiveAuctionPledgeChoose) this.instance).setPledgeANameBytes(byteString);
                return this;
            }

            public Builder setPledgeBName(String str) {
                copyOnWrite();
                ((VoiceLiveAuctionPledgeChoose) this.instance).setPledgeBName(str);
                return this;
            }

            public Builder setPledgeBNameBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceLiveAuctionPledgeChoose) this.instance).setPledgeBNameBytes(byteString);
                return this;
            }
        }

        static {
            VoiceLiveAuctionPledgeChoose voiceLiveAuctionPledgeChoose = new VoiceLiveAuctionPledgeChoose();
            DEFAULT_INSTANCE = voiceLiveAuctionPledgeChoose;
            voiceLiveAuctionPledgeChoose.makeImmutable();
        }

        private VoiceLiveAuctionPledgeChoose() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAuctionId() {
            this.auctionId_ = getDefaultInstance().getAuctionId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPledgeAName() {
            this.pledgeAName_ = getDefaultInstance().getPledgeAName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPledgeBName() {
            this.pledgeBName_ = getDefaultInstance().getPledgeBName();
        }

        public static VoiceLiveAuctionPledgeChoose getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(VoiceLiveAuctionPledgeChoose voiceLiveAuctionPledgeChoose) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(voiceLiveAuctionPledgeChoose);
        }

        public static VoiceLiveAuctionPledgeChoose parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VoiceLiveAuctionPledgeChoose) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceLiveAuctionPledgeChoose parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VoiceLiveAuctionPledgeChoose) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<VoiceLiveAuctionPledgeChoose> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAuctionId(String str) {
            str.getClass();
            this.auctionId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAuctionIdBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.auctionId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPledgeAName(String str) {
            str.getClass();
            this.pledgeAName_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPledgeANameBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.pledgeAName_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPledgeBName(String str) {
            str.getClass();
            this.pledgeBName_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPledgeBNameBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.pledgeBName_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C45271.f15984xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoiceLiveAuctionPledgeChoose();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3386h interfaceC3386h = (GeneratedMessageLite.InterfaceC3386h) obj;
                    VoiceLiveAuctionPledgeChoose voiceLiveAuctionPledgeChoose = (VoiceLiveAuctionPledgeChoose) obj2;
                    this.auctionId_ = interfaceC3386h.mo16997f(!this.auctionId_.isEmpty(), this.auctionId_, !voiceLiveAuctionPledgeChoose.auctionId_.isEmpty(), voiceLiveAuctionPledgeChoose.auctionId_);
                    this.pledgeAName_ = interfaceC3386h.mo16997f(!this.pledgeAName_.isEmpty(), this.pledgeAName_, !voiceLiveAuctionPledgeChoose.pledgeAName_.isEmpty(), voiceLiveAuctionPledgeChoose.pledgeAName_);
                    this.pledgeBName_ = interfaceC3386h.mo16997f(!this.pledgeBName_.isEmpty(), this.pledgeBName_, true ^ voiceLiveAuctionPledgeChoose.pledgeBName_.isEmpty(), voiceLiveAuctionPledgeChoose.pledgeBName_);
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
                                    this.auctionId_ = c3407e.m17115L();
                                } else if (iM17116M == 18) {
                                    this.pledgeAName_ = c3407e.m17115L();
                                } else if (iM17116M == 26) {
                                    this.pledgeBName_ = c3407e.m17115L();
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
                        synchronized (VoiceLiveAuctionPledgeChoose.class) {
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

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionMsg.VoiceLiveAuctionPledgeChooseOrBuilder
        public String getAuctionId() {
            return this.auctionId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionMsg.VoiceLiveAuctionPledgeChooseOrBuilder
        public ByteString getAuctionIdBytes() {
            return ByteString.copyFromUtf8(this.auctionId_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionMsg.VoiceLiveAuctionPledgeChooseOrBuilder
        public String getPledgeAName() {
            return this.pledgeAName_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionMsg.VoiceLiveAuctionPledgeChooseOrBuilder
        public ByteString getPledgeANameBytes() {
            return ByteString.copyFromUtf8(this.pledgeAName_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionMsg.VoiceLiveAuctionPledgeChooseOrBuilder
        public String getPledgeBName() {
            return this.pledgeBName_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionMsg.VoiceLiveAuctionPledgeChooseOrBuilder
        public ByteString getPledgeBNameBytes() {
            return ByteString.copyFromUtf8(this.pledgeBName_);
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16901K = !this.auctionId_.isEmpty() ? CodedOutputStream.m16901K(1, getAuctionId()) : 0;
            if (!this.pledgeAName_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(2, getPledgeAName());
            }
            if (!this.pledgeBName_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(3, getPledgeBName());
            }
            this.memoizedSerializedSize = iM16901K;
            return iM16901K;
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.auctionId_.isEmpty()) {
                codedOutputStream.mo16939D0(1, getAuctionId());
            }
            if (!this.pledgeAName_.isEmpty()) {
                codedOutputStream.mo16939D0(2, getPledgeAName());
            }
            if (this.pledgeBName_.isEmpty()) {
                return;
            }
            codedOutputStream.mo16939D0(3, getPledgeBName());
        }

        public static VoiceLiveAuctionPledgeChoose parseDelimitedFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (VoiceLiveAuctionPledgeChoose) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static VoiceLiveAuctionPledgeChoose parseFrom(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
            return (VoiceLiveAuctionPledgeChoose) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3410h);
        }

        public static VoiceLiveAuctionPledgeChoose parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoiceLiveAuctionPledgeChoose) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoiceLiveAuctionPledgeChoose parseFrom(byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
            return (VoiceLiveAuctionPledgeChoose) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3410h);
        }

        public static VoiceLiveAuctionPledgeChoose parseFrom(InputStream inputStream) throws IOException {
            return (VoiceLiveAuctionPledgeChoose) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceLiveAuctionPledgeChoose parseFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (VoiceLiveAuctionPledgeChoose) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static VoiceLiveAuctionPledgeChoose parseFrom(C3407e c3407e) throws IOException {
            return (VoiceLiveAuctionPledgeChoose) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static VoiceLiveAuctionPledgeChoose parseFrom(C3407e c3407e, C3410h c3410h) throws IOException {
            return (VoiceLiveAuctionPledgeChoose) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e, c3410h);
        }
    }

    public static final class VoiceLiveAuctionUpdate extends GeneratedMessageLite<VoiceLiveAuctionUpdate, Builder> implements VoiceLiveAuctionUpdateOrBuilder {
        public static final int AUCTIONID_FIELD_NUMBER = 3;
        public static final int CURRENTTIME_FIELD_NUMBER = 2;
        private static final VoiceLiveAuctionUpdate DEFAULT_INSTANCE;
        public static final int ISCHOOSINGPLEDGERELATION_FIELD_NUMBER = 11;
        public static final int LEADERBOARDGAP_FIELD_NUMBER = 8;
        public static final int LEADERBOARDS_FIELD_NUMBER = 7;
        public static final int LEVEL_FIELD_NUMBER = 6;
        public static final int PANELBGID_FIELD_NUMBER = 5;
        private static volatile i860<VoiceLiveAuctionUpdate> PARSER = null;
        public static final int UPDATETYPE_FIELD_NUMBER = 1;
        public static final int WORTHBUBBLELEVEL_FIELD_NUMBER = 10;
        public static final int WORTHBUBBLE_FIELD_NUMBER = 9;
        public static final int WORTH_FIELD_NUMBER = 4;
        private int bitField0_;
        private long currentTime_;
        private boolean isChoosingPledgeRelation_;
        private long leaderboardGap_;
        private long level_;
        private int updateType_;
        private long worthBubbleLevel_;
        private long worth_;
        private String auctionId_ = "";
        private String panelBgId_ = "";
        private C3414l.h<AuctionLeaderboard> leaderboards_ = GeneratedMessageLite.emptyProtobufList();
        private String worthBubble_ = "";

        static {
            VoiceLiveAuctionUpdate voiceLiveAuctionUpdate = new VoiceLiveAuctionUpdate();
            DEFAULT_INSTANCE = voiceLiveAuctionUpdate;
            voiceLiveAuctionUpdate.makeImmutable();
        }

        private VoiceLiveAuctionUpdate() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllLeaderboards(Iterable<? extends AuctionLeaderboard> iterable) {
            ensureLeaderboardsIsMutable();
            AbstractC3403a.addAll(iterable, this.leaderboards_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addLeaderboards(AuctionLeaderboard.Builder builder) {
            ensureLeaderboardsIsMutable();
            this.leaderboards_.add(builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAuctionId() {
            this.auctionId_ = getDefaultInstance().getAuctionId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCurrentTime() {
            this.currentTime_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIsChoosingPledgeRelation() {
            this.isChoosingPledgeRelation_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLeaderboardGap() {
            this.leaderboardGap_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLeaderboards() {
            this.leaderboards_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLevel() {
            this.level_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPanelBgId() {
            this.panelBgId_ = getDefaultInstance().getPanelBgId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUpdateType() {
            this.updateType_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWorth() {
            this.worth_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWorthBubble() {
            this.worthBubble_ = getDefaultInstance().getWorthBubble();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWorthBubbleLevel() {
            this.worthBubbleLevel_ = 0L;
        }

        private void ensureLeaderboardsIsMutable() {
            if (this.leaderboards_.mo17085q()) {
                return;
            }
            this.leaderboards_ = GeneratedMessageLite.mutableCopy(this.leaderboards_);
        }

        public static VoiceLiveAuctionUpdate getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(VoiceLiveAuctionUpdate voiceLiveAuctionUpdate) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(voiceLiveAuctionUpdate);
        }

        public static VoiceLiveAuctionUpdate parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VoiceLiveAuctionUpdate) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceLiveAuctionUpdate parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VoiceLiveAuctionUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<VoiceLiveAuctionUpdate> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeLeaderboards(int i) {
            ensureLeaderboardsIsMutable();
            this.leaderboards_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAuctionId(String str) {
            str.getClass();
            this.auctionId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAuctionIdBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.auctionId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCurrentTime(long j) {
            this.currentTime_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIsChoosingPledgeRelation(boolean z) {
            this.isChoosingPledgeRelation_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLeaderboardGap(long j) {
            this.leaderboardGap_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLeaderboards(int i, AuctionLeaderboard.Builder builder) {
            ensureLeaderboardsIsMutable();
            this.leaderboards_.set(i, builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLevel(long j) {
            this.level_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPanelBgId(String str) {
            str.getClass();
            this.panelBgId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPanelBgIdBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.panelBgId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUpdateType(UpdateType updateType) {
            updateType.getClass();
            this.updateType_ = updateType.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUpdateTypeValue(int i) {
            this.updateType_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWorth(long j) {
            this.worth_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWorthBubble(String str) {
            str.getClass();
            this.worthBubble_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWorthBubbleBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.worthBubble_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWorthBubbleLevel(long j) {
            this.worthBubbleLevel_ = j;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C45271.f15984xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoiceLiveAuctionUpdate();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.leaderboards_.mo17084n();
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3386h interfaceC3386h = (GeneratedMessageLite.InterfaceC3386h) obj;
                    VoiceLiveAuctionUpdate voiceLiveAuctionUpdate = (VoiceLiveAuctionUpdate) obj2;
                    int i = this.updateType_;
                    boolean z2 = i != 0;
                    int i2 = voiceLiveAuctionUpdate.updateType_;
                    this.updateType_ = interfaceC3386h.mo16996e(z2, i, i2 != 0, i2);
                    long j = this.currentTime_;
                    boolean z3 = j != 0;
                    long j2 = voiceLiveAuctionUpdate.currentTime_;
                    this.currentTime_ = interfaceC3386h.mo17000i(z3, j, j2 != 0, j2);
                    this.auctionId_ = interfaceC3386h.mo16997f(!this.auctionId_.isEmpty(), this.auctionId_, !voiceLiveAuctionUpdate.auctionId_.isEmpty(), voiceLiveAuctionUpdate.auctionId_);
                    long j3 = this.worth_;
                    boolean z4 = j3 != 0;
                    long j4 = voiceLiveAuctionUpdate.worth_;
                    this.worth_ = interfaceC3386h.mo17000i(z4, j3, j4 != 0, j4);
                    this.panelBgId_ = interfaceC3386h.mo16997f(!this.panelBgId_.isEmpty(), this.panelBgId_, !voiceLiveAuctionUpdate.panelBgId_.isEmpty(), voiceLiveAuctionUpdate.panelBgId_);
                    long j5 = this.level_;
                    boolean z5 = j5 != 0;
                    long j6 = voiceLiveAuctionUpdate.level_;
                    this.level_ = interfaceC3386h.mo17000i(z5, j5, j6 != 0, j6);
                    this.leaderboards_ = interfaceC3386h.mo16998g(this.leaderboards_, voiceLiveAuctionUpdate.leaderboards_);
                    long j7 = this.leaderboardGap_;
                    boolean z6 = j7 != 0;
                    long j8 = voiceLiveAuctionUpdate.leaderboardGap_;
                    this.leaderboardGap_ = interfaceC3386h.mo17000i(z6, j7, j8 != 0, j8);
                    this.worthBubble_ = interfaceC3386h.mo16997f(!this.worthBubble_.isEmpty(), this.worthBubble_, !voiceLiveAuctionUpdate.worthBubble_.isEmpty(), voiceLiveAuctionUpdate.worthBubble_);
                    boolean z7 = false;
                    long j9 = this.worthBubbleLevel_;
                    if (j9 != 0) {
                        z7 = true;
                    }
                    long j10 = voiceLiveAuctionUpdate.worthBubbleLevel_;
                    this.worthBubbleLevel_ = interfaceC3386h.mo17000i(z7, j9, j10 != 0, j10);
                    boolean z8 = this.isChoosingPledgeRelation_;
                    boolean z9 = voiceLiveAuctionUpdate.isChoosingPledgeRelation_;
                    this.isChoosingPledgeRelation_ = interfaceC3386h.mo16995d(z8, z8, z9, z9);
                    if (interfaceC3386h == GeneratedMessageLite.C3385g.INSTANCE) {
                        this.bitField0_ |= voiceLiveAuctionUpdate.bitField0_;
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
                                case 8:
                                    this.updateType_ = c3407e.m17136p();
                                    continue;
                                case 16:
                                    this.currentTime_ = c3407e.m17142v();
                                    continue;
                                case 26:
                                    this.auctionId_ = c3407e.m17115L();
                                    continue;
                                case 32:
                                    this.worth_ = c3407e.m17142v();
                                    continue;
                                case 42:
                                    this.panelBgId_ = c3407e.m17115L();
                                    continue;
                                case 48:
                                    this.level_ = c3407e.m17142v();
                                    continue;
                                case 58:
                                    if (!this.leaderboards_.mo17085q()) {
                                        this.leaderboards_ = GeneratedMessageLite.mutableCopy(this.leaderboards_);
                                    }
                                    this.leaderboards_.add((AuctionLeaderboard) c3407e.m17143w(AuctionLeaderboard.parser(), c3410h));
                                    continue;
                                case 64:
                                    this.leaderboardGap_ = c3407e.m17142v();
                                    continue;
                                case 74:
                                    this.worthBubble_ = c3407e.m17115L();
                                    continue;
                                case 80:
                                    this.worthBubbleLevel_ = c3407e.m17142v();
                                    continue;
                                case 88:
                                    this.isChoosingPledgeRelation_ = c3407e.m17133m();
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
                        synchronized (VoiceLiveAuctionUpdate.class) {
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

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionMsg.VoiceLiveAuctionUpdateOrBuilder
        public String getAuctionId() {
            return this.auctionId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionMsg.VoiceLiveAuctionUpdateOrBuilder
        public ByteString getAuctionIdBytes() {
            return ByteString.copyFromUtf8(this.auctionId_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionMsg.VoiceLiveAuctionUpdateOrBuilder
        public long getCurrentTime() {
            return this.currentTime_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionMsg.VoiceLiveAuctionUpdateOrBuilder
        public boolean getIsChoosingPledgeRelation() {
            return this.isChoosingPledgeRelation_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionMsg.VoiceLiveAuctionUpdateOrBuilder
        public long getLeaderboardGap() {
            return this.leaderboardGap_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionMsg.VoiceLiveAuctionUpdateOrBuilder
        public AuctionLeaderboard getLeaderboards(int i) {
            return this.leaderboards_.get(i);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionMsg.VoiceLiveAuctionUpdateOrBuilder
        public int getLeaderboardsCount() {
            return this.leaderboards_.size();
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionMsg.VoiceLiveAuctionUpdateOrBuilder
        public List<AuctionLeaderboard> getLeaderboardsList() {
            return this.leaderboards_;
        }

        public AuctionLeaderboardOrBuilder getLeaderboardsOrBuilder(int i) {
            return this.leaderboards_.get(i);
        }

        public List<? extends AuctionLeaderboardOrBuilder> getLeaderboardsOrBuilderList() {
            return this.leaderboards_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionMsg.VoiceLiveAuctionUpdateOrBuilder
        public long getLevel() {
            return this.level_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionMsg.VoiceLiveAuctionUpdateOrBuilder
        public String getPanelBgId() {
            return this.panelBgId_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionMsg.VoiceLiveAuctionUpdateOrBuilder
        public ByteString getPanelBgIdBytes() {
            return ByteString.copyFromUtf8(this.panelBgId_);
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16922m = this.updateType_ != UpdateType.refreshAuction.getNumber() ? CodedOutputStream.m16922m(1, this.updateType_) : 0;
            long j = this.currentTime_;
            if (j != 0) {
                iM16922m += CodedOutputStream.m16931v(2, j);
            }
            if (!this.auctionId_.isEmpty()) {
                iM16922m += CodedOutputStream.m16901K(3, getAuctionId());
            }
            long j2 = this.worth_;
            if (j2 != 0) {
                iM16922m += CodedOutputStream.m16931v(4, j2);
            }
            if (!this.panelBgId_.isEmpty()) {
                iM16922m += CodedOutputStream.m16901K(5, getPanelBgId());
            }
            long j3 = this.level_;
            if (j3 != 0) {
                iM16922m += CodedOutputStream.m16931v(6, j3);
            }
            for (int i2 = 0; i2 < this.leaderboards_.size(); i2++) {
                iM16922m += CodedOutputStream.m16893C(7, this.leaderboards_.get(i2));
            }
            long j4 = this.leaderboardGap_;
            if (j4 != 0) {
                iM16922m += CodedOutputStream.m16931v(8, j4);
            }
            if (!this.worthBubble_.isEmpty()) {
                iM16922m += CodedOutputStream.m16901K(9, getWorthBubble());
            }
            long j5 = this.worthBubbleLevel_;
            if (j5 != 0) {
                iM16922m += CodedOutputStream.m16931v(10, j5);
            }
            boolean z = this.isChoosingPledgeRelation_;
            if (z) {
                iM16922m += CodedOutputStream.m16915f(11, z);
            }
            this.memoizedSerializedSize = iM16922m;
            return iM16922m;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionMsg.VoiceLiveAuctionUpdateOrBuilder
        public UpdateType getUpdateType() {
            UpdateType updateTypeForNumber = UpdateType.forNumber(this.updateType_);
            return updateTypeForNumber == null ? UpdateType.UNRECOGNIZED : updateTypeForNumber;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionMsg.VoiceLiveAuctionUpdateOrBuilder
        public int getUpdateTypeValue() {
            return this.updateType_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionMsg.VoiceLiveAuctionUpdateOrBuilder
        public long getWorth() {
            return this.worth_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionMsg.VoiceLiveAuctionUpdateOrBuilder
        public String getWorthBubble() {
            return this.worthBubble_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionMsg.VoiceLiveAuctionUpdateOrBuilder
        public ByteString getWorthBubbleBytes() {
            return ByteString.copyFromUtf8(this.worthBubble_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionMsg.VoiceLiveAuctionUpdateOrBuilder
        public long getWorthBubbleLevel() {
            return this.worthBubbleLevel_;
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.updateType_ != UpdateType.refreshAuction.getNumber()) {
                codedOutputStream.m16960i0(1, this.updateType_);
            }
            long j = this.currentTime_;
            if (j != 0) {
                codedOutputStream.m16972u0(2, j);
            }
            if (!this.auctionId_.isEmpty()) {
                codedOutputStream.mo16939D0(3, getAuctionId());
            }
            long j2 = this.worth_;
            if (j2 != 0) {
                codedOutputStream.m16972u0(4, j2);
            }
            if (!this.panelBgId_.isEmpty()) {
                codedOutputStream.mo16939D0(5, getPanelBgId());
            }
            long j3 = this.level_;
            if (j3 != 0) {
                codedOutputStream.m16972u0(6, j3);
            }
            for (int i = 0; i < this.leaderboards_.size(); i++) {
                codedOutputStream.mo16974w0(7, this.leaderboards_.get(i));
            }
            long j4 = this.leaderboardGap_;
            if (j4 != 0) {
                codedOutputStream.m16972u0(8, j4);
            }
            if (!this.worthBubble_.isEmpty()) {
                codedOutputStream.mo16939D0(9, getWorthBubble());
            }
            long j5 = this.worthBubbleLevel_;
            if (j5 != 0) {
                codedOutputStream.m16972u0(10, j5);
            }
            boolean z = this.isChoosingPledgeRelation_;
            if (z) {
                codedOutputStream.mo16950a0(11, z);
            }
        }

        public static VoiceLiveAuctionUpdate parseDelimitedFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (VoiceLiveAuctionUpdate) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static VoiceLiveAuctionUpdate parseFrom(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
            return (VoiceLiveAuctionUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3410h);
        }

        public static final class Builder extends GeneratedMessageLite.AbstractC3380b<VoiceLiveAuctionUpdate, Builder> implements VoiceLiveAuctionUpdateOrBuilder {
            private Builder() {
                super(VoiceLiveAuctionUpdate.DEFAULT_INSTANCE);
            }

            public Builder addAllLeaderboards(Iterable<? extends AuctionLeaderboard> iterable) {
                copyOnWrite();
                ((VoiceLiveAuctionUpdate) this.instance).addAllLeaderboards(iterable);
                return this;
            }

            public Builder addLeaderboards(AuctionLeaderboard auctionLeaderboard) {
                copyOnWrite();
                ((VoiceLiveAuctionUpdate) this.instance).addLeaderboards(auctionLeaderboard);
                return this;
            }

            public Builder clearAuctionId() {
                copyOnWrite();
                ((VoiceLiveAuctionUpdate) this.instance).clearAuctionId();
                return this;
            }

            public Builder clearCurrentTime() {
                copyOnWrite();
                ((VoiceLiveAuctionUpdate) this.instance).clearCurrentTime();
                return this;
            }

            public Builder clearIsChoosingPledgeRelation() {
                copyOnWrite();
                ((VoiceLiveAuctionUpdate) this.instance).clearIsChoosingPledgeRelation();
                return this;
            }

            public Builder clearLeaderboardGap() {
                copyOnWrite();
                ((VoiceLiveAuctionUpdate) this.instance).clearLeaderboardGap();
                return this;
            }

            public Builder clearLeaderboards() {
                copyOnWrite();
                ((VoiceLiveAuctionUpdate) this.instance).clearLeaderboards();
                return this;
            }

            public Builder clearLevel() {
                copyOnWrite();
                ((VoiceLiveAuctionUpdate) this.instance).clearLevel();
                return this;
            }

            public Builder clearPanelBgId() {
                copyOnWrite();
                ((VoiceLiveAuctionUpdate) this.instance).clearPanelBgId();
                return this;
            }

            public Builder clearUpdateType() {
                copyOnWrite();
                ((VoiceLiveAuctionUpdate) this.instance).clearUpdateType();
                return this;
            }

            public Builder clearWorth() {
                copyOnWrite();
                ((VoiceLiveAuctionUpdate) this.instance).clearWorth();
                return this;
            }

            public Builder clearWorthBubble() {
                copyOnWrite();
                ((VoiceLiveAuctionUpdate) this.instance).clearWorthBubble();
                return this;
            }

            public Builder clearWorthBubbleLevel() {
                copyOnWrite();
                ((VoiceLiveAuctionUpdate) this.instance).clearWorthBubbleLevel();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionMsg.VoiceLiveAuctionUpdateOrBuilder
            public String getAuctionId() {
                return ((VoiceLiveAuctionUpdate) this.instance).getAuctionId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionMsg.VoiceLiveAuctionUpdateOrBuilder
            public ByteString getAuctionIdBytes() {
                return ((VoiceLiveAuctionUpdate) this.instance).getAuctionIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionMsg.VoiceLiveAuctionUpdateOrBuilder
            public long getCurrentTime() {
                return ((VoiceLiveAuctionUpdate) this.instance).getCurrentTime();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionMsg.VoiceLiveAuctionUpdateOrBuilder
            public boolean getIsChoosingPledgeRelation() {
                return ((VoiceLiveAuctionUpdate) this.instance).getIsChoosingPledgeRelation();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionMsg.VoiceLiveAuctionUpdateOrBuilder
            public long getLeaderboardGap() {
                return ((VoiceLiveAuctionUpdate) this.instance).getLeaderboardGap();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionMsg.VoiceLiveAuctionUpdateOrBuilder
            public AuctionLeaderboard getLeaderboards(int i) {
                return ((VoiceLiveAuctionUpdate) this.instance).getLeaderboards(i);
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionMsg.VoiceLiveAuctionUpdateOrBuilder
            public int getLeaderboardsCount() {
                return ((VoiceLiveAuctionUpdate) this.instance).getLeaderboardsCount();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionMsg.VoiceLiveAuctionUpdateOrBuilder
            public List<AuctionLeaderboard> getLeaderboardsList() {
                return Collections.unmodifiableList(((VoiceLiveAuctionUpdate) this.instance).getLeaderboardsList());
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionMsg.VoiceLiveAuctionUpdateOrBuilder
            public long getLevel() {
                return ((VoiceLiveAuctionUpdate) this.instance).getLevel();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionMsg.VoiceLiveAuctionUpdateOrBuilder
            public String getPanelBgId() {
                return ((VoiceLiveAuctionUpdate) this.instance).getPanelBgId();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionMsg.VoiceLiveAuctionUpdateOrBuilder
            public ByteString getPanelBgIdBytes() {
                return ((VoiceLiveAuctionUpdate) this.instance).getPanelBgIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionMsg.VoiceLiveAuctionUpdateOrBuilder
            public UpdateType getUpdateType() {
                return ((VoiceLiveAuctionUpdate) this.instance).getUpdateType();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionMsg.VoiceLiveAuctionUpdateOrBuilder
            public int getUpdateTypeValue() {
                return ((VoiceLiveAuctionUpdate) this.instance).getUpdateTypeValue();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionMsg.VoiceLiveAuctionUpdateOrBuilder
            public long getWorth() {
                return ((VoiceLiveAuctionUpdate) this.instance).getWorth();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionMsg.VoiceLiveAuctionUpdateOrBuilder
            public String getWorthBubble() {
                return ((VoiceLiveAuctionUpdate) this.instance).getWorthBubble();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionMsg.VoiceLiveAuctionUpdateOrBuilder
            public ByteString getWorthBubbleBytes() {
                return ((VoiceLiveAuctionUpdate) this.instance).getWorthBubbleBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionMsg.VoiceLiveAuctionUpdateOrBuilder
            public long getWorthBubbleLevel() {
                return ((VoiceLiveAuctionUpdate) this.instance).getWorthBubbleLevel();
            }

            public Builder removeLeaderboards(int i) {
                copyOnWrite();
                ((VoiceLiveAuctionUpdate) this.instance).removeLeaderboards(i);
                return this;
            }

            public Builder setAuctionId(String str) {
                copyOnWrite();
                ((VoiceLiveAuctionUpdate) this.instance).setAuctionId(str);
                return this;
            }

            public Builder setAuctionIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceLiveAuctionUpdate) this.instance).setAuctionIdBytes(byteString);
                return this;
            }

            public Builder setCurrentTime(long j) {
                copyOnWrite();
                ((VoiceLiveAuctionUpdate) this.instance).setCurrentTime(j);
                return this;
            }

            public Builder setIsChoosingPledgeRelation(boolean z) {
                copyOnWrite();
                ((VoiceLiveAuctionUpdate) this.instance).setIsChoosingPledgeRelation(z);
                return this;
            }

            public Builder setLeaderboardGap(long j) {
                copyOnWrite();
                ((VoiceLiveAuctionUpdate) this.instance).setLeaderboardGap(j);
                return this;
            }

            public Builder setLeaderboards(int i, AuctionLeaderboard auctionLeaderboard) {
                copyOnWrite();
                ((VoiceLiveAuctionUpdate) this.instance).setLeaderboards(i, auctionLeaderboard);
                return this;
            }

            public Builder setLevel(long j) {
                copyOnWrite();
                ((VoiceLiveAuctionUpdate) this.instance).setLevel(j);
                return this;
            }

            public Builder setPanelBgId(String str) {
                copyOnWrite();
                ((VoiceLiveAuctionUpdate) this.instance).setPanelBgId(str);
                return this;
            }

            public Builder setPanelBgIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceLiveAuctionUpdate) this.instance).setPanelBgIdBytes(byteString);
                return this;
            }

            public Builder setUpdateType(UpdateType updateType) {
                copyOnWrite();
                ((VoiceLiveAuctionUpdate) this.instance).setUpdateType(updateType);
                return this;
            }

            public Builder setUpdateTypeValue(int i) {
                copyOnWrite();
                ((VoiceLiveAuctionUpdate) this.instance).setUpdateTypeValue(i);
                return this;
            }

            public Builder setWorth(long j) {
                copyOnWrite();
                ((VoiceLiveAuctionUpdate) this.instance).setWorth(j);
                return this;
            }

            public Builder setWorthBubble(String str) {
                copyOnWrite();
                ((VoiceLiveAuctionUpdate) this.instance).setWorthBubble(str);
                return this;
            }

            public Builder setWorthBubbleBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceLiveAuctionUpdate) this.instance).setWorthBubbleBytes(byteString);
                return this;
            }

            public Builder setWorthBubbleLevel(long j) {
                copyOnWrite();
                ((VoiceLiveAuctionUpdate) this.instance).setWorthBubbleLevel(j);
                return this;
            }

            public Builder addLeaderboards(int i, AuctionLeaderboard auctionLeaderboard) {
                copyOnWrite();
                ((VoiceLiveAuctionUpdate) this.instance).addLeaderboards(i, auctionLeaderboard);
                return this;
            }

            public Builder setLeaderboards(int i, AuctionLeaderboard.Builder builder) {
                copyOnWrite();
                ((VoiceLiveAuctionUpdate) this.instance).setLeaderboards(i, builder);
                return this;
            }

            public Builder addLeaderboards(AuctionLeaderboard.Builder builder) {
                copyOnWrite();
                ((VoiceLiveAuctionUpdate) this.instance).addLeaderboards(builder);
                return this;
            }

            public Builder addLeaderboards(int i, AuctionLeaderboard.Builder builder) {
                copyOnWrite();
                ((VoiceLiveAuctionUpdate) this.instance).addLeaderboards(i, builder);
                return this;
            }
        }

        public static VoiceLiveAuctionUpdate parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoiceLiveAuctionUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoiceLiveAuctionUpdate parseFrom(byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
            return (VoiceLiveAuctionUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3410h);
        }

        public static VoiceLiveAuctionUpdate parseFrom(InputStream inputStream) throws IOException {
            return (VoiceLiveAuctionUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceLiveAuctionUpdate parseFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (VoiceLiveAuctionUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static VoiceLiveAuctionUpdate parseFrom(C3407e c3407e) throws IOException {
            return (VoiceLiveAuctionUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addLeaderboards(int i, AuctionLeaderboard auctionLeaderboard) {
            auctionLeaderboard.getClass();
            ensureLeaderboardsIsMutable();
            this.leaderboards_.add(i, auctionLeaderboard);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static VoiceLiveAuctionUpdate parseFrom(C3407e c3407e, C3410h c3410h) throws IOException {
            return (VoiceLiveAuctionUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e, c3410h);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLeaderboards(int i, AuctionLeaderboard auctionLeaderboard) {
            auctionLeaderboard.getClass();
            ensureLeaderboardsIsMutable();
            this.leaderboards_.set(i, auctionLeaderboard);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addLeaderboards(AuctionLeaderboard auctionLeaderboard) {
            auctionLeaderboard.getClass();
            ensureLeaderboardsIsMutable();
            this.leaderboards_.add(auctionLeaderboard);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addLeaderboards(int i, AuctionLeaderboard.Builder builder) {
            ensureLeaderboardsIsMutable();
            this.leaderboards_.add(i, builder.build());
        }
    }
}
