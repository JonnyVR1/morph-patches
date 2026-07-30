package com.p003p1.mobile.longlink.msg.livedistribution;

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
public final class LongLinkReportMsg {

    /* JADX INFO: renamed from: com.p1.mobile.longlink.msg.livedistribution.LongLinkReportMsg$1 */
    public static /* synthetic */ class C03581 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f1656xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f1656xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1656xa1df5c61[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1656xa1df5c61[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1656xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1656xa1df5c61[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1656xa1df5c61[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1656xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f1656xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public interface LiveReportMsgOrBuilder extends o6z {
        String getData();

        ByteString getDataBytes();

        /* synthetic */ q getDefaultInstanceForType();

        long getDelaySeconds();

        String getReportType();

        ByteString getReportTypeBytes();

        /* synthetic */ boolean isInitialized();
    }

    private LongLinkReportMsg() {
    }

    public static void registerAllExtensions(h hVar) {
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

        public static final class Builder extends GeneratedMessageLite.b<LiveReportMsg, Builder> implements LiveReportMsgOrBuilder {
            private Builder() {
                super(LiveReportMsg.DEFAULT_INSTANCE);
            }

            public Builder clearData() {
                copyOnWrite();
                ((LiveReportMsg) ((GeneratedMessageLite.b) this).instance).clearData();
                return this;
            }

            public Builder clearDelaySeconds() {
                copyOnWrite();
                ((LiveReportMsg) ((GeneratedMessageLite.b) this).instance).clearDelaySeconds();
                return this;
            }

            public Builder clearReportType() {
                copyOnWrite();
                ((LiveReportMsg) ((GeneratedMessageLite.b) this).instance).clearReportType();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.livedistribution.LongLinkReportMsg.LiveReportMsgOrBuilder
            public String getData() {
                return ((LiveReportMsg) ((GeneratedMessageLite.b) this).instance).getData();
            }

            @Override // com.p1.mobile.longlink.msg.livedistribution.LongLinkReportMsg.LiveReportMsgOrBuilder
            public ByteString getDataBytes() {
                return ((LiveReportMsg) ((GeneratedMessageLite.b) this).instance).getDataBytes();
            }

            @Override // com.p1.mobile.longlink.msg.livedistribution.LongLinkReportMsg.LiveReportMsgOrBuilder
            public long getDelaySeconds() {
                return ((LiveReportMsg) ((GeneratedMessageLite.b) this).instance).getDelaySeconds();
            }

            @Override // com.p1.mobile.longlink.msg.livedistribution.LongLinkReportMsg.LiveReportMsgOrBuilder
            public String getReportType() {
                return ((LiveReportMsg) ((GeneratedMessageLite.b) this).instance).getReportType();
            }

            @Override // com.p1.mobile.longlink.msg.livedistribution.LongLinkReportMsg.LiveReportMsgOrBuilder
            public ByteString getReportTypeBytes() {
                return ((LiveReportMsg) ((GeneratedMessageLite.b) this).instance).getReportTypeBytes();
            }

            public Builder setData(String str) {
                copyOnWrite();
                ((LiveReportMsg) ((GeneratedMessageLite.b) this).instance).setData(str);
                return this;
            }

            public Builder setDataBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveReportMsg) ((GeneratedMessageLite.b) this).instance).setDataBytes(byteString);
                return this;
            }

            public Builder setDelaySeconds(long j) {
                copyOnWrite();
                ((LiveReportMsg) ((GeneratedMessageLite.b) this).instance).setDelaySeconds(j);
                return this;
            }

            public Builder setReportType(String str) {
                copyOnWrite();
                ((LiveReportMsg) ((GeneratedMessageLite.b) this).instance).setReportType(str);
                return this;
            }

            public Builder setReportTypeBytes(ByteString byteString) {
                copyOnWrite();
                ((LiveReportMsg) ((GeneratedMessageLite.b) this).instance).setReportTypeBytes(byteString);
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
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(liveReportMsg);
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
            a.checkByteStringIsUtf8(byteString);
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
            a.checkByteStringIsUtf8(byteString);
            this.reportType_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C03581.f1656xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new LiveReportMsg();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    LiveReportMsg liveReportMsg = (LiveReportMsg) obj2;
                    this.reportType_ = hVar.f(!this.reportType_.isEmpty(), this.reportType_, !liveReportMsg.reportType_.isEmpty(), liveReportMsg.reportType_);
                    long j = this.delaySeconds_;
                    boolean z2 = j != 0;
                    long j2 = liveReportMsg.delaySeconds_;
                    this.delaySeconds_ = hVar.i(z2, j, j2 != 0, j2);
                    this.data_ = hVar.f(!this.data_.isEmpty(), this.data_, !liveReportMsg.data_.isEmpty(), liveReportMsg.data_);
                    GeneratedMessageLite.g gVar = GeneratedMessageLite.g.INSTANCE;
                    return this;
                case 6:
                    e eVar = (e) obj;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            if (iM != 0) {
                                if (iM == 10) {
                                    this.reportType_ = eVar.L();
                                } else if (iM == 16) {
                                    this.delaySeconds_ = eVar.v();
                                } else if (iM == 26) {
                                    this.data_ = eVar.L();
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
                        synchronized (LiveReportMsg.class) {
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

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iK = !this.reportType_.isEmpty() ? CodedOutputStream.K(1, getReportType()) : 0;
            long j = this.delaySeconds_;
            if (j != 0) {
                iK += CodedOutputStream.v(2, j);
            }
            if (!this.data_.isEmpty()) {
                iK += CodedOutputStream.K(3, getData());
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iK;
            return iK;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.reportType_.isEmpty()) {
                codedOutputStream.D0(1, getReportType());
            }
            long j = this.delaySeconds_;
            if (j != 0) {
                codedOutputStream.u0(2, j);
            }
            if (this.data_.isEmpty()) {
                return;
            }
            codedOutputStream.D0(3, getData());
        }

        public static LiveReportMsg parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (LiveReportMsg) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static LiveReportMsg parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (LiveReportMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static LiveReportMsg parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (LiveReportMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static LiveReportMsg parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (LiveReportMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static LiveReportMsg parseFrom(InputStream inputStream) throws IOException {
            return (LiveReportMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LiveReportMsg parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (LiveReportMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static LiveReportMsg parseFrom(e eVar) throws IOException {
            return (LiveReportMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static LiveReportMsg parseFrom(e eVar, h hVar) throws IOException {
            return (LiveReportMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }
}
