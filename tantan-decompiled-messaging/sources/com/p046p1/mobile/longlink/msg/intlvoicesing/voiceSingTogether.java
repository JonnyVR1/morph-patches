package com.p046p1.mobile.longlink.msg.intlvoicesing;

import com.google.protobuf.AbstractC3403a;
import com.google.protobuf.ByteString;
import com.google.protobuf.C3407e;
import com.google.protobuf.C3410h;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InterfaceC3419q;
import com.google.protobuf.InvalidProtocolBufferException;
import com.p046p1.mobile.longlink.msg.userMask.userMaskConfig;
import java.io.IOException;
import java.io.InputStream;
import p149l.aag0;
import p149l.bz00;
import p149l.i860;
import p149l.o6z;

/* JADX INFO: loaded from: classes8.dex */
public final class voiceSingTogether {

    /* JADX INFO: renamed from: com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether$1 */
    public static /* synthetic */ class C44221 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f15945xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15945xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15945xa1df5c61[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15945xa1df5c61[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15945xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15945xa1df5c61[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15945xa1df5c61[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15945xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f15945xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public interface CurrentSingOrBuilder extends o6z {
        String getAccompany();

        ByteString getAccompanyBytes();

        String getCover();

        ByteString getCoverBytes();

        @Override // p149l.o6z
        /* synthetic */ InterfaceC3419q getDefaultInstanceForType();

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

        @Override // p149l.o6z
        /* synthetic */ boolean isInitialized();
    }

    public interface NextSingOrBuilder extends o6z {
        String getAccompany();

        ByteString getAccompanyBytes();

        int getCountDownSeconds();

        String getCover();

        ByteString getCoverBytes();

        @Override // p149l.o6z
        /* synthetic */ InterfaceC3419q getDefaultInstanceForType();

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

        @Override // p149l.o6z
        /* synthetic */ boolean isInitialized();
    }

    public interface VoiceSingConfirmOrBuilder extends o6z {
        @Override // p149l.o6z
        /* synthetic */ InterfaceC3419q getDefaultInstanceForType();

        String getId();

        ByteString getIdBytes();

        String getOrderId();

        ByteString getOrderIdBytes();

        String getTitle();

        ByteString getTitleBytes();

        @Override // p149l.o6z
        /* synthetic */ boolean isInitialized();
    }

    public interface VoiceSingOrBuilder extends o6z {
        CurrentSing getCurrentSing();

        @Override // p149l.o6z
        /* synthetic */ InterfaceC3419q getDefaultInstanceForType();

        String getId();

        ByteString getIdBytes();

        NextSing getNextSing();

        String getStatus();

        ByteString getStatusBytes();

        String getToast();

        ByteString getToastBytes();

        boolean hasCurrentSing();

        boolean hasNextSing();

        @Override // p149l.o6z
        /* synthetic */ boolean isInitialized();
    }

    public interface VoiceSingStartOrBuilder extends o6z {
        @Override // p149l.o6z
        /* synthetic */ InterfaceC3419q getDefaultInstanceForType();

        String getId();

        ByteString getIdBytes();

        String getOrderId();

        ByteString getOrderIdBytes();

        String getUserId();

        ByteString getUserIdBytes();

        @Override // p149l.o6z
        /* synthetic */ boolean isInitialized();
    }

    private voiceSingTogether() {
    }

    public static void registerAllExtensions(C3410h c3410h) {
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
                this.mask_ = userMaskConfig.UserMask.newBuilder(this.mask_).mergeFrom(userMask).buildPartial();
            }
        }

        public static Builder newBuilder(CurrentSing currentSing) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(currentSing);
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
            AbstractC3403a.checkByteStringIsUtf8(byteString);
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
            AbstractC3403a.checkByteStringIsUtf8(byteString);
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
            AbstractC3403a.checkByteStringIsUtf8(byteString);
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
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.lyricUrl_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMask(userMaskConfig.UserMask.Builder builder) {
            this.mask_ = builder.build();
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
            AbstractC3403a.checkByteStringIsUtf8(byteString);
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
            AbstractC3403a.checkByteStringIsUtf8(byteString);
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
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.userId_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C44221.f15945xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new CurrentSing();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3386h interfaceC3386h = (GeneratedMessageLite.InterfaceC3386h) obj;
                    CurrentSing currentSing = (CurrentSing) obj2;
                    this.userId_ = interfaceC3386h.mo16997f(!this.userId_.isEmpty(), this.userId_, !currentSing.userId_.isEmpty(), currentSing.userId_);
                    this.mask_ = (userMaskConfig.UserMask) interfaceC3386h.mo17006o(this.mask_, currentSing.mask_);
                    this.title_ = interfaceC3386h.mo16997f(!this.title_.isEmpty(), this.title_, !currentSing.title_.isEmpty(), currentSing.title_);
                    this.cover_ = interfaceC3386h.mo16997f(!this.cover_.isEmpty(), this.cover_, !currentSing.cover_.isEmpty(), currentSing.cover_);
                    this.songCode_ = interfaceC3386h.mo16997f(!this.songCode_.isEmpty(), this.songCode_, !currentSing.songCode_.isEmpty(), currentSing.songCode_);
                    this.lyricType_ = interfaceC3386h.mo16997f(!this.lyricType_.isEmpty(), this.lyricType_, !currentSing.lyricType_.isEmpty(), currentSing.lyricType_);
                    this.lyricUrl_ = interfaceC3386h.mo16997f(!this.lyricUrl_.isEmpty(), this.lyricUrl_, !currentSing.lyricUrl_.isEmpty(), currentSing.lyricUrl_);
                    this.accompany_ = interfaceC3386h.mo16997f(!this.accompany_.isEmpty(), this.accompany_, !currentSing.accompany_.isEmpty(), currentSing.accompany_);
                    int i = this.progressMilliseconds_;
                    boolean z2 = i != 0;
                    int i2 = currentSing.progressMilliseconds_;
                    this.progressMilliseconds_ = interfaceC3386h.mo16996e(z2, i, i2 != 0, i2);
                    long j = this.orderId_;
                    boolean z3 = j != 0;
                    long j2 = currentSing.orderId_;
                    this.orderId_ = interfaceC3386h.mo17000i(z3, j, j2 != 0, j2);
                    boolean z4 = this.hasStart_;
                    boolean z5 = currentSing.hasStart_;
                    this.hasStart_ = interfaceC3386h.mo16995d(z4, z4, z5, z5);
                    GeneratedMessageLite.C3385g c3385g = GeneratedMessageLite.C3385g.INSTANCE;
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
                                    this.userId_ = c3407e.m17115L();
                                    continue;
                                case 18:
                                    userMaskConfig.UserMask userMask = this.mask_;
                                    userMaskConfig.UserMask.Builder builder = userMask != null ? userMask.toBuilder() : null;
                                    userMaskConfig.UserMask userMask2 = (userMaskConfig.UserMask) c3407e.m17143w(userMaskConfig.UserMask.parser(), c3410h);
                                    this.mask_ = userMask2;
                                    if (builder != null) {
                                        builder.mergeFrom(userMask2);
                                        this.mask_ = builder.buildPartial();
                                    } else {
                                        continue;
                                    }
                                    break;
                                case 26:
                                    this.title_ = c3407e.m17115L();
                                    continue;
                                case 34:
                                    this.cover_ = c3407e.m17115L();
                                    continue;
                                case 42:
                                    this.songCode_ = c3407e.m17115L();
                                    continue;
                                case 50:
                                    this.lyricType_ = c3407e.m17115L();
                                    continue;
                                case 58:
                                    this.lyricUrl_ = c3407e.m17115L();
                                    continue;
                                case 66:
                                    this.accompany_ = c3407e.m17115L();
                                    continue;
                                case 72:
                                    this.progressMilliseconds_ = c3407e.m17141u();
                                    continue;
                                case 80:
                                    this.orderId_ = c3407e.m17142v();
                                    continue;
                                case 88:
                                    this.hasStart_ = c3407e.m17133m();
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
                        synchronized (CurrentSing.class) {
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

        @Override // com.google.protobuf.InterfaceC3419q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16901K = !this.userId_.isEmpty() ? CodedOutputStream.m16901K(1, getUserId()) : 0;
            if (this.mask_ != null) {
                iM16901K += CodedOutputStream.m16893C(2, getMask());
            }
            if (!this.title_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(3, getTitle());
            }
            if (!this.cover_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(4, getCover());
            }
            if (!this.songCode_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(5, getSongCode());
            }
            if (!this.lyricType_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(6, getLyricType());
            }
            if (!this.lyricUrl_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(7, getLyricUrl());
            }
            if (!this.accompany_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(8, getAccompany());
            }
            int i2 = this.progressMilliseconds_;
            if (i2 != 0) {
                iM16901K += CodedOutputStream.m16929t(9, i2);
            }
            long j = this.orderId_;
            if (j != 0) {
                iM16901K += CodedOutputStream.m16931v(10, j);
            }
            boolean z = this.hasStart_;
            if (z) {
                iM16901K += CodedOutputStream.m16915f(11, z);
            }
            this.memoizedSerializedSize = iM16901K;
            return iM16901K;
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

        @Override // com.google.protobuf.InterfaceC3419q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.userId_.isEmpty()) {
                codedOutputStream.mo16939D0(1, getUserId());
            }
            if (this.mask_ != null) {
                codedOutputStream.mo16974w0(2, getMask());
            }
            if (!this.title_.isEmpty()) {
                codedOutputStream.mo16939D0(3, getTitle());
            }
            if (!this.cover_.isEmpty()) {
                codedOutputStream.mo16939D0(4, getCover());
            }
            if (!this.songCode_.isEmpty()) {
                codedOutputStream.mo16939D0(5, getSongCode());
            }
            if (!this.lyricType_.isEmpty()) {
                codedOutputStream.mo16939D0(6, getLyricType());
            }
            if (!this.lyricUrl_.isEmpty()) {
                codedOutputStream.mo16939D0(7, getLyricUrl());
            }
            if (!this.accompany_.isEmpty()) {
                codedOutputStream.mo16939D0(8, getAccompany());
            }
            int i = this.progressMilliseconds_;
            if (i != 0) {
                codedOutputStream.mo16970s0(9, i);
            }
            long j = this.orderId_;
            if (j != 0) {
                codedOutputStream.m16972u0(10, j);
            }
            boolean z = this.hasStart_;
            if (z) {
                codedOutputStream.mo16950a0(11, z);
            }
        }

        public static CurrentSing parseDelimitedFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (CurrentSing) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static CurrentSing parseFrom(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
            return (CurrentSing) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3410h);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMask(userMaskConfig.UserMask userMask) {
            userMask.getClass();
            this.mask_ = userMask;
        }

        public static final class Builder extends GeneratedMessageLite.AbstractC3380b<CurrentSing, Builder> implements CurrentSingOrBuilder {
            private Builder() {
                super(CurrentSing.DEFAULT_INSTANCE);
            }

            public Builder clearAccompany() {
                copyOnWrite();
                ((CurrentSing) this.instance).clearAccompany();
                return this;
            }

            public Builder clearCover() {
                copyOnWrite();
                ((CurrentSing) this.instance).clearCover();
                return this;
            }

            public Builder clearHasStart() {
                copyOnWrite();
                ((CurrentSing) this.instance).clearHasStart();
                return this;
            }

            public Builder clearLyricType() {
                copyOnWrite();
                ((CurrentSing) this.instance).clearLyricType();
                return this;
            }

            public Builder clearLyricUrl() {
                copyOnWrite();
                ((CurrentSing) this.instance).clearLyricUrl();
                return this;
            }

            public Builder clearMask() {
                copyOnWrite();
                ((CurrentSing) this.instance).clearMask();
                return this;
            }

            public Builder clearOrderId() {
                copyOnWrite();
                ((CurrentSing) this.instance).clearOrderId();
                return this;
            }

            public Builder clearProgressMilliseconds() {
                copyOnWrite();
                ((CurrentSing) this.instance).clearProgressMilliseconds();
                return this;
            }

            public Builder clearSongCode() {
                copyOnWrite();
                ((CurrentSing) this.instance).clearSongCode();
                return this;
            }

            public Builder clearTitle() {
                copyOnWrite();
                ((CurrentSing) this.instance).clearTitle();
                return this;
            }

            public Builder clearUserId() {
                copyOnWrite();
                ((CurrentSing) this.instance).clearUserId();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.CurrentSingOrBuilder
            public String getAccompany() {
                return ((CurrentSing) this.instance).getAccompany();
            }

            @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.CurrentSingOrBuilder
            public ByteString getAccompanyBytes() {
                return ((CurrentSing) this.instance).getAccompanyBytes();
            }

            @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.CurrentSingOrBuilder
            public String getCover() {
                return ((CurrentSing) this.instance).getCover();
            }

            @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.CurrentSingOrBuilder
            public ByteString getCoverBytes() {
                return ((CurrentSing) this.instance).getCoverBytes();
            }

            @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.CurrentSingOrBuilder
            public boolean getHasStart() {
                return ((CurrentSing) this.instance).getHasStart();
            }

            @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.CurrentSingOrBuilder
            public String getLyricType() {
                return ((CurrentSing) this.instance).getLyricType();
            }

            @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.CurrentSingOrBuilder
            public ByteString getLyricTypeBytes() {
                return ((CurrentSing) this.instance).getLyricTypeBytes();
            }

            @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.CurrentSingOrBuilder
            public String getLyricUrl() {
                return ((CurrentSing) this.instance).getLyricUrl();
            }

            @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.CurrentSingOrBuilder
            public ByteString getLyricUrlBytes() {
                return ((CurrentSing) this.instance).getLyricUrlBytes();
            }

            @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.CurrentSingOrBuilder
            public userMaskConfig.UserMask getMask() {
                return ((CurrentSing) this.instance).getMask();
            }

            @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.CurrentSingOrBuilder
            public long getOrderId() {
                return ((CurrentSing) this.instance).getOrderId();
            }

            @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.CurrentSingOrBuilder
            public int getProgressMilliseconds() {
                return ((CurrentSing) this.instance).getProgressMilliseconds();
            }

            @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.CurrentSingOrBuilder
            public String getSongCode() {
                return ((CurrentSing) this.instance).getSongCode();
            }

            @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.CurrentSingOrBuilder
            public ByteString getSongCodeBytes() {
                return ((CurrentSing) this.instance).getSongCodeBytes();
            }

            @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.CurrentSingOrBuilder
            public String getTitle() {
                return ((CurrentSing) this.instance).getTitle();
            }

            @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.CurrentSingOrBuilder
            public ByteString getTitleBytes() {
                return ((CurrentSing) this.instance).getTitleBytes();
            }

            @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.CurrentSingOrBuilder
            public String getUserId() {
                return ((CurrentSing) this.instance).getUserId();
            }

            @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.CurrentSingOrBuilder
            public ByteString getUserIdBytes() {
                return ((CurrentSing) this.instance).getUserIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.CurrentSingOrBuilder
            public boolean hasMask() {
                return ((CurrentSing) this.instance).hasMask();
            }

            public Builder mergeMask(userMaskConfig.UserMask userMask) {
                copyOnWrite();
                ((CurrentSing) this.instance).mergeMask(userMask);
                return this;
            }

            public Builder setAccompany(String str) {
                copyOnWrite();
                ((CurrentSing) this.instance).setAccompany(str);
                return this;
            }

            public Builder setAccompanyBytes(ByteString byteString) {
                copyOnWrite();
                ((CurrentSing) this.instance).setAccompanyBytes(byteString);
                return this;
            }

            public Builder setCover(String str) {
                copyOnWrite();
                ((CurrentSing) this.instance).setCover(str);
                return this;
            }

            public Builder setCoverBytes(ByteString byteString) {
                copyOnWrite();
                ((CurrentSing) this.instance).setCoverBytes(byteString);
                return this;
            }

            public Builder setHasStart(boolean z) {
                copyOnWrite();
                ((CurrentSing) this.instance).setHasStart(z);
                return this;
            }

            public Builder setLyricType(String str) {
                copyOnWrite();
                ((CurrentSing) this.instance).setLyricType(str);
                return this;
            }

            public Builder setLyricTypeBytes(ByteString byteString) {
                copyOnWrite();
                ((CurrentSing) this.instance).setLyricTypeBytes(byteString);
                return this;
            }

            public Builder setLyricUrl(String str) {
                copyOnWrite();
                ((CurrentSing) this.instance).setLyricUrl(str);
                return this;
            }

            public Builder setLyricUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((CurrentSing) this.instance).setLyricUrlBytes(byteString);
                return this;
            }

            public Builder setMask(userMaskConfig.UserMask userMask) {
                copyOnWrite();
                ((CurrentSing) this.instance).setMask(userMask);
                return this;
            }

            public Builder setOrderId(long j) {
                copyOnWrite();
                ((CurrentSing) this.instance).setOrderId(j);
                return this;
            }

            public Builder setProgressMilliseconds(int i) {
                copyOnWrite();
                ((CurrentSing) this.instance).setProgressMilliseconds(i);
                return this;
            }

            public Builder setSongCode(String str) {
                copyOnWrite();
                ((CurrentSing) this.instance).setSongCode(str);
                return this;
            }

            public Builder setSongCodeBytes(ByteString byteString) {
                copyOnWrite();
                ((CurrentSing) this.instance).setSongCodeBytes(byteString);
                return this;
            }

            public Builder setTitle(String str) {
                copyOnWrite();
                ((CurrentSing) this.instance).setTitle(str);
                return this;
            }

            public Builder setTitleBytes(ByteString byteString) {
                copyOnWrite();
                ((CurrentSing) this.instance).setTitleBytes(byteString);
                return this;
            }

            public Builder setUserId(String str) {
                copyOnWrite();
                ((CurrentSing) this.instance).setUserId(str);
                return this;
            }

            public Builder setUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((CurrentSing) this.instance).setUserIdBytes(byteString);
                return this;
            }

            public Builder setMask(userMaskConfig.UserMask.Builder builder) {
                copyOnWrite();
                ((CurrentSing) this.instance).setMask(builder);
                return this;
            }
        }

        public static CurrentSing parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (CurrentSing) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CurrentSing parseFrom(byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
            return (CurrentSing) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3410h);
        }

        public static CurrentSing parseFrom(InputStream inputStream) throws IOException {
            return (CurrentSing) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CurrentSing parseFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (CurrentSing) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static CurrentSing parseFrom(C3407e c3407e) throws IOException {
            return (CurrentSing) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static CurrentSing parseFrom(C3407e c3407e, C3410h c3410h) throws IOException {
            return (CurrentSing) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e, c3410h);
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
                this.mask_ = userMaskConfig.UserMask.newBuilder(this.mask_).mergeFrom(userMask).buildPartial();
            }
        }

        public static Builder newBuilder(NextSing nextSing) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(nextSing);
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
            AbstractC3403a.checkByteStringIsUtf8(byteString);
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
            AbstractC3403a.checkByteStringIsUtf8(byteString);
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
            AbstractC3403a.checkByteStringIsUtf8(byteString);
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
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.lyricUrl_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMask(userMaskConfig.UserMask.Builder builder) {
            this.mask_ = builder.build();
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
            AbstractC3403a.checkByteStringIsUtf8(byteString);
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
            AbstractC3403a.checkByteStringIsUtf8(byteString);
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
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.userId_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C44221.f15945xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new NextSing();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3386h interfaceC3386h = (GeneratedMessageLite.InterfaceC3386h) obj;
                    NextSing nextSing = (NextSing) obj2;
                    this.userId_ = interfaceC3386h.mo16997f(!this.userId_.isEmpty(), this.userId_, !nextSing.userId_.isEmpty(), nextSing.userId_);
                    this.mask_ = (userMaskConfig.UserMask) interfaceC3386h.mo17006o(this.mask_, nextSing.mask_);
                    this.title_ = interfaceC3386h.mo16997f(!this.title_.isEmpty(), this.title_, !nextSing.title_.isEmpty(), nextSing.title_);
                    this.cover_ = interfaceC3386h.mo16997f(!this.cover_.isEmpty(), this.cover_, !nextSing.cover_.isEmpty(), nextSing.cover_);
                    this.songCode_ = interfaceC3386h.mo16997f(!this.songCode_.isEmpty(), this.songCode_, !nextSing.songCode_.isEmpty(), nextSing.songCode_);
                    this.lyricType_ = interfaceC3386h.mo16997f(!this.lyricType_.isEmpty(), this.lyricType_, !nextSing.lyricType_.isEmpty(), nextSing.lyricType_);
                    this.lyricUrl_ = interfaceC3386h.mo16997f(!this.lyricUrl_.isEmpty(), this.lyricUrl_, !nextSing.lyricUrl_.isEmpty(), nextSing.lyricUrl_);
                    this.accompany_ = interfaceC3386h.mo16997f(!this.accompany_.isEmpty(), this.accompany_, !nextSing.accompany_.isEmpty(), nextSing.accompany_);
                    int i = this.countDownSeconds_;
                    boolean z2 = i != 0;
                    int i2 = nextSing.countDownSeconds_;
                    this.countDownSeconds_ = interfaceC3386h.mo16996e(z2, i, i2 != 0, i2);
                    int i3 = this.remainSeconds_;
                    boolean z3 = i3 != 0;
                    int i4 = nextSing.remainSeconds_;
                    this.remainSeconds_ = interfaceC3386h.mo16996e(z3, i3, i4 != 0, i4);
                    GeneratedMessageLite.C3385g c3385g = GeneratedMessageLite.C3385g.INSTANCE;
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
                                    this.userId_ = c3407e.m17115L();
                                    continue;
                                case 18:
                                    userMaskConfig.UserMask userMask = this.mask_;
                                    userMaskConfig.UserMask.Builder builder = userMask != null ? userMask.toBuilder() : null;
                                    userMaskConfig.UserMask userMask2 = (userMaskConfig.UserMask) c3407e.m17143w(userMaskConfig.UserMask.parser(), c3410h);
                                    this.mask_ = userMask2;
                                    if (builder != null) {
                                        builder.mergeFrom(userMask2);
                                        this.mask_ = builder.buildPartial();
                                    } else {
                                        continue;
                                    }
                                    break;
                                case 26:
                                    this.title_ = c3407e.m17115L();
                                    continue;
                                case 34:
                                    this.cover_ = c3407e.m17115L();
                                    continue;
                                case 42:
                                    this.songCode_ = c3407e.m17115L();
                                    continue;
                                case 50:
                                    this.lyricType_ = c3407e.m17115L();
                                    continue;
                                case 58:
                                    this.lyricUrl_ = c3407e.m17115L();
                                    continue;
                                case 66:
                                    this.accompany_ = c3407e.m17115L();
                                    continue;
                                case 72:
                                    this.countDownSeconds_ = c3407e.m17141u();
                                    continue;
                                case 80:
                                    this.remainSeconds_ = c3407e.m17141u();
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
                        synchronized (NextSing.class) {
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

        @Override // com.google.protobuf.InterfaceC3419q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16901K = !this.userId_.isEmpty() ? CodedOutputStream.m16901K(1, getUserId()) : 0;
            if (this.mask_ != null) {
                iM16901K += CodedOutputStream.m16893C(2, getMask());
            }
            if (!this.title_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(3, getTitle());
            }
            if (!this.cover_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(4, getCover());
            }
            if (!this.songCode_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(5, getSongCode());
            }
            if (!this.lyricType_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(6, getLyricType());
            }
            if (!this.lyricUrl_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(7, getLyricUrl());
            }
            if (!this.accompany_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(8, getAccompany());
            }
            int i2 = this.countDownSeconds_;
            if (i2 != 0) {
                iM16901K += CodedOutputStream.m16929t(9, i2);
            }
            int i3 = this.remainSeconds_;
            if (i3 != 0) {
                iM16901K += CodedOutputStream.m16929t(10, i3);
            }
            this.memoizedSerializedSize = iM16901K;
            return iM16901K;
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

        @Override // com.google.protobuf.InterfaceC3419q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.userId_.isEmpty()) {
                codedOutputStream.mo16939D0(1, getUserId());
            }
            if (this.mask_ != null) {
                codedOutputStream.mo16974w0(2, getMask());
            }
            if (!this.title_.isEmpty()) {
                codedOutputStream.mo16939D0(3, getTitle());
            }
            if (!this.cover_.isEmpty()) {
                codedOutputStream.mo16939D0(4, getCover());
            }
            if (!this.songCode_.isEmpty()) {
                codedOutputStream.mo16939D0(5, getSongCode());
            }
            if (!this.lyricType_.isEmpty()) {
                codedOutputStream.mo16939D0(6, getLyricType());
            }
            if (!this.lyricUrl_.isEmpty()) {
                codedOutputStream.mo16939D0(7, getLyricUrl());
            }
            if (!this.accompany_.isEmpty()) {
                codedOutputStream.mo16939D0(8, getAccompany());
            }
            int i = this.countDownSeconds_;
            if (i != 0) {
                codedOutputStream.mo16970s0(9, i);
            }
            int i2 = this.remainSeconds_;
            if (i2 != 0) {
                codedOutputStream.mo16970s0(10, i2);
            }
        }

        public static NextSing parseDelimitedFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (NextSing) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static NextSing parseFrom(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
            return (NextSing) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3410h);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMask(userMaskConfig.UserMask userMask) {
            userMask.getClass();
            this.mask_ = userMask;
        }

        public static final class Builder extends GeneratedMessageLite.AbstractC3380b<NextSing, Builder> implements NextSingOrBuilder {
            private Builder() {
                super(NextSing.DEFAULT_INSTANCE);
            }

            public Builder clearAccompany() {
                copyOnWrite();
                ((NextSing) this.instance).clearAccompany();
                return this;
            }

            public Builder clearCountDownSeconds() {
                copyOnWrite();
                ((NextSing) this.instance).clearCountDownSeconds();
                return this;
            }

            public Builder clearCover() {
                copyOnWrite();
                ((NextSing) this.instance).clearCover();
                return this;
            }

            public Builder clearLyricType() {
                copyOnWrite();
                ((NextSing) this.instance).clearLyricType();
                return this;
            }

            public Builder clearLyricUrl() {
                copyOnWrite();
                ((NextSing) this.instance).clearLyricUrl();
                return this;
            }

            public Builder clearMask() {
                copyOnWrite();
                ((NextSing) this.instance).clearMask();
                return this;
            }

            public Builder clearRemainSeconds() {
                copyOnWrite();
                ((NextSing) this.instance).clearRemainSeconds();
                return this;
            }

            public Builder clearSongCode() {
                copyOnWrite();
                ((NextSing) this.instance).clearSongCode();
                return this;
            }

            public Builder clearTitle() {
                copyOnWrite();
                ((NextSing) this.instance).clearTitle();
                return this;
            }

            public Builder clearUserId() {
                copyOnWrite();
                ((NextSing) this.instance).clearUserId();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.NextSingOrBuilder
            public String getAccompany() {
                return ((NextSing) this.instance).getAccompany();
            }

            @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.NextSingOrBuilder
            public ByteString getAccompanyBytes() {
                return ((NextSing) this.instance).getAccompanyBytes();
            }

            @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.NextSingOrBuilder
            public int getCountDownSeconds() {
                return ((NextSing) this.instance).getCountDownSeconds();
            }

            @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.NextSingOrBuilder
            public String getCover() {
                return ((NextSing) this.instance).getCover();
            }

            @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.NextSingOrBuilder
            public ByteString getCoverBytes() {
                return ((NextSing) this.instance).getCoverBytes();
            }

            @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.NextSingOrBuilder
            public String getLyricType() {
                return ((NextSing) this.instance).getLyricType();
            }

            @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.NextSingOrBuilder
            public ByteString getLyricTypeBytes() {
                return ((NextSing) this.instance).getLyricTypeBytes();
            }

            @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.NextSingOrBuilder
            public String getLyricUrl() {
                return ((NextSing) this.instance).getLyricUrl();
            }

            @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.NextSingOrBuilder
            public ByteString getLyricUrlBytes() {
                return ((NextSing) this.instance).getLyricUrlBytes();
            }

            @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.NextSingOrBuilder
            public userMaskConfig.UserMask getMask() {
                return ((NextSing) this.instance).getMask();
            }

            @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.NextSingOrBuilder
            public int getRemainSeconds() {
                return ((NextSing) this.instance).getRemainSeconds();
            }

            @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.NextSingOrBuilder
            public String getSongCode() {
                return ((NextSing) this.instance).getSongCode();
            }

            @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.NextSingOrBuilder
            public ByteString getSongCodeBytes() {
                return ((NextSing) this.instance).getSongCodeBytes();
            }

            @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.NextSingOrBuilder
            public String getTitle() {
                return ((NextSing) this.instance).getTitle();
            }

            @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.NextSingOrBuilder
            public ByteString getTitleBytes() {
                return ((NextSing) this.instance).getTitleBytes();
            }

            @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.NextSingOrBuilder
            public String getUserId() {
                return ((NextSing) this.instance).getUserId();
            }

            @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.NextSingOrBuilder
            public ByteString getUserIdBytes() {
                return ((NextSing) this.instance).getUserIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.NextSingOrBuilder
            public boolean hasMask() {
                return ((NextSing) this.instance).hasMask();
            }

            public Builder mergeMask(userMaskConfig.UserMask userMask) {
                copyOnWrite();
                ((NextSing) this.instance).mergeMask(userMask);
                return this;
            }

            public Builder setAccompany(String str) {
                copyOnWrite();
                ((NextSing) this.instance).setAccompany(str);
                return this;
            }

            public Builder setAccompanyBytes(ByteString byteString) {
                copyOnWrite();
                ((NextSing) this.instance).setAccompanyBytes(byteString);
                return this;
            }

            public Builder setCountDownSeconds(int i) {
                copyOnWrite();
                ((NextSing) this.instance).setCountDownSeconds(i);
                return this;
            }

            public Builder setCover(String str) {
                copyOnWrite();
                ((NextSing) this.instance).setCover(str);
                return this;
            }

            public Builder setCoverBytes(ByteString byteString) {
                copyOnWrite();
                ((NextSing) this.instance).setCoverBytes(byteString);
                return this;
            }

            public Builder setLyricType(String str) {
                copyOnWrite();
                ((NextSing) this.instance).setLyricType(str);
                return this;
            }

            public Builder setLyricTypeBytes(ByteString byteString) {
                copyOnWrite();
                ((NextSing) this.instance).setLyricTypeBytes(byteString);
                return this;
            }

            public Builder setLyricUrl(String str) {
                copyOnWrite();
                ((NextSing) this.instance).setLyricUrl(str);
                return this;
            }

            public Builder setLyricUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((NextSing) this.instance).setLyricUrlBytes(byteString);
                return this;
            }

            public Builder setMask(userMaskConfig.UserMask userMask) {
                copyOnWrite();
                ((NextSing) this.instance).setMask(userMask);
                return this;
            }

            public Builder setRemainSeconds(int i) {
                copyOnWrite();
                ((NextSing) this.instance).setRemainSeconds(i);
                return this;
            }

            public Builder setSongCode(String str) {
                copyOnWrite();
                ((NextSing) this.instance).setSongCode(str);
                return this;
            }

            public Builder setSongCodeBytes(ByteString byteString) {
                copyOnWrite();
                ((NextSing) this.instance).setSongCodeBytes(byteString);
                return this;
            }

            public Builder setTitle(String str) {
                copyOnWrite();
                ((NextSing) this.instance).setTitle(str);
                return this;
            }

            public Builder setTitleBytes(ByteString byteString) {
                copyOnWrite();
                ((NextSing) this.instance).setTitleBytes(byteString);
                return this;
            }

            public Builder setUserId(String str) {
                copyOnWrite();
                ((NextSing) this.instance).setUserId(str);
                return this;
            }

            public Builder setUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((NextSing) this.instance).setUserIdBytes(byteString);
                return this;
            }

            public Builder setMask(userMaskConfig.UserMask.Builder builder) {
                copyOnWrite();
                ((NextSing) this.instance).setMask(builder);
                return this;
            }
        }

        public static NextSing parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (NextSing) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static NextSing parseFrom(byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
            return (NextSing) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3410h);
        }

        public static NextSing parseFrom(InputStream inputStream) throws IOException {
            return (NextSing) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NextSing parseFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (NextSing) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static NextSing parseFrom(C3407e c3407e) throws IOException {
            return (NextSing) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static NextSing parseFrom(C3407e c3407e, C3410h c3410h) throws IOException {
            return (NextSing) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e, c3410h);
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
                this.currentSing_ = CurrentSing.newBuilder(this.currentSing_).mergeFrom(currentSing).buildPartial();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeNextSing(NextSing nextSing) {
            NextSing nextSing2 = this.nextSing_;
            if (nextSing2 == null || nextSing2 == NextSing.getDefaultInstance()) {
                this.nextSing_ = nextSing;
            } else {
                this.nextSing_ = NextSing.newBuilder(this.nextSing_).mergeFrom(nextSing).buildPartial();
            }
        }

        public static Builder newBuilder(VoiceSing voiceSing) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(voiceSing);
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
            this.currentSing_ = builder.build();
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
        public void setNextSing(NextSing.Builder builder) {
            this.nextSing_ = builder.build();
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

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C44221.f15945xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoiceSing();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3386h interfaceC3386h = (GeneratedMessageLite.InterfaceC3386h) obj;
                    VoiceSing voiceSing = (VoiceSing) obj2;
                    this.id_ = interfaceC3386h.mo16997f(!this.id_.isEmpty(), this.id_, !voiceSing.id_.isEmpty(), voiceSing.id_);
                    this.status_ = interfaceC3386h.mo16997f(!this.status_.isEmpty(), this.status_, !voiceSing.status_.isEmpty(), voiceSing.status_);
                    this.currentSing_ = (CurrentSing) interfaceC3386h.mo17006o(this.currentSing_, voiceSing.currentSing_);
                    this.nextSing_ = (NextSing) interfaceC3386h.mo17006o(this.nextSing_, voiceSing.nextSing_);
                    this.toast_ = interfaceC3386h.mo16997f(!this.toast_.isEmpty(), this.toast_, true ^ voiceSing.toast_.isEmpty(), voiceSing.toast_);
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
                                    this.id_ = c3407e.m17115L();
                                } else if (iM17116M == 18) {
                                    this.status_ = c3407e.m17115L();
                                } else if (iM17116M == 26) {
                                    CurrentSing currentSing = this.currentSing_;
                                    CurrentSing.Builder builder = currentSing != null ? currentSing.toBuilder() : null;
                                    CurrentSing currentSing2 = (CurrentSing) c3407e.m17143w(CurrentSing.parser(), c3410h);
                                    this.currentSing_ = currentSing2;
                                    if (builder != null) {
                                        builder.mergeFrom(currentSing2);
                                        this.currentSing_ = builder.buildPartial();
                                    }
                                } else if (iM17116M == 34) {
                                    NextSing nextSing = this.nextSing_;
                                    NextSing.Builder builder2 = nextSing != null ? nextSing.toBuilder() : null;
                                    NextSing nextSing2 = (NextSing) c3407e.m17143w(NextSing.parser(), c3410h);
                                    this.nextSing_ = nextSing2;
                                    if (builder2 != null) {
                                        builder2.mergeFrom(nextSing2);
                                        this.nextSing_ = builder2.buildPartial();
                                    }
                                } else if (iM17116M == 42) {
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
                        synchronized (VoiceSing.class) {
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

        @Override // com.google.protobuf.InterfaceC3419q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16901K = !this.id_.isEmpty() ? CodedOutputStream.m16901K(1, getId()) : 0;
            if (!this.status_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(2, getStatus());
            }
            if (this.currentSing_ != null) {
                iM16901K += CodedOutputStream.m16893C(3, getCurrentSing());
            }
            if (this.nextSing_ != null) {
                iM16901K += CodedOutputStream.m16893C(4, getNextSing());
            }
            if (!this.toast_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(5, getToast());
            }
            this.memoizedSerializedSize = iM16901K;
            return iM16901K;
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

        @Override // com.google.protobuf.InterfaceC3419q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.id_.isEmpty()) {
                codedOutputStream.mo16939D0(1, getId());
            }
            if (!this.status_.isEmpty()) {
                codedOutputStream.mo16939D0(2, getStatus());
            }
            if (this.currentSing_ != null) {
                codedOutputStream.mo16974w0(3, getCurrentSing());
            }
            if (this.nextSing_ != null) {
                codedOutputStream.mo16974w0(4, getNextSing());
            }
            if (this.toast_.isEmpty()) {
                return;
            }
            codedOutputStream.mo16939D0(5, getToast());
        }

        public static VoiceSing parseDelimitedFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (VoiceSing) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static VoiceSing parseFrom(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
            return (VoiceSing) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3410h);
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

        public static final class Builder extends GeneratedMessageLite.AbstractC3380b<VoiceSing, Builder> implements VoiceSingOrBuilder {
            private Builder() {
                super(VoiceSing.DEFAULT_INSTANCE);
            }

            public Builder clearCurrentSing() {
                copyOnWrite();
                ((VoiceSing) this.instance).clearCurrentSing();
                return this;
            }

            public Builder clearId() {
                copyOnWrite();
                ((VoiceSing) this.instance).clearId();
                return this;
            }

            public Builder clearNextSing() {
                copyOnWrite();
                ((VoiceSing) this.instance).clearNextSing();
                return this;
            }

            public Builder clearStatus() {
                copyOnWrite();
                ((VoiceSing) this.instance).clearStatus();
                return this;
            }

            public Builder clearToast() {
                copyOnWrite();
                ((VoiceSing) this.instance).clearToast();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.VoiceSingOrBuilder
            public CurrentSing getCurrentSing() {
                return ((VoiceSing) this.instance).getCurrentSing();
            }

            @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.VoiceSingOrBuilder
            public String getId() {
                return ((VoiceSing) this.instance).getId();
            }

            @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.VoiceSingOrBuilder
            public ByteString getIdBytes() {
                return ((VoiceSing) this.instance).getIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.VoiceSingOrBuilder
            public NextSing getNextSing() {
                return ((VoiceSing) this.instance).getNextSing();
            }

            @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.VoiceSingOrBuilder
            public String getStatus() {
                return ((VoiceSing) this.instance).getStatus();
            }

            @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.VoiceSingOrBuilder
            public ByteString getStatusBytes() {
                return ((VoiceSing) this.instance).getStatusBytes();
            }

            @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.VoiceSingOrBuilder
            public String getToast() {
                return ((VoiceSing) this.instance).getToast();
            }

            @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.VoiceSingOrBuilder
            public ByteString getToastBytes() {
                return ((VoiceSing) this.instance).getToastBytes();
            }

            @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.VoiceSingOrBuilder
            public boolean hasCurrentSing() {
                return ((VoiceSing) this.instance).hasCurrentSing();
            }

            @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.VoiceSingOrBuilder
            public boolean hasNextSing() {
                return ((VoiceSing) this.instance).hasNextSing();
            }

            public Builder mergeCurrentSing(CurrentSing currentSing) {
                copyOnWrite();
                ((VoiceSing) this.instance).mergeCurrentSing(currentSing);
                return this;
            }

            public Builder mergeNextSing(NextSing nextSing) {
                copyOnWrite();
                ((VoiceSing) this.instance).mergeNextSing(nextSing);
                return this;
            }

            public Builder setCurrentSing(CurrentSing currentSing) {
                copyOnWrite();
                ((VoiceSing) this.instance).setCurrentSing(currentSing);
                return this;
            }

            public Builder setId(String str) {
                copyOnWrite();
                ((VoiceSing) this.instance).setId(str);
                return this;
            }

            public Builder setIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceSing) this.instance).setIdBytes(byteString);
                return this;
            }

            public Builder setNextSing(NextSing nextSing) {
                copyOnWrite();
                ((VoiceSing) this.instance).setNextSing(nextSing);
                return this;
            }

            public Builder setStatus(String str) {
                copyOnWrite();
                ((VoiceSing) this.instance).setStatus(str);
                return this;
            }

            public Builder setStatusBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceSing) this.instance).setStatusBytes(byteString);
                return this;
            }

