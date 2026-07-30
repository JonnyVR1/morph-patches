package com.p003p1.mobile.longlink.msg.connector;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.a;
import com.google.protobuf.e;
import com.google.protobuf.h;
import com.google.protobuf.q;
import java.io.IOException;
import java.io.InputStream;
import l.aag0;
import l.bz00;
import l.i860;
import l.o6z;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public final class LongLinkMomentMessage {

    /* JADX INFO: renamed from: com.p1.mobile.longlink.msg.connector.LongLinkMomentMessage$1 */
    public static /* synthetic */ class C03171 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f1635xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f1635xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1635xa1df5c61[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1635xa1df5c61[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1635xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1635xa1df5c61[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1635xa1df5c61[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1635xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f1635xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public interface MomentCancelLikeOrBuilder extends o6z {
        /* synthetic */ q getDefaultInstanceForType();

        String getMid();

        ByteString getMidBytes();

        String getOtherUserId();

        ByteString getOtherUserIdBytes();

        /* synthetic */ boolean isInitialized();
    }

    public interface MomentCommentOrBuilder extends o6z {
        /* synthetic */ q getDefaultInstanceForType();

        String getMid();

        ByteString getMidBytes();

        String getOtherUserId();

        ByteString getOtherUserIdBytes();

        String getTicker();

        ByteString getTickerBytes();

        /* synthetic */ boolean isInitialized();
    }

    public interface MomentLikeOrBuilder extends o6z {
        /* synthetic */ q getDefaultInstanceForType();

        String getMid();

        ByteString getMidBytes();

        String getOtherUserId();

        ByteString getOtherUserIdBytes();

        /* synthetic */ boolean isInitialized();
    }

    private LongLinkMomentMessage() {
    }

    public static void registerAllExtensions(h hVar) {
    }

    public static final class MomentCancelLike extends GeneratedMessageLite<MomentCancelLike, Builder> implements MomentCancelLikeOrBuilder {
        private static final MomentCancelLike DEFAULT_INSTANCE;
        public static final int MID_FIELD_NUMBER = 1;
        public static final int OTHERUSERID_FIELD_NUMBER = 2;
        private static volatile i860<MomentCancelLike> PARSER;
        private String mid_ = "";
        private String otherUserId_ = "";

        public static final class Builder extends GeneratedMessageLite.b<MomentCancelLike, Builder> implements MomentCancelLikeOrBuilder {
            private Builder() {
                super(MomentCancelLike.DEFAULT_INSTANCE);
            }

            public Builder clearMid() {
                copyOnWrite();
                ((MomentCancelLike) ((GeneratedMessageLite.b) this).instance).clearMid();
                return this;
            }

            public Builder clearOtherUserId() {
                copyOnWrite();
                ((MomentCancelLike) ((GeneratedMessageLite.b) this).instance).clearOtherUserId();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkMomentMessage.MomentCancelLikeOrBuilder
            public String getMid() {
                return ((MomentCancelLike) ((GeneratedMessageLite.b) this).instance).getMid();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkMomentMessage.MomentCancelLikeOrBuilder
            public ByteString getMidBytes() {
                return ((MomentCancelLike) ((GeneratedMessageLite.b) this).instance).getMidBytes();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkMomentMessage.MomentCancelLikeOrBuilder
            public String getOtherUserId() {
                return ((MomentCancelLike) ((GeneratedMessageLite.b) this).instance).getOtherUserId();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkMomentMessage.MomentCancelLikeOrBuilder
            public ByteString getOtherUserIdBytes() {
                return ((MomentCancelLike) ((GeneratedMessageLite.b) this).instance).getOtherUserIdBytes();
            }

            public Builder setMid(String str) {
                copyOnWrite();
                ((MomentCancelLike) ((GeneratedMessageLite.b) this).instance).setMid(str);
                return this;
            }

            public Builder setMidBytes(ByteString byteString) {
                copyOnWrite();
                ((MomentCancelLike) ((GeneratedMessageLite.b) this).instance).setMidBytes(byteString);
                return this;
            }

            public Builder setOtherUserId(String str) {
                copyOnWrite();
                ((MomentCancelLike) ((GeneratedMessageLite.b) this).instance).setOtherUserId(str);
                return this;
            }

            public Builder setOtherUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((MomentCancelLike) ((GeneratedMessageLite.b) this).instance).setOtherUserIdBytes(byteString);
                return this;
            }
        }

        static {
            MomentCancelLike momentCancelLike = new MomentCancelLike();
            DEFAULT_INSTANCE = momentCancelLike;
            momentCancelLike.makeImmutable();
        }

        private MomentCancelLike() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMid() {
            this.mid_ = getDefaultInstance().getMid();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOtherUserId() {
            this.otherUserId_ = getDefaultInstance().getOtherUserId();
        }

        public static MomentCancelLike getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(MomentCancelLike momentCancelLike) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(momentCancelLike);
        }

        public static MomentCancelLike parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (MomentCancelLike) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MomentCancelLike parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (MomentCancelLike) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<MomentCancelLike> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMid(String str) {
            str.getClass();
            this.mid_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMidBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.mid_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOtherUserId(String str) {
            str.getClass();
            this.otherUserId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOtherUserIdBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.otherUserId_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C03171.f1635xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new MomentCancelLike();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    MomentCancelLike momentCancelLike = (MomentCancelLike) obj2;
                    this.mid_ = hVar.f(!this.mid_.isEmpty(), this.mid_, !momentCancelLike.mid_.isEmpty(), momentCancelLike.mid_);
                    this.otherUserId_ = hVar.f(!this.otherUserId_.isEmpty(), this.otherUserId_, true ^ momentCancelLike.otherUserId_.isEmpty(), momentCancelLike.otherUserId_);
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
                                    this.mid_ = eVar.L();
                                } else if (iM == 18) {
                                    this.otherUserId_ = eVar.L();
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
                        synchronized (MomentCancelLike.class) {
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

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkMomentMessage.MomentCancelLikeOrBuilder
        public String getMid() {
            return this.mid_;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkMomentMessage.MomentCancelLikeOrBuilder
        public ByteString getMidBytes() {
            return ByteString.copyFromUtf8(this.mid_);
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkMomentMessage.MomentCancelLikeOrBuilder
        public String getOtherUserId() {
            return this.otherUserId_;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkMomentMessage.MomentCancelLikeOrBuilder
        public ByteString getOtherUserIdBytes() {
            return ByteString.copyFromUtf8(this.otherUserId_);
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iK = !this.mid_.isEmpty() ? CodedOutputStream.K(1, getMid()) : 0;
            if (!this.otherUserId_.isEmpty()) {
                iK += CodedOutputStream.K(2, getOtherUserId());
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iK;
            return iK;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.mid_.isEmpty()) {
                codedOutputStream.D0(1, getMid());
            }
            if (this.otherUserId_.isEmpty()) {
                return;
            }
            codedOutputStream.D0(2, getOtherUserId());
        }

        public static MomentCancelLike parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (MomentCancelLike) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static MomentCancelLike parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (MomentCancelLike) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static MomentCancelLike parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (MomentCancelLike) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MomentCancelLike parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (MomentCancelLike) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static MomentCancelLike parseFrom(InputStream inputStream) throws IOException {
            return (MomentCancelLike) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MomentCancelLike parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (MomentCancelLike) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static MomentCancelLike parseFrom(e eVar) throws IOException {
            return (MomentCancelLike) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static MomentCancelLike parseFrom(e eVar, h hVar) throws IOException {
            return (MomentCancelLike) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public static final class MomentComment extends GeneratedMessageLite<MomentComment, Builder> implements MomentCommentOrBuilder {
        private static final MomentComment DEFAULT_INSTANCE;
        public static final int MID_FIELD_NUMBER = 1;
        public static final int OTHERUSERID_FIELD_NUMBER = 2;
        private static volatile i860<MomentComment> PARSER = null;
        public static final int TICKER_FIELD_NUMBER = 3;
        private String mid_ = "";
        private String otherUserId_ = "";
        private String ticker_ = "";

        public static final class Builder extends GeneratedMessageLite.b<MomentComment, Builder> implements MomentCommentOrBuilder {
            private Builder() {
                super(MomentComment.DEFAULT_INSTANCE);
            }

            public Builder clearMid() {
                copyOnWrite();
                ((MomentComment) ((GeneratedMessageLite.b) this).instance).clearMid();
                return this;
            }

            public Builder clearOtherUserId() {
                copyOnWrite();
                ((MomentComment) ((GeneratedMessageLite.b) this).instance).clearOtherUserId();
                return this;
            }

            public Builder clearTicker() {
                copyOnWrite();
                ((MomentComment) ((GeneratedMessageLite.b) this).instance).clearTicker();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkMomentMessage.MomentCommentOrBuilder
            public String getMid() {
                return ((MomentComment) ((GeneratedMessageLite.b) this).instance).getMid();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkMomentMessage.MomentCommentOrBuilder
            public ByteString getMidBytes() {
                return ((MomentComment) ((GeneratedMessageLite.b) this).instance).getMidBytes();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkMomentMessage.MomentCommentOrBuilder
            public String getOtherUserId() {
                return ((MomentComment) ((GeneratedMessageLite.b) this).instance).getOtherUserId();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkMomentMessage.MomentCommentOrBuilder
            public ByteString getOtherUserIdBytes() {
                return ((MomentComment) ((GeneratedMessageLite.b) this).instance).getOtherUserIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkMomentMessage.MomentCommentOrBuilder
            public String getTicker() {
                return ((MomentComment) ((GeneratedMessageLite.b) this).instance).getTicker();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkMomentMessage.MomentCommentOrBuilder
            public ByteString getTickerBytes() {
                return ((MomentComment) ((GeneratedMessageLite.b) this).instance).getTickerBytes();
            }

            public Builder setMid(String str) {
                copyOnWrite();
                ((MomentComment) ((GeneratedMessageLite.b) this).instance).setMid(str);
                return this;
            }

            public Builder setMidBytes(ByteString byteString) {
                copyOnWrite();
                ((MomentComment) ((GeneratedMessageLite.b) this).instance).setMidBytes(byteString);
                return this;
            }

            public Builder setOtherUserId(String str) {
                copyOnWrite();
                ((MomentComment) ((GeneratedMessageLite.b) this).instance).setOtherUserId(str);
                return this;
            }

            public Builder setOtherUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((MomentComment) ((GeneratedMessageLite.b) this).instance).setOtherUserIdBytes(byteString);
                return this;
            }

            public Builder setTicker(String str) {
                copyOnWrite();
                ((MomentComment) ((GeneratedMessageLite.b) this).instance).setTicker(str);
                return this;
            }

            public Builder setTickerBytes(ByteString byteString) {
                copyOnWrite();
                ((MomentComment) ((GeneratedMessageLite.b) this).instance).setTickerBytes(byteString);
                return this;
            }
        }

        static {
            MomentComment momentComment = new MomentComment();
            DEFAULT_INSTANCE = momentComment;
            momentComment.makeImmutable();
        }

        private MomentComment() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMid() {
            this.mid_ = getDefaultInstance().getMid();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOtherUserId() {
            this.otherUserId_ = getDefaultInstance().getOtherUserId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTicker() {
            this.ticker_ = getDefaultInstance().getTicker();
        }

        public static MomentComment getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(MomentComment momentComment) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(momentComment);
        }

        public static MomentComment parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (MomentComment) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MomentComment parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (MomentComment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<MomentComment> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMid(String str) {
            str.getClass();
            this.mid_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMidBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.mid_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOtherUserId(String str) {
            str.getClass();
            this.otherUserId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOtherUserIdBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.otherUserId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTicker(String str) {
            str.getClass();
            this.ticker_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTickerBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.ticker_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C03171.f1635xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new MomentComment();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    MomentComment momentComment = (MomentComment) obj2;
                    this.mid_ = hVar.f(!this.mid_.isEmpty(), this.mid_, !momentComment.mid_.isEmpty(), momentComment.mid_);
                    this.otherUserId_ = hVar.f(!this.otherUserId_.isEmpty(), this.otherUserId_, !momentComment.otherUserId_.isEmpty(), momentComment.otherUserId_);
                    this.ticker_ = hVar.f(!this.ticker_.isEmpty(), this.ticker_, true ^ momentComment.ticker_.isEmpty(), momentComment.ticker_);
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
                                    this.mid_ = eVar.L();
                                } else if (iM == 18) {
                                    this.otherUserId_ = eVar.L();
                                } else if (iM == 26) {
                                    this.ticker_ = eVar.L();
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
                        synchronized (MomentComment.class) {
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

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkMomentMessage.MomentCommentOrBuilder
        public String getMid() {
            return this.mid_;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkMomentMessage.MomentCommentOrBuilder
        public ByteString getMidBytes() {
            return ByteString.copyFromUtf8(this.mid_);
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkMomentMessage.MomentCommentOrBuilder
        public String getOtherUserId() {
            return this.otherUserId_;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkMomentMessage.MomentCommentOrBuilder
        public ByteString getOtherUserIdBytes() {
            return ByteString.copyFromUtf8(this.otherUserId_);
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iK = !this.mid_.isEmpty() ? CodedOutputStream.K(1, getMid()) : 0;
            if (!this.otherUserId_.isEmpty()) {
                iK += CodedOutputStream.K(2, getOtherUserId());
            }
            if (!this.ticker_.isEmpty()) {
                iK += CodedOutputStream.K(3, getTicker());
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iK;
            return iK;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkMomentMessage.MomentCommentOrBuilder
        public String getTicker() {
            return this.ticker_;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkMomentMessage.MomentCommentOrBuilder
        public ByteString getTickerBytes() {
            return ByteString.copyFromUtf8(this.ticker_);
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.mid_.isEmpty()) {
                codedOutputStream.D0(1, getMid());
            }
            if (!this.otherUserId_.isEmpty()) {
                codedOutputStream.D0(2, getOtherUserId());
            }
            if (this.ticker_.isEmpty()) {
                return;
            }
            codedOutputStream.D0(3, getTicker());
        }

        public static MomentComment parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (MomentComment) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static MomentComment parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (MomentComment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static MomentComment parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (MomentComment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MomentComment parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (MomentComment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static MomentComment parseFrom(InputStream inputStream) throws IOException {
            return (MomentComment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MomentComment parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (MomentComment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static MomentComment parseFrom(e eVar) throws IOException {
            return (MomentComment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static MomentComment parseFrom(e eVar, h hVar) throws IOException {
            return (MomentComment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public static final class MomentLike extends GeneratedMessageLite<MomentLike, Builder> implements MomentLikeOrBuilder {
        private static final MomentLike DEFAULT_INSTANCE;
        public static final int MID_FIELD_NUMBER = 1;
        public static final int OTHERUSERID_FIELD_NUMBER = 2;
        private static volatile i860<MomentLike> PARSER;
        private String mid_ = "";
        private String otherUserId_ = "";

        public static final class Builder extends GeneratedMessageLite.b<MomentLike, Builder> implements MomentLikeOrBuilder {
            private Builder() {
                super(MomentLike.DEFAULT_INSTANCE);
            }

            public Builder clearMid() {
                copyOnWrite();
                ((MomentLike) ((GeneratedMessageLite.b) this).instance).clearMid();
                return this;
            }

            public Builder clearOtherUserId() {
                copyOnWrite();
                ((MomentLike) ((GeneratedMessageLite.b) this).instance).clearOtherUserId();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkMomentMessage.MomentLikeOrBuilder
            public String getMid() {
                return ((MomentLike) ((GeneratedMessageLite.b) this).instance).getMid();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkMomentMessage.MomentLikeOrBuilder
            public ByteString getMidBytes() {
                return ((MomentLike) ((GeneratedMessageLite.b) this).instance).getMidBytes();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkMomentMessage.MomentLikeOrBuilder
            public String getOtherUserId() {
                return ((MomentLike) ((GeneratedMessageLite.b) this).instance).getOtherUserId();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkMomentMessage.MomentLikeOrBuilder
            public ByteString getOtherUserIdBytes() {
                return ((MomentLike) ((GeneratedMessageLite.b) this).instance).getOtherUserIdBytes();
            }

            public Builder setMid(String str) {
                copyOnWrite();
                ((MomentLike) ((GeneratedMessageLite.b) this).instance).setMid(str);
                return this;
            }

            public Builder setMidBytes(ByteString byteString) {
                copyOnWrite();
                ((MomentLike) ((GeneratedMessageLite.b) this).instance).setMidBytes(byteString);
                return this;
            }

            public Builder setOtherUserId(String str) {
                copyOnWrite();
                ((MomentLike) ((GeneratedMessageLite.b) this).instance).setOtherUserId(str);
                return this;
            }

            public Builder setOtherUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((MomentLike) ((GeneratedMessageLite.b) this).instance).setOtherUserIdBytes(byteString);
                return this;
            }
        }

        static {
            MomentLike momentLike = new MomentLike();
            DEFAULT_INSTANCE = momentLike;
            momentLike.makeImmutable();
        }

        private MomentLike() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMid() {
            this.mid_ = getDefaultInstance().getMid();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOtherUserId() {
            this.otherUserId_ = getDefaultInstance().getOtherUserId();
        }

        public static MomentLike getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(MomentLike momentLike) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(momentLike);
        }

        public static MomentLike parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (MomentLike) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MomentLike parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (MomentLike) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<MomentLike> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMid(String str) {
            str.getClass();
            this.mid_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMidBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.mid_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOtherUserId(String str) {
            str.getClass();
            this.otherUserId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOtherUserIdBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.otherUserId_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C03171.f1635xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new MomentLike();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    MomentLike momentLike = (MomentLike) obj2;
                    this.mid_ = hVar.f(!this.mid_.isEmpty(), this.mid_, !momentLike.mid_.isEmpty(), momentLike.mid_);
                    this.otherUserId_ = hVar.f(!this.otherUserId_.isEmpty(), this.otherUserId_, true ^ momentLike.otherUserId_.isEmpty(), momentLike.otherUserId_);
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
                                    this.mid_ = eVar.L();
                                } else if (iM == 18) {
                                    this.otherUserId_ = eVar.L();
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
                        synchronized (MomentLike.class) {
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

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkMomentMessage.MomentLikeOrBuilder
        public String getMid() {
            return this.mid_;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkMomentMessage.MomentLikeOrBuilder
        public ByteString getMidBytes() {
            return ByteString.copyFromUtf8(this.mid_);
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkMomentMessage.MomentLikeOrBuilder
        public String getOtherUserId() {
            return this.otherUserId_;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkMomentMessage.MomentLikeOrBuilder
        public ByteString getOtherUserIdBytes() {
            return ByteString.copyFromUtf8(this.otherUserId_);
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iK = !this.mid_.isEmpty() ? CodedOutputStream.K(1, getMid()) : 0;
            if (!this.otherUserId_.isEmpty()) {
                iK += CodedOutputStream.K(2, getOtherUserId());
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iK;
            return iK;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.mid_.isEmpty()) {
                codedOutputStream.D0(1, getMid());
            }
            if (this.otherUserId_.isEmpty()) {
                return;
            }
            codedOutputStream.D0(2, getOtherUserId());
        }

        public static MomentLike parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (MomentLike) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static MomentLike parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (MomentLike) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static MomentLike parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (MomentLike) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MomentLike parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (MomentLike) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static MomentLike parseFrom(InputStream inputStream) throws IOException {
            return (MomentLike) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MomentLike parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (MomentLike) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static MomentLike parseFrom(e eVar) throws IOException {
            return (MomentLike) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static MomentLike parseFrom(e eVar, h hVar) throws IOException {
            return (MomentLike) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }
}
