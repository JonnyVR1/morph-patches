package com.p046p1.mobile.longlink.msg.livedistribution;

import com.google.protobuf.AbstractC3403a;
import com.google.protobuf.ByteString;
import com.google.protobuf.C3407e;
import com.google.protobuf.C3410h;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InterfaceC3419q;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.io.InputStream;
import p149l.aag0;
import p149l.bz00;
import p149l.i860;
import p149l.o6z;

/* JADX INFO: loaded from: classes8.dex */
public final class LongLinkReportMsg {

    /* JADX INFO: renamed from: com.p1.mobile.longlink.msg.livedistribution.LongLinkReportMsg$1 */
    public static /* synthetic */ class C44461 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f15957xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15957xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15957xa1df5c61[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15957xa1df5c61[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15957xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15957xa1df5c61[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15957xa1df5c61[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15957xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f15957xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public interface LiveReportMsgOrBuilder extends o6z {
        String getData();

        ByteString getDataBytes();

        @Override // p149l.o6z
        /* synthetic */ InterfaceC3419q getDefaultInstanceForType();

        long getDelaySeconds();

        String getReportType();

        ByteString getReportTypeBytes();

        @Override // p149l.o6z
        /* synthetic */ boolean isInitialized();
    }

    private LongLinkReportMsg() {
    }

    public static void registerAllExtensions(C3410h c3410h) {
    }

    public static final class LiveReportMsg extends GeneratedMessageLite<LiveReportMsg, Builder> implements LiveReportMsgOrBuilder {
        public static final int DATA_FIELD_NUMBER = 3;
        private static final LiveReportMsg DEFAULT_INSTANCE;
        public static final int DELAYSECONDS_FIELD_NUMBER = 2;
        private static volatile i860<LiveReportMsg> PARSER = null;
        public static final int REPORTTYPE_FIELD_NUMBER = 1;
        private long delaySeconds_;
        private String reportType_ = "";
        private String data_ = "";

        public static final class Builder extends GeneratedMessageLite.AbstractC3380b<LiveReportMsg, Builder> implements LiveReportMsgOrBuilder {
            private Builder() {
                super(LiveReportMsg.DEFAULT_INSTANCE);
            }

            public Builder clearData() {
                copyOnWrite();
                ((LiveReportMsg) this.instance).clearData();
                return this;
            }

            public Builder clearDelaySeconds() {
                copyOnWrite();
                ((LiveReportMsg) this.instance).clearDelaySeconds();
                return this;
            }

            public Builder clearReportType() {
                copyOnWrite();
                ((LiveReportMsg) this.instance).clearReportType();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.livedistribution.LongLinkReportMsg.LiveReportMsgOrBuilder
            public String getData() {
                return ((LiveReportMsg) this.instance).getData();
            }

            @Override // com.p1.mobile.longlink.msg.livedistribution.LongLinkReportMsg.LiveReportMsgOrBuilder
            public ByteString getDataBytes() {
                return ((LiveReportMsg) this.instance).getDataBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livedistribution.LongLinkReportMsg.LiveReportMsgOrBuilder
            public long getDelaySeconds() {
                return ((LiveReportMsg) this.instance).getDelaySeconds();
            }

            @Override // com.p1.mobile.longlink.msg.livedistribution.LongLinkReportMsg.LiveReportMsgOrBuilder
            public String getReportType() {
                return ((LiveReportMsg) this.instance).getReportType();
            }

            @Override // com.p1.mobile.longlink.msg.livedistribution.LongLinkReportMsg.LiveReportMsgOrBuilder
            public ByteString getReportTypeBytes() {
                return ((LiveReportMsg) this.instance).getReportTypeBytes();
            }

            public Builder setData(String str) {
                copyOnWrite();
                ((LiveReportMsg) this.instance).setData(str);
                return this;
            }

            public Builder setDataBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveReportMsg) this.instance).setDataBytes(byteString);
                return this;
            }

            public Builder setDelaySeconds(long j) {
                copyOnWrite();
                ((LiveReportMsg) this.instance).setDelaySeconds(j);
                return this;
            }

            public Builder setReportType(String str) {
                copyOnWrite();
                ((LiveReportMsg) this.instance).setReportType(str);
                return this;
            }

            public Builder setReportTypeBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveReportMsg) this.instance).setReportTypeBytes(byteString);
                return this;
            }
        }

        static {
            LiveReportMsg liveReportMsg = new LiveReportMsg();
            DEFAULT_INSTANCE = liveReportMsg;
            liveReportMsg.makeImmutable();
        }

        private LiveReportMsg() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearData() {
            this.data_ = getDefaultInstance().getData();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDelaySeconds() {
            this.delaySeconds_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearReportType() {
            this.reportType_ = getDefaultInstance().getReportType();
        }

        public static LiveReportMsg getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(LiveReportMsg liveReportMsg) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(liveReportMsg);
        }

        public static LiveReportMsg parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (LiveReportMsg) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LiveReportMsg parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (LiveReportMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<LiveReportMsg> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setData(String str) {
            str.getClass();
            this.data_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDataBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.data_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDelaySeconds(long j) {
            this.delaySeconds_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setReportType(String str) {
            str.getClass();
            this.reportType_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setReportTypeBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3403a.checkByteStringIsUtf8(byteString);
            this.reportType_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C44461.f15957xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new LiveReportMsg();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3386h interfaceC3386h = (GeneratedMessageLite.InterfaceC3386h) obj;
                    LiveReportMsg liveReportMsg = (LiveReportMsg) obj2;
                    this.reportType_ = interfaceC3386h.mo16997f(!this.reportType_.isEmpty(), this.reportType_, !liveReportMsg.reportType_.isEmpty(), liveReportMsg.reportType_);
                    long j = this.delaySeconds_;
                    boolean z2 = j != 0;
                    long j2 = liveReportMsg.delaySeconds_;
                    this.delaySeconds_ = interfaceC3386h.mo17000i(z2, j, j2 != 0, j2);
                    this.data_ = interfaceC3386h.mo16997f(!this.data_.isEmpty(), this.data_, !liveReportMsg.data_.isEmpty(), liveReportMsg.data_);
                    GeneratedMessageLite.C3385g c3385g = GeneratedMessageLite.C3385g.INSTANCE;
                    return this;
                case 6:
                    C3407e c3407e = (C3407e) obj;
                    while (!z) {
                        try {
                            int iM17116M = c3407e.m17116M();
                            if (iM17116M != 0) {
                                if (iM17116M == 10) {
                                    this.reportType_ = c3407e.m17115L();
                                } else if (iM17116M == 16) {
                                    this.delaySeconds_ = c3407e.m17142v();
                                } else if (iM17116M == 26) {
                                    this.data_ = c3407e.m17115L();
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
                        synchronized (LiveReportMsg.class) {
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

        @Override // com.p1.mobile.longlink.msg.livedistribution.LongLinkReportMsg.LiveReportMsgOrBuilder
        public String getData() {
            return this.data_;
        }

        @Override // com.p1.mobile.longlink.msg.livedistribution.LongLinkReportMsg.LiveReportMsgOrBuilder
        public ByteString getDataBytes() {
            return ByteString.copyFromUtf8(this.data_);
        }

        @Override // com.p1.mobile.longlink.msg.livedistribution.LongLinkReportMsg.LiveReportMsgOrBuilder
        public long getDelaySeconds() {
            return this.delaySeconds_;
        }

        @Override // com.p1.mobile.longlink.msg.livedistribution.LongLinkReportMsg.LiveReportMsgOrBuilder
        public String getReportType() {
            return this.reportType_;
        }

        @Override // com.p1.mobile.longlink.msg.livedistribution.LongLinkReportMsg.LiveReportMsgOrBuilder
        public ByteString getReportTypeBytes() {
            return ByteString.copyFromUtf8(this.reportType_);
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16901K = !this.reportType_.isEmpty() ? CodedOutputStream.m16901K(1, getReportType()) : 0;
            long j = this.delaySeconds_;
            if (j != 0) {
                iM16901K += CodedOutputStream.m16931v(2, j);
            }
            if (!this.data_.isEmpty()) {
                iM16901K += CodedOutputStream.m16901K(3, getData());
            }
            this.memoizedSerializedSize = iM16901K;
            return iM16901K;
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.reportType_.isEmpty()) {
                codedOutputStream.mo16939D0(1, getReportType());
            }
            long j = this.delaySeconds_;
            if (j != 0) {
                codedOutputStream.m16972u0(2, j);
            }
            if (this.data_.isEmpty()) {
                return;
            }
            codedOutputStream.mo16939D0(3, getData());
        }

        public static LiveReportMsg parseDelimitedFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (LiveReportMsg) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static LiveReportMsg parseFrom(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
            return (LiveReportMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3410h);
        }

        public static LiveReportMsg parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (LiveReportMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static LiveReportMsg parseFrom(byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
            return (LiveReportMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3410h);
        }

        public static LiveReportMsg parseFrom(InputStream inputStream) throws IOException {
            return (LiveReportMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LiveReportMsg parseFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            return (LiveReportMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3410h);
        }

        public static LiveReportMsg parseFrom(C3407e c3407e) throws IOException {
            return (LiveReportMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static LiveReportMsg parseFrom(C3407e c3407e, C3410h c3410h) throws IOException {
            return (LiveReportMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3407e, c3410h);
        }
    }
}
