package com.p051p1.mobile.longlink.msg.livegift;

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

/* JADX INFO: loaded from: classes8.dex */
public final class LongLinkConfession {

    /* JADX INFO: renamed from: com.p1.mobile.longlink.msg.livegift.LongLinkConfession$1 */
    public static /* synthetic */ class C45981 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16677xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f16677xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16677xa1df5c61[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16677xa1df5c61[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16677xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16677xa1df5c61[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16677xa1df5c61[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16677xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f16677xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public interface ConfessionGiftReceiveMsgOrBuilder extends lfz {
        String getConfessRecordId();

        ByteString getConfessRecordIdBytes();

        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        Gift getGift();

        String getLiveId();

        ByteString getLiveIdBytes();

        String getRoomId();

        ByteString getRoomIdBytes();

        long getShowTime();

        String getSlogan();

        ByteString getSloganBytes();

        User getUser();

        boolean hasGift();

        boolean hasUser();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface GiftOrBuilder extends lfz {
        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        String getIcon();

        ByteString getIconBytes();

        String getId();

        ByteString getIdBytes();

        long getPrice();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface GiftWallGradeFiveNoticeOrBuilder extends lfz {
        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        String getGiftIcon();

        ByteString getGiftIconBytes();

        String getGiftName();

        ByteString getGiftNameBytes();

        String getOtherUserName();

        ByteString getOtherUserNameBytes();

        String getSvgaUrl();

        ByteString getSvgaUrlBytes();

        String getUserName();

        ByteString getUserNameBytes();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface UserOrBuilder extends lfz {
        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        String getId();

        ByteString getIdBytes();

        String getImageUrl();

        ByteString getImageUrlBytes();

        String getName();

        ByteString getNameBytes();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    private LongLinkConfession() {
    }

    public static void registerAllExtensions(C3433h c3433h) {
    }

    public static final class ConfessionGiftReceiveMsg extends GeneratedMessageLite<ConfessionGiftReceiveMsg, Builder> implements ConfessionGiftReceiveMsgOrBuilder {
        public static final int CONFESSRECORDID_FIELD_NUMBER = 4;
        private static final ConfessionGiftReceiveMsg DEFAULT_INSTANCE;
        public static final int GIFT_FIELD_NUMBER = 2;
        public static final int LIVEID_FIELD_NUMBER = 6;
        private static volatile ng60<ConfessionGiftReceiveMsg> PARSER = null;
        public static final int ROOMID_FIELD_NUMBER = 5;
        public static final int SHOWTIME_FIELD_NUMBER = 7;
        public static final int SLOGAN_FIELD_NUMBER = 3;
        public static final int USER_FIELD_NUMBER = 1;
        private Gift gift_;
        private long showTime_;
        private User user_;
        private String slogan_ = "";
        private String confessRecordId_ = "";
        private String roomId_ = "";
        private String liveId_ = "";

        static {
            ConfessionGiftReceiveMsg confessionGiftReceiveMsg = new ConfessionGiftReceiveMsg();
            DEFAULT_INSTANCE = confessionGiftReceiveMsg;
            confessionGiftReceiveMsg.makeImmutable();
        }

        private ConfessionGiftReceiveMsg() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearConfessRecordId() {
            this.confessRecordId_ = getDefaultInstance().getConfessRecordId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGift() {
            this.gift_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLiveId() {
            this.liveId_ = getDefaultInstance().getLiveId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRoomId() {
            this.roomId_ = getDefaultInstance().getRoomId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearShowTime() {
            this.showTime_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSlogan() {
            this.slogan_ = getDefaultInstance().getSlogan();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUser() {
            this.user_ = null;
        }

        public static ConfessionGiftReceiveMsg getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeGift(Gift gift) {
            Gift gift2 = this.gift_;
            if (gift2 == null || gift2 == Gift.getDefaultInstance()) {
                this.gift_ = gift;
            } else {
                this.gift_ = Gift.newBuilder(this.gift_).mergeFrom(gift).buildPartial();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeUser(User user) {
            User user2 = this.user_;
            if (user2 == null || user2 == User.getDefaultInstance()) {
                this.user_ = user;
            } else {
                this.user_ = User.newBuilder(this.user_).mergeFrom(user).buildPartial();
            }
        }

        public static Builder newBuilder(ConfessionGiftReceiveMsg confessionGiftReceiveMsg) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(confessionGiftReceiveMsg);
        }

        public static ConfessionGiftReceiveMsg parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ConfessionGiftReceiveMsg) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ConfessionGiftReceiveMsg parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ConfessionGiftReceiveMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<ConfessionGiftReceiveMsg> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setConfessRecordId(String str) {
            str.getClass();
            this.confessRecordId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setConfessRecordIdBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.confessRecordId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGift(Gift.Builder builder) {
            this.gift_ = builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLiveId(String str) {
            str.getClass();
            this.liveId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLiveIdBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.roomId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setShowTime(long j) {
            this.showTime_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSlogan(String str) {
            str.getClass();
            this.slogan_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSloganBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.slogan_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUser(User.Builder builder) {
            this.user_ = builder.build();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C45981.f16677xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new ConfessionGiftReceiveMsg();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    ConfessionGiftReceiveMsg confessionGiftReceiveMsg = (ConfessionGiftReceiveMsg) obj2;
                    this.user_ = (User) interfaceC3409h.mo17061o(this.user_, confessionGiftReceiveMsg.user_);
                    this.gift_ = (Gift) interfaceC3409h.mo17061o(this.gift_, confessionGiftReceiveMsg.gift_);
                    this.slogan_ = interfaceC3409h.mo17052f(!this.slogan_.isEmpty(), this.slogan_, !confessionGiftReceiveMsg.slogan_.isEmpty(), confessionGiftReceiveMsg.slogan_);
                    this.confessRecordId_ = interfaceC3409h.mo17052f(!this.confessRecordId_.isEmpty(), this.confessRecordId_, !confessionGiftReceiveMsg.confessRecordId_.isEmpty(), confessionGiftReceiveMsg.confessRecordId_);
                    this.roomId_ = interfaceC3409h.mo17052f(!this.roomId_.isEmpty(), this.roomId_, !confessionGiftReceiveMsg.roomId_.isEmpty(), confessionGiftReceiveMsg.roomId_);
                    this.liveId_ = interfaceC3409h.mo17052f(!this.liveId_.isEmpty(), this.liveId_, !confessionGiftReceiveMsg.liveId_.isEmpty(), confessionGiftReceiveMsg.liveId_);
                    long j = this.showTime_;
                    boolean z2 = j != 0;
                    long j2 = confessionGiftReceiveMsg.showTime_;
                    this.showTime_ = interfaceC3409h.mo17055i(z2, j, j2 != 0, j2);
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
                                    User user = this.user_;
                                    User.Builder builder = user != null ? user.toBuilder() : null;
                                    User user2 = (User) c3430e.m17198w(User.parser(), c3433h);
                                    this.user_ = user2;
                                    if (builder != null) {
                                        builder.mergeFrom(user2);
                                        this.user_ = builder.buildPartial();
                                    }
                                } else if (iM17171M == 18) {
                                    Gift gift = this.gift_;
                                    Gift.Builder builder2 = gift != null ? gift.toBuilder() : null;
                                    Gift gift2 = (Gift) c3430e.m17198w(Gift.parser(), c3433h);
                                    this.gift_ = gift2;
                                    if (builder2 != null) {
                                        builder2.mergeFrom(gift2);
                                        this.gift_ = builder2.buildPartial();
                                    }
                                } else if (iM17171M == 26) {
                                    this.slogan_ = c3430e.m17170L();
                                } else if (iM17171M == 34) {
                                    this.confessRecordId_ = c3430e.m17170L();
                                } else if (iM17171M == 42) {
                                    this.roomId_ = c3430e.m17170L();
                                } else if (iM17171M == 50) {
                                    this.liveId_ = c3430e.m17170L();
                                } else if (iM17171M == 56) {
                                    this.showTime_ = c3430e.m17197v();
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
                        synchronized (ConfessionGiftReceiveMsg.class) {
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

        @Override // com.p1.mobile.longlink.msg.livegift.LongLinkConfession.ConfessionGiftReceiveMsgOrBuilder
        public String getConfessRecordId() {
            return this.confessRecordId_;
        }

        @Override // com.p1.mobile.longlink.msg.livegift.LongLinkConfession.ConfessionGiftReceiveMsgOrBuilder
        public ByteString getConfessRecordIdBytes() {
            return ByteString.copyFromUtf8(this.confessRecordId_);
        }

        @Override // com.p1.mobile.longlink.msg.livegift.LongLinkConfession.ConfessionGiftReceiveMsgOrBuilder
        public Gift getGift() {
            Gift gift = this.gift_;
            return gift == null ? Gift.getDefaultInstance() : gift;
        }

        @Override // com.p1.mobile.longlink.msg.livegift.LongLinkConfession.ConfessionGiftReceiveMsgOrBuilder
        public String getLiveId() {
            return this.liveId_;
        }

        @Override // com.p1.mobile.longlink.msg.livegift.LongLinkConfession.ConfessionGiftReceiveMsgOrBuilder
        public ByteString getLiveIdBytes() {
            return ByteString.copyFromUtf8(this.liveId_);
        }

        @Override // com.p1.mobile.longlink.msg.livegift.LongLinkConfession.ConfessionGiftReceiveMsgOrBuilder
        public String getRoomId() {
            return this.roomId_;
        }

        @Override // com.p1.mobile.longlink.msg.livegift.LongLinkConfession.ConfessionGiftReceiveMsgOrBuilder
        public ByteString getRoomIdBytes() {
            return ByteString.copyFromUtf8(this.roomId_);
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16948C = this.user_ != null ? CodedOutputStream.m16948C(1, getUser()) : 0;
            if (this.gift_ != null) {
                iM16948C += CodedOutputStream.m16948C(2, getGift());
            }
            if (!this.slogan_.isEmpty()) {
                iM16948C += CodedOutputStream.m16956K(3, getSlogan());
            }
            if (!this.confessRecordId_.isEmpty()) {
                iM16948C += CodedOutputStream.m16956K(4, getConfessRecordId());
            }
            if (!this.roomId_.isEmpty()) {
                iM16948C += CodedOutputStream.m16956K(5, getRoomId());
            }
            if (!this.liveId_.isEmpty()) {
                iM16948C += CodedOutputStream.m16956K(6, getLiveId());
            }
            long j = this.showTime_;
            if (j != 0) {
                iM16948C += CodedOutputStream.m16986v(7, j);
            }
            this.memoizedSerializedSize = iM16948C;
            return iM16948C;
        }

        @Override // com.p1.mobile.longlink.msg.livegift.LongLinkConfession.ConfessionGiftReceiveMsgOrBuilder
        public long getShowTime() {
            return this.showTime_;
        }

        @Override // com.p1.mobile.longlink.msg.livegift.LongLinkConfession.ConfessionGiftReceiveMsgOrBuilder
        public String getSlogan() {
            return this.slogan_;
        }

        @Override // com.p1.mobile.longlink.msg.livegift.LongLinkConfession.ConfessionGiftReceiveMsgOrBuilder
        public ByteString getSloganBytes() {
            return ByteString.copyFromUtf8(this.slogan_);
        }

        @Override // com.p1.mobile.longlink.msg.livegift.LongLinkConfession.ConfessionGiftReceiveMsgOrBuilder
        public User getUser() {
            User user = this.user_;
            return user == null ? User.getDefaultInstance() : user;
        }

        @Override // com.p1.mobile.longlink.msg.livegift.LongLinkConfession.ConfessionGiftReceiveMsgOrBuilder
        public boolean hasGift() {
            return this.gift_ != null;
        }

        @Override // com.p1.mobile.longlink.msg.livegift.LongLinkConfession.ConfessionGiftReceiveMsgOrBuilder
        public boolean hasUser() {
            return this.user_ != null;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.user_ != null) {
                codedOutputStream.mo17029w0(1, getUser());
            }
            if (this.gift_ != null) {
                codedOutputStream.mo17029w0(2, getGift());
            }
            if (!this.slogan_.isEmpty()) {
                codedOutputStream.mo16994D0(3, getSlogan());
            }
            if (!this.confessRecordId_.isEmpty()) {
                codedOutputStream.mo16994D0(4, getConfessRecordId());
            }
            if (!this.roomId_.isEmpty()) {
                codedOutputStream.mo16994D0(5, getRoomId());
            }
            if (!this.liveId_.isEmpty()) {
                codedOutputStream.mo16994D0(6, getLiveId());
            }
            long j = this.showTime_;
            if (j != 0) {
                codedOutputStream.m17027u0(7, j);
            }
        }

        public static ConfessionGiftReceiveMsg parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (ConfessionGiftReceiveMsg) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static ConfessionGiftReceiveMsg parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (ConfessionGiftReceiveMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGift(Gift gift) {
            gift.getClass();
            this.gift_ = gift;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUser(User user) {
            user.getClass();
            this.user_ = user;
        }

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<ConfessionGiftReceiveMsg, Builder> implements ConfessionGiftReceiveMsgOrBuilder {
            private Builder() {
                super(ConfessionGiftReceiveMsg.DEFAULT_INSTANCE);
            }

            public Builder clearConfessRecordId() {
                copyOnWrite();
                ((ConfessionGiftReceiveMsg) this.instance).clearConfessRecordId();
                return this;
            }

            public Builder clearGift() {
                copyOnWrite();
                ((ConfessionGiftReceiveMsg) this.instance).clearGift();
                return this;
            }

            public Builder clearLiveId() {
                copyOnWrite();
                ((ConfessionGiftReceiveMsg) this.instance).clearLiveId();
                return this;
            }

            public Builder clearRoomId() {
                copyOnWrite();
                ((ConfessionGiftReceiveMsg) this.instance).clearRoomId();
                return this;
            }

            public Builder clearShowTime() {
                copyOnWrite();
                ((ConfessionGiftReceiveMsg) this.instance).clearShowTime();
                return this;
            }

            public Builder clearSlogan() {
                copyOnWrite();
                ((ConfessionGiftReceiveMsg) this.instance).clearSlogan();
                return this;
            }

            public Builder clearUser() {
                copyOnWrite();
                ((ConfessionGiftReceiveMsg) this.instance).clearUser();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.livegift.LongLinkConfession.ConfessionGiftReceiveMsgOrBuilder
            public String getConfessRecordId() {
                return ((ConfessionGiftReceiveMsg) this.instance).getConfessRecordId();
            }

            @Override // com.p1.mobile.longlink.msg.livegift.LongLinkConfession.ConfessionGiftReceiveMsgOrBuilder
            public ByteString getConfessRecordIdBytes() {
                return ((ConfessionGiftReceiveMsg) this.instance).getConfessRecordIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livegift.LongLinkConfession.ConfessionGiftReceiveMsgOrBuilder
            public Gift getGift() {
                return ((ConfessionGiftReceiveMsg) this.instance).getGift();
            }

            @Override // com.p1.mobile.longlink.msg.livegift.LongLinkConfession.ConfessionGiftReceiveMsgOrBuilder
            public String getLiveId() {
                return ((ConfessionGiftReceiveMsg) this.instance).getLiveId();
            }

            @Override // com.p1.mobile.longlink.msg.livegift.LongLinkConfession.ConfessionGiftReceiveMsgOrBuilder
            public ByteString getLiveIdBytes() {
                return ((ConfessionGiftReceiveMsg) this.instance).getLiveIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livegift.LongLinkConfession.ConfessionGiftReceiveMsgOrBuilder
            public String getRoomId() {
                return ((ConfessionGiftReceiveMsg) this.instance).getRoomId();
            }

            @Override // com.p1.mobile.longlink.msg.livegift.LongLinkConfession.ConfessionGiftReceiveMsgOrBuilder
            public ByteString getRoomIdBytes() {
                return ((ConfessionGiftReceiveMsg) this.instance).getRoomIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livegift.LongLinkConfession.ConfessionGiftReceiveMsgOrBuilder
            public long getShowTime() {
                return ((ConfessionGiftReceiveMsg) this.instance).getShowTime();
            }

            @Override // com.p1.mobile.longlink.msg.livegift.LongLinkConfession.ConfessionGiftReceiveMsgOrBuilder
            public String getSlogan() {
                return ((ConfessionGiftReceiveMsg) this.instance).getSlogan();
            }

            @Override // com.p1.mobile.longlink.msg.livegift.LongLinkConfession.ConfessionGiftReceiveMsgOrBuilder
            public ByteString getSloganBytes() {
                return ((ConfessionGiftReceiveMsg) this.instance).getSloganBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livegift.LongLinkConfession.ConfessionGiftReceiveMsgOrBuilder
            public User getUser() {
                return ((ConfessionGiftReceiveMsg) this.instance).getUser();
            }

            @Override // com.p1.mobile.longlink.msg.livegift.LongLinkConfession.ConfessionGiftReceiveMsgOrBuilder
            public boolean hasGift() {
                return ((ConfessionGiftReceiveMsg) this.instance).hasGift();
            }

            @Override // com.p1.mobile.longlink.msg.livegift.LongLinkConfession.ConfessionGiftReceiveMsgOrBuilder
            public boolean hasUser() {
                return ((ConfessionGiftReceiveMsg) this.instance).hasUser();
            }

            public Builder mergeGift(Gift gift) {
                copyOnWrite();
                ((ConfessionGiftReceiveMsg) this.instance).mergeGift(gift);
                return this;
            }

            public Builder mergeUser(User user) {
                copyOnWrite();
                ((ConfessionGiftReceiveMsg) this.instance).mergeUser(user);
                return this;
            }

            public Builder setConfessRecordId(String str) {
                copyOnWrite();
                ((ConfessionGiftReceiveMsg) this.instance).setConfessRecordId(str);
                return this;
            }

            public Builder setConfessRecordIdBytes(ByteString byteString) {
                copyOnWrite();
                ((ConfessionGiftReceiveMsg) this.instance).setConfessRecordIdBytes(byteString);
                return this;
            }

            public Builder setGift(Gift gift) {
                copyOnWrite();
                ((ConfessionGiftReceiveMsg) this.instance).setGift(gift);
                return this;
            }

            public Builder setLiveId(String str) {
                copyOnWrite();
                ((ConfessionGiftReceiveMsg) this.instance).setLiveId(str);
                return this;
            }

            public Builder setLiveIdBytes(ByteString byteString) {
                copyOnWrite();
                ((ConfessionGiftReceiveMsg) this.instance).setLiveIdBytes(byteString);
                return this;
            }

            public Builder setRoomId(String str) {
                copyOnWrite();
                ((ConfessionGiftReceiveMsg) this.instance).setRoomId(str);
                return this;
            }

            public Builder setRoomIdBytes(ByteString byteString) {
                copyOnWrite();
                ((ConfessionGiftReceiveMsg) this.instance).setRoomIdBytes(byteString);
                return this;
            }

            public Builder setShowTime(long j) {
                copyOnWrite();
                ((ConfessionGiftReceiveMsg) this.instance).setShowTime(j);
                return this;
            }

            public Builder setSlogan(String str) {
                copyOnWrite();
                ((ConfessionGiftReceiveMsg) this.instance).setSlogan(str);
                return this;
            }

            public Builder setSloganBytes(ByteString byteString) {
                copyOnWrite();
                ((ConfessionGiftReceiveMsg) this.instance).setSloganBytes(byteString);
                return this;
            }

            public Builder setUser(User user) {
                copyOnWrite();
                ((ConfessionGiftReceiveMsg) this.instance).setUser(user);
                return this;
            }

            public Builder setGift(Gift.Builder builder) {
                copyOnWrite();
                ((ConfessionGiftReceiveMsg) this.instance).setGift(builder);
                return this;
            }

            public Builder setUser(User.Builder builder) {
                copyOnWrite();
                ((ConfessionGiftReceiveMsg) this.instance).setUser(builder);
                return this;
            }
        }

        public static ConfessionGiftReceiveMsg parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ConfessionGiftReceiveMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ConfessionGiftReceiveMsg parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (ConfessionGiftReceiveMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static ConfessionGiftReceiveMsg parseFrom(InputStream inputStream) throws IOException {
            return (ConfessionGiftReceiveMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ConfessionGiftReceiveMsg parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (ConfessionGiftReceiveMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static ConfessionGiftReceiveMsg parseFrom(C3430e c3430e) throws IOException {
            return (ConfessionGiftReceiveMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ConfessionGiftReceiveMsg parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (ConfessionGiftReceiveMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }

    public static final class Gift extends GeneratedMessageLite<Gift, Builder> implements GiftOrBuilder {
        private static final Gift DEFAULT_INSTANCE;
        public static final int ICON_FIELD_NUMBER = 2;
        public static final int ID_FIELD_NUMBER = 1;
        private static volatile ng60<Gift> PARSER = null;
        public static final int PRICE_FIELD_NUMBER = 3;
        private long price_;
        private String id_ = "";
        private String icon_ = "";

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<Gift, Builder> implements GiftOrBuilder {
            private Builder() {
                super(Gift.DEFAULT_INSTANCE);
            }

            public Builder clearIcon() {
                copyOnWrite();
                ((Gift) this.instance).clearIcon();
                return this;
            }

            public Builder clearId() {
                copyOnWrite();
                ((Gift) this.instance).clearId();
                return this;
            }

            public Builder clearPrice() {
                copyOnWrite();
                ((Gift) this.instance).clearPrice();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.livegift.LongLinkConfession.GiftOrBuilder
            public String getIcon() {
                return ((Gift) this.instance).getIcon();
            }

            @Override // com.p1.mobile.longlink.msg.livegift.LongLinkConfession.GiftOrBuilder
            public ByteString getIconBytes() {
                return ((Gift) this.instance).getIconBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livegift.LongLinkConfession.GiftOrBuilder
            public String getId() {
                return ((Gift) this.instance).getId();
            }

            @Override // com.p1.mobile.longlink.msg.livegift.LongLinkConfession.GiftOrBuilder
            public ByteString getIdBytes() {
                return ((Gift) this.instance).getIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livegift.LongLinkConfession.GiftOrBuilder
            public long getPrice() {
                return ((Gift) this.instance).getPrice();
            }

            public Builder setIcon(String str) {
                copyOnWrite();
                ((Gift) this.instance).setIcon(str);
                return this;
            }

            public Builder setIconBytes(ByteString byteString) {
                copyOnWrite();
                ((Gift) this.instance).setIconBytes(byteString);
                return this;
            }

            public Builder setId(String str) {
                copyOnWrite();
                ((Gift) this.instance).setId(str);
                return this;
            }

            public Builder setIdBytes(ByteString byteString) {
                copyOnWrite();
                ((Gift) this.instance).setIdBytes(byteString);
                return this;
            }

            public Builder setPrice(long j) {
                copyOnWrite();
                ((Gift) this.instance).setPrice(j);
                return this;
            }
        }

        static {
            Gift gift = new Gift();
            DEFAULT_INSTANCE = gift;
            gift.makeImmutable();
        }

        private Gift() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIcon() {
            this.icon_ = getDefaultInstance().getIcon();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearId() {
            this.id_ = getDefaultInstance().getId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPrice() {
            this.price_ = 0L;
        }

        public static Gift getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(Gift gift) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(gift);
        }

        public static Gift parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Gift) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Gift parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Gift) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<Gift> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIcon(String str) {
            str.getClass();
            this.icon_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIconBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.icon_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setId(String str) {
            str.getClass();
            this.id_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIdBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.id_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPrice(long j) {
            this.price_ = j;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C45981.f16677xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new Gift();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    Gift gift = (Gift) obj2;
                    this.id_ = interfaceC3409h.mo17052f(!this.id_.isEmpty(), this.id_, !gift.id_.isEmpty(), gift.id_);
                    this.icon_ = interfaceC3409h.mo17052f(!this.icon_.isEmpty(), this.icon_, !gift.icon_.isEmpty(), gift.icon_);
                    long j = this.price_;
                    boolean z2 = j != 0;
                    long j2 = gift.price_;
                    this.price_ = interfaceC3409h.mo17055i(z2, j, j2 != 0, j2);
                    GeneratedMessageLite.C3408g c3408g = GeneratedMessageLite.C3408g.INSTANCE;
                    return this;
                case 6:
                    C3430e c3430e = (C3430e) obj;
                    while (!z) {
                        try {
                            int iM17171M = c3430e.m17171M();
                            if (iM17171M != 0) {
                                if (iM17171M == 10) {
                                    this.id_ = c3430e.m17170L();
                                } else if (iM17171M == 18) {
                                    this.icon_ = c3430e.m17170L();
                                } else if (iM17171M == 24) {
                                    this.price_ = c3430e.m17197v();
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
                        synchronized (Gift.class) {
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

        @Override // com.p1.mobile.longlink.msg.livegift.LongLinkConfession.GiftOrBuilder
        public String getIcon() {
            return this.icon_;
        }

        @Override // com.p1.mobile.longlink.msg.livegift.LongLinkConfession.GiftOrBuilder
        public ByteString getIconBytes() {
            return ByteString.copyFromUtf8(this.icon_);
        }

        @Override // com.p1.mobile.longlink.msg.livegift.LongLinkConfession.GiftOrBuilder
        public String getId() {
            return this.id_;
        }

        @Override // com.p1.mobile.longlink.msg.livegift.LongLinkConfession.GiftOrBuilder
        public ByteString getIdBytes() {
            return ByteString.copyFromUtf8(this.id_);
        }

        @Override // com.p1.mobile.longlink.msg.livegift.LongLinkConfession.GiftOrBuilder
        public long getPrice() {
            return this.price_;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16956K = !this.id_.isEmpty() ? CodedOutputStream.m16956K(1, getId()) : 0;
            if (!this.icon_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(2, getIcon());
            }
            long j = this.price_;
            if (j != 0) {
                iM16956K += CodedOutputStream.m16986v(3, j);
            }
            this.memoizedSerializedSize = iM16956K;
            return iM16956K;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.id_.isEmpty()) {
                codedOutputStream.mo16994D0(1, getId());
            }
            if (!this.icon_.isEmpty()) {
                codedOutputStream.mo16994D0(2, getIcon());
            }
            long j = this.price_;
            if (j != 0) {
                codedOutputStream.m17027u0(3, j);
            }
        }

        public static Gift parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (Gift) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static Gift parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (Gift) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        public static Gift parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Gift) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Gift parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (Gift) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static Gift parseFrom(InputStream inputStream) throws IOException {
            return (Gift) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Gift parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (Gift) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static Gift parseFrom(C3430e c3430e) throws IOException {
            return (Gift) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Gift parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (Gift) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }

    public static final class GiftWallGradeFiveNotice extends GeneratedMessageLite<GiftWallGradeFiveNotice, Builder> implements GiftWallGradeFiveNoticeOrBuilder {
        private static final GiftWallGradeFiveNotice DEFAULT_INSTANCE;
        public static final int GIFTICON_FIELD_NUMBER = 4;
        public static final int GIFTNAME_FIELD_NUMBER = 3;
        public static final int OTHERUSERNAME_FIELD_NUMBER = 2;
        private static volatile ng60<GiftWallGradeFiveNotice> PARSER = null;
        public static final int SVGAURL_FIELD_NUMBER = 5;
        public static final int USERNAME_FIELD_NUMBER = 1;
        private String userName_ = "";
        private String otherUserName_ = "";
        private String giftName_ = "";
        private String giftIcon_ = "";
        private String svgaUrl_ = "";

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<GiftWallGradeFiveNotice, Builder> implements GiftWallGradeFiveNoticeOrBuilder {
            private Builder() {
                super(GiftWallGradeFiveNotice.DEFAULT_INSTANCE);
            }

            public Builder clearGiftIcon() {
                copyOnWrite();
                ((GiftWallGradeFiveNotice) this.instance).clearGiftIcon();
                return this;
            }

            public Builder clearGiftName() {
                copyOnWrite();
                ((GiftWallGradeFiveNotice) this.instance).clearGiftName();
                return this;
            }

            public Builder clearOtherUserName() {
                copyOnWrite();
                ((GiftWallGradeFiveNotice) this.instance).clearOtherUserName();
                return this;
            }

            public Builder clearSvgaUrl() {
                copyOnWrite();
                ((GiftWallGradeFiveNotice) this.instance).clearSvgaUrl();
                return this;
            }

            public Builder clearUserName() {
                copyOnWrite();
                ((GiftWallGradeFiveNotice) this.instance).clearUserName();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.livegift.LongLinkConfession.GiftWallGradeFiveNoticeOrBuilder
            public String getGiftIcon() {
                return ((GiftWallGradeFiveNotice) this.instance).getGiftIcon();
            }

            @Override // com.p1.mobile.longlink.msg.livegift.LongLinkConfession.GiftWallGradeFiveNoticeOrBuilder
            public ByteString getGiftIconBytes() {
                return ((GiftWallGradeFiveNotice) this.instance).getGiftIconBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livegift.LongLinkConfession.GiftWallGradeFiveNoticeOrBuilder
            public String getGiftName() {
                return ((GiftWallGradeFiveNotice) this.instance).getGiftName();
            }

            @Override // com.p1.mobile.longlink.msg.livegift.LongLinkConfession.GiftWallGradeFiveNoticeOrBuilder
            public ByteString getGiftNameBytes() {
                return ((GiftWallGradeFiveNotice) this.instance).getGiftNameBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livegift.LongLinkConfession.GiftWallGradeFiveNoticeOrBuilder
            public String getOtherUserName() {
                return ((GiftWallGradeFiveNotice) this.instance).getOtherUserName();
            }

            @Override // com.p1.mobile.longlink.msg.livegift.LongLinkConfession.GiftWallGradeFiveNoticeOrBuilder
            public ByteString getOtherUserNameBytes() {
                return ((GiftWallGradeFiveNotice) this.instance).getOtherUserNameBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livegift.LongLinkConfession.GiftWallGradeFiveNoticeOrBuilder
            public String getSvgaUrl() {
                return ((GiftWallGradeFiveNotice) this.instance).getSvgaUrl();
            }

            @Override // com.p1.mobile.longlink.msg.livegift.LongLinkConfession.GiftWallGradeFiveNoticeOrBuilder
            public ByteString getSvgaUrlBytes() {
                return ((GiftWallGradeFiveNotice) this.instance).getSvgaUrlBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livegift.LongLinkConfession.GiftWallGradeFiveNoticeOrBuilder
            public String getUserName() {
                return ((GiftWallGradeFiveNotice) this.instance).getUserName();
            }

            @Override // com.p1.mobile.longlink.msg.livegift.LongLinkConfession.GiftWallGradeFiveNoticeOrBuilder
            public ByteString getUserNameBytes() {
                return ((GiftWallGradeFiveNotice) this.instance).getUserNameBytes();
            }

            public Builder setGiftIcon(String str) {
                copyOnWrite();
                ((GiftWallGradeFiveNotice) this.instance).setGiftIcon(str);
                return this;
            }

            public Builder setGiftIconBytes(ByteString byteString) {
                copyOnWrite();
                ((GiftWallGradeFiveNotice) this.instance).setGiftIconBytes(byteString);
                return this;
            }

            public Builder setGiftName(String str) {
                copyOnWrite();
                ((GiftWallGradeFiveNotice) this.instance).setGiftName(str);
                return this;
            }

            public Builder setGiftNameBytes(ByteString byteString) {
                copyOnWrite();
                ((GiftWallGradeFiveNotice) this.instance).setGiftNameBytes(byteString);
                return this;
            }

            public Builder setOtherUserName(String str) {
                copyOnWrite();
                ((GiftWallGradeFiveNotice) this.instance).setOtherUserName(str);
                return this;
            }

            public Builder setOtherUserNameBytes(ByteString byteString) {
                copyOnWrite();
                ((GiftWallGradeFiveNotice) this.instance).setOtherUserNameBytes(byteString);
                return this;
            }

            public Builder setSvgaUrl(String str) {
                copyOnWrite();
                ((GiftWallGradeFiveNotice) this.instance).setSvgaUrl(str);
                return this;
            }

            public Builder setSvgaUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((GiftWallGradeFiveNotice) this.instance).setSvgaUrlBytes(byteString);
                return this;
            }

            public Builder setUserName(String str) {
                copyOnWrite();
                ((GiftWallGradeFiveNotice) this.instance).setUserName(str);
                return this;
            }

            public Builder setUserNameBytes(ByteString byteString) {
                copyOnWrite();
                ((GiftWallGradeFiveNotice) this.instance).setUserNameBytes(byteString);
                return this;
            }
        }

        static {
            GiftWallGradeFiveNotice giftWallGradeFiveNotice = new GiftWallGradeFiveNotice();
            DEFAULT_INSTANCE = giftWallGradeFiveNotice;
            giftWallGradeFiveNotice.makeImmutable();
        }

        private GiftWallGradeFiveNotice() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGiftIcon() {
            this.giftIcon_ = getDefaultInstance().getGiftIcon();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGiftName() {
            this.giftName_ = getDefaultInstance().getGiftName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOtherUserName() {
            this.otherUserName_ = getDefaultInstance().getOtherUserName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSvgaUrl() {
            this.svgaUrl_ = getDefaultInstance().getSvgaUrl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUserName() {
            this.userName_ = getDefaultInstance().getUserName();
        }

        public static GiftWallGradeFiveNotice getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(GiftWallGradeFiveNotice giftWallGradeFiveNotice) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(giftWallGradeFiveNotice);
        }

        public static GiftWallGradeFiveNotice parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (GiftWallGradeFiveNotice) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GiftWallGradeFiveNotice parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (GiftWallGradeFiveNotice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<GiftWallGradeFiveNotice> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGiftIcon(String str) {
            str.getClass();
            this.giftIcon_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGiftIconBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.giftIcon_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGiftName(String str) {
            str.getClass();
            this.giftName_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGiftNameBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.giftName_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOtherUserName(String str) {
            str.getClass();
            this.otherUserName_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOtherUserNameBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.otherUserName_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSvgaUrl(String str) {
            str.getClass();
            this.svgaUrl_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSvgaUrlBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.svgaUrl_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserName(String str) {
            str.getClass();
            this.userName_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserNameBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.userName_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C45981.f16677xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new GiftWallGradeFiveNotice();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    GiftWallGradeFiveNotice giftWallGradeFiveNotice = (GiftWallGradeFiveNotice) obj2;
                    this.userName_ = interfaceC3409h.mo17052f(!this.userName_.isEmpty(), this.userName_, !giftWallGradeFiveNotice.userName_.isEmpty(), giftWallGradeFiveNotice.userName_);
                    this.otherUserName_ = interfaceC3409h.mo17052f(!this.otherUserName_.isEmpty(), this.otherUserName_, !giftWallGradeFiveNotice.otherUserName_.isEmpty(), giftWallGradeFiveNotice.otherUserName_);
                    this.giftName_ = interfaceC3409h.mo17052f(!this.giftName_.isEmpty(), this.giftName_, !giftWallGradeFiveNotice.giftName_.isEmpty(), giftWallGradeFiveNotice.giftName_);
                    this.giftIcon_ = interfaceC3409h.mo17052f(!this.giftIcon_.isEmpty(), this.giftIcon_, !giftWallGradeFiveNotice.giftIcon_.isEmpty(), giftWallGradeFiveNotice.giftIcon_);
                    this.svgaUrl_ = interfaceC3409h.mo17052f(!this.svgaUrl_.isEmpty(), this.svgaUrl_, true ^ giftWallGradeFiveNotice.svgaUrl_.isEmpty(), giftWallGradeFiveNotice.svgaUrl_);
                    GeneratedMessageLite.C3408g c3408g = GeneratedMessageLite.C3408g.INSTANCE;
                    return this;
                case 6:
                    C3430e c3430e = (C3430e) obj;
                    boolean z = false;
                    while (!z) {
                        try {
                            int iM17171M = c3430e.m17171M();
                            if (iM17171M != 0) {
                                if (iM17171M == 10) {
                                    this.userName_ = c3430e.m17170L();
                                } else if (iM17171M == 18) {
                                    this.otherUserName_ = c3430e.m17170L();
                                } else if (iM17171M == 26) {
                                    this.giftName_ = c3430e.m17170L();
                                } else if (iM17171M == 34) {
                                    this.giftIcon_ = c3430e.m17170L();
                                } else if (iM17171M == 42) {
                                    this.svgaUrl_ = c3430e.m17170L();
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
                        synchronized (GiftWallGradeFiveNotice.class) {
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

        @Override // com.p1.mobile.longlink.msg.livegift.LongLinkConfession.GiftWallGradeFiveNoticeOrBuilder
        public String getGiftIcon() {
            return this.giftIcon_;
        }

        @Override // com.p1.mobile.longlink.msg.livegift.LongLinkConfession.GiftWallGradeFiveNoticeOrBuilder
        public ByteString getGiftIconBytes() {
            return ByteString.copyFromUtf8(this.giftIcon_);
        }

        @Override // com.p1.mobile.longlink.msg.livegift.LongLinkConfession.GiftWallGradeFiveNoticeOrBuilder
        public String getGiftName() {
            return this.giftName_;
        }

        @Override // com.p1.mobile.longlink.msg.livegift.LongLinkConfession.GiftWallGradeFiveNoticeOrBuilder
        public ByteString getGiftNameBytes() {
            return ByteString.copyFromUtf8(this.giftName_);
        }

        @Override // com.p1.mobile.longlink.msg.livegift.LongLinkConfession.GiftWallGradeFiveNoticeOrBuilder
        public String getOtherUserName() {
            return this.otherUserName_;
        }

        @Override // com.p1.mobile.longlink.msg.livegift.LongLinkConfession.GiftWallGradeFiveNoticeOrBuilder
        public ByteString getOtherUserNameBytes() {
            return ByteString.copyFromUtf8(this.otherUserName_);
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16956K = !this.userName_.isEmpty() ? CodedOutputStream.m16956K(1, getUserName()) : 0;
            if (!this.otherUserName_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(2, getOtherUserName());
            }
            if (!this.giftName_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(3, getGiftName());
            }
            if (!this.giftIcon_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(4, getGiftIcon());
            }
            if (!this.svgaUrl_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(5, getSvgaUrl());
            }
            this.memoizedSerializedSize = iM16956K;
            return iM16956K;
        }

        @Override // com.p1.mobile.longlink.msg.livegift.LongLinkConfession.GiftWallGradeFiveNoticeOrBuilder
        public String getSvgaUrl() {
            return this.svgaUrl_;
        }

        @Override // com.p1.mobile.longlink.msg.livegift.LongLinkConfession.GiftWallGradeFiveNoticeOrBuilder
        public ByteString getSvgaUrlBytes() {
            return ByteString.copyFromUtf8(this.svgaUrl_);
        }

        @Override // com.p1.mobile.longlink.msg.livegift.LongLinkConfession.GiftWallGradeFiveNoticeOrBuilder
        public String getUserName() {
            return this.userName_;
        }

        @Override // com.p1.mobile.longlink.msg.livegift.LongLinkConfession.GiftWallGradeFiveNoticeOrBuilder
        public ByteString getUserNameBytes() {
            return ByteString.copyFromUtf8(this.userName_);
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.userName_.isEmpty()) {
                codedOutputStream.mo16994D0(1, getUserName());
            }
            if (!this.otherUserName_.isEmpty()) {
                codedOutputStream.mo16994D0(2, getOtherUserName());
            }
            if (!this.giftName_.isEmpty()) {
                codedOutputStream.mo16994D0(3, getGiftName());
            }
            if (!this.giftIcon_.isEmpty()) {
                codedOutputStream.mo16994D0(4, getGiftIcon());
            }
            if (this.svgaUrl_.isEmpty()) {
                return;
            }
            codedOutputStream.mo16994D0(5, getSvgaUrl());
        }

        public static GiftWallGradeFiveNotice parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (GiftWallGradeFiveNotice) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static GiftWallGradeFiveNotice parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (GiftWallGradeFiveNotice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        public static GiftWallGradeFiveNotice parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (GiftWallGradeFiveNotice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static GiftWallGradeFiveNotice parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (GiftWallGradeFiveNotice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static GiftWallGradeFiveNotice parseFrom(InputStream inputStream) throws IOException {
            return (GiftWallGradeFiveNotice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GiftWallGradeFiveNotice parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (GiftWallGradeFiveNotice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static GiftWallGradeFiveNotice parseFrom(C3430e c3430e) throws IOException {
            return (GiftWallGradeFiveNotice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static GiftWallGradeFiveNotice parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (GiftWallGradeFiveNotice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }

    public static final class User extends GeneratedMessageLite<User, Builder> implements UserOrBuilder {
        private static final User DEFAULT_INSTANCE;
        public static final int ID_FIELD_NUMBER = 1;
        public static final int IMAGEURL_FIELD_NUMBER = 3;
        public static final int NAME_FIELD_NUMBER = 2;
        private static volatile ng60<User> PARSER;
        private String id_ = "";
        private String name_ = "";
        private String imageUrl_ = "";

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<User, Builder> implements UserOrBuilder {
            private Builder() {
                super(User.DEFAULT_INSTANCE);
            }

            public Builder clearId() {
                copyOnWrite();
                ((User) this.instance).clearId();
                return this;
            }

            public Builder clearImageUrl() {
                copyOnWrite();
                ((User) this.instance).clearImageUrl();
                return this;
            }

            public Builder clearName() {
                copyOnWrite();
                ((User) this.instance).clearName();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.livegift.LongLinkConfession.UserOrBuilder
            public String getId() {
                return ((User) this.instance).getId();
            }

            @Override // com.p1.mobile.longlink.msg.livegift.LongLinkConfession.UserOrBuilder
            public ByteString getIdBytes() {
                return ((User) this.instance).getIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livegift.LongLinkConfession.UserOrBuilder
            public String getImageUrl() {
                return ((User) this.instance).getImageUrl();
            }

            @Override // com.p1.mobile.longlink.msg.livegift.LongLinkConfession.UserOrBuilder
            public ByteString getImageUrlBytes() {
                return ((User) this.instance).getImageUrlBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livegift.LongLinkConfession.UserOrBuilder
            public String getName() {
                return ((User) this.instance).getName();
            }

            @Override // com.p1.mobile.longlink.msg.livegift.LongLinkConfession.UserOrBuilder
            public ByteString getNameBytes() {
                return ((User) this.instance).getNameBytes();
            }

            public Builder setId(String str) {
                copyOnWrite();
                ((User) this.instance).setId(str);
                return this;
            }

            public Builder setIdBytes(ByteString byteString) {
                copyOnWrite();
                ((User) this.instance).setIdBytes(byteString);
                return this;
            }

            public Builder setImageUrl(String str) {
                copyOnWrite();
                ((User) this.instance).setImageUrl(str);
                return this;
            }

            public Builder setImageUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((User) this.instance).setImageUrlBytes(byteString);
                return this;
            }

            public Builder setName(String str) {
                copyOnWrite();
                ((User) this.instance).setName(str);
                return this;
            }

            public Builder setNameBytes(ByteString byteString) {
                copyOnWrite();
                ((User) this.instance).setNameBytes(byteString);
                return this;
            }
        }

        static {
            User user = new User();
            DEFAULT_INSTANCE = user;
            user.makeImmutable();
        }

        private User() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearId() {
            this.id_ = getDefaultInstance().getId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearImageUrl() {
            this.imageUrl_ = getDefaultInstance().getImageUrl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearName() {
            this.name_ = getDefaultInstance().getName();
        }

        public static User getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(User user) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(user);
        }

        public static User parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (User) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static User parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (User) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<User> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setId(String str) {
            str.getClass();
            this.id_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIdBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.id_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setImageUrl(String str) {
            str.getClass();
            this.imageUrl_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setImageUrlBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.imageUrl_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setName(String str) {
            str.getClass();
            this.name_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNameBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.name_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C45981.f16677xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new User();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    User user = (User) obj2;
                    this.id_ = interfaceC3409h.mo17052f(!this.id_.isEmpty(), this.id_, !user.id_.isEmpty(), user.id_);
                    this.name_ = interfaceC3409h.mo17052f(!this.name_.isEmpty(), this.name_, !user.name_.isEmpty(), user.name_);
                    this.imageUrl_ = interfaceC3409h.mo17052f(!this.imageUrl_.isEmpty(), this.imageUrl_, true ^ user.imageUrl_.isEmpty(), user.imageUrl_);
                    GeneratedMessageLite.C3408g c3408g = GeneratedMessageLite.C3408g.INSTANCE;
                    return this;
                case 6:
                    C3430e c3430e = (C3430e) obj;
                    boolean z = false;
                    while (!z) {
                        try {
                            int iM17171M = c3430e.m17171M();
                            if (iM17171M != 0) {
                                if (iM17171M == 10) {
                                    this.id_ = c3430e.m17170L();
                                } else if (iM17171M == 18) {
                                    this.name_ = c3430e.m17170L();
                                } else if (iM17171M == 26) {
                                    this.imageUrl_ = c3430e.m17170L();
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
                        synchronized (User.class) {
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

        @Override // com.p1.mobile.longlink.msg.livegift.LongLinkConfession.UserOrBuilder
        public String getId() {
            return this.id_;
        }

        @Override // com.p1.mobile.longlink.msg.livegift.LongLinkConfession.UserOrBuilder
        public ByteString getIdBytes() {
            return ByteString.copyFromUtf8(this.id_);
        }

        @Override // com.p1.mobile.longlink.msg.livegift.LongLinkConfession.UserOrBuilder
        public String getImageUrl() {
            return this.imageUrl_;
        }

        @Override // com.p1.mobile.longlink.msg.livegift.LongLinkConfession.UserOrBuilder
        public ByteString getImageUrlBytes() {
            return ByteString.copyFromUtf8(this.imageUrl_);
        }

        @Override // com.p1.mobile.longlink.msg.livegift.LongLinkConfession.UserOrBuilder
        public String getName() {
            return this.name_;
        }

        @Override // com.p1.mobile.longlink.msg.livegift.LongLinkConfession.UserOrBuilder
        public ByteString getNameBytes() {
            return ByteString.copyFromUtf8(this.name_);
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16956K = !this.id_.isEmpty() ? CodedOutputStream.m16956K(1, getId()) : 0;
            if (!this.name_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(2, getName());
            }
            if (!this.imageUrl_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(3, getImageUrl());
            }
            this.memoizedSerializedSize = iM16956K;
            return iM16956K;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.id_.isEmpty()) {
                codedOutputStream.mo16994D0(1, getId());
            }
            if (!this.name_.isEmpty()) {
                codedOutputStream.mo16994D0(2, getName());
            }
            if (this.imageUrl_.isEmpty()) {
                return;
            }
            codedOutputStream.mo16994D0(3, getImageUrl());
        }

        public static User parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (User) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static User parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (User) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        public static User parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (User) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static User parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (User) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static User parseFrom(InputStream inputStream) throws IOException {
            return (User) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static User parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (User) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static User parseFrom(C3430e c3430e) throws IOException {
            return (User) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static User parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (User) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }
}
