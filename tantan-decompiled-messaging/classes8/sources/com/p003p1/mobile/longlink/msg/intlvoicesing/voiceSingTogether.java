package com.p003p1.mobile.longlink.msg.intlvoicesing;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.a;
import com.google.protobuf.e;
import com.google.protobuf.h;
import com.google.protobuf.q;
import com.p003p1.mobile.longlink.msg.userMask.userMaskConfig;
import java.io.IOException;
import java.io.InputStream;
import l.aag0;
import l.bz00;
import l.i860;
import l.o6z;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public final class voiceSingTogether {

    /* JADX INFO: renamed from: com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether$1 */
    public static /* synthetic */ class C03341 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f1644xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f1644xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1644xa1df5c61[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1644xa1df5c61[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1644xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1644xa1df5c61[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1644xa1df5c61[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1644xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f1644xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public interface CurrentSingOrBuilder extends o6z {
        String getAccompany();

        ByteString getAccompanyBytes();

        String getCover();

        ByteString getCoverBytes();

        /* synthetic */ q getDefaultInstanceForType();

        boolean getHasStart();

        String getLyricType();

        ByteString getLyricTypeBytes();

        String getLyricUrl();

        ByteString getLyricUrlBytes();

        userMaskConfig.UserMask getMask();

        long getOrderId();

        int getProgressMilliseconds();

        String getSongCode();

        ByteString getSongCodeBytes();

        String getTitle();

        ByteString getTitleBytes();

        String getUserId();

        ByteString getUserIdBytes();

        boolean hasMask();

        /* synthetic */ boolean isInitialized();
    }

    public interface NextSingOrBuilder extends o6z {
        String getAccompany();

        ByteString getAccompanyBytes();

        int getCountDownSeconds();

        String getCover();

        ByteString getCoverBytes();

        /* synthetic */ q getDefaultInstanceForType();

        String getLyricType();

        ByteString getLyricTypeBytes();

        String getLyricUrl();

        ByteString getLyricUrlBytes();

        userMaskConfig.UserMask getMask();

        int getRemainSeconds();

        String getSongCode();

        ByteString getSongCodeBytes();

        String getTitle();

        ByteString getTitleBytes();

        String getUserId();

        ByteString getUserIdBytes();

        boolean hasMask();

        /* synthetic */ boolean isInitialized();
    }

    public interface VoiceSingConfirmOrBuilder extends o6z {
        /* synthetic */ q getDefaultInstanceForType();

        String getId();

        ByteString getIdBytes();

        String getOrderId();

        ByteString getOrderIdBytes();

        String getTitle();

        ByteString getTitleBytes();

        /* synthetic */ boolean isInitialized();
    }

    public interface VoiceSingOrBuilder extends o6z {
        CurrentSing getCurrentSing();

        /* synthetic */ q getDefaultInstanceForType();

        String getId();

        ByteString getIdBytes();

        NextSing getNextSing();

        String getStatus();

        ByteString getStatusBytes();

        String getToast();

        ByteString getToastBytes();

        boolean hasCurrentSing();

        boolean hasNextSing();

        /* synthetic */ boolean isInitialized();
    }

    public interface VoiceSingStartOrBuilder extends o6z {
        /* synthetic */ q getDefaultInstanceForType();

        String getId();

        ByteString getIdBytes();

        String getOrderId();

        ByteString getOrderIdBytes();

        String getUserId();

        ByteString getUserIdBytes();

        /* synthetic */ boolean isInitialized();
    }

    private voiceSingTogether() {
    }

    public static void registerAllExtensions(h hVar) {
    }

    public static final class CurrentSing extends GeneratedMessageLite<CurrentSing, Builder> implements CurrentSingOrBuilder {
        public static final int ACCOMPANY_FIELD_NUMBER = 8;
        public static final int COVER_FIELD_NUMBER = 4;
        private static final CurrentSing DEFAULT_INSTANCE;
        public static final int HASSTART_FIELD_NUMBER = 11;
        public static final int LYRICTYPE_FIELD_NUMBER = 6;
        public static final int LYRICURL_FIELD_NUMBER = 7;
        public static final int MASK_FIELD_NUMBER = 2;
        public static final int ORDERID_FIELD_NUMBER = 10;
        private static volatile i860<CurrentSing> PARSER = null;
        public static final int PROGRESSMILLISECONDS_FIELD_NUMBER = 9;
        public static final int SONGCODE_FIELD_NUMBER = 5;
        public static final int TITLE_FIELD_NUMBER = 3;
        public static final int USERID_FIELD_NUMBER = 1;
        private boolean hasStart_;
        private userMaskConfig.UserMask mask_;
        private long orderId_;
        private int progressMilliseconds_;
        private String userId_ = "";
        private String title_ = "";
        private String cover_ = "";
        private String songCode_ = "";
        private String lyricType_ = "";
        private String lyricUrl_ = "";
        private String accompany_ = "";

        static {
            CurrentSing currentSing = new CurrentSing();
            DEFAULT_INSTANCE = currentSing;
            currentSing.makeImmutable();
        }

        private CurrentSing() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAccompany() {
            this.accompany_ = getDefaultInstance().getAccompany();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCover() {
            this.cover_ = getDefaultInstance().getCover();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHasStart() {
            this.hasStart_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLyricType() {
            this.lyricType_ = getDefaultInstance().getLyricType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLyricUrl() {
            this.lyricUrl_ = getDefaultInstance().getLyricUrl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMask() {
            this.mask_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOrderId() {
            this.orderId_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearProgressMilliseconds() {
            this.progressMilliseconds_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSongCode() {
            this.songCode_ = getDefaultInstance().getSongCode();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTitle() {
            this.title_ = getDefaultInstance().getTitle();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUserId() {
            this.userId_ = getDefaultInstance().getUserId();
        }

        public static CurrentSing getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeMask(userMaskConfig.UserMask userMask) {
            userMaskConfig.UserMask userMask2 = this.mask_;
            if (userMask2 == null || userMask2 == userMaskConfig.UserMask.getDefaultInstance()) {
                this.mask_ = userMask;
            } else {
                this.mask_ = (userMaskConfig.UserMask) ((userMaskConfig.UserMask.Builder) userMaskConfig.UserMask.newBuilder(this.mask_).mergeFrom(userMask)).buildPartial();
            }
        }

        public static Builder newBuilder(CurrentSing currentSing) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(currentSing);
        }

        public static CurrentSing parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (CurrentSing) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CurrentSing parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (CurrentSing) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<CurrentSing> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAccompany(String str) {
            str.getClass();
            this.accompany_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAccompanyBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.accompany_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCover(String str) {
            str.getClass();
            this.cover_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCoverBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.cover_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHasStart(boolean z) {
            this.hasStart_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLyricType(String str) {
            str.getClass();
            this.lyricType_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLyricTypeBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.lyricType_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLyricUrl(String str) {
            str.getClass();
            this.lyricUrl_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLyricUrlBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.lyricUrl_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMask(userMaskConfig.UserMask.Builder builder) {
            this.mask_ = (userMaskConfig.UserMask) builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOrderId(long j) {
            this.orderId_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setProgressMilliseconds(int i) {
            this.progressMilliseconds_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSongCode(String str) {
            str.getClass();
            this.songCode_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSongCodeBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.songCode_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTitle(String str) {
            str.getClass();
            this.title_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTitleBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.title_ = byteString.toStringUtf8();
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
            switch (C03341.f1644xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new CurrentSing();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    CurrentSing currentSing = (CurrentSing) obj2;
                    this.userId_ = hVar.f(!this.userId_.isEmpty(), this.userId_, !currentSing.userId_.isEmpty(), currentSing.userId_);
                    this.mask_ = hVar.o(this.mask_, currentSing.mask_);
                    this.title_ = hVar.f(!this.title_.isEmpty(), this.title_, !currentSing.title_.isEmpty(), currentSing.title_);
                    this.cover_ = hVar.f(!this.cover_.isEmpty(), this.cover_, !currentSing.cover_.isEmpty(), currentSing.cover_);
                    this.songCode_ = hVar.f(!this.songCode_.isEmpty(), this.songCode_, !currentSing.songCode_.isEmpty(), currentSing.songCode_);
                    this.lyricType_ = hVar.f(!this.lyricType_.isEmpty(), this.lyricType_, !currentSing.lyricType_.isEmpty(), currentSing.lyricType_);
                    this.lyricUrl_ = hVar.f(!this.lyricUrl_.isEmpty(), this.lyricUrl_, !currentSing.lyricUrl_.isEmpty(), currentSing.lyricUrl_);
                    this.accompany_ = hVar.f(!this.accompany_.isEmpty(), this.accompany_, !currentSing.accompany_.isEmpty(), currentSing.accompany_);
                    int i = this.progressMilliseconds_;
                    boolean z2 = i != 0;
                    int i2 = currentSing.progressMilliseconds_;
                    this.progressMilliseconds_ = hVar.e(z2, i, i2 != 0, i2);
                    long j = this.orderId_;
                    boolean z3 = j != 0;
                    long j2 = currentSing.orderId_;
                    this.orderId_ = hVar.i(z3, j, j2 != 0, j2);
                    boolean z4 = this.hasStart_;
                    boolean z5 = currentSing.hasStart_;
                    this.hasStart_ = hVar.d(z4, z4, z5, z5);
                    GeneratedMessageLite.g gVar = GeneratedMessageLite.g.INSTANCE;
                    return this;
                case 6:
                    e eVar = (e) obj;
                    h hVar2 = (h) obj2;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            switch (iM) {
                                case 0:
                                    break;
                                case 10:
                                    this.userId_ = eVar.L();
                                    continue;
                                case 18:
                                    userMaskConfig.UserMask userMask = this.mask_;
                                    userMaskConfig.UserMask.Builder builder = userMask != null ? (userMaskConfig.UserMask.Builder) userMask.toBuilder() : null;
                                    userMaskConfig.UserMask userMaskW = eVar.w(userMaskConfig.UserMask.parser(), hVar2);
                                    this.mask_ = userMaskW;
                                    if (builder != null) {
                                        builder.mergeFrom(userMaskW);
                                        this.mask_ = (userMaskConfig.UserMask) builder.buildPartial();
                                    } else {
                                        continue;
                                    }
                                    break;
                                case 26:
                                    this.title_ = eVar.L();
                                    continue;
                                case 34:
                                    this.cover_ = eVar.L();
                                    continue;
                                case 42:
                                    this.songCode_ = eVar.L();
                                    continue;
                                case 50:
                                    this.lyricType_ = eVar.L();
                                    continue;
                                case 58:
                                    this.lyricUrl_ = eVar.L();
                                    continue;
                                case 66:
                                    this.accompany_ = eVar.L();
                                    continue;
                                case 72:
                                    this.progressMilliseconds_ = eVar.u();
                                    continue;
                                case 80:
                                    this.orderId_ = eVar.v();
                                    continue;
                                case 88:
                                    this.hasStart_ = eVar.m();
                                    continue;
                                default:
                                    if (!eVar.R(iM)) {
                                        break;
                                    }
                                    break;
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
                        synchronized (CurrentSing.class) {
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

        @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.CurrentSingOrBuilder
        public String getAccompany() {
            return this.accompany_;
        }

        @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.CurrentSingOrBuilder
        public ByteString getAccompanyBytes() {
            return ByteString.copyFromUtf8(this.accompany_);
        }

        @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.CurrentSingOrBuilder
        public String getCover() {
            return this.cover_;
        }

        @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.CurrentSingOrBuilder
        public ByteString getCoverBytes() {
            return ByteString.copyFromUtf8(this.cover_);
        }

        @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.CurrentSingOrBuilder
        public boolean getHasStart() {
            return this.hasStart_;
        }

        @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.CurrentSingOrBuilder
        public String getLyricType() {
            return this.lyricType_;
        }

        @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.CurrentSingOrBuilder
        public ByteString getLyricTypeBytes() {
            return ByteString.copyFromUtf8(this.lyricType_);
        }

        @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.CurrentSingOrBuilder
        public String getLyricUrl() {
            return this.lyricUrl_;
        }

        @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.CurrentSingOrBuilder
        public ByteString getLyricUrlBytes() {
            return ByteString.copyFromUtf8(this.lyricUrl_);
        }

        @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.CurrentSingOrBuilder
        public userMaskConfig.UserMask getMask() {
            userMaskConfig.UserMask userMask = this.mask_;
            return userMask == null ? userMaskConfig.UserMask.getDefaultInstance() : userMask;
        }

        @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.CurrentSingOrBuilder
        public long getOrderId() {
            return this.orderId_;
        }

        @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.CurrentSingOrBuilder
        public int getProgressMilliseconds() {
            return this.progressMilliseconds_;
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iK = !this.userId_.isEmpty() ? CodedOutputStream.K(1, getUserId()) : 0;
            if (this.mask_ != null) {
                iK += CodedOutputStream.C(2, getMask());
            }
            if (!this.title_.isEmpty()) {
                iK += CodedOutputStream.K(3, getTitle());
            }
            if (!this.cover_.isEmpty()) {
                iK += CodedOutputStream.K(4, getCover());
            }
            if (!this.songCode_.isEmpty()) {
                iK += CodedOutputStream.K(5, getSongCode());
            }
            if (!this.lyricType_.isEmpty()) {
                iK += CodedOutputStream.K(6, getLyricType());
            }
            if (!this.lyricUrl_.isEmpty()) {
                iK += CodedOutputStream.K(7, getLyricUrl());
            }
            if (!this.accompany_.isEmpty()) {
                iK += CodedOutputStream.K(8, getAccompany());
            }
            int i2 = this.progressMilliseconds_;
            if (i2 != 0) {
                iK += CodedOutputStream.t(9, i2);
            }
            long j = this.orderId_;
            if (j != 0) {
                iK += CodedOutputStream.v(10, j);
            }
            boolean z = this.hasStart_;
            if (z) {
                iK += CodedOutputStream.f(11, z);
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iK;
            return iK;
        }

        @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.CurrentSingOrBuilder
        public String getSongCode() {
            return this.songCode_;
        }

        @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.CurrentSingOrBuilder
        public ByteString getSongCodeBytes() {
            return ByteString.copyFromUtf8(this.songCode_);
        }

        @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.CurrentSingOrBuilder
        public String getTitle() {
            return this.title_;
        }

        @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.CurrentSingOrBuilder
        public ByteString getTitleBytes() {
            return ByteString.copyFromUtf8(this.title_);
        }

        @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.CurrentSingOrBuilder
        public String getUserId() {
            return this.userId_;
        }

        @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.CurrentSingOrBuilder
        public ByteString getUserIdBytes() {
            return ByteString.copyFromUtf8(this.userId_);
        }

        @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.CurrentSingOrBuilder
        public boolean hasMask() {
            return this.mask_ != null;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.userId_.isEmpty()) {
                codedOutputStream.D0(1, getUserId());
            }
            if (this.mask_ != null) {
                codedOutputStream.w0(2, getMask());
            }
            if (!this.title_.isEmpty()) {
                codedOutputStream.D0(3, getTitle());
            }
            if (!this.cover_.isEmpty()) {
                codedOutputStream.D0(4, getCover());
            }
            if (!this.songCode_.isEmpty()) {
                codedOutputStream.D0(5, getSongCode());
            }
            if (!this.lyricType_.isEmpty()) {
                codedOutputStream.D0(6, getLyricType());
            }
            if (!this.lyricUrl_.isEmpty()) {
                codedOutputStream.D0(7, getLyricUrl());
            }
            if (!this.accompany_.isEmpty()) {
                codedOutputStream.D0(8, getAccompany());
            }
            int i = this.progressMilliseconds_;
            if (i != 0) {
                codedOutputStream.s0(9, i);
            }
            long j = this.orderId_;
            if (j != 0) {
                codedOutputStream.u0(10, j);
            }
            boolean z = this.hasStart_;
            if (z) {
                codedOutputStream.a0(11, z);
            }
        }

        public static CurrentSing parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (CurrentSing) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static CurrentSing parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (CurrentSing) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMask(userMaskConfig.UserMask userMask) {
            userMask.getClass();
            this.mask_ = userMask;
        }

        public static final class Builder extends GeneratedMessageLite.b<CurrentSing, Builder> implements CurrentSingOrBuilder {
            private Builder() {
                super(CurrentSing.DEFAULT_INSTANCE);
            }

            public Builder clearAccompany() {
                copyOnWrite();
                ((CurrentSing) ((GeneratedMessageLite.b) this).instance).clearAccompany();
                return this;
            }

            public Builder clearCover() {
                copyOnWrite();
                ((CurrentSing) ((GeneratedMessageLite.b) this).instance).clearCover();
                return this;
            }

            public Builder clearHasStart() {
                copyOnWrite();
                ((CurrentSing) ((GeneratedMessageLite.b) this).instance).clearHasStart();
                return this;
            }

            public Builder clearLyricType() {
                copyOnWrite();
                ((CurrentSing) ((GeneratedMessageLite.b) this).instance).clearLyricType();
                return this;
            }

            public Builder clearLyricUrl() {
                copyOnWrite();
                ((CurrentSing) ((GeneratedMessageLite.b) this).instance).clearLyricUrl();
                return this;
            }

            public Builder clearMask() {
                copyOnWrite();
                ((CurrentSing) ((GeneratedMessageLite.b) this).instance).clearMask();
                return this;
            }

            public Builder clearOrderId() {
                copyOnWrite();
                ((CurrentSing) ((GeneratedMessageLite.b) this).instance).clearOrderId();
                return this;
            }

            public Builder clearProgressMilliseconds() {
                copyOnWrite();
                ((CurrentSing) ((GeneratedMessageLite.b) this).instance).clearProgressMilliseconds();
                return this;
            }

            public Builder clearSongCode() {
                copyOnWrite();
                ((CurrentSing) ((GeneratedMessageLite.b) this).instance).clearSongCode();
                return this;
            }

            public Builder clearTitle() {
                copyOnWrite();
                ((CurrentSing) ((GeneratedMessageLite.b) this).instance).clearTitle();
                return this;
            }

            public Builder clearUserId() {
                copyOnWrite();
                ((CurrentSing) ((GeneratedMessageLite.b) this).instance).clearUserId();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.CurrentSingOrBuilder
            public String getAccompany() {
                return ((CurrentSing) ((GeneratedMessageLite.b) this).instance).getAccompany();
            }

            @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.CurrentSingOrBuilder
            public ByteString getAccompanyBytes() {
                return ((CurrentSing) ((GeneratedMessageLite.b) this).instance).getAccompanyBytes();
            }

            @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.CurrentSingOrBuilder
            public String getCover() {
                return ((CurrentSing) ((GeneratedMessageLite.b) this).instance).getCover();
            }

            @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.CurrentSingOrBuilder
            public ByteString getCoverBytes() {
                return ((CurrentSing) ((GeneratedMessageLite.b) this).instance).getCoverBytes();
            }

            @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.CurrentSingOrBuilder
            public boolean getHasStart() {
                return ((CurrentSing) ((GeneratedMessageLite.b) this).instance).getHasStart();
            }

            @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.CurrentSingOrBuilder
            public String getLyricType() {
                return ((CurrentSing) ((GeneratedMessageLite.b) this).instance).getLyricType();
            }

            @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.CurrentSingOrBuilder
            public ByteString getLyricTypeBytes() {
                return ((CurrentSing) ((GeneratedMessageLite.b) this).instance).getLyricTypeBytes();
            }

            @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.CurrentSingOrBuilder
            public String getLyricUrl() {
                return ((CurrentSing) ((GeneratedMessageLite.b) this).instance).getLyricUrl();
            }

            @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.CurrentSingOrBuilder
            public ByteString getLyricUrlBytes() {
                return ((CurrentSing) ((GeneratedMessageLite.b) this).instance).getLyricUrlBytes();
            }

            @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.CurrentSingOrBuilder
            public userMaskConfig.UserMask getMask() {
                return ((CurrentSing) ((GeneratedMessageLite.b) this).instance).getMask();
            }

            @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.CurrentSingOrBuilder
            public long getOrderId() {
                return ((CurrentSing) ((GeneratedMessageLite.b) this).instance).getOrderId();
            }

            @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.CurrentSingOrBuilder
            public int getProgressMilliseconds() {
                return ((CurrentSing) ((GeneratedMessageLite.b) this).instance).getProgressMilliseconds();
            }

            @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.CurrentSingOrBuilder
            public String getSongCode() {
                return ((CurrentSing) ((GeneratedMessageLite.b) this).instance).getSongCode();
            }

            @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.CurrentSingOrBuilder
            public ByteString getSongCodeBytes() {
                return ((CurrentSing) ((GeneratedMessageLite.b) this).instance).getSongCodeBytes();
            }

            @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.CurrentSingOrBuilder
            public String getTitle() {
                return ((CurrentSing) ((GeneratedMessageLite.b) this).instance).getTitle();
            }

            @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.CurrentSingOrBuilder
            public ByteString getTitleBytes() {
                return ((CurrentSing) ((GeneratedMessageLite.b) this).instance).getTitleBytes();
            }

            @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.CurrentSingOrBuilder
            public String getUserId() {
                return ((CurrentSing) ((GeneratedMessageLite.b) this).instance).getUserId();
            }

            @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.CurrentSingOrBuilder
            public ByteString getUserIdBytes() {
                return ((CurrentSing) ((GeneratedMessageLite.b) this).instance).getUserIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.CurrentSingOrBuilder
            public boolean hasMask() {
                return ((CurrentSing) ((GeneratedMessageLite.b) this).instance).hasMask();
            }

            public Builder mergeMask(userMaskConfig.UserMask userMask) {
                copyOnWrite();
                ((CurrentSing) ((GeneratedMessageLite.b) this).instance).mergeMask(userMask);
                return this;
            }

            public Builder setAccompany(String str) {
                copyOnWrite();
                ((CurrentSing) ((GeneratedMessageLite.b) this).instance).setAccompany(str);
                return this;
            }

            public Builder setAccompanyBytes(ByteString byteString) {
                copyOnWrite();
                ((CurrentSing) ((GeneratedMessageLite.b) this).instance).setAccompanyBytes(byteString);
                return this;
            }

            public Builder setCover(String str) {
                copyOnWrite();
                ((CurrentSing) ((GeneratedMessageLite.b) this).instance).setCover(str);
                return this;
            }

            public Builder setCoverBytes(ByteString byteString) {
                copyOnWrite();
                ((CurrentSing) ((GeneratedMessageLite.b) this).instance).setCoverBytes(byteString);
                return this;
            }

            public Builder setHasStart(boolean z) {
                copyOnWrite();
                ((CurrentSing) ((GeneratedMessageLite.b) this).instance).setHasStart(z);
                return this;
            }

            public Builder setLyricType(String str) {
                copyOnWrite();
                ((CurrentSing) ((GeneratedMessageLite.b) this).instance).setLyricType(str);
                return this;
            }

            public Builder setLyricTypeBytes(ByteString byteString) {
                copyOnWrite();
                ((CurrentSing) ((GeneratedMessageLite.b) this).instance).setLyricTypeBytes(byteString);
                return this;
            }

            public Builder setLyricUrl(String str) {
                copyOnWrite();
                ((CurrentSing) ((GeneratedMessageLite.b) this).instance).setLyricUrl(str);
                return this;
            }

            public Builder setLyricUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((CurrentSing) ((GeneratedMessageLite.b) this).instance).setLyricUrlBytes(byteString);
                return this;
            }

            public Builder setMask(userMaskConfig.UserMask userMask) {
                copyOnWrite();
                ((CurrentSing) ((GeneratedMessageLite.b) this).instance).setMask(userMask);
                return this;
            }

            public Builder setOrderId(long j) {
                copyOnWrite();
                ((CurrentSing) ((GeneratedMessageLite.b) this).instance).setOrderId(j);
                return this;
            }

            public Builder setProgressMilliseconds(int i) {
                copyOnWrite();
                ((CurrentSing) ((GeneratedMessageLite.b) this).instance).setProgressMilliseconds(i);
                return this;
            }

            public Builder setSongCode(String str) {
                copyOnWrite();
                ((CurrentSing) ((GeneratedMessageLite.b) this).instance).setSongCode(str);
                return this;
            }

            public Builder setSongCodeBytes(ByteString byteString) {
                copyOnWrite();
                ((CurrentSing) ((GeneratedMessageLite.b) this).instance).setSongCodeBytes(byteString);
                return this;
            }

            public Builder setTitle(String str) {
                copyOnWrite();
                ((CurrentSing) ((GeneratedMessageLite.b) this).instance).setTitle(str);
                return this;
            }

            public Builder setTitleBytes(ByteString byteString) {
                copyOnWrite();
                ((CurrentSing) ((GeneratedMessageLite.b) this).instance).setTitleBytes(byteString);
                return this;
            }

            public Builder setUserId(String str) {
                copyOnWrite();
                ((CurrentSing) ((GeneratedMessageLite.b) this).instance).setUserId(str);
                return this;
            }

            public Builder setUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((CurrentSing) ((GeneratedMessageLite.b) this).instance).setUserIdBytes(byteString);
                return this;
            }

            public Builder setMask(userMaskConfig.UserMask.Builder builder) {
                copyOnWrite();
                ((CurrentSing) ((GeneratedMessageLite.b) this).instance).setMask(builder);
                return this;
            }
        }

        public static CurrentSing parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (CurrentSing) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CurrentSing parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (CurrentSing) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static CurrentSing parseFrom(InputStream inputStream) throws IOException {
            return (CurrentSing) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CurrentSing parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (CurrentSing) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static CurrentSing parseFrom(e eVar) throws IOException {
            return (CurrentSing) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static CurrentSing parseFrom(e eVar, h hVar) throws IOException {
            return (CurrentSing) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public static final class NextSing extends GeneratedMessageLite<NextSing, Builder> implements NextSingOrBuilder {
        public static final int ACCOMPANY_FIELD_NUMBER = 8;
        public static final int COUNTDOWNSECONDS_FIELD_NUMBER = 9;
        public static final int COVER_FIELD_NUMBER = 4;
        private static final NextSing DEFAULT_INSTANCE;
        public static final int LYRICTYPE_FIELD_NUMBER = 6;
        public static final int LYRICURL_FIELD_NUMBER = 7;
        public static final int MASK_FIELD_NUMBER = 2;
        private static volatile i860<NextSing> PARSER = null;
        public static final int REMAINSECONDS_FIELD_NUMBER = 10;
        public static final int SONGCODE_FIELD_NUMBER = 5;
        public static final int TITLE_FIELD_NUMBER = 3;
        public static final int USERID_FIELD_NUMBER = 1;
        private int countDownSeconds_;
        private userMaskConfig.UserMask mask_;
        private int remainSeconds_;
        private String userId_ = "";
        private String title_ = "";
        private String cover_ = "";
        private String songCode_ = "";
        private String lyricType_ = "";
        private String lyricUrl_ = "";
        private String accompany_ = "";

        static {
            NextSing nextSing = new NextSing();
            DEFAULT_INSTANCE = nextSing;
            nextSing.makeImmutable();
        }

        private NextSing() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAccompany() {
            this.accompany_ = getDefaultInstance().getAccompany();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCountDownSeconds() {
            this.countDownSeconds_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCover() {
            this.cover_ = getDefaultInstance().getCover();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLyricType() {
            this.lyricType_ = getDefaultInstance().getLyricType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLyricUrl() {
            this.lyricUrl_ = getDefaultInstance().getLyricUrl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMask() {
            this.mask_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRemainSeconds() {
            this.remainSeconds_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSongCode() {
            this.songCode_ = getDefaultInstance().getSongCode();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTitle() {
            this.title_ = getDefaultInstance().getTitle();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUserId() {
            this.userId_ = getDefaultInstance().getUserId();
        }

        public static NextSing getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeMask(userMaskConfig.UserMask userMask) {
            userMaskConfig.UserMask userMask2 = this.mask_;
            if (userMask2 == null || userMask2 == userMaskConfig.UserMask.getDefaultInstance()) {
                this.mask_ = userMask;
            } else {
                this.mask_ = (userMaskConfig.UserMask) ((userMaskConfig.UserMask.Builder) userMaskConfig.UserMask.newBuilder(this.mask_).mergeFrom(userMask)).buildPartial();
            }
        }

        public static Builder newBuilder(NextSing nextSing) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(nextSing);
        }

        public static NextSing parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (NextSing) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NextSing parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (NextSing) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<NextSing> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAccompany(String str) {
            str.getClass();
            this.accompany_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAccompanyBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.accompany_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCountDownSeconds(int i) {
            this.countDownSeconds_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCover(String str) {
            str.getClass();
            this.cover_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCoverBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.cover_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLyricType(String str) {
            str.getClass();
            this.lyricType_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLyricTypeBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.lyricType_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLyricUrl(String str) {
            str.getClass();
            this.lyricUrl_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLyricUrlBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.lyricUrl_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMask(userMaskConfig.UserMask.Builder builder) {
            this.mask_ = (userMaskConfig.UserMask) builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRemainSeconds(int i) {
            this.remainSeconds_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSongCode(String str) {
            str.getClass();
            this.songCode_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSongCodeBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.songCode_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTitle(String str) {
            str.getClass();
            this.title_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTitleBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.title_ = byteString.toStringUtf8();
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
            switch (C03341.f1644xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new NextSing();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    NextSing nextSing = (NextSing) obj2;
                    this.userId_ = hVar.f(!this.userId_.isEmpty(), this.userId_, !nextSing.userId_.isEmpty(), nextSing.userId_);
                    this.mask_ = hVar.o(this.mask_, nextSing.mask_);
                    this.title_ = hVar.f(!this.title_.isEmpty(), this.title_, !nextSing.title_.isEmpty(), nextSing.title_);
                    this.cover_ = hVar.f(!this.cover_.isEmpty(), this.cover_, !nextSing.cover_.isEmpty(), nextSing.cover_);
                    this.songCode_ = hVar.f(!this.songCode_.isEmpty(), this.songCode_, !nextSing.songCode_.isEmpty(), nextSing.songCode_);
                    this.lyricType_ = hVar.f(!this.lyricType_.isEmpty(), this.lyricType_, !nextSing.lyricType_.isEmpty(), nextSing.lyricType_);
                    this.lyricUrl_ = hVar.f(!this.lyricUrl_.isEmpty(), this.lyricUrl_, !nextSing.lyricUrl_.isEmpty(), nextSing.lyricUrl_);
                    this.accompany_ = hVar.f(!this.accompany_.isEmpty(), this.accompany_, !nextSing.accompany_.isEmpty(), nextSing.accompany_);
                    int i = this.countDownSeconds_;
                    boolean z2 = i != 0;
                    int i2 = nextSing.countDownSeconds_;
                    this.countDownSeconds_ = hVar.e(z2, i, i2 != 0, i2);
                    int i3 = this.remainSeconds_;
                    boolean z3 = i3 != 0;
                    int i4 = nextSing.remainSeconds_;
                    this.remainSeconds_ = hVar.e(z3, i3, i4 != 0, i4);
                    GeneratedMessageLite.g gVar = GeneratedMessageLite.g.INSTANCE;
                    return this;
                case 6:
                    e eVar = (e) obj;
                    h hVar2 = (h) obj2;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            switch (iM) {
                                case 0:
                                    break;
                                case 10:
                                    this.userId_ = eVar.L();
                                    continue;
                                case 18:
                                    userMaskConfig.UserMask userMask = this.mask_;
                                    userMaskConfig.UserMask.Builder builder = userMask != null ? (userMaskConfig.UserMask.Builder) userMask.toBuilder() : null;
                                    userMaskConfig.UserMask userMaskW = eVar.w(userMaskConfig.UserMask.parser(), hVar2);
                                    this.mask_ = userMaskW;
                                    if (builder != null) {
                                        builder.mergeFrom(userMaskW);
                                        this.mask_ = (userMaskConfig.UserMask) builder.buildPartial();
                                    } else {
                                        continue;
                                    }
                                    break;
                                case 26:
                                    this.title_ = eVar.L();
                                    continue;
                                case 34:
                                    this.cover_ = eVar.L();
                                    continue;
                                case 42:
                                    this.songCode_ = eVar.L();
                                    continue;
                                case 50:
                                    this.lyricType_ = eVar.L();
                                    continue;
                                case 58:
                                    this.lyricUrl_ = eVar.L();
                                    continue;
                                case 66:
                                    this.accompany_ = eVar.L();
                                    continue;
                                case 72:
                                    this.countDownSeconds_ = eVar.u();
                                    continue;
                                case 80:
                                    this.remainSeconds_ = eVar.u();
                                    continue;
                                default:
                                    if (!eVar.R(iM)) {
                                        break;
                                    }
                                    break;
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
                        synchronized (NextSing.class) {
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

        @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.NextSingOrBuilder
        public String getAccompany() {
            return this.accompany_;
        }

        @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.NextSingOrBuilder
        public ByteString getAccompanyBytes() {
            return ByteString.copyFromUtf8(this.accompany_);
        }

        @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.NextSingOrBuilder
        public int getCountDownSeconds() {
            return this.countDownSeconds_;
        }

        @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.NextSingOrBuilder
        public String getCover() {
            return this.cover_;
        }

        @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.NextSingOrBuilder
        public ByteString getCoverBytes() {
            return ByteString.copyFromUtf8(this.cover_);
        }

        @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.NextSingOrBuilder
        public String getLyricType() {
            return this.lyricType_;
        }

        @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.NextSingOrBuilder
        public ByteString getLyricTypeBytes() {
            return ByteString.copyFromUtf8(this.lyricType_);
        }

        @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.NextSingOrBuilder
        public String getLyricUrl() {
            return this.lyricUrl_;
        }

        @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.NextSingOrBuilder
        public ByteString getLyricUrlBytes() {
            return ByteString.copyFromUtf8(this.lyricUrl_);
        }

        @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.NextSingOrBuilder
        public userMaskConfig.UserMask getMask() {
            userMaskConfig.UserMask userMask = this.mask_;
            return userMask == null ? userMaskConfig.UserMask.getDefaultInstance() : userMask;
        }

        @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.NextSingOrBuilder
        public int getRemainSeconds() {
            return this.remainSeconds_;
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iK = !this.userId_.isEmpty() ? CodedOutputStream.K(1, getUserId()) : 0;
            if (this.mask_ != null) {
                iK += CodedOutputStream.C(2, getMask());
            }
            if (!this.title_.isEmpty()) {
                iK += CodedOutputStream.K(3, getTitle());
            }
            if (!this.cover_.isEmpty()) {
                iK += CodedOutputStream.K(4, getCover());
            }
            if (!this.songCode_.isEmpty()) {
                iK += CodedOutputStream.K(5, getSongCode());
            }
            if (!this.lyricType_.isEmpty()) {
                iK += CodedOutputStream.K(6, getLyricType());
            }
            if (!this.lyricUrl_.isEmpty()) {
                iK += CodedOutputStream.K(7, getLyricUrl());
            }
            if (!this.accompany_.isEmpty()) {
                iK += CodedOutputStream.K(8, getAccompany());
            }
            int i2 = this.countDownSeconds_;
            if (i2 != 0) {
                iK += CodedOutputStream.t(9, i2);
            }
            int i3 = this.remainSeconds_;
            if (i3 != 0) {
                iK += CodedOutputStream.t(10, i3);
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iK;
            return iK;
        }

        @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.NextSingOrBuilder
        public String getSongCode() {
            return this.songCode_;
        }

        @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.NextSingOrBuilder
        public ByteString getSongCodeBytes() {
            return ByteString.copyFromUtf8(this.songCode_);
        }

        @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.NextSingOrBuilder
        public String getTitle() {
            return this.title_;
        }

        @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.NextSingOrBuilder
        public ByteString getTitleBytes() {
            return ByteString.copyFromUtf8(this.title_);
        }

        @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.NextSingOrBuilder
        public String getUserId() {
            return this.userId_;
        }

        @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.NextSingOrBuilder
        public ByteString getUserIdBytes() {
            return ByteString.copyFromUtf8(this.userId_);
        }

        @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.NextSingOrBuilder
        public boolean hasMask() {
            return this.mask_ != null;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.userId_.isEmpty()) {
                codedOutputStream.D0(1, getUserId());
            }
            if (this.mask_ != null) {
                codedOutputStream.w0(2, getMask());
            }
            if (!this.title_.isEmpty()) {
                codedOutputStream.D0(3, getTitle());
            }
            if (!this.cover_.isEmpty()) {
                codedOutputStream.D0(4, getCover());
            }
            if (!this.songCode_.isEmpty()) {
                codedOutputStream.D0(5, getSongCode());
            }
            if (!this.lyricType_.isEmpty()) {
                codedOutputStream.D0(6, getLyricType());
            }
            if (!this.lyricUrl_.isEmpty()) {
                codedOutputStream.D0(7, getLyricUrl());
            }
            if (!this.accompany_.isEmpty()) {
                codedOutputStream.D0(8, getAccompany());
            }
            int i = this.countDownSeconds_;
            if (i != 0) {
                codedOutputStream.s0(9, i);
            }
            int i2 = this.remainSeconds_;
            if (i2 != 0) {
                codedOutputStream.s0(10, i2);
            }
        }

        public static NextSing parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (NextSing) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static NextSing parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (NextSing) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMask(userMaskConfig.UserMask userMask) {
            userMask.getClass();
            this.mask_ = userMask;
        }

        public static final class Builder extends GeneratedMessageLite.b<NextSing, Builder> implements NextSingOrBuilder {
            private Builder() {
                super(NextSing.DEFAULT_INSTANCE);
            }

            public Builder clearAccompany() {
                copyOnWrite();
                ((NextSing) ((GeneratedMessageLite.b) this).instance).clearAccompany();
                return this;
            }

            public Builder clearCountDownSeconds() {
                copyOnWrite();
                ((NextSing) ((GeneratedMessageLite.b) this).instance).clearCountDownSeconds();
                return this;
            }

            public Builder clearCover() {
                copyOnWrite();
                ((NextSing) ((GeneratedMessageLite.b) this).instance).clearCover();
                return this;
            }

            public Builder clearLyricType() {
                copyOnWrite();
                ((NextSing) ((GeneratedMessageLite.b) this).instance).clearLyricType();
                return this;
            }

            public Builder clearLyricUrl() {
                copyOnWrite();
                ((NextSing) ((GeneratedMessageLite.b) this).instance).clearLyricUrl();
                return this;
            }

            public Builder clearMask() {
                copyOnWrite();
                ((NextSing) ((GeneratedMessageLite.b) this).instance).clearMask();
                return this;
            }

            public Builder clearRemainSeconds() {
                copyOnWrite();
                ((NextSing) ((GeneratedMessageLite.b) this).instance).clearRemainSeconds();
                return this;
            }

            public Builder clearSongCode() {
                copyOnWrite();
                ((NextSing) ((GeneratedMessageLite.b) this).instance).clearSongCode();
                return this;
            }

            public Builder clearTitle() {
                copyOnWrite();
                ((NextSing) ((GeneratedMessageLite.b) this).instance).clearTitle();
                return this;
            }

            public Builder clearUserId() {
                copyOnWrite();
                ((NextSing) ((GeneratedMessageLite.b) this).instance).clearUserId();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.NextSingOrBuilder
            public String getAccompany() {
                return ((NextSing) ((GeneratedMessageLite.b) this).instance).getAccompany();
            }

            @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.NextSingOrBuilder
            public ByteString getAccompanyBytes() {
                return ((NextSing) ((GeneratedMessageLite.b) this).instance).getAccompanyBytes();
            }

            @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.NextSingOrBuilder
            public int getCountDownSeconds() {
                return ((NextSing) ((GeneratedMessageLite.b) this).instance).getCountDownSeconds();
            }

            @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.NextSingOrBuilder
            public String getCover() {
                return ((NextSing) ((GeneratedMessageLite.b) this).instance).getCover();
            }

            @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.NextSingOrBuilder
            public ByteString getCoverBytes() {
                return ((NextSing) ((GeneratedMessageLite.b) this).instance).getCoverBytes();
            }

            @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.NextSingOrBuilder
            public String getLyricType() {
                return ((NextSing) ((GeneratedMessageLite.b) this).instance).getLyricType();
            }

            @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.NextSingOrBuilder
            public ByteString getLyricTypeBytes() {
                return ((NextSing) ((GeneratedMessageLite.b) this).instance).getLyricTypeBytes();
            }

            @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.NextSingOrBuilder
            public String getLyricUrl() {
                return ((NextSing) ((GeneratedMessageLite.b) this).instance).getLyricUrl();
            }

            @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.NextSingOrBuilder
            public ByteString getLyricUrlBytes() {
                return ((NextSing) ((GeneratedMessageLite.b) this).instance).getLyricUrlBytes();
            }

            @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.NextSingOrBuilder
            public userMaskConfig.UserMask getMask() {
                return ((NextSing) ((GeneratedMessageLite.b) this).instance).getMask();
            }

            @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.NextSingOrBuilder
            public int getRemainSeconds() {
                return ((NextSing) ((GeneratedMessageLite.b) this).instance).getRemainSeconds();
            }

            @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.NextSingOrBuilder
            public String getSongCode() {
                return ((NextSing) ((GeneratedMessageLite.b) this).instance).getSongCode();
            }

            @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.NextSingOrBuilder
            public ByteString getSongCodeBytes() {
                return ((NextSing) ((GeneratedMessageLite.b) this).instance).getSongCodeBytes();
            }

            @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.NextSingOrBuilder
            public String getTitle() {
                return ((NextSing) ((GeneratedMessageLite.b) this).instance).getTitle();
            }

            @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.NextSingOrBuilder
            public ByteString getTitleBytes() {
                return ((NextSing) ((GeneratedMessageLite.b) this).instance).getTitleBytes();
            }

            @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.NextSingOrBuilder
            public String getUserId() {
                return ((NextSing) ((GeneratedMessageLite.b) this).instance).getUserId();
            }

            @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.NextSingOrBuilder
            public ByteString getUserIdBytes() {
                return ((NextSing) ((GeneratedMessageLite.b) this).instance).getUserIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.NextSingOrBuilder
            public boolean hasMask() {
                return ((NextSing) ((GeneratedMessageLite.b) this).instance).hasMask();
            }

            public Builder mergeMask(userMaskConfig.UserMask userMask) {
                copyOnWrite();
                ((NextSing) ((GeneratedMessageLite.b) this).instance).mergeMask(userMask);
                return this;
            }

            public Builder setAccompany(String str) {
                copyOnWrite();
                ((NextSing) ((GeneratedMessageLite.b) this).instance).setAccompany(str);
                return this;
            }

            public Builder setAccompanyBytes(ByteString byteString) {
                copyOnWrite();
                ((NextSing) ((GeneratedMessageLite.b) this).instance).setAccompanyBytes(byteString);
                return this;
            }

            public Builder setCountDownSeconds(int i) {
                copyOnWrite();
                ((NextSing) ((GeneratedMessageLite.b) this).instance).setCountDownSeconds(i);
                return this;
            }

            public Builder setCover(String str) {
                copyOnWrite();
                ((NextSing) ((GeneratedMessageLite.b) this).instance).setCover(str);
                return this;
            }

            public Builder setCoverBytes(ByteString byteString) {
                copyOnWrite();
                ((NextSing) ((GeneratedMessageLite.b) this).instance).setCoverBytes(byteString);
                return this;
            }

            public Builder setLyricType(String str) {
                copyOnWrite();
                ((NextSing) ((GeneratedMessageLite.b) this).instance).setLyricType(str);
                return this;
            }

            public Builder setLyricTypeBytes(ByteString byteString) {
                copyOnWrite();
                ((NextSing) ((GeneratedMessageLite.b) this).instance).setLyricTypeBytes(byteString);
                return this;
            }

            public Builder setLyricUrl(String str) {
                copyOnWrite();
                ((NextSing) ((GeneratedMessageLite.b) this).instance).setLyricUrl(str);
                return this;
            }

            public Builder setLyricUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((NextSing) ((GeneratedMessageLite.b) this).instance).setLyricUrlBytes(byteString);
                return this;
            }

            public Builder setMask(userMaskConfig.UserMask userMask) {
                copyOnWrite();
                ((NextSing) ((GeneratedMessageLite.b) this).instance).setMask(userMask);
                return this;
            }

            public Builder setRemainSeconds(int i) {
                copyOnWrite();
                ((NextSing) ((GeneratedMessageLite.b) this).instance).setRemainSeconds(i);
                return this;
            }

            public Builder setSongCode(String str) {
                copyOnWrite();
                ((NextSing) ((GeneratedMessageLite.b) this).instance).setSongCode(str);
                return this;
            }

            public Builder setSongCodeBytes(ByteString byteString) {
                copyOnWrite();
                ((NextSing) ((GeneratedMessageLite.b) this).instance).setSongCodeBytes(byteString);
                return this;
            }

            public Builder setTitle(String str) {
                copyOnWrite();
                ((NextSing) ((GeneratedMessageLite.b) this).instance).setTitle(str);
                return this;
            }

            public Builder setTitleBytes(ByteString byteString) {
                copyOnWrite();
                ((NextSing) ((GeneratedMessageLite.b) this).instance).setTitleBytes(byteString);
                return this;
            }

            public Builder setUserId(String str) {
                copyOnWrite();
                ((NextSing) ((GeneratedMessageLite.b) this).instance).setUserId(str);
                return this;
            }

            public Builder setUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((NextSing) ((GeneratedMessageLite.b) this).instance).setUserIdBytes(byteString);
                return this;
            }

            public Builder setMask(userMaskConfig.UserMask.Builder builder) {
                copyOnWrite();
                ((NextSing) ((GeneratedMessageLite.b) this).instance).setMask(builder);
                return this;
            }
        }

        public static NextSing parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (NextSing) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static NextSing parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (NextSing) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static NextSing parseFrom(InputStream inputStream) throws IOException {
            return (NextSing) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NextSing parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (NextSing) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static NextSing parseFrom(e eVar) throws IOException {
            return (NextSing) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static NextSing parseFrom(e eVar, h hVar) throws IOException {
            return (NextSing) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public static final class VoiceSing extends GeneratedMessageLite<VoiceSing, Builder> implements VoiceSingOrBuilder {
        public static final int CURRENTSING_FIELD_NUMBER = 3;
        private static final VoiceSing DEFAULT_INSTANCE;
        public static final int ID_FIELD_NUMBER = 1;
        public static final int NEXTSING_FIELD_NUMBER = 4;
        private static volatile i860<VoiceSing> PARSER = null;
        public static final int STATUS_FIELD_NUMBER = 2;
        public static final int TOAST_FIELD_NUMBER = 5;
        private CurrentSing currentSing_;
        private NextSing nextSing_;
        private String id_ = "";
        private String status_ = "";
        private String toast_ = "";

        static {
            VoiceSing voiceSing = new VoiceSing();
            DEFAULT_INSTANCE = voiceSing;
            voiceSing.makeImmutable();
        }

        private VoiceSing() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCurrentSing() {
            this.currentSing_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearId() {
            this.id_ = getDefaultInstance().getId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNextSing() {
            this.nextSing_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStatus() {
            this.status_ = getDefaultInstance().getStatus();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearToast() {
            this.toast_ = getDefaultInstance().getToast();
        }

        public static VoiceSing getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeCurrentSing(CurrentSing currentSing) {
            CurrentSing currentSing2 = this.currentSing_;
            if (currentSing2 == null || currentSing2 == CurrentSing.getDefaultInstance()) {
                this.currentSing_ = currentSing;
            } else {
                this.currentSing_ = (CurrentSing) ((CurrentSing.Builder) CurrentSing.newBuilder(this.currentSing_).mergeFrom(currentSing)).buildPartial();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeNextSing(NextSing nextSing) {
            NextSing nextSing2 = this.nextSing_;
            if (nextSing2 == null || nextSing2 == NextSing.getDefaultInstance()) {
                this.nextSing_ = nextSing;
            } else {
                this.nextSing_ = (NextSing) ((NextSing.Builder) NextSing.newBuilder(this.nextSing_).mergeFrom(nextSing)).buildPartial();
            }
        }

        public static Builder newBuilder(VoiceSing voiceSing) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(voiceSing);
        }

        public static VoiceSing parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VoiceSing) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceSing parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VoiceSing) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<VoiceSing> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCurrentSing(CurrentSing.Builder builder) {
            this.currentSing_ = (CurrentSing) builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setId(String str) {
            str.getClass();
            this.id_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIdBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.id_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNextSing(NextSing.Builder builder) {
            this.nextSing_ = (NextSing) builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStatus(String str) {
            str.getClass();
            this.status_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStatusBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
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
            a.checkByteStringIsUtf8(byteString);
            this.toast_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C03341.f1644xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoiceSing();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    VoiceSing voiceSing = (VoiceSing) obj2;
                    this.id_ = hVar.f(!this.id_.isEmpty(), this.id_, !voiceSing.id_.isEmpty(), voiceSing.id_);
                    this.status_ = hVar.f(!this.status_.isEmpty(), this.status_, !voiceSing.status_.isEmpty(), voiceSing.status_);
                    this.currentSing_ = hVar.o(this.currentSing_, voiceSing.currentSing_);
                    this.nextSing_ = hVar.o(this.nextSing_, voiceSing.nextSing_);
                    this.toast_ = hVar.f(!this.toast_.isEmpty(), this.toast_, true ^ voiceSing.toast_.isEmpty(), voiceSing.toast_);
                    GeneratedMessageLite.g gVar = GeneratedMessageLite.g.INSTANCE;
                    return this;
                case 6:
                    e eVar = (e) obj;
                    h hVar2 = (h) obj2;
                    boolean z = false;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            if (iM != 0) {
                                if (iM == 10) {
                                    this.id_ = eVar.L();
                                } else if (iM == 18) {
                                    this.status_ = eVar.L();
                                } else if (iM == 26) {
                                    CurrentSing currentSing = this.currentSing_;
                                    CurrentSing.Builder builder = currentSing != null ? (CurrentSing.Builder) currentSing.toBuilder() : null;
                                    CurrentSing currentSingW = eVar.w(CurrentSing.parser(), hVar2);
                                    this.currentSing_ = currentSingW;
                                    if (builder != null) {
                                        builder.mergeFrom(currentSingW);
                                        this.currentSing_ = (CurrentSing) builder.buildPartial();
                                    }
                                } else if (iM == 34) {
                                    NextSing nextSing = this.nextSing_;
                                    NextSing.Builder builder2 = nextSing != null ? (NextSing.Builder) nextSing.toBuilder() : null;
                                    NextSing nextSingW = eVar.w(NextSing.parser(), hVar2);
                                    this.nextSing_ = nextSingW;
                                    if (builder2 != null) {
                                        builder2.mergeFrom(nextSingW);
                                        this.nextSing_ = (NextSing) builder2.buildPartial();
                                    }
                                } else if (iM == 42) {
                                    this.toast_ = eVar.L();
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
                        synchronized (VoiceSing.class) {
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

        @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.VoiceSingOrBuilder
        public CurrentSing getCurrentSing() {
            CurrentSing currentSing = this.currentSing_;
            return currentSing == null ? CurrentSing.getDefaultInstance() : currentSing;
        }

        @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.VoiceSingOrBuilder
        public String getId() {
            return this.id_;
        }

        @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.VoiceSingOrBuilder
        public ByteString getIdBytes() {
            return ByteString.copyFromUtf8(this.id_);
        }

        @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.VoiceSingOrBuilder
        public NextSing getNextSing() {
            NextSing nextSing = this.nextSing_;
            return nextSing == null ? NextSing.getDefaultInstance() : nextSing;
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iK = !this.id_.isEmpty() ? CodedOutputStream.K(1, getId()) : 0;
            if (!this.status_.isEmpty()) {
                iK += CodedOutputStream.K(2, getStatus());
            }
            if (this.currentSing_ != null) {
                iK += CodedOutputStream.C(3, getCurrentSing());
            }
            if (this.nextSing_ != null) {
                iK += CodedOutputStream.C(4, getNextSing());
            }
            if (!this.toast_.isEmpty()) {
                iK += CodedOutputStream.K(5, getToast());
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iK;
            return iK;
        }

        @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.VoiceSingOrBuilder
        public String getStatus() {
            return this.status_;
        }

        @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.VoiceSingOrBuilder
        public ByteString getStatusBytes() {
            return ByteString.copyFromUtf8(this.status_);
        }

        @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.VoiceSingOrBuilder
        public String getToast() {
            return this.toast_;
        }

        @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.VoiceSingOrBuilder
        public ByteString getToastBytes() {
            return ByteString.copyFromUtf8(this.toast_);
        }

        @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.VoiceSingOrBuilder
        public boolean hasCurrentSing() {
            return this.currentSing_ != null;
        }

        @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.VoiceSingOrBuilder
        public boolean hasNextSing() {
            return this.nextSing_ != null;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.id_.isEmpty()) {
                codedOutputStream.D0(1, getId());
            }
            if (!this.status_.isEmpty()) {
                codedOutputStream.D0(2, getStatus());
            }
            if (this.currentSing_ != null) {
                codedOutputStream.w0(3, getCurrentSing());
            }
            if (this.nextSing_ != null) {
                codedOutputStream.w0(4, getNextSing());
            }
            if (this.toast_.isEmpty()) {
                return;
            }
            codedOutputStream.D0(5, getToast());
        }

        public static VoiceSing parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (VoiceSing) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static VoiceSing parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (VoiceSing) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCurrentSing(CurrentSing currentSing) {
            currentSing.getClass();
            this.currentSing_ = currentSing;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNextSing(NextSing nextSing) {
            nextSing.getClass();
            this.nextSing_ = nextSing;
        }

        public static final class Builder extends GeneratedMessageLite.b<VoiceSing, Builder> implements VoiceSingOrBuilder {
            private Builder() {
                super(VoiceSing.DEFAULT_INSTANCE);
            }

            public Builder clearCurrentSing() {
                copyOnWrite();
                ((VoiceSing) ((GeneratedMessageLite.b) this).instance).clearCurrentSing();
                return this;
            }

            public Builder clearId() {
                copyOnWrite();
                ((VoiceSing) ((GeneratedMessageLite.b) this).instance).clearId();
                return this;
            }

            public Builder clearNextSing() {
                copyOnWrite();
                ((VoiceSing) ((GeneratedMessageLite.b) this).instance).clearNextSing();
                return this;
            }

            public Builder clearStatus() {
                copyOnWrite();
                ((VoiceSing) ((GeneratedMessageLite.b) this).instance).clearStatus();
                return this;
            }

            public Builder clearToast() {
                copyOnWrite();
                ((VoiceSing) ((GeneratedMessageLite.b) this).instance).clearToast();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.VoiceSingOrBuilder
            public CurrentSing getCurrentSing() {
                return ((VoiceSing) ((GeneratedMessageLite.b) this).instance).getCurrentSing();
            }

            @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.VoiceSingOrBuilder
            public String getId() {
                return ((VoiceSing) ((GeneratedMessageLite.b) this).instance).getId();
            }

            @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.VoiceSingOrBuilder
            public ByteString getIdBytes() {
                return ((VoiceSing) ((GeneratedMessageLite.b) this).instance).getIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.VoiceSingOrBuilder
            public NextSing getNextSing() {
                return ((VoiceSing) ((GeneratedMessageLite.b) this).instance).getNextSing();
            }

            @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.VoiceSingOrBuilder
            public String getStatus() {
                return ((VoiceSing) ((GeneratedMessageLite.b) this).instance).getStatus();
            }

            @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.VoiceSingOrBuilder
            public ByteString getStatusBytes() {
                return ((VoiceSing) ((GeneratedMessageLite.b) this).instance).getStatusBytes();
            }

            @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.VoiceSingOrBuilder
            public String getToast() {
                return ((VoiceSing) ((GeneratedMessageLite.b) this).instance).getToast();
            }

            @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.VoiceSingOrBuilder
            public ByteString getToastBytes() {
                return ((VoiceSing) ((GeneratedMessageLite.b) this).instance).getToastBytes();
            }

            @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.VoiceSingOrBuilder
            public boolean hasCurrentSing() {
                return ((VoiceSing) ((GeneratedMessageLite.b) this).instance).hasCurrentSing();
            }

            @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.VoiceSingOrBuilder
            public boolean hasNextSing() {
                return ((VoiceSing) ((GeneratedMessageLite.b) this).instance).hasNextSing();
            }

            public Builder mergeCurrentSing(CurrentSing currentSing) {
                copyOnWrite();
                ((VoiceSing) ((GeneratedMessageLite.b) this).instance).mergeCurrentSing(currentSing);
                return this;
            }

            public Builder mergeNextSing(NextSing nextSing) {
                copyOnWrite();
                ((VoiceSing) ((GeneratedMessageLite.b) this).instance).mergeNextSing(nextSing);
                return this;
            }

            public Builder setCurrentSing(CurrentSing currentSing) {
                copyOnWrite();
                ((VoiceSing) ((GeneratedMessageLite.b) this).instance).setCurrentSing(currentSing);
                return this;
            }

            public Builder setId(String str) {
                copyOnWrite();
                ((VoiceSing) ((GeneratedMessageLite.b) this).instance).setId(str);
                return this;
            }

            public Builder setIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceSing) ((GeneratedMessageLite.b) this).instance).setIdBytes(byteString);
                return this;
            }

            public Builder setNextSing(NextSing nextSing) {
                copyOnWrite();
                ((VoiceSing) ((GeneratedMessageLite.b) this).instance).setNextSing(nextSing);
                return this;
            }

            public Builder setStatus(String str) {
                copyOnWrite();
                ((VoiceSing) ((GeneratedMessageLite.b) this).instance).setStatus(str);
                return this;
            }

            public Builder setStatusBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceSing) ((GeneratedMessageLite.b) this).instance).setStatusBytes(byteString);
                return this;
            }

            public Builder setToast(String str) {
                copyOnWrite();
                ((VoiceSing) ((GeneratedMessageLite.b) this).instance).setToast(str);
                return this;
            }

            public Builder setToastBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceSing) ((GeneratedMessageLite.b) this).instance).setToastBytes(byteString);
                return this;
            }

            public Builder setCurrentSing(CurrentSing.Builder builder) {
                copyOnWrite();
                ((VoiceSing) ((GeneratedMessageLite.b) this).instance).setCurrentSing(builder);
                return this;
            }

            public Builder setNextSing(NextSing.Builder builder) {
                copyOnWrite();
                ((VoiceSing) ((GeneratedMessageLite.b) this).instance).setNextSing(builder);
                return this;
            }
        }

        public static VoiceSing parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoiceSing) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoiceSing parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (VoiceSing) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static VoiceSing parseFrom(InputStream inputStream) throws IOException {
            return (VoiceSing) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceSing parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (VoiceSing) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static VoiceSing parseFrom(e eVar) throws IOException {
            return (VoiceSing) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static VoiceSing parseFrom(e eVar, h hVar) throws IOException {
            return (VoiceSing) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public static final class VoiceSingConfirm extends GeneratedMessageLite<VoiceSingConfirm, Builder> implements VoiceSingConfirmOrBuilder {
        private static final VoiceSingConfirm DEFAULT_INSTANCE;
        public static final int ID_FIELD_NUMBER = 1;
        public static final int ORDERID_FIELD_NUMBER = 2;
        private static volatile i860<VoiceSingConfirm> PARSER = null;
        public static final int TITLE_FIELD_NUMBER = 3;
        private String id_ = "";
        private String orderId_ = "";
        private String title_ = "";

        public static final class Builder extends GeneratedMessageLite.b<VoiceSingConfirm, Builder> implements VoiceSingConfirmOrBuilder {
            private Builder() {
                super(VoiceSingConfirm.DEFAULT_INSTANCE);
            }

            public Builder clearId() {
                copyOnWrite();
                ((VoiceSingConfirm) ((GeneratedMessageLite.b) this).instance).clearId();
                return this;
            }

            public Builder clearOrderId() {
                copyOnWrite();
                ((VoiceSingConfirm) ((GeneratedMessageLite.b) this).instance).clearOrderId();
                return this;
            }

            public Builder clearTitle() {
                copyOnWrite();
                ((VoiceSingConfirm) ((GeneratedMessageLite.b) this).instance).clearTitle();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.VoiceSingConfirmOrBuilder
            public String getId() {
                return ((VoiceSingConfirm) ((GeneratedMessageLite.b) this).instance).getId();
            }

            @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.VoiceSingConfirmOrBuilder
            public ByteString getIdBytes() {
                return ((VoiceSingConfirm) ((GeneratedMessageLite.b) this).instance).getIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.VoiceSingConfirmOrBuilder
            public String getOrderId() {
                return ((VoiceSingConfirm) ((GeneratedMessageLite.b) this).instance).getOrderId();
            }

            @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.VoiceSingConfirmOrBuilder
            public ByteString getOrderIdBytes() {
                return ((VoiceSingConfirm) ((GeneratedMessageLite.b) this).instance).getOrderIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.VoiceSingConfirmOrBuilder
            public String getTitle() {
                return ((VoiceSingConfirm) ((GeneratedMessageLite.b) this).instance).getTitle();
            }

            @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.VoiceSingConfirmOrBuilder
            public ByteString getTitleBytes() {
                return ((VoiceSingConfirm) ((GeneratedMessageLite.b) this).instance).getTitleBytes();
            }

            public Builder setId(String str) {
                copyOnWrite();
                ((VoiceSingConfirm) ((GeneratedMessageLite.b) this).instance).setId(str);
                return this;
            }

            public Builder setIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceSingConfirm) ((GeneratedMessageLite.b) this).instance).setIdBytes(byteString);
                return this;
            }

            public Builder setOrderId(String str) {
                copyOnWrite();
                ((VoiceSingConfirm) ((GeneratedMessageLite.b) this).instance).setOrderId(str);
                return this;
            }

            public Builder setOrderIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceSingConfirm) ((GeneratedMessageLite.b) this).instance).setOrderIdBytes(byteString);
                return this;
            }

            public Builder setTitle(String str) {
                copyOnWrite();
                ((VoiceSingConfirm) ((GeneratedMessageLite.b) this).instance).setTitle(str);
                return this;
            }

            public Builder setTitleBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceSingConfirm) ((GeneratedMessageLite.b) this).instance).setTitleBytes(byteString);
                return this;
            }
        }

        static {
            VoiceSingConfirm voiceSingConfirm = new VoiceSingConfirm();
            DEFAULT_INSTANCE = voiceSingConfirm;
            voiceSingConfirm.makeImmutable();
        }

        private VoiceSingConfirm() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearId() {
            this.id_ = getDefaultInstance().getId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOrderId() {
            this.orderId_ = getDefaultInstance().getOrderId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTitle() {
            this.title_ = getDefaultInstance().getTitle();
        }

        public static VoiceSingConfirm getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(VoiceSingConfirm voiceSingConfirm) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(voiceSingConfirm);
        }

        public static VoiceSingConfirm parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VoiceSingConfirm) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceSingConfirm parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VoiceSingConfirm) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<VoiceSingConfirm> parser() {
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
            a.checkByteStringIsUtf8(byteString);
            this.id_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOrderId(String str) {
            str.getClass();
            this.orderId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOrderIdBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.orderId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTitle(String str) {
            str.getClass();
            this.title_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTitleBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.title_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C03341.f1644xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoiceSingConfirm();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    VoiceSingConfirm voiceSingConfirm = (VoiceSingConfirm) obj2;
                    this.id_ = hVar.f(!this.id_.isEmpty(), this.id_, !voiceSingConfirm.id_.isEmpty(), voiceSingConfirm.id_);
                    this.orderId_ = hVar.f(!this.orderId_.isEmpty(), this.orderId_, !voiceSingConfirm.orderId_.isEmpty(), voiceSingConfirm.orderId_);
                    this.title_ = hVar.f(!this.title_.isEmpty(), this.title_, true ^ voiceSingConfirm.title_.isEmpty(), voiceSingConfirm.title_);
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
                                    this.id_ = eVar.L();
                                } else if (iM == 18) {
                                    this.orderId_ = eVar.L();
                                } else if (iM == 26) {
                                    this.title_ = eVar.L();
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
                        synchronized (VoiceSingConfirm.class) {
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

        @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.VoiceSingConfirmOrBuilder
        public String getId() {
            return this.id_;
        }

        @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.VoiceSingConfirmOrBuilder
        public ByteString getIdBytes() {
            return ByteString.copyFromUtf8(this.id_);
        }

        @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.VoiceSingConfirmOrBuilder
        public String getOrderId() {
            return this.orderId_;
        }

        @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.VoiceSingConfirmOrBuilder
        public ByteString getOrderIdBytes() {
            return ByteString.copyFromUtf8(this.orderId_);
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iK = !this.id_.isEmpty() ? CodedOutputStream.K(1, getId()) : 0;
            if (!this.orderId_.isEmpty()) {
                iK += CodedOutputStream.K(2, getOrderId());
            }
            if (!this.title_.isEmpty()) {
                iK += CodedOutputStream.K(3, getTitle());
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iK;
            return iK;
        }

        @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.VoiceSingConfirmOrBuilder
        public String getTitle() {
            return this.title_;
        }

        @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.VoiceSingConfirmOrBuilder
        public ByteString getTitleBytes() {
            return ByteString.copyFromUtf8(this.title_);
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.id_.isEmpty()) {
                codedOutputStream.D0(1, getId());
            }
            if (!this.orderId_.isEmpty()) {
                codedOutputStream.D0(2, getOrderId());
            }
            if (this.title_.isEmpty()) {
                return;
            }
            codedOutputStream.D0(3, getTitle());
        }

        public static VoiceSingConfirm parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (VoiceSingConfirm) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static VoiceSingConfirm parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (VoiceSingConfirm) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static VoiceSingConfirm parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoiceSingConfirm) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoiceSingConfirm parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (VoiceSingConfirm) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static VoiceSingConfirm parseFrom(InputStream inputStream) throws IOException {
            return (VoiceSingConfirm) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceSingConfirm parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (VoiceSingConfirm) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static VoiceSingConfirm parseFrom(e eVar) throws IOException {
            return (VoiceSingConfirm) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static VoiceSingConfirm parseFrom(e eVar, h hVar) throws IOException {
            return (VoiceSingConfirm) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public static final class VoiceSingStart extends GeneratedMessageLite<VoiceSingStart, Builder> implements VoiceSingStartOrBuilder {
        private static final VoiceSingStart DEFAULT_INSTANCE;
        public static final int ID_FIELD_NUMBER = 1;
        public static final int ORDERID_FIELD_NUMBER = 2;
        private static volatile i860<VoiceSingStart> PARSER = null;
        public static final int USERID_FIELD_NUMBER = 3;
        private String id_ = "";
        private String orderId_ = "";
        private String userId_ = "";

        public static final class Builder extends GeneratedMessageLite.b<VoiceSingStart, Builder> implements VoiceSingStartOrBuilder {
            private Builder() {
                super(VoiceSingStart.DEFAULT_INSTANCE);
            }

            public Builder clearId() {
                copyOnWrite();
                ((VoiceSingStart) ((GeneratedMessageLite.b) this).instance).clearId();
                return this;
            }

            public Builder clearOrderId() {
                copyOnWrite();
                ((VoiceSingStart) ((GeneratedMessageLite.b) this).instance).clearOrderId();
                return this;
            }

            public Builder clearUserId() {
                copyOnWrite();
                ((VoiceSingStart) ((GeneratedMessageLite.b) this).instance).clearUserId();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.VoiceSingStartOrBuilder
            public String getId() {
                return ((VoiceSingStart) ((GeneratedMessageLite.b) this).instance).getId();
            }

            @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.VoiceSingStartOrBuilder
            public ByteString getIdBytes() {
                return ((VoiceSingStart) ((GeneratedMessageLite.b) this).instance).getIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.VoiceSingStartOrBuilder
            public String getOrderId() {
                return ((VoiceSingStart) ((GeneratedMessageLite.b) this).instance).getOrderId();
            }

            @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.VoiceSingStartOrBuilder
            public ByteString getOrderIdBytes() {
                return ((VoiceSingStart) ((GeneratedMessageLite.b) this).instance).getOrderIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.VoiceSingStartOrBuilder
            public String getUserId() {
                return ((VoiceSingStart) ((GeneratedMessageLite.b) this).instance).getUserId();
            }

            @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.VoiceSingStartOrBuilder
            public ByteString getUserIdBytes() {
                return ((VoiceSingStart) ((GeneratedMessageLite.b) this).instance).getUserIdBytes();
            }

            public Builder setId(String str) {
                copyOnWrite();
                ((VoiceSingStart) ((GeneratedMessageLite.b) this).instance).setId(str);
                return this;
            }

            public Builder setIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceSingStart) ((GeneratedMessageLite.b) this).instance).setIdBytes(byteString);
                return this;
            }

            public Builder setOrderId(String str) {
                copyOnWrite();
                ((VoiceSingStart) ((GeneratedMessageLite.b) this).instance).setOrderId(str);
                return this;
            }

            public Builder setOrderIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceSingStart) ((GeneratedMessageLite.b) this).instance).setOrderIdBytes(byteString);
                return this;
            }

            public Builder setUserId(String str) {
                copyOnWrite();
                ((VoiceSingStart) ((GeneratedMessageLite.b) this).instance).setUserId(str);
                return this;
            }

            public Builder setUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceSingStart) ((GeneratedMessageLite.b) this).instance).setUserIdBytes(byteString);
                return this;
            }
        }

        static {
            VoiceSingStart voiceSingStart = new VoiceSingStart();
            DEFAULT_INSTANCE = voiceSingStart;
            voiceSingStart.makeImmutable();
        }

        private VoiceSingStart() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearId() {
            this.id_ = getDefaultInstance().getId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOrderId() {
            this.orderId_ = getDefaultInstance().getOrderId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUserId() {
            this.userId_ = getDefaultInstance().getUserId();
        }

        public static VoiceSingStart getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(VoiceSingStart voiceSingStart) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(voiceSingStart);
        }

        public static VoiceSingStart parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VoiceSingStart) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceSingStart parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VoiceSingStart) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<VoiceSingStart> parser() {
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
            a.checkByteStringIsUtf8(byteString);
            this.id_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOrderId(String str) {
            str.getClass();
            this.orderId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOrderIdBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.orderId_ = byteString.toStringUtf8();
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
            switch (C03341.f1644xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoiceSingStart();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    VoiceSingStart voiceSingStart = (VoiceSingStart) obj2;
                    this.id_ = hVar.f(!this.id_.isEmpty(), this.id_, !voiceSingStart.id_.isEmpty(), voiceSingStart.id_);
                    this.orderId_ = hVar.f(!this.orderId_.isEmpty(), this.orderId_, !voiceSingStart.orderId_.isEmpty(), voiceSingStart.orderId_);
                    this.userId_ = hVar.f(!this.userId_.isEmpty(), this.userId_, true ^ voiceSingStart.userId_.isEmpty(), voiceSingStart.userId_);
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
                                    this.id_ = eVar.L();
                                } else if (iM == 18) {
                                    this.orderId_ = eVar.L();
                                } else if (iM == 26) {
                                    this.userId_ = eVar.L();
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
                        synchronized (VoiceSingStart.class) {
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

        @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.VoiceSingStartOrBuilder
        public String getId() {
            return this.id_;
        }

        @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.VoiceSingStartOrBuilder
        public ByteString getIdBytes() {
            return ByteString.copyFromUtf8(this.id_);
        }

        @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.VoiceSingStartOrBuilder
        public String getOrderId() {
            return this.orderId_;
        }

        @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.VoiceSingStartOrBuilder
        public ByteString getOrderIdBytes() {
            return ByteString.copyFromUtf8(this.orderId_);
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iK = !this.id_.isEmpty() ? CodedOutputStream.K(1, getId()) : 0;
            if (!this.orderId_.isEmpty()) {
                iK += CodedOutputStream.K(2, getOrderId());
            }
            if (!this.userId_.isEmpty()) {
                iK += CodedOutputStream.K(3, getUserId());
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iK;
            return iK;
        }

        @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.VoiceSingStartOrBuilder
        public String getUserId() {
            return this.userId_;
        }

        @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.VoiceSingStartOrBuilder
        public ByteString getUserIdBytes() {
            return ByteString.copyFromUtf8(this.userId_);
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.id_.isEmpty()) {
                codedOutputStream.D0(1, getId());
            }
            if (!this.orderId_.isEmpty()) {
                codedOutputStream.D0(2, getOrderId());
            }
            if (this.userId_.isEmpty()) {
                return;
            }
            codedOutputStream.D0(3, getUserId());
        }

        public static VoiceSingStart parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (VoiceSingStart) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static VoiceSingStart parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (VoiceSingStart) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static VoiceSingStart parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoiceSingStart) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoiceSingStart parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (VoiceSingStart) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static VoiceSingStart parseFrom(InputStream inputStream) throws IOException {
            return (VoiceSingStart) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceSingStart parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (VoiceSingStart) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static VoiceSingStart parseFrom(e eVar) throws IOException {
            return (VoiceSingStart) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static VoiceSingStart parseFrom(e eVar, h hVar) throws IOException {
            return (VoiceSingStart) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }
}
