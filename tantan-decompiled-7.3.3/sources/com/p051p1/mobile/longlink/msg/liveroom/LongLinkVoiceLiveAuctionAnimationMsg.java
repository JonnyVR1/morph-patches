package com.p051p1.mobile.longlink.msg.liveroom;

import com.google.protobuf.AbstractC3426a;
import com.google.protobuf.ByteString;
import com.google.protobuf.C3430e;
import com.google.protobuf.C3433h;
import com.google.protobuf.C3437l;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InterfaceC3442q;
import com.google.protobuf.InvalidProtocolBufferException;
import com.p051p1.mobile.longlink.msg.userMask.userMaskConfig;
import java.io.IOException;
import java.io.InputStream;
import p153l.iig0;
import p153l.l710;
import p153l.lfz;
import p153l.ng60;

/* JADX INFO: loaded from: classes8.dex */
public final class LongLinkVoiceLiveAuctionAnimationMsg {

    /* JADX INFO: renamed from: com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionAnimationMsg$1 */
    public static /* synthetic */ class C46761 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16702xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f16702xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16702xa1df5c61[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16702xa1df5c61[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16702xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16702xa1df5c61[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16702xa1df5c61[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16702xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f16702xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public interface VoiceLiveAuctionAnimationOrBuilder extends lfz {
        String getDaysText();

        ByteString getDaysTextBytes();

        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        String getGuestTagImage();

        ByteString getGuestTagImageBytes();

        userMaskConfig.UserMask getGuestUser();

        long getLevel();

        String getRelationName();

        ByteString getRelationNameBytes();

        AnimType getType();

        int getTypeValue();

        String getWinnerTagImage();

        ByteString getWinnerTagImageBytes();

        userMaskConfig.UserMask getWinnerUser();

        boolean hasGuestUser();

        boolean hasWinnerUser();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    private LongLinkVoiceLiveAuctionAnimationMsg() {
    }

    public static void registerAllExtensions(C3433h c3433h) {
    }

    public enum AnimType implements C3437l.c {
        settleAuction(0),
        endAuction(1),
        endPledgeAuction(2),
        UNRECOGNIZED(-1);

        public static final int endAuction_VALUE = 1;
        public static final int endPledgeAuction_VALUE = 2;
        private static final C3437l.d<AnimType> internalValueMap = new C3437l.d<AnimType>() { // from class: com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionAnimationMsg.AnimType.1
            @Override // com.google.protobuf.C3437l.d
            public AnimType findValueByNumber(int i) {
                return AnimType.forNumber(i);
            }
        };
        public static final int settleAuction_VALUE = 0;
        private final int value;

        AnimType(int i) {
            this.value = i;
        }

        public static AnimType forNumber(int i) {
            if (i == 0) {
                return settleAuction;
            }
            if (i == 1) {
                return endAuction;
            }
            if (i != 2) {
                return null;
            }
            return endPledgeAuction;
        }

        public static C3437l.d<AnimType> internalGetValueMap() {
            return internalValueMap;
        }

        @Override // com.google.protobuf.C3437l.c
        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static AnimType valueOf(int i) {
            return forNumber(i);
        }
    }

    public static final class VoiceLiveAuctionAnimation extends GeneratedMessageLite<VoiceLiveAuctionAnimation, Builder> implements VoiceLiveAuctionAnimationOrBuilder {
        public static final int DAYSTEXT_FIELD_NUMBER = 8;
        private static final VoiceLiveAuctionAnimation DEFAULT_INSTANCE;
        public static final int GUESTTAGIMAGE_FIELD_NUMBER = 6;
        public static final int GUESTUSER_FIELD_NUMBER = 2;
        public static final int LEVEL_FIELD_NUMBER = 4;
        private static volatile ng60<VoiceLiveAuctionAnimation> PARSER = null;
        public static final int RELATIONNAME_FIELD_NUMBER = 5;
        public static final int TYPE_FIELD_NUMBER = 1;
        public static final int WINNERTAGIMAGE_FIELD_NUMBER = 7;
        public static final int WINNERUSER_FIELD_NUMBER = 3;
        private userMaskConfig.UserMask guestUser_;
        private long level_;
        private int type_;
        private userMaskConfig.UserMask winnerUser_;
        private String relationName_ = "";
        private String guestTagImage_ = "";
        private String winnerTagImage_ = "";
        private String daysText_ = "";

        static {
            VoiceLiveAuctionAnimation voiceLiveAuctionAnimation = new VoiceLiveAuctionAnimation();
            DEFAULT_INSTANCE = voiceLiveAuctionAnimation;
            voiceLiveAuctionAnimation.makeImmutable();
        }

        private VoiceLiveAuctionAnimation() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDaysText() {
            this.daysText_ = getDefaultInstance().getDaysText();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGuestTagImage() {
            this.guestTagImage_ = getDefaultInstance().getGuestTagImage();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGuestUser() {
            this.guestUser_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLevel() {
            this.level_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRelationName() {
            this.relationName_ = getDefaultInstance().getRelationName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearType() {
            this.type_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWinnerTagImage() {
            this.winnerTagImage_ = getDefaultInstance().getWinnerTagImage();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWinnerUser() {
            this.winnerUser_ = null;
        }

        public static VoiceLiveAuctionAnimation getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeGuestUser(userMaskConfig.UserMask userMask) {
            userMaskConfig.UserMask userMask2 = this.guestUser_;
            if (userMask2 == null || userMask2 == userMaskConfig.UserMask.getDefaultInstance()) {
                this.guestUser_ = userMask;
            } else {
                this.guestUser_ = userMaskConfig.UserMask.newBuilder(this.guestUser_).mergeFrom(userMask).buildPartial();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeWinnerUser(userMaskConfig.UserMask userMask) {
            userMaskConfig.UserMask userMask2 = this.winnerUser_;
            if (userMask2 == null || userMask2 == userMaskConfig.UserMask.getDefaultInstance()) {
                this.winnerUser_ = userMask;
            } else {
                this.winnerUser_ = userMaskConfig.UserMask.newBuilder(this.winnerUser_).mergeFrom(userMask).buildPartial();
            }
        }

        public static Builder newBuilder(VoiceLiveAuctionAnimation voiceLiveAuctionAnimation) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(voiceLiveAuctionAnimation);
        }

        public static VoiceLiveAuctionAnimation parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VoiceLiveAuctionAnimation) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceLiveAuctionAnimation parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VoiceLiveAuctionAnimation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<VoiceLiveAuctionAnimation> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDaysText(String str) {
            str.getClass();
            this.daysText_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDaysTextBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.daysText_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGuestTagImage(String str) {
            str.getClass();
            this.guestTagImage_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGuestTagImageBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.guestTagImage_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGuestUser(userMaskConfig.UserMask.Builder builder) {
            this.guestUser_ = builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLevel(long j) {
            this.level_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRelationName(String str) {
            str.getClass();
            this.relationName_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRelationNameBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.relationName_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setType(AnimType animType) {
            animType.getClass();
            this.type_ = animType.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTypeValue(int i) {
            this.type_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWinnerTagImage(String str) {
            str.getClass();
            this.winnerTagImage_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWinnerTagImageBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.winnerTagImage_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWinnerUser(userMaskConfig.UserMask.Builder builder) {
            this.winnerUser_ = builder.build();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C46761.f16702xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoiceLiveAuctionAnimation();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    VoiceLiveAuctionAnimation voiceLiveAuctionAnimation = (VoiceLiveAuctionAnimation) obj2;
                    int i = this.type_;
                    boolean z2 = i != 0;
                    int i2 = voiceLiveAuctionAnimation.type_;
                    this.type_ = interfaceC3409h.mo17051e(z2, i, i2 != 0, i2);
                    this.guestUser_ = (userMaskConfig.UserMask) interfaceC3409h.mo17061o(this.guestUser_, voiceLiveAuctionAnimation.guestUser_);
                    this.winnerUser_ = (userMaskConfig.UserMask) interfaceC3409h.mo17061o(this.winnerUser_, voiceLiveAuctionAnimation.winnerUser_);
                    long j = this.level_;
                    boolean z3 = j != 0;
                    long j2 = voiceLiveAuctionAnimation.level_;
                    this.level_ = interfaceC3409h.mo17055i(z3, j, j2 != 0, j2);
                    this.relationName_ = interfaceC3409h.mo17052f(!this.relationName_.isEmpty(), this.relationName_, !voiceLiveAuctionAnimation.relationName_.isEmpty(), voiceLiveAuctionAnimation.relationName_);
                    this.guestTagImage_ = interfaceC3409h.mo17052f(!this.guestTagImage_.isEmpty(), this.guestTagImage_, !voiceLiveAuctionAnimation.guestTagImage_.isEmpty(), voiceLiveAuctionAnimation.guestTagImage_);
                    this.winnerTagImage_ = interfaceC3409h.mo17052f(!this.winnerTagImage_.isEmpty(), this.winnerTagImage_, !voiceLiveAuctionAnimation.winnerTagImage_.isEmpty(), voiceLiveAuctionAnimation.winnerTagImage_);
                    this.daysText_ = interfaceC3409h.mo17052f(!this.daysText_.isEmpty(), this.daysText_, !voiceLiveAuctionAnimation.daysText_.isEmpty(), voiceLiveAuctionAnimation.daysText_);
                    GeneratedMessageLite.C3408g c3408g = GeneratedMessageLite.C3408g.INSTANCE;
                    return this;
                case 6:
                    C3430e c3430e = (C3430e) obj;
                    C3433h c3433h = (C3433h) obj2;
                    while (!z) {
                        try {
                            int iM17171M = c3430e.m17171M();
                            if (iM17171M != 0) {
                                if (iM17171M == 8) {
                                    this.type_ = c3430e.m17191p();
                                } else if (iM17171M == 18) {
                                    userMaskConfig.UserMask userMask = this.guestUser_;
                                    userMaskConfig.UserMask.Builder builder = userMask != null ? userMask.toBuilder() : null;
                                    userMaskConfig.UserMask userMask2 = (userMaskConfig.UserMask) c3430e.m17198w(userMaskConfig.UserMask.parser(), c3433h);
                                    this.guestUser_ = userMask2;
                                    if (builder != null) {
                                        builder.mergeFrom(userMask2);
                                        this.guestUser_ = builder.buildPartial();
                                    }
                                } else if (iM17171M == 26) {
                                    userMaskConfig.UserMask userMask3 = this.winnerUser_;
                                    userMaskConfig.UserMask.Builder builder2 = userMask3 != null ? userMask3.toBuilder() : null;
                                    userMaskConfig.UserMask userMask4 = (userMaskConfig.UserMask) c3430e.m17198w(userMaskConfig.UserMask.parser(), c3433h);
                                    this.winnerUser_ = userMask4;
                                    if (builder2 != null) {
                                        builder2.mergeFrom(userMask4);
                                        this.winnerUser_ = builder2.buildPartial();
                                    }
                                } else if (iM17171M == 32) {
                                    this.level_ = c3430e.m17197v();
                                } else if (iM17171M == 42) {
                                    this.relationName_ = c3430e.m17170L();
                                } else if (iM17171M == 50) {
                                    this.guestTagImage_ = c3430e.m17170L();
                                } else if (iM17171M == 58) {
                                    this.winnerTagImage_ = c3430e.m17170L();
                                } else if (iM17171M == 66) {
                                    this.daysText_ = c3430e.m17170L();
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
                        synchronized (VoiceLiveAuctionAnimation.class) {
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

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionAnimationMsg.VoiceLiveAuctionAnimationOrBuilder
        public String getDaysText() {
            return this.daysText_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionAnimationMsg.VoiceLiveAuctionAnimationOrBuilder
        public ByteString getDaysTextBytes() {
            return ByteString.copyFromUtf8(this.daysText_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionAnimationMsg.VoiceLiveAuctionAnimationOrBuilder
        public String getGuestTagImage() {
            return this.guestTagImage_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionAnimationMsg.VoiceLiveAuctionAnimationOrBuilder
        public ByteString getGuestTagImageBytes() {
            return ByteString.copyFromUtf8(this.guestTagImage_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionAnimationMsg.VoiceLiveAuctionAnimationOrBuilder
        public userMaskConfig.UserMask getGuestUser() {
            userMaskConfig.UserMask userMask = this.guestUser_;
            return userMask == null ? userMaskConfig.UserMask.getDefaultInstance() : userMask;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionAnimationMsg.VoiceLiveAuctionAnimationOrBuilder
        public long getLevel() {
            return this.level_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionAnimationMsg.VoiceLiveAuctionAnimationOrBuilder
        public String getRelationName() {
            return this.relationName_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionAnimationMsg.VoiceLiveAuctionAnimationOrBuilder
        public ByteString getRelationNameBytes() {
            return ByteString.copyFromUtf8(this.relationName_);
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16977m = this.type_ != AnimType.settleAuction.getNumber() ? CodedOutputStream.m16977m(1, this.type_) : 0;
            if (this.guestUser_ != null) {
                iM16977m += CodedOutputStream.m16948C(2, getGuestUser());
            }
            if (this.winnerUser_ != null) {
                iM16977m += CodedOutputStream.m16948C(3, getWinnerUser());
            }
            long j = this.level_;
            if (j != 0) {
                iM16977m += CodedOutputStream.m16986v(4, j);
            }
            if (!this.relationName_.isEmpty()) {
                iM16977m += CodedOutputStream.m16956K(5, getRelationName());
            }
            if (!this.guestTagImage_.isEmpty()) {
                iM16977m += CodedOutputStream.m16956K(6, getGuestTagImage());
            }
            if (!this.winnerTagImage_.isEmpty()) {
                iM16977m += CodedOutputStream.m16956K(7, getWinnerTagImage());
            }
            if (!this.daysText_.isEmpty()) {
                iM16977m += CodedOutputStream.m16956K(8, getDaysText());
            }
            this.memoizedSerializedSize = iM16977m;
            return iM16977m;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionAnimationMsg.VoiceLiveAuctionAnimationOrBuilder
        public AnimType getType() {
            AnimType animTypeForNumber = AnimType.forNumber(this.type_);
            return animTypeForNumber == null ? AnimType.UNRECOGNIZED : animTypeForNumber;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionAnimationMsg.VoiceLiveAuctionAnimationOrBuilder
        public int getTypeValue() {
            return this.type_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionAnimationMsg.VoiceLiveAuctionAnimationOrBuilder
        public String getWinnerTagImage() {
            return this.winnerTagImage_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionAnimationMsg.VoiceLiveAuctionAnimationOrBuilder
        public ByteString getWinnerTagImageBytes() {
            return ByteString.copyFromUtf8(this.winnerTagImage_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionAnimationMsg.VoiceLiveAuctionAnimationOrBuilder
        public userMaskConfig.UserMask getWinnerUser() {
            userMaskConfig.UserMask userMask = this.winnerUser_;
            return userMask == null ? userMaskConfig.UserMask.getDefaultInstance() : userMask;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionAnimationMsg.VoiceLiveAuctionAnimationOrBuilder
        public boolean hasGuestUser() {
            return this.guestUser_ != null;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionAnimationMsg.VoiceLiveAuctionAnimationOrBuilder
        public boolean hasWinnerUser() {
            return this.winnerUser_ != null;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.type_ != AnimType.settleAuction.getNumber()) {
                codedOutputStream.m17015i0(1, this.type_);
            }
            if (this.guestUser_ != null) {
                codedOutputStream.mo17029w0(2, getGuestUser());
            }
            if (this.winnerUser_ != null) {
                codedOutputStream.mo17029w0(3, getWinnerUser());
            }
            long j = this.level_;
            if (j != 0) {
                codedOutputStream.m17027u0(4, j);
            }
            if (!this.relationName_.isEmpty()) {
                codedOutputStream.mo16994D0(5, getRelationName());
            }
            if (!this.guestTagImage_.isEmpty()) {
                codedOutputStream.mo16994D0(6, getGuestTagImage());
            }
            if (!this.winnerTagImage_.isEmpty()) {
                codedOutputStream.mo16994D0(7, getWinnerTagImage());
            }
            if (this.daysText_.isEmpty()) {
                return;
            }
            codedOutputStream.mo16994D0(8, getDaysText());
        }

        public static VoiceLiveAuctionAnimation parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (VoiceLiveAuctionAnimation) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static VoiceLiveAuctionAnimation parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (VoiceLiveAuctionAnimation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGuestUser(userMaskConfig.UserMask userMask) {
            userMask.getClass();
            this.guestUser_ = userMask;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWinnerUser(userMaskConfig.UserMask userMask) {
            userMask.getClass();
            this.winnerUser_ = userMask;
        }

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<VoiceLiveAuctionAnimation, Builder> implements VoiceLiveAuctionAnimationOrBuilder {
            private Builder() {
                super(VoiceLiveAuctionAnimation.DEFAULT_INSTANCE);
            }

            public Builder clearDaysText() {
                copyOnWrite();
                ((VoiceLiveAuctionAnimation) this.instance).clearDaysText();
                return this;
            }

            public Builder clearGuestTagImage() {
                copyOnWrite();
                ((VoiceLiveAuctionAnimation) this.instance).clearGuestTagImage();
                return this;
            }

            public Builder clearGuestUser() {
                copyOnWrite();
                ((VoiceLiveAuctionAnimation) this.instance).clearGuestUser();
                return this;
            }

            public Builder clearLevel() {
                copyOnWrite();
                ((VoiceLiveAuctionAnimation) this.instance).clearLevel();
                return this;
            }

            public Builder clearRelationName() {
                copyOnWrite();
                ((VoiceLiveAuctionAnimation) this.instance).clearRelationName();
                return this;
            }

            public Builder clearType() {
                copyOnWrite();
                ((VoiceLiveAuctionAnimation) this.instance).clearType();
                return this;
            }

            public Builder clearWinnerTagImage() {
                copyOnWrite();
                ((VoiceLiveAuctionAnimation) this.instance).clearWinnerTagImage();
                return this;
            }

            public Builder clearWinnerUser() {
                copyOnWrite();
                ((VoiceLiveAuctionAnimation) this.instance).clearWinnerUser();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionAnimationMsg.VoiceLiveAuctionAnimationOrBuilder
            public String getDaysText() {
                return ((VoiceLiveAuctionAnimation) this.instance).getDaysText();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionAnimationMsg.VoiceLiveAuctionAnimationOrBuilder
            public ByteString getDaysTextBytes() {
                return ((VoiceLiveAuctionAnimation) this.instance).getDaysTextBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionAnimationMsg.VoiceLiveAuctionAnimationOrBuilder
            public String getGuestTagImage() {
                return ((VoiceLiveAuctionAnimation) this.instance).getGuestTagImage();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionAnimationMsg.VoiceLiveAuctionAnimationOrBuilder
            public ByteString getGuestTagImageBytes() {
                return ((VoiceLiveAuctionAnimation) this.instance).getGuestTagImageBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionAnimationMsg.VoiceLiveAuctionAnimationOrBuilder
            public userMaskConfig.UserMask getGuestUser() {
                return ((VoiceLiveAuctionAnimation) this.instance).getGuestUser();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionAnimationMsg.VoiceLiveAuctionAnimationOrBuilder
            public long getLevel() {
                return ((VoiceLiveAuctionAnimation) this.instance).getLevel();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionAnimationMsg.VoiceLiveAuctionAnimationOrBuilder
            public String getRelationName() {
                return ((VoiceLiveAuctionAnimation) this.instance).getRelationName();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionAnimationMsg.VoiceLiveAuctionAnimationOrBuilder
            public ByteString getRelationNameBytes() {
                return ((VoiceLiveAuctionAnimation) this.instance).getRelationNameBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionAnimationMsg.VoiceLiveAuctionAnimationOrBuilder
            public AnimType getType() {
                return ((VoiceLiveAuctionAnimation) this.instance).getType();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionAnimationMsg.VoiceLiveAuctionAnimationOrBuilder
            public int getTypeValue() {
                return ((VoiceLiveAuctionAnimation) this.instance).getTypeValue();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionAnimationMsg.VoiceLiveAuctionAnimationOrBuilder
            public String getWinnerTagImage() {
                return ((VoiceLiveAuctionAnimation) this.instance).getWinnerTagImage();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionAnimationMsg.VoiceLiveAuctionAnimationOrBuilder
            public ByteString getWinnerTagImageBytes() {
                return ((VoiceLiveAuctionAnimation) this.instance).getWinnerTagImageBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionAnimationMsg.VoiceLiveAuctionAnimationOrBuilder
            public userMaskConfig.UserMask getWinnerUser() {
                return ((VoiceLiveAuctionAnimation) this.instance).getWinnerUser();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionAnimationMsg.VoiceLiveAuctionAnimationOrBuilder
            public boolean hasGuestUser() {
                return ((VoiceLiveAuctionAnimation) this.instance).hasGuestUser();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionAnimationMsg.VoiceLiveAuctionAnimationOrBuilder
            public boolean hasWinnerUser() {
                return ((VoiceLiveAuctionAnimation) this.instance).hasWinnerUser();
            }

            public Builder mergeGuestUser(userMaskConfig.UserMask userMask) {
                copyOnWrite();
                ((VoiceLiveAuctionAnimation) this.instance).mergeGuestUser(userMask);
                return this;
            }

            public Builder mergeWinnerUser(userMaskConfig.UserMask userMask) {
                copyOnWrite();
                ((VoiceLiveAuctionAnimation) this.instance).mergeWinnerUser(userMask);
                return this;
            }

            public Builder setDaysText(String str) {
                copyOnWrite();
                ((VoiceLiveAuctionAnimation) this.instance).setDaysText(str);
                return this;
            }

            public Builder setDaysTextBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceLiveAuctionAnimation) this.instance).setDaysTextBytes(byteString);
                return this;
            }

            public Builder setGuestTagImage(String str) {
                copyOnWrite();
                ((VoiceLiveAuctionAnimation) this.instance).setGuestTagImage(str);
                return this;
            }

            public Builder setGuestTagImageBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceLiveAuctionAnimation) this.instance).setGuestTagImageBytes(byteString);
                return this;
            }

            public Builder setGuestUser(userMaskConfig.UserMask userMask) {
                copyOnWrite();
                ((VoiceLiveAuctionAnimation) this.instance).setGuestUser(userMask);
                return this;
            }

            public Builder setLevel(long j) {
                copyOnWrite();
                ((VoiceLiveAuctionAnimation) this.instance).setLevel(j);
                return this;
            }

            public Builder setRelationName(String str) {
                copyOnWrite();
                ((VoiceLiveAuctionAnimation) this.instance).setRelationName(str);
                return this;
            }

            public Builder setRelationNameBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceLiveAuctionAnimation) this.instance).setRelationNameBytes(byteString);
                return this;
            }

            public Builder setType(AnimType animType) {
                copyOnWrite();
                ((VoiceLiveAuctionAnimation) this.instance).setType(animType);
                return this;
            }

            public Builder setTypeValue(int i) {
                copyOnWrite();
                ((VoiceLiveAuctionAnimation) this.instance).setTypeValue(i);
                return this;
            }

            public Builder setWinnerTagImage(String str) {
                copyOnWrite();
                ((VoiceLiveAuctionAnimation) this.instance).setWinnerTagImage(str);
                return this;
            }

            public Builder setWinnerTagImageBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceLiveAuctionAnimation) this.instance).setWinnerTagImageBytes(byteString);
                return this;
            }

            public Builder setWinnerUser(userMaskConfig.UserMask userMask) {
                copyOnWrite();
                ((VoiceLiveAuctionAnimation) this.instance).setWinnerUser(userMask);
                return this;
            }

            public Builder setGuestUser(userMaskConfig.UserMask.Builder builder) {
                copyOnWrite();
                ((VoiceLiveAuctionAnimation) this.instance).setGuestUser(builder);
                return this;
            }

            public Builder setWinnerUser(userMaskConfig.UserMask.Builder builder) {
                copyOnWrite();
                ((VoiceLiveAuctionAnimation) this.instance).setWinnerUser(builder);
                return this;
            }
        }

        public static VoiceLiveAuctionAnimation parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoiceLiveAuctionAnimation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoiceLiveAuctionAnimation parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (VoiceLiveAuctionAnimation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static VoiceLiveAuctionAnimation parseFrom(InputStream inputStream) throws IOException {
            return (VoiceLiveAuctionAnimation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceLiveAuctionAnimation parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (VoiceLiveAuctionAnimation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static VoiceLiveAuctionAnimation parseFrom(C3430e c3430e) throws IOException {
            return (VoiceLiveAuctionAnimation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static VoiceLiveAuctionAnimation parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (VoiceLiveAuctionAnimation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }
}