            public Builder setToast(String str) {
                copyOnWrite();
                ((VoiceSing) this.instance).setToast(str);
                return this;
            }

            public Builder setToastBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceSing) this.instance).setToastBytes(byteString);
                return this;
            }

            public Builder setCurrentSing(CurrentSing.Builder builder) {
                copyOnWrite();
                ((VoiceSing) this.instance).setCurrentSing(builder);
                return this;
            }

            public Builder setNextSing(NextSing.Builder builder) {
                copyOnWrite();
                ((VoiceSing) this.instance).setNextSing(builder);
                return this;
            }
        }

        public static VoiceSing parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoiceSing) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoiceSing parseFrom(byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
            return (VoiceSing) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3410h);
        }

        public static VoiceSing parseFrom(InputStream inputStream) throws IOException {
            return (VoiceSing) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceSing parseFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (VoiceSing) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static VoiceSing parseFrom(C3407e c3407e) throws IOException {
            return (VoiceSing) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static VoiceSing parseFrom(C3407e c3407e, C3410h c3410h) throws IOException {
            return (VoiceSing) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e, c3410h);
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

        public static final class Builder extends GeneratedMessageLite.AbstractC3380b<VoiceSingConfirm, Builder> implements VoiceSingConfirmOrBuilder {
            private Builder() {
                super(VoiceSingConfirm.DEFAULT_INSTANCE);
            }

            public Builder clearId() {
                copyOnWrite();
                ((VoiceSingConfirm) this.instance).clearId();
                return this;
            }

            public Builder clearOrderId() {
                copyOnWrite();
                ((VoiceSingConfirm) this.instance).clearOrderId();
                return this;
            }

            public Builder clearTitle() {
                copyOnWrite();
                ((VoiceSingConfirm) this.instance).clearTitle();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.VoiceSingConfirmOrBuilder
            public String getId() {
                return ((VoiceSingConfirm) this.instance).getId();
            }

            @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.VoiceSingConfirmOrBuilder
            public ByteString getIdBytes() {
                return ((VoiceSingConfirm) this.instance).getIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.VoiceSingConfirmOrBuilder
            public String getOrderId() {
                return ((VoiceSingConfirm) this.instance).getOrderId();
            }

            @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.VoiceSingConfirmOrBuilder
            public ByteString getOrderIdBytes() {
                return ((VoiceSingConfirm) this.instance).getOrderIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.VoiceSingConfirmOrBuilder
            public String getTitle() {
                return ((VoiceSingConfirm) this.instance).getTitle();
            }

            @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.VoiceSingConfirmOrBuilder
            public ByteString getTitleBytes() {
                return ((VoiceSingConfirm) this.instance).getTitleBytes();
            }

            public Builder setId(String str) {
                copyOnWrite();
                ((VoiceSingConfirm) this.instance).setId(str);
                return this;
            }

            public Builder setIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceSingConfirm) this.instance).setIdBytes(byteString);
                return this;
            }

            public Builder setOrderId(String str) {
                copyOnWrite();
                ((VoiceSingConfirm) this.instance).setOrderId(str);
                return this;
            }

            public Builder setOrderIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceSingConfirm) this.instance).setOrderIdBytes(byteString);
                return this;
            }

            public Builder setTitle(String str) {
                copyOnWrite();
                ((VoiceSingConfirm) this.instance).setTitle(str);
                return this;
            }

            public Builder setTitleBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceSingConfirm) this.instance).setTitleBytes(byteString);
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
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(voiceSingConfirm);
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
            AbstractC3403a.checkByteStringIsUtf8(byteString);
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
            AbstractC3403a.checkByteStringIsUtf8(byteString);
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
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.title_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C44221.f15945xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoiceSingConfirm();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3386h interfaceC3386h = (GeneratedMessageLite.InterfaceC3386h) obj;
                    VoiceSingConfirm voiceSingConfirm = (VoiceSingConfirm) obj2;
                    this.id_ = interfaceC3386h.mo16997f(!this.id_.isEmpty(), this.id_, !voiceSingConfirm.id_.isEmpty(), voiceSingConfirm.id_);
                    this.orderId_ = interfaceC3386h.mo16997f(!this.orderId_.isEmpty(), this.orderId_, !voiceSingConfirm.orderId_.isEmpty(), voiceSingConfirm.orderId_);
                    this.title_ = interfaceC3386h.mo16997f(!this.title_.isEmpty(), this.title_, true ^ voiceSingConfirm.title_.isEmpty(), voiceSingConfirm.title_);
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
                                    this.id_ = c3407e.m17115L();
                                } else if (iM17116M == 18) {
                                    this.orderId_ = c3407e.m17115L();
                                } else if (iM17116M == 26) {
                                    this.title_ = c3407e.m17115L();
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
                        synchronized (VoiceSingConfirm.class) {
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

        @Override // com.google.protobuf.InterfaceC3419q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16901K = !this.id_.isEmpty() ? CodedOutputStream.m16901K(1, getId()) : 0;
            if (!this.orderId_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(2, getOrderId());
            }
            if (!this.title_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(3, getTitle());
            }
            this.memoizedSerializedSize = iM16901K;
            return iM16901K;
        }

        @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.VoiceSingConfirmOrBuilder
        public String getTitle() {
            return this.title_;
        }

        @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.VoiceSingConfirmOrBuilder
        public ByteString getTitleBytes() {
            return ByteString.copyFromUtf8(this.title_);
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.id_.isEmpty()) {
                codedOutputStream.mo16939D0(1, getId());
            }
            if (!this.orderId_.isEmpty()) {
                codedOutputStream.mo16939D0(2, getOrderId());
            }
            if (this.title_.isEmpty()) {
                return;
            }
            codedOutputStream.mo16939D0(3, getTitle());
        }

        public static VoiceSingConfirm parseDelimitedFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (VoiceSingConfirm) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static VoiceSingConfirm parseFrom(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
            return (VoiceSingConfirm) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3410h);
        }

        public static VoiceSingConfirm parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoiceSingConfirm) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoiceSingConfirm parseFrom(byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
            return (VoiceSingConfirm) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3410h);
        }

        public static VoiceSingConfirm parseFrom(InputStream inputStream) throws IOException {
            return (VoiceSingConfirm) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceSingConfirm parseFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (VoiceSingConfirm) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static VoiceSingConfirm parseFrom(C3407e c3407e) throws IOException {
            return (VoiceSingConfirm) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static VoiceSingConfirm parseFrom(C3407e c3407e, C3410h c3410h) throws IOException {
            return (VoiceSingConfirm) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e, c3410h);
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

        public static final class Builder extends GeneratedMessageLite.AbstractC3380b<VoiceSingStart, Builder> implements VoiceSingStartOrBuilder {
            private Builder() {
                super(VoiceSingStart.DEFAULT_INSTANCE);
            }

            public Builder clearId() {
                copyOnWrite();
                ((VoiceSingStart) this.instance).clearId();
                return this;
            }

            public Builder clearOrderId() {
                copyOnWrite();
                ((VoiceSingStart) this.instance).clearOrderId();
                return this;
            }

            public Builder clearUserId() {
                copyOnWrite();
                ((VoiceSingStart) this.instance).clearUserId();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.VoiceSingStartOrBuilder
            public String getId() {
                return ((VoiceSingStart) this.instance).getId();
            }

            @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.VoiceSingStartOrBuilder
            public ByteString getIdBytes() {
                return ((VoiceSingStart) this.instance).getIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.VoiceSingStartOrBuilder
            public String getOrderId() {
                return ((VoiceSingStart) this.instance).getOrderId();
            }

            @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.VoiceSingStartOrBuilder
            public ByteString getOrderIdBytes() {
                return ((VoiceSingStart) this.instance).getOrderIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.VoiceSingStartOrBuilder
            public String getUserId() {
                return ((VoiceSingStart) this.instance).getUserId();
            }

            @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.VoiceSingStartOrBuilder
            public ByteString getUserIdBytes() {
                return ((VoiceSingStart) this.instance).getUserIdBytes();
            }

            public Builder setId(String str) {
                copyOnWrite();
                ((VoiceSingStart) this.instance).setId(str);
                return this;
            }

            public Builder setIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceSingStart) this.instance).setIdBytes(byteString);
                return this;
            }

            public Builder setOrderId(String str) {
                copyOnWrite();
                ((VoiceSingStart) this.instance).setOrderId(str);
                return this;
            }

            public Builder setOrderIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceSingStart) this.instance).setOrderIdBytes(byteString);
                return this;
            }

            public Builder setUserId(String str) {
                copyOnWrite();
                ((VoiceSingStart) this.instance).setUserId(str);
                return this;
            }

            public Builder setUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceSingStart) this.instance).setUserIdBytes(byteString);
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
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(voiceSingStart);
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
            AbstractC3403a.checkByteStringIsUtf8(byteString);
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
            AbstractC3403a.checkByteStringIsUtf8(byteString);
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
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.userId_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C44221.f15945xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoiceSingStart();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3386h interfaceC3386h = (GeneratedMessageLite.InterfaceC3386h) obj;
                    VoiceSingStart voiceSingStart = (VoiceSingStart) obj2;
                    this.id_ = interfaceC3386h.mo16997f(!this.id_.isEmpty(), this.id_, !voiceSingStart.id_.isEmpty(), voiceSingStart.id_);
                    this.orderId_ = interfaceC3386h.mo16997f(!this.orderId_.isEmpty(), this.orderId_, !voiceSingStart.orderId_.isEmpty(), voiceSingStart.orderId_);
                    this.userId_ = interfaceC3386h.mo16997f(!this.userId_.isEmpty(), this.userId_, true ^ voiceSingStart.userId_.isEmpty(), voiceSingStart.userId_);
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
                                    this.id_ = c3407e.m17115L();
                                } else if (iM17116M == 18) {
                                    this.orderId_ = c3407e.m17115L();
                                } else if (iM17116M == 26) {
                                    this.userId_ = c3407e.m17115L();
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
                        synchronized (VoiceSingStart.class) {
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

        @Override // com.google.protobuf.InterfaceC3419q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16901K = !this.id_.isEmpty() ? CodedOutputStream.m16901K(1, getId()) : 0;
            if (!this.orderId_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(2, getOrderId());
            }
            if (!this.userId_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(3, getUserId());
            }
            this.memoizedSerializedSize = iM16901K;
            return iM16901K;
        }

        @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.VoiceSingStartOrBuilder
        public String getUserId() {
            return this.userId_;
        }

        @Override // com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether.VoiceSingStartOrBuilder
        public ByteString getUserIdBytes() {
            return ByteString.copyFromUtf8(this.userId_);
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.id_.isEmpty()) {
                codedOutputStream.mo16939D0(1, getId());
            }
            if (!this.orderId_.isEmpty()) {
                codedOutputStream.mo16939D0(2, getOrderId());
            }
            if (this.userId_.isEmpty()) {
                return;
            }
            codedOutputStream.mo16939D0(3, getUserId());
        }

        public static VoiceSingStart parseDelimitedFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (VoiceSingStart) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static VoiceSingStart parseFrom(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
            return (VoiceSingStart) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3410h);
        }

        public static VoiceSingStart parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoiceSingStart) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoiceSingStart parseFrom(byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
            return (VoiceSingStart) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3410h);
        }

        public static VoiceSingStart parseFrom(InputStream inputStream) throws IOException {
            return (VoiceSingStart) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceSingStart parseFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (VoiceSingStart) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static VoiceSingStart parseFrom(C3407e c3407e) throws IOException {
            return (VoiceSingStart) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static VoiceSingStart parseFrom(C3407e c3407e, C3410h c3410h) throws IOException {
            return (VoiceSingStart) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e, c3410h);
        }
    }
}
