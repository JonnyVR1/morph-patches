package com.p003p1.mobile.longlink.msg.liveroom;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.a;
import com.google.protobuf.e;
import com.google.protobuf.h;
import com.google.protobuf.l;
import com.google.protobuf.q;
import com.p003p1.mobile.longlink.msg.userMask.userMaskConfig;
import java.io.IOException;
import java.io.InputStream;
import l.aag0;
import l.bz00;
import l.i860;
import l.o6z;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public final class LongLinkVoiceLiveAuctionAnimationMsg {

    /* JADX INFO: renamed from: com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionAnimationMsg$1 */
    public static /* synthetic */ class C04371 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f1682xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f1682xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1682xa1df5c61[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1682xa1df5c61[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1682xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1682xa1df5c61[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1682xa1df5c61[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1682xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f1682xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public interface VoiceLiveAuctionAnimationOrBuilder extends o6z {
        String getDaysText();

        ByteString getDaysTextBytes();

        /* synthetic */ q getDefaultInstanceForType();

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

        /* synthetic */ boolean isInitialized();
    }

    private LongLinkVoiceLiveAuctionAnimationMsg() {
    }

    public static void registerAllExtensions(h hVar) {
    }

    public enum AnimType implements l.c {
        settleAuction(0),
        endAuction(1),
        endPledgeAuction(2),
        UNRECOGNIZED(-1);

        public static final int endAuction_VALUE = 1;
        public static final int endPledgeAuction_VALUE = 2;
        private static final l.d<AnimType> internalValueMap = new l.d<AnimType>() { // from class: com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionAnimationMsg.AnimType.1
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

        public static l.d<AnimType> internalGetValueMap() {
            return internalValueMap;
        }

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
        private static volatile i860<VoiceLiveAuctionAnimation> PARSER = null;
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
                this.guestUser_ = (userMaskConfig.UserMask) ((userMaskConfig.UserMask.Builder) userMaskConfig.UserMask.newBuilder(this.guestUser_).mergeFrom(userMask)).buildPartial();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeWinnerUser(userMaskConfig.UserMask userMask) {
            userMaskConfig.UserMask userMask2 = this.winnerUser_;
            if (userMask2 == null || userMask2 == userMaskConfig.UserMask.getDefaultInstance()) {
                this.winnerUser_ = userMask;
            } else {
                this.winnerUser_ = (userMaskConfig.UserMask) ((userMaskConfig.UserMask.Builder) userMaskConfig.UserMask.newBuilder(this.winnerUser_).mergeFrom(userMask)).buildPartial();
            }
        }

        public static Builder newBuilder(VoiceLiveAuctionAnimation voiceLiveAuctionAnimation) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(voiceLiveAuctionAnimation);
        }

        public static VoiceLiveAuctionAnimation parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VoiceLiveAuctionAnimation) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceLiveAuctionAnimation parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VoiceLiveAuctionAnimation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<VoiceLiveAuctionAnimation> parser() {
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
            a.checkByteStringIsUtf8(byteString);
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
            a.checkByteStringIsUtf8(byteString);
            this.guestTagImage_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGuestUser(userMaskConfig.UserMask.Builder builder) {
            this.guestUser_ = (userMaskConfig.UserMask) builder.build();
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
            a.checkByteStringIsUtf8(byteString);
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
            a.checkByteStringIsUtf8(byteString);
            this.winnerTagImage_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWinnerUser(userMaskConfig.UserMask.Builder builder) {
            this.winnerUser_ = (userMaskConfig.UserMask) builder.build();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C04371.f1682xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoiceLiveAuctionAnimation();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    VoiceLiveAuctionAnimation voiceLiveAuctionAnimation = (VoiceLiveAuctionAnimation) obj2;
                    int i = this.type_;
                    boolean z2 = i != 0;
                    int i2 = voiceLiveAuctionAnimation.type_;
                    this.type_ = hVar.e(z2, i, i2 != 0, i2);
                    this.guestUser_ = hVar.o(this.guestUser_, voiceLiveAuctionAnimation.guestUser_);
                    this.winnerUser_ = hVar.o(this.winnerUser_, voiceLiveAuctionAnimation.winnerUser_);
                    long j = this.level_;
                    boolean z3 = j != 0;
                    long j2 = voiceLiveAuctionAnimation.level_;
                    this.level_ = hVar.i(z3, j, j2 != 0, j2);
                    this.relationName_ = hVar.f(!this.relationName_.isEmpty(), this.relationName_, !voiceLiveAuctionAnimation.relationName_.isEmpty(), voiceLiveAuctionAnimation.relationName_);
                    this.guestTagImage_ = hVar.f(!this.guestTagImage_.isEmpty(), this.guestTagImage_, !voiceLiveAuctionAnimation.guestTagImage_.isEmpty(), voiceLiveAuctionAnimation.guestTagImage_);
                    this.winnerTagImage_ = hVar.f(!this.winnerTagImage_.isEmpty(), this.winnerTagImage_, !voiceLiveAuctionAnimation.winnerTagImage_.isEmpty(), voiceLiveAuctionAnimation.winnerTagImage_);
                    this.daysText_ = hVar.f(!this.daysText_.isEmpty(), this.daysText_, !voiceLiveAuctionAnimation.daysText_.isEmpty(), voiceLiveAuctionAnimation.daysText_);
                    GeneratedMessageLite.g gVar = GeneratedMessageLite.g.INSTANCE;
                    return this;
                case 6:
                    e eVar = (e) obj;
                    h hVar2 = (h) obj2;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            if (iM != 0) {
                                if (iM == 8) {
                                    this.type_ = eVar.p();
                                } else if (iM == 18) {
                                    userMaskConfig.UserMask userMask = this.guestUser_;
                                    userMaskConfig.UserMask.Builder builder = userMask != null ? (userMaskConfig.UserMask.Builder) userMask.toBuilder() : null;
                                    userMaskConfig.UserMask userMaskW = eVar.w(userMaskConfig.UserMask.parser(), hVar2);
                                    this.guestUser_ = userMaskW;
                                    if (builder != null) {
                                        builder.mergeFrom(userMaskW);
                                        this.guestUser_ = (userMaskConfig.UserMask) builder.buildPartial();
                                    }
                                } else if (iM == 26) {
                                    userMaskConfig.UserMask userMask2 = this.winnerUser_;
                                    userMaskConfig.UserMask.Builder builder2 = userMask2 != null ? (userMaskConfig.UserMask.Builder) userMask2.toBuilder() : null;
                                    userMaskConfig.UserMask userMaskW2 = eVar.w(userMaskConfig.UserMask.parser(), hVar2);
                                    this.winnerUser_ = userMaskW2;
                                    if (builder2 != null) {
                                        builder2.mergeFrom(userMaskW2);
                                        this.winnerUser_ = (userMaskConfig.UserMask) builder2.buildPartial();
                                    }
                                } else if (iM == 32) {
                                    this.level_ = eVar.v();
                                } else if (iM == 42) {
                                    this.relationName_ = eVar.L();
                                } else if (iM == 50) {
                                    this.guestTagImage_ = eVar.L();
                                } else if (iM == 58) {
                                    this.winnerTagImage_ = eVar.L();
                                } else if (iM == 66) {
                                    this.daysText_ = eVar.L();
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
                        synchronized (VoiceLiveAuctionAnimation.class) {
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

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM = this.type_ != AnimType.settleAuction.getNumber() ? CodedOutputStream.m(1, this.type_) : 0;
            if (this.guestUser_ != null) {
                iM += CodedOutputStream.C(2, getGuestUser());
            }
            if (this.winnerUser_ != null) {
                iM += CodedOutputStream.C(3, getWinnerUser());
            }
            long j = this.level_;
            if (j != 0) {
                iM += CodedOutputStream.v(4, j);
            }
            if (!this.relationName_.isEmpty()) {
                iM += CodedOutputStream.K(5, getRelationName());
            }
            if (!this.guestTagImage_.isEmpty()) {
                iM += CodedOutputStream.K(6, getGuestTagImage());
            }
            if (!this.winnerTagImage_.isEmpty()) {
                iM += CodedOutputStream.K(7, getWinnerTagImage());
            }
            if (!this.daysText_.isEmpty()) {
                iM += CodedOutputStream.K(8, getDaysText());
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iM;
            return iM;
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

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.type_ != AnimType.settleAuction.getNumber()) {
                codedOutputStream.i0(1, this.type_);
            }
            if (this.guestUser_ != null) {
                codedOutputStream.w0(2, getGuestUser());
            }
            if (this.winnerUser_ != null) {
                codedOutputStream.w0(3, getWinnerUser());
            }
            long j = this.level_;
            if (j != 0) {
                codedOutputStream.u0(4, j);
            }
            if (!this.relationName_.isEmpty()) {
                codedOutputStream.D0(5, getRelationName());
            }
            if (!this.guestTagImage_.isEmpty()) {
                codedOutputStream.D0(6, getGuestTagImage());
            }
            if (!this.winnerTagImage_.isEmpty()) {
                codedOutputStream.D0(7, getWinnerTagImage());
            }
            if (this.daysText_.isEmpty()) {
                return;
            }
            codedOutputStream.D0(8, getDaysText());
        }

        public static VoiceLiveAuctionAnimation parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (VoiceLiveAuctionAnimation) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static VoiceLiveAuctionAnimation parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (VoiceLiveAuctionAnimation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
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

        public static final class Builder extends GeneratedMessageLite.b<VoiceLiveAuctionAnimation, Builder> implements VoiceLiveAuctionAnimationOrBuilder {
            private Builder() {
                super(VoiceLiveAuctionAnimation.DEFAULT_INSTANCE);
            }

            public Builder clearDaysText() {
                copyOnWrite();
                ((VoiceLiveAuctionAnimation) ((GeneratedMessageLite.b) this).instance).clearDaysText();
                return this;
            }

            public Builder clearGuestTagImage() {
                copyOnWrite();
                ((VoiceLiveAuctionAnimation) ((GeneratedMessageLite.b) this).instance).clearGuestTagImage();
                return this;
            }

            public Builder clearGuestUser() {
                copyOnWrite();
                ((VoiceLiveAuctionAnimation) ((GeneratedMessageLite.b) this).instance).clearGuestUser();
                return this;
            }

            public Builder clearLevel() {
                copyOnWrite();
                ((VoiceLiveAuctionAnimation) ((GeneratedMessageLite.b) this).instance).clearLevel();
                return this;
            }

            public Builder clearRelationName() {
                copyOnWrite();
                ((VoiceLiveAuctionAnimation) ((GeneratedMessageLite.b) this).instance).clearRelationName();
                return this;
            }

            public Builder clearType() {
                copyOnWrite();
                ((VoiceLiveAuctionAnimation) ((GeneratedMessageLite.b) this).instance).clearType();
                return this;
            }

            public Builder clearWinnerTagImage() {
                copyOnWrite();
                ((VoiceLiveAuctionAnimation) ((GeneratedMessageLite.b) this).instance).clearWinnerTagImage();
                return this;
            }

            public Builder clearWinnerUser() {
                copyOnWrite();
                ((VoiceLiveAuctionAnimation) ((GeneratedMessageLite.b) this).instance).clearWinnerUser();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionAnimationMsg.VoiceLiveAuctionAnimationOrBuilder
            public String getDaysText() {
                return ((VoiceLiveAuctionAnimation) ((GeneratedMessageLite.b) this).instance).getDaysText();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionAnimationMsg.VoiceLiveAuctionAnimationOrBuilder
            public ByteString getDaysTextBytes() {
                return ((VoiceLiveAuctionAnimation) ((GeneratedMessageLite.b) this).instance).getDaysTextBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionAnimationMsg.VoiceLiveAuctionAnimationOrBuilder
            public String getGuestTagImage() {
                return ((VoiceLiveAuctionAnimation) ((GeneratedMessageLite.b) this).instance).getGuestTagImage();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionAnimationMsg.VoiceLiveAuctionAnimationOrBuilder
            public ByteString getGuestTagImageBytes() {
                return ((VoiceLiveAuctionAnimation) ((GeneratedMessageLite.b) this).instance).getGuestTagImageBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionAnimationMsg.VoiceLiveAuctionAnimationOrBuilder
            public userMaskConfig.UserMask getGuestUser() {
                return ((VoiceLiveAuctionAnimation) ((GeneratedMessageLite.b) this).instance).getGuestUser();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionAnimationMsg.VoiceLiveAuctionAnimationOrBuilder
            public long getLevel() {
                return ((VoiceLiveAuctionAnimation) ((GeneratedMessageLite.b) this).instance).getLevel();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionAnimationMsg.VoiceLiveAuctionAnimationOrBuilder
            public String getRelationName() {
                return ((VoiceLiveAuctionAnimation) ((GeneratedMessageLite.b) this).instance).getRelationName();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionAnimationMsg.VoiceLiveAuctionAnimationOrBuilder
            public ByteString getRelationNameBytes() {
                return ((VoiceLiveAuctionAnimation) ((GeneratedMessageLite.b) this).instance).getRelationNameBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionAnimationMsg.VoiceLiveAuctionAnimationOrBuilder
            public AnimType getType() {
                return ((VoiceLiveAuctionAnimation) ((GeneratedMessageLite.b) this).instance).getType();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionAnimationMsg.VoiceLiveAuctionAnimationOrBuilder
            public int getTypeValue() {
                return ((VoiceLiveAuctionAnimation) ((GeneratedMessageLite.b) this).instance).getTypeValue();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionAnimationMsg.VoiceLiveAuctionAnimationOrBuilder
            public String getWinnerTagImage() {
                return ((VoiceLiveAuctionAnimation) ((GeneratedMessageLite.b) this).instance).getWinnerTagImage();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionAnimationMsg.VoiceLiveAuctionAnimationOrBuilder
            public ByteString getWinnerTagImageBytes() {
                return ((VoiceLiveAuctionAnimation) ((GeneratedMessageLite.b) this).instance).getWinnerTagImageBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionAnimationMsg.VoiceLiveAuctionAnimationOrBuilder
            public userMaskConfig.UserMask getWinnerUser() {
                return ((VoiceLiveAuctionAnimation) ((GeneratedMessageLite.b) this).instance).getWinnerUser();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionAnimationMsg.VoiceLiveAuctionAnimationOrBuilder
            public boolean hasGuestUser() {
                return ((VoiceLiveAuctionAnimation) ((GeneratedMessageLite.b) this).instance).hasGuestUser();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionAnimationMsg.VoiceLiveAuctionAnimationOrBuilder
            public boolean hasWinnerUser() {
                return ((VoiceLiveAuctionAnimation) ((GeneratedMessageLite.b) this).instance).hasWinnerUser();
            }

            public Builder mergeGuestUser(userMaskConfig.UserMask userMask) {
                copyOnWrite();
                ((VoiceLiveAuctionAnimation) ((GeneratedMessageLite.b) this).instance).mergeGuestUser(userMask);
                return this;
            }

            public Builder mergeWinnerUser(userMaskConfig.UserMask userMask) {
                copyOnWrite();
                ((VoiceLiveAuctionAnimation) ((GeneratedMessageLite.b) this).instance).mergeWinnerUser(userMask);
                return this;
            }

            public Builder setDaysText(String str) {
                copyOnWrite();
                ((VoiceLiveAuctionAnimation) ((GeneratedMessageLite.b) this).instance).setDaysText(str);
                return this;
            }

            public Builder setDaysTextBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceLiveAuctionAnimation) ((GeneratedMessageLite.b) this).instance).setDaysTextBytes(byteString);
                return this;
            }

            public Builder setGuestTagImage(String str) {
                copyOnWrite();
                ((VoiceLiveAuctionAnimation) ((GeneratedMessageLite.b) this).instance).setGuestTagImage(str);
                return this;
            }

            public Builder setGuestTagImageBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceLiveAuctionAnimation) ((GeneratedMessageLite.b) this).instance).setGuestTagImageBytes(byteString);
                return this;
            }

            public Builder setGuestUser(userMaskConfig.UserMask userMask) {
                copyOnWrite();
                ((VoiceLiveAuctionAnimation) ((GeneratedMessageLite.b) this).instance).setGuestUser(userMask);
                return this;
            }

            public Builder setLevel(long j) {
                copyOnWrite();
                ((VoiceLiveAuctionAnimation) ((GeneratedMessageLite.b) this).instance).setLevel(j);
                return this;
            }

            public Builder setRelationName(String str) {
                copyOnWrite();
                ((VoiceLiveAuctionAnimation) ((GeneratedMessageLite.b) this).instance).setRelationName(str);
                return this;
            }

            public Builder setRelationNameBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceLiveAuctionAnimation) ((GeneratedMessageLite.b) this).instance).setRelationNameBytes(byteString);
                return this;
            }

            public Builder setType(AnimType animType) {
                copyOnWrite();
                ((VoiceLiveAuctionAnimation) ((GeneratedMessageLite.b) this).instance).setType(animType);
                return this;
            }

            public Builder setTypeValue(int i) {
                copyOnWrite();
                ((VoiceLiveAuctionAnimation) ((GeneratedMessageLite.b) this).instance).setTypeValue(i);
                return this;
            }

            public Builder setWinnerTagImage(String str) {
                copyOnWrite();
                ((VoiceLiveAuctionAnimation) ((GeneratedMessageLite.b) this).instance).setWinnerTagImage(str);
                return this;
            }

            public Builder setWinnerTagImageBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceLiveAuctionAnimation) ((GeneratedMessageLite.b) this).instance).setWinnerTagImageBytes(byteString);
                return this;
            }

            public Builder setWinnerUser(userMaskConfig.UserMask userMask) {
                copyOnWrite();
                ((VoiceLiveAuctionAnimation) ((GeneratedMessageLite.b) this).instance).setWinnerUser(userMask);
                return this;
            }

            public Builder setGuestUser(userMaskConfig.UserMask.Builder builder) {
                copyOnWrite();
                ((VoiceLiveAuctionAnimation) ((GeneratedMessageLite.b) this).instance).setGuestUser(builder);
                return this;
            }

            public Builder setWinnerUser(userMaskConfig.UserMask.Builder builder) {
                copyOnWrite();
                ((VoiceLiveAuctionAnimation) ((GeneratedMessageLite.b) this).instance).setWinnerUser(builder);
                return this;
            }
        }

        public static VoiceLiveAuctionAnimation parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoiceLiveAuctionAnimation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoiceLiveAuctionAnimation parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (VoiceLiveAuctionAnimation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static VoiceLiveAuctionAnimation parseFrom(InputStream inputStream) throws IOException {
            return (VoiceLiveAuctionAnimation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceLiveAuctionAnimation parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (VoiceLiveAuctionAnimation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static VoiceLiveAuctionAnimation parseFrom(e eVar) throws IOException {
            return (VoiceLiveAuctionAnimation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static VoiceLiveAuctionAnimation parseFrom(e eVar, h hVar) throws IOException {
            return (VoiceLiveAuctionAnimation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }
}
