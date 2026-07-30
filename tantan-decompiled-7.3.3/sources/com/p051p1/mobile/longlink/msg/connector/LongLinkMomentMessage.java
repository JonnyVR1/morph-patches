package com.p051p1.mobile.longlink.msg.connector;

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
public final class LongLinkMomentMessage {

    /* JADX INFO: renamed from: com.p1.mobile.longlink.msg.connector.LongLinkMomentMessage$1 */
    public static /* synthetic */ class C45561 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16655xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f16655xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16655xa1df5c61[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16655xa1df5c61[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16655xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16655xa1df5c61[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16655xa1df5c61[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16655xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f16655xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public interface MomentCancelLikeOrBuilder extends lfz {
        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        String getMid();

        ByteString getMidBytes();

        String getOtherUserId();

        ByteString getOtherUserIdBytes();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface MomentCommentOrBuilder extends lfz {
        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        String getMid();

        ByteString getMidBytes();

        String getOtherUserId();

        ByteString getOtherUserIdBytes();

        String getTicker();

        ByteString getTickerBytes();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface MomentLikeOrBuilder extends lfz {
        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        String getMid();

        ByteString getMidBytes();

        String getOtherUserId();

        ByteString getOtherUserIdBytes();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    private LongLinkMomentMessage() {
    }

    public static void registerAllExtensions(C3433h c3433h) {
    }

    public static final class MomentCancelLike extends GeneratedMessageLite<MomentCancelLike, Builder> implements MomentCancelLikeOrBuilder {
        private static final MomentCancelLike DEFAULT_INSTANCE;
        public static final int MID_FIELD_NUMBER = 1;
        public static final int OTHERUSERID_FIELD_NUMBER = 2;
        private static volatile ng60<MomentCancelLike> PARSER;
        private String mid_ = "";
        private String otherUserId_ = "";

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<MomentCancelLike, Builder> implements MomentCancelLikeOrBuilder {
            private Builder() {
                super(MomentCancelLike.DEFAULT_INSTANCE);
            }

            public Builder clearMid() {
                copyOnWrite();
                ((MomentCancelLike) this.instance).clearMid();
                return this;
            }

            public Builder clearOtherUserId() {
                copyOnWrite();
                ((MomentCancelLike) this.instance).clearOtherUserId();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkMomentMessage.MomentCancelLikeOrBuilder
            public String getMid() {
                return ((MomentCancelLike) this.instance).getMid();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkMomentMessage.MomentCancelLikeOrBuilder
            public ByteString getMidBytes() {
                return ((MomentCancelLike) this.instance).getMidBytes();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkMomentMessage.MomentCancelLikeOrBuilder
            public String getOtherUserId() {
                return ((MomentCancelLike) this.instance).getOtherUserId();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkMomentMessage.MomentCancelLikeOrBuilder
            public ByteString getOtherUserIdBytes() {
                return ((MomentCancelLike) this.instance).getOtherUserIdBytes();
            }

            public Builder setMid(String str) {
                copyOnWrite();
                ((MomentCancelLike) this.instance).setMid(str);
                return this;
            }

            public Builder setMidBytes(ByteString byteString) {
                copyOnWrite();
                ((MomentCancelLike) this.instance).setMidBytes(byteString);
                return this;
            }

            public Builder setOtherUserId(String str) {
                copyOnWrite();
                ((MomentCancelLike) this.instance).setOtherUserId(str);
                return this;
            }

            public Builder setOtherUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((MomentCancelLike) this.instance).setOtherUserIdBytes(byteString);
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
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(momentCancelLike);
        }

        public static MomentCancelLike parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (MomentCancelLike) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MomentCancelLike parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (MomentCancelLike) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<MomentCancelLike> parser() {
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.otherUserId_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C45561.f16655xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new MomentCancelLike();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    MomentCancelLike momentCancelLike = (MomentCancelLike) obj2;
                    this.mid_ = interfaceC3409h.mo17052f(!this.mid_.isEmpty(), this.mid_, !momentCancelLike.mid_.isEmpty(), momentCancelLike.mid_);
                    this.otherUserId_ = interfaceC3409h.mo17052f(!this.otherUserId_.isEmpty(), this.otherUserId_, true ^ momentCancelLike.otherUserId_.isEmpty(), momentCancelLike.otherUserId_);
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
                                    this.mid_ = c3430e.m17170L();
                                } else if (iM17171M == 18) {
                                    this.otherUserId_ = c3430e.m17170L();
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
                        synchronized (MomentCancelLike.class) {
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

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16956K = !this.mid_.isEmpty() ? CodedOutputStream.m16956K(1, getMid()) : 0;
            if (!this.otherUserId_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(2, getOtherUserId());
            }
            this.memoizedSerializedSize = iM16956K;
            return iM16956K;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.mid_.isEmpty()) {
                codedOutputStream.mo16994D0(1, getMid());
            }
            if (this.otherUserId_.isEmpty()) {
                return;
            }
            codedOutputStream.mo16994D0(2, getOtherUserId());
        }

        public static MomentCancelLike parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (MomentCancelLike) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static MomentCancelLike parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (MomentCancelLike) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        public static MomentCancelLike parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (MomentCancelLike) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MomentCancelLike parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (MomentCancelLike) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static MomentCancelLike parseFrom(InputStream inputStream) throws IOException {
            return (MomentCancelLike) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MomentCancelLike parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (MomentCancelLike) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static MomentCancelLike parseFrom(C3430e c3430e) throws IOException {
            return (MomentCancelLike) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static MomentCancelLike parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (MomentCancelLike) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }

    public static final class MomentComment extends GeneratedMessageLite<MomentComment, Builder> implements MomentCommentOrBuilder {
        private static final MomentComment DEFAULT_INSTANCE;
        public static final int MID_FIELD_NUMBER = 1;
        public static final int OTHERUSERID_FIELD_NUMBER = 2;
        private static volatile ng60<MomentComment> PARSER = null;
        public static final int TICKER_FIELD_NUMBER = 3;
        private String mid_ = "";
        private String otherUserId_ = "";
        private String ticker_ = "";

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<MomentComment, Builder> implements MomentCommentOrBuilder {
            private Builder() {
                super(MomentComment.DEFAULT_INSTANCE);
            }

            public Builder clearMid() {
                copyOnWrite();
                ((MomentComment) this.instance).clearMid();
                return this;
            }

            public Builder clearOtherUserId() {
                copyOnWrite();
                ((MomentComment) this.instance).clearOtherUserId();
                return this;
            }

            public Builder clearTicker() {
                copyOnWrite();
                ((MomentComment) this.instance).clearTicker();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkMomentMessage.MomentCommentOrBuilder
            public String getMid() {
                return ((MomentComment) this.instance).getMid();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkMomentMessage.MomentCommentOrBuilder
            public ByteString getMidBytes() {
                return ((MomentComment) this.instance).getMidBytes();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkMomentMessage.MomentCommentOrBuilder
            public String getOtherUserId() {
                return ((MomentComment) this.instance).getOtherUserId();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkMomentMessage.MomentCommentOrBuilder
            public ByteString getOtherUserIdBytes() {
                return ((MomentComment) this.instance).getOtherUserIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkMomentMessage.MomentCommentOrBuilder
            public String getTicker() {
                return ((MomentComment) this.instance).getTicker();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkMomentMessage.MomentCommentOrBuilder
            public ByteString getTickerBytes() {
                return ((MomentComment) this.instance).getTickerBytes();
            }

            public Builder setMid(String str) {
                copyOnWrite();
                ((MomentComment) this.instance).setMid(str);
                return this;
            }

            public Builder setMidBytes(ByteString byteString) {
                copyOnWrite();
                ((MomentComment) this.instance).setMidBytes(byteString);
                return this;
            }

            public Builder setOtherUserId(String str) {
                copyOnWrite();
                ((MomentComment) this.instance).setOtherUserId(str);
                return this;
            }

            public Builder setOtherUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((MomentComment) this.instance).setOtherUserIdBytes(byteString);
                return this;
            }

            public Builder setTicker(String str) {
                copyOnWrite();
                ((MomentComment) this.instance).setTicker(str);
                return this;
            }

            public Builder setTickerBytes(ByteString byteString) {
                copyOnWrite();
                ((MomentComment) this.instance).setTickerBytes(byteString);
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
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(momentComment);
        }

        public static MomentComment parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (MomentComment) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MomentComment parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (MomentComment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<MomentComment> parser() {
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.ticker_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C45561.f16655xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new MomentComment();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    MomentComment momentComment = (MomentComment) obj2;
                    this.mid_ = interfaceC3409h.mo17052f(!this.mid_.isEmpty(), this.mid_, !momentComment.mid_.isEmpty(), momentComment.mid_);
                    this.otherUserId_ = interfaceC3409h.mo17052f(!this.otherUserId_.isEmpty(), this.otherUserId_, !momentComment.otherUserId_.isEmpty(), momentComment.otherUserId_);
                    this.ticker_ = interfaceC3409h.mo17052f(!this.ticker_.isEmpty(), this.ticker_, true ^ momentComment.ticker_.isEmpty(), momentComment.ticker_);
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
                                    this.mid_ = c3430e.m17170L();
                                } else if (iM17171M == 18) {
                                    this.otherUserId_ = c3430e.m17170L();
                                } else if (iM17171M == 26) {
                                    this.ticker_ = c3430e.m17170L();
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
                        synchronized (MomentComment.class) {
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

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16956K = !this.mid_.isEmpty() ? CodedOutputStream.m16956K(1, getMid()) : 0;
            if (!this.otherUserId_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(2, getOtherUserId());
            }
            if (!this.ticker_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(3, getTicker());
            }
            this.memoizedSerializedSize = iM16956K;
            return iM16956K;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkMomentMessage.MomentCommentOrBuilder
        public String getTicker() {
            return this.ticker_;
        }

        @Override // com.p1.mobile.longlink.msg.connector.LongLinkMomentMessage.MomentCommentOrBuilder
        public ByteString getTickerBytes() {
            return ByteString.copyFromUtf8(this.ticker_);
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.mid_.isEmpty()) {
                codedOutputStream.mo16994D0(1, getMid());
            }
            if (!this.otherUserId_.isEmpty()) {
                codedOutputStream.mo16994D0(2, getOtherUserId());
            }
            if (this.ticker_.isEmpty()) {
                return;
            }
            codedOutputStream.mo16994D0(3, getTicker());
        }

        public static MomentComment parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (MomentComment) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static MomentComment parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (MomentComment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        public static MomentComment parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (MomentComment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MomentComment parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (MomentComment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static MomentComment parseFrom(InputStream inputStream) throws IOException {
            return (MomentComment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MomentComment parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (MomentComment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static MomentComment parseFrom(C3430e c3430e) throws IOException {
            return (MomentComment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static MomentComment parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (MomentComment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }

    public static final class MomentLike extends GeneratedMessageLite<MomentLike, Builder> implements MomentLikeOrBuilder {
        private static final MomentLike DEFAULT_INSTANCE;
        public static final int MID_FIELD_NUMBER = 1;
        public static final int OTHERUSERID_FIELD_NUMBER = 2;
        private static volatile ng60<MomentLike> PARSER;
        private String mid_ = "";
        private String otherUserId_ = "";

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<MomentLike, Builder> implements MomentLikeOrBuilder {
            private Builder() {
                super(MomentLike.DEFAULT_INSTANCE);
            }

            public Builder clearMid() {
                copyOnWrite();
                ((MomentLike) this.instance).clearMid();
                return this;
            }

            public Builder clearOtherUserId() {
                copyOnWrite();
                ((MomentLike) this.instance).clearOtherUserId();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkMomentMessage.MomentLikeOrBuilder
            public String getMid() {
                return ((MomentLike) this.instance).getMid();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkMomentMessage.MomentLikeOrBuilder
            public ByteString getMidBytes() {
                return ((MomentLike) this.instance).getMidBytes();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkMomentMessage.MomentLikeOrBuilder
            public String getOtherUserId() {
                return ((MomentLike) this.instance).getOtherUserId();
            }

            @Override // com.p1.mobile.longlink.msg.connector.LongLinkMomentMessage.MomentLikeOrBuilder
            public ByteString getOtherUserIdBytes() {
                return ((MomentLike) this.instance).getOtherUserIdBytes();
            }

            public Builder setMid(String str) {
                copyOnWrite();
                ((MomentLike) this.instance).setMid(str);
                return this;
            }

            public Builder setMidBytes(ByteString byteString) {
                copyOnWrite();
                ((MomentLike) this.instance).setMidBytes(byteString);
                return this;
            }

            public Builder setOtherUserId(String str) {
                copyOnWrite();
                ((MomentLike) this.instance).setOtherUserId(str);
                return this;
            }

            public Builder setOtherUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((MomentLike) this.instance).setOtherUserIdBytes(byteString);
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
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(momentLike);
        }

        public static MomentLike parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (MomentLike) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MomentLike parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (MomentLike) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<MomentLike> parser() {
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
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
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.otherUserId_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C45561.f16655xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new MomentLike();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    MomentLike momentLike = (MomentLike) obj2;
                    this.mid_ = interfaceC3409h.mo17052f(!this.mid_.isEmpty(), this.mid_, !momentLike.mid_.isEmpty(), momentLike.mid_);
                    this.otherUserId_ = interfaceC3409h.mo17052f(!this.otherUserId_.isEmpty(), this.otherUserId_, true ^ momentLike.otherUserId_.isEmpty(), momentLike.otherUserId_);
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
                                    this.mid_ = c3430e.m17170L();
                                } else if (iM17171M == 18) {
                                    this.otherUserId_ = c3430e.m17170L();
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
                        synchronized (MomentLike.class) {
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

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16956K = !this.mid_.isEmpty() ? CodedOutputStream.m16956K(1, getMid()) : 0;
            if (!this.otherUserId_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(2, getOtherUserId());
            }
            this.memoizedSerializedSize = iM16956K;
            return iM16956K;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.mid_.isEmpty()) {
                codedOutputStream.mo16994D0(1, getMid());
            }
            if (this.otherUserId_.isEmpty()) {
                return;
            }
            codedOutputStream.mo16994D0(2, getOtherUserId());
        }

        public static MomentLike parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (MomentLike) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static MomentLike parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (MomentLike) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        public static MomentLike parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (MomentLike) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MomentLike parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (MomentLike) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static MomentLike parseFrom(InputStream inputStream) throws IOException {
            return (MomentLike) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MomentLike parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (MomentLike) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static MomentLike parseFrom(C3430e c3430e) throws IOException {
            return (MomentLike) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static MomentLike parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (MomentLike) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }
}
